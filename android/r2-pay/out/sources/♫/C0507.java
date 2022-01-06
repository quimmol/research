package ♫;

import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: ♫.祸  reason: contains not printable characters */
public class C0507<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: Φ  reason: contains not printable characters */
    public C0511<K, V> f1884;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1885 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public WeakHashMap<AbstractC0508<K, V>, Boolean> f1886 = new WeakHashMap<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0511<K, V> f1887;

    /* renamed from: ♫.祸$µ  reason: contains not printable characters */
    public interface AbstractC0508<K, V> {
        /* renamed from: θ  reason: contains not printable characters */
        void m2391(C0511<K, V> v);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0511<K, V> m2390(K k) {
        SafeIterableMap.Entry<K, V> currentNode = this.f1887;
        while (currentNode != null && !currentNode.f1895.equals(k)) {
            currentNode = currentNode.f1896;
        }
        return currentNode;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public V m2386(K key) {
        C0511<K, V> toRemove = m2390((Object) key);
        if (toRemove == null) {
            return null;
        }
        this.f1885--;
        if (!this.f1886.isEmpty()) {
            Iterator<AbstractC0508<K, V>> it = this.f1886.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0508) it.next()).m2391(toRemove);
            }
        }
        C0511<K, V> r2 = toRemove.f1894;
        if (r2 != null) {
            r2.f1896 = toRemove.f1896;
        } else {
            this.f1887 = toRemove.f1896;
        }
        C0511<K, V> r22 = toRemove.f1896;
        if (r22 != null) {
            r22.f1894 = toRemove.f1894;
        } else {
            this.f1884 = toRemove.f1894;
        }
        toRemove.f1896 = null;
        toRemove.f1894 = null;
        return toRemove.f1893;
    }

    public int size() {
        return this.f1885;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        SafeIterableMap.ListIterator<K, V> iterator = new C0513<>(this.f1887, this.f1884);
        this.f1886.put(iterator, false);
        return iterator;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Iterator<Map.Entry<K, V>> m2387() {
        SafeIterableMap.DescendingIterator<K, V> iterator = new C0512<>(this.f1884, this.f1887);
        this.f1886.put(iterator, false);
        return iterator;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0507<K, V>.C0509 m2389() {
        SafeIterableMap<K, V>.IteratorWithAdditions iterator = new C0509();
        this.f1886.put(iterator, false);
        return iterator;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Map.Entry<K, V> m2388() {
        return this.f1887;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public Map.Entry<K, V> m2385() {
        return this.f1884;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0507)) {
            return false;
        }
        C0507 map = (C0507) obj;
        if (size() != map.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> iterator1 = iterator();
        Iterator iterator2 = map.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            Map.Entry<K, V> next1 = iterator1.next();
            Object next2 = iterator2.next();
            if ((next1 == null && next2 != null) || (next1 != null && !next1.equals(next2))) {
                return false;
            }
        }
        if (iterator1.hasNext() || iterator2.hasNext()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int h = 0;
        Iterator<Map.Entry<K, V>> i = iterator();
        while (i.hasNext()) {
            h += i.next().hashCode();
        }
        return h;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        Iterator<Map.Entry<K, V>> iterator = iterator();
        while (iterator.hasNext()) {
            builder.append(iterator.next().toString());
            if (iterator.hasNext()) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /* renamed from: ♫.祸$ö  reason: contains not printable characters */
    public static abstract class AbstractC0510<K, V> implements Iterator<Map.Entry<K, V>>, AbstractC0508<K, V> {

        /* renamed from: Φ  reason: contains not printable characters */
        public C0511<K, V> f1891;

        /* renamed from: θ  reason: contains not printable characters */
        public C0511<K, V> f1892;

        /* renamed from: Φ  reason: contains not printable characters */
        public abstract C0511<K, V> m2394(C0511<K, V> v);

        @Override // ♫.C0507.AbstractC0508
        /* renamed from: θ  reason: contains not printable characters */
        public abstract C0511<K, V> m2397(C0511<K, V> v);

        public AbstractC0510(C0511<K, V> r1, C0511<K, V> r2) {
            this.f1892 = r2;
            this.f1891 = r1;
        }

        public boolean hasNext() {
            return this.f1891 != null;
        }

        @Override // ♫.C0507.AbstractC0508
        /* renamed from: θ  reason: contains not printable characters */
        public void m2398(C0511<K, V> r2) {
            if (this.f1892 == r2 && r2 == this.f1891) {
                this.f1891 = null;
                this.f1892 = null;
            }
            C0511<K, V> r0 = this.f1892;
            if (r0 == r2) {
                this.f1892 = m2397((C0511) r0);
            }
            if (this.f1891 == r2) {
                this.f1891 = m2396();
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final C0511<K, V> m2396() {
            C0511<K, V> r0 = this.f1891;
            C0511<K, V> r1 = this.f1892;
            if (r0 == r1 || r1 == null) {
                return null;
            }
            return m2394(r0);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> result = this.f1891;
            this.f1891 = m2396();
            return result;
        }
    }

    /* renamed from: ♫.祸$θ  reason: contains not printable characters */
    public static class C0513<K, V> extends AbstractC0510<K, V> {
        public C0513(C0511<K, V> r1, C0511<K, V> r2) {
            super(r1, r2);
        }

        @Override // ♫.C0507.AbstractC0510
        /* renamed from: Φ  reason: contains not printable characters */
        public C0511<K, V> m2401(C0511<K, V> r2) {
            return r2.f1896;
        }

        @Override // ♫.C0507.AbstractC0510, ♫.C0507.AbstractC0510, ♫.C0507.AbstractC0508
        /* renamed from: θ  reason: contains not printable characters */
        public C0511<K, V> m2402(C0511<K, V> r2) {
            return r2.f1894;
        }
    }

    /* renamed from: ♫.祸$Φ  reason: contains not printable characters */
    public static class C0512<K, V> extends AbstractC0510<K, V> {
        public C0512(C0511<K, V> r1, C0511<K, V> r2) {
            super(r1, r2);
        }

        @Override // ♫.C0507.AbstractC0510
        /* renamed from: Φ  reason: contains not printable characters */
        public C0511<K, V> m2399(C0511<K, V> r2) {
            return r2.f1894;
        }

        @Override // ♫.C0507.AbstractC0510, ♫.C0507.AbstractC0510, ♫.C0507.AbstractC0508
        /* renamed from: θ  reason: contains not printable characters */
        public C0511<K, V> m2400(C0511<K, V> r2) {
            return r2.f1896;
        }
    }

    /* renamed from: ♫.祸$Ø  reason: contains not printable characters */
    public class C0509 implements Iterator<Map.Entry<K, V>>, AbstractC0508<K, V> {

        /* renamed from: Φ  reason: contains not printable characters */
        public boolean f1888 = true;

        /* renamed from: θ  reason: contains not printable characters */
        public C0511<K, V> f1889;

        public C0509() {
        }

        @Override // ♫.C0507.AbstractC0508
        /* renamed from: θ  reason: contains not printable characters */
        public void m2393(C0511<K, V> r2) {
            C0511<K, V> r0 = this.f1889;
            if (r2 == r0) {
                this.f1889 = r0.f1894;
                this.f1888 = this.f1889 == null;
            }
        }

        public boolean hasNext() {
            if (!this.f1888) {
                C0511<K, V> r0 = this.f1889;
                if (r0 == null || r0.f1896 == null) {
                    return false;
                }
                return true;
            } else if (C0507.this.f1887 != null) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public Map.Entry<K, V> next() {
            if (this.f1888) {
                this.f1888 = false;
                this.f1889 = C0507.this.f1887;
            } else {
                C0511<K, V> r0 = this.f1889;
                this.f1889 = r0 != null ? r0.f1896 : null;
            }
            return this.f1889;
        }
    }

    /* renamed from: ♫.祸$ø  reason: contains not printable characters */
    public static class C0511<K, V> implements Map.Entry<K, V> {

        /* renamed from: Φ  reason: contains not printable characters */
        public final V f1893;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public C0511<K, V> f1894;

        /* renamed from: θ  reason: contains not printable characters */
        public final K f1895;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0511<K, V> f1896;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f1895;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f1893;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return ((Object) this.f1895) + "=" + ((Object) this.f1893);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0511)) {
                return false;
            }
            C0511 entry = (C0511) obj;
            if (!this.f1895.equals(entry.f1895) || !this.f1893.equals(entry.f1893)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f1895.hashCode() ^ this.f1893.hashCode();
        }
    }
}
