package ♫;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ♫.ʳ  reason: contains not printable characters */
public class C0079 {

    /* renamed from: ø  reason: contains not printable characters */
    public final int f586;

    /* renamed from: Φ  reason: contains not printable characters */
    public final int f587;

    /* renamed from: θ  reason: contains not printable characters */
    public int f588;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Handler.Callback f589 = new C0084();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Handler f590;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public HandlerThread f591;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Object f592 = new Object();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final String f593;

    /* renamed from: ♫.ʳ$Ø  reason: contains not printable characters */
    public interface AbstractC0080<T> {
        /* renamed from: θ  reason: contains not printable characters */
        void m477(T t);
    }

    /* renamed from: ♫.ʳ$θ  reason: contains not printable characters */
    public class C0084 implements Handler.Callback {
        public C0084() {
        }

        public boolean handleMessage(Message msg) {
            int i = msg.what;
            if (i == 0) {
                C0079.this.m474();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                C0079.this.m475((Runnable) msg.obj);
                return true;
            }
        }
    }

    public C0079(String threadName, int priority, int destructAfterMillisec) {
        this.f593 = threadName;
        this.f586 = priority;
        this.f587 = destructAfterMillisec;
        this.f588 = 0;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m472(Runnable runnable) {
        synchronized (this.f592) {
            if (this.f591 == null) {
                this.f591 = new HandlerThread(this.f593, this.f586);
                this.f591.start();
                this.f590 = new Handler(this.f591.getLooper(), this.f589);
                this.f588++;
            }
            this.f590.removeMessages(0);
            this.f590.sendMessage(this.f590.obtainMessage(1, runnable));
        }
    }

    /* renamed from: ♫.ʳ$Φ  reason: contains not printable characters */
    public class RunnableC0082 implements Runnable {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ Handler f599;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ Callable f600;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ AbstractC0080 f601;

        public RunnableC0082(C0079 this$0, Callable callable, Handler handler, AbstractC0080 r4) {
            this.f600 = callable;
            this.f599 = handler;
            this.f601 = r4;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f600.call();
            } catch (Exception e) {
                obj = null;
            }
            this.f599.post(new RunnableC0083(obj));
        }

        /* renamed from: ♫.ʳ$Φ$θ  reason: contains not printable characters */
        public class RunnableC0083 implements Runnable {

            /* renamed from: θ  reason: contains not printable characters */
            public final /* synthetic */ Object f602;

            public RunnableC0083(Object obj) {
                this.f602 = obj;
            }

            public void run() {
                RunnableC0082.this.f601.m477(this.f602);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public <T> void m476(Callable<T> callable, AbstractC0080<T> r4) {
        m472(new RunnableC0082(this, callable, new Handler(), r4));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public <T> T m473(Callable<T> callable, int timeoutMillis) {
        ReentrantLock lock = new ReentrantLock();
        Condition cond = lock.newCondition();
        AtomicReference<T> holder = new AtomicReference<>();
        AtomicBoolean running = new AtomicBoolean(true);
        m472(new RunnableC0081(this, holder, callable, lock, running, cond));
        lock.lock();
        try {
            if (!running.get()) {
                return holder.get();
            }
            long remaining = TimeUnit.MILLISECONDS.toNanos((long) timeoutMillis);
            do {
                try {
                    remaining = cond.awaitNanos(remaining);
                } catch (InterruptedException e) {
                }
                if (!running.get()) {
                    T t = holder.get();
                    lock.unlock();
                    return t;
                }
            } while (remaining > 0);
            throw new InterruptedException("timeout");
        } finally {
            lock.unlock();
        }
    }

    /* renamed from: ♫.ʳ$ø  reason: contains not printable characters */
    public class RunnableC0081 implements Runnable {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ Callable f594;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ AtomicBoolean f595;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ AtomicReference f596;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ Condition f597;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ReentrantLock f598;

        public RunnableC0081(C0079 this$0, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f596 = atomicReference;
            this.f594 = callable;
            this.f598 = reentrantLock;
            this.f595 = atomicBoolean;
            this.f597 = condition;
        }

        public void run() {
            try {
                this.f596.set(this.f594.call());
            } catch (Exception e) {
            }
            this.f598.lock();
            try {
                this.f595.set(false);
                this.f597.signal();
            } finally {
                this.f598.unlock();
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m475(Runnable runnable) {
        runnable.run();
        synchronized (this.f592) {
            this.f590.removeMessages(0);
            this.f590.sendMessageDelayed(this.f590.obtainMessage(0), (long) this.f587);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m474() {
        synchronized (this.f592) {
            if (!this.f590.hasMessages(1)) {
                this.f591.quit();
                this.f591 = null;
                this.f590 = null;
            }
        }
    }
}
