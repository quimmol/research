package ♫;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;
import ♫.AbstractC0392;
import ♫.AbstractC0394;

/* renamed from: ♫.去  reason: contains not printable characters */
public abstract class AbstractC0363 implements AbstractC0392 {

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1351;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Context f1352;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1353;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Context f1354;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public LayoutInflater f1355;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0375 f1356;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0392.AbstractC0393 f1357;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0394 f1358;

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1712(C0380 v, AbstractC0394.AbstractC0395 v2);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract boolean m1715(int i, C0380 v);

    public AbstractC0363(Context context, int menuLayoutRes, int itemLayoutRes) {
        this.f1354 = context;
        this.f1355 = LayoutInflater.from(context);
        this.f1353 = menuLayoutRes;
        this.f1351 = itemLayoutRes;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1709(Context context, C0375 menu) {
        this.f1352 = context;
        LayoutInflater.from(this.f1352);
        this.f1356 = menu;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0394 m1707(ViewGroup root) {
        if (this.f1358 == null) {
            this.f1358 = (AbstractC0394) this.f1355.inflate(this.f1353, root, false);
            this.f1358.m1916(this.f1356);
            m1714(true);
        }
        return this.f1358;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1714(boolean cleared) {
        ViewGroup parent = (ViewGroup) this.f1358;
        if (parent != null) {
            int childIndex = 0;
            C0375 r2 = this.f1356;
            if (r2 != null) {
                r2.m1783();
                ArrayList<MenuItemImpl> visibleItems = this.f1356.m1775();
                int itemCount = visibleItems.size();
                for (int i = 0; i < itemCount; i++) {
                    C0380 item = (C0380) visibleItems.get(i);
                    if (m1715(childIndex, item)) {
                        View convertView = parent.getChildAt(childIndex);
                        C0380 oldItem = convertView instanceof AbstractC0394.AbstractC0395 ? ((AbstractC0394.AbstractC0395) convertView).getItemData() : null;
                        View itemView = m1704(item, convertView, parent);
                        if (item != oldItem) {
                            itemView.setPressed(false);
                            itemView.jumpDrawablesToCurrentState();
                        }
                        if (itemView != convertView) {
                            m1710(itemView, childIndex);
                        }
                        childIndex++;
                    }
                }
            }
            while (childIndex < parent.getChildCount()) {
                if (!m1716(parent, childIndex)) {
                    childIndex++;
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1710(View itemView, int childIndex) {
        ViewGroup currentParent = (ViewGroup) itemView.getParent();
        if (currentParent != null) {
            currentParent.removeView(itemView);
        }
        ((ViewGroup) this.f1358).addView(itemView, childIndex);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1716(ViewGroup parent, int childIndex) {
        parent.removeViewAt(childIndex);
        return true;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1713(AbstractC0392.AbstractC0393 cb) {
        this.f1357 = cb;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0392.AbstractC0393 m1705() {
        return this.f1357;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0394.AbstractC0395 m1706(ViewGroup parent) {
        return (AbstractC0394.AbstractC0395) this.f1355.inflate(this.f1351, parent, false);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public View m1704(C0380 item, View convertView, ViewGroup parent) {
        AbstractC0394.AbstractC0395 itemView;
        if (convertView instanceof AbstractC0394.AbstractC0395) {
            itemView = (AbstractC0394.AbstractC0395) convertView;
        } else {
            itemView = m1706(parent);
        }
        m1712(item, itemView);
        return (View) itemView;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1711(C0375 menu, boolean allMenusAreClosing) {
        AbstractC0392.AbstractC0393 r0 = this.f1357;
        if (r0 != null) {
            r0.m1914(menu, allMenusAreClosing);
        }
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1718(SubMenuC0402 menu) {
        AbstractC0392.AbstractC0393 r0 = this.f1357;
        if (r0 != null) {
            return r0.m1915(menu);
        }
        return false;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1703(C0375 menu, C0380 item) {
        return false;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1717(C0375 menu, C0380 item) {
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1708(int id) {
    }
}
