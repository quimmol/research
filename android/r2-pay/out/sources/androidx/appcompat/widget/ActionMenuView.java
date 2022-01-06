package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import ♫.AbstractC0392;
import ♫.AbstractC0394;
import ♫.C0375;
import ♫.C0380;
import ♫.C0407;
import ♫.C0461;
import ♫.C0498;

public class ActionMenuView extends C0461 implements C0375.AbstractC0376, AbstractC0394 {

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean f205;

    /* renamed from: ö  reason: contains not printable characters */
    public boolean f206;

    /* renamed from: θ  reason: contains not printable characters */
    public Context f207;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0022 f208;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0375.AbstractC0377 f209;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0375 f210;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0392.AbstractC0393 f211;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0407 f212;

    /* renamed from: А  reason: contains not printable characters */
    public int f213;

    /* renamed from: ₢  reason: contains not printable characters */
    public int f214;

    /* renamed from: ₤  reason: contains not printable characters */
    public int f215;

    /* renamed from: ₧  reason: contains not printable characters */
    public int f216;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$ö  reason: contains not printable characters */
    public interface AbstractC0022 {
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$θ  reason: contains not printable characters */
    public interface AbstractC0025 {
        /* renamed from: ø  reason: contains not printable characters */
        boolean m124();

        /* renamed from: Φ  reason: contains not printable characters */
        boolean m125();
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBaselineAligned(false);
        float density = context.getResources().getDisplayMetrics().density;
        this.f214 = (int) (56.0f * density);
        this.f213 = (int) (4.0f * density);
        this.f207 = context;
        this.f215 = 0;
    }

    public void setPopupTheme(int resId) {
        if (this.f215 != resId) {
            this.f215 = resId;
            if (resId == 0) {
                this.f207 = getContext();
            } else {
                this.f207 = new ContextThemeWrapper(getContext(), resId);
            }
        }
    }

    public int getPopupTheme() {
        return this.f215;
    }

    public void setPresenter(C0407 presenter) {
        this.f212 = presenter;
        this.f212.m1983(this);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        C0407 r0 = this.f212;
        if (r0 != null) {
            r0.m1986(false);
            if (this.f212.m1969()) {
                this.f212.m1973();
                this.f212.m1991();
            }
        }
    }

    public void setOnMenuItemClickListener(AbstractC0022 listener) {
        this.f208 = listener;
    }

    @Override // ♫.C0461
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        C0375 r4;
        boolean wasFormatted = this.f206;
        this.f206 = View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824;
        if (wasFormatted != this.f206) {
            this.f216 = 0;
        }
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        if (!(!this.f206 || (r4 = this.f210) == null || widthSize == this.f216)) {
            this.f216 = widthSize;
            r4.m1778(true);
        }
        int childCount = getChildCount();
        if (!this.f206 || childCount <= 0) {
            for (int i = 0; i < childCount; i++) {
                C0023 lp = (C0023) getChildAt(i).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) lp).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) lp).leftMargin = 0;
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        m102(widthMeasureSpec, heightMeasureSpec);
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ö  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m102(int r41, int r42) {
        /*
        // Method dump skipped, instructions count: 695
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.m102(int, int):void");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m100(View child, int cellSize, int cellsRemaining, int parentHeightMeasureSpec, int parentHeightPadding) {
        C0023 lp = (C0023) child.getLayoutParams();
        int childHeightSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(parentHeightMeasureSpec) - parentHeightPadding, View.MeasureSpec.getMode(parentHeightMeasureSpec));
        ActionMenuItemView itemView = child instanceof ActionMenuItemView ? (ActionMenuItemView) child : null;
        boolean expandable = false;
        boolean hasText = itemView != null && itemView.m50();
        int cellsUsed = 0;
        if (cellsRemaining > 0 && (!hasText || cellsRemaining >= 2)) {
            child.measure(View.MeasureSpec.makeMeasureSpec(cellSize * cellsRemaining, Integer.MIN_VALUE), childHeightSpec);
            int measuredWidth = child.getMeasuredWidth();
            cellsUsed = measuredWidth / cellSize;
            if (measuredWidth % cellSize != 0) {
                cellsUsed++;
            }
            if (hasText && cellsUsed < 2) {
                cellsUsed = 2;
            }
        }
        if (!lp.f223 && hasText) {
            expandable = true;
        }
        lp.f222 = expandable;
        lp.f221 = cellsUsed;
        child.measure(View.MeasureSpec.makeMeasureSpec(cellsUsed * cellSize, 1073741824), childHeightSpec);
        return cellsUsed;
    }

    /* JADX INFO: Multiple debug info for r9v10 int: [D('t' int), D('isLayoutRtl' boolean)] */
    /* JADX INFO: Multiple debug info for r2v10 int: [D('b' int), D('midVertical' int)] */
    @Override // ♫.C0461
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i;
        int overflowWidth;
        int dividerWidth;
        boolean isLayoutRtl;
        int midVertical;
        int r;
        int l;
        ActionMenuView actionMenuView = this;
        if (!actionMenuView.f206) {
            super.onLayout(changed, left, top, right, bottom);
            return;
        }
        int childCount = getChildCount();
        int midVertical2 = (bottom - top) / 2;
        int dividerWidth2 = getDividerWidth();
        int overflowWidth2 = 0;
        int nonOverflowWidth = 0;
        int nonOverflowCount = 0;
        int widthRemaining = ((right - left) - getPaddingRight()) - getPaddingLeft();
        int i2 = 0;
        boolean isLayoutRtl2 = C0498.m2371((View) this);
        int i3 = 0;
        while (true) {
            i = 8;
            if (i3 >= childCount) {
                break;
            }
            View v = actionMenuView.getChildAt(i3);
            if (v.getVisibility() == 8) {
                midVertical = midVertical2;
                isLayoutRtl = isLayoutRtl2;
            } else {
                C0023 p = (C0023) v.getLayoutParams();
                if (p.f223) {
                    overflowWidth2 = v.getMeasuredWidth();
                    if (actionMenuView.m108(i3)) {
                        overflowWidth2 += dividerWidth2;
                    }
                    int height = v.getMeasuredHeight();
                    if (isLayoutRtl2) {
                        l = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) p).leftMargin;
                        r = l + overflowWidth2;
                    } else {
                        r = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) p).rightMargin;
                        l = r - overflowWidth2;
                    }
                    isLayoutRtl = isLayoutRtl2;
                    int t = midVertical2 - (height / 2);
                    midVertical = midVertical2;
                    v.layout(l, t, r, t + height);
                    widthRemaining -= overflowWidth2;
                    i2 = 1;
                } else {
                    midVertical = midVertical2;
                    isLayoutRtl = isLayoutRtl2;
                    int size = v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) p).leftMargin + ((ViewGroup.MarginLayoutParams) p).rightMargin;
                    nonOverflowWidth += size;
                    widthRemaining -= size;
                    if (actionMenuView.m108(i3)) {
                        nonOverflowWidth += dividerWidth2;
                    }
                    nonOverflowCount++;
                }
            }
            i3++;
            midVertical2 = midVertical;
            isLayoutRtl2 = isLayoutRtl;
        }
        if (childCount == 1 && i2 == 0) {
            View v2 = actionMenuView.getChildAt(0);
            int width = v2.getMeasuredWidth();
            int height2 = v2.getMeasuredHeight();
            int l2 = ((right - left) / 2) - (width / 2);
            int t2 = midVertical2 - (height2 / 2);
            v2.layout(l2, t2, l2 + width, t2 + height2);
            return;
        }
        int spacerCount = nonOverflowCount - (i2 ^ 1);
        int spacerSize = Math.max(0, spacerCount > 0 ? widthRemaining / spacerCount : 0);
        if (isLayoutRtl2) {
            int startRight = getWidth() - getPaddingRight();
            int i4 = 0;
            while (i4 < childCount) {
                View v3 = actionMenuView.getChildAt(i4);
                C0023 lp = (C0023) v3.getLayoutParams();
                if (v3.getVisibility() == i) {
                    dividerWidth = dividerWidth2;
                    overflowWidth = overflowWidth2;
                } else if (lp.f223) {
                    dividerWidth = dividerWidth2;
                    overflowWidth = overflowWidth2;
                } else {
                    int startRight2 = startRight - ((ViewGroup.MarginLayoutParams) lp).rightMargin;
                    int width2 = v3.getMeasuredWidth();
                    int height3 = v3.getMeasuredHeight();
                    int t3 = midVertical2 - (height3 / 2);
                    dividerWidth = dividerWidth2;
                    overflowWidth = overflowWidth2;
                    v3.layout(startRight2 - width2, t3, startRight2, t3 + height3);
                    startRight = startRight2 - ((((ViewGroup.MarginLayoutParams) lp).leftMargin + width2) + spacerSize);
                }
                i4++;
                dividerWidth2 = dividerWidth;
                overflowWidth2 = overflowWidth;
                i = 8;
            }
            return;
        }
        int startLeft = getPaddingLeft();
        int i5 = 0;
        while (i5 < childCount) {
            View v4 = actionMenuView.getChildAt(i5);
            C0023 lp2 = (C0023) v4.getLayoutParams();
            if (v4.getVisibility() != 8 && !lp2.f223) {
                int startLeft2 = startLeft + ((ViewGroup.MarginLayoutParams) lp2).leftMargin;
                int width3 = v4.getMeasuredWidth();
                int height4 = v4.getMeasuredHeight();
                int t4 = midVertical2 - (height4 / 2);
                v4.layout(startLeft2, t4, startLeft2 + width3, t4 + height4);
                startLeft = startLeft2 + ((ViewGroup.MarginLayoutParams) lp2).rightMargin + width3 + spacerSize;
            }
            i5++;
            actionMenuView = this;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m104();
    }

    public void setOverflowIcon(Drawable icon) {
        getMenu();
        this.f212.m1982(icon);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f212.m1976();
    }

    @Override // ♫.C0461
    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m101() {
        return this.f205;
    }

    public void setOverflowReserved(boolean reserveOverflow) {
        this.f205 = reserveOverflow;
    }

    @Override // ♫.C0461, ♫.C0461
    /* renamed from: θ  reason: contains not printable characters */
    public C0023 m113() {
        C0023 params = new C0023(-2, -2);
        ((C0461.C0462) params).f1723 = 16;
        return params;
    }

    @Override // ♫.C0461
    /* renamed from: θ  reason: contains not printable characters */
    public C0023 m114(AttributeSet attrs) {
        return new C0023(getContext(), attrs);
    }

    @Override // ♫.C0461
    /* renamed from: θ  reason: contains not printable characters */
    public C0023 m115(ViewGroup.LayoutParams p) {
        if (p == null) {
            return m113();
        }
        C0023 result = p instanceof C0023 ? new C0023((C0023) p) : new C0023(p);
        if (((C0461.C0462) result).f1723 <= 0) {
            ((C0461.C0462) result).f1723 = 16;
        }
        return result;
    }

    @Override // ♫.C0461
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p != null && (p instanceof C0023);
    }

    @Override // ♫.C0461
    /* renamed from: Φ  reason: contains not printable characters */
    public C0023 m106() {
        C0023 result = m113();
        result.f223 = true;
        return result;
    }

    @Override // ♫.C0375.AbstractC0376
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m119(C0380 item) {
        return this.f210.m1818(item, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // ♫.AbstractC0394
    /* renamed from: θ  reason: contains not printable characters */
    public void m116(C0375 menu) {
        this.f210 = menu;
    }

    public Menu getMenu() {
        if (this.f210 == null) {
            Context context = getContext();
            this.f210 = new C0375(context);
            this.f210.m1813(new C0021());
            this.f212 = new C0407(context);
            this.f212.m1972(true);
            C0407 r1 = this.f212;
            AbstractC0392.AbstractC0393 r2 = this.f211;
            if (r2 == null) {
                r2 = new C0024();
            }
            r1.m1713(r2);
            this.f210.m1815(this.f212, this.f207);
            this.f212.m1983(this);
        }
        return this.f210;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m117(AbstractC0392.AbstractC0393 pcb, C0375.AbstractC0377 mcb) {
        this.f211 = pcb;
        this.f209 = mcb;
    }

    @Override // ♫.C0461, ♫.C0461
    /* renamed from: θ  reason: contains not printable characters */
    public C0375 m112() {
        return this.f210;
    }

    /* renamed from: ö  reason: contains not printable characters */
    public boolean m103() {
        C0407 r0 = this.f212;
        return r0 != null && r0.m1991();
    }

    @Override // ♫.C0461, ♫.C0461
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m118() {
        C0407 r0 = this.f212;
        return r0 != null && r0.m1973();
    }

    @Override // ♫.C0461
    /* renamed from: ø  reason: contains not printable characters */
    public boolean m105() {
        C0407 r0 = this.f212;
        return r0 != null && r0.m1969();
    }

    @Override // ♫.C0461
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m107() {
        C0407 r0 = this.f212;
        return r0 != null && r0.m1971();
    }

    @Override // ♫.C0461
    /* renamed from: ø  reason: contains not printable characters */
    public void m104() {
        C0407 r0 = this.f212;
        if (r0 != null) {
            r0.m1975();
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m108(int childIndex) {
        if (childIndex == 0) {
            return false;
        }
        View childBefore = getChildAt(childIndex - 1);
        View child = getChildAt(childIndex);
        boolean result = false;
        if (childIndex < getChildCount() && (childBefore instanceof AbstractC0025)) {
            result = false | ((AbstractC0025) childBefore).m125();
        }
        if (childIndex <= 0 || !(child instanceof AbstractC0025)) {
            return result;
        }
        return result | ((AbstractC0025) child).m124();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return false;
    }

    public void setExpandedActionViewsExclusive(boolean exclusive) {
        this.f212.m1974(exclusive);
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$Ø  reason: contains not printable characters */
    public class C0021 implements C0375.AbstractC0377 {
        public C0021() {
        }

        @Override // ♫.C0375.AbstractC0377
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m121(C0375 menu, MenuItem item) {
            AbstractC0022 r0 = ActionMenuView.this.f208;
            return r0 != null && ((Toolbar.C0050) r0).m229(item);
        }

        @Override // ♫.C0375.AbstractC0377
        /* renamed from: θ  reason: contains not printable characters */
        public void m120(C0375 menu) {
            C0375.AbstractC0377 r0 = ActionMenuView.this.f209;
            if (r0 != null) {
                r0.m1824(menu);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$Φ  reason: contains not printable characters */
    public static class C0024 implements AbstractC0392.AbstractC0393 {
        @Override // ♫.AbstractC0392.AbstractC0393
        /* renamed from: θ  reason: contains not printable characters */
        public void m122(C0375 menu, boolean allMenusAreClosing) {
        }

        @Override // ♫.AbstractC0392.AbstractC0393
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m123(C0375 subMenu) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$ø  reason: contains not printable characters */
    public static class C0023 extends C0461.C0462 {

        /* renamed from: Ø  reason: contains not printable characters */
        public boolean f218;
        @ViewDebug.ExportedProperty

        /* renamed from: ø  reason: contains not printable characters */
        public int f219;
        @ViewDebug.ExportedProperty

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public boolean f220;
        @ViewDebug.ExportedProperty

        /* renamed from: Φ  reason: contains not printable characters */
        public int f221;
        @ViewDebug.ExportedProperty

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public boolean f222;
        @ViewDebug.ExportedProperty

        /* renamed from: θ  reason: contains not printable characters */
        public boolean f223;

        public C0023(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public C0023(ViewGroup.LayoutParams other) {
            super(other);
        }

        public C0023(C0023 other) {
            super(other);
            this.f223 = other.f223;
        }

        public C0023(int width, int height) {
            super(width, height);
            this.f223 = false;
        }
    }
}
