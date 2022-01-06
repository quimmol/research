package ♫;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;

/* renamed from: ♫.ᵕ  reason: contains not printable characters */
public final class C0270 {
    /* renamed from: θ  reason: contains not printable characters */
    public static MenuItem m1225(MenuItem item, AbstractC0185 provider) {
        if (item instanceof AbstractMenuItemC0287) {
            return ((AbstractMenuItemC0287) item).m1277(provider);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return item;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1229(MenuItem item, CharSequence contentDescription) {
        if (item instanceof AbstractMenuItemC0287) {
            ((AbstractMenuItemC0287) item).m1274(contentDescription);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setContentDescription(contentDescription);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static void m1224(MenuItem item, CharSequence tooltipText) {
        if (item instanceof AbstractMenuItemC0287) {
            ((AbstractMenuItemC0287) item).m1276(tooltipText);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setTooltipText(tooltipText);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static void m1223(MenuItem item, char numericChar, int numericModifiers) {
        if (item instanceof AbstractMenuItemC0287) {
            ((AbstractMenuItemC0287) item).setNumericShortcut(numericChar, numericModifiers);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setNumericShortcut(numericChar, numericModifiers);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1226(MenuItem item, char alphaChar, int alphaModifiers) {
        if (item instanceof AbstractMenuItemC0287) {
            ((AbstractMenuItemC0287) item).setAlphabeticShortcut(alphaChar, alphaModifiers);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setAlphabeticShortcut(alphaChar, alphaModifiers);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1227(MenuItem item, ColorStateList tint) {
        if (item instanceof AbstractMenuItemC0287) {
            ((AbstractMenuItemC0287) item).setIconTintList(tint);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setIconTintList(tint);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1228(MenuItem item, PorterDuff.Mode tintMode) {
        if (item instanceof AbstractMenuItemC0287) {
            ((AbstractMenuItemC0287) item).setIconTintMode(tintMode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            item.setIconTintMode(tintMode);
        }
    }
}
