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
import com.google.common.util.concurrent.ListenableFuture;
import com.my.iengineer1.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Camera-based measurement and object counting activity.
 * Uses CameraX for live preview and ML Kit for object detection/counting.
 */
public class CameraMeasureActivity extends AppCompatActivity {

    private static final int CAMERA_PERMISSION_REQUEST = 100;
    private static final String[] REQUIRED_PERMISSIONS = {Manifest.permission.CAMERA};

    private PreviewView previewView;
    private TextView tvMeasureResult;
    private TextView tvCountResult;
    private TextView tvMode;
    private ExecutorService cameraExecutor;
    private String currentMode = "MEASURE"; // MEASURE or COUNT

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_measure);

        previewView = findViewById(R.id.preview_view);
        tvMeasureResult = findViewById(R.id.tv_measure_result);
        tvCountResult = findViewById(R.id.tv_count_result);
        tvMode = findViewById(R.id.tv_mode);

        cameraExecutor = Executors.newSingleThreadExecutor();

        findViewById(R.id.btn_toggle_mode).setOnClickListener(v -> toggleMode());
        findViewById(R.id.btn_capture).setOnClickListener(v -> captureResult());
        findViewById(R.id.btn_back).setOnClickListener(v -> finish());

        if (allPermissionsGranted()) {
            startCamera();
        } else {
            ActivityCompat.requestPermissions(this, REQUIRED_PERMISSIONS, CAMERA_PERMISSION_REQUEST);
        }
    }

    private void toggleMode() {
        if ("MEASURE".equals(currentMode)) {
            currentMode = "COUNT";
            tvMode.setText("وضع العد بالكاميرا");
        } else {
            currentMode = "MEASURE";
            tvMode.setText("وضع القياس بالكاميرا");
        }
    }

    private void captureResult() {
        String result = "MEASURE".equals(currentMode)
                ? tvMeasureResult.getText().toString()
                : tvCountResult.getText().toString();
        Toast.makeText(this, "تم حفظ النتيجة: " + result, Toast.LENGTH_SHORT).show();
    }

    private void startCamera() {
        ListenableFuture<ProcessCameraProvider> cameraProviderFuture =
                ProcessCameraProvider.getInstance(this);

        cameraProviderFuture.addListener(() -> {
            try {
                ProcessCameraProvider cameraProvider = cameraProviderFuture.get();
                bindCameraUseCases(cameraProvider);
            } catch (ExecutionException | InterruptedException e) {
                Toast.makeText(this, "خطأ في تشغيل الكاميرا", Toast.LENGTH_SHORT).show();
            }
        }, ContextCompat.getMainExecutor(this));
    }

    private void bindCameraUseCases(ProcessCameraProvider cameraProvider) {
        Preview preview = new Preview.Builder().build();
        preview.setSurfaceProvider(previewView.getSurfaceProvider());

        ImageAnalysis imageAnalysis = new ImageAnalysis.Builder()
                .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
                .build();

        imageAnalysis.setAnalyzer(cameraExecutor, new EngineeringImageAnalyzer(
                currentMode,
                (measureText, countText) -> runOnUiThread(() -> {
                    if (measureText != null) tvMeasureResult.setText(measureText);
                    if (countText != null) tvCountResult.setText(countText);
                })
        ));

        CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;

        try {
            cameraProvider.unbindAll();
            cameraProvider.bindToLifecycle(this, cameraSelector, preview, imageAnalysis);
        } catch (Exception e) {
            Toast.makeText(this, "فشل ربط الكاميرا", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean allPermissionsGranted() {
        for (String permission : REQUIRED_PERMISSIONS) {
            if (ContextCompat.checkSelfPermission(this, permission)
                    != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == CAMERA_PERMISSION_REQUEST) {
            if (allPermissionsGranted()) {
                startCamera();
            } else {
                Toast.makeText(this, "يلزم منح إذن الكاميرا", Toast.LENGTH_SHORT).show();
                finish();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        cameraExecutor.shutdown();
    }
}
