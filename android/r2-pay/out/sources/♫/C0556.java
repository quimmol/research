package ♫;

import ♫.C0544;

/* renamed from: ♫.连  reason: contains not printable characters */
public class C0556 extends C0558 {

    /* renamed from: Ø  reason: contains not printable characters */
    public int f2162 = 1;

    /* renamed from: ø  reason: contains not printable characters */
    public int f2163 = 1;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public C0556 f2164;

    /* renamed from: Φ  reason: contains not printable characters */
    public float f2165;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public int f2166 = 0;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public C0556 f2167;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public C0557 f2168 = null;

    /* renamed from: θ  reason: contains not printable characters */
    public float f2169;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0544 f2170;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0556 f2171;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0557 f2172 = null;

    public C0556(C0544 anchor) {
        this.f2170 = anchor;
    }

    public String toString() {
        if (((C0558) this).f2174 != 1) {
            return "{ " + this.f2170 + " UNRESOLVED} type: " + m2761(this.f2166);
        } else if (this.f2167 == this) {
            return "[" + this.f2170 + ", RESOLVED: " + this.f2165 + "]  type: " + m2761(this.f2166);
        } else {
            return "[" + this.f2170 + ", RESOLVED: " + this.f2167 + ":" + this.f2165 + "] type: " + m2761(this.f2166);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2765(C0556 target, float offset) {
        if (((C0558) this).f2174 == 0 || !(this.f2167 == target || this.f2165 == offset)) {
            this.f2167 = target;
            this.f2165 = offset;
            if (((C0558) this).f2174 == 1) {
                m2773();
            }
            m2774();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public String m2761(int type) {
        if (type == 1) {
            return "DIRECT";
        }
        if (type == 2) {
            return "CENTER";
        }
        if (type == 3) {
            return "MATCH";
        }
        if (type == 4) {
            return "CHAIN";
        }
        if (type == 5) {
            return "BARRIER";
        }
        return "UNCONNECTED";
    }

    @Override // ♫.C0558
    /* renamed from: Ø  reason: contains not printable characters */
    public void m2755() {
        C0556 r0;
        C0556 r02;
        C0556 r03;
        C0556 r04;
        C0556 r05;
        C0556 r06;
        float distance;
        float distance2;
        float percent;
        C0556 r07;
        boolean isEndAnchor = true;
        if (((C0558) this).f2174 != 1 && this.f2166 != 4) {
            C0557 r08 = this.f2172;
            if (r08 != null) {
                if (((C0558) r08).f2174 == 1) {
                    this.f2169 = ((float) this.f2163) * r08.f2173;
                } else {
                    return;
                }
            }
            C0557 r09 = this.f2168;
            if (r09 != null) {
                if (((C0558) r09).f2174 == 1) {
                    float f = r09.f2173;
                } else {
                    return;
                }
            }
            if (this.f2166 == 1 && ((r07 = this.f2171) == null || ((C0558) r07).f2174 == 1)) {
                C0556 r010 = this.f2171;
                if (r010 == null) {
                    this.f2167 = this;
                    this.f2165 = this.f2169;
                } else {
                    this.f2167 = r010.f2167;
                    this.f2165 = r010.f2165 + this.f2169;
                }
                m2774();
            } else if (this.f2166 == 2 && (r04 = this.f2171) != null && ((C0558) r04).f2174 == 1 && (r05 = this.f2164) != null && (r06 = r05.f2171) != null && ((C0558) r06).f2174 == 1) {
                C0533.m2542();
                this.f2167 = this.f2171.f2167;
                C0556 r011 = this.f2164;
                r011.f2167 = r011.f2171.f2167;
                C0544.EnumC0545 r3 = this.f2170.f2032;
                if (!(r3 == C0544.EnumC0545.RIGHT || r3 == C0544.EnumC0545.BOTTOM)) {
                    isEndAnchor = false;
                }
                if (isEndAnchor) {
                    distance = this.f2171.f2165 - this.f2164.f2171.f2165;
                } else {
                    distance = this.f2164.f2171.f2165 - this.f2171.f2165;
                }
                C0544 r012 = this.f2170;
                C0544.EnumC0545 r4 = r012.f2032;
                if (r4 == C0544.EnumC0545.LEFT || r4 == C0544.EnumC0545.RIGHT) {
                    distance2 = distance - ((float) this.f2170.f2035.m2700());
                    percent = this.f2170.f2035.f2055;
                } else {
                    distance2 = distance - ((float) r012.f2035.m2632());
                    percent = this.f2170.f2035.f2113;
                }
                int margin = this.f2170.m2608();
                int oppositeMargin = this.f2164.f2170.m2608();
                if (this.f2170.m2614() == this.f2164.f2170.m2614()) {
                    percent = 0.5f;
                    margin = 0;
                    oppositeMargin = 0;
                }
                float distance3 = (distance2 - ((float) margin)) - ((float) oppositeMargin);
                if (isEndAnchor) {
                    C0556 r6 = this.f2164;
                    r6.f2165 = r6.f2171.f2165 + ((float) oppositeMargin) + (distance3 * percent);
                    this.f2165 = (this.f2171.f2165 - ((float) margin)) - ((1.0f - percent) * distance3);
                } else {
                    this.f2165 = this.f2171.f2165 + ((float) margin) + (distance3 * percent);
                    C0556 r62 = this.f2164;
                    r62.f2165 = (r62.f2171.f2165 - ((float) oppositeMargin)) - ((1.0f - percent) * distance3);
                }
                m2774();
                this.f2164.m2774();
            } else if (this.f2166 == 3 && (r0 = this.f2171) != null && ((C0558) r0).f2174 == 1 && (r02 = this.f2164) != null && (r03 = r02.f2171) != null && ((C0558) r03).f2174 == 1) {
                C0533.m2542();
                C0556 r013 = this.f2171;
                this.f2167 = r013.f2167;
                C0556 r1 = this.f2164;
                C0556 r2 = r1.f2171;
                r1.f2167 = r2.f2167;
                this.f2165 = r013.f2165 + this.f2169;
                r1.f2165 = r2.f2165 + r1.f2169;
                m2774();
                this.f2164.m2774();
            } else if (this.f2166 == 5) {
                this.f2170.f2035.m2633();
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2762(int type) {
        this.f2166 = type;
    }

    @Override // ♫.C0558
    /* renamed from: ø  reason: contains not printable characters */
    public void m2757() {
        super.m2772();
        this.f2171 = null;
        this.f2169 = 0.0f;
        this.f2172 = null;
        this.f2163 = 1;
        this.f2168 = null;
        this.f2162 = 1;
        this.f2167 = null;
        this.f2165 = 0.0f;
        this.f2164 = null;
        this.f2166 = 0;
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m2756() {
        C0544 targetAnchor = this.f2170.m2614();
        if (targetAnchor != null) {
            if (targetAnchor.m2614() == this.f2170) {
                this.f2166 = 4;
                targetAnchor.m2616().f2166 = 4;
            }
            int margin = this.f2170.m2608();
            C0544.EnumC0545 r2 = this.f2170.f2032;
            if (r2 == C0544.EnumC0545.RIGHT || r2 == C0544.EnumC0545.BOTTOM) {
                margin = -margin;
            }
            m2766(targetAnchor.m2616(), margin);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2763(int type, C0556 node, int offset) {
        this.f2166 = type;
        this.f2171 = node;
        this.f2169 = (float) offset;
        this.f2171.m2775(this);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2766(C0556 node, int offset) {
        this.f2171 = node;
        this.f2169 = (float) offset;
        this.f2171.m2775(this);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2767(C0556 node, int multiplier, C0557 dimension) {
        this.f2171 = node;
        this.f2171.m2775(this);
        this.f2172 = dimension;
        this.f2163 = multiplier;
        this.f2172.m2775(this);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2758(C0556 opposite, float oppositeOffset) {
        this.f2164 = opposite;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2759(C0556 opposite, int multiplier, C0557 dimension) {
        this.f2164 = opposite;
        this.f2168 = dimension;
        this.f2162 = multiplier;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2764(C0533 system) {
        C0538 sv = this.f2170.m2611();
        C0556 r1 = this.f2167;
        if (r1 == null) {
            system.m2568(sv, (int) (this.f2165 + 0.5f));
        } else {
            system.m2558(sv, system.m2562((Object) r1.f2170), (int) (this.f2165 + 0.5f), 6);
        }
    }

    @Override // ♫.C0558, ♫.C0558
    /* renamed from: θ  reason: contains not printable characters */
    public float m2760() {
        return this.f2165;
    }
}
