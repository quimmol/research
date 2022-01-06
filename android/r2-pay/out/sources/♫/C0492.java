package ♫;

import android.os.Build;
import android.view.View;

/* renamed from: ♫.点  reason: contains not printable characters */
public class C0492 {
    /* renamed from: θ  reason: contains not printable characters */
    public static void m2353(View view, CharSequence tooltipText) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(tooltipText);
        } else {
            View$OnLongClickListenerC0493.m2354(view, tooltipText);
        }
    }
}
