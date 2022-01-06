package ♫;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: ♫.闷  reason: contains not printable characters */
public class C0569 extends View {
    public C0569(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void setVisibility(int visibility) {
    }

    public void draw(Canvas canvas) {
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int margin) {
        ConstraintLayout.C0054 params = (ConstraintLayout.C0054) getLayoutParams();
        params.f396 = margin;
        setLayoutParams(params);
    }

    public void setGuidelineEnd(int margin) {
        ConstraintLayout.C0054 params = (ConstraintLayout.C0054) getLayoutParams();
        params.f393 = margin;
        setLayoutParams(params);
    }

    public void setGuidelinePercent(float ratio) {
        ConstraintLayout.C0054 params = (ConstraintLayout.C0054) getLayoutParams();
        params.f395 = ratio;
        setLayoutParams(params);
    }
}
