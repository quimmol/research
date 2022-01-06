package ♫;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: ♫.然  reason: contains not printable characters */
public class View$OnLongClickListenerC0493 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: Φ  reason: contains not printable characters */
    public static View$OnLongClickListenerC0493 f1854;

    /* renamed from: θ  reason: contains not printable characters */
    public static View$OnLongClickListenerC0493 f1855;

    /* renamed from: ø  reason: contains not printable characters */
    public int f1856;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public int f1857;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final Runnable f1858 = new RunnableC0494();

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1859;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final int f1860;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final View f1861;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final CharSequence f1862;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Runnable f1863 = new RunnableC0495();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0496 f1864;

    /* renamed from: ♫.然$θ  reason: contains not printable characters */
    public class RunnableC0495 implements Runnable {
        public RunnableC0495() {
        }

        public void run() {
            View$OnLongClickListenerC0493.this.m2360(false);
        }
    }

    /* renamed from: ♫.然$Φ  reason: contains not printable characters */
    public class RunnableC0494 implements Runnable {
        public RunnableC0494() {
        }

        public void run() {
            View$OnLongClickListenerC0493.this.m2357();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2354(View view, CharSequence tooltipText) {
        View$OnLongClickListenerC0493 r0 = f1855;
        if (r0 != null && r0.f1861 == view) {
            m2355((View$OnLongClickListenerC0493) null);
        }
        if (TextUtils.isEmpty(tooltipText)) {
            View$OnLongClickListenerC0493 r02 = f1854;
            if (r02 != null && r02.f1861 == view) {
                r02.m2357();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnLongClickListenerC0493(view, tooltipText);
    }

    public View$OnLongClickListenerC0493(View anchor, CharSequence tooltipText) {
        this.f1861 = anchor;
        this.f1862 = tooltipText;
        this.f1860 = C0254.m1174(ViewConfiguration.get(this.f1861.getContext()));
        m2358();
        this.f1861.setOnLongClickListener(this);
        this.f1861.setOnHoverListener(this);
    }

    public boolean onLongClick(View v) {
        this.f1857 = v.getWidth() / 2;
        this.f1856 = v.getHeight() / 2;
        m2360(true);
        return true;
    }

    public boolean onHover(View v, MotionEvent event) {
        if (this.f1864 != null && this.f1859) {
            return false;
        }
        AccessibilityManager manager = (AccessibilityManager) this.f1861.getContext().getSystemService("accessibility");
        if (manager.isEnabled() && manager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action != 7) {
            if (action == 10) {
                m2358();
                m2357();
            }
        } else if (this.f1861.isEnabled() && this.f1864 == null && m2361(event)) {
            m2355(this);
        }
        return false;
    }

    public void onViewAttachedToWindow(View v) {
    }

    public void onViewDetachedFromWindow(View v) {
        m2357();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2360(boolean fromTouch) {
        long timeout;
        if (C0248.m1141(this.f1861)) {
            m2355((View$OnLongClickListenerC0493) null);
            View$OnLongClickListenerC0493 r0 = f1854;
            if (r0 != null) {
                r0.m2357();
            }
            f1854 = this;
            this.f1859 = fromTouch;
            this.f1864 = new C0496(this.f1861.getContext());
            this.f1864.m2365(this.f1861, this.f1857, this.f1856, this.f1859, this.f1862);
            this.f1861.addOnAttachStateChangeListener(this);
            if (this.f1859) {
                timeout = 2500;
            } else if ((C0248.m1139(this.f1861) & 1) == 1) {
                timeout = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
            } else {
                timeout = 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1861.removeCallbacks(this.f1858);
            this.f1861.postDelayed(this.f1858, timeout);
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2357() {
        if (f1854 == this) {
            f1854 = null;
            C0496 r0 = this.f1864;
            if (r0 != null) {
                r0.m2363();
                this.f1864 = null;
                m2358();
                this.f1861.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1855 == this) {
            m2355((View$OnLongClickListenerC0493) null);
        }
        this.f1861.removeCallbacks(this.f1858);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2355(View$OnLongClickListenerC0493 handler) {
        View$OnLongClickListenerC0493 r0 = f1855;
        if (r0 != null) {
            r0.m2359();
        }
        f1855 = handler;
        View$OnLongClickListenerC0493 r02 = f1855;
        if (r02 != null) {
            r02.m2356();
        }
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public final void m2356() {
        this.f1861.postDelayed(this.f1863, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2359() {
        this.f1861.removeCallbacks(this.f1863);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2361(MotionEvent event) {
        int newAnchorX = (int) event.getX();
        int newAnchorY = (int) event.getY();
        if (Math.abs(newAnchorX - this.f1857) <= this.f1860 && Math.abs(newAnchorY - this.f1856) <= this.f1860) {
            return false;
        }
        this.f1857 = newAnchorX;
        this.f1856 = newAnchorY;
        return true;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2358() {
        this.f1857 = Integer.MAX_VALUE;
        this.f1856 = Integer.MAX_VALUE;
    }
}
