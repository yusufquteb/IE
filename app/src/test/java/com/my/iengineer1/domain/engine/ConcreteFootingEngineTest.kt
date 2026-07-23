package com.my.iengineer1.domain.engine

import com.my.iengineer1.domain.engine.concrete.ConcreteFootingEngine
import org.junit.Assert.*
import org.junit.Test

class ConcreteFootingEngineTest {

    @Test
    fun `footing size increases with higher column load`() {
        val small = ConcreteFootingEngine.calculate(
            ConcreteFootingEngine.Input(columnLoad = 300.0, soilBearingCapacity = 150.0, concreteGrade = 25.0, steelGrade = 420.0)
        )
        val large = ConcreteFootingEngine.calculate(
            ConcreteFootingEngine.Input(columnLoad = 800.0, soilBearingCapacity = 150.0, concreteGrade = 25.0, steelGrade = 420.0)
        )
        assertTrue("Larger load should produce larger footing", large.footingWidth > small.footingWidth)
    }

    @Test
    fun `footing depth is at least 300mm`() {
        val result = ConcreteFootingEngine.calculate(
            ConcreteFootingEngine.Input(columnLoad = 200.0, soilBearingCapacity = 200.0, concreteGrade = 25.0, steelGrade = 420.0)
        )
        assertTrue("Depth must be ≥ 0.3 m", result.footingDepth >= 0.3)
    }

    @Test
    fun `concrete volume is positive`() {
        val result = ConcreteFootingEngine.calculate(
            ConcreteFootingEngine.Input(columnLoad = 500.0, soilBearingCapacity = 150.0, concreteGrade = 25.0, steelGrade = 420.0)
        )
        assertTrue(result.concreteVolume > 0)
        assertTrue(result.steelWeight > 0)
    }

    @Test
    fun `bar diameter is one of standard sizes`() {
        val result = ConcreteFootingEngine.calculate(
            ConcreteFootingEngine.Input(columnLoad = 600.0, soilBearingCapacity = 150.0, concreteGrade = 25.0, steelGrade = 420.0)
        )
        val standardDiams = listOf(12, 16, 20, 25)
        assertTrue("Bar diameter should be standard", result.barDiameter in standardDiams)
    }
}
