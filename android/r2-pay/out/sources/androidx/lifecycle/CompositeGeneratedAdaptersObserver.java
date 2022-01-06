package androidx.lifecycle;

import ♫.AbstractC0252;
import ♫.AbstractC0257;
import ♫.AbstractC0277;
import ♫.AbstractC0577;
import ♫.C0588;

public class CompositeGeneratedAdaptersObserver implements AbstractC0257 {

    /* renamed from: θ  reason: contains not printable characters */
    public final AbstractC0252[] f484;

    @Override // ♫.AbstractC0257
    /* renamed from: θ  reason: contains not printable characters */
    public void m302(AbstractC0577 source, AbstractC0277.EnumC0279 event) {
        C0588 logger = new C0588();
        for (AbstractC0252 mGenerated : this.f484) {
            mGenerated.m1173(source, event, false, logger);
        }
        for (AbstractC0252 mGenerated2 : this.f484) {
            mGenerated2.m1173(source, event, true, logger);
        }
    }
}
