package com.my.iengineer1.ui.calculations.concrete

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.R
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.databinding.FragmentConcreteMenuBinding

class ConcreteMenuFragment : BaseFragment<FragmentConcreteMenuBinding>() {

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentConcreteMenuBinding.inflate(inflater, container, false)

    override fun setupViews() {
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
        binding.btnFooting.setOnClickListener {
            findNavController().navigate(R.id.action_concrete_to_footing)
        }
    }
}
