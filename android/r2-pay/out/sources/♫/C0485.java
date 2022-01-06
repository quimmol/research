package ♫;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

/* renamed from: ♫.毕  reason: contains not printable characters */
public class C0485 extends ContextWrapper {

    /* renamed from: θ  reason: contains not printable characters */
    public static final Object f1824 = new Object();

    /* renamed from: θ  reason: contains not printable characters */
    public static Context m2285(Context context) {
        m2286(context);
        return context;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2286(Context context) {
        if ((context instanceof C0485) || (context.getResources() instanceof C0487) || (context.getResources() instanceof C0497)) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        C0497.m2367();
        return false;
    }
}
