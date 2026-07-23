package com.my.iengineer1.domain.engine.roads

import kotlin.math.PI
import kotlin.math.ceil

object DrainagePipeEngine {

    data class Input(
        val pipeLength: Double,          // m
        val pipeDiameter: Double,        // mm
        val trenchBottomWidth: Double,   // m (typically pipe_diam/1000 + 0.40)
        val trenchTopWidth: Double,      // m (bottom + 2 × side slope × depth)
        val avgTrenchDepth: Double,      // m
        val sideSlope: Double = 0.25,    // H:V  (0.25 for hard soil)
        val beddingThickness: Double = 0.15,  // m
        val beddingWidth: Double = 0.0,       // m (0 = same as bottom width)
        val pipeUnitCost: Double = 0.0,
        val excavationUnitCost: Double = 0.0,
        val backfillUnitCost: Double = 0.0,
        val beddingUnitCost: Double = 0.0
    )

    data class Result(
        // Trench geometry
        val trenchBottomWidth: Double,
        val trenchTopWidth: Double,
        val avgTrenchDepth: Double,
        val trenchCrossSection: Double,     // m²  (trapezoid)
        // Volumes
        val excavationVolume: Double,       // m³
        val pipeCircularArea: Double,       // m²
        val pipeVolume: Double,             // m³
        val beddingVolume: Double,          // m³
        val sideFillVolume: Double,         // m³ (around pipe up to top of pipe)
        val totalBackfillVolume: Double,    // m³
        // Pipe quantity
        val pipeLength: Double,
        val pipeDiameterMm: Double,
        // Costs
        val pipeCost: Double,
        val excavationCost: Double,
        val backfillCost: Double,
        val beddingCost: Double,
        val totalCost: Double
    )

    fun calculate(input: Input): Result = with(input) {
        val pipeRadiusM = pipeDiameter / 2000.0
        val pipeArea = PI * pipeRadiusM * pipeRadiusM

        val effectiveBeddingWidth = if (beddingWidth == 0.0) trenchBottomWidth else beddingWidth

        // Trapezoidal cross-section: A = ((b_top + b_bottom) / 2) × h
        val crossSection = (trenchBottomWidth + trenchTopWidth) / 2.0 * avgTrenchDepth

        val excavVol = crossSection * pipeLength
        val pipeVol = pipeArea * pipeLength
        val beddingVol = effectiveBeddingWidth * beddingThickness * pipeLength

        // Side fill = zone from bedding top to top of pipe
        val pipeZoneHeight = pipeDiameter / 1000.0  // m
        val sideFillWidth = trenchBottomWidth - pipeDiameter / 1000.0
        val sideFillVol = maxOf(0.0, (sideFillWidth * pipeZoneHeight * pipeLength) - pipeVol)

        val totalBackfill = excavVol - pipeVol - beddingVol

        val pipeCostVal = pipeLength * pipeUnitCost
        val excCostVal = excavVol * excavationUnitCost
        val backfillCostVal = totalBackfill * backfillUnitCost
        val beddingCostVal = beddingVol * beddingUnitCost

        Result(
            trenchBottomWidth = trenchBottomWidth,
            trenchTopWidth = trenchTopWidth,
            avgTrenchDepth = avgTrenchDepth,
            trenchCrossSection = crossSection,
            excavationVolume = excavVol,
            pipeCircularArea = pipeArea,
            pipeVolume = pipeVol,
            beddingVolume = beddingVol,
            sideFillVolume = sideFillVol,
            totalBackfillVolume = totalBackfill,
            pipeLength = pipeLength,
            pipeDiameterMm = pipeDiameter,
            pipeCost = pipeCostVal,
            excavationCost = excCostVal,
            backfillCost = backfillCostVal,
            beddingCost = beddingCostVal,
            totalCost = pipeCostVal + excCostVal + backfillCostVal + beddingCostVal
        )
    }
}
