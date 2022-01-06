package ♫;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: ♫.ǃ  reason: contains not printable characters */
public class C0070 {

    /* renamed from: θ  reason: contains not printable characters */
    public final Object f512;

    public C0070(Object insets) {
        this.f512 = insets;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public int m336() {
        int i = Build.VERSION.SDK_INT;
        return ((WindowInsets) this.f512).getSystemWindowInsetLeft();
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public int m334() {
        int i = Build.VERSION.SDK_INT;
        return ((WindowInsets) this.f512).getSystemWindowInsetTop();
    }

    /* renamed from: ø  reason: contains not printable characters */
    public int m335() {
        int i = Build.VERSION.SDK_INT;
        return ((WindowInsets) this.f512).getSystemWindowInsetRight();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m337() {
        int i = Build.VERSION.SDK_INT;
        return ((WindowInsets) this.f512).getSystemWindowInsetBottom();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0070 m338(int left, int top, int right, int bottom) {
        int i = Build.VERSION.SDK_INT;
        return new C0070(((WindowInsets) this.f512).replaceSystemWindowInsets(left, top, right, bottom));
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        C0070 other = (C0070) o;
        Object obj = this.f512;
        if (obj != null) {
            return obj.equals(other.f512);
        }
        if (other.f512 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f512;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0070 m333(Object insets) {
        if (insets == null) {
            return null;
        }
        return new C0070(insets);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Object m332(C0070 insets) {
        if (insets == null) {
            return null;
        }
        return insets.f512;
    }
}
