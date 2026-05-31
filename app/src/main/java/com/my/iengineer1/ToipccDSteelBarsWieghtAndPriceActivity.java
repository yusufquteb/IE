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
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;
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
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ToipccDSteelBarsWieghtAndPriceActivity extends AppCompatActivity {
	
	private TextView textview519;
	private ScrollView vscroll1;
	private LinearLayout linear705;
	private LinearLayout linear678;
	private TextView textview14;
	private LinearLayout linear694;
	private TextView textview1072;
	private LinearLayout linear693;
	private TextView textview1410;
	private LinearLayout linear695;
	private TextView textview1650;
	private LinearLayout linear699;
	private LinearLayout linear703;
	private TextView textview1654;
	private LinearLayout linear704;
	private ImageView close;
	private LinearLayout linear683;
	private TextView textview1669;
	private EditText edittext1d;
	private TextView textview1670;
	private TextView textview2;
	private TextView textview1666;
	private EditText edittext2d;
	private TextView textview1667;
	private TextView textview3d;
	private TextView textview1698;
	private EditText edittext3d;
	private TextView textview1672;
	private TextView textview4d;
	private Button button1d;
	private TextView textview1701;
	private EditText edittext4d;
	private TextView textview1702;
	private TextView textview5;
	private TextView textview1704;
	private EditText edittext5d;
	private TextView textview1705;
	private TextView textview6;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_d_steel_bars_wieght_and_price);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		textview519 = findViewById(R.id.textview519);
		vscroll1 = findViewById(R.id.vscroll1);
		linear705 = findViewById(R.id.linear705);
		linear678 = findViewById(R.id.linear678);
		textview14 = findViewById(R.id.textview14);
		linear694 = findViewById(R.id.linear694);
		textview1072 = findViewById(R.id.textview1072);
		linear693 = findViewById(R.id.linear693);
		textview1410 = findViewById(R.id.textview1410);
		linear695 = findViewById(R.id.linear695);
		textview1650 = findViewById(R.id.textview1650);
		linear699 = findViewById(R.id.linear699);
		linear703 = findViewById(R.id.linear703);
		textview1654 = findViewById(R.id.textview1654);
		linear704 = findViewById(R.id.linear704);
		close = findViewById(R.id.close);
		linear683 = findViewById(R.id.linear683);
		textview1669 = findViewById(R.id.textview1669);
		edittext1d = findViewById(R.id.edittext1d);
		textview1670 = findViewById(R.id.textview1670);
		textview2 = findViewById(R.id.textview2);
		textview1666 = findViewById(R.id.textview1666);
		edittext2d = findViewById(R.id.edittext2d);
		textview1667 = findViewById(R.id.textview1667);
		textview3d = findViewById(R.id.textview3d);
		textview1698 = findViewById(R.id.textview1698);
		edittext3d = findViewById(R.id.edittext3d);
		textview1672 = findViewById(R.id.textview1672);
		textview4d = findViewById(R.id.textview4d);
		button1d = findViewById(R.id.button1d);
		textview1701 = findViewById(R.id.textview1701);
		edittext4d = findViewById(R.id.edittext4d);
		textview1702 = findViewById(R.id.textview1702);
		textview5 = findViewById(R.id.textview5);
		textview1704 = findViewById(R.id.textview1704);
		edittext5d = findViewById(R.id.edittext5d);
		textview1705 = findViewById(R.id.textview1705);
		textview6 = findViewById(R.id.textview6);
		
		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
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
			_PrintHelper(linear705);
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
		WebView webView = new WebView(ToipccDSteelBarsWieghtAndPriceActivity.this);
		webView.loadDataWithBaseURL(null, htmlContent.toString(), "text/html", "UTF-8", null);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageFinished(WebView view, String url) {
				PrintManager printManager = (PrintManager) ToipccDSteelBarsWieghtAndPriceActivity.this.getSystemService(PRINT_SERVICE);
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
