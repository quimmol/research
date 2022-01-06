package ♫;

import android.util.Log;

/* renamed from: ♫.ⁿ  reason: contains not printable characters */
public final class C0288 {

    /* renamed from: θ  reason: contains not printable characters */
    public static int f1032 = 5;

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1282(Object obj) {
        if (m1283()) {
            Log.e("RootBeer", m1280() + String.valueOf(obj));
            Log.e("QLog", m1280() + String.valueOf(obj));
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1281(Exception e) {
        if (m1283()) {
            e.printStackTrace();
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static void m1278(Object obj) {
        if (m1279()) {
            Log.v("RootBeer", m1280() + String.valueOf(obj));
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static boolean m1279() {
        return f1032 > 4;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m1283() {
        return f1032 > 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m1280() {
        StackTraceElement[] elements = new Throwable().getStackTrace();
        String callerMethodName = elements[2].getMethodName();
        String callerClassPath = elements[2].getClassName();
        int lineNo = elements[2].getLineNumber();
        String callerClassName = callerClassPath.substring(callerClassPath.lastIndexOf(46) + 1);
        return callerClassName + ": " + callerMethodName + "() [" + lineNo + "] - ";
    }
}
