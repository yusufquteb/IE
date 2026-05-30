package com.my.iengineer1;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
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
import java.io.InputStream;
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.regex.*;
import org.json.*;
import androidx.print.PrintHelper;


public class ToipDrainagePipeLineDepthActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private double stripes_type1 = 0;
	private double temp1 = 0;
	private String tot = "";
	private double temp = 0;
	private boolean dwn = false;
	private double ld_mnn = 0;
	private double mn_st_sum = 0;
	private double store = 0;
	private double total = 0;
	private double mn_st_no = 0;
	private double col_no_ = 0;
	
	private ArrayList<String> diameter = new ArrayList<>();
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview1;
	private LinearLayout linear176;
	private LinearLayout linear205;
	private LinearLayout dynamic_pipe_line;
	private LinearLayout add_dynamic_element_lin;
	private LinearLayout linear713;
	private TextView textview811;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear289;
	private TextView textview555;
	private Button button195;
	private LinearLayout linear720;
	private LinearLayout linear707;
	private TextView textview810;
	private TextView textview583;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private Button button1;
	private TextView textview809;
	private LinearLayout linear195;
	private LinearLayout linear201;
	private LinearLayout linear198;
	private LinearLayout linear202;
	private LinearLayout linear196;
	private LinearLayout linear203;
	private LinearLayout linear197;
	private HorizontalScrollView hscroll8;
	private LinearLayout linear74;
	private LinearLayout linear204;
	private LinearLayout linear200;
	private EditText edittext1;
	private TextView textview603;
	private TextView textview604;
	private TextView textview614;
	private EditText edittext14;
	private TextView textview612;
	private TextView textview613;
	private TextView textview14;
	private EditText edittext2;
	private TextView textview607;
	private TextView textview608;
	private TextView textview611;
	private EditText edittext3;
	private TextView textview609;
	private TextView textview610;
	private LinearLayout linear40;
	private LinearLayout linear43;
	private TextView textview122;
	private LinearLayout linear77;
	private TextView textview58;
	private LinearLayout linear127;
	private LinearLayout linear125;
	private LinearLayout linear126;
	private LinearLayout linear157;
	private EditText edittext4;
	private TextView textview354;
	private EditText edittext5;
	private TextView textview601;
	private TextView textview136;
	private EditText edittext6;
	private TextView textview353;
	private TextView textview60;
	private TextView textview605;
	private EditText edittext7;
	private TextView textview405;
	private TextView textview406;
	private TextView textview123;
	private LinearLayout linear121;
	private LinearLayout linear119;
	private LinearLayout linear120;
	private LinearLayout linear118;
	private EditText edittext8;
	private TextView textview341;
	private EditText edittext9;
	private TextView textview592;
	private TextView textview135;
	private EditText edittext10;
	private TextView textview340;
	private TextView textview138;
	private TextView textview606;
	private EditText edittext11;
	private TextView textview334;
	private TextView textview335;
	private TextView textview467;
	private EditText edittext12;
	private TextView textview286;
	private TextView textview112;
	private LinearLayout linear199;
	private TextView textview2;
	private TextView textview531;
	private EditText edittext13;
	private TextView textview532;
	private TextView textview533;
	private TextView textview704;
	private Button add_dynamic_pipe_line;
	
	private Intent price = new Intent();
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toip_drainage_pipe_line_depth);
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
		linear205 = findViewById(R.id.linear205);
		dynamic_pipe_line = findViewById(R.id.dynamic_pipe_line);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		linear713 = findViewById(R.id.linear713);
		textview811 = findViewById(R.id.textview811);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		button195 = findViewById(R.id.button195);
		linear720 = findViewById(R.id.linear720);
		linear707 = findViewById(R.id.linear707);
		textview810 = findViewById(R.id.textview810);
		textview583 = findViewById(R.id.textview583);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		button1 = findViewById(R.id.button1);
		textview809 = findViewById(R.id.textview809);
		linear195 = findViewById(R.id.linear195);
		linear201 = findViewById(R.id.linear201);
		linear198 = findViewById(R.id.linear198);
		linear202 = findViewById(R.id.linear202);
		linear196 = findViewById(R.id.linear196);
		linear203 = findViewById(R.id.linear203);
		linear197 = findViewById(R.id.linear197);
		hscroll8 = findViewById(R.id.hscroll8);
		linear74 = findViewById(R.id.linear74);
		linear204 = findViewById(R.id.linear204);
		linear200 = findViewById(R.id.linear200);
		edittext1 = findViewById(R.id.edittext1);
		textview603 = findViewById(R.id.textview603);
		textview604 = findViewById(R.id.textview604);
		textview614 = findViewById(R.id.textview614);
		edittext14 = findViewById(R.id.edittext14);
		textview612 = findViewById(R.id.textview612);
		textview613 = findViewById(R.id.textview613);
		textview14 = findViewById(R.id.textview14);
		edittext2 = findViewById(R.id.edittext2);
		textview607 = findViewById(R.id.textview607);
		textview608 = findViewById(R.id.textview608);
		textview611 = findViewById(R.id.textview611);
		edittext3 = findViewById(R.id.edittext3);
		textview609 = findViewById(R.id.textview609);
		textview610 = findViewById(R.id.textview610);
		linear40 = findViewById(R.id.linear40);
		linear43 = findViewById(R.id.linear43);
		textview122 = findViewById(R.id.textview122);
		linear77 = findViewById(R.id.linear77);
		textview58 = findViewById(R.id.textview58);
		linear127 = findViewById(R.id.linear127);
		linear125 = findViewById(R.id.linear125);
		linear126 = findViewById(R.id.linear126);
		linear157 = findViewById(R.id.linear157);
		edittext4 = findViewById(R.id.edittext4);
		textview354 = findViewById(R.id.textview354);
		edittext5 = findViewById(R.id.edittext5);
		textview601 = findViewById(R.id.textview601);
		textview136 = findViewById(R.id.textview136);
		edittext6 = findViewById(R.id.edittext6);
		textview353 = findViewById(R.id.textview353);
		textview60 = findViewById(R.id.textview60);
		textview605 = findViewById(R.id.textview605);
		edittext7 = findViewById(R.id.edittext7);
		textview405 = findViewById(R.id.textview405);
		textview406 = findViewById(R.id.textview406);
		textview123 = findViewById(R.id.textview123);
		linear121 = findViewById(R.id.linear121);
		linear119 = findViewById(R.id.linear119);
		linear120 = findViewById(R.id.linear120);
		linear118 = findViewById(R.id.linear118);
		edittext8 = findViewById(R.id.edittext8);
		textview341 = findViewById(R.id.textview341);
		edittext9 = findViewById(R.id.edittext9);
		textview592 = findViewById(R.id.textview592);
		textview135 = findViewById(R.id.textview135);
		edittext10 = findViewById(R.id.edittext10);
		textview340 = findViewById(R.id.textview340);
		textview138 = findViewById(R.id.textview138);
		textview606 = findViewById(R.id.textview606);
		edittext11 = findViewById(R.id.edittext11);
		textview334 = findViewById(R.id.textview334);
		textview335 = findViewById(R.id.textview335);
		textview467 = findViewById(R.id.textview467);
		edittext12 = findViewById(R.id.edittext12);
		textview286 = findViewById(R.id.textview286);
		textview112 = findViewById(R.id.textview112);
		linear199 = findViewById(R.id.linear199);
		textview2 = findViewById(R.id.textview2);
		textview531 = findViewById(R.id.textview531);
		edittext13 = findViewById(R.id.edittext13);
		textview532 = findViewById(R.id.textview532);
		textview533 = findViewById(R.id.textview533);
		textview704 = findViewById(R.id.textview704);
		add_dynamic_pipe_line = findViewById(R.id.add_dynamic_pipe_line);
		internet = new RequestNetwork(this);
		
		button195.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/2IDFBcY27a4"));
				startActivity(price);
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		edittext14.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext14.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || _charSeq.equals("0")) || (((edittext10.getText().toString().equals("") || edittext10.getText().toString().equals(".")) || edittext10.getText().toString().equals("-")) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || edittext6.getText().toString().equals("-")))) {
					edittext13.setText("");
				}
				else {
					edittext13.setText(String.valueOf(((Double.parseDouble(edittext10.getText().toString()) - Double.parseDouble(edittext6.getText().toString())) / Double.parseDouble(_charSeq)) * 1000));
				}
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
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext13.getText().toString().equals("") || edittext13.getText().toString().equals(".")) || (edittext13.getText().toString().equals("-") || (Double.parseDouble(edittext13.getText().toString()) < 0)))) {
					textview2.setText(".........................................");
				}
				else {
					if (Double.parseDouble(_charSeq) > Double.parseDouble(edittext13.getText().toString())) {
						textview2.setText("الميل المحسوب بناءآ على المناسيب أصغر من الميل المكتوب علي اللوحة");
					}
					else {
						if (Double.parseDouble(_charSeq) < Double.parseDouble(edittext13.getText().toString())) {
							textview2.setText("الميل المحسوب بناءآ على المناسيب أكبر من الميل المكتوب علي اللوحة");
						}
						else {
							textview2.setText("الميل المحسوب بناءآ على المناسيب يساوي الميل المكتوب علي اللوحة");
						}
					}
				}
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
				edittext5.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || _charSeq.equals("-")) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || edittext6.getText().toString().equals("-"))) {
					edittext7.setText(String.valueOf(00.00));
				}
				else {
					edittext7.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext6.getText().toString())));
				}
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
				edittext6.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || _charSeq.equals("-")) || ((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || edittext5.getText().toString().equals("-"))) {
					edittext7.setText(String.valueOf(00.00));
				}
				else {
					edittext7.setText(String.valueOf(Double.parseDouble(edittext5.getText().toString()) - Double.parseDouble(_charSeq)));
				}
				if ((((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || edittext2.getText().toString().equals("0")) || (((_charSeq.equals("") || _charSeq.equals(".")) || _charSeq.equals("-")) || ((edittext10.getText().toString().equals("") || edittext10.getText().toString().equals(".")) || edittext10.getText().toString().equals("-")))) {
					edittext13.setText("");
				}
				else {
					edittext13.setText(String.valueOf(((Double.parseDouble(edittext10.getText().toString()) - Double.parseDouble(_charSeq)) / Double.parseDouble(edittext2.getText().toString())) * 1000));
				}
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
				edittext7.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext12.setText(String.valueOf((Double.parseDouble(_charSeq) + Double.parseDouble(edittext11.getText().toString())) / 2));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext9.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext9.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || _charSeq.equals("-")) || ((edittext10.getText().toString().equals("") || edittext10.getText().toString().equals(".")) || edittext10.getText().toString().equals("-"))) {
					edittext11.setText(String.valueOf(00.00));
				}
				else {
					edittext11.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext10.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext10.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext10.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || _charSeq.equals("-")) || ((edittext9.getText().toString().equals("") || edittext9.getText().toString().equals(".")) || edittext9.getText().toString().equals("-"))) {
					edittext11.setText(String.valueOf(00.00));
				}
				else {
					edittext11.setText(String.valueOf(Double.parseDouble(edittext9.getText().toString()) - Double.parseDouble(_charSeq)));
				}
				if ((((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || edittext2.getText().toString().equals("0")) || (((_charSeq.equals("") || _charSeq.equals(".")) || _charSeq.equals("-")) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || edittext6.getText().toString().equals("-")))) {
					edittext13.setText("");
				}
				else {
					edittext13.setText(String.valueOf(((Double.parseDouble(_charSeq) - Double.parseDouble(edittext6.getText().toString())) / Double.parseDouble(edittext2.getText().toString())) * 1000));
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
				edittext11.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext12.setText(String.valueOf((Double.parseDouble(_charSeq) + Double.parseDouble(edittext7.getText().toString())) / 2));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext12.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext12.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext13.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext13.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0)))) {
					textview2.setText(".........................................");
				}
				else {
					if (Double.parseDouble(edittext3.getText().toString()) > Double.parseDouble(_charSeq)) {
						textview2.setText("الميل المحسوب بناءآ على المناسيب أصغر من الميل المكتوب علي اللوحة");
					}
					else {
						if (Double.parseDouble(edittext3.getText().toString()) < Double.parseDouble(_charSeq)) {
							textview2.setText("الميل المحسوب بناءآ على المناسيب أكبر من الميل المكتوب علي اللوحة");
						}
						else {
							textview2.setText("الميل المحسوب بناءآ على المناسيب يساوي الميل المكتوب علي اللوحة");
						}
					}
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview533.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* الميل طبقآ لمناسيب مية الماسورة\n( نسبة ف الالف ) ../ْ \nيساوى\n( المنسوب ب بداية الفرعة - المنسوب في نهاية الفرعة ) / طول الفرعة");
				return true;
			}
		});
		
		add_dynamic_pipe_line.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
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
		
		{
			AdRequest adRequest = new AdRequest.Builder().build();
		}
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
	public void _eip_d_soil1() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_pipe_line_linear = (LinearLayout) inflater.inflate(R.layout.toip_d_drainage_pipe_line_depth, null, false);
		dynamic_pipe_line.addView(dynamic_pipe_line_linear);
		/*
أولآ التعريفات
*/
		final TextView textview2d = dynamic_pipe_line_linear.findViewById(R.id.textview2d);
		final EditText edittext1d = dynamic_pipe_line_linear.findViewById(R.id.edittext1d);
		edittext1d.setSingleLine(true);
		edittext1d.setFocusableInTouchMode(true);
		final EditText edittext2d = dynamic_pipe_line_linear.findViewById(R.id.edittext2d);
		edittext2d.setSingleLine(true);
		edittext2d.setFocusableInTouchMode(true);
		final EditText edittext3d = dynamic_pipe_line_linear.findViewById(R.id.edittext3d);
		edittext3d.setSingleLine(true);
		edittext3d.setFocusableInTouchMode(true);
		final EditText edittext4d = dynamic_pipe_line_linear.findViewById(R.id.edittext4d);
		edittext4d.setSingleLine(true);
		edittext4d.setFocusableInTouchMode(true);
		final EditText edittext5d = dynamic_pipe_line_linear.findViewById(R.id.edittext5d);
		edittext5d.setSingleLine(true);
		edittext5d.setFocusableInTouchMode(true);
		final EditText edittext6d = dynamic_pipe_line_linear.findViewById(R.id.edittext6d);
		edittext6d.setSingleLine(true);
		edittext6d.setFocusableInTouchMode(true);
		final EditText edittext7d = dynamic_pipe_line_linear.findViewById(R.id.edittext7d);
		edittext7d.setSingleLine(true);
		edittext7d.setFocusableInTouchMode(true);
		final EditText edittext8d = dynamic_pipe_line_linear.findViewById(R.id.edittext8d);
		edittext8d.setSingleLine(true);
		edittext8d.setFocusableInTouchMode(true);
		final EditText edittext9d = dynamic_pipe_line_linear.findViewById(R.id.edittext9d);
		edittext9d.setSingleLine(true);
		edittext9d.setFocusableInTouchMode(true);
		final EditText edittext10d = dynamic_pipe_line_linear.findViewById(R.id.edittext10d);
		edittext10d.setSingleLine(true);
		edittext10d.setFocusableInTouchMode(true);
		final EditText edittext11d = dynamic_pipe_line_linear.findViewById(R.id.edittext11d);
		edittext11d.setSingleLine(true);
		edittext11d.setFocusableInTouchMode(true);
		final EditText edittext12d = dynamic_pipe_line_linear.findViewById(R.id.edittext12d);
		edittext12d.setSingleLine(true);
		edittext12d.setFocusableInTouchMode(true);
		final EditText edittext13d = dynamic_pipe_line_linear.findViewById(R.id.edittext13d);
		edittext13d.setSingleLine(true);
		edittext13d.setFocusableInTouchMode(true);
		final EditText edittext14d = dynamic_pipe_line_linear.findViewById(R.id.edittext14d);
		edittext14d.setSingleLine(true);
		edittext14d.setFocusableInTouchMode(true);
		final ImageView close = dynamic_pipe_line_linear.findViewById(R.id.close);
		/*
ثانيآ الأوامر
*/
		edittext14d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		edittext2d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		edittext2d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				if ((((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) || s.toString().equals("0")) || (((edittext10d.getText().toString().equals("") || edittext10d.getText().toString().equals(".")) || edittext10d.getText().toString().equals("-")) || ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || edittext6d.getText().toString().equals("-")))) {
					edittext13d.setText("");
				}
				else {
					edittext13d.setText(String.valueOf(((Double.parseDouble(edittext10d.getText().toString()) - Double.parseDouble(edittext6d.getText().toString())) / Double.parseDouble(s.toString())) * 1000));
				}
			} });
		edittext3d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		edittext3d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				if (((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) || ((edittext13d.getText().toString().equals("") || edittext13d.getText().toString().equals(".")) || (edittext13d.getText().toString().equals("-") || (Double.parseDouble(edittext13d.getText().toString()) < 0)))) {
					textview2d.setText(".........................................");
				}
				else {
					if (Double.parseDouble(s.toString()) > Double.parseDouble(edittext13d.getText().toString())) {
						textview2d.setText("الميل المحسوب بناءآ على المناسيب أصغر من الميل المكتوب علي اللوحة");
					}
					else {
						if (Double.parseDouble(s.toString()) < Double.parseDouble(edittext13d.getText().toString())) {
							textview2d.setText("الميل المحسوب بناءآ على المناسيب أكبر من الميل المكتوب علي اللوحة");
						}
						else {
							textview2d.setText("الميل المحسوب بناءآ على المناسيب يساوي الميل المكتوب علي اللوحة");
						}
					}
				}
			} });
		edittext5d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
		edittext5d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				if (((s.toString().equals("") || s.toString().equals(".")) || s.toString().equals("-")) || ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || edittext6d.getText().toString().equals("-"))) {
					edittext7d.setText(String.valueOf(00.00));
				}
				else {
					edittext7d.setText(String.valueOf(Double.parseDouble(s.toString()) - Double.parseDouble(edittext6d.getText().toString())));
				}
			} });
		edittext6d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
		edittext6d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				if (((s.toString().equals("") || s.toString().equals(".")) || s.toString().equals("-")) || ((edittext5d.getText().toString().equals("") || edittext5d.getText().toString().equals(".")) || edittext5d.getText().toString().equals("-"))) {
					edittext7d.setText(String.valueOf(00.00));
				}
				else {
					edittext7d.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString()) - Double.parseDouble(s.toString())));
				}
				if ((((edittext2d.getText().toString().equals("") || edittext2d.getText().toString().equals(".")) || (edittext2d.getText().toString().equals("-") || (Double.parseDouble(edittext2d.getText().toString()) < 0))) || edittext2d.getText().toString().equals("0")) || (((s.toString().equals("") || s.toString().equals(".")) || s.toString().equals("-")) || ((edittext10d.getText().toString().equals("") || edittext10d.getText().toString().equals(".")) || edittext10d.getText().toString().equals("-")))) {
					edittext13d.setText("");
				}
				else {
					edittext13d.setText(String.valueOf(((Double.parseDouble(edittext10d.getText().toString()) - Double.parseDouble(s.toString())) / Double.parseDouble(edittext2d.getText().toString())) * 1000));
				}
			} });
		edittext7d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
		edittext7d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				edittext12d.setText(String.valueOf((Double.parseDouble(s.toString()) + Double.parseDouble(edittext11d.getText().toString())) / 2));
			} });
		edittext9d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
		edittext9d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				if (((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) || ((edittext10d.getText().toString().equals("") || edittext10d.getText().toString().equals(".")) || (edittext10d.getText().toString().equals("-") || (Double.parseDouble(edittext10d.getText().toString()) < 0)))) {
					edittext11d.setText(String.valueOf(00.00));
				}
				else {
					edittext11d.setText(String.valueOf(Double.parseDouble(s.toString()) - Double.parseDouble(edittext10d.getText().toString())));
				}
			} });
		edittext10d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
		edittext10d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				if (((s.toString().equals("") || s.toString().equals(".")) || s.toString().equals("-")) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || edittext9d.getText().toString().equals("-"))) {
					edittext11d.setText(String.valueOf(00.00));
				}
				else {
					edittext11d.setText(String.valueOf(Double.parseDouble(edittext9d.getText().toString()) - Double.parseDouble(s.toString())));
				}
				if ((((edittext2d.getText().toString().equals("") || edittext2d.getText().toString().equals(".")) || (edittext2d.getText().toString().equals("-") || (Double.parseDouble(edittext2d.getText().toString()) < 0))) || edittext2d.getText().toString().equals("0")) || (((s.toString().equals("") || s.toString().equals(".")) || s.toString().equals("-")) || ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || edittext6d.getText().toString().equals("-")))) {
					edittext13d.setText("");
				}
				else {
					edittext13d.setText(String.valueOf(((Double.parseDouble(s.toString()) - Double.parseDouble(edittext6d.getText().toString())) / Double.parseDouble(edittext2d.getText().toString())) * 1000));
				}
			} });
		edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
		edittext11d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				edittext12d.setText(String.valueOf((Double.parseDouble(s.toString()) + Double.parseDouble(edittext7d.getText().toString())) / 2));
			} });
		edittext12d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
		edittext13d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		edittext13d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				if (((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) || ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0)))) {
					textview2d.setText(".........................................");
				}
				else {
					if (Double.parseDouble(edittext3d.getText().toString()) > Double.parseDouble(s.toString())) {
						textview2d.setText("الميل المحسوب بناءآ على المناسيب أصغر من الميل المكتوب علي اللوحة");
					}
					else {
						if (Double.parseDouble(edittext3d.getText().toString()) < Double.parseDouble(s.toString())) {
							textview2d.setText("الميل المحسوب بناءآ على المناسيب أكبر من الميل المكتوب علي اللوحة");
						}
						else {
							textview2d.setText("الميل المحسوب بناءآ على المناسيب يساوي الميل المكتوب علي اللوحة");
						}
					}
				}
			} });
		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_pipe_line_linear);
			}
		});
	}
	
	
	public void _removeView(final View _view) {
		try {
				((ViewGroup) _view.getParent()).removeView(_view);
		} catch (Exception e) {
				
		}
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
		PrintHelper printHelper = new PrintHelper(ToipDrainagePipeLineDepthActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
}
