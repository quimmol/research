package ♫;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: ♫.美  reason: contains not printable characters */
public abstract class AbstractC0521<K, V> {

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0521<K, V>.C0523 f1926;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0521<K, V>.C0524 f1927;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0521<K, V>.C0525 f1928;

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract int m2460(Object obj);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract int m2462();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract int m2463(Object obj);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract Object m2464(int i, int i2);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract V m2465(int i, V v);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract Map<K, V> m2467();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m2469();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m2470(int i);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m2471(K k, V v);

    /* renamed from: ♫.美$θ  reason: contains not printable characters */
    public final class C0526<T> implements Iterator<T> {

        /* renamed from: ø  reason: contains not printable characters */
        public int f1936;

        /* renamed from: Φ  reason: contains not printable characters */
        public int f1937;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public boolean f1938 = false;

        /* renamed from: θ  reason: contains not printable characters */
        public final int f1939;

        public C0526(int offset) {
            this.f1939 = offset;
            this.f1937 = AbstractC0521.this.m2462();
        }

        public boolean hasNext() {
            return this.f1936 < this.f1937;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t = (T) AbstractC0521.this.m2464(this.f1936, this.f1939);
                this.f1936++;
                this.f1938 = true;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1938) {
                this.f1936--;
                this.f1937--;
                this.f1938 = false;
                AbstractC0521.this.m2470(this.f1936);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: ♫.美$Ø  reason: contains not printable characters */
    public final class C0522 implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: Φ  reason: contains not printable characters */
        public int f1929;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public boolean f1930 = false;

        /* renamed from: θ  reason: contains not printable characters */
        public int f1931;

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            m2474();
            return this;
        }

        public C0522() {
            this.f1931 = AbstractC0521.this.m2462() - 1;
            this.f1929 = -1;
        }

        public boolean hasNext() {
            return this.f1929 < this.f1931;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public Map.Entry<K, V> m2474() {
            if (hasNext()) {
                this.f1929++;
                this.f1930 = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f1930) {
                AbstractC0521.this.m2470(this.f1929);
                this.f1929--;
                this.f1931--;
                this.f1930 = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f1930) {
                return (K) AbstractC0521.this.m2464(this.f1929, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f1930) {
                return (V) AbstractC0521.this.m2464(this.f1929, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V setValue(V object) {
            if (this.f1930) {
                return (V) AbstractC0521.this.m2465(this.f1929, object);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean equals(Object o) {
            if (!this.f1930) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(o instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry<?, ?> e = (Map.Entry) o;
                if (!C0518.m2437(e.getKey(), AbstractC0521.this.m2464(this.f1929, 0)) || !C0518.m2437(e.getValue(), AbstractC0521.this.m2464(this.f1929, 1))) {
                    return false;
                }
                return true;
            }
        }

        public int hashCode() {
            if (this.f1930) {
                int i = 0;
                Object key = AbstractC0521.this.m2464(this.f1929, 0);
                Object value = AbstractC0521.this.m2464(this.f1929, 1);
                int hashCode = key == null ? 0 : key.hashCode();
                if (value != null) {
                    i = value.hashCode();
                }
                return i ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: ♫.美$Φ  reason: contains not printable characters */
    public final class C0525 implements Set<Map.Entry<K, V>> {
        public C0525() {
        }

        @Override // java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            m2475();
            throw null;
        }

        /* JADX WARN: Incorrect args count in method signature: (Ljava/util/Map$Entry<TK;TV;>;)Z */
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m2475() {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ♫.美 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int oldSize = AbstractC0521.this.m2462();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC0521.this.m2471((Object) entry.getKey(), (Object) entry.getValue());
            }
            return oldSize != AbstractC0521.this.m2462();
        }

        public void clear() {
            AbstractC0521.this.m2469();
        }

        public boolean contains(Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry<?, ?> e = (Map.Entry) o;
            int index = AbstractC0521.this.m2463(e.getKey());
            if (index < 0) {
                return false;
            }
            return C0518.m2437(AbstractC0521.this.m2464(index, 1), e.getValue());
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

        public boolean isEmpty() {
            return AbstractC0521.this.m2462() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0522();
        }

        public boolean remove(Object object) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return AbstractC0521.this.m2462();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object object) {
            return AbstractC0521.m2459((Set) this, object);
        }

        public int hashCode() {
            int result = 0;
            for (int i = AbstractC0521.this.m2462() - 1; i >= 0; i--) {
                int i2 = 0;
                Object key = AbstractC0521.this.m2464(i, 0);
                Object value = AbstractC0521.this.m2464(i, 1);
                int hashCode = key == null ? 0 : key.hashCode();
                if (value != null) {
                    i2 = value.hashCode();
                }
                result += i2 ^ hashCode;
            }
            return result;
        }
    }

    /* renamed from: ♫.美$ø  reason: contains not printable characters */
    public final class C0524 implements Set<K> {
        public C0524() {
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            AbstractC0521.this.m2469();
        }

        public boolean contains(Object object) {
            return AbstractC0521.this.m2463(object) >= 0;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return AbstractC0521.m2458((Map) AbstractC0521.this.m2467(), collection);
        }

        public boolean isEmpty() {
            return AbstractC0521.this.m2462() == 0;
        }

        @Override // java.util.Collection, java.util.Set, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C0526(0);
        }

        public boolean remove(Object object) {
            int index = AbstractC0521.this.m2463(object);
            if (index < 0) {
                return false;
            }
            AbstractC0521.this.m2470(index);
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return AbstractC0521.m2457(AbstractC0521.this.m2467(), collection);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return AbstractC0521.m2456(AbstractC0521.this.m2467(), collection);
        }

        public int size() {
            return AbstractC0521.this.m2462();
        }

        public Object[] toArray() {
            return AbstractC0521.this.m2472(0);
        }

        @Override // java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] array) {
            return (T[]) AbstractC0521.this.m2473(array, 0);
        }

        public boolean equals(Object object) {
            return AbstractC0521.m2459((Set) this, object);
        }

        public int hashCode() {
            int result = 0;
            for (int i = AbstractC0521.this.m2462() - 1; i >= 0; i--) {
                int i2 = 0;
                Object obj = AbstractC0521.this.m2464(i, 0);
                if (obj != null) {
                    i2 = obj.hashCode();
                }
                result += i2;
            }
            return result;
        }
    }

    /* renamed from: ♫.美$ö  reason: contains not printable characters */
    public final class C0523 implements Collection<V> {
        public C0523() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            AbstractC0521.this.m2469();
        }

        public boolean contains(Object object) {
            return AbstractC0521.this.m2460(object) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return AbstractC0521.this.m2462() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C0526(1);
        }

        public boolean remove(Object object) {
            int index = AbstractC0521.this.m2460(object);
            if (index < 0) {
                return false;
            }
            AbstractC0521.this.m2470(index);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int N = AbstractC0521.this.m2462();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                if (collection.contains(AbstractC0521.this.m2464(i, 1))) {
                    AbstractC0521.this.m2470(i);
                    i--;
                    N--;
                    changed = true;
                }
                i++;
            }
            return changed;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int N = AbstractC0521.this.m2462();
            boolean changed = false;
            int i = 0;
            while (i < N) {
                if (!collection.contains(AbstractC0521.this.m2464(i, 1))) {
                    AbstractC0521.this.m2470(i);
                    i--;
                    N--;
                    changed = true;
                }
                i++;
            }
            return changed;
        }

        public int size() {
            return AbstractC0521.this.m2462();
        }

        public Object[] toArray() {
            return AbstractC0521.this.m2472(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] array) {
            return (T[]) AbstractC0521.this.m2473(array, 1);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static <K, V> boolean m2458(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static <K, V> boolean m2457(Map<K, V> map, Collection<?> collection) {
        int oldSize = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return oldSize != map.size();
    }

    /* renamed from: ø  reason: contains not printable characters */
    public static <K, V> boolean m2456(Map<K, V> map, Collection<?> collection) {
        int oldSize = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return oldSize != map.size();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Object[] m2472(int offset) {
        int N = m2462();
        Object[] result = new Object[N];
        for (int i = 0; i < N; i++) {
            result[i] = m2464(i, offset);
        }
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T[] m2473(T[] r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.m2462()
            int r1 = r4.length
            if (r1 >= r0) goto L_0x0017
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r1 = r1.getComponentType()
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r4 = r1
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r1 >= r0) goto L_0x0023
            java.lang.Object r2 = r3.m2464(r1, r5)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0023:
            int r1 = r4.length
            if (r1 <= r0) goto L_0x0029
            r1 = 0
            r4[r0] = r1
        L_0x0029:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.AbstractC0521.m2473(java.lang.Object[], int):java.lang.Object[]");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static <T> boolean m2459(Set<T> set, Object object) {
        if (set == object) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set<?> s = (Set) object;
        try {
            if (set.size() != s.size() || !set.containsAll(s)) {
                return false;
            }
            return true;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Set<Map.Entry<K, V>> m2468() {
        if (this.f1928 == null) {
            this.f1928 = new C0525();
        }
        return this.f1928;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public Set<K> m2461() {
        if (this.f1927 == null) {
            this.f1927 = new C0524();
        }
        return this.f1927;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Collection<V> m2466() {
        if (this.f1926 == null) {
            this.f1926 = new C0523();
        }
        return this.f1926;
    }
}
