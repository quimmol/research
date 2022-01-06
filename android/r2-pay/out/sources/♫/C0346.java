package ♫;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import ♫.C0341;

/* renamed from: ♫.以  reason: contains not printable characters */
public class C0346 extends C0341 {

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean f1258;

    /* renamed from: θ  reason: contains not printable characters */
    public C0347 f1259;

    public boolean isStateful() {
        return true;
    }

    @Override // ♫.C0341
    public boolean onStateChange(int[] stateSet) {
        boolean changed = super.onStateChange(stateSet);
        int idx = this.f1259.m1612(stateSet);
        if (idx < 0) {
            idx = this.f1259.m1612(StateSet.WILD_CARD);
        }
        return m1577(idx) || changed;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int[] m1610(AttributeSet attrs) {
        int j = 0;
        int numAttrs = attrs.getAttributeCount();
        int[] states = new int[numAttrs];
        for (int i = 0; i < numAttrs; i++) {
            int stateResId = attrs.getAttributeNameResource(i);
            if (!(stateResId == 0 || stateResId == 16842960 || stateResId == 16843161)) {
                int j2 = j + 1;
                states[j] = attrs.getAttributeBooleanValue(i, false) ? stateResId : -stateResId;
                j = j2;
            }
        }
        return StateSet.trimStateSet(states, j);
    }

    @Override // ♫.C0341
    public Drawable mutate() {
        if (!this.f1258) {
            super.mutate();
            if (this == this) {
                this.f1259.m1611();
                this.f1258 = true;
            }
        }
        return this;
    }

    @Override // ♫.C0341, ♫.C0341, ♫.C0341
    /* renamed from: θ  reason: contains not printable characters */
    public C0347 m1607() {
        return new C0347(this.f1259, this, null);
    }

    /* renamed from: ♫.以$θ  reason: contains not printable characters */
    public static class C0347 extends C0341.AbstractC0342 {

        /* renamed from: θ  reason: contains not printable characters */
        public int[][] f1260;

        public C0347(C0347 orig, C0346 owner, Resources res) {
            super(orig, owner, res);
            if (orig != null) {
                this.f1260 = orig.f1260;
            } else {
                this.f1260 = new int[m1589()][];
            }
        }

        @Override // ♫.C0341.AbstractC0342, ♫.C0341.AbstractC0342
        /* renamed from: Ø  reason: contains not printable characters */
        public void m1611() {
            int[][] iArr = this.f1260;
            int[][] stateSets = new int[iArr.length][];
            for (int i = iArr.length - 1; i >= 0; i--) {
                int[][] iArr2 = this.f1260;
                stateSets[i] = iArr2[i] != null ? (int[]) iArr2[i].clone() : null;
            }
            this.f1260 = stateSets;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m1613(int[] stateSet, Drawable drawable) {
            int pos = m1590(drawable);
            this.f1260[pos] = stateSet;
            return pos;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m1612(int[] stateSet) {
            int[][] stateSets = this.f1260;
            int count = m1584();
            for (int i = 0; i < count; i++) {
                if (StateSet.stateSetMatches(stateSets[i], stateSet)) {
                    return i;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C0346(this, null);
        }

        public Drawable newDrawable(Resources res) {
            return new C0346(this, res);
        }

        @Override // ♫.C0341.AbstractC0342, ♫.C0341.AbstractC0342
        /* renamed from: θ  reason: contains not printable characters */
        public void m1614(int oldSize, int newSize) {
            super.m1596(oldSize, newSize);
            int[][] newStateSets = new int[newSize][];
            System.arraycopy(this.f1260, 0, newStateSets, 0, oldSize);
            this.f1260 = newStateSets;
        }
    }

    @Override // ♫.C0341
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // ♫.C0341
    /* renamed from: θ  reason: contains not printable characters */
    public void m1609(C0341.AbstractC0342 state) {
        super.m1574(state);
        if (state instanceof C0347) {
            this.f1259 = (C0347) state;
        }
    }

    public C0346(C0347 state, Resources res) {
        m1609(new C0347(state, this, res));
        onStateChange(getState());
    }

    public C0346(C0347 state) {
        if (state != null) {
            m1609(state);
        }
    }
}
