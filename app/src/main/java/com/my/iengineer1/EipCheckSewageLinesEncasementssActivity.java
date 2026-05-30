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


public class EipCheckSewageLinesEncasementssActivity extends AppCompatActivity {
	
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
	private AlertDialog.Builder dialog;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.eip_check_sewage_lines_encasementss);
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
		dialog = new AlertDialog.Builder(this);
		
		button195.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/EkNcJdSRK-g"));
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
	}
	
	private void initializeLogic() {
		
		{
		}
		_dynamic_excavaion();
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
		PrintHelper printHelper = new PrintHelper(EipCheckSewageLinesEncasementssActivity.this); //change the activity name
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
		final EditText edittext5d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext5d);
		edittext5d.setSingleLine(true);
		edittext5d.setFocusableInTouchMode(true);
		final EditText edittext_am5d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am5d);
		edittext_am5d.setSingleLine(true);
		edittext_am5d.setFocusableInTouchMode(true);
		final EditText edittext6d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext6d);
		edittext6d.setSingleLine(true);
		edittext6d.setFocusableInTouchMode(true);
		final EditText edittext_am6d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am6d);
		edittext_am6d.setSingleLine(true);
		edittext_am6d.setFocusableInTouchMode(true);
		final EditText edittext8d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext8d);
		edittext8d.setSingleLine(true);
		edittext8d.setFocusableInTouchMode(true);
		final EditText edittext_am8d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am8d);
		edittext_am8d.setSingleLine(true);
		edittext_am8d.setFocusableInTouchMode(true);
		final EditText edittext9d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext9d);
		edittext9d.setSingleLine(true);
		edittext9d.setFocusableInTouchMode(true);
		final EditText edittext_am9d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am9d);
		edittext_am9d.setSingleLine(true);
		edittext_am9d.setFocusableInTouchMode(true);
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
		final EditText edittext14d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext14d);
		edittext14d.setSingleLine(true);
		edittext14d.setFocusableInTouchMode(true);
		final EditText edittext15d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext15d);
		edittext15d.setSingleLine(true);
		edittext15d.setFocusableInTouchMode(true);
		/*
TextView
*/
		final TextView textview118d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview118d);
		final TextView textview5d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview5d);
		final TextView textview6d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview6d);
		final TextView textview9d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview9d);
		/*
Button
*/
		final Button button1d = dynamic_pipe_line_check_excavation.findViewById(R.id.button1d);
		final Button button2dw = dynamic_pipe_line_check_excavation.findViewById(R.id.button2dw);
		final Button button5dl = dynamic_pipe_line_check_excavation.findViewById(R.id.button5dl);
		button2dw.setText("أضافة فحص واستلام عرض طبقة تغليف وحماية جديد");
		button5dl.setText("أضافة فحص واستلام منسوب طبقة تغليف وحماية جديد");
		/*
LinearLayout
*/
		final LinearLayout linear_dynamic_pipe_line_check_excavation_width = dynamic_pipe_line_check_excavation.findViewById(R.id.linear_dynamic_pipe_line_check_excavation_width);
		final LinearLayout linear_dynamic_pipe_line_check_excavation_level = dynamic_pipe_line_check_excavation.findViewById(R.id.linear_dynamic_pipe_line_check_excavation_level);
		/*
الميل التصميمي
*/
		final LinearLayout linear210d = dynamic_pipe_line_check_excavation.findViewById(R.id.linear210d);
		linear210d.setVisibility(View.GONE);
		/*
قاع الحفر عند نهاية الفرعة
*/
		final TextView textview8d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview8d);
		textview8d.setText("منسوب ميه الماسورة عند بداية الفرعة");
		final TextView textview13d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview13d);
		textview13d.setText("منسوب سطح التغليف عند بداية الفرعة أو الخط");
		final TextView textview32d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview32d);
		textview32d.setText("منسوب سطح التغليف عند نهاية الفرعة أو الخط");
		final EditText edittext31d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext31d);
		edittext31d.setSingleLine(true);
		edittext31d.setFocusableInTouchMode(true);
		final EditText edittext_am31d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am31d);
		edittext_am31d.setSingleLine(true);
		edittext_am31d.setFocusableInTouchMode(true);
		edittext_am31d.setVisibility(View.GONE);
		final EditText edittext32d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext32d);
		edittext32d.setSingleLine(true);
		edittext32d.setFocusableInTouchMode(true);
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
		final EditText edittext33d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext33d);
		edittext33d.setSingleLine(true);
		edittext33d.setFocusableInTouchMode(true);
		final EditText edittext_am32d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am32d);
		edittext_am32d.setSingleLine(true);
		edittext_am32d.setFocusableInTouchMode(true);
		edittext_am32d.setVisibility(View.GONE);
		final TextView textview26d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview26d);
		textview26d.setText("قراءة القامة لسطح التغليف عند بداية الفرعة أو الخط");
		final TextView textview33d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview33d);
		textview33d.setText("قراءة القامة لظهر الماسورة عند نهاية الفرعة أو الخط");
		/*
عرض الأحلال من أعلي والميول الجانبية
*/
		final EditText edittext41d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext41d);
		edittext41d.setSingleLine(true);
		edittext41d.setFocusableInTouchMode(true);
		final EditText edittext_am41d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am41d);
		edittext_am41d.setSingleLine(true);
		edittext_am41d.setFocusableInTouchMode(true);
		edittext_am41d.setVisibility(View.GONE);
		final EditText edittext42d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext42d);
		edittext42d.setSingleLine(true);
		edittext42d.setFocusableInTouchMode(true);
		final EditText edittext_am42d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am42d);
		edittext_am42d.setSingleLine(true);
		edittext_am42d.setFocusableInTouchMode(true);
		edittext_am42d.setVisibility(View.GONE);
		final EditText edittext43d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext43d);
		edittext43d.setSingleLine(true);
		edittext43d.setFocusableInTouchMode(true);
		final TextView textview41d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview41d);
		final TextView textview42d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview42d);
		textview41d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* ميل جوانب طبقة الحماية والتغليف فى الأتجاه الأفقي");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٠٠\nمما يعني راسية الحفر وعدم وجود ميول جانبية");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		textview42d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* ميل جوانب طبقة الحماية والتغليف فى الأتجاه الراسي");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٠٠\nمما يعني راسية الحفر وعدم وجود ميول جانبية");
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
* سمك طبقة الحماية والتغليف حول وأعلي المواسير ( م )
*/
		final TextView textview51d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview51d);
		textview51d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* سمك طبقة التغليف حول وأعلي المواسير ( م )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٣٠ م");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		final EditText edittext51d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext51d);
		edittext51d.setSingleLine(true);
		edittext51d.setFocusableInTouchMode(true);
		final EditText edittext_am51d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext_am51d);
		edittext_am51d.setSingleLine(true);
		edittext_am51d.setFocusableInTouchMode(true);
		edittext_am51d.setVisibility(View.GONE);
		final EditText edittext52d = dynamic_pipe_line_check_excavation.findViewById(R.id.edittext52d);
		edittext52d.setSingleLine(true);
		edittext52d.setFocusableInTouchMode(true);
		/*
ثانيآ المدخلات والمعادلات
*/
		/*
المسميات
*/
		final TextView textview14d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview14d);
		textview14d.setText("عرض قاع الحفر التصميمي\n( م )");
		final TextView textview40d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview40d);
		final TextView textview43d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview43d);
		textview40d.setText("ميل جوانب طبقة الحماية والتغليف\n( الميل الجانبي لطبقات الحماية والتغليف لقطاع الحفر والأحلال العرضي )");
		textview43d.setText("العرض التصميمي عند سطح طبقة الحماية والتغليف ( م )\n( عرض طبقة الحماية والتغليف التصميمي من الأعلي طبقا للميول الجانبية )");
		final TextView textview107d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview107d);
		final TextView textview108d = dynamic_pipe_line_check_excavation.findViewById(R.id.textview108d);
		textview107d.setText("أولآ فحص واستلام عرض طبقة التغليف والحماية من الأعلي :-");
		textview108d.setText("ثانيآ فحص واستلام منسوب سطح طبقة التغليف والحماية من الأعلي :-");
		/*
التعليقات المخفية ومربعات الأوامر المخفية
*/
		textview118d.setVisibility(View.GONE);
		textview118d.setText("طول الفرعة التصميمي\nأقل من بعد النقطة المراد فحصها عن بداية الفرعة \n( المسافة من النقطة التصميمية عند بداية الفرعة الي النقطة المرصودة )\nوهذا غير منطقي وغير هندسي\nوعليه يرجي اعادة ادخال طول الفرعة التصميمي ليكون أكبر من بعد النقطة المراد فحصها عن بداية الفرعة ");
		edittext_am3d.setVisibility(View.GONE);
		edittext_am4d.setVisibility(View.GONE);
		edittext_am5d.setVisibility(View.GONE);
		edittext_am6d.setVisibility(View.GONE);
		edittext_am8d.setVisibility(View.GONE);
		edittext_am9d.setVisibility(View.GONE);
		edittext_am11d.setVisibility(View.GONE);
		edittext_am12d.setVisibility(View.GONE);
		/*
التعليقات
*/
		textview5d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* رفرفة الحفر من الجانب الأيمن للماسورة ( م )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٣٠ م");
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
				dialog.setTitle("* رفرفة الحفر من الجانب الأيسر للماسورة ( م )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٣٠ م");
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
				dialog.setTitle("* سمك الأحلال أسفل المواسير ( م )");
				dialog.setMessage("مدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.١٥ م");
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
								
if (edittext_am4dnn.equals("a.m") || (edittext_am5d.getText().toString().equals("a.m") || edittext_am6d.getText().toString().equals("a.m"))) {
					edittext14d.setText(String.valueOf(0.00d));
				}
				else {
					edittext14d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am4dnn) + (Double.parseDouble(edittext_am5d.getText().toString()) + Double.parseDouble(edittext_am6d.getText().toString()))));
				}
				if (edittext_am51d.getText().toString().equals("a.m") || (edittext_am4dnn.equals("a.m") || edittext_am9d.getText().toString().equals("a.m"))) {
					edittext52d.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext52d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am51d.getText().toString()) + Double.parseDouble(edittext_am9d.getText().toString())) + Double.parseDouble(edittext_am4dnn)));
				}
				if (edittext_am51d.getText().toString().equals("a.m") || (edittext_am8d.getText().toString().equals("a.m") || edittext_am4dnn.equals("a.m"))) {
					edittext13d.setText(String.valueOf(0.00d));
					edittext_am13d.setText("a.m");
				}
				else {
					edittext13d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am51d.getText().toString()) + Double.parseDouble(edittext_am8d.getText().toString())) + Double.parseDouble(edittext_am4dnn)));
					edittext_am13d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am51d.getText().toString()) + Double.parseDouble(edittext_am8d.getText().toString())) + Double.parseDouble(edittext_am4dnn)));
				}
				if (edittext_am51d.getText().toString().equals("a.m") || (edittext_am4dnn.equals("a.m") || edittext_am31d.getText().toString().equals("a.m"))) {
					edittext32d.setText(String.valueOf(0.00d));
					edittext_am32d.setText("a.m");
				}
				else {
					edittext32d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am51d.getText().toString()) + Double.parseDouble(edittext_am4dnn)) + Double.parseDouble(edittext_am31d.getText().toString())));
					edittext_am32d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am51d.getText().toString()) + Double.parseDouble(edittext_am4dnn)) + Double.parseDouble(edittext_am31d.getText().toString())));
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
								
if (edittext_am4d.getText().toString().equals("a.m") || (edittext_am5dnn.equals("a.m") || edittext_am6d.getText().toString().equals("a.m"))) {
					edittext14d.setText(String.valueOf(0.00d));
				}
				else {
					edittext14d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am4d.getText().toString()) + (Double.parseDouble(edittext_am5dnn) + Double.parseDouble(edittext_am6d.getText().toString()))));
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
								
edittext6d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
								
if (edittext_am4d.getText().toString().equals("a.m") || (edittext_am5d.getText().toString().equals("a.m") || edittext_am6dnn.equals("a.m"))) {
					edittext14d.setText(String.valueOf(0.00d));
				}
				else {
					edittext14d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am4d.getText().toString()) + (Double.parseDouble(edittext_am5d.getText().toString()) + Double.parseDouble(edittext_am6dnn))));
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
								
edittext41d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((edittext41dnn.equals("") || edittext41dnn.equals(".")) || (edittext41dnn.equals("-") || ((Double.parseDouble(edittext41dnn) < 0) || (Double.parseDouble(edittext41dnn) == 0)))) {
					edittext_am41d.setText("a.m");
				}
				else {
					edittext_am41d.setText(String.valueOf(Double.parseDouble(edittext41dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am41d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am41dnn = _param1.toString();
								
if ((edittext52d.getText().toString().equals("a.m") || (Double.parseDouble(edittext14d.getText().toString()) == 00.00d)) || (edittext_am42d.getText().toString().equals("a.m") || edittext_am41dnn.equals("a.m"))) {
					edittext43d.setText(String.valueOf(Double.parseDouble(edittext14d.getText().toString())));
				}
				else {
					edittext43d.setText(_English_Decimal_Format(((Double.parseDouble(edittext52d.getText().toString()) * (Double.parseDouble(edittext_am41dnn) / Double.parseDouble(edittext_am42d.getText().toString()))) + Double.parseDouble(edittext14d.getText().toString())) + (Double.parseDouble(edittext52d.getText().toString()) * (Double.parseDouble(edittext_am41dnn) / Double.parseDouble(edittext_am42d.getText().toString())))));
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
								
edittext42d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((edittext42dnn.equals("") || edittext42dnn.equals(".")) || (edittext42dnn.equals("-") || ((Double.parseDouble(edittext42dnn) < 0) || (Double.parseDouble(edittext42dnn) == 0)))) {
					edittext_am42d.setText("a.m");
				}
				else {
					edittext_am42d.setText(String.valueOf(Double.parseDouble(edittext42dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am42d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am42dnn = _param1.toString();
								
if ((edittext52d.getText().toString().equals("a.m") || (Double.parseDouble(edittext14d.getText().toString()) == 00.00d)) || (edittext_am41d.getText().toString().equals("a.m") || edittext_am42dnn.equals("a.m"))) {
					edittext43d.setText(String.valueOf(Double.parseDouble(edittext14d.getText().toString())));
				}
				else {
					edittext43d.setText(_English_Decimal_Format(((Double.parseDouble(edittext52d.getText().toString()) * (Double.parseDouble(edittext_am41d.getText().toString()) / Double.parseDouble(edittext_am42dnn))) + Double.parseDouble(edittext14d.getText().toString())) + (Double.parseDouble(edittext52d.getText().toString()) * (Double.parseDouble(edittext_am41d.getText().toString()) / Double.parseDouble(edittext_am42dnn)))));
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
								
if (edittext_am51d.getText().toString().equals("a.m") || (edittext_am8dnn.equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) {
					edittext13d.setText(String.valueOf(0.00d));
					edittext_am13d.setText("a.m");
				}
				else {
					edittext13d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am51d.getText().toString()) + Double.parseDouble(edittext_am8dnn)) + Double.parseDouble(edittext_am4d.getText().toString())));
					edittext_am13d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am51d.getText().toString()) + Double.parseDouble(edittext_am8dnn)) + Double.parseDouble(edittext_am4d.getText().toString())));
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
								
edittext31d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				if ((edittext31dnn.equals("") || edittext31dnn.equals(".")) || edittext31dnn.equals("-")) {
					edittext_am31d.setText("a.m");
				}
				else {
					edittext_am31d.setText(String.valueOf(Double.parseDouble(edittext31dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am31d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am31dnn = _param1.toString();
								
if (edittext_am51d.getText().toString().equals("a.m") || (edittext_am31dnn.equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) {
					edittext32d.setText(String.valueOf(0.00d));
					edittext_am32d.setText("a.m");
				}
				else {
					edittext32d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am51d.getText().toString()) + Double.parseDouble(edittext_am31dnn)) + Double.parseDouble(edittext_am4d.getText().toString())));
					edittext_am32d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am51d.getText().toString()) + Double.parseDouble(edittext_am31dnn)) + Double.parseDouble(edittext_am4d.getText().toString())));
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
								
edittext9d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
								
if (edittext_am51d.getText().toString().equals("a.m") || (edittext_am9dnn.equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) {
					edittext52d.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext52d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am51d.getText().toString()) + Double.parseDouble(edittext_am9dnn)) + Double.parseDouble(edittext_am4d.getText().toString())));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext51d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext51dnn = _param1.toString();
								
edittext51d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((edittext51dnn.equals("") || edittext51dnn.equals(".")) || (edittext51dnn.equals("-") || (Double.parseDouble(edittext51dnn) < 0))) {
					edittext_am51d.setText("a.m");
				}
				else {
					edittext_am51d.setText(String.valueOf(Double.parseDouble(edittext51dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext_am51d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am51dnn = _param1.toString();
								
if (edittext_am51dnn.equals("a.m") || (edittext_am8d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) {
					edittext13d.setText(String.valueOf(0.00d));
					edittext_am13d.setText("a.m");
				}
				else {
					edittext13d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am51dnn) + Double.parseDouble(edittext_am8d.getText().toString())) + Double.parseDouble(edittext_am4d.getText().toString())));
					edittext_am13d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am51dnn) + Double.parseDouble(edittext_am8d.getText().toString())) + Double.parseDouble(edittext_am4d.getText().toString())));
				}
				if (edittext_am4d.getText().toString().equals("a.m") || (edittext_am51dnn.equals("a.m") || edittext_am31d.getText().toString().equals("a.m"))) {
					edittext32d.setText(String.valueOf(0.00d));
					edittext_am32d.setText("a.m");
				}
				else {
					edittext32d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am4d.getText().toString()) + Double.parseDouble(edittext_am51dnn)) + Double.parseDouble(edittext_am31d.getText().toString())));
					edittext_am32d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am4d.getText().toString()) + Double.parseDouble(edittext_am51dnn)) + Double.parseDouble(edittext_am31d.getText().toString())));
				}
				if (edittext_am51dnn.equals("a.m") || (edittext_am9d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m"))) {
					edittext52d.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext52d.setText(_English_Decimal_Format((Double.parseDouble(edittext_am51dnn) + Double.parseDouble(edittext_am9d.getText().toString())) + Double.parseDouble(edittext_am4d.getText().toString())));
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
		button1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext_am3d.getText().toString().equals("a.m") || (edittext_am4d.getText().toString().equals("a.m") || edittext_am8d.getText().toString().equals("a.m"))) || ((edittext_am31d.getText().toString().equals("a.m") || edittext_am11d.getText().toString().equals("a.m")) || edittext_am12d.getText().toString().equals("a.m"))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext_am5d.getText().toString().equals("a.m")) {
						edittext5d.setText(String.valueOf(0.30d));
						edittext_am5d.setText(String.valueOf(0.30d));
					}
					if (edittext_am6d.getText().toString().equals("a.m")) {
						edittext6d.setText(String.valueOf(0.30d));
						edittext_am6d.setText(String.valueOf(0.30d));
					}
					if (edittext_am9d.getText().toString().equals("a.m")) {
						edittext9d.setText(String.valueOf(0.15d));
						edittext_am9d.setText(String.valueOf(0.15d));
					}
					if (edittext_am41d.getText().toString().equals("a.m")) {
						edittext41d.setText(String.valueOf(0.00d));
					}
					if (edittext_am42d.getText().toString().equals("a.m")) {
						edittext42d.setText(String.valueOf(0.00d));
					}
					if (edittext_am51d.getText().toString().equals("a.m")) {
						edittext51d.setText(String.valueOf(0.30d));
					}
				}
			}
		});
		edittext14d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext14dnn = _param1.toString();
								
if (((Double.parseDouble(edittext52d.getText().toString()) == 00.00d) || (Double.parseDouble(edittext14dnn) == 00.00d)) || (edittext_am41d.getText().toString().equals("a.m") || edittext_am42d.getText().toString().equals("a.m"))) {
					edittext43d.setText(String.valueOf(Double.parseDouble(edittext14dnn)));
				}
				else {
					edittext43d.setText(_English_Decimal_Format(((Double.parseDouble(edittext52d.getText().toString()) * (Double.parseDouble(edittext_am41d.getText().toString()) / Double.parseDouble(edittext_am42d.getText().toString()))) + Double.parseDouble(edittext14dnn)) + (Double.parseDouble(edittext52d.getText().toString()) * (Double.parseDouble(edittext_am41d.getText().toString()) / Double.parseDouble(edittext_am42d.getText().toString())))));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext52d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext52dnn = _param1.toString();
								
if (((Double.parseDouble(edittext52dnn) == 00.00d) || (Double.parseDouble(edittext14d.getText().toString()) == 00.00d)) || (edittext_am41d.getText().toString().equals("a.m") || edittext_am42d.getText().toString().equals("a.m"))) {
					edittext43d.setText(String.valueOf(Double.parseDouble(edittext14d.getText().toString())));
				}
				else {
					edittext43d.setText(_English_Decimal_Format(((Double.parseDouble(edittext52dnn) * (Double.parseDouble(edittext_am41d.getText().toString()) / Double.parseDouble(edittext_am42d.getText().toString()))) + Double.parseDouble(edittext14d.getText().toString())) + (Double.parseDouble(edittext52dnn) * (Double.parseDouble(edittext_am41d.getText().toString()) / Double.parseDouble(edittext_am42d.getText().toString())))));
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
		edittext_am32d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext_am32dnn = _param1.toString();
								
if (edittext_am15d.getText().toString().contains("a.m") || edittext_am32dnn.contains("a.m")) {
					edittext33d.setText(String.valueOf(0.00d));
				}
				else {
					edittext33d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15d.getText().toString()) - Double.parseDouble(edittext_am32dnn)));
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
				if (edittext_am32d.getText().toString().contains("a.m") || edittext_am15dnn.contains("a.m")) {
					edittext33d.setText(String.valueOf(0.00d));
				}
				else {
					edittext33d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am15dnn) - Double.parseDouble(edittext_am32d.getText().toString())));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		button2dw.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
					final LinearLayout dynamic_pipe_line_check_excavation_width = (LinearLayout) inflater.inflate(R.layout.eip_d_check_sewage_lines_excavation_width, null, false);
					linear_dynamic_pipe_line_check_excavation_width.addView(dynamic_pipe_line_check_excavation_width);
					/*
أولا تعريفات الدينامك
*/
					/*
ImageView
*/
					final ImageView close1dw = dynamic_pipe_line_check_excavation_width.findViewById(R.id.close1dw);
					/*
EditText
*/
					final EditText edittext557dw = dynamic_pipe_line_check_excavation_width.findViewById(R.id.edittext557dw);
					edittext557dw.setSingleLine(true);
					edittext557dw.setFocusableInTouchMode(true);
					final EditText edittext16dw = dynamic_pipe_line_check_excavation_width.findViewById(R.id.edittext16dw);
					edittext16dw.setSingleLine(true);
					edittext16dw.setFocusableInTouchMode(true);
					final EditText edittext_am16dw = dynamic_pipe_line_check_excavation_width.findViewById(R.id.edittext_am16dw);
					edittext_am16dw.setSingleLine(true);
					edittext_am16dw.setFocusableInTouchMode(true);
					final EditText edittext17dw = dynamic_pipe_line_check_excavation_width.findViewById(R.id.edittext17dw);
					edittext17dw.setSingleLine(true);
					edittext17dw.setFocusableInTouchMode(true);
					/*
TextView
*/
					final TextView textview111dw = dynamic_pipe_line_check_excavation_width.findViewById(R.id.textview111dw);
					final TextView textview112dw = dynamic_pipe_line_check_excavation_width.findViewById(R.id.textview112dw);
					final TextView textview113dw = dynamic_pipe_line_check_excavation_width.findViewById(R.id.textview113dw);
					textview111dw.setText("عرض سطح طبقة الحماية والتغليف الفعلي من الأعلي المقاس علي الطبيعة يساوي عرض سطح طبقة الحماية والتغليف التصميمي المحسوب طبقا للميول الجانبية\nالعرض مطابق");
					textview112dw.setText("عرض سطح طبقة الحماية والتغليف الفعلي من الأعلي المقاس علي الطبيعة أقل من عرض سطح طبقة الحماية والتغليف التصميمي المحسوب طبقا للميول الجانبية\nوعليه يرجي زيادة عرض الحفر بقدار الفرق\nملاحظة : ( ve - ) توضح ان انه يجب زيادة عرض الحفر بالمقدار المجاور للعلامة");
					textview113dw.setText("عرض سطح طبقة الحماية والتغليف الفعلي من الأعلي المقاس علي الطبيعة أكبر من عرض سطح طبقة الحماية والتغليف التصميمي المحسوب طبقا للميول الجانبية\nوعليه تكلفت الأعمال ردم طبقات الحماية وتغليف بكميات أضافية");
					/*
مناطيق معدلة
*/
					final TextView textview16dw = dynamic_pipe_line_check_excavation_width.findViewById(R.id.textview16dw);
					textview16dw.setText("عرض سطح طبقة الحماية والتغليف من الأعلي المقاس علي الطبيعة\n( م )");
					final TextView textview17dw = dynamic_pipe_line_check_excavation_width.findViewById(R.id.textview17dw);
					textview17dw.setText("الفرق ( م )\n( عرض سطح طبقة الحماية والتغليف من الأعلي المقاس علي الطبيعة - العرض التصميمي عند سطح طبقة الحماية والتغليف )");
					/*
ثانيآ المدخلات والمعادلات
*/
					textview111dw.setVisibility(View.GONE);
					textview112dw.setVisibility(View.GONE);
					textview113dw.setVisibility(View.GONE);
					edittext_am16dw.setVisibility(View.GONE);
					/*
الأوامر
*/
					edittext557dw.setText(String.valueOf((long)(linear_dynamic_pipe_line_check_excavation_width.getChildCount())));
					edittext43d.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext43dnn = _param1.toString();
											
if ((Double.parseDouble(edittext43dnn) == 00.00d) || edittext_am16dw.getText().toString().equals("a.m")) {
								edittext17dw.setText(String.valueOf(0.00d));
							}
							else {
								edittext17dw.setText(_English_Decimal_Format(Double.parseDouble(edittext_am16dw.getText().toString()) - Double.parseDouble(edittext43dnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext16dw.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext16dwnn = _param1.toString();
											
edittext16dw.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
							if ((edittext16dwnn.equals("") || edittext16dwnn.equals(".")) || (edittext16dwnn.equals("-") || (Double.parseDouble(edittext16dwnn) < 0))) {
								edittext_am16dw.setText("a.m");
							}
							else {
								edittext_am16dw.setText(String.valueOf(Double.parseDouble(edittext16dwnn)));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext_am16dw.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext_am16dwnn = _param1.toString();
											
if ((Double.parseDouble(edittext43d.getText().toString()) == 00.00d) || edittext_am16dwnn.equals("a.m")) {
								edittext17dw.setText(String.valueOf(0.00d));
							}
							else {
								edittext17dw.setText(_English_Decimal_Format(Double.parseDouble(edittext_am16dwnn) - Double.parseDouble(edittext43d.getText().toString())));
							}
									}
									
									@Override
									public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											
									}
									
									@Override
									public void afterTextChanged(Editable _param1) {
											
									}
							});
					edittext17dw.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext17dwnn = _param1.toString();
											
if ((Double.parseDouble(edittext43d.getText().toString()) == 00.00d) || edittext_am16dw.getText().toString().equals("a.m")) {
								textview111dw.setVisibility(View.GONE);
								textview112dw.setVisibility(View.GONE);
								textview113dw.setVisibility(View.GONE);
							}
							else {
								if (Double.parseDouble(edittext17dwnn) == 00.00d) {
									textview111dw.setVisibility(View.VISIBLE);
									textview112dw.setVisibility(View.GONE);
									textview113dw.setVisibility(View.GONE);
								}
								else {
									if (Double.parseDouble(edittext17dwnn) < 0.00d) {
										textview111dw.setVisibility(View.GONE);
										textview112dw.setVisibility(View.VISIBLE);
										textview113dw.setVisibility(View.GONE);
									}
									else {
										if (Double.parseDouble(edittext17dwnn) > 00.00d) {
											textview111dw.setVisibility(View.GONE);
											textview112dw.setVisibility(View.GONE);
											textview113dw.setVisibility(View.VISIBLE);
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
					close1dw.setOnClickListener(new View.OnClickListener() {
						@Override
						public void onClick(View _view) {
							_removeView(dynamic_pipe_line_check_excavation_width);
						}
					});
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		button5dl.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
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
					/*
LinearLayout
*/
					final LinearLayout linear44dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.linear44dl);
					final LinearLayout linear_close3dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.linear_close3dl);
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
					textview119dl.setVisibility(View.GONE);
					textview120dl.setVisibility(View.GONE);
					textview120dl.setText("بعد النقطة المراد فحصها عن بداية الفرعة\n( المسافة من النقطة التصميمية عند بداية الفرعة الي النقطة المرصودة )\nأكبر من طول الفرعة التصميمي\nوهذا غير منطقي وغير هندسي\nوعليه يرجي اعادة ادخال بعد النقطة المرصودة عن بداية الفرعة ليكون أقل من طول الفرعة التصميمي");
					textview121dl.setVisibility(View.GONE);
					textview121dl.setText("منسوب سطح طبقة الحماية والتغليف الفعلي للنقطة المرصودة يساوي منسوب سطح طبقة الحماية والتغليف التصميمي عند نفس النقطة");
					textview122dl.setVisibility(View.GONE);
					textview122dl.setText("منسوب سطح طبقة الحماية والتغليف الفعلي للنقطة المرصودة أوطي من منسوب سطح طبقة الحماية والتغليف التصميمي عند نفس النقطة\nوعليه يلزم زيادة منسوب وارتفاع طبقة الحماية والتغليف بمقدار الفرق للوصول للمنسوب التصميمي\nملاحظة : ( ve - ) توضح ان منسوب الطبقة ناقص وانه يجب زيادةارتفاع طبقة الحماية والتغليف وبالتالي منسوب طبقة الحماية والتغليف بالمقدار المجاور للعلامة للوصول للمنسوب التصميمي");
					textview123dl.setVisibility(View.GONE);
					textview123dl.setText("منسوب سطح طبقة الحماية والتغليف الفعلي للنقطة المرصودة أعلي من منسوب سطح طبقة الحماية والتغليف التصميمي عند نفس النقطة\nوعليه يلزم قطع وانقاص وتخفيض منسوب طبقة الحماية والتغليف للوصول للمنسوب التصميمي");
					edittext_am18dl.setVisibility(View.GONE);
					edittext_am19dl.setVisibility(View.GONE);
					/*
الحاجات اللي هتختفي علشان تغيير شكل الصفحة
*/
					linear44dl.setVisibility(View.GONE);
					textview141dl.setVisibility(View.GONE);
					textview144dl.setVisibility(View.GONE);
					linear_close3dl.setVisibility(View.GONE);
					/*
مناطيق معدلة
*/
					final TextView textview18dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview18dl);
					textview18dl.setText("بعد النقطة عن بداية الفرعة\n( المسافة من نقطة البداية الي النقطة المرصودة )\n( م )");
					/*
مسميات الأحلال
*/
					final TextView textview21dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview21dl);
					final TextView textview22dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview22dl);
					final TextView textview20dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview20dl);
					textview20dl.setText("منسوب سطح طبقة الحماية والتغليف التصميمي عند النقطة المرصودة");
					textview21dl.setText("منسوب سطح طبقة الحماية والتغليف الفعلي عند النقطة المرصودة");
					textview22dl.setText("الفرق\n( منسوب سطح طبقة الحماية والتغليف الفعلي للنقطة المرصودة\n-\nالمنسوب التصميمي لسطح طبقة الحماية والتغليف عند نفس النقطة المرصوده ) \n( م )");
					/*
EditText لزوم القراءات
*/
					final EditText edittext27dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.edittext27dl);
					edittext27dl.setSingleLine(true);
					edittext27dl.setFocusableInTouchMode(true);
					final TextView textview27dl = dynamic_pipe_line_check_excavation_level.findViewById(R.id.textview27dl);
					textview27dl.setText("قراءة القامة لمنسوب سطح التغليف التصميمي عند النقطة المرصودة");
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
					edittext18dl.setText("");
					edittext19dl.setText("");
					/*
أوامر متعلقه بالتصميم ومنسوب سطح الميزان
*/
					edittext13d.addTextChangedListener(new TextWatcher() {
									@Override
									public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
											final String edittext13dnn = _param1.toString();
											
if (((edittext_am3d.getText().toString().equals("a.m") || edittext_am31d.getText().toString().equals("a.m")) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am9d.getText().toString().equals("a.m"))) || edittext_am18dl.getText().toString().equals("a.m")) {
								edittext20dl.setText(String.valueOf(00.00d));
								edittext_am20dl.setText("a.m");
							}
							else {
								edittext20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext32d.getText().toString()) + ((Double.parseDouble(edittext13dnn) - Double.parseDouble(edittext32d.getText().toString())) * ((Double.parseDouble(edittext_am3d.getText().toString()) - Double.parseDouble(edittext_am18dl.getText().toString())) / Double.parseDouble(edittext_am3d.getText().toString())))));
								edittext_am20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext32d.getText().toString()) + ((Double.parseDouble(edittext13dnn) - Double.parseDouble(edittext32d.getText().toString())) * ((Double.parseDouble(edittext_am3d.getText().toString()) - Double.parseDouble(edittext_am18dl.getText().toString())) / Double.parseDouble(edittext_am3d.getText().toString())))));
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
											
if (((edittext_am3d.getText().toString().equals("a.m") || edittext_am31d.getText().toString().equals("a.m")) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am9d.getText().toString().equals("a.m"))) || edittext_am18dl.getText().toString().equals("a.m")) {
								edittext20dl.setText(String.valueOf(00.00d));
								edittext_am20dl.setText("a.m");
							}
							else {
								edittext20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext32dnn) + ((Double.parseDouble(edittext13d.getText().toString()) - Double.parseDouble(edittext32dnn)) * ((Double.parseDouble(edittext_am3d.getText().toString()) - Double.parseDouble(edittext_am18dl.getText().toString())) / Double.parseDouble(edittext_am3d.getText().toString())))));
								edittext_am20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext32dnn) + ((Double.parseDouble(edittext13d.getText().toString()) - Double.parseDouble(edittext32dnn)) * ((Double.parseDouble(edittext_am3d.getText().toString()) - Double.parseDouble(edittext_am18dl.getText().toString())) / Double.parseDouble(edittext_am3d.getText().toString())))));
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
											
if ((edittext_am31d.getText().toString().equals("a.m") || (edittext_am8d.getText().toString().equals("a.m") || edittext_am9d.getText().toString().equals("a.m"))) || edittext_am18dl.getText().toString().equals("a.m")) {
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
										edittext20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext32d.getText().toString()) + ((Double.parseDouble(edittext13d.getText().toString()) - Double.parseDouble(edittext32d.getText().toString())) * ((Double.parseDouble(edittext_am3d.getText().toString()) - Double.parseDouble(edittext_am18dlnn)) / Double.parseDouble(edittext_am3d.getText().toString())))));
										edittext_am20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext32d.getText().toString()) + ((Double.parseDouble(edittext13d.getText().toString()) - Double.parseDouble(edittext32d.getText().toString())) * ((Double.parseDouble(edittext_am3d.getText().toString()) - Double.parseDouble(edittext_am18dlnn)) / Double.parseDouble(edittext_am3d.getText().toString())))));
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
											
if (((((edittext_am18dl.getText().toString().equals("a.m") || textview118d.getVisibility() == View.VISIBLE) || (textview119dl.getVisibility() == View.VISIBLE || textview120dl.getVisibility() == View.VISIBLE)) || (edittext_am3d.getText().toString().equals("a.m") || edittext_am31d.getText().toString().equals("a.m"))) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am9d.getText().toString().equals("a.m"))) || (edittext_am19dl.getText().toString().equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m")))) {
								edittext22dl.setText(String.valueOf(00.00d));
							}
							else {
								edittext22dl.setText(_English_Decimal_Format(Double.parseDouble(edittext21dl.getText().toString()) - Double.parseDouble(edittext20dlnn)));
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
											
if (((((edittext_am18dl.getText().toString().equals("a.m") || textview118d.getVisibility() == View.VISIBLE) || (textview119dl.getVisibility() == View.VISIBLE || textview120dl.getVisibility() == View.VISIBLE)) || (edittext_am3d.getText().toString().equals("a.m") || edittext_am31d.getText().toString().equals("a.m"))) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am9d.getText().toString().equals("a.m"))) || (edittext_am19dl.getText().toString().equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m")))) {
								edittext22dl.setText(String.valueOf(00.00d));
							}
							else {
								edittext22dl.setText(_English_Decimal_Format(Double.parseDouble(edittext21dlnn) - Double.parseDouble(edittext20dl.getText().toString())));
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
											
if (((((edittext_am18dl.getText().toString().equals("a.m") || textview118d.getVisibility() == View.VISIBLE) || (textview119dl.getVisibility() == View.VISIBLE || textview120dl.getVisibility() == View.VISIBLE)) || (edittext_am3d.getText().toString().equals("a.m") || edittext_am31d.getText().toString().equals("a.m"))) || (edittext_am8d.getText().toString().equals("a.m") || edittext_am9d.getText().toString().equals("a.m"))) || (edittext_am19dl.getText().toString().equals("a.m") || (edittext_am11d.getText().toString().equals("a.m") || edittext_am12d.getText().toString().equals("a.m")))) {
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
								edittext_am20dl.setText("a.m");
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
											
if ((edittext_am31d.getText().toString().equals("a.m") || (edittext_am8d.getText().toString().equals("a.m") || edittext_am9d.getText().toString().equals("a.m"))) || edittext_am18dl.getText().toString().equals("a.m")) {
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
										edittext20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext32d.getText().toString()) + ((Double.parseDouble(edittext13d.getText().toString()) - Double.parseDouble(edittext32d.getText().toString())) * ((Double.parseDouble(edittext_am3dnn) - Double.parseDouble(edittext_am18dl.getText().toString())) / Double.parseDouble(edittext_am3dnn)))));
										edittext_am20dl.setText(_English_Decimal_Format(Double.parseDouble(edittext32d.getText().toString()) + ((Double.parseDouble(edittext13d.getText().toString()) - Double.parseDouble(edittext32d.getText().toString())) * ((Double.parseDouble(edittext_am3dnn) - Double.parseDouble(edittext_am18dl.getText().toString())) / Double.parseDouble(edittext_am3dnn)))));
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
