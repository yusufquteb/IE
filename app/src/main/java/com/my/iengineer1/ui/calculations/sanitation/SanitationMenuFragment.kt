package com.my.iengineer1.ui.calculations.sanitation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.R
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.databinding.FragmentSanitationMenuBinding

class SanitationMenuFragment : BaseFragment<FragmentSanitationMenuBinding>() {

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentSanitationMenuBinding.inflate(inflater, container, false)

    override fun setupViews() {
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
        binding.btnSewerPipe.setOnClickListener {
            findNavController().navigate(R.id.action_sanitation_to_sewer)
        }
    }
}
