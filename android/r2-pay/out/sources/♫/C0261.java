package ♫;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import ♫.C0085;

/* renamed from: ♫.ᵌ  reason: contains not printable characters */
public final class C0261 {
    /* renamed from: θ  reason: contains not printable characters */
    public static ActionMode.Callback m1202(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionMode$CallbackC0262)) ? callback : new ActionMode$CallbackC0262(callback, textView);
    }

    /* renamed from: ♫.ᵌ$θ  reason: contains not printable characters */
    public static class ActionMode$CallbackC0262 implements ActionMode.Callback {

        /* renamed from: Φ  reason: contains not printable characters */
        public boolean f988 = false;

        /* renamed from: θ  reason: contains not printable characters */
        public final ActionMode.Callback f989;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final TextView f990;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Class f991;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Method f992;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f993;

        public ActionMode$CallbackC0262(ActionMode.Callback callback, TextView textView) {
            this.f989 = callback;
            this.f990 = textView;
        }

        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            return this.f989.onCreateActionMode(mode, menu);
        }

        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            m1210(menu);
            return this.f989.onPrepareActionMode(mode, menu);
        }

        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return this.f989.onActionItemClicked(mode, item);
        }

        public void onDestroyActionMode(ActionMode mode) {
            this.f989.onDestroyActionMode(mode);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m1210(Menu menu) {
            Method removeItemAtMethod;
            Context context = this.f990.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f988) {
                this.f988 = true;
                try {
                    this.f991 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f992 = this.f991.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f993 = true;
                } catch (ClassNotFoundException | NoSuchMethodException e) {
                    this.f991 = null;
                    this.f992 = null;
                    this.f993 = false;
                }
            }
            try {
                if (!this.f993 || !this.f991.isInstance(menu)) {
                    removeItemAtMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                } else {
                    removeItemAtMethod = this.f992;
                }
                for (int i = menu.size() - 1; i >= 0; i--) {
                    MenuItem item = menu.getItem(i);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        removeItemAtMethod.invoke(menu, Integer.valueOf(i));
                    }
                }
                List<ResolveInfo> supportedActivities = m1209(context, packageManager);
                for (int i2 = 0; i2 < supportedActivities.size(); i2++) {
                    ResolveInfo info = supportedActivities.get(i2);
                    menu.add(0, 0, i2 + 100, info.loadLabel(packageManager)).setIntent(m1208(info, this.f990)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final List<ResolveInfo> m1209(Context context, PackageManager packageManager) {
            List<ResolveInfo> supportedActivities = new ArrayList<>();
            if (!(context instanceof Activity)) {
                return supportedActivities;
            }
            for (ResolveInfo info : packageManager.queryIntentActivities(m1207(), 0)) {
                if (m1211(info, context)) {
                    supportedActivities.add(info);
                }
            }
            return supportedActivities;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final boolean m1211(ResolveInfo info, Context context) {
            if (context.getPackageName().equals(info.activityInfo.packageName)) {
                return true;
            }
            if (!info.activityInfo.exported) {
                return false;
            }
            String str = info.activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final Intent m1208(ResolveInfo info, TextView textView11) {
            return m1207().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m1212(textView11)).setClassName(info.activityInfo.packageName, info.activityInfo.name);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final boolean m1212(TextView textView11) {
            return (textView11 instanceof Editable) && textView11.onCheckIsTextEditor() && textView11.isEnabled();
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final Intent m1207() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1204(TextView textView, int firstBaselineToTopHeight) {
        int fontMetricsTop;
        C0154.m778(firstBaselineToTopHeight);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
            return;
        }
        Paint.FontMetricsInt fontMetrics = textView.getPaint().getFontMetricsInt();
        int i = Build.VERSION.SDK_INT;
        if (textView.getIncludeFontPadding()) {
            fontMetricsTop = fontMetrics.top;
        } else {
            fontMetricsTop = fontMetrics.ascent;
        }
        if (firstBaselineToTopHeight > Math.abs(fontMetricsTop)) {
            textView.setPadding(textView.getPaddingLeft(), firstBaselineToTopHeight - (-fontMetricsTop), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static void m1198(TextView textView, int lastBaselineToBottomHeight) {
        int fontMetricsBottom;
        C0154.m778(lastBaselineToBottomHeight);
        Paint.FontMetricsInt fontMetrics = textView.getPaint().getFontMetricsInt();
        int i = Build.VERSION.SDK_INT;
        if (textView.getIncludeFontPadding()) {
            fontMetricsBottom = fontMetrics.bottom;
        } else {
            fontMetricsBottom = fontMetrics.descent;
        }
        if (lastBaselineToBottomHeight > Math.abs(fontMetricsBottom)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), lastBaselineToBottomHeight - fontMetricsBottom);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m1200(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public static int m1197(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public static void m1196(TextView textView, int lineHeight) {
        C0154.m778(lineHeight);
        int fontHeight = textView.getPaint().getFontMetricsInt(null);
        if (lineHeight != fontHeight) {
            textView.setLineSpacing((float) (lineHeight - fontHeight), 1.0f);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0085.C0086 m1203(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C0085.C0086(textView.getTextMetricsParams());
        }
        C0085.C0086.C0087 builder = new C0085.C0086.C0087(new TextPaint(textView.getPaint()));
        if (Build.VERSION.SDK_INT >= 23) {
            builder.m485(textView.getBreakStrategy());
            builder.m484(textView.getHyphenationFrequency());
        }
        int i = Build.VERSION.SDK_INT;
        builder.m486(m1201(textView));
        return builder.m487();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1205(TextView textView, C0085.C0086 params) {
        int i = Build.VERSION.SDK_INT;
        textView.setTextDirection(m1199(params.m481()));
        if (Build.VERSION.SDK_INT < 23) {
            float paintTextScaleX = params.m482().getTextScaleX();
            textView.getPaint().set(params.m482());
            if (paintTextScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((paintTextScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(paintTextScaleX);
            return;
        }
        textView.getPaint().set(params.m482());
        textView.setBreakStrategy(params.m480());
        textView.setHyphenationFrequency(params.m479());
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m1206(TextView textView, C0085 precomputed) {
        if (m1203(textView).m483(precomputed.m478())) {
            textView.setText(precomputed);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static TextDirectionHeuristic m1201(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean defaultIsRtl = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                defaultIsRtl = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (defaultIsRtl) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte digitDirection = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (digitDirection == 1 || digitDirection == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m1199(TextDirectionHeuristic heuristic) {
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || heuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (heuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (heuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (heuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (heuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (heuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }
}
