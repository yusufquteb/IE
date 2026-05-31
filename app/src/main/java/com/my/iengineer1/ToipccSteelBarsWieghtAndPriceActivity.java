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


public class ToipccSteelBarsWieghtAndPriceActivity extends AppCompatActivity {
	
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
	private TextView textview195;
	private LinearLayout linear705;
	private LinearLayout dynamic_toipcc_steel_bars_wieght_and_price;
	private LinearLayout add_dynamic_linear;
	private LinearLayout linear706;
	private TextView textview1711;
	private LinearLayout linear120;
	private TextView textview519;
	private LinearLayout linear355;
	private Button button193;
	private TextView textview1707;
	private TextView textview14;
	private LinearLayout linear356;
	private LinearLayout linear713;
	private TextView textview578;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private TextView textview555;
	private Button button195;
	private LinearLayout linear720;
	private LinearLayout linear707;
	private TextView textview554;
	private TextView textview583;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private TextView textview585;
	private TextView textview584;
	private Button button194;
	private TextView textview809;
	private LinearLayout linear694;
	private TextView textview1072;
	private LinearLayout linear693;
	private TextView textview1410;
	private LinearLayout linear695;
	private TextView textview1650;
	private LinearLayout linear699;
	private LinearLayout linear703;
	private TextView textview1654;
	private LinearLayout linear704;
	private TextView textview1669;
	private EditText edittext1;
	private TextView textview1670;
	private TextView textview2;
	private TextView textview1666;
	private EditText edittext2;
	private TextView textview1667;
	private TextView textview3;
	private TextView textview1698;
	private EditText edittext3;
	private TextView textview1672;
	private TextView textview4;
	private Button button1;
	private TextView textview1701;
	private EditText edittext4;
	private TextView textview1702;
	private TextView textview5;
	private TextView textview1704;
	private EditText edittext5;
	private TextView textview1705;
	private TextView textview6;
	private TextView textview704;
	private Button add_dynamic_steel_bars_wieght_and_price;
	private TextView textview1708;
	private EditText edittext6;
	private TextView textview1709;
	private TextView textview1710;
	private TextView textview531;
	private EditText edittext7;
	private TextView textview532;
	private TextView textview533;
	private TextView textview1004;
	private EditText edittext8;
	private TextView textview1002;
	private TextView textview1003;
	private TextView textview1009;
	private EditText edittext9;
	private TextView textview1005;
	private TextView textview1006;
	
	private Intent price = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_steel_bars_wieght_and_price);
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
		textview195 = findViewById(R.id.textview195);
		linear705 = findViewById(R.id.linear705);
		dynamic_toipcc_steel_bars_wieght_and_price = findViewById(R.id.dynamic_toipcc_steel_bars_wieght_and_price);
		add_dynamic_linear = findViewById(R.id.add_dynamic_linear);
		linear706 = findViewById(R.id.linear706);
		textview1711 = findViewById(R.id.textview1711);
		linear120 = findViewById(R.id.linear120);
		textview519 = findViewById(R.id.textview519);
		linear355 = findViewById(R.id.linear355);
		button193 = findViewById(R.id.button193);
		textview1707 = findViewById(R.id.textview1707);
		textview14 = findViewById(R.id.textview14);
		linear356 = findViewById(R.id.linear356);
		linear713 = findViewById(R.id.linear713);
		textview578 = findViewById(R.id.textview578);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		button195 = findViewById(R.id.button195);
		linear720 = findViewById(R.id.linear720);
		linear707 = findViewById(R.id.linear707);
		textview554 = findViewById(R.id.textview554);
		textview583 = findViewById(R.id.textview583);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		button194 = findViewById(R.id.button194);
		textview809 = findViewById(R.id.textview809);
		linear694 = findViewById(R.id.linear694);
		textview1072 = findViewById(R.id.textview1072);
		linear693 = findViewById(R.id.linear693);
		textview1410 = findViewById(R.id.textview1410);
		linear695 = findViewById(R.id.linear695);
		textview1650 = findViewById(R.id.textview1650);
		linear699 = findViewById(R.id.linear699);
		linear703 = findViewById(R.id.linear703);
		textview1654 = findViewById(R.id.textview1654);
		linear704 = findViewById(R.id.linear704);
		textview1669 = findViewById(R.id.textview1669);
		edittext1 = findViewById(R.id.edittext1);
		textview1670 = findViewById(R.id.textview1670);
		textview2 = findViewById(R.id.textview2);
		textview1666 = findViewById(R.id.textview1666);
		edittext2 = findViewById(R.id.edittext2);
		textview1667 = findViewById(R.id.textview1667);
		textview3 = findViewById(R.id.textview3);
		textview1698 = findViewById(R.id.textview1698);
		edittext3 = findViewById(R.id.edittext3);
		textview1672 = findViewById(R.id.textview1672);
		textview4 = findViewById(R.id.textview4);
		button1 = findViewById(R.id.button1);
		textview1701 = findViewById(R.id.textview1701);
		edittext4 = findViewById(R.id.edittext4);
		textview1702 = findViewById(R.id.textview1702);
		textview5 = findViewById(R.id.textview5);
		textview1704 = findViewById(R.id.textview1704);
		edittext5 = findViewById(R.id.edittext5);
		textview1705 = findViewById(R.id.textview1705);
		textview6 = findViewById(R.id.textview6);
		textview704 = findViewById(R.id.textview704);
		add_dynamic_steel_bars_wieght_and_price = findViewById(R.id.add_dynamic_steel_bars_wieght_and_price);
		textview1708 = findViewById(R.id.textview1708);
		edittext6 = findViewById(R.id.edittext6);
		textview1709 = findViewById(R.id.textview1709);
		textview1710 = findViewById(R.id.textview1710);
		textview531 = findViewById(R.id.textview531);
		edittext7 = findViewById(R.id.edittext7);
		textview532 = findViewById(R.id.textview532);
		textview533 = findViewById(R.id.textview533);
		textview1004 = findViewById(R.id.textview1004);
		edittext8 = findViewById(R.id.edittext8);
		textview1002 = findViewById(R.id.textview1002);
		textview1003 = findViewById(R.id.textview1003);
		textview1009 = findViewById(R.id.textview1009);
		edittext9 = findViewById(R.id.edittext9);
		textview1005 = findViewById(R.id.textview1005);
		textview1006 = findViewById(R.id.textview1006);
		
		button193.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.altkia.com/iron-price-today/"));
				startActivity(price);
			}
		});
		
		button195.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/DNWx2pdHIFI"));
				startActivity(price);
			}
		});
		
		button194.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
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
				edittext5.setText(String.valueOf(00.00));
				edittext5.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ سيخ");
			}
		});
		
		edittext3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext5.setText(String.valueOf(00.00));
				edittext5.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ م.ط");
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) {
						edittext2.setText(String.valueOf((long)(1)));
					}
					if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
						edittext3.setText(String.valueOf(1));
					}
					edittext4.setText(String.valueOf((Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext1.getText().toString())) / 162));
					edittext5.setText(String.valueOf(Double.parseDouble(edittext4.getText().toString()) * (Double.parseDouble(edittext2.getText().toString()) * Double.parseDouble(edittext3.getText().toString()))));
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
				edittext5.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext7.setText(String.valueOf((Double.parseDouble(edittext5.getText().toString()) + Double.parseDouble(edittext6.getText().toString())) / 1000));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		add_dynamic_steel_bars_wieght_and_price.setOnClickListener(new View.OnClickListener() {
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
		
		edittext6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext6.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext7.setText(String.valueOf((Double.parseDouble(edittext5.getText().toString()) + Double.parseDouble(edittext6.getText().toString())) / 1000));
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
				edittext7.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				if ((edittext8.getText().toString().equals("") || edittext8.getText().toString().equals(".")) || (edittext8.getText().toString().equals("-") || (Double.parseDouble(edittext8.getText().toString()) < 0))) {
					edittext9.setText(String.valueOf(00.00));
				}
				else {
					edittext9.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext8.getText().toString())));
				}
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
				edittext8.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext9.setText(String.valueOf(00.00));
				}
				else {
					edittext9.setText(String.valueOf(Double.parseDouble(edittext7.getText().toString()) * Double.parseDouble(_charSeq)));
				}
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
				edittext9.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
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
		linear706.setVisibility(View.GONE);
		
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
	public void _dynamic_view() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_steel_bars_wieght_and_price = (LinearLayout) inflater.inflate(R.layout.toipcc_d_steel_bars_wieght_and_price, null, false);
		dynamic_toipcc_steel_bars_wieght_and_price.addView(dynamic_steel_bars_wieght_and_price);
		/*
أولآ التعريفات :-
*/
		final TextView textview3d = dynamic_steel_bars_wieght_and_price.findViewById(R.id.textview3d);
		final TextView textview4d = dynamic_steel_bars_wieght_and_price.findViewById(R.id.textview3d);
		final Button button1d = dynamic_steel_bars_wieght_and_price.findViewById(R.id.button1d);
		final EditText edittext1d = dynamic_steel_bars_wieght_and_price.findViewById(R.id.edittext1d);
		edittext1d.setSingleLine(true);
		edittext1d.setFocusableInTouchMode(true);
		final EditText edittext2d = dynamic_steel_bars_wieght_and_price.findViewById(R.id.edittext2d);
		edittext2d.setSingleLine(true);
		edittext2d.setFocusableInTouchMode(true);
		final EditText edittext3d = dynamic_steel_bars_wieght_and_price.findViewById(R.id.edittext3d);
		edittext3d.setSingleLine(true);
		edittext3d.setFocusableInTouchMode(true);
		final EditText edittext4d = dynamic_steel_bars_wieght_and_price.findViewById(R.id.edittext4d);
		edittext4d.setSingleLine(true);
		edittext4d.setFocusableInTouchMode(true);
		final EditText edittext5d = dynamic_steel_bars_wieght_and_price.findViewById(R.id.edittext5d);
		edittext5d.setSingleLine(true);
		edittext5d.setFocusableInTouchMode(true);
		final ImageView close = dynamic_steel_bars_wieght_and_price.findViewById(R.id.close);
		/*
ثانيآ أوامر التعليقات والتعريفات للمدخلات
*/
		textview3d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ سيخ");
				return true;
			}
		});
		textview3d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ م.ط");
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
				edittext4d.setText(String.valueOf(00.00));
				edittext5d.setText(String.valueOf(00.00));
				edittext4d.setTextColor(0xFFE91E63);
				edittext5d.setTextColor(0xFFE91E63);
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
				edittext5d.setText(String.valueOf(00.00));
				edittext5d.setTextColor(0xFFE91E63);
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
				edittext5d.setText(String.valueOf(00.00));
				edittext5d.setTextColor(0xFFE91E63);
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
				if ((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext2d.getText().toString().equals("") || edittext2d.getText().toString().equals(".")) || (edittext2d.getText().toString().equals("-") || (Double.parseDouble(edittext2d.getText().toString()) < 0))) {
						edittext2d.setText(String.valueOf((long)(1)));
					}
					if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
						edittext3d.setText(String.valueOf(1));
					}
					edittext4d.setText(String.valueOf((Double.parseDouble(edittext1d.getText().toString()) * Double.parseDouble(edittext1d.getText().toString())) / 162));
					edittext5d.setText(String.valueOf(Double.parseDouble(edittext4d.getText().toString()) * (Double.parseDouble(edittext2d.getText().toString()) * Double.parseDouble(edittext3d.getText().toString()))));
					edittext4d.setTextColor(0xFF000000);
					edittext5d.setTextColor(0xFF000000);
				}
			}
		});
		edittext4d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		edittext5d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
		/*
نهاية أوامر المربعات أو الناتج أو كمية العنصر الواحد
*/
		/*
إجمالي كمية الحديد
*/
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
					
					
				temp1 = 0;
				 for(int i=0; i<dynamic_toipcc_steel_bars_wieght_and_price.getChildCount(); ++i) { 
					 View child=dynamic_toipcc_steel_bars_wieght_and_price.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext5d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext6.setText(String.valueOf(temp1));
			} });
		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_steel_bars_wieght_and_price);
				/*
إجمالي كمية الحديد بعد الحذف
*/
				temp1 = 0;
				 for(int i=0; i<dynamic_toipcc_steel_bars_wieght_and_price.getChildCount(); ++i) { 
					 View child=dynamic_toipcc_steel_bars_wieght_and_price.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext5d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext6.setText(String.valueOf(temp1));
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
		WebView webView = new WebView(ToipccSteelBarsWieghtAndPriceActivity.this);
		webView.loadDataWithBaseURL(null, htmlContent.toString(), "text/html", "UTF-8", null);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageFinished(WebView view, String url) {
				PrintManager printManager = (PrintManager) ToipccSteelBarsWieghtAndPriceActivity.this.getSystemService(PRINT_SERVICE);
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
				.setMessage("فيديو شرح\n" +
                "طريقة الأستخدام\n" +
                "دليل المدخلات\n" +
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
                "-----‐---------------------------------\n" +
                "مم\n" +
                "=\n" +
                "قطر السيخ\n" +
                "( مم )\n" +
                "سيخ تسليح\n" +
                "=\n" +
                "* عدد الأسياخ\n" +
                "م.ط\n" +
                "=\n" +
                "* طول السيخ ( م )\n" +
                "أضغط للحصول علي النتائج\n" +
                "=\n" +
                "كجم / م.ط\n" +
                "00.00\n" +
                "=\n" +
                "وزن المتر الطولى من\n" +
                "السيخ ( كجم / م.ط )\n" +
                "كجم\n" +
                "00.00\n" +
                "=\n" +
                "اجمالي وزن الحديد\n" +
                "لهذا القطر ( كجم )\n" +
                "أضافة قطر\n" +
                "جديد\n" +
                "كجم\n" +
                "00.00\n" +
                "=\n" +
                "اجمالى كمية حديد التسليح الدينامك ( كجم )\n" +
                "طن\n" +
                "00.00\n" +
                "=\n" +
                "اجمالى كمية حديد التسليح\n" +
                "( طن )\n" +
                "جنيه/طن\n" +
                "=\n" +
                "سعر توريد حديد التسليح\n" +
                "( جنيه / طن )\n" +
                "سعر طن حديد التسليح اليوم\n" +
                "جنيه\n" +
                "00.00\n" +
                "=\n" +
                "إجمالي سعر حديد التسليح\n" +
                "( جنيه )")
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
