package com.my.iengineer1.modules.roads;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Road Quantity Survey Activity — Phase 3
 * Egyptian Roads Standard calculations: earthwork, sub-base, base, binder, wearing course.
 */
public class RoadsActivity extends AppCompatActivity {

    // ── Layer config fields ──────────────────────────────────────────────────
    private TextInputEditText etSubbase, etBase, etBinder, etWearing, etSwell;

    // ── Miscellaneous works fields ───────────────────────────────────────────
    private TextInputEditText etKerbs, etMarkings, etSigns;

    // ── BOQ result TextViews ─────────────────────────────────────────────────
    private TextView tvQtyPrep, tvQtyEarth, tvQtySubbase, tvQtyBase;
    private TextView tvQtyBinder, tvQtyWearing;
    private TextView tvQtyKerbs, tvQtyMarkings, tvQtySigns;
    private LinearLayout rowKerbs, rowMarkings, rowSigns;
    private TextView tvRoadsSummary;

    // ── RecyclerView ─────────────────────────────────────────────────────────
    private final List<RoadSection> sections = new ArrayList<>();
    private RoadSectionAdapter sectionAdapter;

    // ── DB ───────────────────────────────────────────────────────────────────
    private AppDatabase db;
    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    // ── Last computed quantities (for save) ──────────────────────────────────
    private double lastTotalArea, lastEarthwork, lastSubbaseVol, lastBaseVol;
    private double lastBinderTons, lastWearingTons, lastKerbsM, lastMarkingsM;
    private int lastSignsCount;

    // =========================================================================
    //  Inner data class
    // =========================================================================
    static class RoadSection {
        String name = "";
        double length = 0, width = 0, shoulder = 0;
    }

    // =========================================================================
    //  RecyclerView Adapter
    // =========================================================================
    class RoadSectionAdapter extends RecyclerView.Adapter<RoadSectionAdapter.VH> {

        class VH extends RecyclerView.ViewHolder {
            TextInputEditText etName, etLength, etWidth, etShoulder;
            MaterialButton btnDelete;
            // We hold TextWatcher references so we can remove them before rebinding
            TextWatcher nameWatcher, lengthWatcher, widthWatcher, shoulderWatcher;

            VH(@NonNull View v) {
                super(v);
                etName     = v.findViewById(R.id.et_section_name);
                etLength   = v.findViewById(R.id.et_section_length);
                etWidth    = v.findViewById(R.id.et_section_width);
                etShoulder = v.findViewById(R.id.et_section_shoulder);
                btnDelete  = v.findViewById(R.id.btn_delete_section);
            }
        }

        @NonNull
        @Override
        public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_road_section, parent, false);
            return new VH(v);
        }

        @Override
        public void onBindViewHolder(@NonNull VH h, int position) {
            RoadSection sec = sections.get(position);

            // Remove old watchers before setting text to avoid feedback loops
            if (h.nameWatcher != null)     h.etName.removeTextChangedListener(h.nameWatcher);
            if (h.lengthWatcher != null)   h.etLength.removeTextChangedListener(h.lengthWatcher);
            if (h.widthWatcher != null)    h.etWidth.removeTextChangedListener(h.widthWatcher);
            if (h.shoulderWatcher != null) h.etShoulder.removeTextChangedListener(h.shoulderWatcher);

            h.etName.setText(sec.name);
            h.etLength.setText(sec.length > 0 ? formatInput(sec.length) : "");
            h.etWidth.setText(sec.width > 0 ? formatInput(sec.width) : "");
            h.etShoulder.setText(sec.shoulder > 0 ? formatInput(sec.shoulder) : "");

            // Fresh watchers for this position
            h.nameWatcher = makeWatcher(s -> {
                int p = h.getAdapterPosition();
                if (p >= 0 && p < sections.size()) sections.get(p).name = s;
                // no recalculation needed for name changes
            });
            h.lengthWatcher = makeWatcher(s -> {
                int p = h.getAdapterPosition();
                if (p >= 0 && p < sections.size()) {
                    sections.get(p).length = parseStr(s);
                    calculate();
                }
            });
            h.widthWatcher = makeWatcher(s -> {
                int p = h.getAdapterPosition();
                if (p >= 0 && p < sections.size()) {
                    sections.get(p).width = parseStr(s);
                    calculate();
                }
            });
            h.shoulderWatcher = makeWatcher(s -> {
                int p = h.getAdapterPosition();
                if (p >= 0 && p < sections.size()) {
                    sections.get(p).shoulder = parseStr(s);
                    calculate();
                }
            });

            h.etName.addTextChangedListener(h.nameWatcher);
            h.etLength.addTextChangedListener(h.lengthWatcher);
            h.etWidth.addTextChangedListener(h.widthWatcher);
            h.etShoulder.addTextChangedListener(h.shoulderWatcher);

            h.btnDelete.setOnClickListener(v -> {
                int p = h.getAdapterPosition();
                if (p >= 0 && p < sections.size()) {
                    sections.remove(p);
                    notifyItemRemoved(p);
                    notifyItemRangeChanged(p, sections.size());
                    calculate();
                }
            });
        }

        @Override
        public int getItemCount() { return sections.size(); }
    }

    // =========================================================================
    //  Activity lifecycle
    // =========================================================================
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roads);

        db = SketchApplication.getDatabase();

        setupToolbar();
        initViews();
        setupRecyclerView();
        setupLayerWatchers();
        setupFabs();

        // Seed one empty section so the list isn't blank on first open
        addSection();
    }

    private void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    // =========================================================================
    //  View initialisation
    // =========================================================================
    private void initViews() {
        // Layer config
        etSubbase = findViewById(R.id.et_subbase_depth);
        etBase    = findViewById(R.id.et_base_depth);
        etBinder  = findViewById(R.id.et_binder_depth);
        etWearing = findViewById(R.id.et_wearing_depth);
        etSwell   = findViewById(R.id.et_swell_factor);

        // Miscellaneous
        etKerbs    = findViewById(R.id.et_kerbs_length);
        etMarkings = findViewById(R.id.et_markings_length);
        etSigns    = findViewById(R.id.et_signs_count);

        // BOQ result rows
        tvQtyPrep     = findViewById(R.id.tv_qty_prep);
        tvQtyEarth    = findViewById(R.id.tv_qty_earth);
        tvQtySubbase  = findViewById(R.id.tv_qty_subbase);
        tvQtyBase     = findViewById(R.id.tv_qty_base);
        tvQtyBinder   = findViewById(R.id.tv_qty_binder);
        tvQtyWearing  = findViewById(R.id.tv_qty_wearing);
        tvQtyKerbs    = findViewById(R.id.tv_qty_kerbs);
        tvQtyMarkings = findViewById(R.id.tv_qty_markings);
        tvQtySigns    = findViewById(R.id.tv_qty_signs);

        // Optional rows (hidden by default)
        rowKerbs    = findViewById(R.id.row_kerbs);
        rowMarkings = findViewById(R.id.row_markings);
        rowSigns    = findViewById(R.id.row_signs);

        tvRoadsSummary = findViewById(R.id.tv_roads_summary);
    }

    private void setupRecyclerView() {
        RecyclerView rv = findViewById(R.id.rv_road_sections);
        sectionAdapter = new RoadSectionAdapter();
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(sectionAdapter);
        rv.setNestedScrollingEnabled(false);
    }

    private void setupLayerWatchers() {
        TextWatcher calc = makeWatcher(s -> calculate());
        etSubbase.addTextChangedListener(calc);
        etBase.addTextChangedListener(calc);
        etBinder.addTextChangedListener(calc);
        etWearing.addTextChangedListener(calc);
        etSwell.addTextChangedListener(calc);
        etKerbs.addTextChangedListener(calc);
        etMarkings.addTextChangedListener(calc);
        etSigns.addTextChangedListener(calc);
    }

    private void setupFabs() {
        // Add-section button inside the sections card header
        MaterialButton btnAdd = findViewById(R.id.btn_add_section);
        btnAdd.setOnClickListener(v -> addSection());

        // Save-to-project FAB
        ExtendedFloatingActionButton fabSave = findViewById(R.id.fab_save_project);
        fabSave.setOnClickListener(v -> showSaveDialog());
    }

    // =========================================================================
    //  Section management
    // =========================================================================
    private void addSection() {
        RoadSection sec = new RoadSection();
        sec.name = "مقطع " + (sections.size() + 1);
        sections.add(sec);
        sectionAdapter.notifyItemInserted(sections.size() - 1);
        calculate();
    }

    // =========================================================================
    //  Calculations  (Egyptian Roads Standard)
    // =========================================================================
    void calculate() {
        double tSubbase = parseField(etSubbase, 0.20);
        double tBase    = parseField(etBase,    0.15);
        double tBinder  = parseField(etBinder,  0.07);
        double tWearing = parseField(etWearing, 0.05);
        double swell    = parseField(etSwell,   1.25);

        // Aggregate section sums
        double totalArea      = 0; // includes shoulders
        double clearanceArea  = 0; // carriageway only (for asphalt)
        double totalLength    = 0;

        for (RoadSection s : sections) {
            if (s.length > 0 && s.width > 0) {
                totalArea     += s.length * (s.width + 2.0 * s.shoulder);
                clearanceArea += s.length * s.width;
                totalLength   += s.length;
            }
        }

        // Core volumes
        double earthwork    = totalArea * (tSubbase + tBase + tBinder + tWearing + 0.30) * swell;
        double subbaseVol   = totalArea  * tSubbase;
        double baseVol      = totalArea  * tBase;
        double binderTons   = clearanceArea * tBinder  * 2.4;
        double wearingTons  = clearanceArea * tWearing * 2.4;

        // Miscellaneous
        double kerbsInput    = parseField(etKerbs,    0);
        double markingsInput = parseField(etMarkings, 0);
        int    signsCount    = parseInt(etSigns);

        double kerbsM    = (kerbsInput > 0)    ? kerbsInput    : 2.0 * totalLength;
        double markingsM = (markingsInput > 0)  ? markingsInput : totalLength;

        // Cache for save
        lastTotalArea   = totalArea;
        lastEarthwork   = earthwork;
        lastSubbaseVol  = subbaseVol;
        lastBaseVol     = baseVol;
        lastBinderTons  = binderTons;
        lastWearingTons = wearingTons;
        lastKerbsM      = kerbsM;
        lastMarkingsM   = markingsM;
        lastSignsCount  = signsCount;

        // ── Update BOQ result views ──────────────────────────────────────────
        tvQtyPrep.setText(fmt2(totalArea));
        tvQtyEarth.setText(fmt2(earthwork));
        tvQtySubbase.setText(fmt2(subbaseVol));
        tvQtyBase.setText(fmt2(baseVol));
        tvQtyBinder.setText(fmt2(binderTons));
        tvQtyWearing.setText(fmt2(wearingTons));

        if (kerbsM > 0) {
            tvQtyKerbs.setText(fmt2(kerbsM));
            if (rowKerbs != null) rowKerbs.setVisibility(View.VISIBLE);
        } else {
            if (rowKerbs != null) rowKerbs.setVisibility(View.GONE);
        }

        if (markingsM > 0) {
            tvQtyMarkings.setText(fmt2(markingsM));
            if (rowMarkings != null) rowMarkings.setVisibility(View.VISIBLE);
        } else {
            if (rowMarkings != null) rowMarkings.setVisibility(View.GONE);
        }

        if (signsCount > 0) {
            tvQtySigns.setText(String.valueOf(signsCount));
            if (rowSigns != null) rowSigns.setVisibility(View.VISIBLE);
        } else {
            if (rowSigns != null) rowSigns.setVisibility(View.GONE);
        }

        tvRoadsSummary.setText(String.format(Locale.US,
                "إجمالي مساحة الرصف: %.1f م²  |  إجمالي الحفريات: %.1f م³",
                totalArea, earthwork));
    }

    // =========================================================================
    //  Save to project dialog
    // =========================================================================
    private void showSaveDialog() {
        executor.execute(() -> {
            List<Project> projects = db.projectDao().getAllSync();
            runOnUiThread(() -> buildProjectDialog(projects));
        });
    }

    private void buildProjectDialog(@NonNull List<Project> projects) {
        // Build display list: "مشروع جديد" + existing project names
        String[] items = new String[projects.size() + 1];
        items[0] = "+ مشروع جديد";
        for (int i = 0; i < projects.size(); i++) {
            items[i + 1] = projects.get(i).name != null ? projects.get(i).name : "مشروع " + projects.get(i).id;
        }

        new MaterialAlertDialogBuilder(this)
                .setTitle("حفظ في مشروع")
                .setItems(items, (dialog, which) -> {
                    if (which == 0) {
                        createNewProjectAndSave();
                    } else {
                        saveToProject(projects.get(which - 1).id);
                    }
                })
                .setNegativeButton("إلغاء", null)
                .show();
    }

    private void createNewProjectAndSave() {
        android.widget.EditText etName = new android.widget.EditText(this);
        etName.setHint("اسم المشروع");

        new MaterialAlertDialogBuilder(this)
                .setTitle("مشروع جديد")
                .setView(etName)
                .setPositiveButton("إنشاء", (d, w) -> {
                    String name = etName.getText() != null ? etName.getText().toString().trim() : "";
                    if (name.isEmpty()) name = "مشروع طرق " + System.currentTimeMillis();
                    final String projectName = name;
                    executor.execute(() -> {
                        Project p = Project.create(projectName, "roads", "", "", "");
                        long newId = db.projectDao().insert(p);
                        saveToProject(newId);
                    });
                })
                .setNegativeButton("إلغاء", null)
                .show();
    }

    private void saveToProject(long projectId) {
        executor.execute(() -> {
            List<QuantityItem> items = buildBoqItems(projectId);
            db.quantityItemDao().insertAll(items);
            runOnUiThread(() ->
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "تم الحفظ في المشروع",
                    Snackbar.LENGTH_SHORT
                ).show()
            );
        });
    }

    @NonNull
    private List<QuantityItem> buildBoqItems(long projectId) {
        List<QuantityItem> items = new ArrayList<>();
        int order = 1;

        items.add(makeItem(projectId, order++, "1",
                "أعمال تحضير وتنظيف", "م²", lastTotalArea));
        items.add(makeItem(projectId, order++, "2",
                "حفريات وردم معدلة", "م³", lastEarthwork));
        items.add(makeItem(projectId, order++, "3",
                "توريد وفرد وضغط إساس جيري Sub-base", "م³", lastSubbaseVol));
        items.add(makeItem(projectId, order++, "4",
                "توريد وفرد وضغط أساس حجري Base", "م³", lastBaseVol));
        items.add(makeItem(projectId, order++, "5",
                "خلطة أسفلتية طبقة رابطة Binder", "طن", lastBinderTons));
        items.add(makeItem(projectId, order++, "6",
                "خلطة أسفلتية طبقة سطحية Wearing", "طن", lastWearingTons));

        if (lastKerbsM > 0) {
            items.add(makeItem(projectId, order++, "7",
                    "عربيات خرسانية Kerbs", "م.ط", lastKerbsM));
        }
        if (lastMarkingsM > 0) {
            items.add(makeItem(projectId, order++, "8",
                    "رسم خطوط مرور", "م.ط", lastMarkingsM));
        }
        if (lastSignsCount > 0) {
            items.add(makeItem(projectId, order, "9",
                    "لوحات إرشادية", "عدد", lastSignsCount));
        }

        return items;
    }

    @NonNull
    private QuantityItem makeItem(long projectId, int sortOrder,
                                  @NonNull String itemNo,
                                  @NonNull String description,
                                  @NonNull String unit,
                                  double quantity) {
        QuantityItem qi = new QuantityItem();
        qi.projectId  = projectId;
        qi.sortOrder  = sortOrder;
        qi.itemNo     = itemNo;
        qi.description = description;
        qi.unit       = unit;
        qi.quantity   = quantity;
        qi.unitPrice  = 0;
        qi.totalPrice = 0;
        qi.section    = "road";
        return qi;
    }

    // =========================================================================
    //  Helpers
    // =========================================================================

    /** Creates a TextWatcher that only acts on afterTextChanged. */
    @NonNull
    private TextWatcher makeWatcher(@NonNull OnTextChanged callback) {
        return new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int st, int c, int a) {}
            @Override public void onTextChanged(CharSequence s, int st, int b, int c) {}
            @Override public void afterTextChanged(Editable s) {
                callback.onChanged(s != null ? s.toString() : "");
            }
        };
    }

    interface OnTextChanged { void onChanged(String text); }

    /** Parse a TextInputEditText, returning defaultVal if blank/invalid. */
    private double parseField(@NonNull TextInputEditText et, double defaultVal) {
        try {
            String s = et.getText() != null ? et.getText().toString().trim() : "";
            if (s.isEmpty()) return defaultVal;
            double v = Double.parseDouble(s);
            return (v > 0) ? v : defaultVal;
        } catch (NumberFormatException e) {
            return defaultVal;
        }
    }

    private double parseStr(@NonNull String s) {
        try {
            return s.isEmpty() ? 0 : Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private int parseInt(@NonNull TextInputEditText et) {
        try {
            String s = et.getText() != null ? et.getText().toString().trim() : "";
            return s.isEmpty() ? 0 : Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /** Format number for setting back into an EditText (no trailing zeros). */
    @NonNull
    private String formatInput(double v) {
        if (v == Math.floor(v) && !Double.isInfinite(v))
            return String.valueOf((long) v);
        return String.valueOf(v);
    }

    /** Format quantity with 2 decimal places. */
    @NonNull
    private String fmt2(double v) {
        return String.format(Locale.US, "%.2f", v);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        executor.shutdown();
    }
}
