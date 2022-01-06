package ♫;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: ♫.啊  reason: contains not printable characters */
public class MenuItemC0382 extends AbstractC0364<AbstractMenuItemC0287> implements MenuItem {

    /* renamed from: θ  reason: contains not printable characters */
    public Method f1480;

    public MenuItemC0382(Context context, AbstractMenuItemC0287 object) {
        super(context, object);
    }

    public int getItemId() {
        return ((C0365) this).f1362.getItemId();
    }

    public int getGroupId() {
        return ((C0365) this).f1362.getGroupId();
    }

    public int getOrder() {
        return ((C0365) this).f1362.getOrder();
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence title) {
        ((C0365) this).f1362.setTitle(title);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int title) {
        ((C0365) this).f1362.setTitle(title);
        return this;
    }

    public CharSequence getTitle() {
        return ((C0365) this).f1362.getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence title) {
        ((C0365) this).f1362.setTitleCondensed(title);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return ((C0365) this).f1362.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable icon) {
        ((C0365) this).f1362.setIcon(icon);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int iconRes) {
        ((C0365) this).f1362.setIcon(iconRes);
        return this;
    }

    public Drawable getIcon() {
        return ((C0365) this).f1362.getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        ((C0365) this).f1362.setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return ((C0365) this).f1362.getIntent();
    }

    public MenuItem setShortcut(char numericChar, char alphaChar) {
        ((C0365) this).f1362.setShortcut(numericChar, alphaChar);
        return this;
    }

    public MenuItem setShortcut(char numericChar, char alphaChar, int numericModifiers, int alphaModifiers) {
        ((C0365) this).f1362.setShortcut(numericChar, alphaChar, numericModifiers, alphaModifiers);
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar) {
        ((C0365) this).f1362.setNumericShortcut(numericChar);
        return this;
    }

    public MenuItem setNumericShortcut(char numericChar, int numericModifiers) {
        ((C0365) this).f1362.setNumericShortcut(numericChar, numericModifiers);
        return this;
    }

    public char getNumericShortcut() {
        return ((C0365) this).f1362.getNumericShortcut();
    }

    public int getNumericModifiers() {
        return ((C0365) this).f1362.getNumericModifiers();
    }

    public MenuItem setAlphabeticShortcut(char alphaChar) {
        ((C0365) this).f1362.setAlphabeticShortcut(alphaChar);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char alphaChar, int alphaModifiers) {
        ((C0365) this).f1362.setAlphabeticShortcut(alphaChar, alphaModifiers);
        return this;
    }

    public char getAlphabeticShortcut() {
        return ((C0365) this).f1362.getAlphabeticShortcut();
    }

    public int getAlphabeticModifiers() {
        return ((C0365) this).f1362.getAlphabeticModifiers();
    }

    public MenuItem setCheckable(boolean checkable) {
        ((C0365) this).f1362.setCheckable(checkable);
        return this;
    }

    public boolean isCheckable() {
        return ((C0365) this).f1362.isCheckable();
    }

    public MenuItem setChecked(boolean checked) {
        ((C0365) this).f1362.setChecked(checked);
        return this;
    }

    public boolean isChecked() {
        return ((C0365) this).f1362.isChecked();
    }

    public MenuItem setVisible(boolean visible) {
        return ((C0365) this).f1362.setVisible(visible);
    }

    public boolean isVisible() {
        return ((C0365) this).f1362.isVisible();
    }

    public MenuItem setEnabled(boolean enabled) {
        ((C0365) this).f1362.setEnabled(enabled);
        return this;
    }

    public boolean isEnabled() {
        return ((C0365) this).f1362.isEnabled();
    }

    public boolean hasSubMenu() {
        return ((C0365) this).f1362.hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return m1721(((C0365) this).f1362.getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener menuItemClickListener) {
        ((C0365) this).f1362.setOnMenuItemClickListener(menuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC0383(menuItemClickListener) : null);
        return this;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((C0365) this).f1362.getMenuInfo();
    }

    public void setShowAsAction(int actionEnum) {
        ((C0365) this).f1362.setShowAsAction(actionEnum);
    }

    public MenuItem setShowAsActionFlags(int actionEnum) {
        ((C0365) this).f1362.setShowAsActionFlags(actionEnum);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0385(view);
        }
        ((C0365) this).f1362.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int resId) {
        ((C0365) this).f1362.setActionView(resId);
        View actionView = ((C0365) this).f1362.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0365) this).f1362.setActionView(new C0385(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = ((C0365) this).f1362.getActionView();
        if (actionView instanceof C0385) {
            return ((C0385) actionView).m1864();
        }
        return actionView;
    }

    public MenuItem setActionProvider(ActionProvider provider) {
        ((C0365) this).f1362.m1277(provider != null ? m1861(provider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        AbstractC0185 provider = ((C0365) this).f1362.m1275();
        if (provider instanceof C0386) {
            return ((C0386) provider).f1484;
        }
        return null;
    }

    public boolean expandActionView() {
        return ((C0365) this).f1362.expandActionView();
    }

    public boolean collapseActionView() {
        return ((C0365) this).f1362.collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return ((C0365) this).f1362.isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener listener) {
        ((C0365) this).f1362.setOnActionExpandListener(listener != null ? new MenuItem$OnActionExpandListenerC0384(listener) : null);
        return this;
    }

    public MenuItem setContentDescription(CharSequence contentDescription) {
        ((C0365) this).f1362.m1274(contentDescription);
        return this;
    }

    public CharSequence getContentDescription() {
        return ((C0365) this).f1362.getContentDescription();
    }

    public MenuItem setTooltipText(CharSequence tooltipText) {
        ((C0365) this).f1362.m1276(tooltipText);
        return this;
    }

    public CharSequence getTooltipText() {
        return ((C0365) this).f1362.getTooltipText();
    }

    public MenuItem setIconTintList(ColorStateList tint) {
        ((C0365) this).f1362.setIconTintList(tint);
        return this;
    }

    public ColorStateList getIconTintList() {
        return ((C0365) this).f1362.getIconTintList();
    }

    public MenuItem setIconTintMode(PorterDuff.Mode tintMode) {
        ((C0365) this).f1362.setIconTintMode(tintMode);
        return this;
    }

    public PorterDuff.Mode getIconTintMode() {
        return ((C0365) this).f1362.getIconTintMode();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1862(boolean checkable) {
        try {
            if (this.f1480 == null) {
                this.f1480 = ((C0365) this).f1362.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f1480.invoke(((C0365) this).f1362, Boolean.valueOf(checkable));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0386 m1861(ActionProvider provider) {
        return new C0386(((AbstractC0364) this).f1360, provider);
    }

    /* renamed from: ♫.啊$Ø  reason: contains not printable characters */
    public class MenuItem$OnMenuItemClickListenerC0383 extends C0365<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        public MenuItem$OnMenuItemClickListenerC0383(MenuItem.OnMenuItemClickListener object) {
            super(object);
        }

        public boolean onMenuItemClick(MenuItem item) {
            return super.f1362.onMenuItemClick(MenuItemC0382.this.m1720(item));
        }
    }

    /* renamed from: ♫.啊$ø  reason: contains not printable characters */
    public class MenuItem$OnActionExpandListenerC0384 extends C0365<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        public MenuItem$OnActionExpandListenerC0384(MenuItem.OnActionExpandListener object) {
            super(object);
        }

        public boolean onMenuItemActionExpand(MenuItem item) {
            return super.f1362.onMenuItemActionExpand(MenuItemC0382.this.m1720(item));
        }

        public boolean onMenuItemActionCollapse(MenuItem item) {
            return super.f1362.onMenuItemActionCollapse(MenuItemC0382.this.m1720(item));
        }
    }

    /* renamed from: ♫.啊$θ  reason: contains not printable characters */
    public class C0386 extends AbstractC0185 {

        /* renamed from: θ  reason: contains not printable characters */
        public final ActionProvider f1484;

        public C0386(Context context, ActionProvider inner) {
            super(context);
            this.f1484 = inner;
        }

        @Override // ♫.AbstractC0185, ♫.AbstractC0185, ♫.AbstractC0185
        /* renamed from: θ  reason: contains not printable characters */
        public View m1867() {
            return this.f1484.onCreateActionView();
        }

        @Override // ♫.AbstractC0185
        /* renamed from: ø  reason: contains not printable characters */
        public boolean m1866() {
            return this.f1484.onPerformDefaultAction();
        }

        @Override // ♫.AbstractC0185, ♫.AbstractC0185, ♫.AbstractC0185
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1869() {
            return this.f1484.hasSubMenu();
        }

        @Override // ♫.AbstractC0185
        /* renamed from: θ  reason: contains not printable characters */
        public void m1868(SubMenu subMenu) {
            this.f1484.onPrepareSubMenu(MenuItemC0382.this.m1721(subMenu));
        }
    }

    /* renamed from: ♫.啊$Φ  reason: contains not printable characters */
    public static class C0385 extends FrameLayout implements AbstractC0351 {

        /* renamed from: θ  reason: contains not printable characters */
        public final CollapsibleActionView f1483;

        public C0385(View actionView) {
            super(actionView.getContext());
            this.f1483 = (CollapsibleActionView) actionView;
            addView(actionView);
        }

        @Override // ♫.AbstractC0351
        /* renamed from: Φ  reason: contains not printable characters */
        public void m1863() {
            this.f1483.onActionViewExpanded();
        }

        @Override // ♫.AbstractC0351
        /* renamed from: θ  reason: contains not printable characters */
        public void m1865() {
            this.f1483.onActionViewCollapsed();
        }

        @Override // ♫.AbstractC0351
        /* renamed from: θ  reason: contains not printable characters */
        public View m1864() {
            return (View) this.f1483;
        }
    }
}
