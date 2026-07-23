package com.my.iengineer1.domain.engine.sanitation

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

object SewerPipeEngine {

    data class Input(
        val pipeLength: Double,        // m
        val pipeDiameter: Double,      // mm
        val slope: Double,             // m/m  (e.g. 0.005 = 5‰)
        val manningN: Double = 0.013,  // Manning roughness (concrete = 0.013)
        val excavationWidth: Double,   // m
        val excavationDepth: Double    // m
    )

    data class Result(
        val flowVelocity: Double,      // m/s (Manning full-flow)
        val flowCapacity: Double,      // m³/s
        val excavationVolume: Double,  // m³
        val pipeVolume: Double,        // m³
        val sandBeddingVolume: Double, // m³
        val backfillVolume: Double,    // m³
        val isVelocityAdequate: Boolean,   // ≥ 0.6 m/s self-cleaning
        val isSlopeAdequate: Boolean       // ≥ 1:200
    )

    fun calculate(input: Input): Result {
        val r = input.pipeDiameter / 2000.0   // radius in m
        val area = PI * r * r
        val hydraulicRadius = r / 2.0

        // Manning equation: V = (1/n) * R^(2/3) * S^(1/2)
        val velocity = (1.0 / input.manningN) *
                hydraulicRadius.pow(2.0 / 3.0) *
                sqrt(input.slope)

        val capacity = velocity * area

        val excVol = input.excavationWidth * input.excavationDepth * input.pipeLength
        val pipeVol = area * input.pipeLength
        val sandVol = input.excavationWidth * 0.15 * input.pipeLength  // 15 cm bedding
        val backfill = excVol - pipeVol - sandVol

        return Result(
            flowVelocity = velocity,
            flowCapacity = capacity,
            excavationVolume = excVol,
            pipeVolume = pipeVol,
            sandBeddingVolume = sandVol,
            backfillVolume = backfill,
            isVelocityAdequate = velocity >= 0.6,
            isSlopeAdequate = input.slope >= 1.0 / 200.0
        )
    }
}
