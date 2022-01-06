package ♫;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ♫.C0544;
import ♫.C0548;

/* renamed from: ♫.趋  reason: contains not printable characters */
public class C0550 extends C0561 {

    /* renamed from: µ  reason: contains not printable characters */
    public boolean f2121 = false;

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean f2122 = false;

    /* renamed from: ö  reason: contains not printable characters */
    public boolean f2123 = false;

    /* renamed from: Φ  reason: contains not printable characters */
    public C0543[] f2124 = new C0543[4];

    /* renamed from: θ  reason: contains not printable characters */
    public List<C0551> f2125 = new ArrayList();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0533 f2126 = new C0533();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0559 f2127;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0543[] f2128 = new C0543[4];

    /* renamed from: П  reason: contains not printable characters */
    public int f2129;

    /* renamed from: Р  reason: contains not printable characters */
    public int f2130;

    /* renamed from: С  reason: contains not printable characters */
    public int f2131;

    /* renamed from: Т  reason: contains not printable characters */
    public int f2132;

    /* renamed from: У  reason: contains not printable characters */
    public int f2133 = 0;

    /* renamed from: Ф  reason: contains not printable characters */
    public int f2134 = 0;

    /* renamed from: Х  reason: contains not printable characters */
    public int f2135 = 0;

    /* renamed from: Ц  reason: contains not printable characters */
    public int f2136 = 0;

    /* renamed from: Ч  reason: contains not printable characters */
    public int f2137 = 7;

    /* renamed from: ฿  reason: contains not printable characters */
    public boolean f2138 = false;

    /* renamed from: ₣  reason: contains not printable characters */
    public boolean f2139 = false;

    /* renamed from: ₤  reason: contains not printable characters */
    public boolean f2140 = false;

    /* renamed from: ₩  reason: contains not printable characters */
    public boolean f2141 = false;

    /* renamed from: Г  reason: contains not printable characters */
    public void m2721(int value) {
        this.f2137 = value;
    }

    /* renamed from: В  reason: contains not printable characters */
    public int m2720() {
        return this.f2137;
    }

    @Override // ♫.C0548, ♫.C0548
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m2713(int feature) {
        return (this.f2137 & feature) == feature;
    }

    @Override // ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0561
    /* renamed from: Φ  reason: contains not printable characters */
    public void m2712() {
        this.f2126.m2546();
        this.f2129 = 0;
        this.f2131 = 0;
        this.f2130 = 0;
        this.f2132 = 0;
        this.f2125.clear();
        this.f2138 = false;
        super.m2783();
    }

    @Override // ♫.C0548
    /* renamed from: ₧  reason: contains not printable characters */
    public boolean m2729() {
        return this.f2139;
    }

    @Override // ♫.C0548, ♫.C0561
    /* renamed from: ₣  reason: contains not printable characters */
    public boolean m2725() {
        return this.f2140;
    }

    @Override // ♫.C0548
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2717(C0533 system) {
        m2679(system);
        int count = ((C0561) this).f2186.size();
        for (int i = 0; i < count; i++) {
            C0548 widget = ((C0561) this).f2186.get(i);
            if (widget instanceof C0550) {
                C0548.EnumC0549[] r5 = widget.f2089;
                C0548.EnumC0549 horizontalBehaviour = r5[0];
                C0548.EnumC0549 verticalBehaviour = r5[1];
                if (horizontalBehaviour == C0548.EnumC0549.WRAP_CONTENT) {
                    widget.m2682(C0548.EnumC0549.FIXED);
                }
                if (verticalBehaviour == C0548.EnumC0549.WRAP_CONTENT) {
                    widget.m2655(C0548.EnumC0549.FIXED);
                }
                widget.m2679(system);
                if (horizontalBehaviour == C0548.EnumC0549.WRAP_CONTENT) {
                    widget.m2682(horizontalBehaviour);
                }
                if (verticalBehaviour == C0548.EnumC0549.WRAP_CONTENT) {
                    widget.m2655(verticalBehaviour);
                }
            } else {
                C0554.m2752(this, system, widget);
                widget.m2679(system);
            }
        }
        if (this.f2133 > 0) {
            C0542.m2603(this, system, 0);
        }
        if (this.f2134 > 0) {
            C0542.m2603(this, system, 1);
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2715(C0533 system, boolean[] flags) {
        flags[2] = false;
        m2642(system);
        int count = ((C0561) this).f2186.size();
        for (int i = 0; i < count; i++) {
            C0548 widget = ((C0561) this).f2186.get(i);
            widget.m2642(system);
            if (widget.f2089[0] == C0548.EnumC0549.MATCH_CONSTRAINT && widget.m2700() < widget.m2696()) {
                flags[2] = true;
            }
            if (widget.f2089[1] == C0548.EnumC0549.MATCH_CONSTRAINT && widget.m2632() < widget.m2702()) {
                flags[2] = true;
            }
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2711(boolean isRtl) {
        this.f2122 = isRtl;
    }

    @Override // ♫.C0548
    /* renamed from: ₤  reason: contains not printable characters */
    public boolean m2727() {
        return this.f2122;
    }

    @Override // ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548, ♫.C0548
    /* renamed from: θ  reason: contains not printable characters */
    public void m2714(int optimizationLevel) {
        super.m2671(optimizationLevel);
        int count = ((C0561) this).f2186.size();
        for (int i = 0; i < count; i++) {
            ((C0561) this).f2186.get(i).m2671(optimizationLevel);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f2  */
    @Override // ♫.C0548, ♫.C0561
    /* renamed from: ฿  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m2722() {
        /*
        // Method dump skipped, instructions count: 895
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0550.m2722():void");
    }

    @Override // ♫.C0548
    /* renamed from: ₢  reason: contains not printable characters */
    public void m2724() {
        m2728();
        m2714(this.f2137);
    }

    @Override // ♫.C0548
    /* renamed from: Б  reason: contains not printable characters */
    public void m2719() {
        C0556 leftNode = m2664(C0544.EnumC0545.LEFT).m2616();
        C0556 topNode = m2664(C0544.EnumC0545.TOP).m2616();
        leftNode.m2765((C0556) null, 0.0f);
        topNode.m2765((C0556) null, 0.0f);
    }

    /* renamed from: µ  reason: contains not printable characters */
    public void m2708(int width, int height) {
        C0557 r0;
        C0557 r02;
        if (!(((C0548) this).f2089[0] == C0548.EnumC0549.WRAP_CONTENT || (r02 = ((C0548) this).f2084) == null)) {
            r02.m2770(width);
        }
        if (((C0548) this).f2089[1] != C0548.EnumC0549.WRAP_CONTENT && (r0 = ((C0548) this).f2072) != null) {
            r0.m2770(height);
        }
    }

    @Override // ♫.C0548
    /* renamed from: ₧  reason: contains not printable characters */
    public void m2728() {
        int count = ((C0561) this).f2186.size();
        m2627();
        for (int i = 0; i < count; i++) {
            ((C0561) this).f2186.get(i).m2627();
        }
    }

    @Override // ♫.C0548
    /* renamed from: ₤  reason: contains not printable characters */
    public void m2726() {
        if (!m2713(8)) {
            m2714(this.f2137);
        }
        m2719();
    }

    @Override // ♫.C0548, ♫.C0561
    /* renamed from: ฿  reason: contains not printable characters */
    public boolean m2723() {
        return false;
    }

    @Override // ♫.C0548
    /* renamed from: А  reason: contains not printable characters */
    public final void m2718() {
        this.f2133 = 0;
        this.f2134 = 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2716(C0548 constraintWidget, int type) {
        if (type == 0) {
            m2709(constraintWidget);
        } else if (type == 1) {
            m2710(constraintWidget);
        }
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public final void m2709(C0548 widget) {
        int i = this.f2133 + 1;
        C0543[] r1 = this.f2124;
        if (i >= r1.length) {
            this.f2124 = (C0543[]) Arrays.copyOf(r1, r1.length * 2);
        }
        this.f2124[this.f2133] = new C0543(widget, 0, m2727());
        this.f2133++;
    }

    /* renamed from: ö  reason: contains not printable characters */
    public final void m2710(C0548 widget) {
        int i = this.f2134 + 1;
        C0543[] r2 = this.f2128;
        if (i >= r2.length) {
            this.f2128 = (C0543[]) Arrays.copyOf(r2, r2.length * 2);
        }
        this.f2128[this.f2134] = new C0543(widget, 1, m2727());
        this.f2134++;
    }
}
