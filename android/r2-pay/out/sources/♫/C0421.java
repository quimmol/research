package ♫;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ♫.差  reason: contains not printable characters */
public final class C0421 {

    /* renamed from: µ  reason: contains not printable characters */
    public static final int[] f1588 = {C0067.abc_btn_check_material, C0067.abc_btn_radio_material};

    /* renamed from: Ø  reason: contains not printable characters */
    public static final int[] f1589 = {C0067.abc_popup_background_mtrl_mult, C0067.abc_cab_background_internal_bg, C0067.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: ö  reason: contains not printable characters */
    public static final int[] f1590 = {C0067.abc_tab_indicator_material, C0067.abc_textfield_search_material};

    /* renamed from: ø  reason: contains not printable characters */
    public static final int[] f1591 = {C0067.abc_textfield_activated_mtrl_alpha, C0067.abc_textfield_search_activated_mtrl_alpha, C0067.abc_cab_background_top_mtrl_alpha, C0067.abc_text_cursor_material, C0067.abc_text_select_handle_left_mtrl_dark, C0067.abc_text_select_handle_middle_mtrl_dark, C0067.abc_text_select_handle_right_mtrl_dark, C0067.abc_text_select_handle_left_mtrl_light, C0067.abc_text_select_handle_middle_mtrl_light, C0067.abc_text_select_handle_right_mtrl_light};

    /* renamed from: Φ  reason: contains not printable characters */
    public static final int[] f1592 = {C0067.abc_ic_commit_search_api_mtrl_alpha, C0067.abc_seekbar_tick_mark_material, C0067.abc_ic_menu_share_mtrl_alpha, C0067.abc_ic_menu_copy_mtrl_am_alpha, C0067.abc_ic_menu_cut_mtrl_alpha, C0067.abc_ic_menu_selectall_mtrl_alpha, C0067.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: θ  reason: contains not printable characters */
    public static final PorterDuff.Mode f1593 = PorterDuff.Mode.SRC_IN;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final C0424 f1594 = new C0424(6);

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static C0421 f1595;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final int[] f1596 = {C0067.abc_textfield_search_default_mtrl_alpha, C0067.abc_textfield_default_mtrl_alpha, C0067.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final WeakHashMap<Context, C0519<WeakReference<Drawable.ConstantState>>> f1597 = new WeakHashMap<>(0);

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public TypedValue f1598;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public WeakHashMap<Context, C0528<ColorStateList>> f1599;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0514<String, AbstractC0422> f1600;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0528<String> f1601;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1602;

    /* renamed from: ♫.差$Ø  reason: contains not printable characters */
    public interface AbstractC0422 {
        /* renamed from: θ  reason: contains not printable characters */
        Drawable m2050(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static synchronized C0421 m2025() {
        C0421 r1;
        synchronized (C0421.class) {
            if (f1595 == null) {
                f1595 = new C0421();
                m2028(f1595);
            }
            r1 = f1595;
        }
        return r1;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2028(C0421 manager) {
        if (Build.VERSION.SDK_INT < 24) {
            manager.m2048("vector", new C0423());
            manager.m2048("animated-vector", new C0425());
            manager.m2048("animated-selector", new C0426());
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public synchronized Drawable m2038(Context context, int resId) {
        return m2043(context, resId, false);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public synchronized Drawable m2043(Context context, int resId, boolean failIfNotKnown) {
        Drawable drawable;
        m2046(context);
        drawable = m2035(context, resId);
        if (drawable == null) {
            drawable = m2042(context, resId);
        }
        if (drawable == null) {
            drawable = C0101.m539(context, resId);
        }
        if (drawable != null) {
            drawable = m2044(context, resId, failIfNotKnown, drawable);
        }
        if (drawable != null) {
            C0452.m2152(drawable);
        }
        return drawable;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public synchronized void m2039(Context context) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (C0519) this.f1597.get(context);
        if (cache != null) {
            cache.m2446();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static long m2021(TypedValue tv) {
        return (((long) tv.assetCookie) << 32) | ((long) tv.data);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Drawable m2042(Context context, int resId) {
        if (this.f1598 == null) {
            this.f1598 = new TypedValue();
        }
        TypedValue tv = this.f1598;
        context.getResources().getValue(resId, tv, true);
        long key = m2021(tv);
        Drawable dr = m2045(context, key);
        if (dr != null) {
            return dr;
        }
        if (resId == C0067.abc_cab_background_top_material) {
            dr = new LayerDrawable(new Drawable[]{m2038(context, C0067.abc_cab_background_internal_bg), m2038(context, C0067.abc_cab_background_top_mtrl_alpha)});
        }
        if (dr != null) {
            dr.setChangingConfigurations(tv.changingConfigurations);
            m2049(context, key, dr);
        }
        return dr;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Drawable m2044(Context context, int resId, boolean failIfNotKnown, Drawable drawable) {
        ColorStateList tintList = m2037(context, resId);
        if (tintList != null) {
            if (C0452.m2153(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawable2 = C0171.m856(drawable);
            C0171.m861(drawable2, tintList);
            PorterDuff.Mode tintMode = m2022(resId);
            if (tintMode == null) {
                return drawable2;
            }
            C0171.m864(drawable2, tintMode);
            return drawable2;
        } else if (resId == C0067.abc_seekbar_track_material) {
            LayerDrawable ld = (LayerDrawable) drawable;
            m2026(ld.findDrawableByLayerId(16908288), C0483.m2280(context, C0158.colorControlNormal), f1593);
            m2026(ld.findDrawableByLayerId(16908303), C0483.m2280(context, C0158.colorControlNormal), f1593);
            m2026(ld.findDrawableByLayerId(16908301), C0483.m2280(context, C0158.colorControlActivated), f1593);
            return drawable;
        } else if (resId == C0067.abc_ratingbar_material || resId == C0067.abc_ratingbar_indicator_material || resId == C0067.abc_ratingbar_small_material) {
            LayerDrawable ld2 = (LayerDrawable) drawable;
            m2026(ld2.findDrawableByLayerId(16908288), C0483.m2281(context, C0158.colorControlNormal), f1593);
            m2026(ld2.findDrawableByLayerId(16908303), C0483.m2280(context, C0158.colorControlActivated), f1593);
            m2026(ld2.findDrawableByLayerId(16908301), C0483.m2280(context, C0158.colorControlActivated), f1593);
            return drawable;
        } else if (m2029(context, resId, drawable) || !failIfNotKnown) {
            return drawable;
        } else {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076 A[Catch:{ Exception -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e A[Catch:{ Exception -> 0x00a6 }] */
    /* renamed from: ø  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable m2035(android.content.Context r13, int r14) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0421.m2035(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final synchronized Drawable m2045(Context context, long key) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (C0519) this.f1597.get(context);
        if (cache == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> wr = cache.m2443(key);
        if (wr != null) {
            Drawable.ConstantState entry = wr.get();
            if (entry != null) {
                return entry.newDrawable(context.getResources());
            }
            cache.m2447(key);
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final synchronized boolean m2049(Context context, long key, Drawable drawable) {
        Drawable.ConstantState cs = drawable.getConstantState();
        if (cs == null) {
            return false;
        }
        LongSparseArray<WeakReference<Drawable.ConstantState>> cache = (C0519) this.f1597.get(context);
        if (cache == null) {
            cache = new C0519<>();
            this.f1597.put(context, cache);
        }
        cache.m2439(key, new WeakReference<>(cs));
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2029(Context context, int resId, Drawable drawable) {
        PorterDuff.Mode tintMode = f1593;
        boolean colorAttrSet = false;
        int colorAttr = 0;
        int alpha = -1;
        if (m2031(f1596, resId)) {
            colorAttr = C0158.colorControlNormal;
            colorAttrSet = true;
        } else if (m2031(f1591, resId)) {
            colorAttr = C0158.colorControlActivated;
            colorAttrSet = true;
        } else if (m2031(f1589, resId)) {
            colorAttr = 16842801;
            colorAttrSet = true;
            tintMode = PorterDuff.Mode.MULTIPLY;
        } else if (resId == C0067.abc_list_divider_mtrl_alpha) {
            colorAttr = 16842800;
            colorAttrSet = true;
            alpha = Math.round(40.8f);
        } else if (resId == C0067.abc_dialog_material_background) {
            colorAttr = 16842801;
            colorAttrSet = true;
        }
        if (!colorAttrSet) {
            return false;
        }
        if (C0452.m2153(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(m2023(C0483.m2280(context, colorAttr), tintMode));
        if (alpha == -1) {
            return true;
        }
        drawable.setAlpha(alpha);
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2048(String tagName, AbstractC0422 delegate) {
        if (this.f1600 == null) {
            this.f1600 = new C0514<>();
        }
        this.f1600.put(tagName, delegate);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2031(int[] array, int value) {
        for (int id : array) {
            if (id == value) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static PorterDuff.Mode m2022(int resId) {
        if (resId == C0067.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public synchronized ColorStateList m2037(Context context, int resId) {
        ColorStateList tint;
        tint = m2034(context, resId);
        if (tint == null) {
            if (resId == C0067.abc_edit_text_material) {
                tint = C0331.m1528(context, C0068.abc_tint_edittext);
            } else if (resId == C0067.abc_switch_track_mtrl_alpha) {
                tint = C0331.m1528(context, C0068.abc_tint_switch_track);
            } else if (resId == C0067.abc_switch_thumb_material) {
                tint = m2032(context);
            } else if (resId == C0067.abc_btn_default_mtrl_shape) {
                tint = m2033(context);
            } else if (resId == C0067.abc_btn_borderless_material) {
                tint = m2040(context);
            } else if (resId == C0067.abc_btn_colored_material) {
                tint = m2036(context);
            } else {
                if (resId != C0067.abc_spinner_mtrl_am_alpha) {
                    if (resId != C0067.abc_spinner_textfield_background_material) {
                        if (m2031(f1592, resId)) {
                            tint = C0483.m2283(context, C0158.colorControlNormal);
                        } else if (m2031(f1590, resId)) {
                            tint = C0331.m1528(context, C0068.abc_tint_default);
                        } else if (m2031(f1588, resId)) {
                            tint = C0331.m1528(context, C0068.abc_tint_btn_checkable);
                        } else if (resId == C0067.abc_seekbar_thumb_material) {
                            tint = C0331.m1528(context, C0068.abc_tint_seek_thumb);
                        }
                    }
                }
                tint = C0331.m1528(context, C0068.abc_tint_spinner);
            }
            if (tint != null) {
                m2047(context, resId, tint);
            }
        }
        return tint;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final ColorStateList m2034(Context context, int resId) {
        SparseArrayCompat<ColorStateList> tints;
        WeakHashMap<Context, C0528<ColorStateList>> weakHashMap = this.f1599;
        if (weakHashMap == null || (tints = (C0528) weakHashMap.get(context)) == null) {
            return null;
        }
        return tints.m2494(resId);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2047(Context context, int resId, ColorStateList tintList) {
        if (this.f1599 == null) {
            this.f1599 = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> themeTints = (C0528) this.f1599.get(context);
        if (themeTints == null) {
            themeTints = new C0528<>();
            this.f1599.put(context, themeTints);
        }
        themeTints.m2499(resId, tintList);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final ColorStateList m2033(Context context) {
        return m2041(context, C0483.m2280(context, C0158.colorButtonNormal));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final ColorStateList m2040(Context context) {
        return m2041(context, 0);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final ColorStateList m2036(Context context) {
        return m2041(context, C0483.m2280(context, C0158.colorAccent));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final ColorStateList m2041(Context context, int baseColor) {
        int[][] states = new int[4][];
        int[] colors = new int[4];
        int colorControlHighlight = C0483.m2280(context, C0158.colorControlHighlight);
        int disabledColor = C0483.m2281(context, C0158.colorButtonNormal);
        states[0] = C0483.f1823;
        colors[0] = disabledColor;
        int i = 0 + 1;
        states[i] = C0483.f1820;
        colors[i] = C0125.m631(colorControlHighlight, baseColor);
        int i2 = i + 1;
        states[i2] = C0483.f1821;
        colors[i2] = C0125.m631(colorControlHighlight, baseColor);
        int i3 = i2 + 1;
        states[i3] = C0483.f1819;
        colors[i3] = baseColor;
        int i4 = i3 + 1;
        return new ColorStateList(states, colors);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public final ColorStateList m2032(Context context) {
        int[][] states = new int[3][];
        int[] colors = new int[3];
        ColorStateList thumbColor = C0483.m2283(context, C0158.colorSwitchThumbNormal);
        if (thumbColor == null || !thumbColor.isStateful()) {
            states[0] = C0483.f1823;
            colors[0] = C0483.m2281(context, C0158.colorSwitchThumbNormal);
            int i = 0 + 1;
            states[i] = C0483.f1818;
            colors[i] = C0483.m2280(context, C0158.colorControlActivated);
            int i2 = i + 1;
            states[i2] = C0483.f1819;
            colors[i2] = C0483.m2280(context, C0158.colorSwitchThumbNormal);
            int i3 = i2 + 1;
        } else {
            states[0] = C0483.f1823;
            colors[0] = thumbColor.getColorForState(states[0], 0);
            int i4 = 0 + 1;
            states[i4] = C0483.f1818;
            colors[i4] = C0483.m2280(context, C0158.colorControlActivated);
            int i5 = i4 + 1;
            states[i5] = C0483.f1819;
            colors[i5] = thumbColor.getDefaultColor();
            int i6 = i5 + 1;
        }
        return new ColorStateList(states, colors);
    }

    /* renamed from: ♫.差$ø  reason: contains not printable characters */
    public static class C0424 extends C0520<Integer, PorterDuffColorFilter> {
        public C0424(int maxSize) {
            super(maxSize);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public PorterDuffColorFilter m2053(int color, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) m2452(Integer.valueOf(m2052(color, mode)));
        }

        /* renamed from: θ  reason: contains not printable characters */
        public PorterDuffColorFilter m2054(int color, PorterDuff.Mode mode, PorterDuffColorFilter filter) {
            return (PorterDuffColorFilter) m2453((Object) Integer.valueOf(m2052(color, mode)), (Object) filter);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public static int m2052(int color, PorterDuff.Mode mode) {
            return (((1 * 31) + color) * 31) + mode.hashCode();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2027(Drawable drawable, C0486 tint, int[] state) {
        if (!C0452.m2153(drawable) || drawable.mutate() == drawable) {
            if (tint.f1825 || tint.f1828) {
                drawable.setColorFilter(m2024(tint.f1825 ? tint.f1826 : null, tint.f1828 ? tint.f1827 : f1593, state));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static PorterDuffColorFilter m2024(ColorStateList tint, PorterDuff.Mode tintMode, int[] state) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return m2023(tint.getColorForState(state, 0), tintMode);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static synchronized PorterDuffColorFilter m2023(int color, PorterDuff.Mode mode) {
        PorterDuffColorFilter filter;
        synchronized (C0421.class) {
            filter = f1594.m2053(color, mode);
            if (filter == null) {
                filter = new PorterDuffColorFilter(color, mode);
                f1594.m2054(color, mode, filter);
            }
        }
        return filter;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2026(Drawable d, int color, PorterDuff.Mode mode) {
        if (C0452.m2153(d)) {
            d = d.mutate();
        }
        d.setColorFilter(m2023(color, mode == null ? f1593 : mode));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2046(Context context) {
        if (!this.f1602) {
            this.f1602 = true;
            Drawable d = m2038(context, C0067.abc_vector_test);
            if (d == null || !m2030(d)) {
                this.f1602 = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2030(Drawable d) {
        return (d instanceof C0231) || "android.graphics.drawable.VectorDrawable".equals(d.getClass().getName());
    }

    /* renamed from: ♫.差$ö  reason: contains not printable characters */
    public static class C0423 implements AbstractC0422 {
        @Override // ♫.C0421.AbstractC0422
        /* renamed from: θ  reason: contains not printable characters */
        public Drawable m2051(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return C0231.m1042(context.getResources(), parser, attrs, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: ♫.差$Φ  reason: contains not printable characters */
    public static class C0425 implements AbstractC0422 {
        @Override // ♫.C0421.AbstractC0422
        /* renamed from: θ  reason: contains not printable characters */
        public Drawable m2055(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return C0200.m935(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: ♫.差$θ  reason: contains not printable characters */
    public static class C0426 implements AbstractC0422 {
        @Override // ♫.C0421.AbstractC0422
        /* renamed from: θ  reason: contains not printable characters */
        public Drawable m2056(Context context, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
            try {
                return C0333.m1534(context, context.getResources(), parser, attrs, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }
}
