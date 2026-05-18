package com.my.iengineer1.modules.sanitation;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.my.iengineer1.R;

/**
 * Sanitation engineering calculations:
 * - Sewer pipe trench excavation
 * - Pipe lengths and diameters
 * - Manholes count and volume
 * - Pipe bedding volumes
 * - Backfill volumes
 */
public class SanitationActivity extends AppCompatActivity {

    private TextInputEditText etPipeLength, etTrenchWidth, etTrenchDepth,
            etPipeDiameter, etManholeCount, etManholeDepth;
    private TextView tvTrenchExcav, tvPipeBedding, tvBackfill, tvManholeVol, tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanitation);

        initViews();
        setupListeners();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("حصر الصرف الصحي");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private void initViews() {
        etPipeLength   = findViewById(R.id.et_pipe_length);
        etTrenchWidth  = findViewById(R.id.et_trench_width);
        etTrenchDepth  = findViewById(R.id.et_trench_depth);
        etPipeDiameter = findViewById(R.id.et_pipe_diameter);
        etManholeCount = findViewById(R.id.et_manhole_count);
        etManholeDepth = findViewById(R.id.et_manhole_depth);
        tvTrenchExcav  = findViewById(R.id.tv_trench_excav);
        tvPipeBedding  = findViewById(R.id.tv_pipe_bedding);
        tvBackfill     = findViewById(R.id.tv_backfill);
        tvManholeVol   = findViewById(R.id.tv_manhole_vol);
        tvTotal        = findViewById(R.id.tv_sanitation_total);
    }

    private void setupListeners() {
        TextWatcher watcher = new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override public void onTextChanged(CharSequence s, int start, int before, int count) {}
            @Override public void afterTextChanged(Editable s) { calculate(); }
        };
        etPipeLength.addTextChangedListener(watcher);
        etTrenchWidth.addTextChangedListener(watcher);
        etTrenchDepth.addTextChangedListener(watcher);
        etPipeDiameter.addTextChangedListener(watcher);
        etManholeCount.addTextChangedListener(watcher);
        etManholeDepth.addTextChangedListener(watcher);
    }

    private void calculate() {
        double pipeLen     = parseDouble(etPipeLength);
        double trenchW     = parseDouble(etTrenchWidth);
        double trenchD     = parseDouble(etTrenchDepth);
        double pipeDiam    = parseDouble(etPipeDiameter) / 1000.0; // mm → m
        double manholes    = parseDouble(etManholeCount);
        double manholeD    = parseDouble(etManholeDepth);

        if (pipeLen <= 0 || trenchW <= 0 || trenchD <= 0) return;

        double trenchExcav    = pipeLen * trenchW * trenchD;
        double pipeRadius     = pipeDiam / 2.0;
        double pipeCrossArea  = Math.PI * pipeRadius * pipeRadius;
        double pipeBedding    = pipeLen * trenchW * 0.10; // 10 cm bedding
        double pipeVol        = pipeCrossArea * pipeLen;
        double backfill       = trenchExcav - pipeVol - pipeBedding;
        double manholeVol     = manholes * (Math.PI * 0.6 * 0.6 * manholeD); // 1.2m dia manhole

        tvTrenchExcav.setText(String.format("%.3f م³", trenchExcav));
        tvPipeBedding.setText(String.format("%.3f م³", pipeBedding));
        tvBackfill.setText(String.format("%.3f م³", Math.max(0, backfill)));
        tvManholeVol.setText(String.format("%.3f م³  (×%.0f غرفة)", manholeVol, manholes));
        tvTotal.setText(String.format(
                "طول الخط: %.1f م  |  إجمالي الحفر: %.3f م³",
                pipeLen, trenchExcav + manholeVol));
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
