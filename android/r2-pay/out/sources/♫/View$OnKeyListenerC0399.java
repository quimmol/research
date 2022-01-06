package ♫;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import ♫.AbstractC0392;

/* renamed from: ♫.多  reason: contains not printable characters */
public final class View$OnKeyListenerC0399 extends AbstractC0389 implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, AbstractC0392, View.OnKeyListener {

    /* renamed from: µ  reason: contains not printable characters */
    public static final int f1501 = C0296.abc_popup_menu_item_layout;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1502;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f1503;

    /* renamed from: ö  reason: contains not printable characters */
    public int f1504 = 0;

    /* renamed from: ö  reason: contains not printable characters and collision with other field name */
    public boolean f1505;

    /* renamed from: ø  reason: contains not printable characters */
    public final int f1506;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f1507;

    /* renamed from: Φ  reason: contains not printable characters */
    public final int f1508;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public View f1509;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final boolean f1510;

    /* renamed from: θ  reason: contains not printable characters */
    public final int f1511;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Context f1512;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final View.OnAttachStateChangeListener f1513 = new View$OnAttachStateChangeListenerC0400();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f1514;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final ViewTreeObserver.OnGlobalLayoutListener f1515 = new ViewTreeObserver$OnGlobalLayoutListenerC0401();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ViewTreeObserver f1516;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public PopupWindow.OnDismissListener f1517;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0374 f1518;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0375 f1519;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0392.AbstractC0393 f1520;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0472 f1521;

    /* renamed from: ♫.多$θ  reason: contains not printable characters */
    public class ViewTreeObserver$OnGlobalLayoutListenerC0401 implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC0401() {
        }

        public void onGlobalLayout() {
            if (View$OnKeyListenerC0399.this.m1930() && !View$OnKeyListenerC0399.this.f1521.m2207()) {
                View anchor = View$OnKeyListenerC0399.this.f1509;
                if (anchor == null || !anchor.isShown()) {
                    View$OnKeyListenerC0399.this.dismiss();
                } else {
                    View$OnKeyListenerC0399.this.f1521.m2219();
                }
            }
        }
    }

    /* renamed from: ♫.多$Φ  reason: contains not printable characters */
    public class View$OnAttachStateChangeListenerC0400 implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0400() {
        }

        public void onViewAttachedToWindow(View v) {
        }

        public void onViewDetachedFromWindow(View v) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0399.this.f1516;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0399.this.f1516 = v.getViewTreeObserver();
                }
                View$OnKeyListenerC0399 r0 = View$OnKeyListenerC0399.this;
                r0.f1516.removeGlobalOnLayoutListener(r0.f1515);
            }
            v.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC0399(Context context, C0375 menu, View anchorView, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f1512 = context;
        this.f1519 = menu;
        this.f1510 = overflowOnly;
        this.f1518 = new C0374(menu, LayoutInflater.from(context), this.f1510, f1501);
        this.f1508 = popupStyleAttr;
        this.f1506 = popupStyleRes;
        Resources res = context.getResources();
        this.f1511 = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(C0066.abc_config_prefDialogWidth));
        this.f1514 = anchorView;
        this.f1521 = new C0472(this.f1512, null, this.f1508, this.f1506);
        menu.m1815(this, context);
    }

    @Override // ♫.AbstractC0389
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1929(boolean forceShow) {
        this.f1518.m1766(forceShow);
    }

    @Override // ♫.AbstractC0389
    /* renamed from: θ  reason: contains not printable characters */
    public void m1933(int gravity) {
        this.f1504 = gravity;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public final boolean m1925() {
        View view;
        if (m1930()) {
            return true;
        }
        if (this.f1507 || (view = this.f1514) == null) {
            return false;
        }
        this.f1509 = view;
        this.f1521.m2226((PopupWindow.OnDismissListener) this);
        this.f1521.m2224((AdapterView.OnItemClickListener) this);
        this.f1521.m2227(true);
        View anchor = this.f1509;
        boolean addGlobalListener = this.f1516 == null;
        this.f1516 = anchor.getViewTreeObserver();
        if (addGlobalListener) {
            this.f1516.addOnGlobalLayoutListener(this.f1515);
        }
        anchor.addOnAttachStateChangeListener(this.f1513);
        this.f1521.m2223(anchor);
        this.f1521.m2205(this.f1504);
        if (!this.f1503) {
            this.f1502 = AbstractC0389.m1875(this.f1518, null, this.f1512, this.f1511);
            this.f1503 = true;
        }
        this.f1521.m2210(this.f1502);
        this.f1521.m2202(2);
        this.f1521.m2221(m1884());
        this.f1521.m2219();
        ListView listView = this.f1521.m2217();
        listView.setOnKeyListener(this);
        if (this.f1505 && this.f1519.m1796() != null) {
            FrameLayout titleItemView = (FrameLayout) LayoutInflater.from(this.f1512).inflate(C0296.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView titleView = (TextView) titleItemView.findViewById(16908310);
            if (titleView != null) {
                titleView.setText(this.f1519.m1796());
            }
            titleItemView.setEnabled(false);
            listView.addHeaderView(titleItemView, null, false);
        }
        this.f1521.m2225((ListAdapter) this.f1518);
        this.f1521.m2219();
        return true;
    }

    @Override // ♫.AbstractC0389, ♫.AbstractC0392, ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public void m1932() {
        if (!m1925()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // ♫.AbstractC0398
    public void dismiss() {
        if (m1930()) {
            this.f1521.dismiss();
        }
    }

    @Override // ♫.AbstractC0389
    /* renamed from: θ  reason: contains not printable characters */
    public void m1936(C0375 menu) {
    }

    @Override // ♫.AbstractC0398
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1930() {
        return !this.f1507 && this.f1521.m2212();
    }

    public void onDismiss() {
        this.f1507 = true;
        this.f1519.close();
        ViewTreeObserver viewTreeObserver = this.f1516;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1516 = this.f1509.getViewTreeObserver();
            }
            this.f1516.removeGlobalOnLayoutListener(this.f1515);
            this.f1516 = null;
        }
        this.f1509.removeOnAttachStateChangeListener(this.f1513);
        PopupWindow.OnDismissListener onDismissListener = this.f1517;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1939(boolean cleared) {
        this.f1503 = false;
        C0374 r0 = this.f1518;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1938(AbstractC0392.AbstractC0393 cb) {
        this.f1520 = cb;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1941(SubMenuC0402 subMenu) {
        if (subMenu.hasVisibleItems()) {
            C0390 subPopup = new C0390(this.f1512, subMenu, this.f1509, this.f1510, this.f1508, this.f1506);
            subPopup.m1902(this.f1520);
            subPopup.m1903(AbstractC0389.m1877((C0375) subMenu));
            subPopup.m1901(this.f1517);
            this.f1517 = null;
            this.f1519.m1816(false);
            int horizontalOffset = this.f1521.m2208();
            int verticalOffset = this.f1521.m2203();
            if ((Gravity.getAbsoluteGravity(this.f1504, C0248.m1146(this.f1514)) & 7) == 5) {
                horizontalOffset += this.f1514.getWidth();
            }
            if (subPopup.m1905(horizontalOffset, verticalOffset)) {
                AbstractC0392.AbstractC0393 r1 = this.f1520;
                if (r1 == null) {
                    return true;
                }
                r1.m1915(subMenu);
                return true;
            }
        }
        return false;
    }

    @Override // ♫.AbstractC0392
    /* renamed from: θ  reason: contains not printable characters */
    public void m1937(C0375 menu, boolean allMenusAreClosing) {
        if (menu == this.f1519) {
            dismiss();
            AbstractC0392.AbstractC0393 r0 = this.f1520;
            if (r0 != null) {
                r0.m1914(menu, allMenusAreClosing);
            }
        }
    }

    @Override // ♫.AbstractC0389, ♫.AbstractC0392, ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1940() {
        return false;
    }

    @Override // ♫.AbstractC0389
    /* renamed from: θ  reason: contains not printable characters */
    public void m1934(View anchor) {
        this.f1514 = anchor;
    }

    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() != 1 || keyCode != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // ♫.AbstractC0389
    /* renamed from: θ  reason: contains not printable characters */
    public void m1935(PopupWindow.OnDismissListener listener) {
        this.f1517 = listener;
    }

    @Override // ♫.AbstractC0389, ♫.AbstractC0392, ♫.AbstractC0398, ♫.AbstractC0398
    /* renamed from: θ  reason: contains not printable characters */
    public ListView m1931() {
        return this.f1521.m2217();
    }

    @Override // ♫.AbstractC0389
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1928(int x) {
        this.f1521.m2201(x);
    }

    @Override // ♫.AbstractC0389
    /* renamed from: ø  reason: contains not printable characters */
    public void m1926(int y) {
        this.f1521.m2229(y);
    }

    @Override // ♫.AbstractC0389
    /* renamed from: ø  reason: contains not printable characters */
    public void m1927(boolean showTitle) {
        this.f1505 = showTitle;
    }
}
