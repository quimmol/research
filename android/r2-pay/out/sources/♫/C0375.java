package ♫;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ♫.呐  reason: contains not printable characters */
public class C0375 implements AbstractMenuC0280 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final int[] f1417 = {1, 4, 5, 3, 2, 0};

    /* renamed from: µ  reason: contains not printable characters */
    public boolean f1418 = false;

    /* renamed from: Ø  reason: contains not printable characters */
    public ArrayList<C0380> f1419;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f1420;

    /* renamed from: ö  reason: contains not printable characters */
    public ArrayList<C0380> f1421 = new ArrayList<>();

    /* renamed from: ö  reason: contains not printable characters and collision with other field name */
    public boolean f1422 = false;

    /* renamed from: ø  reason: contains not printable characters */
    public ArrayList<C0380> f1423;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f1424;

    /* renamed from: Φ  reason: contains not printable characters */
    public ArrayList<C0380> f1425;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1426;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f1427 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Context f1428;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Resources f1429;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f1430;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ContextMenu.ContextMenuInfo f1431;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f1432;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public CharSequence f1433;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ArrayList<C0380> f1434;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public CopyOnWriteArrayList<WeakReference<AbstractC0392>> f1435 = new CopyOnWriteArrayList<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0377 f1436;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0380 f1437;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1438;

    /* renamed from: ฿  reason: contains not printable characters */
    public boolean f1439 = false;

    /* renamed from: ₣  reason: contains not printable characters */
    public boolean f1440 = false;

    /* renamed from: ₤  reason: contains not printable characters */
    public boolean f1441 = false;

    /* renamed from: ₧  reason: contains not printable characters */
    public boolean f1442;

    /* renamed from: ₩  reason: contains not printable characters */
    public boolean f1443 = false;

    /* renamed from: ♫.呐$Φ  reason: contains not printable characters */
    public interface AbstractC0376 {
        /* renamed from: θ  reason: contains not printable characters */
        boolean m1823(C0380 v);
    }

    /* renamed from: ♫.呐$θ  reason: contains not printable characters */
    public interface AbstractC0377 {
        /* renamed from: θ  reason: contains not printable characters */
        void m1824(C0375 v);

        /* renamed from: θ  reason: contains not printable characters */
        boolean m1825(C0375 v, MenuItem menuItem);
    }

    public C0375(Context context) {
        this.f1428 = context;
        this.f1429 = context.getResources();
        this.f1434 = new ArrayList<>();
        this.f1425 = new ArrayList<>();
        this.f1424 = true;
        this.f1423 = new ArrayList<>();
        this.f1419 = new ArrayList<>();
        this.f1420 = true;
        m1774(true);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0375 m1800(int defaultShowAsAction) {
        this.f1427 = defaultShowAsAction;
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1814(AbstractC0392 presenter) {
        m1815(presenter, this.f1428);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1815(AbstractC0392 presenter, Context menuContext) {
        this.f1435.add(new WeakReference<>(presenter));
        presenter.m1907(menuContext, this);
        this.f1420 = true;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m1785(AbstractC0392 presenter) {
        Iterator<WeakReference<AbstractC0392>> it = this.f1435.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            AbstractC0392 item = (AbstractC0392) ref.get();
            if (item == null || item == presenter) {
                this.f1435.remove(ref);
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m1786(boolean cleared) {
        if (!this.f1435.isEmpty()) {
            m1769();
            Iterator<WeakReference<AbstractC0392>> it = this.f1435.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                AbstractC0392 presenter = (AbstractC0392) ref.get();
                if (presenter == null) {
                    this.f1435.remove(ref);
                } else {
                    presenter.m1910(cleared);
                }
            }
            m1773();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m1822(SubMenuC0402 subMenu, AbstractC0392 preferredPresenter) {
        if (this.f1435.isEmpty()) {
            return false;
        }
        boolean result = false;
        if (preferredPresenter != null) {
            result = preferredPresenter.m1913(subMenu);
        }
        Iterator<WeakReference<AbstractC0392>> it = this.f1435.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            AbstractC0392 presenter = (AbstractC0392) ref.get();
            if (presenter == null) {
                this.f1435.remove(ref);
            } else if (!result) {
                result = presenter.m1913(subMenu);
            }
        }
        return result;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m1784(Bundle outStates) {
        SparseArray<Parcelable> viewStates = null;
        int itemCount = size();
        for (int i = 0; i < itemCount; i++) {
            MenuItem item = getItem(i);
            View v = item.getActionView();
            if (!(v == null || v.getId() == -1)) {
                if (viewStates == null) {
                    viewStates = new SparseArray<>();
                }
                v.saveHierarchyState(viewStates);
                if (item.isActionViewExpanded()) {
                    outStates.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0402) item.getSubMenu()).m1784(outStates);
            }
        }
        if (viewStates != null) {
            outStates.putSparseParcelableArray(m1797(), viewStates);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1810(Bundle states) {
        MenuItem itemToExpand;
        if (states != null) {
            SparseArray<Parcelable> viewStates = states.getSparseParcelableArray(m1797());
            int itemCount = size();
            for (int i = 0; i < itemCount; i++) {
                MenuItem item = getItem(i);
                View v = item.getActionView();
                if (!(v == null || v.getId() == -1)) {
                    v.restoreHierarchyState(viewStates);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuC0402) item.getSubMenu()).m1810(states);
                }
            }
            int expandedId = states.getInt("android:menu:expandedactionview");
            if (expandedId > 0 && (itemToExpand = findItem(expandedId)) != null) {
                itemToExpand.expandActionView();
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public String m1797() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1813(AbstractC0377 cb) {
        this.f1436 = cb;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public MenuItem m1794(int group, int id, int categoryOrder, CharSequence title) {
        int ordering = m1767(categoryOrder);
        C0380 item = m1805(group, id, categoryOrder, ordering, title, this.f1427);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1431;
        if (contextMenuInfo != null) {
            item.m1852(contextMenuInfo);
        }
        ArrayList<C0380> arrayList = this.f1434;
        arrayList.add(m1768(arrayList, ordering), item);
        m1778(true);
        return item;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final C0380 m1805(int group, int id, int categoryOrder, int ordering, CharSequence title, int defaultShowAsAction) {
        return new C0380(this, group, id, categoryOrder, ordering, title, defaultShowAsAction);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence title) {
        return m1794(0, 0, 0, title);
    }

    @Override // android.view.Menu
    public MenuItem add(int titleRes) {
        return m1794(0, 0, 0, this.f1429.getString(titleRes));
    }

    @Override // android.view.Menu
    public MenuItem add(int group, int id, int categoryOrder, CharSequence title) {
        return m1794(group, id, categoryOrder, title);
    }

    @Override // android.view.Menu
    public MenuItem add(int group, int id, int categoryOrder, int title) {
        return m1794(group, id, categoryOrder, this.f1429.getString(title));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence title) {
        return addSubMenu(0, 0, 0, title);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int titleRes) {
        return addSubMenu(0, 0, 0, this.f1429.getString(titleRes));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int group, int id, int categoryOrder, CharSequence title) {
        C0380 item = (C0380) m1794(group, id, categoryOrder, title);
        SubMenuC0402 subMenu = new SubMenuC0402(this.f1428, this, item);
        item.m1853(subMenu);
        return subMenu;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int group, int id, int categoryOrder, int title) {
        return addSubMenu(group, id, categoryOrder, this.f1429.getString(title));
    }

    public void setGroupDividerEnabled(boolean enabled) {
        this.f1441 = enabled;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1787() {
        return this.f1441;
    }

    public int addIntentOptions(int group, int id, int categoryOrder, ComponentName caller, Intent[] specifics, Intent intent, int flags, MenuItem[] outSpecificItems) {
        int i;
        PackageManager pm = this.f1428.getPackageManager();
        int N = 0;
        List<ResolveInfo> lri = pm.queryIntentActivityOptions(caller, specifics, intent, 0);
        if (lri != null) {
            N = lri.size();
        }
        if ((flags & 1) == 0) {
            removeGroup(group);
        }
        for (int i2 = 0; i2 < N; i2++) {
            ResolveInfo ri = lri.get(i2);
            int i3 = ri.specificIndex;
            Intent rintent = new Intent(i3 < 0 ? intent : specifics[i3]);
            rintent.setComponent(new ComponentName(ri.activityInfo.applicationInfo.packageName, ri.activityInfo.name));
            MenuItem item = add(group, id, categoryOrder, ri.loadLabel(pm)).setIcon(ri.loadIcon(pm)).setIntent(rintent);
            if (outSpecificItems != null && (i = ri.specificIndex) >= 0) {
                outSpecificItems[i] = item;
            }
        }
        return N;
    }

    public void removeItem(int id) {
        m1809(m1780(id), true);
    }

    public void removeGroup(int group) {
        int i = m1789(group);
        if (i >= 0) {
            int maxRemovable = this.f1434.size() - i;
            int numRemoved = 0;
            while (true) {
                int numRemoved2 = numRemoved + 1;
                if (numRemoved >= maxRemovable || this.f1434.get(i).getGroupId() != group) {
                    m1778(true);
                } else {
                    m1809(i, false);
                    numRemoved = numRemoved2;
                }
            }
            m1778(true);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1809(int index, boolean updateChildrenOnMenuViews) {
        if (index >= 0 && index < this.f1434.size()) {
            this.f1434.remove(index);
            if (updateChildrenOnMenuViews) {
                m1778(true);
            }
        }
    }

    public void clear() {
        C0380 r0 = this.f1437;
        if (r0 != null) {
            m1821(r0);
        }
        this.f1434.clear();
        m1778(true);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1811(MenuItem item) {
        int group = item.getGroupId();
        int N = this.f1434.size();
        m1769();
        for (int i = 0; i < N; i++) {
            C0380 curItem = this.f1434.get(i);
            if (curItem.getGroupId() == group && curItem.m1833() && curItem.isCheckable()) {
                curItem.m1839(curItem == item);
            }
        }
        m1773();
    }

    public void setGroupCheckable(int group, boolean checkable, boolean exclusive) {
        int N = this.f1434.size();
        for (int i = 0; i < N; i++) {
            C0380 item = this.f1434.get(i);
            if (item.getGroupId() == group) {
                item.m1835(exclusive);
                item.setCheckable(checkable);
            }
        }
    }

    public void setGroupVisible(int group, boolean visible) {
        int N = this.f1434.size();
        boolean changedAtLeastOneItem = false;
        for (int i = 0; i < N; i++) {
            C0380 item = this.f1434.get(i);
            if (item.getGroupId() == group && item.m1856(visible)) {
                changedAtLeastOneItem = true;
            }
        }
        if (changedAtLeastOneItem) {
            m1778(true);
        }
    }

    public void setGroupEnabled(int group, boolean enabled) {
        int N = this.f1434.size();
        for (int i = 0; i < N; i++) {
            C0380 item = this.f1434.get(i);
            if (item.getGroupId() == group) {
                item.setEnabled(enabled);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f1442) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1434.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int id) {
        MenuItem possibleItem;
        int size = size();
        for (int i = 0; i < size; i++) {
            C0380 item = this.f1434.get(i);
            if (item.getItemId() == id) {
                return item;
            }
            if (item.hasSubMenu() && (possibleItem = item.getSubMenu().findItem(id)) != null) {
                return possibleItem;
            }
        }
        return null;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public int m1780(int id) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1434.get(i).getItemId() == id) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m1789(int group) {
        return m1790(group, 0);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m1790(int group, int start) {
        int size = size();
        if (start < 0) {
            start = 0;
        }
        for (int i = start; i < size; i++) {
            if (this.f1434.get(i).getGroupId() == group) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return this.f1434.size();
    }

    public MenuItem getItem(int index) {
        return this.f1434.get(index);
    }

    public boolean isShortcutKey(int keyCode, KeyEvent event) {
        return m1806(keyCode, event) != null;
    }

    public void setQwertyMode(boolean isQwerty) {
        this.f1438 = isQwerty;
        m1778(false);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public static int m1767(int categoryOrder) {
        int index = (-65536 & categoryOrder) >> 16;
        if (index >= 0) {
            int[] iArr = f1417;
            if (index < iArr.length) {
                return (iArr[index] << 16) | (65535 & categoryOrder);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m1779() {
        return this.f1438;
    }

    /* renamed from: ö  reason: contains not printable characters */
    public final void m1774(boolean shortcutsVisible) {
        boolean z = true;
        if (!shortcutsVisible || this.f1429.getConfiguration().keyboard == 1 || !C0254.m1175(ViewConfiguration.get(this.f1428), this.f1428)) {
            z = false;
        }
        this.f1426 = z;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m1772() {
        return this.f1426;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Resources m1792() {
        return this.f1429;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Context m1791() {
        return this.f1428;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1820(C0375 menu, MenuItem item) {
        AbstractC0377 r0 = this.f1436;
        return r0 != null && r0.m1825(menu, item);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1807() {
        AbstractC0377 r0 = this.f1436;
        if (r0 != null) {
            r0.m1824(this);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m1768(ArrayList<C0380> arrayList, int ordering) {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            if (arrayList.get(i).m1842() <= ordering) {
                return i + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int keyCode, KeyEvent event, int flags) {
        C0380 item = m1806(keyCode, event);
        boolean handled = false;
        if (item != null) {
            handled = m1818(item, flags);
        }
        if ((flags & 2) != 0) {
            m1816(true);
        }
        return handled;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1812(List<C0380> list, int keyCode, KeyEvent event) {
        boolean qwerty = m1779();
        int modifierState = event.getModifiers();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        if (event.getKeyData(possibleChars) || keyCode == 67) {
            int N = this.f1434.size();
            for (int i = 0; i < N; i++) {
                C0380 item = this.f1434.get(i);
                if (item.hasSubMenu()) {
                    ((C0375) item.getSubMenu()).m1812(list, keyCode, event);
                }
                char shortcutChar = qwerty ? item.getAlphabeticShortcut() : item.getNumericShortcut();
                if (((modifierState & 69647) == (69647 & (qwerty ? item.getAlphabeticModifiers() : item.getNumericModifiers()))) && shortcutChar != 0) {
                    char[] cArr = possibleChars.meta;
                    if (shortcutChar != cArr[0] && shortcutChar != cArr[2]) {
                        if (qwerty && shortcutChar == '\b') {
                            if (keyCode != 67) {
                            }
                        }
                    }
                    if (item.isEnabled()) {
                        list.add(item);
                    }
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0380 m1806(int keyCode, KeyEvent event) {
        char shortcutChar;
        ArrayList<MenuItemImpl> items = this.f1421;
        items.clear();
        m1812(items, keyCode, event);
        if (items.isEmpty()) {
            return null;
        }
        int metaState = event.getMetaState();
        KeyCharacterMap.KeyData possibleChars = new KeyCharacterMap.KeyData();
        event.getKeyData(possibleChars);
        int size = items.size();
        if (size == 1) {
            return (C0380) items.get(0);
        }
        boolean qwerty = m1779();
        for (int i = 0; i < size; i++) {
            C0380 item = (C0380) items.get(i);
            if (qwerty) {
                shortcutChar = item.getAlphabeticShortcut();
            } else {
                shortcutChar = item.getNumericShortcut();
            }
            if ((shortcutChar == possibleChars.meta[0] && (metaState & 2) == 0) || ((shortcutChar == possibleChars.meta[2] && (metaState & 2) != 0) || (qwerty && shortcutChar == '\b' && keyCode == 67))) {
                return item;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int id, int flags) {
        return m1818(findItem(id), flags);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1818(MenuItem item, int flags) {
        return m1819(item, (AbstractC0392) null, flags);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1819(MenuItem item, AbstractC0392 preferredPresenter, int flags) {
        C0380 itemImpl = (C0380) item;
        if (itemImpl == null || !itemImpl.isEnabled()) {
            return false;
        }
        boolean invoked = itemImpl.m1840();
        AbstractC0185 provider = itemImpl.m1846();
        boolean providerHasSubMenu = provider != null && provider.m906();
        if (itemImpl.m1855()) {
            invoked |= itemImpl.expandActionView();
            if (invoked) {
                m1816(true);
            }
        } else if (itemImpl.hasSubMenu() || providerHasSubMenu) {
            if ((flags & 4) == 0) {
                m1816(false);
            }
            if (!itemImpl.hasSubMenu()) {
                itemImpl.m1853(new SubMenuC0402(m1791(), this, itemImpl));
            }
            SubMenuC0402 subMenu = (SubMenuC0402) itemImpl.getSubMenu();
            if (providerHasSubMenu) {
                provider.m903(subMenu);
            }
            invoked |= m1822(subMenu, preferredPresenter);
            if (!invoked) {
                m1816(true);
            }
        } else if ((flags & 1) == 0) {
            m1816(true);
        }
        return invoked;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1816(boolean closeAllMenus) {
        if (!this.f1440) {
            this.f1440 = true;
            Iterator<WeakReference<AbstractC0392>> it = this.f1435.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                AbstractC0392 presenter = (AbstractC0392) ref.get();
                if (presenter == null) {
                    this.f1435.remove(ref);
                } else {
                    presenter.m1908(this, closeAllMenus);
                }
            }
            this.f1440 = false;
        }
    }

    public void close() {
        m1816(true);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m1778(boolean structureChanged) {
        if (!this.f1422) {
            if (structureChanged) {
                this.f1424 = true;
                this.f1420 = true;
            }
            m1786(structureChanged);
            return;
        }
        this.f1418 = true;
        if (structureChanged) {
            this.f1443 = true;
        }
    }

    /* renamed from: µ  reason: contains not printable characters */
    public void m1769() {
        if (!this.f1422) {
            this.f1422 = true;
            this.f1418 = false;
            this.f1443 = false;
        }
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m1773() {
        this.f1422 = false;
        if (this.f1418) {
            this.f1418 = false;
            m1778(this.f1443);
        }
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m1770() {
        this.f1424 = true;
        m1778(true);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m1777() {
        this.f1420 = true;
        m1778(true);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public ArrayList<C0380> m1775() {
        if (!this.f1424) {
            return this.f1425;
        }
        this.f1425.clear();
        int itemsSize = this.f1434.size();
        for (int i = 0; i < itemsSize; i++) {
            C0380 item = this.f1434.get(i);
            if (item.isVisible()) {
                this.f1425.add(item);
            }
        }
        this.f1424 = false;
        this.f1420 = true;
        return this.f1425;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m1783() {
        ArrayList<MenuItemImpl> visibleItems = m1775();
        if (this.f1420) {
            boolean flagged = false;
            Iterator<WeakReference<AbstractC0392>> it = this.f1435.iterator();
            while (it.hasNext()) {
                WeakReference<MenuPresenter> ref = it.next();
                AbstractC0392 presenter = (AbstractC0392) ref.get();
                if (presenter == null) {
                    this.f1435.remove(ref);
                } else {
                    flagged |= presenter.m1911();
                }
            }
            if (flagged) {
                this.f1423.clear();
                this.f1419.clear();
                int itemsSize = visibleItems.size();
                for (int i = 0; i < itemsSize; i++) {
                    C0380 item = (C0380) visibleItems.get(i);
                    if (item.m1836()) {
                        this.f1423.add(item);
                    } else {
                        this.f1419.add(item);
                    }
                }
            } else {
                this.f1423.clear();
                this.f1419.clear();
                this.f1419.addAll(m1775());
            }
            this.f1420 = false;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ArrayList<C0380> m1798() {
        m1783();
        return this.f1423;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public ArrayList<C0380> m1781() {
        m1783();
        return this.f1419;
    }

    public void clearHeader() {
        this.f1430 = null;
        this.f1433 = null;
        this.f1432 = null;
        m1778(false);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1808(int titleRes, CharSequence title, int iconRes, Drawable icon, View view) {
        Resources r = m1792();
        if (view != null) {
            this.f1432 = view;
            this.f1433 = null;
            this.f1430 = null;
        } else {
            if (titleRes > 0) {
                this.f1433 = r.getText(titleRes);
            } else if (title != null) {
                this.f1433 = title;
            }
            if (iconRes > 0) {
                this.f1430 = C0101.m539(m1791(), iconRes);
            } else if (icon != null) {
                this.f1430 = icon;
            }
            this.f1432 = null;
        }
        m1778(false);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0375 m1803(CharSequence title) {
        m1808(0, title, 0, null, null);
        return this;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public C0375 m1776(int titleRes) {
        m1808(titleRes, null, 0, null, null);
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0375 m1801(Drawable icon) {
        m1808(0, null, 0, icon, null);
        return this;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public C0375 m1782(int iconRes) {
        m1808(0, null, iconRes, null, null);
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0375 m1802(View view) {
        m1808(0, null, 0, null, view);
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public CharSequence m1796() {
        return this.f1433;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Drawable m1793() {
        return this.f1430;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public View m1795() {
        return this.f1432;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0375 m1799() {
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1817() {
        return this.f1439;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1788(C0380 item) {
        if (this.f1435.isEmpty()) {
            return false;
        }
        boolean expanded = false;
        m1769();
        Iterator<WeakReference<AbstractC0392>> it = this.f1435.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            AbstractC0392 presenter = (AbstractC0392) ref.get();
            if (presenter == null) {
                this.f1435.remove(ref);
            } else {
                boolean r4 = presenter.m1906(this, item);
                expanded = r4;
                if (r4) {
                    break;
                }
            }
        }
        m1773();
        if (expanded) {
            this.f1437 = item;
        }
        return expanded;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1821(C0380 item) {
        if (this.f1435.isEmpty() || this.f1437 != item) {
            return false;
        }
        boolean collapsed = false;
        m1769();
        Iterator<WeakReference<AbstractC0392>> it = this.f1435.iterator();
        while (it.hasNext()) {
            WeakReference<MenuPresenter> ref = it.next();
            AbstractC0392 presenter = (AbstractC0392) ref.get();
            if (presenter == null) {
                this.f1435.remove(ref);
            } else {
                boolean r4 = presenter.m1912(this, item);
                collapsed = r4;
                if (r4) {
                    break;
                }
            }
        }
        m1773();
        if (collapsed) {
            this.f1437 = null;
        }
        return collapsed;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0380 m1804() {
        return this.f1437;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m1771(boolean override) {
        this.f1442 = override;
    }
}
