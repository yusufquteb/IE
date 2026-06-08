package com.my.iengineer1.ui.calculations.concrete

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.R
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.core.extensions.doubleOrNull
import com.my.iengineer1.core.extensions.show
import com.my.iengineer1.core.extensions.toast
import com.my.iengineer1.databinding.FragmentConcreteFootingBinding
import com.my.iengineer1.domain.engine.concrete.ConcreteFootingEngine
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ConcreteFootingFragment : BaseFragment<FragmentConcreteFootingBinding>() {

    private val viewModel: ConcreteFootingViewModel by viewModels()

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentConcreteFootingBinding.inflate(inflater, container, false)

    override fun setupViews() {
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }

        val concreteGrades = listOf("C20 (fc'=20 MPa)", "C25 (fc'=25 MPa)", "C30 (fc'=30 MPa)", "C35 (fc'=35 MPa)")
        val steelGrades = listOf("S280 (fy=280 MPa)", "S350 (fy=350 MPa)", "S420 (fy=420 MPa)", "S500 (fy=500 MPa)")

        binding.spinnerConcreteGrade.setAdapter(
            ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, concreteGrades)
        )
        binding.spinnerSteelGrade.setAdapter(
            ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, steelGrades)
        )
        binding.spinnerConcreteGrade.setText(concreteGrades[1], false)
        binding.spinnerSteelGrade.setText(steelGrades[2], false)

        binding.btnCalculate.setOnClickListener { calculate() }
        binding.btnExport.setOnClickListener { viewModel.exportToPdf(requireContext()) }
    }

    override fun observeViewModel() {
        viewModel.result.observe(viewLifecycleOwner) { result ->
            if (result != null) showResults(result)
        }
        viewModel.exportEvent.observe(viewLifecycleOwner) { path ->
            if (path != null) toast(getString(R.string.export_saved, path))
        }
    }

    private fun calculate() {
        val columnLoad = binding.etColumnLoad.doubleOrNull()
        val soilBearing = binding.etSoilBearing.doubleOrNull()

        if (columnLoad == null || soilBearing == null) {
            toast(getString(R.string.error_fill_fields))
            return
        }

        val fc = when (binding.spinnerConcreteGrade.text.toString().take(3)) {
            "C20" -> 20.0; "C25" -> 25.0; "C30" -> 30.0; else -> 35.0
        }
        val fy = when (binding.spinnerSteelGrade.text.toString().take(4)) {
            "S280" -> 280.0; "S350" -> 350.0; "S420" -> 420.0; else -> 500.0
        }

        viewModel.calculate(
            ConcreteFootingEngine.Input(
                columnLoad = columnLoad,
                soilBearingCapacity = soilBearing,
                concreteGrade = fc,
                steelGrade = fy
            )
        )
    }

    private fun showResults(result: ConcreteFootingEngine.Result) {
        binding.cardResults.show()

        val rows = listOf(
            getString(R.string.result_footing_size) to "${result.footingWidth} × ${result.footingLength} m",
            getString(R.string.result_footing_depth) to "${result.footingDepth} m",
            getString(R.string.result_steel_area) to "${String.format("%.1f", result.steelAreaX)} mm²/m",
            getString(R.string.result_bar_diameter) to "Ø${result.barDiameter} mm",
            getString(R.string.result_bar_spacing) to "${result.barSpacing.toInt()} mm",
            getString(R.string.result_bars_count) to "${result.barsCountX} × ${result.barsCountY}",
            getString(R.string.result_concrete_volume) to "${String.format("%.3f", result.concreteVolume)} m³",
            getString(R.string.result_steel_weight) to "${String.format("%.1f", result.steelWeight)} kg"
        )

        binding.rvResults.adapter = ResultRowAdapter(rows)
    }
}
