package com.my.iengineer1.domain.usecase

import com.my.iengineer1.domain.engine.BOQSummary
import com.my.iengineer1.domain.model.Project
import com.my.iengineer1.domain.repository.ProjectRepository
import javax.inject.Inject

class SaveBOQUseCase @Inject constructor(
    private val projectRepository: ProjectRepository
) {
    suspend operator fun invoke(projectName: String, boqSummary: BOQSummary): Long {
        val project = Project(
            name = projectName,
            description = "إجمالي: ${String.format("%.2f", boqSummary.grandTotal)}",
            category = "BOQ"
        )
        return projectRepository.save(project)
    }
}
