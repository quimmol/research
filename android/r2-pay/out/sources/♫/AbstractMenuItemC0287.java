package ♫;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

/* renamed from: ♫.ⁱ  reason: contains not printable characters */
public interface AbstractMenuItemC0287 extends MenuItem {
    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);

    /* renamed from: Φ  reason: contains not printable characters */
    AbstractMenuItemC0287 m1274(CharSequence charSequence);

    /* renamed from: θ  reason: contains not printable characters */
    AbstractC0185 m1275();

    /* renamed from: θ  reason: contains not printable characters */
    AbstractMenuItemC0287 m1276(CharSequence charSequence);

    /* renamed from: θ  reason: contains not printable characters */
    AbstractMenuItemC0287 m1277(AbstractC0185 v);
}
