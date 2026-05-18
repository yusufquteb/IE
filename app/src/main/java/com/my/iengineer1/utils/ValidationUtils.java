package com.my.iengineer1.utils;

import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import android.content.Context;
import android.util.Log;

public class ValidationUtils {
    
    public static boolean validateDimension(TextInputLayout layout, EditText editText, String dimensionName) {
        String value = editText.getText().toString().trim();
        
        if (TextUtils.isEmpty(value)) {
            layout.setHelperText(null);
            return true;
        }

        try {
            double dimension = Double.parseDouble(value);
            if (!CalculationUtils.isValidDimension(dimension)) {
                layout.setHelperText(dimensionName + " must be between " + 
                    CalculationUtils.MIN_DIMENSION + " and " + 
                    CalculationUtils.MAX_DIMENSION);
                return false;
            } else {
                layout.setHelperText(null);
                return true;
            }
        } catch (NumberFormatException e) {
            layout.setHelperText("Invalid " + dimensionName);
            return false;
        }
    }

    public static boolean validateArea(TextInputLayout layout, EditText areaField) {
        String value = areaField.getText().toString().trim();
        
        if (TextUtils.isEmpty(value)) {
            layout.setHelperText("Area is required");
            return false;
        }

        try {
            double areaValue = Double.parseDouble(value);
            if (!CalculationUtils.isValidArea(areaValue)) {
                layout.setHelperText("Invalid area value");
                return false;
            }
            layout.setHelperText(null);
            return true;
        } catch (NumberFormatException e) {
            layout.setHelperText("Invalid area");
            return false;
        }
    }

    public static boolean validateQuantity(TextInputLayout layout, EditText quantityField) {
        String value = quantityField.getText().toString().trim();
        
        if (TextUtils.isEmpty(value)) {
            layout.setHelperText("Quantity is required");
            return false;
        }

        try {
            int quantity = Integer.parseInt(value);
            if (!CalculationUtils.isValidQuantity(quantity)) {
                layout.setHelperText("Quantity must be between 1 and 100");
                return false;
            }
            layout.setHelperText(null);
            return true;
        } catch (NumberFormatException e) {
            layout.setHelperText("Invalid quantity");
            return false;
        }
    }
}