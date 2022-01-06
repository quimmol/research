package ♫;

import ♫.C0538;

/* renamed from: ♫.财  reason: contains not printable characters */
public class C0544 {

    /* renamed from: ø  reason: contains not printable characters */
    public int f2028;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f2029 = -1;

    /* renamed from: θ  reason: contains not printable characters */
    public int f2030 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0538 f2031;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final EnumC0545 f2032;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public EnumC0546 f2033 = EnumC0546.NONE;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0544 f2034;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0548 f2035;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0556 f2036 = new C0556(this);

    /* renamed from: ♫.财$ø  reason: contains not printable characters */
    public enum EnumC0545 {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* renamed from: ♫.财$Φ  reason: contains not printable characters */
    public enum EnumC0546 {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: ♫.财$θ  reason: contains not printable characters */
    public enum EnumC0547 {
        RELAXED,
        STRICT
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0556 m2616() {
        return this.f2036;
    }

    public C0544(C0548 owner, EnumC0545 type) {
        EnumC0547 r1 = EnumC0547.RELAXED;
        this.f2028 = 0;
        this.f2035 = owner;
        this.f2032 = type;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0538 m2611() {
        return this.f2031;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2609() {
        C0538 r0 = this.f2031;
        if (r0 == null) {
            this.f2031 = new C0538(C0538.EnumC0539.UNRESTRICTED);
        } else {
            r0.m2581();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0548 m2615() {
        return this.f2035;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public EnumC0545 m2612() {
        return this.f2032;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public int m2608() {
        C0544 r0;
        if (this.f2035.m2698() == 8) {
            return 0;
        }
        if (this.f2029 <= -1 || (r0 = this.f2034) == null || r0.f2035.m2698() != 8) {
            return this.f2030;
        }
        return this.f2029;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public EnumC0546 m2613() {
        return this.f2033;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0544 m2614() {
        return this.f2034;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2610() {
        return this.f2028;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2617() {
        this.f2034 = null;
        this.f2030 = 0;
        this.f2029 = -1;
        this.f2033 = EnumC0546.STRONG;
        this.f2028 = 0;
        EnumC0547 r0 = EnumC0547.RELAXED;
        this.f2036.m2757();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2621(C0544 toAnchor, int margin, EnumC0546 strength, int creator) {
        return m2620(toAnchor, margin, -1, strength, creator, false);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2620(C0544 toAnchor, int margin, int goneMargin, EnumC0546 strength, int creator, boolean forceConnection) {
        if (toAnchor == null) {
            this.f2034 = null;
            this.f2030 = 0;
            this.f2029 = -1;
            this.f2033 = EnumC0546.NONE;
            this.f2028 = 2;
            return true;
        } else if (!forceConnection && !m2619(toAnchor)) {
            return false;
        } else {
            this.f2034 = toAnchor;
            if (margin > 0) {
                this.f2030 = margin;
            } else {
                this.f2030 = 0;
            }
            this.f2029 = goneMargin;
            this.f2033 = strength;
            this.f2028 = creator;
            return true;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2618() {
        return this.f2034 != null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2619(C0544 anchor) {
        boolean isCompatible = false;
        if (anchor == null) {
            return false;
        }
        EnumC0545 target = anchor.m2612();
        EnumC0545 r2 = this.f2032;
        if (target != r2) {
            switch (r2.ordinal()) {
                case 0:
                case 5:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    boolean isCompatible2 = target == EnumC0545.LEFT || target == EnumC0545.RIGHT;
                    if (!(anchor.m2615() instanceof C0552)) {
                        return isCompatible2;
                    }
                    if (isCompatible2 || target == EnumC0545.CENTER_X) {
                        isCompatible = true;
                    }
                    return isCompatible;
                case 2:
                case 4:
                    boolean isCompatible3 = target == EnumC0545.TOP || target == EnumC0545.BOTTOM;
                    if (!(anchor.m2615() instanceof C0552)) {
                        return isCompatible3;
                    }
                    if (isCompatible3 || target == EnumC0545.CENTER_Y) {
                        isCompatible = true;
                    }
                    return isCompatible;
                case 6:
                    if (target == EnumC0545.BASELINE || target == EnumC0545.CENTER_X || target == EnumC0545.CENTER_Y) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(this.f2032.name());
            }
        } else if (r2 != EnumC0545.BASELINE || (anchor.m2615().m2657() && m2615().m2657())) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return this.f2035.m2662() + ":" + this.f2032.toString();
    }
}
