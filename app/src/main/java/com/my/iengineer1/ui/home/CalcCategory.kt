package com.my.iengineer1.ui.home

import androidx.annotation.DrawableRes
import com.my.iengineer1.R

data class CalcCategory(
    val id: String,
    val titleRes: Int,
    val subtitleRes: Int,
    @DrawableRes val iconRes: Int,
    val colorRes: Int
) {
    companion object {
        const val CONCRETE = "concrete"
        const val ROADS = "roads"
        const val SANITATION = "sanitation"
        const val STRUCTURAL = "structural"

        fun allCategories() = listOf(
            CalcCategory(CONCRETE, R.string.calc_concrete, R.string.calc_concrete_sub, R.drawable.ic_concrete, R.color.cat_concrete),
            CalcCategory(ROADS, R.string.calc_roads, R.string.calc_roads_sub, R.drawable.ic_roads, R.color.cat_roads),
            CalcCategory(SANITATION, R.string.calc_sanitation, R.string.calc_sanitation_sub, R.drawable.ic_sanitation, R.color.cat_sanitation),
            CalcCategory(STRUCTURAL, R.string.calc_structural, R.string.calc_structural_sub, R.drawable.ic_structural, R.color.cat_structural)
        )
    }
}
