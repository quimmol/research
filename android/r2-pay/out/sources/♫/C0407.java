package ♫;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import ♫.AbstractC0185;
import ♫.AbstractC0392;
import ♫.AbstractC0394;

/* renamed from: ♫.学  reason: contains not printable characters */
public class C0407 extends AbstractC0363 implements AbstractC0185.AbstractC0187 {

    /* renamed from: µ  reason: contains not printable characters */
    public int f1538;

    /* renamed from: µ  reason: contains not printable characters and collision with other field name */
    public boolean f1539;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1540;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f1541;

    /* renamed from: ö  reason: contains not printable characters */
    public int f1542;

    /* renamed from: ö  reason: contains not printable characters and collision with other field name */
    public boolean f1543;

    /* renamed from: ø  reason: contains not printable characters */
    public int f1544;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f1545;

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean f1546;

    /* renamed from: θ  reason: contains not printable characters */
    public Drawable f1547;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final SparseBooleanArray f1548 = new SparseBooleanArray();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f1549;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0408 f1550 = new C0408();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0409 f1551;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0411 f1552;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public RunnableC0412 f1553;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0413 f1554;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0414 f1555;

    /* renamed from: ฿  reason: contains not printable characters */
    public boolean f1556;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f1557;

    /* renamed from: ₩  reason: contains not printable characters and collision with other field name */
    public boolean f1558;

    public C0407(Context context) {
        super(context, C0296.abc_action_menu_layout, C0296.abc_action_menu_item_layout);
    }

    @Override // ♫.AbstractC0363, ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1981(Context context, C0375 menu) {
        super.m1709(context, menu);
        Resources res = context.getResources();
        C0348 abp = C0348.m1615(context);
        if (!this.f1541) {
            abp.m1618();
            this.f1545 = true;
        }
        if (!this.f1558) {
            this.f1544 = abp.m1621();
        }
        if (!this.f1543) {
            this.f1542 = abp.m1619();
        }
        int width = this.f1544;
        if (this.f1545) {
            if (this.f1551 == null) {
                this.f1551 = new C0409(((AbstractC0363) this).f1354);
                if (this.f1546) {
                    this.f1551.setImageDrawable(this.f1547);
                    this.f1547 = null;
                    this.f1546 = false;
                }
                int spec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1551.measure(spec, spec);
            }
            width -= this.f1551.getMeasuredWidth();
        } else {
            this.f1551 = null;
        }
        this.f1540 = width;
        this.f1538 = (int) (res.getDisplayMetrics().density * 56.0f);
        this.f1549 = null;
    }

    @Override // ♫.AbstractC0363, ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1980() {
        if (!this.f1543) {
            this.f1542 = C0348.m1615(((AbstractC0363) this).f1352).m1619();
        }
        C0375 r0 = ((AbstractC0363) this).f1356;
        if (r0 != null) {
            r0.m1778(true);
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m1972(boolean reserveOverflow) {
        this.f1545 = reserveOverflow;
        this.f1541 = true;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m1974(boolean isExclusive) {
        this.f1556 = isExclusive;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1982(Drawable icon) {
        C0409 r0 = this.f1551;
        if (r0 != null) {
            r0.setImageDrawable(icon);
            return;
        }
        this.f1546 = true;
        this.f1547 = icon;
    }

    @Override // ♫.AbstractC0363, ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public Drawable m1976() {
        C0409 r0 = this.f1551;
        if (r0 != null) {
            return r0.getDrawable();
        }
        if (this.f1546) {
            return this.f1547;
        }
        return null;
    }

    @Override // ♫.AbstractC0363, ♫.AbstractC0363
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0394 m1979(ViewGroup root) {
        AbstractC0394 oldMenuView = ((AbstractC0363) this).f1358;
        AbstractC0394 result = super.m1707(root);
        if (oldMenuView != result) {
            ((ActionMenuView) result).setPresenter(this);
        }
        return result;
    }

    @Override // ♫.AbstractC0363
    /* renamed from: θ  reason: contains not printable characters */
    public View m1978(C0380 item, View convertView, ViewGroup parent) {
        View actionView = item.getActionView();
        if (actionView == null || item.m1855()) {
            actionView = super.m1704(item, convertView, parent);
        }
        actionView.setVisibility(item.isActionViewExpanded() ? 8 : 0);
        ActionMenuView menuParent = (ActionMenuView) parent;
        ViewGroup.LayoutParams lp = actionView.getLayoutParams();
        if (!menuParent.checkLayoutParams(lp)) {
            actionView.setLayoutParams(menuParent.m115(lp));
        }
        return actionView;
    }

    @Override // ♫.AbstractC0363
    /* renamed from: θ  reason: contains not printable characters */
    public void m1985(C0380 item, AbstractC0394.AbstractC0395 itemView) {
        itemView.m1917(item, 0);
        ActionMenuItemView actionItemView = (ActionMenuItemView) itemView;
        actionItemView.setItemInvoker((ActionMenuView) ((AbstractC0363) this).f1358);
        if (this.f1554 == null) {
            this.f1554 = new C0413();
        }
        actionItemView.setPopupCallback(this.f1554);
    }

    @Override // ♫.AbstractC0363
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1988(int childIndex, C0380 item) {
        return item.m1836();
    }

    @Override // ♫.AbstractC0363, ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1986(boolean cleared) {
        AbstractC0394 r3;
        super.m1714(cleared);
        ((View) ((AbstractC0363) this).f1358).requestLayout();
        C0375 r0 = ((AbstractC0363) this).f1356;
        if (r0 != null) {
            ArrayList<MenuItemImpl> actionItems = r0.m1798();
            int count = actionItems.size();
            for (int i = 0; i < count; i++) {
                AbstractC0185 provider = ((C0380) actionItems.get(i)).m1846();
                if (provider != null) {
                    provider.m905(this);
                }
            }
        }
        C0375 r02 = ((AbstractC0363) this).f1356;
        ArrayList<MenuItemImpl> nonActionItems = r02 != null ? r02.m1781() : null;
        boolean hasOverflow = false;
        if (this.f1545 && nonActionItems != null) {
            int count2 = nonActionItems.size();
            boolean z = false;
            if (count2 == 1) {
                hasOverflow = !((C0380) nonActionItems.get(0)).isActionViewExpanded();
            } else {
                if (count2 > 0) {
                    z = true;
                }
                hasOverflow = z;
            }
        }
        if (hasOverflow) {
            if (this.f1551 == null) {
                this.f1551 = new C0409(((AbstractC0363) this).f1354);
            }
            ViewGroup parent = (ViewGroup) this.f1551.getParent();
            if (parent != ((AbstractC0363) this).f1358) {
                if (parent != null) {
                    parent.removeView(this.f1551);
                }
                ActionMenuView menuView = (ActionMenuView) ((AbstractC0363) this).f1358;
                menuView.addView(this.f1551, menuView.m106());
            }
        } else {
            C0409 r2 = this.f1551;
            if (r2 != null && r2.getParent() == (r3 = ((AbstractC0363) this).f1358)) {
                ((ViewGroup) r3).removeView(this.f1551);
            }
        }
        ((ActionMenuView) ((AbstractC0363) this).f1358).setOverflowReserved(this.f1545);
    }

    @Override // ♫.AbstractC0363
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1989(ViewGroup parent, int childIndex) {
        if (parent.getChildAt(childIndex) == this.f1551) {
            return false;
        }
        super.m1716(parent, childIndex);
        return true;
    }

    @Override // ♫.AbstractC0363, ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1990(SubMenuC0402 subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        SubMenuC0402 topSubMenu = subMenu;
        while (topSubMenu.m1946() != ((AbstractC0363) this).f1356) {
            topSubMenu = (SubMenuC0402) topSubMenu.m1946();
        }
        View anchor = m1977(topSubMenu.getItem());
        if (anchor == null) {
            return false;
        }
        subMenu.getItem().getItemId();
        boolean preserveIconSpacing = false;
        int count = subMenu.size();
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            }
            MenuItem childItem = subMenu.getItem(i);
            if (childItem.isVisible() && childItem.getIcon() != null) {
                preserveIconSpacing = true;
                break;
            }
            i++;
        }
        this.f1555 = new C0414(((AbstractC0363) this).f1352, subMenu, anchor);
        this.f1555.m1903(preserveIconSpacing);
        this.f1555.m1892();
        super.m1718(subMenu);
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final View m1977(MenuItem item) {
        ViewGroup parent = (ViewGroup) ((AbstractC0363) this).f1358;
        if (parent == null) {
            return null;
        }
        int count = parent.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = parent.getChildAt(i);
            if ((child instanceof AbstractC0394.AbstractC0395) && ((AbstractC0394.AbstractC0395) child).getItemData() == item) {
                return child;
            }
        }
        return null;
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public boolean m1991() {
        C0375 r0;
        if (!this.f1545 || m1969() || (r0 = ((AbstractC0363) this).f1356) == null || ((AbstractC0363) this).f1358 == null || this.f1553 != null || r0.m1781().isEmpty()) {
            return false;
        }
        this.f1553 = new RunnableC0412(new C0411(((AbstractC0363) this).f1352, ((AbstractC0363) this).f1356, this.f1551, true));
        ((View) ((AbstractC0363) this).f1358).post(this.f1553);
        super.m1718((SubMenuC0402) null);
        return true;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m1973() {
        AbstractC0394 r2;
        RunnableC0412 r0 = this.f1553;
        if (r0 == null || (r2 = ((AbstractC0363) this).f1358) == null) {
            C0390 popup = this.f1552;
            if (popup == null) {
                return false;
            }
            popup.m1897();
            return true;
        }
        ((View) r2).removeCallbacks(r0);
        this.f1553 = null;
        return true;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1975() {
        return m1973() | m1970();
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m1970() {
        C0414 r0 = this.f1555;
        if (r0 == null) {
            return false;
        }
        r0.m1897();
        return true;
    }

    /* renamed from: µ  reason: contains not printable characters */
    public boolean m1969() {
        C0411 r0 = this.f1552;
        return r0 != null && r0.m1904();
    }

    /* renamed from: ö  reason: contains not printable characters */
    public boolean m1971() {
        return this.f1553 != null || m1969();
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0171  */
    @Override // ♫.AbstractC0363, ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m1987() {
        /*
        // Method dump skipped, instructions count: 409
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0407.m1987():boolean");
    }

    @Override // ♫.AbstractC0363, ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1984(C0375 menu, boolean allMenusAreClosing) {
        m1975();
        super.m1711(menu, allMenusAreClosing);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1983(ActionMenuView menuView) {
        ((AbstractC0363) this).f1358 = menuView;
        menuView.m116(((AbstractC0363) this).f1356);
    }

    /* renamed from: ♫.学$Ø  reason: contains not printable characters */
    public class C0409 extends C0431 implements ActionMenuView.AbstractC0025 {
        public C0409(Context context) {
            super(context, null, C0158.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0492.m2353(this, getContentDescription());
            setOnTouchListener(new C0410(this, C0407.this));
        }

        /* renamed from: ♫.学$Ø$θ  reason: contains not printable characters */
        public class C0410 extends AbstractView$OnTouchListenerC0458 {
            public C0410(View src, C0407 r3) {
                super(src);
            }

            @Override // ♫.AbstractView$OnTouchListenerC0458, ♫.AbstractView$OnTouchListenerC0458, ♫.AbstractView$OnTouchListenerC0458
            /* renamed from: θ  reason: contains not printable characters */
            public AbstractC0398 m1997() {
                C0411 r0 = C0407.this.f1552;
                if (r0 == null) {
                    return null;
                }
                return r0.m1893();
            }

            @Override // ♫.AbstractView$OnTouchListenerC0458, ♫.AbstractView$OnTouchListenerC0458, ♫.AbstractView$OnTouchListenerC0458
            /* renamed from: θ  reason: contains not printable characters */
            public boolean m1998() {
                C0407.this.m1991();
                return true;
            }

            @Override // ♫.AbstractView$OnTouchListenerC0458, ♫.AbstractView$OnTouchListenerC0458
            /* renamed from: Φ  reason: contains not printable characters */
            public boolean m1996() {
                C0407 r0 = C0407.this;
                if (r0.f1553 != null) {
                    return false;
                }
                r0.m1973();
                return true;
            }
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0407.this.m1991();
            return true;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0025
        /* renamed from: ø  reason: contains not printable characters */
        public boolean m1994() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0025
        /* renamed from: Φ  reason: contains not printable characters */
        public boolean m1995() {
            return false;
        }

        public boolean setFrame(int l, int t, int r, int b) {
            boolean changed = super.setFrame(l, t, r, b);
            Drawable d = getDrawable();
            Drawable bg = getBackground();
            if (!(d == null || bg == null)) {
                int width = getWidth();
                int height = getHeight();
                int halfEdge = Math.max(width, height) / 2;
                int offsetX = getPaddingLeft() - getPaddingRight();
                int centerX = (width + offsetX) / 2;
                int centerY = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0171.m860(bg, centerX - halfEdge, centerY - halfEdge, centerX + halfEdge, centerY + halfEdge);
            }
            return changed;
        }
    }

    /* renamed from: ♫.学$ö  reason: contains not printable characters */
    public class C0411 extends C0390 {
        public C0411(Context context, C0375 menu, View anchorView, boolean overflowOnly) {
            super(context, menu, anchorView, overflowOnly, C0158.actionOverflowMenuStyle);
            m1898(8388613);
            m1902(C0407.this.f1550);
        }

        @Override // ♫.C0390, ♫.C0390, ♫.C0390
        /* renamed from: Φ  reason: contains not printable characters */
        public void m1999() {
            if (((AbstractC0363) C0407.this).f1356 != null) {
                ((AbstractC0363) C0407.this).f1356.close();
            }
            C0407.this.f1552 = null;
            super.m1894();
        }
    }

    /* renamed from: ♫.学$θ  reason: contains not printable characters */
    public class C0414 extends C0390 {
        public C0414(Context context, SubMenuC0402 subMenu, View anchorView) {
            super(context, subMenu, anchorView, false, C0158.actionOverflowMenuStyle);
            if (!((C0380) subMenu.getItem()).m1836()) {
                View view = C0407.this.f1551;
                m1900(view == null ? (View) ((AbstractC0363) C0407.this).f1358 : view);
            }
            m1902(C0407.this.f1550);
        }

        @Override // ♫.C0390, ♫.C0390, ♫.C0390
        /* renamed from: Φ  reason: contains not printable characters */
        public void m2001() {
            C0407 r0 = C0407.this;
            r0.f1555 = null;
            r0.f1557 = 0;
            super.m1894();
        }
    }

    /* renamed from: ♫.学$µ  reason: contains not printable characters */
    public class C0408 implements AbstractC0392.AbstractC0393 {
        public C0408() {
        }

        @Override // ♫.AbstractC0392.AbstractC0393
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1993(C0375 subMenu) {
            if (subMenu == null) {
                return false;
            }
            C0407.this.f1557 = ((SubMenuC0402) subMenu).getItem().getItemId();
            AbstractC0392.AbstractC0393 cb = C0407.this.m1705();
            if (cb != null) {
                return cb.m1915(subMenu);
            }
            return false;
        }

        @Override // ♫.AbstractC0392.AbstractC0393
        /* renamed from: θ  reason: contains not printable characters */
        public void m1992(C0375 menu, boolean allMenusAreClosing) {
            if (menu instanceof SubMenuC0402) {
                menu.m1799().m1816(false);
            }
            AbstractC0392.AbstractC0393 cb = C0407.this.m1705();
            if (cb != null) {
                cb.m1914(menu, allMenusAreClosing);
            }
        }
    }

    /* renamed from: ♫.学$ø  reason: contains not printable characters */
    public class RunnableC0412 implements Runnable {

        /* renamed from: θ  reason: contains not printable characters */
        public C0411 f1563;

        public RunnableC0412(C0411 popup) {
            this.f1563 = popup;
        }

        public void run() {
            if (((AbstractC0363) C0407.this).f1356 != null) {
                ((AbstractC0363) C0407.this).f1356.m1807();
            }
            View menuView = (View) ((AbstractC0363) C0407.this).f1358;
            if (!(menuView == null || menuView.getWindowToken() == null || !this.f1563.m1895())) {
                C0407.this.f1552 = this.f1563;
            }
            C0407.this.f1553 = null;
        }
    }

    /* renamed from: ♫.学$Φ  reason: contains not printable characters */
    public class C0413 extends ActionMenuItemView.AbstractC0013 {
        public C0413() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0013
        /* renamed from: θ  reason: contains not printable characters */
        public AbstractC0398 m2000() {
            C0414 r0 = C0407.this.f1555;
            if (r0 != null) {
                return r0.m1893();
            }
            return null;
        }
    }
}
