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
import java.util.ArrayList;
import java.util.regex.*;
import org.json.*;
import androidx.print.PrintHelper;


public class ToipccExcavationForRoadssActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private double stripes_type1 = 0;
	private double temp1 = 0;
	private String tot = "";
	private double temp = 0;
	private boolean dwn = false;
	private double ld_mnn = 0;
	private double mn_st_sum = 0;
	private double store = 0;
	private double total = 0;
	private double mn_st_no = 0;
	private double col_no_ = 0;
	
	private ArrayList<String> diameter = new ArrayList<>();
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview1;
	private LinearLayout linear176;
	private LinearLayout linear205;
	private LinearLayout dynamic_pipe_line;
	private LinearLayout add_dynamic_element_lin;
	private HorizontalScrollView hscroll70;
	private LinearLayout linear152;
	private LinearLayout linear888;
	private HorizontalScrollView hscroll79;
	private LinearLayout linear1048;
	private TextView textview559;
	private LinearLayout linear583;
	private Button button4;
	private LinearLayout linear69;
	private HorizontalScrollView hscroll116;
	private LinearLayout linear190;
	private HorizontalScrollView hscroll114;
	private LinearLayout linear179;
	private HorizontalScrollView hscroll115;
	private LinearLayout linear870;
	private HorizontalScrollView hscroll125;
	private LinearLayout linear193;
	private TextView textview810;
	private TextView textview811;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear289;
	private TextView textview555;
	private TextView textview583;
	private EditText edittext1299;
	private TextView textview579;
	private EditText edittext1255;
	private TextView textview580;
	private Button button1;
	private TextView textview809;
	private LinearLayout linear389;
	private LinearLayout linear575;
	private LinearLayout linear195;
	private HorizontalScrollView hscroll80;
	private LinearLayout linear127;
	private LinearLayout linear202;
	private LinearLayout linear120;
	private LinearLayout linear201;
	private LinearLayout linear198;
	private HorizontalScrollView hscroll137;
	private LinearLayout linear126;
	private HorizontalScrollView hscroll10;
	private LinearLayout linear144;
	private TextView textview341;
	private LinearLayout linear125;
	private LinearLayout linear254;
	private HorizontalScrollView hscroll138;
	private LinearLayout linear1047;
	private TextView textview55;
	private HorizontalScrollView hscroll9;
	private LinearLayout linear1040;
	private HorizontalScrollView hscroll126;
	private LinearLayout linear157;
	private LinearLayout linear119;
	private LinearLayout linear199;
	private LinearLayout linear43;
	private LinearLayout linear74;
	private TextView textview180;
	private TextView textview2;
	private EditText element_nums;
	private TextView textview160;
	private EditText element_num;
	private TextView textview1425;
	private EditText edittext1;
	private TextView textview603;
	private TextView textview604;
	private EditText edittext3;
	private TextView textview354;
	private TextView textview1421;
	private EditText edittext15;
	private TextView textview1422;
	private TextView textview1423;
	private TextView textview64;
	private EditText edittext5;
	private TextView textview898;
	private TextView textview63;
	private TextView textview58;
	private EditText edittext6;
	private TextView textview353;
	private TextView textview57;
	private TextView textview60;
	private EditText edittext4;
	private TextView textview602;
	private TextView textview59;
	private LinearLayout linear721;
	private LinearLayout linear723;
	private LinearLayout linear722;
	private TextView textview135;
	private EditText edittext8;
	private TextView textview601;
	private TextView textview592;
	private TextView textview136;
	private EditText edittext7;
	private Button button2;
	private TextView textview62;
	private EditText edittext199;
	private TextView textview2350;
	private TextView textview61;
	private TextView textview2341;
	private EditText edittext9;
	private TextView textview2342;
	private TextView textview2343;
	private TextView textview68;
	private EditText edittext10;
	private TextView textview43;
	private TextView textview40;
	private TextView textview531;
	private EditText edittext11;
	private TextView textview532;
	private TextView textview533;
	private TextView textview467;
	private EditText edittext12;
	private TextView textview286;
	private TextView textview112;
	private TextView textview704;
	private Button add_dynamic_pipe_line;
	private TextView textview2338;
	private EditText edittext14;
	private TextView textview2339;
	private TextView textview2340;
	private TextView textview1400;
	private EditText edittext16;
	private TextView textview1380;
	private TextView textview1381;
	private TextView textview2351;
	private LinearLayout linear1041;
	private HorizontalScrollView hscroll127;
	private LinearLayout linear755;
	private TextView textview2344;
	private EditText edittext17;
	private TextView textview2345;
	private TextView textview2346;
	private TextView textview1416;
	private TextView textview1417;
	private LinearLayout linear757;
	private TextView textview1420;
	private EditText edittext18;
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
	private LinearLayout linear897;
	private HorizontalScrollView hscroll106;
	private TextView textview181;
	private HorizontalScrollView hscroll63;
	private LinearLayout linear183;
	private HorizontalScrollView hscroll75;
	private LinearLayout linear578;
	private ImageView close;
	private LinearLayout linear898;
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
	private HorizontalScrollView hscroll91;
	private TextView textview403;
	private TextView textview404;
	private TextView textview405;
	private LinearLayout linear522;
	private TextView textview1173;
	private TextView textview429;
	private LinearLayout linear892;
	private TextView textview1188;
	private TextView textview413;
	private LinearLayout linear535;
	private TextView textview1196;
	private TextView textview417;
	private LinearLayout linear547;
	private TextView textview1181;
	private TextView textview409;
	private LinearLayout linear1034;
	private TextView textview2101;
	private TextView textview421;
	private LinearLayout linear539;
	private TextView textview1180;
	private TextView textview425;
	private LinearLayout linear543;
	private TextView textview2108;
	private TextView textview437;
	private LinearLayout linear900;
	private TextView textview2120;
	private EditText edittext157;
	private LinearLayout linear904;
	private TextView textview2131;
	private LinearLayout linear871;
	private HorizontalScrollView hscroll87;
	private LinearLayout linear182;
	private LinearLayout linear914;
	private LinearLayout linear872;
	private HorizontalScrollView hscroll93;
	private LinearLayout linear910;
	private LinearLayout linear1037;
	private LinearLayout linear911;
	private HorizontalScrollView hscroll98;
	private LinearLayout linear873;
	private LinearLayout linear917;
	private LinearLayout linear874;
	private HorizontalScrollView hscroll94;
	private LinearLayout linear875;
	private LinearLayout linear920;
	private LinearLayout linear876;
	private HorizontalScrollView hscroll95;
	private LinearLayout linear1035;
	private LinearLayout linear915;
	private LinearLayout linear1036;
	private HorizontalScrollView hscroll96;
	private LinearLayout linear555;
	private HorizontalScrollView hscroll97;
	private LinearLayout linear556;
	private LinearLayout linear921;
	private LinearLayout linear557;
	private HorizontalScrollView hscroll99;
	private LinearLayout linear912;
	private HorizontalScrollView hscroll100;
	private LinearLayout linear913;
	private TextView textview2056;
	private LinearLayout linear885;
	private HorizontalScrollView hscroll90;
	private LinearLayout linear886;
	private ImageView imageview2;
	private LinearLayout linear968;
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
	private LinearLayout linear893;
	private TextView textview2109;
	private LinearLayout linear894;
	private TextView textview2110;
	private LinearLayout linear895;
	private TextView textview432;
	private EditText edittext121;
	private TextView textview431;
	private EditText edittext120;
	private TextView textview430;
	private EditText edittext119;
	private LinearLayout linear536;
	private TextView textview1175;
	private LinearLayout linear537;
	private TextView textview1176;
	private LinearLayout linear538;
	private TextView textview416;
	private EditText edittext127;
	private TextView textview415;
	private EditText edittext126;
	private TextView textview414;
	private EditText edittext125;
	private LinearLayout linear548;
	private TextView textview1198;
	private LinearLayout linear549;
	private TextView textview1199;
	private LinearLayout linear550;
	private TextView textview420;
	private EditText edittext133;
	private TextView textview419;
	private EditText edittext132;
	private TextView textview418;
	private EditText edittext131;
	private LinearLayout linear1038;
	private TextView textview2102;
	private LinearLayout linear890;
	private TextView textview2103;
	private LinearLayout linear1039;
	private TextView textview412;
	private EditText edittext139;
	private TextView textview411;
	private EditText edittext138;
	private TextView textview410;
	private EditText edittext137;
	private LinearLayout linear540;
	private TextView textview1182;
	private LinearLayout linear541;
	private TextView textview1183;
	private LinearLayout linear542;
	private TextView textview424;
	private EditText edittext145;
	private TextView textview423;
	private EditText edittext144;
	private TextView textview422;
	private EditText edittext143;
	private LinearLayout linear544;
	private TextView textview1191;
	private LinearLayout linear545;
	private TextView textview1192;
	private LinearLayout linear546;
	private TextView textview428;
	private EditText edittext149;
	private TextView textview427;
	private EditText edittext148;
	private TextView textview426;
	private EditText edittext147;
	private LinearLayout linear901;
	private TextView textview2121;
	private LinearLayout linear902;
	private TextView textview2122;
	private LinearLayout linear903;
	private TextView textview440;
	private EditText edittext155;
	private TextView textview439;
	private EditText edittext154;
	private TextView textview438;
	private EditText edittext153;
	private LinearLayout linear905;
	private TextView textview2126;
	private LinearLayout linear906;
	private TextView textview2127;
	private LinearLayout linear907;
	private TextView textview443;
	private EditText edittext160;
	private TextView textview442;
	private EditText edittext159;
	private TextView textview441;
	private EditText edittext158;
	private Button button11;
	private TextView textview514;
	private EditText edittext116;
	private TextView textview268;
	private TextView textview445;
	private TextView textview2150;
	private EditText edittext117;
	private TextView textview2151;
	private TextView textview446;
	private TextView textview2057;
	private EditText edittext118;
	private TextView textview2058;
	private TextView textview447;
	private TextView textview2138;
	private EditText edittext122;
	private TextView textview2139;
	private TextView textview461;
	private TextView textview2334;
	private EditText edittext123;
	private TextView textview2335;
	private TextView textview2336;
	private TextView textview2141;
	private EditText edittext124;
	private TextView textview2142;
	private TextView textview463;
	private TextView textview2060;
	private EditText edittext128;
	private TextView textview2061;
	private TextView textview451;
	private TextView textview2159;
	private EditText edittext129;
	private TextView textview2160;
	private TextView textview452;
	private TextView textview2063;
	private EditText edittext130;
	private TextView textview2064;
	private TextView textview453;
	private TextView textview2066;
	private EditText edittext134;
	private TextView textview2067;
	private TextView textview454;
	private TextView textview2168;
	private EditText edittext135;
	private TextView textview2169;
	private TextView textview455;
	private TextView textview2069;
	private EditText edittext136;
	private TextView textview2070;
	private TextView textview456;
	private TextView textview2132;
	private EditText edittext140;
	private TextView textview2133;
	private TextView textview448;
	private TextView textview2153;
	private EditText edittext141;
	private TextView textview2154;
	private TextView textview449;
	private TextView textview2135;
	private EditText edittext142;
	private TextView textview2136;
	private TextView textview450;
	private TextView textview1211;
	private EditText edittext146;
	private TextView textview1209;
	private TextView textview457;
	private TextView textview367;
	private EditText edittext150;
	private TextView textview1212;
	private TextView textview458;
	private TextView textview2171;
	private EditText edittext151;
	private TextView textview2172;
	private TextView textview459;
	private TextView textview1214;
	private EditText edittext152;
	private TextView textview1215;
	private TextView textview460;
	private TextView textview2144;
	private EditText edittext156;
	private TextView textview2145;
	private TextView textview465;
	private TextView textview2147;
	private EditText edittext161;
	private TextView textview2148;
	private TextView textview466;
	private TextView textview2337;
	private TextView textview2095;
	private LinearLayout linear887;
	private TextView textview2096;
	private EditText edittext162;
	private TextView textview2097;
	private EditText edittext163;
	private TextView textview2098;
	private TextView textview468;
	private LinearLayout linear973;
	private HorizontalScrollView hscroll109;
	private TextView textview600;
	private HorizontalScrollView hscroll78;
	private TextView textview2347;
	private TextView textview605;
	private LinearLayout linear1043;
	private TextView textview519;
	private TextView textview608;
	private LinearLayout linear935;
	private TextView textview2181;
	private TextView textview611;
	private LinearLayout linear929;
	private TextView textview2189;
	private TextView textview2348;
	private LinearLayout linear1024;
	private TextView textview2194;
	private TextView textview623;
	private LinearLayout linear923;
	private TextView textview2199;
	private TextView textview617;
	private LinearLayout linear219;
	private TextView textview667;
	private TextView textview620;
	private LinearLayout linear223;
	private TextView textview680;
	private TextView textview629;
	private LinearLayout linear941;
	private TextView textview2209;
	private EditText edittext221;
	private LinearLayout linear227;
	private TextView textview682;
	private LinearLayout linear197;
	private HorizontalScrollView hscroll104;
	private LinearLayout linear955;
	private HorizontalScrollView hscroll128;
	private LinearLayout linear958;
	private HorizontalScrollView hscroll129;
	private LinearLayout linear1045;
	private HorizontalScrollView hscroll130;
	private LinearLayout linear964;
	private LinearLayout linear196;
	private LinearLayout linear1044;
	private HorizontalScrollView hscroll132;
	private LinearLayout linear956;
	private HorizontalScrollView hscroll131;
	private LinearLayout linear232;
	private HorizontalScrollView hscroll134;
	private LinearLayout linear957;
	private HorizontalScrollView hscroll133;
	private LinearLayout linear233;
	private HorizontalScrollView hscroll136;
	private LinearLayout linear960;
	private TextView textview681;
	private LinearLayout linear961;
	private HorizontalScrollView hscroll105;
	private LinearLayout linear962;
	private ImageView imageview5;
	private LinearLayout linear974;
	private LinearLayout linear218;
	private TextView textview679;
	private LinearLayout linear203;
	private TextView textview607;
	private EditText edittext205;
	private TextView textview606;
	private EditText edittext204;
	private LinearLayout linear936;
	private TextView textview2196;
	private LinearLayout linear937;
	private TextView textview625;
	private EditText edittext216;
	private TextView textview624;
	private EditText edittext215;
	private LinearLayout linear930;
	private TextView textview2186;
	private LinearLayout linear931;
	private TextView textview614;
	private EditText edittext209;
	private TextView textview613;
	private EditText edittext208;
	private LinearLayout linear1025;
	private TextView textview2320;
	private LinearLayout linear1026;
	private TextView textview616;
	private EditText edittext203;
	private TextView textview615;
	private EditText edittext202;
	private LinearLayout linear924;
	private TextView textview2178;
	private LinearLayout linear925;
	private TextView textview610;
	private EditText edittext207;
	private TextView textview609;
	private EditText edittext206;
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
	private TextView textview639;
	private EditText edittext226;
	private TextView textview2227;
	private TextView textview638;
	private TextView textview651;
	private EditText edittext232;
	private TextView textview2236;
	private TextView textview650;
	private TextView textview643;
	private EditText edittext228;
	private TextView textview663;
	private TextView textview642;
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
	private TextView textview641;
	private EditText edittext227;
	private TextView textview2230;
	private TextView textview640;
	private TextView textview647;
	private EditText edittext230;
	private TextView textview687;
	private TextView textview646;
	private TextView textview649;
	private EditText edittext231;
	private TextView textview2233;
	private TextView textview648;
	private TextView textview655;
	private EditText edittext234;
	private TextView textview689;
	private TextView textview654;
	private TextView textview657;
	private EditText edittext235;
	private TextView textview2242;
	private TextView textview656;
	private TextView textview660;
	private TextView textview535;
	private LinearLayout linear1046;
	private TextView textview678;
	private EditText edittext237;
	private TextView textview2243;
	private EditText edittext238;
	private TextView textview2244;
	private TextView textview2245;
	
	private Intent price = new Intent();
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_excavation_for_roadss);
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
		textview1 = findViewById(R.id.textview1);
		linear176 = findViewById(R.id.linear176);
		linear205 = findViewById(R.id.linear205);
		dynamic_pipe_line = findViewById(R.id.dynamic_pipe_line);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		hscroll70 = findViewById(R.id.hscroll70);
		linear152 = findViewById(R.id.linear152);
		linear888 = findViewById(R.id.linear888);
		hscroll79 = findViewById(R.id.hscroll79);
		linear1048 = findViewById(R.id.linear1048);
		textview559 = findViewById(R.id.textview559);
		linear583 = findViewById(R.id.linear583);
		button4 = findViewById(R.id.button4);
		linear69 = findViewById(R.id.linear69);
		hscroll116 = findViewById(R.id.hscroll116);
		linear190 = findViewById(R.id.linear190);
		hscroll114 = findViewById(R.id.hscroll114);
		linear179 = findViewById(R.id.linear179);
		hscroll115 = findViewById(R.id.hscroll115);
		linear870 = findViewById(R.id.linear870);
		hscroll125 = findViewById(R.id.hscroll125);
		linear193 = findViewById(R.id.linear193);
		textview810 = findViewById(R.id.textview810);
		textview811 = findViewById(R.id.textview811);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		textview583 = findViewById(R.id.textview583);
		edittext1299 = findViewById(R.id.edittext1299);
		textview579 = findViewById(R.id.textview579);
		edittext1255 = findViewById(R.id.edittext1255);
		textview580 = findViewById(R.id.textview580);
		button1 = findViewById(R.id.button1);
		textview809 = findViewById(R.id.textview809);
		linear389 = findViewById(R.id.linear389);
		linear575 = findViewById(R.id.linear575);
		linear195 = findViewById(R.id.linear195);
		hscroll80 = findViewById(R.id.hscroll80);
		linear127 = findViewById(R.id.linear127);
		linear202 = findViewById(R.id.linear202);
		linear120 = findViewById(R.id.linear120);
		linear201 = findViewById(R.id.linear201);
		linear198 = findViewById(R.id.linear198);
		hscroll137 = findViewById(R.id.hscroll137);
		linear126 = findViewById(R.id.linear126);
		hscroll10 = findViewById(R.id.hscroll10);
		linear144 = findViewById(R.id.linear144);
		textview341 = findViewById(R.id.textview341);
		linear125 = findViewById(R.id.linear125);
		linear254 = findViewById(R.id.linear254);
		hscroll138 = findViewById(R.id.hscroll138);
		linear1047 = findViewById(R.id.linear1047);
		textview55 = findViewById(R.id.textview55);
		hscroll9 = findViewById(R.id.hscroll9);
		linear1040 = findViewById(R.id.linear1040);
		hscroll126 = findViewById(R.id.hscroll126);
		linear157 = findViewById(R.id.linear157);
		linear119 = findViewById(R.id.linear119);
		linear199 = findViewById(R.id.linear199);
		linear43 = findViewById(R.id.linear43);
		linear74 = findViewById(R.id.linear74);
		textview180 = findViewById(R.id.textview180);
		textview2 = findViewById(R.id.textview2);
		element_nums = findViewById(R.id.element_nums);
		textview160 = findViewById(R.id.textview160);
		element_num = findViewById(R.id.element_num);
		textview1425 = findViewById(R.id.textview1425);
		edittext1 = findViewById(R.id.edittext1);
		textview603 = findViewById(R.id.textview603);
		textview604 = findViewById(R.id.textview604);
		edittext3 = findViewById(R.id.edittext3);
		textview354 = findViewById(R.id.textview354);
		textview1421 = findViewById(R.id.textview1421);
		edittext15 = findViewById(R.id.edittext15);
		textview1422 = findViewById(R.id.textview1422);
		textview1423 = findViewById(R.id.textview1423);
		textview64 = findViewById(R.id.textview64);
		edittext5 = findViewById(R.id.edittext5);
		textview898 = findViewById(R.id.textview898);
		textview63 = findViewById(R.id.textview63);
		textview58 = findViewById(R.id.textview58);
		edittext6 = findViewById(R.id.edittext6);
		textview353 = findViewById(R.id.textview353);
		textview57 = findViewById(R.id.textview57);
		textview60 = findViewById(R.id.textview60);
		edittext4 = findViewById(R.id.edittext4);
		textview602 = findViewById(R.id.textview602);
		textview59 = findViewById(R.id.textview59);
		linear721 = findViewById(R.id.linear721);
		linear723 = findViewById(R.id.linear723);
		linear722 = findViewById(R.id.linear722);
		textview135 = findViewById(R.id.textview135);
		edittext8 = findViewById(R.id.edittext8);
		textview601 = findViewById(R.id.textview601);
		textview592 = findViewById(R.id.textview592);
		textview136 = findViewById(R.id.textview136);
		edittext7 = findViewById(R.id.edittext7);
		button2 = findViewById(R.id.button2);
		textview62 = findViewById(R.id.textview62);
		edittext199 = findViewById(R.id.edittext199);
		textview2350 = findViewById(R.id.textview2350);
		textview61 = findViewById(R.id.textview61);
		textview2341 = findViewById(R.id.textview2341);
		edittext9 = findViewById(R.id.edittext9);
		textview2342 = findViewById(R.id.textview2342);
		textview2343 = findViewById(R.id.textview2343);
		textview68 = findViewById(R.id.textview68);
		edittext10 = findViewById(R.id.edittext10);
		textview43 = findViewById(R.id.textview43);
		textview40 = findViewById(R.id.textview40);
		textview531 = findViewById(R.id.textview531);
		edittext11 = findViewById(R.id.edittext11);
		textview532 = findViewById(R.id.textview532);
		textview533 = findViewById(R.id.textview533);
		textview467 = findViewById(R.id.textview467);
		edittext12 = findViewById(R.id.edittext12);
		textview286 = findViewById(R.id.textview286);
		textview112 = findViewById(R.id.textview112);
		textview704 = findViewById(R.id.textview704);
		add_dynamic_pipe_line = findViewById(R.id.add_dynamic_pipe_line);
		textview2338 = findViewById(R.id.textview2338);
		edittext14 = findViewById(R.id.edittext14);
		textview2339 = findViewById(R.id.textview2339);
		textview2340 = findViewById(R.id.textview2340);
		textview1400 = findViewById(R.id.textview1400);
		edittext16 = findViewById(R.id.edittext16);
		textview1380 = findViewById(R.id.textview1380);
		textview1381 = findViewById(R.id.textview1381);
		textview2351 = findViewById(R.id.textview2351);
		linear1041 = findViewById(R.id.linear1041);
		hscroll127 = findViewById(R.id.hscroll127);
		linear755 = findViewById(R.id.linear755);
		textview2344 = findViewById(R.id.textview2344);
		edittext17 = findViewById(R.id.edittext17);
		textview2345 = findViewById(R.id.textview2345);
		textview2346 = findViewById(R.id.textview2346);
		textview1416 = findViewById(R.id.textview1416);
		textview1417 = findViewById(R.id.textview1417);
		linear757 = findViewById(R.id.linear757);
		textview1420 = findViewById(R.id.textview1420);
		edittext18 = findViewById(R.id.edittext18);
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
		linear897 = findViewById(R.id.linear897);
		hscroll106 = findViewById(R.id.hscroll106);
		textview181 = findViewById(R.id.textview181);
		hscroll63 = findViewById(R.id.hscroll63);
		linear183 = findViewById(R.id.linear183);
		hscroll75 = findViewById(R.id.hscroll75);
		linear578 = findViewById(R.id.linear578);
		close = findViewById(R.id.close);
		linear898 = findViewById(R.id.linear898);
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
		hscroll91 = findViewById(R.id.hscroll91);
		textview403 = findViewById(R.id.textview403);
		textview404 = findViewById(R.id.textview404);
		textview405 = findViewById(R.id.textview405);
		linear522 = findViewById(R.id.linear522);
		textview1173 = findViewById(R.id.textview1173);
		textview429 = findViewById(R.id.textview429);
		linear892 = findViewById(R.id.linear892);
		textview1188 = findViewById(R.id.textview1188);
		textview413 = findViewById(R.id.textview413);
		linear535 = findViewById(R.id.linear535);
		textview1196 = findViewById(R.id.textview1196);
		textview417 = findViewById(R.id.textview417);
		linear547 = findViewById(R.id.linear547);
		textview1181 = findViewById(R.id.textview1181);
		textview409 = findViewById(R.id.textview409);
		linear1034 = findViewById(R.id.linear1034);
		textview2101 = findViewById(R.id.textview2101);
		textview421 = findViewById(R.id.textview421);
		linear539 = findViewById(R.id.linear539);
		textview1180 = findViewById(R.id.textview1180);
		textview425 = findViewById(R.id.textview425);
		linear543 = findViewById(R.id.linear543);
		textview2108 = findViewById(R.id.textview2108);
		textview437 = findViewById(R.id.textview437);
		linear900 = findViewById(R.id.linear900);
		textview2120 = findViewById(R.id.textview2120);
		edittext157 = findViewById(R.id.edittext157);
		linear904 = findViewById(R.id.linear904);
		textview2131 = findViewById(R.id.textview2131);
		linear871 = findViewById(R.id.linear871);
		hscroll87 = findViewById(R.id.hscroll87);
		linear182 = findViewById(R.id.linear182);
		linear914 = findViewById(R.id.linear914);
		linear872 = findViewById(R.id.linear872);
		hscroll93 = findViewById(R.id.hscroll93);
		linear910 = findViewById(R.id.linear910);
		linear1037 = findViewById(R.id.linear1037);
		linear911 = findViewById(R.id.linear911);
		hscroll98 = findViewById(R.id.hscroll98);
		linear873 = findViewById(R.id.linear873);
		linear917 = findViewById(R.id.linear917);
		linear874 = findViewById(R.id.linear874);
		hscroll94 = findViewById(R.id.hscroll94);
		linear875 = findViewById(R.id.linear875);
		linear920 = findViewById(R.id.linear920);
		linear876 = findViewById(R.id.linear876);
		hscroll95 = findViewById(R.id.hscroll95);
		linear1035 = findViewById(R.id.linear1035);
		linear915 = findViewById(R.id.linear915);
		linear1036 = findViewById(R.id.linear1036);
		hscroll96 = findViewById(R.id.hscroll96);
		linear555 = findViewById(R.id.linear555);
		hscroll97 = findViewById(R.id.hscroll97);
		linear556 = findViewById(R.id.linear556);
		linear921 = findViewById(R.id.linear921);
		linear557 = findViewById(R.id.linear557);
		hscroll99 = findViewById(R.id.hscroll99);
		linear912 = findViewById(R.id.linear912);
		hscroll100 = findViewById(R.id.hscroll100);
		linear913 = findViewById(R.id.linear913);
		textview2056 = findViewById(R.id.textview2056);
		linear885 = findViewById(R.id.linear885);
		hscroll90 = findViewById(R.id.hscroll90);
		linear886 = findViewById(R.id.linear886);
		imageview2 = findViewById(R.id.imageview2);
		linear968 = findViewById(R.id.linear968);
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
		linear893 = findViewById(R.id.linear893);
		textview2109 = findViewById(R.id.textview2109);
		linear894 = findViewById(R.id.linear894);
		textview2110 = findViewById(R.id.textview2110);
		linear895 = findViewById(R.id.linear895);
		textview432 = findViewById(R.id.textview432);
		edittext121 = findViewById(R.id.edittext121);
		textview431 = findViewById(R.id.textview431);
		edittext120 = findViewById(R.id.edittext120);
		textview430 = findViewById(R.id.textview430);
		edittext119 = findViewById(R.id.edittext119);
		linear536 = findViewById(R.id.linear536);
		textview1175 = findViewById(R.id.textview1175);
		linear537 = findViewById(R.id.linear537);
		textview1176 = findViewById(R.id.textview1176);
		linear538 = findViewById(R.id.linear538);
		textview416 = findViewById(R.id.textview416);
		edittext127 = findViewById(R.id.edittext127);
		textview415 = findViewById(R.id.textview415);
		edittext126 = findViewById(R.id.edittext126);
		textview414 = findViewById(R.id.textview414);
		edittext125 = findViewById(R.id.edittext125);
		linear548 = findViewById(R.id.linear548);
		textview1198 = findViewById(R.id.textview1198);
		linear549 = findViewById(R.id.linear549);
		textview1199 = findViewById(R.id.textview1199);
		linear550 = findViewById(R.id.linear550);
		textview420 = findViewById(R.id.textview420);
		edittext133 = findViewById(R.id.edittext133);
		textview419 = findViewById(R.id.textview419);
		edittext132 = findViewById(R.id.edittext132);
		textview418 = findViewById(R.id.textview418);
		edittext131 = findViewById(R.id.edittext131);
		linear1038 = findViewById(R.id.linear1038);
		textview2102 = findViewById(R.id.textview2102);
		linear890 = findViewById(R.id.linear890);
		textview2103 = findViewById(R.id.textview2103);
		linear1039 = findViewById(R.id.linear1039);
		textview412 = findViewById(R.id.textview412);
		edittext139 = findViewById(R.id.edittext139);
		textview411 = findViewById(R.id.textview411);
		edittext138 = findViewById(R.id.edittext138);
		textview410 = findViewById(R.id.textview410);
		edittext137 = findViewById(R.id.edittext137);
		linear540 = findViewById(R.id.linear540);
		textview1182 = findViewById(R.id.textview1182);
		linear541 = findViewById(R.id.linear541);
		textview1183 = findViewById(R.id.textview1183);
		linear542 = findViewById(R.id.linear542);
		textview424 = findViewById(R.id.textview424);
		edittext145 = findViewById(R.id.edittext145);
		textview423 = findViewById(R.id.textview423);
		edittext144 = findViewById(R.id.edittext144);
		textview422 = findViewById(R.id.textview422);
		edittext143 = findViewById(R.id.edittext143);
		linear544 = findViewById(R.id.linear544);
		textview1191 = findViewById(R.id.textview1191);
		linear545 = findViewById(R.id.linear545);
		textview1192 = findViewById(R.id.textview1192);
		linear546 = findViewById(R.id.linear546);
		textview428 = findViewById(R.id.textview428);
		edittext149 = findViewById(R.id.edittext149);
		textview427 = findViewById(R.id.textview427);
		edittext148 = findViewById(R.id.edittext148);
		textview426 = findViewById(R.id.textview426);
		edittext147 = findViewById(R.id.edittext147);
		linear901 = findViewById(R.id.linear901);
		textview2121 = findViewById(R.id.textview2121);
		linear902 = findViewById(R.id.linear902);
		textview2122 = findViewById(R.id.textview2122);
		linear903 = findViewById(R.id.linear903);
		textview440 = findViewById(R.id.textview440);
		edittext155 = findViewById(R.id.edittext155);
		textview439 = findViewById(R.id.textview439);
		edittext154 = findViewById(R.id.edittext154);
		textview438 = findViewById(R.id.textview438);
		edittext153 = findViewById(R.id.edittext153);
		linear905 = findViewById(R.id.linear905);
		textview2126 = findViewById(R.id.textview2126);
		linear906 = findViewById(R.id.linear906);
		textview2127 = findViewById(R.id.textview2127);
		linear907 = findViewById(R.id.linear907);
		textview443 = findViewById(R.id.textview443);
		edittext160 = findViewById(R.id.edittext160);
		textview442 = findViewById(R.id.textview442);
		edittext159 = findViewById(R.id.edittext159);
		textview441 = findViewById(R.id.textview441);
		edittext158 = findViewById(R.id.edittext158);
		button11 = findViewById(R.id.button11);
		textview514 = findViewById(R.id.textview514);
		edittext116 = findViewById(R.id.edittext116);
		textview268 = findViewById(R.id.textview268);
		textview445 = findViewById(R.id.textview445);
		textview2150 = findViewById(R.id.textview2150);
		edittext117 = findViewById(R.id.edittext117);
		textview2151 = findViewById(R.id.textview2151);
		textview446 = findViewById(R.id.textview446);
		textview2057 = findViewById(R.id.textview2057);
		edittext118 = findViewById(R.id.edittext118);
		textview2058 = findViewById(R.id.textview2058);
		textview447 = findViewById(R.id.textview447);
		textview2138 = findViewById(R.id.textview2138);
		edittext122 = findViewById(R.id.edittext122);
		textview2139 = findViewById(R.id.textview2139);
		textview461 = findViewById(R.id.textview461);
		textview2334 = findViewById(R.id.textview2334);
		edittext123 = findViewById(R.id.edittext123);
		textview2335 = findViewById(R.id.textview2335);
		textview2336 = findViewById(R.id.textview2336);
		textview2141 = findViewById(R.id.textview2141);
		edittext124 = findViewById(R.id.edittext124);
		textview2142 = findViewById(R.id.textview2142);
		textview463 = findViewById(R.id.textview463);
		textview2060 = findViewById(R.id.textview2060);
		edittext128 = findViewById(R.id.edittext128);
		textview2061 = findViewById(R.id.textview2061);
		textview451 = findViewById(R.id.textview451);
		textview2159 = findViewById(R.id.textview2159);
		edittext129 = findViewById(R.id.edittext129);
		textview2160 = findViewById(R.id.textview2160);
		textview452 = findViewById(R.id.textview452);
		textview2063 = findViewById(R.id.textview2063);
		edittext130 = findViewById(R.id.edittext130);
		textview2064 = findViewById(R.id.textview2064);
		textview453 = findViewById(R.id.textview453);
		textview2066 = findViewById(R.id.textview2066);
		edittext134 = findViewById(R.id.edittext134);
		textview2067 = findViewById(R.id.textview2067);
		textview454 = findViewById(R.id.textview454);
		textview2168 = findViewById(R.id.textview2168);
		edittext135 = findViewById(R.id.edittext135);
		textview2169 = findViewById(R.id.textview2169);
		textview455 = findViewById(R.id.textview455);
		textview2069 = findViewById(R.id.textview2069);
		edittext136 = findViewById(R.id.edittext136);
		textview2070 = findViewById(R.id.textview2070);
		textview456 = findViewById(R.id.textview456);
		textview2132 = findViewById(R.id.textview2132);
		edittext140 = findViewById(R.id.edittext140);
		textview2133 = findViewById(R.id.textview2133);
		textview448 = findViewById(R.id.textview448);
		textview2153 = findViewById(R.id.textview2153);
		edittext141 = findViewById(R.id.edittext141);
		textview2154 = findViewById(R.id.textview2154);
		textview449 = findViewById(R.id.textview449);
		textview2135 = findViewById(R.id.textview2135);
		edittext142 = findViewById(R.id.edittext142);
		textview2136 = findViewById(R.id.textview2136);
		textview450 = findViewById(R.id.textview450);
		textview1211 = findViewById(R.id.textview1211);
		edittext146 = findViewById(R.id.edittext146);
		textview1209 = findViewById(R.id.textview1209);
		textview457 = findViewById(R.id.textview457);
		textview367 = findViewById(R.id.textview367);
		edittext150 = findViewById(R.id.edittext150);
		textview1212 = findViewById(R.id.textview1212);
		textview458 = findViewById(R.id.textview458);
		textview2171 = findViewById(R.id.textview2171);
		edittext151 = findViewById(R.id.edittext151);
		textview2172 = findViewById(R.id.textview2172);
		textview459 = findViewById(R.id.textview459);
		textview1214 = findViewById(R.id.textview1214);
		edittext152 = findViewById(R.id.edittext152);
		textview1215 = findViewById(R.id.textview1215);
		textview460 = findViewById(R.id.textview460);
		textview2144 = findViewById(R.id.textview2144);
		edittext156 = findViewById(R.id.edittext156);
		textview2145 = findViewById(R.id.textview2145);
		textview465 = findViewById(R.id.textview465);
		textview2147 = findViewById(R.id.textview2147);
		edittext161 = findViewById(R.id.edittext161);
		textview2148 = findViewById(R.id.textview2148);
		textview466 = findViewById(R.id.textview466);
		textview2337 = findViewById(R.id.textview2337);
		textview2095 = findViewById(R.id.textview2095);
		linear887 = findViewById(R.id.linear887);
		textview2096 = findViewById(R.id.textview2096);
		edittext162 = findViewById(R.id.edittext162);
		textview2097 = findViewById(R.id.textview2097);
		edittext163 = findViewById(R.id.edittext163);
		textview2098 = findViewById(R.id.textview2098);
		textview468 = findViewById(R.id.textview468);
		linear973 = findViewById(R.id.linear973);
		hscroll109 = findViewById(R.id.hscroll109);
		textview600 = findViewById(R.id.textview600);
		hscroll78 = findViewById(R.id.hscroll78);
		textview2347 = findViewById(R.id.textview2347);
		textview605 = findViewById(R.id.textview605);
		linear1043 = findViewById(R.id.linear1043);
		textview519 = findViewById(R.id.textview519);
		textview608 = findViewById(R.id.textview608);
		linear935 = findViewById(R.id.linear935);
		textview2181 = findViewById(R.id.textview2181);
		textview611 = findViewById(R.id.textview611);
		linear929 = findViewById(R.id.linear929);
		textview2189 = findViewById(R.id.textview2189);
		textview2348 = findViewById(R.id.textview2348);
		linear1024 = findViewById(R.id.linear1024);
		textview2194 = findViewById(R.id.textview2194);
		textview623 = findViewById(R.id.textview623);
		linear923 = findViewById(R.id.linear923);
		textview2199 = findViewById(R.id.textview2199);
		textview617 = findViewById(R.id.textview617);
		linear219 = findViewById(R.id.linear219);
		textview667 = findViewById(R.id.textview667);
		textview620 = findViewById(R.id.textview620);
		linear223 = findViewById(R.id.linear223);
		textview680 = findViewById(R.id.textview680);
		textview629 = findViewById(R.id.textview629);
		linear941 = findViewById(R.id.linear941);
		textview2209 = findViewById(R.id.textview2209);
		edittext221 = findViewById(R.id.edittext221);
		linear227 = findViewById(R.id.linear227);
		textview682 = findViewById(R.id.textview682);
		linear197 = findViewById(R.id.linear197);
		hscroll104 = findViewById(R.id.hscroll104);
		linear955 = findViewById(R.id.linear955);
		hscroll128 = findViewById(R.id.hscroll128);
		linear958 = findViewById(R.id.linear958);
		hscroll129 = findViewById(R.id.hscroll129);
		linear1045 = findViewById(R.id.linear1045);
		hscroll130 = findViewById(R.id.hscroll130);
		linear964 = findViewById(R.id.linear964);
		linear196 = findViewById(R.id.linear196);
		linear1044 = findViewById(R.id.linear1044);
		hscroll132 = findViewById(R.id.hscroll132);
		linear956 = findViewById(R.id.linear956);
		hscroll131 = findViewById(R.id.hscroll131);
		linear232 = findViewById(R.id.linear232);
		hscroll134 = findViewById(R.id.hscroll134);
		linear957 = findViewById(R.id.linear957);
		hscroll133 = findViewById(R.id.hscroll133);
		linear233 = findViewById(R.id.linear233);
		hscroll136 = findViewById(R.id.hscroll136);
		linear960 = findViewById(R.id.linear960);
		textview681 = findViewById(R.id.textview681);
		linear961 = findViewById(R.id.linear961);
		hscroll105 = findViewById(R.id.hscroll105);
		linear962 = findViewById(R.id.linear962);
		imageview5 = findViewById(R.id.imageview5);
		linear974 = findViewById(R.id.linear974);
		linear218 = findViewById(R.id.linear218);
		textview679 = findViewById(R.id.textview679);
		linear203 = findViewById(R.id.linear203);
		textview607 = findViewById(R.id.textview607);
		edittext205 = findViewById(R.id.edittext205);
		textview606 = findViewById(R.id.textview606);
		edittext204 = findViewById(R.id.edittext204);
		linear936 = findViewById(R.id.linear936);
		textview2196 = findViewById(R.id.textview2196);
		linear937 = findViewById(R.id.linear937);
		textview625 = findViewById(R.id.textview625);
		edittext216 = findViewById(R.id.edittext216);
		textview624 = findViewById(R.id.textview624);
		edittext215 = findViewById(R.id.edittext215);
		linear930 = findViewById(R.id.linear930);
		textview2186 = findViewById(R.id.textview2186);
		linear931 = findViewById(R.id.linear931);
		textview614 = findViewById(R.id.textview614);
		edittext209 = findViewById(R.id.edittext209);
		textview613 = findViewById(R.id.textview613);
		edittext208 = findViewById(R.id.edittext208);
		linear1025 = findViewById(R.id.linear1025);
		textview2320 = findViewById(R.id.textview2320);
		linear1026 = findViewById(R.id.linear1026);
		textview616 = findViewById(R.id.textview616);
		edittext203 = findViewById(R.id.edittext203);
		textview615 = findViewById(R.id.textview615);
		edittext202 = findViewById(R.id.edittext202);
		linear924 = findViewById(R.id.linear924);
		textview2178 = findViewById(R.id.textview2178);
		linear925 = findViewById(R.id.linear925);
		textview610 = findViewById(R.id.textview610);
		edittext207 = findViewById(R.id.edittext207);
		textview609 = findViewById(R.id.textview609);
		edittext206 = findViewById(R.id.edittext206);
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
		textview639 = findViewById(R.id.textview639);
		edittext226 = findViewById(R.id.edittext226);
		textview2227 = findViewById(R.id.textview2227);
		textview638 = findViewById(R.id.textview638);
		textview651 = findViewById(R.id.textview651);
		edittext232 = findViewById(R.id.edittext232);
		textview2236 = findViewById(R.id.textview2236);
		textview650 = findViewById(R.id.textview650);
		textview643 = findViewById(R.id.textview643);
		edittext228 = findViewById(R.id.edittext228);
		textview663 = findViewById(R.id.textview663);
		textview642 = findViewById(R.id.textview642);
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
		textview641 = findViewById(R.id.textview641);
		edittext227 = findViewById(R.id.edittext227);
		textview2230 = findViewById(R.id.textview2230);
		textview640 = findViewById(R.id.textview640);
		textview647 = findViewById(R.id.textview647);
		edittext230 = findViewById(R.id.edittext230);
		textview687 = findViewById(R.id.textview687);
		textview646 = findViewById(R.id.textview646);
		textview649 = findViewById(R.id.textview649);
		edittext231 = findViewById(R.id.edittext231);
		textview2233 = findViewById(R.id.textview2233);
		textview648 = findViewById(R.id.textview648);
		textview655 = findViewById(R.id.textview655);
		edittext234 = findViewById(R.id.edittext234);
		textview689 = findViewById(R.id.textview689);
		textview654 = findViewById(R.id.textview654);
		textview657 = findViewById(R.id.textview657);
		edittext235 = findViewById(R.id.edittext235);
		textview2242 = findViewById(R.id.textview2242);
		textview656 = findViewById(R.id.textview656);
		textview660 = findViewById(R.id.textview660);
		textview535 = findViewById(R.id.textview535);
		linear1046 = findViewById(R.id.linear1046);
		textview678 = findViewById(R.id.textview678);
		edittext237 = findViewById(R.id.edittext237);
		textview2243 = findViewById(R.id.textview2243);
		edittext238 = findViewById(R.id.edittext238);
		textview2244 = findViewById(R.id.textview2244);
		textview2245 = findViewById(R.id.textview2245);
		internet = new RequestNetwork(this);
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear69.setVisibility(View.VISIBLE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
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
		
		edittext15.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext15.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext9.setText(String.valueOf(00.00));
				edittext9.setTextColor(0xFFE91E63);
				edittext12.setText(String.valueOf(00.00));
				edittext12.setTextColor(0xFFE91E63);
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
				edittext5.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext9.setText(String.valueOf(00.00));
				edittext9.setTextColor(0xFFE91E63);
				edittext10.setText(String.valueOf(00.00));
				edittext11.setText(String.valueOf(00.00));
				edittext12.setText(String.valueOf(00.00));
				edittext10.setTextColor(0xFFE91E63);
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setTextColor(0xFFE91E63);
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
				edittext6.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext199.setText(String.valueOf(00.00));
				edittext199.setTextColor(0xFFE91E63);
				edittext10.setText(String.valueOf(00.00));
				edittext11.setText(String.valueOf(00.00));
				edittext12.setText(String.valueOf(00.00));
				edittext10.setTextColor(0xFFE91E63);
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setTextColor(0xFFE91E63);
				textview55.setVisibility(View.GONE);
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
				edittext199.setText(String.valueOf(00.00));
				edittext199.setTextColor(0xFFE91E63);
				edittext10.setText(String.valueOf(00.00));
				edittext11.setText(String.valueOf(00.00));
				edittext12.setText(String.valueOf(00.00));
				edittext10.setTextColor(0xFFE91E63);
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setTextColor(0xFFE91E63);
				textview55.setVisibility(View.GONE);
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
				edittext8.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext10.setText(String.valueOf(00.00));
				edittext11.setText(String.valueOf(00.00));
				edittext12.setText(String.valueOf(00.00));
				edittext10.setTextColor(0xFFE91E63);
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setTextColor(0xFFE91E63);
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
				edittext7.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext10.setText(String.valueOf(00.00));
				edittext11.setText(String.valueOf(00.00));
				edittext12.setText(String.valueOf(00.00));
				edittext10.setTextColor(0xFFE91E63);
				edittext11.setTextColor(0xFFE91E63);
				edittext12.setTextColor(0xFFE91E63);
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
				if ((((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) || (((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0))) || ((edittext4.getText().toString().equals("") || edittext4.getText().toString().equals(".")) || (edittext4.getText().toString().equals("-") || (Double.parseDouble(edittext4.getText().toString()) < 0))))) || ((((edittext7.getText().toString().equals("") || edittext7.getText().toString().equals(".")) || edittext7.getText().toString().equals("-")) || ((edittext8.getText().toString().equals("") || edittext8.getText().toString().equals(".")) || edittext8.getText().toString().equals("-"))) || ((edittext15.getText().toString().equals("") || edittext15.getText().toString().equals(".")) || (edittext15.getText().toString().equals("-") || (Double.parseDouble(edittext15.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					edittext9.setText(String.valueOf(Double.parseDouble(edittext15.getText().toString()) * Double.parseDouble(edittext5.getText().toString())));
					edittext9.setTextColor(0xFF000000);
					edittext199.setText(String.valueOf(Double.parseDouble(edittext6.getText().toString()) - Double.parseDouble(edittext4.getText().toString())));
					edittext199.setTextColor(0xFF000000);
					if (Double.parseDouble(edittext4.getText().toString()) > Double.parseDouble(edittext6.getText().toString())) {
						textview55.setVisibility(View.VISIBLE);
						edittext10.setText(String.valueOf(0.00d));
						edittext11.setText(String.valueOf(0.00d));
						edittext12.setText(String.valueOf(0.00d));
					}
					else {
						textview55.setVisibility(View.GONE);
						if ((Double.parseDouble(edittext7.getText().toString()) == 0) || (Double.parseDouble(edittext8.getText().toString()) == 0)) {
							edittext10.setText(String.valueOf(Double.parseDouble(edittext5.getText().toString())));
						}
						else {
							edittext10.setText(String.valueOf(((Double.parseDouble(edittext199.getText().toString()) * (Double.parseDouble(edittext7.getText().toString()) / Double.parseDouble(edittext8.getText().toString()))) + Double.parseDouble(edittext5.getText().toString())) + (Double.parseDouble(edittext199.getText().toString()) * (Double.parseDouble(edittext7.getText().toString()) / Double.parseDouble(edittext8.getText().toString())))));
						}
						edittext11.setText(String.valueOf(((Double.parseDouble(edittext5.getText().toString()) + Double.parseDouble(edittext10.getText().toString())) / 2) * Double.parseDouble(edittext199.getText().toString())));
						edittext12.setText(String.valueOf(Double.parseDouble(edittext15.getText().toString()) * Double.parseDouble(edittext11.getText().toString())));
						edittext10.setTextColor(0xFF000000);
						edittext11.setTextColor(0xFF000000);
						edittext12.setTextColor(0xFF000000);
					}
				}
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
		
		edittext9.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext9.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
				edittext17.setText(String.valueOf(Double.parseDouble(_charSeq) + Double.parseDouble(edittext14.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext10.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext10.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext11.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview533.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* الميل طبقآ لمناسيب مية الماسورة\n( نسبة ف الالف ) ../ْ \nيساوى\n( المنسوب ب بداية الفرعة - المنسوب في نهاية الفرعة ) / طول الفرعة");
				return true;
			}
		});
		
		edittext12.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext12.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext18.setText(String.valueOf(Double.parseDouble(_charSeq) + Double.parseDouble(edittext16.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		add_dynamic_pipe_line.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_eip_d_soil1();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext14.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext14.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext17.setText(String.valueOf(Double.parseDouble(edittext9.getText().toString()) + Double.parseDouble(_charSeq)));
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
				edittext16.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext18.setText(String.valueOf(Double.parseDouble(edittext12.getText().toString()) + Double.parseDouble(_charSeq)));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext17.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext17.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext140.setText(String.valueOf(00.00));
				edittext141.setText(String.valueOf(00.00));
				edittext142.setText(String.valueOf(00.00));
				edittext140.setTextColor(0xFFE91E63);
				edittext141.setTextColor(0xFFE91E63);
				edittext142.setTextColor(0xFFE91E63);
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext152.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
				edittext152.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				edittext18.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				if (((edittext27.getText().toString().equals("") || edittext27.getText().toString().equals(".")) || (edittext27.getText().toString().equals("-") || (Double.parseDouble(edittext27.getText().toString()) < 0))) || (Double.parseDouble(edittext27.getText().toString()) > 100)) {
					edittext28.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
				else {
					edittext28.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext27.getText().toString()) / 100))));
				}
				/*
هندسي مقاول باطن متكامل
*/
				edittext31.setText(String.valueOf(00.00));
				edittext31.setTextColor(0xFFE91E63);
				/*
هندسي مقاول باطن حفر ومقاول باطن نقل
*/
				edittext37.setText(String.valueOf(00.00));
				edittext39.setText(String.valueOf(00.00));
				edittext37.setTextColor(0xFFE91E63);
				edittext39.setTextColor(0xFFE91E63);
				edittext40.setText(String.valueOf(00.00));
				edittext40.setTextColor(0xFFE91E63);
				/*
هندسي توريد خلطة و معدات وعمالة
*/
				edittext116.setText(String.valueOf(00.00));
				edittext117.setText(String.valueOf(00.00));
				edittext118.setText(String.valueOf(00.00));
				edittext116.setTextColor(0xFFE91E63);
				edittext117.setTextColor(0xFFE91E63);
				edittext118.setTextColor(0xFFE91E63);
				edittext122.setText(String.valueOf(00.00));
				edittext123.setText(String.valueOf(00.00));
				edittext124.setText(String.valueOf(00.00));
				edittext122.setTextColor(0xFFE91E63);
				edittext123.setTextColor(0xFFE91E63);
				edittext124.setTextColor(0xFFE91E63);
				/*
فعلي حفر
*/
				edittext239.setText(String.valueOf(00.00));
				edittext224.setText(String.valueOf(00.00));
				edittext239.setTextColor(0xFFE91E63);
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
					edittext28.setText(String.valueOf(Double.parseDouble(edittext18.getText().toString())));
				}
				else {
					edittext28.setText(String.valueOf(Double.parseDouble(edittext18.getText().toString()) + (Double.parseDouble(edittext18.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
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
				        .on(ToipccExcavationForRoadssActivity.this, textview1264)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* نسبة الأنتفاش\nوهي تعبر عن النسبة التي ينتفش بها ناتج الحفر عند تحميله بالعربيات لنقله للمقالب العمومية\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٣٠ % \" وذلك عند الضغط علي زرار أحسب")
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
					edittext27.setText(String.valueOf(Double.parseDouble("30")));
				}
			}
		});
		
		edittext28.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext28.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
				/*
هندسي مقاول حفر ونقل
*/
				edittext31.setText(String.valueOf(00.00));
				edittext31.setTextColor(0xFFE91E63);
				/*
هندسي توريد خلطة ومقاول مصنعيات
*/
				edittext38.setText(String.valueOf(00.00));
				edittext38.setTextColor(0xFFE91E63);
				edittext39.setText(String.valueOf(00.00));
				edittext39.setTextColor(0xFFE91E63);
				edittext40.setText(String.valueOf(00.00));
				edittext40.setTextColor(0xFFE91E63);
				/*
هندسي توريد خلطة و معدات وعمالة
*/
				edittext128.setText(String.valueOf(00.00));
				edittext129.setText(String.valueOf(00.00));
				edittext130.setText(String.valueOf(00.00));
				edittext128.setTextColor(0xFFE91E63);
				edittext129.setTextColor(0xFFE91E63);
				edittext130.setTextColor(0xFFE91E63);
				edittext134.setText(String.valueOf(00.00));
				edittext135.setText(String.valueOf(00.00));
				edittext136.setText(String.valueOf(00.00));
				edittext134.setTextColor(0xFFE91E63);
				edittext135.setTextColor(0xFFE91E63);
				edittext136.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
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
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
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
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear870.setVisibility(View.VISIBLE);
					edittext113.setText("");
					edittext114.setText("");
					edittext115.setText("");
					edittext116.setTextColor(0xFF000000);
					edittext117.setTextColor(0xFF000000);
					edittext118.setTextColor(0xFF000000);
					edittext119.setText("");
					edittext120.setText("");
					edittext121.setText("");
					edittext122.setTextColor(0xFF000000);
					edittext123.setTextColor(0xFF000000);
					edittext124.setTextColor(0xFF000000);
					edittext125.setText("");
					edittext126.setText("");
					edittext127.setText("");
					edittext128.setTextColor(0xFF000000);
					edittext129.setTextColor(0xFF000000);
					edittext130.setTextColor(0xFF000000);
					edittext131.setText("");
					edittext132.setText("");
					edittext133.setText("");
					edittext134.setTextColor(0xFF000000);
					edittext135.setTextColor(0xFF000000);
					edittext136.setTextColor(0xFF000000);
					edittext137.setText("");
					edittext138.setText("");
					edittext139.setText("");
					edittext140.setTextColor(0xFF000000);
					edittext141.setTextColor(0xFF000000);
					edittext142.setTextColor(0xFF000000);
					edittext143.setText("");
					edittext144.setText("");
					edittext145.setText("");
					edittext146.setTextColor(0xFF000000);
					edittext147.setText("");
					edittext148.setText("");
					edittext149.setText("");
					edittext150.setTextColor(0xFF000000);
					edittext151.setTextColor(0xFF000000);
					edittext152.setTextColor(0xFF000000);
					edittext153.setText("");
					edittext154.setText("");
					edittext155.setText("");
					edittext156.setTextColor(0xFF000000);
					edittext157.setText("");
					edittext158.setText("");
					edittext159.setText("");
					edittext160.setText("");
					edittext161.setTextColor(0xFF000000);
					edittext162.setTextColor(0xFFFFFFFF);
					edittext163.setTextColor(0xFF000000);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear193.setVisibility(View.VISIBLE);
					edittext204.setText("");
					edittext205.setText("");
					edittext226.setTextColor(0xFF000000);
					edittext215.setText("");
					edittext216.setText("");
					edittext232.setTextColor(0xFF000000);
					edittext208.setText("");
					edittext209.setText("");
					edittext228.setTextColor(0xFF000000);
					edittext202.setText("");
					edittext203.setText("");
					edittext239.setTextColor(0xFF000000);
					edittext224.setTextColor(0xFF000000);
					edittext225.setTextColor(0xFF000000);
					edittext206.setText("");
					edittext207.setText("");
					edittext227.setTextColor(0xFF000000);
					edittext211.setText("");
					edittext212.setText("");
					edittext230.setTextColor(0xFF000000);
					edittext213.setText("");
					edittext214.setText("");
					edittext231.setTextColor(0xFF000000);
					edittext219.setText("");
					edittext220.setText("");
					edittext234.setTextColor(0xFF000000);
					edittext221.setText("");
					edittext222.setText("");
					edittext223.setText("");
					edittext235.setTextColor(0xFF000000);
					edittext237.setTextColor(0xFFFFFFFF);
					edittext238.setTextColor(0xFF000000);
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
					edittext31.setText(String.valueOf(Double.parseDouble(edittext18.getText().toString()) * Double.parseDouble(edittext30.getText().toString())));
					edittext31.setTextColor(0xFFFFFFFF);
				}
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
					edittext37.setText(String.valueOf(Double.parseDouble(edittext18.getText().toString()) * Double.parseDouble(edittext34.getText().toString())));
					edittext38.setText(String.valueOf(Double.parseDouble(edittext35.getText().toString()) * Double.parseDouble(edittext28.getText().toString())));
					edittext39.setText(String.valueOf(Double.parseDouble(edittext37.getText().toString()) + Double.parseDouble(edittext38.getText().toString())));
					edittext40.setText(String.valueOf(Double.parseDouble(edittext39.getText().toString()) / Double.parseDouble(edittext18.getText().toString())));
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
		
		edittext157.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.equals("")) {
					textview466.setText("٩.١ - تكلفة المعدات الأخرى أو العمالة الأضافية ( جنيه )");
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
				edittext113.setText("");
				edittext114.setText("");
				edittext115.setText("");
				edittext116.setTextColor(0xFF000000);
				edittext117.setTextColor(0xFF000000);
				edittext118.setTextColor(0xFF000000);
				edittext119.setText("");
				edittext120.setText("");
				edittext121.setText("");
				edittext122.setTextColor(0xFF000000);
				edittext123.setTextColor(0xFF000000);
				edittext124.setTextColor(0xFF000000);
				edittext125.setText("");
				edittext126.setText("");
				edittext127.setText("");
				edittext128.setTextColor(0xFF000000);
				edittext129.setTextColor(0xFF000000);
				edittext130.setTextColor(0xFF000000);
				edittext131.setText("");
				edittext132.setText("");
				edittext133.setText("");
				edittext134.setTextColor(0xFF000000);
				edittext135.setTextColor(0xFF000000);
				edittext136.setTextColor(0xFF000000);
				edittext137.setText("");
				edittext138.setText("");
				edittext139.setText("");
				edittext140.setTextColor(0xFF000000);
				edittext141.setTextColor(0xFF000000);
				edittext142.setTextColor(0xFF000000);
				edittext143.setText("");
				edittext144.setText("");
				edittext145.setText("");
				edittext146.setTextColor(0xFF000000);
				edittext147.setText("");
				edittext148.setText("");
				edittext149.setText("");
				edittext150.setTextColor(0xFF000000);
				edittext151.setTextColor(0xFF000000);
				edittext152.setTextColor(0xFF000000);
				edittext153.setText("");
				edittext154.setText("");
				edittext155.setText("");
				edittext156.setTextColor(0xFF000000);
				edittext157.setText("");
				edittext158.setText("");
				edittext159.setText("");
				edittext160.setText("");
				edittext161.setTextColor(0xFF000000);
				edittext162.setTextColor(0xFFFFFFFF);
				edittext163.setTextColor(0xFF000000);
			}
		});
		
		textview408.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview408)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالحفار\n( جنيه / يوم )\nوهو يعبر عن المبلغ الذي يتقاضاه الحفار بنهاية اليوم عن الأعمال التي قام بتنفيذها خلال اليوم \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"")
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
		
		edittext115.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext115.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext118.setText(String.valueOf(00.00));
				edittext118.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview407.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview407)
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
		
		edittext114.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext114.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext116.setText(String.valueOf(00.00));
				edittext116.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview406.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview406)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("المعدل\nاليومي\nللحفار\n( م٣ / يوم )\nوهو يعبر عن الكمية التي يمكن للحفار أن يقوم بتنفيذها خلال اليوم\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ م٣ / يوم \"")
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
		
		edittext113.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext113.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext116.setText(String.valueOf(00.00));
				edittext117.setText(String.valueOf(00.00));
				edittext118.setText(String.valueOf(00.00));
				edittext116.setTextColor(0xFFE91E63);
				edittext117.setTextColor(0xFFE91E63);
				edittext118.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview432.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview432)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالبلدوزر\n( جنيه / يوم )\nوهو يعبر عن المبلغ الذي يتقاضاه البلدوزر بنهاية اليوم عن الأعمال التي قام بتنفيذها خلال اليوم \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"")
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
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview431.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview431)
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
		
		edittext120.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext120.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf(00.00));
				edittext122.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview430.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview430)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("المعدل\nاليومي\nللبلدوزر\n( م٣ / يوم )\nوهو يعبر عن الكمية التي يمكن للبلدوزر أن يقوم بتنفيذها خلال اليوم\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ م٣ / يوم \"")
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
		
		edittext119.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext119.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf(00.00));
				edittext123.setText(String.valueOf(00.00));
				edittext124.setText(String.valueOf(00.00));
				edittext122.setTextColor(0xFFE91E63);
				edittext123.setTextColor(0xFFE91E63);
				edittext124.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview416.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview416)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nاللودر\n( جنيه / يوم )\nوهو يعبر عن المبلغ الذي يتقاضاه اللودر بنهاية اليوم عن الأعمال التي قام بتنفيذها خلال اليوم \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"")
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
				edittext130.setText(String.valueOf(00.00));
				edittext130.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview415.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview415)
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
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview414.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview414)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("المعدل\nاليومي\nللودر\n( م٣ / يوم )\nوهو يعبر عن الكمية التي يمكن للودر أن يقوم بتنفيذها خلال اليوم\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ م٣ / يوم \"")
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
				edittext129.setText(String.valueOf(00.00));
				edittext130.setText(String.valueOf(00.00));
				edittext128.setTextColor(0xFFE91E63);
				edittext129.setTextColor(0xFFE91E63);
				edittext130.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview420.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview420)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* سعر النقل\n( جنيه / م٣ )\nوهو يعبر عن المبلغ الذي يتكلفة النقل لناتج الحفر من موقع العمل الي المقالب العمومية أو داخل الموقع بالجنيه لكل ١م٣\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / م٣ \"")
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
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview419.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview419)
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
		
		edittext132.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext132.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext134.setText(String.valueOf(00.00));
				edittext134.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview418.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview418)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* حمولة\nالسيارة\n( م٣ )\n\nوهو يعبر عن الكمية التي يمكن تقوم السيارة النقل بحملها ونقلها من موقع العمل للمقالب العمومية أو داخل الموقع \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٢٠ م٣ \"")
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
				edittext134.setText(String.valueOf(00.00));
				edittext135.setText(String.valueOf(00.00));
				edittext136.setText(String.valueOf(00.00));
				edittext134.setTextColor(0xFFE91E63);
				edittext135.setTextColor(0xFFE91E63);
				edittext136.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview412.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview412)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالجريدر\n( جنيه / يوم )\nوهو يعبر عن المبلغ الذي يتقاضاه الجريدر بنهاية اليوم عن الأعمال التي قام بتنفيذها خلال اليوم \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"")
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
				edittext142.setText(String.valueOf(00.00));
				edittext142.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview411.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview411)
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
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview410.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview410)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("المعدل\nاليومي\nللجريدر\n( م٢ / يوم )\nوهو يعبر عن الكمية التي يمكن للجريدر أن يقوم بتنفيذها خلال اليوم\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ م٢ / يوم \"")
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
				edittext141.setText(String.valueOf(00.00));
				edittext142.setText(String.valueOf(00.00));
				edittext140.setTextColor(0xFFE91E63);
				edittext141.setTextColor(0xFFE91E63);
				edittext142.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				        .on(ToipccExcavationForRoadssActivity.this, textview424)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("\n* سعر النقلة\nللتانك شامل\nتوريد المياه\n( جنيه / نقلة )\nوهو يعبر عن المبلغ الذي تتكلفة نقلة المياه كاملة\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / نقلة \"")
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
		
		edittext145.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext145.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext146.setText(String.valueOf(00.00));
				edittext146.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				        .on(ToipccExcavationForRoadssActivity.this, textview423)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد أيام\nالعمل التي\nسيتم استخدام\nتنك أو نقلة\nمياه بها\nلزوم تنفيذ\nالبند\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ يوم \"")
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
		
		edittext144.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext144.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext146.setText(String.valueOf(00.00));
				edittext146.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				        .on(ToipccExcavationForRoadssActivity.this, textview422)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد التنكات\nأو عدد النقلات\nالمتوقع\nاستخدامها \n( تانك أو نقلة / يوم )\nوهو يعبر عن عدد تنكات المياه التي يمكن استخدامها خلال اليوم في حالة الحاجة\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ تانك مياه أو نقلة مياه / يوم \"")
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
				edittext146.setText(String.valueOf(00.00));
				edittext146.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				        .on(ToipccExcavationForRoadssActivity.this, textview428)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* يومية\nالهراس\n( جنيه / يوم )\nوهو يعبر عن المبلغ الذي يتقاضاه الهراس بنهاية اليوم عن الأعمال التي قام بتنفيذها خلال اليوم \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"")
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
		
		edittext149.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext149.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext152.setText(String.valueOf(00.00));
				edittext152.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				        .on(ToipccExcavationForRoadssActivity.this, textview427)
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
		
		edittext148.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext148.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext150.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
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
				        .on(ToipccExcavationForRoadssActivity.this, textview426)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* المعدل\nاليومي\nللهراس\n( م٢ / يوم )\nوهو يعبر عن الكمية التي يمكن للهراس أن يقوم بتنفيذها خلال اليوم\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ م٢ / يوم \"")
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
				edittext150.setText(String.valueOf(00.00));
				edittext151.setText(String.valueOf(00.00));
				edittext152.setText(String.valueOf(00.00));
				edittext150.setTextColor(0xFFE91E63);
				edittext151.setTextColor(0xFFE91E63);
				edittext152.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				        .on(ToipccExcavationForRoadssActivity.this, textview440)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالعمالة\n( جنيه / يوم )\nوهو يعبر عن المبلغ الذي يتقاضاه العامل خلال اليوم \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ جنيه / يوم \"")
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
		
		edittext155.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext155.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext156.setText(String.valueOf(00.00));
				edittext156.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				        .on(ToipccExcavationForRoadssActivity.this, textview439)
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
		
		edittext154.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext154.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext156.setText(String.valueOf(00.00));
				edittext156.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				        .on(ToipccExcavationForRoadssActivity.this, textview438)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد العمال العاملين بالبند خلال اليوم\n( عامل / يوم )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٠.٠٠ عامل / يوم \"")
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
		
		edittext153.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext153.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext156.setText(String.valueOf(00.00));
				edittext156.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				        .on(ToipccExcavationForRoadssActivity.this, textview443)
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
		
		edittext160.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext160.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext161.setText(String.valueOf(00.00));
				edittext161.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				        .on(ToipccExcavationForRoadssActivity.this, textview442)
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
		
		edittext159.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext159.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext161.setText(String.valueOf(00.00));
				edittext161.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				        .on(ToipccExcavationForRoadssActivity.this, textview441)
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
		
		edittext158.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext158.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext161.setText(String.valueOf(00.00));
				edittext161.setTextColor(0xFFE91E63);
				edittext162.setText(String.valueOf(00.00));
				edittext163.setText(String.valueOf(00.00));
				edittext162.setTextColor(0xFFE91E63);
				edittext163.setTextColor(0xFFE91E63);
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
				if ((((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0)))) || ((((edittext7.getText().toString().equals("") || edittext7.getText().toString().equals(".")) || edittext7.getText().toString().equals("-")) || ((edittext8.getText().toString().equals("") || edittext8.getText().toString().equals(".")) || edittext8.getText().toString().equals("-"))) || ((edittext15.getText().toString().equals("") || edittext15.getText().toString().equals(".")) || (edittext15.getText().toString().equals("-") || (Double.parseDouble(edittext15.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
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
						edittext116.setText(String.valueOf(00.00));
						edittext117.setText(String.valueOf(00.00));
						edittext118.setText(String.valueOf(00.00));
					}
					else {
						edittext116.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext18.getText().toString()) / (Double.parseDouble(edittext113.getText().toString()) * Double.parseDouble(edittext114.getText().toString())))));
						edittext117.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext18.getText().toString()) / Double.parseDouble(edittext113.getText().toString()))));
						edittext118.setText(String.valueOf(Double.parseDouble(edittext115.getText().toString()) * Double.parseDouble(edittext117.getText().toString())));
					}
					edittext116.setTextColor(0xFF000000);
					edittext117.setTextColor(0xFF000000);
					edittext118.setTextColor(0xFF000000);
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
						edittext122.setText(String.valueOf(00.00));
						edittext123.setText(String.valueOf(00.00));
						edittext124.setText(String.valueOf(00.00));
					}
					else {
						edittext122.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext18.getText().toString()) / (Double.parseDouble(edittext119.getText().toString()) * Double.parseDouble(edittext120.getText().toString())))));
						edittext123.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext18.getText().toString()) / Double.parseDouble(edittext119.getText().toString()))));
						edittext124.setText(String.valueOf(Double.parseDouble(edittext121.getText().toString()) * Double.parseDouble(edittext123.getText().toString())));
					}
					edittext122.setTextColor(0xFF000000);
					edittext123.setTextColor(0xFF000000);
					edittext124.setTextColor(0xFF000000);
					if (((edittext125.getText().toString().equals("") || edittext125.getText().toString().equals(".")) || edittext125.getText().toString().equals("-")) || (Double.parseDouble(edittext125.getText().toString()) < 0)) {
						edittext125.setText(String.valueOf(00.00));
					}
					if (((edittext126.getText().toString().equals("") || edittext126.getText().toString().equals(".")) || edittext126.getText().toString().equals("-")) || (Double.parseDouble(edittext126.getText().toString()) < 0)) {
						edittext126.setText(String.valueOf(1));
					}
					if (((edittext127.getText().toString().equals("") || edittext127.getText().toString().equals(".")) || edittext127.getText().toString().equals("-")) || (Double.parseDouble(edittext127.getText().toString()) < 0)) {
						edittext127.setText(String.valueOf(00.00));
					}
					if ((Double.parseDouble(edittext125.getText().toString()) == 00.00d) || (Double.parseDouble(edittext126.getText().toString()) == 00.00d)) {
						edittext128.setText(String.valueOf(00.00));
						edittext129.setText(String.valueOf(00.00));
						edittext130.setText(String.valueOf(00.00));
					}
					else {
						edittext128.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext28.getText().toString()) / (Double.parseDouble(edittext125.getText().toString()) * Double.parseDouble(edittext126.getText().toString())))));
						edittext129.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext28.getText().toString()) / Double.parseDouble(edittext125.getText().toString()))));
						edittext130.setText(String.valueOf(Double.parseDouble(edittext127.getText().toString()) * Double.parseDouble(edittext129.getText().toString())));
					}
					edittext128.setTextColor(0xFF000000);
					edittext129.setTextColor(0xFF000000);
					edittext130.setTextColor(0xFF000000);
					if (((edittext131.getText().toString().equals("") || edittext131.getText().toString().equals(".")) || edittext131.getText().toString().equals("-")) || (Double.parseDouble(edittext131.getText().toString()) < 0)) {
						edittext131.setText(String.valueOf(20));
					}
					if (((edittext132.getText().toString().equals("") || edittext132.getText().toString().equals(".")) || edittext132.getText().toString().equals("-")) || (Double.parseDouble(edittext132.getText().toString()) < 0)) {
						edittext132.setText(String.valueOf(1));
					}
					if (((edittext133.getText().toString().equals("") || edittext133.getText().toString().equals(".")) || edittext133.getText().toString().equals("-")) || (Double.parseDouble(edittext133.getText().toString()) < 0)) {
						edittext133.setText(String.valueOf(00.00));
					}
					if ((Double.parseDouble(edittext131.getText().toString()) == 00.00d) || (Double.parseDouble(edittext132.getText().toString()) == 00.00d)) {
						edittext134.setText(String.valueOf(00.00));
						edittext135.setText(String.valueOf(00.00));
						edittext136.setText(String.valueOf(00.00));
					}
					else {
						edittext134.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext28.getText().toString()) / (Double.parseDouble(edittext131.getText().toString()) * Double.parseDouble(edittext132.getText().toString())))));
						edittext135.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext28.getText().toString()) / Double.parseDouble(edittext131.getText().toString()))));
						edittext136.setText(String.valueOf(Double.parseDouble(edittext133.getText().toString()) * Double.parseDouble(edittext28.getText().toString())));
					}
					edittext134.setTextColor(0xFF000000);
					edittext135.setTextColor(0xFF000000);
					edittext136.setTextColor(0xFF000000);
					if (((edittext137.getText().toString().equals("") || edittext137.getText().toString().equals(".")) || edittext137.getText().toString().equals("-")) || (Double.parseDouble(edittext137.getText().toString()) < 0)) {
						edittext137.setText(String.valueOf(0.00));
					}
					if (((edittext138.getText().toString().equals("") || edittext138.getText().toString().equals(".")) || edittext138.getText().toString().equals("-")) || (Double.parseDouble(edittext138.getText().toString()) < 0)) {
						edittext138.setText(String.valueOf(1));
					}
					if (((edittext139.getText().toString().equals("") || edittext139.getText().toString().equals(".")) || edittext139.getText().toString().equals("-")) || (Double.parseDouble(edittext139.getText().toString()) < 0)) {
						edittext139.setText(String.valueOf(00.00));
					}
					if ((Double.parseDouble(edittext137.getText().toString()) == 00.00d) || (Double.parseDouble(edittext138.getText().toString()) == 00.00d)) {
						edittext140.setText(String.valueOf(00.00));
						edittext141.setText(String.valueOf(00.00));
						edittext142.setText(String.valueOf(00.00));
					}
					else {
						edittext140.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext17.getText().toString()) / (Double.parseDouble(edittext137.getText().toString()) * Double.parseDouble(edittext138.getText().toString())))));
						edittext141.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext17.getText().toString()) / Double.parseDouble(edittext137.getText().toString()))));
						edittext142.setText(String.valueOf(Double.parseDouble(edittext141.getText().toString()) * Double.parseDouble(edittext139.getText().toString())));
					}
					edittext140.setTextColor(0xFF000000);
					edittext141.setTextColor(0xFF000000);
					edittext142.setTextColor(0xFF000000);
					if (((edittext143.getText().toString().equals("") || edittext143.getText().toString().equals(".")) || edittext143.getText().toString().equals("-")) || (Double.parseDouble(edittext143.getText().toString()) < 0)) {
						edittext143.setText(String.valueOf(0.00));
					}
					if (((edittext144.getText().toString().equals("") || edittext144.getText().toString().equals(".")) || edittext144.getText().toString().equals("-")) || (Double.parseDouble(edittext144.getText().toString()) < 0)) {
						edittext144.setText(String.valueOf(1));
					}
					if (((edittext145.getText().toString().equals("") || edittext145.getText().toString().equals(".")) || edittext145.getText().toString().equals("-")) || (Double.parseDouble(edittext145.getText().toString()) < 0)) {
						edittext145.setText(String.valueOf(00.00));
					}
					edittext146.setText(String.valueOf(Double.parseDouble(edittext143.getText().toString()) * (Double.parseDouble(edittext144.getText().toString()) * Double.parseDouble(edittext145.getText().toString()))));
					edittext146.setTextColor(0xFF000000);
					if (((edittext147.getText().toString().equals("") || edittext147.getText().toString().equals(".")) || edittext147.getText().toString().equals("-")) || (Double.parseDouble(edittext147.getText().toString()) < 0)) {
						edittext147.setText(String.valueOf(0.00));
					}
					if (((edittext148.getText().toString().equals("") || edittext148.getText().toString().equals(".")) || edittext148.getText().toString().equals("-")) || (Double.parseDouble(edittext148.getText().toString()) < 0)) {
						edittext148.setText(String.valueOf(1));
					}
					if (((edittext149.getText().toString().equals("") || edittext149.getText().toString().equals(".")) || edittext149.getText().toString().equals("-")) || (Double.parseDouble(edittext149.getText().toString()) < 0)) {
						edittext149.setText(String.valueOf(00.00));
					}
					if ((Double.parseDouble(edittext147.getText().toString()) == 00.00d) || (Double.parseDouble(edittext148.getText().toString()) == 00.00d)) {
						edittext150.setText(String.valueOf(00.00));
						edittext151.setText(String.valueOf(00.00));
						edittext152.setText(String.valueOf(00.00));
					}
					else {
						edittext150.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext17.getText().toString()) / (Double.parseDouble(edittext147.getText().toString()) * Double.parseDouble(edittext148.getText().toString())))));
						edittext151.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext17.getText().toString()) / Double.parseDouble(edittext147.getText().toString()))));
						edittext152.setText(String.valueOf(Double.parseDouble(edittext151.getText().toString()) * Double.parseDouble(edittext149.getText().toString())));
					}
					edittext150.setTextColor(0xFF000000);
					edittext151.setTextColor(0xFF000000);
					edittext152.setTextColor(0xFF000000);
					if (((edittext153.getText().toString().equals("") || edittext153.getText().toString().equals(".")) || edittext153.getText().toString().equals("-")) || (Double.parseDouble(edittext153.getText().toString()) < 0)) {
						edittext153.setText(String.valueOf(0.00));
					}
					if (((edittext154.getText().toString().equals("") || edittext154.getText().toString().equals(".")) || edittext154.getText().toString().equals("-")) || (Double.parseDouble(edittext154.getText().toString()) < 0)) {
						edittext154.setText(String.valueOf(1));
					}
					if (((edittext155.getText().toString().equals("") || edittext155.getText().toString().equals(".")) || edittext155.getText().toString().equals("-")) || (Double.parseDouble(edittext155.getText().toString()) < 0)) {
						edittext155.setText(String.valueOf(00.00));
					}
					edittext156.setText(String.valueOf(Double.parseDouble(edittext153.getText().toString()) * (Double.parseDouble(edittext154.getText().toString()) * Double.parseDouble(edittext155.getText().toString()))));
					edittext156.setTextColor(0xFF000000);
					if (((edittext158.getText().toString().equals("") || edittext158.getText().toString().equals(".")) || edittext158.getText().toString().equals("-")) || (Double.parseDouble(edittext158.getText().toString()) < 0)) {
						edittext158.setText(String.valueOf(0.00));
					}
					if (((edittext159.getText().toString().equals("") || edittext159.getText().toString().equals(".")) || edittext159.getText().toString().equals("-")) || (Double.parseDouble(edittext159.getText().toString()) < 0)) {
						edittext159.setText(String.valueOf(1));
					}
					if (((edittext160.getText().toString().equals("") || edittext160.getText().toString().equals(".")) || edittext160.getText().toString().equals("-")) || (Double.parseDouble(edittext160.getText().toString()) < 0)) {
						edittext160.setText(String.valueOf(00.00));
					}
					edittext161.setText(String.valueOf(Double.parseDouble(edittext158.getText().toString()) * (Double.parseDouble(edittext159.getText().toString()) * Double.parseDouble(edittext160.getText().toString()))));
					edittext161.setTextColor(0xFF000000);
					edittext162.setText(String.valueOf((Double.parseDouble(edittext118.getText().toString()) + ((Double.parseDouble(edittext124.getText().toString()) + Double.parseDouble(edittext130.getText().toString())) + Double.parseDouble(edittext136.getText().toString()))) + (((Double.parseDouble(edittext142.getText().toString()) + Double.parseDouble(edittext146.getText().toString())) + Double.parseDouble(edittext152.getText().toString())) + (Double.parseDouble(edittext156.getText().toString()) + Double.parseDouble(edittext161.getText().toString())))));
					edittext162.setTextColor(0xFFFFFFFF);
					edittext163.setText(String.valueOf(Double.parseDouble(edittext162.getText().toString()) / Double.parseDouble(edittext18.getText().toString())));
					edittext163.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext116.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext116.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext117.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
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
				edittext118.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext122.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext123.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
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
				edittext128.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext129.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
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
				edittext130.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext134.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext135.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
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
				edittext140.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext141.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
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
				edittext142.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
		
		edittext150.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext150.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext151.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
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
		
		edittext161.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext161.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 9)});
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
				edittext162.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
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
				edittext163.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
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
					textview656.setText("إجمالى تكلفة المعدات الأخرى أو العمالة الأضافية ( جنيه )");
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
				edittext204.setText("");
				edittext205.setText("");
				edittext215.setText("");
				edittext216.setText("");
				edittext208.setText("");
				edittext209.setText("");
				edittext202.setText("");
				edittext203.setText("");
				edittext206.setText("");
				edittext207.setText("");
				edittext211.setText("");
				edittext212.setText("");
				edittext213.setText("");
				edittext214.setText("");
				edittext219.setText("");
				edittext220.setText("");
				edittext221.setText("");
				edittext222.setText("");
				edittext223.setText("");
			}
		});
		
		textview607.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview607)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالحفار\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ \"\nبمعني أنه لم يتم استخدام هذه المعدة بالعمل")
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
		
		edittext205.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext205.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext226.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext226.setTextColor(0xFFE91E63);
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
		
		textview606.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview606)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد الحفارات\nالمستخدمة\nوفي حالة عدم استخدام الحفار يتم وضع القيمة = ٠\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ١ حفار \"")
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
		
		edittext204.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext204.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext226.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext226.setTextColor(0xFFE91E63);
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
		
		textview625.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview625)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالبلدوزر\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ \"\nبمعني أنه لم يتم استخدام هذه المعدة بالعمل")
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
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext232.setTextColor(0xFFE91E63);
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
		
		textview624.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview624)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد البلدوزرات\nالمستخدمة\nوفي حالة عدم استخدام البلدوزر يتم وضع القيمة = ٠\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ١ بلدوزر \"")
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
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext232.setTextColor(0xFFE91E63);
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
		
		textview614.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview614)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nاللودر\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ \"\nبمعني أنه لم يتم استخدام هذه المعدة بالعمل")
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
		
		edittext209.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext209.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext228.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext228.setTextColor(0xFFE91E63);
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
		
		textview613.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview613)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد اللودارات\nالمستخدمة\nوفي حالة عدم استخدام اللودر يتم وضع القيمة = ٠ لودر\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠ لودر \"")
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
		
		edittext208.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext208.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext228.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext228.setTextColor(0xFFE91E63);
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
		
		edittext203.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext203.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext225.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext225.setTextColor(0xFFE91E63);
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
		
		edittext202.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext202.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext239.setText(String.valueOf(00.00));
				edittext224.setText(String.valueOf(00.00));
				edittext225.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext239.setTextColor(0xFFE91E63);
				edittext224.setTextColor(0xFFE91E63);
				edittext225.setTextColor(0xFFE91E63);
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
		
		textview610.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview610)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالجريدر\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ \"\nبمعني أنه لم يتم استخدام هذه المعدة بالعمل")
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
		
		edittext207.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext207.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext227.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext227.setTextColor(0xFFE91E63);
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
		
		textview609.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview609)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد الجريدرات\nالمستخدمة\nوفي حالة عدم استخدام الجريدر يتم وضع القيمة = ٠\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠ \"\nبمعني أنه غير موجود أو غير أساسي لتنفيذ البند")
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
		
		edittext206.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext206.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext227.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext227.setTextColor(0xFFE91E63);
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
		
		textview619.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview619)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* سعر النقلة\nللتانك شامل\nتوريد المياه\n( جنيه / نقلة )\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ \"\nبمعني أنه لم يتم استخدام هذه المعدة بالعمل")
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
				edittext230.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext230.setTextColor(0xFFE91E63);
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
		
		textview618.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview618)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text(" عدد تنكات\nالمياه\nالمستخدمة\nوفي حالة عدم استخدام تنك المياه يتم وضع القيمة = ٠\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠ \"")
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
				edittext230.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext230.setTextColor(0xFFE91E63);
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
		
		textview622.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview622)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالهراس\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ \"\nبمعني أنه لم يتم استخدام هذه المعدة بالعمل")
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
		
		edittext214.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext214.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext231.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext231.setTextColor(0xFFE91E63);
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
		
		textview621.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview621)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد الهراسات\nالمستخدمة\nوفي حالة عدم استخدام الهراس يتم وضع القيمة = ٠\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ١ هراس \"")
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
		
		edittext213.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext213.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext231.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext231.setTextColor(0xFFE91E63);
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
		
		textview631.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview631)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالعامل\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ \"\nبمعني أنه لم يتم استخدام عمالة بالعمل")
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
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext234.setTextColor(0xFFE91E63);
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
		
		textview630.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview630)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد العمالة\nالمستخدم\nوفي حالة عدم الأحتياج للعماله يتم وضع القيمة = ٠ \n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ١ عامل \"")
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
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext234.setTextColor(0xFFE91E63);
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
		
		textview633.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview633)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("يومية\nالمعدة أو العمالة الأضافية\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠.٠٠ \"\nبمعني أنه لم يتم استخدام معدة أخرى أو عمالة أضافية بالعمل")
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
				edittext235.setText(String.valueOf(00.00));
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext235.setTextColor(0xFFE91E63);
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
		
		textview632.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccExcavationForRoadssActivity.this, textview632)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد المعدات الأخري أو العمالة الأضافية\n\" مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بأفتراضه بقيمة = ٠ \"")
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
				edittext237.setText(String.valueOf(00.00));
				edittext238.setText(String.valueOf(00.00));
				edittext235.setTextColor(0xFFE91E63);
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
				if ((((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0)))) || ((((edittext7.getText().toString().equals("") || edittext7.getText().toString().equals(".")) || (edittext7.getText().toString().equals("-") || (Double.parseDouble(edittext7.getText().toString()) < 0))) || ((edittext8.getText().toString().equals("") || edittext8.getText().toString().equals(".")) || (edittext8.getText().toString().equals("-") || (Double.parseDouble(edittext8.getText().toString()) < 0)))) || (((edittext202.getText().toString().equals("") || edittext202.getText().toString().equals(".")) || (edittext202.getText().toString().equals("-") || (Double.parseDouble(edittext202.getText().toString()) < 0))) || ((edittext203.getText().toString().equals("") || edittext203.getText().toString().equals(".")) || (edittext203.getText().toString().equals("-") || (Double.parseDouble(edittext203.getText().toString()) < 0)))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext204.getText().toString().equals("") || edittext204.getText().toString().equals(".")) || (edittext204.getText().toString().equals("-") || (Double.parseDouble(edittext204.getText().toString()) < 0))) {
						edittext204.setText(String.valueOf(1));
					}
					if ((edittext205.getText().toString().equals("") || edittext205.getText().toString().equals(".")) || (edittext205.getText().toString().equals("-") || (Double.parseDouble(edittext205.getText().toString()) < 0))) {
						edittext205.setText(String.valueOf(0));
					}
					edittext226.setText(String.valueOf(Double.parseDouble(edittext204.getText().toString()) * Double.parseDouble(edittext205.getText().toString())));
					edittext226.setTextColor(0xFF000000);
					if ((edittext215.getText().toString().equals("") || edittext215.getText().toString().equals(".")) || (edittext215.getText().toString().equals("-") || (Double.parseDouble(edittext215.getText().toString()) < 0))) {
						edittext215.setText(String.valueOf(1));
					}
					if ((edittext216.getText().toString().equals("") || edittext216.getText().toString().equals(".")) || (edittext216.getText().toString().equals("-") || (Double.parseDouble(edittext216.getText().toString()) < 0))) {
						edittext216.setText(String.valueOf(0));
					}
					edittext232.setText(String.valueOf(Double.parseDouble(edittext215.getText().toString()) * Double.parseDouble(edittext216.getText().toString())));
					edittext232.setTextColor(0xFF000000);
					if ((edittext208.getText().toString().equals("") || edittext208.getText().toString().equals(".")) || (edittext208.getText().toString().equals("-") || (Double.parseDouble(edittext208.getText().toString()) < 0))) {
						edittext208.setText(String.valueOf(0));
					}
					if (((edittext209.getText().toString().equals("") || edittext209.getText().toString().equals(".")) || edittext209.getText().toString().equals("-")) || (Double.parseDouble(edittext209.getText().toString()) < 0)) {
						edittext209.setText(String.valueOf(0));
					}
					edittext228.setText(String.valueOf(Double.parseDouble(edittext208.getText().toString()) * Double.parseDouble(edittext209.getText().toString())));
					edittext228.setTextColor(0xFF000000);
					edittext239.setText(String.valueOf(Double.parseDouble(edittext202.getText().toString()) - Double.parseDouble(edittext18.getText().toString())));
					edittext224.setText(String.valueOf(((Double.parseDouble(edittext202.getText().toString()) - Double.parseDouble(edittext18.getText().toString())) / Double.parseDouble(edittext18.getText().toString())) * 100));
					edittext225.setText(String.valueOf(Double.parseDouble(edittext202.getText().toString()) * Double.parseDouble(edittext203.getText().toString())));
					edittext239.setTextColor(0xFF000000);
					edittext224.setTextColor(0xFF000000);
					edittext225.setTextColor(0xFF000000);
					if ((edittext206.getText().toString().equals("") || edittext206.getText().toString().equals(".")) || (edittext206.getText().toString().equals("-") || (Double.parseDouble(edittext206.getText().toString()) < 0))) {
						edittext206.setText(String.valueOf(0));
					}
					if ((edittext207.getText().toString().equals("") || edittext207.getText().toString().equals(".")) || (edittext207.getText().toString().equals("-") || (Double.parseDouble(edittext207.getText().toString()) < 0))) {
						edittext207.setText(String.valueOf(0));
					}
					edittext227.setText(String.valueOf(Double.parseDouble(edittext206.getText().toString()) * Double.parseDouble(edittext207.getText().toString())));
					edittext227.setTextColor(0xFF000000);
					if ((edittext211.getText().toString().equals("") || edittext211.getText().toString().equals(".")) || (edittext211.getText().toString().equals("-") || (Double.parseDouble(edittext211.getText().toString()) < 0))) {
						edittext211.setText(String.valueOf(0));
					}
					if ((edittext212.getText().toString().equals("") || edittext212.getText().toString().equals(".")) || (edittext212.getText().toString().equals("-") || (Double.parseDouble(edittext212.getText().toString()) < 0))) {
						edittext212.setText(String.valueOf(0));
					}
					edittext230.setText(String.valueOf(Double.parseDouble(edittext211.getText().toString()) * Double.parseDouble(edittext212.getText().toString())));
					edittext230.setTextColor(0xFF000000);
					if ((edittext213.getText().toString().equals("") || edittext213.getText().toString().equals(".")) || (edittext213.getText().toString().equals("-") || (Double.parseDouble(edittext213.getText().toString()) < 0))) {
						edittext213.setText(String.valueOf(1));
					}
					if ((edittext214.getText().toString().equals("") || edittext214.getText().toString().equals(".")) || (edittext214.getText().toString().equals("-") || (Double.parseDouble(edittext214.getText().toString()) < 0))) {
						edittext214.setText(String.valueOf(0));
					}
					edittext231.setText(String.valueOf(Double.parseDouble(edittext213.getText().toString()) * Double.parseDouble(edittext214.getText().toString())));
					edittext231.setTextColor(0xFF000000);
					if ((edittext219.getText().toString().equals("") || edittext219.getText().toString().equals(".")) || (edittext219.getText().toString().equals("-") || (Double.parseDouble(edittext219.getText().toString()) < 0))) {
						edittext219.setText(String.valueOf(1));
					}
					if ((edittext220.getText().toString().equals("") || edittext220.getText().toString().equals(".")) || (edittext220.getText().toString().equals("-") || (Double.parseDouble(edittext220.getText().toString()) < 0))) {
						edittext220.setText(String.valueOf(0));
					}
					edittext234.setText(String.valueOf(Double.parseDouble(edittext219.getText().toString()) * Double.parseDouble(edittext220.getText().toString())));
					edittext234.setTextColor(0xFF000000);
					if ((edittext222.getText().toString().equals("") || edittext222.getText().toString().equals(".")) || (edittext222.getText().toString().equals("-") || (Double.parseDouble(edittext222.getText().toString()) < 0))) {
						edittext222.setText(String.valueOf(0));
					}
					if ((edittext223.getText().toString().equals("") || edittext223.getText().toString().equals(".")) || (edittext223.getText().toString().equals("-") || (Double.parseDouble(edittext223.getText().toString()) < 0))) {
						edittext223.setText(String.valueOf(0));
					}
					edittext235.setText(String.valueOf(Double.parseDouble(edittext222.getText().toString()) * Double.parseDouble(edittext223.getText().toString())));
					edittext235.setTextColor(0xFF000000);
					edittext237.setText(String.valueOf((((Double.parseDouble(edittext226.getText().toString()) + Double.parseDouble(edittext232.getText().toString())) + Double.parseDouble(edittext228.getText().toString())) + Double.parseDouble(edittext225.getText().toString())) + (((Double.parseDouble(edittext227.getText().toString()) + Double.parseDouble(edittext230.getText().toString())) + Double.parseDouble(edittext231.getText().toString())) + (Double.parseDouble(edittext234.getText().toString()) + Double.parseDouble(edittext235.getText().toString())))));
					edittext238.setText(String.valueOf(Double.parseDouble(edittext237.getText().toString()) / Double.parseDouble(edittext18.getText().toString())));
					edittext237.setTextColor(0xFFFFFFFF);
					edittext238.setTextColor(0xFF000000);
				}
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
		
		edittext239.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext239.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
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
				edittext224.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				        .on(ToipccExcavationForRoadssActivity.this, textview634)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* نسبة الأنتفاش الفعلية\nوهي نسبة الأنتفاش التي تحدث فعليآ بسبب  الحفر والتحميل والتعتيق وخلافه")
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
				edittext237.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 12)});
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
		
		_internet_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
		
		{
		}
		/*
linears الدينامك
*/
		hscroll70.setVisibility(View.GONE);
		linear888.setVisibility(View.GONE);
		linear152.setVisibility(View.GONE);
		/*
التكلفة
*/
		linear69.setVisibility(View.GONE);
		linear190.setVisibility(View.GONE);
		linear179.setVisibility(View.GONE);
		linear870.setVisibility(View.GONE);
		linear193.setVisibility(View.GONE);
		/*
التكلفة
*/
		textview55.setVisibility(View.GONE);
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
	public void _eip_d_soil1() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_pipe_line_linear = (LinearLayout) inflater.inflate(R.layout.toipqc_soil_works, null, false);
		dynamic_pipe_line.addView(dynamic_pipe_line_linear);
		/*
أولآ التعريفات
*/
		final LinearLayout linear19d = dynamic_pipe_line_linear.findViewById(R.id.linear19d);
		final TextView button2d = dynamic_pipe_line_linear.findViewById(R.id.button2d);
		final EditText edittext1d = dynamic_pipe_line_linear.findViewById(R.id.edittext1d);
		edittext1d.setSingleLine(true);
		edittext1d.setFocusableInTouchMode(true);
		final EditText edittext3d = dynamic_pipe_line_linear.findViewById(R.id.edittext3d);
		edittext3d.setSingleLine(true);
		edittext3d.setFocusableInTouchMode(true);
		final EditText edittext7d = dynamic_pipe_line_linear.findViewById(R.id.edittext7d);
		edittext7d.setSingleLine(true);
		edittext7d.setFocusableInTouchMode(true);
		final EditText edittext8d = dynamic_pipe_line_linear.findViewById(R.id.edittext8d);
		edittext8d.setSingleLine(true);
		edittext8d.setFocusableInTouchMode(true);
		final EditText edittext9d = dynamic_pipe_line_linear.findViewById(R.id.edittext9d);
		edittext9d.setSingleLine(true);
		edittext9d.setFocusableInTouchMode(true);
		final EditText edittext10d = dynamic_pipe_line_linear.findViewById(R.id.edittext10d);
		edittext10d.setSingleLine(true);
		edittext10d.setFocusableInTouchMode(true);
		final EditText edittext11d = dynamic_pipe_line_linear.findViewById(R.id.edittext11d);
		edittext11d.setSingleLine(true);
		edittext11d.setFocusableInTouchMode(true);
		final EditText edittext12d = dynamic_pipe_line_linear.findViewById(R.id.edittext12d);
		edittext12d.setSingleLine(true);
		edittext12d.setFocusableInTouchMode(true);
		final ImageView close = dynamic_pipe_line_linear.findViewById(R.id.close);
		/*
تعريفات مناسيب الفرعة وعمقها
*/
		final HorizontalScrollView hscroll8d = dynamic_pipe_line_linear.findViewById(R.id.hscroll8d);
		final HorizontalScrollView hscroll81d = dynamic_pipe_line_linear.findViewById(R.id.hscroll81d);
		final LinearLayout linear8d = dynamic_pipe_line_linear.findViewById(R.id.linear8d);
		final HorizontalScrollView hscroll82d = dynamic_pipe_line_linear.findViewById(R.id.hscroll82d);
		hscroll8d.setVisibility(View.GONE);
		hscroll81d.setVisibility(View.GONE);
		linear8d.setVisibility(View.GONE);
		hscroll82d.setVisibility(View.GONE);
		/*
طول واسم القطاع
*/
		final TextView textview1423d = dynamic_pipe_line_linear.findViewById(R.id.textview1423d);
		final TextView textview604d = dynamic_pipe_line_linear.findViewById(R.id.textview604d);
		final EditText edittext15d = dynamic_pipe_line_linear.findViewById(R.id.edittext15d);
		edittext15d.setSingleLine(true);
		edittext15d.setFocusableInTouchMode(true);
		textview604d.setText("اسم القطاع");
		textview1423d.setText("طول القطاع\n( م )");
		edittext15d.setBackgroundColor(0xFFBBDEFB);
		/*
متوسط منسوب الأرض الطبيعية
( م )
*/
		final TextView textview57d = dynamic_pipe_line_linear.findViewById(R.id.textview57d);
		final TextView textview58d = dynamic_pipe_line_linear.findViewById(R.id.textview58d);
		final EditText edittext6d = dynamic_pipe_line_linear.findViewById(R.id.edittext6d);
		edittext6d.setSingleLine(true);
		edittext6d.setFocusableInTouchMode(true);
		textview57d.setText("متوسط منسوب الأرض الطبيعية\n( م )");
		textview58d.setText("م");
		edittext6d.setBackgroundColor(0xFFBBDEFB);
		
		/*
متوسط منسوب قاع الحفر
( م )
*/
		final LinearLayout linear20d = dynamic_pipe_line_linear.findViewById(R.id.linear20d);
		final TextView textview59d = dynamic_pipe_line_linear.findViewById(R.id.textview59d);
		final TextView textview60d = dynamic_pipe_line_linear.findViewById(R.id.textview60d);
		final EditText edittext4d = dynamic_pipe_line_linear.findViewById(R.id.edittext4d);
		edittext4d.setSingleLine(true);
		edittext4d.setFocusableInTouchMode(true);
		linear20d.setVisibility(View.VISIBLE);
		textview59d.setText("متوسط منسوب قاع الحفر\n( م )");
		textview60d.setText("م");
		edittext4d.setBackgroundColor(0xFFBBDEFB);
		
		/*
* رفرفة الحفر من الجانب الأيسر للماسورة
( م )
*/
		final LinearLayout linear21d = dynamic_pipe_line_linear.findViewById(R.id.linear21d);
		final LinearLayout linear22d = dynamic_pipe_line_linear.findViewById(R.id.linear22d);
		linear21d.setVisibility(View.GONE);
		linear22d.setVisibility(View.GONE);
		/*
طول القطاع كناتج
*/
		final LinearLayout linear301d = dynamic_pipe_line_linear.findViewById(R.id.linear301d);
		final TextView textview54d = dynamic_pipe_line_linear.findViewById(R.id.textview54d);
		final HorizontalScrollView hscroll301d = dynamic_pipe_line_linear.findViewById(R.id.hscroll301d);
		linear301d.setVisibility(View.GONE);
		textview54d.setVisibility(View.GONE);
		hscroll301d.setVisibility(View.GONE);
		/*
عرض الحفر من الأسفل بقاع الحفر ( م )
*/
		final LinearLayout linear613d = dynamic_pipe_line_linear.findViewById(R.id.linear613d);
		final LinearLayout linear201d = dynamic_pipe_line_linear.findViewById(R.id.linear201d);
		linear201d.setVisibility(View.VISIBLE);
		linear613d.setVisibility(View.VISIBLE);
		final TextView textview613d = dynamic_pipe_line_linear.findViewById(R.id.textview613d);
		final TextView textview614d = dynamic_pipe_line_linear.findViewById(R.id.textview614d);
		final EditText edittext2d = dynamic_pipe_line_linear.findViewById(R.id.edittext2d);
		edittext2d.setSingleLine(true);
		edittext2d.setFocusableInTouchMode(true);
		textview613d.setText("عرض الحفر من الأسفل بقاع الحفر\n( م )");
		textview614d.setText("م");
		edittext2d.setBackgroundColor(0xFFBBDEFB);
		
		/*
مسطح قاع الحفر الأجمالي
( م٢ )
*/
		final LinearLayout linear23d = dynamic_pipe_line_linear.findViewById(R.id.linear23d);
		final TextView textview111d = dynamic_pipe_line_linear.findViewById(R.id.textview111d);
		final TextView textview511d = dynamic_pipe_line_linear.findViewById(R.id.textview511d);
		linear23d.setVisibility(View.VISIBLE);
		textview111d.setText("مساحة أو مسطح قاع الحفر\n( م٢ )");
		textview511d.setText("م٢");
		/*
 متوسط ارتفاع الحفر
( م )
*/
		final LinearLayout linear9d = dynamic_pipe_line_linear.findViewById(R.id.linear9d);
		final HorizontalScrollView hscroll83d = dynamic_pipe_line_linear.findViewById(R.id.hscroll83d);
		linear9d.setVisibility(View.VISIBLE);
		hscroll83d.setVisibility(View.VISIBLE);
		final TextView textview61d = dynamic_pipe_line_linear.findViewById(R.id.textview61d);
		final TextView textview62d = dynamic_pipe_line_linear.findViewById(R.id.textview62d);
		final EditText edittext199d = dynamic_pipe_line_linear.findViewById(R.id.edittext199d);
		edittext199d.setSingleLine(true);
		edittext199d.setFocusableInTouchMode(true);
		textview61d.setText(" متوسط ارتفاع الحفر\n( م )");
		textview62d.setText("م");
		/*
ملاحظة فرق المنسوب
*/
		final TextView textview55d = dynamic_pipe_line_linear.findViewById(R.id.textview55d);
		textview55d.setVisibility(View.GONE);
		/*
ثانيآ  :
أوامر الترقيم
*/
		final TextView textview3d = dynamic_pipe_line_linear.findViewById(R.id.textview3d);
		textview3d.setVisibility(View.GONE);
		final EditText element_num_d = dynamic_pipe_line_linear.findViewById(R.id.element_num_d);
		element_num_d.setSingleLine(true);
		element_num_d.setFocusableInTouchMode(true);
		final EditText element_nums_d = dynamic_pipe_line_linear.findViewById(R.id.element_nums_d);
		element_nums_d.setSingleLine(true);
		element_nums_d.setFocusableInTouchMode(true);
		element_num_d.setText(String.valueOf((long)(1 + dynamic_pipe_line.getChildCount())));
		element_nums_d.setText(String.valueOf((long)(1 + dynamic_pipe_line.getChildCount())));
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
ثانيآ  :
الأوامر
*/
		edittext2d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext2dnn = _param1.toString();
								
edittext2d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext9d.setText(String.valueOf(00.00));
				edittext9d.setTextColor(0xFFE91E63);
				edittext10d.setText(String.valueOf(00.00));
				edittext11d.setText(String.valueOf(00.00));
				edittext12d.setText(String.valueOf(00.00));
				edittext10d.setTextColor(0xFFE91E63);
				edittext11d.setTextColor(0xFFE91E63);
				edittext12d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext6d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext6dnn = _param1.toString();
								
edittext6d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext199d.setText(String.valueOf(00.00));
				edittext199d.setTextColor(0xFFE91E63);
				edittext10d.setText(String.valueOf(00.00));
				edittext11d.setText(String.valueOf(00.00));
				edittext12d.setText(String.valueOf(00.00));
				edittext10d.setTextColor(0xFFE91E63);
				edittext11d.setTextColor(0xFFE91E63);
				edittext12d.setTextColor(0xFFE91E63);
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
								
edittext4d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext199d.setText(String.valueOf(00.00));
				edittext199d.setTextColor(0xFFE91E63);
				edittext10d.setText(String.valueOf(00.00));
				edittext11d.setText(String.valueOf(00.00));
				edittext12d.setText(String.valueOf(00.00));
				edittext10d.setTextColor(0xFFE91E63);
				edittext11d.setTextColor(0xFFE91E63);
				edittext12d.setTextColor(0xFFE91E63);
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
				edittext10d.setText(String.valueOf(00.00));
				edittext11d.setText(String.valueOf(00.00));
				edittext12d.setText(String.valueOf(00.00));
				edittext10d.setTextColor(0xFFE91E63);
				edittext11d.setTextColor(0xFFE91E63);
				edittext12d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext8d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext8dnn = _param1.toString();
								
edittext8d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext10d.setText(String.valueOf(00.00));
				edittext11d.setText(String.valueOf(00.00));
				edittext12d.setText(String.valueOf(00.00));
				edittext10d.setTextColor(0xFFE91E63);
				edittext11d.setTextColor(0xFFE91E63);
				edittext12d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext15d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext15dnn = _param1.toString();
								
edittext15d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext9d.setText(String.valueOf(00.00));
				edittext9d.setTextColor(0xFFE91E63);
				edittext12d.setText(String.valueOf(00.00));
				edittext12d.setTextColor(0xFFE91E63);
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
				if ((((edittext2d.getText().toString().equals("") || edittext2d.getText().toString().equals(".")) || (edittext2d.getText().toString().equals("-") || (Double.parseDouble(edittext2d.getText().toString()) < 0))) || (((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) || ((edittext4d.getText().toString().equals("") || edittext4d.getText().toString().equals(".")) || (edittext4d.getText().toString().equals("-") || (Double.parseDouble(edittext4d.getText().toString()) < 0))))) || ((((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || edittext7d.getText().toString().equals("-")) || ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || edittext8d.getText().toString().equals("-"))) || ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					edittext9d.setText(String.valueOf(Double.parseDouble(edittext15d.getText().toString()) * Double.parseDouble(edittext2d.getText().toString())));
					edittext9d.setTextColor(0xFF000000);
					edittext199d.setText(String.valueOf(Double.parseDouble(edittext6d.getText().toString()) - Double.parseDouble(edittext4d.getText().toString())));
					edittext199d.setTextColor(0xFF000000);
					if (Double.parseDouble(edittext4d.getText().toString()) > Double.parseDouble(edittext6d.getText().toString())) {
						textview55d.setVisibility(View.VISIBLE);
						edittext10d.setText(String.valueOf(0.00d));
						edittext11d.setText(String.valueOf(0.00d));
						edittext12d.setText(String.valueOf(0.00d));
					}
					else {
						textview55d.setVisibility(View.GONE);
						if ((Double.parseDouble(edittext7d.getText().toString()) == 0) || (Double.parseDouble(edittext8d.getText().toString()) == 0)) {
							edittext10d.setText(String.valueOf(Double.parseDouble(edittext2d.getText().toString())));
						}
						else {
							edittext10d.setText(String.valueOf(((Double.parseDouble(edittext199d.getText().toString()) * (Double.parseDouble(edittext7d.getText().toString()) / Double.parseDouble(edittext8d.getText().toString()))) + Double.parseDouble(edittext2d.getText().toString())) + (Double.parseDouble(edittext199d.getText().toString()) * (Double.parseDouble(edittext7d.getText().toString()) / Double.parseDouble(edittext8d.getText().toString())))));
						}
						edittext11d.setText(String.valueOf(((Double.parseDouble(edittext2d.getText().toString()) + Double.parseDouble(edittext10d.getText().toString())) / 2) * Double.parseDouble(edittext199d.getText().toString())));
						edittext12d.setText(String.valueOf(Double.parseDouble(edittext15d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString())));
						edittext10d.setTextColor(0xFF000000);
						edittext11d.setTextColor(0xFF000000);
						edittext12d.setTextColor(0xFF000000);
					}
				}
			}
		});
		edittext199d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
		edittext9d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
		edittext10d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
		edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
		edittext12d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
		/*
إجمالي مساحة أو مسطح فاع الحفر ميكانيكي
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
					
					
				temp = 0;
				 for(int i=0; i<dynamic_pipe_line.getChildCount(); ++i) { 
					 View child=dynamic_pipe_line.getChildAt(i); 
					TextView tempo =child.findViewById(R.id.edittext9d);
					temp = temp + Double.parseDouble(tempo.getText().toString());
				}
				edittext14.setText(String.valueOf(temp));
			} });
		/*
إجمالي كميات الحفر ميكانيكي
*/
		edittext12d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				temp1 = 0;
				 for(int i=0; i<dynamic_pipe_line.getChildCount(); ++i) { 
					 View child=dynamic_pipe_line.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext12d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext16.setText(String.valueOf(temp1));
			} });
		/*
حذف عنصر الحفر
*/
		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_pipe_line_linear);
				temp = 0;
				 for(int i=0; i<dynamic_pipe_line.getChildCount(); ++i) { 
					 View child=dynamic_pipe_line.getChildAt(i); 
					TextView tempo =child.findViewById(R.id.edittext9d);
					temp = temp + Double.parseDouble(tempo.getText().toString());
				}
				edittext14.setText(String.valueOf(temp));
				temp1 = 0;
				 for(int i=0; i<dynamic_pipe_line.getChildCount(); ++i) { 
					 View child=dynamic_pipe_line.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext12d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext16.setText(String.valueOf(temp1));
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
		PrintHelper printHelper = new PrintHelper(ToipccExcavationForRoadssActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
}
