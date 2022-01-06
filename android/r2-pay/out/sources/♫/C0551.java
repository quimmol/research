package ♫;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ♫.C0544;

/* renamed from: ♫.跑  reason: contains not printable characters */
public class C0551 {

    /* renamed from: Ø  reason: contains not printable characters */
    public List<C0548> f2142 = new ArrayList();

    /* renamed from: ö  reason: contains not printable characters */
    public List<C0548> f2143 = new ArrayList();

    /* renamed from: ø  reason: contains not printable characters */
    public List<C0548> f2144 = new ArrayList();

    /* renamed from: Φ  reason: contains not printable characters */
    public int f2145 = -1;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public HashSet<C0548> f2146 = new HashSet<>();

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public List<C0548> f2147 = new ArrayList();

    /* renamed from: θ  reason: contains not printable characters */
    public int f2148 = -1;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public HashSet<C0548> f2149 = new HashSet<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public List<C0548> f2150;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f2151 = false;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final int[] f2152 = {this.f2148, this.f2145};

    public C0551(List<C0548> list) {
        this.f2150 = list;
    }

    public C0551(List<C0548> list, boolean skipSolver) {
        this.f2150 = list;
        this.f2151 = skipSolver;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public List<C0548> m2731(int orientation) {
        if (orientation == 0) {
            return this.f2147;
        }
        if (orientation == 1) {
            return this.f2144;
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Set<C0548> m2732(int orientation) {
        if (orientation == 0) {
            return this.f2149;
        }
        if (orientation == 1) {
            return this.f2146;
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2736(C0548 widget, int orientation) {
        if (orientation == 0) {
            this.f2149.add(widget);
        } else if (orientation == 1) {
            this.f2146.add(widget);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public List<C0548> m2730() {
        if (!this.f2142.isEmpty()) {
            return this.f2142;
        }
        int size = this.f2150.size();
        for (int i = 0; i < size; i++) {
            C0548 widget = this.f2150.get(i);
            if (!widget.f2085) {
                m2734((ArrayList) this.f2142, widget);
            }
        }
        this.f2143.clear();
        this.f2143.addAll(this.f2150);
        this.f2143.removeAll(this.f2142);
        return this.f2142;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2734(ArrayList<C0548> arrayList, C0548 widget) {
        C0548 targetWidget;
        if (!widget.f2067) {
            arrayList.add(widget);
            widget.f2067 = true;
            if (!widget.m2643()) {
                if (widget instanceof C0553) {
                    C0553 helper = (C0553) widget;
                    int widgetCount = helper.f2160;
                    for (int i = 0; i < widgetCount; i++) {
                        m2734(arrayList, helper.f2159[i]);
                    }
                }
                int count = widget.f2088.length;
                for (int i2 = 0; i2 < count; i2++) {
                    C0544 targetAnchor = widget.f2088[i2].f2034;
                    if (!(targetAnchor == null || (targetWidget = targetAnchor.f2035) == widget.m2667())) {
                        m2734(arrayList, targetWidget);
                    }
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2733() {
        int size = this.f2143.size();
        for (int i = 0; i < size; i++) {
            m2735(this.f2143.get(i));
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2735(C0548 widget) {
        C0544 targetAnchor;
        int end;
        C0544 targetAnchor2;
        int end2;
        int end3 = 0;
        if (widget.f2085 && !widget.m2643()) {
            boolean bottomSide = false;
            boolean rightSide = widget.f2066.f2034 != null;
            if (rightSide) {
                targetAnchor = widget.f2066.f2034;
            } else {
                targetAnchor = widget.f2081.f2034;
            }
            if (targetAnchor != null) {
                C0548 r6 = targetAnchor.f2035;
                if (!r6.f2073) {
                    m2735(r6);
                }
                C0544.EnumC0545 r62 = targetAnchor.f2032;
                if (r62 == C0544.EnumC0545.RIGHT) {
                    C0548 r63 = targetAnchor.f2035;
                    end3 = r63.f2092 + r63.m2700();
                } else if (r62 == C0544.EnumC0545.LEFT) {
                    end3 = targetAnchor.f2035.f2092;
                }
            }
            if (rightSide) {
                end = end3 - widget.f2066.m2608();
            } else {
                end = end3 + widget.f2081.m2608() + widget.m2700();
            }
            widget.m2672(end - widget.m2700(), end);
            C0544 r64 = widget.f2063;
            if (r64.f2034 != null) {
                C0544 targetAnchor3 = r64.f2034;
                C0548 r5 = targetAnchor3.f2035;
                if (!r5.f2073) {
                    m2735(r5);
                }
                C0548 r52 = targetAnchor3.f2035;
                int start = (r52.f2093 + r52.f2099) - widget.f2099;
                widget.m2635(start, widget.f2112 + start);
                widget.f2073 = true;
                return;
            }
            if (widget.f2060.f2034 != null) {
                bottomSide = true;
            }
            if (bottomSide) {
                targetAnchor2 = widget.f2060.f2034;
            } else {
                targetAnchor2 = widget.f2071.f2034;
            }
            if (targetAnchor2 != null) {
                C0548 r65 = targetAnchor2.f2035;
                if (!r65.f2073) {
                    m2735(r65);
                }
                C0544.EnumC0545 r66 = targetAnchor2.f2032;
                if (r66 == C0544.EnumC0545.BOTTOM) {
                    C0548 r67 = targetAnchor2.f2035;
                    end = r67.f2093 + r67.m2632();
                } else if (r66 == C0544.EnumC0545.TOP) {
                    end = targetAnchor2.f2035.f2093;
                }
            }
            if (bottomSide) {
                end2 = end - widget.f2060.m2608();
            } else {
                end2 = end + widget.f2071.m2608() + widget.m2632();
            }
            widget.m2635(end2 - widget.m2632(), end2);
            widget.f2073 = true;
        }
    }
}
