package com.my.iengineer1.data.repository

import com.my.iengineer1.data.local.dao.ProjectDaoKt
import com.my.iengineer1.data.local.entity.ProjectEntity
import com.my.iengineer1.domain.model.Project
import com.my.iengineer1.domain.repository.ProjectRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ProjectRepositoryImpl @Inject constructor(
    private val dao: ProjectDaoKt
) : ProjectRepository {

    override fun getAllProjects(): Flow<List<Project>> =
        dao.getAllProjects().map { list -> list.map { it.toDomain() } }

    override suspend fun getById(id: Long): Project? =
        dao.getById(id)?.toDomain()

    override suspend fun save(project: Project): Long =
        dao.insert(project.toEntity())

    override suspend fun delete(project: Project) =
        dao.delete(project.toEntity())

    override suspend fun deleteById(id: Long) =
        dao.deleteById(id)

    private fun ProjectEntity.toDomain() = Project(id, name, description, category, createdAt, updatedAt)
    private fun Project.toEntity() = ProjectEntity(id, name, description, category, createdAt, updatedAt)
}
