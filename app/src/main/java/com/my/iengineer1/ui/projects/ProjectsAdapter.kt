package com.my.iengineer1.ui.projects

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.my.iengineer1.databinding.ItemProjectV2Binding
import com.my.iengineer1.domain.model.Project
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class ProjectsAdapter(
    private val projects: List<Project>,
    private val onOpen: (Project) -> Unit,
    private val onDelete: (Project) -> Unit
) : RecyclerView.Adapter<ProjectsAdapter.VH>() {

    private val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())

    inner class VH(private val binding: ItemProjectV2Binding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(project: Project) {
            binding.tvName.text = project.name
            binding.tvDate.text = dateFormat.format(Date(project.updatedAt))
            binding.tvCategory.text = project.category.ifEmpty { "—" }
            binding.root.setOnClickListener { onOpen(project) }
            binding.btnDelete.setOnClickListener { onDelete(project) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VH(
        ItemProjectV2Binding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(projects[position])
    override fun getItemCount() = projects.size
}
