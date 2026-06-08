package com.my.iengineer1.data.export

import android.content.Context
import com.my.iengineer1.db.entity.Project as LegacyProject
import com.my.iengineer1.db.entity.QuantityItem
import com.my.iengineer1.domain.engine.BOQSummary
import com.my.iengineer1.export.PdfExportUtil
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BOQPdfExporter @Inject constructor() {

    suspend fun export(
        context: Context,
        boqSummary: BOQSummary,
        projectName: String = boqSummary.projectName,
        client: String = "",
        engineer: String = "",
        location: String = ""
    ): String? = withContext(Dispatchers.IO) {
        val legacyProject = LegacyProject.create(projectName, "structures", client, engineer, location)

        val items = mutableListOf<QuantityItem>()
        var globalOrder = 0

        boqSummary.sections.forEachIndexed { sIdx, section ->
            section.items.forEachIndexed { iIdx, boqItem ->
                val qi = QuantityItem().apply {
                    itemNo      = "${sIdx + 1}.${iIdx + 1}"
                    description = "[${section.title}] ${boqItem.description}"
                    unit        = boqItem.unit
                    quantity    = boqItem.quantity
                    unitPrice   = boqItem.unitRate
                    totalPrice  = boqItem.amount
                    this.section = section.title
                    sortOrder   = globalOrder++
                }
                items.add(qi)
            }
        }

        PdfExportUtil.exportProject(context, legacyProject, items)
    }

    fun openPdf(context: Context, path: String) =
        PdfExportUtil.openPdf(context, path)
}
