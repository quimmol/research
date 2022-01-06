package ♫;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import ♫.C0375;

/* renamed from: ♫.大  reason: contains not printable characters */
public class SubMenuC0402 extends C0375 implements SubMenu {

    /* renamed from: Φ  reason: contains not printable characters */
    public C0380 f1524;

    /* renamed from: θ  reason: contains not printable characters */
    public C0375 f1525;

    public SubMenuC0402(Context context, C0375 parentMenu, C0380 item) {
        super(context);
        this.f1525 = parentMenu;
        this.f1524 = item;
    }

    @Override // ♫.C0375
    public void setQwertyMode(boolean isQwerty) {
        this.f1525.setQwertyMode(isQwerty);
    }

    @Override // ♫.C0375, ♫.C0375, ♫.C0375
    /* renamed from: ø  reason: contains not printable characters */
    public boolean m1943() {
        return this.f1525.m1779();
    }

    @Override // ♫.C0375, ♫.C0375
    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m1942() {
        return this.f1525.m1772();
    }

    @Override // ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375
    /* renamed from: θ  reason: contains not printable characters */
    public Menu m1946() {
        return this.f1525;
    }

    public MenuItem getItem() {
        return this.f1524;
    }

    @Override // ♫.C0375
    /* renamed from: θ  reason: contains not printable characters */
    public void m1949(C0375.AbstractC0377 callback) {
        this.f1525.m1813(callback);
    }

    @Override // ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375
    /* renamed from: θ  reason: contains not printable characters */
    public C0375 m1948() {
        return this.f1525.m1799();
    }

    @Override // ♫.C0375
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1950(C0375 menu, MenuItem item) {
        return super.m1820(menu, item) || this.f1525.m1820(menu, item);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable icon) {
        this.f1524.setIcon(icon);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int iconRes) {
        this.f1524.setIcon(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable icon) {
        super.m1801(icon);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int iconRes) {
        super.m1782(iconRes);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence title) {
        super.m1803(title);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int titleRes) {
        super.m1776(titleRes);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.m1802(view);
        return this;
    }

    @Override // ♫.C0375
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1945(C0380 item) {
        return this.f1525.m1788(item);
    }

    @Override // ♫.C0375
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1951(C0380 item) {
        return this.f1525.m1821(item);
    }

    @Override // ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375, ♫.C0375
    /* renamed from: θ  reason: contains not printable characters */
    public String m1947() {
        C0380 r0 = this.f1524;
        int itemId = r0 != null ? r0.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        super.m1797();
        sb.append("android:menu:actionviewstates");
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    @Override // ♫.C0375
    public void setGroupDividerEnabled(boolean groupDividerEnabled) {
        this.f1525.setGroupDividerEnabled(groupDividerEnabled);
    }

    @Override // ♫.C0375, ♫.C0375, ♫.C0375
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1944() {
        return this.f1525.m1787();
    }
}
