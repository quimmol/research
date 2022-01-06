package ♫;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: ♫.将  reason: contains not printable characters */
public class C0417 extends Button implements AbstractC0220, AbstractC0177 {

    /* renamed from: θ  reason: contains not printable characters */
    public final C0416 f1576;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0446 f1577;

    public C0417(Context context, AttributeSet attrs) {
        this(context, attrs, C0158.buttonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0417(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        C0485.m2285(context);
        this.f1576 = new C0416(this);
        this.f1576.m2010(attrs, defStyleAttr);
        this.f1577 = new C0446(this);
        this.f1577.m2106(attrs, defStyleAttr);
        this.f1577.m2099();
    }

    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        C0416 r0 = this.f1576;
        if (r0 != null) {
            r0.m2007(resId);
        }
    }

    public void setBackgroundDrawable(Drawable background) {
        super.setBackgroundDrawable(background);
        C0416 r0 = this.f1576;
        if (r0 != null) {
            r0.m2002();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList tint) {
        C0416 r0 = this.f1576;
        if (r0 != null) {
            r0.m2003(tint);
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0416 r0 = this.f1576;
        if (r0 != null) {
            return r0.m2004();
        }
        return null;
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode tintMode) {
        C0416 r0 = this.f1576;
        if (r0 != null) {
            r0.m2009(tintMode);
        }
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0416 r0 = this.f1576;
        if (r0 != null) {
            return r0.m2005();
        }
        return null;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0416 r0 = this.f1576;
        if (r0 != null) {
            r0.m2006();
        }
        C0446 r02 = this.f1577;
        if (r02 != null) {
            r02.m2099();
        }
    }

    public void setTextAppearance(Context context, int resId) {
        super.setTextAppearance(context, resId);
        C0446 r0 = this.f1577;
        if (r0 != null) {
            r0.m2103(context, resId);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(Button.class.getName());
    }

    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        C0446 r0 = this.f1577;
        if (r0 != null) {
            r0.m2094();
        }
    }

    public void setTextSize(int unit, float size) {
        if (AbstractC0177.f790) {
            super.setTextSize(unit, size);
            return;
        }
        C0446 r0 = this.f1577;
        if (r0 != null) {
            r0.m2101(unit, size);
        }
    }

    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        C0446 r0 = this.f1577;
        if (r0 != null && !AbstractC0177.f790 && r0.m2110()) {
            this.f1577.m2096();
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        if (AbstractC0177.f790) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        C0446 r0 = this.f1577;
        if (r0 != null) {
            r0.m2100(autoSizeTextType);
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) {
        if (AbstractC0177.f790) {
            super.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
            return;
        }
        C0446 r0 = this.f1577;
        if (r0 != null) {
            r0.m2102(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) {
        if (AbstractC0177.f790) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
            return;
        }
        C0446 r0 = this.f1577;
        if (r0 != null) {
            r0.m2109(presetSizes, unit);
        }
    }

    public int getAutoSizeTextType() {
        if (!AbstractC0177.f790) {
            C0446 r0 = this.f1577;
            if (r0 != null) {
                return r0.m2092();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getAutoSizeStepGranularity() {
        if (AbstractC0177.f790) {
            return super.getAutoSizeStepGranularity();
        }
        C0446 r0 = this.f1577;
        if (r0 != null) {
            return r0.m2093();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (AbstractC0177.f790) {
            return super.getAutoSizeMinTextSize();
        }
        C0446 r0 = this.f1577;
        if (r0 != null) {
            return r0.m2095();
        }
        return -1;
    }

    public int getAutoSizeMaxTextSize() {
        if (AbstractC0177.f790) {
            return super.getAutoSizeMaxTextSize();
        }
        C0446 r0 = this.f1577;
        if (r0 != null) {
            return r0.m2098();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC0177.f790) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0446 r0 = this.f1577;
        if (r0 != null) {
            return r0.m2111();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean allCaps) {
        C0446 r0 = this.f1577;
        if (r0 != null) {
            r0.m2108(allCaps);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionModeCallback) {
        super.setCustomSelectionActionModeCallback(C0261.m1202(this, actionModeCallback));
    }
}
