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
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.*;
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.*;
import org.json.*;
import android.print.PrintManager;
import android.print.PrintDocumentAdapter;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class EipreplacementsActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private String path = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview1;
	private LinearLayout linear176;
	private TextView textview2;
	private LinearLayout linear2;
	private TextView textview526;
	private LinearLayout linear9;
	private LinearLayout dynamic_point;
	private LinearLayout add_dynamic_point_linear;
	private TextView textview1073;
	private TextView textview578;
	private LinearLayout linear386;
	private LinearLayout linear389;
	private LinearLayout linear391;
	private LinearLayout linear392;
	private TextView textview1074;
	private TextView textview1075;
	private EditText edittext129;
	private TextView textview1076;
	private TextView textview1078;
	private TextView textview1079;
	private TextView textview1080;
	private TextView textview1081;
	private LinearLayout linear3;
	private HorizontalScrollView hscroll22;
	private TextView textview7;
	private LinearLayout linear4;
	private LinearLayout linear55;
	private LinearLayout linear7;
	private HorizontalScrollView hscroll19;
	private LinearLayout linear8;
	private EditText edittext1;
	private TextView textview6;
	private TextView textview3;
	private LinearLayout linear6;
	private TextView textview4;
	private LinearLayout linear5;
	private TextView L1;
	private EditText edittext3;
	private TextView textview5;
	private EditText edittext2;
	private Button button1;
	private EditText edittext4;
	private TextView textview9;
	private TextView textview8;
	private TextView textview472;
	private EditText edittext5;
	private TextView textview286;
	private TextView textview10;
	private LinearLayout dynamic_point_number_linear;
	private HorizontalScrollView hscroll24;
	private LinearLayout linear10;
	private LinearLayout linear129;
	private LinearLayout linear11;
	private HorizontalScrollView hscroll27;
	private TextView point_type;
	private EditText point_number;
	private TextView textview1082;
	private TextView textview470;
	private EditText edittext6;
	private TextView textview471;
	private TextView textview112;
	private Button button2;
	private LinearLayout linear13;
	private TextView textview481;
	private LinearLayout linear12;
	private TextView textview479;
	private EditText edittext8;
	private TextView textview482;
	private EditText edittext7;
	private LinearLayout linear14;
	private TextView textview12;
	private TextView textview488;
	private TextView textview489;
	private TextView textview704;
	private Button add_dynamic_point;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.eipreplacements);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_fab = findViewById(R.id._fab);
		
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		textview1 = findViewById(R.id.textview1);
		linear176 = findViewById(R.id.linear176);
		textview2 = findViewById(R.id.textview2);
		linear2 = findViewById(R.id.linear2);
		textview526 = findViewById(R.id.textview526);
		linear9 = findViewById(R.id.linear9);
		dynamic_point = findViewById(R.id.dynamic_point);
		add_dynamic_point_linear = findViewById(R.id.add_dynamic_point_linear);
		textview1073 = findViewById(R.id.textview1073);
		textview578 = findViewById(R.id.textview578);
		linear386 = findViewById(R.id.linear386);
		linear389 = findViewById(R.id.linear389);
		linear391 = findViewById(R.id.linear391);
		linear392 = findViewById(R.id.linear392);
		textview1074 = findViewById(R.id.textview1074);
		textview1075 = findViewById(R.id.textview1075);
		edittext129 = findViewById(R.id.edittext129);
		textview1076 = findViewById(R.id.textview1076);
		textview1078 = findViewById(R.id.textview1078);
		textview1079 = findViewById(R.id.textview1079);
		textview1080 = findViewById(R.id.textview1080);
		textview1081 = findViewById(R.id.textview1081);
		linear3 = findViewById(R.id.linear3);
		hscroll22 = findViewById(R.id.hscroll22);
		textview7 = findViewById(R.id.textview7);
		linear4 = findViewById(R.id.linear4);
		linear55 = findViewById(R.id.linear55);
		linear7 = findViewById(R.id.linear7);
		hscroll19 = findViewById(R.id.hscroll19);
		linear8 = findViewById(R.id.linear8);
		edittext1 = findViewById(R.id.edittext1);
		textview6 = findViewById(R.id.textview6);
		textview3 = findViewById(R.id.textview3);
		linear6 = findViewById(R.id.linear6);
		textview4 = findViewById(R.id.textview4);
		linear5 = findViewById(R.id.linear5);
		L1 = findViewById(R.id.L1);
		edittext3 = findViewById(R.id.edittext3);
		textview5 = findViewById(R.id.textview5);
		edittext2 = findViewById(R.id.edittext2);
		button1 = findViewById(R.id.button1);
		edittext4 = findViewById(R.id.edittext4);
		textview9 = findViewById(R.id.textview9);
		textview8 = findViewById(R.id.textview8);
		textview472 = findViewById(R.id.textview472);
		edittext5 = findViewById(R.id.edittext5);
		textview286 = findViewById(R.id.textview286);
		textview10 = findViewById(R.id.textview10);
		dynamic_point_number_linear = findViewById(R.id.dynamic_point_number_linear);
		hscroll24 = findViewById(R.id.hscroll24);
		linear10 = findViewById(R.id.linear10);
		linear129 = findViewById(R.id.linear129);
		linear11 = findViewById(R.id.linear11);
		hscroll27 = findViewById(R.id.hscroll27);
		point_type = findViewById(R.id.point_type);
		point_number = findViewById(R.id.point_number);
		textview1082 = findViewById(R.id.textview1082);
		textview470 = findViewById(R.id.textview470);
		edittext6 = findViewById(R.id.edittext6);
		textview471 = findViewById(R.id.textview471);
		textview112 = findViewById(R.id.textview112);
		button2 = findViewById(R.id.button2);
		linear13 = findViewById(R.id.linear13);
		textview481 = findViewById(R.id.textview481);
		linear12 = findViewById(R.id.linear12);
		textview479 = findViewById(R.id.textview479);
		edittext8 = findViewById(R.id.edittext8);
		textview482 = findViewById(R.id.textview482);
		edittext7 = findViewById(R.id.edittext7);
		linear14 = findViewById(R.id.linear14);
		textview12 = findViewById(R.id.textview12);
		textview488 = findViewById(R.id.textview488);
		textview489 = findViewById(R.id.textview489);
		textview704 = findViewById(R.id.textview704);
		add_dynamic_point = findViewById(R.id.add_dynamic_point);
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext4.setText(String.valueOf(00.00));
				edittext5.setText(String.valueOf(00.00));
				edittext8.setText(String.valueOf(00.00));
				textview12.setText("..............................");
				textview12.setTextColor(0xFF000000);
				edittext4.setTextColor(0xFFE91E63);
				edittext5.setTextColor(0xFFE91E63);
				edittext8.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext4.setText(String.valueOf(00.00));
				edittext5.setText(String.valueOf(00.00));
				edittext4.setTextColor(0xFFE91E63);
				edittext5.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext2.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext4.setText(String.valueOf(00.00));
				edittext5.setText(String.valueOf(00.00));
				edittext4.setTextColor(0xFFE91E63);
				edittext5.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0)))) || ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					edittext4.setText(String.valueOf(Double.parseDouble(edittext2.getText().toString()) + Double.parseDouble(edittext3.getText().toString())));
					edittext5.setText(String.valueOf(Double.parseDouble(edittext4.getText().toString()) - Double.parseDouble(edittext1.getText().toString())));
					edittext4.setTextColor(0xFF000000);
					edittext5.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext4.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext7.setText(String.valueOf(00.00));
				edittext8.setText(String.valueOf(00.00));
				edittext7.setTextColor(0xFFE91E63);
				edittext8.setTextColor(0xFFE91E63);
				textview12.setText("..............................");
				textview12.setTextColor(0xFF000000);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext5.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext5.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext6.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext7.setText(String.valueOf(00.00));
				edittext8.setText(String.valueOf(00.00));
				textview12.setText("..............................");
				textview12.setTextColor(0xFF000000);
				edittext7.setTextColor(0xFFE91E63);
				edittext8.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0)))) || (((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					edittext7.setText(String.valueOf(Double.parseDouble(edittext4.getText().toString()) - Double.parseDouble(edittext6.getText().toString())));
					edittext8.setText(String.valueOf(Double.parseDouble(edittext7.getText().toString()) - Double.parseDouble(edittext1.getText().toString())));
					if ((Double.parseDouble(edittext7.getText().toString()) - Double.parseDouble(edittext1.getText().toString())) < 0) {
						if ((Double.parseDouble(edittext7.getText().toString()) - Double.parseDouble(edittext1.getText().toString())) > -0.03d) {
							textview12.setText("منسوب النقطة أوطى من المنسوب التصميمي بفارق أقل من ٣ سم\nويتم تعويض الفرق \" بالقيمة الموجودة بخانة الفرق \" بطبقة الأحلال التالية");
							textview12.setTextColor(0xFF4CAF50);
						}
						else {
							textview12.setText("النقطة تحتاج لزيادة الأحلال\nمنسوب النقطة أوطى من المنسوب التصميمي\nويتم زيادة طبقة الأحلال بالقيمة الموجودة بالفرق وأعادة تشغيل طبقة الأحلال");
							textview12.setTextColor(0xFF4CAF50);
						}
					}
					else {
						if ((Double.parseDouble(edittext7.getText().toString()) - Double.parseDouble(edittext1.getText().toString())) > 0) {
							if ((Double.parseDouble(edittext7.getText().toString()) - Double.parseDouble(edittext1.getText().toString())) < 0.02d) {
								textview12.setText("منسوب النقطة أعلي من المنسوب التصميمي بفارق أقل من ٢ سم\nوعليه يتم تقليل طبقة الأحلال القادمة عند هذه النقطة بمقدار الفرق");
								textview12.setTextColor(0xFFE91E63);
							}
							else {
								textview12.setText("النقطة تحتاج لتعديل منسوب الأحلال بازالة جزء من الطبقة بالأرتفاع الموضح بالفرق\nمنسوب النقطة أعلي من المنسوب التصميمي");
								textview12.setTextColor(0xFFE91E63);
							}
						}
						else {
							textview12.setText("النقطة لا تحتاج لازالة جزء من طبقة الأحلال أو تعويض باضافة جزء لطبقة الأحلال\nمنسوب النقطة مساوى للمنسوب التصميمي");
							textview12.setTextColor(0xFF3F51B5);
						}
					}
					edittext7.setTextColor(0xFF000000);
					edittext8.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext8.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext8.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext7.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext7.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		add_dynamic_point.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					dynamic_point.setVisibility(View.VISIBLE);
					_eip_d_soil1();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_PrintHelper(linear1);
			}
		});
	}
	
	private void initializeLogic() {
		_CardStyle(textview1080, 25, 25, "#FF4DD0E1", false);
		_CardStyle(add_dynamic_point, 25, 25, "#FF4DD0E1", false);
		/*
شكل ال linears بتاع سطح الميزان
*/
		_round(linear2, "#FFE0F2F1", "#FF000000", 50);
		_round(linear3, "#FFF3E5F5", "#FF000000", 0);
		_round(linear5, "#FFF3E5F5", "#FF000000", 0);
		_round(linear6, "#FFF3E5F5", "#FF000000", 0);
		_round(linear7, "#FFF3E5F5", "#FF000000", 0);
		_round(linear8, "#FFF3E5F5", "#FF000000", 0);
		/*
شكل ال linears بتاع النقط
*/
		_round(linear9, "#FFE0F2F1", "#FF000000", 50);
		_round(linear10, "#FFF3E5F5", "#FF000000", 0);
		_round(linear12, "#FFF3E5F5", "#FF000000", 0);
		_round(linear13, "#FFF3E5F5", "#FF000000", 0);
		_round(linear14, "#FFF3E5F5", "#FF000000", 0);
		/*
الدينامك
*/
		dynamic_point.setVisibility(View.GONE);
		
		{
		}
	}
	
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	
	@Override
	public void onPause() {
		super.onPause();
	}
	
	@Override
	public void onResume() {
		super.onResume();
	}
	public void _CardStyle(final View _view, final double _shadow, final double _radius, final String _color, final boolean _touch) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((int)_radius);
		_view.setBackground(gd);
		
		if (Build.VERSION.SDK_INT >= 21){
			_view.setElevation((int)_shadow);}
		if (_touch) {
			_view.setOnTouchListener(new View.OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					switch (event.getAction()){
						case MotionEvent.ACTION_DOWN:{
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues(0.9f);
							scaleX.setDuration(100);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues(0.9f);
							scaleY.setDuration(100);
							scaleY.start();
							break;
						}
						case MotionEvent.ACTION_UP:{
							
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues((float)1);
							scaleX.setDuration(100);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues((float)1);
							scaleY.setDuration(100);
							scaleY.start();
							
							break;
						}
					}
					return false;
				}
			});
		}
	}
	
	
	public void _GradientDrawable(final View _view, final String _color1, final String _color2) {
		int[] colors = { Color.parseColor(_color1), Color.parseColor(_color2) }; android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, colors); gd.setCornerRadius(0); _view.setBackground(gd);
	}
	
	
	public void _round(final View _view, final String _color, final String _stroke_c, final double _radius) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((float)_radius);
		gd.setStroke(2, Color.parseColor(_stroke_c));
		
		_view.setBackground(gd);
		//With the view you select what will get rounded corners. The color is what the background color will look like. The stroke is the outline (put the same as color to "ignore" it) and the radius is how round will it be.
	}
	
	
	public void _eip_d_soil1() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout ll_mainDynamic = (LinearLayout) inflater.inflate(R.layout.eip_d_soil1, null, false);
		dynamic_point.addView(ll_mainDynamic);
		/*
ترقيم النقطة
*/
		final TextView dynamic_point_type = ll_mainDynamic.findViewById(R.id.dynamic_point_type);
		final EditText dynamic_point_number = ll_mainDynamic.findViewById(R.id.dynamic_point_number);
		dynamic_point_number.setSingleLine(true);
		dynamic_point_number.setFocusableInTouchMode(true);
		dynamic_point_type.setText("بطبقة الأحلال");
		dynamic_point_number.setText(String.valueOf((long)(1 + dynamic_point.getChildCount())));
		/*
شكل ال linears الدينامك
*/
		final LinearLayout dynamic_out_linear1 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear1);
		final LinearLayout dynamic_out_linear2 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear2);
		final LinearLayout dynamic_out_linear3 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear3);
		final LinearLayout dynamic_out_linear4 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear4);
		final LinearLayout dynamic_out_linear5 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear5);
		final LinearLayout dynamic_out_linear6 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear6);
		_round(dynamic_out_linear1, "#FFE0F2F1", "#FF000000", 50);
		_round(dynamic_out_linear2, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear4, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear5, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear6, "#FFF3E5F5", "#FF000000", 0);
		/*
التعليقات والتعريفات للابعاد بالمبني
*/
		final TextView dynamic_point_reading_name = ll_mainDynamic.findViewById(R.id.dynamic_point_reading_name);
		dynamic_point_reading_name.setText("قراءة النقطة علي الميزان\nبالرفع المساحي لطبقة الأحلال ( م )");
		final TextView dynamic_point_level_name = ll_mainDynamic.findViewById(R.id.dynamic_point_level_name);
		dynamic_point_level_name.setText("\n\n\nمنسوب النقطة\nالمرفوعة لطبقة\nالأحلال\n\n\n");
		final TextView dynamic_levels_difference_name = ll_mainDynamic.findViewById(R.id.dynamic_levels_difference_name);
		dynamic_levels_difference_name.setText("الفرق ف المنسوب\n( م )\n( \" منسوب النقطة\nالمرفوعة لطبقة\nالأحلال\"\n-\n\"منسوب سطح\nطبقة الأحلال\nالتصميمي\" )");
		/*
مربعات ادخال الابعاد والمناسيب
*/
		/*
أولا  :
أوامر الدينامك للمربعات أو للناتج أو لكمية العنصر الواحد
*/
		final EditText dynamic_point_reading = ll_mainDynamic.findViewById(R.id.dynamic_point_reading);
		dynamic_point_reading.setSingleLine(true);
		dynamic_point_reading.setFocusableInTouchMode(true);
		final Button dynamic_point_calculation = ll_mainDynamic.findViewById(R.id.dynamic_point_calculation);
		final EditText dynamic_point_level = ll_mainDynamic.findViewById(R.id.dynamic_point_level);
		dynamic_point_level.setSingleLine(true);
		dynamic_point_level.setFocusableInTouchMode(true);
		final EditText dynamic_levels_difference = ll_mainDynamic.findViewById(R.id.dynamic_levels_difference);
		dynamic_levels_difference.setSingleLine(true);
		dynamic_levels_difference.setFocusableInTouchMode(true);
		final TextView dynamic_required_action = ll_mainDynamic.findViewById(R.id.dynamic_required_action);
		/*
ثالثآ : أوامر المربعات أو الناتج أو كمية العنصر الواحد
*/
		dynamic_point_reading.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_point_readingnn = _param1.toString();
								
dynamic_point_reading.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_point_level.setText(String.valueOf(00.00));
				dynamic_levels_difference.setText(String.valueOf(00.00));
				dynamic_required_action.setText("..............................");
				dynamic_point_level.setTextColor(0xFFE91E63);
				dynamic_levels_difference.setTextColor(0xFFE91E63);
				dynamic_required_action.setTextColor(0xFF000000);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext1.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext1nn = _param1.toString();
								
dynamic_levels_difference.setText(String.valueOf(00.00));
				dynamic_required_action.setText("..............................");
				dynamic_levels_difference.setTextColor(0xFFE91E63);
				dynamic_required_action.setTextColor(0xFF000000);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext4.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext4nn = _param1.toString();
								
dynamic_point_level.setText(String.valueOf(00.00));
				dynamic_levels_difference.setText(String.valueOf(00.00));
				dynamic_required_action.setText("..............................");
				dynamic_point_level.setTextColor(0xFFE91E63);
				dynamic_levels_difference.setTextColor(0xFFE91E63);
				dynamic_required_action.setTextColor(0xFF000000);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		dynamic_point_calculation.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0)))) || (((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) || ((dynamic_point_reading.getText().toString().equals("") || dynamic_point_reading.getText().toString().equals(".")) || (dynamic_point_reading.getText().toString().equals("-") || (Double.parseDouble(dynamic_point_reading.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					dynamic_point_level.setText(String.valueOf(Double.parseDouble(edittext4.getText().toString()) - Double.parseDouble(dynamic_point_reading.getText().toString())));
					dynamic_levels_difference.setText(String.valueOf(Double.parseDouble(dynamic_point_level.getText().toString()) - Double.parseDouble(edittext1.getText().toString())));
					if ((Double.parseDouble(dynamic_point_level.getText().toString()) - Double.parseDouble(edittext1.getText().toString())) < 0) {
						if ((Double.parseDouble(dynamic_point_level.getText().toString()) - Double.parseDouble(edittext1.getText().toString())) > -0.03d) {
							dynamic_required_action.setText("منسوب النقطة أوطى من المنسوب التصميمي بفارق أقل من ٣ سم\nويتم تعويض الفرق \" بالقيمة الموجودة بخانة الفرق \" بطبقة الأحلال التالية");
							dynamic_required_action.setTextColor(0xFF4CAF50);
						}
						else {
							dynamic_required_action.setText("النقطة تحتاج لزيادة الأحلال\nمنسوب النقطة أوطى من المنسوب التصميمي\nويتم زيادة طبقة الأحلال بالقيمة الموجودة بالفرق وأعادة تشغيل طبقة الأحلال");
							dynamic_required_action.setTextColor(0xFF4CAF50);
						}
					}
					else {
						if ((Double.parseDouble(dynamic_point_level.getText().toString()) - Double.parseDouble(edittext1.getText().toString())) > 0) {
							if ((Double.parseDouble(dynamic_point_level.getText().toString()) - Double.parseDouble(edittext1.getText().toString())) < 0.02d) {
								dynamic_required_action.setText("منسوب النقطة أعلي من المنسوب التصميمي بفارق أقل من ٢ سم\nوعليه يتم تقليل طبقة الأحلال القادمة عند هذه النقطة بمقدار الفرق");
								dynamic_required_action.setTextColor(0xFFE91E63);
							}
							else {
								dynamic_required_action.setText("النقطة تحتاج لتعديل منسوب الأحلال بازالة جزء من الطبقة بالأرتفاع الموضح بالفرق\nمنسوب النقطة أعلي من المنسوب التصميمي");
								dynamic_required_action.setTextColor(0xFFE91E63);
							}
						}
						else {
							dynamic_required_action.setText("النقطة لا تحتاج لازالة جزء من طبقة الأحلال أو تعويض باضافة جزء لطبقة الأحلال\nمنسوب النقطة مساوى للمنسوب التصميمي");
							dynamic_required_action.setTextColor(0xFF3F51B5);
						}
					}
					dynamic_point_level.setTextColor(0xFF000000);
					dynamic_levels_difference.setTextColor(0xFF000000);
				}
			}
		});
		dynamic_point_level.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		dynamic_levels_difference.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		/*
حذف النقطة
*/
		final Button dynamic_point_remove = ll_mainDynamic.findViewById(R.id.dynamic_point_remove);
		dynamic_point_remove.setText("الغاء النقطة\nالحالية");
		_CardStyle(dynamic_point_remove, 25, 25, "#FF4DD0E1", false);
		dynamic_point_remove.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(ll_mainDynamic);
			}
		});
	}
	
	
	public void _removeView(final View _view) {
		try {
				((ViewGroup) _view.getParent()).removeView(_view);
		} catch (Exception e) {
				
		}
	}
	
	
	public void _Animator(final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.start();
	}


	public void _PrintHelper(final View _view) {
		StringBuilder htmlContent = new StringBuilder();
		htmlContent.append("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">");
		htmlContent.append("<style>body{font-family:Arial,sans-serif;direction:rtl;padding:16px;background:#fff;}");
		htmlContent.append("p{margin:4px 0;padding:6px 8px;border-radius:4px;}");
		htmlContent.append(".input{background:#E8F5E9;border-left:3px solid #4CAF50;}");
		htmlContent.append(".result{background:#E3F2FD;border-left:3px solid #2196F3;}");
		htmlContent.append("h4{color:#006064;margin-top:12px;}");
		htmlContent.append("</style></head><body>");
		_collectViewsHtml(_view, htmlContent);
		htmlContent.append("</body></html>");
		WebView webView = new WebView(EipreplacementsActivity.this);
		webView.loadDataWithBaseURL(null, htmlContent.toString(), "text/html", "UTF-8", null);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageFinished(WebView view, String url) {
				PrintManager printManager = (PrintManager) EipreplacementsActivity.this.getSystemService(PRINT_SERVICE);
				if (printManager != null) {
					PrintDocumentAdapter printAdapter = view.createPrintDocumentAdapter("طباعة");
					printManager.print("طباعة", printAdapter, new android.print.PrintAttributes.Builder().build());
				}
			}
		});
	}

	private void _collectViewsHtml(View v, StringBuilder sb) {
		if (v instanceof android.view.ViewGroup) {
			android.view.ViewGroup vg = (android.view.ViewGroup) v;
			for (int i = 0; i < vg.getChildCount(); i++) {
				_collectViewsHtml(vg.getChildAt(i), sb);
			}
		} else if (v instanceof TextView) {
			String text = ((TextView) v).getText().toString().trim();
			if (!text.isEmpty()) {
				int bgColor = 0;
				if (v.getBackground() instanceof android.graphics.drawable.ColorDrawable) {
					bgColor = ((android.graphics.drawable.ColorDrawable) v.getBackground()).getColor();
				}
				String css = (bgColor == 0xFF4CAF50 || bgColor == 0xFFE8F5E9) ? " class=\"input\"" :
						(bgColor == 0xFF2196F3 || bgColor == 0xFFE3F2FD) ? " class=\"result\"" : "";
				sb.append("<p").append(css).append(">").append(android.text.Html.escapeHtml(text)).append("</p>\n");
			}
		}
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.menu_calc, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_help) {
			new androidx.appcompat.app.AlertDialog.Builder(this)
				.setTitle("طريقة الاستخدام")
				.setMessage("دليل المدخلات\n" +
                "---------------\n" +
                "١ - \" * \" علامة وجود تعريفات أو ملاحظات\n" +
                "-----------------------------------------\n" +
                "فى حالة وجود علامة \" * \" بجوار أسم أو منطوق أو صيغة أي مدخل فيمكنك الضغط علي الأسم أو الصيغة أو المنطوق للمدخل ضغطة طويله وسيظهر تعريف أو ملاحظة لهذا المدخل\n" +
                "٢ - مدخل أساسي يجب إدخاله\n" +
                "أحسب\n" +
                "=\n" +
                "٣ - للحصول علي الناتج أضغط علي الزر الأسود وعند تعديل أو تغيير أي مدخل يتم الضغط مرة أخرى علي الزر الأسود\n" +
                "٤ - لأضافة أو إلغاء أو إظهار قائمة أضغط علي الزر\n" +
                "-----‐---------------------------------")
				.setPositiveButton("حسناً", null)
				.show();
			return true;
		} else if (id == R.id.action_print) {
			_PrintHelper(linear1);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


}
