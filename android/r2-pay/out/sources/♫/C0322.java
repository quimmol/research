package ♫;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: ♫.主  reason: contains not printable characters */
public class C0322 {

    /* renamed from: Ø  reason: contains not printable characters */
    public static boolean f1130;

    /* renamed from: ø  reason: contains not printable characters */
    public static Field f1131;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public static boolean f1132;

    /* renamed from: Φ  reason: contains not printable characters */
    public static Field f1133;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public static boolean f1134;

    /* renamed from: θ  reason: contains not printable characters */
    public static Class f1135;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static Field f1136;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static boolean f1137;

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1463(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m1460(resources);
            } else if (i >= 23) {
                m1461(resources);
            } else {
                m1462(resources);
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static void m1462(Resources resources) {
        if (!f1137) {
            try {
                f1136 = Resources.class.getDeclaredField("mDrawableCache");
                f1136.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1137 = true;
        }
        Field field = f1136;
        if (field != null) {
            Map drawableCache = null;
            try {
                drawableCache = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
            if (drawableCache != null) {
                drawableCache.clear();
            }
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public static void m1461(Resources resources) {
        if (!f1137) {
            try {
                f1136 = Resources.class.getDeclaredField("mDrawableCache");
                f1136.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
            }
            f1137 = true;
        }
        Object drawableCache = null;
        Field field = f1136;
        if (field != null) {
            try {
                drawableCache = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (drawableCache != null) {
            m1464(drawableCache);
        }
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public static void m1460(Resources resources) {
        if (!f1130) {
            try {
                f1131 = Resources.class.getDeclaredField("mResourcesImpl");
                f1131.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f1130 = true;
        }
        Field field = f1131;
        if (field != null) {
            Object resourcesImpl = null;
            try {
                resourcesImpl = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            }
            if (resourcesImpl != null) {
                if (!f1137) {
                    try {
                        f1136 = resourcesImpl.getClass().getDeclaredField("mDrawableCache");
                        f1136.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f1137 = true;
                }
                Object drawableCache = null;
                Field field2 = f1136;
                if (field2 != null) {
                    try {
                        drawableCache = field2.get(resourcesImpl);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (drawableCache != null) {
                    m1464(drawableCache);
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1464(Object cache) {
        if (!f1134) {
            try {
                f1135 = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f1134 = true;
        }
        Class cls = f1135;
        if (cls != null) {
            if (!f1132) {
                try {
                    f1133 = cls.getDeclaredField("mUnthemedEntries");
                    f1133.setAccessible(true);
                } catch (NoSuchFieldException ee) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", ee);
                }
                f1132 = true;
            }
            Field field = f1133;
            if (field != null) {
                LongSparseArray unthemedEntries = null;
                try {
                    unthemedEntries = (LongSparseArray) field.get(cache);
                } catch (IllegalAccessException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e2);
                }
                if (unthemedEntries != null) {
                    unthemedEntries.clear();
                }
            }
        }
    }
}
