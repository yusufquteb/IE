package com.my.iengineer1.modules.projects;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.my.iengineer1.R;
import com.my.iengineer1.SketchApplication;
import com.my.iengineer1.db.AppDatabase;
import com.my.iengineer1.db.entity.Project;
import com.my.iengineer1.db.entity.QuantityItem;
import com.my.iengineer1.export.PdfExportUtil;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProjectDetailActivity extends AppCompatActivity {

    private long projectId;
    private Project project;
    private AppDatabase db;
    private ExecutorService executor = Executors.newSingleThreadExecutor();
    private ItemAdapter adapter;
    private TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_detail);

        projectId = getIntent().getLongExtra("project_id", -1);
        String projectName = getIntent().getStringExtra("project_name");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(projectName != null ? projectName : "تفاصيل المشروع");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        db = SketchApplication.getDatabase();
        tvTotal = findViewById(R.id.tv_grand_total);
        RecyclerView rv = findViewById(R.id.rv_items);
        FloatingActionButton fab = findViewById(R.id.fab_add_item);

        adapter = new ItemAdapter();
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));

        db.quantityItemDao().getByProject(projectId).observe(this, items -> {
            adapter.setData(items);
            double total = 0;
            for (QuantityItem it : items) total += it.totalPrice;
            tvTotal.setText(String.format("الإجمالي: %.2f جنيه", total));
        });

        fab.setOnClickListener(v -> showAddItemDialog());

        executor.execute(() -> project = db.projectDao().getById(projectId));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.project_detail_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_export_pdf) {
            exportToPdf();
            return true;
        }
        if (item.getItemId() == R.id.action_view_summary) {
            android.content.Intent intent = new android.content.Intent(this,
                    com.my.iengineer1.modules.summary.BOQSummaryActivity.class);
            intent.putExtra("project_id", projectId);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void exportToPdf() {
        executor.execute(() -> {
            List<QuantityItem> items = db.quantityItemDao().getByProjectSync(projectId);
            if (project == null) project = db.projectDao().getById(projectId);
            String path = PdfExportUtil.exportProject(this, project, items);
            runOnUiThread(() -> {
                if (path != null) PdfExportUtil.openPdf(this, path);
            });
        });
    }

    private void showAddItemDialog() {
        View v = LayoutInflater.from(this).inflate(R.layout.dialog_add_item, null);
        TextInputEditText etDesc  = v.findViewById(R.id.et_item_desc);
        TextInputEditText etUnit  = v.findViewById(R.id.et_item_unit);
        TextInputEditText etQty   = v.findViewById(R.id.et_item_qty);
        TextInputEditText etPrice = v.findViewById(R.id.et_item_price);

        new MaterialAlertDialogBuilder(this)
                .setTitle("إضافة بند")
                .setView(v)
                .setPositiveButton("إضافة", (d, w) -> {
                    QuantityItem item = new QuantityItem();
                    item.projectId   = projectId;
                    item.description = etDesc.getText() != null  ? etDesc.getText().toString()  : "";
                    item.unit        = etUnit.getText() != null  ? etUnit.getText().toString()  : "م³";
                    item.section     = "general";
                    try { item.quantity  = Double.parseDouble(etQty.getText().toString());   } catch (Exception e) { item.quantity  = 0; }
                    try { item.unitPrice = Double.parseDouble(etPrice.getText().toString()); } catch (Exception e) { item.unitPrice = 0; }
                    item.totalPrice = item.quantity * item.unitPrice;
                    executor.execute(() -> db.quantityItemDao().insert(item));
                })
                .setNegativeButton("إلغاء", null)
                .show();
    }

    @Override
    public boolean onSupportNavigateUp() { finish(); return true; }

    @Override
    protected void onDestroy() { super.onDestroy(); executor.shutdown(); }

    class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.VH> {
        private List<QuantityItem> data;

        void setData(List<QuantityItem> list) { data = list; notifyDataSetChanged(); }

        @Override
        public VH onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_quantity, parent, false);
            return new VH(view);
        }

        @Override
        public void onBindViewHolder(VH h, int position) {
            QuantityItem it = data.get(position);
            h.tvDesc.setText(it.description);
            h.tvQty.setText(String.format("%.2f %s", it.quantity, it.unit));
            h.tvTotal.setText(String.format("%.2f جنيه", it.totalPrice));
            h.itemView.setOnLongClickListener(v -> {
                new MaterialAlertDialogBuilder(ProjectDetailActivity.this)
                        .setTitle("حذف البند")
                        .setMessage("هل تريد حذف هذا البند؟")
                        .setPositiveButton("حذف", (d, w) ->
                                executor.execute(() -> db.quantityItemDao().delete(it)))
                        .setNegativeButton("إلغاء", null).show();
                return true;
            });
        }

        @Override
        public int getItemCount() { return data == null ? 0 : data.size(); }

        class VH extends RecyclerView.ViewHolder {
            TextView tvDesc, tvQty, tvTotal;
            VH(View v) {
                super(v);
                tvDesc  = v.findViewById(R.id.tv_item_desc);
                tvQty   = v.findViewById(R.id.tv_item_qty);
                tvTotal = v.findViewById(R.id.tv_item_total);
            }
        }
    }
}
