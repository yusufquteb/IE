package com.my.iengineer1.domain.engine.roads

object AsphaltLayersEngine {

    data class Input(
        val roadLength: Double,       // m
        val roadWidth: Double,        // m
        val wearingCourseThickness: Double,  // mm
        val binderCourseThickness: Double,   // mm
        val baseCourseThickness: Double,     // mm (granular)
        val asphaltDensity: Double = 2350.0  // kg/m³
    )

    data class LayerResult(
        val name: String,
        val thicknessMm: Double,
        val volumeM3: Double,
        val weightTon: Double
    )

    data class Result(
        val wearingCourse: LayerResult,
        val binderCourse: LayerResult,
        val baseCourse: LayerResult,
        val totalAsphaltVolume: Double,   // m³
        val totalAsphaltWeight: Double,   // ton
        val totalBaseVolume: Double,      // m³
        val roadArea: Double              // m²
    )

    fun calculate(input: Input): Result {
        val area = input.roadLength * input.roadWidth

        fun layer(name: String, thicknessMm: Double): LayerResult {
            val vol = area * thicknessMm / 1000.0
            val weight = vol * input.asphaltDensity / 1000.0
            return LayerResult(name, thicknessMm, vol, weight)
        }

        val wearing = layer("طبقة الرابط العلوي (Wearing)", input.wearingCourseThickness)
        val binder  = layer("طبقة الرابط (Binder)", input.binderCourseThickness)
        val base    = LayerResult(
            "طبقة الأساس الحجري (Base)",
            input.baseCourseThickness,
            area * input.baseCourseThickness / 1000.0,
            0.0
        )

        return Result(
            wearingCourse = wearing,
            binderCourse = binder,
            baseCourse = base,
            totalAsphaltVolume = wearing.volumeM3 + binder.volumeM3,
            totalAsphaltWeight = wearing.weightTon + binder.weightTon,
            totalBaseVolume = base.volumeM3,
            roadArea = area
        )
    }
}
