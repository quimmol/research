package ♫;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: ♫.ᵀ  reason: contains not printable characters */
public final class C0256 {
    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m1183(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof AbstractC0184) {
            return ((AbstractC0184) parent).m896(child, target, nestedScrollAxes, type);
        }
        if (type != 0) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        try {
            return parent.onStartNestedScroll(child, target, nestedScrollAxes);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onStartNestedScroll", e);
            return false;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1180(ViewParent parent, View child, View target, int nestedScrollAxes, int type) {
        if (parent instanceof AbstractC0184) {
            ((AbstractC0184) parent).m895(child, target, nestedScrollAxes, type);
        } else if (type == 0) {
            int i = Build.VERSION.SDK_INT;
            try {
                parent.onNestedScrollAccepted(child, target, nestedScrollAxes);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedScrollAccepted", e);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1177(ViewParent parent, View target, int type) {
        if (parent instanceof AbstractC0184) {
            ((AbstractC0184) parent).m892(target, type);
        } else if (type == 0) {
            int i = Build.VERSION.SDK_INT;
            try {
                parent.onStopNestedScroll(target);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onStopNestedScroll", e);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1178(ViewParent parent, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (parent instanceof AbstractC0184) {
            ((AbstractC0184) parent).m893(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
        } else if (type == 0) {
            int i = Build.VERSION.SDK_INT;
            try {
                parent.onNestedScroll(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedScroll", e);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1179(ViewParent parent, View target, int dx, int dy, int[] consumed, int type) {
        if (parent instanceof AbstractC0184) {
            ((AbstractC0184) parent).m894(target, dx, dy, consumed, type);
        } else if (type == 0) {
            int i = Build.VERSION.SDK_INT;
            try {
                parent.onNestedPreScroll(target, dx, dy, consumed);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedPreScroll", e);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m1182(ViewParent parent, View target, float velocityX, float velocityY, boolean consumed) {
        int i = Build.VERSION.SDK_INT;
        try {
            return parent.onNestedFling(target, velocityX, velocityY, consumed);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedFling", e);
            return false;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m1181(ViewParent parent, View target, float velocityX, float velocityY) {
        int i = Build.VERSION.SDK_INT;
        try {
            return parent.onNestedPreFling(target, velocityX, velocityY);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface " + "method onNestedPreFling", e);
            return false;
        }
    }
}
