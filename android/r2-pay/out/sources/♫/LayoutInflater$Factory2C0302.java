package ♫;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import ♫.AbstractC0349;
import ♫.AbstractC0392;
import ♫.AbstractC0456;
import ♫.C0195;
import ♫.C0354;
import ♫.C0375;

/* renamed from: ♫.业  reason: contains not printable characters */
public class LayoutInflater$Factory2C0302 extends AbstractC0301 implements C0375.AbstractC0377, LayoutInflater.Factory2 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final int[] f1041 = {16842836};

    /* renamed from: Д  reason: contains not printable characters */
    public static final boolean f1042 = false;

    /* renamed from: Е  reason: contains not printable characters */
    public static boolean f1043 = true;

    /* renamed from: µ  reason: contains not printable characters */
    public boolean f1044;

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean f1045;

    /* renamed from: ö  reason: contains not printable characters */
    public boolean f1046;

    /* renamed from: ø  reason: contains not printable characters */
    public int f1047;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f1048;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f1049 = -100;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Rect f1050;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final Window.Callback f1051;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final Runnable f1052 = new RunnableC0308();

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f1053 = true;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Context f1054;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Rect f1055;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public MenuInflater f1056;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f1057;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ViewGroup f1058;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Window.Callback f1059;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Window f1060;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public PopupWindow f1061;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public TextView f1062;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AppCompatViewInflater f1063;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ActionBarContextView f1064;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public CharSequence f1065;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Runnable f1066;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0258 f1067 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0292 f1068;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final AbstractC0300 f1069;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0310 f1070;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0315 f1071;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0318 f1072;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0319 f1073;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0349 f1074;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0450 f1075;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0318[] f1076;

    /* renamed from: А  reason: contains not printable characters */
    public boolean f1077;

    /* renamed from: Б  reason: contains not printable characters */
    public boolean f1078;

    /* renamed from: В  reason: contains not printable characters */
    public boolean f1079;

    /* renamed from: Г  reason: contains not printable characters */
    public boolean f1080;

    /* renamed from: ฿  reason: contains not printable characters */
    public boolean f1081;

    /* renamed from: ₢  reason: contains not printable characters */
    public boolean f1082;

    /* renamed from: ₣  reason: contains not printable characters */
    public boolean f1083;

    /* renamed from: ₤  reason: contains not printable characters */
    public boolean f1084;

    /* renamed from: ₧  reason: contains not printable characters */
    public boolean f1085;

    /* renamed from: ₩  reason: contains not printable characters */
    public boolean f1086;

    static {
        int i = Build.VERSION.SDK_INT;
        if (f1042 && !f1043) {
            Thread.setDefaultUncaughtExceptionHandler(new C0309(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* renamed from: ♫.业$θ  reason: contains not printable characters */
    public static class C0309 implements Thread.UncaughtExceptionHandler {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f1093;

        public C0309(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f1093 = uncaughtExceptionHandler;
        }

        public void uncaughtException(Thread thread, Throwable thowable) {
            if (m1430(thowable)) {
                Throwable wrapped = new Resources.NotFoundException(thowable.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                wrapped.initCause(thowable.getCause());
                wrapped.setStackTrace(thowable.getStackTrace());
                this.f1093.uncaughtException(thread, wrapped);
                return;
            }
            this.f1093.uncaughtException(thread, thowable);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final boolean m1430(Throwable throwable) {
            String message;
            if (!(throwable instanceof Resources.NotFoundException) || (message = throwable.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: ♫.业$Φ  reason: contains not printable characters */
    public class RunnableC0308 implements Runnable {
        public RunnableC0308() {
        }

        public void run() {
            LayoutInflater$Factory2C0302 r0 = LayoutInflater$Factory2C0302.this;
            if ((r0.f1047 & 1) != 0) {
                r0.m1365(0);
            }
            LayoutInflater$Factory2C0302 r02 = LayoutInflater$Factory2C0302.this;
            if ((r02.f1047 & 4096) != 0) {
                r02.m1365(C0291.AppCompatTheme_tooltipForegroundColor);
            }
            LayoutInflater$Factory2C0302 r03 = LayoutInflater$Factory2C0302.this;
            r03.f1079 = false;
            r03.f1047 = 0;
        }
    }

    public LayoutInflater$Factory2C0302(Context context, Window window, AbstractC0300 callback) {
        this.f1054 = context;
        this.f1060 = window;
        this.f1069 = callback;
        this.f1059 = this.f1060.getCallback();
        Window.Callback callback2 = this.f1059;
        if (!(callback2 instanceof C0314)) {
            this.f1051 = new C0314(callback2);
            this.f1060.setCallback(this.f1051);
            C0488 a = C0488.m2289(context, (AttributeSet) null, f1041);
            Drawable winBg = a.m2296(0);
            if (winBg != null) {
                this.f1060.setBackgroundDrawable(winBg);
            }
            a.m2304();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    @Override // ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public void m1399(Bundle savedInstanceState) {
        Window.Callback callback = this.f1059;
        if (callback instanceof Activity) {
            String parentActivityName = null;
            try {
                parentActivityName = C0127.m638((Activity) callback);
            } catch (IllegalArgumentException e) {
            }
            if (parentActivityName != null) {
                AbstractC0292 ab = m1372();
                if (ab == null) {
                    this.f1080 = true;
                } else {
                    ab.m1288(true);
                }
            }
        }
        if (savedInstanceState != null && this.f1049 == -100) {
            this.f1049 = savedInstanceState.getInt("appcompat:local_night_mode", -100);
        }
    }

    @Override // ♫.AbstractC0301
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1376(Bundle savedInstanceState) {
        m1422();
    }

    @Override // ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0292 m1391() {
        m1419();
        return this.f1068;
    }

    @Override // ♫.AbstractC0301
    /* renamed from: Φ  reason: contains not printable characters */
    public final AbstractC0292 m1372() {
        return this.f1068;
    }

    @Override // ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public final Window.Callback m1389() {
        return this.f1060.getCallback();
    }

    /* renamed from: ₢  reason: contains not printable characters */
    public final void m1419() {
        m1422();
        if (this.f1044 && this.f1068 == null) {
            Window.Callback callback = this.f1059;
            if (callback instanceof Activity) {
                this.f1068 = new C0326((Activity) callback, this.f1086);
            } else if (callback instanceof Dialog) {
                this.f1068 = new C0326((Dialog) callback);
            }
            AbstractC0292 r0 = this.f1068;
            if (r0 != null) {
                r0.m1288(this.f1080);
            }
        }
    }

    @Override // ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public final Context m1384() {
        Context context = null;
        AbstractC0292 ab = m1391();
        if (ab != null) {
            context = ab.m1291();
        }
        if (context == null) {
            return this.f1054;
        }
        return context;
    }

    @Override // ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public MenuInflater m1385() {
        if (this.f1056 == null) {
            m1419();
            AbstractC0292 r1 = this.f1068;
            this.f1056 = new C0356(r1 != null ? r1.m1291() : this.f1054);
        }
        return this.f1056;
    }

    @Override // ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public <T extends View> T m1386(int id) {
        m1422();
        return (T) this.f1060.findViewById(id);
    }

    @Override // ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public void m1398(Configuration newConfig) {
        AbstractC0292 ab;
        if (this.f1044 && this.f1048 && (ab = m1391()) != null) {
            ab.m1294(newConfig);
        }
        C0421.m2025().m2039(this.f1054);
        m1407();
    }

    @Override // ♫.AbstractC0301
    /* renamed from: ö  reason: contains not printable characters */
    public void m1359() {
        m1407();
    }

    @Override // ♫.AbstractC0301
    /* renamed from: µ  reason: contains not printable characters */
    public void m1353() {
        AbstractC0292 ab = m1391();
        if (ab != null) {
            ab.m1286(false);
        }
        C0315 r1 = this.f1071;
        if (r1 != null) {
            r1.m1443();
        }
    }

    @Override // ♫.AbstractC0301
    /* renamed from: Ø  reason: contains not printable characters */
    public void m1355() {
        AbstractC0292 ab = m1391();
        if (ab != null) {
            ab.m1286(true);
        }
    }

    @Override // ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public void m1400(View v) {
        m1422();
        ViewGroup contentParent = (ViewGroup) this.f1058.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v);
        this.f1059.onContentChanged();
    }

    @Override // ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public void m1396(int resId) {
        m1422();
        ViewGroup contentParent = (ViewGroup) this.f1058.findViewById(16908290);
        contentParent.removeAllViews();
        LayoutInflater.from(this.f1054).inflate(resId, contentParent);
        this.f1059.onContentChanged();
    }

    @Override // ♫.AbstractC0301
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1377(View v, ViewGroup.LayoutParams lp) {
        m1422();
        ViewGroup contentParent = (ViewGroup) this.f1058.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v, lp);
        this.f1059.onContentChanged();
    }

    @Override // ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public void m1401(View v, ViewGroup.LayoutParams lp) {
        m1422();
        ((ViewGroup) this.f1058.findViewById(16908290)).addView(v, lp);
        this.f1059.onContentChanged();
    }

    @Override // ♫.AbstractC0301
    /* renamed from: ø  reason: contains not printable characters */
    public void m1366(Bundle outState) {
        int i = this.f1049;
        if (i != -100) {
            outState.putInt("appcompat:local_night_mode", i);
        }
    }

    @Override // ♫.AbstractC0301
    /* renamed from: ø  reason: contains not printable characters */
    public void m1364() {
        if (this.f1079) {
            this.f1060.getDecorView().removeCallbacks(this.f1052);
        }
        this.f1077 = true;
        AbstractC0292 r0 = this.f1068;
        if (r0 != null) {
            r0.m1293();
        }
        C0315 r02 = this.f1071;
        if (r02 != null) {
            r02.m1443();
        }
    }

    /* renamed from: ₧  reason: contains not printable characters */
    public final void m1422() {
        if (!this.f1048) {
            this.f1058 = m1388();
            CharSequence title = m1390();
            if (!TextUtils.isEmpty(title)) {
                AbstractC0450 r1 = this.f1075;
                if (r1 != null) {
                    r1.setWindowTitle(title);
                } else if (m1372() != null) {
                    m1372().m1295(title);
                } else {
                    TextView textView = this.f1062;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
            m1423();
            m1416();
            this.f1048 = true;
            C0318 st = m1392(0);
            if (this.f1077) {
                return;
            }
            if (st == null || st.f1124 == null) {
                m1356(C0291.AppCompatTheme_tooltipForegroundColor);
            }
        }
    }

    @Override // ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public final ViewGroup m1388() {
        Context themedContext;
        TypedArray a = this.f1054.obtainStyledAttributes(C0291.AppCompatTheme);
        if (a.hasValue(C0291.AppCompatTheme_windowActionBar)) {
            if (a.getBoolean(C0291.AppCompatTheme_windowNoTitle, false)) {
                m1408(1);
            } else if (a.getBoolean(C0291.AppCompatTheme_windowActionBar, false)) {
                m1408(C0291.AppCompatTheme_tooltipForegroundColor);
            }
            if (a.getBoolean(C0291.AppCompatTheme_windowActionBarOverlay, false)) {
                m1408(C0291.AppCompatTheme_tooltipFrameBackground);
            }
            if (a.getBoolean(C0291.AppCompatTheme_windowActionModeOverlay, false)) {
                m1408(10);
            }
            this.f1083 = a.getBoolean(C0291.AppCompatTheme_android_windowIsFloating, false);
            a.recycle();
            this.f1060.getDecorView();
            LayoutInflater inflater = LayoutInflater.from(this.f1054);
            ViewGroup subDecor = null;
            if (this.f1084) {
                if (this.f1081) {
                    subDecor = (ViewGroup) inflater.inflate(C0296.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
                } else {
                    subDecor = (ViewGroup) inflater.inflate(C0296.abc_screen_simple, (ViewGroup) null);
                }
                int i = Build.VERSION.SDK_INT;
                C0248.m1162(subDecor, new C0307());
            } else if (this.f1083) {
                subDecor = (ViewGroup) inflater.inflate(C0296.abc_dialog_title_material, (ViewGroup) null);
                this.f1086 = false;
                this.f1044 = false;
            } else if (this.f1044) {
                TypedValue outValue = new TypedValue();
                this.f1054.getTheme().resolveAttribute(C0158.actionBarTheme, outValue, true);
                int i2 = outValue.resourceId;
                if (i2 != 0) {
                    themedContext = new C0352(this.f1054, i2);
                } else {
                    themedContext = this.f1054;
                }
                subDecor = (ViewGroup) LayoutInflater.from(themedContext).inflate(C0296.abc_screen_toolbar, (ViewGroup) null);
                this.f1075 = (AbstractC0450) subDecor.findViewById(C0065.decor_content_parent);
                this.f1075.setWindowCallback(m1389());
                if (this.f1086) {
                    this.f1075.m2147(C0291.AppCompatTheme_tooltipFrameBackground);
                }
                if (this.f1045) {
                    this.f1075.m2147(2);
                }
                if (this.f1046) {
                    this.f1075.m2147(5);
                }
            }
            if (subDecor != null) {
                if (this.f1075 == null) {
                    this.f1062 = (TextView) subDecor.findViewById(C0065.title);
                }
                C0498.m2369((View) subDecor);
                ContentFrameLayout contentView = (ContentFrameLayout) subDecor.findViewById(C0065.action_bar_activity_content);
                ViewGroup windowContentView = (ViewGroup) this.f1060.findViewById(16908290);
                if (windowContentView != null) {
                    while (windowContentView.getChildCount() > 0) {
                        View child = windowContentView.getChildAt(0);
                        windowContentView.removeViewAt(0);
                        contentView.addView(child);
                    }
                    windowContentView.setId(-1);
                    contentView.setId(16908290);
                    if (windowContentView instanceof FrameLayout) {
                        ((FrameLayout) windowContentView).setForeground(null);
                    }
                }
                this.f1060.setContentView(subDecor);
                contentView.setAttachListener(new C0306());
                return subDecor;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1044 + ", windowActionBarOverlay: " + this.f1086 + ", android:windowIsFloating: " + this.f1083 + ", windowActionModeOverlay: " + this.f1081 + ", windowNoTitle: " + this.f1084 + " }");
        }
        a.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: ♫.业$ø  reason: contains not printable characters */
    public class C0307 implements AbstractC0208 {
        public C0307() {
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0070 m1429(View v, C0070 insets) {
            int top = insets.m334();
            int newTop = LayoutInflater$Factory2C0302.this.m1363(top);
            if (top != newTop) {
                insets = insets.m338(insets.m336(), newTop, insets.m335(), insets.m337());
            }
            return C0248.m1150(v, insets);
        }
    }

    /* renamed from: ♫.业$Ø  reason: contains not printable characters */
    public class C0305 implements AbstractC0456.AbstractC0457 {

        /* renamed from: θ  reason: contains not printable characters */
        public final /* synthetic */ LayoutInflater$Factory2C0302 f1089;

        /* renamed from: θ  reason: contains not printable characters */
        public void m1426(Rect insets) {
            insets.top = this.f1089.m1363(insets.top);
        }
    }

    /* renamed from: ♫.业$ö  reason: contains not printable characters */
    public class C0306 implements ContentFrameLayout.AbstractC0026 {
        public C0306() {
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1428() {
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public void m1427() {
            LayoutInflater$Factory2C0302.this.m1418();
        }
    }

    /* renamed from: А  reason: contains not printable characters */
    public void m1416() {
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public final void m1423() {
        ContentFrameLayout cfl = (ContentFrameLayout) this.f1058.findViewById(16908290);
        View windowDecor = this.f1060.getDecorView();
        cfl.m132(windowDecor.getPaddingLeft(), windowDecor.getPaddingTop(), windowDecor.getPaddingRight(), windowDecor.getPaddingBottom());
        TypedArray a = this.f1054.obtainStyledAttributes(C0291.AppCompatTheme);
        a.getValue(C0291.AppCompatTheme_windowMinWidthMajor, cfl.getMinWidthMajor());
        a.getValue(C0291.AppCompatTheme_windowMinWidthMinor, cfl.getMinWidthMinor());
        if (a.hasValue(C0291.AppCompatTheme_windowFixedWidthMajor)) {
            a.getValue(C0291.AppCompatTheme_windowFixedWidthMajor, cfl.getFixedWidthMajor());
        }
        if (a.hasValue(C0291.AppCompatTheme_windowFixedWidthMinor)) {
            a.getValue(C0291.AppCompatTheme_windowFixedWidthMinor, cfl.getFixedWidthMinor());
        }
        if (a.hasValue(C0291.AppCompatTheme_windowFixedHeightMajor)) {
            a.getValue(C0291.AppCompatTheme_windowFixedHeightMajor, cfl.getFixedHeightMajor());
        }
        if (a.hasValue(C0291.AppCompatTheme_windowFixedHeightMinor)) {
            a.getValue(C0291.AppCompatTheme_windowFixedHeightMinor, cfl.getFixedHeightMinor());
        }
        a.recycle();
        cfl.requestLayout();
    }

    @Override // ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1408(int featureId) {
        int featureId2 = m1371(featureId);
        if (this.f1084 && featureId2 == 108) {
            return false;
        }
        if (this.f1044 && featureId2 == 1) {
            this.f1044 = false;
        }
        if (featureId2 == 1) {
            m1417();
            this.f1084 = true;
            return true;
        } else if (featureId2 == 2) {
            m1417();
            this.f1045 = true;
            return true;
        } else if (featureId2 == 5) {
            m1417();
            this.f1046 = true;
            return true;
        } else if (featureId2 == 10) {
            m1417();
            this.f1081 = true;
            return true;
        } else if (featureId2 == 108) {
            m1417();
            this.f1044 = true;
            return true;
        } else if (featureId2 != 109) {
            return this.f1060.requestFeature(featureId2);
        } else {
            m1417();
            this.f1086 = true;
            return true;
        }
    }

    @Override // ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public final void m1402(CharSequence title) {
        this.f1065 = title;
        AbstractC0450 r0 = this.f1075;
        if (r0 != null) {
            r0.setWindowTitle(title);
        } else if (m1372() != null) {
            m1372().m1295(title);
        } else {
            TextView textView = this.f1062;
            if (textView != null) {
                textView.setText(title);
            }
        }
    }

    @Override // ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public final CharSequence m1390() {
        Window.Callback callback = this.f1059;
        if (callback instanceof Activity) {
            return ((Activity) callback).getTitle();
        }
        return this.f1065;
    }

    /* renamed from: µ  reason: contains not printable characters */
    public void m1354(int featureId) {
        if (featureId == 108) {
            AbstractC0292 ab = m1391();
            if (ab != null) {
                ab.m1296(false);
            }
        } else if (featureId == 0) {
            C0318 st = m1392(featureId);
            if (st.f1114) {
                m1404(st, false);
            }
        }
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m1360(int featureId) {
        AbstractC0292 ab;
        if (featureId == 108 && (ab = m1391()) != null) {
            ab.m1296(true);
        }
    }

    @Override // ♫.C0375.AbstractC0377
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1415(C0375 menu, MenuItem item) {
        C0318 panel;
        Window.Callback cb = m1389();
        if (cb == null || this.f1077 || (panel = m1393((Menu) menu.m1799())) == null) {
            return false;
        }
        return cb.onMenuItemSelected(panel.f1118, item);
    }

    @Override // ♫.C0375.AbstractC0377
    /* renamed from: θ  reason: contains not printable characters */
    public void m1405(C0375 menu) {
        m1406(true);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0349 m1394(AbstractC0349.AbstractC0350 callback) {
        AbstractC0300 r3;
        if (callback != null) {
            AbstractC0349 r0 = this.f1074;
            if (r0 != null) {
                r0.m1633();
            }
            AbstractC0349.AbstractC0350 wrappedCallback = new C0312(callback);
            AbstractC0292 ab = m1391();
            if (ab != null) {
                this.f1074 = ab.m1292(wrappedCallback);
                AbstractC0349 r2 = this.f1074;
                if (!(r2 == null || (r3 = this.f1069) == null)) {
                    r3.m1327(r2);
                }
            }
            if (this.f1074 == null) {
                this.f1074 = m1373(wrappedCallback);
            }
            return this.f1074;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    @Override // ♫.AbstractC0301
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1374() {
        AbstractC0292 ab = m1391();
        if (ab != null) {
            ab.m1287();
        }
        m1356(0);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public AbstractC0349 m1373(AbstractC0349.AbstractC0350 callback) {
        AbstractC0300 r2;
        Context actionBarContext;
        m1420();
        AbstractC0349 r0 = this.f1074;
        if (r0 != null) {
            r0.m1633();
        }
        if (!(callback instanceof C0312)) {
            callback = new C0312(callback);
        }
        AbstractC0349 mode = null;
        AbstractC0300 r1 = this.f1069;
        if (r1 != null && !this.f1077) {
            try {
                mode = r1.m1328(callback);
            } catch (AbstractMethodError e) {
            }
        }
        if (mode != null) {
            this.f1074 = mode;
        } else {
            boolean z = true;
            if (this.f1064 == null) {
                if (this.f1083) {
                    TypedValue outValue = new TypedValue();
                    Resources.Theme baseTheme = this.f1054.getTheme();
                    baseTheme.resolveAttribute(C0158.actionBarTheme, outValue, true);
                    if (outValue.resourceId != 0) {
                        Resources.Theme actionBarTheme = this.f1054.getResources().newTheme();
                        actionBarTheme.setTo(baseTheme);
                        actionBarTheme.applyStyle(outValue.resourceId, true);
                        C0352 r7 = new C0352(this.f1054, 0);
                        r7.getTheme().setTo(actionBarTheme);
                        actionBarContext = r7;
                    } else {
                        actionBarContext = this.f1054;
                    }
                    this.f1064 = new ActionBarContextView(actionBarContext);
                    this.f1061 = new PopupWindow(actionBarContext, (AttributeSet) null, C0158.actionModePopupWindowStyle);
                    C0247.m1135(this.f1061, 2);
                    this.f1061.setContentView(this.f1064);
                    this.f1061.setWidth(-1);
                    actionBarContext.getTheme().resolveAttribute(C0158.actionBarSize, outValue, true);
                    this.f1064.setContentHeight(TypedValue.complexToDimensionPixelSize(outValue.data, actionBarContext.getResources().getDisplayMetrics()));
                    this.f1061.setHeight(-2);
                    this.f1066 = new RunnableC0303();
                } else {
                    ViewStubCompat stub = (ViewStubCompat) this.f1058.findViewById(C0065.action_mode_bar_stub);
                    if (stub != null) {
                        stub.setLayoutInflater(LayoutInflater.from(m1384()));
                        this.f1064 = (ActionBarContextView) stub.m233();
                    }
                }
            }
            if (this.f1064 != null) {
                m1420();
                this.f1064.m72();
                Context context = this.f1064.getContext();
                ActionBarContextView actionBarContextView = this.f1064;
                if (this.f1061 != null) {
                    z = false;
                }
                C0353 r12 = new C0353(context, actionBarContextView, callback, z);
                if (callback.m1642(r12, r12.m1655())) {
                    r12.m1651();
                    this.f1064.m76(r12);
                    this.f1074 = r12;
                    if (m1357()) {
                        this.f1064.setAlpha(0.0f);
                        C0258 r13 = C0248.m1151((View) this.f1064);
                        r13.m1189(1.0f);
                        this.f1067 = r13;
                        this.f1067.m1193(new C0317());
                    } else {
                        this.f1064.setAlpha(1.0f);
                        this.f1064.setVisibility(0);
                        this.f1064.sendAccessibilityEvent(32);
                        if (this.f1064.getParent() instanceof View) {
                            C0248.m1143((View) this.f1064.getParent());
                        }
                    }
                    if (this.f1061 != null) {
                        this.f1060.getDecorView().post(this.f1066);
                    }
                } else {
                    this.f1074 = null;
                }
            }
        }
        AbstractC0349 r14 = this.f1074;
        if (!(r14 == null || (r2 = this.f1069) == null)) {
            r2.m1327(r14);
        }
        return this.f1074;
    }

    /* renamed from: ♫.业$µ  reason: contains not printable characters */
    public class RunnableC0303 implements Runnable {
        public RunnableC0303() {
        }

        public void run() {
            LayoutInflater$Factory2C0302 r0 = LayoutInflater$Factory2C0302.this;
            r0.f1061.showAtLocation(r0.f1064, 55, 0, 0);
            LayoutInflater$Factory2C0302.this.m1420();
            if (LayoutInflater$Factory2C0302.this.m1357()) {
                LayoutInflater$Factory2C0302.this.f1064.setAlpha(0.0f);
                LayoutInflater$Factory2C0302 r02 = LayoutInflater$Factory2C0302.this;
                C0258 r2 = C0248.m1151((View) r02.f1064);
                r2.m1189(1.0f);
                r02.f1067 = r2;
                LayoutInflater$Factory2C0302.this.f1067.m1193(new C0304());
                return;
            }
            LayoutInflater$Factory2C0302.this.f1064.setAlpha(1.0f);
            LayoutInflater$Factory2C0302.this.f1064.setVisibility(0);
        }

        /* renamed from: ♫.业$µ$θ  reason: contains not printable characters */
        public class C0304 extends C0608 {
            public C0304() {
            }

            @Override // ♫.AbstractC0271, ♫.C0608
            /* renamed from: ø  reason: contains not printable characters */
            public void m1424(View view) {
                LayoutInflater$Factory2C0302.this.f1064.setVisibility(0);
            }

            @Override // ♫.AbstractC0271
            /* renamed from: θ  reason: contains not printable characters */
            public void m1425(View view) {
                LayoutInflater$Factory2C0302.this.f1064.setAlpha(1.0f);
                LayoutInflater$Factory2C0302.this.f1067.m1193((AbstractC0271) null);
                LayoutInflater$Factory2C0302.this.f1067 = null;
            }
        }
    }

    /* renamed from: ♫.业$₩  reason: contains not printable characters */
    public class C0317 extends C0608 {
        public C0317() {
        }

        @Override // ♫.AbstractC0271, ♫.C0608
        /* renamed from: ø  reason: contains not printable characters */
        public void m1444(View view) {
            LayoutInflater$Factory2C0302.this.f1064.setVisibility(0);
            LayoutInflater$Factory2C0302.this.f1064.sendAccessibilityEvent(32);
            if (LayoutInflater$Factory2C0302.this.f1064.getParent() instanceof View) {
                C0248.m1143((View) LayoutInflater$Factory2C0302.this.f1064.getParent());
            }
        }

        @Override // ♫.AbstractC0271
        /* renamed from: θ  reason: contains not printable characters */
        public void m1445(View view) {
            LayoutInflater$Factory2C0302.this.f1064.setAlpha(1.0f);
            LayoutInflater$Factory2C0302.this.f1067.m1193((AbstractC0271) null);
            LayoutInflater$Factory2C0302.this.f1067 = null;
        }
    }

    @Override // ♫.AbstractC0301
    /* renamed from: Ø  reason: contains not printable characters */
    public final boolean m1357() {
        ViewGroup viewGroup;
        return this.f1048 && (viewGroup = this.f1058) != null && C0248.m1138(viewGroup);
    }

    @Override // ♫.AbstractC0301
    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1379() {
        return this.f1053;
    }

    /* renamed from: ₣  reason: contains not printable characters */
    public void m1420() {
        C0258 r0 = this.f1067;
        if (r0 != null) {
            r0.m1194();
        }
    }

    @Override // ♫.AbstractC0301
    /* renamed from: ø  reason: contains not printable characters */
    public boolean m1367() {
        AbstractC0349 r0 = this.f1074;
        if (r0 != null) {
            r0.m1633();
            return true;
        }
        AbstractC0292 ab = m1391();
        if (ab == null || !ab.m1289()) {
            return false;
        }
        return true;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m1368(int keyCode, KeyEvent ev) {
        AbstractC0292 ab = m1391();
        if (ab != null && ab.m1298(keyCode, ev)) {
            return true;
        }
        C0318 r2 = this.f1072;
        if (r2 == null || !m1413(r2, ev.getKeyCode(), ev, 1)) {
            if (this.f1072 == null) {
                C0318 st = m1392(0);
                m1414(st, ev);
                boolean handled = m1413(st, ev.getKeyCode(), ev, 1);
                st.f1125 = false;
                if (handled) {
                    return true;
                }
            }
            return false;
        }
        C0318 r3 = this.f1072;
        if (r3 != null) {
            r3.f1117 = true;
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1410(KeyEvent event) {
        View root;
        Window.Callback callback = this.f1059;
        boolean isDown = true;
        if (((callback instanceof C0195.AbstractC0196) || (callback instanceof DialogC0320)) && (root = this.f1060.getDecorView()) != null && C0195.m927(root, event)) {
            return true;
        }
        if (event.getKeyCode() == 82 && this.f1059.dispatchKeyEvent(event)) {
            return true;
        }
        int keyCode = event.getKeyCode();
        if (event.getAction() != 0) {
            isDown = false;
        }
        return isDown ? m1409(keyCode, event) : m1358(keyCode, event);
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m1358(int keyCode, KeyEvent event) {
        if (keyCode == 4) {
            boolean wasLongPressBackDown = this.f1082;
            this.f1082 = false;
            C0318 st = m1392(0);
            if (st != null && st.f1114) {
                if (!wasLongPressBackDown) {
                    m1404(st, true);
                }
                return true;
            } else if (m1367()) {
                return true;
            }
        } else if (keyCode == 82) {
            m1362(0, event);
            return true;
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1409(int keyCode, KeyEvent event) {
        boolean z = true;
        if (keyCode == 4) {
            if ((event.getFlags() & 128) == 0) {
                z = false;
            }
            this.f1082 = z;
        } else if (keyCode == 82) {
            m1381(0, event);
            return true;
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public View m1387(View parent, String name, Context context, AttributeSet attrs) {
        boolean z = false;
        if (this.f1063 == null) {
            String viewInflaterClassName = this.f1054.obtainStyledAttributes(C0291.AppCompatTheme).getString(C0291.AppCompatTheme_viewInflaterClass);
            if (viewInflaterClassName == null || AppCompatViewInflater.class.getName().equals(viewInflaterClassName)) {
                this.f1063 = new AppCompatViewInflater();
            } else {
                try {
                    this.f1063 = (AppCompatViewInflater) Class.forName(viewInflaterClassName).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable t) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + viewInflaterClassName + ". Falling back to default.", t);
                    this.f1063 = new AppCompatViewInflater();
                }
            }
        }
        boolean inheritContext = false;
        if (f1042) {
            if (!(attrs instanceof XmlPullParser)) {
                z = m1411((ViewParent) parent);
            } else if (((XmlPullParser) attrs).getDepth() > 1) {
                z = true;
            }
            inheritContext = z;
        }
        AppCompatViewInflater appCompatViewInflater = this.f1063;
        boolean z2 = f1042;
        C0497.m2367();
        return appCompatViewInflater.m33(parent, name, context, attrs, inheritContext, z2, true, false);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m1411(ViewParent parent) {
        if (parent == null) {
            return false;
        }
        View windowDecor = this.f1060.getDecorView();
        while (parent != null) {
            if (parent == windowDecor || !(parent instanceof View) || C0248.m1141((View) parent)) {
                return false;
            }
            parent = parent.getParent();
        }
        return true;
    }

    @Override // ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public void m1395() {
        LayoutInflater layoutInflater = LayoutInflater.from(this.f1054);
        if (layoutInflater.getFactory() == null) {
            C0199.m934(layoutInflater, this);
        } else if (!(layoutInflater.getFactory2() instanceof LayoutInflater$Factory2C0302)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return m1387(parent, name, context, attrs);
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1403(C0318 st, KeyEvent event) {
        ViewGroup.LayoutParams lp;
        if (!st.f1114 && !this.f1077) {
            if (st.f1118 == 0) {
                if ((this.f1054.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback cb = m1389();
            if (cb == null || cb.onMenuOpened(st.f1118, st.f1124)) {
                WindowManager wm = (WindowManager) this.f1054.getSystemService("window");
                if (wm != null && m1414(st, event)) {
                    int width = -2;
                    if (st.f1122 == null || st.f1112) {
                        ViewGroup viewGroup = st.f1122;
                        if (viewGroup == null) {
                            m1382(st);
                            if (st.f1122 == null) {
                                return;
                            }
                        } else if (st.f1112 && viewGroup.getChildCount() > 0) {
                            st.f1122.removeAllViews();
                        }
                        if (m1412(st) && st.m1449()) {
                            ViewGroup.LayoutParams lp2 = st.f1121.getLayoutParams();
                            if (lp2 == null) {
                                lp2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            st.f1122.setBackgroundResource(st.f1115);
                            ViewParent shownPanelParent = st.f1121.getParent();
                            if (shownPanelParent != null && (shownPanelParent instanceof ViewGroup)) {
                                ((ViewGroup) shownPanelParent).removeView(st.f1121);
                            }
                            st.f1122.addView(st.f1121, lp2);
                            if (!st.f1121.hasFocus()) {
                                st.f1121.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else {
                        View view = st.f1116;
                        if (!(view == null || (lp = view.getLayoutParams()) == null || lp.width != -1)) {
                            width = -1;
                        }
                    }
                    st.f1117 = false;
                    WindowManager.LayoutParams lp3 = new WindowManager.LayoutParams(width, -2, st.f1109, st.f1111, 1002, 8519680, -3);
                    lp3.gravity = st.f1113;
                    lp3.windowAnimations = st.f1107;
                    wm.addView(st.f1122, lp3);
                    st.f1114 = true;
                    return;
                }
                return;
            }
            m1404(st, true);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean m1382(C0318 st) {
        st.m1447(m1384());
        st.f1122 = new C0311(st.f1119);
        st.f1113 = 81;
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m1406(boolean toggleMenuMode) {
        AbstractC0450 r0 = this.f1075;
        if (r0 == null || !r0.m2149() || (ViewConfiguration.get(this.f1054).hasPermanentMenuKey() && !this.f1075.m2142())) {
            C0318 st = m1392(0);
            st.f1112 = true;
            m1404(st, false);
            m1403(st, (KeyEvent) null);
            return;
        }
        Window.Callback cb = m1389();
        if (this.f1075.m2145() && toggleMenuMode) {
            this.f1075.m2143();
            if (!this.f1077) {
                cb.onPanelClosed(C0291.AppCompatTheme_tooltipForegroundColor, m1392(0).f1124);
            }
        } else if (cb != null && !this.f1077) {
            if (this.f1079 && (1 & this.f1047) != 0) {
                this.f1060.getDecorView().removeCallbacks(this.f1052);
                this.f1052.run();
            }
            C0318 st2 = m1392(0);
            C0375 r3 = st2.f1124;
            if (r3 != null && !st2.f1108 && cb.onPreparePanel(0, st2.f1116, r3)) {
                cb.onMenuOpened(C0291.AppCompatTheme_tooltipForegroundColor, st2.f1124);
                this.f1075.m2141();
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0053 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v2, types: [♫.俊] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ø  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m1369(♫.LayoutInflater$Factory2C0302.C0318 r8) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: ♫.LayoutInflater$Factory2C0302.m1369(♫.业$一):boolean");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m1412(C0318 st) {
        View view = st.f1116;
        if (view != null) {
            st.f1121 = view;
            return true;
        } else if (st.f1124 == null) {
            return false;
        } else {
            if (this.f1073 == null) {
                this.f1073 = new C0319();
            }
            st.f1121 = (View) st.m1446(this.f1073);
            if (st.f1121 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m1414(C0318 st, KeyEvent event) {
        AbstractC0450 r2;
        AbstractC0450 r22;
        AbstractC0450 r4;
        if (this.f1077) {
            return false;
        }
        if (st.f1125) {
            return true;
        }
        C0318 r0 = this.f1072;
        if (!(r0 == null || r0 == st)) {
            m1404(r0, false);
        }
        Window.Callback cb = m1389();
        if (cb != null) {
            st.f1116 = cb.onCreatePanelView(st.f1118);
        }
        int i = st.f1118;
        boolean isActionBarMenu = i == 0 || i == 108;
        if (isActionBarMenu && (r4 = this.f1075) != null) {
            r4.m2146();
        }
        if (st.f1116 == null) {
            if (isActionBarMenu) {
                m1372();
            }
            if (st.f1124 == null || st.f1108) {
                if (st.f1124 == null) {
                    m1369(st);
                    if (st.f1124 == null) {
                        return false;
                    }
                }
                if (isActionBarMenu && this.f1075 != null) {
                    if (this.f1070 == null) {
                        this.f1070 = new C0310();
                    }
                    this.f1075.m2148(st.f1124, this.f1070);
                }
                st.f1124.m1769();
                if (!cb.onCreatePanelMenu(st.f1118, st.f1124)) {
                    st.m1448((C0375) null);
                    if (isActionBarMenu && (r22 = this.f1075) != null) {
                        r22.m2148(null, this.f1070);
                    }
                    return false;
                }
                st.f1108 = false;
            }
            st.f1124.m1769();
            Bundle bundle = st.f1120;
            if (bundle != null) {
                st.f1124.m1810(bundle);
                st.f1120 = null;
            }
            if (!cb.onPreparePanel(0, st.f1116, st.f1124)) {
                if (isActionBarMenu && (r2 = this.f1075) != null) {
                    r2.m2148(null, this.f1070);
                }
                st.f1124.m1773();
                return false;
            }
            st.f1110 = KeyCharacterMap.load(event != null ? event.getDeviceId() : -1).getKeyboardType() != 1;
            st.f1124.setQwertyMode(st.f1110);
            st.f1124.m1773();
        }
        st.f1125 = true;
        st.f1117 = false;
        this.f1072 = st;
        return true;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m1378(C0375 menu) {
        if (!this.f1085) {
            this.f1085 = true;
            this.f1075.m2144();
            Window.Callback cb = m1389();
            if (cb != null && !this.f1077) {
                cb.onPanelClosed(C0291.AppCompatTheme_tooltipForegroundColor, menu);
            }
            this.f1085 = false;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m1375(int featureId) {
        m1404(m1392(featureId), true);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1404(C0318 st, boolean doCallback) {
        ViewGroup viewGroup;
        AbstractC0450 r0;
        if (!doCallback || st.f1118 != 0 || (r0 = this.f1075) == null || !r0.m2145()) {
            WindowManager wm = (WindowManager) this.f1054.getSystemService("window");
            if (!(wm == null || !st.f1114 || (viewGroup = st.f1122) == null)) {
                wm.removeView(viewGroup);
                if (doCallback) {
                    m1397(st.f1118, st, null);
                }
            }
            st.f1125 = false;
            st.f1117 = false;
            st.f1114 = false;
            st.f1121 = null;
            st.f1112 = true;
            if (this.f1072 == st) {
                this.f1072 = null;
                return;
            }
            return;
        }
        m1378(st.f1124);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean m1381(int featureId, KeyEvent event) {
        if (event.getRepeatCount() != 0) {
            return false;
        }
        C0318 st = m1392(featureId);
        if (!st.f1114) {
            return m1414(st, event);
        }
        return false;
    }

    /* renamed from: ö  reason: contains not printable characters */
    public final boolean m1362(int featureId, KeyEvent event) {
        AbstractC0450 r3;
        if (this.f1074 != null) {
            return false;
        }
        boolean handled = false;
        C0318 st = m1392(featureId);
        if (featureId != 0 || (r3 = this.f1075) == null || !r3.m2149() || ViewConfiguration.get(this.f1054).hasPermanentMenuKey()) {
            if (st.f1114 || st.f1117) {
                handled = st.f1114;
                m1404(st, true);
            } else if (st.f1125) {
                boolean show = true;
                if (st.f1108) {
                    st.f1125 = false;
                    show = m1414(st, event);
                }
                if (show) {
                    m1403(st, event);
                    handled = true;
                }
            }
        } else if (this.f1075.m2145()) {
            handled = this.f1075.m2143();
        } else if (!this.f1077 && m1414(st, event)) {
            handled = this.f1075.m2141();
        }
        if (handled) {
            AudioManager audioManager = (AudioManager) this.f1054.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return handled;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1397(int featureId, C0318 panel, Menu menu) {
        if (menu == null) {
            if (panel == null && featureId >= 0) {
                C0318[] r0 = this.f1076;
                if (featureId < r0.length) {
                    panel = r0[featureId];
                }
            }
            if (panel != null) {
                menu = panel.f1124;
            }
        }
        if ((panel == null || panel.f1114) && !this.f1077) {
            this.f1059.onPanelClosed(featureId, menu);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0318 m1393(Menu menu) {
        C0318[] panels = this.f1076;
        int N = panels != null ? panels.length : 0;
        for (int i = 0; i < N; i++) {
            C0318 panel = panels[i];
            if (panel != null && panel.f1124 == menu) {
                return panel;
            }
        }
        return null;
    }

    /* JADX INFO: Multiple debug info for r0v1 ♫.业$一: [D('st' ♫.业$一), D('nar' ♫.业$一[])] */
    @Override // ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public C0318 m1392(int featureId) {
        C0318[] r0 = this.f1076;
        C0318[] ar = r0;
        if (r0 == null || ar.length <= featureId) {
            C0318[] nar = new C0318[(featureId + 1)];
            if (ar != null) {
                System.arraycopy(ar, 0, nar, 0, ar.length);
            }
            ar = nar;
            this.f1076 = nar;
        }
        C0318 st = ar[featureId];
        if (st != null) {
            return st;
        }
        C0318 st2 = new C0318(featureId);
        ar[featureId] = st2;
        return st2;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m1413(C0318 st, int keyCode, KeyEvent event, int flags) {
        C0375 r1;
        if (event.isSystem()) {
            return false;
        }
        boolean handled = false;
        if ((st.f1125 || m1414(st, event)) && (r1 = st.f1124) != null) {
            handled = r1.performShortcut(keyCode, event, flags);
        }
        if (handled && (flags & 1) == 0 && this.f1075 == null) {
            m1404(st, true);
        }
        return handled;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public final void m1356(int featureId) {
        this.f1047 |= 1 << featureId;
        if (!this.f1079) {
            C0248.m1158(this.f1060.getDecorView(), this.f1052);
            this.f1079 = true;
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m1365(int featureId) {
        C0318 st;
        C0318 st2 = m1392(featureId);
        if (st2.f1124 != null) {
            Bundle savedActionViewStates = new Bundle();
            st2.f1124.m1784(savedActionViewStates);
            if (savedActionViewStates.size() > 0) {
                st2.f1120 = savedActionViewStates;
            }
            st2.f1124.m1769();
            st2.f1124.clear();
        }
        st2.f1108 = true;
        st2.f1112 = true;
        if ((featureId == 108 || featureId == 0) && this.f1075 != null && (st = m1392(0)) != null) {
            st.f1125 = false;
            m1414(st, (KeyEvent) null);
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public int m1363(int insetTop) {
        boolean showStatusGuard = false;
        ActionBarContextView actionBarContextView = this.f1064;
        int i = 0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams mlp = (ViewGroup.MarginLayoutParams) this.f1064.getLayoutParams();
            boolean mlpChanged = false;
            if (this.f1064.isShown()) {
                if (this.f1055 == null) {
                    this.f1055 = new Rect();
                    this.f1050 = new Rect();
                }
                Rect insets = this.f1055;
                Rect localInsets = this.f1050;
                insets.set(0, insetTop, 0, 0);
                C0498.m2370(this.f1058, insets, localInsets);
                if (mlp.topMargin != (localInsets.top == 0 ? insetTop : 0)) {
                    mlpChanged = true;
                    mlp.topMargin = insetTop;
                    View view = this.f1057;
                    if (view == null) {
                        this.f1057 = new View(this.f1054);
                        this.f1057.setBackgroundColor(this.f1054.getResources().getColor(C0068.abc_input_method_navigation_guard));
                        this.f1058.addView(this.f1057, -1, new ViewGroup.LayoutParams(-1, insetTop));
                    } else {
                        ViewGroup.LayoutParams lp = view.getLayoutParams();
                        if (lp.height != insetTop) {
                            lp.height = insetTop;
                            this.f1057.setLayoutParams(lp);
                        }
                    }
                }
                showStatusGuard = this.f1057 != null;
                if (!this.f1081 && showStatusGuard) {
                    insetTop = 0;
                }
            } else if (mlp.topMargin != 0) {
                mlpChanged = true;
                mlp.topMargin = 0;
            }
            if (mlpChanged) {
                this.f1064.setLayoutParams(mlp);
            }
        }
        View view2 = this.f1057;
        if (view2 != null) {
            if (!showStatusGuard) {
                i = 8;
            }
            view2.setVisibility(i);
        }
        return insetTop;
    }

    /* renamed from: Б  reason: contains not printable characters */
    public final void m1417() {
        if (this.f1048) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final int m1371(int featureId) {
        if (featureId == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return C0291.AppCompatTheme_tooltipForegroundColor;
        } else if (featureId != 9) {
            return featureId;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return C0291.AppCompatTheme_tooltipFrameBackground;
        }
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public void m1418() {
        C0375 r1;
        AbstractC0450 r0 = this.f1075;
        if (r0 != null) {
            r0.m2144();
        }
        if (this.f1061 != null) {
            this.f1060.getDecorView().removeCallbacks(this.f1066);
            if (this.f1061.isShowing()) {
                try {
                    this.f1061.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.f1061 = null;
        }
        m1420();
        C0318 st = m1392(0);
        if (st != null && (r1 = st.f1124) != null) {
            r1.close();
        }
    }

    @Override // ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1407() {
        boolean applied = false;
        int nightMode = m1370();
        int modeToApply = m1383(nightMode);
        if (modeToApply != -1) {
            applied = m1380(modeToApply);
        }
        if (nightMode == 0) {
            m1421();
            this.f1071.m1440();
        }
        this.f1078 = true;
        return applied;
    }

    @Override // ♫.AbstractC0301, ♫.AbstractC0301, ♫.AbstractC0301
    /* renamed from: θ  reason: contains not printable characters */
    public int m1383(int mode) {
        if (mode == -100) {
            return -1;
        }
        if (mode != 0) {
            return mode;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f1054.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        m1421();
        return this.f1071.m1442();
    }

    @Override // ♫.AbstractC0301
    /* renamed from: Φ  reason: contains not printable characters */
    public final int m1370() {
        int i = this.f1049;
        return i != -100 ? i : AbstractC0301.m1330();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final boolean m1380(int mode) {
        Resources res = this.f1054.getResources();
        Configuration conf = res.getConfiguration();
        int currentNightMode = conf.uiMode & 48;
        int newNightMode = mode == 2 ? 32 : 16;
        if (currentNightMode == newNightMode) {
            return false;
        }
        if (m1361()) {
            ((Activity) this.f1054).recreate();
            return true;
        }
        Configuration config = new Configuration(conf);
        DisplayMetrics metrics = res.getDisplayMetrics();
        config.uiMode = (config.uiMode & -49) | newNightMode;
        res.updateConfiguration(config, metrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        C0322.m1463(res);
        return true;
    }

    /* renamed from: ₤  reason: contains not printable characters */
    public final void m1421() {
        if (this.f1071 == null) {
            this.f1071 = new C0315(C0324.m1467(this.f1054));
        }
    }

    @Override // ♫.AbstractC0301
    /* renamed from: ö  reason: contains not printable characters */
    public final boolean m1361() {
        if (this.f1078) {
            Context context = this.f1054;
            if (context instanceof Activity) {
                try {
                    if ((context.getPackageManager().getActivityInfo(new ComponentName(this.f1054, this.f1054.getClass()), 0).configChanges & 512) == 0) {
                        return true;
                    }
                    return false;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ♫.业$₣  reason: contains not printable characters */
    public class C0312 implements AbstractC0349.AbstractC0350 {

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public AbstractC0349.AbstractC0350 f1097;

        public C0312(AbstractC0349.AbstractC0350 wrapped) {
            this.f1097 = wrapped;
        }

        @Override // ♫.AbstractC0349.AbstractC0350
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1436(AbstractC0349 mode, Menu menu) {
            return this.f1097.m1642(mode, menu);
        }

        @Override // ♫.AbstractC0349.AbstractC0350
        /* renamed from: Φ  reason: contains not printable characters */
        public boolean m1434(AbstractC0349 mode, Menu menu) {
            return this.f1097.m1640(mode, menu);
        }

        @Override // ♫.AbstractC0349.AbstractC0350
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1437(AbstractC0349 mode, MenuItem item) {
            return this.f1097.m1643(mode, item);
        }

        @Override // ♫.AbstractC0349.AbstractC0350
        /* renamed from: θ  reason: contains not printable characters */
        public void m1435(AbstractC0349 mode) {
            this.f1097.m1641(mode);
            LayoutInflater$Factory2C0302 r0 = LayoutInflater$Factory2C0302.this;
            if (r0.f1061 != null) {
                r0.f1060.getDecorView().removeCallbacks(LayoutInflater$Factory2C0302.this.f1066);
            }
            LayoutInflater$Factory2C0302 r02 = LayoutInflater$Factory2C0302.this;
            if (r02.f1064 != null) {
                r02.m1420();
                LayoutInflater$Factory2C0302 r03 = LayoutInflater$Factory2C0302.this;
                C0258 r1 = C0248.m1151((View) r03.f1064);
                r1.m1189(0.0f);
                r03.f1067 = r1;
                LayoutInflater$Factory2C0302.this.f1067.m1193(new C0313());
            }
            LayoutInflater$Factory2C0302 r04 = LayoutInflater$Factory2C0302.this;
            AbstractC0300 r12 = r04.f1069;
            if (r12 != null) {
                r12.m1329(r04.f1074);
            }
            LayoutInflater$Factory2C0302.this.f1074 = null;
        }

        /* renamed from: ♫.业$₣$θ  reason: contains not printable characters */
        public class C0313 extends C0608 {
            public C0313() {
            }

            @Override // ♫.AbstractC0271
            /* renamed from: θ  reason: contains not printable characters */
            public void m1438(View view) {
                LayoutInflater$Factory2C0302.this.f1064.setVisibility(8);
                LayoutInflater$Factory2C0302 r0 = LayoutInflater$Factory2C0302.this;
                PopupWindow popupWindow = r0.f1061;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (r0.f1064.getParent() instanceof View) {
                    C0248.m1143((View) LayoutInflater$Factory2C0302.this.f1064.getParent());
                }
                LayoutInflater$Factory2C0302.this.f1064.removeAllViews();
                LayoutInflater$Factory2C0302.this.f1067.m1193((AbstractC0271) null);
                LayoutInflater$Factory2C0302.this.f1067 = null;
            }
        }
    }

    /* renamed from: ♫.业$上  reason: contains not printable characters */
    public final class C0319 implements AbstractC0392.AbstractC0393 {
        public C0319() {
        }

        @Override // ♫.AbstractC0392.AbstractC0393
        /* renamed from: θ  reason: contains not printable characters */
        public void m1450(C0375 menu, boolean allMenusAreClosing) {
            Menu parentMenu = menu.m1799();
            boolean isSubMenu = parentMenu != menu;
            C0318 panel = LayoutInflater$Factory2C0302.this.m1393(isSubMenu ? parentMenu : menu);
            if (panel == null) {
                return;
            }
            if (isSubMenu) {
                LayoutInflater$Factory2C0302.this.m1397(panel.f1118, panel, parentMenu);
                LayoutInflater$Factory2C0302.this.m1404(panel, true);
                return;
            }
            LayoutInflater$Factory2C0302.this.m1404(panel, allMenusAreClosing);
        }

        @Override // ♫.AbstractC0392.AbstractC0393
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1451(C0375 subMenu) {
            Window.Callback cb;
            if (subMenu != null) {
                return true;
            }
            LayoutInflater$Factory2C0302 r0 = LayoutInflater$Factory2C0302.this;
            if (!r0.f1044 || (cb = r0.m1389()) == null || LayoutInflater$Factory2C0302.this.f1077) {
                return true;
            }
            cb.onMenuOpened(C0291.AppCompatTheme_tooltipForegroundColor, subMenu);
            return true;
        }
    }

    /* renamed from: ♫.业$฿  reason: contains not printable characters */
    public final class C0310 implements AbstractC0392.AbstractC0393 {
        public C0310() {
        }

        @Override // ♫.AbstractC0392.AbstractC0393
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1432(C0375 subMenu) {
            Window.Callback cb = LayoutInflater$Factory2C0302.this.m1389();
            if (cb == null) {
                return true;
            }
            cb.onMenuOpened(C0291.AppCompatTheme_tooltipForegroundColor, subMenu);
            return true;
        }

        @Override // ♫.AbstractC0392.AbstractC0393
        /* renamed from: θ  reason: contains not printable characters */
        public void m1431(C0375 menu, boolean allMenusAreClosing) {
            LayoutInflater$Factory2C0302.this.m1378(menu);
        }
    }

    /* renamed from: ♫.业$一  reason: contains not printable characters */
    public static final class C0318 {

        /* renamed from: µ  reason: contains not printable characters */
        public int f1107;

        /* renamed from: µ  reason: contains not printable characters and collision with other field name */
        public boolean f1108;

        /* renamed from: Ø  reason: contains not printable characters */
        public int f1109;

        /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
        public boolean f1110;

        /* renamed from: ö  reason: contains not printable characters */
        public int f1111;

        /* renamed from: ö  reason: contains not printable characters and collision with other field name */
        public boolean f1112 = false;

        /* renamed from: ø  reason: contains not printable characters */
        public int f1113;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public boolean f1114;

        /* renamed from: Φ  reason: contains not printable characters */
        public int f1115;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public View f1116;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public boolean f1117;

        /* renamed from: θ  reason: contains not printable characters */
        public int f1118;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Context f1119;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Bundle f1120;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public View f1121;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public ViewGroup f1122;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0372 f1123;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0375 f1124;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f1125;

        public C0318(int featureId) {
            this.f1118 = featureId;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public boolean m1449() {
            if (this.f1121 == null) {
                return false;
            }
            if (this.f1116 == null && this.f1123.m1752().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1447(Context context) {
            TypedValue outValue = new TypedValue();
            Resources.Theme widgetTheme = context.getResources().newTheme();
            widgetTheme.setTo(context.getTheme());
            widgetTheme.resolveAttribute(C0158.actionBarPopupTheme, outValue, true);
            int i = outValue.resourceId;
            if (i != 0) {
                widgetTheme.applyStyle(i, true);
            }
            widgetTheme.resolveAttribute(C0158.panelMenuListTheme, outValue, true);
            int i2 = outValue.resourceId;
            if (i2 != 0) {
                widgetTheme.applyStyle(i2, true);
            } else {
                widgetTheme.applyStyle(C0290.Theme_AppCompat_CompactMenu, true);
            }
            C0352 r2 = new C0352(context, 0);
            r2.getTheme().setTo(widgetTheme);
            this.f1119 = r2;
            TypedArray a = r2.obtainStyledAttributes(C0291.AppCompatTheme);
            this.f1115 = a.getResourceId(C0291.AppCompatTheme_panelBackground, 0);
            this.f1107 = a.getResourceId(C0291.AppCompatTheme_android_windowAnimationStyle, 0);
            a.recycle();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1448(C0375 menu) {
            C0372 r0;
            C0375 r02 = this.f1124;
            if (menu != r02) {
                if (r02 != null) {
                    r02.m1785(this.f1123);
                }
                this.f1124 = menu;
                if (menu != null && (r0 = this.f1123) != null) {
                    menu.m1814(r0);
                }
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public AbstractC0394 m1446(AbstractC0392.AbstractC0393 cb) {
            if (this.f1124 == null) {
                return null;
            }
            if (this.f1123 == null) {
                this.f1123 = new C0372(this.f1119, C0296.abc_list_menu_item_layout);
                this.f1123.m1756(cb);
                this.f1124.m1814(this.f1123);
            }
            return this.f1123.m1753(this.f1122);
        }
    }

    /* renamed from: ♫.业$₢  reason: contains not printable characters */
    public class C0311 extends ContentFrameLayout {
        public C0311(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent event) {
            return LayoutInflater$Factory2C0302.this.m1410(event) || super.dispatchKeyEvent(event);
        }

        public boolean onInterceptTouchEvent(MotionEvent event) {
            if (event.getAction() != 0 || !m1433((int) event.getX(), (int) event.getY())) {
                return super.onInterceptTouchEvent(event);
            }
            LayoutInflater$Factory2C0302.this.m1375(0);
            return true;
        }

        public void setBackgroundResource(int resid) {
            setBackgroundDrawable(C0331.m1530(getContext(), resid));
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final boolean m1433(int x, int y) {
            return x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5;
        }
    }

    /* renamed from: ♫.业$₤  reason: contains not printable characters */
    public class C0314 extends Window$CallbackC0361 {
        public C0314(Window.Callback callback) {
            super(callback);
        }

        @Override // ♫.Window$CallbackC0361
        public boolean dispatchKeyEvent(KeyEvent event) {
            return LayoutInflater$Factory2C0302.this.m1410(event) || super.dispatchKeyEvent(event);
        }

        @Override // ♫.Window$CallbackC0361
        public boolean dispatchKeyShortcutEvent(KeyEvent event) {
            return super.dispatchKeyShortcutEvent(event) || LayoutInflater$Factory2C0302.this.m1368(event.getKeyCode(), event);
        }

        @Override // ♫.Window$CallbackC0361
        public boolean onCreatePanelMenu(int featureId, Menu menu) {
            if (featureId != 0 || (menu instanceof C0375)) {
                return super.onCreatePanelMenu(featureId, menu);
            }
            return false;
        }

        public void onContentChanged() {
        }

        @Override // ♫.Window$CallbackC0361
        public boolean onPreparePanel(int featureId, View view, Menu menu) {
            C0375 mb = menu instanceof C0375 ? (C0375) menu : null;
            if (featureId == 0 && mb == null) {
                return false;
            }
            if (mb != null) {
                mb.m1771(true);
            }
            boolean handled = super.onPreparePanel(featureId, view, menu);
            if (mb != null) {
                mb.m1771(false);
            }
            return handled;
        }

        @Override // ♫.Window$CallbackC0361
        public boolean onMenuOpened(int featureId, Menu menu) {
            super.onMenuOpened(featureId, menu);
            LayoutInflater$Factory2C0302.this.m1360(featureId);
            return true;
        }

        @Override // ♫.Window$CallbackC0361
        public void onPanelClosed(int featureId, Menu menu) {
            super.onPanelClosed(featureId, menu);
            LayoutInflater$Factory2C0302.this.m1354(featureId);
        }

        @Override // ♫.Window$CallbackC0361
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (LayoutInflater$Factory2C0302.this.m1379()) {
                return m1439(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final ActionMode m1439(ActionMode.Callback callback) {
            C0354.C0355 callbackWrapper = new C0354.C0355(LayoutInflater$Factory2C0302.this.f1054, callback);
            AbstractC0349 supportActionMode = LayoutInflater$Factory2C0302.this.m1394(callbackWrapper);
            if (supportActionMode != null) {
                return callbackWrapper.m1667(supportActionMode);
            }
            return null;
        }

        @Override // ♫.Window$CallbackC0361
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
            if (!LayoutInflater$Factory2C0302.this.m1379() || type != 0) {
                return super.onWindowStartingActionMode(callback, type);
            }
            return m1439(callback);
        }

        @Override // ♫.Window$CallbackC0361, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
            C0375 r1;
            C0318 panel = LayoutInflater$Factory2C0302.this.m1392(0);
            if (panel == null || (r1 = panel.f1124) == null) {
                super.onProvideKeyboardShortcuts(data, menu, deviceId);
            } else {
                super.onProvideKeyboardShortcuts(data, r1, deviceId);
            }
        }
    }

    /* renamed from: ♫.业$₧  reason: contains not printable characters */
    public final class C0315 {

        /* renamed from: θ  reason: contains not printable characters */
        public BroadcastReceiver f1100;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public IntentFilter f1101;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0324 f1103;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f1104;

        public C0315(C0324 twilightManager) {
            this.f1103 = twilightManager;
            this.f1104 = twilightManager.m1472();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public int m1442() {
            this.f1104 = this.f1103.m1472();
            return this.f1104 ? 2 : 1;
        }

        /* renamed from: Φ  reason: contains not printable characters */
        public void m1441() {
            boolean isNight = this.f1103.m1472();
            if (isNight != this.f1104) {
                this.f1104 = isNight;
                LayoutInflater$Factory2C0302.this.m1407();
            }
        }

        /* renamed from: ø  reason: contains not printable characters */
        public void m1440() {
            m1443();
            if (this.f1100 == null) {
                this.f1100 = new C0316();
            }
            if (this.f1101 == null) {
                this.f1101 = new IntentFilter();
                this.f1101.addAction("android.intent.action.TIME_SET");
                this.f1101.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f1101.addAction("android.intent.action.TIME_TICK");
            }
            LayoutInflater$Factory2C0302.this.f1054.registerReceiver(this.f1100, this.f1101);
        }

        /* renamed from: ♫.业$₧$θ  reason: contains not printable characters */
        public class C0316 extends BroadcastReceiver {
            public C0316() {
            }

            public void onReceive(Context context, Intent intent) {
                C0315.this.m1441();
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public void m1443() {
            BroadcastReceiver broadcastReceiver = this.f1100;
            if (broadcastReceiver != null) {
                LayoutInflater$Factory2C0302.this.f1054.unregisterReceiver(broadcastReceiver);
                this.f1100 = null;
            }
        }
    }
}
