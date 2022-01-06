package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;
import ♫.AbstractC0292;
import ♫.AbstractC0351;
import ♫.AbstractC0392;
import ♫.AbstractC0451;
import ♫.AbstractC0584;
import ♫.C0158;
import ♫.C0191;
import ♫.C0241;
import ♫.C0248;
import ♫.C0291;
import ♫.C0331;
import ♫.C0356;
import ♫.C0375;
import ♫.C0380;
import ♫.C0407;
import ♫.C0429;
import ♫.C0431;
import ♫.C0448;
import ♫.C0475;
import ♫.C0488;
import ♫.C0490;
import ♫.C0498;
import ♫.SubMenuC0402;

public class Toolbar extends ViewGroup {

    /* renamed from: µ  reason: contains not printable characters */
    public int f311;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f312;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f313;

    /* renamed from: ö  reason: contains not printable characters */
    public int f314;

    /* renamed from: ø  reason: contains not printable characters */
    public int f315;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public CharSequence f316;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f317;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f318;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public ImageButton f319;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public TextView f320;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public CharSequence f321;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final ArrayList<View> f322;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f323;

    /* renamed from: θ  reason: contains not printable characters */
    public int f324;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Context f325;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Drawable f326;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f327;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ImageButton f328;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ImageView f329;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public TextView f330;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final ActionMenuView.AbstractC0022 f331;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ActionMenuView f332;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0045 f333;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0046 f334;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public CharSequence f335;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Runnable f336;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final ArrayList<View> f337;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0375.AbstractC0377 f338;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0392.AbstractC0393 f339;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0407 f340;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0475 f341;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0490 f342;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final int[] f343;

    /* renamed from: А  reason: contains not printable characters */
    public int f344;

    /* renamed from: Б  reason: contains not printable characters */
    public int f345;

    /* renamed from: ฿  reason: contains not printable characters */
    public int f346;

    /* renamed from: ₢  reason: contains not printable characters */
    public int f347;

    /* renamed from: ₣  reason: contains not printable characters */
    public int f348;

    /* renamed from: ₤  reason: contains not printable characters */
    public int f349;

    /* renamed from: ₧  reason: contains not printable characters */
    public int f350;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f351;

    /* renamed from: androidx.appcompat.widget.Toolbar$µ  reason: contains not printable characters */
    public interface AbstractC0045 {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$θ  reason: contains not printable characters */
    public class C0050 implements ActionMenuView.AbstractC0022 {
        public C0050() {
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m229(MenuItem item) {
            AbstractC0045 r0 = Toolbar.this.f333;
            if (r0 != null) {
                return r0.onMenuItemClick(item);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$Φ  reason: contains not printable characters */
    public class RunnableC0049 implements Runnable {
        public RunnableC0049() {
        }

        public void run() {
            Toolbar.this.m220();
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attrs) {
        this(context, attrs, C0158.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        int i;
        this.f347 = 8388627;
        this.f337 = new ArrayList<>();
        this.f322 = new ArrayList<>();
        this.f343 = new int[2];
        this.f331 = new C0050();
        this.f336 = new RunnableC0049();
        C0488 a = C0488.m2290(getContext(), attrs, C0291.Toolbar, defStyleAttr, 0);
        this.f318 = a.m2308(C0291.Toolbar_titleTextAppearance, 0);
        this.f315 = a.m2308(C0291.Toolbar_subtitleTextAppearance, 0);
        this.f347 = a.m2293(C0291.Toolbar_android_gravity, this.f347);
        this.f312 = a.m2293(C0291.Toolbar_buttonGravity, 48);
        int titleMargin = a.m2295(C0291.Toolbar_titleMargin, 0);
        titleMargin = a.m2305(C0291.Toolbar_titleMargins) ? a.m2295(C0291.Toolbar_titleMargins, titleMargin) : titleMargin;
        this.f348 = titleMargin;
        this.f346 = titleMargin;
        this.f351 = titleMargin;
        this.f311 = titleMargin;
        int marginStart = a.m2295(C0291.Toolbar_titleMarginStart, -1);
        if (marginStart >= 0) {
            this.f311 = marginStart;
        }
        int marginEnd = a.m2295(C0291.Toolbar_titleMarginEnd, -1);
        if (marginEnd >= 0) {
            this.f351 = marginEnd;
        }
        int marginTop = a.m2295(C0291.Toolbar_titleMarginTop, -1);
        if (marginTop >= 0) {
            this.f346 = marginTop;
        }
        int marginBottom = a.m2295(C0291.Toolbar_titleMarginBottom, -1);
        if (marginBottom >= 0) {
            this.f348 = marginBottom;
        }
        this.f314 = a.m2294(C0291.Toolbar_maxButtonHeight, -1);
        int contentInsetStart = a.m2295(C0291.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int contentInsetEnd = a.m2295(C0291.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int contentInsetLeft = a.m2294(C0291.Toolbar_contentInsetLeft, 0);
        int contentInsetRight = a.m2294(C0291.Toolbar_contentInsetRight, 0);
        m186();
        this.f341.m2246(contentInsetLeft, contentInsetRight);
        if (!(contentInsetStart == Integer.MIN_VALUE && contentInsetEnd == Integer.MIN_VALUE)) {
            this.f341.m2244(contentInsetStart, contentInsetEnd);
        }
        this.f349 = a.m2295(C0291.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f350 = a.m2295(C0291.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f326 = a.m2301(C0291.Toolbar_collapseIcon);
        this.f335 = a.m2302(C0291.Toolbar_collapseContentDescription);
        CharSequence title = a.m2302(C0291.Toolbar_title);
        if (!TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        CharSequence subtitle = a.m2302(C0291.Toolbar_subtitle);
        if (!TextUtils.isEmpty(subtitle)) {
            setSubtitle(subtitle);
        }
        this.f325 = getContext();
        setPopupTheme(a.m2308(C0291.Toolbar_popupTheme, 0));
        Drawable navIcon = a.m2301(C0291.Toolbar_navigationIcon);
        if (navIcon != null) {
            setNavigationIcon(navIcon);
        }
        CharSequence navDesc = a.m2302(C0291.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(navDesc)) {
            setNavigationContentDescription(navDesc);
        }
        Drawable logo = a.m2301(C0291.Toolbar_logo);
        if (logo != null) {
            setLogo(logo);
        }
        CharSequence logoDesc = a.m2302(C0291.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(logoDesc)) {
            setLogoDescription(logoDesc);
        }
        if (a.m2305(C0291.Toolbar_titleTextColor)) {
            i = -1;
            setTitleTextColor(a.m2298(C0291.Toolbar_titleTextColor, -1));
        } else {
            i = -1;
        }
        if (a.m2305(C0291.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.m2298(C0291.Toolbar_subtitleTextColor, i));
        }
        a.m2304();
    }

    public void setPopupTheme(int resId) {
        if (this.f324 != resId) {
            this.f324 = resId;
            if (resId == 0) {
                this.f325 = getContext();
            } else {
                this.f325 = new ContextThemeWrapper(getContext(), resId);
            }
        }
    }

    public int getPopupTheme() {
        return this.f324;
    }

    public int getTitleMarginStart() {
        return this.f311;
    }

    public void setTitleMarginStart(int margin) {
        this.f311 = margin;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.f346;
    }

    public void setTitleMarginTop(int margin) {
        this.f346 = margin;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.f351;
    }

    public void setTitleMarginEnd(int margin) {
        this.f351 = margin;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.f348;
    }

    public void setTitleMarginBottom(int margin) {
        this.f348 = margin;
        requestLayout();
    }

    public void onRtlPropertiesChanged(int layoutDirection) {
        int i = Build.VERSION.SDK_INT;
        super.onRtlPropertiesChanged(layoutDirection);
        m186();
        C0475 r0 = this.f341;
        boolean z = true;
        if (layoutDirection != 1) {
            z = false;
        }
        r0.m2247(z);
    }

    public void setLogo(int resId) {
        setLogo(C0331.m1530(getContext(), resId));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m213() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f332) != null && actionMenuView.m101();
    }

    /* renamed from: ö  reason: contains not printable characters */
    public boolean m187() {
        ActionMenuView actionMenuView = this.f332;
        return actionMenuView != null && actionMenuView.m105();
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m185() {
        ActionMenuView actionMenuView = this.f332;
        return actionMenuView != null && actionMenuView.m107();
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public boolean m220() {
        ActionMenuView actionMenuView = this.f332;
        return actionMenuView != null && actionMenuView.m103();
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m189() {
        ActionMenuView actionMenuView = this.f332;
        return actionMenuView != null && actionMenuView.m118();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m212(C0375 menu, C0407 outerPresenter) {
        if (menu != null || this.f332 != null) {
            m215();
            C0375 oldMenu = this.f332.m112();
            if (oldMenu != menu) {
                if (oldMenu != null) {
                    oldMenu.m1785(this.f340);
                    oldMenu.m1785(this.f334);
                }
                if (this.f334 == null) {
                    this.f334 = new C0046();
                }
                outerPresenter.m1974(true);
                if (menu != null) {
                    menu.m1815(outerPresenter, this.f325);
                    menu.m1815(this.f334, this.f325);
                } else {
                    outerPresenter.m1981(this.f325, (C0375) null);
                    this.f334.m222(this.f325, (C0375) null);
                    outerPresenter.m1986(true);
                    this.f334.m224(true);
                }
                this.f332.setPopupTheme(this.f324);
                this.f332.setPresenter(outerPresenter);
                this.f340 = outerPresenter;
            }
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m188() {
        ActionMenuView actionMenuView = this.f332;
        if (actionMenuView != null) {
            actionMenuView.m104();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m182();
            if (!m214((View) this.f329)) {
                m210((View) this.f329, true);
            }
        } else {
            ImageView imageView = this.f329;
            if (imageView != null && m214((View) imageView)) {
                removeView(this.f329);
                this.f322.remove(this.f329);
            }
        }
        ImageView imageView2 = this.f329;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        ImageView imageView = this.f329;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int resId) {
        setLogoDescription(getContext().getText(resId));
    }

    public void setLogoDescription(CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            m182();
        }
        ImageView imageView = this.f329;
        if (imageView != null) {
            imageView.setContentDescription(description);
        }
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f329;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    /* renamed from: µ  reason: contains not printable characters */
    public final void m182() {
        if (this.f329 == null) {
            this.f329 = new C0431(getContext());
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m195() {
        C0046 r0 = this.f334;
        return (r0 == null || r0.f354 == null) ? false : true;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m193() {
        C0046 r0 = this.f334;
        C0380 item = r0 == null ? null : r0.f354;
        if (item != null) {
            item.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.f321;
    }

    public void setTitle(int resId) {
        setTitle(getContext().getText(resId));
    }

    public void setTitle(CharSequence title) {
        if (!TextUtils.isEmpty(title)) {
            if (this.f330 == null) {
                Context context = getContext();
                this.f330 = new C0448(context);
                this.f330.setSingleLine();
                this.f330.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f318;
                if (i != 0) {
                    this.f330.setTextAppearance(context, i);
                }
                int i2 = this.f344;
                if (i2 != 0) {
                    this.f330.setTextColor(i2);
                }
            }
            if (!m214((View) this.f330)) {
                m210((View) this.f330, true);
            }
        } else {
            TextView textView = this.f330;
            if (textView != null && m214((View) textView)) {
                removeView(this.f330);
                this.f322.remove(this.f330);
            }
        }
        TextView textView2 = this.f330;
        if (textView2 != null) {
            textView2.setText(title);
        }
        this.f321 = title;
    }

    public CharSequence getSubtitle() {
        return this.f316;
    }

    public void setSubtitle(int resId) {
        setSubtitle(getContext().getText(resId));
    }

    public void setSubtitle(CharSequence subtitle) {
        if (!TextUtils.isEmpty(subtitle)) {
            if (this.f320 == null) {
                Context context = getContext();
                this.f320 = new C0448(context);
                this.f320.setSingleLine();
                this.f320.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f315;
                if (i != 0) {
                    this.f320.setTextAppearance(context, i);
                }
                int i2 = this.f345;
                if (i2 != 0) {
                    this.f320.setTextColor(i2);
                }
            }
            if (!m214((View) this.f320)) {
                m210((View) this.f320, true);
            }
        } else {
            TextView textView = this.f320;
            if (textView != null && m214((View) textView)) {
                removeView(this.f320);
                this.f322.remove(this.f320);
            }
        }
        TextView textView2 = this.f320;
        if (textView2 != null) {
            textView2.setText(subtitle);
        }
        this.f316 = subtitle;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m194(Context context, int resId) {
        this.f318 = resId;
        TextView textView = this.f330;
        if (textView != null) {
            textView.setTextAppearance(context, resId);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m208(Context context, int resId) {
        this.f315 = resId;
        TextView textView = this.f320;
        if (textView != null) {
            textView.setTextAppearance(context, resId);
        }
    }

    public void setTitleTextColor(int color) {
        this.f344 = color;
        TextView textView = this.f330;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public void setSubtitleTextColor(int color) {
        this.f345 = color;
        TextView textView = this.f320;
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f328;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int resId) {
        setNavigationContentDescription(resId != 0 ? getContext().getText(resId) : null);
    }

    public void setNavigationContentDescription(CharSequence description) {
        if (!TextUtils.isEmpty(description)) {
            m216();
        }
        ImageButton imageButton = this.f328;
        if (imageButton != null) {
            imageButton.setContentDescription(description);
        }
    }

    public void setNavigationIcon(int resId) {
        setNavigationIcon(C0331.m1530(getContext(), resId));
    }

    public void setNavigationIcon(Drawable icon) {
        if (icon != null) {
            m216();
            if (!m214((View) this.f328)) {
                m210((View) this.f328, true);
            }
        } else {
            ImageButton imageButton = this.f328;
            if (imageButton != null && m214((View) imageButton)) {
                removeView(this.f328);
                this.f322.remove(this.f328);
            }
        }
        ImageButton imageButton2 = this.f328;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(icon);
        }
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f328;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener listener) {
        m216();
        this.f328.setOnClickListener(listener);
    }

    public Menu getMenu() {
        m219();
        return this.f332.getMenu();
    }

    public void setOverflowIcon(Drawable icon) {
        m219();
        this.f332.setOverflowIcon(icon);
    }

    public Drawable getOverflowIcon() {
        m219();
        return this.f332.getOverflowIcon();
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public final void m219() {
        m215();
        if (this.f332.m112() == null) {
            C0375 menu = (C0375) this.f332.getMenu();
            if (this.f334 == null) {
                this.f334 = new C0046();
            }
            this.f332.setExpandedActionViewsExclusive(true);
            menu.m1815(this.f334, this.f325);
        }
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public final void m215() {
        if (this.f332 == null) {
            this.f332 = new ActionMenuView(getContext());
            this.f332.setPopupTheme(this.f324);
            this.f332.setOnMenuItemClickListener(this.f331);
            this.f332.m117(this.f339, this.f338);
            C0047 lp = generateDefaultLayoutParams();
            lp.f1033 = 8388613 | (this.f312 & C0291.AppCompatTheme_windowActionBarOverlay);
            this.f332.setLayoutParams(lp);
            m210((View) this.f332, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new C0356(getContext());
    }

    public void setOnMenuItemClickListener(AbstractC0045 listener) {
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m207(int contentInsetStart, int contentInsetEnd) {
        m186();
        this.f341.m2244(contentInsetStart, contentInsetEnd);
    }

    public int getContentInsetStart() {
        C0475 r0 = this.f341;
        if (r0 != null) {
            return r0.m2241();
        }
        return 0;
    }

    public int getContentInsetEnd() {
        C0475 r0 = this.f341;
        if (r0 != null) {
            return r0.m2245();
        }
        return 0;
    }

    public int getContentInsetLeft() {
        C0475 r0 = this.f341;
        if (r0 != null) {
            return r0.m2243();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0475 r0 = this.f341;
        if (r0 != null) {
            return r0.m2242();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f349;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int insetStartWithNavigation) {
        if (insetStartWithNavigation < 0) {
            insetStartWithNavigation = Integer.MIN_VALUE;
        }
        if (insetStartWithNavigation != this.f349) {
            this.f349 = insetStartWithNavigation;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        int i = this.f350;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int insetEndWithActions) {
        if (insetEndWithActions < 0) {
            insetEndWithActions = Integer.MIN_VALUE;
        }
        if (insetEndWithActions != this.f350) {
            this.f350 = insetEndWithActions;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f349, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean hasActions = false;
        ActionMenuView actionMenuView = this.f332;
        if (actionMenuView != null) {
            C0375 mb = actionMenuView.m112();
            hasActions = mb != null && mb.hasVisibleItems();
        }
        if (hasActions) {
            return Math.max(getContentInsetEnd(), Math.max(this.f350, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (C0248.m1146((View) this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C0248.m1146((View) this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    /* renamed from: ₣  reason: contains not printable characters */
    public final void m216() {
        if (this.f328 == null) {
            this.f328 = new C0429(getContext(), null, C0158.toolbarNavigationButtonStyle);
            C0047 lp = generateDefaultLayoutParams();
            lp.f1033 = 8388611 | (this.f312 & C0291.AppCompatTheme_windowActionBarOverlay);
            this.f328.setLayoutParams(lp);
        }
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m184() {
        if (this.f319 == null) {
            this.f319 = new C0429(getContext(), null, C0158.toolbarNavigationButtonStyle);
            this.f319.setImageDrawable(this.f326);
            this.f319.setContentDescription(this.f335);
            C0047 lp = generateDefaultLayoutParams();
            lp.f1033 = 8388611 | (this.f312 & C0291.AppCompatTheme_windowActionBarOverlay);
            lp.f355 = 2;
            this.f319.setLayoutParams(lp);
            this.f319.setOnClickListener(new View$OnClickListenerC0048());
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$ø  reason: contains not printable characters */
    public class View$OnClickListenerC0048 implements View.OnClickListener {
        public View$OnClickListenerC0048() {
        }

        public void onClick(View v) {
            Toolbar.this.m193();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m210(View v, boolean allowHide) {
        C0047 lp;
        ViewGroup.LayoutParams vlp = v.getLayoutParams();
        if (vlp == null) {
            lp = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(vlp)) {
            lp = generateLayoutParams(vlp);
        } else {
            lp = (C0047) vlp;
        }
        lp.f355 = 1;
        if (!allowHide || this.f327 == null) {
            addView(v, lp);
            return;
        }
        v.setLayoutParams(lp);
        this.f322.add(v);
    }

    public Parcelable onSaveInstanceState() {
        C0380 r1;
        C0051 state = new C0051(super.onSaveInstanceState());
        C0046 r12 = this.f334;
        if (!(r12 == null || (r1 = r12.f354) == null)) {
            state.f360 = r1.getItemId();
        }
        state.f359 = m187();
        return state;
    }

    public void onRestoreInstanceState(Parcelable state) {
        MenuItem item;
        if (!(state instanceof C0051)) {
            super.onRestoreInstanceState(state);
            return;
        }
        C0051 ss = (C0051) state;
        super.onRestoreInstanceState(ss.m2863());
        ActionMenuView actionMenuView = this.f332;
        Menu menu = actionMenuView != null ? actionMenuView.m112() : null;
        int i = ss.f360;
        if (!(i == 0 || this.f334 == null || menu == null || (item = menu.findItem(i)) == null)) {
            item.expandActionView();
        }
        if (ss.f359) {
            m217();
        }
    }

    /* renamed from: ₤  reason: contains not printable characters */
    public final void m217() {
        removeCallbacks(this.f336);
        post(this.f336);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f336);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            this.f323 = false;
        }
        if (!this.f323) {
            boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.f323 = true;
            }
        }
        if (action == 1 || action == 3) {
            this.f323 = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 9) {
            this.f317 = false;
        }
        if (!this.f317) {
            boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.f317 = true;
            }
        }
        if (action == 10 || action == 3) {
            this.f317 = false;
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m209(View child, int parentWidthSpec, int widthUsed, int parentHeightSpec, int heightUsed, int heightConstraint) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int childWidthSpec = ViewGroup.getChildMeasureSpec(parentWidthSpec, getPaddingLeft() + getPaddingRight() + lp.leftMargin + lp.rightMargin + widthUsed, lp.width);
        int childHeightSpec = ViewGroup.getChildMeasureSpec(parentHeightSpec, getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height);
        int childHeightMode = View.MeasureSpec.getMode(childHeightSpec);
        if (childHeightMode != 1073741824 && heightConstraint >= 0) {
            childHeightSpec = View.MeasureSpec.makeMeasureSpec(childHeightMode != 0 ? Math.min(View.MeasureSpec.getSize(childHeightSpec), heightConstraint) : heightConstraint, 1073741824);
        }
        child.measure(childWidthSpec, childHeightSpec);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m200(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed, int[] collapsingMargins) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        int leftDiff = lp.leftMargin - collapsingMargins[0];
        int rightDiff = lp.rightMargin - collapsingMargins[1];
        int hMargins = Math.max(0, leftDiff) + Math.max(0, rightDiff);
        collapsingMargins[0] = Math.max(0, -leftDiff);
        collapsingMargins[1] = Math.max(0, -rightDiff);
        child.measure(ViewGroup.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight() + hMargins + widthUsed, lp.width), ViewGroup.getChildMeasureSpec(parentHeightMeasureSpec, getPaddingTop() + getPaddingBottom() + lp.topMargin + lp.bottomMargin + heightUsed, lp.height));
        return child.getMeasuredWidth() + hMargins;
    }

    /* renamed from: µ  reason: contains not printable characters */
    public final boolean m183() {
        if (!this.f313) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = getChildAt(i);
            if (m196(child) && child.getMeasuredWidth() > 0 && child.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int marginEndIndex;
        int marginStartIndex;
        int marginStartIndex2;
        int childState;
        int height;
        int childState2;
        int childState3;
        int titleHeight;
        int menuWidth;
        int childCount;
        int menuWidth2;
        int height2 = 0;
        int childState4 = 0;
        int[] collapsingMargins = this.f343;
        if (C0498.m2371((View) this)) {
            marginStartIndex = 1;
            marginEndIndex = 0;
        } else {
            marginStartIndex = 0;
            marginEndIndex = 1;
        }
        int navWidth = 0;
        if (m196((View) this.f328)) {
            m209(this.f328, widthMeasureSpec, 0, heightMeasureSpec, 0, this.f314);
            navWidth = this.f328.getMeasuredWidth() + m198((View) this.f328);
            height2 = Math.max(0, this.f328.getMeasuredHeight() + m191((View) this.f328));
            childState4 = View.combineMeasuredStates(0, this.f328.getMeasuredState());
        }
        if (m196((View) this.f319)) {
            m209(this.f319, widthMeasureSpec, 0, heightMeasureSpec, 0, this.f314);
            navWidth = this.f319.getMeasuredWidth() + m198((View) this.f319);
            height2 = Math.max(height2, this.f319.getMeasuredHeight() + m191((View) this.f319));
            childState4 = View.combineMeasuredStates(childState4, this.f319.getMeasuredState());
        }
        int contentInsetStart = getCurrentContentInsetStart();
        int width = 0 + Math.max(contentInsetStart, navWidth);
        collapsingMargins[marginStartIndex] = Math.max(0, contentInsetStart - navWidth);
        if (m196((View) this.f332)) {
            marginStartIndex2 = 0;
            m209(this.f332, widthMeasureSpec, width, heightMeasureSpec, 0, this.f314);
            int menuWidth3 = this.f332.getMeasuredWidth() + m198((View) this.f332);
            int height3 = Math.max(height2, this.f332.getMeasuredHeight() + m191((View) this.f332));
            childState2 = View.combineMeasuredStates(childState4, this.f332.getMeasuredState());
            childState = height3;
            height = menuWidth3;
        } else {
            marginStartIndex2 = 0;
            childState2 = childState4;
            childState = height2;
            height = 0;
        }
        int contentInsetEnd = getCurrentContentInsetEnd();
        int width2 = width + Math.max(contentInsetEnd, height);
        collapsingMargins[marginEndIndex] = Math.max(marginStartIndex2, contentInsetEnd - height);
        if (m196(this.f327)) {
            width2 += m200(this.f327, widthMeasureSpec, width2, heightMeasureSpec, 0, collapsingMargins);
            childState = Math.max(childState, this.f327.getMeasuredHeight() + m191(this.f327));
            childState3 = View.combineMeasuredStates(childState2, this.f327.getMeasuredState());
        } else {
            childState3 = childState2;
        }
        if (m196((View) this.f329)) {
            width2 += m200(this.f329, widthMeasureSpec, width2, heightMeasureSpec, 0, collapsingMargins);
            childState = Math.max(childState, this.f329.getMeasuredHeight() + m191((View) this.f329));
            childState3 = View.combineMeasuredStates(childState3, this.f329.getMeasuredState());
        }
        int childCount2 = getChildCount();
        int height4 = childState;
        int width3 = width2;
        int i = 0;
        while (i < childCount2) {
            View child = getChildAt(i);
            if (((C0047) child.getLayoutParams()).f355 != 0) {
                childCount = childCount2;
                menuWidth = height;
                menuWidth2 = height4;
            } else if (!m196(child)) {
                childCount = childCount2;
                menuWidth = height;
                menuWidth2 = height4;
            } else {
                menuWidth = height;
                childCount = childCount2;
                width3 += m200(child, widthMeasureSpec, width3, heightMeasureSpec, 0, collapsingMargins);
                height4 = Math.max(height4, child.getMeasuredHeight() + m191(child));
                childState3 = View.combineMeasuredStates(childState3, child.getMeasuredState());
                i++;
                childCount2 = childCount;
                height = menuWidth;
            }
            height4 = menuWidth2;
            i++;
            childCount2 = childCount;
            height = menuWidth;
        }
        int titleWidth = 0;
        int titleHeight2 = 0;
        int titleVertMargins = this.f346 + this.f348;
        int titleHorizMargins = this.f311 + this.f351;
        if (m196((View) this.f330)) {
            m200(this.f330, widthMeasureSpec, width3 + titleHorizMargins, heightMeasureSpec, titleVertMargins, collapsingMargins);
            titleWidth = this.f330.getMeasuredWidth() + m198((View) this.f330);
            titleHeight2 = this.f330.getMeasuredHeight() + m191((View) this.f330);
            childState3 = View.combineMeasuredStates(childState3, this.f330.getMeasuredState());
        }
        if (m196((View) this.f320)) {
            titleWidth = Math.max(titleWidth, m200(this.f320, widthMeasureSpec, width3 + titleHorizMargins, heightMeasureSpec, titleHeight2 + titleVertMargins, collapsingMargins));
            int titleHeight3 = titleHeight2 + this.f320.getMeasuredHeight() + m191((View) this.f320);
            childState3 = View.combineMeasuredStates(childState3, this.f320.getMeasuredState());
            titleHeight = titleHeight3;
        } else {
            titleHeight = titleHeight2;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(width3 + titleWidth + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), widthMeasureSpec, -16777216 & childState3), m183() ? 0 : View.resolveSizeAndState(Math.max(Math.max(height4, titleHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), heightMeasureSpec, childState3 << 16));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015e, code lost:
        if (r33.f330.getMeasuredWidth() <= 0) goto L_0x0163;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r34, int r35, int r36, int r37, int r38) {
        /*
        // Method dump skipped, instructions count: 877
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m202(List<View> views, int[] collapsingMargins) {
        int collapseLeft = collapsingMargins[0];
        int collapseRight = collapsingMargins[1];
        int width = 0;
        int count = views.size();
        for (int i = 0; i < count; i++) {
            View v = views.get(i);
            C0047 lp = (C0047) v.getLayoutParams();
            int l = ((ViewGroup.MarginLayoutParams) lp).leftMargin - collapseLeft;
            int r = ((ViewGroup.MarginLayoutParams) lp).rightMargin - collapseRight;
            int leftMargin = Math.max(0, l);
            int rightMargin = Math.max(0, r);
            collapseLeft = Math.max(0, -l);
            collapseRight = Math.max(0, -r);
            width += v.getMeasuredWidth() + leftMargin + rightMargin;
        }
        return width;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m201(View child, int left, int[] collapsingMargins, int alignmentHeight) {
        C0047 lp = (C0047) child.getLayoutParams();
        int l = ((ViewGroup.MarginLayoutParams) lp).leftMargin - collapsingMargins[0];
        int left2 = left + Math.max(0, l);
        collapsingMargins[0] = Math.max(0, -l);
        int top = m199(child, alignmentHeight);
        int childWidth = child.getMeasuredWidth();
        child.layout(left2, top, left2 + childWidth, child.getMeasuredHeight() + top);
        return left2 + ((ViewGroup.MarginLayoutParams) lp).rightMargin + childWidth;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final int m192(View child, int right, int[] collapsingMargins, int alignmentHeight) {
        C0047 lp = (C0047) child.getLayoutParams();
        int r = ((ViewGroup.MarginLayoutParams) lp).rightMargin - collapsingMargins[1];
        int right2 = right - Math.max(0, r);
        collapsingMargins[1] = Math.max(0, -r);
        int top = m199(child, alignmentHeight);
        int childWidth = child.getMeasuredWidth();
        child.layout(right2 - childWidth, top, right2, child.getMeasuredHeight() + top);
        return right2 - (((ViewGroup.MarginLayoutParams) lp).leftMargin + childWidth);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m199(View child, int alignmentHeight) {
        C0047 lp = (C0047) child.getLayoutParams();
        int childHeight = child.getMeasuredHeight();
        int alignmentOffset = alignmentHeight > 0 ? (childHeight - alignmentHeight) / 2 : 0;
        int r4 = m190(lp.f1033);
        if (r4 == 48) {
            return getPaddingTop() - alignmentOffset;
        }
        if (r4 == 80) {
            return (((getHeight() - getPaddingBottom()) - childHeight) - ((ViewGroup.MarginLayoutParams) lp).bottomMargin) - alignmentOffset;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int spaceAbove = (((height - paddingTop) - paddingBottom) - childHeight) / 2;
        if (spaceAbove < ((ViewGroup.MarginLayoutParams) lp).topMargin) {
            spaceAbove = ((ViewGroup.MarginLayoutParams) lp).topMargin;
        } else {
            int spaceBelow = (((height - paddingBottom) - childHeight) - spaceAbove) - paddingTop;
            int i = ((ViewGroup.MarginLayoutParams) lp).bottomMargin;
            if (spaceBelow < i) {
                spaceAbove = Math.max(0, spaceAbove - (i - spaceBelow));
            }
        }
        return paddingTop + spaceAbove;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final int m190(int gravity) {
        int vgrav = gravity & C0291.AppCompatTheme_windowActionBarOverlay;
        if (vgrav == 16 || vgrav == 48 || vgrav == 80) {
            return vgrav;
        }
        return this.f347 & C0291.AppCompatTheme_windowActionBarOverlay;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m211(List<View> views, int gravity) {
        boolean isRtl = true;
        if (C0248.m1146((View) this) != 1) {
            isRtl = false;
        }
        int childCount = getChildCount();
        int absGrav = C0191.m910(gravity, C0248.m1146((View) this));
        views.clear();
        if (isRtl) {
            for (int i = childCount - 1; i >= 0; i--) {
                View child = getChildAt(i);
                C0047 lp = (C0047) child.getLayoutParams();
                if (lp.f355 == 0 && m196(child) && m197(lp.f1033) == absGrav) {
                    views.add(child);
                }
            }
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View child2 = getChildAt(i2);
            C0047 lp2 = (C0047) child2.getLayoutParams();
            if (lp2.f355 == 0 && m196(child2) && m197(lp2.f1033) == absGrav) {
                views.add(child2);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m197(int gravity) {
        int ld = C0248.m1146((View) this);
        int hGrav = C0191.m910(gravity, ld) & 7;
        if (hGrav == 1 || hGrav == 3 || hGrav == 5) {
            return hGrav;
        }
        if (ld == 1) {
            return 5;
        }
        return 3;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean m196(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final int m198(View v) {
        ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        return C0241.m1084(mlp) + C0241.m1085(mlp);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final int m191(View v) {
        ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        return mlp.topMargin + mlp.bottomMargin;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0047 generateLayoutParams(AttributeSet attrs) {
        return new C0047(getContext(), attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0047 generateLayoutParams(ViewGroup.LayoutParams p) {
        if (p instanceof C0047) {
            return new C0047((C0047) p);
        }
        if (p instanceof AbstractC0292.C0295) {
            return new C0047((AbstractC0292.C0295) p);
        }
        if (p instanceof ViewGroup.MarginLayoutParams) {
            return new C0047((ViewGroup.MarginLayoutParams) p);
        }
        return new C0047(p);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0047 generateDefaultLayoutParams() {
        return new C0047(-2, -2);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return super.checkLayoutParams(p) && (p instanceof C0047);
    }

    public AbstractC0451 getWrapper() {
        if (this.f342 == null) {
            this.f342 = new C0490(this, true);
        }
        return this.f342;
    }

    /* renamed from: ₧  reason: contains not printable characters */
    public void m218() {
        for (int i = getChildCount() - 1; i >= 0; i--) {
            View child = getChildAt(i);
            if (!(((C0047) child.getLayoutParams()).f355 == 2 || child == this.f332)) {
                removeViewAt(i);
                this.f322.add(child);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m206() {
        for (int i = this.f322.size() - 1; i >= 0; i--) {
            addView(this.f322.get(i));
        }
        this.f322.clear();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m214(View child) {
        return child.getParent() == this || this.f322.contains(child);
    }

    public void setCollapsible(boolean collapsible) {
        this.f313 = collapsible;
        requestLayout();
    }

    /* renamed from: ö  reason: contains not printable characters */
    public final void m186() {
        if (this.f341 == null) {
            this.f341 = new C0475();
        }
    }

    public C0407 getOuterActionMenuPresenter() {
        return this.f340;
    }

    public Context getPopupContext() {
        return this.f325;
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$ö  reason: contains not printable characters */
    public static class C0047 extends AbstractC0292.C0295 {

        /* renamed from: Φ  reason: contains not printable characters */
        public int f355 = 0;

        public C0047(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public C0047(int width, int height) {
            super(width, height);
            this.f1033 = 8388627;
        }

        public C0047(C0047 source) {
            super((AbstractC0292.C0295) source);
            this.f355 = source.f355;
        }

        public C0047(AbstractC0292.C0295 source) {
            super(source);
        }

        public C0047(ViewGroup.MarginLayoutParams source) {
            super(source);
            m228(source);
        }

        public C0047(ViewGroup.LayoutParams source) {
            super(source);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m228(ViewGroup.MarginLayoutParams source) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = source.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = source.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = source.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = source.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$₩  reason: contains not printable characters */
    public static class C0051 extends AbstractC0584 {
        public static final Parcelable.Creator<C0051> CREATOR = new C0052();

        /* renamed from: Φ  reason: contains not printable characters */
        public boolean f359;

        /* renamed from: θ  reason: contains not printable characters */
        public int f360;

        public C0051(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f360 = source.readInt();
            this.f359 = source.readInt() != 0;
        }

        public C0051(Parcelable superState) {
            super(superState);
        }

        @Override // ♫.AbstractC0584
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f360);
            out.writeInt(this.f359 ? 1 : 0);
        }

        /* renamed from: androidx.appcompat.widget.Toolbar$₩$θ  reason: contains not printable characters */
        public static class C0052 implements Parcelable.ClassLoaderCreator<C0051> {
            /* renamed from: θ  reason: contains not printable characters */
            public C0051 createFromParcel(Parcel in, ClassLoader loader) {
                return new C0051(in, loader);
            }

            /* renamed from: θ  reason: contains not printable characters */
            public C0051 createFromParcel(Parcel in) {
                return new C0051(in, null);
            }

            /* renamed from: θ  reason: contains not printable characters */
            public C0051[] newArray(int size) {
                return new C0051[size];
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$Ø  reason: contains not printable characters */
    public class C0046 implements AbstractC0392 {

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0375 f353;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0380 f354;

        public C0046() {
        }

        @Override // ♫.AbstractC0392
        /* renamed from: θ  reason: contains not printable characters */
        public void m222(Context context, C0375 menu) {
            C0380 r1;
            C0375 r0 = this.f353;
            if (!(r0 == null || (r1 = this.f354) == null)) {
                r0.m1821(r1);
            }
            this.f353 = menu;
        }

        @Override // ♫.AbstractC0392
        /* renamed from: θ  reason: contains not printable characters */
        public void m224(boolean cleared) {
            if (this.f354 != null) {
                boolean found = false;
                C0375 r1 = this.f353;
                if (r1 != null) {
                    int count = r1.size();
                    int i = 0;
                    while (true) {
                        if (i >= count) {
                            break;
                        } else if (this.f353.getItem(i) == this.f354) {
                            found = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!found) {
                    m226(this.f353, this.f354);
                }
            }
        }

        @Override // ♫.AbstractC0392
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m227(SubMenuC0402 subMenu) {
            return false;
        }

        @Override // ♫.AbstractC0392
        /* renamed from: θ  reason: contains not printable characters */
        public void m223(C0375 menu, boolean allMenusAreClosing) {
        }

        @Override // ♫.AbstractC0392
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m225() {
            return false;
        }

        @Override // ♫.AbstractC0392
        /* renamed from: Φ  reason: contains not printable characters */
        public boolean m221(C0375 menu, C0380 item) {
            Toolbar.this.m184();
            ViewParent collapseButtonParent = Toolbar.this.f319.getParent();
            Toolbar toolbar = Toolbar.this;
            if (collapseButtonParent != toolbar) {
                if (collapseButtonParent instanceof ViewGroup) {
                    ((ViewGroup) collapseButtonParent).removeView(toolbar.f319);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f319);
            }
            Toolbar.this.f327 = item.getActionView();
            this.f354 = item;
            ViewParent expandedActionParent = Toolbar.this.f327.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (expandedActionParent != toolbar3) {
                if (expandedActionParent instanceof ViewGroup) {
                    ((ViewGroup) expandedActionParent).removeView(toolbar3.f327);
                }
                C0047 lp = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                lp.f1033 = 8388611 | (toolbar4.f312 & C0291.AppCompatTheme_windowActionBarOverlay);
                lp.f355 = 2;
                toolbar4.f327.setLayoutParams(lp);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f327);
            }
            Toolbar.this.m218();
            Toolbar.this.requestLayout();
            item.m1854(true);
            View view = Toolbar.this.f327;
            if (view instanceof AbstractC0351) {
                ((AbstractC0351) view).m1644();
            }
            return true;
        }

        @Override // ♫.AbstractC0392
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m226(C0375 menu, C0380 item) {
            View view = Toolbar.this.f327;
            if (view instanceof AbstractC0351) {
                ((AbstractC0351) view).m1645();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f327);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f319);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f327 = null;
            toolbar3.m206();
            this.f354 = null;
            Toolbar.this.requestLayout();
            item.m1854(false);
            return true;
        }
    }
}
