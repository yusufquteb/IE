package com.my.iengineer1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.color.MaterialColors;


/**
 * Modern Startup Activity with Material 3 Design
 * Following Android best practices and latest programming standards
 */
public class StartupActivity extends AppCompatActivity {
    
    // Constants
    private static final String PREFS_NAME = "data_1";
    private static final String STARTUP_KEY = "start-up";
    private static final String FONT_PATH = "fonts/hevo.ttf";
    private static final int TOTAL_PAGES = 3;
    private static final int DOT_SIZE_ACTIVE = 40;
    private static final int DOT_SIZE_INACTIVE = 20;
    private static final int DOT_HEIGHT = 20;
    
    // UI Components
    private CoordinatorLayout mainCoordinator;
    private LinearLayout allback;
    private LinearLayout tabsLinear;
    private LinearLayout[] layouts = new LinearLayout[TOTAL_PAGES];
    private ImageView[] imageViews = new ImageView[TOTAL_PAGES];
    private TextView[] titleTextViews = new TextView[TOTAL_PAGES];
    private TextView[] descriptionTextViews = new TextView[TOTAL_PAGES];
    private LinearLayout[] dots = new LinearLayout[TOTAL_PAGES];
    private MaterialButton continueButton;
    
    
    // ViewPager components
    private ViewPager viewPager;
    private OnboardingPagerAdapter pagerAdapter;
    
    // Data
    private SharedPreferences sharedPreferences;
    private Typeface customTypeface;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup);
        
        initializeComponents();
        setupUI();
        setupEventListeners();
    }
    
    /**
     * Initialize all UI components and data
     */
    private void initializeComponents() {
        // UI Components
        mainCoordinator = findViewById(R.id.main_coordinator);
        allback = findViewById(R.id.allback);
        tabsLinear = findViewById(R.id.tabslinear);
        
        // Layouts
        layouts[0] = findViewById(R.id.layout1);
        layouts[1] = findViewById(R.id.layout2);
        layouts[2] = findViewById(R.id.layout3);
        
        // ImageViews
        imageViews[0] = findViewById(R.id.imageview1);
        imageViews[1] = findViewById(R.id.imageview2);
        imageViews[2] = findViewById(R.id.imageview3);
        
        // Title TextViews
        titleTextViews[0] = findViewById(R.id.textview4);
        titleTextViews[1] = findViewById(R.id.textview6);
        titleTextViews[2] = findViewById(R.id.textview8);
        
        // Description TextViews
        descriptionTextViews[0] = findViewById(R.id.textview5);
        descriptionTextViews[1] = findViewById(R.id.textview7);
        descriptionTextViews[2] = findViewById(R.id.textview9);
        
        // Dots
        dots[0] = findViewById(R.id.dot1);
        dots[1] = findViewById(R.id.dot2);
        dots[2] = findViewById(R.id.dot3);
        
        // Buttons and FAB
        continueButton = findViewById(R.id.textview3);
        
        
        // Data
        sharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        
        try {
            customTypeface = Typeface.createFromAsset(getAssets(), FONT_PATH);
        } catch (Exception e) {
            customTypeface = Typeface.DEFAULT;
        }
    }
    
    /**
     * Setup UI appearance and styling
     */
    private void setupUI() {
        setupStatusBar();
        setupViewPager();
        setupDots();
        setupFonts();
        setupMaterial3Components();
        
        // Initially hide continue button
        continueButton.setVisibility(View.GONE);
    }
    
    /**
     * Setup event listeners
     */
    private void setupEventListeners() {
        continueButton.setOnClickListener(v -> navigateToHome());
        
        
    }
    
    /**
     * Setup status bar with Material 3 colors
     */
    private void setupStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            
            // Use Material 3 colors
            int statusBarColor = MaterialColors.getColor(this, 
                com.google.android.material.R.attr.colorSurface, 
                ContextCompat.getColor(this, android.R.color.white));
            window.setStatusBarColor(statusBarColor);
            
            // Light status bar icons
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            }
        }
    }
    
    /**
     * Setup ViewPager with modern adapter
     */
    private void setupViewPager() {
        viewPager = new ViewPager(this);
        viewPager.setLayoutParams(new ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT, 
            ViewGroup.LayoutParams.MATCH_PARENT));
        
        pagerAdapter = new OnboardingPagerAdapter();
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(0);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                updateDotsIndicator(position);
                animateControlsVisibility(position);
            }
            
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // Smooth animations could be added here
            }
            
            @Override
            public void onPageScrollStateChanged(int state) {
                // Handle scroll state changes if needed
            }
        });
        
        // Add ViewPager to base container
        LinearLayout base = findViewById(R.id.base);
        base.addView(viewPager);
    }
    
    /**
     * Setup dots indicator with modern styling
     */
    private void setupDots() {
        for (int i = 0; i < dots.length; i++) {
            setupDotAppearance(dots[i], i == 0);
        }
    }
    
    /**
     * Setup dot appearance with Material 3 colors
     */
    private void setupDotAppearance(LinearLayout dot, boolean isActive) {
        int width = isActive ? DOT_SIZE_ACTIVE : DOT_SIZE_INACTIVE;
        dot.setLayoutParams(new LinearLayout.LayoutParams(width, DOT_HEIGHT));
        
        // Use Material 3 primary color for active dot
        String activeColor = String.format("#%06X", 
            (0xFFFFFF & MaterialColors.getColor(this, 
                com.google.android.material.R.attr.colorPrimary, 
                Color.parseColor("#bb86fc"))));
        String inactiveColor = "#EEEEEE";
        
        createRippleBackground(dot, isActive ? activeColor : inactiveColor, 100);
    }
    
    /**
     * Update dots indicator based on current page
     */
    private void updateDotsIndicator(int currentPage) {
        for (int i = 0; i < dots.length; i++) {
            animateDotTransition(dots[i], i == currentPage);
        }
    }
    
    /**
     * Animate dot transition with smooth animation
     */
    private void animateDotTransition(LinearLayout dot, boolean isActive) {
        int targetWidth = isActive ? DOT_SIZE_ACTIVE : DOT_SIZE_INACTIVE;
        
        ValueAnimator animator = ValueAnimator.ofInt(dot.getLayoutParams().width, targetWidth);
        animator.setDuration(300);
        animator.addUpdateListener(animation -> {
            int animatedValue = (int) animation.getAnimatedValue();
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(animatedValue, DOT_HEIGHT);
            dot.setLayoutParams(params);
        });
        animator.start();
        
        setupDotAppearance(dot, isActive);
    }
    
    /**
     * Animate controls visibility
     */
    private void animateControlsVisibility(int position) {
        LinearLayout controlsContainer = findViewById(R.id.linear8);
        TransitionManager.beginDelayedTransition(controlsContainer, new AutoTransition());
        
        boolean isLastPage = position == TOTAL_PAGES - 1;
        continueButton.setVisibility(isLastPage ? View.VISIBLE : View.GONE);
    }
    
    /**
     * Setup custom fonts
     */
    private void setupFonts() {
        if (customTypeface != null) {
            for (TextView titleTextView : titleTextViews) {
                if (titleTextView != null) {
                    titleTextView.setTypeface(customTypeface);
                }
            }
            continueButton.setTypeface(customTypeface);
        }
    }
    
    /**
     * Setup Material 3 components
     */
    private void setupMaterial3Components() {
        
        // Setup continue button styling
        setupContinueButtonStyle();
    }
    
    /**
     * Setup continue button with Material 3 styling
     */
    private void setupContinueButtonStyle() {
        if (continueButton != null) {
            // Apply Material 3 button styling
            TypedValue outValue = new TypedValue();
            getTheme().resolveAttribute(com.google.android.material.R.attr.colorPrimary, outValue, true);
            continueButton.setBackgroundTintList(ContextCompat.getColorStateList(this, outValue.resourceId));
        }
    }
    
    /**
     * Create ripple background effect
     */
    private void createRippleBackground(View view, String backgroundColor, int cornerRadius) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(backgroundColor));
        gradientDrawable.setCornerRadius(cornerRadius);
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            RippleDrawable rippleDrawable = new RippleDrawable(
                ContextCompat.getColorStateList(this, android.R.color.white),
                gradientDrawable, null);
            view.setBackground(rippleDrawable);
        } else {
            view.setBackground(gradientDrawable);
        }
    }
    
    /**
     * Navigate to home activity
     */
    private void navigateToHome() {
        sharedPreferences.edit().putString(STARTUP_KEY, "A").apply();
        
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
    
    /**
     * Modern ViewPager adapter with proper lifecycle management
     */
    private class OnboardingPagerAdapter extends PagerAdapter {
        
        @Override
        public int getCount() {
            return TOTAL_PAGES;
        }
        
        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            LayoutInflater inflater = LayoutInflater.from(StartupActivity.this);
            View view = inflater.inflate(R.layout.empty, container, false);
            
            LinearLayout contentContainer = view.findViewById(R.id.linear1);
            
            if (position < layouts.length && layouts[position] != null) {
                // Remove from previous parent
                ViewGroup parent = (ViewGroup) layouts[position].getParent();
                if (parent != null) {
                    parent.removeView(layouts[position]);
                }
                
                // Add to current container
                contentContainer.addView(layouts[position]);
            }
            
            container.addView(view);
            return view;
        }
        
        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
            
            // Optional: Add to trash container for recycling
            LinearLayout trash = findViewById(R.id.trash);
            if (trash != null) {
                trash.addView((View) object);
            }
        }
        
        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Clean up resources
        if (viewPager != null) {
            viewPager.clearOnPageChangeListeners();
        }
    }
}