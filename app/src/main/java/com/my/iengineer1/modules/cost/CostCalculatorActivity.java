package com.my.iengineer1.modules.cost;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.my.iengineer1.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Interactive cost calculator using standard Egyptian construction unit prices.
 * User enters quantities; totals auto-update in real time.
 */
public class CostCalculatorActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CostAdapter adapter;
    private TextView tvGrandTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost_calculator);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("حاسبة التكاليف");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        tvGrandTotal = findViewById(R.id.tv_grand_total);
        recyclerView = findViewById(R.id.rv_cost_items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new CostAdapter(buildDefaultItems(), this::onTotalChanged);
        recyclerView.setAdapter(adapter);
    }

    private void onTotalChanged() {
        double total = adapter.getGrandTotal();
        tvGrandTotal.setText(String.format("الإجمالي التقديري:  %.2f  جنيه", total));
    }

    private List<CostItem> buildDefaultItems() {
        List<CostItem> list = new ArrayList<>();
        // === الإنشاءات ===
        list.add(new CostItem("━━  الإنشاءات  ━━", "", 0, true));
        list.add(new CostItem("خرسانة عادية أساسات",        "م³",   1800));
        list.add(new CostItem("خرسانة مسلحة أعمدة وأسقف",  "م³",   3200));
        list.add(new CostItem("حديد تسليح (توريد وتركيب)",  "طن",  25000));
        list.add(new CostItem("قوالب خشبية",                "م²",    350));
        list.add(new CostItem("عزل رطوبة أساسات",          "م²",    180));
        // === البناء والمباني ===
        list.add(new CostItem("━━  المباني والبناء  ━━", "", 0, true));
        list.add(new CostItem("طوب أحمر 25×12×6",          "م³",    950));
        list.add(new CostItem("طوب أبيض طفلي",             "م²",    120));
        list.add(new CostItem("بياض داخلي (ناعم)",         "م²",     85));
        list.add(new CostItem("بياض خارجي (خشن)",          "م²",     75));
        list.add(new CostItem("دهان بلاستيك داخلي",         "م²",     65));
        list.add(new CostItem("دهان واجهات خارجي",          "م²",     95));
        list.add(new CostItem("بلاطات أرضية (فيونكا)",     "م²",    280));
        list.add(new CostItem("بلاط حوائط (تركيب)",        "م²",    200));
        // === الطرق ===
        list.add(new CostItem("━━  الطرق  ━━", "", 0, true));
        list.add(new CostItem("حفريات وردم",                "م³",    120));
        list.add(new CostItem("إساس جيري Sub-base",         "م³",    450));
        list.add(new CostItem("أساس حجري Base Course",      "م³",    600));
        list.add(new CostItem("أسفلت (خلطة ساخنة)",        "طن",   1800));
        list.add(new CostItem("خط فاصل بالطلاء",           "م.ط",    35));
        // === الصرف الصحي ===
        list.add(new CostItem("━━  الصرف الصحي  ━━", "", 0, true));
        list.add(new CostItem("أنبوب PVC قطر 200مم",       "م.ط",   185));
        list.add(new CostItem("أنبوب PVC قطر 300مم",       "م.ط",   320));
        list.add(new CostItem("حفر وردم خندق",             "م³",    135));
        list.add(new CostItem("غرفة تفتيش Q80",            "عدد",  4500));
        list.add(new CostItem("بلاعة أرضية مربعة",         "عدد",   850));
        return list;
    }

    @Override
    public boolean onSupportNavigateUp() { finish(); return true; }

    // ── Data Model ────────────────────────────────────────────────────────────
    public static class CostItem {
        String name;
        String unit;
        double unitPrice;
        double quantity;
        boolean isHeader;

        CostItem(String name, String unit, double unitPrice) {
            this(name, unit, unitPrice, false);
        }
        CostItem(String name, String unit, double unitPrice, boolean isHeader) {
            this.name      = name;
            this.unit      = unit;
            this.unitPrice = unitPrice;
            this.isHeader  = isHeader;
        }
        double total() { return quantity * unitPrice; }
    }

    // ── Adapter ───────────────────────────────────────────────────────────────
    static class CostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        interface TotalListener { void onChanged(); }

        private static final int TYPE_HEADER = 0;
        private static final int TYPE_ITEM   = 1;

        private final List<CostItem> data;
        private final TotalListener listener;

        CostAdapter(List<CostItem> data, TotalListener l) {
            this.data     = data;
            this.listener = l;
        }

        double getGrandTotal() {
            double t = 0;
            for (CostItem c : data) t += c.total();
            return t;
        }

        @Override public int getItemViewType(int pos) {
            return data.get(pos).isHeader ? TYPE_HEADER : TYPE_ITEM;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inf = LayoutInflater.from(parent.getContext());
            if (viewType == TYPE_HEADER) {
                return new HeaderVH(inf.inflate(R.layout.item_cost_header, parent, false));
            }
            return new ItemVH(inf.inflate(R.layout.item_cost, parent, false));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            CostItem item = data.get(position);
            if (holder instanceof HeaderVH) {
                ((HeaderVH) holder).tvTitle.setText(item.name);
            } else {
                ItemVH h = (ItemVH) holder;
                h.tvName.setText(item.name);
                h.tvUnit.setText(item.unit);
                h.tvUnitPrice.setText(String.format("%.0f", item.unitPrice));
                h.etQty.removeTextChangedListener(h.watcher);
                h.etQty.setText(item.quantity > 0 ? String.format("%.2f", item.quantity) : "");
                h.tvTotal.setText(item.quantity > 0 ? String.format("%.2f", item.total()) : "0.00");
                h.watcher = new TextWatcher() {
                    @Override public void beforeTextChanged(CharSequence s, int st, int c, int a) {}
                    @Override public void onTextChanged(CharSequence s, int st, int b, int c) {}
                    @Override public void afterTextChanged(Editable s) {
                        try { item.quantity = Double.parseDouble(s.toString()); }
                        catch (NumberFormatException e) { item.quantity = 0; }
                        h.tvTotal.setText(String.format("%.2f", item.total()));
                        listener.onChanged();
                    }
                };
                h.etQty.addTextChangedListener(h.watcher);
            }
        }

        @Override public int getItemCount() { return data.size(); }

        static class HeaderVH extends RecyclerView.ViewHolder {
            TextView tvTitle;
            HeaderVH(View v) { super(v); tvTitle = v.findViewById(R.id.tv_section_title); }
        }
        static class ItemVH extends RecyclerView.ViewHolder {
            TextView tvName, tvUnit, tvUnitPrice, tvTotal;
            TextInputEditText etQty;
            TextWatcher watcher;
            ItemVH(View v) {
                super(v);
                tvName      = v.findViewById(R.id.tv_cost_name);
                tvUnit      = v.findViewById(R.id.tv_cost_unit);
                tvUnitPrice = v.findViewById(R.id.tv_unit_price);
                tvTotal     = v.findViewById(R.id.tv_cost_total);
                etQty       = v.findViewById(R.id.et_quantity);
            }
        }
    }
}
