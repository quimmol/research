package ♫;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ♫.ι  reason: contains not printable characters */
public final class C0286 {

    /* renamed from: θ  reason: contains not printable characters */
    public int f1029;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final ColorStateList f1030;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Shader f1031;

    public C0286(Shader shader, ColorStateList colorStateList, int color) {
        this.f1031 = shader;
        this.f1030 = colorStateList;
        this.f1029 = color;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0286 m1266(Shader shader) {
        return new C0286(shader, null, 0);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0286 m1264(ColorStateList colorStateList) {
        return new C0286(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0286 m1263(int color) {
        return new C0286(null, null, color);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Shader m1270() {
        return this.f1031;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m1269() {
        return this.f1029;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1271(int color) {
        this.f1029 = color;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1272() {
        return this.f1031 != null;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1268() {
        ColorStateList colorStateList;
        return this.f1031 == null && (colorStateList = this.f1030) != null && colorStateList.isStateful();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1273(int[] stateSet) {
        if (!m1268()) {
            return false;
        }
        ColorStateList colorStateList = this.f1030;
        int colorForState = colorStateList.getColorForState(stateSet, colorStateList.getDefaultColor());
        if (colorForState == this.f1029) {
            return false;
        }
        this.f1029 = colorForState;
        return true;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m1267() {
        return m1272() || this.f1029 != 0;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static C0286 m1262(Resources resources, int resId, Resources.Theme theme) {
        try {
            return m1265(resources, resId, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0286 m1265(Resources resources, int resId, Resources.Theme theme) {
        int type;
        XmlPullParser parser = resources.getXml(resId);
        AttributeSet attrs = Xml.asAttributeSet(parser);
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type == 2) {
            String name = parser.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return m1264(C0155.m784(resources, parser, attrs, theme));
            }
            if (c == 1) {
                return m1266(C0108.m562(resources, parser, attrs, theme));
            }
            throw new XmlPullParserException(parser.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
