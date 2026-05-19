package com.my.iengineer1;
import android.Manifest;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import com.github.angads25.filepicker.*;
import com.github.angads25.filepicker.controller.DialogSelectionListener ;
import com.github.angads25.filepicker.model.DialogConfigs;
import com.github.angads25.filepicker.model.DialogProperties;
import com.github.angads25.filepicker.view.FilePickerDialog;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.leinardi.android.speeddial.*;
import java.io.*;
import java.io.File;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import net.cachapa.expandablelayout.*;
import org.json.*;


//import com.my.iengineer1.utils.ExportUtils;


public class TabLayoutActivity extends AppCompatActivity {
	
	public final int REQ_CD_FP = 101;
	
	private Timer _timer = new Timer();
	
	private String imagename = "";
	private String path = "";
	private double tab_count = 0;
	private HashMap<String, Object> map1 = new HashMap<>();
	private HashMap<String, Object> map2 = new HashMap<>();
	private HashMap<String, Object> map3 = new HashMap<>();
	private String fileName = "";
	private double j = 0;
	private String excel_file_name1 = "";
	private String filePath = "";
	private String project_name = "";
	private boolean isCheck = false;
	private String packageName = "";
	private double CREATE_FILE = 0;
	private double temp121 = 0;
	private double temp1 = 0;
	private double temp2 = 0;
	private double temp3 = 0;
	private double temp4 = 0;
	private double temp5 = 0;
	private double temp22 = 0;
	private double temp33 = 0;
	private double temp44 = 0;
	private double temp55 = 0;
	private double gopa = 0;
	private String uriFor1 = "";
	private String uriFor2 = "";
	private String resultUri = "";
	private String pathToUri = "";
	private double k = 0;
	private double i3434 = 0;
	private double plaster = 0;
	private double painting = 0;
	private double files_count = 0;
	private double header = 0;
	private double repeater = 0;
	private double strat_repeater = 0;
	private double i = 0;
	private String q = "";
	private String empty = "";
	private boolean vplaster = false;
	private boolean vpaint = false;
	private double sum = 0;
	
	private ArrayList<HashMap<String, Object>> col_store = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> col_store1 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> col_store2 = new ArrayList<>();
	private ArrayList<String> resultSet = new ArrayList<>();
	private ArrayList<String> resultSet1 = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> projects_name = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> sheet1list = new ArrayList<>();
	private ArrayList<String> files = new ArrayList<>();
	
	private TabLayout tablayout1;
	private CoordinatorLayout linear1;
	private LinearLayout linear2;
	private FloatingActionButton fab;
	private BottomAppBar bottomAppBar;
	private com.google.android.material.bottomappbar.BottomAppBar bap;
	private com.google.android.material.floatingactionbutton.FloatingActionButton _fab ;
	private ViewPager viewpager1;
	
	private Frag1FragmentAdapter frag1;
	private TimerTask t;
	private Calendar calendar = Calendar.getInstance();
	private Intent fp = new Intent(Intent.ACTION_GET_CONTENT);
	private SharedPreferences projects;
	private Intent intent = new Intent();
	private SharedPreferences path1;
	private AlertDialog.Builder dialog;
	private Intent permissionIntent = new Intent();
	private Intent Int = new Intent();
	private FilePickerDialog FilePicker;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.tab_layout);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(TabLayoutActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(TabLayoutActivity.this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		tablayout1 = TabLayoutActivity.this.findViewById(R.id.tablayout1);
		linear1 = TabLayoutActivity.this.findViewById(R.id.linear1);
		linear2 = TabLayoutActivity.this.findViewById(R.id.linear2);
		fab = TabLayoutActivity.this.findViewById(R.id.fab);
		bottomAppBar = TabLayoutActivity.this.findViewById(R.id.bottomAppBar);
		viewpager1 = TabLayoutActivity.this.findViewById(R.id.viewpager1);
		frag1 = new Frag1FragmentAdapter(TabLayoutActivity.this, getSupportFragmentManager());
		fp.setType("*/*");
		fp.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		projects = this.getSharedPreferences("projects", Activity.MODE_PRIVATE);
		path1 = this.getSharedPreferences("path1", Activity.MODE_PRIVATE);
		dialog = new AlertDialog.Builder(TabLayoutActivity.this);
		
		fab.setOnClickListener((_view) -> {
			if (String.valueOf(getIntent().getStringExtra("key")).equals(String.valueOf("all_dirty_work"))) {
				if (String.valueOf(viewpager1.getCurrentItem()).equals(String.valueOf(0))) {
					_dynamic_view();
				} else {
					if (String.valueOf(viewpager1.getCurrentItem()).equals(String.valueOf(1))) {
						
					} else {
						
					}
				}
			} else {
				if (String.valueOf(getIntent().getStringExtra("key")).equals(String.valueOf("finishes"))) {
					if (String.valueOf(viewpager1.getCurrentItem()).equals(String.valueOf(0))) {
						_dynamic_finishes();
					} else {
						if (String.valueOf(viewpager1.getCurrentItem()).equals(String.valueOf(1))) {
							
						} else {
							
						}
					}
				} else {
					
				}
			}
		});
		
		viewpager1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageScrolled(int _position, float _positionOffset, int _positionOffsetPixels) {
				
			}
			
			@Override
			public void onPageSelected(int _position) {
				if (String.valueOf(_position).equals(String.valueOf(0))) {
					fab.setImageResource(R.drawable.add2);
					fab.setVisibility(View.VISIBLE);
					bottomAppBar.setVisibility(View.VISIBLE);
				} else {
					fab.setVisibility(View.GONE);
					bottomAppBar.setVisibility(View.GONE);
				}
				switch(getIntent().getStringExtra("key")) {
					case "all_dirty_work": {
						switch((int)viewpager1.getCurrentItem()) {
							case ((int)0): {
								
								break;
							}
							case ((int)01): {
								View view = viewpager1.getChildAt((int)viewpager1.getCurrentItem());
								
								androidx.cardview.widget.CardView cardview1 = (androidx.cardview.widget.CardView)view.findViewById(R.id.cardview1);
								androidx.cardview.widget.CardView cardview2 = (androidx.cardview.widget.CardView)view.findViewById(R.id.cardview2);
								androidx.cardview.widget.CardView cardview4 = (androidx.cardview.widget.CardView)view.findViewById(R.id.cardview4);
								androidx.cardview.widget.CardView cardview3 = (androidx.cardview.widget.CardView)view.findViewById(R.id.cardview3);
								
								
								cardview1.setVisibility(View.VISIBLE);
								cardview2.setVisibility(View.VISIBLE);
								cardview3.setVisibility(View.GONE);
								cardview4.setVisibility(View.GONE);
								break;
							}
						}
						break;
					}
				}
				switch(getIntent().getStringExtra("key")) {
					case "finishes": {
						switch((int)viewpager1.getCurrentItem()) {
							case ((int)0): {
								
								break;
							}
							case ((int)01): {
								
								break;
							}
						}
						break;
					}
				}
			}
			
			@Override
			public void onPageScrollStateChanged(int _scrollState) {
				
			}
		});
	}
	
	private void initializeLogic() {
		switch(getIntent().getStringExtra("key")) {
			case "all_dirty_work": {
				tab_count = 2;
				break;
			}
			case "finishes": {
				tab_count = 3;
				break;
			}
		}
		tablayout1.setupWithViewPager(viewpager1);
		frag1.setTabCount((int) tab_count);
		viewpager1.setAdapter(frag1);
		viewpager1.setCurrentItem((int)0);
		((PagerAdapter)viewpager1.getAdapter()).notifyDataSetChanged();
		viewpager1.setOffscreenPageLimit((int) tab_count);
		_bottom_bar();
		fab.setImageDrawable(ContextCompat.getDrawable(TabLayoutActivity.this, R.drawable.add2));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_FP:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(TabLayoutActivity.this.getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(TabLayoutActivity.this.getApplicationContext(), _data.getData()));
					}
				}
				filePath = _filePath.get((int)(0));
				t = new TimerTask() {
					@Override
					public void run() {
						TabLayoutActivity.this.runOnUiThread(() -> {
							
						});
					}
				};
				_timer.schedule(t, (int)(500));
			}
			else {
				
			}
			break;
			default:
			break;
		}
	}
	
	public class Frag1FragmentAdapter extends FragmentStatePagerAdapter {
		// This class is deprecated, you should migrate to ViewPager2:
		// https://developer.android.com/reference/androidx/viewpager2/widget/ViewPager2
		Context context;
		int tabCount;
		
		public Frag1FragmentAdapter(Context context, FragmentManager manager) {
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
			if (String.valueOf(getIntent().getStringExtra("key")).equals(String.valueOf("all_dirty_work"))) {
				if (String.valueOf(_position).equals(String.valueOf(0))) {
					return "Ordinary Works";
				}
				if (String.valueOf(_position).equals(String.valueOf(1))) {
					return "Summary";
				}
			} else {
				
			}
			if (String.valueOf(getIntent().getStringExtra("key")).equals(String.valueOf("finishes"))) {
				if (String.valueOf(_position).equals(String.valueOf(0))) {
					return "Walls & Finishes";
				}
				if (String.valueOf(_position).equals(String.valueOf(1))) {
					return "Summary";
				}
				if (String.valueOf(_position).equals(String.valueOf(2))) {
					return "finishes_new";
				}
			} else {
				
			}
			return "";
		}
		
		
		@Override
		public Fragment getItem(int _position) {
			if (String.valueOf(getIntent().getStringExtra("key")).equals(String.valueOf("all_dirty_work"))) {
				if (String.valueOf(_position).equals(String.valueOf(0))) {
					return new ConcreteAllFragmentActivity();
				}
				if (String.valueOf(_position).equals(String.valueOf(1))) {
					return new SummaryFragmentActivity();
				}
			} else {
				
			}
			if (String.valueOf(getIntent().getStringExtra("key")).equals(String.valueOf("finishes"))) {
				if (String.valueOf(_position).equals(String.valueOf(0))) {
					return new ConcreteAllFragmentActivity();
				}
				if (String.valueOf(_position).equals(String.valueOf(1))) {
					return new SummaryFragmentActivity();
				}
				if (String.valueOf(_position).equals(String.valueOf(2))) {
					return new NewFinishesFragmentActivity();
				}
			} else {
				
			}
			return null; 
		}
		
	}
	
	
	@Override
	public void onBackPressed() {
		if (String.valueOf(getIntent().getStringExtra("key")).equals(String.valueOf("all_dirty_work"))) {
			if (String.valueOf(viewpager1.getCurrentItem()).equals(String.valueOf(0))) {
				MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(TabLayoutActivity.this);
				
				builder.setTitle("خيارات الخروج")
				.setMessage("ماذا تريد أن تفعل؟")
				.setPositiveButton("حذف آخر جزء", (dialog, which) -> {
					Fragment currentFragment = getSupportFragmentManager().getFragments().get(viewpager1.getCurrentItem());
					
					if (currentFragment instanceof ConcreteAllFragmentActivity) {
						ConcreteAllFragmentActivity concreteFragment = (ConcreteAllFragmentActivity) currentFragment;
						List<Fragment> childFragments = concreteFragment.getChildFragmentManager().getFragments();
						
						// حذف آخر FinishFragmentActivity
						for (int i = childFragments.size() - 1; i >= 0; i--) {
							Fragment childFragment = childFragments.get(i);
							if (childFragment instanceof FinishFragmentActivity) {
								concreteFragment.getChildFragmentManager()
								.beginTransaction()
								.remove(childFragment)
								.commit();
								break;
							}
						}
					}
					
				})
				.setNegativeButton("الغاء ", (dialog, which) -> {
					
				})
				.setNeutralButton("خروج من التطبيق", (dialog, which) -> {
					TabLayoutActivity.this.finish();
				})
				.show();
			} else {
				if (String.valueOf(viewpager1.getCurrentItem()).equals(String.valueOf(1))) {
					viewpager1.setCurrentItem((int)viewpager1.getCurrentItem() - 1);
				} else {
					viewpager1.setCurrentItem((int)viewpager1.getCurrentItem() - 1);
				}
			}
		} else {
			if (String.valueOf(getIntent().getStringExtra("key")).equals(String.valueOf("finishes"))) {
				if (String.valueOf(viewpager1.getCurrentItem()).equals(String.valueOf(0))) {
					MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(TabLayoutActivity.this);
					
					builder.setTitle("خيارات الخروج")
					.setMessage("ماذا تريد أن تفعل؟")
					.setPositiveButton("حذف آخر جزء", (dialog, which) -> {
						Fragment currentFragment = getSupportFragmentManager().getFragments().get(viewpager1.getCurrentItem());
						
						if (currentFragment instanceof ConcreteAllFragmentActivity) {
							ConcreteAllFragmentActivity concreteFragment = (ConcreteAllFragmentActivity) currentFragment;
							List<Fragment> childFragments = concreteFragment.getChildFragmentManager().getFragments();
							
							for (int i = childFragments.size() - 1; i >= 0; i--) {
								Fragment childFragment = childFragments.get(i);
								if (childFragment instanceof FinishFragmentActivity) {
									((FinishFragmentActivity) childFragment)._deleteLastChildFragment();
									break;
								}
							}
						}
					})
					.setNegativeButton("الغاء ", (dialog, which) -> {
						
					})
					.setNeutralButton("خروج من التطبيق", (dialog, which) -> {
						TabLayoutActivity.this.finish();
					})
					.show();
					
				} else {
					if (String.valueOf(viewpager1.getCurrentItem()).equals(String.valueOf(1))) {
						viewpager1.setCurrentItem((int)viewpager1.getCurrentItem() - 1);
					} else {
						viewpager1.setCurrentItem((int)viewpager1.getCurrentItem() - 1);
					}
				}
			} else {
				
			}
		}
	}
	public void _dynamic_view() {
		View view = viewpager1.getChildAt((int)viewpager1.getCurrentItem());
		
		LinearLayout ll_main = (LinearLayout)view.findViewById(R.id.ll_main);
		// YthFragmentActivity is the fragment name
		ConcreteCalcFragmentActivity fragment = new ConcreteCalcFragmentActivity();
		
		androidx.fragment.app.FragmentManager fragmentManager = getSupportFragmentManager();
		androidx.fragment.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		// linear2 is place holder
		fragmentTransaction.add(R.id.ll_main, fragment).addToBackStack(null).commit();
		//getSupportFragmentManager().beginTransaction().replace(R.id.linear2, fragment).commit();
	}
	
	
	public void _bottom_bar() {
		bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				
				
				int _menuItemId = item.getItemId();
				if (_menuItemId == R.id.btn_collection) {
					
				} else if (_menuItemId == R.id.btn_calendar) {
						switch(getIntent().getStringExtra("key")) {
							case "all_dirty_work": {
								switch((int)viewpager1.getCurrentItem()) {
									case ((int)0): {
										DialogProperties FilePickerp = new DialogProperties();
										FilePickerp.selection_mode = DialogConfigs.SINGLE_MODE;
										FilePickerp.selection_type = DialogConfigs.FILE_SELECT;
										FilePickerp.root = new java.io.File(FileUtil.getExternalStorageDir());
										FilePickerp.error_dir = new java.io.File(FileUtil.getExternalStorageDir());
										FilePickerp.offset = new java.io.File(FileUtil.getExternalStorageDir());
										FilePickerp.extensions = new String[] {".xls"};
										FilePicker = new FilePickerDialog(TabLayoutActivity.this,FilePickerp);
										FilePicker.setTitle("Select xls");
										FilePicker.setPositiveBtnName("Select");
										FilePicker.setNegativeBtnName("Cancel");
										FilePicker.setDialogSelectionListener(new DialogSelectionListener() {
											@Override public void onSelectedFilePaths(String[] files) {
												filePath = Arrays.asList(files).get((int) 0).toString();
												if (!String.valueOf(filePath).equals(String.valueOf(""))) {
													
												} else {
													
												}
											} 
										});
										FilePicker.show();
										break;
									}
									case ((int)01): {
										
										break;
									}
								}
								break;
							}
							case "finishes": {
								switch((int)viewpager1.getCurrentItem()) {
									case ((int)0): {
										DialogProperties FilePickerp = new DialogProperties();
										FilePickerp.selection_mode = DialogConfigs.SINGLE_MODE;
										FilePickerp.selection_type = DialogConfigs.FILE_SELECT;
										FilePickerp.root = new java.io.File(FileUtil.getExternalStorageDir());
										FilePickerp.error_dir = new java.io.File(FileUtil.getExternalStorageDir());
										FilePickerp.offset = new java.io.File(FileUtil.getExternalStorageDir());
										FilePickerp.extensions = new String[] {".xls"};
										FilePicker = new FilePickerDialog(TabLayoutActivity.this,FilePickerp);
										FilePicker.setTitle("Select xls");
										FilePicker.setPositiveBtnName("Select");
										FilePicker.setNegativeBtnName("Cancel");
										FilePicker.setDialogSelectionListener(new DialogSelectionListener() {
											@Override public void onSelectedFilePaths(String[] files) {
												filePath = Arrays.asList(files).get((int) 0).toString();
												if (!String.valueOf(filePath).equals(String.valueOf(""))) {
													
												} else {
													
												}
											} 
										});
										FilePicker.show();
										break;
									}
									case ((int)01): {
										SketchwareUtil.showMessage(TabLayoutActivity.this.getApplicationContext(), "soon");
										break;
									}
								}
								break;
							}
						}
				} else if (_menuItemId == R.id.btn_download) {
						switch(getIntent().getStringExtra("key")) {
							case "finishes": {
								switch((int)viewpager1.getCurrentItem()) {
									case ((int)0): {
										/*
ExportUtils.showExportFormatDialog(
TabLayoutActivity.this, 
getSupportFragmentManager()
);
*/
										break;
									}
									case ((int)01): {
										
										break;
									}
								}
								break;
							}
						}
				}
				return false;
			}
		});
		
		
		
		
		
		
		
		
	}
	
	
	public void _dynamic_finishes() {
		View view = viewpager1.getChildAt((int)viewpager1.getCurrentItem());
		
		LinearLayout ll_main = (LinearLayout)view.findViewById(R.id.ll_main);
		
		FinishFragmentActivity fragment = new FinishFragmentActivity();
		
		androidx.fragment.app.FragmentManager fragmentManager = getSupportFragmentManager();
		androidx.fragment.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		
		fragmentTransaction.add(R.id.ll_main, fragment).addToBackStack(null).commit();
	}
	
	
	public void _recalculateSum() {
		View view = viewpager1.getChildAt((int)viewpager1.getCurrentItem());
		
		LinearLayout ll_main = (LinearLayout)view.findViewById(R.id.ll_main);
		sum = 0;
		for (int i = 0; i < ((LinearLayout) ll_main).getChildCount(); i++) {
			View v = ((LinearLayout)ll_main).getChildAt(i);
			TextView textView = v.findViewById(R.id.net_total);
			if (textView != null && !TextUtils.isEmpty(textView.getText())) {
				try{
					sum = sum + Double.parseDouble(textView.getText().toString());
				}catch(Exception e){
					
				}
			}
		}
		SummaryFragmentActivity.Amount10.setText(String.valueOf(sum));
	}
	
}
