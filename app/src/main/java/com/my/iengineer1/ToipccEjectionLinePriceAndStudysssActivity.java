package com.my.iengineer1;

import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
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
import androidx.print.PrintHelper;


public class ToipccEjectionLinePriceAndStudysssActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private double temp1 = 0;
	private double temp3 = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview1m;
	private LinearLayout linear176;
	private LinearLayout dynamic_all;
	private LinearLayout add_dynamic_element_lin;
	private HorizontalScrollView hscroll888;
	private LinearLayout linear755;
	private LinearLayout linear713;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear289;
	private LinearLayout linear720;
	private LinearLayout linear707;
	private TextView textview810;
	private TextView textview811;
	private TextView textview583;
	private EditText edittext1299;
	private TextView textview579;
	private EditText edittext1255;
	private TextView textview580;
	private Button button1;
	private TextView textview809;
	private TextView textview704;
	private Button add_dynamic_pipe_line;
	private TextView textview19;
	private TextView textview1417;
	private LinearLayout linear757;
	private TextView textview1420;
	private EditText edittext18;
	
	private AlertDialog.Builder dialog;
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_ejection_line_price_and_studysss);
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
		textview1m = findViewById(R.id.textview1m);
		linear176 = findViewById(R.id.linear176);
		dynamic_all = findViewById(R.id.dynamic_all);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		hscroll888 = findViewById(R.id.hscroll888);
		linear755 = findViewById(R.id.linear755);
		linear713 = findViewById(R.id.linear713);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear289 = findViewById(R.id.linear289);
		linear720 = findViewById(R.id.linear720);
		linear707 = findViewById(R.id.linear707);
		textview810 = findViewById(R.id.textview810);
		textview811 = findViewById(R.id.textview811);
		textview583 = findViewById(R.id.textview583);
		edittext1299 = findViewById(R.id.edittext1299);
		textview579 = findViewById(R.id.textview579);
		edittext1255 = findViewById(R.id.edittext1255);
		textview580 = findViewById(R.id.textview580);
		button1 = findViewById(R.id.button1);
		textview809 = findViewById(R.id.textview809);
		textview704 = findViewById(R.id.textview704);
		add_dynamic_pipe_line = findViewById(R.id.add_dynamic_pipe_line);
		textview19 = findViewById(R.id.textview19);
		textview1417 = findViewById(R.id.textview1417);
		linear757 = findViewById(R.id.linear757);
		textview1420 = findViewById(R.id.textview1420);
		edittext18 = findViewById(R.id.edittext18);
		dialog = new AlertDialog.Builder(this);
		internet = new RequestNetwork(this);
		
		add_dynamic_pipe_line.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_ToipccEjectionLinePriceAndStudysss();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext18.addTextChangedListener(new TextWatcher() {
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
		add_dynamic_pipe_line.performClick();
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
	public void _ToipccEjectionLinePriceAndStudysss() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout ll_mainDynamic = (LinearLayout) inflater.inflate(R.layout.toipcc_d_ejection_line_price_and_studysss, null, false);
		dynamic_all.addView(ll_mainDynamic);
		/*
تعريفات ال EditText
*/
		final EditText element_num_d = ll_mainDynamic.findViewById(R.id.element_num_d);
		element_num_d.setSingleLine(true);
		element_num_d.setFocusableInTouchMode(true);
		final EditText element_nums_d = ll_mainDynamic.findViewById(R.id.element_nums_d);
		element_nums_d.setSingleLine(true);
		element_nums_d.setFocusableInTouchMode(true);
		final EditText edittext7d = ll_mainDynamic.findViewById(R.id.edittext7d);
		edittext7d.setSingleLine(true);
		edittext7d.setFocusableInTouchMode(true);
		final EditText edittext8d = ll_mainDynamic.findViewById(R.id.edittext8d);
		edittext8d.setSingleLine(true);
		edittext8d.setFocusableInTouchMode(true);
		final EditText edittext9d = ll_mainDynamic.findViewById(R.id.edittext9d);
		edittext9d.setSingleLine(true);
		edittext9d.setFocusableInTouchMode(true);
		final EditText edittext10d = ll_mainDynamic.findViewById(R.id.edittext10d);
		edittext10d.setSingleLine(true);
		edittext10d.setFocusableInTouchMode(true);
		final EditText edittext11d = ll_mainDynamic.findViewById(R.id.edittext11d);
		edittext11d.setSingleLine(true);
		edittext11d.setFocusableInTouchMode(true);
		final EditText edittext12d = ll_mainDynamic.findViewById(R.id.edittext12d);
		edittext12d.setSingleLine(true);
		edittext12d.setFocusableInTouchMode(true);
		final EditText edittext13d = ll_mainDynamic.findViewById(R.id.edittext13d);
		edittext13d.setSingleLine(true);
		edittext13d.setFocusableInTouchMode(true);
		final EditText edittext14d = ll_mainDynamic.findViewById(R.id.edittext14d);
		edittext14d.setSingleLine(true);
		edittext14d.setFocusableInTouchMode(true);
		final EditText edittext15d = ll_mainDynamic.findViewById(R.id.edittext15d);
		edittext15d.setSingleLine(true);
		edittext15d.setFocusableInTouchMode(true);
		final EditText edittext16d = ll_mainDynamic.findViewById(R.id.edittext16d);
		edittext16d.setSingleLine(true);
		edittext16d.setFocusableInTouchMode(true);
		final EditText edittext17d = ll_mainDynamic.findViewById(R.id.edittext17d);
		edittext17d.setSingleLine(true);
		edittext17d.setFocusableInTouchMode(true);
		/*
تعريفات ال Button
*/
		final Button button2d = ll_mainDynamic.findViewById(R.id.button2d);
		final ImageView close = ll_mainDynamic.findViewById(R.id.close);
		/*
ثانيآ  :
أوامر الترقيم
*/
		element_num_d.setText(String.valueOf((long)(dynamic_all.getChildCount())));
		element_nums_d.setText(String.valueOf((long)(dynamic_all.getChildCount())));
		element_num_d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String element_num_dnn = _param1.toString();
								
element_num_d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 3)});
				if ((element_num_dnn.equals("") || element_num_dnn.equals(".")) || (element_num_dnn.equals("-") || (Double.parseDouble(element_num_dnn) < 0))) {
					element_nums_d.setText("");
				}
				else {
					element_nums_d.setText(element_num_dnn);
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
رابعآ : الأوامر
*/
		edittext7d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext7dnn = _param1.toString();
								
edittext7d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext13d.setText(String.valueOf(00.00));
				edittext15d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
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
								
edittext8d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext13d.setText(String.valueOf(00.00));
				edittext15d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
				edittext15d.setTextColor(0xFFE91E63);
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
				edittext13d.setText(String.valueOf(00.00));
				edittext15d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
				edittext15d.setTextColor(0xFFE91E63);
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
				edittext15d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
				edittext15d.setTextColor(0xFFE91E63);
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
								
edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext14d.setText(String.valueOf(00.00));
				edittext14d.setTextColor(0xFFE91E63);
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
		edittext12d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext12dnn = _param1.toString();
								
edittext12d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext14d.setText(String.valueOf(00.00));
				edittext14d.setTextColor(0xFFE91E63);
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
		button2d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))) || (((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) {
						edittext9d.setText(String.valueOf(19));
					}
					if ((edittext10d.getText().toString().equals("") || edittext10d.getText().toString().equals(".")) || (edittext10d.getText().toString().equals("-") || (Double.parseDouble(edittext10d.getText().toString()) < 0))) {
						edittext10d.setText(String.valueOf(30));
					}
					if ((edittext12d.getText().toString().equals("") || edittext12d.getText().toString().equals(".")) || (edittext12d.getText().toString().equals("-") || (Double.parseDouble(edittext12d.getText().toString()) < 0))) {
						edittext12d.setText(String.valueOf(0.40d));
					}
					edittext13d.setText(String.valueOf((Double.parseDouble(edittext7d.getText().toString()) * Double.parseDouble(edittext8d.getText().toString())) * ((1 + (Double.parseDouble(edittext9d.getText().toString()) / 100)) * (1 + (Double.parseDouble(edittext10d.getText().toString()) / 100)))));
					edittext14d.setText(String.valueOf(Double.parseDouble(edittext11d.getText().toString()) * ((1.3d + (Double.parseDouble(edittext12d.getText().toString()) / 100)) / 1.3d)));
					edittext15d.setText(String.valueOf(Double.parseDouble(edittext13d.getText().toString()) + Double.parseDouble(edittext14d.getText().toString())));
					edittext13d.setTextColor(0xFF000000);
					edittext14d.setTextColor(0xFF000000);
					edittext15d.setTextColor(0xFF000000);
				}
			}
		});
		edittext15d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext15dnn = _param1.toString();
								
if ((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))) {
					edittext17d.setText(String.valueOf(00.00d));
				}
				else {
					edittext17d.setText(String.valueOf(Double.parseDouble(edittext15dnn) * Double.parseDouble(edittext16d.getText().toString())));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext16d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext16dnn = _param1.toString();
								
edittext16d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				if ((edittext16dnn.equals("") || edittext16dnn.equals(".")) || (edittext16dnn.equals("-") || (Double.parseDouble(edittext16dnn) < 0))) {
					edittext17d.setText(String.valueOf(00.00d));
				}
				else {
					edittext17d.setText(String.valueOf(Double.parseDouble(edittext15d.getText().toString()) * Double.parseDouble(edittext16dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext17d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext17dnn = _param1.toString();
								
temp3 = 0;
				for (int i = 0; i < (int)(dynamic_all.getChildCount()); i++) {
					View child=dynamic_all.getChildAt(i); 
					TextView tempo3 =child.findViewById(R.id.edittext17d);
					temp3 = temp3 + Double.parseDouble(tempo3.getText().toString());
				}
				edittext18.setText(String.valueOf(temp3));
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
				_removeView(ll_mainDynamic);
				/*
المجموع الدينامك لكمية الخلطة الأسفلتية طن بعد الحذف
*/
				temp3 = 0;
				for (int i = 0; i < (int)(dynamic_all.getChildCount()); i++) {
					View child=dynamic_all.getChildAt(i); 
					TextView tempo3 =child.findViewById(R.id.edittext17d);
					temp3 = temp3 + Double.parseDouble(tempo3.getText().toString());
				}
				edittext18.setText(String.valueOf(temp3));
			}
		});
		final TextView textview9d = ll_mainDynamic.findViewById(R.id.textview9d);
		textview9d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* نسبة التحميلات علي التوريد\n( % )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ١٩ ٪");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		final TextView textview10d = ll_mainDynamic.findViewById(R.id.textview10d);
		textview10d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* نسبة المصاريف الأدارية والأرباح علي التوريد ( % )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٣٠ ٪");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		final TextView textview12d = ll_mainDynamic.findViewById(R.id.textview12d);
		textview12d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* نسبة مصاريف التصميم والأستشاري المصمم ( % )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٤٠ ٪");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
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
		PrintHelper printHelper = new PrintHelper(getApplicationContext()); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
}
