package ♫;

import android.graphics.Color;

/* renamed from: ♫.ˍ  reason: contains not printable characters */
public final class C0125 {
    static {
        new ThreadLocal();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static int m631(int foreground, int background) {
        int bgAlpha = Color.alpha(background);
        int fgAlpha = Color.alpha(foreground);
        int a = m632(fgAlpha, bgAlpha);
        return Color.argb(a, m633(Color.red(foreground), fgAlpha, Color.red(background), bgAlpha, a), m633(Color.green(foreground), fgAlpha, Color.green(background), bgAlpha, a), m633(Color.blue(foreground), fgAlpha, Color.blue(background), bgAlpha, a));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m632(int foregroundAlpha, int backgroundAlpha) {
        return 255 - (((255 - backgroundAlpha) * (255 - foregroundAlpha)) / 255);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m633(int fgC, int fgA, int bgC, int bgA, int a) {
        if (a == 0) {
            return 0;
        }
        return (((fgC * 255) * fgA) + ((bgC * bgA) * (255 - fgA))) / (a * 255);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public static int m630(int color, int alpha) {
        if (alpha >= 0 && alpha <= 255) {
            return (16777215 & color) | (alpha << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
