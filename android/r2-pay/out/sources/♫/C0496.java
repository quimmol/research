package ♫;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* renamed from: ♫.物  reason: contains not printable characters */
public class C0496 {

    /* renamed from: Φ  reason: contains not printable characters */
    public final int[] f1867 = new int[2];

    /* renamed from: θ  reason: contains not printable characters */
    public final Context f1868;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Rect f1869 = new Rect();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final View f1870;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final WindowManager.LayoutParams f1871 = new WindowManager.LayoutParams();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final TextView f1872;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final int[] f1873 = new int[2];

    public C0496(Context context) {
        this.f1868 = context;
        this.f1870 = LayoutInflater.from(this.f1868).inflate(C0296.abc_tooltip, (ViewGroup) null);
        this.f1872 = (TextView) this.f1870.findViewById(C0065.message);
        this.f1871.setTitle(getClass().getSimpleName());
        this.f1871.packageName = this.f1868.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f1871;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0290.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2365(View anchorView, int anchorX, int anchorY, boolean fromTouch, CharSequence tooltipText) {
        if (m2366()) {
            m2363();
        }
        this.f1872.setText(tooltipText);
        m2364(anchorView, anchorX, anchorY, fromTouch, this.f1871);
        ((WindowManager) this.f1868.getSystemService("window")).addView(this.f1870, this.f1871);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2363() {
        if (m2366()) {
            ((WindowManager) this.f1868.getSystemService("window")).removeView(this.f1870);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2366() {
        return this.f1870.getParent() != null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2364(View anchorView, int anchorX, int anchorY, boolean fromTouch, WindowManager.LayoutParams outParams) {
        int offsetX;
        int offsetBelow;
        int offsetExtra;
        int statusBarHeight;
        outParams.token = anchorView.getApplicationWindowToken();
        int tooltipPreciseAnchorThreshold = this.f1868.getResources().getDimensionPixelOffset(C0066.tooltip_precise_anchor_threshold);
        if (anchorView.getWidth() >= tooltipPreciseAnchorThreshold) {
            offsetX = anchorX;
        } else {
            offsetX = anchorView.getWidth() / 2;
        }
        if (anchorView.getHeight() >= tooltipPreciseAnchorThreshold) {
            int offsetExtra2 = this.f1868.getResources().getDimensionPixelOffset(C0066.tooltip_precise_anchor_extra_offset);
            offsetBelow = anchorY + offsetExtra2;
            offsetExtra = anchorY - offsetExtra2;
        } else {
            offsetBelow = anchorView.getHeight();
            offsetExtra = 0;
        }
        outParams.gravity = 49;
        int tooltipOffset = this.f1868.getResources().getDimensionPixelOffset(fromTouch ? C0066.tooltip_y_offset_touch : C0066.tooltip_y_offset_non_touch);
        View appView = m2362(anchorView);
        if (appView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        appView.getWindowVisibleDisplayFrame(this.f1869);
        Rect rect = this.f1869;
        if (rect.left < 0 && rect.top < 0) {
            Resources res = this.f1868.getResources();
            int resourceId = res.getIdentifier("status_bar_height", "dimen", "android");
            if (resourceId != 0) {
                statusBarHeight = res.getDimensionPixelSize(resourceId);
            } else {
                statusBarHeight = 0;
            }
            DisplayMetrics metrics = res.getDisplayMetrics();
            this.f1869.set(0, statusBarHeight, metrics.widthPixels, metrics.heightPixels);
        }
        appView.getLocationOnScreen(this.f1867);
        anchorView.getLocationOnScreen(this.f1873);
        int[] iArr = this.f1873;
        int i = iArr[0];
        int[] iArr2 = this.f1867;
        iArr[0] = i - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        outParams.x = (iArr[0] + offsetX) - (appView.getWidth() / 2);
        int spec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1870.measure(spec, spec);
        int tooltipHeight = this.f1870.getMeasuredHeight();
        int[] iArr3 = this.f1873;
        int yAbove = ((iArr3[1] + offsetExtra) - tooltipOffset) - tooltipHeight;
        int yBelow = iArr3[1] + offsetBelow + tooltipOffset;
        if (fromTouch) {
            if (yAbove >= 0) {
                outParams.y = yAbove;
            } else {
                outParams.y = yBelow;
            }
        } else if (yBelow + tooltipHeight <= this.f1869.height()) {
            outParams.y = yBelow;
        } else {
            outParams.y = yAbove;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static View m2362(View anchorView) {
        View rootView = anchorView.getRootView();
        ViewGroup.LayoutParams lp = rootView.getLayoutParams();
        if ((lp instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) lp).type == 2) {
            return rootView;
        }
        for (Context context = anchorView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
