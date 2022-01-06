package ♫;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.scottyab.rootbeer.RootBeerNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* renamed from: ♫.ᵤ  reason: contains not printable characters */
public class C0282 {

    /* renamed from: θ  reason: contains not printable characters */
    public final Context f1026;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public boolean f1027 = true;

    public C0282(Context context) {
        this.f1026 = context;
    }

    /* renamed from: ₤  reason: contains not printable characters */
    public boolean m1260() {
        return m1258() || m1261() || m1254("su") || m1250() || m1247() || m1259() || m1246() || m1248() || m1249();
    }

    /* renamed from: ₣  reason: contains not printable characters */
    public boolean m1259() {
        String buildTags = Build.TAGS;
        return buildTags != null && buildTags.contains("test-keys");
    }

    /* renamed from: ฿  reason: contains not printable characters */
    public boolean m1258() {
        return m1251(null);
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1251(String[] additionalRootManagementApps) {
        ArrayList<String> packages = new ArrayList<>(Arrays.asList(C0272.f1009));
        if (additionalRootManagementApps != null && additionalRootManagementApps.length > 0) {
            packages.addAll(Arrays.asList(additionalRootManagementApps));
        }
        return m1255(packages);
    }

    /* renamed from: ₩  reason: contains not printable characters */
    public boolean m1261() {
        return m1256((String[]) null);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1256(String[] additionalDangerousApps) {
        ArrayList<String> packages = new ArrayList<>();
        packages.addAll(Arrays.asList(C0272.f1008));
        if (additionalDangerousApps != null && additionalDangerousApps.length > 0) {
            packages.addAll(Arrays.asList(additionalDangerousApps));
        }
        return m1255(packages);
    }

    /* renamed from: ø  reason: contains not printable characters */
    public boolean m1249() {
        return m1254("magisk");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1254(String filename) {
        String[] pathsArray = C0272.m1233();
        boolean result = false;
        for (String path : pathsArray) {
            String completePath = path + filename;
            if (new File(path, filename).exists()) {
                C0288.m1278(completePath + " binary detected!");
                result = true;
            }
        }
        return result;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final String[] m1252() {
        try {
            InputStream inputstream = Runtime.getRuntime().exec("getprop").getInputStream();
            if (inputstream == null) {
                return null;
            }
            return new Scanner(inputstream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            C0288.m1281(e);
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final String[] m1257() {
        try {
            InputStream inputstream = Runtime.getRuntime().exec("mount").getInputStream();
            if (inputstream == null) {
                return null;
            }
            return new Scanner(inputstream).useDelimiter("\\A").next().split("\n");
        } catch (IOException | NoSuchElementException e) {
            C0288.m1281(e);
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final boolean m1255(List<String> packages) {
        boolean result = false;
        PackageManager pm = this.f1026.getPackageManager();
        for (String packageName : packages) {
            try {
                pm.getPackageInfo(packageName, 0);
                C0288.m1282(packageName + " ROOT management app detected!");
                result = true;
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return result;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean m1250() {
        Map<String, String> dangerousProps = new HashMap<>();
        dangerousProps.put("ro.debuggable", "1");
        dangerousProps.put("ro.secure", "0");
        boolean result = false;
        String[] lines = m1252();
        if (lines == null) {
            return false;
        }
        for (String line : lines) {
            for (String key : dangerousProps.keySet()) {
                if (line.contains(key)) {
                    String badValue = "[" + dangerousProps.get(key) + "]";
                    if (line.contains(badValue)) {
                        C0288.m1278(key + " = " + badValue + " detected!");
                        result = true;
                    }
                }
            }
        }
        return result;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public boolean m1247() {
        String[] lines;
        String[] lines2;
        String[] lines3 = m1257();
        if (lines3 == null) {
            return false;
        }
        int length = lines3.length;
        boolean result = false;
        int i = 0;
        while (i < length) {
            String line = lines3[i];
            String[] args = line.split(" ");
            if (args.length < 4) {
                C0288.m1282("Error formatting mount line: " + line);
                lines = lines3;
            } else {
                String mountPoint = args[1];
                String mountOptions = args[3];
                String[] strArr = C0272.f1006;
                int length2 = strArr.length;
                boolean result2 = result;
                int i2 = 0;
                while (i2 < length2) {
                    String pathToCheck = strArr[i2];
                    if (mountPoint.equalsIgnoreCase(pathToCheck)) {
                        String[] split = mountOptions.split(",");
                        int length3 = split.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length3) {
                                lines2 = lines3;
                                break;
                            }
                            lines2 = lines3;
                            if (split[i3].equalsIgnoreCase("rw")) {
                                C0288.m1278(pathToCheck + " path is mounted with rw permissions! " + line);
                                result2 = true;
                                break;
                            }
                            i3++;
                            lines3 = lines2;
                        }
                    } else {
                        lines2 = lines3;
                    }
                    i2++;
                    lines3 = lines2;
                }
                lines = lines3;
                result = result2;
            }
            i++;
            lines3 = lines;
        }
        return result;
    }

    /* renamed from: µ  reason: contains not printable characters */
    public boolean m1246() {
        Process process = null;
        boolean z = false;
        try {
            process = Runtime.getRuntime().exec(new String[]{"which", "su"});
            if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
                z = true;
            }
            process.destroy();
            return z;
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            return false;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1253() {
        return new RootBeerNative().m321();
    }

    /* renamed from: ö  reason: contains not printable characters */
    public boolean m1248() {
        if (!m1253()) {
            C0288.m1282("We could not load the native library to test for root");
            return false;
        }
        String[] paths = C0272.m1233();
        String[] checkPaths = new String[paths.length];
        for (int i = 0; i < checkPaths.length; i++) {
            checkPaths[i] = paths[i] + "su";
        }
        RootBeerNative rootBeerNative = new RootBeerNative();
        try {
            rootBeerNative.setLogDebugMessages(this.f1027);
            if (rootBeerNative.checkForRoot(checkPaths) > 0) {
                return true;
            }
            return false;
        } catch (UnsatisfiedLinkError e) {
            return false;
        }
    }
}
