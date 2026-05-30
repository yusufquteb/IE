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


public class ToipccReinforcedconcreteWallssActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private String path = "";
	private double temp1 = 0;
	private double temp = 0;
	private double temp1a = 0;
	private double temp2b = 0;
	private double temp36c = 0;
	private double temp35c = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview1;
	private LinearLayout linear176;
	private LinearLayout linear2;
	private LinearLayout add_dynamic_wall_linear;
	private LinearLayout add_dynamic_element_lin;
	private TextView textview524;
	private LinearLayout dynamic_concrete_sum_linear;
	private LinearLayout linear75;
	private TextView textview519;
	private LinearLayout linear388;
	private TextView textview525;
	private LinearLayout linear255;
	private LinearLayout linear178;
	private LinearLayout linear140;
	private LinearLayout linear290;
	private LinearLayout linear301;
	private TextView textview554;
	private TextView textview578;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private TextView textview57;
	private TextView textview583;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private TextView textview585;
	private TextView textview584;
	private TextView textview808;
	private TextView textview809;
	private LinearLayout linear389;
	private LinearLayout linear3;
	private LinearLayout linear863;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear864;
	private LinearLayout linear4;
	private LinearLayout linear33;
	private LinearLayout linear866;
	private LinearLayout linear240;
	private TextView textview666;
	private TextView textview668;
	private TextView textview555;
	private TextView textview556;
	private LinearLayout linear867;
	private LinearLayout linear6;
	private LinearLayout linear13;
	private TextView textview2052;
	private LinearLayout add_dynamic_hole_linear;
	private LinearLayout linear74;
	private Button add_dynamic_hole;
	private HorizontalScrollView hscroll56;
	private TextView textview56;
	private LinearLayout linear183;
	private TextView textview18;
	private EditText element_nums;
	private TextView textview17;
	private TextView textview16;
	private EditText element_num;
	private TextView textview10;
	private TextView textview4;
	private EditText edittext1;
	private TextView textview14;
	private TextView L1;
	private TextView textview2044;
	private EditText edittext2;
	private TextView textview15;
	private TextView textview7;
	private LinearLayout linear34;
	private HorizontalScrollView hscroll82;
	private LinearLayout linear32;
	private LinearLayout linear35;
	private TextView textview33;
	private LinearLayout linear36;
	private TextView textview35;
	private LinearLayout linear865;
	private TextView textview34;
	private EditText edittext35;
	private TextView textview36;
	private LinearLayout linear869;
	private TextView textview37;
	private EditText edittext36;
	private TextView textview38;
	private EditText edittext32;
	private TextView textview2054;
	private TextView textview32;
	private TextView textview2048;
	private EditText edittext3;
	private TextView textview2047;
	private TextView textview11;
	private EditText edittext444;
	private Button button1;
	private TextView textview2049;
	private EditText edittext4;
	private TextView textview2050;
	private TextView textview2051;
	private TextView textview708;
	private EditText edittext5;
	private TextView textview13;
	private TextView textview12;
	private TextView textview705;
	private EditText edittext15;
	private TextView textview706;
	private TextView textview707;
	private TextView textview488;
	private EditText edittext20;
	private TextView textview489;
	private TextView textview487;
	private TextView textview1072;
	private Button add_dynamic_element;
	private TextView textview783;
	private EditText edittext21;
	private TextView textview784;
	private TextView textview785;
	private TextView textview527;
	private EditText total_concrete_sum;
	private TextView textview321;
	private TextView textview114;
	private TextView textview993;
	private LinearLayout linear349;
	private LinearLayout linear350;
	private LinearLayout linear383;
	private LinearLayout linear351;
	private TextView textview986;
	private EditText edittext122;
	private TextView textview987;
	private TextView textview988;
	private Button button99;
	private TextView textview989;
	private EditText edittext123;
	private TextView textview990;
	private TextView textview991;
	private TextView textview733;
	private LinearLayout linear336;
	private LinearLayout linear256;
	private LinearLayout linear337;
	private Button button95;
	private TextView textview944;
	private Button button96;
	private Button button68;
	private TextView textview734;
	private Button button67;
	private Button button97;
	private TextView textview945;
	private Button button98;
	private TextView textview810;
	private TextView textview811;
	private TextView textview714;
	private HorizontalScrollView hscroll20;
	private LinearLayout linear111;
	private LinearLayout linear253;
	private LinearLayout linear252;
	private TextView textview994;
	private TextView textview995;
	private LinearLayout linear348;
	private LinearLayout linear352;
	private LinearLayout linear353;
	private LinearLayout linear354;
	private TextView textview715;
	private TextView textview716;
	private HorizontalScrollView hscroll40;
	private LinearLayout linear108;
	private LinearLayout linear355;
	private Button button101;
	private LinearLayout linear248;
	private LinearLayout linear342;
	private LinearLayout linear254;
	private TextView textview981;
	private LinearLayout linear110;
	private LinearLayout linear249;
	private LinearLayout linear356;
	private LinearLayout linear357;
	private LinearLayout linear250;
	private LinearLayout linear343;
	private TextView textview717;
	private LinearLayout linear251;
	private HorizontalScrollView hscroll39;
	private LinearLayout linear115;
	private TextView textview467;
	private EditText edittext52;
	private TextView textview286;
	private TextView textview530;
	private Button button66;
	private TextView textview730;
	private EditText edittext53;
	private TextView textview731;
	private TextView textview732;
	private TextView textview996;
	private EditText edittext124;
	private TextView textview997;
	private TextView textview998;
	private Button button100;
	private TextView textview999;
	private EditText edittext126;
	private TextView textview1000;
	private TextView textview1001;
	private TextView textview322;
	private EditText edittext54;
	private TextView textview309;
	private TextView textview310;
	private TextView textview1004;
	private EditText edittext130;
	private TextView textview1002;
	private TextView textview1003;
	private TextView textview323;
	private EditText edittext55;
	private TextView textview718;
	private TextView textview719;
	private TextView textview963;
	private EditText edittext116;
	private TextView textview964;
	private TextView textview965;
	private Button button65;
	private TextView textview324;
	private EditText edittext56;
	private TextView textview314;
	private TextView textview315;
	private TextView textview720;
	private EditText edittext57;
	private TextView textview721;
	private TextView textview722;
	private TextView textview1009;
	private EditText edittext127;
	private TextView textview1005;
	private TextView textview1006;
	private TextView textview1010;
	private EditText edittext131;
	private TextView textview1007;
	private TextView textview1008;
	private TextView textview325;
	private EditText edittext58;
	private TextView textview723;
	private TextView textview724;
	private TextView textview966;
	private EditText edittext117;
	private TextView textview967;
	private TextView textview968;
	private TextView textview326;
	private EditText edittext59;
	private TextView textview725;
	private TextView textview726;
	private TextView textview727;
	private EditText edittext60;
	private TextView textview728;
	private TextView textview729;
	private TextView textview812;
	private TextView textview813;
	private TextView textview307;
	private LinearLayout linear141;
	private LinearLayout linear118;
	private LinearLayout linear120;
	private LinearLayout linear122;
	private LinearLayout linear125;
	private LinearLayout linear358;
	private LinearLayout linear116;
	private TextView textview982;
	private LinearLayout linear785;
	private LinearLayout linear786;
	private LinearLayout linear153;
	private LinearLayout linear149;
	private LinearLayout linear363;
	private TextView textview328;
	private TextView textview376;
	private LinearLayout linear113;
	private LinearLayout linear119;
	private Button button102;
	private LinearLayout linear121;
	private Button button104;
	private LinearLayout linear123;
	private Button button105;
	private LinearLayout linear124;
	private LinearLayout linear364;
	private Button button106;
	private LinearLayout linear109;
	private LinearLayout linear344;
	private LinearLayout linear247;
	private TextView textview983;
	private LinearLayout linear142;
	private LinearLayout linear152;
	private LinearLayout linear143;
	private LinearLayout linear862;
	private LinearLayout linear158;
	private LinearLayout linear145;
	private LinearLayout linear365;
	private LinearLayout linear91;
	private LinearLayout linear345;
	private TextView textview308;
	private LinearLayout linear95;
	private HorizontalScrollView hscroll51;
	private LinearLayout linear131;
	private TextView textview950;
	private EditText edittext61;
	private TextView textview334;
	private TextView textview335;
	private TextView textview951;
	private EditText edittext62;
	private TextView textview339;
	private TextView textview340;
	private TextView textview952;
	private EditText edittext63;
	private TextView textview343;
	private TextView textview344;
	private TextView textview953;
	private EditText edittext64;
	private TextView textview349;
	private TextView textview350;
	private TextView textview1013;
	private EditText edittext132;
	private TextView textview1011;
	private TextView textview1012;
	private Button button82;
	private LinearLayout linear391;
	private HorizontalScrollView hscroll70;
	private LinearLayout linear756;
	private HorizontalScrollView hscroll79;
	private LinearLayout linear755;
	private TextView textview1073;
	private EditText edittext65;
	private TextView textview1074;
	private TextView textview1075;
	private TextView textview1433;
	private EditText edittext41;
	private TextView textview1418;
	private TextView textview1419;
	private TextView textview1416;
	private TextView textview1417;
	private LinearLayout linear757;
	private TextView textview1420;
	private EditText edittext42;
	private LinearLayout linear791;
	private HorizontalScrollView hscroll80;
	private LinearLayout linear787;
	private HorizontalScrollView hscroll81;
	private LinearLayout linear788;
	private TextView textview1443;
	private EditText edittext66;
	private TextView textview1444;
	private TextView textview1445;
	private TextView textview1434;
	private EditText edittext44;
	private TextView textview1435;
	private TextView textview1436;
	private TextView textview1437;
	private TextView textview1438;
	private LinearLayout linear789;
	private TextView textview1439;
	private EditText edittext45;
	private TextView textview531;
	private TextView textview532;
	private LinearLayout linear151;
	private LinearLayout linear148;
	private LinearLayout linear150;
	private TextView textview538;
	private TextView textview533;
	private LinearLayout linear154;
	private LinearLayout linear156;
	private LinearLayout linear157;
	private TextView textview793;
	private EditText edittext67;
	private TextView textview534;
	private TextView textview535;
	private TextView textview794;
	private EditText edittext68;
	private TextView textview381;
	private TextView textview382;
	private TextView textview795;
	private EditText edittext69;
	private TextView textview528;
	private TextView textview529;
	private TextView textview796;
	private EditText edittext70;
	private TextView textview536;
	private TextView textview537;
	private TextView textview797;
	private EditText edittext71;
	private TextView textview541;
	private TextView textview542;
	private TextView textview798;
	private EditText edittext72;
	private TextView textview543;
	private TextView textview544;
	private TextView textview799;
	private EditText edittext73;
	private TextView textview383;
	private TextView textview384;
	private TextView textview1021;
	private EditText edittext133;
	private TextView textview1022;
	private TextView textview1023;
	private TextView textview800;
	private EditText edittext74;
	private TextView textview336;
	private TextView textview337;
	private TextView textview801;
	private EditText edittext75;
	private TextView textview341;
	private TextView textview342;
	private TextView textview802;
	private EditText edittext76;
	private TextView textview345;
	private TextView textview346;
	private TextView textview803;
	private EditText edittext77;
	private TextView textview347;
	private TextView textview348;
	private TextView textview1026;
	private EditText edittext134;
	private TextView textview1024;
	private TextView textview1025;
	private TextView textview804;
	private EditText edittext78;
	private TextView textview312;
	private TextView textview313;
	private TextView textview969;
	private EditText edittext118;
	private TextView textview970;
	private TextView textview971;
	private Button button15;
	private TextView textview788;
	private EditText edittext79;
	private TextView textview368;
	private TextView textview369;
	private TextView textview629;
	private EditText edittext193;
	private TextView textview630;
	private TextView textview631;
	private TextView textview789;
	private EditText edittext80;
	private TextView textview370;
	private TextView textview371;
	private TextView textview2041;
	private EditText edittext194;
	private TextView textview2042;
	private TextView textview2043;
	private TextView textview546;
	private TextView textview547;
	private LinearLayout linear160;
	private TextView textview548;
	private TextView textview549;
	private LinearLayout linear144;
	private TextView textview790;
	private EditText edittext81;
	private TextView textview550;
	private TextView textview551;
	private TextView textview805;
	private EditText edittext82;
	private TextView textview372;
	private TextView textview373;
	private TextView textview806;
	private EditText edittext83;
	private TextView textview374;
	private TextView textview375;
	private TextView textview1027;
	private LinearLayout linear366;
	private LinearLayout linear368;
	private TextView textview1028;
	private EditText edittext135;
	private TextView textview1029;
	private TextView textview1030;
	private TextView textview1031;
	private EditText edittext136;
	private TextView textview1032;
	private TextView textview1033;
	private TextView textview807;
	private EditText edittext84;
	private TextView textview287;
	private TextView textview316;
	private TextView textview972;
	private EditText edittext119;
	private TextView textview973;
	private TextView textview974;
	private TextView textview552;
	private EditText edittext85;
	private TextView textview319;
	private TextView textview320;
	private TextView textview553;
	private EditText edittext86;
	private TextView textview539;
	private TextView textview540;
	private TextView textview845;
	private TextView textview814;
	private HorizontalScrollView hscroll44;
	private LinearLayout linear297;
	private LinearLayout linear373;
	private LinearLayout linear299;
	private HorizontalScrollView hscroll19;
	private HorizontalScrollView hscroll45;
	private HorizontalScrollView hscroll62;
	private HorizontalScrollView hscroll63;
	private TextView textview815;
	private TextView textview816;
	private HorizontalScrollView hscroll57;
	private LinearLayout linear291;
	private LinearLayout linear374;
	private Button button113;
	private LinearLayout linear292;
	private LinearLayout linear346;
	private LinearLayout linear300;
	private TextView textview984;
	private LinearLayout linear293;
	private LinearLayout linear375;
	private LinearLayout linear294;
	private LinearLayout linear347;
	private TextView textview817;
	private LinearLayout linear296;
	private TextView textview839;
	private EditText edittext87;
	private TextView textview840;
	private TextView textview841;
	private TextView textview1043;
	private EditText edittext137;
	private TextView textview1041;
	private TextView textview1042;
	private Button button92;
	private LinearLayout linear338;
	private TextView textview949;
	private TextView textview946;
	private EditText edittext112;
	private TextView textview947;
	private TextView textview948;
	private LinearLayout linear298;
	private TextView textview842;
	private TextView textview847;
	private EditText edittext88;
	private TextView textview843;
	private TextView textview844;
	private LinearLayout linear370;
	private TextView textview1044;
	private TextView textview1035;
	private EditText edittext138;
	private TextView textview1036;
	private TextView textview1037;
	private LinearLayout linear372;
	private TextView textview1034;
	private TextView textview1038;
	private EditText edittext139;
	private TextView textview1039;
	private TextView textview1040;
	private TextView textview818;
	private EditText edittext89;
	private TextView textview819;
	private TextView textview820;
	private TextView textview1047;
	private EditText edittext140;
	private TextView textview1045;
	private TextView textview1046;
	private TextView textview821;
	private EditText edittext90;
	private TextView textview822;
	private TextView textview823;
	private TextView textview975;
	private EditText edittext120;
	private TextView textview976;
	private TextView textview977;
	private Button button91;
	private TextView textview824;
	private EditText edittext91;
	private TextView textview825;
	private TextView textview826;
	private TextView textview1048;
	private EditText edittext141;
	private TextView textview1049;
	private TextView textview1050;
	private TextView textview830;
	private EditText edittext92;
	private TextView textview831;
	private TextView textview832;
	private TextView textview978;
	private EditText edittext121;
	private TextView textview979;
	private TextView textview980;
	private TextView textview836;
	private EditText edittext93;
	private TextView textview837;
	private TextView textview838;
	private TextView textview848;
	private TextView textview849;
	private TextView textview850;
	private LinearLayout linear302;
	private LinearLayout linear303;
	private LinearLayout linear304;
	private LinearLayout linear305;
	private LinearLayout linear306;
	private LinearLayout linear376;
	private LinearLayout linear341;
	private TextView textview851;
	private TextView textview852;
	private LinearLayout linear312;
	private LinearLayout linear313;
	private Button button114;
	private LinearLayout linear314;
	private Button button115;
	private LinearLayout linear315;
	private Button button116;
	private LinearLayout linear316;
	private LinearLayout linear379;
	private Button button117;
	private LinearLayout linear317;
	private LinearLayout linear339;
	private LinearLayout linear318;
	private TextView textview985;
	private HorizontalScrollView hscroll59;
	private LinearLayout linear319;
	private HorizontalScrollView hscroll60;
	private LinearLayout linear320;
	private HorizontalScrollView hscroll61;
	private LinearLayout linear332;
	private LinearLayout linear322;
	private HorizontalScrollView hscroll64;
	private HorizontalScrollView hscroll65;
	private LinearLayout linear381;
	private LinearLayout linear323;
	private LinearLayout linear340;
	private TextView textview853;
	private LinearLayout linear325;
	private TextView textview862;
	private EditText edittext94;
	private TextView textview854;
	private TextView textview855;
	private TextView textview865;
	private EditText edittext95;
	private TextView textview856;
	private TextView textview857;
	private TextView textview878;
	private EditText edittext96;
	private TextView textview858;
	private TextView textview859;
	private TextView textview890;
	private EditText edittext97;
	private TextView textview860;
	private TextView textview861;
	private TextView textview1053;
	private EditText edittext142;
	private TextView textview1051;
	private TextView textview1052;
	private TextView textview960;
	private EditText edittext115;
	private TextView textview961;
	private TextView textview962;
	private TextView textview893;
	private EditText edittext98;
	private TextView textview894;
	private TextView textview895;
	private TextView textview896;
	private EditText edittext99;
	private TextView textview897;
	private TextView textview898;
	private TextView textview899;
	private EditText edittext100;
	private TextView textview900;
	private TextView textview901;
	private TextView textview902;
	private EditText edittext101;
	private TextView textview903;
	private TextView textview904;
	private TextView textview1061;
	private EditText edittext143;
	private TextView textview1059;
	private TextView textview1060;
	private TextView textview905;
	private EditText edittext102;
	private TextView textview906;
	private TextView textview907;
	private TextView textview954;
	private EditText edittext113;
	private TextView textview955;
	private TextView textview956;
	private Button button94;
	private LinearLayout linear334;
	private TextView textview939;
	private TextView textview938;
	private EditText edittext104;
	private TextView textview936;
	private TextView textview937;
	private TextView textview908;
	private EditText edittext103;
	private TextView textview909;
	private TextView textview910;
	private LinearLayout linear335;
	private TextView textview940;
	private TextView textview941;
	private EditText edittext106;
	private TextView textview942;
	private TextView textview943;
	private TextView textview911;
	private EditText edittext105;
	private TextView textview912;
	private TextView textview913;
	private LinearLayout linear333;
	private TextView textview914;
	private TextView textview921;
	private EditText edittext108;
	private TextView textview922;
	private TextView textview923;
	private TextView textview918;
	private EditText edittext107;
	private TextView textview919;
	private TextView textview920;
	private TextView textview924;
	private EditText edittext109;
	private TextView textview925;
	private TextView textview926;
	private LinearLayout linear377;
	private TextView textview1069;
	private TextView textview1054;
	private EditText edittext144;
	private TextView textview1055;
	private TextView textview1056;
	private LinearLayout linear380;
	private TextView textview1068;
	private TextView textview1062;
	private EditText edittext145;
	private TextView textview1063;
	private TextView textview1064;
	private TextView textview1065;
	private EditText edittext146;
	private TextView textview1066;
	private TextView textview1067;
	private TextView textview927;
	private EditText edittext110;
	private TextView textview928;
	private TextView textview929;
	private TextView textview957;
	private EditText edittext114;
	private TextView textview958;
	private TextView textview959;
	private TextView textview933;
	private EditText edittext111;
	private TextView textview934;
	private TextView textview935;
	
	private Intent price = new Intent();
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_reinforcedconcrete_wallss);
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
		linear2 = findViewById(R.id.linear2);
		add_dynamic_wall_linear = findViewById(R.id.add_dynamic_wall_linear);
		add_dynamic_element_lin = findViewById(R.id.add_dynamic_element_lin);
		textview524 = findViewById(R.id.textview524);
		dynamic_concrete_sum_linear = findViewById(R.id.dynamic_concrete_sum_linear);
		linear75 = findViewById(R.id.linear75);
		textview519 = findViewById(R.id.textview519);
		linear388 = findViewById(R.id.linear388);
		textview525 = findViewById(R.id.textview525);
		linear255 = findViewById(R.id.linear255);
		linear178 = findViewById(R.id.linear178);
		linear140 = findViewById(R.id.linear140);
		linear290 = findViewById(R.id.linear290);
		linear301 = findViewById(R.id.linear301);
		textview554 = findViewById(R.id.textview554);
		textview578 = findViewById(R.id.textview578);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		textview57 = findViewById(R.id.textview57);
		textview583 = findViewById(R.id.textview583);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		textview808 = findViewById(R.id.textview808);
		textview809 = findViewById(R.id.textview809);
		linear389 = findViewById(R.id.linear389);
		linear3 = findViewById(R.id.linear3);
		linear863 = findViewById(R.id.linear863);
		hscroll1 = findViewById(R.id.hscroll1);
		linear864 = findViewById(R.id.linear864);
		linear4 = findViewById(R.id.linear4);
		linear33 = findViewById(R.id.linear33);
		linear866 = findViewById(R.id.linear866);
		linear240 = findViewById(R.id.linear240);
		textview666 = findViewById(R.id.textview666);
		textview668 = findViewById(R.id.textview668);
		textview555 = findViewById(R.id.textview555);
		textview556 = findViewById(R.id.textview556);
		linear867 = findViewById(R.id.linear867);
		linear6 = findViewById(R.id.linear6);
		linear13 = findViewById(R.id.linear13);
		textview2052 = findViewById(R.id.textview2052);
		add_dynamic_hole_linear = findViewById(R.id.add_dynamic_hole_linear);
		linear74 = findViewById(R.id.linear74);
		add_dynamic_hole = findViewById(R.id.add_dynamic_hole);
		hscroll56 = findViewById(R.id.hscroll56);
		textview56 = findViewById(R.id.textview56);
		linear183 = findViewById(R.id.linear183);
		textview18 = findViewById(R.id.textview18);
		element_nums = findViewById(R.id.element_nums);
		textview17 = findViewById(R.id.textview17);
		textview16 = findViewById(R.id.textview16);
		element_num = findViewById(R.id.element_num);
		textview10 = findViewById(R.id.textview10);
		textview4 = findViewById(R.id.textview4);
		edittext1 = findViewById(R.id.edittext1);
		textview14 = findViewById(R.id.textview14);
		L1 = findViewById(R.id.L1);
		textview2044 = findViewById(R.id.textview2044);
		edittext2 = findViewById(R.id.edittext2);
		textview15 = findViewById(R.id.textview15);
		textview7 = findViewById(R.id.textview7);
		linear34 = findViewById(R.id.linear34);
		hscroll82 = findViewById(R.id.hscroll82);
		linear32 = findViewById(R.id.linear32);
		linear35 = findViewById(R.id.linear35);
		textview33 = findViewById(R.id.textview33);
		linear36 = findViewById(R.id.linear36);
		textview35 = findViewById(R.id.textview35);
		linear865 = findViewById(R.id.linear865);
		textview34 = findViewById(R.id.textview34);
		edittext35 = findViewById(R.id.edittext35);
		textview36 = findViewById(R.id.textview36);
		linear869 = findViewById(R.id.linear869);
		textview37 = findViewById(R.id.textview37);
		edittext36 = findViewById(R.id.edittext36);
		textview38 = findViewById(R.id.textview38);
		edittext32 = findViewById(R.id.edittext32);
		textview2054 = findViewById(R.id.textview2054);
		textview32 = findViewById(R.id.textview32);
		textview2048 = findViewById(R.id.textview2048);
		edittext3 = findViewById(R.id.edittext3);
		textview2047 = findViewById(R.id.textview2047);
		textview11 = findViewById(R.id.textview11);
		edittext444 = findViewById(R.id.edittext444);
		button1 = findViewById(R.id.button1);
		textview2049 = findViewById(R.id.textview2049);
		edittext4 = findViewById(R.id.edittext4);
		textview2050 = findViewById(R.id.textview2050);
		textview2051 = findViewById(R.id.textview2051);
		textview708 = findViewById(R.id.textview708);
		edittext5 = findViewById(R.id.edittext5);
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		textview705 = findViewById(R.id.textview705);
		edittext15 = findViewById(R.id.edittext15);
		textview706 = findViewById(R.id.textview706);
		textview707 = findViewById(R.id.textview707);
		textview488 = findViewById(R.id.textview488);
		edittext20 = findViewById(R.id.edittext20);
		textview489 = findViewById(R.id.textview489);
		textview487 = findViewById(R.id.textview487);
		textview1072 = findViewById(R.id.textview1072);
		add_dynamic_element = findViewById(R.id.add_dynamic_element);
		textview783 = findViewById(R.id.textview783);
		edittext21 = findViewById(R.id.edittext21);
		textview784 = findViewById(R.id.textview784);
		textview785 = findViewById(R.id.textview785);
		textview527 = findViewById(R.id.textview527);
		total_concrete_sum = findViewById(R.id.total_concrete_sum);
		textview321 = findViewById(R.id.textview321);
		textview114 = findViewById(R.id.textview114);
		textview993 = findViewById(R.id.textview993);
		linear349 = findViewById(R.id.linear349);
		linear350 = findViewById(R.id.linear350);
		linear383 = findViewById(R.id.linear383);
		linear351 = findViewById(R.id.linear351);
		textview986 = findViewById(R.id.textview986);
		edittext122 = findViewById(R.id.edittext122);
		textview987 = findViewById(R.id.textview987);
		textview988 = findViewById(R.id.textview988);
		button99 = findViewById(R.id.button99);
		textview989 = findViewById(R.id.textview989);
		edittext123 = findViewById(R.id.edittext123);
		textview990 = findViewById(R.id.textview990);
		textview991 = findViewById(R.id.textview991);
		textview733 = findViewById(R.id.textview733);
		linear336 = findViewById(R.id.linear336);
		linear256 = findViewById(R.id.linear256);
		linear337 = findViewById(R.id.linear337);
		button95 = findViewById(R.id.button95);
		textview944 = findViewById(R.id.textview944);
		button96 = findViewById(R.id.button96);
		button68 = findViewById(R.id.button68);
		textview734 = findViewById(R.id.textview734);
		button67 = findViewById(R.id.button67);
		button97 = findViewById(R.id.button97);
		textview945 = findViewById(R.id.textview945);
		button98 = findViewById(R.id.button98);
		textview810 = findViewById(R.id.textview810);
		textview811 = findViewById(R.id.textview811);
		textview714 = findViewById(R.id.textview714);
		hscroll20 = findViewById(R.id.hscroll20);
		linear111 = findViewById(R.id.linear111);
		linear253 = findViewById(R.id.linear253);
		linear252 = findViewById(R.id.linear252);
		textview994 = findViewById(R.id.textview994);
		textview995 = findViewById(R.id.textview995);
		linear348 = findViewById(R.id.linear348);
		linear352 = findViewById(R.id.linear352);
		linear353 = findViewById(R.id.linear353);
		linear354 = findViewById(R.id.linear354);
		textview715 = findViewById(R.id.textview715);
		textview716 = findViewById(R.id.textview716);
		hscroll40 = findViewById(R.id.hscroll40);
		linear108 = findViewById(R.id.linear108);
		linear355 = findViewById(R.id.linear355);
		button101 = findViewById(R.id.button101);
		linear248 = findViewById(R.id.linear248);
		linear342 = findViewById(R.id.linear342);
		linear254 = findViewById(R.id.linear254);
		textview981 = findViewById(R.id.textview981);
		linear110 = findViewById(R.id.linear110);
		linear249 = findViewById(R.id.linear249);
		linear356 = findViewById(R.id.linear356);
		linear357 = findViewById(R.id.linear357);
		linear250 = findViewById(R.id.linear250);
		linear343 = findViewById(R.id.linear343);
		textview717 = findViewById(R.id.textview717);
		linear251 = findViewById(R.id.linear251);
		hscroll39 = findViewById(R.id.hscroll39);
		linear115 = findViewById(R.id.linear115);
		textview467 = findViewById(R.id.textview467);
		edittext52 = findViewById(R.id.edittext52);
		textview286 = findViewById(R.id.textview286);
		textview530 = findViewById(R.id.textview530);
		button66 = findViewById(R.id.button66);
		textview730 = findViewById(R.id.textview730);
		edittext53 = findViewById(R.id.edittext53);
		textview731 = findViewById(R.id.textview731);
		textview732 = findViewById(R.id.textview732);
		textview996 = findViewById(R.id.textview996);
		edittext124 = findViewById(R.id.edittext124);
		textview997 = findViewById(R.id.textview997);
		textview998 = findViewById(R.id.textview998);
		button100 = findViewById(R.id.button100);
		textview999 = findViewById(R.id.textview999);
		edittext126 = findViewById(R.id.edittext126);
		textview1000 = findViewById(R.id.textview1000);
		textview1001 = findViewById(R.id.textview1001);
		textview322 = findViewById(R.id.textview322);
		edittext54 = findViewById(R.id.edittext54);
		textview309 = findViewById(R.id.textview309);
		textview310 = findViewById(R.id.textview310);
		textview1004 = findViewById(R.id.textview1004);
		edittext130 = findViewById(R.id.edittext130);
		textview1002 = findViewById(R.id.textview1002);
		textview1003 = findViewById(R.id.textview1003);
		textview323 = findViewById(R.id.textview323);
		edittext55 = findViewById(R.id.edittext55);
		textview718 = findViewById(R.id.textview718);
		textview719 = findViewById(R.id.textview719);
		textview963 = findViewById(R.id.textview963);
		edittext116 = findViewById(R.id.edittext116);
		textview964 = findViewById(R.id.textview964);
		textview965 = findViewById(R.id.textview965);
		button65 = findViewById(R.id.button65);
		textview324 = findViewById(R.id.textview324);
		edittext56 = findViewById(R.id.edittext56);
		textview314 = findViewById(R.id.textview314);
		textview315 = findViewById(R.id.textview315);
		textview720 = findViewById(R.id.textview720);
		edittext57 = findViewById(R.id.edittext57);
		textview721 = findViewById(R.id.textview721);
		textview722 = findViewById(R.id.textview722);
		textview1009 = findViewById(R.id.textview1009);
		edittext127 = findViewById(R.id.edittext127);
		textview1005 = findViewById(R.id.textview1005);
		textview1006 = findViewById(R.id.textview1006);
		textview1010 = findViewById(R.id.textview1010);
		edittext131 = findViewById(R.id.edittext131);
		textview1007 = findViewById(R.id.textview1007);
		textview1008 = findViewById(R.id.textview1008);
		textview325 = findViewById(R.id.textview325);
		edittext58 = findViewById(R.id.edittext58);
		textview723 = findViewById(R.id.textview723);
		textview724 = findViewById(R.id.textview724);
		textview966 = findViewById(R.id.textview966);
		edittext117 = findViewById(R.id.edittext117);
		textview967 = findViewById(R.id.textview967);
		textview968 = findViewById(R.id.textview968);
		textview326 = findViewById(R.id.textview326);
		edittext59 = findViewById(R.id.edittext59);
		textview725 = findViewById(R.id.textview725);
		textview726 = findViewById(R.id.textview726);
		textview727 = findViewById(R.id.textview727);
		edittext60 = findViewById(R.id.edittext60);
		textview728 = findViewById(R.id.textview728);
		textview729 = findViewById(R.id.textview729);
		textview812 = findViewById(R.id.textview812);
		textview813 = findViewById(R.id.textview813);
		textview307 = findViewById(R.id.textview307);
		linear141 = findViewById(R.id.linear141);
		linear118 = findViewById(R.id.linear118);
		linear120 = findViewById(R.id.linear120);
		linear122 = findViewById(R.id.linear122);
		linear125 = findViewById(R.id.linear125);
		linear358 = findViewById(R.id.linear358);
		linear116 = findViewById(R.id.linear116);
		textview982 = findViewById(R.id.textview982);
		linear785 = findViewById(R.id.linear785);
		linear786 = findViewById(R.id.linear786);
		linear153 = findViewById(R.id.linear153);
		linear149 = findViewById(R.id.linear149);
		linear363 = findViewById(R.id.linear363);
		textview328 = findViewById(R.id.textview328);
		textview376 = findViewById(R.id.textview376);
		linear113 = findViewById(R.id.linear113);
		linear119 = findViewById(R.id.linear119);
		button102 = findViewById(R.id.button102);
		linear121 = findViewById(R.id.linear121);
		button104 = findViewById(R.id.button104);
		linear123 = findViewById(R.id.linear123);
		button105 = findViewById(R.id.button105);
		linear124 = findViewById(R.id.linear124);
		linear364 = findViewById(R.id.linear364);
		button106 = findViewById(R.id.button106);
		linear109 = findViewById(R.id.linear109);
		linear344 = findViewById(R.id.linear344);
		linear247 = findViewById(R.id.linear247);
		textview983 = findViewById(R.id.textview983);
		linear142 = findViewById(R.id.linear142);
		linear152 = findViewById(R.id.linear152);
		linear143 = findViewById(R.id.linear143);
		linear862 = findViewById(R.id.linear862);
		linear158 = findViewById(R.id.linear158);
		linear145 = findViewById(R.id.linear145);
		linear365 = findViewById(R.id.linear365);
		linear91 = findViewById(R.id.linear91);
		linear345 = findViewById(R.id.linear345);
		textview308 = findViewById(R.id.textview308);
		linear95 = findViewById(R.id.linear95);
		hscroll51 = findViewById(R.id.hscroll51);
		linear131 = findViewById(R.id.linear131);
		textview950 = findViewById(R.id.textview950);
		edittext61 = findViewById(R.id.edittext61);
		textview334 = findViewById(R.id.textview334);
		textview335 = findViewById(R.id.textview335);
		textview951 = findViewById(R.id.textview951);
		edittext62 = findViewById(R.id.edittext62);
		textview339 = findViewById(R.id.textview339);
		textview340 = findViewById(R.id.textview340);
		textview952 = findViewById(R.id.textview952);
		edittext63 = findViewById(R.id.edittext63);
		textview343 = findViewById(R.id.textview343);
		textview344 = findViewById(R.id.textview344);
		textview953 = findViewById(R.id.textview953);
		edittext64 = findViewById(R.id.edittext64);
		textview349 = findViewById(R.id.textview349);
		textview350 = findViewById(R.id.textview350);
		textview1013 = findViewById(R.id.textview1013);
		edittext132 = findViewById(R.id.edittext132);
		textview1011 = findViewById(R.id.textview1011);
		textview1012 = findViewById(R.id.textview1012);
		button82 = findViewById(R.id.button82);
		linear391 = findViewById(R.id.linear391);
		hscroll70 = findViewById(R.id.hscroll70);
		linear756 = findViewById(R.id.linear756);
		hscroll79 = findViewById(R.id.hscroll79);
		linear755 = findViewById(R.id.linear755);
		textview1073 = findViewById(R.id.textview1073);
		edittext65 = findViewById(R.id.edittext65);
		textview1074 = findViewById(R.id.textview1074);
		textview1075 = findViewById(R.id.textview1075);
		textview1433 = findViewById(R.id.textview1433);
		edittext41 = findViewById(R.id.edittext41);
		textview1418 = findViewById(R.id.textview1418);
		textview1419 = findViewById(R.id.textview1419);
		textview1416 = findViewById(R.id.textview1416);
		textview1417 = findViewById(R.id.textview1417);
		linear757 = findViewById(R.id.linear757);
		textview1420 = findViewById(R.id.textview1420);
		edittext42 = findViewById(R.id.edittext42);
		linear791 = findViewById(R.id.linear791);
		hscroll80 = findViewById(R.id.hscroll80);
		linear787 = findViewById(R.id.linear787);
		hscroll81 = findViewById(R.id.hscroll81);
		linear788 = findViewById(R.id.linear788);
		textview1443 = findViewById(R.id.textview1443);
		edittext66 = findViewById(R.id.edittext66);
		textview1444 = findViewById(R.id.textview1444);
		textview1445 = findViewById(R.id.textview1445);
		textview1434 = findViewById(R.id.textview1434);
		edittext44 = findViewById(R.id.edittext44);
		textview1435 = findViewById(R.id.textview1435);
		textview1436 = findViewById(R.id.textview1436);
		textview1437 = findViewById(R.id.textview1437);
		textview1438 = findViewById(R.id.textview1438);
		linear789 = findViewById(R.id.linear789);
		textview1439 = findViewById(R.id.textview1439);
		edittext45 = findViewById(R.id.edittext45);
		textview531 = findViewById(R.id.textview531);
		textview532 = findViewById(R.id.textview532);
		linear151 = findViewById(R.id.linear151);
		linear148 = findViewById(R.id.linear148);
		linear150 = findViewById(R.id.linear150);
		textview538 = findViewById(R.id.textview538);
		textview533 = findViewById(R.id.textview533);
		linear154 = findViewById(R.id.linear154);
		linear156 = findViewById(R.id.linear156);
		linear157 = findViewById(R.id.linear157);
		textview793 = findViewById(R.id.textview793);
		edittext67 = findViewById(R.id.edittext67);
		textview534 = findViewById(R.id.textview534);
		textview535 = findViewById(R.id.textview535);
		textview794 = findViewById(R.id.textview794);
		edittext68 = findViewById(R.id.edittext68);
		textview381 = findViewById(R.id.textview381);
		textview382 = findViewById(R.id.textview382);
		textview795 = findViewById(R.id.textview795);
		edittext69 = findViewById(R.id.edittext69);
		textview528 = findViewById(R.id.textview528);
		textview529 = findViewById(R.id.textview529);
		textview796 = findViewById(R.id.textview796);
		edittext70 = findViewById(R.id.edittext70);
		textview536 = findViewById(R.id.textview536);
		textview537 = findViewById(R.id.textview537);
		textview797 = findViewById(R.id.textview797);
		edittext71 = findViewById(R.id.edittext71);
		textview541 = findViewById(R.id.textview541);
		textview542 = findViewById(R.id.textview542);
		textview798 = findViewById(R.id.textview798);
		edittext72 = findViewById(R.id.edittext72);
		textview543 = findViewById(R.id.textview543);
		textview544 = findViewById(R.id.textview544);
		textview799 = findViewById(R.id.textview799);
		edittext73 = findViewById(R.id.edittext73);
		textview383 = findViewById(R.id.textview383);
		textview384 = findViewById(R.id.textview384);
		textview1021 = findViewById(R.id.textview1021);
		edittext133 = findViewById(R.id.edittext133);
		textview1022 = findViewById(R.id.textview1022);
		textview1023 = findViewById(R.id.textview1023);
		textview800 = findViewById(R.id.textview800);
		edittext74 = findViewById(R.id.edittext74);
		textview336 = findViewById(R.id.textview336);
		textview337 = findViewById(R.id.textview337);
		textview801 = findViewById(R.id.textview801);
		edittext75 = findViewById(R.id.edittext75);
		textview341 = findViewById(R.id.textview341);
		textview342 = findViewById(R.id.textview342);
		textview802 = findViewById(R.id.textview802);
		edittext76 = findViewById(R.id.edittext76);
		textview345 = findViewById(R.id.textview345);
		textview346 = findViewById(R.id.textview346);
		textview803 = findViewById(R.id.textview803);
		edittext77 = findViewById(R.id.edittext77);
		textview347 = findViewById(R.id.textview347);
		textview348 = findViewById(R.id.textview348);
		textview1026 = findViewById(R.id.textview1026);
		edittext134 = findViewById(R.id.edittext134);
		textview1024 = findViewById(R.id.textview1024);
		textview1025 = findViewById(R.id.textview1025);
		textview804 = findViewById(R.id.textview804);
		edittext78 = findViewById(R.id.edittext78);
		textview312 = findViewById(R.id.textview312);
		textview313 = findViewById(R.id.textview313);
		textview969 = findViewById(R.id.textview969);
		edittext118 = findViewById(R.id.edittext118);
		textview970 = findViewById(R.id.textview970);
		textview971 = findViewById(R.id.textview971);
		button15 = findViewById(R.id.button15);
		textview788 = findViewById(R.id.textview788);
		edittext79 = findViewById(R.id.edittext79);
		textview368 = findViewById(R.id.textview368);
		textview369 = findViewById(R.id.textview369);
		textview629 = findViewById(R.id.textview629);
		edittext193 = findViewById(R.id.edittext193);
		textview630 = findViewById(R.id.textview630);
		textview631 = findViewById(R.id.textview631);
		textview789 = findViewById(R.id.textview789);
		edittext80 = findViewById(R.id.edittext80);
		textview370 = findViewById(R.id.textview370);
		textview371 = findViewById(R.id.textview371);
		textview2041 = findViewById(R.id.textview2041);
		edittext194 = findViewById(R.id.edittext194);
		textview2042 = findViewById(R.id.textview2042);
		textview2043 = findViewById(R.id.textview2043);
		textview546 = findViewById(R.id.textview546);
		textview547 = findViewById(R.id.textview547);
		linear160 = findViewById(R.id.linear160);
		textview548 = findViewById(R.id.textview548);
		textview549 = findViewById(R.id.textview549);
		linear144 = findViewById(R.id.linear144);
		textview790 = findViewById(R.id.textview790);
		edittext81 = findViewById(R.id.edittext81);
		textview550 = findViewById(R.id.textview550);
		textview551 = findViewById(R.id.textview551);
		textview805 = findViewById(R.id.textview805);
		edittext82 = findViewById(R.id.edittext82);
		textview372 = findViewById(R.id.textview372);
		textview373 = findViewById(R.id.textview373);
		textview806 = findViewById(R.id.textview806);
		edittext83 = findViewById(R.id.edittext83);
		textview374 = findViewById(R.id.textview374);
		textview375 = findViewById(R.id.textview375);
		textview1027 = findViewById(R.id.textview1027);
		linear366 = findViewById(R.id.linear366);
		linear368 = findViewById(R.id.linear368);
		textview1028 = findViewById(R.id.textview1028);
		edittext135 = findViewById(R.id.edittext135);
		textview1029 = findViewById(R.id.textview1029);
		textview1030 = findViewById(R.id.textview1030);
		textview1031 = findViewById(R.id.textview1031);
		edittext136 = findViewById(R.id.edittext136);
		textview1032 = findViewById(R.id.textview1032);
		textview1033 = findViewById(R.id.textview1033);
		textview807 = findViewById(R.id.textview807);
		edittext84 = findViewById(R.id.edittext84);
		textview287 = findViewById(R.id.textview287);
		textview316 = findViewById(R.id.textview316);
		textview972 = findViewById(R.id.textview972);
		edittext119 = findViewById(R.id.edittext119);
		textview973 = findViewById(R.id.textview973);
		textview974 = findViewById(R.id.textview974);
		textview552 = findViewById(R.id.textview552);
		edittext85 = findViewById(R.id.edittext85);
		textview319 = findViewById(R.id.textview319);
		textview320 = findViewById(R.id.textview320);
		textview553 = findViewById(R.id.textview553);
		edittext86 = findViewById(R.id.edittext86);
		textview539 = findViewById(R.id.textview539);
		textview540 = findViewById(R.id.textview540);
		textview845 = findViewById(R.id.textview845);
		textview814 = findViewById(R.id.textview814);
		hscroll44 = findViewById(R.id.hscroll44);
		linear297 = findViewById(R.id.linear297);
		linear373 = findViewById(R.id.linear373);
		linear299 = findViewById(R.id.linear299);
		hscroll19 = findViewById(R.id.hscroll19);
		hscroll45 = findViewById(R.id.hscroll45);
		hscroll62 = findViewById(R.id.hscroll62);
		hscroll63 = findViewById(R.id.hscroll63);
		textview815 = findViewById(R.id.textview815);
		textview816 = findViewById(R.id.textview816);
		hscroll57 = findViewById(R.id.hscroll57);
		linear291 = findViewById(R.id.linear291);
		linear374 = findViewById(R.id.linear374);
		button113 = findViewById(R.id.button113);
		linear292 = findViewById(R.id.linear292);
		linear346 = findViewById(R.id.linear346);
		linear300 = findViewById(R.id.linear300);
		textview984 = findViewById(R.id.textview984);
		linear293 = findViewById(R.id.linear293);
		linear375 = findViewById(R.id.linear375);
		linear294 = findViewById(R.id.linear294);
		linear347 = findViewById(R.id.linear347);
		textview817 = findViewById(R.id.textview817);
		linear296 = findViewById(R.id.linear296);
		textview839 = findViewById(R.id.textview839);
		edittext87 = findViewById(R.id.edittext87);
		textview840 = findViewById(R.id.textview840);
		textview841 = findViewById(R.id.textview841);
		textview1043 = findViewById(R.id.textview1043);
		edittext137 = findViewById(R.id.edittext137);
		textview1041 = findViewById(R.id.textview1041);
		textview1042 = findViewById(R.id.textview1042);
		button92 = findViewById(R.id.button92);
		linear338 = findViewById(R.id.linear338);
		textview949 = findViewById(R.id.textview949);
		textview946 = findViewById(R.id.textview946);
		edittext112 = findViewById(R.id.edittext112);
		textview947 = findViewById(R.id.textview947);
		textview948 = findViewById(R.id.textview948);
		linear298 = findViewById(R.id.linear298);
		textview842 = findViewById(R.id.textview842);
		textview847 = findViewById(R.id.textview847);
		edittext88 = findViewById(R.id.edittext88);
		textview843 = findViewById(R.id.textview843);
		textview844 = findViewById(R.id.textview844);
		linear370 = findViewById(R.id.linear370);
		textview1044 = findViewById(R.id.textview1044);
		textview1035 = findViewById(R.id.textview1035);
		edittext138 = findViewById(R.id.edittext138);
		textview1036 = findViewById(R.id.textview1036);
		textview1037 = findViewById(R.id.textview1037);
		linear372 = findViewById(R.id.linear372);
		textview1034 = findViewById(R.id.textview1034);
		textview1038 = findViewById(R.id.textview1038);
		edittext139 = findViewById(R.id.edittext139);
		textview1039 = findViewById(R.id.textview1039);
		textview1040 = findViewById(R.id.textview1040);
		textview818 = findViewById(R.id.textview818);
		edittext89 = findViewById(R.id.edittext89);
		textview819 = findViewById(R.id.textview819);
		textview820 = findViewById(R.id.textview820);
		textview1047 = findViewById(R.id.textview1047);
		edittext140 = findViewById(R.id.edittext140);
		textview1045 = findViewById(R.id.textview1045);
		textview1046 = findViewById(R.id.textview1046);
		textview821 = findViewById(R.id.textview821);
		edittext90 = findViewById(R.id.edittext90);
		textview822 = findViewById(R.id.textview822);
		textview823 = findViewById(R.id.textview823);
		textview975 = findViewById(R.id.textview975);
		edittext120 = findViewById(R.id.edittext120);
		textview976 = findViewById(R.id.textview976);
		textview977 = findViewById(R.id.textview977);
		button91 = findViewById(R.id.button91);
		textview824 = findViewById(R.id.textview824);
		edittext91 = findViewById(R.id.edittext91);
		textview825 = findViewById(R.id.textview825);
		textview826 = findViewById(R.id.textview826);
		textview1048 = findViewById(R.id.textview1048);
		edittext141 = findViewById(R.id.edittext141);
		textview1049 = findViewById(R.id.textview1049);
		textview1050 = findViewById(R.id.textview1050);
		textview830 = findViewById(R.id.textview830);
		edittext92 = findViewById(R.id.edittext92);
		textview831 = findViewById(R.id.textview831);
		textview832 = findViewById(R.id.textview832);
		textview978 = findViewById(R.id.textview978);
		edittext121 = findViewById(R.id.edittext121);
		textview979 = findViewById(R.id.textview979);
		textview980 = findViewById(R.id.textview980);
		textview836 = findViewById(R.id.textview836);
		edittext93 = findViewById(R.id.edittext93);
		textview837 = findViewById(R.id.textview837);
		textview838 = findViewById(R.id.textview838);
		textview848 = findViewById(R.id.textview848);
		textview849 = findViewById(R.id.textview849);
		textview850 = findViewById(R.id.textview850);
		linear302 = findViewById(R.id.linear302);
		linear303 = findViewById(R.id.linear303);
		linear304 = findViewById(R.id.linear304);
		linear305 = findViewById(R.id.linear305);
		linear306 = findViewById(R.id.linear306);
		linear376 = findViewById(R.id.linear376);
		linear341 = findViewById(R.id.linear341);
		textview851 = findViewById(R.id.textview851);
		textview852 = findViewById(R.id.textview852);
		linear312 = findViewById(R.id.linear312);
		linear313 = findViewById(R.id.linear313);
		button114 = findViewById(R.id.button114);
		linear314 = findViewById(R.id.linear314);
		button115 = findViewById(R.id.button115);
		linear315 = findViewById(R.id.linear315);
		button116 = findViewById(R.id.button116);
		linear316 = findViewById(R.id.linear316);
		linear379 = findViewById(R.id.linear379);
		button117 = findViewById(R.id.button117);
		linear317 = findViewById(R.id.linear317);
		linear339 = findViewById(R.id.linear339);
		linear318 = findViewById(R.id.linear318);
		textview985 = findViewById(R.id.textview985);
		hscroll59 = findViewById(R.id.hscroll59);
		linear319 = findViewById(R.id.linear319);
		hscroll60 = findViewById(R.id.hscroll60);
		linear320 = findViewById(R.id.linear320);
		hscroll61 = findViewById(R.id.hscroll61);
		linear332 = findViewById(R.id.linear332);
		linear322 = findViewById(R.id.linear322);
		hscroll64 = findViewById(R.id.hscroll64);
		hscroll65 = findViewById(R.id.hscroll65);
		linear381 = findViewById(R.id.linear381);
		linear323 = findViewById(R.id.linear323);
		linear340 = findViewById(R.id.linear340);
		textview853 = findViewById(R.id.textview853);
		linear325 = findViewById(R.id.linear325);
		textview862 = findViewById(R.id.textview862);
		edittext94 = findViewById(R.id.edittext94);
		textview854 = findViewById(R.id.textview854);
		textview855 = findViewById(R.id.textview855);
		textview865 = findViewById(R.id.textview865);
		edittext95 = findViewById(R.id.edittext95);
		textview856 = findViewById(R.id.textview856);
		textview857 = findViewById(R.id.textview857);
		textview878 = findViewById(R.id.textview878);
		edittext96 = findViewById(R.id.edittext96);
		textview858 = findViewById(R.id.textview858);
		textview859 = findViewById(R.id.textview859);
		textview890 = findViewById(R.id.textview890);
		edittext97 = findViewById(R.id.edittext97);
		textview860 = findViewById(R.id.textview860);
		textview861 = findViewById(R.id.textview861);
		textview1053 = findViewById(R.id.textview1053);
		edittext142 = findViewById(R.id.edittext142);
		textview1051 = findViewById(R.id.textview1051);
		textview1052 = findViewById(R.id.textview1052);
		textview960 = findViewById(R.id.textview960);
		edittext115 = findViewById(R.id.edittext115);
		textview961 = findViewById(R.id.textview961);
		textview962 = findViewById(R.id.textview962);
		textview893 = findViewById(R.id.textview893);
		edittext98 = findViewById(R.id.edittext98);
		textview894 = findViewById(R.id.textview894);
		textview895 = findViewById(R.id.textview895);
		textview896 = findViewById(R.id.textview896);
		edittext99 = findViewById(R.id.edittext99);
		textview897 = findViewById(R.id.textview897);
		textview898 = findViewById(R.id.textview898);
		textview899 = findViewById(R.id.textview899);
		edittext100 = findViewById(R.id.edittext100);
		textview900 = findViewById(R.id.textview900);
		textview901 = findViewById(R.id.textview901);
		textview902 = findViewById(R.id.textview902);
		edittext101 = findViewById(R.id.edittext101);
		textview903 = findViewById(R.id.textview903);
		textview904 = findViewById(R.id.textview904);
		textview1061 = findViewById(R.id.textview1061);
		edittext143 = findViewById(R.id.edittext143);
		textview1059 = findViewById(R.id.textview1059);
		textview1060 = findViewById(R.id.textview1060);
		textview905 = findViewById(R.id.textview905);
		edittext102 = findViewById(R.id.edittext102);
		textview906 = findViewById(R.id.textview906);
		textview907 = findViewById(R.id.textview907);
		textview954 = findViewById(R.id.textview954);
		edittext113 = findViewById(R.id.edittext113);
		textview955 = findViewById(R.id.textview955);
		textview956 = findViewById(R.id.textview956);
		button94 = findViewById(R.id.button94);
		linear334 = findViewById(R.id.linear334);
		textview939 = findViewById(R.id.textview939);
		textview938 = findViewById(R.id.textview938);
		edittext104 = findViewById(R.id.edittext104);
		textview936 = findViewById(R.id.textview936);
		textview937 = findViewById(R.id.textview937);
		textview908 = findViewById(R.id.textview908);
		edittext103 = findViewById(R.id.edittext103);
		textview909 = findViewById(R.id.textview909);
		textview910 = findViewById(R.id.textview910);
		linear335 = findViewById(R.id.linear335);
		textview940 = findViewById(R.id.textview940);
		textview941 = findViewById(R.id.textview941);
		edittext106 = findViewById(R.id.edittext106);
		textview942 = findViewById(R.id.textview942);
		textview943 = findViewById(R.id.textview943);
		textview911 = findViewById(R.id.textview911);
		edittext105 = findViewById(R.id.edittext105);
		textview912 = findViewById(R.id.textview912);
		textview913 = findViewById(R.id.textview913);
		linear333 = findViewById(R.id.linear333);
		textview914 = findViewById(R.id.textview914);
		textview921 = findViewById(R.id.textview921);
		edittext108 = findViewById(R.id.edittext108);
		textview922 = findViewById(R.id.textview922);
		textview923 = findViewById(R.id.textview923);
		textview918 = findViewById(R.id.textview918);
		edittext107 = findViewById(R.id.edittext107);
		textview919 = findViewById(R.id.textview919);
		textview920 = findViewById(R.id.textview920);
		textview924 = findViewById(R.id.textview924);
		edittext109 = findViewById(R.id.edittext109);
		textview925 = findViewById(R.id.textview925);
		textview926 = findViewById(R.id.textview926);
		linear377 = findViewById(R.id.linear377);
		textview1069 = findViewById(R.id.textview1069);
		textview1054 = findViewById(R.id.textview1054);
		edittext144 = findViewById(R.id.edittext144);
		textview1055 = findViewById(R.id.textview1055);
		textview1056 = findViewById(R.id.textview1056);
		linear380 = findViewById(R.id.linear380);
		textview1068 = findViewById(R.id.textview1068);
		textview1062 = findViewById(R.id.textview1062);
		edittext145 = findViewById(R.id.edittext145);
		textview1063 = findViewById(R.id.textview1063);
		textview1064 = findViewById(R.id.textview1064);
		textview1065 = findViewById(R.id.textview1065);
		edittext146 = findViewById(R.id.edittext146);
		textview1066 = findViewById(R.id.textview1066);
		textview1067 = findViewById(R.id.textview1067);
		textview927 = findViewById(R.id.textview927);
		edittext110 = findViewById(R.id.edittext110);
		textview928 = findViewById(R.id.textview928);
		textview929 = findViewById(R.id.textview929);
		textview957 = findViewById(R.id.textview957);
		edittext114 = findViewById(R.id.edittext114);
		textview958 = findViewById(R.id.textview958);
		textview959 = findViewById(R.id.textview959);
		textview933 = findViewById(R.id.textview933);
		edittext111 = findViewById(R.id.edittext111);
		textview934 = findViewById(R.id.textview934);
		textview935 = findViewById(R.id.textview935);
		internet = new RequestNetwork(this);
		
		//ScrollChange2
		vscroll1.setOnScrollChangeListener(new ScrollView.OnScrollChangeListener() {
			@Override
			public void onScrollChange(View v, int _scrollX, int _scrollY, int _oldScrollX, int _oldScrollY) {
				
			}
		});
		
		add_dynamic_hole.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					add_dynamic_hole_linear.setVisibility(View.VISIBLE);
					linear74.setVisibility(View.VISIBLE);
					_dynamic_hole_in_wall();
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
				element_num.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 3)});
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
		
		edittext1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext4.setText(String.valueOf(00.00));
				edittext4.setTextColor(0xFFE91E63);
				edittext5.setText(String.valueOf(00.00));
				edittext5.setTextColor(0xFFE91E63);
				textview666.setVisibility(View.GONE);
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
				edittext4.setText(String.valueOf(00.00));
				edittext5.setText(String.valueOf(00.00));
				edittext4.setTextColor(0xFFE91E63);
				edittext5.setTextColor(0xFFE91E63);
				textview668.setVisibility(View.GONE);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview7.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview7)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* ارتفاع الحائط ( م )\nوالمقصود هنا صافي ارتفاع الحائط الخرساني المسلح")
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
		
		edittext35.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext35.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext36.getText().toString().equals("") || edittext36.getText().toString().equals(".")) || (edittext36.getText().toString().equals("-") || (Double.parseDouble(edittext36.getText().toString()) < 0)))) {
					edittext32.setText(String.valueOf(00.00d));
				}
				else {
					edittext32.setText(String.valueOf((Double.parseDouble(_charSeq) + Double.parseDouble(edittext36.getText().toString())) / 2));
				}
				textview556.setVisibility(View.GONE);
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
				edittext36.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext35.getText().toString().equals("") || edittext35.getText().toString().equals(".")) || (edittext35.getText().toString().equals("-") || (Double.parseDouble(edittext35.getText().toString()) < 0)))) {
					edittext32.setText(String.valueOf(00.00d));
				}
				else {
					edittext32.setText(String.valueOf((Double.parseDouble(_charSeq) + Double.parseDouble(edittext35.getText().toString())) / 2));
				}
				textview555.setVisibility(View.GONE);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext32.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext32.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext4.setText(String.valueOf(00.00));
				edittext5.setText(String.valueOf(00.00));
				edittext4.setTextColor(0xFFE91E63);
				edittext5.setTextColor(0xFFE91E63);
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
				edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
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
		
		textview11.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview11)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الحوائط من هذا النموذج\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ حائط \"")
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
				if ((((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0)))) || (((edittext36.getText().toString().equals("") || edittext36.getText().toString().equals(".")) || (edittext36.getText().toString().equals("-") || (Double.parseDouble(edittext36.getText().toString()) < 0))) || ((edittext35.getText().toString().equals("") || edittext35.getText().toString().equals(".")) || (edittext35.getText().toString().equals("-") || (Double.parseDouble(edittext35.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext3.getText().toString().equals("") || (edittext3.getText().toString().equals(".") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
						edittext3.setText(String.valueOf((long)(1)));
					}
					edittext4.setText(String.valueOf((Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext32.getText().toString())) * Double.parseDouble(edittext2.getText().toString())));
					edittext4.setTextColor(0xFF000000);
					edittext444.setText(String.valueOf((Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext32.getText().toString())) * Double.parseDouble(edittext2.getText().toString())));
					edittext444.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext4.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
					/*

*/
				}
				else {
					edittext5.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext3.getText().toString())));
					edittext5.setTextColor(0xFF000000);
				}
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
				if (linear74.getVisibility() == View.VISIBLE) {
					if (Double.parseDouble(_charSeq) == 00.00d) {
						edittext20.setText(String.valueOf(Double.parseDouble("00.00")));
						textview56.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(_charSeq)) && (Double.parseDouble(_charSeq) < Double.parseDouble(edittext15.getText().toString()))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مسطح كل الفتحات أكبر من اجمالي مسطح الحوائط وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							edittext20.setText(String.valueOf(Double.parseDouble("00.00")));
							edittext20.setTextColor(0xFFE91E63);
							textview56.setVisibility(View.VISIBLE);
						}
						else {
							edittext20.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext15.getText().toString())));
							edittext20.setTextColor(0xFF000000);
							textview56.setVisibility(View.GONE);
						}
					}
				}
				else {
					edittext20.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext15.getText().toString())));
					edittext20.setTextColor(0xFF000000);
					textview56.setVisibility(View.GONE);
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
				if (Double.parseDouble(_charSeq) == 0) {
					linear74.setVisibility(View.GONE);
					textview56.setVisibility(View.GONE);
				}
				else {
					linear74.setVisibility(View.VISIBLE);
					if (Double.parseDouble(edittext5.getText().toString()) == 00.00d) {
						edittext20.setText(String.valueOf(Double.parseDouble("00.00")));
						textview56.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(edittext5.getText().toString())) && (Double.parseDouble(edittext5.getText().toString()) < Double.parseDouble(_charSeq))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مسطح كل الفتحات أكبر من اجمالي مسطح الحوائط وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							edittext20.setText(String.valueOf(Double.parseDouble("00.00")));
							edittext20.setTextColor(0xFFE91E63);
							textview56.setVisibility(View.VISIBLE);
						}
						else {
							edittext20.setText(String.valueOf(Double.parseDouble(edittext5.getText().toString()) - Double.parseDouble(_charSeq)));
							edittext20.setTextColor(0xFF000000);
							textview56.setVisibility(View.GONE);
						}
					}
				}
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
				total_concrete_sum.setText(String.valueOf(Double.parseDouble(edittext20.getText().toString()) + Double.parseDouble(edittext21.getText().toString())));
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
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					add_dynamic_wall_linear.setVisibility(View.VISIBLE);
					_dynamic_view();
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
				edittext21.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				total_concrete_sum.setText(String.valueOf(Double.parseDouble(edittext20.getText().toString()) + Double.parseDouble(edittext21.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		total_concrete_sum.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				total_concrete_sum.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				edittext123.setText(String.valueOf(00.00));
				edittext123.setTextColor(0xFFE91E63);
				edittext53.setText(String.valueOf(00.00));
				edittext56.setText(String.valueOf(00.00));
				edittext57.setText(String.valueOf(00.00));
				edittext58.setText(String.valueOf(00.00));
				edittext59.setText(String.valueOf(00.00));
				edittext60.setText(String.valueOf(00.00));
				edittext65.setText(String.valueOf(00.00));
				edittext66.setText(String.valueOf(00.00));
				edittext67.setText(String.valueOf(00.00));
				edittext68.setText(String.valueOf(00.00));
				edittext69.setText(String.valueOf(00.00));
				edittext70.setText(String.valueOf(00.00));
				edittext71.setText(String.valueOf(00.00));
				edittext72.setText(String.valueOf(00.00));
				edittext73.setText(String.valueOf(00.00));
				edittext79.setText(String.valueOf(00.00));
				edittext80.setText(String.valueOf(00.00));
				edittext81.setText(String.valueOf(00.00));
				edittext82.setText(String.valueOf(00.00));
				edittext83.setText(String.valueOf(00.00));
				edittext84.setText(String.valueOf(00.00));
				edittext85.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext88.setText(String.valueOf(00.00));
				edittext112.setText(String.valueOf(00.00));
				edittext91.setText(String.valueOf(00.00));
				edittext92.setText(String.valueOf(00.00));
				edittext93.setText(String.valueOf(00.00));
				edittext104.setText(String.valueOf(00.00));
				edittext106.setText(String.valueOf(00.00));
				edittext108.setText(String.valueOf(00.00));
				edittext53.setTextColor(0xFFE91E63);
				edittext56.setTextColor(0xFFE91E63);
				edittext57.setTextColor(0xFFE91E63);
				edittext58.setTextColor(0xFFE91E63);
				edittext59.setTextColor(0xFFE91E63);
				edittext60.setTextColor(0xFFE91E63);
				edittext65.setTextColor(0xFFE91E63);
				edittext66.setTextColor(0xFFE91E63);
				edittext67.setTextColor(0xFFE91E63);
				edittext68.setTextColor(0xFFE91E63);
				edittext69.setTextColor(0xFFE91E63);
				edittext70.setTextColor(0xFFE91E63);
				edittext71.setTextColor(0xFFE91E63);
				edittext72.setTextColor(0xFFE91E63);
				edittext73.setTextColor(0xFFE91E63);
				edittext79.setTextColor(0xFFE91E63);
				edittext80.setTextColor(0xFFE91E63);
				edittext81.setTextColor(0xFFE91E63);
				edittext82.setTextColor(0xFFE91E63);
				edittext83.setTextColor(0xFFE91E63);
				edittext84.setTextColor(0xFFE91E63);
				edittext85.setTextColor(0xFFE91E63);
				edittext86.setTextColor(0xFFE91E63);
				edittext88.setTextColor(0xFFE91E63);
				edittext112.setTextColor(0xFFE91E63);
				edittext91.setTextColor(0xFFE91E63);
				edittext92.setTextColor(0xFFE91E63);
				edittext93.setTextColor(0xFFE91E63);
				edittext104.setTextColor(0xFFE91E63);
				edittext106.setTextColor(0xFFE91E63);
				edittext108.setTextColor(0xFFE91E63);
				textview842.setText("");
				textview939.setText("");
				textview940.setText("");
				textview914.setText("");
				textview849.setText("");
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
				edittext123.setText(String.valueOf(00.00));
				edittext123.setTextColor(0xFFE91E63);
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
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview988)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة حديد التسليح بالحوائط طبقآ للمقايسة ( كجم / م٣ ) \" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١٨٠ كجم/م٣ \"")
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
		
		button99.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext122.getText().toString().equals("") || (Double.parseDouble(edittext122.getText().toString()) < 0)) {
					edittext122.setText(String.valueOf((long)(180)));
					edittext123.setText(String.valueOf(Double.parseDouble(total_concrete_sum.getText().toString()) * (Double.parseDouble(edittext122.getText().toString()) / 1000)));
				}
				else {
					edittext123.setText(String.valueOf(Double.parseDouble(total_concrete_sum.getText().toString()) * (Double.parseDouble(edittext122.getText().toString()) / 1000)));
				}
				edittext123.setTextColor(0xFF000000);
			}
		});
		
		edittext123.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext123.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext126.setText(String.valueOf(00.00));
				edittext135.setText(String.valueOf(00.00));
				edittext136.setText(String.valueOf(00.00));
				edittext85.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext138.setText(String.valueOf(00.00));
				edittext139.setText(String.valueOf(00.00));
				edittext144.setText(String.valueOf(00.00));
				edittext145.setText(String.valueOf(00.00));
				textview1044.setText("");
				textview1034.setText("");
				textview1069.setText("");
				textview1068.setText("");
				edittext126.setTextColor(0xFFE91E63);
				edittext135.setTextColor(0xFFE91E63);
				edittext136.setTextColor(0xFFE91E63);
				edittext85.setTextColor(0xFFE91E63);
				edittext86.setTextColor(0xFFE91E63);
				edittext138.setTextColor(0xFFE91E63);
				edittext139.setTextColor(0xFFE91E63);
				edittext144.setTextColor(0xFFE91E63);
				edittext145.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button95.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear256.setVisibility(View.GONE);
					linear337.setVisibility(View.VISIBLE);
					linear178.setVisibility(View.GONE);
					linear140.setVisibility(View.GONE);
					linear290.setVisibility(View.GONE);
					linear301.setVisibility(View.GONE);
					edittext52.setText("");
					edittext54.setText("");
					edittext55.setText("");
					edittext61.setText("");
					edittext62.setText("");
					edittext63.setText("");
					edittext64.setText("");
					edittext74.setText("");
					edittext75.setText("");
					edittext76.setText("");
					edittext77.setText("");
					edittext78.setText("");
					edittext87.setText("");
					edittext89.setText("");
					edittext90.setText("");
					edittext94.setText("");
					edittext95.setText("");
					edittext96.setText("");
					edittext97.setText("");
					edittext98.setText("");
					edittext99.setText("");
					edittext100.setText("");
					edittext101.setText("");
					edittext102.setText("");
					edittext113.setText("");
					edittext115.setText("");
					edittext116.setText("");
					edittext118.setText("");
					edittext120.setText("");
					edittext124.setText("");
					edittext130.setText("");
					edittext132.setText("");
					edittext134.setText("");
					edittext137.setText("");
					edittext140.setText("");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button96.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear256.setVisibility(View.VISIBLE);
					linear337.setVisibility(View.GONE);
					linear178.setVisibility(View.GONE);
					linear140.setVisibility(View.GONE);
					linear290.setVisibility(View.GONE);
					linear301.setVisibility(View.GONE);
					edittext52.setText("");
					edittext54.setText("");
					edittext55.setText("");
					edittext61.setText("");
					edittext62.setText("");
					edittext63.setText("");
					edittext64.setText("");
					edittext74.setText("");
					edittext75.setText("");
					edittext76.setText("");
					edittext77.setText("");
					edittext78.setText("");
					edittext87.setText("");
					edittext89.setText("");
					edittext90.setText("");
					edittext94.setText("");
					edittext95.setText("");
					edittext96.setText("");
					edittext97.setText("");
					edittext98.setText("");
					edittext99.setText("");
					edittext100.setText("");
					edittext101.setText("");
					edittext102.setText("");
					edittext113.setText("");
					edittext115.setText("");
					edittext116.setText("");
					edittext118.setText("");
					edittext120.setText("");
					edittext124.setText("");
					edittext130.setText("");
					edittext132.setText("");
					edittext134.setText("");
					edittext137.setText("");
					edittext140.setText("");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button68.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear178.setVisibility(View.GONE);
					linear140.setVisibility(View.VISIBLE);
					edittext52.setText("");
					edittext54.setText("");
					edittext55.setText("");
					edittext61.setText("");
					edittext62.setText("");
					edittext63.setText("");
					edittext64.setText("");
					edittext74.setText("");
					edittext75.setText("");
					edittext76.setText("");
					edittext77.setText("");
					edittext78.setText("");
					edittext87.setText("");
					edittext89.setText("");
					edittext90.setText("");
					edittext94.setText("");
					edittext95.setText("");
					edittext96.setText("");
					edittext97.setText("");
					edittext98.setText("");
					edittext99.setText("");
					edittext100.setText("");
					edittext101.setText("");
					edittext102.setText("");
					edittext113.setText("");
					edittext115.setText("");
					edittext116.setText("");
					edittext118.setText("");
					edittext120.setText("");
					edittext124.setText("");
					edittext130.setText("");
					edittext132.setText("");
					edittext134.setText("");
					edittext137.setText("");
					edittext140.setText("");
					edittext65.setTextColor(0xFF000000);
					edittext66.setTextColor(0xFF000000);
					edittext67.setTextColor(0xFF000000);
					edittext68.setTextColor(0xFF000000);
					edittext69.setTextColor(0xFF000000);
					edittext70.setTextColor(0xFF000000);
					edittext71.setTextColor(0xFF000000);
					edittext72.setTextColor(0xFF000000);
					edittext73.setTextColor(0xFF000000);
					edittext79.setTextColor(0xFF000000);
					edittext80.setTextColor(0xFF000000);
					edittext81.setTextColor(0xFF000000);
					edittext82.setTextColor(0xFF000000);
					edittext83.setTextColor(0xFF000000);
					edittext84.setTextColor(0xFF000000);
					edittext119.setTextColor(0xFF000000);
					edittext85.setTextColor(0xFFFFFFFF);
					edittext133.setTextColor(0xFF000000);
					edittext135.setTextColor(0xFF000000);
					edittext136.setTextColor(0xFF000000);
					edittext86.setTextColor(0xFFFFFFFF);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button67.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear178.setVisibility(View.VISIBLE);
					linear140.setVisibility(View.GONE);
					edittext52.setText("");
					edittext54.setText("");
					edittext55.setText("");
					edittext61.setText("");
					edittext62.setText("");
					edittext63.setText("");
					edittext64.setText("");
					edittext74.setText("");
					edittext75.setText("");
					edittext76.setText("");
					edittext77.setText("");
					edittext78.setText("");
					edittext87.setText("");
					edittext89.setText("");
					edittext90.setText("");
					edittext94.setText("");
					edittext95.setText("");
					edittext96.setText("");
					edittext97.setText("");
					edittext98.setText("");
					edittext99.setText("");
					edittext100.setText("");
					edittext101.setText("");
					edittext102.setText("");
					edittext113.setText("");
					edittext115.setText("");
					edittext116.setText("");
					edittext118.setText("");
					edittext120.setText("");
					edittext124.setText("");
					edittext130.setText("");
					edittext132.setText("");
					edittext134.setText("");
					edittext137.setText("");
					edittext140.setText("");
					edittext53.setTextColor(0xFF000000);
					edittext56.setTextColor(0xFF000000);
					edittext57.setTextColor(0xFF000000);
					edittext58.setTextColor(0xFF000000);
					edittext126.setTextColor(0xFF000000);
					edittext127.setTextColor(0xFF000000);
					edittext131.setTextColor(0xFF000000);
					edittext117.setTextColor(0xFF000000);
					edittext59.setTextColor(0xFFFFFFFF);
					edittext60.setTextColor(0xFFFFFFFF);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button97.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear290.setVisibility(View.GONE);
					linear301.setVisibility(View.VISIBLE);
					edittext52.setText("");
					edittext54.setText("");
					edittext55.setText("");
					edittext61.setText("");
					edittext62.setText("");
					edittext63.setText("");
					edittext64.setText("");
					edittext74.setText("");
					edittext75.setText("");
					edittext76.setText("");
					edittext77.setText("");
					edittext78.setText("");
					edittext87.setText("");
					edittext89.setText("");
					edittext90.setText("");
					edittext94.setText("");
					edittext95.setText("");
					edittext96.setText("");
					edittext97.setText("");
					edittext98.setText("");
					edittext99.setText("");
					edittext100.setText("");
					edittext101.setText("");
					edittext102.setText("");
					edittext113.setText("");
					edittext115.setText("");
					edittext116.setText("");
					edittext118.setText("");
					edittext120.setText("");
					edittext124.setText("");
					edittext130.setText("");
					edittext132.setText("");
					edittext134.setText("");
					edittext142.setText("");
					edittext143.setText("");
					textview842.setText("");
					textview939.setText("");
					textview940.setText("");
					textview914.setText("");
					textview1044.setText("");
					textview1034.setText("");
					textview1069.setText("");
					textview1068.setText("");
					edittext103.setTextColor(0xFF000000);
					edittext104.setTextColor(0xFF000000);
					edittext105.setTextColor(0xFF000000);
					edittext106.setTextColor(0xFF000000);
					edittext107.setTextColor(0xFF000000);
					edittext108.setTextColor(0xFF000000);
					edittext144.setTextColor(0xFF000000);
					edittext145.setTextColor(0xFF000000);
					edittext146.setTextColor(0xFF000000);
					edittext109.setTextColor(0xFF000000);
					edittext110.setTextColor(0xFF000000);
					edittext114.setTextColor(0xFF000000);
					edittext111.setTextColor(0xFFFFFFFF);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button98.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear290.setVisibility(View.VISIBLE);
					linear301.setVisibility(View.GONE);
					edittext52.setText("");
					edittext54.setText("");
					edittext55.setText("");
					edittext61.setText("");
					edittext62.setText("");
					edittext63.setText("");
					edittext64.setText("");
					edittext74.setText("");
					edittext75.setText("");
					edittext76.setText("");
					edittext77.setText("");
					edittext78.setText("");
					edittext87.setText("");
					edittext89.setText("");
					edittext90.setText("");
					edittext94.setText("");
					edittext95.setText("");
					edittext96.setText("");
					edittext97.setText("");
					edittext98.setText("");
					edittext99.setText("");
					edittext100.setText("");
					edittext101.setText("");
					edittext102.setText("");
					edittext116.setText("");
					edittext118.setText("");
					edittext113.setText("");
					edittext115.setText("");
					edittext120.setText("");
					edittext124.setText("");
					edittext130.setText("");
					edittext132.setText("");
					edittext134.setText("");
					edittext137.setText("");
					edittext140.setText("");
					textview842.setText("");
					textview949.setText("");
					textview939.setText("");
					textview940.setText("");
					textview914.setText("");
					textview1044.setText("");
					textview1034.setText("");
					edittext112.setTextColor(0xFF000000);
					edittext88.setTextColor(0xFF000000);
					edittext91.setTextColor(0xFF000000);
					edittext92.setTextColor(0xFF000000);
					edittext121.setTextColor(0xFF000000);
					edittext138.setTextColor(0xFF000000);
					edittext139.setTextColor(0xFF000000);
					edittext141.setTextColor(0xFF000000);
					edittext93.setTextColor(0xFFFFFFFF);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button101.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.altkia.com/iron-price-today/"));
				startActivity(price);
			}
		});
		
		edittext52.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext52.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext53.setText(String.valueOf(00.00));
				edittext53.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview530.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview530)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة الهالك بالخرسانة وهي عبارة عن ( هالك غسيل عربيات نقل الخلطة وهالك البامب ان وجدت )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٥ % \"")
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
		
		button66.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext52.getText().toString().equals("") || (Double.parseDouble(edittext52.getText().toString()) > 100)) {
					edittext52.setText(String.valueOf((long)(5)));
					edittext53.setText(String.valueOf(Double.parseDouble(total_concrete_sum.getText().toString()) + ((Double.parseDouble(edittext52.getText().toString()) / 100) * Double.parseDouble(total_concrete_sum.getText().toString()))));
				}
				else {
					edittext53.setText(String.valueOf(Double.parseDouble(total_concrete_sum.getText().toString()) + ((Double.parseDouble(edittext52.getText().toString()) / 100) * Double.parseDouble(total_concrete_sum.getText().toString()))));
				}
				edittext53.setTextColor(0xFF000000);
			}
		});
		
		edittext53.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext53.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				edittext57.setText(String.valueOf(00.00));
				edittext60.setText(String.valueOf(00.00));
				edittext57.setTextColor(0xFFE91E63);
				edittext60.setTextColor(0xFFE91E63);
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
				edittext124.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext126.setText(String.valueOf(00.00));
				edittext126.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview998.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview998)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة الهالك بحديد تسليح الحوائط\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١٠ % \"")
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
		
		button100.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext124.getText().toString().equals("") || (Double.parseDouble(edittext124.getText().toString()) > 100)) {
					edittext124.setText(String.valueOf((long)(10)));
					edittext126.setText(String.valueOf(Double.parseDouble(edittext123.getText().toString()) + ((Double.parseDouble(edittext124.getText().toString()) / 100) * Double.parseDouble(edittext123.getText().toString()))));
				}
				else {
					edittext126.setText(String.valueOf(Double.parseDouble(edittext123.getText().toString()) + ((Double.parseDouble(edittext124.getText().toString()) / 100) * Double.parseDouble(edittext123.getText().toString()))));
				}
				edittext126.setTextColor(0xFF000000);
			}
		});
		
		edittext126.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext126.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext131.setText(String.valueOf(00.00));
				edittext60.setText(String.valueOf(00.00));
				edittext131.setTextColor(0xFFE91E63);
				edittext60.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext54.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext54.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext56.setText(String.valueOf(00.00));
				edittext57.setText(String.valueOf(00.00));
				edittext59.setText(String.valueOf(00.00));
				edittext60.setText(String.valueOf(00.00));
				edittext56.setTextColor(0xFFE91E63);
				edittext57.setTextColor(0xFFE91E63);
				edittext59.setTextColor(0xFFE91E63);
				edittext60.setTextColor(0xFFE91E63);
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
				edittext130.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext127.setText(String.valueOf(00.00));
				edittext131.setText(String.valueOf(00.00));
				edittext59.setText(String.valueOf(00.00));
				edittext60.setText(String.valueOf(00.00));
				edittext127.setTextColor(0xFFE91E63);
				edittext131.setTextColor(0xFFE91E63);
				edittext59.setTextColor(0xFFE91E63);
				edittext60.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext55.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext55.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext58.setText(String.valueOf(00.00));
				edittext59.setText(String.valueOf(00.00));
				edittext60.setText(String.valueOf(00.00));
				edittext58.setTextColor(0xFFE91E63);
				edittext59.setTextColor(0xFFE91E63);
				edittext60.setTextColor(0xFFE91E63);
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
				edittext116.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext117.setText(String.valueOf(00.00));
				edittext59.setText(String.valueOf(00.00));
				edittext60.setText(String.valueOf(00.00));
				edittext117.setTextColor(0xFFE91E63);
				edittext59.setTextColor(0xFFE91E63);
				edittext60.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview965.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview965)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("سعر مصنعية الصب والفرمجة شامل إيجار الخلاطة ( جنيه / م٣ )\nفي حالة عدم الرغبة في ادخاله واعتباره محمل علي سعر النجارة والحدادة سيهمله البرنامج\n\" مدخل إختياري في حالة عدم الرغبة في إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠٠.٠٠ جنيه/م٣ \"")
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
		
		button65.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext54.getText().toString().equals("") || edittext54.getText().toString().equals(".")) || (edittext54.getText().toString().equals("-") || (Double.parseDouble(edittext54.getText().toString()) < 0))) || (((edittext55.getText().toString().equals("") || edittext55.getText().toString().equals(".")) || (edittext55.getText().toString().equals("-") || (Double.parseDouble(edittext55.getText().toString()) < 0))) || ((edittext130.getText().toString().equals("") || edittext130.getText().toString().equals(".")) || (edittext130.getText().toString().equals("-") || (Double.parseDouble(edittext130.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext116.getText().toString().equals("") || (Double.parseDouble(edittext116.getText().toString()) < 0)) {
						edittext116.setText(String.valueOf(00.00d));
					}
					edittext56.setText(String.valueOf(Double.parseDouble(edittext54.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())));
					edittext57.setText(String.valueOf(Double.parseDouble(edittext54.getText().toString()) * Double.parseDouble(edittext53.getText().toString())));
					edittext127.setText(String.valueOf(Double.parseDouble(edittext130.getText().toString()) * Double.parseDouble(edittext123.getText().toString())));
					edittext131.setText(String.valueOf(Double.parseDouble(edittext130.getText().toString()) * Double.parseDouble(edittext126.getText().toString())));
					edittext58.setText(String.valueOf(Double.parseDouble(edittext55.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())));
					edittext117.setText(String.valueOf(Double.parseDouble(edittext116.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())));
					edittext59.setText(String.valueOf((Double.parseDouble(edittext56.getText().toString()) + Double.parseDouble(edittext58.getText().toString())) + (Double.parseDouble(edittext117.getText().toString()) + Double.parseDouble(edittext127.getText().toString()))));
					edittext60.setText(String.valueOf((Double.parseDouble(edittext57.getText().toString()) + Double.parseDouble(edittext58.getText().toString())) + (Double.parseDouble(edittext117.getText().toString()) + Double.parseDouble(edittext131.getText().toString()))));
					edittext56.setTextColor(0xFF000000);
					edittext57.setTextColor(0xFF000000);
					edittext127.setTextColor(0xFF000000);
					edittext131.setTextColor(0xFF000000);
					edittext58.setTextColor(0xFF000000);
					edittext117.setTextColor(0xFF000000);
					edittext59.setTextColor(0xFFFFFFFF);
					edittext60.setTextColor(0xFFFFFFFF);
				}
			}
		});
		
		edittext56.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext56.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext57.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext57.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext127.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext131.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext58.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview724.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview724)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("إجمالي تكلفة النجارة والحدادة ( جنيه )\nبيتم حسابها علي أساس الكمية التصميمية لا الفعلية لان معظم الخرسانة الموردة بتكون أكبر من التصميمية المحسوبة وبنسب مختلفة غير ثابتة\nوهي = أجمالى كمية الخرسانة للحوائط التي يتم ادخال أبعادها وبياناتها في أول الصفحة ( الكمية التصميمية ) * سعر مصنعية النجارة والحدادة ( جنيه )")
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
		
		edittext117.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext117.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext59.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
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
				edittext60.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button102.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.biltafsil.com/18209/%d8%b3%d8%b9%d8%b1-%d9%85%d8%aa%d8%b1-%d8%a7%d9%84%d8%b1%d9%85%d9%84-%d9%88%d8%a7%d9%84%d8%b2%d9%84%d8%b7/"));
				startActivity(price);
			}
		});
		
		button104.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.biltafsil.com/18209/%d8%b3%d8%b9%d8%b1-%d9%85%d8%aa%d8%b1-%d8%a7%d9%84%d8%b1%d9%85%d9%84-%d9%88%d8%a7%d9%84%d8%b2%d9%84%d8%b7/"));
				startActivity(price);
			}
		});
		
		button105.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.altkia.com/cement-prices-today/"));
				startActivity(price);
			}
		});
		
		button106.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.altkia.com/iron-price-today/"));
				startActivity(price);
			}
		});
		
		edittext61.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext61.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext65.setText(String.valueOf(00.00));
				edittext79.setText(String.valueOf(00.00));
				edittext85.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext65.setTextColor(0xFFE91E63);
				edittext79.setTextColor(0xFFE91E63);
				edittext85.setTextColor(0xFFE91E63);
				edittext86.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview335.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview335)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة الرمل بالخلطة الخرسانية ( م٣ / م٣ ) \" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٤ \"")
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
		
		edittext62.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext62.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext66.setText(String.valueOf(00.00));
				edittext80.setText(String.valueOf(00.00));
				edittext85.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext66.setTextColor(0xFFE91E63);
				edittext80.setTextColor(0xFFE91E63);
				edittext85.setTextColor(0xFFE91E63);
				edittext86.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview340.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview340)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة الزلط أو السن بالخلطة الخرسانية ( م٣ / م٣ ) \" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٨ \"")
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
		
		edittext63.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext63.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext67.setText(String.valueOf(00.00));
				edittext68.setText(String.valueOf(00.00));
				edittext69.setText(String.valueOf(00.00));
				edittext70.setText(String.valueOf(00.00));
				edittext71.setText(String.valueOf(00.00));
				edittext72.setText(String.valueOf(00.00));
				edittext73.setText(String.valueOf(00.00));
				edittext81.setText(String.valueOf(00.00));
				edittext82.setText(String.valueOf(00.00));
				edittext83.setText(String.valueOf(00.00));
				edittext85.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext67.setTextColor(0xFFE91E63);
				edittext68.setTextColor(0xFFE91E63);
				edittext69.setTextColor(0xFFE91E63);
				edittext70.setTextColor(0xFFE91E63);
				edittext71.setTextColor(0xFFE91E63);
				edittext72.setTextColor(0xFFE91E63);
				edittext73.setTextColor(0xFFE91E63);
				edittext81.setTextColor(0xFFE91E63);
				edittext82.setTextColor(0xFFE91E63);
				edittext83.setTextColor(0xFFE91E63);
				edittext85.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview344.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview344)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة الأسمنت بالخلطة الخرسانية [ المحتوي الأسمنتي ] ( كجم / م٣ ) \" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٣٥٠ كجم / م٣ \"")
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
		
		edittext64.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext64.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext73.setText(String.valueOf(00.00));
				edittext83.setText(String.valueOf(00.00));
				edittext85.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext73.setTextColor(0xFFE91E63);
				edittext83.setTextColor(0xFFE91E63);
				edittext85.setTextColor(0xFFE91E63);
				edittext86.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview350.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview350)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة المياه بالخلطة الخرسانية ( لتر / كجم أسمنت ) \" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٥ لتر/كجم أسمنت \"")
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
				edittext132.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext133.setText(String.valueOf(00.00));
				edittext136.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext133.setTextColor(0xFFE91E63);
				edittext136.setTextColor(0xFFE91E63);
				edittext86.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1012.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview1012)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة الهالك بحديد تسليح الحوائط\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١٠ % \"")
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
		
		button82.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext61.getText().toString().equals("") || ((Double.parseDouble(edittext61.getText().toString()) > 0.6d) || (Double.parseDouble(edittext61.getText().toString()) < 0.3d))) {
					edittext61.setText(String.valueOf(0.4d));
				}
				if (edittext62.getText().toString().equals("") || ((Double.parseDouble(edittext62.getText().toString()) > 1) || (Double.parseDouble(edittext62.getText().toString()) < 0.5d))) {
					edittext62.setText(String.valueOf(0.8d));
				}
				if (edittext63.getText().toString().equals("") || ((Double.parseDouble(edittext63.getText().toString()) > 1000) || (Double.parseDouble(edittext63.getText().toString()) < 200))) {
					edittext63.setText(String.valueOf(350));
				}
				if (edittext64.getText().toString().equals("") || ((Double.parseDouble(edittext64.getText().toString()) > 1) || (Double.parseDouble(edittext64.getText().toString()) < 0.3d))) {
					edittext64.setText(String.valueOf(0.5d));
				}
				if (edittext132.getText().toString().equals("") || (Double.parseDouble(edittext132.getText().toString()) < 0)) {
					edittext132.setText(String.valueOf(10));
				}
				edittext65.setText(String.valueOf(Double.parseDouble(edittext61.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())));
				edittext66.setText(String.valueOf(Double.parseDouble(edittext62.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())));
				edittext67.setText(String.valueOf(Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())));
				edittext68.setText(String.valueOf((Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())) / 1000));
				edittext69.setText(String.valueOf((Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())) / 50));
				edittext70.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext69.getText().toString()))));
				edittext71.setText(String.valueOf(Double.parseDouble(edittext70.getText().toString()) * 50));
				edittext72.setText(String.valueOf(Double.parseDouble(edittext71.getText().toString()) / 1000));
				edittext73.setText(String.valueOf(Double.parseDouble(edittext64.getText().toString()) * Double.parseDouble(edittext68.getText().toString())));
				edittext133.setText(String.valueOf(Double.parseDouble(edittext123.getText().toString()) + ((Double.parseDouble(edittext132.getText().toString()) / 100) * Double.parseDouble(edittext123.getText().toString()))));
				edittext65.setTextColor(0xFF000000);
				edittext66.setTextColor(0xFF000000);
				edittext67.setTextColor(0xFF000000);
				edittext68.setTextColor(0xFF000000);
				edittext69.setTextColor(0xFF000000);
				edittext70.setTextColor(0xFF000000);
				edittext71.setTextColor(0xFF000000);
				edittext72.setTextColor(0xFF000000);
				edittext73.setTextColor(0xFF000000);
				edittext133.setTextColor(0xFF000000);
				edittext79.setTextColor(0xFF000000);
				edittext80.setTextColor(0xFF000000);
				edittext81.setTextColor(0xFF000000);
				edittext82.setTextColor(0xFF000000);
				edittext83.setTextColor(0xFF000000);
				edittext119.setTextColor(0xFF000000);
				edittext85.setTextColor(0xFFFFFFFF);
				edittext86.setTextColor(0xFFFFFFFF);
			}
		});
		
		edittext65.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext65.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((edittext41.getText().toString().equals("") || edittext41.getText().toString().equals(".")) || (edittext41.getText().toString().equals("-") || (Double.parseDouble(edittext41.getText().toString()) < 0))) {
					edittext42.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
				else {
					edittext42.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext41.getText().toString()) / 100))));
				}
				edittext79.setText(String.valueOf(00.00));
				edittext79.setTextColor(0xFFE91E63);
				edittext85.setText(String.valueOf(00.00));
				edittext85.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext41.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext41.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext42.setText(String.valueOf(Double.parseDouble(edittext65.getText().toString())));
				}
				else {
					edittext42.setText(String.valueOf(Double.parseDouble(edittext65.getText().toString()) + (Double.parseDouble(edittext65.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1419.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة الهالك بالرمل\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بتجاهله واعتبار قيمته = ٠ % \"");
				return true;
			}
		});
		
		edittext42.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext42.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext193.setText(String.valueOf(00.00));
				edittext193.setTextColor(0xFFE91E63);
				edittext86.setText(String.valueOf(00.00));
				edittext86.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext66.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext66.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((edittext44.getText().toString().equals("") || edittext44.getText().toString().equals(".")) || (edittext44.getText().toString().equals("-") || (Double.parseDouble(edittext44.getText().toString()) < 0))) {
					edittext45.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
				else {
					edittext45.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext44.getText().toString()) / 100))));
				}
				edittext80.setText(String.valueOf(00.00));
				edittext80.setTextColor(0xFFE91E63);
				edittext85.setText(String.valueOf(00.00));
				edittext85.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext44.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext44.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext45.setText(String.valueOf(Double.parseDouble(edittext66.getText().toString())));
				}
				else {
					edittext45.setText(String.valueOf(Double.parseDouble(edittext66.getText().toString()) + (Double.parseDouble(edittext66.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1436.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة الهالك بالزلط أو السن\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بتجاهله واعتبار قيمته = ٠ % \"");
				return true;
			}
		});
		
		edittext45.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext45.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext194.setText(String.valueOf(00.00));
				edittext194.setTextColor(0xFFE91E63);
				edittext86.setText(String.valueOf(00.00));
				edittext86.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext67.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext67.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext68.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext69.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview529.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview529)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد شكاير الأسمنت المطلوبة بدون هالك ( فى حالة وزن الشيكارة ٥٠ كجم )")
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
		
		edittext70.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext70.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview537.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview537)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد شكاير الأسمنت المطلوبة شامل الهالك ( فى حالة وزن الشيكارة ٥٠ كجم )")
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
		
		edittext71.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext71.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext72.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext72.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext73.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext73.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext133.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext74.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext79.setText(String.valueOf(00.00));
				edittext193.setText(String.valueOf(00.00));
				edittext85.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext79.setTextColor(0xFFE91E63);
				edittext193.setTextColor(0xFFE91E63);
				edittext85.setTextColor(0xFFE91E63);
				edittext86.setTextColor(0xFFE91E63);
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
				edittext75.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext80.setText(String.valueOf(00.00));
				edittext194.setText(String.valueOf(00.00));
				edittext85.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext80.setTextColor(0xFFE91E63);
				edittext194.setTextColor(0xFFE91E63);
				edittext85.setTextColor(0xFFE91E63);
				edittext86.setTextColor(0xFFE91E63);
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
				edittext76.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext81.setText(String.valueOf(00.00));
				edittext82.setText(String.valueOf(00.00));
				edittext85.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext81.setTextColor(0xFFE91E63);
				edittext82.setTextColor(0xFFE91E63);
				edittext85.setTextColor(0xFFE91E63);
				edittext86.setTextColor(0xFFE91E63);
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
				edittext77.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext83.setText(String.valueOf(00.00));
				edittext85.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext83.setTextColor(0xFFE91E63);
				edittext85.setTextColor(0xFFE91E63);
				edittext86.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview348.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview348)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("سعر ال م٣ من المياه\n( جنيه / م٣ )\nفي بعض المشروعات لا يتم حساب تكلفة لمياه الخلط وبالتالى يكون سعرها صفر اي بيتم أهمال تكلفة مياه الخلط\n\" مدخل إختياري في حالة عدم الرغبة في إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠٠.٠٠ جنيه/م٣ \"")
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
				edittext134.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext135.setText(String.valueOf(00.00));
				edittext136.setText(String.valueOf(00.00));
				edittext85.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext135.setTextColor(0xFFE91E63);
				edittext136.setTextColor(0xFFE91E63);
				edittext85.setTextColor(0xFFE91E63);
				edittext86.setTextColor(0xFFE91E63);
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
				edittext78.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext84.setText(String.valueOf(00.00));
				edittext85.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext84.setTextColor(0xFFE91E63);
				edittext85.setTextColor(0xFFE91E63);
				edittext86.setTextColor(0xFFE91E63);
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
				edittext118.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext119.setText(String.valueOf(00.00));
				edittext85.setText(String.valueOf(00.00));
				edittext86.setText(String.valueOf(00.00));
				edittext119.setTextColor(0xFFE91E63);
				edittext85.setTextColor(0xFFE91E63);
				edittext86.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview971.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview971)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("سعر مصنعية الصب والفرمجة شامل إيجار الخلاطة ( جنيه / يوم )\nفي حالة عدم الرغبة في ادخاله واعتباره محمل علي سعر النجارة والحدادة سيهمله البرنامج\n\" مدخل إختياري في حالة عدم الرغبة في إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠٠.٠٠ جنيه/م٣ \"")
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
		
		button15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((((edittext74.getText().toString().equals("") || edittext74.getText().toString().equals(".")) || (edittext74.getText().toString().equals("-") || (Double.parseDouble(edittext74.getText().toString()) < 0))) || ((edittext75.getText().toString().equals("") || edittext75.getText().toString().equals(".")) || (edittext75.getText().toString().equals("-") || (Double.parseDouble(edittext75.getText().toString()) < 0)))) || ((edittext76.getText().toString().equals("") || edittext76.getText().toString().equals(".")) || (edittext76.getText().toString().equals("-") || (Double.parseDouble(edittext76.getText().toString()) < 0)))) || (((edittext78.getText().toString().equals("") || edittext78.getText().toString().equals(".")) || (edittext78.getText().toString().equals("-") || (Double.parseDouble(edittext78.getText().toString()) < 0))) || ((edittext134.getText().toString().equals("") || edittext134.getText().toString().equals(".")) || (edittext134.getText().toString().equals("-") || (Double.parseDouble(edittext134.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext61.getText().toString().equals("") || ((Double.parseDouble(edittext61.getText().toString()) > 0.6d) || (Double.parseDouble(edittext61.getText().toString()) < 0.3d))) {
						edittext61.setText(String.valueOf(0.4d));
					}
					if (edittext62.getText().toString().equals("") || ((Double.parseDouble(edittext62.getText().toString()) > 1) || (Double.parseDouble(edittext62.getText().toString()) < 0.5d))) {
						edittext62.setText(String.valueOf(0.8d));
					}
					if (edittext63.getText().toString().equals("") || ((Double.parseDouble(edittext63.getText().toString()) > 300) || (Double.parseDouble(edittext63.getText().toString()) < 100))) {
						edittext63.setText(String.valueOf(350));
					}
					if (edittext64.getText().toString().equals("") || ((Double.parseDouble(edittext64.getText().toString()) > 1) || (Double.parseDouble(edittext64.getText().toString()) < 0.3d))) {
						edittext64.setText(String.valueOf(0.5d));
					}
					if (edittext77.getText().toString().equals("") || (Double.parseDouble(edittext77.getText().toString()) < 0)) {
						edittext77.setText(String.valueOf(00.00d));
					}
					if (edittext118.getText().toString().equals("") || (Double.parseDouble(edittext118.getText().toString()) < 0)) {
						edittext118.setText(String.valueOf((long)(00.00d)));
					}
					if (edittext132.getText().toString().equals("") || (Double.parseDouble(edittext132.getText().toString()) < 0)) {
						edittext132.setText(String.valueOf(10));
					}
					edittext65.setText(String.valueOf(Double.parseDouble(edittext61.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())));
					edittext79.setText(String.valueOf(Double.parseDouble(edittext65.getText().toString()) * Double.parseDouble(edittext74.getText().toString())));
					edittext193.setText(String.valueOf(Double.parseDouble(edittext42.getText().toString()) * Double.parseDouble(edittext74.getText().toString())));
					edittext66.setText(String.valueOf(Double.parseDouble(edittext62.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())));
					edittext80.setText(String.valueOf(Double.parseDouble(edittext66.getText().toString()) * Double.parseDouble(edittext75.getText().toString())));
					edittext194.setText(String.valueOf(Double.parseDouble(edittext45.getText().toString()) * Double.parseDouble(edittext75.getText().toString())));
					edittext67.setText(String.valueOf(Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())));
					edittext68.setText(String.valueOf((Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())) / 1000));
					edittext69.setText(String.valueOf((Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())) / 50));
					edittext70.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext69.getText().toString()))));
					edittext71.setText(String.valueOf(Double.parseDouble(edittext70.getText().toString()) * 50));
					edittext72.setText(String.valueOf(Double.parseDouble(edittext71.getText().toString()) / 1000));
					edittext81.setText(String.valueOf(Double.parseDouble(edittext68.getText().toString()) * Double.parseDouble(edittext76.getText().toString())));
					edittext82.setText(String.valueOf(Double.parseDouble(edittext72.getText().toString()) * Double.parseDouble(edittext76.getText().toString())));
					edittext73.setText(String.valueOf(Double.parseDouble(edittext64.getText().toString()) * Double.parseDouble(edittext68.getText().toString())));
					edittext133.setText(String.valueOf(Double.parseDouble(edittext123.getText().toString()) + ((Double.parseDouble(edittext132.getText().toString()) / 100) * Double.parseDouble(edittext123.getText().toString()))));
					edittext83.setText(String.valueOf(Double.parseDouble(edittext77.getText().toString()) * Double.parseDouble(edittext73.getText().toString())));
					edittext135.setText(String.valueOf(Double.parseDouble(edittext134.getText().toString()) * Double.parseDouble(edittext123.getText().toString())));
					edittext136.setText(String.valueOf(Double.parseDouble(edittext134.getText().toString()) * Double.parseDouble(edittext133.getText().toString())));
					edittext84.setText(String.valueOf(Double.parseDouble(edittext78.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())));
					edittext119.setText(String.valueOf(Double.parseDouble(edittext118.getText().toString()) * Double.parseDouble(total_concrete_sum.getText().toString())));
					edittext85.setText(String.valueOf(((Double.parseDouble(edittext119.getText().toString()) + Double.parseDouble(edittext79.getText().toString())) + (Double.parseDouble(edittext80.getText().toString()) + Double.parseDouble(edittext81.getText().toString()))) + ((Double.parseDouble(edittext83.getText().toString()) + Double.parseDouble(edittext84.getText().toString())) + Double.parseDouble(edittext135.getText().toString()))));
					edittext86.setText(String.valueOf(((Double.parseDouble(edittext119.getText().toString()) + Double.parseDouble(edittext193.getText().toString())) + (Double.parseDouble(edittext194.getText().toString()) + Double.parseDouble(edittext82.getText().toString()))) + ((Double.parseDouble(edittext83.getText().toString()) + Double.parseDouble(edittext84.getText().toString())) + Double.parseDouble(edittext136.getText().toString()))));
					edittext65.setTextColor(0xFF000000);
					edittext79.setTextColor(0xFF000000);
					edittext193.setTextColor(0xFF000000);
					edittext66.setTextColor(0xFF000000);
					edittext80.setTextColor(0xFF000000);
					edittext194.setTextColor(0xFF000000);
					edittext67.setTextColor(0xFF000000);
					edittext68.setTextColor(0xFF000000);
					edittext69.setTextColor(0xFF000000);
					edittext70.setTextColor(0xFF000000);
					edittext71.setTextColor(0xFF000000);
					edittext72.setTextColor(0xFF000000);
					edittext81.setTextColor(0xFF000000);
					edittext82.setTextColor(0xFF000000);
					edittext73.setTextColor(0xFF000000);
					edittext133.setTextColor(0xFF000000);
					edittext83.setTextColor(0xFF000000);
					edittext135.setTextColor(0xFF000000);
					edittext136.setTextColor(0xFF000000);
					edittext84.setTextColor(0xFF000000);
					edittext119.setTextColor(0xFF000000);
					edittext85.setTextColor(0xFFFFFFFF);
					edittext86.setTextColor(0xFFFFFFFF);
				}
			}
		});
		
		edittext79.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext79.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext193.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext80.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext80.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext194.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext194.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext81.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext81.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext82.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext82.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext83.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext83.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext135.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext136.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext84.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview316.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview316)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("إجمالي تكلفة النجارة والحدادة ( جنيه )\nبيتم حسابها علي أساس الكمية التصميمية لا الفعلية لان معظم الخرسانة الموردة بتكون أكبر من التصميمية المحسوبة وبنسب مختلفة غير ثابتة\nوهي = أجمالى كمية الخرسانة للحوائط التي يتم ادخال أبعادها وبياناتها في أول الصفحة ( الكمية التصميمية ) * سعر مصنعية النجارة والحدادة ( جنيه )")
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
				edittext119.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext85.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
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
				edittext86.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button113.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.altkia.com/iron-price-today/"));
				startActivity(price);
			}
		});
		
		edittext87.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext87.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext88.setText(String.valueOf(00.00));
				textview842.setText("");
				edittext112.setText(String.valueOf(00.00));
				textview949.setText("");
				edittext91.setText(String.valueOf(00.00));
				edittext93.setText(String.valueOf(00.00));
				edittext88.setTextColor(0xFFE91E63);
				edittext112.setTextColor(0xFFE91E63);
				edittext91.setTextColor(0xFFE91E63);
				edittext93.setTextColor(0xFFE91E63);
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
				edittext137.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext138.setText(String.valueOf(00.00));
				textview1044.setText("");
				edittext139.setText(String.valueOf(00.00));
				textview1034.setText("");
				edittext141.setText(String.valueOf(00.00));
				edittext93.setText(String.valueOf(00.00));
				edittext138.setTextColor(0xFFE91E63);
				edittext139.setTextColor(0xFFE91E63);
				edittext141.setTextColor(0xFFE91E63);
				edittext93.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button92.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext87.getText().toString().equals("") || edittext87.getText().toString().equals(".")) || (edittext87.getText().toString().equals("-") || (Double.parseDouble(edittext87.getText().toString()) < 0))) || ((edittext137.getText().toString().equals("") || edittext137.getText().toString().equals(".")) || (edittext137.getText().toString().equals("-") || (Double.parseDouble(edittext137.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (Double.parseDouble(edittext87.getText().toString()) < Double.parseDouble(total_concrete_sum.getText().toString())) {
						textview949.setText("الكمية الفعلية\nأقل من\nالكمية الهندسية\nوبالتالي الهالك\nبالسالب وهذا\nغير منطقي\nوغير هندسي\nولكن سيتم استكمال\nالحسابات علي\nهذه الكمية الفعلية\nبغض النظر عن الهالك");
						edittext112.setText(String.valueOf(Double.parseDouble(edittext87.getText().toString()) - Double.parseDouble(total_concrete_sum.getText().toString())));
						textview842.setText("الكمية الفعلية\nأقل من\nالكمية الهندسية\nوبالتالي نسبة الهالك\nبالسالب وهذا غير\nمنطقي وغير هندسي\nولكن سيتم استكمال\nالحسابات علي\nهذه الكمية الفعلية\nبغض النظر عن الهالك");
						edittext88.setText(String.valueOf(((Double.parseDouble(edittext87.getText().toString()) - Double.parseDouble(total_concrete_sum.getText().toString())) / Double.parseDouble(total_concrete_sum.getText().toString())) * 100));
					}
					else {
						textview949.setText("");
						edittext112.setText(String.valueOf(Double.parseDouble(edittext87.getText().toString()) - Double.parseDouble(total_concrete_sum.getText().toString())));
						textview842.setText("");
						edittext88.setText(String.valueOf(((Double.parseDouble(edittext87.getText().toString()) - Double.parseDouble(total_concrete_sum.getText().toString())) / Double.parseDouble(total_concrete_sum.getText().toString())) * 100));
					}
					if (Double.parseDouble(edittext137.getText().toString()) < Double.parseDouble(edittext123.getText().toString())) {
						textview1044.setText("كمية حديد التسليح\nالفعلية أقل من\nكمية حديد التسليح\nالهندسية وبالتالي\nالهالك بالسالب وهذا\nغير منطقي وغير\nهندسي ولكن سيتم\nاستكمال الحسابات\nعلي هذه الكمية\nالفعلية بغض النظر\nعن الهالك");
						edittext138.setText(String.valueOf(Double.parseDouble(edittext137.getText().toString()) - Double.parseDouble(edittext123.getText().toString())));
						textview1034.setText("كمية حديد التسليح\nالفعلية أقل من\nكمية حديد التسليح\nالهندسية وبالتالي\nالهالك بالسالب وهذا\nغير منطقي وغير\nهندسي ولكن سيتم\nاستكمال الحسابات\nعلي هذه الكمية\nالفعلية بغض النظر\nعن الهالك");
						edittext139.setText(String.valueOf(((Double.parseDouble(edittext137.getText().toString()) - Double.parseDouble(edittext123.getText().toString())) / Double.parseDouble(edittext123.getText().toString())) * 100));
					}
					else {
						textview1044.setText("");
						edittext138.setText(String.valueOf(Double.parseDouble(edittext137.getText().toString()) - Double.parseDouble(edittext123.getText().toString())));
						textview1034.setText("");
						edittext139.setText(String.valueOf(((Double.parseDouble(edittext137.getText().toString()) - Double.parseDouble(edittext123.getText().toString())) / Double.parseDouble(edittext123.getText().toString())) * 100));
					}
					edittext112.setTextColor(0xFF000000);
					edittext88.setTextColor(0xFF000000);
					edittext138.setTextColor(0xFF000000);
					edittext139.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext112.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext112.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext88.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview844.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview844)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة الهالك بالخرسانة وهي عبارة عن ( هالك غسيل عربيات نقل الخلطة وهالك البامب ان وجدت )\n\" والطبيعي أن تتراوح قيمته من ٥ % الى ٧ % علي الأكثر \"")
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
				edittext138.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext139.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext89.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext91.setText(String.valueOf(00.00));
				edittext93.setText(String.valueOf(00.00));
				edittext91.setTextColor(0xFFE91E63);
				edittext93.setTextColor(0xFFE91E63);
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
				edittext141.setText(String.valueOf(00.00));
				edittext93.setText(String.valueOf(00.00));
				edittext141.setTextColor(0xFFE91E63);
				edittext93.setTextColor(0xFFE91E63);
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
				edittext90.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext92.setText(String.valueOf(00.00));
				edittext93.setText(String.valueOf(00.00));
				edittext92.setTextColor(0xFFE91E63);
				edittext93.setTextColor(0xFFE91E63);
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
				edittext120.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext121.setText(String.valueOf(00.00));
				edittext93.setText(String.valueOf(00.00));
				edittext121.setTextColor(0xFFE91E63);
				edittext93.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview977.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview977)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("سعر مصنعية الصب والفرمجة ( جنيه / م٣ )\nفي حالة عدم الرغبة في ادخاله واعتباره محمل علي سعر النجارة والحدادة سيهمله البرنامج\n\" مدخل إختياري في حالة عدم الرغبة في إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠٠.٠٠ جنيه/م٣ \"")
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
		
		button91.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((((edittext87.getText().toString().equals("") || edittext87.getText().toString().equals(".")) || (edittext87.getText().toString().equals("-") || (Double.parseDouble(edittext87.getText().toString()) < 0))) || ((edittext137.getText().toString().equals("") || edittext137.getText().toString().equals(".")) || (edittext137.getText().toString().equals("-") || (Double.parseDouble(edittext137.getText().toString()) < 0)))) || ((edittext89.getText().toString().equals("") || edittext89.getText().toString().equals(".")) || (edittext89.getText().toString().equals("-") || (Double.parseDouble(edittext89.getText().toString()) < 0)))) || (((edittext90.getText().toString().equals("") || edittext90.getText().toString().equals(".")) || (edittext90.getText().toString().equals("-") || (Double.parseDouble(edittext90.getText().toString()) < 0))) || ((edittext140.getText().toString().equals("") || edittext140.getText().toString().equals(".")) || (edittext140.getText().toString().equals("-") || (Double.parseDouble(edittext140.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext120.getText().toString().equals("") || edittext120.getText().toString().equals(".")) || (edittext120.getText().toString().equals("-") || (Double.parseDouble(edittext120.getText().toString()) < 0))) {
						edittext120.setText(String.valueOf((long)(00.00d)));
					}
					edittext91.setText(String.valueOf(Double.parseDouble(edittext87.getText().toString()) * Double.parseDouble(edittext89.getText().toString())));
					edittext141.setText(String.valueOf(Double.parseDouble(edittext137.getText().toString()) * Double.parseDouble(edittext140.getText().toString())));
					edittext92.setText(String.valueOf(Double.parseDouble(total_concrete_sum.getText().toString()) * Double.parseDouble(edittext90.getText().toString())));
					edittext121.setText(String.valueOf(Double.parseDouble(total_concrete_sum.getText().toString()) * Double.parseDouble(edittext120.getText().toString())));
					edittext93.setText(String.valueOf((Double.parseDouble(edittext91.getText().toString()) + Double.parseDouble(edittext141.getText().toString())) + (Double.parseDouble(edittext92.getText().toString()) + Double.parseDouble(edittext121.getText().toString()))));
					edittext91.setTextColor(0xFF000000);
					edittext141.setTextColor(0xFF000000);
					edittext92.setTextColor(0xFF000000);
					edittext121.setTextColor(0xFF000000);
					edittext93.setTextColor(0xFFFFFFFF);
				}
			}
		});
		
		edittext91.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext91.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext92.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext92.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview832.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview832)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("إجمالي تكلفة النجارة والحدادة ( جنيه )\nبيتم حسابها علي أساس الكمية التصميمية لا الفعلية لان معظم الخرسانة الموردة بتكون أكبر من التصميمية المحسوبة وبنسب مختلفة غير ثابتة\nوهي = أجمالى كمية الخرسانة للحوائط التي يتم ادخال أبعادها وبياناتها في أول الصفحة ( الكمية التصميمية ) * سعر مصنعية النجارة والحدادة ( جنيه )")
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
				edittext121.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext93.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext93.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button114.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.biltafsil.com/18209/%d8%b3%d8%b9%d8%b1-%d9%85%d8%aa%d8%b1-%d8%a7%d9%84%d8%b1%d9%85%d9%84-%d9%88%d8%a7%d9%84%d8%b2%d9%84%d8%b7/"));
				startActivity(price);
			}
		});
		
		button115.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.biltafsil.com/18209/%d8%b3%d8%b9%d8%b1-%d9%85%d8%aa%d8%b1-%d8%a7%d9%84%d8%b1%d9%85%d9%84-%d9%88%d8%a7%d9%84%d8%b2%d9%84%d8%b7/"));
				startActivity(price);
			}
		});
		
		button116.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.altkia.com/cement-prices-today/"));
				startActivity(price);
			}
		});
		
		button117.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.altkia.com/iron-price-today/"));
				startActivity(price);
			}
		});
		
		edittext94.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext94.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext103.setText(String.valueOf(00.00));
				edittext104.setText(String.valueOf(00.00));
				edittext111.setText(String.valueOf(00.00));
				edittext103.setTextColor(0xFFE91E63);
				edittext104.setTextColor(0xFFE91E63);
				edittext111.setTextColor(0xFFE91E63);
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
				edittext95.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext105.setText(String.valueOf(00.00));
				edittext106.setText(String.valueOf(00.00));
				edittext111.setText(String.valueOf(00.00));
				edittext105.setTextColor(0xFFE91E63);
				edittext106.setTextColor(0xFFE91E63);
				edittext111.setTextColor(0xFFE91E63);
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
				edittext96.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext107.setText(String.valueOf(00.00));
				edittext108.setText(String.valueOf(00.00));
				edittext111.setText(String.valueOf(00.00));
				edittext107.setTextColor(0xFFE91E63);
				edittext108.setTextColor(0xFFE91E63);
				edittext111.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview859.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview859)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("كمية الأسمنت الموردة لزوم الخلطة الخرسانية للحوائط ( شكارة )\n( وذلك بفرض إن وزن شكارة الأسمنت = ٥٠ كجم )")
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
		
		edittext97.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext97.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext109.setText(String.valueOf(00.00));
				edittext111.setText(String.valueOf(00.00));
				edittext109.setTextColor(0xFFE91E63);
				edittext111.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview861.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview861)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("كمية المياه الموردة لزوم الخلطة الخرسانية للحوائط ( م٣ )\nوتمثل نصف كمية الأسمنت بالطن تقريبآ \nولا يمكن إن تزيد قيمته عن ( ٠.٧٥ * كمية الأسمنت بالطن )\nولا يمكن أن تقل عن ( ٠.٢٥ * كمية الأسمنت بالطن )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ( كمية الأسمنت بالطن ÷ ٢ )")
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
				edittext142.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext144.setText(String.valueOf(00.00));
				edittext145.setText(String.valueOf(00.00));
				edittext146.setText(String.valueOf(00.00));
				edittext111.setText(String.valueOf(00.00));
				edittext144.setTextColor(0xFFE91E63);
				edittext145.setTextColor(0xFFE91E63);
				edittext146.setTextColor(0xFFE91E63);
				edittext111.setTextColor(0xFFE91E63);
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
				edittext115.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext114.setText(String.valueOf(00.00));
				edittext111.setText(String.valueOf(00.00));
				edittext114.setTextColor(0xFFE91E63);
				edittext111.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview962.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview962)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد أيام الصب وهو يعبر عن عدد الأيام التي تمت بها صب العنصر الخرساني ومدة ايجار الخلاطة ومعدات الخلط وعمالة الخلط والفرمجة\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ يوم \"")
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
		
		edittext98.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext98.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext103.setText(String.valueOf(00.00));
				edittext104.setText(String.valueOf(00.00));
				edittext111.setText(String.valueOf(00.00));
				edittext103.setTextColor(0xFFE91E63);
				edittext104.setTextColor(0xFFE91E63);
				edittext111.setTextColor(0xFFE91E63);
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
				edittext99.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext105.setText(String.valueOf(00.00));
				edittext106.setText(String.valueOf(00.00));
				edittext111.setText(String.valueOf(00.00));
				edittext105.setTextColor(0xFFE91E63);
				edittext106.setTextColor(0xFFE91E63);
				edittext111.setTextColor(0xFFE91E63);
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
				edittext100.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext107.setText(String.valueOf(00.00));
				edittext108.setText(String.valueOf(00.00));
				edittext111.setText(String.valueOf(00.00));
				edittext107.setTextColor(0xFFE91E63);
				edittext108.setTextColor(0xFFE91E63);
				edittext111.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext101.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext101.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext109.setText(String.valueOf(00.00));
				edittext111.setText(String.valueOf(00.00));
				edittext109.setTextColor(0xFFE91E63);
				edittext111.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview904.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview904)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("سعر ال م٣ من المياه\n( جنيه / م٣ )\nفي بعض المشروعات لا يتم حساب تكلفة لمياه الخلط وبالتالى يكون سعرها صفر اي بيتم أهمال تكلفة مياه الخلط\n\" مدخل إختياري في حالة عدم الرغبة في إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠٠.٠٠ جنيه/م٣ \"")
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
				edittext143.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext146.setText(String.valueOf(00.00));
				edittext111.setText(String.valueOf(00.00));
				edittext146.setTextColor(0xFFE91E63);
				edittext111.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext102.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext102.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext110.setText(String.valueOf(00.00));
				edittext111.setText(String.valueOf(00.00));
				edittext110.setTextColor(0xFFE91E63);
				edittext111.setTextColor(0xFFE91E63);
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
				edittext113.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext114.setText(String.valueOf(00.00));
				edittext111.setText(String.valueOf(00.00));
				edittext114.setTextColor(0xFFE91E63);
				edittext111.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview956.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview956)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("سعر مصنعية الصب والفرمجة شامل إيجار الخلاطة ( جنيه / يوم )\nفي حالة عدم الرغبة في ادخاله واعتباره محمل علي سعر النجارة والحدادة سيهمله البرنامج\n\" مدخل إختياري في حالة عدم الرغبة في إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠٠.٠٠ جنيه/يوم \"")
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
		
		button94.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext94.getText().toString().equals("") || edittext94.getText().toString().equals(".")) || (edittext94.getText().toString().equals("-") || (Double.parseDouble(edittext94.getText().toString()) < 0))) || (((((edittext95.getText().toString().equals("") || edittext95.getText().toString().equals(".")) || (edittext95.getText().toString().equals("-") || (Double.parseDouble(edittext95.getText().toString()) < 0))) || ((edittext96.getText().toString().equals("") || edittext96.getText().toString().equals(".")) || (edittext96.getText().toString().equals("-") || (Double.parseDouble(edittext96.getText().toString()) < 0)))) || (((edittext98.getText().toString().equals("") || edittext98.getText().toString().equals(".")) || (edittext98.getText().toString().equals("-") || (Double.parseDouble(edittext98.getText().toString()) < 0))) || ((edittext99.getText().toString().equals("") || edittext99.getText().toString().equals(".")) || (edittext99.getText().toString().equals("-") || (Double.parseDouble(edittext99.getText().toString()) < 0))))) || ((((edittext100.getText().toString().equals("") || edittext100.getText().toString().equals(".")) || (edittext100.getText().toString().equals("-") || (Double.parseDouble(edittext100.getText().toString()) < 0))) || ((edittext102.getText().toString().equals("") || edittext102.getText().toString().equals(".")) || (edittext102.getText().toString().equals("-") || (Double.parseDouble(edittext102.getText().toString()) < 0)))) || (((edittext142.getText().toString().equals("") || edittext142.getText().toString().equals(".")) || (edittext142.getText().toString().equals("-") || (Double.parseDouble(edittext142.getText().toString()) < 0))) || ((edittext143.getText().toString().equals("") || edittext143.getText().toString().equals(".")) || (edittext143.getText().toString().equals("-") || (Double.parseDouble(edittext143.getText().toString()) < 0))))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (((edittext97.getText().toString().equals("") || edittext97.getText().toString().equals(".")) || (edittext97.getText().toString().equals("-") || (Double.parseDouble(edittext97.getText().toString()) < 0))) || ((Double.parseDouble(edittext97.getText().toString()) > (0.75d * ((Double.parseDouble(edittext96.getText().toString()) * 50) / 1000))) || (Double.parseDouble(edittext97.getText().toString()) < (0.25d * ((Double.parseDouble(edittext96.getText().toString()) * 50) / 1000))))) {
						edittext97.setText(String.valueOf(0.5d * ((Double.parseDouble(edittext96.getText().toString()) * 50) / 1000)));
					}
					if ((edittext101.getText().toString().equals("") || edittext101.getText().toString().equals(".")) || (edittext101.getText().toString().equals("-") || (Double.parseDouble(edittext101.getText().toString()) < 0))) {
						edittext101.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext115.getText().toString().equals("") || edittext115.getText().toString().equals(".")) || (edittext115.getText().toString().equals("-") || (Double.parseDouble(edittext115.getText().toString()) < 0))) {
						edittext115.setText(String.valueOf(Double.parseDouble("1")));
					}
					if ((edittext113.getText().toString().equals("") || edittext113.getText().toString().equals(".")) || (edittext113.getText().toString().equals("-") || (Double.parseDouble(edittext113.getText().toString()) < 0))) {
						edittext113.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					edittext103.setText(String.valueOf(Double.parseDouble(edittext94.getText().toString()) * Double.parseDouble(edittext98.getText().toString())));
					edittext104.setText(String.valueOf(Double.parseDouble(edittext94.getText().toString()) / Double.parseDouble(total_concrete_sum.getText().toString())));
					if (Double.parseDouble(edittext104.getText().toString()) < 0.2d) {
						textview939.setText("نسبة الرمل\nبالنسبة لكمية\nخرسانة القواعد\nالمسلحة أقل من\n٠.٢٠\nوهذه قيمة\nصغيرة جدآ\nوغير هندسية");
					}
					else {
						if (Double.parseDouble(edittext104.getText().toString()) > 0.7d) {
							textview939.setText("نسبة الرمل\nبالنسبة لكمية\nخرسانة القواعد\nالمسلحة أكبر من\n٠.٧٠\nوهذه قيمة\nكبيرة جدآ\nوغير هندسية");
						}
						else {
							textview939.setText("");
						}
					}
					edittext105.setText(String.valueOf(Double.parseDouble(edittext95.getText().toString()) * Double.parseDouble(edittext99.getText().toString())));
					edittext106.setText(String.valueOf(Double.parseDouble(edittext95.getText().toString()) / Double.parseDouble(total_concrete_sum.getText().toString())));
					if (Double.parseDouble(edittext106.getText().toString()) < 0.4d) {
						textview940.setText("نسبة الزلط أو\nالسن بالنسبة\nلكمية خرسانة \nالقواعد المسلحة\nأقل من ٠.٤٠\nوهذه قيمة\nصغيرة جدآ\nوغير هندسية");
					}
					else {
						if (Double.parseDouble(edittext106.getText().toString()) > 0.9d) {
							textview940.setText("نسبة الزلط أو\nالسن بالنسبة\nلكمية خرسانة \nالقواعد المسلحة\nأكبر من ٠.٩٠\nوهذه قيمة\nكبيرة جدآ\nوغير هندسية");
						}
						else {
							textview940.setText("");
						}
					}
					edittext107.setText(String.valueOf(((Double.parseDouble(edittext96.getText().toString()) * 50) / 1000) * Double.parseDouble(edittext100.getText().toString())));
					edittext108.setText(String.valueOf((Double.parseDouble(edittext96.getText().toString()) * 50) / Double.parseDouble(total_concrete_sum.getText().toString())));
					if (Double.parseDouble(edittext108.getText().toString()) < 200) {
						textview914.setText("نسبة الأسمنت\nبالخلطة الخرسانية\nأقل من ٢٠٠ كجم/م٣\nوهذه قيمة صغيرة\nجدآ وغير هندسية");
					}
					else {
						if (Double.parseDouble(edittext108.getText().toString()) > 1000) {
							textview914.setText("نسبة الأسمنت\nبالخلطة الخرسانية\nأكبر من ١٠٠٠ كجم/م٣\nوهذه قيمة كبيرة\nجدآ وغير هندسية");
						}
						else {
							textview914.setText("");
						}
					}
					if (Double.parseDouble(edittext142.getText().toString()) < Double.parseDouble(edittext123.getText().toString())) {
						textview1069.setText("كمية حديد التسليح\nالفعلية أقل من\nكمية حديد التسليح\nالهندسية وبالتالي\nالهالك بالسالب وهذا\nغير منطقي وغير\nهندسي ولكن سيتم\nاستكمال الحسابات\nعلي هذه الكمية\nالفعلية بغض النظر\nعن الهالك");
						edittext144.setText(String.valueOf(Double.parseDouble(edittext142.getText().toString()) - Double.parseDouble(edittext123.getText().toString())));
						textview1068.setText("كمية حديد التسليح\nالفعلية أقل من\nكمية حديد التسليح\nالهندسية وبالتالي\nالهالك بالسالب وهذا\nغير منطقي وغير\nهندسي ولكن سيتم\nاستكمال الحسابات\nعلي هذه الكمية\nالفعلية بغض النظر\nعن الهالك");
						edittext145.setText(String.valueOf(((Double.parseDouble(edittext142.getText().toString()) - Double.parseDouble(edittext123.getText().toString())) / Double.parseDouble(edittext123.getText().toString())) * 100));
					}
					else {
						textview1069.setText("");
						edittext144.setText(String.valueOf(Double.parseDouble(edittext142.getText().toString()) - Double.parseDouble(edittext123.getText().toString())));
						textview1068.setText("");
						edittext145.setText(String.valueOf(((Double.parseDouble(edittext142.getText().toString()) - Double.parseDouble(edittext123.getText().toString())) / Double.parseDouble(edittext123.getText().toString())) * 100));
					}
					edittext146.setText(String.valueOf(Double.parseDouble(edittext142.getText().toString()) * Double.parseDouble(edittext143.getText().toString())));
					edittext109.setText(String.valueOf(Double.parseDouble(edittext97.getText().toString()) * Double.parseDouble(edittext101.getText().toString())));
					edittext110.setText(String.valueOf(Double.parseDouble(total_concrete_sum.getText().toString()) * Double.parseDouble(edittext102.getText().toString())));
					edittext114.setText(String.valueOf(Double.parseDouble(edittext115.getText().toString()) * Double.parseDouble(edittext113.getText().toString())));
					edittext111.setText(String.valueOf(((Double.parseDouble(edittext103.getText().toString()) + Double.parseDouble(edittext105.getText().toString())) + Double.parseDouble(edittext107.getText().toString())) + (Double.parseDouble(edittext109.getText().toString()) + (Double.parseDouble(edittext110.getText().toString()) + (Double.parseDouble(edittext114.getText().toString()) + Double.parseDouble(edittext146.getText().toString()))))));
					edittext103.setTextColor(0xFF000000);
					edittext104.setTextColor(0xFF000000);
					edittext105.setTextColor(0xFF000000);
					edittext106.setTextColor(0xFF000000);
					edittext107.setTextColor(0xFF000000);
					edittext108.setTextColor(0xFF000000);
					edittext144.setTextColor(0xFF000000);
					edittext145.setTextColor(0xFF000000);
					edittext146.setTextColor(0xFF000000);
					edittext109.setTextColor(0xFF000000);
					edittext110.setTextColor(0xFF000000);
					edittext114.setTextColor(0xFF000000);
					edittext111.setTextColor(0xFFFFFFFF);
				}
			}
		});
		
		edittext104.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext104.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext103.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext103.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext106.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext105.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext108.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext107.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext109.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				edittext110.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview929.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccReinforcedconcreteWallssActivity.this, textview929)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("إجمالي تكلفة النجارة والحدادة ( جنيه )\nبيتم حسابها علي أساس الكمية التصميمية لا الفعلية لان معظم الخرسانة الموردة بتكون أكبر من التصميمية المحسوبة وبنسب مختلفة غير ثابتة\nوهي = أجمالى كمية الخرسانة للحوائط التي يتم ادخال أبعادها وبياناتها في أول الصفحة ( الكمية التصميمية ) * سعر مصنعية النجارة والحدادة ( جنيه )")
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
				edittext114.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext111.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext111.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
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
		linear256.setVisibility(View.GONE);
		linear337.setVisibility(View.GONE);
		linear178.setVisibility(View.GONE);
		linear140.setVisibility(View.GONE);
		linear290.setVisibility(View.GONE);
		linear301.setVisibility(View.GONE);
		_CardStyle(textview808, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button95, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button96, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button68, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button67, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button97, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button98, 25, 25, "#FF4DD0E1", false);
		/*
شكل ال linears
*/
		/*
التكلفة
*/
		_round(linear75, "#FFC5CAE9", "#FF000000", 50);
		_round(linear351, "#FFC5CAE9", "#FF000000", 50);
		_round(linear388, "#FFE0F2F1", "#FF000000", 0);
		_round(linear178, "#FFE0F2F1", "#FF000000", 50);
		_round(linear140, "#FFE0F2F1", "#FF000000", 50);
		_round(linear290, "#FFE0F2F1", "#FF000000", 50);
		_round(linear301, "#FFE0F2F1", "#FF000000", 50);
		/*
الدينامك
*/
		linear74.setVisibility(View.GONE);
		add_dynamic_hole_linear.setVisibility(View.GONE);
		dynamic_concrete_sum_linear.setVisibility(View.GONE);
		_CardStyle(add_dynamic_element, 25, 25, "#FF4DD0E1", false);
		/*
الأعلانات
*/
		
		{
		}
		/*
التعليقات علي الابعاد
*/
		textview666.setVisibility(View.GONE);
		textview668.setVisibility(View.GONE);
		textview56.setVisibility(View.GONE);
		textview555.setVisibility(View.GONE);
		textview556.setVisibility(View.GONE);
		/*
التعليقات علي الابعاد
*/
		edittext444.setVisibility(View.GONE);
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
		PrintHelper printHelper = new PrintHelper(ToipccReinforcedconcreteWallssActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
	
	public void _dynamic_view() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_wall_linear = (LinearLayout) inflater.inflate(R.layout.toipcc_d_wall_plastering, null, false);
		add_dynamic_wall_linear.addView(dynamic_wall_linear);
		/*
تعريف الدينامك
*/
		final TextView d_textview1 = dynamic_wall_linear.findViewById(R.id.d_textview1);
		final TextView d_textview2 = dynamic_wall_linear.findViewById(R.id.d_textview2);
		final TextView d_textview3 = dynamic_wall_linear.findViewById(R.id.d_textview3);
		final TextView d_textview4 = dynamic_wall_linear.findViewById(R.id.d_textview4);
		final TextView d_textview5 = dynamic_wall_linear.findViewById(R.id.d_textview5);
		final TextView d_textview6 = dynamic_wall_linear.findViewById(R.id.d_textview6);
		final TextView d_textview510 = dynamic_wall_linear.findViewById(R.id.d_textview510);
		final TextView d_textview7 = dynamic_wall_linear.findViewById(R.id.d_textview7);
		final TextView d_textview511 = dynamic_wall_linear.findViewById(R.id.d_textview511);
		final TextView d_textview8 = dynamic_wall_linear.findViewById(R.id.d_textview8);
		final TextView d_textview9 = dynamic_wall_linear.findViewById(R.id.d_textview9);
		final EditText d_edittext1 = dynamic_wall_linear.findViewById(R.id.d_edittext1);
		d_edittext1.setSingleLine(true);
		d_edittext1.setFocusableInTouchMode(true);
		final EditText d_edittext2 = dynamic_wall_linear.findViewById(R.id.d_edittext2);
		d_edittext2.setSingleLine(true);
		d_edittext2.setFocusableInTouchMode(true);
		final EditText d_edittext3 = dynamic_wall_linear.findViewById(R.id.d_edittext3);
		d_edittext3.setSingleLine(true);
		d_edittext3.setFocusableInTouchMode(true);
		final EditText d_edittext4 = dynamic_wall_linear.findViewById(R.id.d_edittext4);
		d_edittext4.setSingleLine(true);
		d_edittext4.setFocusableInTouchMode(true);
		final EditText d_edittext5 = dynamic_wall_linear.findViewById(R.id.d_edittext5);
		d_edittext5.setSingleLine(true);
		d_edittext5.setFocusableInTouchMode(true);
		final EditText d_edittext6 = dynamic_wall_linear.findViewById(R.id.d_edittext6);
		d_edittext6.setSingleLine(true);
		d_edittext6.setFocusableInTouchMode(true);
		final EditText d_edittext7 = dynamic_wall_linear.findViewById(R.id.d_edittext7);
		d_edittext7.setSingleLine(true);
		d_edittext7.setFocusableInTouchMode(true);
		final EditText d_edittext17 = dynamic_wall_linear.findViewById(R.id.d_edittext17);
		d_edittext17.setSingleLine(true);
		d_edittext17.setFocusableInTouchMode(true);
		final LinearLayout d_add_dynamic_hole_linear = dynamic_wall_linear.findViewById(R.id.d_add_dynamic_hole_linear);
		final Button d_button1 = dynamic_wall_linear.findViewById(R.id.d_button1);
		final Button d_add_dynamic_hole = dynamic_wall_linear.findViewById(R.id.d_add_dynamic_hole);
		final ImageView d_close_wall = dynamic_wall_linear.findViewById(R.id.d_close_wall);
		/*
اخفاء الجزء الخاص بعرض الحائط والمستخدم ف المباني
*/
		final TextView d_textview14 = dynamic_wall_linear.findViewById(R.id.d_textview14);
		final LinearLayout d_linear161 = dynamic_wall_linear.findViewById(R.id.d_linear161);
		final TextView d_textview11 = dynamic_wall_linear.findViewById(R.id.d_textview11);
		final EditText d_edittext22 = dynamic_wall_linear.findViewById(R.id.d_edittext22);
		d_edittext22.setSingleLine(true);
		d_edittext22.setFocusableInTouchMode(true);
		d_edittext22.setHint("0.25");
		d_textview14.setVisibility(View.GONE);
		d_linear161.setVisibility(View.GONE);
		d_textview11.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* عرض الحائط أو سمك الحائط ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٢٥ م \"");
				return true;
			}
		});
		/*
تعريفات العرض او السمك للفتحة في حالة الحائط شبه منحرف اي يوجد عرضين للحائط" عرض علوى وعرض سفلي "
*/
		final LinearLayout d_linear33 = dynamic_wall_linear.findViewById(R.id.d_linear33);
		final EditText d_edittext36 = dynamic_wall_linear.findViewById(R.id.d_edittext36);
		d_edittext36.setSingleLine(true);
		d_edittext36.setFocusableInTouchMode(true);
		final EditText d_edittext35 = dynamic_wall_linear.findViewById(R.id.d_edittext35);
		d_edittext35.setSingleLine(true);
		d_edittext35.setFocusableInTouchMode(true);
		final EditText d_edittext32 = dynamic_wall_linear.findViewById(R.id.d_edittext32);
		d_edittext32.setSingleLine(true);
		d_edittext32.setFocusableInTouchMode(true);
		final TextView d_textview555 = dynamic_wall_linear.findViewById(R.id.d_textview555);
		final TextView d_textview556 = dynamic_wall_linear.findViewById(R.id.d_textview556);
		d_linear33.setVisibility(View.VISIBLE);
		d_textview555.setVisibility(View.GONE);
		d_textview556.setVisibility(View.GONE);
		/*
تعريف خانة مقارنة العروض
*/
		final EditText d_edittext444 = dynamic_wall_linear.findViewById(R.id.d_edittext444);
		d_edittext444.setSingleLine(true);
		d_edittext444.setFocusableInTouchMode(true);
		d_edittext444.setVisibility(View.GONE);
		/*
مكعب الحوائط
*/
		final TextView d_textview15 = dynamic_wall_linear.findViewById(R.id.d_textview15);
		final LinearLayout d_linear758 = dynamic_wall_linear.findViewById(R.id.d_linear758);
		final TextView d_textview10 = dynamic_wall_linear.findViewById(R.id.d_textview10);
		final EditText d_edittext20 = dynamic_wall_linear.findViewById(R.id.d_edittext20);
		d_edittext20.setSingleLine(true);
		d_edittext20.setFocusableInTouchMode(true);
		d_textview15.setVisibility(View.VISIBLE);
		d_linear758.setVisibility(View.VISIBLE);
		/*
اخفاء اجمالى مسطح الحوائط
*/
		final LinearLayout d_linear183 = dynamic_wall_linear.findViewById(R.id.d_linear183);
		d_linear183.setVisibility(View.GONE);
		/*
أخفاء linear اجمالي الفتحات
*/
		/*
مسطح اجمالي الفتحات
*/
		final EditText d_edittext16 = dynamic_wall_linear.findViewById(R.id.d_edittext16);
		d_edittext16.setSingleLine(true);
		d_edittext16.setFocusableInTouchMode(true);
		final LinearLayout d_linear722 = dynamic_wall_linear.findViewById(R.id.d_linear722);
		d_linear722.setVisibility(View.GONE);
		/*
اجمالي مكعب الفتحات
*/
		final EditText d_edittext15 = dynamic_wall_linear.findViewById(R.id.d_edittext15);
		d_edittext15.setSingleLine(true);
		d_edittext15.setFocusableInTouchMode(true);
		final LinearLayout d_linear74 = dynamic_wall_linear.findViewById(R.id.d_linear74);
		d_linear74.setVisibility(View.GONE);
		/*
التعليقات علي اجمالي الكميات
*/
		final TextView d_textview55 = dynamic_wall_linear.findViewById(R.id.d_textview55);
		final TextView d_textview56 = dynamic_wall_linear.findViewById(R.id.d_textview56);
		d_textview55.setVisibility(View.GONE);
		d_textview56.setVisibility(View.GONE);
		d_textview56.setText("المكعب الأجمالي لخرسانة جميع الحوائط من هذا النموذج أقل من المكعب الاجمالى لجميع الفتحات");
		/*
التعليقات علي ابعاد الحائط
*/
		final TextView d_textview666 = dynamic_wall_linear.findViewById(R.id.d_textview666);
		final TextView d_textview667 = dynamic_wall_linear.findViewById(R.id.d_textview667);
		final TextView d_textview668 = dynamic_wall_linear.findViewById(R.id.d_textview668);
		d_textview666.setVisibility(View.GONE);
		d_textview667.setVisibility(View.GONE);
		d_textview668.setVisibility(View.GONE);
		/*
ترقيم الفتحات
*/
		d_edittext6.setText(String.valueOf((long)(add_dynamic_wall_linear.getChildCount() + 1)));
		d_edittext7.setText(String.valueOf((long)(add_dynamic_wall_linear.getChildCount() + 1)));
		d_edittext6.addTextChangedListener(new TextWatcher() { 	
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
					d_edittext7.setText("");
				}
				else {
					d_edittext7.setText(String.valueOf((long)(Double.parseDouble(s.toString()))));
				}
			} });
		/*
التعليقات والتعريفات للابعاد الخرسانيه
*/
		d_textview1.setText("نموذج حائط من الخرسانة المسلحة رقم :");
		d_textview2.setText("ح.خ.م");
		d_textview4.setText("* ارتفاع الحائط ( م )");
		d_textview4.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* ارتفاع الحائط ( م )\nوالمقصود هنا صافي ارتفاع الحائط الخرساني المسلح");
				return true;
			}
		});
		d_textview6.setText("كمية الخرسانة المسلحة بالحائط الواحد ( م٣ )");
		d_textview510.setText("م٣");
		d_textview7.setText("الكمية الأجمالية للخرسانة المسلحة لجميع الحوائط من نفس النموذج ( م٣ )");
		d_textview511.setText("م٣");
		d_edittext5.setBackgroundColor(0xFFD7CCC8);
		d_textview9.setText("المسطح الأجمالي لمباني جميع الحوائط من هذا النموذج بعد خصم الفتحات ( م٢ )");
		d_textview10.setText("الكمية الأجمالية لخرسانة جميع الحوائط من هذا النموذج بعد خصم الفتحات ( م٣ )");
		d_textview5.setText("* عدد الحوائط من هذا النموذج");
		d_textview5.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* عدد الحوائط\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ حائط \"");
				return true;
			}
		});
		/*
ثالثآ : أوامر المربعات أو الناتج أو كمية العنصر الواحد
*/
		d_edittext1.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String d_edittext1nn = _param1.toString();
								
d_edittext1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				d_edittext4.setText(String.valueOf(00.00));
				d_edittext5.setText(String.valueOf(00.00));
				d_edittext4.setTextColor(0xFFE91E63);
				d_edittext5.setTextColor(0xFFE91E63);
				d_textview666.setVisibility(View.GONE);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		d_edittext2.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String d_edittext2nn = _param1.toString();
								
d_edittext2.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				d_edittext4.setText(String.valueOf(00.00));
				d_edittext5.setText(String.valueOf(00.00));
				d_edittext4.setTextColor(0xFFE91E63);
				d_edittext5.setTextColor(0xFFE91E63);
				d_textview668.setVisibility(View.GONE);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
أوامر العرضين
*/
		d_edittext36.addTextChangedListener(new TextWatcher() { 	
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
					
					
				d_edittext36.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) || ((d_edittext35.getText().toString().equals("") || d_edittext35.getText().toString().equals(".")) || (d_edittext35.getText().toString().equals("-") || (Double.parseDouble(d_edittext35.getText().toString()) < 0)))) {
					d_edittext32.setText(String.valueOf(00.00d));
				}
				else {
					d_edittext32.setText(String.valueOf((Double.parseDouble(s.toString()) + Double.parseDouble(d_edittext35.getText().toString())) / 2));
				}
				d_textview555.setVisibility(View.GONE);
			} });
		d_edittext35.addTextChangedListener(new TextWatcher() { 	
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
					
					
				d_edittext35.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) || ((d_edittext36.getText().toString().equals("") || d_edittext36.getText().toString().equals(".")) || (d_edittext36.getText().toString().equals("-") || (Double.parseDouble(d_edittext36.getText().toString()) < 0)))) {
					d_edittext32.setText(String.valueOf(00.00d));
				}
				else {
					d_edittext32.setText(String.valueOf((Double.parseDouble(s.toString()) + Double.parseDouble(d_edittext36.getText().toString())) / 2));
				}
				d_textview556.setVisibility(View.GONE);
			} });
		d_edittext32.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String d_edittext32nn = _param1.toString();
								
d_edittext32.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				d_edittext4.setText(String.valueOf(00.00));
				d_edittext4.setTextColor(0xFFE91E63);
				d_edittext5.setText(String.valueOf(00.00));
				d_edittext5.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
نهاية أوامر العرضين
*/
		d_edittext3.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String d_edittext3nn = _param1.toString();
								
d_edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				d_edittext5.setText(String.valueOf(00.00));
				d_edittext5.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		d_button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((((d_edittext1.getText().toString().equals("") || d_edittext1.getText().toString().equals(".")) || (d_edittext1.getText().toString().equals("-") || (Double.parseDouble(d_edittext1.getText().toString()) < 0))) || ((d_edittext2.getText().toString().equals("") || d_edittext2.getText().toString().equals(".")) || (d_edittext2.getText().toString().equals("-") || (Double.parseDouble(d_edittext2.getText().toString()) < 0)))) || (((d_edittext35.getText().toString().equals("") || d_edittext35.getText().toString().equals(".")) || (d_edittext35.getText().toString().equals("-") || (Double.parseDouble(d_edittext35.getText().toString()) < 0))) || ((d_edittext36.getText().toString().equals("") || d_edittext36.getText().toString().equals(".")) || (d_edittext36.getText().toString().equals("-") || (Double.parseDouble(d_edittext36.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((d_edittext3.getText().toString().equals("") || d_edittext3.getText().toString().equals(".")) || (d_edittext3.getText().toString().equals("-") || (Double.parseDouble(d_edittext3.getText().toString()) < 0))) {
						d_edittext3.setText(String.valueOf(1));
					}
					d_edittext4.setText(String.valueOf(Double.parseDouble(d_edittext1.getText().toString()) * (Double.parseDouble(d_edittext2.getText().toString()) * Double.parseDouble(d_edittext32.getText().toString()))));
					d_edittext4.setTextColor(0xFF000000);
					d_edittext444.setText(String.valueOf(Double.parseDouble(d_edittext1.getText().toString()) * (Double.parseDouble(d_edittext2.getText().toString()) * Double.parseDouble(d_edittext32.getText().toString()))));
					d_edittext444.setTextColor(0xFF000000);
				}
			}
		});
		d_edittext4.addTextChangedListener(new TextWatcher() { 	
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
					
					
				d_edittext4.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((d_edittext3.getText().toString().equals("") || d_edittext3.getText().toString().equals(".")) || (d_edittext3.getText().toString().equals("-") || (Double.parseDouble(d_edittext3.getText().toString()) < 0))) {
					/*

*/
				}
				else {
					d_edittext5.setText(String.valueOf(Double.parseDouble(s.toString()) * Double.parseDouble(d_edittext3.getText().toString())));
					d_edittext5.setTextColor(0xFF000000);
				}
			} });
		d_edittext5.addTextChangedListener(new TextWatcher() { 	
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
					
					
				d_edittext5.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (d_linear74.getVisibility() == View.VISIBLE) {
					if (Double.parseDouble(s.toString()) == 00.00d) {
						d_edittext20.setText(String.valueOf(Double.parseDouble("00.00")));
						d_textview56.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(s.toString())) && (Double.parseDouble(s.toString()) < Double.parseDouble(d_edittext15.getText().toString()))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مكعب كل الفتحات أكبر من اجمالي مكعب الحوائط وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							d_edittext20.setText(String.valueOf(Double.parseDouble("00.00")));
							d_edittext20.setTextColor(0xFFE91E63);
							d_textview56.setVisibility(View.VISIBLE);
						}
						else {
							d_edittext20.setText(String.valueOf(Double.parseDouble(s.toString()) - Double.parseDouble(d_edittext15.getText().toString())));
							d_edittext20.setTextColor(0xFF000000);
							d_textview56.setVisibility(View.GONE);
						}
					}
				}
				else {
					d_edittext20.setText(String.valueOf(Double.parseDouble(s.toString()) - Double.parseDouble(d_edittext15.getText().toString())));
					d_edittext20.setTextColor(0xFF000000);
					d_textview56.setVisibility(View.GONE);
				}
			} });
		d_add_dynamic_hole.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				/*
اظهار linear اجمالي الفتحات
*/
				d_linear722.setVisibility(View.GONE);
				d_linear74.setVisibility(View.VISIBLE);
				/*
دينامك الفتحات
*/
				LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
				final LinearLayout dynamic_hole_linear2 = (LinearLayout) inflater.inflate(R.layout.toipcc_d_hole_plastering, null, false);
				d_add_dynamic_hole_linear.addView(dynamic_hole_linear2);
				/*
تعريف الدينامك
*/
				final TextView textview1d = dynamic_hole_linear2.findViewById(R.id.textview1d);
				final TextView textview2d = dynamic_hole_linear2.findViewById(R.id.textview2d);
				final TextView textview3d = dynamic_hole_linear2.findViewById(R.id.textview3d);
				final TextView textview4d = dynamic_hole_linear2.findViewById(R.id.textview4d);
				final TextView textview6d = dynamic_hole_linear2.findViewById(R.id.textview6d);
				final TextView textview7d = dynamic_hole_linear2.findViewById(R.id.textview7d);
				final TextView textview9d = dynamic_hole_linear2.findViewById(R.id.textview9d);
				final TextView textview10d = dynamic_hole_linear2.findViewById(R.id.textview10d);
				final TextView textview20d = dynamic_hole_linear2.findViewById(R.id.textview20d);
				final TextView textview21d = dynamic_hole_linear2.findViewById(R.id.textview21d);
				final TextView textview22d = dynamic_hole_linear2.findViewById(R.id.textview22d);
				final TextView textview23d = dynamic_hole_linear2.findViewById(R.id.textview23d);
				final EditText edittext6d = dynamic_hole_linear2.findViewById(R.id.edittext6d);
				edittext6d.setSingleLine(true);
				edittext6d.setFocusableInTouchMode(true);
				final EditText edittext7d = dynamic_hole_linear2.findViewById(R.id.edittext7d);
				edittext7d.setSingleLine(true);
				edittext7d.setFocusableInTouchMode(true);
				final EditText edittext8d = dynamic_hole_linear2.findViewById(R.id.edittext8d);
				edittext8d.setSingleLine(true);
				edittext8d.setFocusableInTouchMode(true);
				final EditText edittext9d = dynamic_hole_linear2.findViewById(R.id.edittext9d);
				edittext9d.setSingleLine(true);
				edittext9d.setFocusableInTouchMode(true);
				final EditText edittext11d = dynamic_hole_linear2.findViewById(R.id.edittext11d);
				edittext11d.setSingleLine(true);
				edittext11d.setFocusableInTouchMode(true);
				final EditText edittext12d = dynamic_hole_linear2.findViewById(R.id.edittext12d);
				edittext12d.setSingleLine(true);
				edittext12d.setFocusableInTouchMode(true);
				final EditText edittext14d = dynamic_hole_linear2.findViewById(R.id.edittext14d);
				edittext14d.setSingleLine(true);
				edittext14d.setFocusableInTouchMode(true);
				final EditText edittext15d = dynamic_hole_linear2.findViewById(R.id.edittext15d);
				edittext15d.setSingleLine(true);
				edittext15d.setFocusableInTouchMode(true);
				final Button button2d = dynamic_hole_linear2.findViewById(R.id.button2d);
				final ImageView close_hole_d = dynamic_hole_linear2.findViewById(R.id.close_hole_d);
				/*
الأطوال الموازية
*/
				final EditText edittext8dd = dynamic_hole_linear2.findViewById(R.id.edittext8dd);
				edittext8dd.setSingleLine(true);
				edittext8dd.setFocusableInTouchMode(true);
				final EditText edittext9dd = dynamic_hole_linear2.findViewById(R.id.edittext9dd);
				edittext9dd.setSingleLine(true);
				edittext9dd.setFocusableInTouchMode(true);
				edittext8dd.setVisibility(View.GONE);
				edittext9dd.setVisibility(View.GONE);
				/*
تعريفات العرض او السمك للفتحة
*/
				final LinearLayout linear722d = dynamic_hole_linear2.findViewById(R.id.linear722d);
				final TextView textview11d = dynamic_hole_linear2.findViewById(R.id.textview11d);
				final EditText edittext5d = dynamic_hole_linear2.findViewById(R.id.edittext5d);
				edittext5d.setSingleLine(true);
				edittext5d.setFocusableInTouchMode(true);
				linear722d.setVisibility(View.GONE);
				final TextView textview667bd = dynamic_hole_linear2.findViewById(R.id.textview667bd);
				textview667bd.setVisibility(View.GONE);
				/*
تعريفات العرض الموازي او السمك الموازي للفتحة
*/
				final EditText edittext5dd = dynamic_hole_linear2.findViewById(R.id.edittext5dd);
				edittext5dd.setSingleLine(true);
				edittext5dd.setFocusableInTouchMode(true);
				edittext5dd.setVisibility(View.GONE);
				/*
تعريفات العرض او السمك للفتحة في حالة الحائط شبه منحرف اي يوجد عرضين للحائط" عرض علوى وعرض سفلي "
*/
				final LinearLayout linear33d = dynamic_hole_linear2.findViewById(R.id.linear33d);
				final EditText edittext36d = dynamic_hole_linear2.findViewById(R.id.edittext36d);
				edittext36d.setSingleLine(true);
				edittext36d.setFocusableInTouchMode(true);
				final EditText edittext35d = dynamic_hole_linear2.findViewById(R.id.edittext35d);
				edittext35d.setSingleLine(true);
				edittext35d.setFocusableInTouchMode(true);
				final EditText edittext32d = dynamic_hole_linear2.findViewById(R.id.edittext32d);
				edittext32d.setSingleLine(true);
				edittext32d.setFocusableInTouchMode(true);
				final TextView textview555d = dynamic_hole_linear2.findViewById(R.id.textview555d);
				final TextView textview556d = dynamic_hole_linear2.findViewById(R.id.textview556d);
				linear33d.setVisibility(View.VISIBLE);
				textview555d.setVisibility(View.GONE);
				textview556d.setVisibility(View.GONE);
				/*
تعريفات العرض الموازي او السمك الموازي للفتحة في حالة الحائط شبه منحرف اي يوجد عرضين للحائط" عرض علوى موازي وعرض سفلي موازي "
*/
				final EditText edittext36dd = dynamic_hole_linear2.findViewById(R.id.edittext36dd);
				edittext36dd.setSingleLine(true);
				edittext36dd.setFocusableInTouchMode(true);
				final EditText edittext35dd = dynamic_hole_linear2.findViewById(R.id.edittext35dd);
				edittext35dd.setSingleLine(true);
				edittext35dd.setFocusableInTouchMode(true);
				edittext36dd.setVisibility(View.GONE);
				edittext35dd.setVisibility(View.GONE);
				/*
تعريفات نسبة احتساب الفتحة
*/
				final TextView textview5d = dynamic_hole_linear2.findViewById(R.id.textview5d);
				final EditText edittext10d = dynamic_hole_linear2.findViewById(R.id.edittext10d);
				edittext10d.setSingleLine(true);
				edittext10d.setFocusableInTouchMode(true);
				final LinearLayout linear152d = dynamic_hole_linear2.findViewById(R.id.linear152d);
				linear152d.setVisibility(View.GONE);
				/*
تعريفات الكمية بعد الضرب في نسبة احتساب الفتحة
*/
				final TextView textview8d = dynamic_hole_linear2.findViewById(R.id.textview8d);
				final EditText edittext13d = dynamic_hole_linear2.findViewById(R.id.edittext13d);
				edittext13d.setSingleLine(true);
				edittext13d.setFocusableInTouchMode(true);
				final LinearLayout linear721d = dynamic_hole_linear2.findViewById(R.id.linear721d);
				linear721d.setVisibility(View.VISIBLE);
				/*
التعليقات المساعدة
*/
				final TextView textview666ad = dynamic_hole_linear2.findViewById(R.id.textview666ad);
				final TextView textview668cd = dynamic_hole_linear2.findViewById(R.id.textview668cd);
				final TextView textview669dd = dynamic_hole_linear2.findViewById(R.id.textview669dd);
				textview666ad.setVisibility(View.GONE);
				textview668cd.setVisibility(View.GONE);
				textview669dd.setVisibility(View.GONE);
				textview669dd.setText("من فضلك راجع الأبعاد وعدد الفتحات حيث ان اجمالي مسطح الفتحات في الحائط الواحد أكبر من مسطح الحائط\nوأيضآ اجمالي مكعب الفتحات في الحائط الواحد أكبر من مكعب الحائط");
				/*
ترقيم الفتحات
*/
				edittext6d.setText(String.valueOf((long)(d_add_dynamic_hole_linear.getChildCount())));
				/*
التعليقات والتعريفات للابعاد الخرسانيه
*/
				textview1d.setText("فتحة رقم :");
				textview2d.setText("نموذج الفتحة");
				textview3d.setText("طول الفتحة ( م )");
				textview4d.setText("ارتفاع الفتحة ( م )");
				textview11d.setText("* عرض أو سمك الفتحة ( م )");
				textview5d.setText("* نسبة احتساب الفتحة");
				textview6d.setText("* عدد الفتحات من نفس النموذج والأبعاد بالسقف الواحد");
				textview7d.setText("مسطح الفتحة الواحدة ( م٢ )");
				textview20d.setText("م٢");
				textview8d.setText("اجمالي مسطح نموذج الفتحة بالحائط ( م٢ )");
				textview21d.setText("م٢");
				textview9d.setText("مكعب نموذج الفتحة الواحدة\n( م٣ )");
				textview22d.setText("م٣");
				textview10d.setText("مكعب الفتحات بهذا النموذج بكل الحوائط التي نفس النموذج ( م٣ )");
				textview23d.setText("م٣");
				edittext5d.setBackgroundColor(0xFFC8E6C9);
				textview11d.setOnLongClickListener(new View.OnLongClickListener() {
					@Override
					public boolean onLongClick(View _view) {
						SketchwareUtil.showMessage(getApplicationContext(), "* عرض أو سمك الفتحة ( م )\n( لا يمكن ان يزيد عن سمك الحائط )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بنفس قيمة سمك الحائط \"");
						return true;
					}
				});
				textview6d.setOnLongClickListener(new View.OnLongClickListener() {
					@Override
					public boolean onLongClick(View _view) {
						SketchwareUtil.showMessage(getApplicationContext(), "* عدد الفتحات من نفس النموذج والأبعاد بالحائط الواحد\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ فتحة \"");
						return true;
					}
				});
				/*
ثالثآ : أوامر المربعات أو الناتج أو كمية العنصر الواحد
*/
				d_edittext3.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String d_edittext3nn = _param1.toString();
										
d_edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
						edittext15d.setText(String.valueOf(00.00));
						edittext15d.setTextColor(0xFFE91E63);
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
						edittext12d.setText(String.valueOf(00.00));
						edittext13d.setText(String.valueOf(00.00));
						edittext14d.setText(String.valueOf(00.00));
						edittext15d.setText(String.valueOf(00.00));
						edittext12d.setTextColor(0xFFE91E63);
						edittext13d.setTextColor(0xFFE91E63);
						edittext14d.setTextColor(0xFFE91E63);
						edittext15d.setTextColor(0xFFE91E63);
						textview666ad.setVisibility(View.GONE);
						edittext8dd.setText(String.valueOf(00.00));
								}
								
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										
								}
								
								@Override
								public void afterTextChanged(Editable _param1) {
										
								}
						});
				edittext9d.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String edittext9dnn = _param1.toString();
										
edittext9d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
						edittext12d.setText(String.valueOf(00.00));
						edittext13d.setText(String.valueOf(00.00));
						edittext14d.setText(String.valueOf(00.00));
						edittext15d.setText(String.valueOf(00.00));
						edittext12d.setTextColor(0xFFE91E63);
						edittext13d.setTextColor(0xFFE91E63);
						edittext14d.setTextColor(0xFFE91E63);
						edittext15d.setTextColor(0xFFE91E63);
						textview668cd.setVisibility(View.GONE);
						edittext9dd.setText(String.valueOf(00.00));
								}
								
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										
								}
								
								@Override
								public void afterTextChanged(Editable _param1) {
										
								}
						});
				/*
أوامر العرضين
*/
				edittext36d.addTextChangedListener(new TextWatcher() { 	
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
							
							
						edittext36d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
						if (((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) || ((edittext35d.getText().toString().equals("") || edittext35d.getText().toString().equals(".")) || (edittext35d.getText().toString().equals("-") || (Double.parseDouble(edittext35d.getText().toString()) < 0)))) {
							edittext32d.setText(String.valueOf(00.00d));
						}
						else {
							edittext32d.setText(String.valueOf((Double.parseDouble(s.toString()) + Double.parseDouble(edittext35d.getText().toString())) / 2));
						}
						textview555d.setVisibility(View.GONE);
					} });
				edittext35d.addTextChangedListener(new TextWatcher() { 	
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
							
							
						edittext35d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
						if (((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) || ((edittext36d.getText().toString().equals("") || edittext36d.getText().toString().equals(".")) || (edittext36d.getText().toString().equals("-") || (Double.parseDouble(edittext36d.getText().toString()) < 0)))) {
							edittext32d.setText(String.valueOf(00.00d));
						}
						else {
							edittext32d.setText(String.valueOf((Double.parseDouble(s.toString()) + Double.parseDouble(edittext36d.getText().toString())) / 2));
						}
						textview556d.setVisibility(View.GONE);
					} });
				edittext32d.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String edittext32dnn = _param1.toString();
										
edittext32d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
						edittext14d.setText(String.valueOf(00.00));
						edittext15d.setText(String.valueOf(00.00));
						edittext14d.setTextColor(0xFFE91E63);
						edittext15d.setTextColor(0xFFE91E63);
								}
								
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										
								}
								
								@Override
								public void afterTextChanged(Editable _param1) {
										
								}
						});
				/*
نهاية أوامر العرضين
*/
				edittext11d.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String edittext11dnn = _param1.toString();
										
edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
						edittext13d.setText(String.valueOf(00.00));
						edittext13d.setTextColor(0xFFE91E63);
						edittext14d.setText(String.valueOf(00.00));
						edittext15d.setText(String.valueOf(00.00));
						edittext14d.setTextColor(0xFFE91E63);
						edittext15d.setTextColor(0xFFE91E63);
						textview669dd.setVisibility(View.GONE);
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
						if ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0)))) || (((d_edittext1.getText().toString().equals("") || d_edittext1.getText().toString().equals(".")) || (d_edittext1.getText().toString().equals("-") || (Double.parseDouble(d_edittext1.getText().toString()) < 0))) || (((d_edittext2.getText().toString().equals("") || d_edittext2.getText().toString().equals(".")) || (d_edittext2.getText().toString().equals("-") || (Double.parseDouble(d_edittext2.getText().toString()) < 0))) || ((((d_edittext35.getText().toString().equals("") || d_edittext35.getText().toString().equals(".")) || (d_edittext35.getText().toString().equals("-") || (Double.parseDouble(d_edittext35.getText().toString()) < 0))) || ((d_edittext36.getText().toString().equals("") || d_edittext36.getText().toString().equals(".")) || (d_edittext36.getText().toString().equals("-") || (Double.parseDouble(d_edittext36.getText().toString()) < 0)))) || (((edittext35d.getText().toString().equals("") || edittext35d.getText().toString().equals(".")) || (edittext35d.getText().toString().equals("-") || (Double.parseDouble(edittext35d.getText().toString()) < 0))) || ((edittext36d.getText().toString().equals("") || edittext36d.getText().toString().equals(".")) || (edittext36d.getText().toString().equals("-") || (Double.parseDouble(edittext36d.getText().toString()) < 0)))))))) {
							SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
						}
						else {
							if ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) {
								edittext11d.setText(String.valueOf(1));
							}
							edittext8dd.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString())));
							edittext9dd.setText(String.valueOf(Double.parseDouble(edittext9d.getText().toString())));
							edittext36dd.setText(String.valueOf(Double.parseDouble(edittext36d.getText().toString())));
							edittext35dd.setText(String.valueOf(Double.parseDouble(edittext35d.getText().toString())));
							if (Double.parseDouble(edittext8d.getText().toString()) > Double.parseDouble(d_edittext1.getText().toString())) {
								textview666ad.setVisibility(View.VISIBLE);
								if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(d_edittext2.getText().toString())) {
									textview668cd.setVisibility(View.VISIBLE);
									if (Double.parseDouble(edittext36d.getText().toString()) > Double.parseDouble(d_edittext36.getText().toString())) {
										textview555d.setVisibility(View.VISIBLE);
										if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(d_edittext35.getText().toString())) {
											textview556d.setVisibility(View.VISIBLE);
										}
										else {
											textview556d.setVisibility(View.VISIBLE);
										}
									}
									else {
										textview555d.setVisibility(View.GONE);
										if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(d_edittext35.getText().toString())) {
											textview556d.setVisibility(View.VISIBLE);
										}
										else {
											textview556d.setVisibility(View.VISIBLE);
										}
									}
								}
								else {
									textview668cd.setVisibility(View.GONE);
									if (Double.parseDouble(edittext36d.getText().toString()) > Double.parseDouble(d_edittext36.getText().toString())) {
										textview555d.setVisibility(View.VISIBLE);
										if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(d_edittext35.getText().toString())) {
											textview556d.setVisibility(View.VISIBLE);
										}
										else {
											textview556d.setVisibility(View.VISIBLE);
										}
									}
									else {
										textview555d.setVisibility(View.GONE);
										if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(d_edittext35.getText().toString())) {
											textview556d.setVisibility(View.VISIBLE);
										}
										else {
											textview556d.setVisibility(View.GONE);
										}
									}
								}
							}
							else {
								textview666ad.setVisibility(View.GONE);
								if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(d_edittext2.getText().toString())) {
									textview668cd.setVisibility(View.VISIBLE);
									if (Double.parseDouble(edittext36d.getText().toString()) > Double.parseDouble(d_edittext36.getText().toString())) {
										textview555d.setVisibility(View.VISIBLE);
										if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(d_edittext35.getText().toString())) {
											textview556d.setVisibility(View.VISIBLE);
										}
										else {
											textview556d.setVisibility(View.GONE);
										}
									}
									else {
										textview555d.setVisibility(View.GONE);
										if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(d_edittext35.getText().toString())) {
											textview556d.setVisibility(View.VISIBLE);
										}
										else {
											textview556d.setVisibility(View.GONE);
										}
									}
								}
								else {
									textview668cd.setVisibility(View.GONE);
									if (Double.parseDouble(edittext36d.getText().toString()) > Double.parseDouble(d_edittext36.getText().toString())) {
										textview555d.setVisibility(View.VISIBLE);
										if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(d_edittext35.getText().toString())) {
											textview556d.setVisibility(View.VISIBLE);
										}
										else {
											textview556d.setVisibility(View.GONE);
										}
									}
									else {
										textview555d.setVisibility(View.GONE);
										if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(d_edittext35.getText().toString())) {
											textview556d.setVisibility(View.VISIBLE);
										}
										else {
											textview556d.setVisibility(View.GONE);
											edittext12d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())));
											edittext13d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString()))));
											edittext12d.setTextColor(0xFF000000);
											edittext13d.setTextColor(0xFF000000);
											if (((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * (Double.parseDouble(edittext32d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString()))) > (Double.parseDouble(d_edittext1.getText().toString()) * (Double.parseDouble(d_edittext2.getText().toString()) * Double.parseDouble(d_edittext32.getText().toString())))) {
												textview669dd.setVisibility(View.VISIBLE);
											}
											else {
												textview669dd.setVisibility(View.GONE);
												if ((d_edittext3.getText().toString().equals("") || d_edittext3.getText().toString().equals(".")) || (d_edittext3.getText().toString().equals("-") || (Double.parseDouble(d_edittext3.getText().toString()) < 0))) {
													d_edittext3.setText(String.valueOf(1));
												}
												edittext14d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * (Double.parseDouble(edittext11d.getText().toString()) * Double.parseDouble(edittext32d.getText().toString())))));
												edittext14d.setTextColor(0xFF000000);
												edittext15d.setText(String.valueOf((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * ((Double.parseDouble(edittext32d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString())) * Double.parseDouble(d_edittext3.getText().toString()))));
												edittext15d.setTextColor(0xFF000000);
											}
										}
									}
								}
							}
						}
					}
				});
				edittext12d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext13d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext14d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext15d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				/*
نهاية أوامر المربعات أو الناتج أو كمية العنصر الواحد
*/
				/*
إجمالي كميات الفتحات دينامك
*/
				/*
إجمالي المكعبات
*/
				edittext15d.addTextChangedListener(new TextWatcher() { 	
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
						 for(int i=0; i<d_add_dynamic_hole_linear.getChildCount(); ++i) { 
							 View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo =child.findViewById(R.id.edittext15d);
							temp = temp + Double.parseDouble(tempo.getText().toString());
						}
						d_edittext15.setText(String.valueOf(temp));
					} });
				/*
حذف فتحة
*/
				close_hole_d.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View _view) {
						/*
حذف فتحة
*/
						_removeView(dynamic_hole_linear2);
						/*
إجمالي كميات الفتحات الدينامك بعد عملية الحذف
*/
						/*
إجمالي المكعبات
*/
						temp = 0;
						 for(int i=0; i<d_add_dynamic_hole_linear.getChildCount(); ++i) { 
							 View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo =child.findViewById(R.id.edittext15d);
							temp = temp + Double.parseDouble(tempo.getText().toString());
						}
						d_edittext15.setText(String.valueOf(temp));
					}
				});
				/*
المقارنات والأبعاد المناظرة
*/
				/*
مقارنة الأبعاد في حالة تعديل ابعاد الحائط بعد تعديل أبعاد الفتحة
*/
				d_edittext1.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String d_edittext1nn = _param1.toString();
										
d_textview666.setVisibility(View.GONE);
						textview666ad.setVisibility(View.GONE);
								}
								
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										
								}
								
								@Override
								public void afterTextChanged(Editable _param1) {
										
								}
						});
				d_edittext2.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String d_edittext2nn = _param1.toString();
										
d_textview668.setVisibility(View.GONE);
						textview668cd.setVisibility(View.GONE);
								}
								
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										
								}
								
								@Override
								public void afterTextChanged(Editable _param1) {
										
								}
						});
				d_edittext32.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String d_edittext32nn = _param1.toString();
										
d_textview555.setVisibility(View.GONE);
						d_textview556.setVisibility(View.GONE);
						textview555d.setVisibility(View.GONE);
						textview556d.setVisibility(View.GONE);
								}
								
								@Override
								public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										
								}
								
								@Override
								public void afterTextChanged(Editable _param1) {
										
								}
						});
				/*
المقارنة
*/
				d_edittext444.addTextChangedListener(new TextWatcher() { 	
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
							
							
						temp1a = 0;
						for (int i = 0; i < (int)(d_add_dynamic_hole_linear.getChildCount()); i++) {
							View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo1a =child.findViewById(R.id.edittext8dd);
							temp1a = Math.max(temp1a, Double.parseDouble(tempo1a.getText().toString()));
						}
						temp2b = 0;
						for (int i = 0; i < (int)(d_add_dynamic_hole_linear.getChildCount()); i++) {
							View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo2b =child.findViewById(R.id.edittext9dd);
							temp2b = Math.max(temp2b, Double.parseDouble(tempo2b.getText().toString()));
						}
						temp36c = 0;
						for (int i = 0; i < (int)(d_add_dynamic_hole_linear.getChildCount()); i++) {
							View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo36c =child.findViewById(R.id.edittext36dd);
							temp36c = Math.max(temp36c, Double.parseDouble(tempo36c.getText().toString()));
						}
						temp35c = 0;
						for (int i = 0; i < (int)(d_add_dynamic_hole_linear.getChildCount()); i++) {
							View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo35c =child.findViewById(R.id.edittext35dd);
							temp35c = Math.max(temp35c, Double.parseDouble(tempo35c.getText().toString()));
						}
						if (Double.parseDouble(d_edittext1.getText().toString()) < temp1a) {
							d_textview666.setVisibility(View.VISIBLE);
							d_edittext4.setText(String.valueOf(00.00));
							d_edittext4.setTextColor(0xFFE91E63);
							d_edittext5.setText(String.valueOf(00.00));
							d_edittext5.setTextColor(0xFFE91E63);
							if (Double.parseDouble(d_edittext2.getText().toString()) < temp2b) {
								d_textview668.setVisibility(View.VISIBLE);
								if (Double.parseDouble(d_edittext36.getText().toString()) < temp36c) {
									d_textview555.setVisibility(View.VISIBLE);
									if (Double.parseDouble(d_edittext35.getText().toString()) < temp35c) {
										d_textview556.setVisibility(View.VISIBLE);
									}
									else {
										d_textview556.setVisibility(View.GONE);
									}
								}
								else {
									d_textview555.setVisibility(View.GONE);
									if (Double.parseDouble(d_edittext35.getText().toString()) < temp35c) {
										d_textview556.setVisibility(View.VISIBLE);
									}
									else {
										d_textview556.setVisibility(View.GONE);
									}
								}
							}
							else {
								d_textview668.setVisibility(View.GONE);
								if (Double.parseDouble(d_edittext36.getText().toString()) < temp36c) {
									d_textview555.setVisibility(View.VISIBLE);
									if (Double.parseDouble(d_edittext35.getText().toString()) < temp35c) {
										d_textview556.setVisibility(View.VISIBLE);
									}
									else {
										d_textview556.setVisibility(View.GONE);
									}
								}
								else {
									d_textview555.setVisibility(View.GONE);
									if (Double.parseDouble(d_edittext35.getText().toString()) < temp35c) {
										d_textview556.setVisibility(View.VISIBLE);
									}
									else {
										d_textview556.setVisibility(View.GONE);
									}
								}
							}
						}
						else {
							d_textview666.setVisibility(View.GONE);
							if (Double.parseDouble(d_edittext2.getText().toString()) < temp2b) {
								d_textview668.setVisibility(View.VISIBLE);
								d_edittext4.setText(String.valueOf(00.00));
								d_edittext4.setTextColor(0xFFE91E63);
								d_edittext5.setText(String.valueOf(00.00));
								d_edittext5.setTextColor(0xFFE91E63);
								if (Double.parseDouble(d_edittext36.getText().toString()) < temp36c) {
									d_textview555.setVisibility(View.VISIBLE);
									if (Double.parseDouble(d_edittext35.getText().toString()) < temp35c) {
										d_textview556.setVisibility(View.VISIBLE);
									}
									else {
										d_textview556.setVisibility(View.GONE);
									}
								}
								else {
									d_textview555.setVisibility(View.GONE);
									if (Double.parseDouble(d_edittext35.getText().toString()) < temp35c) {
										d_textview556.setVisibility(View.VISIBLE);
									}
									else {
										d_textview556.setVisibility(View.GONE);
									}
								}
							}
							else {
								d_textview668.setVisibility(View.GONE);
								if (Double.parseDouble(d_edittext36.getText().toString()) < temp36c) {
									d_textview555.setVisibility(View.VISIBLE);
									d_edittext4.setText(String.valueOf(00.00));
									d_edittext4.setTextColor(0xFFE91E63);
									d_edittext5.setText(String.valueOf(00.00));
									d_edittext5.setTextColor(0xFFE91E63);
									if (Double.parseDouble(d_edittext35.getText().toString()) < temp35c) {
										d_textview556.setVisibility(View.VISIBLE);
									}
									else {
										d_textview556.setVisibility(View.GONE);
									}
								}
								else {
									d_textview555.setVisibility(View.GONE);
									if (Double.parseDouble(edittext35.getText().toString()) < temp35c) {
										d_textview556.setVisibility(View.VISIBLE);
										d_edittext4.setText(String.valueOf(00.00));
										d_edittext4.setTextColor(0xFFE91E63);
										d_edittext5.setText(String.valueOf(00.00));
										d_edittext5.setTextColor(0xFFE91E63);
									}
									else {
										d_textview556.setVisibility(View.GONE);
										d_edittext4.setText(String.valueOf(Double.parseDouble(d_edittext1.getText().toString()) * (Double.parseDouble(d_edittext2.getText().toString()) * Double.parseDouble(d_edittext32.getText().toString()))));
										d_edittext4.setTextColor(0xFF000000);
									}
								}
							}
						}
					} });
			}
		});
		d_edittext15.addTextChangedListener(new TextWatcher() { 	
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
					
					
				d_edittext15.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(s.toString()) == 0) {
					d_linear74.setVisibility(View.GONE);
					d_textview56.setVisibility(View.GONE);
				}
				else {
					d_linear74.setVisibility(View.VISIBLE);
					if (Double.parseDouble(d_edittext5.getText().toString()) == 00.00d) {
						d_edittext20.setText(String.valueOf(Double.parseDouble("00.00")));
						d_textview56.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(d_edittext5.getText().toString())) && (Double.parseDouble(d_edittext5.getText().toString()) < Double.parseDouble(s.toString()))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مكعب كل الفتحات أكبر من اجمالي مكعب الحوائط وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							d_edittext20.setText(String.valueOf(Double.parseDouble("00.00")));
							d_edittext20.setTextColor(0xFFE91E63);
							d_textview56.setVisibility(View.VISIBLE);
						}
						else {
							d_edittext20.setText(String.valueOf(Double.parseDouble(d_edittext5.getText().toString()) - Double.parseDouble(s.toString())));
							d_edittext20.setTextColor(0xFF000000);
							d_textview56.setVisibility(View.GONE);
						}
					}
				}
			} });
		/*
إجمالي كميات الخرسانة دينامك م٣
*/
		d_edittext20.addTextChangedListener(new TextWatcher() { 	
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
				 for(int i=0; i<add_dynamic_wall_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_wall_linear.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.d_edittext20);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext21.setText(String.valueOf(temp1));
			} });
		/*
حذف حائط
*/
		d_close_wall.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_wall_linear);
				/*
إجمالي كميات الخرسانة دينامك م٣
*/
				temp1 = 0;
				 for(int i=0; i<add_dynamic_wall_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_wall_linear.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.d_edittext20);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext21.setText(String.valueOf(temp1));
			}
		});
	}
	
	
	public void _dynamic_hole_in_wall() {
		LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
		final LinearLayout dynamic_hole_linear = (LinearLayout) inflater.inflate(R.layout.toipcc_d_hole_plastering, null, false);
		add_dynamic_hole_linear.addView(dynamic_hole_linear);
		/*
تعريف الدينامك
*/
		final TextView textview1d = dynamic_hole_linear.findViewById(R.id.textview1d);
		final TextView textview2d = dynamic_hole_linear.findViewById(R.id.textview2d);
		final TextView textview3d = dynamic_hole_linear.findViewById(R.id.textview3d);
		final TextView textview4d = dynamic_hole_linear.findViewById(R.id.textview4d);
		final TextView textview6d = dynamic_hole_linear.findViewById(R.id.textview6d);
		final TextView textview7d = dynamic_hole_linear.findViewById(R.id.textview7d);
		final TextView textview9d = dynamic_hole_linear.findViewById(R.id.textview9d);
		final TextView textview10d = dynamic_hole_linear.findViewById(R.id.textview10d);
		final TextView textview20d = dynamic_hole_linear.findViewById(R.id.textview20d);
		final TextView textview21d = dynamic_hole_linear.findViewById(R.id.textview21d);
		final TextView textview22d = dynamic_hole_linear.findViewById(R.id.textview22d);
		final TextView textview23d = dynamic_hole_linear.findViewById(R.id.textview23d);
		final EditText edittext6d = dynamic_hole_linear.findViewById(R.id.edittext6d);
		edittext6d.setSingleLine(true);
		edittext6d.setFocusableInTouchMode(true);
		final EditText edittext7d = dynamic_hole_linear.findViewById(R.id.edittext7d);
		edittext7d.setSingleLine(true);
		edittext7d.setFocusableInTouchMode(true);
		final EditText edittext8d = dynamic_hole_linear.findViewById(R.id.edittext8d);
		edittext8d.setSingleLine(true);
		edittext8d.setFocusableInTouchMode(true);
		final EditText edittext9d = dynamic_hole_linear.findViewById(R.id.edittext9d);
		edittext9d.setSingleLine(true);
		edittext9d.setFocusableInTouchMode(true);
		final EditText edittext11d = dynamic_hole_linear.findViewById(R.id.edittext11d);
		edittext11d.setSingleLine(true);
		edittext11d.setFocusableInTouchMode(true);
		final EditText edittext12d = dynamic_hole_linear.findViewById(R.id.edittext12d);
		edittext12d.setSingleLine(true);
		edittext12d.setFocusableInTouchMode(true);
		final EditText edittext14d = dynamic_hole_linear.findViewById(R.id.edittext14d);
		edittext14d.setSingleLine(true);
		edittext14d.setFocusableInTouchMode(true);
		final EditText edittext15d = dynamic_hole_linear.findViewById(R.id.edittext15d);
		edittext15d.setSingleLine(true);
		edittext15d.setFocusableInTouchMode(true);
		final Button button2d = dynamic_hole_linear.findViewById(R.id.button2d);
		final ImageView close_hole_d = dynamic_hole_linear.findViewById(R.id.close_hole_d);
		/*
الأطوال الموازية
*/
		final EditText edittext8dd = dynamic_hole_linear.findViewById(R.id.edittext8dd);
		edittext8dd.setSingleLine(true);
		edittext8dd.setFocusableInTouchMode(true);
		final EditText edittext9dd = dynamic_hole_linear.findViewById(R.id.edittext9dd);
		edittext9dd.setSingleLine(true);
		edittext9dd.setFocusableInTouchMode(true);
		edittext8dd.setVisibility(View.GONE);
		edittext9dd.setVisibility(View.GONE);
		/*
تعريفات العرض او السمك للفتحة
*/
		final LinearLayout linear722d = dynamic_hole_linear.findViewById(R.id.linear722d);
		final TextView textview11d = dynamic_hole_linear.findViewById(R.id.textview11d);
		final EditText edittext5d = dynamic_hole_linear.findViewById(R.id.edittext5d);
		edittext5d.setSingleLine(true);
		edittext5d.setFocusableInTouchMode(true);
		linear722d.setVisibility(View.GONE);
		final TextView textview667bd = dynamic_hole_linear.findViewById(R.id.textview667bd);
		textview667bd.setVisibility(View.GONE);
		/*
تعريفات العرض الموازي او السمك الموازي للفتحة
*/
		final EditText edittext5dd = dynamic_hole_linear.findViewById(R.id.edittext5dd);
		edittext5dd.setSingleLine(true);
		edittext5dd.setFocusableInTouchMode(true);
		edittext5dd.setVisibility(View.GONE);
		/*
تعريفات العرض او السمك للفتحة في حالة الحائط شبه منحرف اي يوجد عرضين للحائط" عرض علوى وعرض سفلي "
*/
		final LinearLayout linear33d = dynamic_hole_linear.findViewById(R.id.linear33d);
		final EditText edittext36d = dynamic_hole_linear.findViewById(R.id.edittext36d);
		edittext36d.setSingleLine(true);
		edittext36d.setFocusableInTouchMode(true);
		final EditText edittext35d = dynamic_hole_linear.findViewById(R.id.edittext35d);
		edittext35d.setSingleLine(true);
		edittext35d.setFocusableInTouchMode(true);
		final EditText edittext32d = dynamic_hole_linear.findViewById(R.id.edittext32d);
		edittext32d.setSingleLine(true);
		edittext32d.setFocusableInTouchMode(true);
		final TextView textview555d = dynamic_hole_linear.findViewById(R.id.textview555d);
		final TextView textview556d = dynamic_hole_linear.findViewById(R.id.textview556d);
		linear33d.setVisibility(View.VISIBLE);
		textview555d.setVisibility(View.GONE);
		textview556d.setVisibility(View.GONE);
		/*
تعريفات العرض الموازي او السمك الموازي للفتحة في حالة الحائط شبه منحرف اي يوجد عرضين للحائط" عرض علوى موازي وعرض سفلي موازي "
*/
		final EditText edittext36dd = dynamic_hole_linear.findViewById(R.id.edittext36dd);
		edittext36dd.setSingleLine(true);
		edittext36dd.setFocusableInTouchMode(true);
		final EditText edittext35dd = dynamic_hole_linear.findViewById(R.id.edittext35dd);
		edittext35dd.setSingleLine(true);
		edittext35dd.setFocusableInTouchMode(true);
		edittext36dd.setVisibility(View.GONE);
		edittext35dd.setVisibility(View.GONE);
		/*
تعريفات نسبة احتساب الفتحة
*/
		final TextView textview5d = dynamic_hole_linear.findViewById(R.id.textview5d);
		final EditText edittext10d = dynamic_hole_linear.findViewById(R.id.edittext10d);
		edittext10d.setSingleLine(true);
		edittext10d.setFocusableInTouchMode(true);
		final LinearLayout linear152d = dynamic_hole_linear.findViewById(R.id.linear152d);
		linear152d.setVisibility(View.GONE);
		/*
تعريفات الكمية بعد الضرب في نسبة احتساب الفتحة
*/
		final TextView textview8d = dynamic_hole_linear.findViewById(R.id.textview8d);
		final EditText edittext13d = dynamic_hole_linear.findViewById(R.id.edittext13d);
		edittext13d.setSingleLine(true);
		edittext13d.setFocusableInTouchMode(true);
		final LinearLayout linear721d = dynamic_hole_linear.findViewById(R.id.linear721d);
		linear721d.setVisibility(View.VISIBLE);
		/*
التعليقات المساعدة
*/
		final TextView textview666ad = dynamic_hole_linear.findViewById(R.id.textview666ad);
		final TextView textview668cd = dynamic_hole_linear.findViewById(R.id.textview668cd);
		final TextView textview669dd = dynamic_hole_linear.findViewById(R.id.textview669dd);
		textview666ad.setVisibility(View.GONE);
		textview668cd.setVisibility(View.GONE);
		textview669dd.setVisibility(View.GONE);
		textview669dd.setText("من فضلك راجع الأبعاد وعدد الفتحات حيث ان اجمالي مسطح الفتحات في الحائط الواحد أكبر من مسطح الحائط\nوأيضآ اجمالي مكعب الفتحات في الحائط الواحد أكبر من مكعب الحائط");
		/*
التعليقات والتعريفات للابعاد الخرسانيه
*/
		/*
ترقيم الفتحات
*/
		edittext6d.setText(String.valueOf((long)(add_dynamic_hole_linear.getChildCount())));
		/*
التعليقات والتعريفات للابعاد الخرسانيه
*/
		textview1d.setText("فتحة رقم :");
		textview2d.setText("نموذج الفتحة");
		textview3d.setText("طول الفتحة ( م )");
		textview4d.setText("ارتفاع الفتحة ( م )");
		textview11d.setText("* عرض أو سمك الفتحة ( م )");
		textview5d.setText("* نسبة احتساب الفتحة");
		textview6d.setText("* عدد الفتحات من نفس النموذج والأبعاد بالسقف الواحد");
		textview7d.setText("مسطح الفتحة الواحدة ( م٢ )");
		textview20d.setText("م٢");
		textview8d.setText("اجمالي مسطح نموذج الفتحة بالحائط ( م٢ )");
		textview21d.setText("م٢");
		textview9d.setText("مكعب نموذج الفتحة الواحدة\n( م٣ )");
		textview22d.setText("م٣");
		textview10d.setText("مكعب الفتحات بهذا النموذج بكل الحوائط التي نفس النموذج ( م٣ )");
		textview23d.setText("م٣");
		edittext5d.setBackgroundColor(0xFFC8E6C9);
		textview11d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* عرض أو سمك الفتحة ( م )\n( لا يمكن ان يزيد عن سمك الحائط )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بنفس قيمة سمك الحائط \"");
				return true;
			}
		});
		textview5d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة احتساب الفتحة\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ \"");
				return true;
			}
		});
		textview6d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* عدد الفتحات من نفس النموذج والأبعاد بالحائط الواحد\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ فتحة \"");
				return true;
			}
		});
		/*
ثالثآ : أوامر المربعات أو الناتج أو كمية العنصر الواحد
*/
		edittext3.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext3nn = _param1.toString();
								
edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext15d.setText(String.valueOf(00.00));
				edittext15d.setTextColor(0xFFE91E63);
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
				edittext12d.setText(String.valueOf(00.00));
				edittext13d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
				edittext14d.setText(String.valueOf(00.00));
				edittext15d.setText(String.valueOf(00.00));
				edittext12d.setTextColor(0xFFE91E63);
				edittext14d.setTextColor(0xFFE91E63);
				edittext15d.setTextColor(0xFFE91E63);
				textview666ad.setVisibility(View.GONE);
				edittext8dd.setText(String.valueOf(00.00));
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext9d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext9dnn = _param1.toString();
								
edittext9d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext12d.setText(String.valueOf(00.00));
				edittext13d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
				edittext14d.setText(String.valueOf(00.00));
				edittext15d.setText(String.valueOf(00.00));
				edittext12d.setTextColor(0xFFE91E63);
				edittext14d.setTextColor(0xFFE91E63);
				edittext15d.setTextColor(0xFFE91E63);
				textview668cd.setVisibility(View.GONE);
				edittext9dd.setText(String.valueOf(00.00));
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
أوامر العرضين
*/
		edittext36d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				edittext36d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) || ((edittext35d.getText().toString().equals("") || edittext35d.getText().toString().equals(".")) || (edittext35d.getText().toString().equals("-") || (Double.parseDouble(edittext35d.getText().toString()) < 0)))) {
					edittext32d.setText(String.valueOf(00.00d));
				}
				else {
					edittext32d.setText(String.valueOf((Double.parseDouble(s.toString()) + Double.parseDouble(edittext35d.getText().toString())) / 2));
				}
				textview555d.setVisibility(View.GONE);
			} });
		edittext35d.addTextChangedListener(new TextWatcher() { 	
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
					
					
				edittext35d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((s.toString().equals("") || s.toString().equals(".")) || (s.toString().equals("-") || (Double.parseDouble(s.toString()) < 0))) || ((edittext36d.getText().toString().equals("") || edittext36d.getText().toString().equals(".")) || (edittext36d.getText().toString().equals("-") || (Double.parseDouble(edittext36d.getText().toString()) < 0)))) {
					edittext32d.setText(String.valueOf(00.00d));
				}
				else {
					edittext32d.setText(String.valueOf((Double.parseDouble(s.toString()) + Double.parseDouble(edittext36d.getText().toString())) / 2));
				}
				textview556d.setVisibility(View.GONE);
			} });
		edittext32d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext32dnn = _param1.toString();
								
edittext32d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext14d.setText(String.valueOf(00.00));
				edittext15d.setText(String.valueOf(00.00));
				edittext14d.setTextColor(0xFFE91E63);
				edittext15d.setTextColor(0xFFE91E63);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
نهاية أوامر العرضين
*/
		edittext11d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext11dnn = _param1.toString();
								
edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext13d.setText(String.valueOf(00.00));
				edittext13d.setTextColor(0xFFE91E63);
				edittext14d.setText(String.valueOf(00.00));
				edittext15d.setText(String.valueOf(00.00));
				edittext14d.setTextColor(0xFFE91E63);
				edittext15d.setTextColor(0xFFE91E63);
				textview669dd.setVisibility(View.GONE);
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
				if ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0)))) || (((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || (((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || ((((edittext35.getText().toString().equals("") || edittext35.getText().toString().equals(".")) || (edittext35.getText().toString().equals("-") || (Double.parseDouble(edittext35.getText().toString()) < 0))) || ((edittext36.getText().toString().equals("") || edittext36.getText().toString().equals(".")) || (edittext36.getText().toString().equals("-") || (Double.parseDouble(edittext36.getText().toString()) < 0)))) || (((edittext35d.getText().toString().equals("") || edittext35d.getText().toString().equals(".")) || (edittext35d.getText().toString().equals("-") || (Double.parseDouble(edittext35d.getText().toString()) < 0))) || ((edittext36d.getText().toString().equals("") || edittext36d.getText().toString().equals(".")) || (edittext36d.getText().toString().equals("-") || (Double.parseDouble(edittext36d.getText().toString()) < 0)))))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) {
						edittext11d.setText(String.valueOf(1));
					}
					edittext8dd.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString())));
					edittext9dd.setText(String.valueOf(Double.parseDouble(edittext9d.getText().toString())));
					edittext36dd.setText(String.valueOf(Double.parseDouble(edittext36d.getText().toString())));
					edittext35dd.setText(String.valueOf(Double.parseDouble(edittext35d.getText().toString())));
					if (Double.parseDouble(edittext8d.getText().toString()) > Double.parseDouble(edittext1.getText().toString())) {
						textview666ad.setVisibility(View.VISIBLE);
						if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(edittext2.getText().toString())) {
							textview668cd.setVisibility(View.VISIBLE);
							if (Double.parseDouble(edittext36d.getText().toString()) > Double.parseDouble(edittext36.getText().toString())) {
								textview555d.setVisibility(View.VISIBLE);
								if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(edittext35.getText().toString())) {
									textview556d.setVisibility(View.VISIBLE);
								}
								else {
									textview556d.setVisibility(View.GONE);
								}
							}
							else {
								textview555d.setVisibility(View.GONE);
								if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(edittext35.getText().toString())) {
									textview556d.setVisibility(View.VISIBLE);
								}
								else {
									textview556d.setVisibility(View.GONE);
								}
							}
						}
						else {
							textview668cd.setVisibility(View.GONE);
							if (Double.parseDouble(edittext36d.getText().toString()) > Double.parseDouble(edittext36.getText().toString())) {
								textview555d.setVisibility(View.VISIBLE);
								if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(edittext35.getText().toString())) {
									textview556d.setVisibility(View.VISIBLE);
								}
								else {
									textview556d.setVisibility(View.GONE);
								}
							}
							else {
								textview555d.setVisibility(View.GONE);
								if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(edittext35.getText().toString())) {
									textview556d.setVisibility(View.VISIBLE);
								}
								else {
									textview556d.setVisibility(View.GONE);
								}
							}
						}
					}
					else {
						textview666ad.setVisibility(View.GONE);
						if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(edittext2.getText().toString())) {
							textview668cd.setVisibility(View.VISIBLE);
							if (Double.parseDouble(edittext36d.getText().toString()) > Double.parseDouble(edittext36.getText().toString())) {
								textview555d.setVisibility(View.VISIBLE);
								if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(edittext35.getText().toString())) {
									textview556d.setVisibility(View.VISIBLE);
								}
								else {
									textview556d.setVisibility(View.GONE);
								}
							}
							else {
								textview555d.setVisibility(View.GONE);
								if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(edittext35.getText().toString())) {
									textview556d.setVisibility(View.VISIBLE);
								}
								else {
									textview556d.setVisibility(View.GONE);
								}
							}
						}
						else {
							textview668cd.setVisibility(View.GONE);
							if (Double.parseDouble(edittext36d.getText().toString()) > Double.parseDouble(edittext36.getText().toString())) {
								textview555d.setVisibility(View.VISIBLE);
								if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(edittext35.getText().toString())) {
									textview556d.setVisibility(View.VISIBLE);
								}
								else {
									textview556d.setVisibility(View.GONE);
								}
							}
							else {
								textview555d.setVisibility(View.GONE);
								if (Double.parseDouble(edittext35d.getText().toString()) > Double.parseDouble(edittext35.getText().toString())) {
									textview556d.setVisibility(View.VISIBLE);
								}
								else {
									textview556d.setVisibility(View.GONE);
									edittext12d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())));
									edittext13d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString()))));
									edittext12d.setTextColor(0xFF000000);
									edittext13d.setTextColor(0xFF000000);
									if (((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * (Double.parseDouble(edittext32d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString()))) > (Double.parseDouble(edittext1.getText().toString()) * (Double.parseDouble(edittext2.getText().toString()) * Double.parseDouble(edittext32.getText().toString())))) {
										textview669dd.setVisibility(View.VISIBLE);
									}
									else {
										textview669dd.setVisibility(View.GONE);
										if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
											edittext3.setText(String.valueOf(1));
										}
										edittext14d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * (Double.parseDouble(edittext11d.getText().toString()) * Double.parseDouble(edittext32d.getText().toString())))));
										edittext14d.setTextColor(0xFF000000);
										edittext15d.setText(String.valueOf((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * ((Double.parseDouble(edittext32d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString())) * Double.parseDouble(edittext3.getText().toString()))));
										edittext15d.setTextColor(0xFF000000);
									}
								}
							}
						}
					}
				}
			}
		});
		edittext12d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		edittext13d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		edittext14d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		edittext15d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
		/*
إجمالي كميات الفتحات دينامك
*/
		/*
إجمالي المكعبات
*/
		edittext15d.addTextChangedListener(new TextWatcher() { 	
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
				 for(int i=0; i<add_dynamic_hole_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo =child.findViewById(R.id.edittext15d);
					temp = temp + Double.parseDouble(tempo.getText().toString());
				}
				edittext15.setText(String.valueOf(temp));
			} });
		/*
حذف فتحة
*/
		close_hole_d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_hole_linear);
				/*
إجمالي المكعبات بعد عملية الحذف
*/
				temp = 0;
				 for(int i=0; i<add_dynamic_hole_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo =child.findViewById(R.id.edittext15d);
					temp = temp + Double.parseDouble(tempo.getText().toString());
				}
				edittext15.setText(String.valueOf(temp));
				/*
المقارنات والأبعاد المناظرة
*/
			}
		});
		/*
مقارنة الأبعاد في حالة تعديل ابعاد الحائط بعد تعديل أبعاد الفتحة
*/
		edittext1.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext1nn = _param1.toString();
								
textview666.setVisibility(View.GONE);
				textview666ad.setVisibility(View.GONE);
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
								final String edittext2nn = _param1.toString();
								
textview668.setVisibility(View.GONE);
				textview668cd.setVisibility(View.GONE);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		edittext32.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext32nn = _param1.toString();
								
textview555.setVisibility(View.GONE);
				textview556.setVisibility(View.GONE);
				textview555d.setVisibility(View.GONE);
				textview556d.setVisibility(View.GONE);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		/*
المقارنة
*/
		edittext444.addTextChangedListener(new TextWatcher() { 	
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
					
					
				temp1a = 0;
				for (int i = 0; i < (int)(add_dynamic_hole_linear.getChildCount()); i++) {
					View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo1a =child.findViewById(R.id.edittext8dd);
					temp1a = Math.max(temp1a, Double.parseDouble(tempo1a.getText().toString()));
				}
				temp2b = 0;
				for (int i = 0; i < (int)(add_dynamic_hole_linear.getChildCount()); i++) {
					View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo2b =child.findViewById(R.id.edittext9dd);
					temp2b = Math.max(temp2b, Double.parseDouble(tempo2b.getText().toString()));
				}
				temp36c = 0;
				for (int i = 0; i < (int)(add_dynamic_hole_linear.getChildCount()); i++) {
					View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo36c =child.findViewById(R.id.edittext36dd);
					temp36c = Math.max(temp36c, Double.parseDouble(tempo36c.getText().toString()));
				}
				temp35c = 0;
				for (int i = 0; i < (int)(add_dynamic_hole_linear.getChildCount()); i++) {
					View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo35c =child.findViewById(R.id.edittext35dd);
					temp35c = Math.max(temp35c, Double.parseDouble(tempo35c.getText().toString()));
				}
				if (Double.parseDouble(edittext1.getText().toString()) < temp1a) {
					textview666.setVisibility(View.VISIBLE);
					edittext4.setText(String.valueOf(00.00));
					edittext4.setTextColor(0xFFE91E63);
					edittext5.setText(String.valueOf(00.00));
					edittext5.setTextColor(0xFFE91E63);
					if (Double.parseDouble(edittext2.getText().toString()) < temp2b) {
						textview668.setVisibility(View.VISIBLE);
						if (Double.parseDouble(edittext36.getText().toString()) < temp36c) {
							textview555.setVisibility(View.VISIBLE);
							if (Double.parseDouble(edittext35.getText().toString()) < temp35c) {
								textview556.setVisibility(View.VISIBLE);
							}
							else {
								textview556.setVisibility(View.GONE);
							}
						}
						else {
							textview555.setVisibility(View.GONE);
							if (Double.parseDouble(edittext35.getText().toString()) < temp35c) {
								textview556.setVisibility(View.VISIBLE);
							}
							else {
								textview556.setVisibility(View.GONE);
							}
						}
					}
					else {
						textview668.setVisibility(View.GONE);
						if (Double.parseDouble(edittext36.getText().toString()) < temp36c) {
							textview555.setVisibility(View.VISIBLE);
							if (Double.parseDouble(edittext35.getText().toString()) < temp35c) {
								textview556.setVisibility(View.VISIBLE);
							}
							else {
								textview556.setVisibility(View.GONE);
							}
						}
						else {
							textview555.setVisibility(View.GONE);
							if (Double.parseDouble(edittext35.getText().toString()) < temp35c) {
								textview556.setVisibility(View.VISIBLE);
							}
							else {
								textview556.setVisibility(View.GONE);
							}
						}
					}
				}
				else {
					textview666.setVisibility(View.GONE);
					if (Double.parseDouble(edittext2.getText().toString()) < temp2b) {
						textview668.setVisibility(View.VISIBLE);
						edittext4.setText(String.valueOf(00.00));
						edittext4.setTextColor(0xFFE91E63);
						edittext5.setText(String.valueOf(00.00));
						edittext5.setTextColor(0xFFE91E63);
						if (Double.parseDouble(edittext36.getText().toString()) < temp36c) {
							textview555.setVisibility(View.VISIBLE);
							if (Double.parseDouble(edittext35.getText().toString()) < temp35c) {
								textview556.setVisibility(View.VISIBLE);
							}
							else {
								textview556.setVisibility(View.GONE);
							}
						}
						else {
							textview555.setVisibility(View.GONE);
							if (Double.parseDouble(edittext35.getText().toString()) < temp35c) {
								textview556.setVisibility(View.VISIBLE);
							}
							else {
								textview556.setVisibility(View.GONE);
							}
						}
					}
					else {
						textview668.setVisibility(View.GONE);
						if (Double.parseDouble(edittext36.getText().toString()) < temp36c) {
							textview555.setVisibility(View.VISIBLE);
							edittext4.setText(String.valueOf(00.00));
							edittext4.setTextColor(0xFFE91E63);
							edittext5.setText(String.valueOf(00.00));
							edittext5.setTextColor(0xFFE91E63);
							if (Double.parseDouble(edittext35.getText().toString()) < temp35c) {
								textview556.setVisibility(View.VISIBLE);
							}
							else {
								textview556.setVisibility(View.GONE);
							}
						}
						else {
							textview555.setVisibility(View.GONE);
							if (Double.parseDouble(edittext35.getText().toString()) < temp35c) {
								textview556.setVisibility(View.VISIBLE);
								edittext4.setText(String.valueOf(00.00));
								edittext4.setTextColor(0xFFE91E63);
								edittext5.setText(String.valueOf(00.00));
								edittext5.setTextColor(0xFFE91E63);
							}
							else {
								textview556.setVisibility(View.GONE);
								edittext4.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) * (Double.parseDouble(edittext2.getText().toString()) * Double.parseDouble(edittext32.getText().toString()))));
								edittext4.setTextColor(0xFF000000);
							}
						}
					}
				}
			} });
	}
	
}
