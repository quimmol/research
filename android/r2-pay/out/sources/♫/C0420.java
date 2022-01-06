package ♫;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: ♫.工  reason: contains not printable characters */
public class C0420 {

    /* renamed from: ø  reason: contains not printable characters */
    public boolean f1582;

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean f1583 = false;

    /* renamed from: θ  reason: contains not printable characters */
    public ColorStateList f1584 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public PorterDuff.Mode f1585 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final CompoundButton f1586;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1587 = false;

    public C0420(CompoundButton view) {
        this.f1586 = view;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2020(AttributeSet attrs, int defStyleAttr) {
        int resourceId;
        TypedArray a = this.f1586.getContext().obtainStyledAttributes(attrs, C0291.CompoundButton, defStyleAttr, 0);
        try {
            if (a.hasValue(C0291.CompoundButton_android_button) && (resourceId = a.getResourceId(C0291.CompoundButton_android_button, 0)) != 0) {
                this.f1586.setButtonDrawable(C0331.m1530(this.f1586.getContext(), resourceId));
            }
            if (a.hasValue(C0291.CompoundButton_buttonTint)) {
                C0181.m886(this.f1586, a.getColorStateList(C0291.CompoundButton_buttonTint));
            }
            if (a.hasValue(C0291.CompoundButton_buttonTintMode)) {
                C0181.m887(this.f1586, C0452.m2151(a.getInt(C0291.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            a.recycle();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2018(ColorStateList tint) {
        this.f1584 = tint;
        this.f1587 = true;
        m2017();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ColorStateList m2015() {
        return this.f1584;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2019(PorterDuff.Mode tintMode) {
        this.f1585 = tintMode;
        this.f1583 = true;
        m2017();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public PorterDuff.Mode m2016() {
        return this.f1585;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2013() {
        if (this.f1582) {
            this.f1582 = false;
            return;
        }
        this.f1582 = true;
        m2017();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2017() {
        Drawable buttonDrawable = C0181.m885(this.f1586);
        if (buttonDrawable == null) {
            return;
        }
        if (this.f1587 || this.f1583) {
            Drawable buttonDrawable2 = C0171.m856(buttonDrawable).mutate();
            if (this.f1587) {
                C0171.m861(buttonDrawable2, this.f1584);
            }
            if (this.f1583) {
                C0171.m864(buttonDrawable2, this.f1585);
            }
            if (buttonDrawable2.isStateful()) {
                buttonDrawable2.setState(this.f1586.getDrawableState());
            }
            this.f1586.setButtonDrawable(buttonDrawable2);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2014(int superValue) {
        int i = Build.VERSION.SDK_INT;
        return superValue;
    }
}
