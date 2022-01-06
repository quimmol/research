package ♫;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: ♫.报  reason: contains not printable characters */
public class C0439 extends Spinner implements AbstractC0220 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final int[] f1631 = {16843505};

    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean f1632;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f1633;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Context f1634;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Rect f1635;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public SpinnerAdapter f1636;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0416 f1637;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0440 f1638;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractView$OnTouchListenerC0458 f1639;

    public C0439(Context context, AttributeSet attrs) {
        this(context, attrs, C0158.spinnerStyle);
    }

    public C0439(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, -1);
    }

    public C0439(Context context, AttributeSet attrs, int defStyleAttr, int mode) {
        this(context, attrs, defStyleAttr, mode, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (0 == 0) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0439(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0439.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: ♫.报$θ  reason: contains not printable characters */
    public class C0445 extends AbstractView$OnTouchListenerC0458 {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ C0440 f1650;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0445(View src, C0440 r3) {
            super(src);
            this.f1650 = r3;
        }

        @Override // ♫.AbstractView$OnTouchListenerC0458, ♫.AbstractView$OnTouchListenerC0458, ♫.AbstractView$OnTouchListenerC0458
        /* renamed from: θ  reason: contains not printable characters */
        public AbstractC0398 m2089() {
            return this.f1650;
        }

        @Override // ♫.AbstractView$OnTouchListenerC0458, ♫.AbstractView$OnTouchListenerC0458, ♫.AbstractView$OnTouchListenerC0458
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m2090() {
            if (C0439.this.f1638.m2212()) {
                return true;
            }
            C0439.this.f1638.m2085();
            return true;
        }
    }

    public Context getPopupContext() {
        if (this.f1638 != null) {
            return this.f1634;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public void setPopupBackgroundDrawable(Drawable background) {
        C0440 r0 = this.f1638;
        if (r0 != null) {
            r0.m2222(background);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        super.setPopupBackgroundDrawable(background);
    }

    public void setPopupBackgroundResource(int resId) {
        setPopupBackgroundDrawable(C0331.m1530(getPopupContext(), resId));
    }

    public Drawable getPopupBackground() {
        C0440 r0 = this.f1638;
        if (r0 != null) {
            return r0.m2215();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getPopupBackground();
    }

    public void setDropDownVerticalOffset(int pixels) {
        C0440 r0 = this.f1638;
        if (r0 != null) {
            r0.m2229(pixels);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        super.setDropDownVerticalOffset(pixels);
    }

    public int getDropDownVerticalOffset() {
        C0440 r0 = this.f1638;
        if (r0 != null) {
            return r0.m2203();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownVerticalOffset();
    }

    public void setDropDownHorizontalOffset(int pixels) {
        C0440 r0 = this.f1638;
        if (r0 != null) {
            r0.m2201(pixels);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        super.setDropDownHorizontalOffset(pixels);
    }

    public int getDropDownHorizontalOffset() {
        C0440 r0 = this.f1638;
        if (r0 != null) {
            return r0.m2208();
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownHorizontalOffset();
    }

    public void setDropDownWidth(int pixels) {
        if (this.f1638 != null) {
            this.f1633 = pixels;
            return;
        }
        int i = Build.VERSION.SDK_INT;
        super.setDropDownWidth(pixels);
    }

    public int getDropDownWidth() {
        if (this.f1638 != null) {
            return this.f1633;
        }
        int i = Build.VERSION.SDK_INT;
        return super.getDropDownWidth();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter adapter) {
        if (!this.f1632) {
            this.f1636 = adapter;
            return;
        }
        super.setAdapter(adapter);
        if (this.f1638 != null) {
            Context popupContext = this.f1634;
            if (popupContext == null) {
                popupContext = getContext();
            }
            this.f1638.m2086(new C0444(adapter, popupContext.getTheme()));
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0440 r0 = this.f1638;
        if (r0 != null && r0.m2212()) {
            this.f1638.dismiss();
        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        AbstractView$OnTouchListenerC0458 r0 = this.f1639;
        if (r0 == null || !r0.onTouch(this, event)) {
            return super.onTouchEvent(event);
        }
        return true;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f1638 != null && View.MeasureSpec.getMode(widthMeasureSpec) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2081(getAdapter(), getBackground())), View.MeasureSpec.getSize(widthMeasureSpec)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        C0440 r0 = this.f1638;
        if (r0 == null) {
            return super.performClick();
        }
        if (r0.m2212()) {
            return true;
        }
        this.f1638.m2085();
        return true;
    }

    public void setPrompt(CharSequence prompt) {
        C0440 r0 = this.f1638;
        if (r0 != null) {
            r0.m2087(prompt);
        } else {
            super.setPrompt(prompt);
        }
    }

    public CharSequence getPrompt() {
        C0440 r0 = this.f1638;
        return r0 != null ? r0.m2084() : super.getPrompt();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        C0416 r0 = this.f1637;
        if (r0 != null) {
            r0.m2007(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        C0416 r0 = this.f1637;
        if (r0 != null) {
            r0.m2002();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        C0416 r0 = this.f1637;
        if (r0 != null) {
            r0.m2003(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0416 r0 = this.f1637;
        if (r0 != null) {
            return r0.m2004();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        C0416 r0 = this.f1637;
        if (r0 != null) {
            r0.m2009(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0416 r0 = this.f1637;
        if (r0 != null) {
            return r0.m2005();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0416 r0 = this.f1637;
        if (r0 != null) {
            r0.m2006();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2081(SpinnerAdapter adapter, Drawable background) {
        if (adapter == null) {
            return 0;
        }
        int width = 0;
        View itemView = null;
        int itemType = 0;
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int start = Math.max(0, getSelectedItemPosition());
        int end = Math.min(adapter.getCount(), start + 15);
        for (int i = Math.max(0, start - (15 - (end - start))); i < end; i++) {
            int positionType = adapter.getItemViewType(i);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            itemView = adapter.getView(i, itemView, this);
            if (itemView.getLayoutParams() == null) {
                itemView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            width = Math.max(width, itemView.getMeasuredWidth());
        }
        if (background == null) {
            return width;
        }
        background.getPadding(this.f1635);
        Rect rect = this.f1635;
        return width + rect.left + rect.right;
    }

    /* renamed from: ♫.报$Φ  reason: contains not printable characters */
    public static class C0444 implements ListAdapter, SpinnerAdapter {

        /* renamed from: θ  reason: contains not printable characters */
        public ListAdapter f1648;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public SpinnerAdapter f1649;

        public C0444(SpinnerAdapter adapter, Resources.Theme dropDownTheme) {
            this.f1649 = adapter;
            if (adapter instanceof ListAdapter) {
                this.f1648 = (ListAdapter) adapter;
            }
            if (dropDownTheme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (adapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedAdapter = (ThemedSpinnerAdapter) adapter;
                if (themedAdapter.getDropDownViewTheme() != dropDownTheme) {
                    themedAdapter.setDropDownViewTheme(dropDownTheme);
                }
            } else if (adapter instanceof AbstractC0484) {
                AbstractC0484 themedAdapter2 = (AbstractC0484) adapter;
                if (themedAdapter2.getDropDownViewTheme() == null) {
                    themedAdapter2.setDropDownViewTheme(dropDownTheme);
                }
            }
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1649;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public Object getItem(int position) {
            SpinnerAdapter spinnerAdapter = this.f1649;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(position);
        }

        public long getItemId(int position) {
            SpinnerAdapter spinnerAdapter = this.f1649;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(position);
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            return getDropDownView(position, convertView, parent);
        }

        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            SpinnerAdapter spinnerAdapter = this.f1649;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(position, convertView, parent);
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1649;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public void registerDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f1649;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(observer);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver observer) {
            SpinnerAdapter spinnerAdapter = this.f1649;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(observer);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter adapter = this.f1648;
            if (adapter != null) {
                return adapter.areAllItemsEnabled();
            }
            return true;
        }

        public boolean isEnabled(int position) {
            ListAdapter adapter = this.f1648;
            if (adapter != null) {
                return adapter.isEnabled(position);
            }
            return true;
        }

        public int getItemViewType(int position) {
            return 0;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    /* renamed from: ♫.报$ø  reason: contains not printable characters */
    public class C0440 extends C0463 {

        /* renamed from: ø  reason: contains not printable characters */
        public final Rect f1640 = new Rect();

        /* renamed from: Φ  reason: contains not printable characters */
        public ListAdapter f1641;

        /* renamed from: θ  reason: contains not printable characters */
        public CharSequence f1642;

        public C0440(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            m2223((View) C0439.this);
            m2227(true);
            m2199(0);
            m2224(new C0443(C0439.this));
        }

        /* renamed from: ♫.报$ø$θ  reason: contains not printable characters */
        public class C0443 implements AdapterView.OnItemClickListener {
            public C0443(C0439 r2) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                C0439.this.setSelection(position);
                if (C0439.this.getOnItemClickListener() != null) {
                    C0440 r0 = C0440.this;
                    C0439.this.performItemClick(v, position, r0.f1641.getItemId(position));
                }
                C0440.this.dismiss();
            }
        }

        @Override // ♫.C0463
        /* renamed from: θ  reason: contains not printable characters */
        public void m2086(ListAdapter adapter) {
            super.m2225(adapter);
            this.f1641 = adapter;
        }

        @Override // ♫.C0463, ♫.C0463, ♫.C0463, ♫.C0463, ♫.C0463, ♫.C0463, ♫.AbstractC0398, ♫.AbstractC0398
        /* renamed from: θ  reason: contains not printable characters */
        public CharSequence m2084() {
            return this.f1642;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m2087(CharSequence hintText) {
            this.f1642 = hintText;
        }

        @Override // ♫.C0463
        /* renamed from: Ø  reason: contains not printable characters */
        public void m2083() {
            int hOffset;
            Drawable background = m2215();
            int hOffset2 = 0;
            if (background != null) {
                background.getPadding(C0439.this.f1635);
                hOffset2 = C0498.m2371(C0439.this) ? C0439.this.f1635.right : -C0439.this.f1635.left;
            } else {
                Rect rect = C0439.this.f1635;
                rect.right = 0;
                rect.left = 0;
            }
            int spinnerPaddingLeft = C0439.this.getPaddingLeft();
            int spinnerPaddingRight = C0439.this.getPaddingRight();
            int spinnerWidth = C0439.this.getWidth();
            C0439 r5 = C0439.this;
            int i = r5.f1633;
            if (i == -2) {
                int contentWidth = r5.m2081((SpinnerAdapter) this.f1641, m2215());
                int i2 = C0439.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C0439.this.f1635;
                int contentWidthLimit = (i2 - rect2.left) - rect2.right;
                if (contentWidth > contentWidthLimit) {
                    contentWidth = contentWidthLimit;
                }
                m2210(Math.max(contentWidth, (spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight));
            } else if (i == -1) {
                m2210((spinnerWidth - spinnerPaddingLeft) - spinnerPaddingRight);
            } else {
                m2210(i);
            }
            if (C0498.m2371((View) C0439.this)) {
                hOffset = hOffset2 + ((spinnerWidth - spinnerPaddingRight) - m2200());
            } else {
                hOffset = hOffset2 + spinnerPaddingLeft;
            }
            m2201(hOffset);
        }

        @Override // ♫.C0463, ♫.C0463, ♫.C0463, ♫.C0463, ♫.C0463, ♫.C0463, ♫.AbstractC0398, ♫.AbstractC0398
        /* renamed from: θ  reason: contains not printable characters */
        public void m2085() {
            ViewTreeObserver vto;
            boolean wasShowing = m2212();
            m2083();
            m2202(2);
            super.m2219();
            m2217().setChoiceMode(1);
            m2231(C0439.this.getSelectedItemPosition());
            if (!wasShowing && (vto = C0439.this.getViewTreeObserver()) != null) {
                ViewTreeObserver.OnGlobalLayoutListener layoutListener = new ViewTreeObserver$OnGlobalLayoutListenerC0442();
                vto.addOnGlobalLayoutListener(layoutListener);
                m2226(new C0441(layoutListener));
            }
        }

        /* renamed from: ♫.报$ø$Φ  reason: contains not printable characters */
        public class ViewTreeObserver$OnGlobalLayoutListenerC0442 implements ViewTreeObserver.OnGlobalLayoutListener {
            public ViewTreeObserver$OnGlobalLayoutListenerC0442() {
            }

            public void onGlobalLayout() {
                C0440 r0 = C0440.this;
                if (!r0.m2088((View) C0439.this)) {
                    C0440.this.dismiss();
                    return;
                }
                C0440.this.m2083();
                C0440.super.m2219();
            }
        }

        /* renamed from: ♫.报$ø$ø  reason: contains not printable characters */
        public class C0441 implements PopupWindow.OnDismissListener {

            /* renamed from: θ  reason: contains not printable characters */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1644;

            public C0441(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1644 = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver vto = C0439.this.getViewTreeObserver();
                if (vto != null) {
                    vto.removeGlobalOnLayoutListener(this.f1644);
                }
            }
        }

        @Override // ♫.C0463
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m2088(View view) {
            return C0248.m1141(view) && view.getGlobalVisibleRect(this.f1640);
        }
    }
}
