package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import ♫.AbstractC0188;
import ♫.AbstractC0392;
import ♫.AbstractC0450;
import ♫.AbstractC0451;
import ♫.C0065;
import ♫.C0158;
import ♫.C0197;
import ♫.C0248;
import ♫.C0326;
import ♫.C0490;
import ♫.C0498;

public class ActionBarOverlayLayout extends ViewGroup implements AbstractC0450, AbstractC0188 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final int[] f174 = {C0158.actionBarSize, 16842841};

    /* renamed from: µ  reason: contains not printable characters */
    public final Rect f175;

    /* renamed from: µ  reason: contains not printable characters and collision with other field name */
    public boolean f176;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f177;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public final Rect f178;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f179;

    /* renamed from: ö  reason: contains not printable characters */
    public final Rect f180;

    /* renamed from: ö  reason: contains not printable characters and collision with other field name */
    public boolean f181;

    /* renamed from: ø  reason: contains not printable characters */
    public int f182;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public final Rect f183;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f184;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f185;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final Rect f186;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final Runnable f187;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f188;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f189;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final AnimatorListenerAdapter f190;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Rect f191;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f192;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ViewPropertyAnimator f193;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public OverScroller f194;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ActionBarContainer f195;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0016 f196;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ContentFrameLayout f197;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Runnable f198;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0197 f199;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0451 f200;

    /* renamed from: ₩  reason: contains not printable characters */
    public final Rect f201;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$Ø  reason: contains not printable characters */
    public interface AbstractC0016 {
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$θ  reason: contains not printable characters */
    public class C0020 extends AnimatorListenerAdapter {
        public C0020() {
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f193 = null;
            actionBarOverlayLayout.f176 = false;
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f193 = null;
            actionBarOverlayLayout.f176 = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$Φ  reason: contains not printable characters */
    public class RunnableC0019 implements Runnable {
        public RunnableC0019() {
        }

        public void run() {
            ActionBarOverlayLayout.this.m80();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f193 = actionBarOverlayLayout.f195.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f190);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ø  reason: contains not printable characters */
    public class RunnableC0018 implements Runnable {
        public RunnableC0018() {
        }

        public void run() {
            ActionBarOverlayLayout.this.m80();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f193 = actionBarOverlayLayout.f195.animate().translationY((float) (-ActionBarOverlayLayout.this.f195.getHeight())).setListener(ActionBarOverlayLayout.this.f190);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f185 = 0;
        this.f191 = new Rect();
        this.f186 = new Rect();
        this.f183 = new Rect();
        this.f178 = new Rect();
        this.f180 = new Rect();
        this.f175 = new Rect();
        this.f201 = new Rect();
        this.f190 = new C0020();
        this.f198 = new RunnableC0019();
        this.f187 = new RunnableC0018();
        m93(context);
        this.f199 = new C0197(this);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m93(Context context) {
        TypedArray ta = getContext().getTheme().obtainStyledAttributes(f174);
        boolean z = false;
        this.f189 = ta.getDimensionPixelSize(0, 0);
        this.f192 = ta.getDrawable(1);
        setWillNotDraw(this.f192 == null);
        ta.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f188 = z;
        this.f194 = new OverScroller(context);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m80();
    }

    public void setActionBarVisibilityCallback(AbstractC0016 cb) {
        this.f196 = cb;
        if (getWindowToken() != null) {
            ((C0326) this.f196).m1492(this.f185);
            if (this.f177 != 0) {
                onWindowSystemUiVisibilityChanged(this.f177);
                C0248.m1143((View) this);
            }
        }
    }

    public void setOverlayMode(boolean overlayMode) {
        this.f184 = overlayMode;
        this.f188 = overlayMode && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    /* renamed from: µ  reason: contains not printable characters */
    public boolean m79() {
        return this.f184;
    }

    public void setHasNonEmbeddedTabs(boolean hasNonEmbeddedTabs) {
        this.f179 = hasNonEmbeddedTabs;
    }

    public void setShowingForActionMode(boolean showing) {
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        m93(getContext());
        C0248.m1143((View) this);
    }

    public void onWindowSystemUiVisibilityChanged(int visible) {
        int i = Build.VERSION.SDK_INT;
        super.onWindowSystemUiVisibilityChanged(visible);
        m99();
        int diff = this.f177 ^ visible;
        this.f177 = visible;
        boolean z = true;
        boolean barVisible = (visible & 4) == 0;
        boolean stable = (visible & 256) != 0;
        AbstractC0016 r5 = this.f196;
        if (r5 != null) {
            if (stable) {
                z = false;
            }
            ((C0326) r5).m1506(z);
            if (barVisible || !stable) {
                ((C0326) this.f196).m1499();
            } else {
                ((C0326) this.f196).m1477();
            }
        }
        if ((diff & 256) != 0 && this.f196 != null) {
            C0248.m1143((View) this);
        }
    }

    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        this.f185 = visibility;
        AbstractC0016 r0 = this.f196;
        if (r0 != null) {
            ((C0326) r0).m1492(visibility);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m97(View view, Rect insets, boolean left, boolean top, boolean bottom, boolean right) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean changed = false;
        C0017 lp = (C0017) view.getLayoutParams();
        if (left && ((ViewGroup.MarginLayoutParams) lp).leftMargin != (i4 = insets.left)) {
            changed = true;
            ((ViewGroup.MarginLayoutParams) lp).leftMargin = i4;
        }
        if (top && ((ViewGroup.MarginLayoutParams) lp).topMargin != (i3 = insets.top)) {
            changed = true;
            ((ViewGroup.MarginLayoutParams) lp).topMargin = i3;
        }
        if (right && ((ViewGroup.MarginLayoutParams) lp).rightMargin != (i2 = insets.right)) {
            changed = true;
            ((ViewGroup.MarginLayoutParams) lp).rightMargin = i2;
        }
        if (!bottom || ((ViewGroup.MarginLayoutParams) lp).bottomMargin == (i = insets.bottom)) {
            return changed;
        }
        ((ViewGroup.MarginLayoutParams) lp).bottomMargin = i;
        return true;
    }

    public boolean fitSystemWindows(Rect insets) {
        m99();
        if ((C0248.m1139((View) this) & 256) != 0) {
        }
        boolean changed = m97(this.f195, insets, true, true, false, true);
        this.f178.set(insets);
        C0498.m2370(this, this.f178, this.f191);
        if (!this.f180.equals(this.f178)) {
            changed = true;
            this.f180.set(this.f178);
        }
        if (!this.f186.equals(this.f191)) {
            changed = true;
            this.f186.set(this.f191);
        }
        if (changed) {
            requestLayout();
        }
        return true;
    }

    @Override // ♫.AbstractC0450, ♫.AbstractC0450
    /* renamed from: θ  reason: contains not printable characters */
    public C0017 generateDefaultLayoutParams() {
        return new C0017(-1, -1);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0017 generateLayoutParams(AttributeSet attrs) {
        return new C0017(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new C0017(p);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof C0017;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        m99();
        int topInset = 0;
        measureChildWithMargins(this.f195, widthMeasureSpec, 0, heightMeasureSpec, 0);
        C0017 lp = (C0017) this.f195.getLayoutParams();
        int maxWidth = Math.max(0, this.f195.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) lp).leftMargin + ((ViewGroup.MarginLayoutParams) lp).rightMargin);
        int maxHeight = Math.max(0, this.f195.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp).topMargin + ((ViewGroup.MarginLayoutParams) lp).bottomMargin);
        int childState = View.combineMeasuredStates(0, this.f195.getMeasuredState());
        boolean stable = (C0248.m1139(this) & 256) != 0;
        if (stable) {
            topInset = this.f189;
            if (this.f179 && this.f195.getTabContainer() != null) {
                topInset += this.f189;
            }
        } else if (this.f195.getVisibility() != 8) {
            topInset = this.f195.getMeasuredHeight();
        }
        this.f183.set(this.f191);
        this.f175.set(this.f178);
        if (this.f184 || stable) {
            Rect rect = this.f175;
            rect.top += topInset;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.f183;
            rect2.top += topInset;
            rect2.bottom += 0;
        }
        m97(this.f197, this.f183, true, true, true, true);
        if (!this.f201.equals(this.f175)) {
            this.f201.set(this.f175);
            this.f197.m133(this.f175);
        }
        measureChildWithMargins(this.f197, widthMeasureSpec, 0, heightMeasureSpec, 0);
        C0017 lp2 = (C0017) this.f197.getLayoutParams();
        int maxWidth2 = Math.max(maxWidth, this.f197.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) lp2).leftMargin + ((ViewGroup.MarginLayoutParams) lp2).rightMargin);
        int maxHeight2 = Math.max(maxHeight, this.f197.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) lp2).topMargin + ((ViewGroup.MarginLayoutParams) lp2).bottomMargin);
        int childState2 = View.combineMeasuredStates(childState, this.f197.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(maxWidth2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), widthMeasureSpec, childState2), View.resolveSizeAndState(Math.max(maxHeight2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), heightMeasureSpec, childState2 << 16));
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int count = getChildCount();
        int parentLeft = getPaddingLeft();
        int paddingRight = (right - left) - getPaddingRight();
        int parentTop = getPaddingTop();
        int paddingBottom = (bottom - top) - getPaddingBottom();
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            if (child.getVisibility() != 8) {
                C0017 lp = (C0017) child.getLayoutParams();
                int width = child.getMeasuredWidth();
                int height = child.getMeasuredHeight();
                int childLeft = ((ViewGroup.MarginLayoutParams) lp).leftMargin + parentLeft;
                int childTop = ((ViewGroup.MarginLayoutParams) lp).topMargin + parentTop;
                child.layout(childLeft, childTop, childLeft + width, childTop + height);
            }
        }
    }

    public void draw(Canvas c) {
        super.draw(c);
        if (this.f192 != null && !this.f188) {
            int top = this.f195.getVisibility() == 0 ? (int) (((float) this.f195.getBottom()) + this.f195.getTranslationY() + 0.5f) : 0;
            this.f192.setBounds(0, top, getWidth(), this.f192.getIntrinsicHeight() + top);
            this.f192.draw(c);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean onStartNestedScroll(View child, View target, int axes) {
        if ((axes & 2) == 0 || this.f195.getVisibility() != 0) {
            return false;
        }
        return this.f181;
    }

    public void onNestedScrollAccepted(View child, View target, int axes) {
        this.f199.m933(child, target, axes);
        this.f182 = getActionBarHideOffset();
        m80();
        AbstractC0016 r0 = this.f196;
        if (r0 != null) {
            ((C0326) r0).m1479();
        }
    }

    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        this.f182 += dyConsumed;
        setActionBarHideOffset(this.f182);
    }

    public void onStopNestedScroll(View target) {
        if (this.f181 && !this.f176) {
            if (this.f182 <= this.f195.getHeight()) {
                m78();
            } else {
                m82();
            }
        }
        AbstractC0016 r0 = this.f196;
        if (r0 != null) {
            ((C0326) r0).m1474();
        }
    }

    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!this.f181 || !consumed) {
            return false;
        }
        if (m96(velocityY)) {
            m84();
        } else {
            m98();
        }
        this.f176 = true;
        return true;
    }

    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed) {
    }

    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        return false;
    }

    public int getNestedScrollAxes() {
        return this.f199.m930();
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public void m99() {
        if (this.f197 == null) {
            this.f197 = (ContentFrameLayout) findViewById(C0065.action_bar_activity_content);
            this.f195 = (ActionBarContainer) findViewById(C0065.action_bar_container);
            this.f200 = m90(findViewById(C0065.action_bar));
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final AbstractC0451 m90(View view) {
        if (view instanceof AbstractC0451) {
            return (AbstractC0451) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void setHideOnContentScrollEnabled(boolean hideOnContentScroll) {
        if (hideOnContentScroll != this.f181) {
            this.f181 = hideOnContentScroll;
            if (!hideOnContentScroll) {
                m80();
                setActionBarHideOffset(0);
            }
        }
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f195;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int offset) {
        m80();
        this.f195.setTranslationY((float) (-Math.max(0, Math.min(offset, this.f195.getHeight()))));
    }

    @Override // ♫.AbstractC0450
    /* renamed from: Ø  reason: contains not printable characters */
    public void m80() {
        removeCallbacks(this.f198);
        removeCallbacks(this.f187);
        ViewPropertyAnimator viewPropertyAnimator = this.f193;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: µ  reason: contains not printable characters */
    public final void m78() {
        m80();
        postDelayed(this.f198, 600);
    }

    @Override // ♫.AbstractC0450
    /* renamed from: ö  reason: contains not printable characters */
    public final void m82() {
        m80();
        postDelayed(this.f187, 600);
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public final void m98() {
        m80();
        this.f198.run();
    }

    @Override // ♫.AbstractC0450
    /* renamed from: ø  reason: contains not printable characters */
    public final void m84() {
        m80();
        this.f187.run();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m96(float velocityY) {
        this.f194.fling(0, 0, 0, (int) velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f194.getFinalY() > this.f195.getHeight();
    }

    @Override // ♫.AbstractC0450
    public void setWindowCallback(Window.Callback cb) {
        m99();
        ((C0490) this.f200).m2343(cb);
    }

    @Override // ♫.AbstractC0450
    public void setWindowTitle(CharSequence title) {
        m99();
        ((C0490) this.f200).m2318(title);
    }

    public CharSequence getTitle() {
        m99();
        return ((C0490) this.f200).m2336();
    }

    @Override // ♫.AbstractC0450
    /* renamed from: θ  reason: contains not printable characters */
    public void m92(int windowFeature) {
        m99();
        if (windowFeature == 2) {
            ((C0490) this.f200).m2312();
        } else if (windowFeature == 5) {
            ((C0490) this.f200).m2321();
        } else if (windowFeature == 109) {
            setOverlayMode(true);
        }
    }

    public void setUiOptions(int uiOptions) {
    }

    public void setIcon(int resId) {
        m99();
        ((C0490) this.f200).m2322(resId);
    }

    public void setIcon(Drawable d) {
        m99();
        ((C0490) this.f200).m2340(d);
    }

    public void setLogo(int resId) {
        m99();
        ((C0490) this.f200).m2313(resId);
    }

    @Override // ♫.AbstractC0450, ♫.AbstractC0450
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m95() {
        m99();
        return ((C0490) this.f200).m2347();
    }

    @Override // ♫.AbstractC0450, ♫.AbstractC0450
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m87() {
        m99();
        return ((C0490) this.f200).m2319();
    }

    @Override // ♫.AbstractC0450
    /* renamed from: ö  reason: contains not printable characters */
    public boolean m83() {
        m99();
        return ((C0490) this.f200).m2315();
    }

    @Override // ♫.AbstractC0450
    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m81() {
        m99();
        return ((C0490) this.f200).m2311();
    }

    @Override // ♫.AbstractC0450
    /* renamed from: ø  reason: contains not printable characters */
    public boolean m85() {
        m99();
        return ((C0490) this.f200).m2325();
    }

    @Override // ♫.AbstractC0450, ♫.AbstractC0450
    /* renamed from: θ  reason: contains not printable characters */
    public void m91() {
        m99();
        ((C0490) this.f200).m2316();
    }

    @Override // ♫.AbstractC0450
    /* renamed from: θ  reason: contains not printable characters */
    public void m94(Menu menu, AbstractC0392.AbstractC0393 cb) {
        m99();
        ((C0490) this.f200).m2341(menu, cb);
    }

    @Override // ♫.AbstractC0450, ♫.AbstractC0450
    /* renamed from: Φ  reason: contains not printable characters */
    public void m86() {
        m99();
        ((C0490) this.f200).m2327();
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$ö  reason: contains not printable characters */
    public static class C0017 extends ViewGroup.MarginLayoutParams {
        public C0017(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public C0017(int width, int height) {
            super(width, height);
        }

        public C0017(ViewGroup.LayoutParams source) {
            super(source);
        }
    }
}
