package ♫;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: ♫.ᕐ  reason: contains not printable characters */
public abstract class AbstractC0243 {
    /* renamed from: Φ  reason: contains not printable characters */
    public abstract void m1091(int i);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract int m1093();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract <T extends Parcelable> T m1095();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract String m1097();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract AbstractC0243 m1099();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1101();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1102(int i);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1104(Parcelable parcelable);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1106(String str);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1109(byte[] bArr);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract boolean m1112(int i);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract byte[] m1113();

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1111() {
        return false;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m1090() {
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1110(byte[] b, int fieldId) {
        m1102(fieldId);
        m1109(b);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1103(int val, int fieldId) {
        m1102(fieldId);
        m1091(val);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1107(String val, int fieldId) {
        m1102(fieldId);
        m1106(val);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1105(Parcelable p, int fieldId) {
        m1102(fieldId);
        m1104(p);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m1094(int def, int fieldId) {
        if (!m1112(fieldId)) {
            return def;
        }
        return m1093();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public String m1098(String def, int fieldId) {
        if (!m1112(fieldId)) {
            return def;
        }
        return m1097();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public byte[] m1114(byte[] def, int fieldId) {
        if (!m1112(fieldId)) {
            return def;
        }
        return m1113();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public <T extends Parcelable> T m1096(T def, int fieldId) {
        return !m1112(fieldId) ? def : (T) m1095();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1108(AbstractC0266 p) {
        if (p == null) {
            m1106((String) null);
            return;
        }
        m1092(p);
        AbstractC0243 subParcel = m1099();
        m1089(p, subParcel);
        subParcel.m1101();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m1092(AbstractC0266 p) {
        try {
            m1106(m1086((Class<? extends AbstractC0266>) p.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(p.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public <T extends AbstractC0266> T m1100() {
        String name = m1097();
        if (name == null) {
            return null;
        }
        return (T) m1088(name, m1099());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static <T extends AbstractC0266> T m1088(String parcelCls, AbstractC0243 versionedParcel) {
        try {
            return (T) ((AbstractC0266) Class.forName(parcelCls, true, AbstractC0243.class.getClassLoader()).getDeclaredMethod("read", AbstractC0243.class).invoke(null, versionedParcel));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static <T extends AbstractC0266> void m1089(T val, AbstractC0243 versionedParcel) {
        try {
            m1087((AbstractC0266) val).getDeclaredMethod("write", val.getClass(), AbstractC0243.class).invoke(null, val, versionedParcel);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static <T extends AbstractC0266> Class m1087(T val) {
        return m1086((Class<? extends AbstractC0266>) val.getClass());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Class m1086(Class<? extends AbstractC0266> cls) {
        return Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
    }
}
