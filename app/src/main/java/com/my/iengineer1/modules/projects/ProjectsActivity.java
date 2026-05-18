package com.my.iengineer1.modules.projects;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.my.iengineer1.R;
import com.my.iengineer1.SketchApplication;
import com.my.iengineer1.db.AppDatabase;
import com.my.iengineer1.db.entity.Project;
import com.my.iengineer1.export.PdfExportUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProjectsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProjectAdapter adapter;
    private AppDatabase db;
    private ExecutorService executor = Executors.newSingleThreadExecutor();
    private TextView tvEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("مشاريعي");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        db = SketchApplication.getDatabase();
        recyclerView = findViewById(R.id.rv_projects);
        tvEmpty = findViewById(R.id.tv_empty);
        FloatingActionButton fab = findViewById(R.id.fab_add_project);

        adapter = new ProjectAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        db.projectDao().getAll().observe(this, projects -> {
            adapter.setData(projects);
            tvEmpty.setVisibility(projects.isEmpty() ? View.VISIBLE : View.GONE);
        });

        fab.setOnClickListener(v -> showNewProjectDialog());
    }

    private void showNewProjectDialog() {
        View dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_new_project, null);
        TextInputEditText etName     = dialogView.findViewById(R.id.et_project_name);
        TextInputEditText etClient   = dialogView.findViewById(R.id.et_client_name);
        TextInputEditText etEngineer = dialogView.findViewById(R.id.et_engineer_name);
        TextInputEditText etLocation = dialogView.findViewById(R.id.et_location);

        new MaterialAlertDialogBuilder(this)
                .setTitle("مشروع جديد")
                .setView(dialogView)
                .setPositiveButton("إنشاء", (d, w) -> {
                    String name = etName.getText() != null ? etName.getText().toString().trim() : "";
                    if (name.isEmpty()) name = "مشروع " + new SimpleDateFormat("dd/MM/yy", Locale.getDefault()).format(new Date());
                    String client   = etClient.getText()   != null ? etClient.getText().toString().trim()   : "";
                    String engineer = etEngineer.getText() != null ? etEngineer.getText().toString().trim() : "";
                    String location = etLocation.getText() != null ? etLocation.getText().toString().trim() : "";
                    Project project = Project.create(name, "structures", client, engineer, location);
                    executor.execute(() -> db.projectDao().insert(project));
                })
                .setNegativeButton("إلغاء", null)
                .show();
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        executor.shutdown();
    }

    // ── Adapter ──────────────────────────────────────────────────────────────
    class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.VH> {

        private List<Project> data;

        void setData(List<Project> list) {
            data = list;
            notifyDataSetChanged();
        }

        @Override
        public VH onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_project, parent, false);
            return new VH(v);
        }

        @Override
        public void onBindViewHolder(VH holder, int position) {
            Project p = data.get(position);
            holder.tvName.setText(p.name);
            holder.tvClient.setText(p.client != null && !p.client.isEmpty() ? p.client : "بدون عميل");
            holder.tvDate.setText(new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(new Date(p.updatedAt)));

            holder.itemView.setOnClickListener(v -> openProject(p));
            holder.itemView.setOnLongClickListener(v -> {
                confirmDelete(p);
                return true;
            });
            holder.btnExport.setOnClickListener(v -> exportProject(p));
        }

        @Override
        public int getItemCount() {
            return data == null ? 0 : data.size();
        }

        class VH extends RecyclerView.ViewHolder {
            TextView tvName, tvClient, tvDate;
            View btnExport;
            VH(View v) {
                super(v);
                tvName   = v.findViewById(R.id.tv_project_name);
                tvClient = v.findViewById(R.id.tv_project_client);
                tvDate   = v.findViewById(R.id.tv_project_date);
                btnExport = v.findViewById(R.id.btn_export_pdf);
            }
        }
    }

    private void openProject(Project project) {
        Intent intent = new Intent(this, ProjectDetailActivity.class);
        intent.putExtra("project_id", project.id);
        intent.putExtra("project_name", project.name);
        startActivity(intent);
    }

    private void confirmDelete(Project project) {
        new MaterialAlertDialogBuilder(this)
                .setTitle("حذف المشروع")
                .setMessage("هل تريد حذف مشروع "" + project.name + ""؟")
                .setPositiveButton("حذف", (d, w) ->
                        executor.execute(() -> db.projectDao().delete(project)))
                .setNegativeButton("إلغاء", null)
                .show();
    }

    private void exportProject(Project project) {
        executor.execute(() -> {
            List<com.my.iengineer1.db.entity.QuantityItem> items =
                    db.quantityItemDao().getByProjectSync(project.id);
            String path = PdfExportUtil.exportProject(this, project, items);
            runOnUiThread(() -> {
                if (path != null) PdfExportUtil.openPdf(this, path);
            });
        });
    }
}
