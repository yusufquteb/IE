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

public class ToipccDAsphaltMaterialActivity extends AppCompatActivity {
	
	private TextView textview519;
	private ScrollView vscroll1;
	private LinearLayout linear39s1;
	private LinearLayout linear713;
	private LinearLayout linear1258;
	private LinearLayout linear389;
	private TextView textview666ad;
	private LinearLayout linear349;
	private TextView textview986;
	private LinearLayout linear100s1;
	private TextView textview612;
	private LinearLayout linear101s1;
	private TextView textview1650;
	private LinearLayout linear102s1;
	private LinearLayout linear930;
	private LinearLayout linear391;
	private TextView textview281;
	private LinearLayout linear128;
	private HorizontalScrollView hscroll8s1;
	private TextView textview1084;
	private HorizontalScrollView hscroll66s1;
	private ImageView close;
	private LinearLayout linear720;
	private TextView textview18;
	private EditText element_numsd;
	private TextView textview17;
	private TextView textview16;
	private EditText element_numd;
	private TextView textview10;
	private EditText edittext122d;
	private TextView textview987;
	private TextView textview988;
	private TextView textview614;
	private EditText edittext1d;
	private TextView textview124;
	private TextView textview1;
	private TextView textview58;
	private EditText edittext2d;
	private TextView textview1073;
	private TextView textview2d;
	private TextView textview123;
	private EditText edittext3d;
	private TextView textview403;
	private TextView textview3d;
	private Button button1d;
	private TextView textview145;
	private EditText edittext4d;
	private TextView textview405;
	private TextView textview4;
	private TextView textview280;
	private EditText edittext5d;
	private TextView textview355;
	private TextView textview5;
	private LinearLayout linear201s1;
	private LinearLayout linear202s1;
	private LinearLayout linear207s1;
	private LinearLayout linear1168;
	private LinearLayout linear1175;
	private LinearLayout linear1182;
	private LinearLayout linear1189;
	private LinearLayout linear1196;
	private LinearLayout linear1203;
	private LinearLayout linear206s1;
	private LinearLayout linear1216;
	private LinearLayout linear204s1;
	private LinearLayout linear155;
	private LinearLayout linear203s1;
	private LinearLayout linear502s1;
	private LinearLayout linear501s1;
	private TextView textview92;
	private TextView textview91d;
	private TextView textview90;
	private TextView textview401;
	private TextView textview89d;
	private TextView textview88d;
	private TextView textview84;
	private LinearLayout linear507s1;
	private LinearLayout linear1212;
	private LinearLayout linear213s1;
	private LinearLayout linear605s1;
	private LinearLayout linear1235;
	private LinearLayout linear1228;
	private LinearLayout linear506s1;
	private EditText edittext10d;
	private TextView textview1802;
	private EditText edittext9d;
	private TextView textview1795;
	private EditText edittext8d;
	private TextView NoResult;
	private Button button2d;
	private EditText edittext7d;
	private TextView textview1822;
	private EditText edittext6d;
	private TextView textview1813;
	private TextView textview402;
	private LinearLayout linear1169;
	private LinearLayout linear1211;
	private LinearLayout linear1170;
	private LinearLayout linear1239;
	private LinearLayout linear1236;
	private LinearLayout linear1229;
	private LinearLayout linear1174;
	private EditText edittext20d;
	private TextView textview1803;
	private EditText edittext19d;
	private TextView textview1796;
	private EditText edittext18d;
	private TextView d_textview15;
	private Button button3d;
	private EditText edittext17d;
	private TextView textview1823;
	private EditText edittext16d;
	private TextView textview1814;
	private TextView textview1774;
	private LinearLayout linear1176;
	private LinearLayout linear1218;
	private LinearLayout linear1177;
	private LinearLayout linear1240;
	private LinearLayout linear1237;
	private LinearLayout linear1230;
	private LinearLayout linear1181;
	private EditText edittext30d;
	private TextView textview1804;
	private EditText edittext29d;
	private TextView textview1797;
	private EditText edittext28d;
	private TextView textview501s1;
	private Button button4d;
	private EditText edittext27d;
	private TextView textview1824;
	private EditText edittext26d;
	private TextView textview1815;
	private TextView textview1777;
	private LinearLayout linear1183;
	private LinearLayout linear1224;
	private LinearLayout linear1184;
	private LinearLayout linear1244;
	private LinearLayout linear1238;
	private LinearLayout linear1231;
	private LinearLayout linear1188;
	private EditText edittext40d;
	private TextView textview1805;
	private EditText edittext39d;
	private TextView textview1799;
	private EditText edittext38d;
	private TextView textview1397;
	private Button button5d;
	private EditText edittext37d;
	private TextView textview1825;
	private EditText edittext36d;
	private TextView textview1816;
	private TextView textview1780;
	private LinearLayout linear1190;
	private LinearLayout linear1219;
	private LinearLayout linear1191;
	private LinearLayout linear1242;
	private LinearLayout linear1193;
	private LinearLayout linear1232;
	private LinearLayout linear1195;
	private EditText edittext50d;
	private TextView textview1807;
	private EditText edittext49d;
	private TextView textview1798;
	private EditText edittext48d;
	private TextView textview1636;
	private Button button6d;
	private EditText edittext46d;
	private TextView textview1817;
	private TextView textview1783;
	private LinearLayout linear1197;
	private LinearLayout linear1226;
	private LinearLayout linear1198;
	private LinearLayout linear1243;
	private LinearLayout linear1200;
	private LinearLayout linear1233;
	private LinearLayout linear1202;
	private EditText edittext60d;
	private TextView textview1808;
	private EditText edittext59d;
	private TextView textview1800;
	private EditText edittext58d;
	private TextView textview1635;
	private Button button7d;
	private EditText edittext56d;
	private TextView textview1818;
	private TextView textview1786;
	private LinearLayout linear1204;
	private LinearLayout linear1227;
	private LinearLayout linear1205;
	private LinearLayout linear1245;
	private LinearLayout linear1207;
	private LinearLayout linear1234;
	private LinearLayout linear1209;
	private EditText edittext70d;
	private TextView textview1809;
	private EditText edittext69d;
	private TextView textview1801;
	private EditText edittext68d;
	private TextView textview144;
	private Button button8d;
	private EditText edittext66d;
	private TextView textview1820;
	private TextView textview1790;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_d_asphalt_material);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		textview519 = findViewById(R.id.textview519);
		vscroll1 = findViewById(R.id.vscroll1);
		linear39s1 = findViewById(R.id.linear39s1);
		linear713 = findViewById(R.id.linear713);
		linear1258 = findViewById(R.id.linear1258);
		linear389 = findViewById(R.id.linear389);
		textview666ad = findViewById(R.id.textview666ad);
		linear349 = findViewById(R.id.linear349);
		textview986 = findViewById(R.id.textview986);
		linear100s1 = findViewById(R.id.linear100s1);
		textview612 = findViewById(R.id.textview612);
		linear101s1 = findViewById(R.id.linear101s1);
		textview1650 = findViewById(R.id.textview1650);
		linear102s1 = findViewById(R.id.linear102s1);
		linear930 = findViewById(R.id.linear930);
		linear391 = findViewById(R.id.linear391);
		textview281 = findViewById(R.id.textview281);
		linear128 = findViewById(R.id.linear128);
		hscroll8s1 = findViewById(R.id.hscroll8s1);
		textview1084 = findViewById(R.id.textview1084);
		hscroll66s1 = findViewById(R.id.hscroll66s1);
		close = findViewById(R.id.close);
		linear720 = findViewById(R.id.linear720);
		textview18 = findViewById(R.id.textview18);
		element_numsd = findViewById(R.id.element_numsd);
		textview17 = findViewById(R.id.textview17);
		textview16 = findViewById(R.id.textview16);
		element_numd = findViewById(R.id.element_numd);
		textview10 = findViewById(R.id.textview10);
		edittext122d = findViewById(R.id.edittext122d);
		textview987 = findViewById(R.id.textview987);
		textview988 = findViewById(R.id.textview988);
		textview614 = findViewById(R.id.textview614);
		edittext1d = findViewById(R.id.edittext1d);
		textview124 = findViewById(R.id.textview124);
		textview1 = findViewById(R.id.textview1);
		textview58 = findViewById(R.id.textview58);
		edittext2d = findViewById(R.id.edittext2d);
		textview1073 = findViewById(R.id.textview1073);
		textview2d = findViewById(R.id.textview2d);
		textview123 = findViewById(R.id.textview123);
		edittext3d = findViewById(R.id.edittext3d);
		textview403 = findViewById(R.id.textview403);
		textview3d = findViewById(R.id.textview3d);
		button1d = findViewById(R.id.button1d);
		textview145 = findViewById(R.id.textview145);
		edittext4d = findViewById(R.id.edittext4d);
		textview405 = findViewById(R.id.textview405);
		textview4 = findViewById(R.id.textview4);
		textview280 = findViewById(R.id.textview280);
		edittext5d = findViewById(R.id.edittext5d);
		textview355 = findViewById(R.id.textview355);
		textview5 = findViewById(R.id.textview5);
		linear201s1 = findViewById(R.id.linear201s1);
		linear202s1 = findViewById(R.id.linear202s1);
		linear207s1 = findViewById(R.id.linear207s1);
		linear1168 = findViewById(R.id.linear1168);
		linear1175 = findViewById(R.id.linear1175);
		linear1182 = findViewById(R.id.linear1182);
		linear1189 = findViewById(R.id.linear1189);
		linear1196 = findViewById(R.id.linear1196);
		linear1203 = findViewById(R.id.linear1203);
		linear206s1 = findViewById(R.id.linear206s1);
		linear1216 = findViewById(R.id.linear1216);
		linear204s1 = findViewById(R.id.linear204s1);
		linear155 = findViewById(R.id.linear155);
		linear203s1 = findViewById(R.id.linear203s1);
		linear502s1 = findViewById(R.id.linear502s1);
		linear501s1 = findViewById(R.id.linear501s1);
		textview92 = findViewById(R.id.textview92);
		textview91d = findViewById(R.id.textview91d);
		textview90 = findViewById(R.id.textview90);
		textview401 = findViewById(R.id.textview401);
		textview89d = findViewById(R.id.textview89d);
		textview88d = findViewById(R.id.textview88d);
		textview84 = findViewById(R.id.textview84);
		linear507s1 = findViewById(R.id.linear507s1);
		linear1212 = findViewById(R.id.linear1212);
		linear213s1 = findViewById(R.id.linear213s1);
		linear605s1 = findViewById(R.id.linear605s1);
		linear1235 = findViewById(R.id.linear1235);
		linear1228 = findViewById(R.id.linear1228);
		linear506s1 = findViewById(R.id.linear506s1);
		edittext10d = findViewById(R.id.edittext10d);
		textview1802 = findViewById(R.id.textview1802);
		edittext9d = findViewById(R.id.edittext9d);
		textview1795 = findViewById(R.id.textview1795);
		edittext8d = findViewById(R.id.edittext8d);
		NoResult = findViewById(R.id.NoResult);
		button2d = findViewById(R.id.button2d);
		edittext7d = findViewById(R.id.edittext7d);
		textview1822 = findViewById(R.id.textview1822);
		edittext6d = findViewById(R.id.edittext6d);
		textview1813 = findViewById(R.id.textview1813);
		textview402 = findViewById(R.id.textview402);
		linear1169 = findViewById(R.id.linear1169);
		linear1211 = findViewById(R.id.linear1211);
		linear1170 = findViewById(R.id.linear1170);
		linear1239 = findViewById(R.id.linear1239);
		linear1236 = findViewById(R.id.linear1236);
		linear1229 = findViewById(R.id.linear1229);
		linear1174 = findViewById(R.id.linear1174);
		edittext20d = findViewById(R.id.edittext20d);
		textview1803 = findViewById(R.id.textview1803);
		edittext19d = findViewById(R.id.edittext19d);
		textview1796 = findViewById(R.id.textview1796);
		edittext18d = findViewById(R.id.edittext18d);
		d_textview15 = findViewById(R.id.d_textview15);
		button3d = findViewById(R.id.button3d);
		edittext17d = findViewById(R.id.edittext17d);
		textview1823 = findViewById(R.id.textview1823);
		edittext16d = findViewById(R.id.edittext16d);
		textview1814 = findViewById(R.id.textview1814);
		textview1774 = findViewById(R.id.textview1774);
		linear1176 = findViewById(R.id.linear1176);
		linear1218 = findViewById(R.id.linear1218);
		linear1177 = findViewById(R.id.linear1177);
		linear1240 = findViewById(R.id.linear1240);
		linear1237 = findViewById(R.id.linear1237);
		linear1230 = findViewById(R.id.linear1230);
		linear1181 = findViewById(R.id.linear1181);
		edittext30d = findViewById(R.id.edittext30d);
		textview1804 = findViewById(R.id.textview1804);
		edittext29d = findViewById(R.id.edittext29d);
		textview1797 = findViewById(R.id.textview1797);
		edittext28d = findViewById(R.id.edittext28d);
		textview501s1 = findViewById(R.id.textview501s1);
		button4d = findViewById(R.id.button4d);
		edittext27d = findViewById(R.id.edittext27d);
		textview1824 = findViewById(R.id.textview1824);
		edittext26d = findViewById(R.id.edittext26d);
		textview1815 = findViewById(R.id.textview1815);
		textview1777 = findViewById(R.id.textview1777);
		linear1183 = findViewById(R.id.linear1183);
		linear1224 = findViewById(R.id.linear1224);
		linear1184 = findViewById(R.id.linear1184);
		linear1244 = findViewById(R.id.linear1244);
		linear1238 = findViewById(R.id.linear1238);
		linear1231 = findViewById(R.id.linear1231);
		linear1188 = findViewById(R.id.linear1188);
		edittext40d = findViewById(R.id.edittext40d);
		textview1805 = findViewById(R.id.textview1805);
		edittext39d = findViewById(R.id.edittext39d);
		textview1799 = findViewById(R.id.textview1799);
		edittext38d = findViewById(R.id.edittext38d);
		textview1397 = findViewById(R.id.textview1397);
		button5d = findViewById(R.id.button5d);
		edittext37d = findViewById(R.id.edittext37d);
		textview1825 = findViewById(R.id.textview1825);
		edittext36d = findViewById(R.id.edittext36d);
		textview1816 = findViewById(R.id.textview1816);
		textview1780 = findViewById(R.id.textview1780);
		linear1190 = findViewById(R.id.linear1190);
		linear1219 = findViewById(R.id.linear1219);
		linear1191 = findViewById(R.id.linear1191);
		linear1242 = findViewById(R.id.linear1242);
		linear1193 = findViewById(R.id.linear1193);
		linear1232 = findViewById(R.id.linear1232);
		linear1195 = findViewById(R.id.linear1195);
		edittext50d = findViewById(R.id.edittext50d);
		textview1807 = findViewById(R.id.textview1807);
		edittext49d = findViewById(R.id.edittext49d);
		textview1798 = findViewById(R.id.textview1798);
		edittext48d = findViewById(R.id.edittext48d);
		textview1636 = findViewById(R.id.textview1636);
		button6d = findViewById(R.id.button6d);
		edittext46d = findViewById(R.id.edittext46d);
		textview1817 = findViewById(R.id.textview1817);
		textview1783 = findViewById(R.id.textview1783);
		linear1197 = findViewById(R.id.linear1197);
		linear1226 = findViewById(R.id.linear1226);
		linear1198 = findViewById(R.id.linear1198);
		linear1243 = findViewById(R.id.linear1243);
		linear1200 = findViewById(R.id.linear1200);
		linear1233 = findViewById(R.id.linear1233);
		linear1202 = findViewById(R.id.linear1202);
		edittext60d = findViewById(R.id.edittext60d);
		textview1808 = findViewById(R.id.textview1808);
		edittext59d = findViewById(R.id.edittext59d);
		textview1800 = findViewById(R.id.textview1800);
		edittext58d = findViewById(R.id.edittext58d);
		textview1635 = findViewById(R.id.textview1635);
		button7d = findViewById(R.id.button7d);
		edittext56d = findViewById(R.id.edittext56d);
		textview1818 = findViewById(R.id.textview1818);
		textview1786 = findViewById(R.id.textview1786);
		linear1204 = findViewById(R.id.linear1204);
		linear1227 = findViewById(R.id.linear1227);
		linear1205 = findViewById(R.id.linear1205);
		linear1245 = findViewById(R.id.linear1245);
		linear1207 = findViewById(R.id.linear1207);
		linear1234 = findViewById(R.id.linear1234);
		linear1209 = findViewById(R.id.linear1209);
		edittext70d = findViewById(R.id.edittext70d);
		textview1809 = findViewById(R.id.textview1809);
		edittext69d = findViewById(R.id.edittext69d);
		textview1801 = findViewById(R.id.textview1801);
		edittext68d = findViewById(R.id.edittext68d);
		textview144 = findViewById(R.id.textview144);
		button8d = findViewById(R.id.button8d);
		edittext66d = findViewById(R.id.edittext66d);
		textview1820 = findViewById(R.id.textview1820);
		textview1790 = findViewById(R.id.textview1790);
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
			_PrintHelper(getWindow().getDecorView());
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
		WebView webView = new WebView(ToipccDAsphaltMaterialActivity.this);
		webView.loadDataWithBaseURL(null, htmlContent.toString(), "text/html", "UTF-8", null);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageFinished(WebView view, String url) {
				PrintManager printManager = (PrintManager) ToipccDAsphaltMaterialActivity.this.getSystemService(PRINT_SERVICE);
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
