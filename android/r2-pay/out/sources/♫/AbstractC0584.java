package ♫;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ♫.ﹴ  reason: contains not printable characters */
public abstract class AbstractC0584 implements Parcelable {
    public static final Parcelable.Creator<AbstractC0584> CREATOR = new C0585();

    /* renamed from: θ  reason: contains not printable characters */
    public static final AbstractC0584 f2314 = new C0586();

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Parcelable f2315;

    /* renamed from: ♫.ﹴ$θ  reason: contains not printable characters */
    public static class C0586 extends AbstractC0584 {
        public C0586() {
            super((C0586) null);
        }
    }

    public /* synthetic */ AbstractC0584(C0586 x0) {
        this();
    }

    public AbstractC0584() {
        this.f2315 = null;
    }

    public AbstractC0584(Parcelable superState) {
        if (superState != null) {
            this.f2315 = superState != f2314 ? superState : null;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0584(Parcel source, ClassLoader loader) {
        Parcelable superState = source.readParcelable(loader);
        this.f2315 = superState != null ? superState : f2314;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Parcelable m2863() {
        return this.f2315;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.f2315, flags);
    }

    /* renamed from: ♫.ﹴ$Φ  reason: contains not printable characters */
    public static class C0585 implements Parcelable.ClassLoaderCreator<AbstractC0584> {
        /* renamed from: θ  reason: contains not printable characters */
        public AbstractC0584 createFromParcel(Parcel in, ClassLoader loader) {
            if (in.readParcelable(loader) == null) {
                return AbstractC0584.f2314;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: θ  reason: contains not printable characters */
        public AbstractC0584 createFromParcel(Parcel in) {
            return createFromParcel(in, null);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public AbstractC0584[] newArray(int size) {
            return new AbstractC0584[size];
        }
    }
}
