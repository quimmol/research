package ♫;

import java.util.ArrayList;
import ♫.C0548;

/* renamed from: ♫.负  reason: contains not printable characters */
public class C0543 {

    /* renamed from: µ  reason: contains not printable characters */
    public C0548 f2011;

    /* renamed from: Ø  reason: contains not printable characters */
    public C0548 f2012;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f2013;

    /* renamed from: ö  reason: contains not printable characters */
    public C0548 f2014;

    /* renamed from: ö  reason: contains not printable characters and collision with other field name */
    public boolean f2015;

    /* renamed from: ø  reason: contains not printable characters */
    public int f2016;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public C0548 f2017;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f2018;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f2019;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public C0548 f2020;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f2021;

    /* renamed from: θ  reason: contains not printable characters */
    public float f2022 = 0.0f;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f2023;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ArrayList<C0548> f2024;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0548 f2025;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f2026 = false;

    /* renamed from: ₩  reason: contains not printable characters */
    public C0548 f2027;

    public C0543(C0548 first, int orientation, boolean isRtl) {
        this.f2025 = first;
        this.f2016 = orientation;
        this.f2026 = isRtl;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2605(C0548 widget, int orientation) {
        if (widget.m2698() != 8 && widget.f2089[orientation] == C0548.EnumC0549.MATCH_CONSTRAINT) {
            int[] iArr = widget.f2087;
            if (iArr[orientation] == 0 || iArr[orientation] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2606() {
        boolean z;
        C0548 next;
        int offset = this.f2016 * 2;
        C0548 lastVisited = this.f2025;
        C0548 widget = this.f2025;
        C0548 r4 = this.f2025;
        boolean done = false;
        while (true) {
            z = true;
            if (done) {
                break;
            }
            this.f2023++;
            C0548[] r7 = widget.f2075;
            int i = this.f2016;
            r7[i] = null;
            widget.f2090[i] = null;
            if (widget.m2698() != 8) {
                if (this.f2020 == null) {
                    this.f2020 = widget;
                }
                this.f2012 = widget;
                C0548.EnumC0549[] r72 = widget.f2089;
                int i2 = this.f2016;
                if (r72[i2] == C0548.EnumC0549.MATCH_CONSTRAINT) {
                    int[] iArr = widget.f2087;
                    if (iArr[i2] == 0 || iArr[i2] == 3 || iArr[i2] == 2) {
                        this.f2019++;
                        float[] fArr = widget.f2086;
                        int i3 = this.f2016;
                        float weight = fArr[i3];
                        if (weight > 0.0f) {
                            this.f2022 += fArr[i3];
                        }
                        if (m2605(widget, this.f2016)) {
                            if (weight < 0.0f) {
                                this.f2021 = true;
                            } else {
                                this.f2018 = true;
                            }
                            if (this.f2024 == null) {
                                this.f2024 = new ArrayList<>();
                            }
                            this.f2024.add(widget);
                        }
                        if (this.f2011 == null) {
                            this.f2011 = widget;
                        }
                        C0548 r6 = this.f2027;
                        if (r6 != null) {
                            r6.f2090[this.f2016] = widget;
                        }
                        this.f2027 = widget;
                    }
                }
            }
            if (lastVisited != widget) {
                lastVisited.f2075[this.f2016] = widget;
            }
            lastVisited = widget;
            C0544 nextAnchor = widget.f2088[offset + 1].f2034;
            if (nextAnchor != null) {
                next = nextAnchor.f2035;
                C0544[] r73 = next.f2088;
                if (r73[offset].f2034 == null || r73[offset].f2034.f2035 != widget) {
                    next = null;
                }
            } else {
                next = null;
            }
            if (next != null) {
                widget = next;
            } else {
                done = true;
            }
        }
        this.f2017 = widget;
        if (this.f2016 != 0 || !this.f2026) {
            this.f2014 = this.f2025;
        } else {
            this.f2014 = this.f2017;
        }
        if (!this.f2018 || !this.f2021) {
            z = false;
        }
        this.f2013 = z;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2607() {
        if (!this.f2015) {
            m2606();
        }
        this.f2015 = true;
    }
}
