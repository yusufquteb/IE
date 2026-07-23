package com.my.iengineer1.ui.calculations.concrete

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.R
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.core.extensions.doubleOrNull
import com.my.iengineer1.core.extensions.show
import com.my.iengineer1.core.extensions.toast
import com.my.iengineer1.databinding.FragmentRcColumnBinding
import com.my.iengineer1.domain.engine.concrete.RCColumnEngine
import com.my.iengineer1.ui.calculations.ResultRowAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RCColumnFragment : BaseFragment<FragmentRcColumnBinding>() {

    private val viewModel: RCColumnViewModel by viewModels()

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentRcColumnBinding.inflate(inflater, container, false)

    override fun setupViews() {
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }

        val barDiams = listOf("8 mm", "10 mm", "12 mm", "14 mm", "16 mm", "18 mm", "20 mm", "22 mm", "25 mm", "28 mm", "32 mm")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, barDiams)
        binding.spinnerMainBar.setAdapter(adapter)
        binding.spinnerLinkBar.setAdapter(adapter)
        binding.spinnerMainBar.setText("16 mm", false)
        binding.spinnerLinkBar.setText("8 mm", false)

        binding.btnCalculate.setOnClickListener { calculate() }
        binding.btnAddToBoq.setOnClickListener {
            toast(getString(R.string.boq_item_added))
        }
    }

    override fun observeViewModel() {
        viewModel.result.observe(viewLifecycleOwner) { result ->
            if (result != null) showResults(result)
        }
    }

    private fun calculate() {
        val length = binding.etColLength.doubleOrNull()
        val width = binding.etColWidth.doubleOrNull()
        val height = binding.etHeight.doubleOrNull()
        val quantity = binding.etQuantity.text?.toString()?.trim()?.toIntOrNull() ?: 1
        val waste = binding.etWaste.doubleOrNull() ?: 5.0

        if (length == null || width == null || height == null) {
            toast(getString(R.string.error_fill_fields))
            return
        }

        val mainDiam = binding.spinnerMainBar.text.toString().trim().replace(" mm", "").toIntOrNull() ?: 16
        val linkDiam = binding.spinnerLinkBar.text.toString().trim().replace(" mm", "").toIntOrNull() ?: 8
        val barCount = binding.etBarCount.text?.toString()?.trim()?.toIntOrNull() ?: 4
        val linkSpacing = binding.etLinkSpacing.doubleOrNull() ?: 200.0

        viewModel.calculate(
            RCColumnEngine.Input(
                length = length,
                width = width,
                height = height,
                quantity = quantity,
                mainBarDiameter = mainDiam,
                mainBarCount = barCount,
                linkDiameter = linkDiam,
                linkSpacing = linkSpacing,
                wastePercent = waste
            )
        )
    }

    private fun showResults(r: RCColumnEngine.Result) {
        binding.cardResults.show()
        val rows = listOf(
            getString(R.string.concrete_volume_net) to "${fmt(r.concreteVolumeTotal)} م³",
            getString(R.string.concrete_volume_waste) to "${fmt(r.concreteVolumeWithWaste)} م³",
            getString(R.string.main_steel_weight) to "${fmt(r.mainSteelWeightTotal)} كجم",
            getString(R.string.links_weight) to "${fmt(r.linkSteelWeightTotal)} كجم",
            getString(R.string.total_steel_weight) to "${fmt(r.totalSteelWeight)} كجم",
            getString(R.string.total_steel_tons) to "${fmt3(r.totalSteelTons)} طن",
            getString(R.string.link_count) to "${r.linkCount} حلقة / عمود"
        )
        binding.rvResults.adapter = ResultRowAdapter(rows)
    }

    private fun fmt(d: Double) = String.format("%.3f", d)
    private fun fmt3(d: Double) = String.format("%.4f", d)
}
