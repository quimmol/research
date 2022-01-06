package ♫;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: ♫.他  reason: contains not printable characters */
public class C0345 extends Drawable implements Drawable.Callback {

    /* renamed from: θ  reason: contains not printable characters */
    public Drawable f1257;

    public C0345(Drawable drawable) {
        m1606(drawable);
    }

    public void draw(Canvas canvas) {
        this.f1257.draw(canvas);
    }

    public void onBoundsChange(Rect bounds) {
        this.f1257.setBounds(bounds);
    }

    public void setChangingConfigurations(int configs) {
        this.f1257.setChangingConfigurations(configs);
    }

    public int getChangingConfigurations() {
        return this.f1257.getChangingConfigurations();
    }

    public void setDither(boolean dither) {
        this.f1257.setDither(dither);
    }

    public void setFilterBitmap(boolean filter) {
        this.f1257.setFilterBitmap(filter);
    }

    public void setAlpha(int alpha) {
        this.f1257.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f1257.setColorFilter(cf);
    }

    public boolean isStateful() {
        return this.f1257.isStateful();
    }

    public boolean setState(int[] stateSet) {
        return this.f1257.setState(stateSet);
    }

    public int[] getState() {
        return this.f1257.getState();
    }

    public void jumpToCurrentState() {
        C0171.m857(this.f1257);
    }

    public Drawable getCurrent() {
        return this.f1257.getCurrent();
    }

    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.f1257.setVisible(visible, restart);
    }

    public int getOpacity() {
        return this.f1257.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f1257.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f1257.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f1257.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f1257.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f1257.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        return this.f1257.getPadding(padding);
    }

    public void invalidateDrawable(Drawable who) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        scheduleSelf(what, when);
    }

    public void unscheduleDrawable(Drawable who, Runnable what) {
        unscheduleSelf(what);
    }

    public boolean onLevelChange(int level) {
        return this.f1257.setLevel(level);
    }

    public void setAutoMirrored(boolean mirrored) {
        C0171.m865(this.f1257, mirrored);
    }

    public boolean isAutoMirrored() {
        return C0171.m853(this.f1257);
    }

    public void setTint(int tint) {
        C0171.m859(this.f1257, tint);
    }

    public void setTintList(ColorStateList tint) {
        C0171.m861(this.f1257, tint);
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        C0171.m864(this.f1257, tintMode);
    }

    public void setHotspot(float x, float y) {
        C0171.m858(this.f1257, x, y);
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        C0171.m860(this.f1257, left, top, right, bottom);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Drawable m1605() {
        return this.f1257;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1606(Drawable drawable) {
        Drawable drawable2 = this.f1257;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1257 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
