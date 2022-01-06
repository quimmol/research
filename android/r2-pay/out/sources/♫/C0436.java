package ♫;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: ♫.我  reason: contains not printable characters */
public class C0436 extends RatingBar {

    /* renamed from: θ  reason: contains not printable characters */
    public final C0434 f1623;

    public C0436(Context context, AttributeSet attrs) {
        this(context, attrs, C0158.ratingBarStyle);
    }

    public C0436(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f1623 = new C0434(this);
        this.f1623.m2074(attrs, defStyleAttr);
    }

    public synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Bitmap sampleTile = this.f1623.m2070();
        if (sampleTile != null) {
            setMeasuredDimension(View.resolveSizeAndState(sampleTile.getWidth() * getNumStars(), widthMeasureSpec, 0), getMeasuredHeight());
        }
    }
}
