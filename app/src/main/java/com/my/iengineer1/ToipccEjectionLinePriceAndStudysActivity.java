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
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.*;
import org.json.*;
import androidx.print.PrintHelper;


public class ToipccEjectionLinePriceAndStudysActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview899;
	private LinearLayout linear176;
	private TextView textview1;
	private TextView textview900;
	private EditText edittext1;
	private EditText edittext14;
	private EditText edittext15;
	private EditText edittext16;
	private EditText edittext17;
	private EditText edittext18;
	private EditText edittext20;
	private EditText edittext21;
	private EditText edittext138;
	private EditText edittext19;
	private EditText edittext22;
	private EditText edittext23;
	private EditText edittext24;
	private EditText edittext25;
	private EditText edittext26;
	private EditText edittext27;
	private EditText edittext28;
	private TextView textview811;
	private EditText edittext29;
	private TextView textview810;
	private LinearLayout linear118;
	private TextView textview851;
	private Button button68;
	private LinearLayout linear390;
	private TextView textview850;
	private LinearLayout linear152;
	private TextView textview1036;
	private Button button69;
	private LinearLayout linear392;
	private TextView textview849;
	private Button button70;
	private LinearLayout linear395;
	private TextView textview848;
	private Button button71;
	private LinearLayout linear398;
	private TextView textview847;
	private Button button72;
	private LinearLayout linear401;
	private TextView textview846;
	private Button button73;
	private LinearLayout linear404;
	private TextView textview14;
	private LinearLayout linear418;
	private TextView textview852;
	private LinearLayout linear408;
	private LinearLayout linear417;
	private LinearLayout linear407;
	private TextView textview519;
	private TextView textview853;
	private Button button88;
	private LinearLayout linear577;
	private TextView textview1159;
	private Button button103;
	private LinearLayout linear589;
	private TextView textview1164;
	private Button button105;
	private LinearLayout linear597;
	private TextView textview1182;
	private Button button118;
	private LinearLayout linear644;
	private TextView textview1229;
	private Button button119;
	private LinearLayout linear648;
	private TextView textview1230;
	private Button button107;
	private LinearLayout linear605;
	private TextView textview1189;
	private Button button110;
	private LinearLayout linear617;
	private TextView textview1199;
	private LinearLayout linear621;
	private TextView textview856;
	private LinearLayout linear419;
	private TextView textview859;
	private LinearLayout linear421;
	private TextView textview862;
	private LinearLayout linear441;
	private TextView textview872;
	private TextView textview873;
	private TextView textview1202;
	private Button button112;
	private LinearLayout linear624;
	private TextView textview889;
	private Button button113;
	private LinearLayout linear429;
	private TextView textview877;
	private Button button114;
	private LinearLayout linear444;
	private TextView textview879;
	private Button button115;
	private LinearLayout linear628;
	private TextView textview812;
	private LinearLayout linear443;
	private TextView textview554;
	private TextView textview578;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear410;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private TextView textview555;
	private TextView textview583;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private EditText edittext137;
	private TextView textview845;
	private TextView textview585;
	private TextView textview584;
	private Button button120;
	private TextView textview809;
	private TextView textview467;
	private EditText edittext31;
	private TextView textview334;
	private EditText edittext30;
	private LinearLayout linear507;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear387;
	private LinearLayout linear254;
	private LinearLayout linear391;
	private ImageView clos;
	private LinearLayout linear508;
	private TextView textview1038;
	private TextView textview813;
	private EditText edittext33;
	private TextView textview814;
	private EditText edittext32;
	private Button button1;
	private TextView textview819;
	private EditText edittext35;
	private TextView textview820;
	private EditText edittext34;
	private TextView textview629;
	private EditText edittext193;
	private TextView textview630;
	private TextView textview631;
	private LinearLayout linear509;
	private HorizontalScrollView hscroll2;
	private LinearLayout linear393;
	private LinearLayout linear411;
	private LinearLayout linear394;
	private ImageView imageview7;
	private LinearLayout linear510;
	private TextView textview1039;
	private TextView textview821;
	private EditText edittext37;
	private TextView textview822;
	private EditText edittext36;
	private Button button2;
	private TextView textview823;
	private EditText edittext39;
	private TextView textview824;
	private EditText edittext38;
	private LinearLayout linear511;
	private HorizontalScrollView hscroll3;
	private LinearLayout linear396;
	private LinearLayout linear412;
	private LinearLayout linear397;
	private ImageView imageview8;
	private LinearLayout linear512;
	private TextView textview1040;
	private TextView textview825;
	private EditText edittext41;
	private TextView textview826;
	private EditText edittext40;
	private Button button3;
	private TextView textview827;
	private EditText edittext43;
	private TextView textview828;
	private EditText edittext42;
	private LinearLayout linear513;
	private HorizontalScrollView hscroll4;
	private LinearLayout linear399;
	private LinearLayout linear413;
	private LinearLayout linear400;
	private ImageView imageview9;
	private LinearLayout linear514;
	private TextView textview1041;
	private TextView textview829;
	private EditText edittext45;
	private TextView textview830;
	private EditText edittext44;
	private Button button4;
	private TextView textview831;
	private EditText edittext47;
	private TextView textview832;
	private EditText edittext46;
	private LinearLayout linear515;
	private HorizontalScrollView hscroll5;
	private LinearLayout linear402;
	private LinearLayout linear416;
	private LinearLayout linear403;
	private ImageView imageview10;
	private LinearLayout linear516;
	private TextView textview1042;
	private TextView textview833;
	private EditText edittext49;
	private TextView textview834;
	private EditText edittext48;
	private Button button5;
	private TextView textview835;
	private EditText edittext51;
	private TextView textview836;
	private EditText edittext50;
	private LinearLayout linear517;
	private HorizontalScrollView hscroll6;
	private LinearLayout linear405;
	private LinearLayout linear415;
	private LinearLayout linear406;
	private ImageView imageview11;
	private LinearLayout linear518;
	private TextView textview1043;
	private TextView textview837;
	private EditText edittext53;
	private TextView textview838;
	private EditText edittext52;
	private Button button6;
	private TextView textview839;
	private EditText edittext55;
	private TextView textview840;
	private EditText edittext54;
	private EditText edittext56;
	private Button button7;
	private LinearLayout linear388;
	private TextView textview815;
	private EditText edittext57;
	private TextView textview841;
	private EditText edittext59;
	private TextView textview842;
	private EditText edittext58;
	private EditText edittext60;
	private Button button8;
	private LinearLayout linear409;
	private TextView textview843;
	private EditText edittext61;
	private TextView textview844;
	private LinearLayout linear578;
	private HorizontalScrollView hscroll8;
	private LinearLayout linear389;
	private ImageView imageview18;
	private LinearLayout linear580;
	private TextView textview1145;
	private TextView textview817;
	private EditText edittext63;
	private TextView textview818;
	private EditText edittext62;
	private LinearLayout linear590;
	private HorizontalScrollView hscroll10;
	private LinearLayout linear591;
	private ImageView imageview21;
	private LinearLayout linear592;
	private TextView textview1160;
	private TextView textview1161;
	private EditText edittext180;
	private TextView textview1162;
	private TextView textview1163;
	private LinearLayout linear598;
	private HorizontalScrollView hscroll11;
	private LinearLayout linear599;
	private ImageView imageview23;
	private LinearLayout linear600;
	private TextView textview1169;
	private TextView textview1170;
	private EditText edittext182;
	private TextView textview1171;
	private TextView textview1172;
	private LinearLayout linear645;
	private HorizontalScrollView hscroll12;
	private LinearLayout linear646;
	private ImageView imageview34;
	private LinearLayout linear647;
	private TextView textview1225;
	private TextView textview1226;
	private EditText edittext191;
	private TextView textview1227;
	private TextView textview1228;
	private LinearLayout linear649;
	private HorizontalScrollView hscroll13;
	private LinearLayout linear650;
	private ImageView imageview35;
	private LinearLayout linear651;
	private TextView textview1231;
	private TextView textview1232;
	private EditText edittext192;
	private TextView textview1233;
	private TextView textview1234;
	private LinearLayout linear606;
	private HorizontalScrollView hscroll14;
	private LinearLayout linear607;
	private ImageView imageview25;
	private LinearLayout linear608;
	private TextView textview1177;
	private TextView textview1178;
	private EditText edittext184;
	private TextView textview1179;
	private TextView textview1180;
	private LinearLayout linear618;
	private HorizontalScrollView hscroll15;
	private LinearLayout linear619;
	private ImageView imageview28;
	private LinearLayout linear620;
	private TextView textview1195;
	private TextView textview1196;
	private EditText edittext187;
	private TextView textview1197;
	private TextView textview1198;
	private EditText edittext188;
	private Button button111;
	private LinearLayout linear622;
	private TextView textview1200;
	private EditText edittext189;
	private TextView textview854;
	private EditText edittext65;
	private TextView textview855;
	private EditText edittext64;
	private EditText edittext66;
	private Button button9;
	private LinearLayout linear422;
	private TextView textview858;
	private EditText edittext67;
	private EditText edittext68;
	private TextView textview864;
	private LinearLayout linear425;
	private TextView textview863;
	private EditText edittext69;
	private LinearLayout linear625;
	private LinearLayout linear445;
	private TextView textview867;
	private LinearLayout linear440;
	private ImageView imageview29;
	private LinearLayout linear627;
	private TextView textview1203;
	private LinearLayout linear423;
	private TextView textview866;
	private LinearLayout linear426;
	private TextView textview860;
	private EditText edittext71;
	private TextView textview861;
	private EditText edittext70;
	private EditText edittext72;
	private Button button10;
	private LinearLayout linear427;
	private TextView textview865;
	private EditText edittext73;
	private EditText edittext74;
	private TextView textview888;
	private LinearLayout linear439;
	private TextView textview887;
	private EditText edittext75;
	private LinearLayout linear629;
	private HorizontalScrollView hscroll16;
	private LinearLayout linear428;
	private TextView textview871;
	private LinearLayout linear442;
	private ImageView imageview30;
	private LinearLayout linear631;
	private TextView textview1204;
	private TextView textview868;
	private EditText edittext77;
	private TextView textview869;
	private EditText edittext76;
	private EditText edittext78;
	private TextView textview890;
	private LinearLayout linear430;
	private TextView textview870;
	private EditText edittext79;
	private LinearLayout linear633;
	private HorizontalScrollView hscroll18;
	private LinearLayout linear431;
	private TextView textview892;
	private LinearLayout linear432;
	private ImageView imageview31;
	private LinearLayout linear635;
	private TextView textview1205;
	private TextView textview874;
	private EditText edittext81;
	private TextView textview875;
	private EditText edittext80;
	private EditText edittext82;
	private Button button60;
	private TextView textview876;
	private LinearLayout linear433;
	private TextView textview878;
	private EditText edittext83;
	private TextView textview891;
	private LinearLayout linear637;
	private HorizontalScrollView hscroll19;
	private LinearLayout linear434;
	private TextView textview882;
	private LinearLayout linear435;
	private ImageView imageview32;
	private LinearLayout linear639;
	private TextView textview1206;
	private TextView textview880;
	private EditText edittext85;
	private TextView textview881;
	private EditText edittext84;
	private EditText edittext86;
	private Button button13;
	private LinearLayout linear436;
	private TextView textview883;
	private EditText edittext87;
	private EditText edittext88;
	private TextView textview886;
	private LinearLayout linear438;
	private TextView textview885;
	private EditText edittext89;
	
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	private AlertDialog.Builder Dialog;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_ejection_line_price_and_studys);
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
		textview899 = findViewById(R.id.textview899);
		linear176 = findViewById(R.id.linear176);
		textview1 = findViewById(R.id.textview1);
		textview900 = findViewById(R.id.textview900);
		edittext1 = findViewById(R.id.edittext1);
		edittext14 = findViewById(R.id.edittext14);
		edittext15 = findViewById(R.id.edittext15);
		edittext16 = findViewById(R.id.edittext16);
		edittext17 = findViewById(R.id.edittext17);
		edittext18 = findViewById(R.id.edittext18);
		edittext20 = findViewById(R.id.edittext20);
		edittext21 = findViewById(R.id.edittext21);
		edittext138 = findViewById(R.id.edittext138);
		edittext19 = findViewById(R.id.edittext19);
		edittext22 = findViewById(R.id.edittext22);
		edittext23 = findViewById(R.id.edittext23);
		edittext24 = findViewById(R.id.edittext24);
		edittext25 = findViewById(R.id.edittext25);
		edittext26 = findViewById(R.id.edittext26);
		edittext27 = findViewById(R.id.edittext27);
		edittext28 = findViewById(R.id.edittext28);
		textview811 = findViewById(R.id.textview811);
		edittext29 = findViewById(R.id.edittext29);
		textview810 = findViewById(R.id.textview810);
		linear118 = findViewById(R.id.linear118);
		textview851 = findViewById(R.id.textview851);
		button68 = findViewById(R.id.button68);
		linear390 = findViewById(R.id.linear390);
		textview850 = findViewById(R.id.textview850);
		linear152 = findViewById(R.id.linear152);
		textview1036 = findViewById(R.id.textview1036);
		button69 = findViewById(R.id.button69);
		linear392 = findViewById(R.id.linear392);
		textview849 = findViewById(R.id.textview849);
		button70 = findViewById(R.id.button70);
		linear395 = findViewById(R.id.linear395);
		textview848 = findViewById(R.id.textview848);
		button71 = findViewById(R.id.button71);
		linear398 = findViewById(R.id.linear398);
		textview847 = findViewById(R.id.textview847);
		button72 = findViewById(R.id.button72);
		linear401 = findViewById(R.id.linear401);
		textview846 = findViewById(R.id.textview846);
		button73 = findViewById(R.id.button73);
		linear404 = findViewById(R.id.linear404);
		textview14 = findViewById(R.id.textview14);
		linear418 = findViewById(R.id.linear418);
		textview852 = findViewById(R.id.textview852);
		linear408 = findViewById(R.id.linear408);
		linear417 = findViewById(R.id.linear417);
		linear407 = findViewById(R.id.linear407);
		textview519 = findViewById(R.id.textview519);
		textview853 = findViewById(R.id.textview853);
		button88 = findViewById(R.id.button88);
		linear577 = findViewById(R.id.linear577);
		textview1159 = findViewById(R.id.textview1159);
		button103 = findViewById(R.id.button103);
		linear589 = findViewById(R.id.linear589);
		textview1164 = findViewById(R.id.textview1164);
		button105 = findViewById(R.id.button105);
		linear597 = findViewById(R.id.linear597);
		textview1182 = findViewById(R.id.textview1182);
		button118 = findViewById(R.id.button118);
		linear644 = findViewById(R.id.linear644);
		textview1229 = findViewById(R.id.textview1229);
		button119 = findViewById(R.id.button119);
		linear648 = findViewById(R.id.linear648);
		textview1230 = findViewById(R.id.textview1230);
		button107 = findViewById(R.id.button107);
		linear605 = findViewById(R.id.linear605);
		textview1189 = findViewById(R.id.textview1189);
		button110 = findViewById(R.id.button110);
		linear617 = findViewById(R.id.linear617);
		textview1199 = findViewById(R.id.textview1199);
		linear621 = findViewById(R.id.linear621);
		textview856 = findViewById(R.id.textview856);
		linear419 = findViewById(R.id.linear419);
		textview859 = findViewById(R.id.textview859);
		linear421 = findViewById(R.id.linear421);
		textview862 = findViewById(R.id.textview862);
		linear441 = findViewById(R.id.linear441);
		textview872 = findViewById(R.id.textview872);
		textview873 = findViewById(R.id.textview873);
		textview1202 = findViewById(R.id.textview1202);
		button112 = findViewById(R.id.button112);
		linear624 = findViewById(R.id.linear624);
		textview889 = findViewById(R.id.textview889);
		button113 = findViewById(R.id.button113);
		linear429 = findViewById(R.id.linear429);
		textview877 = findViewById(R.id.textview877);
		button114 = findViewById(R.id.button114);
		linear444 = findViewById(R.id.linear444);
		textview879 = findViewById(R.id.textview879);
		button115 = findViewById(R.id.button115);
		linear628 = findViewById(R.id.linear628);
		textview812 = findViewById(R.id.textview812);
		linear443 = findViewById(R.id.linear443);
		textview554 = findViewById(R.id.textview554);
		textview578 = findViewById(R.id.textview578);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear410 = findViewById(R.id.linear410);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		textview583 = findViewById(R.id.textview583);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		edittext137 = findViewById(R.id.edittext137);
		textview845 = findViewById(R.id.textview845);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		button120 = findViewById(R.id.button120);
		textview809 = findViewById(R.id.textview809);
		textview467 = findViewById(R.id.textview467);
		edittext31 = findViewById(R.id.edittext31);
		textview334 = findViewById(R.id.textview334);
		edittext30 = findViewById(R.id.edittext30);
		linear507 = findViewById(R.id.linear507);
		hscroll1 = findViewById(R.id.hscroll1);
		linear387 = findViewById(R.id.linear387);
		linear254 = findViewById(R.id.linear254);
		linear391 = findViewById(R.id.linear391);
		clos = findViewById(R.id.clos);
		linear508 = findViewById(R.id.linear508);
		textview1038 = findViewById(R.id.textview1038);
		textview813 = findViewById(R.id.textview813);
		edittext33 = findViewById(R.id.edittext33);
		textview814 = findViewById(R.id.textview814);
		edittext32 = findViewById(R.id.edittext32);
		button1 = findViewById(R.id.button1);
		textview819 = findViewById(R.id.textview819);
		edittext35 = findViewById(R.id.edittext35);
		textview820 = findViewById(R.id.textview820);
		edittext34 = findViewById(R.id.edittext34);
		textview629 = findViewById(R.id.textview629);
		edittext193 = findViewById(R.id.edittext193);
		textview630 = findViewById(R.id.textview630);
		textview631 = findViewById(R.id.textview631);
		linear509 = findViewById(R.id.linear509);
		hscroll2 = findViewById(R.id.hscroll2);
		linear393 = findViewById(R.id.linear393);
		linear411 = findViewById(R.id.linear411);
		linear394 = findViewById(R.id.linear394);
		imageview7 = findViewById(R.id.imageview7);
		linear510 = findViewById(R.id.linear510);
		textview1039 = findViewById(R.id.textview1039);
		textview821 = findViewById(R.id.textview821);
		edittext37 = findViewById(R.id.edittext37);
		textview822 = findViewById(R.id.textview822);
		edittext36 = findViewById(R.id.edittext36);
		button2 = findViewById(R.id.button2);
		textview823 = findViewById(R.id.textview823);
		edittext39 = findViewById(R.id.edittext39);
		textview824 = findViewById(R.id.textview824);
		edittext38 = findViewById(R.id.edittext38);
		linear511 = findViewById(R.id.linear511);
		hscroll3 = findViewById(R.id.hscroll3);
		linear396 = findViewById(R.id.linear396);
		linear412 = findViewById(R.id.linear412);
		linear397 = findViewById(R.id.linear397);
		imageview8 = findViewById(R.id.imageview8);
		linear512 = findViewById(R.id.linear512);
		textview1040 = findViewById(R.id.textview1040);
		textview825 = findViewById(R.id.textview825);
		edittext41 = findViewById(R.id.edittext41);
		textview826 = findViewById(R.id.textview826);
		edittext40 = findViewById(R.id.edittext40);
		button3 = findViewById(R.id.button3);
		textview827 = findViewById(R.id.textview827);
		edittext43 = findViewById(R.id.edittext43);
		textview828 = findViewById(R.id.textview828);
		edittext42 = findViewById(R.id.edittext42);
		linear513 = findViewById(R.id.linear513);
		hscroll4 = findViewById(R.id.hscroll4);
		linear399 = findViewById(R.id.linear399);
		linear413 = findViewById(R.id.linear413);
		linear400 = findViewById(R.id.linear400);
		imageview9 = findViewById(R.id.imageview9);
		linear514 = findViewById(R.id.linear514);
		textview1041 = findViewById(R.id.textview1041);
		textview829 = findViewById(R.id.textview829);
		edittext45 = findViewById(R.id.edittext45);
		textview830 = findViewById(R.id.textview830);
		edittext44 = findViewById(R.id.edittext44);
		button4 = findViewById(R.id.button4);
		textview831 = findViewById(R.id.textview831);
		edittext47 = findViewById(R.id.edittext47);
		textview832 = findViewById(R.id.textview832);
		edittext46 = findViewById(R.id.edittext46);
		linear515 = findViewById(R.id.linear515);
		hscroll5 = findViewById(R.id.hscroll5);
		linear402 = findViewById(R.id.linear402);
		linear416 = findViewById(R.id.linear416);
		linear403 = findViewById(R.id.linear403);
		imageview10 = findViewById(R.id.imageview10);
		linear516 = findViewById(R.id.linear516);
		textview1042 = findViewById(R.id.textview1042);
		textview833 = findViewById(R.id.textview833);
		edittext49 = findViewById(R.id.edittext49);
		textview834 = findViewById(R.id.textview834);
		edittext48 = findViewById(R.id.edittext48);
		button5 = findViewById(R.id.button5);
		textview835 = findViewById(R.id.textview835);
		edittext51 = findViewById(R.id.edittext51);
		textview836 = findViewById(R.id.textview836);
		edittext50 = findViewById(R.id.edittext50);
		linear517 = findViewById(R.id.linear517);
		hscroll6 = findViewById(R.id.hscroll6);
		linear405 = findViewById(R.id.linear405);
		linear415 = findViewById(R.id.linear415);
		linear406 = findViewById(R.id.linear406);
		imageview11 = findViewById(R.id.imageview11);
		linear518 = findViewById(R.id.linear518);
		textview1043 = findViewById(R.id.textview1043);
		textview837 = findViewById(R.id.textview837);
		edittext53 = findViewById(R.id.edittext53);
		textview838 = findViewById(R.id.textview838);
		edittext52 = findViewById(R.id.edittext52);
		button6 = findViewById(R.id.button6);
		textview839 = findViewById(R.id.textview839);
		edittext55 = findViewById(R.id.edittext55);
		textview840 = findViewById(R.id.textview840);
		edittext54 = findViewById(R.id.edittext54);
		edittext56 = findViewById(R.id.edittext56);
		button7 = findViewById(R.id.button7);
		linear388 = findViewById(R.id.linear388);
		textview815 = findViewById(R.id.textview815);
		edittext57 = findViewById(R.id.edittext57);
		textview841 = findViewById(R.id.textview841);
		edittext59 = findViewById(R.id.edittext59);
		textview842 = findViewById(R.id.textview842);
		edittext58 = findViewById(R.id.edittext58);
		edittext60 = findViewById(R.id.edittext60);
		button8 = findViewById(R.id.button8);
		linear409 = findViewById(R.id.linear409);
		textview843 = findViewById(R.id.textview843);
		edittext61 = findViewById(R.id.edittext61);
		textview844 = findViewById(R.id.textview844);
		linear578 = findViewById(R.id.linear578);
		hscroll8 = findViewById(R.id.hscroll8);
		linear389 = findViewById(R.id.linear389);
		imageview18 = findViewById(R.id.imageview18);
		linear580 = findViewById(R.id.linear580);
		textview1145 = findViewById(R.id.textview1145);
		textview817 = findViewById(R.id.textview817);
		edittext63 = findViewById(R.id.edittext63);
		textview818 = findViewById(R.id.textview818);
		edittext62 = findViewById(R.id.edittext62);
		linear590 = findViewById(R.id.linear590);
		hscroll10 = findViewById(R.id.hscroll10);
		linear591 = findViewById(R.id.linear591);
		imageview21 = findViewById(R.id.imageview21);
		linear592 = findViewById(R.id.linear592);
		textview1160 = findViewById(R.id.textview1160);
		textview1161 = findViewById(R.id.textview1161);
		edittext180 = findViewById(R.id.edittext180);
		textview1162 = findViewById(R.id.textview1162);
		textview1163 = findViewById(R.id.textview1163);
		linear598 = findViewById(R.id.linear598);
		hscroll11 = findViewById(R.id.hscroll11);
		linear599 = findViewById(R.id.linear599);
		imageview23 = findViewById(R.id.imageview23);
		linear600 = findViewById(R.id.linear600);
		textview1169 = findViewById(R.id.textview1169);
		textview1170 = findViewById(R.id.textview1170);
		edittext182 = findViewById(R.id.edittext182);
		textview1171 = findViewById(R.id.textview1171);
		textview1172 = findViewById(R.id.textview1172);
		linear645 = findViewById(R.id.linear645);
		hscroll12 = findViewById(R.id.hscroll12);
		linear646 = findViewById(R.id.linear646);
		imageview34 = findViewById(R.id.imageview34);
		linear647 = findViewById(R.id.linear647);
		textview1225 = findViewById(R.id.textview1225);
		textview1226 = findViewById(R.id.textview1226);
		edittext191 = findViewById(R.id.edittext191);
		textview1227 = findViewById(R.id.textview1227);
		textview1228 = findViewById(R.id.textview1228);
		linear649 = findViewById(R.id.linear649);
		hscroll13 = findViewById(R.id.hscroll13);
		linear650 = findViewById(R.id.linear650);
		imageview35 = findViewById(R.id.imageview35);
		linear651 = findViewById(R.id.linear651);
		textview1231 = findViewById(R.id.textview1231);
		textview1232 = findViewById(R.id.textview1232);
		edittext192 = findViewById(R.id.edittext192);
		textview1233 = findViewById(R.id.textview1233);
		textview1234 = findViewById(R.id.textview1234);
		linear606 = findViewById(R.id.linear606);
		hscroll14 = findViewById(R.id.hscroll14);
		linear607 = findViewById(R.id.linear607);
		imageview25 = findViewById(R.id.imageview25);
		linear608 = findViewById(R.id.linear608);
		textview1177 = findViewById(R.id.textview1177);
		textview1178 = findViewById(R.id.textview1178);
		edittext184 = findViewById(R.id.edittext184);
		textview1179 = findViewById(R.id.textview1179);
		textview1180 = findViewById(R.id.textview1180);
		linear618 = findViewById(R.id.linear618);
		hscroll15 = findViewById(R.id.hscroll15);
		linear619 = findViewById(R.id.linear619);
		imageview28 = findViewById(R.id.imageview28);
		linear620 = findViewById(R.id.linear620);
		textview1195 = findViewById(R.id.textview1195);
		textview1196 = findViewById(R.id.textview1196);
		edittext187 = findViewById(R.id.edittext187);
		textview1197 = findViewById(R.id.textview1197);
		textview1198 = findViewById(R.id.textview1198);
		edittext188 = findViewById(R.id.edittext188);
		button111 = findViewById(R.id.button111);
		linear622 = findViewById(R.id.linear622);
		textview1200 = findViewById(R.id.textview1200);
		edittext189 = findViewById(R.id.edittext189);
		textview854 = findViewById(R.id.textview854);
		edittext65 = findViewById(R.id.edittext65);
		textview855 = findViewById(R.id.textview855);
		edittext64 = findViewById(R.id.edittext64);
		edittext66 = findViewById(R.id.edittext66);
		button9 = findViewById(R.id.button9);
		linear422 = findViewById(R.id.linear422);
		textview858 = findViewById(R.id.textview858);
		edittext67 = findViewById(R.id.edittext67);
		edittext68 = findViewById(R.id.edittext68);
		textview864 = findViewById(R.id.textview864);
		linear425 = findViewById(R.id.linear425);
		textview863 = findViewById(R.id.textview863);
		edittext69 = findViewById(R.id.edittext69);
		linear625 = findViewById(R.id.linear625);
		linear445 = findViewById(R.id.linear445);
		textview867 = findViewById(R.id.textview867);
		linear440 = findViewById(R.id.linear440);
		imageview29 = findViewById(R.id.imageview29);
		linear627 = findViewById(R.id.linear627);
		textview1203 = findViewById(R.id.textview1203);
		linear423 = findViewById(R.id.linear423);
		textview866 = findViewById(R.id.textview866);
		linear426 = findViewById(R.id.linear426);
		textview860 = findViewById(R.id.textview860);
		edittext71 = findViewById(R.id.edittext71);
		textview861 = findViewById(R.id.textview861);
		edittext70 = findViewById(R.id.edittext70);
		edittext72 = findViewById(R.id.edittext72);
		button10 = findViewById(R.id.button10);
		linear427 = findViewById(R.id.linear427);
		textview865 = findViewById(R.id.textview865);
		edittext73 = findViewById(R.id.edittext73);
		edittext74 = findViewById(R.id.edittext74);
		textview888 = findViewById(R.id.textview888);
		linear439 = findViewById(R.id.linear439);
		textview887 = findViewById(R.id.textview887);
		edittext75 = findViewById(R.id.edittext75);
		linear629 = findViewById(R.id.linear629);
		hscroll16 = findViewById(R.id.hscroll16);
		linear428 = findViewById(R.id.linear428);
		textview871 = findViewById(R.id.textview871);
		linear442 = findViewById(R.id.linear442);
		imageview30 = findViewById(R.id.imageview30);
		linear631 = findViewById(R.id.linear631);
		textview1204 = findViewById(R.id.textview1204);
		textview868 = findViewById(R.id.textview868);
		edittext77 = findViewById(R.id.edittext77);
		textview869 = findViewById(R.id.textview869);
		edittext76 = findViewById(R.id.edittext76);
		edittext78 = findViewById(R.id.edittext78);
		textview890 = findViewById(R.id.textview890);
		linear430 = findViewById(R.id.linear430);
		textview870 = findViewById(R.id.textview870);
		edittext79 = findViewById(R.id.edittext79);
		linear633 = findViewById(R.id.linear633);
		hscroll18 = findViewById(R.id.hscroll18);
		linear431 = findViewById(R.id.linear431);
		textview892 = findViewById(R.id.textview892);
		linear432 = findViewById(R.id.linear432);
		imageview31 = findViewById(R.id.imageview31);
		linear635 = findViewById(R.id.linear635);
		textview1205 = findViewById(R.id.textview1205);
		textview874 = findViewById(R.id.textview874);
		edittext81 = findViewById(R.id.edittext81);
		textview875 = findViewById(R.id.textview875);
		edittext80 = findViewById(R.id.edittext80);
		edittext82 = findViewById(R.id.edittext82);
		button60 = findViewById(R.id.button60);
		textview876 = findViewById(R.id.textview876);
		linear433 = findViewById(R.id.linear433);
		textview878 = findViewById(R.id.textview878);
		edittext83 = findViewById(R.id.edittext83);
		textview891 = findViewById(R.id.textview891);
		linear637 = findViewById(R.id.linear637);
		hscroll19 = findViewById(R.id.hscroll19);
		linear434 = findViewById(R.id.linear434);
		textview882 = findViewById(R.id.textview882);
		linear435 = findViewById(R.id.linear435);
		imageview32 = findViewById(R.id.imageview32);
		linear639 = findViewById(R.id.linear639);
		textview1206 = findViewById(R.id.textview1206);
		textview880 = findViewById(R.id.textview880);
		edittext85 = findViewById(R.id.edittext85);
		textview881 = findViewById(R.id.textview881);
		edittext84 = findViewById(R.id.edittext84);
		edittext86 = findViewById(R.id.edittext86);
		button13 = findViewById(R.id.button13);
		linear436 = findViewById(R.id.linear436);
		textview883 = findViewById(R.id.textview883);
		edittext87 = findViewById(R.id.edittext87);
		edittext88 = findViewById(R.id.edittext88);
		textview886 = findViewById(R.id.textview886);
		linear438 = findViewById(R.id.linear438);
		textview885 = findViewById(R.id.textview885);
		edittext89 = findViewById(R.id.edittext89);
		internet = new RequestNetwork(this);
		Dialog = new AlertDialog.Builder(this);
		
		button68.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear390.setVisibility(View.VISIBLE);
					edittext33.setText("");
					button68.setVisibility(View.GONE);
					linear152.setVisibility(View.VISIBLE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button69.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear392.setVisibility(View.VISIBLE);
					edittext37.setText("");
					button69.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button70.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear395.setVisibility(View.VISIBLE);
					edittext41.setText("");
					button70.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button71.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear398.setVisibility(View.VISIBLE);
					edittext45.setText("");
					button71.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button72.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear401.setVisibility(View.VISIBLE);
					edittext49.setText("");
					button72.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button73.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear404.setVisibility(View.VISIBLE);
					edittext53.setText("");
					button73.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button88.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear577.setVisibility(View.VISIBLE);
					edittext63.setText("");
					button88.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button103.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear589.setVisibility(View.VISIBLE);
					edittext180.setText("");
					button103.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button105.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear597.setVisibility(View.VISIBLE);
					edittext182.setText("");
					button105.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button118.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear644.setVisibility(View.VISIBLE);
					edittext191.setText("");
					button118.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button119.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear648.setVisibility(View.VISIBLE);
					edittext192.setText("");
					button119.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button107.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear605.setVisibility(View.VISIBLE);
					edittext184.setText("");
					button107.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button110.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear617.setVisibility(View.VISIBLE);
					edittext187.setText("");
					button110.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button112.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear624.setVisibility(View.VISIBLE);
					edittext71.setText("");
					button112.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button113.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear429.setVisibility(View.VISIBLE);
					edittext77.setText("");
					button113.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button114.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear444.setVisibility(View.VISIBLE);
					edittext81.setText("");
					button114.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button115.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear628.setVisibility(View.VISIBLE);
					edittext85.setText("");
					button115.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button120.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		edittext31.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext31.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext193.setText(String.valueOf(00.00d));
				}
				else {
					if ((edittext35.getText().toString().equals("") || edittext35.getText().toString().equals(".")) || (edittext35.getText().toString().equals("-") || (Double.parseDouble(edittext35.getText().toString()) < 0))) {
						edittext193.setText(String.valueOf(Double.parseDouble(_charSeq)));
					}
					else {
						edittext193.setText(String.valueOf(Double.parseDouble(_charSeq) + Double.parseDouble(edittext35.getText().toString())));
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
		
		clos.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear390.setVisibility(View.GONE);
				edittext33.setText("");
				button68.setVisibility(View.VISIBLE);
				linear152.setVisibility(View.GONE);
			}
		});
		
		edittext33.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext33.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext35.setText("");
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext32.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				Dialog.setTitle("* نسبة ضريبة القيمة المضافة");
				Dialog.setMessage("في حالة الرغبة في ادخال القيمة المضافة كنسبة من التوريد وليس كمبلغ ثابت \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١٤ % \"");
				Dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Dialog.create().show();
				return true;
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext31.getText().toString().equals("") || edittext31.getText().toString().equals(".")) || (edittext31.getText().toString().equals("-") || (Double.parseDouble(edittext31.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext33.getText().toString().equals("") || edittext33.getText().toString().equals(".")) || (edittext33.getText().toString().equals("-") || (Double.parseDouble(edittext33.getText().toString()) < 0))) {
						edittext33.setText(String.valueOf(14));
					}
					edittext35.setText(String.valueOf(Double.parseDouble(edittext31.getText().toString()) * (Double.parseDouble(edittext33.getText().toString()) / 100)));
				}
			}
		});
		
		edittext35.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext35.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				if ((edittext31.getText().toString().equals("") || edittext31.getText().toString().equals(".")) || (edittext31.getText().toString().equals("-") || (Double.parseDouble(edittext31.getText().toString()) < 0))) {
					edittext193.setText(String.valueOf(00.00d));
				}
				else {
					if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
						edittext193.setText(String.valueOf(Double.parseDouble(edittext31.getText().toString())));
					}
					else {
						edittext193.setText(String.valueOf(Double.parseDouble(edittext31.getText().toString()) + Double.parseDouble(_charSeq)));
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
		
		edittext193.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext193.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext39.setText("");
				edittext43.setText("");
				edittext47.setText("");
				edittext51.setText("");
				edittext55.setText("");
				edittext57.setText(String.valueOf(00.00d));
				edittext57.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear392.setVisibility(View.GONE);
				edittext37.setText("");
				button69.setVisibility(View.VISIBLE);
			}
		});
		
		edittext37.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext37.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext39.setText("");
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext36.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				Dialog.setTitle("* نسبة لزوم عمل الاختبارات للهيئة");
				Dialog.setMessage("في حالة الرغبة في ادخال الاختبارات للهيئة كنسبة من التوريد وليس كمبلغ ثابت \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٢ % \"");
				Dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Dialog.create().show();
				return true;
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext31.getText().toString().equals("") || edittext31.getText().toString().equals(".")) || (edittext31.getText().toString().equals("-") || (Double.parseDouble(edittext31.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext37.getText().toString().equals("") || edittext37.getText().toString().equals(".")) || (edittext37.getText().toString().equals("-") || (Double.parseDouble(edittext37.getText().toString()) < 0))) {
						edittext37.setText(String.valueOf(2));
					}
					edittext39.setText(String.valueOf(Double.parseDouble(edittext193.getText().toString()) * (Double.parseDouble(edittext37.getText().toString()) / 100)));
				}
			}
		});
		
		edittext39.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext39.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext57.setText(String.valueOf(00.00d));
				edittext57.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear395.setVisibility(View.GONE);
				edittext41.setText("");
				button70.setVisibility(View.VISIBLE);
			}
		});
		
		edittext41.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext41.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext43.setText("");
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext40.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				Dialog.setTitle("* النسبة المطلوبة لزوم النقل الخارجي");
				Dialog.setMessage("في حالة الرغبة في ادخال النقل الخارجي كنسبة من التوريد وليس كمبلغ ثابت \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٤ % \"");
				Dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Dialog.create().show();
				return true;
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext31.getText().toString().equals("") || edittext31.getText().toString().equals(".")) || (edittext31.getText().toString().equals("-") || (Double.parseDouble(edittext31.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext41.getText().toString().equals("") || edittext41.getText().toString().equals(".")) || (edittext41.getText().toString().equals("-") || (Double.parseDouble(edittext41.getText().toString()) < 0))) {
						edittext41.setText(String.valueOf(4));
					}
					edittext43.setText(String.valueOf(Double.parseDouble(edittext193.getText().toString()) * (Double.parseDouble(edittext41.getText().toString()) / 100)));
				}
			}
		});
		
		edittext43.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext43.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext57.setText(String.valueOf(00.00d));
				edittext57.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear398.setVisibility(View.GONE);
				edittext45.setText("");
				button71.setVisibility(View.VISIBLE);
			}
		});
		
		edittext45.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext45.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext47.setText("");
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext44.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				Dialog.setTitle("* نسبة الهالك ب المواسير أثناء النقل والتعتيق");
				Dialog.setMessage("في حالة الرغبة في ادخال الهالك ب المواسير أثناء النقل والتعتيق كنسبة من التوريد وليس كمبلغ ثابت \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٣ % \"");
				Dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Dialog.create().show();
				return true;
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext31.getText().toString().equals("") || edittext31.getText().toString().equals(".")) || (edittext31.getText().toString().equals("-") || (Double.parseDouble(edittext31.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext45.getText().toString().equals("") || edittext45.getText().toString().equals(".")) || (edittext45.getText().toString().equals("-") || (Double.parseDouble(edittext45.getText().toString()) < 0))) {
						edittext45.setText(String.valueOf(3));
					}
					edittext47.setText(String.valueOf(Double.parseDouble(edittext193.getText().toString()) * (Double.parseDouble(edittext45.getText().toString()) / 100)));
				}
			}
		});
		
		edittext47.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext47.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext57.setText(String.valueOf(00.00d));
				edittext57.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear401.setVisibility(View.GONE);
				edittext49.setText("");
				button72.setVisibility(View.VISIBLE);
			}
		});
		
		edittext49.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext49.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext51.setText("");
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext48.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				Dialog.setTitle("* نسبة هالك التداخل للمواسير أثناء التركيب");
				Dialog.setMessage("في حالة الرغبة في ادخال هالك تداخل المواسير أثناء التركيب كنسبة من التوريد وليس كمبلغ ثابت \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٥ % \"");
				Dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Dialog.create().show();
				return true;
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext31.getText().toString().equals("") || edittext31.getText().toString().equals(".")) || (edittext31.getText().toString().equals("-") || (Double.parseDouble(edittext31.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext49.getText().toString().equals("") || edittext49.getText().toString().equals(".")) || (edittext49.getText().toString().equals("-") || (Double.parseDouble(edittext49.getText().toString()) < 0))) {
						edittext49.setText(String.valueOf(5));
					}
					edittext51.setText(String.valueOf(Double.parseDouble(edittext193.getText().toString()) * (Double.parseDouble(edittext49.getText().toString()) / 100)));
				}
			}
		});
		
		edittext51.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext51.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext57.setText(String.valueOf(00.00d));
				edittext57.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear404.setVisibility(View.GONE);
				edittext53.setText("");
				button73.setVisibility(View.VISIBLE);
			}
		});
		
		edittext53.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext53.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext55.setText("");
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext52.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				Dialog.setTitle("* النسبة المطلوبة لزوم النقل الداخلي");
				Dialog.setMessage("في حالة الرغبة في ادخال النقل الداخلي كنسبة من التوريد وليس كمبلغ ثابت \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٢ % \"");
				Dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Dialog.create().show();
				return true;
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext31.getText().toString().equals("") || edittext31.getText().toString().equals(".")) || (edittext31.getText().toString().equals("-") || (Double.parseDouble(edittext31.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext53.getText().toString().equals("") || edittext53.getText().toString().equals(".")) || (edittext53.getText().toString().equals("-") || (Double.parseDouble(edittext53.getText().toString()) < 0))) {
						edittext53.setText(String.valueOf(2));
					}
					edittext55.setText(String.valueOf(Double.parseDouble(edittext193.getText().toString()) * (Double.parseDouble(edittext53.getText().toString()) / 100)));
				}
			}
		});
		
		edittext55.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext55.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext57.setText(String.valueOf(00.00d));
				edittext57.setTextColor(0xFFE91E63);
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
				if ((edittext31.getText().toString().equals("") || edittext31.getText().toString().equals(".")) || (edittext31.getText().toString().equals("-") || (Double.parseDouble(edittext31.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext39.getText().toString().equals("") || edittext39.getText().toString().equals(".")) || (edittext39.getText().toString().equals("-") || (Double.parseDouble(edittext39.getText().toString()) < 0))) {
						edittext39.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext43.getText().toString().equals("") || edittext43.getText().toString().equals(".")) || (edittext43.getText().toString().equals("-") || (Double.parseDouble(edittext43.getText().toString()) < 0))) {
						edittext43.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext47.getText().toString().equals("") || edittext47.getText().toString().equals(".")) || (edittext47.getText().toString().equals("-") || (Double.parseDouble(edittext47.getText().toString()) < 0))) {
						edittext47.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext51.getText().toString().equals("") || edittext51.getText().toString().equals(".")) || (edittext51.getText().toString().equals("-") || (Double.parseDouble(edittext51.getText().toString()) < 0))) {
						edittext51.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext55.getText().toString().equals("") || edittext55.getText().toString().equals(".")) || (edittext55.getText().toString().equals("-") || (Double.parseDouble(edittext55.getText().toString()) < 0))) {
						edittext55.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					edittext57.setText(String.valueOf(((Double.parseDouble(edittext193.getText().toString()) + Double.parseDouble(edittext39.getText().toString())) + (Double.parseDouble(edittext43.getText().toString()) + Double.parseDouble(edittext47.getText().toString()))) + (Double.parseDouble(edittext51.getText().toString()) + Double.parseDouble(edittext55.getText().toString()))));
					edittext57.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext57.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext57.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				edittext61.setText(String.valueOf(00.00d));
				edittext61.setTextColor(0xFFE91E63);
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
				edittext61.setText(String.valueOf(00.00d));
				edittext61.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext58.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				Dialog.setTitle("* نسبة المصاريف الادارية والأرباح");
				Dialog.setMessage("\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١٩ % \"");
				Dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Dialog.create().show();
				return true;
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext31.getText().toString().equals("") || edittext31.getText().toString().equals(".")) || (edittext31.getText().toString().equals("-") || (Double.parseDouble(edittext31.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext59.getText().toString().equals("") || edittext59.getText().toString().equals(".")) || (edittext59.getText().toString().equals("-") || (Double.parseDouble(edittext59.getText().toString()) < 0))) {
						edittext59.setText(String.valueOf(19));
					}
					edittext61.setText(String.valueOf(Double.parseDouble(edittext57.getText().toString()) + (Double.parseDouble(edittext57.getText().toString()) * (Double.parseDouble(edittext59.getText().toString()) / 100))));
					edittext61.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext61.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext61.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				edittext69.setText(String.valueOf(Double.parseDouble(edittext61.getText().toString()) + Double.parseDouble(edittext67.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear577.setVisibility(View.GONE);
				edittext63.setText("");
				button88.setVisibility(View.VISIBLE);
			}
		});
		
		edittext63.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext63.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext189.setText(String.valueOf(00.00));
				edittext189.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear589.setVisibility(View.GONE);
				edittext180.setText("");
				button103.setVisibility(View.VISIBLE);
			}
		});
		
		edittext180.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext180.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext189.setText(String.valueOf(00.00));
				edittext189.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear597.setVisibility(View.GONE);
				edittext182.setText("");
				button105.setVisibility(View.VISIBLE);
			}
		});
		
		edittext182.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext182.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext189.setText(String.valueOf(00.00));
				edittext189.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear644.setVisibility(View.GONE);
				edittext191.setText("");
				button118.setVisibility(View.VISIBLE);
			}
		});
		
		edittext191.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext191.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext189.setText(String.valueOf(00.00));
				edittext189.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear648.setVisibility(View.GONE);
				edittext192.setText("");
				button119.setVisibility(View.VISIBLE);
			}
		});
		
		edittext192.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext192.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext189.setText(String.valueOf(00.00));
				edittext189.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear605.setVisibility(View.GONE);
				edittext184.setText("");
				button107.setVisibility(View.VISIBLE);
			}
		});
		
		edittext184.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext184.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext189.setText(String.valueOf(00.00));
				edittext189.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear617.setVisibility(View.GONE);
				edittext187.setText("");
				button110.setVisibility(View.VISIBLE);
			}
		});
		
		edittext187.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext187.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext189.setText(String.valueOf(00.00));
				edittext189.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button111.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext63.getText().toString().equals("") || edittext63.getText().toString().equals(".")) || (edittext63.getText().toString().equals("-") || (Double.parseDouble(edittext63.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext180.getText().toString().equals("") || edittext180.getText().toString().equals(".")) || (edittext180.getText().toString().equals("-") || (Double.parseDouble(edittext180.getText().toString()) < 0))) {
						edittext180.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext182.getText().toString().equals("") || edittext182.getText().toString().equals(".")) || (edittext182.getText().toString().equals("-") || (Double.parseDouble(edittext182.getText().toString()) < 0))) {
						edittext182.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext184.getText().toString().equals("") || edittext184.getText().toString().equals(".")) || (edittext184.getText().toString().equals("-") || (Double.parseDouble(edittext184.getText().toString()) < 0))) {
						edittext184.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext187.getText().toString().equals("") || edittext187.getText().toString().equals(".")) || (edittext187.getText().toString().equals("-") || (Double.parseDouble(edittext187.getText().toString()) < 0))) {
						edittext187.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext191.getText().toString().equals("") || edittext191.getText().toString().equals(".")) || (edittext191.getText().toString().equals("-") || (Double.parseDouble(edittext191.getText().toString()) < 0))) {
						edittext191.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext192.getText().toString().equals("") || edittext192.getText().toString().equals(".")) || (edittext192.getText().toString().equals("-") || (Double.parseDouble(edittext192.getText().toString()) < 0))) {
						edittext192.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					edittext189.setText(String.valueOf((Double.parseDouble(edittext63.getText().toString()) + Double.parseDouble(edittext180.getText().toString())) + (Double.parseDouble(edittext182.getText().toString()) + ((Double.parseDouble(edittext184.getText().toString()) + Double.parseDouble(edittext187.getText().toString())) + (Double.parseDouble(edittext191.getText().toString()) + Double.parseDouble(edittext192.getText().toString()))))));
					edittext189.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext189.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext189.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 8)});
				edittext67.setText(String.valueOf(00.00));
				edittext67.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext65.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext65.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext67.setText(String.valueOf(00.00d));
				edittext67.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext64.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				Dialog.setTitle("* نسبة المصاريف الادارية والأرباح");
				Dialog.setMessage("\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١٩ % \"");
				Dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Dialog.create().show();
				return true;
			}
		});
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext63.getText().toString().equals("") || edittext63.getText().toString().equals(".")) || (edittext63.getText().toString().equals("-") || (Double.parseDouble(edittext63.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext65.getText().toString().equals("") || edittext65.getText().toString().equals(".")) || (edittext65.getText().toString().equals("-") || (Double.parseDouble(edittext65.getText().toString()) < 0))) {
						edittext65.setText(String.valueOf(19));
					}
					edittext67.setText(String.valueOf(Double.parseDouble(edittext189.getText().toString()) + (Double.parseDouble(edittext189.getText().toString()) * (Double.parseDouble(edittext65.getText().toString()) / 100))));
					edittext67.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext67.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext67.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				edittext69.setText(String.valueOf(Double.parseDouble(edittext61.getText().toString()) + Double.parseDouble(edittext67.getText().toString())));
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
				edittext69.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				if ((edittext73.getText().toString().equals("") || edittext73.getText().toString().equals(".")) || (edittext73.getText().toString().equals("-") || (Double.parseDouble(edittext73.getText().toString()) < 0))) {
					edittext75.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
				else {
					edittext75.setText(String.valueOf(Double.parseDouble(_charSeq) + Double.parseDouble(edittext73.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear624.setVisibility(View.GONE);
				edittext71.setText("");
				button112.setVisibility(View.VISIBLE);
			}
		});
		
		edittext71.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext71.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext73.setText("");
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext70.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				Dialog.setTitle("* نسبة فرق الفعلي عن الهندسي");
				Dialog.setMessage("\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١٥ % \"");
				Dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Dialog.create().show();
				return true;
			}
		});
		
		button10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext71.getText().toString().equals("") || edittext71.getText().toString().equals(".")) || (edittext71.getText().toString().equals("-") || (Double.parseDouble(edittext71.getText().toString()) < 0))) {
					edittext71.setText(String.valueOf(15));
				}
				edittext73.setText(String.valueOf(Double.parseDouble(edittext69.getText().toString()) * (Double.parseDouble(edittext71.getText().toString()) / 100)));
				edittext73.setTextColor(0xFF000000);
			}
		});
		
		edittext73.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext73.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext75.setText(String.valueOf(Double.parseDouble(edittext69.getText().toString())));
				}
				else {
					edittext75.setText(String.valueOf(Double.parseDouble(edittext69.getText().toString()) + Double.parseDouble(_charSeq)));
				}
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
				edittext75.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				if ((edittext77.getText().toString().equals("") || edittext77.getText().toString().equals(".")) || (edittext77.getText().toString().equals("-") || (Double.parseDouble(edittext77.getText().toString()) < 0))) {
					edittext79.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
				else {
					edittext79.setText(String.valueOf(Double.parseDouble(_charSeq) + Double.parseDouble(edittext77.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview30.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear429.setVisibility(View.GONE);
				edittext77.setText("");
				button113.setVisibility(View.VISIBLE);
			}
		});
		
		edittext77.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext77.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext79.setText(String.valueOf(Double.parseDouble(edittext75.getText().toString())));
				}
				else {
					edittext79.setText(String.valueOf(Double.parseDouble(edittext75.getText().toString()) + Double.parseDouble(_charSeq)));
				}
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
				edittext79.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				edittext83.setText(String.valueOf(00.00d));
				edittext83.setTextColor(0xFFE91E63);
				edittext89.setText(String.valueOf(Double.parseDouble(_charSeq)));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview31.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear444.setVisibility(View.GONE);
				edittext81.setText("");
				button114.setVisibility(View.VISIBLE);
			}
		});
		
		edittext81.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext81.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext83.setText(String.valueOf(00.00d));
				edittext83.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext80.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				Dialog.setTitle("* نسبة مصاريف التصميم والأستشاري المصمم");
				Dialog.setMessage("\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٥٠ % \"");
				Dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Dialog.create().show();
				return true;
			}
		});
		
		button60.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext81.getText().toString().equals("") || edittext81.getText().toString().equals(".")) || (edittext81.getText().toString().equals("-") || (Double.parseDouble(edittext81.getText().toString()) < 0))) {
					edittext81.setText(String.valueOf(0.50d));
				}
				edittext83.setText(String.valueOf(Double.parseDouble(edittext79.getText().toString()) * ((1.3d + (Double.parseDouble(edittext81.getText().toString()) / 100)) / 1.3d)));
				edittext83.setTextColor(0xFF000000);
			}
		});
		
		edittext83.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext83.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				edittext87.setText(String.valueOf(00.00d));
				edittext87.setTextColor(0xFFE91E63);
				if (Double.parseDouble(edittext83.getText().toString()) == 0) {
					edittext89.setText(String.valueOf(Double.parseDouble(edittext79.getText().toString())));
				}
				else {
					edittext89.setText(String.valueOf(Double.parseDouble(edittext83.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		imageview32.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear628.setVisibility(View.GONE);
				edittext85.setText("");
				button115.setVisibility(View.VISIBLE);
			}
		});
		
		edittext85.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext85.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext87.setText(String.valueOf(00.00d));
				edittext87.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext84.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				Dialog.setTitle("* الدمغات");
				Dialog.setMessage("\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٥ % \"");
				Dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				Dialog.create().show();
				return true;
			}
		});
		
		button13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext85.getText().toString().equals("") || edittext85.getText().toString().equals(".")) || (edittext85.getText().toString().equals("-") || (Double.parseDouble(edittext85.getText().toString()) < 0))) {
					edittext85.setText(String.valueOf(5));
				}
				edittext87.setText(String.valueOf(Double.parseDouble(edittext83.getText().toString()) + (Double.parseDouble(edittext83.getText().toString()) * (Double.parseDouble(edittext85.getText().toString()) / 100))));
				edittext87.setTextColor(0xFF000000);
			}
		});
		
		edittext87.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext87.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
				if (Double.parseDouble(_charSeq) == 0) {
					if (Double.parseDouble(edittext83.getText().toString()) == 0) {
						edittext89.setText(String.valueOf(Double.parseDouble(edittext79.getText().toString())));
					}
					else {
						edittext89.setText(String.valueOf(Double.parseDouble(edittext83.getText().toString())));
					}
				}
				else {
					edittext89.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
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
				edittext89.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
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
		linear390.setVisibility(View.GONE);
		linear152.setVisibility(View.GONE);
		linear392.setVisibility(View.GONE);
		linear395.setVisibility(View.GONE);
		linear398.setVisibility(View.GONE);
		linear401.setVisibility(View.GONE);
		linear404.setVisibility(View.GONE);
		linear577.setVisibility(View.GONE);
		linear589.setVisibility(View.GONE);
		linear597.setVisibility(View.GONE);
		linear605.setVisibility(View.GONE);
		linear617.setVisibility(View.GONE);
		linear624.setVisibility(View.GONE);
		linear429.setVisibility(View.GONE);
		linear444.setVisibility(View.GONE);
		linear628.setVisibility(View.GONE);
		linear644.setVisibility(View.GONE);
		linear648.setVisibility(View.GONE);
		
		{
			AdRequest adRequest = new AdRequest.Builder().build();
		}
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
		PrintHelper printHelper = new PrintHelper(ToipccEjectionLinePriceAndStudysActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
}
