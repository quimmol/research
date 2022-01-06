package ♫;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ♫.ﯨ  reason: contains not printable characters */
public abstract class AbstractC0581 extends AbstractC0274 {

    /* renamed from: ø  reason: contains not printable characters */
    public int f2304;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f2305;

    /* renamed from: θ  reason: contains not printable characters */
    public LayoutInflater f2306;

    @Deprecated
    public AbstractC0581(Context context, int layout, Cursor c, boolean autoRequery) {
        super(context, c, autoRequery);
        this.f2304 = layout;
        this.f2305 = layout;
        this.f2306 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // ♫.AbstractC0274
    /* renamed from: Φ  reason: contains not printable characters */
    public View m2843(Context context, Cursor cursor, ViewGroup parent) {
        return this.f2306.inflate(this.f2305, parent, false);
    }

    @Override // ♫.AbstractC0274
    /* renamed from: θ  reason: contains not printable characters */
    public View m2844(Context context, Cursor cursor, ViewGroup parent) {
        return this.f2306.inflate(this.f2304, parent, false);
    }
}
