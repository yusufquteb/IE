package com.my.iengineer1.domain.engine.concrete

import kotlin.math.ceil

object ConcreteSlabEngine {

    enum class SlabType { SOLID, ON_GIRDERS, HOLLOW }

    data class Input(
        val length: Double,           // m
        val width: Double,            // m
        val thickness: Double,        // m
        val slabType: SlabType = SlabType.SOLID,
        val quantity: Int = 1,
        // Reinforcement (bottom mesh)
        val bottomBarDiam: Int = 12,  // mm
        val bottomBarSpacing: Double = 200.0, // mm (each way)
        // Top reinforcement over supports
        val topBarDiam: Int = 12,
        val topBarSpacing: Double = 200.0,
        val topBarZoneRatio: Double = 0.25,   // 25% of span at supports
        val concreteCover: Double = 20.0,     // mm
        val wastePercent: Double = 5.0,
        val concreteUnitCost: Double = 0.0,
        val steelUnitCost: Double = 0.0
    )

    data class Result(
        val slabArea: Double,                    // m²
        val concreteVolumeNet: Double,           // m³
        val concreteVolumeTotal: Double,
        val concreteVolumeWithWaste: Double,
        // Bottom mesh
        val bottomBarsLongCount: Int,
        val bottomBarsTransCount: Int,
        val bottomMeshWeight: Double,            // kg
        // Top reinforcement
        val topBarsWeight: Double,               // kg
        val totalSteelWeight: Double,            // kg
        val totalSteelTons: Double,
        val steelRatioKgPerM3: Double,           // kg/m³ (typical 80–120)
        // Costs
        val concreteCost: Double,
        val steelCost: Double,
        val totalCost: Double
    )

    fun calculate(input: Input): Result = with(input) {
        val area = length * width
        val volNet = area * thickness
        val volTotal = volNet * quantity
        val volWaste = volTotal * (1 + wastePercent / 100.0)

        // Weight per meter for given bar
        fun wt(d: Int) = d * d / 162.0

        // Bottom bars – long direction
        val nLongBars = ceil(width * 1000.0 / bottomBarSpacing).toInt() + 1
        val nTransBars = ceil(length * 1000.0 / bottomBarSpacing).toInt() + 1
        val botWt = (nLongBars * length + nTransBars * width) * wt(bottomBarDiam) * quantity

        // Top bars at supports (both directions)
        val topZoneLen = length * topBarZoneRatio * 2  // both ends
        val topZoneWid = width * topBarZoneRatio * 2
        val nTopLong = ceil(width * 1000.0 / topBarSpacing).toInt() + 1
        val nTopTrans = ceil(length * 1000.0 / topBarSpacing).toInt() + 1
        val topWt = (nTopLong * topZoneLen + nTopTrans * topZoneWid) * wt(topBarDiam) * quantity

        val totalSteel = botWt + topWt
        val steelRatio = if (volTotal > 0) totalSteel / volTotal else 0.0
        val concCost = volTotal * concreteUnitCost
        val steelCostVal = totalSteel * steelUnitCost

        Result(
            slabArea = area * quantity,
            concreteVolumeNet = volNet,
            concreteVolumeTotal = volTotal,
            concreteVolumeWithWaste = volWaste,
            bottomBarsLongCount = nLongBars,
            bottomBarsTransCount = nTransBars,
            bottomMeshWeight = botWt,
            topBarsWeight = topWt,
            totalSteelWeight = totalSteel,
            totalSteelTons = totalSteel / 1000.0,
            steelRatioKgPerM3 = steelRatio,
            concreteCost = concCost,
            steelCost = steelCostVal,
            totalCost = concCost + steelCostVal
        )
    }
}
