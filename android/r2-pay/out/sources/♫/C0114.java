package ♫;

/* renamed from: ♫.ˈ  reason: contains not printable characters */
public final class C0114 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T[] m606(T[] r2, int r3, T r4) {
        /*
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L_0x001d
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = m604(r3)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L_0x001d:
            r2[r3] = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0114.m606(java.lang.Object[], int, java.lang.Object):java.lang.Object[]");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int[] m605(int[] array, int currentSize, int element) {
        if (currentSize + 1 > array.length) {
            int[] newArray = new int[m604(currentSize)];
            System.arraycopy(array, 0, newArray, 0, currentSize);
            array = newArray;
        }
        array[currentSize] = element;
        return array;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m604(int currentSize) {
        if (currentSize <= 4) {
            return 8;
        }
        return currentSize * 2;
    }
}
