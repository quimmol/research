package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import ♫.C0291;

public final class ViewStubCompat extends View {

    /* renamed from: Φ  reason: contains not printable characters */
    public int f361;

    /* renamed from: θ  reason: contains not printable characters */
    public int f362;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public LayoutInflater f363;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public WeakReference<View> f364;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$θ  reason: contains not printable characters */
    public interface AbstractC0053 {
    }

    public ViewStubCompat(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f362 = 0;
        TypedArray a = context.obtainStyledAttributes(attrs, C0291.ViewStubCompat, defStyle, 0);
        this.f361 = a.getResourceId(C0291.ViewStubCompat_android_inflatedId, -1);
        this.f362 = a.getResourceId(C0291.ViewStubCompat_android_layout, 0);
        setId(a.getResourceId(C0291.ViewStubCompat_android_id, -1));
        a.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public int getInflatedId() {
        return this.f361;
    }

    public void setInflatedId(int inflatedId) {
        this.f361 = inflatedId;
    }

    public int getLayoutResource() {
        return this.f362;
    }

    public void setLayoutResource(int layoutResource) {
        this.f362 = layoutResource;
    }

    public void setLayoutInflater(LayoutInflater inflater) {
        this.f363 = inflater;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f363;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public void dispatchDraw(Canvas canvas) {
    }

    public void setVisibility(int visibility) {
        WeakReference<View> weakReference = this.f364;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(visibility);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(visibility);
        if (visibility == 0 || visibility == 4) {
            m233();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public View m233() {
        LayoutInflater factory;
        ViewParent viewParent = getParent();
        if (viewParent == null || !(viewParent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f362 != 0) {
            ViewGroup parent = (ViewGroup) viewParent;
            if (this.f363 != null) {
                factory = this.f363;
            } else {
                factory = LayoutInflater.from(getContext());
            }
            View view = factory.inflate(this.f362, parent, false);
            int i = this.f361;
            if (i != -1) {
                view.setId(i);
            }
            int index = parent.indexOfChild(this);
            parent.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                parent.addView(view, index, layoutParams);
            } else {
                parent.addView(view, index);
            }
            this.f364 = new WeakReference<>(view);
            return view;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void setOnInflateListener(AbstractC0053 inflateListener) {
    }
}
