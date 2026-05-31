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

public class ToipccDConcreteQuantityCalculationActivity extends AppCompatActivity {
	
	private LinearLayout concrete_quantity;
	private TextView textview519;
	private LinearLayout linear389;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear240;
	private LinearLayout out_dynamic4;
	private LinearLayout linear237;
	private TextView textview1074;
	private TextView dynamic_element_symble2;
	private EditText dynamic_element_serial_numbers;
	private TextView dynamic_element_symble;
	private TextView textview1072;
	private EditText dynamic_element_serial_number;
	private TextView dynamic_element_type;
	private LinearLayout out_dynamic1;
	private LinearLayout out_dynamic3;
	private LinearLayout linear5;
	private LinearLayout out_dynamic2;
	private TextView dynamic_width_of_element;
	private EditText dynamic_wid_of_element;
	private TextView textview15;
	private TextView dynamic_number_of_element;
	private EditText dynamic_num_of_element;
	private TextView textview4;
	private TextView dynamic_length_of_element;
	private EditText dynamic_len_of_element;
	private TextView textview14;
	private TextView dynamic_height_of_element;
	private EditText dynamic_hei_of_element;
	private Button dynamic_ele_cal;
	private TextView textview708;
	private EditText dynamic_qu_of_element;
	private TextView textview13;
	private TextView textview12;
	private Button dynamic_element_remove;
	private TextView textview704;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_d_concrete_quantity_calculation);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		concrete_quantity = findViewById(R.id.concrete_quantity);
		textview519 = findViewById(R.id.textview519);
		linear389 = findViewById(R.id.linear389);
		hscroll1 = findViewById(R.id.hscroll1);
		linear240 = findViewById(R.id.linear240);
		out_dynamic4 = findViewById(R.id.out_dynamic4);
		linear237 = findViewById(R.id.linear237);
		textview1074 = findViewById(R.id.textview1074);
		dynamic_element_symble2 = findViewById(R.id.dynamic_element_symble2);
		dynamic_element_serial_numbers = findViewById(R.id.dynamic_element_serial_numbers);
		dynamic_element_symble = findViewById(R.id.dynamic_element_symble);
		textview1072 = findViewById(R.id.textview1072);
		dynamic_element_serial_number = findViewById(R.id.dynamic_element_serial_number);
		dynamic_element_type = findViewById(R.id.dynamic_element_type);
		out_dynamic1 = findViewById(R.id.out_dynamic1);
		out_dynamic3 = findViewById(R.id.out_dynamic3);
		linear5 = findViewById(R.id.linear5);
		out_dynamic2 = findViewById(R.id.out_dynamic2);
		dynamic_width_of_element = findViewById(R.id.dynamic_width_of_element);
		dynamic_wid_of_element = findViewById(R.id.dynamic_wid_of_element);
		textview15 = findViewById(R.id.textview15);
		dynamic_number_of_element = findViewById(R.id.dynamic_number_of_element);
		dynamic_num_of_element = findViewById(R.id.dynamic_num_of_element);
		textview4 = findViewById(R.id.textview4);
		dynamic_length_of_element = findViewById(R.id.dynamic_length_of_element);
		dynamic_len_of_element = findViewById(R.id.dynamic_len_of_element);
		textview14 = findViewById(R.id.textview14);
		dynamic_height_of_element = findViewById(R.id.dynamic_height_of_element);
		dynamic_hei_of_element = findViewById(R.id.dynamic_hei_of_element);
		dynamic_ele_cal = findViewById(R.id.dynamic_ele_cal);
		textview708 = findViewById(R.id.textview708);
		dynamic_qu_of_element = findViewById(R.id.dynamic_qu_of_element);
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		dynamic_element_remove = findViewById(R.id.dynamic_element_remove);
		textview704 = findViewById(R.id.textview704);
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
			_PrintHelper(linear389);
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
		WebView webView = new WebView(ToipccDConcreteQuantityCalculationActivity.this);
		webView.loadDataWithBaseURL(null, htmlContent.toString(), "text/html", "UTF-8", null);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageFinished(WebView view, String url) {
				PrintManager printManager = (PrintManager) ToipccDConcreteQuantityCalculationActivity.this.getSystemService(PRINT_SERVICE);
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
