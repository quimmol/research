package ♫;

import java.util.ArrayList;
import ♫.C0548;

/* renamed from: ♫.谁  reason: contains not printable characters */
public class C0541 extends C0553 {

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean f2008 = true;

    /* renamed from: Φ  reason: contains not printable characters */
    public ArrayList<C0556> f2009 = new ArrayList<>(4);

    /* renamed from: Р  reason: contains not printable characters */
    public int f2010 = 0;

    @Override // ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2601() {
        return true;
    }

    /* renamed from: Г  reason: contains not printable characters */
    public void m2602(int barrierType) {
        this.f2010 = barrierType;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2598(boolean allowsGoneWidget) {
        this.f2008 = allowsGoneWidget;
    }

    @Override // ♫.C0548, ♫.C0548, ♫.C0548
    /* renamed from: Ø  reason: contains not printable characters */
    public void m2596() {
        super.m2627();
        this.f2009.clear();
    }

    @Override // ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548
    /* renamed from: θ  reason: contains not printable characters */
    public void m2599(int optimizationLevel) {
        C0556 node;
        C0548 r0 = ((C0548) this).f2082;
        if (r0 != null && ((C0550) r0).m2713(2)) {
            int i = this.f2010;
            if (i == 0) {
                node = ((C0548) this).f2081.m2616();
            } else if (i == 1) {
                node = ((C0548) this).f2066.m2616();
            } else if (i == 2) {
                node = ((C0548) this).f2071.m2616();
            } else if (i == 3) {
                node = ((C0548) this).f2060.m2616();
            } else {
                return;
            }
            node.m2762(5);
            int i2 = this.f2010;
            if (i2 == 0 || i2 == 1) {
                ((C0548) this).f2071.m2616().m2765((C0556) null, 0.0f);
                ((C0548) this).f2060.m2616().m2765((C0556) null, 0.0f);
            } else {
                ((C0548) this).f2081.m2616().m2765((C0556) null, 0.0f);
                ((C0548) this).f2066.m2616().m2765((C0556) null, 0.0f);
            }
            this.f2009.clear();
            for (int i3 = 0; i3 < this.f2160; i3++) {
                C0548 widget = ((C0553) this).f2159[i3];
                if (this.f2008 || widget.m2687()) {
                    C0556 depends = null;
                    int i4 = this.f2010;
                    if (i4 == 0) {
                        depends = widget.f2081.m2616();
                    } else if (i4 == 1) {
                        depends = widget.f2066.m2616();
                    } else if (i4 == 2) {
                        depends = widget.f2071.m2616();
                    } else if (i4 == 3) {
                        depends = widget.f2060.m2616();
                    }
                    if (depends != null) {
                        this.f2009.add(depends);
                        depends.m2775(node);
                    }
                }
            }
        }
    }

    @Override // ♫.C0548, ♫.C0548, ♫.C0548
    /* renamed from: ö  reason: contains not printable characters */
    public void m2597() {
        C0556 node;
        float value = 0.0f;
        int i = this.f2010;
        if (i == 0) {
            node = ((C0548) this).f2081.m2616();
            value = Float.MAX_VALUE;
        } else if (i == 1) {
            node = ((C0548) this).f2066.m2616();
        } else if (i == 2) {
            node = ((C0548) this).f2071.m2616();
            value = Float.MAX_VALUE;
        } else if (i == 3) {
            node = ((C0548) this).f2060.m2616();
        } else {
            return;
        }
        int count = this.f2009.size();
        C0556 resolvedTarget = null;
        for (int i2 = 0; i2 < count; i2++) {
            C0556 n = this.f2009.get(i2);
            if (((C0558) n).f2174 == 1) {
                int i3 = this.f2010;
                if (i3 == 0 || i3 == 2) {
                    if (n.f2165 < value) {
                        value = n.f2165;
                        resolvedTarget = n.f2167;
                    }
                } else if (n.f2165 > value) {
                    value = n.f2165;
                    resolvedTarget = n.f2167;
                }
            } else {
                return;
            }
        }
        C0533.m2542();
        node.f2167 = resolvedTarget;
        node.f2165 = value;
        node.m2774();
        int i4 = this.f2010;
        if (i4 == 0) {
            ((C0548) this).f2066.m2616().m2765(resolvedTarget, value);
        } else if (i4 == 1) {
            ((C0548) this).f2081.m2616().m2765(resolvedTarget, value);
        } else if (i4 == 2) {
            ((C0548) this).f2060.m2616().m2765(resolvedTarget, value);
        } else if (i4 == 3) {
            ((C0548) this).f2071.m2616().m2765(resolvedTarget, value);
        }
    }

    @Override // ♫.C0548
    /* renamed from: θ  reason: contains not printable characters */
    public void m2600(C0533 system) {
        Object[] objArr;
        C0544[] r0 = ((C0548) this).f2088;
        r0[0] = ((C0548) this).f2081;
        r0[2] = ((C0548) this).f2071;
        r0[1] = ((C0548) this).f2066;
        r0[3] = ((C0548) this).f2060;
        int i = 0;
        while (true) {
            objArr = ((C0548) this).f2088;
            if (i >= objArr.length) {
                break;
            }
            objArr[i].f2031 = system.m2562((Object) objArr[i]);
            i++;
        }
        int i2 = this.f2010;
        if (i2 >= 0 && i2 < 4) {
            C0544 position = objArr[i2];
            boolean hasMatchConstraintWidgets = false;
            int i3 = 0;
            while (true) {
                if (i3 >= this.f2160) {
                    break;
                }
                C0548 widget = ((C0553) this).f2159[i3];
                if (this.f2008 || widget.m2687()) {
                    int i4 = this.f2010;
                    if ((i4 != 0 && i4 != 1) || widget.m2665() != C0548.EnumC0549.MATCH_CONSTRAINT) {
                        int i5 = this.f2010;
                        if ((i5 == 2 || i5 == 3) && widget.m2646() == C0548.EnumC0549.MATCH_CONSTRAINT) {
                            hasMatchConstraintWidgets = true;
                            break;
                        }
                    } else {
                        hasMatchConstraintWidgets = true;
                        break;
                    }
                }
                i3++;
            }
            int i6 = this.f2010;
            if (i6 == 0 || i6 == 1) {
                if (m2667().m2665() == C0548.EnumC0549.WRAP_CONTENT) {
                    hasMatchConstraintWidgets = false;
                }
            } else if (m2667().m2646() == C0548.EnumC0549.WRAP_CONTENT) {
                hasMatchConstraintWidgets = false;
            }
            for (int i7 = 0; i7 < this.f2160; i7++) {
                C0548 widget2 = ((C0553) this).f2159[i7];
                if (this.f2008 || widget2.m2687()) {
                    C0538 target = system.m2562(widget2.f2088[this.f2010]);
                    C0544[] r9 = widget2.f2088;
                    int i8 = this.f2010;
                    r9[i8].f2031 = target;
                    if (i8 == 0 || i8 == 2) {
                        system.m2553(position.f2031, target, hasMatchConstraintWidgets);
                    } else {
                        system.m2572(position.f2031, target, hasMatchConstraintWidgets);
                    }
                }
            }
            int i9 = this.f2010;
            if (i9 == 0) {
                system.m2558(((C0548) this).f2066.f2031, ((C0548) this).f2081.f2031, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.m2558(((C0548) this).f2081.f2031, ((C0548) this).f2082.f2066.f2031, 0, 5);
                }
            } else if (i9 == 1) {
                system.m2558(((C0548) this).f2081.f2031, ((C0548) this).f2066.f2031, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.m2558(((C0548) this).f2081.f2031, ((C0548) this).f2082.f2081.f2031, 0, 5);
                }
            } else if (i9 == 2) {
                system.m2558(((C0548) this).f2060.f2031, ((C0548) this).f2071.f2031, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.m2558(((C0548) this).f2071.f2031, ((C0548) this).f2082.f2060.f2031, 0, 5);
                }
            } else if (i9 == 3) {
                system.m2558(((C0548) this).f2071.f2031, ((C0548) this).f2060.f2031, 0, 6);
                if (!hasMatchConstraintWidgets) {
                    system.m2558(((C0548) this).f2071.f2031, ((C0548) this).f2082.f2071.f2031, 0, 5);
                }
            }
        }
    }
}
