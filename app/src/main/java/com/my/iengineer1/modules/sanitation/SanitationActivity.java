package com.my.iengineer1.modules.sanitation;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.my.iengineer1.R;
import com.my.iengineer1.SketchApplication;
import com.my.iengineer1.db.AppDatabase;
import com.my.iengineer1.db.entity.Project;
import com.my.iengineer1.db.entity.QuantityItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Sanitation Quantity Survey — Phase 3
 * Multi-segment pipe calculator per Egyptian / BS EN 1610 standards.
 * Computes: trench excavation, bedding sand, backfill, manholes.
 */
public class SanitationActivity extends AppCompatActivity {

    private static final String[] DIAMETERS = {
            "DN100", "DN150", "DN200", "DN250", "DN300", "DN400", "DN500", "DN600"
    };
    // Trench width (m) per diameter class — Egyptian Roads Authority standard
    private static final double[] TRENCH_WIDTH = {0.70, 0.75, 0.80, 0.90, 1.00, 1.20, 1.40, 1.60};
    // Pipe outer diameter (m)
    private static final double[] PIPE_OD = {0.110, 0.165, 0.214, 0.269, 0.315, 0.425, 0.530, 0.630};

    private final List<PipeSegment> segments = new ArrayList<>();
    private PipeSegmentAdapter segmentAdapter;

    private TextInputEditText etQ60Count, etQ60Depth;
    private TextInputEditText etQ80Count, etQ80Depth;
    private TextInputEditText etQ100Count, etQ100Depth;

    private TextView tvQtyTrenchExcav, tvQtyBedding, tvQtyBackfill;
    private LinearLayout llPipeQuantities;
    private TextView tvQtyQ60Excav, tvQtyQ60Count;
    private TextView tvQtyQ80Excav, tvQtyQ80Count;
    private TextView tvQtyQ100Excav, tvQtyQ100Count;
    private TextView tvQtyCovers;
    private LinearLayout rowQ60Excav, rowQ60Count, rowQ80Excav, rowQ80Count;
    private LinearLayout rowQ100Excav, rowQ100Count;
    private TextView tvSanitationTotal;

    private AppDatabase db;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    // Cached quantities for "save to project"
    private double savedTrenchExcav, savedBedding, savedBackfill;
    private final Map<String, Double> savedPipeLengths = new LinkedHashMap<>();
    private double savedQ60Excav, savedQ80Excav, savedQ100Excav;
    private int savedQ60Count, savedQ80Count, savedQ100Count;

    // ── Inner model ──────────────────────────────────────────────────────────

    static class PipeSegment {
        String diameter = "DN200";
        double length = 0, depth = 0;
    }

    // ── Lifecycle ────────────────────────────────────────────────────────────

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanitation);

        db = SketchApplication.getDatabase();
        setupToolbar();
        initViews();
        setupRecyclerView();
        setupManholeWatchers();
        setupFabs();
        addSegment();
    }

    private void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("حصر الصرف الصحي");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void initViews() {
        etQ60Count  = findViewById(R.id.et_q60_count);
        etQ60Depth  = findViewById(R.id.et_q60_depth);
        etQ80Count  = findViewById(R.id.et_q80_count);
        etQ80Depth  = findViewById(R.id.et_q80_depth);
        etQ100Count = findViewById(R.id.et_q100_count);
        etQ100Depth = findViewById(R.id.et_q100_depth);

        tvQtyTrenchExcav = findViewById(R.id.tv_qty_trench_excav);
        tvQtyBedding     = findViewById(R.id.tv_qty_bedding);
        tvQtyBackfill    = findViewById(R.id.tv_qty_backfill);
        llPipeQuantities = findViewById(R.id.ll_pipe_quantities);

        tvQtyQ60Excav  = findViewById(R.id.tv_qty_q60_excav);
        tvQtyQ60Count  = findViewById(R.id.tv_qty_q60_count);
        tvQtyQ80Excav  = findViewById(R.id.tv_qty_q80_excav);
        tvQtyQ80Count  = findViewById(R.id.tv_qty_q80_count);
        tvQtyQ100Excav = findViewById(R.id.tv_qty_q100_excav);
        tvQtyQ100Count = findViewById(R.id.tv_qty_q100_count);
        tvQtyCovers    = findViewById(R.id.tv_qty_covers);

        rowQ60Excav  = findViewById(R.id.row_q60_excav);
        rowQ60Count  = findViewById(R.id.row_q60_count);
        rowQ80Excav  = findViewById(R.id.row_q80_excav);
        rowQ80Count  = findViewById(R.id.row_q80_count);
        rowQ100Excav = findViewById(R.id.row_q100_excav);
        rowQ100Count = findViewById(R.id.row_q100_count);

        tvSanitationTotal = findViewById(R.id.tv_sanitation_total);
    }

    private void setupRecyclerView() {
        RecyclerView rv = findViewById(R.id.rv_pipe_segments);
        segmentAdapter = new PipeSegmentAdapter();
        rv.setAdapter(segmentAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setNestedScrollingEnabled(false);
    }

    private void setupManholeWatchers() {
        TextWatcher w = new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int st, int c, int a) {}
            @Override public void onTextChanged(CharSequence s, int st, int b, int c) {}
            @Override public void afterTextChanged(Editable s) { calculate(); }
        };
        for (TextInputEditText et : new TextInputEditText[]{
                etQ60Count, etQ60Depth, etQ80Count, etQ80Depth, etQ100Count, etQ100Depth
        }) et.addTextChangedListener(w);
    }

    private void setupFabs() {
        MaterialButton btnAdd = findViewById(R.id.btn_add_pipe);
        btnAdd.setOnClickListener(v -> addSegment());

        ExtendedFloatingActionButton fabSave = findViewById(R.id.fab_save_project);
        fabSave.setOnClickListener(v -> showSaveDialog());
    }

    private void addSegment() {
        segments.add(new PipeSegment());
        segmentAdapter.notifyItemInserted(segments.size() - 1);
        calculate();
    }

    // ── Calculation engine ────────────────────────────────────────────────────

    void calculate() {
        double totalTrenchExcav = 0, totalBedding = 0, totalBackfill = 0;
        Map<String, Double> pipeLengths = new LinkedHashMap<>();

        for (PipeSegment seg : segments) {
            if (seg.length <= 0 || seg.depth <= 0) continue;
            int idx = diameterIndex(seg.diameter);
            double tw = TRENCH_WIDTH[idx];
            double od = PIPE_OD[idx];

            double trench   = seg.length * tw * seg.depth;
            double bedding  = seg.length * tw * 0.15;
            double pipeVol  = Math.PI * (od / 2) * (od / 2) * seg.length;
            double backfill = Math.max(0, trench - pipeVol - bedding);

            totalTrenchExcav += trench;
            totalBedding     += bedding;
            totalBackfill    += backfill;
            pipeLengths.merge(seg.diameter, seg.length, Double::sum);
        }

        // Manholes
        int    q60n  = parseInt(etQ60Count);
        double q60d  = parseDouble(etQ60Depth);
        int    q80n  = parseInt(etQ80Count);
        double q80d  = parseDouble(etQ80Depth);
        int    q100n = parseInt(etQ100Count);
        double q100d = parseDouble(etQ100Depth);

        // Excavation volume using approximate circular cross-section
        double q60Excav  = q60n  * Math.PI * 0.70 * 0.70 * q60d;
        double q80Excav  = q80n  * Math.PI * 0.85 * 0.85 * q80d;
        double q100Excav = q100n * Math.PI * 1.00 * 1.00 * q100d;
        int totalManholes = q60n + q80n + q100n;

        // Cache for save-to-project
        savedTrenchExcav = totalTrenchExcav;
        savedBedding     = totalBedding;
        savedBackfill    = totalBackfill;
        savedPipeLengths.clear();
        savedPipeLengths.putAll(pipeLengths);
        savedQ60Excav  = q60Excav;   savedQ60Count  = q60n;
        savedQ80Excav  = q80Excav;   savedQ80Count  = q80n;
        savedQ100Excav = q100Excav;  savedQ100Count = q100n;

        // Update BOQ display
        tvQtyTrenchExcav.setText(fmt3(totalTrenchExcav));
        tvQtyBedding.setText(fmt3(totalBedding));
        tvQtyBackfill.setText(fmt3(totalBackfill));

        buildPipeRows(pipeLengths);

        setManholeRow(rowQ60Excav, rowQ60Count, tvQtyQ60Excav, tvQtyQ60Count,
                q60n, q60Excav);
        setManholeRow(rowQ80Excav, rowQ80Count, tvQtyQ80Excav, tvQtyQ80Count,
                q80n, q80Excav);
        setManholeRow(rowQ100Excav, rowQ100Count, tvQtyQ100Excav, tvQtyQ100Count,
                q100n, q100Excav);

        tvQtyCovers.setText(String.valueOf(totalManholes));

        double totalPipeLen = 0;
        for (double l : pipeLengths.values()) totalPipeLen += l;
        tvSanitationTotal.setText(String.format(Locale.US,
                "إجمالي الحفر: %.3f م³  |  الأنابيب: %.1f م.ط  |  غرف: %d",
                totalTrenchExcav + q60Excav + q80Excav + q100Excav,
                totalPipeLen, totalManholes));
    }

    private void setManholeRow(LinearLayout rowExcav, LinearLayout rowCount,
                                TextView tvExcav, TextView tvCount, int n, double excav) {
        rowExcav.setVisibility(n > 0 ? View.VISIBLE : View.GONE);
        rowCount.setVisibility(n > 0 ? View.VISIBLE : View.GONE);
        if (n > 0) {
            tvExcav.setText(fmt3(excav));
            tvCount.setText(String.valueOf(n));
        }
    }

    private void buildPipeRows(Map<String, Double> pipeLengths) {
        llPipeQuantities.removeAllViews();
        int itemNo = 3;
        for (Map.Entry<String, Double> e : pipeLengths.entrySet()) {
            View row = LayoutInflater.from(this)
                    .inflate(R.layout.item_boq_row, llPipeQuantities, false);
            ((TextView) row.findViewById(R.id.tv_boq_no)).setText(String.valueOf(itemNo++));
            String diaNum = e.getKey().replace("DN", "");
            ((TextView) row.findViewById(R.id.tv_boq_desc)).setText(
                    "أنبوب PVC قطر " + diaNum + " مم (توريد وتركيب)");
            ((TextView) row.findViewById(R.id.tv_boq_unit)).setText("م.ط");
            ((TextView) row.findViewById(R.id.tv_boq_qty)).setText(fmt1(e.getValue()));
            llPipeQuantities.addView(row);
        }
    }

    // ── Save to project ───────────────────────────────────────────────────────

    private void showSaveDialog() {
        executor.execute(() -> {
            List<Project> projects = db.projectDao().getAllSync();
            runOnUiThread(() -> buildProjectDialog(projects));
        });
    }

    private void buildProjectDialog(List<Project> projects) {
        String[] names = new String[projects.size() + 1];
        for (int i = 0; i < projects.size(); i++) names[i] = projects.get(i).name;
        names[projects.size()] = "+ مشروع جديد";

        new MaterialAlertDialogBuilder(this)
                .setTitle("اختر مشروعًا للحفظ")
                .setItems(names, (d, which) -> {
                    if (which == projects.size()) createNewProjectAndSave();
                    else saveToProject(projects.get(which).id);
                })
                .setNegativeButton("إلغاء", null)
                .show();
    }

    private void createNewProjectAndSave() {
        android.widget.EditText et = new android.widget.EditText(this);
        et.setHint("اسم المشروع");
        new MaterialAlertDialogBuilder(this)
                .setTitle("مشروع جديد")
                .setView(et)
                .setPositiveButton("إنشاء", (d, w) -> {
                    String name = et.getText().toString().trim();
                    if (name.isEmpty()) name = "مشروع صرف صحي";
                    final String finalName = name;
                    executor.execute(() -> {
                        Project p = Project.create(finalName, "sanitation", "", "", "");
                        long pid = db.projectDao().insert(p);
                        runOnUiThread(() -> saveToProject(pid));
                    });
                })
                .setNegativeButton("إلغاء", null)
                .show();
    }

    private void saveToProject(long projectId) {
        executor.execute(() -> {
            List<QuantityItem> items = new ArrayList<>();
            int order = 1;

            items.add(boqItem(projectId, "ص/1", "حفريات خنادق أنابيب", "م³",
                    savedTrenchExcav, 135, "sanitation", order++));
            items.add(boqItem(projectId, "ص/2", "فرشة رمل تحت الأنابيب", "م³",
                    savedBedding, 180, "sanitation", order++));

            for (Map.Entry<String, Double> e : savedPipeLengths.entrySet()) {
                String diaNum = e.getKey().replace("DN", "");
                items.add(boqItem(projectId, "ص/" + order,
                        "أنبوب PVC قطر " + diaNum + " مم", "م.ط",
                        e.getValue(), unitPriceForDia(diaNum), "sanitation", order++));
            }

            items.add(boqItem(projectId, "ص/" + order, "ردم وضغط الخنادق", "م³",
                    savedBackfill, 95, "sanitation", order++));

            if (savedQ60Count > 0) {
                items.add(boqItem(projectId, "ص/" + order, "حفريات غرف تفتيش Q60", "م³",
                        savedQ60Excav, 135, "sanitation", order++));
                items.add(boqItem(projectId, "ص/" + order, "غرفة تفتيش خرسانة Q60", "عدد",
                        savedQ60Count, 3800, "sanitation", order++));
            }
            if (savedQ80Count > 0) {
                items.add(boqItem(projectId, "ص/" + order, "حفريات غرف تفتيش Q80", "م³",
                        savedQ80Excav, 135, "sanitation", order++));
                items.add(boqItem(projectId, "ص/" + order, "غرفة تفتيش خرسانة Q80", "عدد",
                        savedQ80Count, 5500, "sanitation", order++));
            }
            if (savedQ100Count > 0) {
                items.add(boqItem(projectId, "ص/" + order, "حفريات غرف تفتيش Q100", "م³",
                        savedQ100Excav, 135, "sanitation", order++));
                items.add(boqItem(projectId, "ص/" + order, "غرفة تفتيش خرسانة Q100", "عدد",
                        savedQ100Count, 8500, "sanitation", order++));
            }
            int totalManholes = savedQ60Count + savedQ80Count + savedQ100Count;
            if (totalManholes > 0) {
                items.add(boqItem(projectId, "ص/" + order,
                        "أطواق وأغطية حديد زهر D400", "عدد",
                        totalManholes, 950, "sanitation", order));
            }

            for (QuantityItem it : items) db.quantityItemDao().insert(it);
            runOnUiThread(() ->
                    Snackbar.make(findViewById(android.R.id.content),
                            "تم حفظ الحصر في المشروع ✓", Snackbar.LENGTH_LONG).show());
        });
    }

    // ── Adapter ───────────────────────────────────────────────────────────────

    class PipeSegmentAdapter extends RecyclerView.Adapter<PipeSegmentAdapter.VH> {

        @NonNull @Override
        public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_pipe_segment, parent, false);
            return new VH(v);
        }

        @Override
        public void onBindViewHolder(@NonNull VH h, int pos) {
            PipeSegment seg = segments.get(pos);

            ArrayAdapter<String> dAdapter = new ArrayAdapter<>(
                    SanitationActivity.this, R.layout.simple_dropdown_item_1line, DIAMETERS);
            h.ddDiameter.setAdapter(dAdapter);
            h.ddDiameter.setText(seg.diameter, false);
            h.ddDiameter.setOnItemClickListener((av, v, i, id) -> {
                seg.diameter = DIAMETERS[i];
                calculate();
            });

            if (h.lenWatcher != null)   h.etLength.removeTextChangedListener(h.lenWatcher);
            if (h.depthWatcher != null) h.etDepth.removeTextChangedListener(h.depthWatcher);

            h.etLength.setText(seg.length > 0 ? fmt1(seg.length) : "");
            h.etDepth.setText(seg.depth  > 0 ? fmt1(seg.depth)  : "");

            h.lenWatcher = makeWatcher(s -> { seg.length = parseStr(s); calculate(); });
            h.depthWatcher = makeWatcher(s -> { seg.depth  = parseStr(s); calculate(); });
            h.etLength.addTextChangedListener(h.lenWatcher);
            h.etDepth.addTextChangedListener(h.depthWatcher);

            h.btnDelete.setOnClickListener(v -> {
                int p = h.getAdapterPosition();
                if (p >= 0 && p < segments.size()) {
                    segments.remove(p);
                    notifyItemRemoved(p);
                    calculate();
                }
            });
        }

        @Override public int getItemCount() { return segments.size(); }

        class VH extends RecyclerView.ViewHolder {
            AutoCompleteTextView ddDiameter;
            TextInputEditText etLength, etDepth;
            MaterialButton btnDelete;
            TextWatcher lenWatcher, depthWatcher;

            VH(View v) {
                super(v);
                ddDiameter = v.findViewById(R.id.dd_pipe_diameter);
                etLength   = v.findViewById(R.id.et_pipe_length);
                etDepth    = v.findViewById(R.id.et_pipe_trench_depth);
                btnDelete  = v.findViewById(R.id.btn_delete_pipe);
            }
        }
    }

    // ── Utility helpers ───────────────────────────────────────────────────────

    private int diameterIndex(String dia) {
        for (int i = 0; i < DIAMETERS.length; i++)
            if (DIAMETERS[i].equals(dia)) return i;
        return 2;
    }

    private double unitPriceForDia(String diaMm) {
        switch (diaMm) {
            case "100": return 120;  case "150": return 185;
            case "200": return 250;  case "250": return 320;
            case "300": return 420;  case "400": return 580;
            case "500": return 780;  case "600": return 1100;
            default:    return 200;
        }
    }

    private QuantityItem boqItem(long pid, String no, String desc, String unit,
                                  double qty, double price, String section, int order) {
        QuantityItem it = new QuantityItem();
        it.projectId   = pid;
        it.itemNo      = no;
        it.description = desc;
        it.unit        = unit;
        it.quantity    = qty;
        it.unitPrice   = price;
        it.section     = section;
        it.sortOrder   = order;
        it.calcTotal();
        return it;
    }

    interface StringConsumer { void accept(String s); }

    private TextWatcher makeWatcher(StringConsumer fn) {
        return new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int st, int c, int a) {}
            @Override public void onTextChanged(CharSequence s, int st, int b, int c) {}
            @Override public void afterTextChanged(Editable s) { fn.accept(s.toString()); }
        };
    }

    private double parseDouble(TextInputEditText et) {
        try {
            String s = et.getText() != null ? et.getText().toString().trim() : "";
            return s.isEmpty() ? 0 : Double.parseDouble(s);
        } catch (NumberFormatException e) { return 0; }
    }

    private int parseInt(TextInputEditText et) {
        try {
            String s = et.getText() != null ? et.getText().toString().trim() : "";
            return s.isEmpty() ? 0 : Integer.parseInt(s);
        } catch (NumberFormatException e) { return 0; }
    }

    private double parseStr(String s) {
        try { return (s == null || s.isEmpty()) ? 0 : Double.parseDouble(s); }
        catch (NumberFormatException e) { return 0; }
    }

    private String fmt3(double v) { return String.format(Locale.US, "%.3f", v); }
    private String fmt1(double v) {
        return (v == (long) v) ? String.valueOf((long) v)
                               : String.format(Locale.US, "%.1f", v);
    }

    @Override public boolean onSupportNavigateUp() { finish(); return true; }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        executor.shutdown();
    }
}
