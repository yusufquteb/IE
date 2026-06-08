package com.my.iengineer1.ui.boq

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.databinding.FragmentBoqSummaryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BOQSummaryFragment : BaseFragment<FragmentBoqSummaryBinding>() {

    private val viewModel: BOQSummaryViewModel by viewModels()

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentBoqSummaryBinding.inflate(inflater, container, false)

    override fun setupViews() {
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
        binding.btnExportPdf.setOnClickListener { /* TODO: wire PDF export */ }

        // Load sample for demonstration
        viewModel.loadSampleBOQ()
    }

    override fun observeViewModel() {
        viewModel.sections.observe(viewLifecycleOwner) { sections ->
            binding.rvBoq.adapter = BOQSectionAdapter(sections)
        }

        viewModel.summary.observe(viewLifecycleOwner) { summary ->
            if (summary != null) {
                binding.tvSubtotal.text = String.format("%.2f", summary.subtotal)
                binding.tvOverhead.text = String.format("%.2f", summary.overhead)
                binding.tvVat.text = String.format("%.2f", summary.vat)
                binding.tvGrandTotal.text = String.format("%.2f", summary.grandTotal)
            }
        }
    }
}
