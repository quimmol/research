package ♫;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import ♫.C0263;

/* renamed from: ♫.ᵔ  reason: contains not printable characters */
public class C0268 extends C0263 {

    /* renamed from: θ  reason: contains not printable characters */
    public static Method f1005;

    public C0268(Drawable drawable) {
        super(drawable);
        m1221();
    }

    public C0268(C0263.AbstractC0265 state, Resources resources) {
        super(state, resources);
        m1221();
    }

    public void setHotspot(float x, float y) {
        ((C0263) this).f999.setHotspot(x, y);
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        ((C0263) this).f999.setHotspotBounds(left, top, right, bottom);
    }

    public void getOutline(Outline outline) {
        ((C0263) this).f999.getOutline(outline);
    }

    public Rect getDirtyBounds() {
        return ((C0263) this).f999.getDirtyBounds();
    }

    @Override // ♫.C0263
    public void setTintList(ColorStateList tint) {
        if (m1222()) {
            super.setTintList(tint);
        } else {
            ((C0263) this).f999.setTintList(tint);
        }
    }

    @Override // ♫.C0263
    public void setTint(int tintColor) {
        if (m1222()) {
            super.setTint(tintColor);
        } else {
            ((C0263) this).f999.setTint(tintColor);
        }
    }

    @Override // ♫.C0263
    public void setTintMode(PorterDuff.Mode tintMode) {
        if (m1222()) {
            super.setTintMode(tintMode);
        } else {
            ((C0263) this).f999.setTintMode(tintMode);
        }
    }

    @Override // ♫.C0263
    public boolean setState(int[] stateSet) {
        if (!super.setState(stateSet)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // ♫.C0263, ♫.C0263, ♫.C0263
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1222() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = ((C0263) this).f999;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = ((C0263) this).f999;
        if (!(drawable == null || (method = f1005) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception ex) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", ex);
            }
        }
        return false;
    }

    @Override // ♫.C0263, ♫.C0263, ♫.C0263
    /* renamed from: θ  reason: contains not printable characters */
    public C0263.AbstractC0265 m1220() {
        return new C0269(((C0263) this).f1000, null);
    }

    /* renamed from: ♫.ᵔ$θ  reason: contains not printable characters */
    public static class C0269 extends C0263.AbstractC0265 {
        public C0269(C0263.AbstractC0265 orig, Resources res) {
            super(orig);
        }

        @Override // ♫.C0263.AbstractC0265
        public Drawable newDrawable(Resources res) {
            return new C0268(this, res);
        }
    }

    @Override // ♫.C0263, ♫.C0263, ♫.C0263
    /* renamed from: θ  reason: contains not printable characters */
    public final void m1221() {
        if (f1005 == null) {
            try {
                f1005 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception ex) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", ex);
            }
        }
    }
}
