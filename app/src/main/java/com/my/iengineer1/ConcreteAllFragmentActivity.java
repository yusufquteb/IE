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
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.*;
import androidx.fragment.app.Fragment;
import com.github.angads25.filepicker.*;
import com.leinardi.android.speeddial.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import net.cachapa.expandablelayout.*;
import org.json.*;


public class ConcreteAllFragmentActivity extends Fragment {
	
	private double temp1 = 0;
	private double temp = 0;
	private boolean dwn = false;
	private double ld_mnn = 0;
	private double mn_st_sum = 0;
	private double store = 0;
	private double total = 0;
	private double mn_st_no = 0;
	private double col_no_ = 0;
	private String tot = "";
	private  Bundle b1;
	private String name = "";
	private String path = "";
	private String imagename = "";
	private double temp11 = 0;
	private double tempo12 = 0;
	private double temp12 = 0;
	private double temp13 = 0;
	private String ss = "";
	private String store1 = "";
	private double temp131 = 0;
	private double temp121 = 0;
	private HashMap<String, Object> map2 = new HashMap<>();
	private HashMap<String, Object> map = new HashMap<>();
	private double num = 0;
	private HashMap<String, Object> map1 = new HashMap<>();
	private double n = 0;
	private double c = 0;
	private String fileName = "";
	private double j = 0;
	private HashMap<String, Object> map3 = new HashMap<>();
	private double f = 0;
	private String filePath = "";
	private HashMap<String, Object> spinn_map = new HashMap<>();
	private String len_result = "";
	private String wed_result = "";
	private String hi_result = "";
	private String radius_result = "";
	private String area_result = "";
	private String no_result = "";
	private double spin = 0;
	private double spin1 = 0;
	private double spin2 = 0;
	private double temp2 = 0;
	private double temp3 = 0;
	private double temp4 = 0;
	private double temp5 = 0;
	private double temp22 = 0;
	private double temp33 = 0;
	private double temp44 = 0;
	private double temp55 = 0;
	
	private ArrayList<String> diameter = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> col_store = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> col_store1 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> col_store2 = new ArrayList<>();
	private ArrayList<String> resultSet = new ArrayList<>();
	private ArrayList<String> resultSet1 = new ArrayList<>();
	private ArrayList<String> Label = new ArrayList<>();
	private ArrayList<String> No = new ArrayList<>();
	private ArrayList<String> Length = new ArrayList<>();
	private ArrayList<String> Width = new ArrayList<>();
	private ArrayList<String> Height = new ArrayList<>();
	private ArrayList<String> spinner = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> spin_map = new ArrayList<>();
	private ArrayList<String> spinn2 = new ArrayList<>();
	
	private LinearLayout bg;
	private ScrollView vscroll1;
	private LinearLayout ll_main;
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.concrete_all_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		bg = _view.findViewById(R.id.bg);
		vscroll1 = _view.findViewById(R.id.vscroll1);
		ll_main = _view.findViewById(R.id.ll_main);
	}
	
	private void initializeLogic() {
	}
	
}