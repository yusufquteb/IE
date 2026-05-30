package com.my.iengineer1;

import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
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


public class ToipForceMainCheckDesignActivity extends AppCompatActivity {
	
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
	private TextView textview100;
	private LinearLayout linear176;
	private TextView textview101;
	private HorizontalScrollView hscroll17;
	private LinearLayout linear_dynamic_force_main_check_design;
	private LinearLayout add_dynamic_element_lin;
	private LinearLayout linear2335;
	private TextView textview811;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
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
	private Button button18;
	private TextView textview809;
	private TextView textview704;
	private Button add_dynamic_pipe_line;
	
	private Intent price = new Intent();
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	private AlertDialog.Builder dialog;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toip_force_main_check_design);
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
		textview100 = findViewById(R.id.textview100);
		linear176 = findViewById(R.id.linear176);
		textview101 = findViewById(R.id.textview101);
		hscroll17 = findViewById(R.id.hscroll17);
		linear_dynamic_force_main_check_design = findViewById(R.id.linear_dynamic_force_main_check_design);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		linear2335 = findViewById(R.id.linear2335);
		textview811 = findViewById(R.id.textview811);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
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
		button18 = findViewById(R.id.button18);
		textview809 = findViewById(R.id.textview809);
		textview704 = findViewById(R.id.textview704);
		add_dynamic_pipe_line = findViewById(R.id.add_dynamic_pipe_line);
		internet = new RequestNetwork(this);
		dialog = new AlertDialog.Builder(this);
		
		button195.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/Go4PF42DKa0"));
				startActivity(price);
			}
		});
		
		edittext125.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		add_dynamic_pipe_line.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_EipCheckSewagePipeLinesLevels();
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
		}
		_EipCheckSewagePipeLinesLevels();
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
		PrintHelper printHelper = new PrintHelper(ToipForceMainCheckDesignActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
	
	public String _English_Decimal_Format(final double _number) {
		return (String.format(Locale.ENGLISH,"%.03f", _number));
	}
	
	
	public void _EipCheckSewagePipeLinesLevels() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_force_main_check_design = (LinearLayout) inflater.inflate(R.layout.toip_d_force_main_check_design, null, false);
		linear_dynamic_force_main_check_design.addView(dynamic_force_main_check_design);
		/*
أولا تعريفات الدينامك
*/
		/*
ImageView
*/
		final ImageView closed= dynamic_force_main_check_design.findViewById(R.id.closed);
		/*
EditText
*/
		final EditText edittext555d = dynamic_force_main_check_design.findViewById(R.id.edittext555d);
		edittext555d.setSingleLine(true);
		edittext555d.setFocusableInTouchMode(true);
		final EditText edittext556d = dynamic_force_main_check_design.findViewById(R.id.edittext556d);
		edittext556d.setSingleLine(true);
		edittext556d.setFocusableInTouchMode(true);
		final EditText edittext3d = dynamic_force_main_check_design.findViewById(R.id.edittext3d);
		edittext3d.setSingleLine(true);
		edittext3d.setFocusableInTouchMode(true);
		final EditText edittext_am3d = dynamic_force_main_check_design.findViewById(R.id.edittext_am3d);
		edittext_am3d.setSingleLine(true);
		edittext_am3d.setFocusableInTouchMode(true);
		final EditText edittext4d = dynamic_force_main_check_design.findViewById(R.id.edittext4d);
		edittext4d.setSingleLine(true);
		edittext4d.setFocusableInTouchMode(true);
		final EditText edittext_am4d = dynamic_force_main_check_design.findViewById(R.id.edittext_am4d);
		edittext_am4d.setSingleLine(true);
		edittext_am4d.setFocusableInTouchMode(true);
		final EditText edittext5d = dynamic_force_main_check_design.findViewById(R.id.edittext5d);
		edittext5d.setSingleLine(true);
		edittext5d.setFocusableInTouchMode(true);
		final EditText edittext_am5d = dynamic_force_main_check_design.findViewById(R.id.edittext_am5d);
		edittext_am5d.setSingleLine(true);
		edittext_am5d.setFocusableInTouchMode(true);
		final EditText edittext6d = dynamic_force_main_check_design.findViewById(R.id.edittext6d);
		edittext6d.setSingleLine(true);
		edittext6d.setFocusableInTouchMode(true);
		final EditText edittext_am6d = dynamic_force_main_check_design.findViewById(R.id.edittext_am6d);
		edittext_am6d.setSingleLine(true);
		edittext_am6d.setFocusableInTouchMode(true);
		final EditText edittext7d = dynamic_force_main_check_design.findViewById(R.id.edittext7d);
		edittext7d.setSingleLine(true);
		edittext7d.setFocusableInTouchMode(true);
		final EditText edittext_am7d = dynamic_force_main_check_design.findViewById(R.id.edittext_am7d);
		edittext_am7d.setSingleLine(true);
		edittext_am7d.setFocusableInTouchMode(true);
		final EditText edittext8d = dynamic_force_main_check_design.findViewById(R.id.edittext8d);
		edittext8d.setSingleLine(true);
		edittext8d.setFocusableInTouchMode(true);
		final EditText edittext_am8d = dynamic_force_main_check_design.findViewById(R.id.edittext_am8d);
		edittext_am8d.setSingleLine(true);
		edittext_am8d.setFocusableInTouchMode(true);
		final EditText edittext9d = dynamic_force_main_check_design.findViewById(R.id.edittext9d);
		edittext9d.setSingleLine(true);
		edittext9d.setFocusableInTouchMode(true);
		final EditText edittext_am9d = dynamic_force_main_check_design.findViewById(R.id.edittext_am9d);
		edittext_am9d.setSingleLine(true);
		edittext_am9d.setFocusableInTouchMode(true);
		final EditText edittext10d = dynamic_force_main_check_design.findViewById(R.id.edittext10d);
		edittext10d.setSingleLine(true);
		edittext10d.setFocusableInTouchMode(true);
		final EditText edittext11d = dynamic_force_main_check_design.findViewById(R.id.edittext11d);
		edittext11d.setSingleLine(true);
		edittext11d.setFocusableInTouchMode(true);
		final EditText edittext12d = dynamic_force_main_check_design.findViewById(R.id.edittext12d);
		edittext12d.setSingleLine(true);
		edittext12d.setFocusableInTouchMode(true);
		final EditText edittext_am12d = dynamic_force_main_check_design.findViewById(R.id.edittext_am12d);
		edittext_am12d.setSingleLine(true);
		edittext_am12d.setFocusableInTouchMode(true);
		final EditText edittext13d = dynamic_force_main_check_design.findViewById(R.id.edittext13d);
		edittext13d.setSingleLine(true);
		edittext13d.setFocusableInTouchMode(true);
		final EditText edittext14d = dynamic_force_main_check_design.findViewById(R.id.edittext14d);
		edittext14d.setSingleLine(true);
		edittext14d.setFocusableInTouchMode(true);
		/*
TextView
*/
		final TextView textview6d = dynamic_force_main_check_design.findViewById(R.id.textview6d);
		/*
Button
*/
		final Button button1d = dynamic_force_main_check_design.findViewById(R.id.button1d);
		/*
فحص الضغط
*/
		final TextView textview122d = dynamic_force_main_check_design.findViewById(R.id.textview122d);
		textview122d.setVisibility(View.GONE);
		final TextView textview123d = dynamic_force_main_check_design.findViewById(R.id.textview123d);
		textview123d.setVisibility(View.GONE);
		final LinearLayout linear221d = dynamic_force_main_check_design.findViewById(R.id.linear221d);
		linear221d.setVisibility(View.GONE);
		/*
فحص السرعة بالخط الواصل بالطلمبات
*/
		final TextView textview133d = dynamic_force_main_check_design.findViewById(R.id.textview133d);
		textview133d.setVisibility(View.GONE);
		final TextView textview134d = dynamic_force_main_check_design.findViewById(R.id.textview134d);
		textview134d.setVisibility(View.GONE);
		final TextView textview135d = dynamic_force_main_check_design.findViewById(R.id.textview135d);
		textview135d.setVisibility(View.GONE);
		/*
فحص السرعة بخط الطرد
*/
		final TextView textview144d = dynamic_force_main_check_design.findViewById(R.id.textview144d);
		textview144d.setVisibility(View.GONE);
		final TextView textview145d = dynamic_force_main_check_design.findViewById(R.id.textview145d);
		textview145d.setVisibility(View.GONE);
		final TextView textview146d = dynamic_force_main_check_design.findViewById(R.id.textview146d);
		textview146d.setVisibility(View.GONE);
		/*
ثانيآ المدخلات والمعادلات
*/
		/*
التعليقات المخفية ومربعات الأوامر المخفية
*/
		edittext_am3d.setVisibility(View.GONE);
		edittext_am4d.setVisibility(View.GONE);
		edittext_am5d.setVisibility(View.GONE);
		edittext_am6d.setVisibility(View.GONE);
		edittext_am7d.setVisibility(View.GONE);
		edittext_am8d.setVisibility(View.GONE);
		edittext_am9d.setVisibility(View.GONE);
		/*
التعليقات
*/
		textview6d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* معامل ضغط الأختبار");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ١.٥٠ وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		/*
الترقيم
*/
		edittext555d.setText(String.valueOf((long)(linear_dynamic_force_main_check_design.getChildCount())));
		edittext556d.setText(String.valueOf((long)(linear_dynamic_force_main_check_design.getChildCount())));
		edittext555d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext555dnn = _param1.toString();
								
if ((edittext555dnn.equals("") || edittext555dnn.equals(".")) || (edittext555dnn.equals("-") || (Double.parseDouble(edittext555dnn) < 0))) {
					edittext556d.setText("");
				}
				else {
					edittext556d.setText(edittext555dnn);
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
الأوامر
*/
		edittext3d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext3dnn = _param1.toString();
								
edittext3d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if ((edittext3dnn.equals("") || edittext3dnn.equals(".")) || (edittext3dnn.equals("-") || (Double.parseDouble(edittext3dnn) < 0))) {
					edittext_am3d.setText("a.m");
				}
				else {
					edittext_am3d.setText(String.valueOf(Double.parseDouble(edittext3dnn) / 1000));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am3d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am3dnn = _param1.toString();
								
if (edittext_am3dnn.equals("a.m") || edittext_am7d.getText().toString().equals("a.m")) {
					edittext13d.setText(String.valueOf(0.00d));
				}
				else {
					edittext13d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am3dnn) / (Math.PI * (Math.pow(Double.parseDouble(edittext_am7d.getText().toString()), 2) / 4))));
				}
				if (edittext_am3dnn.equals("a.m") || (edittext_am4d.getText().toString().equals("a.m") || edittext_am8d.getText().toString().equals("a.m"))) {
					edittext14d.setText(String.valueOf(0.00d));
				}
				else {
					edittext14d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am3dnn) * Double.parseDouble(edittext_am4d.getText().toString())) / (Math.PI * (Math.pow(Double.parseDouble(edittext_am8d.getText().toString()), 2) / 4))));
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
								
edittext4d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((edittext4dnn.equals("") || edittext4dnn.equals(".")) || (edittext4dnn.equals("-") || (Double.parseDouble(edittext4dnn) < 0))) {
					edittext_am4d.setText("a.m");
				}
				else {
					edittext_am4d.setText(String.valueOf(Double.parseDouble(edittext4dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am4d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am4dnn = _param1.toString();
								
if (edittext_am4dnn.equals("a.m") || (edittext_am3d.getText().toString().equals("a.m") || edittext_am8d.getText().toString().equals("a.m"))) {
					edittext14d.setText(String.valueOf(0.00d));
				}
				else {
					edittext14d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am3d.getText().toString()) * Double.parseDouble(edittext_am4dnn)) / (Math.PI * (Math.pow(Double.parseDouble(edittext_am8d.getText().toString()), 2) / 4))));
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
				if ((edittext5dnn.equals("") || edittext5dnn.equals(".")) || (edittext5dnn.equals("-") || (Double.parseDouble(edittext5dnn) < 0))) {
					edittext_am5d.setText("a.m");
				}
				else {
					edittext_am5d.setText(String.valueOf(Double.parseDouble(edittext5dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am5d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am5dnn = _param1.toString();
								
if (edittext_am5dnn.equals("a.m")) {
					edittext10d.setText(String.valueOf(0.00d));
				}
				else {
					edittext10d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am5dnn) / 10));
				}
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
								
edittext6d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if ((edittext6dnn.equals("") || edittext6dnn.equals(".")) || (edittext6dnn.equals("-") || (Double.parseDouble(edittext6dnn) < 0))) {
					edittext_am6d.setText("a.m");
				}
				else {
					edittext_am6d.setText(String.valueOf(Double.parseDouble(edittext6dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am6d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am6dnn = _param1.toString();
								
if ((Double.parseDouble(edittext10d.getText().toString()) == 0) || edittext_am6dnn.equals("a.m")) {
					edittext11d.setText(String.valueOf(0.00d));
				}
				else {
					edittext11d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am6dnn) * Double.parseDouble(edittext10d.getText().toString())));
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
								
edittext7d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if ((edittext7dnn.equals("") || edittext7dnn.equals(".")) || (edittext7dnn.equals("-") || (Double.parseDouble(edittext7dnn) < 0))) {
					edittext_am7d.setText("a.m");
				}
				else {
					edittext_am7d.setText(String.valueOf(Double.parseDouble(edittext7dnn) / 1000));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am7d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am7dnn = _param1.toString();
								
if (edittext_am7dnn.equals("a.m") || edittext_am3d.getText().toString().equals("a.m")) {
					edittext13d.setText(String.valueOf(0.00d));
				}
				else {
					edittext13d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am3d.getText().toString()) / (Math.PI * (Math.pow(Double.parseDouble(edittext_am7dnn), 2) / 4))));
				}
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
								
edittext8d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if ((edittext8dnn.equals("") || edittext8dnn.equals(".")) || edittext8dnn.equals("-")) {
					edittext_am8d.setText("a.m");
				}
				else {
					edittext_am8d.setText(String.valueOf(Double.parseDouble(edittext8dnn) / 1000));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am8d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am8dnn = _param1.toString();
								
if (edittext_am8dnn.equals("a.m") || (edittext_am3d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) {
					edittext14d.setText(String.valueOf(0.00d));
				}
				else {
					edittext14d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am3d.getText().toString()) * Double.parseDouble(edittext_am4d.getText().toString())) / (Math.PI * (Math.pow(Double.parseDouble(edittext_am8dnn), 2) / 4))));
				}
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
				if ((edittext9dnn.equals("") || edittext9dnn.equals(".")) || (edittext9dnn.equals("-") || (Double.parseDouble(edittext9dnn) < 0))) {
					edittext_am9d.setText("a.m");
				}
				else {
					edittext_am9d.setText(String.valueOf(Double.parseDouble(edittext9dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am9d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am9dnn = _param1.toString();
								
if ((Double.parseDouble(edittext11d.getText().toString()) == 00.00d) || edittext_am9dnn.equals("a.m")) {
					textview122d.setVisibility(View.GONE);
					textview123d.setVisibility(View.GONE);
					linear221d.setVisibility(View.GONE);
					edittext12d.setText("");
					edittext_am12d.setText("");
				}
				else {
					if (Double.parseDouble(edittext_am9dnn) > Double.parseDouble(edittext11d.getText().toString())) {
						edittext12d.setText(String.valueOf(Double.parseDouble(edittext_am9dnn)));
						edittext_am12d.setText(String.valueOf(Double.parseDouble(edittext_am9dnn)));
						textview122d.setVisibility(View.VISIBLE);
						textview123d.setVisibility(View.GONE);
						linear221d.setVisibility(View.VISIBLE);
					}
					else {
						if ((Double.parseDouble(edittext11d.getText().toString()) > 0) && ((Double.parseDouble(edittext11d.getText().toString()) < 4) || (Double.parseDouble(edittext11d.getText().toString()) == 4))) {
							edittext12d.setText(String.valueOf((long)(4)));
							edittext_am12d.setText(String.valueOf((long)(4)));
						}
						else {
							if ((Double.parseDouble(edittext11d.getText().toString()) > 4) && ((Double.parseDouble(edittext11d.getText().toString()) < 6) || (Double.parseDouble(edittext11d.getText().toString()) == 6))) {
								edittext12d.setText(String.valueOf((long)(6)));
								edittext_am12d.setText(String.valueOf((long)(6)));
							}
							else {
								if ((Double.parseDouble(edittext11d.getText().toString()) > 6) && ((Double.parseDouble(edittext11d.getText().toString()) < 10) || (Double.parseDouble(edittext11d.getText().toString()) == 10))) {
									edittext12d.setText(String.valueOf((long)(10)));
									edittext_am12d.setText(String.valueOf((long)(10)));
								}
								else {
									if ((Double.parseDouble(edittext11d.getText().toString()) > 10) && ((Double.parseDouble(edittext11d.getText().toString()) < 12.5d) || (Double.parseDouble(edittext11d.getText().toString()) == 12.5d))) {
										edittext12d.setText(String.valueOf(12.5d));
										edittext_am12d.setText(String.valueOf(12.5d));
									}
									else {
										if ((Double.parseDouble(edittext11d.getText().toString()) > 12.5d) && ((Double.parseDouble(edittext11d.getText().toString()) < 16) || (Double.parseDouble(edittext11d.getText().toString()) == 16))) {
											edittext12d.setText(String.valueOf((long)(16)));
											edittext_am12d.setText(String.valueOf((long)(16)));
										}
										else {
											if ((Double.parseDouble(edittext11d.getText().toString()) > 16) && ((Double.parseDouble(edittext11d.getText().toString()) < 20) || (Double.parseDouble(edittext11d.getText().toString()) == 20))) {
												edittext12d.setText(String.valueOf((long)(20)));
												edittext_am12d.setText(String.valueOf((long)(20)));
											}
											else {
												edittext12d.setText(String.valueOf((long)(25)));
												edittext_am12d.setText(String.valueOf((long)(25)));
											}
										}
									}
								}
							}
						}
						textview122d.setVisibility(View.GONE);
						textview123d.setVisibility(View.VISIBLE);
						linear221d.setVisibility(View.VISIBLE);
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
		button1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext_am3d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m")) || (edittext_am5d.getText().toString().equals("a.m") || edittext_am7d.getText().toString().equals("a.m"))) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am9d.getText().toString().equals("a.m"))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع المدخلات وتأكد من ان كافة المدخلات ممتلئة وبشكل صحيح");
				}
				else {
					if (edittext_am6d.getText().toString().equals("a.m")) {
						edittext6d.setText(String.valueOf(1.5d));
						edittext_am6d.setText(String.valueOf(1.5d));
					}
				}
			}
		});
		edittext10d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext10dnn = _param1.toString();
								
if (edittext_am6d.getText().toString().equals("a.m") || (Double.parseDouble(edittext10dnn) == 00.00d)) {
					edittext11d.setText(String.valueOf(0.00d));
				}
				else {
					edittext11d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am6d.getText().toString()) * Double.parseDouble(edittext10dnn)));
				}
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
								
if ((Double.parseDouble(edittext11dnn) == 00.00d) || edittext_am9d.getText().toString().equals("a.m")) {
					textview122d.setVisibility(View.GONE);
					textview123d.setVisibility(View.GONE);
					linear221d.setVisibility(View.GONE);
					edittext12d.setText("");
					edittext_am12d.setText("");
				}
				else {
					if (Double.parseDouble(edittext_am9d.getText().toString()) > Double.parseDouble(edittext11dnn)) {
						edittext12d.setText(String.valueOf(Double.parseDouble(edittext_am9d.getText().toString())));
						edittext_am12d.setText(String.valueOf(Double.parseDouble(edittext_am9d.getText().toString())));
						textview122d.setVisibility(View.VISIBLE);
						textview123d.setVisibility(View.GONE);
						linear221d.setVisibility(View.VISIBLE);
					}
					else {
						if ((Double.parseDouble(edittext11dnn) > 0) && ((Double.parseDouble(edittext11dnn) < 4) || (Double.parseDouble(edittext11dnn) == 4))) {
							edittext12d.setText(String.valueOf((long)(4)));
							edittext_am12d.setText(String.valueOf((long)(4)));
						}
						else {
							if ((Double.parseDouble(edittext11dnn) > 4) && ((Double.parseDouble(edittext11dnn) < 6) || (Double.parseDouble(edittext11dnn) == 6))) {
								edittext12d.setText(String.valueOf((long)(6)));
								edittext_am12d.setText(String.valueOf((long)(6)));
							}
							else {
								if ((Double.parseDouble(edittext11dnn) > 6) && ((Double.parseDouble(edittext11dnn) < 10) || (Double.parseDouble(edittext11dnn) == 10))) {
									edittext12d.setText(String.valueOf((long)(10)));
									edittext_am12d.setText(String.valueOf((long)(10)));
								}
								else {
									if ((Double.parseDouble(edittext11dnn) > 10) && ((Double.parseDouble(edittext11dnn) < 12.5d) || (Double.parseDouble(edittext11dnn) == 12.5d))) {
										edittext12d.setText(String.valueOf(12.5d));
										edittext_am12d.setText(String.valueOf(12.5d));
									}
									else {
										if ((Double.parseDouble(edittext11dnn) > 12.5d) && ((Double.parseDouble(edittext11dnn) < 16) || (Double.parseDouble(edittext11dnn) == 16))) {
											edittext12d.setText(String.valueOf((long)(16)));
											edittext_am12d.setText(String.valueOf((long)(16)));
										}
										else {
											if ((Double.parseDouble(edittext11dnn) > 16) && ((Double.parseDouble(edittext11dnn) < 20) || (Double.parseDouble(edittext11dnn) == 20))) {
												edittext12d.setText(String.valueOf((long)(20)));
												edittext_am12d.setText(String.valueOf((long)(20)));
											}
											else {
												edittext12d.setText(String.valueOf((long)(25)));
												edittext_am12d.setText(String.valueOf((long)(25)));
											}
										}
									}
								}
							}
						}
						textview122d.setVisibility(View.GONE);
						textview123d.setVisibility(View.VISIBLE);
						linear221d.setVisibility(View.VISIBLE);
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
		edittext13d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext13dnn = _param1.toString();
								
if (Double.parseDouble(edittext13dnn) == 0) {
					textview133d.setVisibility(View.GONE);
					textview134d.setVisibility(View.GONE);
					textview135d.setVisibility(View.GONE);
				}
				else {
					if (Double.parseDouble(edittext13dnn) < 1) {
						textview133d.setVisibility(View.GONE);
						textview134d.setVisibility(View.VISIBLE);
						textview135d.setVisibility(View.GONE);
					}
					else {
						if (Double.parseDouble(edittext13dnn) > 1.5d) {
							textview133d.setVisibility(View.GONE);
							textview134d.setVisibility(View.GONE);
							textview135d.setVisibility(View.VISIBLE);
						}
						else {
							textview133d.setVisibility(View.VISIBLE);
							textview134d.setVisibility(View.GONE);
							textview135d.setVisibility(View.GONE);
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
		edittext14d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext14dnn = _param1.toString();
								
if (Double.parseDouble(edittext14dnn) == 0) {
					textview144d.setVisibility(View.GONE);
					textview145d.setVisibility(View.GONE);
					textview146d.setVisibility(View.GONE);
				}
				else {
					if (Double.parseDouble(edittext14dnn) < 1) {
						textview144d.setVisibility(View.GONE);
						textview145d.setVisibility(View.VISIBLE);
						textview146d.setVisibility(View.GONE);
					}
					else {
						if (Double.parseDouble(edittext14dnn) > 1.5d) {
							textview144d.setVisibility(View.GONE);
							textview145d.setVisibility(View.GONE);
							textview146d.setVisibility(View.VISIBLE);
						}
						else {
							textview144d.setVisibility(View.VISIBLE);
							textview145d.setVisibility(View.GONE);
							textview146d.setVisibility(View.GONE);
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
		closed.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_force_main_check_design);
			}
		});
	}
	
}
