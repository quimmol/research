package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import ♫.C0248;
import ♫.LayoutInflater$Factory2C0302;

public class ContentFrameLayout extends FrameLayout {

    /* renamed from: µ  reason: contains not printable characters */
    public TypedValue f228;

    /* renamed from: Ø  reason: contains not printable characters */
    public TypedValue f229;

    /* renamed from: ö  reason: contains not printable characters */
    public TypedValue f230;

    /* renamed from: ø  reason: contains not printable characters */
    public TypedValue f231;

    /* renamed from: Φ  reason: contains not printable characters */
    public TypedValue f232;

    /* renamed from: θ  reason: contains not printable characters */
    public final Rect f233;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public TypedValue f234;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0026 f235;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$θ  reason: contains not printable characters */
    public interface AbstractC0026 {
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f233 = new Rect();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m133(Rect insets) {
        fitSystemWindows(insets);
    }

    public void setAttachListener(AbstractC0026 attachListener) {
        this.f235 = attachListener;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m132(int left, int top, int right, int bottom) {
        this.f233.set(left, top, right, bottom);
        if (C0248.m1138(this)) {
            requestLayout();
        }
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i;
        int i2;
        int i3;
        DisplayMetrics metrics = getContext().getResources().getDisplayMetrics();
        boolean isPortrait = metrics.widthPixels < metrics.heightPixels;
        int widthMode = View.MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = View.MeasureSpec.getMode(heightMeasureSpec);
        boolean fixedWidth = false;
        if (widthMode == Integer.MIN_VALUE) {
            TypedValue tvw = isPortrait ? this.f229 : this.f231;
            if (!(tvw == null || (i3 = tvw.type) == 0)) {
                int w = 0;
                if (i3 == 5) {
                    w = (int) tvw.getDimension(metrics);
                } else if (i3 == 6) {
                    int i4 = metrics.widthPixels;
                    w = (int) tvw.getFraction((float) i4, (float) i4);
                }
                if (w > 0) {
                    Rect rect = this.f233;
                    widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(w - (rect.left + rect.right), View.MeasureSpec.getSize(widthMeasureSpec)), 1073741824);
                    fixedWidth = true;
                }
            }
        }
        if (heightMode == Integer.MIN_VALUE) {
            TypedValue tvh = isPortrait ? this.f230 : this.f228;
            if (!(tvh == null || (i2 = tvh.type) == 0)) {
                int h = 0;
                if (i2 == 5) {
                    h = (int) tvh.getDimension(metrics);
                } else if (i2 == 6) {
                    int i5 = metrics.heightPixels;
                    h = (int) tvh.getFraction((float) i5, (float) i5);
                }
                if (h > 0) {
                    Rect rect2 = this.f233;
                    heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(h - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(heightMeasureSpec)), 1073741824);
                }
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMeasuredWidth();
        boolean measure = false;
        int widthMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        if (!fixedWidth && widthMode == Integer.MIN_VALUE) {
            TypedValue tv = isPortrait ? this.f232 : this.f234;
            if (!(tv == null || (i = tv.type) == 0)) {
                int min = 0;
                if (i == 5) {
                    min = (int) tv.getDimension(metrics);
                } else if (i == 6) {
                    int i6 = metrics.widthPixels;
                    min = (int) tv.getFraction((float) i6, (float) i6);
                }
                if (min > 0) {
                    Rect rect3 = this.f233;
                    min -= rect3.left + rect3.right;
                }
                if (width < min) {
                    widthMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
                    measure = true;
                }
            }
        }
        if (measure) {
            super.onMeasure(widthMeasureSpec2, heightMeasureSpec);
        }
    }

    public TypedValue getMinWidthMajor() {
        if (this.f234 == null) {
            this.f234 = new TypedValue();
        }
        return this.f234;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f232 == null) {
            this.f232 = new TypedValue();
        }
        return this.f232;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f231 == null) {
            this.f231 = new TypedValue();
        }
        return this.f231;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f229 == null) {
            this.f229 = new TypedValue();
        }
        return this.f229;
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f230 == null) {
            this.f230 = new TypedValue();
        }
        return this.f230;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f228 == null) {
            this.f228 = new TypedValue();
        }
        return this.f228;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC0026 r0 = this.f235;
        if (r0 != null) {
            ((LayoutInflater$Factory2C0302.C0306) r0).m1428();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC0026 r0 = this.f235;
        if (r0 != null) {
            ((LayoutInflater$Factory2C0302.C0306) r0).m1427();
        }
    }
}
