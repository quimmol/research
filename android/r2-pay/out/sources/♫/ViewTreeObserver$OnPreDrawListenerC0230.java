package ♫;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: ♫.ᔋ  reason: contains not printable characters */
public class ViewTreeObserver$OnPreDrawListenerC0230 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: θ  reason: contains not printable characters */
    public final View f892;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ViewTreeObserver f893;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Runnable f894;

    public ViewTreeObserver$OnPreDrawListenerC0230(View view, Runnable runnable) {
        this.f892 = view;
        this.f893 = view.getViewTreeObserver();
        this.f894 = runnable;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static ViewTreeObserver$OnPreDrawListenerC0230 m1037(View view, Runnable runnable) {
        ViewTreeObserver$OnPreDrawListenerC0230 listener = new ViewTreeObserver$OnPreDrawListenerC0230(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(listener);
        view.addOnAttachStateChangeListener(listener);
        return listener;
    }

    public boolean onPreDraw() {
        m1038();
        this.f894.run();
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1038() {
        if (this.f893.isAlive()) {
            this.f893.removeOnPreDrawListener(this);
        } else {
            this.f892.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f892.removeOnAttachStateChangeListener(this);
    }

    public void onViewAttachedToWindow(View v) {
        this.f893 = v.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View v) {
        m1038();
    }
}
