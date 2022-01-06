package ♫;

import android.view.View;
import android.view.Window;

/* renamed from: ♫.港  reason: contains not printable characters */
public class View$OnClickListenerC0489 implements View.OnClickListener {

    /* renamed from: θ  reason: contains not printable characters */
    public final C0362 f1832 = new C0362(this.f1833.f1847.getContext(), 0, 16908332, 0, 0, this.f1833.f1848);

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final /* synthetic */ C0490 f1833;

    public View$OnClickListenerC0489(C0490 this$0) {
        this.f1833 = this$0;
    }

    public void onClick(View v) {
        C0490 r0 = this.f1833;
        Window.Callback callback = r0.f1846;
        if (callback != null && r0.f1842) {
            callback.onMenuItemSelected(0, this.f1832);
        }
    }
}
