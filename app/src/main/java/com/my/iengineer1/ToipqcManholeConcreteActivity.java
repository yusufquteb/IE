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
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.*;
import org.json.*;
import androidx.print.PrintHelper;


public class ToipqcManholeConcreteActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double sum = 0;
	private double sum30 = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview1;
	private LinearLayout linear713;
	private LinearLayout linear176;
	private LinearLayout linear_print;
	private LinearLayout dynamic_manhole_linear;
	private LinearLayout add_dynamic_manhole_linear;
	private LinearLayout linear721;
	private HorizontalScrollView hscroll4;
	private LinearLayout linear722;
	private Button button195;
	private LinearLayout linear720;
	private Button button196;
	private LinearLayout linear707;
	private Button button44d;
	private ImageView imageview36;
	private TextView textview1222;
	private TextView textview583;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear410;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private EditText edittext137;
	private TextView textview845;
	private TextView textview585;
	private TextView textview584;
	private Button button1;
	private TextView textview809;
	private ImageView print1d;
	private LinearLayout linear723;
	private TextView textview704;
	private Button add_dynamic_manhole;
	private TextView textview1204;
	private TextView textview1203;
	private LinearLayout linear454;
	private TextView textview1202;
	private EditText edittext31;
	private TextView textview1201;
	private TextView textview1200;
	private LinearLayout linear452;
	private TextView textview1199;
	private EditText edittext33;
	
	private Intent price = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipqc_manhole_concrete);
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
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		textview1 = findViewById(R.id.textview1);
		linear713 = findViewById(R.id.linear713);
		linear176 = findViewById(R.id.linear176);
		linear_print = findViewById(R.id.linear_print);
		dynamic_manhole_linear = findViewById(R.id.dynamic_manhole_linear);
		add_dynamic_manhole_linear = findViewById(R.id.add_dynamic_manhole_linear);
		linear721 = findViewById(R.id.linear721);
		hscroll4 = findViewById(R.id.hscroll4);
		linear722 = findViewById(R.id.linear722);
		button195 = findViewById(R.id.button195);
		linear720 = findViewById(R.id.linear720);
		button196 = findViewById(R.id.button196);
		linear707 = findViewById(R.id.linear707);
		button44d = findViewById(R.id.button44d);
		imageview36 = findViewById(R.id.imageview36);
		textview1222 = findViewById(R.id.textview1222);
		textview583 = findViewById(R.id.textview583);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear410 = findViewById(R.id.linear410);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		edittext137 = findViewById(R.id.edittext137);
		textview845 = findViewById(R.id.textview845);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		button1 = findViewById(R.id.button1);
		textview809 = findViewById(R.id.textview809);
		print1d = findViewById(R.id.print1d);
		linear723 = findViewById(R.id.linear723);
		textview704 = findViewById(R.id.textview704);
		add_dynamic_manhole = findViewById(R.id.add_dynamic_manhole);
		textview1204 = findViewById(R.id.textview1204);
		textview1203 = findViewById(R.id.textview1203);
		linear454 = findViewById(R.id.linear454);
		textview1202 = findViewById(R.id.textview1202);
		edittext31 = findViewById(R.id.edittext31);
		textview1201 = findViewById(R.id.textview1201);
		textview1200 = findViewById(R.id.textview1200);
		linear452 = findViewById(R.id.linear452);
		textview1199 = findViewById(R.id.textview1199);
		edittext33 = findViewById(R.id.edittext33);
		
		button195.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/PiUxwNAVDr4"));
				startActivity(price);
			}
		});
		
		button196.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://drive.google.com/file/d/1lgnvZYsN1jqAEUsnxDtOjZBid8VVwY1v/view?usp=drive_link"));
				startActivity(price);
			}
		});
		
		button44d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear176.setVisibility(View.VISIBLE);
			}
		});
		
		imageview36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear176.setVisibility(View.GONE);
			}
		});
		
		print1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_PrintHelper(linear1);
			}
		});
		
		add_dynamic_manhole.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				// Create new fragment instance
								ToipqcDManholeConcreteFragmentActivity fragment = new ToipqcDManholeConcreteFragmentActivity();
								
								androidx.fragment.app.FragmentManager fragmentManager = getSupportFragmentManager();
								androidx.fragment.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
								// Add fragment to dynamic_manhole_linear container
								fragmentTransaction.add(R.id.dynamic_manhole_linear, fragment).addToBackStack(null).commit();
			}
		});
	}
	
	private void initializeLogic() {
		linear176.setVisibility(View.GONE);
		linear721.setVisibility(View.VISIBLE);
		linear722.setVisibility(View.VISIBLE);
		{
		}
		
		add_dynamic_manhole.performClick(); 
	}
	
	
	@Override
	public void onBackPressed() {
		if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
			            // Exit the activity instead of popping fragments
			            finish();
			        } else {
			            super.onBackPressed();
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
		PrintHelper printHelper = new PrintHelper(ToipqcManholeConcreteActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
	
	public void _recalculateSum() {
		sum = 0;
		sum30 = 0;
		for (int i = 0; i < ((LinearLayout) dynamic_manhole_linear).getChildCount(); i++) {
			View v = ((LinearLayout)dynamic_manhole_linear).getChildAt(i);
			TextView textView = v.findViewById(R.id.edittext29d);
			if (textView != null && !TextUtils.isEmpty(textView.getText())) {
				try{
					sum = sum + Double.parseDouble(textView.getText().toString());
				}catch(Exception e){
					 
				}
			}
			TextView textView30 = v.findViewById(R.id.edittext30d);
			if (textView30 != null && !TextUtils.isEmpty(textView30.getText())) {
				try{
					sum30 = sum30 + Double.parseDouble(textView30.getText().toString());
				}catch(Exception e){
					 
				}
			}
		}
		edittext31.setText(String.valueOf(sum));
		edittext33.setText(String.valueOf(sum30));
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}
