package ♫;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ♫.ᑋ  reason: contains not printable characters */
public class C0200 extends AbstractC0212 implements AbstractC0198 {

    /* renamed from: θ  reason: contains not printable characters */
    public ArgbEvaluator f820;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Context f821;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Drawable.Callback f822;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0202 f823;

    public C0200() {
        this(null, null, null);
    }

    public C0200(Context context) {
        this(context, null, null);
    }

    public C0200(Context context, C0202 state, Resources res) {
        this.f820 = null;
        this.f822 = new C0203();
        this.f821 = context;
        if (state != null) {
            this.f823 = state;
        } else {
            this.f823 = new C0202(state, this.f822, res);
        }
    }

    public Drawable mutate() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0200 m935(Context context, Resources r, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        C0200 drawable = new C0200(context);
        drawable.inflate(r, parser, attrs, theme);
        return drawable;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0201(drawable.getConstantState());
    }

    public int getChangingConfigurations() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f823.f825;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f823.f828.draw(canvas);
        if (this.f823.f826.isStarted()) {
            invalidateSelf();
        }
    }

    public void onBoundsChange(Rect bounds) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.setBounds(bounds);
        } else {
            this.f823.f828.setBounds(bounds);
        }
    }

    public boolean onStateChange(int[] state) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.setState(state);
        }
        return this.f823.f828.setState(state);
    }

    @Override // ♫.AbstractC0212
    public boolean onLevelChange(int level) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        return this.f823.f828.setLevel(level);
    }

    public int getAlpha() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return C0171.m854(drawable);
        }
        return this.f823.f828.getAlpha();
    }

    public void setAlpha(int alpha) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.setAlpha(alpha);
        } else {
            this.f823.f828.setAlpha(alpha);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f823.f828.setColorFilter(colorFilter);
        }
    }

    public void setTint(int tint) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            C0171.m859(drawable, tint);
        } else {
            this.f823.f828.setTint(tint);
        }
    }

    public void setTintList(ColorStateList tint) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            C0171.m861(drawable, tint);
        } else {
            this.f823.f828.setTintList(tint);
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            C0171.m864(drawable, tintMode);
        } else {
            this.f823.f828.setTintMode(tintMode);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.setVisible(visible, restart);
        }
        this.f823.f828.setVisible(visible, restart);
        return super.setVisible(visible, restart);
    }

    public boolean isStateful() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f823.f828.isStateful();
    }

    public int getOpacity() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f823.f828.getOpacity();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f823.f828.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f823.f828.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return C0171.m853(drawable);
        }
        return this.f823.f828.isAutoMirrored();
    }

    public void setAutoMirrored(boolean mirrored) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            C0171.m865(drawable, mirrored);
        } else {
            this.f823.f828.setAutoMirrored(mirrored);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            C0171.m863(drawable, res, parser, attrs, theme);
            return;
        }
        int eventType = parser.getEventType();
        int innerDepth = parser.getDepth() + 1;
        while (eventType != 1 && (parser.getDepth() >= innerDepth || eventType != 3)) {
            if (eventType == 2) {
                String tagName = parser.getName();
                if ("animated-vector".equals(tagName)) {
                    TypedArray a = C0124.m624(res, theme, attrs, C0172.f775);
                    int drawableRes = a.getResourceId(0, 0);
                    if (drawableRes != 0) {
                        C0231 vectorDrawable = C0231.m1041(res, drawableRes, theme);
                        vectorDrawable.m1047(false);
                        vectorDrawable.setCallback(this.f822);
                        C0231 r5 = this.f823.f828;
                        if (r5 != null) {
                            r5.setCallback(null);
                        }
                        this.f823.f828 = vectorDrawable;
                    }
                    a.recycle();
                } else if ("target".equals(tagName)) {
                    TypedArray a2 = res.obtainAttributes(attrs, C0172.f773);
                    String target = a2.getString(0);
                    int id = a2.getResourceId(1, 0);
                    if (id != 0) {
                        Context context = this.f821;
                        if (context != null) {
                            m936(target, C0209.m945(context, id));
                        } else {
                            a2.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    a2.recycle();
                } else {
                    continue;
                }
            }
            eventType = parser.next();
        }
        this.f823.m937();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources res, XmlPullParser parser, AttributeSet attrs) {
        inflate(res, parser, attrs, null);
    }

    @Override // ♫.AbstractC0212
    public void applyTheme(Resources.Theme t) {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            C0171.m862(drawable, t);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return C0171.m866(drawable);
        }
        return false;
    }

    /* renamed from: ♫.ᑋ$ø  reason: contains not printable characters */
    public static class C0201 extends Drawable.ConstantState {

        /* renamed from: θ  reason: contains not printable characters */
        public final Drawable.ConstantState f824;

        public C0201(Drawable.ConstantState state) {
            this.f824 = state;
        }

        public Drawable newDrawable() {
            C0200 drawableCompat = new C0200();
            ((AbstractC0212) drawableCompat).f834 = this.f824.newDrawable();
            ((AbstractC0212) drawableCompat).f834.setCallback(drawableCompat.f822);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res) {
            C0200 drawableCompat = new C0200();
            ((AbstractC0212) drawableCompat).f834 = this.f824.newDrawable(res);
            ((AbstractC0212) drawableCompat).f834.setCallback(drawableCompat.f822);
            return drawableCompat;
        }

        public Drawable newDrawable(Resources res, Resources.Theme theme) {
            C0200 drawableCompat = new C0200();
            ((AbstractC0212) drawableCompat).f834 = this.f824.newDrawable(res, theme);
            ((AbstractC0212) drawableCompat).f834.setCallback(drawableCompat.f822);
            return drawableCompat;
        }

        public boolean canApplyTheme() {
            return this.f824.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f824.getChangingConfigurations();
        }
    }

    /* renamed from: ♫.ᑋ$Φ  reason: contains not printable characters */
    public static class C0202 extends Drawable.ConstantState {

        /* renamed from: θ  reason: contains not printable characters */
        public int f825;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public AnimatorSet f826;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public ArrayList<Animator> f827;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0231 f828;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0514<Animator, String> f829;

        public C0202(C0202 copy, Drawable.Callback owner, Resources res) {
            if (copy != null) {
                this.f825 = copy.f825;
                C0231 r0 = copy.f828;
                if (r0 != null) {
                    Drawable.ConstantState cs = r0.getConstantState();
                    if (res != null) {
                        this.f828 = (C0231) cs.newDrawable(res);
                    } else {
                        this.f828 = (C0231) cs.newDrawable();
                    }
                    C0231 r1 = this.f828;
                    r1.mutate();
                    this.f828 = r1;
                    this.f828.setCallback(owner);
                    this.f828.setBounds(copy.f828.getBounds());
                    this.f828.m1047(false);
                }
                ArrayList<Animator> arrayList = copy.f827;
                if (arrayList != null) {
                    int numAnimators = arrayList.size();
                    this.f827 = new ArrayList<>(numAnimators);
                    this.f829 = new C0514<>(numAnimators);
                    for (int i = 0; i < numAnimators; i++) {
                        Animator anim = copy.f827.get(i);
                        Animator animClone = anim.clone();
                        String targetName = copy.f829.get(anim);
                        animClone.setTarget(this.f828.m1044(targetName));
                        this.f827.add(animClone);
                        this.f829.put(animClone, targetName);
                    }
                    m937();
                }
            }
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources res) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public int getChangingConfigurations() {
            return this.f825;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m937() {
            if (this.f826 == null) {
                this.f826 = new AnimatorSet();
            }
            this.f826.playTogether(this.f827);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m936(String name, Animator animator) {
        animator.setTarget(this.f823.f828.m1044(name));
        int i = Build.VERSION.SDK_INT;
        C0202 r1 = this.f823;
        if (r1.f827 == null) {
            r1.f827 = new ArrayList<>();
            this.f823.f829 = new C0514<>();
        }
        this.f823.f827.add(animator);
        this.f823.f829.put(animator, name);
    }

    public boolean isRunning() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f823.f826.isRunning();
    }

    public void start() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f823.f826.isStarted()) {
            this.f823.f826.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = ((AbstractC0212) this).f834;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f823.f826.end();
        }
    }

    /* renamed from: ♫.ᑋ$θ  reason: contains not printable characters */
    public class C0203 implements Drawable.Callback {
        public C0203() {
        }

        public void invalidateDrawable(Drawable who) {
            C0200.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable who, Runnable what, long when) {
            C0200.this.scheduleSelf(what, when);
        }

        public void unscheduleDrawable(Drawable who, Runnable what) {
            C0200.this.unscheduleSelf(what);
        }
    }
}
