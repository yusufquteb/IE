package com.my.iengineer1.ui.projects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.databinding.FragmentProjectDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProjectDetailFragment : BaseFragment<FragmentProjectDetailBinding>() {

    private val viewModel: ProjectDetailViewModel by viewModels()
    private var projectId: Long = -1L

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentProjectDetailBinding.inflate(inflater, container, false)

    override fun setupViews() {
        projectId = arguments?.getLong(ARG_PROJECT_ID, -1L) ?: -1L
        viewModel.load(projectId)

        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }

        binding.btnSave.setOnClickListener {
            viewModel.save(
                projectId = projectId,
                name = binding.etName.text?.toString().orEmpty().trim(),
                client = binding.etClient.text?.toString().orEmpty().trim(),
                engineer = binding.etEngineer.text?.toString().orEmpty().trim(),
                location = binding.etLocation.text?.toString().orEmpty().trim()
            )
        }

        binding.btnExportPdf.setOnClickListener {
            viewModel.exportPdf(
                context = requireContext(),
                projectId = projectId,
                name = binding.etName.text?.toString().orEmpty().trim(),
                client = binding.etClient.text?.toString().orEmpty().trim(),
                engineer = binding.etEngineer.text?.toString().orEmpty().trim(),
                location = binding.etLocation.text?.toString().orEmpty().trim()
            )
        }
    }

    override fun observeViewModel() {
        viewModel.project.observe(viewLifecycleOwner) { project ->
            project ?: return@observe
            binding.etName.setText(project.name)
            binding.etClient.setText(project.client)
            binding.etEngineer.setText(project.engineer)
            binding.etLocation.setText(project.location)
        }

        viewModel.event.observe(viewLifecycleOwner) { event ->
            event ?: return@observe
            when (event) {
                is ProjectDetailViewModel.UiEvent.Saved -> {
                    Toast.makeText(requireContext(), getString(com.my.iengineer1.R.string.project_saved), Toast.LENGTH_SHORT).show()
                    findNavController().navigateUp()
                }
                is ProjectDetailViewModel.UiEvent.ExportSuccess -> {
                    Toast.makeText(requireContext(), getString(com.my.iengineer1.R.string.export_saved, event.path), Toast.LENGTH_LONG).show()
                    viewModel.openPdf(requireContext(), event.path)
                }
                is ProjectDetailViewModel.UiEvent.Error -> {
                    Toast.makeText(requireContext(), event.msg, Toast.LENGTH_SHORT).show()
                }
            }
            viewModel.clearEvent()
        }
    }

    companion object {
        const val ARG_PROJECT_ID = "projectId"

        fun newBundle(projectId: Long) = Bundle().apply {
            putLong(ARG_PROJECT_ID, projectId)
        }
    }
}
