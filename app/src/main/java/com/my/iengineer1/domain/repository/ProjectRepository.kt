package com.my.iengineer1.domain.repository

import com.my.iengineer1.domain.model.Project
import kotlinx.coroutines.flow.Flow

interface ProjectRepository {
    fun getAllProjects(): Flow<List<Project>>
    suspend fun getById(id: Long): Project?
    suspend fun save(project: Project): Long
    suspend fun delete(project: Project)
    suspend fun deleteById(id: Long)
}
