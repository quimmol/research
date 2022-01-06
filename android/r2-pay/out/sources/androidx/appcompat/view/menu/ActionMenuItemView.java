package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import ♫.AbstractC0394;
import ♫.AbstractC0398;
import ♫.AbstractView$OnTouchListenerC0458;
import ♫.C0291;
import ♫.C0375;
import ♫.C0380;
import ♫.C0448;
import ♫.C0492;

public class ActionMenuItemView extends C0448 implements AbstractC0394.AbstractC0395, View.OnClickListener, ActionMenuView.AbstractC0025 {

    /* renamed from: ø  reason: contains not printable characters */
    public int f120;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f121;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f122;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f123;

    /* renamed from: θ  reason: contains not printable characters */
    public int f124;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f125;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0013 f126;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public CharSequence f127;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0375.AbstractC0376 f128;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0380 f129;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractView$OnTouchListenerC0458 f130;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$Φ  reason: contains not printable characters */
    public static abstract class AbstractC0013 {
        /* renamed from: θ  reason: contains not printable characters */
        public abstract AbstractC0398 m57();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Resources res = context.getResources();
        this.f123 = m51();
        TypedArray a = context.obtainStyledAttributes(attrs, C0291.ActionMenuItemView, defStyle, 0);
        this.f124 = a.getDimensionPixelSize(C0291.ActionMenuItemView_android_minWidth, 0);
        a.recycle();
        this.f120 = (int) ((32.0f * res.getDisplayMetrics().density) + 0.5f);
        setOnClickListener(this);
        this.f122 = -1;
        setSaveEnabled(false);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.f123 = m51();
        m53();
    }

    /* renamed from: ö  reason: contains not printable characters */
    public final boolean m51() {
        Configuration config = getContext().getResources().getConfiguration();
        int widthDp = config.screenWidthDp;
        return widthDp >= 480 || (widthDp >= 640 && config.screenHeightDp >= 480) || config.orientation == 2;
    }

    public void setPadding(int l, int t, int r, int b) {
        this.f122 = l;
        super.setPadding(l, t, r, b);
    }

    @Override // ♫.AbstractC0394.AbstractC0395
    public C0380 getItemData() {
        return this.f129;
    }

    @Override // ♫.AbstractC0394.AbstractC0395
    /* renamed from: θ  reason: contains not printable characters */
    public void m55(C0380 itemData, int menuType) {
        this.f129 = itemData;
        setIcon(itemData.getIcon());
        setTitle(itemData.m1844((AbstractC0394.AbstractC0395) this));
        setId(itemData.getItemId());
        setVisibility(itemData.isVisible() ? 0 : 8);
        setEnabled(itemData.isEnabled());
        if (itemData.hasSubMenu() && this.f130 == null) {
            this.f130 = new C0014();
        }
    }

    public boolean onTouchEvent(MotionEvent e) {
        AbstractView$OnTouchListenerC0458 r0;
        if (!this.f129.hasSubMenu() || (r0 = this.f130) == null || !r0.onTouch(this, e)) {
            return super.onTouchEvent(e);
        }
        return true;
    }

    public void onClick(View v) {
        C0375.AbstractC0376 r0 = this.f128;
        if (r0 != null) {
            r0.m1823(this.f129);
        }
    }

    public void setItemInvoker(C0375.AbstractC0376 invoker) {
        this.f128 = invoker;
    }

    public void setPopupCallback(AbstractC0013 popupCallback) {
        this.f126 = popupCallback;
    }

    @Override // ♫.AbstractC0394.AbstractC0395, ♫.C0448
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m56() {
        return true;
    }

    public void setCheckable(boolean checkable) {
    }

    public void setChecked(boolean checked) {
    }

    public void setExpandedFormat(boolean expandedFormat) {
        if (this.f121 != expandedFormat) {
            this.f121 = expandedFormat;
            C0380 r0 = this.f129;
            if (r0 != null) {
                r0.m1851();
            }
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0025
    /* renamed from: Φ  reason: contains not printable characters */
    public final void m53() {
        boolean z = true;
        boolean visible = !TextUtils.isEmpty(this.f127);
        if (this.f125 != null && (!this.f129.m1858() || (!this.f123 && !this.f121))) {
            z = false;
        }
        boolean visible2 = visible & z;
        CharSequence charSequence = null;
        setText(visible2 ? this.f127 : null);
        CharSequence contentDescription = this.f129.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(visible2 ? null : this.f129.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f129.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!visible2) {
                charSequence = this.f129.getTitle();
            }
            C0492.m2353(this, charSequence);
            return;
        }
        C0492.m2353(this, tooltipText);
    }

    public void setIcon(Drawable icon) {
        this.f125 = icon;
        if (icon != null) {
            int width = icon.getIntrinsicWidth();
            int height = icon.getIntrinsicHeight();
            int i = this.f120;
            if (width > i) {
                float scale = ((float) i) / ((float) width);
                width = this.f120;
                height = (int) (((float) height) * scale);
            }
            int i2 = this.f120;
            if (height > i2) {
                float scale2 = ((float) i2) / ((float) height);
                height = this.f120;
                width = (int) (((float) width) * scale2);
            }
            icon.setBounds(0, 0, width, height);
        }
        setCompoundDrawables(icon, null, null, null);
        m53();
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m50() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence title) {
        this.f127 = title;
        m53();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0025
    /* renamed from: ø  reason: contains not printable characters */
    public boolean m52() {
        return m50() && this.f129.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0025
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m54() {
        return m50();
    }

    @Override // ♫.C0448
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        boolean textVisible = m50();
        if (textVisible && (i = this.f122) >= 0) {
            super.setPadding(i, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = View.MeasureSpec.getSize(widthMeasureSpec);
        int oldMeasuredWidth = getMeasuredWidth();
        int targetWidth = widthMode == Integer.MIN_VALUE ? Math.min(widthSize, this.f124) : this.f124;
        if (widthMode != 1073741824 && this.f124 > 0 && oldMeasuredWidth < targetWidth) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(targetWidth, 1073741824), heightMeasureSpec);
        }
        if (!textVisible && this.f125 != null) {
            super.setPadding((getMeasuredWidth() - this.f125.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$θ  reason: contains not printable characters */
    public class C0014 extends AbstractView$OnTouchListenerC0458 {
        public C0014() {
            super(ActionMenuItemView.this);
        }

        @Override // ♫.AbstractView$OnTouchListenerC0458, ♫.AbstractView$OnTouchListenerC0458, ♫.AbstractView$OnTouchListenerC0458
        /* renamed from: θ  reason: contains not printable characters */
        public AbstractC0398 m58() {
            AbstractC0013 r0 = ActionMenuItemView.this.f126;
            if (r0 != null) {
                return r0.m57();
            }
            return null;
        }

        @Override // ♫.AbstractView$OnTouchListenerC0458, ♫.AbstractView$OnTouchListenerC0458, ♫.AbstractView$OnTouchListenerC0458
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m59() {
            AbstractC0398 popup;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0375.AbstractC0376 r1 = actionMenuItemView.f128;
            if (r1 == null || !r1.m1823(actionMenuItemView.f129) || (popup = m58()) == null || !popup.m1922()) {
                return false;
            }
            return true;
        }
    }

    public void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(null);
    }
}
