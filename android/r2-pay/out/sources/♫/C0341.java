package ♫;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;

/* renamed from: ♫.人  reason: contains not printable characters */
public class C0341 extends Drawable implements Drawable.Callback {

    /* renamed from: ø  reason: contains not printable characters */
    public boolean f1208;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1209 = -1;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public long f1210;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Drawable f1211;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1212;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1213 = 255;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public long f1214;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Rect f1215;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f1216;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Runnable f1217;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0342 f1218;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0343 f1219;

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0342 m1571() {
        throw null;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f1216;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f1211;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f1218.getChangingConfigurations();
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m1576() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    public boolean getPadding(Rect padding) {
        boolean result;
        Rect r = this.f1218.m1591();
        if (r != null) {
            padding.set(r);
            result = (((r.left | r.top) | r.bottom) | r.right) != 0;
        } else {
            Drawable drawable = this.f1216;
            if (drawable != null) {
                result = drawable.getPadding(padding);
            } else {
                result = super.getPadding(padding);
            }
        }
        if (m1576()) {
            int left = padding.left;
            padding.left = padding.right;
            padding.right = left;
        }
        return result;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f1216;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public void setAlpha(int alpha) {
        if (!this.f1212 || this.f1213 != alpha) {
            this.f1212 = true;
            this.f1213 = alpha;
            Drawable drawable = this.f1216;
            if (drawable == null) {
                return;
            }
            if (this.f1214 == 0) {
                drawable.setAlpha(alpha);
            } else {
                m1575(false);
            }
        }
    }

    public int getAlpha() {
        return this.f1213;
    }

    public void setDither(boolean dither) {
        AbstractC0342 r0 = this.f1218;
        if (r0.f1250 != dither) {
            r0.f1250 = dither;
            Drawable drawable = this.f1216;
            if (drawable != null) {
                drawable.setDither(r0.f1250);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC0342 r0 = this.f1218;
        r0.f1240 = true;
        if (r0.f1233 != colorFilter) {
            r0.f1233 = colorFilter;
            Drawable drawable = this.f1216;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setTintList(ColorStateList tint) {
        AbstractC0342 r0 = this.f1218;
        r0.f1241 = true;
        if (r0.f1231 != tint) {
            r0.f1231 = tint;
            C0171.m861(this.f1216, tint);
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        AbstractC0342 r0 = this.f1218;
        r0.f1242 = true;
        if (r0.f1234 != tintMode) {
            r0.f1234 = tintMode;
            C0171.m864(this.f1216, tintMode);
        }
    }

    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f1211;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
        Drawable drawable2 = this.f1216;
        if (drawable2 != null) {
            drawable2.setBounds(bounds);
        }
    }

    public void setAutoMirrored(boolean mirrored) {
        AbstractC0342 r0 = this.f1218;
        if (r0.f1246 != mirrored) {
            r0.f1246 = mirrored;
            Drawable drawable = this.f1216;
            if (drawable != null) {
                C0171.m865(drawable, r0.f1246);
            }
        }
    }

    public boolean isAutoMirrored() {
        return this.f1218.f1246;
    }

    public void jumpToCurrentState() {
        boolean changed = false;
        Drawable drawable = this.f1211;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f1211 = null;
            changed = true;
        }
        Drawable drawable2 = this.f1216;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f1212) {
                this.f1216.setAlpha(this.f1213);
            }
        }
        if (this.f1210 != 0) {
            this.f1210 = 0;
            changed = true;
        }
        if (this.f1214 != 0) {
            this.f1214 = 0;
            changed = true;
        }
        if (changed) {
            invalidateSelf();
        }
    }

    public void setHotspot(float x, float y) {
        Drawable drawable = this.f1216;
        if (drawable != null) {
            C0171.m858(drawable, x, y);
        }
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Rect rect = this.f1215;
        if (rect == null) {
            this.f1215 = new Rect(left, top, right, bottom);
        } else {
            rect.set(left, top, right, bottom);
        }
        Drawable drawable = this.f1216;
        if (drawable != null) {
            C0171.m860(drawable, left, top, right, bottom);
        }
    }

    public void getHotspotBounds(Rect outRect) {
        Rect rect = this.f1215;
        if (rect != null) {
            outRect.set(rect);
        } else {
            super.getHotspotBounds(outRect);
        }
    }

    public boolean onStateChange(int[] state) {
        Drawable drawable = this.f1211;
        if (drawable != null) {
            return drawable.setState(state);
        }
        Drawable drawable2 = this.f1216;
        if (drawable2 != null) {
            return drawable2.setState(state);
        }
        return false;
    }

    public boolean onLevelChange(int level) {
        Drawable drawable = this.f1211;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        Drawable drawable2 = this.f1216;
        if (drawable2 != null) {
            return drawable2.setLevel(level);
        }
        return false;
    }

    public boolean onLayoutDirectionChanged(int layoutDirection) {
        return this.f1218.m1601(layoutDirection, m1570());
    }

    public int getIntrinsicWidth() {
        if (this.f1218.m1588()) {
            return this.f1218.m1578();
        }
        Drawable drawable = this.f1216;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getIntrinsicHeight() {
        if (this.f1218.m1588()) {
            return this.f1218.m1582();
        }
        Drawable drawable = this.f1216;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getMinimumWidth() {
        if (this.f1218.m1588()) {
            return this.f1218.m1581();
        }
        Drawable drawable = this.f1216;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getMinimumHeight() {
        if (this.f1218.m1588()) {
            return this.f1218.m1579();
        }
        Drawable drawable = this.f1216;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public void invalidateDrawable(Drawable who) {
        AbstractC0342 r0 = this.f1218;
        if (r0 != null) {
            r0.m1583();
        }
        if (who == this.f1216 && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        if (who == this.f1216 && getCallback() != null) {
            getCallback().scheduleDrawable(this, what, when);
        }
    }

    public void unscheduleDrawable(Drawable who, Runnable what) {
        if (who == this.f1216 && getCallback() != null) {
            getCallback().unscheduleDrawable(this, what);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        boolean changed = super.setVisible(visible, restart);
        Drawable drawable = this.f1211;
        if (drawable != null) {
            drawable.setVisible(visible, restart);
        }
        Drawable drawable2 = this.f1216;
        if (drawable2 != null) {
            drawable2.setVisible(visible, restart);
        }
        return changed;
    }

    public int getOpacity() {
        Drawable drawable = this.f1216;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f1218.m1602();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m1570() {
        return this.f1209;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* renamed from: θ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m1577(int r10) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.C0341.m1577(int):boolean");
    }

    /* renamed from: ♫.人$θ  reason: contains not printable characters */
    public class RunnableC0344 implements Runnable {
        public RunnableC0344() {
        }

        public void run() {
            C0341.this.m1575(true);
            C0341.this.invalidateSelf();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1573(Drawable d) {
        if (this.f1219 == null) {
            this.f1219 = new C0343();
        }
        C0343 r0 = this.f1219;
        r0.m1604(d.getCallback());
        d.setCallback(r0);
        try {
            if (this.f1218.f1251 <= 0 && this.f1212) {
                d.setAlpha(this.f1213);
            }
            if (this.f1218.f1240) {
                d.setColorFilter(this.f1218.f1233);
            } else {
                if (this.f1218.f1241) {
                    C0171.m861(d, this.f1218.f1231);
                }
                if (this.f1218.f1242) {
                    C0171.m864(d, this.f1218.f1234);
                }
            }
            d.setVisible(isVisible(), true);
            d.setDither(this.f1218.f1250);
            d.setState(getState());
            d.setLevel(getLevel());
            d.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                d.setLayoutDirection(getLayoutDirection());
            }
            int i = Build.VERSION.SDK_INT;
            d.setAutoMirrored(this.f1218.f1246);
            Rect hotspotBounds = this.f1215;
            int i2 = Build.VERSION.SDK_INT;
            if (hotspotBounds != null) {
                d.setHotspotBounds(hotspotBounds.left, hotspotBounds.top, hotspotBounds.right, hotspotBounds.bottom);
            }
        } finally {
            d.setCallback(this.f1219.m1603());
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1575(boolean schedule) {
        this.f1212 = true;
        long now = SystemClock.uptimeMillis();
        boolean animating = false;
        Drawable drawable = this.f1216;
        if (drawable != null) {
            long j = this.f1214;
            if (j != 0) {
                if (j <= now) {
                    drawable.setAlpha(this.f1213);
                    this.f1214 = 0;
                } else {
                    drawable.setAlpha(((255 - (((int) ((j - now) * 255)) / this.f1218.f1251)) * this.f1213) / 255);
                    animating = true;
                }
            }
        } else {
            this.f1214 = 0;
        }
        Drawable drawable2 = this.f1211;
        if (drawable2 != null) {
            long j2 = this.f1210;
            if (j2 != 0) {
                if (j2 <= now) {
                    drawable2.setVisible(false, false);
                    this.f1211 = null;
                    this.f1210 = 0;
                } else {
                    drawable2.setAlpha((this.f1213 * (((int) ((j2 - now) * 255)) / this.f1218.f1245)) / 255);
                    animating = true;
                }
            }
        } else {
            this.f1210 = 0;
        }
        if (schedule && animating) {
            scheduleSelf(this.f1217, 16 + now);
        }
    }

    public Drawable getCurrent() {
        return this.f1216;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1572(Resources res) {
        this.f1218.m1598(res);
    }

    public void applyTheme(Resources.Theme theme) {
        this.f1218.m1597(theme);
    }

    public boolean canApplyTheme() {
        return this.f1218.canApplyTheme();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f1218.m1600()) {
            return null;
        }
        this.f1218.f1228 = getChangingConfigurations();
        return this.f1218;
    }

    public Drawable mutate() {
        if (!this.f1208 && super.mutate() == this) {
            AbstractC0342 clone = m1571();
            clone.m1580();
            m1574(clone);
            this.f1208 = true;
        }
        return this;
    }

    /* renamed from: ♫.人$ø  reason: contains not printable characters */
    public static abstract class AbstractC0342 extends Drawable.ConstantState {

        /* renamed from: µ  reason: contains not printable characters */
        public int f1220;

        /* renamed from: µ  reason: contains not printable characters and collision with other field name */
        public boolean f1221;

        /* renamed from: Ø  reason: contains not printable characters */
        public int f1222;

        /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
        public boolean f1223;

        /* renamed from: ö  reason: contains not printable characters */
        public int f1224;

        /* renamed from: ö  reason: contains not printable characters and collision with other field name */
        public boolean f1225;

        /* renamed from: ø  reason: contains not printable characters */
        public int f1226;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public boolean f1227 = false;

        /* renamed from: Φ  reason: contains not printable characters */
        public int f1228;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public boolean f1229;

        /* renamed from: θ  reason: contains not printable characters */
        public int f1230 = 160;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public ColorStateList f1231;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Resources f1232;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public ColorFilter f1233;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public PorterDuff.Mode f1234;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Rect f1235;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public SparseArray<Drawable.ConstantState> f1236;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final C0341 f1237;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f1238 = false;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Drawable[] f1239;

        /* renamed from: А  reason: contains not printable characters */
        public boolean f1240;

        /* renamed from: Б  reason: contains not printable characters */
        public boolean f1241;

        /* renamed from: В  reason: contains not printable characters */
        public boolean f1242;

        /* renamed from: ฿  reason: contains not printable characters */
        public int f1243;

        /* renamed from: ฿  reason: contains not printable characters and collision with other field name */
        public boolean f1244;

        /* renamed from: ₢  reason: contains not printable characters */
        public int f1245 = 0;

        /* renamed from: ₢  reason: contains not printable characters and collision with other field name */
        public boolean f1246;

        /* renamed from: ₣  reason: contains not printable characters */
        public int f1247;

        /* renamed from: ₣  reason: contains not printable characters and collision with other field name */
        public boolean f1248;

        /* renamed from: ₤  reason: contains not printable characters */
        public int f1249;

        /* renamed from: ₤  reason: contains not printable characters and collision with other field name */
        public boolean f1250 = true;

        /* renamed from: ₧  reason: contains not printable characters */
        public int f1251 = 0;

        /* renamed from: ₧  reason: contains not printable characters and collision with other field name */
        public boolean f1252;

        /* renamed from: ₩  reason: contains not printable characters */
        public int f1253;

        /* renamed from: ₩  reason: contains not printable characters and collision with other field name */
        public boolean f1254;

        /* renamed from: Ø  reason: contains not printable characters */
        public abstract void m1580();

        public AbstractC0342(AbstractC0342 orig, C0341 owner, Resources res) {
            this.f1237 = owner;
            this.f1232 = res != null ? res : orig != null ? orig.f1232 : null;
            this.f1230 = C0341.m1569(res, orig != null ? orig.f1230 : 0);
            if (orig != null) {
                this.f1228 = orig.f1228;
                this.f1226 = orig.f1226;
                this.f1244 = true;
                this.f1248 = true;
                this.f1238 = orig.f1238;
                this.f1227 = orig.f1227;
                this.f1250 = orig.f1250;
                this.f1252 = orig.f1252;
                this.f1249 = orig.f1249;
                this.f1251 = orig.f1251;
                this.f1245 = orig.f1245;
                this.f1246 = orig.f1246;
                this.f1233 = orig.f1233;
                this.f1240 = orig.f1240;
                this.f1231 = orig.f1231;
                this.f1234 = orig.f1234;
                this.f1241 = orig.f1241;
                this.f1242 = orig.f1242;
                if (orig.f1230 == this.f1230) {
                    if (orig.f1229) {
                        this.f1235 = new Rect(orig.f1235);
                        this.f1229 = true;
                    }
                    if (orig.f1223) {
                        this.f1224 = orig.f1224;
                        this.f1220 = orig.f1220;
                        this.f1253 = orig.f1253;
                        this.f1243 = orig.f1243;
                        this.f1223 = true;
                    }
                }
                if (orig.f1225) {
                    this.f1247 = orig.f1247;
                    this.f1225 = true;
                }
                if (orig.f1221) {
                    this.f1254 = orig.f1254;
                    this.f1221 = true;
                }
                Drawable[] origDr = orig.f1239;
                this.f1239 = new Drawable[origDr.length];
                this.f1222 = orig.f1222;
                SparseArray<Drawable.ConstantState> origDf = orig.f1236;
                if (origDf != null) {
                    this.f1236 = origDf.clone();
                } else {
                    this.f1236 = new SparseArray<>(this.f1222);
                }
                int count = this.f1222;
                for (int i = 0; i < count; i++) {
                    if (origDr[i] != null) {
                        Drawable.ConstantState cs = origDr[i].getConstantState();
                        if (cs != null) {
                            this.f1236.put(i, cs);
                        } else {
                            this.f1239[i] = origDr[i];
                        }
                    }
                }
                return;
            }
            this.f1239 = new Drawable[10];
            this.f1222 = 0;
        }

        public int getChangingConfigurations() {
            return this.f1228 | this.f1226;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final int m1590(Drawable dr) {
            int pos = this.f1222;
            if (pos >= this.f1239.length) {
                m1596(pos, pos + 10);
            }
            dr.mutate();
            dr.setVisible(false, true);
            dr.setCallback(this.f1237);
            this.f1239[pos] = dr;
            this.f1222++;
            this.f1226 |= dr.getChangingConfigurations();
            m1583();
            this.f1235 = null;
            this.f1229 = false;
            this.f1223 = false;
            this.f1244 = false;
            return pos;
        }

        /* renamed from: ø  reason: contains not printable characters */
        public void m1583() {
            this.f1225 = false;
            this.f1221 = false;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final int m1589() {
            return this.f1239.length;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public final void m1585() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f1236;
            if (sparseArray != null) {
                int futureCount = sparseArray.size();
                for (int keyIndex = 0; keyIndex < futureCount; keyIndex++) {
                    this.f1239[this.f1236.keyAt(keyIndex)] = m1593(this.f1236.valueAt(keyIndex).newDrawable(this.f1232));
                }
                this.f1236 = null;
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final Drawable m1593(Drawable child) {
            if (Build.VERSION.SDK_INT >= 23) {
                child.setLayoutDirection(this.f1249);
            }
            Drawable child2 = child.mutate();
            child2.setCallback(this.f1237);
            return child2;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public final int m1584() {
            return this.f1222;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final Drawable m1592(int index) {
            int keyIndex;
            Drawable result = this.f1239[index];
            if (result != null) {
                return result;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f1236;
            if (sparseArray == null || (keyIndex = sparseArray.indexOfKey(index)) < 0) {
                return null;
            }
            Drawable prepared = m1593(this.f1236.valueAt(keyIndex).newDrawable(this.f1232));
            this.f1239[index] = prepared;
            this.f1236.removeAt(keyIndex);
            if (this.f1236.size() == 0) {
                this.f1236 = null;
            }
            return prepared;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final boolean m1601(int layoutDirection, int currentIndex) {
            boolean changed = false;
            int count = this.f1222;
            Drawable[] drawables = this.f1239;
            for (int i = 0; i < count; i++) {
                if (drawables[i] != null) {
                    boolean childChanged = false;
                    if (Build.VERSION.SDK_INT >= 23) {
                        childChanged = drawables[i].setLayoutDirection(layoutDirection);
                    }
                    if (i == currentIndex) {
                        changed = childChanged;
                    }
                }
            }
            this.f1249 = layoutDirection;
            return changed;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m1598(Resources res) {
            if (res != null) {
                this.f1232 = res;
                int targetDensity = C0341.m1569(res, this.f1230);
                int sourceDensity = this.f1230;
                this.f1230 = targetDensity;
                if (sourceDensity != targetDensity) {
                    this.f1223 = false;
                    this.f1229 = false;
                }
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m1597(Resources.Theme theme) {
            if (theme != null) {
                m1585();
                int count = this.f1222;
                Drawable[] drawables = this.f1239;
                for (int i = 0; i < count; i++) {
                    if (drawables[i] != null && drawables[i].canApplyTheme()) {
                        drawables[i].applyTheme(theme);
                        this.f1226 |= drawables[i].getChangingConfigurations();
                    }
                }
                m1598(theme.getResources());
            }
        }

        public boolean canApplyTheme() {
            int count = this.f1222;
            Drawable[] drawables = this.f1239;
            for (int i = 0; i < count; i++) {
                Drawable d = drawables[i];
                if (d == null) {
                    Drawable.ConstantState future = this.f1236.get(i);
                    if (future != null && future.canApplyTheme()) {
                        return true;
                    }
                } else if (d.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public final void m1587(boolean variable) {
            this.f1238 = variable;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final Rect m1591() {
            if (this.f1238) {
                return null;
            }
            if (this.f1235 != null || this.f1229) {
                return this.f1235;
            }
            m1585();
            Rect r = null;
            Rect t = new Rect();
            int count = this.f1222;
            Drawable[] drawables = this.f1239;
            for (int i = 0; i < count; i++) {
                if (drawables[i].getPadding(t)) {
                    if (r == null) {
                        r = new Rect(0, 0, 0, 0);
                    }
                    int i2 = t.left;
                    if (i2 > r.left) {
                        r.left = i2;
                    }
                    int i3 = t.top;
                    if (i3 > r.top) {
                        r.top = i3;
                    }
                    int i4 = t.right;
                    if (i4 > r.right) {
                        r.right = i4;
                    }
                    int i5 = t.bottom;
                    if (i5 > r.bottom) {
                        r.bottom = i5;
                    }
                }
            }
            this.f1229 = true;
            this.f1235 = r;
            return r;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m1599(boolean constant) {
            this.f1227 = constant;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public final boolean m1588() {
            return this.f1227;
        }

        /* renamed from: µ  reason: contains not printable characters */
        public final int m1578() {
            if (!this.f1223) {
                m1594();
            }
            return this.f1224;
        }

        /* renamed from: ø  reason: contains not printable characters */
        public final int m1582() {
            if (!this.f1223) {
                m1594();
            }
            return this.f1220;
        }

        /* renamed from: ö  reason: contains not printable characters */
        public final int m1581() {
            if (!this.f1223) {
                m1594();
            }
            return this.f1253;
        }

        /* renamed from: Ø  reason: contains not printable characters */
        public final int m1579() {
            if (!this.f1223) {
                m1594();
            }
            return this.f1243;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1594() {
            this.f1223 = true;
            m1585();
            int count = this.f1222;
            Drawable[] drawables = this.f1239;
            this.f1220 = -1;
            this.f1224 = -1;
            this.f1243 = 0;
            this.f1253 = 0;
            for (int i = 0; i < count; i++) {
                Drawable dr = drawables[i];
                int s = dr.getIntrinsicWidth();
                if (s > this.f1224) {
                    this.f1224 = s;
                }
                int s2 = dr.getIntrinsicHeight();
                if (s2 > this.f1220) {
                    this.f1220 = s2;
                }
                int s3 = dr.getMinimumWidth();
                if (s3 > this.f1253) {
                    this.f1253 = s3;
                }
                int s4 = dr.getMinimumHeight();
                if (s4 > this.f1243) {
                    this.f1243 = s4;
                }
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m1595(int duration) {
            this.f1251 = duration;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public final void m1586(int duration) {
            this.f1245 = duration;
        }

        /* renamed from: ₩  reason: contains not printable characters */
        public final int m1602() {
            if (this.f1225) {
                return this.f1247;
            }
            m1585();
            int count = this.f1222;
            Drawable[] drawables = this.f1239;
            int op = count > 0 ? drawables[0].getOpacity() : -2;
            for (int i = 1; i < count; i++) {
                op = Drawable.resolveOpacity(op, drawables[i].getOpacity());
            }
            this.f1247 = op;
            this.f1225 = true;
            return op;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1596(int oldSize, int newSize) {
            Drawable[] newDrawables = new Drawable[newSize];
            System.arraycopy(this.f1239, 0, newDrawables, 0, oldSize);
            this.f1239 = newDrawables;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public synchronized boolean m1600() {
            if (this.f1244) {
                return this.f1248;
            }
            m1585();
            this.f1244 = true;
            int count = this.f1222;
            Drawable[] drawables = this.f1239;
            for (int i = 0; i < count; i++) {
                if (drawables[i].getConstantState() == null) {
                    this.f1248 = false;
                    return false;
                }
            }
            this.f1248 = true;
            return true;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1574(AbstractC0342 state) {
        this.f1218 = state;
        int i = this.f1209;
        if (i >= 0) {
            this.f1216 = state.m1592(i);
            Drawable drawable = this.f1216;
            if (drawable != null) {
                m1573(drawable);
            }
        }
        this.f1211 = null;
    }

    /* renamed from: ♫.人$Φ  reason: contains not printable characters */
    public static class C0343 implements Drawable.Callback {

        /* renamed from: θ  reason: contains not printable characters */
        public Drawable.Callback f1255;

        /* renamed from: θ  reason: contains not printable characters */
        public C0343 m1604(Drawable.Callback callback) {
            this.f1255 = callback;
            return this;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public Drawable.Callback m1603() {
            Drawable.Callback callback = this.f1255;
            this.f1255 = null;
            return callback;
        }

        public void invalidateDrawable(Drawable who) {
        }

        public void scheduleDrawable(Drawable who, Runnable what, long when) {
            Drawable.Callback callback = this.f1255;
            if (callback != null) {
                callback.scheduleDrawable(who, what, when);
            }
        }

        public void unscheduleDrawable(Drawable who, Runnable what) {
            Drawable.Callback callback = this.f1255;
            if (callback != null) {
                callback.unscheduleDrawable(who, what);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m1569(Resources r, int parentDensity) {
        int densityDpi = r == null ? parentDensity : r.getDisplayMetrics().densityDpi;
        if (densityDpi == 0) {
            return 160;
        }
        return densityDpi;
    }
}
