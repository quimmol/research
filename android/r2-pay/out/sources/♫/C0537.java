package ♫;

/* renamed from: ♫.见  reason: contains not printable characters */
public class C0537<T> implements AbstractC0536<T> {

    /* renamed from: θ  reason: contains not printable characters */
    public int f1989;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Object[] f1990;

    public C0537(int maxPoolSize) {
        if (maxPoolSize > 0) {
            this.f1990 = new Object[maxPoolSize];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public T m2575() {
        int i = this.f1989;
        if (i <= 0) {
            return null;
        }
        int lastPooledIndex = i - 1;
        Object[] objArr = this.f1990;
        T instance = (T) objArr[lastPooledIndex];
        objArr[lastPooledIndex] = null;
        this.f1989 = i - 1;
        return instance;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2577(T instance) {
        int i = this.f1989;
        Object[] objArr = this.f1990;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = instance;
        this.f1989 = i + 1;
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2576(T[] variables, int count) {
        if (count > variables.length) {
            count = variables.length;
        }
        for (int i = 0; i < count; i++) {
            T instance = variables[i];
            int i2 = this.f1989;
            Object[] objArr = this.f1990;
            if (i2 < objArr.length) {
                objArr[i2] = instance;
                this.f1989 = i2 + 1;
            }
        }
    }
}
