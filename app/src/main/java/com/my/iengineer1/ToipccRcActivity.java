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
import androidx.print.PrintHelper;


public class ToipccRcActivity extends AppCompatActivity {
	
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
	private HorizontalScrollView hscroll119;
	private LinearLayout linear9;
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
	private TextView textview27;
	private TextView textview334;
	private LinearLayout linear118;
	private TextView textview28;
	private EditText edittext13;
	private TextView textview704;
	private Button add_dynamic_element;
	private LinearLayout linear6;
	private LinearLayout linear588;
	private EditText edittext21;
	private TextView textview40;
	private TextView textview50;
	private EditText edittext22;
	private TextView textview1271;
	private TextView textview51;
	private TextView textview1254;
	private LinearLayout linear573;
	private HorizontalScrollView hscroll83;
	private LinearLayout linear109;
	private TextView textview1248;
	private EditText edittext24;
	private TextView textview1249;
	private TextView textview1250;
	private TextView textview591;
	private EditText edittext25;
	private TextView textview594;
	private TextView textview593;
	private TextView textview1261;
	private LinearLayout linear584;
	private LinearLayout linear954;
	private LinearLayout linear585;
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
	private TextView textview1173;
	private TextView textview403;
	private TextView textview404;
	private TextView textview421;
	private LinearLayout linear539;
	private TextView textview1180;
	private TextView textview425;
	private LinearLayout linear543;
	private TextView textview1188;
	private TextView textview638;
	private LinearLayout linear551;
	private TextView textview2108;
	private TextView textview2289;
	private LinearLayout linear522;
	private TextView textview2288;
	private TextView textview433;
	private LinearLayout linear975;
	private TextView textview2287;
	private TextView textview437;
	private LinearLayout linear900;
	private TextView textview2120;
	private EditText edittext145;
	private LinearLayout linear904;
	private TextView textview2131;
	private LinearLayout linear871;
	private HorizontalScrollView hscroll87;
	private LinearLayout linear883;
	private HorizontalScrollView hscroll92;
	private LinearLayout linear555;
	private HorizontalScrollView hscroll97;
	private LinearLayout linear557;
	private HorizontalScrollView hscroll99;
	private LinearLayout linear911;
	private HorizontalScrollView hscroll120;
	private LinearLayout linear1012;
	private HorizontalScrollView hscroll121;
	private LinearLayout linear985;
	private HorizontalScrollView hscroll110;
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
	private LinearLayout linear540;
	private TextView textview1182;
	private LinearLayout linear541;
	private TextView textview1183;
	private LinearLayout linear542;
	private TextView textview424;
	private EditText edittext123;
	private TextView textview423;
	private EditText edittext122;
	private TextView textview422;
	private EditText edittext121;
	private LinearLayout linear544;
	private TextView textview1191;
	private LinearLayout linear545;
	private TextView textview1192;
	private LinearLayout linear546;
	private TextView textview428;
	private EditText edittext127;
	private TextView textview427;
	private EditText edittext126;
	private TextView textview426;
	private EditText edittext125;
	private LinearLayout linear552;
	private TextView textview1204;
	private LinearLayout linear553;
	private TextView textview1205;
	private LinearLayout linear554;
	private TextView textview1206;
	private EditText edittext131;
	private TextView textview1207;
	private EditText edittext130;
	private TextView textview1208;
	private EditText edittext129;
	private LinearLayout linear523;
	private TextView textview1148;
	private LinearLayout linear524;
	private TextView textview1149;
	private LinearLayout linear525;
	private TextView textview1150;
	private EditText edittext135;
	private TextView textview1151;
	private EditText edittext134;
	private TextView textview1152;
	private EditText edittext133;
	private LinearLayout linear976;
	private TextView textview2253;
	private LinearLayout linear977;
	private TextView textview2254;
	private LinearLayout linear978;
	private TextView textview475;
	private EditText edittext139;
	private TextView textview474;
	private EditText edittext138;
	private TextView textview473;
	private EditText edittext137;
	private LinearLayout linear901;
	private TextView textview2121;
	private LinearLayout linear902;
	private TextView textview2122;
	private LinearLayout linear903;
	private TextView textview440;
	private EditText edittext143;
	private TextView textview439;
	private EditText edittext142;
	private TextView textview438;
	private EditText edittext141;
	private LinearLayout linear905;
	private TextView textview2126;
	private LinearLayout linear906;
	private TextView textview2127;
	private LinearLayout linear907;
	private TextView textview443;
	private EditText edittext148;
	private TextView textview442;
	private EditText edittext147;
	private TextView textview441;
	private EditText edittext146;
	private Button button11;
	private TextView textview2088;
	private EditText edittext113;
	private TextView textview2089;
	private TextView textview444;
	private TextView textview1211;
	private EditText edittext124;
	private TextView textview1209;
	private TextView textview457;
	private TextView textview1214;
	private EditText edittext128;
	private TextView textview1215;
	private TextView textview460;
	private TextView textview2141;
	private EditText edittext132;
	private TextView textview2142;
	private TextView textview463;
	private TextView textview2293;
	private EditText edittext136;
	private TextView textview2294;
	private TextView textview2295;
	private TextView textview2263;
	private EditText edittext140;
	private TextView textview2264;
	private TextView textview2265;
	private TextView textview2144;
	private EditText edittext144;
	private TextView textview2145;
	private TextView textview465;
	private TextView textview2147;
	private EditText edittext149;
	private TextView textview2148;
	private TextView textview466;
	private TextView textview467;
	private TextView textview2095;
	private LinearLayout linear887;
	private TextView textview2096;
	private EditText edittext150;
	private TextView textview2097;
	private EditText edittext151;
	private TextView textview2098;
	private TextView textview468;
	private LinearLayout linear973;
	private HorizontalScrollView hscroll109;
	private TextView textview600;
	private HorizontalScrollView hscroll78;
	private LinearLayout linear194;
	private HorizontalScrollView hscroll122;
	private LinearLayout linear195;
	private TextView textview2286;
	private TextView textview2285;
	private TextView textview604;
	private TextView textview617;
	private LinearLayout linear219;
	private TextView textview667;
	private TextView textview620;
	private LinearLayout linear223;
	private TextView textview680;
	private TextView textview2302;
	private LinearLayout linear202;
	private TextView textview2303;
	private TextView textview2304;
	private LinearLayout linear1015;
	private TextView textview2308;
	private TextView textview623;
	private LinearLayout linear935;
	private TextView textview2284;
	private TextView textview629;
	private LinearLayout linear941;
	private TextView textview2209;
	private EditText edittext225;
	private LinearLayout linear227;
	private TextView textview682;
	private LinearLayout linear197;
	private LinearLayout linear964;
	private LinearLayout linear196;
	private LinearLayout linear198;
	private HorizontalScrollView hscroll104;
	private LinearLayout linear232;
	private LinearLayout linear957;
	private LinearLayout linear922;
	private LinearLayout linear1023;
	private LinearLayout linear958;
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
	private EditText edittext216;
	private TextView textview621;
	private EditText edittext215;
	private LinearLayout linear218;
	private TextView textview642;
	private LinearLayout linear203;
	private TextView textview627;
	private EditText edittext218;
	private TextView textview626;
	private EditText edittext217;
	private LinearLayout linear1016;
	private TextView textview2305;
	private LinearLayout linear1017;
	private TextView textview640;
	private EditText edittext220;
	private TextView textview639;
	private EditText edittext219;
	private LinearLayout linear936;
	private TextView textview2196;
	private LinearLayout linear937;
	private TextView textview625;
	private EditText edittext222;
	private TextView textview624;
	private EditText edittext221;
	private LinearLayout linear942;
	private TextView textview2206;
	private LinearLayout linear943;
	private TextView textview631;
	private EditText edittext224;
	private TextView textview630;
	private EditText edittext223;
	private LinearLayout linear228;
	private TextView textview675;
	private LinearLayout linear230;
	private TextView textview633;
	private EditText edittext227;
	private TextView textview632;
	private EditText edittext226;
	private Button button12;
	private TextView textview2249;
	private EditText edittext228;
	private TextView textview2250;
	private TextView textview2251;
	private TextView textview635;
	private EditText edittext229;
	private TextView textview661;
	private TextView textview634;
	private TextView textview637;
	private EditText edittext230;
	private TextView textview672;
	private TextView textview636;
	private TextView textview647;
	private EditText edittext231;
	private TextView textview687;
	private TextView textview646;
	private TextView textview649;
	private EditText edittext232;
	private TextView textview2233;
	private TextView textview648;
	private TextView textview2174;
	private EditText edittext233;
	private TextView textview2175;
	private TextView textview462;
	private TextView textview2317;
	private EditText edittext234;
	private TextView textview2318;
	private TextView textview2319;
	private TextView textview651;
	private EditText edittext235;
	private TextView textview2236;
	private TextView textview650;
	private TextView textview655;
	private EditText edittext237;
	private TextView textview689;
	private TextView textview654;
	private TextView textview657;
	private EditText edittext238;
	private TextView textview2242;
	private TextView textview656;
	private TextView textview659;
	private EditText edittext239;
	private TextView textview673;
	private TextView textview658;
	private TextView textview660;
	private TextView textview535;
	private LinearLayout linear201;
	private TextView textview678;
	private EditText edittext240;
	private TextView textview664;
	private EditText edittext241;
	private TextView textview2244;
	private TextView textview662;
	
	private Intent price = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_rc);
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
		hscroll119 = findViewById(R.id.hscroll119);
		linear9 = findViewById(R.id.linear9);
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
		textview27 = findViewById(R.id.textview27);
		textview334 = findViewById(R.id.textview334);
		linear118 = findViewById(R.id.linear118);
		textview28 = findViewById(R.id.textview28);
		edittext13 = findViewById(R.id.edittext13);
		textview704 = findViewById(R.id.textview704);
		add_dynamic_element = findViewById(R.id.add_dynamic_element);
		linear6 = findViewById(R.id.linear6);
		linear588 = findViewById(R.id.linear588);
		edittext21 = findViewById(R.id.edittext21);
		textview40 = findViewById(R.id.textview40);
		textview50 = findViewById(R.id.textview50);
		edittext22 = findViewById(R.id.edittext22);
		textview1271 = findViewById(R.id.textview1271);
		textview51 = findViewById(R.id.textview51);
		textview1254 = findViewById(R.id.textview1254);
		linear573 = findViewById(R.id.linear573);
		hscroll83 = findViewById(R.id.hscroll83);
		linear109 = findViewById(R.id.linear109);
		textview1248 = findViewById(R.id.textview1248);
		edittext24 = findViewById(R.id.edittext24);
		textview1249 = findViewById(R.id.textview1249);
		textview1250 = findViewById(R.id.textview1250);
		textview591 = findViewById(R.id.textview591);
		edittext25 = findViewById(R.id.edittext25);
		textview594 = findViewById(R.id.textview594);
		textview593 = findViewById(R.id.textview593);
		textview1261 = findViewById(R.id.textview1261);
		linear584 = findViewById(R.id.linear584);
		linear954 = findViewById(R.id.linear954);
		linear585 = findViewById(R.id.linear585);
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
		textview1173 = findViewById(R.id.textview1173);
		textview403 = findViewById(R.id.textview403);
		textview404 = findViewById(R.id.textview404);
		textview421 = findViewById(R.id.textview421);
		linear539 = findViewById(R.id.linear539);
		textview1180 = findViewById(R.id.textview1180);
		textview425 = findViewById(R.id.textview425);
		linear543 = findViewById(R.id.linear543);
		textview1188 = findViewById(R.id.textview1188);
		textview638 = findViewById(R.id.textview638);
		linear551 = findViewById(R.id.linear551);
		textview2108 = findViewById(R.id.textview2108);
		textview2289 = findViewById(R.id.textview2289);
		linear522 = findViewById(R.id.linear522);
		textview2288 = findViewById(R.id.textview2288);
		textview433 = findViewById(R.id.textview433);
		linear975 = findViewById(R.id.linear975);
		textview2287 = findViewById(R.id.textview2287);
		textview437 = findViewById(R.id.textview437);
		linear900 = findViewById(R.id.linear900);
		textview2120 = findViewById(R.id.textview2120);
		edittext145 = findViewById(R.id.edittext145);
		linear904 = findViewById(R.id.linear904);
		textview2131 = findViewById(R.id.textview2131);
		linear871 = findViewById(R.id.linear871);
		hscroll87 = findViewById(R.id.hscroll87);
		linear883 = findViewById(R.id.linear883);
		hscroll92 = findViewById(R.id.hscroll92);
		linear555 = findViewById(R.id.linear555);
		hscroll97 = findViewById(R.id.hscroll97);
		linear557 = findViewById(R.id.linear557);
		hscroll99 = findViewById(R.id.hscroll99);
		linear911 = findViewById(R.id.linear911);
		hscroll120 = findViewById(R.id.hscroll120);
		linear1012 = findViewById(R.id.linear1012);
		hscroll121 = findViewById(R.id.hscroll121);
		linear985 = findViewById(R.id.linear985);
		hscroll110 = findViewById(R.id.hscroll110);
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
		linear540 = findViewById(R.id.linear540);
		textview1182 = findViewById(R.id.textview1182);
		linear541 = findViewById(R.id.linear541);
		textview1183 = findViewById(R.id.textview1183);
		linear542 = findViewById(R.id.linear542);
		textview424 = findViewById(R.id.textview424);
		edittext123 = findViewById(R.id.edittext123);
		textview423 = findViewById(R.id.textview423);
		edittext122 = findViewById(R.id.edittext122);
		textview422 = findViewById(R.id.textview422);
		edittext121 = findViewById(R.id.edittext121);
		linear544 = findViewById(R.id.linear544);
		textview1191 = findViewById(R.id.textview1191);
		linear545 = findViewById(R.id.linear545);
		textview1192 = findViewById(R.id.textview1192);
		linear546 = findViewById(R.id.linear546);
		textview428 = findViewById(R.id.textview428);
		edittext127 = findViewById(R.id.edittext127);
		textview427 = findViewById(R.id.textview427);
		edittext126 = findViewById(R.id.edittext126);
		textview426 = findViewById(R.id.textview426);
		edittext125 = findViewById(R.id.edittext125);
		linear552 = findViewById(R.id.linear552);
		textview1204 = findViewById(R.id.textview1204);
		linear553 = findViewById(R.id.linear553);
		textview1205 = findViewById(R.id.textview1205);
		linear554 = findViewById(R.id.linear554);
		textview1206 = findViewById(R.id.textview1206);
		edittext131 = findViewById(R.id.edittext131);
		textview1207 = findViewById(R.id.textview1207);
		edittext130 = findViewById(R.id.edittext130);
		textview1208 = findViewById(R.id.textview1208);
		edittext129 = findViewById(R.id.edittext129);
		linear523 = findViewById(R.id.linear523);
		textview1148 = findViewById(R.id.textview1148);
		linear524 = findViewById(R.id.linear524);
		textview1149 = findViewById(R.id.textview1149);
		linear525 = findViewById(R.id.linear525);
		textview1150 = findViewById(R.id.textview1150);
		edittext135 = findViewById(R.id.edittext135);
		textview1151 = findViewById(R.id.textview1151);
		edittext134 = findViewById(R.id.edittext134);
		textview1152 = findViewById(R.id.textview1152);
		edittext133 = findViewById(R.id.edittext133);
		linear976 = findViewById(R.id.linear976);
		textview2253 = findViewById(R.id.textview2253);
		linear977 = findViewById(R.id.linear977);
		textview2254 = findViewById(R.id.textview2254);
		linear978 = findViewById(R.id.linear978);
		textview475 = findViewById(R.id.textview475);
		edittext139 = findViewById(R.id.edittext139);
		textview474 = findViewById(R.id.textview474);
		edittext138 = findViewById(R.id.edittext138);
		textview473 = findViewById(R.id.textview473);
		edittext137 = findViewById(R.id.edittext137);
		linear901 = findViewById(R.id.linear901);
		textview2121 = findViewById(R.id.textview2121);
		linear902 = findViewById(R.id.linear902);
		textview2122 = findViewById(R.id.textview2122);
		linear903 = findViewById(R.id.linear903);
		textview440 = findViewById(R.id.textview440);
		edittext143 = findViewById(R.id.edittext143);
		textview439 = findViewById(R.id.textview439);
		edittext142 = findViewById(R.id.edittext142);
		textview438 = findViewById(R.id.textview438);
		edittext141 = findViewById(R.id.edittext141);
		linear905 = findViewById(R.id.linear905);
		textview2126 = findViewById(R.id.textview2126);
		linear906 = findViewById(R.id.linear906);
		textview2127 = findViewById(R.id.textview2127);
		linear907 = findViewById(R.id.linear907);
		textview443 = findViewById(R.id.textview443);
		edittext148 = findViewById(R.id.edittext148);
		textview442 = findViewById(R.id.textview442);
		edittext147 = findViewById(R.id.edittext147);
		textview441 = findViewById(R.id.textview441);
		edittext146 = findViewById(R.id.edittext146);
		button11 = findViewById(R.id.button11);
		textview2088 = findViewById(R.id.textview2088);
		edittext113 = findViewById(R.id.edittext113);
		textview2089 = findViewById(R.id.textview2089);
		textview444 = findViewById(R.id.textview444);
		textview1211 = findViewById(R.id.textview1211);
		edittext124 = findViewById(R.id.edittext124);
		textview1209 = findViewById(R.id.textview1209);
		textview457 = findViewById(R.id.textview457);
		textview1214 = findViewById(R.id.textview1214);
		edittext128 = findViewById(R.id.edittext128);
		textview1215 = findViewById(R.id.textview1215);
		textview460 = findViewById(R.id.textview460);
		textview2141 = findViewById(R.id.textview2141);
		edittext132 = findViewById(R.id.edittext132);
		textview2142 = findViewById(R.id.textview2142);
		textview463 = findViewById(R.id.textview463);
		textview2293 = findViewById(R.id.textview2293);
		edittext136 = findViewById(R.id.edittext136);
		textview2294 = findViewById(R.id.textview2294);
		textview2295 = findViewById(R.id.textview2295);
		textview2263 = findViewById(R.id.textview2263);
		edittext140 = findViewById(R.id.edittext140);
		textview2264 = findViewById(R.id.textview2264);
		textview2265 = findViewById(R.id.textview2265);
		textview2144 = findViewById(R.id.textview2144);
		edittext144 = findViewById(R.id.edittext144);
		textview2145 = findViewById(R.id.textview2145);
		textview465 = findViewById(R.id.textview465);
		textview2147 = findViewById(R.id.textview2147);
		edittext149 = findViewById(R.id.edittext149);
		textview2148 = findViewById(R.id.textview2148);
		textview466 = findViewById(R.id.textview466);
		textview467 = findViewById(R.id.textview467);
		textview2095 = findViewById(R.id.textview2095);
		linear887 = findViewById(R.id.linear887);
		textview2096 = findViewById(R.id.textview2096);
		edittext150 = findViewById(R.id.edittext150);
		textview2097 = findViewById(R.id.textview2097);
		edittext151 = findViewById(R.id.edittext151);
		textview2098 = findViewById(R.id.textview2098);
		textview468 = findViewById(R.id.textview468);
		linear973 = findViewById(R.id.linear973);
		hscroll109 = findViewById(R.id.hscroll109);
		textview600 = findViewById(R.id.textview600);
		hscroll78 = findViewById(R.id.hscroll78);
		linear194 = findViewById(R.id.linear194);
		hscroll122 = findViewById(R.id.hscroll122);
		linear195 = findViewById(R.id.linear195);
		textview2286 = findViewById(R.id.textview2286);
		textview2285 = findViewById(R.id.textview2285);
		textview604 = findViewById(R.id.textview604);
		textview617 = findViewById(R.id.textview617);
		linear219 = findViewById(R.id.linear219);
		textview667 = findViewById(R.id.textview667);
		textview620 = findViewById(R.id.textview620);
		linear223 = findViewById(R.id.linear223);
		textview680 = findViewById(R.id.textview680);
		textview2302 = findViewById(R.id.textview2302);
		linear202 = findViewById(R.id.linear202);
		textview2303 = findViewById(R.id.textview2303);
		textview2304 = findViewById(R.id.textview2304);
		linear1015 = findViewById(R.id.linear1015);
		textview2308 = findViewById(R.id.textview2308);
		textview623 = findViewById(R.id.textview623);
		linear935 = findViewById(R.id.linear935);
		textview2284 = findViewById(R.id.textview2284);
		textview629 = findViewById(R.id.textview629);
		linear941 = findViewById(R.id.linear941);
		textview2209 = findViewById(R.id.textview2209);
		edittext225 = findViewById(R.id.edittext225);
		linear227 = findViewById(R.id.linear227);
		textview682 = findViewById(R.id.textview682);
		linear197 = findViewById(R.id.linear197);
		linear964 = findViewById(R.id.linear964);
		linear196 = findViewById(R.id.linear196);
		linear198 = findViewById(R.id.linear198);
		hscroll104 = findViewById(R.id.hscroll104);
		linear232 = findViewById(R.id.linear232);
		linear957 = findViewById(R.id.linear957);
		linear922 = findViewById(R.id.linear922);
		linear1023 = findViewById(R.id.linear1023);
		linear958 = findViewById(R.id.linear958);
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
		edittext216 = findViewById(R.id.edittext216);
		textview621 = findViewById(R.id.textview621);
		edittext215 = findViewById(R.id.edittext215);
		linear218 = findViewById(R.id.linear218);
		textview642 = findViewById(R.id.textview642);
		linear203 = findViewById(R.id.linear203);
		textview627 = findViewById(R.id.textview627);
		edittext218 = findViewById(R.id.edittext218);
		textview626 = findViewById(R.id.textview626);
		edittext217 = findViewById(R.id.edittext217);
		linear1016 = findViewById(R.id.linear1016);
		textview2305 = findViewById(R.id.textview2305);
		linear1017 = findViewById(R.id.linear1017);
		textview640 = findViewById(R.id.textview640);
		edittext220 = findViewById(R.id.edittext220);
		textview639 = findViewById(R.id.textview639);
		edittext219 = findViewById(R.id.edittext219);
		linear936 = findViewById(R.id.linear936);
		textview2196 = findViewById(R.id.textview2196);
		linear937 = findViewById(R.id.linear937);
		textview625 = findViewById(R.id.textview625);
		edittext222 = findViewById(R.id.edittext222);
		textview624 = findViewById(R.id.textview624);
		edittext221 = findViewById(R.id.edittext221);
		linear942 = findViewById(R.id.linear942);
		textview2206 = findViewById(R.id.textview2206);
		linear943 = findViewById(R.id.linear943);
		textview631 = findViewById(R.id.textview631);
		edittext224 = findViewById(R.id.edittext224);
		textview630 = findViewById(R.id.textview630);
		edittext223 = findViewById(R.id.edittext223);
		linear228 = findViewById(R.id.linear228);
		textview675 = findViewById(R.id.textview675);
		linear230 = findViewById(R.id.linear230);
		textview633 = findViewById(R.id.textview633);
		edittext227 = findViewById(R.id.edittext227);
		textview632 = findViewById(R.id.textview632);
		edittext226 = findViewById(R.id.edittext226);
		button12 = findViewById(R.id.button12);
		textview2249 = findViewById(R.id.textview2249);
		edittext228 = findViewById(R.id.edittext228);
		textview2250 = findViewById(R.id.textview2250);
		textview2251 = findViewById(R.id.textview2251);
		textview635 = findViewById(R.id.textview635);
		edittext229 = findViewById(R.id.edittext229);
		textview661 = findViewById(R.id.textview661);
		textview634 = findViewById(R.id.textview634);
		textview637 = findViewById(R.id.textview637);
		edittext230 = findViewById(R.id.edittext230);
		textview672 = findViewById(R.id.textview672);
		textview636 = findViewById(R.id.textview636);
		textview647 = findViewById(R.id.textview647);
		edittext231 = findViewById(R.id.edittext231);
		textview687 = findViewById(R.id.textview687);
		textview646 = findViewById(R.id.textview646);
		textview649 = findViewById(R.id.textview649);
		edittext232 = findViewById(R.id.edittext232);
		textview2233 = findViewById(R.id.textview2233);
		textview648 = findViewById(R.id.textview648);
		textview2174 = findViewById(R.id.textview2174);
		edittext233 = findViewById(R.id.edittext233);
		textview2175 = findViewById(R.id.textview2175);
		textview462 = findViewById(R.id.textview462);
		textview2317 = findViewById(R.id.textview2317);
		edittext234 = findViewById(R.id.edittext234);
		textview2318 = findViewById(R.id.textview2318);
		textview2319 = findViewById(R.id.textview2319);
		textview651 = findViewById(R.id.textview651);
		edittext235 = findViewById(R.id.edittext235);
		textview2236 = findViewById(R.id.textview2236);
		textview650 = findViewById(R.id.textview650);
		textview655 = findViewById(R.id.textview655);
		edittext237 = findViewById(R.id.edittext237);
		textview689 = findViewById(R.id.textview689);
		textview654 = findViewById(R.id.textview654);
		textview657 = findViewById(R.id.textview657);
		edittext238 = findViewById(R.id.edittext238);
		textview2242 = findViewById(R.id.textview2242);
		textview656 = findViewById(R.id.textview656);
		textview659 = findViewById(R.id.textview659);
		edittext239 = findViewById(R.id.edittext239);
		textview673 = findViewById(R.id.textview673);
		textview658 = findViewById(R.id.textview658);
		textview660 = findViewById(R.id.textview660);
		textview535 = findViewById(R.id.textview535);
		linear201 = findViewById(R.id.linear201);
		textview678 = findViewById(R.id.textview678);
		edittext240 = findViewById(R.id.edittext240);
		textview664 = findViewById(R.id.textview664);
		edittext241 = findViewById(R.id.edittext241);
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
				edittext13.setText(String.valueOf(00.00));
				edittext13.setTextColor(0xFFE91E63);
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
				edittext13.setText(String.valueOf(00.00));
				edittext13.setTextColor(0xFFE91E63);
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
				edittext13.setText(String.valueOf(00.00));
				edittext13.setTextColor(0xFFE91E63);
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
				edittext13.setText(String.valueOf(00.00));
				edittext13.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview10.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview10)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* معدل الرش\n( كجم / م٢ )\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٥ كجم / م٢ \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
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
						edittext5.setText(String.valueOf(0.5d));
					}
					edittext6.setText(String.valueOf(Double.parseDouble(edittext3.getText().toString()) - Double.parseDouble(edittext2.getText().toString())));
					if (Double.parseDouble(edittext6.getText().toString()) < 0) {
						textview14.setVisibility(View.VISIBLE);
						edittext7.setText(String.valueOf(00.00d));
						edittext8.setText(String.valueOf(00.00d));
						edittext13.setText(String.valueOf(00.00d));
					}
					else {
						textview14.setVisibility(View.GONE);
						edittext7.setText(String.valueOf(Double.parseDouble(edittext6.getText().toString()) * Double.parseDouble(edittext4.getText().toString())));
						edittext8.setText(String.valueOf(Double.parseDouble(edittext7.getText().toString()) * Double.parseDouble(edittext5.getText().toString())));
						edittext13.setText(String.valueOf(Double.parseDouble(edittext7.getText().toString()) * (Double.parseDouble(edittext5.getText().toString()) / 1000)));
					}
					edittext6.setTextColor(0xFF000000);
					edittext7.setTextColor(0xFF000000);
					edittext8.setTextColor(0xFF000000);
					edittext13.setTextColor(0xFF000000);
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
		
		edittext13.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext13.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext25.setText(String.valueOf(Double.parseDouble(edittext22.getText().toString()) + Double.parseDouble(_charSeq)));
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
					_Rc();
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
				edittext25.setText(String.valueOf(Double.parseDouble(edittext13.getText().toString()) + Double.parseDouble(_charSeq)));
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
				edittext128.setText(String.valueOf(00.00));
				edittext128.setTextColor(0xFFE91E63);
				edittext140.setText(String.valueOf(00.00));
				edittext140.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
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
		
		edittext27.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext27.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (Double.parseDouble(_charSeq) > 100)) {
					edittext28.setText(String.valueOf(Double.parseDouble(edittext25.getText().toString())));
				}
				else {
					edittext28.setText(String.valueOf(Double.parseDouble(edittext25.getText().toString()) + (Double.parseDouble(edittext25.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1264.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview1264)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* نسبة الهالك\nوهي تعبر عن كمية الهالك التي تحدث أثناء النقل وأثناء التشغيل وبعد التشغيل عند قطع اللحامات\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٣ % \" وذلك عند الضغط علي زرار أحسب")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
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
				edittext113.setText(String.valueOf(00.00));
				edittext113.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
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
					edittext113.setTextColor(0xFF000000);
					edittext121.setText("");
					edittext122.setText("");
					edittext123.setText("");
					edittext124.setTextColor(0xFF000000);
					edittext125.setText("");
					edittext126.setText("");
					edittext127.setText("");
					edittext128.setTextColor(0xFF000000);
					edittext129.setText("");
					edittext130.setText("");
					edittext131.setText("");
					edittext132.setTextColor(0xFF000000);
					edittext133.setText("");
					edittext134.setText("");
					edittext135.setText("");
					edittext136.setTextColor(0xFF000000);
					edittext137.setText("");
					edittext138.setText("");
					edittext139.setText("");
					edittext140.setTextColor(0xFF000000);
					edittext141.setText("");
					edittext142.setText("");
					edittext143.setText("");
					edittext144.setTextColor(0xFF000000);
					edittext145.setText("");
					edittext146.setText("");
					edittext147.setText("");
					edittext148.setText("");
					edittext149.setTextColor(0xFF000000);
					edittext150.setTextColor(0xFFFFFFFF);
					edittext151.setTextColor(0xFF000000);
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
					edittext211.setText("");
					edittext212.setText("");
					edittext215.setText("");
					edittext216.setText("");
					edittext217.setText("");
					edittext218.setText("");
					edittext219.setText("");
					edittext220.setText("");
					edittext221.setText("");
					edittext222.setText("");
					edittext223.setText("");
					edittext224.setText("");
					edittext225.setText("");
					edittext226.setText("");
					edittext227.setText("");
					edittext228.setTextColor(0xFF000000);
					edittext229.setTextColor(0xFF000000);
					edittext230.setTextColor(0xFF000000);
					edittext231.setTextColor(0xFF000000);
					edittext232.setTextColor(0xFF000000);
					edittext233.setTextColor(0xFF000000);
					edittext234.setTextColor(0xFF000000);
					edittext235.setTextColor(0xFF000000);
					edittext237.setTextColor(0xFF000000);
					edittext238.setTextColor(0xFF000000);
					edittext239.setTextColor(0xFF000000);
					edittext240.setTextColor(0xFFFFFFFF);
					edittext241.setTextColor(0xFF000000);
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
					edittext37.setText(String.valueOf(Double.parseDouble(edittext28.getText().toString()) * Double.parseDouble(edittext34.getText().toString())));
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
		
		edittext145.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.equals("")) {
					textview466.setText("تكلفة معدات أخرى ( جنيه )");
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
				edittext122.setText("");
				edittext123.setText("");
				edittext125.setText("");
				edittext126.setText("");
				edittext127.setText("");
				edittext129.setText("");
				edittext130.setText("");
				edittext131.setText("");
				edittext133.setText("");
				edittext134.setText("");
				edittext135.setText("");
				edittext137.setText("");
				edittext138.setText("");
				edittext139.setText("");
				edittext141.setText("");
				edittext142.setText("");
				edittext143.setText("");
				edittext145.setText("");
				edittext146.setText("");
				edittext147.setText("");
				edittext148.setText("");
			}
		});
		
		edittext112.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext112.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext113.setText(String.valueOf(00.00));
				edittext113.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview424.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview424)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("\n* سعر منشار\nقطع الأسفلت\nلكل يوم\n( جنيه / يوم )\n\n\nوهو يعبر عن المبلغ الذي يتكلفة منشار الأسفلت للعمل يوم واحد\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext123.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext123.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext124.setText(String.valueOf(00.00));
				edittext124.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview423.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview423)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد أيام\nالعمل التي\nسيتم استخدام\nمنشار قطع\nالأسفلت بها\nلزوم تنفيذ\nالبند\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext122.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext122.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext124.setText(String.valueOf(00.00));
				edittext124.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview422.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview422)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد منشار\nقطع الأسفلت\nالمتوقع\nاستخدامها\nفي اليوم\n( منشار أسفلت\n/ يوم )\n\n\nوهو يعبر عن عدد منشار الأسفلت التي يمكن استخدامها خلال اليوم في حالة الحاجة\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ منشار أسلفت / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext121.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext121.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext124.setText(String.valueOf(00.00));
				edittext124.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview428.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview428)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* يومية\nالمكنسة\n( جنيه / يوم )\nوهو يعبر عن المبلغ الذي تتقاضاه المكنسة بنهاية اليوم عن الأعمال التي قام بتنفيذها خلال اليوم \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext127.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext127.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext128.setText(String.valueOf(00.00));
				edittext128.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview427.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview427)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد أيام\nالعمل\nالمفترضة\nلتنفيذ البند\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext126.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext126.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext128.setText(String.valueOf(00.00));
				edittext128.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview426.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview426)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد\nالمكنسة\nالمستخدم\nفي اليوم\n( مكنسة / يوم )\n\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠٠.٠٠ مكنسة / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext125.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext125.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext128.setText(String.valueOf(00.00));
				edittext128.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1206.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview1206)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* يومية\nالجرار أو \nالسيارة\nاللازمة\nلجر \nالكومبرسور\n( جنيه / يوم )\nوهو يعبر عن المبلغ الذي يتقاضاه الجرار أو \nالسيارة\nاللازمة\nلجر \nالكومبرسور بنهاية اليوم عن الأعمال التي قام بتنفيذها خلال اليوم \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext131.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext131.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext132.setText(String.valueOf(00.00));
				edittext132.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1207.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview1207)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد أيام\nالعمل\nالمفترضة\nلتنفيذ البند\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext130.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext130.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext132.setText(String.valueOf(00.00));
				edittext132.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1208.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview1208)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الجرارات\nأو السيارات \nالمستخدمة لجر\nالكومبرسور بالبند\nخلال اليوم\n( جرار أو سيارة\n / يوم )\n\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠٠.٠٠ جرار أو سيارة لجر الكومبرسور / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext129.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext129.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext132.setText(String.valueOf(00.00));
				edittext132.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1150.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview1150)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* يومية\nالكومبرسور\n( جنيه / يوم )\nوهو يعبر عن المبلغ الذي يتقاضاه الكومبرسور بنهاية اليوم عن الأعمال التي قام بتنفيذها خلال اليوم \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext135.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext135.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext136.setText(String.valueOf(00.00));
				edittext136.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1151.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview1151)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد أيام\nالعمل\nالمفترضة\nلتنفيذ البند\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext134.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext134.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext136.setText(String.valueOf(00.00));
				edittext136.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1152.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview1152)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد\nالكومبرسورات\nالمستخدمة\nبالبند خلال\nاليوم\n( كومبرسور\n / يوم )\n\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠٠.٠٠ كومبرسور / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext133.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext133.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext136.setText(String.valueOf(00.00));
				edittext136.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview475.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview475)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالأتينير\n( جنيه / يوم )\nوهو يعبر عن المبلغ الذي يتقاضاه الأتينير بنهاية اليوم عن الأعمال التي قام بتنفيذها خلال اليوم \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext139.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext139.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext140.setText(String.valueOf(00.00));
				edittext140.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview474.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview474)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد أيام\nالعمل\nالمفترضة\nلتنفيذ البند\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext138.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext138.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext140.setText(String.valueOf(00.00));
				edittext140.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview473.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview473)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الأتينير المستخدم بالبند خلال اليوم\n( أتينير / يوم )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ أتينير / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext137.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext137.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext140.setText(String.valueOf(00.00));
				edittext140.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview440.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview440)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالعمالة والشواكة\n( جنيه / يوم )\nوهو يعبر عن المبلغ الذي يتقاضاه العامل أو الشواك خلال اليوم \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext143.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext143.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext144.setText(String.valueOf(00.00));
				edittext144.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview439.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview439)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد أيام\nالعمل\nالمفترضة\nلتنفيذ البند\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext142.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext142.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext144.setText(String.valueOf(00.00));
				edittext144.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview438.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview438)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد العمال والشواكة العاملين بالبند خلال اليوم\n( عامل أو شواك / يوم )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ عامل أو شواك / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext141.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext141.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext144.setText(String.valueOf(00.00));
				edittext144.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview443.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview443)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("اليومية\n( جنيه / يوم ) \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext148.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext148.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext149.setText(String.valueOf(00.00));
				edittext149.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview442.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview442)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد أيام\nالعمل\nالمفترضة\nلتنفيذ البند\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext147.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext147.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext149.setText(String.valueOf(00.00));
				edittext149.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview441.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview441)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("العدد\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠  / يوم \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext146.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext146.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext149.setText(String.valueOf(00.00));
				edittext149.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
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
				if (((edittext112.getText().toString().equals("") || edittext112.getText().toString().equals(".")) || (edittext112.getText().toString().equals("-") || (Double.parseDouble(edittext112.getText().toString()) < 0))) || (((edittext139.getText().toString().equals("") || edittext139.getText().toString().equals(".")) || edittext139.getText().toString().equals("-")) || (Double.parseDouble(edittext139.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					edittext113.setText(String.valueOf(Double.parseDouble(edittext28.getText().toString()) * Double.parseDouble(edittext112.getText().toString())));
					edittext113.setTextColor(0xFF000000);
					if (((edittext121.getText().toString().equals("") || edittext121.getText().toString().equals(".")) || edittext121.getText().toString().equals("-")) || (Double.parseDouble(edittext121.getText().toString()) < 0)) {
						edittext121.setText(String.valueOf(00.00));
					}
					if (((edittext122.getText().toString().equals("") || edittext122.getText().toString().equals(".")) || edittext122.getText().toString().equals("-")) || (Double.parseDouble(edittext122.getText().toString()) < 0)) {
						edittext122.setText(String.valueOf(1));
					}
					if (((edittext123.getText().toString().equals("") || edittext123.getText().toString().equals(".")) || edittext123.getText().toString().equals("-")) || (Double.parseDouble(edittext123.getText().toString()) < 0)) {
						edittext123.setText(String.valueOf(00.00));
					}
					edittext124.setText(String.valueOf(Double.parseDouble(edittext121.getText().toString()) * (Double.parseDouble(edittext122.getText().toString()) * Double.parseDouble(edittext123.getText().toString()))));
					edittext124.setTextColor(0xFF000000);
					if (((edittext125.getText().toString().equals("") || edittext125.getText().toString().equals(".")) || edittext125.getText().toString().equals("-")) || (Double.parseDouble(edittext125.getText().toString()) < 0)) {
						edittext125.setText(String.valueOf(0.00));
					}
					if (((edittext126.getText().toString().equals("") || edittext126.getText().toString().equals(".")) || edittext126.getText().toString().equals("-")) || (Double.parseDouble(edittext126.getText().toString()) < 0)) {
						edittext126.setText(String.valueOf(1));
					}
					if (((edittext127.getText().toString().equals("") || edittext127.getText().toString().equals(".")) || edittext127.getText().toString().equals("-")) || (Double.parseDouble(edittext127.getText().toString()) < 0)) {
						edittext127.setText(String.valueOf(00.00));
					}
					edittext128.setText(String.valueOf(Double.parseDouble(edittext125.getText().toString()) * (Double.parseDouble(edittext126.getText().toString()) * Double.parseDouble(edittext127.getText().toString()))));
					edittext128.setTextColor(0xFF000000);
					if (((edittext129.getText().toString().equals("") || edittext129.getText().toString().equals(".")) || edittext129.getText().toString().equals("-")) || (Double.parseDouble(edittext129.getText().toString()) < 0)) {
						edittext129.setText(String.valueOf(00.00));
					}
					if (((edittext130.getText().toString().equals("") || edittext130.getText().toString().equals(".")) || edittext130.getText().toString().equals("-")) || (Double.parseDouble(edittext130.getText().toString()) < 0)) {
						edittext130.setText(String.valueOf(1));
					}
					if (((edittext131.getText().toString().equals("") || edittext131.getText().toString().equals(".")) || edittext131.getText().toString().equals("-")) || (Double.parseDouble(edittext131.getText().toString()) < 0)) {
						edittext131.setText(String.valueOf(00.00));
					}
					edittext132.setText(String.valueOf(Double.parseDouble(edittext129.getText().toString()) * (Double.parseDouble(edittext130.getText().toString()) * Double.parseDouble(edittext131.getText().toString()))));
					edittext132.setTextColor(0xFF000000);
					if (((edittext133.getText().toString().equals("") || edittext133.getText().toString().equals(".")) || edittext133.getText().toString().equals("-")) || (Double.parseDouble(edittext133.getText().toString()) < 0)) {
						edittext133.setText(String.valueOf(00.00));
					}
					if (((edittext134.getText().toString().equals("") || edittext134.getText().toString().equals(".")) || edittext134.getText().toString().equals("-")) || (Double.parseDouble(edittext134.getText().toString()) < 0)) {
						edittext134.setText(String.valueOf(1));
					}
					if (((edittext135.getText().toString().equals("") || edittext135.getText().toString().equals(".")) || edittext135.getText().toString().equals("-")) || (Double.parseDouble(edittext135.getText().toString()) < 0)) {
						edittext135.setText(String.valueOf(00.00));
					}
					edittext136.setText(String.valueOf(Double.parseDouble(edittext133.getText().toString()) * (Double.parseDouble(edittext134.getText().toString()) * Double.parseDouble(edittext135.getText().toString()))));
					edittext136.setTextColor(0xFF000000);
					if (((edittext137.getText().toString().equals("") || edittext137.getText().toString().equals(".")) || edittext137.getText().toString().equals("-")) || (Double.parseDouble(edittext137.getText().toString()) < 0)) {
						edittext137.setText(String.valueOf(1));
					}
					if (((edittext138.getText().toString().equals("") || edittext138.getText().toString().equals(".")) || edittext138.getText().toString().equals("-")) || (Double.parseDouble(edittext138.getText().toString()) < 0)) {
						edittext138.setText(String.valueOf(1));
					}
					edittext140.setText(String.valueOf(Double.parseDouble(edittext137.getText().toString()) * (Double.parseDouble(edittext138.getText().toString()) * Double.parseDouble(edittext139.getText().toString()))));
					edittext140.setTextColor(0xFF000000);
					if (((edittext141.getText().toString().equals("") || edittext141.getText().toString().equals(".")) || edittext141.getText().toString().equals("-")) || (Double.parseDouble(edittext141.getText().toString()) < 0)) {
						edittext141.setText(String.valueOf(00.00));
					}
					if (((edittext142.getText().toString().equals("") || edittext142.getText().toString().equals(".")) || edittext142.getText().toString().equals("-")) || (Double.parseDouble(edittext142.getText().toString()) < 0)) {
						edittext142.setText(String.valueOf(1));
					}
					if (((edittext143.getText().toString().equals("") || edittext143.getText().toString().equals(".")) || edittext143.getText().toString().equals("-")) || (Double.parseDouble(edittext143.getText().toString()) < 0)) {
						edittext143.setText(String.valueOf(00.00));
					}
					edittext144.setText(String.valueOf(Double.parseDouble(edittext141.getText().toString()) * (Double.parseDouble(edittext142.getText().toString()) * Double.parseDouble(edittext143.getText().toString()))));
					edittext144.setTextColor(0xFF000000);
					if (((edittext146.getText().toString().equals("") || edittext146.getText().toString().equals(".")) || edittext146.getText().toString().equals("-")) || (Double.parseDouble(edittext146.getText().toString()) < 0)) {
						edittext146.setText(String.valueOf(00.00));
					}
					if (((edittext147.getText().toString().equals("") || edittext147.getText().toString().equals(".")) || edittext147.getText().toString().equals("-")) || (Double.parseDouble(edittext147.getText().toString()) < 0)) {
						edittext147.setText(String.valueOf(1));
					}
					if (((edittext148.getText().toString().equals("") || edittext148.getText().toString().equals(".")) || edittext148.getText().toString().equals("-")) || (Double.parseDouble(edittext148.getText().toString()) < 0)) {
						edittext148.setText(String.valueOf(00.00));
					}
					edittext149.setText(String.valueOf(Double.parseDouble(edittext146.getText().toString()) * (Double.parseDouble(edittext147.getText().toString()) * Double.parseDouble(edittext148.getText().toString()))));
					edittext149.setTextColor(0xFF000000);
					edittext150.setText(String.valueOf((Double.parseDouble(edittext113.getText().toString()) + (Double.parseDouble(edittext124.getText().toString()) + Double.parseDouble(edittext128.getText().toString()))) + ((Double.parseDouble(edittext132.getText().toString()) + Double.parseDouble(edittext136.getText().toString())) + ((Double.parseDouble(edittext144.getText().toString()) + Double.parseDouble(edittext149.getText().toString())) + Double.parseDouble(edittext140.getText().toString())))));
					edittext150.setTextColor(0xFFFFFFFF);
					edittext151.setText(String.valueOf(Double.parseDouble(edittext150.getText().toString()) / Double.parseDouble(edittext24.getText().toString())));
					edittext151.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext113.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext113.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext124.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext128.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext132.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext136.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext140.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
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
				edittext150.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 11)});
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
				edittext151.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext211.setText("");
				edittext212.setText("");
				edittext215.setText("");
				edittext216.setText("");
				edittext217.setText("");
				edittext218.setText("");
				edittext219.setText("");
				edittext220.setText("");
				edittext221.setText("");
				edittext222.setText("");
				edittext223.setText("");
				edittext224.setText("");
				edittext225.setText("");
				edittext226.setText("");
				edittext227.setText("");
			}
		});
		
		edittext201.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext201.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				edittext229.setText(String.valueOf(00.00));
				edittext230.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext228.setText(String.valueOf(00.00));
				edittext229.setTextColor(0xFFE91E63);
				edittext230.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
				edittext228.setTextColor(0xFFE91E63);
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
				edittext230.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext230.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setText(String.valueOf(00.00));
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview619.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview619)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* يومية المنشار\n( جنيه / يوم )\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"\nبمعني أنه لم يتم استخدام هذه المعدة بالعمل")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext212.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext212.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext231.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext231.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview618.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview618)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text(" * عدد منشار\nقطع الاسفلت\nالمستخدم\n( منشار )\nوفي حالة عدم استخدام منشار قطع الأسفلت يتم وضع القيمة = ٠\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠ \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext211.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext211.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext231.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext231.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview622.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview622)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالمكنسة\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ \"\nبمعني أنه لم يتم استخدام هذه المعدة بالعمل")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext216.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext216.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext232.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext232.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview621.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview621)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد المكانس\nالمستخدمة\n( مكنسة )\nوفي حالة عدم استخدام المكنسة يتم وضع القيمة = ٠\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ مكنسة \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext215.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext215.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext232.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext232.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview627.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview627)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* يومية\nالجرار أو\nالسيارة\nاللازمة لجر\nالكومبرسور\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ \"\nبمعني أنه لم يتم استخدام هذه المعدة بالعمل")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext218.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext218.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext233.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext233.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview626.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview626)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الجرارات\nأو السيارات\nاللازمة لجر\nالكومبرسور\nوفي حالة عدم استخدام جرار أو سيارة لزوم جر الكومبرسور يتم وضع القيمة = ٠\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ جرار أو سيارة لزوم جر الكومبرسور \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext217.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext217.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext233.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext233.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview640.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview640)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* يومية\nالكومبرسور\n\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ \"\nبمعني أنه لم يتم استخدام هذه المعدة بالعمل")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext220.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext220.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext234.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext234.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview639.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview639)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد\nالكومبرسورات\nالمستخدمة\nوفي حالة عدم استخدام الكومبرسور يتم وضع القيمة = ٠\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ كومبرسور \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext219.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext219.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext234.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext234.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview625.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview625)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالأتينير\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ جنيه \"\nبمعني أنه لم يتم استخدام هذه المعدة بالعمل")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext222.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext222.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext235.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext235.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview624.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview624)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد الأتينير\nالمستخدمة\nوفي حالة عدم استخدام الأتينير يتم وضع القيمة = ٠\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ١ أتينير \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext221.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext221.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext235.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext235.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview631.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview631)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالعامل او الشواكة\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ \"\nبمعني أنه لم يتم استخدام عمالة او شواكة بالعمل وهذا غير واقعي")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext224.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext224.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext237.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext237.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview630.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview630)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد العمالة والشواكة\nالمستخدمة\nوفي حالة عدم الأحتياج لعماله أو شوكه يتم وضع القيمة = ٠ ولكن هذا غير واقعي\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ١ \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext223.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext223.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext237.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext237.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview633.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview633)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالمعدة أو العامل\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ \"\nبمعني أنه لم يتم استخدام هذه المعدة بالعمل")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext227.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext227.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext238.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext238.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview632.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview632)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد المعدات الأخري أو العمالة الأخري\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠ \"")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
			}
		});
		
		edittext226.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext226.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext238.setText(String.valueOf(00.00));
				edittext239.setText(String.valueOf(00.00));
				edittext240.setText(String.valueOf(00.00));
				edittext241.setText(String.valueOf(00.00));
				edittext238.setTextColor(0xFFE91E63);
				edittext239.setTextColor(0xFFE91E63);
				edittext240.setTextColor(0xFFE91E63);
				edittext241.setTextColor(0xFFE91E63);
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
						edittext5.setText(String.valueOf(0.50d));
					}
					if ((edittext211.getText().toString().equals("") || edittext211.getText().toString().equals(".")) || (edittext211.getText().toString().equals("-") || (Double.parseDouble(edittext211.getText().toString()) < 0))) {
						edittext211.setText(String.valueOf(0));
					}
					if ((edittext212.getText().toString().equals("") || edittext212.getText().toString().equals(".")) || (edittext212.getText().toString().equals("-") || (Double.parseDouble(edittext212.getText().toString()) < 0))) {
						edittext212.setText(String.valueOf(0));
					}
					if ((edittext215.getText().toString().equals("") || edittext215.getText().toString().equals(".")) || (edittext215.getText().toString().equals("-") || (Double.parseDouble(edittext215.getText().toString()) < 0))) {
						edittext215.setText(String.valueOf(0));
					}
					if ((edittext216.getText().toString().equals("") || edittext216.getText().toString().equals(".")) || (edittext216.getText().toString().equals("-") || (Double.parseDouble(edittext216.getText().toString()) < 0))) {
						edittext216.setText(String.valueOf(0));
					}
					if ((edittext217.getText().toString().equals("") || edittext217.getText().toString().equals(".")) || (edittext217.getText().toString().equals("-") || (Double.parseDouble(edittext217.getText().toString()) < 0))) {
						edittext217.setText(String.valueOf(0));
					}
					if ((edittext218.getText().toString().equals("") || edittext218.getText().toString().equals(".")) || (edittext218.getText().toString().equals("-") || (Double.parseDouble(edittext218.getText().toString()) < 0))) {
						edittext218.setText(String.valueOf(0));
					}
					if ((edittext219.getText().toString().equals("") || edittext219.getText().toString().equals(".")) || (edittext219.getText().toString().equals("-") || (Double.parseDouble(edittext219.getText().toString()) < 0))) {
						edittext219.setText(String.valueOf(0));
					}
					if ((edittext220.getText().toString().equals("") || edittext220.getText().toString().equals(".")) || (edittext220.getText().toString().equals("-") || (Double.parseDouble(edittext220.getText().toString()) < 0))) {
						edittext220.setText(String.valueOf(0));
					}
					if ((edittext221.getText().toString().equals("") || edittext221.getText().toString().equals(".")) || (edittext221.getText().toString().equals("-") || (Double.parseDouble(edittext221.getText().toString()) < 0))) {
						edittext221.setText(String.valueOf(1));
					}
					if ((edittext222.getText().toString().equals("") || edittext222.getText().toString().equals(".")) || (edittext222.getText().toString().equals("-") || (Double.parseDouble(edittext222.getText().toString()) < 0))) {
						edittext222.setText(String.valueOf(0));
					}
					if ((edittext223.getText().toString().equals("") || edittext223.getText().toString().equals(".")) || (edittext223.getText().toString().equals("-") || (Double.parseDouble(edittext223.getText().toString()) < 0))) {
						edittext223.setText(String.valueOf(1));
					}
					if ((edittext224.getText().toString().equals("") || edittext224.getText().toString().equals(".")) || (edittext224.getText().toString().equals("-") || (Double.parseDouble(edittext224.getText().toString()) < 0))) {
						edittext224.setText(String.valueOf(0));
					}
					if ((edittext226.getText().toString().equals("") || edittext226.getText().toString().equals(".")) || (edittext226.getText().toString().equals("-") || (Double.parseDouble(edittext226.getText().toString()) < 0))) {
						edittext226.setText(String.valueOf(0));
					}
					if ((edittext227.getText().toString().equals("") || edittext227.getText().toString().equals(".")) || (edittext227.getText().toString().equals("-") || (Double.parseDouble(edittext227.getText().toString()) < 0))) {
						edittext227.setText(String.valueOf(0));
					}
					edittext228.setText(String.valueOf(Double.parseDouble(edittext201.getText().toString()) - Double.parseDouble(edittext25.getText().toString())));
					edittext229.setText(String.valueOf(((Double.parseDouble(edittext201.getText().toString()) - Double.parseDouble(edittext25.getText().toString())) / Double.parseDouble(edittext25.getText().toString())) * 100));
					edittext230.setText(String.valueOf(Double.parseDouble(edittext201.getText().toString()) * Double.parseDouble(edittext203.getText().toString())));
					edittext231.setText(String.valueOf(Double.parseDouble(edittext211.getText().toString()) * Double.parseDouble(edittext212.getText().toString())));
					edittext232.setText(String.valueOf(Double.parseDouble(edittext215.getText().toString()) * Double.parseDouble(edittext216.getText().toString())));
					edittext233.setText(String.valueOf(Double.parseDouble(edittext217.getText().toString()) * Double.parseDouble(edittext218.getText().toString())));
					edittext234.setText(String.valueOf(Double.parseDouble(edittext219.getText().toString()) * Double.parseDouble(edittext220.getText().toString())));
					edittext235.setText(String.valueOf(Double.parseDouble(edittext221.getText().toString()) * Double.parseDouble(edittext222.getText().toString())));
					edittext237.setText(String.valueOf(Double.parseDouble(edittext223.getText().toString()) * Double.parseDouble(edittext224.getText().toString())));
					edittext238.setText(String.valueOf(Double.parseDouble(edittext226.getText().toString()) * Double.parseDouble(edittext227.getText().toString())));
					edittext239.setText(String.valueOf((Double.parseDouble(edittext231.getText().toString()) + Double.parseDouble(edittext232.getText().toString())) + (Double.parseDouble(edittext235.getText().toString()) + (Double.parseDouble(edittext237.getText().toString()) + Double.parseDouble(edittext238.getText().toString())))));
					edittext240.setText(String.valueOf(Double.parseDouble(edittext230.getText().toString()) + Double.parseDouble(edittext239.getText().toString())));
					edittext241.setText(String.valueOf(Double.parseDouble(edittext240.getText().toString()) / Double.parseDouble(edittext24.getText().toString())));
					edittext228.setTextColor(0xFF000000);
					edittext229.setTextColor(0xFF000000);
					edittext230.setTextColor(0xFF000000);
					edittext231.setTextColor(0xFF000000);
					edittext232.setTextColor(0xFF000000);
					edittext233.setTextColor(0xFF000000);
					edittext234.setTextColor(0xFF000000);
					edittext235.setTextColor(0xFF000000);
					edittext237.setTextColor(0xFF000000);
					edittext238.setTextColor(0xFF000000);
					edittext239.setTextColor(0xFF000000);
					edittext240.setTextColor(0xFFFFFFFF);
					edittext241.setTextColor(0xFF000000);
				}
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
				edittext229.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview634.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccRcActivity.this, textview634)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة الهالك\nوهي النسبة التي تحدث بسبب النقل والتشغيل وخلافه")
				        .textColor(0xFFFFFFFF)
				        .color(0xFF607D8B)
				        .corner((int) 25)
				        .arrowWidth((int) 25)
				        .arrowHeight((int) 25)
				        .distanceWithView((int) 25)
				        .onDisplay(new ViewTooltip.ListenerDisplay() {
					            @Override
					            public void onDisplay(View view) {
						                 
						            }
					        })
				        .onHide(new ViewTooltip.ListenerHide() {
					            @Override
					            public void onHide(View view) {
						                 
						            }
					        })
				        .show();
				return true;
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
				edittext231.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
		
		edittext237.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext237.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
		
		edittext239.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext239.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext240.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
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
				edittext241.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
		PrintHelper printHelper = new PrintHelper(ToipccRcActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
	
	public void _Rc() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout ll_mainDynamic = (LinearLayout) inflater.inflate(R.layout.toipcc_d_asphalt_layer, null, false);
		dynamic_all.addView(ll_mainDynamic);
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
		final EditText edittext13d = ll_mainDynamic.findViewById(R.id.edittext13d);
		edittext13d.setSingleLine(true);
		edittext13d.setFocusableInTouchMode(true);
		/*
تعريفات ال Button
*/
		final Button button1d = ll_mainDynamic.findViewById(R.id.button1d);
		final ImageView close = ll_mainDynamic.findViewById(R.id.close);
		/*
أولآ : التعليق عند الخطأ
*/
		final TextView textview14d = ll_mainDynamic.findViewById(R.id.textview14d);
		textview14d.setText("من فضلك أعد مراجعة محطة البداية ومحطة النهاية حيث أن محطة البداية بعد محطة النهاية وبذلك طول الطبقة بالسالب أي أقل من الصفر\nوبالتالي ستكون\n- المساحة الأجمالية أو المسطح الأجمالى لطبقة اللصق  R.C = ٠٠.٠٠ م٢\n- كمية طبقة اللصق R.C الإجمالية أو كمية طبقة اللصق R.C الهندسية الأجمالية = ٠٠.٠٠ كجم\n- كمية طبقة اللصق R.C الإجمالية أو كمية طبقة اللصق R.C الهندسية الأجمالية = ٠٠.٠٠ طن");
		textview14d.setVisibility(View.GONE);
		/*
* معدل الرش
( كجم / م٢ )
*/
		final TextView textview10d = ll_mainDynamic.findViewById(R.id.textview10d);
		textview10d.setText("* معدل الرش\n( كجم / م٢ )");
		textview10d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* معدل الرش\n( كجم / م٢ )\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٥ كجم / م٢ \"");
				return true;
			}
		});
		final EditText edittext5d = ll_mainDynamic.findViewById(R.id.edittext5d);
		edittext5d.setSingleLine(true);
		edittext5d.setFocusableInTouchMode(true);
		edittext5d.setHint("0.5");
		final TextView textview11d = ll_mainDynamic.findViewById(R.id.textview11d);
		textview11d.setText("كجم / م٢");
		/*
الأنضغاط
*/
		final LinearLayout linear8d = ll_mainDynamic.findViewById(R.id.linear8d);
		linear8d.setVisibility(View.GONE);
		/*
كمية طبقة اللصق  R.C المطلوبة أو كمية خامة طبقة اللصق  R.C المطلوبة بهذا القطاع ( طن )
*/
		final LinearLayout linear9d = ll_mainDynamic.findViewById(R.id.linear9d);
		linear9d.setVisibility(View.VISIBLE);
		final TextView textview27d = ll_mainDynamic.findViewById(R.id.textview27d);
		textview27d.setText("كمية طبقة اللصق  R.C المطلوبة أو كمية خامة طبقة اللصق  R.C المطلوبة بهذا القطاع ( طن )");
		final TextView textview28d = ll_mainDynamic.findViewById(R.id.textview28d);
		textview28d.setText("طن");
		/*
باقي التعليقات والتعريفات
*/
		final TextView textview15d = ll_mainDynamic.findViewById(R.id.textview15d);
		textview15d.setText("المساحة الأجمالية أو المسطح الأجمالى لطبقة اللصق  R.C ( م٢ )");
		final TextView textview16d = ll_mainDynamic.findViewById(R.id.textview16d);
		textview16d.setText("م٢");
		final TextView textview17d = ll_mainDynamic.findViewById(R.id.textview17d);
		textview17d.setText("كمية طبقة اللصق  R.C المطلوبة أو كمية خامة طبقة اللصق  R.C المطلوبة بهذا القطاع ( كجم )");
		final TextView textview18d = ll_mainDynamic.findViewById(R.id.textview18d);
		textview18d.setText("كجم");
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
				edittext13d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
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
				edittext13d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
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
				edittext13d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
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
				edittext13d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
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
						edittext5d.setText(String.valueOf(0.50d));
					}
					edittext6d.setText(String.valueOf(Double.parseDouble(edittext3d.getText().toString()) - Double.parseDouble(edittext2d.getText().toString())));
					if (Double.parseDouble(edittext6d.getText().toString()) < 0) {
						textview14d.setVisibility(View.VISIBLE);
						edittext7d.setText(String.valueOf(00.00d));
						edittext8d.setText(String.valueOf(00.00d));
						edittext13d.setText(String.valueOf(00.00d));
					}
					else {
						textview14d.setVisibility(View.GONE);
						edittext7d.setText(String.valueOf(Double.parseDouble(edittext6d.getText().toString()) * Double.parseDouble(edittext4d.getText().toString())));
						edittext8d.setText(String.valueOf(Double.parseDouble(edittext7d.getText().toString()) * Double.parseDouble(edittext5d.getText().toString())));
						edittext13d.setText(String.valueOf(Double.parseDouble(edittext7d.getText().toString()) * (Double.parseDouble(edittext5d.getText().toString()) / 1000)));
					}
					edittext6d.setTextColor(0xFF000000);
					edittext7d.setTextColor(0xFF000000);
					edittext8d.setTextColor(0xFF000000);
					edittext13d.setTextColor(0xFF000000);
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
				temp1 = 0;
				for (int i = 0; i < (int)(dynamic_all.getChildCount()); i++) {
					View child=dynamic_all.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext7d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext21.setText(String.valueOf(temp1));
			} });
		edittext8d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
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
				edittext22.setText(String.valueOf(temp3));
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
المجموع الدينامك لكمية الخلطة الأسفلتية طن بعد الحذف
*/
				temp3 = 0;
				for (int i = 0; i < (int)(dynamic_all.getChildCount()); i++) {
					View child=dynamic_all.getChildAt(i); 
					TextView tempo3 =child.findViewById(R.id.edittext13d);
					temp3 = temp3 + Double.parseDouble(tempo3.getText().toString());
				}
				edittext22.setText(String.valueOf(temp3));
			}
		});
	}
	
}
