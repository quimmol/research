package ♫;

import android.animation.TypeEvaluator;

/* renamed from: ♫.ᓪ  reason: contains not printable characters */
public class C0211 implements TypeEvaluator {

    /* renamed from: θ  reason: contains not printable characters */
    public static final C0211 f833 = new C0211();

    /* renamed from: θ  reason: contains not printable characters */
    public static C0211 m963() {
        return f833;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float fraction, Object startValue, Object endValue) {
        int startInt = ((Integer) startValue).intValue();
        float startA = ((float) ((startInt >> 24) & 255)) / 255.0f;
        int endInt = ((Integer) endValue).intValue();
        float startR = (float) Math.pow((double) (((float) ((startInt >> 16) & 255)) / 255.0f), 2.2d);
        float startG = (float) Math.pow((double) (((float) ((startInt >> 8) & 255)) / 255.0f), 2.2d);
        float startB = (float) Math.pow((double) (((float) (startInt & 255)) / 255.0f), 2.2d);
        return Integer.valueOf((Math.round(((((((float) ((endInt >> 24) & 255)) / 255.0f) - startA) * fraction) + startA) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (((((float) Math.pow((double) (((float) ((endInt >> 16) & 255)) / 255.0f), 2.2d)) - startR) * fraction) + startR), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow((double) (((((float) Math.pow((double) (((float) ((endInt >> 8) & 255)) / 255.0f), 2.2d)) - startG) * fraction) + startG), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) (((((float) Math.pow((double) (((float) (endInt & 255)) / 255.0f), 2.2d)) - startB) * fraction) + startB), 0.45454545454545453d)) * 255.0f));
    }
}
