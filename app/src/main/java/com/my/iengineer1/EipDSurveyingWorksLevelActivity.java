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

public class EipDSurveyingWorksLevelActivity extends AppCompatActivity {
	
	private LinearLayout linear119dl;
	private ImageView close3dl;
	private LinearLayout linear116dl;
	private LinearLayout linear115dl;
	private LinearLayout linear114dl;
	private EditText edittext6dl;
	private EditText edittext_am6dl;
	private EditText edittext5dl;
	private EditText edittext_am5dl;
	private EditText edittext4dl;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.eip_d_surveying_works_level);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear119dl = findViewById(R.id.linear119dl);
		close3dl = findViewById(R.id.close3dl);
		linear116dl = findViewById(R.id.linear116dl);
		linear115dl = findViewById(R.id.linear115dl);
		linear114dl = findViewById(R.id.linear114dl);
		edittext6dl = findViewById(R.id.edittext6dl);
		edittext_am6dl = findViewById(R.id.edittext_am6dl);
		edittext5dl = findViewById(R.id.edittext5dl);
		edittext_am5dl = findViewById(R.id.edittext_am5dl);
		edittext4dl = findViewById(R.id.edittext4dl);
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
