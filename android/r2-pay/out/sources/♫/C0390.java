package ♫;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import ♫.AbstractC0392;

/* renamed from: ♫.因  reason: contains not printable characters */
public class C0390 implements AbstractC0379 {

    /* renamed from: ø  reason: contains not printable characters */
    public int f1488;

    /* renamed from: Φ  reason: contains not printable characters */
    public final int f1489;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final PopupWindow.OnDismissListener f1490;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1491;

    /* renamed from: θ  reason: contains not printable characters */
    public final int f1492;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Context f1493;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f1494;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public PopupWindow.OnDismissListener f1495;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0375 f1496;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0389 f1497;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0392.AbstractC0393 f1498;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final boolean f1499;

    public C0390(Context context, C0375 menu, View anchorView, boolean overflowOnly, int popupStyleAttr) {
        this(context, menu, anchorView, overflowOnly, popupStyleAttr, 0);
    }

    public C0390(Context context, C0375 menu, View anchorView, boolean overflowOnly, int popupStyleAttr, int popupStyleRes) {
        this.f1488 = 8388611;
        this.f1490 = new C0391();
        this.f1493 = context;
        this.f1496 = menu;
        this.f1494 = anchorView;
        this.f1499 = overflowOnly;
        this.f1492 = popupStyleAttr;
        this.f1489 = popupStyleRes;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1901(PopupWindow.OnDismissListener listener) {
        this.f1495 = listener;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1900(View anchor) {
        this.f1494 = anchor;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1903(boolean forceShowIcon) {
        this.f1491 = forceShowIcon;
        AbstractC0389 r0 = this.f1497;
        if (r0 != null) {
            r0.m1882(forceShowIcon);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1898(int gravity) {
        this.f1488 = gravity;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m1892() {
        if (!m1895()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public AbstractC0389 m1893() {
        if (this.f1497 == null) {
            this.f1497 = m1896();
        }
        return this.f1497;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1895() {
        if (m1904()) {
            return true;
        }
        if (this.f1494 == null) {
            return false;
        }
        m1899(0, 0, false, false);
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1905(int x, int y) {
        if (m1904()) {
            return true;
        }
        if (this.f1494 == null) {
            return false;
        }
        m1899(x, y, true, true);
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final AbstractC0389 m1896() {
        AbstractC0389 popup;
        Display display = ((WindowManager) this.f1493.getSystemService("window")).getDefaultDisplay();
        Point displaySize = new Point();
        int i = Build.VERSION.SDK_INT;
        display.getRealSize(displaySize);
        if (Math.min(displaySize.x, displaySize.y) >= this.f1493.getResources().getDimensionPixelSize(C0066.abc_cascading_menus_min_smallest_width)) {
            popup = new View$OnKeyListenerC0366(this.f1493, this.f1494, this.f1492, this.f1489, this.f1499);
        } else {
            popup = new View$OnKeyListenerC0399(this.f1493, this.f1496, this.f1494, this.f1492, this.f1489, this.f1499);
        }
        popup.m1890(this.f1496);
        popup.m1889(this.f1490);
        popup.m1888(this.f1494);
        popup.m1909(this.f1498);
        popup.m1882(this.f1491);
        popup.m1885(this.f1488);
        return popup;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1899(int xOffset, int yOffset, boolean useOffsets, boolean showTitle) {
        AbstractC0389 popup = m1893();
        popup.m1879(showTitle);
        if (useOffsets) {
            if ((C0191.m910(this.f1488, C0248.m1146(this.f1494)) & 7) == 5) {
                xOffset -= this.f1494.getWidth();
            }
            popup.m1881(xOffset);
            popup.m1878(yOffset);
            int halfSize = (int) ((48.0f * this.f1493.getResources().getDisplayMetrics().density) / 2.0f);
            popup.m1887(new Rect(xOffset - halfSize, yOffset - halfSize, xOffset + halfSize, yOffset + halfSize));
        }
        popup.m1924();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1897() {
        if (m1904()) {
            this.f1497.dismiss();
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m1894() {
        this.f1497 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1495;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1904() {
        AbstractC0389 r0 = this.f1497;
        return r0 != null && r0.m1922();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1902(AbstractC0392.AbstractC0393 cb) {
        this.f1498 = cb;
        AbstractC0389 r0 = this.f1497;
        if (r0 != null) {
            r0.m1909(cb);
        }
    }

    /* renamed from: ♫.因$θ  reason: contains not printable characters */
    public class C0391 implements PopupWindow.OnDismissListener {
        public C0391() {
        }

        public void onDismiss() {
            C0390.this.m1894();
        }
    }
}
