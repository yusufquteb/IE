package com.my.iengineer1.domain.engine

import com.my.iengineer1.domain.engine.concrete.RCColumnEngine
import org.junit.Assert.*
import org.junit.Test

class RCColumnEngineTest {

    private val defaultInput = RCColumnEngine.Input(
        length = 0.40, width = 0.40, height = 3.0,
        quantity = 1, mainBarDiameter = 16, mainBarCount = 4,
        linkDiameter = 8, linkSpacing = 200.0, wastePercent = 5.0
    )

    @Test
    fun `d squared over 162 formula gives correct weight per meter for 16mm bar`() {
        // Ø16: 16²/162 = 1.580 kg/m  (standard reference = 1.578)
        val wt = 16.0 * 16.0 / 162.0
        assertEquals(1.58, wt, 0.02)
    }

    @Test
    fun `concrete volume is length x width x height x quantity`() {
        val result = RCColumnEngine.calculate(defaultInput)
        val expected = 0.40 * 0.40 * 3.0
        assertEquals(expected, result.concreteVolumeNet, 0.001)
    }

    @Test
    fun `with waste volume is greater than net volume`() {
        val result = RCColumnEngine.calculate(defaultInput)
        assertTrue(result.concreteVolumeWithWaste > result.concreteVolumeTotal)
    }

    @Test
    fun `link count is roughly height divided by spacing plus one`() {
        val result = RCColumnEngine.calculate(defaultInput)
        // 3000 / 200 = 15, +1 = 16
        assertEquals(16, result.linkCount)
    }

    @Test
    fun `multiple columns scales linearly`() {
        val single = RCColumnEngine.calculate(defaultInput)
        val multi = RCColumnEngine.calculate(defaultInput.copy(quantity = 5))
        assertEquals(single.concreteVolumeTotal * 5, multi.concreteVolumeTotal, 0.001)
        assertEquals(single.totalSteelWeight * 5, multi.totalSteelWeight, 0.1)
    }
}
