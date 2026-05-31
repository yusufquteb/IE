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


public class EipplainconcretefootingsActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private String path = "";
	private double temp1 = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview1;
	private LinearLayout linear176;
	private TextView textview1078;
	private TextView textview468;
	private LinearLayout linear80;
	private TextView textview526;
	private LinearLayout linear121;
	private LinearLayout dynamic_all;
	private LinearLayout add_dynamic_element_lin;
	private TextView textview554;
	private TextView textview578;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private TextView textview555;
	private TextView textview583;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private TextView textview585;
	private TextView textview584;
	private TextView textview808;
	private TextView textview1076;
	private TextView textview7;
	private LinearLayout linear3;
	private LinearLayout linear5;
	private LinearLayout linear74;
	private LinearLayout linear4;
	private TextView textview4;
	private LinearLayout linear6;
	private TextView L1;
	private EditText edittext2;
	private TextView textview5;
	private TextView textview467;
	private EditText edittext1;
	private Button button1;
	private EditText edittext3;
	private TextView textview9;
	private TextView textview8;
	private LinearLayout linear394;
	private TextView textview785;
	private TextView textview790;
	private LinearLayout linear294;
	private LinearLayout linear299;
	private HorizontalScrollView hscroll98;
	private LinearLayout linear119;
	private HorizontalScrollView hscroll22;
	private TextView textview807;
	private TextView textview1081;
	private Button button50;
	private TextView textview80;
	private LinearLayout linear390;
	private TextView textview504;
	private Button button49;
	private LinearLayout linear392;
	private TextView textview18;
	private EditText element_nums;
	private TextView textview17;
	private TextView textview1080;
	private EditText element_num;
	private TextView textview10;
	private LinearLayout linear298;
	private TextView textview791;
	private LinearLayout linear295;
	private TextView textview787;
	private LinearLayout linear297;
	private TextView textview792;
	private EditText edittext6;
	private TextView textview786;
	private EditText edittext5;
	private TextView textview788;
	private EditText edittext4;
	private TextView textview1077;
	private EditText edittext7;
	private TextView textview794;
	private TextView textview795;
	private EditText edittext8;
	private TextView textview6;
	private TextView textview3;
	private TextView textview809;
	private TextView textview810;
	private TextView textview469;
	private HorizontalScrollView hscroll24;
	private LinearLayout linear122;
	private HorizontalScrollView hscroll26;
	private TextView textview493;
	private HorizontalScrollView hscroll28;
	private LinearLayout linear134;
	private LinearLayout linear129;
	private LinearLayout linear388;
	private LinearLayout linear127;
	private HorizontalScrollView hscroll27;
	private TextView textview492;
	private LinearLayout linear300;
	private LinearLayout linear135;
	private HorizontalScrollView hscroll30;
	private TextView textview470;
	private EditText edittext9;
	private TextView textview471;
	private TextView textview112;
	private TextView textview494;
	private EditText edittext10;
	private TextView textview495;
	private TextView textview496;
	private Button button2;
	private TextView textview1073;
	private LinearLayout linear128;
	private TextView textview481;
	private LinearLayout linear130;
	private TextView textview479;
	private EditText edittext12;
	private TextView textview482;
	private EditText edittext11;
	private LinearLayout linear132;
	private TextView textview12;
	private TextView textview488;
	private TextView textview489;
	private EditText edittext13;
	private TextView textview797;
	private TextView textview798;
	private LinearLayout linear136;
	private TextView textview498;
	private LinearLayout linear138;
	private TextView textview497;
	private EditText edittext15;
	private TextView textview499;
	private EditText edittext14;
	private LinearLayout linear139;
	private TextView textview13;
	private TextView textview502;
	private TextView textview503;
	private TextView textview505;
	private LinearLayout linear142;
	private LinearLayout linear137;
	private LinearLayout linear389;
	private LinearLayout linear149;
	private LinearLayout linear143;
	private TextView textview510;
	private LinearLayout linear145;
	private TextView textview509;
	private EditText edittext17;
	private TextView textview511;
	private EditText edittext16;
	private Button button3;
	private TextView textview1074;
	private LinearLayout linear150;
	private TextView textview521;
	private LinearLayout linear152;
	private TextView textview520;
	private EditText edittext19;
	private TextView textview806;
	private TextView textview525;
	private TextView textview19;
	private TextView textview522;
	private EditText edittext18;
	private TextView textview805;
	private TextView textview514;
	private TextView textview16;
	private TextView textview704;
	private Button add_dynamic_element;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.eipplainconcretefootings);
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
		textview1078 = findViewById(R.id.textview1078);
		textview468 = findViewById(R.id.textview468);
		linear80 = findViewById(R.id.linear80);
		textview526 = findViewById(R.id.textview526);
		linear121 = findViewById(R.id.linear121);
		dynamic_all = findViewById(R.id.dynamic_all);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		textview554 = findViewById(R.id.textview554);
		textview578 = findViewById(R.id.textview578);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		textview583 = findViewById(R.id.textview583);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		textview808 = findViewById(R.id.textview808);
		textview1076 = findViewById(R.id.textview1076);
		textview7 = findViewById(R.id.textview7);
		linear3 = findViewById(R.id.linear3);
		linear5 = findViewById(R.id.linear5);
		linear74 = findViewById(R.id.linear74);
		linear4 = findViewById(R.id.linear4);
		textview4 = findViewById(R.id.textview4);
		linear6 = findViewById(R.id.linear6);
		L1 = findViewById(R.id.L1);
		edittext2 = findViewById(R.id.edittext2);
		textview5 = findViewById(R.id.textview5);
		textview467 = findViewById(R.id.textview467);
		edittext1 = findViewById(R.id.edittext1);
		button1 = findViewById(R.id.button1);
		edittext3 = findViewById(R.id.edittext3);
		textview9 = findViewById(R.id.textview9);
		textview8 = findViewById(R.id.textview8);
		linear394 = findViewById(R.id.linear394);
		textview785 = findViewById(R.id.textview785);
		textview790 = findViewById(R.id.textview790);
		linear294 = findViewById(R.id.linear294);
		linear299 = findViewById(R.id.linear299);
		hscroll98 = findViewById(R.id.hscroll98);
		linear119 = findViewById(R.id.linear119);
		hscroll22 = findViewById(R.id.hscroll22);
		textview807 = findViewById(R.id.textview807);
		textview1081 = findViewById(R.id.textview1081);
		button50 = findViewById(R.id.button50);
		textview80 = findViewById(R.id.textview80);
		linear390 = findViewById(R.id.linear390);
		textview504 = findViewById(R.id.textview504);
		button49 = findViewById(R.id.button49);
		linear392 = findViewById(R.id.linear392);
		textview18 = findViewById(R.id.textview18);
		element_nums = findViewById(R.id.element_nums);
		textview17 = findViewById(R.id.textview17);
		textview1080 = findViewById(R.id.textview1080);
		element_num = findViewById(R.id.element_num);
		textview10 = findViewById(R.id.textview10);
		linear298 = findViewById(R.id.linear298);
		textview791 = findViewById(R.id.textview791);
		linear295 = findViewById(R.id.linear295);
		textview787 = findViewById(R.id.textview787);
		linear297 = findViewById(R.id.linear297);
		textview792 = findViewById(R.id.textview792);
		edittext6 = findViewById(R.id.edittext6);
		textview786 = findViewById(R.id.textview786);
		edittext5 = findViewById(R.id.edittext5);
		textview788 = findViewById(R.id.textview788);
		edittext4 = findViewById(R.id.edittext4);
		textview1077 = findViewById(R.id.textview1077);
		edittext7 = findViewById(R.id.edittext7);
		textview794 = findViewById(R.id.textview794);
		textview795 = findViewById(R.id.textview795);
		edittext8 = findViewById(R.id.edittext8);
		textview6 = findViewById(R.id.textview6);
		textview3 = findViewById(R.id.textview3);
		textview809 = findViewById(R.id.textview809);
		textview810 = findViewById(R.id.textview810);
		textview469 = findViewById(R.id.textview469);
		hscroll24 = findViewById(R.id.hscroll24);
		linear122 = findViewById(R.id.linear122);
		hscroll26 = findViewById(R.id.hscroll26);
		textview493 = findViewById(R.id.textview493);
		hscroll28 = findViewById(R.id.hscroll28);
		linear134 = findViewById(R.id.linear134);
		linear129 = findViewById(R.id.linear129);
		linear388 = findViewById(R.id.linear388);
		linear127 = findViewById(R.id.linear127);
		hscroll27 = findViewById(R.id.hscroll27);
		textview492 = findViewById(R.id.textview492);
		linear300 = findViewById(R.id.linear300);
		linear135 = findViewById(R.id.linear135);
		hscroll30 = findViewById(R.id.hscroll30);
		textview470 = findViewById(R.id.textview470);
		edittext9 = findViewById(R.id.edittext9);
		textview471 = findViewById(R.id.textview471);
		textview112 = findViewById(R.id.textview112);
		textview494 = findViewById(R.id.textview494);
		edittext10 = findViewById(R.id.edittext10);
		textview495 = findViewById(R.id.textview495);
		textview496 = findViewById(R.id.textview496);
		button2 = findViewById(R.id.button2);
		textview1073 = findViewById(R.id.textview1073);
		linear128 = findViewById(R.id.linear128);
		textview481 = findViewById(R.id.textview481);
		linear130 = findViewById(R.id.linear130);
		textview479 = findViewById(R.id.textview479);
		edittext12 = findViewById(R.id.edittext12);
		textview482 = findViewById(R.id.textview482);
		edittext11 = findViewById(R.id.edittext11);
		linear132 = findViewById(R.id.linear132);
		textview12 = findViewById(R.id.textview12);
		textview488 = findViewById(R.id.textview488);
		textview489 = findViewById(R.id.textview489);
		edittext13 = findViewById(R.id.edittext13);
		textview797 = findViewById(R.id.textview797);
		textview798 = findViewById(R.id.textview798);
		linear136 = findViewById(R.id.linear136);
		textview498 = findViewById(R.id.textview498);
		linear138 = findViewById(R.id.linear138);
		textview497 = findViewById(R.id.textview497);
		edittext15 = findViewById(R.id.edittext15);
		textview499 = findViewById(R.id.textview499);
		edittext14 = findViewById(R.id.edittext14);
		linear139 = findViewById(R.id.linear139);
		textview13 = findViewById(R.id.textview13);
		textview502 = findViewById(R.id.textview502);
		textview503 = findViewById(R.id.textview503);
		textview505 = findViewById(R.id.textview505);
		linear142 = findViewById(R.id.linear142);
		linear137 = findViewById(R.id.linear137);
		linear389 = findViewById(R.id.linear389);
		linear149 = findViewById(R.id.linear149);
		linear143 = findViewById(R.id.linear143);
		textview510 = findViewById(R.id.textview510);
		linear145 = findViewById(R.id.linear145);
		textview509 = findViewById(R.id.textview509);
		edittext17 = findViewById(R.id.edittext17);
		textview511 = findViewById(R.id.textview511);
		edittext16 = findViewById(R.id.edittext16);
		button3 = findViewById(R.id.button3);
		textview1074 = findViewById(R.id.textview1074);
		linear150 = findViewById(R.id.linear150);
		textview521 = findViewById(R.id.textview521);
		linear152 = findViewById(R.id.linear152);
		textview520 = findViewById(R.id.textview520);
		edittext19 = findViewById(R.id.edittext19);
		textview806 = findViewById(R.id.textview806);
		textview525 = findViewById(R.id.textview525);
		textview19 = findViewById(R.id.textview19);
		textview522 = findViewById(R.id.textview522);
		edittext18 = findViewById(R.id.edittext18);
		textview805 = findViewById(R.id.textview805);
		textview514 = findViewById(R.id.textview514);
		textview16 = findViewById(R.id.textview16);
		textview704 = findViewById(R.id.textview704);
		add_dynamic_element = findViewById(R.id.add_dynamic_element);
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext2.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext3.setText(String.valueOf(00.00));
				edittext3.setTextColor(0xFFE91E63);
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
				edittext3.setText(String.valueOf(00.00));
				edittext3.setTextColor(0xFFE91E63);
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
				if (edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					edittext3.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) + Double.parseDouble(edittext2.getText().toString())));
					edittext3.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext11.setText(String.valueOf(00.00));
				edittext12.setText(String.valueOf(00.00));
				edittext14.setText(String.valueOf(00.00));
				edittext15.setText(String.valueOf(00.00));
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setTextColor(0xFFE91E63);
				edittext14.setTextColor(0xFFE91E63);
				edittext15.setTextColor(0xFFE91E63);
				textview12.setText("..............................");
				textview12.setTextColor(0xFF000000);
				textview13.setText("..............................");
				textview13.setTextColor(0xFF000000);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button50.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear390.setVisibility(View.VISIBLE);
				edittext9.setText("");
				edittext10.setText("");
				edittext11.setTextColor(0xFF000000);
				edittext12.setTextColor(0xFF000000);
				edittext13.setTextColor(0xFF000000);
				edittext14.setTextColor(0xFF000000);
				edittext15.setTextColor(0xFF000000);
			}
		});
		
		button49.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear392.setVisibility(View.VISIBLE);
				edittext16.setText("");
				edittext17.setText("");
				edittext18.setTextColor(0xFF000000);
				edittext19.setTextColor(0xFF000000);
			}
		});
		
		element_num.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				element_num.addTextChangedListener(new TextWatcher() { 	
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
							
							
						if (s.toString().equals("") || s.toString().equals("-")) {
							element_nums.setText("0");
						}
						else {
							element_nums.setText(s.toString());
						}
					} });
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
				edittext13.setTextColor(0xFFE91E63);
				edittext15.setText(String.valueOf(00.00));
				edittext15.setTextColor(0xFFE91E63);
				textview13.setText("..............................");
				textview13.setTextColor(0xFF000000);
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
				edittext19.setText(String.valueOf(00.00));
				edittext19.setTextColor(0xFFE91E63);
				textview19.setText("...................");
				textview19.setTextColor(0xFF000000);
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
				edittext18.setText(String.valueOf(00.00));
				edittext18.setTextColor(0xFFE91E63);
				textview16.setText("...................");
				textview16.setTextColor(0xFF000000);
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
		
		edittext8.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext8.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext12.setText(String.valueOf(00.00));
				edittext12.setTextColor(0xFFE91E63);
				textview12.setText("..............................");
				textview12.setTextColor(0xFF000000);
				edittext13.setText(String.valueOf(00.00));
				edittext13.setTextColor(0xFFE91E63);
				edittext15.setText(String.valueOf(00.00));
				edittext15.setTextColor(0xFFE91E63);
				textview13.setText("..............................");
				textview13.setTextColor(0xFF000000);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		//ScrollChange
		hscroll27.setOnScrollChangeListener(new ScrollView.OnScrollChangeListener() {
			@Override
			public void onScrollChange(View v, int _scrollX, int _scrollY, int _oldScrollX, int _oldScrollY) {
				
			}
		});
		
		edittext9.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext9.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext11.setText(String.valueOf(00.00));
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setText(String.valueOf(00.00));
				edittext12.setTextColor(0xFFE91E63);
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
		
		edittext10.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext10.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext14.setText(String.valueOf(00.00));
				edittext14.setTextColor(0xFFE91E63);
				edittext15.setText(String.valueOf(00.00));
				edittext15.setTextColor(0xFFE91E63);
				textview13.setText("..............................");
				textview13.setTextColor(0xFF000000);
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
				if (((((edittext8.getText().toString().equals("") || edittext8.getText().toString().equals(".")) || (edittext8.getText().toString().equals("-") || (Double.parseDouble(edittext8.getText().toString()) < 0))) || ((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0)))) || (((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || ((edittext9.getText().toString().equals("") || edittext9.getText().toString().equals(".")) || (edittext9.getText().toString().equals("-") || (Double.parseDouble(edittext9.getText().toString()) < 0))))) || (((edittext10.getText().toString().equals("") || edittext10.getText().toString().equals(".")) || (edittext10.getText().toString().equals("-") || (Double.parseDouble(edittext10.getText().toString()) < 0))) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					edittext11.setText(String.valueOf(Double.parseDouble(edittext3.getText().toString()) - Double.parseDouble(edittext9.getText().toString())));
					edittext12.setText(String.valueOf(Double.parseDouble(edittext11.getText().toString()) - Double.parseDouble(edittext8.getText().toString())));
					if ((Double.parseDouble(edittext11.getText().toString()) - Double.parseDouble(edittext8.getText().toString())) < 0) {
						if ((Double.parseDouble(edittext11.getText().toString()) - Double.parseDouble(edittext8.getText().toString())) > -0.03d) {
							textview12.setText("منسوب النقطة أوطى من المنسوب التصميمي بفارق أقل من ٣ سم\nويتم تعويض الفرق \" بالقيمة الموجودة بخانة الفرق \" بالخرسانة العادية\nأي سيزيد سمك القاعدة العادية بمقدار الفرق");
							textview12.setTextColor(0xFF4CAF50);
						}
						else {
							textview12.setText("النقطة تحتاج لزيادة الأحلال\nمنسوب النقطة أوطى من المنسوب التصميمي\nويتم زيادة طبقة الأحلال بالقيمة الموجودة بالفرق وأعادة تشغيل طبقة الأحلال");
							textview12.setTextColor(0xFF4CAF50);
						}
					}
					else {
						if ((Double.parseDouble(edittext11.getText().toString()) - Double.parseDouble(edittext8.getText().toString())) > 0) {
							if ((Double.parseDouble(edittext11.getText().toString()) - Double.parseDouble(edittext8.getText().toString())) < 0.02d) {
								textview12.setText("منسوب النقطة أعلي من المنسوب التصميمي بفارق أقل من ٢ سم\nوعليه يتم ضبط المنسوب بإزالة سريعة بمقدار الفرق قبل الصب دون الحاجة لاعادة تشغيل الطبقة");
								textview12.setTextColor(0xFFE91E63);
							}
							else {
								textview12.setText("النقطة تحتاج لتعديل منسوب الأحلال بازالة جزء من الطبقة بالأرتفاع الموضح بالفرق وأعادة تشغيل الطبقة\nمنسوب النقطة أعلي من المنسوب التصميمي");
								textview12.setTextColor(0xFFE91E63);
							}
						}
						else {
							textview12.setText("النقطة لا تحتاج لازالة جزء من طبقة الأحلال أو تعويض باضافة جزء لطبقة الأحلال\nمنسوب النقطة مساوى للمنسوب التصميمي");
							textview12.setTextColor(0xFF3F51B5);
						}
					}
					edittext13.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString()) + Double.parseDouble(edittext6.getText().toString())));
					edittext14.setText(String.valueOf(Double.parseDouble(edittext3.getText().toString()) - Double.parseDouble(edittext10.getText().toString())));
					edittext15.setText(String.valueOf(Double.parseDouble(edittext14.getText().toString()) - Double.parseDouble(edittext13.getText().toString())));
					if ((Double.parseDouble(edittext14.getText().toString()) - Double.parseDouble(edittext13.getText().toString())) < 0) {
						textview13.setText("المنسوب علي الطبيعة أوطى أو أقل من المنسوب التصميمي\nويتم زيادة لوح خشب بالنجارة ويتم عمل شيرب داخل النجارة علي اللوح الأضافي بالقيمة الموجودة بالفرق وذلك للوصول للمنسوب التصميمي والصب حتي منسوب الشيرب\nوهذا الأجراء في حالة عدم وجود مشكلة بمنسوب الأحلال أسفل القاعدة\nولكن في حالة وجود مشكلة بالأحلال أسفل نجارة القاعدة فيتم حل المشكلة بطبقة الأحلال");
						textview13.setTextColor(0xFF4CAF50);
					}
					else {
						if ((Double.parseDouble(edittext14.getText().toString()) - Double.parseDouble(edittext13.getText().toString())) > 0) {
							textview13.setText("المنسوب علي الطبيعة أعلي أو أكبر من المنسوب التصميمي\nيتم عمل شيرب داخل النجارة علي اللوح الأخير بالقيمة الموجودة بالفرق وذلك للوصول للمنسوب التصميمي والصب حتي منسوب الشيرب\nوهذا الأجراء في حالة عدم وجود مشكلة بمنسوب الأحلال أسفل القاعدة\nولكن في حالة وجود مشكلة بالأحلال أسفل نجارة القاعدة فيتم حل المشكلة بطبقة الأحلال");
							textview13.setTextColor(0xFFE91E63);
						}
						else {
							textview13.setText("منسوب أعلى نجارة القاعدة مساوى للمنسوب التصميمي");
							textview13.setTextColor(0xFF3F51B5);
						}
					}
					edittext11.setTextColor(0xFF000000);
					edittext12.setTextColor(0xFF000000);
					edittext13.setTextColor(0xFF000000);
					edittext14.setTextColor(0xFF000000);
					edittext15.setTextColor(0xFF000000);
				}
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
		
		edittext11.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext11.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		edittext13.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext13.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext15.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext14.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext17.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext19.setText(String.valueOf(00.00));
				textview19.setText("...................");
				textview19.setTextColor(0xFF000000);
				edittext19.setTextColor(0xFFE91E63);
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
				edittext16.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext18.setText(String.valueOf(00.00));
				textview16.setText("...................");
				textview16.setTextColor(0xFF000000);
				edittext18.setTextColor(0xFFE91E63);
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
				if ((((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) || ((edittext4.getText().toString().equals("") || edittext4.getText().toString().equals(".")) || (edittext4.getText().toString().equals("-") || (Double.parseDouble(edittext4.getText().toString()) < 0)))) || (((edittext17.getText().toString().equals("") || edittext17.getText().toString().equals(".")) || (edittext17.getText().toString().equals("-") || (Double.parseDouble(edittext17.getText().toString()) < 0))) || ((edittext16.getText().toString().equals("") || edittext16.getText().toString().equals(".")) || (edittext16.getText().toString().equals("-") || (Double.parseDouble(edittext16.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext7.getText().toString().equals("") || (edittext7.getText().toString().equals("-") || edittext7.getText().toString().equals("."))) || ((Double.parseDouble(edittext7.getText().toString()) > 5) || (Double.parseDouble(edittext7.getText().toString()) < 1.50d))) {
						edittext7.setText(String.valueOf(2.50d));
					}
					edittext18.setText(String.valueOf(Double.parseDouble(edittext16.getText().toString()) - Double.parseDouble(edittext4.getText().toString())));
					edittext19.setText(String.valueOf(Double.parseDouble(edittext17.getText().toString()) - Double.parseDouble(edittext5.getText().toString())));
					if ((Double.parseDouble(edittext16.getText().toString()) - Double.parseDouble(edittext4.getText().toString())) < 0) {
						textview16.setText("يتم توسيع\nالنجارة بمقدار\nالفارق");
						textview16.setTextColor(0xFF4CAF50);
					}
					else {
						if ((Double.parseDouble(edittext16.getText().toString()) - Double.parseDouble(edittext4.getText().toString())) > 0) {
							textview16.setText("يتم تضيق\nالنجارة بمقدار\nالفارق");
							textview16.setTextColor(0xFFE91E63);
						}
						else {
							textview16.setText("طول النجارة\nمضبوط");
							textview16.setTextColor(0xFF3F51B5);
						}
					}
					if ((Double.parseDouble(edittext17.getText().toString()) - Double.parseDouble(edittext5.getText().toString())) < 0) {
						textview19.setText("يتم توسيع\nالنجارة بمقدار\nالفارق");
						textview19.setTextColor(0xFF4CAF50);
					}
					else {
						if ((Double.parseDouble(edittext17.getText().toString()) - Double.parseDouble(edittext5.getText().toString())) > 0) {
							textview19.setText("يتم تضيق\nالنجارة بمقدار\nالفارق");
							textview19.setTextColor(0xFFE91E63);
						}
						else {
							textview19.setText("طول النجارة\nمضبوط");
							textview19.setTextColor(0xFF3F51B5);
						}
					}
					edittext18.setTextColor(0xFF000000);
					edittext19.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext19.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext19.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext18.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext18.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
					_eip_d_plainconcrete();
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
		linear390.setVisibility(View.GONE);
		linear392.setVisibility(View.GONE);
		/*
شكل الزراير
*/
		_CardStyle(textview808, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button50, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button49, 25, 25, "#FF4DD0E1", false);
		_CardStyle(add_dynamic_element, 25, 25, "#FF4DD0E1", false);
		/*
الدينامك
*/
		dynamic_all.setVisibility(View.GONE);
		/*
ثالثآ شكل ال Linears
*/
		_round(linear80, "#FFE0F2F1", "#FF000000", 50);
		_round(linear4, "#FFF3E5F5", "#FF000000", 0);
		_round(linear6, "#FFF3E5F5", "#FF000000", 0);
		_round(linear74, "#FFF3E5F5", "#FF000000", 0);
		_round(linear121, "#FFE0F2F1", "#FF000000", 50);
		_round(linear295, "#FFF3E5F5", "#FF000000", 0);
		_round(linear297, "#FFF3E5F5", "#FF000000", 0);
		_round(linear298, "#FFF3E5F5", "#FF000000", 0);
		_round(linear299, "#FFF3E5F5", "#FF000000", 0);
		_round(linear119, "#FFF3E5F5", "#FF000000", 0);
		_round(linear122, "#FFF3E5F5", "#FF000000", 0);
		_round(linear134, "#FFF3E5F5", "#FF000000", 0);
		_round(linear130, "#FFF3E5F5", "#FF000000", 0);
		_round(linear128, "#FFF3E5F5", "#FF000000", 0);
		_round(linear132, "#FFF3E5F5", "#FF000000", 0);
		_round(linear300, "#FFF3E5F5", "#FF000000", 0);
		_round(linear138, "#FFF3E5F5", "#FF000000", 0);
		_round(linear136, "#FFF3E5F5", "#FF000000", 0);
		_round(linear139, "#FFF3E5F5", "#FF000000", 0);
		_round(linear145, "#FFF3E5F5", "#FF000000", 0);
		_round(linear143, "#FFF3E5F5", "#FF000000", 0);
		_round(linear152, "#FFF3E5F5", "#FF000000", 0);
		_round(linear150, "#FFF3E5F5", "#FF000000", 0);
		
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
	
	
	public void _eip_d_plainconcrete() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout ll_mainDynamic = (LinearLayout) inflater.inflate(R.layout.eip_d_plainconcrete, null, false);
		dynamic_all.addView(ll_mainDynamic);
		/*
أولآ ترقيم القواعد
*/
		final TextView dynamic_element_type = ll_mainDynamic.findViewById(R.id.dynamic_element_type);
		final TextView dynamic_element_symble = ll_mainDynamic.findViewById(R.id.dynamic_element_symble);
		final EditText dynamic_element_serial_number = ll_mainDynamic.findViewById(R.id.dynamic_element_serial_number);
		dynamic_element_serial_number.setSingleLine(true);
		dynamic_element_serial_number.setFocusableInTouchMode(true);
		final EditText dynamic_element_serial_numbers = ll_mainDynamic.findViewById(R.id.dynamic_element_serial_numbers);
		dynamic_element_serial_numbers.setSingleLine(true);
		dynamic_element_serial_numbers.setFocusableInTouchMode(true);
		/*
ثانيآ شكل وتعريف وأوامر ال linears الدينامك
*/
		final ScrollView dynamic_out_vscrolllinear1 = ll_mainDynamic.findViewById(R.id.dynamic_out_vscrolllinear1);
		final LinearLayout dynamic_out_linear2 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear2);
		final LinearLayout dynamic_out_linear4 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear4);
		final LinearLayout dynamic_out_linear5 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear5);
		final LinearLayout dynamic_out_linear6 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear6);
		final LinearLayout dynamic_out_linear7 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear7);
		final LinearLayout dynamic_out_linear8 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear8);
		final LinearLayout dynamic_out_linear9 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear9);
		final LinearLayout dynamic_out_linear10 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear10);
		final LinearLayout dynamic_out_linear11 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear11);
		final LinearLayout dynamic_out_linear13 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear13);
		final LinearLayout dynamic_out_linear14 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear14);
		final LinearLayout dynamic_out_linear15 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear15);
		final LinearLayout dynamic_out_linear16 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear16);
		final LinearLayout dynamic_out_linear18 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear18);
		final LinearLayout dynamic_out_linear19 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear19);
		final LinearLayout dynamic_out_linear20 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear20);
		final LinearLayout dynamic_out_linear21 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear21);
		final LinearLayout dynamic_out_linear23 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear23);
		final LinearLayout dynamic_out_linear24 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear24);
		final LinearLayout dynamic_out_linear26 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear26);
		final LinearLayout dynamic_out_linear27 = ll_mainDynamic.findViewById(R.id.dynamic_out_linear27);
		/*
ثالثآ التعليقات والتعريفات
*/
		/*
التعليقات والتعريفات للمدخلات والابعاد
*/
		final TextView dynamic_design_length_of_element_name = ll_mainDynamic.findViewById(R.id.dynamic_design_length_of_element_name);
		final TextView dynamic_design_width_of_element_name = ll_mainDynamic.findViewById(R.id.dynamic_design_width_of_element_name);
		final TextView dynamic_design_height_of_element_name = ll_mainDynamic.findViewById(R.id.dynamic_design_height_of_element_name);
		final TextView dynamic_thickness_of_wood_name = ll_mainDynamic.findViewById(R.id.dynamic_thickness_of_wood_name);
		final TextView dynamic_level_of_replacement_name = ll_mainDynamic.findViewById(R.id.dynamic_level_of_replacement_name);
		/*
التعليقات والتعريفات للاستلام المساحي
*/
		final TextView dynamic_replacement_point_reading_name = ll_mainDynamic.findViewById(R.id.dynamic_replacement_point_reading_name);
		final TextView dynamic_formwork_point_reading_name = ll_mainDynamic.findViewById(R.id.dynamic_formwork_point_reading_name);
		/*
التعليقات والتعريفات للاستلام المساحي للاحلال
*/
		final TextView dynamic_replacement_point_level_name = ll_mainDynamic.findViewById(R.id.dynamic_replacement_point_level_name);
		final TextView dynamic_replacement_levels_difference_name = ll_mainDynamic.findViewById(R.id.dynamic_replacement_levels_difference_name);
		final TextView dynamic_required_action_for_replacement = ll_mainDynamic.findViewById(R.id.dynamic_required_action_for_replacement);
		/*
التعليقات والتعريفات للاستلام المساحي لنجارة القاعدة العادية
*/
		final TextView dynamic_design_formwork_level_name = ll_mainDynamic.findViewById(R.id.dynamic_design_formwork_level_name);
		final TextView dynamic_actual_formwork_level_name = ll_mainDynamic.findViewById(R.id.dynamic_actual_formwork_level_name);
		final TextView dynamic_formwork_levels_difference_name = ll_mainDynamic.findViewById(R.id.dynamic_formwork_levels_difference_name);
		final TextView dynamic_required_action_for_formwork = ll_mainDynamic.findViewById(R.id.dynamic_required_action_for_formwork);
		/*
التعليقات والتعريفات للاستلام أبعاد النجارة للقاعدة العادية
*/
		/*
التعليقات والتعريفات للاستلام أبعاد النجارة للقاعدة العادية ( مدخلات )
*/
		final TextView dynamic_actual_length_of_element_name = ll_mainDynamic.findViewById(R.id.dynamic_actual_length_of_element_name);
		final TextView dynamic_actual_width_of_element_name = ll_mainDynamic.findViewById(R.id.dynamic_actual_width_of_element_name);
		/*
التعليقات والتعريفات للاستلام أبعاد النجارة للقاعدة العادية ( نتائج )
*/
		final TextView dynamic_length_difference_for_element_name = ll_mainDynamic.findViewById(R.id.dynamic_length_difference_for_element_name);
		final TextView dynamic_length_action_for_element = ll_mainDynamic.findViewById(R.id.dynamic_length_action_for_element);
		final TextView dynamic_width_difference_for_element_name = ll_mainDynamic.findViewById(R.id.dynamic_width_difference_for_element_name);
		final TextView dynamic_width_action_for_element = ll_mainDynamic.findViewById(R.id.dynamic_width_action_for_element);
		/*
رابعآ : تعريف الدينامك زراير
*/
		final Button dynamic_check_for_survaying = ll_mainDynamic.findViewById(R.id.dynamic_check_for_survaying);
		final Button dynamic_check_for_dimenions = ll_mainDynamic.findViewById(R.id.dynamic_check_for_dimenions);
		final Button dynamic_survaying_calculation_for_element = ll_mainDynamic.findViewById(R.id.dynamic_survaying_calculation_for_element);
		final Button dynamic_dimenions_calculation_for_element = ll_mainDynamic.findViewById(R.id.dynamic_dimenions_calculation_for_element);
		final Button dynamic_element_remove = ll_mainDynamic.findViewById(R.id.dynamic_element_remove);
		/*
خامسآ مربعات الادخال والنتائج
*/
		/*
التعريف الدينامك لمربعات الادخال والنتائج
*/
		final EditText dynamic_design_length_of_element = ll_mainDynamic.findViewById(R.id.dynamic_design_length_of_element);
		dynamic_design_length_of_element.setSingleLine(true);
		dynamic_design_length_of_element.setFocusableInTouchMode(true);
		final EditText dynamic_design_width_of_element = ll_mainDynamic.findViewById(R.id.dynamic_design_width_of_element);
		dynamic_design_width_of_element.setSingleLine(true);
		dynamic_design_width_of_element.setFocusableInTouchMode(true);
		final EditText dynamic_design_height_of_element = ll_mainDynamic.findViewById(R.id.dynamic_design_height_of_element);
		dynamic_design_height_of_element.setSingleLine(true);
		dynamic_design_height_of_element.setFocusableInTouchMode(true);
		final EditText dynamic_thickness_of_wood = ll_mainDynamic.findViewById(R.id.dynamic_thickness_of_wood);
		dynamic_thickness_of_wood.setSingleLine(true);
		dynamic_thickness_of_wood.setFocusableInTouchMode(true);
		final EditText dynamic_level_of_replacement = ll_mainDynamic.findViewById(R.id.dynamic_level_of_replacement);
		dynamic_level_of_replacement.setSingleLine(true);
		dynamic_level_of_replacement.setFocusableInTouchMode(true);
		final EditText dynamic_replacement_point_reading = ll_mainDynamic.findViewById(R.id.dynamic_replacement_point_reading);
		dynamic_replacement_point_reading.setSingleLine(true);
		dynamic_replacement_point_reading.setFocusableInTouchMode(true);
		final EditText dynamic_formwork_point_reading = ll_mainDynamic.findViewById(R.id.dynamic_formwork_point_reading);
		dynamic_formwork_point_reading.setSingleLine(true);
		dynamic_formwork_point_reading.setFocusableInTouchMode(true);
		final EditText dynamic_replacement_point_level = ll_mainDynamic.findViewById(R.id.dynamic_replacement_point_level);
		dynamic_replacement_point_level.setSingleLine(true);
		dynamic_replacement_point_level.setFocusableInTouchMode(true);
		final EditText dynamic_replacement_levels_difference = ll_mainDynamic.findViewById(R.id.dynamic_replacement_levels_difference);
		dynamic_replacement_levels_difference.setSingleLine(true);
		dynamic_replacement_levels_difference.setFocusableInTouchMode(true);
		final EditText dynamic_design_formwork_level = ll_mainDynamic.findViewById(R.id.dynamic_design_formwork_level);
		dynamic_design_formwork_level.setSingleLine(true);
		dynamic_design_formwork_level.setFocusableInTouchMode(true);
		final EditText dynamic_actual_formwork_level = ll_mainDynamic.findViewById(R.id.dynamic_actual_formwork_level);
		dynamic_actual_formwork_level.setSingleLine(true);
		dynamic_actual_formwork_level.setFocusableInTouchMode(true);
		final EditText dynamic_formwork_levels_difference = ll_mainDynamic.findViewById(R.id.dynamic_formwork_levels_difference);
		dynamic_formwork_levels_difference.setSingleLine(true);
		dynamic_formwork_levels_difference.setFocusableInTouchMode(true);
		final EditText dynamic_actual_length_of_element = ll_mainDynamic.findViewById(R.id.dynamic_actual_length_of_element);
		dynamic_actual_length_of_element.setSingleLine(true);
		dynamic_actual_length_of_element.setFocusableInTouchMode(true);
		final EditText dynamic_actual_width_of_element = ll_mainDynamic.findViewById(R.id.dynamic_actual_width_of_element);
		dynamic_actual_width_of_element.setSingleLine(true);
		dynamic_actual_width_of_element.setFocusableInTouchMode(true);
		final EditText dynamic_length_difference_for_element = ll_mainDynamic.findViewById(R.id.dynamic_length_difference_for_element);
		dynamic_length_difference_for_element.setSingleLine(true);
		dynamic_length_difference_for_element.setFocusableInTouchMode(true);
		final EditText dynamic_width_difference_for_element = ll_mainDynamic.findViewById(R.id.dynamic_width_difference_for_element);
		dynamic_width_difference_for_element.setSingleLine(true);
		dynamic_width_difference_for_element.setFocusableInTouchMode(true);
		/*
أولآ ترقيم القواعد
*/
		dynamic_element_type.setText("قاعدة رقم :");
		dynamic_element_symble.setText("نموذج قاعدة ق");
		dynamic_element_serial_number.setText(String.valueOf((long)(1 + dynamic_all.getChildCount())));
		dynamic_element_serial_numbers.setText(String.valueOf((long)(1 + dynamic_all.getChildCount())));
		dynamic_element_serial_number.addTextChangedListener(new TextWatcher() { 	
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
					
					
				if (s.toString().equals("-") || s.toString().equals("")) {
					dynamic_element_serial_numbers.setText("");
				}
				else {
					dynamic_element_serial_numbers.setText(String.valueOf((long)(Double.parseDouble(s.toString()))));
				}
			} });
		/*
ثانيآ شكل وتعريف وأوامر ال linears الدينامك
*/
		dynamic_out_linear9.setVisibility(View.GONE);
		dynamic_out_linear21.setVisibility(View.GONE);
		_round(dynamic_out_vscrolllinear1, "#FFE0F2F1", "#FF000000", 50);
		_round(dynamic_out_linear4, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear5, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear6, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear7, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear8, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear10, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear11, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear13, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear14, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear15, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear16, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear18, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear19, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear20, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear23, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear24, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear26, "#FFF3E5F5", "#FF000000", 0);
		_round(dynamic_out_linear27, "#FFF3E5F5", "#FF000000", 0);
		/*
ثالثآ التعليقات والتعريفات
*/
		/*
التعليقات والتعريفات للمدخلات والابعاد
*/
		dynamic_design_length_of_element_name.setText("طول\nالقاعدة ( م )");
		dynamic_design_width_of_element_name.setText("عرض\nالقاعدة ( م )");
		dynamic_design_height_of_element_name.setText("ارتفاع\nالقاعدة ( م )");
		dynamic_thickness_of_wood_name.setText("* سمك الخشب المستخدم في نجارة\nالقواعد العادية ( سم )");
		dynamic_thickness_of_wood_name.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "سمك الخشب المستخدم في نجارة\nالقواعد العادية ( سم )\nمدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بإفتراضه بقيمة = ٢.٥ سم");
				return true;
			}
		});
		dynamic_level_of_replacement_name.setText("* منسوب سطح الأحلال التصميمي\n\" منسوب التأسيس \"");
		dynamic_level_of_replacement_name.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "منسوب سطح الأحلال التصميمي\n\" منسوب التأسيس \"\n\" طبقآ للقطاعات بالوحات التصميمية\nوتقرير الجسات \"");
				return true;
			}
		});
		/*
التعليقات والتعريفات للاستلام المساحي
*/
		dynamic_replacement_point_reading_name.setText("القراءة لنقطة الرفع المساحي لسطح\nطبقة الأحلال \" قراءة ميزان القامة\nلمنسوب التأسيس علي الطبيعة \" ( م )");
		dynamic_formwork_point_reading_name.setText("القراءة لنقطة الرفع المساحي أعلي\nسطح النجارة \" منسوب أعلى\nالقاعدة العادية المنفذ علي الطبيعة \" ( م )");
		/*
التعليقات والتعريفات للاستلام المساحي للاحلال
*/
		dynamic_replacement_point_level_name.setText("\n\n\nمنسوب النقطة\nالمرفوعة لطبقة\nالأحلال\n\n\n");
		dynamic_replacement_levels_difference_name.setText("الفرق ف المنسوب\n( م )\n( \" منسوب النقطة\nالمرفوعة لطبقة\nالأحلال\"\n-\n\"منسوب سطح\nطبقة الأحلال\nالتصميمي\" )");
		/*
التعليقات والتعريفات للاستلام المساحي لنجارة القاعدة العادية
*/
		dynamic_design_formwork_level_name.setText("المنسوب التصميمي أعلي سطح النجارة\n\" منسوب أعلى القاعدة العادية \"");
		dynamic_actual_formwork_level_name.setText("\n\nمنسوب نقطة\nالرفع المساحي أعلي\nسطح النجارة\n\" منسوب أعلى\nالقاعدة العادية \"\n\n");
		dynamic_formwork_levels_difference_name.setText("الفرق ف المنسوب\n( م )\n( \" منسوب النقطة\nالمرفوعة لنجارة\nالقاعدة \"\n-\n\"منسوب سطح\nالقاعدة التصميمي\" )");
		/*
التعليقات والتعريفات للاستلام أبعاد النجارة للقاعدة العادية
*/
		/*
التعليقات والتعريفات للاستلام أبعاد النجارة للقاعدة العادية ( مدخلات )
*/
		dynamic_actual_length_of_element_name.setText("طول القاعدة\nعلي الطبيعة ( م )\n\" من داخل النجارة \"");
		dynamic_actual_width_of_element_name.setText("عرض القاعدة\nعلي الطبيعة ( م )\n\" من داخل النجارة \"");
		/*
التعليقات والتعريفات للاستلام أبعاد النجارة للقاعدة العادية ( نتائج )
*/
		dynamic_length_difference_for_element_name.setText("الفرق ف الطول\n( م )\n( \" طول القاعدة\n    علي الطبيعة \"\n-\n\" طول القاعدة\n    التصميمي \" )");
		dynamic_width_difference_for_element_name.setText("الفرق ف العرض\n( م )\n( \" عرض القاعدة\n    علي الطبيعة \"\n-\n\" عرض القاعدة\n    التصميمي \" )");
		/*
سادسآ المعادلات الدينامك لمربعات الادخال والنتائج للابعاد
*/
		edittext3.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext3nn = _param1.toString();
								
edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_replacement_point_level.setText(String.valueOf(00.00));
				dynamic_replacement_point_level.setTextColor(0xFFE91E63);
				dynamic_replacement_levels_difference.setText(String.valueOf(00.00));
				dynamic_replacement_levels_difference.setTextColor(0xFFE91E63);
				dynamic_required_action_for_replacement.setText("..............................");
				dynamic_required_action_for_replacement.setTextColor(0xFF000000);
				dynamic_actual_formwork_level.setText(String.valueOf(00.00));
				dynamic_actual_formwork_level.setTextColor(0xFFE91E63);
				dynamic_formwork_levels_difference.setText(String.valueOf(00.00));
				dynamic_formwork_levels_difference.setTextColor(0xFFE91E63);
				dynamic_required_action_for_formwork.setText("..............................");
				dynamic_required_action_for_formwork.setTextColor(0xFF000000);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		dynamic_design_length_of_element.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_design_length_of_elementnn = _param1.toString();
								
dynamic_design_length_of_element.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_length_difference_for_element.setText(String.valueOf(00.00));
				dynamic_length_difference_for_element.setTextColor(0xFFE91E63);
				dynamic_length_action_for_element.setText("...................");
				dynamic_length_action_for_element.setTextColor(0xFF000000);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		dynamic_design_width_of_element.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_design_width_of_elementnn = _param1.toString();
								
dynamic_design_width_of_element.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_width_difference_for_element.setText(String.valueOf(00.00));
				dynamic_width_difference_for_element.setTextColor(0xFFE91E63);
				dynamic_width_action_for_element.setText("...................");
				dynamic_width_action_for_element.setTextColor(0xFF000000);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		dynamic_design_height_of_element.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_design_height_of_elementnn = _param1.toString();
								
dynamic_design_height_of_element.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_design_formwork_level.setText(String.valueOf(00.00));
				dynamic_design_formwork_level.setTextColor(0xFFE91E63);
				dynamic_formwork_levels_difference.setText(String.valueOf(00.00));
				dynamic_formwork_levels_difference.setTextColor(0xFFE91E63);
				dynamic_required_action_for_formwork.setText("..............................");
				dynamic_required_action_for_formwork.setTextColor(0xFF000000);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		dynamic_thickness_of_wood.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		dynamic_level_of_replacement.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_level_of_replacementnn = _param1.toString();
								
dynamic_level_of_replacement.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_replacement_levels_difference.setText(String.valueOf(00.00));
				dynamic_replacement_levels_difference.setTextColor(0xFFE91E63);
				dynamic_required_action_for_replacement.setText("..............................");
				dynamic_required_action_for_replacement.setTextColor(0xFF000000);
				dynamic_design_formwork_level.setText(String.valueOf(00.00));
				dynamic_design_formwork_level.setTextColor(0xFFE91E63);
				dynamic_formwork_levels_difference.setText(String.valueOf(00.00));
				dynamic_formwork_levels_difference.setTextColor(0xFFE91E63);
				dynamic_required_action_for_formwork.setText("..............................");
				dynamic_required_action_for_formwork.setTextColor(0xFF000000);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
المعادلات الدينامك لمربعات الادخال للاستلام المساحي
*/
		dynamic_replacement_point_reading.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_replacement_point_readingnn = _param1.toString();
								
dynamic_replacement_point_reading.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_replacement_point_level.setText(String.valueOf(00.00));
				dynamic_replacement_point_level.setTextColor(0xFFE91E63);
				dynamic_replacement_levels_difference.setText(String.valueOf(00.00));
				dynamic_replacement_levels_difference.setTextColor(0xFFE91E63);
				dynamic_required_action_for_replacement.setText("..............................");
				dynamic_required_action_for_replacement.setTextColor(0xFF000000);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		dynamic_formwork_point_reading.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_formwork_point_readingnn = _param1.toString();
								
dynamic_formwork_point_reading.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_actual_formwork_level.setText(String.valueOf(00.00));
				dynamic_actual_formwork_level.setTextColor(0xFFE91E63);
				dynamic_formwork_levels_difference.setText(String.valueOf(00.00));
				dynamic_formwork_levels_difference.setTextColor(0xFFE91E63);
				dynamic_required_action_for_formwork.setText("..............................");
				dynamic_required_action_for_formwork.setTextColor(0xFF000000);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
المعادلات الدينامك لمربعات النتائج للاستلام المساحي للاحلال
*/
		dynamic_replacement_point_level.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		dynamic_replacement_levels_difference.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		/*
المعادلات الدينامك لمربعات الادخال والنتائج للاستلام المساحي لنجارة القاعدة العادية
*/
		dynamic_design_formwork_level.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		dynamic_actual_formwork_level.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		dynamic_formwork_levels_difference.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		/*
المعادلات الدينامك لمربعات الادخال والنتائج للاستلام نجارة القاعدة العادية
*/
		/*
المعادلات الدينامك لمربعات الادخال والنتائج للاستلام نجارة القاعدة العادية ( مدخلات )
*/
		dynamic_actual_length_of_element.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_actual_length_of_elementnn = _param1.toString();
								
dynamic_actual_length_of_element.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_length_difference_for_element.setText(String.valueOf(00.00));
				dynamic_length_difference_for_element.setTextColor(0xFFE91E63);
				dynamic_length_action_for_element.setText("...................");
				dynamic_length_action_for_element.setTextColor(0xFF000000);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		dynamic_actual_width_of_element.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_actual_width_of_elementnn = _param1.toString();
								
dynamic_actual_width_of_element.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_width_difference_for_element.setText(String.valueOf(00.00));
				dynamic_width_difference_for_element.setTextColor(0xFFE91E63);
				dynamic_width_action_for_element.setText("...................");
				dynamic_width_action_for_element.setTextColor(0xFF000000);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
المعادلات الدينامك لمربعات الادخال والنتائج للاستلام نجارة القاعدة العادية ( نتائج )
*/
		dynamic_length_difference_for_element.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		dynamic_width_difference_for_element.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		/*
نهاية المعادلات الدينامك لمربعات الادخال والنتائج للاستلام
*/
		/*
سابعآ شكل وأوامر الزراير
*/
		/*
أوامر زرار اظهار الاستلام المساحى
*/
		_CardStyle(dynamic_check_for_survaying, 25, 25, "#FF4DD0E1", false);
		dynamic_check_for_survaying.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dynamic_out_linear9.setVisibility(View.VISIBLE);
				dynamic_replacement_point_reading.setText("");
				dynamic_formwork_point_reading.setText("");
				dynamic_replacement_point_level.setTextColor(0xFF000000);
				dynamic_replacement_levels_difference.setTextColor(0xFF000000);
				dynamic_design_formwork_level.setTextColor(0xFF000000);
				dynamic_actual_formwork_level.setTextColor(0xFF000000);
				dynamic_formwork_levels_difference.setTextColor(0xFF000000);
			}
		});
		/*
أوامر زرار اظهار استلام الأبعاد
*/
		_CardStyle(dynamic_check_for_dimenions, 25, 25, "#FF4DD0E1", false);
		dynamic_check_for_dimenions.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dynamic_out_linear21.setVisibility(View.VISIBLE);
				dynamic_actual_length_of_element.setText("");
				dynamic_actual_width_of_element.setText("");
				dynamic_length_difference_for_element.setTextColor(0xFF000000);
				dynamic_width_difference_for_element.setTextColor(0xFF000000);
			}
		});
		/*
اوامر زرار حسابات الاستلام المساحى
*/
		dynamic_survaying_calculation_for_element.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((((dynamic_level_of_replacement.getText().toString().equals("") || dynamic_level_of_replacement.getText().toString().equals(".")) || (dynamic_level_of_replacement.getText().toString().equals("-") || (Double.parseDouble(dynamic_level_of_replacement.getText().toString()) < 0))) || ((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0)))) || (((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || ((dynamic_replacement_point_reading.getText().toString().equals("") || dynamic_replacement_point_reading.getText().toString().equals(".")) || (dynamic_replacement_point_reading.getText().toString().equals("-") || (Double.parseDouble(dynamic_replacement_point_reading.getText().toString()) < 0))))) || (((dynamic_formwork_point_reading.getText().toString().equals("") || dynamic_formwork_point_reading.getText().toString().equals(".")) || (dynamic_formwork_point_reading.getText().toString().equals("-") || (Double.parseDouble(dynamic_formwork_point_reading.getText().toString()) < 0))) || ((dynamic_design_height_of_element.getText().toString().equals("") || dynamic_design_height_of_element.getText().toString().equals(".")) || (dynamic_design_height_of_element.getText().toString().equals("-") || (Double.parseDouble(dynamic_design_height_of_element.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					dynamic_replacement_point_level.setText(String.valueOf(Double.parseDouble(edittext3.getText().toString()) - Double.parseDouble(dynamic_replacement_point_reading.getText().toString())));
					dynamic_replacement_levels_difference.setText(String.valueOf(Double.parseDouble(dynamic_replacement_point_level.getText().toString()) - Double.parseDouble(dynamic_level_of_replacement.getText().toString())));
					if ((Double.parseDouble(dynamic_replacement_point_level.getText().toString()) - Double.parseDouble(dynamic_level_of_replacement.getText().toString())) < 0) {
						if ((Double.parseDouble(dynamic_replacement_point_level.getText().toString()) - Double.parseDouble(dynamic_level_of_replacement.getText().toString())) > -0.03d) {
							dynamic_required_action_for_replacement.setText("منسوب النقطة أوطى من المنسوب التصميمي بفارق أقل من ٣ سم\nويتم تعويض الفرق \" بالقيمة الموجودة بخانة الفرق \" بالخرسانة العادية\nأي سيزيد سمك القاعدة العادية بمقدار الفرق");
							dynamic_required_action_for_replacement.setTextColor(0xFF4CAF50);
						}
						else {
							dynamic_required_action_for_replacement.setText("النقطة تحتاج لزيادة الأحلال\nمنسوب النقطة أوطى من المنسوب التصميمي\nويتم زيادة طبقة الأحلال بالقيمة الموجودة بالفرق وأعادة تشغيل طبقة الأحلال");
							dynamic_required_action_for_replacement.setTextColor(0xFF4CAF50);
						}
					}
					else {
						if ((Double.parseDouble(dynamic_replacement_point_level.getText().toString()) - Double.parseDouble(dynamic_level_of_replacement.getText().toString())) > 0) {
							if ((Double.parseDouble(dynamic_replacement_point_level.getText().toString()) - Double.parseDouble(dynamic_level_of_replacement.getText().toString())) < 0.02d) {
								dynamic_required_action_for_replacement.setText("منسوب النقطة أعلي من المنسوب التصميمي بفارق أقل من ٢ سم\nوعليه يتم ضبط المنسوب بإزالة سريعة بمقدار الفرق قبل الصب دون الحاجة لاعادة تشغيل الطبقة");
								dynamic_required_action_for_replacement.setTextColor(0xFFE91E63);
							}
							else {
								dynamic_required_action_for_replacement.setText("النقطة تحتاج لتعديل منسوب الأحلال بازالة جزء من الطبقة بالأرتفاع الموضح بالفرق وأعادة تشغيل الطبقة\nمنسوب النقطة أعلي من المنسوب التصميمي");
								dynamic_required_action_for_replacement.setTextColor(0xFFE91E63);
							}
						}
						else {
							dynamic_required_action_for_replacement.setText("النقطة لا تحتاج لازالة جزء من طبقة الأحلال أو تعويض باضافة جزء لطبقة الأحلال\nمنسوب النقطة مساوى للمنسوب التصميمي");
							dynamic_required_action_for_replacement.setTextColor(0xFF3F51B5);
						}
					}
					dynamic_design_formwork_level.setText(String.valueOf(Double.parseDouble(dynamic_level_of_replacement.getText().toString()) + Double.parseDouble(dynamic_design_height_of_element.getText().toString())));
					dynamic_actual_formwork_level.setText(String.valueOf(Double.parseDouble(edittext3.getText().toString()) - Double.parseDouble(dynamic_formwork_point_reading.getText().toString())));
					dynamic_formwork_levels_difference.setText(String.valueOf(Double.parseDouble(dynamic_actual_formwork_level.getText().toString()) - Double.parseDouble(dynamic_design_formwork_level.getText().toString())));
					if ((Double.parseDouble(dynamic_actual_formwork_level.getText().toString()) - Double.parseDouble(dynamic_design_formwork_level.getText().toString())) < 0) {
						dynamic_required_action_for_formwork.setText("المنسوب علي الطبيعة أوطى أو أقل من المنسوب التصميمي\nويتم زيادة لوح خشب بالنجارة ويتم عمل شيرب داخل النجارة علي اللوح الأضافي بالقيمة الموجودة بالفرق وذلك للوصول للمنسوب التصميمي والصب حتي منسوب الشيرب\nوهذا الأجراء في حالة عدم وجود مشكلة بمنسوب الأحلال أسفل القاعدة\nولكن في حالة وجود مشكلة بالأحلال أسفل نجارة القاعدة فيتم حل المشكلة بطبقة الأحلال");
						dynamic_required_action_for_formwork.setTextColor(0xFF4CAF50);
					}
					else {
						if ((Double.parseDouble(dynamic_actual_formwork_level.getText().toString()) - Double.parseDouble(dynamic_design_formwork_level.getText().toString())) > 0) {
							dynamic_required_action_for_formwork.setText("المنسوب علي الطبيعة أعلي أو أكبر من المنسوب التصميمي\nيتم عمل شيرب داخل النجارة علي اللوح الأخير بالقيمة الموجودة بالفرق وذلك للوصول للمنسوب التصميمي والصب حتي منسوب الشيرب\nوهذا الأجراء في حالة عدم وجود مشكلة بمنسوب الأحلال أسفل القاعدة\nولكن في حالة وجود مشكلة بالأحلال أسفل نجارة القاعدة فيتم حل المشكلة بطبقة الأحلال");
							dynamic_required_action_for_formwork.setTextColor(0xFFE91E63);
						}
						else {
							dynamic_required_action_for_formwork.setText("منسوب أعلى نجارة القاعدة مساوى للمنسوب التصميمي");
							dynamic_required_action_for_formwork.setTextColor(0xFF3F51B5);
						}
					}
					dynamic_replacement_point_level.setTextColor(0xFF000000);
					dynamic_replacement_levels_difference.setTextColor(0xFF000000);
					dynamic_design_formwork_level.setTextColor(0xFF000000);
					dynamic_actual_formwork_level.setTextColor(0xFF000000);
					dynamic_formwork_levels_difference.setTextColor(0xFF000000);
				}
			}
		});
		/*
اوامر زرار حسابات استلام الأبعاد
*/
		dynamic_dimenions_calculation_for_element.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((((dynamic_design_length_of_element.getText().toString().equals("") || dynamic_design_length_of_element.getText().toString().equals(".")) || (dynamic_design_length_of_element.getText().toString().equals("-") || (Double.parseDouble(dynamic_design_length_of_element.getText().toString()) < 0))) || ((dynamic_design_width_of_element.getText().toString().equals("") || dynamic_design_width_of_element.getText().toString().equals(".")) || (dynamic_design_width_of_element.getText().toString().equals("-") || (Double.parseDouble(dynamic_design_width_of_element.getText().toString()) < 0)))) || (((dynamic_actual_width_of_element.getText().toString().equals("") || dynamic_actual_width_of_element.getText().toString().equals(".")) || (dynamic_actual_width_of_element.getText().toString().equals("-") || (Double.parseDouble(dynamic_actual_width_of_element.getText().toString()) < 0))) || ((dynamic_actual_length_of_element.getText().toString().equals("") || dynamic_actual_length_of_element.getText().toString().equals(".")) || (dynamic_actual_length_of_element.getText().toString().equals("-") || (Double.parseDouble(dynamic_actual_length_of_element.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((dynamic_thickness_of_wood.getText().toString().equals("") || (dynamic_thickness_of_wood.getText().toString().equals("-") || dynamic_thickness_of_wood.getText().toString().equals("."))) || ((Double.parseDouble(dynamic_thickness_of_wood.getText().toString()) > 5) || (Double.parseDouble(dynamic_thickness_of_wood.getText().toString()) < 1.50d))) {
						dynamic_thickness_of_wood.setText(String.valueOf(2.50d));
					}
					dynamic_length_difference_for_element.setText(String.valueOf(Double.parseDouble(dynamic_actual_length_of_element.getText().toString()) - Double.parseDouble(dynamic_design_length_of_element.getText().toString())));
					dynamic_width_difference_for_element.setText(String.valueOf(Double.parseDouble(dynamic_actual_width_of_element.getText().toString()) - Double.parseDouble(dynamic_design_width_of_element.getText().toString())));
					if ((Double.parseDouble(dynamic_actual_length_of_element.getText().toString()) - Double.parseDouble(dynamic_design_length_of_element.getText().toString())) < 0) {
						dynamic_length_action_for_element.setText("يتم توسيع\nالنجارة بمقدار\nالفارق");
						dynamic_length_action_for_element.setTextColor(0xFF4CAF50);
					}
					else {
						if ((Double.parseDouble(dynamic_actual_length_of_element.getText().toString()) - Double.parseDouble(dynamic_design_length_of_element.getText().toString())) > 0) {
							dynamic_length_action_for_element.setText("يتم تضيق\nالنجارة بمقدار\nالفارق");
							dynamic_length_action_for_element.setTextColor(0xFFE91E63);
						}
						else {
							dynamic_length_action_for_element.setText("طول النجارة\nمضبوط");
							dynamic_length_action_for_element.setTextColor(0xFF3F51B5);
						}
					}
					if ((Double.parseDouble(dynamic_actual_width_of_element.getText().toString()) - Double.parseDouble(dynamic_design_width_of_element.getText().toString())) < 0) {
						dynamic_width_action_for_element.setText("يتم توسيع\nالنجارة بمقدار\nالفارق");
						dynamic_width_action_for_element.setTextColor(0xFF4CAF50);
					}
					else {
						if ((Double.parseDouble(dynamic_actual_width_of_element.getText().toString()) - Double.parseDouble(dynamic_design_width_of_element.getText().toString())) > 0) {
							dynamic_width_action_for_element.setText("يتم تضيق\nالنجارة بمقدار\nالفارق");
							dynamic_width_action_for_element.setTextColor(0xFFE91E63);
						}
						else {
							dynamic_width_action_for_element.setText("طول النجارة\nمضبوط");
							dynamic_width_action_for_element.setTextColor(0xFF3F51B5);
						}
					}
					dynamic_length_difference_for_element.setTextColor(0xFF000000);
					dynamic_width_difference_for_element.setTextColor(0xFF000000);
				}
			}
		});
		/*
اوامر زرار الحذف
*/
		_CardStyle(dynamic_element_remove, 25, 25, "#FF4DD0E1", false);
		dynamic_element_remove.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(ll_mainDynamic);
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
		WebView webView = new WebView(EipplainconcretefootingsActivity.this);
		webView.loadDataWithBaseURL(null, htmlContent.toString(), "text/html", "UTF-8", null);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageFinished(WebView view, String url) {
				PrintManager printManager = (PrintManager) EipplainconcretefootingsActivity.this.getSystemService(PRINT_SERVICE);
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
                "٣ - مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراض قيمته بالقيمة الموجودة داخل المستطيل وذلك عند الضغط علي زرار \" أحسب = \"\n" +
                "أحسب\n" +
                "=\n" +
                "٤ - للحصول علي الناتج أضغط علي الزر الأسود وعند تعديل أو تغيير أي مدخل يتم الضغط مرة أخرى علي الزر الأسود\n" +
                "٥ - لأضافة أو إلغاء أو إظهار قائمة أضغط علي الزر\n" +
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
