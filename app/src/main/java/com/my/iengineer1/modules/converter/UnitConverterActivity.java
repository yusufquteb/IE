package com.my.iengineer1.modules.converter;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.my.iengineer1.R;

/**
 * Engineering unit converter:
 * Tabs: Length | Area | Volume | Weight | Pressure | Force
 */
public class UnitConverterActivity extends AppCompatActivity {

    // ── Unit definitions [name, factor_to_SI] ────────────────────────────────
    private static final String[][] LENGTH_UNITS = {
        {"متر (م)", "1"},         {"سنتيمتر (سم)", "0.01"},
        {"مليمتر (مم)", "0.001"}, {"كيلومتر (كم)", "1000"},
        {"قدم (ft)", "0.3048"},   {"بوصة (in)", "0.0254"},
        {"ياردة (yd)", "0.9144"}
    };
    private static final String[][] AREA_UNITS = {
        {"متر مربع (م²)",      "1"},           {"سنتيمتر مربع", "0.0001"},
        {"كيلومتر مربع",       "1000000"},     {"هكتار",        "10000"},
        {"فدان",               "4200.833"},    {"قيراط",        "175"},
        {"قدم مربع (ft²)",     "0.092903"},    {"بوصة مربع",    "0.00064516"}
    };
    private static final String[][] VOLUME_UNITS = {
        {"متر مكعب (م³)",   "1"},          {"سنتيمتر مكعب",  "0.000001"},
        {"لتر",             "0.001"},      {"مليلتر",         "0.000001"},
        {"قدم مكعب (ft³)", "0.0283168"},  {"بوصة مكعبة",     "0.000016387"},
        {"جالون (US)",     "0.003785"}
    };
    private static final String[][] WEIGHT_UNITS = {
        {"كيلوجرام (كج)",  "1"},      {"جرام",           "0.001"},
        {"طن متري",        "1000"},   {"جرام مللي",       "0.000001"},
        {"رطل (lb)",       "0.4536"}, {"أونصة (oz)",     "0.028349"},
        {"كيلو نيوتن (kN)","101.97"}
    };
    private static final String[][] PRESSURE_UNITS = {
        {"باسكال (Pa)",         "1"},       {"كيلوباسكال (kPa)", "1000"},
        {"ميجاباسكال (MPa)",    "1000000"}, {"بار",              "100000"},
        {"كج/سم²",              "98066.5"}, {"كج/م²",            "9.80665"},
        {"PSI",                 "6894.76"}
    };
    private static final String[][] FORCE_UNITS = {
        {"نيوتن (N)",       "1"},      {"كيلو نيوتن (kN)", "1000"},
        {"ميجا نيوتن (MN)", "1e6"},   {"كيلوجرام قوة",   "9.80665"},
        {"طن قوة",          "9806.65"},{"رطل قوة (lbf)",  "4.44822"}
    };

    private static final String[][][] ALL_UNITS = {
        LENGTH_UNITS, AREA_UNITS, VOLUME_UNITS, WEIGHT_UNITS, PRESSURE_UNITS, FORCE_UNITS
    };

    private TextInputEditText etInput;
    private TextView tvResult;
    private AutoCompleteTextView ddFrom, ddTo;
    private int currentTab = 0;
    private boolean updating = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_converter);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("محوّل الوحدات الهندسية");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        etInput  = findViewById(R.id.et_input_value);
        tvResult = findViewById(R.id.tv_result);
        ddFrom   = findViewById(R.id.dd_from_unit);
        ddTo     = findViewById(R.id.dd_to_unit);

        TabLayout tabs = findViewById(R.id.tabs_converter);
        String[] tabNames = {"طول", "مساحة", "حجم", "وزن", "ضغط", "قوة"};
        for (String t : tabNames) tabs.addTab(tabs.newTab().setText(t));

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override public void onTabSelected(TabLayout.Tab tab) {
                currentTab = tab.getPosition();
                populateDropdowns();
                convert();
            }
            @Override public void onTabUnselected(TabLayout.Tab tab) {}
            @Override public void onTabReselected(TabLayout.Tab tab) {}
        });

        populateDropdowns();

        AdapterView.OnItemClickListener listener = (parent, view, pos, id) -> convert();
        ddFrom.setOnItemClickListener(listener);
        ddTo.setOnItemClickListener(listener);

        etInput.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int st, int c, int a) {}
            @Override public void onTextChanged(CharSequence s, int st, int b, int c) {}
            @Override public void afterTextChanged(Editable s) { convert(); }
        });

        // Swap button
        findViewById(R.id.btn_swap).setOnClickListener(v -> {
            String tmp = ddFrom.getText().toString();
            ddFrom.setText(ddTo.getText().toString(), false);
            ddTo.setText(tmp, false);
            convert();
        });
    }

    private void populateDropdowns() {
        String[][] units = ALL_UNITS[currentTab];
        String[] names = new String[units.length];
        for (int i = 0; i < units.length; i++) names[i] = units[i][0];
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, names);
        ddFrom.setAdapter(adapter);
        ddTo.setAdapter(adapter);
        ddFrom.setText(names[0], false);
        ddTo.setText(names.length > 1 ? names[1] : names[0], false);
        tvResult.setText("0.000");
    }

    private void convert() {
        if (updating) return;
        updating = true;
        try {
            String inputStr = etInput.getText() != null ? etInput.getText().toString().trim() : "";
            if (inputStr.isEmpty()) { tvResult.setText("0.000"); return; }
            double value = Double.parseDouble(inputStr);

            String[][] units = ALL_UNITS[currentTab];
            double fromFactor = factorFor(units, ddFrom.getText().toString());
            double toFactor   = factorFor(units, ddTo.getText().toString());

            if (toFactor == 0) { tvResult.setText("خطأ"); return; }
            double result = value * (fromFactor / toFactor);

            // Smart formatting
            String formatted;
            if (result == 0) formatted = "0";
            else if (Math.abs(result) >= 1e6 || Math.abs(result) < 0.0001)
                formatted = String.format("%.6e", result);
            else if (Math.abs(result) >= 1000)
                formatted = String.format("%.3f", result);
            else
                formatted = String.format("%.6f", result).replaceAll("0+$", "").replaceAll("\\.$", "");

            tvResult.setText(formatted);
        } catch (NumberFormatException e) {
            tvResult.setText("أدخل رقماً صحيحاً");
        } finally {
            updating = false;
        }
    }

    private double factorFor(String[][] units, String name) {
        for (String[] u : units) {
            if (u[0].equals(name)) {
                try { return Double.parseDouble(u[1]); }
                catch (Exception e) { return Double.parseDouble(u[1].replace("e", "E")); }
            }
        }
        return 1;
    }

    @Override public boolean onSupportNavigateUp() { finish(); return true; }
}
