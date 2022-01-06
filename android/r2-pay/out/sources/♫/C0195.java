package ♫;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ♫.ᐩ  reason: contains not printable characters */
public class C0195 {

    /* renamed from: Φ  reason: contains not printable characters */
    public static boolean f815 = false;

    /* renamed from: θ  reason: contains not printable characters */
    public static Field f816 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static Method f817 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static boolean f818 = false;

    /* renamed from: ♫.ᐩ$θ  reason: contains not printable characters */
    public interface AbstractC0196 {
        /* renamed from: θ  reason: contains not printable characters */
        boolean m929(KeyEvent keyEvent);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m927(View root, KeyEvent event) {
        return C0248.m1145(root, event);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m928(AbstractC0196 component, View root, Window.Callback callback, KeyEvent event) {
        if (component == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return component.m929(event);
        }
        if (callback instanceof Activity) {
            return m925((Activity) callback, event);
        }
        if (callback instanceof Dialog) {
            return m926((Dialog) callback, event);
        }
        if ((root == null || !C0248.m1164(root, event)) && !component.m929(event)) {
            return false;
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m924(ActionBar actionBar, KeyEvent event) {
        if (!f818) {
            try {
                f817 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException e) {
            }
            f818 = true;
        }
        Method method = f817;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, event)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException e2) {
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m925(Activity activity, KeyEvent event) {
        activity.onUserInteraction();
        Window win = activity.getWindow();
        if (win.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (event.getKeyCode() == 82 && actionBar != null && m924(actionBar, event)) {
                return true;
            }
        }
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (C0248.m1164(decor, event)) {
            return true;
        }
        return event.dispatch(activity, decor != null ? decor.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static DialogInterface.OnKeyListener m923(Dialog dialog) {
        if (!f815) {
            try {
                f816 = Dialog.class.getDeclaredField("mOnKeyListener");
                f816.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f815 = true;
        }
        Field field = f816;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException e2) {
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m926(Dialog dialog, KeyEvent event) {
        DialogInterface.OnKeyListener onKeyListener = m923(dialog);
        if (onKeyListener != null && onKeyListener.onKey(dialog, event.getKeyCode(), event)) {
            return true;
        }
        Window win = dialog.getWindow();
        if (win.superDispatchKeyEvent(event)) {
            return true;
        }
        View decor = win.getDecorView();
        if (C0248.m1164(decor, event)) {
            return true;
        }
        return event.dispatch(dialog, decor != null ? decor.getKeyDispatcherState() : null, dialog);
    }
}
