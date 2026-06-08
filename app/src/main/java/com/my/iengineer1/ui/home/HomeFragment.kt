package com.my.iengineer1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.R
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.core.extensions.hide
import com.my.iengineer1.core.extensions.show
import com.my.iengineer1.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    private val viewModel: HomeViewModel by viewModels()

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentHomeBinding.inflate(inflater, container, false)

    override fun setupViews() {
        setupQuickAccess()
        setupCategories()

        binding.btnSeeAllProjects.setOnClickListener {
            findNavController().navigate(R.id.projectsFragment)
        }
        binding.btnCreateProject.setOnClickListener {
            findNavController().navigate(R.id.projectsFragment)
        }

        // Tapping search bar opens dedicated search screen
        binding.etSearch.isFocusable = false
        binding.etSearch.setOnClickListener {
            findNavController().navigate(R.id.searchFragment)
        }
    }

    override fun observeViewModel() {
        viewModel.recentProjects.observe(viewLifecycleOwner) { projects ->
            if (projects.isEmpty()) {
                binding.rvRecentProjects.hide()
                binding.layoutNoProjects.show()
            } else {
                binding.rvRecentProjects.show()
                binding.layoutNoProjects.hide()
            }
        }
    }

    private fun setupQuickAccess() {
        val items = QuickAccessItem.defaultItems()
        binding.rvQuickAccess.adapter = QuickAccessAdapter(items) { item ->
            handleQuickAccessClick(item)
        }
    }

    private fun setupCategories() {
        val categories = CalcCategory.allCategories()
        binding.rvCategories.adapter = CalcCategoryAdapter(categories) { category ->
            when (category.id) {
                CalcCategory.CONCRETE -> findNavController().navigate(R.id.concreteFragment)
                CalcCategory.ROADS -> findNavController().navigate(R.id.roadsFragment)
                CalcCategory.SANITATION -> findNavController().navigate(R.id.sanitationFragment)
                CalcCategory.STRUCTURAL -> findNavController().navigate(R.id.structuralFragment)
            }
        }
    }

    private fun handleQuickAccessClick(item: QuickAccessItem) {
        when (item.destination) {
            R.id.concreteFootingFragment -> findNavController().navigate(item.destination)
            R.id.asphaltFragment -> findNavController().navigate(item.destination)
            R.id.sewerPipeFragment -> findNavController().navigate(item.destination)
        }
    }
}
