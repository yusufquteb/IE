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


public class ToipccEjectionLinePriceAndStudyssActivity extends AppCompatActivity {
	
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
	private LinearLayout linear120;
	private TextView textview898;
	private LinearLayout linear446;
	private TextView textview897;
	private LinearLayout linear454;
	private LinearLayout linear487;
	private TextView textview902;
	private LinearLayout linear202;
	private TextView textview1044;
	private Button button74;
	private LinearLayout linear537;
	private LinearLayout linear623;
	private TextView textview907;
	private Button button117;
	private LinearLayout linear640;
	private TextView textview1224;
	private Button button75;
	private LinearLayout linear467;
	private TextView textview941;
	private Button button123;
	private LinearLayout linear664;
	private Button button76;
	private LinearLayout linear458;
	private TextView textview956;
	private Button button77;
	private LinearLayout linear525;
	private LinearLayout linear576;
	private TextView textview976;
	private Button button88;
	private LinearLayout linear577;
	private TextView textview957;
	private Button button89;
	private LinearLayout linear581;
	private TextView textview1154;
	private Button button102;
	private LinearLayout linear585;
	private TextView textview1159;
	private Button button108;
	private LinearLayout linear609;
	private TextView textview1184;
	private Button button103;
	private LinearLayout linear589;
	private TextView textview1164;
	private Button button104;
	private LinearLayout linear593;
	private TextView textview1181;
	private Button button121;
	private LinearLayout linear656;
	private TextView textview1245;
	private Button button122;
	private LinearLayout linear660;
	private TextView textview1246;
	private Button button120;
	private LinearLayout linear652;
	private TextView textview1240;
	private Button button105;
	private LinearLayout linear597;
	private TextView textview1182;
	private Button button118;
	private LinearLayout linear644;
	private TextView textview1229;
	private Button button119;
	private TextView textview1230;
	private LinearLayout linear648;
	private TextView textview1235;
	private Button button106;
	private LinearLayout linear601;
	private TextView textview1183;
	private Button button107;
	private LinearLayout linear605;
	private TextView textview1189;
	private Button button109;
	private LinearLayout linear613;
	private TextView textview1194;
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
	private Button button124;
	private TextView textview809;
	private TextView textview467;
	private EditText edittext31;
	private TextView textview334;
	private EditText edittext30;
	private LinearLayout linear507;
	private HorizontalScrollView hscroll6;
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
	private HorizontalScrollView hscroll8;
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
	private HorizontalScrollView hscroll9;
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
	private HorizontalScrollView hscroll12;
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
	private HorizontalScrollView hscroll14;
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
	private HorizontalScrollView hscroll15;
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
	private TextView textview531;
	private EditText edittext2;
	private TextView textview532;
	private TextView textview533;
	private LinearLayout linear447;
	private LinearLayout linear448;
	private TextView textview893;
	private EditText edittext3;
	private TextView textview894;
	private EditText edittext152;
	private TextView textview895;
	private EditText edittext4;
	private TextView textview896;
	private EditText edittext154;
	private LinearLayout linear455;
	private LinearLayout linear456;
	private LinearLayout linear457;
	private TextView textview912;
	private EditText edittext5;
	private TextView textview913;
	private TextView textview914;
	private TextView textview915;
	private EditText edittext6;
	private TextView textview916;
	private TextView textview917;
	private TextView textview918;
	private EditText edittext7;
	private TextView textview919;
	private TextView textview920;
	private Button button65;
	private LinearLayout linear218;
	private TextView textview921;
	private LinearLayout linear205;
	private TextView textview644;
	private LinearLayout linear203;
	private TextView textview996;
	private EditText edittext10;
	private TextView textview643;
	private EditText edittext9;
	private TextView textview641;
	private EditText edittext8;
	private Button button81;
	private Button button82;
	private LinearLayout linear519;
	private HorizontalScrollView hscroll40;
	private LinearLayout linear526;
	private TextView textview1048;
	private LinearLayout linear449;
	private ImageView imageview12;
	private LinearLayout linear520;
	private TextView textview1201;
	private TextView textview1046;
	private LinearLayout linear529;
	private HorizontalScrollView hscroll39;
	private LinearLayout linear527;
	private TextView textview1051;
	private EditText edittext155;
	private TextView textview1050;
	private TextView textview1054;
	private TextView textview1058;
	private EditText edittext157;
	private TextView textview1059;
	private TextView textview1060;
	private TextView textview901;
	private LinearLayout linear450;
	private LinearLayout linear452;
	private TextView textview906;
	private LinearLayout linear486;
	private HorizontalScrollView hscroll38;
	private LinearLayout linear144;
	private TextView textview908;
	private LinearLayout linear453;
	private TextView textview903;
	private EditText edittext101;
	private TextView textview904;
	private TextView textview905;
	private Button button61;
	private TextView textview994;
	private EditText edittext104;
	private TextView textview995;
	private TextView textview657;
	private TextView textview601;
	private EditText edittext105;
	private TextView textview602;
	private TextView textview603;
	private TextView textview909;
	private EditText edittext106;
	private TextView textview910;
	private TextView textview911;
	private LinearLayout linear641;
	private HorizontalScrollView hscroll16;
	private LinearLayout linear642;
	private ImageView imageview33;
	private LinearLayout linear643;
	private TextView textview1220;
	private TextView textview1221;
	private EditText edittext190;
	private TextView textview1222;
	private TextView textview1223;
	private LinearLayout linear521;
	private HorizontalScrollView hscroll17;
	private LinearLayout linear468;
	private ImageView imageview13;
	private LinearLayout linear522;
	private TextView textview940;
	private TextView textview952;
	private EditText edittext107;
	private TextView textview953;
	private TextView textview954;
	private LinearLayout linear665;
	private HorizontalScrollView hscroll19;
	private LinearLayout linear666;
	private ImageView imageview39;
	private LinearLayout linear667;
	private TextView textview1251;
	private TextView textview1252;
	private EditText edittext197;
	private TextView textview1253;
	private TextView textview1254;
	private LinearLayout linear523;
	private HorizontalScrollView hscroll20;
	private LinearLayout linear459;
	private LinearLayout linear460;
	private TextView textview924;
	private TextView textview922;
	private LinearLayout linear462;
	private TextView textview973;
	private LinearLayout linear479;
	private TextView textview978;
	private LinearLayout linear484;
	private TextView textview925;
	private LinearLayout linear463;
	private ImageView imageview14;
	private LinearLayout linear524;
	private TextView textview974;
	private TextView textview934;
	private EditText edittext108;
	private TextView textview935;
	private TextView textview936;
	private Button button62;
	private TextView textview931;
	private EditText edittext109;
	private TextView textview932;
	private TextView textview933;
	private TextView textview982;
	private EditText edittext110;
	private TextView textview983;
	private TextView textview984;
	private TextView textview981;
	private EditText edittext111;
	private TextView textview977;
	private TextView textview979;
	private TextView textview937;
	private EditText edittext112;
	private TextView textview938;
	private TextView textview939;
	private Button button78;
	private LinearLayout linear538;
	private Button button79;
	private Button button83;
	private Button button84;
	private LinearLayout linear553;
	private HorizontalScrollView hscroll37;
	private LinearLayout linear539;
	private TextView textview1082;
	private LinearLayout linear552;
	private TextView textview1110;
	private LinearLayout linear564;
	private TextView textview1016;
	private LinearLayout linear497;
	private TextView textview1142;
	private LinearLayout linear475;
	private TextView textview1037;
	private LinearLayout linear469;
	private ImageView imageview17;
	private LinearLayout linear561;
	private TextView textview1103;
	private TextView textview1139;
	private LinearLayout linear562;
	private TextView textview1211;
	private LinearLayout linear549;
	private TextView textview1209;
	private LinearLayout linear574;
	private TextView textview1210;
	private LinearLayout linear540;
	private LinearLayout linear541;
	private TextView textview1208;
	private LinearLayout linear548;
	private TextView textview1207;
	private LinearLayout linear542;
	private TextView textview1063;
	private LinearLayout linear543;
	private TextView textview1064;
	private LinearLayout linear544;
	private TextView textview1104;
	private EditText edittext94;
	private TextView textview1105;
	private TextView textview1106;
	private TextView textview1067;
	private EditText edittext103;
	private TextView textview1062;
	private TextView textview1068;
	private TextView textview1132;
	private EditText edittext175;
	private TextView textview1133;
	private TextView textview1134;
	private TextView textview1073;
	private EditText edittext160;
	private TextView textview1074;
	private TextView textview1075;
	private Button button85;
	private TextView textview1066;
	private EditText edittext158;
	private TextView textview1065;
	private TextView textview1069;
	private TextView textview1081;
	private EditText edittext102;
	private TextView textview1080;
	private TextView textview1079;
	private TextView textview1070;
	private EditText edittext159;
	private TextView textview1071;
	private TextView textview1072;
	private TextView textview1076;
	private EditText edittext161;
	private TextView textview1077;
	private TextView textview1078;
	private TextView textview1138;
	private LinearLayout linear563;
	private TextView textview1217;
	private LinearLayout linear554;
	private TextView textview1216;
	private LinearLayout linear575;
	private TextView textview1215;
	private LinearLayout linear555;
	private LinearLayout linear556;
	private TextView textview1213;
	private LinearLayout linear557;
	private TextView textview1212;
	private LinearLayout linear558;
	private TextView textview1083;
	private LinearLayout linear559;
	private TextView textview1084;
	private LinearLayout linear560;
	private TextView textview1107;
	private EditText edittext168;
	private TextView textview1108;
	private TextView textview1109;
	private TextView textview1085;
	private EditText edittext162;
	private TextView textview1086;
	private TextView textview1087;
	private TextView textview1135;
	private EditText edittext176;
	private TextView textview1136;
	private TextView textview1137;
	private TextView textview1088;
	private EditText edittext163;
	private TextView textview1089;
	private TextView textview1090;
	private Button button86;
	private TextView textview1091;
	private EditText edittext164;
	private TextView textview1092;
	private TextView textview1093;
	private TextView textview1094;
	private EditText edittext165;
	private TextView textview1095;
	private TextView textview1096;
	private TextView textview1097;
	private EditText edittext166;
	private TextView textview1098;
	private TextView textview1099;
	private TextView textview1100;
	private EditText edittext167;
	private TextView textview1101;
	private TextView textview1102;
	private TextView textview1131;
	private LinearLayout linear566;
	private TextView textview1218;
	private LinearLayout linear567;
	private LinearLayout linear568;
	private TextView textview1140;
	private LinearLayout linear569;
	private TextView textview1111;
	private LinearLayout linear572;
	private TextView textview1113;
	private EditText edittext169;
	private TextView textview1114;
	private TextView textview1115;
	private TextView textview1116;
	private EditText edittext170;
	private TextView textview1117;
	private TextView textview1118;
	private Button button87;
	private TextView textview1119;
	private EditText edittext171;
	private TextView textview1120;
	private TextView textview1121;
	private TextView textview1128;
	private EditText edittext174;
	private TextView textview1129;
	private TextView textview1130;
	private TextView textview1015;
	private LinearLayout linear498;
	private LinearLayout linear499;
	private TextView textview1017;
	private LinearLayout linear506;
	private TextView textview1141;
	private LinearLayout linear501;
	private TextView textview1018;
	private LinearLayout linear502;
	private TextView textview1027;
	private EditText edittext120;
	private TextView textview1028;
	private TextView textview1029;
	private Button button67;
	private TextView textview1033;
	private EditText edittext119;
	private TextView textview1034;
	private TextView textview1035;
	private TextView textview1024;
	private EditText edittext121;
	private TextView textview1025;
	private TextView textview1026;
	private TextView textview1030;
	private EditText edittext122;
	private TextView textview1031;
	private TextView textview1032;
	private TextView textview980;
	private LinearLayout linear476;
	private LinearLayout linear477;
	private TextView textview975;
	private LinearLayout linear485;
	private TextView textview1143;
	private LinearLayout linear480;
	private TextView textview985;
	private EditText edittext116;
	private TextView textview986;
	private TextView textview987;
	private Button button64;
	private TextView textview991;
	private EditText edittext117;
	private TextView textview992;
	private TextView textview993;
	private TextView textview988;
	private EditText edittext118;
	private TextView textview989;
	private TextView textview990;
	private TextView textview955;
	private LinearLayout linear470;
	private LinearLayout linear471;
	private TextView textview958;
	private LinearLayout linear473;
	private TextView textview1144;
	private LinearLayout linear474;
	private TextView textview967;
	private EditText edittext114;
	private TextView textview968;
	private TextView textview969;
	private Button button63;
	private TextView textview964;
	private EditText edittext113;
	private TextView textview965;
	private TextView textview966;
	private TextView textview970;
	private EditText edittext115;
	private TextView textview971;
	private TextView textview972;
	private LinearLayout linear578;
	private HorizontalScrollView hscroll21;
	private LinearLayout linear389;
	private ImageView imageview18;
	private LinearLayout linear580;
	private TextView textview1145;
	private TextView textview817;
	private EditText edittext63;
	private TextView textview818;
	private EditText edittext62;
	private LinearLayout linear582;
	private HorizontalScrollView hscroll23;
	private LinearLayout linear583;
	private ImageView imageview19;
	private LinearLayout linear584;
	private TextView textview1150;
	private TextView textview1151;
	private EditText edittext178;
	private TextView textview1152;
	private TextView textview1153;
	private LinearLayout linear586;
	private HorizontalScrollView hscroll22;
	private LinearLayout linear587;
	private ImageView imageview20;
	private LinearLayout linear588;
	private TextView textview1155;
	private TextView textview1156;
	private EditText edittext179;
	private TextView textview1157;
	private TextView textview1158;
	private LinearLayout linear610;
	private HorizontalScrollView hscroll24;
	private LinearLayout linear611;
	private ImageView imageview26;
	private LinearLayout linear612;
	private TextView textview1185;
	private TextView textview1186;
	private EditText edittext185;
	private TextView textview1187;
	private TextView textview1188;
	private LinearLayout linear590;
	private HorizontalScrollView hscroll25;
	private LinearLayout linear591;
	private ImageView imageview21;
	private LinearLayout linear592;
	private TextView textview1160;
	private TextView textview1161;
	private EditText edittext180;
	private TextView textview1162;
	private TextView textview1163;
	private LinearLayout linear594;
	private HorizontalScrollView hscroll26;
	private LinearLayout linear595;
	private ImageView imageview22;
	private LinearLayout linear596;
	private TextView textview1165;
	private TextView textview1166;
	private EditText edittext181;
	private TextView textview1167;
	private TextView textview1168;
	private LinearLayout linear657;
	private HorizontalScrollView hscroll27;
	private LinearLayout linear658;
	private ImageView imageview37;
	private LinearLayout linear659;
	private TextView textview1241;
	private TextView textview1242;
	private EditText edittext195;
	private TextView textview1243;
	private TextView textview1244;
	private LinearLayout linear661;
	private HorizontalScrollView hscroll28;
	private LinearLayout linear662;
	private ImageView imageview38;
	private LinearLayout linear663;
	private TextView textview1247;
	private TextView textview1248;
	private EditText edittext196;
	private TextView textview1249;
	private TextView textview1250;
	private LinearLayout linear653;
	private HorizontalScrollView hscroll29;
	private LinearLayout linear654;
	private ImageView imageview36;
	private LinearLayout linear655;
	private TextView textview1236;
	private TextView textview1237;
	private EditText edittext194;
	private TextView textview1238;
	private TextView textview1239;
	private LinearLayout linear598;
	private HorizontalScrollView hscroll30;
	private LinearLayout linear599;
	private ImageView imageview23;
	private LinearLayout linear600;
	private TextView textview1169;
	private TextView textview1170;
	private EditText edittext182;
	private TextView textview1171;
	private TextView textview1172;
	private LinearLayout linear645;
	private HorizontalScrollView hscroll31;
	private LinearLayout linear646;
	private ImageView imageview34;
	private LinearLayout linear647;
	private TextView textview1225;
	private TextView textview1226;
	private EditText edittext191;
	private TextView textview1227;
	private TextView textview1228;
	private LinearLayout linear649;
	private HorizontalScrollView hscroll33;
	private LinearLayout linear650;
	private ImageView imageview35;
	private LinearLayout linear651;
	private TextView textview1231;
	private TextView textview1232;
	private EditText edittext192;
	private TextView textview1233;
	private TextView textview1234;
	private LinearLayout linear602;
	private HorizontalScrollView hscroll36;
	private LinearLayout linear603;
	private ImageView imageview24;
	private LinearLayout linear604;
	private TextView textview1173;
	private TextView textview1174;
	private EditText edittext183;
	private TextView textview1175;
	private TextView textview1176;
	private LinearLayout linear606;
	private HorizontalScrollView hscroll35;
	private LinearLayout linear607;
	private ImageView imageview25;
	private LinearLayout linear608;
	private TextView textview1177;
	private TextView textview1178;
	private EditText edittext184;
	private TextView textview1179;
	private TextView textview1180;
	private LinearLayout linear614;
	private HorizontalScrollView hscroll34;
	private LinearLayout linear615;
	private ImageView imageview27;
	private LinearLayout linear616;
	private TextView textview1190;
	private TextView textview1191;
	private EditText edittext186;
	private TextView textview1192;
	private TextView textview1193;
	private LinearLayout linear618;
	private HorizontalScrollView hscroll5;
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
	private HorizontalScrollView hscroll4;
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
	private HorizontalScrollView hscroll3;
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
	private HorizontalScrollView hscroll1;
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
	private TextView textview1219;
	private EditText edittext88;
	private TextView textview886;
	private LinearLayout linear438;
	private TextView textview885;
	private EditText edittext89;
	
	private RequestNetwork internet;
	private RequestNetwork.RequestListener _internet_request_listener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.toipcc_ejection_line_price_and_studyss);
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
		linear120 = findViewById(R.id.linear120);
		textview898 = findViewById(R.id.textview898);
		linear446 = findViewById(R.id.linear446);
		textview897 = findViewById(R.id.textview897);
		linear454 = findViewById(R.id.linear454);
		linear487 = findViewById(R.id.linear487);
		textview902 = findViewById(R.id.textview902);
		linear202 = findViewById(R.id.linear202);
		textview1044 = findViewById(R.id.textview1044);
		button74 = findViewById(R.id.button74);
		linear537 = findViewById(R.id.linear537);
		linear623 = findViewById(R.id.linear623);
		textview907 = findViewById(R.id.textview907);
		button117 = findViewById(R.id.button117);
		linear640 = findViewById(R.id.linear640);
		textview1224 = findViewById(R.id.textview1224);
		button75 = findViewById(R.id.button75);
		linear467 = findViewById(R.id.linear467);
		textview941 = findViewById(R.id.textview941);
		button123 = findViewById(R.id.button123);
		linear664 = findViewById(R.id.linear664);
		button76 = findViewById(R.id.button76);
		linear458 = findViewById(R.id.linear458);
		textview956 = findViewById(R.id.textview956);
		button77 = findViewById(R.id.button77);
		linear525 = findViewById(R.id.linear525);
		linear576 = findViewById(R.id.linear576);
		textview976 = findViewById(R.id.textview976);
		button88 = findViewById(R.id.button88);
		linear577 = findViewById(R.id.linear577);
		textview957 = findViewById(R.id.textview957);
		button89 = findViewById(R.id.button89);
		linear581 = findViewById(R.id.linear581);
		textview1154 = findViewById(R.id.textview1154);
		button102 = findViewById(R.id.button102);
		linear585 = findViewById(R.id.linear585);
		textview1159 = findViewById(R.id.textview1159);
		button108 = findViewById(R.id.button108);
		linear609 = findViewById(R.id.linear609);
		textview1184 = findViewById(R.id.textview1184);
		button103 = findViewById(R.id.button103);
		linear589 = findViewById(R.id.linear589);
		textview1164 = findViewById(R.id.textview1164);
		button104 = findViewById(R.id.button104);
		linear593 = findViewById(R.id.linear593);
		textview1181 = findViewById(R.id.textview1181);
		button121 = findViewById(R.id.button121);
		linear656 = findViewById(R.id.linear656);
		textview1245 = findViewById(R.id.textview1245);
		button122 = findViewById(R.id.button122);
		linear660 = findViewById(R.id.linear660);
		textview1246 = findViewById(R.id.textview1246);
		button120 = findViewById(R.id.button120);
		linear652 = findViewById(R.id.linear652);
		textview1240 = findViewById(R.id.textview1240);
		button105 = findViewById(R.id.button105);
		linear597 = findViewById(R.id.linear597);
		textview1182 = findViewById(R.id.textview1182);
		button118 = findViewById(R.id.button118);
		linear644 = findViewById(R.id.linear644);
		textview1229 = findViewById(R.id.textview1229);
		button119 = findViewById(R.id.button119);
		textview1230 = findViewById(R.id.textview1230);
		linear648 = findViewById(R.id.linear648);
		textview1235 = findViewById(R.id.textview1235);
		button106 = findViewById(R.id.button106);
		linear601 = findViewById(R.id.linear601);
		textview1183 = findViewById(R.id.textview1183);
		button107 = findViewById(R.id.button107);
		linear605 = findViewById(R.id.linear605);
		textview1189 = findViewById(R.id.textview1189);
		button109 = findViewById(R.id.button109);
		linear613 = findViewById(R.id.linear613);
		textview1194 = findViewById(R.id.textview1194);
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
		button124 = findViewById(R.id.button124);
		textview809 = findViewById(R.id.textview809);
		textview467 = findViewById(R.id.textview467);
		edittext31 = findViewById(R.id.edittext31);
		textview334 = findViewById(R.id.textview334);
		edittext30 = findViewById(R.id.edittext30);
		linear507 = findViewById(R.id.linear507);
		hscroll6 = findViewById(R.id.hscroll6);
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
		hscroll8 = findViewById(R.id.hscroll8);
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
		hscroll9 = findViewById(R.id.hscroll9);
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
		hscroll12 = findViewById(R.id.hscroll12);
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
		hscroll14 = findViewById(R.id.hscroll14);
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
		hscroll15 = findViewById(R.id.hscroll15);
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
		textview531 = findViewById(R.id.textview531);
		edittext2 = findViewById(R.id.edittext2);
		textview532 = findViewById(R.id.textview532);
		textview533 = findViewById(R.id.textview533);
		linear447 = findViewById(R.id.linear447);
		linear448 = findViewById(R.id.linear448);
		textview893 = findViewById(R.id.textview893);
		edittext3 = findViewById(R.id.edittext3);
		textview894 = findViewById(R.id.textview894);
		edittext152 = findViewById(R.id.edittext152);
		textview895 = findViewById(R.id.textview895);
		edittext4 = findViewById(R.id.edittext4);
		textview896 = findViewById(R.id.textview896);
		edittext154 = findViewById(R.id.edittext154);
		linear455 = findViewById(R.id.linear455);
		linear456 = findViewById(R.id.linear456);
		linear457 = findViewById(R.id.linear457);
		textview912 = findViewById(R.id.textview912);
		edittext5 = findViewById(R.id.edittext5);
		textview913 = findViewById(R.id.textview913);
		textview914 = findViewById(R.id.textview914);
		textview915 = findViewById(R.id.textview915);
		edittext6 = findViewById(R.id.edittext6);
		textview916 = findViewById(R.id.textview916);
		textview917 = findViewById(R.id.textview917);
		textview918 = findViewById(R.id.textview918);
		edittext7 = findViewById(R.id.edittext7);
		textview919 = findViewById(R.id.textview919);
		textview920 = findViewById(R.id.textview920);
		button65 = findViewById(R.id.button65);
		linear218 = findViewById(R.id.linear218);
		textview921 = findViewById(R.id.textview921);
		linear205 = findViewById(R.id.linear205);
		textview644 = findViewById(R.id.textview644);
		linear203 = findViewById(R.id.linear203);
		textview996 = findViewById(R.id.textview996);
		edittext10 = findViewById(R.id.edittext10);
		textview643 = findViewById(R.id.textview643);
		edittext9 = findViewById(R.id.edittext9);
		textview641 = findViewById(R.id.textview641);
		edittext8 = findViewById(R.id.edittext8);
		button81 = findViewById(R.id.button81);
		button82 = findViewById(R.id.button82);
		linear519 = findViewById(R.id.linear519);
		hscroll40 = findViewById(R.id.hscroll40);
		linear526 = findViewById(R.id.linear526);
		textview1048 = findViewById(R.id.textview1048);
		linear449 = findViewById(R.id.linear449);
		imageview12 = findViewById(R.id.imageview12);
		linear520 = findViewById(R.id.linear520);
		textview1201 = findViewById(R.id.textview1201);
		textview1046 = findViewById(R.id.textview1046);
		linear529 = findViewById(R.id.linear529);
		hscroll39 = findViewById(R.id.hscroll39);
		linear527 = findViewById(R.id.linear527);
		textview1051 = findViewById(R.id.textview1051);
		edittext155 = findViewById(R.id.edittext155);
		textview1050 = findViewById(R.id.textview1050);
		textview1054 = findViewById(R.id.textview1054);
		textview1058 = findViewById(R.id.textview1058);
		edittext157 = findViewById(R.id.edittext157);
		textview1059 = findViewById(R.id.textview1059);
		textview1060 = findViewById(R.id.textview1060);
		textview901 = findViewById(R.id.textview901);
		linear450 = findViewById(R.id.linear450);
		linear452 = findViewById(R.id.linear452);
		textview906 = findViewById(R.id.textview906);
		linear486 = findViewById(R.id.linear486);
		hscroll38 = findViewById(R.id.hscroll38);
		linear144 = findViewById(R.id.linear144);
		textview908 = findViewById(R.id.textview908);
		linear453 = findViewById(R.id.linear453);
		textview903 = findViewById(R.id.textview903);
		edittext101 = findViewById(R.id.edittext101);
		textview904 = findViewById(R.id.textview904);
		textview905 = findViewById(R.id.textview905);
		button61 = findViewById(R.id.button61);
		textview994 = findViewById(R.id.textview994);
		edittext104 = findViewById(R.id.edittext104);
		textview995 = findViewById(R.id.textview995);
		textview657 = findViewById(R.id.textview657);
		textview601 = findViewById(R.id.textview601);
		edittext105 = findViewById(R.id.edittext105);
		textview602 = findViewById(R.id.textview602);
		textview603 = findViewById(R.id.textview603);
		textview909 = findViewById(R.id.textview909);
		edittext106 = findViewById(R.id.edittext106);
		textview910 = findViewById(R.id.textview910);
		textview911 = findViewById(R.id.textview911);
		linear641 = findViewById(R.id.linear641);
		hscroll16 = findViewById(R.id.hscroll16);
		linear642 = findViewById(R.id.linear642);
		imageview33 = findViewById(R.id.imageview33);
		linear643 = findViewById(R.id.linear643);
		textview1220 = findViewById(R.id.textview1220);
		textview1221 = findViewById(R.id.textview1221);
		edittext190 = findViewById(R.id.edittext190);
		textview1222 = findViewById(R.id.textview1222);
		textview1223 = findViewById(R.id.textview1223);
		linear521 = findViewById(R.id.linear521);
		hscroll17 = findViewById(R.id.hscroll17);
		linear468 = findViewById(R.id.linear468);
		imageview13 = findViewById(R.id.imageview13);
		linear522 = findViewById(R.id.linear522);
		textview940 = findViewById(R.id.textview940);
		textview952 = findViewById(R.id.textview952);
		edittext107 = findViewById(R.id.edittext107);
		textview953 = findViewById(R.id.textview953);
		textview954 = findViewById(R.id.textview954);
		linear665 = findViewById(R.id.linear665);
		hscroll19 = findViewById(R.id.hscroll19);
		linear666 = findViewById(R.id.linear666);
		imageview39 = findViewById(R.id.imageview39);
		linear667 = findViewById(R.id.linear667);
		textview1251 = findViewById(R.id.textview1251);
		textview1252 = findViewById(R.id.textview1252);
		edittext197 = findViewById(R.id.edittext197);
		textview1253 = findViewById(R.id.textview1253);
		textview1254 = findViewById(R.id.textview1254);
		linear523 = findViewById(R.id.linear523);
		hscroll20 = findViewById(R.id.hscroll20);
		linear459 = findViewById(R.id.linear459);
		linear460 = findViewById(R.id.linear460);
		textview924 = findViewById(R.id.textview924);
		textview922 = findViewById(R.id.textview922);
		linear462 = findViewById(R.id.linear462);
		textview973 = findViewById(R.id.textview973);
		linear479 = findViewById(R.id.linear479);
		textview978 = findViewById(R.id.textview978);
		linear484 = findViewById(R.id.linear484);
		textview925 = findViewById(R.id.textview925);
		linear463 = findViewById(R.id.linear463);
		imageview14 = findViewById(R.id.imageview14);
		linear524 = findViewById(R.id.linear524);
		textview974 = findViewById(R.id.textview974);
		textview934 = findViewById(R.id.textview934);
		edittext108 = findViewById(R.id.edittext108);
		textview935 = findViewById(R.id.textview935);
		textview936 = findViewById(R.id.textview936);
		button62 = findViewById(R.id.button62);
		textview931 = findViewById(R.id.textview931);
		edittext109 = findViewById(R.id.edittext109);
		textview932 = findViewById(R.id.textview932);
		textview933 = findViewById(R.id.textview933);
		textview982 = findViewById(R.id.textview982);
		edittext110 = findViewById(R.id.edittext110);
		textview983 = findViewById(R.id.textview983);
		textview984 = findViewById(R.id.textview984);
		textview981 = findViewById(R.id.textview981);
		edittext111 = findViewById(R.id.edittext111);
		textview977 = findViewById(R.id.textview977);
		textview979 = findViewById(R.id.textview979);
		textview937 = findViewById(R.id.textview937);
		edittext112 = findViewById(R.id.edittext112);
		textview938 = findViewById(R.id.textview938);
		textview939 = findViewById(R.id.textview939);
		button78 = findViewById(R.id.button78);
		linear538 = findViewById(R.id.linear538);
		button79 = findViewById(R.id.button79);
		button83 = findViewById(R.id.button83);
		button84 = findViewById(R.id.button84);
		linear553 = findViewById(R.id.linear553);
		hscroll37 = findViewById(R.id.hscroll37);
		linear539 = findViewById(R.id.linear539);
		textview1082 = findViewById(R.id.textview1082);
		linear552 = findViewById(R.id.linear552);
		textview1110 = findViewById(R.id.textview1110);
		linear564 = findViewById(R.id.linear564);
		textview1016 = findViewById(R.id.textview1016);
		linear497 = findViewById(R.id.linear497);
		textview1142 = findViewById(R.id.textview1142);
		linear475 = findViewById(R.id.linear475);
		textview1037 = findViewById(R.id.textview1037);
		linear469 = findViewById(R.id.linear469);
		imageview17 = findViewById(R.id.imageview17);
		linear561 = findViewById(R.id.linear561);
		textview1103 = findViewById(R.id.textview1103);
		textview1139 = findViewById(R.id.textview1139);
		linear562 = findViewById(R.id.linear562);
		textview1211 = findViewById(R.id.textview1211);
		linear549 = findViewById(R.id.linear549);
		textview1209 = findViewById(R.id.textview1209);
		linear574 = findViewById(R.id.linear574);
		textview1210 = findViewById(R.id.textview1210);
		linear540 = findViewById(R.id.linear540);
		linear541 = findViewById(R.id.linear541);
		textview1208 = findViewById(R.id.textview1208);
		linear548 = findViewById(R.id.linear548);
		textview1207 = findViewById(R.id.textview1207);
		linear542 = findViewById(R.id.linear542);
		textview1063 = findViewById(R.id.textview1063);
		linear543 = findViewById(R.id.linear543);
		textview1064 = findViewById(R.id.textview1064);
		linear544 = findViewById(R.id.linear544);
		textview1104 = findViewById(R.id.textview1104);
		edittext94 = findViewById(R.id.edittext94);
		textview1105 = findViewById(R.id.textview1105);
		textview1106 = findViewById(R.id.textview1106);
		textview1067 = findViewById(R.id.textview1067);
		edittext103 = findViewById(R.id.edittext103);
		textview1062 = findViewById(R.id.textview1062);
		textview1068 = findViewById(R.id.textview1068);
		textview1132 = findViewById(R.id.textview1132);
		edittext175 = findViewById(R.id.edittext175);
		textview1133 = findViewById(R.id.textview1133);
		textview1134 = findViewById(R.id.textview1134);
		textview1073 = findViewById(R.id.textview1073);
		edittext160 = findViewById(R.id.edittext160);
		textview1074 = findViewById(R.id.textview1074);
		textview1075 = findViewById(R.id.textview1075);
		button85 = findViewById(R.id.button85);
		textview1066 = findViewById(R.id.textview1066);
		edittext158 = findViewById(R.id.edittext158);
		textview1065 = findViewById(R.id.textview1065);
		textview1069 = findViewById(R.id.textview1069);
		textview1081 = findViewById(R.id.textview1081);
		edittext102 = findViewById(R.id.edittext102);
		textview1080 = findViewById(R.id.textview1080);
		textview1079 = findViewById(R.id.textview1079);
		textview1070 = findViewById(R.id.textview1070);
		edittext159 = findViewById(R.id.edittext159);
		textview1071 = findViewById(R.id.textview1071);
		textview1072 = findViewById(R.id.textview1072);
		textview1076 = findViewById(R.id.textview1076);
		edittext161 = findViewById(R.id.edittext161);
		textview1077 = findViewById(R.id.textview1077);
		textview1078 = findViewById(R.id.textview1078);
		textview1138 = findViewById(R.id.textview1138);
		linear563 = findViewById(R.id.linear563);
		textview1217 = findViewById(R.id.textview1217);
		linear554 = findViewById(R.id.linear554);
		textview1216 = findViewById(R.id.textview1216);
		linear575 = findViewById(R.id.linear575);
		textview1215 = findViewById(R.id.textview1215);
		linear555 = findViewById(R.id.linear555);
		linear556 = findViewById(R.id.linear556);
		textview1213 = findViewById(R.id.textview1213);
		linear557 = findViewById(R.id.linear557);
		textview1212 = findViewById(R.id.textview1212);
		linear558 = findViewById(R.id.linear558);
		textview1083 = findViewById(R.id.textview1083);
		linear559 = findViewById(R.id.linear559);
		textview1084 = findViewById(R.id.textview1084);
		linear560 = findViewById(R.id.linear560);
		textview1107 = findViewById(R.id.textview1107);
		edittext168 = findViewById(R.id.edittext168);
		textview1108 = findViewById(R.id.textview1108);
		textview1109 = findViewById(R.id.textview1109);
		textview1085 = findViewById(R.id.textview1085);
		edittext162 = findViewById(R.id.edittext162);
		textview1086 = findViewById(R.id.textview1086);
		textview1087 = findViewById(R.id.textview1087);
		textview1135 = findViewById(R.id.textview1135);
		edittext176 = findViewById(R.id.edittext176);
		textview1136 = findViewById(R.id.textview1136);
		textview1137 = findViewById(R.id.textview1137);
		textview1088 = findViewById(R.id.textview1088);
		edittext163 = findViewById(R.id.edittext163);
		textview1089 = findViewById(R.id.textview1089);
		textview1090 = findViewById(R.id.textview1090);
		button86 = findViewById(R.id.button86);
		textview1091 = findViewById(R.id.textview1091);
		edittext164 = findViewById(R.id.edittext164);
		textview1092 = findViewById(R.id.textview1092);
		textview1093 = findViewById(R.id.textview1093);
		textview1094 = findViewById(R.id.textview1094);
		edittext165 = findViewById(R.id.edittext165);
		textview1095 = findViewById(R.id.textview1095);
		textview1096 = findViewById(R.id.textview1096);
		textview1097 = findViewById(R.id.textview1097);
		edittext166 = findViewById(R.id.edittext166);
		textview1098 = findViewById(R.id.textview1098);
		textview1099 = findViewById(R.id.textview1099);
		textview1100 = findViewById(R.id.textview1100);
		edittext167 = findViewById(R.id.edittext167);
		textview1101 = findViewById(R.id.textview1101);
		textview1102 = findViewById(R.id.textview1102);
		textview1131 = findViewById(R.id.textview1131);
		linear566 = findViewById(R.id.linear566);
		textview1218 = findViewById(R.id.textview1218);
		linear567 = findViewById(R.id.linear567);
		linear568 = findViewById(R.id.linear568);
		textview1140 = findViewById(R.id.textview1140);
		linear569 = findViewById(R.id.linear569);
		textview1111 = findViewById(R.id.textview1111);
		linear572 = findViewById(R.id.linear572);
		textview1113 = findViewById(R.id.textview1113);
		edittext169 = findViewById(R.id.edittext169);
		textview1114 = findViewById(R.id.textview1114);
		textview1115 = findViewById(R.id.textview1115);
		textview1116 = findViewById(R.id.textview1116);
		edittext170 = findViewById(R.id.edittext170);
		textview1117 = findViewById(R.id.textview1117);
		textview1118 = findViewById(R.id.textview1118);
		button87 = findViewById(R.id.button87);
		textview1119 = findViewById(R.id.textview1119);
		edittext171 = findViewById(R.id.edittext171);
		textview1120 = findViewById(R.id.textview1120);
		textview1121 = findViewById(R.id.textview1121);
		textview1128 = findViewById(R.id.textview1128);
		edittext174 = findViewById(R.id.edittext174);
		textview1129 = findViewById(R.id.textview1129);
		textview1130 = findViewById(R.id.textview1130);
		textview1015 = findViewById(R.id.textview1015);
		linear498 = findViewById(R.id.linear498);
		linear499 = findViewById(R.id.linear499);
		textview1017 = findViewById(R.id.textview1017);
		linear506 = findViewById(R.id.linear506);
		textview1141 = findViewById(R.id.textview1141);
		linear501 = findViewById(R.id.linear501);
		textview1018 = findViewById(R.id.textview1018);
		linear502 = findViewById(R.id.linear502);
		textview1027 = findViewById(R.id.textview1027);
		edittext120 = findViewById(R.id.edittext120);
		textview1028 = findViewById(R.id.textview1028);
		textview1029 = findViewById(R.id.textview1029);
		button67 = findViewById(R.id.button67);
		textview1033 = findViewById(R.id.textview1033);
		edittext119 = findViewById(R.id.edittext119);
		textview1034 = findViewById(R.id.textview1034);
		textview1035 = findViewById(R.id.textview1035);
		textview1024 = findViewById(R.id.textview1024);
		edittext121 = findViewById(R.id.edittext121);
		textview1025 = findViewById(R.id.textview1025);
		textview1026 = findViewById(R.id.textview1026);
		textview1030 = findViewById(R.id.textview1030);
		edittext122 = findViewById(R.id.edittext122);
		textview1031 = findViewById(R.id.textview1031);
		textview1032 = findViewById(R.id.textview1032);
		textview980 = findViewById(R.id.textview980);
		linear476 = findViewById(R.id.linear476);
		linear477 = findViewById(R.id.linear477);
		textview975 = findViewById(R.id.textview975);
		linear485 = findViewById(R.id.linear485);
		textview1143 = findViewById(R.id.textview1143);
		linear480 = findViewById(R.id.linear480);
		textview985 = findViewById(R.id.textview985);
		edittext116 = findViewById(R.id.edittext116);
		textview986 = findViewById(R.id.textview986);
		textview987 = findViewById(R.id.textview987);
		button64 = findViewById(R.id.button64);
		textview991 = findViewById(R.id.textview991);
		edittext117 = findViewById(R.id.edittext117);
		textview992 = findViewById(R.id.textview992);
		textview993 = findViewById(R.id.textview993);
		textview988 = findViewById(R.id.textview988);
		edittext118 = findViewById(R.id.edittext118);
		textview989 = findViewById(R.id.textview989);
		textview990 = findViewById(R.id.textview990);
		textview955 = findViewById(R.id.textview955);
		linear470 = findViewById(R.id.linear470);
		linear471 = findViewById(R.id.linear471);
		textview958 = findViewById(R.id.textview958);
		linear473 = findViewById(R.id.linear473);
		textview1144 = findViewById(R.id.textview1144);
		linear474 = findViewById(R.id.linear474);
		textview967 = findViewById(R.id.textview967);
		edittext114 = findViewById(R.id.edittext114);
		textview968 = findViewById(R.id.textview968);
		textview969 = findViewById(R.id.textview969);
		button63 = findViewById(R.id.button63);
		textview964 = findViewById(R.id.textview964);
		edittext113 = findViewById(R.id.edittext113);
		textview965 = findViewById(R.id.textview965);
		textview966 = findViewById(R.id.textview966);
		textview970 = findViewById(R.id.textview970);
		edittext115 = findViewById(R.id.edittext115);
		textview971 = findViewById(R.id.textview971);
		textview972 = findViewById(R.id.textview972);
		linear578 = findViewById(R.id.linear578);
		hscroll21 = findViewById(R.id.hscroll21);
		linear389 = findViewById(R.id.linear389);
		imageview18 = findViewById(R.id.imageview18);
		linear580 = findViewById(R.id.linear580);
		textview1145 = findViewById(R.id.textview1145);
		textview817 = findViewById(R.id.textview817);
		edittext63 = findViewById(R.id.edittext63);
		textview818 = findViewById(R.id.textview818);
		edittext62 = findViewById(R.id.edittext62);
		linear582 = findViewById(R.id.linear582);
		hscroll23 = findViewById(R.id.hscroll23);
		linear583 = findViewById(R.id.linear583);
		imageview19 = findViewById(R.id.imageview19);
		linear584 = findViewById(R.id.linear584);
		textview1150 = findViewById(R.id.textview1150);
		textview1151 = findViewById(R.id.textview1151);
		edittext178 = findViewById(R.id.edittext178);
		textview1152 = findViewById(R.id.textview1152);
		textview1153 = findViewById(R.id.textview1153);
		linear586 = findViewById(R.id.linear586);
		hscroll22 = findViewById(R.id.hscroll22);
		linear587 = findViewById(R.id.linear587);
		imageview20 = findViewById(R.id.imageview20);
		linear588 = findViewById(R.id.linear588);
		textview1155 = findViewById(R.id.textview1155);
		textview1156 = findViewById(R.id.textview1156);
		edittext179 = findViewById(R.id.edittext179);
		textview1157 = findViewById(R.id.textview1157);
		textview1158 = findViewById(R.id.textview1158);
		linear610 = findViewById(R.id.linear610);
		hscroll24 = findViewById(R.id.hscroll24);
		linear611 = findViewById(R.id.linear611);
		imageview26 = findViewById(R.id.imageview26);
		linear612 = findViewById(R.id.linear612);
		textview1185 = findViewById(R.id.textview1185);
		textview1186 = findViewById(R.id.textview1186);
		edittext185 = findViewById(R.id.edittext185);
		textview1187 = findViewById(R.id.textview1187);
		textview1188 = findViewById(R.id.textview1188);
		linear590 = findViewById(R.id.linear590);
		hscroll25 = findViewById(R.id.hscroll25);
		linear591 = findViewById(R.id.linear591);
		imageview21 = findViewById(R.id.imageview21);
		linear592 = findViewById(R.id.linear592);
		textview1160 = findViewById(R.id.textview1160);
		textview1161 = findViewById(R.id.textview1161);
		edittext180 = findViewById(R.id.edittext180);
		textview1162 = findViewById(R.id.textview1162);
		textview1163 = findViewById(R.id.textview1163);
		linear594 = findViewById(R.id.linear594);
		hscroll26 = findViewById(R.id.hscroll26);
		linear595 = findViewById(R.id.linear595);
		imageview22 = findViewById(R.id.imageview22);
		linear596 = findViewById(R.id.linear596);
		textview1165 = findViewById(R.id.textview1165);
		textview1166 = findViewById(R.id.textview1166);
		edittext181 = findViewById(R.id.edittext181);
		textview1167 = findViewById(R.id.textview1167);
		textview1168 = findViewById(R.id.textview1168);
		linear657 = findViewById(R.id.linear657);
		hscroll27 = findViewById(R.id.hscroll27);
		linear658 = findViewById(R.id.linear658);
		imageview37 = findViewById(R.id.imageview37);
		linear659 = findViewById(R.id.linear659);
		textview1241 = findViewById(R.id.textview1241);
		textview1242 = findViewById(R.id.textview1242);
		edittext195 = findViewById(R.id.edittext195);
		textview1243 = findViewById(R.id.textview1243);
		textview1244 = findViewById(R.id.textview1244);
		linear661 = findViewById(R.id.linear661);
		hscroll28 = findViewById(R.id.hscroll28);
		linear662 = findViewById(R.id.linear662);
		imageview38 = findViewById(R.id.imageview38);
		linear663 = findViewById(R.id.linear663);
		textview1247 = findViewById(R.id.textview1247);
		textview1248 = findViewById(R.id.textview1248);
		edittext196 = findViewById(R.id.edittext196);
		textview1249 = findViewById(R.id.textview1249);
		textview1250 = findViewById(R.id.textview1250);
		linear653 = findViewById(R.id.linear653);
		hscroll29 = findViewById(R.id.hscroll29);
		linear654 = findViewById(R.id.linear654);
		imageview36 = findViewById(R.id.imageview36);
		linear655 = findViewById(R.id.linear655);
		textview1236 = findViewById(R.id.textview1236);
		textview1237 = findViewById(R.id.textview1237);
		edittext194 = findViewById(R.id.edittext194);
		textview1238 = findViewById(R.id.textview1238);
		textview1239 = findViewById(R.id.textview1239);
		linear598 = findViewById(R.id.linear598);
		hscroll30 = findViewById(R.id.hscroll30);
		linear599 = findViewById(R.id.linear599);
		imageview23 = findViewById(R.id.imageview23);
		linear600 = findViewById(R.id.linear600);
		textview1169 = findViewById(R.id.textview1169);
		textview1170 = findViewById(R.id.textview1170);
		edittext182 = findViewById(R.id.edittext182);
		textview1171 = findViewById(R.id.textview1171);
		textview1172 = findViewById(R.id.textview1172);
		linear645 = findViewById(R.id.linear645);
		hscroll31 = findViewById(R.id.hscroll31);
		linear646 = findViewById(R.id.linear646);
		imageview34 = findViewById(R.id.imageview34);
		linear647 = findViewById(R.id.linear647);
		textview1225 = findViewById(R.id.textview1225);
		textview1226 = findViewById(R.id.textview1226);
		edittext191 = findViewById(R.id.edittext191);
		textview1227 = findViewById(R.id.textview1227);
		textview1228 = findViewById(R.id.textview1228);
		linear649 = findViewById(R.id.linear649);
		hscroll33 = findViewById(R.id.hscroll33);
		linear650 = findViewById(R.id.linear650);
		imageview35 = findViewById(R.id.imageview35);
		linear651 = findViewById(R.id.linear651);
		textview1231 = findViewById(R.id.textview1231);
		textview1232 = findViewById(R.id.textview1232);
		edittext192 = findViewById(R.id.edittext192);
		textview1233 = findViewById(R.id.textview1233);
		textview1234 = findViewById(R.id.textview1234);
		linear602 = findViewById(R.id.linear602);
		hscroll36 = findViewById(R.id.hscroll36);
		linear603 = findViewById(R.id.linear603);
		imageview24 = findViewById(R.id.imageview24);
		linear604 = findViewById(R.id.linear604);
		textview1173 = findViewById(R.id.textview1173);
		textview1174 = findViewById(R.id.textview1174);
		edittext183 = findViewById(R.id.edittext183);
		textview1175 = findViewById(R.id.textview1175);
		textview1176 = findViewById(R.id.textview1176);
		linear606 = findViewById(R.id.linear606);
		hscroll35 = findViewById(R.id.hscroll35);
		linear607 = findViewById(R.id.linear607);
		imageview25 = findViewById(R.id.imageview25);
		linear608 = findViewById(R.id.linear608);
		textview1177 = findViewById(R.id.textview1177);
		textview1178 = findViewById(R.id.textview1178);
		edittext184 = findViewById(R.id.edittext184);
		textview1179 = findViewById(R.id.textview1179);
		textview1180 = findViewById(R.id.textview1180);
		linear614 = findViewById(R.id.linear614);
		hscroll34 = findViewById(R.id.hscroll34);
		linear615 = findViewById(R.id.linear615);
		imageview27 = findViewById(R.id.imageview27);
		linear616 = findViewById(R.id.linear616);
		textview1190 = findViewById(R.id.textview1190);
		textview1191 = findViewById(R.id.textview1191);
		edittext186 = findViewById(R.id.edittext186);
		textview1192 = findViewById(R.id.textview1192);
		textview1193 = findViewById(R.id.textview1193);
		linear618 = findViewById(R.id.linear618);
		hscroll5 = findViewById(R.id.hscroll5);
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
		hscroll4 = findViewById(R.id.hscroll4);
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
		hscroll3 = findViewById(R.id.hscroll3);
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
		hscroll1 = findViewById(R.id.hscroll1);
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
		textview1219 = findViewById(R.id.textview1219);
		edittext88 = findViewById(R.id.edittext88);
		textview886 = findViewById(R.id.textview886);
		linear438 = findViewById(R.id.linear438);
		textview885 = findViewById(R.id.textview885);
		edittext89 = findViewById(R.id.edittext89);
		internet = new RequestNetwork(this);
		
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
		
		button74.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear537.setVisibility(View.VISIBLE);
					edittext155.setText("");
					edittext157.setText("");
					edittext101.setText("");
					edittext104.setTextColor(0xFF000000);
					edittext105.setTextColor(0xFF000000);
					edittext106.setTextColor(0xFF000000);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button117.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear640.setVisibility(View.VISIBLE);
					edittext190.setText("");
					button117.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button75.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear467.setVisibility(View.VISIBLE);
					edittext107.setText("");
					button75.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button123.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear664.setVisibility(View.VISIBLE);
					edittext197.setText("");
					button123.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button76.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear458.setVisibility(View.VISIBLE);
					edittext108.setText("");
					edittext109.setTextColor(0xFF000000);
					edittext110.setTextColor(0xFF000000);
					edittext111.setTextColor(0xFF000000);
					edittext112.setTextColor(0xFF000000);
					button76.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button77.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear525.setVisibility(View.VISIBLE);
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
		
		button89.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear581.setVisibility(View.VISIBLE);
					edittext178.setText("");
					button89.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button102.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear585.setVisibility(View.VISIBLE);
					edittext179.setText("");
					button102.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button108.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear609.setVisibility(View.VISIBLE);
					edittext185.setText("");
					button108.setVisibility(View.GONE);
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
		
		button104.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear593.setVisibility(View.VISIBLE);
					edittext181.setText("");
					button104.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button121.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear656.setVisibility(View.VISIBLE);
					edittext195.setText("");
					button121.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button122.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear660.setVisibility(View.VISIBLE);
					edittext196.setText("");
					button122.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button120.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear652.setVisibility(View.VISIBLE);
					edittext194.setText("");
					button120.setVisibility(View.GONE);
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
		
		button106.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear601.setVisibility(View.VISIBLE);
					edittext183.setText("");
					button106.setVisibility(View.GONE);
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
		
		button109.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear613.setVisibility(View.VISIBLE);
					edittext186.setText("");
					button109.setVisibility(View.GONE);
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
		
		button124.setOnClickListener(new View.OnClickListener() {
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
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة ضريبة القيمة المضافة\nفي حالة الرغبة في ادخال القيمة المضافة كنسبة من التوريد وليس كمبلغ ثابت \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١٤ % \"");
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
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة لزوم عمل الاختبارات للهيئة\nفي حالة الرغبة في ادخال الاختبارات للهيئة كنسبة من التوريد وليس كمبلغ ثابت \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٢ % \"");
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
				SketchwareUtil.showMessage(getApplicationContext(), "* النسبة المطلوبة لزوم النقل الخارجي\nفي حالة الرغبة في ادخال النقل الخارجي كنسبة من التوريد وليس كمبلغ ثابت \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٤ % \"");
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
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة الهالك ب المواسير أثناء النقل والتعتيق\nفي حالة الرغبة في ادخال الهالك ب المواسير أثناء النقل والتعتيق كنسبة من التوريد وليس كمبلغ ثابت \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٣ % \"");
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
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة هالك المواسير أثناء اللحام والتركيب\nفي حالة الرغبة في ادخال هالك المواسير أثناء اللحام والتركيب كنسبة من التوريد وليس كمبلغ ثابت \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٥ % \"");
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
				SketchwareUtil.showMessage(getApplicationContext(), "* النسبة المطلوبة لزوم النقل الداخلي\nفي حالة الرغبة في ادخال النقل الداخلي كنسبة من التوريد وليس كمبلغ ثابت  \n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٢ % \"");
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
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext2.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext9.setText(String.valueOf(00.00d));
				edittext104.setText(String.valueOf(00.00d));
				edittext105.setText(String.valueOf(00.00d));
				edittext106.setText(String.valueOf(00.00d));
				edittext9.setTextColor(0xFFE91E63);
				edittext104.setTextColor(0xFFE91E63);
				edittext105.setTextColor(0xFFE91E63);
				edittext106.setTextColor(0xFFE91E63);
				edittext109.setText(String.valueOf(00.00d));
				edittext110.setText(String.valueOf(00.00d));
				edittext112.setText(String.valueOf(00.00d));
				edittext109.setTextColor(0xFFE91E63);
				edittext110.setTextColor(0xFFE91E63);
				edittext112.setTextColor(0xFFE91E63);
				edittext119.setText(String.valueOf(00.00d));
				edittext121.setText(String.valueOf(00.00d));
				edittext122.setText(String.valueOf(00.00d));
				edittext119.setTextColor(0xFFE91E63);
				edittext121.setTextColor(0xFFE91E63);
				edittext122.setTextColor(0xFFE91E63);
				edittext113.setText(String.valueOf(00.00d));
				edittext115.setText(String.valueOf(00.00d));
				edittext113.setTextColor(0xFFE91E63);
				edittext115.setTextColor(0xFFE91E63);
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
				edittext10.setText(String.valueOf(00.00d));
				edittext104.setText(String.valueOf(00.00d));
				edittext105.setText(String.valueOf(00.00d));
				edittext106.setText(String.valueOf(00.00d));
				edittext10.setTextColor(0xFFE91E63);
				edittext104.setTextColor(0xFFE91E63);
				edittext105.setTextColor(0xFFE91E63);
				edittext106.setTextColor(0xFFE91E63);
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
				edittext4.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext10.setText(String.valueOf(00.00d));
				edittext104.setText(String.valueOf(00.00d));
				edittext105.setText(String.valueOf(00.00d));
				edittext106.setText(String.valueOf(00.00d));
				edittext10.setTextColor(0xFFE91E63);
				edittext104.setTextColor(0xFFE91E63);
				edittext105.setTextColor(0xFFE91E63);
				edittext106.setTextColor(0xFFE91E63);
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
				edittext109.setText(String.valueOf(00.00d));
				edittext112.setText(String.valueOf(00.00d));
				edittext109.setTextColor(0xFFE91E63);
				edittext112.setTextColor(0xFFE91E63);
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
				edittext6.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext110.setText(String.valueOf(00.00));
				edittext112.setText(String.valueOf(00.00));
				edittext110.setTextColor(0xFFE91E63);
				edittext112.setTextColor(0xFFE91E63);
				edittext119.setText(String.valueOf(00.00d));
				edittext121.setText(String.valueOf(00.00d));
				edittext122.setText(String.valueOf(00.00d));
				edittext119.setTextColor(0xFFE91E63);
				edittext121.setTextColor(0xFFE91E63);
				edittext122.setTextColor(0xFFE91E63);
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
				edittext7.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext9.setText(String.valueOf(00.00d));
				edittext105.setText(String.valueOf(00.00d));
				edittext106.setText(String.valueOf(00.00d));
				edittext9.setTextColor(0xFFE91E63);
				edittext105.setTextColor(0xFFE91E63);
				edittext106.setTextColor(0xFFE91E63);
				edittext109.setText(String.valueOf(00.00d));
				edittext110.setText(String.valueOf(00.00d));
				edittext112.setText(String.valueOf(00.00d));
				edittext109.setTextColor(0xFFE91E63);
				edittext110.setTextColor(0xFFE91E63);
				edittext112.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button65.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || (((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) || ((edittext4.getText().toString().equals("") || edittext4.getText().toString().equals(".")) || (edittext4.getText().toString().equals("-") || (Double.parseDouble(edittext4.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) {
						edittext5.setText(String.valueOf(0.15d));
					}
					if ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0))) {
						edittext6.setText(String.valueOf(0.30d));
					}
					if ((edittext7.getText().toString().equals("") || edittext7.getText().toString().equals(".")) || (edittext7.getText().toString().equals("-") || (Double.parseDouble(edittext7.getText().toString()) < 0))) {
						edittext7.setText(String.valueOf(0.30d));
					}
					edittext9.setText(String.valueOf((Double.parseDouble(edittext2.getText().toString()) / 1000) + (2 * Double.parseDouble(edittext7.getText().toString()))));
					edittext10.setText(String.valueOf((Double.parseDouble(edittext3.getText().toString()) + Double.parseDouble(edittext4.getText().toString())) / 2));
					edittext9.setTextColor(0xFF000000);
					edittext10.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext10.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext10.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext119.setText(String.valueOf(00.00d));
				edittext121.setText(String.valueOf(00.00d));
				edittext122.setText(String.valueOf(00.00d));
				edittext119.setTextColor(0xFFE91E63);
				edittext121.setTextColor(0xFFE91E63);
				edittext122.setTextColor(0xFFE91E63);
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
				edittext9.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext158.setText("");
				edittext102.setText(String.valueOf(00.00));
				edittext159.setText(String.valueOf(00.00));
				edittext161.setText(String.valueOf(00.00));
				edittext102.setTextColor(0xFFE91E63);
				edittext159.setTextColor(0xFFE91E63);
				edittext161.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button81.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear623.setVisibility(View.VISIBLE);
					linear526.setVisibility(View.VISIBLE);
					linear449.setVisibility(View.VISIBLE);
					edittext155.setText("");
					edittext157.setText("");
					edittext101.setText("");
					edittext104.setTextColor(0xFF000000);
					edittext105.setTextColor(0xFF000000);
					edittext106.setTextColor(0xFF000000);
					linear537.setVisibility(View.GONE);
					button74.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button82.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear623.setVisibility(View.VISIBLE);
					linear526.setVisibility(View.GONE);
					linear449.setVisibility(View.VISIBLE);
					edittext155.setText("");
					edittext157.setText("");
					edittext101.setText("");
					edittext104.setTextColor(0xFF000000);
					edittext105.setTextColor(0xFF000000);
					edittext106.setTextColor(0xFF000000);
					linear537.setVisibility(View.GONE);
					button74.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		imageview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear623.setVisibility(View.GONE);
				linear526.setVisibility(View.GONE);
				linear449.setVisibility(View.GONE);
				edittext155.setText("");
				edittext157.setText("");
				edittext101.setText("");
				edittext104.setTextColor(0xFF000000);
				edittext105.setTextColor(0xFF000000);
				edittext106.setTextColor(0xFF000000);
				linear537.setVisibility(View.VISIBLE);
				button74.setVisibility(View.VISIBLE);
			}
		});
		
		edittext155.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext155.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext104.setText(String.valueOf(00.00d));
				edittext105.setText(String.valueOf(00.00d));
				edittext106.setText(String.valueOf(00.00d));
				edittext104.setTextColor(0xFFE91E63);
				edittext105.setTextColor(0xFFE91E63);
				edittext106.setTextColor(0xFFE91E63);
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
				edittext157.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext106.setText(String.valueOf(00.00));
				edittext106.setTextColor(0xFFE91E63);
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
				edittext101.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext106.setText(String.valueOf(00.00d));
				edittext106.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button61.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || (((edittext3.getText().toString().equals("") || edittext3.getText().toString().equals(".")) || (edittext3.getText().toString().equals("-") || (Double.parseDouble(edittext3.getText().toString()) < 0))) || (((edittext4.getText().toString().equals("") || edittext4.getText().toString().equals(".")) || (edittext4.getText().toString().equals("-") || (Double.parseDouble(edittext4.getText().toString()) < 0))) || ((edittext101.getText().toString().equals("") || edittext101.getText().toString().equals(".")) || (edittext101.getText().toString().equals("-") || (Double.parseDouble(edittext101.getText().toString()) < 0)))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) {
						edittext5.setText(String.valueOf(0.15d));
					}
					if ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0))) {
						edittext6.setText(String.valueOf(0.30d));
					}
					if ((edittext7.getText().toString().equals("") || edittext7.getText().toString().equals(".")) || (edittext7.getText().toString().equals("-") || (Double.parseDouble(edittext7.getText().toString()) < 0))) {
						edittext7.setText(String.valueOf(0.30d));
					}
					if (linear526.getVisibility() == View.VISIBLE) {
						if ((edittext157.getText().toString().equals("") || edittext157.getText().toString().equals(".")) || (edittext157.getText().toString().equals("-") || (Double.parseDouble(edittext157.getText().toString()) < 0))) {
							SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
						}
						else {
							if ((edittext155.getText().toString().equals("") || edittext155.getText().toString().equals(".")) || (edittext155.getText().toString().equals("-") || (Double.parseDouble(edittext155.getText().toString()) < 0))) {
								edittext155.setText(String.valueOf(0.10d));
								edittext104.setText(String.valueOf((((Double.parseDouble(edittext3.getText().toString()) + Double.parseDouble(edittext4.getText().toString())) / 2) + Double.parseDouble(edittext5.getText().toString())) - Double.parseDouble(edittext155.getText().toString())));
								edittext105.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString()) * (Double.parseDouble(edittext9.getText().toString()) * Double.parseDouble(edittext104.getText().toString()))));
								edittext106.setText(String.valueOf((Double.parseDouble(edittext101.getText().toString()) * Double.parseDouble(edittext105.getText().toString())) + Double.parseDouble(edittext157.getText().toString())));
								edittext104.setTextColor(0xFF000000);
								edittext105.setTextColor(0xFF000000);
								edittext106.setTextColor(0xFF000000);
							}
							else {
								edittext104.setText(String.valueOf((((Double.parseDouble(edittext3.getText().toString()) + Double.parseDouble(edittext4.getText().toString())) / 2) + Double.parseDouble(edittext5.getText().toString())) - Double.parseDouble(edittext155.getText().toString())));
								edittext105.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString()) * (Double.parseDouble(edittext9.getText().toString()) * Double.parseDouble(edittext104.getText().toString()))));
								edittext106.setText(String.valueOf((Double.parseDouble(edittext101.getText().toString()) * Double.parseDouble(edittext105.getText().toString())) + Double.parseDouble(edittext157.getText().toString())));
								edittext104.setTextColor(0xFF000000);
								edittext105.setTextColor(0xFF000000);
								edittext106.setTextColor(0xFF000000);
							}
						}
					}
					else {
						edittext104.setText(String.valueOf(((Double.parseDouble(edittext3.getText().toString()) + Double.parseDouble(edittext4.getText().toString())) / 2) + Double.parseDouble(edittext5.getText().toString())));
						edittext105.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString()) * (Double.parseDouble(edittext9.getText().toString()) * Double.parseDouble(edittext104.getText().toString()))));
						edittext106.setText(String.valueOf(Double.parseDouble(edittext101.getText().toString()) * Double.parseDouble(edittext105.getText().toString())));
						edittext104.setTextColor(0xFF000000);
						edittext105.setTextColor(0xFF000000);
						edittext106.setTextColor(0xFF000000);
					}
				}
			}
		});
		
		edittext104.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext104.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext105.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext106.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		imageview33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear640.setVisibility(View.GONE);
				edittext190.setText("");
				button117.setVisibility(View.VISIBLE);
			}
		});
		
		edittext190.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext190.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		imageview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear467.setVisibility(View.GONE);
				edittext107.setText("");
				button75.setVisibility(View.VISIBLE);
			}
		});
		
		edittext107.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext107.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		imageview39.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear664.setVisibility(View.GONE);
				edittext197.setText("");
				button123.setVisibility(View.VISIBLE);
			}
		});
		
		edittext197.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext197.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		imageview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear458.setVisibility(View.GONE);
				edittext108.setText("");
				button76.setVisibility(View.VISIBLE);
			}
		});
		
		edittext108.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext108.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext112.setText(String.valueOf(00.00));
				edittext112.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button62.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || ((edittext108.getText().toString().equals("") || edittext108.getText().toString().equals(".")) || (edittext108.getText().toString().equals("-") || (Double.parseDouble(edittext108.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) {
						edittext5.setText(String.valueOf(0.15d));
					}
					if ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0))) {
						edittext6.setText(String.valueOf(0.30d));
					}
					if ((edittext7.getText().toString().equals("") || edittext7.getText().toString().equals(".")) || (edittext7.getText().toString().equals("-") || (Double.parseDouble(edittext7.getText().toString()) < 0))) {
						edittext7.setText(String.valueOf(0.30d));
					}
					edittext109.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString()) * (Double.parseDouble(edittext9.getText().toString()) * Double.parseDouble(edittext5.getText().toString()))));
					edittext110.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString()) * ((Double.parseDouble(edittext9.getText().toString()) * (Double.parseDouble(edittext6.getText().toString()) + (Double.parseDouble(edittext2.getText().toString()) / 1000))) - ((Math.PI * Math.pow(Double.parseDouble(edittext2.getText().toString()) / 1000, 2)) / 4))));
					edittext111.setText(String.valueOf(Double.parseDouble(edittext110.getText().toString()) + Double.parseDouble(edittext109.getText().toString())));
					edittext112.setText(String.valueOf(Double.parseDouble(edittext108.getText().toString()) * Double.parseDouble(edittext111.getText().toString())));
					edittext109.setTextColor(0xFF000000);
					edittext110.setTextColor(0xFF000000);
					edittext112.setTextColor(0xFF000000);
					edittext9.setTextColor(0xFF000000);
					edittext109.setTextColor(0xFF000000);
					edittext110.setTextColor(0xFF000000);
					edittext112.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext109.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext109.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext110.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext111.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext112.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext112.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		button78.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear538.setVisibility(View.VISIBLE);
					edittext94.setText("");
					edittext103.setText("");
					edittext175.setText("");
					edittext160.setText("");
					edittext158.setText("");
					edittext102.setTextColor(0xFF000000);
					edittext159.setTextColor(0xFF000000);
					edittext161.setTextColor(0xFF000000);
					edittext168.setText("");
					edittext162.setText("");
					edittext176.setText("");
					edittext163.setText("");
					edittext164.setText("");
					edittext165.setTextColor(0xFF000000);
					edittext166.setTextColor(0xFF000000);
					edittext167.setTextColor(0xFF000000);
					edittext169.setText("");
					edittext170.setText("");
					edittext171.setText("");
					edittext174.setTextColor(0xFF000000);
					edittext120.setText("");
					edittext119.setTextColor(0xFF000000);
					edittext121.setTextColor(0xFF000000);
					edittext122.setTextColor(0xFF000000);
					edittext116.setText("");
					edittext117.setText("");
					edittext118.setTextColor(0xFF000000);
					edittext113.setText("");
					edittext114.setText("");
					edittext115.setTextColor(0xFF000000);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button79.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear576.setVisibility(View.VISIBLE);
					linear539.setVisibility(View.GONE);
					edittext94.setText("");
					edittext103.setText("");
					edittext175.setText("");
					edittext160.setText("");
					edittext158.setText("");
					edittext102.setTextColor(0xFF000000);
					edittext159.setTextColor(0xFF000000);
					edittext161.setTextColor(0xFF000000);
					linear552.setVisibility(View.GONE);
					edittext168.setText("");
					edittext162.setText("");
					edittext176.setText("");
					edittext163.setText("");
					edittext164.setText("");
					edittext165.setTextColor(0xFF000000);
					edittext166.setTextColor(0xFF000000);
					edittext167.setTextColor(0xFF000000);
					textview1138.setText("• الطبقة الأسفلتية \n( طبقة الخرسانة الأسفلتية\n+ طبقة التشريب )");
					textview1137.setText("* سمك طبقة الأسفلت ( م )");
					textview1090.setText("سعر مقاول الباطن لبند الطبقة الأسفلتية ( جنيه / م٢ )");
					textview1099.setText("تكلفة الخرسانة الأسفلتية بطبقة الأسفلت ( جنيه )");
					textview1102.setText("تكلفة بند الطبقة الأسفلتية ( جنيه )");
					linear564.setVisibility(View.GONE);
					edittext169.setText("");
					edittext170.setText("");
					edittext171.setText("");
					edittext174.setTextColor(0xFF000000);
					linear497.setVisibility(View.VISIBLE);
					textview1015.setText("• ردم من ناتج الحفر أعلي طبقة الأحلال أعلي المواسير ");
					textview1029.setText("سعر مقاول الباطن لبند الردم من ناتج الحفر ( جنيه / م٣ )");
					textview1026.setText("مكعب الردم من ناتج الحفر أعلي الأحلال أعلي المواسير ( م٣ / م.ط )");
					textview1032.setText("تكلفة بند الردم من ناتج الحفر أعلي الأحلال أعلي المواسير ( جنيه )");
					edittext120.setText("");
					edittext119.setTextColor(0xFF000000);
					edittext121.setTextColor(0xFF000000);
					edittext122.setTextColor(0xFF000000);
					linear475.setVisibility(View.VISIBLE);
					edittext116.setText("");
					edittext117.setText("");
					edittext118.setTextColor(0xFF000000);
					linear469.setVisibility(View.VISIBLE);
					edittext113.setText("");
					edittext114.setText("");
					edittext115.setTextColor(0xFF000000);
					linear525.setVisibility(View.GONE);
					button77.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button83.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear576.setVisibility(View.VISIBLE);
					linear539.setVisibility(View.GONE);
					edittext94.setText("");
					edittext103.setText("");
					edittext175.setText("");
					edittext160.setText("");
					edittext158.setText("");
					edittext102.setTextColor(0xFF000000);
					edittext159.setTextColor(0xFF000000);
					edittext161.setTextColor(0xFF000000);
					linear552.setVisibility(View.VISIBLE);
					edittext168.setText("");
					edittext162.setText("");
					edittext176.setText("");
					edittext163.setText("");
					edittext164.setText("");
					edittext165.setTextColor(0xFF000000);
					edittext166.setTextColor(0xFF000000);
					edittext167.setTextColor(0xFF000000);
					textview1138.setText("• الطبقة الأسفلتية \n( طبقة الخرسانة الأسفلتية\n+ طبقة التشريب )");
					textview1137.setText("* سمك طبقة الأسفلت ( م )");
					textview1090.setText("سعر مقاول الباطن لبند الطبقة الأسفلتية ( جنيه / م٢ )");
					textview1099.setText("تكلفة الخرسانة الأسفلتية بطبقة الأسفلت ( جنيه )");
					textview1102.setText("تكلفة بند الطبقة الأسفلتية ( جنيه )");
					linear564.setVisibility(View.VISIBLE);
					edittext169.setText("");
					edittext170.setText("");
					edittext171.setText("");
					edittext174.setTextColor(0xFF000000);
					linear497.setVisibility(View.VISIBLE);
					textview1015.setText("• ردم برمال نظيفة موردة من خارج الموقع أعلي طبقة الأحلال أعلي المواسير ");
					textview1029.setText("سعر مقاول باطن بند الردم برمال نظيفة مورده من خارج الموقع ( جنيه / م٣ )");
					textview1026.setText("مكعب الردم برمال نظيفة موردة من خارج الموقع أعلي الأحلال أعلي المواسير ( م٣ / م.ط )");
					textview1032.setText("تكلفة بند الردم برمال نظيفة موردة من خارج الموقع أعلي الأحلال أعلي المواسير ( جنيه )");
					edittext120.setText("");
					edittext119.setTextColor(0xFF000000);
					edittext121.setTextColor(0xFF000000);
					edittext122.setTextColor(0xFF000000);
					linear475.setVisibility(View.VISIBLE);
					edittext116.setText("");
					edittext117.setText("");
					edittext118.setTextColor(0xFF000000);
					linear469.setVisibility(View.VISIBLE);
					edittext113.setText("");
					edittext114.setText("");
					edittext115.setTextColor(0xFF000000);
					linear525.setVisibility(View.GONE);
					button77.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button84.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear576.setVisibility(View.VISIBLE);
					linear539.setVisibility(View.VISIBLE);
					edittext94.setText("");
					edittext103.setText("");
					edittext175.setText("");
					edittext160.setText("");
					edittext158.setText("");
					edittext102.setTextColor(0xFF000000);
					edittext159.setTextColor(0xFF000000);
					edittext161.setTextColor(0xFF000000);
					linear552.setVisibility(View.VISIBLE);
					edittext168.setText("");
					edittext162.setText("");
					edittext176.setText("");
					edittext163.setText("");
					edittext164.setText("");
					edittext165.setTextColor(0xFF000000);
					edittext166.setTextColor(0xFF000000);
					edittext167.setTextColor(0xFF000000);
					textview1138.setText("• الطبقة الأسفلتية الرابطة\n( الطبقة الرابطة كخرسانة أسفلتية\n+ طبقة التشريب )");
					textview1137.setText("* سمك طبقة الأسفلت الرابطة ( م )");
					textview1090.setText("سعر مقاول الباطن لبند الطبقة الأسفلتية الرابطة ( جنيه / م٢ )");
					textview1099.setText("تكلفة الخرسانة الأسفلتية بطبقة الأسفلت الرابطة ( جنيه )");
					textview1102.setText("تكلفة بند الطبقة الأسفلتية الرابطة ( جنيه )");
					linear564.setVisibility(View.VISIBLE);
					edittext169.setText("");
					edittext170.setText("");
					edittext171.setText("");
					edittext174.setTextColor(0xFF000000);
					linear497.setVisibility(View.VISIBLE);
					textview1015.setText("• ردم برمال نظيفة موردة من خارج الموقع أعلي طبقة الأحلال أعلي المواسير ");
					textview1029.setText("سعر مقاول باطن بند الردم برمال نظيفة مورده من خارج الموقع ( جنيه / م٣ )");
					textview1026.setText("مكعب الردم برمال نظيفة موردة من خارج الموقع أعلي الأحلال أعلي المواسير ( م٣ / م.ط )");
					textview1032.setText("تكلفة بند الردم برمال نظيفة موردة من خارج الموقع أعلي الأحلال أعلي المواسير ( جنيه )");
					edittext120.setText("");
					edittext119.setTextColor(0xFF000000);
					edittext121.setTextColor(0xFF000000);
					edittext122.setTextColor(0xFF000000);
					linear475.setVisibility(View.VISIBLE);
					edittext116.setText("");
					edittext117.setText("");
					edittext118.setTextColor(0xFF000000);
					linear469.setVisibility(View.VISIBLE);
					edittext113.setText("");
					edittext114.setText("");
					edittext115.setTextColor(0xFF000000);
					linear525.setVisibility(View.GONE);
					button77.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		imageview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear576.setVisibility(View.GONE);
				edittext94.setText("");
				edittext103.setText("");
				edittext175.setText("");
				edittext160.setText("");
				edittext158.setText("");
				edittext102.setTextColor(0xFF000000);
				edittext159.setTextColor(0xFF000000);
				edittext161.setTextColor(0xFF000000);
				edittext168.setText("");
				edittext162.setText("");
				edittext176.setText("");
				edittext163.setText("");
				edittext164.setText("");
				edittext165.setTextColor(0xFF000000);
				edittext166.setTextColor(0xFF000000);
				edittext167.setTextColor(0xFF000000);
				edittext169.setText("");
				edittext170.setText("");
				edittext171.setText("");
				edittext174.setTextColor(0xFF000000);
				edittext120.setText("");
				edittext119.setTextColor(0xFF000000);
				edittext121.setTextColor(0xFF000000);
				edittext122.setTextColor(0xFF000000);
				edittext116.setText("");
				edittext117.setText("");
				edittext118.setTextColor(0xFF000000);
				edittext113.setText("");
				edittext114.setText("");
				edittext115.setTextColor(0xFF000000);
				linear525.setVisibility(View.VISIBLE);
				button77.setVisibility(View.VISIBLE);
			}
		});
		
		edittext94.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext94.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1106.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "معدل الرش لطبقة اللصق ( مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٥٠ كجم / م٢ )\nوهو مدخل غير مؤثر في المعادلات");
				return true;
			}
		});
		
		edittext103.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext103.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext102.setText(String.valueOf(00.00));
				edittext161.setText(String.valueOf(00.00));
				edittext102.setTextColor(0xFFE91E63);
				edittext161.setTextColor(0xFFE91E63);
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
				edittext119.setText(String.valueOf(00.00d));
				edittext121.setText(String.valueOf(00.00d));
				edittext122.setText(String.valueOf(00.00d));
				edittext119.setTextColor(0xFFE91E63);
				edittext121.setTextColor(0xFFE91E63);
				edittext122.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1134.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* سمك طبقة الأسفلت الأخيرة ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٥ سم ( ٠.٠٥ م )");
				return true;
			}
		});
		
		edittext160.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext160.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext159.setText(String.valueOf(00.00));
				edittext161.setText(String.valueOf(00.00));
				edittext159.setTextColor(0xFFE91E63);
				edittext161.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button85.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext103.getText().toString().equals("") || edittext103.getText().toString().equals(".")) || (edittext103.getText().toString().equals("-") || (Double.parseDouble(edittext103.getText().toString()) < 0))) || ((edittext160.getText().toString().equals("") || edittext160.getText().toString().equals(".")) || (edittext160.getText().toString().equals("-") || (Double.parseDouble(edittext160.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext94.getText().toString().equals("") || edittext94.getText().toString().equals(".")) || (edittext94.getText().toString().equals("-") || (Double.parseDouble(edittext94.getText().toString()) < 0))) {
						edittext94.setText(String.valueOf(Double.parseDouble("0.50")));
					}
					if ((edittext175.getText().toString().equals("") || edittext175.getText().toString().equals(".")) || (edittext175.getText().toString().equals("-") || (Double.parseDouble(edittext175.getText().toString()) < 0))) {
						edittext175.setText(String.valueOf(Double.parseDouble("0.050")));
					}
					edittext158.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString()) * Double.parseDouble(edittext9.getText().toString())));
					edittext158.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext158.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext158.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext103.getText().toString().equals("") || edittext103.getText().toString().equals(".")) || (edittext103.getText().toString().equals("-") || (Double.parseDouble(edittext103.getText().toString()) < 0))) || ((edittext160.getText().toString().equals("") || edittext160.getText().toString().equals(".")) || (edittext160.getText().toString().equals("-") || (Double.parseDouble(edittext160.getText().toString()) < 0))))) {
					edittext102.setText(String.valueOf(00.00));
					edittext159.setText(String.valueOf(00.00));
					edittext161.setText(String.valueOf(00.00));
					edittext102.setTextColor(0xFFE91E63);
					edittext159.setTextColor(0xFFE91E63);
					edittext161.setTextColor(0xFFE91E63);
				}
				else {
					edittext102.setText(String.valueOf(Double.parseDouble(edittext103.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext159.setText(String.valueOf(Double.parseDouble(edittext160.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext161.setText(String.valueOf(Double.parseDouble(edittext159.getText().toString()) * Double.parseDouble(edittext102.getText().toString())));
					edittext102.setTextColor(0xFF000000);
					edittext159.setTextColor(0xFF000000);
					edittext161.setTextColor(0xFF000000);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1069.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "مسطح الطبقة المفروض = الطول ( ١ م.ط ) * عرض الترنش\n\" ولكن ممكن تكون بكامل عرض الطريق علي حسب الموصفة \"\n\" ناتج يمكن تعديله سيقوم البرنامج بحسابه علي عرض الترنش ويمكنك كمستخدم اعادة ادخاله بالعرض المراد ( م٢ / م.ط )");
				return true;
			}
		});
		
		edittext102.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext102.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext159.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext161.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		edittext168.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext168.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1109.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* معدل طبقة التشريب ( كجم / م٢ ( مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١.٥٠ كجم / م٢ )\nوهو مدخل غير مؤثر في المعادلات");
				return true;
			}
		});
		
		edittext162.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext162.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext165.setText(String.valueOf(00.00));
				edittext167.setText(String.valueOf(00.00));
				edittext165.setTextColor(0xFFE91E63);
				edittext167.setTextColor(0xFFE91E63);
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
				edittext119.setText(String.valueOf(00.00d));
				edittext121.setText(String.valueOf(00.00d));
				edittext122.setText(String.valueOf(00.00d));
				edittext119.setTextColor(0xFFE91E63);
				edittext121.setTextColor(0xFFE91E63);
				edittext122.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1137.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* سمك طبقة الأسفلت ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٥ سم ( ٠.٠٥ م )");
				return true;
			}
		});
		
		edittext163.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext163.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext166.setText(String.valueOf(00.00));
				edittext167.setText(String.valueOf(00.00));
				edittext166.setTextColor(0xFFE91E63);
				edittext167.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button86.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext162.getText().toString().equals("") || edittext162.getText().toString().equals(".")) || (edittext162.getText().toString().equals("-") || (Double.parseDouble(edittext162.getText().toString()) < 0))) || ((edittext163.getText().toString().equals("") || edittext163.getText().toString().equals(".")) || (edittext163.getText().toString().equals("-") || (Double.parseDouble(edittext163.getText().toString()) < 0)))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext168.getText().toString().equals("") || edittext168.getText().toString().equals(".")) || (edittext168.getText().toString().equals("-") || (Double.parseDouble(edittext168.getText().toString()) < 0))) {
						edittext168.setText(String.valueOf(Double.parseDouble("1.50")));
					}
					if ((edittext176.getText().toString().equals("") || edittext176.getText().toString().equals(".")) || (edittext176.getText().toString().equals("-") || (Double.parseDouble(edittext176.getText().toString()) < 0))) {
						edittext176.setText(String.valueOf(Double.parseDouble("0.050")));
					}
					edittext164.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString()) * Double.parseDouble(edittext9.getText().toString())));
					edittext164.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext164.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext164.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || (((edittext162.getText().toString().equals("") || edittext162.getText().toString().equals(".")) || (edittext162.getText().toString().equals("-") || (Double.parseDouble(edittext162.getText().toString()) < 0))) || ((edittext163.getText().toString().equals("") || edittext163.getText().toString().equals(".")) || (edittext163.getText().toString().equals("-") || (Double.parseDouble(edittext163.getText().toString()) < 0))))) {
					edittext165.setText(String.valueOf(00.00));
					edittext166.setText(String.valueOf(00.00));
					edittext167.setText(String.valueOf(00.00));
					edittext165.setTextColor(0xFFE91E63);
					edittext166.setTextColor(0xFFE91E63);
					edittext167.setTextColor(0xFFE91E63);
				}
				else {
					edittext165.setText(String.valueOf(Double.parseDouble(edittext162.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext166.setText(String.valueOf(Double.parseDouble(edittext163.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext167.setText(String.valueOf(Double.parseDouble(edittext165.getText().toString()) * Double.parseDouble(edittext166.getText().toString())));
					edittext165.setTextColor(0xFF000000);
					edittext166.setTextColor(0xFF000000);
					edittext167.setTextColor(0xFF000000);
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1093.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "مسطح الطبقة المفروض = الطول ( ١ م.ط ) * عرض الترنش\n\" ولكن ممكن تكون بكامل عرض الطريق علي حسب الموصفة \"\n\" ناتج يمكن تعديله سيقوم البرنامج بحسابه علي عرض الترنش ويمكنك كمستخدم اعادة ادخاله بالعرض المراد ( م٢ / م.ط )");
				return true;
			}
		});
		
		edittext165.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext165.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext166.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext167.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		edittext169.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext169.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext119.setText(String.valueOf(00.00d));
				edittext121.setText(String.valueOf(00.00d));
				edittext122.setText(String.valueOf(00.00d));
				edittext119.setTextColor(0xFFE91E63);
				edittext121.setTextColor(0xFFE91E63);
				edittext122.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1115.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "* سمك طبقة السن أو الأساس أسفل طبقة الأسفلت ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٣٠ م \"");
				return true;
			}
		});
		
		edittext170.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext170.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext174.setText(String.valueOf(00.00));
				edittext174.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button87.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext170.getText().toString().equals("") || edittext170.getText().toString().equals(".")) || (edittext170.getText().toString().equals("-") || (Double.parseDouble(edittext170.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext169.getText().toString().equals("") || edittext169.getText().toString().equals(".")) || (edittext169.getText().toString().equals("-") || (Double.parseDouble(edittext169.getText().toString()) < 0))) {
						edittext169.setText(String.valueOf(Double.parseDouble("0.30")));
					}
					edittext171.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString()) * Double.parseDouble(edittext9.getText().toString())));
					edittext171.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext171.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext158.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if (((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) || ((edittext170.getText().toString().equals("") || edittext170.getText().toString().equals(".")) || (edittext170.getText().toString().equals("-") || (Double.parseDouble(edittext170.getText().toString()) < 0)))) {
					edittext174.setText(String.valueOf(00.00));
					edittext174.setTextColor(0xFFE91E63);
				}
				else {
					edittext174.setText(String.valueOf(Double.parseDouble(edittext170.getText().toString()) * Double.parseDouble(_charSeq)));
					edittext174.setTextColor(0xFF000000);
				}
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
				edittext174.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		button67.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (((edittext120.getText().toString().equals("") || edittext120.getText().toString().equals(".")) || (edittext120.getText().toString().equals("-") || (Double.parseDouble(edittext120.getText().toString()) < 0))) || (((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (linear539.getVisibility() == View.VISIBLE) {
						if (((edittext175.getText().toString().equals("") || edittext175.getText().toString().equals(".")) || (edittext175.getText().toString().equals("-") || (Double.parseDouble(edittext175.getText().toString()) < 0))) || (((edittext176.getText().toString().equals("") || edittext176.getText().toString().equals(".")) || (edittext176.getText().toString().equals("-") || (Double.parseDouble(edittext176.getText().toString()) < 0))) || ((edittext169.getText().toString().equals("") || edittext169.getText().toString().equals(".")) || (edittext169.getText().toString().equals("-") || (Double.parseDouble(edittext169.getText().toString()) < 0))))) {
							SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
						}
						else {
							if ((Double.parseDouble(edittext10.getText().toString()) - (((Double.parseDouble(edittext2.getText().toString()) / 1000) + Double.parseDouble(edittext6.getText().toString())) + (Double.parseDouble(edittext175.getText().toString()) + (Double.parseDouble(edittext176.getText().toString()) + Double.parseDouble(edittext169.getText().toString()))))) < 0) {
								SketchwareUtil.showMessage(getApplicationContext(), "من فضلك برجاء مراجعة جميع الأبعاد والارتفاعات حيث ان ارتفاع الردم بالسالب أى أقل من صفر وهذا غير منطقي وغير هندسي");
							}
							else {
								edittext119.setText(String.valueOf(Double.parseDouble(edittext10.getText().toString()) - (((Double.parseDouble(edittext2.getText().toString()) / 1000) + Double.parseDouble(edittext6.getText().toString())) + (Double.parseDouble(edittext175.getText().toString()) + (Double.parseDouble(edittext176.getText().toString()) + Double.parseDouble(edittext169.getText().toString()))))));
							}
						}
					}
					else {
						if (linear552.getVisibility() == View.VISIBLE) {
							if (((edittext176.getText().toString().equals("") || edittext176.getText().toString().equals(".")) || (edittext176.getText().toString().equals("-") || (Double.parseDouble(edittext176.getText().toString()) < 0))) || ((edittext169.getText().toString().equals("") || edittext169.getText().toString().equals(".")) || (edittext169.getText().toString().equals("-") || (Double.parseDouble(edittext169.getText().toString()) < 0)))) {
								SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
							}
							else {
								if ((Double.parseDouble(edittext10.getText().toString()) - (((Double.parseDouble(edittext2.getText().toString()) / 1000) + Double.parseDouble(edittext6.getText().toString())) + (Double.parseDouble(edittext176.getText().toString()) + Double.parseDouble(edittext169.getText().toString())))) < 0) {
									SketchwareUtil.showMessage(getApplicationContext(), "من فضلك برجاء مراجعة جميع الأبعاد والارتفاعات حيث ان ارتفاع الردم بالسالب أى أقل من صفر وهذا غير منطقي وغير هندسي");
								}
								else {
									edittext119.setText(String.valueOf(Double.parseDouble(edittext10.getText().toString()) - (((Double.parseDouble(edittext2.getText().toString()) / 1000) + Double.parseDouble(edittext6.getText().toString())) + (Double.parseDouble(edittext176.getText().toString()) + Double.parseDouble(edittext169.getText().toString())))));
								}
							}
						}
						else {
							if ((Double.parseDouble(edittext10.getText().toString()) - ((Double.parseDouble(edittext2.getText().toString()) / 1000) + Double.parseDouble(edittext6.getText().toString()))) < 0) {
								SketchwareUtil.showMessage(getApplicationContext(), "من فضلك برجاء مراجعة جميع الأبعاد والارتفاعات حيث ان ارتفاع الردم بالسالب أى أقل من صفر وهذا غير منطقي وغير هندسي");
							}
							else {
								edittext119.setText(String.valueOf(Double.parseDouble(edittext10.getText().toString()) - ((Double.parseDouble(edittext2.getText().toString()) / 1000) + Double.parseDouble(edittext6.getText().toString()))));
							}
						}
					}
					edittext121.setText(String.valueOf(Double.parseDouble(edittext8.getText().toString()) * (Double.parseDouble(edittext9.getText().toString()) * Double.parseDouble(edittext119.getText().toString()))));
					edittext122.setText(String.valueOf(Double.parseDouble(edittext121.getText().toString()) * Double.parseDouble(edittext120.getText().toString())));
					edittext119.setTextColor(0xFF000000);
					edittext121.setTextColor(0xFF000000);
					edittext122.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext119.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext119.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		edittext116.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext116.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext118.setText(String.valueOf(00.00));
				edittext118.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button64.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext116.getText().toString().equals("") || edittext116.getText().toString().equals(".")) || (edittext116.getText().toString().equals("-") || (Double.parseDouble(edittext116.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext117.getText().toString().equals("") || edittext117.getText().toString().equals(".")) || (edittext117.getText().toString().equals("-") || (Double.parseDouble(edittext117.getText().toString()) < 0))) {
						if (linear552.getVisibility() == View.VISIBLE) {
							edittext117.setText(String.valueOf(Double.parseDouble(edittext105.getText().toString())));
						}
						else {
							if ((((edittext5.getText().toString().equals("") || edittext5.getText().toString().equals(".")) || (edittext5.getText().toString().equals("-") || (Double.parseDouble(edittext5.getText().toString()) < 0))) || ((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0)))) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0)))) {
								SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
							}
							else {
								edittext117.setText(String.valueOf((Double.parseDouble(edittext8.getText().toString()) * Double.parseDouble(edittext9.getText().toString())) * (Double.parseDouble(edittext5.getText().toString()) + ((Double.parseDouble(edittext2.getText().toString()) / 1000) + Double.parseDouble(edittext6.getText().toString())))));
							}
						}
					}
					else {
						edittext117.setText(String.valueOf(Double.parseDouble(edittext117.getText().toString())));
					}
					edittext118.setText(String.valueOf(Double.parseDouble(edittext117.getText().toString()) * Double.parseDouble(edittext116.getText().toString())));
					edittext118.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext117.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext117.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext116.getText().toString().equals("") || edittext116.getText().toString().equals(".")) || (edittext116.getText().toString().equals("-") || (Double.parseDouble(edittext116.getText().toString()) < 0))) {
					edittext118.setText(String.valueOf(00.00));
				}
				else {
					if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
						edittext118.setText(String.valueOf(00.00));
					}
					else {
						edittext118.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext116.getText().toString())));
						edittext118.setTextColor(0xFF000000);
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
		
		edittext118.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext118.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		edittext114.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext114.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext115.setText(String.valueOf(00.00d));
				edittext115.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button63.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext114.getText().toString().equals("") || edittext114.getText().toString().equals(".")) || (edittext114.getText().toString().equals("-") || (Double.parseDouble(edittext114.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext113.getText().toString().equals("") || edittext113.getText().toString().equals(".")) || (edittext113.getText().toString().equals("-") || (Double.parseDouble(edittext113.getText().toString()) < 0))) {
						if (linear552.getVisibility() == View.VISIBLE) {
							edittext113.setText(String.valueOf(Double.parseDouble("0.00")));
						}
						else {
							if (((edittext2.getText().toString().equals("") || edittext2.getText().toString().equals(".")) || (edittext2.getText().toString().equals("-") || (Double.parseDouble(edittext2.getText().toString()) < 0))) || ((edittext6.getText().toString().equals("") || edittext6.getText().toString().equals(".")) || (edittext6.getText().toString().equals("-") || (Double.parseDouble(edittext6.getText().toString()) < 0)))) {
								SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
							}
							else {
								edittext113.setText(String.valueOf((Double.parseDouble(edittext8.getText().toString()) * Double.parseDouble(edittext9.getText().toString())) * (Double.parseDouble(edittext10.getText().toString()) - ((Double.parseDouble(edittext2.getText().toString()) / 1000) + Double.parseDouble(edittext6.getText().toString())))));
							}
						}
					}
					else {
						edittext113.setText(String.valueOf(Double.parseDouble(edittext113.getText().toString())));
					}
					edittext115.setText(String.valueOf(Double.parseDouble(edittext113.getText().toString()) * Double.parseDouble(edittext114.getText().toString())));
					edittext113.setTextColor(0xFF000000);
					edittext115.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext113.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext113.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				if ((edittext114.getText().toString().equals("") || edittext114.getText().toString().equals(".")) || (edittext114.getText().toString().equals("-") || (Double.parseDouble(edittext114.getText().toString()) < 0))) {
					edittext115.setText(String.valueOf(00.00));
				}
				else {
					if ((_charSeq.equals("") || _charSeq.equals(".")) || (_charSeq.equals("-") || (Double.parseDouble(_charSeq) < 0))) {
						edittext115.setText(String.valueOf(00.00));
					}
					else {
						edittext115.setText(String.valueOf(Double.parseDouble(_charSeq) * Double.parseDouble(edittext114.getText().toString())));
						edittext115.setTextColor(0xFF000000);
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
		
		edittext115.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext115.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
				edittext63.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		imageview19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear581.setVisibility(View.GONE);
				edittext178.setText("");
				button89.setVisibility(View.VISIBLE);
			}
		});
		
		edittext178.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext178.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		imageview20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear585.setVisibility(View.GONE);
				edittext179.setText("");
				button102.setVisibility(View.VISIBLE);
			}
		});
		
		edittext179.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext179.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		imageview26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear609.setVisibility(View.GONE);
				edittext185.setText("");
				button108.setVisibility(View.VISIBLE);
			}
		});
		
		edittext185.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext185.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		imageview22.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear593.setVisibility(View.GONE);
				edittext181.setText("");
				button104.setVisibility(View.VISIBLE);
			}
		});
		
		edittext181.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext181.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		imageview37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear656.setVisibility(View.GONE);
				edittext195.setText("");
				button121.setVisibility(View.VISIBLE);
			}
		});
		
		edittext195.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext195.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		imageview38.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear660.setVisibility(View.GONE);
				edittext196.setText("");
				button122.setVisibility(View.VISIBLE);
			}
		});
		
		edittext196.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext196.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		imageview36.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear652.setVisibility(View.GONE);
				edittext194.setText("");
				button120.setVisibility(View.VISIBLE);
			}
		});
		
		edittext194.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext194.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		imageview24.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear601.setVisibility(View.GONE);
				edittext183.setText("");
				button106.setVisibility(View.VISIBLE);
			}
		});
		
		edittext183.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext183.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
		
		imageview27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear613.setVisibility(View.GONE);
				edittext186.setText("");
				button109.setVisibility(View.VISIBLE);
			}
		});
		
		edittext186.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext186.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
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
					if ((edittext190.getText().toString().equals("") || edittext190.getText().toString().equals(".")) || (edittext190.getText().toString().equals("-") || (Double.parseDouble(edittext190.getText().toString()) < 0))) {
						edittext190.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext107.getText().toString().equals("") || edittext107.getText().toString().equals(".")) || (edittext107.getText().toString().equals("-") || (Double.parseDouble(edittext107.getText().toString()) < 0))) {
						edittext107.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext197.getText().toString().equals("") || edittext197.getText().toString().equals(".")) || (edittext197.getText().toString().equals("-") || (Double.parseDouble(edittext197.getText().toString()) < 0))) {
						edittext197.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext178.getText().toString().equals("") || edittext178.getText().toString().equals(".")) || (edittext178.getText().toString().equals("-") || (Double.parseDouble(edittext178.getText().toString()) < 0))) {
						edittext178.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext179.getText().toString().equals("") || edittext179.getText().toString().equals(".")) || (edittext179.getText().toString().equals("-") || (Double.parseDouble(edittext179.getText().toString()) < 0))) {
						edittext179.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext185.getText().toString().equals("") || edittext185.getText().toString().equals(".")) || (edittext185.getText().toString().equals("-") || (Double.parseDouble(edittext185.getText().toString()) < 0))) {
						edittext185.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext180.getText().toString().equals("") || edittext180.getText().toString().equals(".")) || (edittext180.getText().toString().equals("-") || (Double.parseDouble(edittext180.getText().toString()) < 0))) {
						edittext180.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext181.getText().toString().equals("") || edittext181.getText().toString().equals(".")) || (edittext181.getText().toString().equals("-") || (Double.parseDouble(edittext181.getText().toString()) < 0))) {
						edittext181.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext195.getText().toString().equals("") || edittext195.getText().toString().equals(".")) || (edittext195.getText().toString().equals("-") || (Double.parseDouble(edittext195.getText().toString()) < 0))) {
						edittext195.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext196.getText().toString().equals("") || edittext196.getText().toString().equals(".")) || (edittext196.getText().toString().equals("-") || (Double.parseDouble(edittext196.getText().toString()) < 0))) {
						edittext196.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext194.getText().toString().equals("") || edittext194.getText().toString().equals(".")) || (edittext194.getText().toString().equals("-") || (Double.parseDouble(edittext194.getText().toString()) < 0))) {
						edittext194.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext182.getText().toString().equals("") || edittext182.getText().toString().equals(".")) || (edittext182.getText().toString().equals("-") || (Double.parseDouble(edittext182.getText().toString()) < 0))) {
						edittext182.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext191.getText().toString().equals("") || edittext191.getText().toString().equals(".")) || (edittext191.getText().toString().equals("-") || (Double.parseDouble(edittext191.getText().toString()) < 0))) {
						edittext191.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext192.getText().toString().equals("") || edittext192.getText().toString().equals(".")) || (edittext192.getText().toString().equals("-") || (Double.parseDouble(edittext192.getText().toString()) < 0))) {
						edittext192.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext183.getText().toString().equals("") || edittext183.getText().toString().equals(".")) || (edittext183.getText().toString().equals("-") || (Double.parseDouble(edittext183.getText().toString()) < 0))) {
						edittext183.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext184.getText().toString().equals("") || edittext184.getText().toString().equals(".")) || (edittext184.getText().toString().equals("-") || (Double.parseDouble(edittext184.getText().toString()) < 0))) {
						edittext184.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext186.getText().toString().equals("") || edittext186.getText().toString().equals(".")) || (edittext186.getText().toString().equals("-") || (Double.parseDouble(edittext186.getText().toString()) < 0))) {
						edittext186.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if ((edittext187.getText().toString().equals("") || edittext187.getText().toString().equals(".")) || (edittext187.getText().toString().equals("-") || (Double.parseDouble(edittext187.getText().toString()) < 0))) {
						edittext187.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					edittext189.setText(String.valueOf(((((Double.parseDouble(edittext106.getText().toString()) + (Double.parseDouble(edittext190.getText().toString()) + Double.parseDouble(edittext107.getText().toString()))) + (Double.parseDouble(edittext112.getText().toString()) + Double.parseDouble(edittext161.getText().toString()))) + ((Double.parseDouble(edittext167.getText().toString()) + Double.parseDouble(edittext174.getText().toString())) + (Double.parseDouble(edittext122.getText().toString()) + Double.parseDouble(edittext118.getText().toString())))) + ((Double.parseDouble(edittext115.getText().toString()) + Double.parseDouble(edittext63.getText().toString())) + (Double.parseDouble(edittext178.getText().toString()) + Double.parseDouble(edittext179.getText().toString())))) + (((Double.parseDouble(edittext185.getText().toString()) + Double.parseDouble(edittext180.getText().toString())) + ((Double.parseDouble(edittext181.getText().toString()) + Double.parseDouble(edittext182.getText().toString())) + (Double.parseDouble(edittext183.getText().toString()) + Double.parseDouble(edittext184.getText().toString())))) + ((Double.parseDouble(edittext186.getText().toString()) + Double.parseDouble(edittext187.getText().toString())) + ((Double.parseDouble(edittext191.getText().toString()) + Double.parseDouble(edittext192.getText().toString())) + ((Double.parseDouble(edittext194.getText().toString()) + Double.parseDouble(edittext195.getText().toString())) + (Double.parseDouble(edittext196.getText().toString()) + Double.parseDouble(edittext197.getText().toString()))))))));
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
		
		button9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext63.getText().toString().equals("") || edittext63.getText().toString().equals(".")) || (edittext63.getText().toString().equals("-") || (Double.parseDouble(edittext63.getText().toString()) < 0))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if ((edittext65.getText().toString().equals("") || edittext65.getText().toString().equals(".")) || (edittext65.getText().toString().equals("-") || (Double.parseDouble(edittext65.getText().toString()) < 0))) {
						edittext65.setText(String.valueOf(30.4d));
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
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة فرق الفعلي عن الهندسي\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ١٥ % \"");
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
				SketchwareUtil.showMessage(getApplicationContext(), "* نسبة مصاريف التصميم والأستشاري المصمم\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٠.٥٠ % \"");
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
				SketchwareUtil.showMessage(getApplicationContext(), "الدمغات\n\" نسبة إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة ٥ % \"");
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
				_fghhh(linear1);
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
		linear467.setVisibility(View.GONE);
		linear458.setVisibility(View.GONE);
		linear577.setVisibility(View.GONE);
		linear581.setVisibility(View.GONE);
		linear585.setVisibility(View.GONE);
		linear609.setVisibility(View.GONE);
		linear589.setVisibility(View.GONE);
		linear593.setVisibility(View.GONE);
		linear597.setVisibility(View.GONE);
		linear601.setVisibility(View.GONE);
		linear605.setVisibility(View.GONE);
		linear613.setVisibility(View.GONE);
		linear617.setVisibility(View.GONE);
		linear537.setVisibility(View.GONE);
		linear623.setVisibility(View.GONE);
		linear526.setVisibility(View.GONE);
		linear449.setVisibility(View.GONE);
		linear525.setVisibility(View.GONE);
		linear538.setVisibility(View.GONE);
		linear576.setVisibility(View.GONE);
		linear624.setVisibility(View.GONE);
		linear429.setVisibility(View.GONE);
		linear444.setVisibility(View.GONE);
		linear628.setVisibility(View.GONE);
		linear640.setVisibility(View.GONE);
		linear644.setVisibility(View.GONE);
		linear648.setVisibility(View.GONE);
		linear652.setVisibility(View.GONE);
		linear656.setVisibility(View.GONE);
		linear660.setVisibility(View.GONE);
		linear664.setVisibility(View.GONE);
		
		{
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
	public void _fghhh(final View _view) {
		Bitmap bm = Bitmap.createBitmap(_view.getWidth(), _view.getHeight(),Bitmap.Config.ARGB_8888); 
		Canvas canvas = new Canvas(bm);
		android.graphics.drawable.Drawable bgDrawable =_view.getBackground();
		_view.setDrawingCacheEnabled(true);
		
		if (bgDrawable!=null) {
				bgDrawable.draw(canvas);
		} else {
				canvas.drawColor(Color.WHITE);}
		_view.draw(canvas);
		PrintHelper printHelper = new PrintHelper(getApplicationContext()); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
}
