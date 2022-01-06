package ♫;

import android.content.Context;
import android.os.Build;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: ♫.ᑦ  reason: contains not printable characters */
public class C0204 {
    /* renamed from: θ  reason: contains not printable characters */
    public static Interpolator m938(Context context, int id) {
        int i = Build.VERSION.SDK_INT;
        return AnimationUtils.loadInterpolator(context, id);
    }
}
