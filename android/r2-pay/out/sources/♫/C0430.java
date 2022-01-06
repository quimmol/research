package ♫;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: ♫.很  reason: contains not printable characters */
public class C0430 {

    /* renamed from: ø  reason: contains not printable characters */
    public C0486 f1607;

    /* renamed from: Φ  reason: contains not printable characters */
    public C0486 f1608;

    /* renamed from: θ  reason: contains not printable characters */
    public final ImageView f1609;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0486 f1610;

    public C0430(ImageView view) {
        this.f1609 = view;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2065(AttributeSet attrs, int defStyleAttr) {
        int id;
        C0488 a = C0488.m2290(this.f1609.getContext(), attrs, C0291.AppCompatImageView, defStyleAttr, 0);
        try {
            Drawable drawable = this.f1609.getDrawable();
            if (!(drawable != null || (id = a.m2308(C0291.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C0331.m1530(this.f1609.getContext(), id)) == null)) {
                this.f1609.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0452.m2152(drawable);
            }
            if (a.m2305(C0291.AppCompatImageView_tint)) {
                C0192.m913(this.f1609, a.m2299(C0291.AppCompatImageView_tint));
            }
            if (a.m2305(C0291.AppCompatImageView_tintMode)) {
                C0192.m914(this.f1609, C0452.m2151(a.m2292(C0291.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            a.m2304();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2062(int resId) {
        if (resId != 0) {
            Drawable d = C0331.m1530(this.f1609.getContext(), resId);
            if (d != null) {
                C0452.m2152(d);
            }
            this.f1609.setImageDrawable(d);
        } else {
            this.f1609.setImageDrawable(null);
        }
        m2061();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2066() {
        Drawable background = this.f1609.getBackground();
        int i = Build.VERSION.SDK_INT;
        if (background instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2063(ColorStateList tint) {
        if (this.f1608 == null) {
            this.f1608 = new C0486();
        }
        C0486 r0 = this.f1608;
        r0.f1826 = tint;
        r0.f1825 = true;
        m2061();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ColorStateList m2059() {
        C0486 r0 = this.f1608;
        if (r0 != null) {
            return r0.f1826;
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2064(PorterDuff.Mode tintMode) {
        if (this.f1608 == null) {
            this.f1608 = new C0486();
        }
        C0486 r0 = this.f1608;
        r0.f1827 = tintMode;
        r0.f1828 = true;
        m2061();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public PorterDuff.Mode m2060() {
        C0486 r0 = this.f1608;
        if (r0 != null) {
            return r0.f1827;
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2061() {
        Drawable imageViewDrawable = this.f1609.getDrawable();
        if (imageViewDrawable != null) {
            C0452.m2152(imageViewDrawable);
        }
        if (imageViewDrawable == null) {
            return;
        }
        if (!m2058() || !m2067(imageViewDrawable)) {
            C0486 r1 = this.f1608;
            if (r1 != null) {
                C0421.m2027(imageViewDrawable, r1, this.f1609.getDrawableState());
                return;
            }
            C0486 r12 = this.f1610;
            if (r12 != null) {
                C0421.m2027(imageViewDrawable, r12, this.f1609.getDrawableState());
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean m2058() {
        int sdk = Build.VERSION.SDK_INT;
        if (sdk <= 21) {
            return sdk == 21;
        }
        if (this.f1610 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2067(Drawable imageSource) {
        if (this.f1607 == null) {
            this.f1607 = new C0486();
        }
        C0486 info = this.f1607;
        info.m2287();
        ColorStateList tintList = C0192.m911(this.f1609);
        if (tintList != null) {
            info.f1825 = true;
            info.f1826 = tintList;
        }
        PorterDuff.Mode mode = C0192.m912(this.f1609);
        if (mode != null) {
            info.f1828 = true;
            info.f1827 = mode;
        }
        if (!info.f1825 && !info.f1828) {
            return false;
        }
        C0421.m2027(imageSource, info, this.f1609.getDrawableState());
        return true;
    }
}
