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

public class CivilExecutionInfraMenuActivity extends AppCompatActivity {

    private static final String[] TITLES = {
        "استلام قاع الحفر لفرعة (بمعلومية المنسوب والميل التصميمي)",
        "استلام قاع الحفر لفرعة (بمعلومية منسوبي البداية والنهاية)",
        "استلام طبقة الأحلال أسفل المواسير (بمعلومية المنسوب والميل التصميمي)",
        "استلام طبقة الأحلال أسفل المواسير (بمعلومية منسوبي البداية والنهاية)",
        "استلام منسوب ظهر المواسير (بمعلومية المنسوب والميل التصميمي)",
        "استلام منسوب ظهر المواسير (بمعلومية منسوبي البداية والنهاية)",
        "استلام طبقة التغليف أعلي المواسير (بمعلومية المنسوب والميل التصميمي)",
        "استلام طبقة التغليف أعلي المواسير (بمعلومية منسوبي البداية والنهاية)"
    };

    private static final Class<?>[] TARGETS = {
        EipCheckSewageLinesExcavationActivity.class,
        EipCheckSewageLinesExcavationssActivity.class,
        EipCheckSewageLinesReplacementsActivity.class,
        EipCheckSewageLinesReplacementssActivity.class,
        EipCheckSewagePipeLinesLevelsActivity.class,
        EipCheckSewagePipeLinesLevelssActivity.class,
        EipCheckSewageLinesEncasementsActivity.class,
        EipCheckSewageLinesEncasementssActivity.class
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.civil_menu);
        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("التنفيذ - البنية التحتية");
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
            holder.card.setOnClickListener(v -> startActivity(new Intent(CivilExecutionInfraMenuActivity.this, TARGETS[pos])));
        }
        @Override public int getItemCount() { return TITLES.length; }
        class VH extends RecyclerView.ViewHolder {
            TextView title; MaterialCardView card;
            VH(View v) { super(v); title = v.findViewById(R.id.item_title); card = v.findViewById(R.id.card_item); }
        }
    }
}
