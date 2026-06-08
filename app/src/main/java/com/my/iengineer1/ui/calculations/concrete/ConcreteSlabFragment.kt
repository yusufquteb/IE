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
import com.my.iengineer1.databinding.FragmentConcreteSlabBinding
import com.my.iengineer1.domain.engine.concrete.ConcreteSlabEngine
import com.my.iengineer1.ui.calculations.ResultRowAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ConcreteSlabFragment : BaseFragment<FragmentConcreteSlabBinding>() {

    private val viewModel: ConcreteSlabViewModel by viewModels()

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentConcreteSlabBinding.inflate(inflater, container, false)

    override fun setupViews() {
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }

        val barDiams = listOf("8 mm", "10 mm", "12 mm", "14 mm", "16 mm")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, barDiams)
        binding.spinnerBarDiam.setAdapter(adapter)
        binding.spinnerBarDiam.setText("12 mm", false)

        binding.btnCalculate.setOnClickListener { calculate() }
    }

    override fun observeViewModel() {
        viewModel.result.observe(viewLifecycleOwner) { result ->
            if (result != null) showResults(result)
        }
    }

    private fun calculate() {
        val length = binding.etLength.doubleOrNull()
        val width = binding.etWidth.doubleOrNull()
        val thickness = binding.etThickness.doubleOrNull()
        val qty = binding.etQuantity.text?.toString()?.toIntOrNull() ?: 1
        val spacing = binding.etBarSpacing.doubleOrNull() ?: 200.0
        val waste = binding.etWaste.doubleOrNull() ?: 5.0

        if (length == null || width == null || thickness == null) {
            toast(getString(R.string.error_fill_fields))
            return
        }

        val barDiam = binding.spinnerBarDiam.text.toString().replace(" mm", "").toIntOrNull() ?: 12

        viewModel.calculate(
            ConcreteSlabEngine.Input(
                length = length,
                width = width,
                thickness = thickness,
                quantity = qty,
                bottomBarDiam = barDiam,
                bottomBarSpacing = spacing,
                wastePercent = waste
            )
        )
    }

    private fun showResults(r: ConcreteSlabEngine.Result) {
        binding.cardResults.show()
        val rows = listOf(
            getString(R.string.slab_area) to "${String.format("%.2f", r.slabArea)} م²",
            getString(R.string.concrete_volume_net) to "${String.format("%.3f", r.concreteVolumeTotal)} م³",
            getString(R.string.concrete_volume_waste) to "${String.format("%.3f", r.concreteVolumeWithWaste)} م³",
            getString(R.string.bottom_mesh_weight) to "${String.format("%.2f", r.bottomMeshWeight)} كجم",
            getString(R.string.top_bars_weight) to "${String.format("%.2f", r.topBarsWeight)} كجم",
            getString(R.string.total_steel_weight) to "${String.format("%.2f", r.totalSteelWeight)} كجم",
            getString(R.string.total_steel_tons) to "${String.format("%.4f", r.totalSteelTons)} طن",
            getString(R.string.steel_ratio) to "${String.format("%.1f", r.steelRatioKgPerM3)} كجم/م³"
        )
        binding.rvResults.adapter = ResultRowAdapter(rows)
    }
}
