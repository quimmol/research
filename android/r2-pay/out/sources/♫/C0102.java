package ♫;

import android.content.Context;
import android.os.Process;

/* renamed from: ♫.ʽ  reason: contains not printable characters */
public final class C0102 {
    /* renamed from: θ  reason: contains not printable characters */
    public static int m542(Context context, String permission, int pid, int uid, String packageName) {
        if (context.checkPermission(permission, pid, uid) == -1) {
            return -1;
        }
        String op = C0123.m619(permission);
        if (op == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packageNames = context.getPackageManager().getPackagesForUid(uid);
            if (packageNames == null || packageNames.length <= 0) {
                return -1;
            }
            packageName = packageNames[0];
        }
        if (C0123.m618(context, op, packageName) != 0) {
            return -2;
        }
        return 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m541(Context context, String permission) {
        return m542(context, permission, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
