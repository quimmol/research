package ♫;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: ♫.来  reason: contains not printable characters */
public class C0472 extends C0463 implements AbstractC0471 {

    /* renamed from: Ø  reason: contains not printable characters */
    public static Method f1765 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0471 f1766;

    static {
        try {
        } catch (NoSuchMethodException e) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0472(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override // ♫.C0463
    /* renamed from: θ  reason: contains not printable characters */
    public C0453 m2237(Context context, boolean hijackFocus) {
        C0473 view = new C0473(context, hijackFocus);
        view.setHoverListener(this);
        return view;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2238(Object enterTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            ((C0463) this).f1749.setEnterTransition((Transition) enterTransition);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2235(Object exitTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            ((C0463) this).f1749.setExitTransition((Transition) exitTransition);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2240(AbstractC0471 hoverListener) {
        this.f1766 = hoverListener;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m2234(boolean touchModal) {
        Method method = f1765;
        if (method != null) {
            try {
                method.invoke(((C0463) this).f1749, Boolean.valueOf(touchModal));
            } catch (Exception e) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // ♫.AbstractC0471
    /* renamed from: θ  reason: contains not printable characters */
    public void m2239(C0375 menu, MenuItem item) {
        AbstractC0471 r0 = this.f1766;
        if (r0 != null) {
            r0.m2233(menu, item);
        }
    }

    @Override // ♫.AbstractC0471
    /* renamed from: Φ  reason: contains not printable characters */
    public void m2236(C0375 menu, MenuItem item) {
        AbstractC0471 r0 = this.f1766;
        if (r0 != null) {
            r0.m2232(menu, item);
        }
    }

    /* renamed from: ♫.来$θ  reason: contains not printable characters */
    public static class C0473 extends C0453 {

        /* renamed from: µ  reason: contains not printable characters */
        public final int f1767;

        /* renamed from: θ  reason: contains not printable characters */
        public MenuItem f1768;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public AbstractC0471 f1769;

        /* renamed from: ₩  reason: contains not printable characters */
        public final int f1770;

        @Override // ♫.C0453, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public C0473(Context context, boolean hijackFocus) {
            super(context, hijackFocus);
            Configuration config = context.getResources().getConfiguration();
            int i = Build.VERSION.SDK_INT;
            if (1 == config.getLayoutDirection()) {
                this.f1767 = 21;
                this.f1770 = 22;
                return;
            }
            this.f1767 = 22;
            this.f1770 = 21;
        }

        public void setHoverListener(AbstractC0471 hoverListener) {
            this.f1769 = hoverListener;
        }

        public boolean onKeyDown(int keyCode, KeyEvent event) {
            ListMenuItemView selectedItem = (ListMenuItemView) getSelectedView();
            if (selectedItem != null && keyCode == this.f1767) {
                if (selectedItem.isEnabled() && selectedItem.getItemData().hasSubMenu()) {
                    performItemClick(selectedItem, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (selectedItem == null || keyCode != this.f1770) {
                return super.onKeyDown(keyCode, event);
            } else {
                setSelection(-1);
                ((C0374) getAdapter()).m1763().m1816(false);
                return true;
            }
        }

        /* JADX INFO: Multiple debug info for r4v1 android.view.MenuItem: [D('oldMenuItem' android.view.MenuItem), D('position' int)] */
        @Override // ♫.C0453
        public boolean onHoverEvent(MotionEvent ev) {
            int headersCount;
            C0374 menuAdapter;
            int position;
            int itemPosition;
            if (this.f1769 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerAdapter.getHeadersCount();
                    menuAdapter = (C0374) headerAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    menuAdapter = (C0374) adapter;
                }
                MenuItem menuItem = null;
                if (ev.getAction() != 10 && (position = pointToPosition((int) ev.getX(), (int) ev.getY())) != -1 && (itemPosition = position - headersCount) >= 0 && itemPosition < menuAdapter.getCount()) {
                    menuItem = menuAdapter.getItem(itemPosition);
                }
                MenuItem oldMenuItem = this.f1768;
                if (oldMenuItem != menuItem) {
                    C0375 menu = menuAdapter.m1763();
                    if (oldMenuItem != null) {
                        this.f1769.m2232(menu, oldMenuItem);
                    }
                    this.f1768 = menuItem;
                    if (menuItem != null) {
                        this.f1769.m2233(menu, menuItem);
                    }
                }
            }
            return super.onHoverEvent(ev);
        }
    }
}
