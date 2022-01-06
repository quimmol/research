package ♫;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: ♫.士  reason: contains not printable characters */
public class MenuC0397 extends AbstractC0364<AbstractMenuC0280> implements Menu {
    public MenuC0397(Context context, AbstractMenuC0280 object) {
        super(context, object);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence title) {
        return m1720(((C0365) this).f1362.add(title));
    }

    @Override // android.view.Menu
    public MenuItem add(int titleRes) {
        return m1720(((C0365) this).f1362.add(titleRes));
    }

    @Override // android.view.Menu
    public MenuItem add(int groupId, int itemId, int order, CharSequence title) {
        return m1720(((C0365) this).f1362.add(groupId, itemId, order, title));
    }

    @Override // android.view.Menu
    public MenuItem add(int groupId, int itemId, int order, int titleRes) {
        return m1720(((C0365) this).f1362.add(groupId, itemId, order, titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence title) {
        return m1721(((C0365) this).f1362.addSubMenu(title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int titleRes) {
        return m1721(((C0365) this).f1362.addSubMenu(titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int groupId, int itemId, int order, CharSequence title) {
        return m1721(((C0365) this).f1362.addSubMenu(groupId, itemId, order, title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int groupId, int itemId, int order, int titleRes) {
        return m1721(((C0365) this).f1362.addSubMenu(groupId, itemId, order, titleRes));
    }

    public int addIntentOptions(int groupId, int itemId, int order, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        MenuItem[] items = null;
        if (outSpecificItems != null) {
            items = new MenuItem[outSpecificItems.length];
        }
        int result = ((C0365) this).f1362.addIntentOptions(groupId, itemId, order, caller, specifics, intent, flags, items);
        if (items != null) {
            int z = items.length;
            for (int i = 0; i < z; i++) {
                outSpecificItems[i] = m1720(items[i]);
            }
        }
        return result;
    }

    public void removeItem(int id) {
        m1719(id);
        ((C0365) this).f1362.removeItem(id);
    }

    public void removeGroup(int groupId) {
        m1723(groupId);
        ((C0365) this).f1362.removeGroup(groupId);
    }

    public void clear() {
        m1722();
        ((C0365) this).f1362.clear();
    }

    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        ((C0365) this).f1362.setGroupCheckable(group, checkable, exclusive);
    }

    public void setGroupVisible(int group, boolean visible) {
        ((C0365) this).f1362.setGroupVisible(group, visible);
    }

    public void setGroupEnabled(int group, boolean enabled) {
        ((C0365) this).f1362.setGroupEnabled(group, enabled);
    }

    public boolean hasVisibleItems() {
        return ((C0365) this).f1362.hasVisibleItems();
    }

    public MenuItem findItem(int id) {
        return m1720(((C0365) this).f1362.findItem(id));
    }

    public int size() {
        return ((C0365) this).f1362.size();
    }

    public MenuItem getItem(int index) {
        return m1720(((C0365) this).f1362.getItem(index));
    }

    public void close() {
        ((C0365) this).f1362.close();
    }

    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        return ((C0365) this).f1362.performShortcut(keyCode, event, flags);
    }

    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return ((C0365) this).f1362.isShortcutKey(keyCode, event);
    }

    public boolean performIdentifierAction(int id, int flags) {
        return ((C0365) this).f1362.performIdentifierAction(id, flags);
    }

    public void setQwertyMode(boolean isQwerty) {
        ((C0365) this).f1362.setQwertyMode(isQwerty);
    }
}
