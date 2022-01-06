package ♫;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: ♫.ᵎ  reason: contains not printable characters */
public class C0263 extends Drawable implements Drawable.Callback, AbstractC0253, AbstractC0174 {

    /* renamed from: Φ  reason: contains not printable characters */
    public static final PorterDuff.Mode f994 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ø  reason: contains not printable characters */
    public boolean f995;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f996;

    /* renamed from: θ  reason: contains not printable characters */
    public int f997;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public PorterDuff.Mode f998;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f999;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0265 f1000;

    public C0263(AbstractC0265 state, Resources res) {
        this.f1000 = state;
        m1215(res);
    }

    public C0263(Drawable dr) {
        this.f1000 = m1214();
        m1216(dr);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1215(Resources res) {
        Drawable.ConstantState constantState;
        AbstractC0265 r0 = this.f1000;
        if (r0 != null && (constantState = r0.f1004) != null) {
            m1216(constantState.newDrawable(res));
        }
    }

    public void jumpToCurrentState() {
        this.f999.jumpToCurrentState();
    }

    public void draw(Canvas canvas) {
        this.f999.draw(canvas);
    }

    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f999;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    public void setChangingConfigurations(int configs) {
        this.f999.setChangingConfigurations(configs);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        AbstractC0265 r1 = this.f1000;
        return changingConfigurations | (r1 != null ? r1.getChangingConfigurations() : 0) | this.f999.getChangingConfigurations();
    }

    public void setDither(boolean dither) {
        this.f999.setDither(dither);
    }

    public void setFilterBitmap(boolean filter) {
        this.f999.setFilterBitmap(filter);
    }

    public void setAlpha(int alpha) {
        this.f999.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f999.setColorFilter(cf);
    }

    public boolean isStateful() {
        AbstractC0265 r0;
        ColorStateList tintList = (!m1217() || (r0 = this.f1000) == null) ? null : r0.f1002;
        return (tintList != null && tintList.isStateful()) || this.f999.isStateful();
    }

    public boolean setState(int[] stateSet) {
        return m1218(stateSet) || this.f999.setState(stateSet);
    }

    public int[] getState() {
        return this.f999.getState();
    }

    public Drawable getCurrent() {
        return this.f999.getCurrent();
    }

    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.f999.setVisible(visible, restart);
    }

    public int getOpacity() {
        return this.f999.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f999.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f999.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f999.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f999.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f999.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        return this.f999.getPadding(padding);
    }

    public void setAutoMirrored(boolean mirrored) {
        this.f999.setAutoMirrored(mirrored);
    }

    public boolean isAutoMirrored() {
        return this.f999.isAutoMirrored();
    }

    public Drawable.ConstantState getConstantState() {
        AbstractC0265 r0 = this.f1000;
        if (r0 == null || !r0.m1219()) {
            return null;
        }
        this.f1000.f1001 = getChangingConfigurations();
        return this.f1000;
    }

    public Drawable mutate() {
        if (!this.f995 && super.mutate() == this) {
            this.f1000 = m1214();
            Drawable drawable = this.f999;
            if (drawable != null) {
                drawable.mutate();
            }
            AbstractC0265 r0 = this.f1000;
            if (r0 != null) {
                Drawable drawable2 = this.f999;
                r0.f1004 = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f995 = true;
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0265 m1214() {
        return new C0264(this.f1000, null);
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
        return this.f999.setLevel(level);
    }

    public void setTint(int tint) {
        setTintList(ColorStateList.valueOf(tint));
    }

    public void setTintList(ColorStateList tint) {
        this.f1000.f1002 = tint;
        m1218(getState());
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        this.f1000.f1003 = tintMode;
        m1218(getState());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m1218(int[] state) {
        if (!m1217()) {
            return false;
        }
        AbstractC0265 r0 = this.f1000;
        ColorStateList tintList = r0.f1002;
        PorterDuff.Mode tintMode = r0.f1003;
        if (tintList == null || tintMode == null) {
            this.f996 = false;
            clearColorFilter();
        } else {
            int color = tintList.getColorForState(state, tintList.getDefaultColor());
            if (!(this.f996 && color == this.f997 && tintMode == this.f998)) {
                setColorFilter(color, tintMode);
                this.f997 = color;
                this.f998 = tintMode;
                this.f996 = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Drawable m1213() {
        return this.f999;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1216(Drawable dr) {
        Drawable drawable = this.f999;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f999 = dr;
        if (dr != null) {
            dr.setCallback(this);
            setVisible(dr.isVisible(), true);
            setState(dr.getState());
            setLevel(dr.getLevel());
            setBounds(dr.getBounds());
            AbstractC0265 r0 = this.f1000;
            if (r0 != null) {
                r0.f1004 = dr.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1217() {
        return true;
    }

    /* renamed from: ♫.ᵎ$θ  reason: contains not printable characters */
    public static abstract class AbstractC0265 extends Drawable.ConstantState {

        /* renamed from: θ  reason: contains not printable characters */
        public int f1001;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public ColorStateList f1002 = null;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public PorterDuff.Mode f1003 = C0263.f994;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Drawable.ConstantState f1004;

        public abstract Drawable newDrawable(Resources resources);

        public AbstractC0265(AbstractC0265 orig) {
            if (orig != null) {
                this.f1001 = orig.f1001;
                this.f1004 = orig.f1004;
                this.f1002 = orig.f1002;
                this.f1003 = orig.f1003;
            }
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public int getChangingConfigurations() {
            int i = this.f1001;
            Drawable.ConstantState constantState = this.f1004;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1219() {
            return this.f1004 != null;
        }
    }

    /* renamed from: ♫.ᵎ$Φ  reason: contains not printable characters */
    public static class C0264 extends AbstractC0265 {
        public C0264(AbstractC0265 orig, Resources res) {
            super(orig);
        }

        @Override // ♫.C0263.AbstractC0265
        public Drawable newDrawable(Resources res) {
            return new C0263(this, res);
        }
    }
}
