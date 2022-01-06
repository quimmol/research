package ♫;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ♫.电  reason: contains not printable characters */
public class C0498 {

    /* renamed from: θ  reason: contains not printable characters */
    public static Method f1875;

    static {
        int i = Build.VERSION.SDK_INT;
        try {
            f1875 = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            if (!f1875.isAccessible()) {
                f1875.setAccessible(true);
            }
        } catch (NoSuchMethodException e) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2371(View view) {
        return C0248.m1146(view) == 1;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2370(View view, Rect inoutInsets, Rect outLocalInsets) {
        Method method = f1875;
        if (method != null) {
            try {
                method.invoke(view, inoutInsets, outLocalInsets);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2369(View view) {
        int i = Build.VERSION.SDK_INT;
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (NoSuchMethodException e) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (IllegalAccessException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
    }
}
