package ♫;

import java.util.Arrays;

/* renamed from: ♫.过  reason: contains not printable characters */
public class C0553 extends C0548 {

    /* renamed from: ø  reason: contains not printable characters */
    public C0548[] f2159 = new C0548[4];

    /* renamed from: П  reason: contains not printable characters */
    public int f2160 = 0;

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2748(C0548 widget) {
        int i = this.f2160 + 1;
        C0548[] r1 = this.f2159;
        if (i > r1.length) {
            this.f2159 = (C0548[]) Arrays.copyOf(r1, r1.length * 2);
        }
        C0548[] r0 = this.f2159;
        int i2 = this.f2160;
        r0[i2] = widget;
        this.f2160 = i2 + 1;
    }

    @Override // ♫.C0548
    /* renamed from: ฿  reason: contains not printable characters */
    public void m2749() {
        this.f2160 = 0;
    }
}
