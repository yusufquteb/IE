package com.my.iengineer1.ui.projects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.R
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
            findNavController().navigate(
                R.id.projectDetailFragment,
                Bundle().apply { putLong(ProjectDetailFragment.ARG_PROJECT_ID, -1L) }
            )
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
                binding.rvProjects.adapter = ProjectsAdapter(
                    projects,
                    onOpen = { project ->
                        findNavController().navigate(
                            R.id.projectDetailFragment,
                            ProjectDetailFragment.newBundle(project.id)
                        )
                    },
                    onDelete = { project -> viewModel.deleteProject(project) }
                )
            }
        }
    }
}
