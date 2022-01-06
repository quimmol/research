package ♫;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import ♫.C0103;
import ♫.C0599;

/* renamed from: ♫.ʹ  reason: contains not printable characters */
public class C0093 {

    /* renamed from: ♫.ʹ$ø  reason: contains not printable characters */
    public interface AbstractC0094<T> {
        /* renamed from: θ  reason: contains not printable characters */
        int m519(T t);

        /* renamed from: θ  reason: contains not printable characters */
        boolean m520(T t);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Typeface m514(Context context, CancellationSignal cancellationSignal, C0599.C0600[] r3, int i) {
        throw null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static <T> T m512(T[] fonts, int style, AbstractC0094<T> r13) {
        int targetWeight = (style & 1) == 0 ? 400 : 700;
        boolean isTargetItalic = (style & 2) != 0;
        int bestScore = Integer.MAX_VALUE;
        T best = null;
        for (T font : fonts) {
            int score = (Math.abs(r13.m519((Object) font) - targetWeight) * 2) + (r13.m520(font) == isTargetItalic ? 0 : 1);
            if (best == null || bestScore > score) {
                best = font;
                bestScore = score;
            }
        }
        return best;
    }

    /* renamed from: ♫.ʹ$θ  reason: contains not printable characters */
    public class C0096 implements AbstractC0094<C0599.C0600> {
        public C0096(C0093 this$0) {
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m525(C0599.C0600 info) {
            return info.m2912();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m527(C0599.C0600 info) {
            return info.m2916();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0599.C0600 m518(C0599.C0600[] fonts, int style) {
        return (C0599.C0600) m512(fonts, style, new C0096(this));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Typeface m515(Context context, InputStream is) {
        File tmpFile = C0167.m810(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!C0167.m816(tmpFile, is)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(tmpFile.getPath());
            tmpFile.delete();
            return createFromFile;
        } catch (RuntimeException e) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }

    /* renamed from: ♫.ʹ$Φ  reason: contains not printable characters */
    public class C0095 implements AbstractC0094<C0103.C0105> {
        public C0095(C0093 this$0) {
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m521(C0103.C0105 entry) {
            return entry.m554();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m523(C0103.C0105 entry) {
            return entry.m559();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final C0103.C0105 m517(C0103.C0106 entry, int style) {
        return (C0103.C0105) m512(entry.m560(), style, new C0095(this));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Typeface m516(Context context, C0103.C0106 entry, Resources resources, int style) {
        C0103.C0105 best = m517(entry, style);
        if (best == null) {
            return null;
        }
        return C0173.m868(context, resources, best.m557(), best.m558(), style);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Typeface m513(Context context, Resources resources, int id, String path, int style) {
        File tmpFile = C0167.m810(context);
        if (tmpFile == null) {
            return null;
        }
        try {
            if (!C0167.m815(tmpFile, resources, id)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(tmpFile.getPath());
            tmpFile.delete();
            return createFromFile;
        } catch (RuntimeException e) {
            return null;
        } finally {
            tmpFile.delete();
        }
    }
}
