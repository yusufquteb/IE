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


public class EipSurveyingWorksActivity extends AppCompatActivity {
	
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
	private LinearLayout linear_dynamic_surveying_works;
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
	private AlertDialog.Builder dialog;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.eip_surveying_works);
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
		linear_dynamic_surveying_works = findViewById(R.id.linear_dynamic_surveying_works);
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
		dialog = new AlertDialog.Builder(this);
		
		button195.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/kbr9IvSLHII"));
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
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_surveying_works();
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
		_surveying_works();
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
		PrintHelper printHelper = new PrintHelper(EipSurveyingWorksActivity.this); //change the activity name
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
	
	
	public void _surveying_works() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_surveying_works = (LinearLayout) inflater.inflate(R.layout.eip_d_surveying_works, null, false);
		linear_dynamic_surveying_works.addView(dynamic_surveying_works);
		/*
أولا تعريفات الدينامك
*/
		/*
ImageView
*/
		final ImageView close1d= dynamic_surveying_works.findViewById(R.id.close1d);
		final ImageView close2d= dynamic_surveying_works.findViewById(R.id.close2d);
		/*
EditText
*/
		final EditText edittext555d = dynamic_surveying_works.findViewById(R.id.edittext555d);
		edittext555d.setSingleLine(true);
		edittext555d.setFocusableInTouchMode(true);
		final EditText edittext1d = dynamic_surveying_works.findViewById(R.id.edittext1d);
		edittext1d.setSingleLine(true);
		edittext1d.setFocusableInTouchMode(true);
		final EditText edittext_am1d = dynamic_surveying_works.findViewById(R.id.edittext_am1d);
		edittext_am1d.setSingleLine(true);
		edittext_am1d.setFocusableInTouchMode(true);
		final EditText edittext2d = dynamic_surveying_works.findViewById(R.id.edittext2d);
		edittext2d.setSingleLine(true);
		edittext2d.setFocusableInTouchMode(true);
		final EditText edittext_am2d = dynamic_surveying_works.findViewById(R.id.edittext_am2d);
		edittext_am2d.setSingleLine(true);
		edittext_am2d.setFocusableInTouchMode(true);
		final EditText edittext3d = dynamic_surveying_works.findViewById(R.id.edittext3d);
		edittext3d.setSingleLine(true);
		edittext3d.setFocusableInTouchMode(true);
		final EditText edittext5d = dynamic_surveying_works.findViewById(R.id.edittext5d);
		edittext5d.setSingleLine(true);
		edittext5d.setFocusableInTouchMode(true);
		final EditText edittext_am5d = dynamic_surveying_works.findViewById(R.id.edittext_am5d);
		edittext_am5d.setSingleLine(true);
		edittext_am5d.setFocusableInTouchMode(true);
		final EditText edittext6d = dynamic_surveying_works.findViewById(R.id.edittext6d);
		edittext6d.setSingleLine(true);
		edittext6d.setFocusableInTouchMode(true);
		final EditText edittext_am6d = dynamic_surveying_works.findViewById(R.id.edittext_am6d);
		edittext_am6d.setSingleLine(true);
		edittext_am6d.setFocusableInTouchMode(true);
		final EditText edittext7d = dynamic_surveying_works.findViewById(R.id.edittext7d);
		edittext7d.setSingleLine(true);
		edittext7d.setFocusableInTouchMode(true);
		final EditText edittext8d = dynamic_surveying_works.findViewById(R.id.edittext8d);
		edittext8d.setSingleLine(true);
		edittext8d.setFocusableInTouchMode(true);
		final EditText edittext9d = dynamic_surveying_works.findViewById(R.id.edittext9d);
		edittext9d.setSingleLine(true);
		edittext9d.setFocusableInTouchMode(true);
		final EditText edittext10d = dynamic_surveying_works.findViewById(R.id.edittext10d);
		edittext10d.setSingleLine(true);
		edittext10d.setFocusableInTouchMode(true);
		final EditText edittext11d = dynamic_surveying_works.findViewById(R.id.edittext11d);
		edittext11d.setSingleLine(true);
		edittext11d.setFocusableInTouchMode(true);
		/*
TextView
*/
		/*
Button
*/
		final Button button1d = dynamic_surveying_works.findViewById(R.id.button1d);
		/*
LinearLayout
*/
		final LinearLayout linear119d = dynamic_surveying_works.findViewById(R.id.linear119d);
		final LinearLayout linear_dynamic_surveying_works_level = dynamic_surveying_works.findViewById(R.id.linear_dynamic_surveying_works_level);
		final LinearLayout linear107d = dynamic_surveying_works.findViewById(R.id.linear107d);
		final LinearLayout linear108d = dynamic_surveying_works.findViewById(R.id.linear108d);
		/*
الترقيم
*/
		edittext555d.setText(String.valueOf((long)(linear_dynamic_surveying_works.getChildCount())));
		/*
الأوامر
*/
		edittext_am1d.setVisibility(View.GONE);
		edittext_am2d.setVisibility(View.GONE);
		edittext_am5d.setVisibility(View.GONE);
		edittext_am6d.setVisibility(View.GONE);
		linear107d.setVisibility(View.GONE);
		linear108d.setVisibility(View.GONE);
		edittext1d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext1dnn = _param1.toString();
								
edittext1d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if ((edittext1dnn.equals("") || edittext1dnn.equals(".")) || edittext1dnn.equals("-")) {
					edittext_am1d.setText("a.m");
				}
				else {
					edittext_am1d.setText(String.valueOf(Double.parseDouble(edittext1dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am1d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am1dnn = _param1.toString();
								
if (edittext_am1dnn.equals("a.m") || edittext_am2d.getText().toString().equals("a.m")) {
					edittext3d.setText("");
				}
				else {
					edittext3d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am1dnn) + Double.parseDouble(edittext_am2d.getText().toString())));
				}
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
								
edittext2d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if ((edittext2dnn.equals("") || edittext2dnn.equals(".")) || edittext2dnn.equals("-")) {
					edittext_am2d.setText("a.m");
				}
				else {
					edittext_am2d.setText(String.valueOf(Double.parseDouble(edittext2dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am2d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am2dnn = _param1.toString();
								
if (edittext_am1d.getText().toString().equals("a.m") || edittext_am2dnn.equals("a.m")) {
					edittext3d.setText("");
				}
				else {
					edittext3d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am1d.getText().toString()) + Double.parseDouble(edittext_am2dnn)));
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
								
if (edittext3dnn.equals("") || ((edittext5d.getText().toString().equals("") || edittext5d.getText().toString().equals(".")) || edittext5d.getText().toString().equals("-"))) {
					edittext6d.setText("");
				}
				else {
					edittext6d.setText(_English_Decimal_Format(Double.parseDouble(edittext3dnn) - Double.parseDouble(edittext5d.getText().toString())));
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
								
edittext5d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((edittext5dnn.equals("") || edittext5dnn.equals(".")) || edittext5dnn.equals("-")) {
					edittext_am5d.setText(String.valueOf(0.00d));
				}
				else {
					edittext_am5d.setText(String.valueOf(1));
				}
				if (edittext3d.getText().toString().equals("") || ((edittext5dnn.equals("") || edittext5dnn.equals(".")) || edittext5dnn.equals("-"))) {
					edittext6d.setText("");
				}
				else {
					edittext6d.setText(_English_Decimal_Format(Double.parseDouble(edittext3d.getText().toString()) - Double.parseDouble(edittext5dnn)));
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
								
edittext9d.setText(String.valueOf((long)(Double.parseDouble(edittext_am5dnn) + Double.parseDouble(edittext7d.getText().toString()))));
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
								
if (edittext6dnn.equals("")) {
					edittext_am6d.setText("0.00");
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
								
edittext10d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am6dnn) + Double.parseDouble(edittext8d.getText().toString())));
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
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
					final LinearLayout dynamic_surveying_works_level = (LinearLayout) inflater.inflate(R.layout.eip_d_surveying_works_level, null, false);
					linear_dynamic_surveying_works_level.addView(dynamic_surveying_works_level);
					/*
أولا تعريفات الدينامك
*/
					/*
ImageView
*/
					final ImageView close3dl= dynamic_surveying_works_level.findViewById(R.id.close3dl);
					/*
EditText
*/
					final EditText edittext4dl = dynamic_surveying_works_level.findViewById(R.id.edittext4dl);
					edittext4dl.setSingleLine(true);
					edittext4dl.setFocusableInTouchMode(true);
					final EditText edittext5dl = dynamic_surveying_works_level.findViewById(R.id.edittext5dl);
					edittext5dl.setSingleLine(true);
					edittext5dl.setFocusableInTouchMode(true);
					final EditText edittext_am5dl = dynamic_surveying_works_level.findViewById(R.id.edittext_am5dl);
					edittext_am5dl.setSingleLine(true);
					edittext_am5dl.setFocusableInTouchMode(true);
					final EditText edittext6dl = dynamic_surveying_works_level.findViewById(R.id.edittext6dl);
					edittext6dl.setSingleLine(true);
					edittext6dl.setFocusableInTouchMode(true);
					final EditText edittext_am6dl = dynamic_surveying_works_level.findViewById(R.id.edittext_am6dl);
					edittext_am6dl.setSingleLine(true);
					edittext_am6dl.setFocusableInTouchMode(true);
					/*
الترقيم
*/
					edittext4dl.setText(String.valueOf((long)(linear_dynamic_surveying_works_level.getChildCount() + 1)));
					/*
الأوامر
*/
					edittext_am5dl.setVisibility(View.GONE);
					edittext_am6dl.setVisibility(View.GONE);
					edittext3d.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext3dnn = _param1.toString();
											
if (edittext3dnn.equals("") || ((edittext5dl.getText().toString().equals("") || edittext5dl.getText().toString().equals(".")) || edittext5dl.getText().toString().equals("-"))) {
								edittext6dl.setText("");
							}
							else {
								edittext6dl.setText(_English_Decimal_Format(Double.parseDouble(edittext3dnn) - Double.parseDouble(edittext5dl.getText().toString())));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext5dl.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext5dlnn = _param1.toString();
											
edittext5dl.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
							if ((edittext5dlnn.equals("") || edittext5dlnn.equals(".")) || edittext5dlnn.equals("-")) {
								edittext_am5dl.setText(String.valueOf(0.00d));
							}
							else {
								edittext_am5dl.setText(String.valueOf(1));
							}
							if (edittext3d.getText().toString().equals("") || ((edittext5dlnn.equals("") || edittext5dlnn.equals(".")) || edittext5dlnn.equals("-"))) {
								edittext6dl.setText("");
							}
							else {
								edittext6dl.setText(_English_Decimal_Format(Double.parseDouble(edittext3d.getText().toString()) - Double.parseDouble(edittext5dlnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am5dl.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am5dlnn = _param1.toString();
											
temp = 0;
							for (int i = 0; i < (int)(linear_dynamic_surveying_works_level.getChildCount()); i++) {
								View child=linear_dynamic_surveying_works_level.getChildAt(i); 
								TextView tempo =child.findViewById(R.id.edittext_am5dl);
								temp = temp + Double.parseDouble(tempo.getText().toString());
							}
							edittext7d.setText(_English_Decimal_Format(temp));
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext6dl.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext6dlnn = _param1.toString();
											
if (edittext6dlnn.equals("")) {
								edittext_am6dl.setText("0.00");
							}
							else {
								edittext_am6dl.setText(String.valueOf(Double.parseDouble(edittext6dlnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am6dl.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am6dlnn = _param1.toString();
											
temp1 = 0;
							for (int i = 0; i < (int)(linear_dynamic_surveying_works_level.getChildCount()); i++) {
								View child=linear_dynamic_surveying_works_level.getChildAt(i); 
								TextView tempo1 =child.findViewById(R.id.edittext_am6dl);
								temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
							}
							edittext8d.setText(_English_Decimal_Format(temp1));
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					close3dl.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							_removeView(dynamic_surveying_works_level);
							edittext5dl.setText("");
						}
					});
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		edittext7d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext7dnn = _param1.toString();
								
edittext9d.setText(String.valueOf((long)(Double.parseDouble(edittext_am5d.getText().toString()) + Double.parseDouble(edittext7dnn))));
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
								
edittext10d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am6d.getText().toString()) + Double.parseDouble(edittext8dnn)));
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
								
if (Double.parseDouble(edittext9dnn) == 00.00d) {
					edittext11d.setText(_English_Decimal_Format(0.000d));
				}
				else {
					edittext11d.setText(_English_Decimal_Format(Double.parseDouble(edittext10d.getText().toString()) / Double.parseDouble(edittext9dnn)));
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
								
if (Double.parseDouble(edittext9d.getText().toString()) == 00.00d) {
					edittext11d.setText(_English_Decimal_Format(0.000d));
				}
				else {
					edittext11d.setText(_English_Decimal_Format(Double.parseDouble(edittext10dnn) / Double.parseDouble(edittext9d.getText().toString())));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		close2d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear119d.setVisibility(View.GONE);
				edittext5d.setText("");
			}
		});
		close1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_surveying_works);
				edittext1d.setText("");
				edittext2d.setText("");
				edittext5d.setText("");
			}
		});
	}
	
}
