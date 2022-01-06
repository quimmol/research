package ♫;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: ♫.死  reason: contains not printable characters */
public class C0483 {

    /* renamed from: µ  reason: contains not printable characters */
    public static final int[] f1817 = new int[1];

    /* renamed from: Ø  reason: contains not printable characters */
    public static final int[] f1818 = {16842912};

    /* renamed from: ö  reason: contains not printable characters */
    public static final int[] f1819 = new int[0];

    /* renamed from: ø  reason: contains not printable characters */
    public static final int[] f1820 = {16842919};

    /* renamed from: Φ  reason: contains not printable characters */
    public static final int[] f1821 = {16842908};

    /* renamed from: θ  reason: contains not printable characters */
    public static final ThreadLocal<TypedValue> f1822 = new ThreadLocal<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final int[] f1823 = {-16842910};

    static {
        new int[1][0] = 16843518;
        new int[1][0] = 16842913;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static int m2280(Context context, int attr) {
        int[] iArr = f1817;
        iArr[0] = attr;
        C0488 a = C0488.m2289(context, (AttributeSet) null, iArr);
        try {
            return a.m2298(0, 0);
        } finally {
            a.m2304();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static ColorStateList m2283(Context context, int attr) {
        int[] iArr = f1817;
        iArr[0] = attr;
        C0488 a = C0488.m2289(context, (AttributeSet) null, iArr);
        try {
            return a.m2299(0);
        } finally {
            a.m2304();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m2281(Context context, int attr) {
        ColorStateList csl = m2283(context, attr);
        if (csl != null && csl.isStateful()) {
            return csl.getColorForState(f1823, csl.getDefaultColor());
        }
        TypedValue tv = m2284();
        context.getTheme().resolveAttribute(16842803, tv, true);
        return m2282(context, attr, tv.getFloat());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static TypedValue m2284() {
        TypedValue typedValue = f1822.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f1822.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m2282(Context context, int attr, float alpha) {
        int color = m2280(context, attr);
        return C0125.m630(color, Math.round(((float) Color.alpha(color)) * alpha));
    }
}
