package ♫;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ♫.ﾞ  reason: contains not printable characters */
public class C0607 extends C0583 {
    @Override // ♫.C0583, ♫.C0583, ♫.C0583
    /* renamed from: θ  reason: contains not printable characters */
    public Typeface m2926(Object family) {
        try {
            Object familyArray = Array.newInstance(((C0583) this).f2311, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) this.f2308.invoke(null, familyArray, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // ♫.C0583
    /* renamed from: Ø  reason: contains not printable characters */
    public Method m2925(Class fontFamily) {
        Class cls = Integer.TYPE;
        Method m = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(fontFamily, 1).getClass(), String.class, cls, cls);
        m.setAccessible(true);
        return m;
    }
}
