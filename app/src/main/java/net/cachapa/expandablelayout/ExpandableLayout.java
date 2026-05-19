package net.cachapa.expandablelayout;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.my.iengineer1.R;

public class ExpandableLayout extends LinearLayout {

    private static final int DEFAULT_DURATION = 300;

    private boolean expanded;
    private int duration;
    private ValueAnimator animator;

    public ExpandableLayout(Context context) {
        super(context);
        init(context, null);
    }

    public ExpandableLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public ExpandableLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        expanded = true;
        duration = DEFAULT_DURATION;

        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ExpandableLayout);
            expanded = a.getBoolean(R.styleable.ExpandableLayout_el_expanded, true);
            duration = a.getInt(R.styleable.ExpandableLayout_el_duration, DEFAULT_DURATION);
            a.recycle();
        }

        if (!expanded) {
            setVisibility(View.GONE);
        }
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void expand() {
        if (expanded) return;
        expanded = true;

        measure(
            ViewGroup.LayoutParams.MATCH_PARENT,
            MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED)
        );
        final int targetHeight = getMeasuredHeight();

        getLayoutParams().height = 0;
        setVisibility(View.VISIBLE);

        cancelAnimator();
        animator = ValueAnimator.ofInt(0, targetHeight);
        animator.setDuration(duration);
        animator.addUpdateListener(animation -> {
            int val = (int) animation.getAnimatedValue();
            ViewGroup.LayoutParams params = getLayoutParams();
            params.height = val;
            setLayoutParams(params);
        });
        animator.start();
    }

    public void collapse() {
        if (!expanded) return;
        expanded = false;

        final int startHeight = getHeight();

        cancelAnimator();
        animator = ValueAnimator.ofInt(startHeight, 0);
        animator.setDuration(duration);
        animator.addUpdateListener(animation -> {
            int val = (int) animation.getAnimatedValue();
            if (val == 0) {
                setVisibility(View.GONE);
            }
            ViewGroup.LayoutParams params = getLayoutParams();
            params.height = val;
            setLayoutParams(params);
        });
        animator.start();
    }

    private void cancelAnimator() {
        if (animator != null && animator.isRunning()) {
            animator.cancel();
        }
    }
}
