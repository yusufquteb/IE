package com.my.iengineer1;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;
import java.util.Locale;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;

public class SummaryTableFragmentActivity extends Fragment implements StateManager.StateChangeListener {
    private Map<String, EditText> unitPriceFields = new HashMap<>();
    private Map<String, EditText> quantityFields = new HashMap<>();
    private Map<String, TextView> totalPriceFields = new HashMap<>();
    private View view;
    private static final String TAG = "SummaryTableFragment";

    @Override
    public void onDestroy() {
        StateManager.removeListener(this);
        super.onDestroy();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.summary_table_fragment, container, false);
        initializeFields();
        setupTextWatchers();
        
        // Initialize with current value
        double currentBrickwork = StateManager.getBrickworkQuantity();
        if (currentBrickwork > 0) {
            updateQuantityBrickwork(String.format(Locale.US, "%.2f", currentBrickwork));
        }
        
        return view;
    }
    
    @Override
    public void onTotalNetAreaChanged(double area) {
        try {
            if (isAdded()) {
                requireActivity().runOnUiThread(() -> {
                    // Update brickwork quantity with the new net area
                    updateQuantityBrickwork(String.format(Locale.US, "%.2f", area));
                    
                    // Recalculate totals
                    calculateTotal("brickwork");
                });
            }
        } catch (Exception e) {
            Log.e(TAG, "Error handling net area update", e);
        }
    }
    
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StateManager.addListener(this);
        
        // Initialize with current value on creation
        double currentNetArea = StateManager.getCurrentTotalNetArea();
        if (currentNetArea > 0) {
            updateQuantityBrickwork(String.format(Locale.US, "%.2f", currentNetArea));
        }
    }
    
    @Override
    public void onBrickworkQuantityChanged(double quantity) {
        try {
            EditText brickworkField = quantityFields.get("brickwork");
            if (brickworkField != null && isAdded()) {
                requireActivity().runOnUiThread(() -> 
                    brickworkField.setText(String.format(Locale.US, "%.2f", quantity))
                );
            }
        } catch (Exception e) {
            Log.e(TAG, "Error updating brickwork quantity", e);
        }
    }
   
    
    @Override
    public void onTotalOpeningAreaChanged(double area) {
        // Implementation not needed for this fragment
    }

    private void initializeFields() {
        // Initialize unit price fields
        unitPriceFields.put("concrete", view.findViewById(R.id.unitPriceConcrete));
        unitPriceFields.put("steel", view.findViewById(R.id.unitPriceSteel));
        unitPriceFields.put("brickwork", view.findViewById(R.id.unitPriceBrickwork));
        unitPriceFields.put("plaster", view.findViewById(R.id.unitPricePlaster));
        unitPriceFields.put("painting", view.findViewById(R.id.unitPricePainting));
        unitPriceFields.put("flooring", view.findViewById(R.id.unitPriceFlooring));
        unitPriceFields.put("roofing", view.findViewById(R.id.unitPriceRoofing));
        unitPriceFields.put("doors", view.findViewById(R.id.unitPriceDoors));
        unitPriceFields.put("windows", view.findViewById(R.id.Unit_Price9));
        unitPriceFields.put("ceiling", view.findViewById(R.id.Unit_Price10));
        unitPriceFields.put("electricWork", view.findViewById(R.id.Unit_Price11));
        unitPriceFields.put("plumbingWork", view.findViewById(R.id.Unit_Price12));
        unitPriceFields.put("tiles", view.findViewById(R.id.unitPriceTiles));
        unitPriceFields.put("glasswork", view.findViewById(R.id.unitPriceGlasswork));
        unitPriceFields.put("woodwork", view.findViewById(R.id.unitPriceWoodwork));
        unitPriceFields.put("waterproofing", view.findViewById(R.id.unitPriceWaterproofing));
        unitPriceFields.put("landscaping", view.findViewById(R.id.unitPriceLandscaping));

        // Initialize quantity fields
        quantityFields.put("concrete", view.findViewById(R.id.quantityConcrete));
        quantityFields.put("steel", view.findViewById(R.id.quantitySteel));
        quantityFields.put("brickwork", view.findViewById(R.id.quantityBrickwork));
        quantityFields.put("plaster", view.findViewById(R.id.quantityPlaster));
        quantityFields.put("painting", view.findViewById(R.id.quantityPainting));
        quantityFields.put("flooring", view.findViewById(R.id.quantityFlooring));
        quantityFields.put("roofing", view.findViewById(R.id.quantityRoofing));
        quantityFields.put("doors", view.findViewById(R.id.quantityDoors));
        quantityFields.put("windows", view.findViewById(R.id.quantityWindows));
        quantityFields.put("ceiling", view.findViewById(R.id.quantityCeiling));
        quantityFields.put("electricWork", view.findViewById(R.id.quantityElectricWork));
        quantityFields.put("plumbingWork", view.findViewById(R.id.quantityPlumbingWork));
        quantityFields.put("tiles", view.findViewById(R.id.quantityTiles));
        quantityFields.put("glasswork", view.findViewById(R.id.quantityGlasswork));
        quantityFields.put("woodwork", view.findViewById(R.id.quantityWoodwork));
        quantityFields.put("waterproofing", view.findViewById(R.id.quantityWaterproofing));
        quantityFields.put("landscaping", view.findViewById(R.id.quantityLandscaping));

        // Initialize total price fields
        totalPriceFields.put("concrete", view.findViewById(R.id.totalPriceConcrete));
        totalPriceFields.put("steel", view.findViewById(R.id.totalPriceSteel));
        totalPriceFields.put("brickwork", view.findViewById(R.id.totalPriceBrickwork));
        totalPriceFields.put("plaster", view.findViewById(R.id.totalPricePlaster));
        totalPriceFields.put("painting", view.findViewById(R.id.totalPricePainting));
        totalPriceFields.put("flooring", view.findViewById(R.id.totalPriceFlooring));
        totalPriceFields.put("roofing", view.findViewById(R.id.totalPriceRoofing));
        totalPriceFields.put("doors", view.findViewById(R.id.totalPriceDoors));
        totalPriceFields.put("windows", view.findViewById(R.id.Total_Price9));
        totalPriceFields.put("ceiling", view.findViewById(R.id.Total_Price10));
        totalPriceFields.put("electricWork", view.findViewById(R.id.Total_Price11));
        totalPriceFields.put("plumbingWork", view.findViewById(R.id.Total_Price12));
        totalPriceFields.put("tiles", view.findViewById(R.id.totalPriceTiles));
        totalPriceFields.put("glasswork", view.findViewById(R.id.totalPriceGlasswork));
        totalPriceFields.put("woodwork", view.findViewById(R.id.totalPriceWoodwork));
        totalPriceFields.put("waterproofing", view.findViewById(R.id.totalPriceWaterproofing));
        totalPriceFields.put("landscaping", view.findViewById(R.id.totalPriceLandscaping));
    }
    
    public void updateQuantity(String field, String value) {
        EditText quantityField = quantityFields.get(field);
        if (quantityField != null) {
            quantityField.setText(value);
        }
    }

    private void setupTextWatchers() {
        // Add TextWatchers to all unit price and quantity fields
        for (String key : unitPriceFields.keySet()) {
            EditText unitPriceField = unitPriceFields.get(key);
            EditText quantityField = quantityFields.get(key);
            
            if (unitPriceField != null) {
                unitPriceField.addTextChangedListener(new CustomTextWatcher(key));
            }
            if (quantityField != null) {
                quantityField.addTextChangedListener(new CustomTextWatcher(key));
            }
        }
    }

    private class CustomTextWatcher implements TextWatcher {
        private String key;

        public CustomTextWatcher(String key) {
            this.key = key;
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            // Not needed
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            // Not needed
        }

        @Override
        public void afterTextChanged(Editable s) {
            calculateTotal(key);
        }
    }

    private void calculateTotal(String key) {
        EditText unitPriceField = unitPriceFields.get(key);
        EditText quantityField = quantityFields.get(key);
        TextView totalPriceField = totalPriceFields.get(key);

        if (unitPriceField == null || quantityField == null || totalPriceField == null) {
            return;
        }

        try {
            String unitPriceStr = unitPriceField.getText().toString().trim();
            String quantityStr = quantityField.getText().toString().trim();

            // Check for empty fields
            if (unitPriceStr.isEmpty() || quantityStr.isEmpty()) {
                totalPriceField.setText("0.00");
                return;
            }

            // Parse values
            double unitPrice = Double.parseDouble(unitPriceStr);
            double quantity = Double.parseDouble(quantityStr);

            // Calculate and format total
            double total = unitPrice * quantity;
            String formattedTotal = String.format("%.2f", total);

            // Update total price field
            totalPriceField.setText(formattedTotal);

        } catch (NumberFormatException e) {
            // Handle invalid number format
            totalPriceField.setText("0.00");
        }
    }

    // Method to calculate grand total (if needed)
    private double calculateGrandTotal() {
        double grandTotal = 0.0;
        
        for (TextView totalPriceField : totalPriceFields.values()) {
            if (totalPriceField != null) {
                try {
                    String totalStr = totalPriceField.getText().toString();
                    if (!totalStr.isEmpty()) {
                        grandTotal += Double.parseDouble(totalStr);
                    }
                } catch (NumberFormatException e) {
                    // Skip invalid numbers
                }
            }
        }
        
        return grandTotal;
    }
    
    // Specific methods for each field
    public void updateQuantityBrickwork(String value) {
        updateQuantity("brickwork", value);
    }

    public void updateQuantityPlaster(String value) {
        updateQuantity("plaster", value);
    }

    public void updateQuantityPainting(String value) {
        updateQuantity("painting", value);
    }

    // Getter method to check if a field exists
    public boolean hasQuantityField(String field) {
        return quantityFields.containsKey(field);
    }
}