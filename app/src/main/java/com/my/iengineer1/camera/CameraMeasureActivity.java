package com.my.iengineer1.camera;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.android.material.button.MaterialButton;
import com.google.common.util.concurrent.ListenableFuture;
import com.my.iengineer1.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CameraMeasureActivity extends AppCompatActivity {

    private static final int CAMERA_PERMISSION_REQUEST = 100;
    private static final String MODE_MEASURE = "MEASURE";
    private static final String MODE_COUNT   = "COUNT";

    private PreviewView previewView;
    private TextView tvResult, tvMode, tvHint;
    private MaterialButton btnToggle, btnCapture;
    private ExecutorService cameraExecutor;
    private EngineeringImageAnalyzer analyzer;
    private String currentMode = MODE_MEASURE;
    private String lastResult = "";
    private double lastWidthM = 0, lastHeightM = 0, lastAreaM2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_measure);

        previewView = findViewById(R.id.preview_view);
        tvResult    = findViewById(R.id.tv_measure_result);
        tvMode      = findViewById(R.id.tv_mode);
        tvHint      = findViewById(R.id.tv_hint);
        btnToggle   = findViewById(R.id.btn_toggle_mode);
        btnCapture  = findViewById(R.id.btn_capture);

        cameraExecutor = Executors.newSingleThreadExecutor();

        btnToggle.setOnClickListener(v -> toggleMode());
        btnCapture.setOnClickListener(v -> captureResult());
        findViewById(R.id.btn_back).setOnClickListener(v -> finish());

        updateModeUI();

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_GRANTED) {
            startCamera();
        } else {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CAMERA}, CAMERA_PERMISSION_REQUEST);
        }
    }

    private void toggleMode() {
        currentMode = MODE_MEASURE.equals(currentMode) ? MODE_COUNT : MODE_MEASURE;
        updateModeUI();
        if (analyzer != null) analyzer.setMode(currentMode);
        tvResult.setText("جارٍ التحليل...");
    }

    private void updateModeUI() {
        if (MODE_MEASURE.equals(currentMode)) {
            tvMode.setText("وضع القياس");
            btnToggle.setText("تبديل → العد");
            tvHint.setText("وجّه الكاميرا نحو العنصر الهندسي للحصول على قياسات تقديرية");
        } else {
            tvMode.setText("وضع العد");
            btnToggle.setText("تبديل → القياس");
            tvHint.setText("وجّه الكاميرا نحو العناصر المتشابهة لعدّها تلقائياً");
        }
    }

    private void captureResult() {
        if (lastResult.isEmpty()) {
            Toast.makeText(this, "لا توجد نتيجة بعد", Toast.LENGTH_SHORT).show();
            return;
        }
        android.content.Intent resultIntent = new android.content.Intent();
        resultIntent.putExtra("width_value",  lastWidthM);
        resultIntent.putExtra("height_value", lastHeightM);
        resultIntent.putExtra("area_value",   lastAreaM2);
        resultIntent.putExtra("full_result",  lastResult);
        setResult(RESULT_OK, resultIntent);
        finish();
    }

    private double extractDouble(String text, String label) {
        int idx = text.indexOf(label);
        if (idx == -1) return 0;
        java.util.regex.Matcher m =
                java.util.regex.Pattern.compile("([0-9]+\\.?[0-9]*)").matcher(text.substring(idx));
        if (m.find()) {
            try { return Double.parseDouble(m.group(1)); } catch (Exception ignored) {}
        }
        return 0;
    }

    private void startCamera() {
        ListenableFuture<ProcessCameraProvider> future =
                ProcessCameraProvider.getInstance(this);
        future.addListener(() -> {
            try {
                ProcessCameraProvider provider = future.get();
                bindCamera(provider);
            } catch (ExecutionException | InterruptedException e) {
                Toast.makeText(this, "خطأ في تشغيل الكاميرا", Toast.LENGTH_SHORT).show();
            }
        }, ContextCompat.getMainExecutor(this));
    }

    private void bindCamera(ProcessCameraProvider provider) {
        Preview preview = new Preview.Builder().build();
        preview.setSurfaceProvider(previewView.getSurfaceProvider());

        analyzer = new EngineeringImageAnalyzer(currentMode, (measureText, countText) ->
                runOnUiThread(() -> {
                    String result = measureText != null ? measureText : countText;
                    if (result != null) {
                        lastResult = result;
                        tvResult.setText(result);
                        if (measureText != null) {
                            lastWidthM  = extractDouble(measureText, "العرض التقديري");
                            lastHeightM = extractDouble(measureText, "الارتفاع التقديري");
                            lastAreaM2  = extractDouble(measureText, "المساحة التقديرية");
                        }
                    }
                }));

        ImageAnalysis analysis = new ImageAnalysis.Builder()
                .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
                .build();
        analysis.setAnalyzer(cameraExecutor, analyzer);

        try {
            provider.unbindAll();
            provider.bindToLifecycle(this, CameraSelector.DEFAULT_BACK_CAMERA, preview, analysis);
        } catch (Exception e) {
            Toast.makeText(this, "فشل تشغيل الكاميرا", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int code, @NonNull String[] perms, @NonNull int[] results) {
        super.onRequestPermissionsResult(code, perms, results);
        if (code == CAMERA_PERMISSION_REQUEST && results.length > 0
                && results[0] == PackageManager.PERMISSION_GRANTED) {
            startCamera();
        } else {
            Toast.makeText(this, "يجب منح إذن الكاميرا", Toast.LENGTH_LONG).show();
            finish();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        cameraExecutor.shutdown();
    }
}
