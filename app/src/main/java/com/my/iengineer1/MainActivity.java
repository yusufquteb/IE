package com.my.iengineer1;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.content.*;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
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
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import com.github.angads25.filepicker.*;
import com.leinardi.android.speeddial.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import net.cachapa.expandablelayout.*;
import org.json.*;


public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Intent i = new Intent();
	private Intent col = new Intent();
	private TimerTask t;
	private SharedPreferences data_1;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		data_1 = this.getSharedPreferences("data_1", Activity.MODE_PRIVATE);
	}
	
	private void initializeLogic() {
		getWindow().getDecorView()
		.setSystemUiVisibility(
		View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
		);
		if (String.valueOf(MainActivity.this.getApplicationContext().getPackageName()).equals(String.valueOf("com.my.iengineer1"))) {
			t = new TimerTask() {
				@Override
				public void run() {
					MainActivity.this.runOnUiThread(() -> {
						if (String.valueOf(data_1.getString("start-up", "")).equals(String.valueOf(""))) {
							col.setClass(MainActivity.this.getApplicationContext(), StartupActivity.class);
							MainActivity.this.startActivity(col);
							MainActivity.this.finish();
						} else {
							col.setClass(MainActivity.this.getApplicationContext(), HomeActivity.class);
							MainActivity.this.startActivity(col);
							MainActivity.this.finish();
						}
					});
				}
			};
			_timer.schedule(t, (int)(300));
		} else {
			SketchwareUtil.showMessage(MainActivity.this.getApplicationContext(), "Download It From Google Play");
			col.setAction(Intent.ACTION_VIEW);
			col.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.my.iengineer"));
			MainActivity.this.startActivity(col);
			finishAffinity();
		}
	}
	
}