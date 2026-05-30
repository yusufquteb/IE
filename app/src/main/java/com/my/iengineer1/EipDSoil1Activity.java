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

public class EipDSoil1Activity extends AppCompatActivity {
	
	private TextView textview492;
	private LinearLayout dynamic_out_linear1;
	private LinearLayout dynamic_point_number_linear;
	private HorizontalScrollView hscroll28;
	private LinearLayout dynamic_out_linear2;
	private LinearLayout linear137;
	private LinearLayout dynamic_out_linear3;
	private HorizontalScrollView hscroll30;
	private LinearLayout dynamic_point_remove_linear;
	private TextView dynamic_point_type;
	private EditText dynamic_point_number;
	private TextView textview1082;
	private TextView textview494;
	private EditText dynamic_point_reading;
	private TextView textview495;
	private TextView dynamic_point_reading_name;
	private Button dynamic_point_calculation;
	private LinearLayout dynamic_out_linear5;
	private TextView textview498;
	private LinearLayout dynamic_out_linear4;
	private TextView dynamic_levels_difference_name;
	private EditText dynamic_levels_difference;
	private TextView dynamic_point_level_name;
	private EditText dynamic_point_level;
	private LinearLayout dynamic_out_linear6;
	private TextView dynamic_required_action;
	private TextView textview502;
	private TextView textview503;
	private Button dynamic_point_remove;
	private TextView textview789;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.eip_d_soil1);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		textview492 = findViewById(R.id.textview492);
		dynamic_out_linear1 = findViewById(R.id.dynamic_out_linear1);
		dynamic_point_number_linear = findViewById(R.id.dynamic_point_number_linear);
		hscroll28 = findViewById(R.id.hscroll28);
		dynamic_out_linear2 = findViewById(R.id.dynamic_out_linear2);
		linear137 = findViewById(R.id.linear137);
		dynamic_out_linear3 = findViewById(R.id.dynamic_out_linear3);
		hscroll30 = findViewById(R.id.hscroll30);
		dynamic_point_remove_linear = findViewById(R.id.dynamic_point_remove_linear);
		dynamic_point_type = findViewById(R.id.dynamic_point_type);
		dynamic_point_number = findViewById(R.id.dynamic_point_number);
		textview1082 = findViewById(R.id.textview1082);
		textview494 = findViewById(R.id.textview494);
		dynamic_point_reading = findViewById(R.id.dynamic_point_reading);
		textview495 = findViewById(R.id.textview495);
		dynamic_point_reading_name = findViewById(R.id.dynamic_point_reading_name);
		dynamic_point_calculation = findViewById(R.id.dynamic_point_calculation);
		dynamic_out_linear5 = findViewById(R.id.dynamic_out_linear5);
		textview498 = findViewById(R.id.textview498);
		dynamic_out_linear4 = findViewById(R.id.dynamic_out_linear4);
		dynamic_levels_difference_name = findViewById(R.id.dynamic_levels_difference_name);
		dynamic_levels_difference = findViewById(R.id.dynamic_levels_difference);
		dynamic_point_level_name = findViewById(R.id.dynamic_point_level_name);
		dynamic_point_level = findViewById(R.id.dynamic_point_level);
		dynamic_out_linear6 = findViewById(R.id.dynamic_out_linear6);
		dynamic_required_action = findViewById(R.id.dynamic_required_action);
		textview502 = findViewById(R.id.textview502);
		textview503 = findViewById(R.id.textview503);
		dynamic_point_remove = findViewById(R.id.dynamic_point_remove);
		textview789 = findViewById(R.id.textview789);
	}
	
	private void initializeLogic() {
	}
	
}
