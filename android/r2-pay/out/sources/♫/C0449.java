package ♫;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ♫.搞  reason: contains not printable characters */
public class C0449 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final RectF f1668 = new RectF();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static ConcurrentHashMap<String, Method> f1669 = new ConcurrentHashMap<>();

    /* renamed from: ø  reason: contains not printable characters */
    public float f1670 = -1.0f;

    /* renamed from: Φ  reason: contains not printable characters */
    public float f1671 = -1.0f;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1672 = false;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public float f1673 = -1.0f;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f1674 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Context f1675;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public TextPaint f1676;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final TextView f1677;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1678 = false;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int[] f1679 = new int[0];

    public C0449(TextView textView) {
        this.f1677 = textView;
        this.f1675 = this.f1677.getContext();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2135(AttributeSet attrs, int defStyleAttr) {
        int autoSizeStepSizeArrayResId;
        float autoSizeMinTextSizeInPx = -1.0f;
        float autoSizeMaxTextSizeInPx = -1.0f;
        float autoSizeStepGranularityInPx = -1.0f;
        TypedArray a = this.f1675.obtainStyledAttributes(attrs, C0291.AppCompatTextView, defStyleAttr, 0);
        if (a.hasValue(C0291.AppCompatTextView_autoSizeTextType)) {
            this.f1674 = a.getInt(C0291.AppCompatTextView_autoSizeTextType, 0);
        }
        if (a.hasValue(C0291.AppCompatTextView_autoSizeStepGranularity)) {
            autoSizeStepGranularityInPx = a.getDimension(C0291.AppCompatTextView_autoSizeStepGranularity, -1.0f);
        }
        if (a.hasValue(C0291.AppCompatTextView_autoSizeMinTextSize)) {
            autoSizeMinTextSizeInPx = a.getDimension(C0291.AppCompatTextView_autoSizeMinTextSize, -1.0f);
        }
        if (a.hasValue(C0291.AppCompatTextView_autoSizeMaxTextSize)) {
            autoSizeMaxTextSizeInPx = a.getDimension(C0291.AppCompatTextView_autoSizeMaxTextSize, -1.0f);
        }
        if (a.hasValue(C0291.AppCompatTextView_autoSizePresetSizes) && (autoSizeStepSizeArrayResId = a.getResourceId(C0291.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray autoSizePreDefTextSizes = a.getResources().obtainTypedArray(autoSizeStepSizeArrayResId);
            m2134(autoSizePreDefTextSizes);
            autoSizePreDefTextSizes.recycle();
        }
        a.recycle();
        if (!m2116()) {
            this.f1674 = 0;
        } else if (this.f1674 == 1) {
            if (!this.f1672) {
                DisplayMetrics displayMetrics = this.f1675.getResources().getDisplayMetrics();
                if (autoSizeMinTextSizeInPx == -1.0f) {
                    autoSizeMinTextSizeInPx = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (autoSizeMaxTextSizeInPx == -1.0f) {
                    autoSizeMaxTextSizeInPx = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (autoSizeStepGranularityInPx == -1.0f) {
                    autoSizeStepGranularityInPx = 1.0f;
                }
                m2130(autoSizeMinTextSizeInPx, autoSizeMaxTextSizeInPx, autoSizeStepGranularityInPx);
            }
            m2121();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2131(int autoSizeTextType) {
        if (!m2116()) {
            return;
        }
        if (autoSizeTextType == 0) {
            m2120();
        } else if (autoSizeTextType == 1) {
            DisplayMetrics displayMetrics = this.f1675.getResources().getDisplayMetrics();
            m2130(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m2121()) {
                m2128();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + autoSizeTextType);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2133(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (m2116()) {
            DisplayMetrics displayMetrics = this.f1675.getResources().getDisplayMetrics();
            m2130(TypedValue.applyDimension(unit, (float) autoSizeMinTextSize, displayMetrics), TypedValue.applyDimension(unit, (float) autoSizeMaxTextSize, displayMetrics), TypedValue.applyDimension(unit, (float) autoSizeStepGranularity, displayMetrics));
            if (m2121()) {
                m2128();
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2136(int[] presetSizes, int unit) {
        if (m2116()) {
            int presetSizesLength = presetSizes.length;
            if (presetSizesLength > 0) {
                int[] presetSizesInPx = new int[presetSizesLength];
                if (unit == 0) {
                    presetSizesInPx = Arrays.copyOf(presetSizes, presetSizesLength);
                } else {
                    DisplayMetrics displayMetrics = this.f1675.getResources().getDisplayMetrics();
                    for (int i = 0; i < presetSizesLength; i++) {
                        presetSizesInPx[i] = Math.round(TypedValue.applyDimension(unit, (float) presetSizes[i], displayMetrics));
                    }
                }
                this.f1679 = m2140(presetSizesInPx);
                if (!m2118()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(presetSizes));
                }
            } else {
                this.f1672 = false;
            }
            if (m2121()) {
                m2128();
            }
        }
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public int m2115() {
        return this.f1674;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public int m2117() {
        return Math.round(this.f1673);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public int m2119() {
        return Math.round(this.f1671);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2122() {
        return Math.round(this.f1670);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int[] m2139() {
        return this.f1679;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2134(TypedArray textSizes) {
        int textSizesLength = textSizes.length();
        int[] parsedSizes = new int[textSizesLength];
        if (textSizesLength > 0) {
            for (int i = 0; i < textSizesLength; i++) {
                parsedSizes[i] = textSizes.getDimensionPixelSize(i, -1);
            }
            this.f1679 = m2140(parsedSizes);
            m2118();
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final boolean m2118() {
        int sizesLength = this.f1679.length;
        this.f1672 = sizesLength > 0;
        if (this.f1672) {
            this.f1674 = 1;
            int[] iArr = this.f1679;
            this.f1671 = (float) iArr[0];
            this.f1670 = (float) iArr[sizesLength - 1];
            this.f1673 = -1.0f;
        }
        return this.f1672;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int[] m2140(int[] presetValues) {
        int presetValuesLength = presetValues.length;
        if (presetValuesLength == 0) {
            return presetValues;
        }
        Arrays.sort(presetValues);
        List<Integer> uniqueValidSizes = new ArrayList<>();
        for (int currentPresetValue : presetValues) {
            if (currentPresetValue > 0 && Collections.binarySearch(uniqueValidSizes, Integer.valueOf(currentPresetValue)) < 0) {
                uniqueValidSizes.add(Integer.valueOf(currentPresetValue));
            }
        }
        if (presetValuesLength == uniqueValidSizes.size()) {
            return presetValues;
        }
        int uniqueValidSizesLength = uniqueValidSizes.size();
        int[] cleanedUpSizes = new int[uniqueValidSizesLength];
        for (int i = 0; i < uniqueValidSizesLength; i++) {
            cleanedUpSizes[i] = uniqueValidSizes.get(i).intValue();
        }
        return cleanedUpSizes;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2130(float autoSizeMinTextSizeInPx, float autoSizeMaxTextSizeInPx, float autoSizeStepGranularityInPx) {
        if (autoSizeMinTextSizeInPx <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + autoSizeMinTextSizeInPx + "px) is less or equal to (0px)");
        } else if (autoSizeMaxTextSizeInPx <= autoSizeMinTextSizeInPx) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + autoSizeMaxTextSizeInPx + "px) is less or equal to minimum auto-size " + "text size (" + autoSizeMinTextSizeInPx + "px)");
        } else if (autoSizeStepGranularityInPx > 0.0f) {
            this.f1674 = 1;
            this.f1671 = autoSizeMinTextSizeInPx;
            this.f1670 = autoSizeMaxTextSizeInPx;
            this.f1673 = autoSizeStepGranularityInPx;
            this.f1672 = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + autoSizeStepGranularityInPx + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean m2121() {
        if (!m2116() || this.f1674 != 1) {
            this.f1678 = false;
        } else {
            if (!this.f1672 || this.f1679.length == 0) {
                int autoSizeValuesLength = 1;
                float currentSize = (float) Math.round(this.f1671);
                while (Math.round(this.f1673 + currentSize) <= Math.round(this.f1670)) {
                    autoSizeValuesLength++;
                    currentSize += this.f1673;
                }
                int[] autoSizeTextSizesInPx = new int[autoSizeValuesLength];
                float sizeToAdd = this.f1671;
                for (int i = 0; i < autoSizeValuesLength; i++) {
                    autoSizeTextSizesInPx[i] = Math.round(sizeToAdd);
                    sizeToAdd += this.f1673;
                }
                this.f1679 = m2140(autoSizeTextSizesInPx);
            }
            this.f1678 = true;
        }
        return this.f1678;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2128() {
        int availableWidth;
        if (m2137()) {
            if (this.f1678) {
                if (this.f1677.getMeasuredHeight() > 0 && this.f1677.getMeasuredWidth() > 0) {
                    if (((Boolean) m2126((Object) this.f1677, "getHorizontallyScrolling", (Object) false)).booleanValue()) {
                        availableWidth = 1048576;
                    } else {
                        availableWidth = (this.f1677.getMeasuredWidth() - this.f1677.getTotalPaddingLeft()) - this.f1677.getTotalPaddingRight();
                    }
                    int availableHeight = (this.f1677.getHeight() - this.f1677.getCompoundPaddingBottom()) - this.f1677.getCompoundPaddingTop();
                    if (availableWidth > 0 && availableHeight > 0) {
                        synchronized (f1668) {
                            f1668.setEmpty();
                            f1668.right = (float) availableWidth;
                            f1668.bottom = (float) availableHeight;
                            float optimalTextSize = (float) m2123(f1668);
                            if (optimalTextSize != this.f1677.getTextSize()) {
                                m2132(0, optimalTextSize);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1678 = true;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2120() {
        this.f1674 = 0;
        this.f1671 = -1.0f;
        this.f1670 = -1.0f;
        this.f1673 = -1.0f;
        this.f1679 = new int[0];
        this.f1678 = false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2132(int unit, float size) {
        Resources res;
        Context context = this.f1675;
        if (context == null) {
            res = Resources.getSystem();
        } else {
            res = context.getResources();
        }
        m2129(TypedValue.applyDimension(unit, size, res.getDisplayMetrics()));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2129(float size) {
        if (size != this.f1677.getPaint().getTextSize()) {
            this.f1677.getPaint().setTextSize(size);
            int i = Build.VERSION.SDK_INT;
            boolean isInLayout = this.f1677.isInLayout();
            if (this.f1677.getLayout() != null) {
                this.f1678 = false;
                try {
                    Method method = m2127("nullLayouts");
                    if (method != null) {
                        method.invoke(this.f1677, new Object[0]);
                    }
                } catch (Exception ex) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", ex);
                }
                if (!isInLayout) {
                    this.f1677.requestLayout();
                } else {
                    this.f1677.forceLayout();
                }
                this.f1677.invalidate();
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m2123(RectF availableSpace) {
        int sizesCount = this.f1679.length;
        if (sizesCount != 0) {
            int bestSizeIndex = 0;
            int lowIndex = 0 + 1;
            int highIndex = sizesCount - 1;
            while (lowIndex <= highIndex) {
                int sizeToTryIndex = (lowIndex + highIndex) / 2;
                if (m2138(this.f1679[sizeToTryIndex], availableSpace)) {
                    bestSizeIndex = lowIndex;
                    lowIndex = sizeToTryIndex + 1;
                } else {
                    highIndex = sizeToTryIndex - 1;
                    bestSizeIndex = highIndex;
                }
            }
            return this.f1679[bestSizeIndex];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m2138(int suggestedSizeInPx, RectF availableSpace) {
        StaticLayout layout;
        CharSequence transformedText;
        CharSequence text = this.f1677.getText();
        TransformationMethod transformationMethod = this.f1677.getTransformationMethod();
        if (!(transformationMethod == null || (transformedText = transformationMethod.getTransformation(text, this.f1677)) == null)) {
            text = transformedText;
        }
        int i = Build.VERSION.SDK_INT;
        int maxLines = this.f1677.getMaxLines();
        TextPaint textPaint = this.f1676;
        if (textPaint == null) {
            this.f1676 = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1676.set(this.f1677.getPaint());
        this.f1676.setTextSize((float) suggestedSizeInPx);
        Layout.Alignment alignment = (Layout.Alignment) m2126(this.f1677, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            layout = m2125(text, alignment, Math.round(availableSpace.right), maxLines);
        } else {
            layout = m2124(text, alignment, Math.round(availableSpace.right));
        }
        return (maxLines == -1 || (layout.getLineCount() <= maxLines && layout.getLineEnd(layout.getLineCount() - 1) == text.length())) && ((float) layout.getHeight()) <= availableSpace.bottom;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final StaticLayout m2125(CharSequence text, Layout.Alignment alignment, int availableWidth, int maxLines) {
        return StaticLayout.Builder.obtain(text, 0, text.length(), this.f1676, availableWidth).setAlignment(alignment).setLineSpacing(this.f1677.getLineSpacingExtra(), this.f1677.getLineSpacingMultiplier()).setIncludePad(this.f1677.getIncludeFontPadding()).setBreakStrategy(this.f1677.getBreakStrategy()).setHyphenationFrequency(this.f1677.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines).setTextDirection((TextDirectionHeuristic) m2126(this.f1677, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR)).build();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final StaticLayout m2124(CharSequence text, Layout.Alignment alignment, int availableWidth) {
        int i = Build.VERSION.SDK_INT;
        return new StaticLayout(text, this.f1676, availableWidth, alignment, this.f1677.getLineSpacingMultiplier(), this.f1677.getLineSpacingExtra(), this.f1677.getIncludeFontPadding());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final <T> T m2126(Object object, String methodName, T defaultValue) {
        try {
            T result = (T) m2127(methodName).invoke(object, new Object[0]);
            if (result != null || 0 == 0) {
                return result;
            }
        } catch (Exception ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + methodName + "() method", ex);
            if (0 != 0 || 1 == 0) {
                return null;
            }
        } catch (Throwable th) {
            if (0 == 0 && 1 != 0) {
            }
            throw th;
        }
        return defaultValue;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Method m2127(String methodName) {
        try {
            Method method = f1669.get(methodName);
            if (method == null && (method = TextView.class.getDeclaredMethod(methodName, new Class[0])) != null) {
                method.setAccessible(true);
                f1669.put(methodName, method);
            }
            return method;
        } catch (Exception ex) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + methodName + "() method", ex);
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2137() {
        return m2116() && this.f1674 != 0;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public final boolean m2116() {
        return !(this.f1677 instanceof C0427);
    }
}
