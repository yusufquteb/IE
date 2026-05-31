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


public class ToipccBrickWorkssActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private double temp1 = 0;
	private double temp = 0;
	private double temp1a = 0;
	private double temp2b = 0;
	private double temp3c = 0;
	private double temp2 = 0;
	private double temp3 = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear723;
	private LinearLayout linear2;
	private LinearLayout add_dynamic_wall_linear;
	private Button add_dynamic_wall;
	private LinearLayout linear120;
	private LinearLayout linear759;
	private HorizontalScrollView hscroll2;
	private LinearLayout linear144;
	private TextView textview14;
	private LinearLayout linear760;
	private TextView textview482;
	private Button button28;
	private HorizontalScrollView hscroll32;
	private LinearLayout linear57;
	private TextView textview1;
	private LinearLayout linear872;
	private TextView textview1222;
	private LinearLayout linear386;
	private LinearLayout linear724;
	private LinearLayout linear725;
	private LinearLayout linear410;
	private LinearLayout linear726;
	private LinearLayout linear289;
	private TextView textview555;
	private Button button195;
	private LinearLayout linear873;
	private LinearLayout linear707;
	private TextView textview1221;
	private TextView textview583;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private EditText edittext137;
	private TextView textview845;
	private TextView textview585;
	private TextView textview584;
	private Button button29;
	private TextView textview809;
	private LinearLayout linear389;
	private HorizontalScrollView hscroll94;
	private LinearLayout linear56;
	private HorizontalScrollView hscroll33;
	private LinearLayout linear162;
	private HorizontalScrollView hscroll35;
	private LinearLayout linear161;
	private HorizontalScrollView hscroll37;
	private LinearLayout linear164;
	private LinearLayout linear194;
	private TextView textview666;
	private TextView textview668;
	private TextView textview667;
	private LinearLayout linear188;
	private HorizontalScrollView hscroll57;
	private LinearLayout linear13;
	private TextView textview477;
	private LinearLayout add_dynamic_hole_linear;
	private LinearLayout linear722;
	private HorizontalScrollView hscroll19;
	private LinearLayout linear74;
	private Button add_dynamic_hole;
	private HorizontalScrollView hscroll56;
	private TextView textview55;
	private LinearLayout linear183;
	private TextView textview1430;
	private TextView textview56;
	private LinearLayout linear758;
	private TextView textview18;
	private EditText edittext7;
	private TextView textview17;
	private TextView textview16;
	private EditText edittext6;
	private TextView textview10;
	private TextView textview446;
	private EditText edittext1;
	private TextView textview81;
	private TextView textview5;
	private TextView textview448;
	private EditText edittext2;
	private TextView textview422;
	private TextView textview11;
	private TextView textview447;
	private EditText edittext22;
	private TextView textview421;
	private TextView L1;
	private EditText edittext3;
	private TextView textview426;
	private TextView textview7;
	private EditText edittext444;
	private Button button1;
	private TextView textview510;
	private EditText edittext4;
	private TextView textview508;
	private TextView textview509;
	private TextView textview449;
	private EditText edittext5;
	private TextView textview13;
	private TextView textview12;
	private TextView textview705;
	private EditText edittext16;
	private TextView textview706;
	private TextView textview707;
	private TextView textview467;
	private EditText edittext15;
	private TextView textview286;
	private TextView textview112;
	private TextView textview488;
	private EditText edittext17;
	private TextView textview489;
	private TextView textview487;
	private TextView textview1421;
	private EditText edittext20;
	private TextView textview1422;
	private TextView textview1423;
	private TextView textview708;
	private EditText edittext18;
	private TextView textview532;
	private TextView textview533;
	private TextView textview1424;
	private EditText edittext21;
	private TextView textview1425;
	private TextView textview1426;
	private TextView textview601;
	private EditText edittext19;
	private TextView textview602;
	private TextView textview603;
	private TextView textview1427;
	private EditText edittext23;
	private TextView textview1428;
	private TextView textview1429;
	private LinearLayout linear713;
	private HorizontalScrollView hscroll40;
	private LinearLayout linear746;
	private TextView textview1352;
	private LinearLayout linear731;
	private TextView textview114;
	private LinearLayout linear863;
	private HorizontalScrollView hscroll93;
	private LinearLayout linear870;
	private ImageView imageview36;
	private LinearLayout linear720;
	private TextView textview1336;
	private TextView textview83;
	private LinearLayout linear181;
	private LinearLayout linear109;
	private HorizontalScrollView hscroll13;
	private LinearLayout linear165;
	private HorizontalScrollView hscroll38;
	private LinearLayout linear166;
	private HorizontalScrollView hscroll39;
	private TextView textview84;
	private LinearLayout linear167;
	private HorizontalScrollView hscroll41;
	private LinearLayout linear16;
	private TextView textview511;
	private Button button31;
	private TextView textview512;
	private TextView textview1351;
	private LinearLayout linear768;
	private HorizontalScrollView hscroll48;
	private LinearLayout linear418;
	private TextView textview475;
	private TextView textview440;
	private HorizontalScrollView hscroll63;
	private LinearLayout linear737;
	private HorizontalScrollView hscroll67;
	private LinearLayout linear747;
	private HorizontalScrollView hscroll69;
	private LinearLayout linear785;
	private TextView textview88;
	private TextView textview450;
	private EditText edittext24;
	private TextView textview316;
	private TextView textview196;
	private TextView textview451;
	private EditText edittext25;
	private TextView textview428;
	private TextView textview90;
	private TextView textview452;
	private EditText edittext26;
	private TextView textview429;
	private TextView textview377;
	private TextView textview453;
	private EditText edittext27;
	private TextView textview430;
	private TextView textview260;
	private TextView textview454;
	private EditText edittext28;
	private TextView textview431;
	private TextView textview232;
	private TextView textview1449;
	private EditText edittext29;
	private TextView textview1450;
	private TextView textview1451;
	private LinearLayout linear172;
	private HorizontalScrollView hscroll49;
	private LinearLayout linear173;
	private HorizontalScrollView hscroll66;
	private LinearLayout linear754;
	private TextView textview203;
	private EditText edittext30;
	private TextView textview435;
	private TextView textview202;
	private TextView textview1431;
	private EditText edittext31;
	private TextView textview438;
	private TextView textview234;
	private TextView textview1370;
	private TextView textview1401;
	private LinearLayout linear388;
	private TextView textview815;
	private EditText edittext32;
	private TextView textview1371;
	private EditText edittext33;
	private TextView textview1372;
	private TextView textview1373;
	private LinearLayout linear176;
	private HorizontalScrollView hscroll68;
	private LinearLayout linear748;
	private HorizontalScrollView hscroll78;
	private LinearLayout linear753;
	private HorizontalScrollView hscroll84;
	private LinearLayout linear152;
	private HorizontalScrollView hscroll81;
	private LinearLayout linear752;
	private HorizontalScrollView hscroll82;
	private LinearLayout linear769;
	private TextView textview1374;
	private EditText edittext34;
	private TextView textview1375;
	private TextView textview1376;
	private TextView textview1432;
	private EditText edittext35;
	private TextView textview1404;
	private TextView textview1405;
	private TextView textview1402;
	private TextView textview1403;
	private LinearLayout linear749;
	private TextView textview1406;
	private EditText edittext36;
	private TextView textview629;
	private EditText edittext37;
	private TextView textview630;
	private TextView textview631;
	private TextView textview1413;
	private EditText edittext38;
	private TextView textview1414;
	private TextView textview1415;
	private TextView textview1379;
	private TextView textview1378;
	private LinearLayout linear770;
	private TextView textview1377;
	private EditText edittext39;
	private LinearLayout linear739;
	private HorizontalScrollView hscroll70;
	private LinearLayout linear756;
	private HorizontalScrollView hscroll79;
	private LinearLayout linear755;
	private TextView textview1400;
	private EditText edittext40;
	private TextView textview1380;
	private TextView textview1381;
	private TextView textview1433;
	private EditText edittext41;
	private TextView textview1418;
	private TextView textview1419;
	private TextView textview1416;
	private TextView textview1417;
	private LinearLayout linear757;
	private TextView textview1420;
	private EditText edittext42;
	private TextView textview103;
	private Button button53;
	private LinearLayout linear780;
	private LinearLayout linear777;
	private TextView textview513;
	private Button button54;
	private LinearLayout linear778;
	private LinearLayout linear779;
	private TextView textview613;
	private Button button48;
	private Button button49;
	private LinearLayout linear781;
	private HorizontalScrollView hscroll71;
	private LinearLayout linear767;
	private HorizontalScrollView hscroll80;
	private LinearLayout linear740;
	private Button button104;
	private HorizontalScrollView hscroll72;
	private LinearLayout linear741;
	private Button button102;
	private HorizontalScrollView hscroll73;
	private LinearLayout linear742;
	private Button button103;
	private HorizontalScrollView hscroll30;
	private LinearLayout linear743;
	private HorizontalScrollView hscroll75;
	private LinearLayout linear153;
	private HorizontalScrollView hscroll88;
	private LinearLayout linear744;
	private HorizontalScrollView hscroll76;
	private LinearLayout linear786;
	private HorizontalScrollView hscroll89;
	private LinearLayout linear745;
	private HorizontalScrollView hscroll31;
	private LinearLayout linear862;
	private HorizontalScrollView hscroll90;
	private LinearLayout linear771;
	private HorizontalScrollView hscroll83;
	private LinearLayout linear773;
	private HorizontalScrollView hscroll91;
	private LinearLayout linear865;
	private ImageView imageview37;
	private LinearLayout linear782;
	private TextView textview1462;
	private TextView textview1446;
	private EditText edittext43;
	private TextView textview1447;
	private TextView textview1448;
	private TextView textview1382;
	private EditText edittext44;
	private TextView textview1383;
	private TextView textview1384;
	private TextView textview1385;
	private EditText edittext45;
	private TextView textview1386;
	private TextView textview1387;
	private TextView textview1388;
	private EditText edittext46;
	private TextView textview1389;
	private TextView textview1390;
	private TextView textview1391;
	private EditText edittext47;
	private TextView textview1392;
	private TextView textview1393;
	private TextView textview1169;
	private EditText edittext60;
	private TextView textview1170;
	private TextView textview1171;
	private TextView textview1394;
	private EditText edittext48;
	private TextView textview1395;
	private TextView textview1396;
	private TextView textview1472;
	private EditText edittext61;
	private TextView textview1473;
	private TextView textview1474;
	private TextView textview1397;
	private EditText edittext49;
	private TextView textview1398;
	private TextView textview1399;
	private TextView textview2041;
	private EditText edittext62;
	private TextView textview2042;
	private TextView textview2043;
	private TextView textview1453;
	private EditText edittext50;
	private TextView textview1454;
	private TextView textview1455;
	private EditText edittext56y;
	private TextView textview1457;
	private LinearLayout linear774;
	private TextView textview1459;
	private EditText edittext51;
	private TextView textview2050;
	private TextView textview2051;
	private LinearLayout linear867;
	private TextView textview2054;
	private EditText edittext63;
	private TextView textview1461;
	private Button button50;
	private Button button51;
	private Button button52;
	private LinearLayout linear783;
	private HorizontalScrollView hscroll85;
	private LinearLayout linear93;
	private HorizontalScrollView hscroll86;
	private LinearLayout linear94;
	private HorizontalScrollView hscroll87;
	private LinearLayout linear96;
	private HorizontalScrollView hscroll74;
	private LinearLayout linear775;
	private ImageView imageview38;
	private LinearLayout linear784;
	private TextView textview1463;
	private TextView textview466;
	private EditText edittext52;
	private TextView textview276;
	private TextView textview277;
	private TextView textview1466;
	private EditText edittext53;
	private TextView textview1467;
	private TextView textview1468;
	private TextView textview1469;
	private EditText edittext54;
	private TextView textview1470;
	private TextView textview1471;
	private EditText edittext195;
	private TextView textview288;
	private LinearLayout linear776;
	private TextView textview1460;
	private EditText edittext55;
	private TextView textview292;
	private TextView textview291;
	private LinearLayout linear95;
	private TextView textview473;
	private EditText edittext56;
	private TextView textview2058;
	private TextView textview2059;
	private LinearLayout linear871;
	private TextView textview2060;
	private EditText edittext64;
	
	private Intent price = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_brick_workss);
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
		linear723 = findViewById(R.id.linear723);
		linear2 = findViewById(R.id.linear2);
		add_dynamic_wall_linear = findViewById(R.id.add_dynamic_wall_linear);
		add_dynamic_wall = findViewById(R.id.add_dynamic_wall);
		linear120 = findViewById(R.id.linear120);
		linear759 = findViewById(R.id.linear759);
		hscroll2 = findViewById(R.id.hscroll2);
		linear144 = findViewById(R.id.linear144);
		textview14 = findViewById(R.id.textview14);
		linear760 = findViewById(R.id.linear760);
		textview482 = findViewById(R.id.textview482);
		button28 = findViewById(R.id.button28);
		hscroll32 = findViewById(R.id.hscroll32);
		linear57 = findViewById(R.id.linear57);
		textview1 = findViewById(R.id.textview1);
		linear872 = findViewById(R.id.linear872);
		textview1222 = findViewById(R.id.textview1222);
		linear386 = findViewById(R.id.linear386);
		linear724 = findViewById(R.id.linear724);
		linear725 = findViewById(R.id.linear725);
		linear410 = findViewById(R.id.linear410);
		linear726 = findViewById(R.id.linear726);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		button195 = findViewById(R.id.button195);
		linear873 = findViewById(R.id.linear873);
		linear707 = findViewById(R.id.linear707);
		textview1221 = findViewById(R.id.textview1221);
		textview583 = findViewById(R.id.textview583);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		edittext137 = findViewById(R.id.edittext137);
		textview845 = findViewById(R.id.textview845);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		button29 = findViewById(R.id.button29);
		textview809 = findViewById(R.id.textview809);
		linear389 = findViewById(R.id.linear389);
		hscroll94 = findViewById(R.id.hscroll94);
		linear56 = findViewById(R.id.linear56);
		hscroll33 = findViewById(R.id.hscroll33);
		linear162 = findViewById(R.id.linear162);
		hscroll35 = findViewById(R.id.hscroll35);
		linear161 = findViewById(R.id.linear161);
		hscroll37 = findViewById(R.id.hscroll37);
		linear164 = findViewById(R.id.linear164);
		linear194 = findViewById(R.id.linear194);
		textview666 = findViewById(R.id.textview666);
		textview668 = findViewById(R.id.textview668);
		textview667 = findViewById(R.id.textview667);
		linear188 = findViewById(R.id.linear188);
		hscroll57 = findViewById(R.id.hscroll57);
		linear13 = findViewById(R.id.linear13);
		textview477 = findViewById(R.id.textview477);
		add_dynamic_hole_linear = findViewById(R.id.add_dynamic_hole_linear);
		linear722 = findViewById(R.id.linear722);
		hscroll19 = findViewById(R.id.hscroll19);
		linear74 = findViewById(R.id.linear74);
		add_dynamic_hole = findViewById(R.id.add_dynamic_hole);
		hscroll56 = findViewById(R.id.hscroll56);
		textview55 = findViewById(R.id.textview55);
		linear183 = findViewById(R.id.linear183);
		textview1430 = findViewById(R.id.textview1430);
		textview56 = findViewById(R.id.textview56);
		linear758 = findViewById(R.id.linear758);
		textview18 = findViewById(R.id.textview18);
		edittext7 = findViewById(R.id.edittext7);
		textview17 = findViewById(R.id.textview17);
		textview16 = findViewById(R.id.textview16);
		edittext6 = findViewById(R.id.edittext6);
		textview10 = findViewById(R.id.textview10);
		textview446 = findViewById(R.id.textview446);
		edittext1 = findViewById(R.id.edittext1);
		textview81 = findViewById(R.id.textview81);
		textview5 = findViewById(R.id.textview5);
		textview448 = findViewById(R.id.textview448);
		edittext2 = findViewById(R.id.edittext2);
		textview422 = findViewById(R.id.textview422);
		textview11 = findViewById(R.id.textview11);
		textview447 = findViewById(R.id.textview447);
		edittext22 = findViewById(R.id.edittext22);
		textview421 = findViewById(R.id.textview421);
		L1 = findViewById(R.id.L1);
		edittext3 = findViewById(R.id.edittext3);
		textview426 = findViewById(R.id.textview426);
		textview7 = findViewById(R.id.textview7);
		edittext444 = findViewById(R.id.edittext444);
		button1 = findViewById(R.id.button1);
		textview510 = findViewById(R.id.textview510);
		edittext4 = findViewById(R.id.edittext4);
		textview508 = findViewById(R.id.textview508);
		textview509 = findViewById(R.id.textview509);
		textview449 = findViewById(R.id.textview449);
		edittext5 = findViewById(R.id.edittext5);
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		textview705 = findViewById(R.id.textview705);
		edittext16 = findViewById(R.id.edittext16);
		textview706 = findViewById(R.id.textview706);
		textview707 = findViewById(R.id.textview707);
		textview467 = findViewById(R.id.textview467);
		edittext15 = findViewById(R.id.edittext15);
		textview286 = findViewById(R.id.textview286);
		textview112 = findViewById(R.id.textview112);
		textview488 = findViewById(R.id.textview488);
		edittext17 = findViewById(R.id.edittext17);
		textview489 = findViewById(R.id.textview489);
		textview487 = findViewById(R.id.textview487);
		textview1421 = findViewById(R.id.textview1421);
		edittext20 = findViewById(R.id.edittext20);
		textview1422 = findViewById(R.id.textview1422);
		textview1423 = findViewById(R.id.textview1423);
		textview708 = findViewById(R.id.textview708);
		edittext18 = findViewById(R.id.edittext18);
		textview532 = findViewById(R.id.textview532);
		textview533 = findViewById(R.id.textview533);
		textview1424 = findViewById(R.id.textview1424);
		edittext21 = findViewById(R.id.edittext21);
		textview1425 = findViewById(R.id.textview1425);
		textview1426 = findViewById(R.id.textview1426);
		textview601 = findViewById(R.id.textview601);
		edittext19 = findViewById(R.id.edittext19);
		textview602 = findViewById(R.id.textview602);
		textview603 = findViewById(R.id.textview603);
		textview1427 = findViewById(R.id.textview1427);
		edittext23 = findViewById(R.id.edittext23);
		textview1428 = findViewById(R.id.textview1428);
		textview1429 = findViewById(R.id.textview1429);
		linear713 = findViewById(R.id.linear713);
		hscroll40 = findViewById(R.id.hscroll40);
		linear746 = findViewById(R.id.linear746);
		textview1352 = findViewById(R.id.textview1352);
		linear731 = findViewById(R.id.linear731);
		textview114 = findViewById(R.id.textview114);
		linear863 = findViewById(R.id.linear863);
		hscroll93 = findViewById(R.id.hscroll93);
		linear870 = findViewById(R.id.linear870);
		imageview36 = findViewById(R.id.imageview36);
		linear720 = findViewById(R.id.linear720);
		textview1336 = findViewById(R.id.textview1336);
		textview83 = findViewById(R.id.textview83);
		linear181 = findViewById(R.id.linear181);
		linear109 = findViewById(R.id.linear109);
		hscroll13 = findViewById(R.id.hscroll13);
		linear165 = findViewById(R.id.linear165);
		hscroll38 = findViewById(R.id.hscroll38);
		linear166 = findViewById(R.id.linear166);
		hscroll39 = findViewById(R.id.hscroll39);
		textview84 = findViewById(R.id.textview84);
		linear167 = findViewById(R.id.linear167);
		hscroll41 = findViewById(R.id.hscroll41);
		linear16 = findViewById(R.id.linear16);
		textview511 = findViewById(R.id.textview511);
		button31 = findViewById(R.id.button31);
		textview512 = findViewById(R.id.textview512);
		textview1351 = findViewById(R.id.textview1351);
		linear768 = findViewById(R.id.linear768);
		hscroll48 = findViewById(R.id.hscroll48);
		linear418 = findViewById(R.id.linear418);
		textview475 = findViewById(R.id.textview475);
		textview440 = findViewById(R.id.textview440);
		hscroll63 = findViewById(R.id.hscroll63);
		linear737 = findViewById(R.id.linear737);
		hscroll67 = findViewById(R.id.hscroll67);
		linear747 = findViewById(R.id.linear747);
		hscroll69 = findViewById(R.id.hscroll69);
		linear785 = findViewById(R.id.linear785);
		textview88 = findViewById(R.id.textview88);
		textview450 = findViewById(R.id.textview450);
		edittext24 = findViewById(R.id.edittext24);
		textview316 = findViewById(R.id.textview316);
		textview196 = findViewById(R.id.textview196);
		textview451 = findViewById(R.id.textview451);
		edittext25 = findViewById(R.id.edittext25);
		textview428 = findViewById(R.id.textview428);
		textview90 = findViewById(R.id.textview90);
		textview452 = findViewById(R.id.textview452);
		edittext26 = findViewById(R.id.edittext26);
		textview429 = findViewById(R.id.textview429);
		textview377 = findViewById(R.id.textview377);
		textview453 = findViewById(R.id.textview453);
		edittext27 = findViewById(R.id.edittext27);
		textview430 = findViewById(R.id.textview430);
		textview260 = findViewById(R.id.textview260);
		textview454 = findViewById(R.id.textview454);
		edittext28 = findViewById(R.id.edittext28);
		textview431 = findViewById(R.id.textview431);
		textview232 = findViewById(R.id.textview232);
		textview1449 = findViewById(R.id.textview1449);
		edittext29 = findViewById(R.id.edittext29);
		textview1450 = findViewById(R.id.textview1450);
		textview1451 = findViewById(R.id.textview1451);
		linear172 = findViewById(R.id.linear172);
		hscroll49 = findViewById(R.id.hscroll49);
		linear173 = findViewById(R.id.linear173);
		hscroll66 = findViewById(R.id.hscroll66);
		linear754 = findViewById(R.id.linear754);
		textview203 = findViewById(R.id.textview203);
		edittext30 = findViewById(R.id.edittext30);
		textview435 = findViewById(R.id.textview435);
		textview202 = findViewById(R.id.textview202);
		textview1431 = findViewById(R.id.textview1431);
		edittext31 = findViewById(R.id.edittext31);
		textview438 = findViewById(R.id.textview438);
		textview234 = findViewById(R.id.textview234);
		textview1370 = findViewById(R.id.textview1370);
		textview1401 = findViewById(R.id.textview1401);
		linear388 = findViewById(R.id.linear388);
		textview815 = findViewById(R.id.textview815);
		edittext32 = findViewById(R.id.edittext32);
		textview1371 = findViewById(R.id.textview1371);
		edittext33 = findViewById(R.id.edittext33);
		textview1372 = findViewById(R.id.textview1372);
		textview1373 = findViewById(R.id.textview1373);
		linear176 = findViewById(R.id.linear176);
		hscroll68 = findViewById(R.id.hscroll68);
		linear748 = findViewById(R.id.linear748);
		hscroll78 = findViewById(R.id.hscroll78);
		linear753 = findViewById(R.id.linear753);
		hscroll84 = findViewById(R.id.hscroll84);
		linear152 = findViewById(R.id.linear152);
		hscroll81 = findViewById(R.id.hscroll81);
		linear752 = findViewById(R.id.linear752);
		hscroll82 = findViewById(R.id.hscroll82);
		linear769 = findViewById(R.id.linear769);
		textview1374 = findViewById(R.id.textview1374);
		edittext34 = findViewById(R.id.edittext34);
		textview1375 = findViewById(R.id.textview1375);
		textview1376 = findViewById(R.id.textview1376);
		textview1432 = findViewById(R.id.textview1432);
		edittext35 = findViewById(R.id.edittext35);
		textview1404 = findViewById(R.id.textview1404);
		textview1405 = findViewById(R.id.textview1405);
		textview1402 = findViewById(R.id.textview1402);
		textview1403 = findViewById(R.id.textview1403);
		linear749 = findViewById(R.id.linear749);
		textview1406 = findViewById(R.id.textview1406);
		edittext36 = findViewById(R.id.edittext36);
		textview629 = findViewById(R.id.textview629);
		edittext37 = findViewById(R.id.edittext37);
		textview630 = findViewById(R.id.textview630);
		textview631 = findViewById(R.id.textview631);
		textview1413 = findViewById(R.id.textview1413);
		edittext38 = findViewById(R.id.edittext38);
		textview1414 = findViewById(R.id.textview1414);
		textview1415 = findViewById(R.id.textview1415);
		textview1379 = findViewById(R.id.textview1379);
		textview1378 = findViewById(R.id.textview1378);
		linear770 = findViewById(R.id.linear770);
		textview1377 = findViewById(R.id.textview1377);
		edittext39 = findViewById(R.id.edittext39);
		linear739 = findViewById(R.id.linear739);
		hscroll70 = findViewById(R.id.hscroll70);
		linear756 = findViewById(R.id.linear756);
		hscroll79 = findViewById(R.id.hscroll79);
		linear755 = findViewById(R.id.linear755);
		textview1400 = findViewById(R.id.textview1400);
		edittext40 = findViewById(R.id.edittext40);
		textview1380 = findViewById(R.id.textview1380);
		textview1381 = findViewById(R.id.textview1381);
		textview1433 = findViewById(R.id.textview1433);
		edittext41 = findViewById(R.id.edittext41);
		textview1418 = findViewById(R.id.textview1418);
		textview1419 = findViewById(R.id.textview1419);
		textview1416 = findViewById(R.id.textview1416);
		textview1417 = findViewById(R.id.textview1417);
		linear757 = findViewById(R.id.linear757);
		textview1420 = findViewById(R.id.textview1420);
		edittext42 = findViewById(R.id.edittext42);
		textview103 = findViewById(R.id.textview103);
		button53 = findViewById(R.id.button53);
		linear780 = findViewById(R.id.linear780);
		linear777 = findViewById(R.id.linear777);
		textview513 = findViewById(R.id.textview513);
		button54 = findViewById(R.id.button54);
		linear778 = findViewById(R.id.linear778);
		linear779 = findViewById(R.id.linear779);
		textview613 = findViewById(R.id.textview613);
		button48 = findViewById(R.id.button48);
		button49 = findViewById(R.id.button49);
		linear781 = findViewById(R.id.linear781);
		hscroll71 = findViewById(R.id.hscroll71);
		linear767 = findViewById(R.id.linear767);
		hscroll80 = findViewById(R.id.hscroll80);
		linear740 = findViewById(R.id.linear740);
		button104 = findViewById(R.id.button104);
		hscroll72 = findViewById(R.id.hscroll72);
		linear741 = findViewById(R.id.linear741);
		button102 = findViewById(R.id.button102);
		hscroll73 = findViewById(R.id.hscroll73);
		linear742 = findViewById(R.id.linear742);
		button103 = findViewById(R.id.button103);
		hscroll30 = findViewById(R.id.hscroll30);
		linear743 = findViewById(R.id.linear743);
		hscroll75 = findViewById(R.id.hscroll75);
		linear153 = findViewById(R.id.linear153);
		hscroll88 = findViewById(R.id.hscroll88);
		linear744 = findViewById(R.id.linear744);
		hscroll76 = findViewById(R.id.hscroll76);
		linear786 = findViewById(R.id.linear786);
		hscroll89 = findViewById(R.id.hscroll89);
		linear745 = findViewById(R.id.linear745);
		hscroll31 = findViewById(R.id.hscroll31);
		linear862 = findViewById(R.id.linear862);
		hscroll90 = findViewById(R.id.hscroll90);
		linear771 = findViewById(R.id.linear771);
		hscroll83 = findViewById(R.id.hscroll83);
		linear773 = findViewById(R.id.linear773);
		hscroll91 = findViewById(R.id.hscroll91);
		linear865 = findViewById(R.id.linear865);
		imageview37 = findViewById(R.id.imageview37);
		linear782 = findViewById(R.id.linear782);
		textview1462 = findViewById(R.id.textview1462);
		textview1446 = findViewById(R.id.textview1446);
		edittext43 = findViewById(R.id.edittext43);
		textview1447 = findViewById(R.id.textview1447);
		textview1448 = findViewById(R.id.textview1448);
		textview1382 = findViewById(R.id.textview1382);
		edittext44 = findViewById(R.id.edittext44);
		textview1383 = findViewById(R.id.textview1383);
		textview1384 = findViewById(R.id.textview1384);
		textview1385 = findViewById(R.id.textview1385);
		edittext45 = findViewById(R.id.edittext45);
		textview1386 = findViewById(R.id.textview1386);
		textview1387 = findViewById(R.id.textview1387);
		textview1388 = findViewById(R.id.textview1388);
		edittext46 = findViewById(R.id.edittext46);
		textview1389 = findViewById(R.id.textview1389);
		textview1390 = findViewById(R.id.textview1390);
		textview1391 = findViewById(R.id.textview1391);
		edittext47 = findViewById(R.id.edittext47);
		textview1392 = findViewById(R.id.textview1392);
		textview1393 = findViewById(R.id.textview1393);
		textview1169 = findViewById(R.id.textview1169);
		edittext60 = findViewById(R.id.edittext60);
		textview1170 = findViewById(R.id.textview1170);
		textview1171 = findViewById(R.id.textview1171);
		textview1394 = findViewById(R.id.textview1394);
		edittext48 = findViewById(R.id.edittext48);
		textview1395 = findViewById(R.id.textview1395);
		textview1396 = findViewById(R.id.textview1396);
		textview1472 = findViewById(R.id.textview1472);
		edittext61 = findViewById(R.id.edittext61);
		textview1473 = findViewById(R.id.textview1473);
		textview1474 = findViewById(R.id.textview1474);
		textview1397 = findViewById(R.id.textview1397);
		edittext49 = findViewById(R.id.edittext49);
		textview1398 = findViewById(R.id.textview1398);
		textview1399 = findViewById(R.id.textview1399);
		textview2041 = findViewById(R.id.textview2041);
		edittext62 = findViewById(R.id.edittext62);
		textview2042 = findViewById(R.id.textview2042);
		textview2043 = findViewById(R.id.textview2043);
		textview1453 = findViewById(R.id.textview1453);
		edittext50 = findViewById(R.id.edittext50);
		textview1454 = findViewById(R.id.textview1454);
		textview1455 = findViewById(R.id.textview1455);
		edittext56y = findViewById(R.id.edittext56y);
		textview1457 = findViewById(R.id.textview1457);
		linear774 = findViewById(R.id.linear774);
		textview1459 = findViewById(R.id.textview1459);
		edittext51 = findViewById(R.id.edittext51);
		textview2050 = findViewById(R.id.textview2050);
		textview2051 = findViewById(R.id.textview2051);
		linear867 = findViewById(R.id.linear867);
		textview2054 = findViewById(R.id.textview2054);
		edittext63 = findViewById(R.id.edittext63);
		textview1461 = findViewById(R.id.textview1461);
		button50 = findViewById(R.id.button50);
		button51 = findViewById(R.id.button51);
		button52 = findViewById(R.id.button52);
		linear783 = findViewById(R.id.linear783);
		hscroll85 = findViewById(R.id.hscroll85);
		linear93 = findViewById(R.id.linear93);
		hscroll86 = findViewById(R.id.hscroll86);
		linear94 = findViewById(R.id.linear94);
		hscroll87 = findViewById(R.id.hscroll87);
		linear96 = findViewById(R.id.linear96);
		hscroll74 = findViewById(R.id.hscroll74);
		linear775 = findViewById(R.id.linear775);
		imageview38 = findViewById(R.id.imageview38);
		linear784 = findViewById(R.id.linear784);
		textview1463 = findViewById(R.id.textview1463);
		textview466 = findViewById(R.id.textview466);
		edittext52 = findViewById(R.id.edittext52);
		textview276 = findViewById(R.id.textview276);
		textview277 = findViewById(R.id.textview277);
		textview1466 = findViewById(R.id.textview1466);
		edittext53 = findViewById(R.id.edittext53);
		textview1467 = findViewById(R.id.textview1467);
		textview1468 = findViewById(R.id.textview1468);
		textview1469 = findViewById(R.id.textview1469);
		edittext54 = findViewById(R.id.edittext54);
		textview1470 = findViewById(R.id.textview1470);
		textview1471 = findViewById(R.id.textview1471);
		edittext195 = findViewById(R.id.edittext195);
		textview288 = findViewById(R.id.textview288);
		linear776 = findViewById(R.id.linear776);
		textview1460 = findViewById(R.id.textview1460);
		edittext55 = findViewById(R.id.edittext55);
		textview292 = findViewById(R.id.textview292);
		textview291 = findViewById(R.id.textview291);
		linear95 = findViewById(R.id.linear95);
		textview473 = findViewById(R.id.textview473);
		edittext56 = findViewById(R.id.edittext56);
		textview2058 = findViewById(R.id.textview2058);
		textview2059 = findViewById(R.id.textview2059);
		linear871 = findViewById(R.id.linear871);
		textview2060 = findViewById(R.id.textview2060);
		edittext64 = findViewById(R.id.edittext64);
		
		add_dynamic_wall.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_dynamic_view();
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear57.setVisibility(View.VISIBLE);
					edittext24.setText("");
					edittext25.setText("");
					edittext26.setText("");
					edittext27.setText("");
					edittext28.setText("");
					edittext29.setTextColor(0xFF000000);
					edittext30.setTextColor(0xFF000000);
					edittext31.setText("");
					edittext32.setTextColor(0xFF000000);
					edittext33.setTextColor(0xFF000000);
					edittext34.setTextColor(0xFF000000);
					edittext35.setText("");
					edittext36.setTextColor(0xFF000000);
					edittext37.setTextColor(0xFF000000);
					edittext38.setTextColor(0xFF000000);
					edittext39.setTextColor(0xFF000000);
					edittext40.setTextColor(0xFF000000);
					edittext41.setText("");
					edittext42.setTextColor(0xFF000000);
					edittext43.setText("");
					edittext44.setText("");
					edittext45.setText("");
					edittext46.setText("");
					edittext47.setTextColor(0xFF000000);
					edittext60.setTextColor(0xFF000000);
					edittext48.setTextColor(0xFF000000);
					edittext61.setTextColor(0xFF000000);
					edittext49.setTextColor(0xFF000000);
					edittext62.setTextColor(0xFF000000);
					edittext50.setText("");
					edittext51.setTextColor(0xFF000000);
					edittext63.setTextColor(0xFF000000);
					edittext52.setText("");
					edittext53.setText("");
					edittext54.setText("");
					edittext55.setTextColor(0xFF000000);
					edittext56.setTextColor(0xFFFFFFFF);
					edittext64.setTextColor(0xFFFFFFFF);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button195.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/qE55o8uljgU"));
				startActivity(price);
			}
		});
		
		button29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		add_dynamic_hole.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_dynamic_hole_in_wall();
					linear722.setVisibility(View.VISIBLE);
					hscroll19.setVisibility(View.VISIBLE);
					linear74.setVisibility(View.VISIBLE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext6.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 3)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || _charSeq.equals("-")) {
					edittext7.setText("");
				}
				else {
					edittext7.setText(_charSeq);
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
				edittext1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext4.setText(String.valueOf(00.00));
				edittext5.setText(String.valueOf(00.00));
				edittext4.setTextColor(0xFFE91E63);
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
				edittext2.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		edittext22.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext22.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext5.setText(String.valueOf(00.00));
				edittext5.setTextColor(0xFFE91E63);
				textview667.setVisibility(View.GONE);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		L1.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* عرض الحائط أو سمك الحائط ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٢٥ م \"");
				return true;
			}
		});
		
		edittext3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		textview7.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* عدد الحوائط\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ حائط \"");
				return true;
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext22.getText().toString().equals("") || edittext22.getText().toString().equals(".")) || (edittext22.getText().toString().equals("-") || (Double.parseDouble(edittext22.getText().toString()) < 0))) {
						edittext22.setText(String.valueOf(0.25d));
					}
					if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
						edittext3.setText(String.valueOf(1));
					}
					edittext4.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) * (Double.parseDouble(edittext2.getText().toString()) * Double.parseDouble(edittext3.getText().toString()))));
					edittext5.setText(String.valueOf((Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext2.getText().toString())) * (Double.parseDouble(edittext22.getText().toString()) * Double.parseDouble(edittext3.getText().toString()))));
					edittext4.setTextColor(0xFF000000);
					edittext5.setTextColor(0xFF000000);
					edittext444.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) * (Double.parseDouble(edittext2.getText().toString()) * Double.parseDouble(edittext3.getText().toString()))));
					edittext444.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (linear722.getVisibility() == View.VISIBLE) {
					if (Double.parseDouble(_charSeq) == 00.00d) {
						edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
						textview55.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(_charSeq)) && (Double.parseDouble(_charSeq) < Double.parseDouble(edittext16.getText().toString()))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مسطح كل الفتحات أكبر من اجمالي مسطح الحوائط وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
							edittext17.setTextColor(0xFFE91E63);
							textview55.setVisibility(View.VISIBLE);
						}
						else {
							edittext17.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext16.getText().toString())));
							edittext17.setTextColor(0xFF000000);
							textview55.setVisibility(View.GONE);
						}
					}
				}
				else {
					edittext17.setText(String.valueOf(Double.parseDouble(_charSeq) - Double.parseDouble(edittext16.getText().toString())));
					edittext17.setTextColor(0xFF000000);
					textview55.setVisibility(View.GONE);
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
				if (linear74.getVisibility() == View.VISIBLE) {
					if (Double.parseDouble(_charSeq) == 00.00d) {
						edittext20.setText(String.valueOf(Double.parseDouble("00.00")));
						textview56.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(_charSeq)) && (Double.parseDouble(_charSeq) < Double.parseDouble(edittext15.getText().toString()))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مكعب كل الفتحات أكبر من اجمالي مكعب الحوائط وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
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
		
		edittext16.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(_charSeq) == 0) {
					linear722.setVisibility(View.GONE);
					textview55.setVisibility(View.GONE);
				}
				else {
					linear722.setVisibility(View.VISIBLE);
					if (Double.parseDouble(edittext4.getText().toString()) == 00.00d) {
						edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
						textview55.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(edittext4.getText().toString())) && (Double.parseDouble(edittext4.getText().toString()) < Double.parseDouble(_charSeq))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مسطح كل الفتحات أكبر من اجمالي مسطح الحوائط وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
							edittext17.setTextColor(0xFFE91E63);
							textview55.setVisibility(View.VISIBLE);
						}
						else {
							edittext17.setText(String.valueOf(Double.parseDouble(edittext4.getText().toString()) - Double.parseDouble(_charSeq)));
							edittext17.setTextColor(0xFF000000);
							textview55.setVisibility(View.GONE);
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
		
		edittext15.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(_charSeq) == 0) {
					linear74.setVisibility(View.GONE);
				}
				else {
					linear74.setVisibility(View.VISIBLE);
				}
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
				edittext19.setText(String.valueOf(Double.parseDouble(_charSeq) + Double.parseDouble(edittext18.getText().toString())));
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
				edittext23.setText(String.valueOf(Double.parseDouble(_charSeq) + Double.parseDouble(edittext21.getText().toString())));
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
				edittext19.setText(String.valueOf(Double.parseDouble(edittext17.getText().toString()) + Double.parseDouble(_charSeq)));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext21.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext23.setText(String.valueOf(Double.parseDouble(edittext20.getText().toString()) + Double.parseDouble(_charSeq)));
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
				if (linear94.getVisibility() == View.VISIBLE) {
					if ((edittext53.getText().toString().equals("") || edittext53.getText().toString().equals(".")) || (edittext53.getText().toString().equals("-") || (Double.parseDouble(edittext53.getText().toString()) < 0))) {
						edittext55.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext55.setText(String.valueOf(Double.parseDouble(edittext53.getText().toString()) * Double.parseDouble(_charSeq)));
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
		
		edittext23.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext30.setText(String.valueOf(00.00));
				edittext30.setTextColor(0xFFE91E63);
				edittext33.setText(String.valueOf(00.00));
				edittext33.setTextColor(0xFFE91E63);
				edittext34.setText(String.valueOf(00.00));
				edittext34.setTextColor(0xFFE91E63);
				edittext40.setText(String.valueOf(00.00));
				edittext40.setTextColor(0xFFE91E63);
				if (linear96.getVisibility() == View.VISIBLE) {
					if ((edittext54.getText().toString().equals("") || edittext54.getText().toString().equals(".")) || (edittext54.getText().toString().equals("-") || (Double.parseDouble(edittext54.getText().toString()) < 0))) {
						edittext55.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext55.setText(String.valueOf(Double.parseDouble(edittext54.getText().toString()) * Double.parseDouble(_charSeq)));
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
		
		imageview36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear57.setVisibility(View.GONE);
				edittext24.setText("");
				edittext25.setText("");
				edittext26.setText("");
				edittext27.setText("");
				edittext28.setText("");
				edittext29.setTextColor(0xFF000000);
				edittext30.setTextColor(0xFF000000);
				edittext31.setText("");
				edittext32.setTextColor(0xFF000000);
				edittext33.setTextColor(0xFF000000);
				edittext34.setTextColor(0xFF000000);
				edittext35.setText("");
				edittext36.setTextColor(0xFF000000);
				edittext37.setTextColor(0xFF000000);
				edittext38.setTextColor(0xFF000000);
				edittext39.setTextColor(0xFF000000);
				edittext40.setTextColor(0xFF000000);
				edittext41.setText("");
				edittext42.setTextColor(0xFF000000);
				edittext43.setText("");
				edittext44.setText("");
				edittext45.setText("");
				edittext46.setText("");
				edittext47.setTextColor(0xFF000000);
				edittext60.setTextColor(0xFF000000);
				edittext48.setTextColor(0xFF000000);
				edittext61.setTextColor(0xFF000000);
				edittext49.setTextColor(0xFF000000);
				edittext62.setTextColor(0xFF000000);
				edittext50.setText("");
				edittext51.setTextColor(0xFF000000);
				edittext63.setTextColor(0xFF000000);
				edittext52.setText("");
				edittext53.setText("");
				edittext54.setText("");
				edittext55.setTextColor(0xFF000000);
				edittext56.setTextColor(0xFFFFFFFF);
				edittext64.setTextColor(0xFFFFFFFF);
			}
		});
		
		button31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0)))) || (((edittext22.getText().toString().equals("") || edittext22.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext24.getText().toString().equals("") || edittext24.getText().toString().equals(".")) || (edittext24.getText().toString().equals("-") || (Double.parseDouble(edittext24.getText().toString()) < 0))) {
						edittext24.setText(String.valueOf(Double.parseDouble("25")));
					}
					if ((edittext25.getText().toString().equals("") || edittext25.getText().toString().equals(".")) || (edittext25.getText().toString().equals("-") || (Double.parseDouble(edittext25.getText().toString()) < 0))) {
						edittext25.setText(String.valueOf(Double.parseDouble("12")));
					}
					if ((edittext26.getText().toString().equals("") || edittext26.getText().toString().equals(".")) || (edittext26.getText().toString().equals("-") || (Double.parseDouble(edittext26.getText().toString()) < 0))) {
						edittext26.setText(String.valueOf(Double.parseDouble("6")));
					}
					if ((edittext27.getText().toString().equals("") || edittext27.getText().toString().equals(".")) || (edittext27.getText().toString().equals("-") || (Double.parseDouble(edittext27.getText().toString()) < 0))) {
						edittext27.setText(String.valueOf(Double.parseDouble("1")));
					}
					if ((edittext28.getText().toString().equals("") || edittext28.getText().toString().equals(".")) || (edittext28.getText().toString().equals("-") || (Double.parseDouble(edittext28.getText().toString()) < 0))) {
						edittext28.setText(String.valueOf(300));
					}
					edittext29.setText(String.valueOf((Double.parseDouble(edittext24.getText().toString()) / 100) * ((Double.parseDouble(edittext25.getText().toString()) / 100) * (Double.parseDouble(edittext26.getText().toString()) / 100))));
					edittext30.setText(String.valueOf(Double.parseDouble(edittext23.getText().toString()) / (((Double.parseDouble(edittext24.getText().toString()) + Double.parseDouble(edittext27.getText().toString())) / 100) * (((Double.parseDouble(edittext26.getText().toString()) + Double.parseDouble(edittext27.getText().toString())) / 100) * ((Double.parseDouble(edittext25.getText().toString()) + (Double.parseDouble(edittext27.getText().toString()) / 2)) / 100)))));
					if ((edittext31.getText().toString().equals("") || edittext31.getText().toString().equals(".")) || (edittext31.getText().toString().equals("-") || (Double.parseDouble(edittext31.getText().toString()) < 0))) {
						edittext31.setText(String.valueOf(10));
					}
					edittext33.setText(String.valueOf(Double.parseDouble(edittext30.getText().toString()) * ((((Double.parseDouble(edittext24.getText().toString()) + Double.parseDouble(edittext27.getText().toString())) / 100) * (((Double.parseDouble(edittext25.getText().toString()) + (Double.parseDouble(edittext27.getText().toString()) / 2)) / 100) * (Double.parseDouble(edittext27.getText().toString()) / 100))) + (((Double.parseDouble(edittext25.getText().toString()) / 100) * ((Double.parseDouble(edittext26.getText().toString()) / 100) * (Double.parseDouble(edittext27.getText().toString()) / 100))) + (((Double.parseDouble(edittext24.getText().toString()) + Double.parseDouble(edittext27.getText().toString())) / 100) * ((Double.parseDouble(edittext26.getText().toString()) / 100) * ((Double.parseDouble(edittext27.getText().toString()) / 2) / 100)))))));
					edittext34.setText(String.valueOf(Double.parseDouble(edittext33.getText().toString()) * Double.parseDouble(edittext28.getText().toString())));
					if ((edittext35.getText().toString().equals("") || edittext35.getText().toString().equals(".")) || (edittext35.getText().toString().equals("-") || (Double.parseDouble(edittext35.getText().toString()) < 0))) {
						edittext35.setText(String.valueOf(5));
					}
					edittext40.setText(String.valueOf(Double.parseDouble(edittext33.getText().toString()) * 1));
					if ((edittext41.getText().toString().equals("") || edittext41.getText().toString().equals(".")) || (edittext41.getText().toString().equals("-") || (Double.parseDouble(edittext41.getText().toString()) < 0))) {
						edittext41.setText(String.valueOf(10));
					}
					edittext30.setTextColor(0xFF000000);
					edittext33.setTextColor(0xFF000000);
					edittext34.setTextColor(0xFF000000);
					edittext40.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext24.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext24.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext30.setText(String.valueOf(00.00));
				edittext30.setTextColor(0xFFE91E63);
				edittext33.setText(String.valueOf(00.00));
				edittext33.setTextColor(0xFFE91E63);
				edittext34.setText(String.valueOf(00.00));
				edittext34.setTextColor(0xFFE91E63);
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
		
		edittext25.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext25.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext30.setText(String.valueOf(00.00));
				edittext30.setTextColor(0xFFE91E63);
				edittext33.setText(String.valueOf(00.00));
				edittext33.setTextColor(0xFFE91E63);
				edittext34.setText(String.valueOf(00.00));
				edittext34.setTextColor(0xFFE91E63);
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
		
		edittext26.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext26.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext30.setText(String.valueOf(00.00));
				edittext30.setTextColor(0xFFE91E63);
				edittext33.setText(String.valueOf(00.00));
				edittext33.setTextColor(0xFFE91E63);
				edittext34.setText(String.valueOf(00.00));
				edittext34.setTextColor(0xFFE91E63);
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
		
		edittext27.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext27.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext30.setText(String.valueOf(00.00));
				edittext30.setTextColor(0xFFE91E63);
				edittext33.setText(String.valueOf(00.00));
				edittext33.setTextColor(0xFFE91E63);
				edittext34.setText(String.valueOf(00.00));
				edittext34.setTextColor(0xFFE91E63);
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
		
		edittext28.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext28.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext34.setText(String.valueOf(00.00));
				edittext34.setTextColor(0xFFE91E63);
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
				if (linear740.getVisibility() == View.VISIBLE) {
					if ((edittext44.getText().toString().equals("") || edittext44.getText().toString().equals(".")) || (edittext44.getText().toString().equals("-") || (Double.parseDouble(edittext44.getText().toString()) < 0))) {
						edittext47.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						if (Double.parseDouble(edittext29.getText().toString()) > 0) {
							edittext47.setText(String.valueOf(Double.parseDouble(edittext44.getText().toString()) * (Double.parseDouble(edittext32.getText().toString()) / Double.parseDouble(_charSeq))));
						}
						else {
							edittext47.setText(String.valueOf(Double.parseDouble("00.00")));
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
		
		edittext30.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext31.getText().toString().equals("") || edittext31.getText().toString().equals(".")) || (edittext31.getText().toString().equals("-") || (Double.parseDouble(edittext31.getText().toString()) < 0))) {
					edittext32.setText(String.valueOf(Math.ceil(Double.parseDouble(_charSeq))));
				}
				else {
					edittext32.setText(String.valueOf(Math.ceil(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext31.getText().toString()) / 100)))));
				}
				if (linear93.getVisibility() == View.VISIBLE) {
					if ((edittext52.getText().toString().equals("") || edittext52.getText().toString().equals(".")) || (edittext52.getText().toString().equals("-") || (Double.parseDouble(edittext52.getText().toString()) < 0))) {
						edittext55.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext55.setText(String.valueOf(Double.parseDouble(edittext52.getText().toString()) * (Double.parseDouble(_charSeq) / 1000)));
					}
				}
				if (linear767.getVisibility() == View.VISIBLE) {
					if ((edittext43.getText().toString().equals("") || edittext43.getText().toString().equals(".")) || (edittext43.getText().toString().equals("-") || (Double.parseDouble(edittext43.getText().toString()) < 0))) {
						edittext47.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext47.setText(String.valueOf(Double.parseDouble(edittext43.getText().toString()) * (Double.parseDouble(_charSeq) / 1000)));
					}
				}
				if (linear740.getVisibility() == View.VISIBLE) {
					if ((edittext44.getText().toString().equals("") || edittext44.getText().toString().equals(".")) || (edittext44.getText().toString().equals("-") || (Double.parseDouble(edittext44.getText().toString()) < 0))) {
						edittext47.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						if (Double.parseDouble(edittext29.getText().toString()) > 0) {
							edittext47.setText(String.valueOf(Double.parseDouble(edittext44.getText().toString()) * (Double.parseDouble(_charSeq) / (1 / Double.parseDouble(edittext29.getText().toString())))));
						}
						else {
							edittext47.setText(String.valueOf(Double.parseDouble("00.00")));
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
		
		edittext31.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext31.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext32.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext30.getText().toString()))));
				}
				else {
					edittext32.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext30.getText().toString()) + (Double.parseDouble(edittext30.getText().toString()) * (Double.parseDouble(_charSeq) / 100)))));
				}
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
				if (linear767.getVisibility() == View.VISIBLE) {
					if ((edittext43.getText().toString().equals("") || edittext43.getText().toString().equals(".")) || (edittext43.getText().toString().equals("-") || (Double.parseDouble(edittext43.getText().toString()) < 0))) {
						edittext60.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext60.setText(String.valueOf(Double.parseDouble(edittext43.getText().toString()) * (Double.parseDouble(_charSeq) / 1000)));
					}
				}
				if (linear740.getVisibility() == View.VISIBLE) {
					if ((edittext44.getText().toString().equals("") || edittext44.getText().toString().equals(".")) || (edittext44.getText().toString().equals("-") || (Double.parseDouble(edittext44.getText().toString()) < 0))) {
						edittext60.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						if (Double.parseDouble(edittext29.getText().toString()) > 0) {
							edittext60.setText(String.valueOf(Double.parseDouble(edittext44.getText().toString()) * (Double.parseDouble(_charSeq) / (1 / Double.parseDouble(edittext29.getText().toString())))));
						}
						else {
							edittext60.setText(String.valueOf(Double.parseDouble("00.00")));
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
		
		edittext33.addTextChangedListener(new TextWatcher() {
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
		
		edittext34.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext35.getText().toString().equals("") || edittext35.getText().toString().equals(".")) || (edittext35.getText().toString().equals("-") || (Double.parseDouble(edittext35.getText().toString()) < 0))) {
					edittext36.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
				else {
					edittext36.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext35.getText().toString()) / 100))));
				}
				if ((edittext45.getText().toString().equals("") || edittext45.getText().toString().equals(".")) || (edittext45.getText().toString().equals("-") || (Double.parseDouble(edittext45.getText().toString()) < 0))) {
					edittext48.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext48.setText(String.valueOf(Double.parseDouble(edittext45.getText().toString()) * (Double.parseDouble(_charSeq) / 1000)));
				}
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
				edittext35.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext36.setText(String.valueOf(Double.parseDouble(edittext34.getText().toString())));
				}
				else {
					edittext36.setText(String.valueOf(Double.parseDouble(edittext34.getText().toString()) + (Double.parseDouble(edittext34.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
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
				edittext37.setText(String.valueOf(Double.parseDouble(_charSeq) / 50));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext37.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext38.setText(String.valueOf(Math.ceil(Double.parseDouble(_charSeq))));
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
				edittext39.setText(String.valueOf((Double.parseDouble(_charSeq) * 50) / 1000));
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
				if ((edittext45.getText().toString().equals("") || edittext45.getText().toString().equals(".")) || (edittext45.getText().toString().equals("-") || (Double.parseDouble(edittext45.getText().toString()) < 0))) {
					edittext61.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext61.setText(String.valueOf(Double.parseDouble(edittext45.getText().toString()) * Double.parseDouble(_charSeq)));
				}
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
				if ((edittext41.getText().toString().equals("") || edittext41.getText().toString().equals(".")) || (edittext41.getText().toString().equals("-") || (Double.parseDouble(edittext41.getText().toString()) < 0))) {
					edittext42.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
				else {
					edittext42.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext41.getText().toString()) / 100))));
				}
				if ((edittext46.getText().toString().equals("") || edittext46.getText().toString().equals(".")) || (edittext46.getText().toString().equals("-") || (Double.parseDouble(edittext46.getText().toString()) < 0))) {
					edittext49.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext49.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext46.getText().toString())));
				}
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
					edittext42.setText(String.valueOf(Double.parseDouble(edittext40.getText().toString())));
				}
				else {
					edittext42.setText(String.valueOf(Double.parseDouble(edittext40.getText().toString()) + (Double.parseDouble(edittext40.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext42.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext46.getText().toString().equals("") || edittext46.getText().toString().equals(".")) || (edittext46.getText().toString().equals("-") || (Double.parseDouble(edittext46.getText().toString()) < 0))) {
					edittext62.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext62.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext46.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button53.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear780.setVisibility(View.VISIBLE);
					edittext43.setText("");
					edittext44.setText("");
					edittext45.setText("");
					edittext46.setText("");
					edittext50.setText("");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button54.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear778.setVisibility(View.VISIBLE);
					edittext52.setText("");
					edittext53.setText("");
					edittext54.setText("");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button48.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear777.setVisibility(View.VISIBLE);
					linear767.setVisibility(View.VISIBLE);
					linear740.setVisibility(View.GONE);
					hscroll80.setVisibility(View.GONE);
					edittext43.setText("");
					edittext44.setText("");
					edittext45.setText("");
					edittext46.setText("");
					edittext50.setText("");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button49.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear777.setVisibility(View.VISIBLE);
					linear767.setVisibility(View.GONE);
					linear740.setVisibility(View.VISIBLE);
					hscroll80.setVisibility(View.GONE);
					edittext43.setText("");
					edittext44.setText("");
					edittext45.setText("");
					edittext46.setText("");
					edittext50.setText("");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button104.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.altkia.com/brick-prices-today/"));
				startActivity(price);
			}
		});
		
		button102.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.altkia.com/cement-prices-today/"));
				startActivity(price);
			}
		});
		
		button103.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.biltafsil.com/18209/%d8%b3%d8%b9%d8%b1-%d9%85%d8%aa%d8%b1-%d8%a7%d9%84%d8%b1%d9%85%d9%84-%d9%88%d8%a7%d9%84%d8%b2%d9%84%d8%b7/"));
				startActivity(price);
			}
		});
		
		imageview37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear777.setVisibility(View.GONE);
				edittext43.setText("");
				edittext44.setText("");
				edittext45.setText("");
				edittext46.setText("");
				edittext50.setText("");
			}
		});
		
		edittext43.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext43.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (linear767.getVisibility() == View.VISIBLE) {
					if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
						edittext47.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext47.setText(String.valueOf(Double.parseDouble(_charSeq) * (Double.parseDouble(edittext30.getText().toString()) / 1000)));
					}
				}
				if (linear767.getVisibility() == View.VISIBLE) {
					if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
						edittext60.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext60.setText(String.valueOf(Double.parseDouble(_charSeq) * (Double.parseDouble(edittext32.getText().toString()) / 1000)));
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
		
		edittext44.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext44.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (linear740.getVisibility() == View.VISIBLE) {
					if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
						edittext47.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						if (Double.parseDouble(edittext29.getText().toString()) > 0) {
							edittext47.setText(String.valueOf(Double.parseDouble(_charSeq) * (Double.parseDouble(edittext30.getText().toString()) / (1 / Double.parseDouble(edittext29.getText().toString())))));
						}
						else {
							edittext47.setText(String.valueOf(Double.parseDouble("00.00")));
						}
					}
				}
				if (linear740.getVisibility() == View.VISIBLE) {
					if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
						edittext60.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						if (Double.parseDouble(edittext29.getText().toString()) > 0) {
							edittext60.setText(String.valueOf(Double.parseDouble(_charSeq) * (Double.parseDouble(edittext32.getText().toString()) / (1 / Double.parseDouble(edittext29.getText().toString())))));
						}
						else {
							edittext60.setText(String.valueOf(Double.parseDouble("00.00")));
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
		
		edittext45.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext45.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext48.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext48.setText(String.valueOf(Double.parseDouble(_charSeq) * (Double.parseDouble(edittext34.getText().toString()) / 1000)));
				}
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext61.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext61.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext39.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext46.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext46.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext49.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext49.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext40.getText().toString())));
				}
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext62.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext62.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext42.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext47.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext50.getText().toString().equals("") || edittext50.getText().toString().equals(".")) || (edittext50.getText().toString().equals("-") || (Double.parseDouble(edittext50.getText().toString()) < 0))) {
					edittext51.setText(String.valueOf((Double.parseDouble(_charSeq) + Double.parseDouble(edittext48.getText().toString())) + Double.parseDouble(edittext49.getText().toString())));
				}
				else {
					edittext51.setText(String.valueOf((Double.parseDouble(_charSeq) + Double.parseDouble(edittext48.getText().toString())) + (Double.parseDouble(edittext49.getText().toString()) + Double.parseDouble(edittext50.getText().toString()))));
				}
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
				if ((edittext50.getText().toString().equals("") || edittext50.getText().toString().equals(".")) || (edittext50.getText().toString().equals("-") || (Double.parseDouble(edittext50.getText().toString()) < 0))) {
					edittext63.setText(String.valueOf((Double.parseDouble(_charSeq) + Double.parseDouble(edittext61.getText().toString())) + Double.parseDouble(edittext62.getText().toString())));
				}
				else {
					edittext63.setText(String.valueOf((Double.parseDouble(_charSeq) + Double.parseDouble(edittext61.getText().toString())) + (Double.parseDouble(edittext62.getText().toString()) + Double.parseDouble(edittext50.getText().toString()))));
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
				if ((edittext50.getText().toString().equals("") || edittext50.getText().toString().equals(".")) || (edittext50.getText().toString().equals("-") || (Double.parseDouble(edittext50.getText().toString()) < 0))) {
					edittext51.setText(String.valueOf((Double.parseDouble(edittext47.getText().toString()) + Double.parseDouble(_charSeq)) + Double.parseDouble(edittext49.getText().toString())));
				}
				else {
					edittext51.setText(String.valueOf((Double.parseDouble(edittext47.getText().toString()) + Double.parseDouble(_charSeq)) + (Double.parseDouble(edittext49.getText().toString()) + Double.parseDouble(edittext50.getText().toString()))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext61.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext50.getText().toString().equals("") || edittext50.getText().toString().equals(".")) || (edittext50.getText().toString().equals("-") || (Double.parseDouble(edittext50.getText().toString()) < 0))) {
					edittext63.setText(String.valueOf((Double.parseDouble(edittext60.getText().toString()) + Double.parseDouble(_charSeq)) + Double.parseDouble(edittext62.getText().toString())));
				}
				else {
					edittext63.setText(String.valueOf((Double.parseDouble(edittext60.getText().toString()) + Double.parseDouble(_charSeq)) + (Double.parseDouble(edittext62.getText().toString()) + Double.parseDouble(edittext50.getText().toString()))));
				}
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
				if ((edittext50.getText().toString().equals("") || edittext50.getText().toString().equals(".")) || (edittext50.getText().toString().equals("-") || (Double.parseDouble(edittext50.getText().toString()) < 0))) {
					edittext51.setText(String.valueOf((Double.parseDouble(edittext47.getText().toString()) + Double.parseDouble(edittext48.getText().toString())) + Double.parseDouble(_charSeq)));
				}
				else {
					edittext51.setText(String.valueOf((Double.parseDouble(edittext47.getText().toString()) + Double.parseDouble(edittext48.getText().toString())) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext50.getText().toString()))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext62.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext50.getText().toString().equals("") || edittext50.getText().toString().equals(".")) || (edittext50.getText().toString().equals("-") || (Double.parseDouble(edittext50.getText().toString()) < 0))) {
					edittext63.setText(String.valueOf((Double.parseDouble(edittext60.getText().toString()) + Double.parseDouble(edittext61.getText().toString())) + Double.parseDouble(_charSeq)));
				}
				else {
					edittext63.setText(String.valueOf((Double.parseDouble(edittext60.getText().toString()) + Double.parseDouble(edittext61.getText().toString())) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext50.getText().toString()))));
				}
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
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext51.setText(String.valueOf((Double.parseDouble(edittext47.getText().toString()) + Double.parseDouble(edittext48.getText().toString())) + Double.parseDouble(edittext49.getText().toString())));
					edittext63.setText(String.valueOf((Double.parseDouble(edittext60.getText().toString()) + Double.parseDouble(edittext61.getText().toString())) + Double.parseDouble(edittext62.getText().toString())));
				}
				else {
					edittext51.setText(String.valueOf((Double.parseDouble(edittext47.getText().toString()) + Double.parseDouble(edittext48.getText().toString())) + (Double.parseDouble(edittext49.getText().toString()) + Double.parseDouble(_charSeq))));
					edittext63.setText(String.valueOf((Double.parseDouble(edittext60.getText().toString()) + Double.parseDouble(edittext61.getText().toString())) + (Double.parseDouble(edittext62.getText().toString()) + Double.parseDouble(_charSeq))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext51.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext56.setText(String.valueOf(Double.parseDouble(edittext55.getText().toString()) + Double.parseDouble(edittext51.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext63.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext64.setText(String.valueOf(Double.parseDouble(edittext55.getText().toString()) + Double.parseDouble(edittext63.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button50.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear779.setVisibility(View.VISIBLE);
					linear93.setVisibility(View.VISIBLE);
					linear94.setVisibility(View.GONE);
					linear96.setVisibility(View.GONE);
					hscroll86.setVisibility(View.GONE);
					hscroll74.setVisibility(View.GONE);
					edittext52.setText("");
					edittext53.setText("");
					edittext54.setText("");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button51.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear779.setVisibility(View.VISIBLE);
					linear93.setVisibility(View.GONE);
					linear94.setVisibility(View.VISIBLE);
					linear96.setVisibility(View.GONE);
					hscroll86.setVisibility(View.GONE);
					hscroll74.setVisibility(View.VISIBLE);
					edittext52.setText("");
					edittext53.setText("");
					edittext54.setText("");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button52.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear779.setVisibility(View.VISIBLE);
					linear93.setVisibility(View.GONE);
					linear94.setVisibility(View.GONE);
					linear96.setVisibility(View.VISIBLE);
					hscroll86.setVisibility(View.GONE);
					hscroll74.setVisibility(View.VISIBLE);
					edittext52.setText("");
					edittext53.setText("");
					edittext54.setText("");
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		imageview38.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear779.setVisibility(View.GONE);
				edittext52.setText("");
				edittext53.setText("");
				edittext54.setText("");
			}
		});
		
		edittext52.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext52.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (linear93.getVisibility() == View.VISIBLE) {
					if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
						edittext55.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext55.setText(String.valueOf(Double.parseDouble(_charSeq) * (Double.parseDouble(edittext30.getText().toString()) / 1000)));
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
		
		edittext53.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext53.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (linear94.getVisibility() == View.VISIBLE) {
					if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
						edittext55.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext55.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext19.getText().toString())));
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
		
		edittext54.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext54.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (linear96.getVisibility() == View.VISIBLE) {
					if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
						edittext55.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext55.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext23.getText().toString())));
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
		
		edittext55.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext56.setText(String.valueOf(Double.parseDouble(edittext55.getText().toString()) + Double.parseDouble(edittext51.getText().toString())));
				edittext64.setText(String.valueOf(Double.parseDouble(edittext55.getText().toString()) + Double.parseDouble(edittext63.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext56.addTextChangedListener(new TextWatcher() {
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
		
		edittext64.addTextChangedListener(new TextWatcher() {
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
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_PrintHelper(linear1);
			}
		});
	}
	
	private void initializeLogic() {
		linear722.setVisibility(View.GONE);
		hscroll19.setVisibility(View.GONE);
		linear74.setVisibility(View.GONE);
		linear120.setVisibility(View.GONE);
		linear759.setVisibility(View.GONE);
		linear57.setVisibility(View.GONE);
		
		{
		}
		linear780.setVisibility(View.GONE);
		linear777.setVisibility(View.GONE);
		linear779.setVisibility(View.GONE);
		linear778.setVisibility(View.GONE);
		textview55.setVisibility(View.GONE);
		textview56.setVisibility(View.GONE);
		textview666.setVisibility(View.GONE);
		textview667.setVisibility(View.GONE);
		textview668.setVisibility(View.GONE);
		/*
المقارنة
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
		d_textview14.setVisibility(View.VISIBLE);
		d_linear161.setVisibility(View.VISIBLE);
		d_textview11.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* عرض الحائط أو سمك الحائط ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٢٥ م \"");
				return true;
			}
		});
		final TextView d_textview15 = dynamic_wall_linear.findViewById(R.id.d_textview15);
		final LinearLayout d_linear758 = dynamic_wall_linear.findViewById(R.id.d_linear758);
		final EditText d_edittext20 = dynamic_wall_linear.findViewById(R.id.d_edittext20);
		d_edittext20.setSingleLine(true);
		d_edittext20.setFocusableInTouchMode(true);
		d_textview15.setVisibility(View.VISIBLE);
		d_linear758.setVisibility(View.VISIBLE);
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
		d_linear33.setVisibility(View.GONE);
		d_textview555.setVisibility(View.GONE);
		d_textview556.setVisibility(View.GONE);
		/*
للمقارنة
*/
		final EditText d_edittext444 = dynamic_wall_linear.findViewById(R.id.d_edittext444);
		d_edittext444.setSingleLine(true);
		d_edittext444.setFocusableInTouchMode(true);
		d_edittext444.setVisibility(View.GONE);
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
		d_textview6.setText("مسطحات المباني لجميع الحوائط من هذا النموذج بدون خصم الفتحات ( م٢ )");
		d_textview7.setText("مكعب مباني جميع الحوائط من هذا النموذج بدون خصم الفتحات ( م٣ )");
		d_textview511.setText("م٣");
		d_textview9.setText("المسطح الأجمالي لمباني جميع الحوائط من هذا النموذج بعد خصم الفتحات ( م٢ )");
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
		d_edittext22.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String d_edittext22nn = _param1.toString();
								
d_edittext22.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				d_edittext5.setText(String.valueOf(00.00));
				d_edittext5.setTextColor(0xFFE91E63);
				d_textview667.setVisibility(View.GONE);
						}
						
						@Override
						public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								
						}
						
						@Override
						public void afterTextChanged(Editable _param1) {
								
						}
				});
		d_edittext3.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String d_edittext3nn = _param1.toString();
								
d_edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				d_edittext4.setText(String.valueOf(00.00));
				d_edittext5.setText(String.valueOf(00.00));
				d_edittext4.setTextColor(0xFFE91E63);
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
				if (((d_edittext1.getText().toString().equals("") || d_edittext1.getText().toString().equals(".")) || (d_edittext1.getText().toString().equals("-") || (Double.parseDouble(d_edittext1.getText().toString()) < 0))) || ((d_edittext2.getText().toString().equals("") || d_edittext2.getText().toString().equals(".")) || (d_edittext2.getText().toString().equals("-") || (Double.parseDouble(d_edittext2.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((d_edittext22.getText().toString().equals("") || d_edittext22.getText().toString().equals(".")) || (d_edittext22.getText().toString().equals("-") || (Double.parseDouble(d_edittext22.getText().toString()) < 0))) {
						d_edittext22.setText(String.valueOf(0.25d));
					}
					if ((d_edittext3.getText().toString().equals("") || d_edittext3.getText().toString().equals(".")) || (d_edittext3.getText().toString().equals("-") || (Double.parseDouble(d_edittext3.getText().toString()) < 0))) {
						d_edittext3.setText(String.valueOf(1));
					}
					d_edittext4.setText(String.valueOf(Double.parseDouble(d_edittext1.getText().toString()) * (Double.parseDouble(d_edittext2.getText().toString()) * Double.parseDouble(d_edittext3.getText().toString()))));
					d_edittext5.setText(String.valueOf((Double.parseDouble(d_edittext1.getText().toString()) * Double.parseDouble(d_edittext2.getText().toString())) * (Double.parseDouble(d_edittext22.getText().toString()) * Double.parseDouble(d_edittext3.getText().toString()))));
					d_edittext4.setTextColor(0xFF000000);
					d_edittext5.setTextColor(0xFF000000);
					d_edittext444.setText(String.valueOf(Double.parseDouble(d_edittext1.getText().toString()) * (Double.parseDouble(d_edittext2.getText().toString()) * Double.parseDouble(d_edittext3.getText().toString()))));
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
				if (d_linear722.getVisibility() == View.VISIBLE) {
					if (Double.parseDouble(s.toString()) == 00.00d) {
						d_edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
						d_textview55.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(s.toString())) && (Double.parseDouble(s.toString()) < Double.parseDouble(d_edittext16.getText().toString()))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مسطح كل الفتحات أكبر من اجمالي مسطح الحوائط وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							d_edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
							d_edittext17.setTextColor(0xFFE91E63);
							d_textview55.setVisibility(View.VISIBLE);
						}
						else {
							d_edittext17.setText(String.valueOf(Double.parseDouble(s.toString()) - Double.parseDouble(d_edittext16.getText().toString())));
							d_edittext17.setTextColor(0xFF000000);
							d_textview55.setVisibility(View.GONE);
						}
					}
				}
				else {
					d_edittext17.setText(String.valueOf(Double.parseDouble(s.toString()) - Double.parseDouble(d_edittext16.getText().toString())));
					d_edittext17.setTextColor(0xFF000000);
					d_textview55.setVisibility(View.GONE);
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
				d_linear722.setVisibility(View.VISIBLE);
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
				linear722d.setVisibility(View.VISIBLE);
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
				linear33d.setVisibility(View.GONE);
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
				final TextView textview667bd = dynamic_hole_linear2.findViewById(R.id.textview667bd);
				final TextView textview668cd = dynamic_hole_linear2.findViewById(R.id.textview668cd);
				final TextView textview669dd = dynamic_hole_linear2.findViewById(R.id.textview669dd);
				textview666ad.setVisibility(View.GONE);
				textview667bd.setVisibility(View.GONE);
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
				textview9d.setText("مسطح الفتحات بهذا النموذج بكل الحوائط التي نفس النموذج ( م٢ )");
				textview22d.setText("م٢");
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
						SketchwareUtil.showMessage(getApplicationContext(), "* عدد الفتحات من نفس النموذج والأبعاد بالسقف الواحد\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ فتحة \"");
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
						edittext14d.setText(String.valueOf(00.00));
						edittext14d.setTextColor(0xFFE91E63);
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
				edittext5d.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String edittext5dnn = _param1.toString();
										
edittext5d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
						edittext15d.setText(String.valueOf(00.00));
						edittext15d.setTextColor(0xFFE91E63);
						textview667bd.setVisibility(View.GONE);
						edittext5dd.setText(String.valueOf(00.00));
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
						if ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0)))) || (((d_edittext1.getText().toString().equals("") || d_edittext1.getText().toString().equals(".")) || (d_edittext1.getText().toString().equals("-") || (Double.parseDouble(d_edittext1.getText().toString()) < 0))) || (((d_edittext2.getText().toString().equals("") || d_edittext2.getText().toString().equals(".")) || (d_edittext2.getText().toString().equals("-") || (Double.parseDouble(d_edittext2.getText().toString()) < 0))) || ((d_edittext22.getText().toString().equals("") || d_edittext22.getText().toString().equals(".")) || (d_edittext22.getText().toString().equals("-") || (Double.parseDouble(d_edittext22.getText().toString()) < 0)))))) {
							SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
						}
						else {
							if ((edittext5d.getText().toString().equals("") || edittext5d.getText().toString().equals(".")) || (edittext5d.getText().toString().equals("-") || (Double.parseDouble(edittext5d.getText().toString()) < 0))) {
								edittext5d.setText(String.valueOf(Double.parseDouble(d_edittext22.getText().toString())));
							}
							if ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) {
								edittext11d.setText(String.valueOf(1));
							}
							edittext8dd.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString())));
							edittext9dd.setText(String.valueOf(Double.parseDouble(edittext9d.getText().toString())));
							edittext5dd.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString())));
							if (Double.parseDouble(edittext8d.getText().toString()) > Double.parseDouble(d_edittext1.getText().toString())) {
								textview666ad.setVisibility(View.VISIBLE);
								if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(d_edittext2.getText().toString())) {
									textview668cd.setVisibility(View.VISIBLE);
									if (Double.parseDouble(edittext5d.getText().toString()) > Double.parseDouble(d_edittext22.getText().toString())) {
										textview667bd.setVisibility(View.VISIBLE);
									}
									else {
										textview667bd.setVisibility(View.GONE);
									}
								}
								else {
									textview668cd.setVisibility(View.GONE);
									if (Double.parseDouble(edittext5d.getText().toString()) > Double.parseDouble(d_edittext22.getText().toString())) {
										textview667bd.setVisibility(View.VISIBLE);
									}
									else {
										textview667bd.setVisibility(View.GONE);
									}
								}
							}
							else {
								textview666ad.setVisibility(View.GONE);
								if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(d_edittext2.getText().toString())) {
									textview668cd.setVisibility(View.VISIBLE);
									if (Double.parseDouble(edittext5d.getText().toString()) > Double.parseDouble(d_edittext22.getText().toString())) {
										textview667bd.setVisibility(View.VISIBLE);
									}
									else {
										textview667bd.setVisibility(View.GONE);
									}
								}
								else {
									textview668cd.setVisibility(View.GONE);
									if (Double.parseDouble(edittext5d.getText().toString()) > Double.parseDouble(d_edittext22.getText().toString())) {
										textview667bd.setVisibility(View.VISIBLE);
									}
									else {
										textview667bd.setVisibility(View.GONE);
										edittext12d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())));
										edittext13d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString()))));
										edittext12d.setTextColor(0xFF000000);
										edittext13d.setTextColor(0xFF000000);
										if (((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * (Double.parseDouble(edittext5d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString()))) > (Double.parseDouble(d_edittext1.getText().toString()) * (Double.parseDouble(d_edittext2.getText().toString()) * Double.parseDouble(d_edittext22.getText().toString())))) {
											textview669dd.setVisibility(View.VISIBLE);
										}
										else {
											textview669dd.setVisibility(View.GONE);
											if ((d_edittext3.getText().toString().equals("") || d_edittext3.getText().toString().equals(".")) || (d_edittext3.getText().toString().equals("-") || (Double.parseDouble(d_edittext3.getText().toString()) < 0))) {
												d_edittext3.setText(String.valueOf(1));
											}
											edittext14d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * (Double.parseDouble(edittext11d.getText().toString()) * Double.parseDouble(d_edittext3.getText().toString())))));
											edittext14d.setTextColor(0xFF000000);
											edittext15d.setText(String.valueOf((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * ((Double.parseDouble(edittext5d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString())) * Double.parseDouble(d_edittext3.getText().toString()))));
											edittext15d.setTextColor(0xFF000000);
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
إجمالي المسطحات
*/
				edittext14d.addTextChangedListener(new TextWatcher() { 	
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
						 for(int i=0; i<d_add_dynamic_hole_linear.getChildCount(); ++i) { 
							 View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo1 =child.findViewById(R.id.edittext14d);
							temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
						}
						d_edittext16.setText(String.valueOf(temp1));
					} });
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
						_removeView(dynamic_hole_linear2);
						/*
إجمالي كميات الفتحات الدينامك بعد عملية الحذف
*/
						/*
إجمالي المسطحات
*/
						temp1 = 0;
						 for(int i=0; i<d_add_dynamic_hole_linear.getChildCount(); ++i) { 
							 View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo1 =child.findViewById(R.id.edittext14d);
							temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
						}
						d_edittext16.setText(String.valueOf(temp1));
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
				d_edittext22.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String d_edittext22nn = _param1.toString();
										
d_textview667.setVisibility(View.GONE);
						textview667bd.setVisibility(View.GONE);
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
						temp3c = 0;
						for (int i = 0; i < (int)(d_add_dynamic_hole_linear.getChildCount()); i++) {
							View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo3c =child.findViewById(R.id.edittext5dd);
							temp3c = Math.max(temp3c, Double.parseDouble(tempo3c.getText().toString()));
						}
						if (Double.parseDouble(d_edittext1.getText().toString()) < temp1a) {
							d_textview666.setVisibility(View.VISIBLE);
							d_edittext4.setText(String.valueOf(00.00));
							d_edittext4.setTextColor(0xFFE91E63);
							d_edittext5.setText(String.valueOf(00.00));
							d_edittext5.setTextColor(0xFFE91E63);
							if (Double.parseDouble(d_edittext2.getText().toString()) < temp2b) {
								d_textview668.setVisibility(View.VISIBLE);
								if (Double.parseDouble(d_edittext22.getText().toString()) < temp3c) {
									d_textview667.setVisibility(View.VISIBLE);
								}
								else {
									d_textview667.setVisibility(View.GONE);
								}
							}
							else {
								d_textview668.setVisibility(View.GONE);
								if (Double.parseDouble(d_edittext22.getText().toString()) < temp3c) {
									d_textview667.setVisibility(View.VISIBLE);
								}
								else {
									d_textview667.setVisibility(View.GONE);
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
								if (Double.parseDouble(d_edittext22.getText().toString()) < temp3c) {
									d_textview667.setVisibility(View.VISIBLE);
								}
								else {
									d_textview667.setVisibility(View.GONE);
								}
							}
							else {
								d_textview668.setVisibility(View.GONE);
								if (Double.parseDouble(d_edittext22.getText().toString()) < temp3c) {
									d_textview667.setVisibility(View.VISIBLE);
									d_edittext4.setText(String.valueOf(00.00));
									d_edittext4.setTextColor(0xFFE91E63);
									d_edittext5.setText(String.valueOf(00.00));
									d_edittext5.setTextColor(0xFFE91E63);
								}
								else {
									d_textview667.setVisibility(View.GONE);
									d_edittext4.setText(String.valueOf(Double.parseDouble(d_edittext1.getText().toString()) * (Double.parseDouble(d_edittext2.getText().toString()) * Double.parseDouble(d_edittext3.getText().toString()))));
									d_edittext5.setText(String.valueOf((Double.parseDouble(d_edittext1.getText().toString()) * Double.parseDouble(d_edittext2.getText().toString())) * (Double.parseDouble(d_edittext22.getText().toString()) * Double.parseDouble(d_edittext3.getText().toString()))));
									d_edittext4.setTextColor(0xFF000000);
									d_edittext5.setTextColor(0xFF000000);
								}
							}
						}
					} });
			}
		});
		d_edittext16.addTextChangedListener(new TextWatcher() { 	
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
					
					
				d_edittext16.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(s.toString()) == 0) {
					d_linear722.setVisibility(View.GONE);
					d_textview55.setVisibility(View.GONE);
				}
				else {
					d_linear722.setVisibility(View.VISIBLE);
					if (Double.parseDouble(d_edittext4.getText().toString()) == 00.00d) {
						d_edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
						d_textview55.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(d_edittext4.getText().toString())) && (Double.parseDouble(d_edittext4.getText().toString()) < Double.parseDouble(s.toString()))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مسطح كل الفتحات أكبر من اجمالي مسطح الحوائط وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							d_edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
							d_edittext17.setTextColor(0xFFE91E63);
							d_textview55.setVisibility(View.VISIBLE);
						}
						else {
							d_edittext17.setText(String.valueOf(Double.parseDouble(d_edittext4.getText().toString()) - Double.parseDouble(s.toString())));
							d_edittext17.setTextColor(0xFF000000);
							d_textview55.setVisibility(View.GONE);
						}
					}
				}
			} });
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
إجمالي كميات المباني دينامك م٢
*/
		d_edittext17.addTextChangedListener(new TextWatcher() { 	
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
					
					
				d_edittext17.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				temp2 = 0;
				 for(int i=0; i<add_dynamic_wall_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_wall_linear.getChildAt(i); 
					TextView tempo2 =child.findViewById(R.id.d_edittext17);
					temp2 = temp2 + Double.parseDouble(tempo2.getText().toString());
				}
				edittext18.setText(String.valueOf(temp2));
			} });
		/*
إجمالي كميات المباني دينامك م٣
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
					
					
				d_edittext20.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				temp3 = 0;
				 for(int i=0; i<add_dynamic_wall_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_wall_linear.getChildAt(i); 
					TextView tempo3 =child.findViewById(R.id.d_edittext20);
					temp3 = temp3 + Double.parseDouble(tempo3.getText().toString());
				}
				edittext21.setText(String.valueOf(temp3));
			} });
		/*
حذف المباني
*/
		d_close_wall.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_wall_linear);
				/*
إجمالي كميات المباني الدينامك بعد عملية الحذف م٢
*/
				temp2 = 0;
				 for(int i=0; i<add_dynamic_wall_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_wall_linear.getChildAt(i); 
					TextView tempo2 =child.findViewById(R.id.d_edittext17);
					temp2 = temp2 + Double.parseDouble(tempo2.getText().toString());
				}
				edittext18.setText(String.valueOf(temp2));
				/*
إجمالي كميات المباني دينامك م٣
*/
				temp3 = 0;
				 for(int i=0; i<add_dynamic_wall_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_wall_linear.getChildAt(i); 
					TextView tempo3 =child.findViewById(R.id.d_edittext20);
					temp3 = temp3 + Double.parseDouble(tempo3.getText().toString());
				}
				edittext21.setText(String.valueOf(temp3));
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
		WebView webView = new WebView(ToipccBrickWorkssActivity.this);
		webView.loadDataWithBaseURL(null, htmlContent.toString(), "text/html", "UTF-8", null);
		webView.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageFinished(WebView view, String url) {
				PrintManager printManager = (PrintManager) ToipccBrickWorkssActivity.this.getSystemService(PRINT_SERVICE);
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
		linear722d.setVisibility(View.VISIBLE);
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
		linear33d.setVisibility(View.GONE);
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
		final TextView textview667bd = dynamic_hole_linear.findViewById(R.id.textview667bd);
		final TextView textview668cd = dynamic_hole_linear.findViewById(R.id.textview668cd);
		final TextView textview669dd = dynamic_hole_linear.findViewById(R.id.textview669dd);
		textview666ad.setVisibility(View.GONE);
		textview667bd.setVisibility(View.GONE);
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
		textview9d.setText("مسطح الفتحات بهذا النموذج بكل الحوائط التي نفس النموذج ( م٢ )");
		textview22d.setText("م٢");
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
				SketchwareUtil.showMessage(getApplicationContext(), "* عدد الفتحات من نفس النموذج والأبعاد بالسقف الواحد\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ فتحة \"");
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
		edittext5d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext5dnn = _param1.toString();
								
edittext5d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext15d.setText(String.valueOf(00.00));
				edittext15d.setTextColor(0xFFE91E63);
				textview667bd.setVisibility(View.GONE);
				edittext5dd.setText(String.valueOf(00.00));
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
				if ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0)))) || (((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || (((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || ((edittext22.getText().toString().equals("") || edittext22.getText().toString().equals(".")) || (edittext22.getText().toString().equals("-") || (Double.parseDouble(edittext22.getText().toString()) < 0)))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext5d.getText().toString().equals("") || edittext5d.getText().toString().equals(".")) || (edittext5d.getText().toString().equals("-") || (Double.parseDouble(edittext5d.getText().toString()) < 0))) {
						edittext5d.setText(String.valueOf(Double.parseDouble(edittext22.getText().toString())));
					}
					if ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) {
						edittext11d.setText(String.valueOf(1));
					}
					edittext8dd.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString())));
					edittext9dd.setText(String.valueOf(Double.parseDouble(edittext9d.getText().toString())));
					edittext5dd.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString())));
					if (Double.parseDouble(edittext8d.getText().toString()) > Double.parseDouble(edittext1.getText().toString())) {
						textview666ad.setVisibility(View.VISIBLE);
						if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(edittext2.getText().toString())) {
							textview668cd.setVisibility(View.VISIBLE);
							if (Double.parseDouble(edittext5d.getText().toString()) > Double.parseDouble(edittext22.getText().toString())) {
								textview667bd.setVisibility(View.VISIBLE);
							}
							else {
								textview667bd.setVisibility(View.GONE);
							}
						}
						else {
							textview668cd.setVisibility(View.GONE);
							if (Double.parseDouble(edittext5d.getText().toString()) > Double.parseDouble(edittext22.getText().toString())) {
								textview667bd.setVisibility(View.VISIBLE);
							}
							else {
								textview667bd.setVisibility(View.GONE);
							}
						}
					}
					else {
						textview666ad.setVisibility(View.GONE);
						if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(edittext2.getText().toString())) {
							textview668cd.setVisibility(View.VISIBLE);
							if (Double.parseDouble(edittext5d.getText().toString()) > Double.parseDouble(edittext22.getText().toString())) {
								textview667bd.setVisibility(View.VISIBLE);
							}
							else {
								textview667bd.setVisibility(View.GONE);
							}
						}
						else {
							textview668cd.setVisibility(View.GONE);
							if (Double.parseDouble(edittext5d.getText().toString()) > Double.parseDouble(edittext22.getText().toString())) {
								textview667bd.setVisibility(View.VISIBLE);
							}
							else {
								textview667bd.setVisibility(View.GONE);
								edittext12d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())));
								edittext13d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString()))));
								edittext12d.setTextColor(0xFF000000);
								edittext13d.setTextColor(0xFF000000);
								if (((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * (Double.parseDouble(edittext5d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString()))) > (Double.parseDouble(edittext1.getText().toString()) * (Double.parseDouble(edittext2.getText().toString()) * Double.parseDouble(edittext22.getText().toString())))) {
									textview669dd.setVisibility(View.VISIBLE);
								}
								else {
									textview669dd.setVisibility(View.GONE);
									if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
										edittext3.setText(String.valueOf(1));
									}
									edittext14d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * (Double.parseDouble(edittext11d.getText().toString()) * Double.parseDouble(edittext3.getText().toString())))));
									edittext14d.setTextColor(0xFF000000);
									edittext15d.setText(String.valueOf((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * ((Double.parseDouble(edittext5d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString())) * Double.parseDouble(edittext3.getText().toString()))));
									edittext15d.setTextColor(0xFF000000);
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
إجمالي المسطحات
*/
		edittext14d.addTextChangedListener(new TextWatcher() { 	
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
				 for(int i=0; i<add_dynamic_hole_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext14d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext16.setText(String.valueOf(temp1));
			} });
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
المقارنات والأبعاد المناظرة
*/
				/*
إجمالي المسطحات بعد عملية الحذف
*/
				temp1 = 0;
				 for(int i=0; i<add_dynamic_hole_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext14d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext16.setText(String.valueOf(temp1));
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
		edittext22.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext22nn = _param1.toString();
								
textview667.setVisibility(View.GONE);
				textview667bd.setVisibility(View.GONE);
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
		/*
المقارنات والأبعاد المناظرة
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
				temp3c = 0;
				for (int i = 0; i < (int)(add_dynamic_hole_linear.getChildCount()); i++) {
					View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo3c =child.findViewById(R.id.edittext5dd);
					temp3c = Math.max(temp3c, Double.parseDouble(tempo3c.getText().toString()));
				}
				if (Double.parseDouble(edittext1.getText().toString()) < temp1a) {
					textview666.setVisibility(View.VISIBLE);
					edittext4.setText(String.valueOf(00.00));
					edittext4.setTextColor(0xFFE91E63);
					edittext5.setText(String.valueOf(00.00));
					edittext5.setTextColor(0xFFE91E63);
					if (Double.parseDouble(edittext2.getText().toString()) < temp2b) {
						textview668.setVisibility(View.VISIBLE);
						if (Double.parseDouble(edittext22.getText().toString()) < temp3c) {
							textview667.setVisibility(View.VISIBLE);
						}
						else {
							textview667.setVisibility(View.GONE);
						}
					}
					else {
						textview668.setVisibility(View.GONE);
						if (Double.parseDouble(edittext22.getText().toString()) < temp3c) {
							textview667.setVisibility(View.VISIBLE);
						}
						else {
							textview667.setVisibility(View.GONE);
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
						if (Double.parseDouble(edittext22.getText().toString()) < temp3c) {
							textview667.setVisibility(View.VISIBLE);
						}
						else {
							textview667.setVisibility(View.GONE);
						}
					}
					else {
						textview668.setVisibility(View.GONE);
						if (Double.parseDouble(edittext22.getText().toString()) < temp3c) {
							textview667.setVisibility(View.VISIBLE);
							edittext4.setText(String.valueOf(00.00));
							edittext4.setTextColor(0xFFE91E63);
							edittext5.setText(String.valueOf(00.00));
							edittext5.setTextColor(0xFFE91E63);
						}
						else {
							textview667.setVisibility(View.GONE);
							edittext4.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) * (Double.parseDouble(edittext2.getText().toString()) * Double.parseDouble(edittext3.getText().toString()))));
							edittext4.setTextColor(0xFF000000);
							edittext5.setText(String.valueOf(Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext22.getText().toString())));
							edittext5.setTextColor(0xFF000000);
						}
					}
				}
			} });
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
				.setMessage("كجم\n" +
                "00.00\n" +
                "=\n" +
                "كمية الأسمنت بمونة اللصق ( كجم )")
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
