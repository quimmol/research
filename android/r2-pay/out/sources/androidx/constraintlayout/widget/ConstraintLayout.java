package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import ♫.AbstractC0563;
import ♫.C0540;
import ♫.C0544;
import ♫.C0548;
import ♫.C0550;
import ♫.C0552;
import ♫.C0556;
import ♫.C0564;
import ♫.C0567;
import ♫.C0569;
import ♫.C0570;
import ♫.C0572;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: µ  reason: contains not printable characters */
    public int f365 = -1;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f366 = Integer.MAX_VALUE;

    /* renamed from: ö  reason: contains not printable characters */
    public int f367 = 7;

    /* renamed from: ø  reason: contains not printable characters */
    public int f368 = Integer.MAX_VALUE;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f369 = 0;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final ArrayList<C0548> f370 = new ArrayList<>(100);

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f371 = true;

    /* renamed from: θ  reason: contains not printable characters */
    public int f372 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public SparseArray<View> f373 = new SparseArray<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ArrayList<AbstractC0563> f374 = new ArrayList<>(4);

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public HashMap<String, Integer> f375 = new HashMap<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0550 f376 = new C0550();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0564 f377 = null;

    /* renamed from: ฿  reason: contains not printable characters */
    public int f378 = -1;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f379 = -1;

    /* renamed from: θ  reason: contains not printable characters */
    public void m247(int type, Object value1, Object value2) {
        if (type == 0 && (value1 instanceof String) && (value2 instanceof Integer)) {
            if (this.f375 == null) {
                this.f375 = new HashMap<>();
            }
            String name = (String) value1;
            int index = name.indexOf("/");
            if (index != -1) {
                name = name.substring(index + 1);
            }
            this.f375.put(name, Integer.valueOf(((Integer) value2).intValue()));
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Object m242(int type, Object value) {
        if (type != 0 || !(value instanceof String)) {
            return null;
        }
        String name = (String) value;
        HashMap<String, Integer> hashMap = this.f375;
        if (hashMap == null || !hashMap.containsKey(name)) {
            return null;
        }
        return this.f375.get(name);
    }

    public ConstraintLayout(Context context) {
        super(context);
        m248((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        m248(attrs);
    }

    public ConstraintLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m248(attrs);
    }

    public void setId(int id) {
        this.f373.remove(getId());
        super.setId(id);
        this.f373.put(getId(), this);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m248(AttributeSet attrs) {
        this.f376.m2676(this);
        this.f373.put(getId(), this);
        this.f377 = null;
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, C0572.ConstraintLayout_Layout);
            int N = a.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a.getIndex(i);
                if (attr == C0572.ConstraintLayout_Layout_android_minWidth) {
                    this.f372 = a.getDimensionPixelOffset(attr, this.f372);
                } else if (attr == C0572.ConstraintLayout_Layout_android_minHeight) {
                    this.f369 = a.getDimensionPixelOffset(attr, this.f369);
                } else if (attr == C0572.ConstraintLayout_Layout_android_maxWidth) {
                    this.f368 = a.getDimensionPixelOffset(attr, this.f368);
                } else if (attr == C0572.ConstraintLayout_Layout_android_maxHeight) {
                    this.f366 = a.getDimensionPixelOffset(attr, this.f366);
                } else if (attr == C0572.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f367 = a.getInt(attr, this.f367);
                } else if (attr == C0572.ConstraintLayout_Layout_constraintSet) {
                    int id = a.getResourceId(attr, 0);
                    try {
                        this.f377 = new C0564();
                        this.f377.m2799(getContext(), id);
                    } catch (Resources.NotFoundException e) {
                        this.f377 = null;
                    }
                    this.f365 = id;
                }
            }
            a.recycle();
        }
        this.f376.m2721(this.f367);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        int i = Build.VERSION.SDK_INT;
    }

    public void removeView(View view) {
        super.removeView(view);
        int i = Build.VERSION.SDK_INT;
    }

    public void onViewAdded(View view) {
        int i = Build.VERSION.SDK_INT;
        super.onViewAdded(view);
        C0548 widget = m244(view);
        if ((view instanceof C0569) && !(widget instanceof C0552)) {
            C0054 layoutParams = (C0054) view.getLayoutParams();
            layoutParams.f398 = new C0552();
            layoutParams.f382 = true;
            ((C0552) layoutParams.f398).m2747(layoutParams.f422);
        }
        if (view instanceof AbstractC0563) {
            AbstractC0563 helper = (AbstractC0563) view;
            helper.m2791();
            ((C0054) view.getLayoutParams()).f443 = true;
            if (!this.f374.contains(helper)) {
                this.f374.add(helper);
            }
        }
        this.f373.put(view.getId(), view);
        this.f371 = true;
    }

    public void onViewRemoved(View view) {
        int i = Build.VERSION.SDK_INT;
        super.onViewRemoved(view);
        this.f373.remove(view.getId());
        C0548 widget = m244(view);
        this.f376.m2782(widget);
        this.f374.remove(view);
        this.f370.remove(widget);
        this.f371 = true;
    }

    public void setMinWidth(int value) {
        if (value != this.f372) {
            this.f372 = value;
            requestLayout();
        }
    }

    public void setMinHeight(int value) {
        if (value != this.f369) {
            this.f369 = value;
            requestLayout();
        }
    }

    public int getMinWidth() {
        return this.f372;
    }

    public int getMinHeight() {
        return this.f369;
    }

    public void setMaxWidth(int value) {
        if (value != this.f368) {
            this.f368 = value;
            requestLayout();
        }
    }

    public void setMaxHeight(int value) {
        if (value != this.f366) {
            this.f366 = value;
            requestLayout();
        }
    }

    public int getMaxWidth() {
        return this.f368;
    }

    public int getMaxHeight() {
        return this.f366;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m235() {
        int count = getChildCount();
        boolean recompute = false;
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                recompute = true;
                break;
            } else {
                i++;
            }
        }
        if (recompute) {
            this.f370.clear();
            m245();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m245() {
        int helperCount;
        int count;
        C0054 layoutParams;
        int resolveGoneRightMargin;
        int resolvedRightToLeft;
        int resolvedLeftToLeft;
        C0548 target;
        C0548 target2;
        C0548 target3;
        C0548 target4;
        boolean isInEditMode = isInEditMode();
        int count2 = getChildCount();
        boolean z = false;
        int i = -1;
        if (isInEditMode) {
            for (int i2 = 0; i2 < count2; i2++) {
                View view = getChildAt(i2);
                try {
                    String IdAsString = getResources().getResourceName(view.getId());
                    m247(0, IdAsString, Integer.valueOf(view.getId()));
                    int slashIndex = IdAsString.indexOf(47);
                    if (slashIndex != -1) {
                        IdAsString = IdAsString.substring(slashIndex + 1);
                    }
                    m243(view.getId()).m2677(IdAsString);
                } catch (Resources.NotFoundException e) {
                }
            }
        }
        for (int i3 = 0; i3 < count2; i3++) {
            C0548 widget = m244(getChildAt(i3));
            if (widget != null) {
                widget.m2648();
            }
        }
        if (this.f365 != -1) {
            for (int i4 = 0; i4 < count2; i4++) {
                View child = getChildAt(i4);
                if (child.getId() == this.f365 && (child instanceof C0567)) {
                    this.f377 = ((C0567) child).getConstraintSet();
                }
            }
        }
        C0564 r0 = this.f377;
        if (r0 != null) {
            r0.m2800(this);
        }
        this.f376.m2789();
        int helperCount2 = this.f374.size();
        if (helperCount2 > 0) {
            for (int i5 = 0; i5 < helperCount2; i5++) {
                this.f374.get(i5).m2795(this);
            }
        }
        for (int i6 = 0; i6 < count2; i6++) {
            View child2 = getChildAt(i6);
            if (child2 instanceof C0570) {
                ((C0570) child2).m2814(this);
            }
        }
        int i7 = 0;
        while (i7 < count2) {
            View child3 = getChildAt(i7);
            C0548 widget2 = m244(child3);
            if (widget2 == null) {
                count = count2;
                helperCount = helperCount2;
            } else {
                C0054 layoutParams2 = (C0054) child3.getLayoutParams();
                layoutParams2.m249();
                if (layoutParams2.f437) {
                    layoutParams2.f437 = z;
                } else if (isInEditMode) {
                    try {
                        String IdAsString2 = getResources().getResourceName(child3.getId());
                        Object valueOf = Integer.valueOf(child3.getId());
                        int i8 = z ? 1 : 0;
                        int i9 = z ? 1 : 0;
                        int i10 = z ? 1 : 0;
                        m247(i8, IdAsString2, valueOf);
                        m243(child3.getId()).m2677(IdAsString2.substring(IdAsString2.indexOf("id/") + 3));
                    } catch (Resources.NotFoundException e2) {
                    }
                }
                widget2.m2701(child3.getVisibility());
                if (layoutParams2.f433) {
                    widget2.m2701(8);
                }
                widget2.m2676(child3);
                this.f376.m2785(widget2);
                if (!layoutParams2.f385 || !layoutParams2.f391) {
                    this.f370.add(widget2);
                }
                if (layoutParams2.f382) {
                    C0552 guideline = (C0552) widget2;
                    int resolvedGuideBegin = layoutParams2.f429;
                    int resolvedGuideEnd = layoutParams2.f430;
                    float resolvedGuidePercent = layoutParams2.f438;
                    int i11 = Build.VERSION.SDK_INT;
                    if (resolvedGuidePercent != -1.0f) {
                        guideline.m2737(resolvedGuidePercent);
                    } else if (resolvedGuideBegin != i) {
                        guideline.m2745(resolvedGuideBegin);
                    } else if (resolvedGuideEnd != i) {
                        guideline.m2746(resolvedGuideEnd);
                    }
                } else if (!(layoutParams2.f390 == i && layoutParams2.f384 == i && layoutParams2.f387 == i && layoutParams2.f381 == i && layoutParams2.f403 == i && layoutParams2.f402 == i && layoutParams2.f404 == i && layoutParams2.f405 == i && layoutParams2.f442 == i && layoutParams2.f432 == i && layoutParams2.f436 == i && layoutParams2.f439 == i && layoutParams2.f440 == i && layoutParams2.f420 == i && layoutParams2.f421 == i && layoutParams2.f434 == i && ((ViewGroup.MarginLayoutParams) layoutParams2).width != i && ((ViewGroup.MarginLayoutParams) layoutParams2).height != i)) {
                    int resolvedLeftToLeft2 = layoutParams2.f423;
                    int resolvedLeftToRight = layoutParams2.f424;
                    int resolvedRightToLeft2 = layoutParams2.f425;
                    int resolvedRightToRight = layoutParams2.f426;
                    int resolveGoneLeftMargin = layoutParams2.f427;
                    int resolveGoneRightMargin2 = layoutParams2.f428;
                    float resolvedHorizontalBias = layoutParams2.f435;
                    int i12 = Build.VERSION.SDK_INT;
                    count = count2;
                    int count3 = layoutParams2.f434;
                    if (count3 != i) {
                        C0548 target5 = m243(count3);
                        if (target5 != null) {
                            helperCount = helperCount2;
                            widget2.m2684(target5, layoutParams2.f392, layoutParams2.f401);
                        } else {
                            helperCount = helperCount2;
                        }
                        layoutParams = layoutParams2;
                    } else {
                        helperCount = helperCount2;
                        if (resolvedLeftToLeft2 != -1) {
                            C0548 target6 = m243(resolvedLeftToLeft2);
                            if (target6 != null) {
                                C0544.EnumC0545 r5 = C0544.EnumC0545.LEFT;
                                resolveGoneRightMargin = resolveGoneRightMargin2;
                                resolvedLeftToLeft = resolvedRightToRight;
                                resolvedRightToLeft = resolvedRightToLeft2;
                                layoutParams = layoutParams2;
                                widget2.m2681(r5, target6, r5, ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, resolveGoneLeftMargin);
                            } else {
                                resolveGoneRightMargin = resolveGoneRightMargin2;
                                resolvedLeftToLeft = resolvedRightToRight;
                                resolvedRightToLeft = resolvedRightToLeft2;
                                layoutParams = layoutParams2;
                            }
                        } else {
                            resolveGoneRightMargin = resolveGoneRightMargin2;
                            resolvedLeftToLeft = resolvedRightToRight;
                            resolvedRightToLeft = resolvedRightToLeft2;
                            layoutParams = layoutParams2;
                            if (!(resolvedLeftToRight == -1 || (target4 = m243(resolvedLeftToRight)) == null)) {
                                widget2.m2681(C0544.EnumC0545.LEFT, target4, C0544.EnumC0545.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, resolveGoneLeftMargin);
                            }
                        }
                        if (resolvedRightToLeft != -1) {
                            C0548 target7 = m243(resolvedRightToLeft);
                            if (target7 != null) {
                                widget2.m2681(C0544.EnumC0545.RIGHT, target7, C0544.EnumC0545.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, resolveGoneRightMargin);
                            }
                        } else if (!(resolvedLeftToLeft == -1 || (target3 = m243(resolvedLeftToLeft)) == null)) {
                            C0544.EnumC0545 r12 = C0544.EnumC0545.RIGHT;
                            widget2.m2681(r12, target3, r12, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, resolveGoneRightMargin);
                        }
                        int i13 = layoutParams.f442;
                        if (i13 != -1) {
                            C0548 target8 = m243(i13);
                            if (target8 != null) {
                                C0544.EnumC0545 r122 = C0544.EnumC0545.TOP;
                                widget2.m2681(r122, target8, r122, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f400);
                            }
                        } else {
                            int i14 = layoutParams.f432;
                            if (!(i14 == -1 || (target2 = m243(i14)) == null)) {
                                widget2.m2681(C0544.EnumC0545.TOP, target2, C0544.EnumC0545.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f400);
                            }
                        }
                        int i15 = layoutParams.f436;
                        if (i15 != -1) {
                            C0548 target9 = m243(i15);
                            if (target9 != null) {
                                widget2.m2681(C0544.EnumC0545.BOTTOM, target9, C0544.EnumC0545.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f408);
                            }
                        } else {
                            int i16 = layoutParams.f439;
                            if (!(i16 == -1 || (target = m243(i16)) == null)) {
                                C0544.EnumC0545 r123 = C0544.EnumC0545.BOTTOM;
                                widget2.m2681(r123, target, r123, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f408);
                            }
                        }
                        int i17 = layoutParams.f440;
                        if (i17 != -1) {
                            View view2 = this.f373.get(i17);
                            C0548 target10 = m243(layoutParams.f440);
                            if (!(target10 == null || view2 == null || !(view2.getLayoutParams() instanceof C0054))) {
                                layoutParams.f388 = true;
                                ((C0054) view2.getLayoutParams()).f388 = true;
                                widget2.m2664(C0544.EnumC0545.BASELINE).m2620(target10.m2664(C0544.EnumC0545.BASELINE), 0, -1, C0544.EnumC0546.STRONG, 0, true);
                                widget2.m2664(C0544.EnumC0545.TOP).m2617();
                                widget2.m2664(C0544.EnumC0545.BOTTOM).m2617();
                            }
                        }
                        if (resolvedHorizontalBias >= 0.0f && resolvedHorizontalBias != 0.5f) {
                            widget2.m2670(resolvedHorizontalBias);
                        }
                        float f = layoutParams.f383;
                        if (f >= 0.0f && f != 0.5f) {
                            widget2.m2639(f);
                        }
                    }
                    if (isInEditMode && !(layoutParams.f420 == -1 && layoutParams.f421 == -1)) {
                        widget2.m2641(layoutParams.f420, layoutParams.f421);
                    }
                    if (layoutParams.f391) {
                        widget2.m2682(C0548.EnumC0549.FIXED);
                        widget2.m2703(((ViewGroup.MarginLayoutParams) layoutParams).width);
                    } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                        widget2.m2682(C0548.EnumC0549.MATCH_PARENT);
                        widget2.m2664(C0544.EnumC0545.LEFT).f2030 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        widget2.m2664(C0544.EnumC0545.RIGHT).f2030 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    } else {
                        widget2.m2682(C0548.EnumC0549.MATCH_CONSTRAINT);
                        widget2.m2703(0);
                    }
                    if (layoutParams.f385) {
                        widget2.m2655(C0548.EnumC0549.FIXED);
                        widget2.m2640(((ViewGroup.MarginLayoutParams) layoutParams).height);
                    } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                        widget2.m2655(C0548.EnumC0549.MATCH_PARENT);
                        widget2.m2664(C0544.EnumC0545.TOP).f2030 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        widget2.m2664(C0544.EnumC0545.BOTTOM).f2030 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    } else {
                        widget2.m2655(C0548.EnumC0549.MATCH_CONSTRAINT);
                        widget2.m2640(0);
                    }
                    String str = layoutParams.f397;
                    if (str != null) {
                        widget2.m2653(str);
                    }
                    widget2.m2649(layoutParams.f386);
                    widget2.m2628(layoutParams.f380);
                    widget2.m2629(layoutParams.f412);
                    widget2.m2699(layoutParams.f413);
                    widget2.m2674(layoutParams.f414, layoutParams.f416, layoutParams.f418, layoutParams.f441);
                    widget2.m2652(layoutParams.f415, layoutParams.f417, layoutParams.f419, layoutParams.f431);
                }
                count = count2;
                helperCount = helperCount2;
            }
            i7++;
            count2 = count;
            helperCount2 = helperCount;
            z = false;
            i = -1;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final C0548 m243(int id) {
        if (id == 0) {
            return this.f376;
        }
        View view = this.f373.get(id);
        if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f376;
        }
        if (view == null) {
            return null;
        }
        return ((C0054) view.getLayoutParams()).f398;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final C0548 m244(View view) {
        if (view == this) {
            return this.f376;
        }
        if (view == null) {
            return null;
        }
        return ((C0054) view.getLayoutParams()).f398;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m246(int parentWidthSpec, int parentHeightSpec) {
        int baseline;
        int childWidthMeasureSpec;
        int childWidthMeasureSpec2;
        int childHeightMeasureSpec;
        int heightPadding = getPaddingTop() + getPaddingBottom();
        int widthPadding = getPaddingLeft() + getPaddingRight();
        int widgetsCount = getChildCount();
        for (int i = 0; i < widgetsCount; i++) {
            View child = getChildAt(i);
            if (child.getVisibility() != 8) {
                C0054 params = (C0054) child.getLayoutParams();
                C0548 widget = params.f398;
                if (!params.f382 && !params.f443) {
                    widget.m2701(child.getVisibility());
                    int width = ((ViewGroup.MarginLayoutParams) params).width;
                    int height = ((ViewGroup.MarginLayoutParams) params).height;
                    boolean z = params.f391;
                    int didWrapMeasureWidth = 0;
                    boolean didWrapMeasureHeight = false;
                    if (z || params.f385 || (!z && params.f414 == 1) || ((ViewGroup.MarginLayoutParams) params).width == -1 || (!params.f385 && (params.f415 == 1 || ((ViewGroup.MarginLayoutParams) params).height == -1))) {
                        if (width == 0) {
                            childWidthMeasureSpec = 1;
                            childWidthMeasureSpec2 = ViewGroup.getChildMeasureSpec(parentWidthSpec, widthPadding, -2);
                        } else if (width == -1) {
                            childWidthMeasureSpec = 0;
                            childWidthMeasureSpec2 = ViewGroup.getChildMeasureSpec(parentWidthSpec, widthPadding, -1);
                        } else {
                            if (width == -2) {
                                didWrapMeasureWidth = 1;
                            }
                            childWidthMeasureSpec = didWrapMeasureWidth;
                            childWidthMeasureSpec2 = ViewGroup.getChildMeasureSpec(parentWidthSpec, widthPadding, width);
                        }
                        if (height == 0) {
                            didWrapMeasureHeight = true;
                            childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding, -2);
                        } else if (height == -1) {
                            childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding, -1);
                        } else {
                            if (height == -2) {
                                didWrapMeasureHeight = true;
                            }
                            childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding, height);
                        }
                        child.measure(childWidthMeasureSpec2, childHeightMeasureSpec);
                        widget.m2656(width == -2);
                        widget.m2685(height == -2);
                        width = child.getMeasuredWidth();
                        height = child.getMeasuredHeight();
                        didWrapMeasureWidth = childWidthMeasureSpec;
                    }
                    widget.m2703(width);
                    widget.m2640(height);
                    if (didWrapMeasureWidth != 0) {
                        widget.m2690(width);
                    }
                    if (didWrapMeasureHeight) {
                        widget.m2697(height);
                    }
                    if (params.f388 && (baseline = child.getBaseline()) != -1) {
                        widget.m2650(baseline);
                    }
                }
            }
        }
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public final void m234() {
        int widgetsCount = getChildCount();
        for (int i = 0; i < widgetsCount; i++) {
            View child = getChildAt(i);
            if (child instanceof C0570) {
                ((C0570) child).m2813();
            }
        }
        int helperCount = this.f374.size();
        if (helperCount > 0) {
            for (int i2 = 0; i2 < helperCount; i2++) {
                this.f374.get(i2).m2792();
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m238(int parentWidthSpec, int parentHeightSpec) {
        int i;
        int i2;
        int widgetsCount;
        int childWidthMeasureSpec;
        boolean resolveHeight;
        int childHeightMeasureSpec;
        int baseline;
        ConstraintLayout constraintLayout = this;
        int i3 = parentWidthSpec;
        int heightPadding = getPaddingTop() + getPaddingBottom();
        int widthPadding = getPaddingLeft() + getPaddingRight();
        int widgetsCount2 = getChildCount();
        int i4 = 0;
        while (true) {
            i = 8;
            if (i4 >= widgetsCount2) {
                break;
            }
            View child = constraintLayout.getChildAt(i4);
            if (child.getVisibility() != 8) {
                C0054 params = (C0054) child.getLayoutParams();
                C0548 widget = params.f398;
                if (!params.f382 && !params.f443) {
                    widget.m2701(child.getVisibility());
                    int width = ((ViewGroup.MarginLayoutParams) params).width;
                    int height = ((ViewGroup.MarginLayoutParams) params).height;
                    if (width == 0 || height == 0) {
                        widget.m2647().m2773();
                        widget.m2668().m2773();
                    } else {
                        boolean didWrapMeasureWidth = false;
                        boolean didWrapMeasureHeight = false;
                        if (width == -2) {
                            didWrapMeasureWidth = true;
                        }
                        int childWidthMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, widthPadding, width);
                        if (height == -2) {
                            didWrapMeasureHeight = true;
                        }
                        child.measure(childWidthMeasureSpec2, ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding, height));
                        widget.m2656(width == -2);
                        widget.m2685(height == -2);
                        int width2 = child.getMeasuredWidth();
                        int height2 = child.getMeasuredHeight();
                        widget.m2703(width2);
                        widget.m2640(height2);
                        if (didWrapMeasureWidth) {
                            widget.m2690(width2);
                        }
                        if (didWrapMeasureHeight) {
                            widget.m2697(height2);
                        }
                        if (params.f388 && (baseline = child.getBaseline()) != -1) {
                            widget.m2650(baseline);
                        }
                        if (params.f391 && params.f385) {
                            widget.m2647().m2770(width2);
                            widget.m2668().m2770(height2);
                        }
                    }
                }
            }
            i4++;
        }
        constraintLayout.f376.m2719();
        int i5 = 0;
        while (i5 < widgetsCount2) {
            View child2 = constraintLayout.getChildAt(i5);
            if (child2.getVisibility() == i) {
                widgetsCount = widgetsCount2;
                i2 = i5;
            } else {
                C0054 params2 = (C0054) child2.getLayoutParams();
                C0548 widget2 = params2.f398;
                if (params2.f382) {
                    widgetsCount = widgetsCount2;
                    i2 = i5;
                } else if (params2.f443) {
                    widgetsCount = widgetsCount2;
                    i2 = i5;
                } else {
                    widget2.m2701(child2.getVisibility());
                    int width3 = ((ViewGroup.MarginLayoutParams) params2).width;
                    int height3 = ((ViewGroup.MarginLayoutParams) params2).height;
                    if (width3 == 0 || height3 == 0) {
                        C0556 left = widget2.m2664(C0544.EnumC0545.LEFT).m2616();
                        C0556 right = widget2.m2664(C0544.EnumC0545.RIGHT).m2616();
                        boolean bothHorizontal = (widget2.m2664(C0544.EnumC0545.LEFT).m2614() == null || widget2.m2664(C0544.EnumC0545.RIGHT).m2614() == null) ? false : true;
                        C0556 top = widget2.m2664(C0544.EnumC0545.TOP).m2616();
                        widgetsCount = widgetsCount2;
                        C0556 bottom = widget2.m2664(C0544.EnumC0545.BOTTOM).m2616();
                        i2 = i5;
                        boolean bothVertical = (widget2.m2664(C0544.EnumC0545.TOP).m2614() == null || widget2.m2664(C0544.EnumC0545.BOTTOM).m2614() == null) ? false : true;
                        if (width3 != 0 || height3 != 0 || !bothHorizontal || !bothVertical) {
                            boolean didWrapMeasureWidth2 = false;
                            boolean didWrapMeasureHeight2 = false;
                            boolean resolveWidth = constraintLayout.f376.m2665() != C0548.EnumC0549.WRAP_CONTENT;
                            boolean resolveHeight2 = constraintLayout.f376.m2646() != C0548.EnumC0549.WRAP_CONTENT;
                            if (!resolveWidth) {
                                widget2.m2647().m2773();
                            }
                            if (!resolveHeight2) {
                                widget2.m2668().m2773();
                            }
                            if (width3 == 0) {
                                if (!resolveWidth || !widget2.m2707() || !bothHorizontal || !left.m2776() || !right.m2776()) {
                                    didWrapMeasureWidth2 = true;
                                    resolveWidth = false;
                                    childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(i3, widthPadding, -2);
                                } else {
                                    width3 = (int) (right.m2760() - left.m2760());
                                    widget2.m2647().m2770(width3);
                                    childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(i3, widthPadding, width3);
                                }
                            } else if (width3 == -1) {
                                childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(i3, widthPadding, -1);
                            } else {
                                if (width3 == -2) {
                                    didWrapMeasureWidth2 = true;
                                }
                                childWidthMeasureSpec = ViewGroup.getChildMeasureSpec(i3, widthPadding, width3);
                            }
                            if (height3 != 0) {
                                resolveHeight = resolveHeight2;
                                if (height3 == -1) {
                                    childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding, -1);
                                } else {
                                    if (height3 == -2) {
                                        didWrapMeasureHeight2 = true;
                                    }
                                    childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding, height3);
                                }
                            } else if (!resolveHeight2 || !widget2.m2625() || !bothVertical || !top.m2776() || !bottom.m2776()) {
                                didWrapMeasureHeight2 = true;
                                resolveHeight = false;
                                childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding, -2);
                            } else {
                                resolveHeight = resolveHeight2;
                                height3 = (int) (bottom.m2760() - top.m2760());
                                widget2.m2668().m2770(height3);
                                childHeightMeasureSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, heightPadding, height3);
                            }
                            child2.measure(childWidthMeasureSpec, childHeightMeasureSpec);
                            widget2.m2656(width3 == -2);
                            widget2.m2685(height3 == -2);
                            int width4 = child2.getMeasuredWidth();
                            int height4 = child2.getMeasuredHeight();
                            widget2.m2703(width4);
                            widget2.m2640(height4);
                            if (didWrapMeasureWidth2) {
                                widget2.m2690(width4);
                            }
                            if (didWrapMeasureHeight2) {
                                widget2.m2697(height4);
                            }
                            if (resolveWidth) {
                                widget2.m2647().m2770(width4);
                            } else {
                                widget2.m2647().m2768();
                            }
                            if (resolveHeight) {
                                widget2.m2668().m2770(height4);
                            } else {
                                widget2.m2668().m2768();
                            }
                            if (params2.f388) {
                                int baseline2 = child2.getBaseline();
                                if (baseline2 != -1) {
                                    widget2.m2650(baseline2);
                                }
                            }
                        }
                    } else {
                        widgetsCount = widgetsCount2;
                        i2 = i5;
                    }
                }
            }
            i5 = i2 + 1;
            constraintLayout = this;
            i3 = parentWidthSpec;
            widgetsCount2 = widgetsCount;
            i = 8;
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int REMEASURES_A;
        int REMEASURES_B;
        int childState;
        int startingWidth;
        int startingWidth2;
        boolean optimiseDimensions;
        boolean needSolverPass;
        boolean containerWrapWidth;
        int startingWidth3;
        int startingHeight;
        int widthSpec;
        int heightSpec;
        int baseline;
        ConstraintLayout constraintLayout = this;
        int i = widthMeasureSpec;
        System.currentTimeMillis();
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        constraintLayout.f376.m2692(paddingLeft);
        constraintLayout.f376.m2693(paddingTop);
        constraintLayout.f376.m2624(constraintLayout.f368);
        constraintLayout.f376.m2634(constraintLayout.f366);
        int i2 = Build.VERSION.SDK_INT;
        constraintLayout.f376.m2711(getLayoutDirection() == 1);
        m236(widthMeasureSpec, heightMeasureSpec);
        int startingWidth4 = constraintLayout.f376.m2700();
        int startingHeight2 = constraintLayout.f376.m2632();
        boolean runAnalyzer = false;
        if (constraintLayout.f371) {
            constraintLayout.f371 = false;
            m235();
            runAnalyzer = true;
        }
        boolean optimiseDimensions2 = (constraintLayout.f367 & 8) == 8;
        if (optimiseDimensions2) {
            constraintLayout.f376.m2724();
            constraintLayout.f376.m2708(startingWidth4, startingHeight2);
            m238(widthMeasureSpec, heightMeasureSpec);
        } else {
            m246(widthMeasureSpec, heightMeasureSpec);
        }
        m234();
        if (getChildCount() > 0 && runAnalyzer) {
            C0540.m2592(constraintLayout.f376);
        }
        C0550 r15 = constraintLayout.f376;
        if (r15.f2123) {
            REMEASURES_A = 0;
            if (r15.f2121 && widthMode == Integer.MIN_VALUE) {
                int i3 = r15.f2135;
                if (i3 < widthSize) {
                    r15.m2703(i3);
                }
                constraintLayout.f376.m2682(C0548.EnumC0549.FIXED);
            }
            C0550 r3 = constraintLayout.f376;
            if (r3.f2141 && heightMode == Integer.MIN_VALUE) {
                int i4 = r3.f2136;
                if (i4 < heightSize) {
                    r3.m2640(i4);
                }
                constraintLayout.f376.m2655(C0548.EnumC0549.FIXED);
            }
        } else {
            REMEASURES_A = 0;
        }
        if ((constraintLayout.f367 & 32) == 32) {
            int width = constraintLayout.f376.m2700();
            int height = constraintLayout.f376.m2632();
            if (constraintLayout.f379 == width || widthMode != 1073741824) {
                REMEASURES_B = 0;
            } else {
                REMEASURES_B = 0;
                C0540.m2589(constraintLayout.f376.f2125, 0, width);
            }
            if (constraintLayout.f378 != height && heightMode == 1073741824) {
                C0540.m2589(constraintLayout.f376.f2125, 1, height);
            }
            C0550 r6 = constraintLayout.f376;
            if (r6.f2121 && r6.f2135 > widthSize) {
                C0540.m2589(r6.f2125, 0, widthSize);
            }
            C0550 r62 = constraintLayout.f376;
            if (r62.f2141 && r62.f2136 > heightSize) {
                C0540.m2589(r62.f2125, 1, heightSize);
            }
        } else {
            REMEASURES_B = 0;
        }
        if (getChildCount() > 0) {
            m237();
        }
        int sizeDependentWidgetsCount = constraintLayout.f370.size();
        int heightPadding = getPaddingBottom() + paddingTop;
        int widthPadding = paddingLeft + getPaddingRight();
        if (sizeDependentWidgetsCount > 0) {
            boolean needSolverPass2 = false;
            boolean containerWrapWidth2 = constraintLayout.f376.m2665() == C0548.EnumC0549.WRAP_CONTENT;
            boolean containerWrapHeight = constraintLayout.f376.m2646() == C0548.EnumC0549.WRAP_CONTENT;
            int minWidth = Math.max(constraintLayout.f376.m2700(), constraintLayout.f372);
            int i5 = 0;
            childState = 0;
            int minHeight = Math.max(constraintLayout.f376.m2632(), constraintLayout.f369);
            int minWidth2 = minWidth;
            while (i5 < sizeDependentWidgetsCount) {
                C0548 widget = constraintLayout.f370.get(i5);
                View child = (View) widget.m2661();
                if (child == null) {
                    containerWrapWidth = containerWrapWidth2;
                    startingWidth3 = startingWidth4;
                    startingHeight = startingHeight2;
                } else {
                    startingHeight = startingHeight2;
                    C0054 params = (C0054) child.getLayoutParams();
                    startingWidth3 = startingWidth4;
                    if (params.f443) {
                        containerWrapWidth = containerWrapWidth2;
                    } else if (params.f382) {
                        containerWrapWidth = containerWrapWidth2;
                    } else if (child.getVisibility() == 8) {
                        containerWrapWidth = containerWrapWidth2;
                    } else if (!optimiseDimensions2 || !widget.m2647().m2776() || !widget.m2668().m2776()) {
                        if (((ViewGroup.MarginLayoutParams) params).width != -2 || !params.f391) {
                            widthSpec = View.MeasureSpec.makeMeasureSpec(widget.m2700(), 1073741824);
                        } else {
                            widthSpec = ViewGroup.getChildMeasureSpec(i, widthPadding, ((ViewGroup.MarginLayoutParams) params).width);
                        }
                        if (((ViewGroup.MarginLayoutParams) params).height != -2 || !params.f385) {
                            heightSpec = View.MeasureSpec.makeMeasureSpec(widget.m2632(), 1073741824);
                        } else {
                            heightSpec = ViewGroup.getChildMeasureSpec(heightMeasureSpec, heightPadding, ((ViewGroup.MarginLayoutParams) params).height);
                        }
                        child.measure(widthSpec, heightSpec);
                        REMEASURES_A++;
                        int measuredWidth = child.getMeasuredWidth();
                        int measuredHeight = child.getMeasuredHeight();
                        if (measuredWidth != widget.m2700()) {
                            widget.m2703(measuredWidth);
                            if (optimiseDimensions2) {
                                widget.m2647().m2770(measuredWidth);
                            }
                            if (!containerWrapWidth2 || widget.m2622() <= minWidth2) {
                                containerWrapWidth = containerWrapWidth2;
                            } else {
                                containerWrapWidth = containerWrapWidth2;
                                minWidth2 = Math.max(minWidth2, widget.m2622() + widget.m2664(C0544.EnumC0545.RIGHT).m2608());
                            }
                            needSolverPass2 = true;
                        } else {
                            containerWrapWidth = containerWrapWidth2;
                        }
                        if (measuredHeight != widget.m2632()) {
                            widget.m2640(measuredHeight);
                            if (optimiseDimensions2) {
                                widget.m2668().m2770(measuredHeight);
                            }
                            if (containerWrapHeight && widget.m2644() > minHeight) {
                                minHeight = Math.max(minHeight, widget.m2644() + widget.m2664(C0544.EnumC0545.BOTTOM).m2608());
                            }
                            needSolverPass2 = true;
                        }
                        if (!(!params.f388 || (baseline = child.getBaseline()) == -1 || baseline == widget.m2659())) {
                            widget.m2650(baseline);
                            needSolverPass2 = true;
                        }
                        int baseline2 = Build.VERSION.SDK_INT;
                        childState = ViewGroup.combineMeasuredStates(childState, child.getMeasuredState());
                    } else {
                        containerWrapWidth = containerWrapWidth2;
                    }
                }
                i5++;
                constraintLayout = this;
                i = widthMeasureSpec;
                paddingTop = paddingTop;
                sizeDependentWidgetsCount = sizeDependentWidgetsCount;
                startingHeight2 = startingHeight;
                startingWidth4 = startingWidth3;
                containerWrapWidth2 = containerWrapWidth;
            }
            int sizeDependentWidgetsCount2 = sizeDependentWidgetsCount;
            if (needSolverPass2) {
                constraintLayout = this;
                startingWidth = startingWidth4;
                constraintLayout.f376.m2703(startingWidth);
                constraintLayout.f376.m2640(startingHeight2);
                if (optimiseDimensions2) {
                    constraintLayout.f376.m2719();
                }
                m237();
                boolean needSolverPass3 = false;
                if (constraintLayout.f376.m2700() < minWidth2) {
                    constraintLayout.f376.m2703(minWidth2);
                    needSolverPass3 = true;
                }
                if (constraintLayout.f376.m2632() < minHeight) {
                    constraintLayout.f376.m2640(minHeight);
                    needSolverPass = true;
                } else {
                    needSolverPass = needSolverPass3;
                }
                if (needSolverPass) {
                    m237();
                }
            } else {
                constraintLayout = this;
                startingWidth = startingWidth4;
            }
            int i6 = 0;
            while (i6 < sizeDependentWidgetsCount2) {
                C0548 widget2 = constraintLayout.f370.get(i6);
                View child2 = (View) widget2.m2661();
                if (child2 == null) {
                    startingWidth2 = startingWidth;
                    optimiseDimensions = optimiseDimensions2;
                } else {
                    startingWidth2 = startingWidth;
                    if (child2.getMeasuredWidth() == widget2.m2700() && child2.getMeasuredHeight() == widget2.m2632()) {
                        optimiseDimensions = optimiseDimensions2;
                    } else if (widget2.m2698() != 8) {
                        optimiseDimensions = optimiseDimensions2;
                        child2.measure(View.MeasureSpec.makeMeasureSpec(widget2.m2700(), 1073741824), View.MeasureSpec.makeMeasureSpec(widget2.m2632(), 1073741824));
                        REMEASURES_B++;
                    } else {
                        optimiseDimensions = optimiseDimensions2;
                    }
                }
                i6++;
                sizeDependentWidgetsCount2 = sizeDependentWidgetsCount2;
                optimiseDimensions2 = optimiseDimensions;
                startingWidth = startingWidth2;
            }
        } else {
            childState = 0;
        }
        int i7 = Build.VERSION.SDK_INT;
        int resolvedWidthSize = Math.min(constraintLayout.f368, ViewGroup.resolveSizeAndState(constraintLayout.f376.m2700() + widthPadding, widthMeasureSpec, childState) & 16777215);
        int resolvedHeightSize = Math.min(constraintLayout.f366, ViewGroup.resolveSizeAndState(constraintLayout.f376.m2632() + heightPadding, heightMeasureSpec, childState << 16) & 16777215);
        if (constraintLayout.f376.m2729()) {
            resolvedWidthSize |= 16777216;
        }
        if (constraintLayout.f376.m2725()) {
            resolvedHeightSize |= 16777216;
        }
        constraintLayout.setMeasuredDimension(resolvedWidthSize, resolvedHeightSize);
        constraintLayout.f379 = resolvedWidthSize;
        constraintLayout.f378 = resolvedHeightSize;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m236(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = View.MeasureSpec.getSize(heightMeasureSpec);
        int heightPadding = getPaddingTop() + getPaddingBottom();
        int widthPadding = getPaddingLeft() + getPaddingRight();
        C0548.EnumC0549 widthBehaviour = C0548.EnumC0549.FIXED;
        C0548.EnumC0549 heightBehaviour = C0548.EnumC0549.FIXED;
        int desiredWidth = 0;
        int desiredHeight = 0;
        getLayoutParams();
        if (widthMode == Integer.MIN_VALUE) {
            widthBehaviour = C0548.EnumC0549.WRAP_CONTENT;
            desiredWidth = widthSize;
        } else if (widthMode == 0) {
            widthBehaviour = C0548.EnumC0549.WRAP_CONTENT;
        } else if (widthMode == 1073741824) {
            desiredWidth = Math.min(this.f368, widthSize) - widthPadding;
        }
        if (heightMode == Integer.MIN_VALUE) {
            heightBehaviour = C0548.EnumC0549.WRAP_CONTENT;
            desiredHeight = heightSize;
        } else if (heightMode == 0) {
            heightBehaviour = C0548.EnumC0549.WRAP_CONTENT;
        } else if (heightMode == 1073741824) {
            desiredHeight = Math.min(this.f366, heightSize) - heightPadding;
        }
        this.f376.m2695(0);
        this.f376.m2706(0);
        this.f376.m2682(widthBehaviour);
        this.f376.m2703(desiredWidth);
        this.f376.m2655(heightBehaviour);
        this.f376.m2640(desiredHeight);
        this.f376.m2695((this.f372 - getPaddingLeft()) - getPaddingRight());
        this.f376.m2706((this.f369 - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m237() {
        this.f376.m2722();
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        View content;
        int widgetsCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i = 0; i < widgetsCount; i++) {
            View child = getChildAt(i);
            C0054 params = (C0054) child.getLayoutParams();
            C0548 widget = params.f398;
            if ((child.getVisibility() != 8 || params.f382 || params.f443 || isInEditMode) && !params.f433) {
                int l = widget.m2637();
                int t = widget.m2626();
                int r = widget.m2700() + l;
                int b = widget.m2632() + t;
                child.layout(l, t, r, b);
                if ((child instanceof C0570) && (content = ((C0570) child).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(l, t, r, b);
                }
            }
        }
        int helperCount = this.f374.size();
        if (helperCount > 0) {
            for (int i2 = 0; i2 < helperCount; i2++) {
                this.f374.get(i2).m2793();
            }
        }
    }

    public void setOptimizationLevel(int level) {
        this.f376.m2721(level);
    }

    public int getOptimizationLevel() {
        return this.f376.m2720();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0054 generateLayoutParams(AttributeSet attrs) {
        return new C0054(getContext(), attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0054 generateDefaultLayoutParams() {
        return new C0054(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new C0054(p);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof C0054;
    }

    public void setConstraintSet(C0564 set) {
        this.f377 = set;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public View m239(int id) {
        return this.f373.get(id);
    }

    public void dispatchDraw(Canvas canvas) {
        float ow;
        float ch;
        float cw;
        int count;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int count2 = getChildCount();
            float cw2 = (float) getWidth();
            float ch2 = (float) getHeight();
            float ow2 = 1080.0f;
            int i = 0;
            while (i < count2) {
                View child = getChildAt(i);
                if (child.getVisibility() == 8) {
                    count = count2;
                    cw = cw2;
                    ch = ch2;
                    ow = ow2;
                } else {
                    Object tag = child.getTag();
                    if (tag == null || !(tag instanceof String)) {
                        count = count2;
                        cw = cw2;
                        ch = ch2;
                        ow = ow2;
                    } else {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int x = Integer.parseInt(split[0]);
                            int y = Integer.parseInt(split[1]);
                            int x2 = (int) ((((float) x) / ow2) * cw2);
                            int y2 = (int) ((((float) y) / 1920.0f) * ch2);
                            int w = (int) ((((float) Integer.parseInt(split[2])) / ow2) * cw2);
                            int h = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * ch2);
                            Paint paint = new Paint();
                            count = count2;
                            paint.setColor(-65536);
                            cw = cw2;
                            ch = ch2;
                            ow = ow2;
                            canvas.drawLine((float) x2, (float) y2, (float) (x2 + w), (float) y2, paint);
                            canvas.drawLine((float) (x2 + w), (float) y2, (float) (x2 + w), (float) (y2 + h), paint);
                            canvas.drawLine((float) (x2 + w), (float) (y2 + h), (float) x2, (float) (y2 + h), paint);
                            canvas.drawLine((float) x2, (float) (y2 + h), (float) x2, (float) y2, paint);
                            paint.setColor(-16711936);
                            canvas.drawLine((float) x2, (float) y2, (float) (x2 + w), (float) (y2 + h), paint);
                            canvas.drawLine((float) x2, (float) (y2 + h), (float) (x2 + w), (float) y2, paint);
                        } else {
                            count = count2;
                            cw = cw2;
                            ch = ch2;
                            ow = ow2;
                        }
                    }
                }
                i++;
                count2 = count;
                cw2 = cw;
                ch2 = ch;
                ow2 = ow;
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$θ  reason: contains not printable characters */
    public static class C0054 extends ViewGroup.MarginLayoutParams {

        /* renamed from: µ  reason: contains not printable characters */
        public float f380;

        /* renamed from: µ  reason: contains not printable characters and collision with other field name */
        public int f381;

        /* renamed from: µ  reason: contains not printable characters and collision with other field name */
        public boolean f382;

        /* renamed from: Ø  reason: contains not printable characters */
        public float f383;

        /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
        public int f384;

        /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
        public boolean f385;

        /* renamed from: ö  reason: contains not printable characters */
        public float f386;

        /* renamed from: ö  reason: contains not printable characters and collision with other field name */
        public int f387;

        /* renamed from: ö  reason: contains not printable characters and collision with other field name */
        public boolean f388;

        /* renamed from: ø  reason: contains not printable characters */
        public float f389;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public int f390;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public boolean f391;

        /* renamed from: Φ  reason: contains not printable characters */
        public float f392;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public int f393;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public boolean f394;

        /* renamed from: θ  reason: contains not printable characters */
        public float f395;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public int f396;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public String f397;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0548 f398;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f399;

        /* renamed from: Ё  reason: contains not printable characters */
        public int f400;

        /* renamed from: А  reason: contains not printable characters */
        public int f401;

        /* renamed from: Б  reason: contains not printable characters */
        public int f402;

        /* renamed from: В  reason: contains not printable characters */
        public int f403;

        /* renamed from: Г  reason: contains not printable characters */
        public int f404;

        /* renamed from: Д  reason: contains not printable characters */
        public int f405;

        /* renamed from: Е  reason: contains not printable characters */
        public int f406;

        /* renamed from: Ж  reason: contains not printable characters */
        public int f407;

        /* renamed from: З  reason: contains not printable characters */
        public int f408;

        /* renamed from: И  reason: contains not printable characters */
        public int f409;

        /* renamed from: Й  reason: contains not printable characters */
        public int f410;

        /* renamed from: К  reason: contains not printable characters */
        public int f411;

        /* renamed from: Л  reason: contains not printable characters */
        public int f412;

        /* renamed from: М  reason: contains not printable characters */
        public int f413;

        /* renamed from: Н  reason: contains not printable characters */
        public int f414;

        /* renamed from: О  reason: contains not printable characters */
        public int f415;

        /* renamed from: П  reason: contains not printable characters */
        public int f416;

        /* renamed from: Р  reason: contains not printable characters */
        public int f417;

        /* renamed from: С  reason: contains not printable characters */
        public int f418;

        /* renamed from: Т  reason: contains not printable characters */
        public int f419;

        /* renamed from: У  reason: contains not printable characters */
        public int f420;

        /* renamed from: Ф  reason: contains not printable characters */
        public int f421;

        /* renamed from: Х  reason: contains not printable characters */
        public int f422;

        /* renamed from: Ц  reason: contains not printable characters */
        public int f423;

        /* renamed from: Ч  reason: contains not printable characters */
        public int f424;

        /* renamed from: Ш  reason: contains not printable characters */
        public int f425;

        /* renamed from: Щ  reason: contains not printable characters */
        public int f426;

        /* renamed from: Ъ  reason: contains not printable characters */
        public int f427;

        /* renamed from: Ы  reason: contains not printable characters */
        public int f428;

        /* renamed from: Ь  reason: contains not printable characters */
        public int f429;

        /* renamed from: Э  reason: contains not printable characters */
        public int f430;

        /* renamed from: ฿  reason: contains not printable characters */
        public float f431;

        /* renamed from: ฿  reason: contains not printable characters and collision with other field name */
        public int f432;

        /* renamed from: ฿  reason: contains not printable characters and collision with other field name */
        public boolean f433;

        /* renamed from: ₢  reason: contains not printable characters */
        public int f434;

        /* renamed from: ₣  reason: contains not printable characters */
        public float f435;

        /* renamed from: ₣  reason: contains not printable characters and collision with other field name */
        public int f436;

        /* renamed from: ₣  reason: contains not printable characters and collision with other field name */
        public boolean f437;

        /* renamed from: ₤  reason: contains not printable characters */
        public float f438;

        /* renamed from: ₤  reason: contains not printable characters and collision with other field name */
        public int f439;

        /* renamed from: ₧  reason: contains not printable characters */
        public int f440;

        /* renamed from: ₩  reason: contains not printable characters */
        public float f441;

        /* renamed from: ₩  reason: contains not printable characters and collision with other field name */
        public int f442;

        /* renamed from: ₩  reason: contains not printable characters and collision with other field name */
        public boolean f443;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$θ$θ  reason: contains not printable characters */
        public static class C0055 {

            /* renamed from: θ  reason: contains not printable characters */
            public static final SparseIntArray f444 = new SparseIntArray();

            static {
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f444.append(C0572.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f444.append(C0572.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f444.append(C0572.ConstraintLayout_Layout_android_orientation, 1);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f444.append(C0572.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f444.append(C0572.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f444.append(C0572.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f444.append(C0572.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f444.append(C0572.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f444.append(C0572.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f444.append(C0572.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f444.append(C0572.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f444.append(C0572.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public C0054(Context c, AttributeSet attrs) {
            super(c, attrs);
            int commaIndex;
            int i = -1;
            this.f396 = -1;
            this.f393 = -1;
            this.f395 = -1.0f;
            this.f390 = -1;
            this.f384 = -1;
            this.f387 = -1;
            this.f381 = -1;
            this.f442 = -1;
            this.f432 = -1;
            this.f436 = -1;
            this.f439 = -1;
            this.f440 = -1;
            this.f434 = -1;
            int i2 = 0;
            this.f401 = 0;
            this.f392 = 0.0f;
            this.f402 = -1;
            this.f403 = -1;
            this.f404 = -1;
            this.f405 = -1;
            this.f406 = -1;
            this.f400 = -1;
            this.f407 = -1;
            this.f408 = -1;
            this.f409 = -1;
            this.f410 = -1;
            this.f389 = 0.5f;
            this.f383 = 0.5f;
            this.f397 = null;
            this.f411 = 1;
            this.f386 = -1.0f;
            this.f380 = -1.0f;
            this.f412 = 0;
            this.f413 = 0;
            this.f414 = 0;
            this.f415 = 0;
            this.f416 = 0;
            this.f417 = 0;
            this.f418 = 0;
            this.f419 = 0;
            this.f441 = 1.0f;
            this.f431 = 1.0f;
            this.f420 = -1;
            this.f421 = -1;
            this.f422 = -1;
            this.f399 = false;
            this.f394 = false;
            this.f391 = true;
            this.f385 = true;
            this.f388 = false;
            this.f382 = false;
            this.f443 = false;
            this.f433 = false;
            this.f423 = -1;
            this.f424 = -1;
            this.f425 = -1;
            this.f426 = -1;
            this.f427 = -1;
            this.f428 = -1;
            this.f435 = 0.5f;
            this.f398 = new C0548();
            this.f437 = false;
            TypedArray a = c.obtainStyledAttributes(attrs, C0572.ConstraintLayout_Layout);
            int N = a.getIndexCount();
            int i3 = 0;
            while (i3 < N) {
                int attr = a.getIndex(i3);
                switch (C0055.f444.get(attr)) {
                    case 1:
                        this.f422 = a.getInt(attr, this.f422);
                        break;
                    case 2:
                        this.f434 = a.getResourceId(attr, this.f434);
                        if (this.f434 != -1) {
                            break;
                        } else {
                            this.f434 = a.getInt(attr, -1);
                            break;
                        }
                    case 3:
                        this.f401 = a.getDimensionPixelSize(attr, this.f401);
                        break;
                    case 4:
                        this.f392 = a.getFloat(attr, this.f392) % 360.0f;
                        float f = this.f392;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f392 = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f396 = a.getDimensionPixelOffset(attr, this.f396);
                        break;
                    case 6:
                        this.f393 = a.getDimensionPixelOffset(attr, this.f393);
                        break;
                    case 7:
                        this.f395 = a.getFloat(attr, this.f395);
                        break;
                    case 8:
                        this.f390 = a.getResourceId(attr, this.f390);
                        if (this.f390 != -1) {
                            break;
                        } else {
                            this.f390 = a.getInt(attr, -1);
                            break;
                        }
                    case 9:
                        this.f384 = a.getResourceId(attr, this.f384);
                        if (this.f384 != -1) {
                            break;
                        } else {
                            this.f384 = a.getInt(attr, -1);
                            break;
                        }
                    case 10:
                        this.f387 = a.getResourceId(attr, this.f387);
                        if (this.f387 != -1) {
                            break;
                        } else {
                            this.f387 = a.getInt(attr, -1);
                            break;
                        }
                    case 11:
                        this.f381 = a.getResourceId(attr, this.f381);
                        if (this.f381 != -1) {
                            break;
                        } else {
                            this.f381 = a.getInt(attr, -1);
                            break;
                        }
                    case 12:
                        this.f442 = a.getResourceId(attr, this.f442);
                        if (this.f442 != -1) {
                            break;
                        } else {
                            this.f442 = a.getInt(attr, -1);
                            break;
                        }
                    case 13:
                        this.f432 = a.getResourceId(attr, this.f432);
                        if (this.f432 != -1) {
                            break;
                        } else {
                            this.f432 = a.getInt(attr, -1);
                            break;
                        }
                    case 14:
                        this.f436 = a.getResourceId(attr, this.f436);
                        if (this.f436 != -1) {
                            break;
                        } else {
                            this.f436 = a.getInt(attr, -1);
                            break;
                        }
                    case 15:
                        this.f439 = a.getResourceId(attr, this.f439);
                        if (this.f439 != -1) {
                            break;
                        } else {
                            this.f439 = a.getInt(attr, -1);
                            break;
                        }
                    case 16:
                        this.f440 = a.getResourceId(attr, this.f440);
                        if (this.f440 != -1) {
                            break;
                        } else {
                            this.f440 = a.getInt(attr, -1);
                            break;
                        }
                    case 17:
                        this.f402 = a.getResourceId(attr, this.f402);
                        if (this.f402 != -1) {
                            break;
                        } else {
                            this.f402 = a.getInt(attr, -1);
                            break;
                        }
                    case 18:
                        this.f403 = a.getResourceId(attr, this.f403);
                        if (this.f403 != -1) {
                            break;
                        } else {
                            this.f403 = a.getInt(attr, -1);
                            break;
                        }
                    case 19:
                        this.f404 = a.getResourceId(attr, this.f404);
                        if (this.f404 != -1) {
                            break;
                        } else {
                            this.f404 = a.getInt(attr, -1);
                            break;
                        }
                    case 20:
                        this.f405 = a.getResourceId(attr, this.f405);
                        if (this.f405 != -1) {
                            break;
                        } else {
                            this.f405 = a.getInt(attr, -1);
                            break;
                        }
                    case 21:
                        this.f406 = a.getDimensionPixelSize(attr, this.f406);
                        break;
                    case 22:
                        this.f400 = a.getDimensionPixelSize(attr, this.f400);
                        break;
                    case 23:
                        this.f407 = a.getDimensionPixelSize(attr, this.f407);
                        break;
                    case 24:
                        this.f408 = a.getDimensionPixelSize(attr, this.f408);
                        break;
                    case 25:
                        this.f409 = a.getDimensionPixelSize(attr, this.f409);
                        break;
                    case 26:
                        this.f410 = a.getDimensionPixelSize(attr, this.f410);
                        break;
                    case 27:
                        this.f399 = a.getBoolean(attr, this.f399);
                        break;
                    case 28:
                        this.f394 = a.getBoolean(attr, this.f394);
                        break;
                    case 29:
                        this.f389 = a.getFloat(attr, this.f389);
                        break;
                    case 30:
                        this.f383 = a.getFloat(attr, this.f383);
                        break;
                    case 31:
                        this.f414 = a.getInt(attr, 0);
                        if (this.f414 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        this.f415 = a.getInt(attr, 0);
                        if (this.f415 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f416 = a.getDimensionPixelSize(attr, this.f416);
                            break;
                        } catch (Exception e) {
                            if (a.getInt(attr, this.f416) == -2) {
                                this.f416 = -2;
                            }
                            break;
                        }
                    case 34:
                        try {
                            this.f418 = a.getDimensionPixelSize(attr, this.f418);
                            break;
                        } catch (Exception e2) {
                            if (a.getInt(attr, this.f418) == -2) {
                                this.f418 = -2;
                            }
                            break;
                        }
                    case 35:
                        this.f441 = Math.max(0.0f, a.getFloat(attr, this.f441));
                        break;
                    case 36:
                        try {
                            this.f417 = a.getDimensionPixelSize(attr, this.f417);
                            break;
                        } catch (Exception e3) {
                            if (a.getInt(attr, this.f417) == -2) {
                                this.f417 = -2;
                            }
                            break;
                        }
                    case 37:
                        try {
                            this.f419 = a.getDimensionPixelSize(attr, this.f419);
                            break;
                        } catch (Exception e4) {
                            if (a.getInt(attr, this.f419) == -2) {
                                this.f419 = -2;
                            }
                            break;
                        }
                    case 38:
                        this.f431 = Math.max(0.0f, a.getFloat(attr, this.f431));
                        break;
                    case 44:
                        this.f397 = a.getString(attr);
                        this.f411 = i;
                        String str = this.f397;
                        if (str == null) {
                            break;
                        } else {
                            int len = str.length();
                            int commaIndex2 = this.f397.indexOf(44);
                            if (commaIndex2 <= 0 || commaIndex2 >= len - 1) {
                                commaIndex = 0;
                            } else {
                                String dimension = this.f397.substring(i2, commaIndex2);
                                if (dimension.equalsIgnoreCase("W")) {
                                    this.f411 = i2;
                                } else if (dimension.equalsIgnoreCase("H")) {
                                    this.f411 = 1;
                                }
                                commaIndex = commaIndex2 + 1;
                            }
                            int colonIndex = this.f397.indexOf(58);
                            if (colonIndex < 0 || colonIndex >= len - 1) {
                                String r = this.f397.substring(commaIndex);
                                if (r.length() > 0) {
                                    try {
                                        Float.parseFloat(r);
                                    } catch (NumberFormatException e5) {
                                    }
                                }
                            } else {
                                String nominator = this.f397.substring(commaIndex, colonIndex);
                                String denominator = this.f397.substring(colonIndex + 1);
                                if (nominator.length() > 0 && denominator.length() > 0) {
                                    try {
                                        float nominatorValue = Float.parseFloat(nominator);
                                        float denominatorValue = Float.parseFloat(denominator);
                                        if (nominatorValue > 0.0f && denominatorValue > 0.0f) {
                                            if (this.f411 == 1) {
                                                Math.abs(denominatorValue / nominatorValue);
                                            } else {
                                                Math.abs(nominatorValue / denominatorValue);
                                            }
                                        }
                                    } catch (NumberFormatException e6) {
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    case 45:
                        this.f386 = a.getFloat(attr, this.f386);
                        break;
                    case 46:
                        this.f380 = a.getFloat(attr, this.f380);
                        break;
                    case 47:
                        this.f412 = a.getInt(attr, i2);
                        break;
                    case 48:
                        this.f413 = a.getInt(attr, i2);
                        break;
                    case 49:
                        this.f420 = a.getDimensionPixelOffset(attr, this.f420);
                        break;
                    case 50:
                        this.f421 = a.getDimensionPixelOffset(attr, this.f421);
                        break;
                }
                i3++;
                i = -1;
                i2 = 0;
            }
            a.recycle();
            m249();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m249() {
            this.f382 = false;
            this.f391 = true;
            this.f385 = true;
            if (((ViewGroup.MarginLayoutParams) this).width == -2 && this.f399) {
                this.f391 = false;
                this.f414 = 1;
            }
            if (((ViewGroup.MarginLayoutParams) this).height == -2 && this.f394) {
                this.f385 = false;
                this.f415 = 1;
            }
            if (((ViewGroup.MarginLayoutParams) this).width == 0 || ((ViewGroup.MarginLayoutParams) this).width == -1) {
                this.f391 = false;
                if (((ViewGroup.MarginLayoutParams) this).width == 0 && this.f414 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f399 = true;
                }
            }
            if (((ViewGroup.MarginLayoutParams) this).height == 0 || ((ViewGroup.MarginLayoutParams) this).height == -1) {
                this.f385 = false;
                if (((ViewGroup.MarginLayoutParams) this).height == 0 && this.f415 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f394 = true;
                }
            }
            if (this.f395 != -1.0f || this.f396 != -1 || this.f393 != -1) {
                this.f382 = true;
                this.f391 = true;
                this.f385 = true;
                if (!(this.f398 instanceof C0552)) {
                    this.f398 = new C0552();
                }
                ((C0552) this.f398).m2747(this.f422);
            }
        }

        public C0054(int width, int height) {
            super(width, height);
            this.f396 = -1;
            this.f393 = -1;
            this.f395 = -1.0f;
            this.f390 = -1;
            this.f384 = -1;
            this.f387 = -1;
            this.f381 = -1;
            this.f442 = -1;
            this.f432 = -1;
            this.f436 = -1;
            this.f439 = -1;
            this.f440 = -1;
            this.f434 = -1;
            this.f401 = 0;
            this.f392 = 0.0f;
            this.f402 = -1;
            this.f403 = -1;
            this.f404 = -1;
            this.f405 = -1;
            this.f406 = -1;
            this.f400 = -1;
            this.f407 = -1;
            this.f408 = -1;
            this.f409 = -1;
            this.f410 = -1;
            this.f389 = 0.5f;
            this.f383 = 0.5f;
            this.f397 = null;
            this.f411 = 1;
            this.f386 = -1.0f;
            this.f380 = -1.0f;
            this.f412 = 0;
            this.f413 = 0;
            this.f414 = 0;
            this.f415 = 0;
            this.f416 = 0;
            this.f417 = 0;
            this.f418 = 0;
            this.f419 = 0;
            this.f441 = 1.0f;
            this.f431 = 1.0f;
            this.f420 = -1;
            this.f421 = -1;
            this.f422 = -1;
            this.f399 = false;
            this.f394 = false;
            this.f391 = true;
            this.f385 = true;
            this.f388 = false;
            this.f382 = false;
            this.f443 = false;
            this.f433 = false;
            this.f423 = -1;
            this.f424 = -1;
            this.f425 = -1;
            this.f426 = -1;
            this.f427 = -1;
            this.f428 = -1;
            this.f435 = 0.5f;
            this.f398 = new C0548();
            this.f437 = false;
        }

        public C0054(ViewGroup.LayoutParams source) {
            super(source);
            this.f396 = -1;
            this.f393 = -1;
            this.f395 = -1.0f;
            this.f390 = -1;
            this.f384 = -1;
            this.f387 = -1;
            this.f381 = -1;
            this.f442 = -1;
            this.f432 = -1;
            this.f436 = -1;
            this.f439 = -1;
            this.f440 = -1;
            this.f434 = -1;
            this.f401 = 0;
            this.f392 = 0.0f;
            this.f402 = -1;
            this.f403 = -1;
            this.f404 = -1;
            this.f405 = -1;
            this.f406 = -1;
            this.f400 = -1;
            this.f407 = -1;
            this.f408 = -1;
            this.f409 = -1;
            this.f410 = -1;
            this.f389 = 0.5f;
            this.f383 = 0.5f;
            this.f397 = null;
            this.f411 = 1;
            this.f386 = -1.0f;
            this.f380 = -1.0f;
            this.f412 = 0;
            this.f413 = 0;
            this.f414 = 0;
            this.f415 = 0;
            this.f416 = 0;
            this.f417 = 0;
            this.f418 = 0;
            this.f419 = 0;
            this.f441 = 1.0f;
            this.f431 = 1.0f;
            this.f420 = -1;
            this.f421 = -1;
            this.f422 = -1;
            this.f399 = false;
            this.f394 = false;
            this.f391 = true;
            this.f385 = true;
            this.f388 = false;
            this.f382 = false;
            this.f443 = false;
            this.f433 = false;
            this.f423 = -1;
            this.f424 = -1;
            this.f425 = -1;
            this.f426 = -1;
            this.f427 = -1;
            this.f428 = -1;
            this.f435 = 0.5f;
            this.f398 = new C0548();
            this.f437 = false;
        }

        @TargetApi(17)
        public void resolveLayoutDirection(int layoutDirection) {
            int preLeftMargin = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int preRightMargin = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(layoutDirection);
            this.f425 = -1;
            this.f426 = -1;
            this.f423 = -1;
            this.f424 = -1;
            this.f427 = -1;
            this.f428 = -1;
            this.f427 = this.f406;
            this.f428 = this.f407;
            this.f435 = this.f389;
            this.f429 = this.f396;
            this.f430 = this.f393;
            this.f438 = this.f395;
            if (1 == getLayoutDirection()) {
                boolean startEndDefined = false;
                int i = this.f402;
                if (i != -1) {
                    this.f425 = i;
                    startEndDefined = true;
                } else {
                    int i2 = this.f403;
                    if (i2 != -1) {
                        this.f426 = i2;
                        startEndDefined = true;
                    }
                }
                int i3 = this.f404;
                if (i3 != -1) {
                    this.f424 = i3;
                    startEndDefined = true;
                }
                int i4 = this.f405;
                if (i4 != -1) {
                    this.f423 = i4;
                    startEndDefined = true;
                }
                int i5 = this.f409;
                if (i5 != -1) {
                    this.f428 = i5;
                }
                int i6 = this.f410;
                if (i6 != -1) {
                    this.f427 = i6;
                }
                if (startEndDefined) {
                    this.f435 = 1.0f - this.f389;
                }
                if (this.f382 && this.f422 == 1) {
                    float f = this.f395;
                    if (f != -1.0f) {
                        this.f438 = 1.0f - f;
                        this.f429 = -1;
                        this.f430 = -1;
                    } else {
                        int i7 = this.f396;
                        if (i7 != -1) {
                            this.f430 = i7;
                            this.f429 = -1;
                            this.f438 = -1.0f;
                        } else {
                            int i8 = this.f393;
                            if (i8 != -1) {
                                this.f429 = i8;
                                this.f430 = -1;
                                this.f438 = -1.0f;
                            }
                        }
                    }
                }
            } else {
                int i9 = this.f402;
                if (i9 != -1) {
                    this.f424 = i9;
                }
                int i10 = this.f403;
                if (i10 != -1) {
                    this.f423 = i10;
                }
                int i11 = this.f404;
                if (i11 != -1) {
                    this.f425 = i11;
                }
                int i12 = this.f405;
                if (i12 != -1) {
                    this.f426 = i12;
                }
                int i13 = this.f409;
                if (i13 != -1) {
                    this.f427 = i13;
                }
                int i14 = this.f410;
                if (i14 != -1) {
                    this.f428 = i14;
                }
            }
            if (this.f404 == -1 && this.f405 == -1 && this.f403 == -1 && this.f402 == -1) {
                int i15 = this.f387;
                if (i15 != -1) {
                    this.f425 = i15;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && preRightMargin > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = preRightMargin;
                    }
                } else {
                    int i16 = this.f381;
                    if (i16 != -1) {
                        this.f426 = i16;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && preRightMargin > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = preRightMargin;
                        }
                    }
                }
                int i17 = this.f390;
                if (i17 != -1) {
                    this.f423 = i17;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && preLeftMargin > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = preLeftMargin;
                        return;
                    }
                    return;
                }
                int i18 = this.f384;
                if (i18 != -1) {
                    this.f424 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 && preLeftMargin > 0) {
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = preLeftMargin;
                    }
                }
            }
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f371 = true;
        this.f379 = -1;
        this.f378 = -1;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
