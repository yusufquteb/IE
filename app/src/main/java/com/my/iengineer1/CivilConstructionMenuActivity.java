package com.my.iengineer1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;
import java.util.Arrays;
import java.util.List;

public class CivilConstructionMenuActivity extends AppCompatActivity {

    private static final String[] TITLES = {
        "حصر كميات وخامات وتكلفة بند الحفر",
        "حصر كميات وخامات وتكلفة بند الأحلال",
        "مكونات وتكلفة الخرسانة",
        "حساب وزن الم.ط من حديد التسليح وحساب سعره",
        "حصر كميات وخامات وتكلفة بند القواعد العادية",
        "حصر كميات وخامات وتكلفة بند القواعد المسلحة",
        "حصر كميات وخامات وتكلفة بند السملات",
        "حصر كميات وخامات وتكلفة بند الأعمدة",
        "حصر كميات وخامات وتكلفة بند الكمرات",
        "حصر كميات وخامات وتكلفة بند الأسقف المصمتة",
        "حصر الكميات والخامات وحساب التكلفة للبلاطات الأرضية الخرسانية",
        "حصر كميات وحساب خامات وتكلفة بند الحوائط الخرسانية",
        "حصر كميات وحساب خامات وتكلفة بند المباني",
        "حصر كميات وحساب خامات وتكلفة بند البياض والمحارة",
        "حصر كميات وحساب خامات وتكلفة بند الدهانات"
    };

    private static final Class<?>[] TARGETS = {
        ToipccExcavationForBuildingsActivity.class,
        ToipccReplacementForBuildingsActivity.class,
        ToipccconcretematerialsActivity.class,
        ToipccSteelBarsWieghtAndPriceActivity.class,
        ToipccplainconcretefootingsActivity.class,
        ToipccreinforcedconcretefootingActivity.class,
        ToipccreinforcedconcretesmellsActivity.class,
        ToipccreinforcedconcretecolumnActivity.class,
        ToipccreinforcedconcretebeamsActivity.class,
        ToipccsolidslabsActivity.class,
        ToipccslabongrideActivity.class,
        ToipccConcreteWallActivity.class,
        ToipccBrickWorkActivity.class,
        ToipccPlasteringActivity.class,
        ToipccPaintActivity.class
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.civil_menu);
        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("المكتب الفني - الإنشاءات");
        toolbar.setNavigationOnClickListener(v -> finish());
        RecyclerView recycler = findViewById(R.id.recycler_menu);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new MenuAdapter());
    }

    private class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.VH> {
        @NonNull @Override
        public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.civil_menu_item, parent, false);
            return new VH(v);
        }
        @Override
        public void onBindViewHolder(@NonNull VH holder, int pos) {
            holder.title.setText(TITLES[pos]);
            holder.card.setOnClickListener(v -> startActivity(new Intent(CivilConstructionMenuActivity.this, TARGETS[pos])));
        }
        @Override public int getItemCount() { return TITLES.length; }
        class VH extends RecyclerView.ViewHolder {
            TextView title; MaterialCardView card;
            VH(View v) { super(v); title = v.findViewById(R.id.item_title); card = v.findViewById(R.id.card_item); }
        }
    }
}
