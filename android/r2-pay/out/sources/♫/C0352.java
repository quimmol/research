package ♫;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* renamed from: ♫.俊  reason: contains not printable characters */
public class C0352 extends ContextWrapper {

    /* renamed from: θ  reason: contains not printable characters */
    public int f1264;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Configuration f1265;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Resources.Theme f1266;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Resources f1267;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public LayoutInflater f1268;

    public C0352() {
        super(null);
    }

    public C0352(Context base, int themeResId) {
        super(base);
        this.f1264 = themeResId;
    }

    public C0352(Context base, Resources.Theme theme) {
        super(base);
        this.f1266 = theme;
    }

    public void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    public Resources getResources() {
        return m1647();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Resources m1647() {
        if (this.f1267 == null) {
            Configuration configuration = this.f1265;
            if (configuration == null) {
                this.f1267 = super.getResources();
            } else {
                int i = Build.VERSION.SDK_INT;
                this.f1267 = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f1267;
    }

    public void setTheme(int resid) {
        if (this.f1264 != resid) {
            this.f1264 = resid;
            m1648();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m1646() {
        return this.f1264;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1266;
        if (theme != null) {
            return theme;
        }
        if (this.f1264 == 0) {
            this.f1264 = C0290.Theme_AppCompat_Light;
        }
        m1648();
        return this.f1266;
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String name) {
        if (!"layout_inflater".equals(name)) {
            return getBaseContext().getSystemService(name);
        }
        if (this.f1268 == null) {
            this.f1268 = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1268;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1649(Resources.Theme theme, int resid) {
        theme.applyStyle(resid, true);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1648() {
        if (this.f1266 == null) {
            this.f1266 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1266.setTo(theme);
            }
        }
        m1649(this.f1266, this.f1264);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }
}
