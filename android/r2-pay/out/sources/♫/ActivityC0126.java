package ♫;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import ♫.AbstractC0277;
import ♫.C0195;

/* renamed from: ♫.ˎ  reason: contains not printable characters */
public class ActivityC0126 extends Activity implements AbstractC0577, C0195.AbstractC0196 {

    /* renamed from: θ  reason: contains not printable characters */
    public C0579 f658 = new C0579(this);

    public ActivityC0126() {
        new C0527();
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentC0596.m2894(this);
    }

    public void onSaveInstanceState(Bundle outState) {
        this.f658.m2837(AbstractC0277.EnumC0278.CREATED);
        super.onSaveInstanceState(outState);
    }

    @Override // ♫.AbstractC0577
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0277 m634() {
        return this.f658;
    }

    @Override // ♫.C0195.AbstractC0196
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m635(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor == null || !C0195.m927(decor, event)) {
            return super.dispatchKeyShortcutEvent(event);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        View decor = getWindow().getDecorView();
        if (decor == null || !C0195.m927(decor, event)) {
            return C0195.m928(this, decor, this, event);
        }
        return true;
    }
}
