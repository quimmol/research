package ♫;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import ♫.C0103;

/* renamed from: ♫.ﹳ  reason: contains not printable characters */
public class C0583 extends C0193 {

    /* renamed from: Ø  reason: contains not printable characters */
    public final Method f2307;

    /* renamed from: ö  reason: contains not printable characters */
    public final Method f2308;

    /* renamed from: ø  reason: contains not printable characters */
    public final Method f2309;

    /* renamed from: Φ  reason: contains not printable characters */
    public final Method f2310;

    /* renamed from: θ  reason: contains not printable characters */
    public final Class f2311;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Constructor f2312;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Method f2313;

    public C0583() {
        Method abortCreation;
        Method freeze;
        Method addFontFromBuffer;
        Method addFontFromAssetManager;
        Method addFontFromAssetManager2;
        Constructor fontFamilyCtor;
        Class fontFamily;
        try {
            fontFamily = m2854();
            fontFamilyCtor = m2856(fontFamily);
            addFontFromAssetManager2 = m2849(fontFamily);
            addFontFromAssetManager = m2848(fontFamily);
            addFontFromBuffer = m2847(fontFamily);
            freeze = m2857(fontFamily);
            abortCreation = m2846(fontFamily);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            abortCreation = null;
            fontFamily = null;
            fontFamilyCtor = null;
            addFontFromAssetManager2 = null;
            addFontFromAssetManager = null;
            addFontFromBuffer = null;
            freeze = null;
        }
        this.f2311 = fontFamily;
        this.f2312 = fontFamilyCtor;
        this.f2313 = addFontFromAssetManager2;
        this.f2310 = addFontFromAssetManager;
        this.f2309 = addFontFromBuffer;
        this.f2307 = freeze;
        this.f2308 = abortCreation;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2859() {
        if (this.f2313 == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2313 != null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Object m2855() {
        try {
            return this.f2312.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2860(Context context, Object family, String fileName, int ttcIndex, int weight, int style, FontVariationAxis[] axes) {
        try {
            return ((Boolean) this.f2313.invoke(family, context.getAssets(), fileName, 0, false, Integer.valueOf(ttcIndex), Integer.valueOf(weight), Integer.valueOf(style), axes)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2862(Object family, ByteBuffer buffer, int ttcIndex, int weight, int style) {
        try {
            return ((Boolean) this.f2310.invoke(family, buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Integer.valueOf(style))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Typeface m2853(Object family) {
        try {
            Object familyArray = Array.newInstance(this.f2311, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.f2308.invoke(null, familyArray, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2861(Object family) {
        try {
            return ((Boolean) this.f2309.invoke(family, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2858(Object family) {
        try {
            this.f2307.invoke(family, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // ♫.C0093
    /* renamed from: θ  reason: contains not printable characters */
    public Typeface m2852(Context context, C0103.C0106 entry, Resources resources, int style) {
        if (!m2859()) {
            return super.m516(context, entry, resources, style);
        }
        Object fontFamily = m2855();
        C0103.C0105[] r10 = entry.m560();
        for (C0103.C0105 fontFile : r10) {
            if (!m2860(context, fontFamily, fontFile.m558(), fontFile.m555(), fontFile.m554(), fontFile.m559() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontFile.m556()))) {
                m2858(fontFamily);
                return null;
            }
        }
        if (!m2861(fontFamily)) {
            return null;
        }
        return m2853(fontFamily);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:50:0x00a6 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        r0.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        throw r0;
     */
    @Override // ♫.C0193, ♫.C0093
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface m2851(android.content.Context r20, android.os.CancellationSignal r21, ♫.C0599.C0600[] r22, int r23) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0583.m2851(android.content.Context, android.os.CancellationSignal, ♫.ｰ$µ[], int):android.graphics.Typeface");
    }

    @Override // ♫.C0093
    /* renamed from: θ  reason: contains not printable characters */
    public Typeface m2850(Context context, Resources resources, int id, String path, int style) {
        if (!m2859()) {
            return super.m513(context, resources, id, path, style);
        }
        Object fontFamily = m2855();
        if (!m2860(context, fontFamily, path, 0, -1, -1, null)) {
            m2858(fontFamily);
            return null;
        } else if (!m2861(fontFamily)) {
            return null;
        } else {
            return m2853(fontFamily);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Class m2854() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Constructor m2856(Class fontFamily) {
        return fontFamily.getConstructor(new Class[0]);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public Method m2849(Class fontFamily) {
        Class<?> cls = Integer.TYPE;
        return fontFamily.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls, cls, cls, FontVariationAxis[].class);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public Method m2848(Class fontFamily) {
        Class<?> cls = Integer.TYPE;
        return fontFamily.getMethod("addFontFromBuffer", ByteBuffer.class, cls, FontVariationAxis[].class, cls, cls);
    }

    /* renamed from: ö  reason: contains not printable characters */
    public Method m2847(Class fontFamily) {
        return fontFamily.getMethod("freeze", new Class[0]);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Method m2857(Class fontFamily) {
        return fontFamily.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public Method m2846(Class fontFamily) {
        Class cls = Integer.TYPE;
        Method m = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(fontFamily, 1).getClass(), cls, cls);
        m.setAccessible(true);
        return m;
    }
}
