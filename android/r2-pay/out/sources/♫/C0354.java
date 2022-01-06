package ♫;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import ♫.AbstractC0349;

/* renamed from: ♫.先  reason: contains not printable characters */
public class C0354 extends ActionMode {

    /* renamed from: θ  reason: contains not printable characters */
    public final Context f1275;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final AbstractC0349 f1276;

    public C0354(Context context, AbstractC0349 supportActionMode) {
        this.f1275 = context;
        this.f1276 = supportActionMode;
    }

    public Object getTag() {
        return this.f1276.m1632();
    }

    public void setTag(Object tag) {
        this.f1276.m1637(tag);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence title) {
        this.f1276.m1626(title);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence subtitle) {
        this.f1276.m1636(subtitle);
    }

    public void invalidate() {
        this.f1276.m1624();
    }

    public void finish() {
        this.f1276.m1633();
    }

    public Menu getMenu() {
        return C0396.m1919(this.f1275, (AbstractMenuC0280) this.f1276.m1628());
    }

    public CharSequence getTitle() {
        return this.f1276.m1623();
    }

    @Override // android.view.ActionMode
    public void setTitle(int resId) {
        this.f1276.m1625(resId);
    }

    public CharSequence getSubtitle() {
        return this.f1276.m1631();
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int resId) {
        this.f1276.m1634(resId);
    }

    public View getCustomView() {
        return this.f1276.m1630();
    }

    public void setCustomView(View view) {
        this.f1276.m1635(view);
    }

    public MenuInflater getMenuInflater() {
        return this.f1276.m1629();
    }

    public boolean getTitleOptionalHint() {
        return this.f1276.m1639();
    }

    public void setTitleOptionalHint(boolean titleOptional) {
        this.f1276.m1638(titleOptional);
    }

    public boolean isTitleOptional() {
        return this.f1276.m1627();
    }

    /* renamed from: ♫.先$θ  reason: contains not printable characters */
    public static class C0355 implements AbstractC0349.AbstractC0350 {

        /* renamed from: θ  reason: contains not printable characters */
        public final Context f1277;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final ActionMode.Callback f1278;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final ArrayList<C0354> f1279 = new ArrayList<>();

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final C0527<Menu, Menu> f1280 = new C0527<>();

        public C0355(Context context, ActionMode.Callback supportCallback) {
            this.f1277 = context;
            this.f1278 = supportCallback;
        }

        @Override // ♫.AbstractC0349.AbstractC0350
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1670(AbstractC0349 mode, Menu menu) {
            return this.f1278.onCreateActionMode(m1667(mode), m1668(menu));
        }

        @Override // ♫.AbstractC0349.AbstractC0350
        /* renamed from: Φ  reason: contains not printable characters */
        public boolean m1666(AbstractC0349 mode, Menu menu) {
            return this.f1278.onPrepareActionMode(m1667(mode), m1668(menu));
        }

        @Override // ♫.AbstractC0349.AbstractC0350
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1671(AbstractC0349 mode, MenuItem item) {
            return this.f1278.onActionItemClicked(m1667(mode), C0396.m1920(this.f1277, (AbstractMenuItemC0287) item));
        }

        @Override // ♫.AbstractC0349.AbstractC0350
        /* renamed from: θ  reason: contains not printable characters */
        public void m1669(AbstractC0349 mode) {
            this.f1278.onDestroyActionMode(m1667(mode));
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final Menu m1668(Menu menu) {
            Menu wrapper = this.f1280.get(menu);
            if (wrapper != null) {
                return wrapper;
            }
            Menu wrapper2 = C0396.m1919(this.f1277, (AbstractMenuC0280) menu);
            this.f1280.put(menu, wrapper2);
            return wrapper2;
        }

        @Override // ♫.AbstractC0349.AbstractC0350
        /* renamed from: θ  reason: contains not printable characters */
        public ActionMode m1667(AbstractC0349 mode) {
            int count = this.f1279.size();
            for (int i = 0; i < count; i++) {
                C0354 wrapper = this.f1279.get(i);
                if (wrapper != null && wrapper.f1276 == mode) {
                    return wrapper;
                }
            }
            C0354 wrapper2 = new C0354(this.f1277, mode);
            this.f1279.add(wrapper2);
            return wrapper2;
        }
    }
}
