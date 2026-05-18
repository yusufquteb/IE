package com.my.iengineer1.modules.roads;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.my.iengineer1.R;

/**
 * Roads engineering calculations:
 * - Earthwork (cut & fill volumes)
 * - Subbase, base course quantities
 * - Asphalt surface course
 * - Road markings and signage areas
 */
public class RoadsActivity extends AppCompatActivity {

    private TextInputEditText etLength, etWidth, etSubbaseDepth, etBaseDepth, etAsphaltDepth;
    private TextView tvSubbaseVol, tvBaseVol, tvAsphaltVol, tvEarthwork, tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roads);

        initViews();
        setupListeners();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("حصر الطرق");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void initViews() {
        etLength        = findViewById(R.id.et_road_length);
        etWidth         = findViewById(R.id.et_road_width);
        etSubbaseDepth  = findViewById(R.id.et_subbase_depth);
        etBaseDepth     = findViewById(R.id.et_base_depth);
        etAsphaltDepth  = findViewById(R.id.et_asphalt_depth);
        tvSubbaseVol    = findViewById(R.id.tv_subbase_vol);
        tvBaseVol       = findViewById(R.id.tv_base_vol);
        tvAsphaltVol    = findViewById(R.id.tv_asphalt_vol);
        tvEarthwork     = findViewById(R.id.tv_earthwork);
        tvTotal         = findViewById(R.id.tv_roads_total);
    }

    private void setupListeners() {
        TextWatcher watcher = new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override public void onTextChanged(CharSequence s, int start, int before, int count) {}
            @Override public void afterTextChanged(Editable s) { calculate(); }
        };

        etLength.addTextChangedListener(watcher);
        etWidth.addTextChangedListener(watcher);
        etSubbaseDepth.addTextChangedListener(watcher);
        etBaseDepth.addTextChangedListener(watcher);
        etAsphaltDepth.addTextChangedListener(watcher);
    }

    private void calculate() {
        double L = parseDouble(etLength);
        double W = parseDouble(etWidth);
        double subbaseD = parseDouble(etSubbaseDepth);
        double baseD    = parseDouble(etBaseDepth);
        double asphaltD = parseDouble(etAsphaltDepth);

        if (L <= 0 || W <= 0) return;

        double area        = L * W;
        double subbaseVol  = area * subbaseD;
        double baseVol     = area * baseD;
        double asphaltVol  = area * asphaltD;
        double earthwork   = area * (subbaseD + baseD + asphaltD + 0.3);
        double totalExcav  = subbaseVol + baseVol + asphaltVol;

        tvSubbaseVol.setText(String.format("%.3f م³", subbaseVol));
        tvBaseVol.setText(String.format("%.3f م³", baseVol));
        tvAsphaltVol.setText(String.format("%.3f م³ (%.1f طن)", asphaltVol, asphaltVol * 2.4));
        tvEarthwork.setText(String.format("%.3f م³", earthwork));
        tvTotal.setText(String.format("المساحة: %.1f م²  |  إجمالي الحفر: %.3f م³", area, totalExcav));
    }

    private double parseDouble(TextInputEditText et) {
        try {
            String s = et.getText() != null ? et.getText().toString().trim() : "";
            return s.isEmpty() ? 0 : Double.parseDouble(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
