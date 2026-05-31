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

public class ToipccDWallPlasteringActivity extends AppCompatActivity {
	
	private TextView textview519;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear713;
	private HorizontalScrollView hscroll60;
	private LinearLayout linear389;
	private ScrollView vscroll2;
	private LinearLayout linear56;
	private HorizontalScrollView hscroll33;
	private LinearLayout linear162;
	private LinearLayout d_linear33;
	private HorizontalScrollView hscroll35;
	private LinearLayout d_linear161;
	private TextView d_textview14;
	private LinearLayout linear164;
	private HorizontalScrollView hscroll37;
	private LinearLayout linear194;
	private TextView d_textview666;
	private TextView d_textview668;
	private TextView d_textview667;
	private TextView d_textview555;
	private TextView d_textview556;
	private LinearLayout linear188;
	private HorizontalScrollView hscroll57;
	private LinearLayout linear13;
	private HorizontalScrollView hscroll2;
	private TextView textview477;
	private LinearLayout d_add_dynamic_hole_linear;
	private LinearLayout d_linear722;
	private HorizontalScrollView hscroll58;
	private LinearLayout d_linear74;
	private Button d_add_dynamic_hole;
	private HorizontalScrollView hscroll56;
	private TextView d_textview55;
	private LinearLayout d_linear183;
	private TextView d_textview15;
	private TextView d_textview56;
	private LinearLayout d_linear758;
	private ImageView d_close_wall;
	private LinearLayout linear720;
	private TextView textview18;
	private EditText d_edittext7;
	private TextView d_textview2;
	private TextView textview16;
	private EditText d_edittext6;
	private TextView d_textview1;
	private TextView textview446;
	private EditText d_edittext1;
	private TextView textview81;
	private TextView d_textview3;
	private TextView textview448;
	private EditText d_edittext2;
	private TextView textview422;
	private TextView d_textview4;
	private LinearLayout linear34;
	private HorizontalScrollView hscroll82;
	private LinearLayout linear32;
	private LinearLayout linear35;
	private TextView textview33;
	private LinearLayout linear36;
	private TextView textview35;
	private LinearLayout linear865;
	private TextView textview34;
	private EditText d_edittext35;
	private TextView textview36;
	private LinearLayout linear869;
	private TextView textview37;
	private EditText d_edittext36;
	private TextView textview38;
	private EditText d_edittext32;
	private TextView textview2054;
	private TextView textview32;
	private TextView textview447;
	private EditText d_edittext22;
	private TextView textview421;
	private TextView d_textview11;
	private TextView textview1424;
	private EditText d_edittext3;
	private TextView textview426;
	private TextView d_textview5;
	private EditText d_edittext444;
	private Button d_button1;
	private TextView d_textview510;
	private EditText d_edittext4;
	private TextView textview508;
	private TextView d_textview6;
	private TextView d_textview511;
	private EditText d_edittext5;
	private TextView textview13;
	private TextView d_textview7;
	private TextView d_textview512;
	private EditText d_edittext16;
	private TextView textview706;
	private TextView d_textview8;
	private TextView textview467;
	private EditText d_edittext15;
	private TextView textview286;
	private TextView textview112;
	private TextView d_textview513;
	private EditText d_edittext17;
	private TextView textview489;
	private TextView d_textview9;
	private TextView d_textview514;
	private EditText d_edittext20;
	private TextView textview1422;
	private TextView d_textview10;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_d_wall_plastering);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		textview519 = findViewById(R.id.textview519);
		vscroll1 = findViewById(R.id.vscroll1);
		linear2 = findViewById(R.id.linear2);
		linear713 = findViewById(R.id.linear713);
		hscroll60 = findViewById(R.id.hscroll60);
		linear389 = findViewById(R.id.linear389);
		vscroll2 = findViewById(R.id.vscroll2);
		linear56 = findViewById(R.id.linear56);
		hscroll33 = findViewById(R.id.hscroll33);
		linear162 = findViewById(R.id.linear162);
		d_linear33 = findViewById(R.id.d_linear33);
		hscroll35 = findViewById(R.id.hscroll35);
		d_linear161 = findViewById(R.id.d_linear161);
		d_textview14 = findViewById(R.id.d_textview14);
		linear164 = findViewById(R.id.linear164);
		hscroll37 = findViewById(R.id.hscroll37);
		linear194 = findViewById(R.id.linear194);
		d_textview666 = findViewById(R.id.d_textview666);
		d_textview668 = findViewById(R.id.d_textview668);
		d_textview667 = findViewById(R.id.d_textview667);
		d_textview555 = findViewById(R.id.d_textview555);
		d_textview556 = findViewById(R.id.d_textview556);
		linear188 = findViewById(R.id.linear188);
		hscroll57 = findViewById(R.id.hscroll57);
		linear13 = findViewById(R.id.linear13);
		hscroll2 = findViewById(R.id.hscroll2);
		textview477 = findViewById(R.id.textview477);
		d_add_dynamic_hole_linear = findViewById(R.id.d_add_dynamic_hole_linear);
		d_linear722 = findViewById(R.id.d_linear722);
		hscroll58 = findViewById(R.id.hscroll58);
		d_linear74 = findViewById(R.id.d_linear74);
		d_add_dynamic_hole = findViewById(R.id.d_add_dynamic_hole);
		hscroll56 = findViewById(R.id.hscroll56);
		d_textview55 = findViewById(R.id.d_textview55);
		d_linear183 = findViewById(R.id.d_linear183);
		d_textview15 = findViewById(R.id.d_textview15);
		d_textview56 = findViewById(R.id.d_textview56);
		d_linear758 = findViewById(R.id.d_linear758);
		d_close_wall = findViewById(R.id.d_close_wall);
		linear720 = findViewById(R.id.linear720);
		textview18 = findViewById(R.id.textview18);
		d_edittext7 = findViewById(R.id.d_edittext7);
		d_textview2 = findViewById(R.id.d_textview2);
		textview16 = findViewById(R.id.textview16);
		d_edittext6 = findViewById(R.id.d_edittext6);
		d_textview1 = findViewById(R.id.d_textview1);
		textview446 = findViewById(R.id.textview446);
		d_edittext1 = findViewById(R.id.d_edittext1);
		textview81 = findViewById(R.id.textview81);
		d_textview3 = findViewById(R.id.d_textview3);
		textview448 = findViewById(R.id.textview448);
		d_edittext2 = findViewById(R.id.d_edittext2);
		textview422 = findViewById(R.id.textview422);
		d_textview4 = findViewById(R.id.d_textview4);
		linear34 = findViewById(R.id.linear34);
		hscroll82 = findViewById(R.id.hscroll82);
		linear32 = findViewById(R.id.linear32);
		linear35 = findViewById(R.id.linear35);
		textview33 = findViewById(R.id.textview33);
		linear36 = findViewById(R.id.linear36);
		textview35 = findViewById(R.id.textview35);
		linear865 = findViewById(R.id.linear865);
		textview34 = findViewById(R.id.textview34);
		d_edittext35 = findViewById(R.id.d_edittext35);
		textview36 = findViewById(R.id.textview36);
		linear869 = findViewById(R.id.linear869);
		textview37 = findViewById(R.id.textview37);
		d_edittext36 = findViewById(R.id.d_edittext36);
		textview38 = findViewById(R.id.textview38);
		d_edittext32 = findViewById(R.id.d_edittext32);
		textview2054 = findViewById(R.id.textview2054);
		textview32 = findViewById(R.id.textview32);
		textview447 = findViewById(R.id.textview447);
		d_edittext22 = findViewById(R.id.d_edittext22);
		textview421 = findViewById(R.id.textview421);
		d_textview11 = findViewById(R.id.d_textview11);
		textview1424 = findViewById(R.id.textview1424);
		d_edittext3 = findViewById(R.id.d_edittext3);
		textview426 = findViewById(R.id.textview426);
		d_textview5 = findViewById(R.id.d_textview5);
		d_edittext444 = findViewById(R.id.d_edittext444);
		d_button1 = findViewById(R.id.d_button1);
		d_textview510 = findViewById(R.id.d_textview510);
		d_edittext4 = findViewById(R.id.d_edittext4);
		textview508 = findViewById(R.id.textview508);
		d_textview6 = findViewById(R.id.d_textview6);
		d_textview511 = findViewById(R.id.d_textview511);
		d_edittext5 = findViewById(R.id.d_edittext5);
		textview13 = findViewById(R.id.textview13);
		d_textview7 = findViewById(R.id.d_textview7);
		d_textview512 = findViewById(R.id.d_textview512);
		d_edittext16 = findViewById(R.id.d_edittext16);
		textview706 = findViewById(R.id.textview706);
		d_textview8 = findViewById(R.id.d_textview8);
		textview467 = findViewById(R.id.textview467);
		d_edittext15 = findViewById(R.id.d_edittext15);
		textview286 = findViewById(R.id.textview286);
		textview112 = findViewById(R.id.textview112);
		d_textview513 = findViewById(R.id.d_textview513);
		d_edittext17 = findViewById(R.id.d_edittext17);
		textview489 = findViewById(R.id.textview489);
		d_textview9 = findViewById(R.id.d_textview9);
		d_textview514 = findViewById(R.id.d_textview514);
		d_edittext20 = findViewById(R.id.d_edittext20);
		textview1422 = findViewById(R.id.textview1422);
		d_textview10 = findViewById(R.id.d_textview10);
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
