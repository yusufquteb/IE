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
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.github.angads25.filepicker.*;
import com.google.android.material.tabs.TabLayout;
import com.leinardi.android.speeddial.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import net.cachapa.expandablelayout.*;
import org.json.*;


public class HomeActivity extends AppCompatActivity {
	
	private double tab_count = 0;
	private double random = 0;
	private HashMap<String, Object> map = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	
	private TabLayout tablayout1;
	private CoordinatorLayout linear1;
	private LinearLayout linear2;
	private ViewPager viewpager1;
	
	private FragFragmentAdapter frag;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		tablayout1 = HomeActivity.this.findViewById(R.id.tablayout1);
		linear1 = HomeActivity.this.findViewById(R.id.linear1);
		linear2 = HomeActivity.this.findViewById(R.id.linear2);
		viewpager1 = HomeActivity.this.findViewById(R.id.viewpager1);
		frag = new FragFragmentAdapter(HomeActivity.this, getSupportFragmentManager());
	}
	
	private void initializeLogic() {
		tablayout1.setupWithViewPager(viewpager1);
		frag.setTabCount(1);
		viewpager1.setAdapter(frag);
		viewpager1.setCurrentItem((int)0);
		((PagerAdapter)viewpager1.getAdapter()).notifyDataSetChanged();
		getWindow().getDecorView()
		.setSystemUiVisibility(
		View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
		);
	}
	
	public class FragFragmentAdapter extends FragmentStatePagerAdapter {
		// This class is deprecated, you should migrate to ViewPager2:
		// https://developer.android.com/reference/androidx/viewpager2/widget/ViewPager2
		Context context;
		int tabCount;
		
		public FragFragmentAdapter(Context context, FragmentManager manager) {
			super(manager);
			this.context = context;
		}
		
		public void setTabCount(int tabCount) {
			this.tabCount = tabCount;
		}
		
		@Override
		public int getCount() {
			return tabCount;
		}
		
		@Override
		public CharSequence getPageTitle(int _position) {
			if (_position == 0) return "الحصر الهندسي";
			return "";
		}
		
		
		@Override
		public Fragment getItem(int _position) {
			if (String.valueOf(_position).equals(String.valueOf(0))) {
				return new HomeListFragmentActivity();
			}
			return null; 
		}
		
	}
	
}