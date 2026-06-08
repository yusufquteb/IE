package com.my.iengineer1.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.my.iengineer1.databinding.ItemCalcCategoryBinding

class CalcCategoryAdapter(
    private val items: List<CalcCategory>,
    private val onClick: (CalcCategory) -> Unit
) : RecyclerView.Adapter<CalcCategoryAdapter.VH>() {

    inner class VH(private val binding: ItemCalcCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: CalcCategory) {
            binding.tvTitle.setText(item.titleRes)
            binding.tvSubtitle.setText(item.subtitleRes)
            binding.ivIcon.setImageResource(item.iconRes)
            binding.root.setCardBackgroundColor(
                binding.root.context.getColor(item.colorRes)
            )
            binding.root.setOnClickListener { onClick(item) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VH(
        ItemCalcCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(items[position])
    override fun getItemCount() = items.size
}
