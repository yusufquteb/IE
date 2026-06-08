package com.my.iengineer1.ui.calculations.structural

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.databinding.FragmentStructuralMenuBinding

class StructuralMenuFragment : BaseFragment<FragmentStructuralMenuBinding>() {

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentStructuralMenuBinding.inflate(inflater, container, false)

    override fun setupViews() {
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
    }
}
