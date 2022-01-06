package ♫;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ♫.ˌ  reason: contains not printable characters */
public class C0124 {
    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m629(XmlPullParser parser, String attrName) {
        return parser.getAttributeValue("http://schemas.android.com/apk/res/android", attrName) != null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static float m622(TypedArray a, XmlPullParser parser, String attrName, int resId, float defaultValue) {
        if (!m629(parser, attrName)) {
            return defaultValue;
        }
        return a.getFloat(resId, defaultValue);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m628(TypedArray a, XmlPullParser parser, String attrName, int resId, boolean defaultValue) {
        if (!m629(parser, attrName)) {
            return defaultValue;
        }
        return a.getBoolean(resId, defaultValue);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static int m621(TypedArray a, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        if (!m629(parser, attrName)) {
            return defaultValue;
        }
        return a.getInt(resId, defaultValue);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m623(TypedArray a, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        if (!m629(parser, attrName)) {
            return defaultValue;
        }
        return a.getColor(resId, defaultValue);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0286 m627(TypedArray a, XmlPullParser parser, Resources.Theme theme, String attrName, int resId, int defaultValue) {
        if (m629(parser, attrName)) {
            TypedValue value = new TypedValue();
            a.getValue(resId, value);
            int i = value.type;
            if (i >= 28 && i <= 31) {
                return C0286.m1263(value.data);
            }
            C0286 complexColor = C0286.m1262(a.getResources(), a.getResourceId(resId, 0), theme);
            if (complexColor != null) {
                return complexColor;
            }
        }
        return C0286.m1263(defaultValue);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public static int m620(TypedArray a, XmlPullParser parser, String attrName, int resId, int defaultValue) {
        if (!m629(parser, attrName)) {
            return defaultValue;
        }
        return a.getResourceId(resId, defaultValue);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m626(TypedArray a, XmlPullParser parser, String attrName, int resId) {
        if (!m629(parser, attrName)) {
            return null;
        }
        return a.getString(resId);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static TypedValue m625(TypedArray a, XmlPullParser parser, String attrName, int resId) {
        if (!m629(parser, attrName)) {
            return null;
        }
        return a.peekValue(resId);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static TypedArray m624(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        if (theme == null) {
            return res.obtainAttributes(set, attrs);
        }
        return theme.obtainStyledAttributes(set, attrs, 0, 0);
    }
}
