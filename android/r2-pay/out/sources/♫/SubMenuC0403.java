package ♫;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: ♫.好  reason: contains not printable characters */
public class SubMenuC0403 extends MenuC0397 implements SubMenu {
    public SubMenuC0403(Context context, AbstractSubMenuC0587 subMenu) {
        super(context, subMenu);
    }

    @Override // ♫.AbstractC0364
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractSubMenuC0587 m1952() {
        return ((C0365) this).f1362;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int titleRes) {
        m1952().setHeaderTitle(titleRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence title) {
        m1952().setHeaderTitle(title);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int iconRes) {
        m1952().setHeaderIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable icon) {
        m1952().setHeaderIcon(icon);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        m1952().setHeaderView(view);
        return this;
    }

    public void clearHeader() {
        m1952().clearHeader();
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int iconRes) {
        m1952().setIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable icon) {
        m1952().setIcon(icon);
        return this;
    }

    public MenuItem getItem() {
        return m1720(m1952().getItem());
    }
}
