package ♫;

import java.util.HashMap;
import ♫.C0507;

/* renamed from: ♫.破  reason: contains not printable characters */
public class C0506<K, V> extends C0507<K, V> {

    /* renamed from: θ  reason: contains not printable characters */
    public HashMap<K, C0507.C0511<K, V>> f1883 = new HashMap<>();

    @Override // ♫.C0507, ♫.C0507
    /* renamed from: θ  reason: contains not printable characters */
    public C0507.C0511<K, V> m2384(K k) {
        return this.f1883.get(k);
    }

    @Override // ♫.C0507, ♫.C0507
    /* renamed from: θ  reason: contains not printable characters */
    public V m2383(K key) {
        V removed = (V) super.m2386((Object) key);
        this.f1883.remove(key);
        return removed;
    }

    public boolean contains(K key) {
        return this.f1883.containsKey(key);
    }
}
