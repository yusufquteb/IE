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
import java.util.ArrayList;
import java.util.regex.*;
import org.json.*;
import androidx.print.PrintHelper;


public class ToipSewageVilocityChecksActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private double temp = 0;
	private double temp2b = 0;
	private double smell_stripes_distribution_type2 = 0;
	private double temp1 = 0;
	private String tot = "";
	private boolean dwn = false;
	private double ld_mnn = 0;
	private double mn_st_sum = 0;
	private double store = 0;
	private double total = 0;
	private double mn_st_no = 0;
	private double col_no_ = 0;
	private double smell_stripes_distribution_type3 = 0;
	
	private ArrayList<String> diameter = new ArrayList<>();
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview111;
	private LinearLayout linear176;
	private LinearLayout linear2303;
	private LinearLayout linear1258;
	private LinearLayout linear39s1;
	private LinearLayout dynamic_all;
	private LinearLayout add_dynamic_element_lin;
	private TextView textview1221;
	private TextView textview1222;
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
	private Button button90;
	private TextView textview809;
	private TextView textview988;
	private TextView textview987;
	private LinearLayout linear2304;
	private TextView d_textview15;
	private LinearLayout linear2305;
	private TextView textview1973;
	private LinearLayout linear2306;
	private TextView textview1822;
	private TextView textview92;
	private TextView textview1802;
	private TextView textview1823;
	private TextView textview90;
	private TextView textview401;
	private TextView textview1974;
	private TextView textview1977;
	private TextView textview1976;
	private TextView textview1975;
	private TextView textview1978;
	private TextView textview1824;
	private TextView textview1980;
	private TextView textview1983;
	private TextView textview1982;
	private TextView textview1981;
	private TextView textview1984;
	private TextView textview2003;
	private TextView textview1813;
	private TextView textview1814;
	private TextView textview1979;
	private LinearLayout linear389;
	private HorizontalScrollView hscroll2;
	private Button button1;
	private LinearLayout linear11;
	private LinearLayout linear10;
	private TextView textview612;
	private Button button2;
	private LinearLayout linear23;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private HorizontalScrollView hscroll8s1;
	private Button button3;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear6;
	private TextView textview1650;
	private LinearLayout linear7;
	private TextView textview18;
	private EditText element_nums;
	private TextView textview17;
	private TextView textview16;
	private EditText element_num;
	private TextView textview101;
	private LinearLayout linear2334;
	private LinearLayout linear2332;
	private Button button8;
	private Button button9;
	private Button button10;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private EditText edittext1;
	private TextView textview124;
	private TextView textview1;
	private Button button12;
	private Button button11;
	private TextView textview1991;
	private EditText edittext2;
	private TextView textview1992;
	private TextView textview2;
	private TextView textview65;
	private EditText edittext3;
	private TextView textview1073;
	private TextView textview4;
	private TextView textview2010;
	private EditText edittext4;
	private TextView textview403;
	private TextView textview5;
	private TextView textview1996;
	private EditText edittext5;
	private TextView textview1994;
	private TextView textview6;
	private TextView textview1998;
	private EditText edittext6;
	private TextView textview1999;
	private TextView textview3;
	private TextView textview12;
	private LinearLayout linear155;
	private TextView textview7;
	private TextView textview501s1;
	private EditText edittext7;
	private TextView textview355;
	private TextView textview1072;
	private Button add_dynamic_element;
	
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toip_sewage_vilocity_checks);
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
		linear2303 = findViewById(R.id.linear2303);
		linear1258 = findViewById(R.id.linear1258);
		linear39s1 = findViewById(R.id.linear39s1);
		dynamic_all = findViewById(R.id.dynamic_all);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		textview1221 = findViewById(R.id.textview1221);
		textview1222 = findViewById(R.id.textview1222);
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
		button90 = findViewById(R.id.button90);
		textview809 = findViewById(R.id.textview809);
		textview988 = findViewById(R.id.textview988);
		textview987 = findViewById(R.id.textview987);
		linear2304 = findViewById(R.id.linear2304);
		d_textview15 = findViewById(R.id.d_textview15);
		linear2305 = findViewById(R.id.linear2305);
		textview1973 = findViewById(R.id.textview1973);
		linear2306 = findViewById(R.id.linear2306);
		textview1822 = findViewById(R.id.textview1822);
		textview92 = findViewById(R.id.textview92);
		textview1802 = findViewById(R.id.textview1802);
		textview1823 = findViewById(R.id.textview1823);
		textview90 = findViewById(R.id.textview90);
		textview401 = findViewById(R.id.textview401);
		textview1974 = findViewById(R.id.textview1974);
		textview1977 = findViewById(R.id.textview1977);
		textview1976 = findViewById(R.id.textview1976);
		textview1975 = findViewById(R.id.textview1975);
		textview1978 = findViewById(R.id.textview1978);
		textview1824 = findViewById(R.id.textview1824);
		textview1980 = findViewById(R.id.textview1980);
		textview1983 = findViewById(R.id.textview1983);
		textview1982 = findViewById(R.id.textview1982);
		textview1981 = findViewById(R.id.textview1981);
		textview1984 = findViewById(R.id.textview1984);
		textview2003 = findViewById(R.id.textview2003);
		textview1813 = findViewById(R.id.textview1813);
		textview1814 = findViewById(R.id.textview1814);
		textview1979 = findViewById(R.id.textview1979);
		linear389 = findViewById(R.id.linear389);
		hscroll2 = findViewById(R.id.hscroll2);
		button1 = findViewById(R.id.button1);
		linear11 = findViewById(R.id.linear11);
		linear10 = findViewById(R.id.linear10);
		textview612 = findViewById(R.id.textview612);
		button2 = findViewById(R.id.button2);
		linear23 = findViewById(R.id.linear23);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear5 = findViewById(R.id.linear5);
		hscroll8s1 = findViewById(R.id.hscroll8s1);
		button3 = findViewById(R.id.button3);
		hscroll1 = findViewById(R.id.hscroll1);
		linear6 = findViewById(R.id.linear6);
		textview1650 = findViewById(R.id.textview1650);
		linear7 = findViewById(R.id.linear7);
		textview18 = findViewById(R.id.textview18);
		element_nums = findViewById(R.id.element_nums);
		textview17 = findViewById(R.id.textview17);
		textview16 = findViewById(R.id.textview16);
		element_num = findViewById(R.id.element_num);
		textview101 = findViewById(R.id.textview101);
		linear2334 = findViewById(R.id.linear2334);
		linear2332 = findViewById(R.id.linear2332);
		button8 = findViewById(R.id.button8);
		button9 = findViewById(R.id.button9);
		button10 = findViewById(R.id.button10);
		button4 = findViewById(R.id.button4);
		button5 = findViewById(R.id.button5);
		button6 = findViewById(R.id.button6);
		button7 = findViewById(R.id.button7);
		edittext1 = findViewById(R.id.edittext1);
		textview124 = findViewById(R.id.textview124);
		textview1 = findViewById(R.id.textview1);
		button12 = findViewById(R.id.button12);
		button11 = findViewById(R.id.button11);
		textview1991 = findViewById(R.id.textview1991);
		edittext2 = findViewById(R.id.edittext2);
		textview1992 = findViewById(R.id.textview1992);
		textview2 = findViewById(R.id.textview2);
		textview65 = findViewById(R.id.textview65);
		edittext3 = findViewById(R.id.edittext3);
		textview1073 = findViewById(R.id.textview1073);
		textview4 = findViewById(R.id.textview4);
		textview2010 = findViewById(R.id.textview2010);
		edittext4 = findViewById(R.id.edittext4);
		textview403 = findViewById(R.id.textview403);
		textview5 = findViewById(R.id.textview5);
		textview1996 = findViewById(R.id.textview1996);
		edittext5 = findViewById(R.id.edittext5);
		textview1994 = findViewById(R.id.textview1994);
		textview6 = findViewById(R.id.textview6);
		textview1998 = findViewById(R.id.textview1998);
		edittext6 = findViewById(R.id.edittext6);
		textview1999 = findViewById(R.id.textview1999);
		textview3 = findViewById(R.id.textview3);
		textview12 = findViewById(R.id.textview12);
		linear155 = findViewById(R.id.linear155);
		textview7 = findViewById(R.id.textview7);
		textview501s1 = findViewById(R.id.textview501s1);
		edittext7 = findViewById(R.id.edittext7);
		textview355 = findViewById(R.id.textview355);
		textview1072 = findViewById(R.id.textview1072);
		add_dynamic_element = findViewById(R.id.add_dynamic_element);
		internet = new RequestNetwork(this);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear11.setVisibility(View.VISIBLE);
					linear10.setVisibility(View.VISIBLE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear23.setVisibility(View.VISIBLE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear6.setVisibility(View.VISIBLE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
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
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10.setVisibility(View.VISIBLE);
				edittext1.setText(String.valueOf(0.011));
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10.setVisibility(View.VISIBLE);
				edittext1.setText(String.valueOf(0.011));
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10.setVisibility(View.VISIBLE);
				edittext1.setText(String.valueOf(0.0135));
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10.setVisibility(View.VISIBLE);
				edittext1.setText(String.valueOf(0.0135));
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10.setVisibility(View.VISIBLE);
				edittext1.setText(String.valueOf(0.011));
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10.setVisibility(View.VISIBLE);
				edittext1.setText(String.valueOf(0.0115));
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10.setVisibility(View.VISIBLE);
				edittext1.setText(String.valueOf(0.0135));
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(_charSeq) == 00.00d) {
					edittext7.setText(String.valueOf(Double.parseDouble("0.00")));
				}
				else {
					if (linear2.getVisibility() == View.GONE && linear4.getVisibility() == View.GONE) {
						edittext7.setText(String.valueOf(Double.parseDouble("0.00")));
					}
					else {
						if (linear2.getVisibility() == View.VISIBLE && linear4.getVisibility() == View.GONE) {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0))))) {
								edittext7.setText(String.valueOf(Double.parseDouble("0.00")));
							}
							else {
								edittext7.setText(String.valueOf((1 / Double.parseDouble(_charSeq)) * (Math.pow(Double.parseDouble(edittext3.getText().toString()), 0.66666666666666666667d) * Math.pow(Double.parseDouble(edittext6.getText().toString()) / 1000, 0.5d))));
							}
						}
						else {
							if (linear2.getVisibility() == View.GONE && linear4.getVisibility() == View.VISIBLE) {
								if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0))))) {
									edittext7.setText(String.valueOf(Double.parseDouble("0.00")));
								}
								else {
									edittext7.setText(String.valueOf((1 / Double.parseDouble(_charSeq)) * (Math.pow(Double.parseDouble(edittext3.getText().toString()), 0.66666666666666666667d) * Math.pow(Double.parseDouble(edittext6.getText().toString()) / 1000, 0.5d))));
								}
							}
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
		
		button12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear2.setVisibility(View.GONE);
					linear3.setVisibility(View.GONE);
					edittext2.setText("");
					linear4.setVisibility(View.VISIBLE);
					linear5.setVisibility(View.VISIBLE);
					edittext4.setText("");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear2.setVisibility(View.VISIBLE);
					linear3.setVisibility(View.VISIBLE);
					edittext2.setText("");
					linear4.setVisibility(View.GONE);
					linear5.setVisibility(View.GONE);
					edittext4.setText("");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext2.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext3.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					if (Double.parseDouble(_charSeq) < 700) {
						edittext3.setText(String.valueOf(((Math.PI * (Math.pow(Double.parseDouble(_charSeq) / 1000, 2) / 4)) * 0.707712459d) / ((Math.PI * (Double.parseDouble(_charSeq) / 1000)) * 0.607929475d)));
					}
					else {
						edittext3.setText(String.valueOf(((Math.PI * (Math.pow(Double.parseDouble(_charSeq) / 1000, 2) / 4)) * 0.804110885d) / ((Math.PI * (Double.parseDouble(_charSeq) / 1000)) * 0.666367631d)));
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
		
		edittext3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(edittext1.getText().toString()) == 00.00d) {
					edittext7.setText(String.valueOf(Double.parseDouble("0.00")));
				}
				else {
					if (linear2.getVisibility() == View.VISIBLE && linear4.getVisibility() == View.GONE) {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0))))) {
							edittext7.setText(String.valueOf(Double.parseDouble("0.00")));
						}
						else {
							edittext7.setText(String.valueOf((1 / Double.parseDouble(edittext1.getText().toString())) * (Math.pow(Double.parseDouble(_charSeq), 0.66666666666666666667d) * Math.pow(Double.parseDouble(edittext6.getText().toString()) / 1000, 0.5d))));
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
		
		edittext4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext4.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext5.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					if (Double.parseDouble(_charSeq) < 700) {
						edittext5.setText(String.valueOf(((Math.PI * (Math.pow(Double.parseDouble(_charSeq) / 1000, 2) / 4)) * 0.804526061d) / ((Math.PI * (Double.parseDouble(_charSeq) / 1000)) * 0.666399004d)));
					}
					else {
						edittext5.setText(String.valueOf(((Math.PI * (Math.pow(Double.parseDouble(_charSeq) / 1000, 2) / 4)) * 0.947572505d) / ((Math.PI * (Double.parseDouble(_charSeq) / 1000)) * 0.794846571d)));
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
				edittext5.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(edittext1.getText().toString()) == 00.00d) {
					edittext7.setText(String.valueOf(Double.parseDouble("0.00")));
				}
				else {
					if (linear2.getVisibility() == View.GONE && linear4.getVisibility() == View.VISIBLE) {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0))))) {
							edittext7.setText(String.valueOf(Double.parseDouble("0.00")));
						}
						else {
							edittext7.setText(String.valueOf((1 / Double.parseDouble(edittext1.getText().toString())) * (Math.pow(Double.parseDouble(_charSeq), 0.66666666666666666667d) * Math.pow(Double.parseDouble(edittext6.getText().toString()) / 1000, 0.5d))));
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
		
		edittext6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(edittext1.getText().toString()) == 00.00d) {
					edittext7.setText(String.valueOf(Double.parseDouble("0.00")));
				}
				else {
					if (linear2.getVisibility() == View.GONE && linear4.getVisibility() == View.GONE) {
						edittext7.setText(String.valueOf(Double.parseDouble("0.00")));
					}
					else {
						if (linear2.getVisibility() == View.VISIBLE && linear4.getVisibility() == View.GONE) {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) || ((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))))) {
								edittext7.setText(String.valueOf(Double.parseDouble("0.00")));
							}
							else {
								edittext7.setText(String.valueOf((1 / Double.parseDouble(edittext1.getText().toString())) * (Math.pow(Double.parseDouble(edittext3.getText().toString()), 0.66666666666666666667d) * Math.pow(Double.parseDouble(_charSeq) / 1000, 0.5d))));
							}
						}
						else {
							if (linear2.getVisibility() == View.GONE && linear4.getVisibility() == View.VISIBLE) {
								if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) || ((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))))) {
									edittext7.setText(String.valueOf(Double.parseDouble("0.00")));
								}
								else {
									edittext7.setText(String.valueOf((1 / Double.parseDouble(edittext1.getText().toString())) * (Math.pow(Double.parseDouble(edittext5.getText().toString()), 0.66666666666666666667d) * Math.pow(Double.parseDouble(_charSeq) / 1000, 0.5d))));
								}
							}
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
		
		edittext7.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext7.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(edittext7.getText().toString()) == 00.00d) {
					textview7.setVisibility(View.GONE);
				}
				else {
					if (Double.parseDouble(edittext7.getText().toString()) < 0.60d) {
						textview7.setText("سرعة السريان داخل الماسورة أقل من الحد الأدني للسرعة المنصوص عليه بالكود = ٠.٦٠ م/ث ( السرعة المنظفة الذاتية )");
						textview7.setVisibility(View.VISIBLE);
					}
					else {
						if (Double.parseDouble(edittext7.getText().toString()) > 1.50d) {
							textview7.setText("سرعة السريان داخل الماسورة أكبر من الحد الأقصي للسرعة المنصوص عليه بالكود = ١.٥٠ م/ث ( سرعة السريان القصوي )");
							textview7.setVisibility(View.VISIBLE);
						}
						else {
							textview7.setVisibility(View.GONE);
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
		
		add_dynamic_element.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_dynamic_vilocity();
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
		linear11.setVisibility(View.GONE);
		linear10.setVisibility(View.GONE);
		linear23.setVisibility(View.GONE);
		linear2.setVisibility(View.GONE);
		linear3.setVisibility(View.GONE);
		linear4.setVisibility(View.GONE);
		linear5.setVisibility(View.GONE);
		linear6.setVisibility(View.GONE);
		
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
	public void _removeView(final View _view) {
		try {
				((ViewGroup) _view.getParent()).removeView(_view);
		} catch (Exception e) {
				
		}
	}
	
	
	public void _dynamic_vilocity() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_sewage_vilocity_checks = (LinearLayout) inflater.inflate(R.layout.toip_d_sewage_vilocity_checks, null, false);
		dynamic_all.addView(dynamic_sewage_vilocity_checks);
		/*
أولا تعريفات الدينامك
*/
		/*
تعريفات ال ImageView
*/
		final ImageView close = dynamic_sewage_vilocity_checks.findViewById(R.id.close);
		/*
تعريفات ال Button
*/
		final Button button1d = dynamic_sewage_vilocity_checks.findViewById(R.id.button1d);
		final Button button2d = dynamic_sewage_vilocity_checks.findViewById(R.id.button2d);
		final Button button3d = dynamic_sewage_vilocity_checks.findViewById(R.id.button3d);
		final Button button4d = dynamic_sewage_vilocity_checks.findViewById(R.id.button4d);
		final Button button5d = dynamic_sewage_vilocity_checks.findViewById(R.id.button5d);
		final Button button6d = dynamic_sewage_vilocity_checks.findViewById(R.id.button6d);
		final Button button7d = dynamic_sewage_vilocity_checks.findViewById(R.id.button7d);
		final Button button8d = dynamic_sewage_vilocity_checks.findViewById(R.id.button8d);
		final Button button9d = dynamic_sewage_vilocity_checks.findViewById(R.id.button9d);
		final Button button10d = dynamic_sewage_vilocity_checks.findViewById(R.id.button10d);
		final Button button11d = dynamic_sewage_vilocity_checks.findViewById(R.id.button11d);
		final Button button12d = dynamic_sewage_vilocity_checks.findViewById(R.id.button12d);
		/*
تعريفات ال LinearLayout
*/
		final LinearLayout linear11d = dynamic_sewage_vilocity_checks.findViewById(R.id.linear11d);
		final LinearLayout linear10d = dynamic_sewage_vilocity_checks.findViewById(R.id.linear10d);
		final LinearLayout linear23d = dynamic_sewage_vilocity_checks.findViewById(R.id.linear23d);
		final LinearLayout linear2d = dynamic_sewage_vilocity_checks.findViewById(R.id.linear2d);
		final LinearLayout linear3d = dynamic_sewage_vilocity_checks.findViewById(R.id.linear3d);
		final LinearLayout linear4d = dynamic_sewage_vilocity_checks.findViewById(R.id.linear4d);
		final LinearLayout linear5d = dynamic_sewage_vilocity_checks.findViewById(R.id.linear5d);
		final LinearLayout linear6d = dynamic_sewage_vilocity_checks.findViewById(R.id.linear6d);
		/*
تعريفات ال EditText
*/
		final EditText element_numd = dynamic_sewage_vilocity_checks.findViewById(R.id.element_numd);
		element_numd.setSingleLine(true);
		element_numd.setFocusableInTouchMode(true);
		final EditText element_numsd = dynamic_sewage_vilocity_checks.findViewById(R.id.element_numsd);
		element_numsd.setSingleLine(true);
		element_numsd.setFocusableInTouchMode(true);
		final EditText edittext1d = dynamic_sewage_vilocity_checks.findViewById(R.id.edittext1d);
		edittext1d.setSingleLine(true);
		edittext1d.setFocusableInTouchMode(true);
		final EditText edittext2d = dynamic_sewage_vilocity_checks.findViewById(R.id.edittext2d);
		edittext2d.setSingleLine(true);
		edittext2d.setFocusableInTouchMode(true);
		final EditText edittext3d = dynamic_sewage_vilocity_checks.findViewById(R.id.edittext3d);
		edittext3d.setSingleLine(true);
		edittext3d.setFocusableInTouchMode(true);
		final EditText edittext4d = dynamic_sewage_vilocity_checks.findViewById(R.id.edittext4d);
		edittext4d.setSingleLine(true);
		edittext4d.setFocusableInTouchMode(true);
		final EditText edittext5d = dynamic_sewage_vilocity_checks.findViewById(R.id.edittext5d);
		edittext5d.setSingleLine(true);
		edittext5d.setFocusableInTouchMode(true);
		final EditText edittext6d = dynamic_sewage_vilocity_checks.findViewById(R.id.edittext6d);
		edittext6d.setSingleLine(true);
		edittext6d.setFocusableInTouchMode(true);
		final EditText edittext7d = dynamic_sewage_vilocity_checks.findViewById(R.id.edittext7d);
		edittext7d.setSingleLine(true);
		edittext7d.setFocusableInTouchMode(true);
		/*
تعريفات ال TextView
*/
		final TextView textview7d = dynamic_sewage_vilocity_checks.findViewById(R.id.textview7d);
		/*
ثانيآ المدخلات والمعادلات
*/
		linear11d.setVisibility(View.GONE);
		linear10d.setVisibility(View.GONE);
		linear23d.setVisibility(View.GONE);
		linear2d.setVisibility(View.GONE);
		linear3d.setVisibility(View.GONE);
		linear4d.setVisibility(View.GONE);
		linear5d.setVisibility(View.GONE);
		linear6d.setVisibility(View.GONE);
		/*
ترقيم الفتحات
*/
		element_numd.setText(String.valueOf((long)(dynamic_all.getChildCount() + 1)));
		element_numsd.setText(String.valueOf((long)(dynamic_all.getChildCount() + 1)));
		element_numd.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String element_numdnn = _param1.toString();
								
if ((element_numdnn.equals("") || element_numdnn.equals(".")) || (element_numdnn.equals("-") || (Double.parseDouble(element_numdnn) < 0))) {
					element_numsd.setText("");
				}
				else {
					element_numsd.setText(element_numdnn);
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		button1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear11d.setVisibility(View.VISIBLE);
				linear10d.setVisibility(View.VISIBLE);
			}
		});
		button4d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10d.setVisibility(View.VISIBLE);
				edittext1d.setText(String.valueOf(0.0135));
			}
		});
		button5d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10d.setVisibility(View.VISIBLE);
				edittext1d.setText(String.valueOf(0.011));
			}
		});
		button6d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10d.setVisibility(View.VISIBLE);
				edittext1d.setText(String.valueOf(0.0115));
			}
		});
		button7d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10d.setVisibility(View.VISIBLE);
				edittext1d.setText(String.valueOf(0.0135));
			}
		});
		button8d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10d.setVisibility(View.VISIBLE);
				edittext1d.setText(String.valueOf(0.011));
			}
		});
		button9d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10d.setVisibility(View.VISIBLE);
				edittext1d.setText(String.valueOf(0.011));
			}
		});
		button10d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear10d.setVisibility(View.VISIBLE);
				edittext1d.setText(String.valueOf(0.0135));
			}
		});
		edittext1d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext1dnn = _param1.toString();
								
edittext1d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(edittext1dnn) == 00.00d) {
					edittext7d.setText(String.valueOf(Double.parseDouble("0.00")));
				}
				else {
					if (linear2d.getVisibility() == View.GONE && linear4d.getVisibility() == View.GONE) {
						edittext7d.setText(String.valueOf(Double.parseDouble("0.00")));
					}
					else {
						if (linear2d.getVisibility() == View.VISIBLE && linear4d.getVisibility() == View.GONE) {
							if (((edittext1dnn.equals("") || edittext1dnn.equals(".")) || (edittext1dnn.equals("-") || (Double.parseDouble(edittext1dnn) < 0))) || (((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) || ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))))) {
								edittext7d.setText(String.valueOf(Double.parseDouble("0.00")));
							}
							else {
								edittext7d.setText(String.valueOf((1 / Double.parseDouble(edittext1dnn)) * (Math.pow(Double.parseDouble(edittext3d.getText().toString()), 0.66666666666666666667d) * Math.pow(Double.parseDouble(edittext6d.getText().toString()) / 1000, 0.5d))));
							}
						}
						else {
							if (linear2d.getVisibility() == View.GONE && linear4d.getVisibility() == View.VISIBLE) {
								if (((edittext1dnn.equals("") || edittext1dnn.equals(".")) || (edittext1dnn.equals("-") || (Double.parseDouble(edittext1dnn) < 0))) || (((edittext5d.getText().toString().equals("") || edittext5d.getText().toString().equals(".")) || (edittext5d.getText().toString().equals("-") || (Double.parseDouble(edittext5d.getText().toString()) < 0))) || ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))))) {
									edittext7d.setText(String.valueOf(Double.parseDouble("0.00")));
								}
								else {
									edittext7d.setText(String.valueOf((1 / Double.parseDouble(edittext1dnn)) * (Math.pow(Double.parseDouble(edittext5d.getText().toString()), 0.66666666666666666667d) * Math.pow(Double.parseDouble(edittext6d.getText().toString()) / 1000, 0.5d))));
								}
							}
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
		button2d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear23d.setVisibility(View.VISIBLE);
			}
		});
		button11d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear2d.setVisibility(View.VISIBLE);
				linear3d.setVisibility(View.VISIBLE);
				edittext2d.setText("");
				linear4d.setVisibility(View.GONE);
				linear5d.setVisibility(View.GONE);
				edittext4d.setText("");
			}
		});
		button12d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear2d.setVisibility(View.GONE);
				linear3d.setVisibility(View.GONE);
				edittext2d.setText("");
				linear4d.setVisibility(View.VISIBLE);
				linear5d.setVisibility(View.VISIBLE);
				edittext4d.setText("");
			}
		});
		edittext2d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext2dnn = _param1.toString();
								
edittext2d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext2dnn.equals("") || edittext2dnn.equals(".")) || (edittext2dnn.equals("-") || (Double.parseDouble(edittext2dnn) < 0))) {
					edittext3d.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					if (Double.parseDouble(edittext2dnn) < 700) {
						edittext3d.setText(String.valueOf(((Math.PI * (Math.pow(Double.parseDouble(edittext2dnn) / 1000, 2) / 4)) * 0.707712459d) / ((Math.PI * (Double.parseDouble(edittext2dnn) / 1000)) * 0.607929475d)));
					}
					else {
						edittext3d.setText(String.valueOf(((Math.PI * (Math.pow(Double.parseDouble(edittext2dnn) / 1000, 2) / 4)) * 0.804110885d) / ((Math.PI * (Double.parseDouble(edittext2dnn) / 1000)) * 0.666367631d)));
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
		edittext3d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext3dnn = _param1.toString();
								
edittext3d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(edittext1d.getText().toString()) == 00.00d) {
					edittext7d.setText(String.valueOf(Double.parseDouble("0.00")));
				}
				else {
					if (linear2d.getVisibility() == View.VISIBLE && linear4d.getVisibility() == View.GONE) {
						if (((edittext3dnn.equals("") || edittext3dnn.equals(".")) || (edittext3dnn.equals("-") || (Double.parseDouble(edittext3dnn) < 0))) || (((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))) || ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))))) {
							edittext7d.setText(String.valueOf(Double.parseDouble("0.00")));
						}
						else {
							edittext7d.setText(String.valueOf((1 / Double.parseDouble(edittext1d.getText().toString())) * (Math.pow(Double.parseDouble(edittext3dnn), 0.66666666666666666667d) * Math.pow(Double.parseDouble(edittext6d.getText().toString()) / 1000, 0.5d))));
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
		edittext4d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext4dnn = _param1.toString();
								
edittext4d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext4dnn.equals("") || edittext4dnn.equals(".")) || (edittext4dnn.equals("-") || (Double.parseDouble(edittext4dnn) < 0))) {
					edittext5d.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					if (Double.parseDouble(edittext4dnn) < 700) {
						edittext5d.setText(String.valueOf(((Math.PI * (Math.pow(Double.parseDouble(edittext4dnn) / 1000, 2) / 4)) * 0.804526061d) / ((Math.PI * (Double.parseDouble(edittext4dnn) / 1000)) * 0.666399004d)));
					}
					else {
						edittext5d.setText(String.valueOf(((Math.PI * (Math.pow(Double.parseDouble(edittext4dnn) / 1000, 2) / 4)) * 0.947572505d) / ((Math.PI * (Double.parseDouble(edittext4dnn) / 1000)) * 0.794846571d)));
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
		edittext5d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext5dnn = _param1.toString();
								
edittext5d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(edittext1d.getText().toString()) == 00.00d) {
					edittext7d.setText(String.valueOf(Double.parseDouble("0.00")));
				}
				else {
					if (linear2d.getVisibility() == View.GONE && linear4d.getVisibility() == View.VISIBLE) {
						if (((edittext5dnn.equals("") || edittext5dnn.equals(".")) || (edittext5dnn.equals("-") || (Double.parseDouble(edittext5dnn) < 0))) || (((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))) || ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))))) {
							edittext7d.setText(String.valueOf(Double.parseDouble("0.00")));
						}
						else {
							edittext7d.setText(String.valueOf((1 / Double.parseDouble(edittext1d.getText().toString())) * (Math.pow(Double.parseDouble(edittext5dnn), 0.66666666666666666667d) * Math.pow(Double.parseDouble(edittext6d.getText().toString()) / 1000, 0.5d))));
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
		button3d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear6d.setVisibility(View.VISIBLE);
			}
		});
		edittext6d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext6dnn = _param1.toString();
								
edittext6d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(edittext1d.getText().toString()) == 00.00d) {
					edittext7d.setText(String.valueOf(Double.parseDouble("0.00")));
				}
				else {
					if (linear2d.getVisibility() == View.GONE && linear4d.getVisibility() == View.GONE) {
						edittext7d.setText(String.valueOf(Double.parseDouble("0.00")));
					}
					else {
						if (linear2d.getVisibility() == View.VISIBLE && linear4d.getVisibility() == View.GONE) {
							if (((edittext6dnn.equals("") || edittext6dnn.equals(".")) || (edittext6dnn.equals("-") || (Double.parseDouble(edittext6dnn) < 0))) || (((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) || ((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))))) {
								edittext7d.setText(String.valueOf(Double.parseDouble("0.00")));
							}
							else {
								edittext7d.setText(String.valueOf((1 / Double.parseDouble(edittext1d.getText().toString())) * (Math.pow(Double.parseDouble(edittext3d.getText().toString()), 0.66666666666666666667d) * Math.pow(Double.parseDouble(edittext6dnn) / 1000, 0.5d))));
							}
						}
						else {
							if (linear2d.getVisibility() == View.GONE && linear4d.getVisibility() == View.VISIBLE) {
								if (((edittext6dnn.equals("") || edittext6dnn.equals(".")) || (edittext6dnn.equals("-") || (Double.parseDouble(edittext6dnn) < 0))) || (((edittext5d.getText().toString().equals("") || edittext5d.getText().toString().equals(".")) || (edittext5d.getText().toString().equals("-") || (Double.parseDouble(edittext5d.getText().toString()) < 0))) || ((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))))) {
									edittext7d.setText(String.valueOf(Double.parseDouble("0.00")));
								}
								else {
									edittext7d.setText(String.valueOf((1 / Double.parseDouble(edittext1d.getText().toString())) * (Math.pow(Double.parseDouble(edittext5d.getText().toString()), 0.66666666666666666667d) * Math.pow(Double.parseDouble(edittext6dnn) / 1000, 0.5d))));
								}
							}
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
		edittext7d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext7dnn = _param1.toString();
								
edittext7d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(edittext7d.getText().toString()) == 00.00d) {
					textview7d.setVisibility(View.GONE);
				}
				else {
					if (Double.parseDouble(edittext7d.getText().toString()) < 0.60d) {
						textview7d.setText("سرعة السريان داخل الماسورة أقل من الحد الأدني للسرعة المنصوص عليه بالكود = ٠.٦٠ م/ث ( السرعة المنظفة الذاتية )");
						textview7d.setVisibility(View.VISIBLE);
					}
					else {
						if (Double.parseDouble(edittext7d.getText().toString()) > 1.50d) {
							textview7d.setText("سرعة السريان داخل الماسورة أكبر من الحد الأقصي للسرعة المنصوص عليه بالكود = ١.٥٠ م/ث ( سرعة السريان القصوي )");
							textview7d.setVisibility(View.VISIBLE);
						}
						else {
							textview7d.setVisibility(View.GONE);
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
		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_sewage_vilocity_checks);
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
		PrintHelper printHelper = new PrintHelper(ToipSewageVilocityChecksActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
}
