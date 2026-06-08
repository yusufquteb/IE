package com.my.iengineer1.ui.projects

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.my.iengineer1.core.base.BaseViewModel
import com.my.iengineer1.data.export.BOQPdfExporter
import com.my.iengineer1.domain.engine.BOQSummary
import com.my.iengineer1.domain.model.Project
import com.my.iengineer1.domain.repository.ProjectRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProjectDetailViewModel @Inject constructor(
    private val repository: ProjectRepository,
    private val pdfExporter: BOQPdfExporter
) : BaseViewModel() {

    sealed class UiEvent {
        object Saved : UiEvent()
        data class ExportSuccess(val path: String) : UiEvent()
        data class Error(val msg: String) : UiEvent()
    }

    private val _project = MutableLiveData<Project?>()
    val project: LiveData<Project?> = _project

    private val _event = MutableLiveData<UiEvent?>()
    val event: LiveData<UiEvent?> = _event

    fun load(projectId: Long) {
        if (projectId <= 0L) return
        launch {
            _project.postValue(repository.getById(projectId))
        }
    }

    fun save(projectId: Long, name: String, client: String, engineer: String, location: String) {
        if (name.isBlank()) {
            _event.value = UiEvent.Error("اسم المشروع مطلوب")
            return
        }
        launch {
            val existing = if (projectId > 0L) repository.getById(projectId) else null
            val toSave = existing?.copy(
                name = name, client = client, engineer = engineer,
                location = location, updatedAt = System.currentTimeMillis()
            ) ?: Project(name = name, client = client, engineer = engineer, location = location)
            repository.save(toSave)
            _event.postValue(UiEvent.Saved)
        }
    }

    fun exportPdf(context: Context, projectId: Long, name: String, client: String, engineer: String, location: String) {
        launch {
            val boqSummary = BOQSummary(projectName = name, sections = emptyList())
            val path = pdfExporter.export(
                context = context,
                boqSummary = boqSummary,
                projectName = name,
                client = client,
                engineer = engineer,
                location = location
            )
            _event.postValue(
                if (path != null) UiEvent.ExportSuccess(path) else UiEvent.Error("فشل تصدير PDF")
            )
        }
    }

    fun openPdf(context: Context, path: String) = pdfExporter.openPdf(context, path)

    fun clearEvent() { _event.value = null }
}
