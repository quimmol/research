package ♫;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: ♫.经  reason: contains not printable characters */
public class C0520<K, V> {

    /* renamed from: µ  reason: contains not printable characters */
    public int f1918;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1919;

    /* renamed from: ö  reason: contains not printable characters */
    public int f1920;

    /* renamed from: ø  reason: contains not printable characters */
    public int f1921;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1922;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1923;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final LinkedHashMap<K, V> f1924;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f1925;

    public C0520(int maxSize) {
        if (maxSize > 0) {
            this.f1922 = maxSize;
            this.f1924 = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        m2451();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (0 != 0) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r5.f1919++;
        r0 = r5.f1924.put(r6, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        if (r0 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        r5.f1924.put(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        r5.f1923 += m2450((java.lang.Object) r6, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r0 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        m2454();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        m2455(r5.f1922);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        return null;
     */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V m2452(K r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0059
            monitor-enter(r5)
            r0 = 0
            java.util.LinkedHashMap<K, V> r1 = r5.f1924     // Catch:{ all -> 0x0051 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0014
            int r0 = r5.f1918     // Catch:{ all -> 0x0057 }
            int r0 = r0 + 1
            r5.f1918 = r0     // Catch:{ all -> 0x0057 }
            monitor-exit(r5)     // Catch:{ all -> 0x0057 }
            return r1
        L_0x0014:
            int r2 = r5.f1925     // Catch:{ all -> 0x0057 }
            int r2 = r2 + 1
            r5.f1925 = r2     // Catch:{ all -> 0x0057 }
            monitor-exit(r5)     // Catch:{ all -> 0x0057 }
            r5.m2451()
            r2 = 0
            if (r2 != 0) goto L_0x0022
            return r0
        L_0x0022:
            monitor-enter(r5)
            int r0 = r5.f1919     // Catch:{ all -> 0x004e }
            int r0 = r0 + 1
            r5.f1919 = r0     // Catch:{ all -> 0x004e }
            java.util.LinkedHashMap<K, V> r0 = r5.f1924     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.put(r6, r2)     // Catch:{ all -> 0x004e }
            r1 = r0
            if (r1 == 0) goto L_0x0038
            java.util.LinkedHashMap<K, V> r0 = r5.f1924     // Catch:{ all -> 0x004e }
            r0.put(r6, r1)     // Catch:{ all -> 0x004e }
            goto L_0x0041
        L_0x0038:
            int r0 = r5.f1923     // Catch:{ all -> 0x004e }
            int r3 = r5.m2450(r6, r2)     // Catch:{ all -> 0x004e }
            int r0 = r0 + r3
            r5.f1923 = r0     // Catch:{ all -> 0x004e }
        L_0x0041:
            monitor-exit(r5)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0048
            r5.m2454()
            return r1
        L_0x0048:
            int r0 = r5.f1922
            r5.m2455(r0)
            return r2
        L_0x004e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0051:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0055:
            monitor-exit(r5)
            throw r0
        L_0x0057:
            r0 = move-exception
            goto L_0x0055
        L_0x0059:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0520.m2452(java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r0 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        m2454();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        m2455(r3.f1922);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return r0;
     */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V m2453(K r4, V r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0037
            if (r5 == 0) goto L_0x0037
            monitor-enter(r3)
            r0 = 0
            int r1 = r3.f1921     // Catch:{ all -> 0x0032 }
            int r1 = r1 + 1
            r3.f1921 = r1     // Catch:{ all -> 0x0032 }
            int r1 = r3.f1923     // Catch:{ all -> 0x0032 }
            int r2 = r3.m2450(r4, r5)     // Catch:{ all -> 0x0032 }
            int r1 = r1 + r2
            r3.f1923 = r1     // Catch:{ all -> 0x0032 }
            java.util.LinkedHashMap<K, V> r1 = r3.f1924     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r1.put(r4, r5)     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0026
            int r1 = r3.f1923     // Catch:{ all -> 0x0035 }
            int r2 = r3.m2450(r4, r0)     // Catch:{ all -> 0x0035 }
            int r1 = r1 - r2
            r3.f1923 = r1     // Catch:{ all -> 0x0035 }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002c
            r3.m2454()
        L_0x002c:
            int r1 = r3.f1922
            r3.m2455(r1)
            return r0
        L_0x0032:
            r1 = move-exception
        L_0x0033:
            monitor-exit(r3)
            throw r1
        L_0x0035:
            r1 = move-exception
            goto L_0x0033
        L_0x0037:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "key == null || value == null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0520.m2453(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m2455(int r6) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0520.m2455(int):void");
    }

    /* JADX WARN: Incorrect args count in method signature: (ZTK;TV;TV;)V */
    /* renamed from: θ  reason: contains not printable characters */
    public void m2454() {
    }

    /* JADX WARN: Incorrect args count in method signature: (TK;)TV; */
    /* renamed from: θ  reason: contains not printable characters */
    public Object m2451() {
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m2450(K key, V value) {
        m2449();
        if (1 >= 0) {
            return 1;
        }
        throw new IllegalStateException("Negative size: " + ((Object) key) + "=" + ((Object) value));
    }

    /* JADX WARN: Incorrect args count in method signature: (TK;TV;)I */
    /* renamed from: θ  reason: contains not printable characters */
    public int m2449() {
        return 1;
    }

    public final synchronized String toString() {
        int accesses;
        accesses = this.f1918 + this.f1925;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f1922), Integer.valueOf(this.f1918), Integer.valueOf(this.f1925), Integer.valueOf(accesses != 0 ? (this.f1918 * 100) / accesses : 0));
    }
}
