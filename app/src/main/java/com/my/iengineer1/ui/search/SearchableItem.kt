package com.my.iengineer1.ui.search

import androidx.annotation.DrawableRes
import com.my.iengineer1.R

data class SearchableItem(
    val id: String,
    val title: String,
    val category: String,
    @DrawableRes val iconRes: Int,
    val navDestination: Int
) {
    fun matchesQuery(query: String): Boolean {
        val q = query.trim().lowercase()
        return q.isEmpty() || title.lowercase().contains(q) || category.lowercase().contains(q)
    }

    companion object {
        fun catalog() = listOf(
            SearchableItem(
                id = "concrete_footing",
                title = "أساس خرسانة مسلحة",
                category = "الخرسانة المسلحة",
                iconRes = R.drawable.ic_concrete,
                navDestination = R.id.concreteFootingFragment
            ),
            SearchableItem(
                id = "rc_column",
                title = "عمود خرسانة مسلحة",
                category = "الخرسانة المسلحة",
                iconRes = R.drawable.ic_concrete,
                navDestination = R.id.rcColumnFragment
            ),
            SearchableItem(
                id = "rc_beam",
                title = "عتبة (بيم) خرسانة مسلحة",
                category = "الخرسانة المسلحة",
                iconRes = R.drawable.ic_concrete,
                navDestination = R.id.rcBeamFragment
            ),
            SearchableItem(
                id = "concrete_slab",
                title = "بلاطة خرسانة مسلحة",
                category = "الخرسانة المسلحة",
                iconRes = R.drawable.ic_concrete,
                navDestination = R.id.concreteSlabFragment
            ),
            SearchableItem(
                id = "asphalt",
                title = "حساب طبقات الأسفلت",
                category = "الطرق والأسفلت",
                iconRes = R.drawable.ic_roads,
                navDestination = R.id.asphaltFragment
            ),
            SearchableItem(
                id = "sewer_pipe",
                title = "حساب خط صرف صحي",
                category = "الصرف الصحي",
                iconRes = R.drawable.ic_sanitation,
                navDestination = R.id.sewerPipeFragment
            )
        )
    }
}
