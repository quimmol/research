package ♫;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import ♫.AbstractC0292;
import ♫.C0461;

/* renamed from: ♫.样  reason: contains not printable characters */
public class C0476 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1779;

    /* renamed from: ø  reason: contains not printable characters */
    public int f1780;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1781;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1782;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1783;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Spinner f1784;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Runnable f1785;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0461 f1786;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View$OnClickListenerC0478 f1787;

    static {
        new DecelerateInterpolator();
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        boolean canCollapse = true;
        boolean lockedExpanded = widthMode == 1073741824;
        setFillViewport(lockedExpanded);
        int childCount = this.f1786.getChildCount();
        if (childCount <= 1 || !(widthMode == 1073741824 || widthMode == Integer.MIN_VALUE)) {
            this.f1783 = -1;
        } else {
            if (childCount > 2) {
                this.f1783 = (int) (((float) View.MeasureSpec.getSize(widthMeasureSpec)) * 0.4f);
            } else {
                this.f1783 = View.MeasureSpec.getSize(widthMeasureSpec) / 2;
            }
            this.f1783 = Math.min(this.f1783, this.f1781);
        }
        int heightMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f1780, 1073741824);
        if (lockedExpanded || !this.f1782) {
            canCollapse = false;
        }
        if (canCollapse) {
            this.f1786.measure(0, heightMeasureSpec2);
            if (this.f1786.getMeasuredWidth() > View.MeasureSpec.getSize(widthMeasureSpec)) {
                m2251();
            } else {
                m2248();
            }
        } else {
            m2248();
        }
        int oldWidth = getMeasuredWidth();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec2);
        int newWidth = getMeasuredWidth();
        if (lockedExpanded && oldWidth != newWidth) {
            setTabSelected(this.f1779);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2253() {
        Spinner spinner = this.f1784;
        return spinner != null && spinner.getParent() == this;
    }

    public void setAllowCollapse(boolean allowCollapse) {
        this.f1782 = allowCollapse;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2251() {
        if (!m2253()) {
            if (this.f1784 == null) {
                this.f1784 = m2249();
            }
            removeView(this.f1786);
            addView(this.f1784, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1784.getAdapter() == null) {
                this.f1784.setAdapter((SpinnerAdapter) new C0479());
            }
            Runnable runnable = this.f1785;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1785 = null;
            }
            this.f1784.setSelection(this.f1779);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean m2248() {
        if (!m2253()) {
            return false;
        }
        removeView(this.f1784);
        addView(this.f1786, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1784.getSelectedItemPosition());
        return false;
    }

    public void setTabSelected(int position) {
        this.f1779 = position;
        int tabCount = this.f1786.getChildCount();
        int i = 0;
        while (i < tabCount) {
            View child = this.f1786.getChildAt(i);
            boolean isSelected = i == position;
            child.setSelected(isSelected);
            if (isSelected) {
                m2252(position);
            }
            i++;
        }
        Spinner spinner = this.f1784;
        if (spinner != null && position >= 0) {
            spinner.setSelection(position);
        }
    }

    public void setContentHeight(int contentHeight) {
        this.f1780 = contentHeight;
        requestLayout();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Spinner m2249() {
        Spinner spinner = new C0439(getContext(), null, C0158.actionDropDownStyle);
        spinner.setLayoutParams(new C0461.C0462(-2, -1));
        spinner.setOnItemSelectedListener(this);
        return spinner;
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        C0348 abp = C0348.m1615(getContext());
        setContentHeight(abp.m1616());
        this.f1781 = abp.m1617();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2252(int position) {
        View tabView = this.f1786.getChildAt(position);
        Runnable runnable = this.f1785;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f1785 = new RunnableC0480(tabView);
        post(this.f1785);
    }

    /* renamed from: ♫.样$θ  reason: contains not printable characters */
    public class RunnableC0480 implements Runnable {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ View f1796;

        public RunnableC0480(View view) {
            this.f1796 = view;
        }

        public void run() {
            C0476.this.smoothScrollTo(this.f1796.getLeft() - ((C0476.this.getWidth() - this.f1796.getWidth()) / 2), 0);
            C0476.this.f1785 = null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1785;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1785;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0477 m2250(AbstractC0292.AbstractC0293 tab, boolean forAdapter) {
        C0477 tabView = new C0477(getContext(), tab, forAdapter);
        if (forAdapter) {
            tabView.setBackgroundDrawable(null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1780));
        } else {
            tabView.setFocusable(true);
            if (this.f1787 == null) {
                this.f1787 = new View$OnClickListenerC0478();
            }
            tabView.setOnClickListener(this.f1787);
        }
        return tabView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        ((C0477) view).m2254().m1303();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    /* renamed from: ♫.样$Ø  reason: contains not printable characters */
    public class C0477 extends LinearLayout {

        /* renamed from: θ  reason: contains not printable characters */
        public View f1788;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public ImageView f1789;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public TextView f1790;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public AbstractC0292.AbstractC0293 f1791;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final int[] f1793 = {16842964};

        public C0477(Context context, AbstractC0292.AbstractC0293 tab, boolean forList) {
            super(context, null, C0158.actionBarTabStyle);
            this.f1791 = tab;
            C0488 a = C0488.m2290(context, null, this.f1793, C0158.actionBarTabStyle, 0);
            if (a.m2305(0)) {
                setBackgroundDrawable(a.m2301(0));
            }
            a.m2304();
            if (forList) {
                setGravity(8388627);
            }
            m2255();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m2256(AbstractC0292.AbstractC0293 tab) {
            this.f1791 = tab;
            m2255();
        }

        public void setSelected(boolean selected) {
            boolean changed = isSelected() != selected;
            super.setSelected(selected);
            if (changed && selected) {
                sendAccessibilityEvent(4);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(event);
            event.setClassName(AbstractC0292.AbstractC0293.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
            super.onInitializeAccessibilityNodeInfo(info);
            info.setClassName(AbstractC0292.AbstractC0293.class.getName());
        }

        public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            int i;
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            if (C0476.this.f1783 > 0 && getMeasuredWidth() > (i = C0476.this.f1783)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), heightMeasureSpec);
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m2255() {
            AbstractC0292.AbstractC0293 tab = this.f1791;
            View custom = tab.m1301();
            CharSequence charSequence = null;
            if (custom != null) {
                ViewParent customParent = custom.getParent();
                if (customParent != this) {
                    if (customParent != null) {
                        ((ViewGroup) customParent).removeView(custom);
                    }
                    addView(custom);
                }
                this.f1788 = custom;
                TextView textView = this.f1790;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1789;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1789.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1788;
            if (view != null) {
                removeView(view);
                this.f1788 = null;
            }
            Drawable icon = tab.m1300();
            CharSequence text = tab.m1299();
            if (icon != null) {
                if (this.f1789 == null) {
                    ImageView iconView = new C0431(getContext());
                    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(-2, -2);
                    lp.gravity = 16;
                    iconView.setLayoutParams(lp);
                    addView(iconView, 0);
                    this.f1789 = iconView;
                }
                this.f1789.setImageDrawable(icon);
                this.f1789.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1789;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1789.setImageDrawable(null);
                }
            }
            boolean hasText = !TextUtils.isEmpty(text);
            if (hasText) {
                if (this.f1790 == null) {
                    TextView textView2 = new C0448(getContext(), null, C0158.actionBarTabTextStyle);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(-2, -2);
                    lp2.gravity = 16;
                    textView2.setLayoutParams(lp2);
                    addView(textView2);
                    this.f1790 = textView2;
                }
                this.f1790.setText(text);
                this.f1790.setVisibility(0);
            } else {
                TextView textView3 = this.f1790;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                    this.f1790.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1789;
            if (imageView3 != null) {
                imageView3.setContentDescription(tab.m1302());
            }
            if (!hasText) {
                charSequence = tab.m1302();
            }
            C0492.m2353(this, charSequence);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public AbstractC0292.AbstractC0293 m2254() {
            return this.f1791;
        }
    }

    /* renamed from: ♫.样$Φ  reason: contains not printable characters */
    public class C0479 extends BaseAdapter {
        public C0479() {
        }

        public int getCount() {
            return C0476.this.f1786.getChildCount();
        }

        public Object getItem(int position) {
            return ((C0477) C0476.this.f1786.getChildAt(position)).m2254();
        }

        public long getItemId(int position) {
            return (long) position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                return C0476.this.m2250((AbstractC0292.AbstractC0293) getItem(position), true);
            }
            ((C0477) convertView).m2256((AbstractC0292.AbstractC0293) getItem(position));
            return convertView;
        }
    }

    /* renamed from: ♫.样$ø  reason: contains not printable characters */
    public class View$OnClickListenerC0478 implements View.OnClickListener {
        public View$OnClickListenerC0478() {
        }

        public void onClick(View view) {
            ((C0477) view).m2254().m1303();
            int tabCount = C0476.this.f1786.getChildCount();
            for (int i = 0; i < tabCount; i++) {
                View child = C0476.this.f1786.getChildAt(i);
                child.setSelected(child == view);
            }
        }
    }
}
