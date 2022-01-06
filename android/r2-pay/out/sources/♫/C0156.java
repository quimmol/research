package ♫;

import java.util.HashMap;

/* renamed from: ♫.Ι  reason: contains not printable characters */
public class C0156 {

    /* renamed from: θ  reason: contains not printable characters */
    public final HashMap<String, AbstractC0598> f727 = new HashMap<>();

    /* renamed from: θ  reason: contains not printable characters */
    public final void m788(String key, AbstractC0598 viewModel) {
        AbstractC0598 oldViewModel = this.f727.put(key, viewModel);
        if (oldViewModel != null) {
            oldViewModel.m2902();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final AbstractC0598 m786(String key) {
        return this.f727.get(key);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m787() {
        for (AbstractC0598 vm : this.f727.values()) {
            vm.m2902();
        }
        this.f727.clear();
    }
}
