package com.my.iengineer1.domain.engine.concrete

import kotlin.math.ceil

object RCBeamEngine {

    data class Input(
        val span: Double,              // m (beam clear span)
        val width: Double,             // m (bw)
        val totalDepth: Double,        // m (h)
        val quantity: Int = 1,
        val mainTopBarDiam: Int = 16,  // mm
        val mainTopBarCount: Int = 2,
        val mainBottomBarDiam: Int = 20, // mm
        val mainBottomBarCount: Int = 3,
        val stirrupDiam: Int = 8,      // mm
        val stirrupSpacing: Double = 150.0, // mm
        val concreteCover: Double = 25.0,   // mm
        val wastePercent: Double = 5.0,
        val concreteUnitCost: Double = 0.0,
        val steelUnitCost: Double = 0.0
    )

    data class Result(
        val concreteVolumeNet: Double,
        val concreteVolumeTotal: Double,
        val concreteVolumeWithWaste: Double,
        val topSteelWeight: Double,      // kg
        val bottomSteelWeight: Double,   // kg
        val stirrupWeight: Double,       // kg
        val totalSteelWeight: Double,    // kg
        val totalSteelTons: Double,
        val stirrupCount: Int,
        val stirrupPerimeter: Double,    // m
        val concreteCostNet: Double,
        val steelCost: Double,
        val totalCost: Double
    )

    fun calculate(input: Input): Result = with(input) {
        val volPerBeam = span * width * totalDepth
        val volTotal = volPerBeam * quantity
        val volWithWaste = volTotal * (1 + wastePercent / 100.0)

        val lapLength = 0.40  // m typical lap splice
        val barLength = span + 2 * lapLength

        fun steelWeight(diam: Int, count: Int): Double =
            diam * diam / 162.0 * barLength * count

        val topWt = steelWeight(mainTopBarDiam, mainTopBarCount) * quantity
        val botWt = steelWeight(mainBottomBarDiam, mainBottomBarCount) * quantity

        // Stirrups
        val cageWidth = (width * 1000 - 2 * concreteCover) / 1000.0
        val cageDepth = (totalDepth * 1000 - 2 * concreteCover) / 1000.0
        val stirrupPerim = 2 * (cageWidth + cageDepth) + 0.20  // hook allowance
        val nStirrups = (ceil(span * 1000.0 / stirrupSpacing).toInt() + 1)
        val stirrupWt = stirrupDiam * stirrupDiam / 162.0 * stirrupPerim * nStirrups * quantity

        val totalSteel = topWt + botWt + stirrupWt
        val concCostNet = volTotal * concreteUnitCost
        val steelCost = totalSteel * steelUnitCost

        Result(
            concreteVolumeNet = volPerBeam,
            concreteVolumeTotal = volTotal,
            concreteVolumeWithWaste = volWithWaste,
            topSteelWeight = topWt,
            bottomSteelWeight = botWt,
            stirrupWeight = stirrupWt,
            totalSteelWeight = totalSteel,
            totalSteelTons = totalSteel / 1000.0,
            stirrupCount = nStirrups,
            stirrupPerimeter = stirrupPerim,
            concreteCostNet = concCostNet,
            steelCost = steelCost,
            totalCost = concCostNet + steelCost
        )
    }
}
