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
import com.my.iengineer1.databinding.FragmentRcBeamBinding
import com.my.iengineer1.domain.engine.concrete.RCBeamEngine
import com.my.iengineer1.ui.calculations.ResultRowAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RCBeamFragment : BaseFragment<FragmentRcBeamBinding>() {

    private val viewModel: RCBeamViewModel by viewModels()

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentRcBeamBinding.inflate(inflater, container, false)

    override fun setupViews() {
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }

        val barDiams = listOf("8 mm", "10 mm", "12 mm", "14 mm", "16 mm", "18 mm", "20 mm", "22 mm", "25 mm", "28 mm", "32 mm")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, barDiams)
        binding.spinnerBottomBar.setAdapter(adapter)
        binding.spinnerStirrup.setAdapter(adapter)
        binding.spinnerBottomBar.setText("20 mm", false)
        binding.spinnerStirrup.setText("8 mm", false)

        binding.btnCalculate.setOnClickListener { calculate() }
    }

    override fun observeViewModel() {
        viewModel.result.observe(viewLifecycleOwner) { result ->
            if (result != null) showResults(result)
        }
    }

    private fun calculate() {
        val span = binding.etSpan.doubleOrNull()
        val width = binding.etWidth.doubleOrNull()
        val depth = binding.etDepth.doubleOrNull()
        val qty = binding.etQuantity.text?.toString()?.toIntOrNull() ?: 1

        if (span == null || width == null || depth == null) {
            toast(getString(R.string.error_fill_fields))
            return
        }

        val botDiam = binding.spinnerBottomBar.text.toString().replace(" mm", "").toIntOrNull() ?: 20
        val botCount = binding.etBottomCount.text?.toString()?.toIntOrNull() ?: 3
        val stirDiam = binding.spinnerStirrup.text.toString().replace(" mm", "").toIntOrNull() ?: 8
        val stirSpacing = binding.etStirrupSpacing.doubleOrNull() ?: 150.0

        viewModel.calculate(
            RCBeamEngine.Input(
                span = span, width = width, totalDepth = depth, quantity = qty,
                mainBottomBarDiam = botDiam, mainBottomBarCount = botCount,
                stirrupDiam = stirDiam, stirrupSpacing = stirSpacing
            )
        )
    }

    private fun showResults(r: RCBeamEngine.Result) {
        binding.cardResults.show()
        val rows = listOf(
            getString(R.string.concrete_volume_net) to "${fmt(r.concreteVolumeTotal)} م³",
            getString(R.string.concrete_volume_waste) to "${fmt(r.concreteVolumeWithWaste)} م³",
            getString(R.string.bottom_steel_weight) to "${fmt(r.bottomSteelWeight)} كجم",
            getString(R.string.stirrup_weight) to "${fmt(r.stirrupWeight)} كجم",
            getString(R.string.total_steel_weight) to "${fmt(r.totalSteelWeight)} كجم",
            getString(R.string.total_steel_tons) to "${fmt3(r.totalSteelTons)} طن",
            getString(R.string.stirrup_count) to "${r.stirrupCount} كانة"
        )
        binding.rvResults.adapter = ResultRowAdapter(rows)
    }

    private fun fmt(d: Double) = String.format("%.3f", d)
    private fun fmt3(d: Double) = String.format("%.4f", d)
}
