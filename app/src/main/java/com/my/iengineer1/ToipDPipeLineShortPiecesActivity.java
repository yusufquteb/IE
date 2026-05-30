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

public class ToipDPipeLineShortPiecesActivity extends AppCompatActivity {
	
	private LinearLayout linear204ds;
	private LinearLayout linear204dss;
	private ImageView close3ds;
	private LinearLayout linear15ds;
	private TextView textview1431;
	private LinearLayout linear14ds;
	private TextView textview15ds;
	private EditText edittext15ds;
	private TextView textview14ds;
	private EditText edittext14ds;
	private EditText edittext25ds;
	private TextView textview1434;
	private EditText edittext23ds;
	private TextView textview1433;
	private EditText edittext_am15ds;
	private TextView textview1432;
	private EditText edittext_am14ds;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toip_d_pipe_line_short_pieces);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear204ds = findViewById(R.id.linear204ds);
		linear204dss = findViewById(R.id.linear204dss);
		close3ds = findViewById(R.id.close3ds);
		linear15ds = findViewById(R.id.linear15ds);
		textview1431 = findViewById(R.id.textview1431);
		linear14ds = findViewById(R.id.linear14ds);
		textview15ds = findViewById(R.id.textview15ds);
		edittext15ds = findViewById(R.id.edittext15ds);
		textview14ds = findViewById(R.id.textview14ds);
		edittext14ds = findViewById(R.id.edittext14ds);
		edittext25ds = findViewById(R.id.edittext25ds);
		textview1434 = findViewById(R.id.textview1434);
		edittext23ds = findViewById(R.id.edittext23ds);
		textview1433 = findViewById(R.id.textview1433);
		edittext_am15ds = findViewById(R.id.edittext_am15ds);
		textview1432 = findViewById(R.id.textview1432);
		edittext_am14ds = findViewById(R.id.edittext_am14ds);
	}
	
	private void initializeLogic() {
	}
	
}
