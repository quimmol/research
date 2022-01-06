package ♫;

import java.util.ArrayList;
import ♫.C0544;
import ♫.C0548;

/* renamed from: ♫.身  reason: contains not printable characters */
public class C0552 extends C0548 {

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean f2153 = false;

    /* renamed from: П  reason: contains not printable characters */
    public int f2154 = -1;

    /* renamed from: Р  reason: contains not printable characters */
    public int f2155 = -1;

    /* renamed from: С  reason: contains not printable characters */
    public int f2156 = 0;

    /* renamed from: ₣  reason: contains not printable characters */
    public float f2157 = -1.0f;

    /* renamed from: ₣  reason: contains not printable characters and collision with other field name */
    public C0544 f2158 = ((C0548) this).f2071;

    public C0552() {
        new C0555();
        ((C0548) this).f2080.clear();
        ((C0548) this).f2080.add(this.f2158);
        int count = ((C0548) this).f2088.length;
        for (int i = 0; i < count; i++) {
            ((C0548) this).f2088[i] = this.f2158;
        }
    }

    @Override // ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2743() {
        return true;
    }

    /* renamed from: Е  reason: contains not printable characters */
    public void m2747(int orientation) {
        if (this.f2156 != orientation) {
            this.f2156 = orientation;
            ((C0548) this).f2080.clear();
            if (this.f2156 == 1) {
                this.f2158 = ((C0548) this).f2081;
            } else {
                this.f2158 = ((C0548) this).f2071;
            }
            ((C0548) this).f2080.add(this.f2158);
            int count = ((C0548) this).f2088.length;
            for (int i = 0; i < count; i++) {
                ((C0548) this).f2088[i] = this.f2158;
            }
        }
    }

    /* renamed from: В  reason: contains not printable characters */
    public int m2744() {
        return this.f2156;
    }

    @Override // ♫.C0548
    /* renamed from: θ  reason: contains not printable characters */
    public C0544 m2740(C0544.EnumC0545 anchorType) {
        switch (anchorType.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f2156 == 1) {
                    return this.f2158;
                }
                break;
            case 2:
            case 4:
                if (this.f2156 == 0) {
                    return this.f2158;
                }
                break;
        }
        throw new AssertionError(anchorType.name());
    }

    @Override // ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548
    /* renamed from: θ  reason: contains not printable characters */
    public ArrayList<C0544> m2739() {
        return ((C0548) this).f2080;
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m2737(float value) {
        if (value > -1.0f) {
            this.f2157 = value;
            this.f2154 = -1;
            this.f2155 = -1;
        }
    }

    /* renamed from: Г  reason: contains not printable characters */
    public void m2745(int value) {
        if (value > -1) {
            this.f2157 = -1.0f;
            this.f2154 = value;
            this.f2155 = -1;
        }
    }

    /* renamed from: Д  reason: contains not printable characters */
    public void m2746(int value) {
        if (value > -1) {
            this.f2157 = -1.0f;
            this.f2154 = -1;
            this.f2155 = value;
        }
    }

    @Override // ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548
    /* renamed from: θ  reason: contains not printable characters */
    public void m2741(int optimizationLevel) {
        C0548 constraintWidgetContainer = m2667();
        if (constraintWidgetContainer != null) {
            if (m2744() == 1) {
                ((C0548) this).f2071.m2616().m2763(1, constraintWidgetContainer.f2071.m2616(), 0);
                ((C0548) this).f2060.m2616().m2763(1, constraintWidgetContainer.f2071.m2616(), 0);
                if (this.f2154 != -1) {
                    ((C0548) this).f2081.m2616().m2763(1, constraintWidgetContainer.f2081.m2616(), this.f2154);
                    ((C0548) this).f2066.m2616().m2763(1, constraintWidgetContainer.f2081.m2616(), this.f2154);
                } else if (this.f2155 != -1) {
                    ((C0548) this).f2081.m2616().m2763(1, constraintWidgetContainer.f2066.m2616(), -this.f2155);
                    ((C0548) this).f2066.m2616().m2763(1, constraintWidgetContainer.f2066.m2616(), -this.f2155);
                } else if (this.f2157 != -1.0f && constraintWidgetContainer.m2665() == C0548.EnumC0549.FIXED) {
                    int position = (int) (((float) constraintWidgetContainer.f2111) * this.f2157);
                    ((C0548) this).f2081.m2616().m2763(1, constraintWidgetContainer.f2081.m2616(), position);
                    ((C0548) this).f2066.m2616().m2763(1, constraintWidgetContainer.f2081.m2616(), position);
                }
            } else {
                ((C0548) this).f2081.m2616().m2763(1, constraintWidgetContainer.f2081.m2616(), 0);
                ((C0548) this).f2066.m2616().m2763(1, constraintWidgetContainer.f2081.m2616(), 0);
                if (this.f2154 != -1) {
                    ((C0548) this).f2071.m2616().m2763(1, constraintWidgetContainer.f2071.m2616(), this.f2154);
                    ((C0548) this).f2060.m2616().m2763(1, constraintWidgetContainer.f2071.m2616(), this.f2154);
                } else if (this.f2155 != -1) {
                    ((C0548) this).f2071.m2616().m2763(1, constraintWidgetContainer.f2060.m2616(), -this.f2155);
                    ((C0548) this).f2060.m2616().m2763(1, constraintWidgetContainer.f2060.m2616(), -this.f2155);
                } else if (this.f2157 != -1.0f && constraintWidgetContainer.m2646() == C0548.EnumC0549.FIXED) {
                    int position2 = (int) (((float) constraintWidgetContainer.f2112) * this.f2157);
                    ((C0548) this).f2071.m2616().m2763(1, constraintWidgetContainer.f2071.m2616(), position2);
                    ((C0548) this).f2060.m2616().m2763(1, constraintWidgetContainer.f2071.m2616(), position2);
                }
            }
        }
    }

    @Override // ♫.C0548
    /* renamed from: θ  reason: contains not printable characters */
    public void m2742(C0533 system) {
        C0550 parent = (C0550) m2667();
        if (parent != null) {
            C0544 begin = parent.m2664(C0544.EnumC0545.LEFT);
            C0544 end = parent.m2664(C0544.EnumC0545.RIGHT);
            C0548 r3 = ((C0548) this).f2082;
            boolean z = true;
            boolean parentWrapContent = r3 != null && r3.f2089[0] == C0548.EnumC0549.WRAP_CONTENT;
            if (this.f2156 == 0) {
                begin = parent.m2664(C0544.EnumC0545.TOP);
                end = parent.m2664(C0544.EnumC0545.BOTTOM);
                C0548 r6 = ((C0548) this).f2082;
                if (r6 == null || r6.f2089[1] != C0548.EnumC0549.WRAP_CONTENT) {
                    z = false;
                }
                parentWrapContent = z;
            }
            if (this.f2154 != -1) {
                C0538 guide = system.m2562((Object) this.f2158);
                system.m2558(guide, system.m2562((Object) begin), this.f2154, 6);
                if (parentWrapContent) {
                    system.m2570(system.m2562((Object) end), guide, 0, 5);
                }
            } else if (this.f2155 != -1) {
                C0538 guide2 = system.m2562((Object) this.f2158);
                C0538 parentRight = system.m2562((Object) end);
                system.m2558(guide2, parentRight, -this.f2155, 6);
                if (parentWrapContent) {
                    system.m2570(guide2, system.m2562((Object) begin), 0, 5);
                    system.m2570(parentRight, guide2, 0, 5);
                }
            } else if (this.f2157 != -1.0f) {
                system.m2565(C0533.m2543(system, system.m2562((Object) this.f2158), system.m2562((Object) begin), system.m2562((Object) end), this.f2157, this.f2153));
            }
        }
    }

    @Override // ♫.C0548
    /* renamed from: ø  reason: contains not printable characters */
    public void m2738(C0533 system) {
        if (m2667() != null) {
            int value = system.m2555((Object) this.f2158);
            if (this.f2156 == 1) {
                m2692(value);
                m2693(0);
                m2640(m2667().m2632());
                m2703(0);
                return;
            }
            m2692(0);
            m2693(value);
            m2703(m2667().m2700());
            m2640(0);
        }
    }
}
