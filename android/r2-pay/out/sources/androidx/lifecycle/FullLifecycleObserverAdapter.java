package androidx.lifecycle;

import ♫.AbstractC0246;
import ♫.AbstractC0257;
import ♫.AbstractC0277;
import ♫.AbstractC0577;

public class FullLifecycleObserverAdapter implements AbstractC0257 {

    /* renamed from: θ  reason: contains not printable characters */
    public final AbstractC0246 f485;

    @Override // ♫.AbstractC0257
    /* renamed from: θ  reason: contains not printable characters */
    public void m303(AbstractC0577 source, AbstractC0277.EnumC0279 event) {
        switch (event.ordinal()) {
            case 0:
                this.f485.m1134(source);
                return;
            case 1:
                this.f485.m1130(source);
                return;
            case 2:
                this.f485.m1129(source);
                return;
            case 3:
                this.f485.m1133(source);
                return;
            case 4:
                this.f485.m1132(source);
                return;
            case 5:
                this.f485.m1131(source);
                return;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
