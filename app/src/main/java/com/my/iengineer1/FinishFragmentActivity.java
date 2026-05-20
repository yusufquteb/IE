package com.my.iengineer1;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Context;
import android.content.res.*;
import android.content.res.ColorStateList;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.text.*;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.*;
import androidx.fragment.app.Fragment;
import com.github.angads25.filepicker.*;
import com.google.android.material.button.*;
import com.google.android.material.card.*;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.*;
import com.leinardi.android.speeddial.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.regex.*;
import net.cachapa.expandablelayout.*;
import net.cachapa.expandablelayout.ExpandableLayout;
import org.json.*;





public class FinishFragmentActivity extends Fragment {
	
	private String phone = "";
	private String phonenumber = "";
	private String text = "";
	private String shape = "";
	private double length = 0;
	private double width = 0;
	private double radiusValue = 0;
	private boolean isFirstCalculation = false;
	private boolean isCalculating = false;
	private boolean isViewCreated = false;
	private String currentShape = "";
	private boolean isValid = false;
	private double sum = 0;
	private GestureDetector gestureDetector;
	private boolean isStep1Complete = false;
	private boolean isStep2Complete = false;
	private boolean isStep3Complete = false;
	private String noText = "";
	private String areaText = "";
	private double openingsCount = 0;
	
	private ArrayList<String> editTexts = new ArrayList<>();
	
	private TextInputEditText pendingCameraField;
	private final ActivityResultLauncher<Intent> cameraLauncher = registerForActivityResult(
		new ActivityResultContracts.StartActivityForResult(),
		result -> {
			if (result.getResultCode() == android.app.Activity.RESULT_OK && result.getData() != null) {
				double widthVal  = result.getData().getDoubleExtra("width_value",  0);
				double heightVal = result.getData().getDoubleExtra("height_value", 0);
				double areaVal   = result.getData().getDoubleExtra("area_value",   0);
				if (pendingCameraField == len && widthVal > 0) {
					len.setText(String.format(Locale.ENGLISH, "%.2f", widthVal));
				} else if (pendingCameraField == wed && heightVal > 0) {
					wed.setText(String.format(Locale.ENGLISH, "%.2f", heightVal));
				} else if (pendingCameraField == radius && widthVal > 0) {
					radius.setText(String.format(Locale.ENGLISH, "%.2f", widthVal / 2.0));
				} else if (pendingCameraField == area && areaVal > 0) {
					area.setText(String.format(Locale.ENGLISH, "%.3f", areaVal));
				}
				pendingCameraField = null;
			}
		});

	private ScrollView scroll_view;
	private LinearLayout main_container;
	private MaterialCardView cardview7;
	private LinearLayout linear25;
	private MaterialCardView header_card;
	private MaterialDivider material_divider26;
	private ExpandableLayout expandableLayout;
	private LinearLayout header_section;
	private LinearLayout linear41;
	private TextInputLayout textinputlayout4;
	private LinearLayout linear42;
	private TextInputEditText name;
	private MaterialButton helpButton;
	private MaterialButton expand_arrow;
	private MaterialButton close;
	private LinearLayout linear43;
	private LinearLayout stepper_container;
	private MaterialCardView shape_step_card;
	private MaterialCardView dimensions_step_card;
	private MaterialCardView openings_step_card;
	private LinearLayout step_1;
	private View progress_line_1;
	private LinearLayout step_2;
	private View progress_line_2;
	private LinearLayout step_3;
	private FrameLayout frame_layout4;
	private TextView step_1_label;
	private MaterialCardView step_1_indicator;
	private MaterialCardView step_1_check;
	private TextView step_1_number;
	private TextView textview4;
	private FrameLayout frame_layout5;
	private TextView step_2_label;
	private MaterialCardView step_2_indicator;
	private MaterialCardView step_2_check;
	private TextView step_2_number;
	private TextView textview5;
	private FrameLayout frame_layout6;
	private TextView step_3_label;
	private MaterialCardView step_3_indicator;
	private MaterialCardView step_3_check;
	private TextView step_3_number;
	private TextView textview6;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private TextInputLayout shape_layout;
	private MaterialCardView cardview15;
	private LinearLayout linear46;
	private MaterialCardView cardview3;
	private ImageView icon_shape;
	private TextView textview63;
	private TextView textview7;
	private TextView textview64;
	private AutoCompleteTextView shape_dropdown;
	private LinearLayout linear27;
	private LinearLayout linear47;
	private TextInputLayout textinputlayout_no;
	private LinearLayout linear49;
	private TextInputLayout textinputlayout_radius;
	private TextInputLayout textinputlayout_area;
	private MaterialButton add_opening_button;
	private MaterialCardView cardview8;
	private MaterialCardView cardview16;
	private LinearLayout linear48;
	private MaterialCardView cardview4;
	private ImageView icon_dimensions;
	private TextView textview66;
	private TextView textview8;
	private TextView textview67;
	private TextInputEditText no;
	private TextInputLayout textinputlayout_length;
	private TextInputLayout textinputlayout_width;
	private TextInputEditText len;
	private TextInputEditText wed;
	private TextInputEditText radius;
	private TextInputEditText area;
	private LinearLayout linear29;
	private LinearLayout linear7;
	private LinearLayout linear30;
	private TextInputLayout textinputlayout_net;
	private TextView textview9;
	private TextInputLayout textinputlayout_total;
	private TextInputLayout textinputlayout_open;
	private TextInputEditText total_area;
	private TextInputEditText total_opening;
	private TextInputEditText net_total;
	private LinearLayout linear35;
	private LinearLayout linear50;
	private MaterialDivider linear36;
	private LinearLayout empty_state;
	private LinearLayout mn_st_lyot;
	private MaterialCardView cardview17;
	private LinearLayout linear51;
	private MaterialButton delete_all_openings;
	private ImageView icon_openings;
	private TextView textview69;
	private TextView textview10;
	private MaterialCardView cardview18;
	private TextView textview71;
	private TextView textview72;
	private ImageView icon_empty_state;
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.finish_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		scroll_view = _view.findViewById(R.id.scroll_view);
		main_container = _view.findViewById(R.id.main_container);
		cardview7 = _view.findViewById(R.id.cardview7);
		linear25 = _view.findViewById(R.id.linear25);
		header_card = _view.findViewById(R.id.header_card);
		material_divider26 = _view.findViewById(R.id.material_divider26);
		expandableLayout = _view.findViewById(R.id.expandableLayout);
		header_section = _view.findViewById(R.id.header_section);
		linear41 = _view.findViewById(R.id.linear41);
		textinputlayout4 = _view.findViewById(R.id.textinputlayout4);
		linear42 = _view.findViewById(R.id.linear42);
		name = _view.findViewById(R.id.name);
		helpButton = _view.findViewById(R.id.helpButton);
		expand_arrow = _view.findViewById(R.id.expand_arrow);
		close = _view.findViewById(R.id.close);
		linear43 = _view.findViewById(R.id.linear43);
		stepper_container = _view.findViewById(R.id.stepper_container);
		shape_step_card = _view.findViewById(R.id.shape_step_card);
		dimensions_step_card = _view.findViewById(R.id.dimensions_step_card);
		openings_step_card = _view.findViewById(R.id.openings_step_card);
		step_1 = _view.findViewById(R.id.step_1);
		progress_line_1 = _view.findViewById(R.id.progress_line_1);
		step_2 = _view.findViewById(R.id.step_2);
		progress_line_2 = _view.findViewById(R.id.progress_line_2);
		step_3 = _view.findViewById(R.id.step_3);
		frame_layout4 = _view.findViewById(R.id.frame_layout4);
		step_1_label = _view.findViewById(R.id.step_1_label);
		step_1_indicator = _view.findViewById(R.id.step_1_indicator);
		step_1_check = _view.findViewById(R.id.step_1_check);
		step_1_number = _view.findViewById(R.id.step_1_number);
		textview4 = _view.findViewById(R.id.textview4);
		frame_layout5 = _view.findViewById(R.id.frame_layout5);
		step_2_label = _view.findViewById(R.id.step_2_label);
		step_2_indicator = _view.findViewById(R.id.step_2_indicator);
		step_2_check = _view.findViewById(R.id.step_2_check);
		step_2_number = _view.findViewById(R.id.step_2_number);
		textview5 = _view.findViewById(R.id.textview5);
		frame_layout6 = _view.findViewById(R.id.frame_layout6);
		step_3_label = _view.findViewById(R.id.step_3_label);
		step_3_indicator = _view.findViewById(R.id.step_3_indicator);
		step_3_check = _view.findViewById(R.id.step_3_check);
		step_3_number = _view.findViewById(R.id.step_3_number);
		textview6 = _view.findViewById(R.id.textview6);
		linear44 = _view.findViewById(R.id.linear44);
		linear45 = _view.findViewById(R.id.linear45);
		shape_layout = _view.findViewById(R.id.shape_layout);
		cardview15 = _view.findViewById(R.id.cardview15);
		linear46 = _view.findViewById(R.id.linear46);
		cardview3 = _view.findViewById(R.id.cardview3);
		icon_shape = _view.findViewById(R.id.icon_shape);
		textview63 = _view.findViewById(R.id.textview63);
		textview7 = _view.findViewById(R.id.textview7);
		textview64 = _view.findViewById(R.id.textview64);
		shape_dropdown = _view.findViewById(R.id.shape_dropdown);
		linear27 = _view.findViewById(R.id.linear27);
		linear47 = _view.findViewById(R.id.linear47);
		textinputlayout_no = _view.findViewById(R.id.textinputlayout_no);
		linear49 = _view.findViewById(R.id.linear49);
		textinputlayout_radius = _view.findViewById(R.id.textinputlayout_radius);
		textinputlayout_area = _view.findViewById(R.id.textinputlayout_area);
		add_opening_button = _view.findViewById(R.id.add_opening_button);
		cardview8 = _view.findViewById(R.id.cardview8);
		cardview16 = _view.findViewById(R.id.cardview16);
		linear48 = _view.findViewById(R.id.linear48);
		cardview4 = _view.findViewById(R.id.cardview4);
		icon_dimensions = _view.findViewById(R.id.icon_dimensions);
		textview66 = _view.findViewById(R.id.textview66);
		textview8 = _view.findViewById(R.id.textview8);
		textview67 = _view.findViewById(R.id.textview67);
		no = _view.findViewById(R.id.no);
		textinputlayout_length = _view.findViewById(R.id.textinputlayout_length);
		textinputlayout_width = _view.findViewById(R.id.textinputlayout_width);
		len = _view.findViewById(R.id.len);
		wed = _view.findViewById(R.id.wed);
		radius = _view.findViewById(R.id.radius);
		area = _view.findViewById(R.id.area);
		linear29 = _view.findViewById(R.id.linear29);
		linear7 = _view.findViewById(R.id.linear7);
		linear30 = _view.findViewById(R.id.linear30);
		textinputlayout_net = _view.findViewById(R.id.textinputlayout_net);
		textview9 = _view.findViewById(R.id.textview9);
		textinputlayout_total = _view.findViewById(R.id.textinputlayout_total);
		textinputlayout_open = _view.findViewById(R.id.textinputlayout_open);
		total_area = _view.findViewById(R.id.total_area);
		total_opening = _view.findViewById(R.id.total_opening);
		net_total = _view.findViewById(R.id.net_total);
		linear35 = _view.findViewById(R.id.linear35);
		linear50 = _view.findViewById(R.id.linear50);
		linear36 = _view.findViewById(R.id.linear36);
		empty_state = _view.findViewById(R.id.empty_state);
		mn_st_lyot = _view.findViewById(R.id.mn_st_lyot);
		cardview17 = _view.findViewById(R.id.cardview17);
		linear51 = _view.findViewById(R.id.linear51);
		delete_all_openings = _view.findViewById(R.id.delete_all_openings);
		icon_openings = _view.findViewById(R.id.icon_openings);
		textview69 = _view.findViewById(R.id.textview69);
		textview10 = _view.findViewById(R.id.textview10);
		cardview18 = _view.findViewById(R.id.cardview18);
		textview71 = _view.findViewById(R.id.textview71);
		textview72 = _view.findViewById(R.id.textview72);
		icon_empty_state = _view.findViewById(R.id.icon_empty_state);
		
		cardview7.setOnLongClickListener((v) -> {
			try {
				Vibrator vibrator = (Vibrator) requireContext().getSystemService(Context.VIBRATOR_SERVICE);
				if (vibrator != null && vibrator.hasVibrator()) {
					if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
						vibrator.vibrate(android.os.VibrationEffect.createOneShot(50, android.os.VibrationEffect.DEFAULT_AMPLITUDE));
					} else {
						vibrator.vibrate(50);
					}
				}
			} catch (Exception e) {
				Log.e("FinishFragment", "Vibration error: " + e.getMessage());
			}
			
			// Show delete confirmation
			_showDeleteConfirmation();
			
			return true;
		});
		
		helpButton.setOnClickListener((v) -> {
			new MaterialAlertDialogBuilder(requireContext())
			.setTitle("Help")
			.setMessage("• Choose a shape type from the dropdown\n" +
			"• Enter dimensions within the valid ranges\n" +
			"• Add openings using the '+' button\n" +
			"• Long press fields for measurement ranges\n" +
			"• Net area updates automatically"
			)
			.setPositiveButton("OK", null)
			.show();
		});
		
		expand_arrow.setOnClickListener((v) -> {
			if (expandableLayout.isExpanded()) {
				expandableLayout.collapse();
				expand_arrow.animate().rotation((float)0).setDuration((int)300);
			} else {
				expandableLayout.expand();
				expand_arrow.animate().rotation((float)-180).setDuration((int)300);
				isStep1Complete = !TextUtils.isEmpty(shape_dropdown.getText().toString());
				isStep2Complete = !TextUtils.isEmpty(areaText) && _is_number(areaText) && !TextUtils.isEmpty(noText) && _is_number(noText);
				if (isStep1Complete && isStep2Complete) {
					if (String.valueOf(mn_st_lyot.getChildCount()).equals(String.valueOf(0))) {
						add_opening_button.performClick();
					}
				} else {
					
				}
			}
		});
		
		close.setOnClickListener((v) -> {
			com.google.android.material.dialog.MaterialAlertDialogBuilder builder = 
			new com.google.android.material.dialog.MaterialAlertDialogBuilder(getActivity());
			
			builder.setTitle("⚠️ تأكيد الإغلاق");
			builder.setMessage("هل أنت متأكد من إغلاق هذا الجدار؟\n\nسيتم حذف جميع البيانات والفتحات المدخلة.");
			
			builder.setPositiveButton("نعم", (DialogInterface dialog, int which) -> {
				try {
					getParentFragmentManager().beginTransaction()
					.remove(FinishFragmentActivity.this)
					.commitAllowingStateLoss();
					
					// الانتظار حتى يتم الحذف فعلياً ثم إعادة الحساب
					new Handler(Looper.getMainLooper()).postDelayed(() -> {
						if (getActivity() instanceof TabLayoutActivity) {
							((TabLayoutActivity) getActivity())._recalculateSum();
						}
					}, 100); // انتظار 100ms للتأكد من اكتمال الحذف
					
				} catch(Exception e) {
					Log.e("FinishFragment", "Error: " + e.getMessage());
				}
			});
			
			builder.setNegativeButton("إلغاء", null);
			
			// استخدام androidx.appcompat.app.AlertDialog بدلاً من android.app.AlertDialog
			androidx.appcompat.app.AlertDialog dialog = builder.create();
			dialog.show();
			
			// تغيير لون الأزرار
			dialog.getButton(androidx.appcompat.app.AlertDialog.BUTTON_POSITIVE).setTextColor(
			androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_error));
			dialog.getButton(androidx.appcompat.app.AlertDialog.BUTTON_NEGATIVE).setTextColor(
			androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_primary));
		});
		
		shape_dropdown.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				_resetForSelectedShape(_charSeq);
				_updateStepProgress();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		add_opening_button.setOnClickListener((v) -> {
			if (!expandableLayout.isExpanded()) {
				expandableLayout.expand();
				expand_arrow.animate().rotation((float)-180).setDuration((int)300);
			}
			
			OpeningsFragmentActivity fragment = new OpeningsFragmentActivity();
			
			// استخدام getChildFragmentManager بدلاً من getActivity().getSupportFragmentManager()
			getChildFragmentManager().beginTransaction()
			.add(R.id.mn_st_lyot, fragment)
			.addToBackStack(null)
			.commit();
			// Show Step 3
			step_3.setVisibility(View.VISIBLE);
			progress_line_2.setVisibility(View.VISIBLE);
			progress_line_2.setBackgroundColor(
			MaterialColors.getColor(progress_line_2, com.google.android.material.R.attr.colorPrimary)
			);
			// Activate Step 3
			step_3_indicator.setCardBackgroundColor(
			MaterialColors.getColor(step_3_indicator, com.google.android.material.R.attr.colorPrimaryContainer)
			);
			step_3_indicator.setStrokeColor(
			MaterialColors.getColor(step_3_indicator, com.google.android.material.R.attr.colorPrimary)
			);
			step_3_label.setTextColor(
			MaterialColors.getColor(step_3_label, com.google.android.material.R.attr.colorPrimary)
			);
			step_3_number.setTextColor(
			MaterialColors.getColor(step_3_number, com.google.android.material.R.attr.colorOnPrimaryContainer)
			);
			// Animate Step 3 appearance
			step_3.setAlpha(0f);
			step_3.animate()
			.alpha(1f)
			.setDuration(300)
			.start();
			openings_step_card.setVisibility(View.VISIBLE);
		});
		
		no.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try {
					// التحقق من أن القيمة فارغة
					if (TextUtils.isEmpty(_charSeq)) {
						total_area.setText("");
						textinputlayout_no.setHelperText(getString(R.string.repetitions_helper));
						textinputlayout_no.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_onSurfaceVariant)));
						return;
					}
					
					// التحقق من أن القيمة رقم
					if (!_is_number(_charSeq)) {
						textinputlayout_no.setError("يجب إدخال أرقام فقط");
						total_area.setText("");
						return;
					}
					
					// إزالة الخطأ إذا كانت القيمة صحيحة
					textinputlayout_no.setError(null);
					textinputlayout_no.setHelperText(getString(R.string.repetitions_helper));
					
					// حساب المساحة الإجمالية
					String areaText = area.getText().toString();
					if (_is_number(areaText)) {
						double result = Double.parseDouble(_charSeq) * Double.parseDouble(areaText);
						total_area.setText(_string_format(result));
					}
					
				} catch (Exception e) {
					Log.e("FinishFragment", "Error in no TextWatcher: " + e.getMessage());
					textinputlayout_no.setError("خطأ في الحساب");
				}
				
				_updateStepProgress();
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
				try {
					// مسح الخطأ السابق
					textinputlayout_length.setError(null);
					
					// التحقق من القيم الفارغة
					if (TextUtils.isEmpty(_charSeq)) {
						area.setText("");
						return;
					}
					
					// التحقق من صحة الرقم
					if (!_is_number(_charSeq)) {
						textinputlayout_length.setError("يجب إدخال أرقام فقط");
						area.setText("");
						return;
					}
					
					// حساب المساحة
					String widthText = wed.getText().toString();
					
					if (!TextUtils.isEmpty(widthText) && _is_number(widthText)) {
						double lengthValue = Double.parseDouble(_charSeq);
						double widthValue = Double.parseDouble(widthText);
						double result = lengthValue * widthValue;
						area.setText(_string_format(result));
					} else {
						area.setText("");
					}
					
				} catch (NumberFormatException e) {
					Log.e("FinishFragment", "NumberFormatException in len TextWatcher: " + e.getMessage());
					textinputlayout_length.setError("خطأ في تنسيق الرقم");
					area.setText("");
				} catch (Exception e) {
					Log.e("FinishFragment", "Exception in len TextWatcher: " + e.getMessage());
					textinputlayout_length.setError("خطأ في الحساب");
					area.setText("");
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		wed.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try {
					// مسح الخطأ السابق
					textinputlayout_width.setError(null);
					
					// التحقق من القيم الفارغة
					if (TextUtils.isEmpty(_charSeq)) {
						area.setText("");
						return;
					}
					
					// التحقق من صحة الرقم
					if (!_is_number(_charSeq)) {
						textinputlayout_width.setError("يجب إدخال أرقام فقط");
						area.setText("");
						return;
					}
					
					// حساب المساحة
					String lengthText = len.getText().toString();
					
					if (!TextUtils.isEmpty(lengthText) && _is_number(lengthText)) {
						double widthValue = Double.parseDouble(_charSeq);
						double lengthValue = Double.parseDouble(lengthText);
						double result = widthValue * lengthValue;
						area.setText(_string_format(result));
					} else {
						area.setText("");
					}
					
				} catch (NumberFormatException e) {
					Log.e("FinishFragment", "NumberFormatException in wed TextWatcher: " + e.getMessage());
					textinputlayout_width.setError("خطأ في تنسيق الرقم");
					area.setText("");
				} catch (Exception e) {
					Log.e("FinishFragment", "Exception in wed TextWatcher: " + e.getMessage());
					textinputlayout_width.setError("خطأ في الحساب");
					area.setText("");
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
				try {
					// مسح الخطأ السابق
					textinputlayout_radius.setError(null);
					
					// التحقق من القيم الفارغة
					if (TextUtils.isEmpty(_charSeq)) {
						area.setText("");
						return;
					}
					
					// التحقق من صحة الرقم
					if (!_is_number(_charSeq)) {
						textinputlayout_radius.setError("يجب إدخال أرقام فقط");
						area.setText("");
						return;
					}
					
					// حساب مساحة الدائرة
					double radiusValue = Double.parseDouble(_charSeq);
					double circleArea = Math.PI * Math.pow(radiusValue, 2);
					area.setText(_string_format(circleArea));
					
				} catch (Exception e) {
					Log.e("FinishFragment", "Error in radius TextWatcher: " + e.getMessage());
					textinputlayout_radius.setError("خطأ في الحساب");
					area.setText("");
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
				try {
					textinputlayout_area.setError(null);
					
					if (TextUtils.isEmpty(_charSeq)) {
						total_area.setText("");
						return;
					}
					
					if (!_is_number(_charSeq)) {
						textinputlayout_area.setError("يجب إدخال أرقام فقط");
						total_area.setText("");
						return;
					}
					
					String noText = no.getText().toString();
					if (_is_number(noText)) {
						double result = Double.parseDouble(_charSeq) * Double.parseDouble(noText);
						total_area.setText(_string_format(result));
					} else {
						total_area.setText(_string_format(Double.parseDouble(_charSeq)));
					}
					
					_updateStepProgress(); // ✅ Update stepper
					
				} catch (Exception e) {
					Log.e("FinishFragment", "Error in area TextWatcher: " + e.getMessage());
					textinputlayout_area.setError("خطأ في الحساب");
					total_area.setText("");
				}
				
				_updateStepProgress();
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
					// مسح الرسائل السابقة
					textinputlayout_total.setError(null);
					textinputlayout_open.setError(null);
					
					// التحقق من القيم الفارغة
					if (TextUtils.isEmpty(_charSeq) || !_is_number(_charSeq)) {
						net_total.setText("");
						textinputlayout_net.setHelperText(getString(R.string.net_area_helper));
						textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_onSurfaceVariant)));
						return;
					}
					
					double totalAreaValue = Double.parseDouble(_charSeq);
					String openingText = total_opening.getText().toString();
					
					// إذا لم توجد فتحات
					if (TextUtils.isEmpty(openingText) || !_is_number(openingText)) {
						net_total.setText(_string_format(totalAreaValue));
						textinputlayout_net.setHelperText("✓ لا توجد فتحات");
						textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_primary)));
						return;
					}
					
					double openingValue = Double.parseDouble(openingText);
					
					// الحالة 1: الفتحات أكبر من المساحة - خطأ
					if (openingValue > totalAreaValue) {
						net_total.setText("0");
						textinputlayout_net.setHelperText("⚠️ مساحة الفتحات أكبر من مساحة الجدار!");
						textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_error)));
						textinputlayout_open.setError("الفتحات أكبر من الجدار");
						return;
					}
					
					// الحالة 2: الفتحات تساوي المساحة - تحذير
					if (openingValue == totalAreaValue) {
						net_total.setText("0");
						textinputlayout_net.setHelperText("⚠️ الفتحات تساوي مساحة الجدار بالكامل");
						textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_tertiary)));
						return;
					}
					
					// الحالة 3: الفتحات أقل من 50% - طبيعي
					double netValue = totalAreaValue - openingValue;
					double percentage = (openingValue / totalAreaValue) * 100;
					
					if (percentage < 50) {
						net_total.setText(_string_format(netValue));
						textinputlayout_net.setHelperText("✓ المساحة الصافية (" + _string_format(percentage) + "% فتحات)");
						textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_primary)));
					} 
					// الحالة 4: الفتحات بين 50% و 80% - تحذير
					else if (percentage < 80) {
						net_total.setText(_string_format(netValue));
						textinputlayout_net.setHelperText("⚠️ نسبة الفتحات مرتفعة (" + _string_format(percentage) + "%)");
						textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_tertiary)));
					}
					// الحالة 5: الفتحات أكثر من 80% - تحذير شديد
					else {
						net_total.setText(_string_format(netValue));
						textinputlayout_net.setHelperText("⚠️ نسبة الفتحات مرتفعة جداً (" + _string_format(percentage) + "%)");
						textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_error)));
					}
					
				} catch (Exception e) {
					Log.e("FinishFragment", "Error in total_area TextWatcher: " + e.getMessage());
					net_total.setText("");
					textinputlayout_net.setHelperText("خطأ في الحساب");
					textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
					androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_error)));
				}
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		total_opening.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try {
					// مسح الرسائل السابقة
					textinputlayout_open.setError(null);
					textinputlayout_total.setError(null);
					
					// التحقق من القيم الفارغة
					if (TextUtils.isEmpty(_charSeq) || !_is_number(_charSeq)) {
						String totalText = total_area.getText().toString();
						if (_is_number(totalText)) {
							net_total.setText(_string_format(Double.parseDouble(totalText)));
							textinputlayout_net.setHelperText("✓ لا توجد فتحات");
							textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
							androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_primary)));
						} else {
							net_total.setText("");
						}
						return;
					}
					
					double openingValue = Double.parseDouble(_charSeq);
					String totalText = total_area.getText().toString();
					
					// التحقق من وجود المساحة الإجمالية
					if (TextUtils.isEmpty(totalText) || !_is_number(totalText)) {
						net_total.setText("0");
						textinputlayout_net.setHelperText("⚠️ يجب إدخال مساحة الجدار أولاً");
						textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_error)));
						textinputlayout_total.setError("أدخل مساحة الجدار");
						return;
					}
					
					double totalAreaValue = Double.parseDouble(totalText);
					
					// الحالة 1: الفتحات أكبر من المساحة - خطأ
					if (openingValue > totalAreaValue) {
						net_total.setText("0");
						textinputlayout_net.setHelperText("⚠️ مساحة الفتحات أكبر من مساحة الجدار!");
						textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_error)));
						textinputlayout_open.setError("الفتحات أكبر من الجدار");
						return;
					}
					
					// الحالة 2: الفتحات تساوي المساحة - تحذير
					if (openingValue == totalAreaValue) {
						net_total.setText("0");
						textinputlayout_net.setHelperText("⚠️ الفتحات تساوي مساحة الجدار بالكامل");
						textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_tertiary)));
						return;
					}
					
					// الحالة 3: الفتحات أقل من 50% - طبيعي
					double netValue = totalAreaValue - openingValue;
					double percentage = (openingValue / totalAreaValue) * 100;
					
					if (percentage < 50) {
						net_total.setText(_string_format(netValue));
						textinputlayout_net.setHelperText("✓ المساحة الصافية (" + _string_format(percentage) + "% فتحات)");
						textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_primary)));
					} 
					// الحالة 4: الفتحات بين 50% و 80% - تحذير
					else if (percentage < 80) {
						net_total.setText(_string_format(netValue));
						textinputlayout_net.setHelperText("⚠️ نسبة الفتحات مرتفعة (" + _string_format(percentage) + "%)");
						textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_tertiary)));
					}
					// الحالة 5: الفتحات أكثر من 80% - تحذير شديد
					else {
						net_total.setText(_string_format(netValue));
						textinputlayout_net.setHelperText("⚠️ نسبة الفتحات مرتفعة جداً (" + _string_format(percentage) + "%)");
						textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
						androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_error)));
					}
					
				} catch (Exception e) {
					Log.e("FinishFragment", "Error in total_opening TextWatcher: " + e.getMessage());
					net_total.setText("");
					textinputlayout_net.setHelperText("خطأ في الحساب");
					textinputlayout_net.setHelperTextColor(ColorStateList.valueOf(
					androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_error)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		net_total.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try { 			// التحقق من وجود Activity 		
					if (getActivity() == null || !(getActivity() instanceof TabLayoutActivity)) { 				
						Log.w("FinishFragment", "⚠️ Activity not available for recalculation");		
						return; 		
					} 
					// إعادة حساب المجموع فيTabLayoutActivity 
					((TabLayoutActivity)getActivity())._recalculateSum(); 			 		
					Log.d("FinishFragment", "✓ تم تحديث المجموع الكلي في TabLayout"); 	
				} catch (Exception e) { 	
					Log.e("FinishFragment", "❌ خطأ في net_total TextWatcher: " + e.getMessage()); 			
					// لا نعرض رسالة للمستخدم هنا لأنها ستظهر كثيراً 	
				}
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		delete_all_openings.setOnClickListener((v) -> {
			_removeAllOpenings();
		});

		textinputlayout_length.setEndIconOnClickListener(v -> {
			pendingCameraField = len;
			cameraLauncher.launch(new Intent(requireActivity(), com.my.iengineer1.camera.CameraMeasureActivity.class));
		});
		textinputlayout_width.setEndIconOnClickListener(v -> {
			pendingCameraField = wed;
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
		editTexts.add("Rectangular");
		editTexts.add("Circular");
		editTexts.add("Irregular");
		shape_dropdown.setInputType(InputType.TYPE_NULL); 	ArrayAdapter<String> adapter = 	new ArrayAdapter<String>( 	requireContext(), R.layout.dropdown_menu_popup_item, R.id.textview1, editTexts); 	shape_dropdown.setAdapter(adapter);
		//shape_dropdown.setText(editTexts.get(0), false);
		_updateStepProgress();
		// Current Step
		final int currentStep = 1;
		try{
			isStep1Complete = false;
			isStep2Complete = false;
			isStep3Complete = false;
		}catch(Exception e){
			
		}
	}
	
	public void _resetForSelectedShape(final String _shape) {
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
		if (_value == null || _value.isEmpty()) {
			return (false);
		}
		
		try {
			Double.parseDouble(_value); // تحويل القيمة لرقم
			return true; // إذا نجح التحويل، القيمة رقم
		} catch (NumberFormatException e) {
			return false; // إذا فشل التحويل، القيمة ليست رقم
		}
	}
	
	
	public String _string_format(final double _number) {
		return (String.format(Locale.ENGLISH,"%.02f", _number));
	}
	
	
	public void _recalculateOpenings() {
		try {
			Log.d("FinishFragment", "========== بدء إعادة حساب الفتحات ==========");
			
			if (mn_st_lyot == null) {
				Log.e("FinishFragment", "❌ mn_st_lyot is null");
				return;
			}
			
			int childCount = mn_st_lyot.getChildCount();
			Log.d("FinishFragment", "عدد الفتحات: " + childCount);
			
			// Update Empty State & Delete All Button
			if (childCount == 0) {
				empty_state.setVisibility(View.VISIBLE);
				delete_all_openings.setVisibility(View.GONE);
				total_opening.setText("");
				
				textinputlayout_open.setHelperText("لا توجد فتحات");
				textinputlayout_open.setHelperTextColor(ColorStateList.valueOf(
				androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_onSurfaceVariant)));
				
				return;
			} else {
				empty_state.setVisibility(View.GONE);
				delete_all_openings.setVisibility(View.VISIBLE);
			}
			
			// إعادة تعيين المجموع
			sum = 0;
			int validOpenings = 0;
			
			// حساب مجموع الفتحات
			for (int i = 0; i < childCount; i++) {
				View childView = mn_st_lyot.getChildAt(i);
				
				if (childView == null) {
					Log.w("FinishFragment", "⚠️ Child view at position " + i + " is null");
					continue;
				}
				
				// البحث عن TextInputEditText
				TextInputEditText totalAreaInput = childView.findViewById(R.id.total_area);
				
				if (totalAreaInput == null) {
					Log.w("FinishFragment", "⚠️ total_area not found at position " + i);
					continue;
				}
				
				String valueStr = totalAreaInput.getText().toString();
				
				if (TextUtils.isEmpty(valueStr) || !_is_number(valueStr)) {
					continue;
				}
				
				try {
					double value = Double.parseDouble(valueStr);
					sum += value;
					validOpenings++;
					Log.d("FinishFragment", "✓ Position " + i + " = " + value + " (مجموع حالي: " + sum + ")");
				} catch (NumberFormatException e) {
					Log.e("FinishFragment", "❌ Error parsing value at position " + i + ": " + e.getMessage());
				}
			}
			
			// تحديث النتيجة
			if (validOpenings > 0) {
				total_opening.setText(_string_format(sum));
				textinputlayout_open.setHelperText("✓ " + validOpenings + " opening" + (validOpenings > 1 ? "s" : ""));
				textinputlayout_open.setHelperTextColor(ColorStateList.valueOf(
				androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_primary)));
				
				Log.d("FinishFragment", "✓ عدد الفتحات الصالحة: " + validOpenings);
				Log.d("FinishFragment", "✓ المجموع الكلي: " + sum);
			} else {
				total_opening.setText("");
				textinputlayout_open.setHelperText("لا توجد فتحات صالحة");
				textinputlayout_open.setHelperTextColor(ColorStateList.valueOf(
				androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_error)));
			}
			_updateStepProgress();
			
		} catch (Exception e) {
			Log.e("FinishFragment", "❌ خطأ في _recalculateOpenings: " + e.getMessage());
			e.printStackTrace();
			
			if (getContext() != null) {
				Toast.makeText(getContext(), "خطأ في حساب الفتحات", Toast.LENGTH_SHORT).show();
			}
		}
		
	}
	
	
	public boolean _validateAllFields() {
		boolean isValid = true;
		
		try {
			// التحقق من اسم الجدار
			if (TextUtils.isEmpty(name.getText().toString().trim())) {
				textinputlayout4.setError("يجب إدخال اسم الجدار");
				isValid = false;
			} else {
				textinputlayout4.setError(null);
			}
			
			// التحقق من اختيار الشكل
			if (TextUtils.isEmpty(shape_dropdown.getText().toString())) {
				shape_layout.setError("يجب اختيار شكل الجدار");
				isValid = false;
			} else {
				shape_layout.setError(null);
			}
			
			// التحقق من عدد التكرارات
			if (TextUtils.isEmpty(no.getText().toString()) || !_is_number(no.getText().toString())) {
				textinputlayout_no.setError("يجب إدخال عدد التكرارات");
				isValid = false;
			} else {
				textinputlayout_no.setError(null);
			}
			
			// التحقق من المساحة
			if (TextUtils.isEmpty(area.getText().toString()) || !_is_number(area.getText().toString())) {
				textinputlayout_area.setError("يجب حساب المساحة");
				isValid = false;
			} else {
				textinputlayout_area.setError(null);
			}
			
			Log.d("FinishFragment", "التحقق من الحقول: " + (isValid ? "✓ صحيح" : "❌ يوجد أخطاء"));
			
		} catch (Exception e) {
			Log.e("FinishFragment", "خطأ في _validateAllFields: " + e.getMessage());
			isValid = false;
		}
		
		return isValid;
		
	}
	
	
	public void _clearAllFields() {
		try {
			name.setText("");
			shape_dropdown.setText("");
			no.setText("");
			len.setText("");
			wed.setText("");
			radius.setText("");
			area.setText("");
			total_area.setText("");
			total_opening.setText("");
			net_total.setText("");
			
			// مسح جميع الأخطاء
			textinputlayout4.setError(null);
			shape_layout.setError(null);
			textinputlayout_no.setError(null);
			textinputlayout_length.setError(null);
			textinputlayout_width.setError(null);
			textinputlayout_radius.setError(null);
			textinputlayout_area.setError(null);
			
			Log.d("FinishFragment", "✓ تم مسح جميع الحقول");
			
		} catch (Exception e) {
			Log.e("FinishFragment", "خطأ في _clearAllFields: " + e.getMessage());
		}
		
	}
	
	
	public double _getOpeningsCount() {
		try {
			if (mn_st_lyot != null) {
				return mn_st_lyot.getChildCount();
			}
		} catch (Exception e) {
			Log.e("FinishFragment", "خطأ في _getOpeningsCount: " + e.getMessage());
		}
		return 0;
		
	}
	
	
	public void _removeAllOpenings() {
		try {
			if (mn_st_lyot != null && mn_st_lyot.getChildCount() > 0) {
				
				com.google.android.material.dialog.MaterialAlertDialogBuilder builder = 
				new com.google.android.material.dialog.MaterialAlertDialogBuilder(getActivity());
				
				builder.setTitle("⚠️ Clear All Openings");
				builder.setMessage("Delete all " + mn_st_lyot.getChildCount() + " openings?");
				
				builder.setPositiveButton("Yes, Delete All", (DialogInterface dialog, int which) -> {
					try {
						// Animate removal
						for (int i = mn_st_lyot.getChildCount() - 1; i >= 0; i--) {
							View child = mn_st_lyot.getChildAt(i);
							if (child != null) {
								child.animate()
								.alpha(0f)
								.translationX(-child.getWidth())
								.setDuration(200)
								.withEndAction(() -> {
									mn_st_lyot.removeView(child);
									_recalculateOpenings();
								})
								.start();
							}
						}
						
						total_opening.setText("");
						
						Log.d("FinishFragment", "✓ تم حذف جميع الفتحات");
						
						if (getContext() != null) {
							Toast.makeText(getContext(), "✓ All openings deleted", Toast.LENGTH_SHORT).show();
						}
						
					} catch (Exception e) {
						Log.e("FinishFragment", "خطأ في حذف الفتحات: " + e.getMessage());
					}
				});
				
				builder.setNegativeButton("Cancel", null);
				
				androidx.appcompat.app.AlertDialog alertDialog = builder.create();
				alertDialog.show();
				
				alertDialog.getButton(androidx.appcompat.app.AlertDialog.BUTTON_POSITIVE)
				.setTextColor(androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_error));
				alertDialog.getButton(androidx.appcompat.app.AlertDialog.BUTTON_NEGATIVE)
				.setTextColor(androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_primary));
			}
			
		} catch (Exception e) {
			Log.e("FinishFragment", "خطأ في _removeAllOpenings: " + e.getMessage());
		}
		
	}
	
	
	public void _updateStepProgress() {
		try{
			isStep1Complete = !TextUtils.isEmpty(shape_dropdown.getText().toString());
			isStep2Complete = !TextUtils.isEmpty(areaText) && _is_number(areaText) && !TextUtils.isEmpty(noText) && _is_number(noText);
			noText = no.getText().toString();
			areaText = area.getText().toString();
			if (isStep1Complete) {
				// Update Step 1 to Complete
				step_1_indicator.setCardBackgroundColor(
				MaterialColors.getColor(step_1_indicator, com.google.android.material.R.attr.colorPrimary)
				);
				step_1_indicator.setStrokeColor(
				MaterialColors.getColor(step_1_indicator, com.google.android.material.R.attr.colorPrimary)
				);
				step_1_label.setTextColor(
				MaterialColors.getColor(step_1_label, com.google.android.material.R.attr.colorPrimary)
				);
				// Animate check icon
				step_1_check.setScaleX(0f);
				step_1_check.setScaleY(0f);
				step_1_check.animate()
				.scaleX(1f)
				.scaleY(1f)
				.setDuration(300)
				.start();
				// Show Step 2
				progress_line_1.setBackgroundColor(
				MaterialColors.getColor(progress_line_1, com.google.android.material.R.attr.colorPrimary)
				);
				// Activate Step 2 appearance
				step_2_indicator.setCardBackgroundColor(
				MaterialColors.getColor(step_2_indicator, com.google.android.material.R.attr.colorPrimaryContainer)
				);
				step_2_indicator.setStrokeColor(
				MaterialColors.getColor(step_2_indicator, com.google.android.material.R.attr.colorPrimary)
				);
				step_2_label.setTextColor(
				MaterialColors.getColor(step_2_label, com.google.android.material.R.attr.colorPrimary)
				);
				step_2_number.setTextColor(
				MaterialColors.getColor(step_2_number, com.google.android.material.R.attr.colorOnPrimaryContainer)
				);
				// Animate Step 2 appearance
				step_2.setAlpha(0f);
				step_2.animate()
				.alpha(1f)
				.setDuration(300)
				.start();
				Log.d("FinishFragment", "✓ Step 1 Complete - Step 2 Visible");
				cardview3.setVisibility(View.VISIBLE);
				dimensions_step_card.setVisibility(View.VISIBLE);
				step_1_check.setVisibility(View.VISIBLE);
				step_1_number.setVisibility(View.GONE);
			} else {
				step_1_indicator.setCardBackgroundColor(
				MaterialColors.getColor(step_1_indicator, com.google.android.material.R.attr.colorPrimaryContainer)
				);
				step_1_indicator.setStrokeColor(
				MaterialColors.getColor(step_1_indicator, com.google.android.material.R.attr.colorPrimary)
				);
				step_1_label.setTextColor(
				MaterialColors.getColor(step_1_label, com.google.android.material.R.attr.colorPrimary)
				);
				progress_line_1.setBackgroundColor(
				MaterialColors.getColor(progress_line_1, com.google.android.material.R.attr.colorSurfaceVariant)
				);
				dimensions_step_card.setVisibility(View.GONE);
				cardview3.setVisibility(View.GONE);
				step_1_check.setVisibility(View.GONE);
				step_1_number.setVisibility(View.VISIBLE);
			}
			if (isStep1Complete && isStep2Complete) {
				// Update Step 2 to Complete
				step_2_indicator.setCardBackgroundColor(
				MaterialColors.getColor(step_2_indicator, com.google.android.material.R.attr.colorPrimary)
				);
				step_2_indicator.setStrokeColor(
				MaterialColors.getColor(step_2_indicator, com.google.android.material.R.attr.colorPrimary)
				);
				step_2_number.setVisibility(View.GONE);
				step_2_check.setVisibility(View.VISIBLE);
				step_2_label.setTextColor(
				MaterialColors.getColor(step_2_label, com.google.android.material.R.attr.colorPrimary)
				);
				// Animate check icon
				step_2_check.setScaleX(0f);
				step_2_check.setScaleY(0f);
				step_2_check.animate()
				.scaleX(1f)
				.scaleY(1f)
				.setDuration(300)
				.start();
				Log.d("FinishFragment", "✓ Step 2 Complete - Step 3 Visible");
				cardview4.setVisibility(View.VISIBLE);
				add_opening_button.setVisibility(View.VISIBLE);
				openingsCount = mn_st_lyot != null ? mn_st_lyot.getChildCount() : 0;
				if (openingsCount > 0) {
					
					step_3_indicator.setCardBackgroundColor(
					MaterialColors.getColor(step_3_indicator, com.google.android.material.R.attr.colorPrimary)
					);
					step_3_indicator.setStrokeColor(
					MaterialColors.getColor(step_3_indicator, com.google.android.material.R.attr.colorPrimary)
					);
					step_3_number.setVisibility(View.GONE);
					step_3_check.setVisibility(View.VISIBLE);
					step_3_label.setTextColor(
					MaterialColors.getColor(step_3_label, com.google.android.material.R.attr.colorPrimary)
					);
					
					// Animate check
					step_3_check.setScaleX(0f);
					step_3_check.setScaleY(0f);
					step_3_check.animate()
					.scaleX(1f)
					.scaleY(1f)
					.setDuration(300)
					.start();
					
					Log.d("FinishFragment", "✓ Step 3 Complete - " + openingsCount + " openings");
					
					
					
					
				}
			} else {
				// Reset Step 2
				step_2_number.setVisibility(View.VISIBLE);
				step_2_check.setVisibility(View.GONE);
				step_3.setVisibility(View.GONE);
				
				
				step_2_indicator.setCardBackgroundColor(
				MaterialColors.getColor(step_2_indicator, com.google.android.material.R.attr.colorSurfaceVariant)
				);
				step_2_indicator.setStrokeColor(
				MaterialColors.getColor(step_2_indicator, com.google.android.material.R.attr.colorOutlineVariant)
				);
				step_2_label.setTextColor(
				MaterialColors.getColor(step_2_label, com.google.android.material.R.attr.colorOnSurfaceVariant)
				);
				step_2_number.setTextColor(
				MaterialColors.getColor(step_2_number, com.google.android.material.R.attr.colorOnSurfaceVariant)
				);
				cardview4.setVisibility(View.GONE);
				add_opening_button.setVisibility(View.GONE);
			}
			Log.d("FinishFragment", "Stepper Updated: Step1=" + isStep1Complete + ", Step2=" + isStep2Complete);
		}catch(Exception e){
			Log.e("FinishFragment", "Error in _updateStepProgress: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	public void _showDeleteConfirmation() {
		try {
			if (getActivity() == null) {
				Log.w("FinishFragment", "Activity is null");
				return;
			}
			
			com.google.android.material.dialog.MaterialAlertDialogBuilder builder = 
			new com.google.android.material.dialog.MaterialAlertDialogBuilder(getActivity());
			
			builder.setTitle("⚠️ تأكيد الحذف");
			builder.setMessage("هل تريد حذف هذا الجدار؟\n\nسيتم حذف جميع البيانات والفتحات.");
			
			builder.setPositiveButton("حذف", (DialogInterface dialog, int which) -> {
				if (close != null) {
					Log.d("FinishFragment", "✓ Deleting wall");
					close.performClick();
				}
			});
			
			builder.setNegativeButton("إلغاء", null);
			
			androidx.appcompat.app.AlertDialog dialog = builder.create();
			dialog.show();
			
			// Customize button colors
			try {
				dialog.getButton(androidx.appcompat.app.AlertDialog.BUTTON_POSITIVE)
				.setTextColor(androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_error));
				dialog.getButton(androidx.appcompat.app.AlertDialog.BUTTON_NEGATIVE)
				.setTextColor(androidx.core.content.ContextCompat.getColor(requireContext(), R.color.md_theme_primary));
			} catch (Exception e) {
				Log.e("FinishFragment", "Color error: " + e.getMessage());
			}
			
		} catch (Exception e) {
			Log.e("FinishFragment", "Error in _showDeleteConfirmation: " + e.getMessage());
		}
	}
	
	
	public void _deleteLastChildFragment() {
		List<Fragment> fragments = getParentFragmentManager().getFragments();
		if (!fragments.isEmpty()) {
			for (int i = fragments.size() - 1; i >= 0; i--) {
				Fragment fragment = fragments.get(i);
				if (fragment instanceof FinishFragmentActivity) {
					getParentFragmentManager().beginTransaction()
					.remove(fragment)
					.commit();
					break;
				}
			}
		}
	}
	
}
