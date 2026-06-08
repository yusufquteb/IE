package com.my.iengineer1.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import com.my.iengineer1.core.base.BaseViewModel
import com.my.iengineer1.domain.model.Project
import com.my.iengineer1.domain.repository.ProjectRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val projectRepository: ProjectRepository
) : BaseViewModel() {

    val recentProjects: LiveData<List<Project>> =
        projectRepository.getAllProjects().asLiveData()

    private val _searchQuery = MutableLiveData("")
    val searchQuery: LiveData<String> get() = _searchQuery

    fun search(query: String) {
        _searchQuery.value = query
    }
}
