package com.my.iengineer1;

import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.Editable;
import android.text.TextWatcher;
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
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.*;
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.*;
import org.json.*;
import androidx.print.PrintHelper;


public class ToipccAsphaltMaterialActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private String path = "";
	private double temp1 = 0;
	private double temp2 = 0;
	private double temp3 = 0;
	private double temp4 = 0;
	private double temp5 = 0;
	private double temp6 = 0;
	private double temp7 = 0;
	private double temp8 = 0;
	private double temp9 = 0;
	private double temp10 = 0;
	private double temp11 = 0;
	private double temp12 = 0;
	private double temp13 = 0;
	private double temp14 = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview111;
	private LinearLayout linear176;
	private LinearLayout linear39s1;
	private LinearLayout dynamic_all;
	private LinearLayout add_dynamic_element_lin;
	private TextView textview524;
	private TextView textview1768;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear75;
	private LinearLayout lin;
	private LinearLayout linear152;
	private TextView textview1908;
	private TextView textview12;
	private HorizontalScrollView hscroll2;
	private TextView textview554;
	private TextView textview578;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private TextView textview555;
	private TextView textview583;
	private EditText edittext12;
	private TextView textview579;
	private EditText edittext15;
	private TextView textview580;
	private TextView textview585;
	private TextView textview584;
	private Button button9;
	private TextView textview809;
	private LinearLayout linear389;
	private LinearLayout linear1258;
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
	private TextView textview526;
	private TextView textview1084;
	private HorizontalScrollView hscroll66s1;
	private TextView textview18;
	private EditText element_nums;
	private TextView textview17;
	private TextView textview16;
	private EditText element_num;
	private TextView textview10;
	private EditText edittext122;
	private TextView textview987;
	private TextView textview988;
	private TextView textview614;
	private EditText edittext1;
	private TextView textview124;
	private TextView textview1;
	private TextView textview58;
	private EditText edittext2;
	private TextView textview1073;
	private TextView textview2;
	private TextView textview123;
	private EditText edittext3;
	private TextView textview403;
	private TextView textview3;
	private Button button1;
	private TextView textview145;
	private EditText edittext4;
	private TextView textview405;
	private TextView textview4;
	private TextView textview280;
	private EditText edittext5;
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
	private TextView textview91;
	private TextView textview90;
	private TextView textview401;
	private TextView textview89;
	private TextView textview88;
	private TextView textview84;
	private LinearLayout linear507s1;
	private LinearLayout linear1212;
	private LinearLayout linear213s1;
	private LinearLayout linear605s1;
	private LinearLayout linear1235;
	private LinearLayout linear1228;
	private LinearLayout linear506s1;
	private EditText edittext10;
	private TextView textview1802;
	private EditText edittext9;
	private TextView textview1795;
	private EditText edittext8;
	private TextView NoResult;
	private Button button2;
	private EditText edittext7;
	private TextView textview1822;
	private EditText edittext6;
	private TextView textview1813;
	private TextView textview402;
	private LinearLayout linear1169;
	private LinearLayout linear1211;
	private LinearLayout linear1170;
	private LinearLayout linear1239;
	private LinearLayout linear1236;
	private LinearLayout linear1229;
	private LinearLayout linear1174;
	private EditText edittext20;
	private TextView textview1803;
	private EditText edittext19;
	private TextView textview1796;
	private EditText edittext18;
	private TextView d_textview15;
	private Button button3;
	private EditText edittext17;
	private TextView textview1823;
	private EditText edittext16;
	private TextView textview1814;
	private TextView textview1774;
	private LinearLayout linear1176;
	private LinearLayout linear1218;
	private LinearLayout linear1177;
	private LinearLayout linear1240;
	private LinearLayout linear1237;
	private LinearLayout linear1230;
	private LinearLayout linear1181;
	private EditText edittext30;
	private TextView textview1804;
	private EditText edittext29;
	private TextView textview1797;
	private EditText edittext28;
	private TextView textview501s1;
	private Button button4;
	private EditText edittext27;
	private TextView textview1824;
	private EditText edittext26;
	private TextView textview1815;
	private TextView textview1777;
	private LinearLayout linear1183;
	private LinearLayout linear1224;
	private LinearLayout linear1184;
	private LinearLayout linear1244;
	private LinearLayout linear1238;
	private LinearLayout linear1231;
	private LinearLayout linear1188;
	private EditText edittext40;
	private TextView textview1805;
	private EditText edittext39;
	private TextView textview1799;
	private EditText edittext38;
	private TextView textview1397;
	private Button button5;
	private EditText edittext37;
	private TextView textview1825;
	private EditText edittext36;
	private TextView textview1816;
	private TextView textview1780;
	private LinearLayout linear1190;
	private LinearLayout linear1219;
	private LinearLayout linear1191;
	private LinearLayout linear1242;
	private LinearLayout linear1193;
	private LinearLayout linear1232;
	private LinearLayout linear1195;
	private EditText edittext50;
	private TextView textview1807;
	private EditText edittext49;
	private TextView textview1798;
	private EditText edittext48;
	private TextView textview1636;
	private Button button6;
	private EditText edittext46;
	private TextView textview1817;
	private TextView textview1783;
	private LinearLayout linear1197;
	private LinearLayout linear1226;
	private LinearLayout linear1198;
	private LinearLayout linear1243;
	private LinearLayout linear1200;
	private LinearLayout linear1233;
	private LinearLayout linear1202;
	private EditText edittext60;
	private TextView textview1808;
	private EditText edittext59;
	private TextView textview1800;
	private EditText edittext58;
	private TextView textview1635;
	private Button button7;
	private EditText edittext56;
	private TextView textview1818;
	private TextView textview1786;
	private LinearLayout linear1204;
	private LinearLayout linear1227;
	private LinearLayout linear1205;
	private LinearLayout linear1245;
	private LinearLayout linear1207;
	private LinearLayout linear1234;
	private LinearLayout linear1209;
	private EditText edittext70;
	private TextView textview1809;
	private EditText edittext69;
	private TextView textview1801;
	private EditText edittext68;
	private TextView textview144;
	private Button button8;
	private EditText edittext66;
	private TextView textview1820;
	private TextView textview1790;
	private TextView textview1072;
	private Button add_dynamic_element;
	private LinearLayout linear1259;
	private LinearLayout linear1260;
	private LinearLayout linear1261;
	private LinearLayout linear1262;
	private LinearLayout linear1263;
	private LinearLayout linear1264;
	private LinearLayout linear1265;
	private LinearLayout linear1266;
	private LinearLayout linear1267;
	private LinearLayout linear1268;
	private LinearLayout linear1349;
	private LinearLayout linear1269;
	private LinearLayout linear1272;
	private LinearLayout linear2222;
	private LinearLayout linear1336;
	private LinearLayout linear1111;
	private LinearLayout linear1274;
	private TextView textview1829;
	private TextView textview1901;
	private TextView textview1830;
	private TextView textview1833;
	private TextView textview1834;
	private TextView textview1888;
	private TextView textview1877;
	private TextView textview1835;
	private LinearLayout linear1275;
	private LinearLayout linear1348;
	private LinearLayout linear1276;
	private LinearLayout linear1279;
	private LinearLayout linear2223;
	private LinearLayout linear1338;
	private LinearLayout linear1112;
	private LinearLayout linear1281;
	private EditText edittext80;
	private TextView textview1836;
	private EditText edittext79;
	private TextView textview1900;
	private EditText edittext78;
	private TextView textview1837;
	private EditText edittext77;
	private TextView textview1838;
	private EditText edittext76;
	private TextView textview1840;
	private EditText edittext75;
	private TextView textview1890;
	private EditText edittext74;
	private TextView textview1879;
	private TextView textview1841;
	private LinearLayout linear1282;
	private LinearLayout linear1350;
	private LinearLayout linear1283;
	private LinearLayout linear1286;
	private LinearLayout linear2224;
	private LinearLayout linear1339;
	private LinearLayout linear1113;
	private LinearLayout linear1288;
	private EditText edittext90;
	private TextView textview1842;
	private EditText edittext89;
	private TextView textview1902;
	private EditText edittext88;
	private TextView textview1843;
	private EditText edittext87;
	private TextView textview1844;
	private EditText edittext86;
	private TextView textview1846;
	private EditText edittext85;
	private TextView textview1891;
	private EditText edittext84;
	private TextView textview1880;
	private TextView textview1847;
	private LinearLayout linear1289;
	private LinearLayout linear1351;
	private LinearLayout linear1290;
	private LinearLayout linear1293;
	private LinearLayout linear2225;
	private LinearLayout linear1341;
	private LinearLayout linear1114;
	private LinearLayout linear1295;
	private EditText edittext100;
	private TextView textview1848;
	private EditText edittext99;
	private TextView textview1903;
	private EditText edittext98;
	private TextView textview1849;
	private EditText edittext97;
	private TextView textview1850;
	private EditText edittext96;
	private TextView textview1852;
	private EditText edittext95;
	private TextView textview1893;
	private EditText edittext94;
	private TextView textview1881;
	private TextView textview1853;
	private LinearLayout linear1296;
	private LinearLayout linear1352;
	private LinearLayout linear1297;
	private LinearLayout linear1300;
	private LinearLayout linear2226;
	private LinearLayout linear1342;
	private LinearLayout linear1115;
	private LinearLayout linear1302;
	private EditText edittext110;
	private TextView textview1854;
	private EditText edittext109;
	private TextView textview1904;
	private EditText edittext108;
	private TextView textview1855;
	private EditText edittext107;
	private TextView textview1856;
	private EditText edittext106;
	private TextView textview1858;
	private EditText edittext105;
	private TextView textview1894;
	private EditText edittext104;
	private TextView textview1882;
	private TextView textview1859;
	private LinearLayout linear1303;
	private LinearLayout linear1353;
	private LinearLayout linear1304;
	private LinearLayout linear1305;
	private LinearLayout linear2227;
	private LinearLayout linear1347;
	private LinearLayout linear1116;
	private LinearLayout linear1309;
	private EditText edittext120;
	private TextView textview1860;
	private EditText edittext119;
	private TextView textview1905;
	private EditText edittext118;
	private TextView textview1861;
	private EditText edittext117;
	private TextView textview1862;
	private EditText edittext116;
	private TextView textview1863;
	private EditText edittext115;
	private TextView textview1899;
	private EditText edittext114;
	private TextView textview1884;
	private TextView textview1864;
	private LinearLayout linear1310;
	private LinearLayout linear1354;
	private LinearLayout linear1311;
	private LinearLayout linear1312;
	private LinearLayout linear2228;
	private LinearLayout linear1346;
	private LinearLayout linear1117;
	private LinearLayout linear1316;
	private EditText edittext130;
	private TextView textview1865;
	private EditText edittext129;
	private TextView textview1906;
	private EditText edittext128;
	private TextView textview1866;
	private EditText edittext127;
	private TextView textview1867;
	private EditText edittext126;
	private TextView textview1868;
	private EditText edittext125;
	private TextView textview1898;
	private EditText edittext124;
	private TextView textview1886;
	private TextView textview1869;
	private LinearLayout linear1317;
	private LinearLayout linear1355;
	private LinearLayout linear1318;
	private LinearLayout linear1319;
	private LinearLayout linear2229;
	private LinearLayout linear1345;
	private LinearLayout linear1118;
	private LinearLayout linear1323;
	private EditText edittext140;
	private TextView textview1870;
	private EditText edittext139;
	private TextView textview1907;
	private EditText edittext138;
	private TextView textview1871;
	private EditText edittext137;
	private TextView textview1872;
	private EditText edittext136;
	private TextView textview1873;
	private EditText edittext135;
	private TextView textview1897;
	private EditText edittext134;
	private TextView textview1887;
	private TextView textview1874;
	private TextView textview527;
	private EditText edittext149;
	private TextView textview321;
	private TextView textview114;
	private TextView textview629;
	private EditText edittext150;
	private TextView textview630;
	private TextView textview631;
	private LinearLayout linear2230;
	private LinearLayout linear2231;
	private LinearLayout linear2232;
	private LinearLayout linear2233;
	private LinearLayout linear2234;
	private LinearLayout linear2235;
	private LinearLayout linear2236;
	private LinearLayout linear2237;
	private LinearLayout linear2238;
	private LinearLayout linear2239;
	private LinearLayout linear2240;
	private LinearLayout linear2242;
	private LinearLayout linear2244;
	private LinearLayout linear2245;
	private LinearLayout linear2246;
	private TextView textview1909;
	private TextView textview1910;
	private TextView textview1912;
	private TextView textview1914;
	private TextView textview1915;
	private TextView textview1916;
	private LinearLayout linear2247;
	private LinearLayout linear2248;
	private LinearLayout linear2250;
	private LinearLayout linear2252;
	private LinearLayout linear2253;
	private LinearLayout linear2254;
	private EditText edittext159;
	private TextView textview1917;
	private EditText edittext158;
	private TextView textview1918;
	private EditText edittext157;
	private TextView textview1920;
	private EditText edittext155;
	private TextView textview1922;
	private EditText edittext153;
	private TextView textview1923;
	private TextView textview1924;
	private LinearLayout linear2255;
	private LinearLayout linear2256;
	private LinearLayout linear2258;
	private LinearLayout linear2260;
	private LinearLayout linear2261;
	private LinearLayout linear2262;
	private EditText edittext169;
	private TextView textview1925;
	private EditText edittext168;
	private TextView textview1926;
	private EditText edittext167;
	private TextView textview1928;
	private EditText edittext165;
	private TextView textview1930;
	private EditText edittext163;
	private TextView textview1931;
	private TextView textview1932;
	private LinearLayout linear2263;
	private LinearLayout linear2264;
	private LinearLayout linear2266;
	private LinearLayout linear2268;
	private LinearLayout linear2269;
	private LinearLayout linear2270;
	private EditText edittext179;
	private TextView textview1933;
	private EditText edittext178;
	private TextView textview1934;
	private EditText edittext177;
	private TextView textview1936;
	private EditText edittext175;
	private TextView textview1938;
	private EditText edittext173;
	private TextView textview1939;
	private TextView textview1940;
	private LinearLayout linear2271;
	private LinearLayout linear2272;
	private LinearLayout linear2274;
	private LinearLayout linear2276;
	private LinearLayout linear2277;
	private LinearLayout linear2278;
	private EditText edittext189;
	private TextView textview1941;
	private EditText edittext188;
	private TextView textview1942;
	private EditText edittext187;
	private TextView textview1944;
	private EditText edittext185;
	private TextView textview1946;
	private EditText edittext183;
	private TextView textview1947;
	private TextView textview1948;
	private LinearLayout linear2279;
	private LinearLayout linear2280;
	private LinearLayout linear2282;
	private LinearLayout linear2284;
	private LinearLayout linear2285;
	private LinearLayout linear2286;
	private EditText edittext199;
	private TextView textview1949;
	private EditText edittext198;
	private TextView textview1950;
	private EditText edittext197;
	private TextView textview1952;
	private EditText edittext195;
	private TextView textview1954;
	private EditText edittext193;
	private TextView textview1955;
	private TextView textview1956;
	private LinearLayout linear2287;
	private LinearLayout linear2288;
	private LinearLayout linear2290;
	private LinearLayout linear2292;
	private LinearLayout linear2293;
	private LinearLayout linear2294;
	private EditText edittext209;
	private TextView textview1957;
	private EditText edittext208;
	private TextView textview1958;
	private EditText edittext207;
	private TextView textview1960;
	private EditText edittext205;
	private TextView textview1962;
	private EditText edittext203;
	private TextView textview1963;
	private TextView textview1964;
	private LinearLayout linear2295;
	private LinearLayout linear2296;
	private LinearLayout linear2298;
	private LinearLayout linear2300;
	private LinearLayout linear2301;
	private LinearLayout linear2302;
	private EditText edittext219;
	private TextView textview1965;
	private EditText edittext218;
	private TextView textview1966;
	private EditText edittext217;
	private TextView textview1968;
	private EditText edittext215;
	private TextView textview1970;
	private EditText edittext213;
	private TextView textview1971;
	private TextView textview1972;
	private AlertDialog.Builder dialog;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_asphalt_material);
		initialize(_savedInstanceState);
		
		
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_fab = findViewById(R.id._fab);
		
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		textview111 = findViewById(R.id.textview111);
		linear176 = findViewById(R.id.linear176);
		linear39s1 = findViewById(R.id.linear39s1);
		dynamic_all = findViewById(R.id.dynamic_all);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		textview524 = findViewById(R.id.textview524);
		textview1768 = findViewById(R.id.textview1768);
		hscroll1 = findViewById(R.id.hscroll1);
		linear75 = findViewById(R.id.linear75);
		lin = findViewById(R.id.lin);
		linear152 = findViewById(R.id.linear152);
		textview1908 = findViewById(R.id.textview1908);
		textview12 = findViewById(R.id.textview12);
		hscroll2 = findViewById(R.id.hscroll2);
		textview554 = findViewById(R.id.textview554);
		textview578 = findViewById(R.id.textview578);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		textview583 = findViewById(R.id.textview583);
		edittext12 = findViewById(R.id.edittext12);
		textview579 = findViewById(R.id.textview579);
		edittext15 = findViewById(R.id.edittext15);
		textview580 = findViewById(R.id.textview580);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		button9 = findViewById(R.id.button9);
		textview809 = findViewById(R.id.textview809);
		linear389 = findViewById(R.id.linear389);
		linear1258 = findViewById(R.id.linear1258);
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
		textview526 = findViewById(R.id.textview526);
		textview1084 = findViewById(R.id.textview1084);
		hscroll66s1 = findViewById(R.id.hscroll66s1);
		textview18 = findViewById(R.id.textview18);
		element_nums = findViewById(R.id.element_nums);
		textview17 = findViewById(R.id.textview17);
		textview16 = findViewById(R.id.textview16);
		element_num = findViewById(R.id.element_num);
		textview10 = findViewById(R.id.textview10);
		edittext122 = findViewById(R.id.edittext122);
		textview987 = findViewById(R.id.textview987);
		textview988 = findViewById(R.id.textview988);
		textview614 = findViewById(R.id.textview614);
		edittext1 = findViewById(R.id.edittext1);
		textview124 = findViewById(R.id.textview124);
		textview1 = findViewById(R.id.textview1);
		textview58 = findViewById(R.id.textview58);
		edittext2 = findViewById(R.id.edittext2);
		textview1073 = findViewById(R.id.textview1073);
		textview2 = findViewById(R.id.textview2);
		textview123 = findViewById(R.id.textview123);
		edittext3 = findViewById(R.id.edittext3);
		textview403 = findViewById(R.id.textview403);
		textview3 = findViewById(R.id.textview3);
		button1 = findViewById(R.id.button1);
		textview145 = findViewById(R.id.textview145);
		edittext4 = findViewById(R.id.edittext4);
		textview405 = findViewById(R.id.textview405);
		textview4 = findViewById(R.id.textview4);
		textview280 = findViewById(R.id.textview280);
		edittext5 = findViewById(R.id.edittext5);
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
		textview91 = findViewById(R.id.textview91);
		textview90 = findViewById(R.id.textview90);
		textview401 = findViewById(R.id.textview401);
		textview89 = findViewById(R.id.textview89);
		textview88 = findViewById(R.id.textview88);
		textview84 = findViewById(R.id.textview84);
		linear507s1 = findViewById(R.id.linear507s1);
		linear1212 = findViewById(R.id.linear1212);
		linear213s1 = findViewById(R.id.linear213s1);
		linear605s1 = findViewById(R.id.linear605s1);
		linear1235 = findViewById(R.id.linear1235);
		linear1228 = findViewById(R.id.linear1228);
		linear506s1 = findViewById(R.id.linear506s1);
		edittext10 = findViewById(R.id.edittext10);
		textview1802 = findViewById(R.id.textview1802);
		edittext9 = findViewById(R.id.edittext9);
		textview1795 = findViewById(R.id.textview1795);
		edittext8 = findViewById(R.id.edittext8);
		NoResult = findViewById(R.id.NoResult);
		button2 = findViewById(R.id.button2);
		edittext7 = findViewById(R.id.edittext7);
		textview1822 = findViewById(R.id.textview1822);
		edittext6 = findViewById(R.id.edittext6);
		textview1813 = findViewById(R.id.textview1813);
		textview402 = findViewById(R.id.textview402);
		linear1169 = findViewById(R.id.linear1169);
		linear1211 = findViewById(R.id.linear1211);
		linear1170 = findViewById(R.id.linear1170);
		linear1239 = findViewById(R.id.linear1239);
		linear1236 = findViewById(R.id.linear1236);
		linear1229 = findViewById(R.id.linear1229);
		linear1174 = findViewById(R.id.linear1174);
		edittext20 = findViewById(R.id.edittext20);
		textview1803 = findViewById(R.id.textview1803);
		edittext19 = findViewById(R.id.edittext19);
		textview1796 = findViewById(R.id.textview1796);
		edittext18 = findViewById(R.id.edittext18);
		d_textview15 = findViewById(R.id.d_textview15);
		button3 = findViewById(R.id.button3);
		edittext17 = findViewById(R.id.edittext17);
		textview1823 = findViewById(R.id.textview1823);
		edittext16 = findViewById(R.id.edittext16);
		textview1814 = findViewById(R.id.textview1814);
		textview1774 = findViewById(R.id.textview1774);
		linear1176 = findViewById(R.id.linear1176);
		linear1218 = findViewById(R.id.linear1218);
		linear1177 = findViewById(R.id.linear1177);
		linear1240 = findViewById(R.id.linear1240);
		linear1237 = findViewById(R.id.linear1237);
		linear1230 = findViewById(R.id.linear1230);
		linear1181 = findViewById(R.id.linear1181);
		edittext30 = findViewById(R.id.edittext30);
		textview1804 = findViewById(R.id.textview1804);
		edittext29 = findViewById(R.id.edittext29);
		textview1797 = findViewById(R.id.textview1797);
		edittext28 = findViewById(R.id.edittext28);
		textview501s1 = findViewById(R.id.textview501s1);
		button4 = findViewById(R.id.button4);
		edittext27 = findViewById(R.id.edittext27);
		textview1824 = findViewById(R.id.textview1824);
		edittext26 = findViewById(R.id.edittext26);
		textview1815 = findViewById(R.id.textview1815);
		textview1777 = findViewById(R.id.textview1777);
		linear1183 = findViewById(R.id.linear1183);
		linear1224 = findViewById(R.id.linear1224);
		linear1184 = findViewById(R.id.linear1184);
		linear1244 = findViewById(R.id.linear1244);
		linear1238 = findViewById(R.id.linear1238);
		linear1231 = findViewById(R.id.linear1231);
		linear1188 = findViewById(R.id.linear1188);
		edittext40 = findViewById(R.id.edittext40);
		textview1805 = findViewById(R.id.textview1805);
		edittext39 = findViewById(R.id.edittext39);
		textview1799 = findViewById(R.id.textview1799);
		edittext38 = findViewById(R.id.edittext38);
		textview1397 = findViewById(R.id.textview1397);
		button5 = findViewById(R.id.button5);
		edittext37 = findViewById(R.id.edittext37);
		textview1825 = findViewById(R.id.textview1825);
		edittext36 = findViewById(R.id.edittext36);
		textview1816 = findViewById(R.id.textview1816);
		textview1780 = findViewById(R.id.textview1780);
		linear1190 = findViewById(R.id.linear1190);
		linear1219 = findViewById(R.id.linear1219);
		linear1191 = findViewById(R.id.linear1191);
		linear1242 = findViewById(R.id.linear1242);
		linear1193 = findViewById(R.id.linear1193);
		linear1232 = findViewById(R.id.linear1232);
		linear1195 = findViewById(R.id.linear1195);
		edittext50 = findViewById(R.id.edittext50);
		textview1807 = findViewById(R.id.textview1807);
		edittext49 = findViewById(R.id.edittext49);
		textview1798 = findViewById(R.id.textview1798);
		edittext48 = findViewById(R.id.edittext48);
		textview1636 = findViewById(R.id.textview1636);
		button6 = findViewById(R.id.button6);
		edittext46 = findViewById(R.id.edittext46);
		textview1817 = findViewById(R.id.textview1817);
		textview1783 = findViewById(R.id.textview1783);
		linear1197 = findViewById(R.id.linear1197);
		linear1226 = findViewById(R.id.linear1226);
		linear1198 = findViewById(R.id.linear1198);
		linear1243 = findViewById(R.id.linear1243);
		linear1200 = findViewById(R.id.linear1200);
		linear1233 = findViewById(R.id.linear1233);
		linear1202 = findViewById(R.id.linear1202);
		edittext60 = findViewById(R.id.edittext60);
		textview1808 = findViewById(R.id.textview1808);
		edittext59 = findViewById(R.id.edittext59);
		textview1800 = findViewById(R.id.textview1800);
		edittext58 = findViewById(R.id.edittext58);
		textview1635 = findViewById(R.id.textview1635);
		button7 = findViewById(R.id.button7);
		edittext56 = findViewById(R.id.edittext56);
		textview1818 = findViewById(R.id.textview1818);
		textview1786 = findViewById(R.id.textview1786);
		linear1204 = findViewById(R.id.linear1204);
		linear1227 = findViewById(R.id.linear1227);
		linear1205 = findViewById(R.id.linear1205);
		linear1245 = findViewById(R.id.linear1245);
		linear1207 = findViewById(R.id.linear1207);
		linear1234 = findViewById(R.id.linear1234);
		linear1209 = findViewById(R.id.linear1209);
		edittext70 = findViewById(R.id.edittext70);
		textview1809 = findViewById(R.id.textview1809);
		edittext69 = findViewById(R.id.edittext69);
		textview1801 = findViewById(R.id.textview1801);
		edittext68 = findViewById(R.id.edittext68);
		textview144 = findViewById(R.id.textview144);
		button8 = findViewById(R.id.button8);
		edittext66 = findViewById(R.id.edittext66);
		textview1820 = findViewById(R.id.textview1820);
		textview1790 = findViewById(R.id.textview1790);
		textview1072 = findViewById(R.id.textview1072);
		add_dynamic_element = findViewById(R.id.add_dynamic_element);
		linear1259 = findViewById(R.id.linear1259);
		linear1260 = findViewById(R.id.linear1260);
		linear1261 = findViewById(R.id.linear1261);
		linear1262 = findViewById(R.id.linear1262);
		linear1263 = findViewById(R.id.linear1263);
		linear1264 = findViewById(R.id.linear1264);
		linear1265 = findViewById(R.id.linear1265);
		linear1266 = findViewById(R.id.linear1266);
		linear1267 = findViewById(R.id.linear1267);
		linear1268 = findViewById(R.id.linear1268);
		linear1349 = findViewById(R.id.linear1349);
		linear1269 = findViewById(R.id.linear1269);
		linear1272 = findViewById(R.id.linear1272);
		linear2222 = findViewById(R.id.linear2222);
		linear1336 = findViewById(R.id.linear1336);
		linear1111 = findViewById(R.id.linear1111);
		linear1274 = findViewById(R.id.linear1274);
		textview1829 = findViewById(R.id.textview1829);
		textview1901 = findViewById(R.id.textview1901);
		textview1830 = findViewById(R.id.textview1830);
		textview1833 = findViewById(R.id.textview1833);
		textview1834 = findViewById(R.id.textview1834);
		textview1888 = findViewById(R.id.textview1888);
		textview1877 = findViewById(R.id.textview1877);
		textview1835 = findViewById(R.id.textview1835);
		linear1275 = findViewById(R.id.linear1275);
		linear1348 = findViewById(R.id.linear1348);
		linear1276 = findViewById(R.id.linear1276);
		linear1279 = findViewById(R.id.linear1279);
		linear2223 = findViewById(R.id.linear2223);
		linear1338 = findViewById(R.id.linear1338);
		linear1112 = findViewById(R.id.linear1112);
		linear1281 = findViewById(R.id.linear1281);
		edittext80 = findViewById(R.id.edittext80);
		textview1836 = findViewById(R.id.textview1836);
		edittext79 = findViewById(R.id.edittext79);
		textview1900 = findViewById(R.id.textview1900);
		edittext78 = findViewById(R.id.edittext78);
		textview1837 = findViewById(R.id.textview1837);
		edittext77 = findViewById(R.id.edittext77);
		textview1838 = findViewById(R.id.textview1838);
		edittext76 = findViewById(R.id.edittext76);
		textview1840 = findViewById(R.id.textview1840);
		edittext75 = findViewById(R.id.edittext75);
		textview1890 = findViewById(R.id.textview1890);
		edittext74 = findViewById(R.id.edittext74);
		textview1879 = findViewById(R.id.textview1879);
		textview1841 = findViewById(R.id.textview1841);
		linear1282 = findViewById(R.id.linear1282);
		linear1350 = findViewById(R.id.linear1350);
		linear1283 = findViewById(R.id.linear1283);
		linear1286 = findViewById(R.id.linear1286);
		linear2224 = findViewById(R.id.linear2224);
		linear1339 = findViewById(R.id.linear1339);
		linear1113 = findViewById(R.id.linear1113);
		linear1288 = findViewById(R.id.linear1288);
		edittext90 = findViewById(R.id.edittext90);
		textview1842 = findViewById(R.id.textview1842);
		edittext89 = findViewById(R.id.edittext89);
		textview1902 = findViewById(R.id.textview1902);
		edittext88 = findViewById(R.id.edittext88);
		textview1843 = findViewById(R.id.textview1843);
		edittext87 = findViewById(R.id.edittext87);
		textview1844 = findViewById(R.id.textview1844);
		edittext86 = findViewById(R.id.edittext86);
		textview1846 = findViewById(R.id.textview1846);
		edittext85 = findViewById(R.id.edittext85);
		textview1891 = findViewById(R.id.textview1891);
		edittext84 = findViewById(R.id.edittext84);
		textview1880 = findViewById(R.id.textview1880);
		textview1847 = findViewById(R.id.textview1847);
		linear1289 = findViewById(R.id.linear1289);
		linear1351 = findViewById(R.id.linear1351);
		linear1290 = findViewById(R.id.linear1290);
		linear1293 = findViewById(R.id.linear1293);
		linear2225 = findViewById(R.id.linear2225);
		linear1341 = findViewById(R.id.linear1341);
		linear1114 = findViewById(R.id.linear1114);
		linear1295 = findViewById(R.id.linear1295);
		edittext100 = findViewById(R.id.edittext100);
		textview1848 = findViewById(R.id.textview1848);
		edittext99 = findViewById(R.id.edittext99);
		textview1903 = findViewById(R.id.textview1903);
		edittext98 = findViewById(R.id.edittext98);
		textview1849 = findViewById(R.id.textview1849);
		edittext97 = findViewById(R.id.edittext97);
		textview1850 = findViewById(R.id.textview1850);
		edittext96 = findViewById(R.id.edittext96);
		textview1852 = findViewById(R.id.textview1852);
		edittext95 = findViewById(R.id.edittext95);
		textview1893 = findViewById(R.id.textview1893);
		edittext94 = findViewById(R.id.edittext94);
		textview1881 = findViewById(R.id.textview1881);
		textview1853 = findViewById(R.id.textview1853);
		linear1296 = findViewById(R.id.linear1296);
		linear1352 = findViewById(R.id.linear1352);
		linear1297 = findViewById(R.id.linear1297);
		linear1300 = findViewById(R.id.linear1300);
		linear2226 = findViewById(R.id.linear2226);
		linear1342 = findViewById(R.id.linear1342);
		linear1115 = findViewById(R.id.linear1115);
		linear1302 = findViewById(R.id.linear1302);
		edittext110 = findViewById(R.id.edittext110);
		textview1854 = findViewById(R.id.textview1854);
		edittext109 = findViewById(R.id.edittext109);
		textview1904 = findViewById(R.id.textview1904);
		edittext108 = findViewById(R.id.edittext108);
		textview1855 = findViewById(R.id.textview1855);
		edittext107 = findViewById(R.id.edittext107);
		textview1856 = findViewById(R.id.textview1856);
		edittext106 = findViewById(R.id.edittext106);
		textview1858 = findViewById(R.id.textview1858);
		edittext105 = findViewById(R.id.edittext105);
		textview1894 = findViewById(R.id.textview1894);
		edittext104 = findViewById(R.id.edittext104);
		textview1882 = findViewById(R.id.textview1882);
		textview1859 = findViewById(R.id.textview1859);
		linear1303 = findViewById(R.id.linear1303);
		linear1353 = findViewById(R.id.linear1353);
		linear1304 = findViewById(R.id.linear1304);
		linear1305 = findViewById(R.id.linear1305);
		linear2227 = findViewById(R.id.linear2227);
		linear1347 = findViewById(R.id.linear1347);
		linear1116 = findViewById(R.id.linear1116);
		linear1309 = findViewById(R.id.linear1309);
		edittext120 = findViewById(R.id.edittext120);
		textview1860 = findViewById(R.id.textview1860);
		edittext119 = findViewById(R.id.edittext119);
		textview1905 = findViewById(R.id.textview1905);
		edittext118 = findViewById(R.id.edittext118);
		textview1861 = findViewById(R.id.textview1861);
		edittext117 = findViewById(R.id.edittext117);
		textview1862 = findViewById(R.id.textview1862);
		edittext116 = findViewById(R.id.edittext116);
		textview1863 = findViewById(R.id.textview1863);
		edittext115 = findViewById(R.id.edittext115);
		textview1899 = findViewById(R.id.textview1899);
		edittext114 = findViewById(R.id.edittext114);
		textview1884 = findViewById(R.id.textview1884);
		textview1864 = findViewById(R.id.textview1864);
		linear1310 = findViewById(R.id.linear1310);
		linear1354 = findViewById(R.id.linear1354);
		linear1311 = findViewById(R.id.linear1311);
		linear1312 = findViewById(R.id.linear1312);
		linear2228 = findViewById(R.id.linear2228);
		linear1346 = findViewById(R.id.linear1346);
		linear1117 = findViewById(R.id.linear1117);
		linear1316 = findViewById(R.id.linear1316);
		edittext130 = findViewById(R.id.edittext130);
		textview1865 = findViewById(R.id.textview1865);
		edittext129 = findViewById(R.id.edittext129);
		textview1906 = findViewById(R.id.textview1906);
		edittext128 = findViewById(R.id.edittext128);
		textview1866 = findViewById(R.id.textview1866);
		edittext127 = findViewById(R.id.edittext127);
		textview1867 = findViewById(R.id.textview1867);
		edittext126 = findViewById(R.id.edittext126);
		textview1868 = findViewById(R.id.textview1868);
		edittext125 = findViewById(R.id.edittext125);
		textview1898 = findViewById(R.id.textview1898);
		edittext124 = findViewById(R.id.edittext124);
		textview1886 = findViewById(R.id.textview1886);
		textview1869 = findViewById(R.id.textview1869);
		linear1317 = findViewById(R.id.linear1317);
		linear1355 = findViewById(R.id.linear1355);
		linear1318 = findViewById(R.id.linear1318);
		linear1319 = findViewById(R.id.linear1319);
		linear2229 = findViewById(R.id.linear2229);
		linear1345 = findViewById(R.id.linear1345);
		linear1118 = findViewById(R.id.linear1118);
		linear1323 = findViewById(R.id.linear1323);
		edittext140 = findViewById(R.id.edittext140);
		textview1870 = findViewById(R.id.textview1870);
		edittext139 = findViewById(R.id.edittext139);
		textview1907 = findViewById(R.id.textview1907);
		edittext138 = findViewById(R.id.edittext138);
		textview1871 = findViewById(R.id.textview1871);
		edittext137 = findViewById(R.id.edittext137);
		textview1872 = findViewById(R.id.textview1872);
		edittext136 = findViewById(R.id.edittext136);
		textview1873 = findViewById(R.id.textview1873);
		edittext135 = findViewById(R.id.edittext135);
		textview1897 = findViewById(R.id.textview1897);
		edittext134 = findViewById(R.id.edittext134);
		textview1887 = findViewById(R.id.textview1887);
		textview1874 = findViewById(R.id.textview1874);
		textview527 = findViewById(R.id.textview527);
		edittext149 = findViewById(R.id.edittext149);
		textview321 = findViewById(R.id.textview321);
		textview114 = findViewById(R.id.textview114);
		textview629 = findViewById(R.id.textview629);
		edittext150 = findViewById(R.id.edittext150);
		textview630 = findViewById(R.id.textview630);
		textview631 = findViewById(R.id.textview631);
		linear2230 = findViewById(R.id.linear2230);
		linear2231 = findViewById(R.id.linear2231);
		linear2232 = findViewById(R.id.linear2232);
		linear2233 = findViewById(R.id.linear2233);
		linear2234 = findViewById(R.id.linear2234);
		linear2235 = findViewById(R.id.linear2235);
		linear2236 = findViewById(R.id.linear2236);
		linear2237 = findViewById(R.id.linear2237);
		linear2238 = findViewById(R.id.linear2238);
		linear2239 = findViewById(R.id.linear2239);
		linear2240 = findViewById(R.id.linear2240);
		linear2242 = findViewById(R.id.linear2242);
		linear2244 = findViewById(R.id.linear2244);
		linear2245 = findViewById(R.id.linear2245);
		linear2246 = findViewById(R.id.linear2246);
		textview1909 = findViewById(R.id.textview1909);
		textview1910 = findViewById(R.id.textview1910);
		textview1912 = findViewById(R.id.textview1912);
		textview1914 = findViewById(R.id.textview1914);
		textview1915 = findViewById(R.id.textview1915);
		textview1916 = findViewById(R.id.textview1916);
		linear2247 = findViewById(R.id.linear2247);
		linear2248 = findViewById(R.id.linear2248);
		linear2250 = findViewById(R.id.linear2250);
		linear2252 = findViewById(R.id.linear2252);
		linear2253 = findViewById(R.id.linear2253);
		linear2254 = findViewById(R.id.linear2254);
		edittext159 = findViewById(R.id.edittext159);
		textview1917 = findViewById(R.id.textview1917);
		edittext158 = findViewById(R.id.edittext158);
		textview1918 = findViewById(R.id.textview1918);
		edittext157 = findViewById(R.id.edittext157);
		textview1920 = findViewById(R.id.textview1920);
		edittext155 = findViewById(R.id.edittext155);
		textview1922 = findViewById(R.id.textview1922);
		edittext153 = findViewById(R.id.edittext153);
		textview1923 = findViewById(R.id.textview1923);
		textview1924 = findViewById(R.id.textview1924);
		linear2255 = findViewById(R.id.linear2255);
		linear2256 = findViewById(R.id.linear2256);
		linear2258 = findViewById(R.id.linear2258);
		linear2260 = findViewById(R.id.linear2260);
		linear2261 = findViewById(R.id.linear2261);
		linear2262 = findViewById(R.id.linear2262);
		edittext169 = findViewById(R.id.edittext169);
		textview1925 = findViewById(R.id.textview1925);
		edittext168 = findViewById(R.id.edittext168);
		textview1926 = findViewById(R.id.textview1926);
		edittext167 = findViewById(R.id.edittext167);
		textview1928 = findViewById(R.id.textview1928);
		edittext165 = findViewById(R.id.edittext165);
		textview1930 = findViewById(R.id.textview1930);
		edittext163 = findViewById(R.id.edittext163);
		textview1931 = findViewById(R.id.textview1931);
		textview1932 = findViewById(R.id.textview1932);
		linear2263 = findViewById(R.id.linear2263);
		linear2264 = findViewById(R.id.linear2264);
		linear2266 = findViewById(R.id.linear2266);
		linear2268 = findViewById(R.id.linear2268);
		linear2269 = findViewById(R.id.linear2269);
		linear2270 = findViewById(R.id.linear2270);
		edittext179 = findViewById(R.id.edittext179);
		textview1933 = findViewById(R.id.textview1933);
		edittext178 = findViewById(R.id.edittext178);
		textview1934 = findViewById(R.id.textview1934);
		edittext177 = findViewById(R.id.edittext177);
		textview1936 = findViewById(R.id.textview1936);
		edittext175 = findViewById(R.id.edittext175);
		textview1938 = findViewById(R.id.textview1938);
		edittext173 = findViewById(R.id.edittext173);
		textview1939 = findViewById(R.id.textview1939);
		textview1940 = findViewById(R.id.textview1940);
		linear2271 = findViewById(R.id.linear2271);
		linear2272 = findViewById(R.id.linear2272);
		linear2274 = findViewById(R.id.linear2274);
		linear2276 = findViewById(R.id.linear2276);
		linear2277 = findViewById(R.id.linear2277);
		linear2278 = findViewById(R.id.linear2278);
		edittext189 = findViewById(R.id.edittext189);
		textview1941 = findViewById(R.id.textview1941);
		edittext188 = findViewById(R.id.edittext188);
		textview1942 = findViewById(R.id.textview1942);
		edittext187 = findViewById(R.id.edittext187);
		textview1944 = findViewById(R.id.textview1944);
		edittext185 = findViewById(R.id.edittext185);
		textview1946 = findViewById(R.id.textview1946);
		edittext183 = findViewById(R.id.edittext183);
		textview1947 = findViewById(R.id.textview1947);
		textview1948 = findViewById(R.id.textview1948);
		linear2279 = findViewById(R.id.linear2279);
		linear2280 = findViewById(R.id.linear2280);
		linear2282 = findViewById(R.id.linear2282);
		linear2284 = findViewById(R.id.linear2284);
		linear2285 = findViewById(R.id.linear2285);
		linear2286 = findViewById(R.id.linear2286);
		edittext199 = findViewById(R.id.edittext199);
		textview1949 = findViewById(R.id.textview1949);
		edittext198 = findViewById(R.id.edittext198);
		textview1950 = findViewById(R.id.textview1950);
		edittext197 = findViewById(R.id.edittext197);
		textview1952 = findViewById(R.id.textview1952);
		edittext195 = findViewById(R.id.edittext195);
		textview1954 = findViewById(R.id.textview1954);
		edittext193 = findViewById(R.id.edittext193);
		textview1955 = findViewById(R.id.textview1955);
		textview1956 = findViewById(R.id.textview1956);
		linear2287 = findViewById(R.id.linear2287);
		linear2288 = findViewById(R.id.linear2288);
		linear2290 = findViewById(R.id.linear2290);
		linear2292 = findViewById(R.id.linear2292);
		linear2293 = findViewById(R.id.linear2293);
		linear2294 = findViewById(R.id.linear2294);
		edittext209 = findViewById(R.id.edittext209);
		textview1957 = findViewById(R.id.textview1957);
		edittext208 = findViewById(R.id.edittext208);
		textview1958 = findViewById(R.id.textview1958);
		edittext207 = findViewById(R.id.edittext207);
		textview1960 = findViewById(R.id.textview1960);
		edittext205 = findViewById(R.id.edittext205);
		textview1962 = findViewById(R.id.textview1962);
		edittext203 = findViewById(R.id.edittext203);
		textview1963 = findViewById(R.id.textview1963);
		textview1964 = findViewById(R.id.textview1964);
		linear2295 = findViewById(R.id.linear2295);
		linear2296 = findViewById(R.id.linear2296);
		linear2298 = findViewById(R.id.linear2298);
		linear2300 = findViewById(R.id.linear2300);
		linear2301 = findViewById(R.id.linear2301);
		linear2302 = findViewById(R.id.linear2302);
		edittext219 = findViewById(R.id.edittext219);
		textview1965 = findViewById(R.id.textview1965);
		edittext218 = findViewById(R.id.edittext218);
		textview1966 = findViewById(R.id.textview1966);
		edittext217 = findViewById(R.id.edittext217);
		textview1968 = findViewById(R.id.textview1968);
		edittext215 = findViewById(R.id.edittext215);
		textview1970 = findViewById(R.id.textview1970);
		edittext213 = findViewById(R.id.edittext213);
		textview1971 = findViewById(R.id.textview1971);
		textview1972 = findViewById(R.id.textview1972);
		dialog = new AlertDialog.Builder(this);
		
		//ScrollChange2
		vscroll1.setOnScrollChangeListener(new ScrollView.OnScrollChangeListener() {
			@Override
			public void onScrollChange(View v, int _scrollX, int _scrollY, int _oldScrollX, int _oldScrollY) {
				
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		element_num.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					element_nums.setText("");
				}
				else {
					element_nums.setText(_charSeq);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext122.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview988.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext4.setText(String.valueOf(00.00));
				edittext5.setText(String.valueOf(00.00));
				edittext4.setTextColor(0xFFE91E63);
				edittext5.setTextColor(0xFFE91E63);
				edittext68.setText(String.valueOf(00.00));
				edittext68.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				
				return true;
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext2.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext4.setText(String.valueOf(00.00));
				edittext4.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview2.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* كثافة الخلطة\n(طن / م٣ )");
				dialog.setMessage("\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٢.٣٤ طن / م٣ \"");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		
		edittext3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext5.setText(String.valueOf(00.00));
				edittext5.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview3.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* كثافة البيتومين بالخلطة\n( طن / م٣ )");
				dialog.setMessage("\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٠٥ طن/م٣ \"");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					if ((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) {
						SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
					}
					else {
						if ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) {
							edittext2.setText(String.valueOf(2.34d));
						}
						if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
							edittext3.setText(String.valueOf(0.05d));
						}
						edittext4.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) / Double.parseDouble(edittext2.getText().toString())));
						edittext5.setText(String.valueOf((1 - Double.parseDouble(edittext3.getText().toString())) * Double.parseDouble(edittext1.getText().toString())));
						edittext4.setTextColor(0xFF000000);
						edittext5.setTextColor(0xFF000000);
					}
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext4.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext5.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext5.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext8.setText(String.valueOf(00.00));
				edittext8.setTextColor(0xFFE91E63);
				edittext18.setText(String.valueOf(00.00));
				edittext18.setTextColor(0xFFE91E63);
				edittext28.setText(String.valueOf(00.00));
				edittext28.setTextColor(0xFFE91E63);
				edittext38.setText(String.valueOf(00.00));
				edittext38.setTextColor(0xFFE91E63);
				edittext48.setText(String.valueOf(00.00));
				edittext48.setTextColor(0xFFE91E63);
				edittext58.setText(String.valueOf(00.00));
				edittext58.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview91.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* نسبة الهالك %");
				dialog.setMessage("\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٥ % \"");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		
		textview89.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* كثافة الخامة\n( كجم / م٣ )");
				dialog.setMessage("\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة تم تسجيلها مسبقآ بالبرنامج \"");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		
		textview88.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* نسبة الخامة من الوزن بعد خصم وزن البيتومين");
				dialog.setMessage("\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيم خلطة أسفلتية لطبقة رابطة تدرج ( ٣د ) \"");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		
		edittext10.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext10.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext77.setText(String.valueOf(Double.parseDouble(edittext10.getText().toString()) + Double.parseDouble(edittext76.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext9.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext9.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext10.setText(String.valueOf(00.00));
				}
				else {
					edittext10.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString()) + (Double.parseDouble(edittext8.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext8.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext8.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext9.getText().toString().equals("") || edittext9.getText().toString().equals(".")) || (edittext9.getText().toString().equals("-") || (Double.parseDouble(edittext9.getText().toString()) < 0))) {
					edittext10.setText(String.valueOf(00.00));
				}
				else {
					edittext10.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext9.getText().toString()) / 100))));
				}
				edittext75.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString()) + Double.parseDouble(edittext74.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0))) {
						edittext6.setText(String.valueOf(38));
					}
					if ((edittext7.getText().toString().equals("") || edittext7.getText().toString().equals(".")) || (edittext7.getText().toString().equals("-") || (Double.parseDouble(edittext7.getText().toString()) < 0))) {
						edittext7.setText(String.valueOf(1.45d));
					}
					edittext8.setText(String.valueOf((Double.parseDouble(edittext5.getText().toString()) * (Double.parseDouble(edittext6.getText().toString()) / 100)) / Double.parseDouble(edittext7.getText().toString())));
					if ((edittext9.getText().toString().equals("") || edittext9.getText().toString().equals(".")) || (edittext9.getText().toString().equals("-") || (Double.parseDouble(edittext9.getText().toString()) < 0))) {
						edittext9.setText(String.valueOf(5));
					}
					edittext8.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext7.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext7.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext8.setText(String.valueOf(00.00));
				edittext8.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext6.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext8.setText(String.valueOf(00.00));
				edittext8.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext20.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext20.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext87.setText(String.valueOf(Double.parseDouble(edittext20.getText().toString()) + Double.parseDouble(edittext86.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext19.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext19.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext20.setText(String.valueOf(00.00));
				}
				else {
					edittext20.setText(String.valueOf(Double.parseDouble(edittext18.getText().toString()) + (Double.parseDouble(edittext18.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext18.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext18.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext19.getText().toString().equals("") || edittext19.getText().toString().equals(".")) || (edittext19.getText().toString().equals("-") || (Double.parseDouble(edittext19.getText().toString()) < 0))) {
					edittext20.setText(String.valueOf(00.00));
				}
				else {
					edittext20.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext19.getText().toString()) / 100))));
				}
				edittext85.setText(String.valueOf(Double.parseDouble(edittext18.getText().toString()) + Double.parseDouble(edittext84.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext16.getText().toString().equals("") || edittext16.getText().toString().equals(".")) || (edittext16.getText().toString().equals("-") || (Double.parseDouble(edittext16.getText().toString()) < 0))) {
						edittext16.setText(String.valueOf(30));
					}
					if ((edittext17.getText().toString().equals("") || edittext17.getText().toString().equals(".")) || (edittext17.getText().toString().equals("-") || (Double.parseDouble(edittext17.getText().toString()) < 0))) {
						edittext17.setText(String.valueOf(1.43d));
					}
					edittext18.setText(String.valueOf((Double.parseDouble(edittext5.getText().toString()) * (Double.parseDouble(edittext16.getText().toString()) / 100)) / Double.parseDouble(edittext17.getText().toString())));
					if ((edittext19.getText().toString().equals("") || edittext19.getText().toString().equals(".")) || (edittext19.getText().toString().equals("-") || (Double.parseDouble(edittext19.getText().toString()) < 0))) {
						edittext19.setText(String.valueOf(5));
					}
					edittext18.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext17.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext17.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext18.setText(String.valueOf(00.00));
				edittext18.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext16.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext16.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext18.setText(String.valueOf(00.00));
				edittext18.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext30.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext30.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext97.setText(String.valueOf(Double.parseDouble(edittext30.getText().toString()) + Double.parseDouble(edittext96.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext29.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext29.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext30.setText(String.valueOf(00.00));
				}
				else {
					edittext30.setText(String.valueOf(Double.parseDouble(edittext28.getText().toString()) + (Double.parseDouble(edittext28.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext28.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext28.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext29.getText().toString().equals("") || edittext29.getText().toString().equals(".")) || (edittext29.getText().toString().equals("-") || (Double.parseDouble(edittext29.getText().toString()) < 0))) {
					edittext30.setText(String.valueOf(00.00));
				}
				else {
					edittext30.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext29.getText().toString()) / 100))));
				}
				edittext95.setText(String.valueOf(Double.parseDouble(edittext28.getText().toString()) + Double.parseDouble(edittext94.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext26.getText().toString().equals("") || edittext26.getText().toString().equals(".")) || (edittext26.getText().toString().equals("-") || (Double.parseDouble(edittext26.getText().toString()) < 0))) {
						edittext26.setText(String.valueOf(0));
					}
					if ((edittext27.getText().toString().equals("") || edittext27.getText().toString().equals(".")) || (edittext27.getText().toString().equals("-") || (Double.parseDouble(edittext27.getText().toString()) < 0))) {
						edittext27.setText(String.valueOf(1.4d));
					}
					edittext28.setText(String.valueOf((Double.parseDouble(edittext5.getText().toString()) * (Double.parseDouble(edittext26.getText().toString()) / 100)) / Double.parseDouble(edittext27.getText().toString())));
					if ((edittext29.getText().toString().equals("") || edittext29.getText().toString().equals(".")) || (edittext29.getText().toString().equals("-") || (Double.parseDouble(edittext29.getText().toString()) < 0))) {
						edittext29.setText(String.valueOf(5));
					}
					edittext28.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext27.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext27.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext28.setText(String.valueOf(00.00));
				edittext28.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext26.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext26.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext28.setText(String.valueOf(00.00));
				edittext28.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext40.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext40.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext107.setText(String.valueOf(Double.parseDouble(edittext40.getText().toString()) + Double.parseDouble(edittext106.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext39.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext39.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext40.setText(String.valueOf(00.00));
				}
				else {
					edittext40.setText(String.valueOf(Double.parseDouble(edittext38.getText().toString()) + (Double.parseDouble(edittext38.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext38.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext38.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext39.getText().toString().equals("") || edittext39.getText().toString().equals(".")) || (edittext39.getText().toString().equals("-") || (Double.parseDouble(edittext39.getText().toString()) < 0))) {
					edittext40.setText(String.valueOf(00.00));
				}
				else {
					edittext40.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext39.getText().toString()) / 100))));
				}
				edittext105.setText(String.valueOf(Double.parseDouble(edittext38.getText().toString()) + Double.parseDouble(edittext104.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext36.getText().toString().equals("") || edittext36.getText().toString().equals(".")) || (edittext36.getText().toString().equals("-") || (Double.parseDouble(edittext36.getText().toString()) < 0))) {
						edittext36.setText(String.valueOf(20));
					}
					if ((edittext37.getText().toString().equals("") || edittext37.getText().toString().equals(".")) || (edittext37.getText().toString().equals("-") || (Double.parseDouble(edittext37.getText().toString()) < 0))) {
						edittext37.setText(String.valueOf(1.56d));
					}
					edittext38.setText(String.valueOf((Double.parseDouble(edittext5.getText().toString()) * (Double.parseDouble(edittext36.getText().toString()) / 100)) / Double.parseDouble(edittext37.getText().toString())));
					if ((edittext39.getText().toString().equals("") || edittext39.getText().toString().equals(".")) || (edittext39.getText().toString().equals("-") || (Double.parseDouble(edittext39.getText().toString()) < 0))) {
						edittext39.setText(String.valueOf(5));
					}
					edittext38.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext37.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext37.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext38.setText(String.valueOf(00.00));
				edittext38.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext36.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext36.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext38.setText(String.valueOf(00.00));
				edittext38.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext50.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext50.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext117.setText(String.valueOf(Double.parseDouble(edittext50.getText().toString()) + Double.parseDouble(edittext116.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext49.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext49.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext50.setText(String.valueOf(00.00));
				}
				else {
					edittext50.setText(String.valueOf(Double.parseDouble(edittext48.getText().toString()) + (Double.parseDouble(edittext48.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext48.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext48.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext49.getText().toString().equals("") || edittext49.getText().toString().equals(".")) || (edittext49.getText().toString().equals("-") || (Double.parseDouble(edittext49.getText().toString()) < 0))) {
					edittext50.setText(String.valueOf(00.00));
				}
				else {
					edittext50.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext49.getText().toString()) / 100))));
				}
				edittext115.setText(String.valueOf(Double.parseDouble(edittext48.getText().toString()) + Double.parseDouble(edittext114.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext46.getText().toString().equals("") || edittext46.getText().toString().equals(".")) || (edittext46.getText().toString().equals("-") || (Double.parseDouble(edittext46.getText().toString()) < 0))) {
						edittext46.setText(String.valueOf(10));
					}
					edittext48.setText(String.valueOf(Double.parseDouble(edittext5.getText().toString()) * (Double.parseDouble(edittext46.getText().toString()) / 100)));
					if ((edittext49.getText().toString().equals("") || edittext49.getText().toString().equals(".")) || (edittext49.getText().toString().equals("-") || (Double.parseDouble(edittext49.getText().toString()) < 0))) {
						edittext49.setText(String.valueOf(5));
					}
					edittext48.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext46.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext46.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext48.setText(String.valueOf(00.00));
				edittext48.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext60.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext60.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext127.setText(String.valueOf(Double.parseDouble(edittext60.getText().toString()) + Double.parseDouble(edittext126.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext59.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext59.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext60.setText(String.valueOf(00.00));
				}
				else {
					edittext60.setText(String.valueOf(Double.parseDouble(edittext58.getText().toString()) + (Double.parseDouble(edittext58.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext58.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext58.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext59.getText().toString().equals("") || edittext59.getText().toString().equals(".")) || (edittext59.getText().toString().equals("-") || (Double.parseDouble(edittext59.getText().toString()) < 0))) {
					edittext60.setText(String.valueOf(00.00));
				}
				else {
					edittext60.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext59.getText().toString()) / 100))));
				}
				edittext125.setText(String.valueOf(Double.parseDouble(edittext58.getText().toString()) + Double.parseDouble(edittext124.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext56.getText().toString().equals("") || edittext56.getText().toString().equals(".")) || (edittext56.getText().toString().equals("-") || (Double.parseDouble(edittext56.getText().toString()) < 0))) {
						edittext56.setText(String.valueOf(2));
					}
					edittext58.setText(String.valueOf(Double.parseDouble(edittext5.getText().toString()) * (Double.parseDouble(edittext56.getText().toString()) / 100)));
					if ((edittext59.getText().toString().equals("") || edittext59.getText().toString().equals(".")) || (edittext59.getText().toString().equals("-") || (Double.parseDouble(edittext59.getText().toString()) < 0))) {
						edittext59.setText(String.valueOf(5));
					}
					edittext58.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext56.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext56.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext58.setText(String.valueOf(00.00));
				edittext58.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext70.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext70.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext137.setText(String.valueOf(Double.parseDouble(edittext70.getText().toString()) + Double.parseDouble(edittext136.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext69.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext69.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext70.setText(String.valueOf(00.00));
				}
				else {
					edittext70.setText(String.valueOf(Double.parseDouble(edittext68.getText().toString()) + (Double.parseDouble(edittext68.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext68.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext68.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext69.getText().toString().equals("") || edittext69.getText().toString().equals(".")) || (edittext69.getText().toString().equals("-") || (Double.parseDouble(edittext69.getText().toString()) < 0))) {
					edittext70.setText(String.valueOf(00.00));
				}
				else {
					edittext70.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext69.getText().toString()) / 100))));
				}
				edittext135.setText(String.valueOf(Double.parseDouble(edittext68.getText().toString()) + Double.parseDouble(edittext134.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext66.getText().toString().equals("") || edittext66.getText().toString().equals(".")) || (edittext66.getText().toString().equals("-") || (Double.parseDouble(edittext66.getText().toString()) < 0))) {
						edittext66.setText(String.valueOf(4.6d));
					}
					edittext68.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) * (Double.parseDouble(edittext66.getText().toString()) / 100)));
					if ((edittext69.getText().toString().equals("") || edittext69.getText().toString().equals(".")) || (edittext69.getText().toString().equals("-") || (Double.parseDouble(edittext69.getText().toString()) < 0))) {
						edittext69.setText(String.valueOf(5));
					}
					edittext68.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext66.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext66.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext68.setText(String.valueOf(00.00));
				edittext68.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		add_dynamic_element.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					dynamic_all.setVisibility(View.VISIBLE);
					_dynamic_view();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext80.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext80.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext150.setText(String.valueOf(((Double.parseDouble(edittext80.getText().toString()) + Double.parseDouble(edittext90.getText().toString())) + (Double.parseDouble(edittext100.getText().toString()) + Double.parseDouble(edittext110.getText().toString()))) + ((Double.parseDouble(edittext120.getText().toString()) + Double.parseDouble(edittext130.getText().toString())) + Double.parseDouble(edittext140.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext79.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext79.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext149.setText(String.valueOf(((Double.parseDouble(edittext79.getText().toString()) + Double.parseDouble(edittext89.getText().toString())) + (Double.parseDouble(edittext99.getText().toString()) + Double.parseDouble(edittext109.getText().toString()))) + ((Double.parseDouble(edittext119.getText().toString()) + Double.parseDouble(edittext129.getText().toString())) + Double.parseDouble(edittext139.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext78.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext78.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext79.setText(String.valueOf(00.00d));
					edittext80.setText(String.valueOf(00.00d));
				}
				else {
					edittext79.setText(String.valueOf(Double.parseDouble(edittext75.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext80.setText(String.valueOf(Double.parseDouble(edittext77.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext77.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext77.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext78.getText().toString().equals("") || edittext78.getText().toString().equals(".")) || (edittext78.getText().toString().equals("-") || (Double.parseDouble(edittext78.getText().toString()) < 0))) {
					edittext80.setText(String.valueOf(00.00d));
				}
				else {
					edittext80.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext78.getText().toString())));
				}
				edittext157.setText(String.valueOf(Double.parseDouble(edittext77.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext76.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext10.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext77.setText(String.valueOf(Double.parseDouble(edittext10.getText().toString()) + Double.parseDouble(edittext76.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext75.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext75.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext78.getText().toString().equals("") || edittext78.getText().toString().equals(".")) || (edittext78.getText().toString().equals("-") || (Double.parseDouble(edittext78.getText().toString()) < 0))) {
					edittext79.setText(String.valueOf(00.00d));
				}
				else {
					edittext79.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext78.getText().toString())));
				}
				edittext155.setText(String.valueOf(Double.parseDouble(edittext75.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext74.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext74.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext75.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString()) + Double.parseDouble(edittext74.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext90.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext90.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext150.setText(String.valueOf(((Double.parseDouble(edittext80.getText().toString()) + Double.parseDouble(edittext90.getText().toString())) + (Double.parseDouble(edittext100.getText().toString()) + Double.parseDouble(edittext110.getText().toString()))) + ((Double.parseDouble(edittext120.getText().toString()) + Double.parseDouble(edittext130.getText().toString())) + Double.parseDouble(edittext140.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext89.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext89.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext149.setText(String.valueOf(((Double.parseDouble(edittext79.getText().toString()) + Double.parseDouble(edittext89.getText().toString())) + (Double.parseDouble(edittext99.getText().toString()) + Double.parseDouble(edittext109.getText().toString()))) + ((Double.parseDouble(edittext119.getText().toString()) + Double.parseDouble(edittext129.getText().toString())) + Double.parseDouble(edittext139.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext88.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext88.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext89.setText(String.valueOf(00.00d));
					edittext90.setText(String.valueOf(00.00d));
				}
				else {
					edittext89.setText(String.valueOf(Double.parseDouble(edittext85.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext90.setText(String.valueOf(Double.parseDouble(edittext87.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext87.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext87.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext88.getText().toString().equals("") || edittext88.getText().toString().equals(".")) || (edittext88.getText().toString().equals("-") || (Double.parseDouble(edittext88.getText().toString()) < 0))) {
					edittext90.setText(String.valueOf(00.00d));
				}
				else {
					edittext90.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext88.getText().toString())));
				}
				edittext167.setText(String.valueOf(Double.parseDouble(edittext87.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext86.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext86.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext87.setText(String.valueOf(Double.parseDouble(edittext20.getText().toString()) + Double.parseDouble(edittext86.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext85.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext85.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext88.getText().toString().equals("") || edittext88.getText().toString().equals(".")) || (edittext88.getText().toString().equals("-") || (Double.parseDouble(edittext88.getText().toString()) < 0))) {
					edittext89.setText(String.valueOf(00.00d));
				}
				else {
					edittext89.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext78.getText().toString())));
				}
				edittext165.setText(String.valueOf(Double.parseDouble(edittext85.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext84.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext84.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext85.setText(String.valueOf(Double.parseDouble(edittext18.getText().toString()) + Double.parseDouble(edittext84.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext100.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext100.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext150.setText(String.valueOf(((Double.parseDouble(edittext80.getText().toString()) + Double.parseDouble(edittext90.getText().toString())) + (Double.parseDouble(edittext100.getText().toString()) + Double.parseDouble(edittext110.getText().toString()))) + ((Double.parseDouble(edittext120.getText().toString()) + Double.parseDouble(edittext130.getText().toString())) + Double.parseDouble(edittext140.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext99.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext99.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext149.setText(String.valueOf(((Double.parseDouble(edittext79.getText().toString()) + Double.parseDouble(edittext89.getText().toString())) + (Double.parseDouble(edittext99.getText().toString()) + Double.parseDouble(edittext109.getText().toString()))) + ((Double.parseDouble(edittext119.getText().toString()) + Double.parseDouble(edittext129.getText().toString())) + Double.parseDouble(edittext139.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext98.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext98.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext99.setText(String.valueOf(00.00d));
					edittext100.setText(String.valueOf(00.00d));
				}
				else {
					edittext99.setText(String.valueOf(Double.parseDouble(edittext95.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext100.setText(String.valueOf(Double.parseDouble(edittext97.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext97.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext97.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext98.getText().toString().equals("") || edittext98.getText().toString().equals(".")) || (edittext98.getText().toString().equals("-") || (Double.parseDouble(edittext98.getText().toString()) < 0))) {
					edittext100.setText(String.valueOf(00.00d));
				}
				else {
					edittext100.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext98.getText().toString())));
				}
				edittext177.setText(String.valueOf(Double.parseDouble(edittext97.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext96.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext96.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext97.setText(String.valueOf(Double.parseDouble(edittext30.getText().toString()) + Double.parseDouble(edittext96.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext95.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext95.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext98.getText().toString().equals("") || edittext98.getText().toString().equals(".")) || (edittext98.getText().toString().equals("-") || (Double.parseDouble(edittext98.getText().toString()) < 0))) {
					edittext99.setText(String.valueOf(00.00d));
				}
				else {
					edittext99.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext98.getText().toString())));
				}
				edittext175.setText(String.valueOf(Double.parseDouble(edittext95.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext94.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext94.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext95.setText(String.valueOf(Double.parseDouble(edittext28.getText().toString()) + Double.parseDouble(edittext94.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext110.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext110.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext150.setText(String.valueOf(((Double.parseDouble(edittext80.getText().toString()) + Double.parseDouble(edittext90.getText().toString())) + (Double.parseDouble(edittext100.getText().toString()) + Double.parseDouble(edittext110.getText().toString()))) + ((Double.parseDouble(edittext120.getText().toString()) + Double.parseDouble(edittext130.getText().toString())) + Double.parseDouble(edittext140.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext109.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext109.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext149.setText(String.valueOf(((Double.parseDouble(edittext79.getText().toString()) + Double.parseDouble(edittext89.getText().toString())) + (Double.parseDouble(edittext99.getText().toString()) + Double.parseDouble(edittext109.getText().toString()))) + ((Double.parseDouble(edittext119.getText().toString()) + Double.parseDouble(edittext129.getText().toString())) + Double.parseDouble(edittext139.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext108.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext108.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext109.setText(String.valueOf(00.00d));
					edittext110.setText(String.valueOf(00.00d));
				}
				else {
					edittext109.setText(String.valueOf(Double.parseDouble(edittext105.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext110.setText(String.valueOf(Double.parseDouble(edittext107.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext107.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext107.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext108.getText().toString().equals("") || edittext108.getText().toString().equals(".")) || (edittext108.getText().toString().equals("-") || (Double.parseDouble(edittext108.getText().toString()) < 0))) {
					edittext110.setText(String.valueOf(00.00d));
				}
				else {
					edittext110.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext108.getText().toString())));
				}
				edittext187.setText(String.valueOf(Double.parseDouble(edittext107.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext106.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext40.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext107.setText(String.valueOf(Double.parseDouble(edittext40.getText().toString()) + Double.parseDouble(edittext106.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext105.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext105.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext108.getText().toString().equals("") || edittext108.getText().toString().equals(".")) || (edittext108.getText().toString().equals("-") || (Double.parseDouble(edittext108.getText().toString()) < 0))) {
					edittext109.setText(String.valueOf(00.00d));
				}
				else {
					edittext109.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext108.getText().toString())));
				}
				edittext185.setText(String.valueOf(Double.parseDouble(edittext105.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext104.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext104.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext105.setText(String.valueOf(Double.parseDouble(edittext38.getText().toString()) + Double.parseDouble(edittext104.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext120.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext120.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext150.setText(String.valueOf(((Double.parseDouble(edittext80.getText().toString()) + Double.parseDouble(edittext90.getText().toString())) + (Double.parseDouble(edittext100.getText().toString()) + Double.parseDouble(edittext110.getText().toString()))) + ((Double.parseDouble(edittext120.getText().toString()) + Double.parseDouble(edittext130.getText().toString())) + Double.parseDouble(edittext140.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext119.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext119.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext149.setText(String.valueOf(((Double.parseDouble(edittext79.getText().toString()) + Double.parseDouble(edittext89.getText().toString())) + (Double.parseDouble(edittext99.getText().toString()) + Double.parseDouble(edittext109.getText().toString()))) + ((Double.parseDouble(edittext119.getText().toString()) + Double.parseDouble(edittext129.getText().toString())) + Double.parseDouble(edittext139.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext118.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext118.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext119.setText(String.valueOf(00.00d));
					edittext120.setText(String.valueOf(00.00d));
				}
				else {
					edittext119.setText(String.valueOf(Double.parseDouble(edittext115.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext120.setText(String.valueOf(Double.parseDouble(edittext117.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext117.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext117.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext118.getText().toString().equals("") || edittext118.getText().toString().equals(".")) || (edittext118.getText().toString().equals("-") || (Double.parseDouble(edittext118.getText().toString()) < 0))) {
					edittext120.setText(String.valueOf(00.00d));
				}
				else {
					edittext120.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext118.getText().toString())));
				}
				edittext197.setText(String.valueOf(Double.parseDouble(edittext117.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext116.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext116.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext117.setText(String.valueOf(Double.parseDouble(edittext50.getText().toString()) + Double.parseDouble(edittext116.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext115.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext115.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext118.getText().toString().equals("") || edittext118.getText().toString().equals(".")) || (edittext118.getText().toString().equals("-") || (Double.parseDouble(edittext118.getText().toString()) < 0))) {
					edittext119.setText(String.valueOf(00.00d));
				}
				else {
					edittext119.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext118.getText().toString())));
				}
				edittext195.setText(String.valueOf(Double.parseDouble(edittext115.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext114.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext114.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext115.setText(String.valueOf(Double.parseDouble(edittext48.getText().toString()) + Double.parseDouble(edittext114.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext130.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext130.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext150.setText(String.valueOf(((Double.parseDouble(edittext80.getText().toString()) + Double.parseDouble(edittext90.getText().toString())) + (Double.parseDouble(edittext100.getText().toString()) + Double.parseDouble(edittext110.getText().toString()))) + ((Double.parseDouble(edittext120.getText().toString()) + Double.parseDouble(edittext130.getText().toString())) + Double.parseDouble(edittext140.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext129.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext129.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext149.setText(String.valueOf(((Double.parseDouble(edittext79.getText().toString()) + Double.parseDouble(edittext89.getText().toString())) + (Double.parseDouble(edittext99.getText().toString()) + Double.parseDouble(edittext109.getText().toString()))) + ((Double.parseDouble(edittext119.getText().toString()) + Double.parseDouble(edittext129.getText().toString())) + Double.parseDouble(edittext139.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext128.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext128.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext129.setText(String.valueOf(00.00d));
					edittext130.setText(String.valueOf(00.00d));
				}
				else {
					edittext129.setText(String.valueOf(Double.parseDouble(edittext125.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext130.setText(String.valueOf(Double.parseDouble(edittext127.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext127.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext127.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext128.getText().toString().equals("") || edittext128.getText().toString().equals(".")) || (edittext128.getText().toString().equals("-") || (Double.parseDouble(edittext128.getText().toString()) < 0))) {
					edittext130.setText(String.valueOf(00.00d));
				}
				else {
					edittext130.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext128.getText().toString())));
				}
				edittext207.setText(String.valueOf(Double.parseDouble(edittext127.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext126.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext126.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext127.setText(String.valueOf(Double.parseDouble(edittext60.getText().toString()) + Double.parseDouble(edittext126.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext125.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext125.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext128.getText().toString().equals("") || edittext128.getText().toString().equals(".")) || (edittext128.getText().toString().equals("-") || (Double.parseDouble(edittext128.getText().toString()) < 0))) {
					edittext129.setText(String.valueOf(00.00d));
				}
				else {
					edittext129.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext128.getText().toString())));
				}
				edittext205.setText(String.valueOf(Double.parseDouble(edittext125.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext124.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext124.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext125.setText(String.valueOf(Double.parseDouble(edittext58.getText().toString()) + Double.parseDouble(edittext124.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext140.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext140.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext150.setText(String.valueOf(((Double.parseDouble(edittext80.getText().toString()) + Double.parseDouble(edittext90.getText().toString())) + (Double.parseDouble(edittext100.getText().toString()) + Double.parseDouble(edittext110.getText().toString()))) + ((Double.parseDouble(edittext120.getText().toString()) + Double.parseDouble(edittext130.getText().toString())) + Double.parseDouble(edittext140.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext139.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext139.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext149.setText(String.valueOf(((Double.parseDouble(edittext79.getText().toString()) + Double.parseDouble(edittext89.getText().toString())) + (Double.parseDouble(edittext99.getText().toString()) + Double.parseDouble(edittext109.getText().toString()))) + ((Double.parseDouble(edittext119.getText().toString()) + Double.parseDouble(edittext129.getText().toString())) + Double.parseDouble(edittext139.getText().toString()))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext138.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext138.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext139.setText(String.valueOf(00.00d));
					edittext140.setText(String.valueOf(00.00d));
				}
				else {
					edittext139.setText(String.valueOf(Double.parseDouble(edittext135.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext140.setText(String.valueOf(Double.parseDouble(edittext137.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext137.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext137.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext138.getText().toString().equals("") || edittext138.getText().toString().equals(".")) || (edittext138.getText().toString().equals("-") || (Double.parseDouble(edittext138.getText().toString()) < 0))) {
					edittext140.setText(String.valueOf(00.00d));
				}
				else {
					edittext140.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext138.getText().toString())));
				}
				edittext217.setText(String.valueOf(Double.parseDouble(edittext137.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext136.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext136.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext137.setText(String.valueOf(Double.parseDouble(edittext70.getText().toString()) + Double.parseDouble(edittext136.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext135.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext135.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext138.getText().toString().equals("") || edittext138.getText().toString().equals(".")) || (edittext138.getText().toString().equals("-") || (Double.parseDouble(edittext138.getText().toString()) < 0))) {
					edittext139.setText(String.valueOf(00.00d));
				}
				else {
					edittext139.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext138.getText().toString())));
				}
				edittext215.setText(String.valueOf(Double.parseDouble(edittext135.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext134.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext134.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext135.setText(String.valueOf(Double.parseDouble(edittext68.getText().toString()) + Double.parseDouble(edittext134.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext149.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext149.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext150.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext150.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext159.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext159.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext158.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext158.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext157.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext157.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext153.getText().toString().equals("") || edittext153.getText().toString().equals(".")) || (edittext153.getText().toString().equals("-") || (Double.parseDouble(edittext153.getText().toString()) < 0))) {
					edittext159.setText("");
				}
				else {
					edittext159.setText(String.valueOf(Double.parseDouble(edittext153.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext155.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext155.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext153.getText().toString().equals("") || edittext153.getText().toString().equals(".")) || (edittext153.getText().toString().equals("-") || (Double.parseDouble(edittext153.getText().toString()) < 0))) {
					edittext158.setText("");
				}
				else {
					edittext158.setText(String.valueOf(Double.parseDouble(edittext153.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext153.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext153.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext158.setText("");
					edittext159.setText("");
				}
				else {
					edittext158.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext155.getText().toString())));
					edittext159.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext157.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext169.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext169.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext168.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext168.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext167.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext167.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext163.getText().toString().equals("") || edittext163.getText().toString().equals(".")) || (edittext163.getText().toString().equals("-") || (Double.parseDouble(edittext163.getText().toString()) < 0))) {
					edittext169.setText("");
				}
				else {
					edittext169.setText(String.valueOf(Double.parseDouble(edittext163.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext165.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext165.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext163.getText().toString().equals("") || edittext163.getText().toString().equals(".")) || (edittext163.getText().toString().equals("-") || (Double.parseDouble(edittext163.getText().toString()) < 0))) {
					edittext168.setText("");
				}
				else {
					edittext168.setText(String.valueOf(Double.parseDouble(edittext163.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext163.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext163.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext168.setText("");
					edittext169.setText("");
				}
				else {
					edittext168.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext165.getText().toString())));
					edittext169.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext167.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext179.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext179.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext178.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext178.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext177.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext177.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext173.getText().toString().equals("") || edittext173.getText().toString().equals(".")) || (edittext173.getText().toString().equals("-") || (Double.parseDouble(edittext173.getText().toString()) < 0))) {
					edittext179.setText("");
				}
				else {
					edittext179.setText(String.valueOf(Double.parseDouble(edittext173.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext175.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext175.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext173.getText().toString().equals("") || edittext173.getText().toString().equals(".")) || (edittext173.getText().toString().equals("-") || (Double.parseDouble(edittext173.getText().toString()) < 0))) {
					edittext178.setText("");
				}
				else {
					edittext178.setText(String.valueOf(Double.parseDouble(edittext173.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext173.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext173.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext178.setText("");
					edittext179.setText("");
				}
				else {
					edittext178.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext175.getText().toString())));
					edittext179.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext177.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext189.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext189.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext188.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext188.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext187.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext187.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext183.getText().toString().equals("") || edittext183.getText().toString().equals(".")) || (edittext183.getText().toString().equals("-") || (Double.parseDouble(edittext183.getText().toString()) < 0))) {
					edittext189.setText("");
				}
				else {
					edittext189.setText(String.valueOf(Double.parseDouble(edittext183.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext185.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext185.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext183.getText().toString().equals("") || edittext183.getText().toString().equals(".")) || (edittext183.getText().toString().equals("-") || (Double.parseDouble(edittext183.getText().toString()) < 0))) {
					edittext188.setText("");
				}
				else {
					edittext188.setText(String.valueOf(Double.parseDouble(edittext183.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext183.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext183.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext188.setText("");
					edittext189.setText("");
				}
				else {
					edittext188.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext185.getText().toString())));
					edittext189.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext187.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext199.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext199.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext198.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext198.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext197.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext197.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext193.getText().toString().equals("") || edittext193.getText().toString().equals(".")) || (edittext193.getText().toString().equals("-") || (Double.parseDouble(edittext193.getText().toString()) < 0))) {
					edittext199.setText("");
				}
				else {
					edittext199.setText(String.valueOf(Double.parseDouble(edittext193.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext195.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext195.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext193.getText().toString().equals("") || edittext193.getText().toString().equals(".")) || (edittext193.getText().toString().equals("-") || (Double.parseDouble(edittext193.getText().toString()) < 0))) {
					edittext198.setText("");
				}
				else {
					edittext198.setText(String.valueOf(Double.parseDouble(edittext193.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext193.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext193.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext198.setText("");
					edittext199.setText("");
				}
				else {
					edittext198.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext195.getText().toString())));
					edittext199.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext197.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext209.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext209.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext208.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext208.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext207.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext207.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext203.getText().toString().equals("") || edittext203.getText().toString().equals(".")) || (edittext203.getText().toString().equals("-") || (Double.parseDouble(edittext203.getText().toString()) < 0))) {
					edittext209.setText("");
				}
				else {
					edittext209.setText(String.valueOf(Double.parseDouble(edittext203.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext205.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext205.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext203.getText().toString().equals("") || edittext203.getText().toString().equals(".")) || (edittext203.getText().toString().equals("-") || (Double.parseDouble(edittext203.getText().toString()) < 0))) {
					edittext208.setText("");
				}
				else {
					edittext208.setText(String.valueOf(Double.parseDouble(edittext203.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext203.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext203.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext208.setText("");
					edittext209.setText("");
				}
				else {
					edittext208.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext205.getText().toString())));
					edittext209.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext207.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext219.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext219.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext218.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext218.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext217.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext217.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext213.getText().toString().equals("") || edittext213.getText().toString().equals(".")) || (edittext213.getText().toString().equals("-") || (Double.parseDouble(edittext213.getText().toString()) < 0))) {
					edittext219.setText("");
				}
				else {
					edittext219.setText(String.valueOf(Double.parseDouble(edittext213.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext215.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext215.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext213.getText().toString().equals("") || edittext213.getText().toString().equals(".")) || (edittext213.getText().toString().equals("-") || (Double.parseDouble(edittext213.getText().toString()) < 0))) {
					edittext218.setText("");
				}
				else {
					edittext218.setText(String.valueOf(Double.parseDouble(edittext213.getText().toString()) - Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext213.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext213.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext218.setText("");
					edittext219.setText("");
				}
				else {
					edittext218.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext215.getText().toString())));
					edittext219.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext217.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_PrintHelper(linear2230);
				_PrintHelper(linear1259);
				_PrintHelper(linear201s1);
				_PrintHelper(linear1);
			}
		});
	}
	
	private void initializeLogic() {
		/*
الدينامك الكلي
*/
		dynamic_all.setVisibility(View.GONE);
		/*
مجموع الدينامك بدون هالك 
*/
		linear1111.setVisibility(View.GONE);
		linear1112.setVisibility(View.GONE);
		linear1113.setVisibility(View.GONE);
		linear1114.setVisibility(View.GONE);
		linear1115.setVisibility(View.GONE);
		linear1116.setVisibility(View.GONE);
		linear1117.setVisibility(View.GONE);
		linear1118.setVisibility(View.GONE);
		/*
مجموع الدينامك شامل هالك 
*/
		linear2222.setVisibility(View.GONE);
		linear2223.setVisibility(View.GONE);
		linear2224.setVisibility(View.GONE);
		linear2225.setVisibility(View.GONE);
		linear2226.setVisibility(View.GONE);
		linear2227.setVisibility(View.GONE);
		linear2228.setVisibility(View.GONE);
		linear2229.setVisibility(View.GONE);
	}
	
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	}
	
	@Override
	public void onPause() {
		super.onPause();
	}
	
	@Override
	public void onResume() {
		super.onResume();
	}
	public void _dynamic_view() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_asphalt_material = (LinearLayout) inflater.inflate(R.layout.toipcc_d_asphalt_material, null, false);
		dynamic_all.addView(dynamic_asphalt_material);
		/*
تعريف الدينامك
*/
		/*
الترقيم
*/
		final EditText element_numd = dynamic_asphalt_material.findViewById(R.id.element_numd);
		element_numd.setSingleLine(true);
		element_numd.setFocusableInTouchMode(true);
		final EditText element_numsd = dynamic_asphalt_material.findViewById(R.id.element_numsd);
		element_numsd.setSingleLine(true);
		element_numsd.setFocusableInTouchMode(true);
		/*
كمية الخلطة الاسفلتية
*/
		final EditText edittext122d = dynamic_asphalt_material.findViewById(R.id.edittext122d);
		edittext122d.setSingleLine(true);
		edittext122d.setFocusableInTouchMode(true);
		final EditText edittext1d = dynamic_asphalt_material.findViewById(R.id.edittext1d);
		edittext1d.setSingleLine(true);
		edittext1d.setFocusableInTouchMode(true);
		final TextView textview2d = dynamic_asphalt_material.findViewById(R.id.textview2d);
		final EditText edittext2d = dynamic_asphalt_material.findViewById(R.id.edittext2d);
		edittext2d.setSingleLine(true);
		edittext2d.setFocusableInTouchMode(true);
		final TextView textview3d = dynamic_asphalt_material.findViewById(R.id.textview3d);
		final EditText edittext3d = dynamic_asphalt_material.findViewById(R.id.edittext3d);
		edittext3d.setSingleLine(true);
		edittext3d.setFocusableInTouchMode(true);
		final Button button1d = dynamic_asphalt_material.findViewById(R.id.button1d);
		final EditText edittext4d = dynamic_asphalt_material.findViewById(R.id.edittext4d);
		edittext4d.setSingleLine(true);
		edittext4d.setFocusableInTouchMode(true);
		final EditText edittext5d = dynamic_asphalt_material.findViewById(R.id.edittext5d);
		edittext5d.setSingleLine(true);
		edittext5d.setFocusableInTouchMode(true);
		/*
الجدول
*/
		final TextView textview88d = dynamic_asphalt_material.findViewById(R.id.textview88d);
		final TextView textview89d = dynamic_asphalt_material.findViewById(R.id.textview89d);
		final TextView textview91d = dynamic_asphalt_material.findViewById(R.id.textview91d);
		/*
سن ١
*/
		final EditText edittext6d = dynamic_asphalt_material.findViewById(R.id.edittext6d);
		edittext6d.setSingleLine(true);
		edittext6d.setFocusableInTouchMode(true);
		final EditText edittext7d = dynamic_asphalt_material.findViewById(R.id.edittext7d);
		edittext7d.setSingleLine(true);
		edittext7d.setFocusableInTouchMode(true);
		final Button button2d = dynamic_asphalt_material.findViewById(R.id.button2d);
		final EditText edittext8d = dynamic_asphalt_material.findViewById(R.id.edittext8d);
		edittext8d.setSingleLine(true);
		edittext8d.setFocusableInTouchMode(true);
		final EditText edittext9d = dynamic_asphalt_material.findViewById(R.id.edittext9d);
		edittext9d.setSingleLine(true);
		edittext9d.setFocusableInTouchMode(true);
		final EditText edittext10d = dynamic_asphalt_material.findViewById(R.id.edittext10d);
		edittext10d.setSingleLine(true);
		edittext10d.setFocusableInTouchMode(true);
		/*
سن ٢
*/
		final EditText edittext16d = dynamic_asphalt_material.findViewById(R.id.edittext16d);
		edittext16d.setSingleLine(true);
		edittext16d.setFocusableInTouchMode(true);
		final EditText edittext17d = dynamic_asphalt_material.findViewById(R.id.edittext17d);
		edittext17d.setSingleLine(true);
		edittext17d.setFocusableInTouchMode(true);
		final Button button3d = dynamic_asphalt_material.findViewById(R.id.button3d);
		final EditText edittext18d = dynamic_asphalt_material.findViewById(R.id.edittext18d);
		edittext18d.setSingleLine(true);
		edittext18d.setFocusableInTouchMode(true);
		final EditText edittext19d = dynamic_asphalt_material.findViewById(R.id.edittext19d);
		edittext19d.setSingleLine(true);
		edittext19d.setFocusableInTouchMode(true);
		final EditText edittext20d = dynamic_asphalt_material.findViewById(R.id.edittext20d);
		edittext20d.setSingleLine(true);
		edittext20d.setFocusableInTouchMode(true);
		/*
سن٣
*/
		final EditText edittext26d = dynamic_asphalt_material.findViewById(R.id.edittext26d);
		edittext26d.setSingleLine(true);
		edittext26d.setFocusableInTouchMode(true);
		final EditText edittext27d = dynamic_asphalt_material.findViewById(R.id.edittext27d);
		edittext27d.setSingleLine(true);
		edittext27d.setFocusableInTouchMode(true);
		final Button button4d = dynamic_asphalt_material.findViewById(R.id.button4d);
		final EditText edittext28d = dynamic_asphalt_material.findViewById(R.id.edittext28d);
		edittext28d.setSingleLine(true);
		edittext28d.setFocusableInTouchMode(true);
		final EditText edittext29d = dynamic_asphalt_material.findViewById(R.id.edittext29d);
		edittext29d.setSingleLine(true);
		edittext29d.setFocusableInTouchMode(true);
		final EditText edittext30d = dynamic_asphalt_material.findViewById(R.id.edittext30d);
		edittext30d.setSingleLine(true);
		edittext30d.setFocusableInTouchMode(true);
		/*
رمل
*/
		final EditText edittext36d = dynamic_asphalt_material.findViewById(R.id.edittext36d);
		edittext36d.setSingleLine(true);
		edittext36d.setFocusableInTouchMode(true);
		final EditText edittext37d = dynamic_asphalt_material.findViewById(R.id.edittext37d);
		edittext37d.setSingleLine(true);
		edittext37d.setFocusableInTouchMode(true);
		final Button button5d = dynamic_asphalt_material.findViewById(R.id.button5d);
		final EditText edittext38d = dynamic_asphalt_material.findViewById(R.id.edittext38d);
		edittext38d.setSingleLine(true);
		edittext38d.setFocusableInTouchMode(true);
		final EditText edittext39d = dynamic_asphalt_material.findViewById(R.id.edittext39d);
		edittext39d.setSingleLine(true);
		edittext39d.setFocusableInTouchMode(true);
		final EditText edittext40d = dynamic_asphalt_material.findViewById(R.id.edittext40d);
		edittext40d.setSingleLine(true);
		edittext40d.setFocusableInTouchMode(true);
		/*
بودرة تكسير
*/
		final EditText edittext46d = dynamic_asphalt_material.findViewById(R.id.edittext46d);
		edittext46d.setSingleLine(true);
		edittext46d.setFocusableInTouchMode(true);
		final Button button6d = dynamic_asphalt_material.findViewById(R.id.button6d);
		final EditText edittext48d = dynamic_asphalt_material.findViewById(R.id.edittext48d);
		edittext48d.setSingleLine(true);
		edittext48d.setFocusableInTouchMode(true);
		final EditText edittext49d = dynamic_asphalt_material.findViewById(R.id.edittext49d);
		edittext49d.setSingleLine(true);
		edittext49d.setFocusableInTouchMode(true);
		final EditText edittext50d = dynamic_asphalt_material.findViewById(R.id.edittext50d);
		edittext50d.setSingleLine(true);
		edittext50d.setFocusableInTouchMode(true);
		/*
غبار أسمنتي
*/
		final EditText edittext56d = dynamic_asphalt_material.findViewById(R.id.edittext56d);
		edittext56d.setSingleLine(true);
		edittext56d.setFocusableInTouchMode(true);
		final Button button7d = dynamic_asphalt_material.findViewById(R.id.button7d);
		final EditText edittext58d = dynamic_asphalt_material.findViewById(R.id.edittext58d);
		edittext58d.setSingleLine(true);
		edittext58d.setFocusableInTouchMode(true);
		final EditText edittext59d = dynamic_asphalt_material.findViewById(R.id.edittext59d);
		edittext59d.setSingleLine(true);
		edittext59d.setFocusableInTouchMode(true);
		final EditText edittext60d = dynamic_asphalt_material.findViewById(R.id.edittext60d);
		edittext60d.setSingleLine(true);
		edittext60d.setFocusableInTouchMode(true);
		/*
بيتومين
*/
		final EditText edittext66d = dynamic_asphalt_material.findViewById(R.id.edittext66d);
		edittext66d.setSingleLine(true);
		edittext66d.setFocusableInTouchMode(true);
		final Button button8d = dynamic_asphalt_material.findViewById(R.id.button8d);
		final EditText edittext68d = dynamic_asphalt_material.findViewById(R.id.edittext68d);
		edittext68d.setSingleLine(true);
		edittext68d.setFocusableInTouchMode(true);
		final EditText edittext69d = dynamic_asphalt_material.findViewById(R.id.edittext69d);
		edittext69d.setSingleLine(true);
		edittext69d.setFocusableInTouchMode(true);
		final EditText edittext70d = dynamic_asphalt_material.findViewById(R.id.edittext70d);
		edittext70d.setSingleLine(true);
		edittext70d.setFocusableInTouchMode(true);
		/*
الاغلاق والحذف
*/
		final ImageView close = dynamic_asphalt_material.findViewById(R.id.close);
		/*
نهاية التعريفات
*/
		/*
ترقيم الفتحات
*/
		element_numd.setText(String.valueOf((long)(dynamic_all.getChildCount() + 1)));
		element_numsd.setText(String.valueOf((long)(dynamic_all.getChildCount() + 1)));
		element_numd.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				if ((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) {
					element_numsd.setText("");
				}
				else {
					element_numsd.setText(String.valueOf((long)(Double.parseDouble(s.toString()))));
				}
			} });
		/*
أوامر كمية الخلطة الأسفلتية
*/
		edittext1d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext1dnn = _param1.toString();
								
edittext1d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext4d.setText(String.valueOf(00.00));
				edittext5d.setText(String.valueOf(00.00));
				edittext4d.setTextColor(0xFFE91E63);
				edittext5d.setTextColor(0xFFE91E63);
				edittext68d.setText(String.valueOf(00.00));
				edittext68d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		textview2d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* كثافة الخلطة\n(طن / م٣ )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٢.٣٤ طن / م٣ \"");
				return true;
			}
		});
		edittext2d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext2dnn = _param1.toString();
								
edittext2d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext4d.setText(String.valueOf(00.00));
				edittext4d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		textview3d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* كثافة البيتومين بالخلطة\n( طن / م٣ )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٠٥ طن/م٣ \"");
				return true;
			}
		});
		edittext3d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext3dnn = _param1.toString();
								
edittext3d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext5d.setText(String.valueOf(00.00));
				edittext5d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		button1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext2d.getText().toString().equals("") || edittext2d.getText().toString().equals(".")) || (edittext2d.getText().toString().equals("-") || (Double.parseDouble(edittext2d.getText().toString()) < 0))) {
						edittext2d.setText(String.valueOf(2.34d));
					}
					if ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0))) {
						edittext3d.setText(String.valueOf(0.05d));
					}
					edittext4d.setText(String.valueOf(Double.parseDouble(edittext1d.getText().toString()) / Double.parseDouble(edittext2d.getText().toString())));
					edittext5d.setText(String.valueOf((1 - Double.parseDouble(edittext3d.getText().toString())) * Double.parseDouble(edittext1d.getText().toString())));
					edittext4d.setTextColor(0xFF000000);
					edittext5d.setTextColor(0xFF000000);
				}
			}
		});
		edittext4d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
		edittext5d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext5dnn = _param1.toString();
								
edittext5d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext8d.setText(String.valueOf(00.00));
				edittext8d.setTextColor(0xFFE91E63);
				edittext18d.setText(String.valueOf(00.00));
				edittext18d.setTextColor(0xFFE91E63);
				edittext28d.setText(String.valueOf(00.00));
				edittext28d.setTextColor(0xFFE91E63);
				edittext38d.setText(String.valueOf(00.00));
				edittext38d.setTextColor(0xFFE91E63);
				edittext48d.setText(String.valueOf(00.00));
				edittext48d.setTextColor(0xFFE91E63);
				edittext58d.setText(String.valueOf(00.00));
				edittext58d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
تعليقات الجدول
*/
		textview88d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة الخامة من الوزن بعد خصم وزن البيتومين \" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيم خلطة أسفلتية لطبقة رابطة تدرج ( ٣د ) \"");
				return true;
			}
		});
		textview89d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* كثافة\nالخامة\n( كجم / م٣ ) \" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة تم تسجيلها مسبقآ بالبرنامج \"");
				return true;
			}
		});
		textview91d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة الهالك \" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٥ % \"");
				return true;
			}
		});
		/*
أوامر سن١
*/
		edittext6d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext6dnn = _param1.toString();
								
edittext6d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext8d.setText(String.valueOf(00.00));
				edittext8d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext7d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext7dnn = _param1.toString();
								
edittext7d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext8d.setText(String.valueOf(00.00));
				edittext8d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		button2d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) {
						edittext6d.setText(String.valueOf(38));
					}
					if ((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))) {
						edittext7d.setText(String.valueOf(1.45d));
					}
					edittext8d.setText(String.valueOf((Double.parseDouble(edittext5d.getText().toString()) * (Double.parseDouble(edittext6d.getText().toString()) / 100)) / Double.parseDouble(edittext7d.getText().toString())));
					if ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) {
						edittext9d.setText(String.valueOf(5));
					}
					edittext8d.setTextColor(0xFF000000);
				}
			}
		});
		/*
اجمالى سن١ بدون هالك
*/
		edittext8d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext8d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) {
					edittext10d.setText(String.valueOf(00.00));
				}
				else {
					edittext10d.setText(String.valueOf(Double.parseDouble(s.toString()) + (Double.parseDouble(s.toString()) * (Double.parseDouble(edittext9d.getText().toString()) / 100))));
				}
				temp1 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext8d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext74.setText(String.valueOf(temp1));
			} });
		/*
نسبة الهالك
*/
		edittext9d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext9d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) {
					edittext10d.setText(String.valueOf(00.00));
				}
				else {
					edittext10d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) + (Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(s.toString()) / 100))));
				}
			} });
		/*
اجمالى سن١ شامل الهالك
*/
		edittext10d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext10d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				temp2 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo2 =child.findViewById(R.id.edittext10d);
					temp2 = temp2 + Double.parseDouble(tempo2.getText().toString());
				}
				edittext76.setText(String.valueOf(temp2));
			} });
		/*
أوامر سن٢
*/
		edittext16d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext16dnn = _param1.toString();
								
edittext16d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext18d.setText(String.valueOf(00.00));
				edittext18d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext17d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext17dnn = _param1.toString();
								
edittext17d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext18d.setText(String.valueOf(00.00));
				edittext18d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		button3d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))) {
						edittext16d.setText(String.valueOf(30));
					}
					if ((edittext17d.getText().toString().equals("") || edittext17d.getText().toString().equals(".")) || (edittext17d.getText().toString().equals("-") || (Double.parseDouble(edittext17d.getText().toString()) < 0))) {
						edittext17d.setText(String.valueOf(1.43d));
					}
					edittext18d.setText(String.valueOf((Double.parseDouble(edittext5d.getText().toString()) * (Double.parseDouble(edittext16d.getText().toString()) / 100)) / Double.parseDouble(edittext17d.getText().toString())));
					if ((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0))) {
						edittext19d.setText(String.valueOf(5));
					}
					edittext18d.setTextColor(0xFF000000);
				}
			}
		});
		/*
اجمالى سن٢ بدون هالك
*/
		edittext18d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext18d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0))) {
					edittext20d.setText(String.valueOf(00.00));
				}
				else {
					edittext20d.setText(String.valueOf(Double.parseDouble(s.toString()) + (Double.parseDouble(s.toString()) * (Double.parseDouble(edittext19d.getText().toString()) / 100))));
				}
				temp3 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo3 =child.findViewById(R.id.edittext18d);
					temp3 = temp3 + Double.parseDouble(tempo3.getText().toString());
				}
				edittext84.setText(String.valueOf(temp3));
			} });
		/*
نسبة الهالك
*/
		edittext19d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext19d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) {
					edittext20d.setText(String.valueOf(00.00));
				}
				else {
					edittext20d.setText(String.valueOf(Double.parseDouble(edittext18d.getText().toString()) + (Double.parseDouble(edittext18d.getText().toString()) * (Double.parseDouble(s.toString()) / 100))));
				}
			} });
		/*
اجمالى س٢ شامل الهالك
*/
		edittext20d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext20d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				temp4 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo4 =child.findViewById(R.id.edittext20d);
					temp4 = temp4 + Double.parseDouble(tempo4.getText().toString());
				}
				edittext86.setText(String.valueOf(temp4));
			} });
		/*
أوامر سن٣
*/
		edittext26d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext26dnn = _param1.toString();
								
edittext26d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext28d.setText(String.valueOf(00.00));
				edittext28d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext27d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext27dnn = _param1.toString();
								
edittext27d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext28d.setText(String.valueOf(00.00));
				edittext28d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		button4d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext26d.getText().toString().equals("") || edittext26d.getText().toString().equals(".")) || (edittext26d.getText().toString().equals("-") || (Double.parseDouble(edittext26d.getText().toString()) < 0))) {
						edittext26d.setText(String.valueOf(0));
					}
					if ((edittext27d.getText().toString().equals("") || edittext27d.getText().toString().equals(".")) || (edittext27d.getText().toString().equals("-") || (Double.parseDouble(edittext27d.getText().toString()) < 0))) {
						edittext27d.setText(String.valueOf(1.4d));
					}
					edittext28d.setText(String.valueOf((Double.parseDouble(edittext5d.getText().toString()) * (Double.parseDouble(edittext26d.getText().toString()) / 100)) / Double.parseDouble(edittext27d.getText().toString())));
					if ((edittext29d.getText().toString().equals("") || edittext29d.getText().toString().equals(".")) || (edittext29d.getText().toString().equals("-") || (Double.parseDouble(edittext29d.getText().toString()) < 0))) {
						edittext29d.setText(String.valueOf(5));
					}
					edittext28d.setTextColor(0xFF000000);
				}
			}
		});
		/*
اجمالى سن٣ بدون هالك
*/
		edittext28d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext28d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext29d.getText().toString().equals("") || edittext29d.getText().toString().equals(".")) || (edittext29d.getText().toString().equals("-") || (Double.parseDouble(edittext29d.getText().toString()) < 0))) {
					edittext30d.setText(String.valueOf(00.00));
				}
				else {
					edittext30d.setText(String.valueOf(Double.parseDouble(s.toString()) + (Double.parseDouble(s.toString()) * (Double.parseDouble(edittext29d.getText().toString()) / 100))));
				}
				temp5 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo5 =child.findViewById(R.id.edittext28d);
					temp5 = temp5 + Double.parseDouble(tempo5.getText().toString());
				}
				edittext94.setText(String.valueOf(temp5));
			} });
		/*
نسبة الهالك
*/
		edittext29d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext29d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) {
					edittext30d.setText(String.valueOf(00.00));
				}
				else {
					edittext30d.setText(String.valueOf(Double.parseDouble(edittext28d.getText().toString()) + (Double.parseDouble(edittext28d.getText().toString()) * (Double.parseDouble(s.toString()) / 100))));
				}
			} });
		/*
اجمالى س٣ شامل الهالك
*/
		edittext30d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext30d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				temp6 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo6 =child.findViewById(R.id.edittext30d);
					temp6 = temp6 + Double.parseDouble(tempo6.getText().toString());
				}
				edittext96.setText(String.valueOf(temp6));
			} });
		/*
أوامر الرمل
*/
		edittext36d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext36dnn = _param1.toString();
								
edittext36d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext38d.setText(String.valueOf(00.00));
				edittext38d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext37d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext37dnn = _param1.toString();
								
edittext37d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext38d.setText(String.valueOf(00.00));
				edittext38d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		button5d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext36d.getText().toString().equals("") || edittext36d.getText().toString().equals(".")) || (edittext36d.getText().toString().equals("-") || (Double.parseDouble(edittext36d.getText().toString()) < 0))) {
						edittext36d.setText(String.valueOf(20));
					}
					if ((edittext37d.getText().toString().equals("") || edittext37d.getText().toString().equals(".")) || (edittext37d.getText().toString().equals("-") || (Double.parseDouble(edittext37d.getText().toString()) < 0))) {
						edittext37d.setText(String.valueOf(1.56d));
					}
					edittext38d.setText(String.valueOf((Double.parseDouble(edittext5d.getText().toString()) * (Double.parseDouble(edittext36d.getText().toString()) / 100)) / Double.parseDouble(edittext37d.getText().toString())));
					if ((edittext39d.getText().toString().equals("") || edittext39d.getText().toString().equals(".")) || (edittext39d.getText().toString().equals("-") || (Double.parseDouble(edittext39d.getText().toString()) < 0))) {
						edittext39d.setText(String.valueOf(5));
					}
					edittext38d.setTextColor(0xFF000000);
				}
			}
		});
		/*
اجمالى رمل بدون هالك
*/
		edittext38d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext38d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext39d.getText().toString().equals("") || edittext39d.getText().toString().equals(".")) || (edittext39d.getText().toString().equals("-") || (Double.parseDouble(edittext39d.getText().toString()) < 0))) {
					edittext40d.setText(String.valueOf(00.00));
				}
				else {
					edittext40d.setText(String.valueOf(Double.parseDouble(s.toString()) + (Double.parseDouble(s.toString()) * (Double.parseDouble(edittext39d.getText().toString()) / 100))));
				}
				temp7 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo7 =child.findViewById(R.id.edittext38d);
					temp7 = temp7 + Double.parseDouble(tempo7.getText().toString());
				}
				edittext104.setText(String.valueOf(temp7));
			} });
		/*
نسبة الهالك
*/
		edittext39d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext39d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) {
					edittext40d.setText(String.valueOf(00.00));
				}
				else {
					edittext40d.setText(String.valueOf(Double.parseDouble(edittext38d.getText().toString()) + (Double.parseDouble(edittext38d.getText().toString()) * (Double.parseDouble(s.toString()) / 100))));
				}
			} });
		/*
اجمالى الرمل شامل الهالك
*/
		edittext40d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext40d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				temp8 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo8 =child.findViewById(R.id.edittext40d);
					temp8 = temp8 + Double.parseDouble(tempo8.getText().toString());
				}
				edittext106.setText(String.valueOf(temp8));
			} });
		/*
أوامر بودرة التكسير
*/
		edittext46d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext46dnn = _param1.toString();
								
edittext46d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext48d.setText(String.valueOf(00.00));
				edittext48d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		button6d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext46d.getText().toString().equals("") || edittext46d.getText().toString().equals(".")) || (edittext46d.getText().toString().equals("-") || (Double.parseDouble(edittext46d.getText().toString()) < 0))) {
						edittext46d.setText(String.valueOf(10));
					}
					edittext48d.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString()) * (Double.parseDouble(edittext46d.getText().toString()) / 100)));
					if ((edittext49d.getText().toString().equals("") || edittext49d.getText().toString().equals(".")) || (edittext49d.getText().toString().equals("-") || (Double.parseDouble(edittext49d.getText().toString()) < 0))) {
						edittext49d.setText(String.valueOf(5));
					}
					edittext48d.setTextColor(0xFF000000);
				}
			}
		});
		/*
اجمالى بودرة التكسير بدون هالك
*/
		edittext48d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext48d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext49d.getText().toString().equals("") || edittext49d.getText().toString().equals(".")) || (edittext49d.getText().toString().equals("-") || (Double.parseDouble(edittext49d.getText().toString()) < 0))) {
					edittext50d.setText(String.valueOf(00.00));
				}
				else {
					edittext50d.setText(String.valueOf(Double.parseDouble(s.toString()) + (Double.parseDouble(s.toString()) * (Double.parseDouble(edittext49d.getText().toString()) / 100))));
				}
				temp9 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo9 =child.findViewById(R.id.edittext48d);
					temp9 = temp9 + Double.parseDouble(tempo9.getText().toString());
				}
				edittext114.setText(String.valueOf(temp9));
			} });
		/*
نسبة الهالك
*/
		edittext49d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext49d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) {
					edittext50d.setText(String.valueOf(00.00));
				}
				else {
					edittext50d.setText(String.valueOf(Double.parseDouble(edittext48d.getText().toString()) + (Double.parseDouble(edittext48d.getText().toString()) * (Double.parseDouble(s.toString()) / 100))));
				}
			} });
		/*
اجمالى بودرة التكسير شامل الهالك
*/
		edittext50d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext50d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				temp10 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo10 =child.findViewById(R.id.edittext50d);
					temp10 = temp10 + Double.parseDouble(tempo10.getText().toString());
				}
				edittext116.setText(String.valueOf(temp10));
			} });
		/*
أوامر غبار الأسمنت
*/
		edittext56d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext56dnn = _param1.toString();
								
edittext56d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext58d.setText(String.valueOf(00.00));
				edittext58d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		button7d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext56d.getText().toString().equals("") || edittext56d.getText().toString().equals(".")) || (edittext56d.getText().toString().equals("-") || (Double.parseDouble(edittext56d.getText().toString()) < 0))) {
						edittext56d.setText(String.valueOf(2));
					}
					edittext58d.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString()) * (Double.parseDouble(edittext56d.getText().toString()) / 100)));
					if ((edittext59d.getText().toString().equals("") || edittext59d.getText().toString().equals(".")) || (edittext59d.getText().toString().equals("-") || (Double.parseDouble(edittext59d.getText().toString()) < 0))) {
						edittext59d.setText(String.valueOf(5));
					}
					edittext58d.setTextColor(0xFF000000);
				}
			}
		});
		/*
اجمالى غبار الأسمنت بدون هالك
*/
		edittext58d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext58d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext59d.getText().toString().equals("") || edittext59d.getText().toString().equals(".")) || (edittext59d.getText().toString().equals("-") || (Double.parseDouble(edittext59d.getText().toString()) < 0))) {
					edittext60d.setText(String.valueOf(00.00));
				}
				else {
					edittext60d.setText(String.valueOf(Double.parseDouble(s.toString()) + (Double.parseDouble(s.toString()) * (Double.parseDouble(edittext59d.getText().toString()) / 100))));
				}
				temp11 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo11 =child.findViewById(R.id.edittext58d);
					temp11 = temp11 + Double.parseDouble(tempo11.getText().toString());
				}
				edittext124.setText(String.valueOf(temp11));
			} });
		/*
نسبة الهالك
*/
		edittext59d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext59d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) {
					edittext60d.setText(String.valueOf(00.00));
				}
				else {
					edittext60d.setText(String.valueOf(Double.parseDouble(edittext58d.getText().toString()) + (Double.parseDouble(edittext58d.getText().toString()) * (Double.parseDouble(s.toString()) / 100))));
				}
			} });
		/*
اجمالى غبار الأسمنت شامل الهالك
*/
		edittext60d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext60d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				temp12 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo12 =child.findViewById(R.id.edittext60d);
					temp12 = temp12 + Double.parseDouble(tempo12.getText().toString());
				}
				edittext126.setText(String.valueOf(temp12));
			} });
		/*
أوامر البيتومين
*/
		edittext66d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext66dnn = _param1.toString();
								
edittext66d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext68d.setText(String.valueOf(00.00));
				edittext68d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		button8d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1d.getText().toString().equals("") || edittext1d.getText().toString().equals(".")) || (edittext1d.getText().toString().equals("-") || (Double.parseDouble(edittext1d.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext66d.getText().toString().equals("") || edittext66d.getText().toString().equals(".")) || (edittext66d.getText().toString().equals("-") || (Double.parseDouble(edittext66d.getText().toString()) < 0))) {
						edittext66d.setText(String.valueOf(4.6d));
					}
					edittext68d.setText(String.valueOf(Double.parseDouble(edittext1d.getText().toString()) * (Double.parseDouble(edittext66d.getText().toString()) / 100)));
					if ((edittext69d.getText().toString().equals("") || edittext69d.getText().toString().equals(".")) || (edittext69d.getText().toString().equals("-") || (Double.parseDouble(edittext69d.getText().toString()) < 0))) {
						edittext69d.setText(String.valueOf(5));
					}
					edittext68d.setTextColor(0xFF000000);
				}
			}
		});
		/*
اجمالى البتومين بدون هالك
*/
		edittext68d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext68d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext69d.getText().toString().equals("") || edittext69d.getText().toString().equals(".")) || (edittext69d.getText().toString().equals("-") || (Double.parseDouble(edittext69d.getText().toString()) < 0))) {
					edittext70d.setText(String.valueOf(00.00));
				}
				else {
					edittext70d.setText(String.valueOf(Double.parseDouble(s.toString()) + (Double.parseDouble(s.toString()) * (Double.parseDouble(edittext69d.getText().toString()) / 100))));
				}
				temp13 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo13 =child.findViewById(R.id.edittext68d);
					temp13 = temp13 + Double.parseDouble(tempo13.getText().toString());
				}
				edittext134.setText(String.valueOf(temp13));
			} });
		/*
نسبة الهالك
*/
		edittext69d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext69d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) {
					edittext70d.setText(String.valueOf(00.00));
				}
				else {
					edittext70d.setText(String.valueOf(Double.parseDouble(edittext68d.getText().toString()) + (Double.parseDouble(edittext68d.getText().toString()) * (Double.parseDouble(s.toString()) / 100))));
				}
			} });
		/*
اجمالى غبار الأسمنت شامل الهالك
*/
		edittext70d.addTextChangedListener(new TextWatcher() { 	
			@Override 	
			public void onTextChanged(CharSequence s, int start, int before, int count) { 		
				// Fires right as the text is being changed (even supplies the range of text) 	
			} 	 	
			@Override 	
			public void beforeTextChanged(CharSequence s, int start, int count, 			int after) { 	
					// Fires right before text is changing 	
				} 	 	
			@Override 	
			public void afterTextChanged(Editable s) { 	
					// Fires right after the text has changed 		
					
					
				edittext70d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				temp14 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo14 =child.findViewById(R.id.edittext70d);
					temp14 = temp14 + Double.parseDouble(tempo14.getText().toString());
				}
				edittext136.setText(String.valueOf(temp14));
			} });
		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_asphalt_material);
				/*
اجمالى سن١ بدون هالك
*/
				temp1 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext8d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext74.setText(String.valueOf(temp1));
				/*
اجمالى سن١ شامل الهالك
*/
				temp2 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo2 =child.findViewById(R.id.edittext10d);
					temp2 = temp2 + Double.parseDouble(tempo2.getText().toString());
				}
				edittext76.setText(String.valueOf(temp2));
				/*
اجمالى سن٢ بدون هالك
*/
				temp3 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo3 =child.findViewById(R.id.edittext18d);
					temp3 = temp3 + Double.parseDouble(tempo3.getText().toString());
				}
				edittext84.setText(String.valueOf(temp3));
				/*
اجمالى س٢ شامل الهالك
*/
				temp4 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo4 =child.findViewById(R.id.edittext20d);
					temp4 = temp4 + Double.parseDouble(tempo4.getText().toString());
				}
				edittext86.setText(String.valueOf(temp4));
				/*
اجمالى سن٣ بدون هالك
*/
				temp5 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo5 =child.findViewById(R.id.edittext28d);
					temp5 = temp5 + Double.parseDouble(tempo5.getText().toString());
				}
				edittext94.setText(String.valueOf(temp5));
				/*
اجمالى س٣ شامل الهالك
*/
				temp6 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo6 =child.findViewById(R.id.edittext30d);
					temp6 = temp6 + Double.parseDouble(tempo6.getText().toString());
				}
				edittext96.setText(String.valueOf(temp6));
				/*
اجمالى رمل بدون هالك
*/
				temp7 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo7 =child.findViewById(R.id.edittext38d);
					temp7 = temp7 + Double.parseDouble(tempo7.getText().toString());
				}
				edittext104.setText(String.valueOf(temp7));
				/*
اجمالى الرمل شامل الهالك
*/
				temp8 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo8 =child.findViewById(R.id.edittext40d);
					temp8 = temp8 + Double.parseDouble(tempo8.getText().toString());
				}
				edittext106.setText(String.valueOf(temp8));
				/*
اجمالى بودرة التكسير بدون هالك
*/
				temp9 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo9 =child.findViewById(R.id.edittext48d);
					temp9 = temp9 + Double.parseDouble(tempo9.getText().toString());
				}
				edittext114.setText(String.valueOf(temp9));
				/*
اجمالى بودرة التكسير شامل الهالك
*/
				temp10 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo10 =child.findViewById(R.id.edittext50d);
					temp10 = temp10 + Double.parseDouble(tempo10.getText().toString());
				}
				edittext116.setText(String.valueOf(temp10));
				/*
اجمالى غبار الأسمنت بدون هالك
*/
				temp11 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo11 =child.findViewById(R.id.edittext58d);
					temp11 = temp11 + Double.parseDouble(tempo11.getText().toString());
				}
				edittext124.setText(String.valueOf(temp11));
				/*
اجمالى غبار الأسمنت شامل الهالك
*/
				temp12 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo12 =child.findViewById(R.id.edittext60d);
					temp12 = temp12 + Double.parseDouble(tempo12.getText().toString());
				}
				edittext126.setText(String.valueOf(temp12));
				/*
اجمالى البتومين بدون هالك
*/
				temp13 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo13 =child.findViewById(R.id.edittext68d);
					temp13 = temp13 + Double.parseDouble(tempo13.getText().toString());
				}
				edittext134.setText(String.valueOf(temp13));
				/*
اجمالى غبار الأسمنت شامل الهالك
*/
				temp14 = 0;
				 for(int i=0; i<dynamic_all.getChildCount(); ++i) { 
					 View child=dynamic_all.getChildAt(i); 
					TextView tempo14 =child.findViewById(R.id.edittext70d);
					temp14 = temp14 + Double.parseDouble(tempo14.getText().toString());
				}
				edittext136.setText(String.valueOf(temp14));
			}
		});
	}
	
	
	public void _removeView(final View _view) {
		try {
				((ViewGroup) _view.getParent()).removeView(_view);
		} catch (Exception e) {
				
		}
	}
	
	
	public void _PrintHelper(final View _view) {
		Bitmap bm = Bitmap.createBitmap(_view.getWidth(), _view.getHeight(),Bitmap.Config.ARGB_8888); 
		Canvas canvas = new Canvas(bm);
		android.graphics.drawable.Drawable bgDrawable =_view.getBackground();
		_view.setDrawingCacheEnabled(true);
		
		if (bgDrawable!=null) {
				bgDrawable.draw(canvas);
		} else {
				canvas.drawColor(Color.WHITE);}
		_view.draw(canvas);
		PrintHelper printHelper = new PrintHelper(ToipccAsphaltMaterialActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
}
