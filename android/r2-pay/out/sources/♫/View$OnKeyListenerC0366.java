package ♫;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import ♫.AbstractC0392;

/* renamed from: ♫.吗  reason: contains not printable characters */
public final class View$OnKeyListenerC0366 extends AbstractC0389 implements AbstractC0392, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: ₣  reason: contains not printable characters */
    public static final int f1363 = C0296.abc_cascading_menu_item_layout;

    /* renamed from: µ  reason: contains not printable characters */
    public int f1364;

    /* renamed from: µ  reason: contains not printable characters and collision with other field name */
    public boolean f1365;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1366 = 0;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f1367;

    /* renamed from: ö  reason: contains not printable characters */
    public int f1368 = 0;

    /* renamed from: ö  reason: contains not printable characters and collision with other field name */
    public boolean f1369;

    /* renamed from: ø  reason: contains not printable characters */
    public final int f1370;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f1371;

    /* renamed from: Φ  reason: contains not printable characters */
    public final int f1372;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public View f1373;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final List<C0367> f1374 = new ArrayList();

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final boolean f1375;

    /* renamed from: θ  reason: contains not printable characters */
    public final int f1376;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Context f1377;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Handler f1378;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final View.OnAttachStateChangeListener f1379 = new View$OnAttachStateChangeListenerC0370();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f1380;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final ViewTreeObserver.OnGlobalLayoutListener f1381 = new ViewTreeObserver$OnGlobalLayoutListenerC0371();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ViewTreeObserver f1382;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public PopupWindow.OnDismissListener f1383;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final List<C0375> f1384 = new ArrayList();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0392.AbstractC0393 f1385;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final AbstractC0471 f1386 = new C0368();

    /* renamed from: ฿  reason: contains not printable characters */
    public int f1387;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f1388;

    /* renamed from: ₩  reason: contains not printable characters and collision with other field name */
    public boolean f1389;

    /* renamed from: ♫.吗$θ  reason: contains not printable characters */
    public class ViewTreeObserver$OnGlobalLayoutListenerC0371 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC0371() {
        }

        public void onGlobalLayout() {
            if (View$OnKeyListenerC0366.this.m1730() && View$OnKeyListenerC0366.this.f1374.size() > 0 && !View$OnKeyListenerC0366.this.f1374.get(0).f1392.m2207()) {
                View anchor = View$OnKeyListenerC0366.this.f1373;
                if (anchor == null || !anchor.isShown()) {
                    View$OnKeyListenerC0366.this.dismiss();
                    return;
                }
                for (C0367 info : View$OnKeyListenerC0366.this.f1374) {
                    info.f1392.m2219();
                }
            }
        }
    }

    /* renamed from: ♫.吗$Φ  reason: contains not printable characters */
    public class View$OnAttachStateChangeListenerC0370 implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0370() {
        }

        public void onViewAttachedToWindow(View v) {
        }

        public void onViewDetachedFromWindow(View v) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0366.this.f1382;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0366.this.f1382 = v.getViewTreeObserver();
                }
                View$OnKeyListenerC0366 r0 = View$OnKeyListenerC0366.this;
                r0.f1382.removeGlobalOnLayoutListener(r0.f1381);
            }
            v.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: ♫.吗$ø  reason: contains not printable characters */
    public class C0368 implements AbstractC0471 {
        public C0368() {
        }

        @Override // ♫.AbstractC0471
        /* renamed from: Φ  reason: contains not printable characters */
        public void m1749(C0375 menu, MenuItem item) {
            View$OnKeyListenerC0366.this.f1378.removeCallbacksAndMessages(menu);
        }

        @Override // ♫.AbstractC0471
        /* renamed from: θ  reason: contains not printable characters */
        public void m1750(C0375 menu, MenuItem item) {
            C0367 nextInfo;
            View$OnKeyListenerC0366.this.f1378.removeCallbacksAndMessages(null);
            int menuIndex = -1;
            int i = 0;
            int count = View$OnKeyListenerC0366.this.f1374.size();
            while (true) {
                if (i >= count) {
                    break;
                } else if (menu == View$OnKeyListenerC0366.this.f1374.get(i).f1391) {
                    menuIndex = i;
                    break;
                } else {
                    i++;
                }
            }
            if (menuIndex != -1) {
                int nextIndex = menuIndex + 1;
                if (nextIndex < View$OnKeyListenerC0366.this.f1374.size()) {
                    nextInfo = View$OnKeyListenerC0366.this.f1374.get(nextIndex);
                } else {
                    nextInfo = null;
                }
                View$OnKeyListenerC0366.this.f1378.postAtTime(new RunnableC0369(nextInfo, item, menu), menu, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: ♫.吗$ø$θ  reason: contains not printable characters */
        public class RunnableC0369 implements Runnable {

            /* renamed from: θ  reason: contains not printable characters */
            public final /* synthetic */ MenuItem f1394;

            /* renamed from: θ  reason: contains not printable characters and collision with other field name */
            public final /* synthetic */ C0367 f1395;

            /* renamed from: θ  reason: contains not printable characters and collision with other field name */
            public final /* synthetic */ C0375 f1397;

            public RunnableC0369(C0367 r2, MenuItem menuItem, C0375 r4) {
                this.f1395 = r2;
                this.f1394 = menuItem;
                this.f1397 = r4;
            }

            public void run() {
                C0367 r0 = this.f1395;
                if (r0 != null) {
                    View$OnKeyListenerC0366.this.f1389 = true;
                    r0.f1391.m1816(false);
                    View$OnKeyListenerC0366.this.f1389 = false;
                }
                if (this.f1394.isEnabled() && this.f1394.hasSubMenu()) {
                    this.f1397.m1818(this.f1394, 4);
                }
            }
        }
    }

    public View$OnKeyListenerC0366(Context context, View anchor, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f1377 = context;
        this.f1380 = anchor;
        this.f1372 = popupStyleAttr;
        this.f1370 = popupStyleRes;
        this.f1375 = overflowOnly;
        this.f1369 = false;
        this.f1364 = m1731();
        Resources res = context.getResources();
        this.f1376 = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(C0066.abc_config_prefDialogWidth));
        this.f1378 = new Handler();
    }

    @Override // ♫.AbstractC0389
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1729(boolean forceShow) {
        this.f1369 = forceShow;
    }

    @Override // ♫.AbstractC0389, ♫.AbstractC0392, ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public final C0472 m1737() {
        C0472 popupWindow = new C0472(this.f1377, null, this.f1372, this.f1370);
        popupWindow.m2240(this.f1386);
        popupWindow.m2224((AdapterView.OnItemClickListener) this);
        popupWindow.m2226((PopupWindow.OnDismissListener) this);
        popupWindow.m2223(this.f1380);
        popupWindow.m2205(this.f1368);
        popupWindow.m2227(true);
        popupWindow.m2202(2);
        return popupWindow;
    }

    @Override // ♫.AbstractC0389, ♫.AbstractC0392, ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public void m1738() {
        if (!m1730()) {
            for (C0375 menu : this.f1384) {
                m1728(menu);
            }
            this.f1384.clear();
            this.f1373 = this.f1380;
            if (this.f1373 != null) {
                boolean addGlobalListener = this.f1382 == null;
                this.f1382 = this.f1373.getViewTreeObserver();
                if (addGlobalListener) {
                    this.f1382.addOnGlobalLayoutListener(this.f1381);
                }
                this.f1373.addOnAttachStateChangeListener(this.f1379);
            }
        }
    }

    @Override // ♫.AbstractC0398
    public void dismiss() {
        int length = this.f1374.size();
        if (length > 0) {
            C0367[] addedMenus = (C0367[]) this.f1374.toArray(new C0367[length]);
            for (int i = length - 1; i >= 0; i--) {
                C0367 info = addedMenus[i];
                if (info.f1392.m2212()) {
                    info.f1392.dismiss();
                }
            }
        }
    }

    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() != 1 || keyCode != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // ♫.AbstractC0389, ♫.AbstractC0392, ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public final int m1731() {
        return C0248.m1146(this.f1380) == 1 ? 0 : 1;
    }

    @Override // ♫.AbstractC0389
    /* renamed from: θ  reason: contains not printable characters */
    public final int m1732(int nextMenuWidth) {
        List<C0367> list = this.f1374;
        ListView lastListView = list.get(list.size() - 1).m1748();
        int[] screenLocation = new int[2];
        lastListView.getLocationOnScreen(screenLocation);
        Rect displayFrame = new Rect();
        this.f1373.getWindowVisibleDisplayFrame(displayFrame);
        if (this.f1364 == 1) {
            if (screenLocation[0] + lastListView.getWidth() + nextMenuWidth > displayFrame.right) {
                return 0;
            }
            return 1;
        } else if (screenLocation[0] - nextMenuWidth < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // ♫.AbstractC0389
    /* renamed from: θ  reason: contains not printable characters */
    public void m1742(C0375 menu) {
        menu.m1815(this, this.f1377);
        if (m1730()) {
            m1728(menu);
        } else {
            this.f1384.add(menu);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m1728(C0375 menu) {
        View parentView;
        C0367 parentInfo;
        int parentOffsetY;
        int parentOffsetX;
        int x;
        LayoutInflater inflater = LayoutInflater.from(this.f1377);
        C0374 adapter = new C0374(menu, inflater, this.f1375, f1363);
        if (!m1730() && this.f1369) {
            adapter.m1766(true);
        } else if (m1730()) {
            adapter.m1766(AbstractC0389.m1877(menu));
        }
        int menuWidth = AbstractC0389.m1875(adapter, null, this.f1377, this.f1376);
        C0472 popupWindow = m1737();
        popupWindow.m2225((ListAdapter) adapter);
        popupWindow.m2210(menuWidth);
        popupWindow.m2205(this.f1368);
        if (this.f1374.size() > 0) {
            List<C0367> list = this.f1374;
            parentInfo = list.get(list.size() - 1);
            parentView = m1735(parentInfo, menu);
        } else {
            parentInfo = null;
            parentView = null;
        }
        if (parentView != null) {
            popupWindow.m2234(false);
            popupWindow.m2238((Object) null);
            int nextMenuPosition = m1732(menuWidth);
            boolean showOnRight = nextMenuPosition == 1;
            this.f1364 = nextMenuPosition;
            if (Build.VERSION.SDK_INT >= 26) {
                popupWindow.m2223(parentView);
                parentOffsetX = 0;
                parentOffsetY = 0;
            } else {
                int[] anchorScreenLocation = new int[2];
                this.f1380.getLocationOnScreen(anchorScreenLocation);
                int[] parentViewScreenLocation = new int[2];
                parentView.getLocationOnScreen(parentViewScreenLocation);
                if ((this.f1368 & 7) == 5) {
                    anchorScreenLocation[0] = anchorScreenLocation[0] + this.f1380.getWidth();
                    parentViewScreenLocation[0] = parentViewScreenLocation[0] + parentView.getWidth();
                }
                parentOffsetX = parentViewScreenLocation[0] - anchorScreenLocation[0];
                parentOffsetY = parentViewScreenLocation[1] - anchorScreenLocation[1];
            }
            if ((this.f1368 & 5) == 5) {
                if (showOnRight) {
                    x = parentOffsetX + menuWidth;
                } else {
                    x = parentOffsetX - parentView.getWidth();
                }
            } else if (showOnRight) {
                x = parentView.getWidth() + parentOffsetX;
            } else {
                x = parentOffsetX - menuWidth;
            }
            popupWindow.m2201(x);
            popupWindow.m2211(true);
            popupWindow.m2229(parentOffsetY);
        } else {
            if (this.f1371) {
                popupWindow.m2201(this.f1388);
            }
            if (this.f1367) {
                popupWindow.m2229(this.f1387);
            }
            popupWindow.m2221(m1884());
        }
        this.f1374.add(new C0367(popupWindow, menu, this.f1364));
        popupWindow.m2219();
        ListView listView = popupWindow.m2217();
        listView.setOnKeyListener(this);
        if (parentInfo == null && this.f1365 && menu.m1796() != null) {
            FrameLayout titleItemView = (FrameLayout) inflater.inflate(C0296.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            titleItemView.setEnabled(false);
            ((TextView) titleItemView.findViewById(16908310)).setText(menu.m1796());
            listView.addHeaderView(titleItemView, null, false);
            popupWindow.m2219();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final MenuItem m1734(C0375 parent, C0375 submenu) {
        int count = parent.size();
        for (int i = 0; i < count; i++) {
            MenuItem item = parent.getItem(i);
            if (item.hasSubMenu() && submenu == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final View m1735(C0367 parentInfo, C0375 submenu) {
        int headersCount;
        C0374 menuAdapter;
        int ownerViewPosition;
        MenuItem owner = m1734(parentInfo.f1391, submenu);
        if (owner == null) {
            return null;
        }
        ListView listView = parentInfo.m1748();
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerAdapter = (HeaderViewListAdapter) listAdapter;
            headersCount = headerAdapter.getHeadersCount();
            menuAdapter = (C0374) headerAdapter.getWrappedAdapter();
        } else {
            headersCount = 0;
            menuAdapter = (C0374) listAdapter;
        }
        int ownerPosition = -1;
        int i = 0;
        int count = menuAdapter.getCount();
        while (true) {
            if (i >= count) {
                break;
            } else if (owner == menuAdapter.getItem(i)) {
                ownerPosition = i;
                break;
            } else {
                i++;
            }
        }
        if (ownerPosition != -1 && (ownerViewPosition = (ownerPosition + headersCount) - listView.getFirstVisiblePosition()) >= 0 && ownerViewPosition < listView.getChildCount()) {
            return listView.getChildAt(ownerViewPosition);
        }
        return null;
    }

    @Override // ♫.AbstractC0398
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1730() {
        return this.f1374.size() > 0 && this.f1374.get(0).f1392.m2212();
    }

    public void onDismiss() {
        C0367 dismissedInfo = null;
        int i = 0;
        int count = this.f1374.size();
        while (true) {
            if (i >= count) {
                break;
            }
            C0367 info = this.f1374.get(i);
            if (!info.f1392.m2212()) {
                dismissedInfo = info;
                break;
            }
            i++;
        }
        if (dismissedInfo != null) {
            dismissedInfo.f1391.m1816(false);
        }
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1745(boolean cleared) {
        for (C0367 info : this.f1374) {
            AbstractC0389.m1876(info.m1748().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1744(AbstractC0392.AbstractC0393 cb) {
        this.f1385 = cb;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1747(SubMenuC0402 subMenu) {
        for (C0367 info : this.f1374) {
            if (subMenu == info.f1391) {
                info.m1748().requestFocus();
                return true;
            }
        }
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        m1742((C0375) subMenu);
        AbstractC0392.AbstractC0393 r0 = this.f1385;
        if (r0 != null) {
            r0.m1915(subMenu);
        }
        return true;
    }

    @Override // ♫.AbstractC0389
    /* renamed from: θ  reason: contains not printable characters */
    public final int m1733(C0375 menu) {
        int count = this.f1374.size();
        for (int i = 0; i < count; i++) {
            if (menu == this.f1374.get(i).f1391) {
                return i;
            }
        }
        return -1;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1743(C0375 menu, boolean allMenusAreClosing) {
        int menuIndex = m1733(menu);
        if (menuIndex >= 0) {
            int nextMenuIndex = menuIndex + 1;
            if (nextMenuIndex < this.f1374.size()) {
                this.f1374.get(nextMenuIndex).f1391.m1816(false);
            }
            C0367 info = this.f1374.remove(menuIndex);
            info.f1391.m1785(this);
            if (this.f1389) {
                info.f1392.m2235((Object) null);
                info.f1392.m2220(0);
            }
            info.f1392.dismiss();
            int count = this.f1374.size();
            if (count > 0) {
                this.f1364 = this.f1374.get(count - 1).f1390;
            } else {
                this.f1364 = m1731();
            }
            if (count == 0) {
                dismiss();
                AbstractC0392.AbstractC0393 r3 = this.f1385;
                if (r3 != null) {
                    r3.m1914(menu, true);
                }
                ViewTreeObserver viewTreeObserver = this.f1382;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f1382.removeGlobalOnLayoutListener(this.f1381);
                    }
                    this.f1382 = null;
                }
                this.f1373.removeOnAttachStateChangeListener(this.f1379);
                this.f1383.onDismiss();
            } else if (allMenusAreClosing) {
                this.f1374.get(0).f1391.m1816(false);
            }
        }
    }

    @Override // ♫.AbstractC0389, ♫.AbstractC0392, ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1746() {
        return false;
    }

    @Override // ♫.AbstractC0389
    /* renamed from: θ  reason: contains not printable characters */
    public void m1739(int dropDownGravity) {
        if (this.f1366 != dropDownGravity) {
            this.f1366 = dropDownGravity;
            this.f1368 = C0191.m910(dropDownGravity, C0248.m1146(this.f1380));
        }
    }

    @Override // ♫.AbstractC0389
    /* renamed from: θ  reason: contains not printable characters */
    public void m1740(View anchor) {
        if (this.f1380 != anchor) {
            this.f1380 = anchor;
            this.f1368 = C0191.m910(this.f1366, C0248.m1146(this.f1380));
        }
    }

    @Override // ♫.AbstractC0389
    /* renamed from: θ  reason: contains not printable characters */
    public void m1741(PopupWindow.OnDismissListener listener) {
        this.f1383 = listener;
    }

    @Override // ♫.AbstractC0389, ♫.AbstractC0392, ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public ListView m1736() {
        if (this.f1374.isEmpty()) {
            return null;
        }
        List<C0367> list = this.f1374;
        return list.get(list.size() - 1).m1748();
    }

    @Override // ♫.AbstractC0389
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1727(int x) {
        this.f1371 = true;
        this.f1388 = x;
    }

    @Override // ♫.AbstractC0389
    /* renamed from: ø  reason: contains not printable characters */
    public void m1724(int y) {
        this.f1367 = true;
        this.f1387 = y;
    }

    @Override // ♫.AbstractC0389
    /* renamed from: ø  reason: contains not printable characters */
    public void m1725(boolean showTitle) {
        this.f1365 = showTitle;
    }

    @Override // ♫.AbstractC0389
    /* renamed from: ø  reason: contains not printable characters */
    public boolean m1726() {
        return false;
    }

    /* renamed from: ♫.吗$Ø  reason: contains not printable characters */
    public static class C0367 {

        /* renamed from: θ  reason: contains not printable characters */
        public final int f1390;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final C0375 f1391;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final C0472 f1392;

        public C0367(C0472 window, C0375 menu, int position) {
            this.f1392 = window;
            this.f1391 = menu;
            this.f1390 = position;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public ListView m1748() {
            return this.f1392.m2217();
        }
    }
}
