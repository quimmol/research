package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import ♫.AbstractC0266;
import ♫.C0245;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0063();

    /* renamed from: θ  reason: contains not printable characters */
    public final AbstractC0266 f505;

    public ParcelImpl(Parcel in) {
        this.f505 = new C0245(in).m1100();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        new C0245(dest).m1108(this.f505);
    }

    /* renamed from: androidx.versionedparcelable.ParcelImpl$θ  reason: contains not printable characters */
    public static class C0063 implements Parcelable.Creator<ParcelImpl> {
        /* renamed from: θ  reason: contains not printable characters */
        public ParcelImpl createFromParcel(Parcel in) {
            return new ParcelImpl(in);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public ParcelImpl[] newArray(int size) {
            return new ParcelImpl[size];
        }
    }
}
