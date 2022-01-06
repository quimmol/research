package ♫;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: ♫.微  reason: contains not printable characters */
public class C0432 extends MultiAutoCompleteTextView implements AbstractC0220 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final int[] f1613 = {16843126};

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0416 f1614;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0446 f1615;

    public C0432(Context context, AttributeSet attrs) {
        this(context, attrs, C0158.autoCompleteTextViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0432(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        C0485.m2285(context);
        C0488 a = C0488.m2290(getContext(), attrs, f1613, defStyleAttr, 0);
        if (a.m2305(0)) {
            setDropDownBackgroundDrawable(a.m2301(0));
        }
        a.m2304();
        this.f1614 = new C0416(this);
        this.f1614.m2010(attrs, defStyleAttr);
        this.f1615 = new C0446(this);
        this.f1615.m2106(attrs, defStyleAttr);
        this.f1615.m2099();
    }

    public void setDropDownBackgroundResource(int resId) {
        setDropDownBackgroundDrawable(C0331.m1530(getContext(), resId));
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        C0416 r0 = this.f1614;
        if (r0 != null) {
            r0.m2007(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        C0416 r0 = this.f1614;
        if (r0 != null) {
            r0.m2002();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        C0416 r0 = this.f1614;
        if (r0 != null) {
            r0.m2003(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0416 r0 = this.f1614;
        if (r0 != null) {
            return r0.m2004();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        C0416 r0 = this.f1614;
        if (r0 != null) {
            r0.m2009(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0416 r0 = this.f1614;
        if (r0 != null) {
            return r0.m2005();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0416 r0 = this.f1614;
        if (r0 != null) {
            r0.m2006();
        }
        C0446 r02 = this.f1615;
        if (r02 != null) {
            r02.m2099();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        C0446 r0 = this.f1615;
        if (r0 != null) {
            r0.m2103(context, resId);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        C0428.m2057(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }
}
