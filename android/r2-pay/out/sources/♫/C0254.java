package ♫;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.view.ViewConfiguration;

/* renamed from: ♫.ᴶ  reason: contains not printable characters */
public final class C0254 {
    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception e) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m1174(ViewConfiguration config) {
        if (Build.VERSION.SDK_INT >= 28) {
            return config.getScaledHoverSlop();
        }
        return config.getScaledTouchSlop() / 2;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m1175(ViewConfiguration config, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return config.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources res = context.getResources();
        int platformResId = res.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return platformResId != 0 && res.getBoolean(platformResId);
    }
}
