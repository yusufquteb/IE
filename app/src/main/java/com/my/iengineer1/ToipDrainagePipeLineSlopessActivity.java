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


public class ToipDrainagePipeLineSlopessActivity extends AppCompatActivity {
	
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
	private TextView textview1a;
	private LinearLayout linear176;
	private LinearLayout linear205;
	private LinearLayout dynamic_pipe_line;
	private LinearLayout add_dynamic_element_lin;
	private LinearLayout linear728;
	private TextView textview811;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear289;
	private TextView textview555;
	private Button button195;
	private LinearLayout linear729;
	private LinearLayout linear707;
	private TextView textview1221;
	private TextView textview583;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private Button button18;
	private TextView textview809;
	private LinearLayout linear195;
	private LinearLayout linear201;
	private LinearLayout linear2;
	private LinearLayout linear203;
	private LinearLayout linear3;
	private TextView textview18;
	private LinearLayout linear723;
	private TextView textview19;
	private LinearLayout linear43;
	private HorizontalScrollView hscroll8;
	private TextView textview20;
	private TextView textview21;
	private LinearLayout linear198;
	private LinearLayout linear724;
	private LinearLayout linear726;
	private LinearLayout linear727;
	private LinearLayout linear200;
	private EditText edittext1;
	private TextView textview1;
	private TextView textview14;
	private EditText edittext2;
	private TextView textview607;
	private TextView textview2;
	private TextView textview611;
	private EditText edittext3;
	private TextView textview609;
	private TextView textview3;
	private LinearLayout linear127;
	private LinearLayout linear125;
	private EditText edittext4;
	private TextView textview4;
	private EditText edittext5;
	private TextView textview601;
	private TextView textview5;
	private LinearLayout linear126;
	private LinearLayout linear157;
	private EditText edittext6;
	private TextView textview6;
	private EditText edittext7;
	private TextView textview405;
	private TextView textview7;
	private Button button3;
	private TextView textview614;
	private Button button2;
	private TextView textview612;
	private Button button1;
	private Button button6;
	private TextView textview812;
	private Button button5;
	private TextView textview813;
	private Button button4;
	private Button button9;
	private TextView textview816;
	private Button button8;
	private TextView textview817;
	private Button button7;
	private Button button11;
	private TextView textview819;
	private Button button10;
	private LinearLayout linear199;
	private TextView textview22;
	private TextView textview531;
	private EditText edittext8;
	private TextView textview532;
	private TextView textview8;
	private TextView textview704;
	private Button add_dynamic_pipe_line;
	
	private Intent price = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toip_drainage_pipe_line_slopess);
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
		textview1a = findViewById(R.id.textview1a);
		linear176 = findViewById(R.id.linear176);
		linear205 = findViewById(R.id.linear205);
		dynamic_pipe_line = findViewById(R.id.dynamic_pipe_line);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		linear728 = findViewById(R.id.linear728);
		textview811 = findViewById(R.id.textview811);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		button195 = findViewById(R.id.button195);
		linear729 = findViewById(R.id.linear729);
		linear707 = findViewById(R.id.linear707);
		textview1221 = findViewById(R.id.textview1221);
		textview583 = findViewById(R.id.textview583);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		button18 = findViewById(R.id.button18);
		textview809 = findViewById(R.id.textview809);
		linear195 = findViewById(R.id.linear195);
		linear201 = findViewById(R.id.linear201);
		linear2 = findViewById(R.id.linear2);
		linear203 = findViewById(R.id.linear203);
		linear3 = findViewById(R.id.linear3);
		textview18 = findViewById(R.id.textview18);
		linear723 = findViewById(R.id.linear723);
		textview19 = findViewById(R.id.textview19);
		linear43 = findViewById(R.id.linear43);
		hscroll8 = findViewById(R.id.hscroll8);
		textview20 = findViewById(R.id.textview20);
		textview21 = findViewById(R.id.textview21);
		linear198 = findViewById(R.id.linear198);
		linear724 = findViewById(R.id.linear724);
		linear726 = findViewById(R.id.linear726);
		linear727 = findViewById(R.id.linear727);
		linear200 = findViewById(R.id.linear200);
		edittext1 = findViewById(R.id.edittext1);
		textview1 = findViewById(R.id.textview1);
		textview14 = findViewById(R.id.textview14);
		edittext2 = findViewById(R.id.edittext2);
		textview607 = findViewById(R.id.textview607);
		textview2 = findViewById(R.id.textview2);
		textview611 = findViewById(R.id.textview611);
		edittext3 = findViewById(R.id.edittext3);
		textview609 = findViewById(R.id.textview609);
		textview3 = findViewById(R.id.textview3);
		linear127 = findViewById(R.id.linear127);
		linear125 = findViewById(R.id.linear125);
		edittext4 = findViewById(R.id.edittext4);
		textview4 = findViewById(R.id.textview4);
		edittext5 = findViewById(R.id.edittext5);
		textview601 = findViewById(R.id.textview601);
		textview5 = findViewById(R.id.textview5);
		linear126 = findViewById(R.id.linear126);
		linear157 = findViewById(R.id.linear157);
		edittext6 = findViewById(R.id.edittext6);
		textview6 = findViewById(R.id.textview6);
		edittext7 = findViewById(R.id.edittext7);
		textview405 = findViewById(R.id.textview405);
		textview7 = findViewById(R.id.textview7);
		button3 = findViewById(R.id.button3);
		textview614 = findViewById(R.id.textview614);
		button2 = findViewById(R.id.button2);
		textview612 = findViewById(R.id.textview612);
		button1 = findViewById(R.id.button1);
		button6 = findViewById(R.id.button6);
		textview812 = findViewById(R.id.textview812);
		button5 = findViewById(R.id.button5);
		textview813 = findViewById(R.id.textview813);
		button4 = findViewById(R.id.button4);
		button9 = findViewById(R.id.button9);
		textview816 = findViewById(R.id.textview816);
		button8 = findViewById(R.id.button8);
		textview817 = findViewById(R.id.textview817);
		button7 = findViewById(R.id.button7);
		button11 = findViewById(R.id.button11);
		textview819 = findViewById(R.id.textview819);
		button10 = findViewById(R.id.button10);
		linear199 = findViewById(R.id.linear199);
		textview22 = findViewById(R.id.textview22);
		textview531 = findViewById(R.id.textview531);
		edittext8 = findViewById(R.id.edittext8);
		textview532 = findViewById(R.id.textview532);
		textview8 = findViewById(R.id.textview8);
		textview704 = findViewById(R.id.textview704);
		add_dynamic_pipe_line = findViewById(R.id.add_dynamic_pipe_line);
		
		button195.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/0XYPT-bkbv4"));
				startActivity(price);
			}
		});
		
		button18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext2.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) || ((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || edittext5.getText().toString().equals("-")))) {
					edittext7.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext7.setText(String.valueOf(Double.parseDouble(edittext5.getText().toString()) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext3.getText().toString()) / 1000))));
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
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || ((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || edittext5.getText().toString().equals("-")))) {
					edittext7.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext7.setText(String.valueOf(Double.parseDouble(edittext5.getText().toString()) + (Double.parseDouble(edittext2.getText().toString()) * (Double.parseDouble(_charSeq) / 1000))));
				}
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext8.getText().toString().equals("") || edittext8.getText().toString().equals(".")) || (edittext8.getText().toString().equals("-") || (Double.parseDouble(edittext8.getText().toString()) < 0)))) {
					textview22.setText(".........................................");
					textview22.setTextColor(0xFF000000);
				}
				else {
					if (Double.parseDouble(_charSeq) > Double.parseDouble(edittext8.getText().toString())) {
						textview22.setText("الميل أكبر من أقل ميل مسموح به ف الكود المصري");
						textview22.setTextColor(0xFF3F51B5);
					}
					else {
						if (Double.parseDouble(_charSeq) < Double.parseDouble(edittext8.getText().toString())) {
							textview22.setText("الميل أقل من أقل ميل مسموح به ف الكود المصري\nيجب تعديل الميل");
							textview22.setTextColor(0xFFE91E63);
						}
						else {
							textview22.setText("الميل يساوي أقل ميل مسموح به ف الكود المصري");
							textview22.setTextColor(0xFF000000);
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
				edittext5.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || _charSeq.equals("-")) || (((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) || ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))))) {
					edittext7.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext7.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(edittext2.getText().toString()) * (Double.parseDouble(edittext3.getText().toString()) / 1000))));
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
				edittext7.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8.setText(String.valueOf(Double.parseDouble("2.80")));
				}
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8.setText(String.valueOf(Double.parseDouble("3.25")));
				}
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8.setText(String.valueOf(Double.parseDouble("3.25")));
				}
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8.setText(String.valueOf(Double.parseDouble("1.20")));
				}
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8.setText(String.valueOf(Double.parseDouble("1.40")));
				}
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8.setText(String.valueOf(Double.parseDouble("2.20")));
				}
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8.setText(String.valueOf(Double.parseDouble("0.80")));
				}
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8.setText(String.valueOf(Double.parseDouble("1.00")));
				}
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8.setText(String.valueOf(Double.parseDouble("1.20")));
				}
			}
		});
		
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8.setText(String.valueOf(Double.parseDouble("0.50")));
				}
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8.setText(String.valueOf(Double.parseDouble("0.60")));
				}
			}
		});
		
		edittext8.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext8.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0)))) {
					textview22.setText(".........................................");
					textview22.setTextColor(0xFF000000);
				}
				else {
					if (Double.parseDouble(edittext3.getText().toString()) > Double.parseDouble(_charSeq)) {
						textview22.setText("الميل أكبر من أقل ميل مسموح به ف الكود المصري");
						textview22.setTextColor(0xFF3F51B5);
					}
					else {
						if (Double.parseDouble(edittext3.getText().toString()) < Double.parseDouble(_charSeq)) {
							textview22.setText("الميل أقل من أقل ميل مسموح به ف الكود المصري\nيجب تعديل الميل");
							textview22.setTextColor(0xFFE91E63);
						}
						else {
							textview22.setText("الميل يساوي أقل ميل مسموح به ف الكود المصري");
							textview22.setTextColor(0xFF000000);
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
		
		add_dynamic_pipe_line.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_ToipDrainagePipeLineSlope();
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
		PrintHelper printHelper = new PrintHelper(ToipDrainagePipeLineSlopessActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
	
	public void _ToipDrainagePipeLineSlope() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_pipe_line_linear = (LinearLayout) inflater.inflate(R.layout.toip_d_drainage_pipe_line_slope, null, false);
		dynamic_pipe_line.addView(dynamic_pipe_line_linear);
		/*
أولآ التعريفات
*/
		/*
تعريفات ال button
*/
		final Button button1d = dynamic_pipe_line_linear.findViewById(R.id.button1d);
		final Button button2d = dynamic_pipe_line_linear.findViewById(R.id.button2d);
		final Button button3d = dynamic_pipe_line_linear.findViewById(R.id.button3d);
		final Button button4d = dynamic_pipe_line_linear.findViewById(R.id.button4d);
		final Button button5d = dynamic_pipe_line_linear.findViewById(R.id.button5d);
		final Button button6d = dynamic_pipe_line_linear.findViewById(R.id.button6d);
		final Button button7d = dynamic_pipe_line_linear.findViewById(R.id.button7d);
		final Button button8d = dynamic_pipe_line_linear.findViewById(R.id.button8d);
		final Button button9d = dynamic_pipe_line_linear.findViewById(R.id.button9d);
		final Button button10d = dynamic_pipe_line_linear.findViewById(R.id.button10d);
		final Button button11d = dynamic_pipe_line_linear.findViewById(R.id.button11d);
		/*
تعريفات ال EditText
*/
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
		/*
تعريفات ال TextView
*/
		final TextView textview5d = dynamic_pipe_line_linear.findViewById(R.id.textview5d);
		textview5d.setText("منسوب مية المأسورة بالمطبق\n( منسوب نهاية الفرعة )");
		final TextView textview7d = dynamic_pipe_line_linear.findViewById(R.id.textview7d);
		textview7d.setText("منسوب مية المأسورة بالمطبق\n( منسوب بداية الفرعة )");
		final TextView textview18d = dynamic_pipe_line_linear.findViewById(R.id.textview18d);
		textview18d.setText("مطبق المصب\n( المطبق الذي ستدخل عليه الفرعة \" مطبق النهاية \" ) \nمطبق منسوب ميه الماسورة فيه علي منسوب منخفض\nأي منسوب نهاية الفرعة");
		final TextView textview19d = dynamic_pipe_line_linear.findViewById(R.id.textview19d);
		textview19d.setText("المطبق الذي خرجت منه الفرعة باتجاه مطبق المصب\n( مطبق البداية )\nالمطبق اللي منسوب ميه الماسورة فيه علي العالي\nأي منسوب بداية الفرعة");
		final TextView textview22d = dynamic_pipe_line_linear.findViewById(R.id.textview22d);
		final ImageView close = dynamic_pipe_line_linear.findViewById(R.id.close);
		/*
ثانيآ  :
الأوامر
*/
		edittext2d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext2dnn = _param1.toString();
								
edittext2d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (((edittext2dnn.equals("") || edittext2dnn.equals(".")) || (edittext2dnn.equals("-") || (Double.parseDouble(edittext2dnn) < 0))) || (((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) || ((edittext5d.getText().toString().equals("") || edittext5d.getText().toString().equals(".")) || edittext5d.getText().toString().equals("-")))) {
					edittext7d.setText(String.valueOf(00.00));
				}
				else {
					edittext7d.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString()) + (Double.parseDouble(edittext2dnn) * (Double.parseDouble(edittext3d.getText().toString()) / 1000))));
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
				if (((edittext3dnn.equals("") || edittext3dnn.equals(".")) || (edittext3dnn.equals("-") || (Double.parseDouble(edittext3dnn) < 0))) || (((edittext2d.getText().toString().equals("") || edittext2d.getText().toString().equals(".")) || (edittext2d.getText().toString().equals("-") || (Double.parseDouble(edittext2d.getText().toString()) < 0))) || ((edittext5d.getText().toString().equals("") || edittext5d.getText().toString().equals(".")) || edittext5d.getText().toString().equals("-")))) {
					edittext7d.setText(String.valueOf(00.00));
				}
				else {
					edittext7d.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString()) + (Double.parseDouble(edittext2d.getText().toString()) * (Double.parseDouble(edittext3dnn) / 1000))));
				}
				if (((edittext3dnn.equals("") || edittext3dnn.equals(".")) || (edittext3dnn.equals("-") || (Double.parseDouble(edittext3dnn) < 0))) || ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0)))) {
					textview22d.setText(".........................................");
					textview22d.setTextColor(0xFF000000);
				}
				else {
					if (Double.parseDouble(edittext3dnn) > Double.parseDouble(edittext8d.getText().toString())) {
						textview22d.setText("الميل أكبر من أقل ميل مسموح به ف الكود المصري");
						textview22d.setTextColor(0xFF3F51B5);
					}
					else {
						if (Double.parseDouble(edittext3dnn) < Double.parseDouble(edittext8d.getText().toString())) {
							textview22d.setText("الميل أقل من أقل ميل مسموح به ف الكود المصري\nيجب تعديل الميل");
							textview22d.setTextColor(0xFFE91E63);
						}
						else {
							textview22d.setText("الميل يساوي أقل ميل مسموح به ف الكود المصري");
							textview22d.setTextColor(0xFF000000);
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
		edittext5d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext5dnn = _param1.toString();
								
edittext5d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if (((edittext5dnn.equals("") || edittext5dnn.equals(".")) || edittext5dnn.equals("-")) || (((edittext2d.getText().toString().equals("") || edittext2d.getText().toString().equals(".")) || (edittext2d.getText().toString().equals("-") || (Double.parseDouble(edittext2d.getText().toString()) < 0))) || ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))))) {
					edittext7d.setText(String.valueOf(00.00));
				}
				else {
					edittext7d.setText(String.valueOf(Double.parseDouble(edittext5dnn) + (Double.parseDouble(edittext2d.getText().toString()) * (Double.parseDouble(edittext3d.getText().toString()) / 1000))));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext7d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
		button1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8d.setText(String.valueOf(Double.parseDouble("3.25")));
				}
			}
		});
		button2d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8d.setText(String.valueOf(Double.parseDouble("3.25")));
				}
			}
		});
		button3d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8d.setText(String.valueOf(Double.parseDouble("2.80")));
				}
			}
		});
		button4d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8d.setText(String.valueOf(Double.parseDouble("2.20")));
				}
			}
		});
		button5d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8d.setText(String.valueOf(Double.parseDouble("1.40")));
				}
			}
		});
		button6d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8d.setText(String.valueOf(Double.parseDouble("1.20")));
				}
			}
		});
		button7d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8d.setText(String.valueOf(Double.parseDouble("1.20")));
				}
			}
		});
		button8d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8d.setText(String.valueOf(Double.parseDouble("1.00")));
				}
			}
		});
		button9d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8d.setText(String.valueOf(Double.parseDouble("0.80")));
				}
			}
		});
		button10d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8d.setText(String.valueOf(Double.parseDouble("0.60")));
				}
			}
		});
		button11d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أدخل الميل بالأعلي");
				}
				else {
					edittext8d.setText(String.valueOf(Double.parseDouble("0.50")));
				}
			}
		});
		edittext8d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext8dnn = _param1.toString();
								
edittext8d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (((edittext8dnn.equals("") || edittext8dnn.equals(".")) || (edittext8dnn.equals("-") || (Double.parseDouble(edittext8dnn) < 0))) || ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0)))) {
					textview22d.setText(".........................................");
					textview22d.setTextColor(0xFF000000);
				}
				else {
					if (Double.parseDouble(edittext3d.getText().toString()) > Double.parseDouble(edittext8dnn)) {
						textview22d.setText("الميل أكبر من أقل ميل مسموح به ف الكود المصري");
						textview22d.setTextColor(0xFF3F51B5);
					}
					else {
						if (Double.parseDouble(edittext3d.getText().toString()) < Double.parseDouble(edittext8dnn)) {
							textview22d.setText("الميل أقل من أقل ميل مسموح به ف الكود المصري\nيجب تعديل الميل");
							textview22d.setTextColor(0xFFE91E63);
						}
						else {
							textview22d.setText("الميل يساوي أقل ميل مسموح به ف الكود المصري");
							textview22d.setTextColor(0xFF000000);
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
				_removeView(dynamic_pipe_line_linear);
			}
		});
	}
	
}
