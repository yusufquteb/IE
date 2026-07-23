package com.my.iengineer1.ui.calculations

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.my.iengineer1.databinding.ItemResultRowBinding

class ResultRowAdapter(
    private val rows: List<Pair<String, String>>
) : RecyclerView.Adapter<ResultRowAdapter.VH>() {

    inner class VH(private val binding: ItemResultRowBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(row: Pair<String, String>) {
            binding.tvLabel.text = row.first
            binding.tvValue.text = row.second
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VH(
        ItemResultRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(rows[position])
    override fun getItemCount() = rows.size
}
