package ♫;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;

/* renamed from: ♫.钟  reason: contains not printable characters */
public abstract class AbstractC0563 extends View {

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean f2190 = false;

    /* renamed from: θ  reason: contains not printable characters */
    public int f2191;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Context f2192;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public String f2193;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0553 f2194;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int[] f2195 = new int[32];

    public AbstractC0563(Context context) {
        super(context);
        this.f2192 = context;
        m2794((AttributeSet) null);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2794(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, C0572.ConstraintLayout_Layout);
            int N = a.getIndexCount();
            for (int i = 0; i < N; i++) {
                int attr = a.getIndex(i);
                if (attr == C0572.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f2193 = a.getString(attr);
                    setIds(this.f2193);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2195, this.f2191);
    }

    public void setReferencedIds(int[] ids) {
        this.f2191 = 0;
        for (int i : ids) {
            setTag(i, null);
        }
    }

    public void setTag(int tag, Object value) {
        int i = this.f2191 + 1;
        int[] iArr = this.f2195;
        if (i > iArr.length) {
            this.f2195 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2195;
        int i2 = this.f2191;
        iArr2[i2] = tag;
        this.f2191 = i2 + 1;
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f2190) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2791() {
        if (this.f2194 != null) {
            ViewGroup.LayoutParams params = getLayoutParams();
            if (params instanceof ConstraintLayout.C0054) {
                ((ConstraintLayout.C0054) params).f398 = this.f2194;
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2796(String idString) {
        Object value;
        if (idString != null && this.f2192 != null) {
            String idString2 = idString.trim();
            int tag = 0;
            try {
                tag = C0571.class.getField(idString2).getInt(null);
            } catch (Exception e) {
            }
            if (tag == 0) {
                tag = this.f2192.getResources().getIdentifier(idString2, "id", this.f2192.getPackageName());
            }
            if (tag == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (value = ((ConstraintLayout) getParent()).m242(0, idString2)) != null && (value instanceof Integer)) {
                tag = ((Integer) value).intValue();
            }
            if (tag != 0) {
                setTag(tag, null);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + idString2 + "\"");
        }
    }

    private void setIds(String idList) {
        if (idList != null) {
            int begin = 0;
            while (true) {
                int end = idList.indexOf(44, begin);
                if (end == -1) {
                    m2796(idList.substring(begin));
                    return;
                } else {
                    m2796(idList.substring(begin, end));
                    begin = end + 1;
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2795(ConstraintLayout container) {
        if (isInEditMode()) {
            setIds(this.f2193);
        }
        C0553 r0 = this.f2194;
        if (r0 != null) {
            r0.m2749();
            for (int i = 0; i < this.f2191; i++) {
                View view = container.m239(this.f2195[i]);
                if (view != null) {
                    this.f2194.m2748(container.m244(view));
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2793() {
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2792() {
    }
}
