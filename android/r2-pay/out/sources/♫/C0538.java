package ♫;

import java.util.Arrays;

/* renamed from: ♫.记  reason: contains not printable characters */
public class C0538 {

    /* renamed from: µ  reason: contains not printable characters */
    public static int f1991 = 1;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1992 = 0;

    /* renamed from: ö  reason: contains not printable characters */
    public int f1993 = 0;

    /* renamed from: ø  reason: contains not printable characters */
    public int f1994 = 0;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1995 = -1;

    /* renamed from: θ  reason: contains not printable characters */
    public float f1996;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f1997 = -1;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public String f1998;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public EnumC0539 f1999;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public float[] f2000 = new float[7];

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0530[] f2001 = new C0530[8];

    /* renamed from: ♫.记$θ  reason: contains not printable characters */
    public enum EnumC0539 {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static void m2578() {
        f1991++;
    }

    public C0538(EnumC0539 type) {
        this.f1999 = type;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2582(C0530 row) {
        int i = 0;
        while (true) {
            int i2 = this.f1992;
            if (i >= i2) {
                C0530[] r0 = this.f2001;
                if (i2 >= r0.length) {
                    this.f2001 = (C0530[]) Arrays.copyOf(r0, r0.length * 2);
                }
                C0530[] r02 = this.f2001;
                int i3 = this.f1992;
                r02[i3] = row;
                this.f1992 = i3 + 1;
                return;
            } else if (this.f2001[i] != row) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2580(C0530 row) {
        int count = this.f1992;
        for (int i = 0; i < count; i++) {
            if (this.f2001[i] == row) {
                for (int j = 0; j < (count - i) - 1; j++) {
                    C0530[] r3 = this.f2001;
                    r3[i + j] = r3[i + j + 1];
                }
                this.f1992--;
                return;
            }
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m2579(C0530 definition) {
        int count = this.f1992;
        for (int i = 0; i < count; i++) {
            C0530[] r3 = this.f2001;
            r3[i].f1966.m2510(r3[i], definition, false);
        }
        this.f1992 = 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2581() {
        this.f1998 = null;
        this.f1999 = EnumC0539.UNKNOWN;
        this.f1994 = 0;
        this.f1997 = -1;
        this.f1995 = -1;
        this.f1996 = 0.0f;
        this.f1992 = 0;
        this.f1993 = 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2583(EnumC0539 type) {
        this.f1999 = type;
    }

    public String toString() {
        return "" + this.f1998;
    }
}
