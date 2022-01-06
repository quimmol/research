package ♫;

/* renamed from: ♫.ˮ  reason: contains not printable characters */
public class C0154 {
    /* renamed from: θ  reason: contains not printable characters */
    public static <T> T m779(T reference) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static <T> T m780(T reference, Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m778(int value) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException();
    }
}
