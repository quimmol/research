package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ♫.AbstractC0456;
import ♫.LayoutInflater$Factory2C0302;

public class FitWindowsLinearLayout extends LinearLayout implements AbstractC0456 {

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0456.AbstractC0457 f237;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setOnFitSystemWindowsListener(AbstractC0456.AbstractC0457 listener) {
        this.f237 = listener;
    }

    public boolean fitSystemWindows(Rect insets) {
        AbstractC0456.AbstractC0457 r0 = this.f237;
        if (r0 != null) {
            ((LayoutInflater$Factory2C0302.C0305) r0).m1426(insets);
        }
        return super.fitSystemWindows(insets);
    }
}
