package ♫;

/* renamed from: ♫.校  reason: contains not printable characters */
public class C0475 {

    /* renamed from: µ  reason: contains not printable characters */
    public int f1771 = 0;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1772 = Integer.MIN_VALUE;

    /* renamed from: ö  reason: contains not printable characters */
    public int f1773 = 0;

    /* renamed from: ø  reason: contains not printable characters */
    public int f1774 = Integer.MIN_VALUE;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1775 = 0;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1776 = false;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1777 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1778 = false;

    /* renamed from: Φ  reason: contains not printable characters */
    public int m2243() {
        return this.f1777;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public int m2242() {
        return this.f1775;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public int m2241() {
        return this.f1778 ? this.f1775 : this.f1777;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2245() {
        return this.f1778 ? this.f1777 : this.f1775;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2244(int start, int end) {
        this.f1774 = start;
        this.f1772 = end;
        this.f1776 = true;
        if (this.f1778) {
            if (end != Integer.MIN_VALUE) {
                this.f1777 = end;
            }
            if (start != Integer.MIN_VALUE) {
                this.f1775 = start;
                return;
            }
            return;
        }
        if (start != Integer.MIN_VALUE) {
            this.f1777 = start;
        }
        if (end != Integer.MIN_VALUE) {
            this.f1775 = end;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2246(int left, int right) {
        this.f1776 = false;
        if (left != Integer.MIN_VALUE) {
            this.f1773 = left;
            this.f1777 = left;
        }
        if (right != Integer.MIN_VALUE) {
            this.f1771 = right;
            this.f1775 = right;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2247(boolean isRtl) {
        if (isRtl != this.f1778) {
            this.f1778 = isRtl;
            if (!this.f1776) {
                this.f1777 = this.f1773;
                this.f1775 = this.f1771;
            } else if (isRtl) {
                int i = this.f1772;
                if (i == Integer.MIN_VALUE) {
                    i = this.f1773;
                }
                this.f1777 = i;
                int i2 = this.f1774;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1771;
                }
                this.f1775 = i2;
            } else {
                int i3 = this.f1774;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1773;
                }
                this.f1777 = i3;
                int i4 = this.f1772;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1771;
                }
                this.f1775 = i4;
            }
        }
    }
}
