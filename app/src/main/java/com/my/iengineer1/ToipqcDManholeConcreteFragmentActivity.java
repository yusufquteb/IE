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
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.*;
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.*;
import org.json.*;
import androidx.print.PrintHelper;


public class ToipqcDManholeConcreteFragmentActivity extends Fragment {
	
	private String path = "";
	
	private TextView textview519;
	private ScrollView vscroll1;
	private LinearLayout linear2d;
	private LinearLayout linear713;
	private TextView textview1195;
	private LinearLayout linear121;
	private HorizontalScrollView hscroll5;
	private LinearLayout linear77;
	private TextView textview123d;
	private LinearLayout linear222d;
	private LinearLayout linear220d;
	private LinearLayout linear221d;
	private LinearLayout linear223d;
	private LinearLayout linear229d;
	private LinearLayout linear233d;
	private LinearLayout linear226d;
	private LinearLayout linear219d;
	private LinearLayout linear457d;
	private HorizontalScrollView hscroll1d;
	private LinearLayout linear460d;
	private HorizontalScrollView hscroll2d;
	private LinearLayout linear144d;
	private ImageView close;
	private LinearLayout linear720;
	private EditText edittext1d;
	private TextView textview341;
	private LinearLayout linear456;
	private LinearLayout linear119;
	private LinearLayout linear120;
	private LinearLayout linear118;
	private LinearLayout linear195;
	private EditText edittext2xd;
	private TextView textview1208;
	private EditText edittext2d;
	private TextView textview1209;
	private TextView textview22;
	private EditText edittext3d;
	private TextView textview592;
	private TextView textview135;
	private EditText edittext4d;
	private TextView textview340;
	private TextView textview138;
	private EditText edittext_am5d;
	private TextView textview606;
	private EditText edittext5d;
	private TextView textview334;
	private TextView textview335;
	private TextView textview2d;
	private TextView textview603;
	private TextView textview604;
	private TextView textview659d;
	private TextView textview660d;
	private LinearLayout linear157d;
	private LinearLayout linear158d;
	private LinearLayout linear125d;
	private TextView textview605;
	private EditText edittext6d;
	private TextView textview405;
	private TextView textview406;
	private TextView textview631d;
	private LinearLayout linear1051;
	private LinearLayout linear1053;
	private TextView textview2358;
	private LinearLayout linear1054;
	private TextView textview2360;
	private EditText edittext102d;
	private TextView textview2361;
	private EditText edittext101d;
	private TextView textview60;
	private EditText edittext7d;
	private TextView textview601;
	private TextView textview136d;
	private TextView textview658d;
	private LinearLayout linear177d;
	private LinearLayout linear453d;
	private HorizontalScrollView hscroll6;
	private Button button111d;
	private LinearLayout linear111d;
	private LinearLayout linear178d;
	private TextView textview568d;
	private LinearLayout linear567d;
	private TextView textview565d;
	private LinearLayout linear566d;
	private TextView textview564d;
	private EditText edittext9d;
	private TextView textview567d;
	private EditText edittext103d;
	private TextView textview566d;
	private EditText edittext8d;
	private TextView textview531;
	private EditText edittext10d;
	private TextView textview532;
	private TextView textview533d;
	private LinearLayout linear_close;
	private TextView textview2375;
	private LinearLayout linear112d;
	private LinearLayout linear113d;
	private LinearLayout linear114d;
	private LinearLayout linear115d;
	private TextView textview2514;
	private LinearLayout linear202;
	private ImageView close111d;
	private LinearLayout linear1088;
	private TextView textview400;
	private EditText edittext112d;
	private TextView textview2362;
	private TextView textview112dd;
	private TextView textview2493;
	private EditText edittext113d;
	private TextView textview2494;
	private TextView textview113d;
	private TextView textview1169;
	private EditText edittext114d;
	private TextView textview1170;
	private TextView textview114d;
	private TextView textview2363;
	private EditText edittext115d;
	private TextView textview2364;
	private TextView textview115d;
	private LinearLayout linear218;
	private TextView textview2530;
	private LinearLayout linear205;
	private TextView textview2531;
	private LinearLayout linear203;
	private TextView textview2532;
	private TextView textview3105;
	private EditText edittext218d;
	private TextView textview3111;
	private TextView textview2533;
	private EditText edittext219d;
	private TextView textview3104;
	private TextView textview2534;
	private EditText edittext214d;
	private TextView textview3110;
	private TextView textview22d;
	private EditText edittext215d;
	private TextView textview3103;
	private TextView textview2535;
	private EditText edittext210d;
	private TextView textview3107;
	private TextView textview3108;
	private EditText edittext211d;
	private TextView textview122d;
	private LinearLayout linear197d;
	private LinearLayout linear196d;
	private HorizontalScrollView hscroll9;
	private Button button121d;
	private LinearLayout linear121d;
	private TextView textview611;
	private EditText edittext11d;
	private TextView textview609;
	private TextView textview610d;
	private TextView textview14;
	private EditText edittext12d;
	private TextView textview607;
	private TextView textview608d;
	private LinearLayout linear1089;
	private TextView textview3127;
	private LinearLayout linear122d;
	private LinearLayout linear123d;
	private LinearLayout linear124d;
	private LinearLayout linear125dd;
	private TextView textview3112;
	private LinearLayout linear1060;
	private ImageView close121d;
	private LinearLayout linear1090;
	private TextView textview2392;
	private EditText edittext122d;
	private TextView textview2393;
	private TextView textview122dd;
	private TextView textview2495;
	private EditText edittext123d;
	private TextView textview2496;
	private TextView textview123dd;
	private TextView textview2395;
	private EditText edittext124d;
	private TextView textview2396;
	private TextView textview124d;
	private TextView textview2398;
	private EditText edittext125d;
	private TextView textview2399;
	private TextView textview125d;
	private LinearLayout linear1061;
	private TextView textview3113;
	private LinearLayout linear1062;
	private TextView textview3114;
	private LinearLayout linear1063;
	private TextView textview3115;
	private TextView textview3116;
	private EditText edittext228d;
	private TextView textview3117;
	private TextView textview3118;
	private EditText edittext229d;
	private TextView textview3119;
	private TextView textview3120;
	private EditText edittext224d;
	private TextView textview3121;
	private TextView textview3122;
	private EditText edittext225d;
	private TextView textview3123;
	private TextView textview3124;
	private EditText edittext220d;
	private TextView textview3125;
	private TextView textview3126;
	private EditText edittext221d;
	private TextView textview661d;
	private LinearLayout linear224d;
	private LinearLayout linear14d;
	private HorizontalScrollView hscroll7;
	private Button button131d;
	private LinearLayout linear131d;
	private TextView textview662;
	private EditText edittext13d;
	private TextView textview663;
	private TextView textview664d;
	private TextView textview665;
	private EditText edittext14d;
	private TextView textview666;
	private TextView textview14d;
	private LinearLayout linear1091;
	private TextView textview3068;
	private LinearLayout linear132d;
	private LinearLayout linear133d;
	private LinearLayout linear134d;
	private LinearLayout linear135d;
	private TextView textview3129;
	private LinearLayout linear1064;
	private ImageView close131d;
	private LinearLayout linear1092;
	private TextView textview2481;
	private EditText edittext132d;
	private TextView textview2482;
	private TextView textview132d;
	private TextView textview2497;
	private EditText edittext133d;
	private TextView textview2498;
	private TextView textview133d;
	private TextView textview2484;
	private EditText edittext134d;
	private TextView textview2485;
	private TextView textview134d;
	private TextView textview2487;
	private EditText edittext135d;
	private TextView textview2488;
	private TextView textview135d;
	private LinearLayout linear1065;
	private TextView textview3130;
	private LinearLayout linear1066;
	private TextView textview3131;
	private LinearLayout linear1067;
	private TextView textview3132;
	private TextView textview3133;
	private EditText edittext238d;
	private TextView textview3134;
	private TextView textview3135;
	private EditText edittext239d;
	private TextView textview3136;
	private TextView textview3137;
	private EditText edittext234d;
	private TextView textview3138;
	private TextView textview3139;
	private EditText edittext235d;
	private TextView textview3140;
	private TextView textview3141;
	private EditText edittext230d;
	private TextView textview3142;
	private TextView textview3143;
	private EditText edittext231d;
	private TextView textview675d;
	private LinearLayout linear230d;
	private LinearLayout linear231d;
	private LinearLayout linear232d;
	private HorizontalScrollView hscroll10;
	private Button button141d;
	private LinearLayout linear141d;
	private TextView textview676;
	private EditText edittext15d;
	private TextView textview677;
	private TextView textview678d;
	private TextView textview679;
	private EditText edittext16d;
	private TextView textview680;
	private TextView textview681d;
	private TextView textview682;
	private EditText edittext17d;
	private TextView textview683;
	private TextView textview684d;
	private LinearLayout linear1093;
	private TextView textview3144;
	private LinearLayout linear142d;
	private LinearLayout linear143d;
	private LinearLayout linear144dd;
	private LinearLayout linear145d;
	private TextView textview3145;
	private LinearLayout linear1068;
	private ImageView close141d;
	private LinearLayout linear1094;
	private TextView textview2419;
	private EditText edittext142d;
	private TextView textview2420;
	private TextView textview142d;
	private TextView textview2500;
	private EditText edittext143d;
	private TextView textview2501;
	private TextView textview143d;
	private TextView textview2422;
	private EditText edittext144d;
	private TextView textview2423;
	private TextView textview144d;
	private TextView textview2425;
	private EditText edittext145d;
	private TextView textview2426;
	private TextView textview145d;
	private LinearLayout linear1069;
	private TextView textview3146;
	private LinearLayout linear1070;
	private TextView textview3147;
	private LinearLayout linear1071;
	private TextView textview3148;
	private TextView textview3149;
	private EditText edittext248d;
	private TextView textview3150;
	private TextView textview3151;
	private EditText edittext249d;
	private TextView textview3152;
	private TextView textview3153;
	private EditText edittext244d;
	private TextView textview3154;
	private TextView textview3155;
	private EditText edittext245d;
	private TextView textview3156;
	private TextView textview3157;
	private EditText edittext240d;
	private TextView textview3158;
	private TextView textview3159;
	private EditText edittext241d;
	private TextView textview685d;
	private LinearLayout linear234d;
	private LinearLayout linear235d;
	private LinearLayout linear236d;
	private HorizontalScrollView hscroll11;
	private Button button151d;
	private LinearLayout linear151d;
	private TextView textview686;
	private EditText edittext18d;
	private TextView textview687;
	private TextView textview688d;
	private TextView textview689;
	private EditText edittext19d;
	private TextView textview690;
	private TextView textview691d;
	private TextView textview692;
	private EditText edittext20d;
	private TextView textview693;
	private TextView textview694d;
	private LinearLayout linear1095;
	private TextView textview4440;
	private LinearLayout linear152d;
	private LinearLayout linear153d;
	private LinearLayout linear154d;
	private LinearLayout linear155d;
	private TextView textview3160;
	private LinearLayout linear1072;
	private ImageView close151d;
	private LinearLayout linear1096;
	private TextView textview2464;
	private EditText edittext152d;
	private TextView textview2465;
	private TextView textview2466;
	private TextView textview2503;
	private EditText edittext153d;
	private TextView textview2504;
	private TextView textview153d;
	private TextView textview2467;
	private EditText edittext154d;
	private TextView textview2468;
	private TextView textview154d;
	private TextView textview2470;
	private EditText edittext155d;
	private TextView textview2471;
	private TextView textview155d;
	private LinearLayout linear1073;
	private TextView textview3161;
	private LinearLayout linear1074;
	private TextView textview3162;
	private LinearLayout linear1075;
	private TextView textview3163;
	private TextView textview3164;
	private EditText edittext258d;
	private TextView textview3165;
	private TextView textview3166;
	private EditText edittext259d;
	private TextView textview3167;
	private TextView textview3168;
	private EditText edittext254d;
	private TextView textview3169;
	private TextView textview3170;
	private EditText edittext255d;
	private TextView textview3171;
	private TextView textview3172;
	private EditText edittext250d;
	private TextView textview3173;
	private TextView textview3174;
	private EditText edittext251d;
	private TextView textview668d;
	private LinearLayout linear227d;
	private LinearLayout linear74d;
	private LinearLayout linear228d;
	private HorizontalScrollView hscroll13;
	private Button button161d;
	private LinearLayout linear161d;
	private TextView textview669;
	private EditText edittext21d;
	private TextView textview670;
	private TextView textview671d;
	private TextView textview467;
	private EditText edittext22d;
	private TextView textview286;
	private TextView textview112d;
	private TextView textview672;
	private EditText edittext23d;
	private TextView textview673;
	private TextView textview674d;
	private LinearLayout linear1097;
	private TextView textview3175;
	private LinearLayout linear162d;
	private LinearLayout linear163d;
	private LinearLayout linear164d;
	private LinearLayout linear165d;
	private TextView textview3176;
	private LinearLayout linear1076;
	private ImageView close161d;
	private LinearLayout linear1098;
	private TextView textview2473;
	private EditText edittext162d;
	private TextView textview2474;
	private TextView textview162d;
	private TextView textview2506;
	private EditText edittext163d;
	private TextView textview2507;
	private TextView textview163d;
	private TextView textview2476;
	private EditText edittext164d;
	private TextView textview2477;
	private TextView textview164d;
	private TextView textview2479;
	private EditText edittext165d;
	private TextView textview2480;
	private TextView textview165d;
	private LinearLayout linear1077;
	private TextView textview3177;
	private LinearLayout linear1078;
	private TextView textview3178;
	private LinearLayout linear1079;
	private TextView textview3179;
	private TextView textview3180;
	private EditText edittext268d;
	private TextView textview3181;
	private TextView textview3182;
	private EditText edittext269d;
	private TextView textview3183;
	private TextView textview3184;
	private EditText edittext264d;
	private TextView textview3185;
	private TextView textview3186;
	private EditText edittext265d;
	private TextView textview3187;
	private TextView textview3188;
	private EditText edittext260d;
	private TextView textview3189;
	private TextView textview3190;
	private EditText edittext261d;
	private TextView textview615d;
	private LinearLayout linear202d;
	private LinearLayout linear198d;
	private HorizontalScrollView hscroll14;
	private Button button171d;
	private LinearLayout linear171d;
	private LinearLayout linear218d;
	private TextView textview642;
	private LinearLayout linear205d;
	private TextView textview644;
	private LinearLayout linear203d;
	private TextView textview657;
	private EditText edittext26d;
	private TextView textview643;
	private EditText edittext25d;
	private TextView textview641;
	private EditText edittext24d;
	private TextView textview614;
	private EditText edittext27d;
	private TextView textview612;
	private TextView textview613d;
	private LinearLayout linear1099;
	private TextView textview3191;
	private LinearLayout linear172d;
	private LinearLayout linear173d;
	private LinearLayout linear174d;
	private LinearLayout linear175d;
	private TextView textview3192;
	private LinearLayout linear1080;
	private ImageView close171d;
	private LinearLayout linear1100;
	private TextView textview2455;
	private EditText edittext172d;
	private TextView textview2456;
	private TextView textview172d;
	private TextView textview2509;
	private EditText edittext173d;
	private TextView textview2510;
	private TextView textview173d;
	private TextView textview2458;
	private EditText edittext174d;
	private TextView textview2459;
	private TextView textview174d;
	private TextView textview2461;
	private EditText edittext175d;
	private TextView textview2462;
	private TextView textview175d;
	private LinearLayout linear1081;
	private TextView textview3193;
	private LinearLayout linear1082;
	private TextView textview3194;
	private LinearLayout linear1083;
	private TextView textview3195;
	private TextView textview3196;
	private EditText edittext278d;
	private TextView textview3197;
	private TextView textview3198;
	private EditText edittext279d;
	private TextView textview3199;
	private TextView textview3200;
	private EditText edittext274d;
	private TextView textview3201;
	private TextView textview3202;
	private EditText edittext275d;
	private TextView textview3203;
	private TextView textview3204;
	private EditText edittext270d;
	private TextView textview3205;
	private TextView textview3206;
	private EditText edittext271d;
	private TextView textview1211;
	private LinearLayout linear459;
	private HorizontalScrollView hscroll15;
	private Button button181d;
	private LinearLayout linear181d;
	private TextView textview1215;
	private EditText edittext28d;
	private TextView textview1216;
	private TextView textview1217;
	private LinearLayout linear1101;
	private TextView textview3207;
	private LinearLayout linear182d;
	private LinearLayout linear183d;
	private LinearLayout linear184d;
	private LinearLayout linear185d;
	private TextView textview3208;
	private LinearLayout linear1084;
	private ImageView close181d;
	private LinearLayout linear1102;
	private TextView textview2437;
	private EditText edittext182d;
	private TextView textview2438;
	private TextView textview182d;
	private TextView textview2512;
	private EditText edittext183d;
	private TextView textview2513;
	private TextView textview183d;
	private TextView textview2440;
	private EditText edittext184d;
	private TextView textview2441;
	private TextView textview184d;
	private TextView textview2443;
	private EditText edittext185d;
	private TextView textview2444;
	private TextView textview185d;
	private LinearLayout linear1085;
	private TextView textview3209;
	private LinearLayout linear1086;
	private TextView textview3210;
	private LinearLayout linear1087;
	private TextView textview3211;
	private TextView textview3212;
	private EditText edittext288d;
	private TextView textview3213;
	private TextView textview3214;
	private EditText edittext289d;
	private TextView textview3215;
	private TextView textview3216;
	private EditText edittext284d;
	private TextView textview3217;
	private TextView textview3218;
	private EditText edittext285d;
	private TextView textview3219;
	private TextView textview3220;
	private EditText edittext280d;
	private TextView textview3221;
	private TextView textview3222;
	private EditText edittext281d;
	private TextView textview1218;
	private EditText edittext29d;
	private TextView textview1219;
	private TextView textview1220;
	private TextView textview695;
	private EditText edittext30d;
	private TextView textview602;
	private TextView textview30d;
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.toipqc_d_manhole_concrete_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		textview519 = _view.findViewById(R.id.textview519);
		vscroll1 = _view.findViewById(R.id.vscroll1);
		linear2d = _view.findViewById(R.id.linear2d);
		linear713 = _view.findViewById(R.id.linear713);
		textview1195 = _view.findViewById(R.id.textview1195);
		linear121 = _view.findViewById(R.id.linear121);
		hscroll5 = _view.findViewById(R.id.hscroll5);
		linear77 = _view.findViewById(R.id.linear77);
		textview123d = _view.findViewById(R.id.textview123d);
		linear222d = _view.findViewById(R.id.linear222d);
		linear220d = _view.findViewById(R.id.linear220d);
		linear221d = _view.findViewById(R.id.linear221d);
		linear223d = _view.findViewById(R.id.linear223d);
		linear229d = _view.findViewById(R.id.linear229d);
		linear233d = _view.findViewById(R.id.linear233d);
		linear226d = _view.findViewById(R.id.linear226d);
		linear219d = _view.findViewById(R.id.linear219d);
		linear457d = _view.findViewById(R.id.linear457d);
		hscroll1d = _view.findViewById(R.id.hscroll1d);
		linear460d = _view.findViewById(R.id.linear460d);
		hscroll2d = _view.findViewById(R.id.hscroll2d);
		linear144d = _view.findViewById(R.id.linear144d);
		close = _view.findViewById(R.id.close);
		linear720 = _view.findViewById(R.id.linear720);
		edittext1d = _view.findViewById(R.id.edittext1d);
		textview341 = _view.findViewById(R.id.textview341);
		linear456 = _view.findViewById(R.id.linear456);
		linear119 = _view.findViewById(R.id.linear119);
		linear120 = _view.findViewById(R.id.linear120);
		linear118 = _view.findViewById(R.id.linear118);
		linear195 = _view.findViewById(R.id.linear195);
		edittext2xd = _view.findViewById(R.id.edittext2xd);
		textview1208 = _view.findViewById(R.id.textview1208);
		edittext2d = _view.findViewById(R.id.edittext2d);
		textview1209 = _view.findViewById(R.id.textview1209);
		textview22 = _view.findViewById(R.id.textview22);
		edittext3d = _view.findViewById(R.id.edittext3d);
		textview592 = _view.findViewById(R.id.textview592);
		textview135 = _view.findViewById(R.id.textview135);
		edittext4d = _view.findViewById(R.id.edittext4d);
		textview340 = _view.findViewById(R.id.textview340);
		textview138 = _view.findViewById(R.id.textview138);
		edittext_am5d = _view.findViewById(R.id.edittext_am5d);
		textview606 = _view.findViewById(R.id.textview606);
		edittext5d = _view.findViewById(R.id.edittext5d);
		textview334 = _view.findViewById(R.id.textview334);
		textview335 = _view.findViewById(R.id.textview335);
		textview2d = _view.findViewById(R.id.textview2d);
		textview603 = _view.findViewById(R.id.textview603);
		textview604 = _view.findViewById(R.id.textview604);
		textview659d = _view.findViewById(R.id.textview659d);
		textview660d = _view.findViewById(R.id.textview660d);
		linear157d = _view.findViewById(R.id.linear157d);
		linear158d = _view.findViewById(R.id.linear158d);
		linear125d = _view.findViewById(R.id.linear125d);
		textview605 = _view.findViewById(R.id.textview605);
		edittext6d = _view.findViewById(R.id.edittext6d);
		textview405 = _view.findViewById(R.id.textview405);
		textview406 = _view.findViewById(R.id.textview406);
		textview631d = _view.findViewById(R.id.textview631d);
		linear1051 = _view.findViewById(R.id.linear1051);
		linear1053 = _view.findViewById(R.id.linear1053);
		textview2358 = _view.findViewById(R.id.textview2358);
		linear1054 = _view.findViewById(R.id.linear1054);
		textview2360 = _view.findViewById(R.id.textview2360);
		edittext102d = _view.findViewById(R.id.edittext102d);
		textview2361 = _view.findViewById(R.id.textview2361);
		edittext101d = _view.findViewById(R.id.edittext101d);
		textview60 = _view.findViewById(R.id.textview60);
		edittext7d = _view.findViewById(R.id.edittext7d);
		textview601 = _view.findViewById(R.id.textview601);
		textview136d = _view.findViewById(R.id.textview136d);
		textview658d = _view.findViewById(R.id.textview658d);
		linear177d = _view.findViewById(R.id.linear177d);
		linear453d = _view.findViewById(R.id.linear453d);
		hscroll6 = _view.findViewById(R.id.hscroll6);
		button111d = _view.findViewById(R.id.button111d);
		linear111d = _view.findViewById(R.id.linear111d);
		linear178d = _view.findViewById(R.id.linear178d);
		textview568d = _view.findViewById(R.id.textview568d);
		linear567d = _view.findViewById(R.id.linear567d);
		textview565d = _view.findViewById(R.id.textview565d);
		linear566d = _view.findViewById(R.id.linear566d);
		textview564d = _view.findViewById(R.id.textview564d);
		edittext9d = _view.findViewById(R.id.edittext9d);
		textview567d = _view.findViewById(R.id.textview567d);
		edittext103d = _view.findViewById(R.id.edittext103d);
		textview566d = _view.findViewById(R.id.textview566d);
		edittext8d = _view.findViewById(R.id.edittext8d);
		textview531 = _view.findViewById(R.id.textview531);
		edittext10d = _view.findViewById(R.id.edittext10d);
		textview532 = _view.findViewById(R.id.textview532);
		textview533d = _view.findViewById(R.id.textview533d);
		linear_close = _view.findViewById(R.id.linear_close);
		textview2375 = _view.findViewById(R.id.textview2375);
		linear112d = _view.findViewById(R.id.linear112d);
		linear113d = _view.findViewById(R.id.linear113d);
		linear114d = _view.findViewById(R.id.linear114d);
		linear115d = _view.findViewById(R.id.linear115d);
		textview2514 = _view.findViewById(R.id.textview2514);
		linear202 = _view.findViewById(R.id.linear202);
		close111d = _view.findViewById(R.id.close111d);
		linear1088 = _view.findViewById(R.id.linear1088);
		textview400 = _view.findViewById(R.id.textview400);
		edittext112d = _view.findViewById(R.id.edittext112d);
		textview2362 = _view.findViewById(R.id.textview2362);
		textview112dd = _view.findViewById(R.id.textview112dd);
		textview2493 = _view.findViewById(R.id.textview2493);
		edittext113d = _view.findViewById(R.id.edittext113d);
		textview2494 = _view.findViewById(R.id.textview2494);
		textview113d = _view.findViewById(R.id.textview113d);
		textview1169 = _view.findViewById(R.id.textview1169);
		edittext114d = _view.findViewById(R.id.edittext114d);
		textview1170 = _view.findViewById(R.id.textview1170);
		textview114d = _view.findViewById(R.id.textview114d);
		textview2363 = _view.findViewById(R.id.textview2363);
		edittext115d = _view.findViewById(R.id.edittext115d);
		textview2364 = _view.findViewById(R.id.textview2364);
		textview115d = _view.findViewById(R.id.textview115d);
		linear218 = _view.findViewById(R.id.linear218);
		textview2530 = _view.findViewById(R.id.textview2530);
		linear205 = _view.findViewById(R.id.linear205);
		textview2531 = _view.findViewById(R.id.textview2531);
		linear203 = _view.findViewById(R.id.linear203);
		textview2532 = _view.findViewById(R.id.textview2532);
		textview3105 = _view.findViewById(R.id.textview3105);
		edittext218d = _view.findViewById(R.id.edittext218d);
		textview3111 = _view.findViewById(R.id.textview3111);
		textview2533 = _view.findViewById(R.id.textview2533);
		edittext219d = _view.findViewById(R.id.edittext219d);
		textview3104 = _view.findViewById(R.id.textview3104);
		textview2534 = _view.findViewById(R.id.textview2534);
		edittext214d = _view.findViewById(R.id.edittext214d);
		textview3110 = _view.findViewById(R.id.textview3110);
		textview22d = _view.findViewById(R.id.textview22d);
		edittext215d = _view.findViewById(R.id.edittext215d);
		textview3103 = _view.findViewById(R.id.textview3103);
		textview2535 = _view.findViewById(R.id.textview2535);
		edittext210d = _view.findViewById(R.id.edittext210d);
		textview3107 = _view.findViewById(R.id.textview3107);
		textview3108 = _view.findViewById(R.id.textview3108);
		edittext211d = _view.findViewById(R.id.edittext211d);
		textview122d = _view.findViewById(R.id.textview122d);
		linear197d = _view.findViewById(R.id.linear197d);
		linear196d = _view.findViewById(R.id.linear196d);
		hscroll9 = _view.findViewById(R.id.hscroll9);
		button121d = _view.findViewById(R.id.button121d);
		linear121d = _view.findViewById(R.id.linear121d);
		textview611 = _view.findViewById(R.id.textview611);
		edittext11d = _view.findViewById(R.id.edittext11d);
		textview609 = _view.findViewById(R.id.textview609);
		textview610d = _view.findViewById(R.id.textview610d);
		textview14 = _view.findViewById(R.id.textview14);
		edittext12d = _view.findViewById(R.id.edittext12d);
		textview607 = _view.findViewById(R.id.textview607);
		textview608d = _view.findViewById(R.id.textview608d);
		linear1089 = _view.findViewById(R.id.linear1089);
		textview3127 = _view.findViewById(R.id.textview3127);
		linear122d = _view.findViewById(R.id.linear122d);
		linear123d = _view.findViewById(R.id.linear123d);
		linear124d = _view.findViewById(R.id.linear124d);
		linear125dd = _view.findViewById(R.id.linear125dd);
		textview3112 = _view.findViewById(R.id.textview3112);
		linear1060 = _view.findViewById(R.id.linear1060);
		close121d = _view.findViewById(R.id.close121d);
		linear1090 = _view.findViewById(R.id.linear1090);
		textview2392 = _view.findViewById(R.id.textview2392);
		edittext122d = _view.findViewById(R.id.edittext122d);
		textview2393 = _view.findViewById(R.id.textview2393);
		textview122dd = _view.findViewById(R.id.textview122dd);
		textview2495 = _view.findViewById(R.id.textview2495);
		edittext123d = _view.findViewById(R.id.edittext123d);
		textview2496 = _view.findViewById(R.id.textview2496);
		textview123dd = _view.findViewById(R.id.textview123dd);
		textview2395 = _view.findViewById(R.id.textview2395);
		edittext124d = _view.findViewById(R.id.edittext124d);
		textview2396 = _view.findViewById(R.id.textview2396);
		textview124d = _view.findViewById(R.id.textview124d);
		textview2398 = _view.findViewById(R.id.textview2398);
		edittext125d = _view.findViewById(R.id.edittext125d);
		textview2399 = _view.findViewById(R.id.textview2399);
		textview125d = _view.findViewById(R.id.textview125d);
		linear1061 = _view.findViewById(R.id.linear1061);
		textview3113 = _view.findViewById(R.id.textview3113);
		linear1062 = _view.findViewById(R.id.linear1062);
		textview3114 = _view.findViewById(R.id.textview3114);
		linear1063 = _view.findViewById(R.id.linear1063);
		textview3115 = _view.findViewById(R.id.textview3115);
		textview3116 = _view.findViewById(R.id.textview3116);
		edittext228d = _view.findViewById(R.id.edittext228d);
		textview3117 = _view.findViewById(R.id.textview3117);
		textview3118 = _view.findViewById(R.id.textview3118);
		edittext229d = _view.findViewById(R.id.edittext229d);
		textview3119 = _view.findViewById(R.id.textview3119);
		textview3120 = _view.findViewById(R.id.textview3120);
		edittext224d = _view.findViewById(R.id.edittext224d);
		textview3121 = _view.findViewById(R.id.textview3121);
		textview3122 = _view.findViewById(R.id.textview3122);
		edittext225d = _view.findViewById(R.id.edittext225d);
		textview3123 = _view.findViewById(R.id.textview3123);
		textview3124 = _view.findViewById(R.id.textview3124);
		edittext220d = _view.findViewById(R.id.edittext220d);
		textview3125 = _view.findViewById(R.id.textview3125);
		textview3126 = _view.findViewById(R.id.textview3126);
		edittext221d = _view.findViewById(R.id.edittext221d);
		textview661d = _view.findViewById(R.id.textview661d);
		linear224d = _view.findViewById(R.id.linear224d);
		linear14d = _view.findViewById(R.id.linear14d);
		hscroll7 = _view.findViewById(R.id.hscroll7);
		button131d = _view.findViewById(R.id.button131d);
		linear131d = _view.findViewById(R.id.linear131d);
		textview662 = _view.findViewById(R.id.textview662);
		edittext13d = _view.findViewById(R.id.edittext13d);
		textview663 = _view.findViewById(R.id.textview663);
		textview664d = _view.findViewById(R.id.textview664d);
		textview665 = _view.findViewById(R.id.textview665);
		edittext14d = _view.findViewById(R.id.edittext14d);
		textview666 = _view.findViewById(R.id.textview666);
		textview14d = _view.findViewById(R.id.textview14d);
		linear1091 = _view.findViewById(R.id.linear1091);
		textview3068 = _view.findViewById(R.id.textview3068);
		linear132d = _view.findViewById(R.id.linear132d);
		linear133d = _view.findViewById(R.id.linear133d);
		linear134d = _view.findViewById(R.id.linear134d);
		linear135d = _view.findViewById(R.id.linear135d);
		textview3129 = _view.findViewById(R.id.textview3129);
		linear1064 = _view.findViewById(R.id.linear1064);
		close131d = _view.findViewById(R.id.close131d);
		linear1092 = _view.findViewById(R.id.linear1092);
		textview2481 = _view.findViewById(R.id.textview2481);
		edittext132d = _view.findViewById(R.id.edittext132d);
		textview2482 = _view.findViewById(R.id.textview2482);
		textview132d = _view.findViewById(R.id.textview132d);
		textview2497 = _view.findViewById(R.id.textview2497);
		edittext133d = _view.findViewById(R.id.edittext133d);
		textview2498 = _view.findViewById(R.id.textview2498);
		textview133d = _view.findViewById(R.id.textview133d);
		textview2484 = _view.findViewById(R.id.textview2484);
		edittext134d = _view.findViewById(R.id.edittext134d);
		textview2485 = _view.findViewById(R.id.textview2485);
		textview134d = _view.findViewById(R.id.textview134d);
		textview2487 = _view.findViewById(R.id.textview2487);
		edittext135d = _view.findViewById(R.id.edittext135d);
		textview2488 = _view.findViewById(R.id.textview2488);
		textview135d = _view.findViewById(R.id.textview135d);
		linear1065 = _view.findViewById(R.id.linear1065);
		textview3130 = _view.findViewById(R.id.textview3130);
		linear1066 = _view.findViewById(R.id.linear1066);
		textview3131 = _view.findViewById(R.id.textview3131);
		linear1067 = _view.findViewById(R.id.linear1067);
		textview3132 = _view.findViewById(R.id.textview3132);
		textview3133 = _view.findViewById(R.id.textview3133);
		edittext238d = _view.findViewById(R.id.edittext238d);
		textview3134 = _view.findViewById(R.id.textview3134);
		textview3135 = _view.findViewById(R.id.textview3135);
		edittext239d = _view.findViewById(R.id.edittext239d);
		textview3136 = _view.findViewById(R.id.textview3136);
		textview3137 = _view.findViewById(R.id.textview3137);
		edittext234d = _view.findViewById(R.id.edittext234d);
		textview3138 = _view.findViewById(R.id.textview3138);
		textview3139 = _view.findViewById(R.id.textview3139);
		edittext235d = _view.findViewById(R.id.edittext235d);
		textview3140 = _view.findViewById(R.id.textview3140);
		textview3141 = _view.findViewById(R.id.textview3141);
		edittext230d = _view.findViewById(R.id.edittext230d);
		textview3142 = _view.findViewById(R.id.textview3142);
		textview3143 = _view.findViewById(R.id.textview3143);
		edittext231d = _view.findViewById(R.id.edittext231d);
		textview675d = _view.findViewById(R.id.textview675d);
		linear230d = _view.findViewById(R.id.linear230d);
		linear231d = _view.findViewById(R.id.linear231d);
		linear232d = _view.findViewById(R.id.linear232d);
		hscroll10 = _view.findViewById(R.id.hscroll10);
		button141d = _view.findViewById(R.id.button141d);
		linear141d = _view.findViewById(R.id.linear141d);
		textview676 = _view.findViewById(R.id.textview676);
		edittext15d = _view.findViewById(R.id.edittext15d);
		textview677 = _view.findViewById(R.id.textview677);
		textview678d = _view.findViewById(R.id.textview678d);
		textview679 = _view.findViewById(R.id.textview679);
		edittext16d = _view.findViewById(R.id.edittext16d);
		textview680 = _view.findViewById(R.id.textview680);
		textview681d = _view.findViewById(R.id.textview681d);
		textview682 = _view.findViewById(R.id.textview682);
		edittext17d = _view.findViewById(R.id.edittext17d);
		textview683 = _view.findViewById(R.id.textview683);
		textview684d = _view.findViewById(R.id.textview684d);
		linear1093 = _view.findViewById(R.id.linear1093);
		textview3144 = _view.findViewById(R.id.textview3144);
		linear142d = _view.findViewById(R.id.linear142d);
		linear143d = _view.findViewById(R.id.linear143d);
		linear144dd = _view.findViewById(R.id.linear144dd);
		linear145d = _view.findViewById(R.id.linear145d);
		textview3145 = _view.findViewById(R.id.textview3145);
		linear1068 = _view.findViewById(R.id.linear1068);
		close141d = _view.findViewById(R.id.close141d);
		linear1094 = _view.findViewById(R.id.linear1094);
		textview2419 = _view.findViewById(R.id.textview2419);
		edittext142d = _view.findViewById(R.id.edittext142d);
		textview2420 = _view.findViewById(R.id.textview2420);
		textview142d = _view.findViewById(R.id.textview142d);
		textview2500 = _view.findViewById(R.id.textview2500);
		edittext143d = _view.findViewById(R.id.edittext143d);
		textview2501 = _view.findViewById(R.id.textview2501);
		textview143d = _view.findViewById(R.id.textview143d);
		textview2422 = _view.findViewById(R.id.textview2422);
		edittext144d = _view.findViewById(R.id.edittext144d);
		textview2423 = _view.findViewById(R.id.textview2423);
		textview144d = _view.findViewById(R.id.textview144d);
		textview2425 = _view.findViewById(R.id.textview2425);
		edittext145d = _view.findViewById(R.id.edittext145d);
		textview2426 = _view.findViewById(R.id.textview2426);
		textview145d = _view.findViewById(R.id.textview145d);
		linear1069 = _view.findViewById(R.id.linear1069);
		textview3146 = _view.findViewById(R.id.textview3146);
		linear1070 = _view.findViewById(R.id.linear1070);
		textview3147 = _view.findViewById(R.id.textview3147);
		linear1071 = _view.findViewById(R.id.linear1071);
		textview3148 = _view.findViewById(R.id.textview3148);
		textview3149 = _view.findViewById(R.id.textview3149);
		edittext248d = _view.findViewById(R.id.edittext248d);
		textview3150 = _view.findViewById(R.id.textview3150);
		textview3151 = _view.findViewById(R.id.textview3151);
		edittext249d = _view.findViewById(R.id.edittext249d);
		textview3152 = _view.findViewById(R.id.textview3152);
		textview3153 = _view.findViewById(R.id.textview3153);
		edittext244d = _view.findViewById(R.id.edittext244d);
		textview3154 = _view.findViewById(R.id.textview3154);
		textview3155 = _view.findViewById(R.id.textview3155);
		edittext245d = _view.findViewById(R.id.edittext245d);
		textview3156 = _view.findViewById(R.id.textview3156);
		textview3157 = _view.findViewById(R.id.textview3157);
		edittext240d = _view.findViewById(R.id.edittext240d);
		textview3158 = _view.findViewById(R.id.textview3158);
		textview3159 = _view.findViewById(R.id.textview3159);
		edittext241d = _view.findViewById(R.id.edittext241d);
		textview685d = _view.findViewById(R.id.textview685d);
		linear234d = _view.findViewById(R.id.linear234d);
		linear235d = _view.findViewById(R.id.linear235d);
		linear236d = _view.findViewById(R.id.linear236d);
		hscroll11 = _view.findViewById(R.id.hscroll11);
		button151d = _view.findViewById(R.id.button151d);
		linear151d = _view.findViewById(R.id.linear151d);
		textview686 = _view.findViewById(R.id.textview686);
		edittext18d = _view.findViewById(R.id.edittext18d);
		textview687 = _view.findViewById(R.id.textview687);
		textview688d = _view.findViewById(R.id.textview688d);
		textview689 = _view.findViewById(R.id.textview689);
		edittext19d = _view.findViewById(R.id.edittext19d);
		textview690 = _view.findViewById(R.id.textview690);
		textview691d = _view.findViewById(R.id.textview691d);
		textview692 = _view.findViewById(R.id.textview692);
		edittext20d = _view.findViewById(R.id.edittext20d);
		textview693 = _view.findViewById(R.id.textview693);
		textview694d = _view.findViewById(R.id.textview694d);
		linear1095 = _view.findViewById(R.id.linear1095);
		textview4440 = _view.findViewById(R.id.textview4440);
		linear152d = _view.findViewById(R.id.linear152d);
		linear153d = _view.findViewById(R.id.linear153d);
		linear154d = _view.findViewById(R.id.linear154d);
		linear155d = _view.findViewById(R.id.linear155d);
		textview3160 = _view.findViewById(R.id.textview3160);
		linear1072 = _view.findViewById(R.id.linear1072);
		close151d = _view.findViewById(R.id.close151d);
		linear1096 = _view.findViewById(R.id.linear1096);
		textview2464 = _view.findViewById(R.id.textview2464);
		edittext152d = _view.findViewById(R.id.edittext152d);
		textview2465 = _view.findViewById(R.id.textview2465);
		textview2466 = _view.findViewById(R.id.textview2466);
		textview2503 = _view.findViewById(R.id.textview2503);
		edittext153d = _view.findViewById(R.id.edittext153d);
		textview2504 = _view.findViewById(R.id.textview2504);
		textview153d = _view.findViewById(R.id.textview153d);
		textview2467 = _view.findViewById(R.id.textview2467);
		edittext154d = _view.findViewById(R.id.edittext154d);
		textview2468 = _view.findViewById(R.id.textview2468);
		textview154d = _view.findViewById(R.id.textview154d);
		textview2470 = _view.findViewById(R.id.textview2470);
		edittext155d = _view.findViewById(R.id.edittext155d);
		textview2471 = _view.findViewById(R.id.textview2471);
		textview155d = _view.findViewById(R.id.textview155d);
		linear1073 = _view.findViewById(R.id.linear1073);
		textview3161 = _view.findViewById(R.id.textview3161);
		linear1074 = _view.findViewById(R.id.linear1074);
		textview3162 = _view.findViewById(R.id.textview3162);
		linear1075 = _view.findViewById(R.id.linear1075);
		textview3163 = _view.findViewById(R.id.textview3163);
		textview3164 = _view.findViewById(R.id.textview3164);
		edittext258d = _view.findViewById(R.id.edittext258d);
		textview3165 = _view.findViewById(R.id.textview3165);
		textview3166 = _view.findViewById(R.id.textview3166);
		edittext259d = _view.findViewById(R.id.edittext259d);
		textview3167 = _view.findViewById(R.id.textview3167);
		textview3168 = _view.findViewById(R.id.textview3168);
		edittext254d = _view.findViewById(R.id.edittext254d);
		textview3169 = _view.findViewById(R.id.textview3169);
		textview3170 = _view.findViewById(R.id.textview3170);
		edittext255d = _view.findViewById(R.id.edittext255d);
		textview3171 = _view.findViewById(R.id.textview3171);
		textview3172 = _view.findViewById(R.id.textview3172);
		edittext250d = _view.findViewById(R.id.edittext250d);
		textview3173 = _view.findViewById(R.id.textview3173);
		textview3174 = _view.findViewById(R.id.textview3174);
		edittext251d = _view.findViewById(R.id.edittext251d);
		textview668d = _view.findViewById(R.id.textview668d);
		linear227d = _view.findViewById(R.id.linear227d);
		linear74d = _view.findViewById(R.id.linear74d);
		linear228d = _view.findViewById(R.id.linear228d);
		hscroll13 = _view.findViewById(R.id.hscroll13);
		button161d = _view.findViewById(R.id.button161d);
		linear161d = _view.findViewById(R.id.linear161d);
		textview669 = _view.findViewById(R.id.textview669);
		edittext21d = _view.findViewById(R.id.edittext21d);
		textview670 = _view.findViewById(R.id.textview670);
		textview671d = _view.findViewById(R.id.textview671d);
		textview467 = _view.findViewById(R.id.textview467);
		edittext22d = _view.findViewById(R.id.edittext22d);
		textview286 = _view.findViewById(R.id.textview286);
		textview112d = _view.findViewById(R.id.textview112d);
		textview672 = _view.findViewById(R.id.textview672);
		edittext23d = _view.findViewById(R.id.edittext23d);
		textview673 = _view.findViewById(R.id.textview673);
		textview674d = _view.findViewById(R.id.textview674d);
		linear1097 = _view.findViewById(R.id.linear1097);
		textview3175 = _view.findViewById(R.id.textview3175);
		linear162d = _view.findViewById(R.id.linear162d);
		linear163d = _view.findViewById(R.id.linear163d);
		linear164d = _view.findViewById(R.id.linear164d);
		linear165d = _view.findViewById(R.id.linear165d);
		textview3176 = _view.findViewById(R.id.textview3176);
		linear1076 = _view.findViewById(R.id.linear1076);
		close161d = _view.findViewById(R.id.close161d);
		linear1098 = _view.findViewById(R.id.linear1098);
		textview2473 = _view.findViewById(R.id.textview2473);
		edittext162d = _view.findViewById(R.id.edittext162d);
		textview2474 = _view.findViewById(R.id.textview2474);
		textview162d = _view.findViewById(R.id.textview162d);
		textview2506 = _view.findViewById(R.id.textview2506);
		edittext163d = _view.findViewById(R.id.edittext163d);
		textview2507 = _view.findViewById(R.id.textview2507);
		textview163d = _view.findViewById(R.id.textview163d);
		textview2476 = _view.findViewById(R.id.textview2476);
		edittext164d = _view.findViewById(R.id.edittext164d);
		textview2477 = _view.findViewById(R.id.textview2477);
		textview164d = _view.findViewById(R.id.textview164d);
		textview2479 = _view.findViewById(R.id.textview2479);
		edittext165d = _view.findViewById(R.id.edittext165d);
		textview2480 = _view.findViewById(R.id.textview2480);
		textview165d = _view.findViewById(R.id.textview165d);
		linear1077 = _view.findViewById(R.id.linear1077);
		textview3177 = _view.findViewById(R.id.textview3177);
		linear1078 = _view.findViewById(R.id.linear1078);
		textview3178 = _view.findViewById(R.id.textview3178);
		linear1079 = _view.findViewById(R.id.linear1079);
		textview3179 = _view.findViewById(R.id.textview3179);
		textview3180 = _view.findViewById(R.id.textview3180);
		edittext268d = _view.findViewById(R.id.edittext268d);
		textview3181 = _view.findViewById(R.id.textview3181);
		textview3182 = _view.findViewById(R.id.textview3182);
		edittext269d = _view.findViewById(R.id.edittext269d);
		textview3183 = _view.findViewById(R.id.textview3183);
		textview3184 = _view.findViewById(R.id.textview3184);
		edittext264d = _view.findViewById(R.id.edittext264d);
		textview3185 = _view.findViewById(R.id.textview3185);
		textview3186 = _view.findViewById(R.id.textview3186);
		edittext265d = _view.findViewById(R.id.edittext265d);
		textview3187 = _view.findViewById(R.id.textview3187);
		textview3188 = _view.findViewById(R.id.textview3188);
		edittext260d = _view.findViewById(R.id.edittext260d);
		textview3189 = _view.findViewById(R.id.textview3189);
		textview3190 = _view.findViewById(R.id.textview3190);
		edittext261d = _view.findViewById(R.id.edittext261d);
		textview615d = _view.findViewById(R.id.textview615d);
		linear202d = _view.findViewById(R.id.linear202d);
		linear198d = _view.findViewById(R.id.linear198d);
		hscroll14 = _view.findViewById(R.id.hscroll14);
		button171d = _view.findViewById(R.id.button171d);
		linear171d = _view.findViewById(R.id.linear171d);
		linear218d = _view.findViewById(R.id.linear218d);
		textview642 = _view.findViewById(R.id.textview642);
		linear205d = _view.findViewById(R.id.linear205d);
		textview644 = _view.findViewById(R.id.textview644);
		linear203d = _view.findViewById(R.id.linear203d);
		textview657 = _view.findViewById(R.id.textview657);
		edittext26d = _view.findViewById(R.id.edittext26d);
		textview643 = _view.findViewById(R.id.textview643);
		edittext25d = _view.findViewById(R.id.edittext25d);
		textview641 = _view.findViewById(R.id.textview641);
		edittext24d = _view.findViewById(R.id.edittext24d);
		textview614 = _view.findViewById(R.id.textview614);
		edittext27d = _view.findViewById(R.id.edittext27d);
		textview612 = _view.findViewById(R.id.textview612);
		textview613d = _view.findViewById(R.id.textview613d);
		linear1099 = _view.findViewById(R.id.linear1099);
		textview3191 = _view.findViewById(R.id.textview3191);
		linear172d = _view.findViewById(R.id.linear172d);
		linear173d = _view.findViewById(R.id.linear173d);
		linear174d = _view.findViewById(R.id.linear174d);
		linear175d = _view.findViewById(R.id.linear175d);
		textview3192 = _view.findViewById(R.id.textview3192);
		linear1080 = _view.findViewById(R.id.linear1080);
		close171d = _view.findViewById(R.id.close171d);
		linear1100 = _view.findViewById(R.id.linear1100);
		textview2455 = _view.findViewById(R.id.textview2455);
		edittext172d = _view.findViewById(R.id.edittext172d);
		textview2456 = _view.findViewById(R.id.textview2456);
		textview172d = _view.findViewById(R.id.textview172d);
		textview2509 = _view.findViewById(R.id.textview2509);
		edittext173d = _view.findViewById(R.id.edittext173d);
		textview2510 = _view.findViewById(R.id.textview2510);
		textview173d = _view.findViewById(R.id.textview173d);
		textview2458 = _view.findViewById(R.id.textview2458);
		edittext174d = _view.findViewById(R.id.edittext174d);
		textview2459 = _view.findViewById(R.id.textview2459);
		textview174d = _view.findViewById(R.id.textview174d);
		textview2461 = _view.findViewById(R.id.textview2461);
		edittext175d = _view.findViewById(R.id.edittext175d);
		textview2462 = _view.findViewById(R.id.textview2462);
		textview175d = _view.findViewById(R.id.textview175d);
		linear1081 = _view.findViewById(R.id.linear1081);
		textview3193 = _view.findViewById(R.id.textview3193);
		linear1082 = _view.findViewById(R.id.linear1082);
		textview3194 = _view.findViewById(R.id.textview3194);
		linear1083 = _view.findViewById(R.id.linear1083);
		textview3195 = _view.findViewById(R.id.textview3195);
		textview3196 = _view.findViewById(R.id.textview3196);
		edittext278d = _view.findViewById(R.id.edittext278d);
		textview3197 = _view.findViewById(R.id.textview3197);
		textview3198 = _view.findViewById(R.id.textview3198);
		edittext279d = _view.findViewById(R.id.edittext279d);
		textview3199 = _view.findViewById(R.id.textview3199);
		textview3200 = _view.findViewById(R.id.textview3200);
		edittext274d = _view.findViewById(R.id.edittext274d);
		textview3201 = _view.findViewById(R.id.textview3201);
		textview3202 = _view.findViewById(R.id.textview3202);
		edittext275d = _view.findViewById(R.id.edittext275d);
		textview3203 = _view.findViewById(R.id.textview3203);
		textview3204 = _view.findViewById(R.id.textview3204);
		edittext270d = _view.findViewById(R.id.edittext270d);
		textview3205 = _view.findViewById(R.id.textview3205);
		textview3206 = _view.findViewById(R.id.textview3206);
		edittext271d = _view.findViewById(R.id.edittext271d);
		textview1211 = _view.findViewById(R.id.textview1211);
		linear459 = _view.findViewById(R.id.linear459);
		hscroll15 = _view.findViewById(R.id.hscroll15);
		button181d = _view.findViewById(R.id.button181d);
		linear181d = _view.findViewById(R.id.linear181d);
		textview1215 = _view.findViewById(R.id.textview1215);
		edittext28d = _view.findViewById(R.id.edittext28d);
		textview1216 = _view.findViewById(R.id.textview1216);
		textview1217 = _view.findViewById(R.id.textview1217);
		linear1101 = _view.findViewById(R.id.linear1101);
		textview3207 = _view.findViewById(R.id.textview3207);
		linear182d = _view.findViewById(R.id.linear182d);
		linear183d = _view.findViewById(R.id.linear183d);
		linear184d = _view.findViewById(R.id.linear184d);
		linear185d = _view.findViewById(R.id.linear185d);
		textview3208 = _view.findViewById(R.id.textview3208);
		linear1084 = _view.findViewById(R.id.linear1084);
		close181d = _view.findViewById(R.id.close181d);
		linear1102 = _view.findViewById(R.id.linear1102);
		textview2437 = _view.findViewById(R.id.textview2437);
		edittext182d = _view.findViewById(R.id.edittext182d);
		textview2438 = _view.findViewById(R.id.textview2438);
		textview182d = _view.findViewById(R.id.textview182d);
		textview2512 = _view.findViewById(R.id.textview2512);
		edittext183d = _view.findViewById(R.id.edittext183d);
		textview2513 = _view.findViewById(R.id.textview2513);
		textview183d = _view.findViewById(R.id.textview183d);
		textview2440 = _view.findViewById(R.id.textview2440);
		edittext184d = _view.findViewById(R.id.edittext184d);
		textview2441 = _view.findViewById(R.id.textview2441);
		textview184d = _view.findViewById(R.id.textview184d);
		textview2443 = _view.findViewById(R.id.textview2443);
		edittext185d = _view.findViewById(R.id.edittext185d);
		textview2444 = _view.findViewById(R.id.textview2444);
		textview185d = _view.findViewById(R.id.textview185d);
		linear1085 = _view.findViewById(R.id.linear1085);
		textview3209 = _view.findViewById(R.id.textview3209);
		linear1086 = _view.findViewById(R.id.linear1086);
		textview3210 = _view.findViewById(R.id.textview3210);
		linear1087 = _view.findViewById(R.id.linear1087);
		textview3211 = _view.findViewById(R.id.textview3211);
		textview3212 = _view.findViewById(R.id.textview3212);
		edittext288d = _view.findViewById(R.id.edittext288d);
		textview3213 = _view.findViewById(R.id.textview3213);
		textview3214 = _view.findViewById(R.id.textview3214);
		edittext289d = _view.findViewById(R.id.edittext289d);
		textview3215 = _view.findViewById(R.id.textview3215);
		textview3216 = _view.findViewById(R.id.textview3216);
		edittext284d = _view.findViewById(R.id.edittext284d);
		textview3217 = _view.findViewById(R.id.textview3217);
		textview3218 = _view.findViewById(R.id.textview3218);
		edittext285d = _view.findViewById(R.id.edittext285d);
		textview3219 = _view.findViewById(R.id.textview3219);
		textview3220 = _view.findViewById(R.id.textview3220);
		edittext280d = _view.findViewById(R.id.edittext280d);
		textview3221 = _view.findViewById(R.id.textview3221);
		textview3222 = _view.findViewById(R.id.textview3222);
		edittext281d = _view.findViewById(R.id.edittext281d);
		textview1218 = _view.findViewById(R.id.textview1218);
		edittext29d = _view.findViewById(R.id.edittext29d);
		textview1219 = _view.findViewById(R.id.textview1219);
		textview1220 = _view.findViewById(R.id.textview1220);
		textview695 = _view.findViewById(R.id.textview695);
		edittext30d = _view.findViewById(R.id.edittext30d);
		textview602 = _view.findViewById(R.id.textview602);
		textview30d = _view.findViewById(R.id.textview30d);
		
		close.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					
					            getParentFragmentManager().beginTransaction()
					                .remove(ToipqcDManholeConcreteFragmentActivity.this)
					                .commitNow();
					if (getActivity() instanceof ToipqcManholeConcreteActivity) {
										((ToipqcManholeConcreteActivity) getActivity())._recalculateSum();
								}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), "");
				}
			}
		});
		
		edittext2xd.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(_charSeq) == 00.00d) {
					edittext5d.setText(String.valueOf(00.00));
				}
				else {
					if (((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || edittext3d.getText().toString().equals("-")) || ((edittext4d.getText().toString().equals("") || edittext4d.getText().toString().equals(".")) || edittext4d.getText().toString().equals("-"))) {
						edittext5d.setText(String.valueOf(00.00));
					}
					else {
						edittext5d.setText(_English_Decimal_Format(Double.parseDouble(edittext3d.getText().toString()) - Double.parseDouble(edittext4d.getText().toString())));
					}
				}
				if (Double.parseDouble(_charSeq) == 00.00d) {
					edittext28d.setText(String.valueOf(00.00d));
				}
				else {
					if (Double.parseDouble(_charSeq) < 500) {
						if ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) {
							edittext28d.setText(String.valueOf(00.00d));
						}
						else {
							edittext28d.setText(_English_Decimal_Format(((Math.PI / 4) * (Math.pow(Double.parseDouble(edittext6d.getText().toString()), 2) * ((Double.parseDouble(_charSeq) + 100) / 1000))) - ((Double.parseDouble(edittext6d.getText().toString()) * (Double.parseDouble(_charSeq) / 1000)) * ((Double.parseDouble(_charSeq) + 100) / 1000))));
						}
					}
					else {
						if (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))) {
							edittext28d.setText(String.valueOf(00.00d));
						}
						else {
							edittext28d.setText(_English_Decimal_Format(((Double.parseDouble(edittext101d.getText().toString()) * Double.parseDouble(edittext102d.getText().toString())) * ((Double.parseDouble(_charSeq) + 100) / 1000)) - ((Double.parseDouble(edittext101d.getText().toString()) * (Double.parseDouble(_charSeq) / 1000)) * ((Double.parseDouble(_charSeq) + 100) / 1000))));
						}
					}
				}
				edittext_am5d.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext2d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext2d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext2xd.setText(String.valueOf(00.00));
				}
				else {
					edittext2xd.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
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
				final String _charSeq = _param1.toString();
				edittext3d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) == 00.00d) {
					edittext5d.setText(String.valueOf(00.00));
				}
				else {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || _charSeq.equals("-")) || ((edittext4d.getText().toString().equals("") || edittext4d.getText().toString().equals(".")) || edittext4d.getText().toString().equals("-"))) {
						edittext5d.setText(String.valueOf(00.00));
					}
					else {
						edittext5d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) - Double.parseDouble(edittext4d.getText().toString())));
					}
				}
				edittext_am5d.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString())));
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
				final String _charSeq = _param1.toString();
				edittext4d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) == 00.00d) {
					edittext5d.setText(String.valueOf(00.00));
				}
				else {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || _charSeq.equals("-")) || ((edittext3d.getText().toString().equals("") || edittext3d.getText().toString().equals(".")) || edittext3d.getText().toString().equals("-"))) {
						edittext5d.setText(String.valueOf(00.00));
					}
					else {
						edittext5d.setText(_English_Decimal_Format(Double.parseDouble(edittext3d.getText().toString()) - Double.parseDouble(_charSeq)));
					}
				}
				edittext_am5d.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext_am5d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				linear111d.setVisibility(View.GONE);
				linear121d.setVisibility(View.GONE);
				linear131d.setVisibility(View.GONE);
				linear141d.setVisibility(View.GONE);
				linear151d.setVisibility(View.GONE);
				linear161d.setVisibility(View.GONE);
				linear171d.setVisibility(View.GONE);
				linear181d.setVisibility(View.GONE);
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
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(edittext2xd.getText().toString()) == 00.00d) {
					SketchwareUtil.showMessage(getContext().getApplicationContext(), "من فضلك أدخل قطر ماسورة الخروج من المطبق أولآ");
					textview2d.setText(".................................");
					textview660d.setText("نوع المطبق وعدد حطاط الحائط :");
					edittext26d.setText("");
					edittext8d.setText("");
					edittext9d.setText("");
					edittext6d.setText("");
					textview136d.setText("سمك حائط الحطة الأخيرة\nسواء أسفل الغطاء ( رقبة المطبق )\nأو أسفل السقف ( م )");
					edittext7d.setText("");
					edittext11d.setText("");
					edittext13d.setText("");
					edittext21d.setText("");
					edittext15d.setText("");
					edittext16d.setText("");
					edittext18d.setText("");
					edittext19d.setText("");
					textview123d.setVisibility(View.GONE);
					linear222d.setVisibility(View.GONE);
					linear220d.setVisibility(View.GONE);
					linear221d.setVisibility(View.GONE);
					linear223d.setVisibility(View.GONE);
					linear229d.setVisibility(View.GONE);
					linear233d.setVisibility(View.GONE);
					linear226d.setVisibility(View.GONE);
					linear219d.setVisibility(View.GONE);
					linear457d.setVisibility(View.GONE);
					linear460d.setVisibility(View.GONE);
					linear144d.setVisibility(View.GONE);
					linear157d.setVisibility(View.GONE);
					linear158d.setVisibility(View.GONE);
					edittext101d.setText("");
					edittext102d.setText("");
					textview675d.setText("■ المائل");
					textview678d.setText("سمك حائط المائل\n( م )");
					textview681d.setText("ارتفاع المائل\n( م )");
					textview684d.setText("كمية الخرسانة العادية بالمائل\n( م٣ )");
					textview685d.setText("■ الحطة الأخيرة أسفل المائل مباشرة");
					textview688d.setText("سمك حائط الحطة الأخيرة أسفل المائل مباشرة ( م )");
					textview691d.setText("ارتفاع الحطة الأخيرة أسفل المائل مباشرة ( م )");
					textview694d.setText("كمية الخرسانة العادية بالحطة الأخيرة أسفل المائل مباشرة ( م٣ )");
					linear567d.setVisibility(View.GONE);
					textview568d.setVisibility(View.GONE);
					edittext103d.setText("");
					textview566d.setText("قطر الغطاء\n( م )");
					textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
					textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
				}
				else {
					if (Double.parseDouble(_charSeq) == 00.00d) {
						textview2d.setText(".................................");
						textview660d.setText("نوع المطبق وعدد حطاط الحائط :");
						edittext26d.setText("");
						edittext8d.setText("");
						edittext9d.setText("");
						edittext6d.setText("");
						textview136d.setText("سمك حائط الحطة الأخيرة\nسواء أسفل الغطاء ( رقبة المطبق )\nأو أسفل السقف ( م )");
						edittext7d.setText("");
						edittext11d.setText("");
						edittext13d.setText("");
						edittext21d.setText("");
						edittext15d.setText("");
						edittext16d.setText("");
						edittext18d.setText("");
						edittext19d.setText("");
						textview123d.setVisibility(View.GONE);
						linear222d.setVisibility(View.GONE);
						linear220d.setVisibility(View.GONE);
						linear221d.setVisibility(View.GONE);
						linear223d.setVisibility(View.GONE);
						linear229d.setVisibility(View.GONE);
						linear233d.setVisibility(View.GONE);
						linear226d.setVisibility(View.GONE);
						linear219d.setVisibility(View.GONE);
						linear457d.setVisibility(View.GONE);
						linear460d.setVisibility(View.GONE);
						linear144d.setVisibility(View.GONE);
						linear157d.setVisibility(View.GONE);
						linear158d.setVisibility(View.GONE);
						edittext101d.setText("");
						edittext102d.setText("");
						textview675d.setText("■ المائل");
						textview678d.setText("سمك حائط المائل\n( م )");
						textview681d.setText("ارتفاع المائل\n( م )");
						textview684d.setText("كمية الخرسانة العادية بالمائل\n( م٣ )");
						textview685d.setText("■ الحطة الأخيرة أسفل المائل مباشرة");
						textview688d.setText("سمك حائط الحطة الأخيرة أسفل المائل مباشرة ( م )");
						textview691d.setText("ارتفاع الحطة الأخيرة أسفل المائل مباشرة ( م )");
						textview694d.setText("كمية الخرسانة العادية بالحطة الأخيرة أسفل المائل مباشرة ( م٣ )");
						linear567d.setVisibility(View.GONE);
						textview568d.setVisibility(View.GONE);
						edittext103d.setText("");
						textview566d.setText("قطر الغطاء\n( م )");
						textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
						textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
					}
					else {
						if (Double.parseDouble(_charSeq) < 00) {
							textview2d.setText("ارتفاع المطبق أقل من الصفر\nوهذا غير هندسي وغير منطقي\nوعليه من فضلك أعد ملئ الخانات");
							textview660d.setText("نوع المطبق وعدد حطاط الحائط :");
							edittext26d.setText("");
							edittext8d.setText("");
							edittext9d.setText("");
							edittext6d.setText("");
							textview136d.setText("سمك حائط الحطة الأخيرة\nسواء أسفل الغطاء ( رقبة المطبق )\nأو أسفل السقف ( م )");
							edittext7d.setText("");
							edittext11d.setText("");
							edittext13d.setText("");
							edittext21d.setText("");
							edittext15d.setText("");
							edittext16d.setText("");
							edittext18d.setText("");
							edittext19d.setText("");
							textview123d.setVisibility(View.GONE);
							linear222d.setVisibility(View.GONE);
							linear220d.setVisibility(View.GONE);
							linear221d.setVisibility(View.GONE);
							linear223d.setVisibility(View.GONE);
							linear229d.setVisibility(View.GONE);
							linear233d.setVisibility(View.GONE);
							linear226d.setVisibility(View.GONE);
							linear219d.setVisibility(View.GONE);
							linear457d.setVisibility(View.GONE);
							linear460d.setVisibility(View.GONE);
							linear144d.setVisibility(View.GONE);
							linear157d.setVisibility(View.GONE);
							linear158d.setVisibility(View.GONE);
							edittext101d.setText("");
							edittext102d.setText("");
							textview675d.setText("■ المائل");
							textview678d.setText("سمك حائط المائل\n( م )");
							textview681d.setText("ارتفاع المائل\n( م )");
							textview684d.setText("كمية الخرسانة العادية بالمائل\n( م٣ )");
							textview685d.setText("■ الحطة الأخيرة أسفل المائل مباشرة");
							textview688d.setText("سمك حائط الحطة الأخيرة أسفل المائل مباشرة ( م )");
							textview691d.setText("ارتفاع الحطة الأخيرة أسفل المائل مباشرة ( م )");
							textview694d.setText("كمية الخرسانة العادية بالحطة الأخيرة أسفل المائل مباشرة ( م٣ )");
							linear567d.setVisibility(View.GONE);
							textview568d.setVisibility(View.GONE);
							edittext103d.setText("");
							textview566d.setText("قطر الغطاء\n( م )");
							textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
							textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
						}
						else {
							if (Double.parseDouble(edittext2xd.getText().toString()) < 500) {
								if (Double.parseDouble(_charSeq) < ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) {
									textview2d.setText("ارتفاع المطبق أقل من قطر المأسورة + ٦٠ سم والذي يعتبر أقل غطاء أعلي المواسير في الأرصفة\nوهذا غير هندسي وغير منطقي\nوعليه من فضلك أعد ملئ الخانات");
									textview660d.setText("نوع المطبق وعدد حطاط الحائط :");
									edittext26d.setText("");
									edittext8d.setText("");
									edittext9d.setText("");
									edittext6d.setText("");
									textview136d.setText("سمك حائط الحطة الأخيرة\nسواء أسفل الغطاء ( رقبة المطبق )\nأو أسفل السقف ( م )");
									edittext7d.setText("");
									edittext11d.setText("");
									edittext13d.setText("");
									edittext21d.setText("");
									edittext15d.setText("");
									edittext16d.setText("");
									edittext18d.setText("");
									edittext19d.setText("");
									textview123d.setVisibility(View.GONE);
									linear222d.setVisibility(View.GONE);
									linear220d.setVisibility(View.GONE);
									linear221d.setVisibility(View.GONE);
									linear223d.setVisibility(View.GONE);
									linear229d.setVisibility(View.GONE);
									linear233d.setVisibility(View.GONE);
									linear226d.setVisibility(View.GONE);
									linear219d.setVisibility(View.GONE);
									linear457d.setVisibility(View.GONE);
									linear460d.setVisibility(View.GONE);
									linear144d.setVisibility(View.GONE);
									linear157d.setVisibility(View.GONE);
									linear158d.setVisibility(View.GONE);
									edittext101d.setText("");
									edittext102d.setText("");
									textview675d.setText("■ المائل");
									textview678d.setText("سمك حائط المائل\n( م )");
									textview681d.setText("ارتفاع المائل\n( م )");
									textview684d.setText("كمية الخرسانة العادية بالمائل\n( م٣ )");
									textview685d.setText("■ الحطة الأخيرة أسفل المائل مباشرة");
									textview688d.setText("سمك حائط الحطة الأخيرة أسفل المائل مباشرة ( م )");
									textview691d.setText("ارتفاع الحطة الأخيرة أسفل المائل مباشرة ( م )");
									textview694d.setText("كمية الخرسانة العادية بالحطة الأخيرة أسفل المائل مباشرة ( م٣ )");
									linear567d.setVisibility(View.GONE);
									textview568d.setVisibility(View.GONE);
									edittext103d.setText("");
									textview566d.setText("قطر الغطاء\n( م )");
									textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
									textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
								}
								else {
									if ((Double.parseDouble(_charSeq) == ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) || (((Double.parseDouble(_charSeq) > ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) && (Double.parseDouble(_charSeq) < 1.5d)) || (Double.parseDouble(_charSeq) == 1.5d))) {
										textview2d.setText("المطبق فئة حتي ١.٥٠ م");
										textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق دائرى\nالمطبق فئة أولي قطر داخلى ١.٠٠ م\nعبارة عن قاعدة مقاس ١.٨٠ × ١.٨٠ × ٠.٤٠ م\nوحطة واحدة بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٢٥ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٦٠ م");
									}
									else {
										if (((Double.parseDouble(_charSeq) > 1.50d) && (Double.parseDouble(_charSeq) < 2.00d)) || (Double.parseDouble(_charSeq) == 2.00d)) {
											textview2d.setText("المطبق فئة أكبر من ١.٥٠ وحتي ٢.٠٠ م");
											textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق دائرى\nالمطبق فئة ثانية قطر داخلى ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.٠٠ × ٢.٠٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٢٥ م\nوحطة أخيرة ( مائل ) بارتفاع ٥٠ سم وسمك الحائط بالحطة ٠.٢٥ م\nورقبة بارتفاع ٠.٢٥ م وبسمك ٠.٢٥ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٦٠ م");
										}
										else {
											if (((Double.parseDouble(_charSeq) > 2.00d) && (Double.parseDouble(_charSeq) < 2.5d)) || (Double.parseDouble(_charSeq) == 2.5d)) {
												textview2d.setText("المطبق فئة أكبر من ٢.٠٠ وحتي ٢.٥٠ م");
												textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق دائرى\nالمطبق فئة ثانية قطر داخلى ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.٠٠ × ٢.٠٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٢٥ م\nوحطة أخيرة ( مائل ) بارتفاع ٥٠ سم وسمك الحائط بالحطة ٠.٢٥ م\nورقبة بارتفاع ٠.٢٥ م وبسمك ٠.٢٥ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٦٠ م");
											}
											else {
												if (((Double.parseDouble(_charSeq) > 2.50d) && (Double.parseDouble(_charSeq) < 3.00d)) || (Double.parseDouble(_charSeq) == 3.00d)) {
													textview2d.setText("المطبق فئة أكبر من ٢.٥٠ وحتي ٣.٠٠ م");
													textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق دائرى\nالمطبق فئة ثالثة قطر داخلى ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.١٠ × ٢.١٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٠ م\nوحطة أخيرة ( مائل ) بارتفاع ١.٠٠ م وسمك الحائط بالحطة ٠.٢٥ م\nورقبة بارتفاع ٠.٢٥ م وبسمك ٠.٢٥ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٦٠ م");
												}
												else {
													if (((Double.parseDouble(_charSeq) > 3.00d) && (Double.parseDouble(_charSeq) < 3.5d)) || (Double.parseDouble(_charSeq) == 3.5d)) {
														textview2d.setText("المطبق فئة أكبر من ٣.٠٠ وحتي ٣.٥٠ م");
														textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق دائرى\nالمطبق فئة ثالثة قطر داخلى ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.١٠ × ٢.١٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٠ م\nوحطة أخيرة ( مائل ) بارتفاع ١.٠٠ م وسمك الحائط بالحطة ٠.٢٥ م\nورقبة بارتفاع ٠.٢٥ م وبسمك ٠.٢٥ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٦٠ م");
													}
													else {
														if (((Double.parseDouble(_charSeq) > 3.50d) && (Double.parseDouble(_charSeq) < 4.00d)) || (Double.parseDouble(_charSeq) == 4.00d)) {
															textview2d.setText("المطبق فئة أكبر من ٣.٥٠ وحتي ٤.٠٠ م");
															textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق دائرى\nالمطبق فئة أخيرة قطر داخلى ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.٢٠ × ٢.٢٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوحطة أخيرة ( مائل ) بارتفاع ١.٠٠ م وسمك الحائط بالحطة ٠.٢٥ م\nورقبة بارتفاع ٠.٢٥ م وبسمك ٠.٢٥ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
														}
														else {
															if (((Double.parseDouble(_charSeq) > 4.00d) && (Double.parseDouble(_charSeq) < 4.5d)) || (Double.parseDouble(_charSeq) == 4.5d)) {
																textview2d.setText("المطبق فئة أكبر من ٤.٠٠ وحتي ٤.٥٠ م");
																textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق دائرى\nالمطبق فئة أخيرة قطر داخلى ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.٢٠ × ٢.٢٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوحطة أخيرة ( مائل ) بارتفاع ١.٠٠ م وسمك الحائط بالحطة ٠.٢٥ م\nورقبة بارتفاع ٠.٢٥ م وبسمك ٠.٢٥ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
															}
															else {
																if (((Double.parseDouble(_charSeq) > 4.50d) && (Double.parseDouble(_charSeq) < 5.00d)) || (Double.parseDouble(_charSeq) == 5.00d)) {
																	textview2d.setText("المطبق فئة أكبر من ٤.٥٠ وحتي ٥.٠٠ م");
																	textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق دائرى\nالمطبق فئة أخيرة قطر داخلى ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.٢٠ × ٢.٢٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوحطة أخيرة ( مائل ) بارتفاع ١.٠٠ م وسمك الحائط بالحطة ٠.٢٥ م\nورقبة بارتفاع ٠.٢٥ م وبسمك ٠.٢٥ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																}
																else {
																	if (((Double.parseDouble(_charSeq) > 5.00d) && (Double.parseDouble(_charSeq) < 5.50d)) || (Double.parseDouble(_charSeq) == 5.50d)) {
																		textview2d.setText("المطبق فئة أكبر من ٥.٠٠ وحتي ٥.٥٠ م");
																		textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق دائرى\nالمطبق فئة أخيرة قطر داخلى ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.٢٠ × ٢.٢٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوحطة أخيرة ( مائل ) بارتفاع ١.٠٠ م وسمك الحائط بالحطة ٠.٢٥ م\nورقبة بارتفاع ٠.٢٥ م وبسمك ٠.٢٥ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																	}
																	else {
																		if (((Double.parseDouble(_charSeq) > 5.50d) && (Double.parseDouble(_charSeq) < 6.00d)) || (Double.parseDouble(_charSeq) == 6.00d)) {
																			textview2d.setText("المطبق فئة أكبر من ٥.٥٠ وحتي ٦.٠٠ م");
																			textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق دائرى\nالمطبق فئة أخيرة قطر داخلى ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.٢٠ × ٢.٢٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوحطة أخيرة ( مائل ) بارتفاع ١.٠٠ م وسمك الحائط بالحطة ٠.٢٥ م\nورقبة بارتفاع ٠.٢٥ م وبسمك ٠.٢٥ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																		}
																		else {
																			if (((Double.parseDouble(_charSeq) > 6.00d) && (Double.parseDouble(_charSeq) < 6.50d)) || (Double.parseDouble(_charSeq) == 6.50d)) {
																				textview2d.setText("المطبق فئة أكبر من ٦.٠٠ وحتي ٦.٥٠ م");
																				textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق دائرى\nالمطبق فئة أخيرة قطر داخلى ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.٢٠ × ٢.٢٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوحطة أخيرة ( مائل ) بارتفاع ١.٠٠ م وسمك الحائط بالحطة ٠.٢٥ م\nورقبة بارتفاع ٠.٢٥ م وبسمك ٠.٢٥ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																			}
																			else {
																				if (Double.parseDouble(_charSeq) > 6.50d) {
																					textview2d.setText("المطبق فئة أكبر من ٦.٥٠ م");
																					textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق دائرى\nالمطبق فئة أخيرة قطر داخلى ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.٢٠ × ٢.٢٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوحطة أخيرة ( مائل ) بارتفاع ١.٠٠ م وسمك الحائط بالحطة ٠.٢٥ م\nورقبة بارتفاع ٠.٢٥ م وبسمك ٠.٢٥ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
									if (Double.parseDouble(_charSeq) > 3.50d) {
										edittext26d.setText(String.valueOf(Double.parseDouble("0.40")));
										edittext8d.setText(String.valueOf(Double.parseDouble("0.76")));
										edittext9d.setText(String.valueOf(Double.parseDouble("0.23")));
										edittext6d.setText(String.valueOf(Double.parseDouble("1.20")));
										textview136d.setText("سمك حائط الحطة الأخيرة\nأسفل الغطاء ( رقبة المطبق )\n( م )");
										edittext7d.setText(String.valueOf(Double.parseDouble("0.25")));
										edittext11d.setText("");
										edittext13d.setText(String.valueOf(Double.parseDouble("0.25")));
										edittext21d.setText(String.valueOf(Double.parseDouble("0.35")));
										edittext15d.setText(String.valueOf(Double.parseDouble("0.25")));
										edittext16d.setText(String.valueOf(Double.parseDouble("1")));
										edittext18d.setText(String.valueOf(Double.parseDouble("0.30")));
										edittext19d.setText(String.valueOf(Double.parseDouble("1.50")));
										textview123d.setVisibility(View.VISIBLE);
										linear222d.setVisibility(View.VISIBLE);
										linear220d.setVisibility(View.VISIBLE);
										linear221d.setVisibility(View.GONE);
										linear223d.setVisibility(View.VISIBLE);
										linear229d.setVisibility(View.VISIBLE);
										linear233d.setVisibility(View.VISIBLE);
										linear226d.setVisibility(View.VISIBLE);
										linear219d.setVisibility(View.VISIBLE);
										linear457d.setVisibility(View.VISIBLE);
										linear460d.setVisibility(View.GONE);
										linear144d.setVisibility(View.VISIBLE);
										linear157d.setVisibility(View.VISIBLE);
										linear158d.setVisibility(View.GONE);
										edittext101d.setText("");
										edittext102d.setText("");
										textview675d.setText("■ المائل");
										textview678d.setText("سمك حائط المائل\n( م )");
										textview681d.setText("ارتفاع المائل\n( م )");
										textview684d.setText("كمية الخرسانة العادية بالمائل\n( م٣ )");
										textview685d.setText("■ الحطة الأخيرة أسفل المائل مباشرة");
										textview688d.setText("سمك حائط الحطة الأخيرة أسفل المائل مباشرة ( م )");
										textview691d.setText("ارتفاع الحطة الأخيرة أسفل المائل مباشرة ( م )");
										textview694d.setText("كمية الخرسانة العادية بالحطة الأخيرة أسفل المائل مباشرة ( م٣ )");
										linear567d.setVisibility(View.GONE);
										textview568d.setVisibility(View.GONE);
										edittext103d.setText("");
										textview566d.setText("قطر الغطاء\n( م )");
										textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
										textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
									}
									else {
										if ((Double.parseDouble(_charSeq) > 2.50d) && ((Double.parseDouble(_charSeq) < 3.50d) || (Double.parseDouble(_charSeq) == 3.50d))) {
											edittext26d.setText(String.valueOf(Double.parseDouble("0.40")));
											edittext8d.setText(String.valueOf(Double.parseDouble("0.60")));
											edittext9d.setText(String.valueOf(Double.parseDouble("0.23")));
											edittext6d.setText(String.valueOf(Double.parseDouble("1.20")));
											textview136d.setText("سمك حائط الحطة الأخيرة\nأسفل الغطاء ( رقبة المطبق )\n( م )");
											edittext7d.setText(String.valueOf(Double.parseDouble("0.25")));
											edittext11d.setText("");
											edittext13d.setText(String.valueOf(Double.parseDouble("0.25")));
											edittext21d.setText(String.valueOf(Double.parseDouble("0.3")));
											edittext15d.setText(String.valueOf(Double.parseDouble("0.25")));
											edittext16d.setText(String.valueOf(Double.parseDouble("1")));
											edittext18d.setText("");
											edittext19d.setText("");
											textview123d.setVisibility(View.VISIBLE);
											linear222d.setVisibility(View.VISIBLE);
											linear220d.setVisibility(View.VISIBLE);
											linear221d.setVisibility(View.GONE);
											linear223d.setVisibility(View.VISIBLE);
											linear229d.setVisibility(View.VISIBLE);
											linear233d.setVisibility(View.GONE);
											linear226d.setVisibility(View.VISIBLE);
											linear219d.setVisibility(View.VISIBLE);
											linear457d.setVisibility(View.VISIBLE);
											linear460d.setVisibility(View.GONE);
											linear144d.setVisibility(View.VISIBLE);
											linear157d.setVisibility(View.VISIBLE);
											linear158d.setVisibility(View.GONE);
											edittext101d.setText("");
											edittext102d.setText("");
											textview675d.setText("■ المائل");
											textview678d.setText("سمك حائط المائل\n( م )");
											textview681d.setText("ارتفاع المائل\n( م )");
											textview684d.setText("كمية الخرسانة العادية بالمائل\n( م٣ )");
											textview685d.setText("■ الحطة الأخيرة أسفل المائل مباشرة");
											textview688d.setText("سمك حائط الحطة الأخيرة أسفل المائل مباشرة ( م )");
											textview691d.setText("ارتفاع الحطة الأخيرة أسفل المائل مباشرة ( م )");
											textview694d.setText("كمية الخرسانة العادية بالحطة الأخيرة أسفل المائل مباشرة ( م٣ )");
											linear567d.setVisibility(View.GONE);
											textview568d.setVisibility(View.GONE);
											edittext103d.setText("");
											textview566d.setText("قطر الغطاء\n( م )");
											textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
											textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
										}
										else {
											if ((Double.parseDouble(_charSeq) > 1.50d) && ((Double.parseDouble(_charSeq) < 2.5d) || (Double.parseDouble(_charSeq) == 2.5d))) {
												edittext26d.setText(String.valueOf(Double.parseDouble("0.40")));
												edittext8d.setText(String.valueOf(Double.parseDouble("0.60")));
												edittext9d.setText(String.valueOf(Double.parseDouble("0.23")));
												edittext6d.setText(String.valueOf(Double.parseDouble("1.20")));
												textview136d.setText("سمك حائط الحطة الأخيرة\nأسفل الغطاء ( رقبة المطبق )\n( م )");
												edittext7d.setText(String.valueOf(Double.parseDouble("0.25")));
												edittext11d.setText("");
												edittext13d.setText(String.valueOf(Double.parseDouble("0.25")));
												edittext21d.setText(String.valueOf(Double.parseDouble("0.25")));
												edittext15d.setText(String.valueOf(Double.parseDouble("0.25")));
												edittext16d.setText(String.valueOf(Double.parseDouble("0.50")));
												edittext18d.setText("");
												edittext19d.setText("");
												textview123d.setVisibility(View.VISIBLE);
												linear222d.setVisibility(View.VISIBLE);
												linear220d.setVisibility(View.VISIBLE);
												linear221d.setVisibility(View.GONE);
												linear223d.setVisibility(View.VISIBLE);
												linear229d.setVisibility(View.VISIBLE);
												linear233d.setVisibility(View.GONE);
												linear226d.setVisibility(View.VISIBLE);
												linear219d.setVisibility(View.VISIBLE);
												linear457d.setVisibility(View.VISIBLE);
												linear460d.setVisibility(View.GONE);
												linear144d.setVisibility(View.VISIBLE);
												linear157d.setVisibility(View.VISIBLE);
												linear158d.setVisibility(View.GONE);
												edittext101d.setText("");
												edittext102d.setText("");
												textview675d.setText("■ المائل");
												textview678d.setText("سمك حائط المائل\n( م )");
												textview681d.setText("ارتفاع المائل\n( م )");
												textview684d.setText("كمية الخرسانة العادية بالمائل\n( م٣ )");
												textview685d.setText("■ الحطة الأخيرة أسفل المائل مباشرة");
												textview688d.setText("سمك حائط الحطة الأخيرة أسفل المائل مباشرة ( م )");
												textview691d.setText("ارتفاع الحطة الأخيرة أسفل المائل مباشرة ( م )");
												textview694d.setText("كمية الخرسانة العادية بالحطة الأخيرة أسفل المائل مباشرة ( م٣ )");
												linear567d.setVisibility(View.GONE);
												textview568d.setVisibility(View.GONE);
												edittext103d.setText("");
												textview566d.setText("قطر الغطاء\n( م )");
												textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
												textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
											}
											else {
												if (((Double.parseDouble(_charSeq) == ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) || (Double.parseDouble(_charSeq) > ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d))) && ((Double.parseDouble(_charSeq) < 1.5d) || (Double.parseDouble(_charSeq) == 1.5d))) {
													edittext26d.setText(String.valueOf(Double.parseDouble("0.40")));
													edittext8d.setText(String.valueOf(Double.parseDouble("0.60")));
													edittext9d.setText(String.valueOf(Double.parseDouble("0.23")));
													edittext6d.setText(String.valueOf(Double.parseDouble("1.00")));
													textview136d.setText("سمك الحائط أسفل السقف\n( م )");
													edittext7d.setText(String.valueOf(Double.parseDouble("0.25")));
													edittext11d.setText(String.valueOf(Double.parseDouble("0.20")));
													edittext13d.setText("");
													edittext21d.setText(String.valueOf(Double.parseDouble("0.25")));
													edittext15d.setText("");
													edittext16d.setText("");
													edittext18d.setText("");
													edittext19d.setText("");
													textview123d.setVisibility(View.VISIBLE);
													linear222d.setVisibility(View.VISIBLE);
													linear220d.setVisibility(View.VISIBLE);
													linear221d.setVisibility(View.VISIBLE);
													linear223d.setVisibility(View.GONE);
													linear229d.setVisibility(View.GONE);
													linear233d.setVisibility(View.GONE);
													linear226d.setVisibility(View.VISIBLE);
													linear219d.setVisibility(View.VISIBLE);
													linear457d.setVisibility(View.VISIBLE);
													linear460d.setVisibility(View.VISIBLE);
													linear144d.setVisibility(View.VISIBLE);
													linear157d.setVisibility(View.VISIBLE);
													linear158d.setVisibility(View.GONE);
													edittext101d.setText("");
													edittext102d.setText("");
													textview675d.setText("■ المائل");
													textview678d.setText("سمك حائط المائل\n( م )");
													textview681d.setText("ارتفاع المائل\n( م )");
													textview684d.setText("كمية الخرسانة العادية بالمائل\n( م٣ )");
													textview685d.setText("■ الحطة الأخيرة أسفل المائل مباشرة");
													textview688d.setText("سمك حائط الحطة الأخيرة أسفل المائل مباشرة ( م )");
													textview691d.setText("ارتفاع الحطة الأخيرة أسفل المائل مباشرة ( م )");
													textview694d.setText("كمية الخرسانة العادية بالحطة الأخيرة أسفل المائل مباشرة ( م٣ )");
													linear567d.setVisibility(View.GONE);
													textview568d.setVisibility(View.GONE);
													edittext103d.setText("");
													textview566d.setText("قطر الغطاء\n( م )");
													textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
													textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
												}
											}
										}
									}
								}
							}
							else {
								if (((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (Double.parseDouble(edittext2xd.getText().toString()) == 600)) || ((Double.parseDouble(edittext2xd.getText().toString()) > 500) && (Double.parseDouble(edittext2xd.getText().toString()) < 600))) {
									if (Double.parseDouble(_charSeq) < ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) {
										textview2d.setText("ارتفاع المطبق أقل من قطر المأسورة + ٦٠ سم والذي يعتبر أقل غطاء أعلي المواسير في الأرصفة\nوهذا غير هندسي وغير منطقي\nوعليه من فضلك أعد ملئ الخانات");
										textview660d.setText("نوع المطبق وعدد حطاط الحائط :");
										edittext26d.setText("");
										edittext8d.setText("");
										edittext9d.setText("");
										edittext6d.setText("");
										textview136d.setText("سمك الخرسانة حول الغطاء ( م )");
										edittext7d.setText("");
										edittext11d.setText("");
										edittext13d.setText("");
										edittext21d.setText("");
										edittext15d.setText("");
										edittext16d.setText("");
										edittext18d.setText("");
										edittext19d.setText("");
										textview123d.setVisibility(View.GONE);
										linear222d.setVisibility(View.GONE);
										linear220d.setVisibility(View.GONE);
										linear221d.setVisibility(View.GONE);
										linear223d.setVisibility(View.GONE);
										linear229d.setVisibility(View.GONE);
										linear233d.setVisibility(View.GONE);
										linear226d.setVisibility(View.GONE);
										linear219d.setVisibility(View.GONE);
										linear457d.setVisibility(View.GONE);
										linear460d.setVisibility(View.GONE);
										linear144d.setVisibility(View.GONE);
										linear157d.setVisibility(View.GONE);
										linear158d.setVisibility(View.GONE);
										edittext101d.setText("");
										edittext102d.setText("");
										textview675d.setText("■ الحطة أسفل السقف مباشرة");
										textview678d.setText("سمك الحطة أسفل السقف مباشرة\n( م )");
										textview681d.setText("ارتفاع الحطة أسفل السقف مباشرة\n( م )");
										textview684d.setText("كمية الخرسانة بالحطة أسفل السقف مباشرة\n( م٣ )");
										textview685d.setText("■ الحطة الوسطية بالمطبق");
										textview688d.setText("سمك الحطة الوسطية بالمطبق\n( م )");
										textview691d.setText("ارتفاع الحطة الوسطية بالمطبق\n( م )");
										textview694d.setText("كمية الخرسانة بالحطة الوسطية بالمطبق\n( م٣ )");
										linear567d.setVisibility(View.GONE);
										textview568d.setVisibility(View.GONE);
										edittext103d.setText("");
										textview566d.setText("قطر الغطاء\n( م )");
										textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
										textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
									}
									else {
										if (((Double.parseDouble(_charSeq) == ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) || (Double.parseDouble(_charSeq) > ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d))) && ((Double.parseDouble(_charSeq) < 1.5d) || (Double.parseDouble(_charSeq) == 1.5d))) {
											textview2d.setText("المطبق فئة حتي ١.٥٠ م");
											textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة أولي بالنسبة للمطابق المربعة بأبعاد داخلية ١.٢٠ × ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.١٠ × ٢.١٠ × ٠.٤٠ م\nوحطة واحدة بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
										}
										else {
											if ((Double.parseDouble(_charSeq) > 1.50d) && ((Double.parseDouble(_charSeq) < 2.00d) || (Double.parseDouble(_charSeq) == 2.00d))) {
												textview2d.setText("المطبق فئة أكبر من ١.٥٠ وحتي ٢.٠٠ م");
												textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة أولي بالنسبة للمطابق المربعة بأبعاد داخلية ١.٢٠ × ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.١٠ × ٢.١٠ × ٠.٤٠ م\nوحطة واحدة بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
											}
											else {
												if ((Double.parseDouble(_charSeq) > 2.00d) && ((Double.parseDouble(_charSeq) < 2.5d) || (Double.parseDouble(_charSeq) == 2.5d))) {
													textview2d.setText("المطبق فئة أكبر من ٢.٠٠ وحتي ٢.٥٠ م");
													textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة أولي بالنسبة للمطابق المربعة بأبعاد داخلية ١.٢٠ × ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.١٠ × ٢.١٠ × ٠.٤٠ م\nوحطة واحدة بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
												}
												else {
													if ((Double.parseDouble(_charSeq) > 2.50d) && (Double.parseDouble(_charSeq) < 3.00d)) {
														textview2d.setText("المطبق فئة أكبر من ٢.٥٠ وحتي ٣.٠٠ م");
														textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة أولي بالنسبة للمطابق المربعة بأبعاد داخلية ١.٢٠ × ١.٢٠ م\nعبارة عن قاعدة مقاس ٢.١٠ × ٢.١٠ × ٠.٤٠ م\nوحطة واحدة بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
													}
													else {
														if (((Double.parseDouble(_charSeq) == 3.00d) || (Double.parseDouble(_charSeq) > 3.00d)) && ((Double.parseDouble(_charSeq) < 3.5d) || (Double.parseDouble(_charSeq) == 3.5d))) {
															textview2d.setText("المطبق فئة من ٣.٠٠ وحتي ٣.٥٠ م");
															textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nفئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية ١.٥٠ × ١.٥٠ م\nعبارة عن قاعدة مقاس ٢.٥٠ × ٢.٥٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.١٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
														}
														else {
															if ((Double.parseDouble(_charSeq) > 3.50d) && ((Double.parseDouble(_charSeq) < 4.00d) || (Double.parseDouble(_charSeq) == 4.00d))) {
																textview2d.setText("المطبق فئة أكبر من ٣.٥٠ وحتي ٤.٠٠ م");
																textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nفئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية ١.٥٠ × ١.٥٠ م\nعبارة عن قاعدة مقاس ٢.٥٠ × ٢.٥٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.١٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
															}
															else {
																if ((Double.parseDouble(_charSeq) > 4.00d) && ((Double.parseDouble(_charSeq) < 4.5d) || (Double.parseDouble(_charSeq) == 4.5d))) {
																	textview2d.setText("المطبق فئة أكبر من ٤.٠٠ وحتي ٤.٥٠ م");
																	textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nفئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية ١.٥٠ × ١.٥٠ م\nعبارة عن قاعدة مقاس ٢.٥٠ × ٢.٥٠ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.١٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																}
																else {
																	if ((Double.parseDouble(_charSeq) > 4.50d) && ((Double.parseDouble(_charSeq) < 5.00d) || (Double.parseDouble(_charSeq) == 5.00d))) {
																		textview2d.setText("المطبق فئة أكبر من ٤.٥٠ وحتي ٥.٠٠ م");
																		textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nفئة أخيرة بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٨٥ × ٢.٨٥ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.١٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																	}
																	else {
																		if ((Double.parseDouble(_charSeq) > 5.00d) && ((Double.parseDouble(_charSeq) < 5.50d) || (Double.parseDouble(_charSeq) == 5.50d))) {
																			textview2d.setText("المطبق فئة أكبر من ٥.٠٠ وحتي ٥.٥٠ م");
																			textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nفئة أخيرة بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٨٥ × ٢.٨٥ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.٠٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																		}
																		else {
																			if ((Double.parseDouble(_charSeq) > 5.50d) && ((Double.parseDouble(_charSeq) < 6.00d) || (Double.parseDouble(_charSeq) == 6.00d))) {
																				textview2d.setText("المطبق فئة أكبر من ٥.٥٠ وحتي ٦.٠٠ م");
																				textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nفئة أخيرة بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٨٥ × ٢.٨٥ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.٠٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																			}
																			else {
																				if ((Double.parseDouble(_charSeq) > 6.00d) && ((Double.parseDouble(_charSeq) < 6.50d) || (Double.parseDouble(_charSeq) == 6.50d))) {
																					textview2d.setText("المطبق فئة أكبر من ٦.٠٠ وحتي ٦.٥٠ م");
																					textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nفئة أخيرة بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٨٥ × ٢.٨٥ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.٠٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																				}
																				else {
																					if (Double.parseDouble(_charSeq) > 6.50d) {
																						textview2d.setText("المطبق فئة أكبر من ٦.٥٠ م");
																						textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nفئة أخيرة بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٨٥ × ٢.٨٥ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.٠٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
										if (((Double.parseDouble(_charSeq) == ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) || (Double.parseDouble(_charSeq) > ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d))) && (Double.parseDouble(_charSeq) < 3.00d)) {
											edittext26d.setText(String.valueOf(Double.parseDouble("0.40")));
											edittext8d.setText(String.valueOf(Double.parseDouble("0.76")));
											edittext9d.setText(String.valueOf(Double.parseDouble("0.23")));
											edittext6d.setText("");
											edittext101d.setText(String.valueOf(Double.parseDouble("1.20")));
											edittext102d.setText(String.valueOf(Double.parseDouble("1.20")));
											textview136d.setText("سمك الخرسانة حول الغطاء ( م )");
											edittext7d.setText(String.valueOf(Double.parseDouble("0.25")));
											edittext11d.setText(String.valueOf(Double.parseDouble("0.20")));
											edittext13d.setText("");
											edittext21d.setText(String.valueOf(Double.parseDouble("0.30")));
											edittext15d.setText("");
											edittext16d.setText("");
											edittext18d.setText("");
											edittext19d.setText("");
											textview123d.setVisibility(View.VISIBLE);
											linear222d.setVisibility(View.VISIBLE);
											linear220d.setVisibility(View.VISIBLE);
											linear221d.setVisibility(View.VISIBLE);
											linear223d.setVisibility(View.GONE);
											linear229d.setVisibility(View.GONE);
											linear233d.setVisibility(View.GONE);
											linear226d.setVisibility(View.VISIBLE);
											linear219d.setVisibility(View.VISIBLE);
											linear457d.setVisibility(View.VISIBLE);
											linear460d.setVisibility(View.VISIBLE);
											linear144d.setVisibility(View.VISIBLE);
											linear157d.setVisibility(View.GONE);
											linear158d.setVisibility(View.VISIBLE);
											textview675d.setText("■ الحطة أسفل السقف مباشرة");
											textview678d.setText("سمك الحطة أسفل السقف مباشرة\n( م )");
											textview681d.setText("ارتفاع الحطة أسفل السقف مباشرة\n( م )");
											textview684d.setText("كمية الخرسانة بالحطة أسفل السقف مباشرة\n( م٣ )");
											textview685d.setText("■ الحطة الوسطية بالمطبق");
											textview688d.setText("سمك الحطة الوسطية بالمطبق\n( م )");
											textview691d.setText("ارتفاع الحطة الوسطية بالمطبق\n( م )");
											textview694d.setText("كمية الخرسانة بالحطة الوسطية بالمطبق\n( م٣ )");
											linear567d.setVisibility(View.GONE);
											textview568d.setVisibility(View.GONE);
											edittext103d.setText("");
											textview566d.setText("قطر الغطاء\n( م )");
											textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
											textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
										}
										else {
											if (((Double.parseDouble(_charSeq) > 3.00d) || (Double.parseDouble(_charSeq) == 3.00d)) && ((Double.parseDouble(_charSeq) < 4.5d) || (Double.parseDouble(_charSeq) == 4.5d))) {
												edittext26d.setText(String.valueOf(Double.parseDouble("0.40")));
												edittext8d.setText(String.valueOf(Double.parseDouble("0.76")));
												edittext9d.setText(String.valueOf(Double.parseDouble("0.23")));
												edittext6d.setText("");
												edittext101d.setText(String.valueOf(Double.parseDouble("1.50")));
												edittext102d.setText(String.valueOf(Double.parseDouble("1.50")));
												textview136d.setText("سمك الخرسانة حول الغطاء ( م )");
												edittext7d.setText(String.valueOf(Double.parseDouble("0.25")));
												edittext11d.setText(String.valueOf(Double.parseDouble("0.20")));
												edittext13d.setText("");
												edittext21d.setText(String.valueOf(Double.parseDouble("0.35")));
												edittext15d.setText(String.valueOf(Double.parseDouble("0.30")));
												edittext16d.setText(String.valueOf(Double.parseDouble("2.10")));
												edittext18d.setText("");
												edittext19d.setText("");
												textview123d.setVisibility(View.VISIBLE);
												linear222d.setVisibility(View.VISIBLE);
												linear220d.setVisibility(View.VISIBLE);
												linear221d.setVisibility(View.VISIBLE);
												linear223d.setVisibility(View.GONE);
												linear229d.setVisibility(View.VISIBLE);
												linear233d.setVisibility(View.GONE);
												linear226d.setVisibility(View.VISIBLE);
												linear219d.setVisibility(View.VISIBLE);
												linear457d.setVisibility(View.VISIBLE);
												linear460d.setVisibility(View.VISIBLE);
												linear144d.setVisibility(View.VISIBLE);
												linear157d.setVisibility(View.GONE);
												linear158d.setVisibility(View.VISIBLE);
												textview675d.setText("■ الحطة أسفل السقف مباشرة");
												textview678d.setText("سمك الحطة أسفل السقف مباشرة\n( م )");
												textview681d.setText("ارتفاع الحطة أسفل السقف مباشرة\n( م )");
												textview684d.setText("كمية الخرسانة بالحطة أسفل السقف مباشرة\n( م٣ )");
												textview685d.setText("■ الحطة الوسطية بالمطبق");
												textview688d.setText("سمك الحطة الوسطية بالمطبق\n( م )");
												textview691d.setText("ارتفاع الحطة الوسطية بالمطبق\n( م )");
												textview694d.setText("كمية الخرسانة بالحطة الوسطية بالمطبق\n( م٣ )");
												linear567d.setVisibility(View.GONE);
												textview568d.setVisibility(View.GONE);
												edittext103d.setText("");
												textview566d.setText("قطر الغطاء\n( م )");
												textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
												textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
											}
											else {
												if (Double.parseDouble(_charSeq) > 4.50d) {
													edittext26d.setText(String.valueOf(Double.parseDouble("0.40")));
													edittext8d.setText(String.valueOf(Double.parseDouble("0.76")));
													edittext9d.setText(String.valueOf(Double.parseDouble("0.23")));
													edittext6d.setText(String.valueOf(Double.parseDouble("0")));
													edittext101d.setText(String.valueOf(Double.parseDouble("1.75")));
													edittext102d.setText(String.valueOf(Double.parseDouble("1.75")));
													textview136d.setText("سمك الخرسانة حول الغطاء ( م )");
													edittext7d.setText(String.valueOf(Double.parseDouble("0.25")));
													edittext11d.setText(String.valueOf(Double.parseDouble("0.20")));
													edittext13d.setText("");
													edittext21d.setText(String.valueOf(Double.parseDouble("0.40")));
													edittext15d.setText(String.valueOf(Double.parseDouble("0.30")));
													edittext16d.setText(String.valueOf(Double.parseDouble("2.10")));
													edittext18d.setText(String.valueOf(Double.parseDouble("0.35")));
													edittext19d.setText(String.valueOf(Double.parseDouble("1.50")));
													textview123d.setVisibility(View.VISIBLE);
													linear222d.setVisibility(View.VISIBLE);
													linear220d.setVisibility(View.VISIBLE);
													linear221d.setVisibility(View.VISIBLE);
													linear223d.setVisibility(View.GONE);
													linear229d.setVisibility(View.VISIBLE);
													linear233d.setVisibility(View.VISIBLE);
													linear226d.setVisibility(View.VISIBLE);
													linear219d.setVisibility(View.VISIBLE);
													linear457d.setVisibility(View.VISIBLE);
													linear460d.setVisibility(View.VISIBLE);
													linear144d.setVisibility(View.VISIBLE);
													linear157d.setVisibility(View.GONE);
													linear158d.setVisibility(View.VISIBLE);
													textview675d.setText("■ الحطة أسفل السقف مباشرة");
													textview678d.setText("سمك الحطة أسفل السقف مباشرة\n( م )");
													textview681d.setText("ارتفاع الحطة أسفل السقف مباشرة\n( م )");
													textview684d.setText("كمية الخرسانة بالحطة أسفل السقف مباشرة\n( م٣ )");
													textview685d.setText("■ الحطة الوسطية بالمطبق");
													textview688d.setText("سمك الحطة الوسطية بالمطبق\n( م )");
													textview691d.setText("ارتفاع الحطة الوسطية بالمطبق\n( م )");
													textview694d.setText("كمية الخرسانة بالحطة الوسطية بالمطبق\n( م٣ )");
													linear567d.setVisibility(View.GONE);
													textview568d.setVisibility(View.GONE);
													edittext103d.setText("");
													textview566d.setText("قطر الغطاء\n( م )");
													textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
													textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
												}
											}
										}
									}
								}
								else {
									if (((Double.parseDouble(edittext2xd.getText().toString()) == 700) || (Double.parseDouble(edittext2xd.getText().toString()) == 800)) || ((Double.parseDouble(edittext2xd.getText().toString()) > 600) && (Double.parseDouble(edittext2xd.getText().toString()) < 800))) {
										if (Double.parseDouble(_charSeq) < ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) {
											textview2d.setText("ارتفاع المطبق أقل من قطر المأسورة + ٦٠ سم والذي يعتبر أقل غطاء أعلي المواسير في الأرصفة\nوهذا غير هندسي وغير منطقي\nوعليه من فضلك أعد ملئ الخانات");
											textview660d.setText("نوع المطبق وعدد حطاط الحائط :");
											edittext26d.setText("");
											edittext8d.setText("");
											edittext9d.setText("");
											edittext6d.setText("");
											textview136d.setText("سمك الخرسانة حول الغطاء ( م )");
											edittext7d.setText("");
											edittext11d.setText("");
											edittext13d.setText("");
											edittext21d.setText("");
											edittext15d.setText("");
											edittext16d.setText("");
											edittext18d.setText("");
											edittext19d.setText("");
											textview123d.setVisibility(View.GONE);
											linear222d.setVisibility(View.GONE);
											linear220d.setVisibility(View.GONE);
											linear221d.setVisibility(View.GONE);
											linear223d.setVisibility(View.GONE);
											linear229d.setVisibility(View.GONE);
											linear233d.setVisibility(View.GONE);
											linear226d.setVisibility(View.GONE);
											linear219d.setVisibility(View.GONE);
											linear457d.setVisibility(View.GONE);
											linear460d.setVisibility(View.GONE);
											linear144d.setVisibility(View.GONE);
											linear157d.setVisibility(View.GONE);
											linear158d.setVisibility(View.GONE);
											edittext101d.setText("");
											edittext102d.setText("");
											textview675d.setText("■ الحطة أسفل السقف مباشرة");
											textview678d.setText("سمك الحطة أسفل السقف مباشرة\n( م )");
											textview681d.setText("ارتفاع الحطة أسفل السقف مباشرة\n( م )");
											textview684d.setText("كمية الخرسانة بالحطة أسفل السقف مباشرة\n( م٣ )");
											textview685d.setText("■ الحطة الوسطية بالمطبق");
											textview688d.setText("سمك الحطة الوسطية بالمطبق\n( م )");
											textview691d.setText("ارتفاع الحطة الوسطية بالمطبق\n( م )");
											textview694d.setText("كمية الخرسانة بالحطة الوسطية بالمطبق\n( م٣ )");
											linear567d.setVisibility(View.GONE);
											textview568d.setVisibility(View.GONE);
											edittext103d.setText("");
											textview566d.setText("قطر الغطاء\n( م )");
											textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
											textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
										}
										else {
											if (((Double.parseDouble(_charSeq) == ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) || (Double.parseDouble(_charSeq) > ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d))) && ((Double.parseDouble(_charSeq) < 1.5d) || (Double.parseDouble(_charSeq) == 1.5d))) {
												textview2d.setText("المطبق فئة حتي ١.٥٠ م");
												textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة أولي بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٦٥ × ٢.٦٥ × ٠.٤٠ م\nوحطة واحدة بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
											}
											else {
												if ((Double.parseDouble(_charSeq) > 1.50d) && ((Double.parseDouble(_charSeq) < 2.00d) || (Double.parseDouble(_charSeq) == 2.00d))) {
													textview2d.setText("المطبق فئة أكبر من ١.٥٠ وحتي ٢.٠٠ م");
													textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة أولي بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٦٥ × ٢.٦٥ × ٠.٤٠ م\nوحطة واحدة بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
												}
												else {
													if ((Double.parseDouble(_charSeq) > 2.00d) && ((Double.parseDouble(_charSeq) < 2.5d) || (Double.parseDouble(_charSeq) == 2.5d))) {
														textview2d.setText("المطبق فئة أكبر من ٢.٠٠ وحتي ٢.٥٠ م");
														textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق فئة أولي بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٦٥ × ٢.٦٥ × ٠.٤٠ م\nوحطة واحدة بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
													}
													else {
														if ((Double.parseDouble(_charSeq) > 2.50d) && (Double.parseDouble(_charSeq) < 3.00d)) {
															textview2d.setText("المطبق فئة أكبر من ٢.٥٠ وحتي ٣.٠٠ م");
															textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق فئة أولي بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٦٥ × ٢.٦٥ × ٠.٤٠ م\nوحطة واحدة بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
														}
														else {
															if (((Double.parseDouble(_charSeq) == 3.00d) || (Double.parseDouble(_charSeq) > 3.00d)) && ((Double.parseDouble(_charSeq) < 3.5d) || (Double.parseDouble(_charSeq) == 3.5d))) {
																textview2d.setText("المطبق فئة من ٣.٠٠ وحتي ٣.٥٠ م");
																textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٧٥ × ٢.٧٥ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.١٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
															}
															else {
																if ((Double.parseDouble(_charSeq) > 3.50d) && ((Double.parseDouble(_charSeq) < 4.00d) || (Double.parseDouble(_charSeq) == 4.00d))) {
																	textview2d.setText("المطبق فئة أكبر من ٣.٥٠ وحتي ٤.٠٠ م");
																	textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٧٥ × ٢.٧٥ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.١٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																}
																else {
																	if ((Double.parseDouble(_charSeq) > 4.00d) && ((Double.parseDouble(_charSeq) < 4.5d) || (Double.parseDouble(_charSeq) == 4.5d))) {
																		textview2d.setText("المطبق فئة أكبر من ٤.٠٠ وحتي ٤.٥٠ م");
																		textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٧٥ × ٢.٧٥ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.١٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																	}
																	else {
																		if ((Double.parseDouble(_charSeq) > 4.50d) && ((Double.parseDouble(_charSeq) < 5.00d) || (Double.parseDouble(_charSeq) == 5.00d))) {
																			textview2d.setText("المطبق فئة أكبر من ٤.٥٠ وحتي ٥.٠٠ م");
																			textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nفئة أخيرة بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٨٥ × ٢.٨٥ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.١٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																		}
																		else {
																			if ((Double.parseDouble(_charSeq) > 5.00d) && ((Double.parseDouble(_charSeq) < 5.50d) || (Double.parseDouble(_charSeq) == 5.50d))) {
																				textview2d.setText("المطبق فئة أكبر من ٥.٠٠ وحتي ٥.٥٠ م");
																				textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nفئة أخيرة بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٨٥ × ٢.٨٥ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.٠٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																			}
																			else {
																				if ((Double.parseDouble(_charSeq) > 5.50d) && ((Double.parseDouble(_charSeq) < 6.00d) || (Double.parseDouble(_charSeq) == 6.00d))) {
																					textview2d.setText("المطبق فئة أكبر من ٥.٥٠ وحتي ٦.٠٠ م");
																					textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nفئة أخيرة بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٨٥ × ٢.٨٥ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.٠٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																				}
																				else {
																					if ((Double.parseDouble(_charSeq) > 6.00d) && ((Double.parseDouble(_charSeq) < 6.50d) || (Double.parseDouble(_charSeq) == 6.50d))) {
																						textview2d.setText("المطبق فئة أكبر من ٦.٠٠ وحتي ٦.٥٠ م");
																						textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nفئة أخيرة بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٨٥ × ٢.٨٥ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.٠٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																					}
																					else {
																						if (Double.parseDouble(_charSeq) > 6.50d) {
																							textview2d.setText("المطبق فئة أكبر من ٦.٥٠ م");
																							textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nفئة أخيرة بالنسبة للمطابق المربعة بأبعاد داخلية ١.٧٥ × ١.٧٥ م\nعبارة عن قاعدة مقاس ٢.٨٥ × ٢.٨٥ × ٠.٤٠ م\nوحطة أولى بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوحطة ثانية بارتفاع ١.٥٠ م وسمك الحائط بالحطة ٠.٣٥ م\nوحطة أخيرة بارتفاع ٢.٠٠ م وسمك الحائط بالحطة ٠.٣٠ م\nوسقف بسمك ٠.٢٠ م\nوغطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م");
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
											if (((Double.parseDouble(_charSeq) == ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) || (Double.parseDouble(_charSeq) > ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d))) && (Double.parseDouble(_charSeq) < 3.00d)) {
												edittext26d.setText(String.valueOf(Double.parseDouble("0.40")));
												edittext8d.setText(String.valueOf(Double.parseDouble("0.76")));
												edittext9d.setText(String.valueOf(Double.parseDouble("0.23")));
												edittext6d.setText("");
												edittext101d.setText(String.valueOf(Double.parseDouble("1.75")));
												edittext102d.setText(String.valueOf(Double.parseDouble("1.75")));
												textview136d.setText("سمك الخرسانة حول الغطاء ( م )");
												edittext7d.setText(String.valueOf(Double.parseDouble("0.25")));
												edittext11d.setText(String.valueOf(Double.parseDouble("0.20")));
												edittext13d.setText("");
												edittext21d.setText(String.valueOf(Double.parseDouble("0.30")));
												edittext15d.setText("");
												edittext16d.setText("");
												edittext18d.setText("");
												edittext19d.setText("");
												textview123d.setVisibility(View.VISIBLE);
												linear222d.setVisibility(View.VISIBLE);
												linear220d.setVisibility(View.VISIBLE);
												linear221d.setVisibility(View.VISIBLE);
												linear223d.setVisibility(View.GONE);
												linear229d.setVisibility(View.GONE);
												linear233d.setVisibility(View.GONE);
												linear226d.setVisibility(View.VISIBLE);
												linear219d.setVisibility(View.VISIBLE);
												linear457d.setVisibility(View.VISIBLE);
												linear460d.setVisibility(View.VISIBLE);
												linear144d.setVisibility(View.VISIBLE);
												linear157d.setVisibility(View.GONE);
												linear158d.setVisibility(View.VISIBLE);
												textview675d.setText("■ الحطة أسفل السقف مباشرة");
												textview678d.setText("سمك الحطة أسفل السقف مباشرة\n( م )");
												textview681d.setText("ارتفاع الحطة أسفل السقف مباشرة\n( م )");
												textview684d.setText("كمية الخرسانة بالحطة أسفل السقف مباشرة\n( م٣ )");
												textview685d.setText("■ الحطة الوسطية بالمطبق");
												textview688d.setText("سمك الحطة الوسطية بالمطبق\n( م )");
												textview691d.setText("ارتفاع الحطة الوسطية بالمطبق\n( م )");
												textview694d.setText("كمية الخرسانة بالحطة الوسطية بالمطبق\n( م٣ )");
												linear567d.setVisibility(View.GONE);
												textview568d.setVisibility(View.GONE);
												edittext103d.setText("");
												textview566d.setText("قطر الغطاء\n( م )");
												textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
												textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
											}
											else {
												if (((Double.parseDouble(_charSeq) > 3.00d) || (Double.parseDouble(_charSeq) == 3.00d)) && ((Double.parseDouble(_charSeq) < 4.5d) || (Double.parseDouble(_charSeq) == 4.5d))) {
													edittext26d.setText(String.valueOf(Double.parseDouble("0.40")));
													edittext8d.setText(String.valueOf(Double.parseDouble("0.76")));
													edittext9d.setText(String.valueOf(Double.parseDouble("0.23")));
													edittext6d.setText("");
													edittext101d.setText(String.valueOf(Double.parseDouble("1.75")));
													edittext102d.setText(String.valueOf(Double.parseDouble("1.75")));
													textview136d.setText("سمك الخرسانة حول الغطاء ( م )");
													edittext7d.setText(String.valueOf(Double.parseDouble("0.25")));
													edittext11d.setText(String.valueOf(Double.parseDouble("0.20")));
													edittext13d.setText("");
													edittext21d.setText(String.valueOf(Double.parseDouble("0.35")));
													edittext15d.setText(String.valueOf(Double.parseDouble("0.30")));
													edittext16d.setText(String.valueOf(Double.parseDouble("2.10")));
													edittext18d.setText("");
													edittext19d.setText("");
													textview123d.setVisibility(View.VISIBLE);
													linear222d.setVisibility(View.VISIBLE);
													linear220d.setVisibility(View.VISIBLE);
													linear221d.setVisibility(View.VISIBLE);
													linear223d.setVisibility(View.GONE);
													linear229d.setVisibility(View.VISIBLE);
													linear233d.setVisibility(View.GONE);
													linear226d.setVisibility(View.VISIBLE);
													linear219d.setVisibility(View.VISIBLE);
													linear457d.setVisibility(View.VISIBLE);
													linear460d.setVisibility(View.VISIBLE);
													linear144d.setVisibility(View.VISIBLE);
													linear157d.setVisibility(View.GONE);
													linear158d.setVisibility(View.VISIBLE);
													textview675d.setText("■ الحطة أسفل السقف مباشرة");
													textview678d.setText("سمك الحطة أسفل السقف مباشرة\n( م )");
													textview681d.setText("ارتفاع الحطة أسفل السقف مباشرة\n( م )");
													textview684d.setText("كمية الخرسانة بالحطة أسفل السقف مباشرة\n( م٣ )");
													textview685d.setText("■ الحطة الوسطية بالمطبق");
													textview688d.setText("سمك الحطة الوسطية بالمطبق\n( م )");
													textview691d.setText("ارتفاع الحطة الوسطية بالمطبق\n( م )");
													textview694d.setText("كمية الخرسانة بالحطة الوسطية بالمطبق\n( م٣ )");
													linear567d.setVisibility(View.GONE);
													textview568d.setVisibility(View.GONE);
													edittext103d.setText("");
													textview566d.setText("قطر الغطاء\n( م )");
													textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
													textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
												}
												else {
													if (Double.parseDouble(_charSeq) > 4.50d) {
														edittext26d.setText(String.valueOf(Double.parseDouble("0.40")));
														edittext8d.setText(String.valueOf(Double.parseDouble("0.76")));
														edittext9d.setText(String.valueOf(Double.parseDouble("0.23")));
														edittext6d.setText(String.valueOf(Double.parseDouble("0")));
														edittext101d.setText(String.valueOf(Double.parseDouble("1.75")));
														edittext102d.setText(String.valueOf(Double.parseDouble("1.75")));
														textview136d.setText("سمك الخرسانة حول الغطاء ( م )");
														edittext7d.setText(String.valueOf(Double.parseDouble("0.25")));
														edittext11d.setText(String.valueOf(Double.parseDouble("0.20")));
														edittext13d.setText("");
														edittext21d.setText(String.valueOf(Double.parseDouble("0.40")));
														edittext15d.setText(String.valueOf(Double.parseDouble("0.30")));
														edittext16d.setText(String.valueOf(Double.parseDouble("2.10")));
														edittext18d.setText(String.valueOf(Double.parseDouble("0.35")));
														edittext19d.setText(String.valueOf(Double.parseDouble("1.50")));
														textview123d.setVisibility(View.VISIBLE);
														linear222d.setVisibility(View.VISIBLE);
														linear220d.setVisibility(View.VISIBLE);
														linear221d.setVisibility(View.VISIBLE);
														linear223d.setVisibility(View.GONE);
														linear229d.setVisibility(View.VISIBLE);
														linear233d.setVisibility(View.VISIBLE);
														linear226d.setVisibility(View.VISIBLE);
														linear219d.setVisibility(View.VISIBLE);
														linear457d.setVisibility(View.VISIBLE);
														linear460d.setVisibility(View.VISIBLE);
														linear144d.setVisibility(View.VISIBLE);
														linear157d.setVisibility(View.GONE);
														linear158d.setVisibility(View.VISIBLE);
														textview675d.setText("■ الحطة أسفل السقف مباشرة");
														textview678d.setText("سمك الحطة أسفل السقف مباشرة\n( م )");
														textview681d.setText("ارتفاع الحطة أسفل السقف مباشرة\n( م )");
														textview684d.setText("كمية الخرسانة بالحطة أسفل السقف مباشرة\n( م٣ )");
														textview685d.setText("■ الحطة الوسطية بالمطبق");
														textview688d.setText("سمك الحطة الوسطية بالمطبق\n( م )");
														textview691d.setText("ارتفاع الحطة الوسطية بالمطبق\n( م )");
														textview694d.setText("كمية الخرسانة بالحطة الوسطية بالمطبق\n( م٣ )");
														linear567d.setVisibility(View.GONE);
														textview568d.setVisibility(View.GONE);
														edittext103d.setText("");
														textview566d.setText("قطر الغطاء\n( م )");
														textview674d.setText("كمية الخرسانة العادية بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
														textview613d.setText("اجمالي كمية الخرسانة العادية بقاعدة المطبق ( م٣ )");
													}
												}
											}
										}
									}
									else {
										if (Double.parseDouble(edittext2xd.getText().toString()) > 800) {
											if (Double.parseDouble(_charSeq) < ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) {
												textview2d.setText("ارتفاع المطبق أقل من قطر المأسورة + ٦٠ سم والذي يعتبر أقل غطاء أعلي المواسير في الأرصفة\nوهذا غير هندسي وغير منطقي\nوعليه من فضلك أعد ملئ الخانات");
												textview660d.setText("نوع المطبق وعدد حطاط الحائط :");
												edittext26d.setText("");
												edittext8d.setText("");
												edittext9d.setText("");
												edittext6d.setText("");
												textview136d.setText("سمك الخرسانة حول الغطاء ( م )");
												edittext7d.setText("");
												edittext11d.setText("");
												edittext13d.setText("");
												edittext21d.setText("");
												edittext15d.setText("");
												edittext16d.setText("");
												edittext18d.setText("");
												edittext19d.setText("");
												textview123d.setVisibility(View.GONE);
												linear222d.setVisibility(View.GONE);
												linear220d.setVisibility(View.GONE);
												linear221d.setVisibility(View.GONE);
												linear223d.setVisibility(View.GONE);
												linear229d.setVisibility(View.GONE);
												linear233d.setVisibility(View.GONE);
												linear226d.setVisibility(View.GONE);
												linear219d.setVisibility(View.GONE);
												linear457d.setVisibility(View.GONE);
												linear460d.setVisibility(View.GONE);
												linear144d.setVisibility(View.GONE);
												linear157d.setVisibility(View.GONE);
												linear158d.setVisibility(View.GONE);
												edittext101d.setText("");
												edittext102d.setText("");
												textview675d.setText("■ الحطة أسفل السقف مباشرة");
												textview678d.setText("سمك الحطة أسفل السقف مباشرة\n( م )");
												textview681d.setText("ارتفاع الحطة أسفل السقف مباشرة\n( م )");
												textview684d.setText("كمية الخرسانة بالحطة أسفل السقف مباشرة\n( م٣ )");
												textview685d.setText("■ الحطة الوسطية بالمطبق");
												textview688d.setText("سمك الحطة الوسطية بالمطبق\n( م )");
												textview691d.setText("ارتفاع الحطة الوسطية بالمطبق\n( م )");
												textview694d.setText("كمية الخرسانة بالحطة الوسطية بالمطبق\n( م٣ )");
												linear567d.setVisibility(View.GONE);
												textview568d.setVisibility(View.GONE);
												edittext103d.setText("");
												textview566d.setText("قطر الغطاء\nالأول ( م )");
												textview674d.setText("كمية الخرسانة المسلحة بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
												textview613d.setText("اجمالي كمية الخرسانة المسلحة بقاعدة المطبق ( م٣ )");
											}
											else {
												if (((Double.parseDouble(_charSeq) == ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) || (Double.parseDouble(_charSeq) > ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d))) && ((Double.parseDouble(_charSeq) < 1.5d) || (Double.parseDouble(_charSeq) == 1.5d))) {
													textview2d.setText("المطبق فئة حتي ١.٥٠ م");
													textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة أولي بالنسبة للمطابق المربعة بأبعاد داخلية متغيره طبقآ للقطر ولكن لا تقل عن ٢.٠٠ × ٢.٠٠ م\nعبارة عن قاعدة مسلحة بابعاد متغيره طبقآ للقطر ولكن لا تقل عن ٣.٠٠ × ٣.٠٠ × ٠.٤٠ م\nوحطة واحدة بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوسقف بسمك ٠.٢٠ م\nوعدد ٢ غطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م وقطر ٠.٦٠ م .");
												}
												else {
													if ((Double.parseDouble(_charSeq) > 1.50d) && ((Double.parseDouble(_charSeq) < 2.00d) || (Double.parseDouble(_charSeq) == 2.00d))) {
														textview2d.setText("المطبق فئة أكبر من ١.٥٠ وحتي ٢.٠٠ م");
														textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة أولي بالنسبة للمطابق المربعة بأبعاد داخلية متغيره طبقآ للقطر ولكن لا تقل عن ٢.٠٠ × ٢.٠٠ م\nعبارة عن قاعدة مسلحة بابعاد متغيره طبقآ للقطر ولكن لا تقل عن ٣.٠٠ × ٣.٠٠ × ٠.٤٠ م\nوحطة واحدة بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوسقف بسمك ٠.٢٠ م\nوعدد ٢ غطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م وقطر ٠.٦٠ م .");
													}
													else {
														if ((Double.parseDouble(_charSeq) > 2.00d) && ((Double.parseDouble(_charSeq) < 2.5d) || (Double.parseDouble(_charSeq) == 2.5d))) {
															textview2d.setText("المطبق فئة أكبر من ٢.٠٠ وحتي ٢.٥٠ م");
															textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة أولي بالنسبة للمطابق المربعة بأبعاد داخلية متغيره طبقآ للقطر ولكن لا تقل عن ٢.٠٠ × ٢.٠٠ م\nعبارة عن قاعدة مسلحة بابعاد متغيره طبقآ للقطر ولكن لا تقل عن ٣.٠٠ × ٣.٠٠ × ٠.٤٠ م\nوحطة واحدة بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوسقف بسمك ٠.٢٠ م\nوعدد ٢ غطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م وقطر ٠.٦٠ م .");
														}
														else {
															if ((Double.parseDouble(_charSeq) > 2.50d) && (Double.parseDouble(_charSeq) < 3.00d)) {
																textview2d.setText("المطبق فئة أكبر من ٢.٥٠ وحتي ٣.٠٠ م");
																textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة أولي بالنسبة للمطابق المربعة بأبعاد داخلية متغيره طبقآ للقطر ولكن لا تقل عن ٢.٠٠ × ٢.٠٠ م\nعبارة عن قاعدة مسلحة بابعاد متغيره طبقآ للقطر ولكن لا تقل عن ٣.٠٠ × ٣.٠٠ × ٠.٤٠ م\nوحطة واحدة بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٣٥ م\nوسقف بسمك ٠.٢٠ م\nوعدد ٢ غطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م وقطر ٠.٦٠ م .");
															}
															else {
																if ((Double.parseDouble(_charSeq) == 3.00d) || (((Double.parseDouble(_charSeq) > 3.00d) && (Double.parseDouble(_charSeq) < 3.5d)) || (Double.parseDouble(_charSeq) == 3.5d))) {
																	textview2d.setText("المطبق فئة من ٣.٠٠ وحتي ٣.٥٠ م");
																	textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية متغيره طبقآ للقطر ولكن لا تقل عن ٢.٠٠ × ٢.٠٠ م\nعبارة عن قاعدة مسلحة بابعاد متغيره طبقآ للقطر ولكن لا تقل عن ٣.٠٠ × ٣.٠٠ × ٠.٤٠ م\nوحطتين\n١ - الحطة الأولي بارتفاع ٢ م وبسمك ٠.٣٥م\n٢ - الحطة الثانية بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوسقف بسمك ٠.٢٠ م\nوعدد ٢ غطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م وقطر ٠.٦٠ م .");
																}
																else {
																	if ((Double.parseDouble(_charSeq) > 3.50d) && ((Double.parseDouble(_charSeq) < 4.00d) || (Double.parseDouble(_charSeq) == 4.00d))) {
																		textview2d.setText("المطبق فئة أكبر من ٣.٥٠ وحتي ٤.٠٠ م");
																		textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية متغيره طبقآ للقطر ولكن لا تقل عن ٢.٠٠ × ٢.٠٠ م\nعبارة عن قاعدة مسلحة بابعاد متغيره طبقآ للقطر ولكن لا تقل عن ٣.٠٠ × ٣.٠٠ × ٠.٤٠ م\nوحطتين\n١ - الحطة الأولي بارتفاع ٢ م وبسمك ٠.٣٥م\n٢ - الحطة الثانية بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوسقف بسمك ٠.٢٠ م\nوعدد ٢ غطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م وقطر ٠.٦٠ م .");
																	}
																	else {
																		if ((Double.parseDouble(_charSeq) > 4.00d) && ((Double.parseDouble(_charSeq) < 4.5d) || (Double.parseDouble(_charSeq) == 4.5d))) {
																			textview2d.setText("المطبق فئة أكبر من ٤.٠٠ وحتي ٤.٥٠ م");
																			textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية متغيره طبقآ للقطر ولكن لا تقل عن ٢.٠٠ × ٢.٠٠ م\nعبارة عن قاعدة مسلحة بابعاد متغيره طبقآ للقطر ولكن لا تقل عن ٣.٠٠ × ٣.٠٠ × ٠.٤٠ م\nوحطتين\n١ - الحطة الأولي بارتفاع ٢ م وبسمك ٠.٣٥م\n٢ - الحطة الثانية بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوسقف بسمك ٠.٢٠ م\nوعدد ٢ غطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م وقطر ٠.٦٠ م .");
																		}
																		else {
																			if ((Double.parseDouble(_charSeq) > 4.50d) && ((Double.parseDouble(_charSeq) < 5.00d) || (Double.parseDouble(_charSeq) == 5.00d))) {
																				textview2d.setText("المطبق فئة أكبر من ٤.٥٠ وحتي ٥.٠٠ م");
																				textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية متغيره طبقآ للقطر ولكن لا تقل عن ٢.٠٠ × ٢.٠٠ م\nعبارة عن قاعدة مسلحة بابعاد متغيره طبقآ للقطر ولكن لا تقل عن ٣.٠٠ × ٣.٠٠ × ٠.٤٠ م\nوحطتين\n١ - الحطة الأولي بارتفاع ٢ م وبسمك ٠.٣٥م\n٢ - الحطة الثانية بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوسقف بسمك ٠.٢٠ م\nوعدد ٢ غطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م وقطر ٠.٦٠ م .");
																			}
																			else {
																				if ((Double.parseDouble(_charSeq) > 5.00d) && ((Double.parseDouble(_charSeq) < 5.50d) || (Double.parseDouble(_charSeq) == 5.50d))) {
																					textview2d.setText("المطبق فئة أكبر من ٥.٠٠ وحتي ٥.٥٠ م");
																					textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية متغيره طبقآ للقطر ولكن لا تقل عن ٢.٠٠ × ٢.٠٠ م\nعبارة عن قاعدة مسلحة بابعاد متغيره طبقآ للقطر ولكن لا تقل عن ٣.٠٠ × ٣.٠٠ × ٠.٤٠ م\nوحطتين\n١ - الحطة الأولي بارتفاع ٢ م وبسمك ٠.٣٥م\n٢ - الحطة الثانية بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوسقف بسمك ٠.٢٠ م\nوعدد ٢ غطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م وقطر ٠.٦٠ م .");
																				}
																				else {
																					if ((Double.parseDouble(_charSeq) > 5.50d) && ((Double.parseDouble(_charSeq) < 6.00d) || (Double.parseDouble(_charSeq) == 6.00d))) {
																						textview2d.setText("المطبق فئة أكبر من ٥.٥٠ وحتي ٦.٠٠ م");
																						textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية متغيره طبقآ للقطر ولكن لا تقل عن ٢.٠٠ × ٢.٠٠ م\nعبارة عن قاعدة مسلحة بابعاد متغيره طبقآ للقطر ولكن لا تقل عن ٣.٠٠ × ٣.٠٠ × ٠.٤٠ م\nوحطتين\n١ - الحطة الأولي بارتفاع ٢ م وبسمك ٠.٣٥م\n٢ - الحطة الثانية بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوسقف بسمك ٠.٢٠ م\nوعدد ٢ غطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م وقطر ٠.٦٠ م .");
																					}
																					else {
																						if ((Double.parseDouble(_charSeq) > 6.00d) && ((Double.parseDouble(_charSeq) < 6.50d) || (Double.parseDouble(_charSeq) == 6.50d))) {
																							textview2d.setText("المطبق فئة أكبر من ٦.٠٠ وحتي ٦.٥٠ م");
																							textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية متغيره طبقآ للقطر ولكن لا تقل عن ٢.٠٠ × ٢.٠٠ م\nعبارة عن قاعدة مسلحة بابعاد متغيره طبقآ للقطر ولكن لا تقل عن ٣.٠٠ × ٣.٠٠ × ٠.٤٠ م\nوحطتين\n١ - الحطة الأولي بارتفاع ٢ م وبسمك ٠.٣٥م\n٢ - الحطة الثانية بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوسقف بسمك ٠.٢٠ م\nوعدد ٢ غطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م وقطر ٠.٦٠ م .");
																						}
																						else {
																							if (Double.parseDouble(_charSeq) > 6.50d) {
																								textview2d.setText("المطبق فئة أكبر من ٦.٥٠ م");
																								textview660d.setText("نوع المطبق وعدد حطاط الحائط :\nطبقآ للكود المصري\nالمطبق نوعه مطبق مربع\nالمطبق فئة ثانية بالنسبة للمطابق المربعة بأبعاد داخلية متغيره طبقآ للقطر ولكن لا تقل عن ٢.٠٠ × ٢.٠٠ م\nعبارة عن قاعدة مسلحة بابعاد متغيره طبقآ للقطر ولكن لا تقل عن ٣.٠٠ × ٣.٠٠ × ٠.٤٠ م\nوحطتين\n١ - الحطة الأولي بارتفاع ٢ م وبسمك ٠.٣٥م\n٢ - الحطة الثانية بارتفاع متغير علي حسب عمق المطبق وسمك الحائط بالحطة ٠.٤٠ م\nوسقف بسمك ٠.٢٠ م\nوعدد ٢ غطاء بارتفاع ٠.٢٣ م وبقطر ٠.٧٦ م وقطر ٠.٦٠ م .");
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
												if (((Double.parseDouble(_charSeq) == ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) || (Double.parseDouble(_charSeq) == 3.00d)) || ((Double.parseDouble(_charSeq) > ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) && (Double.parseDouble(_charSeq) < 3.00d))) {
													edittext26d.setText(String.valueOf(Double.parseDouble("0.40")));
													edittext8d.setText(String.valueOf(Double.parseDouble("0.76")));
													edittext103d.setText(String.valueOf(Double.parseDouble("0.60")));
													edittext9d.setText(String.valueOf(Double.parseDouble("0.23")));
													edittext6d.setText(String.valueOf(Double.parseDouble("0")));
													textview136d.setText("سمك الخرسانة حول الغطاء ( م )");
													edittext7d.setText(String.valueOf(Double.parseDouble("0.25")));
													edittext11d.setText(String.valueOf(Double.parseDouble("0.20")));
													edittext13d.setText("");
													edittext21d.setText(String.valueOf(Double.parseDouble("0.35")));
													edittext15d.setText("");
													edittext16d.setText("");
													edittext18d.setText("");
													edittext19d.setText("");
													textview123d.setVisibility(View.VISIBLE);
													linear222d.setVisibility(View.VISIBLE);
													linear220d.setVisibility(View.VISIBLE);
													linear221d.setVisibility(View.VISIBLE);
													linear223d.setVisibility(View.GONE);
													linear229d.setVisibility(View.GONE);
													linear233d.setVisibility(View.GONE);
													linear226d.setVisibility(View.VISIBLE);
													linear219d.setVisibility(View.VISIBLE);
													linear457d.setVisibility(View.VISIBLE);
													linear460d.setVisibility(View.VISIBLE);
													linear144d.setVisibility(View.VISIBLE);
													linear157d.setVisibility(View.GONE);
													linear158d.setVisibility(View.VISIBLE);
													textview675d.setText("■ الحطة أسفل السقف مباشرة");
													textview678d.setText("سمك الحطة أسفل السقف مباشرة\n( م )");
													textview681d.setText("ارتفاع الحطة أسفل السقف مباشرة\n( م )");
													textview684d.setText("كمية الخرسانة بالحطة أسفل السقف مباشرة\n( م٣ )");
													textview685d.setText("■ الحطة الوسطية بالمطبق");
													textview688d.setText("سمك الحطة الوسطية بالمطبق\n( م )");
													textview691d.setText("ارتفاع الحطة الوسطية بالمطبق\n( م )");
													textview694d.setText("كمية الخرسانة بالحطة الوسطية بالمطبق\n( م٣ )");
													linear567d.setVisibility(View.VISIBLE);
													textview568d.setVisibility(View.VISIBLE);
													edittext103d.setText(String.valueOf(Double.parseDouble("0.60")));
													textview566d.setText("قطر الغطاء\nالأول ( م )");
													textview674d.setText("كمية الخرسانة المسلحة بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
													textview613d.setText("اجمالي كمية الخرسانة المسلحة بقاعدة المطبق ( م٣ )");
													if (((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.70d) < 2) {
														edittext101d.setText(String.valueOf(Double.parseDouble("2")));
														edittext102d.setText(String.valueOf(Double.parseDouble("2")));
													}
													else {
														edittext101d.setText(String.valueOf((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.70d));
														edittext102d.setText(String.valueOf((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.70d));
													}
												}
												else {
													if (Double.parseDouble(_charSeq) > 3.00d) {
														edittext26d.setText(String.valueOf(Double.parseDouble("0.40")));
														edittext8d.setText(String.valueOf(Double.parseDouble("0.76")));
														edittext9d.setText(String.valueOf(Double.parseDouble("0.23")));
														edittext6d.setText("");
														textview136d.setText("سمك الحائط أسفل السقف\n( م )");
														edittext7d.setText(String.valueOf(Double.parseDouble("0.25")));
														edittext11d.setText(String.valueOf(Double.parseDouble("0.20")));
														edittext13d.setText("");
														edittext21d.setText(String.valueOf(Double.parseDouble("0.40")));
														edittext15d.setText(String.valueOf(Double.parseDouble("0.35")));
														edittext16d.setText(String.valueOf(Double.parseDouble("2.8")));
														edittext18d.setText("");
														edittext19d.setText("");
														textview123d.setVisibility(View.VISIBLE);
														linear222d.setVisibility(View.VISIBLE);
														linear220d.setVisibility(View.VISIBLE);
														linear221d.setVisibility(View.VISIBLE);
														linear223d.setVisibility(View.GONE);
														linear229d.setVisibility(View.VISIBLE);
														linear233d.setVisibility(View.GONE);
														linear226d.setVisibility(View.VISIBLE);
														linear219d.setVisibility(View.VISIBLE);
														linear457d.setVisibility(View.VISIBLE);
														linear460d.setVisibility(View.VISIBLE);
														linear144d.setVisibility(View.VISIBLE);
														linear157d.setVisibility(View.GONE);
														linear158d.setVisibility(View.VISIBLE);
														textview675d.setText("■ الحطة أسفل السقف مباشرة");
														textview678d.setText("سمك الحطة أسفل السقف مباشرة\n( م )");
														textview681d.setText("ارتفاع الحطة أسفل السقف مباشرة\n( م )");
														textview684d.setText("كمية الخرسانة بالحطة أسفل السقف مباشرة\n( م٣ )");
														textview685d.setText("■ الحطة الوسطية بالمطبق");
														textview688d.setText("سمك الحطة الوسطية بالمطبق\n( م )");
														textview691d.setText("ارتفاع الحطة الوسطية بالمطبق\n( م )");
														textview694d.setText("كمية الخرسانة بالحطة الوسطية بالمطبق\n( م٣ )");
														linear567d.setVisibility(View.VISIBLE);
														textview568d.setVisibility(View.VISIBLE);
														edittext103d.setText(String.valueOf(Double.parseDouble("0.60")));
														textview566d.setText("قطر الغطاء\nالأول ( م )");
														textview674d.setText("كمية الخرسانة المسلحة بالحطة الأولي بعد القاعدة مباشرة ( م٣ )");
														textview613d.setText("اجمالي كمية الخرسانة المسلحة بقاعدة المطبق ( م٣ )");
														if (((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.70d) < 2) {
															edittext101d.setText(String.valueOf(Double.parseDouble("2")));
															edittext102d.setText(String.valueOf(Double.parseDouble("2")));
														}
														else {
															edittext101d.setText(_English_Decimal_Format((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.70d));
															edittext102d.setText(_English_Decimal_Format((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.70d));
														}
													}
												}
											}
										}
									}
								}
							}
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
		
		edittext6d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext6d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) < 500) {
					if (Double.parseDouble(edittext5d.getText().toString()) > 1.50d) {
						if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0)))) || (((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0))) || ((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))))) {
							edittext17d.setText(String.valueOf(00.00));
						}
						else {
							edittext17d.setText(_English_Decimal_Format(((((Math.PI / 4) * (Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString())), 2) - Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2))) + ((Math.PI / 4) * (Math.pow(Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext15d.getText().toString())), 2) - Math.pow(Double.parseDouble(_charSeq), 2)))) / 2) * Double.parseDouble(edittext16d.getText().toString())));
						}
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString())));
						}
					}
					else {
						if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0)))) || (((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))) || ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))))) {
							edittext12d.setText(String.valueOf(00.00));
						}
						else {
							edittext12d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext11d.getText().toString())));
						}
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0)))) || ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString())));
						}
					}
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext18d.getText().toString().equals("") || edittext18d.getText().toString().equals(".")) || (edittext18d.getText().toString().equals("-") || (Double.parseDouble(edittext18d.getText().toString()) < 0))) || ((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0))))) {
						edittext20d.setText(String.valueOf(00.00));
					}
					else {
						edittext20d.setText(_English_Decimal_Format(((Math.PI / 4) * (Math.pow(Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext18d.getText().toString())), 2) - Math.pow(Double.parseDouble(_charSeq), 2))) * Double.parseDouble(edittext19d.getText().toString())));
					}
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext22d.getText().toString().equals("") || edittext22d.getText().toString().equals(".")) || (edittext22d.getText().toString().equals("-") || (Double.parseDouble(edittext22d.getText().toString()) < 0))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0))))) {
						edittext23d.setText(String.valueOf(00.00));
					}
					else {
						edittext23d.setText(_English_Decimal_Format(((Math.PI / 4) * (Math.pow(Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext21d.getText().toString())), 2) - Math.pow(Double.parseDouble(_charSeq), 2))) * Double.parseDouble(edittext22d.getText().toString())));
					}
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (Double.parseDouble(edittext2xd.getText().toString()) == 00.00d)) {
						edittext28d.setText(String.valueOf(00.00d));
					}
					else {
						edittext28d.setText(_English_Decimal_Format(((Math.PI / 4) * (Math.pow(Double.parseDouble(_charSeq), 2) * ((Double.parseDouble(edittext2xd.getText().toString()) + 100) / 1000))) - ((Double.parseDouble(_charSeq) * (Double.parseDouble(edittext2xd.getText().toString()) / 1000)) * ((Double.parseDouble(edittext2xd.getText().toString()) + 100) / 1000))));
					}
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) {
						edittext24d.setText("");
						edittext25d.setText("");
					}
					else {
						edittext24d.setText(_English_Decimal_Format((Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext21d.getText().toString()))) + (2 * 0.15d)));
						edittext25d.setText(_English_Decimal_Format((Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext21d.getText().toString()))) + (2 * 0.15d)));
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
		
		edittext102d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext102d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if ((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (((Double.parseDouble(edittext2xd.getText().toString()) > 500) && (Double.parseDouble(edittext2xd.getText().toString()) < 800)) || (Double.parseDouble(edittext2xd.getText().toString()) == 800))) {
					if (Double.parseDouble(edittext5d.getText().toString()) < 3) {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) || (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0)))))) {
							edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext11d.getText().toString())));
						}
					}
					else {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0)))) || (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0)))))) {
							edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString()))) * (Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext15d.getText().toString())))) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext11d.getText().toString())));
						}
					}
				}
				else {
					if (Double.parseDouble(edittext2xd.getText().toString()) > 800) {
						if ((Double.parseDouble(edittext5d.getText().toString()) < 3) || (Double.parseDouble(edittext5d.getText().toString()) == 3)) {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) || (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - (((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4) + ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4))) * Double.parseDouble(edittext11d.getText().toString())));
							}
						}
						else {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))) || ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0)))) || (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString()))) * (Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext15d.getText().toString())))) - (((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4) + ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4))) * Double.parseDouble(edittext11d.getText().toString())));
							}
						}
					}
				}
				if ((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (Double.parseDouble(edittext2xd.getText().toString()) > 500)) {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0)))))) {
						edittext17d.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext17d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString()))) * (Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext15d.getText().toString())))) - (Double.parseDouble(edittext101d.getText().toString()) * Double.parseDouble(_charSeq))) * Double.parseDouble(edittext16d.getText().toString())));
					}
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext18d.getText().toString().equals("") || edittext18d.getText().toString().equals(".")) || (edittext18d.getText().toString().equals("-") || (Double.parseDouble(edittext18d.getText().toString()) < 0)))))) {
						edittext20d.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext20d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext18d.getText().toString()))) * (Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext18d.getText().toString())))) - (Double.parseDouble(edittext101d.getText().toString()) * Double.parseDouble(_charSeq))) * Double.parseDouble(edittext19d.getText().toString())));
					}
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext22d.getText().toString().equals("") || edittext22d.getText().toString().equals(".")) || (edittext22d.getText().toString().equals("-") || (Double.parseDouble(edittext22d.getText().toString()) < 0))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))))) {
						edittext23d.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext23d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - (Double.parseDouble(edittext101d.getText().toString()) * Double.parseDouble(_charSeq))) * Double.parseDouble(edittext22d.getText().toString())));
					}
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0)))) {
						edittext28d.setText(String.valueOf(00.00d));
					}
					else {
						edittext28d.setText(_English_Decimal_Format(((Double.parseDouble(_charSeq) * Double.parseDouble(edittext101d.getText().toString())) * ((Double.parseDouble(edittext2xd.getText().toString()) + 100) / 1000)) - ((Double.parseDouble(edittext101d.getText().toString()) * (Double.parseDouble(edittext2xd.getText().toString()) / 1000)) * ((Double.parseDouble(edittext2xd.getText().toString()) + 100) / 1000))));
					}
				}
				if ((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (((Double.parseDouble(edittext2xd.getText().toString()) > 500) && (Double.parseDouble(edittext2xd.getText().toString()) < 800)) || (Double.parseDouble(edittext2xd.getText().toString()) == 800))) {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) {
						edittext25d.setText("");
					}
					else {
						edittext25d.setText(_English_Decimal_Format((Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext21d.getText().toString()))) + (2 * 0.15d)));
					}
				}
				else {
					if (Double.parseDouble(edittext2xd.getText().toString()) > 800) {
						if (((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0))) || ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0)))) {
							edittext25d.setText("");
						}
						else {
							if (((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.70d) < 2) {
								edittext25d.setText(_English_Decimal_Format(2 + ((2 * Double.parseDouble(edittext21d.getText().toString())) + 0.30d)));
							}
							else {
								edittext25d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) + ((2 * Double.parseDouble(edittext21d.getText().toString())) + 0.30d)));
							}
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
		
		edittext101d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext101d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((Double.parseDouble(edittext2xd.getText().toString()) == 500) || ((Double.parseDouble(edittext2xd.getText().toString()) > 500) && (Double.parseDouble(edittext2xd.getText().toString()) < 800))) || (Double.parseDouble(edittext2xd.getText().toString()) == 800)) {
					if (Double.parseDouble(edittext5d.getText().toString()) < 3) {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) || (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
							edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext11d.getText().toString())));
						}
					}
					else {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0)))) || (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
							edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext15d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString())))) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext11d.getText().toString())));
						}
					}
				}
				else {
					if (Double.parseDouble(edittext2xd.getText().toString()) > 800) {
						if ((Double.parseDouble(edittext5d.getText().toString()) < 3) || (Double.parseDouble(edittext5d.getText().toString()) == 3)) {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) || (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - (((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4) + ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4))) * Double.parseDouble(edittext11d.getText().toString())));
							}
						}
						else {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))) || ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0)))) || (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext15d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString())))) - (((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4) + ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4))) * Double.parseDouble(edittext11d.getText().toString())));
							}
						}
					}
				}
				if ((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (Double.parseDouble(edittext2xd.getText().toString()) > 500)) {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))) || (((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
						edittext17d.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext17d.setText(_English_Decimal_Format((((Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext15d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString())))) - (Double.parseDouble(_charSeq) * Double.parseDouble(edittext102d.getText().toString()))) * Double.parseDouble(edittext16d.getText().toString())));
					}
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0))) || (((edittext18d.getText().toString().equals("") || edittext18d.getText().toString().equals(".")) || (edittext18d.getText().toString().equals("-") || (Double.parseDouble(edittext18d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
						edittext20d.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext20d.setText(_English_Decimal_Format((((Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext18d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext18d.getText().toString())))) - (Double.parseDouble(_charSeq) * Double.parseDouble(edittext102d.getText().toString()))) * Double.parseDouble(edittext19d.getText().toString())));
					}
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext22d.getText().toString().equals("") || edittext22d.getText().toString().equals(".")) || (edittext22d.getText().toString().equals("-") || (Double.parseDouble(edittext22d.getText().toString()) < 0))) || (((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
						edittext23d.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext23d.setText(_English_Decimal_Format((((Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - (Double.parseDouble(_charSeq) * Double.parseDouble(edittext102d.getText().toString()))) * Double.parseDouble(edittext22d.getText().toString())));
					}
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))) {
						edittext28d.setText(String.valueOf(00.00d));
					}
					else {
						edittext28d.setText(_English_Decimal_Format(((Double.parseDouble(_charSeq) * Double.parseDouble(edittext102d.getText().toString())) * ((Double.parseDouble(edittext2xd.getText().toString()) + 100) / 1000)) - ((Double.parseDouble(_charSeq) * (Double.parseDouble(edittext2xd.getText().toString()) / 1000)) * ((Double.parseDouble(edittext2xd.getText().toString()) + 100) / 1000))));
					}
				}
				if ((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (((Double.parseDouble(edittext2xd.getText().toString()) > 500) && (Double.parseDouble(edittext2xd.getText().toString()) < 800)) || (Double.parseDouble(edittext2xd.getText().toString()) == 800))) {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) {
						edittext24d.setText("");
					}
					else {
						edittext24d.setText(_English_Decimal_Format((Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext21d.getText().toString()))) + (2 * 0.15d)));
					}
				}
				else {
					if (Double.parseDouble(edittext2xd.getText().toString()) > 800) {
						if (((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0))) || ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0)))) {
							edittext24d.setText("");
						}
						else {
							if (((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.70d) < 2) {
								edittext24d.setText(_English_Decimal_Format(2 + ((2 * Double.parseDouble(edittext21d.getText().toString())) + 0.30d)));
							}
							else {
								edittext24d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) + ((2 * Double.parseDouble(edittext21d.getText().toString())) + 0.30d)));
							}
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
		
		edittext7d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext7d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) < 500) {
					if (Double.parseDouble(edittext5d.getText().toString()) > 1.50d) {
						if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0)))) || ((edittext13d.getText().toString().equals("") || edittext13d.getText().toString().equals(".")) || (edittext13d.getText().toString().equals("-") || (Double.parseDouble(edittext13d.getText().toString()) < 0)))) {
							edittext14d.setText(String.valueOf(00.00));
						}
						else {
							edittext14d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(_charSeq)), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext13d.getText().toString())));
						}
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(_charSeq)), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString())));
						}
					}
					else {
						if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0)))) || (((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))))) {
							edittext12d.setText(String.valueOf(00.00));
						}
						else {
							edittext12d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(edittext6d.getText().toString()) + (2 * Double.parseDouble(_charSeq)), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext11d.getText().toString())));
						}
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0)))) || ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(_charSeq)), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString())));
						}
					}
				}
				else {
					if (((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (Double.parseDouble(edittext2xd.getText().toString()) > 500)) && ((Double.parseDouble(edittext2xd.getText().toString()) < 800) || (Double.parseDouble(edittext2xd.getText().toString()) == 800))) {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(_charSeq)), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString())));
						}
					}
					else {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format(((((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(_charSeq)), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString())) + ((((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()) + (2 * Double.parseDouble(_charSeq)), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString()))));
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
		
		button111d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear111d.setVisibility(View.VISIBLE);
				button111d.setVisibility(View.GONE);
			}
		});
		
		edittext9d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext9d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) < 500) {
					if (Double.parseDouble(edittext5d.getText().toString()) > 3.50d) {
						if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0)))) || (((edittext13d.getText().toString().equals("") || edittext13d.getText().toString().equals(".")) || (edittext13d.getText().toString().equals("-") || (Double.parseDouble(edittext13d.getText().toString()) < 0))) || ((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))))) {
							edittext22d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - ((Double.parseDouble(_charSeq) + Double.parseDouble(edittext19d.getText().toString())) + (Double.parseDouble(edittext13d.getText().toString()) + Double.parseDouble(edittext16d.getText().toString())))));
						}
					}
					else {
						if ((Double.parseDouble(edittext5d.getText().toString()) > 1.50d) && ((Double.parseDouble(edittext5d.getText().toString()) < 3.5d) || (Double.parseDouble(edittext5d.getText().toString()) == 3.5d))) {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext13d.getText().toString().equals("") || edittext13d.getText().toString().equals(".")) || (edittext13d.getText().toString().equals("-") || (Double.parseDouble(edittext13d.getText().toString()) < 0))) || ((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))))) {
								edittext22d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(_charSeq) + (Double.parseDouble(edittext13d.getText().toString()) + Double.parseDouble(edittext16d.getText().toString())))));
							}
						}
						else {
							if ((Double.parseDouble(edittext5d.getText().toString()) < 1.5d) || (Double.parseDouble(edittext5d.getText().toString()) == 1.5d)) {
								if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0)))) {
									edittext22d.setText(String.valueOf(Double.parseDouble("00.00")));
								}
								else {
									edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(_charSeq) + Double.parseDouble(edittext11d.getText().toString()))));
								}
							}
						}
					}
					if (Double.parseDouble(edittext5d.getText().toString()) > 1.50d) {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(_charSeq)));
						}
					}
					else {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) || ((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0)))) || ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(_charSeq)));
						}
					}
				}
				else {
					if ((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (((Double.parseDouble(edittext2xd.getText().toString()) > 500) && (Double.parseDouble(edittext2xd.getText().toString()) < 800)) || (Double.parseDouble(edittext2xd.getText().toString()) == 800))) {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(_charSeq)));
						}
						if (((Double.parseDouble(edittext5d.getText().toString()) == ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) || (Double.parseDouble(edittext5d.getText().toString()) > ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d))) && (Double.parseDouble(edittext5d.getText().toString()) < 3.00d)) {
							if (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0)))) {
								edittext22d.setText(String.valueOf(0.00d));
							}
							else {
								edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(_charSeq) + Double.parseDouble(edittext11d.getText().toString()))));
							}
						}
						else {
							if ((Double.parseDouble(edittext5d.getText().toString()) == 3.00d) || (((Double.parseDouble(edittext5d.getText().toString()) > 3.00d) && (Double.parseDouble(edittext5d.getText().toString()) < 4.5d)) || (Double.parseDouble(edittext5d.getText().toString()) == 4.5d))) {
								if (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || (((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))) || ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))))) {
									edittext22d.setText(String.valueOf(0.00d));
								}
								else {
									edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(_charSeq) + (Double.parseDouble(edittext11d.getText().toString()) + Double.parseDouble(edittext16d.getText().toString())))));
								}
							}
							else {
								if (Double.parseDouble(edittext5d.getText().toString()) > 4.50d) {
									if (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || (((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))) || (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0)))))) {
										edittext22d.setText(String.valueOf(0.00d));
									}
									else {
										edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(_charSeq) + (Double.parseDouble(edittext11d.getText().toString()) + (Double.parseDouble(edittext16d.getText().toString()) + Double.parseDouble(edittext19d.getText().toString()))))));
									}
								}
							}
						}
					}
					else {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || (((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format(((((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(_charSeq)) + ((((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4)) * Double.parseDouble(_charSeq))));
						}
						if ((Double.parseDouble(edittext5d.getText().toString()) == ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) || (((Double.parseDouble(edittext5d.getText().toString()) > ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) && (Double.parseDouble(edittext5d.getText().toString()) < 3.00d)) || (Double.parseDouble(edittext5d.getText().toString()) == 3.00d))) {
							if (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0)))) {
								edittext22d.setText(String.valueOf(0.00d));
							}
							else {
								edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(_charSeq) + Double.parseDouble(edittext11d.getText().toString()))));
							}
						}
						else {
							if (Double.parseDouble(edittext5d.getText().toString()) > 3.00d) {
								if (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || (((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))) || ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))))) {
									edittext22d.setText(String.valueOf(0.00d));
								}
								else {
									edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(_charSeq) + (Double.parseDouble(edittext11d.getText().toString()) + Double.parseDouble(edittext16d.getText().toString())))));
								}
							}
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
		
		edittext103d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext103d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (Double.parseDouble(edittext2xd.getText().toString()) > 800) {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0)))))) {
						edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext10d.setText(_English_Decimal_Format(((((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString())) + ((((Math.PI * Math.pow(Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString()))));
					}
					if ((Double.parseDouble(edittext5d.getText().toString()) < 3) || (Double.parseDouble(edittext5d.getText().toString()) == 3)) {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0)))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
							edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - (((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4) + ((Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)) / 4))) * Double.parseDouble(edittext11d.getText().toString())));
						}
					}
					else {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0)))) || ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
							edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString())))) - (((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4) + ((Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)) / 4))) * Double.parseDouble(edittext11d.getText().toString())));
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
		
		edittext8d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext8d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) < 500) {
					if (Double.parseDouble(edittext5d.getText().toString()) > 1.50d) {
						if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext13d.getText().toString().equals("") || edittext13d.getText().toString().equals(".")) || (edittext13d.getText().toString().equals("-") || (Double.parseDouble(edittext13d.getText().toString()) < 0)))) || ((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0)))) {
							edittext14d.setText(String.valueOf(00.00));
						}
						else {
							edittext14d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)) / 4)) * Double.parseDouble(edittext13d.getText().toString())));
						}
						if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0)))) || (((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) || ((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))))) {
							edittext17d.setText(String.valueOf(00.00));
						}
						else {
							edittext17d.setText(_English_Decimal_Format(((((Math.PI / 4) * (Math.pow(Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext15d.getText().toString())), 2) - Math.pow(Double.parseDouble(_charSeq), 2))) + ((Math.PI / 4) * (Math.pow(Double.parseDouble(edittext6d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString())), 2) - Math.pow(Double.parseDouble(edittext6d.getText().toString()), 2)))) / 2) * Double.parseDouble(edittext16d.getText().toString())));
						}
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString())));
						}
					}
					else {
						if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0)))) || (((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))) || ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))))) {
							edittext12d.setText(String.valueOf(00.00));
						}
						else {
							edittext12d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(edittext6d.getText().toString()) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)) / 4)) * Double.parseDouble(edittext11d.getText().toString())));
						}
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) || ((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0)))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString())));
						}
					}
				}
				else {
					if ((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (((Double.parseDouble(edittext2xd.getText().toString()) > 500) && (Double.parseDouble(edittext2xd.getText().toString()) < 800)) || (Double.parseDouble(edittext2xd.getText().toString()) == 800))) {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(_charSeq) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString())));
						}
						if (Double.parseDouble(edittext5d.getText().toString()) < 3) {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - ((Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)) / 4)) * Double.parseDouble(edittext11d.getText().toString())));
							}
						}
						else {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString())))) - ((Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)) / 4)) * Double.parseDouble(edittext11d.getText().toString())));
							}
						}
					}
					else {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))) || (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))))) {
							edittext10d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext10d.setText(_English_Decimal_Format(((((Math.PI * Math.pow(Double.parseDouble(_charSeq) + (2 * Double.parseDouble(_charSeq)), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString())) + ((((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext9d.getText().toString()))));
						}
						if ((Double.parseDouble(edittext5d.getText().toString()) < 3) || (Double.parseDouble(edittext5d.getText().toString()) == 3)) {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - (((Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)) / 4) + ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4))) * Double.parseDouble(edittext11d.getText().toString())));
							}
						}
						else {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))) || ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString())))) - (((Math.PI * Math.pow(Double.parseDouble(_charSeq), 2)) / 4) + ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4))) * Double.parseDouble(edittext11d.getText().toString())));
							}
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
		
		edittext10d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(edittext2xd.getText().toString()) > 800) {
					edittext30d.setText(_English_Decimal_Format(Double.parseDouble(edittext28d.getText().toString()) + Double.parseDouble(_charSeq)));
				}
				else {
					edittext30d.setText(_English_Decimal_Format(((Double.parseDouble(edittext28d.getText().toString()) + Double.parseDouble(_charSeq)) + (Double.parseDouble(edittext14d.getText().toString()) + Double.parseDouble(edittext17d.getText().toString()))) + (Double.parseDouble(edittext20d.getText().toString()) + (Double.parseDouble(edittext23d.getText().toString()) + Double.parseDouble(edittext27d.getText().toString())))));
				}
				if ((edittext112d.getText().toString().equals("") || edittext112d.getText().toString().equals(".")) || (edittext112d.getText().toString().equals("-") || (Double.parseDouble(edittext112d.getText().toString()) < 0))) {
					edittext113d.setText(String.valueOf(0));
				}
				else {
					edittext113d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext112d.getText().toString())));
				}
				if ((edittext210d.getText().toString().equals("") || edittext210d.getText().toString().equals(".")) || (edittext210d.getText().toString().equals("-") || (Double.parseDouble(edittext210d.getText().toString()) < 0))) {
					edittext211d.setText(String.valueOf(0));
				}
				else {
					edittext211d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext210d.getText().toString())));
				}
				if ((edittext214d.getText().toString().equals("") || edittext214d.getText().toString().equals(".")) || (edittext214d.getText().toString().equals("-") || (Double.parseDouble(edittext214d.getText().toString()) < 0))) {
					edittext215d.setText(String.valueOf(0));
				}
				else {
					edittext215d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext214d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		close111d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear111d.setVisibility(View.GONE);
				button111d.setVisibility(View.VISIBLE);
			}
		});
		
		edittext112d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext112d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext113d.setText(String.valueOf(0));
				}
				else {
					edittext113d.setText(_English_Decimal_Format(Double.parseDouble(edittext10d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext113d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext114d.getText().toString().equals("") || edittext114d.getText().toString().equals(".")) || (edittext114d.getText().toString().equals("-") || ((Double.parseDouble(edittext114d.getText().toString()) < 0) || (Double.parseDouble(edittext114d.getText().toString()) == 0)))) {
					edittext115d.setText(String.valueOf(0));
				}
				else {
					edittext115d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) / Double.parseDouble(edittext114d.getText().toString())));
				}
				if ((edittext218d.getText().toString().equals("") || edittext218d.getText().toString().equals(".")) || (edittext218d.getText().toString().equals("-") || (Double.parseDouble(edittext218d.getText().toString()) < 0))) {
					edittext219d.setText(String.valueOf(0));
				}
				else {
					edittext219d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext218d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext114d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext114d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || ((Double.parseDouble(_charSeq) < 0) || (Double.parseDouble(_charSeq) == 0)))) {
					edittext115d.setText(String.valueOf(0));
				}
				else {
					edittext115d.setText(_English_Decimal_Format(Double.parseDouble(edittext113d.getText().toString()) / Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext218d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext219d.setText(String.valueOf(0));
				}
				else {
					edittext219d.setText(_English_Decimal_Format(Double.parseDouble(edittext113d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext214d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext215d.setText(String.valueOf(0));
				}
				else {
					edittext215d.setText(_English_Decimal_Format(Double.parseDouble(edittext10d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext210d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext211d.setText(String.valueOf(0));
				}
				else {
					edittext211d.setText(_English_Decimal_Format(Double.parseDouble(edittext10d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button121d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear121d.setVisibility(View.VISIBLE);
				button121d.setVisibility(View.GONE);
			}
		});
		
		edittext11d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext11d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) < 500) {
					if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0)))) || (((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0))) || ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))))) {
						edittext12d.setText(String.valueOf(00.00));
					}
					else {
						edittext12d.setText(_English_Decimal_Format((((Math.PI * Math.pow(Double.parseDouble(edittext6d.getText().toString()) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(_charSeq)));
					}
					if ((Double.parseDouble(edittext5d.getText().toString()) < 1.5d) || (Double.parseDouble(edittext5d.getText().toString()) == 1.5d)) {
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0)))) {
							edittext22d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + Double.parseDouble(_charSeq))));
						}
					}
				}
				else {
					if ((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (((Double.parseDouble(edittext2xd.getText().toString()) > 500) && (Double.parseDouble(edittext2xd.getText().toString()) < 800)) || (Double.parseDouble(edittext2xd.getText().toString()) == 800))) {
						if (Double.parseDouble(edittext5d.getText().toString()) < 3) {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(_charSeq)));
							}
						}
						else {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString())))) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(_charSeq)));
							}
						}
						if (((Double.parseDouble(edittext5d.getText().toString()) == ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) || (Double.parseDouble(edittext5d.getText().toString()) > ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d))) && (Double.parseDouble(edittext5d.getText().toString()) < 3.00d)) {
							if (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0)))) {
								edittext22d.setText(String.valueOf(0.00d));
							}
							else {
								edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + Double.parseDouble(_charSeq))));
							}
						}
						else {
							if ((Double.parseDouble(edittext5d.getText().toString()) == 3.00d) || (((Double.parseDouble(edittext5d.getText().toString()) > 3.00d) && (Double.parseDouble(edittext5d.getText().toString()) < 4.5d)) || (Double.parseDouble(edittext5d.getText().toString()) == 4.5d))) {
								if (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || (((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))) || ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))))) {
									edittext22d.setText(String.valueOf(0.00d));
								}
								else {
									edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext16d.getText().toString())))));
								}
							}
							else {
								if (Double.parseDouble(edittext5d.getText().toString()) > 4.50d) {
									if (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || (((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))) || (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0)))))) {
										edittext22d.setText(String.valueOf(0.00d));
									}
									else {
										edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + (Double.parseDouble(_charSeq) + (Double.parseDouble(edittext16d.getText().toString()) + Double.parseDouble(edittext19d.getText().toString()))))));
									}
								}
							}
						}
					}
					else {
						if ((Double.parseDouble(edittext5d.getText().toString()) < 3) || (Double.parseDouble(edittext5d.getText().toString()) == 3)) {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - (((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4) + ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4))) * Double.parseDouble(_charSeq)));
							}
						}
						else {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))) || ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString())))) - (((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4) + ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4))) * Double.parseDouble(_charSeq)));
							}
						}
						if ((Double.parseDouble(edittext5d.getText().toString()) == ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) || (((Double.parseDouble(edittext5d.getText().toString()) > ((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.60d)) && (Double.parseDouble(edittext5d.getText().toString()) < 3.00d)) || (Double.parseDouble(edittext5d.getText().toString()) == 3.00d))) {
							if (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0)))) {
								edittext22d.setText(String.valueOf(0.00d));
							}
							else {
								edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + Double.parseDouble(_charSeq))));
							}
						}
						else {
							if (Double.parseDouble(edittext5d.getText().toString()) > 3.00d) {
								if (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || (((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))) || ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))))) {
									edittext22d.setText(String.valueOf(0.00d));
								}
								else {
									edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext16d.getText().toString())))));
								}
							}
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
		
		edittext12d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(edittext2xd.getText().toString()) > 800) {
					edittext29d.setText(_English_Decimal_Format((Double.parseDouble(_charSeq) + Double.parseDouble(edittext17d.getText().toString())) + (Double.parseDouble(edittext20d.getText().toString()) + (Double.parseDouble(edittext23d.getText().toString()) + Double.parseDouble(edittext27d.getText().toString())))));
				}
				else {
					edittext29d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq)));
				}
				if ((edittext122d.getText().toString().equals("") || edittext122d.getText().toString().equals(".")) || (edittext122d.getText().toString().equals("-") || (Double.parseDouble(edittext122d.getText().toString()) < 0))) {
					edittext123d.setText(String.valueOf(0));
				}
				else {
					edittext123d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext122d.getText().toString())));
				}
				if ((edittext220d.getText().toString().equals("") || edittext220d.getText().toString().equals(".")) || (edittext220d.getText().toString().equals("-") || (Double.parseDouble(edittext220d.getText().toString()) < 0))) {
					edittext221d.setText(String.valueOf(0));
				}
				else {
					edittext221d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext220d.getText().toString())));
				}
				if ((edittext224d.getText().toString().equals("") || edittext224d.getText().toString().equals(".")) || (edittext224d.getText().toString().equals("-") || (Double.parseDouble(edittext224d.getText().toString()) < 0))) {
					edittext225d.setText(String.valueOf(0));
				}
				else {
					edittext225d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext224d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		close121d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear121d.setVisibility(View.GONE);
				button121d.setVisibility(View.VISIBLE);
			}
		});
		
		edittext122d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext122d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext123d.setText(String.valueOf(0));
				}
				else {
					edittext123d.setText(_English_Decimal_Format(Double.parseDouble(edittext12d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext123d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext124d.getText().toString().equals("") || edittext124d.getText().toString().equals(".")) || (edittext124d.getText().toString().equals("-") || ((Double.parseDouble(edittext124d.getText().toString()) < 0) || (Double.parseDouble(edittext124d.getText().toString()) == 0)))) {
					edittext125d.setText(String.valueOf(0));
				}
				else {
					edittext125d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) / Double.parseDouble(edittext124d.getText().toString())));
				}
				if ((edittext228d.getText().toString().equals("") || edittext228d.getText().toString().equals(".")) || (edittext228d.getText().toString().equals("-") || (Double.parseDouble(edittext228d.getText().toString()) < 0))) {
					edittext229d.setText(String.valueOf(0));
				}
				else {
					edittext229d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext228d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext124d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext124d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || ((Double.parseDouble(_charSeq) < 0) || (Double.parseDouble(_charSeq) == 0)))) {
					edittext125d.setText(String.valueOf(0));
				}
				else {
					edittext125d.setText(_English_Decimal_Format(Double.parseDouble(edittext123d.getText().toString()) / Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext228d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext228d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext229d.setText(String.valueOf(0));
				}
				else {
					edittext229d.setText(_English_Decimal_Format(Double.parseDouble(edittext123d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext224d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext224d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext225d.setText(String.valueOf(0));
				}
				else {
					edittext225d.setText(_English_Decimal_Format(Double.parseDouble(edittext12d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext220d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext220d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext221d.setText(String.valueOf(0));
				}
				else {
					edittext221d.setText(_English_Decimal_Format(Double.parseDouble(edittext12d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button131d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear131d.setVisibility(View.VISIBLE);
				button131d.setVisibility(View.GONE);
			}
		});
		
		edittext13d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext13d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) < 500) {
					if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0)))) || ((edittext7d.getText().toString().equals("") || edittext7d.getText().toString().equals(".")) || (edittext7d.getText().toString().equals("-") || (Double.parseDouble(edittext7d.getText().toString()) < 0)))) {
						edittext14d.setText(String.valueOf(00.00));
					}
					else {
						edittext14d.setText(String.valueOf((((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(edittext7d.getText().toString())), 2)) / 4) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(_charSeq)));
					}
					if (Double.parseDouble(edittext5d.getText().toString()) > 3.50d) {
						if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0)))) || (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))))) {
							edittext22d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext22d.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString()) - ((Double.parseDouble(edittext9d.getText().toString()) + Double.parseDouble(edittext19d.getText().toString())) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext16d.getText().toString())))));
						}
					}
					else {
						if ((Double.parseDouble(edittext5d.getText().toString()) > 2.50d) && ((Double.parseDouble(edittext5d.getText().toString()) < 3.50d) || (Double.parseDouble(edittext5d.getText().toString()) == 3.50d))) {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))))) {
								edittext22d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext22d.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext16d.getText().toString())))));
							}
						}
						else {
							if ((Double.parseDouble(edittext5d.getText().toString()) > 1.50d) && ((Double.parseDouble(edittext5d.getText().toString()) < 2.5d) || (Double.parseDouble(edittext5d.getText().toString()) == 2.5d))) {
								if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))))) {
									edittext22d.setText(String.valueOf(Double.parseDouble("00.00")));
								}
								else {
									edittext22d.setText(String.valueOf(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext16d.getText().toString())))));
								}
							}
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
		
		edittext14d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext14d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext30d.setText(_English_Decimal_Format(((Double.parseDouble(edittext28d.getText().toString()) + Double.parseDouble(edittext10d.getText().toString())) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext17d.getText().toString()))) + (Double.parseDouble(edittext20d.getText().toString()) + (Double.parseDouble(edittext23d.getText().toString()) + Double.parseDouble(edittext27d.getText().toString())))));
				if ((edittext132d.getText().toString().equals("") || edittext132d.getText().toString().equals(".")) || (edittext132d.getText().toString().equals("-") || (Double.parseDouble(edittext132d.getText().toString()) < 0))) {
					edittext133d.setText(String.valueOf(0));
				}
				else {
					edittext133d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext132d.getText().toString())));
				}
				if ((edittext230d.getText().toString().equals("") || edittext230d.getText().toString().equals(".")) || (edittext230d.getText().toString().equals("-") || (Double.parseDouble(edittext230d.getText().toString()) < 0))) {
					edittext231d.setText(String.valueOf(0));
				}
				else {
					edittext231d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext230d.getText().toString())));
				}
				if ((edittext234d.getText().toString().equals("") || edittext234d.getText().toString().equals(".")) || (edittext234d.getText().toString().equals("-") || (Double.parseDouble(edittext234d.getText().toString()) < 0))) {
					edittext235d.setText(String.valueOf(0));
				}
				else {
					edittext235d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext234d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		close131d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear131d.setVisibility(View.GONE);
				button131d.setVisibility(View.VISIBLE);
			}
		});
		
		edittext132d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext132d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext133d.setText(String.valueOf(0));
				}
				else {
					edittext133d.setText(_English_Decimal_Format(Double.parseDouble(edittext14d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext133d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext134d.getText().toString().equals("") || edittext134d.getText().toString().equals(".")) || (edittext134d.getText().toString().equals("-") || ((Double.parseDouble(edittext134d.getText().toString()) < 0) || (Double.parseDouble(edittext134d.getText().toString()) == 0)))) {
					edittext135d.setText(String.valueOf(0));
				}
				else {
					edittext135d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) / Double.parseDouble(edittext134d.getText().toString())));
				}
				if ((edittext238d.getText().toString().equals("") || edittext238d.getText().toString().equals(".")) || (edittext238d.getText().toString().equals("-") || (Double.parseDouble(edittext238d.getText().toString()) < 0))) {
					edittext239d.setText(String.valueOf(0));
				}
				else {
					edittext239d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext238d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext134d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext134d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || ((Double.parseDouble(_charSeq) < 0) || (Double.parseDouble(_charSeq) == 0)))) {
					edittext135d.setText(String.valueOf(0));
				}
				else {
					edittext135d.setText(_English_Decimal_Format(Double.parseDouble(edittext133d.getText().toString()) / Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext238d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext238d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext239d.setText(String.valueOf(0));
				}
				else {
					edittext239d.setText(_English_Decimal_Format(Double.parseDouble(edittext133d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext234d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext234d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext235d.setText(String.valueOf(0));
				}
				else {
					edittext235d.setText(_English_Decimal_Format(Double.parseDouble(edittext14d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext230d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext230d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext231d.setText(String.valueOf(0));
				}
				else {
					edittext231d.setText(_English_Decimal_Format(Double.parseDouble(edittext14d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button141d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear141d.setVisibility(View.VISIBLE);
				button141d.setVisibility(View.GONE);
			}
		});
		
		edittext15d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext15d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) < 500) {
					if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0)))) || (((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) || ((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))))) {
						edittext17d.setText(String.valueOf(00.00));
					}
					else {
						edittext17d.setText(_English_Decimal_Format(((((Math.PI / 4) * (Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(_charSeq)), 2) - Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2))) + ((Math.PI / 4) * (Math.pow(Double.parseDouble(edittext6d.getText().toString()) + (2 * Double.parseDouble(_charSeq)), 2) - Math.pow(Double.parseDouble(edittext6d.getText().toString()), 2)))) / 2) * Double.parseDouble(edittext16d.getText().toString())));
					}
				}
				else {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
						edittext17d.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext17d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(_charSeq))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(_charSeq)))) - (Double.parseDouble(edittext101d.getText().toString()) * Double.parseDouble(edittext102d.getText().toString()))) * Double.parseDouble(edittext16d.getText().toString())));
					}
					if ((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (((Double.parseDouble(edittext2xd.getText().toString()) > 500) && (Double.parseDouble(edittext2xd.getText().toString()) < 800)) || (Double.parseDouble(edittext2xd.getText().toString()) == 800))) {
						if (Double.parseDouble(edittext5d.getText().toString()) < 3) {
							if (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext11d.getText().toString())));
							}
						}
						else {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(_charSeq))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(_charSeq)))) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext11d.getText().toString())));
							}
						}
					}
					else {
						if ((Double.parseDouble(edittext5d.getText().toString()) < 3) || (Double.parseDouble(edittext5d.getText().toString()) == 3)) {
							if (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || (((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - (((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4) + ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4))) * Double.parseDouble(edittext11d.getText().toString())));
							}
						}
						else {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))) || ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(_charSeq))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(_charSeq)))) - (((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4) + ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4))) * Double.parseDouble(edittext11d.getText().toString())));
							}
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
		
		edittext16d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext16d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) < 500) {
					if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0)))) || (((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) || ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0))))) {
						edittext17d.setText(String.valueOf(00.00));
					}
					else {
						edittext17d.setText(_English_Decimal_Format(((((Math.PI / 4) * (Math.pow(Double.parseDouble(edittext8d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString())), 2) - Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2))) + ((Math.PI / 4) * (Math.pow(Double.parseDouble(edittext6d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString())), 2) - Math.pow(Double.parseDouble(edittext6d.getText().toString()), 2)))) / 2) * Double.parseDouble(_charSeq)));
					}
					if (Double.parseDouble(edittext5d.getText().toString()) > 3.50d) {
						if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0)))) || (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((edittext13d.getText().toString().equals("") || edittext13d.getText().toString().equals(".")) || (edittext13d.getText().toString().equals("-") || (Double.parseDouble(edittext13d.getText().toString()) < 0))))) {
							edittext22d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - ((Double.parseDouble(edittext9d.getText().toString()) + Double.parseDouble(edittext19d.getText().toString())) + (Double.parseDouble(edittext13d.getText().toString()) + Double.parseDouble(_charSeq)))));
						}
					}
					else {
						if ((Double.parseDouble(edittext5d.getText().toString()) > 2.50d) && ((Double.parseDouble(edittext5d.getText().toString()) < 3.50d) || (Double.parseDouble(edittext5d.getText().toString()) == 3.50d))) {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((edittext13d.getText().toString().equals("") || edittext13d.getText().toString().equals(".")) || (edittext13d.getText().toString().equals("-") || (Double.parseDouble(edittext13d.getText().toString()) < 0))))) {
								edittext22d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + (Double.parseDouble(edittext13d.getText().toString()) + Double.parseDouble(_charSeq)))));
							}
						}
						else {
							if ((Double.parseDouble(edittext5d.getText().toString()) > 1.50d) && ((Double.parseDouble(edittext5d.getText().toString()) < 2.5d) || (Double.parseDouble(edittext5d.getText().toString()) == 2.5d))) {
								if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((edittext13d.getText().toString().equals("") || edittext13d.getText().toString().equals(".")) || (edittext13d.getText().toString().equals("-") || (Double.parseDouble(edittext13d.getText().toString()) < 0))))) {
									edittext22d.setText(String.valueOf(Double.parseDouble("00.00")));
								}
								else {
									edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + (Double.parseDouble(edittext13d.getText().toString()) + Double.parseDouble(_charSeq)))));
								}
							}
						}
					}
				}
				else {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
						edittext17d.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext17d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext15d.getText().toString())))) - (Double.parseDouble(edittext101d.getText().toString()) * Double.parseDouble(edittext102d.getText().toString()))) * Double.parseDouble(_charSeq)));
					}
					if ((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (((Double.parseDouble(edittext2xd.getText().toString()) > 500) && (Double.parseDouble(edittext2xd.getText().toString()) < 800)) || (Double.parseDouble(edittext2xd.getText().toString()) == 800))) {
						if ((Double.parseDouble(edittext5d.getText().toString()) == 3.00d) || (((Double.parseDouble(edittext5d.getText().toString()) > 3.00d) && (Double.parseDouble(edittext5d.getText().toString()) < 4.5d)) || (Double.parseDouble(edittext5d.getText().toString()) == 4.5d))) {
							if (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))))) {
								edittext22d.setText(String.valueOf(0.00d));
							}
							else {
								edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext11d.getText().toString())))));
							}
						}
						else {
							if (Double.parseDouble(edittext5d.getText().toString()) > 4.50d) {
								if (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0)))))) {
									edittext22d.setText(String.valueOf(0.00d));
								}
								else {
									edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + (Double.parseDouble(_charSeq) + (Double.parseDouble(edittext11d.getText().toString()) + Double.parseDouble(edittext19d.getText().toString()))))));
								}
							}
						}
					}
					else {
						if (Double.parseDouble(edittext5d.getText().toString()) > 3.00d) {
							if (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))))) {
								edittext22d.setText(String.valueOf(0.00d));
							}
							else {
								edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext11d.getText().toString())))));
							}
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
		
		edittext17d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext17d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) > 800) {
					edittext29d.setText(_English_Decimal_Format((Double.parseDouble(edittext12d.getText().toString()) + Double.parseDouble(_charSeq)) + (Double.parseDouble(edittext20d.getText().toString()) + (Double.parseDouble(edittext23d.getText().toString()) + Double.parseDouble(edittext27d.getText().toString())))));
				}
				else {
					edittext30d.setText(_English_Decimal_Format(((Double.parseDouble(edittext28d.getText().toString()) + Double.parseDouble(edittext10d.getText().toString())) + (Double.parseDouble(edittext14d.getText().toString()) + Double.parseDouble(_charSeq))) + (Double.parseDouble(edittext20d.getText().toString()) + (Double.parseDouble(edittext23d.getText().toString()) + Double.parseDouble(edittext27d.getText().toString())))));
					edittext30d.setText(String.valueOf(0));
				}
				if ((edittext142d.getText().toString().equals("") || edittext142d.getText().toString().equals(".")) || (edittext142d.getText().toString().equals("-") || (Double.parseDouble(edittext142d.getText().toString()) < 0))) {
					edittext143d.setText(String.valueOf(0));
				}
				else {
					edittext143d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext142d.getText().toString())));
				}
				if ((edittext240d.getText().toString().equals("") || edittext240d.getText().toString().equals(".")) || (edittext240d.getText().toString().equals("-") || (Double.parseDouble(edittext240d.getText().toString()) < 0))) {
					edittext241d.setText(String.valueOf(0));
				}
				else {
					edittext241d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext240d.getText().toString())));
				}
				if ((edittext244d.getText().toString().equals("") || edittext244d.getText().toString().equals(".")) || (edittext244d.getText().toString().equals("-") || (Double.parseDouble(edittext244d.getText().toString()) < 0))) {
					edittext245d.setText(String.valueOf(0));
				}
				else {
					edittext245d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext244d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		close141d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear141d.setVisibility(View.GONE);
				button141d.setVisibility(View.VISIBLE);
			}
		});
		
		edittext142d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext142d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext143d.setText(String.valueOf(0));
				}
				else {
					edittext143d.setText(_English_Decimal_Format(Double.parseDouble(edittext17d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext143d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext144d.getText().toString().equals("") || edittext144d.getText().toString().equals(".")) || (edittext144d.getText().toString().equals("-") || ((Double.parseDouble(edittext144d.getText().toString()) < 0) || (Double.parseDouble(edittext144d.getText().toString()) == 0)))) {
					edittext145d.setText(String.valueOf(0));
				}
				else {
					edittext145d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) / Double.parseDouble(edittext144d.getText().toString())));
				}
				if ((edittext248d.getText().toString().equals("") || edittext248d.getText().toString().equals(".")) || (edittext248d.getText().toString().equals("-") || (Double.parseDouble(edittext248d.getText().toString()) < 0))) {
					edittext249d.setText(String.valueOf(0));
				}
				else {
					edittext249d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext248d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext144d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext144d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || ((Double.parseDouble(_charSeq) < 0) || (Double.parseDouble(_charSeq) == 0)))) {
					edittext145d.setText(String.valueOf(0));
				}
				else {
					edittext145d.setText(_English_Decimal_Format(Double.parseDouble(edittext143d.getText().toString()) / Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext248d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext248d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext249d.setText(String.valueOf(0));
				}
				else {
					edittext249d.setText(_English_Decimal_Format(Double.parseDouble(edittext143d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext244d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext244d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext245d.setText(String.valueOf(0));
				}
				else {
					edittext245d.setText(_English_Decimal_Format(Double.parseDouble(edittext17d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext240d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext240d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext241d.setText(String.valueOf(0));
				}
				else {
					edittext241d.setText(_English_Decimal_Format(Double.parseDouble(edittext17d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button151d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear151d.setVisibility(View.VISIBLE);
				button151d.setVisibility(View.GONE);
			}
		});
		
		edittext18d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext18d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) < 500) {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) || ((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0))))) {
						edittext20d.setText(String.valueOf(00.00));
					}
					else {
						edittext20d.setText(_English_Decimal_Format(((Math.PI / 4) * (Math.pow(Double.parseDouble(edittext6d.getText().toString()) + (2 * Double.parseDouble(_charSeq)), 2) - Math.pow(Double.parseDouble(edittext6d.getText().toString()), 2))) * Double.parseDouble(edittext19d.getText().toString())));
					}
				}
				else {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
						edittext20d.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext20d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(_charSeq))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(_charSeq)))) - (Double.parseDouble(edittext101d.getText().toString()) * Double.parseDouble(edittext102d.getText().toString()))) * Double.parseDouble(edittext19d.getText().toString())));
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
		
		edittext19d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext19d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) < 500) {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) || ((edittext18d.getText().toString().equals("") || edittext18d.getText().toString().equals(".")) || (edittext18d.getText().toString().equals("-") || (Double.parseDouble(edittext18d.getText().toString()) < 0))))) {
						edittext20d.setText(String.valueOf(00.00));
					}
					else {
						edittext20d.setText(_English_Decimal_Format(((Math.PI / 4) * (Math.pow(Double.parseDouble(edittext6d.getText().toString()) + (2 * Double.parseDouble(edittext18d.getText().toString())), 2) - Math.pow(Double.parseDouble(edittext6d.getText().toString()), 2))) * Double.parseDouble(_charSeq)));
					}
					if (Double.parseDouble(edittext5d.getText().toString()) > 3.50d) {
						if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext13d.getText().toString().equals("") || edittext13d.getText().toString().equals(".")) || (edittext13d.getText().toString().equals("-") || (Double.parseDouble(edittext13d.getText().toString()) < 0)))) || (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || ((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))))) {
							edittext22d.setText(String.valueOf(Double.parseDouble("00.00")));
						}
						else {
							edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - ((Double.parseDouble(edittext9d.getText().toString()) + Double.parseDouble(_charSeq)) + (Double.parseDouble(edittext13d.getText().toString()) + Double.parseDouble(edittext16d.getText().toString())))));
						}
					}
				}
				else {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext18d.getText().toString().equals("") || edittext18d.getText().toString().equals(".")) || (edittext18d.getText().toString().equals("-") || (Double.parseDouble(edittext18d.getText().toString()) < 0))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
						edittext20d.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext20d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext18d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext18d.getText().toString())))) - (Double.parseDouble(edittext101d.getText().toString()) * Double.parseDouble(edittext102d.getText().toString()))) * Double.parseDouble(_charSeq)));
					}
					if ((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (((Double.parseDouble(edittext2xd.getText().toString()) > 500) && (Double.parseDouble(edittext2xd.getText().toString()) < 800)) || (Double.parseDouble(edittext2xd.getText().toString()) == 800))) {
						if (Double.parseDouble(edittext5d.getText().toString()) > 4.50d) {
							if (((edittext9d.getText().toString().equals("") || edittext9d.getText().toString().equals(".")) || (edittext9d.getText().toString().equals("-") || (Double.parseDouble(edittext9d.getText().toString()) < 0))) || (((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) || (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0)))))) {
								edittext22d.setText(String.valueOf(0.00d));
							}
							else {
								edittext22d.setText(_English_Decimal_Format(Double.parseDouble(edittext5d.getText().toString()) - (Double.parseDouble(edittext9d.getText().toString()) + (Double.parseDouble(_charSeq) + (Double.parseDouble(edittext11d.getText().toString()) + Double.parseDouble(edittext16d.getText().toString()))))));
							}
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
		
		edittext20d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext20d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) > 800) {
					edittext29d.setText(_English_Decimal_Format((Double.parseDouble(edittext12d.getText().toString()) + Double.parseDouble(edittext17d.getText().toString())) + (Double.parseDouble(_charSeq) + (Double.parseDouble(edittext23d.getText().toString()) + Double.parseDouble(edittext27d.getText().toString())))));
				}
				else {
					edittext30d.setText(_English_Decimal_Format(((Double.parseDouble(edittext28d.getText().toString()) + Double.parseDouble(edittext10d.getText().toString())) + (Double.parseDouble(edittext14d.getText().toString()) + Double.parseDouble(edittext17d.getText().toString()))) + (Double.parseDouble(_charSeq) + (Double.parseDouble(edittext23d.getText().toString()) + Double.parseDouble(edittext27d.getText().toString())))));
				}
				if ((edittext152d.getText().toString().equals("") || edittext152d.getText().toString().equals(".")) || (edittext152d.getText().toString().equals("-") || (Double.parseDouble(edittext152d.getText().toString()) < 0))) {
					edittext153d.setText(String.valueOf(0));
				}
				else {
					edittext153d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext152d.getText().toString())));
				}
				if ((edittext250d.getText().toString().equals("") || edittext250d.getText().toString().equals(".")) || (edittext250d.getText().toString().equals("-") || (Double.parseDouble(edittext250d.getText().toString()) < 0))) {
					edittext251d.setText(String.valueOf(0));
				}
				else {
					edittext251d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext250d.getText().toString())));
				}
				if ((edittext254d.getText().toString().equals("") || edittext254d.getText().toString().equals(".")) || (edittext254d.getText().toString().equals("-") || (Double.parseDouble(edittext254d.getText().toString()) < 0))) {
					edittext255d.setText(String.valueOf(0));
				}
				else {
					edittext255d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext254d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		close151d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear151d.setVisibility(View.GONE);
				button151d.setVisibility(View.VISIBLE);
			}
		});
		
		edittext152d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext152d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext153d.setText(String.valueOf(0));
				}
				else {
					edittext153d.setText(_English_Decimal_Format(Double.parseDouble(edittext20d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext153d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext154d.getText().toString().equals("") || edittext154d.getText().toString().equals(".")) || (edittext154d.getText().toString().equals("-") || ((Double.parseDouble(edittext154d.getText().toString()) < 0) || (Double.parseDouble(edittext154d.getText().toString()) == 0)))) {
					edittext155d.setText(String.valueOf(0));
				}
				else {
					edittext155d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) / Double.parseDouble(edittext154d.getText().toString())));
				}
				if ((edittext258d.getText().toString().equals("") || edittext258d.getText().toString().equals(".")) || (edittext258d.getText().toString().equals("-") || (Double.parseDouble(edittext258d.getText().toString()) < 0))) {
					edittext259d.setText(String.valueOf(0));
				}
				else {
					edittext259d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext258d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext154d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext154d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || ((Double.parseDouble(_charSeq) < 0) || (Double.parseDouble(_charSeq) == 0)))) {
					edittext155d.setText(String.valueOf(0));
				}
				else {
					edittext155d.setText(_English_Decimal_Format(Double.parseDouble(edittext153d.getText().toString()) / Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext258d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext258d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext259d.setText(String.valueOf(0));
				}
				else {
					edittext259d.setText(_English_Decimal_Format(Double.parseDouble(edittext153d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext254d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext254d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext255d.setText(String.valueOf(0));
				}
				else {
					edittext255d.setText(_English_Decimal_Format(Double.parseDouble(edittext20d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext250d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext250d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext251d.setText(String.valueOf(0));
				}
				else {
					edittext251d.setText(_English_Decimal_Format(Double.parseDouble(edittext20d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button161d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear161d.setVisibility(View.VISIBLE);
				button161d.setVisibility(View.GONE);
			}
		});
		
		edittext21d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext21d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (Double.parseDouble(edittext2xd.getText().toString()) < 500) {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) || ((edittext22d.getText().toString().equals("") || edittext22d.getText().toString().equals(".")) || (edittext22d.getText().toString().equals("-") || (Double.parseDouble(edittext22d.getText().toString()) < 0))))) {
						edittext23d.setText(String.valueOf(00.00));
					}
					else {
						edittext23d.setText(_English_Decimal_Format(((Math.PI / 4) * (Math.pow(Double.parseDouble(edittext6d.getText().toString()) + (2 * Double.parseDouble(_charSeq)), 2) - Math.pow(Double.parseDouble(edittext6d.getText().toString()), 2))) * Double.parseDouble(edittext22d.getText().toString())));
					}
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0)))) {
						edittext24d.setText("");
						edittext25d.setText("");
					}
					else {
						edittext24d.setText(_English_Decimal_Format((Double.parseDouble(edittext6d.getText().toString()) + (2 * Double.parseDouble(_charSeq))) + (2 * 0.15d)));
						edittext25d.setText(_English_Decimal_Format((Double.parseDouble(edittext6d.getText().toString()) + (2 * Double.parseDouble(_charSeq))) + (2 * 0.15d)));
					}
				}
				else {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext22d.getText().toString().equals("") || edittext22d.getText().toString().equals(".")) || (edittext22d.getText().toString().equals("-") || (Double.parseDouble(edittext22d.getText().toString()) < 0))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
						edittext23d.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext23d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(_charSeq))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(_charSeq)))) - (Double.parseDouble(edittext101d.getText().toString()) * Double.parseDouble(edittext102d.getText().toString()))) * Double.parseDouble(edittext22d.getText().toString())));
					}
					if (((Double.parseDouble(edittext2xd.getText().toString()) == 500) || (Double.parseDouble(edittext2xd.getText().toString()) > 500)) && ((Double.parseDouble(edittext2xd.getText().toString()) < 800) || (Double.parseDouble(edittext2xd.getText().toString()) == 800))) {
						if (Double.parseDouble(edittext5d.getText().toString()) < 3) {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(_charSeq))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(_charSeq)))) - ((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4)) * Double.parseDouble(edittext11d.getText().toString())));
							}
						}
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0)))) {
							edittext24d.setText("");
						}
						else {
							edittext24d.setText(_English_Decimal_Format((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(_charSeq))) + (2 * 0.15d)));
						}
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))) {
							edittext25d.setText("");
						}
						else {
							edittext25d.setText(_English_Decimal_Format((Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(_charSeq))) + (2 * 0.15d)));
						}
					}
					else {
						if (Double.parseDouble(edittext5d.getText().toString()) < 3) {
							if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) || ((edittext103d.getText().toString().equals("") || edittext103d.getText().toString().equals(".")) || (edittext103d.getText().toString().equals("-") || (Double.parseDouble(edittext103d.getText().toString()) < 0)))) || ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0)))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
								edittext12d.setText(String.valueOf(Double.parseDouble("00.00")));
							}
							else {
								edittext12d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(_charSeq))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(_charSeq)))) - (((Math.PI * Math.pow(Double.parseDouble(edittext8d.getText().toString()), 2)) / 4) + ((Math.PI * Math.pow(Double.parseDouble(edittext103d.getText().toString()), 2)) / 4))) * Double.parseDouble(edittext11d.getText().toString())));
							}
						}
						if ((((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals("."))) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) {
							edittext24d.setText("");
						}
						else {
							if (((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.70d) < 2) {
								edittext24d.setText(_English_Decimal_Format(2 + ((2 * Double.parseDouble(_charSeq)) + 0.30d)));
							}
							else {
								edittext24d.setText(_English_Decimal_Format(Double.parseDouble(edittext101d.getText().toString()) + ((2 * Double.parseDouble(_charSeq)) + 0.30d)));
							}
						}
						if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))) {
							edittext25d.setText("");
						}
						else {
							if (((Double.parseDouble(edittext2xd.getText().toString()) / 1000) + 0.70d) < 2) {
								edittext25d.setText(_English_Decimal_Format(2 + ((2 * Double.parseDouble(_charSeq)) + 0.30d)));
							}
							else {
								edittext25d.setText(_English_Decimal_Format(Double.parseDouble(edittext102d.getText().toString()) + ((2 * Double.parseDouble(_charSeq)) + 0.30d)));
							}
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
		
		edittext22d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(edittext2xd.getText().toString()) < 500) {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext6d.getText().toString().equals("") || edittext6d.getText().toString().equals(".")) || (edittext6d.getText().toString().equals("-") || (Double.parseDouble(edittext6d.getText().toString()) < 0))) || ((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0))))) {
						edittext23d.setText(String.valueOf(00.00));
					}
					else {
						edittext23d.setText(_English_Decimal_Format(((Math.PI / 4) * (Math.pow(Double.parseDouble(edittext6d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString())), 2) - Math.pow(Double.parseDouble(edittext6d.getText().toString()), 2))) * Double.parseDouble(_charSeq)));
					}
				}
				else {
					if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext21d.getText().toString().equals("") || edittext21d.getText().toString().equals(".")) || (edittext21d.getText().toString().equals("-") || (Double.parseDouble(edittext21d.getText().toString()) < 0))) || (((edittext101d.getText().toString().equals("") || edittext101d.getText().toString().equals(".")) || (edittext101d.getText().toString().equals("-") || (Double.parseDouble(edittext101d.getText().toString()) < 0))) || ((edittext102d.getText().toString().equals("") || edittext102d.getText().toString().equals(".")) || (edittext102d.getText().toString().equals("-") || (Double.parseDouble(edittext102d.getText().toString()) < 0)))))) {
						edittext23d.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					else {
						edittext23d.setText(_English_Decimal_Format((((Double.parseDouble(edittext101d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString()))) * (Double.parseDouble(edittext102d.getText().toString()) + (2 * Double.parseDouble(edittext21d.getText().toString())))) - (Double.parseDouble(edittext101d.getText().toString()) * Double.parseDouble(edittext102d.getText().toString()))) * Double.parseDouble(_charSeq)));
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
		
		edittext23d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(edittext2xd.getText().toString()) > 800) {
					edittext29d.setText(_English_Decimal_Format((Double.parseDouble(edittext12d.getText().toString()) + Double.parseDouble(edittext17d.getText().toString())) + (Double.parseDouble(edittext20d.getText().toString()) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext27d.getText().toString())))));
				}
				else {
					edittext30d.setText(_English_Decimal_Format(((Double.parseDouble(edittext28d.getText().toString()) + Double.parseDouble(edittext10d.getText().toString())) + (Double.parseDouble(edittext14d.getText().toString()) + Double.parseDouble(edittext17d.getText().toString()))) + (Double.parseDouble(edittext20d.getText().toString()) + (Double.parseDouble(_charSeq) + Double.parseDouble(edittext27d.getText().toString())))));
				}
				if ((edittext162d.getText().toString().equals("") || edittext162d.getText().toString().equals(".")) || (edittext162d.getText().toString().equals("-") || (Double.parseDouble(edittext162d.getText().toString()) < 0))) {
					edittext163d.setText(String.valueOf(0));
				}
				else {
					edittext163d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext162d.getText().toString())));
				}
				if ((edittext260d.getText().toString().equals("") || edittext260d.getText().toString().equals(".")) || (edittext260d.getText().toString().equals("-") || (Double.parseDouble(edittext260d.getText().toString()) < 0))) {
					edittext261d.setText(String.valueOf(0));
				}
				else {
					edittext261d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext260d.getText().toString())));
				}
				if ((edittext264d.getText().toString().equals("") || edittext264d.getText().toString().equals(".")) || (edittext264d.getText().toString().equals("-") || (Double.parseDouble(edittext264d.getText().toString()) < 0))) {
					edittext265d.setText(String.valueOf(0));
				}
				else {
					edittext265d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext264d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		close161d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear161d.setVisibility(View.GONE);
				button161d.setVisibility(View.VISIBLE);
			}
		});
		
		edittext162d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext162d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext163d.setText(String.valueOf(0));
				}
				else {
					edittext163d.setText(_English_Decimal_Format(Double.parseDouble(edittext23d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext163d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext164d.getText().toString().equals("") || edittext164d.getText().toString().equals(".")) || (edittext164d.getText().toString().equals("-") || ((Double.parseDouble(edittext164d.getText().toString()) < 0) || (Double.parseDouble(edittext164d.getText().toString()) == 0)))) {
					edittext165d.setText(String.valueOf(0));
				}
				else {
					edittext165d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) / Double.parseDouble(edittext164d.getText().toString())));
				}
				if ((edittext268d.getText().toString().equals("") || edittext268d.getText().toString().equals(".")) || (edittext268d.getText().toString().equals("-") || (Double.parseDouble(edittext268d.getText().toString()) < 0))) {
					edittext269d.setText(String.valueOf(0));
				}
				else {
					edittext269d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext268d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext164d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext164d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || ((Double.parseDouble(_charSeq) < 0) || (Double.parseDouble(_charSeq) == 0)))) {
					edittext165d.setText(String.valueOf(0));
				}
				else {
					edittext165d.setText(_English_Decimal_Format(Double.parseDouble(edittext163d.getText().toString()) / Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext268d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext268d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext269d.setText(String.valueOf(0));
				}
				else {
					edittext269d.setText(_English_Decimal_Format(Double.parseDouble(edittext163d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext264d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext264d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext265d.setText(String.valueOf(0));
				}
				else {
					edittext265d.setText(_English_Decimal_Format(Double.parseDouble(edittext23d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext260d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext260d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext261d.setText(String.valueOf(0));
				}
				else {
					edittext261d.setText(_English_Decimal_Format(Double.parseDouble(edittext23d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button171d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear171d.setVisibility(View.VISIBLE);
				button171d.setVisibility(View.GONE);
			}
		});
		
		edittext26d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext26d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext25d.getText().toString().equals("") || edittext25d.getText().toString().equals(".")) || (edittext25d.getText().toString().equals("-") || (Double.parseDouble(edittext25d.getText().toString()) < 0))) || ((edittext24d.getText().toString().equals("") || edittext24d.getText().toString().equals(".")) || (edittext24d.getText().toString().equals("-") || (Double.parseDouble(edittext24d.getText().toString()) < 0))))) {
					edittext27d.setText(String.valueOf(00.00));
				}
				else {
					edittext27d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * (Double.parseDouble(edittext25d.getText().toString()) * Double.parseDouble(edittext24d.getText().toString()))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext25d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext25d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext24d.getText().toString().equals("") || edittext24d.getText().toString().equals(".")) || (edittext24d.getText().toString().equals("-") || (Double.parseDouble(edittext24d.getText().toString()) < 0))) || ((edittext26d.getText().toString().equals("") || edittext26d.getText().toString().equals(".")) || (edittext26d.getText().toString().equals("-") || (Double.parseDouble(edittext26d.getText().toString()) < 0))))) {
					edittext27d.setText(String.valueOf(00.00));
				}
				else {
					edittext27d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * (Double.parseDouble(edittext24d.getText().toString()) * Double.parseDouble(edittext26d.getText().toString()))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext24d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext24d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext25d.getText().toString().equals("") || edittext25d.getText().toString().equals(".")) || (edittext25d.getText().toString().equals("-") || (Double.parseDouble(edittext25d.getText().toString()) < 0))) || ((edittext26d.getText().toString().equals("") || edittext26d.getText().toString().equals(".")) || (edittext26d.getText().toString().equals("-") || (Double.parseDouble(edittext26d.getText().toString()) < 0))))) {
					edittext27d.setText(String.valueOf(00.00));
				}
				else {
					edittext27d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * (Double.parseDouble(edittext25d.getText().toString()) * Double.parseDouble(edittext26d.getText().toString()))));
				}
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
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(edittext2xd.getText().toString()) > 800) {
					edittext29d.setText(_English_Decimal_Format((Double.parseDouble(edittext12d.getText().toString()) + Double.parseDouble(edittext17d.getText().toString())) + (Double.parseDouble(edittext20d.getText().toString()) + (Double.parseDouble(edittext23d.getText().toString()) + Double.parseDouble(_charSeq)))));
				}
				else {
					edittext30d.setText(_English_Decimal_Format(((Double.parseDouble(edittext28d.getText().toString()) + Double.parseDouble(edittext10d.getText().toString())) + (Double.parseDouble(edittext14d.getText().toString()) + Double.parseDouble(edittext17d.getText().toString()))) + (Double.parseDouble(edittext20d.getText().toString()) + (Double.parseDouble(edittext23d.getText().toString()) + Double.parseDouble(_charSeq)))));
				}
				if ((edittext172d.getText().toString().equals("") || edittext172d.getText().toString().equals(".")) || (edittext172d.getText().toString().equals("-") || (Double.parseDouble(edittext172d.getText().toString()) < 0))) {
					edittext173d.setText(String.valueOf(0));
				}
				else {
					edittext173d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext172d.getText().toString())));
				}
				if ((edittext270d.getText().toString().equals("") || edittext270d.getText().toString().equals(".")) || (edittext270d.getText().toString().equals("-") || (Double.parseDouble(edittext270d.getText().toString()) < 0))) {
					edittext271d.setText(String.valueOf(0));
				}
				else {
					edittext271d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext270d.getText().toString())));
				}
				if ((edittext274d.getText().toString().equals("") || edittext274d.getText().toString().equals(".")) || (edittext274d.getText().toString().equals("-") || (Double.parseDouble(edittext274d.getText().toString()) < 0))) {
					edittext275d.setText(String.valueOf(0));
				}
				else {
					edittext275d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext274d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		close171d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear171d.setVisibility(View.GONE);
				button171d.setVisibility(View.VISIBLE);
			}
		});
		
		edittext172d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext172d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext173d.setText(String.valueOf(0));
				}
				else {
					edittext173d.setText(_English_Decimal_Format(Double.parseDouble(edittext27d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext173d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext174d.getText().toString().equals("") || edittext174d.getText().toString().equals(".")) || (edittext174d.getText().toString().equals("-") || ((Double.parseDouble(edittext174d.getText().toString()) < 0) || (Double.parseDouble(edittext124d.getText().toString()) == 0)))) {
					edittext175d.setText(String.valueOf(0));
				}
				else {
					edittext175d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) / Double.parseDouble(edittext174d.getText().toString())));
				}
				if ((edittext278d.getText().toString().equals("") || edittext278d.getText().toString().equals(".")) || (edittext278d.getText().toString().equals("-") || (Double.parseDouble(edittext278d.getText().toString()) < 0))) {
					edittext279d.setText(String.valueOf(0));
				}
				else {
					edittext279d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext278d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext174d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext174d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || ((Double.parseDouble(_charSeq) < 0) || (Double.parseDouble(_charSeq) == 0)))) {
					edittext175d.setText(String.valueOf(0));
				}
				else {
					edittext175d.setText(_English_Decimal_Format(Double.parseDouble(edittext173d.getText().toString()) / Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext278d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext278d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext279d.setText(String.valueOf(0));
				}
				else {
					edittext279d.setText(_English_Decimal_Format(Double.parseDouble(edittext173d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext274d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext274d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext275d.setText(String.valueOf(0));
				}
				else {
					edittext275d.setText(_English_Decimal_Format(Double.parseDouble(edittext27d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext270d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext270d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext271d.setText(String.valueOf(0));
				}
				else {
					edittext271d.setText(_English_Decimal_Format(Double.parseDouble(edittext27d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button181d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear181d.setVisibility(View.VISIBLE);
				button181d.setVisibility(View.GONE);
			}
		});
		
		edittext28d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(edittext2xd.getText().toString()) > 800) {
					edittext30d.setText(_English_Decimal_Format(Double.parseDouble(edittext10d.getText().toString()) + Double.parseDouble(_charSeq)));
				}
				else {
					edittext30d.setText(_English_Decimal_Format(((Double.parseDouble(_charSeq) + Double.parseDouble(edittext10d.getText().toString())) + (Double.parseDouble(edittext14d.getText().toString()) + Double.parseDouble(edittext17d.getText().toString()))) + (Double.parseDouble(edittext20d.getText().toString()) + (Double.parseDouble(edittext23d.getText().toString()) + Double.parseDouble(edittext27d.getText().toString())))));
				}
				if ((edittext182d.getText().toString().equals("") || edittext182d.getText().toString().equals(".")) || (edittext182d.getText().toString().equals("-") || (Double.parseDouble(edittext182d.getText().toString()) < 0))) {
					edittext183d.setText(String.valueOf(0));
				}
				else {
					edittext183d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext182d.getText().toString())));
				}
				if ((edittext280d.getText().toString().equals("") || edittext280d.getText().toString().equals(".")) || (edittext280d.getText().toString().equals("-") || (Double.parseDouble(edittext280d.getText().toString()) < 0))) {
					edittext281d.setText(String.valueOf(0));
				}
				else {
					edittext281d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext280d.getText().toString())));
				}
				if ((edittext284d.getText().toString().equals("") || edittext284d.getText().toString().equals(".")) || (edittext284d.getText().toString().equals("-") || (Double.parseDouble(edittext284d.getText().toString()) < 0))) {
					edittext285d.setText(String.valueOf(0));
				}
				else {
					edittext285d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext284d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		close181d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear181d.setVisibility(View.GONE);
				button181d.setVisibility(View.VISIBLE);
			}
		});
		
		edittext182d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext182d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext183d.setText(String.valueOf(0));
				}
				else {
					edittext183d.setText(_English_Decimal_Format(Double.parseDouble(edittext28d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext183d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((edittext184d.getText().toString().equals("") || edittext184d.getText().toString().equals(".")) || (edittext184d.getText().toString().equals("-") || ((Double.parseDouble(edittext184d.getText().toString()) < 0) || (Double.parseDouble(edittext124d.getText().toString()) == 0)))) {
					edittext185d.setText(String.valueOf(0));
				}
				else {
					edittext185d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) / Double.parseDouble(edittext184d.getText().toString())));
				}
				if ((edittext288d.getText().toString().equals("") || edittext288d.getText().toString().equals(".")) || (edittext288d.getText().toString().equals("-") || (Double.parseDouble(edittext288d.getText().toString()) < 0))) {
					edittext289d.setText(String.valueOf(0));
				}
				else {
					edittext289d.setText(_English_Decimal_Format(Double.parseDouble(_charSeq) * Double.parseDouble(edittext288d.getText().toString())));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext184d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext184d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || ((Double.parseDouble(_charSeq) < 0) || (Double.parseDouble(_charSeq) == 0)))) {
					edittext185d.setText(String.valueOf(0));
				}
				else {
					edittext185d.setText(_English_Decimal_Format(Double.parseDouble(edittext183d.getText().toString()) / Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext288d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext288d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext289d.setText(String.valueOf(0));
				}
				else {
					edittext289d.setText(_English_Decimal_Format(Double.parseDouble(edittext183d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext284d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext284d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext285d.setText(String.valueOf(0));
				}
				else {
					edittext285d.setText(_English_Decimal_Format(Double.parseDouble(edittext28d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext280d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext280d.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext281d.setText(String.valueOf(0));
				}
				else {
					edittext281d.setText(_English_Decimal_Format(Double.parseDouble(edittext28d.getText().toString()) * Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext29d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (getActivity() instanceof ToipqcManholeConcreteActivity) {
									((ToipqcManholeConcreteActivity) getActivity())._recalculateSum();
							}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext30d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (getActivity() instanceof ToipqcManholeConcreteActivity) {
									((ToipqcManholeConcreteActivity) getActivity())._recalculateSum();
							}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
	}
	
	private void initializeLogic() {
		edittext2xd.setVisibility(View.GONE);
		edittext_am5d.setVisibility(View.GONE);
		textview123d.setVisibility(View.GONE);
		linear222d.setVisibility(View.GONE);
		linear220d.setVisibility(View.GONE);
		linear221d.setVisibility(View.GONE);
		linear223d.setVisibility(View.GONE);
		linear229d.setVisibility(View.GONE);
		linear233d.setVisibility(View.GONE);
		linear226d.setVisibility(View.GONE);
		linear219d.setVisibility(View.GONE);
		linear460d.setVisibility(View.GONE);
		linear144d.setVisibility(View.GONE);
		linear457d.setVisibility(View.GONE);
		/*
الخامات
*/
		linear111d.setVisibility(View.GONE);
		linear121d.setVisibility(View.GONE);
		linear131d.setVisibility(View.GONE);
		linear141d.setVisibility(View.GONE);
		linear151d.setVisibility(View.GONE);
		linear161d.setVisibility(View.GONE);
		linear171d.setVisibility(View.GONE);
		linear181d.setVisibility(View.GONE);
	}
	
	public String _English_Decimal_Format(final double _number) {
		return (String.format(Locale.ENGLISH,"%.02f", _number));
	}
	
}
