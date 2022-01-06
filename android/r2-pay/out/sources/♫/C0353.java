package ♫;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import ♫.AbstractC0349;
import ♫.C0375;

/* renamed from: ♫.偏  reason: contains not printable characters */
public class C0353 extends AbstractC0349 implements C0375.AbstractC0377 {

    /* renamed from: ø  reason: contains not printable characters */
    public boolean f1269;

    /* renamed from: θ  reason: contains not printable characters */
    public Context f1270;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ActionBarContextView f1271;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public WeakReference<View> f1272;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0349.AbstractC0350 f1273;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0375 f1274;

    public C0353(Context context, ActionBarContextView view, AbstractC0349.AbstractC0350 callback, boolean isFocusable) {
        this.f1270 = context;
        this.f1271 = view;
        this.f1273 = callback;
        C0375 r0 = new C0375(view.getContext());
        r0.m1800(1);
        this.f1274 = r0;
        this.f1274.m1813(this);
    }

    @Override // ♫.AbstractC0349
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1653(CharSequence title) {
        this.f1271.setTitle(title);
    }

    @Override // ♫.AbstractC0349
    /* renamed from: θ  reason: contains not printable characters */
    public void m1662(CharSequence subtitle) {
        this.f1271.setSubtitle(subtitle);
    }

    @Override // ♫.AbstractC0349
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1652(int resId) {
        m1653(this.f1270.getString(resId));
    }

    @Override // ♫.AbstractC0349
    /* renamed from: θ  reason: contains not printable characters */
    public void m1660(int resId) {
        m1662((CharSequence) this.f1270.getString(resId));
    }

    @Override // ♫.AbstractC0349
    /* renamed from: θ  reason: contains not printable characters */
    public void m1664(boolean titleOptional) {
        super.m1638(titleOptional);
        this.f1271.setTitleOptional(titleOptional);
    }

    @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1654() {
        return this.f1271.m77();
    }

    @Override // ♫.AbstractC0349
    /* renamed from: θ  reason: contains not printable characters */
    public void m1661(View view) {
        this.f1271.setCustomView(view);
        this.f1272 = view != null ? new WeakReference<>(view) : null;
    }

    @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1651() {
        this.f1273.m1640(this, this.f1274);
    }

    @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
    /* renamed from: θ  reason: contains not printable characters */
    public void m1659() {
        if (!this.f1269) {
            this.f1269 = true;
            this.f1271.sendAccessibilityEvent(32);
            this.f1273.m1641(this);
        }
    }

    @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
    /* renamed from: θ  reason: contains not printable characters */
    public Menu m1655() {
        return this.f1274;
    }

    @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
    /* renamed from: Φ  reason: contains not printable characters */
    public CharSequence m1650() {
        return this.f1271.getTitle();
    }

    @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
    /* renamed from: θ  reason: contains not printable characters */
    public CharSequence m1658() {
        return this.f1271.getSubtitle();
    }

    @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
    /* renamed from: θ  reason: contains not printable characters */
    public View m1657() {
        WeakReference<View> weakReference = this.f1272;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
    /* renamed from: θ  reason: contains not printable characters */
    public MenuInflater m1656() {
        return new C0356(this.f1271.getContext());
    }

    @Override // ♫.C0375.AbstractC0377
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1665(C0375 menu, MenuItem item) {
        return this.f1273.m1643(this, item);
    }

    @Override // ♫.C0375.AbstractC0377
    /* renamed from: θ  reason: contains not printable characters */
    public void m1663(C0375 menu) {
        m1651();
        this.f1271.m74();
    }
}
