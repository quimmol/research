package ♫;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;

/* renamed from: ♫.们  reason: contains not printable characters */
public class C0348 {

    /* renamed from: θ  reason: contains not printable characters */
    public Context f1261;

    /* renamed from: θ  reason: contains not printable characters */
    public static C0348 m1615(Context context) {
        return new C0348(context);
    }

    public C0348(Context context) {
        this.f1261 = context;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public int m1619() {
        Configuration configuration = this.f1261.getResources().getConfiguration();
        int widthDp = configuration.screenWidthDp;
        int heightDp = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || widthDp > 600) {
            return 5;
        }
        if (widthDp > 960 && heightDp > 720) {
            return 5;
        }
        if (widthDp > 720 && heightDp > 960) {
            return 5;
        }
        if (widthDp >= 500) {
            return 4;
        }
        if (widthDp > 640 && heightDp > 480) {
            return 4;
        }
        if (widthDp > 480 && heightDp > 640) {
            return 4;
        }
        if (widthDp >= 360) {
            return 3;
        }
        return 2;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m1618() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m1621() {
        return this.f1261.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1620() {
        return this.f1261.getResources().getBoolean(C0157.abc_action_bar_embed_tabs);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public int m1616() {
        TypedArray a = this.f1261.obtainStyledAttributes(null, C0291.ActionBar, C0158.actionBarStyle, 0);
        int height = a.getLayoutDimension(C0291.ActionBar_height, 0);
        Resources r = this.f1261.getResources();
        if (!m1620()) {
            height = Math.min(height, r.getDimensionPixelSize(C0066.abc_action_bar_stacked_max_height));
        }
        a.recycle();
        return height;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1622() {
        return this.f1261.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public int m1617() {
        return this.f1261.getResources().getDimensionPixelSize(C0066.abc_action_bar_stacked_tab_max_width);
    }
}
