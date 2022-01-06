package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import ♫.C0248;
import ♫.C0291;
import ♫.C0352;
import ♫.C0415;
import ♫.C0417;
import ♫.C0418;
import ♫.C0419;
import ♫.C0427;
import ♫.C0429;
import ♫.C0431;
import ♫.C0432;
import ♫.C0435;
import ♫.C0436;
import ♫.C0437;
import ♫.C0439;
import ♫.C0448;
import ♫.C0485;
import ♫.C0514;

public class AppCompatViewInflater {

    /* renamed from: θ  reason: contains not printable characters */
    public static final Map<String, Constructor<? extends View>> f111 = new C0514();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final int[] f112 = {16843375};

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final Class<?>[] f113 = {Context.class, AttributeSet.class};

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final String[] f114 = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Object[] f115 = new Object[2];

    /* renamed from: θ  reason: contains not printable characters */
    public final View m33(View parent, String name, Context context, AttributeSet attrs, boolean inheritContext, boolean readAndroidTheme, boolean readAppTheme, boolean wrapContext) {
        View view;
        if (inheritContext && parent != null) {
            context = parent.getContext();
        }
        if (readAndroidTheme || readAppTheme) {
            context = m29(context, attrs, readAndroidTheme, readAppTheme);
        }
        if (wrapContext) {
            context = C0485.m2285(context);
        }
        char c = 65535;
        switch (name.hashCode()) {
            case -1946472170:
                if (name.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (name.equals("CheckedTextView")) {
                    c = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (name.equals("MultiAutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case -938935918:
                if (name.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (name.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (name.equals("SeekBar")) {
                    c = '\f';
                    break;
                }
                break;
            case -339785223:
                if (name.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (name.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (name.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (name.equals("AutoCompleteTextView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (name.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (name.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (name.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view = m46(context, attrs);
                m48(view, name);
                break;
            case 1:
                view = m40(context, attrs);
                m48(view, name);
                break;
            case 2:
                view = m35(context, attrs);
                m48(view, name);
                break;
            case 3:
                view = m38(context, attrs);
                m48(view, name);
                break;
            case 4:
                view = m45(context, attrs);
                m48(view, name);
                break;
            case 5:
                view = m39(context, attrs);
                m48(view, name);
                break;
            case 6:
                view = m36(context, attrs);
                m48(view, name);
                break;
            case 7:
                view = m42(context, attrs);
                m48(view, name);
                break;
            case '\b':
                view = m37(context, attrs);
                m48(view, name);
                break;
            case '\t':
                view = m34(context, attrs);
                m48(view, name);
                break;
            case '\n':
                view = m41(context, attrs);
                m48(view, name);
                break;
            case 11:
                view = m43(context, attrs);
                m48(view, name);
                break;
            case '\f':
                view = m44(context, attrs);
                m48(view, name);
                break;
            default:
                m30();
                view = null;
                break;
        }
        if (view == null && context != context) {
            view = m31(context, name, attrs);
        }
        if (view != null) {
            m47(view, attrs);
        }
        return view;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0448 m46(Context context, AttributeSet attrs) {
        return new C0448(context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0431 m40(Context context, AttributeSet attrs) {
        return new C0431(context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0417 m35(Context context, AttributeSet attrs) {
        return new C0417(context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0427 m38(Context context, AttributeSet attrs) {
        return new C0427(context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0439 m45(Context context, AttributeSet attrs) {
        return new C0439(context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0429 m39(Context context, AttributeSet attrs) {
        return new C0429(context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0418 m36(Context context, AttributeSet attrs) {
        return new C0418(context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0435 m42(Context context, AttributeSet attrs) {
        return new C0435(context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0419 m37(Context context, AttributeSet attrs) {
        return new C0419(context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0415 m34(Context context, AttributeSet attrs) {
        return new C0415(context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0432 m41(Context context, AttributeSet attrs) {
        return new C0432(context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0436 m43(Context context, AttributeSet attrs) {
        return new C0436(context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0437 m44(Context context, AttributeSet attrs) {
        return new C0437(context, attrs);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m48(View view, String name) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + name + ">, but returned null");
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public View m30() {
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final View m31(Context context, String name, AttributeSet attrs) {
        if (name.equals("view")) {
            name = attrs.getAttributeValue(null, "class");
        }
        try {
            this.f115[0] = context;
            this.f115[1] = attrs;
            if (-1 == name.indexOf(46)) {
                for (int i = 0; i < f114.length; i++) {
                    View view = m32(context, name, f114[i]);
                    if (view != null) {
                        return view;
                    }
                }
                Object[] objArr = this.f115;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View r3 = m32(context, name, (String) null);
            Object[] objArr2 = this.f115;
            objArr2[0] = null;
            objArr2[1] = null;
            return r3;
        } catch (Exception e) {
            return null;
        } finally {
            Object[] objArr3 = this.f115;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m47(View view, AttributeSet attrs) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            int i = Build.VERSION.SDK_INT;
            if (C0248.m1163(view)) {
                TypedArray a = context.obtainStyledAttributes(attrs, f112);
                String handlerName = a.getString(0);
                if (handlerName != null) {
                    view.setOnClickListener(new View$OnClickListenerC0012(view, handlerName));
                }
                a.recycle();
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final View m32(Context context, String name, String prefix) {
        String str;
        Constructor<? extends View> constructor = f111.get(name);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (prefix != null) {
                    str = prefix + name;
                } else {
                    str = name;
                }
                constructor = classLoader.loadClass(str).asSubclass(View.class).getConstructor(f113);
                f111.put(name, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f115);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Context m29(Context context, AttributeSet attrs, boolean useAndroidTheme, boolean useAppTheme) {
        TypedArray a = context.obtainStyledAttributes(attrs, C0291.View, 0, 0);
        int themeId = 0;
        if (useAndroidTheme) {
            themeId = a.getResourceId(C0291.View_android_theme, 0);
        }
        if (useAppTheme && themeId == 0 && (themeId = a.getResourceId(C0291.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        a.recycle();
        if (themeId == 0) {
            return context;
        }
        if (!(context instanceof C0352) || ((C0352) context).m1646() != themeId) {
            return new C0352(context, themeId);
        }
        return context;
    }

    /* renamed from: androidx.appcompat.app.AppCompatViewInflater$θ  reason: contains not printable characters */
    public static class View$OnClickListenerC0012 implements View.OnClickListener {

        /* renamed from: θ  reason: contains not printable characters */
        public Context f116;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final View f117;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final String f118;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Method f119;

        public View$OnClickListenerC0012(View hostView, String methodName) {
            this.f117 = hostView;
            this.f118 = methodName;
        }

        public void onClick(View v) {
            if (this.f119 == null) {
                m49(this.f117.getContext());
            }
            try {
                this.f119.invoke(this.f116, v);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        /* renamed from: θ  reason: contains not printable characters */
        public final void m49(Context context) {
            String idText;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f118, View.class)) != null) {
                        this.f119 = method;
                        this.f116 = context;
                        return;
                    }
                } catch (NoSuchMethodException e) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f117.getId();
            if (id == -1) {
                idText = "";
            } else {
                idText = " with id '" + this.f117.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f118 + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.f117.getClass() + idText);
        }
    }
}
