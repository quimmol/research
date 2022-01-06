package ♫;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import ♫.AbstractC0392;

/* renamed from: ♫.源  reason: contains not printable characters */
public class C0490 implements AbstractC0451 {

    /* renamed from: Ø  reason: contains not printable characters */
    public Drawable f1834;

    /* renamed from: ø  reason: contains not printable characters */
    public int f1835;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public Drawable f1836;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public CharSequence f1837;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1838;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Drawable f1839;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public View f1840;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public CharSequence f1841;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1842;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1843;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f1844;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f1845;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Window.Callback f1846;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Toolbar f1847;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public CharSequence f1848;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0407 f1849;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1850;

    public C0490(Toolbar toolbar, boolean style) {
        this(toolbar, style, C0180.abc_action_bar_up_description);
    }

    public C0490(Toolbar toolbar, boolean style, int defaultNavigationContentDescription) {
        Drawable drawable;
        this.f1838 = 0;
        this.f1835 = 0;
        this.f1847 = toolbar;
        this.f1848 = toolbar.getTitle();
        this.f1841 = toolbar.getSubtitle();
        this.f1850 = this.f1848 != null;
        this.f1836 = toolbar.getNavigationIcon();
        C0488 a = C0488.m2290(toolbar.getContext(), null, C0291.ActionBar, C0158.actionBarStyle, 0);
        this.f1834 = a.m2301(C0291.ActionBar_homeAsUpIndicator);
        if (style) {
            CharSequence title = a.m2302(C0291.ActionBar_title);
            if (!TextUtils.isEmpty(title)) {
                m2324(title);
            }
            CharSequence subtitle = a.m2302(C0291.ActionBar_subtitle);
            if (!TextUtils.isEmpty(subtitle)) {
                m2330(subtitle);
            }
            Drawable logo = a.m2301(C0291.ActionBar_logo);
            if (logo != null) {
                m2329(logo);
            }
            Drawable icon = a.m2301(C0291.ActionBar_icon);
            if (icon != null) {
                m2340(icon);
            }
            if (this.f1836 == null && (drawable = this.f1834) != null) {
                m2323(drawable);
            }
            m2328(a.m2292(C0291.ActionBar_displayOptions, 0));
            int customNavId = a.m2308(C0291.ActionBar_customNavigationLayout, 0);
            if (customNavId != 0) {
                m2342(LayoutInflater.from(this.f1847.getContext()).inflate(customNavId, (ViewGroup) this.f1847, false));
                m2328(this.f1843 | 16);
            }
            int height = a.m2291(C0291.ActionBar_height, 0);
            if (height > 0) {
                ViewGroup.LayoutParams lp = this.f1847.getLayoutParams();
                lp.height = height;
                this.f1847.setLayoutParams(lp);
            }
            int contentInsetStart = a.m2295(C0291.ActionBar_contentInsetStart, -1);
            int contentInsetEnd = a.m2295(C0291.ActionBar_contentInsetEnd, -1);
            if (contentInsetStart >= 0 || contentInsetEnd >= 0) {
                this.f1847.m207(Math.max(contentInsetStart, 0), Math.max(contentInsetEnd, 0));
            }
            int titleTextStyle = a.m2308(C0291.ActionBar_titleTextStyle, 0);
            if (titleTextStyle != 0) {
                Toolbar toolbar2 = this.f1847;
                toolbar2.m194(toolbar2.getContext(), titleTextStyle);
            }
            int subtitleTextStyle = a.m2308(C0291.ActionBar_subtitleTextStyle, 0);
            if (subtitleTextStyle != 0) {
                Toolbar toolbar3 = this.f1847;
                toolbar3.m208(toolbar3.getContext(), subtitleTextStyle);
            }
            int popupTheme = a.m2308(C0291.ActionBar_popupTheme, 0);
            if (popupTheme != 0) {
                this.f1847.setPopupTheme(popupTheme);
            }
        } else {
            this.f1843 = m2333();
        }
        a.m2304();
        m2339(defaultNavigationContentDescription);
        this.f1837 = this.f1847.getNavigationContentDescription();
        this.f1847.setNavigationOnClickListener(new View$OnClickListenerC0489(this));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2339(int defaultNavigationContentDescription) {
        if (defaultNavigationContentDescription != this.f1835) {
            this.f1835 = defaultNavigationContentDescription;
            if (TextUtils.isEmpty(this.f1847.getNavigationContentDescription())) {
                m2317(this.f1835);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m2333() {
        if (this.f1847.getNavigationIcon() == null) {
            return 11;
        }
        int opts = 11 | 4;
        this.f1834 = this.f1847.getNavigationIcon();
        return opts;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ViewGroup m2335() {
        return this.f1847;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Context m2334() {
        return this.f1847.getContext();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m2332() {
        return this.f1847.m195();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2338() {
        this.f1847.m193();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2343(Window.Callback cb) {
        this.f1846 = cb;
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m2318(CharSequence title) {
        if (!this.f1850) {
            m2314(title);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public CharSequence m2336() {
        return this.f1847.getTitle();
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2324(CharSequence title) {
        this.f1850 = true;
        m2314(title);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public final void m2314(CharSequence title) {
        this.f1848 = title;
        if ((this.f1843 & 8) != 0) {
            this.f1847.setTitle(title);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2330(CharSequence subtitle) {
        this.f1841 = subtitle;
        if ((this.f1843 & 8) != 0) {
            this.f1847.setSubtitle(subtitle);
        }
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m2312() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2321() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2322(int resId) {
        m2340(resId != 0 ? C0331.m1530(m2334(), resId) : null);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2340(Drawable d) {
        this.f1844 = d;
        m2348();
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m2313(int resId) {
        m2329(resId != 0 ? C0331.m1530(m2334(), resId) : null);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2329(Drawable d) {
        this.f1839 = d;
        m2348();
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public final void m2348() {
        Drawable logo = null;
        int i = this.f1843;
        if ((i & 2) != 0) {
            if ((i & 1) != 0) {
                Drawable drawable = this.f1839;
                if (drawable == null) {
                    drawable = this.f1844;
                }
                logo = drawable;
            } else {
                logo = this.f1844;
            }
        }
        this.f1847.setLogo(logo);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2347() {
        return this.f1847.m213();
    }

    /* renamed from: ö  reason: contains not printable characters */
    public boolean m2319() {
        return this.f1847.m187();
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m2315() {
        return this.f1847.m185();
    }

    /* renamed from: µ  reason: contains not printable characters */
    public boolean m2311() {
        return this.f1847.m220();
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m2325() {
        return this.f1847.m189();
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m2316() {
        this.f1842 = true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2341(Menu menu, AbstractC0392.AbstractC0393 cb) {
        if (this.f1849 == null) {
            this.f1849 = new C0407(this.f1847.getContext());
            this.f1849.m1708(C0065.action_menu_presenter);
        }
        this.f1849.m1713(cb);
        this.f1847.m212((C0375) menu, this.f1849);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2327() {
        this.f1847.m188();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public int m2326() {
        return this.f1843;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2328(int newOpts) {
        View view;
        int changed = this.f1843 ^ newOpts;
        this.f1843 = newOpts;
        if (changed != 0) {
            if ((changed & 4) != 0) {
                if ((newOpts & 4) != 0) {
                    m2309();
                }
                m2349();
            }
            if ((changed & 3) != 0) {
                m2348();
            }
            if ((changed & 8) != 0) {
                if ((newOpts & 8) != 0) {
                    this.f1847.setTitle(this.f1848);
                    this.f1847.setSubtitle(this.f1841);
                } else {
                    this.f1847.setTitle((CharSequence) null);
                    this.f1847.setSubtitle((CharSequence) null);
                }
            }
            if ((changed & 16) != 0 && (view = this.f1840) != null) {
                if ((newOpts & 16) != 0) {
                    this.f1847.addView(view);
                } else {
                    this.f1847.removeView(view);
                }
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2345(C0476 tabView) {
        Toolbar toolbar;
        View view = this.f1845;
        if (view != null && view.getParent() == (toolbar = this.f1847)) {
            toolbar.removeView(this.f1845);
        }
        this.f1845 = tabView;
        if (tabView != null && this.f1838 == 2) {
            this.f1847.addView(this.f1845, 0);
            Toolbar.C0047 lp = (Toolbar.C0047) this.f1845.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) lp).width = -2;
            ((ViewGroup.MarginLayoutParams) lp).height = -2;
            lp.f1033 = 8388691;
            tabView.setAllowCollapse(true);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2346(boolean collapsible) {
        this.f1847.setCollapsible(collapsible);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2331(boolean enable) {
    }

    /* renamed from: ø  reason: contains not printable characters */
    public int m2320() {
        return this.f1838;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2342(View view) {
        View view2 = this.f1840;
        if (!(view2 == null || (this.f1843 & 16) == 0)) {
            this.f1847.removeView(view2);
        }
        this.f1840 = view;
        if (view != null && (this.f1843 & 16) != 0) {
            this.f1847.addView(this.f1840);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0258 m2337(int visibility, long duration) {
        C0258 r0 = C0248.m1151((View) this.f1847);
        r0.m1189(visibility == 0 ? 1.0f : 0.0f);
        r0.m1190(duration);
        r0.m1193(new C0491(visibility));
        return r0;
    }

    /* renamed from: ♫.源$θ  reason: contains not printable characters */
    public class C0491 extends C0608 {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ int f1851;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f1853 = false;

        public C0491(int i) {
            this.f1851 = i;
        }

        @Override // ♫.AbstractC0271, ♫.C0608
        /* renamed from: ø  reason: contains not printable characters */
        public void m2350(View view) {
            C0490.this.f1847.setVisibility(0);
        }

        @Override // ♫.AbstractC0271
        /* renamed from: θ  reason: contains not printable characters */
        public void m2352(View view) {
            if (!this.f1853) {
                C0490.this.f1847.setVisibility(this.f1851);
            }
        }

        @Override // ♫.AbstractC0271, ♫.C0608
        /* renamed from: Φ  reason: contains not printable characters */
        public void m2351(View view) {
            this.f1853 = true;
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m2323(Drawable icon) {
        this.f1836 = icon;
        m2349();
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public final void m2349() {
        if ((this.f1843 & 4) != 0) {
            Toolbar toolbar = this.f1847;
            Drawable drawable = this.f1836;
            if (drawable == null) {
                drawable = this.f1834;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1847.setNavigationIcon((Drawable) null);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2344(CharSequence description) {
        this.f1837 = description;
        m2309();
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m2317(int resId) {
        m2344(resId == 0 ? null : m2334().getString(resId));
    }

    /* renamed from: µ  reason: contains not printable characters */
    public final void m2309() {
        if ((this.f1843 & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1837)) {
            this.f1847.setNavigationContentDescription(this.f1835);
        } else {
            this.f1847.setNavigationContentDescription(this.f1837);
        }
    }

    /* renamed from: µ  reason: contains not printable characters */
    public void m2310(int visible) {
        this.f1847.setVisibility(visible);
    }
}
