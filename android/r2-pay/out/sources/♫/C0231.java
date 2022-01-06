package ♫;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ♫.C0129;

/* renamed from: ♫.ᔾ  reason: contains not printable characters */
public class C0231 extends AbstractC0212 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final PorterDuff.Mode f895 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ø  reason: contains not printable characters */
    public boolean f896;

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean f897;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ColorFilter f898;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Matrix f899;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public PorterDuffColorFilter f900;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Rect f901;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0238 f902;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final float[] f903;

    public C0231() {
        this.f896 = true;
        this.f903 = new float[9];
        this.f899 = new Matrix();
        this.f901 = new Rect();
        this.f902 = new C0238();
    }

    public C0231(C0238 state) {
        this.f896 = true;
        this.f903 = new float[9];
        this.f899 = new Matrix();
        this.f901 = new Rect();
        this.f902 = state;
        this.f900 = m1043(state.f939, state.f942);
    }

    public Drawable mutate() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f897 && super.mutate() == this) {
            this.f902 = new C0238(this.f902);
            this.f897 = true;
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Object m1044(String name) {
        return this.f902.f943.f962.get(name);
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new C0239(drawable.getConstantState());
        }
        this.f902.f938 = getChangingConfigurations();
        return this.f902;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f901);
        if (this.f901.width() > 0 && this.f901.height() > 0) {
            ColorFilter colorFilter = this.f898;
            if (colorFilter == null) {
                colorFilter = this.f900;
            }
            canvas.getMatrix(this.f899);
            this.f899.getValues(this.f903);
            float canvasScaleX = Math.abs(this.f903[0]);
            float canvasScaleY = Math.abs(this.f903[4]);
            float canvasSkewX = Math.abs(this.f903[1]);
            float canvasSkewY = Math.abs(this.f903[3]);
            if (!(canvasSkewX == 0.0f && canvasSkewY == 0.0f)) {
                canvasScaleX = 1.0f;
                canvasScaleY = 1.0f;
            }
            int scaledWidth = Math.min(2048, (int) (((float) this.f901.width()) * canvasScaleX));
            int scaledHeight = Math.min(2048, (int) (((float) this.f901.height()) * canvasScaleY));
            if (scaledWidth > 0 && scaledHeight > 0) {
                int saveCount = canvas.save();
                Rect rect = this.f901;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m1048()) {
                    canvas.translate((float) this.f901.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f901.offsetTo(0, 0);
                this.f902.m1072(scaledWidth, scaledHeight);
                if (!this.f896) {
                    this.f902.m1068(scaledWidth, scaledHeight);
                } else if (!this.f902.m1074()) {
                    this.f902.m1068(scaledWidth, scaledHeight);
                    this.f902.m1071();
                }
                this.f902.m1073(canvas, colorFilter, this.f901);
                canvas.restoreToCount(saveCount);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return C0171.m854(drawable);
        }
        return this.f902.f943.getRootAlpha();
    }

    public void setAlpha(int alpha) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        } else if (this.f902.f943.getRootAlpha() != alpha) {
            this.f902.f943.setRootAlpha(alpha);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f898 = colorFilter;
        invalidateSelf();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public PorterDuffColorFilter m1043(ColorStateList tint, PorterDuff.Mode tintMode) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return new PorterDuffColorFilter(tint.getColorForState(getState(), 0), tintMode);
    }

    public void setTint(int tint) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            C0171.m859(drawable, tint);
        } else {
            setTintList(ColorStateList.valueOf(tint));
        }
    }

    public void setTintList(ColorStateList tint) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            C0171.m861(drawable, tint);
            return;
        }
        C0238 state = this.f902;
        if (state.f939 != tint) {
            state.f939 = tint;
            this.f900 = m1043(tint, state.f942);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            C0171.m864(drawable, tintMode);
            return;
        }
        C0238 state = this.f902;
        if (state.f942 != tintMode) {
            state.f942 = tintMode;
            this.f900 = m1043(state.f939, tintMode);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        C0238 r0;
        ColorStateList colorStateList;
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((r0 = this.f902) != null && (r0.m1067() || ((colorStateList = this.f902.f939) != null && colorStateList.isStateful())));
    }

    public boolean onStateChange(int[] stateSet) {
        PorterDuff.Mode mode;
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.setState(stateSet);
        }
        boolean changed = false;
        C0238 state = this.f902;
        ColorStateList colorStateList = state.f939;
        if (!(colorStateList == null || (mode = state.f942) == null)) {
            this.f900 = m1043(colorStateList, mode);
            invalidateSelf();
            changed = true;
        }
        if (!state.m1067() || !state.m1076(stateSet)) {
            return changed;
        }
        invalidateSelf();
        return true;
    }

    public int getOpacity() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f902.f943.f953;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f902.f943.f949;
    }

    public boolean canApplyTheme() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable == null) {
            return false;
        }
        C0171.m866(drawable);
        return false;
    }

    public boolean isAutoMirrored() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return C0171.m853(drawable);
        }
        return this.f902.f944;
    }

    public void setAutoMirrored(boolean mirrored) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            C0171.m865(drawable, mirrored);
        } else {
            this.f902.f944 = mirrored;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037 A[Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c A[Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }] */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ♫.C0231 m1041(android.content.res.Resources r7, int r8, android.content.res.Resources.Theme r9) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0021
            ♫.ᔾ r0 = new ♫.ᔾ
            r0.<init>()
            android.graphics.drawable.Drawable r1 = ♫.C0115.m610(r7, r8, r9)
            r0.f834 = r1
            ♫.ᔾ$₣ r1 = new ♫.ᔾ$₣
            android.graphics.drawable.Drawable r2 = r0.f834
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r1.<init>(r2)
            return r0
        L_0x0021:
            android.content.res.XmlResourceParser r2 = r7.getXml(r8)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
        L_0x0029:
            int r4 = r2.next()     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            r5 = r4
            r6 = 2
            if (r4 == r6) goto L_0x0035
            r4 = 1
            if (r5 == r4) goto L_0x0035
            goto L_0x0029
        L_0x0035:
            if (r5 != r6) goto L_0x003c
            ♫.ᔾ r0 = m1042(r7, r2, r3, r9)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            return r0
        L_0x003c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            java.lang.String r6 = "No start tag found"
            r4.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
            throw r4     // Catch:{ XmlPullParserException -> 0x0049, IOException -> 0x0044 }
        L_0x0044:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
            goto L_0x004e
        L_0x0049:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x004e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0231.m1041(android.content.res.Resources, int, android.content.res.Resources$Theme):♫.ᔾ");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0231 m1042(Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        C0231 drawable = new C0231();
        drawable.inflate(r, parser, attrs, theme);
        return drawable;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m1039(int color, float alpha) {
        return (color & 16777215) | (((int) (((float) Color.alpha(color)) * alpha)) << 24);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.inflate(res, parser, attrs);
        } else {
            inflate(res, parser, attrs, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            C0171.m863(drawable, res, parser, attrs, theme);
            return;
        }
        C0238 state = this.f902;
        state.f943 = new C0240();
        TypedArray a = C0124.m624(res, theme, attrs, C0172.f778);
        m1046(a, parser);
        a.recycle();
        state.f938 = getChangingConfigurations();
        state.f933 = true;
        m1045(res, parser, attrs, theme);
        this.f900 = m1043(state.f939, state.f942);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static PorterDuff.Mode m1040(int value, PorterDuff.Mode defaultMode) {
        if (value == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (value == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (value == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (value) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return defaultMode;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1046(TypedArray a, XmlPullParser parser) {
        C0238 state = this.f902;
        C0240 pathRenderer = state.f943;
        state.f942 = m1040(C0124.m621(a, parser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList tint = a.getColorStateList(1);
        if (tint != null) {
            state.f939 = tint;
        }
        state.f944 = C0124.m628(a, parser, "autoMirrored", 5, state.f944);
        pathRenderer.f948 = C0124.m622(a, parser, "viewportWidth", 7, pathRenderer.f948);
        pathRenderer.f947 = C0124.m622(a, parser, "viewportHeight", 8, pathRenderer.f947);
        if (pathRenderer.f948 <= 0.0f) {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (pathRenderer.f947 > 0.0f) {
            pathRenderer.f953 = a.getDimension(3, pathRenderer.f953);
            pathRenderer.f949 = a.getDimension(2, pathRenderer.f949);
            if (pathRenderer.f953 <= 0.0f) {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (pathRenderer.f949 > 0.0f) {
                pathRenderer.setAlpha(C0124.m622(a, parser, "alpha", 4, pathRenderer.getAlpha()));
                String name = a.getString(0);
                if (name != null) {
                    pathRenderer.f960 = name;
                    pathRenderer.f962.put(name, pathRenderer);
                }
            } else {
                throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(a.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1045(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        C0238 state = this.f902;
        C0240 pathRenderer = state.f943;
        boolean noPathTag = true;
        ArrayDeque<VectorDrawableCompat.VGroup> groupStack = new ArrayDeque<>();
        groupStack.push(pathRenderer.f961);
        int eventType = parser.getEventType();
        int innerDepth = parser.getDepth() + 1;
        for (int i = 1; eventType != i && (parser.getDepth() >= innerDepth || eventType != 3); i = 1) {
            if (eventType == 2) {
                String tagName = parser.getName();
                C0233 currentGroup = (C0233) groupStack.peek();
                if ("path".equals(tagName)) {
                    C0235 path = new C0235();
                    path.m1060(res, attrs, theme, parser);
                    currentGroup.f917.add(path);
                    if (path.getPathName() != null) {
                        pathRenderer.f962.put(path.getPathName(), path);
                    }
                    noPathTag = false;
                    state.f938 |= ((AbstractC0232) path).f904;
                } else if ("clip-path".equals(tagName)) {
                    C0236 path2 = new C0236();
                    path2.m1065(res, attrs, theme, parser);
                    currentGroup.f917.add(path2);
                    if (path2.getPathName() != null) {
                        pathRenderer.f962.put(path2.getPathName(), path2);
                    }
                    state.f938 |= ((AbstractC0232) path2).f904;
                } else if ("group".equals(tagName)) {
                    C0233 newChildGroup = new C0233();
                    newChildGroup.m1052(res, attrs, theme, parser);
                    currentGroup.f917.add(newChildGroup);
                    groupStack.push(newChildGroup);
                    if (newChildGroup.getGroupName() != null) {
                        pathRenderer.f962.put(newChildGroup.getGroupName(), newChildGroup);
                    }
                    state.f938 |= newChildGroup.f914;
                }
            } else if (eventType == 3 && "group".equals(parser.getName())) {
                groupStack.pop();
            }
            eventType = parser.next();
        }
        if (noPathTag) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1047(boolean allowCaching) {
        this.f896 = allowCaching;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m1048() {
        int i = Build.VERSION.SDK_INT;
        if (!isAutoMirrored() || C0171.m852((Drawable) this) != 1) {
            return false;
        }
        return true;
    }

    public void onBoundsChange(Rect bounds) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    public int getChangingConfigurations() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f902.getChangingConfigurations();
    }

    public void invalidateSelf() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void scheduleSelf(Runnable what, long when) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.scheduleSelf(what, when);
        } else {
            super.scheduleSelf(what, when);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.setVisible(visible, restart);
        }
        return super.setVisible(visible, restart);
    }

    public void unscheduleSelf(Runnable what) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.unscheduleSelf(what);
        } else {
            super.unscheduleSelf(what);
        }
    }

    /* renamed from: ♫.ᔾ$₣  reason: contains not printable characters */
    public static class C0239 extends Drawable.ConstantState {

        /* renamed from: θ  reason: contains not printable characters */
        public final Drawable.ConstantState f945;

        public C0239(Drawable.ConstantState state) {
            this.f945 = state;
        }

        public Drawable newDrawable() {
            C0231 drawableCompat = new C0231();
            ((AbstractC0212) drawableCompat).f834 = (VectorDrawable) this.f945.newDrawable();
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res) {
            C0231 drawableCompat = new C0231();
            ((AbstractC0212) drawableCompat).f834 = (VectorDrawable) this.f945.newDrawable(res);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res, Resources.Theme theme) {
            C0231 drawableCompat = new C0231();
            ((AbstractC0212) drawableCompat).f834 = (VectorDrawable) this.f945.newDrawable(res, theme);
            return drawableCompat;
        }

        public boolean canApplyTheme() {
            return this.f945.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f945.getChangingConfigurations();
        }
    }

    /* renamed from: ♫.ᔾ$฿  reason: contains not printable characters */
    public static class C0238 extends Drawable.ConstantState {

        /* renamed from: ø  reason: contains not printable characters */
        public boolean f933;

        /* renamed from: Φ  reason: contains not printable characters */
        public int f934;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public ColorStateList f935;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public PorterDuff.Mode f936;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public boolean f937;

        /* renamed from: θ  reason: contains not printable characters */
        public int f938;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public ColorStateList f939;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Bitmap f940;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Paint f941;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public PorterDuff.Mode f942;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0240 f943;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f944;

        public C0238(C0238 copy) {
            this.f939 = null;
            this.f942 = C0231.f895;
            if (copy != null) {
                this.f938 = copy.f938;
                this.f943 = new C0240(copy.f943);
                Paint paint = copy.f943.f951;
                if (paint != null) {
                    this.f943.f951 = new Paint(paint);
                }
                Paint paint2 = copy.f943.f956;
                if (paint2 != null) {
                    this.f943.f956 = new Paint(paint2);
                }
                this.f939 = copy.f939;
                this.f942 = copy.f942;
                this.f944 = copy.f944;
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1073(Canvas canvas, ColorFilter filter, Rect originalBounds) {
            canvas.drawBitmap(this.f940, (Rect) null, originalBounds, m1070(filter));
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public boolean m1069() {
            return this.f943.getRootAlpha() < 255;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public Paint m1070(ColorFilter filter) {
            if (!m1069() && filter == null) {
                return null;
            }
            if (this.f941 == null) {
                this.f941 = new Paint();
                this.f941.setFilterBitmap(true);
            }
            this.f941.setAlpha(this.f943.getRootAlpha());
            this.f941.setColorFilter(filter);
            return this.f941;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public void m1068(int width, int height) {
            this.f940.eraseColor(0);
            this.f943.m1079(new Canvas(this.f940), width, height, (ColorFilter) null);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1072(int width, int height) {
            if (this.f940 == null || !m1075(width, height)) {
                this.f940 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f933 = true;
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1075(int width, int height) {
            if (width == this.f940.getWidth() && height == this.f940.getHeight()) {
                return true;
            }
            return false;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1074() {
            if (!this.f933 && this.f935 == this.f939 && this.f936 == this.f942 && this.f937 == this.f944 && this.f934 == this.f943.getRootAlpha()) {
                return true;
            }
            return false;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1071() {
            this.f935 = this.f939;
            this.f936 = this.f942;
            this.f934 = this.f943.getRootAlpha();
            this.f937 = this.f944;
            this.f933 = false;
        }

        public C0238() {
            this.f939 = null;
            this.f942 = C0231.f895;
            this.f943 = new C0240();
        }

        public Drawable newDrawable() {
            return new C0231(this);
        }

        public Drawable newDrawable(Resources res) {
            return new C0231(this);
        }

        public int getChangingConfigurations() {
            return this.f938;
        }

        /* renamed from: ø  reason: contains not printable characters */
        public boolean m1067() {
            return this.f943.m1082();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1076(int[] stateSet) {
            boolean changed = this.f943.m1083(stateSet);
            this.f933 |= changed;
            return changed;
        }
    }

    /* renamed from: ♫.ᔾ$₩  reason: contains not printable characters */
    public static class C0240 {

        /* renamed from: Φ  reason: contains not printable characters */
        public static final Matrix f946 = new Matrix();

        /* renamed from: Ø  reason: contains not printable characters */
        public float f947;

        /* renamed from: ø  reason: contains not printable characters */
        public float f948;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public float f949;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public int f950;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public Paint f951;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public final Path f952;

        /* renamed from: θ  reason: contains not printable characters */
        public float f953;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public int f954;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final Matrix f955;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Paint f956;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final Path f957;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public PathMeasure f958;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Boolean f959;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public String f960;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final C0233 f961;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final C0514<String, Object> f962;

        public C0240() {
            this.f955 = new Matrix();
            this.f953 = 0.0f;
            this.f949 = 0.0f;
            this.f948 = 0.0f;
            this.f947 = 0.0f;
            this.f950 = 255;
            this.f960 = null;
            this.f959 = null;
            this.f962 = new C0514<>();
            this.f961 = new C0233();
            this.f957 = new Path();
            this.f952 = new Path();
        }

        public void setRootAlpha(int alpha) {
            this.f950 = alpha;
        }

        public int getRootAlpha() {
            return this.f950;
        }

        public void setAlpha(float alpha) {
            setRootAlpha((int) (255.0f * alpha));
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public C0240(C0240 copy) {
            this.f955 = new Matrix();
            this.f953 = 0.0f;
            this.f949 = 0.0f;
            this.f948 = 0.0f;
            this.f947 = 0.0f;
            this.f950 = 255;
            this.f960 = null;
            this.f959 = null;
            this.f962 = new C0514<>();
            this.f961 = new C0233(copy.f961, this.f962);
            this.f957 = new Path(copy.f957);
            this.f952 = new Path(copy.f952);
            this.f953 = copy.f953;
            this.f949 = copy.f949;
            this.f948 = copy.f948;
            this.f947 = copy.f947;
            this.f954 = copy.f954;
            this.f950 = copy.f950;
            this.f960 = copy.f960;
            String str = copy.f960;
            if (str != null) {
                this.f962.put(str, this);
            }
            this.f959 = copy.f959;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m1080(C0233 currentGroup, Matrix currentMatrix, Canvas canvas, int w, int h, ColorFilter filter) {
            currentGroup.f915.set(currentMatrix);
            currentGroup.f915.preConcat(currentGroup.f912);
            canvas.save();
            for (int i = 0; i < currentGroup.f917.size(); i++) {
                AbstractC0234 child = currentGroup.f917.get(i);
                if (child instanceof C0233) {
                    m1080((C0233) child, currentGroup.f915, canvas, w, h, filter);
                } else if (child instanceof AbstractC0232) {
                    m1081(currentGroup, (AbstractC0232) child, canvas, w, h, filter);
                }
            }
            canvas.restore();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1079(Canvas canvas, int w, int h, ColorFilter filter) {
            m1080(this.f961, f946, canvas, w, h, filter);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m1081(C0233 vGroup, AbstractC0232 vPath, Canvas canvas, int w, int h, ColorFilter filter) {
            float len;
            float scaleX = ((float) w) / this.f948;
            float scaleY = ((float) h) / this.f947;
            float minScale = Math.min(scaleX, scaleY);
            Matrix groupStackedMatrix = vGroup.f915;
            this.f955.set(groupStackedMatrix);
            this.f955.postScale(scaleX, scaleY);
            float matrixScale = m1078(groupStackedMatrix);
            if (matrixScale != 0.0f) {
                vPath.m1050(this.f957);
                Path path = this.f957;
                this.f952.reset();
                if (vPath.m1049()) {
                    this.f952.addPath(path, this.f955);
                    canvas.clipPath(this.f952);
                    return;
                }
                C0235 fullPath = (C0235) vPath;
                if (fullPath.f921 != 0.0f || fullPath.f922 != 1.0f) {
                    float f = fullPath.f921;
                    float f2 = fullPath.f920;
                    float start = (f + f2) % 1.0f;
                    float end = (fullPath.f922 + f2) % 1.0f;
                    if (this.f958 == null) {
                        this.f958 = new PathMeasure();
                    }
                    this.f958.setPath(this.f957, false);
                    float len2 = this.f958.getLength();
                    float start2 = start * len2;
                    float end2 = end * len2;
                    path.reset();
                    if (start2 > end2) {
                        this.f958.getSegment(start2, len2, path, true);
                        len = 0.0f;
                        this.f958.getSegment(0.0f, end2, path, true);
                    } else {
                        len = 0.0f;
                        this.f958.getSegment(start2, end2, path, true);
                    }
                    path.rLineTo(len, len);
                }
                this.f952.addPath(path, this.f955);
                if (fullPath.f926.m1267()) {
                    C0286 fill = fullPath.f926;
                    if (this.f951 == null) {
                        this.f951 = new Paint(1);
                        this.f951.setStyle(Paint.Style.FILL);
                    }
                    Paint fillPaint = this.f951;
                    if (fill.m1272()) {
                        Shader shader = fill.m1270();
                        shader.setLocalMatrix(this.f955);
                        fillPaint.setShader(shader);
                        fillPaint.setAlpha(Math.round(fullPath.f923 * 255.0f));
                    } else {
                        fillPaint.setShader(null);
                        fillPaint.setAlpha(255);
                        fillPaint.setColor(C0231.m1039(fill.m1269(), fullPath.f923));
                    }
                    fillPaint.setColorFilter(filter);
                    this.f952.setFillType(fullPath.f925 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f952, fillPaint);
                }
                if (fullPath.f930.m1267()) {
                    C0286 strokeColor = fullPath.f930;
                    if (this.f956 == null) {
                        this.f956 = new Paint(1);
                        this.f956.setStyle(Paint.Style.STROKE);
                    }
                    Paint strokePaint = this.f956;
                    Paint.Join join = fullPath.f929;
                    if (join != null) {
                        strokePaint.setStrokeJoin(join);
                    }
                    Paint.Cap cap = fullPath.f928;
                    if (cap != null) {
                        strokePaint.setStrokeCap(cap);
                    }
                    strokePaint.setStrokeMiter(fullPath.f932);
                    if (strokeColor.m1272()) {
                        Shader shader2 = strokeColor.m1270();
                        shader2.setLocalMatrix(this.f955);
                        strokePaint.setShader(shader2);
                        strokePaint.setAlpha(Math.round(fullPath.f924 * 255.0f));
                    } else {
                        strokePaint.setShader(null);
                        strokePaint.setAlpha(255);
                        strokePaint.setColor(C0231.m1039(strokeColor.m1269(), fullPath.f924));
                    }
                    strokePaint.setColorFilter(filter);
                    strokePaint.setStrokeWidth(fullPath.f927 * minScale * matrixScale);
                    canvas.drawPath(this.f952, strokePaint);
                }
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public static float m1077(float v1x, float v1y, float v2x, float v2y) {
            return (v1x * v2y) - (v1y * v2x);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final float m1078(Matrix groupStackedMatrix) {
            float[] unitVectors = {0.0f, 1.0f, 1.0f, 0.0f};
            groupStackedMatrix.mapVectors(unitVectors);
            float crossProduct = m1077(unitVectors[0], unitVectors[1], unitVectors[2], unitVectors[3]);
            float maxScale = Math.max((float) Math.hypot((double) unitVectors[0], (double) unitVectors[1]), (float) Math.hypot((double) unitVectors[2], (double) unitVectors[3]));
            if (maxScale > 0.0f) {
                return Math.abs(crossProduct) / maxScale;
            }
            return 0.0f;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1082() {
            if (this.f959 == null) {
                this.f959 = Boolean.valueOf(this.f961.m1054());
            }
            return this.f959.booleanValue();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1083(int[] stateSet) {
            return this.f961.m1055(stateSet);
        }
    }

    /* renamed from: ♫.ᔾ$ö  reason: contains not printable characters */
    public static abstract class AbstractC0234 {
        public AbstractC0234() {
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1056() {
            return false;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1057(int[] stateSet) {
            return false;
        }
    }

    /* renamed from: ♫.ᔾ$Ø  reason: contains not printable characters */
    public static class C0233 extends AbstractC0234 {

        /* renamed from: µ  reason: contains not printable characters */
        public float f907 = 0.0f;

        /* renamed from: Ø  reason: contains not printable characters */
        public float f908 = 1.0f;

        /* renamed from: ö  reason: contains not printable characters */
        public float f909 = 1.0f;

        /* renamed from: ø  reason: contains not printable characters */
        public float f910 = 0.0f;

        /* renamed from: Φ  reason: contains not printable characters */
        public float f911 = 0.0f;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public final Matrix f912 = new Matrix();

        /* renamed from: θ  reason: contains not printable characters */
        public float f913 = 0.0f;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public int f914;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final Matrix f915 = new Matrix();

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public String f916 = null;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final ArrayList<AbstractC0234> f917 = new ArrayList<>();

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public int[] f918;

        /* renamed from: ₩  reason: contains not printable characters */
        public float f919 = 0.0f;

        public C0233(C0233 copy, C0514<String, Object> r8) {
            super();
            AbstractC0232 newPath;
            this.f913 = copy.f913;
            this.f911 = copy.f911;
            this.f910 = copy.f910;
            this.f908 = copy.f908;
            this.f909 = copy.f909;
            this.f907 = copy.f907;
            this.f919 = copy.f919;
            this.f918 = copy.f918;
            this.f916 = copy.f916;
            this.f914 = copy.f914;
            String str = this.f916;
            if (str != null) {
                r8.put(str, this);
            }
            this.f912.set(copy.f912);
            ArrayList<VectorDrawableCompat.VObject> children = copy.f917;
            for (int i = 0; i < children.size(); i++) {
                Object copyChild = children.get(i);
                if (copyChild instanceof C0233) {
                    this.f917.add(new C0233((C0233) copyChild, r8));
                } else {
                    if (copyChild instanceof C0235) {
                        newPath = new C0235((C0235) copyChild);
                    } else if (copyChild instanceof C0236) {
                        newPath = new C0236((C0236) copyChild);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f917.add(newPath);
                    String str2 = newPath.f905;
                    if (str2 != null) {
                        r8.put(str2, newPath);
                    }
                }
            }
        }

        public C0233() {
            super();
        }

        public String getGroupName() {
            return this.f916;
        }

        public Matrix getLocalMatrix() {
            return this.f912;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1052(Resources res, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            TypedArray a = C0124.m624(res, theme, attrs, C0172.f777);
            m1053(a, parser);
            a.recycle();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m1053(TypedArray a, XmlPullParser parser) {
            this.f918 = null;
            this.f913 = C0124.m622(a, parser, "rotation", 5, this.f913);
            this.f911 = a.getFloat(1, this.f911);
            this.f910 = a.getFloat(2, this.f910);
            this.f908 = C0124.m622(a, parser, "scaleX", 3, this.f908);
            this.f909 = C0124.m622(a, parser, "scaleY", 4, this.f909);
            this.f907 = C0124.m622(a, parser, "translateX", 6, this.f907);
            this.f919 = C0124.m622(a, parser, "translateY", 7, this.f919);
            String groupName = a.getString(0);
            if (groupName != null) {
                this.f916 = groupName;
            }
            m1051();
        }

        @Override // ♫.C0231.AbstractC0234
        /* renamed from: θ  reason: contains not printable characters */
        public final void m1051() {
            this.f912.reset();
            this.f912.postTranslate(-this.f911, -this.f910);
            this.f912.postScale(this.f908, this.f909);
            this.f912.postRotate(this.f913, 0.0f, 0.0f);
            this.f912.postTranslate(this.f907 + this.f911, this.f919 + this.f910);
        }

        public float getRotation() {
            return this.f913;
        }

        public void setRotation(float rotation) {
            if (rotation != this.f913) {
                this.f913 = rotation;
                m1051();
            }
        }

        public float getPivotX() {
            return this.f911;
        }

        public void setPivotX(float pivotX) {
            if (pivotX != this.f911) {
                this.f911 = pivotX;
                m1051();
            }
        }

        public float getPivotY() {
            return this.f910;
        }

        public void setPivotY(float pivotY) {
            if (pivotY != this.f910) {
                this.f910 = pivotY;
                m1051();
            }
        }

        public float getScaleX() {
            return this.f908;
        }

        public void setScaleX(float scaleX) {
            if (scaleX != this.f908) {
                this.f908 = scaleX;
                m1051();
            }
        }

        public float getScaleY() {
            return this.f909;
        }

        public void setScaleY(float scaleY) {
            if (scaleY != this.f909) {
                this.f909 = scaleY;
                m1051();
            }
        }

        public float getTranslateX() {
            return this.f907;
        }

        public void setTranslateX(float translateX) {
            if (translateX != this.f907) {
                this.f907 = translateX;
                m1051();
            }
        }

        public float getTranslateY() {
            return this.f919;
        }

        public void setTranslateY(float translateY) {
            if (translateY != this.f919) {
                this.f919 = translateY;
                m1051();
            }
        }

        @Override // ♫.C0231.AbstractC0234
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1054() {
            for (int i = 0; i < this.f917.size(); i++) {
                if (this.f917.get(i).m1056()) {
                    return true;
                }
            }
            return false;
        }

        @Override // ♫.C0231.AbstractC0234
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1055(int[] stateSet) {
            boolean changed = false;
            for (int i = 0; i < this.f917.size(); i++) {
                changed |= this.f917.get(i).m1057(stateSet);
            }
            return changed;
        }
    }

    /* renamed from: ♫.ᔾ$µ  reason: contains not printable characters */
    public static abstract class AbstractC0232 extends AbstractC0234 {

        /* renamed from: θ  reason: contains not printable characters */
        public int f904;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public String f905;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0129.C0130[] f906 = null;

        public AbstractC0232() {
            super();
        }

        public AbstractC0232(AbstractC0232 copy) {
            super();
            this.f905 = copy.f905;
            this.f904 = copy.f904;
            this.f906 = C0129.m652(copy.f906);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1050(Path path) {
            path.reset();
            C0129.C0130[] r0 = this.f906;
            if (r0 != null) {
                C0129.C0130.m656(r0, path);
            }
        }

        public String getPathName() {
            return this.f905;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public boolean m1049() {
            return false;
        }

        public C0129.C0130[] getPathData() {
            return this.f906;
        }

        public void setPathData(C0129.C0130[] nodes) {
            if (!C0129.m648(this.f906, nodes)) {
                this.f906 = C0129.m652(nodes);
            } else {
                C0129.m647(this.f906, nodes);
            }
        }
    }

    /* renamed from: ♫.ᔾ$Φ  reason: contains not printable characters */
    public static class C0236 extends AbstractC0232 {
        public C0236() {
        }

        public C0236(C0236 copy) {
            super(copy);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1065(Resources r, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            if (C0124.m629(parser, "pathData")) {
                TypedArray a = C0124.m624(r, theme, attrs, C0172.f774);
                m1066(a);
                a.recycle();
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m1066(TypedArray a) {
            String pathName = a.getString(0);
            if (pathName != null) {
                ((AbstractC0232) this).f905 = pathName;
            }
            String pathData = a.getString(1);
            if (pathData != null) {
                ((AbstractC0232) this).f906 = C0129.m651(pathData);
            }
        }

        @Override // ♫.C0231.AbstractC0232
        /* renamed from: Φ  reason: contains not printable characters */
        public boolean m1064() {
            return true;
        }
    }

    /* renamed from: ♫.ᔾ$ø  reason: contains not printable characters */
    public static class C0235 extends AbstractC0232 {

        /* renamed from: µ  reason: contains not printable characters */
        public float f920 = 0.0f;

        /* renamed from: Ø  reason: contains not printable characters */
        public float f921 = 0.0f;

        /* renamed from: ö  reason: contains not printable characters */
        public float f922 = 1.0f;

        /* renamed from: ø  reason: contains not printable characters */
        public float f923 = 1.0f;

        /* renamed from: Φ  reason: contains not printable characters */
        public float f924 = 1.0f;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public int f925 = 0;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public C0286 f926;

        /* renamed from: θ  reason: contains not printable characters */
        public float f927 = 0.0f;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Paint.Cap f928 = Paint.Cap.BUTT;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Paint.Join f929 = Paint.Join.MITER;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0286 f930;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public int[] f931;

        /* renamed from: ₩  reason: contains not printable characters */
        public float f932 = 4.0f;

        public C0235() {
        }

        public C0235(C0235 copy) {
            super(copy);
            this.f931 = copy.f931;
            this.f930 = copy.f930;
            this.f927 = copy.f927;
            this.f924 = copy.f924;
            this.f926 = copy.f926;
            this.f925 = copy.f925;
            this.f923 = copy.f923;
            this.f921 = copy.f921;
            this.f922 = copy.f922;
            this.f920 = copy.f920;
            this.f928 = copy.f928;
            this.f929 = copy.f929;
            this.f932 = copy.f932;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final Paint.Cap m1058(int id, Paint.Cap defValue) {
            if (id == 0) {
                return Paint.Cap.BUTT;
            }
            if (id == 1) {
                return Paint.Cap.ROUND;
            }
            if (id != 2) {
                return defValue;
            }
            return Paint.Cap.SQUARE;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final Paint.Join m1059(int id, Paint.Join defValue) {
            if (id == 0) {
                return Paint.Join.MITER;
            }
            if (id == 1) {
                return Paint.Join.ROUND;
            }
            if (id != 2) {
                return defValue;
            }
            return Paint.Join.BEVEL;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1060(Resources r, AttributeSet attrs, Resources.Theme theme, XmlPullParser parser) {
            TypedArray a = C0124.m624(r, theme, attrs, C0172.f776);
            m1061(a, parser, theme);
            a.recycle();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m1061(TypedArray a, XmlPullParser parser, Resources.Theme theme) {
            this.f931 = null;
            if (C0124.m629(parser, "pathData")) {
                String pathName = a.getString(0);
                if (pathName != null) {
                    ((AbstractC0232) this).f905 = pathName;
                }
                String pathData = a.getString(2);
                if (pathData != null) {
                    ((AbstractC0232) this).f906 = C0129.m651(pathData);
                }
                this.f926 = C0124.m627(a, parser, theme, "fillColor", 1, 0);
                this.f923 = C0124.m622(a, parser, "fillAlpha", 12, this.f923);
                this.f928 = m1058(C0124.m621(a, parser, "strokeLineCap", 8, -1), this.f928);
                this.f929 = m1059(C0124.m621(a, parser, "strokeLineJoin", 9, -1), this.f929);
                this.f932 = C0124.m622(a, parser, "strokeMiterLimit", 10, this.f932);
                this.f930 = C0124.m627(a, parser, theme, "strokeColor", 3, 0);
                this.f924 = C0124.m622(a, parser, "strokeAlpha", 11, this.f924);
                this.f927 = C0124.m622(a, parser, "strokeWidth", 4, this.f927);
                this.f922 = C0124.m622(a, parser, "trimPathEnd", 6, this.f922);
                this.f920 = C0124.m622(a, parser, "trimPathOffset", 7, this.f920);
                this.f921 = C0124.m622(a, parser, "trimPathStart", 5, this.f921);
                this.f925 = C0124.m621(a, parser, "fillType", 13, this.f925);
            }
        }

        @Override // ♫.C0231.AbstractC0234
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1062() {
            return this.f926.m1268() || this.f930.m1268();
        }

        @Override // ♫.C0231.AbstractC0234
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1063(int[] stateSet) {
            return this.f926.m1273(stateSet) | this.f930.m1273(stateSet);
        }

        public int getStrokeColor() {
            return this.f930.m1269();
        }

        public void setStrokeColor(int strokeColor) {
            this.f930.m1271(strokeColor);
        }

        public float getStrokeWidth() {
            return this.f927;
        }

        public void setStrokeWidth(float strokeWidth) {
            this.f927 = strokeWidth;
        }

        public float getStrokeAlpha() {
            return this.f924;
        }

        public void setStrokeAlpha(float strokeAlpha) {
            this.f924 = strokeAlpha;
        }

        public int getFillColor() {
            return this.f926.m1269();
        }

        public void setFillColor(int fillColor) {
            this.f926.m1271(fillColor);
        }

        public float getFillAlpha() {
            return this.f923;
        }

        public void setFillAlpha(float fillAlpha) {
            this.f923 = fillAlpha;
        }

        public float getTrimPathStart() {
            return this.f921;
        }

        public void setTrimPathStart(float trimPathStart) {
            this.f921 = trimPathStart;
        }

        public float getTrimPathEnd() {
            return this.f922;
        }

        public void setTrimPathEnd(float trimPathEnd) {
            this.f922 = trimPathEnd;
        }

        public float getTrimPathOffset() {
            return this.f920;
        }

        public void setTrimPathOffset(float trimPathOffset) {
            this.f920 = trimPathOffset;
        }
    }
}
