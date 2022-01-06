package ♫;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: ♫.有  reason: contains not printable characters */
public class C0461 extends ViewGroup {

    /* renamed from: µ  reason: contains not printable characters */
    public int f1707;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1708;

    /* renamed from: ö  reason: contains not printable characters */
    public int f1709;

    /* renamed from: ø  reason: contains not printable characters */
    public int f1710;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f1711;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1712;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1713;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public int[] f1714;

    /* renamed from: θ  reason: contains not printable characters */
    public float f1715;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f1716;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f1717;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int[] f1718;

    /* renamed from: ฿  reason: contains not printable characters */
    public int f1719;

    /* renamed from: ₣  reason: contains not printable characters */
    public int f1720;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f1721;

    public C0461(Context context) {
        this(context, null);
    }

    public C0461(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public C0461(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f1713 = true;
        this.f1716 = -1;
        this.f1712 = 0;
        this.f1708 = 8388659;
        C0488 a = C0488.m2290(context, attrs, C0291.LinearLayoutCompat, defStyleAttr, 0);
        int index = a.m2292(C0291.LinearLayoutCompat_android_orientation, -1);
        if (index >= 0) {
            setOrientation(index);
        }
        int index2 = a.m2292(C0291.LinearLayoutCompat_android_gravity, -1);
        if (index2 >= 0) {
            setGravity(index2);
        }
        boolean baselineAligned = a.m2306(C0291.LinearLayoutCompat_android_baselineAligned, true);
        if (!baselineAligned) {
            setBaselineAligned(baselineAligned);
        }
        this.f1715 = a.m2297(C0291.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1716 = a.m2292(C0291.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1711 = a.m2306(C0291.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.m2301(C0291.LinearLayoutCompat_divider));
        this.f1719 = a.m2292(C0291.LinearLayoutCompat_showDividers, 0);
        this.f1720 = a.m2294(C0291.LinearLayoutCompat_dividerPadding, 0);
        a.m2304();
    }

    public void setShowDividers(int showDividers) {
        if (showDividers != this.f1719) {
            requestLayout();
        }
        this.f1719 = showDividers;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.f1719;
    }

    public Drawable getDividerDrawable() {
        return this.f1717;
    }

    public void setDividerDrawable(Drawable divider) {
        if (divider != this.f1717) {
            this.f1717 = divider;
            boolean z = false;
            if (divider != null) {
                this.f1707 = divider.getIntrinsicWidth();
                this.f1721 = divider.getIntrinsicHeight();
            } else {
                this.f1707 = 0;
                this.f1721 = 0;
            }
            if (divider == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int padding) {
        this.f1720 = padding;
    }

    public int getDividerPadding() {
        return this.f1720;
    }

    public int getDividerWidth() {
        return this.f1707;
    }

    public void onDraw(Canvas canvas) {
        if (this.f1717 != null) {
            if (this.f1710 == 1) {
                m2185(canvas);
            } else {
                m2195(canvas);
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2185(Canvas canvas) {
        int bottom;
        int count = getVirtualChildCount();
        for (int i = 0; i < count; i++) {
            View child = m2189(i);
            if (!(child == null || child.getVisibility() == 8 || !m2198(i))) {
                m2196(canvas, (child.getTop() - ((ViewGroup.MarginLayoutParams) ((C0462) child.getLayoutParams())).topMargin) - this.f1721);
            }
        }
        if (m2198(count)) {
            View child2 = m2189(count - 1);
            if (child2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f1721;
            } else {
                bottom = child2.getBottom() + ((ViewGroup.MarginLayoutParams) ((C0462) child2.getLayoutParams())).bottomMargin;
            }
            m2196(canvas, bottom);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2195(Canvas canvas) {
        int position;
        int position2;
        int count = getVirtualChildCount();
        boolean isLayoutRtl = C0498.m2371((View) this);
        for (int i = 0; i < count; i++) {
            View child = m2189(i);
            if (!(child == null || child.getVisibility() == 8 || !m2198(i))) {
                C0462 lp = (C0462) child.getLayoutParams();
                if (isLayoutRtl) {
                    position2 = child.getRight() + ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                } else {
                    position2 = (child.getLeft() - ((ViewGroup.MarginLayoutParams) lp).leftMargin) - this.f1707;
                }
                m2186(canvas, position2);
            }
        }
        if (m2198(count)) {
            View child2 = m2189(count - 1);
            if (child2 != null) {
                C0462 lp2 = (C0462) child2.getLayoutParams();
                if (isLayoutRtl) {
                    position = (child2.getLeft() - ((ViewGroup.MarginLayoutParams) lp2).leftMargin) - this.f1707;
                } else {
                    position = child2.getRight() + ((ViewGroup.MarginLayoutParams) lp2).rightMargin;
                }
            } else if (isLayoutRtl) {
                position = getPaddingLeft();
            } else {
                position = (getWidth() - getPaddingRight()) - this.f1707;
            }
            m2186(canvas, position);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2196(Canvas canvas, int top) {
        this.f1717.setBounds(getPaddingLeft() + this.f1720, top, (getWidth() - getPaddingRight()) - this.f1720, this.f1721 + top);
        this.f1717.draw(canvas);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2186(Canvas canvas, int left) {
        this.f1717.setBounds(left, getPaddingTop() + this.f1720, this.f1707 + left, (getHeight() - getPaddingBottom()) - this.f1720);
        this.f1717.draw(canvas);
    }

    public void setBaselineAligned(boolean baselineAligned) {
        this.f1713 = baselineAligned;
    }

    public void setMeasureWithLargestChildEnabled(boolean enabled) {
        this.f1711 = enabled;
    }

    public int getBaseline() {
        int majorGravity;
        if (this.f1716 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.f1716;
        if (childCount > i) {
            View child = getChildAt(i);
            int childBaseline = child.getBaseline();
            if (childBaseline != -1) {
                int childTop = this.f1712;
                if (this.f1710 == 1 && (majorGravity = this.f1708 & C0291.AppCompatTheme_windowActionBarOverlay) != 48) {
                    if (majorGravity == 16) {
                        childTop += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1709) / 2;
                    } else if (majorGravity == 80) {
                        childTop = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1709;
                    }
                }
                return ((ViewGroup.MarginLayoutParams) ((C0462) child.getLayoutParams())).topMargin + childTop + childBaseline;
            } else if (this.f1716 == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1716;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f1716 = i;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public View m2189(int index) {
        return getChildAt(index);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1715;
    }

    public void setWeightSum(float weightSum) {
        this.f1715 = Math.max(0.0f, weightSum);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f1710 == 1) {
            m2179(widthMeasureSpec, heightMeasureSpec);
        } else {
            m2181(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2198(int childIndex) {
        if (childIndex == 0) {
            if ((this.f1719 & 1) != 0) {
                return true;
            }
            return false;
        } else if (childIndex == getChildCount()) {
            if ((this.f1719 & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f1719 & 2) == 0) {
            return false;
        } else {
            for (int i = childIndex - 1; i >= 0; i--) {
                if (getChildAt(i).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: Multiple debug info for r12v2 int: [D('largestChildHeight' int), D('heightMode' int)] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* renamed from: Ø  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m2179(int r37, int r38) {
        /*
        // Method dump skipped, instructions count: 1084
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0461.m2179(int, int):void");
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2183(int count, int heightMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i = 0; i < count; i++) {
            View child = m2189(i);
            if (child.getVisibility() != 8) {
                C0462 lp = (C0462) child.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) lp).width == -1) {
                    int oldHeight = ((ViewGroup.MarginLayoutParams) lp).height;
                    ((ViewGroup.MarginLayoutParams) lp).height = child.getMeasuredHeight();
                    measureChildWithMargins(child, uniformMeasureSpec, 0, heightMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) lp).height = oldHeight;
                }
            }
        }
    }

    /* JADX INFO: Multiple debug info for r13v1 boolean: [D('matchHeight' boolean), D('useLargestChild' boolean)] */
    /* JADX INFO: Multiple debug info for r3v3 int: [D('maxHeight' int), D('largestChildWidth' int)] */
    /* JADX INFO: Multiple debug info for r2v2 int: [D('alternativeMaxHeight' int), D('maxHeight' int)] */
    /* JADX INFO: Multiple debug info for r0v40 int: [D('childState' int), D('totalLength' int)] */
    /* JADX INFO: Multiple debug info for r2v39 int: [D('maxHeight' int), D('totalLength' int)] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x05ef  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x05f7  */
    /* renamed from: ø  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m2181(int r47, int r48) {
        /*
        // Method dump skipped, instructions count: 1532
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0461.m2181(int, int):void");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2193(int count, int widthMeasureSpec) {
        int uniformMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i = 0; i < count; i++) {
            View child = m2189(i);
            if (child.getVisibility() != 8) {
                C0462 lp = (C0462) child.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) lp).height == -1) {
                    int oldWidth = ((ViewGroup.MarginLayoutParams) lp).width;
                    ((ViewGroup.MarginLayoutParams) lp).width = child.getMeasuredWidth();
                    measureChildWithMargins(child, widthMeasureSpec, 0, uniformMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) lp).width = oldWidth;
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2188() {
        return 0;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public int m2178() {
        return 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2197(View child, int widthMeasureSpec, int totalWidth, int heightMeasureSpec, int totalHeight) {
        measureChildWithMargins(child, widthMeasureSpec, totalWidth, heightMeasureSpec, totalHeight);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public int m2182() {
        return 0;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public int m2180() {
        return 0;
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        if (this.f1710 == 1) {
            m2184(l, t, r, b);
        } else {
            m2194(l, t, r, b);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2184(int left, int top, int right, int bottom) {
        int childTop;
        int gravity;
        int childLeft;
        C0461 r6 = this;
        int paddingLeft = getPaddingLeft();
        int width = right - left;
        int childRight = width - getPaddingRight();
        int childSpace = (width - paddingLeft) - getPaddingRight();
        int count = getVirtualChildCount();
        int i = r6.f1708;
        int majorGravity = i & C0291.AppCompatTheme_windowActionBarOverlay;
        int minorGravity = i & 8388615;
        if (majorGravity == 16) {
            childTop = getPaddingTop() + (((bottom - top) - r6.f1709) / 2);
        } else if (majorGravity != 80) {
            childTop = getPaddingTop();
        } else {
            childTop = ((getPaddingTop() + bottom) - top) - r6.f1709;
        }
        int i2 = 0;
        while (i2 < count) {
            View child = r6.m2189(i2);
            if (child == null) {
                childTop += m2178();
            } else if (child.getVisibility() != 8) {
                int childWidth = child.getMeasuredWidth();
                int childHeight = child.getMeasuredHeight();
                C0462 lp = (C0462) child.getLayoutParams();
                int gravity2 = lp.f1723;
                if (gravity2 < 0) {
                    gravity = minorGravity;
                } else {
                    gravity = gravity2;
                }
                int r1 = C0191.m910(gravity, C0248.m1146((View) this)) & 7;
                if (r1 == 1) {
                    childLeft = ((((childSpace - childWidth) / 2) + paddingLeft) + ((ViewGroup.MarginLayoutParams) lp).leftMargin) - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                } else if (r1 != 5) {
                    childLeft = ((ViewGroup.MarginLayoutParams) lp).leftMargin + paddingLeft;
                } else {
                    childLeft = (childRight - childWidth) - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                }
                if (r6.m2198(i2)) {
                    childTop += r6.f1721;
                }
                int childTop2 = childTop + ((ViewGroup.MarginLayoutParams) lp).topMargin;
                m2187(child, childLeft, childTop2 + m2182(), childWidth, childHeight);
                int childTop3 = childTop2 + childHeight + ((ViewGroup.MarginLayoutParams) lp).bottomMargin + m2180();
                i2 += m2188();
                childTop = childTop3;
            }
            i2++;
            r6 = this;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0116  */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m2194(int r33, int r34, int r35, int r36) {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0461.m2194(int, int, int, int):void");
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2187(View child, int left, int top, int width, int height) {
        child.layout(left, top, left + width, top + height);
    }

    public void setOrientation(int orientation) {
        if (this.f1710 != orientation) {
            this.f1710 = orientation;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.f1710;
    }

    public void setGravity(int gravity) {
        if (this.f1708 != gravity) {
            if ((8388615 & gravity) == 0) {
                gravity |= 8388611;
            }
            if ((gravity & C0291.AppCompatTheme_windowActionBarOverlay) == 0) {
                gravity |= 48;
            }
            this.f1708 = gravity;
            requestLayout();
        }
    }

    public int getGravity() {
        return this.f1708;
    }

    public void setHorizontalGravity(int horizontalGravity) {
        int gravity = horizontalGravity & 8388615;
        int i = this.f1708;
        if ((8388615 & i) != gravity) {
            this.f1708 = (-8388616 & i) | gravity;
            requestLayout();
        }
    }

    public void setVerticalGravity(int verticalGravity) {
        int gravity = verticalGravity & C0291.AppCompatTheme_windowActionBarOverlay;
        int i = this.f1708;
        if ((i & C0291.AppCompatTheme_windowActionBarOverlay) != gravity) {
            this.f1708 = (i & -113) | gravity;
            requestLayout();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0462 generateLayoutParams(AttributeSet attrs) {
        return new C0462(getContext(), attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0462 generateDefaultLayoutParams() {
        int i = this.f1710;
        if (i == 0) {
            return new C0462(-2, -2);
        }
        if (i == 1) {
            return new C0462(-1, -2);
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0462 generateLayoutParams(ViewGroup.LayoutParams p) {
        return new C0462(p);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof C0462;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(C0461.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(C0461.class.getName());
    }

    /* renamed from: ♫.有$θ  reason: contains not printable characters */
    public static class C0462 extends ViewGroup.MarginLayoutParams {

        /* renamed from: θ  reason: contains not printable characters */
        public float f1722;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public int f1723;

        public C0462(Context c, AttributeSet attrs) {
            super(c, attrs);
            this.f1723 = -1;
            TypedArray a = c.obtainStyledAttributes(attrs, C0291.LinearLayoutCompat_Layout);
            this.f1722 = a.getFloat(C0291.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f1723 = a.getInt(C0291.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            a.recycle();
        }

        public C0462(int width, int height) {
            super(width, height);
            this.f1723 = -1;
            this.f1722 = 0.0f;
        }

        public C0462(ViewGroup.LayoutParams p) {
            super(p);
            this.f1723 = -1;
        }
    }
}
