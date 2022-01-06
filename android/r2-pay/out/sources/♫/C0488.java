package ♫;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import ♫.C0115;

/* renamed from: ♫.海  reason: contains not printable characters */
public class C0488 {

    /* renamed from: θ  reason: contains not printable characters */
    public final Context f1829;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final TypedArray f1830;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public TypedValue f1831;

    /* renamed from: θ  reason: contains not printable characters */
    public static C0488 m2289(Context context, AttributeSet set, int[] attrs) {
        return new C0488(context, context.obtainStyledAttributes(set, attrs));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0488 m2290(Context context, AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) {
        return new C0488(context, context.obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0488 m2288(Context context, int resid, int[] attrs) {
        return new C0488(context, context.obtainStyledAttributes(resid, attrs));
    }

    public C0488(Context context, TypedArray array) {
        this.f1829 = context;
        this.f1830 = array;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Drawable m2301(int index) {
        int resourceId;
        if (!this.f1830.hasValue(index) || (resourceId = this.f1830.getResourceId(index, 0)) == 0) {
            return this.f1830.getDrawable(index);
        }
        return C0331.m1530(this.f1829, resourceId);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public Drawable m2296(int index) {
        int resourceId;
        if (!this.f1830.hasValue(index) || (resourceId = this.f1830.getResourceId(index, 0)) == 0) {
            return null;
        }
        return C0421.m2025().m2043(this.f1829, resourceId, true);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Typeface m2300(int index, int style, C0115.AbstractC0116 fontCallback) {
        int resourceId = this.f1830.getResourceId(index, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1831 == null) {
            this.f1831 = new TypedValue();
        }
        return C0115.m607(this.f1829, resourceId, this.f1831, style, fontCallback);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public CharSequence m2302(int index) {
        return this.f1830.getText(index);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public String m2303(int index) {
        return this.f1830.getString(index);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2306(int index, boolean defValue) {
        return this.f1830.getBoolean(index, defValue);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public int m2292(int index, int defValue) {
        return this.f1830.getInt(index, defValue);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public float m2297(int index, float defValue) {
        return this.f1830.getFloat(index, defValue);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2298(int index, int defValue) {
        return this.f1830.getColor(index, defValue);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ColorStateList m2299(int index) {
        int resourceId;
        ColorStateList value;
        if (!this.f1830.hasValue(index) || (resourceId = this.f1830.getResourceId(index, 0)) == 0 || (value = C0331.m1528(this.f1829, resourceId)) == null) {
            return this.f1830.getColorStateList(index);
        }
        return value;
    }

    /* renamed from: ö  reason: contains not printable characters */
    public int m2293(int index, int defValue) {
        return this.f1830.getInteger(index, defValue);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public int m2295(int index, int defValue) {
        return this.f1830.getDimensionPixelOffset(index, defValue);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public int m2294(int index, int defValue) {
        return this.f1830.getDimensionPixelSize(index, defValue);
    }

    /* renamed from: µ  reason: contains not printable characters */
    public int m2291(int index, int defValue) {
        return this.f1830.getLayoutDimension(index, defValue);
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public int m2308(int index, int defValue) {
        return this.f1830.getResourceId(index, defValue);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public CharSequence[] m2307(int index) {
        return this.f1830.getTextArray(index);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2305(int index) {
        return this.f1830.hasValue(index);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2304() {
        this.f1830.recycle();
    }
}
