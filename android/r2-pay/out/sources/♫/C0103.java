package ♫;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.Xml;
import androidx.core.content.res.FontResourcesParserCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ♫.ʾ  reason: contains not printable characters */
public class C0103 {

    /* renamed from: ♫.ʾ$θ  reason: contains not printable characters */
    public interface AbstractC0107 {
    }

    /* renamed from: ♫.ʾ$Ø  reason: contains not printable characters */
    public static final class C0104 implements AbstractC0107 {

        /* renamed from: Φ  reason: contains not printable characters */
        public final int f635;

        /* renamed from: θ  reason: contains not printable characters */
        public final int f636;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final C0591 f637;

        public C0104(C0591 request, int strategy, int timeoutMs) {
            this.f637 = request;
            this.f635 = strategy;
            this.f636 = timeoutMs;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0591 m553() {
            return this.f637;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m552() {
            return this.f635;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public int m551() {
            return this.f636;
        }
    }

    /* renamed from: ♫.ʾ$ø  reason: contains not printable characters */
    public static final class C0105 {

        /* renamed from: ø  reason: contains not printable characters */
        public int f638;

        /* renamed from: Φ  reason: contains not printable characters */
        public int f639;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public String f640;

        /* renamed from: θ  reason: contains not printable characters */
        public int f641;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final String f642;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f643;

        public C0105(String fileName, int weight, boolean italic, String variationSettings, int ttcIndex, int resourceId) {
            this.f642 = fileName;
            this.f641 = weight;
            this.f643 = italic;
            this.f640 = variationSettings;
            this.f639 = ttcIndex;
            this.f638 = resourceId;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public String m558() {
            return this.f642;
        }

        /* renamed from: ø  reason: contains not printable characters */
        public int m554() {
            return this.f641;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m559() {
            return this.f643;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public String m556() {
            return this.f640;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public int m555() {
            return this.f639;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m557() {
            return this.f638;
        }
    }

    /* renamed from: ♫.ʾ$Φ  reason: contains not printable characters */
    public static final class C0106 implements AbstractC0107 {

        /* renamed from: θ  reason: contains not printable characters */
        public final C0105[] f644;

        public C0106(C0105[] entries) {
            this.f644 = entries;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0105[] m560() {
            return this.f644;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static AbstractC0107 m549(XmlPullParser parser, Resources resources) {
        int type;
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type == 2) {
            return m544(parser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static AbstractC0107 m544(XmlPullParser parser, Resources resources) {
        parser.require(2, null, "font-family");
        if (parser.getName().equals("font-family")) {
            return m543(parser, resources);
        }
        m550(parser);
        return null;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public static AbstractC0107 m543(XmlPullParser parser, Resources resources) {
        TypedArray array = resources.obtainAttributes(Xml.asAttributeSet(parser), C0575.FontFamily);
        String authority = array.getString(C0575.FontFamily_fontProviderAuthority);
        String providerPackage = array.getString(C0575.FontFamily_fontProviderPackage);
        String query = array.getString(C0575.FontFamily_fontProviderQuery);
        int certsId = array.getResourceId(C0575.FontFamily_fontProviderCerts, 0);
        int strategy = array.getInteger(C0575.FontFamily_fontProviderFetchStrategy, 1);
        int timeoutMs = array.getInteger(C0575.FontFamily_fontProviderFetchTimeout, 500);
        array.recycle();
        if (authority == null || providerPackage == null || query == null) {
            List<FontResourcesParserCompat.FontFileResourceEntry> fonts = new ArrayList<>();
            while (parser.next() != 3) {
                if (parser.getEventType() == 2) {
                    if (parser.getName().equals("font")) {
                        fonts.add(m548(parser, resources));
                    } else {
                        m550(parser);
                    }
                }
            }
            if (fonts.isEmpty()) {
                return null;
            }
            return new C0106((C0105[]) fonts.toArray(new C0105[fonts.size()]));
        }
        while (parser.next() != 3) {
            m550(parser);
        }
        return new C0104(new C0591(authority, providerPackage, query, m546(resources, certsId)), strategy, timeoutMs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m545(TypedArray typedArray, int index) {
        int i = Build.VERSION.SDK_INT;
        return typedArray.getType(index);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static List<List<byte[]>> m546(Resources resources, int certsId) {
        if (certsId == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArray = resources.obtainTypedArray(certsId);
        try {
            if (typedArray.length() == 0) {
                return Collections.emptyList();
            }
            List<List<byte[]>> result = new ArrayList<>();
            if (m545(typedArray, 0) == 1) {
                for (int i = 0; i < typedArray.length(); i++) {
                    int certId = typedArray.getResourceId(i, 0);
                    if (certId != 0) {
                        result.add(m547(resources.getStringArray(certId)));
                    }
                }
            } else {
                result.add(m547(resources.getStringArray(certsId)));
            }
            typedArray.recycle();
            return result;
        } finally {
            typedArray.recycle();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static List<byte[]> m547(String[] stringArray) {
        List<byte[]> result = new ArrayList<>();
        for (String item : stringArray) {
            result.add(Base64.decode(item, 0));
        }
        return result;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0105 m548(XmlPullParser parser, Resources resources) {
        TypedArray array = resources.obtainAttributes(Xml.asAttributeSet(parser), C0575.FontFamilyFont);
        int weight = array.getInt(array.hasValue(C0575.FontFamilyFont_fontWeight) ? C0575.FontFamilyFont_fontWeight : C0575.FontFamilyFont_android_fontWeight, 400);
        boolean isItalic = 1 == array.getInt(array.hasValue(C0575.FontFamilyFont_fontStyle) ? C0575.FontFamilyFont_fontStyle : C0575.FontFamilyFont_android_fontStyle, 0);
        int ttcIndexAttr = array.hasValue(C0575.FontFamilyFont_ttcIndex) ? C0575.FontFamilyFont_ttcIndex : C0575.FontFamilyFont_android_ttcIndex;
        String variationSettings = array.getString(array.hasValue(C0575.FontFamilyFont_fontVariationSettings) ? C0575.FontFamilyFont_fontVariationSettings : C0575.FontFamilyFont_android_fontVariationSettings);
        int ttcIndex = array.getInt(ttcIndexAttr, 0);
        int resourceAttr = array.hasValue(C0575.FontFamilyFont_font) ? C0575.FontFamilyFont_font : C0575.FontFamilyFont_android_font;
        int resourceId = array.getResourceId(resourceAttr, 0);
        String filename = array.getString(resourceAttr);
        array.recycle();
        while (parser.next() != 3) {
            m550(parser);
        }
        return new C0105(filename, weight, isItalic, variationSettings, ttcIndex, resourceId);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m550(XmlPullParser parser) {
        int depth = 1;
        while (depth > 0) {
            int next = parser.next();
            if (next == 2) {
                depth++;
            } else if (next == 3) {
                depth--;
            }
        }
    }
}
