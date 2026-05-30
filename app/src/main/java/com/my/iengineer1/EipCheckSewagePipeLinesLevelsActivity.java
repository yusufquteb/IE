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


public class EipCheckSewagePipeLinesLevelsActivity extends AppCompatActivity {
	
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
	private LinearLayout linear_dynamic_pipe_line_check_excavation;
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
		setContentView(R.layout.eip_check_sewage_pipe_lines_levels);
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
		linear_dynamic_pipe_line_check_excavation = findViewById(R.id.linear_dynamic_pipe_line_check_excavation);
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
				price.setData(Uri.parse("https://youtu.be/gbWEs-jMXRE"));
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
					_dynamic_excavaion();
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
		_dynamic_excavaion();
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
		PrintHelper printHelper = new PrintHelper(EipCheckSewagePipeLinesLevelsActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
	
	public void _dynamic_excavaion() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_pipe_line_check_excavation = (LinearLayout) inflater.inflate(R.layout.eip_d_check_sewage_lines_excavation, null, false);
		linear_dynamic_pipe_line_check_excavation.addView(dynamic_pipe_line_check_excavation);
		/*
أولا تعريفات الدينامك
*/
		/*
ImageView
*/
		final ImageView closed= dynamic_pipe_line_check_excavation.findViewById(R.id.closed);
		/*
EditText
*/
		final EditText edittext555d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext555d);
		edittext555d.setSingleLine(true);
		edittext555d.setFocusableInTouchMode(true);
		final EditText edittext556d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext556d);
		edittext556d.setSingleLine(true);
		edittext556d.setFocusableInTouchMode(true);
		final EditText edittext3d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext3d);
		edittext3d.setSingleLine(true);
		edittext3d.setFocusableInTouchMode(true);
		final EditText edittext_am3d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am3d);
		edittext_am3d.setSingleLine(true);
		edittext_am3d.setFocusableInTouchMode(true);
		final EditText edittext4d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext4d);
		edittext4d.setSingleLine(true);
		edittext4d.setFocusableInTouchMode(true);
		final EditText edittext_am4d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am4d);
		edittext_am4d.setSingleLine(true);
		edittext_am4d.setFocusableInTouchMode(true);
		final EditText edittext8d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext8d);
		edittext8d.setSingleLine(true);
		edittext8d.setFocusableInTouchMode(true);
		final EditText edittext_am8d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am8d);
		edittext_am8d.setSingleLine(true);
		edittext_am8d.setFocusableInTouchMode(true);
		final EditText edittext10d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext10d);
		edittext10d.setSingleLine(true);
		edittext10d.setFocusableInTouchMode(true);
		final EditText edittext_am10d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am10d);
		edittext_am10d.setSingleLine(true);
		edittext_am10d.setFocusableInTouchMode(true);
		final EditText edittext11d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext11d);
		edittext11d.setSingleLine(true);
		edittext11d.setFocusableInTouchMode(true);
		final EditText edittext_am11d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am11d);
		edittext_am11d.setSingleLine(true);
		edittext_am11d.setFocusableInTouchMode(true);
		final EditText edittext12d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext12d);
		edittext12d.setSingleLine(true);
		edittext12d.setFocusableInTouchMode(true);
		final EditText edittext_am12d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am12d);
		edittext_am12d.setSingleLine(true);
		edittext_am12d.setFocusableInTouchMode(true);
		final EditText edittext13d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext13d);
		edittext13d.setSingleLine(true);
		edittext13d.setFocusableInTouchMode(true);
		final EditText edittext15d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext15d);
		edittext15d.setSingleLine(true);
		edittext15d.setFocusableInTouchMode(true);
		/*
TextView
*/
		final TextView textview118d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview118d);
		/*
Button
*/
		final Button button5dl = dynamic_pipe_line_check_excavation.findViewById(R.id.button5dl);
		button5dl.setText("أضافة فحص واستلام منسوب ظهر ماسورة جديد");
		/*
LinearLayout
*/
		final LinearLayout linear_dynamic_pipe_line_check_excavation_level = dynamic_pipe_line_check_excavation.findViewById(R.id.linear_dynamic_pipe_line_check_excavation_level);
		/*
منسوب ميه الماسورة عند نهاية الفرعة
*/
		final LinearLayout linear231d = dynamic_pipe_line_check_excavation.findViewById(R.id.linear231d);
		final HorizontalScrollView hscroll231d = dynamic_pipe_line_check_excavation.findViewById(R.id.hscroll231d);
		final LinearLayout linear232d = dynamic_pipe_line_check_excavation.findViewById(R.id.linear232d);
		final HorizontalScrollView hscroll232d = dynamic_pipe_line_check_excavation.findViewById(R.id.hscroll232d);
		linear231d.setVisibility(View.GONE);
		hscroll231d.setVisibility(View.GONE);
		linear232d.setVisibility(View.GONE);
		hscroll232d.setVisibility(View.GONE);
		final LinearLayout linear33d = dynamic_pipe_line_check_excavation.findViewById(R.id.linear33d);
		final HorizontalScrollView hscroll33d = dynamic_pipe_line_check_excavation.findViewById(R.id.hscroll33d);
		linear33d.setVisibility(View.GONE);
		hscroll33d.setVisibility(View.GONE);
		/*
LinearLayout مختفية وملغية من الحسابات 
*/
		final LinearLayout linear205d = dynamic_pipe_line_check_excavation.findViewById(R.id.linear205d);
		linear205d.setVisibility(View.GONE);
		final HorizontalScrollView hscroll3d = dynamic_pipe_line_check_excavation.findViewById(R.id.hscroll3d);
		hscroll3d.setVisibility(View.GONE);
		final LinearLayout linear206d = dynamic_pipe_line_check_excavation.findViewById(R.id.linear206d);
		linear206d.setVisibility(View.GONE);
		final HorizontalScrollView hscroll13d = dynamic_pipe_line_check_excavation.findViewById(R.id.hscroll13d);
		hscroll13d.setVisibility(View.GONE);
		final LinearLayout linear209d = dynamic_pipe_line_check_excavation.findViewById(R.id.linear209d);
		linear209d.setVisibility(View.GONE);
		final HorizontalScrollView hscroll219d = dynamic_pipe_line_check_excavation.findViewById(R.id.hscroll219d);
		hscroll219d.setVisibility(View.GONE);
		final LinearLayout linear216d = dynamic_pipe_line_check_excavation.findViewById(R.id.linear216d);
		linear216d.setVisibility(View.GONE);
		final LinearLayout linear214d = dynamic_pipe_line_check_excavation.findViewById(R.id.linear214d);
		linear214d.setVisibility(View.GONE);
		/*
LinearLayout سمك طبقة التغليف حول وأعلي المواسير ( م )
*/
		final HorizontalScrollView hscroll51d = dynamic_pipe_line_check_excavation.findViewById(R.id.hscroll51d);
		hscroll51d.setVisibility(View.GONE);
		final LinearLayout linear51d = dynamic_pipe_line_check_excavation.findViewById(R.id.linear51d);
		linear51d.setVisibility(View.GONE);
		final HorizontalScrollView hscroll52d = dynamic_pipe_line_check_excavation.findViewById(R.id.hscroll52d);
		hscroll52d.setVisibility(View.GONE);
		final LinearLayout linear52d = dynamic_pipe_line_check_excavation.findViewById(R.id.linear52d);
		linear52d.setVisibility(View.GONE);
		/*
LinearLayout فحص العرض
*/
		final LinearLayout linear_dynamic_pipe_line_check_excavation_width = dynamic_pipe_line_check_excavation.findViewById(R.id.linear_dynamic_pipe_line_check_excavation_width);
		linear_dynamic_pipe_line_check_excavation_width.setVisibility(View.GONE);
		final TextView textview106d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview106d);
		textview106d.setVisibility(View.GONE);
		final TextView textview107d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview107d);
		textview107d.setVisibility(View.GONE);
		final TextView textview149d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview149d);
		textview149d.setVisibility(View.GONE);
		final Button button2dw = dynamic_pipe_line_check_excavation.findViewById(R.id.button2dw);
		button2dw.setVisibility(View.GONE);
		/*
عرض الأحلال من أعلي
*/
		final TextView textview40d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview40d);
		textview40d.setVisibility(View.GONE);
		final LinearLayout linear40d = dynamic_pipe_line_check_excavation.findViewById(R.id.linear40d);
		linear40d.setVisibility(View.GONE);
		final HorizontalScrollView hscroll43d = dynamic_pipe_line_check_excavation.findViewById(R.id.hscroll43d);
		hscroll43d.setVisibility(View.GONE);
		final LinearLayout linear43d = dynamic_pipe_line_check_excavation.findViewById(R.id.linear43d);
		linear43d.setVisibility(View.GONE);
		/*
ثانيآ المدخلات والمعادلات
*/
		final TextView textview13d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview13d);
		textview13d.setText("منسوب ظهر الماسورة عند النقطة التصميمية او عند المطبق التصميمي المراد رفع واستلام الفرعة عنده");
		/*
المسميات
*/
		final TextView textview108d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview108d);
		textview108d.setText("- فحص واستلام منسوب ظهر الماسورة :-");
		/*
EditText لزوم القراءات
*/
		final EditText edittext26d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext26d);
		edittext26d.setSingleLine(true);
		edittext26d.setFocusableInTouchMode(true);
		final EditText edittext_am13d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am13d);
		edittext_am13d.setSingleLine(true);
		edittext_am13d.setFocusableInTouchMode(true);
		final EditText edittext_am15d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am15d);
		edittext_am15d.setSingleLine(true);
		edittext_am15d.setFocusableInTouchMode(true);
		edittext_am13d.setVisibility(View.GONE);
		edittext_am15d.setVisibility(View.GONE);
		final TextView textview26d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview26d);
		textview26d.setText("قراءة القامة لظهر الماسورة عند النقطة التصميمية او عند المطبق التصميمي المراد رفع واستلام الفرعة عنده");
		/*
التعليقات المخفية ومربعات الأوامر المخفية
*/
		textview118d.setVisibility(View.GONE);
		edittext_am3d.setVisibility(View.GONE);
		edittext_am4d.setVisibility(View.GONE);
		edittext_am8d.setVisibility(View.GONE);
		edittext_am10d.setVisibility(View.GONE);
		edittext_am11d.setVisibility(View.GONE);
		edittext_am12d.setVisibility(View.GONE);
		/*
الترقيم
*/
		edittext555d.setText(String.valueOf((long)(linear_dynamic_pipe_line_check_excavation.getChildCount())));
		edittext556d.setText(String.valueOf((long)(linear_dynamic_pipe_line_check_excavation.getChildCount())));
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
					edittext_am3d.setText(String.valueOf(Double.parseDouble(edittext3dnn)));
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
					edittext_am4d.setText(String.valueOf(Double.parseDouble(edittext4dnn) / 1000));
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
								
if (edittext_am4dnn.equals("a.m") || edittext_am8d.getText().toString().equals("a.m")) {
					edittext13d.setText(String.valueOf(0.00d));
					edittext_am13d.setText("a.m");
				}
				else {
					edittext13d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am4dnn) + Double.parseDouble(edittext_am8d.getText().toString())));
					edittext_am13d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am4dnn) + Double.parseDouble(edittext_am8d.getText().toString())));
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
					edittext_am8d.setText(String.valueOf(Double.parseDouble(edittext8dnn)));
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
								
if (edittext_am8dnn.equals("a.m") || edittext_am4d.getText().toString().equals("a.m")) {
					edittext13d.setText(String.valueOf(0.00d));
					edittext_am13d.setText("a.m");
				}
				else {
					edittext13d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am4d.getText().toString()) + Double.parseDouble(edittext_am8dnn)));
					edittext_am13d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am4d.getText().toString()) + Double.parseDouble(edittext_am8dnn)));
				}
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
				if ((edittext10dnn.equals("") || edittext10dnn.equals(".")) || (edittext10dnn.equals("-") || (Double.parseDouble(edittext10dnn) < 0))) {
					edittext_am10d.setText("a.m");
				}
				else {
					edittext_am10d.setText(String.valueOf(Double.parseDouble(edittext10dnn) / 1000));
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
								
edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if ((edittext11dnn.equals("") || edittext11dnn.equals(".")) || edittext11dnn.equals("-")) {
					edittext_am11d.setText("a.m");
				}
				else {
					edittext_am11d.setText(String.valueOf(Double.parseDouble(edittext11dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am11d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am11dnn = _param1.toString();
								
if (edittext_am11dnn.equals("a.m") || edittext_am12d.getText().toString().equals("a.m")) {
					edittext15d.setText(String.valueOf(0.00d));
					edittext_am15d.setText("a.m");
				}
				else {
					edittext15d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am11dnn) + Double.parseDouble(edittext_am12d.getText().toString())));
					edittext_am15d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am11dnn) + Double.parseDouble(edittext_am12d.getText().toString())));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext12d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext12dnn = _param1.toString();
								
edittext12d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if ((edittext12dnn.equals("") || edittext12dnn.equals(".")) || edittext12dnn.equals("-")) {
					edittext_am12d.setText("a.m");
				}
				else {
					edittext_am12d.setText(String.valueOf(Double.parseDouble(edittext12dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am12d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am12dnn = _param1.toString();
								
if (edittext_am11d.getText().toString().contains("a.m") || edittext_am12dnn.contains("a.m")) {
					edittext15d.setText(String.valueOf(0.00d));
					edittext_am15d.setText("a.m");
				}
				else {
					edittext15d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am11d.getText().toString()) + Double.parseDouble(edittext_am12dnn)));
					edittext_am15d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am11d.getText().toString()) + Double.parseDouble(edittext_am12dnn)));
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
EditText لزوم القراءات
*/
		edittext_am13d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am13dnn = _param1.toString();
								
if (edittext_am15d.getText().toString().contains("a.m") || edittext_am13dnn.contains("a.m")) {
					edittext26d.setText(String.valueOf(0.00d));
				}
				else {
					edittext26d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15d.getText().toString()) - Double.parseDouble(edittext_am13dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am15d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am15dnn = _param1.toString();
								
if (edittext_am13d.getText().toString().contains("a.m") || edittext_am15dnn.contains("a.m")) {
					edittext26d.setText(String.valueOf(0.00d));
				}
				else {
					edittext26d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15dnn) - Double.parseDouble(edittext_am13d.getText().toString())));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		button5dl.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
					final LinearLayout dynamic_pipe_line_check_excavation_level = (LinearLayout) inflater.inflate(R.layout.eip_d_check_sewage_lines_excavation_level, null, false);
					linear_dynamic_pipe_line_check_excavation_level.addView(dynamic_pipe_line_check_excavation_level);
					/*
أولا تعريفات الدينامك
*/
					/*
ImageView
*/
					final ImageView close2dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.close2dl);
					final ImageView close3dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.close3dl);
					/*
Button
*/
					final Button button3dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.button3dl);
					final Button button4dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.button4dl);
					/*
LinearLayout
*/
					final LinearLayout linear44dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.linear44dl);
					final LinearLayout linear45dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.linear45dl);
					/*
EditText
*/
					final EditText edittext558dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.edittext558dl);
					edittext558dl.setSingleLine(true);
					edittext558dl.setFocusableInTouchMode(true);
					final EditText edittext559dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.edittext559dl);
					edittext559dl.setSingleLine(true);
					edittext559dl.setFocusableInTouchMode(true);
					final EditText edittext18dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.edittext18dl);
					edittext18dl.setSingleLine(true);
					edittext18dl.setFocusableInTouchMode(true);
					final EditText edittext_am18dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.edittext_am18dl);
					edittext_am18dl.setSingleLine(true);
					edittext_am18dl.setFocusableInTouchMode(true);
					final EditText edittext19dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.edittext19dl);
					edittext19dl.setSingleLine(true);
					edittext19dl.setFocusableInTouchMode(true);
					final EditText edittext_am19dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.edittext_am19dl);
					edittext_am19dl.setSingleLine(true);
					edittext_am19dl.setFocusableInTouchMode(true);
					final EditText edittext20dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.edittext20dl);
					edittext20dl.setSingleLine(true);
					edittext20dl.setFocusableInTouchMode(true);
					final EditText edittext21dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.edittext21dl);
					edittext21dl.setSingleLine(true);
					edittext21dl.setFocusableInTouchMode(true);
					final EditText edittext22dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.edittext22dl);
					edittext22dl.setSingleLine(true);
					edittext22dl.setFocusableInTouchMode(true);
					/*
TextView
*/
					final TextView textview119dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview119dl);
					final TextView textview120dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview120dl);
					final TextView textview121dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview121dl);
					final TextView textview122dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview122dl);
					final TextView textview123dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview123dl);
					final TextView textview141dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview141dl);
					final TextView textview144dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview144dl);
					linear45dl.setVisibility(View.GONE);
					textview119dl.setVisibility(View.GONE);
					textview120dl.setVisibility(View.GONE);
					textview121dl.setVisibility(View.GONE);
					textview121dl.setText("منسوب ظهر الماسورة الفعلي للنقطة المرصودة يساوي منسوب ظهر الماسورة التصميمي عند نفس النقطة");
					textview122dl.setVisibility(View.GONE);
					textview122dl.setText("منسوب ظهر الماسورة الفعلي للنقطة المرصودة أعلي من منسوب ظهر الماسورة التصميمي عند نفس النقطة\nوعليه يلزم زيادة خفض منسوب الماسورة عند هذه النقطة بمقدار الفرق\nملاحظة : ( ve - ) توضح ان انه يجب خفض منسوب الماسورة بالمقدار المجاور للعلامة");
					textview123dl.setVisibility(View.GONE);
					textview123dl.setText("منسوب ظهر الماسورة الفعلي للنقطة المرصودة أوطي من منسوب ظهر الماسورة التصميمي عند نفس النقطة\nوعليه يجب رفع منسوب الماسورة لأعلي بمقدار الفرق");
					edittext_am18dl.setVisibility(View.GONE);
					edittext_am19dl.setVisibility(View.GONE);
					final TextView textview20dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview20dl);
					textview20dl.setText("منسوب ظهر الماسورة التصميمي عند النقطة المرصودة");
					final TextView textview21dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview21dl);
					textview21dl.setText("منسوب ظهر الماسورة الفعلي عند النقطة المرصودة");
					final TextView textview22dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview22dl);
					textview22dl.setText("الفرق\n( منسوب ظهر الماسورة التصميمي عند النقطة المرصوده\n-\nمنسوب ظهر الماسورة الفعلي لنفس النقطة المرصودة ) \n( م )");
					/*
EditText لزوم القراءات
*/
					final EditText edittext27dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.edittext27dl);
					edittext27dl.setSingleLine(true);
					edittext27dl.setFocusableInTouchMode(true);
					final TextView textview27dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview27dl);
					textview27dl.setText("قراءة القامة لمنسوب ظهر الماسورة التصميمي عند النقطة المرصودة");
					final EditText edittext_am20dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.edittext_am20dl);
					edittext_am20dl.setSingleLine(true);
					edittext_am20dl.setFocusableInTouchMode(true);
					edittext_am20dl.setVisibility(View.GONE);
					/*
الأوامر
*/
					edittext558dl.setText(String.valueOf((long)(linear_dynamic_pipe_line_check_excavation_level.getChildCount())));
					edittext559dl.setText(String.valueOf((long)(linear_dynamic_pipe_line_check_excavation_level.getChildCount())));
					edittext558dl.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext558dlnn = _param1.toString();
											
if ((edittext558dlnn.equals("") || edittext558dlnn.equals(".")) || (edittext558dlnn.equals("-") || (Double.parseDouble(edittext558dlnn) < 0))) {
								edittext559dl.setText("");
							}
							else {
								edittext559dl.setText(edittext558dlnn);
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					button3dl.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							/*
اختيار اتجاه السريان والرفع
*/
							linear44dl.setVisibility(View.GONE);
							textview141dl.setVisibility(View.GONE);
							/*
الرفع ف نفس اتجاه السريان
*/
							linear45dl.setVisibility(View.VISIBLE);
							textview144dl.setText("الرفع مع اتجاه السريان\n- اي ان اتجاه الرفع المساحي من المطبق الذي خرجت منه الفرعة باتجاه مطبق المصب\n- أي ان اتجاه الرفع المساحي من منسوب بداية الفرعة علي العالي باتجاه منسوب نهاية الفرعة اللي علي الواطي");
							edittext18dl.setText("");
							edittext19dl.setText("");
							/*
أوامر متعلقه بالتصميم ومنسوب سطح الميزان
*/
							edittext_am10d.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am10dnn = _param1.toString();
													
if ((edittext_am10dnn.equals("a.m") || edittext_am18dl.getText().toString().equals("a.m")) || (edittext_am4d.getText().toString().equals("a.m") || edittext_am8d.getText().toString().equals("a.m"))) {
										edittext20dl.setText(String.valueOf(00.00d));
										edittext_am20dl.setText("a.m");
									}
									else {
										edittext20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13d.getText().toString()) - (Double.parseDouble(edittext_am10dnn) * Double.parseDouble(edittext_am18dl.getText().toString()))));
										edittext_am20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13d.getText().toString()) - (Double.parseDouble(edittext_am10dnn) * Double.parseDouble(edittext_am18dl.getText().toString()))));
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
													
if ((edittext_am10d.getText().toString().equals("a.m") || edittext_am18dl.getText().toString().equals("a.m")) || (edittext_am4d.getText().toString().equals("a.m") || edittext_am8d.getText().toString().equals("a.m"))) {
										edittext20dl.setText(String.valueOf(00.00d));
										edittext_am20dl.setText("a.m");
									}
									else {
										edittext20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13dnn) - (Double.parseDouble(edittext_am10d.getText().toString()) * Double.parseDouble(edittext_am18dl.getText().toString()))));
										edittext_am20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13dnn) - (Double.parseDouble(edittext_am10d.getText().toString()) * Double.parseDouble(edittext_am18dl.getText().toString()))));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext15d.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext15dnn = _param1.toString();
													
if (edittext_am19dl.getText().toString().equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m"))) {
										edittext21dl.setText(String.valueOf(00.00d));
									}
									else {
										edittext21dl.setText(_English_Decimal_Format(Double.parseDouble(edittext15dnn) - Double.parseDouble(edittext_am19dl.getText().toString())));
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
أوامر متعلقة بالأستلام والرفع المساحي بالموقع
*/
							edittext18dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext18dlnn = _param1.toString();
													
edittext18dl.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
									if ((edittext18dlnn.equals("") || edittext18dlnn.equals(".")) || (edittext18dlnn.equals("-") || (Double.parseDouble(edittext18dlnn) < 0))) {
										edittext_am18dl.setText("a.m");
									}
									else {
										edittext_am18dl.setText(String.valueOf(Double.parseDouble(edittext18dlnn)));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext_am18dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am18dlnn = _param1.toString();
													
if ((edittext_am10d.getText().toString().equals("a.m") || edittext_am18dlnn.equals("a.m")) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) {
										edittext20dl.setText(String.valueOf(00.00d));
										edittext_am20dl.setText("a.m");
									}
									else {
										if (edittext_am3d.getText().toString().equals("a.m")) {
											textview119dl.setVisibility(View.VISIBLE);
											textview120dl.setVisibility(View.GONE);
											edittext20dl.setText(String.valueOf(00.00d));
											edittext_am20dl.setText("a.m");
										}
										else {
											textview119dl.setVisibility(View.GONE);
											if (Double.parseDouble(edittext_am18dlnn) > Double.parseDouble(edittext_am3d.getText().toString())) {
												textview120dl.setVisibility(View.VISIBLE);
												edittext20dl.setText(String.valueOf(00.00d));
												edittext_am20dl.setText("a.m");
											}
											else {
												textview118d.setVisibility(View.GONE);
												textview120dl.setVisibility(View.GONE);
												edittext20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13d.getText().toString()) - (Double.parseDouble(edittext_am10d.getText().toString()) * Double.parseDouble(edittext_am18dlnn))));
												edittext_am20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13d.getText().toString()) - (Double.parseDouble(edittext_am10d.getText().toString()) * Double.parseDouble(edittext_am18dlnn))));
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
							edittext19dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext19dlnn = _param1.toString();
													
edittext19dl.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
									if ((edittext19dlnn.equals("") || edittext19dlnn.equals(".")) || edittext19dlnn.equals("-")) {
										edittext_am19dl.setText("a.m");
									}
									else {
										edittext_am19dl.setText(String.valueOf(Double.parseDouble(edittext19dlnn)));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext_am19dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am19dlnn = _param1.toString();
													
if (edittext_am19dlnn.equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m"))) {
										edittext21dl.setText(String.valueOf(00.00d));
									}
									else {
										edittext21dl.setText(_English_Decimal_Format(Double.parseDouble(edittext15d.getText().toString()) - Double.parseDouble(edittext_am19dlnn)));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext20dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext20dlnn = _param1.toString();
													
if (((((edittext_am18dl.getText().toString().equals("a.m") || textview118d.getVisibility() == View.VISIBLE) || (textview119dl.getVisibility() == View.VISIBLE || textview120dl.getVisibility() == View.VISIBLE)) || edittext_am10d.getText().toString().equals("a.m")) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) || (edittext_am19dl.getText().toString().equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m")))) {
										edittext22dl.setText(String.valueOf(00.00d));
									}
									else {
										edittext22dl.setText(_English_Decimal_Format(Double.parseDouble(edittext20dlnn) - Double.parseDouble(edittext21dl.getText().toString())));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext21dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext21dlnn = _param1.toString();
													
if (((((edittext_am18dl.getText().toString().equals("a.m") || textview118d.getVisibility() == View.VISIBLE) || (textview119dl.getVisibility() == View.VISIBLE || textview120dl.getVisibility() == View.VISIBLE)) || edittext_am10d.getText().toString().equals("a.m")) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) || (edittext_am19dl.getText().toString().equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m")))) {
										edittext22dl.setText(String.valueOf(00.00d));
									}
									else {
										edittext22dl.setText(_English_Decimal_Format(Double.parseDouble(edittext20dl.getText().toString()) - Double.parseDouble(edittext21dlnn)));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext22dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext22dlnn = _param1.toString();
													
if (((((edittext_am18dl.getText().toString().equals("a.m") || textview118d.getVisibility() == View.VISIBLE) || (textview119dl.getVisibility() == View.VISIBLE || textview120dl.getVisibility() == View.VISIBLE)) || edittext_am10d.getText().toString().equals("a.m")) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) || (edittext_am19dl.getText().toString().equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m")))) {
										textview121dl.setVisibility(View.GONE);
										textview122dl.setVisibility(View.GONE);
										textview123dl.setVisibility(View.GONE);
									}
									else {
										if (Double.parseDouble(edittext22dlnn) == 00.00d) {
											textview121dl.setVisibility(View.VISIBLE);
											textview122dl.setVisibility(View.GONE);
											textview123dl.setVisibility(View.GONE);
										}
										else {
											if (Double.parseDouble(edittext22dlnn) < 00.00d) {
												textview121dl.setVisibility(View.GONE);
												textview122dl.setVisibility(View.VISIBLE);
												textview123dl.setVisibility(View.GONE);
											}
											else {
												textview121dl.setVisibility(View.GONE);
												textview122dl.setVisibility(View.GONE);
												textview123dl.setVisibility(View.VISIBLE);
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
							/*
المقارنة
*/
							edittext_am18dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am18dlnn = _param1.toString();
													
if (edittext_am18dl.getText().toString().equals("a.m")) {
										edittext20dl.setText(String.valueOf(00.00d));
									}
									else {
										temp = 0;
										for (int i = 0; i < (int)(linear_dynamic_pipe_line_check_excavation_level.getChildCount()); i++) {
											View child=linear_dynamic_pipe_line_check_excavation_level.getChildAt(i); 
											TextView tempo =child.findViewById(R.id.edittext_am18dl);
											temp = Math.max(temp, Double.parseDouble(tempo.getText().toString()));
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
							edittext_am3d.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am3dnn = _param1.toString();
													
if ((edittext_am10d.getText().toString().equals("a.m") || (edittext_am8d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) || edittext_am18dl.getText().toString().equals("a.m")) {
										edittext20dl.setText(String.valueOf(00.00d));
										edittext_am20dl.setText("a.m");
									}
									else {
										if (edittext_am3d.getText().toString().equals("a.m")) {
											textview119dl.setVisibility(View.VISIBLE);
											textview118d.setVisibility(View.GONE);
											edittext20dl.setText(String.valueOf(00.00d));
											edittext_am20dl.setText("a.m");
										}
										else {
											textview119dl.setVisibility(View.GONE);
											if (temp > Double.parseDouble(edittext_am3dnn)) {
												textview118d.setVisibility(View.VISIBLE);
												edittext20dl.setText(String.valueOf(00.00d));
												edittext_am20dl.setText("a.m");
											}
											else {
												textview118d.setVisibility(View.GONE);
												textview120dl.setVisibility(View.GONE);
												edittext20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13d.getText().toString()) - (Double.parseDouble(edittext_am10d.getText().toString()) * Double.parseDouble(edittext_am18dl.getText().toString()))));
												edittext_am20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13d.getText().toString()) - (Double.parseDouble(edittext_am10d.getText().toString()) * Double.parseDouble(edittext_am18dl.getText().toString()))));
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
							/*
EditText لزوم القراءات
*/
							edittext_am20dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am20dlnn = _param1.toString();
													
if (edittext_am15d.getText().toString().contains("a.m") || edittext_am20dlnn.contains("a.m")) {
										edittext27dl.setText(String.valueOf(0.00d));
									}
									else {
										edittext27dl.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15d.getText().toString()) - Double.parseDouble(edittext_am20dlnn)));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext_am15d.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am15dnn = _param1.toString();
													
if (edittext_am20dl.getText().toString().contains("a.m") || edittext_am15dnn.contains("a.m")) {
										edittext27dl.setText(String.valueOf(0.00d));
									}
									else {
										edittext27dl.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15dnn) - Double.parseDouble(edittext_am20dl.getText().toString())));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
						}
					});
					button4dl.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							/*
اختيار اتجاه السريان والرفع
*/
							linear44dl.setVisibility(View.GONE);
							textview141dl.setVisibility(View.GONE);
							/*
الرفع ف نفس اتجاه السريان
*/
							linear45dl.setVisibility(View.VISIBLE);
							textview144dl.setText("الرفع عكس اتجاه السريان\n- اي ان اتجاه الرفع المساحي من المطبق الذي ستدخل عليه الفرعة باتجاه مطبق بداية الفرعة\n- أي ان اتجاه الرفع المساحي من منسوب نهاية الفرعة علي الواطي باتجاه منسوب بداية الفرعة اللي علي العالي");
							edittext18dl.setText("");
							edittext19dl.setText("");
							/*
أوامر متعلقه بالتصميم ومنسوب سطح الميزان
*/
							edittext_am10d.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am10dnn = _param1.toString();
													
if ((edittext_am10dnn.equals("a.m") || edittext_am18dl.getText().toString().equals("a.m")) || (edittext_am4d.getText().toString().equals("a.m") || edittext_am8d.getText().toString().equals("a.m"))) {
										edittext20dl.setText(String.valueOf(00.00d));
										edittext_am20dl.setText("a.m");
									}
									else {
										edittext20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13d.getText().toString()) + (Double.parseDouble(edittext_am10dnn) * Double.parseDouble(edittext_am18dl.getText().toString()))));
										edittext_am20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13d.getText().toString()) + (Double.parseDouble(edittext_am10dnn) * Double.parseDouble(edittext_am18dl.getText().toString()))));
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
													
if ((edittext_am10d.getText().toString().equals("a.m") || edittext_am18dl.getText().toString().equals("a.m")) || (edittext_am4d.getText().toString().equals("a.m") || edittext_am8d.getText().toString().equals("a.m"))) {
										edittext20dl.setText(String.valueOf(00.00d));
										edittext_am20dl.setText("a.m");
									}
									else {
										edittext20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13dnn) + (Double.parseDouble(edittext_am10d.getText().toString()) * Double.parseDouble(edittext_am18dl.getText().toString()))));
										edittext_am20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13dnn) + (Double.parseDouble(edittext_am10d.getText().toString()) * Double.parseDouble(edittext_am18dl.getText().toString()))));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext15d.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext15dnn = _param1.toString();
													
if (edittext_am19dl.getText().toString().equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m"))) {
										edittext21dl.setText(String.valueOf(00.00d));
									}
									else {
										edittext21dl.setText(_English_Decimal_Format(Double.parseDouble(edittext15dnn) - Double.parseDouble(edittext_am19dl.getText().toString())));
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
أوامر متعلقة بالأستلام والرفع المساحي بالموقع
*/
							edittext18dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext18dlnn = _param1.toString();
													
edittext18dl.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
									if ((edittext18dlnn.equals("") || edittext18dlnn.equals(".")) || (edittext18dlnn.equals("-") || (Double.parseDouble(edittext18dlnn) < 0))) {
										edittext_am18dl.setText("a.m");
									}
									else {
										edittext_am18dl.setText(String.valueOf(Double.parseDouble(edittext18dlnn)));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext_am18dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am18dlnn = _param1.toString();
													
if ((edittext_am10d.getText().toString().equals("a.m") || edittext_am18dlnn.equals("a.m")) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) {
										edittext20dl.setText(String.valueOf(00.00d));
										edittext_am20dl.setText("a.m");
									}
									else {
										if (edittext_am3d.getText().toString().equals("a.m")) {
											textview119dl.setVisibility(View.VISIBLE);
											edittext20dl.setText(String.valueOf(00.00d));
											edittext_am20dl.setText("a.m");
										}
										else {
											textview119dl.setVisibility(View.GONE);
											if (Double.parseDouble(edittext_am18dlnn) > Double.parseDouble(edittext_am3d.getText().toString())) {
												textview120dl.setVisibility(View.VISIBLE);
												edittext20dl.setText(String.valueOf(00.00d));
												edittext_am20dl.setText("a.m");
											}
											else {
												textview118d.setVisibility(View.GONE);
												textview120dl.setVisibility(View.GONE);
												edittext20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13d.getText().toString()) + (Double.parseDouble(edittext_am10d.getText().toString()) * Double.parseDouble(edittext_am18dlnn))));
												edittext_am20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13d.getText().toString()) + (Double.parseDouble(edittext_am10d.getText().toString()) * Double.parseDouble(edittext_am18dlnn))));
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
							edittext19dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext19dlnn = _param1.toString();
													
edittext19dl.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
									if ((edittext19dlnn.equals("") || edittext19dlnn.equals(".")) || edittext19dlnn.equals("-")) {
										edittext_am19dl.setText("a.m");
									}
									else {
										edittext_am19dl.setText(String.valueOf(Double.parseDouble(edittext19dlnn)));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext_am19dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am19dlnn = _param1.toString();
													
if (edittext_am19dlnn.equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m"))) {
										edittext21dl.setText(String.valueOf(00.00d));
									}
									else {
										edittext21dl.setText(_English_Decimal_Format(Double.parseDouble(edittext15d.getText().toString()) - Double.parseDouble(edittext_am19dlnn)));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext20dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext20dlnn = _param1.toString();
													
if (((((edittext_am18dl.getText().toString().equals("a.m") || textview118d.getVisibility() == View.VISIBLE) || (textview119dl.getVisibility() == View.VISIBLE || textview120dl.getVisibility() == View.VISIBLE)) || edittext_am10d.getText().toString().equals("a.m")) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) || (edittext_am19dl.getText().toString().equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m")))) {
										edittext22dl.setText(String.valueOf(00.00d));
									}
									else {
										edittext22dl.setText(_English_Decimal_Format(Double.parseDouble(edittext20dlnn) - Double.parseDouble(edittext21dl.getText().toString())));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext21dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext21dlnn = _param1.toString();
													
if (((((edittext_am18dl.getText().toString().equals("a.m") || textview118d.getVisibility() == View.VISIBLE) || (textview119dl.getVisibility() == View.VISIBLE || textview120dl.getVisibility() == View.VISIBLE)) || edittext_am10d.getText().toString().equals("a.m")) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) || (edittext_am19dl.getText().toString().equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m")))) {
										edittext22dl.setText(String.valueOf(00.00d));
									}
									else {
										edittext22dl.setText(_English_Decimal_Format(Double.parseDouble(edittext20dl.getText().toString()) - Double.parseDouble(edittext21dlnn)));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext22dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext22dlnn = _param1.toString();
													
if (((((edittext_am18dl.getText().toString().equals("a.m") || textview118d.getVisibility() == View.VISIBLE) || (textview119dl.getVisibility() == View.VISIBLE || textview120dl.getVisibility() == View.VISIBLE)) || edittext_am10d.getText().toString().equals("a.m")) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) || (edittext_am19dl.getText().toString().equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m")))) {
										textview121dl.setVisibility(View.GONE);
										textview122dl.setVisibility(View.GONE);
										textview123dl.setVisibility(View.GONE);
									}
									else {
										if (Double.parseDouble(edittext22dlnn) == 00.00d) {
											textview121dl.setVisibility(View.VISIBLE);
											textview122dl.setVisibility(View.GONE);
											textview123dl.setVisibility(View.GONE);
										}
										else {
											if (Double.parseDouble(edittext22dlnn) < 00.00d) {
												textview121dl.setVisibility(View.GONE);
												textview122dl.setVisibility(View.VISIBLE);
												textview123dl.setVisibility(View.GONE);
											}
											else {
												textview121dl.setVisibility(View.GONE);
												textview122dl.setVisibility(View.GONE);
												textview123dl.setVisibility(View.VISIBLE);
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
							/*
المقارنة
*/
							edittext_am18dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am18dlnn = _param1.toString();
													
if (edittext_am18dl.getText().toString().equals("a.m")) {
										edittext20dl.setText(String.valueOf(00.00d));
									}
									else {
										temp = 0;
										for (int i = 0; i < (int)(linear_dynamic_pipe_line_check_excavation_level.getChildCount()); i++) {
											View child=linear_dynamic_pipe_line_check_excavation_level.getChildAt(i); 
											TextView tempo =child.findViewById(R.id.edittext_am18dl);
											temp = Math.max(temp, Double.parseDouble(tempo.getText().toString()));
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
							edittext_am3d.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am3dnn = _param1.toString();
													
if ((edittext_am10d.getText().toString().equals("a.m") || (edittext_am8d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) || edittext_am18dl.getText().toString().equals("a.m")) {
										edittext20dl.setText(String.valueOf(00.00d));
										edittext_am20dl.setText("a.m");
									}
									else {
										if (edittext_am3d.getText().toString().equals("a.m")) {
											textview119dl.setVisibility(View.VISIBLE);
											textview118d.setVisibility(View.GONE);
											edittext20dl.setText(String.valueOf(00.00d));
											edittext_am20dl.setText("a.m");
										}
										else {
											textview119dl.setVisibility(View.GONE);
											if (temp > Double.parseDouble(edittext_am3dnn)) {
												textview118d.setVisibility(View.VISIBLE);
												edittext20dl.setText(String.valueOf(00.00d));
												edittext_am20dl.setText("a.m");
											}
											else {
												textview118d.setVisibility(View.GONE);
												textview120dl.setVisibility(View.GONE);
												edittext20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13d.getText().toString()) + (Double.parseDouble(edittext_am10d.getText().toString()) * Double.parseDouble(edittext_am18dl.getText().toString()))));
												edittext_am20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext13d.getText().toString()) + (Double.parseDouble(edittext_am10d.getText().toString()) * Double.parseDouble(edittext_am18dl.getText().toString()))));
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
							/*
EditText لزوم القراءات
*/
							edittext_am20dl.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am20dlnn = _param1.toString();
													
if (edittext_am15d.getText().toString().contains("a.m") || edittext_am20dlnn.contains("a.m")) {
										edittext27dl.setText(String.valueOf(0.00d));
									}
									else {
										edittext27dl.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15d.getText().toString()) - Double.parseDouble(edittext_am20dlnn)));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
							edittext_am15d.addTextChangedListener(new TextWatcher() {
											@Override
											public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													final String edittext_am15dnn = _param1.toString();
													
if (edittext_am20dl.getText().toString().contains("a.m") || edittext_am15dnn.contains("a.m")) {
										edittext27dl.setText(String.valueOf(0.00d));
									}
									else {
										edittext27dl.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15dnn) - Double.parseDouble(edittext_am20dl.getText().toString())));
									}
											}
											
											@Override
											public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
													
											}
											
											@Override
											public void afterTextChanged(Editable _param1) {
													
											}
									});
						}
					});
					close3dl.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							/*
اختيار اتجاه السريان والرفع
*/
							linear44dl.setVisibility(View.VISIBLE);
							textview141dl.setVisibility(View.VISIBLE);
							/*
الرفع
*/
							linear45dl.setVisibility(View.GONE);
							edittext18dl.setText("");
							edittext19dl.setText("");
						}
					});
					close2dl.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							edittext18dl.setText("");
							edittext19dl.setText("");
							_removeView(dynamic_pipe_line_check_excavation_level);
						}
					});
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		closed.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_pipe_line_check_excavation);
			}
		});
	}
	
	
	public String _English_Decimal_Format(final double _number) {
		return (String.format(Locale.ENGLISH,"%.03f", _number));
	}
	
}
