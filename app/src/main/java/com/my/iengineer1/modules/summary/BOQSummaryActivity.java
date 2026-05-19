package com.my.iengineer1.modules.summary;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.my.iengineer1.R;
import com.my.iengineer1.SketchApplication;
import com.my.iengineer1.db.AppDatabase;
import com.my.iengineer1.db.entity.Project;
import com.my.iengineer1.db.entity.QuantityItem;
import com.my.iengineer1.export.PdfExportUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Phase 4 — BOQ Summary Screen.
 * Shows all quantity items for a project with a pie chart breakdown by section,
 * a detailed item table, and cost totals.
 */
public class BOQSummaryActivity extends AppCompatActivity {

    private static final int[] SECTION_COLORS = {
            0xFF6F453B, 0xFF3A6B8E, 0xFF4A7C59, 0xFF8E6B3A, 0xFF6B3A8E
    };

    private long projectId;
    private Project project;
    private List<QuantityItem> items = new ArrayList<>();

    private PieChart pieChart;
    private TextView tvProjectName, tvTotalCost, tvItemCount;
    private RecyclerView rvItems;
    private BOQAdapter adapter;

    private AppDatabase db;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boq_summary);

        projectId = getIntent().getLongExtra("project_id", -1);

        db = SketchApplication.getDatabase();
        setupToolbar();
        initViews();
        loadData();
    }

    private void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("ملخص الحصر");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void initViews() {
        tvProjectName = findViewById(R.id.tv_summary_project_name);
        tvTotalCost   = findViewById(R.id.tv_summary_total_cost);
        tvItemCount   = findViewById(R.id.tv_summary_item_count);
        pieChart      = findViewById(R.id.pie_chart);
        rvItems       = findViewById(R.id.rv_boq_items);

        adapter = new BOQAdapter();
        rvItems.setAdapter(adapter);
        rvItems.setLayoutManager(new LinearLayoutManager(this));
        rvItems.setNestedScrollingEnabled(false);

        setupPieChart();
    }

    private void setupPieChart() {
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.TRANSPARENT);
        pieChart.setHoleRadius(48f);
        pieChart.setTransparentCircleRadius(52f);
        pieChart.setDrawCenterText(true);
        pieChart.setCenterTextSize(13f);
        pieChart.setCenterText("التوزيع\nبالقطاع");
        pieChart.getLegend().setEnabled(true);
        pieChart.getLegend().setWordWrapEnabled(true);
        pieChart.setRotationEnabled(true);
        pieChart.setHighlightPerTapEnabled(true);
    }

    private void loadData() {
        executor.execute(() -> {
            project = db.projectDao().getById(projectId);
            items   = db.quantityItemDao().getByProjectSync(projectId);
            runOnUiThread(this::updateUI);
        });
    }

    private void updateUI() {
        if (project != null) {
            tvProjectName.setText(project.name);
        }
        tvItemCount.setText(items.size() + " بند");

        double grandTotal = 0;
        for (QuantityItem it : items) grandTotal += it.calcTotal();
        tvTotalCost.setText(String.format(Locale.US, "%.2f  جنيه", grandTotal));

        adapter.setData(items);
        updatePieChart(items);
    }

    private void updatePieChart(List<QuantityItem> items) {
        // Group total cost by section
        Map<String, Double> sectionTotals = new LinkedHashMap<>();
        Map<String, String> sectionLabels = new LinkedHashMap<>();
        sectionLabels.put("concrete",    "خرسانة");
        sectionLabels.put("steel",       "حديد");
        sectionLabels.put("masonry",     "بناء");
        sectionLabels.put("finishes",    "تشطيبات");
        sectionLabels.put("road",        "طرق");
        sectionLabels.put("sanitation",  "صرف صحي");
        sectionLabels.put("other",       "أخرى");

        for (QuantityItem it : items) {
            String sec = it.section != null ? it.section : "other";
            sectionTotals.merge(sec, it.totalPrice, Double::sum);
        }
        if (sectionTotals.isEmpty()) return;

        List<PieEntry> entries = new ArrayList<>();
        int colorIdx = 0;
        List<Integer> colors = new ArrayList<>();
        for (Map.Entry<String, Double> e : sectionTotals.entrySet()) {
            if (e.getValue() > 0) {
                String label = sectionLabels.containsKey(e.getKey())
                        ? sectionLabels.get(e.getKey()) : e.getKey();
                entries.add(new PieEntry(e.getValue().floatValue(), label));
                colors.add(SECTION_COLORS[colorIdx % SECTION_COLORS.length]);
                colorIdx++;
            }
        }

        PieDataSet dataSet = new PieDataSet(entries, "");
        dataSet.setColors(colors);
        dataSet.setValueFormatter(new PercentFormatter(pieChart));
        dataSet.setValueTextSize(11f);
        dataSet.setValueTextColor(Color.WHITE);
        dataSet.setSliceSpace(2f);

        pieChart.setData(new PieData(dataSet));
        pieChart.invalidate();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.project_detail_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_export_pdf) {
            exportPdf();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void exportPdf() {
        if (project == null) return;
        executor.execute(() -> {
            String path = PdfExportUtil.exportProject(this, project, items);
            runOnUiThread(() -> {
                if (path != null) PdfExportUtil.openPdf(this, path);
            });
        });
    }

    @Override public boolean onSupportNavigateUp() { finish(); return true; }

    @Override protected void onDestroy() { super.onDestroy(); executor.shutdown(); }

    // ── Adapter ───────────────────────────────────────────────────────────────

    static class BOQAdapter extends RecyclerView.Adapter<BOQAdapter.VH> {

        private List<QuantityItem> data = new ArrayList<>();

        void setData(List<QuantityItem> list) {
            data = list;
            notifyDataSetChanged();
        }

        @NonNull @Override
        public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_boq_summary_row, parent, false);
            return new VH(v);
        }

        @Override
        public void onBindViewHolder(@NonNull VH h, int pos) {
            QuantityItem it = data.get(pos);
            h.tvNo.setText(it.itemNo != null ? it.itemNo : String.valueOf(pos + 1));
            h.tvDesc.setText(it.description);
            h.tvUnit.setText(it.unit);
            h.tvQty.setText(String.format(Locale.US, "%.3f", it.quantity));
            h.tvPrice.setText(String.format(Locale.US, "%.0f", it.unitPrice));
            h.tvTotal.setText(String.format(Locale.US, "%.2f", it.calcTotal()));
            // Alternate row background
            h.itemView.setBackgroundColor(pos % 2 == 0
                    ? Color.parseColor("#08000000") : Color.TRANSPARENT);
        }

        @Override public int getItemCount() { return data.size(); }

        static class VH extends RecyclerView.ViewHolder {
            TextView tvNo, tvDesc, tvUnit, tvQty, tvPrice, tvTotal;
            VH(View v) {
                super(v);
                tvNo    = v.findViewById(R.id.tv_row_no);
                tvDesc  = v.findViewById(R.id.tv_row_desc);
                tvUnit  = v.findViewById(R.id.tv_row_unit);
                tvQty   = v.findViewById(R.id.tv_row_qty);
                tvPrice = v.findViewById(R.id.tv_row_price);
                tvTotal = v.findViewById(R.id.tv_row_total);
            }
        }
    }
}
