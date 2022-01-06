package ♫;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: ♫.施  reason: contains not printable characters */
public class C0453 extends ListView {

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1680 = 0;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f1681;

    /* renamed from: ö  reason: contains not printable characters */
    public int f1682;

    /* renamed from: ø  reason: contains not printable characters */
    public int f1683 = 0;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f1684;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1685 = 0;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1686;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1687 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Rect f1688 = new Rect();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Field f1689;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0205 f1690;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0258 f1691;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public RunnableC0454 f1692;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0455 f1693;

    public C0453(Context context, boolean hijackFocus) {
        super(context, null, C0158.dropDownListViewStyle);
        this.f1684 = hijackFocus;
        setCacheColorHint(0);
        try {
            this.f1689 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1689.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public boolean isInTouchMode() {
        return (this.f1684 && this.f1686) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.f1684 || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1684 || super.isFocused();
    }

    public boolean hasFocus() {
        return this.f1684 || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable sel) {
        this.f1693 = sel != null ? new C0455(sel) : null;
        super.setSelector(this.f1693);
        Rect padding = new Rect();
        if (sel != null) {
            sel.getPadding(padding);
        }
        this.f1687 = padding.left;
        this.f1685 = padding.top;
        this.f1683 = padding.right;
        this.f1680 = padding.bottom;
    }

    public void drawableStateChanged() {
        if (this.f1692 == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m2154();
        }
    }

    public void dispatchDraw(Canvas canvas) {
        m2160(canvas);
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getAction() == 0) {
            this.f1682 = pointToPosition((int) ev.getX(), (int) ev.getY());
        }
        RunnableC0454 r0 = this.f1692;
        if (r0 != null) {
            r0.m2166();
        }
        return super.onTouchEvent(ev);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2156(int widthMeasureSpec, int maxHeight, int disallowPartialChildPosition) {
        ViewGroup.LayoutParams childLp;
        int heightMeasureSpec;
        int paddingTop = getListPaddingTop();
        int paddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int reportedDividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return paddingTop + paddingBottom;
        }
        int returnedHeight = paddingTop + paddingBottom;
        int dividerHeight = (reportedDividerHeight <= 0 || divider == null) ? 0 : reportedDividerHeight;
        View child = null;
        int count = adapter.getCount();
        int viewType = 0;
        int prevHeightWithoutPartialChild = 0;
        int returnedHeight2 = returnedHeight;
        int i = 0;
        while (i < count) {
            int newType = adapter.getItemViewType(i);
            if (newType != viewType) {
                child = null;
                viewType = newType;
            }
            child = adapter.getView(i, child, this);
            ViewGroup.LayoutParams childLp2 = child.getLayoutParams();
            if (childLp2 == null) {
                childLp = generateDefaultLayoutParams();
                child.setLayoutParams(childLp);
            } else {
                childLp = childLp2;
            }
            int paddingBottom2 = childLp.height;
            if (paddingBottom2 > 0) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingBottom2, 1073741824);
            } else {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            child.measure(widthMeasureSpec, heightMeasureSpec);
            child.forceLayout();
            if (i > 0) {
                returnedHeight2 += dividerHeight;
            }
            returnedHeight2 += child.getMeasuredHeight();
            if (returnedHeight2 >= maxHeight) {
                return (disallowPartialChildPosition < 0 || i <= disallowPartialChildPosition || prevHeightWithoutPartialChild <= 0 || returnedHeight2 == maxHeight) ? maxHeight : prevHeightWithoutPartialChild;
            }
            if (disallowPartialChildPosition >= 0 && i >= disallowPartialChildPosition) {
                prevHeightWithoutPartialChild = returnedHeight2;
            }
            i++;
            paddingTop = paddingTop;
            paddingBottom = paddingBottom;
        }
        return returnedHeight2;
    }

    private void setSelectorEnabled(boolean enabled) {
        C0455 r0 = this.f1693;
        if (r0 != null) {
            r0.m2167(enabled);
        }
    }

    /* renamed from: ♫.施$θ  reason: contains not printable characters */
    public static class C0455 extends C0345 {

        /* renamed from: Φ  reason: contains not printable characters */
        public boolean f1695 = true;

        public C0455(Drawable drawable) {
            super(drawable);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m2167(boolean enabled) {
            this.f1695 = enabled;
        }

        @Override // ♫.C0345
        public boolean setState(int[] stateSet) {
            if (this.f1695) {
                return super.setState(stateSet);
            }
            return false;
        }

        @Override // ♫.C0345
        public void draw(Canvas canvas) {
            if (this.f1695) {
                super.draw(canvas);
            }
        }

        @Override // ♫.C0345
        public void setHotspot(float x, float y) {
            if (this.f1695) {
                super.setHotspot(x, y);
            }
        }

        @Override // ♫.C0345
        public void setHotspotBounds(int left, int top, int right, int bottom) {
            if (this.f1695) {
                super.setHotspotBounds(left, top, right, bottom);
            }
        }

        @Override // ♫.C0345
        public boolean setVisible(boolean visible, boolean restart) {
            if (this.f1695) {
                return super.setVisible(visible, restart);
            }
            return false;
        }
    }

    public boolean onHoverEvent(MotionEvent ev) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(ev);
        }
        int action = ev.getActionMasked();
        if (action == 10 && this.f1692 == null) {
            this.f1692 = new RunnableC0454();
            this.f1692.m2165();
        }
        boolean handled = super.onHoverEvent(ev);
        if (action == 9 || action == 7) {
            int position = pointToPosition((int) ev.getX(), (int) ev.getY());
            if (!(position == -1 || position == getSelectedItemPosition())) {
                View hoveredItem = getChildAt(position - getFirstVisiblePosition());
                if (hoveredItem.isEnabled()) {
                    setSelectionFromTop(position, hoveredItem.getTop() - getTop());
                }
                m2154();
            }
        } else {
            setSelection(-1);
        }
        return handled;
    }

    public void onDetachedFromWindow() {
        this.f1692 = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m2164(android.view.MotionEvent r12, int r13) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0453.m2164(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2161(View child, int position) {
        performItemClick(child, position, getItemIdAtPosition(position));
    }

    public void setListSelectionHidden(boolean hideListSelection) {
        this.f1686 = hideListSelection;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2154() {
        Drawable selector = getSelector();
        if (selector != null && m2163() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2160(Canvas canvas) {
        Drawable selector;
        if (!this.f1688.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1688);
            selector.draw(canvas);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2159(int position, View sel, float x, float y) {
        m2155(position, sel);
        Drawable selector = getSelector();
        if (selector != null && position != -1) {
            C0171.m858(selector, x, y);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2155(int position, View sel) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean manageState = (selector == null || position == -1) ? false : true;
        if (manageState) {
            selector.setVisible(false, false);
        }
        m2158(position, sel);
        if (manageState) {
            Rect bounds = this.f1688;
            float x = bounds.exactCenterX();
            float y = bounds.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0171.m858(selector, x, y);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2158(int position, View sel) {
        Rect selectorRect = this.f1688;
        selectorRect.set(sel.getLeft(), sel.getTop(), sel.getRight(), sel.getBottom());
        selectorRect.left -= this.f1687;
        selectorRect.top -= this.f1685;
        selectorRect.right += this.f1683;
        selectorRect.bottom += this.f1680;
        try {
            boolean isChildViewEnabled = this.f1689.getBoolean(this);
            if (sel.isEnabled() != isChildViewEnabled) {
                this.f1689.set(this, Boolean.valueOf(!isChildViewEnabled));
                if (position != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2157() {
        this.f1681 = false;
        setPressed(false);
        drawableStateChanged();
        View motionView = getChildAt(this.f1682 - getFirstVisiblePosition());
        if (motionView != null) {
            motionView.setPressed(false);
        }
        C0258 r0 = this.f1691;
        if (r0 != null) {
            r0.m1194();
            this.f1691 = null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2162(View child, int position, float x, float y) {
        View motionView;
        this.f1681 = true;
        int i = Build.VERSION.SDK_INT;
        drawableHotspotChanged(x, y);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f1682;
        if (!(i2 == -1 || (motionView = getChildAt(i2 - getFirstVisiblePosition())) == null || motionView == child || !motionView.isPressed())) {
            motionView.setPressed(false);
        }
        this.f1682 = position;
        int i3 = Build.VERSION.SDK_INT;
        child.drawableHotspotChanged(x - ((float) child.getLeft()), y - ((float) child.getTop()));
        if (!child.isPressed()) {
            child.setPressed(true);
        }
        m2159(position, child, x, y);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2163() {
        return this.f1681;
    }

    /* renamed from: ♫.施$Φ  reason: contains not printable characters */
    public class RunnableC0454 implements Runnable {
        public RunnableC0454() {
        }

        public void run() {
            C0453 r0 = C0453.this;
            r0.f1692 = null;
            r0.drawableStateChanged();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m2166() {
            C0453 r0 = C0453.this;
            r0.f1692 = null;
            r0.removeCallbacks(this);
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public void m2165() {
            C0453.this.post(this);
        }
    }
}
