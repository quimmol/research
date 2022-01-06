package ♫;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: ♫.家  reason: contains not printable characters */
public class C0416 {

    /* renamed from: ø  reason: contains not printable characters */
    public C0486 f1570;

    /* renamed from: Φ  reason: contains not printable characters */
    public C0486 f1571;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1572 = -1;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final View f1573;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0421 f1574;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0486 f1575;

    public C0416(View view) {
        this.f1573 = view;
        this.f1574 = C0421.m2025();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2010(AttributeSet attrs, int defStyleAttr) {
        C0488 a = C0488.m2290(this.f1573.getContext(), attrs, C0291.ViewBackgroundHelper, defStyleAttr, 0);
        try {
            if (a.m2305(C0291.ViewBackgroundHelper_android_background)) {
                this.f1572 = a.m2308(C0291.ViewBackgroundHelper_android_background, -1);
                ColorStateList tint = this.f1574.m2037(this.f1573.getContext(), this.f1572);
                if (tint != null) {
                    m2008(tint);
                }
            }
            if (a.m2305(C0291.ViewBackgroundHelper_backgroundTint)) {
                C0248.m1155(this.f1573, a.m2299(C0291.ViewBackgroundHelper_backgroundTint));
            }
            if (a.m2305(C0291.ViewBackgroundHelper_backgroundTintMode)) {
                C0248.m1156(this.f1573, C0452.m2151(a.m2292(C0291.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a.m2304();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2007(int resId) {
        this.f1572 = resId;
        C0421 r0 = this.f1574;
        m2008(r0 != null ? r0.m2037(this.f1573.getContext(), resId) : null);
        m2006();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2002() {
        this.f1572 = -1;
        m2008((ColorStateList) null);
        m2006();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2003(ColorStateList tint) {
        if (this.f1571 == null) {
            this.f1571 = new C0486();
        }
        C0486 r0 = this.f1571;
        r0.f1826 = tint;
        r0.f1825 = true;
        m2006();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ColorStateList m2004() {
        C0486 r0 = this.f1571;
        if (r0 != null) {
            return r0.f1826;
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2009(PorterDuff.Mode tintMode) {
        if (this.f1571 == null) {
            this.f1571 = new C0486();
        }
        C0486 r0 = this.f1571;
        r0.f1827 = tintMode;
        r0.f1828 = true;
        m2006();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public PorterDuff.Mode m2005() {
        C0486 r0 = this.f1571;
        if (r0 != null) {
            return r0.f1827;
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2006() {
        Drawable background = this.f1573.getBackground();
        if (background == null) {
            return;
        }
        if (!m2011() || !m2012(background)) {
            C0486 r1 = this.f1571;
            if (r1 != null) {
                C0421.m2027(background, r1, this.f1573.getDrawableState());
                return;
            }
            C0486 r12 = this.f1575;
            if (r12 != null) {
                C0421.m2027(background, r12, this.f1573.getDrawableState());
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2008(ColorStateList tint) {
        if (tint != null) {
            if (this.f1575 == null) {
                this.f1575 = new C0486();
            }
            C0486 r0 = this.f1575;
            r0.f1826 = tint;
            r0.f1825 = true;
        } else {
            this.f1575 = null;
        }
        m2006();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2011() {
        int sdk = Build.VERSION.SDK_INT;
        if (sdk <= 21) {
            return sdk == 21;
        }
        if (this.f1575 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2012(Drawable background) {
        if (this.f1570 == null) {
            this.f1570 = new C0486();
        }
        C0486 info = this.f1570;
        info.m2287();
        ColorStateList tintList = C0248.m1147(this.f1573);
        if (tintList != null) {
            info.f1825 = true;
            info.f1826 = tintList;
        }
        PorterDuff.Mode mode = C0248.m1148(this.f1573);
        if (mode != null) {
            info.f1828 = true;
            info.f1827 = mode;
        }
        if (!info.f1825 && !info.f1828) {
            return false;
        }
        C0421.m2027(background, info, this.f1573.getDrawableState());
        return true;
    }
}
