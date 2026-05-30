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

public class CivilRoadsMenuActivity extends AppCompatActivity {

    private static final String[] TITLES = {
        "حساب مساحة وحجم وتكلفة الحفر لقطاع تنفيذي للطرق",
        "حساب مساحة وحجم وتكلفة الأحلال لقطاع تنفيذي لطبقة طرق",
        "حساب مساحة وحجم وتكلفة طبقة الأساس لقطاع تنفيذي لطبقة طرق",
        "حصر وحساب تكلفة بند الكشط",
        "حصر الخامات وحساب التكلفة ومتابعة الرصيد المخزني لخلاطة أسفلت",
        "حصر وحساب تكلفة طبقة التشريب M.C.O",
        "حصر وحساب تكلفة طبقة الأسفلت الرابطة",
        "حصر وحساب تكلفة طبقة اللصق R.C",
        "حصر وحساب تكلفة طبقة الأسفلت السطحية"
    };

    private static final Class<?>[] TARGETS = {
        ToipccExcavationForRoadActivity.class,
        ToipccReplacementLayerForRoadActivity.class,
        ToipccBaseCourseLayersForRoadActivity.class,
        ToipccAsphaltRoadMillingMachineActivity.class,
        ToipccAsphaltMaterialActivity.class,
        ToipccMcoLayerActivity.class,
        ToipccBinderAsphaltLayersActivity.class,
        ToipccRcActivity.class,
        ToipccWearingSerfaceAsphaltLayersActivity.class
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.civil_menu);
        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("المكتب الفني - الطرق");
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
            holder.card.setOnClickListener(v -> startActivity(new Intent(CivilRoadsMenuActivity.this, TARGETS[pos])));
        }
        @Override public int getItemCount() { return TITLES.length; }
        class VH extends RecyclerView.ViewHolder {
            TextView title; MaterialCardView card;
            VH(View v) { super(v); title = v.findViewById(R.id.item_title); card = v.findViewById(R.id.card_item); }
        }
    }
}
