package com.my.iengineer1.ui.projects

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.core.extensions.hide
import com.my.iengineer1.core.extensions.show
import com.my.iengineer1.databinding.FragmentProjectsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProjectsFragment : BaseFragment<FragmentProjectsBinding>() {

    private val viewModel: ProjectsViewModel by viewModels()

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentProjectsBinding.inflate(inflater, container, false)

    override fun setupViews() {
        binding.fabAddProject.setOnClickListener {
            viewModel.createProject("مشروع جديد")
        }
    }

    override fun observeViewModel() {
        viewModel.projects.observe(viewLifecycleOwner) { projects ->
            if (projects.isEmpty()) {
                binding.rvProjects.hide()
                binding.layoutEmpty.show()
            } else {
                binding.rvProjects.show()
                binding.layoutEmpty.hide()
                binding.rvProjects.adapter = ProjectsAdapter(projects) { project ->
                    viewModel.deleteProject(project)
                }
            }
        }
    }
}
