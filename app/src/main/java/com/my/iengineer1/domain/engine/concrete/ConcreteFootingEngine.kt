package com.my.iengineer1.domain.engine.concrete

import kotlin.math.ceil
import kotlin.math.sqrt

object ConcreteFootingEngine {

    data class Input(
        val columnLoad: Double,       // kN
        val soilBearingCapacity: Double, // kN/m²
        val concreteGrade: Double,    // MPa (fc')
        val steelGrade: Double,       // MPa (fy)
        val coverDepth: Double = 75.0  // mm
    )

    data class Result(
        val footingWidth: Double,     // m
        val footingLength: Double,    // m
        val footingDepth: Double,     // m
        val steelAreaX: Double,       // mm²/m
        val steelAreaY: Double,       // mm²/m
        val barDiameter: Int,         // mm
        val barSpacing: Double,       // mm
        val barsCountX: Int,
        val barsCountY: Int,
        val concreteVolume: Double,   // m³
        val steelWeight: Double       // kg
    )

    fun calculate(input: Input): Result {
        with(input) {
            // Net bearing capacity (assume footing + soil weight = 20% of column load)
            val netSBC = soilBearingCapacity - 20.0
            val area = (columnLoad * 1.1) / netSBC
            val side = ceil(sqrt(area) * 10) / 10.0   // round up to nearest 10 cm

            // Depth by ACI rule: d ≥ L/5 minimum 300 mm
            val depth = maxOf(side / 5.0, 0.3)
            val depthRounded = ceil(depth * 10) / 10.0

            val d = depthRounded * 1000 - coverDepth   // effective depth mm

            // Factored upward pressure
            val Pu = columnLoad * 1.5
            val qu = Pu / (side * side)

            // Moment at face of column (assume 400mm column)
            val columnWidth = 0.4
            val arm = (side - columnWidth) / 2.0
            val Mu = qu * side * arm * arm / 2.0 * 1e6  // N·mm

            // Required steel area (ACI 318)
            val phi = 0.9
            val Rn = Mu / (phi * side * 1000 * d * d)
            val rho = (0.85 * concreteGrade / steelGrade) *
                    (1 - sqrt(1 - 2 * Rn / (0.85 * concreteGrade)))
            val rhoMin = maxOf(0.25 * sqrt(concreteGrade) / steelGrade, 1.4 / steelGrade)
            val rhoDesign = maxOf(rho, rhoMin)

            val As = rhoDesign * side * 1000 * d   // mm² total
            val asPer = As / side                   // mm²/m

            // Bar selection
            val diameter = when {
                asPer < 500 -> 12
                asPer < 900 -> 16
                asPer < 1400 -> 20
                else -> 25
            }
            val barArea = Math.PI * diameter * diameter / 4.0
            val spacing = minOf(barArea / asPer * 1000, 300.0)
            val spacingRounded = (spacing / 25).toInt() * 25.0  // round to 25 mm
            val barsCount = ceil(side * 1000 / spacingRounded).toInt() + 1

            val concreteVol = side * side * depthRounded
            val steelVolumePerBar = barArea * 1e-6 * side
            val totalSteelVol = steelVolumePerBar * barsCount * 2
            val steelKg = totalSteelVol * 7850

            return Result(
                footingWidth = side,
                footingLength = side,
                footingDepth = depthRounded,
                steelAreaX = asPer,
                steelAreaY = asPer,
                barDiameter = diameter,
                barSpacing = spacingRounded,
                barsCountX = barsCount,
                barsCountY = barsCount,
                concreteVolume = concreteVol,
                steelWeight = steelKg
            )
        }
    }
}
