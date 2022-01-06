package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import ♫.AbstractC0349;
import ♫.AbstractC0404;
import ♫.C0065;
import ♫.C0158;
import ♫.C0248;
import ♫.C0291;
import ♫.C0296;
import ♫.C0375;
import ♫.C0407;
import ♫.C0488;
import ♫.C0498;

public class ActionBarContextView extends AbstractC0404 {

    /* renamed from: Ø  reason: contains not printable characters */
    public int f162;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f163;

    /* renamed from: ø  reason: contains not printable characters */
    public int f164;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f165;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public View f166;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public TextView f167;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public CharSequence f168;

    /* renamed from: θ  reason: contains not printable characters */
    public View f169;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public LinearLayout f170;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public TextView f171;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public CharSequence f172;

    @Override // ♫.AbstractC0404
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // ♫.AbstractC0404
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // ♫.AbstractC0404
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attrs) {
        this(context, attrs, C0158.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        C0488 a = C0488.m2290(context, attrs, C0291.ActionMode, defStyle, 0);
        C0248.m1157(this, a.m2301(C0291.ActionMode_background));
        this.f165 = a.m2308(C0291.ActionMode_titleTextStyle, 0);
        this.f164 = a.m2308(C0291.ActionMode_subtitleTextStyle, 0);
        ((AbstractC0404) this).f1528 = a.m2291(C0291.ActionMode_height, 0);
        this.f162 = a.m2308(C0291.ActionMode_closeItemLayout, C0296.abc_action_mode_close_item_material);
        a.m2304();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0407 r0 = ((AbstractC0404) this).f1533;
        if (r0 != null) {
            r0.m1973();
            ((AbstractC0404) this).f1533.m1970();
        }
    }

    @Override // ♫.AbstractC0404
    public void setContentHeight(int height) {
        ((AbstractC0404) this).f1528 = height;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f166;
        if (view2 != null) {
            removeView(view2);
        }
        this.f166 = view;
        if (!(view == null || (linearLayout = this.f170) == null)) {
            removeView(linearLayout);
            this.f170 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence title) {
        this.f172 = title;
        m73();
    }

    public void setSubtitle(CharSequence subtitle) {
        this.f168 = subtitle;
        m73();
    }

    public CharSequence getTitle() {
        return this.f172;
    }

    public CharSequence getSubtitle() {
        return this.f168;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m73() {
        if (this.f170 == null) {
            LayoutInflater.from(getContext()).inflate(C0296.abc_action_bar_title_item, this);
            this.f170 = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f171 = (TextView) this.f170.findViewById(C0065.action_bar_title);
            this.f167 = (TextView) this.f170.findViewById(C0065.action_bar_subtitle);
            if (this.f165 != 0) {
                this.f171.setTextAppearance(getContext(), this.f165);
            }
            if (this.f164 != 0) {
                this.f167.setTextAppearance(getContext(), this.f164);
            }
        }
        this.f171.setText(this.f172);
        this.f167.setText(this.f168);
        boolean hasTitle = !TextUtils.isEmpty(this.f172);
        boolean hasSubtitle = !TextUtils.isEmpty(this.f168);
        int i = 0;
        this.f167.setVisibility(hasSubtitle ? 0 : 8);
        LinearLayout linearLayout = this.f170;
        if (!hasTitle && !hasSubtitle) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f170.getParent() == null) {
            addView(this.f170);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m76(AbstractC0349 mode) {
        View view = this.f169;
        if (view == null) {
            this.f169 = LayoutInflater.from(getContext()).inflate(this.f162, (ViewGroup) this, false);
            addView(this.f169);
        } else if (view.getParent() == null) {
            addView(this.f169);
        }
        this.f169.findViewById(C0065.action_mode_close_button).setOnClickListener(new View$OnClickListenerC0015(this, mode));
        C0375 menu = (C0375) mode.m1628();
        C0407 r2 = ((AbstractC0404) this).f1533;
        if (r2 != null) {
            r2.m1975();
        }
        ((AbstractC0404) this).f1533 = new C0407(getContext());
        ((AbstractC0404) this).f1533.m1972(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menu.m1815(((AbstractC0404) this).f1533, ((AbstractC0404) this).f1529);
        ((AbstractC0404) this).f1530 = (ActionMenuView) ((AbstractC0404) this).f1533.m1979((ViewGroup) this);
        C0248.m1157(((AbstractC0404) this).f1530, (Drawable) null);
        addView(((AbstractC0404) this).f1530, layoutParams);
    }

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$θ  reason: contains not printable characters */
    public class View$OnClickListenerC0015 implements View.OnClickListener {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ AbstractC0349 f173;

        public View$OnClickListenerC0015(ActionBarContextView this$0, AbstractC0349 r2) {
            this.f173 = r2;
        }

        public void onClick(View v) {
            this.f173.m1633();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m75() {
        if (this.f169 == null) {
            m72();
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m72() {
        removeAllViews();
        this.f166 = null;
        ((AbstractC0404) this).f1530 = null;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m74() {
        C0407 r0 = ((AbstractC0404) this).f1533;
        if (r0 != null) {
            return r0.m1991();
        }
        return false;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new ViewGroup.MarginLayoutParams(getContext(), attrs);
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int customHeightMode = 1073741824;
        if (View.MeasureSpec.getMode(widthMeasureSpec) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(heightMeasureSpec) != 0) {
            int contentWidth = View.MeasureSpec.getSize(widthMeasureSpec);
            int maxHeight = ((AbstractC0404) this).f1528;
            if (maxHeight <= 0) {
                maxHeight = View.MeasureSpec.getSize(heightMeasureSpec);
            }
            int verticalPadding = getPaddingTop() + getPaddingBottom();
            int availableWidth = (contentWidth - getPaddingLeft()) - getPaddingRight();
            int height = maxHeight - verticalPadding;
            int childSpecHeight = View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE);
            View view = this.f169;
            int i = 0;
            if (view != null) {
                int availableWidth2 = m1956(view, availableWidth, childSpecHeight, 0);
                ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) this.f169.getLayoutParams();
                availableWidth = availableWidth2 - (lp.leftMargin + lp.rightMargin);
            }
            ActionMenuView actionMenuView = ((AbstractC0404) this).f1530;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                availableWidth = m1956(((AbstractC0404) this).f1530, availableWidth, childSpecHeight, 0);
            }
            LinearLayout linearLayout = this.f170;
            if (linearLayout != null && this.f166 == null) {
                if (this.f163) {
                    this.f170.measure(View.MeasureSpec.makeMeasureSpec(0, 0), childSpecHeight);
                    int titleWidth = this.f170.getMeasuredWidth();
                    boolean titleFits = titleWidth <= availableWidth;
                    if (titleFits) {
                        availableWidth -= titleWidth;
                    }
                    LinearLayout linearLayout2 = this.f170;
                    if (!titleFits) {
                        i = 8;
                    }
                    linearLayout2.setVisibility(i);
                } else {
                    availableWidth = m1956(linearLayout, availableWidth, childSpecHeight, 0);
                }
            }
            View view2 = this.f166;
            if (view2 != null) {
                ViewGroup.LayoutParams lp2 = view2.getLayoutParams();
                int customWidthMode = lp2.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i2 = lp2.width;
                int customWidth = i2 >= 0 ? Math.min(i2, availableWidth) : availableWidth;
                if (lp2.height == -2) {
                    customHeightMode = Integer.MIN_VALUE;
                }
                int i3 = lp2.height;
                this.f166.measure(View.MeasureSpec.makeMeasureSpec(customWidth, customWidthMode), View.MeasureSpec.makeMeasureSpec(i3 >= 0 ? Math.min(i3, height) : height, customHeightMode));
            }
            if (((AbstractC0404) this).f1528 <= 0) {
                int measuredHeight = 0;
                int count = getChildCount();
                for (int i4 = 0; i4 < count; i4++) {
                    int paddedViewHeight = getChildAt(i4).getMeasuredHeight() + verticalPadding;
                    if (paddedViewHeight > measuredHeight) {
                        measuredHeight = paddedViewHeight;
                    }
                }
                setMeasuredDimension(contentWidth, measuredHeight);
                return;
            }
            setMeasuredDimension(contentWidth, maxHeight);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
        }
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
        int x;
        boolean isLayoutRtl = C0498.m2371((View) this);
        int x2 = isLayoutRtl ? (r - l) - getPaddingRight() : getPaddingLeft();
        int y = getPaddingTop();
        int contentHeight = ((b - t) - getPaddingTop()) - getPaddingBottom();
        View view = this.f169;
        if (view == null || view.getVisibility() == 8) {
            x = x2;
        } else {
            ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) this.f169.getLayoutParams();
            int startMargin = isLayoutRtl ? lp.rightMargin : lp.leftMargin;
            int endMargin = isLayoutRtl ? lp.leftMargin : lp.rightMargin;
            int x3 = AbstractC0404.m1954(x2, startMargin, isLayoutRtl);
            x = AbstractC0404.m1954(x3 + m1957(this.f169, x3, y, contentHeight, isLayoutRtl), endMargin, isLayoutRtl);
        }
        LinearLayout linearLayout = this.f170;
        if (!(linearLayout == null || this.f166 != null || linearLayout.getVisibility() == 8)) {
            x += m1957(this.f170, x, y, contentHeight, isLayoutRtl);
        }
        View view2 = this.f166;
        if (view2 != null) {
            int x4 = x + m1957(view2, x, y, contentHeight, isLayoutRtl);
        }
        int x5 = isLayoutRtl ? getPaddingLeft() : (r - l) - getPaddingRight();
        ActionMenuView actionMenuView = ((AbstractC0404) this).f1530;
        if (actionMenuView != null) {
            int x6 = x5 + m1957(actionMenuView, x5, y, contentHeight, !isLayoutRtl);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        if (event.getEventType() == 32) {
            event.setSource(this);
            event.setClassName(getClass().getName());
            event.setPackageName(getContext().getPackageName());
            event.setContentDescription(this.f172);
            return;
        }
        super.onInitializeAccessibilityEvent(event);
    }

    public void setTitleOptional(boolean titleOptional) {
        if (titleOptional != this.f163) {
            requestLayout();
        }
        this.f163 = titleOptional;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m77() {
        return this.f163;
    }
}
