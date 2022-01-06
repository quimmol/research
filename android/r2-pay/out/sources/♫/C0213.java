package ♫;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentTransition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: ♫.ᔅ  reason: contains not printable characters */
public class C0213 {

    /* renamed from: Φ  reason: contains not printable characters */
    public static final AbstractC0226 f835 = m977();

    /* renamed from: θ  reason: contains not printable characters */
    public static final AbstractC0226 f836 = new C0221();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final int[] f837 = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: ♫.ᔅ$ö  reason: contains not printable characters */
    public static class C0215 {

        /* renamed from: Φ  reason: contains not printable characters */
        public ComponentCallbacksC0071 f850;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public C0589 f851;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public boolean f852;

        /* renamed from: θ  reason: contains not printable characters */
        public ComponentCallbacksC0071 f853;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0589 f854;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f855;
    }

    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static AbstractC0226 m977() {
        try {
            return (AbstractC0226) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m985(LayoutInflater$Factory2C0138 fragmentManager, ArrayList<C0589> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex, boolean isReordered) {
        if (fragmentManager.f676 >= 1) {
            SparseArray<FragmentTransition.FragmentContainerTransition> transitioningFragments = new SparseArray<>();
            for (int i = startIndex; i < endIndex; i++) {
                C0589 record = arrayList.get(i);
                if (isRecordPop.get(i).booleanValue()) {
                    m968(record, (SparseArray<C0215>) transitioningFragments, isReordered);
                } else {
                    m990(record, (SparseArray<C0215>) transitioningFragments, isReordered);
                }
            }
            if (transitioningFragments.size() != 0) {
                View nonExistentView = new View(fragmentManager.f690.m594());
                int numContainers = transitioningFragments.size();
                for (int i2 = 0; i2 < numContainers; i2++) {
                    int containerId = transitioningFragments.keyAt(i2);
                    ArrayMap<String, String> nameOverrides = m979(containerId, arrayList, isRecordPop, startIndex, endIndex);
                    C0215 containerTransition = (C0215) transitioningFragments.valueAt(i2);
                    if (isReordered) {
                        m967(fragmentManager, containerId, containerTransition, nonExistentView, nameOverrides);
                    } else {
                        m984(fragmentManager, containerId, containerTransition, nonExistentView, (C0514<String, String>) nameOverrides);
                    }
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0514<String, String> m979(int containerId, ArrayList<C0589> arrayList, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        ArrayList<String> sources;
        ArrayList<String> targets;
        ArrayMap<String, String> nameOverrides = new C0514<>();
        for (int recordNum = endIndex - 1; recordNum >= startIndex; recordNum--) {
            C0589 record = arrayList.get(recordNum);
            if (record.m2880(containerId)) {
                boolean isPop = isRecordPop.get(recordNum).booleanValue();
                ArrayList<String> arrayList2 = record.f2325;
                if (arrayList2 != null) {
                    int numSharedElements = arrayList2.size();
                    if (isPop) {
                        targets = record.f2325;
                        sources = record.f2321;
                    } else {
                        sources = record.f2325;
                        targets = record.f2321;
                    }
                    for (int i = 0; i < numSharedElements; i++) {
                        String sourceName = sources.get(i);
                        String targetName = targets.get(i);
                        String previousTarget = nameOverrides.remove(targetName);
                        if (previousTarget != null) {
                            nameOverrides.put(sourceName, previousTarget);
                        } else {
                            nameOverrides.put(sourceName, targetName);
                        }
                    }
                }
            }
        }
        return nameOverrides;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static void m967(LayoutInflater$Factory2C0138 fragmentManager, int containerId, C0215 fragments, View nonExistentView, C0514<String, String> r27) {
        ViewGroup sceneRoot;
        ComponentCallbacksC0071 inFragment;
        ComponentCallbacksC0071 outFragment;
        AbstractC0226 impl;
        Object exitTransition;
        if (fragmentManager.f689.m511()) {
            sceneRoot = (ViewGroup) fragmentManager.f689.m509(containerId);
        } else {
            sceneRoot = null;
        }
        if (sceneRoot != null && (impl = m978((outFragment = fragments.f850), (inFragment = fragments.f853))) != null) {
            boolean inIsPop = fragments.f855;
            boolean outIsPop = fragments.f852;
            ArrayList<View> sharedElementsIn = new ArrayList<>();
            ArrayList<View> sharedElementsOut = new ArrayList<>();
            Object enterTransition = m973(impl, inFragment, inIsPop);
            Object exitTransition2 = m965(impl, outFragment, outIsPop);
            Object sharedElementTransition = m964(impl, sceneRoot, nonExistentView, r27, fragments, sharedElementsOut, sharedElementsIn, enterTransition, exitTransition2);
            if (enterTransition == null && sharedElementTransition == null) {
                exitTransition = exitTransition2;
                if (exitTransition == null) {
                    return;
                }
            } else {
                exitTransition = exitTransition2;
            }
            ArrayList<View> exitingViews = m975(impl, exitTransition, outFragment, sharedElementsOut, nonExistentView);
            ArrayList<View> enteringViews = m975(impl, enterTransition, inFragment, sharedElementsIn, nonExistentView);
            m981(enteringViews, 4);
            Object transition = m971(impl, enterTransition, exitTransition, sharedElementTransition, inFragment, inIsPop);
            if (transition != null) {
                m988(impl, exitTransition, outFragment, exitingViews);
                ArrayList<String> inNames = impl.m1022(sharedElementsIn);
                impl.m1031(transition, enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn);
                impl.m1026(sceneRoot, transition);
                impl.m1024(sceneRoot, sharedElementsOut, sharedElementsIn, inNames, r27);
                m981(enteringViews, 0);
                impl.m1019(sharedElementTransition, sharedElementsOut, sharedElementsIn);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m988(AbstractC0226 impl, Object exitTransition, ComponentCallbacksC0071 exitingFragment, ArrayList<View> exitingViews) {
        if (exitingFragment != null && exitTransition != null && exitingFragment.f530 && exitingFragment.f556 && exitingFragment.f555) {
            exitingFragment.m360(true);
            impl.m1030(exitTransition, exitingFragment.m366(), exitingViews);
            ViewTreeObserver$OnPreDrawListenerC0230.m1037(exitingFragment.f537, new RunnableC0218(exitingViews));
        }
    }

    /* renamed from: ♫.ᔅ$θ  reason: contains not printable characters */
    public static class RunnableC0218 implements Runnable {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ ArrayList f871;

        public RunnableC0218(ArrayList arrayList) {
            this.f871 = arrayList;
        }

        public void run() {
            C0213.m981(this.f871, 4);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m984(LayoutInflater$Factory2C0138 fragmentManager, int containerId, C0215 fragments, View nonExistentView, C0514<String, String> r34) {
        ViewGroup sceneRoot;
        ComponentCallbacksC0071 inFragment;
        ComponentCallbacksC0071 outFragment;
        AbstractC0226 impl;
        Object exitTransition;
        Object exitTransition2;
        if (fragmentManager.f689.m511()) {
            sceneRoot = (ViewGroup) fragmentManager.f689.m509(containerId);
        } else {
            sceneRoot = null;
        }
        if (sceneRoot != null && (impl = m978((outFragment = fragments.f850), (inFragment = fragments.f853))) != null) {
            boolean inIsPop = fragments.f855;
            boolean outIsPop = fragments.f852;
            Object enterTransition = m973(impl, inFragment, inIsPop);
            Object exitTransition3 = m965(impl, outFragment, outIsPop);
            ArrayList<View> sharedElementsOut = new ArrayList<>();
            ArrayList<View> sharedElementsIn = new ArrayList<>();
            Object sharedElementTransition = m970(impl, sceneRoot, nonExistentView, r34, fragments, sharedElementsOut, sharedElementsIn, enterTransition, exitTransition3);
            if (enterTransition == null && sharedElementTransition == null) {
                exitTransition = exitTransition3;
                if (exitTransition == null) {
                    return;
                }
            } else {
                exitTransition = exitTransition3;
            }
            ArrayList<View> exitingViews = m975(impl, exitTransition, outFragment, sharedElementsOut, nonExistentView);
            if (exitingViews == null || exitingViews.isEmpty()) {
                exitTransition2 = null;
            } else {
                exitTransition2 = exitTransition;
            }
            impl.m1029(enterTransition, nonExistentView);
            Object transition = m971(impl, enterTransition, exitTransition2, sharedElementTransition, inFragment, fragments.f855);
            if (transition != null) {
                ArrayList<View> enteringViews = new ArrayList<>();
                impl.m1031(transition, enterTransition, enteringViews, exitTransition2, exitingViews, sharedElementTransition, sharedElementsIn);
                m986(impl, sceneRoot, inFragment, nonExistentView, sharedElementsIn, enterTransition, enteringViews, exitTransition2, exitingViews);
                impl.m1025((View) sceneRoot, sharedElementsIn, (Map<String, String>) r34);
                impl.m1026(sceneRoot, transition);
                impl.m1027(sceneRoot, sharedElementsIn, (Map<String, String>) r34);
            }
        }
    }

    /* renamed from: ♫.ᔅ$Φ  reason: contains not printable characters */
    public static class RunnableC0217 implements Runnable {

        /* renamed from: ø  reason: contains not printable characters */
        public final /* synthetic */ ArrayList f863;

        /* renamed from: Φ  reason: contains not printable characters */
        public final /* synthetic */ Object f864;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ArrayList f865;

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ View f866;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ Object f867;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ArrayList f868;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ComponentCallbacksC0071 f869;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ AbstractC0226 f870;

        public RunnableC0217(Object obj, AbstractC0226 r2, View view, ComponentCallbacksC0071 r4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f867 = obj;
            this.f870 = r2;
            this.f866 = view;
            this.f869 = r4;
            this.f868 = arrayList;
            this.f865 = arrayList2;
            this.f863 = arrayList3;
            this.f864 = obj2;
        }

        public void run() {
            Object obj = this.f867;
            if (obj != null) {
                this.f870.m1017(obj, this.f866);
                this.f865.addAll(C0213.m975(this.f870, this.f867, this.f869, this.f868, this.f866));
            }
            if (this.f863 != null) {
                if (this.f864 != null) {
                    ArrayList<View> tempExiting = new ArrayList<>();
                    tempExiting.add(this.f866);
                    this.f870.m1033(this.f864, this.f863, tempExiting);
                }
                this.f863.clear();
                this.f863.add(this.f866);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m986(AbstractC0226 impl, ViewGroup sceneRoot, ComponentCallbacksC0071 inFragment, View nonExistentView, ArrayList<View> sharedElementsIn, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews) {
        ViewTreeObserver$OnPreDrawListenerC0230.m1037(sceneRoot, new RunnableC0217(enterTransition, impl, nonExistentView, inFragment, sharedElementsIn, enteringViews, exitingViews, exitTransition));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static AbstractC0226 m978(ComponentCallbacksC0071 outFragment, ComponentCallbacksC0071 inFragment) {
        ArrayList<Object> transitions = new ArrayList<>();
        if (outFragment != null) {
            Object exitTransition = outFragment.m367();
            if (exitTransition != null) {
                transitions.add(exitTransition);
            }
            Object returnTransition = outFragment.m346();
            if (returnTransition != null) {
                transitions.add(returnTransition);
            }
            Object sharedReturnTransition = outFragment.m341();
            if (sharedReturnTransition != null) {
                transitions.add(sharedReturnTransition);
            }
        }
        if (inFragment != null) {
            Object enterTransition = inFragment.m383();
            if (enterTransition != null) {
                transitions.add(enterTransition);
            }
            Object reenterTransition = inFragment.m356();
            if (reenterTransition != null) {
                transitions.add(reenterTransition);
            }
            Object sharedEnterTransition = inFragment.m350();
            if (sharedEnterTransition != null) {
                transitions.add(sharedEnterTransition);
            }
        }
        if (transitions.isEmpty()) {
            return null;
        }
        AbstractC0226 r1 = f836;
        if (r1 != null && m992(r1, transitions)) {
            return f836;
        }
        AbstractC0226 r12 = f835;
        if (r12 != null && m992(r12, transitions)) {
            return f835;
        }
        if (f836 == null && f835 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m992(AbstractC0226 impl, List<Object> transitions) {
        int size = transitions.size();
        for (int i = 0; i < size; i++) {
            if (!impl.m1036(transitions.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Object m972(AbstractC0226 impl, ComponentCallbacksC0071 inFragment, ComponentCallbacksC0071 outFragment, boolean isPop) {
        Object obj;
        if (inFragment == null || outFragment == null) {
            return null;
        }
        if (isPop) {
            obj = outFragment.m341();
        } else {
            obj = inFragment.m350();
        }
        return impl.m1015(impl.m1020(obj));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Object m973(AbstractC0226 impl, ComponentCallbacksC0071 inFragment, boolean isPop) {
        Object obj;
        if (inFragment == null) {
            return null;
        }
        if (isPop) {
            obj = inFragment.m356();
        } else {
            obj = inFragment.m383();
        }
        return impl.m1020(obj);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static Object m965(AbstractC0226 impl, ComponentCallbacksC0071 outFragment, boolean isPop) {
        Object obj;
        if (outFragment == null) {
            return null;
        }
        if (isPop) {
            obj = outFragment.m346();
        } else {
            obj = outFragment.m367();
        }
        return impl.m1020(obj);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static Object m964(AbstractC0226 impl, ViewGroup sceneRoot, View nonExistentView, C0514<String, String> r25, C0215 fragments, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, Object enterTransition, Object exitTransition) {
        Object sharedElementTransition;
        Object sharedElementTransition2;
        Object sharedElementTransition3;
        Rect epicenter;
        View epicenterView;
        ArrayMap<String, View> inSharedElements;
        ComponentCallbacksC0071 inFragment = fragments.f853;
        ComponentCallbacksC0071 outFragment = fragments.f850;
        if (inFragment != null) {
            inFragment.m366().setVisibility(0);
        }
        if (inFragment != null) {
            if (outFragment != null) {
                boolean inIsPop = fragments.f855;
                if (r25.isEmpty()) {
                    sharedElementTransition = null;
                } else {
                    sharedElementTransition = m972(impl, inFragment, outFragment, inIsPop);
                }
                ArrayMap<String, View> outSharedElements = m966(impl, r25, sharedElementTransition, fragments);
                ArrayMap<String, View> inSharedElements2 = m980(impl, r25, sharedElementTransition, fragments);
                if (r25.isEmpty()) {
                    if (outSharedElements != null) {
                        outSharedElements.clear();
                    }
                    if (inSharedElements2 != null) {
                        inSharedElements2.clear();
                    }
                    sharedElementTransition2 = null;
                } else {
                    m982(sharedElementsOut, (C0514<String, View>) outSharedElements, (Collection<String>) r25.keySet());
                    m982(sharedElementsIn, (C0514<String, View>) inSharedElements2, r25.values());
                    sharedElementTransition2 = sharedElementTransition;
                }
                if (enterTransition == null && exitTransition == null && sharedElementTransition2 == null) {
                    return null;
                }
                m983(inFragment, outFragment, inIsPop, (C0514<String, View>) outSharedElements, true);
                if (sharedElementTransition2 != null) {
                    sharedElementsIn.add(nonExistentView);
                    impl.m1018(sharedElementTransition2, nonExistentView, sharedElementsOut);
                    sharedElementTransition3 = sharedElementTransition2;
                    inSharedElements = inSharedElements2;
                    m987(impl, sharedElementTransition2, exitTransition, (C0514<String, View>) outSharedElements, fragments.f852, fragments.f851);
                    Rect epicenter2 = new Rect();
                    View epicenterView2 = m969((C0514<String, View>) inSharedElements, fragments, enterTransition, inIsPop);
                    if (epicenterView2 != null) {
                        impl.m1028(enterTransition, epicenter2);
                    }
                    epicenter = epicenter2;
                    epicenterView = epicenterView2;
                } else {
                    sharedElementTransition3 = sharedElementTransition2;
                    inSharedElements = inSharedElements2;
                    epicenter = null;
                    epicenterView = null;
                }
                ViewTreeObserver$OnPreDrawListenerC0230.m1037(sceneRoot, new RunnableC0216(inFragment, outFragment, inIsPop, inSharedElements, epicenterView, impl, epicenter));
                return sharedElementTransition3;
            }
        }
        return null;
    }

    /* renamed from: ♫.ᔅ$ø  reason: contains not printable characters */
    public static class RunnableC0216 implements Runnable {

        /* renamed from: Φ  reason: contains not printable characters */
        public final /* synthetic */ ComponentCallbacksC0071 f856;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ boolean f857;

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ Rect f858;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ View f859;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ComponentCallbacksC0071 f860;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ AbstractC0226 f861;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ C0514 f862;

        public RunnableC0216(ComponentCallbacksC0071 r1, ComponentCallbacksC0071 r2, boolean z, C0514 r4, View view, AbstractC0226 r6, Rect rect) {
            this.f860 = r1;
            this.f856 = r2;
            this.f857 = z;
            this.f862 = r4;
            this.f859 = view;
            this.f861 = r6;
            this.f858 = rect;
        }

        public void run() {
            C0213.m983(this.f860, this.f856, this.f857, (C0514<String, View>) this.f862, false);
            View view = this.f859;
            if (view != null) {
                this.f861.m1023(view, this.f858);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m982(ArrayList<View> views, C0514<String, View> r4, Collection<String> nameOverridesSet) {
        for (int i = r4.size() - 1; i >= 0; i--) {
            View view = r4.m2478(i);
            if (nameOverridesSet.contains(C0248.m1149(view))) {
                views.add(view);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Object m970(AbstractC0226 impl, ViewGroup sceneRoot, View nonExistentView, C0514<String, String> r25, C0215 fragments, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, Object enterTransition, Object exitTransition) {
        Object sharedElementTransition;
        Object sharedElementTransition2;
        Rect inEpicenter;
        ComponentCallbacksC0071 inFragment = fragments.f853;
        ComponentCallbacksC0071 outFragment = fragments.f850;
        if (inFragment != null) {
            if (outFragment != null) {
                boolean inIsPop = fragments.f855;
                if (r25.isEmpty()) {
                    sharedElementTransition = null;
                } else {
                    sharedElementTransition = m972(impl, inFragment, outFragment, inIsPop);
                }
                ArrayMap<String, View> outSharedElements = m966(impl, r25, sharedElementTransition, fragments);
                if (r25.isEmpty()) {
                    sharedElementTransition2 = null;
                } else {
                    sharedElementsOut.addAll(outSharedElements.values());
                    sharedElementTransition2 = sharedElementTransition;
                }
                if (enterTransition == null && exitTransition == null && sharedElementTransition2 == null) {
                    return null;
                }
                m983(inFragment, outFragment, inIsPop, (C0514<String, View>) outSharedElements, true);
                if (sharedElementTransition2 != null) {
                    Rect inEpicenter2 = new Rect();
                    impl.m1018(sharedElementTransition2, nonExistentView, sharedElementsOut);
                    m987(impl, sharedElementTransition2, exitTransition, (C0514<String, View>) outSharedElements, fragments.f852, fragments.f851);
                    if (enterTransition != null) {
                        impl.m1028(enterTransition, inEpicenter2);
                    }
                    inEpicenter = inEpicenter2;
                } else {
                    inEpicenter = null;
                }
                ViewTreeObserver$OnPreDrawListenerC0230.m1037(sceneRoot, new RunnableC0214(impl, r25, sharedElementTransition2, fragments, sharedElementsIn, nonExistentView, inFragment, outFragment, inIsPop, sharedElementsOut, enterTransition, inEpicenter));
                return sharedElementTransition2;
            }
        }
        return null;
    }

    /* renamed from: ♫.ᔅ$Ø  reason: contains not printable characters */
    public static class RunnableC0214 implements Runnable {

        /* renamed from: Φ  reason: contains not printable characters */
        public final /* synthetic */ Object f838;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ArrayList f839;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ComponentCallbacksC0071 f840;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ boolean f841;

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ Rect f842;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ View f843;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ Object f844;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ArrayList f845;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ComponentCallbacksC0071 f846;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ C0215 f847;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ AbstractC0226 f848;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ C0514 f849;

        public RunnableC0214(AbstractC0226 r1, C0514 r2, Object obj, C0215 r4, ArrayList arrayList, View view, ComponentCallbacksC0071 r7, ComponentCallbacksC0071 r8, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f848 = r1;
            this.f849 = r2;
            this.f844 = obj;
            this.f847 = r4;
            this.f845 = arrayList;
            this.f843 = view;
            this.f846 = r7;
            this.f840 = r8;
            this.f841 = z;
            this.f839 = arrayList2;
            this.f838 = obj2;
            this.f842 = rect;
        }

        public void run() {
            ArrayMap<String, View> inSharedElements = C0213.m980(this.f848, this.f849, this.f844, this.f847);
            if (inSharedElements != null) {
                this.f845.addAll(inSharedElements.values());
                this.f845.add(this.f843);
            }
            C0213.m983(this.f846, this.f840, this.f841, (C0514<String, View>) inSharedElements, false);
            Object obj = this.f844;
            if (obj != null) {
                this.f848.m1019(obj, this.f839, this.f845);
                View inEpicenterView = C0213.m969((C0514<String, View>) inSharedElements, this.f847, this.f838, this.f841);
                if (inEpicenterView != null) {
                    this.f848.m1023(inEpicenterView, this.f842);
                }
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static C0514<String, View> m966(AbstractC0226 impl, C0514<String, String> r11, Object sharedElementTransition, C0215 fragments) {
        ArrayList<String> names;
        AbstractC0183 sharedElementCallback;
        if (r11.isEmpty() || sharedElementTransition == null) {
            r11.clear();
            return null;
        }
        ComponentCallbacksC0071 outFragment = fragments.f850;
        ArrayMap<String, View> outSharedElements = new C0514<>();
        impl.m1035((Map<String, View>) outSharedElements, outFragment.m366());
        C0589 outTransaction = fragments.f851;
        if (fragments.f852) {
            outFragment.m369();
            sharedElementCallback = null;
            names = outTransaction.f2321;
        } else {
            outFragment.m358();
            sharedElementCallback = null;
            names = outTransaction.f2325;
        }
        outSharedElements.m2404(names);
        if (sharedElementCallback != null) {
            sharedElementCallback.m891(names, outSharedElements);
            for (int i = names.size() - 1; i >= 0; i--) {
                String name = names.get(i);
                View view = outSharedElements.get(name);
                if (view == null) {
                    r11.remove(name);
                } else if (!name.equals(C0248.m1149(view))) {
                    r11.put(C0248.m1149(view), r11.remove(name));
                }
            }
        } else {
            r11.m2404((Collection<?>) outSharedElements.keySet());
        }
        return outSharedElements;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0514<String, View> m980(AbstractC0226 impl, C0514<String, String> r12, Object sharedElementTransition, C0215 fragments) {
        ArrayList<String> names;
        AbstractC0183 sharedElementCallback;
        String key;
        ComponentCallbacksC0071 inFragment = fragments.f853;
        View fragmentView = inFragment.m366();
        if (r12.isEmpty() || sharedElementTransition == null || fragmentView == null) {
            r12.clear();
            return null;
        }
        ArrayMap<String, View> inSharedElements = new C0514<>();
        impl.m1035((Map<String, View>) inSharedElements, fragmentView);
        C0589 inTransaction = fragments.f854;
        if (fragments.f855) {
            inFragment.m358();
            sharedElementCallback = null;
            names = inTransaction.f2325;
        } else {
            inFragment.m369();
            sharedElementCallback = null;
            names = inTransaction.f2321;
        }
        if (names != null) {
            inSharedElements.m2404(names);
            inSharedElements.m2404(r12.values());
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.m891(names, inSharedElements);
            for (int i = names.size() - 1; i >= 0; i--) {
                String name = names.get(i);
                View view = inSharedElements.get(name);
                if (view == null) {
                    String key2 = m974(r12, name);
                    if (key2 != null) {
                        r12.remove(key2);
                    }
                } else if (!name.equals(C0248.m1149(view)) && (key = m974(r12, name)) != null) {
                    r12.put(key, C0248.m1149(view));
                }
            }
        } else {
            m989(r12, (C0514<String, View>) inSharedElements);
        }
        return inSharedElements;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m974(C0514<String, String> r3, String value) {
        int numElements = r3.size();
        for (int i = 0; i < numElements; i++) {
            if (value.equals(r3.m2478(i))) {
                return r3.m2485(i);
            }
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static View m969(C0514<String, View> r3, C0215 fragments, Object enterTransition, boolean inIsPop) {
        ArrayList<String> arrayList;
        String targetName;
        C0589 inTransaction = fragments.f854;
        if (enterTransition == null || r3 == null || (arrayList = inTransaction.f2325) == null || arrayList.isEmpty()) {
            return null;
        }
        if (inIsPop) {
            targetName = inTransaction.f2325.get(0);
        } else {
            targetName = inTransaction.f2321.get(0);
        }
        return r3.get(targetName);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m987(AbstractC0226 impl, Object sharedElementTransition, Object exitTransition, C0514<String, View> r5, boolean outIsPop, C0589 outTransaction) {
        String sourceName;
        ArrayList<String> arrayList = outTransaction.f2325;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (outIsPop) {
                sourceName = outTransaction.f2321.get(0);
            } else {
                sourceName = outTransaction.f2325.get(0);
            }
            View outEpicenterView = r5.get(sourceName);
            impl.m1014(sharedElementTransition, outEpicenterView);
            if (exitTransition != null) {
                impl.m1014(exitTransition, outEpicenterView);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m989(C0514<String, String> r3, C0514<String, View> r4) {
        for (int i = r3.size() - 1; i >= 0; i--) {
            if (!r4.containsKey(r3.m2478(i))) {
                r3.m2480(i);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m983(ComponentCallbacksC0071 inFragment, ComponentCallbacksC0071 outFragment, boolean isPop, C0514<String, View> r10, boolean isStart) {
        if (isPop) {
            outFragment.m369();
        } else {
            inFragment.m369();
        }
        AbstractC0183 sharedElementCallback = null;
        if (0 != 0) {
            ArrayList<View> views = new ArrayList<>();
            ArrayList<String> names = new ArrayList<>();
            int count = r10 == null ? 0 : r10.size();
            for (int i = 0; i < count; i++) {
                names.add(r10.m2485(i));
                views.add(r10.m2478(i));
            }
            if (isStart) {
                sharedElementCallback.m889(names, views, null);
            } else {
                sharedElementCallback.m890(names, views, null);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static ArrayList<View> m975(AbstractC0226 impl, Object transition, ComponentCallbacksC0071 fragment, ArrayList<View> sharedElements, View nonExistentView) {
        ArrayList<View> viewList = null;
        if (transition != null) {
            viewList = new ArrayList<>();
            View root = fragment.m366();
            if (root != null) {
                impl.m1034(viewList, root);
            }
            if (sharedElements != null) {
                viewList.removeAll(sharedElements);
            }
            if (!viewList.isEmpty()) {
                viewList.add(nonExistentView);
                impl.m1032(transition, viewList);
            }
        }
        return viewList;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m981(ArrayList<View> views, int visibility) {
        if (views != null) {
            for (int i = views.size() - 1; i >= 0; i--) {
                views.get(i).setVisibility(visibility);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Object m971(AbstractC0226 impl, Object enterTransition, Object exitTransition, Object sharedElementTransition, ComponentCallbacksC0071 inFragment, boolean isPop) {
        boolean z;
        boolean overlap = true;
        if (!(enterTransition == null || exitTransition == null || inFragment == null)) {
            if (isPop) {
                z = inFragment.m373();
            } else {
                z = inFragment.m404();
            }
            overlap = z;
        }
        if (overlap) {
            return impl.m1016(exitTransition, enterTransition, sharedElementTransition);
        }
        return impl.m1021(exitTransition, enterTransition, sharedElementTransition);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m990(C0589 transaction, SparseArray<C0215> sparseArray, boolean isReordered) {
        int numOps = transaction.f2330.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            m991(transaction, transaction.f2330.get(opNum), sparseArray, false, isReordered);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static void m968(C0589 transaction, SparseArray<C0215> sparseArray, boolean isReordered) {
        if (transaction.f2331.f689.m511()) {
            for (int opNum = transaction.f2330.size() - 1; opNum >= 0; opNum--) {
                m991(transaction, transaction.f2330.get(opNum), sparseArray, true, isReordered);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x012d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0114  */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m991(♫.C0589 r22, ♫.C0589.C0590 r23, android.util.SparseArray<♫.C0213.C0215> r24, boolean r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0213.m991(♫.ﹸ, ♫.ﹸ$θ, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0215 m976(C0215 containerTransition, SparseArray<C0215> sparseArray, int containerId) {
        if (containerTransition != null) {
            return containerTransition;
        }
        C0215 containerTransition2 = new C0215();
        sparseArray.put(containerId, containerTransition2);
        return containerTransition2;
    }
}
