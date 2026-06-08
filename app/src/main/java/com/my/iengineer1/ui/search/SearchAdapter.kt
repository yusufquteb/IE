package com.my.iengineer1.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.my.iengineer1.databinding.ItemSearchBinding

class SearchAdapter(
    private var items: List<SearchableItem>,
    private val onClick: (SearchableItem) -> Unit
) : RecyclerView.Adapter<SearchAdapter.VH>() {

    inner class VH(private val binding: ItemSearchBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: SearchableItem) {
            binding.tvTitle.text = item.title
            binding.tvCategory.text = item.category
            binding.ivIcon.setImageResource(item.iconRes)
            binding.root.setOnClickListener { onClick(item) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VH(
        ItemSearchBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(items[position])
    override fun getItemCount() = items.size

    fun updateItems(newItems: List<SearchableItem>) {
        items = newItems
        notifyDataSetChanged()
    }
}
