package ♫;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: ♫.子  reason: contains not printable characters */
public class C0406 extends Drawable {

    /* renamed from: θ  reason: contains not printable characters */
    public final ActionBarContainer f1537;

    public C0406(ActionBarContainer container) {
        this.f1537 = container;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1537;
        if (actionBarContainer.f155) {
            Drawable drawable = actionBarContainer.f153;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f160;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1537;
        Drawable drawable3 = actionBarContainer2.f156;
        if (drawable3 != null && actionBarContainer2.f152) {
            drawable3.draw(canvas);
        }
    }

    public void setAlpha(int alpha) {
    }

    public void setColorFilter(ColorFilter cf) {
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1537;
        if (actionBarContainer.f155) {
            Drawable drawable = actionBarContainer.f153;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f160;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }
}
