package ♫;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/* renamed from: ♫.ᐢ  reason: contains not printable characters */
public final class C0189 implements Parcelable {
    public static final Parcelable.Creator<C0189> CREATOR = new C0190();

    /* renamed from: Ø  reason: contains not printable characters */
    public final boolean f799;

    /* renamed from: ö  reason: contains not printable characters */
    public final boolean f800;

    /* renamed from: ø  reason: contains not printable characters */
    public final int f801;

    /* renamed from: ø  reason: contains not printable characters and collision with other field name */
    public final boolean f802;

    /* renamed from: Φ  reason: contains not printable characters */
    public final int f803;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public Bundle f804;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final String f805;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final boolean f806;

    /* renamed from: θ  reason: contains not printable characters */
    public final int f807;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Bundle f808;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final String f809;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ComponentCallbacksC0071 f810;

    public C0189(ComponentCallbacksC0071 frag) {
        this.f809 = frag.getClass().getName();
        this.f807 = frag.f523;
        this.f806 = frag.f518;
        this.f803 = frag.f515;
        this.f801 = frag.f561;
        this.f805 = frag.f526;
        this.f802 = frag.f559;
        this.f799 = frag.f558;
        this.f808 = frag.f524;
        this.f800 = frag.f556;
    }

    public C0189(Parcel in) {
        this.f809 = in.readString();
        this.f807 = in.readInt();
        boolean z = true;
        this.f806 = in.readInt() != 0;
        this.f803 = in.readInt();
        this.f801 = in.readInt();
        this.f805 = in.readString();
        this.f802 = in.readInt() != 0;
        this.f799 = in.readInt() != 0;
        this.f808 = in.readBundle();
        this.f800 = in.readInt() == 0 ? false : z;
        this.f804 = in.readBundle();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public ComponentCallbacksC0071 m907(AbstractC0111 host, AbstractC0092 container, ComponentCallbacksC0071 parent, C0159 childNonConfig, C0156 viewModelStore) {
        if (this.f810 == null) {
            Context context = host.m594();
            Bundle bundle = this.f808;
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            if (container != null) {
                this.f810 = container.m510(context, this.f809, this.f808);
            } else {
                this.f810 = ComponentCallbacksC0071.m339(context, this.f809, this.f808);
            }
            Bundle bundle2 = this.f804;
            if (bundle2 != null) {
                bundle2.setClassLoader(context.getClassLoader());
                this.f810.f533 = this.f804;
            }
            this.f810.m393(this.f807, parent);
            ComponentCallbacksC0071 r1 = this.f810;
            r1.f518 = this.f806;
            r1.f516 = true;
            r1.f515 = this.f803;
            r1.f561 = this.f801;
            r1.f526 = this.f805;
            r1.f559 = this.f802;
            r1.f558 = this.f799;
            r1.f556 = this.f800;
            r1.f543 = host.f651;
            if (LayoutInflater$Factory2C0138.f667) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f810);
            }
        }
        ComponentCallbacksC0071 r0 = this.f810;
        r0.f545 = childNonConfig;
        r0.f544 = viewModelStore;
        return r0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.f809);
        dest.writeInt(this.f807);
        dest.writeInt(this.f806 ? 1 : 0);
        dest.writeInt(this.f803);
        dest.writeInt(this.f801);
        dest.writeString(this.f805);
        dest.writeInt(this.f802 ? 1 : 0);
        dest.writeInt(this.f799 ? 1 : 0);
        dest.writeBundle(this.f808);
        dest.writeInt(this.f800 ? 1 : 0);
        dest.writeBundle(this.f804);
    }

    /* renamed from: ♫.ᐢ$θ  reason: contains not printable characters */
    public static class C0190 implements Parcelable.Creator<C0189> {
        /* renamed from: θ  reason: contains not printable characters */
        public C0189 createFromParcel(Parcel in) {
            return new C0189(in);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0189[] newArray(int size) {
            return new C0189[size];
        }
    }
}
