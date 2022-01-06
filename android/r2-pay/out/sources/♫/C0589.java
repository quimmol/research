package ♫;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import ♫.AbstractC0133;
import ♫.ComponentCallbacksC0071;
import ♫.LayoutInflater$Factory2C0138;

/* renamed from: ♫.ﹸ  reason: contains not printable characters */
public final class C0589 extends AbstractC0207 implements AbstractC0133.AbstractC0136, LayoutInflater$Factory2C0138.AbstractC0148 {

    /* renamed from: µ  reason: contains not printable characters */
    public int f2316;

    /* renamed from: Ø  reason: contains not printable characters */
    public int f2317;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public ArrayList<Runnable> f2318;

    /* renamed from: ö  reason: contains not printable characters */
    public int f2319;

    /* renamed from: ø  reason: contains not printable characters */
    public int f2320;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public ArrayList<String> f2321;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public boolean f2322 = false;

    /* renamed from: Φ  reason: contains not printable characters */
    public int f2323;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public CharSequence f2324;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public ArrayList<String> f2325;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public boolean f2326;

    /* renamed from: θ  reason: contains not printable characters */
    public int f2327;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public CharSequence f2328;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public String f2329;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ArrayList<C0590> f2330 = new ArrayList<>();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final LayoutInflater$Factory2C0138 f2331;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f2332;

    /* renamed from: ฿  reason: contains not printable characters */
    public int f2333;

    /* renamed from: ₣  reason: contains not printable characters */
    public int f2334;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f2335 = -1;

    /* renamed from: ♫.ﹸ$θ  reason: contains not printable characters */
    public static final class C0590 {

        /* renamed from: Ø  reason: contains not printable characters */
        public int f2336;

        /* renamed from: ö  reason: contains not printable characters */
        public int f2337;

        /* renamed from: ø  reason: contains not printable characters */
        public int f2338;

        /* renamed from: Φ  reason: contains not printable characters */
        public int f2339;

        /* renamed from: θ  reason: contains not printable characters */
        public int f2340;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public ComponentCallbacksC0071 f2341;

        public C0590() {
        }

        public C0590(int cmd, ComponentCallbacksC0071 fragment) {
            this.f2340 = cmd;
            this.f2341 = fragment;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2335 >= 0) {
            sb.append(" #");
            sb.append(this.f2335);
        }
        if (this.f2329 != null) {
            sb.append(" ");
            sb.append(this.f2329);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2874(String prefix, PrintWriter writer) {
        m2875(prefix, writer, true);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2875(String prefix, PrintWriter writer, boolean full) {
        String cmdStr;
        if (full) {
            writer.print(prefix);
            writer.print("mName=");
            writer.print(this.f2329);
            writer.print(" mIndex=");
            writer.print(this.f2335);
            writer.print(" mCommitted=");
            writer.println(this.f2326);
            if (this.f2319 != 0) {
                writer.print(prefix);
                writer.print("mTransition=#");
                writer.print(Integer.toHexString(this.f2319));
                writer.print(" mTransitionStyle=#");
                writer.println(Integer.toHexString(this.f2316));
            }
            if (!(this.f2327 == 0 && this.f2323 == 0)) {
                writer.print(prefix);
                writer.print("mEnterAnim=#");
                writer.print(Integer.toHexString(this.f2327));
                writer.print(" mExitAnim=#");
                writer.println(Integer.toHexString(this.f2323));
            }
            if (!(this.f2320 == 0 && this.f2317 == 0)) {
                writer.print(prefix);
                writer.print("mPopEnterAnim=#");
                writer.print(Integer.toHexString(this.f2320));
                writer.print(" mPopExitAnim=#");
                writer.println(Integer.toHexString(this.f2317));
            }
            if (!(this.f2333 == 0 && this.f2328 == null)) {
                writer.print(prefix);
                writer.print("mBreadCrumbTitleRes=#");
                writer.print(Integer.toHexString(this.f2333));
                writer.print(" mBreadCrumbTitleText=");
                writer.println(this.f2328);
            }
            if (!(this.f2334 == 0 && this.f2324 == null)) {
                writer.print(prefix);
                writer.print("mBreadCrumbShortTitleRes=#");
                writer.print(Integer.toHexString(this.f2334));
                writer.print(" mBreadCrumbShortTitleText=");
                writer.println(this.f2324);
            }
        }
        if (!this.f2330.isEmpty()) {
            writer.print(prefix);
            writer.println("Operations:");
            String str = prefix + "    ";
            int numOps = this.f2330.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                C0590 op = this.f2330.get(opNum);
                switch (op.f2340) {
                    case 0:
                        cmdStr = "NULL";
                        break;
                    case 1:
                        cmdStr = "ADD";
                        break;
                    case 2:
                        cmdStr = "REPLACE";
                        break;
                    case 3:
                        cmdStr = "REMOVE";
                        break;
                    case 4:
                        cmdStr = "HIDE";
                        break;
                    case 5:
                        cmdStr = "SHOW";
                        break;
                    case 6:
                        cmdStr = "DETACH";
                        break;
                    case 7:
                        cmdStr = "ATTACH";
                        break;
                    case 8:
                        cmdStr = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        cmdStr = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        cmdStr = "cmd=" + op.f2340;
                        break;
                }
                writer.print(prefix);
                writer.print("  Op #");
                writer.print(opNum);
                writer.print(": ");
                writer.print(cmdStr);
                writer.print(" ");
                writer.println(op.f2341);
                if (full) {
                    if (!(op.f2339 == 0 && op.f2338 == 0)) {
                        writer.print(prefix);
                        writer.print("enterAnim=#");
                        writer.print(Integer.toHexString(op.f2339));
                        writer.print(" exitAnim=#");
                        writer.println(Integer.toHexString(op.f2338));
                    }
                    if (op.f2336 != 0 || op.f2337 != 0) {
                        writer.print(prefix);
                        writer.print("popEnterAnim=#");
                        writer.print(Integer.toHexString(op.f2336));
                        writer.print(" popExitAnim=#");
                        writer.println(Integer.toHexString(op.f2337));
                    }
                }
            }
        }
    }

    public C0589(LayoutInflater$Factory2C0138 manager) {
        this.f2331 = manager;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2877(C0590 op) {
        this.f2330.add(op);
        op.f2339 = this.f2327;
        op.f2338 = this.f2323;
        op.f2336 = this.f2320;
        op.f2337 = this.f2317;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2873(int amt) {
        if (this.f2332) {
            if (LayoutInflater$Factory2C0138.f667) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + amt);
            }
            int numOps = this.f2330.size();
            for (int opNum = 0; opNum < numOps; opNum++) {
                C0590 op = this.f2330.get(opNum);
                ComponentCallbacksC0071 r4 = op.f2341;
                if (r4 != null) {
                    r4.f519 += amt;
                    if (LayoutInflater$Factory2C0138.f667) {
                        Log.v("FragmentManager", "Bump nesting of " + op.f2341 + " to " + op.f2341.f519);
                    }
                }
            }
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public void m2869() {
        ArrayList<Runnable> arrayList = this.f2318;
        if (arrayList != null) {
            int N = arrayList.size();
            for (int i = 0; i < N; i++) {
                this.f2318.get(i).run();
            }
            this.f2318 = null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2882(ArrayList<C0589> arrayList, ArrayList<Boolean> isRecordPop) {
        if (LayoutInflater$Factory2C0138.f667) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        isRecordPop.add(false);
        if (!this.f2332) {
            return true;
        }
        this.f2331.m738(this);
        return true;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2880(int containerId) {
        int numOps = this.f2330.size();
        int opNum = 0;
        while (true) {
            int fragContainer = 0;
            if (opNum >= numOps) {
                return false;
            }
            ComponentCallbacksC0071 r4 = this.f2330.get(opNum).f2341;
            if (r4 != null) {
                fragContainer = r4.f561;
            }
            if (fragContainer != 0 && fragContainer == containerId) {
                return true;
            }
            opNum++;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2881(ArrayList<C0589> arrayList, int startIndex, int endIndex) {
        if (endIndex == startIndex) {
            return false;
        }
        int numOps = this.f2330.size();
        int lastContainer = -1;
        for (int opNum = 0; opNum < numOps; opNum++) {
            ComponentCallbacksC0071 r5 = this.f2330.get(opNum).f2341;
            int container = r5 != null ? r5.f561 : 0;
            if (!(container == 0 || container == lastContainer)) {
                lastContainer = container;
                for (int i = startIndex; i < endIndex; i++) {
                    C0589 record = arrayList.get(i);
                    int numThoseOps = record.f2330.size();
                    for (int thoseOpIndex = 0; thoseOpIndex < numThoseOps; thoseOpIndex++) {
                        ComponentCallbacksC0071 r11 = record.f2330.get(thoseOpIndex).f2341;
                        if ((r11 != null ? r11.f561 : 0) == container) {
                            return true;
                        }
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2872() {
        int numOps = this.f2330.size();
        for (int opNum = 0; opNum < numOps; opNum++) {
            C0590 op = this.f2330.get(opNum);
            ComponentCallbacksC0071 f = op.f2341;
            if (f != null) {
                f.m392(this.f2319, this.f2316);
            }
            switch (op.f2340) {
                case 1:
                    f.m391(op.f2339);
                    this.f2331.m735(f, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f2340);
                case 3:
                    f.m391(op.f2338);
                    this.f2331.m769(f);
                    break;
                case 4:
                    f.m391(op.f2338);
                    this.f2331.m685(f);
                    break;
                case 5:
                    f.m391(op.f2339);
                    this.f2331.m753(f);
                    break;
                case 6:
                    f.m391(op.f2338);
                    this.f2331.m688(f);
                    break;
                case 7:
                    f.m391(op.f2339);
                    this.f2331.m729(f);
                    break;
                case 8:
                    this.f2331.m751(f);
                    break;
                case 9:
                    this.f2331.m751(null);
                    break;
            }
            if (!(this.f2322 || op.f2340 == 1 || f == null)) {
                this.f2331.m760(f);
            }
        }
        if (!this.f2322) {
            LayoutInflater$Factory2C0138 r1 = this.f2331;
            r1.m720(r1.f676, true);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2878(boolean moveToState) {
        for (int opNum = this.f2330.size() - 1; opNum >= 0; opNum--) {
            C0590 op = this.f2330.get(opNum);
            ComponentCallbacksC0071 f = op.f2341;
            if (f != null) {
                f.m392(LayoutInflater$Factory2C0138.m667(this.f2319), this.f2316);
            }
            switch (op.f2340) {
                case 1:
                    f.m391(op.f2337);
                    this.f2331.m769(f);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.f2340);
                case 3:
                    f.m391(op.f2336);
                    this.f2331.m735(f, false);
                    break;
                case 4:
                    f.m391(op.f2336);
                    this.f2331.m753(f);
                    break;
                case 5:
                    f.m391(op.f2337);
                    this.f2331.m685(f);
                    break;
                case 6:
                    f.m391(op.f2336);
                    this.f2331.m729(f);
                    break;
                case 7:
                    f.m391(op.f2337);
                    this.f2331.m688(f);
                    break;
                case 8:
                    this.f2331.m751(null);
                    break;
                case 9:
                    this.f2331.m751(f);
                    break;
            }
            if (!(this.f2322 || op.f2340 == 3 || f == null)) {
                this.f2331.m760(f);
            }
        }
        if (!this.f2322 && moveToState) {
            LayoutInflater$Factory2C0138 r0 = this.f2331;
            r0.m720(r0.f676, true);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ComponentCallbacksC0071 m2871(ArrayList<ComponentCallbacksC0071> arrayList, ComponentCallbacksC0071 oldPrimaryNav) {
        int opNum = 0;
        while (opNum < this.f2330.size()) {
            C0590 op = this.f2330.get(opNum);
            int i = op.f2340;
            if (i != 1) {
                if (i == 2) {
                    ComponentCallbacksC0071 f = op.f2341;
                    int containerId = f.f561;
                    boolean alreadyAdded = false;
                    for (int i2 = arrayList.size() - 1; i2 >= 0; i2--) {
                        ComponentCallbacksC0071 old = arrayList.get(i2);
                        if (old.f561 == containerId) {
                            if (old == f) {
                                alreadyAdded = true;
                            } else {
                                if (old == oldPrimaryNav) {
                                    this.f2330.add(opNum, new C0590(9, old));
                                    opNum++;
                                    oldPrimaryNav = null;
                                }
                                C0590 removeOp = new C0590(3, old);
                                removeOp.f2339 = op.f2339;
                                removeOp.f2336 = op.f2336;
                                removeOp.f2338 = op.f2338;
                                removeOp.f2337 = op.f2337;
                                this.f2330.add(opNum, removeOp);
                                arrayList.remove(old);
                                opNum++;
                            }
                        }
                    }
                    if (alreadyAdded) {
                        this.f2330.remove(opNum);
                        opNum--;
                    } else {
                        op.f2340 = 1;
                        arrayList.add(f);
                    }
                } else if (i == 3 || i == 6) {
                    arrayList.remove(op.f2341);
                    ComponentCallbacksC0071 r2 = op.f2341;
                    if (r2 == oldPrimaryNav) {
                        this.f2330.add(opNum, new C0590(9, r2));
                        opNum++;
                        oldPrimaryNav = null;
                    }
                } else if (i != 7) {
                    if (i == 8) {
                        this.f2330.add(opNum, new C0590(9, oldPrimaryNav));
                        opNum++;
                        oldPrimaryNav = op.f2341;
                    }
                }
                opNum++;
            }
            arrayList.add(op.f2341);
            opNum++;
        }
        return oldPrimaryNav;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public ComponentCallbacksC0071 m2868(ArrayList<ComponentCallbacksC0071> arrayList, ComponentCallbacksC0071 oldPrimaryNav) {
        for (int opNum = 0; opNum < this.f2330.size(); opNum++) {
            C0590 op = this.f2330.get(opNum);
            int i = op.f2340;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            oldPrimaryNav = null;
                            break;
                        case 9:
                            oldPrimaryNav = op.f2341;
                            break;
                    }
                }
                arrayList.add(op.f2341);
            }
            arrayList.remove(op.f2341);
        }
        return oldPrimaryNav;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m2879() {
        for (int opNum = 0; opNum < this.f2330.size(); opNum++) {
            if (m2867(this.f2330.get(opNum))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2876(ComponentCallbacksC0071.AbstractC0072 listener) {
        for (int opNum = 0; opNum < this.f2330.size(); opNum++) {
            C0590 op = this.f2330.get(opNum);
            if (m2867(op)) {
                op.f2341.m402(listener);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m2867(C0590 op) {
        ComponentCallbacksC0071 fragment = op.f2341;
        return fragment != null && fragment.f530 && fragment.f536 != null && !fragment.f558 && !fragment.f556 && fragment.m353();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public String m2870() {
        return this.f2329;
    }
}
