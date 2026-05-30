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

public class CivilSewageMenuActivity extends AppCompatActivity {

    private static final String[] TITLES = {
        "حساب الطول الفعلي لمواسير فرعة شامل الهالك والتداخل وخلافه",
        "حساب عمق وميل فرعة ومقارنته بالميل المكتوب علي اللوحة",
        "حساب منسوب دخول فرعة علي مطبق مصب (منسوب نهاية الفرعة)",
        "حساب منسوب خروج فرعة من مطبق بداية الفرعة (منسوب بداية الفرعة)",
        "دراسة سرعة السريان بمواسير الانحدار",
        "عمل Check علي ضغط وقطر خط الطرد",
        "حساب كمية الخرسانة بالمطبق",
        "دراسات أسعار خطوط الانحدار (بلاستيك UPVC)",
        "دراسات أسعار خطوط الطرد (بولي إيثلين أملس HDPE)",
        "دراسة سعر أي بند باستخدام القائمة الاسترشادية",
        "دراسة أسعار بنود التجفيف المختلفة",
        "تحليل سعر لبند مصنعية عمل تحويلات"
    };

    private static final Class<?>[] TARGETS = {
        ToipPipeLineLengthDifferenceActivity.class,
        ToipDrainagePipeLineDepthActivity.class,
        ToipDrainagePipeLineSlopesActivity.class,
        ToipDrainagePipeLineSlopessActivity.class,
        ToipSewageVilocityChecksActivity.class,
        ToipForceMainCheckDesignActivity.class,
        ToipqcManholeConcreteActivity.class,
        ToipccDrainagePipeLinePriceStudyActivity.class,
        ToipccEjectionLinePriceAndStudyActivity.class,
        ToipccSewageStudyPricesActivity.class,
        ToipccDewateringPricessActivity.class,
        ToipApplyCostOfPipeLineExchangesActivity.class
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.civil_menu);
        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("المكتب الفني - الصرف الصحي");
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
            holder.card.setOnClickListener(v -> startActivity(new Intent(CivilSewageMenuActivity.this, TARGETS[pos])));
        }
        @Override public int getItemCount() { return TITLES.length; }
        class VH extends RecyclerView.ViewHolder {
            TextView title; MaterialCardView card;
            VH(View v) { super(v); title = v.findViewById(R.id.item_title); card = v.findViewById(R.id.card_item); }
        }
    }
}
