package ♫;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import ♫.AbstractC0185;
import ♫.C0380;
import ♫.MenuItemC0382;

/* renamed from: ♫.啦  reason: contains not printable characters */
public class C0387 extends MenuItemC0382 {
    public C0387(Context context, AbstractMenuItemC0287 object) {
        super(context, object);
    }

    @Override // ♫.MenuItemC0382
    /* renamed from: θ  reason: contains not printable characters */
    public MenuItemC0382.C0386 m1870(ActionProvider provider) {
        return new ActionProvider$VisibilityListenerC0388(this, ((AbstractC0364) this).f1360, provider);
    }

    /* renamed from: ♫.啦$θ  reason: contains not printable characters */
    public class ActionProvider$VisibilityListenerC0388 extends MenuItemC0382.C0386 implements ActionProvider.VisibilityListener {

        /* renamed from: Φ  reason: contains not printable characters */
        public AbstractC0185.AbstractC0186 f1486;

        public ActionProvider$VisibilityListenerC0388(C0387 this$0, Context context, ActionProvider inner) {
            super(context, inner);
        }

        @Override // ♫.AbstractC0185
        /* renamed from: θ  reason: contains not printable characters */
        public View m1873(MenuItem forItem) {
            return ((MenuItemC0382.C0386) this).f1484.onCreateActionView(forItem);
        }

        @Override // ♫.AbstractC0185
        /* renamed from: Ø  reason: contains not printable characters */
        public boolean m1871() {
            return ((MenuItemC0382.C0386) this).f1484.overridesItemVisibility();
        }

        @Override // ♫.AbstractC0185
        /* renamed from: Φ  reason: contains not printable characters */
        public boolean m1872() {
            return ((MenuItemC0382.C0386) this).f1484.isVisible();
        }

        @Override // ♫.AbstractC0185
        /* renamed from: θ  reason: contains not printable characters */
        public void m1874(AbstractC0185.AbstractC0186 listener) {
            this.f1486 = listener;
            ((MenuItemC0382.C0386) this).f1484.setVisibilityListener(listener != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean isVisible) {
            AbstractC0185.AbstractC0186 r0 = this.f1486;
            if (r0 != null) {
                ((C0380.C0381) r0).m1860(isVisible);
            }
        }
    }
}
