package ♫;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* renamed from: ♫.里  reason: contains not printable characters */
public class C0562 extends AbstractC0563 {

    /* renamed from: ø  reason: contains not printable characters */
    public int f2187;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f2188;

    /* renamed from: θ  reason: contains not printable characters */
    public C0541 f2189;

    public C0562(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public int getType() {
        return this.f2188;
    }

    public void setType(int type) {
        this.f2188 = type;
        this.f2187 = type;
        int i = Build.VERSION.SDK_INT;
        if (1 == getResources().getConfiguration().getLayoutDirection()) {
            int i2 = this.f2188;
            if (i2 == 5) {
                this.f2187 = 1;
            } else if (i2 == 6) {
                this.f2187 = 0;
            }
        } else {
            int i3 = this.f2188;
            if (i3 == 5) {
                this.f2187 = 0;
            } else if (i3 == 6) {
                this.f2187 = 1;
            }
        }
        this.f2189.m2602(this.f2187);
    }

    @Override // ♫.AbstractC0563
    /* renamed from: θ  reason: contains not printable characters */
    public void m2790(AttributeSet attrs) {
        super.m2794(attrs);
        this.f2189 = new C0541();
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, C0572.ConstraintLayout_Layout);
            int N = a.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a.getIndex(i);
                if (attr == C0572.ConstraintLayout_Layout_barrierDirection) {
                    setType(a.getInt(attr, 0));
                } else if (attr == C0572.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f2189.m2598(a.getBoolean(attr, true));
                }
            }
        }
        ((AbstractC0563) this).f2194 = this.f2189;
        m2791();
    }

    public void setAllowsGoneWidget(boolean supportGone) {
        this.f2189.m2598(supportGone);
    }
}
