package ♫;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: ♫.ᔊ  reason: contains not printable characters */
public abstract class AbstractC0226 {
    /* renamed from: ø  reason: contains not printable characters */
    public abstract void m1014(Object obj, View view);

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract Object m1015(Object obj);

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract Object m1016(Object obj, Object obj2, Object obj3);

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract void m1017(Object obj, View view);

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract void m1018(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract void m1019(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract Object m1020(Object obj);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract Object m1021(Object obj, Object obj2, Object obj3);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1026(ViewGroup viewGroup, Object obj);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1028(Object obj, Rect rect);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1029(Object obj, View view);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1030(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1031(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1032(Object obj, ArrayList<View> arrayList);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1033(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract boolean m1036(Object obj);

    /* renamed from: θ  reason: contains not printable characters */
    public void m1023(View view, Rect epicenter) {
        int[] loc = new int[2];
        view.getLocationOnScreen(loc);
        epicenter.set(loc[0], loc[1], loc[0] + view.getWidth(), loc[1] + view.getHeight());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ArrayList<String> m1022(ArrayList<View> sharedElementsIn) {
        ArrayList<String> names = new ArrayList<>();
        int numSharedElements = sharedElementsIn.size();
        for (int i = 0; i < numSharedElements; i++) {
            View view = sharedElementsIn.get(i);
            names.add(C0248.m1149(view));
            C0248.m1160(view, (String) null);
        }
        return names;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1024(View sceneRoot, ArrayList<View> sharedElementsOut, ArrayList<View> sharedElementsIn, ArrayList<String> inNames, Map<String, String> nameOverrides) {
        int numSharedElements = sharedElementsIn.size();
        ArrayList<String> outNames = new ArrayList<>();
        for (int i = 0; i < numSharedElements; i++) {
            View view = sharedElementsOut.get(i);
            String name = C0248.m1149(view);
            outNames.add(name);
            if (name != null) {
                C0248.m1160(view, (String) null);
                String inName = nameOverrides.get(name);
                int j = 0;
                while (true) {
                    if (j >= numSharedElements) {
                        break;
                    } else if (inName.equals(inNames.get(j))) {
                        C0248.m1160(sharedElementsIn.get(j), name);
                        break;
                    } else {
                        j++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC0230.m1037(sceneRoot, new RunnableC0229(this, numSharedElements, sharedElementsIn, inNames, sharedElementsOut, outNames));
    }

    /* renamed from: ♫.ᔊ$θ  reason: contains not printable characters */
    public class RunnableC0229 implements Runnable {

        /* renamed from: Ø  reason: contains not printable characters */
        public final /* synthetic */ ArrayList f887;

        /* renamed from: ø  reason: contains not printable characters */
        public final /* synthetic */ ArrayList f888;

        /* renamed from: Φ  reason: contains not printable characters */
        public final /* synthetic */ ArrayList f889;

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ int f890;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ ArrayList f891;

        public RunnableC0229(AbstractC0226 this$0, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f890 = i;
            this.f891 = arrayList;
            this.f889 = arrayList2;
            this.f888 = arrayList3;
            this.f887 = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f890; i++) {
                C0248.m1160((View) this.f891.get(i), (String) this.f889.get(i));
                C0248.m1160((View) this.f888.get(i), (String) this.f887.get(i));
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1034(ArrayList<View> transitioningViews, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C0255.m1176(viewGroup)) {
                transitioningViews.add(viewGroup);
                return;
            }
            int count = viewGroup.getChildCount();
            for (int i = 0; i < count; i++) {
                m1034(transitioningViews, viewGroup.getChildAt(i));
            }
            return;
        }
        transitioningViews.add(view);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1035(Map<String, View> namedViews, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = C0248.m1149(view);
            if (transitionName != null) {
                namedViews.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int count = viewGroup.getChildCount();
                for (int i = 0; i < count; i++) {
                    m1035(namedViews, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: ♫.ᔊ$Φ  reason: contains not printable characters */
    public class RunnableC0228 implements Runnable {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ ArrayList f885;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ Map f886;

        public RunnableC0228(AbstractC0226 this$0, ArrayList arrayList, Map map) {
            this.f885 = arrayList;
            this.f886 = map;
        }

        public void run() {
            int numSharedElements = this.f885.size();
            for (int i = 0; i < numSharedElements; i++) {
                View view = (View) this.f885.get(i);
                String name = C0248.m1149(view);
                if (name != null) {
                    C0248.m1160(view, AbstractC0226.m1010(this.f886, name));
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1025(View sceneRoot, ArrayList<View> sharedElementsIn, Map<String, String> nameOverrides) {
        ViewTreeObserver$OnPreDrawListenerC0230.m1037(sceneRoot, new RunnableC0228(this, sharedElementsIn, nameOverrides));
    }

    /* renamed from: ♫.ᔊ$ø  reason: contains not printable characters */
    public class RunnableC0227 implements Runnable {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ ArrayList f883;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final /* synthetic */ Map f884;

        public RunnableC0227(AbstractC0226 this$0, ArrayList arrayList, Map map) {
            this.f883 = arrayList;
            this.f884 = map;
        }

        public void run() {
            int numSharedElements = this.f883.size();
            for (int i = 0; i < numSharedElements; i++) {
                View view = (View) this.f883.get(i);
                C0248.m1160(view, (String) this.f884.get(C0248.m1149(view)));
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1027(ViewGroup sceneRoot, ArrayList<View> sharedElementsIn, Map<String, String> nameOverrides) {
        ViewTreeObserver$OnPreDrawListenerC0230.m1037(sceneRoot, new RunnableC0227(this, sharedElementsIn, nameOverrides));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1011(List<View> views, View startView) {
        int startIndex = views.size();
        if (!m1013(views, startView, startIndex)) {
            views.add(startView);
            for (int index = startIndex; index < views.size(); index++) {
                View view = views.get(index);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int childIndex = 0; childIndex < childCount; childIndex++) {
                        View child = viewGroup.getChildAt(childIndex);
                        if (!m1013(views, child, startIndex)) {
                            views.add(child);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m1013(List<View> views, View view, int maxIndex) {
        for (int i = 0; i < maxIndex; i++) {
            if (views.get(i) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m1012(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m1010(Map<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
