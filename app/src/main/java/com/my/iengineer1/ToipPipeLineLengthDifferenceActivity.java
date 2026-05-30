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
import androidx.print.PrintHelper;


public class ToipPipeLineLengthDifferenceActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private double smell_stripes_distribution_type4 = 0;
	private double temp1 = 0;
	private double pipe_line_length_difference = 0;
	private String path = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview53;
	private LinearLayout linear176;
	private TextView textview1148;
	private LinearLayout linear4;
	private LinearLayout linear_dynamic_pipe_line_length_difference;
	private LinearLayout add_dynamic_element_lin;
	private LinearLayout linear154;
	private LinearLayout linear120;
	private LinearLayout linear155;
	private TextView textview1152;
	private LinearLayout linear144;
	private LinearLayout linear713;
	private TextView textview1167;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private TextView textview555;
	private Button button195;
	private LinearLayout linear720;
	private LinearLayout linear707;
	private TextView textview1166;
	private TextView textview583;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private TextView textview585;
	private TextView textview584;
	private Button button196;
	private TextView textview809;
	private LinearLayout linear5;
	private TextView textview1165;
	private LinearLayout linear418;
	private TextView textview1149;
	private LinearLayout linear2;
	private TextView textview126;
	private HorizontalScrollView hscroll1;
	private TextView textview614;
	private LinearLayout linear7;
	private LinearLayout linear101s1;
	private LinearLayout linear8;
	private LinearLayout linear417;
	private LinearLayout linear9;
	private TextView textview1137;
	private LinearLayout linear153;
	private TextView textview112;
	private LinearLayout linear152;
	private TextView textview111;
	private LinearLayout linear10;
	private LinearLayout linear104s1;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private TextView textview1146;
	private LinearLayout linear17;
	private TextView textview1160;
	private Button button103;
	private TextView textview1161;
	private LinearLayout linear18;
	private TextView textview1159;
	private LinearLayout linear19;
	private EditText edittext1;
	private TextView textview1;
	private TextView textview1162;
	private EditText edittext94;
	private TextView textview1163;
	private TextView textview1164;
	private TextView textview531;
	private EditText edittext2;
	private TextView textview532;
	private TextView textview2;
	private LinearLayout linear3;
	private LinearLayout linear416;
	private TextView textview1134;
	private LinearLayout linear415;
	private TextView textview3;
	private EditText edittext3;
	private TextView textview140;
	private TextView textview5;
	private TextView textview374;
	private EditText edittext5;
	private TextView textview4;
	private EditText edittext4;
	private TextView textview150;
	private TextView textview6;
	private TextView textview124;
	private EditText edittext6;
	private TextView textview1135;
	private EditText edittext7;
	private TextView textview280;
	private TextView textview7;
	private TextView textview123;
	private EditText edittext8;
	private TextView textview403;
	private TextView textview8;
	private TextView textview612;
	private EditText edittext9;
	private TextView textview592;
	private TextView textview9;
	private TextView textview1169;
	private EditText edittext23;
	private TextView textview1170;
	private TextView textview1171;
	private TextView textview629;
	private EditText edittext22;
	private TextView textview630;
	private TextView textview631;
	private TextView textview1136;
	private EditText edittext10;
	private TextView textview593;
	private TextView textview10;
	private Button button102;
	private TextView textview400;
	private EditText edittext11;
	private TextView textview334;
	private TextView textview11;
	private TextView textview399;
	private EditText edittext12;
	private TextView textview342;
	private TextView textview12;
	private TextView textview1139;
	private EditText edittext13;
	private TextView textview346;
	private TextView textview13;
	private TextView textview1140;
	private EditText edittext14;
	private TextView textview596;
	private TextView textview14;
	private TextView textview1141;
	private EditText edittext15;
	private TextView textview357;
	private TextView textview15;
	private TextView textview1142;
	private EditText edittext16;
	private TextView textview365;
	private TextView textview16;
	private TextView textview1147;
	private EditText edittext17;
	private TextView textview597;
	private TextView textview17;
	private TextView textview1155;
	private EditText edittext18;
	private TextView textview1156;
	private TextView textview533;
	private TextView textview1157;
	private EditText edittext19;
	private TextView textview1158;
	private TextView textview603;
	private TextView textview704;
	private Button add_dynamic_pipe_line_length_difference;
	private TextView textview1175;
	private EditText edittext24;
	private TextView textview1176;
	private TextView textview1177;
	private TextView textview1150;
	private EditText edittext20;
	private TextView textview1151;
	private TextView textview18;
	private TextView textview1172;
	private EditText edittext25;
	private TextView textview1173;
	private TextView textview1174;
	private TextView textview601;
	private EditText edittext21;
	private TextView textview602;
	private TextView textview19;
	
	private Intent price = new Intent();
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toip_pipe_line_length_difference);
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
		textview53 = findViewById(R.id.textview53);
		linear176 = findViewById(R.id.linear176);
		textview1148 = findViewById(R.id.textview1148);
		linear4 = findViewById(R.id.linear4);
		linear_dynamic_pipe_line_length_difference = findViewById(R.id.linear_dynamic_pipe_line_length_difference);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		linear154 = findViewById(R.id.linear154);
		linear120 = findViewById(R.id.linear120);
		linear155 = findViewById(R.id.linear155);
		textview1152 = findViewById(R.id.textview1152);
		linear144 = findViewById(R.id.linear144);
		linear713 = findViewById(R.id.linear713);
		textview1167 = findViewById(R.id.textview1167);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		button195 = findViewById(R.id.button195);
		linear720 = findViewById(R.id.linear720);
		linear707 = findViewById(R.id.linear707);
		textview1166 = findViewById(R.id.textview1166);
		textview583 = findViewById(R.id.textview583);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		button196 = findViewById(R.id.button196);
		textview809 = findViewById(R.id.textview809);
		linear5 = findViewById(R.id.linear5);
		textview1165 = findViewById(R.id.textview1165);
		linear418 = findViewById(R.id.linear418);
		textview1149 = findViewById(R.id.textview1149);
		linear2 = findViewById(R.id.linear2);
		textview126 = findViewById(R.id.textview126);
		hscroll1 = findViewById(R.id.hscroll1);
		textview614 = findViewById(R.id.textview614);
		linear7 = findViewById(R.id.linear7);
		linear101s1 = findViewById(R.id.linear101s1);
		linear8 = findViewById(R.id.linear8);
		linear417 = findViewById(R.id.linear417);
		linear9 = findViewById(R.id.linear9);
		textview1137 = findViewById(R.id.textview1137);
		linear153 = findViewById(R.id.linear153);
		textview112 = findViewById(R.id.textview112);
		linear152 = findViewById(R.id.linear152);
		textview111 = findViewById(R.id.textview111);
		linear10 = findViewById(R.id.linear10);
		linear104s1 = findViewById(R.id.linear104s1);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		linear13 = findViewById(R.id.linear13);
		linear14 = findViewById(R.id.linear14);
		linear15 = findViewById(R.id.linear15);
		linear16 = findViewById(R.id.linear16);
		textview1146 = findViewById(R.id.textview1146);
		linear17 = findViewById(R.id.linear17);
		textview1160 = findViewById(R.id.textview1160);
		button103 = findViewById(R.id.button103);
		textview1161 = findViewById(R.id.textview1161);
		linear18 = findViewById(R.id.linear18);
		textview1159 = findViewById(R.id.textview1159);
		linear19 = findViewById(R.id.linear19);
		edittext1 = findViewById(R.id.edittext1);
		textview1 = findViewById(R.id.textview1);
		textview1162 = findViewById(R.id.textview1162);
		edittext94 = findViewById(R.id.edittext94);
		textview1163 = findViewById(R.id.textview1163);
		textview1164 = findViewById(R.id.textview1164);
		textview531 = findViewById(R.id.textview531);
		edittext2 = findViewById(R.id.edittext2);
		textview532 = findViewById(R.id.textview532);
		textview2 = findViewById(R.id.textview2);
		linear3 = findViewById(R.id.linear3);
		linear416 = findViewById(R.id.linear416);
		textview1134 = findViewById(R.id.textview1134);
		linear415 = findViewById(R.id.linear415);
		textview3 = findViewById(R.id.textview3);
		edittext3 = findViewById(R.id.edittext3);
		textview140 = findViewById(R.id.textview140);
		textview5 = findViewById(R.id.textview5);
		textview374 = findViewById(R.id.textview374);
		edittext5 = findViewById(R.id.edittext5);
		textview4 = findViewById(R.id.textview4);
		edittext4 = findViewById(R.id.edittext4);
		textview150 = findViewById(R.id.textview150);
		textview6 = findViewById(R.id.textview6);
		textview124 = findViewById(R.id.textview124);
		edittext6 = findViewById(R.id.edittext6);
		textview1135 = findViewById(R.id.textview1135);
		edittext7 = findViewById(R.id.edittext7);
		textview280 = findViewById(R.id.textview280);
		textview7 = findViewById(R.id.textview7);
		textview123 = findViewById(R.id.textview123);
		edittext8 = findViewById(R.id.edittext8);
		textview403 = findViewById(R.id.textview403);
		textview8 = findViewById(R.id.textview8);
		textview612 = findViewById(R.id.textview612);
		edittext9 = findViewById(R.id.edittext9);
		textview592 = findViewById(R.id.textview592);
		textview9 = findViewById(R.id.textview9);
		textview1169 = findViewById(R.id.textview1169);
		edittext23 = findViewById(R.id.edittext23);
		textview1170 = findViewById(R.id.textview1170);
		textview1171 = findViewById(R.id.textview1171);
		textview629 = findViewById(R.id.textview629);
		edittext22 = findViewById(R.id.edittext22);
		textview630 = findViewById(R.id.textview630);
		textview631 = findViewById(R.id.textview631);
		textview1136 = findViewById(R.id.textview1136);
		edittext10 = findViewById(R.id.edittext10);
		textview593 = findViewById(R.id.textview593);
		textview10 = findViewById(R.id.textview10);
		button102 = findViewById(R.id.button102);
		textview400 = findViewById(R.id.textview400);
		edittext11 = findViewById(R.id.edittext11);
		textview334 = findViewById(R.id.textview334);
		textview11 = findViewById(R.id.textview11);
		textview399 = findViewById(R.id.textview399);
		edittext12 = findViewById(R.id.edittext12);
		textview342 = findViewById(R.id.textview342);
		textview12 = findViewById(R.id.textview12);
		textview1139 = findViewById(R.id.textview1139);
		edittext13 = findViewById(R.id.edittext13);
		textview346 = findViewById(R.id.textview346);
		textview13 = findViewById(R.id.textview13);
		textview1140 = findViewById(R.id.textview1140);
		edittext14 = findViewById(R.id.edittext14);
		textview596 = findViewById(R.id.textview596);
		textview14 = findViewById(R.id.textview14);
		textview1141 = findViewById(R.id.textview1141);
		edittext15 = findViewById(R.id.edittext15);
		textview357 = findViewById(R.id.textview357);
		textview15 = findViewById(R.id.textview15);
		textview1142 = findViewById(R.id.textview1142);
		edittext16 = findViewById(R.id.edittext16);
		textview365 = findViewById(R.id.textview365);
		textview16 = findViewById(R.id.textview16);
		textview1147 = findViewById(R.id.textview1147);
		edittext17 = findViewById(R.id.edittext17);
		textview597 = findViewById(R.id.textview597);
		textview17 = findViewById(R.id.textview17);
		textview1155 = findViewById(R.id.textview1155);
		edittext18 = findViewById(R.id.edittext18);
		textview1156 = findViewById(R.id.textview1156);
		textview533 = findViewById(R.id.textview533);
		textview1157 = findViewById(R.id.textview1157);
		edittext19 = findViewById(R.id.edittext19);
		textview1158 = findViewById(R.id.textview1158);
		textview603 = findViewById(R.id.textview603);
		textview704 = findViewById(R.id.textview704);
		add_dynamic_pipe_line_length_difference = findViewById(R.id.add_dynamic_pipe_line_length_difference);
		textview1175 = findViewById(R.id.textview1175);
		edittext24 = findViewById(R.id.edittext24);
		textview1176 = findViewById(R.id.textview1176);
		textview1177 = findViewById(R.id.textview1177);
		textview1150 = findViewById(R.id.textview1150);
		edittext20 = findViewById(R.id.edittext20);
		textview1151 = findViewById(R.id.textview1151);
		textview18 = findViewById(R.id.textview18);
		textview1172 = findViewById(R.id.textview1172);
		edittext25 = findViewById(R.id.edittext25);
		textview1173 = findViewById(R.id.textview1173);
		textview1174 = findViewById(R.id.textview1174);
		textview601 = findViewById(R.id.textview601);
		edittext21 = findViewById(R.id.edittext21);
		textview602 = findViewById(R.id.textview602);
		textview19 = findViewById(R.id.textview19);
		internet = new RequestNetwork(this);
		
		button195.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/JiC2T3Q1CHM"));
				startActivity(price);
			}
		});
		
		button196.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button103.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear18.setVisibility(View.VISIBLE);
				linear19.setVisibility(View.VISIBLE);
				if ((edittext18.getText().toString().equals("") || edittext18.getText().toString().equals(".")) || (edittext18.getText().toString().equals("-") || (Double.parseDouble(edittext18.getText().toString()) < 0))) {
					edittext18.setText(String.valueOf(Double.parseDouble("1")));
				}
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext2.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext11.setText(String.valueOf(00.00));
				edittext12.setText(String.valueOf(00.00));
				edittext13.setText(String.valueOf(00.00));
				edittext14.setText(String.valueOf(00.00));
				edittext15.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext17.setText(String.valueOf(00.00));
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setTextColor(0xFFE91E63);
				edittext13.setTextColor(0xFFE91E63);
				edittext14.setTextColor(0xFFE91E63);
				edittext15.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
				edittext17.setTextColor(0xFFE91E63);
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext25.setText(String.valueOf(Double.parseDouble(edittext24.getText().toString())));
				}
				else {
					edittext25.setText(String.valueOf(Double.parseDouble(_charSeq) + Double.parseDouble(edittext24.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview2.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* طول الفرعة الفعلى\nمن المطبق للمطبق ( م )\nأو\nطول الفرعة التصميمي\nمن علي اللوحات ( م )\nوهو المفروض الطول الذي يتم قياسه علي الطبيعة من الحائط الخارجي للمطبق ببداية الفرعة الي الحائط الخارجي المقابل بالمطبق عند النهاية");
				return true;
			}
		});
		
		textview5.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* سمك حائط المطبق\nبنهاية الفرعة ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٢٥ م \"");
				return true;
			}
		});
		
		edittext5.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext5.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext11.setText(String.valueOf(00.00));
				edittext12.setText(String.valueOf(00.00));
				edittext13.setText(String.valueOf(00.00));
				edittext14.setText(String.valueOf(00.00));
				edittext15.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext17.setText(String.valueOf(00.00));
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setTextColor(0xFFE91E63);
				edittext13.setTextColor(0xFFE91E63);
				edittext14.setTextColor(0xFFE91E63);
				edittext15.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
				edittext17.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview6.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* سمك حائط المطبق\nببداية الفرعة ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٢٥ م \"");
				return true;
			}
		});
		
		edittext6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext6.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext11.setText(String.valueOf(00.00));
				edittext12.setText(String.valueOf(00.00));
				edittext13.setText(String.valueOf(00.00));
				edittext14.setText(String.valueOf(00.00));
				edittext15.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext17.setText(String.valueOf(00.00));
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setTextColor(0xFFE91E63);
				edittext13.setTextColor(0xFFE91E63);
				edittext14.setTextColor(0xFFE91E63);
				edittext15.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
				edittext17.setTextColor(0xFFE91E63);
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
				edittext11.setText(String.valueOf(00.00));
				edittext12.setText(String.valueOf(00.00));
				edittext13.setText(String.valueOf(00.00));
				edittext14.setText(String.valueOf(00.00));
				edittext15.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext17.setText(String.valueOf(00.00));
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setTextColor(0xFFE91E63);
				edittext13.setTextColor(0xFFE91E63);
				edittext14.setTextColor(0xFFE91E63);
				edittext15.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
				edittext17.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview7.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* قيمة الدخول داخل المطبق\nبعد الحائط ( ان وجدت ) ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.١٠ م \"");
				return true;
			}
		});
		
		edittext8.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext8.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext11.setText(String.valueOf(00.00));
				edittext12.setText(String.valueOf(00.00));
				edittext13.setText(String.valueOf(00.00));
				edittext14.setText(String.valueOf(00.00));
				edittext15.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext17.setText(String.valueOf(00.00));
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setTextColor(0xFFE91E63);
				edittext13.setTextColor(0xFFE91E63);
				edittext14.setTextColor(0xFFE91E63);
				edittext15.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
				edittext17.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview8.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* قيمة التداخل بين المواسير ( م )\nطبقآ لكتالوج الشركة الموردة\nأو طبقآ للقياس علي الطبيعة \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٢٥ م \"");
				return true;
			}
		});
		
		edittext9.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext9.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext11.setText(String.valueOf(00.00));
				edittext12.setText(String.valueOf(00.00));
				edittext13.setText(String.valueOf(00.00));
				edittext14.setText(String.valueOf(00.00));
				edittext15.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext17.setText(String.valueOf(00.00));
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setTextColor(0xFFE91E63);
				edittext13.setTextColor(0xFFE91E63);
				edittext14.setTextColor(0xFFE91E63);
				edittext15.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
				edittext17.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview9.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* طول الماسورة ال standard ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٦ م \"");
				return true;
			}
		});
		
		edittext10.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext10.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext11.setText(String.valueOf(00.00));
				edittext12.setText(String.valueOf(00.00));
				edittext13.setText(String.valueOf(00.00));
				edittext14.setText(String.valueOf(00.00));
				edittext15.setText(String.valueOf(00.00));
				edittext16.setText(String.valueOf(00.00));
				edittext17.setText(String.valueOf(00.00));
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setTextColor(0xFFE91E63);
				edittext13.setTextColor(0xFFE91E63);
				edittext14.setTextColor(0xFFE91E63);
				edittext15.setTextColor(0xFFE91E63);
				edittext16.setTextColor(0xFFE91E63);
				edittext17.setTextColor(0xFFE91E63);
				textview111.setVisibility(View.GONE);
				linear152.setVisibility(View.GONE);
				textview112.setVisibility(View.GONE);
				linear153.setVisibility(View.GONE);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview10.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* طول الماسورة الأولي بالفرعة\nأو الوصلة الأولي بالفرعة بعد مطبق\nالبداية\" طول ماسورة البداية \" ( م )\nوعادة تكون بطول ١ م ( short piece )\nويجب ان لا تقل عن مجموع ( طول الدخول داخل المطبق + سمك حائط مطبق بداية الفرعة + قيمة التداخل بين المواسير )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ م \"");
				return true;
			}
		});
		
		button102.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || ((Double.parseDouble(edittext2.getText().toString()) < 0) || (Double.parseDouble(edittext2.getText().toString()) == 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك ادخل طول الفرعة الصافي من الحد الخارجي للمطبق الأول الي الحد الخاجي للمطبق الثاني");
				}
				else {
					if (((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || edittext6.getText().toString().equals("-")) || ((Double.parseDouble(edittext6.getText().toString()) > 1) || (Double.parseDouble(edittext6.getText().toString()) < 0))) {
						edittext6.setText(String.valueOf(0.25d));
					}
					if (((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || edittext5.getText().toString().equals("-")) || ((Double.parseDouble(edittext5.getText().toString()) > 1) || (Double.parseDouble(edittext5.getText().toString()) < 0))) {
						edittext5.setText(String.valueOf(0.25d));
					}
					if (((edittext8.getText().toString().equals("") || edittext8.getText().toString().equals(".")) || edittext8.getText().toString().equals("-")) || ((Double.parseDouble(edittext8.getText().toString()) > 1) || (Double.parseDouble(edittext8.getText().toString()) < 0.05d))) {
						edittext8.setText(String.valueOf(0.2d));
					}
					if ((edittext7.getText().toString().equals("") || edittext7.getText().toString().equals(".")) || (edittext7.getText().toString().equals("-") || (Double.parseDouble(edittext7.getText().toString()) < 0))) {
						edittext7.setText(String.valueOf(0.10d));
					}
					if ((edittext9.getText().toString().equals("") || edittext9.getText().toString().equals(".")) || (edittext9.getText().toString().equals("-") || (Double.parseDouble(edittext9.getText().toString()) < (Double.parseDouble(edittext6.getText().toString()) + (Double.parseDouble(edittext5.getText().toString()) + (Double.parseDouble(edittext8.getText().toString()) * Double.parseDouble(edittext7.getText().toString()))))))) {
						edittext9.setText(String.valueOf(6));
					}
					if (((Double.parseDouble(edittext2.getText().toString()) + ((Double.parseDouble(edittext6.getText().toString()) + Double.parseDouble(edittext5.getText().toString())) + (2 * Double.parseDouble(edittext7.getText().toString())))) + Double.parseDouble(edittext8.getText().toString())) < Double.parseDouble(edittext9.getText().toString())) {
						if (edittext10.getText().toString().equals("") || (Double.parseDouble(edittext10.getText().toString()) > (Double.parseDouble(edittext2.getText().toString()) + ((Double.parseDouble(edittext6.getText().toString()) + Double.parseDouble(edittext5.getText().toString())) + (2 * Double.parseDouble(edittext7.getText().toString())))))) {
							edittext10.setText(String.valueOf(Double.parseDouble(edittext2.getText().toString()) + ((Double.parseDouble(edittext6.getText().toString()) + Double.parseDouble(edittext5.getText().toString())) + (2 * Double.parseDouble(edittext7.getText().toString())))));
						}
					}
					else {
						if (((edittext10.getText().toString().equals("") || (Double.parseDouble(edittext10.getText().toString()) > (Double.parseDouble(edittext2.getText().toString()) + ((Double.parseDouble(edittext6.getText().toString()) + Double.parseDouble(edittext5.getText().toString())) + (2 * Double.parseDouble(edittext7.getText().toString())))))) || edittext10.getText().toString().equals(".")) || (edittext10.getText().toString().equals("-") || (Double.parseDouble(edittext10.getText().toString()) < 0))) {
							edittext10.setText(String.valueOf(1));
						}
						else {
							if (Double.parseDouble(edittext10.getText().toString()) > Double.parseDouble(edittext9.getText().toString())) {
								edittext23.setText(String.valueOf(Double.parseDouble(edittext10.getText().toString())));
								edittext10.setText(String.valueOf(1));
								textview112.setVisibility(View.VISIBLE);
								linear153.setVisibility(View.VISIBLE);
							}
							else {
								if (Double.parseDouble(edittext10.getText().toString()) < ((Double.parseDouble(edittext6.getText().toString()) + Double.parseDouble(edittext7.getText().toString())) + Double.parseDouble(edittext8.getText().toString()))) {
									edittext22.setText(String.valueOf(Double.parseDouble(edittext10.getText().toString())));
									edittext10.setText(String.valueOf(1));
									textview111.setVisibility(View.VISIBLE);
									linear152.setVisibility(View.VISIBLE);
								}
							}
						}
					}
					edittext11.setText(String.valueOf(Double.parseDouble(edittext2.getText().toString()) + ((Double.parseDouble(edittext6.getText().toString()) + Double.parseDouble(edittext5.getText().toString())) + (2 * Double.parseDouble(edittext7.getText().toString())))));
					if (Double.parseDouble(edittext11.getText().toString()) < Double.parseDouble(edittext9.getText().toString())) {
						edittext12.setText(String.valueOf(Double.parseDouble(edittext11.getText().toString()) - Double.parseDouble(edittext10.getText().toString())));
						if ((Double.parseDouble(edittext12.getText().toString()) == 0) || (Double.parseDouble(edittext12.getText().toString()) < 0)) {
							edittext13.setText(String.valueOf(0));
							edittext14.setText(String.valueOf(0));
							edittext15.setText(String.valueOf(0));
							edittext16.setText(String.valueOf(0));
							edittext17.setText(String.valueOf(Double.parseDouble(edittext11.getText().toString())));
						}
						else {
							edittext13.setText(String.valueOf(0));
							edittext14.setText(String.valueOf(0));
							edittext15.setText(String.valueOf(Double.parseDouble(edittext12.getText().toString()) - (Double.parseDouble(edittext14.getText().toString()) * (Double.parseDouble(edittext9.getText().toString()) - Double.parseDouble(edittext8.getText().toString())))));
							if (Double.parseDouble(edittext15.getText().toString()) == 0) {
								edittext16.setText(String.valueOf(Double.parseDouble(edittext15.getText().toString())));
							}
							else {
								edittext16.setText(String.valueOf(Double.parseDouble(edittext15.getText().toString()) + Double.parseDouble(edittext8.getText().toString())));
							}
							edittext17.setText(String.valueOf((Double.parseDouble(edittext10.getText().toString()) + Double.parseDouble(edittext16.getText().toString())) + (Double.parseDouble(edittext9.getText().toString()) * Double.parseDouble(edittext14.getText().toString()))));
						}
					}
					else {
						edittext12.setText(String.valueOf(Double.parseDouble(edittext11.getText().toString()) - Double.parseDouble(edittext10.getText().toString())));
						edittext13.setText(String.valueOf(Double.parseDouble(edittext12.getText().toString()) / (Double.parseDouble(edittext9.getText().toString()) - Double.parseDouble(edittext8.getText().toString()))));
						edittext14.setText(String.valueOf(Math.floor(Double.parseDouble(edittext13.getText().toString()))));
						edittext15.setText(String.valueOf(Double.parseDouble(edittext12.getText().toString()) - (Double.parseDouble(edittext14.getText().toString()) * (Double.parseDouble(edittext9.getText().toString()) - Double.parseDouble(edittext8.getText().toString())))));
						if (Double.parseDouble(edittext15.getText().toString()) == 0) {
							edittext16.setText(String.valueOf(Double.parseDouble(edittext15.getText().toString())));
						}
						else {
							edittext16.setText(String.valueOf(Double.parseDouble(edittext15.getText().toString()) + Double.parseDouble(edittext8.getText().toString())));
						}
						edittext17.setText(String.valueOf((Double.parseDouble(edittext10.getText().toString()) + Double.parseDouble(edittext16.getText().toString())) + (Double.parseDouble(edittext9.getText().toString()) * Double.parseDouble(edittext14.getText().toString()))));
					}
					edittext11.setTextColor(0xFF000000);
					edittext12.setTextColor(0xFF000000);
					edittext13.setTextColor(0xFF000000);
					edittext14.setTextColor(0xFF000000);
					edittext15.setTextColor(0xFF000000);
					edittext16.setTextColor(0xFF000000);
					edittext17.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext11.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext11.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext12.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext14.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext15.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext16.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext18.getText().toString().equals("") || edittext18.getText().toString().equals(".")) || (edittext18.getText().toString().equals("-") || (Double.parseDouble(edittext18.getText().toString()) < 0)))) {
					edittext19.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
				else {
					if (Double.parseDouble(edittext18.getText().toString()) < Double.parseDouble(edittext16.getText().toString())) {
						edittext19.setText(String.valueOf(Double.parseDouble(_charSeq) + Double.parseDouble(edittext8.getText().toString())));
					}
					else {
						edittext19.setText(String.valueOf(Double.parseDouble(_charSeq)));
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
		
		edittext18.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext18.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext17.getText().toString().equals("") || edittext17.getText().toString().equals(".")) || (edittext17.getText().toString().equals("-") || (Double.parseDouble(edittext17.getText().toString()) < 0)))) {
					edittext19.setText(String.valueOf(Double.parseDouble(edittext17.getText().toString())));
				}
				else {
					if (Double.parseDouble(_charSeq) < Double.parseDouble(edittext16.getText().toString())) {
						edittext19.setText(String.valueOf(Double.parseDouble(edittext17.getText().toString()) + Double.parseDouble(edittext8.getText().toString())));
					}
					else {
						edittext19.setText(String.valueOf(Double.parseDouble(edittext17.getText().toString())));
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
		
		edittext19.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext19.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext21.setText(String.valueOf(Double.parseDouble(edittext19.getText().toString()) + Double.parseDouble(edittext20.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		add_dynamic_pipe_line_length_difference.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_dynamic_smell_stripes_between_columns_type4();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext24.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext24.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				if ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) {
					edittext25.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
				else {
					edittext25.setText(String.valueOf(Double.parseDouble(edittext2.getText().toString()) + Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext20.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext20.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext21.setText(String.valueOf(Double.parseDouble(edittext19.getText().toString()) + Double.parseDouble(edittext20.getText().toString())));
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
		linear11.setVisibility(View.GONE);
		linear12.setVisibility(View.GONE);
		linear13.setVisibility(View.GONE);
		linear14.setVisibility(View.GONE);
		linear15.setVisibility(View.GONE);
		linear16.setVisibility(View.GONE);
		linear18.setVisibility(View.GONE);
		linear19.setVisibility(View.GONE);
		linear120.setVisibility(View.GONE);
		linear154.setVisibility(View.GONE);
		textview111.setVisibility(View.GONE);
		linear152.setVisibility(View.GONE);
		textview112.setVisibility(View.GONE);
		linear153.setVisibility(View.GONE);
		
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
	public void _dynamic_smell_stripes_between_columns_type4() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_pipe_line_length_difference = (LinearLayout) inflater.inflate(R.layout.toip_d_pipe_line_length_difference, null, false);
		linear_dynamic_pipe_line_length_difference.addView(dynamic_pipe_line_length_difference);
		/*
أولآ الأسماء والتعريفات
*/
		final TextView dynamic_textview2p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_textview2p);
		final TextView dynamic_textview5p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_textview5p);
		final TextView dynamic_textview6p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_textview6p);
		final TextView dynamic_textview7p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_textview7p);
		final TextView dynamic_textview8p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_textview8p);
		final TextView dynamic_textview9p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_textview9p);
		final TextView dynamic_textview10p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_textview10p);
		final TextView textview111d = dynamic_pipe_line_length_difference.findViewById(R.id.textview111d);
		final TextView textview112d = dynamic_pipe_line_length_difference.findViewById(R.id.textview112d);
		/*
ثانيآ : تعريف الدينامك linears
*/
		final LinearLayout dynamic_linear4p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_linear4p);
		final LinearLayout dynamic_linear11p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_linear11p);
		final LinearLayout dynamic_linear12p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_linear12p);
		final LinearLayout dynamic_linear13p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_linear13p);
		final LinearLayout dynamic_linear14p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_linear14p);
		final LinearLayout dynamic_linear15p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_linear15p);
		final LinearLayout dynamic_linear16p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_linear16p);
		final LinearLayout dynamic_linear18p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_linear18p);
		final LinearLayout dynamic_linear19p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_linear19p);
		final LinearLayout linear152d = dynamic_pipe_line_length_difference.findViewById(R.id.linear152d);
		final LinearLayout linear153d = dynamic_pipe_line_length_difference.findViewById(R.id.linear153d);
		/*
رابعآ : تعريف الدينامك زراير
*/
		final Button dynamic_button1p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_button1p);
		final Button dynamic_button2p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_button2p);
		final Button dynamic_remove = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_remove);
		/*
خامسآ مربعات الادخال والنتائج
*/
		/*
التعريف الدينامك لمربعات الادخال والنتائج
*/
		final EditText dynamic_edittext2p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext2p);
		dynamic_edittext2p.setSingleLine(true);
		dynamic_edittext2p.setFocusableInTouchMode(true);
		final EditText edittext2d = dynamic_pipe_line_length_difference.findViewById(R.id.edittext2d);
		edittext2d.setSingleLine(true);
		edittext2d.setFocusableInTouchMode(true);
		final EditText dynamic_edittext5p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext5p);
		dynamic_edittext5p.setSingleLine(true);
		dynamic_edittext5p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext6p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext6p);
		dynamic_edittext6p.setSingleLine(true);
		dynamic_edittext6p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext7p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext7p);
		dynamic_edittext7p.setSingleLine(true);
		dynamic_edittext7p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext8p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext8p);
		dynamic_edittext8p.setSingleLine(true);
		dynamic_edittext8p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext9p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext9p);
		dynamic_edittext9p.setSingleLine(true);
		dynamic_edittext9p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext10p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext10p);
		dynamic_edittext10p.setSingleLine(true);
		dynamic_edittext10p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext11p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext11p);
		dynamic_edittext11p.setSingleLine(true);
		dynamic_edittext11p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext12p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext12p);
		dynamic_edittext12p.setSingleLine(true);
		dynamic_edittext12p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext13p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext13p);
		dynamic_edittext13p.setSingleLine(true);
		dynamic_edittext13p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext14p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext14p);
		dynamic_edittext14p.setSingleLine(true);
		dynamic_edittext14p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext15p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext15p);
		dynamic_edittext15p.setSingleLine(true);
		dynamic_edittext15p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext16p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext16p);
		dynamic_edittext16p.setSingleLine(true);
		dynamic_edittext16p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext17p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext17p);
		dynamic_edittext17p.setSingleLine(true);
		dynamic_edittext17p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext18p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext18p);
		dynamic_edittext18p.setSingleLine(true);
		dynamic_edittext18p.setFocusableInTouchMode(true);
		final EditText dynamic_edittext19p = dynamic_pipe_line_length_difference.findViewById(R.id.dynamic_edittext19p);
		dynamic_edittext19p.setSingleLine(true);
		dynamic_edittext19p.setFocusableInTouchMode(true);
		final EditText edittext22d = dynamic_pipe_line_length_difference.findViewById(R.id.edittext22d);
		edittext22d.setSingleLine(true);
		edittext22d.setFocusableInTouchMode(true);
		final EditText edittext23d = dynamic_pipe_line_length_difference.findViewById(R.id.edittext23d);
		edittext23d.setSingleLine(true);
		edittext23d.setFocusableInTouchMode(true);
		/*
 الأوامر
*/
		/*
 أولآ الأسماء والتعريفات
*/
		dynamic_textview2p.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* طول الفرعة الفعلى\nمن المطبق للمطبق ( م )\nأو\nطول الفرعة التصميمي\nمن علي اللوحات ( م )\nوهو المفروض الطول الذي يتم قياسه علي الطبيعة من الحائط الخارجي للمطبق ببداية الفرعة الي الحائط الخارجي المقابل بالمطبق عند النهاية");
				return true;
			}
		});
		dynamic_textview5p.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* سمك حائط المطبق\nبنهاية الفرعة ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٢٥ م \"");
				return true;
			}
		});
		dynamic_textview6p.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* سمك حائط المطبق\nببداية الفرعة ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٢٥ م \"");
				return true;
			}
		});
		dynamic_textview7p.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* قيمة الدخول داخل المطبق\nبعد الحائط ( ان وجدت ) ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.١٠ م \"");
				return true;
			}
		});
		dynamic_textview8p.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* قيمة التداخل بين المواسير ( م )\nطبقآ لكتالوج الشركة الموردة\nأو طبقآ للقياس علي الطبيعة \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٢٥ م \"");
				return true;
			}
		});
		dynamic_textview9p.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* طول الماسورة ال standard ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٦ م \"");
				return true;
			}
		});
		dynamic_textview10p.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* طول الماسورة الأولي بالفرعة\nأو الوصلة الأولي بالفرعة بعد مطبق\nالبداية\" طول ماسورة البداية \" ( م )\nوعادة تكون بطول ١ م ( short piece )\nويجب ان لا تقل عن مجموع ( طول الدخول داخل المطبق + سمك حائط مطبق بداية الفرعة + قيمة التداخل بين المواسير )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ م \"");
				return true;
			}
		});
		/*
ثانيآ أوامر إخفاء وإظهار ال linears الدينامك
*/
		dynamic_linear11p.setVisibility(View.GONE);
		dynamic_linear12p.setVisibility(View.GONE);
		dynamic_linear13p.setVisibility(View.GONE);
		dynamic_linear14p.setVisibility(View.GONE);
		dynamic_linear15p.setVisibility(View.GONE);
		dynamic_linear16p.setVisibility(View.GONE);
		dynamic_linear18p.setVisibility(View.GONE);
		dynamic_linear19p.setVisibility(View.GONE);
		textview111d.setVisibility(View.GONE);
		linear152d.setVisibility(View.GONE);
		textview112d.setVisibility(View.GONE);
		linear153d.setVisibility(View.GONE);
		edittext2d.setVisibility(View.GONE);
		/*
سادسآ المعادلات الدينامك لمربعات الادخال والنتائج للابعاد
*/
		dynamic_edittext2p.addTextChangedListener(new TextWatcher() { 	
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
					edittext2d.setText(String.valueOf((long)(Double.parseDouble("00.00"))));
				}
				else {
					edittext2d.setText(String.valueOf((long)(Double.parseDouble(s.toString()))));
				}
			} });
		dynamic_edittext2p.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_edittext2pnn = _param1.toString();
								
dynamic_edittext2p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_edittext11p.setText(String.valueOf(00.00));
				dynamic_edittext12p.setText(String.valueOf(00.00));
				dynamic_edittext13p.setText(String.valueOf(00.00));
				dynamic_edittext14p.setText(String.valueOf(00.00));
				dynamic_edittext15p.setText(String.valueOf(00.00));
				dynamic_edittext16p.setText(String.valueOf(00.00));
				dynamic_edittext17p.setText(String.valueOf(00.00));
				dynamic_edittext11p.setTextColor(0xFFE91E63);
				dynamic_edittext12p.setTextColor(0xFFE91E63);
				dynamic_edittext13p.setTextColor(0xFFE91E63);
				dynamic_edittext14p.setTextColor(0xFFE91E63);
				dynamic_edittext15p.setTextColor(0xFFE91E63);
				dynamic_edittext16p.setTextColor(0xFFE91E63);
				dynamic_edittext17p.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		dynamic_edittext5p.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_edittext5pnn = _param1.toString();
								
dynamic_edittext5p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_edittext11p.setText(String.valueOf(00.00));
				dynamic_edittext12p.setText(String.valueOf(00.00));
				dynamic_edittext13p.setText(String.valueOf(00.00));
				dynamic_edittext14p.setText(String.valueOf(00.00));
				dynamic_edittext15p.setText(String.valueOf(00.00));
				dynamic_edittext16p.setText(String.valueOf(00.00));
				dynamic_edittext17p.setText(String.valueOf(00.00));
				dynamic_edittext11p.setTextColor(0xFFE91E63);
				dynamic_edittext12p.setTextColor(0xFFE91E63);
				dynamic_edittext13p.setTextColor(0xFFE91E63);
				dynamic_edittext14p.setTextColor(0xFFE91E63);
				dynamic_edittext15p.setTextColor(0xFFE91E63);
				dynamic_edittext16p.setTextColor(0xFFE91E63);
				dynamic_edittext17p.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		dynamic_edittext6p.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_edittext6pnn = _param1.toString();
								
dynamic_edittext6p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_edittext11p.setText(String.valueOf(00.00));
				dynamic_edittext12p.setText(String.valueOf(00.00));
				dynamic_edittext13p.setText(String.valueOf(00.00));
				dynamic_edittext14p.setText(String.valueOf(00.00));
				dynamic_edittext15p.setText(String.valueOf(00.00));
				dynamic_edittext16p.setText(String.valueOf(00.00));
				dynamic_edittext17p.setText(String.valueOf(00.00));
				dynamic_edittext11p.setTextColor(0xFFE91E63);
				dynamic_edittext12p.setTextColor(0xFFE91E63);
				dynamic_edittext13p.setTextColor(0xFFE91E63);
				dynamic_edittext14p.setTextColor(0xFFE91E63);
				dynamic_edittext15p.setTextColor(0xFFE91E63);
				dynamic_edittext16p.setTextColor(0xFFE91E63);
				dynamic_edittext17p.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		dynamic_edittext7p.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_edittext7pnn = _param1.toString();
								
dynamic_edittext7p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_edittext11p.setText(String.valueOf(00.00));
				dynamic_edittext12p.setText(String.valueOf(00.00));
				dynamic_edittext13p.setText(String.valueOf(00.00));
				dynamic_edittext14p.setText(String.valueOf(00.00));
				dynamic_edittext15p.setText(String.valueOf(00.00));
				dynamic_edittext16p.setText(String.valueOf(00.00));
				dynamic_edittext17p.setText(String.valueOf(00.00));
				dynamic_edittext11p.setTextColor(0xFFE91E63);
				dynamic_edittext12p.setTextColor(0xFFE91E63);
				dynamic_edittext13p.setTextColor(0xFFE91E63);
				dynamic_edittext14p.setTextColor(0xFFE91E63);
				dynamic_edittext15p.setTextColor(0xFFE91E63);
				dynamic_edittext16p.setTextColor(0xFFE91E63);
				dynamic_edittext17p.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		dynamic_edittext8p.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_edittext8pnn = _param1.toString();
								
dynamic_edittext8p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_edittext11p.setText(String.valueOf(00.00));
				dynamic_edittext12p.setText(String.valueOf(00.00));
				dynamic_edittext13p.setText(String.valueOf(00.00));
				dynamic_edittext14p.setText(String.valueOf(00.00));
				dynamic_edittext15p.setText(String.valueOf(00.00));
				dynamic_edittext16p.setText(String.valueOf(00.00));
				dynamic_edittext17p.setText(String.valueOf(00.00));
				dynamic_edittext11p.setTextColor(0xFFE91E63);
				dynamic_edittext12p.setTextColor(0xFFE91E63);
				dynamic_edittext13p.setTextColor(0xFFE91E63);
				dynamic_edittext14p.setTextColor(0xFFE91E63);
				dynamic_edittext15p.setTextColor(0xFFE91E63);
				dynamic_edittext16p.setTextColor(0xFFE91E63);
				dynamic_edittext17p.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		dynamic_edittext9p.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_edittext9pnn = _param1.toString();
								
dynamic_edittext9p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_edittext11p.setText(String.valueOf(00.00));
				dynamic_edittext12p.setText(String.valueOf(00.00));
				dynamic_edittext13p.setText(String.valueOf(00.00));
				dynamic_edittext14p.setText(String.valueOf(00.00));
				dynamic_edittext15p.setText(String.valueOf(00.00));
				dynamic_edittext16p.setText(String.valueOf(00.00));
				dynamic_edittext17p.setText(String.valueOf(00.00));
				dynamic_edittext11p.setTextColor(0xFFE91E63);
				dynamic_edittext12p.setTextColor(0xFFE91E63);
				dynamic_edittext13p.setTextColor(0xFFE91E63);
				dynamic_edittext14p.setTextColor(0xFFE91E63);
				dynamic_edittext15p.setTextColor(0xFFE91E63);
				dynamic_edittext16p.setTextColor(0xFFE91E63);
				dynamic_edittext17p.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		dynamic_edittext10p.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_edittext10pnn = _param1.toString();
								
dynamic_edittext10p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_edittext11p.setText(String.valueOf(00.00));
				dynamic_edittext12p.setText(String.valueOf(00.00));
				dynamic_edittext13p.setText(String.valueOf(00.00));
				dynamic_edittext14p.setText(String.valueOf(00.00));
				dynamic_edittext15p.setText(String.valueOf(00.00));
				dynamic_edittext16p.setText(String.valueOf(00.00));
				dynamic_edittext17p.setText(String.valueOf(00.00));
				dynamic_edittext11p.setTextColor(0xFFE91E63);
				dynamic_edittext12p.setTextColor(0xFFE91E63);
				dynamic_edittext13p.setTextColor(0xFFE91E63);
				dynamic_edittext14p.setTextColor(0xFFE91E63);
				dynamic_edittext15p.setTextColor(0xFFE91E63);
				dynamic_edittext16p.setTextColor(0xFFE91E63);
				dynamic_edittext17p.setTextColor(0xFFE91E63);
				textview111d.setVisibility(View.GONE);
				linear152d.setVisibility(View.GONE);
				textview112d.setVisibility(View.GONE);
				linear153d.setVisibility(View.GONE);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
أوامر زرار حسابات الكميات
*/
		dynamic_button1p.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((dynamic_edittext2p.getText().toString().equals("") || dynamic_edittext2p.getText().toString().equals(".")) || (dynamic_edittext2p.getText().toString().equals("-") || (Double.parseDouble(dynamic_edittext2p.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (((dynamic_edittext6p.getText().toString().equals("") || dynamic_edittext6p.getText().toString().equals(".")) || dynamic_edittext6p.getText().toString().equals("-")) || ((Double.parseDouble(dynamic_edittext6p.getText().toString()) > 1) || (Double.parseDouble(dynamic_edittext6p.getText().toString()) < 0))) {
						dynamic_edittext6p.setText(String.valueOf(0.25d));
					}
					if (((dynamic_edittext5p.getText().toString().equals("") || dynamic_edittext5p.getText().toString().equals(".")) || dynamic_edittext5p.getText().toString().equals("-")) || ((Double.parseDouble(dynamic_edittext5p.getText().toString()) > 1) || (Double.parseDouble(dynamic_edittext5p.getText().toString()) < 0))) {
						dynamic_edittext5p.setText(String.valueOf(0.25d));
					}
					if (((dynamic_edittext8p.getText().toString().equals("") || dynamic_edittext8p.getText().toString().equals(".")) || dynamic_edittext8p.getText().toString().equals("-")) || ((Double.parseDouble(dynamic_edittext8p.getText().toString()) > 1) || (Double.parseDouble(dynamic_edittext8p.getText().toString()) < 0.05d))) {
						dynamic_edittext8p.setText(String.valueOf(0.20d));
					}
					if ((dynamic_edittext7p.getText().toString().equals("") || dynamic_edittext7p.getText().toString().equals(".")) || (dynamic_edittext7p.getText().toString().equals("-") || (Double.parseDouble(dynamic_edittext7p.getText().toString()) < 0))) {
						dynamic_edittext7p.setText(String.valueOf(0.10d));
					}
					if ((dynamic_edittext9p.getText().toString().equals("") || dynamic_edittext9p.getText().toString().equals(".")) || (dynamic_edittext9p.getText().toString().equals("-") || (Double.parseDouble(dynamic_edittext9p.getText().toString()) < (Double.parseDouble(dynamic_edittext6p.getText().toString()) + (Double.parseDouble(dynamic_edittext5p.getText().toString()) + (Double.parseDouble(dynamic_edittext8p.getText().toString()) * Double.parseDouble(dynamic_edittext7p.getText().toString()))))))) {
						dynamic_edittext9p.setText(String.valueOf(6));
					}
					if (((Double.parseDouble(dynamic_edittext2p.getText().toString()) + ((Double.parseDouble(dynamic_edittext6p.getText().toString()) + Double.parseDouble(dynamic_edittext5p.getText().toString())) + (2 * Double.parseDouble(dynamic_edittext7p.getText().toString())))) + Double.parseDouble(dynamic_edittext8p.getText().toString())) < Double.parseDouble(dynamic_edittext9p.getText().toString())) {
						if (dynamic_edittext10p.getText().toString().equals("") || (Double.parseDouble(dynamic_edittext10p.getText().toString()) > (Double.parseDouble(dynamic_edittext2p.getText().toString()) + ((Double.parseDouble(dynamic_edittext6p.getText().toString()) + Double.parseDouble(dynamic_edittext5p.getText().toString())) + (2 * Double.parseDouble(dynamic_edittext7p.getText().toString())))))) {
							dynamic_edittext10p.setText(String.valueOf(Double.parseDouble(dynamic_edittext2p.getText().toString()) + ((Double.parseDouble(dynamic_edittext6p.getText().toString()) + Double.parseDouble(dynamic_edittext5p.getText().toString())) + (2 * Double.parseDouble(dynamic_edittext7p.getText().toString())))));
						}
					}
					else {
						if (((dynamic_edittext10p.getText().toString().equals("") || (Double.parseDouble(dynamic_edittext10p.getText().toString()) > (Double.parseDouble(dynamic_edittext2p.getText().toString()) + ((Double.parseDouble(dynamic_edittext6p.getText().toString()) + Double.parseDouble(dynamic_edittext5p.getText().toString())) + (2 * Double.parseDouble(dynamic_edittext7p.getText().toString())))))) || dynamic_edittext10p.getText().toString().equals(".")) || (dynamic_edittext10p.getText().toString().equals("-") || (Double.parseDouble(dynamic_edittext10p.getText().toString()) < 0))) {
							dynamic_edittext10p.setText(String.valueOf(1));
						}
						else {
							if (Double.parseDouble(dynamic_edittext10p.getText().toString()) > Double.parseDouble(dynamic_edittext9p.getText().toString())) {
								edittext23d.setText(String.valueOf(Double.parseDouble(dynamic_edittext10p.getText().toString())));
								dynamic_edittext10p.setText(String.valueOf(1));
								textview112d.setVisibility(View.VISIBLE);
								linear153d.setVisibility(View.VISIBLE);
							}
							else {
								if (Double.parseDouble(dynamic_edittext10p.getText().toString()) < ((Double.parseDouble(dynamic_edittext6p.getText().toString()) + Double.parseDouble(dynamic_edittext7p.getText().toString())) + Double.parseDouble(dynamic_edittext8p.getText().toString()))) {
									edittext22d.setText(String.valueOf(Double.parseDouble(dynamic_edittext10p.getText().toString())));
									dynamic_edittext10p.setText(String.valueOf(1));
									textview111d.setVisibility(View.VISIBLE);
									linear152d.setVisibility(View.VISIBLE);
								}
							}
						}
					}
					dynamic_edittext11p.setText(String.valueOf(Double.parseDouble(dynamic_edittext2p.getText().toString()) + ((Double.parseDouble(dynamic_edittext6p.getText().toString()) + Double.parseDouble(dynamic_edittext5p.getText().toString())) + (2 * Double.parseDouble(dynamic_edittext7p.getText().toString())))));
					if (Double.parseDouble(dynamic_edittext11p.getText().toString()) < Double.parseDouble(dynamic_edittext9p.getText().toString())) {
						dynamic_edittext12p.setText(String.valueOf(Double.parseDouble(dynamic_edittext11p.getText().toString()) - Double.parseDouble(dynamic_edittext10p.getText().toString())));
						if ((Double.parseDouble(dynamic_edittext12p.getText().toString()) == 0) || (Double.parseDouble(dynamic_edittext12p.getText().toString()) < 0)) {
							dynamic_edittext13p.setText(String.valueOf(0));
							dynamic_edittext14p.setText(String.valueOf(0));
							dynamic_edittext15p.setText(String.valueOf(0));
							dynamic_edittext16p.setText(String.valueOf(0));
							dynamic_edittext17p.setText(String.valueOf(Double.parseDouble(dynamic_edittext11p.getText().toString())));
						}
						else {
							dynamic_edittext13p.setText(String.valueOf(0));
							dynamic_edittext14p.setText(String.valueOf(0));
							dynamic_edittext15p.setText(String.valueOf(Double.parseDouble(dynamic_edittext12p.getText().toString()) - (Double.parseDouble(dynamic_edittext14p.getText().toString()) * (Double.parseDouble(dynamic_edittext9p.getText().toString()) - Double.parseDouble(dynamic_edittext8p.getText().toString())))));
							if (Double.parseDouble(dynamic_edittext15p.getText().toString()) == 0) {
								dynamic_edittext16p.setText(String.valueOf(Double.parseDouble(dynamic_edittext15p.getText().toString())));
							}
							else {
								dynamic_edittext16p.setText(String.valueOf(Double.parseDouble(dynamic_edittext15p.getText().toString()) + Double.parseDouble(dynamic_edittext8p.getText().toString())));
							}
							dynamic_edittext17p.setText(String.valueOf((Double.parseDouble(dynamic_edittext10p.getText().toString()) + Double.parseDouble(edittext16.getText().toString())) + (Double.parseDouble(dynamic_edittext9p.getText().toString()) * Double.parseDouble(dynamic_edittext14p.getText().toString()))));
						}
					}
					else {
						dynamic_edittext12p.setText(String.valueOf(Double.parseDouble(dynamic_edittext11p.getText().toString()) - Double.parseDouble(dynamic_edittext10p.getText().toString())));
						dynamic_edittext13p.setText(String.valueOf(Double.parseDouble(dynamic_edittext12p.getText().toString()) / (Double.parseDouble(dynamic_edittext9p.getText().toString()) - Double.parseDouble(dynamic_edittext8p.getText().toString()))));
						dynamic_edittext14p.setText(String.valueOf(Math.floor(Double.parseDouble(dynamic_edittext13p.getText().toString()))));
						dynamic_edittext15p.setText(String.valueOf(Double.parseDouble(dynamic_edittext12p.getText().toString()) - (Double.parseDouble(dynamic_edittext14p.getText().toString()) * (Double.parseDouble(dynamic_edittext9p.getText().toString()) - Double.parseDouble(dynamic_edittext8p.getText().toString())))));
						if (Double.parseDouble(dynamic_edittext15p.getText().toString()) == 0) {
							dynamic_edittext16p.setText(String.valueOf(Double.parseDouble(dynamic_edittext15p.getText().toString())));
						}
						else {
							dynamic_edittext16p.setText(String.valueOf(Double.parseDouble(dynamic_edittext15p.getText().toString()) + Double.parseDouble(dynamic_edittext8p.getText().toString())));
						}
						dynamic_edittext17p.setText(String.valueOf((Double.parseDouble(dynamic_edittext10p.getText().toString()) + Double.parseDouble(dynamic_edittext16p.getText().toString())) + (Double.parseDouble(dynamic_edittext9p.getText().toString()) * Double.parseDouble(dynamic_edittext14p.getText().toString()))));
					}
					dynamic_edittext11p.setTextColor(0xFF000000);
					dynamic_edittext12p.setTextColor(0xFF000000);
					dynamic_edittext13p.setTextColor(0xFF000000);
					dynamic_edittext14p.setTextColor(0xFF000000);
					dynamic_edittext15p.setTextColor(0xFF000000);
					dynamic_edittext16p.setTextColor(0xFF000000);
					dynamic_edittext17p.setTextColor(0xFF000000);
				}
			}
		});
		dynamic_edittext11p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		dynamic_edittext12p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		dynamic_edittext13p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		dynamic_edittext14p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		dynamic_edittext15p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		dynamic_edittext16p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		dynamic_edittext17p.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_edittext17pnn = _param1.toString();
								
dynamic_edittext17p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_edittext17p.addTextChangedListener(new TextWatcher() { 	
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
							
							
						if (((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) || ((dynamic_edittext18p.getText().toString().equals("") || dynamic_edittext18p.getText().toString().equals(".")) || (dynamic_edittext18p.getText().toString().equals("-") || (Double.parseDouble(dynamic_edittext18p.getText().toString()) < 0)))) {
							dynamic_edittext19p.setText(String.valueOf(Double.parseDouble(s.toString())));
						}
						else {
							if (Double.parseDouble(dynamic_edittext18p.getText().toString()) < Double.parseDouble(dynamic_edittext16p.getText().toString())) {
								dynamic_edittext19p.setText(String.valueOf(Double.parseDouble(s.toString()) + Double.parseDouble(dynamic_edittext8p.getText().toString())));
							}
							else {
								dynamic_edittext19p.setText(String.valueOf(Double.parseDouble(s.toString())));
							}
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
		dynamic_button2p.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				dynamic_linear18p.setVisibility(View.VISIBLE);
				dynamic_linear19p.setVisibility(View.VISIBLE);
				if ((dynamic_edittext18p.getText().toString().equals("") || dynamic_edittext18p.getText().toString().equals(".")) || (dynamic_edittext18p.getText().toString().equals("-") || (Double.parseDouble(dynamic_edittext18p.getText().toString()) < 0))) {
					dynamic_edittext18p.setText(String.valueOf(Double.parseDouble("1")));
				}
			}
		});
		dynamic_edittext18p.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String dynamic_edittext18pnn = _param1.toString();
								
dynamic_edittext18p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				dynamic_edittext18p.addTextChangedListener(new TextWatcher() { 	
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
							
							
						if (((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) || ((dynamic_edittext17p.getText().toString().equals("") || dynamic_edittext17p.getText().toString().equals(".")) || (dynamic_edittext17p.getText().toString().equals("-") || (Double.parseDouble(dynamic_edittext17p.getText().toString()) < 0)))) {
							dynamic_edittext19p.setText(String.valueOf(Double.parseDouble(dynamic_edittext17p.getText().toString())));
						}
						else {
							if (Double.parseDouble(s.toString()) < Double.parseDouble(dynamic_edittext16p.getText().toString())) {
								dynamic_edittext19p.setText(String.valueOf(Double.parseDouble(dynamic_edittext17p.getText().toString()) + Double.parseDouble(dynamic_edittext8p.getText().toString())));
							}
							else {
								dynamic_edittext19p.setText(String.valueOf(Double.parseDouble(dynamic_edittext17p.getText().toString())));
							}
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
		dynamic_edittext19p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		/*
نهاية أوامر زرار حسابات الكميات
*/
		/*
إجمالي كميات أطوال المواسير التصميمية او الفعلية بدون هالك او تداخل الدينامك
*/
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
					
					
				temp1 = 0;
				 for(int i=0; i<linear_dynamic_pipe_line_length_difference.getChildCount(); ++i) { 
					 View child=linear_dynamic_pipe_line_length_difference.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext2d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext24.setText(String.valueOf(temp1));
			} });
		/*
إجمالي كميات أطوال المواسير شامل الهالك الدينامك
*/
		dynamic_edittext19p.addTextChangedListener(new TextWatcher() { 	
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
					
					
				pipe_line_length_difference = 0;
				 for(int i=0; i<linear_dynamic_pipe_line_length_difference.getChildCount(); ++i) { 
					 View child=linear_dynamic_pipe_line_length_difference.getChildAt(i); 
					TextView textview_dynamic_pipe_line_length_difference =child.findViewById(R.id.dynamic_edittext19p);
					pipe_line_length_difference = pipe_line_length_difference + Double.parseDouble(textview_dynamic_pipe_line_length_difference.getText().toString());
				}
				edittext20.setText(String.valueOf(pipe_line_length_difference));
			} });
		/*
نهاية إجمالي أطوال المواسير الدينامك
*/
		/*
اوامر زرار الحذف
*/
		dynamic_remove.setText("الغاء الفرعة\nالحالية");
		dynamic_remove.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_pipe_line_length_difference);
				/*
إجمالي كميات أطوال المواسير التصميمية او الفعلية بدون هالك او تداخل الدينامك بعد الحذف
*/
				temp1 = 0;
				 for(int i=0; i<linear_dynamic_pipe_line_length_difference.getChildCount(); ++i) { 
					 View child=linear_dynamic_pipe_line_length_difference.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext2d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext24.setText(String.valueOf(temp1));
				/*
إجمالي أطوال المواسير الدينامك بعد عملية الحذف
*/
				pipe_line_length_difference = 0;
				 for(int i=0; i<linear_dynamic_pipe_line_length_difference.getChildCount(); ++i) { 
					 View child=linear_dynamic_pipe_line_length_difference.getChildAt(i); 
					TextView textview_dynamic_pipe_line_length_difference =child.findViewById(R.id.dynamic_edittext19p);
					pipe_line_length_difference = pipe_line_length_difference + Double.parseDouble(textview_dynamic_pipe_line_length_difference.getText().toString());
				}
				edittext20.setText(String.valueOf(pipe_line_length_difference));
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
		PrintHelper printHelper = new PrintHelper(ToipPipeLineLengthDifferenceActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
}
