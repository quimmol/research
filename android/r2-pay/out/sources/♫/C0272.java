package ♫;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ♫.ᵘ  reason: contains not printable characters */
public final class C0272 {

    /* renamed from: Ø  reason: contains not printable characters */
    public static final String[] f1006 = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};

    /* renamed from: ø  reason: contains not printable characters */
    public static final String[] f1007 = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};

    /* renamed from: Φ  reason: contains not printable characters */
    public static final String[] f1008 = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.chelpus.luckypatcher"};

    /* renamed from: θ  reason: contains not printable characters */
    public static final String[] f1009 = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};

    static {
        new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot"};
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String[] m1233() {
        ArrayList<String> paths = new ArrayList<>(Arrays.asList(f1007));
        String sysPaths = System.getenv("PATH");
        if (sysPaths == null || "".equals(sysPaths)) {
            return (String[]) paths.toArray(new String[0]);
        }
        String[] split = sysPaths.split(":");
        int length = split.length;
        for (int i = 0; i < length; i++) {
            String path = split[i];
            if (!path.endsWith("/")) {
                path = path + '/';
            }
            if (!paths.contains(path)) {
                paths.add(path);
            }
        }
        return (String[]) paths.toArray(new String[0]);
    }
}
