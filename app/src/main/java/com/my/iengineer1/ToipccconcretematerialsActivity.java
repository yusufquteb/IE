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


public class ToipccconcretematerialsActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private String path = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear176;
	private TextView textview1;
	private TextView textview524;
	private LinearLayout linear75;
	private TextView textview525;
	private LinearLayout linear255;
	private LinearLayout linear140;
	private LinearLayout linear301;
	private TextView textview554;
	private TextView textview578;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private TextView textview555;
	private TextView textview583;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private TextView textview585;
	private TextView textview584;
	private TextView textview808;
	private TextView textview809;
	private TextView textview527;
	private EditText edittext51;
	private TextView textview321;
	private TextView textview114;
	private TextView textview733;
	private LinearLayout linear336;
	private Button button95;
	private TextView textview944;
	private Button button96;
	private TextView textview812;
	private TextView textview813;
	private TextView textview307;
	private LinearLayout linear141;
	private LinearLayout linear118;
	private LinearLayout linear120;
	private LinearLayout linear122;
	private LinearLayout linear125;
	private LinearLayout linear116;
	private TextView textview982;
	private LinearLayout linear785;
	private LinearLayout linear786;
	private LinearLayout linear153;
	private LinearLayout linear149;
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
	private TextView textview848;
	private TextView textview849;
	private TextView textview850;
	private LinearLayout linear302;
	private LinearLayout linear303;
	private LinearLayout linear304;
	private LinearLayout linear305;
	private LinearLayout linear306;
	private LinearLayout linear341;
	private TextView textview851;
	private TextView textview852;
	private LinearLayout linear312;
	private LinearLayout linear313;
	private Button button106;
	private LinearLayout linear314;
	private Button button107;
	private LinearLayout linear315;
	private Button button109;
	private LinearLayout linear316;
	private LinearLayout linear317;
	private LinearLayout linear339;
	private LinearLayout linear318;
	private HorizontalScrollView hscroll59;
	private TextView textview985;
	private LinearLayout linear319;
	private HorizontalScrollView hscroll60;
	private LinearLayout linear320;
	private HorizontalScrollView hscroll61;
	private LinearLayout linear332;
	private LinearLayout linear322;
	private LinearLayout linear323;
	private LinearLayout linear340;
	private TextView textview853;
	private LinearLayout linear325;
	private TextView textview862;
	private EditText edittext89;
	private TextView textview854;
	private TextView textview855;
	private TextView textview865;
	private EditText edittext90;
	private TextView textview856;
	private TextView textview857;
	private TextView textview878;
	private EditText edittext91;
	private TextView textview858;
	private TextView textview859;
	private TextView textview890;
	private EditText edittext92;
	private TextView textview860;
	private TextView textview861;
	private TextView textview960;
	private EditText edittext93;
	private TextView textview961;
	private TextView textview962;
	private TextView textview893;
	private EditText edittext94;
	private TextView textview894;
	private TextView textview895;
	private TextView textview896;
	private EditText edittext95;
	private TextView textview897;
	private TextView textview898;
	private TextView textview899;
	private EditText edittext96;
	private TextView textview900;
	private TextView textview901;
	private TextView textview902;
	private EditText edittext97;
	private TextView textview903;
	private TextView textview904;
	private TextView textview905;
	private EditText edittext98;
	private TextView textview906;
	private TextView textview907;
	private TextView textview954;
	private EditText edittext99;
	private TextView textview955;
	private TextView textview956;
	private Button button94;
	private LinearLayout linear334;
	private TextView textview939;
	private TextView textview938;
	private EditText edittext100;
	private TextView textview936;
	private TextView textview937;
	private TextView textview908;
	private EditText edittext101;
	private TextView textview909;
	private TextView textview910;
	private LinearLayout linear335;
	private TextView textview940;
	private TextView textview941;
	private EditText edittext102;
	private TextView textview942;
	private TextView textview943;
	private TextView textview911;
	private EditText edittext103;
	private TextView textview912;
	private TextView textview913;
	private LinearLayout linear333;
	private TextView textview914;
	private TextView textview921;
	private EditText edittext104;
	private TextView textview922;
	private TextView textview923;
	private TextView textview918;
	private EditText edittext105;
	private TextView textview919;
	private TextView textview920;
	private TextView textview924;
	private EditText edittext106;
	private TextView textview925;
	private TextView textview926;
	private TextView textview927;
	private EditText edittext107;
	private TextView textview928;
	private TextView textview929;
	private TextView textview957;
	private EditText edittext108;
	private TextView textview958;
	private TextView textview959;
	private TextView textview933;
	private EditText edittext109;
	private TextView textview934;
	private TextView textview935;
	
	private Intent price = new Intent();
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipccconcretematerials);
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
		linear176 = findViewById(R.id.linear176);
		textview1 = findViewById(R.id.textview1);
		textview524 = findViewById(R.id.textview524);
		linear75 = findViewById(R.id.linear75);
		textview525 = findViewById(R.id.textview525);
		linear255 = findViewById(R.id.linear255);
		linear140 = findViewById(R.id.linear140);
		linear301 = findViewById(R.id.linear301);
		textview554 = findViewById(R.id.textview554);
		textview578 = findViewById(R.id.textview578);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		textview583 = findViewById(R.id.textview583);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		textview808 = findViewById(R.id.textview808);
		textview809 = findViewById(R.id.textview809);
		textview527 = findViewById(R.id.textview527);
		edittext51 = findViewById(R.id.edittext51);
		textview321 = findViewById(R.id.textview321);
		textview114 = findViewById(R.id.textview114);
		textview733 = findViewById(R.id.textview733);
		linear336 = findViewById(R.id.linear336);
		button95 = findViewById(R.id.button95);
		textview944 = findViewById(R.id.textview944);
		button96 = findViewById(R.id.button96);
		textview812 = findViewById(R.id.textview812);
		textview813 = findViewById(R.id.textview813);
		textview307 = findViewById(R.id.textview307);
		linear141 = findViewById(R.id.linear141);
		linear118 = findViewById(R.id.linear118);
		linear120 = findViewById(R.id.linear120);
		linear122 = findViewById(R.id.linear122);
		linear125 = findViewById(R.id.linear125);
		linear116 = findViewById(R.id.linear116);
		textview982 = findViewById(R.id.textview982);
		linear785 = findViewById(R.id.linear785);
		linear786 = findViewById(R.id.linear786);
		linear153 = findViewById(R.id.linear153);
		linear149 = findViewById(R.id.linear149);
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
		textview848 = findViewById(R.id.textview848);
		textview849 = findViewById(R.id.textview849);
		textview850 = findViewById(R.id.textview850);
		linear302 = findViewById(R.id.linear302);
		linear303 = findViewById(R.id.linear303);
		linear304 = findViewById(R.id.linear304);
		linear305 = findViewById(R.id.linear305);
		linear306 = findViewById(R.id.linear306);
		linear341 = findViewById(R.id.linear341);
		textview851 = findViewById(R.id.textview851);
		textview852 = findViewById(R.id.textview852);
		linear312 = findViewById(R.id.linear312);
		linear313 = findViewById(R.id.linear313);
		button106 = findViewById(R.id.button106);
		linear314 = findViewById(R.id.linear314);
		button107 = findViewById(R.id.button107);
		linear315 = findViewById(R.id.linear315);
		button109 = findViewById(R.id.button109);
		linear316 = findViewById(R.id.linear316);
		linear317 = findViewById(R.id.linear317);
		linear339 = findViewById(R.id.linear339);
		linear318 = findViewById(R.id.linear318);
		hscroll59 = findViewById(R.id.hscroll59);
		textview985 = findViewById(R.id.textview985);
		linear319 = findViewById(R.id.linear319);
		hscroll60 = findViewById(R.id.hscroll60);
		linear320 = findViewById(R.id.linear320);
		hscroll61 = findViewById(R.id.hscroll61);
		linear332 = findViewById(R.id.linear332);
		linear322 = findViewById(R.id.linear322);
		linear323 = findViewById(R.id.linear323);
		linear340 = findViewById(R.id.linear340);
		textview853 = findViewById(R.id.textview853);
		linear325 = findViewById(R.id.linear325);
		textview862 = findViewById(R.id.textview862);
		edittext89 = findViewById(R.id.edittext89);
		textview854 = findViewById(R.id.textview854);
		textview855 = findViewById(R.id.textview855);
		textview865 = findViewById(R.id.textview865);
		edittext90 = findViewById(R.id.edittext90);
		textview856 = findViewById(R.id.textview856);
		textview857 = findViewById(R.id.textview857);
		textview878 = findViewById(R.id.textview878);
		edittext91 = findViewById(R.id.edittext91);
		textview858 = findViewById(R.id.textview858);
		textview859 = findViewById(R.id.textview859);
		textview890 = findViewById(R.id.textview890);
		edittext92 = findViewById(R.id.edittext92);
		textview860 = findViewById(R.id.textview860);
		textview861 = findViewById(R.id.textview861);
		textview960 = findViewById(R.id.textview960);
		edittext93 = findViewById(R.id.edittext93);
		textview961 = findViewById(R.id.textview961);
		textview962 = findViewById(R.id.textview962);
		textview893 = findViewById(R.id.textview893);
		edittext94 = findViewById(R.id.edittext94);
		textview894 = findViewById(R.id.textview894);
		textview895 = findViewById(R.id.textview895);
		textview896 = findViewById(R.id.textview896);
		edittext95 = findViewById(R.id.edittext95);
		textview897 = findViewById(R.id.textview897);
		textview898 = findViewById(R.id.textview898);
		textview899 = findViewById(R.id.textview899);
		edittext96 = findViewById(R.id.edittext96);
		textview900 = findViewById(R.id.textview900);
		textview901 = findViewById(R.id.textview901);
		textview902 = findViewById(R.id.textview902);
		edittext97 = findViewById(R.id.edittext97);
		textview903 = findViewById(R.id.textview903);
		textview904 = findViewById(R.id.textview904);
		textview905 = findViewById(R.id.textview905);
		edittext98 = findViewById(R.id.edittext98);
		textview906 = findViewById(R.id.textview906);
		textview907 = findViewById(R.id.textview907);
		textview954 = findViewById(R.id.textview954);
		edittext99 = findViewById(R.id.edittext99);
		textview955 = findViewById(R.id.textview955);
		textview956 = findViewById(R.id.textview956);
		button94 = findViewById(R.id.button94);
		linear334 = findViewById(R.id.linear334);
		textview939 = findViewById(R.id.textview939);
		textview938 = findViewById(R.id.textview938);
		edittext100 = findViewById(R.id.edittext100);
		textview936 = findViewById(R.id.textview936);
		textview937 = findViewById(R.id.textview937);
		textview908 = findViewById(R.id.textview908);
		edittext101 = findViewById(R.id.edittext101);
		textview909 = findViewById(R.id.textview909);
		textview910 = findViewById(R.id.textview910);
		linear335 = findViewById(R.id.linear335);
		textview940 = findViewById(R.id.textview940);
		textview941 = findViewById(R.id.textview941);
		edittext102 = findViewById(R.id.edittext102);
		textview942 = findViewById(R.id.textview942);
		textview943 = findViewById(R.id.textview943);
		textview911 = findViewById(R.id.textview911);
		edittext103 = findViewById(R.id.edittext103);
		textview912 = findViewById(R.id.textview912);
		textview913 = findViewById(R.id.textview913);
		linear333 = findViewById(R.id.linear333);
		textview914 = findViewById(R.id.textview914);
		textview921 = findViewById(R.id.textview921);
		edittext104 = findViewById(R.id.edittext104);
		textview922 = findViewById(R.id.textview922);
		textview923 = findViewById(R.id.textview923);
		textview918 = findViewById(R.id.textview918);
		edittext105 = findViewById(R.id.edittext105);
		textview919 = findViewById(R.id.textview919);
		textview920 = findViewById(R.id.textview920);
		textview924 = findViewById(R.id.textview924);
		edittext106 = findViewById(R.id.edittext106);
		textview925 = findViewById(R.id.textview925);
		textview926 = findViewById(R.id.textview926);
		textview927 = findViewById(R.id.textview927);
		edittext107 = findViewById(R.id.edittext107);
		textview928 = findViewById(R.id.textview928);
		textview929 = findViewById(R.id.textview929);
		textview957 = findViewById(R.id.textview957);
		edittext108 = findViewById(R.id.edittext108);
		textview958 = findViewById(R.id.textview958);
		textview959 = findViewById(R.id.textview959);
		textview933 = findViewById(R.id.textview933);
		edittext109 = findViewById(R.id.edittext109);
		textview934 = findViewById(R.id.textview934);
		textview935 = findViewById(R.id.textview935);
		internet = new RequestNetwork(this);
		
		//ScrollChange2
		vscroll1.setOnScrollChangeListener(new ScrollView.OnScrollChangeListener() {
			@Override
			public void onScrollChange(View v, int _scrollX, int _scrollY, int _oldScrollX, int _oldScrollY) {
				
			}
		});
		
		edittext51.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext51.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
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
				edittext100.setText(String.valueOf(00.00));
				edittext102.setText(String.valueOf(00.00));
				edittext104.setText(String.valueOf(00.00));
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
				edittext100.setTextColor(0xFFE91E63);
				edittext102.setTextColor(0xFFE91E63);
				edittext104.setTextColor(0xFFE91E63);
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
					linear140.setVisibility(View.GONE);
					linear301.setVisibility(View.VISIBLE);
					edittext61.setText("");
					edittext62.setText("");
					edittext63.setText("");
					edittext64.setText("");
					edittext65.setTextColor(0xFF000000);
					edittext66.setTextColor(0xFF000000);
					edittext67.setTextColor(0xFF000000);
					edittext68.setTextColor(0xFF000000);
					edittext69.setTextColor(0xFF000000);
					edittext70.setTextColor(0xFF000000);
					edittext71.setTextColor(0xFF000000);
					edittext72.setTextColor(0xFF000000);
					edittext73.setTextColor(0xFF000000);
					edittext74.setText("");
					edittext75.setText("");
					edittext76.setText("");
					edittext77.setText("");
					edittext78.setText("");
					edittext118.setText("");
					edittext79.setTextColor(0xFF000000);
					edittext80.setTextColor(0xFF000000);
					edittext81.setTextColor(0xFF000000);
					edittext82.setTextColor(0xFF000000);
					edittext83.setTextColor(0xFF000000);
					edittext119.setTextColor(0xFF000000);
					edittext85.setTextColor(0xFFFFFFFF);
					edittext86.setTextColor(0xFFFFFFFF);
					edittext89.setText("");
					edittext90.setText("");
					edittext91.setText("");
					edittext92.setText("");
					edittext93.setText("");
					edittext94.setText("");
					edittext95.setText("");
					edittext96.setText("");
					edittext97.setText("");
					edittext98.setText("");
					edittext99.setText("");
					edittext100.setTextColor(0xFF000000);
					edittext101.setTextColor(0xFF000000);
					edittext102.setTextColor(0xFF000000);
					edittext103.setTextColor(0xFF000000);
					edittext104.setTextColor(0xFF000000);
					edittext105.setTextColor(0xFF000000);
					edittext106.setTextColor(0xFF000000);
					edittext107.setTextColor(0xFF000000);
					edittext108.setTextColor(0xFF000000);
					edittext109.setTextColor(0xFFFFFFFF);
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
					linear140.setVisibility(View.VISIBLE);
					linear301.setVisibility(View.GONE);
					edittext61.setText("");
					edittext62.setText("");
					edittext63.setText("");
					edittext64.setText("");
					edittext65.setTextColor(0xFF000000);
					edittext66.setTextColor(0xFF000000);
					edittext67.setTextColor(0xFF000000);
					edittext68.setTextColor(0xFF000000);
					edittext69.setTextColor(0xFF000000);
					edittext70.setTextColor(0xFF000000);
					edittext71.setTextColor(0xFF000000);
					edittext72.setTextColor(0xFF000000);
					edittext73.setTextColor(0xFF000000);
					edittext74.setText("");
					edittext75.setText("");
					edittext76.setText("");
					edittext77.setText("");
					edittext78.setText("");
					edittext118.setText("");
					edittext79.setTextColor(0xFF000000);
					edittext80.setTextColor(0xFF000000);
					edittext81.setTextColor(0xFF000000);
					edittext82.setTextColor(0xFF000000);
					edittext83.setTextColor(0xFF000000);
					edittext119.setTextColor(0xFF000000);
					edittext85.setTextColor(0xFFFFFFFF);
					edittext86.setTextColor(0xFFFFFFFF);
					edittext89.setText("");
					edittext90.setText("");
					edittext91.setText("");
					edittext92.setText("");
					edittext93.setText("");
					edittext94.setText("");
					edittext95.setText("");
					edittext96.setText("");
					edittext97.setText("");
					edittext98.setText("");
					edittext99.setText("");
					edittext100.setTextColor(0xFF000000);
					edittext101.setTextColor(0xFF000000);
					edittext102.setTextColor(0xFF000000);
					edittext103.setTextColor(0xFF000000);
					edittext104.setTextColor(0xFF000000);
					edittext105.setTextColor(0xFF000000);
					edittext106.setTextColor(0xFF000000);
					edittext107.setTextColor(0xFF000000);
					edittext108.setTextColor(0xFF000000);
					edittext109.setTextColor(0xFFFFFFFF);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
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
				        .on(ToipccconcretematerialsActivity.this, textview335)
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
				        .on(ToipccconcretematerialsActivity.this, textview340)
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
				        .on(ToipccconcretematerialsActivity.this, textview344)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة الأسمنت بالخلطة الخرسانية [ المحتوي الأسمنتي ] ( كجم / م٣ ) \" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٢٥٠ كجم / م٣ \"")
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
				        .on(ToipccconcretematerialsActivity.this, textview350)
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
		
		button82.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext51.getText().toString().equals("") || edittext51.getText().toString().equals(".")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext61.getText().toString().equals("") || ((Double.parseDouble(edittext61.getText().toString()) > 0.6d) || (Double.parseDouble(edittext61.getText().toString()) < 0.3d))) {
						edittext61.setText(String.valueOf(0.4d));
					}
					if (edittext62.getText().toString().equals("") || ((Double.parseDouble(edittext62.getText().toString()) > 1) || (Double.parseDouble(edittext62.getText().toString()) < 0.5d))) {
						edittext62.setText(String.valueOf(0.8d));
					}
					if (edittext63.getText().toString().equals("") || ((Double.parseDouble(edittext63.getText().toString()) > 1000) || (Double.parseDouble(edittext63.getText().toString()) < 100))) {
						edittext63.setText(String.valueOf(250));
					}
					if (edittext64.getText().toString().equals("") || ((Double.parseDouble(edittext64.getText().toString()) > 1) || (Double.parseDouble(edittext64.getText().toString()) < 0.3d))) {
						edittext64.setText(String.valueOf(0.5d));
					}
					edittext65.setText(String.valueOf(Double.parseDouble(edittext61.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
					edittext66.setText(String.valueOf(Double.parseDouble(edittext62.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
					edittext67.setText(String.valueOf(Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
					edittext68.setText(String.valueOf((Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(edittext51.getText().toString())) / 1000));
					edittext69.setText(String.valueOf((Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(edittext51.getText().toString())) / 50));
					edittext70.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext69.getText().toString()))));
					edittext71.setText(String.valueOf(Double.parseDouble(edittext70.getText().toString()) * 50));
					edittext72.setText(String.valueOf(Double.parseDouble(edittext71.getText().toString()) / 1000));
					edittext73.setText(String.valueOf(Double.parseDouble(edittext64.getText().toString()) * Double.parseDouble(edittext68.getText().toString())));
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
					edittext119.setTextColor(0xFF000000);
					edittext85.setTextColor(0xFFFFFFFF);
					edittext86.setTextColor(0xFFFFFFFF);
				}
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
				edittext69.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				        .on(ToipccconcretematerialsActivity.this, textview529)
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
				        .on(ToipccconcretematerialsActivity.this, textview537)
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
				        .on(ToipccconcretematerialsActivity.this, textview348)
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
				        .on(ToipccconcretematerialsActivity.this, textview971)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("سعر مصنعية الصب والفرمجة شامل إيجار الخلاطة ( جنيه / يوم )\nفي حالة عدم الرغبة في ادخاله واعتباره محمل علي سعر النجارة سيهمله البرنامج\n\" مدخل إختياري في حالة عدم الرغبة في إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠٠.٠٠ جنيه/م٣ \"")
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
				if ((edittext51.getText().toString().equals("") || edittext74.getText().toString().equals("")) || (edittext75.getText().toString().equals("") || (edittext76.getText().toString().equals("") || edittext78.getText().toString().equals("")))) {
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
						edittext63.setText(String.valueOf(250));
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
					edittext65.setText(String.valueOf(Double.parseDouble(edittext61.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
					edittext79.setText(String.valueOf(Double.parseDouble(edittext65.getText().toString()) * Double.parseDouble(edittext74.getText().toString())));
					edittext193.setText(String.valueOf(Double.parseDouble(edittext42.getText().toString()) * Double.parseDouble(edittext74.getText().toString())));
					edittext66.setText(String.valueOf(Double.parseDouble(edittext62.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
					edittext80.setText(String.valueOf(Double.parseDouble(edittext66.getText().toString()) * Double.parseDouble(edittext75.getText().toString())));
					edittext194.setText(String.valueOf(Double.parseDouble(edittext45.getText().toString()) * Double.parseDouble(edittext75.getText().toString())));
					edittext67.setText(String.valueOf(Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
					edittext68.setText(String.valueOf((Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(edittext51.getText().toString())) / 1000));
					edittext69.setText(String.valueOf((Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(edittext51.getText().toString())) / 50));
					edittext70.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext69.getText().toString()))));
					edittext71.setText(String.valueOf(Double.parseDouble(edittext70.getText().toString()) * 50));
					edittext72.setText(String.valueOf(Double.parseDouble(edittext71.getText().toString()) / 1000));
					edittext81.setText(String.valueOf(Double.parseDouble(edittext68.getText().toString()) * Double.parseDouble(edittext76.getText().toString())));
					edittext82.setText(String.valueOf(Double.parseDouble(edittext72.getText().toString()) * Double.parseDouble(edittext76.getText().toString())));
					edittext73.setText(String.valueOf(Double.parseDouble(edittext64.getText().toString()) * Double.parseDouble(edittext68.getText().toString())));
					edittext83.setText(String.valueOf(Double.parseDouble(edittext77.getText().toString()) * Double.parseDouble(edittext73.getText().toString())));
					edittext84.setText(String.valueOf(Double.parseDouble(edittext78.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
					edittext119.setText(String.valueOf((long)(Double.parseDouble(edittext118.getText().toString()) * Double.parseDouble(edittext51.getText().toString()))));
					edittext85.setText(String.valueOf(((Double.parseDouble(edittext119.getText().toString()) + Double.parseDouble(edittext79.getText().toString())) + Double.parseDouble(edittext80.getText().toString())) + ((Double.parseDouble(edittext81.getText().toString()) + Double.parseDouble(edittext83.getText().toString())) + Double.parseDouble(edittext84.getText().toString()))));
					edittext86.setText(String.valueOf(((Double.parseDouble(edittext119.getText().toString()) + Double.parseDouble(edittext193.getText().toString())) + Double.parseDouble(edittext194.getText().toString())) + ((Double.parseDouble(edittext82.getText().toString()) + Double.parseDouble(edittext83.getText().toString())) + Double.parseDouble(edittext84.getText().toString()))));
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
					edittext83.setTextColor(0xFF000000);
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
				        .on(ToipccconcretematerialsActivity.this, textview316)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("إجمالي تكلفة النجارة ( جنيه )\nبيتم حسابها علي أساس الكمية التصميمية لا الفعلية لان معظم الخرسانة الموردة بتكون أكبر من التصميمية المحسوبة وبنسب مختلفة غير ثابتة\nوهي = أجمالى كمية الخرسانة للقواعد التي يتم ادخال أبعاده وبياناتها في أول الصفحة ( الكمية التصميمية ) * سعر مصنعية النجارة والصب ( جنيه )")
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
		
		button106.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.biltafsil.com/18209/%d8%b3%d8%b9%d8%b1-%d9%85%d8%aa%d8%b1-%d8%a7%d9%84%d8%b1%d9%85%d9%84-%d9%88%d8%a7%d9%84%d8%b2%d9%84%d8%b7/"));
				startActivity(price);
			}
		});
		
		button107.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.biltafsil.com/18209/%d8%b3%d8%b9%d8%b1-%d9%85%d8%aa%d8%b1-%d8%a7%d9%84%d8%b1%d9%85%d9%84-%d9%88%d8%a7%d9%84%d8%b2%d9%84%d8%b7/"));
				startActivity(price);
			}
		});
		
		button109.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.altkia.com/cement-prices-today/"));
				startActivity(price);
			}
		});
		
		edittext89.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext89.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext101.setText(String.valueOf(00.00));
				edittext100.setText(String.valueOf(00.00));
				edittext109.setText(String.valueOf(00.00));
				edittext101.setTextColor(0xFFE91E63);
				edittext100.setTextColor(0xFFE91E63);
				edittext109.setTextColor(0xFFE91E63);
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
				edittext103.setText(String.valueOf(00.00));
				edittext102.setText(String.valueOf(00.00));
				edittext109.setText(String.valueOf(00.00));
				edittext103.setTextColor(0xFFE91E63);
				edittext102.setTextColor(0xFFE91E63);
				edittext109.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext91.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext91.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext105.setText(String.valueOf(00.00));
				edittext104.setText(String.valueOf(00.00));
				edittext109.setText(String.valueOf(00.00));
				edittext105.setTextColor(0xFFE91E63);
				edittext104.setTextColor(0xFFE91E63);
				edittext109.setTextColor(0xFFE91E63);
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
				        .on(ToipccconcretematerialsActivity.this, textview859)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("كمية الأسمنت الموردة لزوم الخلطة الخرسانية للقواعد العادية ( شكارة )\n( وذلك بفرض إن وزن شكارة الأسمنت = ٥٠ كجم )")
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
		
		edittext92.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext92.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext106.setText(String.valueOf(00.00));
				edittext109.setText(String.valueOf(00.00));
				edittext106.setTextColor(0xFFE91E63);
				edittext109.setTextColor(0xFFE91E63);
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
				        .on(ToipccconcretematerialsActivity.this, textview861)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("كمية المياه الموردة لزوم الخلطة الخرسانية للقواعد العادية ( م٣ )\nوتمثل نصف كمية الأسمنت بالطن تقريبآ \nولا يمكن إن تزيد قيمته عن ( ٠.٧٥ * كمية الأسمنت بالطن )\nولا يمكن أن تقل عن ( ٠.٢٥ * كمية الأسمنت بالطن )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ( كمية الأسمنت بالطن ÷ ٢ )")
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
		
		edittext93.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext93.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext108.setText(String.valueOf(00.00));
				edittext109.setText(String.valueOf(00.00));
				edittext108.setTextColor(0xFFE91E63);
				edittext109.setTextColor(0xFFE91E63);
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
				        .on(ToipccconcretematerialsActivity.this, textview962)
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
		
		edittext94.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext94.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext101.setText(String.valueOf(00.00));
				edittext100.setText(String.valueOf(00.00));
				edittext109.setText(String.valueOf(00.00));
				edittext101.setTextColor(0xFFE91E63);
				edittext100.setTextColor(0xFFE91E63);
				edittext109.setTextColor(0xFFE91E63);
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
				edittext103.setText(String.valueOf(00.00));
				edittext102.setText(String.valueOf(00.00));
				edittext109.setText(String.valueOf(00.00));
				edittext103.setTextColor(0xFFE91E63);
				edittext102.setTextColor(0xFFE91E63);
				edittext109.setTextColor(0xFFE91E63);
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
				edittext105.setText(String.valueOf(00.00));
				edittext104.setText(String.valueOf(00.00));
				edittext109.setText(String.valueOf(00.00));
				edittext105.setTextColor(0xFFE91E63);
				edittext104.setTextColor(0xFFE91E63);
				edittext109.setTextColor(0xFFE91E63);
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
				edittext97.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext106.setText(String.valueOf(00.00));
				edittext109.setText(String.valueOf(00.00));
				edittext106.setTextColor(0xFFE91E63);
				edittext109.setTextColor(0xFFE91E63);
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
				        .on(ToipccconcretematerialsActivity.this, textview904)
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
		
		edittext98.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext98.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext107.setText(String.valueOf(00.00));
				edittext109.setText(String.valueOf(00.00));
				edittext107.setTextColor(0xFFE91E63);
				edittext109.setTextColor(0xFFE91E63);
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
				edittext108.setText(String.valueOf(00.00));
				edittext109.setText(String.valueOf(00.00));
				edittext108.setTextColor(0xFFE91E63);
				edittext109.setTextColor(0xFFE91E63);
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
				        .on(ToipccconcretematerialsActivity.this, textview956)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("سعر مصنعية الصب والفرمجة شامل إيجار الخلاطة ( جنيه / يوم )\nفي حالة عدم الرغبة في ادخاله واعتباره محمل علي سعر النجارة سيهمله البرنامج\n\" مدخل إختياري في حالة عدم الرغبة في إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠٠.٠٠ جنيه/يوم \"")
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
				if (((edittext51.getText().toString().equals("") || edittext51.getText().toString().equals(".")) || (edittext89.getText().toString().equals("") || edittext90.getText().toString().equals(""))) || ((edittext91.getText().toString().equals("") || edittext94.getText().toString().equals("")) || ((edittext95.getText().toString().equals("") || edittext96.getText().toString().equals("")) || edittext98.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext92.getText().toString().equals("") || ((Double.parseDouble(edittext92.getText().toString()) > (0.75d * ((Double.parseDouble(edittext91.getText().toString()) * 50) / 1000))) || (Double.parseDouble(edittext92.getText().toString()) < (0.25d * ((Double.parseDouble(edittext91.getText().toString()) * 50) / 1000))))) {
						edittext92.setText(String.valueOf(0.5d * ((Double.parseDouble(edittext91.getText().toString()) * 50) / 1000)));
					}
					if (edittext97.getText().toString().equals("") || (Double.parseDouble(edittext97.getText().toString()) < 0)) {
						edittext97.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if (edittext93.getText().toString().equals("") || (Double.parseDouble(edittext93.getText().toString()) < 0)) {
						edittext93.setText(String.valueOf(Double.parseDouble("1")));
					}
					if (edittext99.getText().toString().equals("") || (Double.parseDouble(edittext99.getText().toString()) < 0)) {
						edittext99.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					edittext101.setText(String.valueOf(Double.parseDouble(edittext89.getText().toString()) * Double.parseDouble(edittext94.getText().toString())));
					edittext100.setText(String.valueOf(Double.parseDouble(edittext89.getText().toString()) / Double.parseDouble(edittext51.getText().toString())));
					if (Double.parseDouble(edittext100.getText().toString()) < 0.2d) {
						textview939.setText("نسبة الرمل\nبالنسبة لكمية\nخرسانة القواعد\nالعادية أقل من\n٠.٢٠\nوهذه قيمة\nصغيرة جدآ\nوغير هندسية");
					}
					else {
						if (Double.parseDouble(edittext100.getText().toString()) > 0.7d) {
							textview939.setText("نسبة الرمل\nبالنسبة لكمية\nخرسانة القواعد\nالعادية أكبر من\n٠.٧٠\nوهذه قيمة\nكبيرة جدآ\nوغير هندسية");
						}
						else {
							textview939.setText("");
						}
					}
					edittext103.setText(String.valueOf(Double.parseDouble(edittext90.getText().toString()) * Double.parseDouble(edittext95.getText().toString())));
					edittext102.setText(String.valueOf(Double.parseDouble(edittext90.getText().toString()) / Double.parseDouble(edittext51.getText().toString())));
					if (Double.parseDouble(edittext102.getText().toString()) < 0.4d) {
						textview940.setText("نسبة الزلط أو\nالسن بالنسبة\nلكمية خرسانة \nالقواعد العادية\nأقل من ٠.٤٠\nوهذه قيمة\nصغيرة جدآ\nوغير هندسية");
					}
					else {
						if (Double.parseDouble(edittext102.getText().toString()) > 0.9d) {
							textview940.setText("نسبة الزلط أو\nالسن بالنسبة\nلكمية خرسانة \nالقواعد العادية\nأكبر من ٠.٩٠\nوهذه قيمة\nكبيرة جدآ\nوغير هندسية");
						}
						else {
							textview940.setText("");
						}
					}
					edittext105.setText(String.valueOf(((Double.parseDouble(edittext91.getText().toString()) * 50) / 1000) * Double.parseDouble(edittext96.getText().toString())));
					edittext104.setText(String.valueOf((Double.parseDouble(edittext91.getText().toString()) * 50) / Double.parseDouble(edittext51.getText().toString())));
					if (Double.parseDouble(edittext104.getText().toString()) < 100) {
						textview914.setText("نسبة الأسمنت\nبالخلطة الخرسانية\nأقل من ١٠٠ كجم/م٣\nوهذه قيمة صغيرة\nجدآ وغير هندسية");
					}
					else {
						if (Double.parseDouble(edittext104.getText().toString()) > 400) {
							textview914.setText("نسبة الأسمنت\nبالخلطة الخرسانية\nأكبر من ٤٠٠ كجم/م٣\nوهذه قيمة كبيرة\nجدآ وغير هندسية");
						}
						else {
							textview914.setText("");
						}
					}
					edittext106.setText(String.valueOf(Double.parseDouble(edittext92.getText().toString()) * Double.parseDouble(edittext97.getText().toString())));
					edittext107.setText(String.valueOf(Double.parseDouble(edittext51.getText().toString()) * Double.parseDouble(edittext98.getText().toString())));
					edittext108.setText(String.valueOf(Double.parseDouble(edittext93.getText().toString()) * Double.parseDouble(edittext99.getText().toString())));
					edittext109.setText(String.valueOf(((Double.parseDouble(edittext101.getText().toString()) + Double.parseDouble(edittext103.getText().toString())) + Double.parseDouble(edittext105.getText().toString())) + (Double.parseDouble(edittext106.getText().toString()) + (Double.parseDouble(edittext107.getText().toString()) + Double.parseDouble(edittext108.getText().toString())))));
					edittext101.setTextColor(0xFF000000);
					edittext100.setTextColor(0xFF000000);
					edittext103.setTextColor(0xFF000000);
					edittext102.setTextColor(0xFF000000);
					edittext105.setTextColor(0xFF000000);
					edittext104.setTextColor(0xFF000000);
					edittext106.setTextColor(0xFF000000);
					edittext107.setTextColor(0xFF000000);
					edittext108.setTextColor(0xFF000000);
					edittext109.setTextColor(0xFFFFFFFF);
				}
			}
		});
		
		edittext100.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext100.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
		
		textview929.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccconcretematerialsActivity.this, textview929)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("إجمالي تكلفة النجارة ( جنيه )\nبيتم حسابها علي أساس الكمية التصميمية لا الفعلية لان معظم الخرسانة الموردة بتكون أكبر من التصميمية المحسوبة وبنسب مختلفة غير ثابتة\nوهي = أجمالى كمية الخرسانة للقواعد التي يتم ادخال أبعاده وبياناتها في أول الصفحة ( الكمية التصميمية ) * سعر مصنعية النجارة ( جنيه )")
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
		
		edittext109.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext109.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
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
		linear140.setVisibility(View.GONE);
		linear301.setVisibility(View.GONE);
		_CardStyle(textview808, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button95, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button96, 25, 25, "#FF4DD0E1", false);
		_round(linear75, "#FFC5CAE9", "#FF000000", 50);
		_round(linear140, "#FFE0F2F1", "#FF000000", 50);
		_round(linear301, "#FFE0F2F1", "#FF000000", 50);
		
		{
		}
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
		PrintHelper printHelper = new PrintHelper(ToipccconcretematerialsActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
}
