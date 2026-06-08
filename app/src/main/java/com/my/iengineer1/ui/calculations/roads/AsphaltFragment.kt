package com.my.iengineer1.ui.calculations.roads

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.R
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.core.extensions.doubleOrNull
import com.my.iengineer1.core.extensions.show
import com.my.iengineer1.core.extensions.toast
import com.my.iengineer1.databinding.FragmentAsphaltBinding
import com.my.iengineer1.domain.engine.roads.AsphaltLayersEngine
import com.my.iengineer1.ui.calculations.ResultRowAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AsphaltFragment : BaseFragment<FragmentAsphaltBinding>() {

    private val viewModel: AsphaltViewModel by viewModels()

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentAsphaltBinding.inflate(inflater, container, false)

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
        val length = binding.etRoadLength.doubleOrNull()
        val width = binding.etRoadWidth.doubleOrNull()
        val wearing = binding.etWearingThickness.doubleOrNull()
        val binder = binding.etBinderThickness.doubleOrNull()
        val base = binding.etBaseThickness.doubleOrNull()

        if (length == null || width == null || wearing == null || binder == null || base == null) {
            toast(getString(R.string.error_fill_fields))
            return
        }

        viewModel.calculate(
            AsphaltLayersEngine.Input(
                roadLength = length,
                roadWidth = width,
                wearingCourseThickness = wearing,
                binderCourseThickness = binder,
                baseCourseThickness = base
            )
        )
    }

    private fun showResults(result: AsphaltLayersEngine.Result) {
        binding.cardResults.show()
        val rows = listOf(
            getString(R.string.road_area) to "${String.format("%.1f", result.roadArea)} m²",
            getString(R.string.wearing_volume) to "${String.format("%.3f", result.wearingCourse.volumeM3)} m³",
            getString(R.string.wearing_weight) to "${String.format("%.2f", result.wearingCourse.weightTon)} ton",
            getString(R.string.binder_volume) to "${String.format("%.3f", result.binderCourse.volumeM3)} m³",
            getString(R.string.binder_weight) to "${String.format("%.2f", result.binderCourse.weightTon)} ton",
            getString(R.string.base_volume) to "${String.format("%.3f", result.baseCourse.volumeM3)} m³",
            getString(R.string.total_asphalt_weight) to "${String.format("%.2f", result.totalAsphaltWeight)} ton"
        )
        binding.rvResults.adapter = ResultRowAdapter(rows)
    }
}
