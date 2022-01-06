package ♫;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.util.ArrayList;
import ♫.AbstractC0394;

/* renamed from: ♫.呀  reason: contains not printable characters */
public class C0374 extends BaseAdapter {

    /* renamed from: ø  reason: contains not printable characters */
    public final boolean f1411;

    /* renamed from: Φ  reason: contains not printable characters */
    public final int f1412;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1413;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1414 = -1;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final LayoutInflater f1415;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0375 f1416;

    public C0374(C0375 menu, LayoutInflater inflater, boolean overflowOnly, int itemLayoutRes) {
        this.f1411 = overflowOnly;
        this.f1415 = inflater;
        this.f1416 = menu;
        this.f1412 = itemLayoutRes;
        m1765();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1766(boolean forceShow) {
        this.f1413 = forceShow;
    }

    public int getCount() {
        ArrayList<MenuItemImpl> items = this.f1411 ? this.f1416.m1781() : this.f1416.m1775();
        if (this.f1414 < 0) {
            return items.size();
        }
        return items.size() - 1;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0375 m1763() {
        return this.f1416;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0380 getItem(int position) {
        ArrayList<MenuItemImpl> items = this.f1411 ? this.f1416.m1781() : this.f1416.m1775();
        int i = this.f1414;
        if (i >= 0 && position >= i) {
            position++;
        }
        return (C0380) items.get(position);
    }

    public long getItemId(int position) {
        return (long) position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = this.f1415.inflate(this.f1412, parent, false);
        }
        int currGroupId = getItem(position).getGroupId();
        ((ListMenuItemView) convertView).setGroupDividerEnabled(this.f1416.m1787() && currGroupId != (position + -1 >= 0 ? getItem(position + -1).getGroupId() : currGroupId));
        AbstractC0394.AbstractC0395 itemView = (AbstractC0394.AbstractC0395) convertView;
        if (this.f1413) {
            ((ListMenuItemView) convertView).setForceShowIcon(true);
        }
        itemView.m1917(getItem(position), 0);
        return convertView;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1765() {
        C0380 expandedItem = this.f1416.m1804();
        if (expandedItem != null) {
            ArrayList<MenuItemImpl> items = this.f1416.m1781();
            int count = items.size();
            for (int i = 0; i < count; i++) {
                if (((C0380) items.get(i)) == expandedItem) {
                    this.f1414 = i;
                    return;
                }
            }
        }
        this.f1414 = -1;
    }

    public void notifyDataSetChanged() {
        m1765();
        super.notifyDataSetChanged();
    }
}
