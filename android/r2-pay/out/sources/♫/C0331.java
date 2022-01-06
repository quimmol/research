package ♫;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import java.util.WeakHashMap;

/* renamed from: ♫.事  reason: contains not printable characters */
public final class C0331 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final Object f1189 = new Object();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final ThreadLocal<TypedValue> f1190 = new ThreadLocal<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final WeakHashMap<Context, SparseArray<C0332>> f1191 = new WeakHashMap<>(0);

    /* renamed from: Φ  reason: contains not printable characters */
    public static ColorStateList m1528(Context context, int resId) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(resId);
        }
        ColorStateList csl = m1529(context, resId);
        if (csl != null) {
            return csl;
        }
        ColorStateList csl2 = m1527(context, resId);
        if (csl2 == null) {
            return C0101.m538(context, resId);
        }
        m1532(context, resId, csl2);
        return csl2;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Drawable m1530(Context context, int resId) {
        return C0421.m2025().m2038(context, resId);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public static ColorStateList m1527(Context context, int resId) {
        if (m1533(context, resId)) {
            return null;
        }
        Resources r = context.getResources();
        try {
            return C0155.m783(r, r.getXml(resId), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static ColorStateList m1529(Context context, int resId) {
        C0332 entry;
        synchronized (f1189) {
            SparseArray<AppCompatResources.ColorStateListCacheEntry> entries = f1191.get(context);
            if (!(entries == null || entries.size() <= 0 || (entry = (C0332) entries.get(resId)) == null)) {
                if (entry.f1193.equals(context.getResources().getConfiguration())) {
                    return entry.f1192;
                }
                entries.remove(resId);
            }
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1532(Context context, int resId, ColorStateList value) {
        synchronized (f1189) {
            SparseArray<AppCompatResources.ColorStateListCacheEntry> entries = f1191.get(context);
            if (entries == null) {
                entries = new SparseArray<>();
                f1191.put(context, entries);
            }
            entries.append(resId, new C0332(value, context.getResources().getConfiguration()));
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m1533(Context context, int resId) {
        Resources r = context.getResources();
        TypedValue value = m1531();
        r.getValue(resId, value, true);
        int i = value.type;
        if (i < 28 || i > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static TypedValue m1531() {
        TypedValue tv = f1190.get();
        if (tv != null) {
            return tv;
        }
        TypedValue tv2 = new TypedValue();
        f1190.set(tv2);
        return tv2;
    }

    /* renamed from: ♫.事$θ  reason: contains not printable characters */
    public static class C0332 {

        /* renamed from: θ  reason: contains not printable characters */
        public final ColorStateList f1192;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final Configuration f1193;

        public C0332(ColorStateList value, Configuration configuration) {
            this.f1192 = value;
            this.f1193 = configuration;
        }
    }
}
