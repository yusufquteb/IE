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
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EipDCheckSewageLinesExcavationWidthActivity extends AppCompatActivity {
	
	private LinearLayout linear3;
	private HorizontalScrollView hscroll38;
	private LinearLayout linear2414;
	private HorizontalScrollView hscroll37;
	private LinearLayout linear2372;
	private HorizontalScrollView hscroll19;
	private LinearLayout linear2370;
	private HorizontalScrollView hscroll18;
	private LinearLayout linear2378;
	private TextView textview111dw;
	private TextView textview112dw;
	private TextView textview113dw;
	private ImageView close1dw;
	private LinearLayout linear2415;
	private EditText edittext557dw;
	private TextView textview557dw;
	private EditText edittext_am16dw;
	private TextView textview2413;
	private EditText edittext16dw;
	private TextView textview2414;
	private TextView textview16dw;
	private TextView textview17dw;
	private TextView textview2425;
	private LinearLayout linear2373;
	private TextView textview2424;
	private EditText edittext17dw;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.eip_d_check_sewage_lines_excavation_width);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear3 = findViewById(R.id.linear3);
		hscroll38 = findViewById(R.id.hscroll38);
		linear2414 = findViewById(R.id.linear2414);
		hscroll37 = findViewById(R.id.hscroll37);
		linear2372 = findViewById(R.id.linear2372);
		hscroll19 = findViewById(R.id.hscroll19);
		linear2370 = findViewById(R.id.linear2370);
		hscroll18 = findViewById(R.id.hscroll18);
		linear2378 = findViewById(R.id.linear2378);
		textview111dw = findViewById(R.id.textview111dw);
		textview112dw = findViewById(R.id.textview112dw);
		textview113dw = findViewById(R.id.textview113dw);
		close1dw = findViewById(R.id.close1dw);
		linear2415 = findViewById(R.id.linear2415);
		edittext557dw = findViewById(R.id.edittext557dw);
		textview557dw = findViewById(R.id.textview557dw);
		edittext_am16dw = findViewById(R.id.edittext_am16dw);
		textview2413 = findViewById(R.id.textview2413);
		edittext16dw = findViewById(R.id.edittext16dw);
		textview2414 = findViewById(R.id.textview2414);
		textview16dw = findViewById(R.id.textview16dw);
		textview17dw = findViewById(R.id.textview17dw);
		textview2425 = findViewById(R.id.textview2425);
		linear2373 = findViewById(R.id.linear2373);
		textview2424 = findViewById(R.id.textview2424);
		edittext17dw = findViewById(R.id.edittext17dw);
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
			_PrintHelper(linear3);
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
		WebView webView = new WebView(EipDCheckSewageLinesExcavationWidthActivity.this);
		webView.loadDataWithBaseURL(null, htmlContent.toString(), "text/html", "UTF-8", null);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageFinished(WebView view, String url) {
				PrintManager printManager = (PrintManager) EipDCheckSewageLinesExcavationWidthActivity.this.getSystemService(PRINT_SERVICE);
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
