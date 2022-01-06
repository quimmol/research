package ♫;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: ♫.岂  reason: contains not printable characters */
public class C0419 extends CheckedTextView {

    /* renamed from: θ  reason: contains not printable characters */
    public static final int[] f1580 = {16843016};

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0446 f1581;

    public C0419(Context context, AttributeSet attrs) {
        this(context, attrs, 16843720);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0419(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        C0485.m2285(context);
        this.f1581 = new C0446(this);
        this.f1581.m2106(attrs, defStyleAttr);
        this.f1581.m2099();
        C0488 a = C0488.m2290(getContext(), attrs, f1580, defStyleAttr, 0);
        setCheckMarkDrawable(a.m2301(0));
        a.m2304();
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int resId) {
        setCheckMarkDrawable(C0331.m1530(getContext(), resId));
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        C0446 r0 = this.f1581;
        if (r0 != null) {
            r0.m2103(context, resId);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0446 r0 = this.f1581;
        if (r0 != null) {
            r0.m2099();
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
