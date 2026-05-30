package com.my.iengineer1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.my.iengineer1.camera.CameraMeasureActivity;
import com.my.iengineer1.modules.roads.RoadsActivity;
import com.my.iengineer1.modules.sanitation.SanitationActivity;
import com.my.iengineer1.modules.cost.CostCalculatorActivity;
import com.my.iengineer1.modules.converter.UnitConverterActivity;
import java.util.ArrayList;
import java.util.List;

public class HomeListFragmentActivity extends Fragment {

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM   = 1;

    private final List<Row> rows = new ArrayList<>();

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_list_fragment, container, false);
        buildRows();
        RecyclerView rv = view.findViewById(R.id.recyclerview1);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.setAdapter(new HomeAdapter());
        return view;
    }

    private void buildRows() {
        rows.add(header("الحصر الهندسي"));
        rows.add(item("الإنشاءات - خرسانة وحديد",        "حساب كميات الخرسانة والحديد",                  TabLayoutActivity.class,                    "all_dirty_work"));
        rows.add(item("التشطيبات والبناء",                 "حصر أعمال البياض والبلاط",                      TabLayoutActivity.class,                    "finishes"));
        rows.add(item("الطرق والأسفلت",                   "حصر طبقات الطريق والحفريات",                    RoadsActivity.class,                         null));
        rows.add(item("الصرف الصحي",                      "حصر خطوط الصرف وغرف التفتيش",                  SanitationActivity.class,                    null));
        rows.add(header("المكتب الفني للإنشاءات"));
        rows.add(item("حصر الإنشاءات",                    "15 بند: حفر، خرسانة، قواعد، أعمدة، كمرات...",  CivilConstructionMenuActivity.class,         null));
        rows.add(item("حصر الطرق",                        "9 بنود: طبقات الطريق والأسفلت والكشط",          CivilRoadsMenuActivity.class,                null));
        rows.add(item("حصر الصرف الصحي",                  "12 بند: مواسير، مطابق، سرعات، دراسات أسعار",   CivilSewageMenuActivity.class,               null));
        rows.add(header("قسم التنفيذ الميداني"));
        rows.add(item("التنفيذ - الإنشاءات",              "استلام بنود الحفر والأحلال والقواعد",           CivilExecutionConstructionMenuActivity.class, null));
        rows.add(item("التنفيذ - البنية التحتية",         "استلام تركيب مواسير الصرف والمياه",             CivilExecutionInfraMenuActivity.class,       null));
        rows.add(header("التصميم الإنشائي"));
        rows.add(item("تصميم القواعد المنعزلة",           "تصميم قاعدة تحت حمل رأسي أو مع عزوم",          CivilDesignMenuActivity.class,               null));
        rows.add(header("الأدوات"));
        rows.add(item("القياس بالكاميرا",                 "قياس وعد العناصر بالكاميرا",                    CameraMeasureActivity.class,                 null));
        rows.add(item("حاسبة التكاليف",                   "تقدير تكلفة المشروع بأسعار السوق",              CostCalculatorActivity.class,                null));
        rows.add(item("محوّل الوحدات",                    "تحويل وحدات الطول والمساحة والحجم والوزن",      UnitConverterActivity.class,                 null));
    }

    private static Row header(String title) { return new Row(title, null, null, null); }
    private static Row item(String title, String subtitle, Class<?> target, String key) {
        return new Row(title, subtitle, target, key);
    }

    private class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        @Override
        public int getItemViewType(int position) {
            return rows.get(position).target == null && rows.get(position).subtitle == null ? TYPE_HEADER : TYPE_ITEM;
        }

        @NonNull @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inf = LayoutInflater.from(parent.getContext());
            if (viewType == TYPE_HEADER) {
                View v = inf.inflate(R.layout.home_section_header, parent, false);
                return new HeaderVH(v);
            }
            View v = inf.inflate(R.layout.home_list_cust, parent, false);
            return new ItemVH(v);
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            Row row = rows.get(position);
            if (holder instanceof HeaderVH) {
                ((HeaderVH) holder).title.setText(row.title);
                return;
            }
            ItemVH vh = (ItemVH) holder;
            vh.title.setText(row.title);
            if (row.subtitle != null) {
                vh.subtitle.setText(row.subtitle);
                vh.subtitle.setVisibility(View.VISIBLE);
            } else {
                vh.subtitle.setVisibility(View.GONE);
            }
            if (row.target != null) {
                vh.card.setOnClickListener(v -> {
                    Intent nav = new Intent(getActivity(), row.target);
                    if (row.key != null) nav.putExtra("key", row.key);
                    startActivity(nav);
                });
                vh.card.setAlpha(1.0f);
            } else {
                vh.card.setOnClickListener(null);
                vh.card.setAlpha(0.55f);
            }
        }

        @Override public int getItemCount() { return rows.size(); }

        class HeaderVH extends RecyclerView.ViewHolder {
            TextView title;
            HeaderVH(View v) { super(v); title = v.findViewById(R.id.header_title); }
        }

        class ItemVH extends RecyclerView.ViewHolder {
            TextView title, subtitle;
            com.google.android.material.card.MaterialCardView card;
            ItemVH(View v) {
                super(v);
                title    = v.findViewById(R.id.textview1);
                subtitle = v.findViewById(R.id.textview_subtitle);
                card     = v.findViewById(R.id.cardview2);
            }
        }
    }

    private static class Row {
        final String title, subtitle, key;
        final Class<?> target;
        Row(String title, String subtitle, Class<?> target, String key) {
            this.title    = title;
            this.subtitle = subtitle;
            this.target   = target;
            this.key      = key;
        }
    }
}
