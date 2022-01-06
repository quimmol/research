package ♫;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import java.util.ArrayList;
import ♫.C0544;

/* renamed from: ♫.那  reason: contains not printable characters */
public class C0559 {

    /* renamed from: Ø  reason: contains not printable characters */
    public int f2176;

    /* renamed from: ø  reason: contains not printable characters */
    public int f2177;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f2178;

    /* renamed from: θ  reason: contains not printable characters */
    public int f2179;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ArrayList<C0560> f2180 = new ArrayList<>();

    /* renamed from: ♫.那$θ  reason: contains not printable characters */
    public static class C0560 {

        /* renamed from: Φ  reason: contains not printable characters */
        public int f2181;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public C0544 f2182;

        /* renamed from: θ  reason: contains not printable characters */
        public int f2183;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0544.EnumC0546 f2184;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0544 f2185;

        public C0560(C0544 anchor) {
            this.f2185 = anchor;
            this.f2182 = anchor.m2614();
            this.f2183 = anchor.m2608();
            this.f2184 = anchor.m2613();
            this.f2181 = anchor.m2610();
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public void m2779(C0548 widget) {
            this.f2185 = widget.m2664(this.f2185.m2612());
            C0544 r0 = this.f2185;
            if (r0 != null) {
                this.f2182 = r0.m2614();
                this.f2183 = this.f2185.m2608();
                this.f2184 = this.f2185.m2613();
                this.f2181 = this.f2185.m2610();
                return;
            }
            this.f2182 = null;
            this.f2183 = 0;
            this.f2184 = C0544.EnumC0546.STRONG;
            this.f2181 = 0;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m2780(C0548 widget) {
            widget.m2664(this.f2185.m2612()).m2621(this.f2182, this.f2183, this.f2184, this.f2181);
        }
    }

    public C0559(C0548 widget) {
        this.f2179 = widget.m2689();
        this.f2178 = widget.m2691();
        this.f2177 = widget.m2700();
        this.f2176 = widget.m2632();
        ArrayList<ConstraintAnchor> anchors = widget.m2663();
        int anchorsSize = anchors.size();
        for (int i = 0; i < anchorsSize; i++) {
            this.f2180.add(new C0560((C0544) anchors.get(i)));
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2777(C0548 widget) {
        this.f2179 = widget.m2689();
        this.f2178 = widget.m2691();
        this.f2177 = widget.m2700();
        this.f2176 = widget.m2632();
        int connections = this.f2180.size();
        for (int i = 0; i < connections; i++) {
            this.f2180.get(i).m2779(widget);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2778(C0548 widget) {
        widget.m2692(this.f2179);
        widget.m2693(this.f2178);
        widget.m2703(this.f2177);
        widget.m2640(this.f2176);
        int mConnectionsSize = this.f2180.size();
        for (int i = 0; i < mConnectionsSize; i++) {
            this.f2180.get(i).m2780(widget);
        }
    }
}
