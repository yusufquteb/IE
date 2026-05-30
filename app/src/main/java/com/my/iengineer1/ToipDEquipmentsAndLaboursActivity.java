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
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public class ToipDEquipmentsAndLaboursActivity extends AppCompatActivity {
	
	private LinearLayout linear2240;
	private LinearLayout linear2242;
	private HorizontalScrollView hscroll10dd;
	private LinearLayout linear14dd;
	private LinearLayout linear202dd;
	private LinearLayout linear21dd;
	private HorizontalScrollView hscroll21dd;
	private LinearLayout linear22dd;
	private HorizontalScrollView hscroll22dd;
	private LinearLayout linear23dd;
	private ImageView close_dd;
	private LinearLayout linear2243;
	private EditText edittext14dd;
	private TextView textview280;
	private TextView textview14dd;
	private LinearLayout linear17dd;
	private TextView textview644;
	private LinearLayout linear16dd;
	private TextView textview642;
	private LinearLayout linear15dd;
	private TextView textview17dd;
	private EditText edittext17dd;
	private EditText edittext_am17dd;
	private TextView textview16dd;
	private EditText edittext16dd;
	private EditText edittext_am16dd;
	private TextView textview15dd;
	private EditText edittext15dd;
	private EditText edittext_am15dd;
	private TextView textview1136;
	private EditText edittext21dd;
	private TextView textview596;
	private TextView textview21dd;
	private TextView textview400;
	private EditText edittext22dd;
	private TextView textview334;
	private TextView textview22dd;
	private TextView textview1169;
	private EditText edittext23dd;
	private TextView textview1170;
	private TextView textview23dd;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toip_d_equipments_and_labours);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear2240 = findViewById(R.id.linear2240);
		linear2242 = findViewById(R.id.linear2242);
		hscroll10dd = findViewById(R.id.hscroll10dd);
		linear14dd = findViewById(R.id.linear14dd);
		linear202dd = findViewById(R.id.linear202dd);
		linear21dd = findViewById(R.id.linear21dd);
		hscroll21dd = findViewById(R.id.hscroll21dd);
		linear22dd = findViewById(R.id.linear22dd);
		hscroll22dd = findViewById(R.id.hscroll22dd);
		linear23dd = findViewById(R.id.linear23dd);
		close_dd = findViewById(R.id.close_dd);
		linear2243 = findViewById(R.id.linear2243);
		edittext14dd = findViewById(R.id.edittext14dd);
		textview280 = findViewById(R.id.textview280);
		textview14dd = findViewById(R.id.textview14dd);
		linear17dd = findViewById(R.id.linear17dd);
		textview644 = findViewById(R.id.textview644);
		linear16dd = findViewById(R.id.linear16dd);
		textview642 = findViewById(R.id.textview642);
		linear15dd = findViewById(R.id.linear15dd);
		textview17dd = findViewById(R.id.textview17dd);
		edittext17dd = findViewById(R.id.edittext17dd);
		edittext_am17dd = findViewById(R.id.edittext_am17dd);
		textview16dd = findViewById(R.id.textview16dd);
		edittext16dd = findViewById(R.id.edittext16dd);
		edittext_am16dd = findViewById(R.id.edittext_am16dd);
		textview15dd = findViewById(R.id.textview15dd);
		edittext15dd = findViewById(R.id.edittext15dd);
		edittext_am15dd = findViewById(R.id.edittext_am15dd);
		textview1136 = findViewById(R.id.textview1136);
		edittext21dd = findViewById(R.id.edittext21dd);
		textview596 = findViewById(R.id.textview596);
		textview21dd = findViewById(R.id.textview21dd);
		textview400 = findViewById(R.id.textview400);
		edittext22dd = findViewById(R.id.edittext22dd);
		textview334 = findViewById(R.id.textview334);
		textview22dd = findViewById(R.id.textview22dd);
		textview1169 = findViewById(R.id.textview1169);
		edittext23dd = findViewById(R.id.edittext23dd);
		textview1170 = findViewById(R.id.textview1170);
		textview23dd = findViewById(R.id.textview23dd);
	}
	
	private void initializeLogic() {
	}
	
}
