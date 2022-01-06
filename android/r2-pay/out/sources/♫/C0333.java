package ♫;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ♫.C0341;
import ♫.C0346;

/* renamed from: ♫.交  reason: contains not printable characters */
public class C0333 extends C0346 {

    /* renamed from: Ø  reason: contains not printable characters */
    public int f1194;

    /* renamed from: ö  reason: contains not printable characters */
    public boolean f1195;

    /* renamed from: ø  reason: contains not printable characters */
    public int f1196;

    /* renamed from: θ  reason: contains not printable characters */
    public C0337 f1197;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0340 f1198;

    static {
        C0333.class.getSimpleName();
    }

    public C0333() {
        this(null, null);
    }

    public C0333(C0337 state, Resources res) {
        super(null);
        this.f1196 = -1;
        this.f1194 = -1;
        m1545(new C0337(state, this, res));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0333 m1534(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        String name = parser.getName();
        if (name.equals("animated-selector")) {
            C0333 asl = new C0333();
            asl.m1543(context, resources, parser, attrs, theme);
            return asl;
        }
        throw new XmlPullParserException(parser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1543(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        TypedArray a = C0124.m624(resources, theme, attrs, C0291.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(C0291.AnimatedStateListDrawableCompat_android_visible, true), true);
        m1544(a);
        m1572(resources);
        a.recycle();
        m1536(context, resources, parser, attrs, theme);
        m1542();
    }

    @Override // ♫.C0341
    public boolean setVisible(boolean visible, boolean restart) {
        boolean changed = super.setVisible(visible, restart);
        if (this.f1198 != null && (changed || restart)) {
            if (visible) {
                this.f1198.m1566();
            } else {
                jumpToCurrentState();
            }
        }
        return changed;
    }

    @Override // ♫.C0346
    public boolean isStateful() {
        return true;
    }

    @Override // ♫.C0341
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0340 r0 = this.f1198;
        if (r0 != null) {
            r0.m1565();
            this.f1198 = null;
            m1577(this.f1196);
            this.f1196 = -1;
            this.f1194 = -1;
        }
    }

    @Override // ♫.C0346, ♫.C0341
    public boolean onStateChange(int[] stateSet) {
        int targetIndex = this.f1197.m1557(stateSet);
        boolean changed = targetIndex != m1570() && (m1537(targetIndex) || m1577(targetIndex));
        Drawable current = getCurrent();
        if (current != null) {
            return changed | current.setState(stateSet);
        }
        return changed;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean m1537(int toIndex) {
        int fromIndex;
        int transitionIndex;
        AbstractC0340 transition;
        AbstractC0340 currentTransition = this.f1198;
        if (currentTransition == null) {
            fromIndex = m1570();
        } else if (toIndex == this.f1196) {
            return true;
        } else {
            if (toIndex != this.f1194 || !currentTransition.m1568()) {
                fromIndex = this.f1196;
                currentTransition.m1565();
            } else {
                currentTransition.m1567();
                this.f1196 = this.f1194;
                this.f1194 = toIndex;
                return true;
            }
        }
        this.f1198 = null;
        this.f1194 = -1;
        this.f1196 = -1;
        C0337 state = this.f1197;
        int fromId = state.m1559(fromIndex);
        int toId = state.m1559(toIndex);
        if (toId == 0 || fromId == 0 || (transitionIndex = state.m1560(fromId, toId)) < 0) {
            return false;
        }
        boolean hasReversibleFlag = state.m1556(fromId, toId);
        m1577(transitionIndex);
        Drawable d = getCurrent();
        if (d instanceof AnimationDrawable) {
            transition = new C0336((AnimationDrawable) d, state.m1558(fromId, toId), hasReversibleFlag);
        } else if (d instanceof C0200) {
            transition = new C0335((C0200) d);
        } else if (!(d instanceof Animatable)) {
            return false;
        } else {
            transition = new C0338((Animatable) d);
        }
        transition.m1566();
        this.f1198 = transition;
        this.f1194 = fromIndex;
        this.f1196 = toIndex;
        return true;
    }

    /* renamed from: ♫.交$₩  reason: contains not printable characters */
    public static abstract class AbstractC0340 {
        /* renamed from: ø  reason: contains not printable characters */
        public abstract void m1565();

        /* renamed from: Φ  reason: contains not printable characters */
        public abstract void m1566();

        public AbstractC0340() {
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1567() {
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1568() {
            return false;
        }
    }

    /* renamed from: ♫.交$Φ  reason: contains not printable characters */
    public static class C0338 extends AbstractC0340 {

        /* renamed from: θ  reason: contains not printable characters */
        public final Animatable f1207;

        public C0338(Animatable a) {
            super();
            this.f1207 = a;
        }

        @Override // ♫.C0333.AbstractC0340
        /* renamed from: Φ  reason: contains not printable characters */
        public void m1564() {
            this.f1207.start();
        }

        @Override // ♫.C0333.AbstractC0340
        /* renamed from: ø  reason: contains not printable characters */
        public void m1563() {
            this.f1207.stop();
        }
    }

    /* renamed from: ♫.交$ö  reason: contains not printable characters */
    public static class C0336 extends AbstractC0340 {

        /* renamed from: θ  reason: contains not printable characters */
        public final ObjectAnimator f1203;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final boolean f1204;

        public C0336(AnimationDrawable ad, boolean reversed, boolean hasReversibleFlag) {
            super();
            int frameCount = ad.getNumberOfFrames();
            int fromFrame = reversed ? frameCount - 1 : 0;
            int toFrame = reversed ? 0 : frameCount - 1;
            C0334 interp = new C0334(ad, reversed);
            ObjectAnimator anim = ObjectAnimator.ofInt(ad, "currentIndex", fromFrame, toFrame);
            int i = Build.VERSION.SDK_INT;
            anim.setAutoCancel(true);
            anim.setDuration((long) interp.m1546());
            anim.setInterpolator(interp);
            this.f1204 = hasReversibleFlag;
            this.f1203 = anim;
        }

        @Override // ♫.C0333.AbstractC0340, ♫.C0333.AbstractC0340
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1553() {
            return this.f1204;
        }

        @Override // ♫.C0333.AbstractC0340
        /* renamed from: Φ  reason: contains not printable characters */
        public void m1551() {
            this.f1203.start();
        }

        @Override // ♫.C0333.AbstractC0340, ♫.C0333.AbstractC0340
        /* renamed from: θ  reason: contains not printable characters */
        public void m1552() {
            this.f1203.reverse();
        }

        @Override // ♫.C0333.AbstractC0340
        /* renamed from: ø  reason: contains not printable characters */
        public void m1550() {
            this.f1203.cancel();
        }
    }

    /* renamed from: ♫.交$Ø  reason: contains not printable characters */
    public static class C0335 extends AbstractC0340 {

        /* renamed from: θ  reason: contains not printable characters */
        public final C0200 f1202;

        public C0335(C0200 avd) {
            super();
            this.f1202 = avd;
        }

        @Override // ♫.C0333.AbstractC0340
        /* renamed from: Φ  reason: contains not printable characters */
        public void m1549() {
            this.f1202.start();
        }

        @Override // ♫.C0333.AbstractC0340
        /* renamed from: ø  reason: contains not printable characters */
        public void m1548() {
            this.f1202.stop();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1544(TypedArray a) {
        C0337 state = this.f1197;
        int i = Build.VERSION.SDK_INT;
        ((C0341.AbstractC0342) state).f1228 |= a.getChangingConfigurations();
        state.m1587(a.getBoolean(C0291.AnimatedStateListDrawableCompat_android_variablePadding, ((C0341.AbstractC0342) state).f1238));
        state.m1599(a.getBoolean(C0291.AnimatedStateListDrawableCompat_android_constantSize, ((C0341.AbstractC0342) state).f1227));
        state.m1595(a.getInt(C0291.AnimatedStateListDrawableCompat_android_enterFadeDuration, ((C0341.AbstractC0342) state).f1251));
        state.m1586(a.getInt(C0291.AnimatedStateListDrawableCompat_android_exitFadeDuration, ((C0341.AbstractC0342) state).f1245));
        setDither(a.getBoolean(C0291.AnimatedStateListDrawableCompat_android_dither, ((C0341.AbstractC0342) state).f1250));
    }

    @Override // ♫.C0346, ♫.C0346, ♫.C0341, ♫.C0341, ♫.C0341
    /* renamed from: θ  reason: contains not printable characters */
    public final void m1542() {
        onStateChange(getState());
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m1536(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int innerDepth = parser.getDepth() + 1;
        while (true) {
            int type = parser.next();
            if (type != 1) {
                int depth = parser.getDepth();
                if (depth < innerDepth && type == 3) {
                    return;
                }
                if (type == 2 && depth <= innerDepth) {
                    if (parser.getName().equals("item")) {
                        m1538(context, resources, parser, attrs, theme);
                    } else if (parser.getName().equals("transition")) {
                        m1535(context, resources, parser, attrs, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final int m1535(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int type;
        TypedArray a = C0124.m624(resources, theme, attrs, C0291.AnimatedStateListDrawableTransition);
        int fromId = a.getResourceId(C0291.AnimatedStateListDrawableTransition_android_fromId, -1);
        int toId = a.getResourceId(C0291.AnimatedStateListDrawableTransition_android_toId, -1);
        Drawable dr = null;
        int drawableId = a.getResourceId(C0291.AnimatedStateListDrawableTransition_android_drawable, -1);
        if (drawableId > 0) {
            dr = C0331.m1530(context, drawableId);
        }
        boolean reversible = a.getBoolean(C0291.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        if (dr == null) {
            do {
                type = parser.next();
            } while (type == 4);
            if (type != 2) {
                throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (parser.getName().equals("animated-vector")) {
                dr = C0200.m935(context, resources, parser, attrs, theme);
            } else {
                int i = Build.VERSION.SDK_INT;
                dr = Drawable.createFromXmlInner(resources, parser, attrs, theme);
            }
        }
        if (dr == null) {
            throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (fromId != -1 && toId != -1) {
            return this.f1197.m1561(fromId, toId, dr, reversible);
        } else {
            throw new XmlPullParserException(parser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m1538(Context context, Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        int type;
        TypedArray a = C0124.m624(resources, theme, attrs, C0291.AnimatedStateListDrawableItem);
        int keyframeId = a.getResourceId(C0291.AnimatedStateListDrawableItem_android_id, 0);
        Drawable dr = null;
        int drawableId = a.getResourceId(C0291.AnimatedStateListDrawableItem_android_drawable, -1);
        if (drawableId > 0) {
            dr = C0331.m1530(context, drawableId);
        }
        a.recycle();
        int[] states = m1610(attrs);
        if (dr == null) {
            do {
                type = parser.next();
            } while (type == 4);
            if (type != 2) {
                throw new XmlPullParserException(parser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            } else if (parser.getName().equals("vector")) {
                dr = C0231.m1042(resources, parser, attrs, theme);
            } else {
                int i = Build.VERSION.SDK_INT;
                dr = Drawable.createFromXmlInner(resources, parser, attrs, theme);
            }
        }
        if (dr != null) {
            return this.f1197.m1562(states, dr, keyframeId);
        }
        throw new XmlPullParserException(parser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    @Override // ♫.C0346, ♫.C0341
    public Drawable mutate() {
        if (!this.f1195) {
            super.mutate();
            if (this == this) {
                this.f1197.m1555();
                this.f1195 = true;
            }
        }
        return this;
    }

    @Override // ♫.C0346, ♫.C0346, ♫.C0341, ♫.C0341, ♫.C0341
    /* renamed from: θ  reason: contains not printable characters */
    public C0337 m1541() {
        return new C0337(this.f1197, this, null);
    }

    /* renamed from: ♫.交$ø  reason: contains not printable characters */
    public static class C0337 extends C0346.C0347 {

        /* renamed from: θ  reason: contains not printable characters */
        public C0519<Long> f1205;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0528<Integer> f1206;

        public C0337(C0337 orig, C0333 owner, Resources res) {
            super(orig, owner, res);
            if (orig != null) {
                this.f1205 = orig.f1205;
                this.f1206 = orig.f1206;
                return;
            }
            this.f1205 = new C0519<>();
            this.f1206 = new C0528<>();
        }

        @Override // ♫.C0341.AbstractC0342, ♫.C0341.AbstractC0342, ♫.C0346.C0347
        /* renamed from: Ø  reason: contains not printable characters */
        public void m1555() {
            this.f1205 = this.f1205.clone();
            this.f1206 = this.f1206.clone();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m1561(int fromId, int toId, Drawable anim, boolean reversible) {
            int pos = super.m1590(anim);
            long keyFromTo = m1554(fromId, toId);
            long reversibleBit = 0;
            if (reversible) {
                reversibleBit = 8589934592L;
            }
            this.f1205.m2448(keyFromTo, Long.valueOf(((long) pos) | reversibleBit));
            if (reversible) {
                this.f1205.m2448(m1554(toId, fromId), Long.valueOf(((long) pos) | 4294967296L | reversibleBit));
            }
            return pos;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m1562(int[] stateSet, Drawable drawable, int id) {
            int index = super.m1613(stateSet, drawable);
            this.f1206.m2491(index, Integer.valueOf(id));
            return index;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public int m1557(int[] stateSet) {
            int index = super.m1612(stateSet);
            if (index >= 0) {
                return index;
            }
            return super.m1612(StateSet.WILD_CARD);
        }

        @Override // ♫.C0341.AbstractC0342, ♫.C0341.AbstractC0342
        /* renamed from: θ  reason: contains not printable characters */
        public int m1559(int index) {
            if (index < 0) {
                return 0;
            }
            return this.f1206.m2495(index, (Integer) 0).intValue();
        }

        @Override // ♫.C0341.AbstractC0342, ♫.C0341.AbstractC0342, ♫.C0346.C0347
        /* renamed from: θ  reason: contains not printable characters */
        public int m1560(int fromId, int toId) {
            return (int) this.f1205.m2444(m1554(fromId, toId), (Long) -1L).longValue();
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public boolean m1558(int fromId, int toId) {
            return (this.f1205.m2444(m1554(fromId, toId), -1L).longValue() & 4294967296L) != 0;
        }

        /* renamed from: ø  reason: contains not printable characters */
        public boolean m1556(int fromId, int toId) {
            return (this.f1205.m2444(m1554(fromId, toId), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // ♫.C0346.C0347
        public Drawable newDrawable() {
            return new C0333(this, null);
        }

        @Override // ♫.C0346.C0347
        public Drawable newDrawable(Resources res) {
            return new C0333(this, res);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public static long m1554(int fromId, int toId) {
            return (((long) fromId) << 32) | ((long) toId);
        }
    }

    @Override // ♫.C0346, ♫.C0341
    /* renamed from: θ  reason: contains not printable characters */
    public void m1545(C0341.AbstractC0342 state) {
        super.m1609(state);
        if (state instanceof C0337) {
            this.f1197 = (C0337) state;
        }
    }

    /* renamed from: ♫.交$µ  reason: contains not printable characters */
    public static class C0334 implements TimeInterpolator {

        /* renamed from: Φ  reason: contains not printable characters */
        public int f1199;

        /* renamed from: θ  reason: contains not printable characters */
        public int f1200;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public int[] f1201;

        public C0334(AnimationDrawable d, boolean reversed) {
            m1547(d, reversed);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m1547(AnimationDrawable d, boolean reversed) {
            int frameCount = d.getNumberOfFrames();
            this.f1200 = frameCount;
            int[] iArr = this.f1201;
            if (iArr == null || iArr.length < frameCount) {
                this.f1201 = new int[frameCount];
            }
            int[] frameTimes = this.f1201;
            int totalDuration = 0;
            for (int i = 0; i < frameCount; i++) {
                int duration = d.getDuration(reversed ? (frameCount - i) - 1 : i);
                frameTimes[i] = duration;
                totalDuration += duration;
            }
            this.f1199 = totalDuration;
            return totalDuration;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m1546() {
            return this.f1199;
        }

        public float getInterpolation(float input) {
            float frameElapsed;
            int frameCount = this.f1200;
            int[] frameTimes = this.f1201;
            int remaining = (int) ((((float) this.f1199) * input) + 0.5f);
            int i = 0;
            while (i < frameCount && remaining >= frameTimes[i]) {
                remaining -= frameTimes[i];
                i++;
            }
            if (i < frameCount) {
                frameElapsed = ((float) remaining) / ((float) this.f1199);
            } else {
                frameElapsed = 0.0f;
            }
            return (((float) i) / ((float) frameCount)) + frameElapsed;
        }
    }
}
