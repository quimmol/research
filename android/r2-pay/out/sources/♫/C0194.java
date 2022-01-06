package ♫;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import ♫.C0103;
import ♫.C0599;

/* renamed from: ♫.ᐨ  reason: contains not printable characters */
public class C0194 extends C0093 {

    /* renamed from: Φ  reason: contains not printable characters */
    public static final Method f811;

    /* renamed from: θ  reason: contains not printable characters */
    public static final Class f812;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final Constructor f813;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final Method f814;

    static {
        Method addFontMethod;
        Constructor fontFamilyCtor;
        Method createFromFamiliesWithDefaultMethod;
        Class fontFamilyClass;
        ReflectiveOperationException e;
        try {
            fontFamilyClass = Class.forName("android.graphics.FontFamily");
            try {
                fontFamilyCtor = fontFamilyClass.getConstructor(new Class[0]);
                try {
                    addFontMethod = fontFamilyClass.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
                    try {
                        createFromFamiliesWithDefaultMethod = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(fontFamilyClass, 1).getClass());
                    } catch (ClassNotFoundException | NoSuchMethodException e2) {
                        e = e2;
                    }
                } catch (ClassNotFoundException | NoSuchMethodException e3) {
                    e = e3;
                    Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
                    fontFamilyClass = null;
                    fontFamilyCtor = null;
                    addFontMethod = null;
                    createFromFamiliesWithDefaultMethod = null;
                    f813 = fontFamilyCtor;
                    f812 = fontFamilyClass;
                    f814 = addFontMethod;
                    f811 = createFromFamiliesWithDefaultMethod;
                }
            } catch (ClassNotFoundException | NoSuchMethodException e4) {
                e = e4;
                Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
                fontFamilyClass = null;
                fontFamilyCtor = null;
                addFontMethod = null;
                createFromFamiliesWithDefaultMethod = null;
                f813 = fontFamilyCtor;
                f812 = fontFamilyClass;
                f814 = addFontMethod;
                f811 = createFromFamiliesWithDefaultMethod;
            }
        } catch (ClassNotFoundException | NoSuchMethodException e5) {
            e = e5;
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            fontFamilyClass = null;
            fontFamilyCtor = null;
            addFontMethod = null;
            createFromFamiliesWithDefaultMethod = null;
            f813 = fontFamilyCtor;
            f812 = fontFamilyClass;
            f814 = addFontMethod;
            f811 = createFromFamiliesWithDefaultMethod;
        }
        f813 = fontFamilyCtor;
        f812 = fontFamilyClass;
        f814 = addFontMethod;
        f811 = createFromFamiliesWithDefaultMethod;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m919() {
        if (f814 == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return f814 != null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Object m918() {
        try {
            return f813.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m920(Object family, ByteBuffer buffer, int ttcIndex, int weight, boolean style) {
        try {
            return ((Boolean) f814.invoke(family, buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Boolean.valueOf(style))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Typeface m917(Object family) {
        try {
            Object familyArray = Array.newInstance(f812, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) f811.invoke(null, familyArray);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // ♫.C0093
    /* renamed from: θ  reason: contains not printable characters */
    public Typeface m921(Context context, CancellationSignal cancellationSignal, C0599.C0600[] fonts, int style) {
        Object family = m918();
        SimpleArrayMap<Uri, ByteBuffer> bufferCache = new C0527<>();
        for (C0599.C0600 font : fonts) {
            Uri uri = font.m2915();
            ByteBuffer buffer = (ByteBuffer) bufferCache.get(uri);
            if (buffer == null) {
                buffer = C0167.m812(context, cancellationSignal, uri);
                bufferCache.put(uri, buffer);
            }
            if (!m920(family, buffer, font.m2913(), font.m2912(), font.m2916())) {
                return null;
            }
        }
        return Typeface.create(m917(family), style);
    }

    @Override // ♫.C0093
    /* renamed from: θ  reason: contains not printable characters */
    public Typeface m922(Context context, C0103.C0106 entry, Resources resources, int style) {
        Object family = m918();
        C0103.C0105[] r1 = entry.m560();
        for (C0103.C0105 e : r1) {
            ByteBuffer buffer = C0167.m811(context, resources, e.m557());
            if (buffer == null || !m920(family, buffer, e.m555(), e.m554(), e.m559())) {
                return null;
            }
        }
        return m917(family);
    }
}
