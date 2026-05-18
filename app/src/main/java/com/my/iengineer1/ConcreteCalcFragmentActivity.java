package com.my.iengineer1;

import android.animation.*;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.*;
import android.util.Log;
import android.view.*;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.*;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import net.cachapa.expandablelayout.ExpandableLayout;
import com.my.iengineer1.utils.*;
import java.util.*;
import androidx.core.view.ViewCompat;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import androidx.core.content.ContextCompat;
import android.widget.Button;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import com.my.iengineer1.utils.CalculationUtils;
import com.my.iengineer1.StateManager;
import com.google.android.material.button.MaterialButton;

public class ConcreteCalcFragmentActivity extends Fragment implements DefaultLifecycleObserver, ReinforcementResultListener {
	private static final String TAG = "ConcreteCalcFragment";
	private static final Object calculationLock = new Object();
	
	private final Map<UUID, Double> reinforcementMap = new HashMap<>();
	private final Handler mainHandler = new Handler(Looper.getMainLooper());
	private boolean isCalculating = false;
	private boolean isViewCreated = false;
	
	private View rootView;
	private boolean isFirstCalculation = true;
	
	// UI Components
	private TextInputLayout textinputlayout_length, textinputlayout_width;
	private TextInputLayout textinputlayout_radius, textinputlayout_area, textinputlayout_no;
	private TextInputLayout textinputlayout_depth, textinputlayout_volume, textinputlayout_reinforcement;
	private EditText len, wed, radius, area, no, depth, total_volume, reinforcement;
	private TextView circle_no;
	
    private MaterialButton expand_arrow, helpButton, add_opening_button;

	private ExpandableLayout expandableLayout;
	private AutoCompleteTextView shape_dropdown, type_dropdown;
	private ScrollView scrollView;
	private AlertDialog closeDialog;
	
	@Override
	public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
	@Nullable Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.concrete_calc_fragment, container, false);
		rootView.setTag(this);
		initialize(rootView);
		setupEnhancedUI();
		isViewCreated = true;
		return rootView;
	}
	
	private void initialize(View view) {
		initializeViews(view);
		setupInputFilters();
		setupDropdowns();
		setupListeners();
		setupExpandableLayout();
		setupInitialValues();
		setupCloseButton(view);
	}
    
    	
	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		setupBackPressHandler();
	}
	
	private void initializeViews(View view) {
		// Initialize all TextInputLayouts
		textinputlayout_length = view.findViewById(R.id.textinputlayout_length);
		textinputlayout_width = view.findViewById(R.id.textinputlayout_width);
		textinputlayout_radius = view.findViewById(R.id.textinputlayout_radius);
		textinputlayout_area = view.findViewById(R.id.textinputlayout_area);
		textinputlayout_no = view.findViewById(R.id.textinputlayout_no);
		textinputlayout_depth = view.findViewById(R.id.textinputlayout_depth);
		textinputlayout_volume = view.findViewById(R.id.textinputlayout_volume);
		textinputlayout_reinforcement = view.findViewById(R.id.textinputlayout_reinforcement);
		
		// Initialize all EditTexts
		len = view.findViewById(R.id.len);
		wed = view.findViewById(R.id.wed);
		radius = view.findViewById(R.id.radius);
		area = view.findViewById(R.id.area);
		no = view.findViewById(R.id.no);
		depth = view.findViewById(R.id.depth);
		total_volume = view.findViewById(R.id.total_volume);
		reinforcement = view.findViewById(R.id.reinforcement);
		
		// Initialize other views
		circle_no = view.findViewById(R.id.circle_no);
		add_opening_button = view.findViewById(R.id.add_opening_button);
		expand_arrow = view.findViewById(R.id.expand_arrow);
		expandableLayout = view.findViewById(R.id.expandableLayout);
		shape_dropdown = view.findViewById(R.id.shape_dropdown);
		type_dropdown = view.findViewById(R.id.type_dropdown);
		scrollView = view.findViewById(R.id.scroll_view);
		helpButton = view.findViewById(R.id.helpButton);
	}
	
	private void setupInputFilters() {
		InputUtils.setupInputFilters(len, wed, radius, area, no, depth);
	}
	
	private void setupDropdowns() {
		// Setup shape dropdown
		String[] shapes = {"Rectangular", "Circular", "Irregular"};
		ArrayAdapter<String> shapeAdapter = new ArrayAdapter<>(requireContext(),
		android.R.layout.simple_dropdown_item_1line, shapes);
		shape_dropdown.setAdapter(shapeAdapter);
		shape_dropdown.setText(shapes[0], false);
		
		// Setup type dropdown
		String[] types = {"PC FOOTING", "RC FOOTING", "BEAM", "COLUMN", "SLAB"};
		ArrayAdapter<String> typeAdapter = new ArrayAdapter<>(requireContext(),
		android.R.layout.simple_dropdown_item_1line, types);
		type_dropdown.setAdapter(typeAdapter);
		type_dropdown.setText(types[0], false);
		
		setupDropdownListeners();
	}
	
	private void setupDropdownListeners() {
		shape_dropdown.setOnItemClickListener((parent, view, position, id) -> {
			String selectedShape = parent.getItemAtPosition(position).toString();
			resetForSelectedShape(selectedShape);
			calculateVolume();
		});
		
		type_dropdown.setOnItemClickListener((parent, view, position, id) -> {
			calculateVolume();
		});
	}
	
	private void resetForSelectedShape(String shape) {
		switch (shape) {
			case "Rectangular":
			textinputlayout_length.setVisibility(View.VISIBLE);
			textinputlayout_width.setVisibility(View.VISIBLE);
			textinputlayout_radius.setVisibility(View.GONE);
			textinputlayout_area.setVisibility(View.GONE);
			break;
			case "Circular":
			textinputlayout_length.setVisibility(View.GONE);
			textinputlayout_width.setVisibility(View.GONE);
			textinputlayout_radius.setVisibility(View.VISIBLE);
			textinputlayout_area.setVisibility(View.GONE);
			break;
			case "Irregular":
			textinputlayout_length.setVisibility(View.GONE);
			textinputlayout_width.setVisibility(View.GONE);
			textinputlayout_radius.setVisibility(View.GONE);
			textinputlayout_area.setVisibility(View.VISIBLE);
			break;
		}
		clearInputs();
	}
	
	private void setupListeners() {
		EditText[] editTexts = {len, wed, radius, area, no, depth};
		for (EditText editText : editTexts) {
			if (editText == null) continue;
			
			TextWatcher watcher = new TextWatcher() {
				@Override
				public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
				
				@Override
				public void onTextChanged(CharSequence s, int start, int before, int count) {}
				
				@Override
				public void afterTextChanged(Editable s) {
					if (!isCalculating) {
						calculateVolume();
					}
				}
			};
			
			editText.addTextChangedListener(watcher);
			
			editText.setOnFocusChangeListener((v, hasFocus) -> {
				TextInputLayout layout = getCorrespondingLayout(editText);
				if (!hasFocus) {
					validateAndShowHelper(editText, layout);
				}
			});
		}
        
		
		setupReinforcementButton();
	}
	
	private void setupReinforcementButton() {
		add_opening_button.setOnClickListener(v -> {
			if (expandableLayout.isExpanded()) {
				ReinforcementFragmentActivity fragment = new ReinforcementFragmentActivity();
				getChildFragmentManager()
				.beginTransaction()
				.add(R.id.mn_st_lyot, fragment)
				.addToBackStack(null)
				.commit();
			} else {
				expandableLayout.expand();
				expand_arrow.animate().rotation(180).setDuration(300);
				ReinforcementFragmentActivity fragment = new ReinforcementFragmentActivity();
				getChildFragmentManager()
				.beginTransaction()
				.add(R.id.mn_st_lyot, fragment)
				.addToBackStack(null)
				.commit();
			}
		});
	}
	
	private void calculateVolume() {
		if (!isAdded()) return;
		
		synchronized (calculationLock) {
			if (isCalculating) return;
			
			isCalculating = true;
			
			try {
				if (!validateInputs()) {
					return;
				}
				
				double baseArea = calculateAreaByShape();
				double depthValue = CalculationUtils.parseDoubleOrDefault(depth.getText().toString(), 0);
				int quantity = parseQuantitySafely();
				
				double totalVolumeValue = baseArea * depthValue * quantity;
				
				updateUIWithCalculatedValues(totalVolumeValue);
				
			} catch (Exception e) {
				Log.e(TAG, "Error calculating volume", e);
			} finally {
				isCalculating = false;
			}
		}
	}
	
	private double calculateAreaByShape() {
		String shape = shape_dropdown.getText().toString();
		switch (shape) {
			case "Rectangular":
			return calculateRectangularArea();
			case "Circular":
			return calculateCircularArea();
			case "Irregular":
			return calculateIrregularArea();
			default:
			return 0.0;
		}
	}
	
	private double calculateRectangularArea() {
		double length = CalculationUtils.parseDoubleOrDefault(len.getText().toString(), 0);
		double width = CalculationUtils.parseDoubleOrDefault(wed.getText().toString(), 0);
		return length * width;
	}
	
	private double calculateCircularArea() {
		double radiusValue = CalculationUtils.parseDoubleOrDefault(radius.getText().toString(), 0);
		return Math.PI * Math.pow(radiusValue, 2);
	}
	
	private double calculateIrregularArea() {
		return CalculationUtils.parseDoubleOrDefault(area.getText().toString(), 0);
	}
	
	private void updateUIWithCalculatedValues(double volumeValue) {
		total_volume.setText(CalculationUtils.formatNumber(volumeValue));
		StateManager.setTotalVolume(volumeValue);
	}
	
	@Override
	public void onReinforcementCalculated(UUID reinforcementId, double totalWeight) {
		reinforcementMap.put(reinforcementId, totalWeight);
		updateTotalReinforcement();
	}
	
	@Override
	public void onReinforcementRemoved(UUID reinforcementId) {
		reinforcementMap.remove(reinforcementId);
		updateTotalReinforcement();
	}
	
	private void updateTotalReinforcement() {
		double totalWeight = reinforcementMap.values().stream()
		.mapToDouble(Double::doubleValue)
		.sum();
		reinforcement.setText(CalculationUtils.formatNumber(totalWeight));
		StateManager.setTotalReinforcement(totalWeight);
	}
	
	
	private boolean validateInputs() {
		String currentShape = shape_dropdown.getText().toString();
		boolean isValid = validateDimensionWithHelper(textinputlayout_depth, depth, "Depth");
		
		switch (currentShape) {
			case "Rectangular":
			isValid &= validateDimensionWithHelper(textinputlayout_length, len, "Length") &&
			validateDimensionWithHelper(textinputlayout_width, wed, "Width");
			break;
			case "Circular":
			isValid &= validateDimensionWithHelper(textinputlayout_radius, radius, "Radius");
			break;
			case "Irregular":
			isValid &= validateAreaWithHelper(textinputlayout_area, area);
			break;
		}
		
		return isValid && validateQuantityWithHelper(textinputlayout_no, no);
	}
	
	// Helper methods for ConcreteCalcFragmentActivity
	
	private void setupInitialValues() {
		if (no != null) no.setText("1");
		if (circle_no != null) circle_no.setText("0");
		resetForSelectedShape("Rectangular");
	}
	
	private void setupEnhancedUI() {
		helpButton.setOnClickListener(v -> showHelpDialog());
		setupSmoothScrolling();
	}
	
	private void showHelpDialog() {
		new MaterialAlertDialogBuilder(requireContext())
		.setTitle("Help")
		.setMessage("• Choose a shape type from the dropdown\n" +
		"• Enter dimensions within the valid ranges\n" +
		"• Add reinforcement using the '+' button\n" +
		"• Long press fields for measurement ranges\n" +
		"• Volume updates automatically")
		.setPositiveButton("OK", null)
		.show();
	}
	
	private void setupSmoothScrolling() {
		ViewCompat.setNestedScrollingEnabled(scrollView, true);
	}
	
	private void clearInputs() {
		EditText[] editTexts = {len, wed, radius, area, depth, total_volume};
		for (EditText editText : editTexts) {
			if (editText != null) {
				editText.setText("");
				editText.setError(null);
			}
		}
	}
	
	private TextInputLayout getCorrespondingLayout(EditText editText) {
		if (editText == len) return textinputlayout_length;
		if (editText == wed) return textinputlayout_width;
		if (editText == radius) return textinputlayout_radius;
		if (editText == area) return textinputlayout_area;
		if (editText == no) return textinputlayout_no;
		if (editText == depth) return textinputlayout_depth;
		return null;
	}
	
	private void validateAndShowHelper(EditText editText, TextInputLayout layout) {
        	boolean isValid = true;
		if (editText == len) {
			validateDimensionWithHelper(layout, editText, "Length");
		} else if (editText == wed) {
			validateDimensionWithHelper(layout, editText, "Width");
		} else if (editText == radius) {
			validateDimensionWithHelper(layout, editText, "Radius");
		} else if (editText == area) {
			validateAreaWithHelper(layout, editText);
		} else if (editText == no) {
			validateQuantityWithHelper(layout, editText);
		} else if (editText == depth) {
			validateDimensionWithHelper(layout, editText, "Depth");
		}
        
        
        		
		if (!isValid) {
			layout.setHelperTextColor(ContextCompat.getColorStateList(requireContext(), R.color.error_color));
		}
	}
	
	private boolean validateDimensionWithHelper(TextInputLayout layout, EditText editText, String fieldName) {
		return ValidationUtils.validateDimension(layout, editText, fieldName);
	}
	
	private boolean validateAreaWithHelper(TextInputLayout layout, EditText editText) {
		return ValidationUtils.validateArea(layout, editText);
	}
	
	private boolean validateQuantityWithHelper(TextInputLayout layout, EditText editText) {
		return ValidationUtils.validateQuantity(layout, editText);
	}
	
	private void showCloseConfirmation() {
		if (!isAdded() || getContext() == null) return;
		
		if (closeDialog != null && closeDialog.isShowing()) return;
		
		closeDialog = new AlertDialog.Builder(requireContext())
		.setTitle("Close Fragment")
		.setMessage("Are you sure you want to close this fragment?")
		.setPositiveButton("Close", (dialog, which) -> {
			if (getParentFragmentManager().getBackStackEntryCount() > 0) {
				getParentFragmentManager().beginTransaction()
				.remove(ConcreteCalcFragmentActivity.this)
				.commit();
				
				new Handler(Looper.getMainLooper()).postDelayed(() -> {
					calculateVolume();
				}, 100);
			} else {
				requireActivity().onBackPressed();
			}
		})
		.setNegativeButton("Cancel", null)
		.create();
		
		closeDialog.show();
	}
	
	@Override
	public void onSaveInstanceState(@NonNull Bundle outState) {
		super.onSaveInstanceState(outState);
		try {
			outState.putString("shape", shape_dropdown.getText().toString());
			outState.putString("type", type_dropdown.getText().toString());
			outState.putString("totalVolume", total_volume.getText().toString());
			outState.putString("reinforcement", reinforcement.getText().toString());
		} catch (Exception e) {
			Log.e(TAG, "Error saving instance state: " + e.getMessage());
		}
	}
	
	@Override
	public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
		super.onViewStateRestored(savedInstanceState);
		if (savedInstanceState != null) {
			try {
				shape_dropdown.setText(savedInstanceState.getString("shape", ""));
				type_dropdown.setText(savedInstanceState.getString("type", ""));
				total_volume.setText(savedInstanceState.getString("totalVolume", "0.0"));
				reinforcement.setText(savedInstanceState.getString("reinforcement", "0.0"));
			} catch (Exception e) {
				Log.e(TAG, "Error restoring instance state: " + e.getMessage());
			}
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (isViewCreated) {
			validateInputs();
			calculateVolume();
		}
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		if (closeDialog != null) {
			closeDialog.dismiss();
		}
	}
	
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		rootView = null;
	}
	
	// Getter methods for testing and external access
	public String getShape() {
		return shape_dropdown.getText().toString();
	}
	
	public String getType() {
		return type_dropdown.getText().toString();
	}
	
	public EditText getLength() {
		return len;
	}
	
	public EditText getWidth() {
		return wed;
	}
	
	public EditText getRadius() {
		return radius;
	}
	
	public EditText getArea() {
		return area;
	}
	
	public EditText getDepth() {
		return depth;
	}
	
	public EditText getQuantity() {
		return no;
	}
	
	public EditText getTotalVolume() {
		return total_volume;
	}
	
	public EditText getReinforcement() {
		return reinforcement;
	}
	
	private void setupExpandableLayout() {
		expand_arrow.setOnClickListener(v -> {
			if (expandableLayout.isExpanded()) {
				expandableLayout.collapse();
				expand_arrow.animate().rotation(0).setDuration(300);
			} else {
				expandableLayout.expand();
				expand_arrow.animate().rotation(180).setDuration(300);
			}
		});
	}
    
	private void setupCloseButton(View view) {
		MaterialButton closeButton = view.findViewById(R.id.close);
		if (closeButton != null) {
			closeButton.setOnClickListener(v -> showCloseConfirmation());
		}
	}
	private int parseQuantitySafely() {
		try {
			return Integer.parseInt(no.getText().toString());
		} catch (NumberFormatException e) {
			Log.w(TAG, "Invalid quantity, defaulting to 1");
			return 1;
		}
		
	}
    
    private void showCloseOrDeletLast() {
		MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(requireContext());
		
		builder.setTitle("خيارات الخروج")
		.setMessage("ماذا تريد أن تفعل؟")
		.setPositiveButton("حذف آخر جزء", (dialog, which) -> {
			deleteLastChildFragment();
		})
		.setNegativeButton("خروج من التطبيق", (dialog, which) -> {
			requireActivity().finish();
		})
		.setNeutralButton("إلغاء", null);
		
		androidx.appcompat.app.AlertDialog closeDialog = builder.create();
		closeDialog.show();
	}
	
	private void deleteLastChildFragment() {
		List<Fragment> fragments = getParentFragmentManager().getFragments();
		if (!fragments.isEmpty()) {
			for (int i = fragments.size() - 1; i >= 0; i--) {
				Fragment fragment = fragments.get(i);
				if (fragment instanceof ConcreteCalcFragmentActivity) {
					getParentFragmentManager().beginTransaction()
					.remove(fragment)
					.commit();
					break;
				}
			}
		}
	}
	
	// تعديل الـ callback للتعامل مع الزر الخلفي
	private void setupBackPressHandler() {
		requireActivity().getOnBackPressedDispatcher().addCallback(
		getViewLifecycleOwner(),
		new OnBackPressedCallback(true) {
			@Override
			public void handleOnBackPressed() {
				showCloseOrDeletLast();
			}
		});
	}
}

