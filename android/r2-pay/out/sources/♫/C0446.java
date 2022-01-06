package ♫;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import ♫.C0115;

/* renamed from: ♫.拿  reason: contains not printable characters */
public class C0446 {

    /* renamed from: µ  reason: contains not printable characters */
    public C0486 f1652;

    /* renamed from: Ø  reason: contains not printable characters */
    public C0486 f1653;

    /* renamed from: ö  reason: contains not printable characters */
    public C0486 f1654;

    /* renamed from: ø  reason: contains not printable characters */
    public C0486 f1655;

    /* renamed from: Φ  reason: contains not printable characters */
    public C0486 f1656;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1657 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Typeface f1658;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final TextView f1659;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0449 f1660;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0486 f1661;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1662;

    public C0446(TextView view) {
        this.f1659 = view;
        this.f1660 = new C0449(this.f1659);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: θ  reason: contains not printable characters */
    public void m2106(AttributeSet attrs, int defStyleAttr) {
        Context context = this.f1659.getContext();
        C0421 drawableManager = C0421.m2025();
        C0488 a = C0488.m2290(context, attrs, C0291.AppCompatTextHelper, defStyleAttr, 0);
        int ap = a.m2308(C0291.AppCompatTextHelper_android_textAppearance, -1);
        if (a.m2305(C0291.AppCompatTextHelper_android_drawableLeft)) {
            this.f1661 = m2091(context, drawableManager, a.m2308(C0291.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a.m2305(C0291.AppCompatTextHelper_android_drawableTop)) {
            this.f1656 = m2091(context, drawableManager, a.m2308(C0291.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a.m2305(C0291.AppCompatTextHelper_android_drawableRight)) {
            this.f1655 = m2091(context, drawableManager, a.m2308(C0291.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a.m2305(C0291.AppCompatTextHelper_android_drawableBottom)) {
            this.f1653 = m2091(context, drawableManager, a.m2308(C0291.AppCompatTextHelper_android_drawableBottom, 0));
        }
        int i = Build.VERSION.SDK_INT;
        if (a.m2305(C0291.AppCompatTextHelper_android_drawableStart)) {
            this.f1654 = m2091(context, drawableManager, a.m2308(C0291.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (a.m2305(C0291.AppCompatTextHelper_android_drawableEnd)) {
            this.f1652 = m2091(context, drawableManager, a.m2308(C0291.AppCompatTextHelper_android_drawableEnd, 0));
        }
        a.m2304();
        boolean hasPwdTm = this.f1659.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean allCaps = false;
        boolean allCapsSet = false;
        ColorStateList textColor = null;
        ColorStateList textColorHint = null;
        ColorStateList textColorLink = null;
        if (ap != -1) {
            C0488 a2 = C0488.m2288(context, ap, C0291.TextAppearance);
            if (!hasPwdTm && a2.m2305(C0291.TextAppearance_textAllCaps)) {
                allCaps = a2.m2306(C0291.TextAppearance_textAllCaps, false);
                allCapsSet = true;
            }
            m2104(context, a2);
            if (Build.VERSION.SDK_INT < 23) {
                if (a2.m2305(C0291.TextAppearance_android_textColor)) {
                    textColor = a2.m2299(C0291.TextAppearance_android_textColor);
                }
                if (a2.m2305(C0291.TextAppearance_android_textColorHint)) {
                    textColorHint = a2.m2299(C0291.TextAppearance_android_textColorHint);
                }
                if (a2.m2305(C0291.TextAppearance_android_textColorLink)) {
                    textColorLink = a2.m2299(C0291.TextAppearance_android_textColorLink);
                }
            }
            a2.m2304();
        }
        C0488 a3 = C0488.m2290(context, attrs, C0291.TextAppearance, defStyleAttr, 0);
        if (!hasPwdTm && a3.m2305(C0291.TextAppearance_textAllCaps)) {
            allCapsSet = true;
            allCaps = a3.m2306(C0291.TextAppearance_textAllCaps, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a3.m2305(C0291.TextAppearance_android_textColor)) {
                textColor = a3.m2299(C0291.TextAppearance_android_textColor);
            }
            if (a3.m2305(C0291.TextAppearance_android_textColorHint)) {
                textColorHint = a3.m2299(C0291.TextAppearance_android_textColorHint);
            }
            if (a3.m2305(C0291.TextAppearance_android_textColorLink)) {
                textColorLink = a3.m2299(C0291.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && a3.m2305(C0291.TextAppearance_android_textSize) && a3.m2294(C0291.TextAppearance_android_textSize, -1) == 0) {
            this.f1659.setTextSize(0, 0.0f);
        }
        m2104(context, a3);
        a3.m2304();
        if (textColor != null) {
            this.f1659.setTextColor(textColor);
        }
        if (textColorHint != null) {
            this.f1659.setHintTextColor(textColorHint);
        }
        if (textColorLink != null) {
            this.f1659.setLinkTextColor(textColorLink);
        }
        if (!hasPwdTm && allCapsSet) {
            m2108(allCaps);
        }
        Typeface typeface = this.f1658;
        if (typeface != null) {
            this.f1659.setTypeface(typeface, this.f1657);
        }
        this.f1660.m2135(attrs, defStyleAttr);
        if (AbstractC0177.f790) {
            if (this.f1660.m2115() != 0) {
                int[] autoSizeTextSizesInPx = this.f1660.m2139();
                if (autoSizeTextSizesInPx.length > 0) {
                    if (((float) this.f1659.getAutoSizeStepGranularity()) != -1.0f) {
                        this.f1659.setAutoSizeTextTypeUniformWithConfiguration(this.f1660.m2119(), this.f1660.m2122(), this.f1660.m2117(), 0);
                    } else {
                        this.f1659.setAutoSizeTextTypeUniformWithPresetSizes(autoSizeTextSizesInPx, 0);
                    }
                }
            }
        }
        C0488 a4 = C0488.m2289(context, attrs, C0291.AppCompatTextView);
        int firstBaselineToTopHeight = a4.m2294(C0291.AppCompatTextView_firstBaselineToTopHeight, -1);
        int lastBaselineToBottomHeight = a4.m2294(C0291.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int lineHeight = a4.m2294(C0291.AppCompatTextView_lineHeight, -1);
        a4.m2304();
        if (firstBaselineToTopHeight != -1) {
            C0261.m1204(this.f1659, firstBaselineToTopHeight);
        }
        if (lastBaselineToBottomHeight != -1) {
            C0261.m1198(this.f1659, lastBaselineToBottomHeight);
        }
        if (lineHeight != -1) {
            C0261.m1196(this.f1659, lineHeight);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2104(Context context, C0488 a) {
        String fontFamilyName;
        this.f1657 = a.m2292(C0291.TextAppearance_android_textStyle, this.f1657);
        boolean z = false;
        if (a.m2305(C0291.TextAppearance_android_fontFamily) || a.m2305(C0291.TextAppearance_fontFamily)) {
            this.f1658 = null;
            int fontFamilyId = a.m2305(C0291.TextAppearance_fontFamily) ? C0291.TextAppearance_fontFamily : C0291.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    this.f1658 = a.m2300(fontFamilyId, this.f1657, new C0447(new WeakReference<>(this.f1659)));
                    if (this.f1658 == null) {
                        z = true;
                    }
                    this.f1662 = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException e) {
                }
            }
            if (this.f1658 == null && (fontFamilyName = a.m2303(fontFamilyId)) != null) {
                this.f1658 = Typeface.create(fontFamilyName, this.f1657);
            }
        } else if (a.m2305(C0291.TextAppearance_android_typeface)) {
            this.f1662 = false;
            int typefaceIndex = a.m2292(C0291.TextAppearance_android_typeface, 1);
            if (typefaceIndex == 1) {
                this.f1658 = Typeface.SANS_SERIF;
            } else if (typefaceIndex == 2) {
                this.f1658 = Typeface.SERIF;
            } else if (typefaceIndex == 3) {
                this.f1658 = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: ♫.拿$θ  reason: contains not printable characters */
    public class C0447 extends C0115.AbstractC0116 {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ WeakReference f1663;

        public C0447(WeakReference weakReference) {
            this.f1663 = weakReference;
        }

        @Override // ♫.C0115.AbstractC0116
        /* renamed from: θ  reason: contains not printable characters */
        public void m2113(Typeface typeface) {
            C0446.this.m2107(this.f1663, typeface);
        }

        @Override // ♫.C0115.AbstractC0116
        /* renamed from: θ  reason: contains not printable characters */
        public void m2112(int reason) {
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2107(WeakReference<TextView> textViewWeak, Typeface typeface) {
        if (this.f1662) {
            this.f1658 = typeface;
            TextView textView = textViewWeak.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1657);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2103(Context context, int resId) {
        ColorStateList textColor;
        C0488 a = C0488.m2288(context, resId, C0291.TextAppearance);
        if (a.m2305(C0291.TextAppearance_textAllCaps)) {
            m2108(a.m2306(C0291.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a.m2305(C0291.TextAppearance_android_textColor) && (textColor = a.m2299(C0291.TextAppearance_android_textColor)) != null) {
            this.f1659.setTextColor(textColor);
        }
        if (a.m2305(C0291.TextAppearance_android_textSize) && a.m2294(C0291.TextAppearance_android_textSize, -1) == 0) {
            this.f1659.setTextSize(0, 0.0f);
        }
        m2104(context, a);
        a.m2304();
        Typeface typeface = this.f1658;
        if (typeface != null) {
            this.f1659.setTypeface(typeface, this.f1657);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2108(boolean allCaps) {
        this.f1659.setAllCaps(allCaps);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2099() {
        if (!(this.f1661 == null && this.f1656 == null && this.f1655 == null && this.f1653 == null)) {
            Drawable[] compoundDrawables = this.f1659.getCompoundDrawables();
            m2105(compoundDrawables[0], this.f1661);
            m2105(compoundDrawables[1], this.f1656);
            m2105(compoundDrawables[2], this.f1655);
            m2105(compoundDrawables[3], this.f1653);
        }
        int i = Build.VERSION.SDK_INT;
        if (this.f1654 != null || this.f1652 != null) {
            Drawable[] compoundDrawables2 = this.f1659.getCompoundDrawablesRelative();
            m2105(compoundDrawables2[0], this.f1654);
            m2105(compoundDrawables2[2], this.f1652);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2105(Drawable drawable, C0486 info) {
        if (drawable != null && info != null) {
            C0421.m2027(drawable, info, this.f1659.getDrawableState());
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0486 m2091(Context context, C0421 drawableManager, int drawableId) {
        ColorStateList tintList = drawableManager.m2037(context, drawableId);
        if (tintList == null) {
            return null;
        }
        C0486 tintInfo = new C0486();
        tintInfo.f1825 = true;
        tintInfo.f1826 = tintList;
        return tintInfo;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2094() {
        if (!AbstractC0177.f790) {
            m2096();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2101(int unit, float size) {
        if (!AbstractC0177.f790 && !m2110()) {
            m2097(unit, size);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2096() {
        this.f1660.m2128();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2110() {
        return this.f1660.m2137();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2097(int unit, float size) {
        this.f1660.m2132(unit, size);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2100(int autoSizeTextType) {
        this.f1660.m2131(autoSizeTextType);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2102(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        this.f1660.m2133(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2109(int[] presetSizes, int unit) {
        this.f1660.m2136(presetSizes, unit);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public int m2092() {
        return this.f1660.m2115();
    }

    /* renamed from: ø  reason: contains not printable characters */
    public int m2093() {
        return this.f1660.m2117();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public int m2095() {
        return this.f1660.m2119();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2098() {
        return this.f1660.m2122();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int[] m2111() {
        return this.f1660.m2139();
    }
}
