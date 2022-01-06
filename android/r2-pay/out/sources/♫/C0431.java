package ♫;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: ♫.得  reason: contains not printable characters */
public class C0431 extends ImageView implements AbstractC0220, AbstractC0273 {

    /* renamed from: θ  reason: contains not printable characters */
    public final C0416 f1611;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0430 f1612;

    public C0431(Context context) {
        this(context, null);
    }

    public C0431(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0431(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        C0485.m2285(context);
        this.f1611 = new C0416(this);
        this.f1611.m2010(attrs, defStyleAttr);
        this.f1612 = new C0430(this);
        this.f1612.m2065(attrs, defStyleAttr);
    }

    public void setImageResource(int resId) {
        C0430 r0 = this.f1612;
        if (r0 != null) {
            r0.m2062(resId);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0430 r0 = this.f1612;
        if (r0 != null) {
            r0.m2061();
        }
    }

    public void setImageBitmap(Bitmap bm) {
        super.setImageBitmap(bm);
        C0430 r0 = this.f1612;
        if (r0 != null) {
            r0.m2061();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0430 r0 = this.f1612;
        if (r0 != null) {
            r0.m2061();
        }
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        C0416 r0 = this.f1611;
        if (r0 != null) {
            r0.m2007(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        C0416 r0 = this.f1611;
        if (r0 != null) {
            r0.m2002();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        C0416 r0 = this.f1611;
        if (r0 != null) {
            r0.m2003(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0416 r0 = this.f1611;
        if (r0 != null) {
            return r0.m2004();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        C0416 r0 = this.f1611;
        if (r0 != null) {
            r0.m2009(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0416 r0 = this.f1611;
        if (r0 != null) {
            return r0.m2005();
        }
        return null;
    }

    public void setSupportImageTintList(ColorStateList tint) {
        C0430 r0 = this.f1612;
        if (r0 != null) {
            r0.m2063(tint);
        }
    }

    public ColorStateList getSupportImageTintList() {
        C0430 r0 = this.f1612;
        if (r0 != null) {
            return r0.m2059();
        }
        return null;
    }

    public void setSupportImageTintMode(PorterDuff.Mode tintMode) {
        C0430 r0 = this.f1612;
        if (r0 != null) {
            r0.m2064(tintMode);
        }
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0430 r0 = this.f1612;
        if (r0 != null) {
            return r0.m2060();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0416 r0 = this.f1611;
        if (r0 != null) {
            r0.m2006();
        }
        C0430 r02 = this.f1612;
        if (r02 != null) {
            r02.m2061();
        }
    }

    public boolean hasOverlappingRendering() {
        return this.f1612.m2066() && super.hasOverlappingRendering();
    }
}
