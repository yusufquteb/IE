package com.my.iengineer1.ui.boq

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.my.iengineer1.databinding.ItemBoqRowBinding
import com.my.iengineer1.domain.engine.BOQItem

class BOQItemAdapter(
    private val items: List<BOQItem>
) : RecyclerView.Adapter<BOQItemAdapter.VH>() {

    inner class VH(private val binding: ItemBoqRowBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: BOQItem) {
            binding.tvBoqNo.text = item.itemNo
            binding.tvBoqDesc.text = item.description
            binding.tvBoqUnit.text = item.unit
            binding.tvBoqQty.text = String.format("%.3f", item.quantity)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VH(
        ItemBoqRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(items[position])
    override fun getItemCount() = items.size
}
