package ♫;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: ♫.ˁ  reason: contains not printable characters */
public abstract class AbstractC0111<E> extends AbstractC0092 {

    /* renamed from: θ  reason: contains not printable characters */
    public final Activity f648;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Context f649;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Handler f650;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final LayoutInflater$Factory2C0138 f651;

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract boolean m591();

    @Override // ♫.AbstractC0092
    /* renamed from: θ  reason: contains not printable characters */
    public abstract int m592();

    @Override // ♫.AbstractC0092
    /* renamed from: θ  reason: contains not printable characters */
    public abstract LayoutInflater m596();

    @Override // ♫.AbstractC0092
    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m598();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m599(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m600(ComponentCallbacksC0071 v);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract boolean m601(ComponentCallbacksC0071 v);

    public AbstractC0111(ActivityC0088 activity) {
        this(activity, activity, activity.f622, 0);
    }

    public AbstractC0111(Activity activity, Context context, Handler handler, int windowAnimations) {
        this.f651 = new LayoutInflater$Factory2C0138();
        this.f648 = activity;
        C0154.m780(context, "context == null");
        this.f649 = context;
        C0154.m780(handler, "handler == null");
        this.f650 = handler;
    }

    @Override // ♫.AbstractC0092
    /* renamed from: θ  reason: contains not printable characters */
    public Activity m593() {
        return this.f648;
    }

    @Override // ♫.AbstractC0092
    /* renamed from: θ  reason: contains not printable characters */
    public Context m594() {
        return this.f649;
    }

    @Override // ♫.AbstractC0092
    /* renamed from: θ  reason: contains not printable characters */
    public Handler m595() {
        return this.f650;
    }

    @Override // ♫.AbstractC0092
    /* renamed from: θ  reason: contains not printable characters */
    public LayoutInflater$Factory2C0138 m597() {
        return this.f651;
    }
}
