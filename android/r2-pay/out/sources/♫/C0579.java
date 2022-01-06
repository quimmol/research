package ♫;

import android.util.Log;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleRegistry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import ♫.AbstractC0277;

/* renamed from: ♫.וֹ  reason: contains not printable characters */
public class C0579 extends AbstractC0277 {

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean f2295 = false;

    /* renamed from: θ  reason: contains not printable characters */
    public int f2296 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final WeakReference<AbstractC0577> f2297;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ArrayList<AbstractC0277.EnumC0278> f2298 = new ArrayList<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0277.EnumC0278 f2299;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0506<AbstractC0285, C0580> f2300 = new C0506<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f2301 = false;

    public C0579(AbstractC0577 provider) {
        this.f2297 = new WeakReference<>(provider);
        this.f2299 = AbstractC0277.EnumC0278.INITIALIZED;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2837(AbstractC0277.EnumC0278 state) {
        m2833(state);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2838(AbstractC0277.EnumC0279 event) {
        m2833(m2829(event));
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2833(AbstractC0277.EnumC0278 next) {
        if (this.f2299 != next) {
            this.f2299 = next;
            if (this.f2301 || this.f2296 != 0) {
                this.f2295 = true;
                return;
            }
            this.f2301 = true;
            m2832();
            this.f2301 = false;
        }
    }

    @Override // ♫.AbstractC0277
    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2841() {
        if (this.f2300.size() == 0) {
            return true;
        }
        AbstractC0277.EnumC0278 eldestObserverState = this.f2300.m2388().getValue().f2303;
        AbstractC0277.EnumC0278 newestObserverState = this.f2300.m2385().getValue().f2303;
        if (eldestObserverState == newestObserverState && this.f2299 == newestObserverState) {
            return true;
        }
        return false;
    }

    @Override // ♫.AbstractC0277
    /* renamed from: θ  reason: contains not printable characters */
    public final void m2836() {
        ArrayList<AbstractC0277.EnumC0278> arrayList = this.f2298;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m2831(AbstractC0277.EnumC0278 state) {
        this.f2298.add(state);
    }

    @Override // ♫.AbstractC0277
    /* renamed from: θ  reason: contains not printable characters */
    public void m2839(AbstractC0285 observer) {
        this.f2300.m2383(observer);
    }

    @Override // ♫.AbstractC0277
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0277.EnumC0278 m2835() {
        return this.f2299;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static AbstractC0277.EnumC0278 m2829(AbstractC0277.EnumC0279 event) {
        int ordinal = event.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return AbstractC0277.EnumC0278.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return AbstractC0277.EnumC0278.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + event);
                    }
                }
            }
            return AbstractC0277.EnumC0278.STARTED;
        }
        return AbstractC0277.EnumC0278.CREATED;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static AbstractC0277.EnumC0279 m2830(AbstractC0277.EnumC0278 state) {
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException();
        } else if (ordinal == 1) {
            throw new IllegalArgumentException();
        } else if (ordinal == 2) {
            return AbstractC0277.EnumC0279.ON_DESTROY;
        } else {
            if (ordinal == 3) {
                return AbstractC0277.EnumC0279.ON_STOP;
            }
            if (ordinal == 4) {
                return AbstractC0277.EnumC0279.ON_PAUSE;
            }
            throw new IllegalArgumentException("Unexpected state value " + state);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static AbstractC0277.EnumC0279 m2827(AbstractC0277.EnumC0278 state) {
        int ordinal = state.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return AbstractC0277.EnumC0279.ON_CREATE;
        }
        if (ordinal == 2) {
            return AbstractC0277.EnumC0279.ON_START;
        }
        if (ordinal == 3) {
            return AbstractC0277.EnumC0279.ON_RESUME;
        }
        if (ordinal != 4) {
            throw new IllegalArgumentException("Unexpected state value " + state);
        }
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: ♫.破<♫.ᵧ, ♫.וֹ$θ> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2834(AbstractC0577 lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState>> ascendingIterator = this.f2300.m2389();
        while (ascendingIterator.hasNext() && !this.f2295) {
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> entry = ascendingIterator.next();
            C0580 observer = (C0580) entry.getValue();
            while (observer.f2303.compareTo((Enum) this.f2299) < 0 && !this.f2295 && this.f2300.contains(entry.getKey())) {
                m2831(observer.f2303);
                observer.m2842(lifecycleOwner, m2827(observer.f2303));
                m2836();
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2840(AbstractC0577 lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState>> descendingIterator = this.f2300.m2387();
        while (descendingIterator.hasNext() && !this.f2295) {
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> entry = descendingIterator.next();
            C0580 observer = (C0580) entry.getValue();
            while (observer.f2303.compareTo((Enum) this.f2299) > 0 && !this.f2295 && this.f2300.contains(entry.getKey())) {
                AbstractC0277.EnumC0279 event = m2830(observer.f2303);
                m2831(m2829(event));
                observer.m2842(lifecycleOwner, event);
                m2836();
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2832() {
        AbstractC0577 lifecycleOwner = this.f2297.get();
        if (lifecycleOwner == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m2841()) {
            this.f2295 = false;
            if (this.f2299.compareTo((Enum) this.f2300.m2388().getValue().f2303) < 0) {
                m2840(lifecycleOwner);
            }
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> newest = this.f2300.m2385();
            if (!this.f2295 && newest != null && this.f2299.compareTo((Enum) ((C0580) newest.getValue()).f2303) > 0) {
                m2834(lifecycleOwner);
            }
        }
        this.f2295 = false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static AbstractC0277.EnumC0278 m2828(AbstractC0277.EnumC0278 state1, AbstractC0277.EnumC0278 state2) {
        return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
    }

    /* renamed from: ♫.וֹ$θ  reason: contains not printable characters */
    public static class C0580 {

        /* renamed from: θ  reason: contains not printable characters */
        public AbstractC0257 f2302;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public AbstractC0277.EnumC0278 f2303;

        /* renamed from: θ  reason: contains not printable characters */
        public void m2842(AbstractC0577 owner, AbstractC0277.EnumC0279 event) {
            AbstractC0277.EnumC0278 newState = C0579.m2829(event);
            this.f2303 = C0579.m2828(this.f2303, newState);
            this.f2302.m1184(owner, event);
            this.f2303 = newState;
        }
    }
}
