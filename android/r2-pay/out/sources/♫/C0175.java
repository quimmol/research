package ♫;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: ♫.ۥ  reason: contains not printable characters */
public class C0175 {

    /* renamed from: Φ  reason: contains not printable characters */
    public static final View.AccessibilityDelegate f787 = new View.AccessibilityDelegate();

    /* renamed from: θ  reason: contains not printable characters */
    public final View.AccessibilityDelegate f788 = new C0176(this);

    /* renamed from: ♫.ۥ$θ  reason: contains not printable characters */
    public static final class C0176 extends View.AccessibilityDelegate {

        /* renamed from: θ  reason: contains not printable characters */
        public final C0175 f789;

        public C0176(C0175 compat) {
            this.f789 = compat;
        }

        public boolean dispatchPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            return this.f789.m881(host, event);
        }

        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            this.f789.m878(host, event);
        }

        public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
            this.f789.m879(host, C0078.m449(info));
        }

        public void onPopulateAccessibilityEvent(View host, AccessibilityEvent event) {
            this.f789.m874(host, event);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup host, View child, AccessibilityEvent event) {
            return this.f789.m882(host, child, event);
        }

        public void sendAccessibilityEvent(View host, int eventType) {
            this.f789.m877(host, eventType);
        }

        public void sendAccessibilityEventUnchecked(View host, AccessibilityEvent event) {
            this.f789.m873(host, event);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View host) {
            C0128 provider = this.f789.m876(host);
            if (provider != null) {
                return (AccessibilityNodeProvider) provider.m642();
            }
            return null;
        }

        public boolean performAccessibilityAction(View host, int action, Bundle args) {
            return this.f789.m880(host, action, args);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public View.AccessibilityDelegate m875() {
        return this.f788;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m877(View host, int eventType) {
        f787.sendAccessibilityEvent(host, eventType);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m873(View host, AccessibilityEvent event) {
        f787.sendAccessibilityEventUnchecked(host, event);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m881(View host, AccessibilityEvent event) {
        return f787.dispatchPopulateAccessibilityEvent(host, event);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m874(View host, AccessibilityEvent event) {
        f787.onPopulateAccessibilityEvent(host, event);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m878(View host, AccessibilityEvent event) {
        f787.onInitializeAccessibilityEvent(host, event);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m879(View host, C0078 info) {
        f787.onInitializeAccessibilityNodeInfo(host, info.m460());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m882(ViewGroup host, View child, AccessibilityEvent event) {
        return f787.onRequestSendAccessibilityEvent(host, child, event);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0128 m876(View host) {
        int i = Build.VERSION.SDK_INT;
        Object provider = f787.getAccessibilityNodeProvider(host);
        if (provider != null) {
            return new C0128(provider);
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m880(View host, int action, Bundle args) {
        int i = Build.VERSION.SDK_INT;
        return f787.performAccessibilityAction(host, action, args);
    }
}
