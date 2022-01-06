package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ♫.C0065;
import ♫.C0248;
import ♫.C0291;
import ♫.C0406;
import ♫.C0476;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean f152;

    /* renamed from: ø  reason: contains not printable characters */
    public Drawable f153;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public View f154;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f155;

    /* renamed from: Φ  reason: contains not printable characters */
    public Drawable f156;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public View f157;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f158;

    /* renamed from: θ  reason: contains not printable characters */
    public int f159;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f160;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f161;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        C0248.m1157(this, new C0406(this));
        TypedArray a = context.obtainStyledAttributes(attrs, C0291.ActionBar);
        this.f160 = a.getDrawable(C0291.ActionBar_background);
        this.f156 = a.getDrawable(C0291.ActionBar_backgroundStacked);
        this.f159 = a.getDimensionPixelSize(C0291.ActionBar_height, -1);
        if (getId() == C0065.split_action_bar) {
            this.f155 = true;
            this.f153 = a.getDrawable(C0291.ActionBar_backgroundSplit);
        }
        a.recycle();
        boolean z = false;
        if (!this.f155 ? this.f160 == null && this.f156 == null : this.f153 == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f157 = findViewById(C0065.action_bar);
        this.f154 = findViewById(C0065.action_context_bar);
    }

    public void setPrimaryBackground(Drawable bg) {
        Drawable drawable = this.f160;
        if (drawable != null) {
            drawable.setCallback(null);
            unscheduleDrawable(this.f160);
        }
        this.f160 = bg;
        if (bg != null) {
            bg.setCallback(this);
            View view = this.f157;
            if (view != null) {
                this.f160.setBounds(view.getLeft(), this.f157.getTop(), this.f157.getRight(), this.f157.getBottom());
            }
        }
        boolean z = true;
        if (!this.f155 ? !(this.f160 == null && this.f156 == null) : this.f153 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable bg) {
        Drawable drawable;
        Drawable drawable2 = this.f156;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f156);
        }
        this.f156 = bg;
        if (bg != null) {
            bg.setCallback(this);
            if (this.f152 && (drawable = this.f156) != null) {
                drawable.setBounds(this.f161.getLeft(), this.f161.getTop(), this.f161.getRight(), this.f161.getBottom());
            }
        }
        boolean z = true;
        if (!this.f155 ? !(this.f160 == null && this.f156 == null) : this.f153 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable bg) {
        Drawable drawable;
        Drawable drawable2 = this.f153;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f153);
        }
        this.f153 = bg;
        boolean z = false;
        if (bg != null) {
            bg.setCallback(this);
            if (this.f155 && (drawable = this.f153) != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f155 ? this.f160 == null && this.f156 == null : this.f153 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        boolean isVisible = visibility == 0;
        Drawable drawable = this.f160;
        if (drawable != null) {
            drawable.setVisible(isVisible, false);
        }
        Drawable drawable2 = this.f156;
        if (drawable2 != null) {
            drawable2.setVisible(isVisible, false);
        }
        Drawable drawable3 = this.f153;
        if (drawable3 != null) {
            drawable3.setVisible(isVisible, false);
        }
    }

    public boolean verifyDrawable(Drawable who) {
        return (who == this.f160 && !this.f155) || (who == this.f156 && this.f152) || ((who == this.f153 && this.f155) || super.verifyDrawable(who));
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f160;
        if (drawable != null && drawable.isStateful()) {
            this.f160.setState(getDrawableState());
        }
        Drawable drawable2 = this.f156;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f156.setState(getDrawableState());
        }
        Drawable drawable3 = this.f153;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f153.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f160;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f156;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f153;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean isTransitioning) {
        this.f158 = isTransitioning;
        setDescendantFocusability(isTransitioning ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return this.f158 || super.onInterceptTouchEvent(ev);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        super.onTouchEvent(ev);
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        super.onHoverEvent(ev);
        return true;
    }

    public void setTabContainer(C0476 tabView) {
        View view = this.f161;
        if (view != null) {
            removeView(view);
        }
        this.f161 = tabView;
        if (tabView != null) {
            addView(tabView);
            ViewGroup.LayoutParams lp = tabView.getLayoutParams();
            lp.width = -1;
            lp.height = -2;
            tabView.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.f161;
    }

    public ActionMode startActionModeForChild(View child, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View child, ActionMode.Callback callback, int type) {
        if (type != 0) {
            return super.startActionModeForChild(child, callback, type);
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m71(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m70(View view) {
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int topMarginForTabs;
        int i;
        if (this.f157 == null && View.MeasureSpec.getMode(heightMeasureSpec) == Integer.MIN_VALUE && (i = this.f159) >= 0) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i, View.MeasureSpec.getSize(heightMeasureSpec)), Integer.MIN_VALUE);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f157 != null) {
            int mode = View.MeasureSpec.getMode(heightMeasureSpec);
            View view = this.f161;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!m71(this.f157)) {
                    topMarginForTabs = m70(this.f157);
                } else if (!m71(this.f154)) {
                    topMarginForTabs = m70(this.f154);
                } else {
                    topMarginForTabs = 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(m70(this.f161) + topMarginForTabs, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(heightMeasureSpec) : Integer.MAX_VALUE));
            }
        }
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        Drawable drawable;
        super.onLayout(changed, l, t, r, b);
        View tabContainer = this.f161;
        boolean hasTabs = (tabContainer == null || tabContainer.getVisibility() == 8) ? false : true;
        if (!(tabContainer == null || tabContainer.getVisibility() == 8)) {
            int containerHeight = getMeasuredHeight();
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) tabContainer.getLayoutParams();
            tabContainer.layout(l, (containerHeight - tabContainer.getMeasuredHeight()) - lp.bottomMargin, r, containerHeight - lp.bottomMargin);
        }
        boolean needsInvalidate = false;
        if (this.f155) {
            Drawable drawable2 = this.f153;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                needsInvalidate = true;
            }
        } else {
            if (this.f160 != null) {
                if (this.f157.getVisibility() == 0) {
                    this.f160.setBounds(this.f157.getLeft(), this.f157.getTop(), this.f157.getRight(), this.f157.getBottom());
                } else {
                    View view = this.f154;
                    if (view == null || view.getVisibility() != 0) {
                        this.f160.setBounds(0, 0, 0, 0);
                    } else {
                        this.f160.setBounds(this.f154.getLeft(), this.f154.getTop(), this.f154.getRight(), this.f154.getBottom());
                    }
                }
                needsInvalidate = true;
            }
            this.f152 = hasTabs;
            if (hasTabs && (drawable = this.f156) != null) {
                drawable.setBounds(tabContainer.getLeft(), tabContainer.getTop(), tabContainer.getRight(), tabContainer.getBottom());
                needsInvalidate = true;
            }
        }
        if (needsInvalidate) {
            invalidate();
        }
    }
}
