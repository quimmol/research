package ♫;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import ♫.LayoutInflater$Factory2C0302;

/* renamed from: ♫.ᗮ  reason: contains not printable characters */
public class C0248 {

    /* renamed from: θ  reason: contains not printable characters */
    public static WeakHashMap<View, C0258> f974 = null;

    /* renamed from: ♫.ᗮ$Φ  reason: contains not printable characters */
    public interface AbstractC0250 {
        /* renamed from: θ  reason: contains not printable characters */
        boolean m1172(View view, KeyEvent keyEvent);
    }

    static {
        new AtomicInteger(1);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1161(View v, C0175 delegate) {
        v.setAccessibilityDelegate(delegate == null ? null : delegate.m875());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1152(View view) {
        int i = Build.VERSION.SDK_INT;
        view.postInvalidateOnAnimation();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1158(View view, Runnable action) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimation(action);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1159(View view, Runnable action, long delayMillis) {
        int i = Build.VERSION.SDK_INT;
        view.postOnAnimationDelayed(action, delayMillis);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m1146(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getLayoutDirection();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static int m1142(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getMinimumHeight();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0258 m1151(View view) {
        if (f974 == null) {
            f974 = new WeakHashMap<>();
        }
        C0258 vpa = f974.get(view);
        if (vpa != null) {
            return vpa;
        }
        C0258 vpa2 = new C0258(view);
        f974.put(view, vpa2);
        return vpa2;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1153(View view, float elevation) {
        int i = Build.VERSION.SDK_INT;
        view.setElevation(elevation);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1160(View view, String transitionName) {
        int i = Build.VERSION.SDK_INT;
        view.setTransitionName(transitionName);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m1149(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getTransitionName();
    }

    /* renamed from: ø  reason: contains not printable characters */
    public static int m1139(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static void m1143(View view) {
        int i = Build.VERSION.SDK_INT;
        view.requestApplyInsets();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1162(View v, AbstractC0208 listener) {
        int i = Build.VERSION.SDK_INT;
        if (listener == null) {
            v.setOnApplyWindowInsetsListener(null);
        } else {
            v.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0251(listener));
        }
    }

    /* renamed from: ♫.ᗮ$θ  reason: contains not printable characters */
    public static class View$OnApplyWindowInsetsListenerC0251 implements View.OnApplyWindowInsetsListener {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ AbstractC0208 f979;

        public View$OnApplyWindowInsetsListenerC0251(AbstractC0208 r1) {
            this.f979 = r1;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets insets) {
            return (WindowInsets) C0070.m332(((LayoutInflater$Factory2C0302.C0307) this.f979).m1429(view, C0070.m333(insets)));
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0070 m1150(View view, C0070 insets) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets unwrapped = (WindowInsets) C0070.m332(insets);
        WindowInsets result = view.onApplyWindowInsets(unwrapped);
        if (result != unwrapped) {
            unwrapped = new WindowInsets(result);
        }
        return C0070.m333(unwrapped);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static boolean m1144(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasOverlappingRendering();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1157(View view, Drawable background) {
        int i = Build.VERSION.SDK_INT;
        view.setBackground(background);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static ColorStateList m1147(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getBackgroundTintList();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1155(View view, ColorStateList tintList) {
        int i = Build.VERSION.SDK_INT;
        view.setBackgroundTintList(tintList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean hasTint = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && hasTint) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static PorterDuff.Mode m1148(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.getBackgroundTintMode();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1156(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean hasTint = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && hasTint) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public static void m1140(View view) {
        int i = Build.VERSION.SDK_INT;
        view.stopNestedScroll();
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public static boolean m1138(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isLaidOut();
    }

    /* renamed from: ø  reason: contains not printable characters */
    public static boolean m1141(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.isAttachedToWindow();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m1163(View view) {
        int i = Build.VERSION.SDK_INT;
        return view.hasOnClickListeners();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1154(View view, int indicators, int mask) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(indicators, mask);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static boolean m1145(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0249.m1165(root).m1170(evt);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m1164(View root, KeyEvent evt) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0249.m1165(root).m1171(root, evt);
    }

    /* renamed from: ♫.ᗮ$ø  reason: contains not printable characters */
    public static class C0249 {

        /* renamed from: θ  reason: contains not printable characters */
        public static final ArrayList<WeakReference<View>> f975 = new ArrayList<>();

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public SparseArray<WeakReference<View>> f976 = null;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public WeakReference<KeyEvent> f977 = null;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public WeakHashMap<View, Boolean> f978 = null;

        /* renamed from: θ  reason: contains not printable characters */
        public final SparseArray<WeakReference<View>> m1167() {
            if (this.f976 == null) {
                this.f976 = new SparseArray<>();
            }
            return this.f976;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public static C0249 m1165(View root) {
            C0249 manager = (C0249) root.getTag(C0574.tag_unhandled_key_event_manager);
            if (manager != null) {
                return manager;
            }
            C0249 manager2 = new C0249();
            root.setTag(C0574.tag_unhandled_key_event_manager, manager2);
            return manager2;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1171(View root, KeyEvent event) {
            if (event.getAction() == 0) {
                m1169();
            }
            View consumer = m1168(root, event);
            if (event.getAction() == 0) {
                int keycode = event.getKeyCode();
                if (consumer != null && !KeyEvent.isModifierKey(keycode)) {
                    m1167().put(keycode, new WeakReference<>(consumer));
                }
            }
            return consumer != null;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final View m1168(View view, KeyEvent event) {
            WeakHashMap<View, Boolean> weakHashMap = this.f978;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup vg = (ViewGroup) view;
                for (int i = vg.getChildCount() - 1; i >= 0; i--) {
                    View consumer = m1168(vg.getChildAt(i), event);
                    if (consumer != null) {
                        return consumer;
                    }
                }
            }
            if (m1166(view, event)) {
                return view;
            }
            return null;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1170(KeyEvent event) {
            int idx;
            WeakReference<KeyEvent> weakReference = this.f977;
            if (weakReference != null && weakReference.get() == event) {
                return false;
            }
            this.f977 = new WeakReference<>(event);
            WeakReference<View> currentReceiver = null;
            SparseArray<WeakReference<View>> capturedKeys = m1167();
            if (event.getAction() == 1 && (idx = capturedKeys.indexOfKey(event.getKeyCode())) >= 0) {
                currentReceiver = capturedKeys.valueAt(idx);
                capturedKeys.removeAt(idx);
            }
            if (currentReceiver == null) {
                currentReceiver = capturedKeys.get(event.getKeyCode());
            }
            if (currentReceiver == null) {
                return false;
            }
            View target = currentReceiver.get();
            if (target != null && C0248.m1141(target)) {
                m1166(target, event);
            }
            return true;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public final boolean m1166(View v, KeyEvent event) {
            ArrayList<ViewCompat.OnUnhandledKeyEventListenerCompat> viewListeners = (ArrayList) v.getTag(C0574.tag_unhandled_key_listeners);
            if (viewListeners == null) {
                return false;
            }
            for (int i = viewListeners.size() - 1; i >= 0; i--) {
                if (((AbstractC0250) viewListeners.get(i)).m1172(v, event)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m1169() {
            WeakHashMap<View, Boolean> weakHashMap = this.f978;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f975.isEmpty()) {
                synchronized (f975) {
                    if (this.f978 == null) {
                        this.f978 = new WeakHashMap<>();
                    }
                    for (int i = f975.size() - 1; i >= 0; i--) {
                        View v = f975.get(i).get();
                        if (v == null) {
                            f975.remove(i);
                        } else {
                            this.f978.put(v, Boolean.TRUE);
                            for (ViewParent nxt = v.getParent(); nxt instanceof View; nxt = nxt.getParent()) {
                                this.f978.put((View) nxt, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }
}
