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
import java.util.regex.*;
import org.json.*;
import android.print.PrintManager;
import android.print.PrintDocumentAdapter;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.print.PrintHelper;


public class ToipccDewateringPricesActivity extends AppCompatActivity {
	
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
	private LinearLayout linear2303;
	private LinearLayout linear1258;
	private LinearLayout linear39s1;
	private LinearLayout dynamic_all;
	private LinearLayout add_dynamic_element_lin;
	private LinearLayout linear152;
	private LinearLayout linear2327;
	private LinearLayout linear713;
	private TextView textview1222;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private TextView textview555;
	private Button button195;
	private LinearLayout linear720;
	private Button button196;
	private LinearLayout linear707;
	private TextView textview1221;
	private TextView textview583;
	private EditText edittext12r;
	private TextView textview579;
	private EditText edittext15g;
	private TextView textview580;
	private TextView textview585;
	private TextView textview584;
	private Button button9;
	private TextView textview809;
	private TextView textview988;
	private TextView textview987;
	private LinearLayout linear2304;
	private TextView d_textview15;
	private LinearLayout linear2305;
	private TextView textview1973;
	private LinearLayout linear2306;
	private TextView textview402;
	private TextView textview1824;
	private TextView textview1822;
	private TextView textview92;
	private TextView textview1802;
	private TextView NoResult;
	private TextView textview90;
	private TextView textview401;
	private TextView textview1974;
	private TextView textview1975;
	private TextView textview1976;
	private TextView textview1977;
	private TextView textview1978;
	private TextView textview1980;
	private TextView textview1981;
	private TextView textview1982;
	private TextView textview1983;
	private TextView textview1984;
	private TextView textview1813;
	private TextView textview1823;
	private TextView textview1979;
	private LinearLayout linear389;
	private TextView textview2028;
	private EditText edittext94;
	private TextView textview1796;
	private LinearLayout linear1212;
	private TextView textview612;
	private LinearLayout linear2308;
	private TextView textview1650;
	private LinearLayout linear2312;
	private HorizontalScrollView hscroll8s1;
	private LinearLayout linear120;
	private HorizontalScrollView hscroll121;
	private LinearLayout linear121;
	private LinearLayout linear930;
	private TextView textview281;
	private LinearLayout linear213s1;
	private TextView textview519;
	private LinearLayout linear402;
	private HorizontalScrollView hscroll2;
	private LinearLayout linear418;
	private TextView textview2021;
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
	private LinearLayout linear100s1;
	private LinearLayout linear101s1;
	private LinearLayout linear102s1;
	private TextView textview614;
	private EditText edittext1;
	private TextView textview124;
	private TextView textview1;
	private EditText edittext2;
	private TextView textview1073;
	private TextView textview2;
	private EditText edittext3;
	private TextView textview403;
	private TextView textview3;
	private LinearLayout linear2309;
	private LinearLayout linear2310;
	private LinearLayout linear2311;
	private TextView textview1991;
	private EditText edittext4;
	private TextView textview1992;
	private TextView textview4;
	private EditText edittext5;
	private TextView textview1994;
	private TextView textview5;
	private EditText edittext6;
	private TextView textview1996;
	private TextView textview6;
	private LinearLayout linear2313;
	private LinearLayout linear2314;
	private LinearLayout linear2315;
	private LinearLayout linear2319;
	private TextView textview1998;
	private EditText edittext7;
	private TextView textview1999;
	private TextView textview7;
	private EditText edittext8;
	private TextView textview2001;
	private TextView textview8;
	private EditText edittext9;
	private TextView textview2003;
	private TextView textview9;
	private EditText edittext10;
	private TextView textview2010;
	private TextView textview10;
	private TextView textview531;
	private EditText edittext11;
	private TextView textview532;
	private TextView textview11;
	private TextView textview601;
	private EditText edittext121;
	private TextView textview602;
	private TextView textview121;
	private Button button1;
	private TextView textview12;
	private LinearLayout linear127;
	private LinearLayout linear128;
	private LinearLayout linear129;
	private LinearLayout linear155;
	private EditText edittext13;
	private TextView textview405;
	private EditText edittext12;
	private TextView textview4b;
	private EditText edittext15;
	private TextView textview1803;
	private TextView textview145;
	private EditText edittext14;
	private TextView textview5h;
	private EditText edittext129;
	private TextView textview129;
	private TextView textview501s1;
	private EditText edittext16;
	private TextView textview355;
	private TextView textview833;
	private EditText edittext17;
	private TextView textview834;
	private TextView textview2029;
	private EditText edittext56;
	private Button button2;
	private LinearLayout linear388;
	private TextView textview815;
	private EditText edittext18;
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
	
	private Intent price = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_dewatering_prices);
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
		linear152 = findViewById(R.id.linear152);
		linear2327 = findViewById(R.id.linear2327);
		linear713 = findViewById(R.id.linear713);
		textview1222 = findViewById(R.id.textview1222);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		button195 = findViewById(R.id.button195);
		linear720 = findViewById(R.id.linear720);
		button196 = findViewById(R.id.button196);
		linear707 = findViewById(R.id.linear707);
		textview1221 = findViewById(R.id.textview1221);
		textview583 = findViewById(R.id.textview583);
		edittext12r = findViewById(R.id.edittext12r);
		textview579 = findViewById(R.id.textview579);
		edittext15g = findViewById(R.id.edittext15g);
		textview580 = findViewById(R.id.textview580);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		button9 = findViewById(R.id.button9);
		textview809 = findViewById(R.id.textview809);
		textview988 = findViewById(R.id.textview988);
		textview987 = findViewById(R.id.textview987);
		linear2304 = findViewById(R.id.linear2304);
		d_textview15 = findViewById(R.id.d_textview15);
		linear2305 = findViewById(R.id.linear2305);
		textview1973 = findViewById(R.id.textview1973);
		linear2306 = findViewById(R.id.linear2306);
		textview402 = findViewById(R.id.textview402);
		textview1824 = findViewById(R.id.textview1824);
		textview1822 = findViewById(R.id.textview1822);
		textview92 = findViewById(R.id.textview92);
		textview1802 = findViewById(R.id.textview1802);
		NoResult = findViewById(R.id.NoResult);
		textview90 = findViewById(R.id.textview90);
		textview401 = findViewById(R.id.textview401);
		textview1974 = findViewById(R.id.textview1974);
		textview1975 = findViewById(R.id.textview1975);
		textview1976 = findViewById(R.id.textview1976);
		textview1977 = findViewById(R.id.textview1977);
		textview1978 = findViewById(R.id.textview1978);
		textview1980 = findViewById(R.id.textview1980);
		textview1981 = findViewById(R.id.textview1981);
		textview1982 = findViewById(R.id.textview1982);
		textview1983 = findViewById(R.id.textview1983);
		textview1984 = findViewById(R.id.textview1984);
		textview1813 = findViewById(R.id.textview1813);
		textview1823 = findViewById(R.id.textview1823);
		textview1979 = findViewById(R.id.textview1979);
		linear389 = findViewById(R.id.linear389);
		textview2028 = findViewById(R.id.textview2028);
		edittext94 = findViewById(R.id.edittext94);
		textview1796 = findViewById(R.id.textview1796);
		linear1212 = findViewById(R.id.linear1212);
		textview612 = findViewById(R.id.textview612);
		linear2308 = findViewById(R.id.linear2308);
		textview1650 = findViewById(R.id.textview1650);
		linear2312 = findViewById(R.id.linear2312);
		hscroll8s1 = findViewById(R.id.hscroll8s1);
		linear120 = findViewById(R.id.linear120);
		hscroll121 = findViewById(R.id.hscroll121);
		linear121 = findViewById(R.id.linear121);
		linear930 = findViewById(R.id.linear930);
		textview281 = findViewById(R.id.textview281);
		linear213s1 = findViewById(R.id.linear213s1);
		textview519 = findViewById(R.id.textview519);
		linear402 = findViewById(R.id.linear402);
		hscroll2 = findViewById(R.id.hscroll2);
		linear418 = findViewById(R.id.linear418);
		textview2021 = findViewById(R.id.textview2021);
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
		linear100s1 = findViewById(R.id.linear100s1);
		linear101s1 = findViewById(R.id.linear101s1);
		linear102s1 = findViewById(R.id.linear102s1);
		textview614 = findViewById(R.id.textview614);
		edittext1 = findViewById(R.id.edittext1);
		textview124 = findViewById(R.id.textview124);
		textview1 = findViewById(R.id.textview1);
		edittext2 = findViewById(R.id.edittext2);
		textview1073 = findViewById(R.id.textview1073);
		textview2 = findViewById(R.id.textview2);
		edittext3 = findViewById(R.id.edittext3);
		textview403 = findViewById(R.id.textview403);
		textview3 = findViewById(R.id.textview3);
		linear2309 = findViewById(R.id.linear2309);
		linear2310 = findViewById(R.id.linear2310);
		linear2311 = findViewById(R.id.linear2311);
		textview1991 = findViewById(R.id.textview1991);
		edittext4 = findViewById(R.id.edittext4);
		textview1992 = findViewById(R.id.textview1992);
		textview4 = findViewById(R.id.textview4);
		edittext5 = findViewById(R.id.edittext5);
		textview1994 = findViewById(R.id.textview1994);
		textview5 = findViewById(R.id.textview5);
		edittext6 = findViewById(R.id.edittext6);
		textview1996 = findViewById(R.id.textview1996);
		textview6 = findViewById(R.id.textview6);
		linear2313 = findViewById(R.id.linear2313);
		linear2314 = findViewById(R.id.linear2314);
		linear2315 = findViewById(R.id.linear2315);
		linear2319 = findViewById(R.id.linear2319);
		textview1998 = findViewById(R.id.textview1998);
		edittext7 = findViewById(R.id.edittext7);
		textview1999 = findViewById(R.id.textview1999);
		textview7 = findViewById(R.id.textview7);
		edittext8 = findViewById(R.id.edittext8);
		textview2001 = findViewById(R.id.textview2001);
		textview8 = findViewById(R.id.textview8);
		edittext9 = findViewById(R.id.edittext9);
		textview2003 = findViewById(R.id.textview2003);
		textview9 = findViewById(R.id.textview9);
		edittext10 = findViewById(R.id.edittext10);
		textview2010 = findViewById(R.id.textview2010);
		textview10 = findViewById(R.id.textview10);
		textview531 = findViewById(R.id.textview531);
		edittext11 = findViewById(R.id.edittext11);
		textview532 = findViewById(R.id.textview532);
		textview11 = findViewById(R.id.textview11);
		textview601 = findViewById(R.id.textview601);
		edittext121 = findViewById(R.id.edittext121);
		textview602 = findViewById(R.id.textview602);
		textview121 = findViewById(R.id.textview121);
		button1 = findViewById(R.id.button1);
		textview12 = findViewById(R.id.textview12);
		linear127 = findViewById(R.id.linear127);
		linear128 = findViewById(R.id.linear128);
		linear129 = findViewById(R.id.linear129);
		linear155 = findViewById(R.id.linear155);
		edittext13 = findViewById(R.id.edittext13);
		textview405 = findViewById(R.id.textview405);
		edittext12 = findViewById(R.id.edittext12);
		textview4b = findViewById(R.id.textview4b);
		edittext15 = findViewById(R.id.edittext15);
		textview1803 = findViewById(R.id.textview1803);
		textview145 = findViewById(R.id.textview145);
		edittext14 = findViewById(R.id.edittext14);
		textview5h = findViewById(R.id.textview5h);
		edittext129 = findViewById(R.id.edittext129);
		textview129 = findViewById(R.id.textview129);
		textview501s1 = findViewById(R.id.textview501s1);
		edittext16 = findViewById(R.id.edittext16);
		textview355 = findViewById(R.id.textview355);
		textview833 = findViewById(R.id.textview833);
		edittext17 = findViewById(R.id.edittext17);
		textview834 = findViewById(R.id.textview834);
		textview2029 = findViewById(R.id.textview2029);
		edittext56 = findViewById(R.id.edittext56);
		button2 = findViewById(R.id.button2);
		linear388 = findViewById(R.id.linear388);
		textview815 = findViewById(R.id.textview815);
		edittext18 = findViewById(R.id.edittext18);
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
		
		//ScrollChange2
		vscroll1.setOnScrollChangeListener(new ScrollView.OnScrollChangeListener() {
			@Override
			public void onScrollChange(View v, int _scrollX, int _scrollY, int _oldScrollX, int _oldScrollY) {
				
			}
		});
		
		button195.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/TFQGRQNFdv8"));
				startActivity(price);
			}
		});
		
		button196.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://drive.google.com/file/d/1GFCIGyRNJcpwKzGGTTNFIJo-NlSwb56k/view?usp=drive_link"));
				startActivity(price);
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		textview988.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
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
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext12.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext12.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext2.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext12.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext12.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
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
				edittext12.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext12.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
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
				edittext13.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext13.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
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
				edittext13.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext13.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
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
				edittext13.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext13.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
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
				edittext14.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext14.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext8.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext8.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext14.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext14.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
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
				edittext9.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext14.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext14.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
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
				edittext10.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext14.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext14.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
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
				edittext15.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext15.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext121.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext121.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext129.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext129.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
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
				if ((((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || ((edittext11.getText().toString().equals("") || edittext11.getText().toString().equals(".")) || (edittext11.getText().toString().equals("-") || (Double.parseDouble(edittext11.getText().toString()) < 0)))) || (((edittext4.getText().toString().equals("") || edittext4.getText().toString().equals(".")) || (edittext4.getText().toString().equals("-") || (Double.parseDouble(edittext4.getText().toString()) < 0))) || (((edittext7.getText().toString().equals("") || edittext7.getText().toString().equals(".")) || (edittext7.getText().toString().equals("-") || (Double.parseDouble(edittext7.getText().toString()) < 0))) || ((edittext121.getText().toString().equals("") || edittext121.getText().toString().equals(".")) || (edittext121.getText().toString().equals("-") || (Double.parseDouble(edittext121.getText().toString()) < 0)))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) {
						edittext2.setText(String.valueOf(110));
					}
					if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
						edittext3.setText(String.valueOf(0.73d));
					}
					if ((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) {
						edittext5.setText(String.valueOf(21));
					}
					if ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0))) {
						edittext6.setText(String.valueOf(0.11d));
					}
					if ((edittext8.getText().toString().equals("") || edittext8.getText().toString().equals(".")) || (edittext8.getText().toString().equals("-") || (Double.parseDouble(edittext8.getText().toString()) < 0))) {
						edittext8.setText(String.valueOf(400));
					}
					if ((edittext9.getText().toString().equals("") || edittext9.getText().toString().equals(".")) || (edittext9.getText().toString().equals("-") || (Double.parseDouble(edittext9.getText().toString()) < 0))) {
						edittext9.setText(String.valueOf(0.05d));
					}
					if ((edittext10.getText().toString().equals("") || edittext10.getText().toString().equals(".")) || (edittext10.getText().toString().equals("-") || (Double.parseDouble(edittext10.getText().toString()) < 0))) {
						edittext10.setText(String.valueOf(0.11d));
					}
					if (Double.parseDouble(edittext2.getText().toString()) == 0.00d) {
						edittext12.setText(String.valueOf(00.00d));
						edittext12.setTextColor(0xFF000000);
					}
					else {
						edittext12.setText(String.valueOf((Double.parseDouble(edittext1.getText().toString()) / Double.parseDouble(edittext2.getText().toString())) * Double.parseDouble(edittext3.getText().toString())));
						edittext12.setTextColor(0xFF000000);
					}
					if (Double.parseDouble(edittext5.getText().toString()) == 0.00d) {
						edittext13.setText(String.valueOf(00.00d));
						edittext13.setTextColor(0xFF000000);
					}
					else {
						edittext13.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) / Double.parseDouble(edittext5.getText().toString())) * Double.parseDouble(edittext6.getText().toString())));
						edittext13.setTextColor(0xFF000000);
					}
					if (Double.parseDouble(edittext8.getText().toString()) == 0.00d) {
						edittext14.setText(String.valueOf(00.00d));
						edittext14.setTextColor(0xFF000000);
					}
					else {
						edittext14.setText(String.valueOf(((Double.parseDouble(edittext7.getText().toString()) / Double.parseDouble(edittext8.getText().toString())) * Double.parseDouble(edittext9.getText().toString())) + Double.parseDouble(edittext10.getText().toString())));
						edittext14.setTextColor(0xFF000000);
					}
					edittext15.setText(String.valueOf(Double.parseDouble(edittext11.getText().toString())));
					edittext129.setText(String.valueOf(Double.parseDouble(edittext121.getText().toString())));
					edittext16.setText(String.valueOf(((Double.parseDouble(edittext12.getText().toString()) + Double.parseDouble(edittext13.getText().toString())) + Double.parseDouble(edittext14.getText().toString())) * (Double.parseDouble(edittext15.getText().toString()) * Double.parseDouble(edittext129.getText().toString()))));
					edittext15.setTextColor(0xFF000000);
					edittext129.setTextColor(0xFF000000);
					edittext16.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext13.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext13.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
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
				edittext12.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext15.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext15.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext14.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext14.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext129.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext129.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext16.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext16.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				if ((edittext17.getText().toString().equals("") || edittext17.getText().toString().equals(".")) || (edittext17.getText().toString().equals("-") || (Double.parseDouble(edittext17.getText().toString()) < 0))) {
					edittext18.setText(String.valueOf(Double.parseDouble(_charSeq)));
					edittext18.setTextColor(0xFF000000);
				}
				else {
					edittext18.setText(String.valueOf(Double.parseDouble(_charSeq) + ((Double.parseDouble(edittext17.getText().toString()) / Double.parseDouble("100")) * Double.parseDouble(_charSeq))));
					edittext18.setTextColor(0xFF000000);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext17.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext17.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext18.setText(String.valueOf(00.00));
				edittext18.setTextColor(0xFFE91E63);
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
				if ((edittext17.getText().toString().equals("") || edittext17.getText().toString().equals(".")) || (edittext17.getText().toString().equals("-") || (Double.parseDouble(edittext17.getText().toString()) < 0))) {
					edittext17.setText(String.valueOf(19));
				}
				edittext18.setText(String.valueOf(Double.parseDouble(edittext16.getText().toString()) + ((Double.parseDouble(edittext17.getText().toString()) / Double.parseDouble("100")) * Double.parseDouble(edittext16.getText().toString()))));
				edittext18.setTextColor(0xFF000000);
			}
		});
		
		edittext18.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext18.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
				if ((edittext19.getText().toString().equals("") || edittext19.getText().toString().equals(".")) || (edittext19.getText().toString().equals("-") || (Double.parseDouble(edittext19.getText().toString()) < 0))) {
					edittext20.setText(String.valueOf(Double.parseDouble(_charSeq)));
					edittext20.setTextColor(0xFF000000);
				}
				else {
					edittext20.setText(String.valueOf(((1.3d + (Double.parseDouble(edittext19.getText().toString()) / 100)) / 1.3d) * Double.parseDouble(_charSeq)));
					edittext20.setTextColor(0xFF000000);
				}
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
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext19.getText().toString().equals("") || edittext19.getText().toString().equals(".")) || (edittext19.getText().toString().equals("-") || (Double.parseDouble(edittext19.getText().toString()) < 0))) {
					edittext19.setText(String.valueOf(0.4d));
				}
				edittext20.setText(String.valueOf(((1.3d + (Double.parseDouble(edittext19.getText().toString()) / 100)) / 1.3d) * Double.parseDouble(edittext18.getText().toString())));
				edittext20.setTextColor(0xFF000000);
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
	}
	
	private void initializeLogic() {
		/*
الأعلانات
*/
		
		{
		}
		linear152.setVisibility(View.GONE);
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
	
	
	public void _toipcc_dynamic_dewatering_price() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_dewatering_price_linear = (LinearLayout) inflater.inflate(R.layout.toipcc_d_dewatering_price, null, false);
		dynamic_all.addView(dynamic_dewatering_price_linear);
		/*
تعريف الدينامك
*/
		/*
تعريفات الأسماء ال TextView
*/
		final TextView textview2d = dynamic_dewatering_price_linear.findViewById(R.id.textview2d);
		final TextView textview3d = dynamic_dewatering_price_linear.findViewById(R.id.textview3d);
		final TextView textview5d = dynamic_dewatering_price_linear.findViewById(R.id.textview5d);
		final TextView textview6d = dynamic_dewatering_price_linear.findViewById(R.id.textview6d);
		final TextView textview8d = dynamic_dewatering_price_linear.findViewById(R.id.textview8d);
		final TextView textview9d = dynamic_dewatering_price_linear.findViewById(R.id.textview9d);
		final TextView textview10d = dynamic_dewatering_price_linear.findViewById(R.id.textview10d);
		final TextView textview11d = dynamic_dewatering_price_linear.findViewById(R.id.textview11d);
		final TextView textview12d = dynamic_dewatering_price_linear.findViewById(R.id.textview12d);
		final TextView textview17d = dynamic_dewatering_price_linear.findViewById(R.id.textview17d);
		final TextView textview19d = dynamic_dewatering_price_linear.findViewById(R.id.textview19d);
		final TextView textview7d = dynamic_dewatering_price_linear.findViewById(R.id.textview7d);
		final TextView textview101d = dynamic_dewatering_price_linear.findViewById(R.id.textview101d);
		final TextView textview21d = dynamic_dewatering_price_linear.findViewById(R.id.textview21d);
		final TextView textview22d = dynamic_dewatering_price_linear.findViewById(R.id.textview22d);
		/*
تعريفات مربعات الادخال ومربعات النتائج ال EditText
*/
		final TextView edittext94d = dynamic_dewatering_price_linear.findViewById(R.id.edittext94d);
		final EditText edittext1d = dynamic_dewatering_price_linear.findViewById(R.id.edittext1d);
		edittext1d.setSingleLine(true);
		edittext1d.setFocusableInTouchMode(true);
		final EditText edittext2d = dynamic_dewatering_price_linear.findViewById(R.id.edittext2d);
		edittext2d.setSingleLine(true);
		edittext2d.setFocusableInTouchMode(true);
		final EditText edittext3d = dynamic_dewatering_price_linear.findViewById(R.id.edittext3d);
		edittext3d.setSingleLine(true);
		edittext3d.setFocusableInTouchMode(true);
		final EditText edittext4d = dynamic_dewatering_price_linear.findViewById(R.id.edittext4d);
		edittext4d.setSingleLine(true);
		edittext4d.setFocusableInTouchMode(true);
		final EditText edittext5d = dynamic_dewatering_price_linear.findViewById(R.id.edittext5d);
		edittext5d.setSingleLine(true);
		edittext5d.setFocusableInTouchMode(true);
		final EditText edittext6d = dynamic_dewatering_price_linear.findViewById(R.id.edittext6d);
		edittext6d.setSingleLine(true);
		edittext6d.setFocusableInTouchMode(true);
		final EditText edittext7d = dynamic_dewatering_price_linear.findViewById(R.id.edittext7d);
		edittext7d.setSingleLine(true);
		edittext7d.setFocusableInTouchMode(true);
		final EditText edittext8d = dynamic_dewatering_price_linear.findViewById(R.id.edittext8d);
		edittext8d.setSingleLine(true);
		edittext8d.setFocusableInTouchMode(true);
		final EditText edittext9d = dynamic_dewatering_price_linear.findViewById(R.id.edittext9d);
		edittext9d.setSingleLine(true);
		edittext9d.setFocusableInTouchMode(true);
		final EditText edittext10d = dynamic_dewatering_price_linear.findViewById(R.id.edittext10d);
		edittext10d.setSingleLine(true);
		edittext10d.setFocusableInTouchMode(true);
		final EditText edittext11d = dynamic_dewatering_price_linear.findViewById(R.id.edittext11d);
		edittext11d.setSingleLine(true);
		edittext11d.setFocusableInTouchMode(true);
		final EditText edittext12d = dynamic_dewatering_price_linear.findViewById(R.id.edittext12d);
		edittext12d.setSingleLine(true);
		edittext12d.setFocusableInTouchMode(true);
		final EditText edittext13d = dynamic_dewatering_price_linear.findViewById(R.id.edittext13d);
		edittext13d.setSingleLine(true);
		edittext13d.setFocusableInTouchMode(true);
		final EditText edittext14d = dynamic_dewatering_price_linear.findViewById(R.id.edittext14d);
		edittext14d.setSingleLine(true);
		edittext14d.setFocusableInTouchMode(true);
		final EditText edittext15d = dynamic_dewatering_price_linear.findViewById(R.id.edittext15d);
		edittext15d.setSingleLine(true);
		edittext15d.setFocusableInTouchMode(true);
		final EditText edittext16d = dynamic_dewatering_price_linear.findViewById(R.id.edittext16d);
		edittext16d.setSingleLine(true);
		edittext16d.setFocusableInTouchMode(true);
		final EditText edittext17d = dynamic_dewatering_price_linear.findViewById(R.id.edittext17d);
		edittext17d.setSingleLine(true);
		edittext17d.setFocusableInTouchMode(true);
		final EditText edittext18d = dynamic_dewatering_price_linear.findViewById(R.id.edittext18d);
		edittext18d.setSingleLine(true);
		edittext18d.setFocusableInTouchMode(true);
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
		final EditText edittext56d = dynamic_dewatering_price_linear.findViewById(R.id.edittext56d);
		edittext56d.setSingleLine(true);
		edittext56d.setFocusableInTouchMode(true);
		/*
تعريفات الزراير ال botton
*/
		final Button button1d = dynamic_dewatering_price_linear.findViewById(R.id.button1d);
		final Button button2d = dynamic_dewatering_price_linear.findViewById(R.id.button2d);
		final Button button3d = dynamic_dewatering_price_linear.findViewById(R.id.button3d);
		final ImageView close = dynamic_dewatering_price_linear.findViewById(R.id.close);
		/*
تعريفات الجزء الخاص بالتجفيف باليوم
*/
		final HorizontalScrollView hscroll121d = dynamic_dewatering_price_linear.findViewById(R.id.hscroll121d);
		hscroll121d.setVisibility(View.VISIBLE);
		final LinearLayout linear121d = dynamic_dewatering_price_linear.findViewById(R.id.linear121d);
		linear121d.setVisibility(View.VISIBLE);
		final EditText edittext121d = dynamic_dewatering_price_linear.findViewById(R.id.edittext121d);
		edittext121d.setSingleLine(true);
		edittext121d.setFocusableInTouchMode(true);
		final LinearLayout linear129d = dynamic_dewatering_price_linear.findViewById(R.id.linear129d);
		linear129d.setVisibility(View.VISIBLE);
		final EditText edittext129d = dynamic_dewatering_price_linear.findViewById(R.id.edittext129d);
		edittext129d.setSingleLine(true);
		edittext129d.setFocusableInTouchMode(true);
		/*
ترقيم الفتحات
*/
		textview101d.setText("منشأ رقم :");
		textview7d.setText("م");
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
		edittext94d.setText("علاوة باليوم / بئر وتوريد وعمل وتشغيل دائرة تجفيف ( نزح جوفي ) باستخدام الابار العميقه فى وقت واحد لحين الانتهاء من الاعمال والبند يشمل الاتى :- \nجميع الابار المستخدمه لعمق 20 : 22 متر من سطح الارض الطبيعيه تنفذ داخل قيسونات بقطر  16 - 18 بوصه وتتكون من مواسير ساده ومصافى قطر 10 : 12 بوصه ومغطاه بسلك شبك بلاستيك لايسمح بمرور المواد الناعمه وفلتر زلطى متدرج .\nالطلمبات المستخدمه تصرف 100 : 120 م3 /ساعه عند رافع 20 : 35 متر وتعمل بشكل مستمر حتى منسوب المياه الجوفيه.\nخط الطرد من مواسير حديد قطر 12 : 16 بوصه وبطول من 300 متر : 500 متر طولى والى اقرب مصرف من استخدام المحابس اللازمه\nتوفير عدد ( 2 ) مولد ( اساسي واحتياطى ) ولوحات تحكم وتشغيل تشمل جميع المكونات\n \n• من عدد 6 إلي عدد 10 أبار");
		edittext2d.setHint("110");
		edittext3d.setHint("0.73");
		edittext5d.setHint("21");
		edittext6d.setHint("0.11");
		edittext8d.setHint("400");
		edittext9d.setHint("0.05");
		edittext10d.setHint("0.11");
		textview11d.setText("تكلفة الطلمبة الواحدة في اليوم بقائمة الهيئة القومية بدون المصاريف الإدارية والأرباح ( جنيه )");
		textview12d.setText("سعر التجفيف لليوم بدون المصاريف الإدارية والأرباح\n=");
		edittext56d.setText("سعر التجفيف لليوم شامل المصاريف الإدارية والأرباح\n=");
		textview21d.setText("كمية البند أو عدد أيام التشغيل\n ( باليوم )");
		textview22d.setText("يوم");
		textview2d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* ثابت ١\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١١٠ \"");
				return true;
			}
		});
		textview3d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* ثابت ٢\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٧٣ \"");
				return true;
			}
		});
		textview5d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* ثابت ٣\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٢١ \"");
				return true;
			}
		});
		textview6d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* ثابت ٤\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.١١ \"");
				return true;
			}
		});
		textview8d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* ثابت ٥\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٤٠٠ \"");
				return true;
			}
		});
		textview9d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* ثابت ٦\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٠٥ \"");
				return true;
			}
		});
		textview10d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* ثابت ٧\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.١١ \"");
				return true;
			}
		});
		textview17d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة المصاريف الادارية والأرباح\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١٩ % \"");
				return true;
			}
		});
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
		edittext1d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext1dnn = _param1.toString();
								
edittext1d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext12d.setText(String.valueOf(00.00));
				edittext16d.setText(String.valueOf(00.00));
				edittext12d.setTextColor(0xFFE91E63);
				edittext16d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext2d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext2dnn = _param1.toString();
								
edittext2d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext12d.setText(String.valueOf(00.00));
				edittext16d.setText(String.valueOf(00.00));
				edittext12d.setTextColor(0xFFE91E63);
				edittext16d.setTextColor(0xFFE91E63);
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
				edittext12d.setText(String.valueOf(00.00));
				edittext16d.setText(String.valueOf(00.00));
				edittext12d.setTextColor(0xFFE91E63);
				edittext16d.setTextColor(0xFFE91E63);
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
				edittext13d.setText(String.valueOf(00.00));
				edittext16d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
				edittext16d.setTextColor(0xFFE91E63);
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
				edittext13d.setText(String.valueOf(00.00));
				edittext16d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
				edittext16d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext6d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext6dnn = _param1.toString();
								
edittext6d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext13d.setText(String.valueOf(00.00));
				edittext16d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
				edittext16d.setTextColor(0xFFE91E63);
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
				edittext14d.setText(String.valueOf(00.00));
				edittext16d.setText(String.valueOf(00.00));
				edittext14d.setTextColor(0xFFE91E63);
				edittext16d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext8d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext8dnn = _param1.toString();
								
edittext8d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext14d.setText(String.valueOf(00.00));
				edittext16d.setText(String.valueOf(00.00));
				edittext14d.setTextColor(0xFFE91E63);
				edittext16d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext9d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext9dnn = _param1.toString();
								
edittext9d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext14d.setText(String.valueOf(00.00));
				edittext16d.setText(String.valueOf(00.00));
				edittext14d.setTextColor(0xFFE91E63);
				edittext16d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext10d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext10dnn = _param1.toString();
								
edittext10d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext14d.setText(String.valueOf(00.00));
				edittext16d.setText(String.valueOf(00.00));
				edittext14d.setTextColor(0xFFE91E63);
				edittext16d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext11d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext11dnn = _param1.toString();
								
edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext15d.setText(String.valueOf(00.00));
				edittext15d.setTextColor(0xFFE91E63);
				edittext16d.setText(String.valueOf(00.00));
				edittext16d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext121d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext121dnn = _param1.toString();
								
edittext121d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext129d.setText(String.valueOf(00.00));
				edittext129d.setTextColor(0xFFE91E63);
				edittext16d.setText(String.valueOf(00.00));
				edittext16d.setTextColor(0xFFE91E63);
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
				if ((((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))) || ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0)))) || (((edittext4d.getText().toString().equals("") || edittext4d.getText().toString().equals(".")) || (edittext4d.getText().toString().equals("-") || (Double.parseDouble(edittext4d.getText().toString()) < 0))) || (((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))) || ((edittext121d.getText().toString().equals("") || edittext121d.getText().toString().equals(".")) || (edittext121d.getText().toString().equals("-") || (Double.parseDouble(edittext121d.getText().toString()) < 0)))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext2d.getText().toString().equals("") || edittext2d.getText().toString().equals(".")) || (edittext2d.getText().toString().equals("-") || (Double.parseDouble(edittext2d.getText().toString()) < 0))) {
						edittext2d.setText(String.valueOf(110));
					}
					if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
						edittext3d.setText(String.valueOf(0.73d));
					}
					if ((edittext5d.getText().toString().equals("") || edittext5d.getText().toString().equals(".")) || (edittext5d.getText().toString().equals("-") || (Double.parseDouble(edittext5d.getText().toString()) < 0))) {
						edittext5d.setText(String.valueOf(21));
					}
					if ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) {
						edittext6d.setText(String.valueOf(0.11d));
					}
					if ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) {
						edittext8d.setText(String.valueOf(400));
					}
					if ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) {
						edittext9d.setText(String.valueOf(0.05d));
					}
					if ((edittext10d.getText().toString().equals("") || edittext10d.getText().toString().equals(".")) || (edittext10d.getText().toString().equals("-") || (Double.parseDouble(edittext10d.getText().toString()) < 0))) {
						edittext10d.setText(String.valueOf(0.11d));
					}
					if (Double.parseDouble(edittext2d.getText().toString()) == 0.00d) {
						edittext12d.setText(String.valueOf(00.00d));
						edittext12d.setTextColor(0xFF000000);
					}
					else {
						edittext12d.setText(String.valueOf((Double.parseDouble(edittext1d.getText().toString()) / Double.parseDouble(edittext2d.getText().toString())) * Double.parseDouble(edittext3d.getText().toString())));
						edittext12d.setTextColor(0xFF000000);
					}
					if (Double.parseDouble(edittext5d.getText().toString()) == 0.00d) {
						edittext13d.setText(String.valueOf(00.00d));
						edittext13d.setTextColor(0xFF000000);
					}
					else {
						edittext13d.setText(String.valueOf((Double.parseDouble(edittext4d.getText().toString()) / Double.parseDouble(edittext5d.getText().toString())) * Double.parseDouble(edittext6d.getText().toString())));
						edittext13d.setTextColor(0xFF000000);
					}
					if (Double.parseDouble(edittext8d.getText().toString()) == 0.00d) {
						edittext14d.setText(String.valueOf(00.00d));
						edittext14d.setTextColor(0xFF000000);
					}
					else {
						edittext14d.setText(String.valueOf(((Double.parseDouble(edittext7d.getText().toString()) / Double.parseDouble(edittext8d.getText().toString())) * Double.parseDouble(edittext9d.getText().toString())) + Double.parseDouble(edittext10d.getText().toString())));
						edittext14d.setTextColor(0xFF000000);
					}
					edittext15d.setText(String.valueOf(Double.parseDouble(edittext11d.getText().toString())));
					edittext129d.setText(String.valueOf(Double.parseDouble(edittext121d.getText().toString())));
					edittext16d.setText(String.valueOf(((Double.parseDouble(edittext12d.getText().toString()) + Double.parseDouble(edittext13d.getText().toString())) + Double.parseDouble(edittext14d.getText().toString())) * (Double.parseDouble(edittext15d.getText().toString()) * Double.parseDouble(edittext129d.getText().toString()))));
					edittext15d.setTextColor(0xFF000000);
					edittext129d.setTextColor(0xFF000000);
					edittext16d.setTextColor(0xFF000000);
				}
			}
		});
		edittext12d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
		edittext13d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
		edittext14d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
		edittext15d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
		edittext129d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
		edittext16d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				edittext16d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				if ((edittext17d.getText().toString().equals("") || edittext17d.getText().toString().equals(".")) || (edittext17d.getText().toString().equals("-") || (Double.parseDouble(edittext17d.getText().toString()) < 0))) {
					edittext18d.setText(String.valueOf(Double.parseDouble(s.toString())));
					edittext18d.setTextColor(0xFF000000);
				}
				else {
					edittext18d.setText(String.valueOf(Double.parseDouble(s.toString()) + ((Double.parseDouble(edittext17d.getText().toString()) / Double.parseDouble("100")) * Double.parseDouble(s.toString()))));
					edittext18d.setTextColor(0xFF000000);
				}
			} });
		edittext17d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext17dnn = _param1.toString();
								
edittext17d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext18d.setText(String.valueOf(00.00));
				edittext18d.setTextColor(0xFFE91E63);
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
				if ((edittext17d.getText().toString().equals("") || edittext17d.getText().toString().equals(".")) || (edittext17d.getText().toString().equals("-") || (Double.parseDouble(edittext17d.getText().toString()) < 0))) {
					edittext17d.setText(String.valueOf(19));
				}
				edittext18d.setText(String.valueOf(Double.parseDouble(edittext16d.getText().toString()) + ((Double.parseDouble(edittext17d.getText().toString()) / Double.parseDouble("100")) * Double.parseDouble(edittext16d.getText().toString()))));
				edittext18d.setTextColor(0xFF000000);
			}
		});
		edittext18d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				edittext18d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
				if ((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0))) {
					edittext20d.setText(String.valueOf(Double.parseDouble(s.toString())));
					edittext20d.setTextColor(0xFF000000);
				}
				else {
					edittext20d.setText(String.valueOf(((1.3d + (Double.parseDouble(edittext19d.getText().toString()) / 100)) / 1.3d) * Double.parseDouble(s.toString())));
					edittext20d.setTextColor(0xFF000000);
				}
			} });
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
				edittext20d.setText(String.valueOf(((1.3d + (Double.parseDouble(edittext19d.getText().toString()) / 100)) / 1.3d) * Double.parseDouble(edittext18d.getText().toString())));
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
حذف فتحة
*/
		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_dewatering_price_linear);
				/*
إجمالي المكعبات بعد عملية الحذف
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
		WebView webView = new WebView(ToipccDewateringPricesActivity.this);
		webView.loadDataWithBaseURL(null, htmlContent.toString(), "text/html", "UTF-8", null);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageFinished(WebView view, String url) {
				PrintManager printManager = (PrintManager) ToipccDewateringPricesActivity.this.getSystemService(PRINT_SERVICE);
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
				.setMessage("أدخل القيم في الحقول المُدخلة (ذات الخلفية الخضراء) ثم اضغط على زر الحساب للحصول على النتائج.")
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
