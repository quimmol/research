package ♫;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: ♫.ᓫ  reason: contains not printable characters */
public abstract class AbstractC0212 extends Drawable implements AbstractC0174 {

    /* renamed from: θ  reason: contains not printable characters */
    public Drawable f834;

    public void setColorFilter(int color, PorterDuff.Mode mode) {
        Drawable drawable = this.f834;
        if (drawable != null) {
            drawable.setColorFilter(color, mode);
        } else {
            super.setColorFilter(color, mode);
        }
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f834;
        if (drawable != null) {
            return C0171.m855(drawable);
        }
        return null;
    }

    public boolean onLevelChange(int level) {
        Drawable drawable = this.f834;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        return super.onLevelChange(level);
    }

    public void setHotspot(float x, float y) {
        Drawable drawable = this.f834;
        if (drawable != null) {
            C0171.m858(drawable, x, y);
        }
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Drawable drawable = this.f834;
        if (drawable != null) {
            C0171.m860(drawable, left, top, right, bottom);
        }
    }

    public void setFilterBitmap(boolean filter) {
        Drawable drawable = this.f834;
        if (drawable != null) {
            drawable.setFilterBitmap(filter);
        }
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f834;
        if (drawable != null) {
            C0171.m857(drawable);
        }
    }

    public void applyTheme(Resources.Theme t) {
        Drawable drawable = this.f834;
        if (drawable != null) {
            C0171.m862(drawable, t);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f834;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f834;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f834;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f834;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        Drawable drawable = this.f834;
        if (drawable != null) {
            return drawable.getPadding(padding);
        }
        return super.getPadding(padding);
    }

    public int[] getState() {
        Drawable drawable = this.f834;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f834;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void setChangingConfigurations(int configs) {
        Drawable drawable = this.f834;
        if (drawable != null) {
            drawable.setChangingConfigurations(configs);
        } else {
            super.setChangingConfigurations(configs);
        }
    }

    public boolean setState(int[] stateSet) {
        Drawable drawable = this.f834;
        if (drawable != null) {
            return drawable.setState(stateSet);
        }
        return super.setState(stateSet);
    }
}
