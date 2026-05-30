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


public class ToipccreinforcedconcretecolumnssActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private String path = "";
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview1;
	private LinearLayout linear176;
	private LinearLayout linear2;
	private TextView textview524;
	private LinearLayout linear75;
	private TextView textview519;
	private LinearLayout linear351;
	private TextView textview525;
	private LinearLayout linear255;
	private LinearLayout linear178;
	private LinearLayout linear140;
	private LinearLayout linear290;
	private LinearLayout linear301;
	private LinearLayout linear713;
	private TextView textview2061;
	private LinearLayout linear386;
	private LinearLayout linear172;
	private LinearLayout linear173;
	private LinearLayout linear175;
	private LinearLayout linear289;
	private TextView textview555;
	private Button button200;
	private LinearLayout linear873;
	private LinearLayout linear707;
	private TextView textview2060;
	private TextView textview583;
	private EditText edittext129;
	private TextView textview579;
	private EditText edittext125;
	private TextView textview580;
	private TextView textview585;
	private TextView textview584;
	private TextView textview808;
	private TextView textview809;
	private TextView textview1966;
	private TextView textview2;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear240;
	private LinearLayout linear13;
	private LinearLayout linear864;
	private TextView textview1072;
	private TextView textview1074;
	private LinearLayout linear821;
	private TextView textview1410;
	private LinearLayout linear434;
	private TextView textview195;
	private LinearLayout linear512;
	private LinearLayout linear689;
	private TextView textview1955;
	private LinearLayout linear655;
	private LinearLayout linear237;
	private LinearLayout linear3;
	private LinearLayout linear6;
	private LinearLayout linear5;
	private LinearLayout linear4;
	private TextView textview5;
	private EditText edittext2;
	private TextView textview15;
	private TextView textview11;
	private EditText edittext4;
	private TextView textview4;
	private TextView L1;
	private EditText edittext1;
	private TextView textview14;
	private TextView textview7;
	private EditText edittext3;
	private Button button1;
	private TextView textview708;
	private EditText edittext5;
	private TextView textview13;
	private TextView textview12;
	private Button button49;
	private TextView textview594;
	private Button button50;
	private LinearLayout linear84;
	private LinearLayout linear165;
	private TextView textview1311;
	private EditText edittext222fm1;
	private TextView textview230;
	private TextView textview231;
	private TextView textview596;
	private EditText edittext223fm1;
	private TextView textview426;
	private TextView textview420;
	private TextView textview1091;
	private TextView textview1265;
	private TextView textview1250;
	private LinearLayout linear514;
	private LinearLayout linear515;
	private LinearLayout linear139;
	private LinearLayout linear517;
	private TextView textview545;
	private LinearLayout linear537;
	private LinearLayout linear520;
	private TextView textview203;
	private LinearLayout linear177;
	private LinearLayout linear179;
	private TextView textview204;
	private LinearLayout linear510;
	private TextView textview229;
	private TextView textview1246;
	private LinearLayout linear717;
	private LinearLayout linear538;
	private LinearLayout linear718;
	private LinearLayout linear511;
	private LinearLayout linear608;
	private LinearLayout linear719;
	private LinearLayout linear753;
	private TextView textview1270;
	private EditText edittext224fm1;
	private TextView textview1255;
	private TextView textview196;
	private TextView textview1269;
	private EditText edittext225fm1;
	private TextView textview317;
	private TextView textview1256;
	private EditText edittext226fm1;
	private TextView textview1259;
	private TextView textview1260;
	private TextView textview1252;
	private EditText edittext227fm1;
	private TextView textview405;
	private TextView textview406;
	private Button button27;
	private TextView textview394;
	private TextView textview395;
	private LinearLayout linear544;
	private LinearLayout linear155;
	private TextView textview398;
	private TextView textview397;
	private TextView textview396;
	private TextView textview1264;
	private EditText edittext228fm1;
	private TextView textview401;
	private TextView textview402;
	private TextView textview589;
	private EditText edittext229fm1;
	private TextView textview588;
	private TextView textview199;
	private TextView textview1312;
	private EditText edittext230fm1;
	private TextView textview201;
	private TextView textview202;
	private TextView textview284;
	private EditText edittext231fm1;
	private TextView textview1245;
	private TextView textview205;
	private Button button150;
	private TextView textview1724;
	private Button button151;
	private Button button106;
	private TextView textview1316;
	private Button button107;
	private Button button152;
	private TextView textview1725;
	private Button button153;
	private TextView textview228;
	private LinearLayout linear513;
	private LinearLayout linear112;
	private LinearLayout linear164;
	private TextView textview254;
	private LinearLayout linear539;
	private LinearLayout linear540;
	private LinearLayout linear541;
	private LinearLayout linear542;
	private TextView textview248;
	private LinearLayout linear543;
	private TextView textview290;
	private LinearLayout linear549;
	private LinearLayout linear181;
	private LinearLayout linear588;
	private LinearLayout linear594;
	private LinearLayout linear600;
	private TextView textview227;
	private EditText edittext232fm1;
	private TextView textview318;
	private TextView textview260;
	private TextView textview1317;
	private EditText edittext233fm1;
	private TextView textview1247;
	private TextView textview232;
	private TextView textview1319;
	private EditText edittext234fm1;
	private TextView textview1248;
	private TextView textview1249;
	private Button button33;
	private TextView textview285;
	private EditText edittext235fm1;
	private TextView textview233;
	private TextView textview234;
	private TextView textview239;
	private EditText edittext236fm1;
	private TextView textview236;
	private TextView textview237;
	private TextView textview1321;
	private EditText edittext237fm1;
	private TextView textview1320;
	private TextView textview240;
	private TextView textview1322;
	private EditText edittext238fm1;
	private TextView textview242;
	private TextView textview243;
	private TextView textview1323;
	private Button button109;
	private TextView textview245;
	private TextView textview246;
	private LinearLayout linear546;
	private LinearLayout linear547;
	private TextView textview253;
	private LinearLayout linear399;
	private LinearLayout linear548;
	private LinearLayout linear578;
	private TextView textview238;
	private EditText edittext239fm1;
	private TextView textview241;
	private TextView textview249;
	private TextView textview247;
	private EditText edittext240fm1;
	private TextView textview235;
	private TextView textview258;
	private Button button37;
	private TextView textview259;
	private EditText edittext241fm1;
	private TextView textview198;
	private TextView textview250;
	private Button button114;
	private TextView textview1380;
	private Button button115;
	private TextView textview207;
	private TextView textview1382;
	private LinearLayout linear589;
	private LinearLayout linear590;
	private TextView textview1383;
	private LinearLayout linear591;
	private LinearLayout linear592;
	private LinearLayout linear593;
	private TextView textview1385;
	private EditText edittext242fm1;
	private TextView textview1386;
	private TextView textview1387;
	private TextView textview1388;
	private EditText edittext243fm1;
	private TextView textview1389;
	private TextView textview1390;
	private Button button118;
	private TextView textview1391;
	private EditText edittext244fm1;
	private TextView textview1392;
	private TextView textview1393;
	private Button button119;
	private TextView textview1394;
	private Button button120;
	private TextView textview1384;
	private TextView textview1395;
	private LinearLayout linear595;
	private LinearLayout linear596;
	private TextView textview1396;
	private LinearLayout linear597;
	private LinearLayout linear598;
	private LinearLayout linear599;
	private TextView textview1398;
	private EditText edittext245fm1;
	private TextView textview1399;
	private TextView textview1400;
	private TextView textview1401;
	private EditText edittext246fm1;
	private TextView textview1402;
	private TextView textview1403;
	private Button button121;
	private TextView textview1404;
	private EditText edittext247fm1;
	private TextView textview1405;
	private TextView textview1406;
	private Button button122;
	private TextView textview1407;
	private Button button123;
	private TextView textview1397;
	private TextView textview1408;
	private LinearLayout linear601;
	private LinearLayout linear602;
	private TextView textview1409;
	private LinearLayout linear603;
	private LinearLayout linear604;
	private LinearLayout linear605;
	private TextView textview1411;
	private EditText edittext248fm1;
	private TextView textview1412;
	private TextView textview1413;
	private TextView textview1414;
	private EditText edittext249fm1;
	private TextView textview1415;
	private TextView textview1416;
	private Button button124;
	private TextView textview1417;
	private EditText edittext250fm1;
	private TextView textview1418;
	private TextView textview1419;
	private Button button125;
	private TextView textview1420;
	private TextView textview1422;
	private LinearLayout linear609;
	private LinearLayout linear610;
	private LinearLayout linear611;
	private TextView textview1423;
	private LinearLayout linear612;
	private LinearLayout linear613;
	private LinearLayout linear614;
	private LinearLayout linear615;
	private TextView textview1424;
	private LinearLayout linear616;
	private TextView textview1425;
	private LinearLayout linear617;
	private LinearLayout linear618;
	private LinearLayout linear619;
	private LinearLayout linear620;
	private LinearLayout linear621;
	private TextView textview1429;
	private EditText edittext251fm1;
	private TextView textview1430;
	private TextView textview1431;
	private TextView textview1432;
	private EditText edittext252fm1;
	private TextView textview1433;
	private TextView textview1434;
	private TextView textview1435;
	private EditText edittext253fm1;
	private TextView textview1436;
	private TextView textview1437;
	private Button button126;
	private TextView textview1438;
	private EditText edittext254fm1;
	private TextView textview1439;
	private TextView textview1440;
	private TextView textview1441;
	private EditText edittext255fm1;
	private TextView textview1442;
	private TextView textview1443;
	private TextView textview1444;
	private EditText edittext256fm1;
	private TextView textview1445;
	private TextView textview1446;
	private TextView textview1447;
	private EditText edittext257fm1;
	private TextView textview1448;
	private TextView textview1449;
	private TextView textview1450;
	private Button button127;
	private TextView textview1426;
	private TextView textview1451;
	private LinearLayout linear622;
	private LinearLayout linear623;
	private TextView textview1452;
	private LinearLayout linear624;
	private LinearLayout linear625;
	private LinearLayout linear626;
	private TextView textview1454;
	private EditText edittext258fm1;
	private TextView textview1455;
	private TextView textview1456;
	private TextView textview1457;
	private EditText edittext259fm1;
	private TextView textview1458;
	private TextView textview1459;
	private Button button128;
	private TextView textview1460;
	private EditText edittext260fm1;
	private TextView textview1461;
	private TextView textview1462;
	private Button button129;
	private TextView textview1463;
	private Button button130;
	private TextView textview1453;
	private TextView textview1464;
	private LinearLayout linear627;
	private LinearLayout linear628;
	private TextView textview1465;
	private LinearLayout linear629;
	private LinearLayout linear630;
	private LinearLayout linear631;
	private TextView textview1467;
	private EditText edittext261fm1;
	private TextView textview1468;
	private TextView textview1469;
	private TextView textview1470;
	private EditText edittext262fm1;
	private TextView textview1471;
	private TextView textview1472;
	private Button button131;
	private TextView textview1473;
	private EditText edittext263fm1;
	private TextView textview1474;
	private TextView textview1475;
	private Button button132;
	private TextView textview1476;
	private Button button133;
	private TextView textview1466;
	private TextView textview1477;
	private LinearLayout linear632;
	private LinearLayout linear633;
	private TextView textview1478;
	private LinearLayout linear634;
	private LinearLayout linear635;
	private LinearLayout linear636;
	private TextView textview1480;
	private EditText edittext264fm1;
	private TextView textview1481;
	private TextView textview1482;
	private TextView textview1483;
	private EditText edittext265fm1;
	private TextView textview1484;
	private TextView textview1485;
	private Button button134;
	private TextView textview1486;
	private EditText edittext266fm1;
	private TextView textview1487;
	private TextView textview1488;
	private Button button135;
	private TextView textview1489;
	private Button button136;
	private TextView textview1479;
	private TextView textview1490;
	private LinearLayout linear637;
	private LinearLayout linear638;
	private TextView textview1491;
	private LinearLayout linear639;
	private LinearLayout linear640;
	private LinearLayout linear641;
	private TextView textview1493;
	private EditText edittext267fm1;
	private TextView textview1494;
	private TextView textview1495;
	private TextView textview1496;
	private EditText edittext268fm1;
	private TextView textview1497;
	private TextView textview1498;
	private Button button137;
	private TextView textview1499;
	private EditText edittext269fm1;
	private TextView textview1500;
	private TextView textview1501;
	private Button button138;
	private TextView textview1502;
	private TextView textview1726;
	private LinearLayout linear720;
	private LinearLayout linear721;
	private LinearLayout linear724;
	private TextView textview1727;
	private LinearLayout linear723;
	private LinearLayout linear725;
	private LinearLayout linear726;
	private TextView textview1728;
	private LinearLayout linear727;
	private TextView textview1729;
	private LinearLayout linear728;
	private LinearLayout linear729;
	private LinearLayout linear730;
	private LinearLayout linear731;
	private LinearLayout linear732;
	private TextView textview1731;
	private EditText edittext270fm1;
	private TextView textview1732;
	private TextView textview1733;
	private TextView textview1734;
	private EditText edittext271fm1;
	private TextView textview1735;
	private TextView textview1736;
	private TextView textview1740;
	private EditText edittext272fm1;
	private TextView textview1741;
	private TextView textview1742;
	private Button button154;
	private TextView textview1743;
	private EditText edittext273fm1;
	private TextView textview1744;
	private TextView textview1745;
	private TextView textview1746;
	private EditText edittext274fm1;
	private TextView textview1747;
	private TextView textview1748;
	private TextView textview1749;
	private EditText edittext275fm1;
	private TextView textview1750;
	private TextView textview1751;
	private TextView textview1752;
	private Button button155;
	private TextView textview1730;
	private TextView textview1753;
	private LinearLayout linear733;
	private LinearLayout linear734;
	private TextView textview1754;
	private LinearLayout linear735;
	private LinearLayout linear736;
	private LinearLayout linear737;
	private TextView textview1756;
	private EditText edittext276fm1;
	private TextView textview1757;
	private TextView textview1758;
	private TextView textview1759;
	private EditText edittext277fm1;
	private TextView textview1760;
	private TextView textview1761;
	private Button button156;
	private TextView textview1762;
	private EditText edittext278fm1;
	private TextView textview1763;
	private TextView textview1764;
	private Button button157;
	private TextView textview1765;
	private Button button158;
	private TextView textview1755;
	private TextView textview1766;
	private LinearLayout linear738;
	private LinearLayout linear739;
	private TextView textview1767;
	private LinearLayout linear740;
	private LinearLayout linear741;
	private LinearLayout linear742;
	private TextView textview1769;
	private EditText edittext279fm1;
	private TextView textview1770;
	private TextView textview1771;
	private TextView textview1772;
	private EditText edittext280fm1;
	private TextView textview1773;
	private TextView textview1774;
	private Button button159;
	private TextView textview1775;
	private EditText edittext281fm1;
	private TextView textview1776;
	private TextView textview1777;
	private Button button160;
	private TextView textview1778;
	private Button button161;
	private TextView textview1768;
	private TextView textview1779;
	private LinearLayout linear743;
	private LinearLayout linear744;
	private TextView textview1780;
	private LinearLayout linear745;
	private LinearLayout linear746;
	private LinearLayout linear747;
	private TextView textview1782;
	private EditText edittext282fm1;
	private TextView textview1783;
	private TextView textview1784;
	private TextView textview1785;
	private EditText edittext283fm1;
	private TextView textview1786;
	private TextView textview1787;
	private Button button162;
	private TextView textview1788;
	private EditText edittext284fm1;
	private TextView textview1789;
	private TextView textview1790;
	private Button button163;
	private TextView textview1791;
	private Button button164;
	private TextView textview1781;
	private TextView textview1792;
	private LinearLayout linear748;
	private LinearLayout linear749;
	private TextView textview1793;
	private LinearLayout linear750;
	private LinearLayout linear751;
	private LinearLayout linear752;
	private TextView textview1795;
	private EditText edittext285fm1;
	private TextView textview1796;
	private TextView textview1797;
	private TextView textview1798;
	private EditText edittext286fm1;
	private TextView textview1799;
	private TextView textview1800;
	private Button button165;
	private TextView textview1801;
	private EditText edittext287fm1;
	private TextView textview1802;
	private TextView textview1803;
	private Button button166;
	private TextView textview1804;
	private TextView textview1805;
	private LinearLayout linear754;
	private LinearLayout linear755;
	private LinearLayout linear758;
	private TextView textview1806;
	private LinearLayout linear757;
	private LinearLayout linear759;
	private LinearLayout linear760;
	private TextView textview1807;
	private LinearLayout linear761;
	private TextView textview1808;
	private LinearLayout linear762;
	private LinearLayout linear763;
	private LinearLayout linear764;
	private LinearLayout linear765;
	private LinearLayout linear766;
	private TextView textview1810;
	private EditText edittext288fm1;
	private TextView textview1811;
	private TextView textview1812;
	private TextView textview1813;
	private EditText edittext289fm1;
	private TextView textview1814;
	private TextView textview1815;
	private TextView textview1819;
	private EditText edittext290fm1;
	private TextView textview1820;
	private TextView textview1821;
	private Button button167;
	private TextView textview1822;
	private EditText edittext291fm1;
	private TextView textview1823;
	private TextView textview1824;
	private TextView textview1825;
	private EditText edittext292fm1;
	private TextView textview1826;
	private TextView textview1827;
	private TextView textview1828;
	private EditText edittext293fm1;
	private TextView textview1829;
	private TextView textview1830;
	private TextView textview1831;
	private Button button168;
	private TextView textview1809;
	private TextView textview1832;
	private LinearLayout linear767;
	private LinearLayout linear768;
	private TextView textview1833;
	private LinearLayout linear769;
	private LinearLayout linear770;
	private LinearLayout linear771;
	private TextView textview1835;
	private EditText edittext294fm1;
	private TextView textview1836;
	private TextView textview1837;
	private TextView textview1838;
	private EditText edittext295fm1;
	private TextView textview1839;
	private TextView textview1840;
	private Button button169;
	private TextView textview1841;
	private EditText edittext296fm1;
	private TextView textview1842;
	private TextView textview1843;
	private Button button170;
	private TextView textview1844;
	private Button button171;
	private TextView textview1834;
	private TextView textview1845;
	private LinearLayout linear772;
	private LinearLayout linear773;
	private TextView textview1846;
	private LinearLayout linear774;
	private LinearLayout linear775;
	private LinearLayout linear776;
	private TextView textview1848;
	private EditText edittext297fm1;
	private TextView textview1849;
	private TextView textview1850;
	private TextView textview1851;
	private EditText edittext298fm1;
	private TextView textview1852;
	private TextView textview1853;
	private Button button172;
	private TextView textview1854;
	private EditText edittext299fm1;
	private TextView textview1855;
	private TextView textview1856;
	private Button button173;
	private TextView textview1857;
	private Button button174;
	private TextView textview1847;
	private TextView textview1858;
	private LinearLayout linear777;
	private LinearLayout linear778;
	private TextView textview1859;
	private LinearLayout linear779;
	private LinearLayout linear780;
	private LinearLayout linear781;
	private TextView textview1861;
	private EditText edittext300fm1;
	private TextView textview1862;
	private TextView textview1863;
	private TextView textview1864;
	private EditText edittext301fm1;
	private TextView textview1865;
	private TextView textview1866;
	private Button button175;
	private TextView textview1867;
	private EditText edittext302fm1;
	private TextView textview1868;
	private TextView textview1869;
	private Button button176;
	private TextView textview1870;
	private Button button177;
	private TextView textview1860;
	private TextView textview1871;
	private LinearLayout linear782;
	private LinearLayout linear783;
	private TextView textview1872;
	private LinearLayout linear784;
	private LinearLayout linear785;
	private LinearLayout linear786;
	private TextView textview1874;
	private EditText edittext303fm1;
	private TextView textview1875;
	private TextView textview1876;
	private TextView textview1877;
	private EditText edittext304fm1;
	private TextView textview1878;
	private TextView textview1879;
	private Button button178;
	private TextView textview1880;
	private EditText edittext305fm1;
	private TextView textview1881;
	private TextView textview1882;
	private Button button179;
	private TextView textview1883;
	private TextView textview1645;
	private TextView textview1646;
	private TextView textview1650;
	private LinearLayout linear693;
	private LinearLayout linear694;
	private LinearLayout linear695;
	private TextView textview1651;
	private LinearLayout linear699;
	private LinearLayout linear703;
	private TextView textview1654;
	private LinearLayout linear704;
	private TextView textview1652;
	private TextView textview1655;
	private LinearLayout linear787;
	private TextView textview1666;
	private EditText edittext349fm1;
	private TextView textview1667;
	private TextView textview1668;
	private TextView textview1669;
	private EditText edittext350fm1;
	private TextView textview1670;
	private TextView textview1671;
	private TextView textview1698;
	private EditText edittext351fm1;
	private TextView textview1672;
	private TextView textview1700;
	private Button button147;
	private TextView textview1701;
	private EditText edittext352fm1;
	private TextView textview1702;
	private TextView textview1703;
	private TextView textview1704;
	private EditText edittext353fm1;
	private TextView textview1705;
	private TextView textview1706;
	private TextView textview1656;
	private TextView textview1885;
	private LinearLayout linear788;
	private LinearLayout linear789;
	private LinearLayout linear790;
	private TextView textview1886;
	private LinearLayout linear791;
	private LinearLayout linear794;
	private TextView textview1887;
	private LinearLayout linear795;
	private TextView textview1888;
	private LinearLayout linear796;
	private LinearLayout linear797;
	private LinearLayout linear798;
	private LinearLayout linear799;
	private LinearLayout linear800;
	private TextView textview1892;
	private EditText edittext354fm1;
	private TextView textview1893;
	private TextView textview1894;
	private TextView textview1895;
	private EditText edittext355fm1;
	private TextView textview1896;
	private TextView textview1897;
	private TextView textview1898;
	private EditText edittext356fm1;
	private TextView textview1899;
	private TextView textview1903;
	private Button button180;
	private TextView textview1907;
	private EditText edittext357fm1;
	private TextView textview1908;
	private TextView textview1909;
	private TextView textview1910;
	private EditText edittext358fm1;
	private TextView textview1911;
	private TextView textview1912;
	private TextView textview1913;
	private Button button181;
	private TextView textview1889;
	private TextView textview1914;
	private LinearLayout linear801;
	private LinearLayout linear802;
	private TextView textview1915;
	private LinearLayout linear803;
	private LinearLayout linear804;
	private LinearLayout linear805;
	private TextView textview1917;
	private EditText edittext359fm1;
	private TextView textview1918;
	private TextView textview1919;
	private TextView textview1920;
	private EditText edittext360fm1;
	private TextView textview1921;
	private TextView textview1922;
	private Button button182;
	private TextView textview1923;
	private EditText edittext361fm1;
	private TextView textview1924;
	private TextView textview1925;
	private Button button183;
	private TextView textview1926;
	private Button button184;
	private TextView textview1916;
	private TextView textview1927;
	private LinearLayout linear806;
	private LinearLayout linear807;
	private TextView textview1928;
	private LinearLayout linear808;
	private LinearLayout linear809;
	private LinearLayout linear810;
	private TextView textview1930;
	private EditText edittext362fm1;
	private TextView textview1931;
	private TextView textview1932;
	private TextView textview1933;
	private EditText edittext363fm1;
	private TextView textview1934;
	private TextView textview1935;
	private Button button185;
	private TextView textview1936;
	private EditText edittext364fm1;
	private TextView textview1937;
	private TextView textview1938;
	private Button button186;
	private TextView textview1939;
	private Button button187;
	private TextView textview1929;
	private TextView textview1940;
	private LinearLayout linear811;
	private LinearLayout linear812;
	private TextView textview1941;
	private LinearLayout linear813;
	private LinearLayout linear814;
	private LinearLayout linear815;
	private TextView textview1943;
	private EditText edittext365fm1;
	private TextView textview1944;
	private TextView textview1945;
	private TextView textview1946;
	private EditText edittext366fm1;
	private TextView textview1947;
	private TextView textview1948;
	private Button button188;
	private TextView textview1949;
	private EditText edittext367fm1;
	private TextView textview1950;
	private TextView textview1951;
	private Button button189;
	private TextView textview1952;
	private Button button190;
	private TextView textview1942;
	private TextView textview1953;
	private LinearLayout linear816;
	private LinearLayout linear817;
	private TextView textview1954;
	private LinearLayout linear818;
	private LinearLayout linear819;
	private LinearLayout linear820;
	private TextView textview1956;
	private EditText edittext368fm1;
	private TextView textview1957;
	private TextView textview1958;
	private TextView textview1959;
	private EditText edittext369fm1;
	private TextView textview1960;
	private TextView textview1961;
	private Button button191;
	private TextView textview1962;
	private EditText edittext370fm1;
	private TextView textview1963;
	private TextView textview1964;
	private Button button192;
	private TextView textview1965;
	private TextView textview1562;
	private EditText edittext122;
	private TextView textview1563;
	private TextView textview1564;
	private TextView textview704;
	private Button button58;
	private TextView textview527;
	private EditText edittext51;
	private TextView textview321;
	private TextView textview114;
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
	private Button button193;
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
	private LinearLayout linear865;
	private LinearLayout linear868;
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
	private Button button194;
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
	private LinearLayout linear866;
	private TextView textview1073;
	private EditText edittext65;
	private TextView textview2044;
	private TextView textview1075;
	private TextView textview2045;
	private EditText edittext41;
	private TextView textview2046;
	private TextView textview2047;
	private TextView textview2048;
	private TextView textview2049;
	private LinearLayout linear867;
	private TextView textview2050;
	private EditText edittext42;
	private LinearLayout linear869;
	private HorizontalScrollView hscroll80;
	private LinearLayout linear870;
	private HorizontalScrollView hscroll81;
	private LinearLayout linear871;
	private TextView textview2051;
	private EditText edittext66;
	private TextView textview2052;
	private TextView textview2053;
	private TextView textview2054;
	private EditText edittext44;
	private TextView textview2055;
	private TextView textview2056;
	private TextView textview2057;
	private TextView textview2058;
	private LinearLayout linear872;
	private TextView textview2059;
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
	private Button button195;
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
	private Button button196;
	private LinearLayout linear314;
	private Button button197;
	private LinearLayout linear315;
	private Button button198;
	private LinearLayout linear316;
	private LinearLayout linear379;
	private Button button199;
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
		setContentView(R.layout.toipccreinforcedconcretecolumnss);
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
		textview524 = findViewById(R.id.textview524);
		linear75 = findViewById(R.id.linear75);
		textview519 = findViewById(R.id.textview519);
		linear351 = findViewById(R.id.linear351);
		textview525 = findViewById(R.id.textview525);
		linear255 = findViewById(R.id.linear255);
		linear178 = findViewById(R.id.linear178);
		linear140 = findViewById(R.id.linear140);
		linear290 = findViewById(R.id.linear290);
		linear301 = findViewById(R.id.linear301);
		linear713 = findViewById(R.id.linear713);
		textview2061 = findViewById(R.id.textview2061);
		linear386 = findViewById(R.id.linear386);
		linear172 = findViewById(R.id.linear172);
		linear173 = findViewById(R.id.linear173);
		linear175 = findViewById(R.id.linear175);
		linear289 = findViewById(R.id.linear289);
		textview555 = findViewById(R.id.textview555);
		button200 = findViewById(R.id.button200);
		linear873 = findViewById(R.id.linear873);
		linear707 = findViewById(R.id.linear707);
		textview2060 = findViewById(R.id.textview2060);
		textview583 = findViewById(R.id.textview583);
		edittext129 = findViewById(R.id.edittext129);
		textview579 = findViewById(R.id.textview579);
		edittext125 = findViewById(R.id.edittext125);
		textview580 = findViewById(R.id.textview580);
		textview585 = findViewById(R.id.textview585);
		textview584 = findViewById(R.id.textview584);
		textview808 = findViewById(R.id.textview808);
		textview809 = findViewById(R.id.textview809);
		textview1966 = findViewById(R.id.textview1966);
		textview2 = findViewById(R.id.textview2);
		hscroll1 = findViewById(R.id.hscroll1);
		linear240 = findViewById(R.id.linear240);
		linear13 = findViewById(R.id.linear13);
		linear864 = findViewById(R.id.linear864);
		textview1072 = findViewById(R.id.textview1072);
		textview1074 = findViewById(R.id.textview1074);
		linear821 = findViewById(R.id.linear821);
		textview1410 = findViewById(R.id.textview1410);
		linear434 = findViewById(R.id.linear434);
		textview195 = findViewById(R.id.textview195);
		linear512 = findViewById(R.id.linear512);
		linear689 = findViewById(R.id.linear689);
		textview1955 = findViewById(R.id.textview1955);
		linear655 = findViewById(R.id.linear655);
		linear237 = findViewById(R.id.linear237);
		linear3 = findViewById(R.id.linear3);
		linear6 = findViewById(R.id.linear6);
		linear5 = findViewById(R.id.linear5);
		linear4 = findViewById(R.id.linear4);
		textview5 = findViewById(R.id.textview5);
		edittext2 = findViewById(R.id.edittext2);
		textview15 = findViewById(R.id.textview15);
		textview11 = findViewById(R.id.textview11);
		edittext4 = findViewById(R.id.edittext4);
		textview4 = findViewById(R.id.textview4);
		L1 = findViewById(R.id.L1);
		edittext1 = findViewById(R.id.edittext1);
		textview14 = findViewById(R.id.textview14);
		textview7 = findViewById(R.id.textview7);
		edittext3 = findViewById(R.id.edittext3);
		button1 = findViewById(R.id.button1);
		textview708 = findViewById(R.id.textview708);
		edittext5 = findViewById(R.id.edittext5);
		textview13 = findViewById(R.id.textview13);
		textview12 = findViewById(R.id.textview12);
		button49 = findViewById(R.id.button49);
		textview594 = findViewById(R.id.textview594);
		button50 = findViewById(R.id.button50);
		linear84 = findViewById(R.id.linear84);
		linear165 = findViewById(R.id.linear165);
		textview1311 = findViewById(R.id.textview1311);
		edittext222fm1 = findViewById(R.id.edittext222fm1);
		textview230 = findViewById(R.id.textview230);
		textview231 = findViewById(R.id.textview231);
		textview596 = findViewById(R.id.textview596);
		edittext223fm1 = findViewById(R.id.edittext223fm1);
		textview426 = findViewById(R.id.textview426);
		textview420 = findViewById(R.id.textview420);
		textview1091 = findViewById(R.id.textview1091);
		textview1265 = findViewById(R.id.textview1265);
		textview1250 = findViewById(R.id.textview1250);
		linear514 = findViewById(R.id.linear514);
		linear515 = findViewById(R.id.linear515);
		linear139 = findViewById(R.id.linear139);
		linear517 = findViewById(R.id.linear517);
		textview545 = findViewById(R.id.textview545);
		linear537 = findViewById(R.id.linear537);
		linear520 = findViewById(R.id.linear520);
		textview203 = findViewById(R.id.textview203);
		linear177 = findViewById(R.id.linear177);
		linear179 = findViewById(R.id.linear179);
		textview204 = findViewById(R.id.textview204);
		linear510 = findViewById(R.id.linear510);
		textview229 = findViewById(R.id.textview229);
		textview1246 = findViewById(R.id.textview1246);
		linear717 = findViewById(R.id.linear717);
		linear538 = findViewById(R.id.linear538);
		linear718 = findViewById(R.id.linear718);
		linear511 = findViewById(R.id.linear511);
		linear608 = findViewById(R.id.linear608);
		linear719 = findViewById(R.id.linear719);
		linear753 = findViewById(R.id.linear753);
		textview1270 = findViewById(R.id.textview1270);
		edittext224fm1 = findViewById(R.id.edittext224fm1);
		textview1255 = findViewById(R.id.textview1255);
		textview196 = findViewById(R.id.textview196);
		textview1269 = findViewById(R.id.textview1269);
		edittext225fm1 = findViewById(R.id.edittext225fm1);
		textview317 = findViewById(R.id.textview317);
		textview1256 = findViewById(R.id.textview1256);
		edittext226fm1 = findViewById(R.id.edittext226fm1);
		textview1259 = findViewById(R.id.textview1259);
		textview1260 = findViewById(R.id.textview1260);
		textview1252 = findViewById(R.id.textview1252);
		edittext227fm1 = findViewById(R.id.edittext227fm1);
		textview405 = findViewById(R.id.textview405);
		textview406 = findViewById(R.id.textview406);
		button27 = findViewById(R.id.button27);
		textview394 = findViewById(R.id.textview394);
		textview395 = findViewById(R.id.textview395);
		linear544 = findViewById(R.id.linear544);
		linear155 = findViewById(R.id.linear155);
		textview398 = findViewById(R.id.textview398);
		textview397 = findViewById(R.id.textview397);
		textview396 = findViewById(R.id.textview396);
		textview1264 = findViewById(R.id.textview1264);
		edittext228fm1 = findViewById(R.id.edittext228fm1);
		textview401 = findViewById(R.id.textview401);
		textview402 = findViewById(R.id.textview402);
		textview589 = findViewById(R.id.textview589);
		edittext229fm1 = findViewById(R.id.edittext229fm1);
		textview588 = findViewById(R.id.textview588);
		textview199 = findViewById(R.id.textview199);
		textview1312 = findViewById(R.id.textview1312);
		edittext230fm1 = findViewById(R.id.edittext230fm1);
		textview201 = findViewById(R.id.textview201);
		textview202 = findViewById(R.id.textview202);
		textview284 = findViewById(R.id.textview284);
		edittext231fm1 = findViewById(R.id.edittext231fm1);
		textview1245 = findViewById(R.id.textview1245);
		textview205 = findViewById(R.id.textview205);
		button150 = findViewById(R.id.button150);
		textview1724 = findViewById(R.id.textview1724);
		button151 = findViewById(R.id.button151);
		button106 = findViewById(R.id.button106);
		textview1316 = findViewById(R.id.textview1316);
		button107 = findViewById(R.id.button107);
		button152 = findViewById(R.id.button152);
		textview1725 = findViewById(R.id.textview1725);
		button153 = findViewById(R.id.button153);
		textview228 = findViewById(R.id.textview228);
		linear513 = findViewById(R.id.linear513);
		linear112 = findViewById(R.id.linear112);
		linear164 = findViewById(R.id.linear164);
		textview254 = findViewById(R.id.textview254);
		linear539 = findViewById(R.id.linear539);
		linear540 = findViewById(R.id.linear540);
		linear541 = findViewById(R.id.linear541);
		linear542 = findViewById(R.id.linear542);
		textview248 = findViewById(R.id.textview248);
		linear543 = findViewById(R.id.linear543);
		textview290 = findViewById(R.id.textview290);
		linear549 = findViewById(R.id.linear549);
		linear181 = findViewById(R.id.linear181);
		linear588 = findViewById(R.id.linear588);
		linear594 = findViewById(R.id.linear594);
		linear600 = findViewById(R.id.linear600);
		textview227 = findViewById(R.id.textview227);
		edittext232fm1 = findViewById(R.id.edittext232fm1);
		textview318 = findViewById(R.id.textview318);
		textview260 = findViewById(R.id.textview260);
		textview1317 = findViewById(R.id.textview1317);
		edittext233fm1 = findViewById(R.id.edittext233fm1);
		textview1247 = findViewById(R.id.textview1247);
		textview232 = findViewById(R.id.textview232);
		textview1319 = findViewById(R.id.textview1319);
		edittext234fm1 = findViewById(R.id.edittext234fm1);
		textview1248 = findViewById(R.id.textview1248);
		textview1249 = findViewById(R.id.textview1249);
		button33 = findViewById(R.id.button33);
		textview285 = findViewById(R.id.textview285);
		edittext235fm1 = findViewById(R.id.edittext235fm1);
		textview233 = findViewById(R.id.textview233);
		textview234 = findViewById(R.id.textview234);
		textview239 = findViewById(R.id.textview239);
		edittext236fm1 = findViewById(R.id.edittext236fm1);
		textview236 = findViewById(R.id.textview236);
		textview237 = findViewById(R.id.textview237);
		textview1321 = findViewById(R.id.textview1321);
		edittext237fm1 = findViewById(R.id.edittext237fm1);
		textview1320 = findViewById(R.id.textview1320);
		textview240 = findViewById(R.id.textview240);
		textview1322 = findViewById(R.id.textview1322);
		edittext238fm1 = findViewById(R.id.edittext238fm1);
		textview242 = findViewById(R.id.textview242);
		textview243 = findViewById(R.id.textview243);
		textview1323 = findViewById(R.id.textview1323);
		button109 = findViewById(R.id.button109);
		textview245 = findViewById(R.id.textview245);
		textview246 = findViewById(R.id.textview246);
		linear546 = findViewById(R.id.linear546);
		linear547 = findViewById(R.id.linear547);
		textview253 = findViewById(R.id.textview253);
		linear399 = findViewById(R.id.linear399);
		linear548 = findViewById(R.id.linear548);
		linear578 = findViewById(R.id.linear578);
		textview238 = findViewById(R.id.textview238);
		edittext239fm1 = findViewById(R.id.edittext239fm1);
		textview241 = findViewById(R.id.textview241);
		textview249 = findViewById(R.id.textview249);
		textview247 = findViewById(R.id.textview247);
		edittext240fm1 = findViewById(R.id.edittext240fm1);
		textview235 = findViewById(R.id.textview235);
		textview258 = findViewById(R.id.textview258);
		button37 = findViewById(R.id.button37);
		textview259 = findViewById(R.id.textview259);
		edittext241fm1 = findViewById(R.id.edittext241fm1);
		textview198 = findViewById(R.id.textview198);
		textview250 = findViewById(R.id.textview250);
		button114 = findViewById(R.id.button114);
		textview1380 = findViewById(R.id.textview1380);
		button115 = findViewById(R.id.button115);
		textview207 = findViewById(R.id.textview207);
		textview1382 = findViewById(R.id.textview1382);
		linear589 = findViewById(R.id.linear589);
		linear590 = findViewById(R.id.linear590);
		textview1383 = findViewById(R.id.textview1383);
		linear591 = findViewById(R.id.linear591);
		linear592 = findViewById(R.id.linear592);
		linear593 = findViewById(R.id.linear593);
		textview1385 = findViewById(R.id.textview1385);
		edittext242fm1 = findViewById(R.id.edittext242fm1);
		textview1386 = findViewById(R.id.textview1386);
		textview1387 = findViewById(R.id.textview1387);
		textview1388 = findViewById(R.id.textview1388);
		edittext243fm1 = findViewById(R.id.edittext243fm1);
		textview1389 = findViewById(R.id.textview1389);
		textview1390 = findViewById(R.id.textview1390);
		button118 = findViewById(R.id.button118);
		textview1391 = findViewById(R.id.textview1391);
		edittext244fm1 = findViewById(R.id.edittext244fm1);
		textview1392 = findViewById(R.id.textview1392);
		textview1393 = findViewById(R.id.textview1393);
		button119 = findViewById(R.id.button119);
		textview1394 = findViewById(R.id.textview1394);
		button120 = findViewById(R.id.button120);
		textview1384 = findViewById(R.id.textview1384);
		textview1395 = findViewById(R.id.textview1395);
		linear595 = findViewById(R.id.linear595);
		linear596 = findViewById(R.id.linear596);
		textview1396 = findViewById(R.id.textview1396);
		linear597 = findViewById(R.id.linear597);
		linear598 = findViewById(R.id.linear598);
		linear599 = findViewById(R.id.linear599);
		textview1398 = findViewById(R.id.textview1398);
		edittext245fm1 = findViewById(R.id.edittext245fm1);
		textview1399 = findViewById(R.id.textview1399);
		textview1400 = findViewById(R.id.textview1400);
		textview1401 = findViewById(R.id.textview1401);
		edittext246fm1 = findViewById(R.id.edittext246fm1);
		textview1402 = findViewById(R.id.textview1402);
		textview1403 = findViewById(R.id.textview1403);
		button121 = findViewById(R.id.button121);
		textview1404 = findViewById(R.id.textview1404);
		edittext247fm1 = findViewById(R.id.edittext247fm1);
		textview1405 = findViewById(R.id.textview1405);
		textview1406 = findViewById(R.id.textview1406);
		button122 = findViewById(R.id.button122);
		textview1407 = findViewById(R.id.textview1407);
		button123 = findViewById(R.id.button123);
		textview1397 = findViewById(R.id.textview1397);
		textview1408 = findViewById(R.id.textview1408);
		linear601 = findViewById(R.id.linear601);
		linear602 = findViewById(R.id.linear602);
		textview1409 = findViewById(R.id.textview1409);
		linear603 = findViewById(R.id.linear603);
		linear604 = findViewById(R.id.linear604);
		linear605 = findViewById(R.id.linear605);
		textview1411 = findViewById(R.id.textview1411);
		edittext248fm1 = findViewById(R.id.edittext248fm1);
		textview1412 = findViewById(R.id.textview1412);
		textview1413 = findViewById(R.id.textview1413);
		textview1414 = findViewById(R.id.textview1414);
		edittext249fm1 = findViewById(R.id.edittext249fm1);
		textview1415 = findViewById(R.id.textview1415);
		textview1416 = findViewById(R.id.textview1416);
		button124 = findViewById(R.id.button124);
		textview1417 = findViewById(R.id.textview1417);
		edittext250fm1 = findViewById(R.id.edittext250fm1);
		textview1418 = findViewById(R.id.textview1418);
		textview1419 = findViewById(R.id.textview1419);
		button125 = findViewById(R.id.button125);
		textview1420 = findViewById(R.id.textview1420);
		textview1422 = findViewById(R.id.textview1422);
		linear609 = findViewById(R.id.linear609);
		linear610 = findViewById(R.id.linear610);
		linear611 = findViewById(R.id.linear611);
		textview1423 = findViewById(R.id.textview1423);
		linear612 = findViewById(R.id.linear612);
		linear613 = findViewById(R.id.linear613);
		linear614 = findViewById(R.id.linear614);
		linear615 = findViewById(R.id.linear615);
		textview1424 = findViewById(R.id.textview1424);
		linear616 = findViewById(R.id.linear616);
		textview1425 = findViewById(R.id.textview1425);
		linear617 = findViewById(R.id.linear617);
		linear618 = findViewById(R.id.linear618);
		linear619 = findViewById(R.id.linear619);
		linear620 = findViewById(R.id.linear620);
		linear621 = findViewById(R.id.linear621);
		textview1429 = findViewById(R.id.textview1429);
		edittext251fm1 = findViewById(R.id.edittext251fm1);
		textview1430 = findViewById(R.id.textview1430);
		textview1431 = findViewById(R.id.textview1431);
		textview1432 = findViewById(R.id.textview1432);
		edittext252fm1 = findViewById(R.id.edittext252fm1);
		textview1433 = findViewById(R.id.textview1433);
		textview1434 = findViewById(R.id.textview1434);
		textview1435 = findViewById(R.id.textview1435);
		edittext253fm1 = findViewById(R.id.edittext253fm1);
		textview1436 = findViewById(R.id.textview1436);
		textview1437 = findViewById(R.id.textview1437);
		button126 = findViewById(R.id.button126);
		textview1438 = findViewById(R.id.textview1438);
		edittext254fm1 = findViewById(R.id.edittext254fm1);
		textview1439 = findViewById(R.id.textview1439);
		textview1440 = findViewById(R.id.textview1440);
		textview1441 = findViewById(R.id.textview1441);
		edittext255fm1 = findViewById(R.id.edittext255fm1);
		textview1442 = findViewById(R.id.textview1442);
		textview1443 = findViewById(R.id.textview1443);
		textview1444 = findViewById(R.id.textview1444);
		edittext256fm1 = findViewById(R.id.edittext256fm1);
		textview1445 = findViewById(R.id.textview1445);
		textview1446 = findViewById(R.id.textview1446);
		textview1447 = findViewById(R.id.textview1447);
		edittext257fm1 = findViewById(R.id.edittext257fm1);
		textview1448 = findViewById(R.id.textview1448);
		textview1449 = findViewById(R.id.textview1449);
		textview1450 = findViewById(R.id.textview1450);
		button127 = findViewById(R.id.button127);
		textview1426 = findViewById(R.id.textview1426);
		textview1451 = findViewById(R.id.textview1451);
		linear622 = findViewById(R.id.linear622);
		linear623 = findViewById(R.id.linear623);
		textview1452 = findViewById(R.id.textview1452);
		linear624 = findViewById(R.id.linear624);
		linear625 = findViewById(R.id.linear625);
		linear626 = findViewById(R.id.linear626);
		textview1454 = findViewById(R.id.textview1454);
		edittext258fm1 = findViewById(R.id.edittext258fm1);
		textview1455 = findViewById(R.id.textview1455);
		textview1456 = findViewById(R.id.textview1456);
		textview1457 = findViewById(R.id.textview1457);
		edittext259fm1 = findViewById(R.id.edittext259fm1);
		textview1458 = findViewById(R.id.textview1458);
		textview1459 = findViewById(R.id.textview1459);
		button128 = findViewById(R.id.button128);
		textview1460 = findViewById(R.id.textview1460);
		edittext260fm1 = findViewById(R.id.edittext260fm1);
		textview1461 = findViewById(R.id.textview1461);
		textview1462 = findViewById(R.id.textview1462);
		button129 = findViewById(R.id.button129);
		textview1463 = findViewById(R.id.textview1463);
		button130 = findViewById(R.id.button130);
		textview1453 = findViewById(R.id.textview1453);
		textview1464 = findViewById(R.id.textview1464);
		linear627 = findViewById(R.id.linear627);
		linear628 = findViewById(R.id.linear628);
		textview1465 = findViewById(R.id.textview1465);
		linear629 = findViewById(R.id.linear629);
		linear630 = findViewById(R.id.linear630);
		linear631 = findViewById(R.id.linear631);
		textview1467 = findViewById(R.id.textview1467);
		edittext261fm1 = findViewById(R.id.edittext261fm1);
		textview1468 = findViewById(R.id.textview1468);
		textview1469 = findViewById(R.id.textview1469);
		textview1470 = findViewById(R.id.textview1470);
		edittext262fm1 = findViewById(R.id.edittext262fm1);
		textview1471 = findViewById(R.id.textview1471);
		textview1472 = findViewById(R.id.textview1472);
		button131 = findViewById(R.id.button131);
		textview1473 = findViewById(R.id.textview1473);
		edittext263fm1 = findViewById(R.id.edittext263fm1);
		textview1474 = findViewById(R.id.textview1474);
		textview1475 = findViewById(R.id.textview1475);
		button132 = findViewById(R.id.button132);
		textview1476 = findViewById(R.id.textview1476);
		button133 = findViewById(R.id.button133);
		textview1466 = findViewById(R.id.textview1466);
		textview1477 = findViewById(R.id.textview1477);
		linear632 = findViewById(R.id.linear632);
		linear633 = findViewById(R.id.linear633);
		textview1478 = findViewById(R.id.textview1478);
		linear634 = findViewById(R.id.linear634);
		linear635 = findViewById(R.id.linear635);
		linear636 = findViewById(R.id.linear636);
		textview1480 = findViewById(R.id.textview1480);
		edittext264fm1 = findViewById(R.id.edittext264fm1);
		textview1481 = findViewById(R.id.textview1481);
		textview1482 = findViewById(R.id.textview1482);
		textview1483 = findViewById(R.id.textview1483);
		edittext265fm1 = findViewById(R.id.edittext265fm1);
		textview1484 = findViewById(R.id.textview1484);
		textview1485 = findViewById(R.id.textview1485);
		button134 = findViewById(R.id.button134);
		textview1486 = findViewById(R.id.textview1486);
		edittext266fm1 = findViewById(R.id.edittext266fm1);
		textview1487 = findViewById(R.id.textview1487);
		textview1488 = findViewById(R.id.textview1488);
		button135 = findViewById(R.id.button135);
		textview1489 = findViewById(R.id.textview1489);
		button136 = findViewById(R.id.button136);
		textview1479 = findViewById(R.id.textview1479);
		textview1490 = findViewById(R.id.textview1490);
		linear637 = findViewById(R.id.linear637);
		linear638 = findViewById(R.id.linear638);
		textview1491 = findViewById(R.id.textview1491);
		linear639 = findViewById(R.id.linear639);
		linear640 = findViewById(R.id.linear640);
		linear641 = findViewById(R.id.linear641);
		textview1493 = findViewById(R.id.textview1493);
		edittext267fm1 = findViewById(R.id.edittext267fm1);
		textview1494 = findViewById(R.id.textview1494);
		textview1495 = findViewById(R.id.textview1495);
		textview1496 = findViewById(R.id.textview1496);
		edittext268fm1 = findViewById(R.id.edittext268fm1);
		textview1497 = findViewById(R.id.textview1497);
		textview1498 = findViewById(R.id.textview1498);
		button137 = findViewById(R.id.button137);
		textview1499 = findViewById(R.id.textview1499);
		edittext269fm1 = findViewById(R.id.edittext269fm1);
		textview1500 = findViewById(R.id.textview1500);
		textview1501 = findViewById(R.id.textview1501);
		button138 = findViewById(R.id.button138);
		textview1502 = findViewById(R.id.textview1502);
		textview1726 = findViewById(R.id.textview1726);
		linear720 = findViewById(R.id.linear720);
		linear721 = findViewById(R.id.linear721);
		linear724 = findViewById(R.id.linear724);
		textview1727 = findViewById(R.id.textview1727);
		linear723 = findViewById(R.id.linear723);
		linear725 = findViewById(R.id.linear725);
		linear726 = findViewById(R.id.linear726);
		textview1728 = findViewById(R.id.textview1728);
		linear727 = findViewById(R.id.linear727);
		textview1729 = findViewById(R.id.textview1729);
		linear728 = findViewById(R.id.linear728);
		linear729 = findViewById(R.id.linear729);
		linear730 = findViewById(R.id.linear730);
		linear731 = findViewById(R.id.linear731);
		linear732 = findViewById(R.id.linear732);
		textview1731 = findViewById(R.id.textview1731);
		edittext270fm1 = findViewById(R.id.edittext270fm1);
		textview1732 = findViewById(R.id.textview1732);
		textview1733 = findViewById(R.id.textview1733);
		textview1734 = findViewById(R.id.textview1734);
		edittext271fm1 = findViewById(R.id.edittext271fm1);
		textview1735 = findViewById(R.id.textview1735);
		textview1736 = findViewById(R.id.textview1736);
		textview1740 = findViewById(R.id.textview1740);
		edittext272fm1 = findViewById(R.id.edittext272fm1);
		textview1741 = findViewById(R.id.textview1741);
		textview1742 = findViewById(R.id.textview1742);
		button154 = findViewById(R.id.button154);
		textview1743 = findViewById(R.id.textview1743);
		edittext273fm1 = findViewById(R.id.edittext273fm1);
		textview1744 = findViewById(R.id.textview1744);
		textview1745 = findViewById(R.id.textview1745);
		textview1746 = findViewById(R.id.textview1746);
		edittext274fm1 = findViewById(R.id.edittext274fm1);
		textview1747 = findViewById(R.id.textview1747);
		textview1748 = findViewById(R.id.textview1748);
		textview1749 = findViewById(R.id.textview1749);
		edittext275fm1 = findViewById(R.id.edittext275fm1);
		textview1750 = findViewById(R.id.textview1750);
		textview1751 = findViewById(R.id.textview1751);
		textview1752 = findViewById(R.id.textview1752);
		button155 = findViewById(R.id.button155);
		textview1730 = findViewById(R.id.textview1730);
		textview1753 = findViewById(R.id.textview1753);
		linear733 = findViewById(R.id.linear733);
		linear734 = findViewById(R.id.linear734);
		textview1754 = findViewById(R.id.textview1754);
		linear735 = findViewById(R.id.linear735);
		linear736 = findViewById(R.id.linear736);
		linear737 = findViewById(R.id.linear737);
		textview1756 = findViewById(R.id.textview1756);
		edittext276fm1 = findViewById(R.id.edittext276fm1);
		textview1757 = findViewById(R.id.textview1757);
		textview1758 = findViewById(R.id.textview1758);
		textview1759 = findViewById(R.id.textview1759);
		edittext277fm1 = findViewById(R.id.edittext277fm1);
		textview1760 = findViewById(R.id.textview1760);
		textview1761 = findViewById(R.id.textview1761);
		button156 = findViewById(R.id.button156);
		textview1762 = findViewById(R.id.textview1762);
		edittext278fm1 = findViewById(R.id.edittext278fm1);
		textview1763 = findViewById(R.id.textview1763);
		textview1764 = findViewById(R.id.textview1764);
		button157 = findViewById(R.id.button157);
		textview1765 = findViewById(R.id.textview1765);
		button158 = findViewById(R.id.button158);
		textview1755 = findViewById(R.id.textview1755);
		textview1766 = findViewById(R.id.textview1766);
		linear738 = findViewById(R.id.linear738);
		linear739 = findViewById(R.id.linear739);
		textview1767 = findViewById(R.id.textview1767);
		linear740 = findViewById(R.id.linear740);
		linear741 = findViewById(R.id.linear741);
		linear742 = findViewById(R.id.linear742);
		textview1769 = findViewById(R.id.textview1769);
		edittext279fm1 = findViewById(R.id.edittext279fm1);
		textview1770 = findViewById(R.id.textview1770);
		textview1771 = findViewById(R.id.textview1771);
		textview1772 = findViewById(R.id.textview1772);
		edittext280fm1 = findViewById(R.id.edittext280fm1);
		textview1773 = findViewById(R.id.textview1773);
		textview1774 = findViewById(R.id.textview1774);
		button159 = findViewById(R.id.button159);
		textview1775 = findViewById(R.id.textview1775);
		edittext281fm1 = findViewById(R.id.edittext281fm1);
		textview1776 = findViewById(R.id.textview1776);
		textview1777 = findViewById(R.id.textview1777);
		button160 = findViewById(R.id.button160);
		textview1778 = findViewById(R.id.textview1778);
		button161 = findViewById(R.id.button161);
		textview1768 = findViewById(R.id.textview1768);
		textview1779 = findViewById(R.id.textview1779);
		linear743 = findViewById(R.id.linear743);
		linear744 = findViewById(R.id.linear744);
		textview1780 = findViewById(R.id.textview1780);
		linear745 = findViewById(R.id.linear745);
		linear746 = findViewById(R.id.linear746);
		linear747 = findViewById(R.id.linear747);
		textview1782 = findViewById(R.id.textview1782);
		edittext282fm1 = findViewById(R.id.edittext282fm1);
		textview1783 = findViewById(R.id.textview1783);
		textview1784 = findViewById(R.id.textview1784);
		textview1785 = findViewById(R.id.textview1785);
		edittext283fm1 = findViewById(R.id.edittext283fm1);
		textview1786 = findViewById(R.id.textview1786);
		textview1787 = findViewById(R.id.textview1787);
		button162 = findViewById(R.id.button162);
		textview1788 = findViewById(R.id.textview1788);
		edittext284fm1 = findViewById(R.id.edittext284fm1);
		textview1789 = findViewById(R.id.textview1789);
		textview1790 = findViewById(R.id.textview1790);
		button163 = findViewById(R.id.button163);
		textview1791 = findViewById(R.id.textview1791);
		button164 = findViewById(R.id.button164);
		textview1781 = findViewById(R.id.textview1781);
		textview1792 = findViewById(R.id.textview1792);
		linear748 = findViewById(R.id.linear748);
		linear749 = findViewById(R.id.linear749);
		textview1793 = findViewById(R.id.textview1793);
		linear750 = findViewById(R.id.linear750);
		linear751 = findViewById(R.id.linear751);
		linear752 = findViewById(R.id.linear752);
		textview1795 = findViewById(R.id.textview1795);
		edittext285fm1 = findViewById(R.id.edittext285fm1);
		textview1796 = findViewById(R.id.textview1796);
		textview1797 = findViewById(R.id.textview1797);
		textview1798 = findViewById(R.id.textview1798);
		edittext286fm1 = findViewById(R.id.edittext286fm1);
		textview1799 = findViewById(R.id.textview1799);
		textview1800 = findViewById(R.id.textview1800);
		button165 = findViewById(R.id.button165);
		textview1801 = findViewById(R.id.textview1801);
		edittext287fm1 = findViewById(R.id.edittext287fm1);
		textview1802 = findViewById(R.id.textview1802);
		textview1803 = findViewById(R.id.textview1803);
		button166 = findViewById(R.id.button166);
		textview1804 = findViewById(R.id.textview1804);
		textview1805 = findViewById(R.id.textview1805);
		linear754 = findViewById(R.id.linear754);
		linear755 = findViewById(R.id.linear755);
		linear758 = findViewById(R.id.linear758);
		textview1806 = findViewById(R.id.textview1806);
		linear757 = findViewById(R.id.linear757);
		linear759 = findViewById(R.id.linear759);
		linear760 = findViewById(R.id.linear760);
		textview1807 = findViewById(R.id.textview1807);
		linear761 = findViewById(R.id.linear761);
		textview1808 = findViewById(R.id.textview1808);
		linear762 = findViewById(R.id.linear762);
		linear763 = findViewById(R.id.linear763);
		linear764 = findViewById(R.id.linear764);
		linear765 = findViewById(R.id.linear765);
		linear766 = findViewById(R.id.linear766);
		textview1810 = findViewById(R.id.textview1810);
		edittext288fm1 = findViewById(R.id.edittext288fm1);
		textview1811 = findViewById(R.id.textview1811);
		textview1812 = findViewById(R.id.textview1812);
		textview1813 = findViewById(R.id.textview1813);
		edittext289fm1 = findViewById(R.id.edittext289fm1);
		textview1814 = findViewById(R.id.textview1814);
		textview1815 = findViewById(R.id.textview1815);
		textview1819 = findViewById(R.id.textview1819);
		edittext290fm1 = findViewById(R.id.edittext290fm1);
		textview1820 = findViewById(R.id.textview1820);
		textview1821 = findViewById(R.id.textview1821);
		button167 = findViewById(R.id.button167);
		textview1822 = findViewById(R.id.textview1822);
		edittext291fm1 = findViewById(R.id.edittext291fm1);
		textview1823 = findViewById(R.id.textview1823);
		textview1824 = findViewById(R.id.textview1824);
		textview1825 = findViewById(R.id.textview1825);
		edittext292fm1 = findViewById(R.id.edittext292fm1);
		textview1826 = findViewById(R.id.textview1826);
		textview1827 = findViewById(R.id.textview1827);
		textview1828 = findViewById(R.id.textview1828);
		edittext293fm1 = findViewById(R.id.edittext293fm1);
		textview1829 = findViewById(R.id.textview1829);
		textview1830 = findViewById(R.id.textview1830);
		textview1831 = findViewById(R.id.textview1831);
		button168 = findViewById(R.id.button168);
		textview1809 = findViewById(R.id.textview1809);
		textview1832 = findViewById(R.id.textview1832);
		linear767 = findViewById(R.id.linear767);
		linear768 = findViewById(R.id.linear768);
		textview1833 = findViewById(R.id.textview1833);
		linear769 = findViewById(R.id.linear769);
		linear770 = findViewById(R.id.linear770);
		linear771 = findViewById(R.id.linear771);
		textview1835 = findViewById(R.id.textview1835);
		edittext294fm1 = findViewById(R.id.edittext294fm1);
		textview1836 = findViewById(R.id.textview1836);
		textview1837 = findViewById(R.id.textview1837);
		textview1838 = findViewById(R.id.textview1838);
		edittext295fm1 = findViewById(R.id.edittext295fm1);
		textview1839 = findViewById(R.id.textview1839);
		textview1840 = findViewById(R.id.textview1840);
		button169 = findViewById(R.id.button169);
		textview1841 = findViewById(R.id.textview1841);
		edittext296fm1 = findViewById(R.id.edittext296fm1);
		textview1842 = findViewById(R.id.textview1842);
		textview1843 = findViewById(R.id.textview1843);
		button170 = findViewById(R.id.button170);
		textview1844 = findViewById(R.id.textview1844);
		button171 = findViewById(R.id.button171);
		textview1834 = findViewById(R.id.textview1834);
		textview1845 = findViewById(R.id.textview1845);
		linear772 = findViewById(R.id.linear772);
		linear773 = findViewById(R.id.linear773);
		textview1846 = findViewById(R.id.textview1846);
		linear774 = findViewById(R.id.linear774);
		linear775 = findViewById(R.id.linear775);
		linear776 = findViewById(R.id.linear776);
		textview1848 = findViewById(R.id.textview1848);
		edittext297fm1 = findViewById(R.id.edittext297fm1);
		textview1849 = findViewById(R.id.textview1849);
		textview1850 = findViewById(R.id.textview1850);
		textview1851 = findViewById(R.id.textview1851);
		edittext298fm1 = findViewById(R.id.edittext298fm1);
		textview1852 = findViewById(R.id.textview1852);
		textview1853 = findViewById(R.id.textview1853);
		button172 = findViewById(R.id.button172);
		textview1854 = findViewById(R.id.textview1854);
		edittext299fm1 = findViewById(R.id.edittext299fm1);
		textview1855 = findViewById(R.id.textview1855);
		textview1856 = findViewById(R.id.textview1856);
		button173 = findViewById(R.id.button173);
		textview1857 = findViewById(R.id.textview1857);
		button174 = findViewById(R.id.button174);
		textview1847 = findViewById(R.id.textview1847);
		textview1858 = findViewById(R.id.textview1858);
		linear777 = findViewById(R.id.linear777);
		linear778 = findViewById(R.id.linear778);
		textview1859 = findViewById(R.id.textview1859);
		linear779 = findViewById(R.id.linear779);
		linear780 = findViewById(R.id.linear780);
		linear781 = findViewById(R.id.linear781);
		textview1861 = findViewById(R.id.textview1861);
		edittext300fm1 = findViewById(R.id.edittext300fm1);
		textview1862 = findViewById(R.id.textview1862);
		textview1863 = findViewById(R.id.textview1863);
		textview1864 = findViewById(R.id.textview1864);
		edittext301fm1 = findViewById(R.id.edittext301fm1);
		textview1865 = findViewById(R.id.textview1865);
		textview1866 = findViewById(R.id.textview1866);
		button175 = findViewById(R.id.button175);
		textview1867 = findViewById(R.id.textview1867);
		edittext302fm1 = findViewById(R.id.edittext302fm1);
		textview1868 = findViewById(R.id.textview1868);
		textview1869 = findViewById(R.id.textview1869);
		button176 = findViewById(R.id.button176);
		textview1870 = findViewById(R.id.textview1870);
		button177 = findViewById(R.id.button177);
		textview1860 = findViewById(R.id.textview1860);
		textview1871 = findViewById(R.id.textview1871);
		linear782 = findViewById(R.id.linear782);
		linear783 = findViewById(R.id.linear783);
		textview1872 = findViewById(R.id.textview1872);
		linear784 = findViewById(R.id.linear784);
		linear785 = findViewById(R.id.linear785);
		linear786 = findViewById(R.id.linear786);
		textview1874 = findViewById(R.id.textview1874);
		edittext303fm1 = findViewById(R.id.edittext303fm1);
		textview1875 = findViewById(R.id.textview1875);
		textview1876 = findViewById(R.id.textview1876);
		textview1877 = findViewById(R.id.textview1877);
		edittext304fm1 = findViewById(R.id.edittext304fm1);
		textview1878 = findViewById(R.id.textview1878);
		textview1879 = findViewById(R.id.textview1879);
		button178 = findViewById(R.id.button178);
		textview1880 = findViewById(R.id.textview1880);
		edittext305fm1 = findViewById(R.id.edittext305fm1);
		textview1881 = findViewById(R.id.textview1881);
		textview1882 = findViewById(R.id.textview1882);
		button179 = findViewById(R.id.button179);
		textview1883 = findViewById(R.id.textview1883);
		textview1645 = findViewById(R.id.textview1645);
		textview1646 = findViewById(R.id.textview1646);
		textview1650 = findViewById(R.id.textview1650);
		linear693 = findViewById(R.id.linear693);
		linear694 = findViewById(R.id.linear694);
		linear695 = findViewById(R.id.linear695);
		textview1651 = findViewById(R.id.textview1651);
		linear699 = findViewById(R.id.linear699);
		linear703 = findViewById(R.id.linear703);
		textview1654 = findViewById(R.id.textview1654);
		linear704 = findViewById(R.id.linear704);
		textview1652 = findViewById(R.id.textview1652);
		textview1655 = findViewById(R.id.textview1655);
		linear787 = findViewById(R.id.linear787);
		textview1666 = findViewById(R.id.textview1666);
		edittext349fm1 = findViewById(R.id.edittext349fm1);
		textview1667 = findViewById(R.id.textview1667);
		textview1668 = findViewById(R.id.textview1668);
		textview1669 = findViewById(R.id.textview1669);
		edittext350fm1 = findViewById(R.id.edittext350fm1);
		textview1670 = findViewById(R.id.textview1670);
		textview1671 = findViewById(R.id.textview1671);
		textview1698 = findViewById(R.id.textview1698);
		edittext351fm1 = findViewById(R.id.edittext351fm1);
		textview1672 = findViewById(R.id.textview1672);
		textview1700 = findViewById(R.id.textview1700);
		button147 = findViewById(R.id.button147);
		textview1701 = findViewById(R.id.textview1701);
		edittext352fm1 = findViewById(R.id.edittext352fm1);
		textview1702 = findViewById(R.id.textview1702);
		textview1703 = findViewById(R.id.textview1703);
		textview1704 = findViewById(R.id.textview1704);
		edittext353fm1 = findViewById(R.id.edittext353fm1);
		textview1705 = findViewById(R.id.textview1705);
		textview1706 = findViewById(R.id.textview1706);
		textview1656 = findViewById(R.id.textview1656);
		textview1885 = findViewById(R.id.textview1885);
		linear788 = findViewById(R.id.linear788);
		linear789 = findViewById(R.id.linear789);
		linear790 = findViewById(R.id.linear790);
		textview1886 = findViewById(R.id.textview1886);
		linear791 = findViewById(R.id.linear791);
		linear794 = findViewById(R.id.linear794);
		textview1887 = findViewById(R.id.textview1887);
		linear795 = findViewById(R.id.linear795);
		textview1888 = findViewById(R.id.textview1888);
		linear796 = findViewById(R.id.linear796);
		linear797 = findViewById(R.id.linear797);
		linear798 = findViewById(R.id.linear798);
		linear799 = findViewById(R.id.linear799);
		linear800 = findViewById(R.id.linear800);
		textview1892 = findViewById(R.id.textview1892);
		edittext354fm1 = findViewById(R.id.edittext354fm1);
		textview1893 = findViewById(R.id.textview1893);
		textview1894 = findViewById(R.id.textview1894);
		textview1895 = findViewById(R.id.textview1895);
		edittext355fm1 = findViewById(R.id.edittext355fm1);
		textview1896 = findViewById(R.id.textview1896);
		textview1897 = findViewById(R.id.textview1897);
		textview1898 = findViewById(R.id.textview1898);
		edittext356fm1 = findViewById(R.id.edittext356fm1);
		textview1899 = findViewById(R.id.textview1899);
		textview1903 = findViewById(R.id.textview1903);
		button180 = findViewById(R.id.button180);
		textview1907 = findViewById(R.id.textview1907);
		edittext357fm1 = findViewById(R.id.edittext357fm1);
		textview1908 = findViewById(R.id.textview1908);
		textview1909 = findViewById(R.id.textview1909);
		textview1910 = findViewById(R.id.textview1910);
		edittext358fm1 = findViewById(R.id.edittext358fm1);
		textview1911 = findViewById(R.id.textview1911);
		textview1912 = findViewById(R.id.textview1912);
		textview1913 = findViewById(R.id.textview1913);
		button181 = findViewById(R.id.button181);
		textview1889 = findViewById(R.id.textview1889);
		textview1914 = findViewById(R.id.textview1914);
		linear801 = findViewById(R.id.linear801);
		linear802 = findViewById(R.id.linear802);
		textview1915 = findViewById(R.id.textview1915);
		linear803 = findViewById(R.id.linear803);
		linear804 = findViewById(R.id.linear804);
		linear805 = findViewById(R.id.linear805);
		textview1917 = findViewById(R.id.textview1917);
		edittext359fm1 = findViewById(R.id.edittext359fm1);
		textview1918 = findViewById(R.id.textview1918);
		textview1919 = findViewById(R.id.textview1919);
		textview1920 = findViewById(R.id.textview1920);
		edittext360fm1 = findViewById(R.id.edittext360fm1);
		textview1921 = findViewById(R.id.textview1921);
		textview1922 = findViewById(R.id.textview1922);
		button182 = findViewById(R.id.button182);
		textview1923 = findViewById(R.id.textview1923);
		edittext361fm1 = findViewById(R.id.edittext361fm1);
		textview1924 = findViewById(R.id.textview1924);
		textview1925 = findViewById(R.id.textview1925);
		button183 = findViewById(R.id.button183);
		textview1926 = findViewById(R.id.textview1926);
		button184 = findViewById(R.id.button184);
		textview1916 = findViewById(R.id.textview1916);
		textview1927 = findViewById(R.id.textview1927);
		linear806 = findViewById(R.id.linear806);
		linear807 = findViewById(R.id.linear807);
		textview1928 = findViewById(R.id.textview1928);
		linear808 = findViewById(R.id.linear808);
		linear809 = findViewById(R.id.linear809);
		linear810 = findViewById(R.id.linear810);
		textview1930 = findViewById(R.id.textview1930);
		edittext362fm1 = findViewById(R.id.edittext362fm1);
		textview1931 = findViewById(R.id.textview1931);
		textview1932 = findViewById(R.id.textview1932);
		textview1933 = findViewById(R.id.textview1933);
		edittext363fm1 = findViewById(R.id.edittext363fm1);
		textview1934 = findViewById(R.id.textview1934);
		textview1935 = findViewById(R.id.textview1935);
		button185 = findViewById(R.id.button185);
		textview1936 = findViewById(R.id.textview1936);
		edittext364fm1 = findViewById(R.id.edittext364fm1);
		textview1937 = findViewById(R.id.textview1937);
		textview1938 = findViewById(R.id.textview1938);
		button186 = findViewById(R.id.button186);
		textview1939 = findViewById(R.id.textview1939);
		button187 = findViewById(R.id.button187);
		textview1929 = findViewById(R.id.textview1929);
		textview1940 = findViewById(R.id.textview1940);
		linear811 = findViewById(R.id.linear811);
		linear812 = findViewById(R.id.linear812);
		textview1941 = findViewById(R.id.textview1941);
		linear813 = findViewById(R.id.linear813);
		linear814 = findViewById(R.id.linear814);
		linear815 = findViewById(R.id.linear815);
		textview1943 = findViewById(R.id.textview1943);
		edittext365fm1 = findViewById(R.id.edittext365fm1);
		textview1944 = findViewById(R.id.textview1944);
		textview1945 = findViewById(R.id.textview1945);
		textview1946 = findViewById(R.id.textview1946);
		edittext366fm1 = findViewById(R.id.edittext366fm1);
		textview1947 = findViewById(R.id.textview1947);
		textview1948 = findViewById(R.id.textview1948);
		button188 = findViewById(R.id.button188);
		textview1949 = findViewById(R.id.textview1949);
		edittext367fm1 = findViewById(R.id.edittext367fm1);
		textview1950 = findViewById(R.id.textview1950);
		textview1951 = findViewById(R.id.textview1951);
		button189 = findViewById(R.id.button189);
		textview1952 = findViewById(R.id.textview1952);
		button190 = findViewById(R.id.button190);
		textview1942 = findViewById(R.id.textview1942);
		textview1953 = findViewById(R.id.textview1953);
		linear816 = findViewById(R.id.linear816);
		linear817 = findViewById(R.id.linear817);
		textview1954 = findViewById(R.id.textview1954);
		linear818 = findViewById(R.id.linear818);
		linear819 = findViewById(R.id.linear819);
		linear820 = findViewById(R.id.linear820);
		textview1956 = findViewById(R.id.textview1956);
		edittext368fm1 = findViewById(R.id.edittext368fm1);
		textview1957 = findViewById(R.id.textview1957);
		textview1958 = findViewById(R.id.textview1958);
		textview1959 = findViewById(R.id.textview1959);
		edittext369fm1 = findViewById(R.id.edittext369fm1);
		textview1960 = findViewById(R.id.textview1960);
		textview1961 = findViewById(R.id.textview1961);
		button191 = findViewById(R.id.button191);
		textview1962 = findViewById(R.id.textview1962);
		edittext370fm1 = findViewById(R.id.edittext370fm1);
		textview1963 = findViewById(R.id.textview1963);
		textview1964 = findViewById(R.id.textview1964);
		button192 = findViewById(R.id.button192);
		textview1965 = findViewById(R.id.textview1965);
		textview1562 = findViewById(R.id.textview1562);
		edittext122 = findViewById(R.id.edittext122);
		textview1563 = findViewById(R.id.textview1563);
		textview1564 = findViewById(R.id.textview1564);
		textview704 = findViewById(R.id.textview704);
		button58 = findViewById(R.id.button58);
		textview527 = findViewById(R.id.textview527);
		edittext51 = findViewById(R.id.edittext51);
		textview321 = findViewById(R.id.textview321);
		textview114 = findViewById(R.id.textview114);
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
		button193 = findViewById(R.id.button193);
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
		linear865 = findViewById(R.id.linear865);
		linear868 = findViewById(R.id.linear868);
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
		button194 = findViewById(R.id.button194);
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
		linear866 = findViewById(R.id.linear866);
		textview1073 = findViewById(R.id.textview1073);
		edittext65 = findViewById(R.id.edittext65);
		textview2044 = findViewById(R.id.textview2044);
		textview1075 = findViewById(R.id.textview1075);
		textview2045 = findViewById(R.id.textview2045);
		edittext41 = findViewById(R.id.edittext41);
		textview2046 = findViewById(R.id.textview2046);
		textview2047 = findViewById(R.id.textview2047);
		textview2048 = findViewById(R.id.textview2048);
		textview2049 = findViewById(R.id.textview2049);
		linear867 = findViewById(R.id.linear867);
		textview2050 = findViewById(R.id.textview2050);
		edittext42 = findViewById(R.id.edittext42);
		linear869 = findViewById(R.id.linear869);
		hscroll80 = findViewById(R.id.hscroll80);
		linear870 = findViewById(R.id.linear870);
		hscroll81 = findViewById(R.id.hscroll81);
		linear871 = findViewById(R.id.linear871);
		textview2051 = findViewById(R.id.textview2051);
		edittext66 = findViewById(R.id.edittext66);
		textview2052 = findViewById(R.id.textview2052);
		textview2053 = findViewById(R.id.textview2053);
		textview2054 = findViewById(R.id.textview2054);
		edittext44 = findViewById(R.id.edittext44);
		textview2055 = findViewById(R.id.textview2055);
		textview2056 = findViewById(R.id.textview2056);
		textview2057 = findViewById(R.id.textview2057);
		textview2058 = findViewById(R.id.textview2058);
		linear872 = findViewById(R.id.linear872);
		textview2059 = findViewById(R.id.textview2059);
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
		button195 = findViewById(R.id.button195);
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
		button196 = findViewById(R.id.button196);
		linear314 = findViewById(R.id.linear314);
		button197 = findViewById(R.id.button197);
		linear315 = findViewById(R.id.linear315);
		button198 = findViewById(R.id.button198);
		linear316 = findViewById(R.id.linear316);
		linear379 = findViewById(R.id.linear379);
		button199 = findViewById(R.id.button199);
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
		
		button200.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://youtu.be/wPkskp8a7Qg"));
				startActivity(price);
			}
		});
		
		edittext2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext2.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext5.setTextColor(0xFFE91E63);
				edittext5.setText(String.valueOf(00.00));
				edittext235fm1.setText(String.valueOf(00.00));
				edittext238fm1.setText(String.valueOf(00.00));
				edittext235fm1.setTextColor(0xFFE91E63);
				edittext238fm1.setTextColor(0xFFE91E63);
				edittext254fm1.setText(String.valueOf(00.00));
				edittext257fm1.setText(String.valueOf(00.00));
				edittext254fm1.setTextColor(0xFFE91E63);
				edittext257fm1.setTextColor(0xFFE91E63);
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview11)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("العدد \" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ \"")
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
		
		edittext4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext4.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext5.setTextColor(0xFFE91E63);
				edittext5.setText(String.valueOf(00.00));
				edittext231fm1.setText(String.valueOf(00.00));
				edittext231fm1.setTextColor(0xFFE91E63);
				edittext238fm1.setText(String.valueOf(00.00));
				edittext238fm1.setTextColor(0xFFE91E63);
				edittext241fm1.setText(String.valueOf(00.00));
				edittext241fm1.setTextColor(0xFFE91E63);
				edittext244fm1.setText(String.valueOf(00.00));
				edittext244fm1.setTextColor(0xFFE91E63);
				edittext247fm1.setText(String.valueOf(00.00));
				edittext247fm1.setTextColor(0xFFE91E63);
				edittext250fm1.setText(String.valueOf(00.00));
				edittext250fm1.setTextColor(0xFFE91E63);
				edittext257fm1.setText(String.valueOf(00.00));
				edittext257fm1.setTextColor(0xFFE91E63);
				edittext260fm1.setText(String.valueOf(00.00));
				edittext260fm1.setTextColor(0xFFE91E63);
				edittext263fm1.setText(String.valueOf(00.00));
				edittext263fm1.setTextColor(0xFFE91E63);
				edittext266fm1.setText(String.valueOf(00.00));
				edittext266fm1.setTextColor(0xFFE91E63);
				edittext269fm1.setText(String.valueOf(00.00));
				edittext269fm1.setTextColor(0xFFE91E63);
				edittext275fm1.setText(String.valueOf(00.00));
				edittext275fm1.setTextColor(0xFFE91E63);
				edittext278fm1.setText(String.valueOf(00.00));
				edittext278fm1.setTextColor(0xFFE91E63);
				edittext281fm1.setText(String.valueOf(00.00));
				edittext281fm1.setTextColor(0xFFE91E63);
				edittext284fm1.setText(String.valueOf(00.00));
				edittext284fm1.setTextColor(0xFFE91E63);
				edittext287fm1.setText(String.valueOf(00.00));
				edittext287fm1.setTextColor(0xFFE91E63);
				edittext293fm1.setText(String.valueOf(00.00));
				edittext293fm1.setTextColor(0xFFE91E63);
				edittext296fm1.setText(String.valueOf(00.00));
				edittext296fm1.setTextColor(0xFFE91E63);
				edittext299fm1.setText(String.valueOf(00.00));
				edittext299fm1.setTextColor(0xFFE91E63);
				edittext302fm1.setText(String.valueOf(00.00));
				edittext302fm1.setTextColor(0xFFE91E63);
				edittext305fm1.setText(String.valueOf(00.00));
				edittext305fm1.setTextColor(0xFFE91E63);
				edittext353fm1.setText(String.valueOf(00.00));
				edittext353fm1.setTextColor(0xFFE91E63);
				edittext358fm1.setText(String.valueOf(00.00));
				edittext358fm1.setTextColor(0xFFE91E63);
				edittext361fm1.setText(String.valueOf(00.00));
				edittext361fm1.setTextColor(0xFFE91E63);
				edittext364fm1.setText(String.valueOf(00.00));
				edittext364fm1.setTextColor(0xFFE91E63);
				edittext367fm1.setText(String.valueOf(00.00));
				edittext367fm1.setTextColor(0xFFE91E63);
				edittext370fm1.setText(String.valueOf(00.00));
				edittext370fm1.setTextColor(0xFFE91E63);
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
				edittext5.setTextColor(0xFFE91E63);
				edittext5.setText(String.valueOf(00.00));
				edittext235fm1.setText(String.valueOf(00.00));
				edittext238fm1.setText(String.valueOf(00.00));
				edittext235fm1.setTextColor(0xFFE91E63);
				edittext238fm1.setTextColor(0xFFE91E63);
				edittext254fm1.setText(String.valueOf(00.00));
				edittext257fm1.setText(String.valueOf(00.00));
				edittext254fm1.setTextColor(0xFFE91E63);
				edittext257fm1.setTextColor(0xFFE91E63);
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview7)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("الأرتفاع ( م )\nوالمقصود هنا صافي ارتفاع العمود\n( ويقاس أما من ظهر القاعدة الخرسانية أو من ظهر خرسانة السقف حتي بطنية خرسانة السقف الذي يليه )")
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
		
		edittext3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext3.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext5.setText(String.valueOf(00.00));
				edittext5.setTextColor(0xFFE91E63);
				edittext229fm1.setText(String.valueOf(00.00));
				edittext231fm1.setText(String.valueOf(00.00));
				edittext229fm1.setTextColor(0xFFE91E63);
				edittext231fm1.setTextColor(0xFFE91E63);
				edittext236fm1.setText(String.valueOf(00.00));
				edittext238fm1.setText(String.valueOf(00.00));
				edittext236fm1.setTextColor(0xFFE91E63);
				edittext238fm1.setTextColor(0xFFE91E63);
				edittext255fm1.setText(String.valueOf(00.00));
				edittext257fm1.setText(String.valueOf(00.00));
				edittext255fm1.setTextColor(0xFFE91E63);
				edittext257fm1.setTextColor(0xFFE91E63);
				edittext273fm1.setText(String.valueOf(00.00));
				edittext275fm1.setText(String.valueOf(00.00));
				edittext273fm1.setTextColor(0xFFE91E63);
				edittext275fm1.setTextColor(0xFFE91E63);
				edittext291fm1.setText(String.valueOf(00.00));
				edittext293fm1.setText(String.valueOf(00.00));
				edittext291fm1.setTextColor(0xFFE91E63);
				edittext293fm1.setTextColor(0xFFE91E63);
				textview1654.setText("---------------------");
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) || edittext3.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
					edittext5.setText(String.valueOf((Double.parseDouble(edittext1.getText().toString()) * Double.parseDouble(edittext2.getText().toString())) * (Double.parseDouble(edittext3.getText().toString()) * Double.parseDouble(edittext4.getText().toString()))));
					edittext5.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext5.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext5.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext51.setText(String.valueOf(Double.parseDouble(edittext5.getText().toString())));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button49.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					textview1410.setVisibility(View.VISIBLE);
					linear434.setVisibility(View.VISIBLE);
					textview195.setVisibility(View.VISIBLE);
					linear512.setVisibility(View.GONE);
					linear689.setVisibility(View.VISIBLE);
					linear787.setVisibility(View.VISIBLE);
					linear511.setVisibility(View.GONE);
					linear608.setVisibility(View.GONE);
					linear719.setVisibility(View.GONE);
					linear753.setVisibility(View.GONE);
					/*
الهندسي
*/
					edittext222fm1.setText("");
					edittext223fm1.setText("");
					edittext224fm1.setText("");
					edittext225fm1.setText("");
					edittext226fm1.setText("");
					edittext227fm1.setText("");
					edittext228fm1.setTextColor(0xFF000000);
					edittext229fm1.setTextColor(0xFF000000);
					edittext230fm1.setTextColor(0xFF000000);
					edittext231fm1.setTextColor(0xFF000000);
					edittext232fm1.setText("");
					edittext233fm1.setText("");
					edittext234fm1.setText("");
					edittext235fm1.setTextColor(0xFF000000);
					edittext236fm1.setTextColor(0xFF000000);
					edittext237fm1.setTextColor(0xFF000000);
					edittext238fm1.setTextColor(0xFF000000);
					edittext239fm1.setText("");
					edittext240fm1.setText("");
					edittext241fm1.setTextColor(0xFF000000);
					edittext242fm1.setText("");
					edittext243fm1.setText("");
					edittext244fm1.setTextColor(0xFF000000);
					edittext245fm1.setText("");
					edittext246fm1.setText("");
					edittext247fm1.setTextColor(0xFF000000);
					edittext248fm1.setText("");
					edittext249fm1.setText("");
					edittext250fm1.setTextColor(0xFF000000);
					edittext251fm1.setText("");
					edittext252fm1.setText("");
					edittext253fm1.setText("");
					edittext254fm1.setTextColor(0xFF000000);
					edittext255fm1.setTextColor(0xFF000000);
					edittext256fm1.setTextColor(0xFF000000);
					edittext257fm1.setTextColor(0xFF000000);
					edittext258fm1.setText("");
					edittext259fm1.setText("");
					edittext260fm1.setTextColor(0xFF000000);
					edittext261fm1.setText("");
					edittext262fm1.setText("");
					edittext263fm1.setTextColor(0xFF000000);
					edittext264fm1.setText("");
					edittext265fm1.setText("");
					edittext266fm1.setTextColor(0xFF000000);
					edittext267fm1.setText("");
					edittext268fm1.setText("");
					edittext269fm1.setTextColor(0xFF000000);
					edittext270fm1.setText("");
					edittext271fm1.setText("");
					edittext272fm1.setText("");
					edittext273fm1.setTextColor(0xFF000000);
					edittext274fm1.setTextColor(0xFF000000);
					edittext275fm1.setTextColor(0xFF000000);
					edittext276fm1.setText("");
					edittext277fm1.setText("");
					edittext278fm1.setTextColor(0xFF000000);
					edittext279fm1.setText("");
					edittext280fm1.setText("");
					edittext281fm1.setTextColor(0xFF000000);
					edittext282fm1.setText("");
					edittext283fm1.setText("");
					edittext284fm1.setTextColor(0xFF000000);
					edittext285fm1.setText("");
					edittext286fm1.setText("");
					edittext287fm1.setTextColor(0xFF000000);
					edittext288fm1.setText("");
					edittext289fm1.setText("");
					edittext290fm1.setText("");
					edittext291fm1.setTextColor(0xFF000000);
					edittext292fm1.setTextColor(0xFF000000);
					edittext293fm1.setTextColor(0xFF000000);
					edittext294fm1.setText("");
					edittext295fm1.setText("");
					edittext296fm1.setTextColor(0xFF000000);
					edittext297fm1.setText("");
					edittext298fm1.setText("");
					edittext299fm1.setTextColor(0xFF000000);
					edittext300fm1.setText("");
					edittext301fm1.setText("");
					edittext302fm1.setTextColor(0xFF000000);
					edittext303fm1.setText("");
					edittext304fm1.setText("");
					edittext305fm1.setTextColor(0xFF000000);
					/*
الفعلي
*/
					edittext349fm1.setText("");
					edittext350fm1.setText("");
					edittext351fm1.setText("");
					edittext352fm1.setTextColor(0xFF000000);
					edittext353fm1.setTextColor(0xFF000000);
					edittext354fm1.setText("");
					edittext355fm1.setText("");
					edittext356fm1.setText("");
					edittext357fm1.setTextColor(0xFF000000);
					edittext358fm1.setTextColor(0xFF000000);
					edittext359fm1.setText("");
					edittext360fm1.setText("");
					edittext361fm1.setTextColor(0xFF000000);
					edittext362fm1.setText("");
					edittext363fm1.setText("");
					edittext364fm1.setTextColor(0xFF000000);
					edittext365fm1.setText("");
					edittext366fm1.setText("");
					edittext367fm1.setTextColor(0xFF000000);
					edittext368fm1.setText("");
					edittext369fm1.setText("");
					edittext370fm1.setTextColor(0xFF000000);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button50.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					textview1410.setVisibility(View.VISIBLE);
					linear434.setVisibility(View.VISIBLE);
					textview195.setVisibility(View.VISIBLE);
					linear512.setVisibility(View.VISIBLE);
					linear689.setVisibility(View.GONE);
					linear787.setVisibility(View.GONE);
					linear511.setVisibility(View.GONE);
					linear608.setVisibility(View.GONE);
					linear719.setVisibility(View.GONE);
					linear753.setVisibility(View.GONE);
					/*
الهندسي
*/
					edittext222fm1.setText("");
					edittext223fm1.setText("");
					edittext224fm1.setText("");
					edittext225fm1.setText("");
					edittext226fm1.setText("");
					edittext227fm1.setText("");
					edittext228fm1.setTextColor(0xFF000000);
					edittext229fm1.setTextColor(0xFF000000);
					edittext230fm1.setTextColor(0xFF000000);
					edittext231fm1.setTextColor(0xFF000000);
					edittext232fm1.setText("");
					edittext233fm1.setText("");
					edittext234fm1.setText("");
					edittext235fm1.setTextColor(0xFF000000);
					edittext236fm1.setTextColor(0xFF000000);
					edittext237fm1.setTextColor(0xFF000000);
					edittext238fm1.setTextColor(0xFF000000);
					edittext239fm1.setText("");
					edittext240fm1.setText("");
					edittext241fm1.setTextColor(0xFF000000);
					edittext242fm1.setText("");
					edittext243fm1.setText("");
					edittext244fm1.setTextColor(0xFF000000);
					edittext245fm1.setText("");
					edittext246fm1.setText("");
					edittext247fm1.setTextColor(0xFF000000);
					edittext248fm1.setText("");
					edittext249fm1.setText("");
					edittext250fm1.setTextColor(0xFF000000);
					edittext251fm1.setText("");
					edittext252fm1.setText("");
					edittext253fm1.setText("");
					edittext254fm1.setTextColor(0xFF000000);
					edittext255fm1.setTextColor(0xFF000000);
					edittext256fm1.setTextColor(0xFF000000);
					edittext257fm1.setTextColor(0xFF000000);
					edittext258fm1.setText("");
					edittext259fm1.setText("");
					edittext260fm1.setTextColor(0xFF000000);
					edittext261fm1.setText("");
					edittext262fm1.setText("");
					edittext263fm1.setTextColor(0xFF000000);
					edittext264fm1.setText("");
					edittext265fm1.setText("");
					edittext266fm1.setTextColor(0xFF000000);
					edittext267fm1.setText("");
					edittext268fm1.setText("");
					edittext269fm1.setTextColor(0xFF000000);
					edittext270fm1.setText("");
					edittext271fm1.setText("");
					edittext272fm1.setText("");
					edittext273fm1.setTextColor(0xFF000000);
					edittext274fm1.setTextColor(0xFF000000);
					edittext275fm1.setTextColor(0xFF000000);
					edittext276fm1.setText("");
					edittext277fm1.setText("");
					edittext278fm1.setTextColor(0xFF000000);
					edittext279fm1.setText("");
					edittext280fm1.setText("");
					edittext281fm1.setTextColor(0xFF000000);
					edittext282fm1.setText("");
					edittext283fm1.setText("");
					edittext284fm1.setTextColor(0xFF000000);
					edittext285fm1.setText("");
					edittext286fm1.setText("");
					edittext287fm1.setTextColor(0xFF000000);
					edittext288fm1.setText("");
					edittext289fm1.setText("");
					edittext290fm1.setText("");
					edittext291fm1.setTextColor(0xFF000000);
					edittext292fm1.setTextColor(0xFF000000);
					edittext293fm1.setTextColor(0xFF000000);
					edittext294fm1.setText("");
					edittext295fm1.setText("");
					edittext296fm1.setTextColor(0xFF000000);
					edittext297fm1.setText("");
					edittext298fm1.setText("");
					edittext299fm1.setTextColor(0xFF000000);
					edittext300fm1.setText("");
					edittext301fm1.setText("");
					edittext302fm1.setTextColor(0xFF000000);
					edittext303fm1.setText("");
					edittext304fm1.setText("");
					edittext305fm1.setTextColor(0xFF000000);
					/*
الفعلي
*/
					edittext349fm1.setText("");
					edittext350fm1.setText("");
					edittext351fm1.setText("");
					edittext352fm1.setTextColor(0xFF000000);
					edittext353fm1.setTextColor(0xFF000000);
					edittext354fm1.setText("");
					edittext355fm1.setText("");
					edittext356fm1.setText("");
					edittext357fm1.setTextColor(0xFF000000);
					edittext358fm1.setTextColor(0xFF000000);
					edittext359fm1.setText("");
					edittext360fm1.setText("");
					edittext361fm1.setTextColor(0xFF000000);
					edittext362fm1.setText("");
					edittext363fm1.setText("");
					edittext364fm1.setTextColor(0xFF000000);
					edittext365fm1.setText("");
					edittext366fm1.setText("");
					edittext367fm1.setTextColor(0xFF000000);
					edittext368fm1.setText("");
					edittext369fm1.setText("");
					edittext370fm1.setTextColor(0xFF000000);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext222fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext222fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext235fm1.setText(String.valueOf(00.00));
				edittext238fm1.setText(String.valueOf(00.00));
				edittext235fm1.setTextColor(0xFFE91E63);
				edittext238fm1.setTextColor(0xFFE91E63);
				edittext254fm1.setText(String.valueOf(00.00));
				edittext257fm1.setText(String.valueOf(00.00));
				edittext254fm1.setTextColor(0xFFE91E63);
				edittext257fm1.setTextColor(0xFFE91E63);
				textview1654.setText("---------------------");
				edittext353fm1.setText(String.valueOf(00.00));
				edittext353fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview231.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview231)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("الغطاء الخرساني للعمود وهو عبارة عن الغطاء الخرسانى أو طبقة الخرسانة الموجودة حول حديد تسليح العمود أو رقبة العمود ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بافتراضه بقيمة = ٠.٠٢٥ م \"")
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
		
		edittext223fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext223fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext229fm1.setText(String.valueOf(00.00));
				edittext231fm1.setText(String.valueOf(00.00));
				edittext229fm1.setTextColor(0xFFE91E63);
				edittext231fm1.setTextColor(0xFFE91E63);
				textview1654.setText("---------------------");
				edittext353fm1.setText(String.valueOf(00.00));
				edittext353fm1.setTextColor(0xFFE91E63);
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview420)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("سمك السقف الثاني أو السقف\nأعلي العمود ( م )\nويجب ان لا يقل سمكه عن ١٠ سم ولا يزيد عن ١.٥ متر \n\" وفي حالة ادخال قيمة أقل من ١٠ سم أو أكبر من ١.٥ متر أو \n في حالة عدم إدخاله سيفترضه البرنامج بقيمة = ٠.٢٠ م \"")
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
		
		edittext224fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext224fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext231fm1.setText(String.valueOf(00.00));
				edittext231fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext225fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext225fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext228fm1.setText(String.valueOf(00.00));
				edittext229fm1.setText(String.valueOf(00.00));
				edittext230fm1.setText(String.valueOf(00.00));
				edittext231fm1.setText(String.valueOf(00.00));
				edittext228fm1.setTextColor(0xFFE91E63);
				edittext229fm1.setTextColor(0xFFE91E63);
				edittext230fm1.setTextColor(0xFFE91E63);
				edittext231fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext226fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext226fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext228fm1.setText(String.valueOf(00.00));
				edittext229fm1.setText(String.valueOf(00.00));
				edittext231fm1.setText(String.valueOf(00.00));
				edittext228fm1.setTextColor(0xFFE91E63);
				edittext229fm1.setTextColor(0xFFE91E63);
				edittext231fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1260.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1260)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة طول الرباط لأشاير العمود هي عبارة عن ثابت يتم ضربه في قطر سيخ أشاير العمود و غالبآ = ٦٠ لتكون القيمة النهائية لطول الرباط = ٦٠ × قطر سيخ تسليح العمود بالمتر ( مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٦٠ )")
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
		
		edittext227fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext227fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext228fm1.setText(String.valueOf(00.00));
				edittext229fm1.setText(String.valueOf(00.00));
				edittext231fm1.setText(String.valueOf(00.00));
				edittext228fm1.setTextColor(0xFFE91E63);
				edittext229fm1.setTextColor(0xFFE91E63);
				edittext231fm1.setTextColor(0xFFE91E63);
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview406)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("القيمة الصغرى لطول الرباط Ld لأشاير\nالعمود وهو عبارة عن أصغر قيمة لطول الرباط ( م )\nوذلك طبقآ للملاحظات على اللوحات وغالبآ\n= ١ م أو ١.٢٠ م\n( مدخل إختياري في حالة عدم إدخاله\nسيقوم البرنامج بإفتراض أنه بدون قيمة )")
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
		
		button27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext224fm1.getText().toString().equals("")) || edittext225fm1.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf(1));
					}
					if (edittext223fm1.getText().toString().equals("") || ((Double.parseDouble(edittext223fm1.getText().toString()) > 1.5d) || (Double.parseDouble(edittext223fm1.getText().toString()) < 0.10d))) {
						edittext223fm1.setText(String.valueOf(0.20d));
					}
					if (edittext226fm1.getText().toString().equals("") || (Double.parseDouble(edittext226fm1.getText().toString()) < 0)) {
						edittext226fm1.setText(String.valueOf(60));
					}
					if (edittext227fm1.getText().toString().equals("")) {
						edittext228fm1.setText(String.valueOf(Double.parseDouble(edittext226fm1.getText().toString()) * (Double.parseDouble(edittext225fm1.getText().toString()) / 1000)));
					}
					else {
						if ((Double.parseDouble(edittext226fm1.getText().toString()) * (Double.parseDouble(edittext225fm1.getText().toString()) / 1000)) < Double.parseDouble(edittext227fm1.getText().toString())) {
							edittext228fm1.setText(String.valueOf(Double.parseDouble(edittext227fm1.getText().toString())));
						}
						else {
							edittext228fm1.setText(String.valueOf(Double.parseDouble(edittext226fm1.getText().toString()) * (Double.parseDouble(edittext225fm1.getText().toString()) / 1000)));
						}
					}
					edittext229fm1.setText(String.valueOf((Double.parseDouble(edittext3.getText().toString()) + Double.parseDouble(edittext223fm1.getText().toString())) + Double.parseDouble(edittext228fm1.getText().toString())));
					edittext230fm1.setText(String.valueOf((Double.parseDouble(edittext225fm1.getText().toString()) * Double.parseDouble(edittext225fm1.getText().toString())) / 162));
					edittext231fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext224fm1.getText().toString())) * (Double.parseDouble(edittext229fm1.getText().toString()) * Double.parseDouble(edittext230fm1.getText().toString()))));
					edittext228fm1.setTextColor(0xFF000000);
					edittext229fm1.setTextColor(0xFF000000);
					edittext230fm1.setTextColor(0xFF000000);
					edittext231fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext228fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext228fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext229fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext229fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext230fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext230fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext231fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext231fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button150.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear538.setVisibility(View.GONE);
					linear718.setVisibility(View.VISIBLE);
					linear511.setVisibility(View.GONE);
					linear608.setVisibility(View.GONE);
					linear719.setVisibility(View.GONE);
					linear753.setVisibility(View.GONE);
					edittext232fm1.setText("");
					edittext233fm1.setText("");
					edittext234fm1.setText("");
					edittext235fm1.setTextColor(0xFF000000);
					edittext236fm1.setTextColor(0xFF000000);
					edittext237fm1.setTextColor(0xFF000000);
					edittext238fm1.setTextColor(0xFF000000);
					edittext239fm1.setText("");
					edittext240fm1.setText("");
					edittext241fm1.setTextColor(0xFF000000);
					edittext242fm1.setText("");
					edittext243fm1.setText("");
					edittext244fm1.setTextColor(0xFF000000);
					edittext245fm1.setText("");
					edittext246fm1.setText("");
					edittext247fm1.setTextColor(0xFF000000);
					edittext248fm1.setText("");
					edittext249fm1.setText("");
					edittext250fm1.setTextColor(0xFF000000);
					edittext251fm1.setText("");
					edittext252fm1.setText("");
					edittext253fm1.setText("");
					edittext254fm1.setTextColor(0xFF000000);
					edittext255fm1.setTextColor(0xFF000000);
					edittext256fm1.setTextColor(0xFF000000);
					edittext257fm1.setTextColor(0xFF000000);
					edittext258fm1.setText("");
					edittext259fm1.setText("");
					edittext260fm1.setTextColor(0xFF000000);
					edittext261fm1.setText("");
					edittext262fm1.setText("");
					edittext263fm1.setTextColor(0xFF000000);
					edittext264fm1.setText("");
					edittext265fm1.setText("");
					edittext266fm1.setTextColor(0xFF000000);
					edittext267fm1.setText("");
					edittext268fm1.setText("");
					edittext269fm1.setTextColor(0xFF000000);
					edittext270fm1.setText("");
					edittext271fm1.setText("");
					edittext272fm1.setText("");
					edittext273fm1.setTextColor(0xFF000000);
					edittext274fm1.setTextColor(0xFF000000);
					edittext275fm1.setTextColor(0xFF000000);
					edittext276fm1.setText("");
					edittext277fm1.setText("");
					edittext278fm1.setTextColor(0xFF000000);
					edittext279fm1.setText("");
					edittext280fm1.setText("");
					edittext281fm1.setTextColor(0xFF000000);
					edittext282fm1.setText("");
					edittext283fm1.setText("");
					edittext284fm1.setTextColor(0xFF000000);
					edittext285fm1.setText("");
					edittext286fm1.setText("");
					edittext287fm1.setTextColor(0xFF000000);
					edittext288fm1.setText("");
					edittext289fm1.setText("");
					edittext290fm1.setText("");
					edittext291fm1.setTextColor(0xFF000000);
					edittext292fm1.setTextColor(0xFF000000);
					edittext293fm1.setTextColor(0xFF000000);
					edittext294fm1.setText("");
					edittext295fm1.setText("");
					edittext296fm1.setTextColor(0xFF000000);
					edittext297fm1.setText("");
					edittext298fm1.setText("");
					edittext299fm1.setTextColor(0xFF000000);
					edittext300fm1.setText("");
					edittext301fm1.setText("");
					edittext302fm1.setTextColor(0xFF000000);
					edittext303fm1.setText("");
					edittext304fm1.setText("");
					edittext305fm1.setTextColor(0xFF000000);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button151.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear538.setVisibility(View.VISIBLE);
					linear718.setVisibility(View.GONE);
					linear511.setVisibility(View.GONE);
					linear608.setVisibility(View.GONE);
					linear719.setVisibility(View.GONE);
					linear753.setVisibility(View.GONE);
					edittext232fm1.setText("");
					edittext233fm1.setText("");
					edittext234fm1.setText("");
					edittext235fm1.setTextColor(0xFF000000);
					edittext236fm1.setTextColor(0xFF000000);
					edittext237fm1.setTextColor(0xFF000000);
					edittext238fm1.setTextColor(0xFF000000);
					edittext239fm1.setText("");
					edittext240fm1.setText("");
					edittext241fm1.setTextColor(0xFF000000);
					edittext242fm1.setText("");
					edittext243fm1.setText("");
					edittext244fm1.setTextColor(0xFF000000);
					edittext245fm1.setText("");
					edittext246fm1.setText("");
					edittext247fm1.setTextColor(0xFF000000);
					edittext248fm1.setText("");
					edittext249fm1.setText("");
					edittext250fm1.setTextColor(0xFF000000);
					edittext251fm1.setText("");
					edittext252fm1.setText("");
					edittext253fm1.setText("");
					edittext254fm1.setTextColor(0xFF000000);
					edittext255fm1.setTextColor(0xFF000000);
					edittext256fm1.setTextColor(0xFF000000);
					edittext257fm1.setTextColor(0xFF000000);
					edittext258fm1.setText("");
					edittext259fm1.setText("");
					edittext260fm1.setTextColor(0xFF000000);
					edittext261fm1.setText("");
					edittext262fm1.setText("");
					edittext263fm1.setTextColor(0xFF000000);
					edittext264fm1.setText("");
					edittext265fm1.setText("");
					edittext266fm1.setTextColor(0xFF000000);
					edittext267fm1.setText("");
					edittext268fm1.setText("");
					edittext269fm1.setTextColor(0xFF000000);
					edittext270fm1.setText("");
					edittext271fm1.setText("");
					edittext272fm1.setText("");
					edittext273fm1.setTextColor(0xFF000000);
					edittext274fm1.setTextColor(0xFF000000);
					edittext275fm1.setTextColor(0xFF000000);
					edittext276fm1.setText("");
					edittext277fm1.setText("");
					edittext278fm1.setTextColor(0xFF000000);
					edittext279fm1.setText("");
					edittext280fm1.setText("");
					edittext281fm1.setTextColor(0xFF000000);
					edittext282fm1.setText("");
					edittext283fm1.setText("");
					edittext284fm1.setTextColor(0xFF000000);
					edittext285fm1.setText("");
					edittext286fm1.setText("");
					edittext287fm1.setTextColor(0xFF000000);
					edittext288fm1.setText("");
					edittext289fm1.setText("");
					edittext290fm1.setText("");
					edittext291fm1.setTextColor(0xFF000000);
					edittext292fm1.setTextColor(0xFF000000);
					edittext293fm1.setTextColor(0xFF000000);
					edittext294fm1.setText("");
					edittext295fm1.setText("");
					edittext296fm1.setTextColor(0xFF000000);
					edittext297fm1.setText("");
					edittext298fm1.setText("");
					edittext299fm1.setTextColor(0xFF000000);
					edittext300fm1.setText("");
					edittext301fm1.setText("");
					edittext302fm1.setTextColor(0xFF000000);
					edittext303fm1.setText("");
					edittext304fm1.setText("");
					edittext305fm1.setTextColor(0xFF000000);
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
					linear511.setVisibility(View.GONE);
					linear608.setVisibility(View.VISIBLE);
					linear719.setVisibility(View.GONE);
					linear753.setVisibility(View.GONE);
					linear618.setVisibility(View.GONE);
					linear619.setVisibility(View.GONE);
					linear620.setVisibility(View.GONE);
					linear621.setVisibility(View.GONE);
					edittext232fm1.setText("");
					edittext233fm1.setText("");
					edittext234fm1.setText("");
					edittext235fm1.setTextColor(0xFF000000);
					edittext236fm1.setTextColor(0xFF000000);
					edittext237fm1.setTextColor(0xFF000000);
					edittext238fm1.setTextColor(0xFF000000);
					edittext239fm1.setText("");
					edittext240fm1.setText("");
					edittext241fm1.setTextColor(0xFF000000);
					edittext242fm1.setText("");
					edittext243fm1.setText("");
					edittext244fm1.setTextColor(0xFF000000);
					edittext245fm1.setText("");
					edittext246fm1.setText("");
					edittext247fm1.setTextColor(0xFF000000);
					edittext248fm1.setText("");
					edittext249fm1.setText("");
					edittext250fm1.setTextColor(0xFF000000);
					edittext251fm1.setText("");
					edittext252fm1.setText("");
					edittext253fm1.setText("");
					edittext254fm1.setTextColor(0xFF000000);
					edittext255fm1.setTextColor(0xFF000000);
					edittext256fm1.setTextColor(0xFF000000);
					edittext257fm1.setTextColor(0xFF000000);
					edittext258fm1.setText("");
					edittext259fm1.setText("");
					edittext260fm1.setTextColor(0xFF000000);
					edittext261fm1.setText("");
					edittext262fm1.setText("");
					edittext263fm1.setTextColor(0xFF000000);
					edittext264fm1.setText("");
					edittext265fm1.setText("");
					edittext266fm1.setTextColor(0xFF000000);
					edittext267fm1.setText("");
					edittext268fm1.setText("");
					edittext269fm1.setTextColor(0xFF000000);
					edittext270fm1.setText("");
					edittext271fm1.setText("");
					edittext272fm1.setText("");
					edittext273fm1.setTextColor(0xFF000000);
					edittext274fm1.setTextColor(0xFF000000);
					edittext275fm1.setTextColor(0xFF000000);
					edittext276fm1.setText("");
					edittext277fm1.setText("");
					edittext278fm1.setTextColor(0xFF000000);
					edittext279fm1.setText("");
					edittext280fm1.setText("");
					edittext281fm1.setTextColor(0xFF000000);
					edittext282fm1.setText("");
					edittext283fm1.setText("");
					edittext284fm1.setTextColor(0xFF000000);
					edittext285fm1.setText("");
					edittext286fm1.setText("");
					edittext287fm1.setTextColor(0xFF000000);
					edittext288fm1.setText("");
					edittext289fm1.setText("");
					edittext290fm1.setText("");
					edittext291fm1.setTextColor(0xFF000000);
					edittext292fm1.setTextColor(0xFF000000);
					edittext293fm1.setTextColor(0xFF000000);
					edittext294fm1.setText("");
					edittext295fm1.setText("");
					edittext296fm1.setTextColor(0xFF000000);
					edittext297fm1.setText("");
					edittext298fm1.setText("");
					edittext299fm1.setTextColor(0xFF000000);
					edittext300fm1.setText("");
					edittext301fm1.setText("");
					edittext302fm1.setTextColor(0xFF000000);
					edittext303fm1.setText("");
					edittext304fm1.setText("");
					edittext305fm1.setTextColor(0xFF000000);
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
					linear511.setVisibility(View.VISIBLE);
					linear608.setVisibility(View.GONE);
					linear719.setVisibility(View.GONE);
					linear753.setVisibility(View.GONE);
					linear181.setVisibility(View.GONE);
					linear588.setVisibility(View.GONE);
					linear594.setVisibility(View.GONE);
					linear600.setVisibility(View.GONE);
					edittext232fm1.setText("");
					edittext233fm1.setText("");
					edittext234fm1.setText("");
					edittext235fm1.setTextColor(0xFF000000);
					edittext236fm1.setTextColor(0xFF000000);
					edittext237fm1.setTextColor(0xFF000000);
					edittext238fm1.setTextColor(0xFF000000);
					edittext239fm1.setText("");
					edittext240fm1.setText("");
					edittext241fm1.setTextColor(0xFF000000);
					edittext242fm1.setText("");
					edittext243fm1.setText("");
					edittext244fm1.setTextColor(0xFF000000);
					edittext245fm1.setText("");
					edittext246fm1.setText("");
					edittext247fm1.setTextColor(0xFF000000);
					edittext248fm1.setText("");
					edittext249fm1.setText("");
					edittext250fm1.setTextColor(0xFF000000);
					edittext251fm1.setText("");
					edittext252fm1.setText("");
					edittext253fm1.setText("");
					edittext254fm1.setTextColor(0xFF000000);
					edittext255fm1.setTextColor(0xFF000000);
					edittext256fm1.setTextColor(0xFF000000);
					edittext257fm1.setTextColor(0xFF000000);
					edittext258fm1.setText("");
					edittext259fm1.setText("");
					edittext260fm1.setTextColor(0xFF000000);
					edittext261fm1.setText("");
					edittext262fm1.setText("");
					edittext263fm1.setTextColor(0xFF000000);
					edittext264fm1.setText("");
					edittext265fm1.setText("");
					edittext266fm1.setTextColor(0xFF000000);
					edittext267fm1.setText("");
					edittext268fm1.setText("");
					edittext269fm1.setTextColor(0xFF000000);
					edittext270fm1.setText("");
					edittext271fm1.setText("");
					edittext272fm1.setText("");
					edittext273fm1.setTextColor(0xFF000000);
					edittext274fm1.setTextColor(0xFF000000);
					edittext275fm1.setTextColor(0xFF000000);
					edittext276fm1.setText("");
					edittext277fm1.setText("");
					edittext278fm1.setTextColor(0xFF000000);
					edittext279fm1.setText("");
					edittext280fm1.setText("");
					edittext281fm1.setTextColor(0xFF000000);
					edittext282fm1.setText("");
					edittext283fm1.setText("");
					edittext284fm1.setTextColor(0xFF000000);
					edittext285fm1.setText("");
					edittext286fm1.setText("");
					edittext287fm1.setTextColor(0xFF000000);
					edittext288fm1.setText("");
					edittext289fm1.setText("");
					edittext290fm1.setText("");
					edittext291fm1.setTextColor(0xFF000000);
					edittext292fm1.setTextColor(0xFF000000);
					edittext293fm1.setTextColor(0xFF000000);
					edittext294fm1.setText("");
					edittext295fm1.setText("");
					edittext296fm1.setTextColor(0xFF000000);
					edittext297fm1.setText("");
					edittext298fm1.setText("");
					edittext299fm1.setTextColor(0xFF000000);
					edittext300fm1.setText("");
					edittext301fm1.setText("");
					edittext302fm1.setTextColor(0xFF000000);
					edittext303fm1.setText("");
					edittext304fm1.setText("");
					edittext305fm1.setTextColor(0xFF000000);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button152.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear511.setVisibility(View.GONE);
					linear608.setVisibility(View.GONE);
					linear719.setVisibility(View.GONE);
					linear753.setVisibility(View.VISIBLE);
					linear763.setVisibility(View.GONE);
					linear764.setVisibility(View.GONE);
					linear765.setVisibility(View.GONE);
					linear766.setVisibility(View.GONE);
					edittext232fm1.setText("");
					edittext233fm1.setText("");
					edittext234fm1.setText("");
					edittext235fm1.setTextColor(0xFF000000);
					edittext236fm1.setTextColor(0xFF000000);
					edittext237fm1.setTextColor(0xFF000000);
					edittext238fm1.setTextColor(0xFF000000);
					edittext239fm1.setText("");
					edittext240fm1.setText("");
					edittext241fm1.setTextColor(0xFF000000);
					edittext242fm1.setText("");
					edittext243fm1.setText("");
					edittext244fm1.setTextColor(0xFF000000);
					edittext245fm1.setText("");
					edittext246fm1.setText("");
					edittext247fm1.setTextColor(0xFF000000);
					edittext248fm1.setText("");
					edittext249fm1.setText("");
					edittext250fm1.setTextColor(0xFF000000);
					edittext251fm1.setText("");
					edittext252fm1.setText("");
					edittext253fm1.setText("");
					edittext254fm1.setTextColor(0xFF000000);
					edittext255fm1.setTextColor(0xFF000000);
					edittext256fm1.setTextColor(0xFF000000);
					edittext257fm1.setTextColor(0xFF000000);
					edittext258fm1.setText("");
					edittext259fm1.setText("");
					edittext260fm1.setTextColor(0xFF000000);
					edittext261fm1.setText("");
					edittext262fm1.setText("");
					edittext263fm1.setTextColor(0xFF000000);
					edittext264fm1.setText("");
					edittext265fm1.setText("");
					edittext266fm1.setTextColor(0xFF000000);
					edittext267fm1.setText("");
					edittext268fm1.setText("");
					edittext269fm1.setTextColor(0xFF000000);
					edittext270fm1.setText("");
					edittext271fm1.setText("");
					edittext272fm1.setText("");
					edittext273fm1.setTextColor(0xFF000000);
					edittext274fm1.setTextColor(0xFF000000);
					edittext275fm1.setTextColor(0xFF000000);
					edittext276fm1.setText("");
					edittext277fm1.setText("");
					edittext278fm1.setTextColor(0xFF000000);
					edittext279fm1.setText("");
					edittext280fm1.setText("");
					edittext281fm1.setTextColor(0xFF000000);
					edittext282fm1.setText("");
					edittext283fm1.setText("");
					edittext284fm1.setTextColor(0xFF000000);
					edittext285fm1.setText("");
					edittext286fm1.setText("");
					edittext287fm1.setTextColor(0xFF000000);
					edittext288fm1.setText("");
					edittext289fm1.setText("");
					edittext290fm1.setText("");
					edittext291fm1.setTextColor(0xFF000000);
					edittext292fm1.setTextColor(0xFF000000);
					edittext293fm1.setTextColor(0xFF000000);
					edittext294fm1.setText("");
					edittext295fm1.setText("");
					edittext296fm1.setTextColor(0xFF000000);
					edittext297fm1.setText("");
					edittext298fm1.setText("");
					edittext299fm1.setTextColor(0xFF000000);
					edittext300fm1.setText("");
					edittext301fm1.setText("");
					edittext302fm1.setTextColor(0xFF000000);
					edittext303fm1.setText("");
					edittext304fm1.setText("");
					edittext305fm1.setTextColor(0xFF000000);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		button153.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear511.setVisibility(View.GONE);
					linear608.setVisibility(View.GONE);
					linear719.setVisibility(View.VISIBLE);
					linear753.setVisibility(View.GONE);
					linear729.setVisibility(View.GONE);
					linear730.setVisibility(View.GONE);
					linear731.setVisibility(View.GONE);
					linear732.setVisibility(View.GONE);
					edittext232fm1.setText("");
					edittext233fm1.setText("");
					edittext234fm1.setText("");
					edittext235fm1.setTextColor(0xFF000000);
					edittext236fm1.setTextColor(0xFF000000);
					edittext237fm1.setTextColor(0xFF000000);
					edittext238fm1.setTextColor(0xFF000000);
					edittext239fm1.setText("");
					edittext240fm1.setText("");
					edittext241fm1.setTextColor(0xFF000000);
					edittext242fm1.setText("");
					edittext243fm1.setText("");
					edittext244fm1.setTextColor(0xFF000000);
					edittext245fm1.setText("");
					edittext246fm1.setText("");
					edittext247fm1.setTextColor(0xFF000000);
					edittext248fm1.setText("");
					edittext249fm1.setText("");
					edittext250fm1.setTextColor(0xFF000000);
					edittext251fm1.setText("");
					edittext252fm1.setText("");
					edittext253fm1.setText("");
					edittext254fm1.setTextColor(0xFF000000);
					edittext255fm1.setTextColor(0xFF000000);
					edittext256fm1.setTextColor(0xFF000000);
					edittext257fm1.setTextColor(0xFF000000);
					edittext258fm1.setText("");
					edittext259fm1.setText("");
					edittext260fm1.setTextColor(0xFF000000);
					edittext261fm1.setText("");
					edittext262fm1.setText("");
					edittext263fm1.setTextColor(0xFF000000);
					edittext264fm1.setText("");
					edittext265fm1.setText("");
					edittext266fm1.setTextColor(0xFF000000);
					edittext267fm1.setText("");
					edittext268fm1.setText("");
					edittext269fm1.setTextColor(0xFF000000);
					edittext270fm1.setText("");
					edittext271fm1.setText("");
					edittext272fm1.setText("");
					edittext273fm1.setTextColor(0xFF000000);
					edittext274fm1.setTextColor(0xFF000000);
					edittext275fm1.setTextColor(0xFF000000);
					edittext276fm1.setText("");
					edittext277fm1.setText("");
					edittext278fm1.setTextColor(0xFF000000);
					edittext279fm1.setText("");
					edittext280fm1.setText("");
					edittext281fm1.setTextColor(0xFF000000);
					edittext282fm1.setText("");
					edittext283fm1.setText("");
					edittext284fm1.setTextColor(0xFF000000);
					edittext285fm1.setText("");
					edittext286fm1.setText("");
					edittext287fm1.setTextColor(0xFF000000);
					edittext288fm1.setText("");
					edittext289fm1.setText("");
					edittext290fm1.setText("");
					edittext291fm1.setTextColor(0xFF000000);
					edittext292fm1.setTextColor(0xFF000000);
					edittext293fm1.setTextColor(0xFF000000);
					edittext294fm1.setText("");
					edittext295fm1.setText("");
					edittext296fm1.setTextColor(0xFF000000);
					edittext297fm1.setText("");
					edittext298fm1.setText("");
					edittext299fm1.setTextColor(0xFF000000);
					edittext300fm1.setText("");
					edittext301fm1.setText("");
					edittext302fm1.setTextColor(0xFF000000);
					edittext303fm1.setText("");
					edittext304fm1.setText("");
					edittext305fm1.setTextColor(0xFF000000);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext232fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext232fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext236fm1.setText(String.valueOf(00.00));
				edittext238fm1.setText(String.valueOf(00.00));
				edittext236fm1.setTextColor(0xFFE91E63);
				edittext238fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview260.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview260)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد صفوف الكانات بالعمود لكل م.ط\n( بيكون مساوى لعدد كانات الداير بالعمود لكل م.ط )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة =\n٦ كانات / م.ط \"")
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
		
		edittext233fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext233fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 3)});
				edittext237fm1.setText(String.valueOf(00.00));
				edittext238fm1.setText(String.valueOf(00.00));
				edittext237fm1.setTextColor(0xFFE91E63);
				edittext238fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview232.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview232)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("قطر سيخ كانات الأعمدة ( مم )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٨ مم \"")
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
		
		edittext234fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext234fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 3)});
				edittext235fm1.setText(String.valueOf(00.00));
				edittext238fm1.setText(String.valueOf(00.00));
				edittext235fm1.setTextColor(0xFFE91E63);
				edittext238fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1249.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1249)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("طول قفل كانة العمود ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيفترضه البرنامج بقيمة = ٠.١٠ م \"")
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
		
		button33.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) || edittext3.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
					if (edittext222fm1.getText().toString().equals("") || ((Double.parseDouble(edittext222fm1.getText().toString()) > 0.07d) || (Double.parseDouble(edittext222fm1.getText().toString()) < 0.01d))) {
						edittext222fm1.setText(String.valueOf(0.025d));
					}
					if (edittext232fm1.getText().toString().equals("") || ((Double.parseDouble(edittext232fm1.getText().toString()) > 10) || (Double.parseDouble(edittext232fm1.getText().toString()) < 5))) {
						edittext232fm1.setText(String.valueOf(6));
					}
					if (edittext233fm1.getText().toString().equals("") || ((Double.parseDouble(edittext233fm1.getText().toString()) > 16) || (Double.parseDouble(edittext233fm1.getText().toString()) < 8))) {
						edittext233fm1.setText(String.valueOf(8));
					}
					if (edittext234fm1.getText().toString().equals("") || ((Double.parseDouble(edittext234fm1.getText().toString()) > 0.15d) || (Double.parseDouble(edittext234fm1.getText().toString()) < 0.05d))) {
						edittext234fm1.setText(String.valueOf(0.10d));
					}
					edittext235fm1.setText(String.valueOf((((Double.parseDouble(edittext1.getText().toString()) - (2 * Double.parseDouble(edittext222fm1.getText().toString()))) + (Double.parseDouble(edittext2.getText().toString()) - (2 * Double.parseDouble(edittext222fm1.getText().toString())))) + ((Double.parseDouble(edittext1.getText().toString()) - (2 * Double.parseDouble(edittext222fm1.getText().toString()))) + (Double.parseDouble(edittext2.getText().toString()) - (2 * Double.parseDouble(edittext222fm1.getText().toString()))))) + (2 * Double.parseDouble(edittext234fm1.getText().toString()))));
					edittext236fm1.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext3.getText().toString()) * Double.parseDouble(edittext232fm1.getText().toString())) + 1));
					edittext237fm1.setText(String.valueOf((Double.parseDouble(edittext233fm1.getText().toString()) * Double.parseDouble(edittext233fm1.getText().toString())) / 162));
					edittext238fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext235fm1.getText().toString())) * (Double.parseDouble(edittext236fm1.getText().toString()) * Double.parseDouble(edittext237fm1.getText().toString()))));
					edittext235fm1.setTextColor(0xFF000000);
					edittext236fm1.setTextColor(0xFF000000);
					edittext237fm1.setTextColor(0xFF000000);
					edittext238fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext235fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext235fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext236fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext236fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext241fm1.setText(String.valueOf(00.00));
				edittext241fm1.setTextColor(0xFFE91E63);
				edittext244fm1.setText(String.valueOf(00.00));
				edittext244fm1.setTextColor(0xFFE91E63);
				edittext247fm1.setText(String.valueOf(00.00));
				edittext247fm1.setTextColor(0xFFE91E63);
				edittext250fm1.setText(String.valueOf(00.00));
				edittext250fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext237fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext237fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext241fm1.setText(String.valueOf(00.00));
				edittext241fm1.setTextColor(0xFFE91E63);
				edittext244fm1.setText(String.valueOf(00.00));
				edittext244fm1.setTextColor(0xFFE91E63);
				edittext247fm1.setText(String.valueOf(00.00));
				edittext247fm1.setTextColor(0xFFE91E63);
				edittext250fm1.setText(String.valueOf(00.00));
				edittext250fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext238fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext238fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button109.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear181.setVisibility(View.VISIBLE);
					edittext239fm1.setText("");
					edittext240fm1.setText("");
					edittext241fm1.setTextColor(0xFF000000);
					button109.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext239fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext239fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext241fm1.setText(String.valueOf(00.00));
				edittext241fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext240fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext240fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext241fm1.setText(String.valueOf(00.00));
				edittext241fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview258.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview258)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext239fm1.getText().toString().equals("") || (edittext233fm1.getText().toString().equals("") || edittext232fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext240fm1.getText().toString().equals("") || (Double.parseDouble(edittext240fm1.getText().toString()) < 0)) {
						edittext240fm1.setText(String.valueOf((long)(1)));
					}
					edittext241fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext236fm1.getText().toString())) * (Double.parseDouble(edittext237fm1.getText().toString()) * (Double.parseDouble(edittext239fm1.getText().toString()) * Double.parseDouble(edittext240fm1.getText().toString())))));
					edittext241fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext241fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext241fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
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
				linear181.setVisibility(View.GONE);
				button109.setVisibility(View.VISIBLE);
				edittext239fm1.setText("");
				edittext240fm1.setText("");
			}
		});
		
		button115.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear588.setVisibility(View.VISIBLE);
					edittext242fm1.setText("");
					edittext243fm1.setText("");
					edittext244fm1.setTextColor(0xFF000000);
					button115.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext242fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext242fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext244fm1.setText(String.valueOf(00.00));
				edittext244fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext243fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext243fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext244fm1.setText(String.valueOf(00.00));
				edittext244fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1390.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1390)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button118.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext242fm1.getText().toString().equals("") || (edittext233fm1.getText().toString().equals("") || edittext232fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext243fm1.getText().toString().equals("") || (Double.parseDouble(edittext243fm1.getText().toString()) < 0)) {
						edittext243fm1.setText(String.valueOf((long)(1)));
					}
					edittext244fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext236fm1.getText().toString())) * (Double.parseDouble(edittext237fm1.getText().toString()) * (Double.parseDouble(edittext242fm1.getText().toString()) * Double.parseDouble(edittext243fm1.getText().toString())))));
					edittext244fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext244fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext244fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button119.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear588.setVisibility(View.GONE);
				button115.setVisibility(View.VISIBLE);
				edittext242fm1.setText("");
				edittext243fm1.setText("");
			}
		});
		
		button120.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear594.setVisibility(View.VISIBLE);
					edittext245fm1.setText("");
					edittext246fm1.setText("");
					edittext247fm1.setTextColor(0xFF000000);
					button120.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext245fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext245fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext247fm1.setText(String.valueOf(00.00));
				edittext247fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1400.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		edittext246fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext246fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext247fm1.setText(String.valueOf(00.00));
				edittext247fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1403.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1403)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button121.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext245fm1.getText().toString().equals("") || (edittext233fm1.getText().toString().equals("") || edittext232fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext246fm1.getText().toString().equals("") || (Double.parseDouble(edittext246fm1.getText().toString()) < 0)) {
						edittext246fm1.setText(String.valueOf((long)(1)));
					}
					edittext247fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext236fm1.getText().toString())) * (Double.parseDouble(edittext237fm1.getText().toString()) * (Double.parseDouble(edittext245fm1.getText().toString()) * Double.parseDouble(edittext246fm1.getText().toString())))));
					edittext247fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext247fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext247fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button122.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear594.setVisibility(View.GONE);
				button120.setVisibility(View.VISIBLE);
				edittext245fm1.setText("");
				edittext246fm1.setText("");
			}
		});
		
		button123.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear600.setVisibility(View.VISIBLE);
					edittext248fm1.setText("");
					edittext249fm1.setText("");
					edittext250fm1.setTextColor(0xFF000000);
					button123.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext248fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext248fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext250fm1.setText(String.valueOf(00.00));
				edittext250fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext249fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext249fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext250fm1.setText(String.valueOf(00.00));
				edittext250fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1416.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1416)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button124.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext248fm1.getText().toString().equals("") || (edittext233fm1.getText().toString().equals("") || edittext232fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext249fm1.getText().toString().equals("") || (Double.parseDouble(edittext249fm1.getText().toString()) < 0)) {
						edittext249fm1.setText(String.valueOf((long)(1)));
					}
					edittext250fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext236fm1.getText().toString())) * (Double.parseDouble(edittext237fm1.getText().toString()) * (Double.parseDouble(edittext248fm1.getText().toString()) * Double.parseDouble(edittext249fm1.getText().toString())))));
					edittext250fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext250fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext250fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button125.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear605.setVisibility(View.GONE);
				edittext248fm1.setText("");
				edittext249fm1.setText("");
				button123.setVisibility(View.VISIBLE);
			}
		});
		
		edittext251fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext251fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext255fm1.setText(String.valueOf(00.00));
				edittext257fm1.setText(String.valueOf(00.00));
				edittext255fm1.setTextColor(0xFFE91E63);
				edittext257fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1431.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1431)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("المسافات البينية بين صفوف الكانات بالعمود لكل م.ط\n( بيكون مساوى للمسافات البينية بين كانات الداير بالعمود لكل م.ط )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة =\n٠.١٥ م / م.ط \"")
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
		
		edittext252fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext252fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 3)});
				edittext256fm1.setText(String.valueOf(00.00));
				edittext257fm1.setText(String.valueOf(00.00));
				edittext256fm1.setTextColor(0xFFE91E63);
				edittext257fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1434.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1434)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("قطر سيخ كانات الأعمدة ( مم )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٨ مم \"")
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
		
		edittext253fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext253fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext254fm1.setText(String.valueOf(00.00));
				edittext257fm1.setText(String.valueOf(00.00));
				edittext254fm1.setTextColor(0xFFE91E63);
				edittext257fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1437.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1437)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("طول قفل كانة العمود ( م )\n\" مدخل إختياري في حالة عدم إدخاله سيفترضه البرنامج بقيمة = ٠.١٠ م \"")
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
		
		button126.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) || edittext3.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
					if (edittext222fm1.getText().toString().equals("") || ((Double.parseDouble(edittext222fm1.getText().toString()) > 0.07d) || (Double.parseDouble(edittext222fm1.getText().toString()) < 0.01d))) {
						edittext222fm1.setText(String.valueOf(0.025d));
					}
					if (edittext251fm1.getText().toString().equals("") || ((Double.parseDouble(edittext251fm1.getText().toString()) > 0.20d) || (Double.parseDouble(edittext251fm1.getText().toString()) < 0.07d))) {
						edittext251fm1.setText(String.valueOf(0.15d));
					}
					if (edittext252fm1.getText().toString().equals("") || ((Double.parseDouble(edittext252fm1.getText().toString()) > 16) || (Double.parseDouble(edittext252fm1.getText().toString()) < 8))) {
						edittext252fm1.setText(String.valueOf(8));
					}
					if (edittext253fm1.getText().toString().equals("") || ((Double.parseDouble(edittext253fm1.getText().toString()) > 0.15d) || (Double.parseDouble(edittext253fm1.getText().toString()) < 0.05d))) {
						edittext253fm1.setText(String.valueOf(0.10d));
					}
					edittext254fm1.setText(String.valueOf((((Double.parseDouble(edittext1.getText().toString()) - (2 * Double.parseDouble(edittext222fm1.getText().toString()))) + (Double.parseDouble(edittext2.getText().toString()) - (2 * Double.parseDouble(edittext222fm1.getText().toString())))) + ((Double.parseDouble(edittext1.getText().toString()) - (2 * Double.parseDouble(edittext222fm1.getText().toString()))) + (Double.parseDouble(edittext2.getText().toString()) - (2 * Double.parseDouble(edittext222fm1.getText().toString()))))) + (2 * Double.parseDouble(edittext253fm1.getText().toString()))));
					edittext255fm1.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext3.getText().toString()) / Double.parseDouble(edittext251fm1.getText().toString())) + 1));
					edittext256fm1.setText(String.valueOf((Double.parseDouble(edittext252fm1.getText().toString()) * Double.parseDouble(edittext252fm1.getText().toString())) / 162));
					edittext257fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext254fm1.getText().toString())) * (Double.parseDouble(edittext255fm1.getText().toString()) * Double.parseDouble(edittext256fm1.getText().toString()))));
					edittext254fm1.setTextColor(0xFF000000);
					edittext255fm1.setTextColor(0xFF000000);
					edittext256fm1.setTextColor(0xFF000000);
					edittext257fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext254fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext254fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext255fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext255fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext260fm1.setText(String.valueOf(00.00));
				edittext260fm1.setTextColor(0xFFE91E63);
				edittext263fm1.setText(String.valueOf(00.00));
				edittext263fm1.setTextColor(0xFFE91E63);
				edittext266fm1.setText(String.valueOf(00.00));
				edittext266fm1.setTextColor(0xFFE91E63);
				edittext269fm1.setText(String.valueOf(00.00));
				edittext269fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext256fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext256fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext260fm1.setText(String.valueOf(00.00));
				edittext260fm1.setTextColor(0xFFE91E63);
				edittext263fm1.setText(String.valueOf(00.00));
				edittext263fm1.setTextColor(0xFFE91E63);
				edittext266fm1.setText(String.valueOf(00.00));
				edittext266fm1.setTextColor(0xFFE91E63);
				edittext269fm1.setText(String.valueOf(00.00));
				edittext269fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext257fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext257fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button127.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear618.setVisibility(View.VISIBLE);
					edittext258fm1.setText("");
					edittext259fm1.setText("");
					edittext260fm1.setTextColor(0xFF000000);
					button127.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext258fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext258fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext260fm1.setText(String.valueOf(00.00));
				edittext260fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext259fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext259fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext260fm1.setText(String.valueOf(00.00));
				edittext260fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1459.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1459)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button128.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext258fm1.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext3.getText().toString().equals("") || (edittext251fm1.getText().toString().equals("") || edittext252fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext259fm1.getText().toString().equals("") || (Double.parseDouble(edittext259fm1.getText().toString()) < 0)) {
						edittext259fm1.setText(String.valueOf((long)(1)));
					}
					edittext260fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext255fm1.getText().toString())) * (Double.parseDouble(edittext256fm1.getText().toString()) * (Double.parseDouble(edittext258fm1.getText().toString()) * Double.parseDouble(edittext259fm1.getText().toString())))));
					edittext260fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext260fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext260fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button129.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear618.setVisibility(View.GONE);
				edittext258fm1.setText("");
				edittext259fm1.setText("");
				edittext260fm1.setTextColor(0xFF000000);
				button127.setVisibility(View.VISIBLE);
			}
		});
		
		button130.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear619.setVisibility(View.VISIBLE);
					edittext261fm1.setText("");
					edittext262fm1.setText("");
					edittext263fm1.setTextColor(0xFF000000);
					button130.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext261fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext261fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext263fm1.setText(String.valueOf(00.00));
				edittext263fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext262fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext262fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext263fm1.setText(String.valueOf(00.00));
				edittext263fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1472.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1472)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button131.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext261fm1.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext3.getText().toString().equals("") || (edittext251fm1.getText().toString().equals("") || edittext252fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext262fm1.getText().toString().equals("") || (Double.parseDouble(edittext262fm1.getText().toString()) < 0)) {
						edittext262fm1.setText(String.valueOf((long)(1)));
					}
					edittext263fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext255fm1.getText().toString())) * (Double.parseDouble(edittext256fm1.getText().toString()) * (Double.parseDouble(edittext261fm1.getText().toString()) * Double.parseDouble(edittext262fm1.getText().toString())))));
					edittext263fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext263fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext263fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button132.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear619.setVisibility(View.GONE);
				edittext261fm1.setText("");
				edittext262fm1.setText("");
				edittext263fm1.setTextColor(0xFF000000);
				button130.setVisibility(View.VISIBLE);
			}
		});
		
		button133.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear620.setVisibility(View.VISIBLE);
					edittext264fm1.setText("");
					edittext265fm1.setText("");
					edittext266fm1.setTextColor(0xFF000000);
					button133.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext264fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext264fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext266fm1.setText(String.valueOf(00.00));
				edittext266fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext265fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext265fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext266fm1.setText(String.valueOf(00.00));
				edittext266fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1485.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1485)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button134.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext264fm1.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext3.getText().toString().equals("") || (edittext251fm1.getText().toString().equals("") || edittext252fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext265fm1.getText().toString().equals("") || (Double.parseDouble(edittext265fm1.getText().toString()) < 0)) {
						edittext265fm1.setText(String.valueOf((long)(1)));
					}
					edittext266fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext255fm1.getText().toString())) * (Double.parseDouble(edittext256fm1.getText().toString()) * (Double.parseDouble(edittext264fm1.getText().toString()) * Double.parseDouble(edittext265fm1.getText().toString())))));
					edittext266fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext266fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext266fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button135.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear620.setVisibility(View.GONE);
				edittext264fm1.setText("");
				edittext265fm1.setText("");
				edittext266fm1.setTextColor(0xFF000000);
				button133.setVisibility(View.VISIBLE);
			}
		});
		
		button136.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear621.setVisibility(View.VISIBLE);
					edittext267fm1.setText("");
					edittext268fm1.setText("");
					edittext269fm1.setTextColor(0xFF000000);
					button136.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext267fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext267fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext269fm1.setText(String.valueOf(00.00));
				edittext269fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext268fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext268fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext269fm1.setText(String.valueOf(00.00));
				edittext269fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1498.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1498)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button137.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext267fm1.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext3.getText().toString().equals("") || (edittext251fm1.getText().toString().equals("") || edittext252fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext268fm1.getText().toString().equals("") || (Double.parseDouble(edittext268fm1.getText().toString()) < 0)) {
						edittext268fm1.setText(String.valueOf((long)(1)));
					}
					edittext269fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext255fm1.getText().toString())) * (Double.parseDouble(edittext256fm1.getText().toString()) * (Double.parseDouble(edittext267fm1.getText().toString()) * Double.parseDouble(edittext268fm1.getText().toString())))));
					edittext269fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext269fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext269fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button138.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear621.setVisibility(View.GONE);
				edittext267fm1.setText("");
				edittext268fm1.setText("");
				edittext269fm1.setTextColor(0xFF000000);
				button136.setVisibility(View.VISIBLE);
			}
		});
		
		edittext270fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext270fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext273fm1.setText(String.valueOf(00.00));
				edittext275fm1.setText(String.valueOf(00.00));
				edittext273fm1.setTextColor(0xFFE91E63);
				edittext275fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1733.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1733)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("عدد صفوف الكانات بالعمود لكل م.ط\n( بيكون مساوى لعدد الكانات الأوتوماتيك بالعمود لكل م.ط )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة =\n٦ كانات / م.ط \"")
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
		
		edittext271fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext271fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 3)});
				edittext274fm1.setText(String.valueOf(00.00));
				edittext275fm1.setText(String.valueOf(00.00));
				edittext274fm1.setTextColor(0xFFE91E63);
				edittext275fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1736.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "قطر سيخ كانات الأعمدة ( مم )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٨ مم \"");
				return true;
			}
		});
		
		edittext272fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext272fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext275fm1.setText(String.valueOf(00.00));
				edittext275fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button154.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) || (edittext3.getText().toString().equals("") || edittext272fm1.getText().toString().equals(""))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
					if (edittext270fm1.getText().toString().equals("") || ((Double.parseDouble(edittext270fm1.getText().toString()) > 12) || (Double.parseDouble(edittext270fm1.getText().toString()) < 5))) {
						edittext270fm1.setText(String.valueOf(6));
					}
					if (edittext271fm1.getText().toString().equals("") || ((Double.parseDouble(edittext271fm1.getText().toString()) > 16) || (Double.parseDouble(edittext271fm1.getText().toString()) < 8))) {
						edittext271fm1.setText(String.valueOf(8));
					}
					edittext273fm1.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext3.getText().toString()) * Double.parseDouble(edittext270fm1.getText().toString())) + 1));
					edittext274fm1.setText(String.valueOf((Double.parseDouble(edittext271fm1.getText().toString()) * Double.parseDouble(edittext271fm1.getText().toString())) / 162));
					edittext275fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext272fm1.getText().toString())) * (Double.parseDouble(edittext273fm1.getText().toString()) * Double.parseDouble(edittext274fm1.getText().toString()))));
					edittext273fm1.setTextColor(0xFF000000);
					edittext274fm1.setTextColor(0xFF000000);
					edittext275fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext273fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext273fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext278fm1.setText(String.valueOf(00.00));
				edittext281fm1.setText(String.valueOf(00.00));
				edittext284fm1.setText(String.valueOf(00.00));
				edittext287fm1.setText(String.valueOf(00.00));
				edittext278fm1.setTextColor(0xFFE91E63);
				edittext281fm1.setTextColor(0xFFE91E63);
				edittext284fm1.setTextColor(0xFFE91E63);
				edittext287fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext274fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext274fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext278fm1.setText(String.valueOf(00.00));
				edittext281fm1.setText(String.valueOf(00.00));
				edittext284fm1.setText(String.valueOf(00.00));
				edittext287fm1.setText(String.valueOf(00.00));
				edittext278fm1.setTextColor(0xFFE91E63);
				edittext281fm1.setTextColor(0xFFE91E63);
				edittext284fm1.setTextColor(0xFFE91E63);
				edittext287fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext275fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext275fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button155.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear729.setVisibility(View.VISIBLE);
					edittext276fm1.setText("");
					edittext277fm1.setText("");
					edittext278fm1.setTextColor(0xFF000000);
					button155.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext276fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext276fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext278fm1.setText(String.valueOf(00.00));
				edittext278fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext277fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext277fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext278fm1.setText(String.valueOf(00.00));
				edittext278fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1761.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1761)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button156.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext276fm1.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext3.getText().toString().equals("") || (edittext271fm1.getText().toString().equals("") || edittext270fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext277fm1.getText().toString().equals("") || (Double.parseDouble(edittext277fm1.getText().toString()) < 0)) {
						edittext277fm1.setText(String.valueOf((long)(1)));
					}
					edittext278fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext273fm1.getText().toString())) * (Double.parseDouble(edittext274fm1.getText().toString()) * (Double.parseDouble(edittext276fm1.getText().toString()) * Double.parseDouble(edittext277fm1.getText().toString())))));
					edittext278fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext278fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext278fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button157.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear729.setVisibility(View.GONE);
				edittext276fm1.setText("");
				edittext277fm1.setText("");
				edittext278fm1.setTextColor(0xFF000000);
				button155.setVisibility(View.VISIBLE);
			}
		});
		
		button158.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear730.setVisibility(View.VISIBLE);
					edittext279fm1.setText("");
					edittext280fm1.setText("");
					edittext281fm1.setTextColor(0xFF000000);
					button158.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext279fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext279fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext281fm1.setText(String.valueOf(00.00));
				edittext281fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext280fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext280fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext281fm1.setText(String.valueOf(00.00));
				edittext281fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1774.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1774)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button159.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext279fm1.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext3.getText().toString().equals("") || (edittext271fm1.getText().toString().equals("") || edittext270fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext280fm1.getText().toString().equals("") || (Double.parseDouble(edittext280fm1.getText().toString()) < 0)) {
						edittext280fm1.setText(String.valueOf((long)(1)));
					}
					edittext281fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext273fm1.getText().toString())) * (Double.parseDouble(edittext274fm1.getText().toString()) * (Double.parseDouble(edittext279fm1.getText().toString()) * Double.parseDouble(edittext280fm1.getText().toString())))));
					edittext281fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext281fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext281fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button160.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button161.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear731.setVisibility(View.VISIBLE);
					edittext282fm1.setText("");
					edittext283fm1.setText("");
					edittext284fm1.setTextColor(0xFF000000);
					button161.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext282fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext282fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext284fm1.setText(String.valueOf(00.00));
				edittext284fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext283fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext283fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext284fm1.setText(String.valueOf(00.00));
				edittext284fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1787.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1787)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button162.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext282fm1.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext3.getText().toString().equals("") || (edittext271fm1.getText().toString().equals("") || edittext270fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext283fm1.getText().toString().equals("") || (Double.parseDouble(edittext283fm1.getText().toString()) < 0)) {
						edittext283fm1.setText(String.valueOf((long)(1)));
					}
					edittext284fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext273fm1.getText().toString())) * (Double.parseDouble(edittext274fm1.getText().toString()) * (Double.parseDouble(edittext282fm1.getText().toString()) * Double.parseDouble(edittext283fm1.getText().toString())))));
					edittext284fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext284fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext284fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button163.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear731.setVisibility(View.GONE);
				edittext282fm1.setText("");
				edittext283fm1.setText("");
				edittext284fm1.setTextColor(0xFF000000);
				button161.setVisibility(View.VISIBLE);
			}
		});
		
		button164.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear732.setVisibility(View.VISIBLE);
					edittext285fm1.setText("");
					edittext286fm1.setText("");
					edittext287fm1.setTextColor(0xFF000000);
					button164.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext285fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext285fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext287fm1.setText(String.valueOf(00.00));
				edittext287fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext286fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext286fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext287fm1.setText(String.valueOf(00.00));
				edittext287fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1800.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1800)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button165.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext285fm1.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext3.getText().toString().equals("") || (edittext271fm1.getText().toString().equals("") || edittext270fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext286fm1.getText().toString().equals("") || (Double.parseDouble(edittext286fm1.getText().toString()) < 0)) {
						edittext286fm1.setText(String.valueOf((long)(1)));
					}
					edittext287fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext273fm1.getText().toString())) * (Double.parseDouble(edittext274fm1.getText().toString()) * (Double.parseDouble(edittext285fm1.getText().toString()) * Double.parseDouble(edittext286fm1.getText().toString())))));
					edittext287fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext287fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext287fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button166.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear732.setVisibility(View.GONE);
				edittext285fm1.setText("");
				edittext286fm1.setText("");
				edittext287fm1.setTextColor(0xFF000000);
				button164.setVisibility(View.VISIBLE);
			}
		});
		
		edittext288fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext288fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext291fm1.setText(String.valueOf(00.00));
				edittext293fm1.setText(String.valueOf(00.00));
				edittext291fm1.setTextColor(0xFFE91E63);
				edittext295fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1812.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1812)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("المسافات البينية بين صفوف الكانات بالعمود لكل م.ط\n( بيكون مساوى للمسافات البينية بين الكانات الأوتوماتيك بالعمود لكل م.ط )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة =\n٠.١٥ م / م.ط \"")
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
		
		edittext289fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext289fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext292fm1.setText(String.valueOf(00.00));
				edittext293fm1.setText(String.valueOf(00.00));
				edittext292fm1.setTextColor(0xFFE91E63);
				edittext293fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1815.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "قطر سيخ كانات الأعمدة ( مم )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٨ مم \"");
				return true;
			}
		});
		
		edittext290fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext290fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext293fm1.setText(String.valueOf(00.00));
				edittext293fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button167.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) || (edittext3.getText().toString().equals("") || edittext290fm1.getText().toString().equals(""))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
					if (edittext288fm1.getText().toString().equals("") || ((Double.parseDouble(edittext288fm1.getText().toString()) > 0.20d) || (Double.parseDouble(edittext288fm1.getText().toString()) < 0.08d))) {
						edittext288fm1.setText(String.valueOf(0.15d));
					}
					if (edittext289fm1.getText().toString().equals("") || ((Double.parseDouble(edittext289fm1.getText().toString()) > 16) || (Double.parseDouble(edittext289fm1.getText().toString()) < 8))) {
						edittext289fm1.setText(String.valueOf(8));
					}
					edittext291fm1.setText(String.valueOf(Math.ceil(Double.parseDouble(edittext3.getText().toString()) / Double.parseDouble(edittext288fm1.getText().toString())) + 1));
					edittext292fm1.setText(String.valueOf((Double.parseDouble(edittext289fm1.getText().toString()) * Double.parseDouble(edittext289fm1.getText().toString())) / 162));
					edittext293fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext290fm1.getText().toString())) * (Double.parseDouble(edittext291fm1.getText().toString()) * Double.parseDouble(edittext292fm1.getText().toString()))));
					edittext291fm1.setTextColor(0xFF000000);
					edittext292fm1.setTextColor(0xFF000000);
					edittext293fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext291fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext291fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext296fm1.setText(String.valueOf(00.00));
				edittext299fm1.setText(String.valueOf(00.00));
				edittext302fm1.setText(String.valueOf(00.00));
				edittext305fm1.setText(String.valueOf(00.00));
				edittext296fm1.setTextColor(0xFFE91E63);
				edittext299fm1.setTextColor(0xFFE91E63);
				edittext302fm1.setTextColor(0xFFE91E63);
				edittext305fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext292fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext292fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext296fm1.setText(String.valueOf(00.00));
				edittext299fm1.setText(String.valueOf(00.00));
				edittext302fm1.setText(String.valueOf(00.00));
				edittext305fm1.setText(String.valueOf(00.00));
				edittext296fm1.setTextColor(0xFFE91E63);
				edittext299fm1.setTextColor(0xFFE91E63);
				edittext302fm1.setTextColor(0xFFE91E63);
				edittext305fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext293fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext293fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button168.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear763.setVisibility(View.VISIBLE);
					edittext294fm1.setText("");
					edittext295fm1.setText("");
					edittext296fm1.setTextColor(0xFF000000);
					button168.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext294fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext294fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext296fm1.setText(String.valueOf(00.00));
				edittext296fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext295fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext295fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext296fm1.setText(String.valueOf(00.00));
				edittext296fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1840.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1840)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button169.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext294fm1.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext3.getText().toString().equals("") || (edittext289fm1.getText().toString().equals("") || edittext288fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext295fm1.getText().toString().equals("") || (Double.parseDouble(edittext295fm1.getText().toString()) < 0)) {
						edittext295fm1.setText(String.valueOf((long)(1)));
					}
					edittext296fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext291fm1.getText().toString())) * (Double.parseDouble(edittext292fm1.getText().toString()) * (Double.parseDouble(edittext294fm1.getText().toString()) * Double.parseDouble(edittext295fm1.getText().toString())))));
					edittext296fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext296fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext296fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button170.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear763.setVisibility(View.GONE);
				edittext294fm1.setText("");
				edittext295fm1.setText("");
				edittext296fm1.setTextColor(0xFF000000);
				button168.setVisibility(View.VISIBLE);
			}
		});
		
		button171.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear764.setVisibility(View.VISIBLE);
					edittext297fm1.setText("");
					edittext298fm1.setText("");
					edittext299fm1.setTextColor(0xFF000000);
					button171.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext297fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext297fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext299fm1.setText(String.valueOf(00.00));
				edittext299fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext298fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext298fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext299fm1.setText(String.valueOf(00.00));
				edittext299fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1853.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1853)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button172.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext297fm1.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext3.getText().toString().equals("") || (edittext289fm1.getText().toString().equals("") || edittext288fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext298fm1.getText().toString().equals("") || (Double.parseDouble(edittext298fm1.getText().toString()) < 0)) {
						edittext298fm1.setText(String.valueOf((long)(1)));
					}
					edittext299fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext291fm1.getText().toString())) * (Double.parseDouble(edittext292fm1.getText().toString()) * (Double.parseDouble(edittext297fm1.getText().toString()) * Double.parseDouble(edittext298fm1.getText().toString())))));
					edittext299fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext299fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext299fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button173.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear764.setVisibility(View.GONE);
				edittext297fm1.setText("");
				edittext298fm1.setText("");
				edittext299fm1.setTextColor(0xFF000000);
				button171.setVisibility(View.VISIBLE);
			}
		});
		
		button174.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear765.setVisibility(View.VISIBLE);
					edittext300fm1.setText("");
					edittext301fm1.setText("");
					edittext302fm1.setTextColor(0xFF000000);
					button174.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext300fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext300fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext302fm1.setText(String.valueOf(00.00));
				edittext302fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext301fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext301fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext302fm1.setText(String.valueOf(00.00));
				edittext302fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1866.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1866)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button175.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext300fm1.getText().toString().equals("") || edittext4.getText().toString().equals("")) || (edittext3.getText().toString().equals("") || (edittext289fm1.getText().toString().equals("") || edittext288fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext301fm1.getText().toString().equals("") || (Double.parseDouble(edittext301fm1.getText().toString()) < 0)) {
						edittext301fm1.setText(String.valueOf((long)(1)));
					}
					edittext302fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext291fm1.getText().toString())) * (Double.parseDouble(edittext292fm1.getText().toString()) * (Double.parseDouble(edittext300fm1.getText().toString()) * Double.parseDouble(edittext301fm1.getText().toString())))));
					edittext302fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext302fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext302fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button176.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear765.setVisibility(View.GONE);
				edittext300fm1.setText("");
				edittext301fm1.setText("");
				edittext302fm1.setTextColor(0xFF000000);
				button174.setVisibility(View.VISIBLE);
			}
		});
		
		button177.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear766.setVisibility(View.VISIBLE);
					edittext303fm1.setText("");
					edittext304fm1.setText("");
					edittext305fm1.setTextColor(0xFF000000);
					button177.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext303fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext303fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext305fm1.setText(String.valueOf(00.00));
				edittext305fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext304fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext304fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext305fm1.setText(String.valueOf(00.00));
				edittext305fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1879.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1879)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button178.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext303fm1.getText().toString().equals("") || (edittext4.getText().toString().equals("") || edittext222fm1.getText().toString().equals(""))) || (edittext3.getText().toString().equals("") || (edittext289fm1.getText().toString().equals("") || edittext288fm1.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext304fm1.getText().toString().equals("") || (Double.parseDouble(edittext304fm1.getText().toString()) < 0)) {
						edittext304fm1.setText(String.valueOf((long)(1)));
					}
					edittext305fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext291fm1.getText().toString())) * (Double.parseDouble(edittext292fm1.getText().toString()) * (Double.parseDouble(edittext303fm1.getText().toString()) * Double.parseDouble(edittext304fm1.getText().toString())))));
					edittext305fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext305fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext305fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button179.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear766.setVisibility(View.GONE);
				edittext303fm1.setText("");
				edittext304fm1.setText("");
				edittext305fm1.setTextColor(0xFF000000);
				button177.setVisibility(View.VISIBLE);
			}
		});
		
		edittext349fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext349fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext353fm1.setText(String.valueOf(00.00));
				edittext353fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext350fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext350fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 3)});
				edittext352fm1.setText(String.valueOf(00.00));
				edittext353fm1.setText(String.valueOf(00.00));
				edittext352fm1.setTextColor(0xFFE91E63);
				edittext353fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext351fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext351fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				textview1654.setText("---------------------");
				edittext353fm1.setText(String.valueOf(00.00));
				edittext353fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button147.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext349fm1.getText().toString().equals("")) || (edittext350fm1.getText().toString().equals("") || edittext351fm1.getText().toString().equals(""))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
					if (edittext222fm1.getText().toString().equals("") || ((Double.parseDouble(edittext222fm1.getText().toString()) > 0.10d) || (Double.parseDouble(edittext222fm1.getText().toString()) < 0.01d))) {
						edittext222fm1.setText(String.valueOf(0.025d));
					}
					if (edittext223fm1.getText().toString().equals("") || ((Double.parseDouble(edittext223fm1.getText().toString()) > 1.5d) || (Double.parseDouble(edittext223fm1.getText().toString()) < 0.10d))) {
						edittext223fm1.setText(String.valueOf(0.20d));
					}
					edittext352fm1.setText(String.valueOf((Double.parseDouble(edittext350fm1.getText().toString()) * Double.parseDouble(edittext350fm1.getText().toString())) / 162));
					if (Double.parseDouble(edittext351fm1.getText().toString()) < (Double.parseDouble(edittext3.getText().toString()) + (Double.parseDouble(edittext223fm1.getText().toString()) - Double.parseDouble(edittext222fm1.getText().toString())))) {
						textview1654.setText("طول السيخ أقل من ( ارتفاع الدور الصافى + سمك السقف - الغطاء الخرساني ) وهذا غير منطقي في الأعمدة\nولكن بإمكانك استكمال حسابات الحصر والتكلفة الفعلية");
					}
					edittext353fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext352fm1.getText().toString())) * (Double.parseDouble(edittext349fm1.getText().toString()) * Double.parseDouble(edittext351fm1.getText().toString()))));
					edittext352fm1.setTextColor(0xFF000000);
					edittext353fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext352fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext352fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext353fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext353fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext354fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext354fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext358fm1.setText(String.valueOf(00.00));
				edittext358fm1.setTextColor(0xFFE91E63);
				edittext361fm1.setText(String.valueOf(00.00));
				edittext361fm1.setTextColor(0xFFE91E63);
				edittext364fm1.setText(String.valueOf(00.00));
				edittext364fm1.setTextColor(0xFFE91E63);
				edittext367fm1.setText(String.valueOf(00.00));
				edittext367fm1.setTextColor(0xFFE91E63);
				edittext370fm1.setText(String.valueOf(00.00));
				edittext370fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext355fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext355fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext357fm1.setText(String.valueOf(00.00));
				edittext357fm1.setTextColor(0xFFE91E63);
				edittext358fm1.setText(String.valueOf(00.00));
				edittext358fm1.setTextColor(0xFFE91E63);
				edittext361fm1.setText(String.valueOf(00.00));
				edittext361fm1.setTextColor(0xFFE91E63);
				edittext364fm1.setText(String.valueOf(00.00));
				edittext364fm1.setTextColor(0xFFE91E63);
				edittext367fm1.setText(String.valueOf(00.00));
				edittext367fm1.setTextColor(0xFFE91E63);
				edittext370fm1.setText(String.valueOf(00.00));
				edittext370fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1897.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "قطر سيخ كانات الأعمدة ( مم )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ٨ مم \"");
				return true;
			}
		});
		
		edittext356fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext356fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext358fm1.setText(String.valueOf(00.00));
				edittext358fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button180.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || edittext354fm1.getText().toString().equals("")) || edittext356fm1.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
					if (edittext355fm1.getText().toString().equals("") || (Double.parseDouble(edittext355fm1.getText().toString()) < 8)) {
						edittext355fm1.setText(String.valueOf((long)(8)));
					}
					edittext357fm1.setText(String.valueOf((Double.parseDouble(edittext355fm1.getText().toString()) * Double.parseDouble(edittext355fm1.getText().toString())) / 162));
					edittext358fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext354fm1.getText().toString())) * (Double.parseDouble(edittext356fm1.getText().toString()) * Double.parseDouble(edittext357fm1.getText().toString()))));
					edittext357fm1.setTextColor(0xFF000000);
					edittext358fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext358fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext358fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button181.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear797.setVisibility(View.VISIBLE);
					edittext359fm1.setText("");
					edittext360fm1.setText("");
					edittext361fm1.setTextColor(0xFF000000);
					button181.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext359fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext359fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 5)});
				edittext361fm1.setText(String.valueOf(00.00));
				edittext361fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext360fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext360fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext361fm1.setText(String.valueOf(00.00));
				edittext361fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1922.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1922)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button182.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || (edittext4.getText().toString().equals("") || edittext359fm1.getText().toString().equals(""))) || edittext354fm1.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext360fm1.getText().toString().equals("") || (Double.parseDouble(edittext360fm1.getText().toString()) < 0)) {
						edittext360fm1.setText(String.valueOf((long)(1)));
					}
					edittext361fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext359fm1.getText().toString())) * (Double.parseDouble(edittext360fm1.getText().toString()) * (Double.parseDouble(edittext354fm1.getText().toString()) * Double.parseDouble(edittext357fm1.getText().toString())))));
					edittext361fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext361fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext361fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button183.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear797.setVisibility(View.GONE);
				edittext359fm1.setText("");
				edittext360fm1.setText("");
				edittext361fm1.setTextColor(0xFF000000);
				button181.setVisibility(View.VISIBLE);
			}
		});
		
		button184.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear798.setVisibility(View.VISIBLE);
					edittext362fm1.setText("");
					edittext363fm1.setText("");
					edittext364fm1.setTextColor(0xFF000000);
					button184.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext362fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext362fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext364fm1.setText(String.valueOf(00.00));
				edittext364fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext363fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext363fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext364fm1.setText(String.valueOf(00.00));
				edittext364fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1935.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1935)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button185.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || (edittext4.getText().toString().equals("") || edittext362fm1.getText().toString().equals(""))) || edittext354fm1.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext363fm1.getText().toString().equals("") || (Double.parseDouble(edittext363fm1.getText().toString()) < 0)) {
						edittext363fm1.setText(String.valueOf((long)(1)));
					}
					edittext364fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext362fm1.getText().toString())) * (Double.parseDouble(edittext363fm1.getText().toString()) * (Double.parseDouble(edittext354fm1.getText().toString()) * Double.parseDouble(edittext357fm1.getText().toString())))));
					edittext364fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext364fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext364fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button186.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear798.setVisibility(View.GONE);
				edittext362fm1.setText("");
				edittext363fm1.setText("");
				edittext364fm1.setTextColor(0xFF000000);
				button184.setVisibility(View.VISIBLE);
			}
		});
		
		button187.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear799.setVisibility(View.VISIBLE);
					edittext365fm1.setText("");
					edittext366fm1.setText("");
					edittext367fm1.setTextColor(0xFF000000);
					button187.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext365fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext365fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext367fm1.setText(String.valueOf(00.00));
				edittext367fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext366fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext366fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext367fm1.setText(String.valueOf(00.00));
				edittext367fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1948.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1948)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button188.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || (edittext4.getText().toString().equals("") || edittext365fm1.getText().toString().equals(""))) || edittext354fm1.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext366fm1.getText().toString().equals("") || (Double.parseDouble(edittext366fm1.getText().toString()) < 0)) {
						edittext366fm1.setText(String.valueOf((long)(1)));
					}
					edittext367fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext365fm1.getText().toString())) * (Double.parseDouble(edittext366fm1.getText().toString()) * (Double.parseDouble(edittext354fm1.getText().toString()) * Double.parseDouble(edittext357fm1.getText().toString())))));
					edittext367fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext367fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext367fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button189.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear799.setVisibility(View.GONE);
				edittext365fm1.setText("");
				edittext366fm1.setText("");
				edittext367fm1.setTextColor(0xFF000000);
				button187.setVisibility(View.VISIBLE);
			}
		});
		
		button190.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				internet.startRequestNetwork(RequestNetworkController.GET, "www.google.com", "a", _internet_request_listener);
				if (SketchwareUtil.isConnected(getApplicationContext())) {
					linear800.setVisibility(View.VISIBLE);
					edittext368fm1.setText("");
					edittext369fm1.setText("");
					edittext370fm1.setTextColor(0xFF000000);
					button190.setVisibility(View.GONE);
				}
				else {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك راجع الأتصال بالأنترنت");
				}
			}
		});
		
		edittext368fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext368fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext370fm1.setText(String.valueOf(00.00));
				edittext370fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		edittext369fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext369fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 4)});
				edittext370fm1.setText(String.valueOf(00.00));
				edittext370fm1.setTextColor(0xFFE91E63);
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		textview1961.setOnLongClickListener(new View.OnLongClickListener() {
			@Override
			public boolean onLongClick(View _view) {
				ViewTooltip
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1961)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("* عدد الكانات بالصف الواحد \nوبيختلف علي حسب شكل الكانة ف من الممكن أن تكون هناك كانة علي شكل سداسى مع الكانة الداير لربط الأسياخ الداخلية بالعمود ولضبط توزيع حديد التسليح بشكل صحيح داخل قطاع العمود \nوممكن تكون كانتين كل واحدة علي شكل مثلث مع الكانة الداير\nوبيتم وضع عدد الكانات دي الموجوده بنفس الصف مع الكانة الداير سواء مثلا ١ علي شكل سداسى أو ٢ علي شكل مثلث أو الخ في هذه الخانة \n\nوفي بعض الأعمدة ذات القطاع الكبير يمكن أستخدام عدد أكبر من الكانات ف نفس الصف لضمان التوزيع السليم لحديد العمود ولمقاومة قوى ال Shear\n\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١ كانة بالصف \"")
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
		
		button191.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if ((edittext3.getText().toString().equals("") || (edittext4.getText().toString().equals("") || edittext368fm1.getText().toString().equals(""))) || edittext354fm1.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext369fm1.getText().toString().equals("") || (Double.parseDouble(edittext369fm1.getText().toString()) < 0)) {
						edittext369fm1.setText(String.valueOf((long)(1)));
					}
					edittext370fm1.setText(String.valueOf((Double.parseDouble(edittext4.getText().toString()) * Double.parseDouble(edittext368fm1.getText().toString())) * (Double.parseDouble(edittext369fm1.getText().toString()) * (Double.parseDouble(edittext354fm1.getText().toString()) * Double.parseDouble(edittext357fm1.getText().toString())))));
					edittext370fm1.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext370fm1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext370fm1.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 6)});
				edittext122.setText(String.valueOf((Double.parseDouble(edittext231fm1.getText().toString()) + (((Double.parseDouble(edittext238fm1.getText().toString()) + Double.parseDouble(edittext241fm1.getText().toString())) + (Double.parseDouble(edittext244fm1.getText().toString()) + Double.parseDouble(edittext247fm1.getText().toString()))) + ((Double.parseDouble(edittext250fm1.getText().toString()) + Double.parseDouble(edittext257fm1.getText().toString())) + (Double.parseDouble(edittext260fm1.getText().toString()) + Double.parseDouble(edittext263fm1.getText().toString()))))) + ((((Double.parseDouble(edittext266fm1.getText().toString()) + Double.parseDouble(edittext269fm1.getText().toString())) + (Double.parseDouble(edittext275fm1.getText().toString()) + Double.parseDouble(edittext278fm1.getText().toString()))) + (((Double.parseDouble(edittext281fm1.getText().toString()) + Double.parseDouble(edittext284fm1.getText().toString())) + (Double.parseDouble(edittext287fm1.getText().toString()) + Double.parseDouble(edittext293fm1.getText().toString()))) + ((Double.parseDouble(edittext296fm1.getText().toString()) + Double.parseDouble(edittext299fm1.getText().toString())) + (Double.parseDouble(edittext302fm1.getText().toString()) + Double.parseDouble(edittext305fm1.getText().toString()))))) + ((Double.parseDouble(edittext353fm1.getText().toString()) + Double.parseDouble(edittext358fm1.getText().toString())) + ((Double.parseDouble(edittext361fm1.getText().toString()) + (Double.parseDouble(edittext364fm1.getText().toString()) + Double.parseDouble(edittext367fm1.getText().toString()))) + Double.parseDouble(edittext370fm1.getText().toString()))))));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button192.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linear800.setVisibility(View.GONE);
				edittext368fm1.setText("");
				edittext369fm1.setText("");
				edittext370fm1.setTextColor(0xFF000000);
				button190.setVisibility(View.VISIBLE);
			}
		});
		
		edittext122.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext122.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
				edittext123.setText(String.valueOf(Double.parseDouble(edittext122.getText().toString()) / 1000));
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		button58.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		edittext51.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext51.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 10)});
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
		
		button193.setOnClickListener(new View.OnClickListener() {
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview530)
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
				if ((edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) || edittext3.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
					if (edittext52.getText().toString().equals("") || (Double.parseDouble(edittext52.getText().toString()) > 100)) {
						edittext52.setText(String.valueOf((long)(5)));
						edittext53.setText(String.valueOf(Double.parseDouble(edittext51.getText().toString()) + ((Double.parseDouble(edittext52.getText().toString()) / 100) * Double.parseDouble(edittext51.getText().toString()))));
					}
					else {
						edittext53.setText(String.valueOf(Double.parseDouble(edittext51.getText().toString()) + ((Double.parseDouble(edittext52.getText().toString()) / 100) * Double.parseDouble(edittext51.getText().toString()))));
					}
					edittext53.setTextColor(0xFF000000);
				}
			}
		});
		
		edittext53.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				edittext53.setFilters(new InputFilter[]{new InputFilter.LengthFilter((int) 7)});
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview998)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة الهالك بحديد تسليح الأعمدة\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١٠ % \"")
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
				if ((edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) || edittext3.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
					if (edittext124.getText().toString().equals("") || (Double.parseDouble(edittext124.getText().toString()) > 100)) {
						edittext124.setText(String.valueOf((long)(10)));
						edittext126.setText(String.valueOf(Double.parseDouble(edittext123.getText().toString()) + ((Double.parseDouble(edittext124.getText().toString()) / 100) * Double.parseDouble(edittext123.getText().toString()))));
					}
					else {
						edittext126.setText(String.valueOf(Double.parseDouble(edittext123.getText().toString()) + ((Double.parseDouble(edittext124.getText().toString()) / 100) * Double.parseDouble(edittext123.getText().toString()))));
					}
					edittext126.setTextColor(0xFF000000);
				}
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview965)
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
				if (((edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) || edittext3.getText().toString().equals("")) || ((edittext54.getText().toString().equals("") || edittext55.getText().toString().equals("")) || edittext130.getText().toString().equals(""))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
					if (edittext116.getText().toString().equals("") || (Double.parseDouble(edittext116.getText().toString()) < 0)) {
						edittext116.setText(String.valueOf(00.00d));
					}
					edittext56.setText(String.valueOf(Double.parseDouble(edittext54.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
					edittext57.setText(String.valueOf(Double.parseDouble(edittext54.getText().toString()) * Double.parseDouble(edittext53.getText().toString())));
					edittext127.setText(String.valueOf(Double.parseDouble(edittext130.getText().toString()) * Double.parseDouble(edittext123.getText().toString())));
					edittext131.setText(String.valueOf(Double.parseDouble(edittext130.getText().toString()) * Double.parseDouble(edittext126.getText().toString())));
					edittext58.setText(String.valueOf(Double.parseDouble(edittext55.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
					edittext117.setText(String.valueOf(Double.parseDouble(edittext116.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview724)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("إجمالي تكلفة النجارة والحدادة ( جنيه )\nبيتم حسابها علي أساس الكمية التصميمية لا الفعلية لان معظم الخرسانة الموردة بتكون أكبر من التصميمية المحسوبة وبنسب مختلفة غير ثابتة\nوهي = أجمالى كمية الخرسانة للأعمدة التي يتم ادخال أبعاده وبياناتها في أول الصفحة ( الكمية التصميمية ) * سعر مصنعية النجارة والحدادة ( جنيه )")
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
		
		button194.setOnClickListener(new View.OnClickListener() {
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview335)
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview340)
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview344)
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview350)
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview1012)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("نسبة الهالك بحديد تسليح الأعمدة\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ١٠ % \"")
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
				if ((edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) || edittext3.getText().toString().equals("")) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
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
					edittext65.setText(String.valueOf(Double.parseDouble(edittext61.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
					edittext66.setText(String.valueOf(Double.parseDouble(edittext62.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
					edittext67.setText(String.valueOf(Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
					edittext68.setText(String.valueOf((Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(edittext51.getText().toString())) / 1000));
					edittext69.setText(String.valueOf((Double.parseDouble(edittext63.getText().toString()) * Double.parseDouble(edittext51.getText().toString())) / 50));
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview529)
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview537)
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview348)
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview971)
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
				if (((edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) || edittext3.getText().toString().equals("")) || ((edittext74.getText().toString().equals("") || edittext75.getText().toString().equals("")) || (edittext76.getText().toString().equals("") || (edittext78.getText().toString().equals("") || edittext134.getText().toString().equals(""))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
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
					edittext133.setText(String.valueOf(Double.parseDouble(edittext123.getText().toString()) + ((Double.parseDouble(edittext132.getText().toString()) / 100) * Double.parseDouble(edittext123.getText().toString()))));
					edittext83.setText(String.valueOf(Double.parseDouble(edittext77.getText().toString()) * Double.parseDouble(edittext73.getText().toString())));
					edittext135.setText(String.valueOf(Double.parseDouble(edittext134.getText().toString()) * Double.parseDouble(edittext123.getText().toString())));
					edittext136.setText(String.valueOf(Double.parseDouble(edittext134.getText().toString()) * Double.parseDouble(edittext133.getText().toString())));
					edittext84.setText(String.valueOf(Double.parseDouble(edittext78.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
					edittext119.setText(String.valueOf(Double.parseDouble(edittext118.getText().toString()) * Double.parseDouble(edittext51.getText().toString())));
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview316)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("إجمالي تكلفة النجارة والحدادة ( جنيه )\nبيتم حسابها علي أساس الكمية التصميمية لا الفعلية لان معظم الخرسانة الموردة بتكون أكبر من التصميمية المحسوبة وبنسب مختلفة غير ثابتة\nوهي = أجمالى كمية الخرسانة للأعمدة التي يتم ادخال أبعادها وبياناتها في أول الصفحة ( الكمية التصميمية ) * سعر مصنعية النجارة والحدادة ( جنيه )")
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
		
		button195.setOnClickListener(new View.OnClickListener() {
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
				if (((edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) || edittext3.getText().toString().equals("")) || (edittext87.getText().toString().equals("") || edittext137.getText().toString().equals(""))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
					if (Double.parseDouble(edittext87.getText().toString()) < Double.parseDouble(edittext51.getText().toString())) {
						textview949.setText("الكمية الفعلية\nأقل من\nالكمية الهندسية\nوبالتالي الهالك\nبالسالب وهذا\nغير منطقي\nوغير هندسي\nولكن سيتم استكمال\nالحسابات علي\nهذه الكمية الفعلية\nبغض النظر عن الهالك");
						edittext112.setText(String.valueOf(Double.parseDouble(edittext87.getText().toString()) - Double.parseDouble(edittext51.getText().toString())));
						textview842.setText("الكمية الفعلية\nأقل من\nالكمية الهندسية\nوبالتالي نسبة الهالك\nبالسالب وهذا غير\nمنطقي وغير هندسي\nولكن سيتم استكمال\nالحسابات علي\nهذه الكمية الفعلية\nبغض النظر عن الهالك");
						edittext88.setText(String.valueOf(((Double.parseDouble(edittext87.getText().toString()) - Double.parseDouble(edittext51.getText().toString())) / Double.parseDouble(edittext51.getText().toString())) * 100));
					}
					else {
						textview949.setText("");
						edittext112.setText(String.valueOf(Double.parseDouble(edittext87.getText().toString()) - Double.parseDouble(edittext51.getText().toString())));
						textview842.setText("");
						edittext88.setText(String.valueOf(((Double.parseDouble(edittext87.getText().toString()) - Double.parseDouble(edittext51.getText().toString())) / Double.parseDouble(edittext51.getText().toString())) * 100));
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview844)
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview977)
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
				if (((edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) || edittext3.getText().toString().equals("")) || ((edittext87.getText().toString().equals("") || edittext137.getText().toString().equals("")) || ((edittext89.getText().toString().equals("") || edittext90.getText().toString().equals("")) || edittext140.getText().toString().equals("")))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
					if (edittext120.getText().toString().equals("") || (Double.parseDouble(edittext120.getText().toString()) < 0)) {
						edittext120.setText(String.valueOf((long)(00.00d)));
					}
					edittext91.setText(String.valueOf(Double.parseDouble(edittext87.getText().toString()) * Double.parseDouble(edittext89.getText().toString())));
					edittext141.setText(String.valueOf(Double.parseDouble(edittext137.getText().toString()) * Double.parseDouble(edittext140.getText().toString())));
					edittext92.setText(String.valueOf(Double.parseDouble(edittext51.getText().toString()) * Double.parseDouble(edittext90.getText().toString())));
					edittext121.setText(String.valueOf(Double.parseDouble(edittext51.getText().toString()) * Double.parseDouble(edittext120.getText().toString())));
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview832)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("إجمالي تكلفة النجارة والحدادة ( جنيه )\nبيتم حسابها علي أساس الكمية التصميمية لا الفعلية لان معظم الخرسانة الموردة بتكون أكبر من التصميمية المحسوبة وبنسب مختلفة غير ثابتة\nوهي = أجمالى كمية الخرسانة للأعمدة التي يتم ادخال أبعادها وبياناتها في أول الصفحة ( الكمية التصميمية ) * سعر مصنعية النجارة والحدادة ( جنيه )")
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
		
		button196.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.biltafsil.com/18209/%d8%b3%d8%b9%d8%b1-%d9%85%d8%aa%d8%b1-%d8%a7%d9%84%d8%b1%d9%85%d9%84-%d9%88%d8%a7%d9%84%d8%b2%d9%84%d8%b7/"));
				startActivity(price);
			}
		});
		
		button197.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.biltafsil.com/18209/%d8%b3%d8%b9%d8%b1-%d9%85%d8%aa%d8%b1-%d8%a7%d9%84%d8%b1%d9%85%d9%84-%d9%88%d8%a7%d9%84%d8%b2%d9%84%d8%b7/"));
				startActivity(price);
			}
		});
		
		button198.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				price.setAction(Intent.ACTION_VIEW);
				price.setData(Uri.parse("https://www.altkia.com/cement-prices-today/"));
				startActivity(price);
			}
		});
		
		button199.setOnClickListener(new View.OnClickListener() {
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview859)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("كمية الأسمنت الموردة لزوم الخلطة الخرسانية للأعمدة ( شكارة )\n( وذلك بفرض إن وزن شكارة الأسمنت = ٥٠ كجم )")
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview861)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("كمية المياه الموردة لزوم الخلطة الخرسانية للأعمدة ( م٣ )\nوتمثل نصف كمية الأسمنت بالطن تقريبآ \nولا يمكن إن تزيد قيمته عن ( ٠.٧٥ * كمية الأسمنت بالطن )\nولا يمكن أن تقل عن ( ٠.٢٥ * كمية الأسمنت بالطن )\n\" مدخل إختياري في حالة عدم إدخاله سيقوم البرنامج بإفتراضه بقيمة = ( كمية الأسمنت بالطن ÷ ٢ )")
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview962)
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview904)
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview956)
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
				if (((edittext1.getText().toString().equals("") || edittext2.getText().toString().equals("")) || edittext3.getText().toString().equals("")) || (((edittext94.getText().toString().equals("") || edittext95.getText().toString().equals("")) || (edittext96.getText().toString().equals("") || edittext98.getText().toString().equals(""))) || ((edittext99.getText().toString().equals("") || edittext100.getText().toString().equals("")) || (edittext102.getText().toString().equals("") || (edittext142.getText().toString().equals("") || edittext143.getText().toString().equals("")))))) {
					SketchwareUtil.showMessage(getApplicationContext(), "من فضلك أملئ الخانات الفارغة");
				}
				else {
					if (edittext4.getText().toString().equals("") || (Double.parseDouble(edittext4.getText().toString()) < 0)) {
						edittext4.setText(String.valueOf((long)(1)));
					}
					if (edittext97.getText().toString().equals("") || ((Double.parseDouble(edittext97.getText().toString()) > (0.75d * ((Double.parseDouble(edittext96.getText().toString()) * 50) / 1000))) || (Double.parseDouble(edittext97.getText().toString()) < (0.25d * ((Double.parseDouble(edittext96.getText().toString()) * 50) / 1000))))) {
						edittext97.setText(String.valueOf(0.5d * ((Double.parseDouble(edittext96.getText().toString()) * 50) / 1000)));
					}
					if (edittext101.getText().toString().equals("") || (Double.parseDouble(edittext101.getText().toString()) < 0)) {
						edittext101.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					if (edittext115.getText().toString().equals("") || (Double.parseDouble(edittext115.getText().toString()) < 0)) {
						edittext115.setText(String.valueOf(Double.parseDouble("1")));
					}
					if (edittext113.getText().toString().equals("") || (Double.parseDouble(edittext113.getText().toString()) < 0)) {
						edittext113.setText(String.valueOf(Double.parseDouble("00.00")));
					}
					edittext103.setText(String.valueOf(Double.parseDouble(edittext94.getText().toString()) * Double.parseDouble(edittext98.getText().toString())));
					edittext104.setText(String.valueOf(Double.parseDouble(edittext94.getText().toString()) / Double.parseDouble(edittext51.getText().toString())));
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
					edittext106.setText(String.valueOf(Double.parseDouble(edittext95.getText().toString()) / Double.parseDouble(edittext51.getText().toString())));
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
					edittext108.setText(String.valueOf((Double.parseDouble(edittext96.getText().toString()) * 50) / Double.parseDouble(edittext51.getText().toString())));
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
					edittext110.setText(String.valueOf(Double.parseDouble(edittext51.getText().toString()) * Double.parseDouble(edittext102.getText().toString())));
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
				        .on(ToipccreinforcedconcretecolumnssActivity.this, textview929)
				        .autoHide(true, 5000)
				        .position(ViewTooltip.Position.TOP)
				        .text("إجمالي تكلفة النجارة والحدادة ( جنيه )\nبيتم حسابها علي أساس الكمية التصميمية لا الفعلية لان معظم الخرسانة الموردة بتكون أكبر من التصميمية المحسوبة وبنسب مختلفة غير ثابتة\nوهي = أجمالى كمية الخرسانة للأعمدة التي يتم ادخال أبعادها وبياناتها في أول الصفحة ( الكمية التصميمية ) * سعر مصنعية النجارة والحدادة ( جنيه )")
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
		/*
بداية linears الحديد عمود ١
*/
		linear821.setVisibility(View.VISIBLE);
		textview1410.setVisibility(View.VISIBLE);
		linear434.setVisibility(View.GONE);
		textview195.setVisibility(View.GONE);
		/*
بداية linears الحديد عمود ١ هندسي
*/
		linear512.setVisibility(View.GONE);
		linear538.setVisibility(View.GONE);
		linear718.setVisibility(View.GONE);
		linear511.setVisibility(View.GONE);
		linear181.setVisibility(View.GONE);
		linear588.setVisibility(View.GONE);
		linear594.setVisibility(View.GONE);
		linear600.setVisibility(View.GONE);
		linear608.setVisibility(View.GONE);
		linear618.setVisibility(View.GONE);
		linear619.setVisibility(View.GONE);
		linear620.setVisibility(View.GONE);
		linear621.setVisibility(View.GONE);
		linear719.setVisibility(View.GONE);
		linear729.setVisibility(View.GONE);
		linear730.setVisibility(View.GONE);
		linear731.setVisibility(View.GONE);
		linear732.setVisibility(View.GONE);
		linear753.setVisibility(View.GONE);
		linear763.setVisibility(View.GONE);
		linear764.setVisibility(View.GONE);
		linear765.setVisibility(View.GONE);
		linear766.setVisibility(View.GONE);
		/*
نهاية linears الحديد عمود ١ هندسي
*/
		/*
بداية linears الحديد عمود ١ فعلي
*/
		linear689.setVisibility(View.GONE);
		linear787.setVisibility(View.GONE);
		linear797.setVisibility(View.GONE);
		linear798.setVisibility(View.GONE);
		linear799.setVisibility(View.GONE);
		linear800.setVisibility(View.GONE);
		/*
نهاية linears الحديد عمود ١ فعلي
*/
		/*
نهاية linears الحديد عمود ١
*/
		linear237.setVisibility(View.GONE);
		linear256.setVisibility(View.GONE);
		linear337.setVisibility(View.GONE);
		linear178.setVisibility(View.GONE);
		linear140.setVisibility(View.GONE);
		linear290.setVisibility(View.GONE);
		linear301.setVisibility(View.GONE);
		_CardStyle(textview808, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button58, 25, 25, "#FF4DD0E1", false);
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
عمود ١
*/
		_round(linear3, "#FFE0F2F1", "#FF000000", 50);
		_round(linear6, "#FFF3E5F5", "#FF000000", 50);
		_round(linear4, "#FFF3E5F5", "#FF000000", 50);
		_round(linear13, "#FFF3E5F5", "#FF000000", 50);
		/*
التكلفة
*/
		_round(linear75, "#FFC5CAE9", "#FF000000", 50);
		_round(linear351, "#FFC5CAE9", "#FF000000", 50);
		_round(linear178, "#FFE0F2F1", "#FF000000", 50);
		_round(linear140, "#FFE0F2F1", "#FF000000", 50);
		_round(linear290, "#FFE0F2F1", "#FF000000", 50);
		_round(linear301, "#FFE0F2F1", "#FF000000", 50);
		/*
بداية linears الحديد للعمود ١
*/
		_CardStyle(button49, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button50, 25, 25, "#FF4DD0E1", false);
		_round(linear434, "#FFF3E5F5", "#FF000000", 0);
		_round(linear512, "#FFF3E5F5", "#FF000000", 50);
		_CardStyle(button150, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button151, 25, 25, "#FF4DD0E1", false);
		_CardStyle(button106, 25, 25, "#FFAED581", false);
		_CardStyle(button107, 25, 25, "#FFAED581", false);
		_CardStyle(button152, 25, 25, "#FFAED581", false);
		_CardStyle(button153, 25, 25, "#FFAED581", false);
		_round(linear511, "#FFF3E5F5", "#FF000000", 50);
		_round(linear608, "#FFF3E5F5", "#FF000000", 50);
		_round(linear719, "#FFF3E5F5", "#FF000000", 50);
		_round(linear753, "#FFF3E5F5", "#FF000000", 50);
		_round(linear689, "#FFF3E5F5", "#FF000000", 50);
		_round(linear787, "#FFF3E5F5", "#FF000000", 50);
		_round(linear655, "#FFF3E5F5", "#FF000000", 50);
		/*
نهاية linears الحديد العمود ١
*/
		
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
		PrintHelper printHelper = new PrintHelper(ToipccreinforcedconcretecolumnssActivity.this); //change the activity name
		// Set the desired scale mode. 
		printHelper.setScaleMode(PrintHelper.SCALE_MODE_FIT);
		 // Get the bitmap for the ImageView's drawable. 
		// Bitmap bitmap = ((BitmapDrawable) mImageView.getDrawable()).getBitmap(); 
		 // Print the bitmap. 
		 printHelper.printBitmap("Print Bitmap", bm);
	}
	
}
