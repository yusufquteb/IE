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
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.my.iengineer1.db.AppDatabase;
import com.my.iengineer1.db.entity.Project;
import com.my.iengineer1.modules.projects.ProjectDetailActivity;
import com.my.iengineer1.modules.projects.ProjectsActivity;
import java.util.List;

public class ProjectsListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_projects_list, container, false);

        RecyclerView rv   = view.findViewById(R.id.rv_projects_home);
        TextView tvEmpty  = view.findViewById(R.id.tv_no_projects);
        View btnManage    = view.findViewById(R.id.btn_manage_projects);

        AppDatabase db = SketchApplication.getDatabase();

        QuickAdapter adapter = new QuickAdapter();
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(requireContext()));

        db.projectDao().getAll().observe(getViewLifecycleOwner(), projects -> {
            adapter.setData(projects);
            tvEmpty.setVisibility(projects.isEmpty() ? View.VISIBLE : View.GONE);
        });

        btnManage.setOnClickListener(v ->
                startActivity(new Intent(requireContext(), ProjectsActivity.class)));

        return view;
    }

    class QuickAdapter extends RecyclerView.Adapter<QuickAdapter.VH> {
        private List<Project> data;

        void setData(List<Project> d) { data = d; notifyDataSetChanged(); }

        @NonNull
        @Override
        public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new VH(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_project, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull VH h, int pos) {
            Project p = data.get(pos);
            h.tvName.setText(p.name);
            h.tvClient.setText(p.client != null ? p.client : "");
            h.tvDate.setText("");
            h.itemView.setOnClickListener(v -> {
                Intent i = new Intent(requireContext(), ProjectDetailActivity.class);
                i.putExtra("project_id", p.id);
                i.putExtra("project_name", p.name);
                startActivity(i);
            });
            h.btnExport.setVisibility(View.GONE);
        }

        @Override public int getItemCount() { return data == null ? 0 : data.size(); }

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
}
