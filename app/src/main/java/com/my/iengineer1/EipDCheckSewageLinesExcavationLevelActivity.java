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

public class EipDCheckSewageLinesExcavationLevelActivity extends AppCompatActivity {
	
	private ScrollView vscroll1;
	private LinearLayout linear43dl;
	private LinearLayout linear_close2dl;
	private HorizontalScrollView hscroll38;
	private LinearLayout linear2375;
	private HorizontalScrollView hscroll21;
	private TextView textview141dl;
	private LinearLayout linear44dl;
	private LinearLayout linear45dl;
	private ImageView close2dl;
	private LinearLayout linear2417;
	private TextView textview2431;
	private TextView textview140dl;
	private EditText edittext559dl;
	private TextView textview2433;
	private EditText edittext558dl;
	private TextView textview139dl;
	private Button button4dl;
	private TextView textview2443;
	private Button button3dl;
	private LinearLayout linear_close3dl;
	private TextView textview144dl;
	private TextView textview142dl;
	private LinearLayout linear18dl;
	private TextView textview119dl;
	private TextView textview120dl;
	private HorizontalScrollView hscroll20;
	private LinearLayout linear19dl;
	private TextView textview143dl;
	private LinearLayout linear27dl;
	private HorizontalScrollView hscroll27dl;
	private LinearLayout linear20dl;
	private HorizontalScrollView hscroll22;
	private LinearLayout linear21dl;
	private HorizontalScrollView hscroll23;
	private LinearLayout linear22dl;
	private TextView textview121dl;
	private TextView textview122dl;
	private TextView textview123dl;
	private ImageView close3dl;
	private LinearLayout linear2419;
	private EditText edittext_am18dl;
	private TextView textview2428;
	private EditText edittext18dl;
	private TextView textview2429;
	private TextView textview18dl;
	private EditText edittext_am19dl;
	private TextView textview2438;
	private EditText edittext19dl;
	private TextView textview2439;
	private TextView textview19dl;
	private TextView textview606;
	private EditText edittext27dl;
	private TextView textview334;
	private TextView textview27dl;
	private EditText edittext_am20dl;
	private EditText edittext20dl;
	private TextView textview2445;
	private TextView textview20dl;
	private EditText edittext21dl;
	private TextView textview2451;
	private TextView textview21dl;
	private TextView textview22dl;
	private TextView textview2448;
	private LinearLayout linear50;
	private TextView textview2447;
	private EditText edittext22dl;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.eip_d_check_sewage_lines_excavation_level);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear43dl = findViewById(R.id.linear43dl);
		linear_close2dl = findViewById(R.id.linear_close2dl);
		hscroll38 = findViewById(R.id.hscroll38);
		linear2375 = findViewById(R.id.linear2375);
		hscroll21 = findViewById(R.id.hscroll21);
		textview141dl = findViewById(R.id.textview141dl);
		linear44dl = findViewById(R.id.linear44dl);
		linear45dl = findViewById(R.id.linear45dl);
		close2dl = findViewById(R.id.close2dl);
		linear2417 = findViewById(R.id.linear2417);
		textview2431 = findViewById(R.id.textview2431);
		textview140dl = findViewById(R.id.textview140dl);
		edittext559dl = findViewById(R.id.edittext559dl);
		textview2433 = findViewById(R.id.textview2433);
		edittext558dl = findViewById(R.id.edittext558dl);
		textview139dl = findViewById(R.id.textview139dl);
		button4dl = findViewById(R.id.button4dl);
		textview2443 = findViewById(R.id.textview2443);
		button3dl = findViewById(R.id.button3dl);
		linear_close3dl = findViewById(R.id.linear_close3dl);
		textview144dl = findViewById(R.id.textview144dl);
		textview142dl = findViewById(R.id.textview142dl);
		linear18dl = findViewById(R.id.linear18dl);
		textview119dl = findViewById(R.id.textview119dl);
		textview120dl = findViewById(R.id.textview120dl);
		hscroll20 = findViewById(R.id.hscroll20);
		linear19dl = findViewById(R.id.linear19dl);
		textview143dl = findViewById(R.id.textview143dl);
		linear27dl = findViewById(R.id.linear27dl);
		hscroll27dl = findViewById(R.id.hscroll27dl);
		linear20dl = findViewById(R.id.linear20dl);
		hscroll22 = findViewById(R.id.hscroll22);
		linear21dl = findViewById(R.id.linear21dl);
		hscroll23 = findViewById(R.id.hscroll23);
		linear22dl = findViewById(R.id.linear22dl);
		textview121dl = findViewById(R.id.textview121dl);
		textview122dl = findViewById(R.id.textview122dl);
		textview123dl = findViewById(R.id.textview123dl);
		close3dl = findViewById(R.id.close3dl);
		linear2419 = findViewById(R.id.linear2419);
		edittext_am18dl = findViewById(R.id.edittext_am18dl);
		textview2428 = findViewById(R.id.textview2428);
		edittext18dl = findViewById(R.id.edittext18dl);
		textview2429 = findViewById(R.id.textview2429);
		textview18dl = findViewById(R.id.textview18dl);
		edittext_am19dl = findViewById(R.id.edittext_am19dl);
		textview2438 = findViewById(R.id.textview2438);
		edittext19dl = findViewById(R.id.edittext19dl);
		textview2439 = findViewById(R.id.textview2439);
		textview19dl = findViewById(R.id.textview19dl);
		textview606 = findViewById(R.id.textview606);
		edittext27dl = findViewById(R.id.edittext27dl);
		textview334 = findViewById(R.id.textview334);
		textview27dl = findViewById(R.id.textview27dl);
		edittext_am20dl = findViewById(R.id.edittext_am20dl);
		edittext20dl = findViewById(R.id.edittext20dl);
		textview2445 = findViewById(R.id.textview2445);
		textview20dl = findViewById(R.id.textview20dl);
		edittext21dl = findViewById(R.id.edittext21dl);
		textview2451 = findViewById(R.id.textview2451);
		textview21dl = findViewById(R.id.textview21dl);
		textview22dl = findViewById(R.id.textview22dl);
		textview2448 = findViewById(R.id.textview2448);
		linear50 = findViewById(R.id.linear50);
		textview2447 = findViewById(R.id.textview2447);
		edittext22dl = findViewById(R.id.edittext22dl);
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
