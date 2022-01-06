package ♫;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;

/* renamed from: ♫.ʼ  reason: contains not printable characters */
public class C0101 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final Object f634 = new Object();

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m540(Context context, Intent[] intents, Bundle options) {
        int i = Build.VERSION.SDK_INT;
        context.startActivities(intents, options);
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Drawable m539(Context context, int id) {
        int i = Build.VERSION.SDK_INT;
        return context.getDrawable(id);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static ColorStateList m538(Context context, int id) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(id);
        }
        return context.getResources().getColorStateList(id);
    }
}
