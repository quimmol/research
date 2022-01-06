package ♫;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ♫.与  reason: contains not printable characters */
public abstract class AbstractC0301 {

    /* renamed from: θ  reason: contains not printable characters */
    public static int f1040 = -1;

    /* renamed from: µ  reason: contains not printable characters */
    public abstract void m1333();

    /* renamed from: Ø  reason: contains not printable characters */
    public abstract void m1334();

    /* renamed from: ö  reason: contains not printable characters */
    public abstract void m1335();

    /* renamed from: ø  reason: contains not printable characters */
    public abstract void m1336();

    /* renamed from: ø  reason: contains not printable characters */
    public abstract void m1337(Bundle bundle);

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract void m1338();

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract void m1339(Bundle bundle);

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract void m1340(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract MenuInflater m1341();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract <T extends View> T m1342(int i);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract AbstractC0292 m1343();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1344();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1345(int i);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1346(Configuration configuration);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1347(Bundle bundle);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1348(View view);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1349(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1350(CharSequence charSequence);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract boolean m1351();

    /* renamed from: θ  reason: contains not printable characters */
    public abstract boolean m1352(int i);

    /* renamed from: θ  reason: contains not printable characters */
    public static AbstractC0301 m1331(Activity activity, AbstractC0300 callback) {
        return new LayoutInflater$Factory2C0302(activity, activity.getWindow(), callback);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static AbstractC0301 m1332(Dialog dialog, AbstractC0300 callback) {
        return new LayoutInflater$Factory2C0302(dialog.getContext(), dialog.getWindow(), callback);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m1330() {
        return f1040;
    }
}
