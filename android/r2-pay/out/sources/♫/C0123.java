package ♫;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

/* renamed from: ♫.ˋ  reason: contains not printable characters */
public final class C0123 {
    /* renamed from: θ  reason: contains not printable characters */
    public static String m619(String permission) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(permission);
        }
        return null;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m618(Context context, String op, String proxiedPackageName) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(op, proxiedPackageName);
        }
        return 1;
    }
}
