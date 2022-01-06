package ♫;

/* renamed from: ♫.ᵞ  reason: contains not printable characters */
public abstract class AbstractC0277 {

    /* renamed from: ♫.ᵞ$θ  reason: contains not printable characters */
    public enum EnumC0279 {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: θ  reason: contains not printable characters */
    public abstract EnumC0278 m1243();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1244(AbstractC0285 v);

    /* renamed from: ♫.ᵞ$Φ  reason: contains not printable characters */
    public enum EnumC0278 {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1245(EnumC0278 state) {
            return compareTo(state) >= 0;
        }
    }
}
