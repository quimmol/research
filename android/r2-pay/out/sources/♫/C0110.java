package ♫;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: ♫.ˀ  reason: contains not printable characters */
public class C0110 {

    /* renamed from: θ  reason: contains not printable characters */
    public final AbstractC0111<?> f647;

    /* renamed from: θ  reason: contains not printable characters */
    public static C0110 m565(AbstractC0111<?> r1) {
        return new C0110(r1);
    }

    public C0110(AbstractC0111<?> r1) {
        this.f647 = r1;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0133 m576() {
        return this.f647.m597();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ComponentCallbacksC0071 m575(String who) {
        return this.f647.f651.m693(who);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m582(ComponentCallbacksC0071 parent) {
        AbstractC0111<?> r0 = this.f647;
        r0.f651.m736(r0, r0, parent);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public View m574(View parent, String name, Context context, AttributeSet attrs) {
        return this.f647.f651.onCreateView(parent, name, context, attrs);
    }

    /* renamed from: ₣  reason: contains not printable characters */
    public void m589() {
        this.f647.f651.m755();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Parcelable m573() {
        return this.f647.f651.m707();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m580(Parcelable state, C0159 nonConfig) {
        this.f647.f651.m723(state, nonConfig);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0159 m577() {
        return this.f647.f651.m716();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m570() {
        this.f647.f651.m684();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m578() {
        this.f647.f651.m680();
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public void m590() {
        this.f647.f651.m768();
    }

    /* renamed from: µ  reason: contains not printable characters */
    public void m566() {
        this.f647.f651.m766();
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m568() {
        this.f647.f651.m764();
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public void m588() {
        this.f647.f651.m762();
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m569() {
        this.f647.f651.m677();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m583(boolean isInMultiWindowMode) {
        this.f647.f651.m740(isInMultiWindowMode);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m571(boolean isInPictureInPictureMode) {
        this.f647.f651.m702(isInPictureInPictureMode);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m579(Configuration newConfig) {
        this.f647.f651.m721(newConfig);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m567() {
        this.f647.f651.m759();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m586(Menu menu, MenuInflater inflater) {
        return this.f647.f651.m744(menu, inflater);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m585(Menu menu) {
        return this.f647.f651.m743(menu);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m572(MenuItem item) {
        return this.f647.f651.m704(item);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m587(MenuItem item) {
        return this.f647.f651.m745(item);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m581(Menu menu) {
        this.f647.f651.m724(menu);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m584() {
        return this.f647.f651.m692();
    }
}
