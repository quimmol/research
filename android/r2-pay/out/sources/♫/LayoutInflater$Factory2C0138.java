package ♫;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.collection.ArraySet;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManagerNonConfig;
import androidx.lifecycle.ViewModelStore;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ♫.AbstractC0133;
import ♫.ComponentCallbacksC0071;

/* renamed from: ♫.ˤ  reason: contains not printable characters */
public final class LayoutInflater$Factory2C0138 extends AbstractC0133 implements LayoutInflater.Factory2 {

    /* renamed from: Φ  reason: contains not printable characters */
    public static final Interpolator f664 = new DecelerateInterpolator(1.5f);

    /* renamed from: θ  reason: contains not printable characters */
    public static final Interpolator f665 = new DecelerateInterpolator(2.5f);

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static Field f666 = null;

    /* renamed from: ฿  reason: contains not printable characters */
    public static boolean f667 = false;

    /* renamed from: µ  reason: contains not printable characters */
    public ArrayList<Integer> f668;

    /* renamed from: µ  reason: contains not printable characters and collision with other field name */
    public boolean f669;

    /* renamed from: Ø  reason: contains not printable characters */
    public ArrayList<ComponentCallbacksC0071> f670;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f671;

    /* renamed from: ö  reason: contains not printable characters */
    public ArrayList<C0589> f672;

    /* renamed from: ö  reason: contains not printable characters and collision with other field name */
    public boolean f673;

    /* renamed from: ø  reason: contains not printable characters */
    public ArrayList<C0589> f674;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f675;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public int f676 = 0;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public SparseArray<Parcelable> f677 = null;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final ArrayList<ComponentCallbacksC0071> f678 = new ArrayList<>();

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public ComponentCallbacksC0071 f679;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f680;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f681 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Bundle f682 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public SparseArray<ComponentCallbacksC0071> f683;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Runnable f684 = new RunnableC0146();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public String f685;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ArrayList<AbstractC0148> f686;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final CopyOnWriteArrayList<C0150> f687 = new CopyOnWriteArrayList<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ComponentCallbacksC0071 f688;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0092 f689;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0111 f690;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0159 f691;

    /* renamed from: ฿  reason: contains not printable characters and collision with other field name */
    public ArrayList<C0589> f692;

    /* renamed from: ₣  reason: contains not printable characters */
    public ArrayList<Boolean> f693;

    /* renamed from: ₤  reason: contains not printable characters */
    public ArrayList<ComponentCallbacksC0071> f694;

    /* renamed from: ₧  reason: contains not printable characters */
    public ArrayList<C0153> f695;

    /* renamed from: ₩  reason: contains not printable characters */
    public ArrayList<AbstractC0133.AbstractC0134> f696;

    /* renamed from: ₩  reason: contains not printable characters and collision with other field name */
    public boolean f697;

    /* renamed from: ♫.ˤ$₢  reason: contains not printable characters */
    public interface AbstractC0148 {
    }

    /* renamed from: ♫.ˤ$₤  reason: contains not printable characters */
    public static final class C0150 {

        /* renamed from: θ  reason: contains not printable characters */
        public final AbstractC0133.AbstractC0135 f719;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final boolean f720;
    }

    /* renamed from: ♫.ˤ$₧  reason: contains not printable characters */
    public static class C0151 {

        /* renamed from: θ  reason: contains not printable characters */
        public static final int[] f721 = {16842755, 16842960, 16842961};
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    /* renamed from: ♫.ˤ$θ  reason: contains not printable characters */
    public class RunnableC0146 implements Runnable {
        public RunnableC0146() {
        }

        public void run() {
            LayoutInflater$Factory2C0138.this.m692();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m676(C0152 anim) {
        Animation animation = anim.f723;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return m674(anim.f722);
        }
        List<Animation> anims = ((AnimationSet) animation).getAnimations();
        for (int i = 0; i < anims.size(); i++) {
            if (anims.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m674(Animator anim) {
        PropertyValuesHolder[] values;
        if (anim == null) {
            return false;
        }
        if (anim instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) anim).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (anim instanceof AnimatorSet) {
            List<Animator> animList = ((AnimatorSet) anim).getChildAnimations();
            for (int i = 0; i < animList.size(); i++) {
                if (m674(animList.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m675(View v, C0152 anim) {
        if (v == null || anim == null) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        if (v.getLayerType() != 0 || !C0248.m1144(v) || !m676(anim)) {
            return false;
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m725(RuntimeException ex) {
        Log.e("FragmentManager", ex.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter pw = new PrintWriter(new C0113("FragmentManager"));
        AbstractC0111 r3 = this.f690;
        if (r3 != null) {
            try {
                r3.m599("  ", null, pw, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                m726("  ", (FileDescriptor) null, pw, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw ex;
    }

    @Override // ♫.AbstractC0133
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m703() {
        m694();
        return m746((String) null, -1, 0);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m746(String name, int id, int flags) {
        AbstractC0133 childManager;
        m692();
        m691(true);
        ComponentCallbacksC0071 r1 = this.f679;
        if (r1 != null && id < 0 && name == null && (childManager = r1.m357()) != null && childManager.m659()) {
            return true;
        }
        boolean executePop = m748(this.f692, this.f693, name, id, flags);
        if (executePop) {
            this.f680 = true;
            try {
                m696(this.f692, this.f693);
            } finally {
                m687();
            }
        }
        m750();
        m717();
        return executePop;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m722(Bundle bundle, String key, ComponentCallbacksC0071 fragment) {
        int i = fragment.f523;
        if (i >= 0) {
            bundle.putInt(key, i);
            return;
        }
        m725(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        throw null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ComponentCallbacksC0071 m712(Bundle bundle, String key) {
        int index = bundle.getInt(key, -1);
        if (index == -1) {
            return null;
        }
        ComponentCallbacksC0071 f = this.f683.get(index);
        if (f != null) {
            return f;
        }
        m725(new IllegalStateException("Fragment no longer exists for key " + key + ": index " + index));
        throw null;
    }

    @Override // ♫.AbstractC0133, ♫.AbstractC0133
    /* renamed from: θ  reason: contains not printable characters */
    public List<ComponentCallbacksC0071> m709() {
        List<ComponentCallbacksC0071> list;
        if (this.f678.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f678) {
            list = (List) this.f678.clone();
        }
        return list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ComponentCallbacksC0071 r1 = this.f688;
        if (r1 != null) {
            C0112.m602(r1, sb);
        } else {
            C0112.m602(this.f690, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // ♫.AbstractC0133
    /* renamed from: θ  reason: contains not printable characters */
    public void m726(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        int N;
        int N2;
        int N3;
        int N4;
        int N5;
        String innerPrefix = prefix + "    ";
        SparseArray<ComponentCallbacksC0071> sparseArray = this.f683;
        if (sparseArray != null && (N5 = sparseArray.size()) > 0) {
            writer.print(prefix);
            writer.print("Active Fragments in ");
            writer.print(Integer.toHexString(System.identityHashCode(this)));
            writer.println(":");
            for (int i = 0; i < N5; i++) {
                ComponentCallbacksC0071 f = this.f683.valueAt(i);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i);
                writer.print(": ");
                writer.println(f);
                if (f != null) {
                    f.m401(innerPrefix, fd, writer, args);
                }
            }
        }
        int N6 = this.f678.size();
        if (N6 > 0) {
            writer.print(prefix);
            writer.println("Added Fragments:");
            for (int i2 = 0; i2 < N6; i2++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i2);
                writer.print(": ");
                writer.println(this.f678.get(i2).toString());
            }
        }
        ArrayList<ComponentCallbacksC0071> arrayList = this.f670;
        if (arrayList != null && (N4 = arrayList.size()) > 0) {
            writer.print(prefix);
            writer.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < N4; i3++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i3);
                writer.print(": ");
                writer.println(this.f670.get(i3).toString());
            }
        }
        ArrayList<C0589> arrayList2 = this.f674;
        if (arrayList2 != null && (N3 = arrayList2.size()) > 0) {
            writer.print(prefix);
            writer.println("Back Stack:");
            for (int i4 = 0; i4 < N3; i4++) {
                C0589 bs = this.f674.get(i4);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i4);
                writer.print(": ");
                writer.println(bs.toString());
                bs.m2874(innerPrefix, writer);
            }
        }
        synchronized (this) {
            if (this.f672 != null && (N2 = this.f672.size()) > 0) {
                writer.print(prefix);
                writer.println("Back Stack Indices:");
                for (int i5 = 0; i5 < N2; i5++) {
                    writer.print(prefix);
                    writer.print("  #");
                    writer.print(i5);
                    writer.print(": ");
                    writer.println(this.f672.get(i5));
                }
            }
            if (this.f668 != null && this.f668.size() > 0) {
                writer.print(prefix);
                writer.print("mAvailBackStackIndices: ");
                writer.println(Arrays.toString(this.f668.toArray()));
            }
        }
        ArrayList<AbstractC0148> arrayList3 = this.f686;
        if (arrayList3 != null && (N = arrayList3.size()) > 0) {
            writer.print(prefix);
            writer.println("Pending Actions:");
            for (int i6 = 0; i6 < N; i6++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i6);
                writer.print(": ");
                writer.println(this.f686.get(i6));
            }
        }
        writer.print(prefix);
        writer.println("FragmentManager misc state:");
        writer.print(prefix);
        writer.print("  mHost=");
        writer.println(this.f690);
        writer.print(prefix);
        writer.print("  mContainer=");
        writer.println(this.f689);
        if (this.f688 != null) {
            writer.print(prefix);
            writer.print("  mParent=");
            writer.println(this.f688);
        }
        writer.print(prefix);
        writer.print("  mCurState=");
        writer.print(this.f676);
        writer.print(" mStateSaved=");
        writer.print(this.f671);
        writer.print(" mStopped=");
        writer.print(this.f673);
        writer.print(" mDestroyed=");
        writer.println(this.f669);
        if (this.f675) {
            writer.print(prefix);
            writer.print("  mNeedMenuInvalidate=");
            writer.println(this.f675);
        }
        if (this.f685 != null) {
            writer.print(prefix);
            writer.print("  mNoTransactionsBecause=");
            writer.println(this.f685);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0152 m671(float startScale, float endScale, float startAlpha, float endAlpha) {
        AnimationSet set = new AnimationSet(false);
        ScaleAnimation scale = new ScaleAnimation(startScale, endScale, startScale, endScale, 1, 0.5f, 1, 0.5f);
        scale.setInterpolator(f665);
        scale.setDuration(220);
        set.addAnimation(scale);
        AlphaAnimation alpha = new AlphaAnimation(startAlpha, endAlpha);
        alpha.setInterpolator(f664);
        alpha.setDuration(220);
        set.addAnimation(alpha);
        return new C0152(set);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0152 m670(float start, float end) {
        AlphaAnimation anim = new AlphaAnimation(start, end);
        anim.setInterpolator(f664);
        anim.setDuration(220);
        return new C0152(anim);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0152 m715(ComponentCallbacksC0071 fragment, int transit, boolean enter, int transitionStyle) {
        int styleIndex;
        int nextAnim = fragment.m375();
        fragment.m382();
        if (0 != 0) {
            return new C0152((Animation) null);
        }
        fragment.m363();
        if (0 != 0) {
            return new C0152((Animator) null);
        }
        if (nextAnim != 0) {
            boolean isAnim = "anim".equals(this.f690.m594().getResources().getResourceTypeName(nextAnim));
            boolean successfulLoad = false;
            if (isAnim) {
                try {
                    Animation animation = AnimationUtils.loadAnimation(this.f690.m594(), nextAnim);
                    if (animation != null) {
                        return new C0152(animation);
                    }
                    successfulLoad = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException e2) {
                }
            }
            if (!successfulLoad) {
                try {
                    Animator animator = AnimatorInflater.loadAnimator(this.f690.m594(), nextAnim);
                    if (animator != null) {
                        return new C0152(animator);
                    }
                } catch (RuntimeException e3) {
                    if (!isAnim) {
                        Animation animation2 = AnimationUtils.loadAnimation(this.f690.m594(), nextAnim);
                        if (animation2 != null) {
                            return new C0152(animation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (transit == 0 || (styleIndex = m668(transit, enter)) < 0) {
            return null;
        }
        switch (styleIndex) {
            case 1:
                this.f690.m594();
                return m671(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                this.f690.m594();
                return m671(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                this.f690.m594();
                return m671(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                this.f690.m594();
                return m671(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                this.f690.m594();
                return m670(0.0f, 1.0f);
            case 6:
                this.f690.m594();
                return m670(1.0f, 0.0f);
            default:
                if (transitionStyle == 0 && this.f690.m591()) {
                    transitionStyle = this.f690.m592();
                }
                return transitionStyle == 0 ? null : null;
        }
    }

    /* renamed from: ₤  reason: contains not printable characters */
    public void m767(ComponentCallbacksC0071 f) {
        if (!f.f552) {
            return;
        }
        if (this.f680) {
            this.f697 = true;
            return;
        }
        f.f552 = false;
        m730(f, this.f676, 0, 0, false);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m672(View v, C0152 anim) {
        if (v != null && anim != null && m675(v, anim)) {
            Animator animator = anim.f722;
            if (animator != null) {
                animator.addListener(new C0147(v));
                return;
            }
            Animation.AnimationListener originalListener = m669(anim.f723);
            v.setLayerType(2, null);
            anim.f723.setAnimationListener(new C0141(v, originalListener));
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Animation.AnimationListener m669(Animation animation) {
        try {
            if (f666 == null) {
                f666 = Animation.class.getDeclaredField("mListener");
                f666.setAccessible(true);
            }
            return (Animation.AnimationListener) f666.get(animation);
        } catch (NoSuchFieldException e) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m742(int state) {
        return this.f676 >= state;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0070, code lost:
        if (r1 != 3) goto L_0x02d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02b3  */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m730(♫.ComponentCallbacksC0071 r17, int r18, int r19, int r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 1137
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m730(♫.ɩ, int, int, int, boolean):void");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m734(ComponentCallbacksC0071 fragment, C0152 anim, int newState) {
        View viewToAnimate = fragment.f536;
        ViewGroup container = fragment.f537;
        container.startViewTransition(viewToAnimate);
        fragment.m370(newState);
        Animation animation = anim.f723;
        if (animation != null) {
            Animation animation2 = new RunnableC0149(animation, container, viewToAnimate);
            fragment.m400(fragment.f536);
            animation2.setAnimationListener(new C0144(m669(animation2), container, fragment));
            m672(viewToAnimate, anim);
            fragment.f536.startAnimation(animation2);
            return;
        }
        Animator animator = anim.f722;
        fragment.m394(anim.f722);
        animator.addListener(new C0143(container, viewToAnimate, fragment));
        animator.setTarget(fragment.f536);
        m672(fragment.f536, anim);
        animator.start();
    }

    /* renamed from: ♫.ˤ$Φ  reason: contains not printable characters */
    public class C0144 extends animation.Animation$AnimationListenerC0139 {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ ViewGroup f708;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ComponentCallbacksC0071 f709;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0144(Animation.AnimationListener wrapped, ViewGroup viewGroup, ComponentCallbacksC0071 r4) {
            super(wrapped);
            this.f708 = viewGroup;
            this.f709 = r4;
        }

        @Override // ♫.LayoutInflater$Factory2C0138.animation.Animation$AnimationListenerC0139
        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            this.f708.post(new RunnableC0145());
        }

        /* renamed from: ♫.ˤ$Φ$θ  reason: contains not printable characters */
        public class RunnableC0145 implements Runnable {
            public RunnableC0145() {
            }

            public void run() {
                if (C0144.this.f709.m381() != null) {
                    C0144.this.f709.m400((View) null);
                    C0144 r0 = C0144.this;
                    LayoutInflater$Factory2C0138 r1 = LayoutInflater$Factory2C0138.this;
                    ComponentCallbacksC0071 r2 = r0.f709;
                    r1.m730(r2, r2.m345(), 0, 0, false);
                }
            }
        }
    }

    /* renamed from: ♫.ˤ$ø  reason: contains not printable characters */
    public class C0143 extends AnimatorListenerAdapter {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ View f704;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ViewGroup f705;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ComponentCallbacksC0071 f706;

        public C0143(ViewGroup viewGroup, View view, ComponentCallbacksC0071 r4) {
            this.f705 = viewGroup;
            this.f704 = view;
            this.f706 = r4;
        }

        public void onAnimationEnd(Animator anim) {
            this.f705.endViewTransition(this.f704);
            Animator animator = this.f706.m376();
            this.f706.m394((Animator) null);
            if (animator != null && this.f705.indexOfChild(this.f704) < 0) {
                LayoutInflater$Factory2C0138 r2 = LayoutInflater$Factory2C0138.this;
                ComponentCallbacksC0071 r3 = this.f706;
                r2.m730(r3, r3.m345(), 0, 0, false);
            }
        }
    }

    /* renamed from: ₣  reason: contains not printable characters */
    public void m765(ComponentCallbacksC0071 f) {
        m730(f, this.f676, 0, 0, false);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m681(ComponentCallbacksC0071 f) {
        if (f.f518 && !f.f562) {
            f.m398(f.m365(f.f533), (ViewGroup) null, f.f533);
            View view = f.f536;
            if (view != null) {
                f.f525 = view;
                view.setSaveFromParentEnabled(false);
                if (f.f556) {
                    f.f536.setVisibility(8);
                }
                View view2 = f.f536;
                Bundle bundle = f.f533;
                f.m424();
                m733(f, f.f536, f.f533, false);
                return;
            }
            f.f525 = null;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m697(ComponentCallbacksC0071 fragment) {
        Animator animator;
        if (fragment.f536 != null) {
            C0152 anim = m715(fragment, fragment.m362(), !fragment.f556, fragment.m354());
            if (anim == null || (animator = anim.f722) == null) {
                if (anim != null) {
                    m672(fragment.f536, anim);
                    fragment.f536.startAnimation(anim.f723);
                    anim.f723.start();
                }
                fragment.f536.setVisibility((!fragment.f556 || fragment.m361()) ? 0 : 8);
                if (fragment.m361()) {
                    fragment.m360(false);
                }
            } else {
                animator.setTarget(fragment.f536);
                if (!fragment.f556) {
                    fragment.f536.setVisibility(0);
                } else if (fragment.m361()) {
                    fragment.m360(false);
                } else {
                    ViewGroup container = fragment.f537;
                    View animatingView = fragment.f536;
                    container.startViewTransition(animatingView);
                    anim.f722.addListener(new C0140(this, container, animatingView, fragment));
                }
                m672(fragment.f536, anim);
                anim.f722.start();
            }
        }
        if (fragment.f530 && fragment.f557 && fragment.f550) {
            this.f675 = true;
        }
        fragment.f555 = false;
        boolean z = fragment.f556;
        fragment.m413();
    }

    /* renamed from: ♫.ˤ$Ø  reason: contains not printable characters */
    public class C0140 extends AnimatorListenerAdapter {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ View f699;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ViewGroup f700;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ComponentCallbacksC0071 f701;

        public C0140(LayoutInflater$Factory2C0138 this$0, ViewGroup viewGroup, View view, ComponentCallbacksC0071 r4) {
            this.f700 = viewGroup;
            this.f699 = view;
            this.f701 = r4;
        }

        public void onAnimationEnd(Animator animation) {
            this.f700.endViewTransition(this.f699);
            animation.removeListener(this);
            View view = this.f701.f536;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public void m760(ComponentCallbacksC0071 f) {
        ViewGroup container;
        int underIndex;
        int viewIndex;
        if (f != null) {
            int nextState = this.f676;
            if (f.f522) {
                if (f.m349()) {
                    nextState = Math.min(nextState, 1);
                } else {
                    nextState = Math.min(nextState, 0);
                }
            }
            m730(f, nextState, f.m362(), f.m354(), false);
            if (f.f536 != null) {
                ComponentCallbacksC0071 underFragment = m714(f);
                if (underFragment != null && (viewIndex = container.indexOfChild(f.f536)) < (underIndex = (container = f.f537).indexOfChild(underFragment.f536))) {
                    container.removeViewAt(viewIndex);
                    container.addView(f.f536, underIndex);
                }
                if (f.f554 && f.f537 != null) {
                    float f2 = f.f531;
                    if (f2 > 0.0f) {
                        f.f536.setAlpha(f2);
                    }
                    f.f531 = 0.0f;
                    f.f554 = false;
                    C0152 anim = m715(f, f.m362(), true, f.m354());
                    if (anim != null) {
                        m672(f.f536, anim);
                        Animation animation = anim.f723;
                        if (animation != null) {
                            f.f536.startAnimation(animation);
                        } else {
                            anim.f722.setTarget(f.f536);
                            anim.f722.start();
                        }
                    }
                }
            }
            if (f.f555) {
                m697(f);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m720(int newState, boolean always) {
        AbstractC0111 r2;
        if (this.f690 == null && newState != 0) {
            throw new IllegalStateException("No activity");
        } else if (always || newState != this.f676) {
            this.f676 = newState;
            if (this.f683 != null) {
                int numAdded = this.f678.size();
                for (int i = 0; i < numAdded; i++) {
                    m760(this.f678.get(i));
                }
                int numActive = this.f683.size();
                for (int i2 = 0; i2 < numActive; i2++) {
                    ComponentCallbacksC0071 f = this.f683.valueAt(i2);
                    if (f != null && ((f.f522 || f.f558) && !f.f554)) {
                        m760(f);
                    }
                }
                m758();
                if (this.f675 && (r2 = this.f690) != null && this.f676 == 4) {
                    r2.m598();
                    this.f675 = false;
                }
            }
        }
    }

    /* renamed from: Ж  reason: contains not printable characters */
    public void m758() {
        if (this.f683 != null) {
            for (int i = 0; i < this.f683.size(); i++) {
                ComponentCallbacksC0071 f = this.f683.valueAt(i);
                if (f != null) {
                    m767(f);
                }
            }
        }
    }

    /* renamed from: µ  reason: contains not printable characters */
    public void m678(ComponentCallbacksC0071 f) {
        if (f.f523 < 0) {
            int i = this.f681;
            this.f681 = i + 1;
            f.m393(i, this.f688);
            if (this.f683 == null) {
                this.f683 = new SparseArray<>();
            }
            this.f683.put(f.f523, f);
            if (f667) {
                Log.v("FragmentManager", "Allocated fragment index " + f);
            }
        }
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public void m771(ComponentCallbacksC0071 f) {
        if (f.f523 >= 0) {
            if (f667) {
                Log.v("FragmentManager", "Freeing fragment index " + f);
            }
            this.f683.put(f.f523, null);
            f.m347();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m735(ComponentCallbacksC0071 fragment, boolean moveToStateNow) {
        if (f667) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        m678(fragment);
        if (fragment.f558) {
            return;
        }
        if (!this.f678.contains(fragment)) {
            synchronized (this.f678) {
                this.f678.add(fragment);
            }
            fragment.f530 = true;
            fragment.f522 = false;
            if (fragment.f536 == null) {
                fragment.f555 = false;
            }
            if (fragment.f557 && fragment.f550) {
                this.f675 = true;
            }
            if (moveToStateNow) {
                m765(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* renamed from: ₧  reason: contains not printable characters */
    public void m769(ComponentCallbacksC0071 fragment) {
        if (f667) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f519);
        }
        boolean inactive = !fragment.m349();
        if (!fragment.f558 || inactive) {
            synchronized (this.f678) {
                this.f678.remove(fragment);
            }
            if (fragment.f557 && fragment.f550) {
                this.f675 = true;
            }
            fragment.f530 = false;
            fragment.f522 = true;
        }
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m685(ComponentCallbacksC0071 fragment) {
        if (f667) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.f556) {
            fragment.f556 = true;
            fragment.f555 = true ^ fragment.f555;
        }
    }

    /* renamed from: Б  reason: contains not printable characters */
    public void m753(ComponentCallbacksC0071 fragment) {
        if (f667) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.f556) {
            fragment.f556 = false;
            fragment.f555 = !fragment.f555;
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m688(ComponentCallbacksC0071 fragment) {
        if (f667) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.f558) {
            fragment.f558 = true;
            if (fragment.f530) {
                if (f667) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                synchronized (this.f678) {
                    this.f678.remove(fragment);
                }
                if (fragment.f557 && fragment.f550) {
                    this.f675 = true;
                }
                fragment.f530 = false;
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m729(ComponentCallbacksC0071 fragment) {
        if (f667) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.f558) {
            fragment.f558 = false;
            if (fragment.f530) {
                return;
            }
            if (!this.f678.contains(fragment)) {
                if (f667) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                synchronized (this.f678) {
                    this.f678.add(fragment);
                }
                fragment.f530 = true;
                if (fragment.f557 && fragment.f550) {
                    this.f675 = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ComponentCallbacksC0071 m711(int id) {
        for (int i = this.f678.size() - 1; i >= 0; i--) {
            ComponentCallbacksC0071 f = this.f678.get(i);
            if (f != null && f.f515 == id) {
                return f;
            }
        }
        SparseArray<ComponentCallbacksC0071> sparseArray = this.f683;
        if (sparseArray == null) {
            return null;
        }
        for (int i2 = sparseArray.size() - 1; i2 >= 0; i2--) {
            ComponentCallbacksC0071 f2 = this.f683.valueAt(i2);
            if (f2 != null && f2.f515 == id) {
                return f2;
            }
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ComponentCallbacksC0071 m713(String tag) {
        if (tag != null) {
            for (int i = this.f678.size() - 1; i >= 0; i--) {
                ComponentCallbacksC0071 f = this.f678.get(i);
                if (f != null && tag.equals(f.f526)) {
                    return f;
                }
            }
        }
        SparseArray<ComponentCallbacksC0071> sparseArray = this.f683;
        if (sparseArray == null || tag == null) {
            return null;
        }
        for (int i2 = sparseArray.size() - 1; i2 >= 0; i2--) {
            ComponentCallbacksC0071 f2 = this.f683.valueAt(i2);
            if (f2 != null && tag.equals(f2.f526)) {
                return f2;
            }
        }
        return null;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public ComponentCallbacksC0071 m693(String who) {
        ComponentCallbacksC0071 f;
        SparseArray<ComponentCallbacksC0071> sparseArray = this.f683;
        if (sparseArray == null || who == null) {
            return null;
        }
        for (int i = sparseArray.size() - 1; i >= 0; i--) {
            ComponentCallbacksC0071 f2 = this.f683.valueAt(i);
            if (!(f2 == null || (f = f2.m385(who)) == null)) {
                return f;
            }
        }
        return null;
    }

    @Override // ♫.AbstractC0133
    /* renamed from: Φ  reason: contains not printable characters */
    public final void m694() {
        if (m741()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f685 != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f685);
        }
    }

    @Override // ♫.AbstractC0133, ♫.AbstractC0133
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m741() {
        return this.f671 || this.f673;
    }

    /* renamed from: Ё  reason: contains not printable characters */
    public void m749() {
        synchronized (this) {
            boolean pendingReady = false;
            boolean postponeReady = this.f695 != null && !this.f695.isEmpty();
            if (this.f686 != null && this.f686.size() == 1) {
                pendingReady = true;
            }
            if (postponeReady || pendingReady) {
                this.f690.m595().removeCallbacks(this.f684);
                this.f690.m595().post(this.f684);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m719(int index, C0589 bse) {
        synchronized (this) {
            if (this.f672 == null) {
                this.f672 = new ArrayList<>();
            }
            int N = this.f672.size();
            if (index < N) {
                if (f667) {
                    Log.v("FragmentManager", "Setting back stack index " + index + " to " + bse);
                }
                this.f672.set(index, bse);
            } else {
                while (N < index) {
                    this.f672.add(null);
                    if (this.f668 == null) {
                        this.f668 = new ArrayList<>();
                    }
                    if (f667) {
                        Log.v("FragmentManager", "Adding available back stack index " + N);
                    }
                    this.f668.add(Integer.valueOf(N));
                    N++;
                }
                if (f667) {
                    Log.v("FragmentManager", "Adding back stack index " + index + " with " + bse);
                }
                this.f672.add(bse);
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m695(int index) {
        synchronized (this) {
            this.f672.set(index, null);
            if (this.f668 == null) {
                this.f668 = new ArrayList<>();
            }
            if (f667) {
                Log.v("FragmentManager", "Freeing back stack index " + index);
            }
            this.f668.add(Integer.valueOf(index));
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m691(boolean allowStateLoss) {
        if (this.f680) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f690 == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        } else if (Looper.myLooper() == this.f690.m595().getLooper()) {
            if (!allowStateLoss) {
                m694();
            }
            if (this.f692 == null) {
                this.f692 = new ArrayList<>();
                this.f693 = new ArrayList<>();
            }
            this.f680 = true;
            try {
                m727((ArrayList<C0589>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f680 = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m687() {
        this.f680 = false;
        this.f693.clear();
        this.f692.clear();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: ø  reason: contains not printable characters */
    public boolean m692() {
        m691(true);
        boolean didSomething = false;
        while (m747(this.f692, this.f693)) {
            this.f680 = true;
            try {
                m696(this.f692, this.f693);
                m687();
                didSomething = true;
            } catch (Throwable th) {
                m687();
                throw th;
            }
        }
        m750();
        m717();
        return didSomething;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m727(ArrayList<C0589> arrayList, ArrayList<Boolean> isRecordPop) {
        int index;
        int index2;
        ArrayList<C0153> arrayList2 = this.f695;
        int numPostponed = arrayList2 == null ? 0 : arrayList2.size();
        int i = 0;
        while (i < numPostponed) {
            C0153 listener = this.f695.get(i);
            if (arrayList != null && !listener.f726 && (index2 = arrayList.indexOf(listener.f725)) != -1 && isRecordPop.get(index2).booleanValue()) {
                listener.m776();
            } else if (listener.m777() || (arrayList != null && listener.f725.m2881(arrayList, 0, arrayList.size()))) {
                this.f695.remove(i);
                i--;
                numPostponed--;
                if (arrayList == null || listener.f726 || (index = arrayList.indexOf(listener.f725)) == -1 || !isRecordPop.get(index).booleanValue()) {
                    listener.m775();
                } else {
                    listener.m776();
                }
            }
            i++;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m696(ArrayList<C0589> arrayList, ArrayList<Boolean> isRecordPop) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (isRecordPop == null || arrayList.size() != isRecordPop.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            m727(arrayList, isRecordPop);
            int numRecords = arrayList.size();
            int startIndex = 0;
            int recordNum = 0;
            while (recordNum < numRecords) {
                if (!arrayList.get(recordNum).f2322) {
                    if (startIndex != recordNum) {
                        m728(arrayList, isRecordPop, startIndex, recordNum);
                    }
                    int reorderingEnd = recordNum + 1;
                    if (isRecordPop.get(recordNum).booleanValue()) {
                        while (reorderingEnd < numRecords && isRecordPop.get(reorderingEnd).booleanValue() && !arrayList.get(reorderingEnd).f2322) {
                            reorderingEnd++;
                        }
                    }
                    m728(arrayList, isRecordPop, recordNum, reorderingEnd);
                    startIndex = reorderingEnd;
                    recordNum = reorderingEnd - 1;
                }
                recordNum++;
            }
            if (startIndex != numRecords) {
                m728(arrayList, isRecordPop, startIndex, numRecords);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m728(ArrayList<C0589> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        int i;
        boolean allowReordering = arrayList.get(startIndex).f2322;
        ArrayList<ComponentCallbacksC0071> arrayList2 = this.f694;
        if (arrayList2 == null) {
            this.f694 = new ArrayList<>();
        } else {
            arrayList2.clear();
        }
        this.f694.addAll(this.f678);
        int recordNum = startIndex;
        boolean addToBackStack = false;
        ComponentCallbacksC0071 oldPrimaryNav = m710();
        while (true) {
            boolean z = true;
            if (recordNum >= endIndex) {
                break;
            }
            C0589 record = arrayList.get(recordNum);
            if (!isRecordPop.get(recordNum).booleanValue()) {
                oldPrimaryNav = record.m2871(this.f694, oldPrimaryNav);
            } else {
                oldPrimaryNav = record.m2868(this.f694, oldPrimaryNav);
            }
            if (!addToBackStack && !record.f2332) {
                z = false;
            }
            addToBackStack = z;
            recordNum++;
        }
        this.f694.clear();
        if (!allowReordering) {
            C0213.m985(this, arrayList, isRecordPop, startIndex, endIndex, false);
        }
        m666(arrayList, isRecordPop, startIndex, endIndex);
        int postponeIndex = endIndex;
        if (allowReordering) {
            ArraySet<Fragment> addedFragments = new C0516<>();
            m737((C0516<ComponentCallbacksC0071>) addedFragments);
            int postponeIndex2 = m705(arrayList, isRecordPop, startIndex, endIndex, (C0516<ComponentCallbacksC0071>) addedFragments);
            m701((C0516<ComponentCallbacksC0071>) addedFragments);
            postponeIndex = postponeIndex2;
        }
        if (postponeIndex != startIndex && allowReordering) {
            C0213.m985(this, arrayList, isRecordPop, startIndex, postponeIndex, true);
            m720(this.f676, true);
        }
        for (int recordNum2 = startIndex; recordNum2 < endIndex; recordNum2++) {
            C0589 record2 = arrayList.get(recordNum2);
            if (isRecordPop.get(recordNum2).booleanValue() && (i = record2.f2335) >= 0) {
                m695(i);
                record2.f2335 = -1;
            }
            record2.m2869();
        }
        if (addToBackStack) {
            m756();
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m701(C0516<ComponentCallbacksC0071> r6) {
        int numAdded = r6.size();
        for (int i = 0; i < numAdded; i++) {
            ComponentCallbacksC0071 fragment = r6.m2415(i);
            if (!fragment.f530) {
                View view = fragment.m366();
                fragment.f531 = view.getAlpha();
                view.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m705(ArrayList<C0589> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex, C0516<ComponentCallbacksC0071> r13) {
        int postponeIndex = endIndex;
        for (int i = endIndex - 1; i >= startIndex; i--) {
            C0589 record = arrayList.get(i);
            boolean isPop = isRecordPop.get(i).booleanValue();
            if (record.m2879() && !record.m2881(arrayList, i + 1, endIndex)) {
                if (this.f695 == null) {
                    this.f695 = new ArrayList<>();
                }
                C0153 listener = new C0153(record, isPop);
                this.f695.add(listener);
                record.m2876(listener);
                if (isPop) {
                    record.m2872();
                } else {
                    record.m2878(false);
                }
                postponeIndex--;
                if (i != postponeIndex) {
                    arrayList.remove(i);
                    arrayList.add(postponeIndex, record);
                }
                m737(r13);
            }
        }
        return postponeIndex;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m739(C0589 record, boolean isPop, boolean runTransitions, boolean moveToState) {
        if (isPop) {
            record.m2878(moveToState);
        } else {
            record.m2872();
        }
        ArrayList<BackStackRecord> records = new ArrayList<>(1);
        ArrayList<Boolean> isRecordPop = new ArrayList<>(1);
        records.add(record);
        isRecordPop.add(Boolean.valueOf(isPop));
        if (runTransitions) {
            C0213.m985(this, (ArrayList<C0589>) records, isRecordPop, 0, 1, true);
        }
        if (moveToState) {
            m720(this.f676, true);
        }
        SparseArray<ComponentCallbacksC0071> sparseArray = this.f683;
        if (sparseArray != null) {
            int numActive = sparseArray.size();
            for (int i = 0; i < numActive; i++) {
                ComponentCallbacksC0071 fragment = this.f683.valueAt(i);
                if (fragment != null && fragment.f536 != null && fragment.f554 && record.m2880(fragment.f561)) {
                    float f = fragment.f531;
                    if (f > 0.0f) {
                        fragment.f536.setAlpha(f);
                    }
                    if (moveToState) {
                        fragment.f531 = 0.0f;
                    } else {
                        fragment.f531 = -1.0f;
                        fragment.f554 = false;
                    }
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final ComponentCallbacksC0071 m714(ComponentCallbacksC0071 f) {
        ViewGroup container = f.f537;
        View view = f.f536;
        if (container == null || view == null) {
            return null;
        }
        for (int i = this.f678.indexOf(f) - 1; i >= 0; i--) {
            ComponentCallbacksC0071 underFragment = this.f678.get(i);
            if (underFragment.f537 == container && underFragment.f536 != null) {
                return underFragment;
            }
        }
        return null;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static void m666(ArrayList<C0589> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            C0589 record = arrayList.get(i);
            boolean moveToState = true;
            if (isRecordPop.get(i).booleanValue()) {
                record.m2873(-1);
                if (i != endIndex - 1) {
                    moveToState = false;
                }
                record.m2878(moveToState);
            } else {
                record.m2873(1);
                record.m2872();
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m737(C0516<ComponentCallbacksC0071> r11) {
        int i = this.f676;
        if (i >= 1) {
            int state = Math.min(i, 3);
            int numAdded = this.f678.size();
            for (int i2 = 0; i2 < numAdded; i2++) {
                ComponentCallbacksC0071 fragment = this.f678.get(i2);
                if (fragment.f532 < state) {
                    m730(fragment, state, fragment.m375(), fragment.m362(), false);
                    if (fragment.f536 != null && !fragment.f556 && fragment.f554) {
                        r11.add(fragment);
                    }
                }
            }
        }
    }

    /* renamed from: В  reason: contains not printable characters */
    public final void m754() {
        if (this.f695 != null) {
            while (!this.f695.isEmpty()) {
                this.f695.remove(0).m775();
            }
        }
    }

    /* renamed from: Б  reason: contains not printable characters */
    public final void m752() {
        SparseArray<ComponentCallbacksC0071> sparseArray = this.f683;
        int numFragments = sparseArray == null ? 0 : sparseArray.size();
        for (int i = 0; i < numFragments; i++) {
            ComponentCallbacksC0071 fragment = this.f683.valueAt(i);
            if (fragment != null) {
                if (fragment.m381() != null) {
                    int stateAfterAnimating = fragment.m345();
                    View animatingAway = fragment.m381();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.m400((View) null);
                    m730(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.m376() != null) {
                    fragment.m376().end();
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m747(ArrayList<C0589> arrayList, ArrayList<Boolean> isPop) {
        boolean didSomething = false;
        synchronized (this) {
            if (this.f686 != null) {
                if (this.f686.size() != 0) {
                    int numActions = this.f686.size();
                    for (int i = 0; i < numActions; i++) {
                        ((C0589) this.f686.get(i)).m2882(arrayList, isPop);
                        didSomething |= true;
                    }
                    this.f686.clear();
                    this.f690.m595().removeCallbacks(this.f684);
                    return didSomething;
                }
            }
            return false;
        }
    }

    /* renamed from: А  reason: contains not printable characters */
    public void m750() {
        if (this.f697) {
            this.f697 = false;
            m758();
        }
    }

    /* renamed from: Д  reason: contains not printable characters */
    public void m756() {
        if (this.f696 != null) {
            for (int i = 0; i < this.f696.size(); i++) {
                this.f696.get(i).m663();
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m738(C0589 state) {
        if (this.f674 == null) {
            this.f674 = new ArrayList<>();
        }
        this.f674.add(state);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m748(ArrayList<C0589> arrayList, ArrayList<Boolean> isRecordPop, String name, int id, int flags) {
        ArrayList<C0589> arrayList2 = this.f674;
        if (arrayList2 == null) {
            return false;
        }
        if (name == null && id < 0 && (flags & 1) == 0) {
            int last = arrayList2.size() - 1;
            if (last < 0) {
                return false;
            }
            arrayList.add(this.f674.remove(last));
            isRecordPop.add(true);
        } else {
            int index = -1;
            if (name != null || id >= 0) {
                index = this.f674.size() - 1;
                while (index >= 0) {
                    C0589 bss = this.f674.get(index);
                    if ((name != null && name.equals(bss.m2870())) || (id >= 0 && id == bss.f2335)) {
                        break;
                    }
                    index--;
                }
                if (index < 0) {
                    return false;
                }
                if ((flags & 1) != 0) {
                    index--;
                    while (index >= 0) {
                        C0589 bss2 = this.f674.get(index);
                        if ((name == null || !name.equals(bss2.m2870())) && (id < 0 || id != bss2.f2335)) {
                            break;
                        }
                        index--;
                    }
                }
            }
            if (index == this.f674.size() - 1) {
                return false;
            }
            for (int i = this.f674.size() - 1; i > index; i--) {
                arrayList.add(this.f674.remove(i));
                isRecordPop.add(true);
            }
        }
        return true;
    }

    @Override // ♫.AbstractC0133, ♫.AbstractC0133
    /* renamed from: θ  reason: contains not printable characters */
    public C0159 m716() {
        m673(this.f691);
        return this.f691;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m673(C0159 nonConfig) {
        if (nonConfig != null) {
            List<Fragment> fragments = nonConfig.m790();
            if (fragments != null) {
                Iterator<Fragment> it = fragments.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacksC0071) it.next()).f560 = true;
                }
            }
            List<FragmentManagerNonConfig> children = nonConfig.m791();
            if (children != null) {
                Iterator<FragmentManagerNonConfig> it2 = children.iterator();
                while (it2.hasNext()) {
                    m673((C0159) it2.next());
                }
            }
        }
    }

    /* renamed from: Е  reason: contains not printable characters */
    public void m757() {
        C0159 child;
        ArrayList<Fragment> fragments = null;
        ArrayList<FragmentManagerNonConfig> childFragments = null;
        ArrayList<ViewModelStore> viewModelStores = null;
        if (this.f683 != null) {
            for (int i = 0; i < this.f683.size(); i++) {
                ComponentCallbacksC0071 f = this.f683.valueAt(i);
                if (f != null) {
                    if (f.f559) {
                        if (fragments == null) {
                            fragments = new ArrayList<>();
                        }
                        fragments.add(f);
                        ComponentCallbacksC0071 r6 = f.f541;
                        f.f521 = r6 != null ? r6.f523 : -1;
                        if (f667) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + f);
                        }
                    }
                    LayoutInflater$Factory2C0138 r62 = f.f528;
                    if (r62 != null) {
                        r62.m757();
                        child = f.f528.f691;
                    } else {
                        child = f.f545;
                    }
                    if (childFragments == null && child != null) {
                        childFragments = new ArrayList<>(this.f683.size());
                        for (int j = 0; j < i; j++) {
                            childFragments.add(null);
                        }
                    }
                    if (childFragments != null) {
                        childFragments.add(child);
                    }
                    if (viewModelStores == null && f.f544 != null) {
                        viewModelStores = new ArrayList<>(this.f683.size());
                        for (int j2 = 0; j2 < i; j2++) {
                            viewModelStores.add(null);
                        }
                    }
                    if (viewModelStores != null) {
                        viewModelStores.add(f.f544);
                    }
                }
            }
        }
        if (fragments == null && childFragments == null && viewModelStores == null) {
            this.f691 = null;
        } else {
            this.f691 = new C0159(fragments, childFragments, viewModelStores);
        }
    }

    /* renamed from: ₢  reason: contains not printable characters */
    public void m763(ComponentCallbacksC0071 f) {
        if (f.f525 != null) {
            SparseArray<Parcelable> sparseArray = this.f677;
            if (sparseArray == null) {
                this.f677 = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            f.f525.saveHierarchyState(this.f677);
            if (this.f677.size() > 0) {
                f.f534 = this.f677;
                this.f677 = null;
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Bundle m706(ComponentCallbacksC0071 f) {
        Bundle result = null;
        if (this.f682 == null) {
            this.f682 = new Bundle();
        }
        f.m348(this.f682);
        m682(f, this.f682, false);
        if (!this.f682.isEmpty()) {
            result = this.f682;
            this.f682 = null;
        }
        if (f.f536 != null) {
            m763(f);
        }
        if (f.f534 != null) {
            if (result == null) {
                result = new Bundle();
            }
            result.putSparseParcelableArray("android:view_state", f.f534);
        }
        if (!f.f553) {
            if (result == null) {
                result = new Bundle();
            }
            result.putBoolean("android:user_visible_hint", f.f553);
        }
        return result;
    }

    @Override // ♫.AbstractC0133, ♫.AbstractC0133
    /* renamed from: θ  reason: contains not printable characters */
    public Parcelable m707() {
        int N;
        m754();
        m752();
        m692();
        this.f671 = true;
        this.f691 = null;
        SparseArray<ComponentCallbacksC0071> sparseArray = this.f683;
        if (sparseArray == null || sparseArray.size() <= 0) {
            return null;
        }
        int N2 = this.f683.size();
        C0189[] active = new C0189[N2];
        boolean haveFragments = false;
        for (int i = 0; i < N2; i++) {
            ComponentCallbacksC0071 f = this.f683.valueAt(i);
            if (f != null) {
                if (f.f523 >= 0) {
                    haveFragments = true;
                    C0189 fs = new C0189(f);
                    active[i] = fs;
                    if (f.f532 <= 0 || fs.f804 != null) {
                        fs.f804 = f.f533;
                    } else {
                        fs.f804 = m706(f);
                        ComponentCallbacksC0071 r6 = f.f541;
                        if (r6 != null) {
                            if (r6.f523 >= 0) {
                                if (fs.f804 == null) {
                                    fs.f804 = new Bundle();
                                }
                                m722(fs.f804, "android:target_state", f.f541);
                                int i2 = f.f517;
                                if (i2 != 0) {
                                    fs.f804.putInt("android:target_req_state", i2);
                                }
                            } else {
                                m725(new IllegalStateException("Failure saving state: " + f + " has target not in fragment manager: " + f.f541));
                                throw null;
                            }
                        }
                    }
                    if (f667) {
                        Log.v("FragmentManager", "Saved state of " + f + ": " + fs.f804);
                    }
                } else {
                    m725(new IllegalStateException("Failure saving state: active " + f + " has cleared index: " + f.f523));
                    throw null;
                }
            }
        }
        if (!haveFragments) {
            if (f667) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int[] added = null;
        C0594[] backStack = null;
        int N3 = this.f678.size();
        if (N3 > 0) {
            added = new int[N3];
            for (int i3 = 0; i3 < N3; i3++) {
                added[i3] = this.f678.get(i3).f523;
                if (added[i3] >= 0) {
                    if (f667) {
                        Log.v("FragmentManager", "saveAllState: adding fragment #" + i3 + ": " + this.f678.get(i3));
                    }
                } else {
                    m725(new IllegalStateException("Failure saving state: active " + this.f678.get(i3) + " has cleared index: " + added[i3]));
                    throw null;
                }
            }
        }
        ArrayList<C0589> arrayList = this.f674;
        if (arrayList != null && (N = arrayList.size()) > 0) {
            backStack = new C0594[N];
            for (int i4 = 0; i4 < N; i4++) {
                backStack[i4] = new C0594(this.f674.get(i4));
                if (f667) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.f674.get(i4));
                }
            }
        }
        C0178 fms = new C0178();
        fms.f794 = active;
        fms.f793 = added;
        fms.f795 = backStack;
        ComponentCallbacksC0071 r5 = this.f679;
        if (r5 != null) {
            fms.f792 = r5.f523;
        }
        fms.f791 = this.f681;
        m757();
        return fms;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m723(Parcelable state, C0159 nonConfig) {
        List<Fragment> nonConfigFragments;
        List<ViewModelStore> viewModelStores;
        if (state != null) {
            C0178 fms = (C0178) state;
            if (fms.f794 != null) {
                if (nonConfig != null) {
                    List<Fragment> nonConfigFragments2 = nonConfig.m790();
                    List<ViewModelStore> childNonConfigs = nonConfig.m791();
                    List<Fragment> viewModelStores2 = nonConfig.m789();
                    int count = nonConfigFragments2 != null ? nonConfigFragments2.size() : 0;
                    for (int i = 0; i < count; i++) {
                        ComponentCallbacksC0071 f = (ComponentCallbacksC0071) nonConfigFragments2.get(i);
                        if (f667) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + f);
                        }
                        int index = 0;
                        while (true) {
                            C0189[] r11 = fms.f794;
                            if (index >= r11.length || r11[index].f807 == f.f523) {
                                C0189[] r112 = fms.f794;
                            } else {
                                index++;
                            }
                        }
                        C0189[] r1122 = fms.f794;
                        if (index != r1122.length) {
                            C0189 fs = r1122[index];
                            fs.f810 = f;
                            f.f534 = null;
                            f.f519 = 0;
                            f.f520 = false;
                            f.f530 = false;
                            f.f541 = null;
                            Bundle bundle = fs.f804;
                            if (bundle != null) {
                                bundle.setClassLoader(this.f690.m594().getClassLoader());
                                f.f534 = fs.f804.getSparseParcelableArray("android:view_state");
                                f.f533 = fs.f804;
                            }
                        } else {
                            m725(new IllegalStateException("Could not find active fragment with index " + f.f523));
                            throw null;
                        }
                    }
                    nonConfigFragments = viewModelStores2;
                    viewModelStores = childNonConfigs;
                } else {
                    nonConfigFragments = null;
                    viewModelStores = null;
                }
                this.f683 = new SparseArray<>(fms.f794.length);
                int i2 = 0;
                while (true) {
                    C0189[] r7 = fms.f794;
                    if (i2 >= r7.length) {
                        break;
                    }
                    C0189 fs2 = r7[i2];
                    if (fs2 != null) {
                        C0159 childNonConfig = null;
                        if (viewModelStores != null && i2 < viewModelStores.size()) {
                            childNonConfig = (C0159) viewModelStores.get(i2);
                        }
                        ComponentCallbacksC0071 f2 = fs2.m907(this.f690, this.f689, this.f688, childNonConfig, (nonConfigFragments == null || i2 >= nonConfigFragments.size()) ? null : (C0156) nonConfigFragments.get(i2));
                        if (f667) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + f2);
                        }
                        this.f683.put(f2.f523, f2);
                        fs2.f810 = null;
                    }
                    i2++;
                }
                if (nonConfig != null) {
                    List<Fragment> nonConfigFragments3 = nonConfig.m790();
                    int count2 = nonConfigFragments3 != null ? nonConfigFragments3.size() : 0;
                    for (int i3 = 0; i3 < count2; i3++) {
                        ComponentCallbacksC0071 f3 = (ComponentCallbacksC0071) nonConfigFragments3.get(i3);
                        int i4 = f3.f521;
                        if (i4 >= 0) {
                            f3.f541 = this.f683.get(i4);
                            if (f3.f541 == null) {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + f3 + " target no longer exists: " + f3.f521);
                            }
                        }
                    }
                }
                this.f678.clear();
                if (fms.f793 != null) {
                    int i5 = 0;
                    while (true) {
                        int[] iArr = fms.f793;
                        if (i5 >= iArr.length) {
                            break;
                        }
                        ComponentCallbacksC0071 f4 = this.f683.get(iArr[i5]);
                        if (f4 != null) {
                            f4.f530 = true;
                            if (f667) {
                                Log.v("FragmentManager", "restoreAllState: added #" + i5 + ": " + f4);
                            }
                            if (!this.f678.contains(f4)) {
                                synchronized (this.f678) {
                                    this.f678.add(f4);
                                }
                                i5++;
                            } else {
                                throw new IllegalStateException("Already added!");
                            }
                        } else {
                            m725(new IllegalStateException("No instantiated fragment for index #" + fms.f793[i5]));
                            throw null;
                        }
                    }
                }
                C0594[] r0 = fms.f795;
                if (r0 != null) {
                    this.f674 = new ArrayList<>(r0.length);
                    int i6 = 0;
                    while (true) {
                        C0594[] r4 = fms.f795;
                        if (i6 >= r4.length) {
                            break;
                        }
                        C0589 bse = r4[i6].m2891(this);
                        if (f667) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i6 + " (index " + bse.f2335 + "): " + bse);
                            PrintWriter pw = new PrintWriter(new C0113("FragmentManager"));
                            bse.m2875("  ", pw, false);
                            pw.close();
                        }
                        this.f674.add(bse);
                        int i7 = bse.f2335;
                        if (i7 >= 0) {
                            m719(i7, bse);
                        }
                        i6++;
                    }
                } else {
                    this.f674 = null;
                }
                int i8 = fms.f792;
                if (i8 >= 0) {
                    this.f679 = this.f683.get(i8);
                }
                this.f681 = fms.f791;
            }
        }
    }

    @Override // ♫.AbstractC0133, ♫.AbstractC0133
    /* renamed from: θ  reason: contains not printable characters */
    public final void m717() {
        SparseArray<ComponentCallbacksC0071> sparseArray = this.f683;
        if (sparseArray != null) {
            for (int i = sparseArray.size() - 1; i >= 0; i--) {
                if (this.f683.valueAt(i) == null) {
                    SparseArray<ComponentCallbacksC0071> sparseArray2 = this.f683;
                    sparseArray2.delete(sparseArray2.keyAt(i));
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m736(AbstractC0111 host, AbstractC0092 container, ComponentCallbacksC0071 parent) {
        if (this.f690 == null) {
            this.f690 = host;
            this.f689 = container;
            this.f688 = parent;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: Г  reason: contains not printable characters */
    public void m755() {
        this.f691 = null;
        this.f671 = false;
        this.f673 = false;
        int addedCount = this.f678.size();
        for (int i = 0; i < addedCount; i++) {
            ComponentCallbacksC0071 fragment = this.f678.get(i);
            if (fragment != null) {
                fragment.m342();
            }
        }
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m684() {
        this.f671 = false;
        this.f673 = false;
        m718(1);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m680() {
        this.f671 = false;
        this.f673 = false;
        m718(2);
    }

    /* renamed from: ₧  reason: contains not printable characters */
    public void m768() {
        this.f671 = false;
        this.f673 = false;
        m718(3);
    }

    /* renamed from: ₤  reason: contains not printable characters */
    public void m766() {
        this.f671 = false;
        this.f673 = false;
        m718(4);
    }

    /* renamed from: ₣  reason: contains not printable characters */
    public void m764() {
        m718(3);
    }

    /* renamed from: ₢  reason: contains not printable characters */
    public void m762() {
        this.f673 = true;
        m718(2);
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public void m770() {
        m718(1);
    }

    /* renamed from: µ  reason: contains not printable characters */
    public void m677() {
        this.f669 = true;
        m692();
        m718(0);
        this.f690 = null;
        this.f689 = null;
        this.f688 = null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: θ  reason: contains not printable characters */
    public final void m718(int nextState) {
        try {
            this.f680 = true;
            m720(nextState, false);
            this.f680 = false;
            m692();
        } catch (Throwable th) {
            this.f680 = false;
            throw th;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m740(boolean isInMultiWindowMode) {
        for (int i = this.f678.size() - 1; i >= 0; i--) {
            ComponentCallbacksC0071 f = this.f678.get(i);
            if (f != null) {
                f.m403(isInMultiWindowMode);
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m702(boolean isInPictureInPictureMode) {
        for (int i = this.f678.size() - 1; i >= 0; i--) {
            ComponentCallbacksC0071 f = this.f678.get(i);
            if (f != null) {
                f.m372(isInPictureInPictureMode);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m721(Configuration newConfig) {
        for (int i = 0; i < this.f678.size(); i++) {
            ComponentCallbacksC0071 f = this.f678.get(i);
            if (f != null) {
                f.m395(newConfig);
            }
        }
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public void m759() {
        for (int i = 0; i < this.f678.size(); i++) {
            ComponentCallbacksC0071 f = this.f678.get(i);
            if (f != null) {
                f.m429();
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m744(Menu menu, MenuInflater inflater) {
        if (this.f676 < 1) {
            return false;
        }
        boolean show = false;
        ArrayList<Fragment> newMenus = null;
        for (int i = 0; i < this.f678.size(); i++) {
            ComponentCallbacksC0071 f = this.f678.get(i);
            if (f != null && f.m406(menu, inflater)) {
                show = true;
                if (newMenus == null) {
                    newMenus = new ArrayList<>();
                }
                newMenus.add(f);
            }
        }
        if (this.f670 != null) {
            for (int i2 = 0; i2 < this.f670.size(); i2++) {
                ComponentCallbacksC0071 f2 = this.f670.get(i2);
                if (newMenus == null || !newMenus.contains(f2)) {
                    f2.m410();
                }
            }
        }
        this.f670 = newMenus;
        return show;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m743(Menu menu) {
        if (this.f676 < 1) {
            return false;
        }
        boolean show = false;
        for (int i = 0; i < this.f678.size(); i++) {
            ComponentCallbacksC0071 f = this.f678.get(i);
            if (f != null && f.m405(menu)) {
                show = true;
            }
        }
        return show;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m704(MenuItem item) {
        if (this.f676 < 1) {
            return false;
        }
        for (int i = 0; i < this.f678.size(); i++) {
            ComponentCallbacksC0071 f = this.f678.get(i);
            if (f != null && f.m374(item)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m745(MenuItem item) {
        if (this.f676 < 1) {
            return false;
        }
        for (int i = 0; i < this.f678.size(); i++) {
            ComponentCallbacksC0071 f = this.f678.get(i);
            if (f != null && f.m407(item)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m724(Menu menu) {
        if (this.f676 >= 1) {
            for (int i = 0; i < this.f678.size(); i++) {
                ComponentCallbacksC0071 f = this.f678.get(i);
                if (f != null) {
                    f.m399(menu);
                }
            }
        }
    }

    /* renamed from: А  reason: contains not printable characters */
    public void m751(ComponentCallbacksC0071 f) {
        if (f == null || (this.f683.get(f.f523) == f && (f.f542 == null || f.m368() == this))) {
            this.f679 = f;
            return;
        }
        throw new IllegalArgumentException("Fragment " + f + " is not an active fragment of FragmentManager " + this);
    }

    @Override // ♫.AbstractC0133, ♫.AbstractC0133
    /* renamed from: θ  reason: contains not printable characters */
    public ComponentCallbacksC0071 m710() {
        return this.f679;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: Φ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m698(♫.ComponentCallbacksC0071 r4, android.content.Context r5, boolean r6) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m698(r4, r5, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r6 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r6 = r1.f719
            r6 = 0
            throw r6
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m698(♫.ɩ, android.content.Context, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m731(♫.ComponentCallbacksC0071 r4, android.content.Context r5, boolean r6) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m731(r4, r5, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r6 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r6 = r1.f719
            r6 = 0
            throw r6
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m731(♫.ɩ, android.content.Context, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: ø  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m689(♫.ComponentCallbacksC0071 r4, android.os.Bundle r5, boolean r6) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m689(r4, r5, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r6 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r6 = r1.f719
            r6 = 0
            throw r6
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m689(♫.ɩ, android.os.Bundle, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: Φ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m699(♫.ComponentCallbacksC0071 r4, android.os.Bundle r5, boolean r6) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m699(r4, r5, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r6 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r6 = r1.f719
            r6 = 0
            throw r6
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m699(♫.ɩ, android.os.Bundle, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m732(♫.ComponentCallbacksC0071 r4, android.os.Bundle r5, boolean r6) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m732(r4, r5, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r6 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r6 = r1.f719
            r6 = 0
            throw r6
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m732(♫.ɩ, android.os.Bundle, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m733(♫.ComponentCallbacksC0071 r4, android.view.View r5, android.os.Bundle r6, boolean r7) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m733(r4, r5, r6, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r7 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r7 = r1.f719
            r7 = 0
            throw r7
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m733(♫.ɩ, android.view.View, android.os.Bundle, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: µ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m679(♫.ComponentCallbacksC0071 r4, boolean r5) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m679(r4, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r5 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r5 = r1.f719
            r5 = 0
            throw r5
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m679(♫.ɩ, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: ö  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m686(♫.ComponentCallbacksC0071 r4, boolean r5) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m686(r4, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r5 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r5 = r1.f719
            r5 = 0
            throw r5
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m686(♫.ɩ, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: Ø  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m683(♫.ComponentCallbacksC0071 r4, boolean r5) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m683(r4, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r5 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r5 = r1.f719
            r5 = 0
            throw r5
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m683(♫.ɩ, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: ₩  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m772(♫.ComponentCallbacksC0071 r4, boolean r5) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m772(r4, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r5 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r5 = r1.f719
            r5 = 0
            throw r5
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m772(♫.ɩ, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: Ø  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m682(♫.ComponentCallbacksC0071 r4, android.os.Bundle r5, boolean r6) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m682(r4, r5, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r6 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r6 = r1.f719
            r6 = 0
            throw r6
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m682(♫.ɩ, android.os.Bundle, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: ฿  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m761(♫.ComponentCallbacksC0071 r4, boolean r5) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m761(r4, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r5 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r5 = r1.f719
            r5 = 0
            throw r5
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m761(♫.ɩ, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: Φ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m700(♫.ComponentCallbacksC0071 r4, boolean r5) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m700(r4, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r5 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r5 = r1.f719
            r5 = 0
            throw r5
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m700(♫.ɩ, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: ø  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m690(♫.ComponentCallbacksC0071 r4, boolean r5) {
        /*
            r3 = this;
            ♫.ɩ r0 = r3.f688
            if (r0 == 0) goto L_0x0013
            ♫.ˢ r0 = r0.m368()
            boolean r1 = r0 instanceof ♫.LayoutInflater$Factory2C0138
            if (r1 == 0) goto L_0x0013
            r1 = r0
            ♫.ˤ r1 = (♫.LayoutInflater$Factory2C0138) r1
            r2 = 1
            r1.m690(r4, r2)
        L_0x0013:
            java.util.concurrent.CopyOnWriteArrayList<♫.ˤ$₤> r0 = r3.f687
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            ♫.ˤ$₤ r1 = (♫.LayoutInflater$Factory2C0138.C0150) r1
            if (r5 == 0) goto L_0x002c
            boolean r2 = r1.f720
            if (r2 != 0) goto L_0x002c
            goto L_0x0019
        L_0x002c:
            ♫.ˢ$Φ r5 = r1.f719
            r5 = 0
            throw r5
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0138.m690(♫.ɩ, boolean):void");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m667(int transit) {
        if (transit == 4097) {
            return 8194;
        }
        if (transit == 4099) {
            return 4099;
        }
        if (transit != 8194) {
            return 0;
        }
        return 4097;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m668(int transit, boolean enter) {
        if (transit == 4097) {
            return enter ? 1 : 2;
        } else if (transit == 4099) {
            return enter ? 5 : 6;
        } else if (transit != 8194) {
            return -1;
        } else {
            return enter ? 3 : 4;
        }
    }

    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        String fname;
        ComponentCallbacksC0071 fragment;
        if (!"fragment".equals(name)) {
            return null;
        }
        String fname2 = attrs.getAttributeValue(null, "class");
        TypedArray a = context.obtainStyledAttributes(attrs, C0151.f721);
        int containerId = 0;
        if (fname2 == null) {
            fname = a.getString(0);
        } else {
            fname = fname2;
        }
        int id = a.getResourceId(1, -1);
        String tag = a.getString(2);
        a.recycle();
        if (!ComponentCallbacksC0071.m340(this.f690.m594(), fname)) {
            return null;
        }
        if (parent != null) {
            containerId = parent.getId();
        }
        if (containerId == -1 && id == -1 && tag == null) {
            throw new IllegalArgumentException(attrs.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + fname);
        }
        ComponentCallbacksC0071 fragment2 = id != -1 ? m711(id) : null;
        if (fragment2 == null && tag != null) {
            fragment2 = m713(tag);
        }
        if (fragment2 == null && containerId != -1) {
            fragment2 = m711(containerId);
        }
        if (f667) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(id) + " fname=" + fname + " existing=" + fragment2);
        }
        if (fragment2 == null) {
            ComponentCallbacksC0071 fragment3 = this.f689.m510(context, fname, null);
            fragment3.f518 = true;
            fragment3.f515 = id != 0 ? id : containerId;
            fragment3.f561 = containerId;
            fragment3.f526 = tag;
            fragment3.f520 = true;
            fragment3.f543 = this;
            AbstractC0111 r1 = this.f690;
            fragment3.f542 = r1;
            r1.m594();
            fragment3.m397(attrs, fragment3.f533);
            m735(fragment3, true);
            fragment = fragment3;
        } else if (!fragment2.f520) {
            fragment2.f520 = true;
            AbstractC0111 r0 = this.f690;
            fragment2.f542 = r0;
            if (!fragment2.f560) {
                r0.m594();
                fragment2.m397(attrs, fragment2.f533);
            }
            fragment = fragment2;
        } else {
            throw new IllegalArgumentException(attrs.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(id) + ", tag " + tag + ", or parent id 0x" + Integer.toHexString(containerId) + " with another fragment for " + fname);
        }
        if (this.f676 >= 1 || !fragment.f518) {
            m765(fragment);
        } else {
            m730(fragment, 1, 0, 0, false);
        }
        View view = fragment.f536;
        if (view != null) {
            if (id != 0) {
                view.setId(id);
            }
            if (fragment.f536.getTag() == null) {
                fragment.f536.setTag(tag);
            }
            return fragment.f536;
        }
        throw new IllegalStateException("Fragment " + fname + " did not create a view.");
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }

    @Override // ♫.AbstractC0133, ♫.AbstractC0133
    /* renamed from: θ  reason: contains not printable characters */
    public LayoutInflater.Factory2 m708() {
        return this;
    }

    /* renamed from: ♫.ˤ$一  reason: contains not printable characters */
    public static class C0153 implements ComponentCallbacksC0071.AbstractC0072 {

        /* renamed from: θ  reason: contains not printable characters */
        public int f724;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final C0589 f725;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final boolean f726;

        public C0153(C0589 record, boolean isBack) {
            this.f726 = isBack;
            this.f725 = record;
        }

        /* renamed from: ø  reason: contains not printable characters */
        public void m774() {
            this.f724--;
            if (this.f724 == 0) {
                this.f725.f2331.m749();
            }
        }

        /* renamed from: Ø  reason: contains not printable characters */
        public void m773() {
            this.f724++;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m777() {
            return this.f724 == 0;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public void m775() {
            boolean z = false;
            boolean canceled = this.f724 > 0;
            LayoutInflater$Factory2C0138 manager = this.f725.f2331;
            int numAdded = manager.f678.size();
            for (int i = 0; i < numAdded; i++) {
                ComponentCallbacksC0071 fragment = manager.f678.get(i);
                fragment.m402((ComponentCallbacksC0071.AbstractC0072) null);
                if (canceled && fragment.m353()) {
                    fragment.m434();
                }
            }
            C0589 r5 = this.f725;
            LayoutInflater$Factory2C0138 r6 = r5.f2331;
            boolean z2 = this.f726;
            if (!canceled) {
                z = true;
            }
            r6.m739(r5, z2, z, true);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m776() {
            C0589 r0 = this.f725;
            r0.f2331.m739(r0, this.f726, false, false);
        }
    }

    /* renamed from: ♫.ˤ$₩  reason: contains not printable characters */
    public static class C0152 {

        /* renamed from: θ  reason: contains not printable characters */
        public final Animator f722;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final Animation f723;

        public C0152(Animation animation) {
            this.f723 = animation;
            this.f722 = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public C0152(Animator animator) {
            this.f723 = null;
            this.f722 = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: ♫.ˤ$µ  reason: contains not printable characters */
    public static class animation.Animation$AnimationListenerC0139 implements Animation.AnimationListener {

        /* renamed from: θ  reason: contains not printable characters */
        public final Animation.AnimationListener f698;

        public animation.Animation$AnimationListenerC0139(Animation.AnimationListener wrapped) {
            this.f698 = wrapped;
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f698;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f698;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f698;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }
    }

    /* renamed from: ♫.ˤ$ö  reason: contains not printable characters */
    public static class C0141 extends animation.Animation$AnimationListenerC0139 {

        /* renamed from: θ  reason: contains not printable characters */
        public View f702;

        public C0141(View v, Animation.AnimationListener listener) {
            super(listener);
            this.f702 = v;
        }

        /* renamed from: ♫.ˤ$ö$θ  reason: contains not printable characters */
        public class RunnableC0142 implements Runnable {
            public RunnableC0142() {
            }

            public void run() {
                C0141.this.f702.setLayerType(0, null);
            }
        }

        @Override // ♫.LayoutInflater$Factory2C0138.animation.Animation$AnimationListenerC0139
        public void onAnimationEnd(Animation animation) {
            if (C0248.m1141(this.f702) || Build.VERSION.SDK_INT >= 24) {
                this.f702.post(new RunnableC0142());
            } else {
                this.f702.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* renamed from: ♫.ˤ$฿  reason: contains not printable characters */
    public static class C0147 extends AnimatorListenerAdapter {

        /* renamed from: θ  reason: contains not printable characters */
        public View f713;

        public C0147(View v) {
            this.f713 = v;
        }

        public void onAnimationStart(Animator animation) {
            this.f713.setLayerType(2, null);
        }

        public void onAnimationEnd(Animator animation) {
            this.f713.setLayerType(0, null);
            animation.removeListener(this);
        }
    }

    /* renamed from: ♫.ˤ$₣  reason: contains not printable characters */
    public static class RunnableC0149 extends AnimationSet implements Runnable {

        /* renamed from: Ø  reason: contains not printable characters */
        public boolean f714 = true;

        /* renamed from: ø  reason: contains not printable characters */
        public boolean f715;

        /* renamed from: Φ  reason: contains not printable characters */
        public boolean f716;

        /* renamed from: θ  reason: contains not printable characters */
        public final View f717;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final ViewGroup f718;

        public RunnableC0149(Animation animation, ViewGroup parent, View child) {
            super(false);
            this.f718 = parent;
            this.f717 = child;
            addAnimation(animation);
            this.f718.post(this);
        }

        public boolean getTransformation(long currentTime, Transformation t) {
            this.f714 = true;
            if (this.f716) {
                return true ^ this.f715;
            }
            if (!super.getTransformation(currentTime, t)) {
                this.f716 = true;
                ViewTreeObserver$OnPreDrawListenerC0230.m1037(this.f718, this);
            }
            return true;
        }

        public boolean getTransformation(long currentTime, Transformation outTransformation, float scale) {
            this.f714 = true;
            if (this.f716) {
                return true ^ this.f715;
            }
            if (!super.getTransformation(currentTime, outTransformation, scale)) {
                this.f716 = true;
                ViewTreeObserver$OnPreDrawListenerC0230.m1037(this.f718, this);
            }
            return true;
        }

        public void run() {
            if (this.f716 || !this.f714) {
                this.f718.endViewTransition(this.f717);
                this.f715 = true;
                return;
            }
            this.f714 = false;
            this.f718.post(this);
        }
    }
}
