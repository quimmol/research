package ♫;

import androidx.collection.SimpleArrayMap;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: ♫.者  reason: contains not printable characters */
public class C0527<K, V> {

    /* renamed from: ø  reason: contains not printable characters */
    public static int f1941;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public static Object[] f1942;

    /* renamed from: Φ  reason: contains not printable characters */
    public static int f1943;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public static Object[] f1944;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1945;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int[] f1946;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Object[] f1947;

    /* renamed from: θ  reason: contains not printable characters */
    public static int m2476(int[] hashes, int N, int hash) {
        try {
            return C0518.m2435(hashes, N, hash);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2484(Object key, int hash) {
        int N = this.f1945;
        if (N == 0) {
            return -1;
        }
        int index = m2476(this.f1946, N, hash);
        if (index < 0 || key.equals(this.f1947[index << 1])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f1946[end] == hash) {
            if (key.equals(this.f1947[end << 1])) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f1946[i] == hash) {
            if (key.equals(this.f1947[i << 1])) {
                return i;
            }
            i--;
        }
        return ~end;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2482() {
        int N = this.f1945;
        if (N == 0) {
            return -1;
        }
        int index = m2476(this.f1946, N, 0);
        if (index < 0 || this.f1947[index << 1] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f1946[end] == 0) {
            if (this.f1947[end << 1] == null) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f1946[i] == 0) {
            if (this.f1947[i << 1] == null) {
                return i;
            }
            i--;
        }
        return ~end;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2487(int size) {
        if (size == 8) {
            synchronized (C0514.class) {
                if (f1942 != null) {
                    Object[] array = f1942;
                    this.f1947 = array;
                    f1942 = (Object[]) array[0];
                    this.f1946 = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    f1941--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (C0514.class) {
                if (f1944 != null) {
                    Object[] array2 = f1944;
                    this.f1947 = array2;
                    f1944 = (Object[]) array2[0];
                    this.f1946 = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    f1943--;
                    return;
                }
            }
        }
        this.f1946 = new int[size];
        this.f1947 = new Object[(size << 1)];
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2477(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (C0514.class) {
                if (f1941 < 10) {
                    array[0] = f1942;
                    array[1] = hashes;
                    for (int i = (size << 1) - 1; i >= 2; i--) {
                        array[i] = null;
                    }
                    f1942 = array;
                    f1941++;
                }
            }
        } else if (hashes.length == 4) {
            synchronized (C0514.class) {
                if (f1943 < 10) {
                    array[0] = f1944;
                    array[1] = hashes;
                    for (int i2 = (size << 1) - 1; i2 >= 2; i2--) {
                        array[i2] = null;
                    }
                    f1944 = array;
                    f1943++;
                }
            }
        }
    }

    public C0527() {
        this.f1946 = C0518.f1910;
        this.f1947 = C0518.f1912;
        this.f1945 = 0;
    }

    public C0527(int capacity) {
        if (capacity == 0) {
            this.f1946 = C0518.f1910;
            this.f1947 = C0518.f1912;
        } else {
            m2487(capacity);
        }
        this.f1945 = 0;
    }

    public void clear() {
        if (this.f1945 > 0) {
            int[] ohashes = this.f1946;
            Object[] oarray = this.f1947;
            int osize = this.f1945;
            this.f1946 = C0518.f1910;
            this.f1947 = C0518.f1912;
            this.f1945 = 0;
            m2477(ohashes, oarray, osize);
        }
        if (this.f1945 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2481(int minimumCapacity) {
        int osize = this.f1945;
        if (this.f1946.length < minimumCapacity) {
            int[] ohashes = this.f1946;
            Object[] oarray = this.f1947;
            m2487(minimumCapacity);
            if (this.f1945 > 0) {
                System.arraycopy(ohashes, 0, this.f1946, 0, osize);
                System.arraycopy(oarray, 0, this.f1947, 0, osize << 1);
            }
            m2477(ohashes, oarray, osize);
        }
        if (this.f1945 != osize) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object key) {
        return m2483(key) >= 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2483(Object key) {
        return key == null ? m2482() : m2484(key, key.hashCode());
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public int m2479(Object value) {
        int N = this.f1945 * 2;
        Object[] array = this.f1947;
        if (value == null) {
            for (int i = 1; i < N; i += 2) {
                if (array[i] == null) {
                    return i >> 1;
                }
            }
            return -1;
        }
        for (int i2 = 1; i2 < N; i2 += 2) {
            if (value.equals(array[i2])) {
                return i2 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object value) {
        return m2479(value) >= 0;
    }

    public V get(Object key) {
        int index = m2483(key);
        if (index >= 0) {
            return (V) this.f1947[(index << 1) + 1];
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public K m2485(int index) {
        return (K) this.f1947[index << 1];
    }

    /* renamed from: ø  reason: contains not printable characters */
    public V m2478(int index) {
        return (V) this.f1947[(index << 1) + 1];
    }

    /* renamed from: θ  reason: contains not printable characters */
    public V m2486(int index, V value) {
        int index2 = (index << 1) + 1;
        Object[] objArr = this.f1947;
        V old = (V) objArr[index2];
        objArr[index2] = value;
        return old;
    }

    public boolean isEmpty() {
        return this.f1945 <= 0;
    }

    public V put(K key, V value) {
        int index;
        int hash;
        int osize = this.f1945;
        if (key == null) {
            hash = 0;
            index = m2482();
        } else {
            hash = key.hashCode();
            index = m2484(key, hash);
        }
        if (index >= 0) {
            int index2 = (index << 1) + 1;
            Object[] objArr = this.f1947;
            V old = (V) objArr[index2];
            objArr[index2] = value;
            return old;
        }
        int index3 = ~index;
        if (osize >= this.f1946.length) {
            int n = 4;
            if (osize >= 8) {
                n = (osize >> 1) + osize;
            } else if (osize >= 4) {
                n = 8;
            }
            int[] ohashes = this.f1946;
            Object[] oarray = this.f1947;
            m2487(n);
            if (osize == this.f1945) {
                int[] iArr = this.f1946;
                if (iArr.length > 0) {
                    System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                    System.arraycopy(oarray, 0, this.f1947, 0, oarray.length);
                }
                m2477(ohashes, oarray, osize);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (index3 < osize) {
            int[] iArr2 = this.f1946;
            System.arraycopy(iArr2, index3, iArr2, index3 + 1, osize - index3);
            Object[] objArr2 = this.f1947;
            System.arraycopy(objArr2, index3 << 1, objArr2, (index3 + 1) << 1, (this.f1945 - index3) << 1);
        }
        int i = this.f1945;
        if (osize == i) {
            int[] iArr3 = this.f1946;
            if (index3 < iArr3.length) {
                iArr3[index3] = hash;
                Object[] objArr3 = this.f1947;
                objArr3[index3 << 1] = key;
                objArr3[(index3 << 1) + 1] = value;
                this.f1945 = i + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object key) {
        int index = m2483(key);
        if (index >= 0) {
            return m2480(index);
        }
        return null;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public V m2480(int index) {
        int nsize;
        Object[] objArr = this.f1947;
        V v = (V) objArr[(index << 1) + 1];
        int osize = this.f1945;
        if (osize <= 1) {
            m2477(this.f1946, objArr, osize);
            this.f1946 = C0518.f1910;
            this.f1947 = C0518.f1912;
            nsize = 0;
        } else {
            nsize = osize - 1;
            int[] iArr = this.f1946;
            int n = 8;
            if (iArr.length <= 8 || this.f1945 >= iArr.length / 3) {
                if (index < nsize) {
                    int[] iArr2 = this.f1946;
                    System.arraycopy(iArr2, index + 1, iArr2, index, nsize - index);
                    Object[] objArr2 = this.f1947;
                    System.arraycopy(objArr2, (index + 1) << 1, objArr2, index << 1, (nsize - index) << 1);
                }
                Object[] objArr3 = this.f1947;
                objArr3[nsize << 1] = null;
                objArr3[(nsize << 1) + 1] = null;
            } else {
                if (osize > 8) {
                    n = osize + (osize >> 1);
                }
                int[] ohashes = this.f1946;
                Object[] oarray = this.f1947;
                m2487(n);
                if (osize == this.f1945) {
                    if (index > 0) {
                        System.arraycopy(ohashes, 0, this.f1946, 0, index);
                        System.arraycopy(oarray, 0, this.f1947, 0, index << 1);
                    }
                    if (index < nsize) {
                        System.arraycopy(ohashes, index + 1, this.f1946, index, nsize - index);
                        System.arraycopy(oarray, (index + 1) << 1, this.f1947, index << 1, (nsize - index) << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (osize == this.f1945) {
            this.f1945 = nsize;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public int size() {
        return this.f1945;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof C0527) {
            SimpleArrayMap<?, ?> map = (C0527) object;
            if (size() != map.size()) {
                return false;
            }
            for (int i = 0; i < this.f1945; i++) {
                try {
                    K key = m2485(i);
                    V mine = m2478(i);
                    Object theirs = map.get(key);
                    if (mine == null) {
                        if (theirs != null || !map.containsKey(key)) {
                            return false;
                        }
                    } else if (!mine.equals(theirs)) {
                        return false;
                    }
                } catch (NullPointerException e) {
                    return false;
                } catch (ClassCastException e2) {
                    return false;
                }
            }
            return true;
        } else if (!(object instanceof Map)) {
            return false;
        } else {
            Map<?, ?> map2 = (Map) object;
            if (size() != map2.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1945; i2++) {
                try {
                    K key2 = m2485(i2);
                    V mine2 = m2478(i2);
                    Object theirs2 = map2.get(key2);
                    if (mine2 == null) {
                        if (theirs2 != null || !map2.containsKey(key2)) {
                            return false;
                        }
                    } else if (!mine2.equals(theirs2)) {
                        return false;
                    }
                } catch (NullPointerException e3) {
                    return false;
                } catch (ClassCastException e4) {
                    return false;
                }
            }
            return true;
        }
    }

    public int hashCode() {
        int[] hashes = this.f1946;
        Object[] array = this.f1947;
        int result = 0;
        int i = 0;
        int v = 1;
        int s = this.f1945;
        while (i < s) {
            Object value = array[v];
            result += hashes[i] ^ (value == null ? 0 : value.hashCode());
            i++;
            v += 2;
        }
        return result;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f1945 * 28);
        buffer.append('{');
        for (int i = 0; i < this.f1945; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            Object key = m2485(i);
            if (key != this) {
                buffer.append(key);
            } else {
                buffer.append("(this Map)");
            }
            buffer.append('=');
            Object value = m2478(i);
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
