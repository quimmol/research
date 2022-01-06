package ♫;

import androidx.collection.SparseArrayCompat;

/* renamed from: ♫.能  reason: contains not printable characters */
public class C0528<E> implements Cloneable {

    /* renamed from: θ  reason: contains not printable characters */
    public static final Object f1948 = new Object();

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean f1949;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f1950;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int[] f1951;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Object[] f1952;

    public C0528() {
        this(10);
    }

    public C0528(int initialCapacity) {
        this.f1949 = false;
        if (initialCapacity == 0) {
            this.f1951 = C0518.f1910;
            this.f1952 = C0518.f1912;
        } else {
            int initialCapacity2 = C0518.m2433(initialCapacity);
            this.f1951 = new int[initialCapacity2];
            this.f1952 = new Object[initialCapacity2];
        }
        this.f1950 = 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0528<E> clone() {
        try {
            SparseArrayCompat<E> clone = (C0528) super.clone();
            clone.f1951 = (int[]) this.f1951.clone();
            clone.f1952 = (Object[]) this.f1952.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public E m2494(int key) {
        return m2495(key, (Object) null);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public E m2495(int key, E valueIfKeyNotFound) {
        int i = C0518.m2435(this.f1951, this.f1950, key);
        if (i >= 0) {
            Object[] objArr = this.f1952;
            if (objArr[i] != f1948) {
                return (E) objArr[i];
            }
        }
        return valueIfKeyNotFound;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2498(int key) {
        Object[] objArr;
        Object obj;
        int i = C0518.m2435(this.f1951, this.f1950, key);
        if (i >= 0 && (objArr = this.f1952)[i] != (obj = f1948)) {
            objArr[i] = obj;
            this.f1949 = true;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2490(int key) {
        m2498(key);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2489() {
        int n = this.f1950;
        int o = 0;
        int[] keys = this.f1951;
        Object[] values = this.f1952;
        for (int i = 0; i < n; i++) {
            Object val = values[i];
            if (val != f1948) {
                if (i != o) {
                    keys[o] = keys[i];
                    values[o] = val;
                    values[i] = null;
                }
                o++;
            }
        }
        this.f1949 = false;
        this.f1950 = o;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2491(int key, E value) {
        int i = C0518.m2435(this.f1951, this.f1950, key);
        if (i >= 0) {
            this.f1952[i] = value;
            return;
        }
        int i2 = ~i;
        if (i2 < this.f1950) {
            Object[] objArr = this.f1952;
            if (objArr[i2] == f1948) {
                this.f1951[i2] = key;
                objArr[i2] = value;
                return;
            }
        }
        if (this.f1949 && this.f1950 >= this.f1951.length) {
            m2489();
            i2 = ~C0518.m2435(this.f1951, this.f1950, key);
        }
        int i3 = this.f1950;
        if (i3 >= this.f1951.length) {
            int n = C0518.m2433(i3 + 1);
            int[] nkeys = new int[n];
            Object[] nvalues = new Object[n];
            int[] iArr = this.f1951;
            System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
            Object[] objArr2 = this.f1952;
            System.arraycopy(objArr2, 0, nvalues, 0, objArr2.length);
            this.f1951 = nkeys;
            this.f1952 = nvalues;
        }
        int n2 = this.f1950;
        if (n2 - i2 != 0) {
            int[] iArr2 = this.f1951;
            System.arraycopy(iArr2, i2, iArr2, i2 + 1, n2 - i2);
            Object[] objArr3 = this.f1952;
            System.arraycopy(objArr3, i2, objArr3, i2 + 1, this.f1950 - i2);
        }
        this.f1951[i2] = key;
        this.f1952[i2] = value;
        this.f1950++;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2492() {
        if (this.f1949) {
            m2489();
        }
        return this.f1950;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2493(int index) {
        if (this.f1949) {
            m2489();
        }
        return this.f1951[index];
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public E m2488(int index) {
        if (this.f1949) {
            m2489();
        }
        return (E) this.f1952[index];
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2497() {
        int n = this.f1950;
        Object[] values = this.f1952;
        for (int i = 0; i < n; i++) {
            values[i] = null;
        }
        this.f1950 = 0;
        this.f1949 = false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2499(int key, E value) {
        int i = this.f1950;
        if (i == 0 || key > this.f1951[i - 1]) {
            if (this.f1949 && this.f1950 >= this.f1951.length) {
                m2489();
            }
            int pos = this.f1950;
            if (pos >= this.f1951.length) {
                int n = C0518.m2433(pos + 1);
                int[] nkeys = new int[n];
                Object[] nvalues = new Object[n];
                int[] iArr = this.f1951;
                System.arraycopy(iArr, 0, nkeys, 0, iArr.length);
                Object[] objArr = this.f1952;
                System.arraycopy(objArr, 0, nvalues, 0, objArr.length);
                this.f1951 = nkeys;
                this.f1952 = nvalues;
            }
            this.f1951[pos] = key;
            this.f1952[pos] = value;
            this.f1950 = pos + 1;
            return;
        }
        m2491(key, value);
    }

    public String toString() {
        if (m2492() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f1950 * 28);
        buffer.append('{');
        for (int i = 0; i < this.f1950; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            buffer.append(m2493(i));
            buffer.append('=');
            Object value = m2488(i);
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
