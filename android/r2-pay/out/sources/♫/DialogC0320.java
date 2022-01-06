package ♫;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ♫.AbstractC0349;
import ♫.C0195;

/* renamed from: ♫.个  reason: contains not printable characters */
public class DialogC0320 extends Dialog implements AbstractC0300 {

    /* renamed from: θ  reason: contains not printable characters */
    public final C0195.AbstractC0196 f1127 = new C0321();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0301 f1128;

    /* renamed from: ♫.个$θ  reason: contains not printable characters */
    public class C0321 implements C0195.AbstractC0196 {
        public C0321() {
        }

        @Override // ♫.C0195.AbstractC0196
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1459(KeyEvent event) {
            return DialogC0320.this.m1458(event);
        }
    }

    public DialogC0320(Context context, int theme) {
        super(context, m1452(context, theme));
        m1454().m1347((Bundle) null);
        m1454().m1351();
    }

    public void onCreate(Bundle savedInstanceState) {
        m1454().m1344();
        super.onCreate(savedInstanceState);
        m1454().m1347(savedInstanceState);
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        m1454().m1345(layoutResID);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m1454().m1348(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams params) {
        m1454().m1340(view, params);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int id) {
        return (T) m1454().m1342(id);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence title) {
        super.setTitle(title);
        m1454().m1350(title);
    }

    @Override // android.app.Dialog
    public void setTitle(int titleId) {
        super.setTitle(titleId);
        m1454().m1350(getContext().getString(titleId));
    }

    public void addContentView(View view, ViewGroup.LayoutParams params) {
        m1454().m1349(view, params);
    }

    public void onStop() {
        super.onStop();
        m1454().m1333();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1457(int featureId) {
        return m1454().m1352(featureId);
    }

    public void invalidateOptionsMenu() {
        m1454().m1338();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0301 m1454() {
        if (this.f1128 == null) {
            this.f1128 = AbstractC0301.m1332(this, this);
        }
        return this.f1128;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m1452(Context context, int themeId) {
        if (themeId != 0) {
            return themeId;
        }
        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(C0158.dialogTheme, outValue, true);
        return outValue.resourceId;
    }

    @Override // ♫.AbstractC0300
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1453(AbstractC0349 mode) {
    }

    @Override // ♫.AbstractC0300
    /* renamed from: θ  reason: contains not printable characters */
    public void m1456(AbstractC0349 mode) {
    }

    @Override // ♫.AbstractC0300
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0349 m1455(AbstractC0349.AbstractC0350 callback) {
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1458(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    public boolean dispatchKeyEvent(KeyEvent event) {
        return C0195.m928(this.f1127, getWindow().getDecorView(), this, event);
    }
}
