package ♫;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: ♫.是  reason: contains not printable characters */
public abstract class AbstractView$OnTouchListenerC0458 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: ø  reason: contains not printable characters */
    public int f1696;

    /* renamed from: Φ  reason: contains not printable characters */
    public final int f1697;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Runnable f1698;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1699;

    /* renamed from: θ  reason: contains not printable characters */
    public final float f1700;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final int f1701;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final View f1702;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Runnable f1703;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final int[] f1704 = new int[2];

    /* renamed from: θ  reason: contains not printable characters */
    public abstract AbstractC0398 m2173();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract boolean m2175();

    public AbstractView$OnTouchListenerC0458(View src) {
        this.f1702 = src;
        src.setLongClickable(true);
        src.addOnAttachStateChangeListener(this);
        this.f1700 = (float) ViewConfiguration.get(src.getContext()).getScaledTouchSlop();
        this.f1701 = ViewConfiguration.getTapTimeout();
        this.f1697 = (this.f1701 + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public boolean onTouch(View v, MotionEvent event) {
        boolean forwarding;
        boolean wasForwarding = this.f1699;
        if (wasForwarding) {
            forwarding = m2176(event) || !m2170();
        } else {
            forwarding = m2171(event) && m2175();
            if (forwarding) {
                long now = SystemClock.uptimeMillis();
                MotionEvent e = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                this.f1702.onTouchEvent(e);
                e.recycle();
            }
        }
        this.f1699 = forwarding;
        if (forwarding || wasForwarding) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View v) {
    }

    public void onViewDetachedFromWindow(View v) {
        this.f1699 = false;
        this.f1696 = -1;
        Runnable runnable = this.f1703;
        if (runnable != null) {
            this.f1702.removeCallbacks(runnable);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m2170() {
        AbstractC0398 popup = m2173();
        if (popup == null || !popup.m1922()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006f;
     */
    /* renamed from: Φ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m2171(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.AbstractView$OnTouchListenerC0458.m2171(android.view.MotionEvent):boolean");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2174() {
        Runnable runnable = this.f1698;
        if (runnable != null) {
            this.f1702.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1703;
        if (runnable2 != null) {
            this.f1702.removeCallbacks(runnable2);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2169() {
        m2174();
        View src = this.f1702;
        if (src.isEnabled() && !src.isLongClickable() && m2175()) {
            src.getParent().requestDisallowInterceptTouchEvent(true);
            long now = SystemClock.uptimeMillis();
            MotionEvent e = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
            src.onTouchEvent(e);
            e.recycle();
            this.f1699 = true;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2176(MotionEvent srcEvent) {
        C0453 dst;
        View src = this.f1702;
        AbstractC0398 popup = m2173();
        if (popup == null || !popup.m1922() || (dst = (C0453) popup.m1923()) == null || !dst.isShown()) {
            return false;
        }
        MotionEvent dstEvent = MotionEvent.obtainNoHistory(srcEvent);
        m2177(src, dstEvent);
        m2172(dst, dstEvent);
        boolean handled = dst.m2164(dstEvent, this.f1696);
        dstEvent.recycle();
        int action = srcEvent.getActionMasked();
        boolean keepForwarding = (action == 1 || action == 3) ? false : true;
        if (!handled || !keepForwarding) {
            return false;
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2168(View view, float localX, float localY, float slop) {
        return localX >= (-slop) && localY >= (-slop) && localX < ((float) (view.getRight() - view.getLeft())) + slop && localY < ((float) (view.getBottom() - view.getTop())) + slop;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean m2172(View view, MotionEvent event) {
        int[] loc = this.f1704;
        view.getLocationOnScreen(loc);
        event.offsetLocation((float) (-loc[0]), (float) (-loc[1]));
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2177(View view, MotionEvent event) {
        int[] loc = this.f1704;
        view.getLocationOnScreen(loc);
        event.offsetLocation((float) loc[0], (float) loc[1]);
        return true;
    }

    /* renamed from: ♫.是$θ  reason: contains not printable characters */
    public class RunnableC0460 implements Runnable {
        public RunnableC0460() {
        }

        public void run() {
            ViewParent parent = AbstractView$OnTouchListenerC0458.this.f1702.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: ♫.是$Φ  reason: contains not printable characters */
    public class RunnableC0459 implements Runnable {
        public RunnableC0459() {
        }

        public void run() {
            AbstractView$OnTouchListenerC0458.this.m2169();
        }
    }
}
