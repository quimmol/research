package ♫;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;

/* renamed from: ♫.如  reason: contains not printable characters */
public abstract class AbstractC0404 extends ViewGroup {

    /* renamed from: ø  reason: contains not printable characters */
    public boolean f1526;

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean f1527;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1528;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Context f1529;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ActionMenuView f1530;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0258 f1531;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0405 f1532;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0407 f1533;

    public abstract void setContentHeight(int i);

    public AbstractC0404(Context context) {
        this(context, null);
    }

    public AbstractC0404(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AbstractC0404(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        int i;
        this.f1532 = new C0405();
        TypedValue tv = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0158.actionBarPopupTheme, tv, true) || (i = tv.resourceId) == 0) {
            this.f1529 = context;
        } else {
            this.f1529 = new ContextThemeWrapper(context, i);
        }
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        TypedArray a = getContext().obtainStyledAttributes(null, C0291.ActionBar, C0158.actionBarStyle, 0);
        setContentHeight(a.getLayoutDimension(C0291.ActionBar_height, 0));
        a.recycle();
        C0407 r1 = this.f1533;
        if (r1 != null) {
            r1.m1980();
        }
    }

    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            this.f1527 = false;
        }
        if (!this.f1527) {
            boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.f1527 = true;
            }
        }
        if (action == 1 || action == 3) {
            this.f1527 = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 9) {
            this.f1526 = false;
        }
        if (!this.f1526) {
            boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.f1526 = true;
            }
        }
        if (action == 10 || action == 3) {
            this.f1526 = false;
        }
        return true;
    }

    public int getContentHeight() {
        return this.f1528;
    }

    public int getAnimatedVisibility() {
        if (this.f1531 != null) {
            return this.f1532.f1534;
        }
        return getVisibility();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0258 m1958(int visibility, long duration) {
        C0258 r0 = this.f1531;
        if (r0 != null) {
            r0.m1194();
        }
        if (visibility == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0258 anim = C0248.m1151((View) this).m1189(1.0f);
            anim.m1190(duration);
            C0405 r1 = this.f1532;
            r1.m1961(anim, visibility);
            anim.m1193(r1);
            return anim;
        }
        C0258 anim2 = C0248.m1151((View) this).m1189(0.0f);
        anim2.m1190(duration);
        C0405 r12 = this.f1532;
        r12.m1961(anim2, visibility);
        anim2.m1193(r12);
        return anim2;
    }

    public void setVisibility(int visibility) {
        if (visibility != getVisibility()) {
            C0258 r0 = this.f1531;
            if (r0 != null) {
                r0.m1194();
            }
            super.setVisibility(visibility);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m1956(View child, int availableWidth, int childSpecHeight, int spacing) {
        child.measure(View.MeasureSpec.makeMeasureSpec(availableWidth, Integer.MIN_VALUE), childSpecHeight);
        return Math.max(0, (availableWidth - child.getMeasuredWidth()) - spacing);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m1954(int x, int val, boolean isRtl) {
        return isRtl ? x - val : x + val;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m1957(View child, int x, int y, int contentHeight, boolean reverse) {
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        int childTop = ((contentHeight - childHeight) / 2) + y;
        if (reverse) {
            child.layout(x - childWidth, childTop, x, childTop + childHeight);
        } else {
            child.layout(x, childTop, x + childWidth, childTop + childHeight);
        }
        return reverse ? -childWidth : childWidth;
    }

    /* renamed from: ♫.如$θ  reason: contains not printable characters */
    public class C0405 implements AbstractC0271 {

        /* renamed from: θ  reason: contains not printable characters */
        public int f1534;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f1536 = false;

        public C0405() {
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0405 m1961(C0258 animation, int visibility) {
            AbstractC0404.this.f1531 = animation;
            this.f1534 = visibility;
            return this;
        }

        @Override // ♫.AbstractC0271
        /* renamed from: ø  reason: contains not printable characters */
        public void m1959(View view) {
            AbstractC0404.super.setVisibility(0);
            this.f1536 = false;
        }

        @Override // ♫.AbstractC0271
        /* renamed from: θ  reason: contains not printable characters */
        public void m1962(View view) {
            if (!this.f1536) {
                AbstractC0404 r0 = AbstractC0404.this;
                r0.f1531 = null;
                AbstractC0404.super.setVisibility(this.f1534);
            }
        }

        @Override // ♫.AbstractC0271
        /* renamed from: Φ  reason: contains not printable characters */
        public void m1960(View view) {
            this.f1536 = true;
        }
    }
}
