package ♫;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import ♫.C0103;
import ♫.C0115;
import ♫.C0599;

/* renamed from: ♫.ـ  reason: contains not printable characters */
public class C0173 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final C0093 f785;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final C0520<String, Typeface> f786 = new C0520<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f785 = new C0607();
        } else if (i >= 26) {
            f785 = new C0583();
        } else if (i < 24 || !C0194.m919()) {
            int i2 = Build.VERSION.SDK_INT;
            f785 = new C0193();
        } else {
            f785 = new C0194();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Typeface m871(Resources resources, int id, int style) {
        return f786.m2452(m872(resources, id, style));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m872(Resources resources, int id, int style) {
        return resources.getResourcePackageName(id) + "-" + id + "-" + style;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Typeface m870(Context context, C0103.AbstractC0107 entry, Resources resources, int id, int style, C0115.AbstractC0116 fontCallback, Handler handler, boolean isRequestFromLayoutInflator) {
        Typeface typeface;
        if (entry instanceof C0103.C0104) {
            C0103.C0104 providerEntry = (C0103.C0104) entry;
            typeface = C0599.m2904(context, providerEntry.m553(), fontCallback, handler, !isRequestFromLayoutInflator ? fontCallback == null : providerEntry.m552() == 0, isRequestFromLayoutInflator ? providerEntry.m551() : -1, style);
        } else {
            typeface = f785.m516(context, (C0103.C0106) entry, resources, style);
            if (fontCallback != null) {
                if (typeface != null) {
                    fontCallback.m614(typeface, handler);
                } else {
                    fontCallback.m612(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f786.m2453(m872(resources, id, style), typeface);
        }
        return typeface;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Typeface m868(Context context, Resources resources, int id, String path, int style) {
        Typeface typeface = f785.m513(context, resources, id, path, style);
        if (typeface != null) {
            f786.m2453(m872(resources, id, style), typeface);
        }
        return typeface;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Typeface m869(Context context, CancellationSignal cancellationSignal, C0599.C0600[] fonts, int style) {
        return f785.m514(context, cancellationSignal, fonts, style);
    }
}
