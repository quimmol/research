package ♫;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: ♫.ˏ  reason: contains not printable characters */
public final class C0127 {
    /* renamed from: θ  reason: contains not printable characters */
    public static boolean m641(Activity sourceActivity, Intent targetIntent) {
        int i = Build.VERSION.SDK_INT;
        return sourceActivity.shouldUpRecreateTask(targetIntent);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m640(Activity sourceActivity, Intent upIntent) {
        int i = Build.VERSION.SDK_INT;
        sourceActivity.navigateUpTo(upIntent);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Intent m636(Activity sourceActivity) {
        int i = Build.VERSION.SDK_INT;
        Intent result = sourceActivity.getParentActivityIntent();
        if (result != null) {
            return result;
        }
        String parentName = m638(sourceActivity);
        if (parentName == null) {
            return null;
        }
        ComponentName target = new ComponentName(sourceActivity, parentName);
        try {
            if (m639((Context) sourceActivity, target) == null) {
                return Intent.makeMainActivity(target);
            }
            return new Intent().setComponent(target);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + parentName + "' in manifest");
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static Intent m637(Context context, ComponentName componentName) {
        String parentActivity = m639(context, componentName);
        if (parentActivity == null) {
            return null;
        }
        ComponentName target = new ComponentName(componentName.getPackageName(), parentActivity);
        if (m639(context, target) == null) {
            return Intent.makeMainActivity(target);
        }
        return new Intent().setComponent(target);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m638(Activity sourceActivity) {
        try {
            return m639((Context) sourceActivity, sourceActivity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m639(Context context, ComponentName componentName) {
        String parentActivity;
        ActivityInfo info = context.getPackageManager().getActivityInfo(componentName, 128);
        int i = Build.VERSION.SDK_INT;
        String result = info.parentActivityName;
        if (result != null) {
            return result;
        }
        if (info.metaData == null || (parentActivity = info.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (parentActivity.charAt(0) != '.') {
            return parentActivity;
        }
        return context.getPackageName() + parentActivity;
    }
}
