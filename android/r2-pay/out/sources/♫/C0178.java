package ♫;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ♫.৲  reason: contains not printable characters */
public final class C0178 implements Parcelable {
    public static final Parcelable.Creator<C0178> CREATOR = new C0179();

    /* renamed from: Φ  reason: contains not printable characters */
    public int f791;

    /* renamed from: θ  reason: contains not printable characters */
    public int f792 = -1;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public int[] f793;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0189[] f794;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0594[] f795;

    public C0178() {
    }

    public C0178(Parcel in) {
        this.f794 = (C0189[]) in.createTypedArray(C0189.CREATOR);
        this.f793 = in.createIntArray();
        this.f795 = (C0594[]) in.createTypedArray(C0594.CREATOR);
        this.f792 = in.readInt();
        this.f791 = in.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedArray(this.f794, flags);
        dest.writeIntArray(this.f793);
        dest.writeTypedArray(this.f795, flags);
        dest.writeInt(this.f792);
        dest.writeInt(this.f791);
    }

    /* renamed from: ♫.৲$θ  reason: contains not printable characters */
    public static class C0179 implements Parcelable.Creator<C0178> {
        /* renamed from: θ  reason: contains not printable characters */
        public C0178 createFromParcel(Parcel in) {
            return new C0178(in);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0178[] newArray(int size) {
            return new C0178[size];
        }
    }
}
