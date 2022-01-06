package ♫;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: ♫.战  reason: contains not printable characters */
public class C0437 extends SeekBar {

    /* renamed from: θ  reason: contains not printable characters */
    public final C0438 f1624;

    public C0437(Context context, AttributeSet attrs) {
        this(context, attrs, C0158.seekBarStyle);
    }

    public C0437(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f1624 = new C0438(this);
        this.f1624.m2080(attrs, defStyleAttr);
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1624.m2078(canvas);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1624.m2076();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1624.m2075();
    }
}
