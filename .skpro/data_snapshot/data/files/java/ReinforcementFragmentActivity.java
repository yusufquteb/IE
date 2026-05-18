package com.my.iengineer1;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.my.iengineer1.utils.ValidationUtils;
import com.my.iengineer1.utils.CalculationUtils;
import com.my.iengineer1.utils.InputUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import android.util.Log;
import android.widget.ImageView;
import org.json.JSONObject;
import java.util.concurrent.atomic.AtomicBoolean;

public class ReinforcementFragmentActivity extends Fragment {
    private static final String TAG = "ReinforcementFragment";
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final AtomicBoolean isCalculating = new AtomicBoolean(false);
    private static final double STEEL_DENSITY = 7850.0; // kg/m³
    
    // Fragment identifiers
    private UUID reinforcementId;
    private ReinforcementData currentReinforcementData;
    
    // UI Components
    private EditText len, radius, no, totalWeight, name;
    private TextInputLayout lenLayout, radiusLayout, noLayout;
    private ImageView remove_button;
    private View rootView;
    
    public static class ReinforcementData {
        UUID id;
        String name;
        String type;
        double length;
        double radius;
        int quantity;
        double totalWeight;
        String selectedStructureType = "COLUMN"; // Default value
        
        public JSONObject toJson() {
            try {
                JSONObject json = new JSONObject();
                json.put("id", id.toString());
                json.put("name", name != null ? name : "");
                json.put("type", type != null ? type : "");
                json.put("length", length);
                json.put("radius", radius);
                json.put("quantity", quantity);
                json.put("totalWeight", totalWeight);
                json.put("selectedStructureType", selectedStructureType != null ? selectedStructureType : "COLUMN");
                return json;
            } catch (Exception e) {
                Log.e(TAG, "Error converting reinforcement data to JSON", e);
                return new JSONObject();
            }
        }
    }
    
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate called");
        try {
            reinforcementId = UUID.randomUUID();
            currentReinforcementData = new ReinforcementData();
            currentReinforcementData.id = reinforcementId;
            currentReinforcementData.quantity = 1;
            currentReinforcementData.name = "";
            currentReinforcementData.type = "";
            currentReinforcementData.length = 0.0;
            currentReinforcementData.radius = 0.0;
            currentReinforcementData.totalWeight = 0.0;
            Log.d(TAG, "onCreate completed successfully");
        } catch (Exception e) {
            Log.e(TAG, "Error in onCreate", e);
        }
    }
    
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                           @Nullable Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView called");
        try {
            if (getContext() == null) {
                Log.e(TAG, "Context is null in onCreateView");
                return createErrorView();
            }
            
            rootView = inflater.inflate(R.layout.reinforcement_fragment, container, false);
            Log.d(TAG, "Layout inflated successfully");
            
            if (rootView == null) {
                Log.e(TAG, "Root view is null after inflation");
                return createErrorView();
            }
            
            initialize(rootView);
            Log.d(TAG, "Fragment initialized successfully");
            return rootView;
        } catch (Exception e) {
            Log.e(TAG, "Error in onCreateView", e);
            return createErrorView();
        }
    }
    
    private View createErrorView() {
        try {
            LinearLayout errorLayout = new LinearLayout(getContext());
            errorLayout.setOrientation(LinearLayout.VERTICAL);
            int padding = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 16, getResources().getDisplayMetrics());
            errorLayout.setPadding(padding, padding, padding, padding);
            
            // Add error text or simple view
            EditText errorText = new EditText(getContext());
            errorText.setText("Error loading reinforcement component");
            errorText.setEnabled(false);
            errorLayout.addView(errorText);
            
            return errorLayout;
        } catch (Exception ex) {
            Log.e(TAG, "Failed to create error view", ex);
            return new View(getContext());
        }
    }
    
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated called");
        
        // Additional safety check
        if (currentReinforcementData == null) {
            Log.w(TAG, "Reinitializing data in onViewCreated");
            initializeData();
        }
    }
    
    private void initializeData() {
        currentReinforcementData = new ReinforcementData();
        currentReinforcementData.id = reinforcementId != null ? reinforcementId : UUID.randomUUID();
        currentReinforcementData.quantity = 1;
        currentReinforcementData.name = "";
        currentReinforcementData.type = "";
        currentReinforcementData.length = 0.0;
        currentReinforcementData.radius = 0.0;
        currentReinforcementData.totalWeight = 0.0;
        currentReinforcementData.selectedStructureType = "COLUMN";
    }
    
    private void initialize(View view) {
        try {
            Log.d(TAG, "Starting initialization");
            if (!initializeViews(view)) {
                Log.e(TAG, "Failed to initialize views");
                showError("Failed to initialize views");
                return;
            }
            
            setupInputFilters();
            setupListeners();
            setupRemoveButton();
            initializeDefaults();
            Log.d(TAG, "Initialization completed");
        } catch (Exception e) {
            Log.e(TAG, "Error in initialize", e);
            showError("Failed to initialize components: " + e.getMessage());
        }
    }
    
    private boolean initializeViews(View view) {
        try {
            Log.d(TAG, "Initializing views");
            name = view.findViewById(R.id.name);
            len = view.findViewById(R.id.len);
            radius = view.findViewById(R.id.radius);
            no = view.findViewById(R.id.no);
            totalWeight = view.findViewById(R.id.total_weight);
            lenLayout = view.findViewById(R.id.textinputlayout_len);
            radiusLayout = view.findViewById(R.id.textinputlayout_radius);
            noLayout = view.findViewById(R.id.textInputLayout_no);
            remove_button = view.findViewById(R.id.remove_button);
            
            // Log which views are null and count critical ones
            int nullCount = 0;
            if (name == null) { Log.w(TAG, "name EditText is null"); nullCount++; }
            if (len == null) { Log.w(TAG, "len EditText is null"); nullCount++; }
            if (radius == null) { Log.w(TAG, "radius EditText is null"); nullCount++; }
            if (no == null) { Log.w(TAG, "no EditText is null"); nullCount++; }
            if (totalWeight == null) { Log.w(TAG, "totalWeight EditText is null"); nullCount++; }
            if (lenLayout == null) Log.w(TAG, "lenLayout is null");
            if (radiusLayout == null) Log.w(TAG, "radiusLayout is null");
            if (noLayout == null) Log.w(TAG, "noLayout is null");
            if (remove_button == null) Log.w(TAG, "remove_button is null");
            
            // Return false if too many critical views are missing
            if (nullCount > 2) {
                Log.e(TAG, "Too many critical views are null: " + nullCount);
                return false;
            }
            
            Log.d(TAG, "Views initialized successfully");
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Error initializing views", e);
            return false;
        }
    }
    
    private void setupInputFilters() {
        try {
            Log.d(TAG, "Setting up input filters");
            List<EditText> validEditTexts = new ArrayList<>();
            if (len != null) validEditTexts.add(len);
            if (radius != null) validEditTexts.add(radius);
            if (no != null) validEditTexts.add(no);
            
            if (!validEditTexts.isEmpty()) {
                EditText[] editTexts = validEditTexts.toArray(new EditText[0]);
                // Only call if InputUtils is available
                try {
                    InputUtils.setupInputFilters(editTexts);
                } catch (Exception e) {
                    Log.w(TAG, "InputUtils not available, skipping input filters", e);
                }
            }
            Log.d(TAG, "Input filters set up");
        } catch (Exception e) {
            Log.e(TAG, "Error setting up input filters", e);
        }
    }
    
    private void setupListeners() {
        try {
            Log.d(TAG, "Setting up listeners");
            setupDimensionListeners();
            setupQuantityListener();
            setupNameListener();
            Log.d(TAG, "Listeners set up");
        } catch (Exception e) {
            Log.e(TAG, "Error setting up listeners", e);
        }
    }
    
    private void setupDimensionListeners() {
        try {
            List<EditText> dimensionFields = new ArrayList<>();
            if (len != null) dimensionFields.add(len);
            if (radius != null) dimensionFields.add(radius);
            
            for (EditText field : dimensionFields) {
                field.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable s) {
                        try {
                            Log.d(TAG, "Dimension field changed: " + s.toString());
                            validateAndCalculate(field);
                        } catch (Exception e) {
                            Log.e(TAG, "Error in dimension listener", e);
                        }
                    }
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {}
                });
            }
            Log.d(TAG, "Dimension listeners set up for " + dimensionFields.size() + " fields");
        } catch (Exception e) {
            Log.e(TAG, "Error setting up dimension listeners", e);
        }
    }
    
    private void setupQuantityListener() {
        if (no == null) {
            Log.w(TAG, "Quantity field is null, skipping listener setup");
            return;
        }

        try {
            no.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable s) {
                    try {
                        Log.d(TAG, "Quantity field changed: " + s.toString());
                        String value = s.toString().trim();
                        
                        // Simple validation without external utils
                        if (value.isEmpty()) {
                            currentReinforcementData.quantity = 1;
                        } else {
                            try {
                                int qty = Integer.parseInt(value);
                                currentReinforcementData.quantity = Math.max(1, qty);
                            } catch (NumberFormatException e) {
                                currentReinforcementData.quantity = 1;
                                Log.w(TAG, "Invalid quantity input: " + value);
                            }
                        }
                        
                        calculateTotalWeight();
                    } catch (Exception e) {
                        Log.e(TAG, "Error in quantity listener", e);
                    }
                }
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {}
            });

            no.setOnFocusChangeListener((v, hasFocus) -> {
                if (!hasFocus) {
                    try {
                        String value = no.getText().toString().trim();
                        if (value.isEmpty() || value.equals("0")) {
                            no.setText("1");
                            currentReinforcementData.quantity = 1;
                            calculateTotalWeight();
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "Error in quantity focus listener", e);
                    }
                }
            });
            
            Log.d(TAG, "Quantity listener set up");
        } catch (Exception e) {
            Log.e(TAG, "Error setting up quantity listener", e);
        }
    }
    
    private void setupNameListener() {
        if (name == null) {
            Log.w(TAG, "Name field is null, skipping listener setup");
            return;
        }
        
        try {
            // Handle click to show description dialog
            name.setOnClickListener(v -> {
                try {
                    Log.d(TAG, "Name field clicked");
                    String structureType = currentReinforcementData != null ? 
                        currentReinforcementData.selectedStructureType : "COLUMN";
                    
                    if (structureType == null || structureType.isEmpty()) {
                        structureType = "COLUMN";
                    }
                    
                    Log.d(TAG, "Showing dialog for structure type: " + structureType);
                    showDescriptionDialog(structureType);
                } catch (Exception e) {
                    Log.e(TAG, "Error in name click listener", e);
                    showError("Failed to show selection dialog");
                }
            });
            
            // Handle text changes for manual input
            name.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable s) {
                    try {
                        if (currentReinforcementData != null) {
                            currentReinforcementData.name = s.toString();
                            sendDataToParent();
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "Error in name text listener", e);
                    }
                }
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {}
            });
            
            Log.d(TAG, "Name listeners set up");
        } catch (Exception e) {
            Log.e(TAG, "Error setting up name listener", e);
        }
    }
    
    private void validateAndCalculate(EditText field) {
        try {
            Log.d(TAG, "Validating and calculating for field: " + field.getText().toString());
            
            if (validateField(field)) {
                updateDataFromField(field);
                calculateTotalWeight();
            } else {
                Log.w(TAG, "Field validation failed");
            }
        } catch (Exception e) {
            Log.e(TAG, "Error in validateAndCalculate", e);
            showError("Validation failed: " + e.getMessage());
        }
    }
    
    private boolean validateField(EditText field) {
        try {
            String value = field.getText().toString().trim();
            
            // Basic validation without external utils
            if (value.isEmpty()) {
                return false;
            }
            
            try {
                double numValue = Double.parseDouble(value);
                if (numValue < 0) {
                    Log.w(TAG, "Negative value not allowed: " + numValue);
                    return false;
                }
                
                // Additional validation for specific fields
                if (field == radius && numValue > 100) { // Reasonable max radius in mm
                    Log.w(TAG, "Radius too large: " + numValue);
                    return false;
                }
                
                if (field == len && numValue > 1000) { // Reasonable max length in meters
                    Log.w(TAG, "Length too large: " + numValue);
                    return false;
                }
                
                return true;
            } catch (NumberFormatException e) {
                Log.w(TAG, "Invalid number format: " + value);
                return false;
            }
        } catch (Exception e) {
            Log.e(TAG, "Error validating field", e);
            return false;
        }
    }
    
    private void updateDataFromField(EditText field) {
        try {
            String value = field.getText().toString().trim();
            
            if (value.isEmpty()) {
                Log.d(TAG, "Empty field value, setting to 0");
                if (field == len) {
                    currentReinforcementData.length = 0.0;
                } else if (field == radius) {
                    currentReinforcementData.radius = 0.0;
                }
                return;
            }
            
            try {
                double numValue = Double.parseDouble(value);
                
                if (field == len) {
                    currentReinforcementData.length = numValue;
                    Log.d(TAG, "Updated length: " + numValue);
                } else if (field == radius) {
                    currentReinforcementData.radius = numValue;
                    Log.d(TAG, "Updated radius: " + numValue);
                }
            } catch (NumberFormatException e) {
                Log.w(TAG, "Failed to parse number: " + value);
                // Set to 0 if parsing fails
                if (field == len) {
                    currentReinforcementData.length = 0.0;
                } else if (field == radius) {
                    currentReinforcementData.radius = 0.0;
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Error updating data from field", e);
        }
    }
    
    private void calculateTotalWeight() {
        if (!isAdded() || isCalculating.get() || currentReinforcementData == null) {
            Log.d(TAG, "Skipping calculation - fragment not added or already calculating");
            return;
        }
        
        try {
            Log.d(TAG, "Starting weight calculation");
            isCalculating.set(true);
            
            double length = currentReinforcementData.length;
            double radius = currentReinforcementData.radius;
            int quantity = Math.max(1, currentReinforcementData.quantity);
            
            Log.d(TAG, String.format("Calculation inputs - Length: %.3f, Radius: %.3f, Quantity: %d", 
                length, radius, quantity));
            
            // Validate inputs
            if (length <= 0 || radius <= 0) {
                Log.d(TAG, "Invalid inputs for calculation, setting weight to 0");
                updateTotalWeight(0);
                currentReinforcementData.totalWeight = 0;
                sendDataToParent();
                return;
            }
            
            // Convert radius from mm to meters and calculate
            double radiusMeters = radius / 1000.0; // mm to meters
            double area = Math.PI * Math.pow(radiusMeters, 2); // m²
            double volume = length * area; // m³ (assuming length is in meters)
            double weightPerBar = volume * STEEL_DENSITY; // kg per bar
            double totalWeight = weightPerBar * quantity; // total kg
            
            Log.d(TAG, String.format("Calculation results - Area: %.6f m², Volume: %.6f m³, Weight per bar: %.3f kg, Total: %.3f kg", 
                area, volume, weightPerBar, totalWeight));
            
            currentReinforcementData.totalWeight = totalWeight;
            updateTotalWeight(totalWeight);
            sendDataToParent();
            
        } catch (Exception e) {
            Log.e(TAG, "Error calculating weight", e);
            showError("Calculation failed: " + e.getMessage());
        } finally {
            isCalculating.set(false);
        }
    }
    
    private void updateTotalWeight(double total) {
        if (mainHandler != null) {
            mainHandler.post(() -> {
                try {
                    if (totalWeight != null && isAdded()) {
                        String formattedWeight = String.format(Locale.getDefault(), "%.3f", total);
                        totalWeight.setText(formattedWeight);
                        Log.d(TAG, "Updated total weight display: " + formattedWeight);
                    } else {
                        Log.w(TAG, "Cannot update total weight - view not available");
                    }
                } catch (Exception e) {
                    Log.e(TAG, "Error updating total weight UI", e);
                }
            });
        }
    }
    
    private void showDescriptionDialog(String selectedType) {
        try {
            if (!isAdded() || getContext() == null) {
                Log.w(TAG, "Cannot show dialog - fragment not added or context null");
                return;
            }
            
            Log.d(TAG, "Creating description dialog for type: " + selectedType);
            
            MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(requireContext());
            builder.setTitle("Select Description");
            
            LinearLayout container = new LinearLayout(requireContext());
            container.setOrientation(LinearLayout.VERTICAL);
            int padding = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 16, getResources().getDisplayMetrics());
            container.setPadding(padding, padding, padding, padding);
            
            List<NumberPicker> pickers = new ArrayList<>();
            List<String[]> pickerData = setupPickerData(selectedType);
            
            Log.d(TAG, "Setting up " + pickerData.size() + " pickers");
            
            for (int i = 0; i < pickerData.size(); i++) {
                String[] data = pickerData.get(i);
                NumberPicker picker = new NumberPicker(requireContext());
                picker.setMinValue(0);
                picker.setMaxValue(data.length - 1);
                picker.setDisplayedValues(data);
                picker.setWrapSelectorWheel(true);
                
                // Add some spacing
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                );
                params.setMargins(0, 8, 0, 8);
                picker.setLayoutParams(params);
                
                container.addView(picker);
                pickers.add(picker);
                
                Log.d(TAG, "Added picker " + i + " with " + data.length + " options");
            }
            
            builder.setView(container);
            builder.setPositiveButton("CONFIRM", (dialog, which) -> {
                try {
                    StringBuilder result = new StringBuilder();
                    for (int i = 0; i < pickers.size(); i++) {
                        if (i > 0) result.append("-");
                        int selectedIndex = pickers.get(i).getValue();
                        result.append(pickerData.get(i)[selectedIndex]);
                    }
                    
                    String finalResult = result.toString();
                    Log.d(TAG, "Dialog result: " + finalResult);
                    
                    if (name != null) {
                        name.setText(finalResult);
                        if (currentReinforcementData != null) {
                            currentReinforcementData.name = finalResult;
                            sendDataToParent();
                        }
                    }
                } catch (Exception e) {
                    Log.e(TAG, "Error in dialog confirm", e);
                    showError("Failed to set selection");
                }
            });
            
            builder.setNegativeButton("CANCEL", (dialog, which) -> {
                Log.d(TAG, "Dialog cancelled");
            });
            
            builder.show();
            Log.d(TAG, "Dialog shown successfully");
            
        } catch (Exception e) {
            Log.e(TAG, "Error showing description dialog", e);
            showError("Failed to show selection dialog: " + e.getMessage());
        }
    }
    
    private List<String[]> setupPickerData(String structureType) {
        List<String[]> pickerData = new ArrayList<>();
        String type = structureType != null ? structureType.toUpperCase() : "COLUMN";
        
        Log.d(TAG, "Setting up picker data for type: " + type);
        
        switch (type) {
            case "COLUMN":
                pickerData.add(new String[]{"Main Bars", "Stirrups", "Ties"});
                break;
            case "BEAM":
                pickerData.add(new String[]{"Top Bars", "Bottom Bars", "Stirrups", "Additional"});
                break;
            case "SLAB":
                pickerData.add(new String[]{"X Direction", "Y Direction"});
                pickerData.add(new String[]{"Bottom", "Top"});
                pickerData.add(new String[]{"Main", "Additional"});
                break;
            case "RC FOOTING":
                pickerData.add(new String[]{"X Direction", "Y Direction"});
                pickerData.add(new String[]{"Bottom", "Top"});
                pickerData.add(new String[]{"Main", "Additional"});
                break;
            default:
                pickerData.add(new String[]{"Main", "Additional"});
                break;
        }
        
        Log.d(TAG, "Created " + pickerData.size() + " picker arrays for " + type);
        return pickerData;
    }
    
    private void setupRemoveButton() {
        if (remove_button == null) {
            Log.w(TAG, "Remove button is null, skipping setup");
            return;
        }
        
        try {
            remove_button.setOnClickListener(v -> {
                try {
                    Log.d(TAG, "Remove button clicked");
                    notifyParentOfRemoval();
                    if (getParentFragmentManager() != null) {
                        getParentFragmentManager()
                            .beginTransaction()
                            .remove(this)
                            .commit();
                    }
                } catch (Exception e) {
                    Log.e(TAG, "Error removing reinforcement", e);
                    showError("Failed to remove reinforcement");
                }
            });
            Log.d(TAG, "Remove button set up");
        } catch (Exception e) {
            Log.e(TAG, "Error setting up remove button", e);
        }
    }
    
    private void notifyParentOfRemoval() {
        try {
            if (getParentFragment() instanceof ReinforcementResultListener) {
                ((ReinforcementResultListener) getParentFragment())
                    .onReinforcementRemoved(reinforcementId);
                Log.d(TAG, "Notified parent of removal");
            } else {
                Log.w(TAG, "Parent fragment does not implement ReinforcementResultListener");
            }
        } catch (Exception e) {
            Log.e(TAG, "Error notifying parent of removal", e);
        }
    }
    
    private void sendDataToParent() {
        try {
            if (getParentFragment() instanceof ReinforcementResultListener && isAdded() && currentReinforcementData != null) {
                ((ReinforcementResultListener) getParentFragment())
                    .onReinforcementCalculated(reinforcementId, currentReinforcementData.totalWeight);
                Log.d(TAG, "Sent data to parent - Weight: " + currentReinforcementData.totalWeight);
            } else {
                Log.w(TAG, "Cannot send data to parent - conditions not met");
            }
        } catch (Exception e) {
            Log.e(TAG, "Error sending data to parent", e);
        }
    }
    
    private void initializeDefaults() {
        try {
            Log.d(TAG, "Initializing defaults");
            
            // Set default quantity
            if (no != null) {
                no.setText("1");
                if (currentReinforcementData != null) {
                    currentReinforcementData.quantity = 1;
                }
            }
            
            // Initialize default values
            if (currentReinforcementData != null) {
                currentReinforcementData.length = 0.0;
                currentReinforcementData.radius = 0.0;
                currentReinforcementData.totalWeight = 0.0;
            }
            
            // Update total weight display
            if (totalWeight != null) {
                totalWeight.setText("0.000");
            }
            
            Log.d(TAG, "Defaults initialized");
        } catch (Exception e) {
            Log.e(TAG, "Error in initializeDefaults", e);
            showError("Failed to initialize default values");
        }
    }
    
    private TextInputLayout getCorrespondingLayout(EditText editText) {
        if (editText == len) return lenLayout;
        if (editText == radius) return radiusLayout;
        if (editText == no) return noLayout;
        return null;
    }
    
    private void showError(String message) {
        try {
            if (getView() != null && isAdded() && getContext() != null) {
                Snackbar.make(getView(), message, Snackbar.LENGTH_LONG).show();
                Log.d(TAG, "Showed error: " + message);
            } else {
                Log.e(TAG, "Cannot show error - view/context not available: " + message);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error showing error message: " + message, e);
        }
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called");
        try {
            // Clear references
            currentReinforcementData = null;
            if (mainHandler != null) {
                mainHandler.removeCallbacksAndMessages(null);
            }
        } catch (Exception e) {
            Log.e(TAG, "Error during cleanup", e);
        }
    }
    
    // Public methods for external access
    public String getReinforcementId() {
        return reinforcementId != null ? reinforcementId.toString() : "";
    }
    
    public double getCurrentTotalWeight() {
        return currentReinforcementData != null ? currentReinforcementData.totalWeight : 0;
    }
    
    public void setStructureType(String structureType) {
        if (currentReinforcementData != null) {
            currentReinforcementData.selectedStructureType = structureType;
        }
    }
    
    public Bundle saveState() {
        try {
            Bundle state = new Bundle();
            if (currentReinforcementData != null) {
                state.putString("reinforcementData", currentReinforcementData.toJson().toString());
            }
            return state;
        } catch (Exception e) {
            Log.e(TAG, "Error saving state", e);
            return new Bundle();
        }
    }
    
    public void restoreState(Bundle savedState) {
        try {
            if (savedState == null || !isAdded()) return;
            
            String jsonData = savedState.getString("reinforcementData");
            if (jsonData != null && !jsonData.isEmpty()) {
                JSONObject json = new JSONObject(jsonData);
                
                // Restore UI values
                if (name != null) name.setText(json.optString("name", ""));
                if (len != null) len.setText(String.valueOf(json.optDouble("length", 0)));
                if (radius != null) radius.setText(String.valueOf(json.optDouble("radius", 0)));
                if (no != null) no.setText(String.valueOf(json.optInt("quantity", 1)));
                
                // Restore data object
                if (currentReinforcementData != null) {
                    currentReinforcementData.id = UUID.fromString(json.optString("id", reinforcementId.toString()));
                    currentReinforcementData.name = json.optString("name", "");
                    currentReinforcementData.type = json.optString("type", "");
                    currentReinforcementData.length = json.optDouble("length", 0);
                    currentReinforcementData.radius = json.optDouble("radius", 0);
                    currentReinforcementData.quantity = json.optInt("quantity", 1);
                    currentReinforcementData.totalWeight = json.optDouble("totalWeight", 0);
                    currentReinforcementData.selectedStructureType = json.optString("selectedStructureType", "COLUMN");
                }
                
                // Recalculate total weight
                calculateTotalWeight();
            }
        } catch (Exception e) {
            Log.e(TAG, "Error restoring state", e);
            showError("Failed to restore previous state");
        }
    }
}