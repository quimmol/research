package ♫;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ♫.避  reason: contains not printable characters */
public class C0558 {

    /* renamed from: θ  reason: contains not printable characters */
    public int f2174 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public HashSet<C0558> f2175 = new HashSet<>(2);

    /* renamed from: θ  reason: contains not printable characters */
    public void m2775(C0558 node) {
        this.f2175.add(node);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2772() {
        this.f2174 = 0;
        this.f2175.clear();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2773() {
        this.f2174 = 0;
        Iterator<C0558> it = this.f2175.iterator();
        while (it.hasNext()) {
            it.next().m2773();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2774() {
        this.f2174 = 1;
        Iterator<C0558> it = this.f2175.iterator();
        while (it.hasNext()) {
            it.next().m2771();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2776() {
        return this.f2174 == 1;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m2771() {
    }
}
