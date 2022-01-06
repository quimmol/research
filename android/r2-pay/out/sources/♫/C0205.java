package ♫;

import android.widget.ListView;

/* renamed from: ♫.ᒡ  reason: contains not printable characters */
public class C0205 extends AbstractView$OnTouchListenerC0168 {

    /* renamed from: θ  reason: contains not printable characters */
    public final ListView f831;

    public C0205(ListView target) {
        super(target);
        this.f831 = target;
    }

    @Override // ♫.AbstractView$OnTouchListenerC0168
    /* renamed from: θ  reason: contains not printable characters */
    public void m940(int deltaX, int deltaY) {
        C0206.m942(this.f831, deltaY);
    }

    @Override // ♫.AbstractView$OnTouchListenerC0168, ♫.AbstractView$OnTouchListenerC0168
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m941(int direction) {
        return false;
    }

    @Override // ♫.AbstractView$OnTouchListenerC0168, ♫.AbstractView$OnTouchListenerC0168
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m939(int direction) {
        ListView target = this.f831;
        int itemCount = target.getCount();
        if (itemCount == 0) {
            return false;
        }
        int childCount = target.getChildCount();
        int firstPosition = target.getFirstVisiblePosition();
        int lastPosition = firstPosition + childCount;
        if (direction > 0) {
            if (lastPosition < itemCount || target.getChildAt(childCount - 1).getBottom() > target.getHeight()) {
                return true;
            }
            return false;
        } else if (direction >= 0) {
            return false;
        } else {
            if (firstPosition > 0 || target.getChildAt(0).getTop() < 0) {
                return true;
            }
            return false;
        }
    }
}
