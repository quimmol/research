package ♫;

import android.os.Build;
import android.view.Gravity;

/* renamed from: ♫.ᐣ  reason: contains not printable characters */
public final class C0191 {
    /* renamed from: θ  reason: contains not printable characters */
    public static int m910(int gravity, int layoutDirection) {
        int i = Build.VERSION.SDK_INT;
        return Gravity.getAbsoluteGravity(gravity, layoutDirection);
    }
}
