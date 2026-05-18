package com.my.iengineer1.camera;

import android.annotation.SuppressLint;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.objects.DetectedObject;
import com.google.mlkit.vision.objects.ObjectDetection;
import com.google.mlkit.vision.objects.ObjectDetector;
import com.google.mlkit.vision.objects.defaults.ObjectDetectorOptions;
import java.util.List;

/**
 * Real-time camera analyzer using ML Kit Object Detection.
 * MODE "COUNT" : counts distinct objects detected in each frame.
 * MODE "MEASURE": estimates element dimensions using bounding-box
 *                 proportions and a reference object assumption.
 */
public class EngineeringImageAnalyzer implements ImageAnalysis.Analyzer {

    public interface ResultCallback {
        void onResult(String measureText, String countText);
    }

    private final ResultCallback callback;
    private String mode;

    private final ObjectDetector detector;
    private long lastProcessed = 0;
    private static final long MIN_INTERVAL_MS = 400;

    public EngineeringImageAnalyzer(String mode, ResultCallback callback) {
        this.mode     = mode;
        this.callback = callback;

        ObjectDetectorOptions options = new ObjectDetectorOptions.Builder()
                .setDetectorMode(ObjectDetectorOptions.STREAM_MODE)
                .enableMultipleObjects()
                .enableClassification()
                .build();
        this.detector = ObjectDetection.getClient(options);
    }

    public void setMode(String mode) { this.mode = mode; }

    @Override
    @SuppressLint("UnsafeOptInUsageError")
    public void analyze(@NonNull ImageProxy imageProxy) {
        long now = System.currentTimeMillis();
        if (now - lastProcessed < MIN_INTERVAL_MS) {
            imageProxy.close();
            return;
        }
        lastProcessed = now;

        Image mediaImage = imageProxy.getImage();
        if (mediaImage == null) {
            imageProxy.close();
            return;
        }

        InputImage inputImage = InputImage.fromMediaImage(mediaImage, imageProxy.getImageInfo().getRotationDegrees());

        detector.process(inputImage)
                .addOnSuccessListener(detectedObjects -> {
                    processResults(detectedObjects, imageProxy.getWidth(), imageProxy.getHeight());
                    imageProxy.close();
                })
                .addOnFailureListener(e -> imageProxy.close());
    }

    private void processResults(List<DetectedObject> objects, int imgW, int imgH) {
        if ("COUNT".equals(mode)) {
            buildCountResult(objects);
        } else {
            buildMeasureResult(objects, imgW, imgH);
        }
    }

    private void buildCountResult(List<DetectedObject> objects) {
        int total = objects.size();
        if (total == 0) {
            callback.onResult(null, "لا توجد عناصر في الإطار\nوجّه الكاميرا نحو العناصر المراد عدّها");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("عدد العناصر المكتشفة: ").append(total).append("\n\n");
        for (int i = 0; i < objects.size(); i++) {
            DetectedObject obj = objects.get(i);
            String label = "عنصر غير محدد";
            if (!obj.getLabels().isEmpty()) {
                label = obj.getLabels().get(0).getText();
                int conf = (int)(obj.getLabels().get(0).getConfidence() * 100);
                label += " (" + conf + "%)";
            }
            sb.append(i + 1).append(". ").append(label).append("\n");
        }
        callback.onResult(null, sb.toString().trim());
    }

    private void buildMeasureResult(List<DetectedObject> objects, int imgW, int imgH) {
        if (objects.isEmpty()) {
            callback.onResult("لا توجد عناصر — وجّه الكاميرا نحو العنصر المراد قياسه\n"
                    + "⚠ للدقة: ضع مرجع معلوم (مثل خط 1م) في الإطار", null);
            return;
        }

        // Use the largest detected bounding box as the primary element
        DetectedObject primary = objects.get(0);
        for (DetectedObject obj : objects) {
            if (boxArea(obj) > boxArea(primary)) primary = obj;
        }

        android.graphics.Rect box = primary.getBoundingBox();
        // Assume the object fills ~50% of a typical 1-metre reference in the frame.
        // This gives a rough metric estimation (not ARCore-accurate).
        double pixelsPerMeter = imgH * 0.5;
        double widthM  = box.width()  / pixelsPerMeter;
        double heightM = box.height() / pixelsPerMeter;
        double areaM2  = widthM * heightM;
        double perimM  = 2 * (widthM + heightM);

        String label = objects.size() + " عناصر مكتشفة";
        if (!primary.getLabels().isEmpty()) label = primary.getLabels().get(0).getText();

        String result = String.format(
                "العنصر: %s\n" +
                "العرض التقديري:  %.2f م\n" +
                "الارتفاع التقديري: %.2f م\n" +
                "المساحة التقديرية: %.3f م²\n" +
                "المحيط التقديري: %.2f م\n\n" +
                "⚠ للقياس الدقيق استخدم وضع ARCore",
                label, widthM, heightM, areaM2, perimM);
        callback.onResult(result, null);
    }

    private int boxArea(DetectedObject obj) {
        return obj.getBoundingBox().width() * obj.getBoundingBox().height();
    }
}
