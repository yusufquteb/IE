package com.my.iengineer1;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.SharedPreferences;
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
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import com.github.angads25.filepicker.*;
import com.leinardi.android.speeddial.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import net.cachapa.expandablelayout.*;
import org.json.*;


public class SummaryFragmentActivity extends Fragment {
	
	private String tot = "";
	private String name = "";
	private String c_conc_coll_all = "";
	private String c_conc_rcfoot_all = "";
	private String c_conc_slab_all = "";
	
	private ScrollView vscroll1;
	private LinearLayout ll_main;
	private CardView cardview1;
	private CardView cardview2;
	private CardView cardview3;
	private CardView cardview4;
	private LinearLayout linear15;
	private LinearLayout linear122;
	private LinearLayout linear9;
	private TextView textview1;
	private LinearLayout linear26;
	private LinearLayout linear33;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private LinearLayout linear36;
	private LinearLayout linear16;
	private LinearLayout linear21;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private LinearLayout linear32;
	private TextView textview14;
	private TextView textview8;
	private TextView textview9;
	private TextView textview4;
	private TextView textview13;
	private TextView textview10;
	private LinearLayout linear17;
	private LinearLayout linear22;
	private LinearLayout linear38;
	private LinearLayout linear39;
	private LinearLayout linear40;
	private LinearLayout linear41;
	private TextView textview15;
	private TextView textview19;
	private TextView textview22;
	private TextView textview23;
	private TextView textview24;
	private TextView textview25;
	private LinearLayout linear19;
	private LinearLayout linear24;
	private LinearLayout linear42;
	private LinearLayout linear43;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private TextView textview17;
	private EditText Unit_Price1;
	private EditText Unit_Price2;
	private EditText Unit_Price3;
	private EditText Unit_Price4;
	private EditText Unit_Price5;
	private LinearLayout linear18;
	private LinearLayout linear23;
	private LinearLayout linear3;
	private LinearLayout linear11;
	private LinearLayout linear7;
	private LinearLayout linear120;
	private TextView textview16;
	public static TextView Amount1;
	public static TextView Amount2;
	public static TextView Amount3;
	public static TextView Amount4;
	public static TextView Amount5;
	private LinearLayout linear20;
	private LinearLayout linear25;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private TextView textview18;
	private TextView Total_Price1;
	private TextView Total_Price2;
	private TextView Total_Price3;
	private TextView Total_Price4;
	private TextView Total_Price5;
	private LinearLayout linear123;
	private LinearLayout linear124;
	private LinearLayout linear50;
	private TextView textview2;
	private LinearLayout linear51;
	private LinearLayout linear52;
	private LinearLayout linear53;
	private LinearLayout linear54;
	private LinearLayout linear55;
	private LinearLayout linear56;
	private LinearLayout linear58;
	private LinearLayout linear59;
	private LinearLayout linear60;
	private LinearLayout linear61;
	private TextView textview32;
	private TextView textview34;
	private TextView textview35;
	private TextView textview36;
	private TextView textview37;
	private LinearLayout linear62;
	private LinearLayout linear64;
	private LinearLayout linear65;
	private LinearLayout linear66;
	private LinearLayout linear67;
	private TextView textview38;
	private TextView textview40;
	private TextView textview41;
	private TextView textview42;
	private TextView textview43;
	private LinearLayout linear68;
	private LinearLayout linear70;
	private LinearLayout linear71;
	private LinearLayout linear72;
	private LinearLayout linear73;
	private TextView textview44;
	private EditText Unit_Price6;
	private EditText Unit_Price7;
	private EditText Unit_Price8;
	private EditText Unit_Price9;
	private LinearLayout linear74;
	private LinearLayout linear76;
	private LinearLayout linear77;
	private LinearLayout linear78;
	private LinearLayout linear79;
	private TextView textview45;
	public static TextView Amount6;
	public static TextView Amount7;
	public static TextView Amount8;
	public static TextView Amount9;
	private LinearLayout linear80;
	private LinearLayout linear82;
	private LinearLayout linear83;
	private LinearLayout linear84;
	private LinearLayout linear85;
	private TextView textview46;
	private TextView Total_Price6;
	private TextView Total_Price7;
	private TextView Total_Price8;
	private TextView Total_Price9;
	private LinearLayout linear125;
	private LinearLayout linear126;
	private LinearLayout linear86;
	private TextView textview3;
	private LinearLayout linear87;
	private LinearLayout linear88;
	private LinearLayout linear89;
	private LinearLayout linear90;
	private LinearLayout linear91;
	private LinearLayout linear92;
	private LinearLayout linear93;
	private LinearLayout linear94;
	private LinearLayout linear95;
	private TextView textview52;
	private TextView textview53;
	private TextView textview54;
	private TextView textview55;
	private LinearLayout linear98;
	private LinearLayout linear99;
	private LinearLayout linear100;
	private LinearLayout linear101;
	private TextView textview58;
	private TextView textview59;
	private TextView textview60;
	private TextView textview61;
	private LinearLayout linear104;
	private LinearLayout linear105;
	private LinearLayout linear106;
	private LinearLayout linear107;
	private TextView textview64;
	private EditText Unit_Price10;
	private EditText Unit_Price11;
	private EditText Unit_Price12;
	private LinearLayout linear110;
	private LinearLayout linear111;
	private LinearLayout linear112;
	private LinearLayout linear113;
	private TextView textview65;
	public static TextView Amount10;
	public static TextView Amount11;
	public static TextView Amount12;
	private LinearLayout linear116;
	private LinearLayout linear117;
	private LinearLayout linear118;
	private LinearLayout linear119;
	private TextView textview66;
	private TextView Total_Price10;
	private TextView Total_Price11;
	private TextView Total_Price12;
	private LinearLayout linear127;
	private LinearLayout linear128;
	private LinearLayout linear129;
	private TextView textview67;
	private LinearLayout linear130;
	private LinearLayout linear131;
	private LinearLayout linear132;
	private LinearLayout linear133;
	private LinearLayout linear134;
	private LinearLayout linear135;
	private LinearLayout linear136;
	private LinearLayout linear137;
	private LinearLayout linear138;
	private LinearLayout linear139;
	private LinearLayout linear140;
	private TextView textview68;
	private TextView textview69;
	private TextView textview70;
	private TextView textview71;
	private TextView textview72;
	private TextView textview73;
	private LinearLayout linear141;
	private LinearLayout linear142;
	private LinearLayout linear143;
	private LinearLayout linear144;
	private LinearLayout linear145;
	private LinearLayout linear146;
	private TextView textview74;
	private TextView textview75;
	private TextView textview76;
	private TextView textview77;
	private TextView textview78;
	private TextView textview79;
	private LinearLayout linear147;
	private LinearLayout linear148;
	private LinearLayout linear149;
	private LinearLayout linear150;
	private LinearLayout linear151;
	private LinearLayout linear152;
	private TextView textview80;
	private EditText edittext1;
	private EditText edittext2;
	private EditText edittext3;
	private EditText edittext4;
	private EditText edittext5;
	private LinearLayout linear153;
	private LinearLayout linear154;
	private LinearLayout linear155;
	private LinearLayout linear156;
	private LinearLayout linear157;
	private LinearLayout linear158;
	private TextView textview81;
	public static TextView Amount945;
	private TextView textview83;
	private TextView textview84;
	private TextView textview85;
	private TextView textview86;
	private LinearLayout linear159;
	private LinearLayout linear160;
	private LinearLayout linear161;
	private LinearLayout linear162;
	private LinearLayout linear163;
	private LinearLayout linear164;
	private TextView textview87;
	private TextView textview88;
	private TextView textview89;
	private TextView textview90;
	private TextView textview91;
	private TextView textview92;
	
	private SharedPreferences pass_data;
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.summary_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		vscroll1 = _view.findViewById(R.id.vscroll1);
		ll_main = _view.findViewById(R.id.ll_main);
		cardview1 = _view.findViewById(R.id.cardview1);
		cardview2 = _view.findViewById(R.id.cardview2);
		cardview3 = _view.findViewById(R.id.cardview3);
		cardview4 = _view.findViewById(R.id.cardview4);
		linear15 = _view.findViewById(R.id.linear15);
		linear122 = _view.findViewById(R.id.linear122);
		linear9 = _view.findViewById(R.id.linear9);
		textview1 = _view.findViewById(R.id.textview1);
		linear26 = _view.findViewById(R.id.linear26);
		linear33 = _view.findViewById(R.id.linear33);
		linear34 = _view.findViewById(R.id.linear34);
		linear35 = _view.findViewById(R.id.linear35);
		linear36 = _view.findViewById(R.id.linear36);
		linear16 = _view.findViewById(R.id.linear16);
		linear21 = _view.findViewById(R.id.linear21);
		linear27 = _view.findViewById(R.id.linear27);
		linear28 = _view.findViewById(R.id.linear28);
		linear29 = _view.findViewById(R.id.linear29);
		linear32 = _view.findViewById(R.id.linear32);
		textview14 = _view.findViewById(R.id.textview14);
		textview8 = _view.findViewById(R.id.textview8);
		textview9 = _view.findViewById(R.id.textview9);
		textview4 = _view.findViewById(R.id.textview4);
		textview13 = _view.findViewById(R.id.textview13);
		textview10 = _view.findViewById(R.id.textview10);
		linear17 = _view.findViewById(R.id.linear17);
		linear22 = _view.findViewById(R.id.linear22);
		linear38 = _view.findViewById(R.id.linear38);
		linear39 = _view.findViewById(R.id.linear39);
		linear40 = _view.findViewById(R.id.linear40);
		linear41 = _view.findViewById(R.id.linear41);
		textview15 = _view.findViewById(R.id.textview15);
		textview19 = _view.findViewById(R.id.textview19);
		textview22 = _view.findViewById(R.id.textview22);
		textview23 = _view.findViewById(R.id.textview23);
		textview24 = _view.findViewById(R.id.textview24);
		textview25 = _view.findViewById(R.id.textview25);
		linear19 = _view.findViewById(R.id.linear19);
		linear24 = _view.findViewById(R.id.linear24);
		linear42 = _view.findViewById(R.id.linear42);
		linear43 = _view.findViewById(R.id.linear43);
		linear44 = _view.findViewById(R.id.linear44);
		linear45 = _view.findViewById(R.id.linear45);
		textview17 = _view.findViewById(R.id.textview17);
		Unit_Price1 = _view.findViewById(R.id.Unit_Price1);
		Unit_Price2 = _view.findViewById(R.id.Unit_Price2);
		Unit_Price3 = _view.findViewById(R.id.Unit_Price3);
		Unit_Price4 = _view.findViewById(R.id.Unit_Price4);
		Unit_Price5 = _view.findViewById(R.id.Unit_Price5);
		linear18 = _view.findViewById(R.id.linear18);
		linear23 = _view.findViewById(R.id.linear23);
		linear3 = _view.findViewById(R.id.linear3);
		linear11 = _view.findViewById(R.id.linear11);
		linear7 = _view.findViewById(R.id.linear7);
		linear120 = _view.findViewById(R.id.linear120);
		textview16 = _view.findViewById(R.id.textview16);
		Amount1 = _view.findViewById(R.id.Amount1);
		Amount2 = _view.findViewById(R.id.Amount2);
		Amount3 = _view.findViewById(R.id.Amount3);
		Amount4 = _view.findViewById(R.id.Amount4);
		Amount5 = _view.findViewById(R.id.Amount5);
		linear20 = _view.findViewById(R.id.linear20);
		linear25 = _view.findViewById(R.id.linear25);
		linear46 = _view.findViewById(R.id.linear46);
		linear47 = _view.findViewById(R.id.linear47);
		linear48 = _view.findViewById(R.id.linear48);
		linear49 = _view.findViewById(R.id.linear49);
		textview18 = _view.findViewById(R.id.textview18);
		Total_Price1 = _view.findViewById(R.id.Total_Price1);
		Total_Price2 = _view.findViewById(R.id.Total_Price2);
		Total_Price3 = _view.findViewById(R.id.Total_Price3);
		Total_Price4 = _view.findViewById(R.id.Total_Price4);
		Total_Price5 = _view.findViewById(R.id.Total_Price5);
		linear123 = _view.findViewById(R.id.linear123);
		linear124 = _view.findViewById(R.id.linear124);
		linear50 = _view.findViewById(R.id.linear50);
		textview2 = _view.findViewById(R.id.textview2);
		linear51 = _view.findViewById(R.id.linear51);
		linear52 = _view.findViewById(R.id.linear52);
		linear53 = _view.findViewById(R.id.linear53);
		linear54 = _view.findViewById(R.id.linear54);
		linear55 = _view.findViewById(R.id.linear55);
		linear56 = _view.findViewById(R.id.linear56);
		linear58 = _view.findViewById(R.id.linear58);
		linear59 = _view.findViewById(R.id.linear59);
		linear60 = _view.findViewById(R.id.linear60);
		linear61 = _view.findViewById(R.id.linear61);
		textview32 = _view.findViewById(R.id.textview32);
		textview34 = _view.findViewById(R.id.textview34);
		textview35 = _view.findViewById(R.id.textview35);
		textview36 = _view.findViewById(R.id.textview36);
		textview37 = _view.findViewById(R.id.textview37);
		linear62 = _view.findViewById(R.id.linear62);
		linear64 = _view.findViewById(R.id.linear64);
		linear65 = _view.findViewById(R.id.linear65);
		linear66 = _view.findViewById(R.id.linear66);
		linear67 = _view.findViewById(R.id.linear67);
		textview38 = _view.findViewById(R.id.textview38);
		textview40 = _view.findViewById(R.id.textview40);
		textview41 = _view.findViewById(R.id.textview41);
		textview42 = _view.findViewById(R.id.textview42);
		textview43 = _view.findViewById(R.id.textview43);
		linear68 = _view.findViewById(R.id.linear68);
		linear70 = _view.findViewById(R.id.linear70);
		linear71 = _view.findViewById(R.id.linear71);
		linear72 = _view.findViewById(R.id.linear72);
		linear73 = _view.findViewById(R.id.linear73);
		textview44 = _view.findViewById(R.id.textview44);
		Unit_Price6 = _view.findViewById(R.id.Unit_Price6);
		Unit_Price7 = _view.findViewById(R.id.Unit_Price7);
		Unit_Price8 = _view.findViewById(R.id.Unit_Price8);
		Unit_Price9 = _view.findViewById(R.id.Unit_Price9);
		linear74 = _view.findViewById(R.id.linear74);
		linear76 = _view.findViewById(R.id.linear76);
		linear77 = _view.findViewById(R.id.linear77);
		linear78 = _view.findViewById(R.id.linear78);
		linear79 = _view.findViewById(R.id.linear79);
		textview45 = _view.findViewById(R.id.textview45);
		Amount6 = _view.findViewById(R.id.Amount6);
		Amount7 = _view.findViewById(R.id.Amount7);
		Amount8 = _view.findViewById(R.id.Amount8);
		Amount9 = _view.findViewById(R.id.Amount9);
		linear80 = _view.findViewById(R.id.linear80);
		linear82 = _view.findViewById(R.id.linear82);
		linear83 = _view.findViewById(R.id.linear83);
		linear84 = _view.findViewById(R.id.linear84);
		linear85 = _view.findViewById(R.id.linear85);
		textview46 = _view.findViewById(R.id.textview46);
		Total_Price6 = _view.findViewById(R.id.Total_Price6);
		Total_Price7 = _view.findViewById(R.id.Total_Price7);
		Total_Price8 = _view.findViewById(R.id.Total_Price8);
		Total_Price9 = _view.findViewById(R.id.Total_Price9);
		linear125 = _view.findViewById(R.id.linear125);
		linear126 = _view.findViewById(R.id.linear126);
		linear86 = _view.findViewById(R.id.linear86);
		textview3 = _view.findViewById(R.id.textview3);
		linear87 = _view.findViewById(R.id.linear87);
		linear88 = _view.findViewById(R.id.linear88);
		linear89 = _view.findViewById(R.id.linear89);
		linear90 = _view.findViewById(R.id.linear90);
		linear91 = _view.findViewById(R.id.linear91);
		linear92 = _view.findViewById(R.id.linear92);
		linear93 = _view.findViewById(R.id.linear93);
		linear94 = _view.findViewById(R.id.linear94);
		linear95 = _view.findViewById(R.id.linear95);
		textview52 = _view.findViewById(R.id.textview52);
		textview53 = _view.findViewById(R.id.textview53);
		textview54 = _view.findViewById(R.id.textview54);
		textview55 = _view.findViewById(R.id.textview55);
		linear98 = _view.findViewById(R.id.linear98);
		linear99 = _view.findViewById(R.id.linear99);
		linear100 = _view.findViewById(R.id.linear100);
		linear101 = _view.findViewById(R.id.linear101);
		textview58 = _view.findViewById(R.id.textview58);
		textview59 = _view.findViewById(R.id.textview59);
		textview60 = _view.findViewById(R.id.textview60);
		textview61 = _view.findViewById(R.id.textview61);
		linear104 = _view.findViewById(R.id.linear104);
		linear105 = _view.findViewById(R.id.linear105);
		linear106 = _view.findViewById(R.id.linear106);
		linear107 = _view.findViewById(R.id.linear107);
		textview64 = _view.findViewById(R.id.textview64);
		Unit_Price10 = _view.findViewById(R.id.Unit_Price10);
		Unit_Price11 = _view.findViewById(R.id.Unit_Price11);
		Unit_Price12 = _view.findViewById(R.id.Unit_Price12);
		linear110 = _view.findViewById(R.id.linear110);
		linear111 = _view.findViewById(R.id.linear111);
		linear112 = _view.findViewById(R.id.linear112);
		linear113 = _view.findViewById(R.id.linear113);
		textview65 = _view.findViewById(R.id.textview65);
		Amount10 = _view.findViewById(R.id.Amount10);
		Amount11 = _view.findViewById(R.id.Amount11);
		Amount12 = _view.findViewById(R.id.Amount12);
		linear116 = _view.findViewById(R.id.linear116);
		linear117 = _view.findViewById(R.id.linear117);
		linear118 = _view.findViewById(R.id.linear118);
		linear119 = _view.findViewById(R.id.linear119);
		textview66 = _view.findViewById(R.id.textview66);
		Total_Price10 = _view.findViewById(R.id.Total_Price10);
		Total_Price11 = _view.findViewById(R.id.Total_Price11);
		Total_Price12 = _view.findViewById(R.id.Total_Price12);
		linear127 = _view.findViewById(R.id.linear127);
		linear128 = _view.findViewById(R.id.linear128);
		linear129 = _view.findViewById(R.id.linear129);
		textview67 = _view.findViewById(R.id.textview67);
		linear130 = _view.findViewById(R.id.linear130);
		linear131 = _view.findViewById(R.id.linear131);
		linear132 = _view.findViewById(R.id.linear132);
		linear133 = _view.findViewById(R.id.linear133);
		linear134 = _view.findViewById(R.id.linear134);
		linear135 = _view.findViewById(R.id.linear135);
		linear136 = _view.findViewById(R.id.linear136);
		linear137 = _view.findViewById(R.id.linear137);
		linear138 = _view.findViewById(R.id.linear138);
		linear139 = _view.findViewById(R.id.linear139);
		linear140 = _view.findViewById(R.id.linear140);
		textview68 = _view.findViewById(R.id.textview68);
		textview69 = _view.findViewById(R.id.textview69);
		textview70 = _view.findViewById(R.id.textview70);
		textview71 = _view.findViewById(R.id.textview71);
		textview72 = _view.findViewById(R.id.textview72);
		textview73 = _view.findViewById(R.id.textview73);
		linear141 = _view.findViewById(R.id.linear141);
		linear142 = _view.findViewById(R.id.linear142);
		linear143 = _view.findViewById(R.id.linear143);
		linear144 = _view.findViewById(R.id.linear144);
		linear145 = _view.findViewById(R.id.linear145);
		linear146 = _view.findViewById(R.id.linear146);
		textview74 = _view.findViewById(R.id.textview74);
		textview75 = _view.findViewById(R.id.textview75);
		textview76 = _view.findViewById(R.id.textview76);
		textview77 = _view.findViewById(R.id.textview77);
		textview78 = _view.findViewById(R.id.textview78);
		textview79 = _view.findViewById(R.id.textview79);
		linear147 = _view.findViewById(R.id.linear147);
		linear148 = _view.findViewById(R.id.linear148);
		linear149 = _view.findViewById(R.id.linear149);
		linear150 = _view.findViewById(R.id.linear150);
		linear151 = _view.findViewById(R.id.linear151);
		linear152 = _view.findViewById(R.id.linear152);
		textview80 = _view.findViewById(R.id.textview80);
		edittext1 = _view.findViewById(R.id.edittext1);
		edittext2 = _view.findViewById(R.id.edittext2);
		edittext3 = _view.findViewById(R.id.edittext3);
		edittext4 = _view.findViewById(R.id.edittext4);
		edittext5 = _view.findViewById(R.id.edittext5);
		linear153 = _view.findViewById(R.id.linear153);
		linear154 = _view.findViewById(R.id.linear154);
		linear155 = _view.findViewById(R.id.linear155);
		linear156 = _view.findViewById(R.id.linear156);
		linear157 = _view.findViewById(R.id.linear157);
		linear158 = _view.findViewById(R.id.linear158);
		textview81 = _view.findViewById(R.id.textview81);
		Amount945 = _view.findViewById(R.id.Amount945);
		textview83 = _view.findViewById(R.id.textview83);
		textview84 = _view.findViewById(R.id.textview84);
		textview85 = _view.findViewById(R.id.textview85);
		textview86 = _view.findViewById(R.id.textview86);
		linear159 = _view.findViewById(R.id.linear159);
		linear160 = _view.findViewById(R.id.linear160);
		linear161 = _view.findViewById(R.id.linear161);
		linear162 = _view.findViewById(R.id.linear162);
		linear163 = _view.findViewById(R.id.linear163);
		linear164 = _view.findViewById(R.id.linear164);
		textview87 = _view.findViewById(R.id.textview87);
		textview88 = _view.findViewById(R.id.textview88);
		textview89 = _view.findViewById(R.id.textview89);
		textview90 = _view.findViewById(R.id.textview90);
		textview91 = _view.findViewById(R.id.textview91);
		textview92 = _view.findViewById(R.id.textview92);
		pass_data = getActivity().getSharedPreferences("pass_data", Activity.MODE_PRIVATE);
		
		Unit_Price1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try{
					if (Double.parseDouble(Amount1.getText().toString()) > 0) {
						Total_Price1.setText(_string_format(Double.parseDouble(Amount1.getText().toString()) * Double.parseDouble(_charSeq)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		Unit_Price2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try{
					if (Double.parseDouble(Amount2.getText().toString()) > 0) {
						Total_Price2.setText(_string_format(Double.parseDouble(Amount2.getText().toString()) * Double.parseDouble(_charSeq)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		Unit_Price3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try{
					if (Double.parseDouble(Amount3.getText().toString()) > 0) {
						Total_Price3.setText(_string_format(Double.parseDouble(Amount3.getText().toString()) * Double.parseDouble(_charSeq)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		Unit_Price4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try{
					if (Double.parseDouble(Amount4.getText().toString()) > 0) {
						Total_Price4.setText(_string_format(Double.parseDouble(Amount4.getText().toString()) * Double.parseDouble(_charSeq)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		Unit_Price5.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try{
					if (Double.parseDouble(Amount5.getText().toString()) > 0) {
						Total_Price5.setText(_string_format(Double.parseDouble(Amount5.getText().toString()) * Double.parseDouble(_charSeq)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		Unit_Price6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try{
					if (Double.parseDouble(Amount6.getText().toString()) > 0) {
						Total_Price6.setText(_string_format(Double.parseDouble(Amount6.getText().toString()) * Double.parseDouble(_charSeq)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		Unit_Price7.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try{
					if (Double.parseDouble(Amount7.getText().toString()) > 0) {
						Total_Price7.setText(_string_format(Double.parseDouble(Amount7.getText().toString()) * Double.parseDouble(_charSeq)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		Unit_Price8.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try{
					if (Double.parseDouble(Amount8.getText().toString()) > 0) {
						Total_Price8.setText(_string_format(Double.parseDouble(Amount8.getText().toString()) * Double.parseDouble(_charSeq)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		Unit_Price9.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try{
					if (Double.parseDouble(Amount9.getText().toString()) > 0) {
						Total_Price9.setText(_string_format(Double.parseDouble(Amount9.getText().toString()) * Double.parseDouble(_charSeq)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		Unit_Price10.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try{
					if (Double.parseDouble(Amount10.getText().toString()) > 0) {
						Total_Price10.setText(_string_format(Double.parseDouble(Amount10.getText().toString()) * Double.parseDouble(_charSeq)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		Unit_Price11.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try{
					if (Double.parseDouble(Amount11.getText().toString()) > 0) {
						Total_Price11.setText(_string_format(Double.parseDouble(Amount11.getText().toString()) * Double.parseDouble(_charSeq)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		Unit_Price12.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				try{
					if (Double.parseDouble(Amount12.getText().toString()) > 0) {
						Total_Price12.setText(_string_format(Double.parseDouble(Amount12.getText().toString()) * Double.parseDouble(_charSeq)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
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
		Amount6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String Amount6nn = _param1.toString();
				try{
					if (Double.parseDouble(Unit_Price6.getText().toString()) > 0) {
						Total_Price6.setText(_string_format(Double.parseDouble(Unit_Price6.getText().toString()) * Double.parseDouble(Amount6nn)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		Amount7.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String Amount7nn = _param1.toString();
				try{
					if (Double.parseDouble(Unit_Price7.getText().toString()) > 0) {
						Total_Price7.setText(_string_format(Double.parseDouble(Unit_Price7.getText().toString()) * Double.parseDouble(Amount7nn)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		Amount8.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String Amount8nn = _param1.toString();
				try{
					if (Double.parseDouble(Unit_Price8.getText().toString()) > 0) {
						Total_Price8.setText(_string_format(Double.parseDouble(Unit_Price8.getText().toString()) * Double.parseDouble(Amount8nn)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		Amount9.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String Amount9nn = _param1.toString();
				try{
					if (Double.parseDouble(Unit_Price9.getText().toString()) > 0) {
						Total_Price9.setText(_string_format(Double.parseDouble(Unit_Price9.getText().toString()) * Double.parseDouble(Amount9nn)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		Amount10.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String Amount10nn = _param1.toString();
				try{
					if (Double.parseDouble(Unit_Price10.getText().toString()) > 0) {
						Total_Price10.setText(_string_format(Double.parseDouble(Unit_Price10.getText().toString()) * Double.parseDouble(Amount10nn)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		Amount11.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String Amount11nn = _param1.toString();
				try{
					if (Double.parseDouble(Unit_Price11.getText().toString()) > 0) {
						Total_Price11.setText(_string_format(Double.parseDouble(Unit_Price11.getText().toString()) * Double.parseDouble(Amount11nn)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		Amount12.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String Amount12nn = _param1.toString();
				try{
					if (Double.parseDouble(Unit_Price12.getText().toString()) > 0) {
						Total_Price12.setText(_string_format(Double.parseDouble(Unit_Price12.getText().toString()) * Double.parseDouble(Amount12nn)));
					} else {
						
					}
				}catch(Exception e){
					SketchwareUtil.showMessage(getContext().getApplicationContext(), e.getMessage());
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
	
	public String _string_format(final double _number) {
		return (String.format(Locale.ENGLISH,"%.02f", _number));
	}
	
}