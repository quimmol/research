package ♫;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: ♫.华  reason: contains not printable characters */
public class C0362 implements AbstractMenuItemC0287 {

    /* renamed from: µ  reason: contains not printable characters */
    public int f1332 = 16;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1333 = 4096;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public CharSequence f1334;

    /* renamed from: ö  reason: contains not printable characters */
    public int f1335 = 4096;

    /* renamed from: ø  reason: contains not printable characters */
    public final int f1336;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public CharSequence f1337;

    /* renamed from: Φ  reason: contains not printable characters */
    public char f1338;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final int f1339;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public CharSequence f1340;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1341 = false;

    /* renamed from: θ  reason: contains not printable characters */
    public char f1342;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final int f1343;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Context f1344;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Intent f1345;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ColorStateList f1346 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public PorterDuff.Mode f1347 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f1348;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public CharSequence f1349;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1350 = false;

    @Override // ♫.AbstractMenuItemC0287, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        m1695();
        throw null;
    }

    @Override // ♫.AbstractMenuItemC0287, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m1698();
        throw null;
    }

    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        m1696(charSequence);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        m1699(i);
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        m1700(charSequence);
        return this;
    }

    public C0362(Context context, int group, int id, int categoryOrder, int ordering, CharSequence title) {
        this.f1344 = context;
        this.f1343 = id;
        this.f1339 = group;
        this.f1336 = ordering;
        this.f1349 = title;
    }

    public char getAlphabeticShortcut() {
        return this.f1338;
    }

    @Override // ♫.AbstractMenuItemC0287
    public int getAlphabeticModifiers() {
        return this.f1335;
    }

    public int getGroupId() {
        return this.f1339;
    }

    public Drawable getIcon() {
        return this.f1348;
    }

    public Intent getIntent() {
        return this.f1345;
    }

    public int getItemId() {
        return this.f1343;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.f1342;
    }

    @Override // ♫.AbstractMenuItemC0287
    public int getNumericModifiers() {
        return this.f1333;
    }

    public int getOrder() {
        return this.f1336;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f1349;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1340;
        return charSequence != null ? charSequence : this.f1349;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f1332 & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f1332 & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f1332 & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1332 & 8) == 0;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        this.f1338 = Character.toLowerCase(alphaChar);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        this.f1338 = Character.toLowerCase(alphaChar);
        this.f1335 = KeyEvent.normalizeMetaState(alphaModifiers);
        return this;
    }

    public MenuItem setCheckable(boolean checkable) {
        this.f1332 = (this.f1332 & -2) | (checkable ? 1 : 0);
        return this;
    }

    public MenuItem setChecked(boolean checked) {
        this.f1332 = (this.f1332 & -3) | (checked ? 2 : 0);
        return this;
    }

    public MenuItem setEnabled(boolean enabled) {
        this.f1332 = (this.f1332 & -17) | (enabled ? 16 : 0);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.f1348 = icon;
        m1702();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconRes) {
        this.f1348 = C0101.m539(this.f1344, iconRes);
        m1702();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1345 = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        this.f1342 = numericChar;
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        this.f1342 = numericChar;
        this.f1333 = KeyEvent.normalizeMetaState(numericModifiers);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f1342 = numericChar;
        this.f1338 = Character.toLowerCase(alphaChar);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f1342 = numericChar;
        this.f1333 = KeyEvent.normalizeMetaState(numericModifiers);
        this.f1338 = Character.toLowerCase(alphaChar);
        this.f1335 = KeyEvent.normalizeMetaState(alphaModifiers);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f1349 = title;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        this.f1349 = this.f1344.getResources().getString(title);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f1340 = title;
        return this;
    }

    public MenuItem setVisible(boolean visible) {
        int i = 8;
        int i2 = this.f1332 & 8;
        if (visible) {
            i = 0;
        }
        this.f1332 = i2 | i;
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public void setShowAsAction(int show) {
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractMenuItemC0287 m1698() {
        throw new UnsupportedOperationException();
    }

    @Override // ♫.AbstractMenuItemC0287
    public View getActionView() {
        return null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public AbstractMenuItemC0287 m1695() {
        throw new UnsupportedOperationException();
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0185 m1697() {
        return null;
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractMenuItemC0287 m1701(AbstractC0185 actionProvider) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractMenuItemC0287 m1699(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public boolean expandActionView() {
        return false;
    }

    @Override // ♫.AbstractMenuItemC0287
    public boolean collapseActionView() {
        return false;
    }

    @Override // ♫.AbstractMenuItemC0287
    public boolean isActionViewExpanded() {
        return false;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        throw new UnsupportedOperationException();
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: Φ  reason: contains not printable characters */
    public AbstractMenuItemC0287 m1696(CharSequence contentDescription) {
        this.f1337 = contentDescription;
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public CharSequence getContentDescription() {
        return this.f1337;
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractMenuItemC0287 m1700(CharSequence tooltipText) {
        this.f1334 = tooltipText;
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public CharSequence getTooltipText() {
        return this.f1334;
    }

    @Override // ♫.AbstractMenuItemC0287
    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.f1346 = iconTintList;
        this.f1350 = true;
        m1702();
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public ColorStateList getIconTintList() {
        return this.f1346;
    }

    @Override // ♫.AbstractMenuItemC0287
    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.f1347 = iconTintMode;
        this.f1341 = true;
        m1702();
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public PorterDuff.Mode getIconTintMode() {
        return this.f1347;
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: θ  reason: contains not printable characters */
    public final void m1702() {
        if (this.f1348 == null) {
            return;
        }
        if (this.f1350 || this.f1341) {
            this.f1348 = C0171.m856(this.f1348);
            this.f1348 = this.f1348.mutate();
            if (this.f1350) {
                C0171.m861(this.f1348, this.f1346);
            }
            if (this.f1341) {
                C0171.m864(this.f1348, this.f1347);
            }
        }
    }
}
