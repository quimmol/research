package ♫;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: ♫.长  reason: contains not printable characters */
public class C0567 extends ViewGroup {

    /* renamed from: θ  reason: contains not printable characters */
    public C0564 f2273;

    /* renamed from: θ  reason: contains not printable characters */
    public C0568 generateLayoutParams(AttributeSet attrs) {
        return new C0568(getContext(), attrs);
    }

    /* renamed from: ♫.长$θ  reason: contains not printable characters */
    public static class C0568 extends ConstraintLayout.C0054 {

        /* renamed from: Ё  reason: contains not printable characters */
        public float f2274 = 0.0f;

        /* renamed from: А  reason: contains not printable characters */
        public float f2275 = 0.0f;

        /* renamed from: Б  reason: contains not printable characters */
        public float f2276 = 0.0f;

        /* renamed from: В  reason: contains not printable characters */
        public float f2277 = 0.0f;

        /* renamed from: Г  reason: contains not printable characters */
        public float f2278 = 1.0f;

        /* renamed from: Д  reason: contains not printable characters */
        public float f2279 = 1.0f;

        /* renamed from: Е  reason: contains not printable characters */
        public float f2280 = 0.0f;

        /* renamed from: Ж  reason: contains not printable characters */
        public float f2281 = 0.0f;

        /* renamed from: З  reason: contains not printable characters */
        public float f2282 = 0.0f;

        /* renamed from: И  reason: contains not printable characters */
        public float f2283 = 0.0f;

        /* renamed from: ₢  reason: contains not printable characters */
        public float f2284 = 0.0f;

        /* renamed from: ₤  reason: contains not printable characters */
        public boolean f2285 = false;

        /* renamed from: ₧  reason: contains not printable characters */
        public float f2286 = 1.0f;

        public C0568(int width, int height) {
            super(width, height);
        }

        public C0568(Context c, AttributeSet attrs) {
            super(c, attrs);
            TypedArray a = c.obtainStyledAttributes(attrs, C0572.ConstraintSet);
            int N = a.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a.getIndex(i);
                if (attr == C0572.ConstraintSet_android_alpha) {
                    this.f2286 = a.getFloat(attr, this.f2286);
                } else if (attr == C0572.ConstraintSet_android_elevation) {
                    this.f2284 = a.getFloat(attr, this.f2284);
                    this.f2285 = true;
                } else if (attr == C0572.ConstraintSet_android_rotationX) {
                    this.f2276 = a.getFloat(attr, this.f2276);
                } else if (attr == C0572.ConstraintSet_android_rotationY) {
                    this.f2277 = a.getFloat(attr, this.f2277);
                } else if (attr == C0572.ConstraintSet_android_rotation) {
                    this.f2275 = a.getFloat(attr, this.f2275);
                } else if (attr == C0572.ConstraintSet_android_scaleX) {
                    this.f2278 = a.getFloat(attr, this.f2278);
                } else if (attr == C0572.ConstraintSet_android_scaleY) {
                    this.f2279 = a.getFloat(attr, this.f2279);
                } else if (attr == C0572.ConstraintSet_android_transformPivotX) {
                    this.f2280 = a.getFloat(attr, this.f2280);
                } else if (attr == C0572.ConstraintSet_android_transformPivotY) {
                    this.f2274 = a.getFloat(attr, this.f2274);
                } else if (attr == C0572.ConstraintSet_android_translationX) {
                    this.f2281 = a.getFloat(attr, this.f2281);
                } else if (attr == C0572.ConstraintSet_android_translationY) {
                    this.f2282 = a.getFloat(attr, this.f2282);
                } else if (attr == C0572.ConstraintSet_android_translationZ) {
                    this.f2281 = a.getFloat(attr, this.f2283);
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0568 generateDefaultLayoutParams() {
        return new C0568(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new ConstraintLayout.C0054(p);
    }

    public C0564 getConstraintSet() {
        if (this.f2273 == null) {
            this.f2273 = new C0564();
        }
        this.f2273.m2802(this);
        return this.f2273;
    }

    public void onLayout(boolean changed, int l, int t, int r, int b) {
    }
}
