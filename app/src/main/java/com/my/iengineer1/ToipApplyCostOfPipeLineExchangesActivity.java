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


public class ToipApplyCostOfPipeLineExchangesActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private double temp1 = 0;
	private String path = "";
	private double temp = 0;
	private double temp2 = 0;
	private double temp3 = 0;
	private double temp4 = 0;
	private double temp5 = 0;
	private double temp6 = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview53;
	private LinearLayout linear713;
	private LinearLayout linear176;
	private TextView textview1148;
	private LinearLayout linear_dynamic_apply_cost_of_pipe_line_exchange;
	private LinearLayout add_dynamic_element_lin;
	private LinearLayout linear40d;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear39;
	private HorizontalScrollView hscroll7;
	private LinearLayout linear723;
	private Button button195;
	private LinearLayout linear720;
	private Button button197;
	private LinearLayout linear_close;
	private TextView textview1167;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private TextView textview555;
	private ImageView close;
	private LinearLayout linear724;
	private TextView textview583;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private TextView textview585;
	private TextView textview584;
	private Button button196;
	private TextView textview809;
	private Button button2;
	private TextView textview1176;
	private Button button1;
	private TextView textview1136;
	private EditText edittext3;
	private TextView textview596;
	private TextView textview3;
	private TextView textview601;
	private EditText edittext49;
	private TextView textview602;
	private TextView textview39;
	private TextView textview1174;
	private EditText edittext50;
	private TextView textview1175;
	private TextView textview50;
	
	private Intent price = new Intent();
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	private AlertDialog.Builder dialog;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toip_apply_cost_of_pipe_line_exchanges);
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
		linear713 = findViewById(R.id.linear713);
		linear176 = findViewById(R.id.linear176);
		textview1148 = findViewById(R.id.textview1148);
		linear_dynamic_apply_cost_of_pipe_line_exchange = findViewById(R.id.linear_dynamic_apply_cost_of_pipe_line_exchange);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		linear40d = findViewById(R.id.linear40d);
		hscroll1 = findViewById(R.id.hscroll1);
		linear39 = findViewById(R.id.linear39);
		hscroll7 = findViewById(R.id.hscroll7);
		linear723 = findViewById(R.id.linear723);
		button195 = findViewById(R.id.button195);
		linear720 = findViewById(R.id.linear720);
		button197 = findViewById(R.id.button197);
		linear_close = findViewById(R.id.linear_close);
		textview1167 = findViewById(R.id.textview1167);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		close = findViewById(R.id.close);
		linear724 = findViewById(R.id.linear724);
		textview583 = findViewById(R.id.textview583);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		button196 = findViewById(R.id.button196);
		textview809 = findViewById(R.id.textview809);
		button2 = findViewById(R.id.button2);
		textview1176 = findViewById(R.id.textview1176);
		button1 = findViewById(R.id.button1);
		textview1136 = findViewById(R.id.textview1136);
		edittext3 = findViewById(R.id.edittext3);
		textview596 = findViewById(R.id.textview596);
		textview3 = findViewById(R.id.textview3);
		textview601 = findViewById(R.id.textview601);
		edittext49 = findViewById(R.id.edittext49);
		textview602 = findViewById(R.id.textview602);
		textview39 = findViewById(R.id.textview39);
		textview1174 = findViewById(R.id.textview1174);
		edittext50 = findViewById(R.id.edittext50);
		textview1175 = findViewById(R.id.textview1175);
		textview50 = findViewById(R.id.textview50);
		internet = new RequestNetwork(this);
		dialog = new AlertDialog.Builder(this);
		
		button195.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/WNya7wCyO5I"));
				startActivity(price);
			}
		});
		
		button197.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear176.setVisibility(View.VISIBLE);
			}
		});
		
		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear176.setVisibility(View.GONE);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_toip_d_apply_cost_of_pipe_line_exchangess();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_toip_apply_cost_of_pipe_line_exchanges();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(_charSeq) == 0) {
					edittext50.setText(String.valueOf(0.00d));
				}
				else {
					edittext50.setText(_English_Decimal_Format(Double.parseDouble(edittext49.getText().toString()) / Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext49.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(edittext3.getText().toString()) == 0) {
					edittext50.setText(String.valueOf(0.00d));
				}
				else {
					edittext50.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) / Double.parseDouble(edittext3.getText().toString())));
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
				linear176.setVisibility(View.GONE);
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
		linear176.setVisibility(View.GONE);
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
		PrintHelper printHelper = new PrintHelper(ToipApplyCostOfPipeLineExchangesActivity.this); //change the activity name
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
	
	
	public void _toip_apply_cost_of_pipe_line_exchanges() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_apply_cost_of_pipe_line_exchange = (LinearLayout) inflater.inflate(R.layout.toip_d_apply_cost_of_pipe_line_exchange, null, false);
		linear_dynamic_apply_cost_of_pipe_line_exchange.addView(dynamic_apply_cost_of_pipe_line_exchange);
		/*
أولا تعريفات الدينامك
*/
		/*
ImageView
*/
		final ImageView close1d= dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.close1d);
		final ImageView print1d= dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.print1d);
		/*
EditText
*/
		final EditText edittext3d = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.edittext3d);
		edittext3d.setSingleLine(true);
		edittext3d.setFocusableInTouchMode(true);
		final EditText edittext_am3d = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.edittext_am3d);
		edittext_am3d.setSingleLine(true);
		edittext_am3d.setFocusableInTouchMode(true);
		final EditText edittext49d = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.edittext49d);
		edittext49d.setSingleLine(true);
		edittext49d.setFocusableInTouchMode(true);
		final EditText edittext50d = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.edittext50d);
		edittext50d.setSingleLine(true);
		edittext50d.setFocusableInTouchMode(true);
		/*
Button
*/
		final Button add_dynamic_equipments = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.add_dynamic_equipments);
		final Button add_dynamic_labours = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.add_dynamic_labours);
		/*
LinearLayout
*/
		final LinearLayout linear_dynamic_equipments = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.linear_dynamic_equipments);
		/*
ثانيآ المدخلات والمعادلات
*/
		/*
التعليقات المخفية ومربعات الأوامر المخفية
*/
		edittext_am3d.setVisibility(View.GONE);
		/*
الأوامر
*/
		edittext3d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext3dnn = _param1.toString();
								
edittext3d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if ((edittext3dnn.equals("") || edittext3dnn.equals(".")) || (edittext3dnn.equals("-") || ((Double.parseDouble(edittext3dnn) < 0) || (Double.parseDouble(edittext3dnn) == 0)))) {
					edittext_am3d.setText(String.valueOf(Double.parseDouble("0")));
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
		edittext_am3d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am3dnn = _param1.toString();
								
if (Double.parseDouble(edittext_am3dnn) == 0) {
					edittext50d.setText(String.valueOf(0.00d));
				}
				else {
					edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext49d.getText().toString()) / Double.parseDouble(edittext_am3dnn)));
				}
				temp3 = 0;
				for (int i = 0; i < (int)(linear_dynamic_apply_cost_of_pipe_line_exchange.getChildCount()); i++) {
					View child=linear_dynamic_apply_cost_of_pipe_line_exchange.getChildAt(i); 
					TextView tempo3 =child.findViewById(R.id.edittext_am3d);
					temp3 = temp3 + Double.parseDouble(tempo3.getText().toString());
				}
				edittext3.setText(_English_Decimal_Format(temp3));
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		add_dynamic_equipments.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
					final LinearLayout dynamic_equipments = (LinearLayout) inflater.inflate(R.layout.toip_d_equipments_and_labours, null, false);
					linear_dynamic_equipments.addView(dynamic_equipments);
					/*
أولا تعريفات الدينامك
*/
					/*
ImageView
*/
					final ImageView close_dd= dynamic_equipments.findViewById(R.id.close_dd);
					/*
EditText
*/
					final EditText edittext15dd = dynamic_equipments.findViewById(R.id.edittext15dd);
					edittext15dd.setSingleLine(true);
					edittext15dd.setFocusableInTouchMode(true);
					final EditText edittext_am15dd = dynamic_equipments.findViewById(R.id.edittext_am15dd);
					edittext_am15dd.setSingleLine(true);
					edittext_am15dd.setFocusableInTouchMode(true);
					final EditText edittext16dd = dynamic_equipments.findViewById(R.id.edittext16dd);
					edittext16dd.setSingleLine(true);
					edittext16dd.setFocusableInTouchMode(true);
					final EditText edittext_am16dd = dynamic_equipments.findViewById(R.id.edittext_am16dd);
					edittext_am16dd.setSingleLine(true);
					edittext_am16dd.setFocusableInTouchMode(true);
					final EditText edittext17dd = dynamic_equipments.findViewById(R.id.edittext17dd);
					edittext17dd.setSingleLine(true);
					edittext17dd.setFocusableInTouchMode(true);
					final EditText edittext_am17dd = dynamic_equipments.findViewById(R.id.edittext_am17dd);
					edittext_am17dd.setSingleLine(true);
					edittext_am17dd.setFocusableInTouchMode(true);
					final EditText edittext21dd = dynamic_equipments.findViewById(R.id.edittext21dd);
					edittext21dd.setSingleLine(true);
					edittext21dd.setFocusableInTouchMode(true);
					final EditText edittext22dd = dynamic_equipments.findViewById(R.id.edittext22dd);
					edittext22dd.setSingleLine(true);
					edittext22dd.setFocusableInTouchMode(true);
					final EditText edittext23dd = dynamic_equipments.findViewById(R.id.edittext23dd);
					edittext23dd.setSingleLine(true);
					edittext23dd.setFocusableInTouchMode(true);
					/*
TextView
*/
					final TextView textview14dd = dynamic_equipments.findViewById(R.id.textview14dd);
					final TextView textview15dd = dynamic_equipments.findViewById(R.id.textview15dd);
					final TextView textview16dd = dynamic_equipments.findViewById(R.id.textview16dd);
					final TextView textview17dd = dynamic_equipments.findViewById(R.id.textview17dd);
					final TextView textview23dd = dynamic_equipments.findViewById(R.id.textview23dd);
					/*
ثانيآ المدخلات والمعادلات
*/
					/*
التعليقات المخفية ومربعات الأوامر المخفية
*/
					edittext_am15dd.setVisibility(View.GONE);
					edittext_am16dd.setVisibility(View.GONE);
					edittext_am17dd.setVisibility(View.GONE);
					/*
الأوامر
*/
					edittext_am3d.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am3dnn = _param1.toString();
											
if (((Double.parseDouble(edittext_am3dnn) == 0) || edittext_am15dd.getText().toString().equals("a.m")) || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext21dd.setText(String.valueOf(0.00d));
								edittext22dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString())) == 0) {
									edittext21dd.setText(String.valueOf(0.00d));
									edittext22dd.setText(String.valueOf(0.00d));
								}
								else {
									edittext21dd.setText(_English_Decimal_Format(Double.parseDouble(edittext_am3dnn) / (Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString()))));
									edittext22dd.setText(String.valueOf((long)(Math.ceil(Double.parseDouble(edittext_am3dnn) / (Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString()))))));
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
					edittext15dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext15ddnn = _param1.toString();
											
if ((edittext15ddnn.equals("") || edittext15ddnn.equals(".")) || (edittext15ddnn.equals("-") || (Double.parseDouble(edittext15ddnn) < 0))) {
								edittext_am15dd.setText("a.m");
							}
							else {
								edittext_am15dd.setText(String.valueOf(Double.parseDouble(edittext15ddnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am15dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am15ddnn = _param1.toString();
											
if (((Double.parseDouble(edittext_am3d.getText().toString()) == 0) || edittext_am15ddnn.equals("a.m")) || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext21dd.setText(String.valueOf(0.00d));
								edittext22dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((Double.parseDouble(edittext_am15ddnn) * Double.parseDouble(edittext_am17dd.getText().toString())) == 0) {
									edittext21dd.setText(String.valueOf(0.00d));
									edittext22dd.setText(String.valueOf(0.00d));
								}
								else {
									edittext21dd.setText(_English_Decimal_Format(Double.parseDouble(edittext_am3d.getText().toString()) / (Double.parseDouble(edittext_am15ddnn) * Double.parseDouble(edittext_am17dd.getText().toString()))));
									edittext22dd.setText(String.valueOf((long)(Math.ceil(Double.parseDouble(edittext_am3d.getText().toString()) / (Double.parseDouble(edittext_am15ddnn) * Double.parseDouble(edittext_am17dd.getText().toString()))))));
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
					edittext16dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext16ddnn = _param1.toString();
											
if ((edittext16ddnn.equals("") || edittext16ddnn.equals(".")) || (edittext16ddnn.equals("-") || (Double.parseDouble(edittext16ddnn) < 0))) {
								edittext_am16dd.setText("a.m");
							}
							else {
								edittext_am16dd.setText(String.valueOf(Double.parseDouble(edittext16ddnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am16dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am16ddnn = _param1.toString();
											
if (edittext_am16ddnn.equals("a.m") || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((edittext22dd.getText().toString().equals("") || edittext22dd.getText().toString().equals(".")) || (edittext22dd.getText().toString().equals("-") || (Double.parseDouble(edittext22dd.getText().toString()) < 0))) {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16ddnn) * Double.parseDouble(edittext_am17dd.getText().toString())) * Double.parseDouble(edittext21dd.getText().toString())));
								}
								else {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16ddnn) * Double.parseDouble(edittext_am17dd.getText().toString())) * Double.parseDouble(edittext22dd.getText().toString())));
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
					edittext17dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext17ddnn = _param1.toString();
											
if ((edittext17ddnn.equals("") || edittext17ddnn.equals(".")) || (edittext17ddnn.equals("-") || (Double.parseDouble(edittext17ddnn) < 0))) {
								edittext_am17dd.setText("a.m");
							}
							else {
								edittext_am17dd.setText(String.valueOf(Double.parseDouble(edittext17ddnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am17dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am17ddnn = _param1.toString();
											
if (((Double.parseDouble(edittext_am3d.getText().toString()) == 0) || edittext_am15dd.getText().toString().equals("a.m")) || edittext_am17ddnn.equals("a.m")) {
								edittext21dd.setText(String.valueOf(0.00d));
								edittext22dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am17ddnn)) == 0) {
									edittext21dd.setText(String.valueOf(0.00d));
									edittext22dd.setText(String.valueOf(0.00d));
								}
								else {
									edittext21dd.setText(_English_Decimal_Format(Double.parseDouble(edittext_am3d.getText().toString()) / (Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am17ddnn))));
									edittext22dd.setText(String.valueOf((long)(Math.ceil(Double.parseDouble(edittext_am3d.getText().toString()) / (Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am17ddnn))))));
								}
							}
							if (edittext_am16dd.getText().toString().equals("a.m") || edittext_am17ddnn.equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((edittext22dd.getText().toString().equals("") || edittext22dd.getText().toString().equals(".")) || (edittext22dd.getText().toString().equals("-") || (Double.parseDouble(edittext22dd.getText().toString()) < 0))) {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16dd.getText().toString()) * Double.parseDouble(edittext_am17ddnn)) * Double.parseDouble(edittext21dd.getText().toString())));
								}
								else {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16dd.getText().toString()) * Double.parseDouble(edittext_am17ddnn)) * Double.parseDouble(edittext22dd.getText().toString())));
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
					edittext21dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext21ddnn = _param1.toString();
											
if (edittext_am16dd.getText().toString().equals("a.m") || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((edittext22dd.getText().toString().equals("") || edittext22dd.getText().toString().equals(".")) || (edittext22dd.getText().toString().equals("-") || (Double.parseDouble(edittext22dd.getText().toString()) < 0))) {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString())) * Double.parseDouble(edittext21ddnn)));
								}
								else {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString())) * Double.parseDouble(edittext22dd.getText().toString())));
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
					edittext22dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext22ddnn = _param1.toString();
											
if (edittext_am16dd.getText().toString().equals("a.m") || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((edittext22ddnn.equals("") || edittext22ddnn.equals(".")) || (edittext22ddnn.equals("-") || (Double.parseDouble(edittext22ddnn) < 0))) {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString())) * Double.parseDouble(edittext21dd.getText().toString())));
								}
								else {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString())) * Double.parseDouble(edittext22ddnn)));
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
					edittext23dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext23ddnn = _param1.toString();
											
temp = 0;
							for (int i = 0; i < (int)(linear_dynamic_equipments.getChildCount()); i++) {
								View child=linear_dynamic_equipments.getChildAt(i); 
								TextView tempo =child.findViewById(R.id.edittext23dd);
								temp = temp + Double.parseDouble(tempo.getText().toString());
							}
							edittext49d.setText(_English_Decimal_Format(temp));
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					close_dd.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							_removeView(dynamic_equipments);
							edittext15dd.setText("");
							edittext16dd.setText("");
							edittext17dd.setText("");
						}
					});
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		add_dynamic_labours.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
					final LinearLayout dynamic_equipments = (LinearLayout) inflater.inflate(R.layout.toip_d_equipments_and_labours, null, false);
					linear_dynamic_equipments.addView(dynamic_equipments);
					/*
أولا تعريفات الدينامك
*/
					/*
ImageView
*/
					final ImageView close_dd= dynamic_equipments.findViewById(R.id.close_dd);
					/*
EditText
*/
					final EditText edittext15dd = dynamic_equipments.findViewById(R.id.edittext15dd);
					edittext15dd.setSingleLine(true);
					edittext15dd.setFocusableInTouchMode(true);
					final EditText edittext_am15dd = dynamic_equipments.findViewById(R.id.edittext_am15dd);
					edittext_am15dd.setSingleLine(true);
					edittext_am15dd.setFocusableInTouchMode(true);
					final EditText edittext16dd = dynamic_equipments.findViewById(R.id.edittext16dd);
					edittext16dd.setSingleLine(true);
					edittext16dd.setFocusableInTouchMode(true);
					final EditText edittext_am16dd = dynamic_equipments.findViewById(R.id.edittext_am16dd);
					edittext_am16dd.setSingleLine(true);
					edittext_am16dd.setFocusableInTouchMode(true);
					final EditText edittext17dd = dynamic_equipments.findViewById(R.id.edittext17dd);
					edittext17dd.setSingleLine(true);
					edittext17dd.setFocusableInTouchMode(true);
					final EditText edittext_am17dd = dynamic_equipments.findViewById(R.id.edittext_am17dd);
					edittext_am17dd.setSingleLine(true);
					edittext_am17dd.setFocusableInTouchMode(true);
					final EditText edittext21dd = dynamic_equipments.findViewById(R.id.edittext21dd);
					edittext21dd.setSingleLine(true);
					edittext21dd.setFocusableInTouchMode(true);
					final EditText edittext22dd = dynamic_equipments.findViewById(R.id.edittext22dd);
					edittext22dd.setSingleLine(true);
					edittext22dd.setFocusableInTouchMode(true);
					final EditText edittext23dd = dynamic_equipments.findViewById(R.id.edittext23dd);
					edittext23dd.setSingleLine(true);
					edittext23dd.setFocusableInTouchMode(true);
					/*
TextView
*/
					final TextView textview14dd = dynamic_equipments.findViewById(R.id.textview14dd);
					final TextView textview15dd = dynamic_equipments.findViewById(R.id.textview15dd);
					final TextView textview16dd = dynamic_equipments.findViewById(R.id.textview16dd);
					final TextView textview17dd = dynamic_equipments.findViewById(R.id.textview17dd);
					final TextView textview23dd = dynamic_equipments.findViewById(R.id.textview23dd);
					/*
ثانيآ المدخلات والمعادلات
*/
					/*
التعليقات ومربعات الأوامر المخفية
*/
					edittext_am15dd.setVisibility(View.GONE);
					edittext_am16dd.setVisibility(View.GONE);
					edittext_am17dd.setVisibility(View.GONE);
					textview14dd.setText("بيانات الصنيعي أو العامل");
					textview15dd.setText("معدل\nالعامل أو\nالصنيعي\nخلال\nاليوم\n(م.ط/يوم)");
					textview16dd.setText("يومية\nالعامل أو\nالصنيعي\n( جنيه )");
					textview17dd.setText("عدد العمال\nأو الصنيعية\nالمستخدمين\nخلال اليوم\n( عامل إو\nصنيعي )");
					textview23dd.setText("اجمالي التكلفة للعمال إو الصنيعية\n( جنيه )");
					/*
الأوامر
*/
					edittext_am3d.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am3dnn = _param1.toString();
											
if (((Double.parseDouble(edittext_am3dnn) == 0) || edittext_am15dd.getText().toString().equals("a.m")) || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext21dd.setText(String.valueOf(0.00d));
								edittext22dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString())) == 0) {
									edittext21dd.setText(String.valueOf(0.00d));
									edittext22dd.setText(String.valueOf(0.00d));
								}
								else {
									edittext21dd.setText(_English_Decimal_Format(Double.parseDouble(edittext_am3dnn) / (Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString()))));
									edittext22dd.setText(String.valueOf((long)(Math.ceil(Double.parseDouble(edittext_am3dnn) / (Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString()))))));
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
					edittext15dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext15ddnn = _param1.toString();
											
if ((edittext15ddnn.equals("") || edittext15ddnn.equals(".")) || (edittext15ddnn.equals("-") || (Double.parseDouble(edittext15ddnn) < 0))) {
								edittext_am15dd.setText("a.m");
							}
							else {
								edittext_am15dd.setText(String.valueOf(Double.parseDouble(edittext15ddnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am15dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am15ddnn = _param1.toString();
											
if (((Double.parseDouble(edittext_am3d.getText().toString()) == 0) || edittext_am15ddnn.equals("a.m")) || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext21dd.setText(String.valueOf(0.00d));
								edittext22dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((Double.parseDouble(edittext_am15ddnn) * Double.parseDouble(edittext_am17dd.getText().toString())) == 0) {
									edittext21dd.setText(String.valueOf(0.00d));
									edittext22dd.setText(String.valueOf(0.00d));
								}
								else {
									edittext21dd.setText(_English_Decimal_Format(Double.parseDouble(edittext_am3d.getText().toString()) / (Double.parseDouble(edittext_am15ddnn) * Double.parseDouble(edittext_am17dd.getText().toString()))));
									edittext22dd.setText(String.valueOf((long)(Math.ceil(Double.parseDouble(edittext_am3d.getText().toString()) / (Double.parseDouble(edittext_am15ddnn) * Double.parseDouble(edittext_am17dd.getText().toString()))))));
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
					edittext16dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext16ddnn = _param1.toString();
											
if ((edittext16ddnn.equals("") || edittext16ddnn.equals(".")) || (edittext16ddnn.equals("-") || (Double.parseDouble(edittext16ddnn) < 0))) {
								edittext_am16dd.setText("a.m");
							}
							else {
								edittext_am16dd.setText(String.valueOf(Double.parseDouble(edittext16ddnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am16dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am16ddnn = _param1.toString();
											
if (edittext_am16ddnn.equals("a.m") || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((edittext22dd.getText().toString().equals("") || edittext22dd.getText().toString().equals(".")) || (edittext22dd.getText().toString().equals("-") || (Double.parseDouble(edittext22dd.getText().toString()) < 0))) {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16ddnn) * Double.parseDouble(edittext_am17dd.getText().toString())) * Double.parseDouble(edittext21dd.getText().toString())));
								}
								else {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16ddnn) * Double.parseDouble(edittext_am17dd.getText().toString())) * Double.parseDouble(edittext22dd.getText().toString())));
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
					edittext17dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext17ddnn = _param1.toString();
											
if ((edittext17ddnn.equals("") || edittext17ddnn.equals(".")) || (edittext17ddnn.equals("-") || (Double.parseDouble(edittext17ddnn) < 0))) {
								edittext_am17dd.setText("a.m");
							}
							else {
								edittext_am17dd.setText(String.valueOf(Double.parseDouble(edittext17ddnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am17dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am17ddnn = _param1.toString();
											
if (((Double.parseDouble(edittext_am3d.getText().toString()) == 0) || edittext_am15dd.getText().toString().equals("a.m")) || edittext_am17ddnn.equals("a.m")) {
								edittext21dd.setText(String.valueOf(0.00d));
								edittext22dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am17ddnn)) == 0) {
									edittext21dd.setText(String.valueOf(0.00d));
									edittext22dd.setText(String.valueOf(0.00d));
								}
								else {
									edittext21dd.setText(_English_Decimal_Format(Double.parseDouble(edittext_am3d.getText().toString()) / (Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am17ddnn))));
									edittext22dd.setText(String.valueOf((long)(Math.ceil(Double.parseDouble(edittext_am3d.getText().toString()) / (Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am17ddnn))))));
								}
							}
							if (edittext_am16dd.getText().toString().equals("a.m") || edittext_am17ddnn.equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((edittext22dd.getText().toString().equals("") || edittext22dd.getText().toString().equals(".")) || (edittext22dd.getText().toString().equals("-") || (Double.parseDouble(edittext22dd.getText().toString()) < 0))) {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16dd.getText().toString()) * Double.parseDouble(edittext_am17ddnn)) * Double.parseDouble(edittext21dd.getText().toString())));
								}
								else {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16dd.getText().toString()) * Double.parseDouble(edittext_am17ddnn)) * Double.parseDouble(edittext22dd.getText().toString())));
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
					edittext21dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext21ddnn = _param1.toString();
											
if (edittext_am16dd.getText().toString().equals("a.m") || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((edittext22dd.getText().toString().equals("") || edittext22dd.getText().toString().equals(".")) || (edittext22dd.getText().toString().equals("-") || (Double.parseDouble(edittext22dd.getText().toString()) < 0))) {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString())) * Double.parseDouble(edittext21ddnn)));
								}
								else {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString())) * Double.parseDouble(edittext22dd.getText().toString())));
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
					edittext22dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext22ddnn = _param1.toString();
											
if (edittext_am16dd.getText().toString().equals("a.m") || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								if ((edittext22ddnn.equals("") || edittext22ddnn.equals(".")) || (edittext22ddnn.equals("-") || (Double.parseDouble(edittext22ddnn) < 0))) {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString())) * Double.parseDouble(edittext21dd.getText().toString())));
								}
								else {
									edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am16dd.getText().toString()) * Double.parseDouble(edittext_am17dd.getText().toString())) * Double.parseDouble(edittext22ddnn)));
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
					edittext23dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext23ddnn = _param1.toString();
											
temp = 0;
							for (int i = 0; i < (int)(linear_dynamic_equipments.getChildCount()); i++) {
								View child=linear_dynamic_equipments.getChildAt(i); 
								TextView tempo =child.findViewById(R.id.edittext23dd);
								temp = temp + Double.parseDouble(tempo.getText().toString());
							}
							edittext49d.setText(_English_Decimal_Format(temp));
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					close_dd.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							_removeView(dynamic_equipments);
							edittext15dd.setText("");
							edittext16dd.setText("");
							edittext17dd.setText("");
						}
					});
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		edittext49d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext49dnn = _param1.toString();
								
if (edittext_am3d.getText().toString().equals("a.m")) {
					edittext50d.setText(String.valueOf(0.00d));
				}
				else {
					edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext49dnn) / Double.parseDouble(edittext_am3d.getText().toString())));
				}
				temp2 = 0;
				for (int i = 0; i < (int)(linear_dynamic_apply_cost_of_pipe_line_exchange.getChildCount()); i++) {
					View child=linear_dynamic_apply_cost_of_pipe_line_exchange.getChildAt(i); 
					TextView tempo2 =child.findViewById(R.id.edittext49d);
					temp2 = temp2 + Double.parseDouble(tempo2.getText().toString());
				}
				edittext49.setText(_English_Decimal_Format(temp2));
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		close1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_apply_cost_of_pipe_line_exchange);
				edittext3d.setText("");
			}
		});
		print1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_PrintHelper(dynamic_apply_cost_of_pipe_line_exchange);
			}
		});
	}
	
	
	public void _toip_d_apply_cost_of_pipe_line_exchangess() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_apply_cost_of_pipe_line_exchange = (LinearLayout) inflater.inflate(R.layout.toip_d_apply_cost_of_pipe_line_exchange, null, false);
		linear_dynamic_apply_cost_of_pipe_line_exchange.addView(dynamic_apply_cost_of_pipe_line_exchange);
		/*
أولا تعريفات الدينامك
*/
		/*
ImageView
*/
		final ImageView close1d= dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.close1d);
		final ImageView print1d= dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.print1d);
		/*
EditText
*/
		final EditText edittext3d = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.edittext3d);
		edittext3d.setSingleLine(true);
		edittext3d.setFocusableInTouchMode(true);
		final EditText edittext_am3d = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.edittext_am3d);
		edittext_am3d.setSingleLine(true);
		edittext_am3d.setFocusableInTouchMode(true);
		final EditText edittext49d = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.edittext49d);
		edittext49d.setSingleLine(true);
		edittext49d.setFocusableInTouchMode(true);
		final EditText edittext50d = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.edittext50d);
		edittext50d.setSingleLine(true);
		edittext50d.setFocusableInTouchMode(true);
		/*
Button
*/
		final Button add_dynamic_equipments = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.add_dynamic_equipments);
		final Button add_dynamic_labours = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.add_dynamic_labours);
		/*
LinearLayout
*/
		final LinearLayout linear_dynamic_equipments = dynamic_apply_cost_of_pipe_line_exchange.findViewById(R.id.linear_dynamic_equipments);
		/*
ثانيآ المدخلات والمعادلات
*/
		/*
التعليقات المخفية ومربعات الأوامر المخفية
*/
		edittext_am3d.setVisibility(View.GONE);
		/*
الأوامر
*/
		edittext3d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext3dnn = _param1.toString();
								
edittext3d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if ((edittext3dnn.equals("") || edittext3dnn.equals(".")) || (edittext3dnn.equals("-") || ((Double.parseDouble(edittext3dnn) < 0) || (Double.parseDouble(edittext3dnn) == 0)))) {
					edittext_am3d.setText(String.valueOf(Double.parseDouble("0")));
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
		edittext_am3d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am3dnn = _param1.toString();
								
if (Double.parseDouble(edittext_am3dnn) == 0) {
					edittext50d.setText(String.valueOf(0.00d));
				}
				else {
					edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext49d.getText().toString()) / Double.parseDouble(edittext_am3dnn)));
				}
				temp3 = 0;
				for (int i = 0; i < (int)(linear_dynamic_apply_cost_of_pipe_line_exchange.getChildCount()); i++) {
					View child=linear_dynamic_apply_cost_of_pipe_line_exchange.getChildAt(i); 
					TextView tempo3 =child.findViewById(R.id.edittext_am3d);
					temp3 = temp3 + Double.parseDouble(tempo3.getText().toString());
				}
				edittext3.setText(_English_Decimal_Format(temp3));
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		add_dynamic_equipments.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
					final LinearLayout dynamic_equipments = (LinearLayout) inflater.inflate(R.layout.toip_d_equipments_and_labours, null, false);
					linear_dynamic_equipments.addView(dynamic_equipments);
					/*
أولا تعريفات الدينامك
*/
					/*
ImageView
*/
					final ImageView close_dd= dynamic_equipments.findViewById(R.id.close_dd);
					/*
EditText
*/
					final EditText edittext15dd = dynamic_equipments.findViewById(R.id.edittext15dd);
					edittext15dd.setSingleLine(true);
					edittext15dd.setFocusableInTouchMode(true);
					final EditText edittext_am15dd = dynamic_equipments.findViewById(R.id.edittext_am15dd);
					edittext_am15dd.setSingleLine(true);
					edittext_am15dd.setFocusableInTouchMode(true);
					final EditText edittext16dd = dynamic_equipments.findViewById(R.id.edittext16dd);
					edittext16dd.setSingleLine(true);
					edittext16dd.setFocusableInTouchMode(true);
					final EditText edittext_am16dd = dynamic_equipments.findViewById(R.id.edittext_am16dd);
					edittext_am16dd.setSingleLine(true);
					edittext_am16dd.setFocusableInTouchMode(true);
					final EditText edittext17dd = dynamic_equipments.findViewById(R.id.edittext17dd);
					edittext17dd.setSingleLine(true);
					edittext17dd.setFocusableInTouchMode(true);
					final EditText edittext_am17dd = dynamic_equipments.findViewById(R.id.edittext_am17dd);
					edittext_am17dd.setSingleLine(true);
					edittext_am17dd.setFocusableInTouchMode(true);
					final EditText edittext21dd = dynamic_equipments.findViewById(R.id.edittext21dd);
					edittext21dd.setSingleLine(true);
					edittext21dd.setFocusableInTouchMode(true);
					final EditText edittext22dd = dynamic_equipments.findViewById(R.id.edittext22dd);
					edittext22dd.setSingleLine(true);
					edittext22dd.setFocusableInTouchMode(true);
					final EditText edittext23dd = dynamic_equipments.findViewById(R.id.edittext23dd);
					edittext23dd.setSingleLine(true);
					edittext23dd.setFocusableInTouchMode(true);
					/*
TextView
*/
					final TextView textview14dd = dynamic_equipments.findViewById(R.id.textview14dd);
					final TextView textview15dd = dynamic_equipments.findViewById(R.id.textview15dd);
					final TextView textview16dd = dynamic_equipments.findViewById(R.id.textview16dd);
					final TextView textview17dd = dynamic_equipments.findViewById(R.id.textview17dd);
					final TextView textview23dd = dynamic_equipments.findViewById(R.id.textview23dd);
					/*
ثانيآ المدخلات والمعادلات
*/
					/*
اختلاف الفعلي الدراسه
*/
					final LinearLayout linear21dd = dynamic_equipments.findViewById(R.id.linear21dd);
					linear21dd.setVisibility(View.GONE);
					final HorizontalScrollView hscroll21dd = dynamic_equipments.findViewById(R.id.hscroll21dd);
					hscroll21dd.setVisibility(View.GONE);
					final LinearLayout linear22dd = dynamic_equipments.findViewById(R.id.linear22dd);
					linear22dd.setVisibility(View.GONE);
					final HorizontalScrollView hscroll22dd = dynamic_equipments.findViewById(R.id.hscroll22dd);
					hscroll22dd.setVisibility(View.GONE);
					/*
التعليقات المخفية ومربعات الأوامر المخفية
*/
					edittext_am15dd.setVisibility(View.GONE);
					edittext_am16dd.setVisibility(View.GONE);
					edittext_am17dd.setVisibility(View.GONE);
					textview15dd.setText("عدد\nالمعدات\nالمستخدمة\nخلال\nاليوم\n( معدة )");
					textview16dd.setText("عدد\nايام\nالعمل\n( يوم )");
					textview17dd.setText("يومية\nالمعدة\n( جنيه )");
					/*
الأوامر
*/
					edittext15dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext15ddnn = _param1.toString();
											
if ((edittext15ddnn.equals("") || edittext15ddnn.equals(".")) || (edittext15ddnn.equals("-") || (Double.parseDouble(edittext15ddnn) < 0))) {
								edittext_am15dd.setText("a.m");
							}
							else {
								edittext_am15dd.setText(String.valueOf(Double.parseDouble(edittext15ddnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am15dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am15ddnn = _param1.toString();
											
if ((edittext_am15ddnn.equals("a.m") || edittext_am16dd.getText().toString().equals("a.m")) || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am15ddnn) * Double.parseDouble(edittext_am16dd.getText().toString())) * Double.parseDouble(edittext_am17dd.getText().toString())));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext16dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext16ddnn = _param1.toString();
											
if ((edittext16ddnn.equals("") || edittext16ddnn.equals(".")) || (edittext16ddnn.equals("-") || (Double.parseDouble(edittext16ddnn) < 0))) {
								edittext_am16dd.setText("a.m");
							}
							else {
								edittext_am16dd.setText(String.valueOf(Double.parseDouble(edittext16ddnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am16dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am16ddnn = _param1.toString();
											
if ((edittext_am15dd.getText().toString().equals("a.m") || edittext_am16ddnn.equals("a.m")) || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am16ddnn)) * Double.parseDouble(edittext_am17dd.getText().toString())));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext17dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext17ddnn = _param1.toString();
											
if ((edittext17ddnn.equals("") || edittext17ddnn.equals(".")) || (edittext17ddnn.equals("-") || (Double.parseDouble(edittext17ddnn) < 0))) {
								edittext_am17dd.setText("a.m");
							}
							else {
								edittext_am17dd.setText(String.valueOf(Double.parseDouble(edittext17ddnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am17dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am17ddnn = _param1.toString();
											
if ((edittext_am15dd.getText().toString().equals("a.m") || edittext_am16dd.getText().toString().equals("a.m")) || edittext_am17ddnn.equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am16dd.getText().toString())) * Double.parseDouble(edittext_am17dd.getText().toString())));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext23dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext23ddnn = _param1.toString();
											
temp = 0;
							for (int i = 0; i < (int)(linear_dynamic_equipments.getChildCount()); i++) {
								View child=linear_dynamic_equipments.getChildAt(i); 
								TextView tempo =child.findViewById(R.id.edittext23dd);
								temp = temp + Double.parseDouble(tempo.getText().toString());
							}
							edittext49d.setText(_English_Decimal_Format(temp));
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					close_dd.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							_removeView(dynamic_equipments);
							edittext15dd.setText("");
							edittext16dd.setText("");
							edittext17dd.setText("");
						}
					});
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		add_dynamic_labours.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
					final LinearLayout dynamic_equipments = (LinearLayout) inflater.inflate(R.layout.toip_d_equipments_and_labours, null, false);
					linear_dynamic_equipments.addView(dynamic_equipments);
					/*
أولا تعريفات الدينامك
*/
					/*
ImageView
*/
					final ImageView close_dd= dynamic_equipments.findViewById(R.id.close_dd);
					/*
EditText
*/
					final EditText edittext15dd = dynamic_equipments.findViewById(R.id.edittext15dd);
					edittext15dd.setSingleLine(true);
					edittext15dd.setFocusableInTouchMode(true);
					final EditText edittext_am15dd = dynamic_equipments.findViewById(R.id.edittext_am15dd);
					edittext_am15dd.setSingleLine(true);
					edittext_am15dd.setFocusableInTouchMode(true);
					final EditText edittext16dd = dynamic_equipments.findViewById(R.id.edittext16dd);
					edittext16dd.setSingleLine(true);
					edittext16dd.setFocusableInTouchMode(true);
					final EditText edittext_am16dd = dynamic_equipments.findViewById(R.id.edittext_am16dd);
					edittext_am16dd.setSingleLine(true);
					edittext_am16dd.setFocusableInTouchMode(true);
					final EditText edittext17dd = dynamic_equipments.findViewById(R.id.edittext17dd);
					edittext17dd.setSingleLine(true);
					edittext17dd.setFocusableInTouchMode(true);
					final EditText edittext_am17dd = dynamic_equipments.findViewById(R.id.edittext_am17dd);
					edittext_am17dd.setSingleLine(true);
					edittext_am17dd.setFocusableInTouchMode(true);
					final EditText edittext21dd = dynamic_equipments.findViewById(R.id.edittext21dd);
					edittext21dd.setSingleLine(true);
					edittext21dd.setFocusableInTouchMode(true);
					final EditText edittext22dd = dynamic_equipments.findViewById(R.id.edittext22dd);
					edittext22dd.setSingleLine(true);
					edittext22dd.setFocusableInTouchMode(true);
					final EditText edittext23dd = dynamic_equipments.findViewById(R.id.edittext23dd);
					edittext23dd.setSingleLine(true);
					edittext23dd.setFocusableInTouchMode(true);
					/*
TextView
*/
					final TextView textview14dd = dynamic_equipments.findViewById(R.id.textview14dd);
					final TextView textview15dd = dynamic_equipments.findViewById(R.id.textview15dd);
					final TextView textview16dd = dynamic_equipments.findViewById(R.id.textview16dd);
					final TextView textview17dd = dynamic_equipments.findViewById(R.id.textview17dd);
					final TextView textview23dd = dynamic_equipments.findViewById(R.id.textview23dd);
					/*
ثانيآ المدخلات والمعادلات
*/
					/*
اختلاف الفعلي الدراسه
*/
					final LinearLayout linear21dd = dynamic_equipments.findViewById(R.id.linear21dd);
					linear21dd.setVisibility(View.GONE);
					final HorizontalScrollView hscroll21dd = dynamic_equipments.findViewById(R.id.hscroll21dd);
					hscroll21dd.setVisibility(View.GONE);
					final LinearLayout linear22dd = dynamic_equipments.findViewById(R.id.linear22dd);
					linear22dd.setVisibility(View.GONE);
					final HorizontalScrollView hscroll22dd = dynamic_equipments.findViewById(R.id.hscroll22dd);
					hscroll22dd.setVisibility(View.GONE);
					/*
التعليقات ومربعات الأوامر المخفية
*/
					edittext_am15dd.setVisibility(View.GONE);
					edittext_am16dd.setVisibility(View.GONE);
					edittext_am17dd.setVisibility(View.GONE);
					textview14dd.setText("بيانات الصنيعي أو العامل");
					textview15dd.setText("عدد العمال\nأو الصنيعية\nالمستخدمين\nخلال اليوم\n( عامل إو\nصنيعي )");
					textview16dd.setText("عدد\nايام\nالعمل\n( يوم )");
					textview17dd.setText("يومية\nالعامل أو\nالصنيعي\n( جنيه )");
					textview23dd.setText("اجمالي التكلفة للعمال إو الصنيعية\n( جنيه )");
					/*
الأوامر
*/
					edittext15dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext15ddnn = _param1.toString();
											
if ((edittext15ddnn.equals("") || edittext15ddnn.equals(".")) || (edittext15ddnn.equals("-") || (Double.parseDouble(edittext15ddnn) < 0))) {
								edittext_am15dd.setText("a.m");
							}
							else {
								edittext_am15dd.setText(String.valueOf(Double.parseDouble(edittext15ddnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am15dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am15ddnn = _param1.toString();
											
if ((edittext_am15ddnn.equals("a.m") || edittext_am16dd.getText().toString().equals("a.m")) || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am15ddnn) * Double.parseDouble(edittext_am16dd.getText().toString())) * Double.parseDouble(edittext_am17dd.getText().toString())));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext16dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext16ddnn = _param1.toString();
											
if ((edittext16ddnn.equals("") || edittext16ddnn.equals(".")) || (edittext16ddnn.equals("-") || (Double.parseDouble(edittext16ddnn) < 0))) {
								edittext_am16dd.setText("a.m");
							}
							else {
								edittext_am16dd.setText(String.valueOf(Double.parseDouble(edittext16ddnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am16dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am16ddnn = _param1.toString();
											
if ((edittext_am15dd.getText().toString().equals("a.m") || edittext_am16ddnn.equals("a.m")) || edittext_am17dd.getText().toString().equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am16ddnn)) * Double.parseDouble(edittext_am17dd.getText().toString())));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext17dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext17ddnn = _param1.toString();
											
if ((edittext17ddnn.equals("") || edittext17ddnn.equals(".")) || (edittext17ddnn.equals("-") || (Double.parseDouble(edittext17ddnn) < 0))) {
								edittext_am17dd.setText("a.m");
							}
							else {
								edittext_am17dd.setText(String.valueOf(Double.parseDouble(edittext17ddnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am17dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am17ddnn = _param1.toString();
											
if ((edittext_am15dd.getText().toString().equals("a.m") || edittext_am16dd.getText().toString().equals("a.m")) || edittext_am17ddnn.equals("a.m")) {
								edittext23dd.setText(String.valueOf(0.00d));
							}
							else {
								edittext23dd.setText(_English_Decimal_Format((Double.parseDouble(edittext_am15dd.getText().toString()) * Double.parseDouble(edittext_am16dd.getText().toString())) * Double.parseDouble(edittext_am17dd.getText().toString())));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext23dd.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext23ddnn = _param1.toString();
											
temp = 0;
							for (int i = 0; i < (int)(linear_dynamic_equipments.getChildCount()); i++) {
								View child=linear_dynamic_equipments.getChildAt(i); 
								TextView tempo =child.findViewById(R.id.edittext23dd);
								temp = temp + Double.parseDouble(tempo.getText().toString());
							}
							edittext49d.setText(_English_Decimal_Format(temp));
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					close_dd.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							_removeView(dynamic_equipments);
							edittext15dd.setText("");
							edittext16dd.setText("");
							edittext17dd.setText("");
						}
					});
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		edittext49d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext49dnn = _param1.toString();
								
if (edittext_am3d.getText().toString().equals("a.m")) {
					edittext50d.setText(String.valueOf(0.00d));
				}
				else {
					edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext49dnn) / Double.parseDouble(edittext_am3d.getText().toString())));
				}
				temp2 = 0;
				for (int i = 0; i < (int)(linear_dynamic_apply_cost_of_pipe_line_exchange.getChildCount()); i++) {
					View child=linear_dynamic_apply_cost_of_pipe_line_exchange.getChildAt(i); 
					TextView tempo2 =child.findViewById(R.id.edittext49d);
					temp2 = temp2 + Double.parseDouble(tempo2.getText().toString());
				}
				edittext49.setText(_English_Decimal_Format(temp2));
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		close1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_apply_cost_of_pipe_line_exchange);
				edittext3d.setText("");
			}
		});
		print1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_PrintHelper(dynamic_apply_cost_of_pipe_line_exchange);
			}
		});
	}
	
}
