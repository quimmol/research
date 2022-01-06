package ♫;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import ♫.AbstractC0277;
import ♫.C0119;

/* renamed from: ♫.ʵ  reason: contains not printable characters */
public class ActivityC0088 extends ActivityC0126 implements AbstractC0160, C0119.AbstractC0122, C0119.AbstractC0120 {

    /* renamed from: µ  reason: contains not printable characters */
    public boolean f616;

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean f617 = true;

    /* renamed from: ö  reason: contains not printable characters */
    public boolean f618;

    /* renamed from: ø  reason: contains not printable characters */
    public boolean f619;

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean f620;

    /* renamed from: θ  reason: contains not printable characters */
    public int f621;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Handler f622 = new HandlerC0091();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final C0110 f623 = C0110.m565(new C0090());

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0156 f624;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0528<String> f625;

    /* renamed from: ♫.ʵ$ø  reason: contains not printable characters */
    public static final class C0089 {

        /* renamed from: θ  reason: contains not printable characters */
        public C0156 f626;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public C0159 f627;
    }

    /* renamed from: ♫.ʵ$θ  reason: contains not printable characters */
    public class HandlerC0091 extends Handler {
        public HandlerC0091() {
        }

        public void handleMessage(Message msg) {
            if (msg.what != 2) {
                super.handleMessage(msg);
                return;
            }
            ActivityC0088.this.m491();
            ActivityC0088.this.f623.m584();
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        this.f623.m589();
        int requestIndex = requestCode >> 16;
        if (requestIndex != 0) {
            int requestIndex2 = requestIndex - 1;
            String who = this.f625.m2494(requestIndex2);
            this.f625.m2490(requestIndex2);
            if (who == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksC0071 targetFragment = this.f623.m575(who);
            if (targetFragment == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + who);
                return;
            }
            targetFragment.m435();
            return;
        }
        C0119.m615();
        C0119.AbstractC0121 delegate = null;
        if (0 == 0 || !delegate.m617(this, requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onBackPressed() {
        AbstractC0133 fragmentManager = this.f623.m576();
        boolean isStateSaved = fragmentManager.m662();
        if (isStateSaved && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (isStateSaved || !fragmentManager.m659()) {
            super.onBackPressed();
        }
    }

    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        this.f623.m583(isInMultiWindowMode);
    }

    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        this.f623.m571(isInPictureInPictureMode);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.f623.m589();
        this.f623.m579(newConfig);
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160, ♫.ActivityC0126
    /* renamed from: θ  reason: contains not printable characters */
    public C0156 m496() {
        if (getApplication() != null) {
            if (this.f624 == null) {
                C0089 nc = (C0089) getLastNonConfigurationInstance();
                if (nc != null) {
                    this.f624 = nc.f626;
                }
                if (this.f624 == null) {
                    this.f624 = new C0156();
                }
            }
            return this.f624;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160, ♫.ActivityC0126
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0277 m497() {
        return super.m634();
    }

    @Override // ♫.ActivityC0126
    public void onCreate(Bundle savedInstanceState) {
        C0156 r2;
        C0159 r1 = null;
        this.f623.m582((ComponentCallbacksC0071) null);
        super.onCreate(savedInstanceState);
        C0089 nc = (C0089) getLastNonConfigurationInstance();
        if (!(nc == null || (r2 = nc.f626) == null || this.f624 != null)) {
            this.f624 = r2;
        }
        if (savedInstanceState != null) {
            Parcelable p = savedInstanceState.getParcelable("android:support:fragments");
            C0110 r3 = this.f623;
            if (nc != null) {
                r1 = nc.f627;
            }
            r3.m580(p, r1);
            if (savedInstanceState.containsKey("android:support:next_request_index")) {
                this.f621 = savedInstanceState.getInt("android:support:next_request_index");
                int[] requestCodes = savedInstanceState.getIntArray("android:support:request_indicies");
                String[] fragmentWhos = savedInstanceState.getStringArray("android:support:request_fragment_who");
                if (requestCodes == null || fragmentWhos == null || requestCodes.length != fragmentWhos.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f625 = new C0528<>(requestCodes.length);
                    for (int i = 0; i < requestCodes.length; i++) {
                        this.f625.m2491(requestCodes[i], fragmentWhos[i]);
                    }
                }
            }
        }
        if (this.f625 == null) {
            this.f625 = new C0528<>();
            this.f621 = 0;
        }
        this.f623.m570();
    }

    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        if (featureId == 0) {
            return super.onCreatePanelMenu(featureId, menu) | this.f623.m586(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(featureId, menu);
    }

    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        View v = m493(parent, name, context, attrs);
        if (v == null) {
            return super.onCreateView(parent, name, context, attrs);
        }
        return v;
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        View v = m493(null, name, context, attrs);
        if (v == null) {
            return super.onCreateView(name, context, attrs);
        }
        return v;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final View m493(View parent, String name, Context context, AttributeSet attrs) {
        return this.f623.m574(parent, name, context, attrs);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f624 != null && !isChangingConfigurations()) {
            this.f624.m787();
        }
        this.f623.m569();
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f623.m567();
    }

    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.f623.m572(item);
        }
        if (featureId != 6) {
            return false;
        }
        return this.f623.m587(item);
    }

    public void onPanelClosed(int featureId, Menu menu) {
        if (featureId == 0) {
            this.f623.m581(menu);
        }
        super.onPanelClosed(featureId, menu);
    }

    public void onPause() {
        super.onPause();
        this.f619 = false;
        if (this.f622.hasMessages(2)) {
            this.f622.removeMessages(2);
            m491();
        }
        this.f623.m568();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f623.m589();
    }

    public void onStateNotSaved() {
        this.f623.m589();
    }

    public void onResume() {
        super.onResume();
        this.f622.sendEmptyMessage(2);
        this.f619 = true;
        this.f623.m584();
    }

    public void onPostResume() {
        super.onPostResume();
        this.f622.removeMessages(2);
        m491();
        this.f623.m584();
    }

    /* renamed from: ø  reason: contains not printable characters */
    public void m491() {
        this.f623.m566();
    }

    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        if (featureId != 0 || menu == null) {
            return super.onPreparePanel(featureId, view, menu);
        }
        return m499(view, menu) | this.f623.m585(menu);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m499(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        Object custom = m494();
        C0159 fragments = this.f623.m577();
        if (fragments == null && this.f624 == null && custom == null) {
            return null;
        }
        C0089 nci = new C0089();
        nci.f626 = this.f624;
        nci.f627 = fragments;
        return nci;
    }

    @Override // ♫.ActivityC0126
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        m498();
        Parcelable p = this.f623.m573();
        if (p != null) {
            outState.putParcelable("android:support:fragments", p);
        }
        if (this.f625.m2492() > 0) {
            outState.putInt("android:support:next_request_index", this.f621);
            int[] requestCodes = new int[this.f625.m2492()];
            String[] fragmentWhos = new String[this.f625.m2492()];
            for (int i = 0; i < this.f625.m2492(); i++) {
                requestCodes[i] = this.f625.m2493(i);
                fragmentWhos[i] = this.f625.m2488(i);
            }
            outState.putIntArray("android:support:request_indicies", requestCodes);
            outState.putStringArray("android:support:request_fragment_who", fragmentWhos);
        }
    }

    public void onStart() {
        super.onStart();
        this.f617 = false;
        if (!this.f620) {
            this.f620 = true;
            this.f623.m578();
        }
        this.f623.m589();
        this.f623.m584();
        this.f623.m590();
    }

    public void onStop() {
        super.onStop();
        this.f617 = true;
        m498();
        this.f623.m588();
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160, ♫.ActivityC0126
    /* renamed from: θ  reason: contains not printable characters */
    public Object m494() {
        return null;
    }

    @Deprecated
    /* renamed from: Ø  reason: contains not printable characters */
    public void m490() {
        invalidateOptionsMenu();
    }

    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        super.dump(prefix, fd, writer, args);
        writer.print(prefix);
        writer.print("Local FragmentActivity ");
        writer.print(Integer.toHexString(System.identityHashCode(this)));
        writer.println(" State:");
        String innerPrefix = prefix + "  ";
        writer.print(innerPrefix);
        writer.print("mCreated=");
        writer.print(this.f620);
        writer.print(" mResumed=");
        writer.print(this.f619);
        writer.print(" mStopped=");
        writer.print(this.f617);
        if (getApplication() != null) {
            AbstractC0161.m793(this).m795(innerPrefix, fd, writer, args);
        }
        this.f623.m576().m661(prefix, fd, writer, args);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m492() {
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160, ♫.ActivityC0126
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0133 m495() {
        return this.f623.m576();
    }

    public void startActivityForResult(Intent intent, int requestCode) {
        if (!this.f616 && requestCode != -1) {
            m488(requestCode);
        }
        super.startActivityForResult(intent, requestCode);
    }

    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        if (!this.f616 && requestCode != -1) {
            m488(requestCode);
        }
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) {
        if (!this.f618 && requestCode != -1) {
            m488(requestCode);
        }
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) {
        if (!this.f618 && requestCode != -1) {
            m488(requestCode);
        }
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m488(int requestCode) {
        if ((-65536 & requestCode) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        this.f623.m589();
        int index = (requestCode >> 16) & 65535;
        if (index != 0) {
            int index2 = index - 1;
            String who = this.f625.m2494(index2);
            this.f625.m2490(index2);
            if (who == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            ComponentCallbacksC0071 frag = this.f623.m575(who);
            if (frag == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + who);
                return;
            }
            frag.m419();
        }
    }

    /* renamed from: ♫.ʵ$Φ  reason: contains not printable characters */
    public class C0090 extends AbstractC0111<ActivityC0088> {
        public C0090() {
            super(ActivityC0088.this);
        }

        @Override // ♫.AbstractC0111
        /* renamed from: θ  reason: contains not printable characters */
        public void m505(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
            ActivityC0088.this.dump(prefix, fd, writer, args);
        }

        @Override // ♫.AbstractC0111, ♫.AbstractC0111
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m508(ComponentCallbacksC0071 fragment) {
            return !ActivityC0088.this.isFinishing();
        }

        @Override // ♫.AbstractC0092, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111
        /* renamed from: θ  reason: contains not printable characters */
        public LayoutInflater m502() {
            return ActivityC0088.this.getLayoutInflater().cloneInContext(ActivityC0088.this);
        }

        @Override // ♫.AbstractC0092, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111
        /* renamed from: θ  reason: contains not printable characters */
        public void m504() {
            ActivityC0088.this.m490();
        }

        @Override // ♫.AbstractC0111
        /* renamed from: Φ  reason: contains not printable characters */
        public boolean m500() {
            return ActivityC0088.this.getWindow() != null;
        }

        @Override // ♫.AbstractC0092, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111
        /* renamed from: θ  reason: contains not printable characters */
        public int m501() {
            Window w = ActivityC0088.this.getWindow();
            if (w == null) {
                return 0;
            }
            return w.getAttributes().windowAnimations;
        }

        @Override // ♫.AbstractC0111, ♫.AbstractC0111
        /* renamed from: θ  reason: contains not printable characters */
        public void m506(ComponentCallbacksC0071 fragment) {
            ActivityC0088.this.m492();
        }

        @Override // ♫.AbstractC0092
        /* renamed from: θ  reason: contains not printable characters */
        public View m503(int id) {
            return ActivityC0088.this.findViewById(id);
        }

        @Override // ♫.AbstractC0092, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111, ♫.AbstractC0111
        /* renamed from: θ  reason: contains not printable characters */
        public boolean m507() {
            Window w = ActivityC0088.this.getWindow();
            return (w == null || w.peekDecorView() == null) ? false : true;
        }
    }

    @Override // ♫.AbstractC0577, ♫.AbstractC0160, ♫.ActivityC0126
    /* renamed from: θ  reason: contains not printable characters */
    public final void m498() {
        do {
        } while (m489(m495(), AbstractC0277.EnumC0278.CREATED));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m489(AbstractC0133 manager, AbstractC0277.EnumC0278 state) {
        boolean hadNotMarked = false;
        Iterator<Fragment> it = manager.m660().iterator();
        while (it.hasNext()) {
            ComponentCallbacksC0071 fragment = (ComponentCallbacksC0071) it.next();
            if (fragment != null) {
                if (fragment.m389().m1243().m1245(AbstractC0277.EnumC0278.STARTED)) {
                    fragment.f547.m2837(state);
                    hadNotMarked = true;
                }
                AbstractC0133 childFragmentManager = fragment.m357();
                if (childFragmentManager != null) {
                    hadNotMarked |= m489(childFragmentManager, state);
                }
            }
        }
        return hadNotMarked;
    }
}
