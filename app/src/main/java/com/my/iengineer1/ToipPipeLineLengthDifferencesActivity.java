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
import androidx.print.PrintHelper;


public class ToipPipeLineLengthDifferencesActivity extends AppCompatActivity {
	
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
	private LinearLayout linear176;
	private TextView textview1174;
	private TextView textview1148;
	private LinearLayout linear_dynamic_pipe_line_length_differencess;
	private LinearLayout add_dynamic_element_lin;
	private LinearLayout linear3;
	private TextView textview1152;
	private LinearLayout linear39;
	private LinearLayout linear154;
	private LinearLayout linear40;
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
	private TextView textview704;
	private Button add_dynamic_pipe_line_length_difference;
	private TextView textview1172;
	private EditText edittext3;
	private TextView textview1173;
	private TextView textview3;
	private TextView textview601;
	private EditText edittext39;
	private TextView textview602;
	private TextView textview39;
	private TextView textview1150;
	private EditText edittext40;
	private TextView textview1151;
	private TextView textview40;
	
	private Intent price = new Intent();
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	private AlertDialog.Builder dialog;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toip_pipe_line_length_differences);
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
		textview1174 = findViewById(R.id.textview1174);
		textview1148 = findViewById(R.id.textview1148);
		linear_dynamic_pipe_line_length_differencess = findViewById(R.id.linear_dynamic_pipe_line_length_differencess);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		linear3 = findViewById(R.id.linear3);
		textview1152 = findViewById(R.id.textview1152);
		linear39 = findViewById(R.id.linear39);
		linear154 = findViewById(R.id.linear154);
		linear40 = findViewById(R.id.linear40);
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
		textview704 = findViewById(R.id.textview704);
		add_dynamic_pipe_line_length_difference = findViewById(R.id.add_dynamic_pipe_line_length_difference);
		textview1172 = findViewById(R.id.textview1172);
		edittext3 = findViewById(R.id.edittext3);
		textview1173 = findViewById(R.id.textview1173);
		textview3 = findViewById(R.id.textview3);
		textview601 = findViewById(R.id.textview601);
		edittext39 = findViewById(R.id.edittext39);
		textview602 = findViewById(R.id.textview602);
		textview39 = findViewById(R.id.textview39);
		textview1150 = findViewById(R.id.textview1150);
		edittext40 = findViewById(R.id.edittext40);
		textview1151 = findViewById(R.id.textview1151);
		textview40 = findViewById(R.id.textview40);
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
		
		add_dynamic_pipe_line_length_difference.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_ToipPipeLineLengthDifferencess();
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
		_ToipPipeLineLengthDifferencess();
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
		PrintHelper printHelper = new PrintHelper(ToipPipeLineLengthDifferencesActivity.this); //change the activity name
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
	
	
	public void _ToipPipeLineLengthDifferencess() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_pipe_line_length_differencess = (LinearLayout) inflater.inflate(R.layout.toip_d_pipe_line_length_differences, null, false);
		linear_dynamic_pipe_line_length_differencess.addView(dynamic_pipe_line_length_differencess);
		/*
أولا تعريفات الدينامك
*/
		/*
ImageView
*/
		final ImageView close1d= dynamic_pipe_line_length_differencess.findViewById(R.id.close1d);
		final ImageView close2d= dynamic_pipe_line_length_differencess.findViewById(R.id.close2d);
		/*
EditText
*/
		final EditText edittext3d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext3d);
		edittext3d.setSingleLine(true);
		edittext3d.setFocusableInTouchMode(true);
		final EditText edittext_am3d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext_am3d);
		edittext_am3d.setSingleLine(true);
		edittext_am3d.setFocusableInTouchMode(true);
		final EditText edittext5d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext5d);
		edittext5d.setSingleLine(true);
		edittext5d.setFocusableInTouchMode(true);
		final EditText edittext_am5d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext_am5d);
		edittext_am5d.setSingleLine(true);
		edittext_am5d.setFocusableInTouchMode(true);
		final EditText edittext6d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext6d);
		edittext6d.setSingleLine(true);
		edittext6d.setFocusableInTouchMode(true);
		final EditText edittext_am6d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext_am6d);
		edittext_am6d.setSingleLine(true);
		edittext_am6d.setFocusableInTouchMode(true);
		final EditText edittext7d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext7d);
		edittext7d.setSingleLine(true);
		edittext7d.setFocusableInTouchMode(true);
		final EditText edittext_am7d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext_am7d);
		edittext_am7d.setSingleLine(true);
		edittext_am7d.setFocusableInTouchMode(true);
		final EditText edittext9d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext9d);
		edittext9d.setSingleLine(true);
		edittext9d.setFocusableInTouchMode(true);
		final EditText edittext_am9d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext_am9d);
		edittext_am9d.setSingleLine(true);
		edittext_am9d.setFocusableInTouchMode(true);
		final EditText edittext10d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext10d);
		edittext10d.setSingleLine(true);
		edittext10d.setFocusableInTouchMode(true);
		final EditText edittext_am10d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext_am10d);
		edittext_am10d.setSingleLine(true);
		edittext_am10d.setFocusableInTouchMode(true);
		final EditText edittext11d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext11d);
		edittext11d.setSingleLine(true);
		edittext11d.setFocusableInTouchMode(true);
		final EditText edittext_am11d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext_am11d);
		edittext_am11d.setSingleLine(true);
		edittext_am11d.setFocusableInTouchMode(true);
		final EditText edittext12d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext12d);
		edittext12d.setSingleLine(true);
		edittext12d.setFocusableInTouchMode(true);
		final EditText edittext_am12d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext_am12d);
		edittext_am12d.setSingleLine(true);
		edittext_am12d.setFocusableInTouchMode(true);
		final EditText edittext13d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext13d);
		edittext13d.setSingleLine(true);
		edittext13d.setFocusableInTouchMode(true);
		final EditText edittext_am13d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext_am13d);
		edittext_am13d.setSingleLine(true);
		edittext_am13d.setFocusableInTouchMode(true);
		final EditText edittext14d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext14d);
		edittext14d.setSingleLine(true);
		edittext14d.setFocusableInTouchMode(true);
		final EditText edittext_am14d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext_am14d);
		edittext_am14d.setSingleLine(true);
		edittext_am14d.setFocusableInTouchMode(true);
		final EditText edittext15d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext15d);
		edittext15d.setSingleLine(true);
		edittext15d.setFocusableInTouchMode(true);
		final EditText edittext_am15d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext_am15d);
		edittext_am15d.setSingleLine(true);
		edittext_am15d.setFocusableInTouchMode(true);
		final EditText edittext16d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext16d);
		edittext16d.setSingleLine(true);
		edittext16d.setFocusableInTouchMode(true);
		final EditText edittext17d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext17d);
		edittext17d.setSingleLine(true);
		edittext17d.setFocusableInTouchMode(true);
		final EditText edittext18d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext18d);
		edittext18d.setSingleLine(true);
		edittext18d.setFocusableInTouchMode(true);
		final EditText edittext19d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext19d);
		edittext19d.setSingleLine(true);
		edittext19d.setFocusableInTouchMode(true);
		final EditText edittext20d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext20d);
		edittext20d.setSingleLine(true);
		edittext20d.setFocusableInTouchMode(true);
		final EditText edittext21d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext21d);
		edittext21d.setSingleLine(true);
		edittext21d.setFocusableInTouchMode(true);
		final EditText edittext22d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext22d);
		edittext22d.setSingleLine(true);
		edittext22d.setFocusableInTouchMode(true);
		final EditText edittext23d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext23d);
		edittext23d.setSingleLine(true);
		edittext23d.setFocusableInTouchMode(true);
		final EditText edittext24d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext24d);
		edittext24d.setSingleLine(true);
		edittext24d.setFocusableInTouchMode(true);
		final EditText edittext25d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext25d);
		edittext25d.setSingleLine(true);
		edittext25d.setFocusableInTouchMode(true);
		final EditText edittext26d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext26d);
		edittext26d.setSingleLine(true);
		edittext26d.setFocusableInTouchMode(true);
		final EditText edittext27d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext27d);
		edittext27d.setSingleLine(true);
		edittext27d.setFocusableInTouchMode(true);
		final EditText edittext28d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext28d);
		edittext28d.setSingleLine(true);
		edittext28d.setFocusableInTouchMode(true);
		final EditText edittext29d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext29d);
		edittext29d.setSingleLine(true);
		edittext29d.setFocusableInTouchMode(true);
		final EditText edittext30d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext30d);
		edittext30d.setSingleLine(true);
		edittext30d.setFocusableInTouchMode(true);
		final EditText edittext31d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext31d);
		edittext31d.setSingleLine(true);
		edittext31d.setFocusableInTouchMode(true);
		final EditText edittext32d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext32d);
		edittext32d.setSingleLine(true);
		edittext32d.setFocusableInTouchMode(true);
		final EditText edittext33d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext33d);
		edittext33d.setSingleLine(true);
		edittext33d.setFocusableInTouchMode(true);
		final EditText edittext34d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext34d);
		edittext34d.setSingleLine(true);
		edittext34d.setFocusableInTouchMode(true);
		final EditText edittext35d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext35d);
		edittext35d.setSingleLine(true);
		edittext35d.setFocusableInTouchMode(true);
		final EditText edittext36d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext36d);
		edittext36d.setSingleLine(true);
		edittext36d.setFocusableInTouchMode(true);
		final EditText edittext37d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext37d);
		edittext37d.setSingleLine(true);
		edittext37d.setFocusableInTouchMode(true);
		final EditText edittext38d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext38d);
		edittext38d.setSingleLine(true);
		edittext38d.setFocusableInTouchMode(true);
		final EditText edittext39d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext39d);
		edittext39d.setSingleLine(true);
		edittext39d.setFocusableInTouchMode(true);
		final EditText edittext40d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext40d);
		edittext40d.setSingleLine(true);
		edittext40d.setFocusableInTouchMode(true);
		final EditText edittext41d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext41d);
		edittext41d.setSingleLine(true);
		edittext41d.setFocusableInTouchMode(true);
		final EditText edittext42d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext42d);
		edittext42d.setSingleLine(true);
		edittext42d.setFocusableInTouchMode(true);
		final EditText edittext48d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext48d);
		edittext48d.setSingleLine(true);
		edittext48d.setFocusableInTouchMode(true);
		final EditText edittext49d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext49d);
		edittext49d.setSingleLine(true);
		edittext49d.setFocusableInTouchMode(true);
		final EditText edittext50d = dynamic_pipe_line_length_differencess.findViewById(R.id.edittext50d);
		edittext50d.setSingleLine(true);
		edittext50d.setFocusableInTouchMode(true);
		/*
TextView
*/
		final TextView textview5d = dynamic_pipe_line_length_differencess.findViewById(R.id.textview5d);
		final TextView textview6d = dynamic_pipe_line_length_differencess.findViewById(R.id.textview6d);
		final TextView textview7d = dynamic_pipe_line_length_differencess.findViewById(R.id.textview7d);
		final TextView textview9d = dynamic_pipe_line_length_differencess.findViewById(R.id.textview9d);
		final TextView textview10d = dynamic_pipe_line_length_differencess.findViewById(R.id.textview10d);
		final TextView textview11d = dynamic_pipe_line_length_differencess.findViewById(R.id.textview11d);
		final TextView textview12d = dynamic_pipe_line_length_differencess.findViewById(R.id.textview12d);
		final TextView textview13d = dynamic_pipe_line_length_differencess.findViewById(R.id.textview13d);
		final TextView textview14d = dynamic_pipe_line_length_differencess.findViewById(R.id.textview14d);
		final TextView textview15d = dynamic_pipe_line_length_differencess.findViewById(R.id.textview15d);
		/*
Button
*/
		final Button add_dynamic_short_piece = dynamic_pipe_line_length_differencess.findViewById(R.id.add_dynamic_short_piece);
		final Button button1d = dynamic_pipe_line_length_differencess.findViewById(R.id.button1d);
		/*
LinearLayout
*/
		final LinearLayout linear_dynamic_short_piece = dynamic_pipe_line_length_differencess.findViewById(R.id.linear_dynamic_short_piece);
		final LinearLayout linear204d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear204d);
		final LinearLayout linear205d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear205d);
		final LinearLayout linear206d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear206d);
		final LinearLayout linear27d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear27d);
		final LinearLayout linear28d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear28d);
		final LinearLayout linear29d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear29d);
		final LinearLayout linear30d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear30d);
		final LinearLayout linear31d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear31d);
		final LinearLayout linear32d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear32d);
		final LinearLayout linear33d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear33d);
		final LinearLayout linear34d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear34d);
		final LinearLayout linear35d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear35d);
		final LinearLayout linear36d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear36d);
		final LinearLayout linear37d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear37d);
		final LinearLayout linear38d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear38d);
		final LinearLayout linear39d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear39d);
		final LinearLayout linear40d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear40d);
		final LinearLayout linear41d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear41d);
		final LinearLayout linear42d = dynamic_pipe_line_length_differencess.findViewById(R.id.linear42d);
		/*
ثانيآ المدخلات والمعادلات
*/
		/*
التعليقات المخفية ومربعات الأوامر المخفية
*/
		edittext_am3d.setVisibility(View.GONE);
		edittext_am5d.setVisibility(View.GONE);
		edittext_am6d.setVisibility(View.GONE);
		edittext_am7d.setVisibility(View.GONE);
		edittext_am9d.setVisibility(View.GONE);
		edittext_am10d.setVisibility(View.GONE);
		edittext_am11d.setVisibility(View.GONE);
		edittext_am12d.setVisibility(View.GONE);
		edittext_am13d.setVisibility(View.GONE);
		edittext_am14d.setVisibility(View.GONE);
		edittext_am15d.setVisibility(View.GONE);
		edittext27d.setVisibility(View.GONE);
		edittext28d.setVisibility(View.GONE);
		edittext29d.setVisibility(View.GONE);
		edittext30d.setVisibility(View.GONE);
		edittext31d.setVisibility(View.GONE);
		edittext41d.setVisibility(View.GONE);
		edittext42d.setVisibility(View.GONE);
		linear204d.setVisibility(View.VISIBLE);
		linear205d.setVisibility(View.GONE);
		linear206d.setVisibility(View.GONE);
		linear27d.setVisibility(View.GONE);
		linear28d.setVisibility(View.GONE);
		linear29d.setVisibility(View.GONE);
		linear30d.setVisibility(View.GONE);
		linear31d.setVisibility(View.GONE);
		linear32d.setVisibility(View.GONE);
		linear33d.setVisibility(View.GONE);
		linear34d.setVisibility(View.GONE);
		linear35d.setVisibility(View.GONE);
		linear36d.setVisibility(View.GONE);
		linear37d.setVisibility(View.GONE);
		linear38d.setVisibility(View.GONE);
		linear39d.setVisibility(View.GONE);
		linear40d.setVisibility(View.GONE);
		linear41d.setVisibility(View.GONE);
		linear42d.setVisibility(View.GONE);
		/*
التعليقات
*/
		textview5d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* القطر الداخلي للمطبق ببداية الفرعة ( م )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ١.٢٠ م وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		textview6d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* سمك حائط المطبق ببداية الفرعة ( م )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٢٥م وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		textview7d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* قيمة الدخول داخل مطبق بداية الفرعة بعد الحائط ( ان وجدت ) ( م )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.١٠م وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		textview9d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* القطر الداخلي للمطبق بنهاية الفرعة ( م )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ١.٢٠ م وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		textview10d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* سمك حائط المطبق بنهاية الفرعة ( م )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٢٥م وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		textview11d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* قيمة الدخول داخل مطبق نهاية الفرعة بعد الحائط ( ان وجدت ) ( م )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.١٠م وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		textview12d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* قيمة التداخل بين المواسير ( م ) طبقآ لكتالوج الشركة الموردة أو طبقآ للقياس علي الطبيعة ");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٢٠م وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		textview13d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* طول الماسورة ال standard ( م )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٦م وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		textview14d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* رقم الوصلة");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ١ وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		textview15d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* طول الوصلة");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ١م وذلك عند الضغط علي زرار أحسب");
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
الأوامر
*/
		edittext3d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext3dnn = _param1.toString();
								
edittext3d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if ((edittext3dnn.equals("") || edittext3dnn.equals(".")) || (edittext3dnn.equals("-") || ((Double.parseDouble(edittext3dnn) < 0) || (Double.parseDouble(edittext3dnn) == 0)))) {
					edittext_am3d.setText("0");
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
								
if ((edittext_am3dnn.equals("0") || edittext_am5d.getText().toString().equals("a.m")) || (edittext_am9d.getText().toString().equals("a.m") || (edittext_am7d.getText().toString().equals("a.m") || edittext_am11d.getText().toString().equals("a.m")))) {
					edittext32d.setText(String.valueOf(0.00d));
				}
				else {
					edittext32d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am3dnn) - ((Double.parseDouble(edittext_am5d.getText().toString()) / 2) + (Double.parseDouble(edittext_am9d.getText().toString()) / 2))) + (Double.parseDouble(edittext_am7d.getText().toString()) + Double.parseDouble(edittext_am11d.getText().toString()))));
				}
				if ((edittext_am3dnn.equals("0") || edittext_am5d.getText().toString().equals("a.m")) || (edittext_am9d.getText().toString().equals("a.m") || (edittext_am6d.getText().toString().equals("a.m") || edittext_am10d.getText().toString().equals("a.m")))) {
					edittext48d.setText(String.valueOf(0.00d));
				}
				else {
					edittext48d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am3dnn) - (((Double.parseDouble(edittext_am5d.getText().toString()) / 2) + (Double.parseDouble(edittext_am9d.getText().toString()) / 2)) + (Double.parseDouble(edittext_am6d.getText().toString()) + Double.parseDouble(edittext_am10d.getText().toString())))));
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
								
edittext5d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext5dnn.equals("") || edittext5dnn.equals(".")) || (edittext5dnn.equals("-") || ((Double.parseDouble(edittext5dnn) < 0) || (Double.parseDouble(edittext5dnn) == 0)))) {
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
								
if ((edittext_am3d.getText().toString().equals("0") || edittext_am5dnn.equals("a.m")) || (edittext_am9d.getText().toString().equals("a.m") || (edittext_am7d.getText().toString().equals("a.m") || edittext_am11d.getText().toString().equals("a.m")))) {
					edittext32d.setText(String.valueOf(0.00d));
				}
				else {
					edittext32d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am3d.getText().toString()) - ((Double.parseDouble(edittext_am5dnn) / 2) + (Double.parseDouble(edittext_am9d.getText().toString()) / 2))) + (Double.parseDouble(edittext_am7d.getText().toString()) + Double.parseDouble(edittext_am11d.getText().toString()))));
				}
				if ((edittext_am3d.getText().toString().equals("0") || edittext_am5dnn.equals("a.m")) || (edittext_am9d.getText().toString().equals("a.m") || (edittext_am6d.getText().toString().equals("a.m") || edittext_am10d.getText().toString().equals("a.m")))) {
					edittext48d.setText(String.valueOf(0.00d));
				}
				else {
					edittext48d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am3d.getText().toString()) - (((Double.parseDouble(edittext_am5dnn) / 2) + (Double.parseDouble(edittext_am9d.getText().toString()) / 2)) + (Double.parseDouble(edittext_am6d.getText().toString()) + Double.parseDouble(edittext_am10d.getText().toString())))));
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
								
edittext6d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext6dnn.equals("") || edittext6dnn.equals(".")) || (edittext6dnn.equals("-") || ((Double.parseDouble(edittext6dnn) < 0) || (Double.parseDouble(edittext6dnn) == 0)))) {
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
								
if (edittext_am6dnn.equals("a.m") || (edittext_am7d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m"))) {
					edittext20d.setText(String.valueOf(0.00d));
				}
				else {
					edittext20d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am6dnn) + (Double.parseDouble(edittext_am7d.getText().toString()) + Double.parseDouble(edittext_am12d.getText().toString()))));
				}
				if ((edittext_am3d.getText().toString().equals("0") || edittext_am5d.getText().toString().equals("a.m")) || (edittext_am9d.getText().toString().equals("a.m") || (edittext_am6dnn.equals("a.m") || edittext_am10d.getText().toString().equals("a.m")))) {
					edittext48d.setText(String.valueOf(0.00d));
				}
				else {
					edittext48d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am3d.getText().toString()) - (((Double.parseDouble(edittext_am5d.getText().toString()) / 2) + (Double.parseDouble(edittext_am9d.getText().toString()) / 2)) + (Double.parseDouble(edittext_am6dnn) + Double.parseDouble(edittext_am10d.getText().toString())))));
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
								
edittext7d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext7dnn.equals("") || edittext7dnn.equals(".")) || (edittext7dnn.equals("-") || (Double.parseDouble(edittext7dnn) < 0))) {
					edittext_am7d.setText("a.m");
				}
				else {
					edittext_am7d.setText(String.valueOf(Double.parseDouble(edittext7dnn)));
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
								
if ((edittext_am3d.getText().toString().equals("0") || edittext_am5d.getText().toString().equals("a.m")) || (edittext_am9d.getText().toString().equals("a.m") || (edittext_am7dnn.equals("a.m") || edittext_am11d.getText().toString().equals("a.m")))) {
					edittext32d.setText(String.valueOf(0.00d));
				}
				else {
					edittext32d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am3d.getText().toString()) - ((Double.parseDouble(edittext_am5d.getText().toString()) / 2) + (Double.parseDouble(edittext_am9d.getText().toString()) / 2))) + (Double.parseDouble(edittext_am7dnn) + Double.parseDouble(edittext_am11d.getText().toString()))));
				}
				if (edittext_am6d.getText().toString().equals("a.m") || (edittext_am7dnn.equals("a.m") || edittext_am12d.getText().toString().equals("a.m"))) {
					edittext20d.setText(String.valueOf(0.00d));
				}
				else {
					edittext20d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am6d.getText().toString()) + (Double.parseDouble(edittext_am7dnn) + Double.parseDouble(edittext_am12d.getText().toString()))));
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
				if ((edittext9dnn.equals("") || edittext9dnn.equals(".")) || (edittext9dnn.equals("-") || ((Double.parseDouble(edittext9dnn) < 0) || (Double.parseDouble(edittext9dnn) == 0)))) {
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
								
if ((edittext_am3d.getText().toString().equals("0") || edittext_am5d.getText().toString().equals("a.m")) || (edittext_am9dnn.equals("a.m") || (edittext_am7d.getText().toString().equals("a.m") || edittext_am11d.getText().toString().equals("a.m")))) {
					edittext32d.setText(String.valueOf(0.00d));
				}
				else {
					edittext32d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am3d.getText().toString()) - ((Double.parseDouble(edittext_am5d.getText().toString()) / 2) + (Double.parseDouble(edittext_am9dnn) / 2))) + (Double.parseDouble(edittext_am7d.getText().toString()) + Double.parseDouble(edittext_am11d.getText().toString()))));
				}
				if ((edittext_am3d.getText().toString().equals("0") || edittext_am5d.getText().toString().equals("a.m")) || (edittext_am9dnn.equals("a.m") || (edittext_am6d.getText().toString().equals("a.m") || edittext_am10d.getText().toString().equals("a.m")))) {
					edittext48d.setText(String.valueOf(0.00d));
				}
				else {
					edittext48d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am3d.getText().toString()) - (((Double.parseDouble(edittext_am5d.getText().toString()) / 2) + (Double.parseDouble(edittext_am9dnn) / 2)) + (Double.parseDouble(edittext_am6d.getText().toString()) + Double.parseDouble(edittext_am10d.getText().toString())))));
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
				if ((edittext10dnn.equals("") || edittext10dnn.equals(".")) || (edittext10dnn.equals("-") || ((Double.parseDouble(edittext10dnn) < 0) || (Double.parseDouble(edittext10dnn) == 0)))) {
					edittext_am10d.setText("a.m");
				}
				else {
					edittext_am10d.setText(String.valueOf(Double.parseDouble(edittext10dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am10d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am10dnn = _param1.toString();
								
if (edittext_am10dnn.equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m"))) {
					edittext21d.setText(String.valueOf(0.00d));
				}
				else {
					edittext21d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am10dnn) + (Double.parseDouble(edittext_am11d.getText().toString()) + Double.parseDouble(edittext_am12d.getText().toString()))));
				}
				if ((edittext_am3d.getText().toString().equals("0") || edittext_am5d.getText().toString().equals("a.m")) || (edittext_am9d.getText().toString().equals("a.m") || (edittext_am6d.getText().toString().equals("a.m") || edittext_am10dnn.equals("a.m")))) {
					edittext48d.setText(String.valueOf(0.00d));
				}
				else {
					edittext48d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am3d.getText().toString()) - (((Double.parseDouble(edittext_am5d.getText().toString()) / 2) + (Double.parseDouble(edittext_am9d.getText().toString()) / 2)) + (Double.parseDouble(edittext_am6d.getText().toString()) + Double.parseDouble(edittext_am10dnn)))));
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
								
edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext11dnn.equals("") || edittext11dnn.equals(".")) || (edittext11dnn.equals("-") || (Double.parseDouble(edittext11dnn) < 0))) {
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
								
if ((edittext_am3d.getText().toString().equals("0") || edittext_am5d.getText().toString().equals("a.m")) || (edittext_am9d.getText().toString().equals("a.m") || (edittext_am7d.getText().toString().equals("a.m") || edittext_am11dnn.equals("a.m")))) {
					edittext32d.setText(String.valueOf(0.00d));
				}
				else {
					edittext32d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am3d.getText().toString()) - ((Double.parseDouble(edittext_am5d.getText().toString()) / 2) + (Double.parseDouble(edittext_am9d.getText().toString()) / 2))) + (Double.parseDouble(edittext_am7d.getText().toString()) + Double.parseDouble(edittext_am11dnn))));
				}
				if (edittext_am10d.getText().toString().equals("a.m") || (edittext_am11dnn.equals("a.m") || edittext_am12d.getText().toString().equals("a.m"))) {
					edittext21d.setText(String.valueOf(0.00d));
				}
				else {
					edittext21d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am10d.getText().toString()) + (Double.parseDouble(edittext_am11dnn) + Double.parseDouble(edittext_am12d.getText().toString()))));
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
								
edittext12d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext12dnn.equals("") || edittext12dnn.equals(".")) || (edittext12dnn.equals("-") || ((Double.parseDouble(edittext12dnn) < 0) || (Double.parseDouble(edittext12dnn) == 0)))) {
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
								
if (edittext_am6d.getText().toString().equals("a.m") || (edittext_am7d.getText().toString().equals("a.m") || edittext_am12dnn.equals("a.m"))) {
					edittext20d.setText(String.valueOf(0.00d));
				}
				else {
					edittext20d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am6d.getText().toString()) + (Double.parseDouble(edittext_am7d.getText().toString()) + Double.parseDouble(edittext_am12dnn))));
				}
				if (edittext_am10d.getText().toString().equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12dnn.equals("a.m"))) {
					edittext21d.setText(String.valueOf(0.00d));
				}
				else {
					edittext21d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am10d.getText().toString()) + (Double.parseDouble(edittext_am11d.getText().toString()) + Double.parseDouble(edittext_am12dnn))));
				}
				if (edittext_am12dnn.equals("a.m")) {
					edittext33d.setText(String.valueOf(0.00d));
				}
				else {
					if (Double.parseDouble(edittext32d.getText().toString()) > (Double.parseDouble(edittext19d.getText().toString()) - ((Double.parseDouble(edittext18d.getText().toString()) - 1) * Double.parseDouble(edittext_am12dnn)))) {
						edittext33d.setText(_English_Decimal_Format(Double.parseDouble(edittext19d.getText().toString()) - (Double.parseDouble(edittext18d.getText().toString()) * Double.parseDouble(edittext_am12dnn))));
					}
					else {
						edittext33d.setText(_English_Decimal_Format(Double.parseDouble(edittext19d.getText().toString()) - ((Double.parseDouble(edittext18d.getText().toString()) - 1) * Double.parseDouble(edittext_am12dnn))));
					}
				}
				if (edittext_am12dnn.equals("a.m") || edittext_am13d.getText().toString().equals("a.m")) {
					edittext37d.setText(String.valueOf(0.00d));
					edittext40d.setText(String.valueOf(Double.parseDouble(edittext38d.getText().toString())));
				}
				else {
					edittext37d.setText(_English_Decimal_Format(Double.parseDouble(edittext36d.getText().toString()) * (Double.parseDouble(edittext_am13d.getText().toString()) - Double.parseDouble(edittext_am12dnn))));
					if (Double.parseDouble(edittext38d.getText().toString()) > Double.parseDouble(edittext_am13d.getText().toString())) {
						edittext40d.setText(_English_Decimal_Format((Double.parseDouble(edittext38d.getText().toString()) - Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext_am12dnn)));
					}
					else {
						edittext40d.setText(_English_Decimal_Format(Double.parseDouble(edittext38d.getText().toString())));
					}
				}
				if (edittext_am12dnn.equals("a.m") || (Double.parseDouble(edittext34d.getText().toString()) == 0)) {
					edittext31d.setText("0");
				}
				else {
					if (Double.parseDouble(edittext34d.getText().toString()) < (2 * Double.parseDouble(edittext_am12dnn))) {
						edittext31d.setText("1");
					}
					else {
						edittext31d.setText("0");
					}
				}
				if (edittext_am12dnn.equals("a.m") || (Double.parseDouble(edittext40d.getText().toString()) == 0)) {
					edittext41d.setText("0");
				}
				else {
					if (Double.parseDouble(edittext40d.getText().toString()) < (2 * Double.parseDouble(edittext_am12dnn))) {
						if (Double.parseDouble(edittext40d.getText().toString()) < Double.parseDouble(edittext_am12dnn)) {
							edittext41d.setText("0");
						}
						else {
							edittext41d.setText("1");
						}
					}
					else {
						edittext41d.setText("0");
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
								
edittext13d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext13dnn.equals("") || edittext13dnn.equals(".")) || (edittext13dnn.equals("-") || ((Double.parseDouble(edittext13dnn) < 0) || (Double.parseDouble(edittext13dnn) == 0)))) {
					edittext_am13d.setText("a.m");
				}
				else {
					edittext_am13d.setText(String.valueOf(Double.parseDouble(edittext13dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am13d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am13dnn = _param1.toString();
								
if (edittext_am12d.getText().toString().equals("a.m") || edittext_am13dnn.equals("a.m")) {
					edittext37d.setText(String.valueOf(0.00d));
					edittext40d.setText(String.valueOf(Double.parseDouble(edittext38d.getText().toString())));
				}
				else {
					edittext37d.setText(_English_Decimal_Format(Double.parseDouble(edittext36d.getText().toString()) * (Double.parseDouble(edittext_am13dnn) - Double.parseDouble(edittext_am12d.getText().toString()))));
					if (Double.parseDouble(edittext38d.getText().toString()) > Double.parseDouble(edittext_am13dnn)) {
						edittext40d.setText(_English_Decimal_Format((Double.parseDouble(edittext38d.getText().toString()) - Double.parseDouble(edittext_am13dnn)) + Double.parseDouble(edittext_am12d.getText().toString())));
					}
					else {
						edittext40d.setText(_English_Decimal_Format(Double.parseDouble(edittext38d.getText().toString())));
					}
				}
				if (edittext_am13dnn.equals("a.m")) {
					edittext35d.setText(String.valueOf(0.00d));
					edittext39d.setText(String.valueOf(0.00d));
					edittext49d.setText(String.valueOf(0.00d));
					edittext50d.setText(String.valueOf(0.00d));
				}
				else {
					if (Double.parseDouble(edittext34d.getText().toString()) < 0) {
						edittext35d.setText(String.valueOf(0.00d));
					}
					else {
						edittext35d.setText(_English_Decimal_Format(Double.parseDouble(edittext34d.getText().toString()) / Double.parseDouble(edittext_am13dnn)));
					}
					if (Double.parseDouble(edittext38d.getText().toString()) > Double.parseDouble(edittext_am13dnn)) {
						edittext39d.setText(_English_Decimal_Format(Double.parseDouble(edittext36d.getText().toString()) + 1));
					}
					else {
						edittext39d.setText(_English_Decimal_Format(Double.parseDouble(edittext36d.getText().toString())));
					}
					edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13dnn)) + Double.parseDouble(edittext19d.getText().toString()))));
					edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am13dnn) - Double.parseDouble(edittext40d.getText().toString())));
				}
				if (edittext_am13dnn.equals("a.m") || (Double.parseDouble(edittext22d.getText().toString()) == 0)) {
					edittext28d.setText("0");
				}
				else {
					if (Double.parseDouble(edittext_am13dnn) < Double.parseDouble(edittext22d.getText().toString())) {
						edittext28d.setText("1");
					}
					else {
						edittext28d.setText("0");
					}
				}
				if (edittext_am13dnn.equals("a.m") || (Double.parseDouble(edittext25d.getText().toString()) == 0)) {
					edittext29d.setText("0");
				}
				else {
					if (Double.parseDouble(edittext_am13dnn) < Double.parseDouble(edittext25d.getText().toString())) {
						edittext29d.setText("1");
					}
					else {
						edittext29d.setText("0");
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
		edittext15d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext15dnn = _param1.toString();
								
edittext15d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext15dnn.equals("") || edittext15dnn.equals(".")) || (edittext15dnn.equals("-") || ((Double.parseDouble(edittext15dnn) < 0) || (Double.parseDouble(edittext15dnn) == 0)))) {
					edittext_am14d.setText(String.valueOf(0));
					edittext_am15d.setText(String.valueOf(0));
				}
				else {
					edittext_am14d.setText(String.valueOf(1));
					edittext_am15d.setText(String.valueOf(Double.parseDouble(edittext15dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am14d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am14dnn = _param1.toString();
								
edittext18d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am14dnn) + Double.parseDouble(edittext16d.getText().toString())));
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
								
edittext19d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15dnn) + Double.parseDouble(edittext17d.getText().toString())));
				if ((Double.parseDouble(edittext23d.getText().toString()) == 00.00d) && (Double.parseDouble(edittext_am15dnn) == 00.00d)) {
					edittext24d.setText(String.valueOf(0.00d));
				}
				else {
					if ((Double.parseDouble(edittext23d.getText().toString()) > 00.00d) && (Double.parseDouble(edittext_am15dnn) == 00.00d)) {
						edittext24d.setText(_English_Decimal_Format(Double.parseDouble(edittext23d.getText().toString())));
					}
					else {
						if ((Double.parseDouble(edittext23d.getText().toString()) == 00.00d) && (Double.parseDouble(edittext_am15dnn) > 00.00d)) {
							edittext24d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15dnn)));
						}
						else {
							if ((Double.parseDouble(edittext23d.getText().toString()) > 00.00d) && (Double.parseDouble(edittext_am15dnn) > 00.00d)) {
								edittext24d.setText(_English_Decimal_Format(Math.min(Double.parseDouble(edittext23d.getText().toString()), Double.parseDouble(edittext_am15dnn))));
							}
						}
					}
				}
				if ((Double.parseDouble(edittext25d.getText().toString()) == 00.00d) && (Double.parseDouble(edittext_am15dnn) == 00.00d)) {
					edittext26d.setText(String.valueOf(0.00d));
				}
				else {
					if ((Double.parseDouble(edittext25d.getText().toString()) > 00.00d) && (Double.parseDouble(edittext_am15dnn) == 00.00d)) {
						edittext26d.setText(_English_Decimal_Format(Double.parseDouble(edittext25d.getText().toString())));
					}
					else {
						if ((Double.parseDouble(edittext25d.getText().toString()) == 00.00d) && (Double.parseDouble(edittext_am15dnn) > 00.00d)) {
							edittext26d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15dnn)));
						}
						else {
							if ((Double.parseDouble(edittext25d.getText().toString()) > 00.00d) && (Double.parseDouble(edittext_am15dnn) > 00.00d)) {
								edittext26d.setText(_English_Decimal_Format(Math.max(Double.parseDouble(edittext25d.getText().toString()), Double.parseDouble(edittext_am15dnn))));
							}
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
		add_dynamic_short_piece.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
					final LinearLayout dynamic_short_piece = (LinearLayout) inflater.inflate(R.layout.toip_d_pipe_line_short_pieces, null, false);
					linear_dynamic_short_piece.addView(dynamic_short_piece);
					/*
أولا تعريفات الدينامك
*/
					/*
ImageView
*/
					final ImageView close3ds= dynamic_short_piece.findViewById(R.id.close3ds);
					/*
EditText
*/
					final EditText edittext14ds = dynamic_short_piece.findViewById(R.id.edittext14ds);
					edittext14ds.setSingleLine(true);
					edittext14ds.setFocusableInTouchMode(true);
					final EditText edittext_am14ds = dynamic_short_piece.findViewById(R.id.edittext_am14ds);
					edittext_am14ds.setSingleLine(true);
					edittext_am14ds.setFocusableInTouchMode(true);
					final EditText edittext15ds = dynamic_short_piece.findViewById(R.id.edittext15ds);
					edittext15ds.setSingleLine(true);
					edittext15ds.setFocusableInTouchMode(true);
					final EditText edittext_am15ds = dynamic_short_piece.findViewById(R.id.edittext_am15ds);
					edittext_am15ds.setSingleLine(true);
					edittext_am15ds.setFocusableInTouchMode(true);
					final EditText edittext23ds = dynamic_short_piece.findViewById(R.id.edittext23ds);
					edittext23ds.setSingleLine(true);
					edittext23ds.setFocusableInTouchMode(true);
					final EditText edittext25ds = dynamic_short_piece.findViewById(R.id.edittext25ds);
					edittext25ds.setSingleLine(true);
					edittext25ds.setFocusableInTouchMode(true);
					/*
linear204dss
*/
					final LinearLayout linear204dss = dynamic_short_piece.findViewById(R.id.linear204dss);
					/*
ثانيآ المدخلات والمعادلات
*/
					/*
التعليقات المخفية ومربعات الأوامر المخفية
*/
					linear204dss.setVisibility(View.GONE);
					/*
الترقيم
*/
					edittext14ds.setText(String.valueOf((long)(linear_dynamic_short_piece.getChildCount() + 1)));
					/*
الأوامر
*/
					edittext15ds.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext15dsnn = _param1.toString();
											
edittext15ds.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
							if ((edittext15dsnn.equals("") || edittext15dsnn.equals(".")) || (edittext15dsnn.equals("-") || ((Double.parseDouble(edittext15dsnn) < 0) || (Double.parseDouble(edittext15dsnn) == 0)))) {
								edittext_am14ds.setText(String.valueOf(0));
								edittext_am15ds.setText(String.valueOf(0));
								edittext23ds.setText(String.valueOf(1111985));
								edittext25ds.setText(String.valueOf(0));
							}
							else {
								edittext_am14ds.setText(String.valueOf(1));
								edittext_am15ds.setText(String.valueOf(Double.parseDouble(edittext15dsnn)));
								edittext23ds.setText(String.valueOf(Double.parseDouble(edittext15dsnn)));
								edittext25ds.setText(String.valueOf(Double.parseDouble(edittext15dsnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am14ds.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am14dsnn = _param1.toString();
											
temp = 0;
							for (int i = 0; i < (int)(linear_dynamic_short_piece.getChildCount()); i++) {
								View child=linear_dynamic_short_piece.getChildAt(i); 
								TextView tempo =child.findViewById(R.id.edittext_am14ds);
								temp = temp + Double.parseDouble(tempo.getText().toString());
							}
							edittext16d.setText(_English_Decimal_Format(temp));
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am15ds.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am15dsnn = _param1.toString();
											
temp1 = 0;
							for (int i = 0; i < (int)(linear_dynamic_short_piece.getChildCount()); i++) {
								View child=linear_dynamic_short_piece.getChildAt(i); 
								TextView tempo1 =child.findViewById(R.id.edittext_am15ds);
								temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
							}
							edittext17d.setText(_English_Decimal_Format(temp1));
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext23ds.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext23dsnn = _param1.toString();
											
temp2 = 100;
							for (int i = 0; i < (int)(linear_dynamic_short_piece.getChildCount()); i++) {
								View child=linear_dynamic_short_piece.getChildAt(i); 
								TextView tempo2 =child.findViewById(R.id.edittext23ds);
								temp2 = Math.min(temp2, Double.parseDouble(tempo2.getText().toString()));
							}
							edittext23d.setText(_English_Decimal_Format(temp2));
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext25ds.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext25dsnn = _param1.toString();
											
temp3 = 0;
							for (int i = 0; i < (int)(linear_dynamic_short_piece.getChildCount()); i++) {
								View child=linear_dynamic_short_piece.getChildAt(i); 
								TextView tempo3 =child.findViewById(R.id.edittext25ds);
								temp3 = Math.max(temp3, Double.parseDouble(tempo3.getText().toString()));
							}
							edittext25d.setText(_English_Decimal_Format(temp3));
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					close3ds.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							_removeView(dynamic_short_piece);
							edittext14ds.setText("");
							edittext15ds.setText("");
						}
					});
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		button1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					if (edittext_am3d.getText().toString().equals("0")) {
						SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع المدخلات مرة اخري");
					}
					else {
						if ((edittext5d.getText().toString().equals("") || edittext5d.getText().toString().equals(".")) || (edittext5d.getText().toString().equals("-") || (Double.parseDouble(edittext5d.getText().toString()) < 0))) {
							edittext5d.setText(String.valueOf(1.20d));
						}
						if ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) {
							edittext6d.setText(String.valueOf(0.25d));
						}
						if ((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))) {
							edittext7d.setText(String.valueOf(0.10d));
						}
						if ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) {
							edittext9d.setText(String.valueOf(1.20d));
						}
						if ((edittext10d.getText().toString().equals("") || edittext10d.getText().toString().equals(".")) || (edittext10d.getText().toString().equals("-") || (Double.parseDouble(edittext10d.getText().toString()) < 0))) {
							edittext10d.setText(String.valueOf(0.25d));
						}
						if ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) {
							edittext11d.setText(String.valueOf(0.10d));
						}
						if ((edittext12d.getText().toString().equals("") || edittext12d.getText().toString().equals(".")) || (edittext12d.getText().toString().equals("-") || (Double.parseDouble(edittext12d.getText().toString()) < 0))) {
							edittext12d.setText(String.valueOf(0.2d));
						}
						if ((edittext13d.getText().toString().equals("") || edittext13d.getText().toString().equals(".")) || (edittext13d.getText().toString().equals("-") || (Double.parseDouble(edittext13d.getText().toString()) < 0))) {
							edittext13d.setText(String.valueOf(6));
						}
						if (linear204d.getVisibility() == View.VISIBLE) {
							if ((edittext14d.getText().toString().equals("") || edittext14d.getText().toString().equals(".")) || (edittext14d.getText().toString().equals("-") || (Double.parseDouble(edittext14d.getText().toString()) < 0))) {
								edittext14d.setText(String.valueOf((long)(1)));
							}
							if ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0))) {
								edittext15d.setText(String.valueOf(1));
							}
						}
					}
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		edittext16d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext16dnn = _param1.toString();
								
edittext18d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am14d.getText().toString()) + Double.parseDouble(edittext16dnn)));
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
								
edittext19d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15d.getText().toString()) + Double.parseDouble(edittext17dnn)));
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext18d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext18dnn = _param1.toString();
								
if (edittext_am12d.getText().toString().equals("a.m")) {
					edittext33d.setText(String.valueOf(0.00d));
				}
				else {
					if (Double.parseDouble(edittext32d.getText().toString()) > (Double.parseDouble(edittext19d.getText().toString()) - ((Double.parseDouble(edittext18dnn) - 1) * Double.parseDouble(edittext_am12d.getText().toString())))) {
						edittext33d.setText(_English_Decimal_Format(Double.parseDouble(edittext19d.getText().toString()) - (Double.parseDouble(edittext18dnn) * Double.parseDouble(edittext_am12d.getText().toString()))));
					}
					else {
						edittext33d.setText(_English_Decimal_Format(Double.parseDouble(edittext19d.getText().toString()) - ((Double.parseDouble(edittext18dnn) - 1) * Double.parseDouble(edittext_am12d.getText().toString()))));
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
		edittext19d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext19dnn = _param1.toString();
								
if (edittext_am12d.getText().toString().equals("a.m")) {
					edittext33d.setText(String.valueOf(0.00d));
				}
				else {
					if (Double.parseDouble(edittext32d.getText().toString()) > (Double.parseDouble(edittext19dnn) - ((Double.parseDouble(edittext18d.getText().toString()) - 1) * Double.parseDouble(edittext_am12d.getText().toString())))) {
						edittext33d.setText(_English_Decimal_Format(Double.parseDouble(edittext19dnn) - (Double.parseDouble(edittext18d.getText().toString()) * Double.parseDouble(edittext_am12d.getText().toString()))));
					}
					else {
						edittext33d.setText(_English_Decimal_Format(Double.parseDouble(edittext19dnn) - ((Double.parseDouble(edittext18d.getText().toString()) - 1) * Double.parseDouble(edittext_am12d.getText().toString()))));
					}
				}
				if (edittext_am13d.getText().toString().equals("a.m")) {
					edittext49d.setText(String.valueOf(0.00d));
				}
				else {
					edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19dnn))));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext20d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext20dnn = _param1.toString();
								
if ((Double.parseDouble(edittext20dnn) == 00.00d) && (Double.parseDouble(edittext21d.getText().toString()) == 00.00d)) {
					edittext22d.setText(String.valueOf(0.00d));
				}
				else {
					if ((Double.parseDouble(edittext20dnn) > 00.00d) && (Double.parseDouble(edittext21d.getText().toString()) == 00.00d)) {
						edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext20dnn)));
					}
					else {
						if ((Double.parseDouble(edittext20dnn) == 00.00d) && (Double.parseDouble(edittext21d.getText().toString()) > 00.00d)) {
							edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext21d.getText().toString())));
						}
						else {
							if ((Double.parseDouble(edittext20dnn) > 00.00d) && (Double.parseDouble(edittext21d.getText().toString()) > 00.00d)) {
								edittext22d.setText(_English_Decimal_Format(Math.min(Double.parseDouble(edittext20dnn), Double.parseDouble(edittext21d.getText().toString()))));
							}
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
		edittext21d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext21dnn = _param1.toString();
								
if ((Double.parseDouble(edittext21dnn) == 00.00d) && (Double.parseDouble(edittext20d.getText().toString()) == 00.00d)) {
					edittext22d.setText(String.valueOf(0.00d));
				}
				else {
					if ((Double.parseDouble(edittext21dnn) > 00.00d) && (Double.parseDouble(edittext20d.getText().toString()) == 00.00d)) {
						edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext21dnn)));
					}
					else {
						if ((Double.parseDouble(edittext21dnn) == 00.00d) && (Double.parseDouble(edittext20d.getText().toString()) > 00.00d)) {
							edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext20d.getText().toString())));
						}
						else {
							if ((Double.parseDouble(edittext21dnn) > 00.00d) && (Double.parseDouble(edittext20d.getText().toString()) > 00.00d)) {
								edittext22d.setText(_English_Decimal_Format(Math.min(Double.parseDouble(edittext21dnn), Double.parseDouble(edittext20d.getText().toString()))));
							}
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
		edittext22d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext22dnn = _param1.toString();
								
if ((Double.parseDouble(edittext22dnn) == 0) || (Double.parseDouble(edittext24d.getText().toString()) == 0)) {
					edittext27d.setText("0");
				}
				else {
					if (Double.parseDouble(edittext22dnn) > Double.parseDouble(edittext24d.getText().toString())) {
						edittext27d.setText("1");
					}
					else {
						edittext27d.setText("0");
					}
				}
				if (edittext_am13d.getText().toString().equals("a.m") || (Double.parseDouble(edittext22dnn) == 0)) {
					edittext28d.setText("0");
				}
				else {
					if (Double.parseDouble(edittext_am13d.getText().toString()) < Double.parseDouble(edittext22dnn)) {
						edittext28d.setText("1");
					}
					else {
						edittext28d.setText("0");
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
		edittext23d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext23dnn = _param1.toString();
								
if ((Double.parseDouble(edittext23dnn) == 00.00d) && (Double.parseDouble(edittext_am15d.getText().toString()) == 00.00d)) {
					edittext24d.setText(String.valueOf(0.00d));
				}
				else {
					if ((Double.parseDouble(edittext23dnn) > 00.00d) && (Double.parseDouble(edittext_am15d.getText().toString()) == 00.00d)) {
						edittext24d.setText(_English_Decimal_Format(Double.parseDouble(edittext23dnn)));
					}
					else {
						if ((Double.parseDouble(edittext23dnn) == 00.00d) && (Double.parseDouble(edittext_am15d.getText().toString()) > 00.00d)) {
							edittext24d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15d.getText().toString())));
						}
						else {
							if ((Double.parseDouble(edittext23dnn) > 00.00d) && (Double.parseDouble(edittext_am15d.getText().toString()) > 00.00d)) {
								edittext24d.setText(_English_Decimal_Format(Math.min(Double.parseDouble(edittext23dnn), Double.parseDouble(edittext_am15d.getText().toString()))));
							}
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
		edittext24d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext24dnn = _param1.toString();
								
if ((Double.parseDouble(edittext22d.getText().toString()) == 0) || (Double.parseDouble(edittext24dnn) == 0)) {
					edittext27d.setText("0");
				}
				else {
					if (Double.parseDouble(edittext22d.getText().toString()) > Double.parseDouble(edittext24dnn)) {
						edittext27d.setText("1");
					}
					else {
						edittext27d.setText("0");
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
		edittext25d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext25dnn = _param1.toString();
								
if ((Double.parseDouble(edittext25dnn) == 00.00d) && (Double.parseDouble(edittext_am15d.getText().toString()) == 00.00d)) {
					edittext26d.setText(String.valueOf(0.00d));
				}
				else {
					if ((Double.parseDouble(edittext25dnn) > 00.00d) && (Double.parseDouble(edittext_am15d.getText().toString()) == 00.00d)) {
						edittext26d.setText(_English_Decimal_Format(Double.parseDouble(edittext25dnn)));
					}
					else {
						if ((Double.parseDouble(edittext25dnn) == 00.00d) && (Double.parseDouble(edittext_am15d.getText().toString()) > 00.00d)) {
							edittext26d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15d.getText().toString())));
						}
						else {
							if ((Double.parseDouble(edittext25dnn) > 00.00d) && (Double.parseDouble(edittext_am15d.getText().toString()) > 00.00d)) {
								edittext26d.setText(_English_Decimal_Format(Math.max(Double.parseDouble(edittext25dnn), Double.parseDouble(edittext_am15d.getText().toString()))));
							}
						}
					}
				}
				if (edittext_am13d.getText().toString().equals("a.m") || (Double.parseDouble(edittext25dnn) == 0)) {
					edittext29d.setText("0");
				}
				else {
					if (Double.parseDouble(edittext_am13d.getText().toString()) < Double.parseDouble(edittext25dnn)) {
						edittext29d.setText("1");
					}
					else {
						edittext29d.setText("0");
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
		edittext32d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext32dnn = _param1.toString();
								
if (edittext_am12d.getText().toString().equals("a.m")) {
					edittext33d.setText(String.valueOf(0.00d));
				}
				else {
					if (Double.parseDouble(edittext32dnn) > (Double.parseDouble(edittext19d.getText().toString()) - ((Double.parseDouble(edittext18d.getText().toString()) - 1) * Double.parseDouble(edittext_am12d.getText().toString())))) {
						edittext33d.setText(_English_Decimal_Format(Double.parseDouble(edittext19d.getText().toString()) - (Double.parseDouble(edittext18d.getText().toString()) * Double.parseDouble(edittext_am12d.getText().toString()))));
					}
					else {
						edittext33d.setText(_English_Decimal_Format(Double.parseDouble(edittext19d.getText().toString()) - ((Double.parseDouble(edittext18d.getText().toString()) - 1) * Double.parseDouble(edittext_am12d.getText().toString()))));
					}
				}
				if (Double.parseDouble(edittext32dnn) == 0) {
					edittext34d.setText(String.valueOf(0));
				}
				else {
					edittext34d.setText(_English_Decimal_Format(Double.parseDouble(edittext32dnn) - Double.parseDouble(edittext33d.getText().toString())));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext33d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext33dnn = _param1.toString();
								
if (Double.parseDouble(edittext32d.getText().toString()) == 0) {
					edittext34d.setText(String.valueOf(0));
				}
				else {
					edittext34d.setText(_English_Decimal_Format(Double.parseDouble(edittext32d.getText().toString()) - Double.parseDouble(edittext33dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext34d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext34dnn = _param1.toString();
								
if ((edittext_am12d.getText().toString().equals("a.m") || edittext_am13d.getText().toString().equals("a.m")) || (Double.parseDouble(edittext34dnn) < 0)) {
					edittext35d.setText(String.valueOf(0.00d));
				}
				else {
					edittext35d.setText(_English_Decimal_Format(Double.parseDouble(edittext34dnn) / Double.parseDouble(edittext_am13d.getText().toString())));
				}
				edittext38d.setText(_English_Decimal_Format(Double.parseDouble(edittext34dnn) - Double.parseDouble(edittext37d.getText().toString())));
				if (Double.parseDouble(edittext34dnn) < -0.5d) {
					edittext30d.setText(String.valueOf(1));
				}
				else {
					edittext30d.setText(String.valueOf(0));
				}
				if (edittext_am12d.getText().toString().equals("a.m") || (Double.parseDouble(edittext34dnn) == 0)) {
					edittext31d.setText(String.valueOf(0));
				}
				else {
					if ((Double.parseDouble(edittext34dnn) > 0) && (Double.parseDouble(edittext34dnn) < (2 * Double.parseDouble(edittext_am12d.getText().toString())))) {
						edittext31d.setText(String.valueOf(1));
					}
					else {
						edittext31d.setText(String.valueOf(0));
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
		edittext35d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext35dnn = _param1.toString();
								
edittext36d.setText(_English_Decimal_Format(Math.floor(Double.parseDouble(edittext35dnn))));
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext36d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext36dnn = _param1.toString();
								
if (edittext_am12d.getText().toString().equals("a.m") || edittext_am13d.getText().toString().equals("a.m")) {
					edittext37d.setText(String.valueOf(0.00d));
				}
				else {
					edittext37d.setText(_English_Decimal_Format(Double.parseDouble(edittext36dnn) * (Double.parseDouble(edittext_am13d.getText().toString()) - Double.parseDouble(edittext_am12d.getText().toString()))));
				}
				if (edittext_am13d.getText().toString().equals("a.m")) {
					edittext49d.setText(String.valueOf(0.00d));
				}
				else {
					edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext38d.getText().toString()) + ((Double.parseDouble(edittext36dnn) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext37d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext37dnn = _param1.toString();
								
edittext38d.setText(_English_Decimal_Format(Double.parseDouble(edittext34d.getText().toString()) - Double.parseDouble(edittext37dnn)));
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext38d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext38dnn = _param1.toString();
								
if (edittext_am13d.getText().toString().equals("a.m")) {
					edittext39d.setText(String.valueOf(0.00d));
				}
				else {
					if (Double.parseDouble(edittext38dnn) > Double.parseDouble(edittext_am13d.getText().toString())) {
						edittext39d.setText(_English_Decimal_Format(Double.parseDouble(edittext36d.getText().toString()) + 1));
					}
					else {
						edittext39d.setText(_English_Decimal_Format(Double.parseDouble(edittext36d.getText().toString())));
					}
				}
				if (edittext_am12d.getText().toString().equals("a.m") || edittext_am13d.getText().toString().equals("a.m")) {
					edittext40d.setText(String.valueOf(Double.parseDouble(edittext38dnn)));
				}
				else {
					if (Double.parseDouble(edittext38dnn) > Double.parseDouble(edittext_am13d.getText().toString())) {
						edittext40d.setText(_English_Decimal_Format((Double.parseDouble(edittext38dnn) - Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext_am12d.getText().toString())));
					}
					else {
						edittext40d.setText(_English_Decimal_Format(Double.parseDouble(edittext38dnn)));
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
		edittext39d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext39dnn = _param1.toString();
								
if (edittext_am13d.getText().toString().equals("a.m")) {
					edittext49d.setText(String.valueOf(0.00d));
				}
				else {
					edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39dnn) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext40d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext40dnn = _param1.toString();
								
if (edittext_am13d.getText().toString().equals("a.m")) {
					edittext49d.setText(String.valueOf(0.00d));
					edittext50d.setText(String.valueOf(0.00d));
				}
				else {
					edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40dnn) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
					edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am13d.getText().toString()) - Double.parseDouble(edittext40dnn)));
				}
				if (edittext_am12d.getText().toString().equals("a.m") || (Double.parseDouble(edittext40dnn) == 0)) {
					edittext41d.setText("0");
				}
				else {
					if (Double.parseDouble(edittext40dnn) < (2 * Double.parseDouble(edittext_am12d.getText().toString()))) {
						if ((Double.parseDouble(edittext40dnn) < Double.parseDouble(edittext_am12d.getText().toString())) || (Double.parseDouble(edittext40dnn) == Double.parseDouble(edittext_am12d.getText().toString()))) {
							edittext41d.setText("0");
						}
						else {
							edittext41d.setText("1");
						}
					}
					else {
						edittext41d.setText("0");
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
		edittext48d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext48dnn = _param1.toString();
								
if (Double.parseDouble(edittext48dnn) == 0) {
					edittext42d.setText("0");
					temp4 = 0;
					for (int i = 0; i < (int)(linear_dynamic_pipe_line_length_differencess.getChildCount()); i++) {
						View child=linear_dynamic_pipe_line_length_differencess.getChildAt(i); 
						TextView tempo4 =child.findViewById(R.id.edittext48d);
						temp4 = temp4 + Double.parseDouble(tempo4.getText().toString());
					}
					edittext3.setText(_English_Decimal_Format(temp4));
				}
				else {
					if (Double.parseDouble(edittext48dnn) < 0.30d) {
						edittext42d.setText("1");
					}
					else {
						edittext42d.setText("0");
						temp4 = 0;
						for (int i = 0; i < (int)(linear_dynamic_pipe_line_length_differencess.getChildCount()); i++) {
							View child=linear_dynamic_pipe_line_length_differencess.getChildAt(i); 
							TextView tempo4 =child.findViewById(R.id.edittext48d);
							temp4 = temp4 + Double.parseDouble(tempo4.getText().toString());
						}
						edittext3.setText(_English_Decimal_Format(temp4));
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
		edittext27d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext27dnn = _param1.toString();
								
if (Double.parseDouble(edittext27dnn) == 1) {
					linear27d.setVisibility(View.VISIBLE);
				}
				else {
					linear27d.setVisibility(View.GONE);
				}
				if ((((edittext_am12d.getText().toString().equals("a.m") || edittext_am13d.getText().toString().equals("a.m")) || (Double.parseDouble(edittext27dnn) == 1)) || (Double.parseDouble(edittext28d.getText().toString()) == 1)) || (((Double.parseDouble(edittext30d.getText().toString()) == 1) || (Double.parseDouble(edittext31d.getText().toString()) == 1)) || ((Double.parseDouble(edittext41d.getText().toString()) == 1) || (Double.parseDouble(edittext42d.getText().toString()) == 1)))) {
					edittext49d.setText(String.valueOf(0.00d));
					edittext50d.setText(String.valueOf(0.00d));
				}
				else {
					if (Double.parseDouble(edittext40d.getText().toString()) < 0) {
						edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
						edittext50d.setText(_English_Decimal_Format(-1 * Double.parseDouble(edittext40d.getText().toString())));
					}
					else {
						if ((Double.parseDouble(edittext40d.getText().toString()) == Double.parseDouble(edittext_am12d.getText().toString())) || (Double.parseDouble(edittext40d.getText().toString()) == 0)) {
							edittext49d.setText(_English_Decimal_Format((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString())));
							edittext50d.setText(_English_Decimal_Format(0.00d));
						}
						else {
							if (Double.parseDouble(edittext40d.getText().toString()) < Double.parseDouble(edittext_am12d.getText().toString())) {
								edittext49d.setText(_English_Decimal_Format((-1 * Double.parseDouble(edittext40d.getText().toString())) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
								edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am12d.getText().toString()) - Double.parseDouble(edittext40d.getText().toString())));
							}
							else {
								edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
								edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am13d.getText().toString()) - Double.parseDouble(edittext40d.getText().toString())));
							}
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
		edittext28d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext28dnn = _param1.toString();
								
if (Double.parseDouble(edittext28dnn) == 1) {
					linear28d.setVisibility(View.VISIBLE);
				}
				else {
					linear28d.setVisibility(View.GONE);
				}
				if ((((edittext_am12d.getText().toString().equals("a.m") || edittext_am13d.getText().toString().equals("a.m")) || (Double.parseDouble(edittext27d.getText().toString()) == 1)) || (Double.parseDouble(edittext28dnn) == 1)) || (((Double.parseDouble(edittext30d.getText().toString()) == 1) || (Double.parseDouble(edittext31d.getText().toString()) == 1)) || ((Double.parseDouble(edittext41d.getText().toString()) == 1) || (Double.parseDouble(edittext42d.getText().toString()) == 1)))) {
					edittext49d.setText(String.valueOf(0.00d));
					edittext50d.setText(String.valueOf(0.00d));
				}
				else {
					if (Double.parseDouble(edittext40d.getText().toString()) < 0) {
						edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
						edittext50d.setText(_English_Decimal_Format(-1 * Double.parseDouble(edittext40d.getText().toString())));
					}
					else {
						if ((Double.parseDouble(edittext40d.getText().toString()) == Double.parseDouble(edittext_am12d.getText().toString())) || (Double.parseDouble(edittext40d.getText().toString()) == 0)) {
							edittext49d.setText(_English_Decimal_Format((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString())));
							edittext50d.setText(_English_Decimal_Format(0.00d));
						}
						else {
							if (Double.parseDouble(edittext40d.getText().toString()) < Double.parseDouble(edittext_am12d.getText().toString())) {
								edittext49d.setText(_English_Decimal_Format((-1 * Double.parseDouble(edittext40d.getText().toString())) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
								edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am12d.getText().toString()) - Double.parseDouble(edittext40d.getText().toString())));
							}
							else {
								edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
								edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am13d.getText().toString()) - Double.parseDouble(edittext40d.getText().toString())));
							}
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
		edittext29d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext29dnn = _param1.toString();
								
if (Double.parseDouble(edittext29dnn) == 1) {
					linear29d.setVisibility(View.VISIBLE);
				}
				else {
					linear29d.setVisibility(View.GONE);
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext30d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext30dnn = _param1.toString();
								
if (Double.parseDouble(edittext30dnn) == 1) {
					linear30d.setVisibility(View.VISIBLE);
				}
				else {
					linear30d.setVisibility(View.GONE);
				}
				if ((((edittext_am12d.getText().toString().equals("a.m") || edittext_am13d.getText().toString().equals("a.m")) || (Double.parseDouble(edittext27d.getText().toString()) == 1)) || (Double.parseDouble(edittext28d.getText().toString()) == 1)) || (((Double.parseDouble(edittext30dnn) == 1) || (Double.parseDouble(edittext31d.getText().toString()) == 1)) || ((Double.parseDouble(edittext41d.getText().toString()) == 1) || (Double.parseDouble(edittext42d.getText().toString()) == 1)))) {
					edittext49d.setText(String.valueOf(0.00d));
					edittext50d.setText(String.valueOf(0.00d));
				}
				else {
					if (Double.parseDouble(edittext40d.getText().toString()) < 0) {
						edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
						edittext50d.setText(_English_Decimal_Format(-1 * Double.parseDouble(edittext40d.getText().toString())));
					}
					else {
						if ((Double.parseDouble(edittext40d.getText().toString()) == Double.parseDouble(edittext_am12d.getText().toString())) || (Double.parseDouble(edittext40d.getText().toString()) == 0)) {
							edittext49d.setText(_English_Decimal_Format((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString())));
							edittext50d.setText(_English_Decimal_Format(0.00d));
						}
						else {
							if (Double.parseDouble(edittext40d.getText().toString()) < Double.parseDouble(edittext_am12d.getText().toString())) {
								edittext49d.setText(_English_Decimal_Format((-1 * Double.parseDouble(edittext40d.getText().toString())) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
								edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am12d.getText().toString()) - Double.parseDouble(edittext40d.getText().toString())));
							}
							else {
								edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
								edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am13d.getText().toString()) - Double.parseDouble(edittext40d.getText().toString())));
							}
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
		edittext31d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext31dnn = _param1.toString();
								
if (Double.parseDouble(edittext31dnn) == 1) {
					linear31d.setVisibility(View.VISIBLE);
				}
				else {
					linear31d.setVisibility(View.GONE);
				}
				if ((((edittext_am12d.getText().toString().equals("a.m") || edittext_am13d.getText().toString().equals("a.m")) || (Double.parseDouble(edittext27d.getText().toString()) == 1)) || (Double.parseDouble(edittext28d.getText().toString()) == 1)) || (((Double.parseDouble(edittext30d.getText().toString()) == 1) || (Double.parseDouble(edittext31dnn) == 1)) || ((Double.parseDouble(edittext41d.getText().toString()) == 1) || (Double.parseDouble(edittext42d.getText().toString()) == 1)))) {
					edittext49d.setText(String.valueOf(0.00d));
					edittext50d.setText(String.valueOf(0.00d));
				}
				else {
					if (Double.parseDouble(edittext40d.getText().toString()) < 0) {
						edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
						edittext50d.setText(_English_Decimal_Format(-1 * Double.parseDouble(edittext40d.getText().toString())));
					}
					else {
						if ((Double.parseDouble(edittext40d.getText().toString()) == Double.parseDouble(edittext_am12d.getText().toString())) || (Double.parseDouble(edittext40d.getText().toString()) == 0)) {
							edittext49d.setText(_English_Decimal_Format((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString())));
							edittext50d.setText(_English_Decimal_Format(0.00d));
						}
						else {
							if (Double.parseDouble(edittext40d.getText().toString()) < Double.parseDouble(edittext_am12d.getText().toString())) {
								edittext49d.setText(_English_Decimal_Format((-1 * Double.parseDouble(edittext40d.getText().toString())) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
								edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am12d.getText().toString()) - Double.parseDouble(edittext40d.getText().toString())));
							}
							else {
								edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
								edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am13d.getText().toString()) - Double.parseDouble(edittext40d.getText().toString())));
							}
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
		edittext41d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext41dnn = _param1.toString();
								
if (Double.parseDouble(edittext41dnn) == 1) {
					linear40d.setVisibility(View.VISIBLE);
					linear41d.setVisibility(View.VISIBLE);
				}
				else {
					linear40d.setVisibility(View.GONE);
					linear41d.setVisibility(View.GONE);
				}
				if ((((edittext_am12d.getText().toString().equals("a.m") || edittext_am13d.getText().toString().equals("a.m")) || (Double.parseDouble(edittext27d.getText().toString()) == 1)) || (Double.parseDouble(edittext28d.getText().toString()) == 1)) || (((Double.parseDouble(edittext30d.getText().toString()) == 1) || (Double.parseDouble(edittext31d.getText().toString()) == 1)) || ((Double.parseDouble(edittext41dnn) == 1) || (Double.parseDouble(edittext42d.getText().toString()) == 1)))) {
					edittext49d.setText(String.valueOf(0.00d));
					edittext50d.setText(String.valueOf(0.00d));
				}
				else {
					if (Double.parseDouble(edittext40d.getText().toString()) < 0) {
						edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
						edittext50d.setText(_English_Decimal_Format(-1 * Double.parseDouble(edittext40d.getText().toString())));
					}
					else {
						if ((Double.parseDouble(edittext40d.getText().toString()) == Double.parseDouble(edittext_am12d.getText().toString())) || (Double.parseDouble(edittext40d.getText().toString()) == 0)) {
							edittext49d.setText(_English_Decimal_Format((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString())));
							edittext50d.setText(_English_Decimal_Format(0.00d));
						}
						else {
							if (Double.parseDouble(edittext40d.getText().toString()) < Double.parseDouble(edittext_am12d.getText().toString())) {
								edittext49d.setText(_English_Decimal_Format((-1 * Double.parseDouble(edittext40d.getText().toString())) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
								edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am12d.getText().toString()) - Double.parseDouble(edittext40d.getText().toString())));
							}
							else {
								edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
								edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am13d.getText().toString()) - Double.parseDouble(edittext40d.getText().toString())));
							}
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
		edittext42d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext42dnn = _param1.toString();
								
if (Double.parseDouble(edittext42dnn) == 1) {
					linear42d.setVisibility(View.VISIBLE);
				}
				else {
					linear42d.setVisibility(View.GONE);
				}
				if ((((edittext_am12d.getText().toString().equals("a.m") || edittext_am13d.getText().toString().equals("a.m")) || (Double.parseDouble(edittext27d.getText().toString()) == 1)) || (Double.parseDouble(edittext28d.getText().toString()) == 1)) || (((Double.parseDouble(edittext30d.getText().toString()) == 1) || (Double.parseDouble(edittext31d.getText().toString()) == 1)) || ((Double.parseDouble(edittext41d.getText().toString()) == 1) || (Double.parseDouble(edittext42dnn) == 1)))) {
					edittext49d.setText(String.valueOf(0.00d));
					edittext50d.setText(String.valueOf(0.00d));
				}
				else {
					if (Double.parseDouble(edittext40d.getText().toString()) < 0) {
						edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
						edittext50d.setText(_English_Decimal_Format(-1 * Double.parseDouble(edittext40d.getText().toString())));
					}
					else {
						if ((Double.parseDouble(edittext40d.getText().toString()) == Double.parseDouble(edittext_am12d.getText().toString())) || (Double.parseDouble(edittext40d.getText().toString()) == 0)) {
							edittext49d.setText(_English_Decimal_Format((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString())));
							edittext50d.setText(_English_Decimal_Format(0.00d));
						}
						else {
							if (Double.parseDouble(edittext40d.getText().toString()) < Double.parseDouble(edittext_am12d.getText().toString())) {
								edittext49d.setText(_English_Decimal_Format((-1 * Double.parseDouble(edittext40d.getText().toString())) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
								edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am12d.getText().toString()) - Double.parseDouble(edittext40d.getText().toString())));
							}
							else {
								edittext49d.setText(_English_Decimal_Format(Double.parseDouble(edittext40d.getText().toString()) + ((Double.parseDouble(edittext39d.getText().toString()) * Double.parseDouble(edittext_am13d.getText().toString())) + Double.parseDouble(edittext19d.getText().toString()))));
								edittext50d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am13d.getText().toString()) - Double.parseDouble(edittext40d.getText().toString())));
							}
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
		edittext49d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext49dnn = _param1.toString();
								
temp5 = 0;
				for (int i = 0; i < (int)(linear_dynamic_pipe_line_length_differencess.getChildCount()); i++) {
					View child=linear_dynamic_pipe_line_length_differencess.getChildAt(i); 
					TextView tempo5 =child.findViewById(R.id.edittext49d);
					temp5 = temp5 + Double.parseDouble(tempo5.getText().toString());
				}
				edittext39.setText(_English_Decimal_Format(temp5));
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext50d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext50dnn = _param1.toString();
								
temp6 = 0;
				for (int i = 0; i < (int)(linear_dynamic_pipe_line_length_differencess.getChildCount()); i++) {
					View child=linear_dynamic_pipe_line_length_differencess.getChildAt(i); 
					TextView tempo6 =child.findViewById(R.id.edittext50d);
					temp6 = temp6 + Double.parseDouble(tempo6.getText().toString());
				}
				edittext40.setText(_English_Decimal_Format(temp6));
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
				linear204d.setVisibility(View.GONE);
				edittext14d.setText("");
				edittext15d.setText("");
			}
		});
		close1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_pipe_line_length_differencess);
				edittext3d.setText("");
			}
		});
		final ImageView print1d = dynamic_pipe_line_length_differencess.findViewById(R.id.print1d);
		print1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_PrintHelper(dynamic_pipe_line_length_differencess);
			}
		});
	}
	
}
