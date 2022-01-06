package ♫;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;

/* renamed from: ♫.找  reason: contains not printable characters */
public class C0438 extends C0434 {

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean f1625 = false;

    /* renamed from: θ  reason: contains not printable characters */
    public ColorStateList f1626 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public PorterDuff.Mode f1627 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f1628;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final SeekBar f1629;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1630 = false;

    public C0438(SeekBar view) {
        super(view);
        this.f1629 = view;
    }

    @Override // ♫.C0434
    /* renamed from: θ  reason: contains not printable characters */
    public void m2080(AttributeSet attrs, int defStyleAttr) {
        super.m2074(attrs, defStyleAttr);
        C0488 a = C0488.m2290(this.f1629.getContext(), attrs, C0291.AppCompatSeekBar, defStyleAttr, 0);
        Drawable drawable = a.m2296(C0291.AppCompatSeekBar_android_thumb);
        if (drawable != null) {
            this.f1629.setThumb(drawable);
        }
        m2079(a.m2301(C0291.AppCompatSeekBar_tickMark));
        if (a.m2305(C0291.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1627 = C0452.m2151(a.m2292(C0291.AppCompatSeekBar_tickMarkTintMode, -1), this.f1627);
            this.f1625 = true;
        }
        if (a.m2305(C0291.AppCompatSeekBar_tickMarkTint)) {
            this.f1626 = a.m2299(C0291.AppCompatSeekBar_tickMarkTint);
            this.f1630 = true;
        }
        a.m2304();
        m2077();
    }

    @Override // ♫.C0434
    /* renamed from: θ  reason: contains not printable characters */
    public void m2079(Drawable tickMark) {
        Drawable drawable = this.f1628;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1628 = tickMark;
        if (tickMark != null) {
            tickMark.setCallback(this.f1629);
            C0171.m867(tickMark, C0248.m1146((View) this.f1629));
            if (tickMark.isStateful()) {
                tickMark.setState(this.f1629.getDrawableState());
            }
            m2077();
        }
        this.f1629.invalidate();
    }

    @Override // ♫.C0434, ♫.C0434
    /* renamed from: θ  reason: contains not printable characters */
    public final void m2077() {
        if (this.f1628 == null) {
            return;
        }
        if (this.f1630 || this.f1625) {
            this.f1628 = C0171.m856(this.f1628.mutate());
            if (this.f1630) {
                C0171.m861(this.f1628, this.f1626);
            }
            if (this.f1625) {
                C0171.m864(this.f1628, this.f1627);
            }
            if (this.f1628.isStateful()) {
                this.f1628.setState(this.f1629.getDrawableState());
            }
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2075() {
        Drawable drawable = this.f1628;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2076() {
        Drawable tickMark = this.f1628;
        if (tickMark != null && tickMark.isStateful() && tickMark.setState(this.f1629.getDrawableState())) {
            this.f1629.invalidateDrawable(tickMark);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2078(Canvas canvas) {
        if (this.f1628 != null) {
            int count = this.f1629.getMax();
            int halfH = 1;
            if (count > 1) {
                int w = this.f1628.getIntrinsicWidth();
                int h = this.f1628.getIntrinsicHeight();
                int halfW = w >= 0 ? w / 2 : 1;
                if (h >= 0) {
                    halfH = h / 2;
                }
                this.f1628.setBounds(-halfW, -halfH, halfW, halfH);
                float spacing = ((float) ((this.f1629.getWidth() - this.f1629.getPaddingLeft()) - this.f1629.getPaddingRight())) / ((float) count);
                int saveCount = canvas.save();
                canvas.translate((float) this.f1629.getPaddingLeft(), (float) (this.f1629.getHeight() / 2));
                for (int i = 0; i <= count; i++) {
                    this.f1628.draw(canvas);
                    canvas.translate(spacing, 0.0f);
                }
                canvas.restoreToCount(saveCount);
            }
        }
    }
}
