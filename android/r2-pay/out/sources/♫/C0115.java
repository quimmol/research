package ♫;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;

/* renamed from: ♫.ˉ  reason: contains not printable characters */
public final class C0115 {
    /* renamed from: θ  reason: contains not printable characters */
    public static Drawable m610(Resources res, int id, Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        return res.getDrawable(id, theme);
    }

    /* renamed from: ♫.ˉ$θ  reason: contains not printable characters */
    public static abstract class AbstractC0116 {
        /* renamed from: θ  reason: contains not printable characters */
        public abstract void m611(int i);

        /* renamed from: θ  reason: contains not printable characters */
        public abstract void m613(Typeface typeface);

        /* renamed from: θ  reason: contains not printable characters */
        public final void m614(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0118(typeface));
        }

        /* renamed from: ♫.ˉ$θ$θ  reason: contains not printable characters */
        public class RunnableC0118 implements Runnable {

            /* renamed from: θ  reason: contains not printable characters */
            public final /* synthetic */ Typeface f656;

            public RunnableC0118(Typeface typeface) {
                this.f656 = typeface;
            }

            public void run() {
                AbstractC0116.this.m613(this.f656);
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m612(int reason, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0117(reason));
        }

        /* renamed from: ♫.ˉ$θ$Φ  reason: contains not printable characters */
        public class RunnableC0117 implements Runnable {

            /* renamed from: θ  reason: contains not printable characters */
            public final /* synthetic */ int f654;

            public RunnableC0117(int i) {
                this.f654 = i;
            }

            public void run() {
                AbstractC0116.this.m611(this.f654);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Typeface m607(Context context, int id, TypedValue value, int style, AbstractC0116 fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return m608(context, id, value, style, fontCallback, null, true);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Typeface m608(Context context, int id, TypedValue value, int style, AbstractC0116 fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        Resources resources = context.getResources();
        resources.getValue(id, value, true);
        Typeface typeface = m609(context, resources, value, id, style, fontCallback, handler, isRequestFromLayoutInflator);
        if (typeface != null || fontCallback != null) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(id) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f3  */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface m609(android.content.Context r19, android.content.res.Resources r20, android.util.TypedValue r21, int r22, int r23, ♫.C0115.AbstractC0116 r24, android.os.Handler r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0115.m609(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, ♫.ˉ$θ, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
