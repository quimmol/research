package ♫;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: ♫.张  reason: contains not printable characters */
public class C0428 {
    /* renamed from: θ  reason: contains not printable characters */
    public static InputConnection m2057(InputConnection ic, EditorInfo outAttrs, View view) {
        if (ic != null && outAttrs.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof AbstractC0499) {
                    outAttrs.hintText = ((AbstractC0499) parent).m2372();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return ic;
    }
}
