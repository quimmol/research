package ♫;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: ♫.展  reason: contains not printable characters */
public class C0418 extends CheckBox implements AbstractC0267 {

    /* renamed from: θ  reason: contains not printable characters */
    public final C0420 f1578;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0446 f1579;

    public C0418(Context context, AttributeSet attrs) {
        this(context, attrs, C0158.checkboxStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0418(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        C0485.m2285(context);
        this.f1578 = new C0420(this);
        this.f1578.m2020(attrs, defStyleAttr);
        this.f1579 = new C0446(this);
        this.f1579.m2106(attrs, defStyleAttr);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        C0420 r0 = this.f1578;
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
        C0420 r1 = this.f1578;
        if (r1 != null) {
            r1.m2014(value);
        }
        return value;
    }

    public void setSupportButtonTintList(ColorStateList tint) {
        C0420 r0 = this.f1578;
        if (r0 != null) {
            r0.m2018(tint);
        }
    }

    public ColorStateList getSupportButtonTintList() {
        C0420 r0 = this.f1578;
        if (r0 != null) {
            return r0.m2015();
        }
        return null;
    }

    public void setSupportButtonTintMode(PorterDuff.Mode tintMode) {
        C0420 r0 = this.f1578;
        if (r0 != null) {
            r0.m2019(tintMode);
        }
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0420 r0 = this.f1578;
        if (r0 != null) {
            return r0.m2016();
        }
        return null;
    }
}
