package ♫;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* renamed from: ♫.ʴ  reason: contains not printable characters */
public class C0085 implements Spannable {

    /* renamed from: θ  reason: contains not printable characters */
    public final Spannable f605;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0086 f606;

    static {
        new Object();
    }

    /* renamed from: ♫.ʴ$θ  reason: contains not printable characters */
    public static final class C0086 {

        /* renamed from: Φ  reason: contains not printable characters */
        public final int f607;

        /* renamed from: θ  reason: contains not printable characters */
        public final int f608;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final PrecomputedText.Params f609 = null;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final TextDirectionHeuristic f610;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final TextPaint f611;

        /* renamed from: ♫.ʴ$θ$θ  reason: contains not printable characters */
        public static class C0087 {

            /* renamed from: Φ  reason: contains not printable characters */
            public int f612;

            /* renamed from: θ  reason: contains not printable characters */
            public int f613;

            /* renamed from: θ  reason: contains not printable characters and collision with other field name */
            public TextDirectionHeuristic f614;

            /* renamed from: θ  reason: contains not printable characters and collision with other field name */
            public final TextPaint f615;

            public C0087(TextPaint paint) {
                this.f615 = paint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f613 = 1;
                    this.f612 = 1;
                } else {
                    this.f612 = 0;
                    this.f613 = 0;
                }
                int i = Build.VERSION.SDK_INT;
                this.f614 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }

            /* renamed from: θ  reason: contains not printable characters */
            public C0087 m485(int strategy) {
                this.f613 = strategy;
                return this;
            }

            /* renamed from: Φ  reason: contains not printable characters */
            public C0087 m484(int frequency) {
                this.f612 = frequency;
                return this;
            }

            /* renamed from: θ  reason: contains not printable characters */
            public C0087 m486(TextDirectionHeuristic textDir) {
                this.f614 = textDir;
                return this;
            }

            /* renamed from: θ  reason: contains not printable characters */
            public C0086 m487() {
                return new C0086(this.f615, this.f614, this.f613, this.f612);
            }
        }

        public C0086(TextPaint paint, TextDirectionHeuristic textDir, int strategy, int frequency) {
            this.f611 = paint;
            this.f610 = textDir;
            this.f608 = strategy;
            this.f607 = frequency;
        }

        public C0086(PrecomputedText.Params wrapped) {
            this.f611 = wrapped.getTextPaint();
            this.f610 = wrapped.getTextDirection();
            this.f608 = wrapped.getBreakStrategy();
            this.f607 = wrapped.getHyphenationFrequency();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public TextPaint m482() {
            return this.f611;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public TextDirectionHeuristic m481() {
            return this.f610;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m480() {
            return this.f608;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public int m479() {
            return this.f607;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m483(C0086 other) {
            PrecomputedText.Params params = this.f609;
            if (params != null) {
                return params.equals(other.f609);
            }
            if ((Build.VERSION.SDK_INT >= 23 && (this.f608 != other.m480() || this.f607 != other.m479())) || this.f611.getTextSize() != other.m482().getTextSize() || this.f611.getTextScaleX() != other.m482().getTextScaleX() || this.f611.getTextSkewX() != other.m482().getTextSkewX()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (this.f611.getLetterSpacing() != other.m482().getLetterSpacing() || !TextUtils.equals(this.f611.getFontFeatureSettings(), other.m482().getFontFeatureSettings()) || this.f611.getFlags() != other.m482().getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (!this.f611.getTextLocales().equals(other.m482().getTextLocales())) {
                    return false;
                }
            } else if (!this.f611.getTextLocale().equals(other.m482().getTextLocale())) {
                return false;
            }
            if (this.f611.getTypeface() == null) {
                if (other.m482().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f611.getTypeface().equals(other.m482().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof C0086)) {
                return false;
            }
            C0086 other = (C0086) o;
            if (!m483(other)) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (this.f610 != other.m481()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return C0132.m658(Float.valueOf(this.f611.getTextSize()), Float.valueOf(this.f611.getTextScaleX()), Float.valueOf(this.f611.getTextSkewX()), Float.valueOf(this.f611.getLetterSpacing()), Integer.valueOf(this.f611.getFlags()), this.f611.getTextLocales(), this.f611.getTypeface(), Boolean.valueOf(this.f611.isElegantTextHeight()), this.f610, Integer.valueOf(this.f608), Integer.valueOf(this.f607));
            }
            return C0132.m658(Float.valueOf(this.f611.getTextSize()), Float.valueOf(this.f611.getTextScaleX()), Float.valueOf(this.f611.getTextSkewX()), Float.valueOf(this.f611.getLetterSpacing()), Integer.valueOf(this.f611.getFlags()), this.f611.getTextLocale(), this.f611.getTypeface(), Boolean.valueOf(this.f611.isElegantTextHeight()), this.f610, Integer.valueOf(this.f608), Integer.valueOf(this.f607));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f611.getTextSize());
            sb.append(", textScaleX=" + this.f611.getTextScaleX());
            sb.append(", textSkewX=" + this.f611.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f611.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f611.isElegantTextHeight());
            if (Build.VERSION.SDK_INT >= 24) {
                sb.append(", textLocale=" + this.f611.getTextLocales());
            } else {
                sb.append(", textLocale=" + this.f611.getTextLocale());
            }
            sb.append(", typeface=" + this.f611.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f611.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f610);
            sb.append(", breakStrategy=" + this.f608);
            sb.append(", hyphenationFrequency=" + this.f607);
            sb.append("}");
            return sb.toString();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0086 m478() {
        return this.f606;
    }

    public void setSpan(Object what, int start, int end, int flags) {
        if (!(what instanceof MetricAffectingSpan)) {
            this.f605.setSpan(what, start, end, flags);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public void removeSpan(Object what) {
        if (!(what instanceof MetricAffectingSpan)) {
            this.f605.removeSpan(what);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int start, int end, Class<T> type) {
        return (T[]) this.f605.getSpans(start, end, type);
    }

    public int getSpanStart(Object tag) {
        return this.f605.getSpanStart(tag);
    }

    public int getSpanEnd(Object tag) {
        return this.f605.getSpanEnd(tag);
    }

    public int getSpanFlags(Object tag) {
        return this.f605.getSpanFlags(tag);
    }

    public int nextSpanTransition(int start, int limit, Class type) {
        return this.f605.nextSpanTransition(start, limit, type);
    }

    public int length() {
        return this.f605.length();
    }

    public char charAt(int index) {
        return this.f605.charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        return this.f605.subSequence(start, end);
    }

    public String toString() {
        return this.f605.toString();
    }
}
