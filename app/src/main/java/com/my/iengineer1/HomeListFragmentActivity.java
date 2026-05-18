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
import android.os.*;
import android.os.Bundle;
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
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.*;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.github.angads25.filepicker.*;
import com.leinardi.android.speeddial.*;
import com.my.iengineer1.camera.CameraMeasureActivity;
import com.my.iengineer1.modules.roads.RoadsActivity;
import com.my.iengineer1.modules.sanitation.SanitationActivity;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import net.cachapa.expandablelayout.*;
import org.json.*;


public class HomeListFragmentActivity extends Fragment {
	
	private HashMap<String, Object> map = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	
	private LinearLayout linear1;
	private RecyclerView recyclerview1;
	
	private Intent i = new Intent();
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.home_list_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		linear1 = _view.findViewById(R.id.linear1);
		recyclerview1 = _view.findViewById(R.id.recyclerview1);
	}
	
	private void initializeLogic() {
		map = new HashMap<>();
		map.put("text", "الإنشاءات - خرسانة وحديد");
		map.put("subtitle", "حساب الكميات الإنشائية");
		map.put("icon", R.drawable.icon_weight);
		listmap.add(map);
		map = new HashMap<>();
		map.put("text", "التشطيبات والبناء");
		map.put("subtitle", "حصر أعمال البياض والبلاط");
		map.put("icon", R.drawable.default_image);
		listmap.add(map);
		map = new HashMap<>();
		map.put("text", "الطرق والأسفلت");
		map.put("subtitle", "حصر طبقات الطريق والحفريات");
		map.put("icon", R.drawable.ic_menu_home);
		listmap.add(map);
		map = new HashMap<>();
		map.put("text", "الصرف الصحي");
		map.put("subtitle", "حصر خطوط الصرف وغرف التفتيش");
		map.put("icon", R.drawable.ic_menu_home);
		listmap.add(map);
		map = new HashMap<>();
		map.put("text", "القياس بالكاميرا");
		map.put("subtitle", "قياس وعد العناصر بالكاميرا");
		map.put("icon", R.drawable.ic_add_action_white_24dp);
		listmap.add(map);
		recyclerview1.setAdapter(new Recyclerview1Adapter(listmap));
		recyclerview1.setLayoutManager(new LinearLayoutManager(getActivity()));
	}
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = LayoutInflater.from(parent.getContext());
			View _v = _inflater.inflate(R.layout.home_list_cust, parent, false);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final com.google.android.material.card.MaterialCardView cardview2 = _view.findViewById(R.id.cardview2);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final LinearLayout linear2 = _view.findViewById(R.id.linear2);
			final LinearLayout linear3 = _view.findViewById(R.id.linear3);
			final LinearLayout linear_action = _view.findViewById(R.id.linear_action);
			final com.google.android.material.imageview.ShapeableImageView ImageView2 = _view.findViewById(R.id.ImageView2);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			final TextView textview_subtitle = _view.findViewById(R.id.textview_subtitle);
			final com.google.android.material.button.MaterialButton button_action = _view.findViewById(R.id.button_action);
			
			textview1.setText(_data.get((int)_position).get("text").toString());
			if (_data.get((int)_position).containsKey("subtitle")) {
				textview_subtitle.setText(_data.get((int)_position).get("subtitle").toString());
				textview_subtitle.setVisibility(View.VISIBLE);
			}
			if (_data.get((int)_position).containsKey("icon")) {
				ImageView2.setImageResource((int) _data.get((int)_position).get("icon"));
			}
			cardview2.setOnClickListener(View _view -> {
				Intent nav = new Intent();
				switch((int)_position) {
					case 0:
						nav.setClass(getContext().getApplicationContext(), TabLayoutActivity.class);
						nav.putExtra("key", "all_dirty_work");
						getActivity().startActivity(nav);
						break;
					case 1:
						nav.setClass(getContext().getApplicationContext(), TabLayoutActivity.class);
						nav.putExtra("key", "finishes");
						getActivity().startActivity(nav);
						break;
					case 2:
						nav.setClass(getContext().getApplicationContext(), RoadsActivity.class);
						getActivity().startActivity(nav);
						break;
					case 3:
						nav.setClass(getContext().getApplicationContext(), SanitationActivity.class);
						getActivity().startActivity(nav);
						break;
					case 4:
						nav.setClass(getContext().getApplicationContext(), CameraMeasureActivity.class);
						getActivity().startActivity(nav);
						break;
				}
			});
		}
		
		@Override
		public int getItemCount() {
			return _data.size();
		}
		
		public class ViewHolder extends RecyclerView.ViewHolder {
			public ViewHolder(View v) {
				super(v);
			}
		}
	}
}
