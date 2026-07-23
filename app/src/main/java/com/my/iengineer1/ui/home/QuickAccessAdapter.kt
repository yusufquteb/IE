package com.my.iengineer1.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.my.iengineer1.databinding.ItemQuickAccessBinding

class QuickAccessAdapter(
    private val items: List<QuickAccessItem>,
    private val onClick: (QuickAccessItem) -> Unit
) : RecyclerView.Adapter<QuickAccessAdapter.VH>() {

    inner class VH(private val binding: ItemQuickAccessBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: QuickAccessItem) {
            binding.tvTitle.setText(item.titleRes)
            binding.ivIcon.setImageResource(item.iconRes)
            binding.root.setOnClickListener { onClick(item) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VH(
        ItemQuickAccessBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(items[position])
    override fun getItemCount() = items.size
}
