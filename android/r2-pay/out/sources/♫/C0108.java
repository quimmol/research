package ♫;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ♫.ʿ  reason: contains not printable characters */
public final class C0108 {
    /* renamed from: θ  reason: contains not printable characters */
    public static Shader m562(Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        String name = parser.getName();
        if (name.equals("gradient")) {
            TypedArray a = C0124.m624(resources, theme, attrs, C0575.GradientColor);
            float startX = C0124.m622(a, parser, "startX", C0575.GradientColor_android_startX, 0.0f);
            float startY = C0124.m622(a, parser, "startY", C0575.GradientColor_android_startY, 0.0f);
            float endX = C0124.m622(a, parser, "endX", C0575.GradientColor_android_endX, 0.0f);
            float endY = C0124.m622(a, parser, "endY", C0575.GradientColor_android_endY, 0.0f);
            float centerX = C0124.m622(a, parser, "centerX", C0575.GradientColor_android_centerX, 0.0f);
            float centerY = C0124.m622(a, parser, "centerY", C0575.GradientColor_android_centerY, 0.0f);
            int type = C0124.m621(a, parser, "type", C0575.GradientColor_android_type, 0);
            int startColor = C0124.m623(a, parser, "startColor", C0575.GradientColor_android_startColor, 0);
            boolean hasCenterColor = C0124.m629(parser, "centerColor");
            int centerColor = C0124.m623(a, parser, "centerColor", C0575.GradientColor_android_centerColor, 0);
            int endColor = C0124.m623(a, parser, "endColor", C0575.GradientColor_android_endColor, 0);
            int tileMode = C0124.m621(a, parser, "tileMode", C0575.GradientColor_android_tileMode, 0);
            float gradientRadius = C0124.m622(a, parser, "gradientRadius", C0575.GradientColor_android_gradientRadius, 0.0f);
            a.recycle();
            C0109 colorStops = m564(m563(resources, parser, attrs, theme), startColor, endColor, hasCenterColor, centerColor);
            if (type != 1) {
                if (type != 2) {
                    return new LinearGradient(startX, startY, endX, endY, colorStops.f646, colorStops.f645, m561(tileMode));
                }
                return new SweepGradient(centerX, centerY, colorStops.f646, colorStops.f645);
            } else if (gradientRadius > 0.0f) {
                return new RadialGradient(centerX, centerY, gradientRadius, colorStops.f646, colorStops.f645, m561(tileMode));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        } else {
            throw new XmlPullParserException(parser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008c, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r13.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' " + "attribute!");
     */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ♫.C0108.C0109 m563(android.content.res.Resources r12, org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0108.m563(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):♫.ʿ$θ");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0109 m564(C0109 colorItems, int startColor, int endColor, boolean hasCenterColor, int centerColor) {
        if (colorItems != null) {
            return colorItems;
        }
        if (hasCenterColor) {
            return new C0109(startColor, centerColor, endColor);
        }
        return new C0109(startColor, endColor);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Shader.TileMode m561(int tileMode) {
        if (tileMode == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (tileMode != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* renamed from: ♫.ʿ$θ  reason: contains not printable characters */
    public static final class C0109 {

        /* renamed from: θ  reason: contains not printable characters */
        public final float[] f645;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final int[] f646;

        public C0109(List<Integer> colorsList, List<Float> offsetsList) {
            int size = colorsList.size();
            this.f646 = new int[size];
            this.f645 = new float[size];
            for (int i = 0; i < size; i++) {
                this.f646[i] = colorsList.get(i).intValue();
                this.f645[i] = offsetsList.get(i).floatValue();
            }
        }

        public C0109(int startColor, int endColor) {
            this.f646 = new int[]{startColor, endColor};
            this.f645 = new float[]{0.0f, 1.0f};
        }

        public C0109(int startColor, int centerColor, int endColor) {
            this.f646 = new int[]{startColor, centerColor, endColor};
            this.f645 = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
