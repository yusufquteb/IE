package com.my.iengineer1.ui.boq

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.my.iengineer1.databinding.ItemBoqSectionBinding
import com.my.iengineer1.domain.engine.BOQSection

class BOQSectionAdapter(
    private val sections: List<BOQSection>
) : RecyclerView.Adapter<BOQSectionAdapter.VH>() {

    inner class VH(private val binding: ItemBoqSectionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(section: BOQSection) {
            binding.tvSectionTitle.text = section.title
            binding.tvSectionSubtotal.text = if (section.subtotal > 0)
                String.format("%.2f", section.subtotal)
            else ""

            binding.rvSectionItems.layoutManager = LinearLayoutManager(binding.root.context)
            binding.rvSectionItems.adapter = BOQItemAdapter(section.items)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VH(
        ItemBoqSectionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(sections[position])
    override fun getItemCount() = sections.size
}
