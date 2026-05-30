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


public class ToipccPlasteringsActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private double temp1 = 0;
	private double temp = 0;
	private double temp1a = 0;
	private double temp2b = 0;
	private double temp3c = 0;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear723;
	private LinearLayout linear2;
	private LinearLayout add_dynamic_wall_linear;
	private Button add_dynamic_wall;
	private LinearLayout linear120;
	private HorizontalScrollView hscroll2;
	private LinearLayout linear144;
	private TextView textview14;
	private TextView textview482;
	private Button button28;
	private HorizontalScrollView hscroll32;
	private LinearLayout linear57p;
	private TextView textview1;
	private LinearLayout linear713;
	private TextView textview578;
	private LinearLayout linear386;
	private LinearLayout linear724;
	private LinearLayout linear725;
	private LinearLayout linear410;
	private LinearLayout linear726;
	private LinearLayout linear289;
	private TextView textview555;
	private Button button195;
	private LinearLayout linear720;
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
	private HorizontalScrollView hscroll97;
	private LinearLayout linear56;
	private HorizontalScrollView hscroll33;
	private LinearLayout linear162;
	private HorizontalScrollView hscroll37;
	private LinearLayout linear164;
	private LinearLayout linear194;
	private TextView textview666;
	private TextView textview668;
	private LinearLayout linear188;
	private HorizontalScrollView hscroll57;
	private LinearLayout linear13;
	private TextView textview477;
	private LinearLayout add_dynamic_hole_linear;
	private LinearLayout linear722;
	private Button add_dynamic_hole;
	private HorizontalScrollView hscroll56;
	private TextView textview55;
	private LinearLayout linear183;
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
	private TextView textview488;
	private EditText edittext17;
	private TextView textview489;
	private TextView textview487;
	private TextView textview708;
	private EditText edittext18;
	private TextView textview532;
	private TextView textview533;
	private TextView textview601;
	private EditText edittext19;
	private TextView textview602;
	private TextView textview603;
	private LinearLayout linear786;
	private TextView textview1472;
	private TextView textview1473;
	private HorizontalScrollView hscroll88;
	private LinearLayout linear161;
	private HorizontalScrollView hscroll34;
	private LinearLayout linear787;
	private HorizontalScrollView hscroll89;
	private LinearLayout linear788;
	private HorizontalScrollView hscroll90;
	private LinearLayout linear168;
	private TextView textview1474;
	private Button button27p;
	private TextView textview1475;
	private TextView textview1476;
	private HorizontalScrollView hscroll91;
	private LinearLayout linear789;
	private HorizontalScrollView hscroll50;
	private LinearLayout linear174;
	private HorizontalScrollView hscroll51;
	private LinearLayout linear175;
	private HorizontalScrollView hscroll27;
	private LinearLayout linear87;
	private TextView textview1477;
	private TextView textview1478;
	private HorizontalScrollView hscroll52;
	private LinearLayout linear790;
	private HorizontalScrollView hscroll53;
	private LinearLayout linear177;
	private HorizontalScrollView hscroll26;
	private LinearLayout linear86;
	private HorizontalScrollView hscroll19;
	private LinearLayout linear74;
	private TextView textview474;
	private TextView textview515;
	private HorizontalScrollView hscroll58;
	private LinearLayout linear190;
	private HorizontalScrollView hscroll59;
	private LinearLayout linear747;
	private HorizontalScrollView hscroll60;
	private LinearLayout linear785;
	private TextView textview514;
	private TextView textview1479;
	private HorizontalScrollView hscroll28;
	private LinearLayout linear90;
	private Button button103p;
	private HorizontalScrollView hscroll54;
	private LinearLayout linear179;
	private Button button102p;
	private HorizontalScrollView hscroll92;
	private LinearLayout linear791;
	private TextView textview530;
	private TextView textview531;
	private LinearLayout linear795;
	private HorizontalScrollView hscroll96;
	private LinearLayout linear91;
	private HorizontalScrollView hscroll29;
	private LinearLayout linear796;
	private HorizontalScrollView hscroll94;
	private LinearLayout linear180;
	private HorizontalScrollView hscroll55;
	private LinearLayout linear792;
	private HorizontalScrollView hscroll93;
	private LinearLayout linear771;
	private TextView textview1480;
	private LinearLayout linear798;
	private HorizontalScrollView hscroll95;
	private LinearLayout linear799;
	private ImageView imageview39;
	private LinearLayout linear794;
	private TextView textview1481;
	private TextView textview447;
	private EditText edittext20p;
	private TextView textview421;
	private TextView L1;
	private TextView textview1482;
	private EditText edittext21p;
	private TextView textview1483;
	private TextView textview1484;
	private TextView textview1485;
	private EditText edittext22p;
	private TextView textview1486;
	private TextView textview1487;
	private TextView textview1488;
	private EditText edittext23p;
	private TextView textview1489;
	private TextView textview1490;
	private TextView textview709;
	private EditText edittext24p;
	private TextView textview1491;
	private TextView textview1492;
	private TextView textview238;
	private EditText edittext25p;
	private TextView textview439;
	private TextView textview237;
	private TextView textview443;
	private EditText edittext26p;
	private TextView textview441;
	private TextView textview442;
	private TextView textview463;
	private EditText edittext27p;
	private TextView textview268;
	private TextView textview269;
	private TextView textview455;
	private EditText edittext28p;
	private TextView textview444;
	private TextView textview445;
	private TextView textview458;
	private EditText edittext29p;
	private TextView textview456;
	private TextView textview457;
	private TextView textview710;
	private EditText edittext30p;
	private TextView textview322;
	private TextView textview266;
	private TextView textview467;
	private EditText edittext31p;
	private TextView textview286;
	private TextView textview112;
	private TextView textview526;
	private EditText edittext32p;
	private TextView textview516;
	private TextView textview517;
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
	private EditText edittext33p;
	private TextView textview1375;
	private TextView textview519;
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
	private TextView textview521;
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
	private EditText edittext35p;
	private TextView textview1380;
	private TextView textview523;
	private TextView textview1433;
	private EditText edittext41;
	private TextView textview1418;
	private TextView textview1419;
	private TextView textview1416;
	private TextView textview1417;
	private LinearLayout linear757;
	private TextView textview1420;
	private EditText edittext42;
	private TextView textview464;
	private EditText edittext36p;
	private TextView textview271;
	private TextView textview272;
	private TextView textview465;
	private EditText edittext37p;
	private TextView textview461;
	private TextView textview462;
	private TextView textview1493;
	private EditText edittext38p;
	private TextView textview1494;
	private TextView textview1495;
	private TextView textview1500;
	private EditText edittext51;
	private TextView textview1501;
	private TextView textview1502;
	private TextView textview468;
	private EditText edittext39p;
	private TextView textview287;
	private TextView textview274;
	private TextView textview1503;
	private EditText edittext52;
	private TextView textview1504;
	private TextView textview1505;
	private TextView textview471;
	private EditText edittext40p;
	private TextView textview469;
	private TextView textview470;
	private TextView textview472;
	private EditText edittext41p;
	private TextView textview1496;
	private TextView textview279;
	private TextView textview1453;
	private EditText edittext50;
	private TextView textview1454;
	private TextView textview1455;
	private TextView textview1508;
	private TextView textview1507;
	private LinearLayout linear797;
	private TextView textview1506;
	private EditText edittext53;
	private TextView textview1499;
	private TextView textview1498;
	private LinearLayout linear793;
	private TextView textview1497;
	private EditText edittext42p;
	
	private Intent price = new Intent();
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_plasterings);
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
		hscroll2 = findViewById(R.id.hscroll2);
		linear144 = findViewById(R.id.linear144);
		textview14 = findViewById(R.id.textview14);
		textview482 = findViewById(R.id.textview482);
		button28 = findViewById(R.id.button28);
		hscroll32 = findViewById(R.id.hscroll32);
		linear57p = findViewById(R.id.linear57p);
		textview1 = findViewById(R.id.textview1);
		linear713 = findViewById(R.id.linear713);
		textview578 = findViewById(R.id.textview578);
		linear386 = findViewById(R.id.linear386);
		linear724 = findViewById(R.id.linear724);
		linear725 = findViewById(R.id.linear725);
		linear410 = findViewById(R.id.linear410);
		linear726 = findViewById(R.id.linear726);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		button195 = findViewById(R.id.button195);
		linear720 = findViewById(R.id.linear720);
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
		hscroll97 = findViewById(R.id.hscroll97);
		linear56 = findViewById(R.id.linear56);
		hscroll33 = findViewById(R.id.hscroll33);
		linear162 = findViewById(R.id.linear162);
		hscroll37 = findViewById(R.id.hscroll37);
		linear164 = findViewById(R.id.linear164);
		linear194 = findViewById(R.id.linear194);
		textview666 = findViewById(R.id.textview666);
		textview668 = findViewById(R.id.textview668);
		linear188 = findViewById(R.id.linear188);
		hscroll57 = findViewById(R.id.hscroll57);
		linear13 = findViewById(R.id.linear13);
		textview477 = findViewById(R.id.textview477);
		add_dynamic_hole_linear = findViewById(R.id.add_dynamic_hole_linear);
		linear722 = findViewById(R.id.linear722);
		add_dynamic_hole = findViewById(R.id.add_dynamic_hole);
		hscroll56 = findViewById(R.id.hscroll56);
		textview55 = findViewById(R.id.textview55);
		linear183 = findViewById(R.id.linear183);
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
		textview488 = findViewById(R.id.textview488);
		edittext17 = findViewById(R.id.edittext17);
		textview489 = findViewById(R.id.textview489);
		textview487 = findViewById(R.id.textview487);
		textview708 = findViewById(R.id.textview708);
		edittext18 = findViewById(R.id.edittext18);
		textview532 = findViewById(R.id.textview532);
		textview533 = findViewById(R.id.textview533);
		textview601 = findViewById(R.id.textview601);
		edittext19 = findViewById(R.id.edittext19);
		textview602 = findViewById(R.id.textview602);
		textview603 = findViewById(R.id.textview603);
		linear786 = findViewById(R.id.linear786);
		textview1472 = findViewById(R.id.textview1472);
		textview1473 = findViewById(R.id.textview1473);
		hscroll88 = findViewById(R.id.hscroll88);
		linear161 = findViewById(R.id.linear161);
		hscroll34 = findViewById(R.id.hscroll34);
		linear787 = findViewById(R.id.linear787);
		hscroll89 = findViewById(R.id.hscroll89);
		linear788 = findViewById(R.id.linear788);
		hscroll90 = findViewById(R.id.hscroll90);
		linear168 = findViewById(R.id.linear168);
		textview1474 = findViewById(R.id.textview1474);
		button27p = findViewById(R.id.button27p);
		textview1475 = findViewById(R.id.textview1475);
		textview1476 = findViewById(R.id.textview1476);
		hscroll91 = findViewById(R.id.hscroll91);
		linear789 = findViewById(R.id.linear789);
		hscroll50 = findViewById(R.id.hscroll50);
		linear174 = findViewById(R.id.linear174);
		hscroll51 = findViewById(R.id.hscroll51);
		linear175 = findViewById(R.id.linear175);
		hscroll27 = findViewById(R.id.hscroll27);
		linear87 = findViewById(R.id.linear87);
		textview1477 = findViewById(R.id.textview1477);
		textview1478 = findViewById(R.id.textview1478);
		hscroll52 = findViewById(R.id.hscroll52);
		linear790 = findViewById(R.id.linear790);
		hscroll53 = findViewById(R.id.hscroll53);
		linear177 = findViewById(R.id.linear177);
		hscroll26 = findViewById(R.id.hscroll26);
		linear86 = findViewById(R.id.linear86);
		hscroll19 = findViewById(R.id.hscroll19);
		linear74 = findViewById(R.id.linear74);
		textview474 = findViewById(R.id.textview474);
		textview515 = findViewById(R.id.textview515);
		hscroll58 = findViewById(R.id.hscroll58);
		linear190 = findViewById(R.id.linear190);
		hscroll59 = findViewById(R.id.hscroll59);
		linear747 = findViewById(R.id.linear747);
		hscroll60 = findViewById(R.id.hscroll60);
		linear785 = findViewById(R.id.linear785);
		textview514 = findViewById(R.id.textview514);
		textview1479 = findViewById(R.id.textview1479);
		hscroll28 = findViewById(R.id.hscroll28);
		linear90 = findViewById(R.id.linear90);
		button103p = findViewById(R.id.button103p);
		hscroll54 = findViewById(R.id.hscroll54);
		linear179 = findViewById(R.id.linear179);
		button102p = findViewById(R.id.button102p);
		hscroll92 = findViewById(R.id.hscroll92);
		linear791 = findViewById(R.id.linear791);
		textview530 = findViewById(R.id.textview530);
		textview531 = findViewById(R.id.textview531);
		linear795 = findViewById(R.id.linear795);
		hscroll96 = findViewById(R.id.hscroll96);
		linear91 = findViewById(R.id.linear91);
		hscroll29 = findViewById(R.id.hscroll29);
		linear796 = findViewById(R.id.linear796);
		hscroll94 = findViewById(R.id.hscroll94);
		linear180 = findViewById(R.id.linear180);
		hscroll55 = findViewById(R.id.hscroll55);
		linear792 = findViewById(R.id.linear792);
		hscroll93 = findViewById(R.id.hscroll93);
		linear771 = findViewById(R.id.linear771);
		textview1480 = findViewById(R.id.textview1480);
		linear798 = findViewById(R.id.linear798);
		hscroll95 = findViewById(R.id.hscroll95);
		linear799 = findViewById(R.id.linear799);
		imageview39 = findViewById(R.id.imageview39);
		linear794 = findViewById(R.id.linear794);
		textview1481 = findViewById(R.id.textview1481);
		textview447 = findViewById(R.id.textview447);
		edittext20p = findViewById(R.id.edittext20p);
		textview421 = findViewById(R.id.textview421);
		L1 = findViewById(R.id.L1);
		textview1482 = findViewById(R.id.textview1482);
		edittext21p = findViewById(R.id.edittext21p);
		textview1483 = findViewById(R.id.textview1483);
		textview1484 = findViewById(R.id.textview1484);
		textview1485 = findViewById(R.id.textview1485);
		edittext22p = findViewById(R.id.edittext22p);
		textview1486 = findViewById(R.id.textview1486);
		textview1487 = findViewById(R.id.textview1487);
		textview1488 = findViewById(R.id.textview1488);
		edittext23p = findViewById(R.id.edittext23p);
		textview1489 = findViewById(R.id.textview1489);
		textview1490 = findViewById(R.id.textview1490);
		textview709 = findViewById(R.id.textview709);
		edittext24p = findViewById(R.id.edittext24p);
		textview1491 = findViewById(R.id.textview1491);
		textview1492 = findViewById(R.id.textview1492);
		textview238 = findViewById(R.id.textview238);
		edittext25p = findViewById(R.id.edittext25p);
		textview439 = findViewById(R.id.textview439);
		textview237 = findViewById(R.id.textview237);
		textview443 = findViewById(R.id.textview443);
		edittext26p = findViewById(R.id.edittext26p);
		textview441 = findViewById(R.id.textview441);
		textview442 = findViewById(R.id.textview442);
		textview463 = findViewById(R.id.textview463);
		edittext27p = findViewById(R.id.edittext27p);
		textview268 = findViewById(R.id.textview268);
		textview269 = findViewById(R.id.textview269);
		textview455 = findViewById(R.id.textview455);
		edittext28p = findViewById(R.id.edittext28p);
		textview444 = findViewById(R.id.textview444);
		textview445 = findViewById(R.id.textview445);
		textview458 = findViewById(R.id.textview458);
		edittext29p = findViewById(R.id.edittext29p);
		textview456 = findViewById(R.id.textview456);
		textview457 = findViewById(R.id.textview457);
		textview710 = findViewById(R.id.textview710);
		edittext30p = findViewById(R.id.edittext30p);
		textview322 = findViewById(R.id.textview322);
		textview266 = findViewById(R.id.textview266);
		textview467 = findViewById(R.id.textview467);
		edittext31p = findViewById(R.id.edittext31p);
		textview286 = findViewById(R.id.textview286);
		textview112 = findViewById(R.id.textview112);
		textview526 = findViewById(R.id.textview526);
		edittext32p = findViewById(R.id.edittext32p);
		textview516 = findViewById(R.id.textview516);
		textview517 = findViewById(R.id.textview517);
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
		edittext33p = findViewById(R.id.edittext33p);
		textview1375 = findViewById(R.id.textview1375);
		textview519 = findViewById(R.id.textview519);
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
		textview521 = findViewById(R.id.textview521);
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
		edittext35p = findViewById(R.id.edittext35p);
		textview1380 = findViewById(R.id.textview1380);
		textview523 = findViewById(R.id.textview523);
		textview1433 = findViewById(R.id.textview1433);
		edittext41 = findViewById(R.id.edittext41);
		textview1418 = findViewById(R.id.textview1418);
		textview1419 = findViewById(R.id.textview1419);
		textview1416 = findViewById(R.id.textview1416);
		textview1417 = findViewById(R.id.textview1417);
		linear757 = findViewById(R.id.linear757);
		textview1420 = findViewById(R.id.textview1420);
		edittext42 = findViewById(R.id.edittext42);
		textview464 = findViewById(R.id.textview464);
		edittext36p = findViewById(R.id.edittext36p);
		textview271 = findViewById(R.id.textview271);
		textview272 = findViewById(R.id.textview272);
		textview465 = findViewById(R.id.textview465);
		edittext37p = findViewById(R.id.edittext37p);
		textview461 = findViewById(R.id.textview461);
		textview462 = findViewById(R.id.textview462);
		textview1493 = findViewById(R.id.textview1493);
		edittext38p = findViewById(R.id.edittext38p);
		textview1494 = findViewById(R.id.textview1494);
		textview1495 = findViewById(R.id.textview1495);
		textview1500 = findViewById(R.id.textview1500);
		edittext51 = findViewById(R.id.edittext51);
		textview1501 = findViewById(R.id.textview1501);
		textview1502 = findViewById(R.id.textview1502);
		textview468 = findViewById(R.id.textview468);
		edittext39p = findViewById(R.id.edittext39p);
		textview287 = findViewById(R.id.textview287);
		textview274 = findViewById(R.id.textview274);
		textview1503 = findViewById(R.id.textview1503);
		edittext52 = findViewById(R.id.edittext52);
		textview1504 = findViewById(R.id.textview1504);
		textview1505 = findViewById(R.id.textview1505);
		textview471 = findViewById(R.id.textview471);
		edittext40p = findViewById(R.id.edittext40p);
		textview469 = findViewById(R.id.textview469);
		textview470 = findViewById(R.id.textview470);
		textview472 = findViewById(R.id.textview472);
		edittext41p = findViewById(R.id.edittext41p);
		textview1496 = findViewById(R.id.textview1496);
		textview279 = findViewById(R.id.textview279);
		textview1453 = findViewById(R.id.textview1453);
		edittext50 = findViewById(R.id.edittext50);
		textview1454 = findViewById(R.id.textview1454);
		textview1455 = findViewById(R.id.textview1455);
		textview1508 = findViewById(R.id.textview1508);
		textview1507 = findViewById(R.id.textview1507);
		linear797 = findViewById(R.id.linear797);
		textview1506 = findViewById(R.id.textview1506);
		edittext53 = findViewById(R.id.edittext53);
		textview1499 = findViewById(R.id.textview1499);
		textview1498 = findViewById(R.id.textview1498);
		linear793 = findViewById(R.id.linear793);
		textview1497 = findViewById(R.id.textview1497);
		edittext42p = findViewById(R.id.edittext42p);
		internet = new RequestNetwork(this);
		
		add_dynamic_wall.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
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
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear57p.setVisibility(View.VISIBLE);
					edittext20p.setText("");
					edittext21p.setText("");
					edittext22p.setText("");
					edittext23p.setText("");
					edittext35.setText("");
					edittext41.setText("");
					edittext24p.setTextColor(0xFF000000);
					edittext25p.setTextColor(0xFF000000);
					edittext26p.setTextColor(0xFF000000);
					edittext27p.setTextColor(0xFF000000);
					edittext28p.setTextColor(0xFF000000);
					edittext29p.setTextColor(0xFF000000);
					edittext30p.setTextColor(0xFF000000);
					edittext31p.setTextColor(0xFF000000);
					edittext32p.setTextColor(0xFF000000);
					edittext33p.setTextColor(0xFF000000);
					edittext35p.setTextColor(0xFF000000);
					edittext36p.setText("");
					edittext37p.setText("");
					edittext38p.setText("");
					edittext51.setTextColor(0xFF000000);
					edittext39p.setTextColor(0xFF000000);
					edittext52.setTextColor(0xFF000000);
					edittext40p.setTextColor(0xFF000000);
					edittext41p.setTextColor(0xFF000000);
					edittext50.setText("");
					edittext53.setTextColor(0xFFFFFFFF);
					edittext42p.setTextColor(0xFFFFFFFF);
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
				price.setData(Uri.parse("https://youtu.be/v17TI1uJ8l8"));
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
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					_dynamic_hole_in_wall();
					linear722.setVisibility(View.VISIBLE);
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
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
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
				ViewTooltip
				        .on(ToipccPlasteringsActivity.this, textview7)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الحوائط\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١ حائط \"")
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
				if (((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
						edittext3.setText(String.valueOf(1));
					}
					edittext4.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext2.getText().toString())));
					edittext5.setText(String.valueOf((Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext2.getText().toString())) * Double.parseDouble(edittext3.getText().toString())));
					edittext4.setTextColor(0xFF000000);
					edittext5.setTextColor(0xFF000000);
					edittext444.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext2.getText().toString())));
					edittext444.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext4.addTextChangedListener(new TextWatcher() {
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
		
		edittext5.addTextChangedListener(new TextWatcher() {
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
		
		edittext16.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(_charSeq) == 0) {
					linear722.setVisibility(View.GONE);
					edittext17.setText(String.valueOf(Double.parseDouble(edittext5.getText().toString()) - Double.parseDouble(_charSeq)));
					textview55.setVisibility(View.GONE);
				}
				else {
					linear722.setVisibility(View.VISIBLE);
					if (Double.parseDouble(edittext5.getText().toString()) == 00.00d) {
						edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
						textview55.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(edittext5.getText().toString())) && (Double.parseDouble(edittext5.getText().toString()) < Double.parseDouble(_charSeq))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مسطح كل الفتحات أكبر من اجمالي مسطح الحوائط وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
							edittext17.setTextColor(0xFFE91E63);
							textview55.setVisibility(View.VISIBLE);
						}
						else {
							edittext17.setText(String.valueOf(Double.parseDouble(edittext5.getText().toString()) - Double.parseDouble(_charSeq)));
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
		
		edittext19.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext38p.getText().toString().equals("") || edittext38p.getText().toString().equals(".")) || (edittext38p.getText().toString().equals("-") || (Double.parseDouble(edittext38p.getText().toString()) < 0))) {
					edittext41p.setText(String.valueOf(Double.parseDouble("00.00")));
				}
				else {
					edittext41p.setText(String.valueOf(Double.parseDouble(edittext38p.getText().toString()) * Double.parseDouble(_charSeq)));
				}
				edittext24p.setText(String.valueOf(00.00));
				edittext25p.setText(String.valueOf(00.00));
				edittext26p.setText(String.valueOf(00.00));
				edittext27p.setText(String.valueOf(00.00));
				edittext28p.setText(String.valueOf(00.00));
				edittext29p.setText(String.valueOf(00.00));
				edittext30p.setText(String.valueOf(00.00));
				edittext31p.setText(String.valueOf(00.00));
				edittext32p.setText(String.valueOf(00.00));
				edittext33p.setText(String.valueOf(00.00));
				edittext35p.setText(String.valueOf(00.00));
				edittext24p.setTextColor(0xFFE91E63);
				edittext25p.setTextColor(0xFFE91E63);
				edittext26p.setTextColor(0xFFE91E63);
				edittext27p.setTextColor(0xFFE91E63);
				edittext28p.setTextColor(0xFFE91E63);
				edittext29p.setTextColor(0xFFE91E63);
				edittext30p.setTextColor(0xFFE91E63);
				edittext31p.setTextColor(0xFFE91E63);
				edittext32p.setTextColor(0xFFE91E63);
				edittext33p.setTextColor(0xFFE91E63);
				edittext35p.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button27p.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext20p.getText().toString().equals("") || edittext20p.getText().toString().equals(".")) || (edittext20p.getText().toString().equals("-") || ((Double.parseDouble(edittext20p.getText().toString()) < 0) || (Double.parseDouble(edittext20p.getText().toString()) > 1)))) {
					edittext20p.setText(String.valueOf(0.5d));
				}
				if ((edittext21p.getText().toString().equals("") || edittext21p.getText().toString().equals(".")) || (edittext21p.getText().toString().equals("-") || (Double.parseDouble(edittext21p.getText().toString()) < 0))) {
					edittext21p.setText(String.valueOf(450));
				}
				if ((edittext22p.getText().toString().equals("") || edittext22p.getText().toString().equals(".")) || (edittext22p.getText().toString().equals("-") || ((Double.parseDouble(edittext22p.getText().toString()) < 0) || (Double.parseDouble(edittext22p.getText().toString()) > 10)))) {
					edittext22p.setText(String.valueOf(2));
				}
				if ((edittext23p.getText().toString().equals("") || edittext23p.getText().toString().equals(".")) || (edittext23p.getText().toString().equals("-") || (Double.parseDouble(edittext23p.getText().toString()) < 0))) {
					edittext23p.setText(String.valueOf(300));
				}
				if ((edittext35.getText().toString().equals("") || edittext35.getText().toString().equals(".")) || (edittext35.getText().toString().equals("-") || (Double.parseDouble(edittext35.getText().toString()) < 0))) {
					edittext35.setText(String.valueOf(5));
				}
				if ((edittext41.getText().toString().equals("") || edittext41.getText().toString().equals(".")) || (edittext41.getText().toString().equals("-") || (Double.parseDouble(edittext41.getText().toString()) < 0))) {
					edittext41.setText(String.valueOf(10));
				}
				edittext24p.setText(String.valueOf((Double.parseDouble(edittext20p.getText().toString()) / 100) * Double.parseDouble(edittext19.getText().toString())));
				edittext25p.setText(String.valueOf(Double.parseDouble(edittext21p.getText().toString()) * Double.parseDouble(edittext24p.getText().toString())));
				edittext26p.setText(String.valueOf(Double.parseDouble(edittext25p.getText().toString()) / 1000));
				edittext27p.setText(String.valueOf(Double.parseDouble(edittext24p.getText().toString()) * 1));
				edittext28p.setText(String.valueOf((Double.parseDouble(edittext22p.getText().toString()) / 100) * Double.parseDouble(edittext19.getText().toString())));
				edittext29p.setText(String.valueOf(Double.parseDouble(edittext28p.getText().toString()) * Double.parseDouble(edittext23p.getText().toString())));
				edittext30p.setText(String.valueOf(Double.parseDouble(edittext29p.getText().toString()) / 1000));
				edittext31p.setText(String.valueOf(Double.parseDouble(edittext28p.getText().toString()) * 1));
				edittext32p.setText(String.valueOf(Double.parseDouble(edittext24p.getText().toString()) + Double.parseDouble(edittext28p.getText().toString())));
				edittext33p.setText(String.valueOf(Double.parseDouble(edittext25p.getText().toString()) + Double.parseDouble(edittext29p.getText().toString())));
				edittext35p.setText(String.valueOf(Double.parseDouble(edittext27p.getText().toString()) + Double.parseDouble(edittext31p.getText().toString())));
				edittext24p.setTextColor(0xFF000000);
				edittext25p.setTextColor(0xFF000000);
				edittext26p.setTextColor(0xFF000000);
				edittext27p.setTextColor(0xFF000000);
				edittext28p.setTextColor(0xFF000000);
				edittext29p.setTextColor(0xFF000000);
				edittext30p.setTextColor(0xFF000000);
				edittext31p.setTextColor(0xFF000000);
				edittext32p.setTextColor(0xFF000000);
				edittext33p.setTextColor(0xFF000000);
				edittext35p.setTextColor(0xFF000000);
			}
		});
		
		button103p.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.altkia.com/cement-prices-today/"));
				startActivity(price);
			}
		});
		
		button102p.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.biltafsil.com/18209/%d8%b3%d8%b9%d8%b1-%d9%85%d8%aa%d8%b1-%d8%a7%d9%84%d8%b1%d9%85%d9%84-%d9%88%d8%a7%d9%84%d8%b2%d9%84%d8%b7/"));
				startActivity(price);
			}
		});
		
		imageview39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear57p.setVisibility(View.GONE);
				edittext20p.setText("");
				edittext21p.setText("");
				edittext22p.setText("");
				edittext23p.setText("");
				edittext35.setText("");
				edittext41.setText("");
				edittext36p.setText("");
				edittext37p.setText("");
				edittext38p.setText("");
				edittext50.setText("");
			}
		});
		
		edittext20p.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext20p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext24p.setText(String.valueOf(00.00));
				edittext25p.setText(String.valueOf(00.00));
				edittext26p.setText(String.valueOf(00.00));
				edittext27p.setText(String.valueOf(00.00));
				edittext32p.setText(String.valueOf(00.00));
				edittext33p.setText(String.valueOf(00.00));
				edittext35p.setText(String.valueOf(00.00));
				edittext24p.setTextColor(0xFFE91E63);
				edittext25p.setTextColor(0xFFE91E63);
				edittext26p.setTextColor(0xFFE91E63);
				edittext27p.setTextColor(0xFFE91E63);
				edittext32p.setTextColor(0xFFE91E63);
				edittext33p.setTextColor(0xFFE91E63);
				edittext35p.setTextColor(0xFFE91E63);
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
				ViewTooltip
				        .on(ToipccPlasteringsActivity.this, L1)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* سمك طبقة الطرطشة ( سم )\n\" مدخل اختياري إذا لم يتم\nإدخاله سيقوم البرنامج بإفتراضه\nبقيمة = ٠.٥٠ سم \"")
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
		
		edittext21p.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext21p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext25p.setText(String.valueOf(00.00));
				edittext26p.setText(String.valueOf(00.00));
				edittext33p.setText(String.valueOf(00.00));
				edittext25p.setTextColor(0xFFE91E63);
				edittext26p.setTextColor(0xFFE91E63);
				edittext33p.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1484.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccPlasteringsActivity.this, textview1484)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* نسبة الأسمنت أو المحتوي الأسمنتي بمونة الطرطشة\n\" مدخل اختياري إذا لم يتم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٤٥٠ كجم / م٣رمل \"\n( كجم / م٣ رمل )")
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
		
		edittext22p.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext22p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext28p.setText(String.valueOf(00.00));
				edittext29p.setText(String.valueOf(00.00));
				edittext30p.setText(String.valueOf(00.00));
				edittext31p.setText(String.valueOf(00.00));
				edittext32p.setText(String.valueOf(00.00));
				edittext33p.setText(String.valueOf(00.00));
				edittext35p.setText(String.valueOf(00.00));
				edittext28p.setTextColor(0xFFE91E63);
				edittext29p.setTextColor(0xFFE91E63);
				edittext30p.setTextColor(0xFFE91E63);
				edittext31p.setTextColor(0xFFE91E63);
				edittext32p.setTextColor(0xFFE91E63);
				edittext33p.setTextColor(0xFFE91E63);
				edittext35p.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1487.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccPlasteringsActivity.this, textview1487)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* سمك طبقة البياض بعد خصم سمك طبقة الطرطشة ( سم )\n\" مدخل اختياري إذا لم يتم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٢ سم \"")
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
		
		edittext23p.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext23p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext29p.setText(String.valueOf(00.00));
				edittext30p.setText(String.valueOf(00.00));
				edittext33p.setText(String.valueOf(00.00));
				edittext29p.setTextColor(0xFFE91E63);
				edittext30p.setTextColor(0xFFE91E63);
				edittext33p.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1490.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccPlasteringsActivity.this, textview1490)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* نسبة الأسمنت أو المحتوي الأسمنتي بمونة البياض ( الملو )\n\" مدخل اختياري إذا لم يتم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٣٠٠ كجم / م٣رمل \"\n( كجم / م٣ رمل )")
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
		
		edittext24p.addTextChangedListener(new TextWatcher() {
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
		
		edittext25p.addTextChangedListener(new TextWatcher() {
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
		
		edittext26p.addTextChangedListener(new TextWatcher() {
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
		
		edittext27p.addTextChangedListener(new TextWatcher() {
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
		
		edittext28p.addTextChangedListener(new TextWatcher() {
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
		
		edittext29p.addTextChangedListener(new TextWatcher() {
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
		
		edittext30p.addTextChangedListener(new TextWatcher() {
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
		
		edittext31p.addTextChangedListener(new TextWatcher() {
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
		
		edittext32p.addTextChangedListener(new TextWatcher() {
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
		
		edittext33p.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext35.getText().toString().equals("") || edittext35.getText().toString().equals(".")) || (edittext35.getText().toString().equals("-") || (Double.parseDouble(edittext35.getText().toString()) < 0))) {
					edittext36.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
				else {
					edittext36.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext35.getText().toString()) / 100))));
				}
				if ((edittext36p.getText().toString().equals("") || edittext36p.getText().toString().equals(".")) || (edittext36p.getText().toString().equals("-") || (Double.parseDouble(edittext36p.getText().toString()) < 0))) {
					edittext51.setText(String.valueOf(Double.parseDouble("00.00")));
					edittext51.setTextColor(0xFFE91E63);
				}
				else {
					edittext51.setText(String.valueOf(Double.parseDouble(edittext36p.getText().toString()) * (Double.parseDouble(_charSeq) / 1000)));
					edittext51.setTextColor(0xFF000000);
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
					edittext36.setText(String.valueOf(Double.parseDouble(edittext33p.getText().toString())));
				}
				else {
					edittext36.setText(String.valueOf(Double.parseDouble(edittext33p.getText().toString()) + (Double.parseDouble(edittext33p.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1405.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccPlasteringsActivity.this, textview1405)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* نسبة الهالك بالأسمنت \" ناتج قابل للتعديل في حالة الرغبة وفي حالة عدم الرغبة سيقوم البرنامج بافتراضه بقيمة = ١٠% \"")
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
				if ((edittext36p.getText().toString().equals("") || edittext36p.getText().toString().equals(".")) || (edittext36p.getText().toString().equals("-") || (Double.parseDouble(edittext36p.getText().toString()) < 0))) {
					edittext39p.setText(String.valueOf(Double.parseDouble("00.00")));
					edittext39p.setTextColor(0xFFE91E63);
				}
				else {
					edittext39p.setText(String.valueOf(Double.parseDouble(edittext36p.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext39p.setTextColor(0xFF000000);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext35p.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext41.getText().toString().equals("") || edittext41.getText().toString().equals(".")) || (edittext41.getText().toString().equals("-") || (Double.parseDouble(edittext41.getText().toString()) < 0))) {
					edittext42.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
				else {
					edittext42.setText(String.valueOf(Double.parseDouble(_charSeq) + (Double.parseDouble(_charSeq) * (Double.parseDouble(edittext41.getText().toString()) / 100))));
				}
				if ((edittext37p.getText().toString().equals("") || edittext37p.getText().toString().equals(".")) || (edittext37p.getText().toString().equals("-") || (Double.parseDouble(edittext37p.getText().toString()) < 0))) {
					edittext52.setText(String.valueOf(Double.parseDouble("00.00")));
					edittext52.setTextColor(0xFFE91E63);
				}
				else {
					edittext52.setText(String.valueOf(Double.parseDouble(edittext37p.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext52.setTextColor(0xFF000000);
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
					edittext42.setText(String.valueOf(Double.parseDouble(edittext35p.getText().toString())));
				}
				else {
					edittext42.setText(String.valueOf(Double.parseDouble(edittext35p.getText().toString()) + (Double.parseDouble(edittext35p.getText().toString()) * (Double.parseDouble(_charSeq) / 100))));
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
				ViewTooltip
				        .on(ToipccPlasteringsActivity.this, textview1419)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* نسبة الهالك بالرمل \" ناتج قابل للتعديل في حالة الرغبة وفي حالة عدم الرغبة سيقوم البرنامج بافتراضه بقيمة = ١٠% \"")
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
		
		edittext42.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext37p.getText().toString().equals("") || edittext37p.getText().toString().equals(".")) || (edittext37p.getText().toString().equals("-") || (Double.parseDouble(edittext37p.getText().toString()) < 0))) {
					edittext40p.setText(String.valueOf(Double.parseDouble("00.00")));
					edittext40p.setTextColor(0xFFE91E63);
				}
				else {
					edittext40p.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext37p.getText().toString())));
					edittext40p.setTextColor(0xFF000000);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext36p.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext36p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext39p.setText(String.valueOf(Double.parseDouble("00.00")));
					edittext39p.setTextColor(0xFFE91E63);
				}
				else {
					edittext39p.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext39.getText().toString())));
					edittext39p.setTextColor(0xFF000000);
				}
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext51.setText(String.valueOf(Double.parseDouble("00.00")));
					edittext51.setTextColor(0xFFE91E63);
				}
				else {
					edittext51.setText(String.valueOf(Double.parseDouble(_charSeq) * (Double.parseDouble(edittext33p.getText().toString()) / 1000)));
					edittext51.setTextColor(0xFF000000);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext37p.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext37p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext40p.setText(String.valueOf(Double.parseDouble("00.00")));
					edittext40p.setTextColor(0xFFE91E63);
				}
				else {
					edittext40p.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext42.getText().toString())));
					edittext40p.setTextColor(0xFF000000);
				}
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext52.setText(String.valueOf(Double.parseDouble("00.00")));
					edittext52.setTextColor(0xFFE91E63);
				}
				else {
					edittext52.setText(String.valueOf(Double.parseDouble(edittext35p.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext52.setTextColor(0xFF000000);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext38p.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext38p.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext41p.setText(String.valueOf(Double.parseDouble("00.00")));
					edittext41p.setTextColor(0xFFE91E63);
				}
				else {
					edittext41p.setText(String.valueOf(Double.parseDouble(edittext19.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext41p.setTextColor(0xFF000000);
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
				if ((edittext50.getText().toString().equals("") || edittext50.getText().toString().equals(".")) || (edittext50.getText().toString().equals("-") || (Double.parseDouble(edittext50.getText().toString()) < 0))) {
					edittext53.setText(String.valueOf((Double.parseDouble(_charSeq) + Double.parseDouble(edittext52.getText().toString())) + Double.parseDouble(edittext41p.getText().toString())));
				}
				else {
					edittext53.setText(String.valueOf((Double.parseDouble(_charSeq) + Double.parseDouble(edittext52.getText().toString())) + (Double.parseDouble(edittext41p.getText().toString()) + Double.parseDouble(edittext50.getText().toString()))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext39p.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext50.getText().toString().equals("") || edittext50.getText().toString().equals(".")) || (edittext50.getText().toString().equals("-") || (Double.parseDouble(edittext50.getText().toString()) < 0))) {
					edittext42p.setText(String.valueOf((Double.parseDouble(_charSeq) + Double.parseDouble(edittext40p.getText().toString())) + Double.parseDouble(edittext41p.getText().toString())));
				}
				else {
					edittext42p.setText(String.valueOf((Double.parseDouble(_charSeq) + Double.parseDouble(edittext40p.getText().toString())) + (Double.parseDouble(edittext41p.getText().toString()) + Double.parseDouble(edittext50.getText().toString()))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext52.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext50.getText().toString().equals("") || edittext50.getText().toString().equals(".")) || (edittext50.getText().toString().equals("-") || (Double.parseDouble(edittext50.getText().toString()) < 0))) {
					edittext53.setText(String.valueOf((Double.parseDouble(edittext51.getText().toString()) + Double.parseDouble(_charSeq)) + Double.parseDouble(edittext41p.getText().toString())));
				}
				else {
					edittext53.setText(String.valueOf((Double.parseDouble(edittext51.getText().toString()) + Double.parseDouble(_charSeq)) + (Double.parseDouble(edittext41p.getText().toString()) + Double.parseDouble(edittext50.getText().toString()))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext40p.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext50.getText().toString().equals("") || edittext50.getText().toString().equals(".")) || (edittext50.getText().toString().equals("-") || (Double.parseDouble(edittext50.getText().toString()) < 0))) {
					edittext42p.setText(String.valueOf((Double.parseDouble(edittext39p.getText().toString()) + Double.parseDouble(_charSeq)) + Double.parseDouble(edittext41p.getText().toString())));
				}
				else {
					edittext42p.setText(String.valueOf((Double.parseDouble(edittext39p.getText().toString()) + Double.parseDouble(_charSeq)) + (Double.parseDouble(edittext41p.getText().toString()) + Double.parseDouble(edittext50.getText().toString()))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext41p.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext50.getText().toString().equals("") || edittext50.getText().toString().equals(".")) || (edittext50.getText().toString().equals("-") || (Double.parseDouble(edittext50.getText().toString()) < 0))) {
					edittext42p.setText(String.valueOf((Double.parseDouble(edittext39p.getText().toString()) + Double.parseDouble(edittext40p.getText().toString())) + Double.parseDouble(_charSeq)));
				}
				else {
					edittext42p.setText(String.valueOf((Double.parseDouble(edittext39p.getText().toString()) + Double.parseDouble(edittext40p.getText().toString())) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext50.getText().toString()))));
				}
				if ((edittext50.getText().toString().equals("") || edittext50.getText().toString().equals(".")) || (edittext50.getText().toString().equals("-") || (Double.parseDouble(edittext50.getText().toString()) < 0))) {
					edittext53.setText(String.valueOf((Double.parseDouble(edittext51.getText().toString()) + Double.parseDouble(edittext52.getText().toString())) + Double.parseDouble(_charSeq)));
				}
				else {
					edittext53.setText(String.valueOf((Double.parseDouble(edittext51.getText().toString()) + Double.parseDouble(edittext52.getText().toString())) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext50.getText().toString()))));
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
					edittext42p.setText(String.valueOf((Double.parseDouble(edittext39p.getText().toString()) + Double.parseDouble(edittext40p.getText().toString())) + Double.parseDouble(edittext41p.getText().toString())));
				}
				else {
					edittext42p.setText(String.valueOf((Double.parseDouble(edittext39p.getText().toString()) + Double.parseDouble(edittext40p.getText().toString())) + (Double.parseDouble(edittext41p.getText().toString()) + Double.parseDouble(_charSeq))));
				}
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext53.setText(String.valueOf((Double.parseDouble(edittext51.getText().toString()) + Double.parseDouble(edittext52.getText().toString())) + Double.parseDouble(edittext41p.getText().toString())));
				}
				else {
					edittext53.setText(String.valueOf((Double.parseDouble(edittext51.getText().toString()) + Double.parseDouble(edittext52.getText().toString())) + (Double.parseDouble(edittext41p.getText().toString()) + Double.parseDouble(_charSeq))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1455.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بتجاهل حسابه أثناء حساب التكلفة");
				return true;
			}
		});
		
		edittext53.addTextChangedListener(new TextWatcher() {
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
		
		edittext42p.addTextChangedListener(new TextWatcher() {
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
		linear722.setVisibility(View.GONE);
		linear120.setVisibility(View.GONE);
		linear57p.setVisibility(View.GONE);
		/*
الأعلانات 
*/
		
		{
			AdRequest adRequest = new AdRequest.Builder().build();
		}
		/*
التعليقات علي الابعاد 
*/
		textview666.setVisibility(View.GONE);
		textview668.setVisibility(View.GONE);
		textview55.setVisibility(View.GONE);
		/*
المقارنة 
*/
		edittext444.setVisibility(View.GONE);
	}
	
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		if (adview1 != null) {
			adview1.destroy();
		}
	}
	
	@Override
	public void onPause() {
		super.onPause();
		if (adview1 != null) {
			adview1.pause();
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (adview1 != null) {
			adview1.resume();
		}
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
		d_textview14.setVisibility(View.GONE);
		d_linear161.setVisibility(View.GONE);
		d_textview11.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* عرض الحائط أو سمك الحائط ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.١٢ م \"");
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
اجمالي مكعب الحوائط
*/
		final TextView d_textview15 = dynamic_wall_linear.findViewById(R.id.d_textview15);
		final LinearLayout d_linear758 = dynamic_wall_linear.findViewById(R.id.d_linear758);
		final EditText d_edittext20 = dynamic_wall_linear.findViewById(R.id.d_edittext20);
		d_edittext20.setSingleLine(true);
		d_edittext20.setFocusableInTouchMode(true);
		d_textview15.setVisibility(View.GONE);
		d_linear758.setVisibility(View.GONE);
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
		d_textview55.setText("المسطح الأجمالي لبياض جميع الحوائط من هذا النموذج أقل من المسطح الاجمالى لجميع الفتحات");
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
		d_textview6.setText("مسطح البياض للحائط الواحد من هذا النموذج بدون خصم الفتحات ( م٢ )");
		d_textview7.setText("اجمالي المسطحات لبياض جميع الحوائط من هذا النموذج بدون خصم الفتحات ( م٢ )");
		d_textview511.setText("م٢");
		d_textview9.setText("المسطح الأجمالي لبياض جميع الحوائط من هذا النموذج بعد خصم الفتحات ( م٢ )");
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
				if (((d_edittext1.getText().toString().equals("") || d_edittext1.getText().toString().equals(".")) || (d_edittext1.getText().toString().equals("-") || (Double.parseDouble(d_edittext1.getText().toString()) < 0))) || ((d_edittext2.getText().toString().equals("") || d_edittext2.getText().toString().equals(".")) || (d_edittext2.getText().toString().equals("-") || (Double.parseDouble(d_edittext2.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((d_edittext3.getText().toString().equals("") || d_edittext3.getText().toString().equals(".")) || (d_edittext3.getText().toString().equals("-") || (Double.parseDouble(d_edittext3.getText().toString()) < 0))) {
						d_edittext3.setText(String.valueOf(1));
					}
					d_edittext4.setText(String.valueOf(Double.parseDouble(d_edittext1.getText().toString()) * Double.parseDouble(d_edittext2.getText().toString())));
					d_edittext5.setText(String.valueOf((Double.parseDouble(d_edittext1.getText().toString()) * Double.parseDouble(d_edittext2.getText().toString())) * Double.parseDouble(d_edittext3.getText().toString())));
					d_edittext4.setTextColor(0xFF000000);
					d_edittext5.setTextColor(0xFF000000);
					d_edittext444.setText(String.valueOf(Double.parseDouble(d_edittext1.getText().toString()) * Double.parseDouble(d_edittext2.getText().toString())));
					d_edittext444.setTextColor(0xFF000000);
				}
			}
		});
		d_edittext4.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		d_add_dynamic_hole.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				/*
اظهار linear اجمالي الفتحات
*/
				d_linear722.setVisibility(View.VISIBLE);
				d_linear74.setVisibility(View.GONE);
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
				linear152d.setVisibility(View.VISIBLE);
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
				textview666ad.setText("من فضلك أعد مراجعة طول الفتحة حيث ان طول الفتحة أكبر من طول الحائط وهذا غير منطقي وغير هندسي");
				textview667bd.setText("من فضلك أعد مراجعة عرض الفتحة حيث ان عرض الفتحة أكبر من عرض أو سمك الحائط وهذا غير منطقي وغير هندسي");
				textview668cd.setText("من فضلك أعد مراجعة ارتفاع الفتحة حيث ان ارتفاع الفتحة أكبر من ارتفاع الحائط وهذا غير منطقي وغير هندسي");
				textview669dd.setText("من فضلك راجع الأبعاد وعدد الفتحات حيث ان اجمالي مسطح الفتحات في الحائط الواحد أكبر من مسطح الحائط");
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
				textview6d.setText("* عدد الفتحات من نفس النموذج والأبعاد بالحائط الواحد");
				textview7d.setText("مسطح الفتحة الواحدة ( م٢ )");
				textview20d.setText("م٢");
				textview8d.setText("مسطح نموذج الفتحة بعد الضرب ف نسبة احتساب الفتحة ( م٢ )");
				textview21d.setText("م٢");
				textview9d.setText("مسطح الفتحات من هذا النموذج بالحائط الواحد ( م٢ )");
				textview22d.setText("م٢");
				textview10d.setText("مسطح الفتحات من هذا النموذج بكل الحوائط التي نفس النموذج ( م٢ )");
				textview23d.setText("م٢");
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
				edittext10d.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String edittext10dnn = _param1.toString();
										
edittext10d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext11d.addTextChangedListener(new TextWatcher() {
								@Override
								public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
										final String edittext11dnn = _param1.toString();
										
edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
						if ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0)))) || (((d_edittext1.getText().toString().equals("") || d_edittext1.getText().toString().equals(".")) || (d_edittext1.getText().toString().equals("-") || (Double.parseDouble(d_edittext1.getText().toString()) < 0))) || ((d_edittext2.getText().toString().equals("") || d_edittext2.getText().toString().equals(".")) || (d_edittext2.getText().toString().equals("-") || (Double.parseDouble(d_edittext2.getText().toString()) < 0))))) {
							SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
						}
						else {
							edittext8dd.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString())));
							edittext9dd.setText(String.valueOf(Double.parseDouble(edittext9d.getText().toString())));
							if ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) {
								edittext11d.setText(String.valueOf(1));
							}
							if (Double.parseDouble(edittext8d.getText().toString()) > Double.parseDouble(d_edittext1.getText().toString())) {
								textview666ad.setVisibility(View.VISIBLE);
								if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(d_edittext2.getText().toString())) {
									textview668cd.setVisibility(View.VISIBLE);
								}
								else {
									textview668cd.setVisibility(View.GONE);
								}
							}
							else {
								textview666ad.setVisibility(View.GONE);
								if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(d_edittext2.getText().toString())) {
									textview668cd.setVisibility(View.VISIBLE);
								}
								else {
									textview668cd.setVisibility(View.GONE);
									if ((edittext10d.getText().toString().equals("") || edittext10d.getText().toString().equals(".")) || (edittext10d.getText().toString().equals("-") || (Double.parseDouble(edittext10d.getText().toString()) < 0))) {
										edittext10d.setText(String.valueOf(1));
									}
									edittext12d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())));
									edittext13d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * Double.parseDouble(edittext10d.getText().toString()))));
									edittext12d.setTextColor(0xFF000000);
									edittext13d.setTextColor(0xFF000000);
									if (((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * Double.parseDouble(edittext11d.getText().toString())) > (Double.parseDouble(d_edittext1.getText().toString()) * Double.parseDouble(d_edittext2.getText().toString()))) {
										textview669dd.setVisibility(View.VISIBLE);
									}
									else {
										textview669dd.setVisibility(View.GONE);
										if ((d_edittext3.getText().toString().equals("") || d_edittext3.getText().toString().equals(".")) || (d_edittext3.getText().toString().equals("-") || (Double.parseDouble(d_edittext3.getText().toString()) < 0))) {
											d_edittext3.setText(String.valueOf(1));
										}
										edittext14d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * (Double.parseDouble(edittext10d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString())))));
										edittext15d.setText(String.valueOf((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * ((Double.parseDouble(edittext10d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString())) * Double.parseDouble(d_edittext3.getText().toString()))));
										edittext14d.setTextColor(0xFF000000);
										edittext15d.setTextColor(0xFF000000);
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
							
							
						temp1 = 0;
						 for(int i=0; i<d_add_dynamic_hole_linear.getChildCount(); ++i) { 
							 View child=d_add_dynamic_hole_linear.getChildAt(i); 
							TextView tempo1 =child.findViewById(R.id.edittext15d);
							temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
						}
						d_edittext16.setText(String.valueOf(temp1));
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
						if (Double.parseDouble(d_edittext1.getText().toString()) < temp1a) {
							d_textview666.setVisibility(View.VISIBLE);
							d_edittext4.setText(String.valueOf(00.00));
							d_edittext4.setTextColor(0xFFE91E63);
							d_edittext5.setText(String.valueOf(00.00));
							d_edittext5.setTextColor(0xFFE91E63);
							if (Double.parseDouble(d_edittext2.getText().toString()) < temp2b) {
								d_textview668.setVisibility(View.VISIBLE);
							}
							else {
								d_textview668.setVisibility(View.GONE);
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
							}
							else {
								d_textview668.setVisibility(View.GONE);
								d_edittext4.setText(String.valueOf(Double.parseDouble(d_edittext1.getText().toString()) * Double.parseDouble(d_edittext2.getText().toString())));
								d_edittext5.setText(String.valueOf((Double.parseDouble(d_edittext1.getText().toString()) * Double.parseDouble(d_edittext2.getText().toString())) * Double.parseDouble(d_edittext3.getText().toString())));
								d_edittext4.setTextColor(0xFF000000);
								d_edittext5.setTextColor(0xFF000000);
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
					d_edittext17.setText(String.valueOf(Double.parseDouble(d_edittext5.getText().toString()) - Double.parseDouble(s.toString())));
					d_textview55.setVisibility(View.GONE);
				}
				else {
					d_linear722.setVisibility(View.VISIBLE);
					if (Double.parseDouble(d_edittext5.getText().toString()) == 00.00d) {
						d_edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
						d_textview55.setVisibility(View.VISIBLE);
					}
					else {
						if ((00.00d < Double.parseDouble(d_edittext5.getText().toString())) && (Double.parseDouble(d_edittext5.getText().toString()) < Double.parseDouble(s.toString()))) {
							SketchwareUtil.showMessage(getApplicationContext(), "اجمالي مسطح كل الفتحات أكبر من اجمالي مسطح الحوائط وهذا غير منطقي\nبرجاء اعادة مراجعة المدخلات");
							d_edittext17.setText(String.valueOf(Double.parseDouble("00.00")));
							d_edittext17.setTextColor(0xFFE91E63);
							d_textview55.setVisibility(View.VISIBLE);
						}
						else {
							d_edittext17.setText(String.valueOf(Double.parseDouble(d_edittext5.getText().toString()) - Double.parseDouble(s.toString())));
							d_edittext17.setTextColor(0xFF000000);
							d_textview55.setVisibility(View.GONE);
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
				temp = 0;
				 for(int i=0; i<add_dynamic_wall_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_wall_linear.getChildAt(i); 
					TextView tempo =child.findViewById(R.id.d_edittext17);
					temp = temp + Double.parseDouble(tempo.getText().toString());
				}
				edittext18.setText(String.valueOf(temp));
			} });
		/*
حذف مباني حائط
*/
		d_close_wall.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_wall_linear);
				/*
إجمالي كميات المباني الدينامك بعد عملية الحذف م٢
*/
				temp = 0;
				 for(int i=0; i<add_dynamic_wall_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_wall_linear.getChildAt(i); 
					TextView tempo =child.findViewById(R.id.d_edittext17);
					temp = temp + Double.parseDouble(tempo.getText().toString());
				}
				edittext18.setText(String.valueOf(temp));
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
		PrintHelper printHelper = new PrintHelper(ToipccPlasteringsActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
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
		linear152d.setVisibility(View.VISIBLE);
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
		textview666ad.setText("من فضلك أعد مراجعة طول الفتحة حيث ان طول الفتحة أكبر من طول الحائط وهذا غير منطقي وغير هندسي");
		textview667bd.setText("من فضلك أعد مراجعة عرض الفتحة حيث ان عرض الفتحة أكبر من عرض أو سمك الحائط وهذا غير منطقي وغير هندسي");
		textview668cd.setText("من فضلك أعد مراجعة ارتفاع الفتحة حيث ان ارتفاع الفتحة أكبر من ارتفاع الحائط وهذا غير منطقي وغير هندسي");
		textview669dd.setText("من فضلك راجع الأبعاد وعدد الفتحات حيث ان اجمالي مسطح الفتحات في الحائط الواحد أكبر من مسطح الحائط");
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
		textview6d.setText("* عدد الفتحات من نفس النموذج والأبعاد بالحائط الواحد");
		textview7d.setText("مسطح الفتحة الواحدة ( م٢ )");
		textview20d.setText("م٢");
		textview8d.setText("مسطح نموذج الفتحة بعد الضرب ف نسبة احتساب الفتحة ( م٢ )");
		textview21d.setText("م٢");
		textview9d.setText("مسطح الفتحات من هذا النموذج بالحائط الواحد ( م٢ )");
		textview22d.setText("م٢");
		textview10d.setText("مسطح الفتحات من هذا النموذج بكل الحوائط التي نفس النموذج ( م٢ )");
		textview23d.setText("م٢");
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
		edittext10d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext10dnn = _param1.toString();
								
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
		edittext11d.addTextChangedListener(new TextWatcher() {
						@Override
						public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
								final String edittext11dnn = _param1.toString();
								
edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				if ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0)))) || (((edittext1.getText().toString().equals("") || edittext1.getText().toString().equals(".")) || (edittext1.getText().toString().equals("-") || (Double.parseDouble(edittext1.getText().toString()) < 0))) || ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					edittext8dd.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString())));
					edittext9dd.setText(String.valueOf(Double.parseDouble(edittext9d.getText().toString())));
					if ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) {
						edittext11d.setText(String.valueOf(1));
					}
					if (Double.parseDouble(edittext8d.getText().toString()) > Double.parseDouble(edittext1.getText().toString())) {
						textview666ad.setVisibility(View.VISIBLE);
						if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(edittext2.getText().toString())) {
							textview668cd.setVisibility(View.VISIBLE);
						}
						else {
							textview668cd.setVisibility(View.GONE);
						}
					}
					else {
						textview666ad.setVisibility(View.GONE);
						if (Double.parseDouble(edittext9d.getText().toString()) > Double.parseDouble(edittext2.getText().toString())) {
							textview668cd.setVisibility(View.VISIBLE);
						}
						else {
							textview668cd.setVisibility(View.GONE);
							if ((edittext10d.getText().toString().equals("") || edittext10d.getText().toString().equals(".")) || (edittext10d.getText().toString().equals("-") || (Double.parseDouble(edittext10d.getText().toString()) < 0))) {
								edittext10d.setText(String.valueOf(1));
							}
							edittext12d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())));
							edittext13d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * Double.parseDouble(edittext10d.getText().toString()))));
							edittext12d.setTextColor(0xFF000000);
							edittext13d.setTextColor(0xFF000000);
							if (((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * Double.parseDouble(edittext11d.getText().toString())) > (Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext2.getText().toString()))) {
								textview669dd.setVisibility(View.VISIBLE);
							}
							else {
								textview669dd.setVisibility(View.GONE);
								if ((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) {
									edittext3.setText(String.valueOf(1));
								}
								edittext14d.setText(String.valueOf(Double.parseDouble(edittext8d.getText().toString()) * (Double.parseDouble(edittext9d.getText().toString()) * (Double.parseDouble(edittext10d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString())))));
								edittext15d.setText(String.valueOf((Double.parseDouble(edittext8d.getText().toString()) * Double.parseDouble(edittext9d.getText().toString())) * ((Double.parseDouble(edittext10d.getText().toString()) * Double.parseDouble(edittext11d.getText().toString())) * Double.parseDouble(edittext3.getText().toString()))));
								edittext14d.setTextColor(0xFF000000);
								edittext15d.setTextColor(0xFF000000);
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
					
					
				temp1 = 0;
				 for(int i=0; i<add_dynamic_hole_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext15d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext16.setText(String.valueOf(temp1));
			} });
		/*
حذف فتحة
*/
		close_hole_d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_removeView(dynamic_hole_linear);
				/*
إجمالي المسطحات بعد عملية الحذف
*/
				temp1 = 0;
				 for(int i=0; i<add_dynamic_hole_linear.getChildCount(); ++i) { 
					 View child=add_dynamic_hole_linear.getChildAt(i); 
					TextView tempo1 =child.findViewById(R.id.edittext15d);
					temp1 = temp1 + Double.parseDouble(tempo1.getText().toString());
				}
				edittext16.setText(String.valueOf(temp1));
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
				if (Double.parseDouble(edittext1.getText().toString()) < temp1a) {
					textview666.setVisibility(View.VISIBLE);
					edittext4.setText(String.valueOf(00.00));
					edittext4.setTextColor(0xFFE91E63);
					edittext5.setText(String.valueOf(00.00));
					edittext5.setTextColor(0xFFE91E63);
					if (Double.parseDouble(edittext2.getText().toString()) < temp2b) {
						textview668.setVisibility(View.VISIBLE);
					}
					else {
						textview668.setVisibility(View.GONE);
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
					}
					else {
						textview668.setVisibility(View.GONE);
						edittext4.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext2.getText().toString())));
						edittext4.setTextColor(0xFF000000);
						edittext5.setText(String.valueOf(Double.parseDouble(edittext1.getText().toString()) * (Double.parseDouble(edittext2.getText().toString()) * Double.parseDouble(edittext3.getText().toString()))));
						edittext5.setTextColor(0xFF000000);
					}
				}
			} });
	}
	
}
