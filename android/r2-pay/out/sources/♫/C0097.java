package ♫;

import ♫.C0162;

/* renamed from: ♫.ʺ  reason: contains not printable characters */
public class C0097 {

    /* renamed from: θ  reason: contains not printable characters */
    public final AbstractC0098 f630;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0156 f631;

    /* renamed from: ♫.ʺ$θ  reason: contains not printable characters */
    public interface AbstractC0098 {
    }

    public C0097(C0156 store, AbstractC0098 factory) {
        this.f630 = factory;
        this.f631 = store;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public <T extends AbstractC0598> T m529(Class<T> modelClass) {
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) m530("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public <T extends AbstractC0598> T m530(String key, Class<T> modelClass) {
        T t = (T) this.f631.m786(key);
        if (modelClass.isInstance(t)) {
            return t;
        }
        T t2 = (T) ((C0162.C0163.C0164) this.f630).m802(modelClass);
        this.f631.m788(key, t2);
        return t2;
    }
}
