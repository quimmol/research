package ♫;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: ♫.嘴  reason: contains not printable characters */
public abstract class AbstractC0389 implements AbstractC0398, AbstractC0392, AdapterView.OnItemClickListener {

    /* renamed from: θ  reason: contains not printable characters */
    public Rect f1487;

    /* renamed from: ø  reason: contains not printable characters */
    public abstract void m1878(int i);

    /* renamed from: ø  reason: contains not printable characters */
    public abstract void m1879(boolean z);

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract void m1881(int i);

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract void m1882(boolean z);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1885(int i);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1888(View view);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1889(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1890(C0375 v);

    /* renamed from: θ  reason: contains not printable characters */
    public void m1887(Rect bounds) {
        this.f1487 = bounds;
    }

    @Override // ♫.AbstractC0392, ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public Rect m1884() {
        return this.f1487;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1886(Context context, C0375 menu) {
    }

    @Override // ♫.AbstractC0392
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1883(C0375 menu, C0380 item) {
        return false;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1891(C0375 menu, C0380 item) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ListAdapter outerAdapter = (ListAdapter) parent.getAdapter();
        m1876(outerAdapter).f1416.m1819((MenuItem) outerAdapter.getItem(position), this, m1880() ? 0 : 4);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m1875(ListAdapter adapter, ViewGroup parent, Context context, int maxAllowedWidth) {
        int maxWidth = 0;
        View itemView = null;
        int itemType = 0;
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = adapter.getCount();
        for (int i = 0; i < count; i++) {
            int positionType = adapter.getItemViewType(i);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            if (parent == null) {
                parent = new FrameLayout(context);
            }
            itemView = adapter.getView(i, itemView, parent);
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            int itemWidth = itemView.getMeasuredWidth();
            if (itemWidth >= maxAllowedWidth) {
                return maxAllowedWidth;
            }
            if (itemWidth > maxWidth) {
                maxWidth = itemWidth;
            }
        }
        return maxWidth;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0374 m1876(ListAdapter adapter) {
        if (adapter instanceof HeaderViewListAdapter) {
            return (C0374) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        return (C0374) adapter;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m1877(C0375 menu) {
        int count = menu.size();
        for (int i = 0; i < count; i++) {
            MenuItem childItem = menu.getItem(i);
            if (childItem.isVisible() && childItem.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m1880() {
        return true;
    }
}
