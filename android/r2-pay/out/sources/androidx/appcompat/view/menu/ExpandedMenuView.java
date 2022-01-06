package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import ♫.AbstractC0394;
import ♫.C0375;
import ♫.C0380;
import ♫.C0488;

public final class ExpandedMenuView extends ListView implements C0375.AbstractC0376, AbstractC0394, AdapterView.OnItemClickListener {

    /* renamed from: θ  reason: contains not printable characters */
    public static final int[] f132 = {16842964, 16843049};

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f133;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0375 f134;

    public ExpandedMenuView(Context context, AttributeSet attrs) {
        this(context, attrs, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        setOnItemClickListener(this);
        C0488 a = C0488.m2290(context, attrs, f132, defStyleAttr, 0);
        if (a.m2305(0)) {
            setBackgroundDrawable(a.m2301(0));
        }
        if (a.m2305(1)) {
            setDivider(a.m2301(1));
        }
        a.m2304();
    }

    @Override // ♫.AbstractC0394
    /* renamed from: θ  reason: contains not printable characters */
    public void m60(C0375 menu) {
        this.f134 = menu;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // ♫.C0375.AbstractC0376
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m61(C0380 item) {
        return this.f134.m1818(item, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView parent, View v, int position, long id) {
        m61((C0380) getAdapter().getItem(position));
    }

    public int getWindowAnimations() {
        return this.f133;
    }
}
