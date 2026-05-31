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
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ToipccDEjectionLinePriceAndStudysssActivity extends AppCompatActivity {
	
	private TextView textview519;
	private ScrollView vscroll1;
	private LinearLayout linear205;
	private LinearLayout linear713;
	private LinearLayout linear1053;
	private LinearLayout linear389;
	private LinearLayout linear575;
	private TextView textview65d;
	private LinearLayout linear1049;
	private HorizontalScrollView hscroll138;
	private LinearLayout linear195;
	private HorizontalScrollView hscroll80;
	private LinearLayout linear127;
	private LinearLayout linear202;
	private LinearLayout linear186;
	private LinearLayout linear184;
	private LinearLayout linear120;
	private LinearLayout linear201;
	private LinearLayout linear198;
	private HorizontalScrollView hscroll10;
	private LinearLayout linear126;
	private HorizontalScrollView hscroll137;
	private LinearLayout linear144;
	private LinearLayout linear523;
	private LinearLayout linear584;
	private LinearLayout linear524;
	private LinearLayout linear522;
	private LinearLayout linear525;
	private TextView textview66d;
	private HorizontalScrollView hscroll75;
	private LinearLayout linear183;
	private HorizontalScrollView hscroll63;
	private LinearLayout linear431;
	private LinearLayout linear254;
	private HorizontalScrollView hscroll9;
	private LinearLayout linear1051;
	private HorizontalScrollView hscroll126;
	private LinearLayout linear1052;
	private HorizontalScrollView hscroll18;
	private LinearLayout linear432;
	private HorizontalScrollView hscroll140;
	private LinearLayout linear1050;
	private LinearLayout linear119;
	private LinearLayout linear585;
	private ImageView close;
	private LinearLayout linear720;
	private TextView textview180;
	private TextView textview170d;
	private EditText element_nums_d;
	private TextView textview160;
	private EditText element_num_d;
	private TextView textview150d;
	private EditText edittext1d;
	private TextView textview2353;
	private TextView textview1d;
	private TextView textview277;
	private EditText edittext2d;
	private TextView textview603;
	private TextView textview2d;
	private TextView textview3d;
	private TextView textview697;
	private EditText edittext3d;
	private TextView textview354;
	private TextView textview698;
	private EditText edittext4d;
	private TextView textview287;
	private TextView textview4d;
	private TextView textview1421;
	private EditText edittext5d;
	private TextView textview1422;
	private TextView textview5d;
	private TextView textview6d;
	private TextView textview61;
	private EditText edittext6d;
	private TextView textview58;
	private EditText edittext7d;
	private TextView textview353;
	private TextView textview7d;
	private TextView textview60;
	private EditText edittext8d;
	private TextView textview602;
	private TextView textview8d;
	private TextView textview1262;
	private EditText edittext9d;
	private TextView textview1263;
	private TextView textview9d;
	private TextView textview1148;
	private EditText edittext10d;
	private TextView textview1149;
	private TextView textview10d;
	private TextView textview696;
	private EditText edittext11d;
	private TextView textview271;
	private TextView textview11d;
	private TextView textview874;
	private EditText edittext12d;
	private TextView textview875;
	private TextView textview12d;
	private Button button2d;
	private TextView textview13d;
	private TextView textview2342;
	private LinearLayout linear1040;
	private TextView textview2341;
	private EditText edittext13d;
	private TextView textview14d;
	private TextView textview43;
	private LinearLayout linear157;
	private TextView textview68;
	private EditText edittext14d;
	private TextView textview15d;
	private TextView textview891;
	private LinearLayout linear433;
	private TextView textview878;
	private EditText edittext15d;
	private TextView textview2354;
	private EditText edittext16d;
	private TextView textview2355;
	private TextView textview16d;
	private TextView textview17d;
	private TextView textview2224;
	private LinearLayout linear586;
	private TextView textview1266;
	private EditText edittext17d;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_d_ejection_line_price_and_studysss);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		textview519 = findViewById(R.id.textview519);
		vscroll1 = findViewById(R.id.vscroll1);
		linear205 = findViewById(R.id.linear205);
		linear713 = findViewById(R.id.linear713);
		linear1053 = findViewById(R.id.linear1053);
		linear389 = findViewById(R.id.linear389);
		linear575 = findViewById(R.id.linear575);
		textview65d = findViewById(R.id.textview65d);
		linear1049 = findViewById(R.id.linear1049);
		hscroll138 = findViewById(R.id.hscroll138);
		linear195 = findViewById(R.id.linear195);
		hscroll80 = findViewById(R.id.hscroll80);
		linear127 = findViewById(R.id.linear127);
		linear202 = findViewById(R.id.linear202);
		linear186 = findViewById(R.id.linear186);
		linear184 = findViewById(R.id.linear184);
		linear120 = findViewById(R.id.linear120);
		linear201 = findViewById(R.id.linear201);
		linear198 = findViewById(R.id.linear198);
		hscroll10 = findViewById(R.id.hscroll10);
		linear126 = findViewById(R.id.linear126);
		hscroll137 = findViewById(R.id.hscroll137);
		linear144 = findViewById(R.id.linear144);
		linear523 = findViewById(R.id.linear523);
		linear584 = findViewById(R.id.linear584);
		linear524 = findViewById(R.id.linear524);
		linear522 = findViewById(R.id.linear522);
		linear525 = findViewById(R.id.linear525);
		textview66d = findViewById(R.id.textview66d);
		hscroll75 = findViewById(R.id.hscroll75);
		linear183 = findViewById(R.id.linear183);
		hscroll63 = findViewById(R.id.hscroll63);
		linear431 = findViewById(R.id.linear431);
		linear254 = findViewById(R.id.linear254);
		hscroll9 = findViewById(R.id.hscroll9);
		linear1051 = findViewById(R.id.linear1051);
		hscroll126 = findViewById(R.id.hscroll126);
		linear1052 = findViewById(R.id.linear1052);
		hscroll18 = findViewById(R.id.hscroll18);
		linear432 = findViewById(R.id.linear432);
		hscroll140 = findViewById(R.id.hscroll140);
		linear1050 = findViewById(R.id.linear1050);
		linear119 = findViewById(R.id.linear119);
		linear585 = findViewById(R.id.linear585);
		close = findViewById(R.id.close);
		linear720 = findViewById(R.id.linear720);
		textview180 = findViewById(R.id.textview180);
		textview170d = findViewById(R.id.textview170d);
		element_nums_d = findViewById(R.id.element_nums_d);
		textview160 = findViewById(R.id.textview160);
		element_num_d = findViewById(R.id.element_num_d);
		textview150d = findViewById(R.id.textview150d);
		edittext1d = findViewById(R.id.edittext1d);
		textview2353 = findViewById(R.id.textview2353);
		textview1d = findViewById(R.id.textview1d);
		textview277 = findViewById(R.id.textview277);
		edittext2d = findViewById(R.id.edittext2d);
		textview603 = findViewById(R.id.textview603);
		textview2d = findViewById(R.id.textview2d);
		textview3d = findViewById(R.id.textview3d);
		textview697 = findViewById(R.id.textview697);
		edittext3d = findViewById(R.id.edittext3d);
		textview354 = findViewById(R.id.textview354);
		textview698 = findViewById(R.id.textview698);
		edittext4d = findViewById(R.id.edittext4d);
		textview287 = findViewById(R.id.textview287);
		textview4d = findViewById(R.id.textview4d);
		textview1421 = findViewById(R.id.textview1421);
		edittext5d = findViewById(R.id.edittext5d);
		textview1422 = findViewById(R.id.textview1422);
		textview5d = findViewById(R.id.textview5d);
		textview6d = findViewById(R.id.textview6d);
		textview61 = findViewById(R.id.textview61);
		edittext6d = findViewById(R.id.edittext6d);
		textview58 = findViewById(R.id.textview58);
		edittext7d = findViewById(R.id.edittext7d);
		textview353 = findViewById(R.id.textview353);
		textview7d = findViewById(R.id.textview7d);
		textview60 = findViewById(R.id.textview60);
		edittext8d = findViewById(R.id.edittext8d);
		textview602 = findViewById(R.id.textview602);
		textview8d = findViewById(R.id.textview8d);
		textview1262 = findViewById(R.id.textview1262);
		edittext9d = findViewById(R.id.edittext9d);
		textview1263 = findViewById(R.id.textview1263);
		textview9d = findViewById(R.id.textview9d);
		textview1148 = findViewById(R.id.textview1148);
		edittext10d = findViewById(R.id.edittext10d);
		textview1149 = findViewById(R.id.textview1149);
		textview10d = findViewById(R.id.textview10d);
		textview696 = findViewById(R.id.textview696);
		edittext11d = findViewById(R.id.edittext11d);
		textview271 = findViewById(R.id.textview271);
		textview11d = findViewById(R.id.textview11d);
		textview874 = findViewById(R.id.textview874);
		edittext12d = findViewById(R.id.edittext12d);
		textview875 = findViewById(R.id.textview875);
		textview12d = findViewById(R.id.textview12d);
		button2d = findViewById(R.id.button2d);
		textview13d = findViewById(R.id.textview13d);
		textview2342 = findViewById(R.id.textview2342);
		linear1040 = findViewById(R.id.linear1040);
		textview2341 = findViewById(R.id.textview2341);
		edittext13d = findViewById(R.id.edittext13d);
		textview14d = findViewById(R.id.textview14d);
		textview43 = findViewById(R.id.textview43);
		linear157 = findViewById(R.id.linear157);
		textview68 = findViewById(R.id.textview68);
		edittext14d = findViewById(R.id.edittext14d);
		textview15d = findViewById(R.id.textview15d);
		textview891 = findViewById(R.id.textview891);
		linear433 = findViewById(R.id.linear433);
		textview878 = findViewById(R.id.textview878);
		edittext15d = findViewById(R.id.edittext15d);
		textview2354 = findViewById(R.id.textview2354);
		edittext16d = findViewById(R.id.edittext16d);
		textview2355 = findViewById(R.id.textview2355);
		textview16d = findViewById(R.id.textview16d);
		textview17d = findViewById(R.id.textview17d);
		textview2224 = findViewById(R.id.textview2224);
		linear586 = findViewById(R.id.linear586);
		textview1266 = findViewById(R.id.textview1266);
		edittext17d = findViewById(R.id.edittext17d);
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
		WebView webView = new WebView(ToipccDEjectionLinePriceAndStudysssActivity.this);
		webView.loadDataWithBaseURL(null, htmlContent.toString(), "text/html", "UTF-8", null);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageFinished(WebView view, String url) {
				PrintManager printManager = (PrintManager) ToipccDEjectionLinePriceAndStudysssActivity.this.getSystemService(PRINT_SERVICE);
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
