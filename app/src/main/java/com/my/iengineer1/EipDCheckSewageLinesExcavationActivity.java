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

public class EipDCheckSewageLinesExcavationActivity extends AppCompatActivity {
	
	private TextView textview147d;
	private ScrollView vscroll2;
	private LinearLayout linear2d;
	private LinearLayout linear_closed;
	private HorizontalScrollView hscroll36d;
	private LinearLayout linear555d;
	private TextView textview102d;
	private TextView textview103d;
	private LinearLayout linear201d;
	private HorizontalScrollView hscroll39d;
	private LinearLayout linear202d;
	private HorizontalScrollView hscroll11;
	private LinearLayout linear203d;
	private TextView textview118d;
	private HorizontalScrollView hscroll14;
	private LinearLayout linear204d;
	private HorizontalScrollView hscroll12;
	private LinearLayout linear205d;
	private HorizontalScrollView hscroll3d;
	private LinearLayout linear206d;
	private HorizontalScrollView hscroll13d;
	private TextView textview40d;
	private LinearLayout linear40d;
	private TextView textview104;
	private LinearLayout linear207d;
	private LinearLayout linear208d;
	private HorizontalScrollView hscroll37d;
	private LinearLayout linear231d;
	private HorizontalScrollView hscroll231d;
	private LinearLayout linear209d;
	private HorizontalScrollView hscroll219d;
	private LinearLayout linear51d;
	private HorizontalScrollView hscroll51d;
	private LinearLayout linear210d;
	private TextView textview105d;
	private LinearLayout linear211d;
	private LinearLayout linear214d;
	private TextView textview109d;
	private LinearLayout linear217d;
	private HorizontalScrollView hscroll38d;
	private LinearLayout linear215d;
	private HorizontalScrollView hscroll16d;
	private LinearLayout linear26d;
	private HorizontalScrollView hscroll26d;
	private LinearLayout linear232d;
	private HorizontalScrollView hscroll232d;
	private LinearLayout linear33d;
	private HorizontalScrollView hscroll33d;
	private LinearLayout linear216d;
	private HorizontalScrollView hscroll43d;
	private LinearLayout linear52d;
	private HorizontalScrollView hscroll52d;
	private LinearLayout linear43d;
	private TextView textview148d;
	private TextView textview106d;
	private TextView textview107d;
	private LinearLayout linear_dynamic_pipe_line_check_excavation_width;
	private Button button2dw;
	private TextView textview149d;
	private TextView textview108d;
	private LinearLayout linear_dynamic_pipe_line_check_excavation_level;
	private Button button5dl;
	private ImageView closed;
	private LinearLayout linear720;
	private TextView textview180;
	private TextView textview2412;
	private EditText edittext556d;
	private TextView textview160;
	private EditText edittext555d;
	private TextView textview555d;
	private EditText edittext1d;
	private TextView textview1d;
	private EditText edittext2d;
	private TextView textview2d;
	private EditText edittext_am3d;
	private TextView textview1457;
	private EditText edittext3d;
	private TextView textview607;
	private TextView textview3d;
	private EditText edittext_am4d;
	private TextView textview1426;
	private EditText edittext4d;
	private TextView textview1427;
	private TextView textview4d;
	private EditText edittext_am5d;
	private TextView textview1428;
	private EditText edittext5d;
	private TextView textview1429;
	private TextView textview5d;
	private EditText edittext_am6d;
	private TextView textview1430;
	private EditText edittext6d;
	private TextView textview1431;
	private TextView textview6d;
	private LinearLayout linear721;
	private LinearLayout linear723;
	private LinearLayout linear722;
	private TextView textview42d;
	private EditText edittext42d;
	private EditText edittext_am42d;
	private TextView textview2432;
	private TextView textview592;
	private TextView textview41d;
	private EditText edittext41d;
	private EditText edittext_am41d;
	private EditText edittext7d;
	private TextView textview7d;
	private EditText edittext_am8d;
	private EditText edittext8d;
	private TextView textview601;
	private TextView textview8d;
	private EditText edittext_am31d;
	private EditText edittext31d;
	private TextView textview2429;
	private TextView textview31d;
	private EditText edittext_am9d;
	private TextView textview2410;
	private EditText edittext9d;
	private TextView textview2411;
	private TextView textview9d;
	private EditText edittext_am51d;
	private TextView textview2438;
	private EditText edittext51d;
	private TextView textview2439;
	private TextView textview51d;
	private EditText edittext_am10d;
	private TextView textview611;
	private EditText edittext10d;
	private TextView textview609;
	private TextView textview10d;
	private LinearLayout linear213d;
	private TextView textview2378;
	private LinearLayout linear212d;
	private TextView textview12d;
	private EditText edittext12d;
	private EditText edittext_am12d;
	private TextView textview11d;
	private EditText edittext11d;
	private EditText edittext_am11d;
	private Button button1d;
	private EditText edittext_am15d;
	private EditText edittext15d;
	private TextView textview98;
	private TextView textview15d;
	private EditText edittext_am13d;
	private EditText edittext13d;
	private TextView textview2383;
	private TextView textview13d;
	private TextView textview2442;
	private EditText edittext26d;
	private TextView textview2443;
	private TextView textview26d;
	private EditText edittext_am32d;
	private EditText edittext32d;
	private TextView textview2431;
	private TextView textview32d;
	private TextView textview2444;
	private EditText edittext33d;
	private TextView textview2445;
	private TextView textview33d;
	private TextView textview606;
	private EditText edittext14d;
	private TextView textview334;
	private TextView textview14d;
	private TextView textview2440;
	private EditText edittext52d;
	private TextView textview2441;
	private TextView textview52d;
	private TextView textview2433;
	private EditText edittext43d;
	private TextView textview2434;
	private TextView textview43d;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.eip_d_check_sewage_lines_excavation);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		textview147d = findViewById(R.id.textview147d);
		vscroll2 = findViewById(R.id.vscroll2);
		linear2d = findViewById(R.id.linear2d);
		linear_closed = findViewById(R.id.linear_closed);
		hscroll36d = findViewById(R.id.hscroll36d);
		linear555d = findViewById(R.id.linear555d);
		textview102d = findViewById(R.id.textview102d);
		textview103d = findViewById(R.id.textview103d);
		linear201d = findViewById(R.id.linear201d);
		hscroll39d = findViewById(R.id.hscroll39d);
		linear202d = findViewById(R.id.linear202d);
		hscroll11 = findViewById(R.id.hscroll11);
		linear203d = findViewById(R.id.linear203d);
		textview118d = findViewById(R.id.textview118d);
		hscroll14 = findViewById(R.id.hscroll14);
		linear204d = findViewById(R.id.linear204d);
		hscroll12 = findViewById(R.id.hscroll12);
		linear205d = findViewById(R.id.linear205d);
		hscroll3d = findViewById(R.id.hscroll3d);
		linear206d = findViewById(R.id.linear206d);
		hscroll13d = findViewById(R.id.hscroll13d);
		textview40d = findViewById(R.id.textview40d);
		linear40d = findViewById(R.id.linear40d);
		textview104 = findViewById(R.id.textview104);
		linear207d = findViewById(R.id.linear207d);
		linear208d = findViewById(R.id.linear208d);
		hscroll37d = findViewById(R.id.hscroll37d);
		linear231d = findViewById(R.id.linear231d);
		hscroll231d = findViewById(R.id.hscroll231d);
		linear209d = findViewById(R.id.linear209d);
		hscroll219d = findViewById(R.id.hscroll219d);
		linear51d = findViewById(R.id.linear51d);
		hscroll51d = findViewById(R.id.hscroll51d);
		linear210d = findViewById(R.id.linear210d);
		textview105d = findViewById(R.id.textview105d);
		linear211d = findViewById(R.id.linear211d);
		linear214d = findViewById(R.id.linear214d);
		textview109d = findViewById(R.id.textview109d);
		linear217d = findViewById(R.id.linear217d);
		hscroll38d = findViewById(R.id.hscroll38d);
		linear215d = findViewById(R.id.linear215d);
		hscroll16d = findViewById(R.id.hscroll16d);
		linear26d = findViewById(R.id.linear26d);
		hscroll26d = findViewById(R.id.hscroll26d);
		linear232d = findViewById(R.id.linear232d);
		hscroll232d = findViewById(R.id.hscroll232d);
		linear33d = findViewById(R.id.linear33d);
		hscroll33d = findViewById(R.id.hscroll33d);
		linear216d = findViewById(R.id.linear216d);
		hscroll43d = findViewById(R.id.hscroll43d);
		linear52d = findViewById(R.id.linear52d);
		hscroll52d = findViewById(R.id.hscroll52d);
		linear43d = findViewById(R.id.linear43d);
		textview148d = findViewById(R.id.textview148d);
		textview106d = findViewById(R.id.textview106d);
		textview107d = findViewById(R.id.textview107d);
		linear_dynamic_pipe_line_check_excavation_width = findViewById(R.id.linear_dynamic_pipe_line_check_excavation_width);
		button2dw = findViewById(R.id.button2dw);
		textview149d = findViewById(R.id.textview149d);
		textview108d = findViewById(R.id.textview108d);
		linear_dynamic_pipe_line_check_excavation_level = findViewById(R.id.linear_dynamic_pipe_line_check_excavation_level);
		button5dl = findViewById(R.id.button5dl);
		closed = findViewById(R.id.closed);
		linear720 = findViewById(R.id.linear720);
		textview180 = findViewById(R.id.textview180);
		textview2412 = findViewById(R.id.textview2412);
		edittext556d = findViewById(R.id.edittext556d);
		textview160 = findViewById(R.id.textview160);
		edittext555d = findViewById(R.id.edittext555d);
		textview555d = findViewById(R.id.textview555d);
		edittext1d = findViewById(R.id.edittext1d);
		textview1d = findViewById(R.id.textview1d);
		edittext2d = findViewById(R.id.edittext2d);
		textview2d = findViewById(R.id.textview2d);
		edittext_am3d = findViewById(R.id.edittext_am3d);
		textview1457 = findViewById(R.id.textview1457);
		edittext3d = findViewById(R.id.edittext3d);
		textview607 = findViewById(R.id.textview607);
		textview3d = findViewById(R.id.textview3d);
		edittext_am4d = findViewById(R.id.edittext_am4d);
		textview1426 = findViewById(R.id.textview1426);
		edittext4d = findViewById(R.id.edittext4d);
		textview1427 = findViewById(R.id.textview1427);
		textview4d = findViewById(R.id.textview4d);
		edittext_am5d = findViewById(R.id.edittext_am5d);
		textview1428 = findViewById(R.id.textview1428);
		edittext5d = findViewById(R.id.edittext5d);
		textview1429 = findViewById(R.id.textview1429);
		textview5d = findViewById(R.id.textview5d);
		edittext_am6d = findViewById(R.id.edittext_am6d);
		textview1430 = findViewById(R.id.textview1430);
		edittext6d = findViewById(R.id.edittext6d);
		textview1431 = findViewById(R.id.textview1431);
		textview6d = findViewById(R.id.textview6d);
		linear721 = findViewById(R.id.linear721);
		linear723 = findViewById(R.id.linear723);
		linear722 = findViewById(R.id.linear722);
		textview42d = findViewById(R.id.textview42d);
		edittext42d = findViewById(R.id.edittext42d);
		edittext_am42d = findViewById(R.id.edittext_am42d);
		textview2432 = findViewById(R.id.textview2432);
		textview592 = findViewById(R.id.textview592);
		textview41d = findViewById(R.id.textview41d);
		edittext41d = findViewById(R.id.edittext41d);
		edittext_am41d = findViewById(R.id.edittext_am41d);
		edittext7d = findViewById(R.id.edittext7d);
		textview7d = findViewById(R.id.textview7d);
		edittext_am8d = findViewById(R.id.edittext_am8d);
		edittext8d = findViewById(R.id.edittext8d);
		textview601 = findViewById(R.id.textview601);
		textview8d = findViewById(R.id.textview8d);
		edittext_am31d = findViewById(R.id.edittext_am31d);
		edittext31d = findViewById(R.id.edittext31d);
		textview2429 = findViewById(R.id.textview2429);
		textview31d = findViewById(R.id.textview31d);
		edittext_am9d = findViewById(R.id.edittext_am9d);
		textview2410 = findViewById(R.id.textview2410);
		edittext9d = findViewById(R.id.edittext9d);
		textview2411 = findViewById(R.id.textview2411);
		textview9d = findViewById(R.id.textview9d);
		edittext_am51d = findViewById(R.id.edittext_am51d);
		textview2438 = findViewById(R.id.textview2438);
		edittext51d = findViewById(R.id.edittext51d);
		textview2439 = findViewById(R.id.textview2439);
		textview51d = findViewById(R.id.textview51d);
		edittext_am10d = findViewById(R.id.edittext_am10d);
		textview611 = findViewById(R.id.textview611);
		edittext10d = findViewById(R.id.edittext10d);
		textview609 = findViewById(R.id.textview609);
		textview10d = findViewById(R.id.textview10d);
		linear213d = findViewById(R.id.linear213d);
		textview2378 = findViewById(R.id.textview2378);
		linear212d = findViewById(R.id.linear212d);
		textview12d = findViewById(R.id.textview12d);
		edittext12d = findViewById(R.id.edittext12d);
		edittext_am12d = findViewById(R.id.edittext_am12d);
		textview11d = findViewById(R.id.textview11d);
		edittext11d = findViewById(R.id.edittext11d);
		edittext_am11d = findViewById(R.id.edittext_am11d);
		button1d = findViewById(R.id.button1d);
		edittext_am15d = findViewById(R.id.edittext_am15d);
		edittext15d = findViewById(R.id.edittext15d);
		textview98 = findViewById(R.id.textview98);
		textview15d = findViewById(R.id.textview15d);
		edittext_am13d = findViewById(R.id.edittext_am13d);
		edittext13d = findViewById(R.id.edittext13d);
		textview2383 = findViewById(R.id.textview2383);
		textview13d = findViewById(R.id.textview13d);
		textview2442 = findViewById(R.id.textview2442);
		edittext26d = findViewById(R.id.edittext26d);
		textview2443 = findViewById(R.id.textview2443);
		textview26d = findViewById(R.id.textview26d);
		edittext_am32d = findViewById(R.id.edittext_am32d);
		edittext32d = findViewById(R.id.edittext32d);
		textview2431 = findViewById(R.id.textview2431);
		textview32d = findViewById(R.id.textview32d);
		textview2444 = findViewById(R.id.textview2444);
		edittext33d = findViewById(R.id.edittext33d);
		textview2445 = findViewById(R.id.textview2445);
		textview33d = findViewById(R.id.textview33d);
		textview606 = findViewById(R.id.textview606);
		edittext14d = findViewById(R.id.edittext14d);
		textview334 = findViewById(R.id.textview334);
		textview14d = findViewById(R.id.textview14d);
		textview2440 = findViewById(R.id.textview2440);
		edittext52d = findViewById(R.id.edittext52d);
		textview2441 = findViewById(R.id.textview2441);
		textview52d = findViewById(R.id.textview52d);
		textview2433 = findViewById(R.id.textview2433);
		edittext43d = findViewById(R.id.edittext43d);
		textview2434 = findViewById(R.id.textview2434);
		textview43d = findViewById(R.id.textview43d);
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
			_PrintHelper(linear2d);
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
		WebView webView = new WebView(EipDCheckSewageLinesExcavationActivity.this);
		webView.loadDataWithBaseURL(null, htmlContent.toString(), "text/html", "UTF-8", null);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageFinished(WebView view, String url) {
				PrintManager printManager = (PrintManager) EipDCheckSewageLinesExcavationActivity.this.getSystemService(PRINT_SERVICE);
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
