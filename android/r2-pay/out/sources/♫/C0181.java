package ♫;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: ♫.เ  reason: contains not printable characters */
public final class C0181 {

    /* renamed from: θ  reason: contains not printable characters */
    public static Field f796;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static boolean f797;

    /* renamed from: θ  reason: contains not printable characters */
    public static void m886(CompoundButton button, ColorStateList tint) {
        int i = Build.VERSION.SDK_INT;
        button.setButtonTintList(tint);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m887(CompoundButton button, PorterDuff.Mode tintMode) {
        int i = Build.VERSION.SDK_INT;
        button.setButtonTintMode(tintMode);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Drawable m885(CompoundButton button) {
        if (Build.VERSION.SDK_INT >= 23) {
            return button.getButtonDrawable();
        }
        if (!f797) {
            try {
                f796 = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f796.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f797 = true;
        }
        Field field = f796;
        if (field != null) {
            try {
                return (Drawable) field.get(button);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f796 = null;
            }
        }
        return null;
    }
}
