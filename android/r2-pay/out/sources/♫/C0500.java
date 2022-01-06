package ♫;

import java.util.concurrent.Executor;

/* renamed from: ♫.百  reason: contains not printable characters */
public class C0500 extends AbstractC0505 {

    /* renamed from: θ  reason: contains not printable characters */
    public static volatile C0500 f1876;

    /* renamed from: Φ  reason: contains not printable characters */
    public AbstractC0505 f1877 = new C0503();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0505 f1878 = this.f1877;

    static {
        new ExecutorC0502();
        new ExecutorC0501();
    }

    /* renamed from: ♫.百$θ  reason: contains not printable characters */
    public static class ExecutorC0502 implements Executor {
        public void execute(Runnable command) {
            C0500.m2373().m2374(command);
        }
    }

    /* renamed from: ♫.百$Φ  reason: contains not printable characters */
    public static class ExecutorC0501 implements Executor {
        public void execute(Runnable command) {
            C0500.m2373().m2375(command);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0500 m2373() {
        if (f1876 != null) {
            return f1876;
        }
        synchronized (C0500.class) {
            if (f1876 == null) {
                f1876 = new C0500();
            }
        }
        return f1876;
    }

    @Override // ♫.AbstractC0505
    /* renamed from: θ  reason: contains not printable characters */
    public void m2375(Runnable runnable) {
        this.f1878.m2381(runnable);
    }

    @Override // ♫.AbstractC0505
    /* renamed from: Φ  reason: contains not printable characters */
    public void m2374(Runnable runnable) {
        this.f1878.m2380(runnable);
    }

    @Override // ♫.AbstractC0505
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2376() {
        return this.f1878.m2382();
    }
}
