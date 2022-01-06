package ♫;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import ♫.C0326;

/* renamed from: ♫.ᵋ  reason: contains not printable characters */
public final class C0258 {

    /* renamed from: Φ  reason: contains not printable characters */
    public Runnable f980 = null;

    /* renamed from: θ  reason: contains not printable characters */
    public int f981 = -1;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Runnable f982 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public WeakReference<View> f983;

    public C0258(View view) {
        this.f983 = new WeakReference<>(view);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0258 m1190(long value) {
        View view = this.f983.get();
        if (view != null) {
            view.animate().setDuration(value);
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0258 m1189(float value) {
        View view = this.f983.get();
        if (view != null) {
            view.animate().alpha(value);
        }
        return this;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public C0258 m1185(float value) {
        View view = this.f983.get();
        if (view != null) {
            view.animate().translationY(value);
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public long m1188() {
        View view = this.f983.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0258 m1191(Interpolator value) {
        View view = this.f983.get();
        if (view != null) {
            view.animate().setInterpolator(value);
        }
        return this;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public C0258 m1186(long value) {
        View view = this.f983.get();
        if (view != null) {
            view.animate().setStartDelay(value);
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1194() {
        View view = this.f983.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m1187() {
        View view = this.f983.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0258 m1193(AbstractC0271 listener) {
        View view = this.f983.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            m1195(view, listener);
        }
        return this;
    }

    /* renamed from: ♫.ᵋ$θ  reason: contains not printable characters */
    public class C0260 extends AnimatorListenerAdapter {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ View f986;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ AbstractC0271 f987;

        public C0260(C0258 this$0, AbstractC0271 r2, View view) {
            this.f987 = r2;
            this.f986 = view;
        }

        public void onAnimationCancel(Animator animation) {
            this.f987.m1231(this.f986);
        }

        public void onAnimationEnd(Animator animation) {
            this.f987.m1232(this.f986);
        }

        public void onAnimationStart(Animator animation) {
            this.f987.m1230(this.f986);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1195(View view, AbstractC0271 listener) {
        if (listener != null) {
            view.animate().setListener(new C0260(this, listener, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0258 m1192(AbstractC0069 listener) {
        View view = this.f983.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            ValueAnimator.AnimatorUpdateListener wrapped = null;
            if (listener != null) {
                wrapped = new C0259(this, listener, view);
            }
            view.animate().setUpdateListener(wrapped);
        }
        return this;
    }

    /* renamed from: ♫.ᵋ$Φ  reason: contains not printable characters */
    public class C0259 implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ View f984;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ AbstractC0069 f985;

        public C0259(C0258 this$0, AbstractC0069 r2, View view) {
            this.f985 = r2;
            this.f984 = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((C0326.C0328) this.f985).m1524(this.f984);
        }
    }
}
