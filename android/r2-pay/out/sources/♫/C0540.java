package ♫;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ♫.C0544;
import ♫.C0548;

/* renamed from: ♫.识  reason: contains not printable characters */
public class C0540 {
    /* renamed from: θ  reason: contains not printable characters */
    public static void m2592(C0550 layoutWidget) {
        if ((layoutWidget.m2720() & 32) != 32) {
            m2584(layoutWidget);
            return;
        }
        layoutWidget.f2138 = true;
        layoutWidget.f2123 = false;
        layoutWidget.f2121 = false;
        layoutWidget.f2141 = false;
        List<ConstraintWidget> widgets = ((C0561) layoutWidget).f2186;
        List<ConstraintWidgetGroup> widgetGroups = layoutWidget.f2125;
        boolean horizontalWrapContent = layoutWidget.m2665() == C0548.EnumC0549.WRAP_CONTENT;
        boolean verticalWrapContent = layoutWidget.m2646() == C0548.EnumC0549.WRAP_CONTENT;
        boolean hasWrapContent = horizontalWrapContent || verticalWrapContent;
        widgetGroups.clear();
        Iterator<ConstraintWidget> it = widgets.iterator();
        while (it.hasNext()) {
            C0548 widget = (C0548) it.next();
            widget.f2083 = null;
            widget.f2067 = false;
            widget.m2627();
        }
        Iterator<ConstraintWidget> it2 = widgets.iterator();
        while (it2.hasNext()) {
            C0548 widget2 = (C0548) it2.next();
            if (widget2.f2083 == null && !m2594(widget2, (List<C0551>) widgetGroups, hasWrapContent)) {
                m2584(layoutWidget);
                layoutWidget.f2138 = false;
                return;
            }
        }
        int measuredWidth = 0;
        int measuredHeight = 0;
        Iterator<ConstraintWidgetGroup> it3 = widgetGroups.iterator();
        while (it3.hasNext()) {
            C0551 group = (C0551) it3.next();
            measuredWidth = Math.max(measuredWidth, m2588(group, 0));
            measuredHeight = Math.max(measuredHeight, m2588(group, 1));
        }
        if (horizontalWrapContent) {
            layoutWidget.m2682(C0548.EnumC0549.FIXED);
            layoutWidget.m2703(measuredWidth);
            layoutWidget.f2123 = true;
            layoutWidget.f2121 = true;
            layoutWidget.f2135 = measuredWidth;
        }
        if (verticalWrapContent) {
            layoutWidget.m2655(C0548.EnumC0549.FIXED);
            layoutWidget.m2640(measuredHeight);
            layoutWidget.f2123 = true;
            layoutWidget.f2141 = true;
            layoutWidget.f2136 = measuredHeight;
        }
        m2589((List<C0551>) widgetGroups, 0, layoutWidget.m2700());
        m2589((List<C0551>) widgetGroups, 1, layoutWidget.m2632());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2594(C0548 widget, List<C0551> list, boolean hasWrapContent) {
        C0551 traverseList = new C0551(new ArrayList(), true);
        list.add(traverseList);
        return m2595(widget, traverseList, list, hasWrapContent);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2595(C0548 widget, C0551 upperGroup, List<C0551> list, boolean hasWrapContent) {
        C0544 r3;
        C0544 r32;
        C0544 r33;
        C0548 r4;
        C0544 r34;
        C0544 r35;
        C0544 r36;
        C0544 r37;
        C0548 r42;
        C0544 r38;
        if (widget == null) {
            return true;
        }
        widget.f2073 = false;
        C0550 layoutWidget = (C0550) widget.m2667();
        C0551 r39 = widget.f2083;
        if (r39 == null) {
            widget.f2085 = true;
            upperGroup.f2150.add(widget);
            widget.f2083 = upperGroup;
            if (widget.f2081.f2034 == null && widget.f2066.f2034 == null && widget.f2071.f2034 == null && widget.f2060.f2034 == null && widget.f2063.f2034 == null && widget.f2108.f2034 == null) {
                m2593(layoutWidget, widget, upperGroup);
                if (hasWrapContent) {
                    return false;
                }
            }
            if (!(widget.f2071.f2034 == null || widget.f2060.f2034 == null)) {
                if (layoutWidget.m2646() == C0548.EnumC0549.WRAP_CONTENT) {
                }
                if (hasWrapContent) {
                    m2593(layoutWidget, widget, upperGroup);
                    return false;
                } else if (!(widget.f2071.f2034.f2035 == widget.m2667() && widget.f2060.f2034.f2035 == widget.m2667())) {
                    m2593(layoutWidget, widget, upperGroup);
                }
            }
            if (!(widget.f2081.f2034 == null || widget.f2066.f2034 == null)) {
                if (layoutWidget.m2665() == C0548.EnumC0549.WRAP_CONTENT) {
                }
                if (hasWrapContent) {
                    m2593(layoutWidget, widget, upperGroup);
                    return false;
                } else if (!(widget.f2081.f2034.f2035 == widget.m2667() && widget.f2066.f2034.f2035 == widget.m2667())) {
                    m2593(layoutWidget, widget, upperGroup);
                }
            }
            if (((widget.m2665() == C0548.EnumC0549.MATCH_CONSTRAINT) ^ (widget.m2646() == C0548.EnumC0549.MATCH_CONSTRAINT)) && widget.f2061 != 0.0f) {
                m2585(widget);
            } else if (widget.m2665() == C0548.EnumC0549.MATCH_CONSTRAINT || widget.m2646() == C0548.EnumC0549.MATCH_CONSTRAINT) {
                m2593(layoutWidget, widget, upperGroup);
                if (hasWrapContent) {
                    return false;
                }
            }
            if (((widget.f2081.f2034 == null && widget.f2066.f2034 == null) || (((r35 = widget.f2081.f2034) != null && r35.f2035 == widget.f2082 && widget.f2066.f2034 == null) || (((r36 = widget.f2066.f2034) != null && r36.f2035 == widget.f2082 && widget.f2081.f2034 == null) || ((r37 = widget.f2081.f2034) != null && r37.f2035 == (r42 = widget.f2082) && (r38 = widget.f2066.f2034) != null && r38.f2035 == r42)))) && widget.f2108.f2034 == null && !(widget instanceof C0552) && !(widget instanceof C0553)) {
                upperGroup.f2147.add(widget);
            }
            if (((widget.f2071.f2034 == null && widget.f2060.f2034 == null) || (((r3 = widget.f2071.f2034) != null && r3.f2035 == widget.f2082 && widget.f2060.f2034 == null) || (((r32 = widget.f2060.f2034) != null && r32.f2035 == widget.f2082 && widget.f2071.f2034 == null) || ((r33 = widget.f2071.f2034) != null && r33.f2035 == (r4 = widget.f2082) && (r34 = widget.f2060.f2034) != null && r34.f2035 == r4)))) && widget.f2108.f2034 == null && widget.f2063.f2034 == null && !(widget instanceof C0552) && !(widget instanceof C0553)) {
                upperGroup.f2144.add(widget);
            }
            if (widget instanceof C0553) {
                m2593(layoutWidget, widget, upperGroup);
                if (hasWrapContent) {
                    return false;
                }
                C0553 hWidget = (C0553) widget;
                for (int widgetsCount = 0; widgetsCount < hWidget.f2160; widgetsCount++) {
                    if (!m2595(hWidget.f2159[widgetsCount], upperGroup, list, hasWrapContent)) {
                        return false;
                    }
                }
            }
            int anchorsSize = widget.f2088.length;
            for (int i = 0; i < anchorsSize; i++) {
                C0544 anchor = widget.f2088[i];
                C0544 r6 = anchor.f2034;
                if (!(r6 == null || r6.f2035 == widget.m2667())) {
                    if (anchor.f2032 == C0544.EnumC0545.CENTER) {
                        m2593(layoutWidget, widget, upperGroup);
                        if (hasWrapContent) {
                            return false;
                        }
                    } else {
                        m2590(anchor);
                    }
                    if (!m2595(anchor.f2034.f2035, upperGroup, list, hasWrapContent)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (r39 != upperGroup) {
            upperGroup.f2150.addAll(r39.f2150);
            upperGroup.f2147.addAll(widget.f2083.f2147);
            upperGroup.f2144.addAll(widget.f2083.f2144);
            if (!widget.f2083.f2151) {
                upperGroup.f2151 = false;
            }
            list.remove(widget.f2083);
            for (C0548 auxWidget : widget.f2083.f2150) {
                auxWidget.f2083 = upperGroup;
            }
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2593(C0550 layoutWidget, C0548 widget, C0551 group) {
        group.f2151 = false;
        layoutWidget.f2138 = false;
        widget.f2085 = false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m2588(C0551 group, int orientation) {
        int dimension = 0;
        int offset = orientation * 2;
        List<ConstraintWidget> startWidgets = group.m2731(orientation);
        int size = startWidgets.size();
        for (int i = 0; i < size; i++) {
            C0548 widget = (C0548) startWidgets.get(i);
            C0544[] r6 = widget.f2088;
            dimension = Math.max(dimension, m2587(widget, orientation, r6[offset + 1].f2034 == null || !(r6[offset].f2034 == null || r6[offset + 1].f2034 == null), 0));
        }
        group.f2152[orientation] = dimension;
        return dimension;
    }

    /* JADX INFO: Multiple debug info for r3v2 int: [D('dimension' int), D('downDepth' int)] */
    /* renamed from: θ  reason: contains not printable characters */
    public static int m2587(C0548 widget, int orientation, boolean topLeftFlow, int depth) {
        int endOffset;
        int startOffset;
        int baselinePostDistance;
        int baselinePreDistance;
        int flow;
        int depth2;
        int dimensionPost;
        int postTemp;
        int startOffset2;
        int postTemp2;
        boolean hasBaseline = false;
        if (!widget.f2085) {
            return 0;
        }
        int dimensionPre = 0;
        int dimensionPost2 = 0;
        if (widget.f2063.f2034 != null && orientation == 1) {
            hasBaseline = true;
        }
        if (topLeftFlow) {
            baselinePreDistance = widget.m2659();
            baselinePostDistance = widget.m2632() - widget.m2659();
            startOffset = orientation * 2;
            endOffset = startOffset + 1;
        } else {
            baselinePreDistance = widget.m2632() - widget.m2659();
            baselinePostDistance = widget.m2659();
            endOffset = orientation * 2;
            startOffset = endOffset + 1;
        }
        C0544[] r12 = widget.f2088;
        if (r12[endOffset].f2034 == null || r12[startOffset].f2034 != null) {
            flow = 1;
        } else {
            flow = -1;
            startOffset = endOffset;
            endOffset = startOffset;
        }
        if (hasBaseline) {
            depth2 = depth - baselinePreDistance;
        } else {
            depth2 = depth;
        }
        int dimension = (widget.f2088[startOffset].m2608() * flow) + m2586(widget, orientation);
        int downDepth = dimension + depth2;
        int postTemp3 = (orientation == 0 ? widget.m2700() : widget.m2632()) * flow;
        Iterator<C0558> it = ((C0558) widget.f2088[startOffset].m2616()).f2175.iterator();
        while (it.hasNext()) {
            dimensionPre = Math.max(dimensionPre, m2587(((C0556) it.next()).f2170.f2035, orientation, topLeftFlow, downDepth));
            it = it;
            dimensionPost2 = dimensionPost2;
        }
        Iterator<C0558> it2 = ((C0558) widget.f2088[endOffset].m2616()).f2175.iterator();
        int dimensionPost3 = dimensionPost2;
        while (it2.hasNext()) {
            dimensionPost3 = Math.max(dimensionPost3, m2587(((C0556) it2.next()).f2170.f2035, orientation, topLeftFlow, postTemp3 + downDepth));
            it2 = it2;
            endOffset = endOffset;
        }
        if (hasBaseline) {
            dimensionPre -= baselinePreDistance;
            dimensionPost = dimensionPost3 + baselinePostDistance;
        } else {
            dimensionPost = dimensionPost3 + ((orientation == 0 ? widget.m2700() : widget.m2632()) * flow);
        }
        int dimensionBaseline = 0;
        if (orientation == 1) {
            Iterator<C0558> it3 = ((C0558) widget.f2063.m2616()).f2175.iterator();
            while (it3.hasNext()) {
                C0556 anchor = (C0556) it3.next();
                if (flow == 1) {
                    postTemp2 = postTemp3;
                    dimensionBaseline = Math.max(dimensionBaseline, m2587(anchor.f2170.f2035, orientation, topLeftFlow, baselinePreDistance + downDepth));
                } else {
                    postTemp2 = postTemp3;
                    dimensionBaseline = Math.max(dimensionBaseline, m2587(anchor.f2170.f2035, orientation, topLeftFlow, (baselinePostDistance * flow) + downDepth));
                }
                it3 = it3;
                startOffset = startOffset;
                postTemp3 = postTemp2;
            }
            startOffset2 = startOffset;
            postTemp = postTemp3;
            if (((C0558) widget.f2063.m2616()).f2175.size() > 0 && !hasBaseline) {
                if (flow == 1) {
                    dimensionBaseline += baselinePreDistance;
                } else {
                    dimensionBaseline -= baselinePostDistance;
                }
            }
        } else {
            startOffset2 = startOffset;
            postTemp = postTemp3;
        }
        int dimension2 = dimension + Math.max(dimensionPre, Math.max(dimensionPost, dimensionBaseline));
        int leftTop = depth2 + dimension;
        int end = leftTop + postTemp;
        if (flow == -1) {
            end = leftTop;
            leftTop = end;
        }
        if (topLeftFlow) {
            C0554.m2751(widget, orientation, leftTop);
            widget.m2673(leftTop, end, orientation);
        } else {
            widget.f2083.m2736(widget, orientation);
            widget.m2630(leftTop, orientation);
        }
        if (widget.m2666(orientation) == C0548.EnumC0549.MATCH_CONSTRAINT && widget.f2061 != 0.0f) {
            widget.f2083.m2736(widget, orientation);
        }
        C0544[] r2 = widget.f2088;
        if (r2[startOffset2].f2034 != null && r2[endOffset].f2034 != null) {
            C0548 parent = widget.m2667();
            C0544[] r3 = widget.f2088;
            if (r3[startOffset2].f2034.f2035 == parent && r3[endOffset].f2034.f2035 == parent) {
                widget.f2083.m2736(widget, orientation);
            }
        }
        return dimension2;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2590(C0544 originAnchor) {
        C0558 originNode = originAnchor.m2616();
        C0544 r1 = originAnchor.f2034;
        if (r1 != null && r1.f2034 != originAnchor) {
            r1.m2616().m2775(originNode);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static void m2584(C0550 layoutWidget) {
        layoutWidget.f2125.clear();
        layoutWidget.f2125.add(0, new C0551(((C0561) layoutWidget).f2186));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2589(List<C0551> list, int orientation, int containerLength) {
        int groupsSize = list.size();
        for (int i = 0; i < groupsSize; i++) {
            for (C0548 widget : list.get(i).m2732(orientation)) {
                if (widget.f2085) {
                    m2591(widget, orientation, containerLength);
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m2591(C0548 widget, int orientation, int containerLength) {
        int offset = orientation * 2;
        C0544[] r1 = widget.f2088;
        C0544 startAnchor = r1[offset];
        C0544 endAnchor = r1[offset + 1];
        if ((startAnchor.f2034 == null || endAnchor.f2034 == null) ? false : true) {
            C0554.m2751(widget, orientation, m2586(widget, orientation) + startAnchor.m2608());
        } else if (widget.f2061 == 0.0f || widget.m2666(orientation) != C0548.EnumC0549.MATCH_CONSTRAINT) {
            int end = containerLength - widget.m2645(orientation);
            int start = end - widget.m2660(orientation);
            widget.m2673(start, end, orientation);
            C0554.m2751(widget, orientation, start);
        } else {
            int length = m2585(widget);
            int start2 = (int) widget.f2088[offset].m2616().f2165;
            endAnchor.m2616().f2167 = startAnchor.m2616();
            endAnchor.m2616().f2165 = (float) length;
            ((C0558) endAnchor.m2616()).f2174 = 1;
            widget.m2673(start2, start2 + length, orientation);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m2586(C0548 widget, int orientation) {
        C0548 r4;
        C0544 r3;
        int offset = orientation * 2;
        C0544[] r1 = widget.f2088;
        C0544 startAnchor = r1[offset];
        C0544 endAnchor = r1[offset + 1];
        C0544 r32 = startAnchor.f2034;
        if (r32 == null || r32.f2035 != (r4 = widget.f2082) || (r3 = endAnchor.f2034) == null || r3.f2035 != r4) {
            return 0;
        }
        return (int) (((float) (((r4.m2660(orientation) - startAnchor.m2608()) - endAnchor.m2608()) - widget.m2660(orientation))) * (orientation == 0 ? widget.f2055 : widget.f2113));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m2585(C0548 widget) {
        int length = -1;
        if (widget.m2665() == C0548.EnumC0549.MATCH_CONSTRAINT) {
            if (widget.f2109 == 0) {
                length = (int) (((float) widget.m2632()) * widget.f2061);
            } else {
                length = (int) (((float) widget.m2632()) / widget.f2061);
            }
            widget.m2703(length);
        } else if (widget.m2646() == C0548.EnumC0549.MATCH_CONSTRAINT) {
            if (widget.f2109 == 1) {
                length = (int) (((float) widget.m2700()) * widget.f2061);
            } else {
                length = (int) (((float) widget.m2700()) / widget.f2061);
            }
            widget.m2640(length);
        }
        return length;
    }
}
