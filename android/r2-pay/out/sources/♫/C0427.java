package ♫;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: ♫.建  reason: contains not printable characters */
public class C0427 extends EditText implements AbstractC0220 {

    /* renamed from: θ  reason: contains not printable characters */
    public final C0416 f1603;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0446 f1604;

    public C0427(Context context, AttributeSet attrs) {
        this(context, attrs, C0158.editTextStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0427(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        C0485.m2285(context);
        this.f1603 = new C0416(this);
        this.f1603.m2010(attrs, defStyleAttr);
        this.f1604 = new C0446(this);
        this.f1604.m2106(attrs, defStyleAttr);
        this.f1604.m2099();
    }

    @Override // android.widget.EditText, android.widget.EditText
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        C0416 r0 = this.f1603;
        if (r0 != null) {
            r0.m2007(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        C0416 r0 = this.f1603;
        if (r0 != null) {
            r0.m2002();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        C0416 r0 = this.f1603;
        if (r0 != null) {
            r0.m2003(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0416 r0 = this.f1603;
        if (r0 != null) {
            return r0.m2004();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        C0416 r0 = this.f1603;
        if (r0 != null) {
            r0.m2009(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0416 r0 = this.f1603;
        if (r0 != null) {
            return r0.m2005();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0416 r0 = this.f1603;
        if (r0 != null) {
            r0.m2006();
        }
        C0446 r02 = this.f1604;
        if (r02 != null) {
            r02.m2099();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        C0446 r0 = this.f1604;
        if (r0 != null) {
            r0.m2103(context, resId);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        C0428.m2057(onCreateInputConnection, outAttrs, this);
        return onCreateInputConnection;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(C0261.m1202(this, actionModeCallback));
    }
}
