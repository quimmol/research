package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import java.util.List;
import ♫.AbstractC0184;
import ♫.AbstractC0219;
import ♫.AbstractC0281;
import ♫.C0078;
import ♫.C0137;
import ♫.C0175;
import ♫.C0182;
import ♫.C0197;
import ♫.C0248;
import ♫.C0578;

public class NestedScrollView extends FrameLayout implements AbstractC0184, AbstractC0281, AbstractC0219 {

    /* renamed from: ø  reason: contains not printable characters */
    public static final int[] f455 = {16843130};

    /* renamed from: θ  reason: contains not printable characters */
    public static final C0060 f456 = new C0060();

    /* renamed from: µ  reason: contains not printable characters */
    public int f457;

    /* renamed from: µ  reason: contains not printable characters and collision with other field name */
    public boolean f458;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f459;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f460;

    /* renamed from: ö  reason: contains not printable characters */
    public int f461;

    /* renamed from: ö  reason: contains not printable characters and collision with other field name */
    public boolean f462;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public int f463;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f464;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f465;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public EdgeEffect f466;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f467;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final int[] f468;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public float f469;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f470;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public long f471;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Rect f472;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public VelocityTracker f473;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f474;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public EdgeEffect f475;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public OverScroller f476;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0057 f477;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0059 f478;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0197 f479;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0578 f480;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final int[] f481;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f482;

    /* renamed from: androidx.core.widget.NestedScrollView$Φ  reason: contains not printable characters */
    public interface AbstractC0059 {
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NestedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f472 = new Rect();
        this.f467 = true;
        this.f464 = false;
        this.f474 = null;
        this.f460 = false;
        this.f458 = true;
        this.f461 = -1;
        this.f481 = new int[2];
        this.f468 = new int[2];
        m262();
        TypedArray a = context.obtainStyledAttributes(attrs, f455, defStyleAttr, 0);
        setFillViewport(a.getBoolean(0, false));
        a.recycle();
        this.f479 = new C0197(this);
        this.f480 = new C0578(this);
        setNestedScrollingEnabled(true);
        C0248.m1161(this, f456);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m273(int axes, int type) {
        return this.f480.m2824(axes, type);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m263(int type) {
        this.f480.m2817(type);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m268(int type) {
        return this.f480.m2823(type);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m290(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        return this.f480.m2825(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m291(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return this.f480.m2826(dx, dy, consumed, offsetInWindow, type);
    }

    public void setNestedScrollingEnabled(boolean enabled) {
        this.f480.m2819(enabled);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f480.m2820();
    }

    public boolean startNestedScroll(int axes) {
        return m273(axes, 0);
    }

    public void stopNestedScroll() {
        m263(0);
    }

    public boolean hasNestedScrollingParent() {
        return m268(0);
    }

    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return m290(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, 0);
    }

    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return m291(dx, dy, consumed, offsetInWindow, 0);
    }

    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return this.f480.m2822(velocityX, velocityY, consumed);
    }

    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return this.f480.m2821(velocityX, velocityY);
    }

    @Override // ♫.AbstractC0184, ♫.AbstractC0184
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m296(View child, View target, int axes, int type) {
        return (axes & 2) != 0;
    }

    @Override // ♫.AbstractC0184, ♫.AbstractC0184
    /* renamed from: θ  reason: contains not printable characters */
    public void m284(View child, View target, int axes, int type) {
        this.f479.m932(axes);
        m273(2, type);
    }

    @Override // ♫.AbstractC0184
    /* renamed from: θ  reason: contains not printable characters */
    public void m281(View target, int type) {
        this.f479.m931();
        m263(type);
    }

    @Override // ♫.AbstractC0184
    /* renamed from: θ  reason: contains not printable characters */
    public void m282(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        int oldScrollY = getScrollY();
        scrollBy(0, dyUnconsumed);
        int myConsumed = getScrollY() - oldScrollY;
        m290(0, myConsumed, 0, dyUnconsumed - myConsumed, (int[]) null, type);
    }

    @Override // ♫.AbstractC0184
    /* renamed from: θ  reason: contains not printable characters */
    public void m283(View target, int dx, int dy, int[] consumed, int type) {
        m291(dx, dy, consumed, (int[]) null, type);
    }

    public boolean onStartNestedScroll(View child, View target, int nestedScrollAxes) {
        return m296(child, target, nestedScrollAxes, 0);
    }

    public void onNestedScrollAccepted(View child, View target, int nestedScrollAxes) {
        m284(child, target, nestedScrollAxes, 0);
    }

    public void onStopNestedScroll(View target) {
        m281(target, 0);
    }

    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        m282(target, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, 0);
    }

    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
        m283(target, dx, dy, consumed, 0);
    }

    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (consumed) {
            return false;
        }
        m267((int) velocityY);
        return true;
    }

    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return dispatchNestedPreFling(velocityX, velocityY);
    }

    public int getNestedScrollAxes() {
        return this.f479.m930();
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int length = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < length) {
            return ((float) scrollY) / ((float) length);
        }
        return 1.0f;
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View child = getChildAt(0);
        int length = getVerticalFadingEdgeLength();
        int span = ((child.getBottom() + ((FrameLayout.LayoutParams) child.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (span < length) {
            return ((float) span) / ((float) length);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public final void m262() {
        this.f476 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration configuration = ViewConfiguration.get(getContext());
        this.f465 = configuration.getScaledTouchSlop();
        this.f463 = configuration.getScaledMinimumFlingVelocity();
        this.f459 = configuration.getScaledMaximumFlingVelocity();
    }

    public void addView(View child) {
        if (getChildCount() <= 0) {
            super.addView(child);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        if (getChildCount() <= 0) {
            super.addView(child, index);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, params);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, index, params);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(AbstractC0059 l) {
        this.f478 = l;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m285() {
        if (getChildCount() <= 0) {
            return false;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        if (child.getHeight() + lp.topMargin + lp.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    public void setFillViewport(boolean fillViewport) {
        if (fillViewport != this.f462) {
            this.f462 = fillViewport;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean smoothScrollingEnabled) {
        this.f458 = smoothScrollingEnabled;
    }

    public void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        AbstractC0059 r0 = this.f478;
        if (r0 != null) {
            ((AlertController.C0008) r0).m28(this, l, t, oldl, oldt);
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f462 && View.MeasureSpec.getMode(heightMeasureSpec) != 0 && getChildCount() > 0) {
            View child = getChildAt(0);
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
            int childSize = child.getMeasuredHeight();
            int parentSpace = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - lp.topMargin) - lp.bottomMargin;
            if (childSize < parentSpace) {
                child.measure(FrameLayout.getChildMeasureSpec(widthMeasureSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin, lp.width), View.MeasureSpec.makeMeasureSpec(parentSpace, 1073741824));
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event) || m293(event);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m293(KeyEvent event) {
        this.f472.setEmpty();
        int i = 130;
        if (!m285()) {
            if (!isFocused() || event.getKeyCode() == 4) {
                return false;
            }
            View currentFocused = findFocus();
            if (currentFocused == this) {
                currentFocused = null;
            }
            View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, 130);
            if (nextFocused == null || nextFocused == this || !nextFocused.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (event.getAction() != 0) {
            return false;
        } else {
            int keyCode = event.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (event.isShiftPressed()) {
                        i = 33;
                    }
                    m264(i);
                    return false;
                } else if (!event.isAltPressed()) {
                    return m286(130);
                } else {
                    return m272(130);
                }
            } else if (!event.isAltPressed()) {
                return m286(33);
            } else {
                return m272(33);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m287(int x, int y) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View child = getChildAt(0);
        if (y < child.getTop() - scrollY || y >= child.getBottom() - scrollY || x < child.getLeft() || x >= child.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m266() {
        VelocityTracker velocityTracker = this.f473;
        if (velocityTracker == null) {
            this.f473 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: ö  reason: contains not printable characters */
    public final void m265() {
        if (this.f473 == null) {
            this.f473 = VelocityTracker.obtain();
        }
    }

    /* renamed from: µ  reason: contains not printable characters */
    public final void m261() {
        VelocityTracker velocityTracker = this.f473;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f473 = null;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (disallowIntercept) {
            m261();
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public boolean onInterceptTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        if (action == 2 && this.f460) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int activePointerId = this.f461;
                    if (activePointerId != -1) {
                        int pointerIndex = ev.findPointerIndex(activePointerId);
                        if (pointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + activePointerId + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) ev.getY(pointerIndex);
                            if (Math.abs(y - this.f470) > this.f465 && (2 & getNestedScrollAxes()) == 0) {
                                this.f460 = true;
                                this.f470 = y;
                                m265();
                                this.f473.addMovement(ev);
                                this.f457 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m279(ev);
                    }
                }
            }
            this.f460 = false;
            this.f461 = -1;
            m261();
            if (this.f476.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0248.m1152((View) this);
            }
            m263(0);
        } else {
            int y2 = (int) ev.getY();
            if (!m287((int) ev.getX(), y2)) {
                this.f460 = false;
                m261();
            } else {
                this.f470 = y2;
                this.f461 = ev.getPointerId(0);
                m266();
                this.f473.addMovement(ev);
                this.f476.computeScrollOffset();
                this.f460 = true ^ this.f476.isFinished();
                m273(2, 0);
            }
        }
        return this.f460;
    }

    public boolean onTouchEvent(MotionEvent ev) {
        ViewParent parent;
        m265();
        MotionEvent vtev = MotionEvent.obtain(ev);
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            this.f457 = 0;
        }
        vtev.offsetLocation(0.0f, (float) this.f457);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f473;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f459);
                int initialVelocity = (int) velocityTracker.getYVelocity(this.f461);
                if (Math.abs(initialVelocity) > this.f463) {
                    m267(-initialVelocity);
                } else if (this.f476.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0248.m1152((View) this);
                }
                this.f461 = -1;
                m276();
            } else if (actionMasked == 2) {
                int activePointerIndex = ev.findPointerIndex(this.f461);
                if (activePointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f461 + " in onTouchEvent");
                } else {
                    int y = (int) ev.getY(activePointerIndex);
                    int deltaY = this.f470 - y;
                    if (m291(0, deltaY, this.f468, this.f481, 0)) {
                        deltaY -= this.f468[1];
                        vtev.offsetLocation(0.0f, (float) this.f481[1]);
                        this.f457 += this.f481[1];
                    }
                    if (!this.f460 && Math.abs(deltaY) > this.f465) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f460 = true;
                        if (deltaY > 0) {
                            deltaY -= this.f465;
                        } else {
                            deltaY += this.f465;
                        }
                    }
                    if (this.f460) {
                        this.f470 = y - this.f481[1];
                        int oldY = getScrollY();
                        int range = getScrollRange();
                        int overscrollMode = getOverScrollMode();
                        boolean canOverscroll = overscrollMode == 0 || (overscrollMode == 1 && range > 0);
                        if (m289(0, deltaY, 0, getScrollY(), 0, range, 0, 0) && !m268(0)) {
                            this.f473.clear();
                        }
                        int scrolledDeltaY = getScrollY() - oldY;
                        if (m290(0, scrolledDeltaY, 0, deltaY - scrolledDeltaY, this.f481, 0)) {
                            int i = this.f470;
                            int[] iArr = this.f481;
                            this.f470 = i - iArr[1];
                            vtev.offsetLocation(0.0f, (float) iArr[1]);
                            this.f457 += this.f481[1];
                        } else if (canOverscroll) {
                            m269();
                            int pulledToY = oldY + deltaY;
                            if (pulledToY < 0) {
                                C0182.m888(this.f475, ((float) deltaY) / ((float) getHeight()), ev.getX(activePointerIndex) / ((float) getWidth()));
                                if (!this.f466.isFinished()) {
                                    this.f466.onRelease();
                                }
                            } else if (pulledToY > range) {
                                C0182.m888(this.f466, ((float) deltaY) / ((float) getHeight()), 1.0f - (ev.getX(activePointerIndex) / ((float) getWidth())));
                                if (!this.f475.isFinished()) {
                                    this.f475.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f475;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f466.isFinished())) {
                                C0248.m1152((View) this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f460 && getChildCount() > 0 && this.f476.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0248.m1152((View) this);
                }
                this.f461 = -1;
                m276();
            } else if (actionMasked == 5) {
                int index = ev.getActionIndex();
                this.f470 = (int) ev.getY(index);
                this.f461 = ev.getPointerId(index);
            } else if (actionMasked == 6) {
                m279(ev);
                this.f470 = (int) ev.getY(ev.findPointerIndex(this.f461));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z = !this.f476.isFinished();
            this.f460 = z;
            if (z && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f476.isFinished()) {
                this.f476.abortAnimation();
            }
            this.f470 = (int) ev.getY();
            this.f461 = ev.getPointerId(0);
            m273(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f473;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(vtev);
        }
        vtev.recycle();
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m279(MotionEvent ev) {
        int pointerIndex = ev.getActionIndex();
        if (ev.getPointerId(pointerIndex) == this.f461) {
            int newPointerIndex = pointerIndex == 0 ? 1 : 0;
            this.f470 = (int) ev.getY(newPointerIndex);
            this.f461 = ev.getPointerId(newPointerIndex);
            VelocityTracker velocityTracker = this.f473;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent event) {
        if ((event.getSource() & 2) == 0 || event.getAction() != 8 || this.f460) {
            return false;
        }
        float vscroll = event.getAxisValue(9);
        if (vscroll == 0.0f) {
            return false;
        }
        int range = getScrollRange();
        int oldScrollY = getScrollY();
        int newScrollY = oldScrollY - ((int) (getVerticalScrollFactorCompat() * vscroll));
        if (newScrollY < 0) {
            newScrollY = 0;
        } else if (newScrollY > range) {
            newScrollY = range;
        }
        if (newScrollY == oldScrollY) {
            return false;
        }
        super.scrollTo(getScrollX(), newScrollY);
        return true;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f469 == 0.0f) {
            TypedValue outValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, outValue, true)) {
                this.f469 = outValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f469;
    }

    public void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        super.scrollTo(scrollX, scrollY);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m289(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY) {
        int maxOverScrollX2;
        int maxOverScrollY2;
        boolean clampedX;
        int newScrollY;
        boolean clampedY;
        int overScrollMode = getOverScrollMode();
        boolean canScrollHorizontal = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean canScrollVertical = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean overScrollHorizontal = overScrollMode == 0 || (overScrollMode == 1 && canScrollHorizontal);
        boolean overScrollVertical = overScrollMode == 0 || (overScrollMode == 1 && canScrollVertical);
        int newScrollX = scrollX + deltaX;
        if (!overScrollHorizontal) {
            maxOverScrollX2 = 0;
        } else {
            maxOverScrollX2 = maxOverScrollX;
        }
        int newScrollY2 = scrollY + deltaY;
        if (!overScrollVertical) {
            maxOverScrollY2 = 0;
        } else {
            maxOverScrollY2 = maxOverScrollY;
        }
        int left = -maxOverScrollX2;
        int right = maxOverScrollX2 + scrollRangeX;
        int top = -maxOverScrollY2;
        int bottom = maxOverScrollY2 + scrollRangeY;
        if (newScrollX > right) {
            newScrollX = right;
            clampedX = true;
        } else if (newScrollX < left) {
            newScrollX = left;
            clampedX = true;
        } else {
            clampedX = false;
        }
        if (newScrollY2 > bottom) {
            newScrollY = bottom;
            clampedY = true;
        } else if (newScrollY2 < top) {
            newScrollY = top;
            clampedY = true;
        } else {
            newScrollY = newScrollY2;
            clampedY = false;
        }
        if (clampedY && !m268(1)) {
            this.f476.springBack(newScrollX, newScrollY, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(newScrollX, newScrollY, clampedX, clampedY);
        return clampedX || clampedY;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        return Math.max(0, ((child.getHeight() + lp.topMargin) + lp.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final View m275(boolean topFocus, int top, int bottom) {
        List<View> focusables = getFocusables(2);
        View focusCandidate = null;
        boolean foundFullyContainedFocusable = false;
        int count = focusables.size();
        for (int i = 0; i < count; i++) {
            View view = focusables.get(i);
            int viewTop = view.getTop();
            int viewBottom = view.getBottom();
            if (top < viewBottom && viewTop < bottom) {
                boolean viewIsCloserToBoundary = false;
                boolean viewIsFullyContained = top < viewTop && viewBottom < bottom;
                if (focusCandidate == null) {
                    focusCandidate = view;
                    foundFullyContainedFocusable = viewIsFullyContained;
                } else {
                    if ((topFocus && viewTop < focusCandidate.getTop()) || (!topFocus && viewBottom > focusCandidate.getBottom())) {
                        viewIsCloserToBoundary = true;
                    }
                    if (foundFullyContainedFocusable) {
                        if (viewIsFullyContained && viewIsCloserToBoundary) {
                            focusCandidate = view;
                        }
                    } else if (viewIsFullyContained) {
                        focusCandidate = view;
                        foundFullyContainedFocusable = true;
                    } else if (viewIsCloserToBoundary) {
                        focusCandidate = view;
                    }
                }
            }
        }
        return focusCandidate;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m264(int direction) {
        boolean down = direction == 130;
        int height = getHeight();
        if (down) {
            this.f472.top = getScrollY() + height;
            int count = getChildCount();
            if (count > 0) {
                View view = getChildAt(count - 1);
                int bottom = view.getBottom() + ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f472;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f472.top = getScrollY() - height;
            Rect rect2 = this.f472;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f472;
        int i = rect3.top;
        rect3.bottom = i + height;
        return m288(direction, i, rect3.bottom);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m272(int direction) {
        int count;
        boolean down = direction == 130;
        int height = getHeight();
        Rect rect = this.f472;
        rect.top = 0;
        rect.bottom = height;
        if (down && (count = getChildCount()) > 0) {
            View view = getChildAt(count - 1);
            this.f472.bottom = view.getBottom() + ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f472;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f472;
        return m288(direction, rect3.top, rect3.bottom);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m288(int direction, int top, int bottom) {
        boolean handled = true;
        int height = getHeight();
        int containerTop = getScrollY();
        int containerBottom = containerTop + height;
        boolean up = direction == 33;
        View newFocused = m275(up, top, bottom);
        if (newFocused == null) {
            newFocused = this;
        }
        if (top < containerTop || bottom > containerBottom) {
            m277(up ? top - containerTop : bottom - containerBottom);
        } else {
            handled = false;
        }
        if (newFocused != findFocus()) {
            newFocused.requestFocus(direction);
        }
        return handled;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m286(int direction) {
        View currentFocused = findFocus();
        if (currentFocused == this) {
            currentFocused = null;
        }
        View nextFocused = FocusFinder.getInstance().findNextFocus(this, currentFocused, direction);
        int maxJump = getMaxScrollAmount();
        if (nextFocused == null || !m295(nextFocused, maxJump, getHeight())) {
            int scrollDelta = maxJump;
            if (direction == 33 && getScrollY() < scrollDelta) {
                scrollDelta = getScrollY();
            } else if (direction == 130 && getChildCount() > 0) {
                View child = getChildAt(0);
                scrollDelta = Math.min((child.getBottom() + ((FrameLayout.LayoutParams) child.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxJump);
            }
            if (scrollDelta == 0) {
                return false;
            }
            m277(direction == 130 ? scrollDelta : -scrollDelta);
        } else {
            nextFocused.getDrawingRect(this.f472);
            offsetDescendantRectToMyCoords(nextFocused, this.f472);
            m277(m274(this.f472));
            nextFocused.requestFocus(direction);
        }
        if (currentFocused == null || !currentFocused.isFocused() || !m294(currentFocused)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m294(View descendant) {
        return !m295(descendant, 0, getHeight());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m295(View descendant, int delta, int height) {
        descendant.getDrawingRect(this.f472);
        offsetDescendantRectToMyCoords(descendant, this.f472);
        return this.f472.bottom + delta >= getScrollY() && this.f472.top - delta <= getScrollY() + height;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m277(int delta) {
        if (delta == 0) {
            return;
        }
        if (this.f458) {
            m278(0, delta);
        } else {
            scrollBy(0, delta);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m278(int dx, int dy) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f471 > 250) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                int childSize = child.getHeight() + lp.topMargin + lp.bottomMargin;
                int parentSpace = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                int dy2 = Math.max(0, Math.min(scrollY + dy, Math.max(0, childSize - parentSpace))) - scrollY;
                this.f482 = getScrollY();
                this.f476.startScroll(getScrollX(), scrollY, 0, dy2);
                C0248.m1152((View) this);
            } else {
                if (!this.f476.isFinished()) {
                    this.f476.abortAnimation();
                }
                scrollBy(dx, dy);
            }
            this.f471 = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m271(int x, int y) {
        m278(x - getScrollX(), y - getScrollY());
    }

    public int computeVerticalScrollRange() {
        int count = getChildCount();
        int parentSpace = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (count == 0) {
            return parentSpace;
        }
        View child = getChildAt(0);
        int scrollRange = child.getBottom() + ((FrameLayout.LayoutParams) child.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int overscrollBottom = Math.max(0, scrollRange - parentSpace);
        if (scrollY < 0) {
            return scrollRange - scrollY;
        }
        if (scrollY > overscrollBottom) {
            return scrollRange + (scrollY - overscrollBottom);
        }
        return scrollRange;
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        child.measure(FrameLayout.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight(), child.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        child.measure(FrameLayout.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed, lp.width), View.MeasureSpec.makeMeasureSpec(lp.topMargin + lp.bottomMargin, 0));
    }

    public void computeScroll() {
        int dy;
        if (this.f476.computeScrollOffset()) {
            this.f476.getCurrX();
            int y = this.f476.getCurrY();
            int dy2 = y - this.f482;
            if (m291(0, dy2, this.f468, (int[]) null, 1)) {
                dy = dy2 - this.f468[1];
            } else {
                dy = dy2;
            }
            if (dy != 0) {
                int range = getScrollRange();
                int oldScrollY = getScrollY();
                m289(0, dy, getScrollX(), oldScrollY, 0, range, 0, 0);
                int scrolledDeltaY = getScrollY() - oldScrollY;
                if (!m290(0, scrolledDeltaY, 0, dy - scrolledDeltaY, (int[]) null, 1)) {
                    int mode = getOverScrollMode();
                    if (mode == 0 || (mode == 1 && range > 0)) {
                        m269();
                        if (y <= 0 && oldScrollY > 0) {
                            this.f475.onAbsorb((int) this.f476.getCurrVelocity());
                        } else if (y >= range && oldScrollY < range) {
                            this.f466.onAbsorb((int) this.f476.getCurrVelocity());
                        }
                    }
                }
            }
            this.f482 = y;
            C0248.m1152((View) this);
            return;
        }
        if (m268(1)) {
            m263(1);
        }
        this.f482 = 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m280(View child) {
        child.getDrawingRect(this.f472);
        offsetDescendantRectToMyCoords(child, this.f472);
        int scrollDelta = m274(this.f472);
        if (scrollDelta != 0) {
            scrollBy(0, scrollDelta);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m292(Rect rect, boolean immediate) {
        int delta = m274(rect);
        boolean scroll = delta != 0;
        if (scroll) {
            if (immediate) {
                scrollBy(0, delta);
            } else {
                m278(0, delta);
            }
        }
        return scroll;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m274(Rect rect) {
        int scrollYDelta;
        int scrollYDelta2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int screenTop = getScrollY();
        int screenBottom = screenTop + height;
        int fadingEdge = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            screenTop += fadingEdge;
        }
        View child = getChildAt(0);
        FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
        if (rect.bottom < child.getHeight() + lp.topMargin + lp.bottomMargin) {
            screenBottom -= fadingEdge;
        }
        if (rect.bottom > screenBottom && rect.top > screenTop) {
            if (rect.height() > height) {
                scrollYDelta2 = 0 + (rect.top - screenTop);
            } else {
                scrollYDelta2 = 0 + (rect.bottom - screenBottom);
            }
            return Math.min(scrollYDelta2, (child.getBottom() + lp.bottomMargin) - screenBottom);
        } else if (rect.top >= screenTop || rect.bottom >= screenBottom) {
            return 0;
        } else {
            if (rect.height() > height) {
                scrollYDelta = 0 - (screenBottom - rect.bottom);
            } else {
                scrollYDelta = 0 - (screenTop - rect.top);
            }
            return Math.max(scrollYDelta, -getScrollY());
        }
    }

    public void requestChildFocus(View child, View focused) {
        if (!this.f467) {
            m280(focused);
        } else {
            this.f474 = focused;
        }
        super.requestChildFocus(child, focused);
    }

    public boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        View nextFocus;
        if (direction == 2) {
            direction = 130;
        } else if (direction == 1) {
            direction = 33;
        }
        if (previouslyFocusedRect == null) {
            nextFocus = FocusFinder.getInstance().findNextFocus(this, null, direction);
        } else {
            nextFocus = FocusFinder.getInstance().findNextFocusFromRect(this, previouslyFocusedRect, direction);
        }
        if (nextFocus != null && !m294(nextFocus)) {
            return nextFocus.requestFocus(direction, previouslyFocusedRect);
        }
        return false;
    }

    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        rectangle.offset(child.getLeft() - child.getScrollX(), child.getTop() - child.getScrollY());
        return m292(rectangle, immediate);
    }

    public void requestLayout() {
        this.f467 = true;
        super.requestLayout();
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        this.f467 = false;
        View view = this.f474;
        if (view != null && m260(view, this)) {
            m280(this.f474);
        }
        this.f474 = null;
        if (!this.f464) {
            if (this.f477 != null) {
                scrollTo(getScrollX(), this.f477.f483);
                this.f477 = null;
            }
            int childSize = 0;
            if (getChildCount() > 0) {
                View child = getChildAt(0);
                FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
                childSize = child.getMeasuredHeight() + lp.topMargin + lp.bottomMargin;
            }
            int parentSpace = ((b - t) - getPaddingTop()) - getPaddingBottom();
            int currentScrollY = getScrollY();
            int newScrollY = m259(currentScrollY, parentSpace, childSize);
            if (newScrollY != currentScrollY) {
                scrollTo(getScrollX(), newScrollY);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f464 = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f464 = false;
    }

    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        View currentFocused = findFocus();
        if (currentFocused != null && this != currentFocused && m295(currentFocused, 0, oldh)) {
            currentFocused.getDrawingRect(this.f472);
            offsetDescendantRectToMyCoords(currentFocused, this.f472);
            m277(m274(this.f472));
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m260(View child, View parent) {
        if (child == parent) {
            return true;
        }
        ViewParent theParent = child.getParent();
        if (!(theParent instanceof ViewGroup) || !m260((View) theParent, parent)) {
            return false;
        }
        return true;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m270(int velocityY) {
        if (getChildCount() > 0) {
            m273(2, 1);
            this.f476.fling(getScrollX(), getScrollY(), 0, velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f482 = getScrollY();
            C0248.m1152((View) this);
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m267(int velocityY) {
        int scrollY = getScrollY();
        boolean canFling = (scrollY > 0 || velocityY > 0) && (scrollY < getScrollRange() || velocityY < 0);
        if (!dispatchNestedPreFling(0.0f, (float) velocityY)) {
            dispatchNestedFling(0.0f, (float) velocityY, canFling);
            m270(velocityY);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m276() {
        this.f460 = false;
        m261();
        m263(0);
        EdgeEffect edgeEffect = this.f475;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f466.onRelease();
        }
    }

    public void scrollTo(int x, int y) {
        if (getChildCount() > 0) {
            View child = getChildAt(0);
            FrameLayout.LayoutParams lp = (FrameLayout.LayoutParams) child.getLayoutParams();
            int x2 = m259(x, (getWidth() - getPaddingLeft()) - getPaddingRight(), child.getWidth() + lp.leftMargin + lp.rightMargin);
            int y2 = m259(y, (getHeight() - getPaddingTop()) - getPaddingBottom(), child.getHeight() + lp.topMargin + lp.bottomMargin);
            if (x2 != getScrollX() || y2 != getScrollY()) {
                super.scrollTo(x2, y2);
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m269() {
        if (getOverScrollMode() == 2) {
            this.f475 = null;
            this.f466 = null;
        } else if (this.f475 == null) {
            Context context = getContext();
            this.f475 = new EdgeEffect(context);
            this.f466 = new EdgeEffect(context);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f475 != null) {
            int scrollY = getScrollY();
            if (!this.f475.isFinished()) {
                int restoreCount = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int xTranslation = 0;
                int yTranslation = Math.min(0, scrollY);
                int i = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    xTranslation = 0 + getPaddingLeft();
                }
                int i2 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    yTranslation += getPaddingTop();
                }
                canvas.translate((float) xTranslation, (float) yTranslation);
                this.f475.setSize(width, height);
                if (this.f475.draw(canvas)) {
                    C0248.m1152((View) this);
                }
                canvas.restoreToCount(restoreCount);
            }
            if (!this.f466.isFinished()) {
                int restoreCount2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int xTranslation2 = 0;
                int yTranslation2 = Math.max(getScrollRange(), scrollY) + height2;
                int i3 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    xTranslation2 = 0 + getPaddingLeft();
                }
                int i4 = Build.VERSION.SDK_INT;
                if (getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    yTranslation2 -= getPaddingBottom();
                }
                canvas.translate((float) (xTranslation2 - width2), (float) yTranslation2);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f466.setSize(width2, height2);
                if (this.f466.draw(canvas)) {
                    C0248.m1152((View) this);
                }
                canvas.restoreToCount(restoreCount2);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m259(int n, int my, int child) {
        if (my >= child || n < 0) {
            return 0;
        }
        if (my + n > child) {
            return child - my;
        }
        return n;
    }

    public void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof C0057)) {
            super.onRestoreInstanceState(state);
            return;
        }
        C0057 ss = (C0057) state;
        super.onRestoreInstanceState(ss.getSuperState());
        this.f477 = ss;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C0057 ss = new C0057(super.onSaveInstanceState());
        ss.f483 = getScrollY();
        return ss;
    }

    /* renamed from: androidx.core.widget.NestedScrollView$ø  reason: contains not printable characters */
    public static class C0057 extends View.BaseSavedState {
        public static final Parcelable.Creator<C0057> CREATOR = new C0058();

        /* renamed from: θ  reason: contains not printable characters */
        public int f483;

        public C0057(Parcelable superState) {
            super(superState);
        }

        public C0057(Parcel source) {
            super(source);
            this.f483 = source.readInt();
        }

        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(this.f483);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f483 + "}";
        }

        /* renamed from: androidx.core.widget.NestedScrollView$ø$θ  reason: contains not printable characters */
        public static class C0058 implements Parcelable.Creator<C0057> {
            /* renamed from: θ  reason: contains not printable characters */
            public C0057 createFromParcel(Parcel in) {
                return new C0057(in);
            }

            /* renamed from: θ  reason: contains not printable characters */
            public C0057[] newArray(int size) {
                return new C0057[size];
            }
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$θ  reason: contains not printable characters */
    public static class C0060 extends C0175 {
        @Override // ♫.C0175
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m301(View host, int action, Bundle arguments) {
            if (super.m880(host, action, arguments)) {
                return true;
            }
            NestedScrollView nsvHost = (NestedScrollView) host;
            if (!nsvHost.isEnabled()) {
                return false;
            }
            if (action == 4096) {
                int targetScrollY = Math.min(nsvHost.getScrollY() + ((nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop()), nsvHost.getScrollRange());
                if (targetScrollY == nsvHost.getScrollY()) {
                    return false;
                }
                nsvHost.m271(0, targetScrollY);
                return true;
            } else if (action != 8192) {
                return false;
            } else {
                int targetScrollY2 = Math.max(nsvHost.getScrollY() - ((nsvHost.getHeight() - nsvHost.getPaddingBottom()) - nsvHost.getPaddingTop()), 0);
                if (targetScrollY2 == nsvHost.getScrollY()) {
                    return false;
                }
                nsvHost.m271(0, targetScrollY2);
                return true;
            }
        }

        @Override // ♫.C0175
        /* renamed from: θ  reason: contains not printable characters */
        public void m300(View host, C0078 info) {
            int scrollRange;
            super.m879(host, info);
            NestedScrollView nsvHost = (NestedScrollView) host;
            info.m465(ScrollView.class.getName());
            if (nsvHost.isEnabled() && (scrollRange = nsvHost.getScrollRange()) > 0) {
                info.m466(true);
                if (nsvHost.getScrollY() > 0) {
                    info.m463(8192);
                }
                if (nsvHost.getScrollY() < scrollRange) {
                    info.m463(4096);
                }
            }
        }

        @Override // ♫.C0175, ♫.C0175
        /* renamed from: θ  reason: contains not printable characters */
        public void m299(View host, AccessibilityEvent event) {
            super.m878(host, event);
            NestedScrollView nsvHost = (NestedScrollView) host;
            event.setClassName(ScrollView.class.getName());
            event.setScrollable(nsvHost.getScrollRange() > 0);
            event.setScrollX(nsvHost.getScrollX());
            event.setScrollY(nsvHost.getScrollY());
            C0137.m665(event, nsvHost.getScrollX());
            C0137.m664(event, nsvHost.getScrollRange());
        }
    }
}
