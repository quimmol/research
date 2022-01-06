package ♫;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: ♫.福  reason: contains not printable characters */
public class C0514<K, V> extends C0527<K, V> implements Map<K, V> {

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0521<K, V> f1897;

    public C0514() {
    }

    public C0514(int capacity) {
        super(capacity);
    }

    /* renamed from: ♫.福$θ  reason: contains not printable characters */
    public class C0515 extends AbstractC0521<K, V> {
        public C0515() {
        }

        @Override // ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public int m2406() {
            return ((C0527) C0514.this).f1945;
        }

        @Override // ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public Object m2408(int index, int offset) {
            return ((C0527) C0514.this).f1947[(index << 1) + offset];
        }

        @Override // ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public int m2407(Object key) {
            return C0514.this.m2483(key);
        }

        @Override // ♫.AbstractC0521
        /* renamed from: Φ  reason: contains not printable characters */
        public int m2405(Object value) {
            return C0514.this.m2479(value);
        }

        @Override // ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public Map<K, V> m2410() {
            return C0514.this;
        }

        @Override // ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public void m2413(K key, V value) {
            C0514.this.put(key, value);
        }

        @Override // ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public V m2409(int index, V value) {
            return (V) C0514.this.m2486(index, value);
        }

        @Override // ♫.AbstractC0521, ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public void m2412(int index) {
            C0514.this.m2480(index);
        }

        @Override // ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521, ♫.AbstractC0521
        /* renamed from: θ  reason: contains not printable characters */
        public void m2411() {
            C0514.this.clear();
        }
    }

    @Override // ♫.C0527
    /* renamed from: θ  reason: contains not printable characters */
    public final AbstractC0521<K, V> m2403() {
        if (this.f1897 == null) {
            this.f1897 = new C0515();
        }
        return this.f1897;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ♫.福<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m2481(((C0527) this).f1945 + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2404(Collection<?> collection) {
        return AbstractC0521.m2456(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m2403().m2468();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m2403().m2461();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m2403().m2466();
    }
}
