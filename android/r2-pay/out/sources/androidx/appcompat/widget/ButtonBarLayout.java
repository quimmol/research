package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ♫.C0065;
import ♫.C0248;
import ♫.C0291;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: Φ  reason: contains not printable characters */
    public int f225 = 0;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f226;

    /* renamed from: θ  reason: contains not printable characters */
    public int f227 = -1;

    public ButtonBarLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta = context.obtainStyledAttributes(attrs, C0291.ButtonBarLayout);
        this.f226 = ta.getBoolean(C0291.ButtonBarLayout_allowStacking, true);
        ta.recycle();
    }

    public void setAllowStacking(boolean allowStacking) {
        if (this.f226 != allowStacking) {
            this.f226 = allowStacking;
            if (!this.f226 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int initialWidthMeasureSpec;
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        if (this.f226) {
            if (widthSize > this.f227 && m131()) {
                setStacked(false);
            }
            this.f227 = widthSize;
        }
        boolean needsRemeasure = false;
        if (m131() || View.MeasureSpec.getMode(widthMeasureSpec) != 1073741824) {
            initialWidthMeasureSpec = widthMeasureSpec;
        } else {
            initialWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(widthSize, Integer.MIN_VALUE);
            needsRemeasure = true;
        }
        super.onMeasure(initialWidthMeasureSpec, heightMeasureSpec);
        if (this.f226 && !m131()) {
            if ((-16777216 & getMeasuredWidthAndState()) == 16777216) {
                setStacked(true);
                needsRemeasure = true;
            }
        }
        if (needsRemeasure) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
        int minHeight = 0;
        int firstVisible = m130(0);
        if (firstVisible >= 0) {
            View firstButton = getChildAt(firstVisible);
            LinearLayout.LayoutParams firstParams = (LinearLayout.LayoutParams) firstButton.getLayoutParams();
            minHeight = 0 + getPaddingTop() + firstButton.getMeasuredHeight() + firstParams.topMargin + firstParams.bottomMargin;
            if (m131()) {
                int secondVisible = m130(firstVisible + 1);
                if (secondVisible >= 0) {
                    minHeight += getChildAt(secondVisible).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                minHeight += getPaddingBottom();
            }
        }
        if (C0248.m1142((View) this) != minHeight) {
            setMinimumHeight(minHeight);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m130(int index) {
        int count = getChildCount();
        for (int i = index; i < count; i++) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
        }
        return -1;
    }

    public int getMinimumHeight() {
        return Math.max(this.f225, super.getMinimumHeight());
    }

    private void setStacked(boolean stacked) {
        setOrientation(stacked ? 1 : 0);
        setGravity(stacked ? 5 : 80);
        View spacer = findViewById(C0065.spacer);
        if (spacer != null) {
            spacer.setVisibility(stacked ? 8 : 4);
        }
        for (int i = getChildCount() - 2; i >= 0; i--) {
            bringChildToFront(getChildAt(i));
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m131() {
        return getOrientation() == 1;
    }
}
