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
import androidx.print.PrintHelper;


public class ToipccSewageStudyPricesActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private String path = "";
	private double temp1 = 0;
	private double temp2 = 0;
	private double temp3 = 0;
	private double temp4 = 0;
	private double temp5 = 0;
	private double temp6 = 0;
	private double temp7 = 0;
	private double temp8 = 0;
	private double temp9 = 0;
	private double temp10 = 0;
	private double temp11 = 0;
	private double temp12 = 0;
	private double temp13 = 0;
	private double temp14 = 0;
	private double temp = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview111;
	private LinearLayout linear176;
	private LinearLayout linear39s1;
	private LinearLayout dynamic_all;
	private LinearLayout add_dynamic_element_lin;
	private LinearLayout linear152;
	private LinearLayout linear2327;
	private TextView textview554;
	private TextView textview578;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private TextView textview555;
	private TextView textview583;
	private EditText edittext12r;
	private TextView textview579;
	private EditText edittext15g;
	private TextView textview580;
	private TextView textview585;
	private TextView textview584;
	private Button button9;
	private TextView textview809;
	private LinearLayout linear389;
	private TextView textview2026;
	private EditText edittext94;
	private HorizontalScrollView hscroll8s1;
	private LinearLayout linear120;
	private HorizontalScrollView hscroll2;
	private LinearLayout linear2320;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear2321;
	private TextView textview2022;
	private LinearLayout linear2324;
	private HorizontalScrollView hscroll4;
	private LinearLayout linear2325;
	private TextView textview18;
	private EditText element_nums;
	private TextView textview17;
	private TextView textview16;
	private EditText element_num;
	private TextView textview101;
	private TextView textview531;
	private EditText edittext11;
	private TextView textview532;
	private TextView textview11;
	private TextView textview2011;
	private EditText edittext19;
	private TextView textview2012;
	private TextView textview19;
	private EditText edittext153;
	private Button button3;
	private LinearLayout linear2322;
	private TextView textview2014;
	private EditText edittext20;
	private TextView textview2015;
	private EditText edittext21;
	private TextView textview2016;
	private TextView textview2017;
	private EditText edittext154;
	private TextView textview334;
	private LinearLayout linear2326;
	private TextView textview2018;
	private EditText edittext22;
	private TextView textview1072;
	private Button add_dynamic_element;
	private TextView textview629;
	private EditText edittext23;
	private TextView textview630;
	private TextView textview631;
	private EditText edittext194;
	private TextView textview2020;
	private LinearLayout linear2328;
	private TextView textview2019;
	private EditText edittext24;
	
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_sewage_study_prices);
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
		textview111 = findViewById(R.id.textview111);
		linear176 = findViewById(R.id.linear176);
		linear39s1 = findViewById(R.id.linear39s1);
		dynamic_all = findViewById(R.id.dynamic_all);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		linear152 = findViewById(R.id.linear152);
		linear2327 = findViewById(R.id.linear2327);
		textview554 = findViewById(R.id.textview554);
		textview578 = findViewById(R.id.textview578);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		textview583 = findViewById(R.id.textview583);
		edittext12r = findViewById(R.id.edittext12r);
		textview579 = findViewById(R.id.textview579);
		edittext15g = findViewById(R.id.edittext15g);
		textview580 = findViewById(R.id.textview580);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		button9 = findViewById(R.id.button9);
		textview809 = findViewById(R.id.textview809);
		linear389 = findViewById(R.id.linear389);
		textview2026 = findViewById(R.id.textview2026);
		edittext94 = findViewById(R.id.edittext94);
		hscroll8s1 = findViewById(R.id.hscroll8s1);
		linear120 = findViewById(R.id.linear120);
		hscroll2 = findViewById(R.id.hscroll2);
		linear2320 = findViewById(R.id.linear2320);
		hscroll1 = findViewById(R.id.hscroll1);
		linear2321 = findViewById(R.id.linear2321);
		textview2022 = findViewById(R.id.textview2022);
		linear2324 = findViewById(R.id.linear2324);
		hscroll4 = findViewById(R.id.hscroll4);
		linear2325 = findViewById(R.id.linear2325);
		textview18 = findViewById(R.id.textview18);
		element_nums = findViewById(R.id.element_nums);
		textview17 = findViewById(R.id.textview17);
		textview16 = findViewById(R.id.textview16);
		element_num = findViewById(R.id.element_num);
		textview101 = findViewById(R.id.textview101);
		textview531 = findViewById(R.id.textview531);
		edittext11 = findViewById(R.id.edittext11);
		textview532 = findViewById(R.id.textview532);
		textview11 = findViewById(R.id.textview11);
		textview2011 = findViewById(R.id.textview2011);
		edittext19 = findViewById(R.id.edittext19);
		textview2012 = findViewById(R.id.textview2012);
		textview19 = findViewById(R.id.textview19);
		edittext153 = findViewById(R.id.edittext153);
		button3 = findViewById(R.id.button3);
		linear2322 = findViewById(R.id.linear2322);
		textview2014 = findViewById(R.id.textview2014);
		edittext20 = findViewById(R.id.edittext20);
		textview2015 = findViewById(R.id.textview2015);
		edittext21 = findViewById(R.id.edittext21);
		textview2016 = findViewById(R.id.textview2016);
		textview2017 = findViewById(R.id.textview2017);
		edittext154 = findViewById(R.id.edittext154);
		textview334 = findViewById(R.id.textview334);
		linear2326 = findViewById(R.id.linear2326);
		textview2018 = findViewById(R.id.textview2018);
		edittext22 = findViewById(R.id.edittext22);
		textview1072 = findViewById(R.id.textview1072);
		add_dynamic_element = findViewById(R.id.add_dynamic_element);
		textview629 = findViewById(R.id.textview629);
		edittext23 = findViewById(R.id.edittext23);
		textview630 = findViewById(R.id.textview630);
		textview631 = findViewById(R.id.textview631);
		edittext194 = findViewById(R.id.edittext194);
		textview2020 = findViewById(R.id.textview2020);
		linear2328 = findViewById(R.id.linear2328);
		textview2019 = findViewById(R.id.textview2019);
		edittext24 = findViewById(R.id.edittext24);
		internet = new RequestNetwork(this);
		
		//ScrollChange2
		vscroll1.setOnScrollChangeListener(new ScrollView.OnScrollChangeListener() {
			@Override
			public void onScrollChange(View v, int _scrollX, int _scrollY, int _oldScrollX, int _oldScrollY) {
				
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		element_num.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					element_nums.setText("");
				}
				else {
					element_nums.setText(_charSeq);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext11.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext11.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext20.setText(String.valueOf(00.00));
				edittext20.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext19.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext19.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext20.setText(String.valueOf(00.00));
				edittext20.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview19.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccSewageStudyPricesActivity.this, textview19)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* نسبة مصاريف التصميم\n( إن وجدت ) ( جنيه )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٤ % \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext11.getText().toString().equals("") || edittext11.getText().toString().equals(".")) || (edittext11.getText().toString().equals("-") || (Double.parseDouble(edittext11.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext19.getText().toString().equals("") || edittext19.getText().toString().equals(".")) || (edittext19.getText().toString().equals("-") || (Double.parseDouble(edittext19.getText().toString()) < 0))) {
						edittext19.setText(String.valueOf(0.4d));
					}
					edittext20.setText(String.valueOf(((1.3d + (Double.parseDouble(edittext19.getText().toString()) / 100)) / 1.3d) * Double.parseDouble(edittext11.getText().toString())));
					edittext20.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext20.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext20.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
				if ((edittext21.getText().toString().equals("") || edittext21.getText().toString().equals(".")) || (edittext21.getText().toString().equals("-") || (Double.parseDouble(edittext21.getText().toString()) < 0))) {
					edittext22.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext22.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext21.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext21.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext21.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext22.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext22.setText(String.valueOf(Double.parseDouble(edittext20.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext22.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext22.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
				edittext24.setText(String.valueOf(Double.parseDouble(edittext22.getText().toString()) + Double.parseDouble(edittext23.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		add_dynamic_element.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					dynamic_all.setVisibility(View.VISIBLE);
					_toipcc_dynamic_dewatering_price();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext23.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext23.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
				edittext24.setText(String.valueOf(Double.parseDouble(edittext22.getText().toString()) + Double.parseDouble(edittext23.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext24.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext24.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 14)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_PrintHelper(linear1);
			}
		});
		
		_internet_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		/*
الأعلانات
*/
		
		{
			AdRequest adRequest = new AdRequest.Builder().build();
		}
		linear152.setVisibility(View.GONE);
	}
	
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		if (adview1 != null) {
			adview1.destroy();
		}
	}
	
	@Override
	public void onPause() {
		super.onPause();
		if (adview1 != null) {
			adview1.pause();
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (adview1 != null) {
			adview1.resume();
		}
	}
	public void _removeView(final View _view) {
		try {
				((ViewGroup) _view.getParent()).removeView(_view);
		} catch (Exception e) {
				
		}
	}
	
	
	public void _toipcc_dynamic_dewatering_price() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_dewatering_price_linear = (LinearLayout) inflater.inflate(R.layout.toipcc_d_dewatering_price, null, false);
		dynamic_all.addView(dynamic_dewatering_price_linear);
		/*
تعريف الدينامك
*/
		/*
الحاجات المخفية
*/
		final TextView textview1d = dynamic_dewatering_price_linear.findViewById(R.id.textview1d);
		textview1d.setVisibility(View.GONE);
		/*
تصرف الطلمبة
*/
		final LinearLayout linear2d = dynamic_dewatering_price_linear.findViewById(R.id.linear2d);
		linear2d.setVisibility(View.GONE);
		/*
عمق البئر
*/
		final HorizontalScrollView hscroll4d = dynamic_dewatering_price_linear.findViewById(R.id.hscroll4d);
		hscroll4d.setVisibility(View.GONE);
		final LinearLayout linear4d = dynamic_dewatering_price_linear.findViewById(R.id.linear4d);
		linear4d.setVisibility(View.GONE);
		/*
طول خط الطرد
*/
		final HorizontalScrollView hscroll7d = dynamic_dewatering_price_linear.findViewById(R.id.hscroll7d);
		hscroll7d.setVisibility(View.GONE);
		final LinearLayout linear7d = dynamic_dewatering_price_linear.findViewById(R.id.linear7d);
		linear7d.setVisibility(View.GONE);
		/*
احسب ١
*/
		final LinearLayout linear12d = dynamic_dewatering_price_linear.findViewById(R.id.linear12d);
		linear12d.setVisibility(View.GONE);
		final TextView textview13d = dynamic_dewatering_price_linear.findViewById(R.id.textview13d);
		textview13d.setVisibility(View.VISIBLE);
		/*
سعر التجفيف للمتر الطولى بدون المصاريف الإدارية والأرباح
*/
		final LinearLayout linear13d = dynamic_dewatering_price_linear.findViewById(R.id.linear13d);
		linear13d.setVisibility(View.GONE);
		final TextView textview14d = dynamic_dewatering_price_linear.findViewById(R.id.textview14d);
		textview14d.setVisibility(View.GONE);
		/*
سعر التجفيف للمتر الطولى شامل المصاريف الإدارية والأرباح
*/
		final LinearLayout linear17d = dynamic_dewatering_price_linear.findViewById(R.id.linear17d);
		linear17d.setVisibility(View.GONE);
		final HorizontalScrollView hscroll18d = dynamic_dewatering_price_linear.findViewById(R.id.hscroll18d);
		hscroll18d.setVisibility(View.GONE);
		final LinearLayout linear18d = dynamic_dewatering_price_linear.findViewById(R.id.linear18d);
		linear18d.setVisibility(View.GONE);
		final TextView textview16d = dynamic_dewatering_price_linear.findViewById(R.id.textview16d);
		textview16d.setVisibility(View.GONE);
		/*
تعريفات الجزء الخاص بالتجفيف باليوم
*/
		final HorizontalScrollView hscroll121d = dynamic_dewatering_price_linear.findViewById(R.id.hscroll121d);
		hscroll121d.setVisibility(View.GONE);
		final LinearLayout linear121d = dynamic_dewatering_price_linear.findViewById(R.id.linear121d);
		linear121d.setVisibility(View.GONE);
		final EditText edittext121d = dynamic_dewatering_price_linear.findViewById(R.id.edittext121d);
		edittext121d.setSingleLine(true);
		edittext121d.setFocusableInTouchMode(true);
		final LinearLayout linear129d = dynamic_dewatering_price_linear.findViewById(R.id.linear129d);
		linear129d.setVisibility(View.GONE);
		final EditText edittext129d = dynamic_dewatering_price_linear.findViewById(R.id.edittext129d);
		edittext129d.setSingleLine(true);
		edittext129d.setFocusableInTouchMode(true);
		/*
تعريفات الأسماء ال TextView
*/
		final TextView textview7d = dynamic_dewatering_price_linear.findViewById(R.id.textview7d);
		final TextView textview11d = dynamic_dewatering_price_linear.findViewById(R.id.textview11d);
		final TextView textview19d = dynamic_dewatering_price_linear.findViewById(R.id.textview19d);
		final TextView textview20d = dynamic_dewatering_price_linear.findViewById(R.id.textview20d);
		/*
تعريفات مربعات الادخال ومربعات النتائج ال EditText
*/
		final TextView edittext94d = dynamic_dewatering_price_linear.findViewById(R.id.edittext94d);
		final EditText edittext11d = dynamic_dewatering_price_linear.findViewById(R.id.edittext11d);
		edittext11d.setSingleLine(true);
		edittext11d.setFocusableInTouchMode(true);
		final EditText edittext19d = dynamic_dewatering_price_linear.findViewById(R.id.edittext19d);
		edittext19d.setSingleLine(true);
		edittext19d.setFocusableInTouchMode(true);
		final EditText edittext20d = dynamic_dewatering_price_linear.findViewById(R.id.edittext20d);
		edittext20d.setSingleLine(true);
		edittext20d.setFocusableInTouchMode(true);
		final EditText edittext21d = dynamic_dewatering_price_linear.findViewById(R.id.edittext21d);
		edittext21d.setSingleLine(true);
		edittext21d.setFocusableInTouchMode(true);
		final EditText edittext22d = dynamic_dewatering_price_linear.findViewById(R.id.edittext22d);
		edittext22d.setSingleLine(true);
		edittext22d.setFocusableInTouchMode(true);
		final EditText element_num_d = dynamic_dewatering_price_linear.findViewById(R.id.element_num_d);
		element_num_d.setSingleLine(true);
		element_num_d.setFocusableInTouchMode(true);
		final EditText element_nums_d = dynamic_dewatering_price_linear.findViewById(R.id.element_nums_d);
		element_nums_d.setSingleLine(true);
		element_nums_d.setFocusableInTouchMode(true);
		/*
تعريفات الزراير ال botton
*/
		final Button button3d = dynamic_dewatering_price_linear.findViewById(R.id.button3d);
		final ImageView close = dynamic_dewatering_price_linear.findViewById(R.id.close);
		/*
ترقيم الفتحات
*/
		element_num_d.setText(String.valueOf((long)(1 + dynamic_all.getChildCount())));
		element_nums_d.setText(String.valueOf((long)(1 + dynamic_all.getChildCount())));
		element_num_d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				if ((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) {
					element_nums_d.setText("");
				}
				else {
					element_nums_d.setText(String.valueOf((long)(Double.parseDouble(s.toString()))));
				}
			} });
		/*
التعليقات والتعريفات 
*/
		textview7d.setText("بند");
		edittext94d.setText("بالمتر الطولي / توريد وتركيب وإختبار مواسير من البلاستيك ( U.P.V.C ) طبقا للمواصفات المصرية والكود 1717 SN8 والفئة تشمل الحفر في أرض طينية أو رملية والنزح السطحي وتوريد وردم ودمك برمال نظيفة موردة أسفل المواسير بسمك 15 سم وأعلى المواسير بسمك 30سم وحولها بكامل عرض الحفر كما تشمل النقل الداخلي والخارجي من المخزن إلى الموقع مع التفريد على مسارات الخطوط وعمل الجسات الإستكشافية وتسوية وتمهيد الطرق والأعمال المساحية لزوم تركيب الخط وطبقاً للمواصفات الفنية وأصول الصناعة وذلك طبقاً للأقطار والأعماق التالية :- \n\n• مواسير بلاستيك (UPVC) قطر 200 مم\nعمق من 0.00 متر حتي 1.20 متر ");
		textview11d.setText("سعر البند في قائمة الهيئة القومية شامل المصاريف الإداريةوالأرباح ( جنيه )");
		textview20d.setText("اجمالي سعر البند شامل مصاريف التصميم");
		textview19d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة مصاريف التصميم\n( إن وجدت ) ( جنيه )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٤ % \"");
				return true;
			}
		});
		/*
ثالثآ : أوامر المربعات أو الناتج أو كمية العنصر الواحد
*/
		edittext11d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext11dnn = _param1.toString();
								
edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext20d.setText(String.valueOf(00.00));
				edittext20d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext19d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext19dnn = _param1.toString();
								
edittext19d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext20d.setText(String.valueOf(00.00));
				edittext20d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		button3d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0))) {
					edittext19d.setText(String.valueOf(0.4d));
				}
				edittext20d.setText(String.valueOf(((1.3d + (Double.parseDouble(edittext19d.getText().toString()) / 100)) / 1.3d) * Double.parseDouble(edittext11d.getText().toString())));
				edittext20d.setTextColor(0xFF000000);
			}
		});
		edittext20d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext20d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
				if ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0))) {
					edittext22d.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext22d.setText(String.valueOf(Double.parseDouble(s.toString()) * Double.parseDouble(edittext21d.getText().toString())));
				}
			} });
		edittext21d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext21d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				if ((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) {
					edittext22d.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext22d.setText(String.valueOf(Double.parseDouble(edittext20d.getText().toString()) * Double.parseDouble(s.toString())));
				}
			} });
		edittext22d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
		/*
إجمالي المكعبات
*/
		edittext22d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				temp = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo =child.findViewById(R.id.edittext22d);
					temp = temp + Double.parseDouble(tempo.getText().toString());
				}
				edittext23.setText(String.valueOf(temp));
			} });
		/*
حذف بند
*/
		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_dewatering_price_linear);
				/*
إجمالي البنود بعد عملية الحذف
*/
				temp = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo =child.findViewById(R.id.edittext22d);
					temp = temp + Double.parseDouble(tempo.getText().toString());
				}
				edittext23.setText(String.valueOf(temp));
			}
		});
	}
	
	
	public void _PrintHelper(final View _view) {
		Bitmap bm = Bitmap.createBitmap(_view.getWidth(), _view.getHeight(),Bitmap.Config.ARGB_8888); 
		Canvas canvas = new Canvas(bm);
		android.graphics.drawable.Drawable bgDrawable =_view.getBackground();
		_view.setDrawingCacheEnabled(true);
		
		if (bgDrawable!=null) {
				bgDrawable.draw(canvas);
		} else {
				canvas.drawColor(Color.WHITE);}
		_view.draw(canvas);
		PrintHelper printHelper = new PrintHelper(ToipccSewageStudyPricesActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
}
