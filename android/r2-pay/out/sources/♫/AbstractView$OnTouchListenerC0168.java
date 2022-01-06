package ♫;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: ♫.ו  reason: contains not printable characters */
public abstract class AbstractView$OnTouchListenerC0168 implements View.OnTouchListener {

    /* renamed from: ø  reason: contains not printable characters */
    public static final int f739 = ViewConfiguration.getTapTimeout();

    /* renamed from: µ  reason: contains not printable characters */
    public boolean f740;

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean f741;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public float[] f742 = {0.0f, 0.0f};

    /* renamed from: ö  reason: contains not printable characters */
    public boolean f743;

    /* renamed from: ö  reason: contains not printable characters and collision with other field name */
    public float[] f744 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f745;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public float[] f746 = {0.0f, 0.0f};

    /* renamed from: Φ  reason: contains not printable characters */
    public int f747;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f748;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public float[] f749 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: θ  reason: contains not printable characters */
    public int f750;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final View f751;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Interpolator f752 = new AccelerateInterpolator();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Runnable f753;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0170 f754 = new C0170();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public float[] f755 = {0.0f, 0.0f};

    /* renamed from: ₩  reason: contains not printable characters */
    public boolean f756;

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract boolean m828(int i);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m836(int i, int i2);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract boolean m838(int i);

    public AbstractView$OnTouchListenerC0168(View target) {
        this.f751 = target;
        float f = Resources.getSystem().getDisplayMetrics().density;
        int maxVelocity = (int) ((1575.0f * f) + 0.5f);
        int minVelocity = (int) ((f * 315.0f) + 0.5f);
        m825((float) maxVelocity, (float) maxVelocity);
        m822((float) minVelocity, (float) minVelocity);
        m826(1);
        m832(Float.MAX_VALUE, Float.MAX_VALUE);
        m819(0.2f, 0.2f);
        m821(1.0f, 1.0f);
        m833(f739);
        m820(500);
        m823(500);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractView$OnTouchListenerC0168 m834(boolean enabled) {
        if (this.f740 && !enabled) {
            m827();
        }
        this.f740 = enabled;
        return this;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public AbstractView$OnTouchListenerC0168 m825(float horizontalMax, float verticalMax) {
        float[] fArr = this.f744;
        fArr[0] = horizontalMax / 1000.0f;
        fArr[1] = verticalMax / 1000.0f;
        return this;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public AbstractView$OnTouchListenerC0168 m822(float horizontalMin, float verticalMin) {
        float[] fArr = this.f742;
        fArr[0] = horizontalMin / 1000.0f;
        fArr[1] = verticalMin / 1000.0f;
        return this;
    }

    /* renamed from: ö  reason: contains not printable characters */
    public AbstractView$OnTouchListenerC0168 m821(float horizontal, float vertical) {
        float[] fArr = this.f746;
        fArr[0] = horizontal / 1000.0f;
        fArr[1] = vertical / 1000.0f;
        return this;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public AbstractView$OnTouchListenerC0168 m826(int type) {
        this.f750 = type;
        return this;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public AbstractView$OnTouchListenerC0168 m819(float horizontal, float vertical) {
        float[] fArr = this.f755;
        fArr[0] = horizontal;
        fArr[1] = vertical;
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractView$OnTouchListenerC0168 m832(float horizontalMax, float verticalMax) {
        float[] fArr = this.f749;
        fArr[0] = horizontalMax;
        fArr[1] = verticalMax;
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractView$OnTouchListenerC0168 m833(int delayMillis) {
        this.f747 = delayMillis;
        return this;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public AbstractView$OnTouchListenerC0168 m820(int durationMillis) {
        this.f754.m844(durationMillis);
        return this;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public AbstractView$OnTouchListenerC0168 m823(int durationMillis) {
        this.f754.m850(durationMillis);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f740
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r3 = 3
            if (r0 == r3) goto L_0x0016
            goto L_0x005a
        L_0x0016:
            r7.m827()
            goto L_0x005a
        L_0x001a:
            r7.f741 = r2
            r7.f748 = r1
        L_0x001e:
            float r3 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r7.f751
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r3 = r7.m831(r1, r3, r4, r5)
            float r4 = r9.getY()
            int r5 = r8.getHeight()
            float r5 = (float) r5
            android.view.View r6 = r7.f751
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r4 = r7.m831(r2, r4, r5, r6)
            ♫.ו$θ r5 = r7.f754
            r5.m849(r3, r4)
            boolean r5 = r7.f743
            if (r5 != 0) goto L_0x005a
            boolean r5 = r7.m837()
            if (r5 == 0) goto L_0x005a
            r7.m824()
        L_0x005a:
            boolean r3 = r7.f756
            if (r3 == 0) goto L_0x0063
            boolean r3 = r7.f743
            if (r3 == 0) goto L_0x0063
            r1 = 1
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.AbstractView$OnTouchListenerC0168.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m837() {
        C0170 scroller = this.f754;
        int verticalDirection = scroller.m839();
        int horizontalDirection = scroller.m840();
        if (verticalDirection != 0 && m828(verticalDirection)) {
            return true;
        }
        if (horizontalDirection != 0) {
            m838(horizontalDirection);
        }
        return false;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public final void m824() {
        int i;
        if (this.f753 == null) {
            this.f753 = new RunnableC0169();
        }
        this.f743 = true;
        this.f745 = true;
        if (this.f748 || (i = this.f747) <= 0) {
            this.f753.run();
        } else {
            C0248.m1159(this.f751, this.f753, (long) i);
        }
        this.f748 = true;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m827() {
        if (this.f745) {
            this.f743 = false;
        } else {
            this.f754.m843();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final float m831(int direction, float coordinate, float srcSize, float dstSize) {
        float value = m830(this.f755[direction], srcSize, this.f749[direction], coordinate);
        if (value == 0.0f) {
            return 0.0f;
        }
        float relativeVelocity = this.f746[direction];
        float minimumVelocity = this.f742[direction];
        float maximumVelocity = this.f744[direction];
        float targetVelocity = relativeVelocity * dstSize;
        if (value > 0.0f) {
            return m817(value * targetVelocity, minimumVelocity, maximumVelocity);
        }
        return -m817((-value) * targetVelocity, minimumVelocity, maximumVelocity);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final float m830(float relativeValue, float size, float maxValue, float current) {
        float interpolated;
        float edgeSize = m817(relativeValue * size, 0.0f, maxValue);
        float value = m829(size - current, edgeSize) - m829(current, edgeSize);
        if (value < 0.0f) {
            interpolated = -this.f752.getInterpolation(-value);
        } else if (value <= 0.0f) {
            return 0.0f;
        } else {
            interpolated = this.f752.getInterpolation(value);
        }
        return m817(interpolated, -1.0f, 1.0f);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final float m829(float current, float leading) {
        if (leading == 0.0f) {
            return 0.0f;
        }
        int i = this.f750;
        if (i == 0 || i == 1) {
            if (current < leading) {
                if (current >= 0.0f) {
                    return 1.0f - (current / leading);
                }
                if (!this.f743 || this.f750 != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i == 2 && current < 0.0f) {
            return current / (-leading);
        }
        return 0.0f;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m818(int value, int min, int max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static float m817(float value, float min, float max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m835() {
        long eventTime = SystemClock.uptimeMillis();
        MotionEvent cancel = MotionEvent.obtain(eventTime, eventTime, 3, 0.0f, 0.0f, 0);
        this.f751.onTouchEvent(cancel);
        cancel.recycle();
    }

    /* renamed from: ♫.ו$Φ  reason: contains not printable characters */
    public class RunnableC0169 implements Runnable {
        public RunnableC0169() {
        }

        public void run() {
            AbstractView$OnTouchListenerC0168 r0 = AbstractView$OnTouchListenerC0168.this;
            if (r0.f743) {
                if (r0.f745) {
                    r0.f745 = false;
                    r0.f754.m841();
                }
                C0170 scroller = AbstractView$OnTouchListenerC0168.this.f754;
                if (scroller.m851() || !AbstractView$OnTouchListenerC0168.this.m837()) {
                    AbstractView$OnTouchListenerC0168.this.f743 = false;
                    return;
                }
                AbstractView$OnTouchListenerC0168 r1 = AbstractView$OnTouchListenerC0168.this;
                if (r1.f741) {
                    r1.f741 = false;
                    r1.m835();
                }
                scroller.m848();
                AbstractView$OnTouchListenerC0168.this.m836(scroller.m847(), scroller.m842());
                C0248.m1158(AbstractView$OnTouchListenerC0168.this.f751, this);
            }
        }
    }

    /* renamed from: ♫.ו$θ  reason: contains not printable characters */
    public static class C0170 {

        /* renamed from: Ø  reason: contains not printable characters */
        public int f758 = 0;

        /* renamed from: ö  reason: contains not printable characters */
        public int f759;

        /* renamed from: ø  reason: contains not printable characters */
        public float f760;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public int f761 = 0;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public long f762 = -1;

        /* renamed from: Φ  reason: contains not printable characters */
        public float f763;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public int f764;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public long f765 = 0;

        /* renamed from: θ  reason: contains not printable characters */
        public float f766;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public int f767;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public long f768 = Long.MIN_VALUE;

        /* renamed from: Φ  reason: contains not printable characters */
        public void m844(int durationMillis) {
            this.f767 = durationMillis;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m850(int durationMillis) {
            this.f764 = durationMillis;
        }

        /* renamed from: ø  reason: contains not printable characters */
        public void m841() {
            this.f768 = AnimationUtils.currentAnimationTimeMillis();
            this.f762 = -1;
            this.f765 = this.f768;
            this.f760 = 0.5f;
            this.f761 = 0;
            this.f758 = 0;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public void m843() {
            long currentTime = AnimationUtils.currentAnimationTimeMillis();
            this.f759 = AbstractView$OnTouchListenerC0168.m818((int) (currentTime - this.f768), 0, this.f764);
            this.f760 = m846(currentTime);
            this.f762 = currentTime;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m851() {
            return this.f762 > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f762 + ((long) this.f759);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final float m846(long currentTime) {
            if (currentTime < this.f768) {
                return 0.0f;
            }
            long j = this.f762;
            if (j < 0 || currentTime < j) {
                return AbstractView$OnTouchListenerC0168.m817(((float) (currentTime - this.f768)) / ((float) this.f767), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f760;
            return (1.0f - f) + (f * AbstractView$OnTouchListenerC0168.m817(((float) (currentTime - j)) / ((float) this.f759), 0.0f, 1.0f));
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final float m845(float value) {
            return (-4.0f * value * value) + (4.0f * value);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m848() {
            if (this.f765 != 0) {
                long currentTime = AnimationUtils.currentAnimationTimeMillis();
                float scale = m845(m846(currentTime));
                long elapsedSinceDelta = currentTime - this.f765;
                this.f765 = currentTime;
                this.f761 = (int) (((float) elapsedSinceDelta) * scale * this.f766);
                this.f758 = (int) (((float) elapsedSinceDelta) * scale * this.f763);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m849(float x, float y) {
            this.f766 = x;
            this.f763 = y;
        }

        /* renamed from: ø  reason: contains not printable characters */
        public int m840() {
            float f = this.f766;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: Ø  reason: contains not printable characters */
        public int m839() {
            float f = this.f763;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m847() {
            return this.f761;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public int m842() {
            return this.f758;
        }
    }
}
