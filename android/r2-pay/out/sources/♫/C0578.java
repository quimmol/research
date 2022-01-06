package ♫;

import android.view.View;
import android.view.ViewParent;

/* renamed from: ♫.יּ  reason: contains not printable characters */
public class C0578 {

    /* renamed from: Φ  reason: contains not printable characters */
    public ViewParent f2290;

    /* renamed from: θ  reason: contains not printable characters */
    public final View f2291;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ViewParent f2292;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f2293;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int[] f2294;

    public C0578(View view) {
        this.f2291 = view;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2819(boolean enabled) {
        if (this.f2293) {
            C0248.m1140(this.f2291);
        }
        this.f2293 = enabled;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2820() {
        return this.f2293;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2823(int type) {
        return m2816(type) != null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2824(int axes, int type) {
        if (m2823(type)) {
            return true;
        }
        if (!m2820()) {
            return false;
        }
        View child = this.f2291;
        for (ViewParent p = this.f2291.getParent(); p != null; p = p.getParent()) {
            if (C0256.m1183(p, child, this.f2291, axes, type)) {
                m2818(type, p);
                C0256.m1180(p, child, this.f2291, axes, type);
                return true;
            }
            if (p instanceof View) {
                child = (View) p;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2817(int type) {
        ViewParent parent = m2816(type);
        if (parent != null) {
            C0256.m1177(parent, this.f2291, type);
            m2818(type, (ViewParent) null);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2825(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        int startY;
        int startX;
        if (m2820()) {
            ViewParent parent = m2816(type);
            if (parent == null) {
                return false;
            }
            if (dxConsumed != 0 || dyConsumed != 0 || dxUnconsumed != 0 || dyUnconsumed != 0) {
                if (offsetInWindow != null) {
                    this.f2291.getLocationInWindow(offsetInWindow);
                    startX = offsetInWindow[0];
                    startY = offsetInWindow[1];
                } else {
                    startX = 0;
                    startY = 0;
                }
                C0256.m1178(parent, this.f2291, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
                if (offsetInWindow != null) {
                    this.f2291.getLocationInWindow(offsetInWindow);
                    offsetInWindow[0] = offsetInWindow[0] - startX;
                    offsetInWindow[1] = offsetInWindow[1] - startY;
                }
                return true;
            } else if (offsetInWindow != null) {
                offsetInWindow[0] = 0;
                offsetInWindow[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2826(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        int startY;
        int startX;
        int[] consumed2;
        if (m2820()) {
            ViewParent parent = m2816(type);
            if (parent == null) {
                return false;
            }
            if (dx != 0 || dy != 0) {
                if (offsetInWindow != null) {
                    this.f2291.getLocationInWindow(offsetInWindow);
                    startX = offsetInWindow[0];
                    startY = offsetInWindow[1];
                } else {
                    startX = 0;
                    startY = 0;
                }
                if (consumed == null) {
                    if (this.f2294 == null) {
                        this.f2294 = new int[2];
                    }
                    consumed2 = this.f2294;
                } else {
                    consumed2 = consumed;
                }
                consumed2[0] = 0;
                consumed2[1] = 0;
                C0256.m1179(parent, this.f2291, dx, dy, consumed2, type);
                if (offsetInWindow != null) {
                    this.f2291.getLocationInWindow(offsetInWindow);
                    offsetInWindow[0] = offsetInWindow[0] - startX;
                    offsetInWindow[1] = offsetInWindow[1] - startY;
                }
                if (consumed2[0] == 0 && consumed2[1] == 0) {
                    return false;
                }
                return true;
            } else if (offsetInWindow != null) {
                offsetInWindow[0] = 0;
                offsetInWindow[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2822(float velocityX, float velocityY, boolean consumed) {
        ViewParent parent;
        if (!m2820() || (parent = m2816(0)) == null) {
            return false;
        }
        return C0256.m1182(parent, this.f2291, velocityX, velocityY, consumed);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2821(float velocityX, float velocityY) {
        ViewParent parent;
        if (!m2820() || (parent = m2816(0)) == null) {
            return false;
        }
        return C0256.m1181(parent, this.f2291, velocityX, velocityY);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final ViewParent m2816(int type) {
        if (type == 0) {
            return this.f2292;
        }
        if (type != 1) {
            return null;
        }
        return this.f2290;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2818(int type, ViewParent p) {
        if (type == 0) {
            this.f2292 = p;
        } else if (type == 1) {
            this.f2290 = p;
        }
    }
}
