package ♫;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ♫.到  reason: contains not printable characters */
public class C0359 {

    /* renamed from: θ  reason: contains not printable characters */
    public long f1322 = -1;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Interpolator f1323;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final ArrayList<C0258> f1324 = new ArrayList<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0271 f1325;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0608 f1326 = new C0360();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1327;

    /* renamed from: θ  reason: contains not printable characters */
    public C0359 m1688(C0258 animator) {
        if (!this.f1327) {
            this.f1324.add(animator);
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0359 m1689(C0258 anim1, C0258 anim2) {
        this.f1324.add(anim1);
        anim2.m1186(anim1.m1188());
        this.f1324.add(anim2);
        return this;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m1684() {
        if (!this.f1327) {
            Iterator<C0258> it = this.f1324.iterator();
            while (it.hasNext()) {
                C0258 animator = it.next();
                long j = this.f1322;
                if (j >= 0) {
                    animator.m1190(j);
                }
                Interpolator interpolator = this.f1323;
                if (interpolator != null) {
                    animator.m1191(interpolator);
                }
                if (this.f1325 != null) {
                    animator.m1193(this.f1326);
                }
                animator.m1187();
            }
            this.f1327 = true;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m1685() {
        this.f1327 = false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1691() {
        if (this.f1327) {
            Iterator<C0258> it = this.f1324.iterator();
            while (it.hasNext()) {
                it.next().m1194();
            }
            this.f1327 = false;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0359 m1686(long duration) {
        if (!this.f1327) {
            this.f1322 = duration;
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0359 m1687(Interpolator interpolator) {
        if (!this.f1327) {
            this.f1323 = interpolator;
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0359 m1690(AbstractC0271 listener) {
        if (!this.f1327) {
            this.f1325 = listener;
        }
        return this;
    }

    /* renamed from: ♫.到$θ  reason: contains not printable characters */
    public class C0360 extends C0608 {

        /* renamed from: θ  reason: contains not printable characters */
        public int f1328 = 0;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f1330 = false;

        public C0360() {
        }

        @Override // ♫.AbstractC0271, ♫.C0608
        /* renamed from: ø  reason: contains not printable characters */
        public void m1692(View view) {
            if (!this.f1330) {
                this.f1330 = true;
                AbstractC0271 r0 = C0359.this.f1325;
                if (r0 != null) {
                    r0.m1230(null);
                }
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1693() {
            this.f1328 = 0;
            this.f1330 = false;
            C0359.this.m1685();
        }

        @Override // ♫.AbstractC0271
        /* renamed from: θ  reason: contains not printable characters */
        public void m1694(View view) {
            int i = this.f1328 + 1;
            this.f1328 = i;
            if (i == C0359.this.f1324.size()) {
                AbstractC0271 r0 = C0359.this.f1325;
                if (r0 != null) {
                    r0.m1232(null);
                }
                m1693();
            }
        }
    }
}
