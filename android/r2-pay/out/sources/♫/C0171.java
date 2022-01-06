package ♫;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ♫.י  reason: contains not printable characters */
public final class C0171 {

    /* renamed from: Φ  reason: contains not printable characters */
    public static Method f769;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public static boolean f770;

    /* renamed from: θ  reason: contains not printable characters */
    public static Method f771;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static boolean f772;

    @Deprecated
    /* renamed from: θ  reason: contains not printable characters */
    public static void m857(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m865(Drawable drawable, boolean mirrored) {
        int i = Build.VERSION.SDK_INT;
        drawable.setAutoMirrored(mirrored);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static boolean m853(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.isAutoMirrored();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m858(Drawable drawable, float x, float y) {
        int i = Build.VERSION.SDK_INT;
        drawable.setHotspot(x, y);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m860(Drawable drawable, int left, int top, int right, int bottom) {
        int i = Build.VERSION.SDK_INT;
        drawable.setHotspotBounds(left, top, right, bottom);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m859(Drawable drawable, int tint) {
        int i = Build.VERSION.SDK_INT;
        drawable.setTint(tint);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m861(Drawable drawable, ColorStateList tint) {
        int i = Build.VERSION.SDK_INT;
        drawable.setTintList(tint);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m864(Drawable drawable, PorterDuff.Mode tintMode) {
        int i = Build.VERSION.SDK_INT;
        drawable.setTintMode(tintMode);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m854(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.getAlpha();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m862(Drawable drawable, Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        drawable.applyTheme(theme);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m866(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.canApplyTheme();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static ColorFilter m855(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        return drawable.getColorFilter();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m863(Drawable drawable, Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        drawable.inflate(res, parser, attrs, theme);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Drawable m856(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 && !(drawable instanceof AbstractC0174)) {
            return new C0268(drawable);
        }
        return drawable;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m867(Drawable drawable, int layoutDirection) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(layoutDirection);
        }
        if (!f772) {
            try {
                f771 = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f771.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f772 = true;
        }
        Method method = f771;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(layoutDirection));
                return true;
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f771 = null;
            }
        }
        return false;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static int m852(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!f770) {
            try {
                f769 = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f769.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            f770 = true;
        }
        Method method = f769;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                f769 = null;
            }
        }
        return 0;
    }
}
