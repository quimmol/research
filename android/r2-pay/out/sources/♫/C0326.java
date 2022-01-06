package ♫;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import ♫.AbstractC0292;
import ♫.AbstractC0349;
import ♫.C0375;

/* renamed from: ♫.了  reason: contains not printable characters */
public class C0326 extends AbstractC0292 implements ActionBarOverlayLayout.AbstractC0016 {

    /* renamed from: Φ  reason: contains not printable characters */
    public static final Interpolator f1152 = new DecelerateInterpolator();

    /* renamed from: θ  reason: contains not printable characters */
    public static final Interpolator f1153 = new AccelerateInterpolator();

    /* renamed from: µ  reason: contains not printable characters */
    public boolean f1154;

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean f1155 = true;

    /* renamed from: ö  reason: contains not printable characters */
    public boolean f1156;

    /* renamed from: ø  reason: contains not printable characters */
    public boolean f1157;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Context f1158;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final AbstractC0271 f1159 = new C0329();

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1160;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f1161 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Context f1162;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f1163;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ActionBarContainer f1164;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ActionBarContextView f1165;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ActionBarOverlayLayout f1166;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ArrayList<AbstractC0292.AbstractC0294> f1167 = new ArrayList<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final AbstractC0069 f1168 = new C0328();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final AbstractC0271 f1169 = new C0330();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0327 f1170;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0349.AbstractC0350 f1171;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0349 f1172;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0359 f1173;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0451 f1174;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0476 f1175;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1176;

    /* renamed from: ฿  reason: contains not printable characters */
    public boolean f1177 = true;

    /* renamed from: ₣  reason: contains not printable characters */
    public boolean f1178;

    /* renamed from: ₤  reason: contains not printable characters */
    public boolean f1179;

    /* renamed from: ₩  reason: contains not printable characters */
    public boolean f1180;

    /* renamed from: ♫.了$θ  reason: contains not printable characters */
    public class C0330 extends C0608 {
        public C0330() {
        }

        @Override // ♫.AbstractC0271
        /* renamed from: θ  reason: contains not printable characters */
        public void m1526(View view) {
            View view2;
            C0326 r0 = C0326.this;
            if (r0.f1155 && (view2 = r0.f1163) != null) {
                view2.setTranslationY(0.0f);
                C0326.this.f1164.setTranslationY(0.0f);
            }
            C0326.this.f1164.setVisibility(8);
            C0326.this.f1164.setTransitioning(false);
            C0326 r02 = C0326.this;
            r02.f1173 = null;
            r02.m1484();
            ActionBarOverlayLayout actionBarOverlayLayout = C0326.this.f1166;
            if (actionBarOverlayLayout != null) {
                C0248.m1143((View) actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: ♫.了$Φ  reason: contains not printable characters */
    public class C0329 extends C0608 {
        public C0329() {
        }

        @Override // ♫.AbstractC0271
        /* renamed from: θ  reason: contains not printable characters */
        public void m1525(View view) {
            C0326 r0 = C0326.this;
            r0.f1173 = null;
            r0.f1164.requestLayout();
        }
    }

    /* renamed from: ♫.了$ø  reason: contains not printable characters */
    public class C0328 implements AbstractC0069 {
        public C0328() {
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1524(View view) {
            ((View) C0326.this.f1164.getParent()).invalidate();
        }
    }

    public C0326(Activity activity, boolean overlayMode) {
        new ArrayList();
        View decor = activity.getWindow().getDecorView();
        m1495(decor);
        if (!overlayMode) {
            this.f1163 = decor.findViewById(16908290);
        }
    }

    public C0326(Dialog dialog) {
        new ArrayList();
        m1495(dialog.getWindow().getDecorView());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1495(View decor) {
        this.f1166 = (ActionBarOverlayLayout) decor.findViewById(C0065.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1166;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f1174 = m1490(decor.findViewById(C0065.action_bar));
        this.f1165 = (ActionBarContextView) decor.findViewById(C0065.action_context_bar);
        this.f1164 = (ActionBarContainer) decor.findViewById(C0065.action_bar_container);
        AbstractC0451 r0 = this.f1174;
        if (r0 == null || this.f1165 == null || this.f1164 == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f1162 = ((C0490) r0).m2334();
        boolean homeAsUp = (((C0490) this.f1174).m2326() & 4) != 0;
        if (homeAsUp) {
            this.f1176 = true;
        }
        C0348 abp = C0348.m1615(this.f1162);
        m1504(abp.m1622() || homeAsUp);
        m1502(abp.m1620());
        TypedArray a = this.f1162.obtainStyledAttributes(null, C0291.ActionBar, C0158.actionBarStyle, 0);
        if (a.getBoolean(C0291.ActionBar_hideOnContentScroll, false)) {
            m1503(true);
        }
        int elevation = a.getDimensionPixelSize(C0291.ActionBar_elevation, 0);
        if (elevation != 0) {
            m1491((float) elevation);
        }
        a.recycle();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final AbstractC0451 m1490(View view) {
        if (view instanceof AbstractC0451) {
            return (AbstractC0451) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1491(float elevation) {
        C0248.m1153(this.f1164, elevation);
    }

    @Override // ♫.AbstractC0292
    /* renamed from: θ  reason: contains not printable characters */
    public void m1494(Configuration newConfig) {
        m1502(C0348.m1615(this.f1162).m1620());
    }

    /* renamed from: ₣  reason: contains not printable characters */
    public final void m1502(boolean hasEmbeddedTabs) {
        this.f1157 = hasEmbeddedTabs;
        if (!this.f1157) {
            ((C0490) this.f1174).m2345((C0476) null);
            this.f1164.setTabContainer(this.f1175);
        } else {
            this.f1164.setTabContainer(null);
            ((C0490) this.f1174).m2345(this.f1175);
        }
        boolean z = true;
        boolean isInTabMode = m1483() == 2;
        C0476 r1 = this.f1175;
        if (r1 != null) {
            if (isInTabMode) {
                r1.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1166;
                if (actionBarOverlayLayout != null) {
                    C0248.m1143((View) actionBarOverlayLayout);
                }
            } else {
                r1.setVisibility(8);
            }
        }
        ((C0490) this.f1174).m2346(!this.f1157 && isInTabMode);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1166;
        if (this.f1157 || !isInTabMode) {
            z = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    @Override // ♫.AbstractC0292
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1484() {
        AbstractC0349.AbstractC0350 r0 = this.f1171;
        if (r0 != null) {
            r0.m1641(this.f1172);
            this.f1172 = null;
            this.f1171 = null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1492(int visibility) {
        this.f1161 = visibility;
    }

    @Override // ♫.AbstractC0292
    /* renamed from: ø  reason: contains not printable characters */
    public void m1482(boolean enabled) {
        C0359 r0;
        this.f1178 = enabled;
        if (!enabled && (r0 = this.f1173) != null) {
            r0.m1691();
        }
    }

    @Override // ♫.AbstractC0292
    /* renamed from: θ  reason: contains not printable characters */
    public void m1497(boolean isVisible) {
        if (isVisible != this.f1160) {
            this.f1160 = isVisible;
            int count = this.f1167.size();
            for (int i = 0; i < count; i++) {
                this.f1167.get(i).m1304(isVisible);
            }
        }
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public void m1500(boolean showHomeAsUp) {
        m1493(showHomeAsUp ? 4 : 0, 4);
    }

    /* renamed from: ₧  reason: contains not printable characters */
    public void m1504(boolean enable) {
        ((C0490) this.f1174).m2331(enable);
    }

    @Override // ♫.AbstractC0292
    /* renamed from: θ  reason: contains not printable characters */
    public void m1496(CharSequence title) {
        ((C0490) this.f1174).m2318(title);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1493(int options, int mask) {
        int current = ((C0490) this.f1174).m2326();
        if ((mask & 4) != 0) {
            this.f1176 = true;
        }
        ((C0490) this.f1174).m2328((options & mask) | ((~mask) & current));
    }

    @Override // ♫.AbstractC0292
    /* renamed from: Φ  reason: contains not printable characters */
    public int m1483() {
        return ((C0490) this.f1174).m2320();
    }

    @Override // ♫.AbstractC0292, ♫.AbstractC0292, ♫.AbstractC0292, ♫.AbstractC0292
    /* renamed from: θ  reason: contains not printable characters */
    public int m1487() {
        return ((C0490) this.f1174).m2326();
    }

    @Override // ♫.AbstractC0292
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0349 m1489(AbstractC0349.AbstractC0350 callback) {
        C0327 r0 = this.f1170;
        if (r0 != null) {
            r0.m1517();
        }
        this.f1166.setHideOnContentScrollEnabled(false);
        this.f1165.m72();
        C0327 mode = new C0327(this.f1165.getContext(), callback);
        if (!mode.m1507()) {
            return null;
        }
        this.f1170 = mode;
        mode.m1509();
        this.f1165.m76(mode);
        m1478(true);
        this.f1165.sendAccessibilityEvent(32);
        return mode;
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public void m1506(boolean enabled) {
        this.f1155 = enabled;
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public final void m1505() {
        if (!this.f1180) {
            this.f1180 = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1166;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m1501(false);
        }
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public void m1499() {
        if (this.f1154) {
            this.f1154 = false;
            m1501(true);
        }
    }

    @Override // ♫.AbstractC0292
    /* renamed from: ø  reason: contains not printable characters */
    public final void m1481() {
        if (this.f1180) {
            this.f1180 = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1166;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m1501(false);
        }
    }

    @Override // ♫.AbstractC0292
    /* renamed from: Ø  reason: contains not printable characters */
    public void m1477() {
        if (!this.f1154) {
            this.f1154 = true;
            m1501(true);
        }
    }

    /* renamed from: ₤  reason: contains not printable characters */
    public void m1503(boolean hideOnContentScroll) {
        if (!hideOnContentScroll || this.f1166.m79()) {
            this.f1179 = hideOnContentScroll;
            this.f1166.setHideOnContentScrollEnabled(hideOnContentScroll);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m1473(boolean hiddenByApp, boolean hiddenBySystem, boolean showingForMode) {
        if (showingForMode) {
            return true;
        }
        if (hiddenByApp || hiddenBySystem) {
            return false;
        }
        return true;
    }

    /* renamed from: ₢  reason: contains not printable characters */
    public final void m1501(boolean fromSystem) {
        if (m1473(this.f1156, this.f1154, this.f1180)) {
            if (!this.f1177) {
                this.f1177 = true;
                m1475(fromSystem);
            }
        } else if (this.f1177) {
            this.f1177 = false;
            m1480(fromSystem);
        }
    }

    /* renamed from: µ  reason: contains not printable characters */
    public void m1475(boolean fromSystem) {
        View view;
        View view2;
        C0359 r0 = this.f1173;
        if (r0 != null) {
            r0.m1691();
        }
        this.f1164.setVisibility(0);
        if (this.f1161 != 0 || (!this.f1178 && !fromSystem)) {
            this.f1164.setAlpha(1.0f);
            this.f1164.setTranslationY(0.0f);
            if (this.f1155 && (view = this.f1163) != null) {
                view.setTranslationY(0.0f);
            }
            this.f1159.m1232(null);
        } else {
            this.f1164.setTranslationY(0.0f);
            float startingY = (float) (-this.f1164.getHeight());
            if (fromSystem) {
                int[] topLeft = {0, 0};
                this.f1164.getLocationInWindow(topLeft);
                startingY -= (float) topLeft[1];
            }
            this.f1164.setTranslationY(startingY);
            C0359 anim = new C0359();
            C0258 a = C0248.m1151((View) this.f1164).m1185(0.0f);
            a.m1192(this.f1168);
            anim.m1688(a);
            if (this.f1155 && (view2 = this.f1163) != null) {
                view2.setTranslationY(startingY);
                C0258 r4 = C0248.m1151(this.f1163);
                r4.m1185(0.0f);
                anim.m1688(r4);
            }
            anim.m1687(f1152);
            anim.m1686(250);
            anim.m1690(this.f1159);
            this.f1173 = anim;
            anim.m1684();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1166;
        if (actionBarOverlayLayout != null) {
            C0248.m1143((View) actionBarOverlayLayout);
        }
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m1480(boolean fromSystem) {
        View view;
        C0359 r0 = this.f1173;
        if (r0 != null) {
            r0.m1691();
        }
        if (this.f1161 != 0 || (!this.f1178 && !fromSystem)) {
            this.f1169.m1232(null);
            return;
        }
        this.f1164.setAlpha(1.0f);
        this.f1164.setTransitioning(true);
        C0359 anim = new C0359();
        float endingY = (float) (-this.f1164.getHeight());
        if (fromSystem) {
            int[] topLeft = {0, 0};
            this.f1164.getLocationInWindow(topLeft);
            endingY -= (float) topLeft[1];
        }
        C0258 a = C0248.m1151((View) this.f1164).m1185(endingY);
        a.m1192(this.f1168);
        anim.m1688(a);
        if (this.f1155 && (view = this.f1163) != null) {
            C0258 r3 = C0248.m1151(view);
            r3.m1185(endingY);
            anim.m1688(r3);
        }
        anim.m1687(f1153);
        anim.m1686(250);
        anim.m1690(this.f1169);
        this.f1173 = anim;
        anim.m1684();
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m1478(boolean toActionMode) {
        C0258 fadeIn;
        C0258 fadeOut;
        if (toActionMode) {
            m1505();
        } else {
            m1481();
        }
        if (m1476()) {
            if (toActionMode) {
                fadeOut = ((C0490) this.f1174).m2337(4, 100);
                fadeIn = this.f1165.m1958(0, 200);
            } else {
                fadeIn = ((C0490) this.f1174).m2337(0, 200);
                fadeOut = this.f1165.m1958(8, 100);
            }
            C0359 set = new C0359();
            set.m1689(fadeOut, fadeIn);
            set.m1684();
        } else if (toActionMode) {
            ((C0490) this.f1174).m2310(4);
            this.f1165.setVisibility(0);
        } else {
            ((C0490) this.f1174).m2310(0);
            this.f1165.setVisibility(8);
        }
    }

    /* renamed from: µ  reason: contains not printable characters */
    public final boolean m1476() {
        return C0248.m1138(this.f1164);
    }

    @Override // ♫.AbstractC0292, ♫.AbstractC0292, ♫.AbstractC0292, ♫.AbstractC0292
    /* renamed from: θ  reason: contains not printable characters */
    public Context m1488() {
        if (this.f1158 == null) {
            TypedValue outValue = new TypedValue();
            this.f1162.getTheme().resolveAttribute(C0158.actionBarWidgetTheme, outValue, true);
            int targetThemeRes = outValue.resourceId;
            if (targetThemeRes != 0) {
                this.f1158 = new ContextThemeWrapper(this.f1162, targetThemeRes);
            } else {
                this.f1158 = this.f1162;
            }
        }
        return this.f1158;
    }

    @Override // ♫.AbstractC0292
    /* renamed from: ö  reason: contains not printable characters */
    public void m1479() {
        C0359 r0 = this.f1173;
        if (r0 != null) {
            r0.m1691();
            this.f1173 = null;
        }
    }

    /* renamed from: µ  reason: contains not printable characters */
    public void m1474() {
    }

    @Override // ♫.AbstractC0292
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1486() {
        AbstractC0451 r0 = this.f1174;
        if (r0 == null || !((C0490) r0).m2332()) {
            return false;
        }
        ((C0490) this.f1174).m2338();
        return true;
    }

    /* renamed from: ♫.了$Ø  reason: contains not printable characters */
    public class C0327 extends AbstractC0349 implements C0375.AbstractC0377 {

        /* renamed from: θ  reason: contains not printable characters */
        public final Context f1181;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public WeakReference<View> f1182;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public AbstractC0349.AbstractC0350 f1184;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final C0375 f1185;

        public C0327(Context context, AbstractC0349.AbstractC0350 callback) {
            this.f1181 = context;
            this.f1184 = callback;
            C0375 r0 = new C0375(context);
            r0.m1800(1);
            this.f1185 = r0;
            this.f1185.m1813(this);
        }

        @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
        /* renamed from: θ  reason: contains not printable characters */
        public MenuInflater m1514() {
            return new C0356(this.f1181);
        }

        @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
        /* renamed from: θ  reason: contains not printable characters */
        public Menu m1513() {
            return this.f1185;
        }

        @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
        /* renamed from: θ  reason: contains not printable characters */
        public void m1517() {
            C0326 r0 = C0326.this;
            if (r0.f1170 == this) {
                if (!C0326.m1473(r0.f1156, r0.f1154, false)) {
                    C0326 r02 = C0326.this;
                    r02.f1172 = this;
                    r02.f1171 = this.f1184;
                } else {
                    this.f1184.m1641(this);
                }
                this.f1184 = null;
                C0326.this.m1478(false);
                C0326.this.f1165.m75();
                ((C0490) C0326.this.f1174).m2335().sendAccessibilityEvent(32);
                C0326 r1 = C0326.this;
                r1.f1166.setHideOnContentScrollEnabled(r1.f1179);
                C0326.this.f1170 = null;
            }
        }

        @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
        /* renamed from: Φ  reason: contains not printable characters */
        public void m1509() {
            if (C0326.this.f1170 == this) {
                this.f1185.m1769();
                try {
                    this.f1184.m1640(this, this.f1185);
                } finally {
                    this.f1185.m1773();
                }
            }
        }

        /* renamed from: ø  reason: contains not printable characters */
        public boolean m1507() {
            this.f1185.m1769();
            try {
                return this.f1184.m1642(this, this.f1185);
            } finally {
                this.f1185.m1773();
            }
        }

        @Override // ♫.AbstractC0349
        /* renamed from: θ  reason: contains not printable characters */
        public void m1519(View view) {
            C0326.this.f1165.setCustomView(view);
            this.f1182 = new WeakReference<>(view);
        }

        @Override // ♫.AbstractC0349
        /* renamed from: θ  reason: contains not printable characters */
        public void m1520(CharSequence subtitle) {
            C0326.this.f1165.setSubtitle(subtitle);
        }

        @Override // ♫.AbstractC0349
        /* renamed from: Φ  reason: contains not printable characters */
        public void m1511(CharSequence title) {
            C0326.this.f1165.setTitle(title);
        }

        @Override // ♫.AbstractC0349
        /* renamed from: Φ  reason: contains not printable characters */
        public void m1510(int resId) {
            m1511(C0326.this.f1162.getResources().getString(resId));
        }

        @Override // ♫.AbstractC0349
        /* renamed from: θ  reason: contains not printable characters */
        public void m1518(int resId) {
            m1520((CharSequence) C0326.this.f1162.getResources().getString(resId));
        }

        @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
        /* renamed from: Φ  reason: contains not printable characters */
        public CharSequence m1508() {
            return C0326.this.f1165.getTitle();
        }

        @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
        /* renamed from: θ  reason: contains not printable characters */
        public CharSequence m1516() {
            return C0326.this.f1165.getSubtitle();
        }

        @Override // ♫.AbstractC0349
        /* renamed from: θ  reason: contains not printable characters */
        public void m1522(boolean titleOptional) {
            super.m1638(titleOptional);
            C0326.this.f1165.setTitleOptional(titleOptional);
        }

        @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
        /* renamed from: Φ  reason: contains not printable characters */
        public boolean m1512() {
            return C0326.this.f1165.m77();
        }

        @Override // ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349, ♫.AbstractC0349
        /* renamed from: θ  reason: contains not printable characters */
        public View m1515() {
            WeakReference<View> weakReference = this.f1182;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // ♫.C0375.AbstractC0377
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1523(C0375 menu, MenuItem item) {
            AbstractC0349.AbstractC0350 r0 = this.f1184;
            if (r0 != null) {
                return r0.m1643(this, item);
            }
            return false;
        }

        @Override // ♫.C0375.AbstractC0377
        /* renamed from: θ  reason: contains not printable characters */
        public void m1521(C0375 menu) {
            if (this.f1184 != null) {
                m1509();
                C0326.this.f1165.m74();
            }
        }
    }

    @Override // ♫.AbstractC0292
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1485(boolean enable) {
        if (!this.f1176) {
            m1500(enable);
        }
    }

    @Override // ♫.AbstractC0292
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1498(int keyCode, KeyEvent event) {
        Menu menu;
        C0327 r0 = this.f1170;
        if (r0 == null || (menu = r0.m1513()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(event != null ? event.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        menu.setQwertyMode(z);
        return menu.performShortcut(keyCode, event, 0);
    }
}
