package ♫;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ♫.的  reason: contains not printable characters */
public class C0503 extends AbstractC0505 {

    /* renamed from: θ  reason: contains not printable characters */
    public volatile Handler f1879;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Object f1880 = new Object();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final ExecutorService f1881 = Executors.newFixedThreadPool(2, new ThreadFactoryC0504(this));

    /* renamed from: ♫.的$θ  reason: contains not printable characters */
    public class ThreadFactoryC0504 implements ThreadFactory {

        /* renamed from: θ  reason: contains not printable characters */
        public final AtomicInteger f1882 = new AtomicInteger(0);

        public ThreadFactoryC0504(C0503 this$0) {
        }

        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            t.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f1882.getAndIncrement())));
            return t;
        }
    }

    @Override // ♫.AbstractC0505
    /* renamed from: θ  reason: contains not printable characters */
    public void m2378(Runnable runnable) {
        this.f1881.execute(runnable);
    }

    @Override // ♫.AbstractC0505
    /* renamed from: Φ  reason: contains not printable characters */
    public void m2377(Runnable runnable) {
        if (this.f1879 == null) {
            synchronized (this.f1880) {
                if (this.f1879 == null) {
                    this.f1879 = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f1879.post(runnable);
    }

    @Override // ♫.AbstractC0505
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2379() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
