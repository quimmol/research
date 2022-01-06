package ♫;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: ♫.快  reason: contains not printable characters */
public class C0433 extends PopupWindow {

    /* renamed from: Φ  reason: contains not printable characters */
    public static final boolean f1616 = false;

    /* renamed from: θ  reason: contains not printable characters */
    public boolean f1617;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public C0433(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        m2068(context, attrs, defStyleAttr, defStyleRes);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2068(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        C0488 a = C0488.m2290(context, attrs, C0291.PopupWindow, defStyleAttr, defStyleRes);
        if (a.m2305(C0291.PopupWindow_overlapAnchor)) {
            m2069(a.m2306(C0291.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.m2301(C0291.PopupWindow_android_popupBackground));
        a.m2304();
    }

    public void showAsDropDown(View anchor, int xoff, int yoff) {
        if (f1616 && this.f1617) {
            yoff -= anchor.getHeight();
        }
        super.showAsDropDown(anchor, xoff, yoff);
    }

    public void showAsDropDown(View anchor, int xoff, int yoff, int gravity) {
        if (f1616 && this.f1617) {
            yoff -= anchor.getHeight();
        }
        super.showAsDropDown(anchor, xoff, yoff, gravity);
    }

    @Override // android.widget.PopupWindow
    public void update(View anchor, int xoff, int yoff, int width, int height) {
        if (f1616 && this.f1617) {
            yoff -= anchor.getHeight();
        }
        super.update(anchor, xoff, yoff, width, height);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2069(boolean overlapAnchor) {
        if (f1616) {
            this.f1617 = overlapAnchor;
        } else {
            C0247.m1137(this, overlapAnchor);
        }
    }
}
