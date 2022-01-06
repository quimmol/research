package ♫;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ♫.AbstractC0185;
import ♫.AbstractC0394;

/* renamed from: ♫.唔  reason: contains not printable characters */
public final class C0380 implements AbstractMenuItemC0287 {

    /* renamed from: µ  reason: contains not printable characters */
    public int f1448 = 4096;

    /* renamed from: Ø  reason: contains not printable characters */
    public final int f1449;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public CharSequence f1450;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f1451 = false;

    /* renamed from: ö  reason: contains not printable characters */
    public int f1452 = 4096;

    /* renamed from: ø  reason: contains not printable characters */
    public final int f1453;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public CharSequence f1454;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f1455 = false;

    /* renamed from: Φ  reason: contains not printable characters */
    public char f1456;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final int f1457;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public CharSequence f1458;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1459 = false;

    /* renamed from: θ  reason: contains not printable characters */
    public char f1460;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final int f1461;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Intent f1462;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ColorStateList f1463 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public PorterDuff.Mode f1464 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f1465;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ContextMenu.ContextMenuInfo f1466;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public MenuItem.OnActionExpandListener f1467;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public MenuItem.OnMenuItemClickListener f1468;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f1469;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public CharSequence f1470;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Runnable f1471;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0185 f1472;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0375 f1473;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public SubMenuC0402 f1474;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1475 = false;

    /* renamed from: ฿  reason: contains not printable characters */
    public int f1476 = 16;

    /* renamed from: ₣  reason: contains not printable characters */
    public int f1477 = 0;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f1478 = 0;

    @Override // ♫.AbstractMenuItemC0287, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        m1847(i);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m1848(view);
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        m1838(charSequence);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        m1837(i);
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        m1849(charSequence);
        return this;
    }

    public C0380(C0375 menu, int group, int id, int categoryOrder, int ordering, CharSequence title, int showAsAction) {
        this.f1473 = menu;
        this.f1461 = id;
        this.f1457 = group;
        this.f1453 = categoryOrder;
        this.f1449 = ordering;
        this.f1470 = title;
        this.f1477 = showAsAction;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1840() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1468;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0375 r0 = this.f1473;
        if (r0.m1820(r0, this)) {
            return true;
        }
        Runnable runnable = this.f1471;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1462 != null) {
            try {
                this.f1473.m1791().startActivity(this.f1462);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        AbstractC0185 r02 = this.f1472;
        if (r02 == null || !r02.m898()) {
            return false;
        }
        return true;
    }

    public boolean isEnabled() {
        return (this.f1476 & 16) != 0;
    }

    public MenuItem setEnabled(boolean enabled) {
        if (enabled) {
            this.f1476 |= 16;
        } else {
            this.f1476 &= -17;
        }
        this.f1473.m1778(false);
        return this;
    }

    public int getGroupId() {
        return this.f1457;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1461;
    }

    public int getOrder() {
        return this.f1453;
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: θ  reason: contains not printable characters */
    public int m1842() {
        return this.f1449;
    }

    public Intent getIntent() {
        return this.f1462;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1462 = intent;
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.f1456;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        if (this.f1456 == alphaChar) {
            return this;
        }
        this.f1456 = Character.toLowerCase(alphaChar);
        this.f1473.m1778(false);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        if (this.f1456 == alphaChar && this.f1448 == alphaModifiers) {
            return this;
        }
        this.f1456 = Character.toLowerCase(alphaChar);
        this.f1448 = KeyEvent.normalizeMetaState(alphaModifiers);
        this.f1473.m1778(false);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public int getAlphabeticModifiers() {
        return this.f1448;
    }

    public char getNumericShortcut() {
        return this.f1460;
    }

    @Override // ♫.AbstractMenuItemC0287
    public int getNumericModifiers() {
        return this.f1452;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        if (this.f1460 == numericChar) {
            return this;
        }
        this.f1460 = numericChar;
        this.f1473.m1778(false);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        if (this.f1460 == numericChar && this.f1452 == numericModifiers) {
            return this;
        }
        this.f1460 = numericChar;
        this.f1452 = KeyEvent.normalizeMetaState(numericModifiers);
        this.f1473.m1778(false);
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        this.f1460 = numericChar;
        this.f1456 = Character.toLowerCase(alphaChar);
        this.f1473.m1778(false);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        this.f1460 = numericChar;
        this.f1452 = KeyEvent.normalizeMetaState(numericModifiers);
        this.f1456 = Character.toLowerCase(alphaChar);
        this.f1448 = KeyEvent.normalizeMetaState(alphaModifiers);
        this.f1473.m1778(false);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: θ  reason: contains not printable characters */
    public char m1841() {
        return this.f1473.m1779() ? this.f1456 : this.f1460;
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: θ  reason: contains not printable characters */
    public String m1845() {
        char shortcut = m1841();
        if (shortcut == 0) {
            return "";
        }
        Resources res = this.f1473.m1791().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1473.m1791()).hasPermanentMenuKey()) {
            sb.append(res.getString(C0180.abc_prepend_shortcut_label));
        }
        int modifiers = this.f1473.m1779() ? this.f1448 : this.f1452;
        m1830(sb, modifiers, 65536, res.getString(C0180.abc_menu_meta_shortcut_label));
        m1830(sb, modifiers, 4096, res.getString(C0180.abc_menu_ctrl_shortcut_label));
        m1830(sb, modifiers, 2, res.getString(C0180.abc_menu_alt_shortcut_label));
        m1830(sb, modifiers, 1, res.getString(C0180.abc_menu_shift_shortcut_label));
        m1830(sb, modifiers, 4, res.getString(C0180.abc_menu_sym_shortcut_label));
        m1830(sb, modifiers, 8, res.getString(C0180.abc_menu_function_shortcut_label));
        if (shortcut == '\b') {
            sb.append(res.getString(C0180.abc_menu_delete_shortcut_label));
        } else if (shortcut == '\n') {
            sb.append(res.getString(C0180.abc_menu_enter_shortcut_label));
        } else if (shortcut != ' ') {
            sb.append(shortcut);
        } else {
            sb.append(res.getString(C0180.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1830(StringBuilder sb, int modifiers, int flag, String label) {
        if ((modifiers & flag) == flag) {
            sb.append(label);
        }
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public boolean m1857() {
        return this.f1473.m1772() && m1841() != 0;
    }

    public SubMenu getSubMenu() {
        return this.f1474;
    }

    public boolean hasSubMenu() {
        return this.f1474 != null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1853(SubMenuC0402 subMenu) {
        this.f1474 = subMenu;
        subMenu.setHeaderTitle(getTitle());
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1470;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public CharSequence m1844(AbstractC0394.AbstractC0395 itemView) {
        if (itemView == null || !itemView.m1918()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        this.f1470 = title;
        this.f1473.m1778(false);
        SubMenuC0402 r0 = this.f1474;
        if (r0 != null) {
            r0.setHeaderTitle(title);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        setTitle(this.f1473.m1791().getString(title));
        return this;
    }

    public CharSequence getTitleCondensed() {
        CharSequence ctitle = this.f1458;
        if (ctitle == null) {
            ctitle = this.f1470;
        }
        int i = Build.VERSION.SDK_INT;
        return ctitle;
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        this.f1458 = title;
        if (title == null) {
            CharSequence title2 = this.f1470;
        }
        this.f1473.m1778(false);
        return this;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1465;
        if (drawable != null) {
            return m1843(drawable);
        }
        if (this.f1478 == 0) {
            return null;
        }
        Drawable icon = C0331.m1530(this.f1473.m1791(), this.f1478);
        this.f1478 = 0;
        this.f1465 = icon;
        return m1843(icon);
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        this.f1478 = 0;
        this.f1465 = icon;
        this.f1455 = true;
        this.f1473.m1778(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconResId) {
        this.f1465 = null;
        this.f1478 = iconResId;
        this.f1455 = true;
        this.f1473.m1778(false);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public MenuItem setIconTintList(ColorStateList iconTintList) {
        this.f1463 = iconTintList;
        this.f1475 = true;
        this.f1455 = true;
        this.f1473.m1778(false);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public ColorStateList getIconTintList() {
        return this.f1463;
    }

    @Override // ♫.AbstractMenuItemC0287
    public MenuItem setIconTintMode(PorterDuff.Mode iconTintMode) {
        this.f1464 = iconTintMode;
        this.f1459 = true;
        this.f1455 = true;
        this.f1473.m1778(false);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public PorterDuff.Mode getIconTintMode() {
        return this.f1464;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Drawable m1843(Drawable icon) {
        if (icon != null && this.f1455 && (this.f1475 || this.f1459)) {
            icon = C0171.m856(icon).mutate();
            if (this.f1475) {
                C0171.m861(icon, this.f1463);
            }
            if (this.f1459) {
                C0171.m864(icon, this.f1464);
            }
            this.f1455 = false;
        }
        return icon;
    }

    public boolean isCheckable() {
        return (this.f1476 & 1) == 1;
    }

    public MenuItem setCheckable(boolean checkable) {
        int oldFlags = this.f1476;
        this.f1476 = (this.f1476 & -2) | (checkable ? 1 : 0);
        if (oldFlags != this.f1476) {
            this.f1473.m1778(false);
        }
        return this;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m1835(boolean exclusive) {
        this.f1476 = (this.f1476 & -5) | (exclusive ? 4 : 0);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m1833() {
        return (this.f1476 & 4) != 0;
    }

    public boolean isChecked() {
        return (this.f1476 & 2) == 2;
    }

    public MenuItem setChecked(boolean checked) {
        if ((this.f1476 & 4) != 0) {
            this.f1473.m1811((MenuItem) this);
        } else {
            m1839(checked);
        }
        return this;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m1839(boolean checked) {
        int oldFlags = this.f1476;
        this.f1476 = (this.f1476 & -3) | (checked ? 2 : 0);
        if (oldFlags != this.f1476) {
            this.f1473.m1778(false);
        }
    }

    public boolean isVisible() {
        AbstractC0185 r0 = this.f1472;
        if (r0 == null || !r0.m897()) {
            if ((this.f1476 & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f1476 & 8) != 0 || !this.f1472.m899()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1856(boolean shown) {
        int oldFlags = this.f1476;
        this.f1476 = (this.f1476 & -9) | (shown ? 0 : 8);
        if (oldFlags != this.f1476) {
            return true;
        }
        return false;
    }

    public MenuItem setVisible(boolean shown) {
        if (m1856(shown)) {
            this.f1473.m1770();
        }
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener clickListener) {
        this.f1468 = clickListener;
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1470;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1852(ContextMenu.ContextMenuInfo menuInfo) {
        this.f1466 = menuInfo;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1466;
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: θ  reason: contains not printable characters */
    public void m1851() {
        this.f1473.m1777();
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public boolean m1859() {
        return this.f1473.m1817();
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m1836() {
        return (this.f1476 & 32) == 32;
    }

    /* renamed from: ö  reason: contains not printable characters */
    public boolean m1834() {
        return (this.f1477 & 1) == 1;
    }

    /* renamed from: µ  reason: contains not printable characters */
    public boolean m1831() {
        return (this.f1477 & 2) == 2;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m1832(boolean isActionButton) {
        if (isActionButton) {
            this.f1476 |= 32;
        } else {
            this.f1476 &= -33;
        }
    }

    /* renamed from: ₣  reason: contains not printable characters */
    public boolean m1858() {
        return (this.f1477 & 4) == 4;
    }

    @Override // ♫.AbstractMenuItemC0287
    public void setShowAsAction(int actionEnum) {
        int i = actionEnum & 3;
        if (i == 0 || i == 1 || i == 2) {
            this.f1477 = actionEnum;
            this.f1473.m1777();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractMenuItemC0287 m1848(View view) {
        int i;
        this.f1469 = view;
        this.f1472 = null;
        if (view != null && view.getId() == -1 && (i = this.f1461) > 0) {
            view.setId(i);
        }
        this.f1473.m1777();
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractMenuItemC0287 m1847(int resId) {
        Context context = this.f1473.m1791();
        m1848(LayoutInflater.from(context).inflate(resId, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public View getActionView() {
        View view = this.f1469;
        if (view != null) {
            return view;
        }
        AbstractC0185 r0 = this.f1472;
        if (r0 == null) {
            return null;
        }
        this.f1469 = r0.m901(this);
        return this.f1469;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0185 m1846() {
        return this.f1472;
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractMenuItemC0287 m1850(AbstractC0185 actionProvider) {
        AbstractC0185 r0 = this.f1472;
        if (r0 != null) {
            r0.m902();
        }
        this.f1469 = null;
        this.f1472 = actionProvider;
        this.f1473.m1778(true);
        AbstractC0185 r02 = this.f1472;
        if (r02 != null) {
            r02.m904(new C0381());
        }
        return this;
    }

    /* renamed from: ♫.唔$θ  reason: contains not printable characters */
    public class C0381 implements AbstractC0185.AbstractC0186 {
        public C0381() {
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1860(boolean isVisible) {
            C0380.this.f1473.m1770();
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public AbstractMenuItemC0287 m1837(int actionEnum) {
        setShowAsAction(actionEnum);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public boolean expandActionView() {
        if (!m1855()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1467;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1473.m1788(this);
        }
        return false;
    }

    @Override // ♫.AbstractMenuItemC0287
    public boolean collapseActionView() {
        if ((this.f1477 & 8) == 0) {
            return false;
        }
        if (this.f1469 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1467;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1473.m1821(this);
        }
        return false;
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1855() {
        AbstractC0185 r0;
        if ((this.f1477 & 8) == 0) {
            return false;
        }
        if (this.f1469 == null && (r0 = this.f1472) != null) {
            this.f1469 = r0.m901(this);
        }
        if (this.f1469 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1854(boolean isExpanded) {
        this.f1451 = isExpanded;
        this.f1473.m1778(false);
    }

    @Override // ♫.AbstractMenuItemC0287
    public boolean isActionViewExpanded() {
        return this.f1451;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        this.f1467 = listener;
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: Φ  reason: contains not printable characters */
    public AbstractMenuItemC0287 m1838(CharSequence contentDescription) {
        this.f1454 = contentDescription;
        this.f1473.m1778(false);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public CharSequence getContentDescription() {
        return this.f1454;
    }

    @Override // ♫.AbstractMenuItemC0287
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractMenuItemC0287 m1849(CharSequence tooltipText) {
        this.f1450 = tooltipText;
        this.f1473.m1778(false);
        return this;
    }

    @Override // ♫.AbstractMenuItemC0287
    public CharSequence getTooltipText() {
        return this.f1450;
    }
}
