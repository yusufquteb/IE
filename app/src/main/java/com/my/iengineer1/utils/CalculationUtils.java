package com.my.iengineer1.utils;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

public class CalculationUtils {
    private static final String TAG = "CalculationUtils";
    public static final double MAX_DIMENSION = 1000.0;
    public static final double MIN_DIMENSION = 0.01;
    
    public static double calculateAreaByShape(String shape, double length, double width, double radius, double irregularArea) {
        try {
            switch (shape) {
                case "Rectangular":
                    return length * width;
                case "Circular":
                    return Math.PI * radius * radius;
                case "Irregular":
                    return irregularArea;
                default:
                    return 0.0;
            }
        } catch (Exception e) {
            Log.e(TAG, "Error in area calculation", e);
            return 0.0;
        }
    }

    public static String formatNumber(double value) {
        return String.format(Locale.US, "%.2f", value);
    }

    public static double parseDoubleOrDefault(String value, double defaultValue) {
        try {
            return TextUtils.isEmpty(value) ? defaultValue : Double.parseDouble(value.trim());
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public static boolean isValidDimension(double dimension) {
        return dimension >= MIN_DIMENSION && dimension <= MAX_DIMENSION;
    }

    public static boolean isValidArea(double area) {
        return area > 0 && area <= MAX_DIMENSION * MAX_DIMENSION;
    }

    public static boolean isValidQuantity(int quantity) {
        return quantity > 0 && quantity <= 100;
    }
}