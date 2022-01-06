package ♫;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* renamed from: ♫.意  reason: contains not printable characters */
public class C0435 extends RadioButton implements AbstractC0267 {

    /* renamed from: θ  reason: contains not printable characters */
    public final C0420 f1621;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0446 f1622;

    public C0435(Context context, AttributeSet attrs) {
        this(context, attrs, C0158.radioButtonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0435(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        C0485.m2285(context);
        this.f1621 = new C0420(this);
        this.f1621.m2020(attrs, defStyleAttr);
        this.f1622 = new C0446(this);
        this.f1622.m2106(attrs, defStyleAttr);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        C0420 r0 = this.f1621;
        if (r0 != null) {
            r0.m2013();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int resId) {
        setButtonDrawable(C0331.m1530(getContext(), resId));
    }

    public int getCompoundPaddingLeft() {
        int value = super.getCompoundPaddingLeft();
        C0420 r1 = this.f1621;
        if (r1 != null) {
            r1.m2014(value);
        }
        return value;
    }

    public void setSupportButtonTintList(ColorStateList tint) {
        C0420 r0 = this.f1621;
        if (r0 != null) {
            r0.m2018(tint);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        C0420 r0 = this.f1621;
        if (r0 != null) {
            return r0.m2015();
        }
        return null;
    }

    public void setSupportButtonTintMode(PorterDuff.Mode tintMode) {
        C0420 r0 = this.f1621;
        if (r0 != null) {
            r0.m2019(tintMode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0420 r0 = this.f1621;
        if (r0 != null) {
            return r0.m2016();
        }
        return null;
    }
}
