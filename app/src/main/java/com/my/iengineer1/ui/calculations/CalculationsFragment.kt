package com.my.iengineer1.ui.calculations

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.R
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.databinding.FragmentCalculationsBinding
import com.my.iengineer1.ui.home.CalcCategory
import com.my.iengineer1.ui.home.CalcCategoryAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CalculationsFragment : BaseFragment<FragmentCalculationsBinding>() {

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentCalculationsBinding.inflate(inflater, container, false)

    override fun setupViews() {
        val categories = CalcCategory.allCategories()
        binding.rvCalcCategories.adapter = CalcCategoryAdapter(categories) { category ->
            when (category.id) {
                CalcCategory.CONCRETE -> findNavController().navigate(R.id.action_calculations_to_concrete)
                CalcCategory.ROADS -> findNavController().navigate(R.id.action_calculations_to_roads)
                CalcCategory.SANITATION -> findNavController().navigate(R.id.action_calculations_to_sanitation)
                CalcCategory.STRUCTURAL -> findNavController().navigate(R.id.action_calculations_to_structural)
            }
        }
    }
}
