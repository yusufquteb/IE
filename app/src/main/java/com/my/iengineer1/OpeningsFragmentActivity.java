package com.my.iengineer1;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.*;
import android.util.*;
import android.util.Log;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.*;
import androidx.fragment.app.Fragment;
import com.github.angads25.filepicker.*;
import com.google.android.material.button.*;
import com.google.android.material.card.*;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.*;
import com.leinardi.android.speeddial.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.regex.*;
import net.cachapa.expandablelayout.*;
import org.json.*;



public class OpeningsFragmentActivity extends Fragment {
	
	private ArrayList<String> areatype = new ArrayList<>();
	private ArrayList<String> areashape = new ArrayList<>();
	
	private MaterialCardView cardview1;
	private LinearLayout bg;
	private LinearLayout linear78;
	private LinearLayout header_section;
	private MaterialDivider material_divider26;
	private LinearLayout input_section;
	private TextView circle_no;
	private TextInputLayout name_container;
	private MaterialButton remove_button;
	private TextInputEditText name;
	private TextView textview14;
	private TextInputLayout textInputLayout_areaType;
	private TextInputLayout textInputLayout_shape;
	private TextView textview15;
	private TextInputLayout textinputlayout_no;
	private TextInputLayout textinputlayout_length;
	private TextInputLayout textinputlayout_width;
	private TextInputLayout textinputlayout_radius;
	private TextInputLayout textinputlayout_area;
	private TextInputEditText pendingCameraField;
	private final ActivityResultLauncher<Intent> cameraLauncher = registerForActivityResult(
		new ActivityResultContracts.StartActivityForResult(),
		result -> {
			if (result.getResultCode() == android.app.Activity.RESULT_OK && result.getData() != null) {
				double widthVal  = result.getData().getDoubleExtra("width_value",  0);
				double heightVal = result.getData().getDoubleExtra("height_value", 0);
				double areaVal   = result.getData().getDoubleExtra("area_value",   0);
				if (pendingCameraField == len && widthVal > 0) {
					len.setText(String.format(java.util.Locale.ENGLISH, "%.2f", widthVal));
				} else if (pendingCameraField == width && heightVal > 0) {
					width.setText(String.format(java.util.Locale.ENGLISH, "%.2f", heightVal));
				} else if (pendingCameraField == radius && widthVal > 0) {
					radius.setText(String.format(java.util.Locale.ENGLISH, "%.2f", widthVal / 2.0));
				} else if (pendingCameraField == area && areaVal > 0) {
					area.setText(String.format(java.util.Locale.ENGLISH, "%.3f", areaVal));
				}
				pendingCameraField = null;
			}
		});

	private MaterialCardView total_card;
	private AutoCompleteTextView area_type;
	private AutoCompleteTextView shape;
	private TextInputEditText no;
	private TextInputEditText len;
	private TextInputEditText width;
	private TextInputEditText radius;
	private TextInputEditText area;
	private LinearLayout linear10;
	private TextView textview16;
	private TextInputLayout TextInputLayout_total;
	private TextInputEditText total_area;
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.openings_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		cardview1 = _view.findViewById(R.id.cardview1);
		bg = _view.findViewById(R.id.bg);
		linear78 = _view.findViewById(R.id.linear78);
		header_section = _view.findViewById(R.id.header_section);
		material_divider26 = _view.findViewById(R.id.material_divider26);
		input_section = _view.findViewById(R.id.input_section);
		circle_no = _view.findViewById(R.id.circle_no);
		name_container = _view.findViewById(R.id.name_container);
		remove_button = _view.findViewById(R.id.remove_button);
		name = _view.findViewById(R.id.name);
		textview14 = _view.findViewById(R.id.textview14);
		textInputLayout_areaType = _view.findViewById(R.id.textInputLayout_areaType);
		textInputLayout_shape = _view.findViewById(R.id.textInputLayout_shape);
		textview15 = _view.findViewById(R.id.textview15);
		textinputlayout_no = _view.findViewById(R.id.textinputlayout_no);
		textinputlayout_length = _view.findViewById(R.id.textinputlayout_length);
		textinputlayout_width = _view.findViewById(R.id.textinputlayout_width);
		textinputlayout_radius = _view.findViewById(R.id.textinputlayout_radius);
		textinputlayout_area = _view.findViewById(R.id.textinputlayout_area);
		total_card = _view.findViewById(R.id.total_card);
		area_type = _view.findViewById(R.id.area_type);
		shape = _view.findViewById(R.id.shape);
		no = _view.findViewById(R.id.no);
		len = _view.findViewById(R.id.len);
		width = _view.findViewById(R.id.width);
		radius = _view.findViewById(R.id.radius);
		area = _view.findViewById(R.id.area);
		linear10 = _view.findViewById(R.id.linear10);
		textview16 = _view.findViewById(R.id.textview16);
		TextInputLayout_total = _view.findViewById(R.id.TextInputLayout_total);
		total_area = _view.findViewById(R.id.total_area);
		
		remove_button.setOnClickListener((v) -> {
			com.google.android.material.dialog.MaterialAlertDialogBuilder builder = 
			new com.google.android.material.dialog.MaterialAlertDialogBuilder(getActivity());
			
			builder.setTitle("⚠️ تأكيد الحذف");
			builder.setMessage("هل أنت متأكد من حذف هذه الفتحة؟\n\nسيتم حذف جميع البيانات المدخلة.");
			
			builder.setPositiveButton("نعم، حذف", (DialogInterface dialog, int which) -> {
				try {
					Fragment parentFragment = OpeningsFragmentActivity.this.getParentFragment();
					
					OpeningsFragmentActivity.this.getParentFragmentManager()
					.beginTransaction()
					.remove(OpeningsFragmentActivity.this)
					.commitAllowingStateLoss();
					
					// الانتظار حتى يتم الحذف فعلياً ثم إعادة الحساب
					new Handler(Looper.getMainLooper()).postDelayed(() -> {
						if (parentFragment instanceof FinishFragmentActivity) {
							((FinishFragmentActivity) parentFragment)._recalculateOpenings();
						}
					}, 100); // انتظار 100ms للتأكد من اكتمال الحذف
					
				} catch (Exception e) {
					Log.e("OpeningsFragment", "Error: " + e.getMessage());
					Context context = OpeningsFragmentActivity.this.getContext();
					if (context != null) {
						SketchwareUtil.showMessage(context, e.getMessage());
					}
				}
			});
			builder.setNegativeButton("إلغاء", null);
			
			androidx.appcompat.app.AlertDialog dialog = builder.create();
			dialog.show();
			
			// تخصيص ألوان الأزرار
			dialog.getButton(androidx.appcompat.app.AlertDialog.BUTTON_POSITIVE).setTextColor(
			androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_error));
			dialog.getButton(androidx.appcompat.app.AlertDialog.BUTTON_NEGATIVE).setTextColor(
			androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_primary));
			
		});
		
		shape.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				_shapee(_charSeq);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		len.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_is_number(_charSeq) && _is_number(width.getText().toString())) {
					area.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(width.getText().toString())));
				} else {
					
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		width.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_is_number(_charSeq) && _is_number(len.getText().toString())) {
					area.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(len.getText().toString())));
				} else {
					
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		radius.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_is_number(_charSeq)) {
					area.setText(String.valueOf((double) Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)));
				} else {
					
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		area.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_is_number(no.getText().toString()) && _is_number(_charSeq)) {
					total_area.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(no.getText().toString())));
				} else {
					
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		total_area.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();

				try {
					// الانتظار قليلاً قبل إعادة الحساب (debounce)
					new Handler(Looper.getMainLooper()).postDelayed(() -> {
						Fragment parentFragment = getParentFragment();
						if (parentFragment instanceof FinishFragmentActivity) {
							((FinishFragmentActivity) parentFragment)._recalculateOpenings();
						}
					}, 500); // انتظار 500ms بعد آخر تغيير

				} catch (Exception e) {
					Log.e("OpeningsFragment", "خطأ في TextWatcher: " + e.getMessage());
				}

			}

			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {

			}

			@Override
			public void afterTextChanged(Editable _param1) {

			}
		});

		no.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_is_number(_charSeq) && _is_number(area.getText().toString())) {
					total_area.setText(String.valueOf(
						Double.parseDouble(_charSeq) * Double.parseDouble(area.getText().toString())));
				} else {
					total_area.setText("");
				}
			}
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {}
			@Override
			public void afterTextChanged(Editable _param1) {}
		});

		textinputlayout_length.setEndIconOnClickListener(v -> {
			pendingCameraField = len;
			cameraLauncher.launch(new Intent(requireActivity(), com.my.iengineer1.camera.CameraMeasureActivity.class));
		});
		textinputlayout_width.setEndIconOnClickListener(v -> {
			pendingCameraField = width;
			cameraLauncher.launch(new Intent(requireActivity(), com.my.iengineer1.camera.CameraMeasureActivity.class));
		});
		textinputlayout_radius.setEndIconOnClickListener(v -> {
			pendingCameraField = radius;
			cameraLauncher.launch(new Intent(requireActivity(), com.my.iengineer1.camera.CameraMeasureActivity.class));
		});
		textinputlayout_area.setEndIconOnClickListener(v -> {
			pendingCameraField = area;
			cameraLauncher.launch(new Intent(requireActivity(), com.my.iengineer1.camera.CameraMeasureActivity.class));
		});
	}
	
	private void initializeLogic() {
		areatype.add("Door");
		areatype.add("Window");
		areatype.add("Opening");
		areashape.add("Rectangular");
		areashape.add("Circular");
		areashape.add("Irregular");
		shape.setInputType(InputType.TYPE_NULL); 	ArrayAdapter<String> adapter = 	new ArrayAdapter<String>( 	requireContext(), R.layout.dropdown_menu_popup_item, R.id.textview1, areashape); 	shape.setAdapter(adapter);
		shape.setText(areashape.get(0), false);
		_shapee(shape.getText().toString());
		area_type.setInputType(InputType.TYPE_NULL); 	ArrayAdapter<String> adapter1 = 	new ArrayAdapter<String>( 	requireContext(), R.layout.dropdown_menu_popup_item, R.id.textview1, areatype); 	area_type.setAdapter(adapter1);
		area_type.setText(areatype.get(0), false);
	}
	
	public void _shapee(final String _shape) {
		switch(_shape) {
			case "Rectangular": {
				textinputlayout_length.setVisibility(View.VISIBLE);
				textinputlayout_width.setVisibility(View.VISIBLE);
				textinputlayout_radius.setVisibility(View.GONE);
				textinputlayout_area.setVisibility(View.GONE);
				break;
			}
			case "Circular": {
				textinputlayout_length.setVisibility(View.GONE);
				textinputlayout_width.setVisibility(View.GONE);
				textinputlayout_radius.setVisibility(View.VISIBLE);
				textinputlayout_area.setVisibility(View.GONE);
				break;
			}
			case "Irregular": {
				textinputlayout_length.setVisibility(View.GONE);
				textinputlayout_width.setVisibility(View.GONE);
				textinputlayout_radius.setVisibility(View.GONE);
				textinputlayout_area.setVisibility(View.VISIBLE);
				break;
			}
		}
	}
	
	
	public boolean _is_number(final String _value) {
		
		try {
			Double.parseDouble(_value); // تحويل القيمة لرقم
			return true; // إذا نجح التحويل، القيمة رقم
		} catch (NumberFormatException e) {
			return false; // إذا فشل التحويل، القيمة ليست رقم
		}
	}
	
}
