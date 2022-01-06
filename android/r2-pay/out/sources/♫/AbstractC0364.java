package ♫;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ♫.发  reason: contains not printable characters */
public abstract class AbstractC0364<T> extends C0365<T> {

    /* renamed from: Φ  reason: contains not printable characters */
    public Map<AbstractSubMenuC0587, SubMenu> f1359;

    /* renamed from: θ  reason: contains not printable characters */
    public final Context f1360;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Map<AbstractMenuItemC0287, MenuItem> f1361;

    public AbstractC0364(Context context, T object) {
        super(object);
        this.f1360 = context;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final MenuItem m1720(MenuItem menuItem) {
        if (!(menuItem instanceof AbstractMenuItemC0287)) {
            return menuItem;
        }
        AbstractMenuItemC0287 supportMenuItem = (AbstractMenuItemC0287) menuItem;
        if (this.f1361 == null) {
            this.f1361 = new C0514();
        }
        MenuItem wrappedItem = this.f1361.get(menuItem);
        if (wrappedItem != null) {
            return wrappedItem;
        }
        MenuItem wrappedItem2 = C0396.m1920(this.f1360, supportMenuItem);
        this.f1361.put(supportMenuItem, wrappedItem2);
        return wrappedItem2;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final SubMenu m1721(SubMenu subMenu) {
        if (!(subMenu instanceof AbstractSubMenuC0587)) {
            return subMenu;
        }
        AbstractSubMenuC0587 supportSubMenu = (AbstractSubMenuC0587) subMenu;
        if (this.f1359 == null) {
            this.f1359 = new C0514();
        }
        SubMenu wrappedMenu = this.f1359.get(supportSubMenu);
        if (wrappedMenu != null) {
            return wrappedMenu;
        }
        SubMenu wrappedMenu2 = C0396.m1921(this.f1360, supportSubMenu);
        this.f1359.put(supportSubMenu, wrappedMenu2);
        return wrappedMenu2;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1722() {
        Map<AbstractMenuItemC0287, MenuItem> map = this.f1361;
        if (map != null) {
            map.clear();
        }
        Map<AbstractSubMenuC0587, SubMenu> map2 = this.f1359;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1723(int groupId) {
        Map<AbstractMenuItemC0287, MenuItem> map = this.f1361;
        if (map != null) {
            Iterator<SupportMenuItem> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                if (groupId == iterator.next().getGroupId()) {
                    iterator.remove();
                }
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m1719(int id) {
        Map<AbstractMenuItemC0287, MenuItem> map = this.f1361;
        if (map != null) {
            Iterator<SupportMenuItem> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                if (id == iterator.next().getItemId()) {
                    iterator.remove();
                    return;
                }
            }
        }
    }
}
