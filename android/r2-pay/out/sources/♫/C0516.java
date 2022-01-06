package ♫;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ♫.竟  reason: contains not printable characters */
public final class C0516<E> implements Collection<E>, Set<E> {

    /* renamed from: Ø  reason: contains not printable characters */
    public static Object[] f1899;

    /* renamed from: ø  reason: contains not printable characters */
    public static int f1900;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public static Object[] f1901;

    /* renamed from: Φ  reason: contains not printable characters */
    public static int f1902;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public static final int[] f1903 = new int[0];

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public static final Object[] f1904 = new Object[0];

    /* renamed from: θ  reason: contains not printable characters */
    public int f1905;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0521<E, E> f1906;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int[] f1907;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Object[] f1908;

    /* renamed from: θ  reason: contains not printable characters */
    public final int m2419(Object key, int hash) {
        int N = this.f1905;
        if (N == 0) {
            return -1;
        }
        int index = C0518.m2435(this.f1907, N, hash);
        if (index < 0 || key.equals(this.f1908[index])) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f1907[end] == hash) {
            if (key.equals(this.f1908[end])) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f1907[i] == hash) {
            if (key.equals(this.f1908[i])) {
                return i;
            }
            i--;
        }
        return ~end;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m2417() {
        int N = this.f1905;
        if (N == 0) {
            return -1;
        }
        int index = C0518.m2435(this.f1907, N, 0);
        if (index < 0 || this.f1908[index] == null) {
            return index;
        }
        int end = index + 1;
        while (end < N && this.f1907[end] == 0) {
            if (this.f1908[end] == null) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.f1907[i] == 0) {
            if (this.f1908[i] == null) {
                return i;
            }
            i--;
        }
        return ~end;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2422(int size) {
        if (size == 8) {
            synchronized (C0516.class) {
                if (f1899 != null) {
                    Object[] array = f1899;
                    this.f1908 = array;
                    f1899 = (Object[]) array[0];
                    this.f1907 = (int[]) array[1];
                    array[1] = null;
                    array[0] = null;
                    f1900--;
                    return;
                }
            }
        } else if (size == 4) {
            synchronized (C0516.class) {
                if (f1901 != null) {
                    Object[] array2 = f1901;
                    this.f1908 = array2;
                    f1901 = (Object[]) array2[0];
                    this.f1907 = (int[]) array2[1];
                    array2[1] = null;
                    array2[0] = null;
                    f1902--;
                    return;
                }
            }
        }
        this.f1907 = new int[size];
        this.f1908 = new Object[size];
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2414(int[] hashes, Object[] array, int size) {
        if (hashes.length == 8) {
            synchronized (C0516.class) {
                if (f1900 < 10) {
                    array[0] = f1899;
                    array[1] = hashes;
                    for (int i = size - 1; i >= 2; i--) {
                        array[i] = null;
                    }
                    f1899 = array;
                    f1900++;
                }
            }
        } else if (hashes.length == 4) {
            synchronized (C0516.class) {
                if (f1902 < 10) {
                    array[0] = f1901;
                    array[1] = hashes;
                    for (int i2 = size - 1; i2 >= 2; i2--) {
                        array[i2] = null;
                    }
                    f1901 = array;
                    f1902++;
                }
            }
        }
    }

    public C0516() {
        this(0);
    }

    public C0516(int capacity) {
        if (capacity == 0) {
            this.f1907 = f1903;
            this.f1908 = f1904;
        } else {
            m2422(capacity);
        }
        this.f1905 = 0;
    }

    public void clear() {
        int i = this.f1905;
        if (i != 0) {
            m2414(this.f1907, this.f1908, i);
            this.f1907 = f1903;
            this.f1908 = f1904;
            this.f1905 = 0;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2416(int minimumCapacity) {
        if (this.f1907.length < minimumCapacity) {
            int[] ohashes = this.f1907;
            Object[] oarray = this.f1908;
            m2422(minimumCapacity);
            int i = this.f1905;
            if (i > 0) {
                System.arraycopy(ohashes, 0, this.f1907, 0, i);
                System.arraycopy(oarray, 0, this.f1908, 0, this.f1905);
            }
            m2414(ohashes, oarray, this.f1905);
        }
    }

    public boolean contains(Object key) {
        return m2418(key) >= 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2418(Object key) {
        return key == null ? m2417() : m2419(key, key.hashCode());
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public E m2415(int index) {
        return (E) this.f1908[index];
    }

    public boolean isEmpty() {
        return this.f1905 <= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E value) {
        int index;
        int hash;
        if (value == null) {
            hash = 0;
            index = m2417();
        } else {
            hash = value.hashCode();
            index = m2419(value, hash);
        }
        if (index >= 0) {
            return false;
        }
        int index2 = ~index;
        int i = this.f1905;
        if (i >= this.f1907.length) {
            int n = 4;
            if (i >= 8) {
                n = (i >> 1) + i;
            } else if (i >= 4) {
                n = 8;
            }
            int[] ohashes = this.f1907;
            Object[] oarray = this.f1908;
            m2422(n);
            int[] iArr = this.f1907;
            if (iArr.length > 0) {
                System.arraycopy(ohashes, 0, iArr, 0, ohashes.length);
                System.arraycopy(oarray, 0, this.f1908, 0, oarray.length);
            }
            m2414(ohashes, oarray, this.f1905);
        }
        int i2 = this.f1905;
        if (index2 < i2) {
            int[] iArr2 = this.f1907;
            System.arraycopy(iArr2, index2, iArr2, index2 + 1, i2 - index2);
            Object[] objArr = this.f1908;
            System.arraycopy(objArr, index2, objArr, index2 + 1, this.f1905 - index2);
        }
        this.f1907[index2] = hash;
        this.f1908[index2] = value;
        this.f1905++;
        return true;
    }

    public boolean remove(Object object) {
        int index = m2418(object);
        if (index < 0) {
            return false;
        }
        m2420(index);
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public E m2420(int index) {
        Object[] objArr = this.f1908;
        E e = (E) objArr[index];
        int i = this.f1905;
        if (i <= 1) {
            m2414(this.f1907, objArr, i);
            this.f1907 = f1903;
            this.f1908 = f1904;
            this.f1905 = 0;
        } else {
            int[] iArr = this.f1907;
            int n = 8;
            if (iArr.length <= 8 || i >= iArr.length / 3) {
                this.f1905--;
                int i2 = this.f1905;
                if (index < i2) {
                    int[] iArr2 = this.f1907;
                    System.arraycopy(iArr2, index + 1, iArr2, index, i2 - index);
                    Object[] objArr2 = this.f1908;
                    System.arraycopy(objArr2, index + 1, objArr2, index, this.f1905 - index);
                }
                this.f1908[this.f1905] = null;
            } else {
                if (i > 8) {
                    n = i + (i >> 1);
                }
                int[] ohashes = this.f1907;
                Object[] oarray = this.f1908;
                m2422(n);
                this.f1905--;
                if (index > 0) {
                    System.arraycopy(ohashes, 0, this.f1907, 0, index);
                    System.arraycopy(oarray, 0, this.f1908, 0, index);
                }
                int i3 = this.f1905;
                if (index < i3) {
                    System.arraycopy(ohashes, index + 1, this.f1907, index, i3 - index);
                    System.arraycopy(oarray, index + 1, this.f1908, index, this.f1905 - index);
                }
            }
        }
        return e;
    }

    public int size() {
        return this.f1905;
    }

    public Object[] toArray() {
        int i = this.f1905;
        Object[] result = new Object[i];
        System.arraycopy(this.f1908, 0, result, 0, i);
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // java.util.Collection, java.util.Set
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T[] toArray(T[] r4) {
        /*
            r3 = this;
            int r0 = r4.length
            int r1 = r3.f1905
            if (r0 >= r1) goto L_0x0017
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = r3.f1905
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r4 = r0
        L_0x0017:
            java.lang.Object[] r0 = r3.f1908
            int r1 = r3.f1905
            r2 = 0
            java.lang.System.arraycopy(r0, r2, r4, r2, r1)
            int r0 = r4.length
            int r1 = r3.f1905
            if (r0 <= r1) goto L_0x0027
            r0 = 0
            r4[r1] = r0
        L_0x0027:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0516.toArray(java.lang.Object[]):java.lang.Object[]");
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set<?> set = (Set) object;
        if (size() != set.size()) {
            return false;
        }
        for (int i = 0; i < this.f1905; i++) {
            try {
                if (!set.contains(m2415(i))) {
                    return false;
                }
            } catch (NullPointerException e) {
                return false;
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int[] hashes = this.f1907;
        int result = 0;
        int s = this.f1905;
        for (int i = 0; i < s; i++) {
            result += hashes[i];
        }
        return result;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder(this.f1905 * 14);
        buffer.append('{');
        for (int i = 0; i < this.f1905; i++) {
            if (i > 0) {
                buffer.append(", ");
            }
            Object value = m2415(i);
            if (value != this) {
                buffer.append(value);
            } else {
                buffer.append("(this Set)");
            }
        }
        buffer.append('}');
        return buffer.toString();
    }

    /* renamed from: ♫.竟$θ  reason: contains not printable characters */
    public class C0517 extends AbstractC0521<E, E> {
        public C0517() {
        }

        @Override // ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public int m2424() {
            return C0516.this.f1905;
        }

        @Override // ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public Object m2426(int index, int offset) {
            return C0516.this.f1908[index];
        }

        @Override // ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public int m2425(Object key) {
            return C0516.this.m2418(key);
        }

        @Override // ♫.AbstractC0521
        /* renamed from: Φ  reason: contains not printable characters */
        public int m2423(Object value) {
            return C0516.this.m2418(value);
        }

        @Override // ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public Map<E, E> m2428() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public void m2431(E key, E e) {
            C0516.this.add(key);
        }

        @Override // ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public E m2427(int index, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // ♫.AbstractC0521, ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public void m2430(int index) {
            C0516.this.m2420(index);
        }

        @Override // ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public void m2429() {
            C0516.this.clear();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final AbstractC0521<E, E> m2421() {
        if (this.f1906 == null) {
            this.f1906 = new C0517();
        }
        return this.f1906;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        return m2421().m2461().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ♫.竟<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m2416(this.f1905 + collection.size());
        boolean added = false;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            added |= add(it.next());
        }
        return added;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        boolean removed = false;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            removed |= remove(it.next());
        }
        return removed;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean removed = false;
        for (int i = this.f1905 - 1; i >= 0; i--) {
            if (!collection.contains(this.f1908[i])) {
                m2420(i);
                removed = true;
            }
        }
        return removed;
    }
}
