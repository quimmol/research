package ♫;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import ♫.AbstractC0392;
import ♫.DialogInterfaceC0297;

/* renamed from: ♫.哥  reason: contains not printable characters */
public class DialogInterface$OnKeyListenerC0378 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, AbstractC0392.AbstractC0393 {

    /* renamed from: θ  reason: contains not printable characters */
    public DialogInterfaceC0297 f1444;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0372 f1445;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0375 f1446;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0392.AbstractC0393 f1447;

    public DialogInterface$OnKeyListenerC0378(C0375 menu) {
        this.f1446 = menu;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1827(IBinder windowToken) {
        C0375 menu = this.f1446;
        DialogInterfaceC0297.C0298 builder = new DialogInterfaceC0297.C0298(menu.m1791());
        this.f1445 = new C0372(builder.m1306(), C0296.abc_list_menu_item_layout);
        this.f1445.m1756(this);
        this.f1446.m1814(this.f1445);
        builder.m1310(this.f1445.m1752(), this);
        View headerView = menu.m1795();
        if (headerView != null) {
            builder.m1309(headerView);
        } else {
            builder.m1308(menu.m1793());
            builder.m1311(menu.m1796());
        }
        builder.m1307(this);
        this.f1444 = builder.m1312();
        this.f1444.setOnDismissListener(this);
        WindowManager.LayoutParams lp = this.f1444.getWindow().getAttributes();
        lp.type = 1003;
        if (windowToken != null) {
            lp.token = windowToken;
        }
        lp.flags |= 131072;
        this.f1444.show();
    }

    public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
        Window win;
        View decor;
        KeyEvent.DispatcherState ds;
        View decor2;
        KeyEvent.DispatcherState ds2;
        if (keyCode == 82 || keyCode == 4) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                Window win2 = this.f1444.getWindow();
                if (!(win2 == null || (decor2 = win2.getDecorView()) == null || (ds2 = decor2.getKeyDispatcherState()) == null)) {
                    ds2.startTracking(event, this);
                    return true;
                }
            } else if (event.getAction() == 1 && !event.isCanceled() && (win = this.f1444.getWindow()) != null && (decor = win.getDecorView()) != null && (ds = decor.getKeyDispatcherState()) != null && ds.isTracking(event)) {
                this.f1446.m1816(true);
                dialog.dismiss();
                return true;
            }
        }
        return this.f1446.performShortcut(keyCode, event, 0);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1826() {
        DialogInterfaceC0297 r0 = this.f1444;
        if (r0 != null) {
            r0.dismiss();
        }
    }

    public void onDismiss(DialogInterface dialog) {
        this.f1445.m1755(this.f1446, true);
    }

    @Override // ♫.AbstractC0392.AbstractC0393
    /* renamed from: θ  reason: contains not printable characters */
    public void m1828(C0375 menu, boolean allMenusAreClosing) {
        if (allMenusAreClosing || menu == this.f1446) {
            m1826();
        }
        AbstractC0392.AbstractC0393 r0 = this.f1447;
        if (r0 != null) {
            r0.m1914(menu, allMenusAreClosing);
        }
    }

    @Override // ♫.AbstractC0392.AbstractC0393
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1829(C0375 subMenu) {
        AbstractC0392.AbstractC0393 r0 = this.f1447;
        if (r0 != null) {
            return r0.m1915(subMenu);
        }
        return false;
    }

    public void onClick(DialogInterface dialog, int which) {
        this.f1446.m1818((C0380) this.f1445.m1752().getItem(which), 0);
    }
}
