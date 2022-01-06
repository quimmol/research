package ♫;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import ♫.AbstractC0277;

/* renamed from: ♫.ﺑ  reason: contains not printable characters */
public class FragmentC0596 extends Fragment {

    /* renamed from: ♫.ﺑ$θ  reason: contains not printable characters */
    public interface AbstractC0597 {
        /* renamed from: ø  reason: contains not printable characters */
        void m2899();

        /* renamed from: Φ  reason: contains not printable characters */
        void m2900();

        /* renamed from: θ  reason: contains not printable characters */
        void m2901();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2894(Activity activity) {
        FragmentManager manager = activity.getFragmentManager();
        if (manager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            manager.beginTransaction().add(new FragmentC0596(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            manager.executePendingTransactions();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2898(AbstractC0597 listener) {
        if (listener != null) {
            listener.m2901();
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m2895(AbstractC0597 listener) {
        if (listener != null) {
            listener.m2899();
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2896(AbstractC0597 listener) {
        if (listener != null) {
            listener.m2900();
        }
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        m2898((AbstractC0597) null);
        m2897(AbstractC0277.EnumC0279.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        m2895(null);
        m2897(AbstractC0277.EnumC0279.ON_START);
    }

    public void onResume() {
        super.onResume();
        m2896(null);
        m2897(AbstractC0277.EnumC0279.ON_RESUME);
    }

    public void onPause() {
        super.onPause();
        m2897(AbstractC0277.EnumC0279.ON_PAUSE);
    }

    public void onStop() {
        super.onStop();
        m2897(AbstractC0277.EnumC0279.ON_STOP);
    }

    public void onDestroy() {
        super.onDestroy();
        m2897(AbstractC0277.EnumC0279.ON_DESTROY);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2897(AbstractC0277.EnumC0279 event) {
        Activity activity = getActivity();
        if (activity instanceof AbstractC0582) {
            ((AbstractC0582) activity).m2845().m2838(event);
        } else if (activity instanceof AbstractC0577) {
            AbstractC0277 lifecycle = ((AbstractC0577) activity).m2815();
            if (lifecycle instanceof C0579) {
                ((C0579) lifecycle).m2838(event);
            }
        }
    }
}
