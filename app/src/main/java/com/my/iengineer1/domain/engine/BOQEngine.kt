package com.my.iengineer1.domain.engine

data class BOQItem(
    val itemNo: String,
    val description: String,
    val unit: String,
    val quantity: Double,
    val unitRate: Double = 0.0
) {
    val amount: Double get() = quantity * unitRate
}

data class BOQSection(
    val title: String,
    val items: List<BOQItem>
) {
    val subtotal: Double get() = items.sumOf { it.amount }
}

data class BOQSummary(
    val projectName: String,
    val sections: List<BOQSection>,
    val overheadPercent: Double = 10.0,
    val profitPercent: Double = 8.0,
    val vatPercent: Double = 15.0
) {
    val subtotal: Double get() = sections.sumOf { it.subtotal }
    val overhead: Double get() = subtotal * overheadPercent / 100.0
    val profit: Double get() = subtotal * profitPercent / 100.0
    val subtotalBeforeVat: Double get() = subtotal + overhead + profit
    val vat: Double get() = subtotalBeforeVat * vatPercent / 100.0
    val grandTotal: Double get() = subtotalBeforeVat + vat
}

object BOQEngine {

    fun buildConcreteSection(
        projectName: String,
        concreteVolM3: Double,
        steelWeightTon: Double,
        formworkAreaM2: Double,
        concreteRate: Double = 0.0,
        steelRate: Double = 0.0,
        formworkRate: Double = 0.0
    ): BOQSection {
        val items = mutableListOf<BOQItem>()

        if (concreteVolM3 > 0)
            items.add(BOQItem("1", "أعمال خرسانة مسلحة - صب وتشطيب", "م³", concreteVolM3, concreteRate))

        if (steelWeightTon > 0)
            items.add(BOQItem("2", "أعمال حديد التسليح - توريد وتركيب", "طن", steelWeightTon, steelRate))

        if (formworkAreaM2 > 0)
            items.add(BOQItem("3", "أعمال شدة خشبية (فورم)", "م²", formworkAreaM2, formworkRate))

        return BOQSection("أعمال الخرسانة المسلحة", items)
    }

    fun buildExcavationSection(
        excavVolM3: Double,
        backfillVolM3: Double,
        excavRate: Double = 0.0,
        backfillRate: Double = 0.0
    ): BOQSection {
        val items = buildList {
            if (excavVolM3 > 0)
                add(BOQItem("1", "أعمال حفر وإزالة", "م³", excavVolM3, excavRate))
            if (backfillVolM3 > 0)
                add(BOQItem("2", "أعمال ردم وتسوية", "م³", backfillVolM3, backfillRate))
        }
        return BOQSection("أعمال الحفر والردم", items)
    }

    fun buildAsphaltSection(
        wearingVolM3: Double,
        binderVolM3: Double,
        baseVolM3: Double,
        wearingRate: Double = 0.0,
        binderRate: Double = 0.0,
        baseRate: Double = 0.0
    ): BOQSection {
        val items = buildList {
            if (wearingVolM3 > 0)
                add(BOQItem("1", "طبقة رابط سطحي (Wearing Course)", "م³", wearingVolM3, wearingRate))
            if (binderVolM3 > 0)
                add(BOQItem("2", "طبقة رابط (Binder Course)", "م³", binderVolM3, binderRate))
            if (baseVolM3 > 0)
                add(BOQItem("3", "طبقة أساس حجري (Base Course)", "م³", baseVolM3, baseRate))
        }
        return BOQSection("أعمال الأسفلت", items)
    }

    fun buildSewerSection(
        pipeLength: Double,
        pipeDiameterMm: Double,
        excavVolM3: Double,
        beddingVolM3: Double,
        backfillVolM3: Double,
        manholeCount: Int = 0,
        pipeRate: Double = 0.0,
        excavRate: Double = 0.0,
        beddingRate: Double = 0.0,
        backfillRate: Double = 0.0,
        manholeRate: Double = 0.0
    ): BOQSection {
        val items = buildList {
            if (pipeLength > 0)
                add(BOQItem("1", "توريد وتركيب ماسورة قطر ${"%.0f".format(pipeDiameterMm)} مم", "م.ط", pipeLength, pipeRate))
            if (excavVolM3 > 0)
                add(BOQItem("2", "حفر خندق خط الصرف", "م³", excavVolM3, excavRate))
            if (beddingVolM3 > 0)
                add(BOQItem("3", "فرشة رمل تحت الماسورة", "م³", beddingVolM3, beddingRate))
            if (backfillVolM3 > 0)
                add(BOQItem("4", "ردم وتدك حول الماسورة", "م³", backfillVolM3, backfillRate))
            if (manholeCount > 0)
                add(BOQItem("5", "غرفة تفتيش خرسانية", "عدد", manholeCount.toDouble(), manholeRate))
        }
        return BOQSection("أعمال الصرف الصحي", items)
    }
}
