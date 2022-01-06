package ♫;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ♫.ᔉ  reason: contains not printable characters */
public class C0221 extends AbstractC0226 {
    @Override // ♫.AbstractC0226, ♫.AbstractC0226
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1009(Object transition) {
        return transition instanceof Transition;
    }

    @Override // ♫.AbstractC0226, ♫.AbstractC0226
    /* renamed from: θ  reason: contains not printable characters */
    public Object m1000(Object transition) {
        if (transition != null) {
            return ((Transition) transition).clone();
        }
        return null;
    }

    @Override // ♫.AbstractC0226
    /* renamed from: Φ  reason: contains not printable characters */
    public Object m995(Object transition) {
        if (transition == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) transition);
        return transitionSet;
    }

    @Override // ♫.AbstractC0226
    /* renamed from: Φ  reason: contains not printable characters */
    public void m998(Object transitionObj, View nonExistentView, ArrayList<View> sharedViews) {
        TransitionSet transition = (TransitionSet) transitionObj;
        List<View> views = transition.getTargets();
        views.clear();
        int count = sharedViews.size();
        for (int i = 0; i < count; i++) {
            AbstractC0226.m1011(views, sharedViews.get(i));
        }
        views.add(nonExistentView);
        sharedViews.add(nonExistentView);
        m1007(transition, sharedViews);
    }

    @Override // ♫.AbstractC0226
    /* renamed from: ø  reason: contains not printable characters */
    public void m994(Object transitionObj, View view) {
        if (view != null) {
            Rect epicenter = new Rect();
            m1023(view, epicenter);
            ((Transition) transitionObj).setEpicenterCallback(new C0225(this, epicenter));
        }
    }

    /* renamed from: ♫.ᔉ$θ  reason: contains not printable characters */
    public class C0225 extends Transition.EpicenterCallback {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ Rect f882;

        public C0225(C0221 this$0, Rect rect) {
            this.f882 = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f882;
        }
    }

    @Override // ♫.AbstractC0226
    /* renamed from: θ  reason: contains not printable characters */
    public void m1007(Object transitionObj, ArrayList<View> views) {
        Transition transition = (Transition) transitionObj;
        if (transition != null) {
            if (transition instanceof TransitionSet) {
                TransitionSet set = (TransitionSet) transition;
                int numTransitions = set.getTransitionCount();
                for (int i = 0; i < numTransitions; i++) {
                    m1007(set.getTransitionAt(i), views);
                }
            } else if (!m993(transition) && AbstractC0226.m1012((List) transition.getTargets())) {
                int numViews = views.size();
                for (int i2 = 0; i2 < numViews; i2++) {
                    transition.addTarget(views.get(i2));
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m993(Transition transition) {
        return !AbstractC0226.m1012(transition.getTargetIds()) || !AbstractC0226.m1012(transition.getTargetNames()) || !AbstractC0226.m1012(transition.getTargetTypes());
    }

    @Override // ♫.AbstractC0226
    /* renamed from: Φ  reason: contains not printable characters */
    public Object m996(Object transition1, Object transition2, Object transition3) {
        TransitionSet transitionSet = new TransitionSet();
        if (transition1 != null) {
            transitionSet.addTransition((Transition) transition1);
        }
        if (transition2 != null) {
            transitionSet.addTransition((Transition) transition2);
        }
        if (transition3 != null) {
            transitionSet.addTransition((Transition) transition3);
        }
        return transitionSet;
    }

    /* renamed from: ♫.ᔉ$Φ  reason: contains not printable characters */
    public class C0224 implements Transition.TransitionListener {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ View f880;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ArrayList f881;

        public C0224(C0221 this$0, View view, ArrayList arrayList) {
            this.f880 = view;
            this.f881 = arrayList;
        }

        public void onTransitionStart(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f880.setVisibility(8);
            int numViews = this.f881.size();
            for (int i = 0; i < numViews; i++) {
                ((View) this.f881.get(i)).setVisibility(0);
            }
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }
    }

    @Override // ♫.AbstractC0226
    /* renamed from: θ  reason: contains not printable characters */
    public void m1005(Object exitTransitionObj, View fragmentView, ArrayList<View> exitingViews) {
        ((Transition) exitTransitionObj).addListener(new C0224(this, fragmentView, exitingViews));
    }

    @Override // ♫.AbstractC0226
    /* renamed from: θ  reason: contains not printable characters */
    public Object m1001(Object exitTransitionObj, Object enterTransitionObj, Object sharedElementTransitionObj) {
        Transition staggered = null;
        Transition exitTransition = (Transition) exitTransitionObj;
        Transition enterTransition = (Transition) enterTransitionObj;
        Transition sharedElementTransition = (Transition) sharedElementTransitionObj;
        if (exitTransition != null && enterTransition != null) {
            staggered = new TransitionSet().addTransition(exitTransition).addTransition(enterTransition).setOrdering(1);
        } else if (exitTransition != null) {
            staggered = exitTransition;
        } else if (enterTransition != null) {
            staggered = enterTransition;
        }
        if (sharedElementTransition == null) {
            return staggered;
        }
        TransitionSet together = new TransitionSet();
        if (staggered != null) {
            together.addTransition(staggered);
        }
        together.addTransition(sharedElementTransition);
        return together;
    }

    @Override // ♫.AbstractC0226
    /* renamed from: θ  reason: contains not printable characters */
    public void m1002(ViewGroup sceneRoot, Object transition) {
        TransitionManager.beginDelayedTransition(sceneRoot, (Transition) transition);
    }

    /* renamed from: ♫.ᔉ$ø  reason: contains not printable characters */
    public class C0223 implements Transition.TransitionListener {

        /* renamed from: ø  reason: contains not printable characters */
        public final /* synthetic */ Object f873;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ArrayList f874;

        /* renamed from: Φ  reason: contains not printable characters */
        public final /* synthetic */ Object f875;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ArrayList f876;

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ Object f877;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ArrayList f878;

        public C0223(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f877 = obj;
            this.f878 = arrayList;
            this.f875 = obj2;
            this.f876 = arrayList2;
            this.f873 = obj3;
            this.f874 = arrayList3;
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f877;
            if (obj != null) {
                C0221.this.m1008(obj, this.f878, (ArrayList<View>) null);
            }
            Object obj2 = this.f875;
            if (obj2 != null) {
                C0221.this.m1008(obj2, this.f876, (ArrayList<View>) null);
            }
            Object obj3 = this.f873;
            if (obj3 != null) {
                C0221.this.m1008(obj3, this.f874, (ArrayList<View>) null);
            }
        }

        public void onTransitionEnd(Transition transition) {
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }
    }

    @Override // ♫.AbstractC0226
    /* renamed from: θ  reason: contains not printable characters */
    public void m1006(Object overallTransitionObj, Object enterTransition, ArrayList<View> enteringViews, Object exitTransition, ArrayList<View> exitingViews, Object sharedElementTransition, ArrayList<View> sharedElementsIn) {
        ((Transition) overallTransitionObj).addListener(new C0223(enterTransition, enteringViews, exitTransition, exitingViews, sharedElementTransition, sharedElementsIn));
    }

    @Override // ♫.AbstractC0226
    /* renamed from: Φ  reason: contains not printable characters */
    public void m999(Object sharedElementTransitionObj, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn) {
        TransitionSet sharedElementTransition = (TransitionSet) sharedElementTransitionObj;
        if (sharedElementTransition != null) {
            sharedElementTransition.getTargets().clear();
            sharedElementTransition.getTargets().addAll(sharedElementsIn);
            m1008((Object) sharedElementTransition, sharedElementsOut, sharedElementsIn);
        }
    }

    @Override // ♫.AbstractC0226
    /* renamed from: θ  reason: contains not printable characters */
    public void m1008(Object transitionObj, ArrayList<View> oldTargets, ArrayList<View> newTargets) {
        List<View> targets;
        Transition transition = (Transition) transitionObj;
        if (transition instanceof TransitionSet) {
            TransitionSet set = (TransitionSet) transition;
            int numTransitions = set.getTransitionCount();
            for (int i = 0; i < numTransitions; i++) {
                m1008((Object) set.getTransitionAt(i), oldTargets, newTargets);
            }
        } else if (!m993(transition) && (targets = transition.getTargets()) != null && targets.size() == oldTargets.size() && targets.containsAll(oldTargets)) {
            int targetCount = newTargets == null ? 0 : newTargets.size();
            for (int i2 = 0; i2 < targetCount; i2++) {
                transition.addTarget(newTargets.get(i2));
            }
            for (int i3 = oldTargets.size() - 1; i3 >= 0; i3--) {
                transition.removeTarget(oldTargets.get(i3));
            }
        }
    }

    @Override // ♫.AbstractC0226
    /* renamed from: θ  reason: contains not printable characters */
    public void m1004(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((Transition) transitionObj).addTarget(view);
        }
    }

    @Override // ♫.AbstractC0226
    /* renamed from: Φ  reason: contains not printable characters */
    public void m997(Object transitionObj, View view) {
        if (transitionObj != null) {
            ((Transition) transitionObj).removeTarget(view);
        }
    }

    @Override // ♫.AbstractC0226
    /* renamed from: θ  reason: contains not printable characters */
    public void m1003(Object transitionObj, Rect epicenter) {
        if (transitionObj != null) {
            ((Transition) transitionObj).setEpicenterCallback(new C0222(this, epicenter));
        }
    }

    /* renamed from: ♫.ᔉ$Ø  reason: contains not printable characters */
    public class C0222 extends Transition.EpicenterCallback {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ Rect f872;

        public C0222(C0221 this$0, Rect rect) {
            this.f872 = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f872;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f872;
        }
    }
}
