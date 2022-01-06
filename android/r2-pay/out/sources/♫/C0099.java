package ♫;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ♫.ʻ  reason: contains not printable characters */
public final class C0099 implements Iterable<Intent> {

    /* renamed from: θ  reason: contains not printable characters */
    public final Context f632;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final ArrayList<Intent> f633 = new ArrayList<>();

    /* renamed from: ♫.ʻ$θ  reason: contains not printable characters */
    public interface AbstractC0100 {
        /* renamed from: θ  reason: contains not printable characters */
        Intent m537();
    }

    public C0099(Context a) {
        this.f632 = a;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static C0099 m531(Context context) {
        return new C0099(context);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0099 m534(Intent nextIntent) {
        this.f633.add(nextIntent);
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0099 m532(Activity sourceActivity) {
        Intent parent = null;
        if (sourceActivity instanceof AbstractC0100) {
            parent = ((AbstractC0100) sourceActivity).m537();
        }
        if (parent == null) {
            parent = C0127.m636(sourceActivity);
        }
        if (parent != null) {
            ComponentName target = parent.getComponent();
            if (target == null) {
                target = parent.resolveActivity(this.f632.getPackageManager());
            }
            m533(target);
            m534(parent);
        }
        return this;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0099 m533(ComponentName sourceActivityName) {
        int insertAt = this.f633.size();
        try {
            Intent parent = C0127.m637(this.f632, sourceActivityName);
            while (parent != null) {
                this.f633.add(insertAt, parent);
                parent = C0127.m637(this.f632, parent.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f633.iterator();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m535() {
        m536((Bundle) null);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m536(Bundle options) {
        if (!this.f633.isEmpty()) {
            ArrayList<Intent> arrayList = this.f633;
            Intent[] intents = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intents[0] = new Intent(intents[0]).addFlags(268484608);
            C0101.m540(this.f632, intents, options);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
