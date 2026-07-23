package com.my.iengineer1.ui.calculations.sanitation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.R
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.core.extensions.doubleOrNull
import com.my.iengineer1.core.extensions.show
import com.my.iengineer1.core.extensions.toast
import com.my.iengineer1.databinding.FragmentSewerPipeBinding
import com.my.iengineer1.domain.engine.sanitation.SewerPipeEngine
import com.my.iengineer1.ui.calculations.ResultRowAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SewerPipeFragment : BaseFragment<FragmentSewerPipeBinding>() {

    private val viewModel: SewerPipeViewModel by viewModels()

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentSewerPipeBinding.inflate(inflater, container, false)

    override fun setupViews() {
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
        binding.btnCalculate.setOnClickListener { calculate() }
    }

    override fun observeViewModel() {
        viewModel.result.observe(viewLifecycleOwner) { result ->
            if (result != null) showResults(result)
        }
    }

    private fun calculate() {
        val length = binding.etPipeLength.doubleOrNull()
        val diameter = binding.etPipeDiameter.doubleOrNull()
        val slope = binding.etSlope.doubleOrNull()
        val excWidth = binding.etExcavationWidth.doubleOrNull()
        val excDepth = binding.etExcavationDepth.doubleOrNull()

        if (length == null || diameter == null || slope == null || excWidth == null || excDepth == null) {
            toast(getString(R.string.error_fill_fields))
            return
        }

        viewModel.calculate(
            SewerPipeEngine.Input(
                pipeLength = length,
                pipeDiameter = diameter,
                slope = slope / 1000.0,
                excavationWidth = excWidth,
                excavationDepth = excDepth
            )
        )
    }

    private fun showResults(result: SewerPipeEngine.Result) {
        binding.cardResults.show()

        val velocityStatus = if (result.isVelocityAdequate)
            getString(R.string.status_ok) else getString(R.string.status_warning)
        val slopeStatus = if (result.isSlopeAdequate)
            getString(R.string.status_ok) else getString(R.string.status_warning)

        val rows = listOf(
            getString(R.string.flow_velocity) to "${String.format("%.3f", result.flowVelocity)} m/s $velocityStatus",
            getString(R.string.flow_capacity) to "${String.format("%.4f", result.flowCapacity)} m³/s",
            getString(R.string.slope_status) to slopeStatus,
            getString(R.string.excavation_volume) to "${String.format("%.2f", result.excavationVolume)} m³",
            getString(R.string.pipe_volume) to "${String.format("%.3f", result.pipeVolume)} m³",
            getString(R.string.sand_bedding_volume) to "${String.format("%.2f", result.sandBeddingVolume)} m³",
            getString(R.string.backfill_volume) to "${String.format("%.2f", result.backfillVolume)} m³"
        )
        binding.rvResults.adapter = ResultRowAdapter(rows)
    }
}
