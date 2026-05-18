package com.my.iengineer1.utils;

import android.animation.*;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;

public class AnimationUtils {
    private static final int SCROLL_DURATION = 300;
    private static final int FADE_DURATION = 200;

    public static void smoothScrollWithDuration(ScrollView scrollView, final int scrollY) {
        ObjectAnimator scrollAnimator = ObjectAnimator.ofInt(scrollView, "scrollY", scrollY);
        scrollAnimator.setDuration(SCROLL_DURATION);
        scrollAnimator.setInterpolator(new DecelerateInterpolator());
        scrollAnimator.start();
    }

    public static void highlightNewFragment(Fragment fragment, int highlightColor) {
        if (fragment == null || fragment.getView() == null) return;
        
        View fragmentView = fragment.getView();
        fragmentView.setAlpha(0f);
        
        ValueAnimator backgroundAnimator = ValueAnimator.ofArgb(
            highlightColor,
            fragment.getResources().getColor(android.R.color.transparent, null)
        );
        backgroundAnimator.setDuration(FADE_DURATION * 2);
        backgroundAnimator.addUpdateListener(animation -> 
            fragmentView.setBackgroundColor((int) animation.getAnimatedValue())
        );
        
        ObjectAnimator fadeAnimator = ObjectAnimator.ofFloat(fragmentView, "alpha", 0f, 1f);
        fadeAnimator.setDuration(FADE_DURATION);
        
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(fragmentView, "scaleX", 0.95f, 1f);
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(fragmentView, "scaleY", 0.95f, 1f);
        scaleX.setDuration(FADE_DURATION);
        scaleY.setDuration(FADE_DURATION);
        
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(backgroundAnimator, fadeAnimator, scaleX, scaleY);
        animatorSet.start();
    }
}