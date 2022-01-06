package ♫;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: ♫.ᖮ  reason: contains not printable characters */
public final class C0247 {

    /* renamed from: Φ  reason: contains not printable characters */
    public static boolean f970;

    /* renamed from: θ  reason: contains not printable characters */
    public static Field f971;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static Method f972;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static boolean f973;

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1136(PopupWindow popup, View anchor, int xoff, int yoff, int gravity) {
        int i = Build.VERSION.SDK_INT;
        popup.showAsDropDown(anchor, xoff, yoff, gravity);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1137(PopupWindow popupWindow, boolean overlapAnchor) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setOverlapAnchor(overlapAnchor);
            return;
        }
        if (!f970) {
            try {
                f971 = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f971.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
            f970 = true;
        }
        Field field = f971;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(overlapAnchor));
            } catch (IllegalAccessException e2) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e2);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1135(PopupWindow popupWindow, int layoutType) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(layoutType);
            return;
        }
        if (!f973) {
            try {
                f972 = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f972.setAccessible(true);
            } catch (Exception e) {
            }
            f973 = true;
        }
        Method method = f972;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(layoutType));
            } catch (Exception e2) {
            }
        }
    }
}
