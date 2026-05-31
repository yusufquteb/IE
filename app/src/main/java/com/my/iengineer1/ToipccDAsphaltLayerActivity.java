package com.my.iengineer1;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
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
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class ToipccDAsphaltLayerActivity extends AppCompatActivity {
	
	private TextView textview519;
	private ScrollView vscroll1;
	private LinearLayout linear79;
	private LinearLayout linear713;
	private TextView textview1336;
	private LinearLayout linear389;
	private LinearLayout linear575;
	private LinearLayout linear100s1;
	private LinearLayout linear77;
	private LinearLayout linear74;
	private LinearLayout linear75;
	private LinearLayout linear80;
	private LinearLayout linear504;
	private HorizontalScrollView hscroll19;
	private LinearLayout linear514;
	private TextView textview14d;
	private HorizontalScrollView hscroll64;
	private LinearLayout linear76;
	private HorizontalScrollView hscroll6d;
	private LinearLayout linear7d;
	private LinearLayout linear19d;
	private LinearLayout linear8d;
	private HorizontalScrollView hscroll67;
	private LinearLayout linear9d;
	private ImageView close;
	private LinearLayout linear720;
	private TextView textview180;
	private TextView textview2d;
	private EditText element_nums_d;
	private TextView textview160;
	private EditText element_num_d;
	private TextView textview1d;
	private EditText edittext1d;
	private TextView textview124;
	private TextView textview3d;
	private TextView textview5d;
	private EditText edittext2d;
	private TextView textview473;
	private TextView textview4d;
	private TextView textview7d;
	private EditText edittext3d;
	private TextView textview286;
	private TextView textview6d;
	private TextView textview9d;
	private EditText edittext4d;
	private TextView textview468;
	private TextView textview8d;
	private TextView textview11d;
	private EditText edittext5d;
	private TextView textview521;
	private TextView textview10d;
	private Button button1d;
	private TextView textview13d;
	private EditText edittext6d;
	private TextView textview1136;
	private TextView textview12d;
	private TextView textview16d;
	private EditText edittext7d;
	private TextView textview470;
	private TextView textview15d;
	private TextView textview18d;
	private EditText edittext8d;
	private TextView textview476;
	private TextView textview17d;
	private TextView textview1255d;
	private LinearLayout linear18;
	private LinearLayout linear580;
	private LinearLayout linear587;
	private LinearLayout linear152;
	private HorizontalScrollView hscroll66;
	private LinearLayout linear418;
	private TextView textview20d;
	private EditText edittext9d;
	private TextView textview532;
	private TextView textview19d;
	private TextView textview26d;
	private EditText edittext12d;
	private TextView textview1257;
	private TextView textview25d;
	private Button button2d;
	private TextView textview22d;
	private EditText edittext10d;
	private TextView textview1268;
	private TextView textview21d;
	private TextView textview23d;
	private TextView textview1270;
	private LinearLayout linear388;
	private TextView textview24d;
	private EditText edittext11d;
	private TextView textview27d;
	private TextView textview334;
	private LinearLayout linear118;
	private TextView textview28d;
	private EditText edittext13d;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_d_asphalt_layer);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		textview519 = findViewById(R.id.textview519);
		vscroll1 = findViewById(R.id.vscroll1);
		linear79 = findViewById(R.id.linear79);
		linear713 = findViewById(R.id.linear713);
		textview1336 = findViewById(R.id.textview1336);
		linear389 = findViewById(R.id.linear389);
		linear575 = findViewById(R.id.linear575);
		linear100s1 = findViewById(R.id.linear100s1);
		linear77 = findViewById(R.id.linear77);
		linear74 = findViewById(R.id.linear74);
		linear75 = findViewById(R.id.linear75);
		linear80 = findViewById(R.id.linear80);
		linear504 = findViewById(R.id.linear504);
		hscroll19 = findViewById(R.id.hscroll19);
		linear514 = findViewById(R.id.linear514);
		textview14d = findViewById(R.id.textview14d);
		hscroll64 = findViewById(R.id.hscroll64);
		linear76 = findViewById(R.id.linear76);
		hscroll6d = findViewById(R.id.hscroll6d);
		linear7d = findViewById(R.id.linear7d);
		linear19d = findViewById(R.id.linear19d);
		linear8d = findViewById(R.id.linear8d);
		hscroll67 = findViewById(R.id.hscroll67);
		linear9d = findViewById(R.id.linear9d);
		close = findViewById(R.id.close);
		linear720 = findViewById(R.id.linear720);
		textview180 = findViewById(R.id.textview180);
		textview2d = findViewById(R.id.textview2d);
		element_nums_d = findViewById(R.id.element_nums_d);
		textview160 = findViewById(R.id.textview160);
		element_num_d = findViewById(R.id.element_num_d);
		textview1d = findViewById(R.id.textview1d);
		edittext1d = findViewById(R.id.edittext1d);
		textview124 = findViewById(R.id.textview124);
		textview3d = findViewById(R.id.textview3d);
		textview5d = findViewById(R.id.textview5d);
		edittext2d = findViewById(R.id.edittext2d);
		textview473 = findViewById(R.id.textview473);
		textview4d = findViewById(R.id.textview4d);
		textview7d = findViewById(R.id.textview7d);
		edittext3d = findViewById(R.id.edittext3d);
		textview286 = findViewById(R.id.textview286);
		textview6d = findViewById(R.id.textview6d);
		textview9d = findViewById(R.id.textview9d);
		edittext4d = findViewById(R.id.edittext4d);
		textview468 = findViewById(R.id.textview468);
		textview8d = findViewById(R.id.textview8d);
		textview11d = findViewById(R.id.textview11d);
		edittext5d = findViewById(R.id.edittext5d);
		textview521 = findViewById(R.id.textview521);
		textview10d = findViewById(R.id.textview10d);
		button1d = findViewById(R.id.button1d);
		textview13d = findViewById(R.id.textview13d);
		edittext6d = findViewById(R.id.edittext6d);
		textview1136 = findViewById(R.id.textview1136);
		textview12d = findViewById(R.id.textview12d);
		textview16d = findViewById(R.id.textview16d);
		edittext7d = findViewById(R.id.edittext7d);
		textview470 = findViewById(R.id.textview470);
		textview15d = findViewById(R.id.textview15d);
		textview18d = findViewById(R.id.textview18d);
		edittext8d = findViewById(R.id.edittext8d);
		textview476 = findViewById(R.id.textview476);
		textview17d = findViewById(R.id.textview17d);
		textview1255d = findViewById(R.id.textview1255d);
		linear18 = findViewById(R.id.linear18);
		linear580 = findViewById(R.id.linear580);
		linear587 = findViewById(R.id.linear587);
		linear152 = findViewById(R.id.linear152);
		hscroll66 = findViewById(R.id.hscroll66);
		linear418 = findViewById(R.id.linear418);
		textview20d = findViewById(R.id.textview20d);
		edittext9d = findViewById(R.id.edittext9d);
		textview532 = findViewById(R.id.textview532);
		textview19d = findViewById(R.id.textview19d);
		textview26d = findViewById(R.id.textview26d);
		edittext12d = findViewById(R.id.edittext12d);
		textview1257 = findViewById(R.id.textview1257);
		textview25d = findViewById(R.id.textview25d);
		button2d = findViewById(R.id.button2d);
		textview22d = findViewById(R.id.textview22d);
		edittext10d = findViewById(R.id.edittext10d);
		textview1268 = findViewById(R.id.textview1268);
		textview21d = findViewById(R.id.textview21d);
		textview23d = findViewById(R.id.textview23d);
		textview1270 = findViewById(R.id.textview1270);
		linear388 = findViewById(R.id.linear388);
		textview24d = findViewById(R.id.textview24d);
		edittext11d = findViewById(R.id.edittext11d);
		textview27d = findViewById(R.id.textview27d);
		textview334 = findViewById(R.id.textview334);
		linear118 = findViewById(R.id.linear118);
		textview28d = findViewById(R.id.textview28d);
		edittext13d = findViewById(R.id.edittext13d);
	}
	
	private void initializeLogic() {
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
				.setMessage("أدخل القيم في الحقول المُدخلة (ذات الخلفية الخضراء) ثم اضغط على زر الحساب للحصول على النتائج.")
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
