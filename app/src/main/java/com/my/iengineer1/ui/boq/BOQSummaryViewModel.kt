package com.my.iengineer1.ui.boq

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.my.iengineer1.core.base.BaseViewModel
import com.my.iengineer1.domain.engine.BOQEngine
import com.my.iengineer1.domain.engine.BOQSection
import com.my.iengineer1.domain.engine.BOQSummary
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BOQSummaryViewModel @Inject constructor() : BaseViewModel() {

    private val _sections = MutableLiveData<List<BOQSection>>(emptyList())
    val sections: LiveData<List<BOQSection>> get() = _sections

    private val _summary = MutableLiveData<BOQSummary?>()
    val summary: LiveData<BOQSummary?> get() = _summary

    fun addConcreteSection(
        projectName: String,
        concreteVol: Double,
        steelTons: Double,
        formworkArea: Double,
        concreteRate: Double = 0.0,
        steelRate: Double = 0.0,
        formworkRate: Double = 0.0
    ) {
        val section = BOQEngine.buildConcreteSection(
            projectName, concreteVol, steelTons, formworkArea,
            concreteRate, steelRate, formworkRate
        )
        addSection(section, projectName)
    }

    fun addSewerSection(
        projectName: String,
        pipeLength: Double,
        pipeDiam: Double,
        excavVol: Double,
        beddingVol: Double,
        backfillVol: Double
    ) {
        val section = BOQEngine.buildSewerSection(
            pipeLength, pipeDiam, excavVol, beddingVol, backfillVol
        )
        addSection(section, projectName)
    }

    fun addAsphaltSection(
        projectName: String,
        wearingVol: Double,
        binderVol: Double,
        baseVol: Double
    ) {
        val section = BOQEngine.buildAsphaltSection(wearingVol, binderVol, baseVol)
        addSection(section, projectName)
    }

    private fun addSection(section: BOQSection, projectName: String) {
        val current = _sections.value.orEmpty().toMutableList()
        current.add(section)
        _sections.value = current
        rebuildSummary(projectName, current)
    }

    private fun rebuildSummary(projectName: String, sections: List<BOQSection>) {
        _summary.value = BOQSummary(projectName = projectName, sections = sections)
    }

    fun clearAll() {
        _sections.value = emptyList()
        _summary.value = null
    }

    // Demo: load sample BOQ
    fun loadSampleBOQ() {
        val conc = BOQEngine.buildConcreteSection(
            "مشروع نموذجي",
            concreteVolM3 = 45.0,
            steelWeightTon = 3.5,
            formworkAreaM2 = 120.0
        )
        val sewer = BOQEngine.buildSewerSection(
            pipeLength = 200.0, pipeDiameterMm = 300.0,
            excavVolM3 = 180.0, beddingVolM3 = 15.0, backfillVolM3 = 165.0,
            manholeCount = 4
        )
        val asphalt = BOQEngine.buildAsphaltSection(
            wearingVolM3 = 50.0, binderVolM3 = 75.0, baseVolM3 = 200.0
        )
        _sections.value = listOf(conc, sewer, asphalt)
        _summary.value = BOQSummary("مشروع نموذجي", listOf(conc, sewer, asphalt))
    }
}
