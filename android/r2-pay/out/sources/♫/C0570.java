package ♫;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: ♫.闻  reason: contains not printable characters */
public class C0570 extends View {

    /* renamed from: Φ  reason: contains not printable characters */
    public int f2287;

    /* renamed from: θ  reason: contains not printable characters */
    public int f2288;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f2289;

    public void setEmptyVisibility(int visibility) {
        this.f2287 = visibility;
    }

    public int getEmptyVisibility() {
        return this.f2287;
    }

    public View getContent() {
        return this.f2289;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect r = new Rect();
            canvas.getClipBounds(r);
            paint.setTextSize((float) r.height());
            int cHeight = r.height();
            int cWidth = r.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, "?".length(), r);
            canvas.drawText("?", ((((float) cWidth) / 2.0f) - (((float) r.width()) / 2.0f)) - ((float) r.left), ((((float) cHeight) / 2.0f) + (((float) r.height()) / 2.0f)) - ((float) r.bottom), paint);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2814(ConstraintLayout container) {
        if (this.f2288 == -1 && !isInEditMode()) {
            setVisibility(this.f2287);
        }
        this.f2289 = container.findViewById(this.f2288);
        View view = this.f2289;
        if (view != null) {
            ((ConstraintLayout.C0054) view.getLayoutParams()).f433 = true;
            this.f2289.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int id) {
        View v;
        if (this.f2288 != id) {
            View view = this.f2289;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.C0054) this.f2289.getLayoutParams()).f433 = false;
                this.f2289 = null;
            }
            this.f2288 = id;
            if (id != -1 && (v = ((View) getParent()).findViewById(id)) != null) {
                v.setVisibility(8);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2813() {
        if (this.f2289 != null) {
            ConstraintLayout.C0054 layoutParams = (ConstraintLayout.C0054) getLayoutParams();
            ConstraintLayout.C0054 layoutParamsContent = (ConstraintLayout.C0054) this.f2289.getLayoutParams();
            layoutParamsContent.f398.m2701(0);
            layoutParams.f398.m2703(layoutParamsContent.f398.m2700());
            layoutParams.f398.m2640(layoutParamsContent.f398.m2632());
            layoutParamsContent.f398.m2701(8);
        }
    }
}
