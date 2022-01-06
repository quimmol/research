package ♫;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: ♫.思  reason: contains not printable characters */
public class C0434 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final int[] f1618 = {16843067, 16843068};

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Bitmap f1619;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final ProgressBar f1620;

    public C0434(ProgressBar view) {
        this.f1620 = view;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2074(AttributeSet attrs, int defStyleAttr) {
        C0488 a = C0488.m2290(this.f1620.getContext(), attrs, f1618, defStyleAttr, 0);
        Drawable drawable = a.m2296(0);
        if (drawable != null) {
            this.f1620.setIndeterminateDrawable(m2071(drawable));
        }
        Drawable drawable2 = a.m2296(1);
        if (drawable2 != null) {
            this.f1620.setProgressDrawable(m2072(drawable2, false));
        }
        a.m2304();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Drawable m2072(Drawable drawable, boolean clip) {
        if (drawable instanceof AbstractC0253) {
            Drawable inner = ((C0263) drawable).m1213();
            if (inner != null) {
                ((C0263) drawable).m1216(m2072(inner, clip));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable background = (LayerDrawable) drawable;
            int N = background.getNumberOfLayers();
            Drawable[] outDrawables = new Drawable[N];
            for (int i = 0; i < N; i++) {
                int id = background.getId(i);
                outDrawables[i] = m2072(background.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable newBg = new LayerDrawable(outDrawables);
            for (int i2 = 0; i2 < N; i2++) {
                newBg.setId(i2, background.getId(i2));
            }
            return newBg;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap tileBitmap = bitmapDrawable.getBitmap();
            if (this.f1619 == null) {
                this.f1619 = tileBitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m2073());
            shapeDrawable.getPaint().setShader(new BitmapShader(tileBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return clip ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Drawable m2071(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable background = (AnimationDrawable) drawable;
        int N = background.getNumberOfFrames();
        AnimationDrawable newBg = new AnimationDrawable();
        newBg.setOneShot(background.isOneShot());
        for (int i = 0; i < N; i++) {
            Drawable frame = m2072(background.getFrame(i), true);
            frame.setLevel(10000);
            newBg.addFrame(frame, background.getDuration(i));
        }
        newBg.setLevel(10000);
        return newBg;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Shape m2073() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Bitmap m2070() {
        return this.f1619;
    }
}
