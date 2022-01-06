package ♫;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: ♫.ʲ  reason: contains not printable characters */
public class C0078 {

    /* renamed from: θ  reason: contains not printable characters */
    public final AccessibilityNodeInfo f585;

    public C0078(AccessibilityNodeInfo info) {
        this.f585 = info;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0078 m449(AccessibilityNodeInfo info) {
        return new C0078(info);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AccessibilityNodeInfo m460() {
        return this.f585;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m459() {
        return this.f585.getActions();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m463(int action) {
        this.f585.addAction(action);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m464(Rect outBounds) {
        this.f585.getBoundsInParent(outBounds);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m457(Rect outBounds) {
        this.f585.getBoundsInScreen(outBounds);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m467() {
        return this.f585.isCheckable();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m458() {
        return this.f585.isChecked();
    }

    /* renamed from: ö  reason: contains not printable characters */
    public boolean m453() {
        return this.f585.isFocusable();
    }

    /* renamed from: µ  reason: contains not printable characters */
    public boolean m450() {
        return this.f585.isFocused();
    }

    /* renamed from: ₤  reason: contains not printable characters */
    public boolean m470() {
        return this.f585.isSelected();
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m455() {
        return this.f585.isClickable();
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public boolean m471() {
        return this.f585.isLongClickable();
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m452() {
        return this.f585.isEnabled();
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public boolean m468() {
        return this.f585.isPassword();
    }

    /* renamed from: ₣  reason: contains not printable characters */
    public boolean m469() {
        return this.f585.isScrollable();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m466(boolean scrollable) {
        this.f585.setScrollable(scrollable);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public CharSequence m454() {
        return this.f585.getPackageName();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public CharSequence m461() {
        return this.f585.getClassName();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m465(CharSequence className) {
        this.f585.setClassName(className);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public CharSequence m451() {
        return this.f585.getText();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public CharSequence m456() {
        return this.f585.getContentDescription();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public String m462() {
        int i = Build.VERSION.SDK_INT;
        return this.f585.getViewIdResourceName();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f585;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0078 other = (C0078) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f585;
        if (accessibilityNodeInfo == null) {
            if (other.f585 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(other.f585)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        Rect bounds = new Rect();
        m464(bounds);
        builder.append("; boundsInParent: " + bounds);
        m457(bounds);
        builder.append("; boundsInScreen: " + bounds);
        builder.append("; packageName: ");
        builder.append(m454());
        builder.append("; className: ");
        builder.append(m461());
        builder.append("; text: ");
        builder.append(m451());
        builder.append("; contentDescription: ");
        builder.append(m456());
        builder.append("; viewId: ");
        builder.append(m462());
        builder.append("; checkable: ");
        builder.append(m467());
        builder.append("; checked: ");
        builder.append(m458());
        builder.append("; focusable: ");
        builder.append(m453());
        builder.append("; focused: ");
        builder.append(m450());
        builder.append("; selected: ");
        builder.append(m470());
        builder.append("; clickable: ");
        builder.append(m455());
        builder.append("; longClickable: ");
        builder.append(m471());
        builder.append("; enabled: ");
        builder.append(m452());
        builder.append("; password: ");
        builder.append(m468());
        builder.append("; scrollable: " + m469());
        builder.append("; [");
        int actionBits = m459();
        while (actionBits != 0) {
            int action = 1 << Integer.numberOfTrailingZeros(actionBits);
            actionBits &= ~action;
            builder.append(m448(action));
            if (actionBits != 0) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m448(int action) {
        if (action == 1) {
            return "ACTION_FOCUS";
        }
        if (action == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (action) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }
}
