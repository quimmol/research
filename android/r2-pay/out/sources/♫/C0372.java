package ♫;

import android.content.Context;
import android.os.IBinder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;
import ♫.AbstractC0392;
import ♫.AbstractC0394;

/* renamed from: ♫.吼  reason: contains not printable characters */
public class C0372 implements AbstractC0392, AdapterView.OnItemClickListener {

    /* renamed from: ø  reason: contains not printable characters */
    public int f1400;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1401;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1402;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Context f1403;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public LayoutInflater f1404;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ExpandedMenuView f1405;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0373 f1406;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0375 f1407;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0392.AbstractC0393 f1408;

    public C0372(Context context, int itemLayoutRes) {
        this(itemLayoutRes, 0);
        this.f1403 = context;
        this.f1404 = LayoutInflater.from(this.f1403);
    }

    public C0372(int itemLayoutRes, int themeRes) {
        this.f1400 = itemLayoutRes;
        this.f1401 = themeRes;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1754(Context context, C0375 menu) {
        int i = this.f1401;
        if (i != 0) {
            this.f1403 = new ContextThemeWrapper(context, i);
            this.f1404 = LayoutInflater.from(this.f1403);
        } else if (this.f1403 != null) {
            this.f1403 = context;
            if (this.f1404 == null) {
                this.f1404 = LayoutInflater.from(this.f1403);
            }
        }
        this.f1407 = menu;
        C0373 r0 = this.f1406;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0394 m1753(ViewGroup root) {
        if (this.f1405 == null) {
            this.f1405 = (ExpandedMenuView) this.f1404.inflate(C0296.abc_expanded_menu_layout, root, false);
            if (this.f1406 == null) {
                this.f1406 = new C0373();
            }
            this.f1405.setAdapter((ListAdapter) this.f1406);
            this.f1405.setOnItemClickListener(this);
        }
        return this.f1405;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public ListAdapter m1752() {
        if (this.f1406 == null) {
            this.f1406 = new C0373();
        }
        return this.f1406;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1757(boolean cleared) {
        C0373 r0 = this.f1406;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1756(AbstractC0392.AbstractC0393 cb) {
        this.f1408 = cb;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1760(SubMenuC0402 subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        new DialogInterface$OnKeyListenerC0378(subMenu).m1827((IBinder) null);
        AbstractC0392.AbstractC0393 r0 = this.f1408;
        if (r0 == null) {
            return true;
        }
        r0.m1915(subMenu);
        return true;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1755(C0375 menu, boolean allMenusAreClosing) {
        AbstractC0392.AbstractC0393 r0 = this.f1408;
        if (r0 != null) {
            r0.m1914(menu, allMenusAreClosing);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        this.f1407.m1819(this.f1406.getItem(position), this, 0);
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1758() {
        return false;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1751(C0375 menu, C0380 item) {
        return false;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1759(C0375 menu, C0380 item) {
        return false;
    }

    /* renamed from: ♫.吼$θ  reason: contains not printable characters */
    public class C0373 extends BaseAdapter {

        /* renamed from: θ  reason: contains not printable characters */
        public int f1409 = -1;

        public C0373() {
            m1762();
        }

        public int getCount() {
            int count = C0372.this.f1407.m1781().size() - C0372.this.f1402;
            if (this.f1409 < 0) {
                return count;
            }
            return count - 1;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0380 getItem(int position) {
            ArrayList<MenuItemImpl> items = C0372.this.f1407.m1781();
            int position2 = position + C0372.this.f1402;
            int i = this.f1409;
            if (i >= 0 && position2 >= i) {
                position2++;
            }
            return (C0380) items.get(position2);
        }

        public long getItemId(int position) {
            return (long) position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                C0372 r1 = C0372.this;
                convertView = r1.f1404.inflate(r1.f1400, parent, false);
            }
            ((AbstractC0394.AbstractC0395) convertView).m1917(getItem(position), 0);
            return convertView;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1762() {
            C0380 expandedItem = C0372.this.f1407.m1804();
            if (expandedItem != null) {
                ArrayList<MenuItemImpl> items = C0372.this.f1407.m1781();
                int count = items.size();
                for (int i = 0; i < count; i++) {
                    if (((C0380) items.get(i)) == expandedItem) {
                        this.f1409 = i;
                        return;
                    }
                }
            }
            this.f1409 = -1;
        }

        public void notifyDataSetChanged() {
            m1762();
            super.notifyDataSetChanged();
        }
    }
}
