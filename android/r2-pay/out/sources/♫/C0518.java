package ♫;

/* renamed from: ♫.笑  reason: contains not printable characters */
public class C0518 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final int[] f1910 = new int[0];

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final long[] f1911 = new long[0];

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final Object[] f1912 = new Object[0];

    /* renamed from: Φ  reason: contains not printable characters */
    public static int m2433(int need) {
        return m2434(need * 4) / 4;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public static int m2432(int need) {
        return m2434(need * 8) / 8;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m2434(int need) {
        for (int i = 4; i < 32; i++) {
            if (need <= (1 << i) - 12) {
                return (1 << i) - 12;
            }
        }
        return need;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2437(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m2435(int[] array, int size, int value) {
        int lo = 0;
        int hi = size - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            int midVal = array[mid];
            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal <= value) {
                return mid;
            } else {
                hi = mid - 1;
            }
        }
        return ~lo;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m2436(long[] array, int size, long value) {
        int lo = 0;
        int hi = size - 1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            long midVal = array[mid];
            if (midVal < value) {
                lo = mid + 1;
            } else if (midVal <= value) {
                return mid;
            } else {
                hi = mid - 1;
            }
        }
        return ~lo;
    }
}
