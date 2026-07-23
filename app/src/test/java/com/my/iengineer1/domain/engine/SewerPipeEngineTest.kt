package com.my.iengineer1.domain.engine

import com.my.iengineer1.domain.engine.sanitation.SewerPipeEngine
import org.junit.Assert.*
import org.junit.Test

class SewerPipeEngineTest {

    @Test
    fun `velocity meets self-cleaning threshold for minimum slope`() {
        val result = SewerPipeEngine.calculate(
            SewerPipeEngine.Input(
                pipeLength = 100.0,
                pipeDiameter = 300.0,
                slope = 0.005,         // 5‰ — minimum code requirement
                excavationWidth = 1.0,
                excavationDepth = 2.0
            )
        )
        assertTrue("Velocity should be adequate at 5‰ slope", result.isVelocityAdequate)
        assertTrue("5‰ slope should meet minimum requirement", result.isSlopeAdequate)
    }

    @Test
    fun `inadequate slope flags correctly`() {
        val result = SewerPipeEngine.calculate(
            SewerPipeEngine.Input(
                pipeLength = 100.0,
                pipeDiameter = 300.0,
                slope = 0.003,         // 3‰ — below minimum 5‰
                excavationWidth = 1.0,
                excavationDepth = 2.0
            )
        )
        assertFalse("3‰ slope should flag as inadequate", result.isSlopeAdequate)
    }

    @Test
    fun `excavation volume equals cross section times length`() {
        val w = 1.0; val d = 2.0; val l = 50.0
        val result = SewerPipeEngine.calculate(
            SewerPipeEngine.Input(pipeLength = l, pipeDiameter = 300.0, slope = 0.005, excavationWidth = w, excavationDepth = d)
        )
        assertEquals(w * d * l, result.excavationVolume, 0.01)
    }

    @Test
    fun `flow capacity increases with larger diameter`() {
        fun calc(diam: Double) = SewerPipeEngine.calculate(
            SewerPipeEngine.Input(100.0, diam, 0.005, 1.0, 2.0)
        )
        val small = calc(200.0)
        val large = calc(400.0)
        assertTrue("Larger pipe should have more flow capacity", large.flowCapacity > small.flowCapacity)
    }
}
