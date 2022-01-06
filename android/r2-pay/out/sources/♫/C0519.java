package ♫;

import androidx.collection.LongSparseArray;

/* renamed from: ♫.笔  reason: contains not printable characters */
public class C0519<E> implements Cloneable {

    /* renamed from: θ  reason: contains not printable characters */
    public static final Object f1913 = new Object();

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean f1914;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f1915;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public long[] f1916;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Object[] f1917;

    public C0519() {
        this(10);
    }

    public C0519(int initialCapacity) {
        this.f1914 = false;
        if (initialCapacity == 0) {
            this.f1916 = C0518.f1911;
            this.f1917 = C0518.f1912;
        } else {
            int initialCapacity2 = C0518.m2432(initialCapacity);
            this.f1916 = new long[initialCapacity2];
            this.f1917 = new Object[initialCapacity2];
        }
        this.f1915 = 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0519<E> clone() {
        try {
            LongSparseArray<E> clone = (C0519) super.clone();
            clone.f1916 = (long[]) this.f1916.clone();
            clone.f1917 = (Object[]) this.f1917.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public E m2443(long key) {
        return m2444(key, (Object) null);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public E m2444(long key, E valueIfKeyNotFound) {
        int i = C0518.m2436(this.f1916, this.f1915, key);
        if (i >= 0) {
            Object[] objArr = this.f1917;
            if (objArr[i] != f1913) {
                return (E) objArr[i];
            }
        }
        return valueIfKeyNotFound;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2447(long key) {
        Object[] objArr;
        Object obj;
        int i = C0518.m2436(this.f1916, this.f1915, key);
        if (i >= 0 && (objArr = this.f1917)[i] != (obj = f1913)) {
            objArr[i] = obj;
            this.f1914 = true;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2438() {
        int n = this.f1915;
        int o = 0;
        long[] keys = this.f1916;
        Object[] values = this.f1917;
        for (int i = 0; i < n; i++) {
            Object val = values[i];
            if (val != f1913) {
                if (i != o) {
                    keys[o] = keys[i];
                    values[o] = val;
                    values[i] = null;
                }
                o++;
            }
        }
        this.f1914 = false;
        this.f1915 = o;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2439(long key, E value) {
        int i = C0518.m2436(this.f1916, this.f1915, key);
        if (i >= 0) {
            this.f1917[i] = value;
            return;
        }
        int i2 = ~i;
        if (i2 < this.f1915) {
            Object[] objArr = this.f1917;
            if (objArr[i2] == f1913) {
                this.f1916[i2] = key;
                objArr[i2] = value;
                return;
            }
        }
        if (this.f1914 && this.f1915 >= this.f1916.length) {
            m2438();
            i2 = ~C0518.m2436(this.f1916, this.f1915, key);
        }
        int i3 = this.f1915;
        if (i3 >= this.f1916.length) {
            int n = C0518.m2432(i3 + 1);
            long[] nkeys = new long[n];
            Object[] nvalues = new Object[n];
            long[] jArr = this.f1916;
            System.arraycopy(jArr, 0, nkeys, 0, jArr.length);
            Object[] objArr2 = this.f1917;
            System.arraycopy(objArr2, 0, nvalues, 0, objArr2.length);
            this.f1916 = nkeys;
            this.f1917 = nvalues;
        }
        int n2 = this.f1915;
        if (n2 - i2 != 0) {
            long[] jArr2 = this.f1916;
            System.arraycopy(jArr2, i2, jArr2, i2 + 1, n2 - i2);
            Object[] objArr3 = this.f1917;
            System.arraycopy(objArr3, i2, objArr3, i2 + 1, this.f1915 - i2);
        }
        this.f1916[i2] = key;
        this.f1917[i2] = value;
        this.f1915++;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2440() {
        if (this.f1914) {
            m2438();
        }
        return this.f1915;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public long m2441(int index) {
        if (this.f1914) {
            m2438();
        }
        return this.f1916[index];
    }

    /* renamed from: θ  reason: contains not printable characters */
    public E m2442(int index) {
        if (this.f1914) {
            m2438();
        }
        return (E) this.f1917[index];
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2446() {
        int n = this.f1915;
        Object[] values = this.f1917;
        for (int i = 0; i < n; i++) {
            values[i] = null;
        }
        this.f1915 = 0;
        this.f1914 = false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2448(long key, E value) {
        int i = this.f1915;
        if (i == 0 || key > this.f1916[i - 1]) {
            if (this.f1914 && this.f1915 >= this.f1916.length) {
                m2438();
            }
            int pos = this.f1915;
            if (pos >= this.f1916.length) {
                int n = C0518.m2432(pos + 1);
                long[] nkeys = new long[n];
                Object[] nvalues = new Object[n];
                long[] jArr = this.f1916;
                System.arraycopy(jArr, 0, nkeys, 0, jArr.length);
                Object[] objArr = this.f1917;
                System.arraycopy(objArr, 0, nvalues, 0, objArr.length);
                this.f1916 = nkeys;
                this.f1917 = nvalues;
            }
            this.f1916[pos] = key;
            this.f1917[pos] = value;
            this.f1915 = pos + 1;
            return;
        }
        m2439(key, value);
    }

    public String toString() {
        if (m2440() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f1915 * 28);
        buffer.append('{');
        for (int i = 0; i < this.f1915; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(m2441(i));
            buffer.append('=');
            Object value = m2442(i);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Map)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }
}
