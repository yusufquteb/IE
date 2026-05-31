package com.my.iengineer1;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
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
import android.widget.ImageView;
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
import java.io.InputStream;
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.*;
import org.json.*;
import android.print.PrintManager;
import android.print.PrintDocumentAdapter;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.print.PrintHelper;


public class ToipccWearingSerfaceAsphaltLayersActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private String path = "";
	private double temp1 = 0;
	private double temp2 = 0;
	private double temp3 = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview111;
	private LinearLayout linear176;
	private LinearLayout linear79;
	private LinearLayout dynamic_all;
	private LinearLayout add_dynamic_element_lin;
	private LinearLayout dynamic_sum_linear;
	private LinearLayout linear576;
	private TextView textview559;
	private LinearLayout linear583;
	private Button button4;
	private LinearLayout linear69;
	private HorizontalScrollView hscroll116;
	private LinearLayout linear190;
	private HorizontalScrollView hscroll115;
	private LinearLayout linear179;
	private HorizontalScrollView hscroll114;
	private LinearLayout linear870;
	private HorizontalScrollView hscroll112;
	private LinearLayout linear193;
	private TextView textview554;
	private TextView textview1119;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private TextView textview1120;
	private TextView textview1121;
	private EditText edittext1129;
	private TextView textview1122;
	private EditText edittext1125;
	private TextView textview1123;
	private TextView textview585;
	private TextView textview1124;
	private TextView textview808;
	private TextView textview809;
	private LinearLayout linear389;
	private LinearLayout linear575;
	private LinearLayout linear100s1;
	private LinearLayout linear77;
	private LinearLayout linear74;
	private LinearLayout linear75;
	private LinearLayout linear80;
	private LinearLayout linear504;
	private LinearLayout linear514;
	private TextView textview14;
	private HorizontalScrollView hscroll64;
	private LinearLayout linear76;
	private HorizontalScrollView hscroll65;
	private LinearLayout linear78;
	private LinearLayout linear19;
	private TextView textview1255;
	private LinearLayout linear18;
	private LinearLayout linear580;
	private LinearLayout linear587;
	private LinearLayout linear152;
	private HorizontalScrollView hscroll19;
	private LinearLayout linear418;
	private HorizontalScrollView hscroll103;
	private LinearLayout linear949;
	private TextView textview180;
	private TextView textview2;
	private EditText element_nums;
	private TextView textview160;
	private EditText element_num;
	private TextView textview1;
	private EditText edittext1;
	private TextView textview124;
	private TextView textview3;
	private TextView textview5;
	private EditText edittext2;
	private TextView textview373;
	private TextView textview4;
	private TextView textview7;
	private EditText edittext3;
	private TextView textview286;
	private TextView textview6;
	private TextView textview9;
	private EditText edittext4;
	private TextView textview368;
	private TextView textview8;
	private TextView textview11;
	private EditText edittext5;
	private TextView textview521;
	private TextView textview10;
	private Button button1;
	private TextView textview13;
	private EditText edittext6;
	private TextView textview1136;
	private TextView textview12;
	private TextView textview16;
	private EditText edittext7;
	private TextView textview370;
	private TextView textview15;
	private TextView textview18;
	private EditText edittext8;
	private TextView textview376;
	private TextView textview17;
	private TextView textview20;
	private EditText edittext9;
	private TextView textview532;
	private TextView textview19;
	private TextView textview26;
	private EditText edittext12;
	private TextView textview1257;
	private TextView textview25;
	private Button button2;
	private TextView textview22;
	private EditText edittext10;
	private TextView textview1268;
	private TextView textview21;
	private TextView textview23;
	private TextView textview1270;
	private LinearLayout linear388;
	private TextView textview24;
	private EditText edittext11;
	private TextView textview27;
	private TextView textview334;
	private LinearLayout linear118;
	private TextView textview28;
	private EditText edittext13;
	private TextView textview704;
	private Button add_dynamic_element;
	private LinearLayout linear6;
	private LinearLayout linear588;
	private LinearLayout linear950;
	private EditText edittext21;
	private TextView textview40;
	private TextView textview50;
	private EditText edittext22;
	private TextView textview1271;
	private TextView textview51;
	private TextView textview2218;
	private EditText edittext23;
	private TextView textview2219;
	private TextView textview2220;
	private TextView textview1254;
	private LinearLayout linear573;
	private HorizontalScrollView hscroll83;
	private LinearLayout linear109;
	private HorizontalScrollView hscroll84;
	private LinearLayout linear951;
	private TextView textview1248;
	private EditText edittext24;
	private TextView textview1249;
	private TextView textview1250;
	private TextView textview591;
	private EditText edittext25;
	private TextView textview594;
	private TextView textview593;
	private TextView textview2221;
	private EditText edittext26;
	private TextView textview2222;
	private TextView textview2223;
	private TextView textview1261;
	private LinearLayout linear584;
	private LinearLayout linear954;
	private LinearLayout linear585;
	private HorizontalScrollView hscroll102;
	private LinearLayout linear952;
	private TextView textview1262;
	private EditText edittext27;
	private TextView textview1263;
	private TextView textview1264;
	private Button button3;
	private TextView textview1265;
	private TextView textview2224;
	private LinearLayout linear586;
	private TextView textview1266;
	private EditText edittext28;
	private EditText edittext1130;
	private TextView textview2225;
	private LinearLayout linear953;
	private TextView textview815;
	private EditText edittext29;
	private LinearLayout linear1009;
	private HorizontalScrollView hscroll117;
	private TextView textview103;
	private HorizontalScrollView hscroll118;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private ImageView imageview6;
	private LinearLayout linear1010;
	private LinearLayout linear713;
	private HorizontalScrollView hscroll106;
	private TextView textview181;
	private HorizontalScrollView hscroll63;
	private LinearLayout linear183;
	private HorizontalScrollView hscroll75;
	private LinearLayout linear578;
	private ImageView close;
	private LinearLayout linear720;
	private TextView textview696;
	private EditText edittext30;
	private TextView textview271;
	private TextView textview272;
	private TextView textview195;
	private Button button9;
	private LinearLayout linear579;
	private TextView textview199;
	private EditText edittext31;
	private LinearLayout linear965;
	private HorizontalScrollView hscroll107;
	private TextView textview270;
	private HorizontalScrollView hscroll76;
	private LinearLayout linear184;
	private LinearLayout linear186;
	private LinearLayout linear192;
	private HorizontalScrollView hscroll77;
	private LinearLayout linear187;
	private LinearLayout linear191;
	private TextView textview114;
	private LinearLayout linear581;
	private HorizontalScrollView hscroll85;
	private LinearLayout linear589;
	private ImageView imageview1;
	private LinearLayout linear966;
	private TextView textview697;
	private EditText edittext34;
	private TextView textview276;
	private TextView textview277;
	private TextView textview698;
	private EditText edittext35;
	private TextView textview287;
	private TextView textview274;
	private Button button10;
	private TextView textview700;
	private EditText edittext37;
	private TextView textview288;
	private TextView textview279;
	private TextView textview701;
	private EditText edittext38;
	private TextView textview281;
	private TextView textview280;
	private TextView textview292;
	private TextView textview291;
	private LinearLayout linear582;
	private TextView textview1260;
	private EditText edittext39;
	private TextView textview1272;
	private EditText edittext40;
	private TextView textview1273;
	private TextView textview1274;
	private LinearLayout linear967;
	private HorizontalScrollView hscroll108;
	private TextView textview400;
	private HorizontalScrollView hscroll86;
	private TextView textview401;
	private LinearLayout linear879;
	private HorizontalScrollView hscroll91;
	private TextView textview403;
	private TextView textview404;
	private TextView textview405;
	private LinearLayout linear522;
	private TextView textview1173;
	private TextView textview409;
	private LinearLayout linear888;
	private TextView textview2101;
	private TextView textview413;
	private LinearLayout linear535;
	private TextView textview1196;
	private TextView textview417;
	private LinearLayout linear547;
	private TextView textview1181;
	private TextView textview421;
	private LinearLayout linear539;
	private TextView textview1180;
	private TextView textview425;
	private LinearLayout linear543;
	private TextView textview1188;
	private TextView textview429;
	private LinearLayout linear892;
	private TextView textview2252;
	private TextView textview556;
	private LinearLayout linear975;
	private TextView textview2108;
	private TextView textview433;
	private LinearLayout linear551;
	private TextView textview1189;
	private TextView textview2266;
	private LinearLayout linear990;
	private TextView textview2276;
	private TextView textview437;
	private LinearLayout linear900;
	private TextView textview2120;
	private EditText edittext94;
	private LinearLayout linear904;
	private TextView textview2131;
	private LinearLayout linear871;
	private HorizontalScrollView hscroll87;
	private LinearLayout linear883;
	private HorizontalScrollView hscroll92;
	private LinearLayout linear182;
	private LinearLayout linear914;
	private LinearLayout linear872;
	private HorizontalScrollView hscroll93;
	private LinearLayout linear908;
	private LinearLayout linear915;
	private LinearLayout linear909;
	private HorizontalScrollView hscroll94;
	private LinearLayout linear873;
	private LinearLayout linear917;
	private LinearLayout linear874;
	private HorizontalScrollView hscroll95;
	private LinearLayout linear875;
	private LinearLayout linear920;
	private LinearLayout linear876;
	private HorizontalScrollView hscroll96;
	private LinearLayout linear555;
	private HorizontalScrollView hscroll97;
	private LinearLayout linear556;
	private LinearLayout linear921;
	private LinearLayout linear557;
	private HorizontalScrollView hscroll98;
	private LinearLayout linear910;
	private LinearLayout linear922;
	private LinearLayout linear911;
	private HorizontalScrollView hscroll99;
	private LinearLayout linear983;
	private LinearLayout linear984;
	private LinearLayout linear985;
	private HorizontalScrollView hscroll110;
	private LinearLayout linear558;
	private HorizontalScrollView hscroll101;
	private LinearLayout linear998;
	private HorizontalScrollView hscroll111;
	private LinearLayout linear912;
	private HorizontalScrollView hscroll100;
	private LinearLayout linear913;
	private TextView textview2056;
	private LinearLayout linear885;
	private HorizontalScrollView hscroll90;
	private LinearLayout linear886;
	private ImageView imageview2;
	private LinearLayout linear968;
	private TextView textview2079;
	private EditText edittext112;
	private TextView textview2080;
	private TextView textview402;
	private LinearLayout linear523;
	private TextView textview1148;
	private LinearLayout linear524;
	private TextView textview1149;
	private LinearLayout linear525;
	private TextView textview408;
	private EditText edittext115;
	private TextView textview407;
	private EditText edittext114;
	private TextView textview406;
	private EditText edittext113;
	private LinearLayout linear889;
	private TextView textview2102;
	private LinearLayout linear890;
	private TextView textview2103;
	private LinearLayout linear891;
	private TextView textview412;
	private EditText edittext118;
	private TextView textview411;
	private EditText edittext117;
	private TextView textview410;
	private EditText edittext116;
	private LinearLayout linear536;
	private TextView textview1175;
	private LinearLayout linear537;
	private TextView textview1176;
	private LinearLayout linear538;
	private TextView textview416;
	private EditText edittext121;
	private TextView textview415;
	private EditText edittext120;
	private TextView textview414;
	private EditText edittext119;
	private LinearLayout linear548;
	private TextView textview1198;
	private LinearLayout linear549;
	private TextView textview1199;
	private LinearLayout linear550;
	private TextView textview420;
	private EditText edittext124;
	private TextView textview419;
	private EditText edittext123;
	private TextView textview418;
	private EditText edittext122;
	private LinearLayout linear540;
	private TextView textview1182;
	private LinearLayout linear541;
	private TextView textview1183;
	private LinearLayout linear542;
	private TextView textview424;
	private EditText edittext127;
	private TextView textview423;
	private EditText edittext126;
	private TextView textview422;
	private EditText edittext125;
	private LinearLayout linear544;
	private TextView textview1191;
	private LinearLayout linear545;
	private TextView textview1192;
	private LinearLayout linear546;
	private TextView textview428;
	private EditText edittext130;
	private TextView textview427;
	private EditText edittext129;
	private TextView textview426;
	private EditText edittext128;
	private LinearLayout linear893;
	private TextView textview2109;
	private LinearLayout linear894;
	private TextView textview2110;
	private LinearLayout linear895;
	private TextView textview432;
	private EditText edittext133;
	private TextView textview431;
	private EditText edittext132;
	private TextView textview430;
	private EditText edittext131;
	private LinearLayout linear976;
	private TextView textview2253;
	private LinearLayout linear977;
	private TextView textview2254;
	private LinearLayout linear978;
	private TextView textview475;
	private EditText edittext171;
	private TextView textview474;
	private EditText edittext170;
	private TextView textview473;
	private EditText edittext169;
	private LinearLayout linear552;
	private TextView textview1204;
	private LinearLayout linear553;
	private TextView textview1205;
	private LinearLayout linear554;
	private TextView textview436;
	private EditText edittext136;
	private TextView textview435;
	private EditText edittext135;
	private TextView textview434;
	private EditText edittext134;
	private LinearLayout linear991;
	private TextView textview2269;
	private LinearLayout linear992;
	private TextView textview2270;
	private LinearLayout linear993;
	private TextView textview472;
	private EditText edittext177;
	private TextView textview471;
	private EditText edittext176;
	private TextView textview470;
	private EditText edittext175;
	private LinearLayout linear901;
	private TextView textview2121;
	private LinearLayout linear902;
	private TextView textview2122;
	private LinearLayout linear903;
	private TextView textview440;
	private EditText edittext139;
	private TextView textview439;
	private EditText edittext138;
	private TextView textview438;
	private EditText edittext137;
	private LinearLayout linear905;
	private TextView textview2126;
	private LinearLayout linear906;
	private TextView textview2127;
	private LinearLayout linear907;
	private TextView textview443;
	private EditText edittext142;
	private TextView textview442;
	private EditText edittext141;
	private TextView textview441;
	private EditText edittext140;
	private Button button11;
	private TextView textview2088;
	private EditText edittext144;
	private TextView textview2089;
	private TextView textview444;
	private TextView textview514;
	private EditText edittext145;
	private TextView textview268;
	private TextView textview445;
	private TextView textview2150;
	private EditText edittext146;
	private TextView textview2151;
	private TextView textview446;
	private TextView textview2057;
	private EditText edittext147;
	private TextView textview2058;
	private TextView textview447;
	private TextView textview2132;
	private EditText edittext148;
	private TextView textview2133;
	private TextView textview448;
	private TextView textview2153;
	private EditText edittext149;
	private TextView textview2154;
	private TextView textview449;
	private TextView textview2135;
	private EditText edittext150;
	private TextView textview2136;
	private TextView textview450;
	private TextView textview2060;
	private EditText edittext151;
	private TextView textview2061;
	private TextView textview451;
	private TextView textview2159;
	private EditText edittext152;
	private TextView textview2160;
	private TextView textview452;
	private TextView textview2063;
	private EditText edittext153;
	private TextView textview2064;
	private TextView textview453;
	private TextView textview2066;
	private EditText edittext154;
	private TextView textview2067;
	private TextView textview454;
	private TextView textview2168;
	private EditText edittext155;
	private TextView textview2169;
	private TextView textview455;
	private TextView textview2069;
	private EditText edittext156;
	private TextView textview2070;
	private TextView textview456;
	private TextView textview1211;
	private EditText edittext157;
	private TextView textview1209;
	private TextView textview457;
	private TextView textview367;
	private EditText edittext158;
	private TextView textview1212;
	private TextView textview458;
	private TextView textview2171;
	private EditText edittext159;
	private TextView textview2172;
	private TextView textview459;
	private TextView textview1214;
	private EditText edittext160;
	private TextView textview1215;
	private TextView textview460;
	private TextView textview2138;
	private EditText edittext161;
	private TextView textview2139;
	private TextView textview461;
	private TextView textview2174;
	private EditText edittext162;
	private TextView textview2175;
	private TextView textview462;
	private TextView textview2141;
	private EditText edittext163;
	private TextView textview2142;
	private TextView textview463;
	private TextView textview2257;
	private EditText edittext172;
	private TextView textview2258;
	private TextView textview2259;
	private TextView textview2260;
	private EditText edittext173;
	private TextView textview2261;
	private TextView textview2262;
	private TextView textview2263;
	private EditText edittext174;
	private TextView textview2264;
	private TextView textview2265;
	private TextView textview1217;
	private EditText edittext164;
	private TextView textview1218;
	private TextView textview464;
	private TextView textview2277;
	private EditText edittext178;
	private TextView textview2278;
	private TextView textview2279;
	private TextView textview2144;
	private EditText edittext165;
	private TextView textview2145;
	private TextView textview465;
	private TextView textview2147;
	private EditText edittext166;
	private TextView textview2148;
	private TextView textview466;
	private TextView textview467;
	private TextView textview2095;
	private LinearLayout linear887;
	private TextView textview2096;
	private EditText edittext167;
	private TextView textview2097;
	private EditText edittext168;
	private TextView textview2098;
	private TextView textview468;
	private LinearLayout linear973;
	private HorizontalScrollView hscroll109;
	private TextView textview600;
	private HorizontalScrollView hscroll78;
	private LinearLayout linear194;
	private HorizontalScrollView hscroll119;
	private LinearLayout linear195;
	private TextView textview604;
	private TextView textview605;
	private LinearLayout linear202;
	private TextView textview519;
	private TextView textview608;
	private LinearLayout linear923;
	private TextView textview2181;
	private TextView textview611;
	private LinearLayout linear929;
	private TextView textview2189;
	private TextView textview614;
	private LinearLayout linear932;
	private TextView textview2194;
	private TextView textview617;
	private LinearLayout linear219;
	private TextView textview667;
	private TextView textview620;
	private LinearLayout linear223;
	private TextView textview680;
	private TextView textview623;
	private LinearLayout linear935;
	private TextView textview2199;
	private TextView textview665;
	private LinearLayout linear999;
	private TextView textview2284;
	private TextView textview626;
	private LinearLayout linear938;
	private TextView textview2204;
	private TextView textview688;
	private LinearLayout linear1002;
	private TextView textview2289;
	private TextView textview629;
	private LinearLayout linear941;
	private TextView textview2209;
	private EditText edittext221;
	private LinearLayout linear227;
	private TextView textview682;
	private LinearLayout linear197;
	private LinearLayout linear964;
	private LinearLayout linear196;
	private LinearLayout linear198;
	private HorizontalScrollView hscroll104;
	private LinearLayout linear955;
	private LinearLayout linear956;
	private LinearLayout linear199;
	private LinearLayout linear231;
	private LinearLayout linear232;
	private LinearLayout linear957;
	private LinearLayout linear958;
	private LinearLayout linear1005;
	private LinearLayout linear959;
	private LinearLayout linear1008;
	private LinearLayout linear233;
	private LinearLayout linear960;
	private LinearLayout linear200;
	private TextView textview681;
	private LinearLayout linear961;
	private HorizontalScrollView hscroll105;
	private LinearLayout linear962;
	private ImageView imageview5;
	private LinearLayout linear974;
	private TextView textview671;
	private EditText edittext201;
	private TextView textview670;
	private TextView textview601;
	private TextView textview695;
	private EditText edittext203;
	private TextView textview676;
	private TextView textview603;
	private LinearLayout linear218;
	private TextView textview679;
	private LinearLayout linear203;
	private TextView textview607;
	private EditText edittext205;
	private TextView textview606;
	private EditText edittext204;
	private LinearLayout linear924;
	private TextView textview2178;
	private LinearLayout linear925;
	private TextView textview610;
	private EditText edittext207;
	private TextView textview609;
	private EditText edittext206;
	private LinearLayout linear930;
	private TextView textview2186;
	private LinearLayout linear931;
	private TextView textview613;
	private EditText edittext209;
	private TextView textview612;
	private EditText edittext208;
	private TextView textview616;
	private EditText edittext210;
	private TextView textview2192;
	private TextView textview615;
	private LinearLayout linear220;
	private TextView textview677;
	private LinearLayout linear222;
	private TextView textview619;
	private EditText edittext212;
	private TextView textview618;
	private EditText edittext211;
	private LinearLayout linear224;
	private TextView textview674;
	private LinearLayout linear226;
	private TextView textview622;
	private EditText edittext214;
	private TextView textview621;
	private EditText edittext213;
	private LinearLayout linear936;
	private TextView textview2196;
	private LinearLayout linear937;
	private TextView textview625;
	private EditText edittext216;
	private TextView textview624;
	private EditText edittext215;
	private LinearLayout linear1000;
	private TextView textview2281;
	private LinearLayout linear1001;
	private TextView textview668;
	private EditText edittext241;
	private TextView textview666;
	private EditText edittext240;
	private LinearLayout linear939;
	private TextView textview2201;
	private LinearLayout linear940;
	private TextView textview628;
	private EditText edittext218;
	private TextView textview627;
	private EditText edittext217;
	private LinearLayout linear1003;
	private TextView textview2286;
	private LinearLayout linear1004;
	private TextView textview685;
	private EditText edittext244;
	private TextView textview686;
	private EditText edittext243;
	private LinearLayout linear942;
	private TextView textview2206;
	private LinearLayout linear943;
	private TextView textview631;
	private EditText edittext220;
	private TextView textview630;
	private EditText edittext219;
	private LinearLayout linear228;
	private TextView textview675;
	private LinearLayout linear230;
	private TextView textview633;
	private EditText edittext223;
	private TextView textview632;
	private EditText edittext222;
	private Button button12;
	private TextView textview2249;
	private EditText edittext239;
	private TextView textview2250;
	private TextView textview2251;
	private TextView textview635;
	private EditText edittext224;
	private TextView textview661;
	private TextView textview634;
	private TextView textview637;
	private EditText edittext225;
	private TextView textview672;
	private TextView textview636;
	private TextView textview639;
	private EditText edittext226;
	private TextView textview2227;
	private TextView textview638;
	private TextView textview641;
	private EditText edittext227;
	private TextView textview2230;
	private TextView textview640;
	private TextView textview643;
	private EditText edittext228;
	private TextView textview663;
	private TextView textview642;
	private TextView textview645;
	private EditText edittext229;
	private TextView textview684;
	private TextView textview644;
	private TextView textview647;
	private EditText edittext230;
	private TextView textview687;
	private TextView textview646;
	private TextView textview649;
	private EditText edittext231;
	private TextView textview2233;
	private TextView textview648;
	private TextView textview651;
	private EditText edittext232;
	private TextView textview2236;
	private TextView textview650;
	private TextView textview2290;
	private EditText edittext242;
	private TextView textview2291;
	private TextView textview669;
	private TextView textview653;
	private EditText edittext233;
	private TextView textview2239;
	private TextView textview652;
	private TextView textview2299;
	private EditText edittext245;
	private TextView textview2300;
	private TextView textview690;
	private TextView textview655;
	private EditText edittext234;
	private TextView textview689;
	private TextView textview654;
	private TextView textview657;
	private EditText edittext235;
	private TextView textview2242;
	private TextView textview656;
	private TextView textview659;
	private EditText edittext236;
	private TextView textview673;
	private TextView textview658;
	private TextView textview660;
	private TextView textview535;
	private LinearLayout linear201;
	private TextView textview678;
	private EditText edittext237;
	private TextView textview664;
	private EditText edittext238;
	private TextView textview2244;
	private TextView textview662;
	
	private Intent price = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_wearing_serface_asphalt_layers);
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
		linear79 = findViewById(R.id.linear79);
		dynamic_all = findViewById(R.id.dynamic_all);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		dynamic_sum_linear = findViewById(R.id.dynamic_sum_linear);
		linear576 = findViewById(R.id.linear576);
		textview559 = findViewById(R.id.textview559);
		linear583 = findViewById(R.id.linear583);
		button4 = findViewById(R.id.button4);
		linear69 = findViewById(R.id.linear69);
		hscroll116 = findViewById(R.id.hscroll116);
		linear190 = findViewById(R.id.linear190);
		hscroll115 = findViewById(R.id.hscroll115);
		linear179 = findViewById(R.id.linear179);
		hscroll114 = findViewById(R.id.hscroll114);
		linear870 = findViewById(R.id.linear870);
		hscroll112 = findViewById(R.id.hscroll112);
		linear193 = findViewById(R.id.linear193);
		textview554 = findViewById(R.id.textview554);
		textview1119 = findViewById(R.id.textview1119);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		textview1120 = findViewById(R.id.textview1120);
		textview1121 = findViewById(R.id.textview1121);
		edittext1129 = findViewById(R.id.edittext1129);
		textview1122 = findViewById(R.id.textview1122);
		edittext1125 = findViewById(R.id.edittext1125);
		textview1123 = findViewById(R.id.textview1123);
		textview585 = findViewById(R.id.textview585);
		textview1124 = findViewById(R.id.textview1124);
		textview808 = findViewById(R.id.textview808);
		textview809 = findViewById(R.id.textview809);
		linear389 = findViewById(R.id.linear389);
		linear575 = findViewById(R.id.linear575);
		linear100s1 = findViewById(R.id.linear100s1);
		linear77 = findViewById(R.id.linear77);
		linear74 = findViewById(R.id.linear74);
		linear75 = findViewById(R.id.linear75);
		linear80 = findViewById(R.id.linear80);
		linear504 = findViewById(R.id.linear504);
		linear514 = findViewById(R.id.linear514);
		textview14 = findViewById(R.id.textview14);
		hscroll64 = findViewById(R.id.hscroll64);
		linear76 = findViewById(R.id.linear76);
		hscroll65 = findViewById(R.id.hscroll65);
		linear78 = findViewById(R.id.linear78);
		linear19 = findViewById(R.id.linear19);
		textview1255 = findViewById(R.id.textview1255);
		linear18 = findViewById(R.id.linear18);
		linear580 = findViewById(R.id.linear580);
		linear587 = findViewById(R.id.linear587);
		linear152 = findViewById(R.id.linear152);
		hscroll19 = findViewById(R.id.hscroll19);
		linear418 = findViewById(R.id.linear418);
		hscroll103 = findViewById(R.id.hscroll103);
		linear949 = findViewById(R.id.linear949);
		textview180 = findViewById(R.id.textview180);
		textview2 = findViewById(R.id.textview2);
		element_nums = findViewById(R.id.element_nums);
		textview160 = findViewById(R.id.textview160);
		element_num = findViewById(R.id.element_num);
		textview1 = findViewById(R.id.textview1);
		edittext1 = findViewById(R.id.edittext1);
		textview124 = findViewById(R.id.textview124);
		textview3 = findViewById(R.id.textview3);
		textview5 = findViewById(R.id.textview5);
		edittext2 = findViewById(R.id.edittext2);
		textview373 = findViewById(R.id.textview373);
		textview4 = findViewById(R.id.textview4);
		textview7 = findViewById(R.id.textview7);
		edittext3 = findViewById(R.id.edittext3);
		textview286 = findViewById(R.id.textview286);
		textview6 = findViewById(R.id.textview6);
		textview9 = findViewById(R.id.textview9);
		edittext4 = findViewById(R.id.edittext4);
		textview368 = findViewById(R.id.textview368);
		textview8 = findViewById(R.id.textview8);
		textview11 = findViewById(R.id.textview11);
		edittext5 = findViewById(R.id.edittext5);
		textview521 = findViewById(R.id.textview521);
		textview10 = findViewById(R.id.textview10);
		button1 = findViewById(R.id.button1);
		textview13 = findViewById(R.id.textview13);
		edittext6 = findViewById(R.id.edittext6);
		textview1136 = findViewById(R.id.textview1136);
		textview12 = findViewById(R.id.textview12);
		textview16 = findViewById(R.id.textview16);
		edittext7 = findViewById(R.id.edittext7);
		textview370 = findViewById(R.id.textview370);
		textview15 = findViewById(R.id.textview15);
		textview18 = findViewById(R.id.textview18);
		edittext8 = findViewById(R.id.edittext8);
		textview376 = findViewById(R.id.textview376);
		textview17 = findViewById(R.id.textview17);
		textview20 = findViewById(R.id.textview20);
		edittext9 = findViewById(R.id.edittext9);
		textview532 = findViewById(R.id.textview532);
		textview19 = findViewById(R.id.textview19);
		textview26 = findViewById(R.id.textview26);
		edittext12 = findViewById(R.id.edittext12);
		textview1257 = findViewById(R.id.textview1257);
		textview25 = findViewById(R.id.textview25);
		button2 = findViewById(R.id.button2);
		textview22 = findViewById(R.id.textview22);
		edittext10 = findViewById(R.id.edittext10);
		textview1268 = findViewById(R.id.textview1268);
		textview21 = findViewById(R.id.textview21);
		textview23 = findViewById(R.id.textview23);
		textview1270 = findViewById(R.id.textview1270);
		linear388 = findViewById(R.id.linear388);
		textview24 = findViewById(R.id.textview24);
		edittext11 = findViewById(R.id.edittext11);
		textview27 = findViewById(R.id.textview27);
		textview334 = findViewById(R.id.textview334);
		linear118 = findViewById(R.id.linear118);
		textview28 = findViewById(R.id.textview28);
		edittext13 = findViewById(R.id.edittext13);
		textview704 = findViewById(R.id.textview704);
		add_dynamic_element = findViewById(R.id.add_dynamic_element);
		linear6 = findViewById(R.id.linear6);
		linear588 = findViewById(R.id.linear588);
		linear950 = findViewById(R.id.linear950);
		edittext21 = findViewById(R.id.edittext21);
		textview40 = findViewById(R.id.textview40);
		textview50 = findViewById(R.id.textview50);
		edittext22 = findViewById(R.id.edittext22);
		textview1271 = findViewById(R.id.textview1271);
		textview51 = findViewById(R.id.textview51);
		textview2218 = findViewById(R.id.textview2218);
		edittext23 = findViewById(R.id.edittext23);
		textview2219 = findViewById(R.id.textview2219);
		textview2220 = findViewById(R.id.textview2220);
		textview1254 = findViewById(R.id.textview1254);
		linear573 = findViewById(R.id.linear573);
		hscroll83 = findViewById(R.id.hscroll83);
		linear109 = findViewById(R.id.linear109);
		hscroll84 = findViewById(R.id.hscroll84);
		linear951 = findViewById(R.id.linear951);
		textview1248 = findViewById(R.id.textview1248);
		edittext24 = findViewById(R.id.edittext24);
		textview1249 = findViewById(R.id.textview1249);
		textview1250 = findViewById(R.id.textview1250);
		textview591 = findViewById(R.id.textview591);
		edittext25 = findViewById(R.id.edittext25);
		textview594 = findViewById(R.id.textview594);
		textview593 = findViewById(R.id.textview593);
		textview2221 = findViewById(R.id.textview2221);
		edittext26 = findViewById(R.id.edittext26);
		textview2222 = findViewById(R.id.textview2222);
		textview2223 = findViewById(R.id.textview2223);
		textview1261 = findViewById(R.id.textview1261);
		linear584 = findViewById(R.id.linear584);
		linear954 = findViewById(R.id.linear954);
		linear585 = findViewById(R.id.linear585);
		hscroll102 = findViewById(R.id.hscroll102);
		linear952 = findViewById(R.id.linear952);
		textview1262 = findViewById(R.id.textview1262);
		edittext27 = findViewById(R.id.edittext27);
		textview1263 = findViewById(R.id.textview1263);
		textview1264 = findViewById(R.id.textview1264);
		button3 = findViewById(R.id.button3);
		textview1265 = findViewById(R.id.textview1265);
		textview2224 = findViewById(R.id.textview2224);
		linear586 = findViewById(R.id.linear586);
		textview1266 = findViewById(R.id.textview1266);
		edittext28 = findViewById(R.id.edittext28);
		edittext1130 = findViewById(R.id.edittext1130);
		textview2225 = findViewById(R.id.textview2225);
		linear953 = findViewById(R.id.linear953);
		textview815 = findViewById(R.id.textview815);
		edittext29 = findViewById(R.id.edittext29);
		linear1009 = findViewById(R.id.linear1009);
		hscroll117 = findViewById(R.id.hscroll117);
		textview103 = findViewById(R.id.textview103);
		hscroll118 = findViewById(R.id.hscroll118);
		button5 = findViewById(R.id.button5);
		button6 = findViewById(R.id.button6);
		button7 = findViewById(R.id.button7);
		button8 = findViewById(R.id.button8);
		imageview6 = findViewById(R.id.imageview6);
		linear1010 = findViewById(R.id.linear1010);
		linear713 = findViewById(R.id.linear713);
		hscroll106 = findViewById(R.id.hscroll106);
		textview181 = findViewById(R.id.textview181);
		hscroll63 = findViewById(R.id.hscroll63);
		linear183 = findViewById(R.id.linear183);
		hscroll75 = findViewById(R.id.hscroll75);
		linear578 = findViewById(R.id.linear578);
		close = findViewById(R.id.close);
		linear720 = findViewById(R.id.linear720);
		textview696 = findViewById(R.id.textview696);
		edittext30 = findViewById(R.id.edittext30);
		textview271 = findViewById(R.id.textview271);
		textview272 = findViewById(R.id.textview272);
		textview195 = findViewById(R.id.textview195);
		button9 = findViewById(R.id.button9);
		linear579 = findViewById(R.id.linear579);
		textview199 = findViewById(R.id.textview199);
		edittext31 = findViewById(R.id.edittext31);
		linear965 = findViewById(R.id.linear965);
		hscroll107 = findViewById(R.id.hscroll107);
		textview270 = findViewById(R.id.textview270);
		hscroll76 = findViewById(R.id.hscroll76);
		linear184 = findViewById(R.id.linear184);
		linear186 = findViewById(R.id.linear186);
		linear192 = findViewById(R.id.linear192);
		hscroll77 = findViewById(R.id.hscroll77);
		linear187 = findViewById(R.id.linear187);
		linear191 = findViewById(R.id.linear191);
		textview114 = findViewById(R.id.textview114);
		linear581 = findViewById(R.id.linear581);
		hscroll85 = findViewById(R.id.hscroll85);
		linear589 = findViewById(R.id.linear589);
		imageview1 = findViewById(R.id.imageview1);
		linear966 = findViewById(R.id.linear966);
		textview697 = findViewById(R.id.textview697);
		edittext34 = findViewById(R.id.edittext34);
		textview276 = findViewById(R.id.textview276);
		textview277 = findViewById(R.id.textview277);
		textview698 = findViewById(R.id.textview698);
		edittext35 = findViewById(R.id.edittext35);
		textview287 = findViewById(R.id.textview287);
		textview274 = findViewById(R.id.textview274);
		button10 = findViewById(R.id.button10);
		textview700 = findViewById(R.id.textview700);
		edittext37 = findViewById(R.id.edittext37);
		textview288 = findViewById(R.id.textview288);
		textview279 = findViewById(R.id.textview279);
		textview701 = findViewById(R.id.textview701);
		edittext38 = findViewById(R.id.edittext38);
		textview281 = findViewById(R.id.textview281);
		textview280 = findViewById(R.id.textview280);
		textview292 = findViewById(R.id.textview292);
		textview291 = findViewById(R.id.textview291);
		linear582 = findViewById(R.id.linear582);
		textview1260 = findViewById(R.id.textview1260);
		edittext39 = findViewById(R.id.edittext39);
		textview1272 = findViewById(R.id.textview1272);
		edittext40 = findViewById(R.id.edittext40);
		textview1273 = findViewById(R.id.textview1273);
		textview1274 = findViewById(R.id.textview1274);
		linear967 = findViewById(R.id.linear967);
		hscroll108 = findViewById(R.id.hscroll108);
		textview400 = findViewById(R.id.textview400);
		hscroll86 = findViewById(R.id.hscroll86);
		textview401 = findViewById(R.id.textview401);
		linear879 = findViewById(R.id.linear879);
		hscroll91 = findViewById(R.id.hscroll91);
		textview403 = findViewById(R.id.textview403);
		textview404 = findViewById(R.id.textview404);
		textview405 = findViewById(R.id.textview405);
		linear522 = findViewById(R.id.linear522);
		textview1173 = findViewById(R.id.textview1173);
		textview409 = findViewById(R.id.textview409);
		linear888 = findViewById(R.id.linear888);
		textview2101 = findViewById(R.id.textview2101);
		textview413 = findViewById(R.id.textview413);
		linear535 = findViewById(R.id.linear535);
		textview1196 = findViewById(R.id.textview1196);
		textview417 = findViewById(R.id.textview417);
		linear547 = findViewById(R.id.linear547);
		textview1181 = findViewById(R.id.textview1181);
		textview421 = findViewById(R.id.textview421);
		linear539 = findViewById(R.id.linear539);
		textview1180 = findViewById(R.id.textview1180);
		textview425 = findViewById(R.id.textview425);
		linear543 = findViewById(R.id.linear543);
		textview1188 = findViewById(R.id.textview1188);
		textview429 = findViewById(R.id.textview429);
		linear892 = findViewById(R.id.linear892);
		textview2252 = findViewById(R.id.textview2252);
		textview556 = findViewById(R.id.textview556);
		linear975 = findViewById(R.id.linear975);
		textview2108 = findViewById(R.id.textview2108);
		textview433 = findViewById(R.id.textview433);
		linear551 = findViewById(R.id.linear551);
		textview1189 = findViewById(R.id.textview1189);
		textview2266 = findViewById(R.id.textview2266);
		linear990 = findViewById(R.id.linear990);
		textview2276 = findViewById(R.id.textview2276);
		textview437 = findViewById(R.id.textview437);
		linear900 = findViewById(R.id.linear900);
		textview2120 = findViewById(R.id.textview2120);
		edittext94 = findViewById(R.id.edittext94);
		linear904 = findViewById(R.id.linear904);
		textview2131 = findViewById(R.id.textview2131);
		linear871 = findViewById(R.id.linear871);
		hscroll87 = findViewById(R.id.hscroll87);
		linear883 = findViewById(R.id.linear883);
		hscroll92 = findViewById(R.id.hscroll92);
		linear182 = findViewById(R.id.linear182);
		linear914 = findViewById(R.id.linear914);
		linear872 = findViewById(R.id.linear872);
		hscroll93 = findViewById(R.id.hscroll93);
		linear908 = findViewById(R.id.linear908);
		linear915 = findViewById(R.id.linear915);
		linear909 = findViewById(R.id.linear909);
		hscroll94 = findViewById(R.id.hscroll94);
		linear873 = findViewById(R.id.linear873);
		linear917 = findViewById(R.id.linear917);
		linear874 = findViewById(R.id.linear874);
		hscroll95 = findViewById(R.id.hscroll95);
		linear875 = findViewById(R.id.linear875);
		linear920 = findViewById(R.id.linear920);
		linear876 = findViewById(R.id.linear876);
		hscroll96 = findViewById(R.id.hscroll96);
		linear555 = findViewById(R.id.linear555);
		hscroll97 = findViewById(R.id.hscroll97);
		linear556 = findViewById(R.id.linear556);
		linear921 = findViewById(R.id.linear921);
		linear557 = findViewById(R.id.linear557);
		hscroll98 = findViewById(R.id.hscroll98);
		linear910 = findViewById(R.id.linear910);
		linear922 = findViewById(R.id.linear922);
		linear911 = findViewById(R.id.linear911);
		hscroll99 = findViewById(R.id.hscroll99);
		linear983 = findViewById(R.id.linear983);
		linear984 = findViewById(R.id.linear984);
		linear985 = findViewById(R.id.linear985);
		hscroll110 = findViewById(R.id.hscroll110);
		linear558 = findViewById(R.id.linear558);
		hscroll101 = findViewById(R.id.hscroll101);
		linear998 = findViewById(R.id.linear998);
		hscroll111 = findViewById(R.id.hscroll111);
		linear912 = findViewById(R.id.linear912);
		hscroll100 = findViewById(R.id.hscroll100);
		linear913 = findViewById(R.id.linear913);
		textview2056 = findViewById(R.id.textview2056);
		linear885 = findViewById(R.id.linear885);
		hscroll90 = findViewById(R.id.hscroll90);
		linear886 = findViewById(R.id.linear886);
		imageview2 = findViewById(R.id.imageview2);
		linear968 = findViewById(R.id.linear968);
		textview2079 = findViewById(R.id.textview2079);
		edittext112 = findViewById(R.id.edittext112);
		textview2080 = findViewById(R.id.textview2080);
		textview402 = findViewById(R.id.textview402);
		linear523 = findViewById(R.id.linear523);
		textview1148 = findViewById(R.id.textview1148);
		linear524 = findViewById(R.id.linear524);
		textview1149 = findViewById(R.id.textview1149);
		linear525 = findViewById(R.id.linear525);
		textview408 = findViewById(R.id.textview408);
		edittext115 = findViewById(R.id.edittext115);
		textview407 = findViewById(R.id.textview407);
		edittext114 = findViewById(R.id.edittext114);
		textview406 = findViewById(R.id.textview406);
		edittext113 = findViewById(R.id.edittext113);
		linear889 = findViewById(R.id.linear889);
		textview2102 = findViewById(R.id.textview2102);
		linear890 = findViewById(R.id.linear890);
		textview2103 = findViewById(R.id.textview2103);
		linear891 = findViewById(R.id.linear891);
		textview412 = findViewById(R.id.textview412);
		edittext118 = findViewById(R.id.edittext118);
		textview411 = findViewById(R.id.textview411);
		edittext117 = findViewById(R.id.edittext117);
		textview410 = findViewById(R.id.textview410);
		edittext116 = findViewById(R.id.edittext116);
		linear536 = findViewById(R.id.linear536);
		textview1175 = findViewById(R.id.textview1175);
		linear537 = findViewById(R.id.linear537);
		textview1176 = findViewById(R.id.textview1176);
		linear538 = findViewById(R.id.linear538);
		textview416 = findViewById(R.id.textview416);
		edittext121 = findViewById(R.id.edittext121);
		textview415 = findViewById(R.id.textview415);
		edittext120 = findViewById(R.id.edittext120);
		textview414 = findViewById(R.id.textview414);
		edittext119 = findViewById(R.id.edittext119);
		linear548 = findViewById(R.id.linear548);
		textview1198 = findViewById(R.id.textview1198);
		linear549 = findViewById(R.id.linear549);
		textview1199 = findViewById(R.id.textview1199);
		linear550 = findViewById(R.id.linear550);
		textview420 = findViewById(R.id.textview420);
		edittext124 = findViewById(R.id.edittext124);
		textview419 = findViewById(R.id.textview419);
		edittext123 = findViewById(R.id.edittext123);
		textview418 = findViewById(R.id.textview418);
		edittext122 = findViewById(R.id.edittext122);
		linear540 = findViewById(R.id.linear540);
		textview1182 = findViewById(R.id.textview1182);
		linear541 = findViewById(R.id.linear541);
		textview1183 = findViewById(R.id.textview1183);
		linear542 = findViewById(R.id.linear542);
		textview424 = findViewById(R.id.textview424);
		edittext127 = findViewById(R.id.edittext127);
		textview423 = findViewById(R.id.textview423);
		edittext126 = findViewById(R.id.edittext126);
		textview422 = findViewById(R.id.textview422);
		edittext125 = findViewById(R.id.edittext125);
		linear544 = findViewById(R.id.linear544);
		textview1191 = findViewById(R.id.textview1191);
		linear545 = findViewById(R.id.linear545);
		textview1192 = findViewById(R.id.textview1192);
		linear546 = findViewById(R.id.linear546);
		textview428 = findViewById(R.id.textview428);
		edittext130 = findViewById(R.id.edittext130);
		textview427 = findViewById(R.id.textview427);
		edittext129 = findViewById(R.id.edittext129);
		textview426 = findViewById(R.id.textview426);
		edittext128 = findViewById(R.id.edittext128);
		linear893 = findViewById(R.id.linear893);
		textview2109 = findViewById(R.id.textview2109);
		linear894 = findViewById(R.id.linear894);
		textview2110 = findViewById(R.id.textview2110);
		linear895 = findViewById(R.id.linear895);
		textview432 = findViewById(R.id.textview432);
		edittext133 = findViewById(R.id.edittext133);
		textview431 = findViewById(R.id.textview431);
		edittext132 = findViewById(R.id.edittext132);
		textview430 = findViewById(R.id.textview430);
		edittext131 = findViewById(R.id.edittext131);
		linear976 = findViewById(R.id.linear976);
		textview2253 = findViewById(R.id.textview2253);
		linear977 = findViewById(R.id.linear977);
		textview2254 = findViewById(R.id.textview2254);
		linear978 = findViewById(R.id.linear978);
		textview475 = findViewById(R.id.textview475);
		edittext171 = findViewById(R.id.edittext171);
		textview474 = findViewById(R.id.textview474);
		edittext170 = findViewById(R.id.edittext170);
		textview473 = findViewById(R.id.textview473);
		edittext169 = findViewById(R.id.edittext169);
		linear552 = findViewById(R.id.linear552);
		textview1204 = findViewById(R.id.textview1204);
		linear553 = findViewById(R.id.linear553);
		textview1205 = findViewById(R.id.textview1205);
		linear554 = findViewById(R.id.linear554);
		textview436 = findViewById(R.id.textview436);
		edittext136 = findViewById(R.id.edittext136);
		textview435 = findViewById(R.id.textview435);
		edittext135 = findViewById(R.id.edittext135);
		textview434 = findViewById(R.id.textview434);
		edittext134 = findViewById(R.id.edittext134);
		linear991 = findViewById(R.id.linear991);
		textview2269 = findViewById(R.id.textview2269);
		linear992 = findViewById(R.id.linear992);
		textview2270 = findViewById(R.id.textview2270);
		linear993 = findViewById(R.id.linear993);
		textview472 = findViewById(R.id.textview472);
		edittext177 = findViewById(R.id.edittext177);
		textview471 = findViewById(R.id.textview471);
		edittext176 = findViewById(R.id.edittext176);
		textview470 = findViewById(R.id.textview470);
		edittext175 = findViewById(R.id.edittext175);
		linear901 = findViewById(R.id.linear901);
		textview2121 = findViewById(R.id.textview2121);
		linear902 = findViewById(R.id.linear902);
		textview2122 = findViewById(R.id.textview2122);
		linear903 = findViewById(R.id.linear903);
		textview440 = findViewById(R.id.textview440);
		edittext139 = findViewById(R.id.edittext139);
		textview439 = findViewById(R.id.textview439);
		edittext138 = findViewById(R.id.edittext138);
		textview438 = findViewById(R.id.textview438);
		edittext137 = findViewById(R.id.edittext137);
		linear905 = findViewById(R.id.linear905);
		textview2126 = findViewById(R.id.textview2126);
		linear906 = findViewById(R.id.linear906);
		textview2127 = findViewById(R.id.textview2127);
		linear907 = findViewById(R.id.linear907);
		textview443 = findViewById(R.id.textview443);
		edittext142 = findViewById(R.id.edittext142);
		textview442 = findViewById(R.id.textview442);
		edittext141 = findViewById(R.id.edittext141);
		textview441 = findViewById(R.id.textview441);
		edittext140 = findViewById(R.id.edittext140);
		button11 = findViewById(R.id.button11);
		textview2088 = findViewById(R.id.textview2088);
		edittext144 = findViewById(R.id.edittext144);
		textview2089 = findViewById(R.id.textview2089);
		textview444 = findViewById(R.id.textview444);
		textview514 = findViewById(R.id.textview514);
		edittext145 = findViewById(R.id.edittext145);
		textview268 = findViewById(R.id.textview268);
		textview445 = findViewById(R.id.textview445);
		textview2150 = findViewById(R.id.textview2150);
		edittext146 = findViewById(R.id.edittext146);
		textview2151 = findViewById(R.id.textview2151);
		textview446 = findViewById(R.id.textview446);
		textview2057 = findViewById(R.id.textview2057);
		edittext147 = findViewById(R.id.edittext147);
		textview2058 = findViewById(R.id.textview2058);
		textview447 = findViewById(R.id.textview447);
		textview2132 = findViewById(R.id.textview2132);
		edittext148 = findViewById(R.id.edittext148);
		textview2133 = findViewById(R.id.textview2133);
		textview448 = findViewById(R.id.textview448);
		textview2153 = findViewById(R.id.textview2153);
		edittext149 = findViewById(R.id.edittext149);
		textview2154 = findViewById(R.id.textview2154);
		textview449 = findViewById(R.id.textview449);
		textview2135 = findViewById(R.id.textview2135);
		edittext150 = findViewById(R.id.edittext150);
		textview2136 = findViewById(R.id.textview2136);
		textview450 = findViewById(R.id.textview450);
		textview2060 = findViewById(R.id.textview2060);
		edittext151 = findViewById(R.id.edittext151);
		textview2061 = findViewById(R.id.textview2061);
		textview451 = findViewById(R.id.textview451);
		textview2159 = findViewById(R.id.textview2159);
		edittext152 = findViewById(R.id.edittext152);
		textview2160 = findViewById(R.id.textview2160);
		textview452 = findViewById(R.id.textview452);
		textview2063 = findViewById(R.id.textview2063);
		edittext153 = findViewById(R.id.edittext153);
		textview2064 = findViewById(R.id.textview2064);
		textview453 = findViewById(R.id.textview453);
		textview2066 = findViewById(R.id.textview2066);
		edittext154 = findViewById(R.id.edittext154);
		textview2067 = findViewById(R.id.textview2067);
		textview454 = findViewById(R.id.textview454);
		textview2168 = findViewById(R.id.textview2168);
		edittext155 = findViewById(R.id.edittext155);
		textview2169 = findViewById(R.id.textview2169);
		textview455 = findViewById(R.id.textview455);
		textview2069 = findViewById(R.id.textview2069);
		edittext156 = findViewById(R.id.edittext156);
		textview2070 = findViewById(R.id.textview2070);
		textview456 = findViewById(R.id.textview456);
		textview1211 = findViewById(R.id.textview1211);
		edittext157 = findViewById(R.id.edittext157);
		textview1209 = findViewById(R.id.textview1209);
		textview457 = findViewById(R.id.textview457);
		textview367 = findViewById(R.id.textview367);
		edittext158 = findViewById(R.id.edittext158);
		textview1212 = findViewById(R.id.textview1212);
		textview458 = findViewById(R.id.textview458);
		textview2171 = findViewById(R.id.textview2171);
		edittext159 = findViewById(R.id.edittext159);
		textview2172 = findViewById(R.id.textview2172);
		textview459 = findViewById(R.id.textview459);
		textview1214 = findViewById(R.id.textview1214);
		edittext160 = findViewById(R.id.edittext160);
		textview1215 = findViewById(R.id.textview1215);
		textview460 = findViewById(R.id.textview460);
		textview2138 = findViewById(R.id.textview2138);
		edittext161 = findViewById(R.id.edittext161);
		textview2139 = findViewById(R.id.textview2139);
		textview461 = findViewById(R.id.textview461);
		textview2174 = findViewById(R.id.textview2174);
		edittext162 = findViewById(R.id.edittext162);
		textview2175 = findViewById(R.id.textview2175);
		textview462 = findViewById(R.id.textview462);
		textview2141 = findViewById(R.id.textview2141);
		edittext163 = findViewById(R.id.edittext163);
		textview2142 = findViewById(R.id.textview2142);
		textview463 = findViewById(R.id.textview463);
		textview2257 = findViewById(R.id.textview2257);
		edittext172 = findViewById(R.id.edittext172);
		textview2258 = findViewById(R.id.textview2258);
		textview2259 = findViewById(R.id.textview2259);
		textview2260 = findViewById(R.id.textview2260);
		edittext173 = findViewById(R.id.edittext173);
		textview2261 = findViewById(R.id.textview2261);
		textview2262 = findViewById(R.id.textview2262);
		textview2263 = findViewById(R.id.textview2263);
		edittext174 = findViewById(R.id.edittext174);
		textview2264 = findViewById(R.id.textview2264);
		textview2265 = findViewById(R.id.textview2265);
		textview1217 = findViewById(R.id.textview1217);
		edittext164 = findViewById(R.id.edittext164);
		textview1218 = findViewById(R.id.textview1218);
		textview464 = findViewById(R.id.textview464);
		textview2277 = findViewById(R.id.textview2277);
		edittext178 = findViewById(R.id.edittext178);
		textview2278 = findViewById(R.id.textview2278);
		textview2279 = findViewById(R.id.textview2279);
		textview2144 = findViewById(R.id.textview2144);
		edittext165 = findViewById(R.id.edittext165);
		textview2145 = findViewById(R.id.textview2145);
		textview465 = findViewById(R.id.textview465);
		textview2147 = findViewById(R.id.textview2147);
		edittext166 = findViewById(R.id.edittext166);
		textview2148 = findViewById(R.id.textview2148);
		textview466 = findViewById(R.id.textview466);
		textview467 = findViewById(R.id.textview467);
		textview2095 = findViewById(R.id.textview2095);
		linear887 = findViewById(R.id.linear887);
		textview2096 = findViewById(R.id.textview2096);
		edittext167 = findViewById(R.id.edittext167);
		textview2097 = findViewById(R.id.textview2097);
		edittext168 = findViewById(R.id.edittext168);
		textview2098 = findViewById(R.id.textview2098);
		textview468 = findViewById(R.id.textview468);
		linear973 = findViewById(R.id.linear973);
		hscroll109 = findViewById(R.id.hscroll109);
		textview600 = findViewById(R.id.textview600);
		hscroll78 = findViewById(R.id.hscroll78);
		linear194 = findViewById(R.id.linear194);
		hscroll119 = findViewById(R.id.hscroll119);
		linear195 = findViewById(R.id.linear195);
		textview604 = findViewById(R.id.textview604);
		textview605 = findViewById(R.id.textview605);
		linear202 = findViewById(R.id.linear202);
		textview519 = findViewById(R.id.textview519);
		textview608 = findViewById(R.id.textview608);
		linear923 = findViewById(R.id.linear923);
		textview2181 = findViewById(R.id.textview2181);
		textview611 = findViewById(R.id.textview611);
		linear929 = findViewById(R.id.linear929);
		textview2189 = findViewById(R.id.textview2189);
		textview614 = findViewById(R.id.textview614);
		linear932 = findViewById(R.id.linear932);
		textview2194 = findViewById(R.id.textview2194);
		textview617 = findViewById(R.id.textview617);
		linear219 = findViewById(R.id.linear219);
		textview667 = findViewById(R.id.textview667);
		textview620 = findViewById(R.id.textview620);
		linear223 = findViewById(R.id.linear223);
		textview680 = findViewById(R.id.textview680);
		textview623 = findViewById(R.id.textview623);
		linear935 = findViewById(R.id.linear935);
		textview2199 = findViewById(R.id.textview2199);
		textview665 = findViewById(R.id.textview665);
		linear999 = findViewById(R.id.linear999);
		textview2284 = findViewById(R.id.textview2284);
		textview626 = findViewById(R.id.textview626);
		linear938 = findViewById(R.id.linear938);
		textview2204 = findViewById(R.id.textview2204);
		textview688 = findViewById(R.id.textview688);
		linear1002 = findViewById(R.id.linear1002);
		textview2289 = findViewById(R.id.textview2289);
		textview629 = findViewById(R.id.textview629);
		linear941 = findViewById(R.id.linear941);
		textview2209 = findViewById(R.id.textview2209);
		edittext221 = findViewById(R.id.edittext221);
		linear227 = findViewById(R.id.linear227);
		textview682 = findViewById(R.id.textview682);
		linear197 = findViewById(R.id.linear197);
		linear964 = findViewById(R.id.linear964);
		linear196 = findViewById(R.id.linear196);
		linear198 = findViewById(R.id.linear198);
		hscroll104 = findViewById(R.id.hscroll104);
		linear955 = findViewById(R.id.linear955);
		linear956 = findViewById(R.id.linear956);
		linear199 = findViewById(R.id.linear199);
		linear231 = findViewById(R.id.linear231);
		linear232 = findViewById(R.id.linear232);
		linear957 = findViewById(R.id.linear957);
		linear958 = findViewById(R.id.linear958);
		linear1005 = findViewById(R.id.linear1005);
		linear959 = findViewById(R.id.linear959);
		linear1008 = findViewById(R.id.linear1008);
		linear233 = findViewById(R.id.linear233);
		linear960 = findViewById(R.id.linear960);
		linear200 = findViewById(R.id.linear200);
		textview681 = findViewById(R.id.textview681);
		linear961 = findViewById(R.id.linear961);
		hscroll105 = findViewById(R.id.hscroll105);
		linear962 = findViewById(R.id.linear962);
		imageview5 = findViewById(R.id.imageview5);
		linear974 = findViewById(R.id.linear974);
		textview671 = findViewById(R.id.textview671);
		edittext201 = findViewById(R.id.edittext201);
		textview670 = findViewById(R.id.textview670);
		textview601 = findViewById(R.id.textview601);
		textview695 = findViewById(R.id.textview695);
		edittext203 = findViewById(R.id.edittext203);
		textview676 = findViewById(R.id.textview676);
		textview603 = findViewById(R.id.textview603);
		linear218 = findViewById(R.id.linear218);
		textview679 = findViewById(R.id.textview679);
		linear203 = findViewById(R.id.linear203);
		textview607 = findViewById(R.id.textview607);
		edittext205 = findViewById(R.id.edittext205);
		textview606 = findViewById(R.id.textview606);
		edittext204 = findViewById(R.id.edittext204);
		linear924 = findViewById(R.id.linear924);
		textview2178 = findViewById(R.id.textview2178);
		linear925 = findViewById(R.id.linear925);
		textview610 = findViewById(R.id.textview610);
		edittext207 = findViewById(R.id.edittext207);
		textview609 = findViewById(R.id.textview609);
		edittext206 = findViewById(R.id.edittext206);
		linear930 = findViewById(R.id.linear930);
		textview2186 = findViewById(R.id.textview2186);
		linear931 = findViewById(R.id.linear931);
		textview613 = findViewById(R.id.textview613);
		edittext209 = findViewById(R.id.edittext209);
		textview612 = findViewById(R.id.textview612);
		edittext208 = findViewById(R.id.edittext208);
		textview616 = findViewById(R.id.textview616);
		edittext210 = findViewById(R.id.edittext210);
		textview2192 = findViewById(R.id.textview2192);
		textview615 = findViewById(R.id.textview615);
		linear220 = findViewById(R.id.linear220);
		textview677 = findViewById(R.id.textview677);
		linear222 = findViewById(R.id.linear222);
		textview619 = findViewById(R.id.textview619);
		edittext212 = findViewById(R.id.edittext212);
		textview618 = findViewById(R.id.textview618);
		edittext211 = findViewById(R.id.edittext211);
		linear224 = findViewById(R.id.linear224);
		textview674 = findViewById(R.id.textview674);
		linear226 = findViewById(R.id.linear226);
		textview622 = findViewById(R.id.textview622);
		edittext214 = findViewById(R.id.edittext214);
		textview621 = findViewById(R.id.textview621);
		edittext213 = findViewById(R.id.edittext213);
		linear936 = findViewById(R.id.linear936);
		textview2196 = findViewById(R.id.textview2196);
		linear937 = findViewById(R.id.linear937);
		textview625 = findViewById(R.id.textview625);
		edittext216 = findViewById(R.id.edittext216);
		textview624 = findViewById(R.id.textview624);
		edittext215 = findViewById(R.id.edittext215);
		linear1000 = findViewById(R.id.linear1000);
		textview2281 = findViewById(R.id.textview2281);
		linear1001 = findViewById(R.id.linear1001);
		textview668 = findViewById(R.id.textview668);
		edittext241 = findViewById(R.id.edittext241);
		textview666 = findViewById(R.id.textview666);
		edittext240 = findViewById(R.id.edittext240);
		linear939 = findViewById(R.id.linear939);
		textview2201 = findViewById(R.id.textview2201);
		linear940 = findViewById(R.id.linear940);
		textview628 = findViewById(R.id.textview628);
		edittext218 = findViewById(R.id.edittext218);
		textview627 = findViewById(R.id.textview627);
		edittext217 = findViewById(R.id.edittext217);
		linear1003 = findViewById(R.id.linear1003);
		textview2286 = findViewById(R.id.textview2286);
		linear1004 = findViewById(R.id.linear1004);
		textview685 = findViewById(R.id.textview685);
		edittext244 = findViewById(R.id.edittext244);
		textview686 = findViewById(R.id.textview686);
		edittext243 = findViewById(R.id.edittext243);
		linear942 = findViewById(R.id.linear942);
		textview2206 = findViewById(R.id.textview2206);
		linear943 = findViewById(R.id.linear943);
		textview631 = findViewById(R.id.textview631);
		edittext220 = findViewById(R.id.edittext220);
		textview630 = findViewById(R.id.textview630);
		edittext219 = findViewById(R.id.edittext219);
		linear228 = findViewById(R.id.linear228);
		textview675 = findViewById(R.id.textview675);
		linear230 = findViewById(R.id.linear230);
		textview633 = findViewById(R.id.textview633);
		edittext223 = findViewById(R.id.edittext223);
		textview632 = findViewById(R.id.textview632);
		edittext222 = findViewById(R.id.edittext222);
		button12 = findViewById(R.id.button12);
		textview2249 = findViewById(R.id.textview2249);
		edittext239 = findViewById(R.id.edittext239);
		textview2250 = findViewById(R.id.textview2250);
		textview2251 = findViewById(R.id.textview2251);
		textview635 = findViewById(R.id.textview635);
		edittext224 = findViewById(R.id.edittext224);
		textview661 = findViewById(R.id.textview661);
		textview634 = findViewById(R.id.textview634);
		textview637 = findViewById(R.id.textview637);
		edittext225 = findViewById(R.id.edittext225);
		textview672 = findViewById(R.id.textview672);
		textview636 = findViewById(R.id.textview636);
		textview639 = findViewById(R.id.textview639);
		edittext226 = findViewById(R.id.edittext226);
		textview2227 = findViewById(R.id.textview2227);
		textview638 = findViewById(R.id.textview638);
		textview641 = findViewById(R.id.textview641);
		edittext227 = findViewById(R.id.edittext227);
		textview2230 = findViewById(R.id.textview2230);
		textview640 = findViewById(R.id.textview640);
		textview643 = findViewById(R.id.textview643);
		edittext228 = findViewById(R.id.edittext228);
		textview663 = findViewById(R.id.textview663);
		textview642 = findViewById(R.id.textview642);
		textview645 = findViewById(R.id.textview645);
		edittext229 = findViewById(R.id.edittext229);
		textview684 = findViewById(R.id.textview684);
		textview644 = findViewById(R.id.textview644);
		textview647 = findViewById(R.id.textview647);
		edittext230 = findViewById(R.id.edittext230);
		textview687 = findViewById(R.id.textview687);
		textview646 = findViewById(R.id.textview646);
		textview649 = findViewById(R.id.textview649);
		edittext231 = findViewById(R.id.edittext231);
		textview2233 = findViewById(R.id.textview2233);
		textview648 = findViewById(R.id.textview648);
		textview651 = findViewById(R.id.textview651);
		edittext232 = findViewById(R.id.edittext232);
		textview2236 = findViewById(R.id.textview2236);
		textview650 = findViewById(R.id.textview650);
		textview2290 = findViewById(R.id.textview2290);
		edittext242 = findViewById(R.id.edittext242);
		textview2291 = findViewById(R.id.textview2291);
		textview669 = findViewById(R.id.textview669);
		textview653 = findViewById(R.id.textview653);
		edittext233 = findViewById(R.id.edittext233);
		textview2239 = findViewById(R.id.textview2239);
		textview652 = findViewById(R.id.textview652);
		textview2299 = findViewById(R.id.textview2299);
		edittext245 = findViewById(R.id.edittext245);
		textview2300 = findViewById(R.id.textview2300);
		textview690 = findViewById(R.id.textview690);
		textview655 = findViewById(R.id.textview655);
		edittext234 = findViewById(R.id.edittext234);
		textview689 = findViewById(R.id.textview689);
		textview654 = findViewById(R.id.textview654);
		textview657 = findViewById(R.id.textview657);
		edittext235 = findViewById(R.id.edittext235);
		textview2242 = findViewById(R.id.textview2242);
		textview656 = findViewById(R.id.textview656);
		textview659 = findViewById(R.id.textview659);
		edittext236 = findViewById(R.id.edittext236);
		textview673 = findViewById(R.id.textview673);
		textview658 = findViewById(R.id.textview658);
		textview660 = findViewById(R.id.textview660);
		textview535 = findViewById(R.id.textview535);
		linear201 = findViewById(R.id.linear201);
		textview678 = findViewById(R.id.textview678);
		edittext237 = findViewById(R.id.edittext237);
		textview664 = findViewById(R.id.textview664);
		edittext238 = findViewById(R.id.edittext238);
		textview2244 = findViewById(R.id.textview2244);
		textview662 = findViewById(R.id.textview662);
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear69.setVisibility(View.VISIBLE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
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
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext2.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext6.setText(String.valueOf(00.00));
				edittext6.setTextColor(0xFFE91E63);
				textview14.setVisibility(View.GONE);
				edittext7.setText(String.valueOf(00.00));
				edittext7.setTextColor(0xFFE91E63);
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
		
		edittext3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext6.setText(String.valueOf(00.00));
				edittext6.setTextColor(0xFFE91E63);
				textview14.setVisibility(View.GONE);
				edittext7.setText(String.valueOf(00.00));
				edittext8.setText(String.valueOf(00.00));
				edittext7.setTextColor(0xFFE91E63);
				edittext8.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext4.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext7.setText(String.valueOf(00.00));
				edittext7.setTextColor(0xFFE91E63);
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
		
		edittext5.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext5.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext8.setText(String.valueOf(00.00));
				edittext8.setTextColor(0xFFE91E63);
				edittext10.setText(String.valueOf(00.00));
				edittext10.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0)))) || ((edittext4.getText().toString().equals("") || edittext4.getText().toString().equals(". ")) || (edittext4.getText().toString().equals("-") || (Double.parseDouble(edittext4.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) {
						edittext5.setText(String.valueOf(00.05d));
					}
					edittext6.setText(String.valueOf(Double.parseDouble(edittext3.getText().toString()) - Double.parseDouble(edittext2.getText().toString())));
					if (Double.parseDouble(edittext6.getText().toString()) < 0) {
						textview14.setVisibility(View.VISIBLE);
						edittext7.setText(String.valueOf(00.00d));
						edittext8.setText(String.valueOf(00.00d));
					}
					else {
						textview14.setVisibility(View.GONE);
						edittext7.setText(String.valueOf(Double.parseDouble(edittext6.getText().toString()) * Double.parseDouble(edittext4.getText().toString())));
						edittext8.setText(String.valueOf(Double.parseDouble(edittext7.getText().toString()) * Double.parseDouble(edittext5.getText().toString())));
					}
					edittext6.setTextColor(0xFF000000);
					edittext7.setTextColor(0xFF000000);
					edittext8.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext6.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext7.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext7.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				if ((edittext10.getText().toString().equals("") || edittext10.getText().toString().equals(".")) || (edittext10.getText().toString().equals("-") || (Double.parseDouble(edittext10.getText().toString()) < 0))) {
					edittext11.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString())));
				}
				else {
					edittext11.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext10.getText().toString())));
				}
				edittext24.setText(String.valueOf(Double.parseDouble(_charSeq) + Double.parseDouble(edittext21.getText().toString())));
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
				edittext8.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
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
				edittext9.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext10.setText(String.valueOf(00.00));
				edittext10.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext12.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext12.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext13.setText(String.valueOf(00.00));
				}
				else {
					edittext13.setText(String.valueOf(Double.parseDouble(edittext11.getText().toString()) * Double.parseDouble(_charSeq)));
				}
				edittext229.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext229.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
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
				if ((((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0)))) || ((edittext4.getText().toString().equals("") || edittext4.getText().toString().equals(". ")) || (edittext4.getText().toString().equals("-") || (Double.parseDouble(edittext4.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) {
						edittext5.setText(String.valueOf(0.05d));
					}
					if (((edittext9.getText().toString().equals("") || edittext9.getText().toString().equals(".")) || (edittext9.getText().toString().equals("-") || (Double.parseDouble(edittext9.getText().toString()) < 0))) || (Double.parseDouble(edittext9.getText().toString()) > 100)) {
						edittext9.setText(String.valueOf(10));
					}
					if ((edittext12.getText().toString().equals("") || edittext12.getText().toString().equals(".")) || (edittext12.getText().toString().equals("-") || (Double.parseDouble(edittext12.getText().toString()) < 0))) {
						edittext12.setText(String.valueOf(2.36d));
					}
					if ((Double.parseDouble(edittext10.getText().toString()) == 0) || ((edittext10.getText().toString().equals("") || edittext10.getText().toString().equals(".")) || (edittext10.getText().toString().equals("-") || (Double.parseDouble(edittext10.getText().toString()) < 0)))) {
						edittext10.setText(String.valueOf(Double.parseDouble(edittext5.getText().toString()) + (Double.parseDouble(edittext5.getText().toString()) * (Double.parseDouble(edittext9.getText().toString()) / 100))));
						edittext11.setText(String.valueOf(Double.parseDouble(edittext7.getText().toString()) * Double.parseDouble(edittext10.getText().toString())));
						edittext13.setText(String.valueOf(Double.parseDouble(edittext11.getText().toString()) * Double.parseDouble(edittext12.getText().toString())));
					}
					else {
						edittext10.setText(String.valueOf(Double.parseDouble(edittext10.getText().toString())));
						edittext11.setText(String.valueOf(Double.parseDouble(edittext7.getText().toString()) * Double.parseDouble(edittext10.getText().toString())));
						edittext13.setText(String.valueOf(Double.parseDouble(edittext11.getText().toString()) * Double.parseDouble(edittext12.getText().toString())));
					}
					edittext10.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext10.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext10.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext11.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString())));
				}
				else {
					edittext11.setText(String.valueOf(Double.parseDouble(edittext7.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext11.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext11.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
				if ((edittext12.getText().toString().equals("") || edittext12.getText().toString().equals(".")) || (edittext12.getText().toString().equals("-") || (Double.parseDouble(edittext12.getText().toString()) < 0))) {
					edittext13.setText(String.valueOf(00.00));
				}
				else {
					edittext13.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext12.getText().toString())));
				}
				edittext25.setText(String.valueOf(Double.parseDouble(_charSeq) + Double.parseDouble(edittext22.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext13.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext13.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				edittext26.setText(String.valueOf(Double.parseDouble(_charSeq) + Double.parseDouble(edittext23.getText().toString())));
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
					_toipcc_d_soil();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext21.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext21.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext24.setText(String.valueOf(Double.parseDouble(edittext7.getText().toString()) + Double.parseDouble(_charSeq)));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext22.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext22.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext25.setText(String.valueOf(Double.parseDouble(edittext11.getText().toString()) + Double.parseDouble(_charSeq)));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext23.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext23.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
				edittext26.setText(String.valueOf(Double.parseDouble(edittext13.getText().toString()) + Double.parseDouble(_charSeq)));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext24.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext24.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				edittext31.setText(String.valueOf(00.00));
				edittext31.setTextColor(0xFFE91E63);
				edittext38.setText(String.valueOf(00.00));
				edittext39.setText(String.valueOf(00.00));
				edittext38.setTextColor(0xFFE91E63);
				edittext39.setTextColor(0xFFE91E63);
				edittext40.setText(String.valueOf(00.00));
				edittext40.setTextColor(0xFFE91E63);
				/*
هندسي توريد خلطة و معدات وعمالة
*/
				edittext158.setText(String.valueOf(00.00));
				edittext159.setText(String.valueOf(00.00));
				edittext160.setText(String.valueOf(00.00));
				edittext158.setTextColor(0xFFE91E63);
				edittext159.setTextColor(0xFFE91E63);
				edittext160.setTextColor(0xFFE91E63);
				edittext161.setText(String.valueOf(00.00));
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext161.setTextColor(0xFFE91E63);
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
				edittext172.setText(String.valueOf(00.00));
				edittext173.setText(String.valueOf(00.00));
				edittext174.setText(String.valueOf(00.00));
				edittext172.setTextColor(0xFFE91E63);
				edittext173.setTextColor(0xFFE91E63);
				edittext174.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext25.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext25.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				if (((edittext27.getText().toString().equals("") || edittext27.getText().toString().equals(".")) || (edittext27.getText().toString().equals("-") || (Double.parseDouble(edittext27.getText().toString()) < 0))) || (Double.parseDouble(edittext27.getText().toString()) > 100)) {
					edittext28.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
				else {
					edittext28.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext27.getText().toString()) / 100))));
				}
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
				edittext26.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
				if (((edittext27.getText().toString().equals("") || edittext27.getText().toString().equals(".")) || (edittext27.getText().toString().equals("-") || (Double.parseDouble(edittext27.getText().toString()) < 0))) || (Double.parseDouble(edittext27.getText().toString()) > 100)) {
					edittext29.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
				else {
					edittext29.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext27.getText().toString()) / 100))));
				}
				edittext239.setText(String.valueOf(00.00));
				edittext239.setTextColor(0xFFE91E63);
				edittext224.setText(String.valueOf(00.00));
				edittext224.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext27.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext27.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (Double.parseDouble(_charSeq) > 100)) {
					edittext28.setText(String.valueOf(Double.parseDouble(edittext25.getText().toString())));
					edittext29.setText(String.valueOf(Double.parseDouble(edittext26.getText().toString())));
				}
				else {
					edittext28.setText(String.valueOf(Double.parseDouble(edittext25.getText().toString()) + (Double.parseDouble(edittext25.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
					edittext29.setText(String.valueOf(Double.parseDouble(edittext26.getText().toString()) + (Double.parseDouble(edittext26.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
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
				if (((edittext27.getText().toString().equals("") || edittext27.getText().toString().equals(".")) || (edittext27.getText().toString().equals("-") || (Double.parseDouble(edittext27.getText().toString()) < 0))) || (Double.parseDouble(edittext27.getText().toString()) > 100)) {
					edittext27.setText(String.valueOf(Double.parseDouble("3")));
				}
			}
		});
		
		edittext28.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext28.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
				/*
هندسي توريد خلطة ومقاول مصنعيات
*/
				edittext37.setText(String.valueOf(00.00));
				edittext37.setTextColor(0xFFE91E63);
				edittext39.setText(String.valueOf(00.00));
				edittext39.setTextColor(0xFFE91E63);
				edittext40.setText(String.valueOf(00.00));
				edittext40.setTextColor(0xFFE91E63);
				/*
هندسي توريد خلطة و معدات وعمالة
*/
				edittext144.setText(String.valueOf(00.00));
				edittext144.setTextColor(0xFFE91E63);
				edittext145.setText(String.valueOf(00.00));
				edittext146.setText(String.valueOf(00.00));
				edittext147.setText(String.valueOf(00.00));
				edittext145.setTextColor(0xFFE91E63);
				edittext146.setTextColor(0xFFE91E63);
				edittext147.setTextColor(0xFFE91E63);
				edittext148.setText(String.valueOf(00.00));
				edittext149.setText(String.valueOf(00.00));
				edittext150.setText(String.valueOf(00.00));
				edittext148.setTextColor(0xFFE91E63);
				edittext149.setTextColor(0xFFE91E63);
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setText(String.valueOf(00.00));
				edittext152.setText(String.valueOf(00.00));
				edittext153.setText(String.valueOf(00.00));
				edittext151.setTextColor(0xFFE91E63);
				edittext152.setTextColor(0xFFE91E63);
				edittext153.setTextColor(0xFFE91E63);
				edittext154.setText(String.valueOf(00.00));
				edittext155.setText(String.valueOf(00.00));
				edittext156.setText(String.valueOf(00.00));
				edittext154.setTextColor(0xFFE91E63);
				edittext155.setTextColor(0xFFE91E63);
				edittext156.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext29.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				edittext37.setText(String.valueOf(00.00));
				edittext37.setTextColor(0xFFE91E63);
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
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear190.setVisibility(View.VISIBLE);
					edittext30.setText("");
					edittext31.setTextColor(0xFFFFFFFF);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear179.setVisibility(View.VISIBLE);
					edittext34.setText("");
					edittext35.setText("");
					edittext37.setTextColor(0xFF000000);
					edittext38.setTextColor(0xFF000000);
					edittext39.setTextColor(0xFFFFFFFF);
					edittext40.setTextColor(0xFF000000);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear870.setVisibility(View.VISIBLE);
					edittext112.setText("");
					edittext113.setText("");
					edittext114.setText("");
					edittext115.setText("");
					edittext116.setText("");
					edittext117.setText("");
					edittext118.setText("");
					edittext119.setText("");
					edittext120.setText("");
					edittext121.setText("");
					edittext122.setText("");
					edittext123.setText("");
					edittext124.setText("");
					edittext125.setText("");
					edittext126.setText("");
					edittext127.setText("");
					edittext128.setText("");
					edittext129.setText("");
					edittext130.setText("");
					edittext131.setText("");
					edittext132.setText("");
					edittext133.setText("");
					edittext134.setText("");
					edittext135.setText("");
					edittext136.setText("");
					edittext137.setText("");
					edittext138.setText("");
					edittext139.setText("");
					edittext140.setText("");
					edittext141.setText("");
					edittext142.setText("");
					edittext94.setText("");
					edittext169.setText("");
					edittext170.setText("");
					edittext171.setText("");
					edittext175.setText("");
					edittext176.setText("");
					edittext177.setText("");
					edittext144.setTextColor(0xFF000000);
					edittext145.setTextColor(0xFF000000);
					edittext146.setTextColor(0xFF000000);
					edittext147.setTextColor(0xFF000000);
					edittext148.setTextColor(0xFF000000);
					edittext149.setTextColor(0xFF000000);
					edittext150.setTextColor(0xFF000000);
					edittext151.setTextColor(0xFF000000);
					edittext152.setTextColor(0xFF000000);
					edittext153.setTextColor(0xFF000000);
					edittext154.setTextColor(0xFF000000);
					edittext155.setTextColor(0xFF000000);
					edittext156.setTextColor(0xFF000000);
					edittext157.setTextColor(0xFF000000);
					edittext158.setTextColor(0xFF000000);
					edittext159.setTextColor(0xFF000000);
					edittext160.setTextColor(0xFF000000);
					edittext161.setTextColor(0xFF000000);
					edittext162.setTextColor(0xFF000000);
					edittext163.setTextColor(0xFF000000);
					edittext164.setTextColor(0xFF000000);
					edittext165.setTextColor(0xFF000000);
					edittext166.setTextColor(0xFF000000);
					edittext167.setTextColor(0xFFFFFFFF);
					edittext168.setTextColor(0xFF000000);
					edittext172.setTextColor(0xFF000000);
					edittext173.setTextColor(0xFF000000);
					edittext174.setTextColor(0xFF000000);
					edittext178.setTextColor(0xFF000000);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear193.setVisibility(View.VISIBLE);
					edittext201.setText("");
					edittext203.setText("");
					edittext204.setText("");
					edittext205.setText("");
					edittext206.setText("");
					edittext207.setText("");
					edittext208.setText("");
					edittext209.setText("");
					edittext210.setText("");
					edittext211.setText("");
					edittext212.setText("");
					edittext213.setText("");
					edittext214.setText("");
					edittext215.setText("");
					edittext216.setText("");
					edittext217.setText("");
					edittext218.setText("");
					edittext219.setText("");
					edittext220.setText("");
					edittext221.setText("");
					edittext222.setText("");
					edittext223.setText("");
					edittext240.setText("");
					edittext241.setText("");
					edittext243.setText("");
					edittext244.setText("");
					edittext239.setTextColor(0xFF000000);
					edittext224.setTextColor(0xFF000000);
					edittext225.setTextColor(0xFF000000);
					edittext226.setTextColor(0xFF000000);
					edittext227.setTextColor(0xFF000000);
					edittext228.setTextColor(0xFF000000);
					edittext229.setTextColor(0xFF000000);
					edittext230.setTextColor(0xFF000000);
					edittext231.setTextColor(0xFF000000);
					edittext232.setTextColor(0xFF000000);
					edittext233.setTextColor(0xFF000000);
					edittext234.setTextColor(0xFF000000);
					edittext235.setTextColor(0xFF000000);
					edittext236.setTextColor(0xFF000000);
					edittext237.setTextColor(0xFFFFFFFF);
					edittext238.setTextColor(0xFF000000);
					edittext242.setTextColor(0xFF000000);
					edittext245.setTextColor(0xFF000000);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		imageview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear69.setVisibility(View.GONE);
			}
		});
		
		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear190.setVisibility(View.GONE);
				edittext30.setText("");
			}
		});
		
		edittext30.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext30.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext31.setText(String.valueOf(00.00));
				edittext31.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext30.getText().toString().equals("") || edittext30.getText().toString().equals(".")) || (edittext30.getText().toString().equals("-") || (Double.parseDouble(edittext30.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					edittext31.setText(String.valueOf(Double.parseDouble(edittext24.getText().toString()) * Double.parseDouble(edittext30.getText().toString())));
					edittext31.setTextColor(0xFFFFFFFF);
				}
			}
		});
		
		edittext31.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext31.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear179.setVisibility(View.GONE);
				edittext34.setText("");
				edittext35.setText("");
			}
		});
		
		edittext34.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext34.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext37.setText(String.valueOf(00.00));
				edittext39.setText(String.valueOf(00.00));
				edittext37.setTextColor(0xFFE91E63);
				edittext39.setTextColor(0xFFE91E63);
				edittext40.setText(String.valueOf(00.00));
				edittext40.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext35.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext35.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext38.setText(String.valueOf(00.00));
				edittext39.setText(String.valueOf(00.00));
				edittext38.setTextColor(0xFFE91E63);
				edittext39.setTextColor(0xFFE91E63);
				edittext40.setText(String.valueOf(00.00));
				edittext40.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext34.getText().toString().equals("") || edittext34.getText().toString().equals(".")) || (edittext34.getText().toString().equals("-") || (Double.parseDouble(edittext34.getText().toString()) < 0))) || ((edittext35.getText().toString().equals("") || edittext35.getText().toString().equals(".")) || (edittext35.getText().toString().equals("-") || (Double.parseDouble(edittext35.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					edittext37.setText(String.valueOf(Double.parseDouble(edittext29.getText().toString()) * Double.parseDouble(edittext34.getText().toString())));
					edittext38.setText(String.valueOf(Double.parseDouble(edittext35.getText().toString()) * Double.parseDouble(edittext24.getText().toString())));
					edittext39.setText(String.valueOf(Double.parseDouble(edittext37.getText().toString()) + Double.parseDouble(edittext38.getText().toString())));
					edittext40.setText(String.valueOf(Double.parseDouble(edittext39.getText().toString()) / Double.parseDouble(edittext24.getText().toString())));
					edittext37.setTextColor(0xFF000000);
					edittext38.setTextColor(0xFF000000);
					edittext39.setTextColor(0xFFFFFFFF);
					edittext40.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext37.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext37.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext38.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext39.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
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
				edittext40.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				if (_charSeq.equals("")) {
					textview466.setText("١٢.١ - تكلفة معدات أخرى ( جنيه )");
				}
				else {
					textview466.setText(_charSeq);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear870.setVisibility(View.GONE);
				edittext112.setText("");
				edittext113.setText("");
				edittext114.setText("");
				edittext115.setText("");
				edittext116.setText("");
				edittext117.setText("");
				edittext118.setText("");
				edittext119.setText("");
				edittext120.setText("");
				edittext121.setText("");
				edittext122.setText("");
				edittext123.setText("");
				edittext124.setText("");
				edittext125.setText("");
				edittext126.setText("");
				edittext127.setText("");
				edittext128.setText("");
				edittext129.setText("");
				edittext130.setText("");
				edittext131.setText("");
				edittext132.setText("");
				edittext133.setText("");
				edittext134.setText("");
				edittext135.setText("");
				edittext136.setText("");
				edittext137.setText("");
				edittext138.setText("");
				edittext139.setText("");
				edittext140.setText("");
				edittext141.setText("");
				edittext142.setText("");
				edittext94.setText("");
				edittext169.setText("");
				edittext170.setText("");
				edittext171.setText("");
				edittext175.setText("");
				edittext176.setText("");
				edittext177.setText("");
			}
		});
		
		edittext112.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext112.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext144.setText(String.valueOf(00.00));
				edittext144.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext147.setText(String.valueOf(00.00));
				edittext147.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext145.setText(String.valueOf(00.00));
				edittext145.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext113.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext113.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext145.setText(String.valueOf(00.00));
				edittext146.setText(String.valueOf(00.00));
				edittext147.setText(String.valueOf(00.00));
				edittext145.setTextColor(0xFFE91E63);
				edittext146.setTextColor(0xFFE91E63);
				edittext147.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext150.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext148.setText(String.valueOf(00.00));
				edittext148.setTextColor(0xFFE91E63);
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
				edittext148.setText(String.valueOf(00.00));
				edittext149.setText(String.valueOf(00.00));
				edittext150.setText(String.valueOf(00.00));
				edittext148.setTextColor(0xFFE91E63);
				edittext149.setTextColor(0xFFE91E63);
				edittext150.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext121.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext121.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext153.setText(String.valueOf(00.00));
				edittext153.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext151.setText(String.valueOf(00.00));
				edittext151.setTextColor(0xFFE91E63);
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
				edittext151.setText(String.valueOf(00.00));
				edittext152.setText(String.valueOf(00.00));
				edittext153.setText(String.valueOf(00.00));
				edittext151.setTextColor(0xFFE91E63);
				edittext152.setTextColor(0xFFE91E63);
				edittext153.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext156.setText(String.valueOf(00.00));
				edittext156.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext123.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext123.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext154.setText(String.valueOf(00.00));
				edittext154.setTextColor(0xFFE91E63);
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
				edittext122.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext154.setText(String.valueOf(00.00));
				edittext155.setText(String.valueOf(00.00));
				edittext154.setTextColor(0xFFE91E63);
				edittext155.setTextColor(0xFFE91E63);
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
				edittext157.setText(String.valueOf(00.00));
				edittext157.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext157.setText(String.valueOf(00.00));
				edittext157.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext157.setText(String.valueOf(00.00));
				edittext157.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext160.setText(String.valueOf(00.00));
				edittext160.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext158.setText(String.valueOf(00.00));
				edittext158.setTextColor(0xFFE91E63);
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
				edittext158.setText(String.valueOf(00.00));
				edittext159.setText(String.valueOf(00.00));
				edittext160.setText(String.valueOf(00.00));
				edittext158.setTextColor(0xFFE91E63);
				edittext159.setTextColor(0xFFE91E63);
				edittext160.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext133.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext133.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext163.setText(String.valueOf(00.00));
				edittext163.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext132.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext132.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext161.setText(String.valueOf(00.00));
				edittext161.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext131.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext131.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext161.setText(String.valueOf(00.00));
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext161.setTextColor(0xFFE91E63);
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext171.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext171.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext174.setText(String.valueOf(00.00));
				edittext174.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext170.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext170.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext172.setText(String.valueOf(00.00));
				edittext172.setTextColor(0xFFE91E63);
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
				edittext169.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext172.setText(String.valueOf(00.00));
				edittext173.setText(String.valueOf(00.00));
				edittext174.setText(String.valueOf(00.00));
				edittext172.setTextColor(0xFFE91E63);
				edittext173.setTextColor(0xFFE91E63);
				edittext174.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext164.setText(String.valueOf(00.00));
				edittext164.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext164.setText(String.valueOf(00.00));
				edittext164.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext164.setText(String.valueOf(00.00));
				edittext164.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext178.setText(String.valueOf(00.00));
				edittext178.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext176.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext176.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext178.setText(String.valueOf(00.00));
				edittext178.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext178.setText(String.valueOf(00.00));
				edittext178.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext165.setText(String.valueOf(00.00));
				edittext165.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext165.setText(String.valueOf(00.00));
				edittext165.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext165.setText(String.valueOf(00.00));
				edittext165.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext142.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext142.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext166.setText(String.valueOf(00.00));
				edittext166.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext141.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext141.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext166.setText(String.valueOf(00.00));
				edittext166.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
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
				edittext166.setText(String.valueOf(00.00));
				edittext166.setTextColor(0xFFE91E63);
				edittext167.setText(String.valueOf(00.00));
				edittext168.setText(String.valueOf(00.00));
				edittext167.setTextColor(0xFFE91E63);
				edittext168.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext112.getText().toString().equals("") || edittext112.getText().toString().equals(".")) || (edittext112.getText().toString().equals("-") || (Double.parseDouble(edittext112.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					edittext144.setText(String.valueOf(Double.parseDouble(edittext29.getText().toString()) * Double.parseDouble(edittext112.getText().toString())));
					edittext144.setTextColor(0xFF000000);
					if (((edittext113.getText().toString().equals("") || edittext113.getText().toString().equals(".")) || edittext113.getText().toString().equals("-")) || (Double.parseDouble(edittext113.getText().toString()) < 0)) {
						edittext113.setText(String.valueOf(00.00));
					}
					if (((edittext114.getText().toString().equals("") || edittext114.getText().toString().equals(".")) || edittext114.getText().toString().equals("-")) || (Double.parseDouble(edittext114.getText().toString()) < 0)) {
						edittext114.setText(String.valueOf(1));
					}
					if (((edittext115.getText().toString().equals("") || edittext115.getText().toString().equals(".")) || edittext115.getText().toString().equals("-")) || (Double.parseDouble(edittext115.getText().toString()) < 0)) {
						edittext115.setText(String.valueOf(00.00));
					}
					if ((Double.parseDouble(edittext113.getText().toString()) == 00.00d) || (Double.parseDouble(edittext114.getText().toString()) == 00.00d)) {
						edittext145.setText(String.valueOf(00.00));
						edittext146.setText(String.valueOf(00.00));
						edittext147.setText(String.valueOf(00.00));
					}
					else {
						edittext145.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext28.getText().toString()) / (Double.parseDouble(edittext113.getText().toString()) * Double.parseDouble(edittext114.getText().toString())))));
						edittext146.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext28.getText().toString()) / Double.parseDouble(edittext113.getText().toString()))));
						edittext147.setText(String.valueOf(Double.parseDouble(edittext115.getText().toString()) * Double.parseDouble(edittext146.getText().toString())));
					}
					edittext145.setTextColor(0xFF000000);
					edittext146.setTextColor(0xFF000000);
					edittext147.setTextColor(0xFF000000);
					if (((edittext116.getText().toString().equals("") || edittext116.getText().toString().equals(".")) || edittext116.getText().toString().equals("-")) || (Double.parseDouble(edittext116.getText().toString()) < 0)) {
						edittext116.setText(String.valueOf(00.00));
					}
					if (((edittext117.getText().toString().equals("") || edittext117.getText().toString().equals(".")) || edittext117.getText().toString().equals("-")) || (Double.parseDouble(edittext117.getText().toString()) < 0)) {
						edittext117.setText(String.valueOf(1));
					}
					if (((edittext118.getText().toString().equals("") || edittext118.getText().toString().equals(".")) || edittext118.getText().toString().equals("-")) || (Double.parseDouble(edittext118.getText().toString()) < 0)) {
						edittext118.setText(String.valueOf(00.00));
					}
					if ((Double.parseDouble(edittext116.getText().toString()) == 00.00d) || (Double.parseDouble(edittext117.getText().toString()) == 00.00d)) {
						edittext148.setText(String.valueOf(00.00));
						edittext149.setText(String.valueOf(00.00));
						edittext150.setText(String.valueOf(00.00));
					}
					else {
						edittext148.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext28.getText().toString()) / (Double.parseDouble(edittext116.getText().toString()) * Double.parseDouble(edittext117.getText().toString())))));
						edittext149.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext28.getText().toString()) / Double.parseDouble(edittext116.getText().toString()))));
						edittext150.setText(String.valueOf(Double.parseDouble(edittext118.getText().toString()) * Double.parseDouble(edittext149.getText().toString())));
					}
					edittext148.setTextColor(0xFF000000);
					edittext149.setTextColor(0xFF000000);
					edittext150.setTextColor(0xFF000000);
					if (((edittext119.getText().toString().equals("") || edittext119.getText().toString().equals(".")) || edittext119.getText().toString().equals("-")) || (Double.parseDouble(edittext119.getText().toString()) < 0)) {
						edittext119.setText(String.valueOf(00.00));
					}
					if (((edittext120.getText().toString().equals("") || edittext120.getText().toString().equals(".")) || edittext120.getText().toString().equals("-")) || (Double.parseDouble(edittext120.getText().toString()) < 0)) {
						edittext120.setText(String.valueOf(1));
					}
					if (((edittext121.getText().toString().equals("") || edittext121.getText().toString().equals(".")) || edittext121.getText().toString().equals("-")) || (Double.parseDouble(edittext121.getText().toString()) < 0)) {
						edittext121.setText(String.valueOf(00.00));
					}
					if ((Double.parseDouble(edittext119.getText().toString()) == 00.00d) || (Double.parseDouble(edittext120.getText().toString()) == 00.00d)) {
						edittext151.setText(String.valueOf(00.00));
						edittext152.setText(String.valueOf(00.00));
						edittext153.setText(String.valueOf(00.00));
					}
					else {
						edittext151.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext28.getText().toString()) / (Double.parseDouble(edittext119.getText().toString()) * Double.parseDouble(edittext120.getText().toString())))));
						edittext152.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext28.getText().toString()) / Double.parseDouble(edittext119.getText().toString()))));
						edittext153.setText(String.valueOf(Double.parseDouble(edittext121.getText().toString()) * Double.parseDouble(edittext152.getText().toString())));
					}
					edittext151.setTextColor(0xFF000000);
					edittext152.setTextColor(0xFF000000);
					edittext153.setTextColor(0xFF000000);
					if (((edittext122.getText().toString().equals("") || edittext122.getText().toString().equals(".")) || edittext122.getText().toString().equals("-")) || (Double.parseDouble(edittext122.getText().toString()) < 0)) {
						edittext122.setText(String.valueOf(20));
					}
					if (((edittext123.getText().toString().equals("") || edittext123.getText().toString().equals(".")) || edittext123.getText().toString().equals("-")) || (Double.parseDouble(edittext123.getText().toString()) < 0)) {
						edittext123.setText(String.valueOf(1));
					}
					if (((edittext124.getText().toString().equals("") || edittext124.getText().toString().equals(".")) || edittext124.getText().toString().equals("-")) || (Double.parseDouble(edittext124.getText().toString()) < 0)) {
						edittext124.setText(String.valueOf(00.00));
					}
					if ((Double.parseDouble(edittext122.getText().toString()) == 00.00d) || (Double.parseDouble(edittext123.getText().toString()) == 00.00d)) {
						edittext154.setText(String.valueOf(00.00));
						edittext155.setText(String.valueOf(00.00));
						edittext156.setText(String.valueOf(00.00));
					}
					else {
						edittext154.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext28.getText().toString()) / (Double.parseDouble(edittext122.getText().toString()) * Double.parseDouble(edittext123.getText().toString())))));
						edittext155.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext28.getText().toString()) / Double.parseDouble(edittext122.getText().toString()))));
						edittext156.setText(String.valueOf(Double.parseDouble(edittext124.getText().toString()) * Double.parseDouble(edittext28.getText().toString())));
					}
					edittext154.setTextColor(0xFF000000);
					edittext155.setTextColor(0xFF000000);
					edittext156.setTextColor(0xFF000000);
					if (((edittext125.getText().toString().equals("") || edittext125.getText().toString().equals(".")) || edittext125.getText().toString().equals("-")) || (Double.parseDouble(edittext125.getText().toString()) < 0)) {
						edittext125.setText(String.valueOf(00.00));
					}
					if (((edittext126.getText().toString().equals("") || edittext126.getText().toString().equals(".")) || edittext126.getText().toString().equals("-")) || (Double.parseDouble(edittext126.getText().toString()) < 0)) {
						edittext126.setText(String.valueOf(1));
					}
					if (((edittext127.getText().toString().equals("") || edittext127.getText().toString().equals(".")) || edittext127.getText().toString().equals("-")) || (Double.parseDouble(edittext127.getText().toString()) < 0)) {
						edittext127.setText(String.valueOf(00.00));
					}
					edittext157.setText(String.valueOf(Double.parseDouble(edittext125.getText().toString()) * (Double.parseDouble(edittext126.getText().toString()) * Double.parseDouble(edittext127.getText().toString()))));
					edittext157.setTextColor(0xFF000000);
					if (((edittext128.getText().toString().equals("") || edittext128.getText().toString().equals(".")) || edittext128.getText().toString().equals("-")) || (Double.parseDouble(edittext128.getText().toString()) < 0)) {
						edittext128.setText(String.valueOf(00.00));
					}
					if (((edittext129.getText().toString().equals("") || edittext129.getText().toString().equals(".")) || edittext129.getText().toString().equals("-")) || (Double.parseDouble(edittext129.getText().toString()) < 0)) {
						edittext129.setText(String.valueOf(1));
					}
					if (((edittext130.getText().toString().equals("") || edittext130.getText().toString().equals(".")) || edittext130.getText().toString().equals("-")) || (Double.parseDouble(edittext130.getText().toString()) < 0)) {
						edittext130.setText(String.valueOf(00.00));
					}
					if ((Double.parseDouble(edittext128.getText().toString()) == 00.00d) || (Double.parseDouble(edittext129.getText().toString()) == 00.00d)) {
						edittext158.setText(String.valueOf(00.00));
						edittext159.setText(String.valueOf(00.00));
						edittext160.setText(String.valueOf(00.00));
					}
					else {
						edittext158.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext24.getText().toString()) / (Double.parseDouble(edittext128.getText().toString()) * Double.parseDouble(edittext129.getText().toString())))));
						edittext159.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext24.getText().toString()) / Double.parseDouble(edittext128.getText().toString()))));
						edittext160.setText(String.valueOf(Double.parseDouble(edittext130.getText().toString()) * Double.parseDouble(edittext159.getText().toString())));
					}
					edittext158.setTextColor(0xFF000000);
					edittext159.setTextColor(0xFF000000);
					edittext160.setTextColor(0xFF000000);
					if (((edittext131.getText().toString().equals("") || edittext131.getText().toString().equals(".")) || edittext131.getText().toString().equals("-")) || (Double.parseDouble(edittext131.getText().toString()) < 0)) {
						edittext131.setText(String.valueOf(00.00));
					}
					if (((edittext132.getText().toString().equals("") || edittext132.getText().toString().equals(".")) || edittext132.getText().toString().equals("-")) || (Double.parseDouble(edittext132.getText().toString()) < 0)) {
						edittext132.setText(String.valueOf(1));
					}
					if (((edittext133.getText().toString().equals("") || edittext133.getText().toString().equals(".")) || edittext133.getText().toString().equals("-")) || (Double.parseDouble(edittext133.getText().toString()) < 0)) {
						edittext133.setText(String.valueOf(00.00));
					}
					if ((Double.parseDouble(edittext131.getText().toString()) == 00.00d) || (Double.parseDouble(edittext132.getText().toString()) == 00.00d)) {
						edittext161.setText(String.valueOf(00.00));
						edittext162.setText(String.valueOf(00.00));
						edittext163.setText(String.valueOf(00.00));
					}
					else {
						edittext161.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext24.getText().toString()) / (Double.parseDouble(edittext131.getText().toString()) * Double.parseDouble(edittext132.getText().toString())))));
						edittext162.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext24.getText().toString()) / Double.parseDouble(edittext131.getText().toString()))));
						edittext163.setText(String.valueOf(Double.parseDouble(edittext133.getText().toString()) * Double.parseDouble(edittext162.getText().toString())));
					}
					edittext161.setTextColor(0xFF000000);
					edittext162.setTextColor(0xFF000000);
					edittext163.setTextColor(0xFF000000);
					if (((edittext169.getText().toString().equals("") || edittext169.getText().toString().equals(".")) || edittext169.getText().toString().equals("-")) || (Double.parseDouble(edittext169.getText().toString()) < 0)) {
						edittext169.setText(String.valueOf(00.00));
					}
					if (((edittext170.getText().toString().equals("") || edittext170.getText().toString().equals(".")) || edittext170.getText().toString().equals("-")) || (Double.parseDouble(edittext170.getText().toString()) < 0)) {
						edittext170.setText(String.valueOf(1));
					}
					if (((edittext171.getText().toString().equals("") || edittext171.getText().toString().equals(".")) || edittext171.getText().toString().equals("-")) || (Double.parseDouble(edittext171.getText().toString()) < 0)) {
						edittext171.setText(String.valueOf(00.00));
					}
					if ((Double.parseDouble(edittext169.getText().toString()) == 00.00d) || (Double.parseDouble(edittext170.getText().toString()) == 00.00d)) {
						edittext172.setText(String.valueOf(00.00));
						edittext173.setText(String.valueOf(00.00));
						edittext174.setText(String.valueOf(00.00));
					}
					else {
						edittext172.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext24.getText().toString()) / (Double.parseDouble(edittext169.getText().toString()) * Double.parseDouble(edittext170.getText().toString())))));
						edittext173.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext24.getText().toString()) / Double.parseDouble(edittext169.getText().toString()))));
						edittext174.setText(String.valueOf(Double.parseDouble(edittext171.getText().toString()) * Double.parseDouble(edittext173.getText().toString())));
					}
					edittext172.setTextColor(0xFF000000);
					edittext173.setTextColor(0xFF000000);
					edittext174.setTextColor(0xFF000000);
					if (((edittext134.getText().toString().equals("") || edittext134.getText().toString().equals(".")) || edittext134.getText().toString().equals("-")) || (Double.parseDouble(edittext134.getText().toString()) < 0)) {
						edittext134.setText(String.valueOf(00.00));
					}
					if (((edittext135.getText().toString().equals("") || edittext135.getText().toString().equals(".")) || edittext135.getText().toString().equals("-")) || (Double.parseDouble(edittext135.getText().toString()) < 0)) {
						edittext135.setText(String.valueOf(1));
					}
					if (((edittext136.getText().toString().equals("") || edittext136.getText().toString().equals(".")) || edittext136.getText().toString().equals("-")) || (Double.parseDouble(edittext136.getText().toString()) < 0)) {
						edittext136.setText(String.valueOf(00.00));
					}
					edittext164.setText(String.valueOf(Double.parseDouble(edittext134.getText().toString()) * (Double.parseDouble(edittext135.getText().toString()) * Double.parseDouble(edittext136.getText().toString()))));
					edittext164.setTextColor(0xFF000000);
					if (((edittext175.getText().toString().equals("") || edittext175.getText().toString().equals(".")) || edittext175.getText().toString().equals("-")) || (Double.parseDouble(edittext175.getText().toString()) < 0)) {
						edittext175.setText(String.valueOf(00.00));
					}
					if (((edittext176.getText().toString().equals("") || edittext176.getText().toString().equals(".")) || edittext176.getText().toString().equals("-")) || (Double.parseDouble(edittext176.getText().toString()) < 0)) {
						edittext176.setText(String.valueOf(1));
					}
					if (((edittext177.getText().toString().equals("") || edittext177.getText().toString().equals(".")) || edittext177.getText().toString().equals("-")) || (Double.parseDouble(edittext177.getText().toString()) < 0)) {
						edittext177.setText(String.valueOf(00.00));
					}
					edittext178.setText(String.valueOf(Double.parseDouble(edittext175.getText().toString()) * (Double.parseDouble(edittext176.getText().toString()) * Double.parseDouble(edittext177.getText().toString()))));
					edittext178.setTextColor(0xFF000000);
					if (((edittext137.getText().toString().equals("") || edittext137.getText().toString().equals(".")) || edittext137.getText().toString().equals("-")) || (Double.parseDouble(edittext137.getText().toString()) < 0)) {
						edittext137.setText(String.valueOf(00.00));
					}
					if (((edittext138.getText().toString().equals("") || edittext138.getText().toString().equals(".")) || edittext138.getText().toString().equals("-")) || (Double.parseDouble(edittext138.getText().toString()) < 0)) {
						edittext138.setText(String.valueOf(1));
					}
					if (((edittext139.getText().toString().equals("") || edittext139.getText().toString().equals(".")) || edittext139.getText().toString().equals("-")) || (Double.parseDouble(edittext139.getText().toString()) < 0)) {
						edittext139.setText(String.valueOf(00.00));
					}
					edittext165.setText(String.valueOf(Double.parseDouble(edittext137.getText().toString()) * (Double.parseDouble(edittext138.getText().toString()) * Double.parseDouble(edittext139.getText().toString()))));
					edittext165.setTextColor(0xFF000000);
					if (((edittext140.getText().toString().equals("") || edittext140.getText().toString().equals(".")) || edittext140.getText().toString().equals("-")) || (Double.parseDouble(edittext140.getText().toString()) < 0)) {
						edittext140.setText(String.valueOf(00.00));
					}
					if (((edittext141.getText().toString().equals("") || edittext141.getText().toString().equals(".")) || edittext141.getText().toString().equals("-")) || (Double.parseDouble(edittext141.getText().toString()) < 0)) {
						edittext141.setText(String.valueOf(1));
					}
					if (((edittext142.getText().toString().equals("") || edittext142.getText().toString().equals(".")) || edittext142.getText().toString().equals("-")) || (Double.parseDouble(edittext142.getText().toString()) < 0)) {
						edittext142.setText(String.valueOf(00.00));
					}
					edittext166.setText(String.valueOf(Double.parseDouble(edittext140.getText().toString()) * (Double.parseDouble(edittext141.getText().toString()) * Double.parseDouble(edittext142.getText().toString()))));
					edittext166.setTextColor(0xFF000000);
					edittext167.setText(String.valueOf((((Double.parseDouble(edittext144.getText().toString()) + Double.parseDouble(edittext147.getText().toString())) + Double.parseDouble(edittext150.getText().toString())) + ((Double.parseDouble(edittext153.getText().toString()) + Double.parseDouble(edittext156.getText().toString())) + Double.parseDouble(edittext157.getText().toString()))) + (((Double.parseDouble(edittext160.getText().toString()) + Double.parseDouble(edittext163.getText().toString())) + Double.parseDouble(edittext164.getText().toString())) + ((Double.parseDouble(edittext165.getText().toString()) + Double.parseDouble(edittext166.getText().toString())) + (Double.parseDouble(edittext174.getText().toString()) + Double.parseDouble(edittext178.getText().toString()))))));
					edittext167.setTextColor(0xFFFFFFFF);
					edittext168.setText(String.valueOf(Double.parseDouble(edittext167.getText().toString()) / Double.parseDouble(edittext24.getText().toString())));
					edittext168.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext144.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext144.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext145.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext145.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext146.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext146.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext147.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext147.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext148.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext148.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext149.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext150.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext151.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext151.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext152.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext152.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext153.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext154.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext154.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext155.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext156.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext156.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext157.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
		
		edittext159.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext159.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext160.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext160.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext161.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext161.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext162.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext162.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext163.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext172.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext172.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext173.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext174.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext174.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext164.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext164.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext178.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext165.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext166.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext166.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext167.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 11)});
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
				edittext168.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext221.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.equals("")) {
					textview656.setText("إجمالى تكلفة معدات أخرى ( جنيه )");
				}
				else {
					textview656.setText(_charSeq);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear193.setVisibility(View.GONE);
				edittext201.setText("");
				edittext203.setText("");
				edittext204.setText("");
				edittext205.setText("");
				edittext206.setText("");
				edittext207.setText("");
				edittext208.setText("");
				edittext209.setText("");
				edittext210.setText("");
				edittext211.setText("");
				edittext212.setText("");
				edittext213.setText("");
				edittext214.setText("");
				edittext215.setText("");
				edittext216.setText("");
				edittext217.setText("");
				edittext218.setText("");
				edittext219.setText("");
				edittext220.setText("");
				edittext221.setText("");
				edittext222.setText("");
				edittext223.setText("");
				edittext240.setText("");
				edittext241.setText("");
				edittext243.setText("");
				edittext244.setText("");
			}
		});
		
		edittext201.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext201.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				edittext224.setText(String.valueOf(00.00));
				edittext225.setText(String.valueOf(00.00));
				edittext229.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext224.setTextColor(0xFFE91E63);
				edittext225.setTextColor(0xFFE91E63);
				edittext229.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
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
				edittext203.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				edittext225.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext225.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setText(String.valueOf(00.00));
				edittext238.setTextColor(0xFFE91E63);
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
				edittext226.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext226.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext204.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext204.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext226.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext226.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
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
				edittext227.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext227.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext206.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext206.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext227.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext227.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
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
				edittext209.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext228.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext228.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
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
				edittext208.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext228.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext228.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext210.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext210.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext229.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext229.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext212.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext212.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext230.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext230.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext211.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext211.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext230.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext230.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext214.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext214.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext231.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext231.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
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
				edittext213.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext231.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext231.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext216.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext216.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext232.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext232.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
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
				edittext232.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext232.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext241.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext241.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext242.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext242.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext240.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext240.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext242.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext242.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
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
				edittext218.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext233.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext233.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
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
				edittext233.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext233.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext244.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext244.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext245.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext245.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext243.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext243.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext245.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext245.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext220.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext220.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext234.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext234.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
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
				edittext219.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext234.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext234.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext223.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext223.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext235.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext235.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext222.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext222.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext235.setText(String.valueOf(00.00));
				edittext236.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext235.setTextColor(0xFFE91E63);
				edittext236.setTextColor(0xFFE91E63);
				edittext237.setTextColor(0xFFE91E63);
				edittext238.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0)))) || (((edittext4.getText().toString().equals("") || edittext4.getText().toString().equals(".")) || (edittext4.getText().toString().equals("-") || (Double.parseDouble(edittext4.getText().toString()) < 0))) || (((edittext201.getText().toString().equals("") || edittext201.getText().toString().equals(".")) || (edittext201.getText().toString().equals("-") || (Double.parseDouble(edittext201.getText().toString()) < 0))) || ((edittext203.getText().toString().equals("") || edittext203.getText().toString().equals(".")) || (edittext203.getText().toString().equals("-") || (Double.parseDouble(edittext203.getText().toString()) < 0)))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) {
						edittext5.setText(String.valueOf(0.06d));
					}
					if ((edittext12.getText().toString().equals("") || edittext12.getText().toString().equals(".")) || (edittext12.getText().toString().equals("-") || (Double.parseDouble(edittext12.getText().toString()) < 0))) {
						edittext12.setText(String.valueOf(2.34d));
					}
					if ((edittext204.getText().toString().equals("") || edittext204.getText().toString().equals(".")) || (edittext204.getText().toString().equals("-") || (Double.parseDouble(edittext204.getText().toString()) < 0))) {
						edittext204.setText(String.valueOf(1));
					}
					if ((edittext205.getText().toString().equals("") || edittext205.getText().toString().equals(".")) || (edittext205.getText().toString().equals("-") || (Double.parseDouble(edittext205.getText().toString()) < 0))) {
						edittext205.setText(String.valueOf(0));
					}
					if ((edittext206.getText().toString().equals("") || edittext206.getText().toString().equals(".")) || (edittext206.getText().toString().equals("-") || (Double.parseDouble(edittext206.getText().toString()) < 0))) {
						edittext206.setText(String.valueOf(0));
					}
					if ((edittext207.getText().toString().equals("") || edittext207.getText().toString().equals(".")) || (edittext207.getText().toString().equals("-") || (Double.parseDouble(edittext207.getText().toString()) < 0))) {
						edittext207.setText(String.valueOf(0));
					}
					if ((edittext208.getText().toString().equals("") || edittext208.getText().toString().equals(".")) || (edittext208.getText().toString().equals("-") || (Double.parseDouble(edittext208.getText().toString()) < 0))) {
						edittext208.setText(String.valueOf(0));
					}
					if (((edittext209.getText().toString().equals("") || edittext209.getText().toString().equals(".")) || edittext209.getText().toString().equals("-")) || (Double.parseDouble(edittext209.getText().toString()) < 0)) {
						edittext209.setText(String.valueOf(0));
					}
					if ((edittext210.getText().toString().equals("") || edittext210.getText().toString().equals(".")) || (edittext210.getText().toString().equals("-") || (Double.parseDouble(edittext210.getText().toString()) < 0))) {
						edittext210.setText(String.valueOf(0));
					}
					if ((edittext211.getText().toString().equals("") || edittext211.getText().toString().equals(".")) || (edittext211.getText().toString().equals("-") || (Double.parseDouble(edittext211.getText().toString()) < 0))) {
						edittext211.setText(String.valueOf(0));
					}
					if ((edittext212.getText().toString().equals("") || edittext212.getText().toString().equals(".")) || (edittext212.getText().toString().equals("-") || (Double.parseDouble(edittext212.getText().toString()) < 0))) {
						edittext212.setText(String.valueOf(0));
					}
					if ((edittext213.getText().toString().equals("") || edittext213.getText().toString().equals(".")) || (edittext213.getText().toString().equals("-") || (Double.parseDouble(edittext213.getText().toString()) < 0))) {
						edittext213.setText(String.valueOf(1));
					}
					if ((edittext214.getText().toString().equals("") || edittext214.getText().toString().equals(".")) || (edittext214.getText().toString().equals("-") || (Double.parseDouble(edittext214.getText().toString()) < 0))) {
						edittext214.setText(String.valueOf(0));
					}
					if ((edittext215.getText().toString().equals("") || edittext215.getText().toString().equals(".")) || (edittext215.getText().toString().equals("-") || (Double.parseDouble(edittext215.getText().toString()) < 0))) {
						edittext215.setText(String.valueOf(1));
					}
					if ((edittext216.getText().toString().equals("") || edittext216.getText().toString().equals(".")) || (edittext216.getText().toString().equals("-") || (Double.parseDouble(edittext216.getText().toString()) < 0))) {
						edittext216.setText(String.valueOf(0));
					}
					if ((edittext240.getText().toString().equals("") || edittext240.getText().toString().equals(".")) || (edittext240.getText().toString().equals("-") || (Double.parseDouble(edittext240.getText().toString()) < 0))) {
						edittext240.setText(String.valueOf(1));
					}
					if ((edittext241.getText().toString().equals("") || edittext241.getText().toString().equals(".")) || (edittext241.getText().toString().equals("-") || (Double.parseDouble(edittext241.getText().toString()) < 0))) {
						edittext241.setText(String.valueOf(0));
					}
					if ((edittext217.getText().toString().equals("") || edittext217.getText().toString().equals(".")) || (edittext217.getText().toString().equals("-") || (Double.parseDouble(edittext217.getText().toString()) < 0))) {
						edittext217.setText(String.valueOf(1));
					}
					if ((edittext218.getText().toString().equals("") || edittext218.getText().toString().equals(".")) || (edittext218.getText().toString().equals("-") || (Double.parseDouble(edittext218.getText().toString()) < 0))) {
						edittext218.setText(String.valueOf(0));
					}
					if ((edittext243.getText().toString().equals("") || edittext243.getText().toString().equals(".")) || (edittext243.getText().toString().equals("-") || (Double.parseDouble(edittext243.getText().toString()) < 0))) {
						edittext243.setText(String.valueOf(1));
					}
					if ((edittext244.getText().toString().equals("") || edittext244.getText().toString().equals(".")) || (edittext244.getText().toString().equals("-") || (Double.parseDouble(edittext244.getText().toString()) < 0))) {
						edittext244.setText(String.valueOf(0));
					}
					if ((edittext219.getText().toString().equals("") || edittext219.getText().toString().equals(".")) || (edittext219.getText().toString().equals("-") || (Double.parseDouble(edittext219.getText().toString()) < 0))) {
						edittext219.setText(String.valueOf(1));
					}
					if ((edittext220.getText().toString().equals("") || edittext220.getText().toString().equals(".")) || (edittext220.getText().toString().equals("-") || (Double.parseDouble(edittext220.getText().toString()) < 0))) {
						edittext220.setText(String.valueOf(0));
					}
					if ((edittext222.getText().toString().equals("") || edittext222.getText().toString().equals(".")) || (edittext222.getText().toString().equals("-") || (Double.parseDouble(edittext222.getText().toString()) < 0))) {
						edittext222.setText(String.valueOf(0));
					}
					if ((edittext223.getText().toString().equals("") || edittext223.getText().toString().equals(".")) || (edittext223.getText().toString().equals("-") || (Double.parseDouble(edittext223.getText().toString()) < 0))) {
						edittext223.setText(String.valueOf(0));
					}
					edittext239.setText(String.valueOf(Double.parseDouble(edittext201.getText().toString()) - Double.parseDouble(edittext26.getText().toString())));
					edittext224.setText(String.valueOf(((Double.parseDouble(edittext201.getText().toString()) - Double.parseDouble(edittext26.getText().toString())) / Double.parseDouble(edittext26.getText().toString())) * 100));
					edittext225.setText(String.valueOf(Double.parseDouble(edittext201.getText().toString()) * Double.parseDouble(edittext203.getText().toString())));
					edittext226.setText(String.valueOf(Double.parseDouble(edittext204.getText().toString()) * Double.parseDouble(edittext205.getText().toString())));
					edittext227.setText(String.valueOf(Double.parseDouble(edittext206.getText().toString()) * Double.parseDouble(edittext207.getText().toString())));
					edittext228.setText(String.valueOf(Double.parseDouble(edittext208.getText().toString()) * Double.parseDouble(edittext209.getText().toString())));
					edittext229.setText(String.valueOf((Double.parseDouble(edittext201.getText().toString()) / Double.parseDouble(edittext12.getText().toString())) * Double.parseDouble(edittext210.getText().toString())));
					edittext230.setText(String.valueOf(Double.parseDouble(edittext211.getText().toString()) * Double.parseDouble(edittext212.getText().toString())));
					edittext231.setText(String.valueOf(Double.parseDouble(edittext213.getText().toString()) * Double.parseDouble(edittext214.getText().toString())));
					edittext232.setText(String.valueOf(Double.parseDouble(edittext215.getText().toString()) * Double.parseDouble(edittext216.getText().toString())));
					edittext242.setText(String.valueOf(Double.parseDouble(edittext240.getText().toString()) * Double.parseDouble(edittext241.getText().toString())));
					edittext233.setText(String.valueOf(Double.parseDouble(edittext217.getText().toString()) * Double.parseDouble(edittext218.getText().toString())));
					edittext245.setText(String.valueOf(Double.parseDouble(edittext243.getText().toString()) * Double.parseDouble(edittext244.getText().toString())));
					edittext234.setText(String.valueOf(Double.parseDouble(edittext219.getText().toString()) * Double.parseDouble(edittext220.getText().toString())));
					edittext235.setText(String.valueOf(Double.parseDouble(edittext222.getText().toString()) * Double.parseDouble(edittext223.getText().toString())));
					edittext236.setText(String.valueOf((((Double.parseDouble(edittext226.getText().toString()) + Double.parseDouble(edittext227.getText().toString())) + (Double.parseDouble(edittext228.getText().toString()) + Double.parseDouble(edittext229.getText().toString()))) + (Double.parseDouble(edittext230.getText().toString()) + Double.parseDouble(edittext231.getText().toString()))) + (((Double.parseDouble(edittext232.getText().toString()) + Double.parseDouble(edittext233.getText().toString())) + (Double.parseDouble(edittext234.getText().toString()) + Double.parseDouble(edittext235.getText().toString()))) + (Double.parseDouble(edittext242.getText().toString()) + Double.parseDouble(edittext245.getText().toString())))));
					edittext237.setText(String.valueOf(Double.parseDouble(edittext225.getText().toString()) + Double.parseDouble(edittext236.getText().toString())));
					edittext238.setText(String.valueOf(Double.parseDouble(edittext237.getText().toString()) / Double.parseDouble(edittext24.getText().toString())));
					edittext239.setTextColor(0xFF000000);
					edittext224.setTextColor(0xFF000000);
					edittext225.setTextColor(0xFF000000);
					edittext226.setTextColor(0xFF000000);
					edittext227.setTextColor(0xFF000000);
					edittext228.setTextColor(0xFF000000);
					edittext229.setTextColor(0xFF000000);
					edittext230.setTextColor(0xFF000000);
					edittext231.setTextColor(0xFF000000);
					edittext232.setTextColor(0xFF000000);
					edittext242.setTextColor(0xFF000000);
					edittext233.setTextColor(0xFF000000);
					edittext245.setTextColor(0xFF000000);
					edittext234.setTextColor(0xFF000000);
					edittext235.setTextColor(0xFF000000);
					edittext236.setTextColor(0xFF000000);
					edittext237.setTextColor(0xFFFFFFFF);
					edittext238.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext239.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext239.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext224.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext224.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext225.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext225.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext226.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext226.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext227.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext227.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext228.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext228.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext229.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext229.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext230.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext230.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext231.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext231.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext232.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext232.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext242.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext242.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext233.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext233.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext245.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext245.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext234.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext234.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext235.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext235.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext236.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext236.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext237.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext237.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext238.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext238.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				_PrintHelper(linear1);
			}
		});
	}
	
	private void initializeLogic() {
		/*
مقاول باطن توريد وعمل
*/
		linear190.setVisibility(View.GONE);
		_round(linear190, "#FFE0F2F1", "#FF000000", 50);
		/*
هندسي توريد ذاتي ومقاول باطن تنفيذ مصنعيات
*/
		linear179.setVisibility(View.GONE);
		_round(linear179, "#FFE0F2F1", "#FF000000", 50);
		/*
هندسي معدات
*/
		linear870.setVisibility(View.GONE);
		_round(linear870, "#FFE0F2F1", "#FF000000", 50);
		/*
فعلي 
*/
		linear193.setVisibility(View.GONE);
		_round(linear193, "#FFE0F2F1", "#FF000000", 50);
		/*
الدينامك
*/
		dynamic_all.setVisibility(View.GONE);
		dynamic_sum_linear.setVisibility(View.GONE);
		/*
الأعلانات
*/
		
		{
		}
		/*
ملاحظة طول الطبقة
*/
		textview14.setVisibility(View.GONE);
		/*
التكلفة 
*/
		linear69.setVisibility(View.GONE);
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
	public void _round(final View _view, final String _color, final String _stroke_c, final double _radius) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((float)_radius);
		gd.setStroke(2, Color.parseColor(_stroke_c));
		
		_view.setBackground(gd);
		//With the view you select what will get rounded corners. The color is what the background color will look like. The stroke is the outline (put the same as color to "ignore" it) and the radius is how round will it be.
	}
	
	
	public void _GradientDrawable(final View _view, final String _color1, final String _color2) {
		int[] colors = { Color.parseColor(_color1), Color.parseColor(_color2) }; android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, colors); gd.setCornerRadius(0); _view.setBackground(gd);
	}
	
	
	public void _CardStyle(final View _view, final double _shadow, final double _radius, final String _color, final boolean _touch) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((int)_radius);
		_view.setBackground(gd);
		
		if (Build.VERSION.SDK_INT >= 21){
			_view.setElevation((int)_shadow);}
		if (_touch) {
			_view.setOnTouchListener(new View.OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					switch (event.getAction()){
						case MotionEvent.ACTION_DOWN:{
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues(0.9f);
							scaleX.setDuration(100);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues(0.9f);
							scaleY.setDuration(100);
							scaleY.start();
							break;
						}
						case MotionEvent.ACTION_UP:{
							
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues((float)1);
							scaleX.setDuration(100);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues((float)1);
							scaleY.setDuration(100);
							scaleY.start();
							
							break;
						}
					}
					return false;
				}
			});
		}
	}
	
	
	public void _removeView(final View _view) {
		try {
				((ViewGroup) _view.getParent()).removeView(_view);
		} catch (Exception e) {
				
		}
	}
	
	
	public void _Animator(final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.start();
	}
	
	
	public void _toipcc_d_soil() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout ll_mainDynamic = (LinearLayout) inflater.inflate(R.layout.toipcc_d_asphalt_layer, null, false);
		dynamic_all.addView(ll_mainDynamic);
		/*
تعريفات ال Textview
*/
		final TextView textview19d = ll_mainDynamic.findViewById(R.id.textview19d);
		final TextView textview21d = ll_mainDynamic.findViewById(R.id.textview21d);
		/*
تعريفات ال EditText
*/
		final EditText element_num_d = ll_mainDynamic.findViewById(R.id.element_num_d);
		element_num_d.setSingleLine(true);
		element_num_d.setFocusableInTouchMode(true);
		final EditText element_nums_d = ll_mainDynamic.findViewById(R.id.element_nums_d);
		element_nums_d.setSingleLine(true);
		element_nums_d.setFocusableInTouchMode(true);
		final EditText edittext2d = ll_mainDynamic.findViewById(R.id.edittext2d);
		edittext2d.setSingleLine(true);
		edittext2d.setFocusableInTouchMode(true);
		final EditText edittext3d = ll_mainDynamic.findViewById(R.id.edittext3d);
		edittext3d.setSingleLine(true);
		edittext3d.setFocusableInTouchMode(true);
		final EditText edittext4d = ll_mainDynamic.findViewById(R.id.edittext4d);
		edittext4d.setSingleLine(true);
		edittext4d.setFocusableInTouchMode(true);
		final EditText edittext6d = ll_mainDynamic.findViewById(R.id.edittext6d);
		edittext6d.setSingleLine(true);
		edittext6d.setFocusableInTouchMode(true);
		final EditText edittext7d = ll_mainDynamic.findViewById(R.id.edittext7d);
		edittext7d.setSingleLine(true);
		edittext7d.setFocusableInTouchMode(true);
		final EditText edittext8d = ll_mainDynamic.findViewById(R.id.edittext8d);
		edittext8d.setSingleLine(true);
		edittext8d.setFocusableInTouchMode(true);
		final EditText edittext9d = ll_mainDynamic.findViewById(R.id.edittext9d);
		edittext9d.setSingleLine(true);
		edittext9d.setFocusableInTouchMode(true);
		final EditText edittext10d = ll_mainDynamic.findViewById(R.id.edittext10d);
		edittext10d.setSingleLine(true);
		edittext10d.setFocusableInTouchMode(true);
		final EditText edittext11d = ll_mainDynamic.findViewById(R.id.edittext11d);
		edittext11d.setSingleLine(true);
		edittext11d.setFocusableInTouchMode(true);
		final EditText edittext13d = ll_mainDynamic.findViewById(R.id.edittext13d);
		edittext13d.setSingleLine(true);
		edittext13d.setFocusableInTouchMode(true);
		/*
تعريفات ال Button
*/
		final Button button1d = ll_mainDynamic.findViewById(R.id.button1d);
		final Button button2d = ll_mainDynamic.findViewById(R.id.button2d);
		final ImageView close = ll_mainDynamic.findViewById(R.id.close);
		/*
أولآ : التعليق عند الخطأ
*/
		final TextView textview14d = ll_mainDynamic.findViewById(R.id.textview14d);
		textview14d.setText("من فضلك أعد مراجعة محطة البداية ومحطة النهاية حيث أن محطة البداية بعد محطة النهاية وبذلك طول الطبقة بالسالب أي أقل من الصفر\nوبالتالي ستكون\n- المساحة الأجمالية أو المسطح الأجمالى لطبقة الأسفلت السطحية = 0.00 م٢\n- كمية الطبقة السطحية الإجمالية أو كمية الأسفلت الهندسية الأجمالية = 0.00 م٣");
		textview14d.setVisibility(View.GONE);
		/*
* سمك الطبقة
( م )
*/
		final TextView textview10d = ll_mainDynamic.findViewById(R.id.textview10d);
		textview10d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* سمك الطبقة\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٥ سم \"");
				return true;
			}
		});
		final EditText edittext5d = ll_mainDynamic.findViewById(R.id.edittext5d);
		edittext5d.setSingleLine(true);
		edittext5d.setFocusableInTouchMode(true);
		edittext5d.setHint("0.05");
		/*
المساحة الأجمالية أو المسطح الأجمالى لطبقة الأسفلت السطحية ( م٢ )
*/
		final TextView textview15d = ll_mainDynamic.findViewById(R.id.textview15d);
		textview15d.setText("المساحة الأجمالية أو المسطح الأجمالى لطبقة الأسفلت السطحية ( م٢ )");
		/*
كميات الطبقة السطحية شامل الأنضغاط
*/
		final TextView textview1255d = ll_mainDynamic.findViewById(R.id.textview1255d);
		textview1255d.setText("كميات الطبقة السطحية شامل الأنضغاط\n-------------------------------------");
		/*
* كثافة الخلطة الأسفلتية السطحية 
( طن / م٣ )
*/
		final TextView textview25d = ll_mainDynamic.findViewById(R.id.textview25d);
		textview25d.setText("* كثافة الخلطة الأسفلتية السطحية \n( طن / م٣ )");
		textview25d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* كثافة الخلطة الأسفلتية السطحية\n( طن / م٣ ) \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٢.٣٦ طن / م٣ \"");
				return true;
			}
		});
		final EditText edittext12d = ll_mainDynamic.findViewById(R.id.edittext12d);
		edittext12d.setSingleLine(true);
		edittext12d.setFocusableInTouchMode(true);
		edittext12d.setHint("2.36");
		/*
كمية الخلطة الأسفلتية السطحية المطلوب توريدها شامل نسبة أو معامل الأنضغاط ( طن )
*/
		final TextView textview27d = ll_mainDynamic.findViewById(R.id.textview27d);
		textview27d.setText("كمية الخلطة الأسفلتية السطحية المطلوب توريدها شامل نسبة أو معامل الأنضغاط ( طن )");
		/*
ثانيآ  :
أوامر الترقيم
*/
		element_num_d.setText(String.valueOf((long)(1 + dynamic_all.getChildCount())));
		element_nums_d.setText(String.valueOf((long)(1 + dynamic_all.getChildCount())));
		element_num_d.addTextChangedListener(new TextWatcher() { 	
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
					element_nums_d.setText("");
				}
				else {
					element_nums_d.setText(String.valueOf((long)(Double.parseDouble(s.toString()))));
				}
			} });
		/*
ثالثآ : التعليقات
*/
		textview19d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة الأنضغاط بالسمك\n( % )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١٠ % \" وذلك عند الضغط علي زرار أحسب");
				return true;
			}
		});
		textview21d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* ارتفاع الطبقة الفعلي قبل الدمك شامل معامل الأنضغاط ( م )\n\" ناتج قابل للتعديل يمكن تعديله يدويآ بالقيمة المراد ادخالها \"");
				return true;
			}
		});
		/*
رابعآ : الأوامر
*/
		edittext2d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext2dnn = _param1.toString();
								
edittext2d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext6d.setText(String.valueOf(00.00));
				edittext6d.setTextColor(0xFFE91E63);
				textview14d.setVisibility(View.GONE);
				edittext7d.setText(String.valueOf(00.00));
				edittext7d.setTextColor(0xFFE91E63);
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
		edittext3d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext3dnn = _param1.toString();
								
edittext3d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext6d.setText(String.valueOf(00.00));
				edittext6d.setTextColor(0xFFE91E63);
				textview14d.setVisibility(View.GONE);
				edittext7d.setText(String.valueOf(00.00));
				edittext7d.setTextColor(0xFFE91E63);
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
		edittext4d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext4dnn = _param1.toString();
								
edittext4d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext7d.setText(String.valueOf(00.00));
				edittext7d.setTextColor(0xFFE91E63);
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
		edittext5d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext5dnn = _param1.toString();
								
edittext5d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext8d.setText(String.valueOf(00.00));
				edittext8d.setTextColor(0xFFE91E63);
				edittext10d.setText(String.valueOf(00.00));
				edittext10d.setTextColor(0xFFE91E63);
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
				if ((((edittext2d.getText().toString().equals("") || edittext2d.getText().toString().equals(".")) || (edittext2d.getText().toString().equals("-") || (Double.parseDouble(edittext2d.getText().toString()) < 0))) || ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0)))) || ((edittext4d.getText().toString().equals("") || edittext4d.getText().toString().equals(". ")) || (edittext4d.getText().toString().equals("-") || (Double.parseDouble(edittext4d.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext5d.getText().toString().equals("") || edittext5d.getText().toString().equals(".")) || (edittext5d.getText().toString().equals("-") || (Double.parseDouble(edittext5d.getText().toString()) < 0))) {
						edittext5d.setText(String.valueOf(0.05d));
					}
					edittext6d.setText(String.valueOf(Double.parseDouble(edittext3d.getText().toString()) - Double.parseDouble(edittext2d.getText().toString())));
					if (Double.parseDouble(edittext6d.getText().toString()) < 0) {
						textview14d.setVisibility(View.VISIBLE);
						edittext7d.setText(String.valueOf(00.00d));
						edittext8d.setText(String.valueOf(00.00d));
					}
					else {
						textview14d.setVisibility(View.GONE);
						edittext7d.setText(String.valueOf(Double.parseDouble(edittext6d.getText().toString()) * Double.parseDouble(edittext4d.getText().toString())));
						edittext8d.setText(String.valueOf(Double.parseDouble(edittext7d.getText().toString()) * Double.parseDouble(edittext5d.getText().toString())));
					}
					edittext6d.setTextColor(0xFF000000);
					edittext7d.setTextColor(0xFF000000);
					edittext8d.setTextColor(0xFF000000);
				}
			}
		});
		edittext6d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
		edittext7d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				edittext7d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				if ((edittext10d.getText().toString().equals("") || edittext10d.getText().toString().equals(".")) || (edittext10d.getText().toString().equals("-") || (Double.parseDouble(edittext10d.getText().toString()) < 0))) {
					edittext11d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString())));
				}
				else {
					edittext11d.setText(String.valueOf(Double.parseDouble(s.toString()) * Double.parseDouble(edittext10d.getText().toString())));
				}
				temp1 = 0;
				for (int i = 0; i < (int)(dynamic_all.getChildCount()); i++) {
					View child=dynamic_all.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext7d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext21.setText(String.valueOf(temp1));
			} });
		edittext8d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
		edittext9d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext9dnn = _param1.toString();
								
edittext9d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext10d.setText(String.valueOf(00.00));
				edittext10d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext12d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext12dnn = _param1.toString();
								
edittext12d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((edittext12dnn.equals("") || edittext12dnn.equals(".")) || (edittext12dnn.equals("-") || (Double.parseDouble(edittext12dnn) < 0))) {
					edittext13d.setText(String.valueOf(00.00));
				}
				else {
					edittext13d.setText(String.valueOf(Double.parseDouble(edittext11d.getText().toString()) * Double.parseDouble(edittext12dnn)));
				}
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
				if ((((edittext2d.getText().toString().equals("") || edittext2d.getText().toString().equals(".")) || (edittext2d.getText().toString().equals("-") || (Double.parseDouble(edittext2d.getText().toString()) < 0))) || ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || (edittext3d.getText().toString().equals("-") || (Double.parseDouble(edittext3d.getText().toString()) < 0)))) || ((edittext4d.getText().toString().equals("") || edittext4d.getText().toString().equals(". ")) || (edittext4d.getText().toString().equals("-") || (Double.parseDouble(edittext4d.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext5d.getText().toString().equals("") || edittext5d.getText().toString().equals(".")) || (edittext5d.getText().toString().equals("-") || (Double.parseDouble(edittext5d.getText().toString()) < 0))) {
						edittext5d.setText(String.valueOf(0.05d));
					}
					if (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || (Double.parseDouble(edittext9d.getText().toString()) > 100)) {
						edittext9d.setText(String.valueOf(10));
					}
					if ((edittext12d.getText().toString().equals("") || edittext12d.getText().toString().equals(".")) || (edittext12d.getText().toString().equals("-") || (Double.parseDouble(edittext12d.getText().toString()) < 0))) {
						edittext12d.setText(String.valueOf(2.36d));
					}
					if ((Double.parseDouble(edittext10d.getText().toString()) == 0) || ((edittext10d.getText().toString().equals("") || edittext10d.getText().toString().equals(".")) || (edittext10d.getText().toString().equals("-") || (Double.parseDouble(edittext10d.getText().toString()) < 0)))) {
						edittext10d.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString()) + (Double.parseDouble(edittext5d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) / 100))));
						edittext11d.setText(String.valueOf(Double.parseDouble(edittext7d.getText().toString()) * Double.parseDouble(edittext10d.getText().toString())));
						edittext13d.setText(String.valueOf(Double.parseDouble(edittext11d.getText().toString()) * Double.parseDouble(edittext12d.getText().toString())));
					}
					else {
						edittext10d.setText(String.valueOf(Double.parseDouble(edittext10d.getText().toString())));
						edittext11d.setText(String.valueOf(Double.parseDouble(edittext7d.getText().toString()) * Double.parseDouble(edittext10d.getText().toString())));
						edittext13d.setText(String.valueOf(Double.parseDouble(edittext11d.getText().toString()) * Double.parseDouble(edittext12d.getText().toString())));
					}
					edittext10d.setTextColor(0xFF000000);
				}
			}
		});
		edittext10d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext10dnn = _param1.toString();
								
edittext10d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext10dnn.equals("") || edittext10dnn.equals(".")) || (edittext10dnn.equals("-") || (Double.parseDouble(edittext10dnn) < 0))) {
					edittext11d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString())));
				}
				else {
					edittext11d.setText(String.valueOf(Double.parseDouble(edittext7d.getText().toString()) * Double.parseDouble(edittext10dnn)));
				}
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
المجموع الدينامك للمكعب الخلطة الأسفلتية
*/
		edittext11d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext11dnn = _param1.toString();
								
edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
				if ((edittext12d.getText().toString().equals("") || edittext12d.getText().toString().equals(".")) || (edittext12d.getText().toString().equals("-") || (Double.parseDouble(edittext12d.getText().toString()) < 0))) {
					edittext13d.setText(String.valueOf(00.00));
				}
				else {
					edittext13d.setText(String.valueOf(Double.parseDouble(edittext12d.getText().toString()) * Double.parseDouble(edittext11dnn)));
				}
				temp2 = 0;
				for (int i = 0; i < (int)(dynamic_all.getChildCount()); i++) {
					View child=dynamic_all.getChildAt(i); 
					TextView tempo2 =child.findViewById(R.id.edittext11d);
					temp2 = temp2 + Double.parseDouble(tempo2.getText().toString());
				}
				edittext22.setText(String.valueOf(temp2));
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
المجموع الدينامك لكمية الخلطة الأسفلتية
*/
		edittext13d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext13dnn = _param1.toString();
								
edittext13d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
				temp3 = 0;
				for (int i = 0; i < (int)(dynamic_all.getChildCount()); i++) {
					View child=dynamic_all.getChildAt(i); 
					TextView tempo3 =child.findViewById(R.id.edittext13d);
					temp3 = temp3 + Double.parseDouble(tempo3.getText().toString());
				}
				edittext23.setText(String.valueOf(temp3));
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(ll_mainDynamic);
				/*
المجموع الدينامك للمسطح الخلطة الأسفلتية م٢ بعد الحذف
*/
				temp1 = 0;
				for (int i = 0; i < (int)(dynamic_all.getChildCount()); i++) {
					View child=dynamic_all.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext7d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext21.setText(String.valueOf(temp1));
				/*
المجموع الدينامك للمكعب الخلطة الأسفلتية م٣ بعد الحذف
*/
				temp2 = 0;
				for (int i = 0; i < (int)(dynamic_all.getChildCount()); i++) {
					View child=dynamic_all.getChildAt(i); 
					TextView tempo2 =child.findViewById(R.id.edittext11d);
					temp2 = temp2 + Double.parseDouble(tempo2.getText().toString());
				}
				edittext22.setText(String.valueOf(temp2));
				/*
المجموع الدينامك لكمية الخلطة الأسفلتية طن بعد الحذف
*/
				temp3 = 0;
				for (int i = 0; i < (int)(dynamic_all.getChildCount()); i++) {
					View child=dynamic_all.getChildAt(i); 
					TextView tempo3 =child.findViewById(R.id.edittext13d);
					temp3 = temp3 + Double.parseDouble(tempo3.getText().toString());
				}
				edittext23.setText(String.valueOf(temp3));
			}
		});
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
		WebView webView = new WebView(ToipccWearingSerfaceAsphaltLayersActivity.this);
		webView.loadDataWithBaseURL(null, htmlContent.toString(), "text/html", "UTF-8", null);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageFinished(WebView view, String url) {
				PrintManager printManager = (PrintManager) ToipccWearingSerfaceAsphaltLayersActivity.this.getSystemService(PRINT_SERVICE);
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
				.setMessage("دليل المدخلات\n" +
                "---------------\n" +
                "١ - \" * \" علامة وجود تعريفات أو ملاحظات\n" +
                "-----------------------------------------\n" +
                "فى حالة وجود علامة \" * \" بجوار أسم أو منطوق أو صيغة أي مدخل فيمكنك الضغط علي الأسم أو الصيغة أو المنطوق للمدخل ضغطة طويله وسيظهر تعريف أو ملاحظة لهذا المدخل\n" +
                "٢ - مدخل أساسي يجب إدخاله\n" +
                "٣ - مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراض قيمته بالقيمة الموجودة داخل المستطيل وذلك عند الضغط علي زرار \" أحسب = \"\n" +
                "أحسب\n" +
                "=\n" +
                "٤ - للحصول علي الناتج أضغط علي الزر الأسود وعند تعديل أو تغيير أي مدخل يتم الضغط مرة أخرى علي الزر الأسود\n" +
                "٥ - لأضافة أو إلغاء أو إظهار قائمة أضغط علي الزر\n" +
                "-----‐---------------------------------")
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
