package com.my.iengineer1;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class HomeActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        tabLayout = findViewById(R.id.tablayout1);
        viewPager = findViewById(R.id.viewpager1);

        HomePageAdapter adapter = new HomePageAdapter(this);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0: tab.setText("الحصر الهندسي"); break;
                case 1: tab.setText("المشاريع");       break;
            }
        }).attach();

        // Hide system navigation bar
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

    // ── ViewPager2 Adapter ────────────────────────────────────────────────────
    static class HomePageAdapter extends FragmentStateAdapter {
        HomePageAdapter(FragmentActivity fa) { super(fa); }

        @Override public int getItemCount() { return 2; }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            if (position == 1) return new ProjectsListFragment();
            return new HomeListFragmentActivity();
        }
    }
}
