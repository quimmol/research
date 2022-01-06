package ♫;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ♫.C0567;

/* renamed from: ♫.钦  reason: contains not printable characters */
public class C0564 {

    /* renamed from: θ  reason: contains not printable characters */
    public static SparseIntArray f2196 = new SparseIntArray();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final int[] f2197 = {0, 4, 8};

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public HashMap<Integer, C0565> f2198 = new HashMap<>();

    static {
        f2196.append(C0572.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        f2196.append(C0572.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        f2196.append(C0572.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        f2196.append(C0572.ConstraintSet_layout_constraintRight_toRightOf, 30);
        f2196.append(C0572.ConstraintSet_layout_constraintTop_toTopOf, 36);
        f2196.append(C0572.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        f2196.append(C0572.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        f2196.append(C0572.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        f2196.append(C0572.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        f2196.append(C0572.ConstraintSet_layout_editor_absoluteX, 6);
        f2196.append(C0572.ConstraintSet_layout_editor_absoluteY, 7);
        f2196.append(C0572.ConstraintSet_layout_constraintGuide_begin, 17);
        f2196.append(C0572.ConstraintSet_layout_constraintGuide_end, 18);
        f2196.append(C0572.ConstraintSet_layout_constraintGuide_percent, 19);
        f2196.append(C0572.ConstraintSet_android_orientation, 27);
        f2196.append(C0572.ConstraintSet_layout_constraintStart_toEndOf, 32);
        f2196.append(C0572.ConstraintSet_layout_constraintStart_toStartOf, 33);
        f2196.append(C0572.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        f2196.append(C0572.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        f2196.append(C0572.ConstraintSet_layout_goneMarginLeft, 13);
        f2196.append(C0572.ConstraintSet_layout_goneMarginTop, 16);
        f2196.append(C0572.ConstraintSet_layout_goneMarginRight, 14);
        f2196.append(C0572.ConstraintSet_layout_goneMarginBottom, 11);
        f2196.append(C0572.ConstraintSet_layout_goneMarginStart, 15);
        f2196.append(C0572.ConstraintSet_layout_goneMarginEnd, 12);
        f2196.append(C0572.ConstraintSet_layout_constraintVertical_weight, 40);
        f2196.append(C0572.ConstraintSet_layout_constraintHorizontal_weight, 39);
        f2196.append(C0572.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        f2196.append(C0572.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        f2196.append(C0572.ConstraintSet_layout_constraintHorizontal_bias, 20);
        f2196.append(C0572.ConstraintSet_layout_constraintVertical_bias, 37);
        f2196.append(C0572.ConstraintSet_layout_constraintDimensionRatio, 5);
        f2196.append(C0572.ConstraintSet_layout_constraintLeft_creator, 75);
        f2196.append(C0572.ConstraintSet_layout_constraintTop_creator, 75);
        f2196.append(C0572.ConstraintSet_layout_constraintRight_creator, 75);
        f2196.append(C0572.ConstraintSet_layout_constraintBottom_creator, 75);
        f2196.append(C0572.ConstraintSet_layout_constraintBaseline_creator, 75);
        f2196.append(C0572.ConstraintSet_android_layout_marginLeft, 24);
        f2196.append(C0572.ConstraintSet_android_layout_marginRight, 28);
        f2196.append(C0572.ConstraintSet_android_layout_marginStart, 31);
        f2196.append(C0572.ConstraintSet_android_layout_marginEnd, 8);
        f2196.append(C0572.ConstraintSet_android_layout_marginTop, 34);
        f2196.append(C0572.ConstraintSet_android_layout_marginBottom, 2);
        f2196.append(C0572.ConstraintSet_android_layout_width, 23);
        f2196.append(C0572.ConstraintSet_android_layout_height, 21);
        f2196.append(C0572.ConstraintSet_android_visibility, 22);
        f2196.append(C0572.ConstraintSet_android_alpha, 43);
        f2196.append(C0572.ConstraintSet_android_elevation, 44);
        f2196.append(C0572.ConstraintSet_android_rotationX, 45);
        f2196.append(C0572.ConstraintSet_android_rotationY, 46);
        f2196.append(C0572.ConstraintSet_android_rotation, 60);
        f2196.append(C0572.ConstraintSet_android_scaleX, 47);
        f2196.append(C0572.ConstraintSet_android_scaleY, 48);
        f2196.append(C0572.ConstraintSet_android_transformPivotX, 49);
        f2196.append(C0572.ConstraintSet_android_transformPivotY, 50);
        f2196.append(C0572.ConstraintSet_android_translationX, 51);
        f2196.append(C0572.ConstraintSet_android_translationY, 52);
        f2196.append(C0572.ConstraintSet_android_translationZ, 53);
        f2196.append(C0572.ConstraintSet_layout_constraintWidth_default, 54);
        f2196.append(C0572.ConstraintSet_layout_constraintHeight_default, 55);
        f2196.append(C0572.ConstraintSet_layout_constraintWidth_max, 56);
        f2196.append(C0572.ConstraintSet_layout_constraintHeight_max, 57);
        f2196.append(C0572.ConstraintSet_layout_constraintWidth_min, 58);
        f2196.append(C0572.ConstraintSet_layout_constraintHeight_min, 59);
        f2196.append(C0572.ConstraintSet_layout_constraintCircle, 61);
        f2196.append(C0572.ConstraintSet_layout_constraintCircleRadius, 62);
        f2196.append(C0572.ConstraintSet_layout_constraintCircleAngle, 63);
        f2196.append(C0572.ConstraintSet_android_id, 38);
        f2196.append(C0572.ConstraintSet_layout_constraintWidth_percent, 69);
        f2196.append(C0572.ConstraintSet_layout_constraintHeight_percent, 70);
        f2196.append(C0572.ConstraintSet_chainUseRtl, 71);
        f2196.append(C0572.ConstraintSet_barrierDirection, 72);
        f2196.append(C0572.ConstraintSet_constraint_referenced_ids, 73);
        f2196.append(C0572.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    /* renamed from: ♫.钦$Φ  reason: contains not printable characters */
    public static class C0565 {

        /* renamed from: µ  reason: contains not printable characters */
        public float f2199;

        /* renamed from: µ  reason: contains not printable characters and collision with other field name */
        public int f2200;

        /* renamed from: Ø  reason: contains not printable characters */
        public float f2201;

        /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
        public int f2202;

        /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
        public boolean f2203;

        /* renamed from: ö  reason: contains not printable characters */
        public float f2204;

        /* renamed from: ö  reason: contains not printable characters and collision with other field name */
        public int f2205;

        /* renamed from: ö  reason: contains not printable characters and collision with other field name */
        public boolean f2206;

        /* renamed from: ø  reason: contains not printable characters */
        public float f2207;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public int f2208;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public boolean f2209;

        /* renamed from: Α  reason: contains not printable characters */
        public int f2210;

        /* renamed from: Φ  reason: contains not printable characters */
        public float f2211;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public int f2212;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public String f2213;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public boolean f2214;

        /* renamed from: θ  reason: contains not printable characters */
        public float f2215;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public int f2216;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public String f2217;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f2218;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public int[] f2219;

        /* renamed from: Ё  reason: contains not printable characters */
        public float f2220;

        /* renamed from: Ё  reason: contains not printable characters and collision with other field name */
        public int f2221;

        /* renamed from: А  reason: contains not printable characters */
        public float f2222;

        /* renamed from: А  reason: contains not printable characters and collision with other field name */
        public int f2223;

        /* renamed from: Б  reason: contains not printable characters */
        public float f2224;

        /* renamed from: Б  reason: contains not printable characters and collision with other field name */
        public int f2225;

        /* renamed from: В  reason: contains not printable characters */
        public float f2226;

        /* renamed from: В  reason: contains not printable characters and collision with other field name */
        public int f2227;

        /* renamed from: Г  reason: contains not printable characters */
        public float f2228;

        /* renamed from: Г  reason: contains not printable characters and collision with other field name */
        public int f2229;

        /* renamed from: Д  reason: contains not printable characters */
        public float f2230;

        /* renamed from: Д  reason: contains not printable characters and collision with other field name */
        public int f2231;

        /* renamed from: Е  reason: contains not printable characters */
        public float f2232;

        /* renamed from: Е  reason: contains not printable characters and collision with other field name */
        public int f2233;

        /* renamed from: Ж  reason: contains not printable characters */
        public float f2234;

        /* renamed from: Ж  reason: contains not printable characters and collision with other field name */
        public int f2235;

        /* renamed from: З  reason: contains not printable characters */
        public int f2236;

        /* renamed from: И  reason: contains not printable characters */
        public int f2237;

        /* renamed from: Й  reason: contains not printable characters */
        public int f2238;

        /* renamed from: К  reason: contains not printable characters */
        public int f2239;

        /* renamed from: Л  reason: contains not printable characters */
        public int f2240;

        /* renamed from: М  reason: contains not printable characters */
        public int f2241;

        /* renamed from: Н  reason: contains not printable characters */
        public int f2242;

        /* renamed from: О  reason: contains not printable characters */
        public int f2243;

        /* renamed from: П  reason: contains not printable characters */
        public int f2244;

        /* renamed from: Р  reason: contains not printable characters */
        public int f2245;

        /* renamed from: С  reason: contains not printable characters */
        public int f2246;

        /* renamed from: Т  reason: contains not printable characters */
        public int f2247;

        /* renamed from: У  reason: contains not printable characters */
        public int f2248;

        /* renamed from: Ф  reason: contains not printable characters */
        public int f2249;

        /* renamed from: Х  reason: contains not printable characters */
        public int f2250;

        /* renamed from: Ц  reason: contains not printable characters */
        public int f2251;

        /* renamed from: Ч  reason: contains not printable characters */
        public int f2252;

        /* renamed from: Ш  reason: contains not printable characters */
        public int f2253;

        /* renamed from: Щ  reason: contains not printable characters */
        public int f2254;

        /* renamed from: Ъ  reason: contains not printable characters */
        public int f2255;

        /* renamed from: Ы  reason: contains not printable characters */
        public int f2256;

        /* renamed from: Ь  reason: contains not printable characters */
        public int f2257;

        /* renamed from: Э  reason: contains not printable characters */
        public int f2258;

        /* renamed from: Ю  reason: contains not printable characters */
        public int f2259;

        /* renamed from: Я  reason: contains not printable characters */
        public int f2260;

        /* renamed from: ฿  reason: contains not printable characters */
        public float f2261;

        /* renamed from: ฿  reason: contains not printable characters and collision with other field name */
        public int f2262;

        /* renamed from: ₢  reason: contains not printable characters */
        public float f2263;

        /* renamed from: ₢  reason: contains not printable characters and collision with other field name */
        public int f2264;

        /* renamed from: ₣  reason: contains not printable characters */
        public float f2265;

        /* renamed from: ₣  reason: contains not printable characters and collision with other field name */
        public int f2266;

        /* renamed from: ₤  reason: contains not printable characters */
        public float f2267;

        /* renamed from: ₤  reason: contains not printable characters and collision with other field name */
        public int f2268;

        /* renamed from: ₧  reason: contains not printable characters */
        public float f2269;

        /* renamed from: ₧  reason: contains not printable characters and collision with other field name */
        public int f2270;

        /* renamed from: ₩  reason: contains not printable characters */
        public float f2271;

        /* renamed from: ₩  reason: contains not printable characters and collision with other field name */
        public int f2272;

        public C0565() {
            this.f2218 = false;
            this.f2202 = -1;
            this.f2205 = -1;
            this.f2215 = -1.0f;
            this.f2200 = -1;
            this.f2272 = -1;
            this.f2262 = -1;
            this.f2266 = -1;
            this.f2268 = -1;
            this.f2270 = -1;
            this.f2264 = -1;
            this.f2223 = -1;
            this.f2225 = -1;
            this.f2227 = -1;
            this.f2229 = -1;
            this.f2231 = -1;
            this.f2233 = -1;
            this.f2211 = 0.5f;
            this.f2207 = 0.5f;
            this.f2217 = null;
            this.f2221 = -1;
            this.f2235 = 0;
            this.f2201 = 0.0f;
            this.f2236 = -1;
            this.f2237 = -1;
            this.f2238 = -1;
            this.f2239 = -1;
            this.f2240 = -1;
            this.f2241 = -1;
            this.f2242 = -1;
            this.f2243 = -1;
            this.f2244 = -1;
            this.f2245 = 0;
            this.f2246 = -1;
            this.f2247 = -1;
            this.f2248 = -1;
            this.f2249 = -1;
            this.f2250 = -1;
            this.f2251 = -1;
            this.f2204 = 0.0f;
            this.f2199 = 0.0f;
            this.f2252 = 0;
            this.f2253 = 0;
            this.f2271 = 1.0f;
            this.f2214 = false;
            this.f2261 = 0.0f;
            this.f2265 = 0.0f;
            this.f2267 = 0.0f;
            this.f2269 = 0.0f;
            this.f2263 = 1.0f;
            this.f2222 = 1.0f;
            this.f2224 = Float.NaN;
            this.f2226 = Float.NaN;
            this.f2228 = 0.0f;
            this.f2230 = 0.0f;
            this.f2232 = 0.0f;
            this.f2209 = false;
            this.f2203 = false;
            this.f2254 = 0;
            this.f2255 = 0;
            this.f2256 = -1;
            this.f2257 = -1;
            this.f2258 = -1;
            this.f2259 = -1;
            this.f2220 = 1.0f;
            this.f2234 = 1.0f;
            this.f2206 = false;
            this.f2260 = -1;
            this.f2210 = -1;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0565 clone() {
            C0565 clone = new C0565();
            clone.f2218 = this.f2218;
            clone.f2216 = this.f2216;
            clone.f2212 = this.f2212;
            clone.f2202 = this.f2202;
            clone.f2205 = this.f2205;
            clone.f2215 = this.f2215;
            clone.f2200 = this.f2200;
            clone.f2272 = this.f2272;
            clone.f2262 = this.f2262;
            clone.f2266 = this.f2266;
            clone.f2268 = this.f2268;
            clone.f2270 = this.f2270;
            clone.f2264 = this.f2264;
            clone.f2223 = this.f2223;
            clone.f2225 = this.f2225;
            clone.f2227 = this.f2227;
            clone.f2229 = this.f2229;
            clone.f2231 = this.f2231;
            clone.f2233 = this.f2233;
            clone.f2211 = this.f2211;
            clone.f2207 = this.f2207;
            clone.f2217 = this.f2217;
            clone.f2236 = this.f2236;
            clone.f2237 = this.f2237;
            clone.f2211 = this.f2211;
            clone.f2211 = this.f2211;
            clone.f2211 = this.f2211;
            clone.f2211 = this.f2211;
            clone.f2211 = this.f2211;
            clone.f2238 = this.f2238;
            clone.f2239 = this.f2239;
            clone.f2240 = this.f2240;
            clone.f2241 = this.f2241;
            clone.f2242 = this.f2242;
            clone.f2243 = this.f2243;
            clone.f2244 = this.f2244;
            clone.f2245 = this.f2245;
            clone.f2246 = this.f2246;
            clone.f2247 = this.f2247;
            clone.f2248 = this.f2248;
            clone.f2249 = this.f2249;
            clone.f2250 = this.f2250;
            clone.f2251 = this.f2251;
            clone.f2204 = this.f2204;
            clone.f2199 = this.f2199;
            clone.f2252 = this.f2252;
            clone.f2253 = this.f2253;
            clone.f2271 = this.f2271;
            clone.f2214 = this.f2214;
            clone.f2261 = this.f2261;
            clone.f2265 = this.f2265;
            clone.f2267 = this.f2267;
            clone.f2269 = this.f2269;
            clone.f2263 = this.f2263;
            clone.f2222 = this.f2222;
            clone.f2224 = this.f2224;
            clone.f2226 = this.f2226;
            clone.f2228 = this.f2228;
            clone.f2230 = this.f2230;
            clone.f2232 = this.f2232;
            clone.f2209 = this.f2209;
            clone.f2203 = this.f2203;
            clone.f2254 = this.f2254;
            clone.f2255 = this.f2255;
            clone.f2256 = this.f2256;
            clone.f2257 = this.f2257;
            clone.f2258 = this.f2258;
            clone.f2259 = this.f2259;
            clone.f2220 = this.f2220;
            clone.f2234 = this.f2234;
            clone.f2260 = this.f2260;
            clone.f2210 = this.f2210;
            int[] iArr = this.f2219;
            if (iArr != null) {
                clone.f2219 = Arrays.copyOf(iArr, iArr.length);
            }
            clone.f2221 = this.f2221;
            clone.f2235 = this.f2235;
            clone.f2201 = this.f2201;
            clone.f2206 = this.f2206;
            return clone;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m2810(AbstractC0563 helper, int viewId, C0567.C0568 param) {
            m2808(viewId, param);
            if (helper instanceof C0562) {
                this.f2210 = 1;
                C0562 barrier = (C0562) helper;
                this.f2260 = barrier.getType();
                this.f2219 = barrier.getReferencedIds();
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m2808(int viewId, C0567.C0568 param) {
            m2807(viewId, (ConstraintLayout.C0054) param);
            this.f2271 = param.f2286;
            this.f2265 = param.f2275;
            this.f2267 = param.f2276;
            this.f2269 = param.f2277;
            this.f2263 = param.f2278;
            this.f2222 = param.f2279;
            this.f2224 = param.f2280;
            this.f2226 = param.f2274;
            this.f2228 = param.f2281;
            this.f2230 = param.f2282;
            this.f2232 = param.f2283;
            this.f2261 = param.f2284;
            this.f2214 = param.f2285;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m2807(int viewId, ConstraintLayout.C0054 param) {
            this.f2208 = viewId;
            this.f2200 = param.f390;
            this.f2272 = param.f384;
            this.f2262 = param.f387;
            this.f2266 = param.f381;
            this.f2268 = param.f442;
            this.f2270 = param.f432;
            this.f2264 = param.f436;
            this.f2223 = param.f439;
            this.f2225 = param.f440;
            this.f2227 = param.f402;
            this.f2229 = param.f403;
            this.f2231 = param.f404;
            this.f2233 = param.f405;
            this.f2211 = param.f389;
            this.f2207 = param.f383;
            this.f2217 = param.f397;
            this.f2221 = param.f434;
            this.f2235 = param.f401;
            this.f2201 = param.f392;
            this.f2236 = param.f420;
            this.f2237 = param.f421;
            this.f2238 = param.f422;
            this.f2215 = param.f395;
            this.f2202 = param.f396;
            this.f2205 = param.f393;
            this.f2216 = ((ViewGroup.MarginLayoutParams) param).width;
            this.f2212 = ((ViewGroup.MarginLayoutParams) param).height;
            this.f2239 = ((ViewGroup.MarginLayoutParams) param).leftMargin;
            this.f2240 = ((ViewGroup.MarginLayoutParams) param).rightMargin;
            this.f2241 = ((ViewGroup.MarginLayoutParams) param).topMargin;
            this.f2242 = ((ViewGroup.MarginLayoutParams) param).bottomMargin;
            this.f2204 = param.f380;
            this.f2199 = param.f386;
            this.f2253 = param.f413;
            this.f2252 = param.f412;
            boolean z = param.f399;
            this.f2209 = z;
            this.f2203 = param.f394;
            this.f2254 = param.f414;
            this.f2255 = param.f415;
            this.f2209 = z;
            this.f2256 = param.f418;
            this.f2257 = param.f419;
            this.f2258 = param.f416;
            this.f2259 = param.f417;
            this.f2220 = param.f441;
            this.f2234 = param.f431;
            int i = Build.VERSION.SDK_INT;
            this.f2243 = param.getMarginEnd();
            this.f2244 = param.getMarginStart();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m2809(ConstraintLayout.C0054 param) {
            param.f390 = this.f2200;
            param.f384 = this.f2272;
            param.f387 = this.f2262;
            param.f381 = this.f2266;
            param.f442 = this.f2268;
            param.f432 = this.f2270;
            param.f436 = this.f2264;
            param.f439 = this.f2223;
            param.f440 = this.f2225;
            param.f402 = this.f2227;
            param.f403 = this.f2229;
            param.f404 = this.f2231;
            param.f405 = this.f2233;
            ((ViewGroup.MarginLayoutParams) param).leftMargin = this.f2239;
            ((ViewGroup.MarginLayoutParams) param).rightMargin = this.f2240;
            ((ViewGroup.MarginLayoutParams) param).topMargin = this.f2241;
            ((ViewGroup.MarginLayoutParams) param).bottomMargin = this.f2242;
            param.f409 = this.f2251;
            param.f410 = this.f2250;
            param.f389 = this.f2211;
            param.f383 = this.f2207;
            param.f434 = this.f2221;
            param.f401 = this.f2235;
            param.f392 = this.f2201;
            param.f397 = this.f2217;
            param.f420 = this.f2236;
            param.f421 = this.f2237;
            param.f380 = this.f2204;
            param.f386 = this.f2199;
            param.f413 = this.f2253;
            param.f412 = this.f2252;
            param.f399 = this.f2209;
            param.f394 = this.f2203;
            param.f414 = this.f2254;
            param.f415 = this.f2255;
            param.f418 = this.f2256;
            param.f419 = this.f2257;
            param.f416 = this.f2258;
            param.f417 = this.f2259;
            param.f441 = this.f2220;
            param.f431 = this.f2234;
            param.f422 = this.f2238;
            param.f395 = this.f2215;
            param.f396 = this.f2202;
            param.f393 = this.f2205;
            ((ViewGroup.MarginLayoutParams) param).width = this.f2216;
            ((ViewGroup.MarginLayoutParams) param).height = this.f2212;
            int i = Build.VERSION.SDK_INT;
            param.setMarginStart(this.f2244);
            param.setMarginEnd(this.f2243);
            param.m249();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2802(C0567 constraints) {
        int count = constraints.getChildCount();
        this.f2198.clear();
        for (int i = 0; i < count; i++) {
            View view = constraints.getChildAt(i);
            C0567.C0568 param = (C0567.C0568) view.getLayoutParams();
            int id = view.getId();
            if (id != -1) {
                if (!this.f2198.containsKey(Integer.valueOf(id))) {
                    this.f2198.put(Integer.valueOf(id), new C0565());
                }
                C0565 constraint = this.f2198.get(Integer.valueOf(id));
                if (view instanceof AbstractC0563) {
                    constraint.m2810((C0565) ((AbstractC0563) view), (AbstractC0563) id, (int) param);
                }
                constraint.m2808((C0565) id, (int) param);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2800(ConstraintLayout constraintLayout) {
        int count = constraintLayout.getChildCount();
        HashSet<Integer> used = new HashSet<>(this.f2198.keySet());
        for (int i = 0; i < count; i++) {
            View view = constraintLayout.getChildAt(i);
            int id = view.getId();
            if (id != -1) {
                if (this.f2198.containsKey(Integer.valueOf(id))) {
                    used.remove(Integer.valueOf(id));
                    C0565 constraint = this.f2198.get(Integer.valueOf(id));
                    if (view instanceof C0562) {
                        constraint.f2210 = 1;
                    }
                    int i2 = constraint.f2210;
                    if (i2 != -1 && i2 == 1) {
                        C0562 barrier = (C0562) view;
                        barrier.setId(id);
                        barrier.setType(constraint.f2260);
                        barrier.setAllowsGoneWidget(constraint.f2206);
                        int[] iArr = constraint.f2219;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = constraint.f2213;
                            if (str != null) {
                                constraint.f2219 = m2803(barrier, str);
                                barrier.setReferencedIds(constraint.f2219);
                            }
                        }
                    }
                    ConstraintLayout.C0054 param = (ConstraintLayout.C0054) view.getLayoutParams();
                    constraint.m2809(param);
                    view.setLayoutParams(param);
                    view.setVisibility(constraint.f2245);
                    int i3 = Build.VERSION.SDK_INT;
                    view.setAlpha(constraint.f2271);
                    view.setRotation(constraint.f2265);
                    view.setRotationX(constraint.f2267);
                    view.setRotationY(constraint.f2269);
                    view.setScaleX(constraint.f2263);
                    view.setScaleY(constraint.f2222);
                    if (!Float.isNaN(constraint.f2224)) {
                        view.setPivotX(constraint.f2224);
                    }
                    if (!Float.isNaN(constraint.f2226)) {
                        view.setPivotY(constraint.f2226);
                    }
                    view.setTranslationX(constraint.f2228);
                    view.setTranslationY(constraint.f2230);
                    int i4 = Build.VERSION.SDK_INT;
                    view.setTranslationZ(constraint.f2232);
                    if (constraint.f2214) {
                        view.setElevation(constraint.f2261);
                    }
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        Iterator<Integer> it = used.iterator();
        while (it.hasNext()) {
            Integer id2 = it.next();
            C0565 constraint2 = this.f2198.get(id2);
            int i5 = constraint2.f2210;
            if (i5 != -1 && i5 == 1) {
                C0562 barrier2 = new C0562(constraintLayout.getContext());
                barrier2.setId(id2.intValue());
                int[] iArr2 = constraint2.f2219;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = constraint2.f2213;
                    if (str2 != null) {
                        constraint2.f2219 = m2803(barrier2, str2);
                        barrier2.setReferencedIds(constraint2.f2219);
                    }
                }
                barrier2.setType(constraint2.f2260);
                ConstraintLayout.C0054 param2 = constraintLayout.generateDefaultLayoutParams();
                barrier2.m2791();
                constraint2.m2809(param2);
                constraintLayout.addView(barrier2, param2);
            }
            if (constraint2.f2218) {
                C0569 g = new C0569(constraintLayout.getContext());
                g.setId(id2.intValue());
                ConstraintLayout.C0054 param3 = constraintLayout.generateDefaultLayoutParams();
                constraint2.m2809(param3);
                constraintLayout.addView(g, param3);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2799(Context context, int resourceId) {
        XmlPullParser parser = context.getResources().getXml(resourceId);
        try {
            for (int eventType = parser.getEventType(); eventType != 1; eventType = parser.next()) {
                if (eventType == 0) {
                    parser.getName();
                } else if (eventType == 2) {
                    String tagName = parser.getName();
                    C0565 constraint = m2798(context, Xml.asAttributeSet(parser));
                    if (tagName.equalsIgnoreCase("Guideline")) {
                        constraint.f2218 = true;
                    }
                    this.f2198.put(Integer.valueOf(constraint.f2208), constraint);
                } else if (eventType != 3) {
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m2797(TypedArray a, int index, int def) {
        int ret = a.getResourceId(index, def);
        if (ret == -1) {
            return a.getInt(index, -1);
        }
        return ret;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final C0565 m2798(Context context, AttributeSet attrs) {
        C0565 c = new C0565();
        TypedArray a = context.obtainStyledAttributes(attrs, C0572.ConstraintSet);
        m2801(c, a);
        a.recycle();
        return c;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2801(C0565 c, TypedArray a) {
        int N = a.getIndexCount();
        for (int i = 0; i < N; i++) {
            int attr = a.getIndex(i);
            int i2 = f2196.get(attr);
            switch (i2) {
                case 1:
                    c.f2225 = m2797(a, attr, c.f2225);
                    break;
                case 2:
                    c.f2242 = a.getDimensionPixelSize(attr, c.f2242);
                    break;
                case 3:
                    c.f2223 = m2797(a, attr, c.f2223);
                    break;
                case 4:
                    c.f2264 = m2797(a, attr, c.f2264);
                    break;
                case 5:
                    c.f2217 = a.getString(attr);
                    break;
                case 6:
                    c.f2236 = a.getDimensionPixelOffset(attr, c.f2236);
                    break;
                case 7:
                    c.f2237 = a.getDimensionPixelOffset(attr, c.f2237);
                    break;
                case 8:
                    c.f2243 = a.getDimensionPixelSize(attr, c.f2243);
                    break;
                case 9:
                    c.f2233 = m2797(a, attr, c.f2233);
                    break;
                case 10:
                    c.f2231 = m2797(a, attr, c.f2231);
                    break;
                case 11:
                    c.f2249 = a.getDimensionPixelSize(attr, c.f2249);
                    break;
                case 12:
                    c.f2250 = a.getDimensionPixelSize(attr, c.f2250);
                    break;
                case 13:
                    c.f2246 = a.getDimensionPixelSize(attr, c.f2246);
                    break;
                case 14:
                    c.f2248 = a.getDimensionPixelSize(attr, c.f2248);
                    break;
                case 15:
                    c.f2251 = a.getDimensionPixelSize(attr, c.f2251);
                    break;
                case 16:
                    c.f2247 = a.getDimensionPixelSize(attr, c.f2247);
                    break;
                case 17:
                    c.f2202 = a.getDimensionPixelOffset(attr, c.f2202);
                    break;
                case 18:
                    c.f2205 = a.getDimensionPixelOffset(attr, c.f2205);
                    break;
                case 19:
                    c.f2215 = a.getFloat(attr, c.f2215);
                    break;
                case 20:
                    c.f2211 = a.getFloat(attr, c.f2211);
                    break;
                case 21:
                    c.f2212 = a.getLayoutDimension(attr, c.f2212);
                    break;
                case 22:
                    c.f2245 = a.getInt(attr, c.f2245);
                    c.f2245 = f2197[c.f2245];
                    break;
                case 23:
                    c.f2216 = a.getLayoutDimension(attr, c.f2216);
                    break;
                case 24:
                    c.f2239 = a.getDimensionPixelSize(attr, c.f2239);
                    break;
                case 25:
                    c.f2200 = m2797(a, attr, c.f2200);
                    break;
                case 26:
                    c.f2272 = m2797(a, attr, c.f2272);
                    break;
                case 27:
                    c.f2238 = a.getInt(attr, c.f2238);
                    break;
                case 28:
                    c.f2240 = a.getDimensionPixelSize(attr, c.f2240);
                    break;
                case 29:
                    c.f2262 = m2797(a, attr, c.f2262);
                    break;
                case 30:
                    c.f2266 = m2797(a, attr, c.f2266);
                    break;
                case 31:
                    c.f2244 = a.getDimensionPixelSize(attr, c.f2244);
                    break;
                case 32:
                    c.f2227 = m2797(a, attr, c.f2227);
                    break;
                case 33:
                    c.f2229 = m2797(a, attr, c.f2229);
                    break;
                case 34:
                    c.f2241 = a.getDimensionPixelSize(attr, c.f2241);
                    break;
                case 35:
                    c.f2270 = m2797(a, attr, c.f2270);
                    break;
                case 36:
                    c.f2268 = m2797(a, attr, c.f2268);
                    break;
                case 37:
                    c.f2207 = a.getFloat(attr, c.f2207);
                    break;
                case 38:
                    c.f2208 = a.getResourceId(attr, c.f2208);
                    break;
                case 39:
                    c.f2199 = a.getFloat(attr, c.f2199);
                    break;
                case 40:
                    c.f2204 = a.getFloat(attr, c.f2204);
                    break;
                case 41:
                    c.f2252 = a.getInt(attr, c.f2252);
                    break;
                case 42:
                    c.f2253 = a.getInt(attr, c.f2253);
                    break;
                case 43:
                    c.f2271 = a.getFloat(attr, c.f2271);
                    break;
                case 44:
                    c.f2214 = true;
                    c.f2261 = a.getDimension(attr, c.f2261);
                    break;
                case 45:
                    c.f2267 = a.getFloat(attr, c.f2267);
                    break;
                case 46:
                    c.f2269 = a.getFloat(attr, c.f2269);
                    break;
                case 47:
                    c.f2263 = a.getFloat(attr, c.f2263);
                    break;
                case 48:
                    c.f2222 = a.getFloat(attr, c.f2222);
                    break;
                case 49:
                    c.f2224 = a.getFloat(attr, c.f2224);
                    break;
                case 50:
                    c.f2226 = a.getFloat(attr, c.f2226);
                    break;
                case 51:
                    c.f2228 = a.getDimension(attr, c.f2228);
                    break;
                case 52:
                    c.f2230 = a.getDimension(attr, c.f2230);
                    break;
                case 53:
                    c.f2232 = a.getDimension(attr, c.f2232);
                    break;
                default:
                    switch (i2) {
                        case 60:
                            c.f2265 = a.getFloat(attr, c.f2265);
                            continue;
                        case 61:
                            c.f2221 = m2797(a, attr, c.f2221);
                            continue;
                        case 62:
                            c.f2235 = a.getDimensionPixelSize(attr, c.f2235);
                            continue;
                        case 63:
                            c.f2201 = a.getFloat(attr, c.f2201);
                            continue;
                        default:
                            switch (i2) {
                                case 69:
                                    c.f2220 = a.getFloat(attr, 1.0f);
                                    continue;
                                case 70:
                                    c.f2234 = a.getFloat(attr, 1.0f);
                                    continue;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    continue;
                                case 72:
                                    c.f2260 = a.getInt(attr, c.f2260);
                                    continue;
                                case 73:
                                    c.f2213 = a.getString(attr);
                                    continue;
                                case 74:
                                    c.f2206 = a.getBoolean(attr, c.f2206);
                                    continue;
                                case 75:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(attr) + "   " + f2196.get(attr));
                                    continue;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(attr) + "   " + f2196.get(attr));
                                    continue;
                                    continue;
                            }
                    }
            }
        }
    }

    /* JADX INFO: Multiple debug info for r7v1 int: [D('constraintLayout' androidx.constraintlayout.widget.ConstraintLayout), D('count' int)] */
    /* renamed from: θ  reason: contains not printable characters */
    public final int[] m2803(View view, String referenceIdString) {
        Object value;
        String[] split = referenceIdString.split(",");
        Context context = view.getContext();
        int[] tags = new int[split.length];
        int count = 0;
        int i = 0;
        while (i < split.length) {
            String idString = split[i].trim();
            int tag = 0;
            try {
                tag = C0571.class.getField(idString).getInt(null);
            } catch (Exception e) {
            }
            if (tag == 0) {
                tag = context.getResources().getIdentifier(idString, "id", context.getPackageName());
            }
            if (tag == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (value = ((ConstraintLayout) view.getParent()).m242(0, idString)) != null && (value instanceof Integer)) {
                tag = ((Integer) value).intValue();
            }
            tags[count] = tag;
            i++;
            count++;
        }
        if (count != split.length) {
            return Arrays.copyOf(tags, count);
        }
        return tags;
    }
}
