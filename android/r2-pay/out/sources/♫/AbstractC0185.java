package ♫;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: ♫.ᐠ  reason: contains not printable characters */
public abstract class AbstractC0185 {

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0186 f798;

    /* renamed from: ♫.ᐠ$Φ  reason: contains not printable characters */
    public interface AbstractC0186 {
    }

    /* renamed from: ♫.ᐠ$θ  reason: contains not printable characters */
    public interface AbstractC0187 {
    }

    /* renamed from: θ  reason: contains not printable characters */
    public abstract View m900();

    public AbstractC0185(Context context) {
    }

    /* renamed from: θ  reason: contains not printable characters */
    public View m901(MenuItem forItem) {
        return m900();
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m897() {
        return false;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m899() {
        return true;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m898() {
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m906() {
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m903(SubMenu subMenu) {
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m905(AbstractC0187 listener) {
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m904(AbstractC0186 listener) {
        if (!(this.f798 == null || listener == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f798 = listener;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m902() {
        this.f798 = null;
    }
}
