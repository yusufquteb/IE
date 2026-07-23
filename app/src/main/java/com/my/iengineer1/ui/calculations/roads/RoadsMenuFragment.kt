package com.my.iengineer1.ui.calculations.roads

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.R
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.databinding.FragmentRoadsMenuBinding

class RoadsMenuFragment : BaseFragment<FragmentRoadsMenuBinding>() {

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentRoadsMenuBinding.inflate(inflater, container, false)

    override fun setupViews() {
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
        binding.btnAsphalt.setOnClickListener {
            findNavController().navigate(R.id.action_roads_to_asphalt)
        }
    }
}
