package com.my.iengineer1.ui.projects

import androidx.lifecycle.asLiveData
import com.my.iengineer1.core.base.BaseViewModel
import com.my.iengineer1.domain.model.Project
import com.my.iengineer1.domain.repository.ProjectRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProjectsViewModel @Inject constructor(
    private val repository: ProjectRepository
) : BaseViewModel() {

    val projects = repository.getAllProjects().asLiveData()

    fun createProject(name: String) {
        launch {
            repository.save(Project(name = name))
        }
    }

    fun deleteProject(project: Project) {
        launch {
            repository.delete(project)
        }
    }
}
