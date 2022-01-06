package ♫;

import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: ♫.在  reason: contains not printable characters */
public final class C0396 {
    /* renamed from: θ  reason: contains not printable characters */
    public static Menu m1919(Context context, AbstractMenuC0280 supportMenu) {
        return new MenuC0397(context, supportMenu);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static MenuItem m1920(Context context, AbstractMenuItemC0287 supportMenuItem) {
        int i = Build.VERSION.SDK_INT;
        return new C0387(context, supportMenuItem);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static SubMenu m1921(Context context, AbstractSubMenuC0587 supportSubMenu) {
        return new SubMenuC0403(context, supportSubMenu);
    }
}
