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
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

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



	public void _PrintHelper(final View _view) {
		StringBuilder htmlContent = new StringBuilder();
		htmlContent.append("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">");
		htmlContent.append("<style>body{font-family:Arial,sans-serif;direction:rtl;padding:16px;background:#fff;}");
		htmlContent.append("p{margin:4px 0;padding:6px 8px;border-radius:4px;}");
		htmlContent.append(".input{background:#E8F5E9;border-left:3px solid #4CAF50;}");
		htmlContent.append(".result{background:#E3F2FD;border-left:3px solid #2196F3;}");
		htmlContent.append("h4{color:#006064;margin-top:12px;}");
		htmlContent.append("</style></head><body>");
		_collectViewsHtml(_view, htmlContent);
		htmlContent.append("</body></html>");
		WebView webView = new WebView(EipDSoil1Activity.this);
		webView.loadDataWithBaseURL(null, htmlContent.toString(), "text/html", "UTF-8", null);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageFinished(WebView view, String url) {
				PrintManager printManager = (PrintManager) EipDSoil1Activity.this.getSystemService(PRINT_SERVICE);
				if (printManager != null) {
					PrintDocumentAdapter printAdapter = view.createPrintDocumentAdapter("طباعة");
					printManager.print("طباعة", printAdapter, new android.print.PrintAttributes.Builder().build());
				}
			}
		});
	}

	private void _collectViewsHtml(View v, StringBuilder sb) {
		if (v instanceof android.view.ViewGroup) {
			android.view.ViewGroup vg = (android.view.ViewGroup) v;
			for (int i = 0; i < vg.getChildCount(); i++) {
				_collectViewsHtml(vg.getChildAt(i), sb);
			}
		} else if (v instanceof TextView) {
			String text = ((TextView) v).getText().toString().trim();
			if (!text.isEmpty()) {
				int bgColor = 0;
				if (v.getBackground() instanceof android.graphics.drawable.ColorDrawable) {
					bgColor = ((android.graphics.drawable.ColorDrawable) v.getBackground()).getColor();
				}
				String css = (bgColor == 0xFF4CAF50 || bgColor == 0xFFE8F5E9) ? " class=\"input\"" :
						(bgColor == 0xFF2196F3 || bgColor == 0xFFE3F2FD) ? " class=\"result\"" : "";
				sb.append("<p").append(css).append(">").append(android.text.Html.escapeHtml(text)).append("</p>\n");
			}
		}
	}

}
