package ♫;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;

/* renamed from: ♫.方  reason: contains not printable characters */
public class C0452 {
    static {
        new Rect();
        int i = Build.VERSION.SDK_INT;
        try {
            Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException e) {
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2152(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m2150(drawable);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2153(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState state = drawable.getConstantState();
            if (!(state instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable child : ((DrawableContainer.DrawableContainerState) state).getChildren()) {
                if (!m2153(child)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof AbstractC0253) {
            return m2153(((C0263) drawable).m1213());
        } else {
            if (drawable instanceof C0345) {
                return m2153(((C0345) drawable).m1605());
            }
            if (drawable instanceof ScaleDrawable) {
                return m2153(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static void m2150(Drawable drawable) {
        int[] originalState = drawable.getState();
        if (originalState == null || originalState.length == 0) {
            drawable.setState(C0483.f1818);
        } else {
            drawable.setState(C0483.f1819);
        }
        drawable.setState(originalState);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static PorterDuff.Mode m2151(int value, PorterDuff.Mode defaultMode) {
        if (value == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (value == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (value == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (value) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return defaultMode;
        }
    }
}
