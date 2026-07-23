package com.my.iengineer1.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.navigation.fragment.findNavController
import com.my.iengineer1.R
import com.my.iengineer1.core.base.BaseFragment
import com.my.iengineer1.databinding.FragmentSearchBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding>() {

    private val catalog = SearchableItem.catalog()
    private lateinit var adapter: SearchAdapter

    override fun inflateBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentSearchBinding.inflate(inflater, container, false)

    override fun setupViews() {
        adapter = SearchAdapter(catalog) { item ->
            findNavController().navigate(item.navDestination)
        }
        binding.rvResults.adapter = adapter
        updateCount(catalog.size)

        binding.btnBack.setOnClickListener { findNavController().navigateUp() }

        binding.etSearch.addTextChangedListener { text ->
            val query = text?.toString().orEmpty()
            val filtered = catalog.filter { it.matchesQuery(query) }
            adapter.updateItems(filtered)
            updateCount(filtered.size)
        }

        binding.etSearch.requestFocus()
    }

    override fun observeViewModel() {}

    private fun updateCount(count: Int) {
        binding.tvResultsCount.text = getString(R.string.search_results_count, count)
    }
}
