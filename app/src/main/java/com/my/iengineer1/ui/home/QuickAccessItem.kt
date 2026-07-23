package com.my.iengineer1.ui.home

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.my.iengineer1.R

data class QuickAccessItem(
    @StringRes val titleRes: Int,
    @DrawableRes val iconRes: Int,
    val destination: Int
) {
    companion object {
        fun defaultItems() = listOf(
            QuickAccessItem(R.string.calc_concrete_footing, R.drawable.ic_concrete, R.id.concreteFootingFragment),
            QuickAccessItem(R.string.calc_asphalt, R.drawable.ic_roads, R.id.asphaltFragment),
            QuickAccessItem(R.string.calc_sewer_pipe, R.drawable.ic_sanitation, R.id.sewerPipeFragment)
        )
    }
}
