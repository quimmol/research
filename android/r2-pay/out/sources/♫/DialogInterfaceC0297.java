package ♫;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;

/* renamed from: ♫.一  reason: contains not printable characters */
public class DialogInterfaceC0297 extends DialogC0320 implements DialogInterface {

    /* renamed from: θ  reason: contains not printable characters */
    public final AlertController f1034 = new AlertController(getContext(), this, getWindow());

    public DialogInterfaceC0297(Context context, int themeResId) {
        super(context, m1305(context, themeResId));
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static int m1305(Context context, int resid) {
        if (((resid >>> 24) & 255) >= 1) {
            return resid;
        }
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(C0158.alertDialogTheme, outValue, true);
        return outValue.resourceId;
    }

    @Override // ♫.DialogC0320, android.app.Dialog
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        this.f1034.m9(title);
    }

    @Override // ♫.DialogC0320
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f1034.m14();
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (this.f1034.m24(event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (this.f1034.m10(event)) {
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }

    /* renamed from: ♫.一$θ  reason: contains not printable characters */
    public static class C0298 {

        /* renamed from: θ  reason: contains not printable characters */
        public final int f1035;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final AlertController.C0000 f1036;

        public C0298(Context context) {
            this(context, DialogInterfaceC0297.m1305(context, 0));
        }

        public C0298(Context context, int themeResId) {
            this.f1036 = new AlertController.C0000(new ContextThemeWrapper(context, DialogInterfaceC0297.m1305(context, themeResId)));
            this.f1035 = themeResId;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public Context m1306() {
            return this.f1036.f68;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0298 m1311(CharSequence title) {
            this.f1036.f80 = title;
            return this;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0298 m1309(View customTitleView) {
            this.f1036.f77 = customTitleView;
            return this;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0298 m1308(Drawable icon) {
            this.f1036.f75 = icon;
            return this;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0298 m1307(DialogInterface.OnKeyListener onKeyListener) {
            this.f1036.f72 = onKeyListener;
            return this;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0298 m1310(ListAdapter adapter, DialogInterface.OnClickListener listener) {
            AlertController.C0000 r0 = this.f1036;
            r0.f79 = adapter;
            r0.f49 = listener;
            return this;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public DialogInterfaceC0297 m1312() {
            DialogInterfaceC0297 dialog = new DialogInterfaceC0297(this.f1036.f68, this.f1035);
            this.f1036.m27(dialog.f1034);
            dialog.setCancelable(this.f1036.f82);
            if (this.f1036.f82) {
                dialog.setCanceledOnTouchOutside(true);
            }
            dialog.setOnCancelListener(this.f1036.f69);
            dialog.setOnDismissListener(this.f1036.f71);
            DialogInterface.OnKeyListener onKeyListener = this.f1036.f72;
            if (onKeyListener != null) {
                dialog.setOnKeyListener(onKeyListener);
            }
            return dialog;
        }
    }
}
