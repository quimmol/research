package ♫;

import java.util.ArrayList;

/* renamed from: ♫.都  reason: contains not printable characters */
public class C0561 extends C0548 {

    /* renamed from: Φ  reason: contains not printable characters */
    public ArrayList<C0548> f2186 = new ArrayList<>();

    @Override // ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548
    /* renamed from: Φ  reason: contains not printable characters */
    public void m2783() {
        this.f2186.clear();
        super.m2648();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2785(C0548 widget) {
        this.f2186.add(widget);
        if (widget.m2667() != null) {
            ((C0561) widget.m2667()).m2782(widget);
        }
        widget.m2683((C0548) this);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2782(C0548 widget) {
        this.f2186.remove(widget);
        widget.m2683((C0548) null);
    }

    /* JADX INFO: Multiple debug info for r4v0 'this'  ♫.都: [D('item' ♫.责), D('container' ♫.趋)] */
    @Override // ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548
    /* renamed from: θ  reason: contains not printable characters */
    public C0550 m2786() {
        C0548 parent = m2667();
        C0550 container = null;
        if (this instanceof C0550) {
            container = (C0550) this;
        }
        while (parent != null) {
            parent = parent.m2667();
            if (parent instanceof C0550) {
                container = (C0550) parent;
            }
        }
        return container;
    }

    @Override // ♫.C0548
    /* renamed from: Φ  reason: contains not printable characters */
    public void m2784(int x, int y) {
        super.m2651(x, y);
        int count = this.f2186.size();
        for (int i = 0; i < count; i++) {
            this.f2186.get(i).m2651(m2704(), m2694());
        }
    }

    @Override // ♫.C0548, ♫.C0548, ♫.C0548
    /* renamed from: µ  reason: contains not printable characters */
    public void m2781() {
        super.m2623();
        ArrayList<C0548> arrayList = this.f2186;
        if (arrayList != null) {
            int count = arrayList.size();
            for (int i = 0; i < count; i++) {
                C0548 widget = this.f2186.get(i);
                widget.m2651(m2637(), m2626());
                if (!(widget instanceof C0550)) {
                    widget.m2623();
                }
            }
        }
    }

    @Override // ♫.C0548
    /* renamed from: ฿  reason: contains not printable characters */
    public void m2788() {
        m2781();
        ArrayList<C0548> arrayList = this.f2186;
        if (arrayList != null) {
            int count = arrayList.size();
            for (int i = 0; i < count; i++) {
                C0548 widget = this.f2186.get(i);
                if (widget instanceof C0561) {
                    ((C0561) widget).m2788();
                }
            }
        }
    }

    @Override // ♫.C0548
    /* renamed from: θ  reason: contains not printable characters */
    public void m2787(C0531 cache) {
        super.m2678(cache);
        int count = this.f2186.size();
        for (int i = 0; i < count; i++) {
            this.f2186.get(i).m2678(cache);
        }
    }

    @Override // ♫.C0548
    /* renamed from: ₣  reason: contains not printable characters */
    public void m2789() {
        this.f2186.clear();
    }
}
