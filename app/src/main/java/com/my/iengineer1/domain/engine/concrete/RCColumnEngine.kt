package com.my.iengineer1.domain.engine.concrete

import kotlin.math.PI
import kotlin.math.ceil
import kotlin.math.sqrt

object RCColumnEngine {

    data class Input(
        val length: Double,          // m (column longer dimension)
        val width: Double,           // m (column shorter dimension)
        val height: Double,          // m
        val quantity: Int = 1,
        val mainBarDiameter: Int = 16,   // mm
        val mainBarCount: Int = 4,
        val linkDiameter: Int = 8,       // mm
        val linkSpacing: Double = 200.0, // mm
        val concreteCover: Double = 40.0, // mm
        val wastePercent: Double = 5.0,
        val concreteUnitCost: Double = 0.0,
        val steelUnitCost: Double = 0.0
    )

    data class Result(
        // Dimensions
        val columnLength: Double,
        val columnWidth: Double,
        val columnHeight: Double,
        val quantity: Int,
        // Concrete
        val concreteVolumeNet: Double,       // m³ per column
        val concreteVolumeTotal: Double,     // m³ all columns
        val concreteVolumeWithWaste: Double, // m³ with waste factor
        // Main Steel
        val mainBarDiameterMm: Int,
        val mainBarCount: Int,
        val mainBarLengthPerColumn: Double,  // m
        val mainBarWeightPerMeter: Double,   // kg/m   (d²/162)
        val mainSteelWeightTotal: Double,    // kg all columns
        // Links/Stirrups
        val linkDiameterMm: Int,
        val linkCount: Int,
        val linkPerimeter: Double,           // m per link
        val linkWeightPerMeter: Double,      // kg/m
        val linkSteelWeightTotal: Double,    // kg all columns
        // Totals
        val totalSteelWeight: Double,        // kg
        val totalSteelTons: Double,          // ton
        // BOQ
        val concreteCostNet: Double,
        val concreteCostWithWaste: Double,
        val steelCost: Double,
        val totalCostNet: Double,
        val totalCostWithWaste: Double
    )

    fun calculate(input: Input): Result = with(input) {
        // Concrete volume
        val volPerColumn = length * width * height
        val volTotal = volPerColumn * quantity
        val volWithWaste = volTotal * (1 + wastePercent / 100.0)

        // Main bars — weight per meter using d²/162 formula (kg/m, d in mm)
        val mainWt = mainBarDiameter * mainBarDiameter / 162.0
        val mainLengthPerColumn = height + 0.30  // 30 cm lap splice allowance
        val mainSteelWeight = mainBarCount * mainLengthPerColumn * mainWt * quantity

        // Links — perimeter of cage
        val cageLength = length * 1000 - 2 * concreteCover  // mm
        val cageWidth = width * 1000 - 2 * concreteCover    // mm
        val linkPerim = 2 * (cageLength + cageWidth) / 1000.0 + 0.20  // m (with hook)
        val linkWt = linkDiameter * linkDiameter / 162.0
        val nLinks = ceil(height * 1000.0 / linkSpacing).toInt() + 1
        val linkSteelWeight = nLinks * linkPerim * linkWt * quantity

        val totalSteel = mainSteelWeight + linkSteelWeight
        val totalSteelTon = totalSteel / 1000.0

        // Costs
        val concCostNet = volTotal * concreteUnitCost
        val concCostWaste = volWithWaste * concreteUnitCost
        val stelCost = totalSteel * steelUnitCost

        return Result(
            columnLength = length,
            columnWidth = width,
            columnHeight = height,
            quantity = quantity,
            concreteVolumeNet = volPerColumn,
            concreteVolumeTotal = volTotal,
            concreteVolumeWithWaste = volWithWaste,
            mainBarDiameterMm = mainBarDiameter,
            mainBarCount = mainBarCount,
            mainBarLengthPerColumn = mainLengthPerColumn,
            mainBarWeightPerMeter = mainWt,
            mainSteelWeightTotal = mainSteelWeight,
            linkDiameterMm = linkDiameter,
            linkCount = nLinks,
            linkPerimeter = linkPerim,
            linkWeightPerMeter = linkWt,
            linkSteelWeightTotal = linkSteelWeight,
            totalSteelWeight = totalSteel,
            totalSteelTons = totalSteelTon,
            concreteCostNet = concCostNet,
            concreteCostWithWaste = concCostWaste,
            steelCost = stelCost,
            totalCostNet = concCostNet + stelCost,
            totalCostWithWaste = concCostWaste + stelCost
        )
    }
}
