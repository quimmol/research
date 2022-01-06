package ♫;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import ♫.AbstractC0277;
import ♫.LayoutInflater$Factory2C0138;

/* renamed from: ♫.ɩ  reason: contains not printable characters */
public class ComponentCallbacksC0071 implements ComponentCallbacks, View.OnCreateContextMenuListener, AbstractC0577, AbstractC0160 {

    /* renamed from: θ  reason: contains not printable characters */
    public static final Object f513 = new Object();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public static final C0527<String, Class<?>> f514 = new C0527<>();

    /* renamed from: µ  reason: contains not printable characters */
    public int f515;

    /* renamed from: µ  reason: contains not printable characters and collision with other field name */
    public boolean f516;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f517;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f518;

    /* renamed from: ö  reason: contains not printable characters */
    public int f519;

    /* renamed from: ö  reason: contains not printable characters and collision with other field name */
    public boolean f520;

    /* renamed from: ø  reason: contains not printable characters */
    public int f521 = -1;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f522;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f523 = -1;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Bundle f524;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public View f525;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public String f526;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public ComponentCallbacksC0071 f527;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public LayoutInflater$Factory2C0138 f528;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public C0579 f529;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f530;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public float f531;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int f532 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Bundle f533;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public SparseArray<Parcelable> f534;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public LayoutInflater f535;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public View f536;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ViewGroup f537;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Boolean f538;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public String f539;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0073 f540;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ComponentCallbacksC0071 f541;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0111 f542;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public LayoutInflater$Factory2C0138 f543;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0156 f544;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0159 f545;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public AbstractC0577 f546;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0579 f547 = new C0579(this);

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0592<AbstractC0577> f548 = new C0592<>();

    /* renamed from: Ё  reason: contains not printable characters */
    public boolean f549;

    /* renamed from: А  reason: contains not printable characters */
    public boolean f550 = true;

    /* renamed from: Б  reason: contains not printable characters */
    public boolean f551;

    /* renamed from: В  reason: contains not printable characters */
    public boolean f552;

    /* renamed from: Г  reason: contains not printable characters */
    public boolean f553 = true;

    /* renamed from: Д  reason: contains not printable characters */
    public boolean f554;

    /* renamed from: Е  reason: contains not printable characters */
    public boolean f555;

    /* renamed from: ฿  reason: contains not printable characters */
    public boolean f556;

    /* renamed from: ₢  reason: contains not printable characters */
    public boolean f557;

    /* renamed from: ₣  reason: contains not printable characters */
    public boolean f558;

    /* renamed from: ₤  reason: contains not printable characters */
    public boolean f559;

    /* renamed from: ₧  reason: contains not printable characters */
    public boolean f560;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f561;

    /* renamed from: ₩  reason: contains not printable characters and collision with other field name */
    public boolean f562;

    /* renamed from: ♫.ɩ$µ  reason: contains not printable characters */
    public interface AbstractC0072 {
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0277 m389() {
        return this.f547;
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public C0156 m388() {
        if (m377() != null) {
            if (this.f544 == null) {
                this.f544 = new C0156();
            }
            return this.f544;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* renamed from: ♫.ɩ$ö  reason: contains not printable characters */
    public static class C0074 extends RuntimeException {
        public C0074(String msg, Exception cause) {
            super(msg, cause);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static ComponentCallbacksC0071 m339(Context context, String fname, Bundle args) {
        try {
            Class<?> clazz = f514.get(fname);
            if (clazz == null) {
                clazz = context.getClassLoader().loadClass(fname);
                f514.put(fname, clazz);
            }
            ComponentCallbacksC0071 f = (ComponentCallbacksC0071) clazz.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (args != null) {
                args.setClassLoader(f.getClass().getClassLoader());
                f.m442(args);
            }
            return f;
        } catch (ClassNotFoundException e) {
            throw new C0074("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C0074("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new C0074("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an" + " empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0074("Unable to instantiate fragment " + fname + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new C0074("Unable to instantiate fragment " + fname + ": calling Fragment constructor caused an exception", e5);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m340(Context context, String fname) {
        try {
            Class<?> clazz = f514.get(fname);
            if (clazz == null) {
                clazz = context.getClassLoader().loadClass(fname);
                f514.put(fname, clazz);
            }
            return ComponentCallbacksC0071.class.isAssignableFrom(clazz);
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    /* renamed from: µ  reason: contains not printable characters */
    public final void m343(Bundle savedInstanceState) {
        SparseArray<Parcelable> sparseArray = this.f534;
        if (sparseArray != null) {
            this.f525.restoreHierarchyState(sparseArray);
            this.f534 = null;
        }
        this.f551 = false;
        m425();
        if (!this.f551) {
            throw new C0242("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f536 != null) {
            this.f529.m2838(AbstractC0277.EnumC0279.ON_CREATE);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m393(int index, ComponentCallbacksC0071 parent) {
        this.f523 = index;
        if (parent != null) {
            this.f539 = parent.f539 + ":" + this.f523;
            return;
        }
        this.f539 = "android:fragment:" + this.f523;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public final boolean m349() {
        return this.f519 > 0;
    }

    public final boolean equals(Object o) {
        return super.equals(o);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0112.m602(this, sb);
        if (this.f523 >= 0) {
            sb.append(" #");
            sb.append(this.f523);
        }
        if (this.f515 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f515));
        }
        if (this.f526 != null) {
            sb.append(" ");
            sb.append(this.f526);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public void m442(Bundle args) {
        if (this.f523 < 0 || !m344()) {
            this.f524 = args;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    /* renamed from: µ  reason: contains not printable characters */
    public final boolean m344() {
        LayoutInflater$Factory2C0138 r0 = this.f543;
        if (r0 == null) {
            return false;
        }
        return r0.m741();
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public Context m377() {
        AbstractC0111 r0 = this.f542;
        if (r0 == null) {
            return null;
        }
        return r0.m594();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final Context m364() {
        Context context = m377();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public final ActivityC0088 m386() {
        AbstractC0111 r0 = this.f542;
        if (r0 == null) {
            return null;
        }
        return (ActivityC0088) r0.m593();
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public final Resources m378() {
        return m364().getResources();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final AbstractC0133 m368() {
        return this.f543;
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public final AbstractC0133 m387() {
        if (this.f528 == null) {
            m351();
            int i = this.f532;
            if (i >= 4) {
                this.f528.m766();
            } else if (i >= 3) {
                this.f528.m768();
            } else if (i >= 2) {
                this.f528.m680();
            } else if (i >= 1) {
                this.f528.m684();
            }
        }
        return this.f528;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public AbstractC0133 m357() {
        return this.f528;
    }

    /* renamed from: Д  reason: contains not printable characters */
    public void m413() {
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public void m435() {
    }

    /* renamed from: К  reason: contains not printable characters */
    public void m419() {
    }

    /* renamed from: θ  reason: contains not printable characters */
    public LayoutInflater m380(Bundle savedInstanceState) {
        return m379();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public LayoutInflater m365(Bundle savedInstanceState) {
        this.f535 = m380(savedInstanceState);
        return this.f535;
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    @Deprecated
    /* renamed from: θ  reason: contains not printable characters */
    public LayoutInflater m379() {
        AbstractC0111 r0 = this.f542;
        if (r0 != null) {
            LayoutInflater result = r0.m596();
            m387();
            LayoutInflater$Factory2C0138 r1 = this.f528;
            r1.m708();
            C0199.m934(result, r1);
            return result;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m397(AttributeSet attrs, Bundle savedInstanceState) {
        this.f551 = true;
        AbstractC0111 r0 = this.f542;
        if ((r0 == null ? null : r0.m593()) != null) {
            this.f551 = false;
            m414();
        }
    }

    @Deprecated
    /* renamed from: Е  reason: contains not printable characters */
    public void m414() {
        this.f551 = true;
    }

    /* renamed from: ₧  reason: contains not printable characters */
    public void m440() {
    }

    /* renamed from: ₣  reason: contains not printable characters */
    public void m438() {
        this.f551 = true;
        AbstractC0111 r0 = this.f542;
        if ((r0 == null ? null : r0.m593()) != null) {
            this.f551 = false;
            m439();
        }
    }

    @Deprecated
    /* renamed from: ₤  reason: contains not printable characters */
    public void m439() {
        this.f551 = true;
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public Animation m382() {
        return null;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public Animator m363() {
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m396(Bundle savedInstanceState) {
        this.f551 = true;
        m352(savedInstanceState);
        LayoutInflater$Factory2C0138 r1 = this.f528;
        if (r1 != null && !r1.m742(1)) {
            this.f528.m684();
        }
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m352(Bundle savedInstanceState) {
        Parcelable p;
        if (savedInstanceState != null && (p = savedInstanceState.getParcelable("android:support:fragments")) != null) {
            if (this.f528 == null) {
                m351();
            }
            this.f528.m723(p, this.f545);
            this.f545 = null;
            this.f528.m684();
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public View m355() {
        return null;
    }

    /* renamed from: П  reason: contains not printable characters */
    public void m424() {
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public View m366() {
        return this.f536;
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public void m441() {
        this.f551 = true;
    }

    /* renamed from: Р  reason: contains not printable characters */
    public void m425() {
        this.f551 = true;
    }

    /* renamed from: Н  reason: contains not printable characters */
    public void m422() {
        this.f551 = true;
    }

    /* renamed from: Л  reason: contains not printable characters */
    public void m420() {
        this.f551 = true;
    }

    /* renamed from: М  reason: contains not printable characters */
    public void m421() {
    }

    /* renamed from: Ё  reason: contains not printable characters */
    public void m408() {
    }

    /* renamed from: И  reason: contains not printable characters */
    public void m417() {
    }

    public void onConfigurationChanged(Configuration newConfig) {
        this.f551 = true;
    }

    /* renamed from: З  reason: contains not printable characters */
    public void m416() {
        this.f551 = true;
    }

    /* renamed from: О  reason: contains not printable characters */
    public void m423() {
        this.f551 = true;
    }

    public void onLowMemory() {
        this.f551 = true;
    }

    /* renamed from: В  reason: contains not printable characters */
    public void m411() {
        this.f551 = true;
    }

    /* renamed from: А  reason: contains not printable characters */
    public void m409() {
        boolean isChangingConfigurations = true;
        this.f551 = true;
        ActivityC0088 activity = m386();
        if (activity == null || !activity.isChangingConfigurations()) {
            isChangingConfigurations = false;
        }
        C0156 r2 = this.f544;
        if (r2 != null && !isChangingConfigurations) {
            r2.m787();
        }
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m347() {
        this.f523 = -1;
        this.f539 = null;
        this.f530 = false;
        this.f522 = false;
        this.f518 = false;
        this.f520 = false;
        this.f516 = false;
        this.f519 = 0;
        this.f543 = null;
        this.f528 = null;
        this.f542 = null;
        this.f515 = 0;
        this.f561 = 0;
        this.f526 = null;
        this.f556 = false;
        this.f558 = false;
        this.f560 = false;
    }

    /* renamed from: Г  reason: contains not printable characters */
    public void m412() {
        this.f551 = true;
    }

    /* renamed from: ₢  reason: contains not printable characters */
    public void m437() {
    }

    /* renamed from: Й  reason: contains not printable characters */
    public void m418() {
    }

    /* renamed from: Б  reason: contains not printable characters */
    public void m410() {
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public boolean m436() {
        return false;
    }

    /* renamed from: Ж  reason: contains not printable characters */
    public void m415() {
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        m386().onCreateContextMenu(menu, v, menuInfo);
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public boolean m443() {
        return false;
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public Object m383() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return null;
        }
        return r0.f578;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public Object m346() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return null;
        }
        Object obj = r0.f571;
        return obj == f513 ? m383() : obj;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public Object m367() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return null;
        }
        return r0.f568;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public Object m356() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return null;
        }
        Object obj = r0.f565;
        return obj == f513 ? m367() : obj;
    }

    /* renamed from: ö  reason: contains not printable characters */
    public Object m350() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return null;
        }
        return r0.f566;
    }

    /* renamed from: µ  reason: contains not printable characters */
    public Object m341() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return null;
        }
        Object obj = r0.f563;
        return obj == f513 ? m350() : obj;
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m404() {
        Boolean bool;
        C0073 r0 = this.f540;
        if (r0 == null || (bool = r0.f570) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m373() {
        Boolean bool;
        C0073 r0 = this.f540;
        if (r0 == null || (bool = r0.f577) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: Щ  reason: contains not printable characters */
    public void m434() {
        LayoutInflater$Factory2C0138 r0 = this.f543;
        if (r0 == null || r0.f690 == null) {
            m384().f581 = false;
        } else if (Looper.myLooper() != this.f543.f690.m595().getLooper()) {
            this.f543.f690.m595().postAtFrontOfQueue(new RunnableC0077());
        } else {
            m390();
        }
    }

    /* renamed from: ♫.ɩ$θ  reason: contains not printable characters */
    public class RunnableC0077 implements Runnable {
        public RunnableC0077() {
        }

        public void run() {
            ComponentCallbacksC0071.this.m390();
        }
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public void m390() {
        AbstractC0072 listener;
        C0073 r0 = this.f540;
        if (r0 == null) {
            listener = null;
        } else {
            r0.f581 = false;
            AbstractC0072 listener2 = r0.f579;
            r0.f579 = null;
            listener = listener2;
        }
        if (listener != null) {
            ((LayoutInflater$Factory2C0138.C0153) listener).m774();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m401(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        writer.print(prefix);
        writer.print("mFragmentId=#");
        writer.print(Integer.toHexString(this.f515));
        writer.print(" mContainerId=#");
        writer.print(Integer.toHexString(this.f561));
        writer.print(" mTag=");
        writer.println(this.f526);
        writer.print(prefix);
        writer.print("mState=");
        writer.print(this.f532);
        writer.print(" mIndex=");
        writer.print(this.f523);
        writer.print(" mWho=");
        writer.print(this.f539);
        writer.print(" mBackStackNesting=");
        writer.println(this.f519);
        writer.print(prefix);
        writer.print("mAdded=");
        writer.print(this.f530);
        writer.print(" mRemoving=");
        writer.print(this.f522);
        writer.print(" mFromLayout=");
        writer.print(this.f518);
        writer.print(" mInLayout=");
        writer.println(this.f520);
        writer.print(prefix);
        writer.print("mHidden=");
        writer.print(this.f556);
        writer.print(" mDetached=");
        writer.print(this.f558);
        writer.print(" mMenuVisible=");
        writer.print(this.f550);
        writer.print(" mHasMenu=");
        writer.println(this.f557);
        writer.print(prefix);
        writer.print("mRetainInstance=");
        writer.print(this.f559);
        writer.print(" mRetaining=");
        writer.print(this.f560);
        writer.print(" mUserVisibleHint=");
        writer.println(this.f553);
        if (this.f543 != null) {
            writer.print(prefix);
            writer.print("mFragmentManager=");
            writer.println(this.f543);
        }
        if (this.f542 != null) {
            writer.print(prefix);
            writer.print("mHost=");
            writer.println(this.f542);
        }
        if (this.f527 != null) {
            writer.print(prefix);
            writer.print("mParentFragment=");
            writer.println(this.f527);
        }
        if (this.f524 != null) {
            writer.print(prefix);
            writer.print("mArguments=");
            writer.println(this.f524);
        }
        if (this.f533 != null) {
            writer.print(prefix);
            writer.print("mSavedFragmentState=");
            writer.println(this.f533);
        }
        if (this.f534 != null) {
            writer.print(prefix);
            writer.print("mSavedViewState=");
            writer.println(this.f534);
        }
        if (this.f541 != null) {
            writer.print(prefix);
            writer.print("mTarget=");
            writer.print(this.f541);
            writer.print(" mTargetRequestCode=");
            writer.println(this.f517);
        }
        if (m375() != 0) {
            writer.print(prefix);
            writer.print("mNextAnim=");
            writer.println(m375());
        }
        if (this.f537 != null) {
            writer.print(prefix);
            writer.print("mContainer=");
            writer.println(this.f537);
        }
        if (this.f536 != null) {
            writer.print(prefix);
            writer.print("mView=");
            writer.println(this.f536);
        }
        if (this.f525 != null) {
            writer.print(prefix);
            writer.print("mInnerView=");
            writer.println(this.f536);
        }
        if (m381() != null) {
            writer.print(prefix);
            writer.print("mAnimatingAway=");
            writer.println(m381());
            writer.print(prefix);
            writer.print("mStateAfterAnimating=");
            writer.println(m345());
        }
        if (m377() != null) {
            AbstractC0161.m793(this).m795(prefix, fd, writer, args);
        }
        if (this.f528 != null) {
            writer.print(prefix);
            writer.println("Child " + this.f528 + ":");
            LayoutInflater$Factory2C0138 r0 = this.f528;
            r0.m726(prefix + "  ", fd, writer, args);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ComponentCallbacksC0071 m385(String who) {
        if (who.equals(this.f539)) {
            return this;
        }
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            return r0.m693(who);
        }
        return null;
    }

    /* renamed from: ö  reason: contains not printable characters */
    public void m351() {
        if (this.f542 != null) {
            this.f528 = new LayoutInflater$Factory2C0138();
            this.f528.m736(this.f542, new C0076(), this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    /* renamed from: ♫.ɩ$Φ  reason: contains not printable characters */
    public class C0076 extends AbstractC0092 {
        public C0076() {
        }

        @Override // ♫.AbstractC0092
        /* renamed from: θ  reason: contains not printable characters */
        public View m445(int id) {
            View view = ComponentCallbacksC0071.this.f536;
            if (view != null) {
                return view.findViewById(id);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        @Override // ♫.AbstractC0092
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m447() {
            return ComponentCallbacksC0071.this.f536 != null;
        }

        @Override // ♫.AbstractC0092
        /* renamed from: θ  reason: contains not printable characters */
        public ComponentCallbacksC0071 m446(Context context, String className, Bundle arguments) {
            return ComponentCallbacksC0071.this.f542.m510(context, className, arguments);
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m359(Bundle savedInstanceState) {
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m755();
        }
        this.f532 = 1;
        this.f551 = false;
        m396(savedInstanceState);
        this.f549 = true;
        if (this.f551) {
            this.f547.m2838(AbstractC0277.EnumC0279.ON_CREATE);
            return;
        }
        throw new C0242("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m398(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m755();
        }
        this.f562 = true;
        this.f546 = new C0075();
        this.f529 = null;
        m355();
        this.f536 = null;
        if (this.f536 != null) {
            this.f546.m2815();
            this.f548.m2889(this.f546);
        } else if (this.f529 == null) {
            this.f546 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: ♫.ɩ$ø  reason: contains not printable characters */
    public class C0075 implements AbstractC0577 {
        public C0075() {
        }

        @Override // ♫.AbstractC0577
        /* renamed from: θ  reason: contains not printable characters */
        public AbstractC0277 m444() {
            ComponentCallbacksC0071 r0 = ComponentCallbacksC0071.this;
            if (r0.f529 == null) {
                r0.f529 = new C0579(r0.f546);
            }
            return ComponentCallbacksC0071.this.f529;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m371(Bundle savedInstanceState) {
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m755();
        }
        this.f532 = 2;
        this.f551 = false;
        m441();
        if (this.f551) {
            LayoutInflater$Factory2C0138 r02 = this.f528;
            if (r02 != null) {
                r02.m680();
                return;
            }
            return;
        }
        throw new C0242("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* renamed from: Ч  reason: contains not printable characters */
    public void m432() {
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m755();
            this.f528.m692();
        }
        this.f532 = 3;
        this.f551 = false;
        m422();
        if (this.f551) {
            LayoutInflater$Factory2C0138 r02 = this.f528;
            if (r02 != null) {
                r02.m768();
            }
            this.f547.m2838(AbstractC0277.EnumC0279.ON_START);
            if (this.f536 != null) {
                this.f529.m2838(AbstractC0277.EnumC0279.ON_START);
                return;
            }
            return;
        }
        throw new C0242("Fragment " + this + " did not call through to super.onStart()");
    }

    /* renamed from: Ц  reason: contains not printable characters */
    public void m431() {
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m755();
            this.f528.m692();
        }
        this.f532 = 4;
        this.f551 = false;
        m420();
        if (this.f551) {
            LayoutInflater$Factory2C0138 r02 = this.f528;
            if (r02 != null) {
                r02.m766();
                this.f528.m692();
            }
            this.f547.m2838(AbstractC0277.EnumC0279.ON_RESUME);
            if (this.f536 != null) {
                this.f529.m2838(AbstractC0277.EnumC0279.ON_RESUME);
                return;
            }
            return;
        }
        throw new C0242("Fragment " + this + " did not call through to super.onResume()");
    }

    /* renamed from: µ  reason: contains not printable characters */
    public void m342() {
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m755();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m403(boolean isInMultiWindowMode) {
        m408();
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m740(isInMultiWindowMode);
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m372(boolean isInPictureInPictureMode) {
        m417();
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m702(isInPictureInPictureMode);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m395(Configuration newConfig) {
        onConfigurationChanged(newConfig);
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m721(newConfig);
        }
    }

    /* renamed from: Ф  reason: contains not printable characters */
    public void m429() {
        onLowMemory();
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m759();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m406(Menu menu, MenuInflater inflater) {
        boolean show = false;
        if (this.f556) {
            return false;
        }
        if (this.f557 && this.f550) {
            show = true;
            m437();
        }
        LayoutInflater$Factory2C0138 r1 = this.f528;
        if (r1 != null) {
            return show | r1.m744(menu, inflater);
        }
        return show;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m405(Menu menu) {
        boolean show = false;
        if (this.f556) {
            return false;
        }
        if (this.f557 && this.f550) {
            show = true;
            m418();
        }
        LayoutInflater$Factory2C0138 r1 = this.f528;
        if (r1 != null) {
            return show | r1.m743(menu);
        }
        return show;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m374(MenuItem item) {
        if (this.f556) {
            return false;
        }
        if (this.f557 && this.f550) {
            m436();
        }
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 == null || !r0.m704(item)) {
            return false;
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m407(MenuItem item) {
        if (this.f556) {
            return false;
        }
        m443();
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 == null || !r0.m745(item)) {
            return false;
        }
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m399(Menu menu) {
        if (!this.f556) {
            if (this.f557 && this.f550) {
                m415();
            }
            LayoutInflater$Factory2C0138 r0 = this.f528;
            if (r0 != null) {
                r0.m724(menu);
            }
        }
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public void m348(Bundle outState) {
        Parcelable p;
        m421();
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null && (p = r0.m707()) != null) {
            outState.putParcelable("android:support:fragments", p);
        }
    }

    /* renamed from: Х  reason: contains not printable characters */
    public void m430() {
        if (this.f536 != null) {
            this.f529.m2838(AbstractC0277.EnumC0279.ON_PAUSE);
        }
        this.f547.m2838(AbstractC0277.EnumC0279.ON_PAUSE);
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m764();
        }
        this.f532 = 3;
        this.f551 = false;
        m416();
        if (!this.f551) {
            throw new C0242("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* renamed from: Ш  reason: contains not printable characters */
    public void m433() {
        if (this.f536 != null) {
            this.f529.m2838(AbstractC0277.EnumC0279.ON_STOP);
        }
        this.f547.m2838(AbstractC0277.EnumC0279.ON_STOP);
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m762();
        }
        this.f532 = 2;
        this.f551 = false;
        m423();
        if (!this.f551) {
            throw new C0242("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* renamed from: Т  reason: contains not printable characters */
    public void m427() {
        if (this.f536 != null) {
            this.f529.m2838(AbstractC0277.EnumC0279.ON_DESTROY);
        }
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m770();
        }
        this.f532 = 1;
        this.f551 = false;
        m411();
        if (this.f551) {
            AbstractC0161.m793(this).m794();
            this.f562 = false;
            return;
        }
        throw new C0242("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* renamed from: С  reason: contains not printable characters */
    public void m426() {
        this.f547.m2838(AbstractC0277.EnumC0279.ON_DESTROY);
        LayoutInflater$Factory2C0138 r0 = this.f528;
        if (r0 != null) {
            r0.m677();
        }
        this.f532 = 0;
        this.f551 = false;
        this.f549 = false;
        m409();
        if (this.f551) {
            this.f528 = null;
            return;
        }
        throw new C0242("Fragment " + this + " did not call through to super.onDestroy()");
    }

    /* renamed from: У  reason: contains not printable characters */
    public void m428() {
        this.f551 = false;
        m412();
        this.f535 = null;
        if (this.f551) {
            LayoutInflater$Factory2C0138 r1 = this.f528;
            if (r1 == null) {
                return;
            }
            if (this.f560) {
                r1.m677();
                this.f528 = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not " + " destroyed and this fragment is not retaining instance");
        }
        throw new C0242("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m402(AbstractC0072 listener) {
        m384();
        AbstractC0072 r0 = this.f540.f579;
        if (listener != r0) {
            if (listener == null || r0 == null) {
                C0073 r02 = this.f540;
                if (r02.f581) {
                    r02.f579 = listener;
                }
                if (listener != null) {
                    ((LayoutInflater$Factory2C0138.C0153) listener).m773();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public final C0073 m384() {
        if (this.f540 == null) {
            this.f540 = new C0073();
        }
        return this.f540;
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public int m375() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return 0;
        }
        return r0.f569;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m391(int animResourceId) {
        if (this.f540 != null || animResourceId != 0) {
            m384().f569 = animResourceId;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public int m362() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return 0;
        }
        return r0.f567;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m392(int nextTransition, int nextTransitionStyle) {
        if (this.f540 != null || nextTransition != 0 || nextTransitionStyle != 0) {
            m384();
            C0073 r0 = this.f540;
            r0.f567 = nextTransition;
            r0.f564 = nextTransitionStyle;
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public int m354() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return 0;
        }
        return r0.f564;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m369() {
        C0073 r0 = this.f540;
        if (r0 != null) {
            AbstractC0183 r02 = r0.f580;
        }
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m358() {
        C0073 r0 = this.f540;
        if (r0 != null) {
            AbstractC0183 r02 = r0.f572;
        }
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public View m381() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return null;
        }
        return r0.f576;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m400(View view) {
        m384().f576 = view;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m394(Animator animator) {
        m384().f575 = animator;
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160
    /* renamed from: θ  reason: contains not printable characters */
    public Animator m376() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return null;
        }
        return r0.f575;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public int m345() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return 0;
        }
        return r0.f574;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m370(int state) {
        m384().f574 = state;
    }

    /* renamed from: ö  reason: contains not printable characters */
    public boolean m353() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return false;
        }
        return r0.f581;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m361() {
        C0073 r0 = this.f540;
        if (r0 == null) {
            return false;
        }
        return r0.f573;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m360(boolean replaced) {
        m384().f573 = replaced;
    }

    /* renamed from: ♫.ɩ$Ø  reason: contains not printable characters */
    public static class C0073 {

        /* renamed from: µ  reason: contains not printable characters */
        public Object f563;

        /* renamed from: Ø  reason: contains not printable characters */
        public int f564;

        /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
        public Object f565;

        /* renamed from: ö  reason: contains not printable characters */
        public Object f566;

        /* renamed from: ø  reason: contains not printable characters */
        public int f567;

        /* renamed from: ø  reason: contains not printable characters and collision with other field name */
        public Object f568;

        /* renamed from: Φ  reason: contains not printable characters */
        public int f569;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public Boolean f570;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public Object f571;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public AbstractC0183 f572;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public boolean f573;

        /* renamed from: θ  reason: contains not printable characters */
        public int f574;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Animator f575;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public View f576;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Boolean f577;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public Object f578 = null;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public AbstractC0072 f579;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public AbstractC0183 f580;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public boolean f581;

        public C0073() {
            Object obj = ComponentCallbacksC0071.f513;
            this.f571 = obj;
            this.f568 = null;
            this.f565 = obj;
            this.f566 = null;
            this.f563 = obj;
        }
    }
}
