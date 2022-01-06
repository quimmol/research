package ♫;

import ♫.C0533;
import ♫.C0538;

/* renamed from: ♫.苟  reason: contains not printable characters */
public class C0530 implements C0533.AbstractC0534 {

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean f1964 = false;

    /* renamed from: θ  reason: contains not printable characters */
    public float f1965 = 0.0f;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0529 f1966;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0538 f1967 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1968;

    public C0530(C0531 cache) {
        this.f1966 = new C0529(this, cache);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2538() {
        C0538 r0 = this.f1967;
        return r0 != null && (r0.f1999 == C0538.EnumC0539.UNRESTRICTED || this.f1965 >= 0.0f);
    }

    public String toString() {
        return m2523();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public String m2523() {
        String s = (this.f1967 == null ? "" + "0" : "" + this.f1967) + " = ";
        boolean addedVariable = false;
        if (this.f1965 != 0.0f) {
            s = s + this.f1965;
            addedVariable = true;
        }
        int count = this.f1966.f1957;
        for (int i = 0; i < count; i++) {
            C0538 v = this.f1966.m2505(i);
            if (v != null) {
                float amount = this.f1966.m2502(i);
                if (amount != 0.0f) {
                    String name = v.toString();
                    if (!addedVariable) {
                        if (amount < 0.0f) {
                            s = s + "- ";
                            amount *= -1.0f;
                        }
                    } else if (amount > 0.0f) {
                        s = s + " + ";
                    } else {
                        s = s + " - ";
                        amount *= -1.0f;
                    }
                    s = amount == 1.0f ? s + name : s + amount + " " + name;
                    addedVariable = true;
                }
            }
        }
        if (addedVariable) {
            return s;
        }
        return s + "0.0";
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2516() {
        this.f1967 = null;
        this.f1966.m2508();
        this.f1965 = 0.0f;
        this.f1964 = false;
    }

    @Override // ♫.C0533.AbstractC0534
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2540(C0538 v) {
        return this.f1966.m2514(v);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public C0530 m2517(C0538 variable, int value) {
        this.f1967 = variable;
        variable.f1996 = (float) value;
        this.f1965 = (float) value;
        this.f1964 = true;
        return this;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public C0530 m2515(C0538 variable, int value) {
        if (value < 0) {
            this.f1965 = (float) (value * -1);
            this.f1966.m2512(variable, 1.0f);
        } else {
            this.f1965 = (float) value;
            this.f1966.m2512(variable, -1.0f);
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0530 m2527(C0538 variableA, C0538 variableB, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f1965 = (float) m;
        }
        if (!inverse) {
            this.f1966.m2512(variableA, -1.0f);
            this.f1966.m2512(variableB, 1.0f);
        } else {
            this.f1966.m2512(variableA, 1.0f);
            this.f1966.m2512(variableB, -1.0f);
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0530 m2526(C0538 error, int sign) {
        this.f1966.m2512(error, (float) sign);
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0530 m2530(C0538 variableA, C0538 variableB, C0538 slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f1965 = (float) m;
        }
        if (!inverse) {
            this.f1966.m2512(variableA, -1.0f);
            this.f1966.m2512(variableB, 1.0f);
            this.f1966.m2512(slack, 1.0f);
        } else {
            this.f1966.m2512(variableA, 1.0f);
            this.f1966.m2512(variableB, -1.0f);
            this.f1966.m2512(slack, -1.0f);
        }
        return this;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public C0530 m2518(C0538 variableA, C0538 variableB, C0538 slack, int margin) {
        boolean inverse = false;
        if (margin != 0) {
            int m = margin;
            if (m < 0) {
                m *= -1;
                inverse = true;
            }
            this.f1965 = (float) m;
        }
        if (!inverse) {
            this.f1966.m2512(variableA, -1.0f);
            this.f1966.m2512(variableB, 1.0f);
            this.f1966.m2512(slack, -1.0f);
        } else {
            this.f1966.m2512(variableA, 1.0f);
            this.f1966.m2512(variableB, -1.0f);
            this.f1966.m2512(slack, 1.0f);
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0530 m2524(float currentWeight, float totalWeights, float nextWeight, C0538 variableStartA, C0538 variableEndA, C0538 variableStartB, C0538 variableEndB) {
        this.f1965 = 0.0f;
        if (totalWeights == 0.0f || currentWeight == nextWeight) {
            this.f1966.m2512(variableStartA, 1.0f);
            this.f1966.m2512(variableEndA, -1.0f);
            this.f1966.m2512(variableEndB, 1.0f);
            this.f1966.m2512(variableStartB, -1.0f);
        } else if (currentWeight == 0.0f) {
            this.f1966.m2512(variableStartA, 1.0f);
            this.f1966.m2512(variableEndA, -1.0f);
        } else if (nextWeight == 0.0f) {
            this.f1966.m2512(variableStartB, 1.0f);
            this.f1966.m2512(variableEndB, -1.0f);
        } else {
            float w = (currentWeight / totalWeights) / (nextWeight / totalWeights);
            this.f1966.m2512(variableStartA, 1.0f);
            this.f1966.m2512(variableEndA, -1.0f);
            this.f1966.m2512(variableEndB, w);
            this.f1966.m2512(variableStartB, -w);
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0530 m2528(C0538 variableA, C0538 variableB, int marginA, float bias, C0538 variableC, C0538 variableD, int marginB) {
        if (variableB == variableC) {
            this.f1966.m2512(variableA, 1.0f);
            this.f1966.m2512(variableD, 1.0f);
            this.f1966.m2512(variableB, -2.0f);
            return this;
        }
        if (bias == 0.5f) {
            this.f1966.m2512(variableA, 1.0f);
            this.f1966.m2512(variableB, -1.0f);
            this.f1966.m2512(variableC, -1.0f);
            this.f1966.m2512(variableD, 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f1965 = (float) ((-marginA) + marginB);
            }
        } else if (bias <= 0.0f) {
            this.f1966.m2512(variableA, -1.0f);
            this.f1966.m2512(variableB, 1.0f);
            this.f1965 = (float) marginA;
        } else if (bias >= 1.0f) {
            this.f1966.m2512(variableC, -1.0f);
            this.f1966.m2512(variableD, 1.0f);
            this.f1965 = (float) marginB;
        } else {
            this.f1966.m2512(variableA, (1.0f - bias) * 1.0f);
            this.f1966.m2512(variableB, (1.0f - bias) * -1.0f);
            this.f1966.m2512(variableC, -1.0f * bias);
            this.f1966.m2512(variableD, bias * 1.0f);
            if (marginA > 0 || marginB > 0) {
                this.f1965 = (((float) (-marginA)) * (1.0f - bias)) + (((float) marginB) * bias);
            }
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0530 m2525(C0533 system, int strength) {
        this.f1966.m2512(system.m2561(strength, "ep"), 1.0f);
        this.f1966.m2512(system.m2561(strength, "em"), -1.0f);
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0530 m2529(C0538 variableA, C0538 variableB, C0538 variableC, float percent) {
        this.f1966.m2512(variableA, -1.0f);
        this.f1966.m2512(variableB, 1.0f - percent);
        this.f1966.m2512(variableC, percent);
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0530 m2531(C0538 variableA, C0538 variableB, C0538 variableC, C0538 variableD, float ratio) {
        this.f1966.m2512(variableA, -1.0f);
        this.f1966.m2512(variableB, 1.0f);
        this.f1966.m2512(variableC, ratio);
        this.f1966.m2512(variableD, -ratio);
        return this;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public C0530 m2519(C0538 at, C0538 ab, C0538 bt, C0538 bb, float angleComponent) {
        this.f1966.m2512(bt, 0.5f);
        this.f1966.m2512(bb, 0.5f);
        this.f1966.m2512(at, -0.5f);
        this.f1966.m2512(ab, -0.5f);
        this.f1965 = -angleComponent;
        return this;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2520() {
        float f = this.f1965;
        if (f < 0.0f) {
            this.f1965 = f * -1.0f;
            this.f1966.m2500();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2539(C0533 system) {
        boolean addedExtra = false;
        C0538 pivotCandidate = this.f1966.m2506(system);
        if (pivotCandidate == null) {
            addedExtra = true;
        } else {
            m2521(pivotCandidate);
        }
        if (this.f1966.f1957 == 0) {
            this.f1964 = true;
        }
        return addedExtra;
    }

    @Override // ♫.C0533.AbstractC0534
    /* renamed from: θ  reason: contains not printable characters */
    public C0538 m2534(C0538 exclude) {
        return this.f1966.m2507((boolean[]) null, exclude);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2521(C0538 v) {
        C0538 r0 = this.f1967;
        if (r0 != null) {
            this.f1966.m2512(r0, -1.0f);
            this.f1967 = null;
        }
        float amount = this.f1966.m2504(v, true) * -1.0f;
        this.f1967 = v;
        if (amount != 1.0f) {
            this.f1965 /= amount;
            this.f1966.m2509(amount);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m2522() {
        return this.f1967 == null && this.f1965 == 0.0f && this.f1966.f1957 == 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0538 m2533(C0533 system, boolean[] avoid) {
        return this.f1966.m2507(avoid, (C0538) null);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2535() {
        this.f1966.m2508();
        this.f1967 = null;
        this.f1965 = 0.0f;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2536(C0533.AbstractC0534 row) {
        if (row instanceof C0530) {
            C0530 copiedRow = (C0530) row;
            this.f1967 = null;
            this.f1966.m2508();
            int i = 0;
            while (true) {
                C0529 r2 = copiedRow.f1966;
                if (i < r2.f1957) {
                    this.f1966.m2513(r2.m2505(i), copiedRow.f1966.m2502(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // ♫.C0533.AbstractC0534
    /* renamed from: θ  reason: contains not printable characters */
    public void m2537(C0538 error) {
        float weight = 1.0f;
        int i = error.f1994;
        if (i == 1) {
            weight = 1.0f;
        } else if (i == 2) {
            weight = 1000.0f;
        } else if (i == 3) {
            weight = 1000000.0f;
        } else if (i == 4) {
            weight = 1.0E9f;
        } else if (i == 5) {
            weight = 1.0E12f;
        }
        this.f1966.m2512(error, weight);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0538 m2532() {
        return this.f1967;
    }
}
