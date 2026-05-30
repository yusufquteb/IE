package com.my.iengineer1;

import android.animation.*;
import android.app.*;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
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
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.*;
import org.json.*;
import androidx.print.PrintHelper;


public class DipsdDesignOfIsolatedFootingsActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private LinearLayout linear_close;
	private ScrollView vscroll3;
	private HorizontalScrollView hscroll211;
	private ImageView print1d;
	private LinearLayout linear720;
	private LinearLayout linear2466;
	private TextView textview53;
	private LinearLayout linear713;
	private LinearLayout linear197d;
	private TextView textview99;
	private LinearLayout dynamic_linear0d;
	private Button button195d;
	private LinearLayout linear2440;
	private Button button197d;
	private LinearLayout linear2467;
	private TextView textview1167;
	private TextView textview583;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private ImageView close1d;
	private LinearLayout linear2468;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private TextView textview585;
	private TextView textview584;
	private Button button196;
	private TextView textview809;
	private HorizontalScrollView hscroll1d;
	private LinearLayout linear1d;
	private HorizontalScrollView hscroll2d;
	private LinearLayout linear2240;
	private HorizontalScrollView hscroll14d;
	private LinearLayout linear70d;
	private HorizontalScrollView hscroll246;
	private Button button1d;
	private LinearLayout linear111d;
	private LinearLayout linear112d;
	private LinearLayout linear221d;
	private LinearLayout linear222d;
	private HorizontalScrollView hscroll219;
	private LinearLayout linear223d;
	private LinearLayout linear224d;
	private TextView Safe;
	private LinearLayout linear75d;
	private LinearLayout linear225d;
	private LinearLayout linear226d;
	private Button button44d;
	private TextView textview555;
	private LinearLayout linear444d;
	private EditText edittext1d;
	private TextView textview1d;
	private TextView textview2483;
	private LinearLayout linear2d;
	private TextView textview2487;
	private LinearLayout linear202d;
	private LinearLayout linear199d;
	private TextView textview201d;
	private LinearLayout linear6d;
	private LinearLayout linear7d;
	private HorizontalScrollView hscroll3d;
	private LinearLayout linear198d;
	private EditText edittext2d;
	private TextView textview280;
	private TextView textview2d;
	private LinearLayout linear4d;
	private TextView textview642;
	private LinearLayout linear3d;
	private TextView textview4d;
	private EditText edittext4d;
	private EditText edittext_am4d;
	private TextView textview3d;
	private EditText edittext3d;
	private EditText edittext_am3d;
	private TextView textview2735;
	private LinearLayout linear2314;
	private LinearLayout linear2315;
	private LinearLayout linear5d;
	private Button button3;
	private TextView textview2738;
	private Button button2;
	private TextView textview2737;
	private Button button1;
	private TextView textview5d;
	private TextView textview2742;
	private EditText edittext5d;
	private TextView textview2740;
	private TextView textview2741;
	private EditText edittext_am6d;
	private TextView textview1155;
	private EditText edittext6d;
	private TextView textview1156;
	private TextView textview6d;
	private TextView textview2484;
	private EditText edittext7d;
	private TextView textview2485;
	private TextView textview7d;
	private TextView textview202d;
	private LinearLayout linear8d;
	private HorizontalScrollView hscroll204;
	private LinearLayout linear9d;
	private HorizontalScrollView hscroll235;
	private LinearLayout linear11d;
	private HorizontalScrollView hscroll11d;
	private LinearLayout linear12d;
	private EditText edittext_am8d;
	private TextView textview531;
	private EditText edittext8d;
	private TextView textview532;
	private TextView textview8d;
	private TextView textview2488;
	private EditText edittext9d;
	private TextView textview2489;
	private TextView textview9d;
	private EditText edittext_am11d;
	private TextView textview2491;
	private EditText edittext11d;
	private TextView textview2492;
	private TextView textview11d;
	private TextView textview2494;
	private EditText edittext12d;
	private TextView textview2495;
	private TextView textview12d;
	private TextView textview70d;
	private LinearLayout linear15d;
	private HorizontalScrollView hscroll205;
	private LinearLayout linear16d;
	private HorizontalScrollView hscroll213;
	private LinearLayout linear17d;
	private HorizontalScrollView hscroll214;
	private LinearLayout linear18d;
	private HorizontalScrollView hscroll215;
	private LinearLayout linear19d;
	private TextView textview888d;
	private TextView textview204d;
	private TextView textview3051;
	private LinearLayout linear20d;
	private EditText edittext_am15d;
	private TextView textview123;
	private EditText edittext15d;
	private TextView textview403;
	private TextView textview15d;
	private EditText edittext_am16d;
	private TextView textview612;
	private EditText edittext16d;
	private TextView textview592;
	private TextView textview16d;
	private EditText edittext_am17d;
	private TextView textview2456;
	private EditText edittext17d;
	private TextView textview644;
	private TextView textview17d;
	private EditText edittext_am18d;
	private TextView textview2466;
	private EditText edittext18d;
	private TextView textview2454;
	private TextView textview18d;
	private EditText edittext_am19d;
	private TextView textview2455;
	private EditText edittext19d;
	private TextView textview2038;
	private TextView textview19d;
	private EditText edittext_am20d;
	private TextView textview1656;
	private EditText edittext20d;
	private TextView textview2457;
	private TextView textview20d;
	private TextView textview3052;
	private LinearLayout linear10d;
	private HorizontalScrollView hscroll240;
	private LinearLayout linear13d;
	private TextView textview2664;
	private EditText edittext10d;
	private TextView textview2665;
	private TextView textview10d;
	private TextView textview2670;
	private EditText edittext13d;
	private TextView textview2671;
	private TextView textview13d;
	private LinearLayout linear2220d;
	private TextView textview2375;
	private LinearLayout linear23d;
	private HorizontalScrollView hscroll217;
	private LinearLayout linear24d;
	private TextView textview170d;
	private LinearLayout linear31d;
	private HorizontalScrollView hscroll218;
	private LinearLayout linear32d;
	private LinearLayout linear1130d;
	private LinearLayout linear21d;
	private LinearLayout linear22d;
	private TextView textview400;
	private EditText edittext21d;
	private TextView textview334;
	private TextView textview21d;
	private TextView textview1169;
	private EditText edittext22d;
	private TextView textview1170;
	private TextView textview22d;
	private TextView textview399;
	private EditText edittext26d;
	private EditText edittext23d;
	private TextView textview342;
	private TextView textview23d;
	private TextView textview1139;
	private EditText edittext29d;
	private TextView textview346;
	private TextView textview24d;
	private TextView textview629;
	private EditText edittext31d;
	private TextView textview630;
	private TextView textview31d;
	private TextView textview1141;
	private EditText edittext32d;
	private TextView textview357;
	private TextView textview32d;
	private LinearLayout linear2445;
	private TextView textview3062;
	private LinearLayout linear2446;
	private TextView textview15dh;
	private TextView textview27d;
	private EditText edittext34d;
	private TextView textview158d;
	private TextView textview28d;
	private EditText edittext35d;
	private TextView textview3066;
	private LinearLayout linear2464;
	private HorizontalScrollView hscroll249;
	private LinearLayout linear2465;
	private TextView textview3092;
	private EditText edittext36d;
	private TextView textview3093;
	private TextView textview3094;
	private TextView textview3095;
	private EditText edittext37d;
	private TextView textview3096;
	private TextView textview3097;
	private TextView textview3059;
	private LinearLayout linear2441;
	private HorizontalScrollView hscroll247;
	private LinearLayout linear2442;
	private TextView textview3053;
	private EditText edittext38d;
	private TextView textview3054;
	private TextView textview3055;
	private TextView textview3056;
	private EditText edittext39d;
	private TextView textview3057;
	private TextView textview3058;
	private LinearLayout linear33d;
	private HorizontalScrollView hscroll238;
	private LinearLayout linear34d;
	private LinearLayout linear204d;
	private LinearLayout linear2299;
	private LinearLayout linear2295;
	private LinearLayout linear46d;
	private LinearLayout linear47d;
	private TextView textview2481;
	private EditText edittext40d;
	private TextView textview2482;
	private TextView textview33d;
	private TextView textview1142;
	private EditText edittext41d;
	private TextView textview365;
	private TextView textview34d;
	private LinearLayout linear165d;
	private TextView textview1431;
	private LinearLayout linear164d;
	private TextView textview2476;
	private TextView textview39d;
	private EditText edittext42d;
	private TextView textview29d;
	private TextView textview2478;
	private EditText edittext43d;
	private TextView textview2479;
	private TextView textview40d;
	private EditText edittext44d;
	private TextView textview30d;
	private TextView textview2475;
	private EditText edittext45d;
	private TextView textview2638;
	private EditText edittext46d;
	private LinearLayout linear2296;
	private TextView textview2633;
	private LinearLayout linear2297;
	private TextView textview2634;
	private TextView textview2635;
	private EditText edittext47d;
	private TextView textview2636;
	private TextView textview2975;
	private EditText edittext48d;
	private TextView textview2976;
	private TextView textview2637;
	private EditText edittext49d;
	private TextView textview2640;
	private TextView textview2641;
	private EditText edittext50d;
	private TextView textview2642;
	private TextView textview2981;
	private EditText edittext51d;
	private TextView textview2980;
	private TextView textview2643;
	private EditText edittext52d;
	private TextView textview2662;
	private EditText edittext53d;
	private TextView textview2663;
	private TextView textview46d;
	private TextView textview2689;
	private EditText edittext54d;
	private TextView textview2690;
	private TextView textview47d;
	private TextView textview2672;
	private LinearLayout linear2304;
	private LinearLayout linear53d;
	private LinearLayout linear2414;
	private TextView textview2706;
	private LinearLayout linear61d;
	private LinearLayout linear62d;
	private LinearLayout linear63d;
	private LinearLayout linear64d;
	private LinearLayout linear118;
	private LinearLayout linear2310;
	private LinearLayout linear2311;
	private LinearLayout linear74d;
	private LinearLayout linear2305;
	private TextView textview2691;
	private LinearLayout linear2306;
	private TextView textview2692;
	private TextView textview2693;
	private EditText edittext56d;
	private TextView textview2698;
	private TextView textview2699;
	private EditText edittext57d;
	private TextView textview2704;
	private EditText edittext58d;
	private TextView textview2705;
	private TextView textview53d;
	private TextView textview2987;
	private EditText edittext59d;
	private TextView textview2988;
	private TextView textview2989;
	private TextView textview2707;
	private EditText edittext61d;
	private TextView textview2708;
	private TextView textview61d;
	private TextView textview2709;
	private EditText edittext62d;
	private TextView textview2710;
	private TextView textview62d;
	private TextView textview2712;
	private EditText edittext63d;
	private TextView textview2713;
	private TextView textview63d;
	private TextView textview2715;
	private EditText edittext64d;
	private TextView textview2716;
	private TextView textview64d;
	private TextView textview2718;
	private EditText edittext65d;
	private TextView textview2719;
	private TextView textview14;
	private TextView textview2720;
	private EditText edittext66d;
	private TextView textview2721;
	private TextView textview2722;
	private TextView textview2723;
	private LinearLayout linear2409;
	private LinearLayout linear2410;
	private LinearLayout linear202;
	private EditText edittext71d;
	private TextView textview2953;
	private TextView textview2731;
	private EditText edittext72d;
	private TextView textview2957;
	private TextView textview2730;
	private EditText edittext73d;
	private TextView textview2729;
	private TextView textview657;
	private TextView textview2732;
	private EditText edittext74d;
	private TextView textview2733;
	private TextView textview74d;
	private TextView textview2752;
	private EditText edittext76d;
	private EditText edittext75d;
	private TextView textview2753;
	private TextView textview75d;
	private LinearLayout linear76d;
	private LinearLayout linear2326;
	private LinearLayout linear2364;
	private TextView textview2749;
	private EditText edittext77d;
	private TextView textview2750;
	private TextView textview76d;
	private LinearLayout linear2327;
	private TextView textview2754;
	private LinearLayout linear2328;
	private TextView textview2755;
	private TextView textview2756;
	private EditText edittext81d;
	private TextView textview2757;
	private TextView textview2758;
	private EditText edittext82d;
	private TextView textview2813;
	private TextView textview2760;
	private EditText edittext83d;
	private TextView textview2811;
	private TextView textview2810;
	private EditText edittext84d;
	private TextView textview2761;
	private TextView textview2762;
	private EditText edittext86d;
	private TextView textview2763;
	private TextView textview2764;
	private EditText edittext87d;
	private TextView textview2819;
	private TextView textview2766;
	private EditText edittext88d;
	private TextView textview2817;
	private TextView textview2816;
	private EditText edittext89d;
	private LinearLayout linear2349;
	private LinearLayout linear2365;
	private TextView textview2837;
	private EditText edittext92d;
	private TextView textview2838;
	private TextView textview2839;
	private LinearLayout linear2366;
	private TextView textview2855;
	private LinearLayout linear2367;
	private TextView textview2795;
	private EditText edittext97d;
	private TextView textview2885;
	private TextView textview2884;
	private EditText edittext98d;
	private TextView textview2887;
	private TextView textview2886;
	private EditText edittext99d;
	private TextView textview2801;
	private EditText edittext101d;
	private TextView textview2891;
	private TextView textview2890;
	private EditText edittext102d;
	private TextView textview2893;
	private TextView textview2892;
	private EditText edittext103d;
	private LinearLayout linear2380;
	private LinearLayout linear2394;
	private LinearLayout linear2391;
	private LinearLayout linear227d;
	private TextView textview2877;
	private EditText edittext106d;
	private TextView textview2894;
	private EditText edittext105d;
	private TextView textview2878;
	private TextView textview2879;
	private TextView textview2921;
	private EditText edittext108d;
	private TextView textview2922;
	private EditText edittext107d;
	private TextView textview2923;
	private TextView textview2924;
	private LinearLayout linear2396;
	private LinearLayout linear2397;
	private TextView textview2925;
	private EditText edittext111d;
	private TextView textview2926;
	private EditText edittext110d;
	private TextView textview2927;
	private TextView textview2928;
	private TextView textview2929;
	private EditText edittext113d;
	private TextView textview2930;
	private EditText edittext112d;
	private TextView textview2931;
	private TextView textview2932;
	private LinearLayout linear2400;
	private LinearLayout linear445d;
	private LinearLayout linear446d;
	private ImageView close;
	private LinearLayout linear2401;
	private TextView textview2774;
	private LinearLayout linear2470;
	private LinearLayout linear2471;
	private LinearLayout linear333d;
	private LinearLayout linear2403;
	private LinearLayout linear133d;
	private LinearLayout linear2439;
	private LinearLayout linear2363;
	private HorizontalScrollView hscroll242;
	private LinearLayout linear2417;
	private Button button51d;
	private Button button50d;
	private Button button49d;
	private Button button48d;
	private Button button47d;
	private Button button56d;
	private Button button55d;
	private Button button54d;
	private Button button53d;
	private Button button52d;
	private LinearLayout linear333;
	private TextView textview2777;
	private EditText edittext124d;
	private TextView textview2800;
	private TextView textview2818;
	private EditText edittext126d;
	private TextView textview2820;
	private LinearLayout linear2357;
	private TextView textview2814;
	private LinearLayout linear2342;
	private TextView textview2809;
	private EditText edittext117d;
	private EditText edittext118d;
	private TextView textview2808;
	private TextView textview2935;
	private EditText edittext132d;
	private TextView textview2936;
	private EditText edittext131d;
	private TextView textview2798;
	private TextView textview2799;
	private TextView textview3046;
	private EditText edittext133d;
	private TextView textview519;
	private TextView textview2851;
	private EditText edittext135d;
	private TextView textview2852;
	private EditText edittext134d;
	private TextView textview2853;
	private TextView textview2854;
	private LinearLayout linear2426;
	private HorizontalScrollView hscroll241;
	private LinearLayout linear2415;
	private LinearLayout linear218;
	private TextView textview3027;
	private LinearLayout linear205;
	private TextView textview3028;
	private LinearLayout linear203;
	private TextView textview3029;
	private EditText edittext138d;
	private TextView textview643;
	private EditText edittext137d;
	private TextView textview641;
	private EditText edittext136d;
	private TextView textview2990;
	private EditText edittext139d;
	private TextView textview2991;
	private TextView textview2992;
	private TextView textview2840;
	private LinearLayout linear2354;
	private LinearLayout linear2350;
	private LinearLayout linear334d;
	private LinearLayout linear2406;
	private LinearLayout linear143d;
	private HorizontalScrollView hscroll245;
	private LinearLayout linear2361;
	private HorizontalScrollView hscroll207;
	private LinearLayout linear2433;
	private Button button67d;
	private Button button66d;
	private Button button65d;
	private Button button64d;
	private Button button63d;
	private Button button72d;
	private Button button71d;
	private Button button70d;
	private Button button69d;
	private Button button68d;
	private LinearLayout linear334;
	private TextView textview2771;
	private EditText edittext120d;
	private TextView textview2792;
	private TextView textview2812;
	private EditText edittext122d;
	private TextView textview2841;
	private LinearLayout linear2359;
	private TextView textview2842;
	private LinearLayout linear2360;
	private TextView textview2844;
	private EditText edittext115d;
	private EditText edittext116d;
	private TextView textview2843;
	private TextView textview2943;
	private EditText edittext142d;
	private TextView textview2944;
	private EditText edittext141d;
	private TextView textview2945;
	private TextView textview2793;
	private TextView textview3049;
	private EditText edittext143d;
	private TextView textview3050;
	private TextView textview2848;
	private EditText edittext145d;
	private TextView textview2845;
	private EditText edittext144d;
	private TextView textview2846;
	private TextView textview2847;
	private LinearLayout linear2434;
	private HorizontalScrollView hscroll244;
	private LinearLayout linear2435;
	private LinearLayout linear2436;
	private TextView textview3041;
	private LinearLayout linear2437;
	private TextView textview3042;
	private LinearLayout linear2438;
	private TextView textview3043;
	private EditText edittext148d;
	private TextView textview3044;
	private EditText edittext147d;
	private TextView textview3045;
	private EditText edittext146d;
	private TextView textview3038;
	private EditText edittext149d;
	private TextView textview3039;
	private TextView textview3040;
	
	private AlertDialog.Builder dialog;
	private Intent price = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.dipsd_design_of_isolated_footings);
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
		linear_close = findViewById(R.id.linear_close);
		vscroll3 = findViewById(R.id.vscroll3);
		hscroll211 = findViewById(R.id.hscroll211);
		print1d = findViewById(R.id.print1d);
		linear720 = findViewById(R.id.linear720);
		linear2466 = findViewById(R.id.linear2466);
		textview53 = findViewById(R.id.textview53);
		linear713 = findViewById(R.id.linear713);
		linear197d = findViewById(R.id.linear197d);
		textview99 = findViewById(R.id.textview99);
		dynamic_linear0d = findViewById(R.id.dynamic_linear0d);
		button195d = findViewById(R.id.button195d);
		linear2440 = findViewById(R.id.linear2440);
		button197d = findViewById(R.id.button197d);
		linear2467 = findViewById(R.id.linear2467);
		textview1167 = findViewById(R.id.textview1167);
		textview583 = findViewById(R.id.textview583);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		close1d = findViewById(R.id.close1d);
		linear2468 = findViewById(R.id.linear2468);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		button196 = findViewById(R.id.button196);
		textview809 = findViewById(R.id.textview809);
		hscroll1d = findViewById(R.id.hscroll1d);
		linear1d = findViewById(R.id.linear1d);
		hscroll2d = findViewById(R.id.hscroll2d);
		linear2240 = findViewById(R.id.linear2240);
		hscroll14d = findViewById(R.id.hscroll14d);
		linear70d = findViewById(R.id.linear70d);
		hscroll246 = findViewById(R.id.hscroll246);
		button1d = findViewById(R.id.button1d);
		linear111d = findViewById(R.id.linear111d);
		linear112d = findViewById(R.id.linear112d);
		linear221d = findViewById(R.id.linear221d);
		linear222d = findViewById(R.id.linear222d);
		hscroll219 = findViewById(R.id.hscroll219);
		linear223d = findViewById(R.id.linear223d);
		linear224d = findViewById(R.id.linear224d);
		Safe = findViewById(R.id.Safe);
		linear75d = findViewById(R.id.linear75d);
		linear225d = findViewById(R.id.linear225d);
		linear226d = findViewById(R.id.linear226d);
		button44d = findViewById(R.id.button44d);
		textview555 = findViewById(R.id.textview555);
		linear444d = findViewById(R.id.linear444d);
		edittext1d = findViewById(R.id.edittext1d);
		textview1d = findViewById(R.id.textview1d);
		textview2483 = findViewById(R.id.textview2483);
		linear2d = findViewById(R.id.linear2d);
		textview2487 = findViewById(R.id.textview2487);
		linear202d = findViewById(R.id.linear202d);
		linear199d = findViewById(R.id.linear199d);
		textview201d = findViewById(R.id.textview201d);
		linear6d = findViewById(R.id.linear6d);
		linear7d = findViewById(R.id.linear7d);
		hscroll3d = findViewById(R.id.hscroll3d);
		linear198d = findViewById(R.id.linear198d);
		edittext2d = findViewById(R.id.edittext2d);
		textview280 = findViewById(R.id.textview280);
		textview2d = findViewById(R.id.textview2d);
		linear4d = findViewById(R.id.linear4d);
		textview642 = findViewById(R.id.textview642);
		linear3d = findViewById(R.id.linear3d);
		textview4d = findViewById(R.id.textview4d);
		edittext4d = findViewById(R.id.edittext4d);
		edittext_am4d = findViewById(R.id.edittext_am4d);
		textview3d = findViewById(R.id.textview3d);
		edittext3d = findViewById(R.id.edittext3d);
		edittext_am3d = findViewById(R.id.edittext_am3d);
		textview2735 = findViewById(R.id.textview2735);
		linear2314 = findViewById(R.id.linear2314);
		linear2315 = findViewById(R.id.linear2315);
		linear5d = findViewById(R.id.linear5d);
		button3 = findViewById(R.id.button3);
		textview2738 = findViewById(R.id.textview2738);
		button2 = findViewById(R.id.button2);
		textview2737 = findViewById(R.id.textview2737);
		button1 = findViewById(R.id.button1);
		textview5d = findViewById(R.id.textview5d);
		textview2742 = findViewById(R.id.textview2742);
		edittext5d = findViewById(R.id.edittext5d);
		textview2740 = findViewById(R.id.textview2740);
		textview2741 = findViewById(R.id.textview2741);
		edittext_am6d = findViewById(R.id.edittext_am6d);
		textview1155 = findViewById(R.id.textview1155);
		edittext6d = findViewById(R.id.edittext6d);
		textview1156 = findViewById(R.id.textview1156);
		textview6d = findViewById(R.id.textview6d);
		textview2484 = findViewById(R.id.textview2484);
		edittext7d = findViewById(R.id.edittext7d);
		textview2485 = findViewById(R.id.textview2485);
		textview7d = findViewById(R.id.textview7d);
		textview202d = findViewById(R.id.textview202d);
		linear8d = findViewById(R.id.linear8d);
		hscroll204 = findViewById(R.id.hscroll204);
		linear9d = findViewById(R.id.linear9d);
		hscroll235 = findViewById(R.id.hscroll235);
		linear11d = findViewById(R.id.linear11d);
		hscroll11d = findViewById(R.id.hscroll11d);
		linear12d = findViewById(R.id.linear12d);
		edittext_am8d = findViewById(R.id.edittext_am8d);
		textview531 = findViewById(R.id.textview531);
		edittext8d = findViewById(R.id.edittext8d);
		textview532 = findViewById(R.id.textview532);
		textview8d = findViewById(R.id.textview8d);
		textview2488 = findViewById(R.id.textview2488);
		edittext9d = findViewById(R.id.edittext9d);
		textview2489 = findViewById(R.id.textview2489);
		textview9d = findViewById(R.id.textview9d);
		edittext_am11d = findViewById(R.id.edittext_am11d);
		textview2491 = findViewById(R.id.textview2491);
		edittext11d = findViewById(R.id.edittext11d);
		textview2492 = findViewById(R.id.textview2492);
		textview11d = findViewById(R.id.textview11d);
		textview2494 = findViewById(R.id.textview2494);
		edittext12d = findViewById(R.id.edittext12d);
		textview2495 = findViewById(R.id.textview2495);
		textview12d = findViewById(R.id.textview12d);
		textview70d = findViewById(R.id.textview70d);
		linear15d = findViewById(R.id.linear15d);
		hscroll205 = findViewById(R.id.hscroll205);
		linear16d = findViewById(R.id.linear16d);
		hscroll213 = findViewById(R.id.hscroll213);
		linear17d = findViewById(R.id.linear17d);
		hscroll214 = findViewById(R.id.hscroll214);
		linear18d = findViewById(R.id.linear18d);
		hscroll215 = findViewById(R.id.hscroll215);
		linear19d = findViewById(R.id.linear19d);
		textview888d = findViewById(R.id.textview888d);
		textview204d = findViewById(R.id.textview204d);
		textview3051 = findViewById(R.id.textview3051);
		linear20d = findViewById(R.id.linear20d);
		edittext_am15d = findViewById(R.id.edittext_am15d);
		textview123 = findViewById(R.id.textview123);
		edittext15d = findViewById(R.id.edittext15d);
		textview403 = findViewById(R.id.textview403);
		textview15d = findViewById(R.id.textview15d);
		edittext_am16d = findViewById(R.id.edittext_am16d);
		textview612 = findViewById(R.id.textview612);
		edittext16d = findViewById(R.id.edittext16d);
		textview592 = findViewById(R.id.textview592);
		textview16d = findViewById(R.id.textview16d);
		edittext_am17d = findViewById(R.id.edittext_am17d);
		textview2456 = findViewById(R.id.textview2456);
		edittext17d = findViewById(R.id.edittext17d);
		textview644 = findViewById(R.id.textview644);
		textview17d = findViewById(R.id.textview17d);
		edittext_am18d = findViewById(R.id.edittext_am18d);
		textview2466 = findViewById(R.id.textview2466);
		edittext18d = findViewById(R.id.edittext18d);
		textview2454 = findViewById(R.id.textview2454);
		textview18d = findViewById(R.id.textview18d);
		edittext_am19d = findViewById(R.id.edittext_am19d);
		textview2455 = findViewById(R.id.textview2455);
		edittext19d = findViewById(R.id.edittext19d);
		textview2038 = findViewById(R.id.textview2038);
		textview19d = findViewById(R.id.textview19d);
		edittext_am20d = findViewById(R.id.edittext_am20d);
		textview1656 = findViewById(R.id.textview1656);
		edittext20d = findViewById(R.id.edittext20d);
		textview2457 = findViewById(R.id.textview2457);
		textview20d = findViewById(R.id.textview20d);
		textview3052 = findViewById(R.id.textview3052);
		linear10d = findViewById(R.id.linear10d);
		hscroll240 = findViewById(R.id.hscroll240);
		linear13d = findViewById(R.id.linear13d);
		textview2664 = findViewById(R.id.textview2664);
		edittext10d = findViewById(R.id.edittext10d);
		textview2665 = findViewById(R.id.textview2665);
		textview10d = findViewById(R.id.textview10d);
		textview2670 = findViewById(R.id.textview2670);
		edittext13d = findViewById(R.id.edittext13d);
		textview2671 = findViewById(R.id.textview2671);
		textview13d = findViewById(R.id.textview13d);
		linear2220d = findViewById(R.id.linear2220d);
		textview2375 = findViewById(R.id.textview2375);
		linear23d = findViewById(R.id.linear23d);
		hscroll217 = findViewById(R.id.hscroll217);
		linear24d = findViewById(R.id.linear24d);
		textview170d = findViewById(R.id.textview170d);
		linear31d = findViewById(R.id.linear31d);
		hscroll218 = findViewById(R.id.hscroll218);
		linear32d = findViewById(R.id.linear32d);
		linear1130d = findViewById(R.id.linear1130d);
		linear21d = findViewById(R.id.linear21d);
		linear22d = findViewById(R.id.linear22d);
		textview400 = findViewById(R.id.textview400);
		edittext21d = findViewById(R.id.edittext21d);
		textview334 = findViewById(R.id.textview334);
		textview21d = findViewById(R.id.textview21d);
		textview1169 = findViewById(R.id.textview1169);
		edittext22d = findViewById(R.id.edittext22d);
		textview1170 = findViewById(R.id.textview1170);
		textview22d = findViewById(R.id.textview22d);
		textview399 = findViewById(R.id.textview399);
		edittext26d = findViewById(R.id.edittext26d);
		edittext23d = findViewById(R.id.edittext23d);
		textview342 = findViewById(R.id.textview342);
		textview23d = findViewById(R.id.textview23d);
		textview1139 = findViewById(R.id.textview1139);
		edittext29d = findViewById(R.id.edittext29d);
		textview346 = findViewById(R.id.textview346);
		textview24d = findViewById(R.id.textview24d);
		textview629 = findViewById(R.id.textview629);
		edittext31d = findViewById(R.id.edittext31d);
		textview630 = findViewById(R.id.textview630);
		textview31d = findViewById(R.id.textview31d);
		textview1141 = findViewById(R.id.textview1141);
		edittext32d = findViewById(R.id.edittext32d);
		textview357 = findViewById(R.id.textview357);
		textview32d = findViewById(R.id.textview32d);
		linear2445 = findViewById(R.id.linear2445);
		textview3062 = findViewById(R.id.textview3062);
		linear2446 = findViewById(R.id.linear2446);
		textview15dh = findViewById(R.id.textview15dh);
		textview27d = findViewById(R.id.textview27d);
		edittext34d = findViewById(R.id.edittext34d);
		textview158d = findViewById(R.id.textview158d);
		textview28d = findViewById(R.id.textview28d);
		edittext35d = findViewById(R.id.edittext35d);
		textview3066 = findViewById(R.id.textview3066);
		linear2464 = findViewById(R.id.linear2464);
		hscroll249 = findViewById(R.id.hscroll249);
		linear2465 = findViewById(R.id.linear2465);
		textview3092 = findViewById(R.id.textview3092);
		edittext36d = findViewById(R.id.edittext36d);
		textview3093 = findViewById(R.id.textview3093);
		textview3094 = findViewById(R.id.textview3094);
		textview3095 = findViewById(R.id.textview3095);
		edittext37d = findViewById(R.id.edittext37d);
		textview3096 = findViewById(R.id.textview3096);
		textview3097 = findViewById(R.id.textview3097);
		textview3059 = findViewById(R.id.textview3059);
		linear2441 = findViewById(R.id.linear2441);
		hscroll247 = findViewById(R.id.hscroll247);
		linear2442 = findViewById(R.id.linear2442);
		textview3053 = findViewById(R.id.textview3053);
		edittext38d = findViewById(R.id.edittext38d);
		textview3054 = findViewById(R.id.textview3054);
		textview3055 = findViewById(R.id.textview3055);
		textview3056 = findViewById(R.id.textview3056);
		edittext39d = findViewById(R.id.edittext39d);
		textview3057 = findViewById(R.id.textview3057);
		textview3058 = findViewById(R.id.textview3058);
		linear33d = findViewById(R.id.linear33d);
		hscroll238 = findViewById(R.id.hscroll238);
		linear34d = findViewById(R.id.linear34d);
		linear204d = findViewById(R.id.linear204d);
		linear2299 = findViewById(R.id.linear2299);
		linear2295 = findViewById(R.id.linear2295);
		linear46d = findViewById(R.id.linear46d);
		linear47d = findViewById(R.id.linear47d);
		textview2481 = findViewById(R.id.textview2481);
		edittext40d = findViewById(R.id.edittext40d);
		textview2482 = findViewById(R.id.textview2482);
		textview33d = findViewById(R.id.textview33d);
		textview1142 = findViewById(R.id.textview1142);
		edittext41d = findViewById(R.id.edittext41d);
		textview365 = findViewById(R.id.textview365);
		textview34d = findViewById(R.id.textview34d);
		linear165d = findViewById(R.id.linear165d);
		textview1431 = findViewById(R.id.textview1431);
		linear164d = findViewById(R.id.linear164d);
		textview2476 = findViewById(R.id.textview2476);
		textview39d = findViewById(R.id.textview39d);
		edittext42d = findViewById(R.id.edittext42d);
		textview29d = findViewById(R.id.textview29d);
		textview2478 = findViewById(R.id.textview2478);
		edittext43d = findViewById(R.id.edittext43d);
		textview2479 = findViewById(R.id.textview2479);
		textview40d = findViewById(R.id.textview40d);
		edittext44d = findViewById(R.id.edittext44d);
		textview30d = findViewById(R.id.textview30d);
		textview2475 = findViewById(R.id.textview2475);
		edittext45d = findViewById(R.id.edittext45d);
		textview2638 = findViewById(R.id.textview2638);
		edittext46d = findViewById(R.id.edittext46d);
		linear2296 = findViewById(R.id.linear2296);
		textview2633 = findViewById(R.id.textview2633);
		linear2297 = findViewById(R.id.linear2297);
		textview2634 = findViewById(R.id.textview2634);
		textview2635 = findViewById(R.id.textview2635);
		edittext47d = findViewById(R.id.edittext47d);
		textview2636 = findViewById(R.id.textview2636);
		textview2975 = findViewById(R.id.textview2975);
		edittext48d = findViewById(R.id.edittext48d);
		textview2976 = findViewById(R.id.textview2976);
		textview2637 = findViewById(R.id.textview2637);
		edittext49d = findViewById(R.id.edittext49d);
		textview2640 = findViewById(R.id.textview2640);
		textview2641 = findViewById(R.id.textview2641);
		edittext50d = findViewById(R.id.edittext50d);
		textview2642 = findViewById(R.id.textview2642);
		textview2981 = findViewById(R.id.textview2981);
		edittext51d = findViewById(R.id.edittext51d);
		textview2980 = findViewById(R.id.textview2980);
		textview2643 = findViewById(R.id.textview2643);
		edittext52d = findViewById(R.id.edittext52d);
		textview2662 = findViewById(R.id.textview2662);
		edittext53d = findViewById(R.id.edittext53d);
		textview2663 = findViewById(R.id.textview2663);
		textview46d = findViewById(R.id.textview46d);
		textview2689 = findViewById(R.id.textview2689);
		edittext54d = findViewById(R.id.edittext54d);
		textview2690 = findViewById(R.id.textview2690);
		textview47d = findViewById(R.id.textview47d);
		textview2672 = findViewById(R.id.textview2672);
		linear2304 = findViewById(R.id.linear2304);
		linear53d = findViewById(R.id.linear53d);
		linear2414 = findViewById(R.id.linear2414);
		textview2706 = findViewById(R.id.textview2706);
		linear61d = findViewById(R.id.linear61d);
		linear62d = findViewById(R.id.linear62d);
		linear63d = findViewById(R.id.linear63d);
		linear64d = findViewById(R.id.linear64d);
		linear118 = findViewById(R.id.linear118);
		linear2310 = findViewById(R.id.linear2310);
		linear2311 = findViewById(R.id.linear2311);
		linear74d = findViewById(R.id.linear74d);
		linear2305 = findViewById(R.id.linear2305);
		textview2691 = findViewById(R.id.textview2691);
		linear2306 = findViewById(R.id.linear2306);
		textview2692 = findViewById(R.id.textview2692);
		textview2693 = findViewById(R.id.textview2693);
		edittext56d = findViewById(R.id.edittext56d);
		textview2698 = findViewById(R.id.textview2698);
		textview2699 = findViewById(R.id.textview2699);
		edittext57d = findViewById(R.id.edittext57d);
		textview2704 = findViewById(R.id.textview2704);
		edittext58d = findViewById(R.id.edittext58d);
		textview2705 = findViewById(R.id.textview2705);
		textview53d = findViewById(R.id.textview53d);
		textview2987 = findViewById(R.id.textview2987);
		edittext59d = findViewById(R.id.edittext59d);
		textview2988 = findViewById(R.id.textview2988);
		textview2989 = findViewById(R.id.textview2989);
		textview2707 = findViewById(R.id.textview2707);
		edittext61d = findViewById(R.id.edittext61d);
		textview2708 = findViewById(R.id.textview2708);
		textview61d = findViewById(R.id.textview61d);
		textview2709 = findViewById(R.id.textview2709);
		edittext62d = findViewById(R.id.edittext62d);
		textview2710 = findViewById(R.id.textview2710);
		textview62d = findViewById(R.id.textview62d);
		textview2712 = findViewById(R.id.textview2712);
		edittext63d = findViewById(R.id.edittext63d);
		textview2713 = findViewById(R.id.textview2713);
		textview63d = findViewById(R.id.textview63d);
		textview2715 = findViewById(R.id.textview2715);
		edittext64d = findViewById(R.id.edittext64d);
		textview2716 = findViewById(R.id.textview2716);
		textview64d = findViewById(R.id.textview64d);
		textview2718 = findViewById(R.id.textview2718);
		edittext65d = findViewById(R.id.edittext65d);
		textview2719 = findViewById(R.id.textview2719);
		textview14 = findViewById(R.id.textview14);
		textview2720 = findViewById(R.id.textview2720);
		edittext66d = findViewById(R.id.edittext66d);
		textview2721 = findViewById(R.id.textview2721);
		textview2722 = findViewById(R.id.textview2722);
		textview2723 = findViewById(R.id.textview2723);
		linear2409 = findViewById(R.id.linear2409);
		linear2410 = findViewById(R.id.linear2410);
		linear202 = findViewById(R.id.linear202);
		edittext71d = findViewById(R.id.edittext71d);
		textview2953 = findViewById(R.id.textview2953);
		textview2731 = findViewById(R.id.textview2731);
		edittext72d = findViewById(R.id.edittext72d);
		textview2957 = findViewById(R.id.textview2957);
		textview2730 = findViewById(R.id.textview2730);
		edittext73d = findViewById(R.id.edittext73d);
		textview2729 = findViewById(R.id.textview2729);
		textview657 = findViewById(R.id.textview657);
		textview2732 = findViewById(R.id.textview2732);
		edittext74d = findViewById(R.id.edittext74d);
		textview2733 = findViewById(R.id.textview2733);
		textview74d = findViewById(R.id.textview74d);
		textview2752 = findViewById(R.id.textview2752);
		edittext76d = findViewById(R.id.edittext76d);
		edittext75d = findViewById(R.id.edittext75d);
		textview2753 = findViewById(R.id.textview2753);
		textview75d = findViewById(R.id.textview75d);
		linear76d = findViewById(R.id.linear76d);
		linear2326 = findViewById(R.id.linear2326);
		linear2364 = findViewById(R.id.linear2364);
		textview2749 = findViewById(R.id.textview2749);
		edittext77d = findViewById(R.id.edittext77d);
		textview2750 = findViewById(R.id.textview2750);
		textview76d = findViewById(R.id.textview76d);
		linear2327 = findViewById(R.id.linear2327);
		textview2754 = findViewById(R.id.textview2754);
		linear2328 = findViewById(R.id.linear2328);
		textview2755 = findViewById(R.id.textview2755);
		textview2756 = findViewById(R.id.textview2756);
		edittext81d = findViewById(R.id.edittext81d);
		textview2757 = findViewById(R.id.textview2757);
		textview2758 = findViewById(R.id.textview2758);
		edittext82d = findViewById(R.id.edittext82d);
		textview2813 = findViewById(R.id.textview2813);
		textview2760 = findViewById(R.id.textview2760);
		edittext83d = findViewById(R.id.edittext83d);
		textview2811 = findViewById(R.id.textview2811);
		textview2810 = findViewById(R.id.textview2810);
		edittext84d = findViewById(R.id.edittext84d);
		textview2761 = findViewById(R.id.textview2761);
		textview2762 = findViewById(R.id.textview2762);
		edittext86d = findViewById(R.id.edittext86d);
		textview2763 = findViewById(R.id.textview2763);
		textview2764 = findViewById(R.id.textview2764);
		edittext87d = findViewById(R.id.edittext87d);
		textview2819 = findViewById(R.id.textview2819);
		textview2766 = findViewById(R.id.textview2766);
		edittext88d = findViewById(R.id.edittext88d);
		textview2817 = findViewById(R.id.textview2817);
		textview2816 = findViewById(R.id.textview2816);
		edittext89d = findViewById(R.id.edittext89d);
		linear2349 = findViewById(R.id.linear2349);
		linear2365 = findViewById(R.id.linear2365);
		textview2837 = findViewById(R.id.textview2837);
		edittext92d = findViewById(R.id.edittext92d);
		textview2838 = findViewById(R.id.textview2838);
		textview2839 = findViewById(R.id.textview2839);
		linear2366 = findViewById(R.id.linear2366);
		textview2855 = findViewById(R.id.textview2855);
		linear2367 = findViewById(R.id.linear2367);
		textview2795 = findViewById(R.id.textview2795);
		edittext97d = findViewById(R.id.edittext97d);
		textview2885 = findViewById(R.id.textview2885);
		textview2884 = findViewById(R.id.textview2884);
		edittext98d = findViewById(R.id.edittext98d);
		textview2887 = findViewById(R.id.textview2887);
		textview2886 = findViewById(R.id.textview2886);
		edittext99d = findViewById(R.id.edittext99d);
		textview2801 = findViewById(R.id.textview2801);
		edittext101d = findViewById(R.id.edittext101d);
		textview2891 = findViewById(R.id.textview2891);
		textview2890 = findViewById(R.id.textview2890);
		edittext102d = findViewById(R.id.edittext102d);
		textview2893 = findViewById(R.id.textview2893);
		textview2892 = findViewById(R.id.textview2892);
		edittext103d = findViewById(R.id.edittext103d);
		linear2380 = findViewById(R.id.linear2380);
		linear2394 = findViewById(R.id.linear2394);
		linear2391 = findViewById(R.id.linear2391);
		linear227d = findViewById(R.id.linear227d);
		textview2877 = findViewById(R.id.textview2877);
		edittext106d = findViewById(R.id.edittext106d);
		textview2894 = findViewById(R.id.textview2894);
		edittext105d = findViewById(R.id.edittext105d);
		textview2878 = findViewById(R.id.textview2878);
		textview2879 = findViewById(R.id.textview2879);
		textview2921 = findViewById(R.id.textview2921);
		edittext108d = findViewById(R.id.edittext108d);
		textview2922 = findViewById(R.id.textview2922);
		edittext107d = findViewById(R.id.edittext107d);
		textview2923 = findViewById(R.id.textview2923);
		textview2924 = findViewById(R.id.textview2924);
		linear2396 = findViewById(R.id.linear2396);
		linear2397 = findViewById(R.id.linear2397);
		textview2925 = findViewById(R.id.textview2925);
		edittext111d = findViewById(R.id.edittext111d);
		textview2926 = findViewById(R.id.textview2926);
		edittext110d = findViewById(R.id.edittext110d);
		textview2927 = findViewById(R.id.textview2927);
		textview2928 = findViewById(R.id.textview2928);
		textview2929 = findViewById(R.id.textview2929);
		edittext113d = findViewById(R.id.edittext113d);
		textview2930 = findViewById(R.id.textview2930);
		edittext112d = findViewById(R.id.edittext112d);
		textview2931 = findViewById(R.id.textview2931);
		textview2932 = findViewById(R.id.textview2932);
		linear2400 = findViewById(R.id.linear2400);
		linear445d = findViewById(R.id.linear445d);
		linear446d = findViewById(R.id.linear446d);
		close = findViewById(R.id.close);
		linear2401 = findViewById(R.id.linear2401);
		textview2774 = findViewById(R.id.textview2774);
		linear2470 = findViewById(R.id.linear2470);
		linear2471 = findViewById(R.id.linear2471);
		linear333d = findViewById(R.id.linear333d);
		linear2403 = findViewById(R.id.linear2403);
		linear133d = findViewById(R.id.linear133d);
		linear2439 = findViewById(R.id.linear2439);
		linear2363 = findViewById(R.id.linear2363);
		hscroll242 = findViewById(R.id.hscroll242);
		linear2417 = findViewById(R.id.linear2417);
		button51d = findViewById(R.id.button51d);
		button50d = findViewById(R.id.button50d);
		button49d = findViewById(R.id.button49d);
		button48d = findViewById(R.id.button48d);
		button47d = findViewById(R.id.button47d);
		button56d = findViewById(R.id.button56d);
		button55d = findViewById(R.id.button55d);
		button54d = findViewById(R.id.button54d);
		button53d = findViewById(R.id.button53d);
		button52d = findViewById(R.id.button52d);
		linear333 = findViewById(R.id.linear333);
		textview2777 = findViewById(R.id.textview2777);
		edittext124d = findViewById(R.id.edittext124d);
		textview2800 = findViewById(R.id.textview2800);
		textview2818 = findViewById(R.id.textview2818);
		edittext126d = findViewById(R.id.edittext126d);
		textview2820 = findViewById(R.id.textview2820);
		linear2357 = findViewById(R.id.linear2357);
		textview2814 = findViewById(R.id.textview2814);
		linear2342 = findViewById(R.id.linear2342);
		textview2809 = findViewById(R.id.textview2809);
		edittext117d = findViewById(R.id.edittext117d);
		edittext118d = findViewById(R.id.edittext118d);
		textview2808 = findViewById(R.id.textview2808);
		textview2935 = findViewById(R.id.textview2935);
		edittext132d = findViewById(R.id.edittext132d);
		textview2936 = findViewById(R.id.textview2936);
		edittext131d = findViewById(R.id.edittext131d);
		textview2798 = findViewById(R.id.textview2798);
		textview2799 = findViewById(R.id.textview2799);
		textview3046 = findViewById(R.id.textview3046);
		edittext133d = findViewById(R.id.edittext133d);
		textview519 = findViewById(R.id.textview519);
		textview2851 = findViewById(R.id.textview2851);
		edittext135d = findViewById(R.id.edittext135d);
		textview2852 = findViewById(R.id.textview2852);
		edittext134d = findViewById(R.id.edittext134d);
		textview2853 = findViewById(R.id.textview2853);
		textview2854 = findViewById(R.id.textview2854);
		linear2426 = findViewById(R.id.linear2426);
		hscroll241 = findViewById(R.id.hscroll241);
		linear2415 = findViewById(R.id.linear2415);
		linear218 = findViewById(R.id.linear218);
		textview3027 = findViewById(R.id.textview3027);
		linear205 = findViewById(R.id.linear205);
		textview3028 = findViewById(R.id.textview3028);
		linear203 = findViewById(R.id.linear203);
		textview3029 = findViewById(R.id.textview3029);
		edittext138d = findViewById(R.id.edittext138d);
		textview643 = findViewById(R.id.textview643);
		edittext137d = findViewById(R.id.edittext137d);
		textview641 = findViewById(R.id.textview641);
		edittext136d = findViewById(R.id.edittext136d);
		textview2990 = findViewById(R.id.textview2990);
		edittext139d = findViewById(R.id.edittext139d);
		textview2991 = findViewById(R.id.textview2991);
		textview2992 = findViewById(R.id.textview2992);
		textview2840 = findViewById(R.id.textview2840);
		linear2354 = findViewById(R.id.linear2354);
		linear2350 = findViewById(R.id.linear2350);
		linear334d = findViewById(R.id.linear334d);
		linear2406 = findViewById(R.id.linear2406);
		linear143d = findViewById(R.id.linear143d);
		hscroll245 = findViewById(R.id.hscroll245);
		linear2361 = findViewById(R.id.linear2361);
		hscroll207 = findViewById(R.id.hscroll207);
		linear2433 = findViewById(R.id.linear2433);
		button67d = findViewById(R.id.button67d);
		button66d = findViewById(R.id.button66d);
		button65d = findViewById(R.id.button65d);
		button64d = findViewById(R.id.button64d);
		button63d = findViewById(R.id.button63d);
		button72d = findViewById(R.id.button72d);
		button71d = findViewById(R.id.button71d);
		button70d = findViewById(R.id.button70d);
		button69d = findViewById(R.id.button69d);
		button68d = findViewById(R.id.button68d);
		linear334 = findViewById(R.id.linear334);
		textview2771 = findViewById(R.id.textview2771);
		edittext120d = findViewById(R.id.edittext120d);
		textview2792 = findViewById(R.id.textview2792);
		textview2812 = findViewById(R.id.textview2812);
		edittext122d = findViewById(R.id.edittext122d);
		textview2841 = findViewById(R.id.textview2841);
		linear2359 = findViewById(R.id.linear2359);
		textview2842 = findViewById(R.id.textview2842);
		linear2360 = findViewById(R.id.linear2360);
		textview2844 = findViewById(R.id.textview2844);
		edittext115d = findViewById(R.id.edittext115d);
		edittext116d = findViewById(R.id.edittext116d);
		textview2843 = findViewById(R.id.textview2843);
		textview2943 = findViewById(R.id.textview2943);
		edittext142d = findViewById(R.id.edittext142d);
		textview2944 = findViewById(R.id.textview2944);
		edittext141d = findViewById(R.id.edittext141d);
		textview2945 = findViewById(R.id.textview2945);
		textview2793 = findViewById(R.id.textview2793);
		textview3049 = findViewById(R.id.textview3049);
		edittext143d = findViewById(R.id.edittext143d);
		textview3050 = findViewById(R.id.textview3050);
		textview2848 = findViewById(R.id.textview2848);
		edittext145d = findViewById(R.id.edittext145d);
		textview2845 = findViewById(R.id.textview2845);
		edittext144d = findViewById(R.id.edittext144d);
		textview2846 = findViewById(R.id.textview2846);
		textview2847 = findViewById(R.id.textview2847);
		linear2434 = findViewById(R.id.linear2434);
		hscroll244 = findViewById(R.id.hscroll244);
		linear2435 = findViewById(R.id.linear2435);
		linear2436 = findViewById(R.id.linear2436);
		textview3041 = findViewById(R.id.textview3041);
		linear2437 = findViewById(R.id.linear2437);
		textview3042 = findViewById(R.id.textview3042);
		linear2438 = findViewById(R.id.linear2438);
		textview3043 = findViewById(R.id.textview3043);
		edittext148d = findViewById(R.id.edittext148d);
		textview3044 = findViewById(R.id.textview3044);
		edittext147d = findViewById(R.id.edittext147d);
		textview3045 = findViewById(R.id.textview3045);
		edittext146d = findViewById(R.id.edittext146d);
		textview3038 = findViewById(R.id.textview3038);
		edittext149d = findViewById(R.id.edittext149d);
		textview3039 = findViewById(R.id.textview3039);
		textview3040 = findViewById(R.id.textview3040);
		dialog = new AlertDialog.Builder(this);
		
		print1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_PrintHelper(dynamic_linear0d);
			}
		});
		
		button195d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/MM7gBrBUFEA"));
				startActivity(price);
			}
		});
		
		button197d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear197d.setVisibility(View.VISIBLE);
				textview99.setVisibility(View.VISIBLE);
			}
		});
		
		close1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear197d.setVisibility(View.GONE);
				textview99.setVisibility(View.GONE);
			}
		});
		
		button1d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext_am3d.getText().toString().equals("a.m") || edittext_am4d.getText().toString().equals("a.m")) || edittext_am6d.getText().toString().equals("a.m")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (Double.parseDouble(edittext5d.getText().toString()) == 4) {
						textview5d.setText("عمود داخلي");
					}
					if ((edittext8d.getText().toString().equals("") || edittext8d.getText().toString().equals(".")) || (edittext8d.getText().toString().equals("-") || (Double.parseDouble(edittext8d.getText().toString()) < 0))) {
						edittext8d.setText(String.valueOf(0.00d));
					}
					if ((edittext11d.getText().toString().equals("") || edittext11d.getText().toString().equals(".")) || (edittext11d.getText().toString().equals("-") || (Double.parseDouble(edittext11d.getText().toString()) < 0))) {
						edittext11d.setText(String.valueOf(0.00d));
					}
					if ((edittext15d.getText().toString().equals("") || edittext15d.getText().toString().equals(".")) || (edittext15d.getText().toString().equals("-") || (Double.parseDouble(edittext15d.getText().toString()) < 0))) {
						edittext15d.setText(String.valueOf(250));
					}
					if ((edittext16d.getText().toString().equals("") || edittext16d.getText().toString().equals(".")) || (edittext16d.getText().toString().equals("-") || (Double.parseDouble(edittext16d.getText().toString()) < 0))) {
						edittext16d.setText(String.valueOf(2.5d));
					}
					if ((edittext17d.getText().toString().equals("") || edittext17d.getText().toString().equals(".")) || (edittext17d.getText().toString().equals("-") || (Double.parseDouble(edittext17d.getText().toString()) < 0))) {
						edittext17d.setText(String.valueOf(3600));
					}
					if ((edittext18d.getText().toString().equals("") || edittext18d.getText().toString().equals(".")) || (edittext18d.getText().toString().equals("-") || (Double.parseDouble(edittext18d.getText().toString()) < 0))) {
						edittext18d.setText(String.valueOf(0.07d));
					}
					if ((edittext19d.getText().toString().equals("") || edittext19d.getText().toString().equals(".")) || (edittext19d.getText().toString().equals("-") || (Double.parseDouble(edittext19d.getText().toString()) < 0))) {
						edittext19d.setText(String.valueOf(1.5d));
					}
					if ((edittext20d.getText().toString().equals("") || edittext20d.getText().toString().equals(".")) || (edittext20d.getText().toString().equals("-") || (Double.parseDouble(edittext20d.getText().toString()) < 0))) {
						edittext20d.setText(_English_Decimal_Format(0.30d));
					}
					edittext7d.setText(String.valueOf(Double.parseDouble(edittext_am6d.getText().toString()) / 1.5d));
					edittext9d.setText(String.valueOf(Double.parseDouble(edittext_am8d.getText().toString()) / 1.5d));
					edittext10d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am8d.getText().toString()) / Double.parseDouble(edittext_am6d.getText().toString())));
					edittext12d.setText(String.valueOf(Double.parseDouble(edittext_am11d.getText().toString()) / 1.5d));
					edittext13d.setText(_English_Decimal_Format(Double.parseDouble(edittext_am11d.getText().toString()) / Double.parseDouble(edittext_am6d.getText().toString())));
					edittext21d.setText(String.valueOf(Double.parseDouble(edittext_am3d.getText().toString()) - Double.parseDouble(edittext_am4d.getText().toString())));
					edittext22d.setText(String.valueOf(((Double.parseDouble(edittext7d.getText().toString()) * 1000) / Double.parseDouble(edittext_am19d.getText().toString())) / 10000));
					if (Double.parseDouble(edittext_am20d.getText().toString()) == 0) {
						linear221d.setVisibility(View.GONE);
						edittext23d.setText(_English_Decimal_Format(Math.ceil((((-1 * Double.parseDouble(edittext21d.getText().toString())) + Math.sqrt((Double.parseDouble(edittext21d.getText().toString()) * Double.parseDouble(edittext21d.getText().toString())) - (4 * (-1 * Double.parseDouble(edittext22d.getText().toString()))))) / 2) * 10) / 10));
						if (Double.parseDouble(edittext23d.getText().toString()) > (Double.parseDouble(edittext_am4d.getText().toString()) + (2 * 0.4d))) {
							edittext26d.setText(_English_Decimal_Format(Double.parseDouble(edittext23d.getText().toString())));
						}
						else {
							edittext26d.setText(_English_Decimal_Format(Math.ceil((Double.parseDouble(edittext_am4d.getText().toString()) + (2 * 0.4d)) * 10) / 10));
						}
						edittext29d.setText(_English_Decimal_Format(Math.ceil((Double.parseDouble(edittext21d.getText().toString()) + Double.parseDouble(edittext26d.getText().toString())) * 10) / 10));
						edittext31d.setText(_English_Decimal_Format(Double.parseDouble(edittext26d.getText().toString()) - (2 * Double.parseDouble(edittext_am20d.getText().toString()))));
						edittext32d.setText(_English_Decimal_Format(Double.parseDouble(edittext29d.getText().toString()) - (2 * Double.parseDouble(edittext_am20d.getText().toString()))));
					}
					else {
						linear221d.setVisibility(View.VISIBLE);
						if (((Double.parseDouble(edittext_am20d.getText().toString()) > 0) && (Double.parseDouble(edittext_am20d.getText().toString()) < 0.2d)) || (Double.parseDouble(edittext_am20d.getText().toString()) == 0.20d)) {
							edittext23d.setText(_English_Decimal_Format(Math.ceil((((-1 * Double.parseDouble(edittext21d.getText().toString())) + Math.sqrt((Double.parseDouble(edittext21d.getText().toString()) * Double.parseDouble(edittext21d.getText().toString())) - (4 * (-1 * Double.parseDouble(edittext22d.getText().toString()))))) / 2) * 10) / 10));
							if (Double.parseDouble(edittext23d.getText().toString()) > (Double.parseDouble(edittext_am4d.getText().toString()) + (2 * 0.4d))) {
								edittext31d.setText(_English_Decimal_Format(Double.parseDouble(edittext23d.getText().toString())));
							}
							else {
								edittext31d.setText(_English_Decimal_Format(Math.ceil((Double.parseDouble(edittext_am4d.getText().toString()) + (2 * 0.4d)) * 10) / 10));
							}
							edittext32d.setText(_English_Decimal_Format(Math.ceil((Double.parseDouble(edittext21d.getText().toString()) + Double.parseDouble(edittext31d.getText().toString())) * 10) / 10));
							edittext26d.setText(_English_Decimal_Format(Double.parseDouble(edittext31d.getText().toString()) + (2 * Double.parseDouble(edittext_am20d.getText().toString()))));
							edittext29d.setText(_English_Decimal_Format(Double.parseDouble(edittext32d.getText().toString()) + (2 * Double.parseDouble(edittext_am20d.getText().toString()))));
						}
						else {
							edittext23d.setText(_English_Decimal_Format(Math.ceil((((-1 * Double.parseDouble(edittext21d.getText().toString())) + Math.sqrt((Double.parseDouble(edittext21d.getText().toString()) * Double.parseDouble(edittext21d.getText().toString())) - (4 * (-1 * Double.parseDouble(edittext22d.getText().toString()))))) / 2) * 10) / 10));
							if (Double.parseDouble(edittext23d.getText().toString()) > (Double.parseDouble(edittext_am4d.getText().toString()) + ((2 * Double.parseDouble(edittext_am20d.getText().toString())) + (2 * 0.30d)))) {
								edittext26d.setText(_English_Decimal_Format(Double.parseDouble(edittext23d.getText().toString())));
							}
							else {
								edittext26d.setText(_English_Decimal_Format(Math.ceil((Double.parseDouble(edittext_am4d.getText().toString()) + ((2 * Double.parseDouble(edittext_am20d.getText().toString())) + (2 * 0.30d))) * 10) / 10));
							}
							edittext29d.setText(_English_Decimal_Format(Math.ceil((Double.parseDouble(edittext21d.getText().toString()) + Double.parseDouble(edittext26d.getText().toString())) * 10) / 10));
							edittext31d.setText(_English_Decimal_Format(Double.parseDouble(edittext26d.getText().toString()) - (2 * Double.parseDouble(edittext_am20d.getText().toString()))));
							edittext32d.setText(_English_Decimal_Format(Double.parseDouble(edittext29d.getText().toString()) - (2 * Double.parseDouble(edittext_am20d.getText().toString()))));
						}
					}
					edittext34d.setText(String.valueOf(((Double.parseDouble(edittext31d.getText().toString()) - Double.parseDouble(edittext_am4d.getText().toString())) / 2) + Double.parseDouble(edittext13d.getText().toString())));
					edittext35d.setText(String.valueOf(((Double.parseDouble(edittext32d.getText().toString()) - Double.parseDouble(edittext_am3d.getText().toString())) / 2) + Double.parseDouble(edittext10d.getText().toString())));
					if (Double.parseDouble(edittext34d.getText().toString()) > (Double.parseDouble(edittext31d.getText().toString()) - Double.parseDouble(edittext_am4d.getText().toString()))) {
						edittext38d.setText(_English_Decimal_Format(Math.ceil((Double.parseDouble(edittext34d.getText().toString()) + Double.parseDouble(edittext_am4d.getText().toString())) * 10) / 10));
					}
					else {
						edittext38d.setText(_English_Decimal_Format(Math.ceil(Double.parseDouble(edittext31d.getText().toString()) * 10) / 10));
					}
					edittext36d.setText(_English_Decimal_Format(Double.parseDouble(edittext38d.getText().toString()) + (Double.parseDouble(edittext_am20d.getText().toString()) * 2)));
					if (Double.parseDouble(edittext35d.getText().toString()) > (Double.parseDouble(edittext32d.getText().toString()) - Double.parseDouble(edittext_am3d.getText().toString()))) {
						edittext39d.setText(_English_Decimal_Format(Math.ceil((Double.parseDouble(edittext35d.getText().toString()) + Double.parseDouble(edittext_am3d.getText().toString())) * 10) / 10));
					}
					else {
						edittext39d.setText(_English_Decimal_Format(Math.ceil(Double.parseDouble(edittext32d.getText().toString()) * 10) / 10));
					}
					edittext37d.setText(_English_Decimal_Format(Double.parseDouble(edittext39d.getText().toString()) + (Double.parseDouble(edittext_am20d.getText().toString()) * 2)));
					edittext40d.setText(String.valueOf(Double.parseDouble(edittext38d.getText().toString()) * Double.parseDouble(edittext39d.getText().toString())));
					edittext41d.setText(String.valueOf(Double.parseDouble(edittext_am6d.getText().toString()) / Double.parseDouble(edittext40d.getText().toString())));
					edittext42d.setText(String.valueOf(Double.parseDouble(edittext39d.getText().toString()) * (Double.parseDouble(edittext41d.getText().toString()) * Double.parseDouble(edittext34d.getText().toString()))));
					edittext43d.setText(String.valueOf(Double.parseDouble(edittext42d.getText().toString()) * (Double.parseDouble(edittext34d.getText().toString()) / 2)));
					edittext47d.setText(String.valueOf(Double.parseDouble(edittext46d.getText().toString()) * Math.sqrt((Double.parseDouble(edittext43d.getText().toString()) * Math.pow(10, 5)) / (Double.parseDouble(edittext_am15d.getText().toString()) * (Double.parseDouble(edittext39d.getText().toString()) * 100)))));
					edittext48d.setText(String.valueOf((Double.parseDouble(edittext47d.getText().toString()) / 100) + Double.parseDouble(edittext_am18d.getText().toString())));
					edittext49d.setText(String.valueOf(Math.ceil(((Double.parseDouble(edittext47d.getText().toString()) / 100) + Double.parseDouble(edittext_am18d.getText().toString())) * 10) / 10));
					edittext44d.setText(String.valueOf(Double.parseDouble(edittext38d.getText().toString()) * (Double.parseDouble(edittext41d.getText().toString()) * Double.parseDouble(edittext35d.getText().toString()))));
					edittext45d.setText(String.valueOf(Double.parseDouble(edittext44d.getText().toString()) * (Double.parseDouble(edittext35d.getText().toString()) / 2)));
					edittext50d.setText(String.valueOf(Double.parseDouble(edittext46d.getText().toString()) * Math.sqrt((Double.parseDouble(edittext45d.getText().toString()) * Math.pow(10, 5)) / (Double.parseDouble(edittext_am15d.getText().toString()) * (Double.parseDouble(edittext38d.getText().toString()) * 100)))));
					edittext51d.setText(String.valueOf((Double.parseDouble(edittext50d.getText().toString()) / 100) + Double.parseDouble(edittext_am18d.getText().toString())));
					edittext52d.setText(String.valueOf(Math.ceil(((Double.parseDouble(edittext50d.getText().toString()) / 100) + Double.parseDouble(edittext_am18d.getText().toString())) * 10) / 10));
					if (Double.parseDouble(edittext49d.getText().toString()) > Double.parseDouble(edittext52d.getText().toString())) {
						edittext53d.setText(String.valueOf(Double.parseDouble(edittext49d.getText().toString())));
					}
					else {
						edittext53d.setText(String.valueOf(Double.parseDouble(edittext52d.getText().toString())));
					}
					edittext54d.setText(String.valueOf(Double.parseDouble(edittext53d.getText().toString()) - Double.parseDouble(edittext_am18d.getText().toString())));
					edittext56d.setText(String.valueOf((Double.parseDouble(edittext41d.getText().toString()) * (Double.parseDouble(edittext34d.getText().toString()) * 1000)) / ((0.5d * (Math.sqrt(Double.parseDouble(edittext_am15d.getText().toString()) / 1.5d) * 10000)) + ((Double.parseDouble(edittext41d.getText().toString()) * 1000) / 2))));
					edittext57d.setText(String.valueOf((Double.parseDouble(edittext41d.getText().toString()) * (Double.parseDouble(edittext35d.getText().toString()) * 1000)) / ((0.5d * (Math.sqrt(Double.parseDouble(edittext_am15d.getText().toString()) / 1.5d) * 10000)) + ((Double.parseDouble(edittext41d.getText().toString()) * 1000) / 2))));
					edittext58d.setText(String.valueOf(Math.max(Double.parseDouble(edittext54d.getText().toString()), Math.max(Double.parseDouble(edittext56d.getText().toString()), Double.parseDouble(edittext57d.getText().toString())))));
					edittext59d.setText(String.valueOf(Double.parseDouble(edittext58d.getText().toString()) + Double.parseDouble(edittext_am18d.getText().toString())));
					edittext61d.setText(String.valueOf((2 * (Double.parseDouble(edittext_am3d.getText().toString()) + Double.parseDouble(edittext58d.getText().toString()))) + (2 * (Double.parseDouble(edittext_am4d.getText().toString()) + Double.parseDouble(edittext58d.getText().toString())))));
					edittext62d.setText(String.valueOf((2.5d * ((Double.parseDouble(edittext5d.getText().toString()) * (Double.parseDouble(edittext58d.getText().toString()) / Double.parseDouble(edittext61d.getText().toString()))) + 0.20d)) * Math.sqrt(Double.parseDouble(edittext_am15d.getText().toString()) / 1.5d)));
					edittext63d.setText(String.valueOf((0.5d + (Double.parseDouble(edittext_am4d.getText().toString()) / Double.parseDouble(edittext_am3d.getText().toString()))) * Math.sqrt(Double.parseDouble(edittext_am15d.getText().toString()) / 1.5d)));
					edittext64d.setText(String.valueOf(Math.sqrt(Double.parseDouble(edittext_am15d.getText().toString()) / 1.5d)));
					edittext66d.setText(String.valueOf(Math.min(Double.parseDouble(edittext62d.getText().toString()), Math.min(Double.parseDouble(edittext63d.getText().toString()), Math.min(Double.parseDouble(edittext64d.getText().toString()), Double.parseDouble(edittext65d.getText().toString()))))));
					edittext71d.setText(String.valueOf((4 * Double.parseDouble(edittext66d.getText().toString())) + ((Double.parseDouble(edittext41d.getText().toString()) * 1000) / 10000)));
					edittext72d.setText(String.valueOf((((2 * Double.parseDouble(edittext66d.getText().toString())) * (Double.parseDouble(edittext_am3d.getText().toString()) * 100)) + ((2 * Double.parseDouble(edittext66d.getText().toString())) * (Double.parseDouble(edittext_am4d.getText().toString()) * 100))) + ((((Double.parseDouble(edittext41d.getText().toString()) * 1000) / 10000) * (Double.parseDouble(edittext_am3d.getText().toString()) * 100)) + (((Double.parseDouble(edittext41d.getText().toString()) * 1000) / 10000) * (Double.parseDouble(edittext_am4d.getText().toString()) * 100)))));
					edittext73d.setText(String.valueOf(((((Double.parseDouble(edittext41d.getText().toString()) * 1000) / 10000) * (Double.parseDouble(edittext_am3d.getText().toString()) * 100)) * (Double.parseDouble(edittext_am4d.getText().toString()) * 100)) - (Double.parseDouble(edittext_am6d.getText().toString()) * 1000)));
					edittext74d.setText(String.valueOf(((-1 * Double.parseDouble(edittext72d.getText().toString())) + Math.sqrt((Double.parseDouble(edittext72d.getText().toString()) * Double.parseDouble(edittext72d.getText().toString())) - (4 * (Double.parseDouble(edittext71d.getText().toString()) * Double.parseDouble(edittext73d.getText().toString()))))) / (Double.parseDouble(edittext71d.getText().toString()) * 2)));
					if ((Double.parseDouble(edittext74d.getText().toString()) / 100) > Double.parseDouble(edittext58d.getText().toString())) {
						edittext75d.setText(String.valueOf(Math.ceil(((Double.parseDouble(edittext74d.getText().toString()) / 100) + Double.parseDouble(edittext_am18d.getText().toString())) * 10) / 10));
					}
					else {
						edittext75d.setText(String.valueOf(Math.ceil((Double.parseDouble(edittext58d.getText().toString()) + Double.parseDouble(edittext_am18d.getText().toString())) * 10) / 10));
					}
					Safe.setVisibility(View.VISIBLE);
					if (Double.parseDouble(edittext75d.getText().toString()) < Math.max(0.3d, Math.min(Double.parseDouble(edittext_am3d.getText().toString()), Double.parseDouble(edittext_am4d.getText().toString())))) {
						edittext76d.setText(_English_Decimal_Format(Math.max(0.3d, Math.min(Double.parseDouble(edittext_am3d.getText().toString()), Double.parseDouble(edittext_am4d.getText().toString())))));
					}
					else {
						edittext76d.setText(_English_Decimal_Format(Double.parseDouble(edittext75d.getText().toString())));
					}
					edittext77d.setText(String.valueOf(Math.ceil((Double.parseDouble(edittext76d.getText().toString()) - Double.parseDouble(edittext_am18d.getText().toString())) * 100) / 100));
					edittext81d.setText(String.valueOf((Double.parseDouble(edittext77d.getText().toString()) * 100) / Math.sqrt((Double.parseDouble(edittext43d.getText().toString()) * 100000) / (Double.parseDouble(edittext_am15d.getText().toString()) * (Double.parseDouble(edittext39d.getText().toString()) * 100)))));
					if (Double.parseDouble(edittext81d.getText().toString()) < 2.65d) {
						edittext82d.setText(String.valueOf(0.696d));
					}
					else {
						if (Double.parseDouble(edittext81d.getText().toString()) > 4.85d) {
							edittext82d.setText(String.valueOf(0.826d));
						}
						else {
							edittext82d.setText(String.valueOf(0.4995d * (0.87d + Math.sqrt(0.7569d - (3.386d / Math.pow(Double.parseDouble(edittext81d.getText().toString()), 2))))));
						}
					}
					edittext83d.setText(String.valueOf((Double.parseDouble(edittext43d.getText().toString()) * 100000) / (Double.parseDouble(edittext_am17d.getText().toString()) * ((Double.parseDouble(edittext77d.getText().toString()) * 100) * Double.parseDouble(edittext82d.getText().toString())))));
					edittext84d.setText(String.valueOf(Double.parseDouble(edittext83d.getText().toString()) / Double.parseDouble(edittext39d.getText().toString())));
					edittext86d.setText(String.valueOf((Double.parseDouble(edittext77d.getText().toString()) * 100) / Math.sqrt((Double.parseDouble(edittext45d.getText().toString()) * 100000) / (Double.parseDouble(edittext_am15d.getText().toString()) * (Double.parseDouble(edittext38d.getText().toString()) * 100)))));
					if (Double.parseDouble(edittext86d.getText().toString()) < 2.65d) {
						edittext87d.setText(String.valueOf(0.696d));
					}
					else {
						if (Double.parseDouble(edittext86d.getText().toString()) > 4.85d) {
							edittext87d.setText(String.valueOf(0.826d));
						}
						else {
							edittext87d.setText(String.valueOf(0.4995d * (0.87d + Math.sqrt(0.7569d - (3.386d / Math.pow(Double.parseDouble(edittext86d.getText().toString()), 2))))));
						}
					}
					edittext88d.setText(String.valueOf((Double.parseDouble(edittext45d.getText().toString()) * 100000) / (Double.parseDouble(edittext_am17d.getText().toString()) * ((Double.parseDouble(edittext77d.getText().toString()) * 100) * Double.parseDouble(edittext87d.getText().toString())))));
					edittext89d.setText(String.valueOf(Double.parseDouble(edittext88d.getText().toString()) / Double.parseDouble(edittext38d.getText().toString())));
					if ((1.5d * (Double.parseDouble(edittext77d.getText().toString()) * 100)) < 5.65d) {
						edittext92d.setText(String.valueOf(1.5d * (Double.parseDouble(edittext77d.getText().toString()) * 100)));
					}
					else {
						edittext92d.setText(String.valueOf(Double.parseDouble("5.65")));
					}
					if (Double.parseDouble(edittext92d.getText().toString()) > Double.parseDouble(edittext84d.getText().toString())) {
						edittext97d.setText(String.valueOf(Double.parseDouble(edittext92d.getText().toString())));
					}
					else {
						edittext97d.setText(String.valueOf(Double.parseDouble(edittext84d.getText().toString())));
					}
					edittext99d.setText(String.valueOf(Math.sqrt((4 * Double.parseDouble(edittext97d.getText().toString())) / (Double.parseDouble(edittext98d.getText().toString()) * Math.PI)) * 10));
					if (Double.parseDouble(edittext92d.getText().toString()) > Double.parseDouble(edittext89d.getText().toString())) {
						edittext101d.setText(String.valueOf(Double.parseDouble(edittext92d.getText().toString())));
					}
					else {
						edittext101d.setText(String.valueOf(Double.parseDouble(edittext89d.getText().toString())));
					}
					edittext103d.setText(String.valueOf(Math.sqrt((4 * Double.parseDouble(edittext101d.getText().toString())) / (Double.parseDouble(edittext102d.getText().toString()) * Math.PI)) * 10));
					edittext105d.setText(String.valueOf((long)(Double.parseDouble(edittext102d.getText().toString()))));
					if (Double.parseDouble(edittext103d.getText().toString()) == 0) {
						edittext106d.setText(String.valueOf((long)(Double.parseDouble("0"))));
					}
					else {
						if (((0 < Double.parseDouble(edittext103d.getText().toString())) && (Double.parseDouble(edittext103d.getText().toString()) < 8)) || (Double.parseDouble(edittext103d.getText().toString()) == 8)) {
							edittext106d.setText(String.valueOf((long)(Double.parseDouble("8"))));
						}
						else {
							if (((8 < Double.parseDouble(edittext103d.getText().toString())) && (Double.parseDouble(edittext103d.getText().toString()) < 10)) || (Double.parseDouble(edittext103d.getText().toString()) == 10)) {
								edittext106d.setText(String.valueOf((long)(Double.parseDouble("10"))));
							}
							else {
								if (((10 < Double.parseDouble(edittext103d.getText().toString())) && (Double.parseDouble(edittext103d.getText().toString()) < 12)) || (Double.parseDouble(edittext103d.getText().toString()) == 12)) {
									edittext106d.setText(String.valueOf((long)(Double.parseDouble("12"))));
								}
								else {
									if (((12 < Double.parseDouble(edittext103d.getText().toString())) && (Double.parseDouble(edittext103d.getText().toString()) < 14)) || (Double.parseDouble(edittext103d.getText().toString()) == 14)) {
										edittext106d.setText(String.valueOf((long)(Double.parseDouble("14"))));
									}
									else {
										if (((14 < Double.parseDouble(edittext103d.getText().toString())) && (Double.parseDouble(edittext103d.getText().toString()) < 16)) || (Double.parseDouble(edittext103d.getText().toString()) == 16)) {
											edittext106d.setText(String.valueOf((long)(Double.parseDouble("16"))));
										}
										else {
											if (((16 < Double.parseDouble(edittext103d.getText().toString())) && (Double.parseDouble(edittext103d.getText().toString()) < 18)) || (Double.parseDouble(edittext103d.getText().toString()) == 18)) {
												edittext106d.setText(String.valueOf((long)(Double.parseDouble("18"))));
											}
											else {
												if (((18 < Double.parseDouble(edittext103d.getText().toString())) && (Double.parseDouble(edittext103d.getText().toString()) < 20)) || (Double.parseDouble(edittext103d.getText().toString()) == 20)) {
													edittext106d.setText(String.valueOf((long)(Double.parseDouble("20"))));
												}
												else {
													if (((20 < Double.parseDouble(edittext103d.getText().toString())) && (Double.parseDouble(edittext103d.getText().toString()) < 22)) || (Double.parseDouble(edittext103d.getText().toString()) == 22)) {
														edittext106d.setText(String.valueOf((long)(Double.parseDouble("22"))));
													}
													else {
														if (((22 < Double.parseDouble(edittext103d.getText().toString())) && (Double.parseDouble(edittext103d.getText().toString()) < 25)) || (Double.parseDouble(edittext103d.getText().toString()) == 25)) {
															edittext106d.setText(String.valueOf((long)(Double.parseDouble("25"))));
														}
														else {
															if (((25 < Double.parseDouble(edittext103d.getText().toString())) && (Double.parseDouble(edittext103d.getText().toString()) < 28)) || (Double.parseDouble(edittext103d.getText().toString()) == 28)) {
																edittext106d.setText(String.valueOf((long)(Double.parseDouble("28"))));
															}
															else {
																if (((28 < Double.parseDouble(edittext103d.getText().toString())) && (Double.parseDouble(edittext103d.getText().toString()) < 32)) || (Double.parseDouble(edittext103d.getText().toString()) == 32)) {
																	edittext106d.setText(String.valueOf((long)(Double.parseDouble("32"))));
																}
																else {
																	if (((32 < Double.parseDouble(edittext103d.getText().toString())) && (Double.parseDouble(edittext103d.getText().toString()) < 38)) || (Double.parseDouble(edittext103d.getText().toString()) == 38)) {
																		edittext106d.setText(String.valueOf((long)(Double.parseDouble("38"))));
																	}
																	else {
																		edittext106d.setText("???");
																		SketchwareUtil.showMessage(getApplicationContext(), "لا يوجد قطر مناسب لنفس عدد الأسياخ المكتوب لكل م'");
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
					}
					edittext107d.setText(String.valueOf((long)(Math.ceil(Double.parseDouble(edittext105d.getText().toString()) * Double.parseDouble(edittext38d.getText().toString())) + 1)));
					edittext108d.setText(edittext106d.getText().toString());
					edittext110d.setText(String.valueOf(Double.parseDouble(edittext98d.getText().toString())));
					if (Double.parseDouble(edittext99d.getText().toString()) == 0) {
						edittext111d.setText(String.valueOf((long)(Double.parseDouble("0"))));
					}
					else {
						if (((0 < Double.parseDouble(edittext99d.getText().toString())) && (Double.parseDouble(edittext99d.getText().toString()) < 8)) || (Double.parseDouble(edittext99d.getText().toString()) == 8)) {
							edittext111d.setText(String.valueOf((long)(Double.parseDouble("8"))));
						}
						else {
							if (((8 < Double.parseDouble(edittext99d.getText().toString())) && (Double.parseDouble(edittext99d.getText().toString()) < 10)) || (Double.parseDouble(edittext99d.getText().toString()) == 10)) {
								edittext111d.setText(String.valueOf((long)(Double.parseDouble("10"))));
							}
							else {
								if (((10 < Double.parseDouble(edittext99d.getText().toString())) && (Double.parseDouble(edittext99d.getText().toString()) < 12)) || (Double.parseDouble(edittext99d.getText().toString()) == 12)) {
									edittext111d.setText(String.valueOf((long)(Double.parseDouble("12"))));
								}
								else {
									if (((12 < Double.parseDouble(edittext99d.getText().toString())) && (Double.parseDouble(edittext99d.getText().toString()) < 14)) || (Double.parseDouble(edittext99d.getText().toString()) == 14)) {
										edittext111d.setText(String.valueOf((long)(Double.parseDouble("14"))));
									}
									else {
										if (((14 < Double.parseDouble(edittext99d.getText().toString())) && (Double.parseDouble(edittext99d.getText().toString()) < 16)) || (Double.parseDouble(edittext99d.getText().toString()) == 16)) {
											edittext111d.setText(String.valueOf((long)(Double.parseDouble("16"))));
										}
										else {
											if (((16 < Double.parseDouble(edittext99d.getText().toString())) && (Double.parseDouble(edittext99d.getText().toString()) < 18)) || (Double.parseDouble(edittext99d.getText().toString()) == 18)) {
												edittext111d.setText(String.valueOf((long)(Double.parseDouble("18"))));
											}
											else {
												if (((18 < Double.parseDouble(edittext99d.getText().toString())) && (Double.parseDouble(edittext99d.getText().toString()) < 20)) || (Double.parseDouble(edittext99d.getText().toString()) == 20)) {
													edittext111d.setText(String.valueOf((long)(Double.parseDouble("20"))));
												}
												else {
													if (((20 < Double.parseDouble(edittext99d.getText().toString())) && (Double.parseDouble(edittext99d.getText().toString()) < 22)) || (Double.parseDouble(edittext99d.getText().toString()) == 22)) {
														edittext111d.setText(String.valueOf((long)(Double.parseDouble("22"))));
													}
													else {
														if (((22 < Double.parseDouble(edittext99d.getText().toString())) && (Double.parseDouble(edittext99d.getText().toString()) < 25)) || (Double.parseDouble(edittext99d.getText().toString()) == 25)) {
															edittext111d.setText(String.valueOf((long)(Double.parseDouble("25"))));
														}
														else {
															if (((25 < Double.parseDouble(edittext99d.getText().toString())) && (Double.parseDouble(edittext99d.getText().toString()) < 28)) || (Double.parseDouble(edittext99d.getText().toString()) == 28)) {
																edittext111d.setText(String.valueOf((long)(Double.parseDouble("28"))));
															}
															else {
																if (((28 < Double.parseDouble(edittext99d.getText().toString())) && (Double.parseDouble(edittext99d.getText().toString()) < 32)) || (Double.parseDouble(edittext99d.getText().toString()) == 32)) {
																	edittext111d.setText(String.valueOf((long)(Double.parseDouble("32"))));
																}
																else {
																	if (((32 < Double.parseDouble(edittext99d.getText().toString())) && (Double.parseDouble(edittext99d.getText().toString()) < 38)) || (Double.parseDouble(edittext99d.getText().toString()) == 38)) {
																		edittext111d.setText(String.valueOf((long)(Double.parseDouble("38"))));
																	}
																	else {
																		edittext111d.setText("???");
																		SketchwareUtil.showMessage(getApplicationContext(), "لا يوجد قطر مناسب لنفس عدد الأسياخ المكتوب لكل م'");
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
					}
					edittext112d.setText(String.valueOf((long)(Math.ceil(Double.parseDouble(edittext110d.getText().toString()) * Double.parseDouble(edittext39d.getText().toString())) + 1)));
					edittext113d.setText(edittext111d.getText().toString());
					edittext136d.setText(_English_Decimal_Format(Double.parseDouble(edittext76d.getText().toString()) - (2 * Double.parseDouble(edittext_am18d.getText().toString()))));
					edittext137d.setText(_English_Decimal_Format(Double.parseDouble(edittext39d.getText().toString()) - (2 * Double.parseDouble(edittext_am18d.getText().toString()))));
					edittext138d.setText(_English_Decimal_Format(Double.parseDouble(edittext76d.getText().toString()) - (2 * Double.parseDouble(edittext_am18d.getText().toString()))));
					edittext139d.setText(_English_Decimal_Format(Double.parseDouble(edittext136d.getText().toString()) + (Double.parseDouble(edittext137d.getText().toString()) + Double.parseDouble(edittext138d.getText().toString()))));
					edittext146d.setText(_English_Decimal_Format(Double.parseDouble(edittext76d.getText().toString()) - (2 * Double.parseDouble(edittext_am18d.getText().toString()))));
					edittext147d.setText(_English_Decimal_Format(Double.parseDouble(edittext38d.getText().toString()) - (2 * Double.parseDouble(edittext_am18d.getText().toString()))));
					edittext148d.setText(_English_Decimal_Format(Double.parseDouble(edittext76d.getText().toString()) - (2 * Double.parseDouble(edittext_am18d.getText().toString()))));
					edittext149d.setText(_English_Decimal_Format(Double.parseDouble(edittext146d.getText().toString()) + (Double.parseDouble(edittext147d.getText().toString()) + Double.parseDouble(edittext148d.getText().toString()))));
				}
			}
		});
		
		button44d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				button44d.setVisibility(View.GONE);
				textview555.setVisibility(View.VISIBLE);
				linear444d.setVisibility(View.VISIBLE);
				/*
قطر ومساحة مقطع الحديد
*/
				edittext115d.setText(String.valueOf(00.00));
				edittext116d.setText(String.valueOf(00.00));
				edittext117d.setText(String.valueOf(00.00));
				edittext118d.setText(String.valueOf(00.00));
			}
		});
		
		edittext4d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext_am4d.setText("a.m");
				}
				else {
					edittext_am4d.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext_am4d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				/*
أبعاد القاعدة العادية
*/
				edittext36d.setText(String.valueOf(00.00));
				edittext37d.setText(String.valueOf(00.00));
				/*
أبعاد القاعدة السلحة
*/
				edittext38d.setText(String.valueOf(00.00));
				edittext39d.setText(String.valueOf(00.00));
				Safe.setVisibility(View.GONE);
				edittext76d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي B rc
*/
				edittext117d.setText(String.valueOf(00.00));
				edittext118d.setText(String.valueOf(00.00));
				edittext136d.setText(String.valueOf(00.00));
				edittext137d.setText(String.valueOf(00.00));
				edittext138d.setText(String.valueOf(00.00));
				edittext139d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي L rc
*/
				edittext115d.setText(String.valueOf(00.00));
				edittext116d.setText(String.valueOf(00.00));
				edittext146d.setText(String.valueOf(00.00));
				edittext147d.setText(String.valueOf(00.00));
				edittext148d.setText(String.valueOf(00.00));
				edittext149d.setText(String.valueOf(00.00));
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
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext_am3d.setText("a.m");
				}
				else {
					edittext_am3d.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext_am3d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				/*
أبعاد القاعدة العادية
*/
				edittext36d.setText(String.valueOf(00.00));
				edittext37d.setText(String.valueOf(00.00));
				/*
أبعاد القاعدة السلحة
*/
				edittext38d.setText(String.valueOf(00.00));
				edittext39d.setText(String.valueOf(00.00));
				Safe.setVisibility(View.GONE);
				edittext76d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي B rc
*/
				edittext117d.setText(String.valueOf(00.00));
				edittext118d.setText(String.valueOf(00.00));
				edittext136d.setText(String.valueOf(00.00));
				edittext137d.setText(String.valueOf(00.00));
				edittext138d.setText(String.valueOf(00.00));
				edittext139d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي L rc
*/
				edittext115d.setText(String.valueOf(00.00));
				edittext116d.setText(String.valueOf(00.00));
				edittext146d.setText(String.valueOf(00.00));
				edittext147d.setText(String.valueOf(00.00));
				edittext148d.setText(String.valueOf(00.00));
				edittext149d.setText(String.valueOf(00.00));
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
				textview5d.setText("عمود ركن");
				edittext5d.setText("2");
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview5d.setText("عمود خارجي");
				edittext5d.setText("3");
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview5d.setText("عمود داخلي");
				edittext5d.setText("4");
			}
		});
		
		edittext_am6d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				/*
أبعاد القاعدة العادية
*/
				edittext36d.setText(String.valueOf(00.00));
				edittext37d.setText(String.valueOf(00.00));
				/*
أبعاد القاعدة السلحة
*/
				edittext38d.setText(String.valueOf(00.00));
				edittext39d.setText(String.valueOf(00.00));
				Safe.setVisibility(View.GONE);
				edittext76d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي B rc
*/
				edittext117d.setText(String.valueOf(00.00));
				edittext118d.setText(String.valueOf(00.00));
				edittext136d.setText(String.valueOf(00.00));
				edittext137d.setText(String.valueOf(00.00));
				edittext138d.setText(String.valueOf(00.00));
				edittext139d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي L rc
*/
				edittext115d.setText(String.valueOf(00.00));
				edittext116d.setText(String.valueOf(00.00));
				edittext146d.setText(String.valueOf(00.00));
				edittext147d.setText(String.valueOf(00.00));
				edittext148d.setText(String.valueOf(00.00));
				edittext149d.setText(String.valueOf(00.00));
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
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext_am6d.setText("a.m");
				}
				else {
					edittext_am6d.setText(String.valueOf(Double.parseDouble(_charSeq)));
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
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext_am8d.setText("a.m");
				}
				else {
					edittext_am8d.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
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
				final String _charSeq = _param1.toString();
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext_am11d.setText("a.m");
				}
				else {
					edittext_am11d.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext_am15d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				/*
أبعاد القاعدة العادية
*/
				edittext36d.setText(String.valueOf(00.00));
				edittext37d.setText(String.valueOf(00.00));
				/*
أبعاد القاعدة السلحة
*/
				edittext38d.setText(String.valueOf(00.00));
				edittext39d.setText(String.valueOf(00.00));
				Safe.setVisibility(View.GONE);
				edittext76d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي B rc
*/
				edittext117d.setText(String.valueOf(00.00));
				edittext118d.setText(String.valueOf(00.00));
				edittext136d.setText(String.valueOf(00.00));
				edittext137d.setText(String.valueOf(00.00));
				edittext138d.setText(String.valueOf(00.00));
				edittext139d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي L rc
*/
				edittext115d.setText(String.valueOf(00.00));
				edittext116d.setText(String.valueOf(00.00));
				edittext146d.setText(String.valueOf(00.00));
				edittext147d.setText(String.valueOf(00.00));
				edittext148d.setText(String.valueOf(00.00));
				edittext149d.setText(String.valueOf(00.00));
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
				final String _charSeq = _param1.toString();
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext_am15d.setText(String.valueOf(0.00d));
				}
				else {
					edittext_am15d.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview15d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* fcu ( kg/cm2 )\nاجهاد الخرسانة المسلحة ( كجم/سم٢ )");
				dialog.setMessage("* fcu ( kg/cm2 )\nاجهاد الخرسانة المسلحة\n( كجم/سم٢)\nمدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٢٥٠ كجم/سم٢ وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		
		edittext16d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext_am16d.setText(String.valueOf(0.00d));
				}
				else {
					edittext_am16d.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext_am17d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				/*
أبعاد القاعدة العادية
*/
				edittext36d.setText(String.valueOf(00.00));
				edittext37d.setText(String.valueOf(00.00));
				/*
أبعاد القاعدة السلحة
*/
				edittext38d.setText(String.valueOf(00.00));
				edittext39d.setText(String.valueOf(00.00));
				Safe.setVisibility(View.GONE);
				edittext76d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي B rc
*/
				edittext117d.setText(String.valueOf(00.00));
				edittext118d.setText(String.valueOf(00.00));
				edittext136d.setText(String.valueOf(00.00));
				edittext137d.setText(String.valueOf(00.00));
				edittext138d.setText(String.valueOf(00.00));
				edittext139d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي L rc
*/
				edittext115d.setText(String.valueOf(00.00));
				edittext116d.setText(String.valueOf(00.00));
				edittext146d.setText(String.valueOf(00.00));
				edittext147d.setText(String.valueOf(00.00));
				edittext148d.setText(String.valueOf(00.00));
				edittext149d.setText(String.valueOf(00.00));
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
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext_am17d.setText(String.valueOf(0.00d));
				}
				else {
					edittext_am17d.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview17d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* fy ( kg/cm2 )\nyield strength of steel\nمقاومة الخضوع لحديد التسليح (كجم / سم٢)");
				dialog.setMessage("* fy ( kg/cm2 )\nyield strength of steel\nمقاومة الخضوع لحديد التسليح\n(كجم / سم٢)\nمدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٣٦٠٠ كجم/سم٢ وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		
		edittext_am18d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				/*
أبعاد القاعدة العادية
*/
				edittext36d.setText(String.valueOf(00.00));
				edittext37d.setText(String.valueOf(00.00));
				/*
أبعاد القاعدة السلحة
*/
				edittext38d.setText(String.valueOf(00.00));
				edittext39d.setText(String.valueOf(00.00));
				Safe.setVisibility(View.GONE);
				edittext76d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي B rc
*/
				edittext117d.setText(String.valueOf(00.00));
				edittext118d.setText(String.valueOf(00.00));
				edittext136d.setText(String.valueOf(00.00));
				edittext137d.setText(String.valueOf(00.00));
				edittext138d.setText(String.valueOf(00.00));
				edittext139d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي L rc
*/
				edittext115d.setText(String.valueOf(00.00));
				edittext116d.setText(String.valueOf(00.00));
				edittext146d.setText(String.valueOf(00.00));
				edittext147d.setText(String.valueOf(00.00));
				edittext148d.setText(String.valueOf(00.00));
				edittext149d.setText(String.valueOf(00.00));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext18d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext_am18d.setText(String.valueOf(0.00d));
				}
				else {
					edittext_am18d.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview18d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* الغطاء الخرسانى لحديد التسليح (م)\nCover (m)");
				dialog.setMessage("* الغطاء الخرسانى لحديد التسليح (م)\nCover (m)\nمدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٠٧ م وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		
		edittext_am19d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				/*
أبعاد القاعدة العادية
*/
				edittext36d.setText(String.valueOf(00.00));
				edittext37d.setText(String.valueOf(00.00));
				/*
أبعاد القاعدة السلحة
*/
				edittext38d.setText(String.valueOf(00.00));
				edittext39d.setText(String.valueOf(00.00));
				Safe.setVisibility(View.GONE);
				edittext76d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي B rc
*/
				edittext117d.setText(String.valueOf(00.00));
				edittext118d.setText(String.valueOf(00.00));
				edittext136d.setText(String.valueOf(00.00));
				edittext137d.setText(String.valueOf(00.00));
				edittext138d.setText(String.valueOf(00.00));
				edittext139d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي L rc
*/
				edittext115d.setText(String.valueOf(00.00));
				edittext116d.setText(String.valueOf(00.00));
				edittext146d.setText(String.valueOf(00.00));
				edittext147d.setText(String.valueOf(00.00));
				edittext148d.setText(String.valueOf(00.00));
				edittext149d.setText(String.valueOf(00.00));
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
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext_am19d.setText(String.valueOf(0.00d));
				}
				else {
					edittext_am19d.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview19d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* Bearing Capacity Of Soil qallowable soil\n( كجم / سم2 )");
				dialog.setMessage("* Bearing Capacity Of Soil\nqallowable soil\n( كجم / سم2 )\nمدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ١.٥٠ كجم/سم٢ وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		
		edittext_am20d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				/*
أبعاد القاعدة العادية
*/
				edittext36d.setText(String.valueOf(00.00));
				edittext37d.setText(String.valueOf(00.00));
				/*
أبعاد القاعدة السلحة
*/
				edittext38d.setText(String.valueOf(00.00));
				edittext39d.setText(String.valueOf(00.00));
				Safe.setVisibility(View.GONE);
				edittext76d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي B rc
*/
				edittext117d.setText(String.valueOf(00.00));
				edittext118d.setText(String.valueOf(00.00));
				edittext136d.setText(String.valueOf(00.00));
				edittext137d.setText(String.valueOf(00.00));
				edittext138d.setText(String.valueOf(00.00));
				edittext139d.setText(String.valueOf(00.00));
				/*
اتجاه رص حديد التسليح عمودي علي L rc
*/
				edittext115d.setText(String.valueOf(00.00));
				edittext116d.setText(String.valueOf(00.00));
				edittext146d.setText(String.valueOf(00.00));
				edittext147d.setText(String.valueOf(00.00));
				edittext148d.setText(String.valueOf(00.00));
				edittext149d.setText(String.valueOf(00.00));
				if (_charSeq.equals("0")) {
					linear221d.setVisibility(View.GONE);
				}
				else {
					linear221d.setVisibility(View.VISIBLE);
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
				if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
					edittext_am20d.setText("a.m");
				}
				else {
					edittext_am20d.setText(String.valueOf(Double.parseDouble(_charSeq)));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview20d.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				dialog.setTitle("* tpc (m)\nسمك القاعدة العادية ( م )");
				dialog.setMessage("* tpc (m)\nسمك القاعدة العادية ( م )\nمدخل اختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٣٠ م وذلك عند الضغط علي زرار أحسب");
				dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dialog.create().show();
				return true;
			}
		});
		
		edittext77d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (((Double.parseDouble(edittext_am15d.getText().toString()) == 0) || (Double.parseDouble(_charSeq) == 0)) || ((Double.parseDouble(edittext43d.getText().toString()) == 0) || (Double.parseDouble(edittext32d.getText().toString()) == 0))) {
					edittext81d.setText(String.valueOf(Double.parseDouble("0")));
				}
				else {
					edittext81d.setText(String.valueOf((Double.parseDouble(_charSeq) * 100) / Math.sqrt((Double.parseDouble(edittext43d.getText().toString()) * 100000) / (Double.parseDouble(edittext_am15d.getText().toString()) * (Double.parseDouble(edittext32d.getText().toString()) * 100)))));
				}
				if (((Double.parseDouble(edittext_am15d.getText().toString()) == 0) || (Double.parseDouble(_charSeq) == 0)) || ((Double.parseDouble(edittext45d.getText().toString()) == 0) || (Double.parseDouble(edittext31d.getText().toString()) == 0))) {
					edittext86d.setText(String.valueOf(Double.parseDouble("0")));
				}
				else {
					edittext86d.setText(String.valueOf((Double.parseDouble(_charSeq) * 100) / Math.sqrt((Double.parseDouble(edittext45d.getText().toString()) * 100000) / (Double.parseDouble(edittext_am15d.getText().toString()) * (Double.parseDouble(edittext31d.getText().toString()) * 100)))));
				}
				if (((Double.parseDouble(edittext_am17d.getText().toString()) == 0) || (Double.parseDouble(_charSeq) == 0)) || ((Double.parseDouble(edittext43d.getText().toString()) == 0) || (Double.parseDouble(edittext82d.getText().toString()) == 0))) {
					edittext83d.setText(String.valueOf(Double.parseDouble("0")));
				}
				else {
					edittext83d.setText(String.valueOf((Double.parseDouble(edittext43d.getText().toString()) * 100000) / (Double.parseDouble(edittext_am17d.getText().toString()) * ((Double.parseDouble(_charSeq) * 100) * Double.parseDouble(edittext82d.getText().toString())))));
				}
				if (((Double.parseDouble(edittext_am17d.getText().toString()) == 0) || (Double.parseDouble(_charSeq) == 0)) || ((Double.parseDouble(edittext45d.getText().toString()) == 0) || (Double.parseDouble(edittext87d.getText().toString()) == 0))) {
					edittext88d.setText(String.valueOf(Double.parseDouble("0")));
				}
				else {
					edittext88d.setText(String.valueOf((Double.parseDouble(edittext45d.getText().toString()) * 100000) / (Double.parseDouble(edittext_am17d.getText().toString()) * ((Double.parseDouble(_charSeq) * 100) * Double.parseDouble(edittext87d.getText().toString())))));
				}
				if ((1.5d * (Double.parseDouble(_charSeq) * 100)) < 5.65d) {
					edittext92d.setText(String.valueOf(1.5d * (Double.parseDouble(_charSeq) * 100)));
				}
				else {
					edittext92d.setText(String.valueOf(Double.parseDouble("5.65")));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext84d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((Double.parseDouble(edittext92d.getText().toString()) == 0) || (Double.parseDouble(_charSeq) == 0)) {
					edittext97d.setText(String.valueOf(Double.parseDouble("0")));
				}
				else {
					if (Double.parseDouble(edittext92d.getText().toString()) > Double.parseDouble(_charSeq)) {
						edittext97d.setText(String.valueOf(Double.parseDouble(edittext92d.getText().toString())));
					}
					else {
						edittext97d.setText(String.valueOf(Double.parseDouble(_charSeq)));
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
		
		edittext89d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((Double.parseDouble(edittext92d.getText().toString()) == 0) || (Double.parseDouble(_charSeq) == 0)) {
					edittext101d.setText(String.valueOf(Double.parseDouble("0")));
				}
				else {
					if (Double.parseDouble(edittext92d.getText().toString()) > Double.parseDouble(_charSeq)) {
						edittext101d.setText(String.valueOf(Double.parseDouble(edittext92d.getText().toString())));
					}
					else {
						edittext101d.setText(String.valueOf(Double.parseDouble(_charSeq)));
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
		
		edittext92d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((Double.parseDouble(_charSeq) == 0) || (Double.parseDouble(edittext84d.getText().toString()) == 0)) {
					edittext97d.setText(String.valueOf(Double.parseDouble("0")));
				}
				else {
					if (Double.parseDouble(_charSeq) > Double.parseDouble(edittext84d.getText().toString())) {
						edittext97d.setText(String.valueOf(Double.parseDouble(_charSeq)));
					}
					else {
						edittext97d.setText(String.valueOf(Double.parseDouble(edittext84d.getText().toString())));
					}
				}
				if ((Double.parseDouble(_charSeq) == 0) || (Double.parseDouble(edittext89d.getText().toString()) == 0)) {
					edittext101d.setText(String.valueOf(Double.parseDouble("0")));
				}
				else {
					if (Double.parseDouble(_charSeq) > Double.parseDouble(edittext89d.getText().toString())) {
						edittext101d.setText(String.valueOf(Double.parseDouble(_charSeq)));
					}
					else {
						edittext101d.setText(String.valueOf(Double.parseDouble(edittext89d.getText().toString())));
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
		
		edittext97d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((Double.parseDouble(_charSeq) == 0) || (Double.parseDouble(edittext116d.getText().toString()) == 0)) {
					edittext120d.setText(String.valueOf(Double.parseDouble("0")));
				}
				else {
					edittext120d.setText(String.valueOf(Math.ceil(Double.parseDouble(_charSeq) / Double.parseDouble(edittext116d.getText().toString()))));
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
				if ((Double.parseDouble(_charSeq) == 0) || (Double.parseDouble(edittext118d.getText().toString()) == 0)) {
					edittext124d.setText(String.valueOf(Double.parseDouble("0")));
				}
				else {
					edittext124d.setText(String.valueOf(Math.ceil(Double.parseDouble(_charSeq) / Double.parseDouble(edittext118d.getText().toString()))));
				}
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
				button44d.setVisibility(View.VISIBLE);
				textview555.setVisibility(View.GONE);
				linear444d.setVisibility(View.GONE);
				/*
قطر ومساحة مقطع الحديد
*/
				edittext115d.setText(String.valueOf(00.00));
				edittext116d.setText(String.valueOf(00.00));
				edittext117d.setText(String.valueOf(00.00));
				edittext118d.setText(String.valueOf(00.00));
			}
		});
		
		button51d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext117d.setText(String.valueOf((long)(20)));
				edittext118d.setText(String.valueOf(3.14));
			}
		});
		
		button50d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext117d.setText(String.valueOf((long)(18)));
				edittext118d.setText(String.valueOf(2.54));
			}
		});
		
		button49d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext117d.setText(String.valueOf((long)(16)));
				edittext118d.setText(String.valueOf(2.01));
			}
		});
		
		button48d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext117d.setText(String.valueOf((long)(14)));
				edittext118d.setText(String.valueOf(1.54));
			}
		});
		
		button47d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext117d.setText(String.valueOf((long)(12)));
				edittext118d.setText(String.valueOf(1.13));
			}
		});
		
		button56d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext117d.setText(String.valueOf((long)(38)));
				edittext118d.setText(String.valueOf(11.34));
			}
		});
		
		button55d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext117d.setText(String.valueOf((long)(32)));
				edittext118d.setText(String.valueOf(8.04));
			}
		});
		
		button54d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext117d.setText(String.valueOf((long)(28)));
				edittext118d.setText(String.valueOf(6.16));
			}
		});
		
		button53d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext117d.setText(String.valueOf((long)(25)));
				edittext118d.setText(String.valueOf(4.91));
			}
		});
		
		button52d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext117d.setText(String.valueOf((long)(22)));
				edittext118d.setText(String.valueOf(3.80));
			}
		});
		
		edittext124d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(_charSeq) == 0) {
					edittext131d.setText(String.valueOf(Double.parseDouble("0")));
					edittext133d.setText(String.valueOf(Double.parseDouble(_charSeq)));
					linear133d.setVisibility(View.GONE);
				}
				else {
					if (Double.parseDouble(_charSeq) < 5) {
						edittext131d.setText(String.valueOf(Double.parseDouble("5")));
						edittext133d.setText(String.valueOf(Double.parseDouble(_charSeq)));
						linear133d.setVisibility(View.GONE);
					}
					else {
						if (Double.parseDouble(_charSeq) > 10) {
							edittext131d.setText("error");
							edittext134d.setText("error");
							edittext133d.setText(String.valueOf(Double.parseDouble(_charSeq)));
							linear133d.setVisibility(View.VISIBLE);
						}
						else {
							edittext131d.setText(String.valueOf(Double.parseDouble(_charSeq)));
							edittext133d.setText(String.valueOf(Double.parseDouble(_charSeq)));
							linear133d.setVisibility(View.GONE);
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
		
		edittext126d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((Double.parseDouble(edittext124d.getText().toString()) > 10) || _charSeq.equals("error")) {
					edittext134d.setText("error");
				}
				else {
					if (Double.parseDouble(_charSeq) == 0) {
						edittext134d.setText(String.valueOf(Double.parseDouble("0")));
					}
					else {
						if (Double.parseDouble(_charSeq) > 5) {
							edittext134d.setText(String.valueOf(Math.ceil(Double.parseDouble(_charSeq) + 1)));
						}
						else {
							edittext134d.setText(String.valueOf(6));
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
		
		edittext117d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(_charSeq) == 0) {
					edittext132d.setText(String.valueOf((long)(Double.parseDouble("0"))));
					edittext135d.setText(String.valueOf((long)(Double.parseDouble("0"))));
					edittext132d.setTextColor(0xFFE91E63);
					edittext135d.setTextColor(0xFFE91E63);
				}
				else {
					edittext132d.setText(String.valueOf((long)(Double.parseDouble(_charSeq))));
					edittext135d.setText(String.valueOf((long)(Double.parseDouble(_charSeq))));
					edittext132d.setTextColor(0xFF000000);
					edittext135d.setTextColor(0xFF000000);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext118d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((Double.parseDouble(edittext101d.getText().toString()) == 0) || (Double.parseDouble(_charSeq) == 0)) {
					edittext124d.setText(String.valueOf(Double.parseDouble("0")));
				}
				else {
					edittext124d.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext101d.getText().toString()) / Double.parseDouble(_charSeq))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext131d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.equals("error")) {
					edittext126d.setText("error");
				}
				else {
					if ((Double.parseDouble(_charSeq) == 0) || (Double.parseDouble(edittext31d.getText().toString()) == 0)) {
						edittext126d.setText(String.valueOf(Double.parseDouble("0")));
					}
					else {
						edittext126d.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext31d.getText().toString())));
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
		
		button67d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext115d.setText(String.valueOf((long)(20)));
				edittext116d.setText(String.valueOf(3.14));
			}
		});
		
		button66d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext115d.setText(String.valueOf((long)(18)));
				edittext116d.setText(String.valueOf(2.54));
			}
		});
		
		button65d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext115d.setText(String.valueOf((long)(16)));
				edittext116d.setText(String.valueOf(2.01));
			}
		});
		
		button64d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext115d.setText(String.valueOf((long)(14)));
				edittext116d.setText(String.valueOf(1.54));
			}
		});
		
		button63d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext115d.setText(String.valueOf((long)(12)));
				edittext116d.setText(String.valueOf(1.13));
			}
		});
		
		button72d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext115d.setText(String.valueOf((long)(38)));
				edittext116d.setText(String.valueOf(11.34));
			}
		});
		
		button71d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext115d.setText(String.valueOf((long)(32)));
				edittext116d.setText(String.valueOf(8.04));
			}
		});
		
		button70d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext115d.setText(String.valueOf((long)(28)));
				edittext116d.setText(String.valueOf(6.16));
			}
		});
		
		button69d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext115d.setText(String.valueOf((long)(25)));
				edittext116d.setText(String.valueOf(4.91));
			}
		});
		
		button68d.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext115d.setText(String.valueOf((long)(22)));
				edittext116d.setText(String.valueOf(3.80));
			}
		});
		
		edittext120d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(_charSeq) == 0) {
					edittext141d.setText(String.valueOf(Double.parseDouble("0")));
					edittext143d.setText(String.valueOf(Double.parseDouble(_charSeq)));
					linear143d.setVisibility(View.GONE);
				}
				else {
					if (Double.parseDouble(_charSeq) < 5) {
						edittext141d.setText(String.valueOf(Double.parseDouble("5")));
						edittext143d.setText(String.valueOf(Double.parseDouble(_charSeq)));
						linear143d.setVisibility(View.GONE);
					}
					else {
						if (Double.parseDouble(_charSeq) > 10) {
							edittext141d.setText("error");
							edittext144d.setText("error");
							edittext143d.setText(String.valueOf(Double.parseDouble(_charSeq)));
							linear143d.setVisibility(View.VISIBLE);
						}
						else {
							edittext141d.setText(String.valueOf(Double.parseDouble(_charSeq)));
							edittext143d.setText(String.valueOf(Double.parseDouble(_charSeq)));
							linear143d.setVisibility(View.GONE);
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
		
		edittext122d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((Double.parseDouble(edittext120d.getText().toString()) > 10) || _charSeq.equals("error")) {
					edittext144d.setText("error");
				}
				else {
					if (Double.parseDouble(_charSeq) == 0) {
						edittext144d.setText(String.valueOf(Double.parseDouble("0")));
					}
					else {
						if (Double.parseDouble(_charSeq) > 5) {
							edittext144d.setText(String.valueOf(Math.ceil(Double.parseDouble(_charSeq) + 1)));
						}
						else {
							edittext144d.setText(String.valueOf(6));
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
		
		edittext115d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (Double.parseDouble(_charSeq) == 0) {
					edittext142d.setText(String.valueOf((long)(Double.parseDouble("0"))));
					edittext145d.setText(String.valueOf((long)(Double.parseDouble("0"))));
					edittext142d.setTextColor(0xFFE91E63);
					edittext145d.setTextColor(0xFFE91E63);
				}
				else {
					edittext142d.setText(String.valueOf((long)(Double.parseDouble(_charSeq))));
					edittext145d.setText(String.valueOf((long)(Double.parseDouble(_charSeq))));
					edittext142d.setTextColor(0xFF000000);
					edittext145d.setTextColor(0xFF000000);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext116d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if ((Double.parseDouble(_charSeq) == 0) || (Double.parseDouble(edittext97d.getText().toString()) == 0)) {
					edittext120d.setText(String.valueOf(Double.parseDouble("0")));
				}
				else {
					edittext120d.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext97d.getText().toString()) / Double.parseDouble(_charSeq))));
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext141d.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (_charSeq.equals("error")) {
					edittext122d.setText("error");
				}
				else {
					if ((Double.parseDouble(edittext32d.getText().toString()) == 0) || (Double.parseDouble(_charSeq) == 0)) {
						edittext122d.setText(String.valueOf(Double.parseDouble("0")));
					}
					else {
						edittext122d.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext32d.getText().toString())));
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
	}
	
	private void initializeLogic() {
		
		{
		}
		/*
Hidden edittexts
*/
		edittext_am3d.setVisibility(View.GONE);
		edittext_am4d.setVisibility(View.GONE);
		edittext_am6d.setVisibility(View.GONE);
		edittext_am8d.setVisibility(View.GONE);
		edittext_am11d.setVisibility(View.GONE);
		edittext_am15d.setVisibility(View.GONE);
		edittext_am16d.setVisibility(View.GONE);
		edittext_am17d.setVisibility(View.GONE);
		edittext_am18d.setVisibility(View.GONE);
		edittext_am19d.setVisibility(View.GONE);
		edittext_am20d.setVisibility(View.GONE);
		edittext23d.setVisibility(View.GONE);
		edittext75d.setVisibility(View.GONE);
		Safe.setVisibility(View.GONE);
		/*
Hidden linears
*/
		linear197d.setVisibility(View.GONE);
		textview99.setVisibility(View.GONE);
		linear199d.setVisibility(View.GONE);
		linear7d.setVisibility(View.GONE);
		linear112d.setVisibility(View.GONE);
		linear223d.setVisibility(View.GONE);
		linear224d.setVisibility(View.GONE);
		linear225d.setVisibility(View.GONE);
		linear226d.setVisibility(View.GONE);
		linear133d.setVisibility(View.GONE);
		linear143d.setVisibility(View.GONE);
		linear16d.setVisibility(View.GONE);
		hscroll213.setVisibility(View.GONE);
		/*
قطر ومساحة مقطع السيخ
*/
		linear333d.setVisibility(View.GONE);
		linear334d.setVisibility(View.GONE);
		textview555.setVisibility(View.GONE);
		linear444d.setVisibility(View.GONE);
		/*
ثالثآ البيانات الخاصة بالعزوم المنقولة من العمود الي القاعدة
*/
		linear198d.setVisibility(View.GONE);
		linear111d.setVisibility(View.GONE);
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
	public String _English_Decimal_Format(final double _number) {
		return (String.format(Locale.ENGLISH,"%.02f", _number));
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
		PrintHelper printHelper = new PrintHelper(DipsdDesignOfIsolatedFootingsActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
}
