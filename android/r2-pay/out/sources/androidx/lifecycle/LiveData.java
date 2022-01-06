package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import ♫.AbstractC0257;
import ♫.AbstractC0277;
import ♫.AbstractC0577;
import ♫.AbstractC0593;
import ♫.C0500;
import ♫.C0507;

public abstract class LiveData<T> {

    /* renamed from: Ø  reason: contains not printable characters */
    public static final Object f486 = new Object();

    /* renamed from: ø  reason: contains not printable characters */
    public volatile Object f487;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f488;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public volatile Object f489;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f490;

    /* renamed from: θ  reason: contains not printable characters */
    public int f491 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Object f492 = new Object();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0507<AbstractC0593<? super T>, LiveData<T>.AbstractC0061> f493 = new C0507<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f494;

    public LiveData() {
        Object obj = f486;
        this.f489 = obj;
        this.f487 = obj;
        this.f488 = -1;
        new RunnableC0062();
    }

    /* renamed from: androidx.lifecycle.LiveData$θ  reason: contains not printable characters */
    public class RunnableC0062 implements Runnable {
        public RunnableC0062() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.LiveData */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            Throwable th;
            synchronized (LiveData.this.f492) {
                try {
                    Object newValue = LiveData.this.f487;
                    try {
                        LiveData.this.f487 = LiveData.f486;
                        LiveData.this.m309(newValue);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m308(LiveData<T>.AbstractC0061 r3) {
        if (r3.f500) {
            if (!r3.m316()) {
                r3.m315(false);
                return;
            }
            int i = r3.f497;
            int i2 = this.f488;
            if (i < i2) {
                r3.f497 = i2;
                r3.f499.m2890((Object) this.f489);
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m306(LiveData<T>.AbstractC0061 r4) {
        if (this.f494) {
            this.f490 = true;
            return;
        }
        this.f494 = true;
        do {
            this.f490 = false;
            if (r4 == null) {
                Iterator<Map.Entry<Observer<? super T>, LiveData<T>.ObserverWrapper>> iterator = this.f493.m2389();
                while (iterator.hasNext()) {
                    m308((LiveData<T>.AbstractC0061) ((AbstractC0061) iterator.next().getValue()));
                    if (this.f490) {
                        break;
                    }
                }
            } else {
                m308(r4);
                r4 = null;
            }
        } while (this.f490);
        this.f494 = false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m310(AbstractC0593<? super T> r3) {
        m304("removeObserver");
        LiveData<T>.ObserverWrapper removed = (AbstractC0061) this.f493.m2386(r3);
        if (removed != null) {
            removed.m314();
            removed.m315(false);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m309(T value) {
        m304("setValue");
        this.f488++;
        this.f489 = value;
        m306(null);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m307() {
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m305() {
    }

    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0061 implements AbstractC0257 {

        /* renamed from: Φ  reason: contains not printable characters */
        public final /* synthetic */ LiveData f495;

        /* renamed from: θ  reason: contains not printable characters */
        public final AbstractC0577 f496;

        @Override // androidx.lifecycle.LiveData.AbstractC0061, androidx.lifecycle.LiveData.AbstractC0061
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m313() {
            return this.f496.m2815().m1243().m1245(AbstractC0277.EnumC0278.STARTED);
        }

        @Override // ♫.AbstractC0257
        /* renamed from: θ  reason: contains not printable characters */
        public void m312(AbstractC0577 source, AbstractC0277.EnumC0279 event) {
            if (this.f496.m2815().m1243() == AbstractC0277.EnumC0278.DESTROYED) {
                this.f495.m310((AbstractC0593) null);
            } else {
                m315(m313());
            }
        }

        @Override // androidx.lifecycle.LiveData.AbstractC0061, androidx.lifecycle.LiveData.AbstractC0061
        /* renamed from: θ  reason: contains not printable characters */
        public void m311() {
            this.f496.m2815().m1244(this);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$Φ  reason: contains not printable characters */
    public abstract class AbstractC0061 {

        /* renamed from: θ  reason: contains not printable characters */
        public int f497;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ LiveData f498;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final AbstractC0593<? super T> f499;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f500;

        /* renamed from: θ  reason: contains not printable characters */
        public abstract boolean m316();

        /* renamed from: θ  reason: contains not printable characters */
        public void m314() {
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m315(boolean newActive) {
            if (newActive != this.f500) {
                this.f500 = newActive;
                int i = 1;
                boolean wasInactive = this.f498.f491 == 0;
                LiveData liveData = this.f498;
                int i2 = liveData.f491;
                if (!this.f500) {
                    i = -1;
                }
                liveData.f491 = i2 + i;
                if (wasInactive && this.f500) {
                    this.f498.m307();
                }
                LiveData liveData2 = this.f498;
                if (liveData2.f491 == 0 && !this.f500) {
                    liveData2.m305();
                }
                if (this.f500) {
                    this.f498.m306(this);
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m304(String methodName) {
        if (!C0500.m2373().m2376()) {
            throw new IllegalStateException("Cannot invoke " + methodName + " on a background" + " thread");
        }
    }
}
