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
import android.widget.ImageView;
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


public class ToipccPaintssActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private double temp1 = 0;
	private double temp = 0;
	private double temp1a = 0;
	private double temp2b = 0;
	private double temp3c = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview1222;
	private LinearLayout linear723;
	private TextView textview1;
	private LinearLayout linear2;
	private LinearLayout add_dynamic_wall_linear;
	private Button add_dynamic_wall;
	private LinearLayout linear120;
	private HorizontalScrollView hscroll2;
	private LinearLayout linear144;
	private TextView textview14;
	private TextView textview482;
	private Button button28;
	private HorizontalScrollView hscroll32;
	private LinearLayout linear57;
	private LinearLayout linear727;
	private TextView textview578;
	private LinearLayout linear386;
	private LinearLayout linear724;
	private LinearLayout linear725;
	private LinearLayout linear410;
	private LinearLayout linear726;
	private LinearLayout linear289;
	private TextView textview555;
	private Button button195;
	private LinearLayout linear728;
	private LinearLayout linear707;
	private TextView textview1221;
	private TextView textview583;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private EditText edittext137;
	private TextView textview845;
	private TextView textview585;
	private TextView textview584;
	private Button button29;
	private TextView textview809;
	private LinearLayout linear389;
	private HorizontalScrollView hscroll58;
	private LinearLayout linear56;
	private HorizontalScrollView hscroll33;
	private LinearLayout linear162;
	private HorizontalScrollView hscroll37;
	private LinearLayout linear164;
	private LinearLayout linear194;
	private TextView textview666;
	private TextView textview667;
	private LinearLayout linear188;
	private HorizontalScrollView hscroll57;
	private LinearLayout linear13;
	private TextView textview477;
	private LinearLayout add_dynamic_hole_linear;
	private LinearLayout linear722;
	private Button add_dynamic_hole;
	private HorizontalScrollView hscroll56;
	private TextView textview55;
	private LinearLayout linear183;
	private TextView textview18;
	private EditText edittext7;
	private TextView textview17;
	private TextView textview16;
	private EditText edittext6;
	private TextView textview10;
	private TextView textview446;
	private EditText edittext1;
	private TextView textview81;
	private TextView textview5;
	private TextView textview448;
	private EditText edittext2;
	private TextView textview422;
	private TextView textview11;
	private EditText edittext3;
	private TextView textview426;
	private TextView textview7;
	private EditText edittext444;
	private Button button1;
	private TextView textview510;
	private EditText edittext4;
	private TextView textview508;
	private TextView textview509;
	private TextView textview449;
	private EditText edittext5;
	private TextView textview13;
	private TextView textview12;
	private TextView textview705;
	private EditText edittext16;
	private TextView textview706;
	private TextView textview707;
	private TextView textview488;
	private EditText edittext17;
	private TextView textview489;
	private TextView textview487;
	private TextView textview708;
	private EditText edittext18;
	private TextView textview532;
	private TextView textview533;
	private TextView textview601;
	private EditText edittext19;
	private TextView textview602;
	private TextView textview603;
	private LinearLayout linear713;
	private TextView textview103;
	private HorizontalScrollView hscroll30;
	private LinearLayout linear93;
	private TextView textview530;
	private TextView textview531;
	private LinearLayout linear729;
	private ImageView imageview36;
	private LinearLayout linear720;
	private TextView textview1336;
	private TextView textview466;
	private EditText edittext38;
	private TextView textview276;
	private TextView textview277;
	private TextView textview292;
	private TextView textview291;
	private LinearLayout linear95;
	private TextView textview473;
	private EditText edittext42;
	
	private Intent price = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_paintss);
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
		textview1222 = findViewById(R.id.textview1222);
		linear723 = findViewById(R.id.linear723);
		textview1 = findViewById(R.id.textview1);
		linear2 = findViewById(R.id.linear2);
		add_dynamic_wall_linear = findViewById(R.id.add_dynamic_wall_linear);
		add_dynamic_wall = findViewById(R.id.add_dynamic_wall);
		linear120 = findViewById(R.id.linear120);
		hscroll2 = findViewById(R.id.hscroll2);
		linear144 = findViewById(R.id.linear144);
		textview14 = findViewById(R.id.textview14);
		textview482 = findViewById(R.id.textview482);
		button28 = findViewById(R.id.button28);
		hscroll32 = findViewById(R.id.hscroll32);
		linear57 = findViewById(R.id.linear57);
		linear727 = findViewById(R.id.linear727);
		textview578 = findViewById(R.id.textview578);
		linear386 = findViewById(R.id.linear386);
		linear724 = findViewById(R.id.linear724);
		linear725 = findViewById(R.id.linear725);
		linear410 = findViewById(R.id.linear410);
		linear726 = findViewById(R.id.linear726);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		button195 = findViewById(R.id.button195);
		linear728 = findViewById(R.id.linear728);
		linear707 = findViewById(R.id.linear707);
		textview1221 = findViewById(R.id.textview1221);
		textview583 = findViewById(R.id.textview583);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		edittext137 = findViewById(R.id.edittext137);
		textview845 = findViewById(R.id.textview845);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		button29 = findViewById(R.id.button29);
		textview809 = findViewById(R.id.textview809);
		linear389 = findViewById(R.id.linear389);
		hscroll58 = findViewById(R.id.hscroll58);
		linear56 = findViewById(R.id.linear56);
		hscroll33 = findViewById(R.id.hscroll33);
		linear162 = findViewById(R.id.linear162);
		hscroll37 = findViewById(R.id.hscroll37);
		linear164 = findViewById(R.id.linear164);
		linear194 = findViewById(R.id.linear194);
		textview666 = findViewById(R.id.textview666);
		textview667 = findViewById(R.id.textview667);
		linear188 = findViewById(R.id.linear188);
		hscroll57 = findViewById(R.id.hscroll57);
		linear13 = findViewById(R.id.linear13);
		textview477 = findViewById(R.id.textview477);
		add_dynamic_hole_linear = findViewById(R.id.add_dynamic_hole_linear);
		linear722 = findViewById(R.id.linear722);
		add_dynamic_hole = findViewById(R.id.add_dynamic_hole);
		hscroll56 = findViewById(R.id.hscroll56);
		textview55 = findViewById(R.id.textview55);
		linear183 = findViewById(R.id.linear183);
		textview18 = findViewById(R.id.textview18);
		edittext7 = findViewById(R.id.edittext7);
		textview17 = findViewById(R.id.textview17);
		textview16 = findViewById(R.id.textview16);
		edittext6 = findViewById(R.id.edittext6);
		textview10 = findViewById(R.id.textview10);
		textview446 = findViewById(R.id.textview446);
		edittext1 = findViewById(R.id.edittext1);
		textview81 = findViewById(R.id.textview81);
		textview5 = findViewById(R.id.textview5);
		textview448 = findViewById(R.id.textview448);
		edittext2 = findViewById(R.id.edittext2);
		textview422 = findViewById(R.id.textview422);
		textview11 = findViewById(R.id.textview11);
		edittext3 = findViewById(R.id.edittext3);
		textview426 = findViewById(R.id.textview426);
		textview7 = findViewById(R.id.textview7);
		edittext444 = findViewById(R.id.edittext444);
		button1 = findViewById(R.id.button1);
		textview510 = findViewById(R.id.textview510);
		edittext4 = findViewById(R.id.edittext4);
		textview508 = findViewById(R.id.textview508);
		textview509 = findViewById(R.id.textview509);
		textview449 = findViewById(R.id.textview449);
		edittext5 = findViewById(R.id.edittext5);
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		textview705 = findViewById(R.id.textview705);
		edittext16 = findViewById(R.id.edittext16);
		textview706 = findViewById(R.id.textview706);
		textview707 = findViewById(R.id.textview707);
		textview488 = findViewById(R.id.textview488);
		edittext17 = findViewById(R.id.edittext17);
		textview489 = findViewById(R.id.textview489);
		textview487 = findViewById(R.id.textview487);
		textview708 = findViewById(R.id.textview708);
		edittext18 = findViewById(R.id.edittext18);
		textview532 = findViewById(R.id.textview532);
		textview533 = findViewById(R.id.textview533);
		textview601 = findViewById(R.id.textview601);
		edittext19 = findViewById(R.id.edittext19);
		textview602 = findViewById(R.id.textview602);
		textview603 = findViewById(R.id.textview603);
		linear713 = findViewById(R.id.linear713);
		textview103 = findViewById(R.id.textview103);
		hscroll30 = findViewById(R.id.hscroll30);
		linear93 = findViewById(R.id.linear93);
		textview530 = findViewById(R.id.textview530);
		textview531 = findViewById(R.id.textview531);
		linear729 = findViewById(R.id.linear729);
		imageview36 = findViewById(R.id.imageview36);
		linear720 = findViewById(R.id.linear720);
		textview1336 = findViewById(R.id.textview1336);
		textview466 = findViewById(R.id.textview466);
		edittext38 = findViewById(R.id.edittext38);
		textview276 = findViewById(R.id.textview276);
		textview277 = findViewById(R.id.textview277);
		textview292 = findViewById(R.id.textview292);
		textview291 = findViewById(R.id.textview291);
		linear95 = findViewById(R.id.linear95);
		textview473 = findViewById(R.id.textview473);
		edittext42 = findViewById(R.id.edittext42);
		
		add_dynamic_wall.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_dynamic_view();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear57.setVisibility(View.VISIBLE);
					edittext38.setText("");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button195.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/f3EJravhcg8"));
				startActivity(price);
			}
		});
		
		button29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		add_dynamic_hole.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_dynamic_hole_in_wall();
					linear722.setVisibility(View.VISIBLE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext6.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 3)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext7.setText("");
				}
				else {
					edittext7.setText(_charSeq);
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
				edittext4.setText(String.valueOf(00.00));
				edittext5.setText(String.valueOf(00.00));
				edittext4.setTextColor(0xFFE91E63);
				edittext5.setTextColor(0xFFE91E63);
				textview666.setVisibility(View.GONE);
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
				textview667.setVisibility(View.GONE);
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
		
		textview7.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* عدد الأسقف من نفس النموذج\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ سقف \"");
				return true;
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
						edittext3.setText(String.valueOf(1));
					}
					edittext4.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext2.getText().toString())));
					edittext5.setText(String.valueOf((Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext2.getText().toString())) * Double.parseDouble(edittext3.getText().toString())));
					edittext4.setTextColor(0xFF000000);
					edittext5.setTextColor(0xFF000000);
					edittext444.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext2.getText().toString())));
					edittext444.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext5.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (linear722.getVisibility() == View.VISIBLE) {
					if (Double.parseDouble(_charSeq) == 00.00d) {
						edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
						textview55.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(_charSeq)) && (Double.parseDouble(_charSeq) < Double.parseDouble(edittext16.getText().toString()))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مسطح كل الفتحات أكبر من اجمالي مسطح الحوائط وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
							edittext17.setTextColor(0xFFE91E63);
							textview55.setVisibility(View.VISIBLE);
						}
						else {
							edittext17.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext16.getText().toString())));
							edittext17.setTextColor(0xFF000000);
							textview55.setVisibility(View.GONE);
						}
					}
				}
				else {
					edittext17.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext16.getText().toString())));
					edittext17.setTextColor(0xFF000000);
					textview55.setVisibility(View.GONE);
				}
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
				if (Double.parseDouble(_charSeq) == 0) {
					linear722.setVisibility(View.GONE);
					textview55.setVisibility(View.GONE);
					edittext17.setText(String.valueOf(Double.parseDouble(edittext5.getText().toString()) - Double.parseDouble(_charSeq)));
				}
				else {
					linear722.setVisibility(View.VISIBLE);
					if (Double.parseDouble(edittext5.getText().toString()) == 00.00d) {
						edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
						textview55.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(edittext5.getText().toString())) && (Double.parseDouble(edittext5.getText().toString()) < Double.parseDouble(_charSeq))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مسطح كل الفتحات أكبر من اجمالي مسطح الحوائط وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
							edittext17.setTextColor(0xFFE91E63);
							textview55.setVisibility(View.VISIBLE);
						}
						else {
							edittext17.setText(String.valueOf(Double.parseDouble(edittext5.getText().toString()) - Double.parseDouble(_charSeq)));
							edittext17.setTextColor(0xFF000000);
							textview55.setVisibility(View.GONE);
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
		
		edittext17.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext19.setText(String.valueOf(Double.parseDouble(_charSeq) + Double.parseDouble(edittext18.getText().toString())));
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
				edittext19.setText(String.valueOf(Double.parseDouble(edittext17.getText().toString()) + Double.parseDouble(_charSeq)));
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
				if ((edittext38.getText().toString().equals("") || edittext38.getText().toString().equals(".")) || (edittext38.getText().toString().equals("-") || (Double.parseDouble(edittext38.getText().toString()) < 0))) {
					edittext42.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext42.setText(String.valueOf(Double.parseDouble(edittext38.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear57.setVisibility(View.GONE);
				edittext38.setText("");
			}
		});
		
		edittext38.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext38.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext42.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext42.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext19.getText().toString())));
				}
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
		linear722.setVisibility(View.GONE);
		linear120.setVisibility(View.GONE);
		textview55.setVisibility(View.GONE);
		linear57.setVisibility(View.GONE);
		
		{
		}
		textview666.setVisibility(View.GONE);
		textview667.setVisibility(View.GONE);
		/*
البعد الموازي
*/
		edittext444.setVisibility(View.GONE);
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
	public void _dynamic_view() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_wall_linear = (LinearLayout) inflater.inflate(R.layout.toipcc_d_wall_plastering, null, false);
		add_dynamic_wall_linear.addView(dynamic_wall_linear);
		/*
تعريف الدينامك
*/
		final TextView d_textview1 = dynamic_wall_linear.findViewById(R.id.d_textview1);
		final TextView d_textview2 = dynamic_wall_linear.findViewById(R.id.d_textview2);
		final TextView d_textview3 = dynamic_wall_linear.findViewById(R.id.d_textview3);
		final TextView d_textview4 = dynamic_wall_linear.findViewById(R.id.d_textview4);
		final TextView d_textview5 = dynamic_wall_linear.findViewById(R.id.d_textview5);
		final TextView d_textview6 = dynamic_wall_linear.findViewById(R.id.d_textview6);
		final TextView d_textview7 = dynamic_wall_linear.findViewById(R.id.d_textview7);
		final TextView d_textview511 = dynamic_wall_linear.findViewById(R.id.d_textview511);
		final TextView d_textview8 = dynamic_wall_linear.findViewById(R.id.d_textview8);
		final TextView d_textview9 = dynamic_wall_linear.findViewById(R.id.d_textview9);
		final EditText d_edittext1 = dynamic_wall_linear.findViewById(R.id.d_edittext1);
		d_edittext1.setSingleLine(true);
		d_edittext1.setFocusableInTouchMode(true);
		final EditText d_edittext2 = dynamic_wall_linear.findViewById(R.id.d_edittext2);
		d_edittext2.setSingleLine(true);
		d_edittext2.setFocusableInTouchMode(true);
		final EditText d_edittext3 = dynamic_wall_linear.findViewById(R.id.d_edittext3);
		d_edittext3.setSingleLine(true);
		d_edittext3.setFocusableInTouchMode(true);
		final EditText d_edittext4 = dynamic_wall_linear.findViewById(R.id.d_edittext4);
		d_edittext4.setSingleLine(true);
		d_edittext4.setFocusableInTouchMode(true);
		final EditText d_edittext5 = dynamic_wall_linear.findViewById(R.id.d_edittext5);
		d_edittext5.setSingleLine(true);
		d_edittext5.setFocusableInTouchMode(true);
		final EditText d_edittext6 = dynamic_wall_linear.findViewById(R.id.d_edittext6);
		d_edittext6.setSingleLine(true);
		d_edittext6.setFocusableInTouchMode(true);
		final EditText d_edittext7 = dynamic_wall_linear.findViewById(R.id.d_edittext7);
		d_edittext7.setSingleLine(true);
		d_edittext7.setFocusableInTouchMode(true);
		final EditText d_edittext17 = dynamic_wall_linear.findViewById(R.id.d_edittext17);
		d_edittext17.setSingleLine(true);
		d_edittext17.setFocusableInTouchMode(true);
		final LinearLayout d_add_dynamic_hole_linear = dynamic_wall_linear.findViewById(R.id.d_add_dynamic_hole_linear);
		final Button d_button1 = dynamic_wall_linear.findViewById(R.id.d_button1);
		final Button d_add_dynamic_hole = dynamic_wall_linear.findViewById(R.id.d_add_dynamic_hole);
		final ImageView d_close_wall = dynamic_wall_linear.findViewById(R.id.d_close_wall);
		/*
اخفاء الجزء الخاص بعرض الحائط والمستخدم ف المباني
*/
		final TextView d_textview14 = dynamic_wall_linear.findViewById(R.id.d_textview14);
		final LinearLayout d_linear161 = dynamic_wall_linear.findViewById(R.id.d_linear161);
		final TextView d_textview11 = dynamic_wall_linear.findViewById(R.id.d_textview11);
		final EditText d_edittext22 = dynamic_wall_linear.findViewById(R.id.d_edittext22);
		d_edittext22.setSingleLine(true);
		d_edittext22.setFocusableInTouchMode(true);
		d_textview14.setVisibility(View.GONE);
		d_linear161.setVisibility(View.GONE);
		d_textview11.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* عرض الحائط أو سمك الحائط ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.١٢ م \"");
				return true;
			}
		});
		/*
تعريفات العرض او السمك للفتحة في حالة الحائط شبه منحرف اي يوجد عرضين للحائط" عرض علوى وعرض سفلي "
*/
		final LinearLayout d_linear33 = dynamic_wall_linear.findViewById(R.id.d_linear33);
		final EditText d_edittext36 = dynamic_wall_linear.findViewById(R.id.d_edittext36);
		d_edittext36.setSingleLine(true);
		d_edittext36.setFocusableInTouchMode(true);
		final EditText d_edittext35 = dynamic_wall_linear.findViewById(R.id.d_edittext35);
		d_edittext35.setSingleLine(true);
		d_edittext35.setFocusableInTouchMode(true);
		final EditText d_edittext32 = dynamic_wall_linear.findViewById(R.id.d_edittext32);
		d_edittext32.setSingleLine(true);
		d_edittext32.setFocusableInTouchMode(true);
		final TextView d_textview555 = dynamic_wall_linear.findViewById(R.id.d_textview555);
		final TextView d_textview556 = dynamic_wall_linear.findViewById(R.id.d_textview556);
		d_linear33.setVisibility(View.GONE);
		d_textview555.setVisibility(View.GONE);
		d_textview556.setVisibility(View.GONE);
		/*
للمقارنة
*/
		final EditText d_edittext444 = dynamic_wall_linear.findViewById(R.id.d_edittext444);
		d_edittext444.setSingleLine(true);
		d_edittext444.setFocusableInTouchMode(true);
		d_edittext444.setVisibility(View.GONE);
		/*
اجمالي مكعب الحوائط
*/
		final TextView d_textview15 = dynamic_wall_linear.findViewById(R.id.d_textview15);
		final LinearLayout d_linear758 = dynamic_wall_linear.findViewById(R.id.d_linear758);
		final EditText d_edittext20 = dynamic_wall_linear.findViewById(R.id.d_edittext20);
		d_edittext20.setSingleLine(true);
		d_edittext20.setFocusableInTouchMode(true);
		d_textview15.setVisibility(View.GONE);
		d_linear758.setVisibility(View.GONE);
		/*
أخفاء linear اجمالي الفتحات
*/
		/*
مسطح اجمالي الفتحات
*/
		final EditText d_edittext16 = dynamic_wall_linear.findViewById(R.id.d_edittext16);
		d_edittext16.setSingleLine(true);
		d_edittext16.setFocusableInTouchMode(true);
		final LinearLayout d_linear722 = dynamic_wall_linear.findViewById(R.id.d_linear722);
		d_linear722.setVisibility(View.GONE);
		/*
اجمالي مكعب الفتحات
*/
		final EditText d_edittext15 = dynamic_wall_linear.findViewById(R.id.d_edittext15);
		d_edittext15.setSingleLine(true);
		d_edittext15.setFocusableInTouchMode(true);
		final LinearLayout d_linear74 = dynamic_wall_linear.findViewById(R.id.d_linear74);
		d_linear74.setVisibility(View.GONE);
		/*
التعليقات علي اجمالي الكميات
*/
		final TextView d_textview55 = dynamic_wall_linear.findViewById(R.id.d_textview55);
		final TextView d_textview56 = dynamic_wall_linear.findViewById(R.id.d_textview56);
		d_textview55.setVisibility(View.GONE);
		d_textview56.setVisibility(View.GONE);
		d_textview55.setText("المسطح الأجمالي لدهانات جميع الأسقف من هذا النموذج أقل من المسطح الاجمالى لجميع الفتحات");
		/*
التعليقات علي ابعاد الحائط
*/
		final TextView d_textview666 = dynamic_wall_linear.findViewById(R.id.d_textview666);
		final TextView d_textview667 = dynamic_wall_linear.findViewById(R.id.d_textview667);
		final TextView d_textview668 = dynamic_wall_linear.findViewById(R.id.d_textview668);
		d_textview666.setVisibility(View.GONE);
		d_textview667.setVisibility(View.GONE);
		d_textview668.setVisibility(View.GONE);
		d_textview666.setText("من فضلك أعد مراجعة طول السقف حيث ان طول السقف أقل من طول الفتحة وهذا غير منطقي وغير هندسي");
		d_textview667.setText("من فضلك أعد مراجعة عرض السقف حيث ان عرض السقف أقل من عرض الفتحة وهذا غير منطقي وغير هندسي");
		/*
ترقيم الفتحات
*/
		d_edittext6.setText(String.valueOf((long)(add_dynamic_wall_linear.getChildCount() + 1)));
		d_edittext7.setText(String.valueOf((long)(add_dynamic_wall_linear.getChildCount() + 1)));
		d_edittext6.addTextChangedListener(new TextWatcher() { 	
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
					d_edittext7.setText("");
				}
				else {
					d_edittext7.setText(String.valueOf((long)(Double.parseDouble(s.toString()))));
				}
			} });
		/*
التعليقات والتعريفات للابعاد الخرسانيه
*/
		d_textview1.setText("السقف رقم :");
		d_textview2.setText("سقف");
		d_textview3.setText("طول السقف ( م )");
		d_textview4.setText("عرض السقف ( م )");
		d_textview5.setText("* عدد الاسقف من نفس النموزج");
		d_textview6.setText("مسطح الدهانات للسقف الواحد من هذا النموذج بدون خصم الفتحات ( م٢ )");
		d_textview7.setText("اجمالي مسطحات الدهانات لجميع الأسقف من هذا النموذج بدون خصم الفتحات ( م٢ )");
		d_textview511.setText("م٢");
		d_textview9.setText("المسطح الأجمالي لدهانات جميع الأسقف من هذا النموذج بعد خصم الفتحات ( م٢ )");
		d_textview5.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* عدد الاسقف من نفس النموزج\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ سقف \"");
				return true;
			}
		});
		/*
ثالثآ : أوامر المربعات أو الناتج أو كمية العنصر الواحد
*/
		d_edittext1.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String d_edittext1nn = _param1.toString();
								
d_edittext1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				d_edittext4.setText(String.valueOf(00.00));
				d_edittext5.setText(String.valueOf(00.00));
				d_edittext4.setTextColor(0xFFE91E63);
				d_edittext5.setTextColor(0xFFE91E63);
				d_textview666.setVisibility(View.GONE);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		d_edittext2.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String d_edittext2nn = _param1.toString();
								
d_edittext2.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				d_edittext4.setText(String.valueOf(00.00));
				d_edittext5.setText(String.valueOf(00.00));
				d_edittext4.setTextColor(0xFFE91E63);
				d_edittext5.setTextColor(0xFFE91E63);
				d_textview667.setVisibility(View.GONE);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		d_edittext3.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String d_edittext3nn = _param1.toString();
								
d_edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				d_edittext5.setText(String.valueOf(00.00));
				d_edittext5.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		d_button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((d_edittext1.getText().toString().equals("") || d_edittext1.getText().toString().equals(".")) || (d_edittext1.getText().toString().equals("-") || (Double.parseDouble(d_edittext1.getText().toString()) < 0))) || ((d_edittext2.getText().toString().equals("") || d_edittext2.getText().toString().equals(".")) || (d_edittext2.getText().toString().equals("-") || (Double.parseDouble(d_edittext2.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((d_edittext3.getText().toString().equals("") || d_edittext3.getText().toString().equals(".")) || (d_edittext3.getText().toString().equals("-") || (Double.parseDouble(d_edittext3.getText().toString()) < 0))) {
						d_edittext3.setText(String.valueOf(1));
					}
					d_edittext4.setText(String.valueOf(Double.parseDouble(d_edittext1.getText().toString()) * Double.parseDouble(d_edittext2.getText().toString())));
					d_edittext5.setText(String.valueOf((Double.parseDouble(d_edittext1.getText().toString()) * Double.parseDouble(d_edittext2.getText().toString())) * Double.parseDouble(d_edittext3.getText().toString())));
					d_edittext4.setTextColor(0xFF000000);
					d_edittext5.setTextColor(0xFF000000);
					d_edittext444.setText(String.valueOf(Double.parseDouble(d_edittext1.getText().toString()) * Double.parseDouble(d_edittext2.getText().toString())));
					d_edittext444.setTextColor(0xFF000000);
				}
			}
		});
		d_edittext5.addTextChangedListener(new TextWatcher() { 	
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
					
					
				d_edittext5.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (d_linear722.getVisibility() == View.VISIBLE) {
					if (Double.parseDouble(s.toString()) == 00.00d) {
						d_edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
						d_textview55.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(s.toString())) && (Double.parseDouble(s.toString()) < Double.parseDouble(d_edittext16.getText().toString()))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مسطح كل الفتحات أكبر من اجمالي مسطح الأسقف وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							d_edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
							d_edittext17.setTextColor(0xFFE91E63);
							d_textview55.setVisibility(View.VISIBLE);
						}
						else {
							d_edittext17.setText(String.valueOf(Double.parseDouble(s.toString()) - Double.parseDouble(d_edittext16.getText().toString())));
							d_edittext17.setTextColor(0xFF000000);
							d_textview55.setVisibility(View.GONE);
						}
					}
				}
				else {
					d_edittext17.setText(String.valueOf(Double.parseDouble(s.toString()) - Double.parseDouble(d_edittext16.getText().toString())));
					d_edittext17.setTextColor(0xFF000000);
					d_textview55.setVisibility(View.GONE);
				}
			} });
		d_add_dynamic_hole.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				/*
اظهار linear اجمالي الفتحات
*/
				d_linear722.setVisibility(View.VISIBLE);
				d_linear74.setVisibility(View.GONE);
				/*
دينامك الفتحات
*/
				LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
				final LinearLayout dynamic_hole_linear2 = (LinearLayout) inflater.inflate(R.layout.toipcc_d_hole_plastering, null, false);
				d_add_dynamic_hole_linear.addView(dynamic_hole_linear2);
				/*
تعريف الدينامك
*/
				final TextView textview1d = dynamic_hole_linear2.findViewById(R.id.textview1d);
				final TextView textview2d = dynamic_hole_linear2.findViewById(R.id.textview2d);
				final TextView textview3d = dynamic_hole_linear2.findViewById(R.id.textview3d);
				final TextView textview4d = dynamic_hole_linear2.findViewById(R.id.textview4d);
				final TextView textview6d = dynamic_hole_linear2.findViewById(R.id.textview6d);
				final TextView textview7d = dynamic_hole_linear2.findViewById(R.id.textview7d);
				final TextView textview9d = dynamic_hole_linear2.findViewById(R.id.textview9d);
				final TextView textview10d = dynamic_hole_linear2.findViewById(R.id.textview10d);
				final TextView textview20d = dynamic_hole_linear2.findViewById(R.id.textview20d);
				final TextView textview21d = dynamic_hole_linear2.findViewById(R.id.textview21d);
				final TextView textview22d = dynamic_hole_linear2.findViewById(R.id.textview22d);
				final TextView textview23d = dynamic_hole_linear2.findViewById(R.id.textview23d);
				final EditText edittext6d = dynamic_hole_linear2.findViewById(R.id.edittext6d);
				edittext6d.setSingleLine(true);
				edittext6d.setFocusableInTouchMode(true);
				final EditText edittext7d = dynamic_hole_linear2.findViewById(R.id.edittext7d);
				edittext7d.setSingleLine(true);
				edittext7d.setFocusableInTouchMode(true);
				final EditText edittext8d = dynamic_hole_linear2.findViewById(R.id.edittext8d);
				edittext8d.setSingleLine(true);
				edittext8d.setFocusableInTouchMode(true);
				final EditText edittext9d = dynamic_hole_linear2.findViewById(R.id.edittext9d);
				edittext9d.setSingleLine(true);
				edittext9d.setFocusableInTouchMode(true);
				final EditText edittext11d = dynamic_hole_linear2.findViewById(R.id.edittext11d);
				edittext11d.setSingleLine(true);
				edittext11d.setFocusableInTouchMode(true);
				final EditText edittext12d = dynamic_hole_linear2.findViewById(R.id.edittext12d);
				edittext12d.setSingleLine(true);
				edittext12d.setFocusableInTouchMode(true);
				final EditText edittext14d = dynamic_hole_linear2.findViewById(R.id.edittext14d);
				edittext14d.setSingleLine(true);
				edittext14d.setFocusableInTouchMode(true);
				final EditText edittext15d = dynamic_hole_linear2.findViewById(R.id.edittext15d);
				edittext15d.setSingleLine(true);
				edittext15d.setFocusableInTouchMode(true);
				final Button button2d = dynamic_hole_linear2.findViewById(R.id.button2d);
				final ImageView close_hole_d = dynamic_hole_linear2.findViewById(R.id.close_hole_d);
				/*
الأطوال الموازية
*/
				final EditText edittext8dd = dynamic_hole_linear2.findViewById(R.id.edittext8dd);
				edittext8dd.setSingleLine(true);
				edittext8dd.setFocusableInTouchMode(true);
				final EditText edittext9dd = dynamic_hole_linear2.findViewById(R.id.edittext9dd);
				edittext9dd.setSingleLine(true);
				edittext9dd.setFocusableInTouchMode(true);
				edittext8dd.setVisibility(View.GONE);
				edittext9dd.setVisibility(View.GONE);
				/*
تعريفات العرض او السمك للفتحة
*/
				final LinearLayout linear722d = dynamic_hole_linear2.findViewById(R.id.linear722d);
				final TextView textview11d = dynamic_hole_linear2.findViewById(R.id.textview11d);
				final EditText edittext5d = dynamic_hole_linear2.findViewById(R.id.edittext5d);
				edittext5d.setSingleLine(true);
				edittext5d.setFocusableInTouchMode(true);
				linear722d.setVisibility(View.GONE);
				/*
تعريفات العرض الموازي او السمك الموازي للفتحة
*/
				final EditText edittext5dd = dynamic_hole_linear2.findViewById(R.id.edittext5dd);
				edittext5dd.setSingleLine(true);
				edittext5dd.setFocusableInTouchMode(true);
				edittext5dd.setVisibility(View.GONE);
				/*
تعريفات العرض او السمك للفتحة في حالة الحائط شبه منحرف اي يوجد عرضين للحائط" عرض علوى وعرض سفلي "
*/
				final LinearLayout linear33d = dynamic_hole_linear2.findViewById(R.id.linear33d);
				final EditText edittext36d = dynamic_hole_linear2.findViewById(R.id.edittext36d);
				edittext36d.setSingleLine(true);
				edittext36d.setFocusableInTouchMode(true);
				final EditText edittext35d = dynamic_hole_linear2.findViewById(R.id.edittext35d);
				edittext35d.setSingleLine(true);
				edittext35d.setFocusableInTouchMode(true);
				final EditText edittext32d = dynamic_hole_linear2.findViewById(R.id.edittext32d);
				edittext32d.setSingleLine(true);
				edittext32d.setFocusableInTouchMode(true);
				final TextView textview555d = dynamic_hole_linear2.findViewById(R.id.textview555d);
				final TextView textview556d = dynamic_hole_linear2.findViewById(R.id.textview556d);
				linear33d.setVisibility(View.GONE);
				textview555d.setVisibility(View.GONE);
				textview556d.setVisibility(View.GONE);
				/*
تعريفات العرض الموازي او السمك الموازي للفتحة في حالة الحائط شبه منحرف اي يوجد عرضين للحائط" عرض علوى موازي وعرض سفلي موازي "
*/
				final EditText edittext36dd = dynamic_hole_linear2.findViewById(R.id.edittext36dd);
				edittext36dd.setSingleLine(true);
				edittext36dd.setFocusableInTouchMode(true);
				final EditText edittext35dd = dynamic_hole_linear2.findViewById(R.id.edittext35dd);
				edittext35dd.setSingleLine(true);
				edittext35dd.setFocusableInTouchMode(true);
				edittext36dd.setVisibility(View.GONE);
				edittext35dd.setVisibility(View.GONE);
				/*
تعريفات نسبة احتساب الفتحة
*/
				final TextView textview5d = dynamic_hole_linear2.findViewById(R.id.textview5d);
				final EditText edittext10d = dynamic_hole_linear2.findViewById(R.id.edittext10d);
				edittext10d.setSingleLine(true);
				edittext10d.setFocusableInTouchMode(true);
				final LinearLayout linear152d = dynamic_hole_linear2.findViewById(R.id.linear152d);
				linear152d.setVisibility(View.GONE);
				/*
تعريفات الكمية بعد الضرب في نسبة احتساب الفتحة
*/
				final TextView textview8d = dynamic_hole_linear2.findViewById(R.id.textview8d);
				final EditText edittext13d = dynamic_hole_linear2.findViewById(R.id.edittext13d);
				edittext13d.setSingleLine(true);
				edittext13d.setFocusableInTouchMode(true);
				final LinearLayout linear721d = dynamic_hole_linear2.findViewById(R.id.linear721d);
				linear721d.setVisibility(View.GONE);
				/*
التعليقات المساعدة
*/
				final TextView textview666ad = dynamic_hole_linear2.findViewById(R.id.textview666ad);
				final TextView textview667bd = dynamic_hole_linear2.findViewById(R.id.textview667bd);
				final TextView textview668cd = dynamic_hole_linear2.findViewById(R.id.textview668cd);
				final TextView textview669dd = dynamic_hole_linear2.findViewById(R.id.textview669dd);
				textview666ad.setVisibility(View.GONE);
				textview667bd.setVisibility(View.GONE);
				textview668cd.setVisibility(View.GONE);
				textview669dd.setVisibility(View.GONE);
				textview666ad.setText("من فضلك أعد مراجعة طول الفتحة حيث ان طول الفتحة أكبر من طول السقف وهذا غير منطقي وغير هندسي");
				textview667bd.setText("من فضلك أعد مراجعة عرض الفتحة حيث ان عرض الفتحة أكبر من عرض السقف وهذا غير منطقي وغير هندسي");
				textview668cd.setText("من فضلك أعد مراجعة ارتفاع الفتحة حيث ان ارتفاع الفتحة أكبر من ارتفاع السقف وهذا غير منطقي وغير هندسي");
				textview669dd.setText("من فضلك راجع الأبعاد وعدد الفتحات حيث ان اجمالي مسطح الفتحات في السقف الواحد أكبر من مسطح السقف");
				/*
ترقيم الفتحات
*/
				edittext6d.setText(String.valueOf((long)(d_add_dynamic_hole_linear.getChildCount())));
				/*
التعليقات والتعريفات للابعاد الخرسانيه
*/
				textview1d.setText("فتحة رقم :");
				textview2d.setText("نموذج الفتحة");
				textview3d.setText("طول الفتحة ( م )");
				textview4d.setText("عرض الفتحة ( م )");
				textview11d.setText("* عرض أو سمك الفتحة ( م )");
				textview5d.setText("* نسبة احتساب الفتحة");
				textview6d.setText("* عدد الفتحات من نفس النموذج والأبعاد بالسقف الواحد");
				textview7d.setText("مسطح الفتحة الواحدة ( م٢ )");
				textview20d.setText("م٢");
				textview8d.setText("مسطح نموذج الفتحة بعد الضرب ف نسبة احتساب الفتحة ( م٢ )");
				textview21d.setText("م٢");
				textview9d.setText("مسطح الفتحات من هذا النموذج بالسقف الواحد ( م٢ )");
				textview22d.setText("م٢");
				textview10d.setText("مسطح الفتحات من هذا النموذج بكل الأسقف التي نفس النموذج ( م٢ )");
				textview23d.setText("م٢");
				edittext5d.setBackgroundColor(0xFFC8E6C9);
				textview11d.setOnLongClickListener(new View.OnLongClickListener() {
					@Override
					public boolean onLongClick(View _view) {
						SketchwareUtil.showMessage(getApplicationContext(), "* عرض أو سمك الفتحة ( م )\n( لا يمكن ان يزيد عن سمك الحائط )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بنفس قيمة سمك الحائط \"");
						return true;
					}
				});
				textview5d.setOnLongClickListener(new View.OnLongClickListener() {
					@Override
					public boolean onLongClick(View _view) {
						SketchwareUtil.showMessage(getApplicationContext(), "* نسبة احتساب الفتحة\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ \"");
						return true;
					}
				});
				textview6d.setOnLongClickListener(new View.OnLongClickListener() {
					@Override
					public boolean onLongClick(View _view) {
						SketchwareUtil.showMessage(getApplicationContext(), "* عدد الفتحات من نفس النموذج والأبعاد بالسقف الواحد\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ فتحة \"");
						return true;
					}
				});
				/*
ثالثآ : أوامر المربعات أو الناتج أو كمية العنصر الواحد
*/
				d_edittext3.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String d_edittext3nn = _param1.toString();
										
d_edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
						edittext15d.setText(String.valueOf(00.00));
						edittext15d.setTextColor(0xFFE91E63);
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
						edittext12d.setText(String.valueOf(00.00));
						edittext13d.setText(String.valueOf(00.00));
						edittext14d.setText(String.valueOf(00.00));
						edittext15d.setText(String.valueOf(00.00));
						edittext12d.setTextColor(0xFFE91E63);
						edittext13d.setTextColor(0xFFE91E63);
						edittext14d.setTextColor(0xFFE91E63);
						edittext15d.setTextColor(0xFFE91E63);
						textview666ad.setVisibility(View.GONE);
						edittext8dd.setText(String.valueOf(00.00));
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
						edittext12d.setText(String.valueOf(00.00));
						edittext13d.setText(String.valueOf(00.00));
						edittext14d.setText(String.valueOf(00.00));
						edittext15d.setText(String.valueOf(00.00));
						edittext12d.setTextColor(0xFFE91E63);
						edittext13d.setTextColor(0xFFE91E63);
						edittext14d.setTextColor(0xFFE91E63);
						edittext15d.setTextColor(0xFFE91E63);
						textview667bd.setVisibility(View.GONE);
						edittext9dd.setText(String.valueOf(00.00));
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
						edittext13d.setText(String.valueOf(00.00));
						edittext13d.setTextColor(0xFFE91E63);
						edittext14d.setText(String.valueOf(00.00));
						edittext15d.setText(String.valueOf(00.00));
						edittext14d.setTextColor(0xFFE91E63);
						edittext15d.setTextColor(0xFFE91E63);
						textview669dd.setVisibility(View.GONE);
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
						edittext14d.setText(String.valueOf(00.00));
						edittext15d.setText(String.valueOf(00.00));
						edittext14d.setTextColor(0xFFE91E63);
						edittext15d.setTextColor(0xFFE91E63);
						textview669dd.setVisibility(View.GONE);
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
						if ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0)))) || (((d_edittext1.getText().toString().equals("") || d_edittext1.getText().toString().equals(".")) || (d_edittext1.getText().toString().equals("-") || (Double.parseDouble(d_edittext1.getText().toString()) < 0))) || ((d_edittext2.getText().toString().equals("") || d_edittext2.getText().toString().equals(".")) || (d_edittext2.getText().toString().equals("-") || (Double.parseDouble(d_edittext2.getText().toString()) < 0))))) {
							SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
						}
						else {
							edittext8dd.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString())));
							edittext9dd.setText(String.valueOf(Double.parseDouble(edittext9d.getText().toString())));
							if ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) {
								edittext11d.setText(String.valueOf(1));
							}
							if (Double.parseDouble(edittext8d.getText().toString()) > Double.parseDouble(d_edittext1.getText().toString())) {
								textview666ad.setVisibility(View.VISIBLE);
								if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(d_edittext2.getText().toString())) {
									textview667bd.setVisibility(View.VISIBLE);
								}
								else {
									textview667bd.setVisibility(View.GONE);
								}
							}
							else {
								textview666ad.setVisibility(View.GONE);
								if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(d_edittext2.getText().toString())) {
									textview667bd.setVisibility(View.VISIBLE);
								}
								else {
									textview667bd.setVisibility(View.GONE);
									edittext12d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())));
									edittext12d.setTextColor(0xFF000000);
									if (((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * Double.parseDouble(edittext11d.getText().toString())) > (Double.parseDouble(d_edittext1.getText().toString()) * Double.parseDouble(d_edittext2.getText().toString()))) {
										textview669dd.setVisibility(View.VISIBLE);
									}
									else {
										textview669dd.setVisibility(View.GONE);
										if ((d_edittext3.getText().toString().equals("") || d_edittext3.getText().toString().equals(".")) || (d_edittext3.getText().toString().equals("-") || (Double.parseDouble(d_edittext3.getText().toString()) < 0))) {
											d_edittext3.setText(String.valueOf(1));
										}
										edittext14d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString()))));
										edittext15d.setText(String.valueOf((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * (Double.parseDouble(edittext11d.getText().toString()) * Double.parseDouble(d_edittext3.getText().toString()))));
										edittext14d.setTextColor(0xFF000000);
										edittext15d.setTextColor(0xFF000000);
									}
								}
							}
						}
					}
				});
				edittext12d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext14d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext15d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				/*
نهاية أوامر المربعات أو الناتج أو كمية العنصر الواحد
*/
				/*
المقارنات والأبعاد المناظرة
*/
				/*
إجمالي كميات الفتحات دينامك
*/
				/*
إجمالي المسطحات
*/
				edittext15d.addTextChangedListener(new TextWatcher() { 	
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
						 for(int i=0; i<d_add_dynamic_hole_linear.getChildCount(); ++i) { 
							 View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo1 =child.findViewById(R.id.edittext15d);
							temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
						}
						d_edittext16.setText(String.valueOf(temp1));
					} });
				/*
حذف فتحة
*/
				close_hole_d.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						/*
حذف فتحة
*/
						_removeView(dynamic_hole_linear2);
						/*
إجمالي كميات الفتحات الدينامك بعد عملية الحذف
*/
						/*
إجمالي المسطحات
*/
						temp1 = 0;
						 for(int i=0; i<d_add_dynamic_hole_linear.getChildCount(); ++i) { 
							 View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo1 =child.findViewById(R.id.edittext15d);
							temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
						}
						d_edittext16.setText(String.valueOf(temp1));
					}
				});
				/*
مقارنة الأبعاد في حالة تعديل ابعاد الحائط بعد تعديل أبعاد الفتحة
*/
				d_edittext1.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String d_edittext1nn = _param1.toString();
										
d_textview666.setVisibility(View.GONE);
						textview666ad.setVisibility(View.GONE);
								}
								
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										
								}
								
								@Override
								public void afterTextChanged(Editable _param1) {
										
								}
						});
				d_edittext2.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String d_edittext2nn = _param1.toString();
										
d_textview667.setVisibility(View.GONE);
						textview667bd.setVisibility(View.GONE);
								}
								
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										
								}
								
								@Override
								public void afterTextChanged(Editable _param1) {
										
								}
						});
				/*
المقارنة
*/
				d_edittext444.addTextChangedListener(new TextWatcher() { 	
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
							
							
						temp1a = 0;
						for (int i = 0; i < (int)(d_add_dynamic_hole_linear.getChildCount()); i++) {
							View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo1a =child.findViewById(R.id.edittext8dd);
							temp1a = Math.max(temp1a, Double.parseDouble(tempo1a.getText().toString()));
						}
						temp2b = 0;
						for (int i = 0; i < (int)(d_add_dynamic_hole_linear.getChildCount()); i++) {
							View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo2b =child.findViewById(R.id.edittext9dd);
							temp2b = Math.max(temp2b, Double.parseDouble(tempo2b.getText().toString()));
						}
						if (Double.parseDouble(d_edittext1.getText().toString()) < temp1a) {
							d_textview666.setVisibility(View.VISIBLE);
							d_edittext4.setText(String.valueOf(00.00));
							d_edittext4.setTextColor(0xFFE91E63);
							d_edittext5.setText(String.valueOf(00.00));
							d_edittext5.setTextColor(0xFFE91E63);
							if (Double.parseDouble(d_edittext2.getText().toString()) < temp2b) {
								d_textview667.setVisibility(View.VISIBLE);
							}
							else {
								d_textview667.setVisibility(View.GONE);
							}
						}
						else {
							d_textview666.setVisibility(View.GONE);
							if (Double.parseDouble(d_edittext2.getText().toString()) < temp2b) {
								d_textview667.setVisibility(View.VISIBLE);
								d_edittext4.setText(String.valueOf(00.00));
								d_edittext4.setTextColor(0xFFE91E63);
								d_edittext5.setText(String.valueOf(00.00));
								d_edittext5.setTextColor(0xFFE91E63);
							}
							else {
								d_textview667.setVisibility(View.GONE);
								d_edittext4.setText(String.valueOf(Double.parseDouble(d_edittext1.getText().toString()) * Double.parseDouble(d_edittext2.getText().toString())));
								d_edittext4.setTextColor(0xFF000000);
								d_edittext5.setText(String.valueOf(Double.parseDouble(d_edittext1.getText().toString()) * (Double.parseDouble(d_edittext2.getText().toString()) * Double.parseDouble(d_edittext3.getText().toString()))));
								d_edittext5.setTextColor(0xFF000000);
							}
						}
					} });
			}
		});
		d_edittext16.addTextChangedListener(new TextWatcher() { 	
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
					
					
				d_edittext16.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(s.toString()) == 0) {
					d_linear722.setVisibility(View.GONE);
					d_textview55.setVisibility(View.GONE);
					d_edittext17.setText(String.valueOf(Double.parseDouble(d_edittext5.getText().toString()) - Double.parseDouble(s.toString())));
				}
				else {
					d_linear722.setVisibility(View.VISIBLE);
					if (Double.parseDouble(d_edittext5.getText().toString()) == 00.00d) {
						d_edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
						d_textview55.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(d_edittext5.getText().toString())) && (Double.parseDouble(d_edittext5.getText().toString()) < Double.parseDouble(s.toString()))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مسطح كل الفتحات أكبر من اجمالي مسطح الأسقف وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							d_edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
							d_edittext17.setTextColor(0xFFE91E63);
							d_textview55.setVisibility(View.VISIBLE);
						}
						else {
							d_edittext17.setText(String.valueOf(Double.parseDouble(d_edittext5.getText().toString()) - Double.parseDouble(s.toString())));
							d_edittext17.setTextColor(0xFF000000);
							d_textview55.setVisibility(View.GONE);
						}
					}
				}
			} });
		/*
إجمالي كميات الدهانات دينامك م٢
*/
		d_edittext17.addTextChangedListener(new TextWatcher() { 	
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
					
					
				d_edittext17.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				temp = 0;
				 for(int i=0; i<add_dynamic_wall_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_wall_linear.getChildAt(i); 
					TextView tempo =child.findViewById(R.id.d_edittext17);
					temp = temp + Double.parseDouble(tempo.getText().toString());
				}
				edittext18.setText(String.valueOf(temp));
			} });
		/*
حذف دهانات سقف
*/
		d_close_wall.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_wall_linear);
				/*
إجمالي كميات الدهانات الدينامك بعد عملية الحذف م٢
*/
				temp = 0;
				 for(int i=0; i<add_dynamic_wall_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_wall_linear.getChildAt(i); 
					TextView tempo =child.findViewById(R.id.d_edittext17);
					temp = temp + Double.parseDouble(tempo.getText().toString());
				}
				edittext18.setText(String.valueOf(temp));
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
		PrintHelper printHelper = new PrintHelper(ToipccPaintssActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
	
	public void _dynamic_hole_in_wall() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_hole_linear = (LinearLayout) inflater.inflate(R.layout.toipcc_d_hole_plastering, null, false);
		add_dynamic_hole_linear.addView(dynamic_hole_linear);
		/*
تعريف الدينامك
*/
		final TextView textview1d = dynamic_hole_linear.findViewById(R.id.textview1d);
		final TextView textview2d = dynamic_hole_linear.findViewById(R.id.textview2d);
		final TextView textview3d = dynamic_hole_linear.findViewById(R.id.textview3d);
		final TextView textview4d = dynamic_hole_linear.findViewById(R.id.textview4d);
		final TextView textview6d = dynamic_hole_linear.findViewById(R.id.textview6d);
		final TextView textview7d = dynamic_hole_linear.findViewById(R.id.textview7d);
		final TextView textview9d = dynamic_hole_linear.findViewById(R.id.textview9d);
		final TextView textview10d = dynamic_hole_linear.findViewById(R.id.textview10d);
		final TextView textview20d = dynamic_hole_linear.findViewById(R.id.textview20d);
		final TextView textview21d = dynamic_hole_linear.findViewById(R.id.textview21d);
		final TextView textview22d = dynamic_hole_linear.findViewById(R.id.textview22d);
		final TextView textview23d = dynamic_hole_linear.findViewById(R.id.textview23d);
		final EditText edittext6d = dynamic_hole_linear.findViewById(R.id.edittext6d);
		edittext6d.setSingleLine(true);
		edittext6d.setFocusableInTouchMode(true);
		final EditText edittext7d = dynamic_hole_linear.findViewById(R.id.edittext7d);
		edittext7d.setSingleLine(true);
		edittext7d.setFocusableInTouchMode(true);
		final EditText edittext8d = dynamic_hole_linear.findViewById(R.id.edittext8d);
		edittext8d.setSingleLine(true);
		edittext8d.setFocusableInTouchMode(true);
		final EditText edittext9d = dynamic_hole_linear.findViewById(R.id.edittext9d);
		edittext9d.setSingleLine(true);
		edittext9d.setFocusableInTouchMode(true);
		final EditText edittext11d = dynamic_hole_linear.findViewById(R.id.edittext11d);
		edittext11d.setSingleLine(true);
		edittext11d.setFocusableInTouchMode(true);
		final EditText edittext12d = dynamic_hole_linear.findViewById(R.id.edittext12d);
		edittext12d.setSingleLine(true);
		edittext12d.setFocusableInTouchMode(true);
		final EditText edittext14d = dynamic_hole_linear.findViewById(R.id.edittext14d);
		edittext14d.setSingleLine(true);
		edittext14d.setFocusableInTouchMode(true);
		final EditText edittext15d = dynamic_hole_linear.findViewById(R.id.edittext15d);
		edittext15d.setSingleLine(true);
		edittext15d.setFocusableInTouchMode(true);
		final Button button2d = dynamic_hole_linear.findViewById(R.id.button2d);
		final ImageView close_hole_d = dynamic_hole_linear.findViewById(R.id.close_hole_d);
		/*
الأطوال الموازية
*/
		final EditText edittext8dd = dynamic_hole_linear.findViewById(R.id.edittext8dd);
		edittext8dd.setSingleLine(true);
		edittext8dd.setFocusableInTouchMode(true);
		final EditText edittext9dd = dynamic_hole_linear.findViewById(R.id.edittext9dd);
		edittext9dd.setSingleLine(true);
		edittext9dd.setFocusableInTouchMode(true);
		edittext8dd.setVisibility(View.GONE);
		edittext9dd.setVisibility(View.GONE);
		/*
تعريفات العرض او السمك للفتحة
*/
		final LinearLayout linear722d = dynamic_hole_linear.findViewById(R.id.linear722d);
		final TextView textview11d = dynamic_hole_linear.findViewById(R.id.textview11d);
		final EditText edittext5d = dynamic_hole_linear.findViewById(R.id.edittext5d);
		edittext5d.setSingleLine(true);
		edittext5d.setFocusableInTouchMode(true);
		linear722d.setVisibility(View.GONE);
		/*
تعريفات العرض الموازي او السمك الموازي للفتحة
*/
		final EditText edittext5dd = dynamic_hole_linear.findViewById(R.id.edittext5dd);
		edittext5dd.setSingleLine(true);
		edittext5dd.setFocusableInTouchMode(true);
		edittext5dd.setVisibility(View.GONE);
		/*
تعريفات العرض او السمك للفتحة في حالة الحائط شبه منحرف اي يوجد عرضين للحائط" عرض علوى وعرض سفلي "
*/
		final LinearLayout linear33d = dynamic_hole_linear.findViewById(R.id.linear33d);
		final EditText edittext36d = dynamic_hole_linear.findViewById(R.id.edittext36d);
		edittext36d.setSingleLine(true);
		edittext36d.setFocusableInTouchMode(true);
		final EditText edittext35d = dynamic_hole_linear.findViewById(R.id.edittext35d);
		edittext35d.setSingleLine(true);
		edittext35d.setFocusableInTouchMode(true);
		final EditText edittext32d = dynamic_hole_linear.findViewById(R.id.edittext32d);
		edittext32d.setSingleLine(true);
		edittext32d.setFocusableInTouchMode(true);
		final TextView textview555d = dynamic_hole_linear.findViewById(R.id.textview555d);
		final TextView textview556d = dynamic_hole_linear.findViewById(R.id.textview556d);
		linear33d.setVisibility(View.GONE);
		textview555d.setVisibility(View.GONE);
		textview556d.setVisibility(View.GONE);
		/*
تعريفات العرض الموازي او السمك الموازي للفتحة في حالة الحائط شبه منحرف اي يوجد عرضين للحائط" عرض علوى موازي وعرض سفلي موازي "
*/
		final EditText edittext36dd = dynamic_hole_linear.findViewById(R.id.edittext36dd);
		edittext36dd.setSingleLine(true);
		edittext36dd.setFocusableInTouchMode(true);
		final EditText edittext35dd = dynamic_hole_linear.findViewById(R.id.edittext35dd);
		edittext35dd.setSingleLine(true);
		edittext35dd.setFocusableInTouchMode(true);
		edittext36dd.setVisibility(View.GONE);
		edittext35dd.setVisibility(View.GONE);
		/*
تعريفات نسبة احتساب الفتحة
*/
		final TextView textview5d = dynamic_hole_linear.findViewById(R.id.textview5d);
		final EditText edittext10d = dynamic_hole_linear.findViewById(R.id.edittext10d);
		edittext10d.setSingleLine(true);
		edittext10d.setFocusableInTouchMode(true);
		final LinearLayout linear152d = dynamic_hole_linear.findViewById(R.id.linear152d);
		linear152d.setVisibility(View.GONE);
		/*
تعريفات الكمية بعد الضرب في نسبة احتساب الفتحة
*/
		final TextView textview8d = dynamic_hole_linear.findViewById(R.id.textview8d);
		final EditText edittext13d = dynamic_hole_linear.findViewById(R.id.edittext13d);
		edittext13d.setSingleLine(true);
		edittext13d.setFocusableInTouchMode(true);
		final LinearLayout linear721d = dynamic_hole_linear.findViewById(R.id.linear721d);
		linear721d.setVisibility(View.GONE);
		/*
التعليقات المساعدة
*/
		final TextView textview666ad = dynamic_hole_linear.findViewById(R.id.textview666ad);
		final TextView textview667bd = dynamic_hole_linear.findViewById(R.id.textview667bd);
		final TextView textview668cd = dynamic_hole_linear.findViewById(R.id.textview668cd);
		final TextView textview669dd = dynamic_hole_linear.findViewById(R.id.textview669dd);
		textview666ad.setVisibility(View.GONE);
		textview667bd.setVisibility(View.GONE);
		textview668cd.setVisibility(View.GONE);
		textview669dd.setVisibility(View.GONE);
		textview666ad.setText("من فضلك أعد مراجعة طول الفتحة حيث ان طول الفتحة أكبر من طول السقف وهذا غير منطقي وغير هندسي");
		textview667bd.setText("من فضلك أعد مراجعة عرض الفتحة حيث ان عرض الفتحة أكبر من عرض السقف وهذا غير منطقي وغير هندسي");
		textview668cd.setText("من فضلك أعد مراجعة ارتفاع الفتحة حيث ان ارتفاع الفتحة أكبر من ارتفاع السقف وهذا غير منطقي وغير هندسي");
		textview669dd.setText("من فضلك راجع الأبعاد وعدد الفتحات حيث ان اجمالي مسطح الفتحات في السقف الواحد أكبر من مسطح السقف");
		/*
التعليقات والتعريفات للابعاد الخرسانيه
*/
		/*
ترقيم الفتحات
*/
		edittext6d.setText(String.valueOf((long)(add_dynamic_hole_linear.getChildCount())));
		/*
التعليقات والتعريفات للابعاد الخرسانيه
*/
		textview1d.setText("فتحة رقم :");
		textview2d.setText("نموذج الفتحة");
		textview3d.setText("طول الفتحة ( م )");
		textview4d.setText("عرض الفتحة ( م )");
		textview11d.setText("* عرض أو سمك الفتحة ( م )");
		textview5d.setText("* نسبة احتساب الفتحة");
		textview6d.setText("* عدد الفتحات من نفس النموذج والأبعاد بالسقف الواحد");
		textview7d.setText("مسطح الفتحة الواحدة ( م٢ )");
		textview20d.setText("م٢");
		textview8d.setText("مسطح نموذج الفتحة بعد الضرب ف نسبة احتساب الفتحة ( م٢ )");
		textview21d.setText("م٢");
		textview9d.setText("مسطح الفتحات من هذا النموذج بالسقف الواحد ( م٢ )");
		textview22d.setText("م٢");
		textview10d.setText("مسطح الفتحات من هذا النموذج بكل الأسقف التي نفس النموذج ( م٢ )");
		textview23d.setText("م٢");
		edittext5d.setBackgroundColor(0xFFC8E6C9);
		textview11d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* عرض أو سمك الفتحة ( م )\n( لا يمكن ان يزيد عن سمك الحائط )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بنفس قيمة سمك الحائط \"");
				return true;
			}
		});
		textview5d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة احتساب الفتحة\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ \"");
				return true;
			}
		});
		textview6d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* عدد الفتحات من نفس النموذج والأبعاد بالسقف الواحد\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ فتحة \"");
				return true;
			}
		});
		/*
ثالثآ : أوامر المربعات أو الناتج أو كمية العنصر الواحد
*/
		edittext3.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext3nn = _param1.toString();
								
edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext15d.setText(String.valueOf(00.00));
				edittext15d.setTextColor(0xFFE91E63);
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
				edittext12d.setText(String.valueOf(00.00));
				edittext13d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
				edittext14d.setText(String.valueOf(00.00));
				edittext15d.setText(String.valueOf(00.00));
				edittext12d.setTextColor(0xFFE91E63);
				edittext14d.setTextColor(0xFFE91E63);
				edittext15d.setTextColor(0xFFE91E63);
				textview666ad.setVisibility(View.GONE);
				edittext8dd.setText(String.valueOf(00.00));
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
				edittext12d.setText(String.valueOf(00.00));
				edittext13d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
				edittext14d.setText(String.valueOf(00.00));
				edittext15d.setText(String.valueOf(00.00));
				edittext12d.setTextColor(0xFFE91E63);
				edittext14d.setTextColor(0xFFE91E63);
				edittext15d.setTextColor(0xFFE91E63);
				textview667bd.setVisibility(View.GONE);
				edittext9dd.setText(String.valueOf(00.00));
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
								
edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext13d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
				edittext14d.setText(String.valueOf(00.00));
				edittext15d.setText(String.valueOf(00.00));
				edittext14d.setTextColor(0xFFE91E63);
				edittext15d.setTextColor(0xFFE91E63);
				textview669dd.setVisibility(View.GONE);
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
				edittext14d.setText(String.valueOf(00.00));
				edittext15d.setText(String.valueOf(00.00));
				edittext14d.setTextColor(0xFFE91E63);
				edittext15d.setTextColor(0xFFE91E63);
				textview669dd.setVisibility(View.GONE);
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
				if ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0)))) || (((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					edittext8dd.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString())));
					edittext9dd.setText(String.valueOf(Double.parseDouble(edittext9d.getText().toString())));
					if ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) {
						edittext11d.setText(String.valueOf(1));
					}
					if (Double.parseDouble(edittext8d.getText().toString()) > Double.parseDouble(edittext1.getText().toString())) {
						textview666ad.setVisibility(View.VISIBLE);
						if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(edittext2.getText().toString())) {
							textview667bd.setVisibility(View.VISIBLE);
						}
						else {
							textview667bd.setVisibility(View.GONE);
						}
					}
					else {
						textview666ad.setVisibility(View.GONE);
						if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(edittext2.getText().toString())) {
							textview667bd.setVisibility(View.VISIBLE);
						}
						else {
							textview667bd.setVisibility(View.GONE);
							edittext12d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())));
							edittext12d.setTextColor(0xFF000000);
							if (((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * Double.parseDouble(edittext11d.getText().toString())) > (Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext2.getText().toString()))) {
								textview669dd.setVisibility(View.VISIBLE);
							}
							else {
								textview669dd.setVisibility(View.GONE);
								if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
									edittext3.setText(String.valueOf(1));
								}
								edittext14d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString()))));
								edittext15d.setText(String.valueOf((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * (Double.parseDouble(edittext11d.getText().toString()) * Double.parseDouble(edittext3.getText().toString()))));
								edittext14d.setTextColor(0xFF000000);
								edittext15d.setTextColor(0xFF000000);
							}
						}
					}
				}
			}
		});
		edittext12d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		edittext14d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		edittext15d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		/*
نهاية أوامر المربعات أو الناتج أو كمية العنصر الواحد
*/
		/*
المقارنات والأبعاد المناظرة
*/
		/*
إجمالي كميات الفتحات دينامك
*/
		/*
إجمالي المسطحات
*/
		edittext15d.addTextChangedListener(new TextWatcher() { 	
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
				 for(int i=0; i<add_dynamic_hole_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext15d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext16.setText(String.valueOf(temp1));
			} });
		/*
حذف فتحة
*/
		close_hole_d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_hole_linear);
				/*
المقارنات والأبعاد المناظرة
*/
				/*
إجمالي المسطحات بعد عملية الحذف
*/
				temp1 = 0;
				 for(int i=0; i<add_dynamic_hole_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext15d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext16.setText(String.valueOf(temp1));
			}
		});
		/*
مقارنة الأبعاد في حالة تعديل ابعاد الحائط بعد تعديل أبعاد الفتحة
*/
		edittext1.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext1nn = _param1.toString();
								
textview666.setVisibility(View.GONE);
				textview666ad.setVisibility(View.GONE);
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
								final String edittext2nn = _param1.toString();
								
textview667.setVisibility(View.GONE);
				textview667bd.setVisibility(View.GONE);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
المقارنة
*/
		edittext444.addTextChangedListener(new TextWatcher() { 	
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
					
					
				temp1a = 0;
				for (int i = 0; i < (int)(add_dynamic_hole_linear.getChildCount()); i++) {
					View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo1a =child.findViewById(R.id.edittext8dd);
					temp1a = Math.max(temp1a, Double.parseDouble(tempo1a.getText().toString()));
				}
				temp2b = 0;
				for (int i = 0; i < (int)(add_dynamic_hole_linear.getChildCount()); i++) {
					View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo2b =child.findViewById(R.id.edittext9dd);
					temp2b = Math.max(temp2b, Double.parseDouble(tempo2b.getText().toString()));
				}
				if (Double.parseDouble(edittext1.getText().toString()) < temp1a) {
					textview666.setVisibility(View.VISIBLE);
					edittext4.setText(String.valueOf(00.00));
					edittext4.setTextColor(0xFFE91E63);
					edittext5.setText(String.valueOf(00.00));
					edittext5.setTextColor(0xFFE91E63);
					if (Double.parseDouble(edittext2.getText().toString()) < temp2b) {
						textview667.setVisibility(View.VISIBLE);
					}
					else {
						textview667.setVisibility(View.GONE);
					}
				}
				else {
					textview666.setVisibility(View.GONE);
					if (Double.parseDouble(edittext2.getText().toString()) < temp2b) {
						textview667.setVisibility(View.VISIBLE);
						edittext4.setText(String.valueOf(00.00));
						edittext4.setTextColor(0xFFE91E63);
						edittext5.setText(String.valueOf(00.00));
						edittext5.setTextColor(0xFFE91E63);
					}
					else {
						textview667.setVisibility(View.GONE);
						edittext4.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext2.getText().toString())));
						edittext4.setTextColor(0xFF000000);
						edittext5.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) * (Double.parseDouble(edittext2.getText().toString()) * Double.parseDouble(edittext3.getText().toString()))));
						edittext5.setTextColor(0xFF000000);
					}
				}
			} });
	}
	
}
