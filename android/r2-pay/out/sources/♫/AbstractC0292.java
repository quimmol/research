package ♫;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ♫.AbstractC0349;

/* renamed from: ♫.₧  reason: contains not printable characters */
public abstract class AbstractC0292 {

    @Deprecated
    /* renamed from: ♫.₧$ø  reason: contains not printable characters */
    public static abstract class AbstractC0293 {
        /* renamed from: Φ  reason: contains not printable characters */
        public abstract CharSequence m1299();

        /* renamed from: θ  reason: contains not printable characters */
        public abstract Drawable m1300();

        /* renamed from: θ  reason: contains not printable characters */
        public abstract View m1301();

        /* renamed from: θ  reason: contains not printable characters */
        public abstract CharSequence m1302();

        /* renamed from: θ  reason: contains not printable characters */
        public abstract void m1303();
    }

    /* renamed from: ♫.₧$Φ  reason: contains not printable characters */
    public interface AbstractC0294 {
        /* renamed from: θ  reason: contains not printable characters */
        void m1304(boolean z);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public abstract void m1286(boolean z);

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract void m1288(boolean z);

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract boolean m1289();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract int m1290();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract Context m1291();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract AbstractC0349 m1292(AbstractC0349.AbstractC0350 v);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1294(Configuration configuration);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1295(CharSequence charSequence);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1296(boolean z);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract boolean m1298(int i, KeyEvent keyEvent);

    /* renamed from: ö  reason: contains not printable characters */
    public boolean m1285() {
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1297() {
        return false;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m1287() {
        return false;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m1284() {
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1293() {
    }

    /* renamed from: ♫.₧$θ  reason: contains not printable characters */
    public static class C0295 extends ViewGroup.MarginLayoutParams {

        /* renamed from: θ  reason: contains not printable characters */
        public int f1033;

        public C0295(Context c, AttributeSet attrs) {
            super(c, attrs);
            this.f1033 = 0;
            TypedArray a = c.obtainStyledAttributes(attrs, C0291.ActionBarLayout);
            this.f1033 = a.getInt(C0291.ActionBarLayout_android_layout_gravity, 0);
            a.recycle();
        }

        public C0295(int width, int height) {
            super(width, height);
            this.f1033 = 0;
            this.f1033 = 8388627;
        }

        public C0295(C0295 source) {
            super((ViewGroup.MarginLayoutParams) source);
            this.f1033 = 0;
            this.f1033 = source.f1033;
        }

        public C0295(ViewGroup.LayoutParams source) {
            super(source);
            this.f1033 = 0;
        }
    }
}
