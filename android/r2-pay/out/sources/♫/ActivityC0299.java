package ♫;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import ♫.AbstractC0349;
import ♫.C0099;

/* renamed from: ♫.上  reason: contains not printable characters */
public class ActivityC0299 extends ActivityC0088 implements AbstractC0300, C0099.AbstractC0100, AbstractC0289 {

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1037 = 0;

    /* renamed from: θ  reason: contains not printable characters */
    public Resources f1038;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0301 f1039;

    @Override // ♫.ActivityC0088, ♫.ActivityC0126
    public void onCreate(Bundle savedInstanceState) {
        int i;
        AbstractC0301 delegate = m1320();
        delegate.m1344();
        delegate.m1347(savedInstanceState);
        if (delegate.m1351() && (i = this.f1037) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f1037, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(savedInstanceState);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int resid) {
        super.setTheme(resid);
        this.f1037 = resid;
    }

    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        m1320().m1339(savedInstanceState);
    }

    @Override // ♫.ActivityC0088, ♫.ActivityC0088, ♫.ActivityC0088, ♫.ActivityC0088, ♫.ActivityC0088, ♫.AbstractC0577, ♫.C0099.AbstractC0100, ♫.AbstractC0160, ♫.ActivityC0126
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0292 m1319() {
        return m1320().m1343();
    }

    public MenuInflater getMenuInflater() {
        return m1320().m1341();
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        m1320().m1345(layoutResID);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m1320().m1348(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams params) {
        m1320().m1340(view, params);
    }

    public void addContentView(View view, ViewGroup.LayoutParams params) {
        m1320().m1349(view, params);
    }

    @Override // ♫.ActivityC0088
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        m1320().m1346(newConfig);
        if (this.f1038 != null) {
            this.f1038.updateConfiguration(newConfig, super.getResources().getDisplayMetrics());
        }
    }

    @Override // ♫.ActivityC0088
    public void onPostResume() {
        super.onPostResume();
        m1320().m1334();
    }

    @Override // ♫.ActivityC0088
    public void onStart() {
        super.onStart();
        m1320().m1335();
    }

    @Override // ♫.ActivityC0088
    public void onStop() {
        super.onStop();
        m1320().m1333();
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int id) {
        return (T) m1320().m1342(id);
    }

    @Override // ♫.ActivityC0088
    public final boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        AbstractC0292 ab = m1319();
        if (item.getItemId() != 16908332 || ab == null || (ab.m1290() & 4) == 0) {
            return false;
        }
        return m1325();
    }

    @Override // ♫.ActivityC0088
    public void onDestroy() {
        super.onDestroy();
        m1320().m1336();
    }

    public void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        m1320().m1350(title);
    }

    @Override // ♫.ActivityC0088
    /* renamed from: Ø  reason: contains not printable characters */
    public void m1314() {
        m1320().m1338();
    }

    public void invalidateOptionsMenu() {
        m1320().m1338();
    }

    @Override // ♫.AbstractC0300
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1316(AbstractC0349 mode) {
    }

    @Override // ♫.AbstractC0300
    /* renamed from: θ  reason: contains not printable characters */
    public void m1324(AbstractC0349 mode) {
    }

    @Override // ♫.AbstractC0300
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0349 m1321(AbstractC0349.AbstractC0350 callback) {
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1323(C0099 builder) {
        builder.m532((Activity) this);
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m1315() {
    }

    @Override // ♫.ActivityC0088, ♫.ActivityC0088, ♫.ActivityC0088, ♫.ActivityC0088, ♫.ActivityC0088, ♫.AbstractC0577, ♫.C0099.AbstractC0100, ♫.AbstractC0160, ♫.ActivityC0126
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1325() {
        Intent upIntent = m1318();
        if (upIntent == null) {
            return false;
        }
        if (m1326(upIntent)) {
            C0099 b = C0099.m531((Context) this);
            m1323(b);
            m1315();
            b.m535();
            try {
                C0119.m616(this);
                return true;
            } catch (IllegalStateException e) {
                finish();
                return true;
            }
        } else {
            m1322(upIntent);
            return true;
        }
    }

    @Override // ♫.ActivityC0088, ♫.ActivityC0088, ♫.ActivityC0088, ♫.ActivityC0088, ♫.ActivityC0088, ♫.AbstractC0577, ♫.C0099.AbstractC0100, ♫.AbstractC0160, ♫.ActivityC0126
    /* renamed from: θ  reason: contains not printable characters */
    public Intent m1318() {
        return C0127.m636((Activity) this);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1326(Intent targetIntent) {
        return C0127.m641((Activity) this, targetIntent);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1322(Intent upIntent) {
        C0127.m640((Activity) this, upIntent);
    }

    public void onContentChanged() {
        m1313();
    }

    @Deprecated
    /* renamed from: µ  reason: contains not printable characters */
    public void m1313() {
    }

    public boolean onMenuOpened(int featureId, Menu menu) {
        return super.onMenuOpened(featureId, menu);
    }

    @Override // ♫.ActivityC0088
    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    @Override // ♫.ActivityC0088, ♫.ActivityC0126
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        m1320().m1337(outState);
    }

    @Override // ♫.ActivityC0088, ♫.ActivityC0088, ♫.ActivityC0088, ♫.ActivityC0088, ♫.ActivityC0088, ♫.AbstractC0577, ♫.C0099.AbstractC0100, ♫.AbstractC0160, ♫.ActivityC0126
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0301 m1320() {
        if (this.f1039 == null) {
            this.f1039 = AbstractC0301.m1331(this, this);
        }
        return this.f1039;
    }

    @Override // ♫.ActivityC0126
    public boolean dispatchKeyEvent(KeyEvent event) {
        int keyCode = event.getKeyCode();
        AbstractC0292 actionBar = m1319();
        if (keyCode == 82 && actionBar != null) {
            actionBar.m1284();
        }
        return super.dispatchKeyEvent(event);
    }

    public Resources getResources() {
        if (this.f1038 == null) {
            C0497.m2367();
        }
        Resources resources = this.f1038;
        return resources == null ? super.getResources() : resources;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean m1317(KeyEvent event) {
        Window currentWindow;
        if (Build.VERSION.SDK_INT >= 26 || event.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(event.getMetaState()) || event.getRepeatCount() != 0 || KeyEvent.isModifierKey(event.getKeyCode()) || (currentWindow = getWindow()) == null || currentWindow.getDecorView() == null || !currentWindow.getDecorView().dispatchKeyShortcutEvent(event)) {
            return false;
        }
        return true;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (m1317(event)) {
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void openOptionsMenu() {
        AbstractC0292 actionBar = m1319();
        if (getWindow().hasFeature(0)) {
            if (actionBar != null) {
                actionBar.m1285();
            }
            super.openOptionsMenu();
        }
    }

    public void closeOptionsMenu() {
        AbstractC0292 actionBar = m1319();
        if (getWindow().hasFeature(0)) {
            if (actionBar != null) {
                actionBar.m1297();
            }
            super.closeOptionsMenu();
        }
    }
}
