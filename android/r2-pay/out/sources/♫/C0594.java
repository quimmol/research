package ♫;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import ♫.C0589;

/* renamed from: ♫.ﹾ  reason: contains not printable characters */
public final class C0594 implements Parcelable {
    public static final Parcelable.Creator<C0594> CREATOR = new C0595();

    /* renamed from: Ø  reason: contains not printable characters */
    public final int f2348;

    /* renamed from: ö  reason: contains not printable characters */
    public final int f2349;

    /* renamed from: ø  reason: contains not printable characters */
    public final int f2350;

    /* renamed from: Φ  reason: contains not printable characters */
    public final int f2351;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final CharSequence f2352;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final ArrayList<String> f2353;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public final boolean f2354;

    /* renamed from: θ  reason: contains not printable characters */
    public final int f2355;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final CharSequence f2356;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final String f2357;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final ArrayList<String> f2358;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final int[] f2359;

    public C0594(C0589 bse) {
        int numOps = bse.f2330.size();
        this.f2359 = new int[(numOps * 6)];
        if (bse.f2332) {
            int pos = 0;
            for (int opNum = 0; opNum < numOps; opNum++) {
                C0589.C0590 op = bse.f2330.get(opNum);
                int[] iArr = this.f2359;
                int pos2 = pos + 1;
                iArr[pos] = op.f2340;
                int pos3 = pos2 + 1;
                ComponentCallbacksC0071 r6 = op.f2341;
                iArr[pos2] = r6 != null ? r6.f523 : -1;
                int[] iArr2 = this.f2359;
                int pos4 = pos3 + 1;
                iArr2[pos3] = op.f2339;
                int pos5 = pos4 + 1;
                iArr2[pos4] = op.f2338;
                int pos6 = pos5 + 1;
                iArr2[pos5] = op.f2336;
                pos = pos6 + 1;
                iArr2[pos6] = op.f2337;
            }
            this.f2355 = bse.f2319;
            this.f2351 = bse.f2316;
            this.f2357 = bse.f2329;
            this.f2350 = bse.f2335;
            this.f2348 = bse.f2333;
            this.f2356 = bse.f2328;
            this.f2349 = bse.f2334;
            this.f2352 = bse.f2324;
            this.f2358 = bse.f2325;
            this.f2353 = bse.f2321;
            this.f2354 = bse.f2322;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C0594(Parcel in) {
        this.f2359 = in.createIntArray();
        this.f2355 = in.readInt();
        this.f2351 = in.readInt();
        this.f2357 = in.readString();
        this.f2350 = in.readInt();
        this.f2348 = in.readInt();
        this.f2356 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.f2349 = in.readInt();
        this.f2352 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.f2358 = in.createStringArrayList();
        this.f2353 = in.createStringArrayList();
        this.f2354 = in.readInt() != 0;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public C0589 m2891(LayoutInflater$Factory2C0138 fm) {
        C0589 bse = new C0589(fm);
        int pos = 0;
        int num = 0;
        while (pos < this.f2359.length) {
            C0589.C0590 op = new C0589.C0590();
            int pos2 = pos + 1;
            op.f2340 = this.f2359[pos];
            if (LayoutInflater$Factory2C0138.f667) {
                Log.v("FragmentManager", "Instantiate " + bse + " op #" + num + " base fragment #" + this.f2359[pos2]);
            }
            int pos3 = pos2 + 1;
            int findex = this.f2359[pos2];
            if (findex >= 0) {
                op.f2341 = fm.f683.get(findex);
            } else {
                op.f2341 = null;
            }
            int[] iArr = this.f2359;
            int pos4 = pos3 + 1;
            op.f2339 = iArr[pos3];
            int pos5 = pos4 + 1;
            op.f2338 = iArr[pos4];
            int pos6 = pos5 + 1;
            op.f2336 = iArr[pos5];
            op.f2337 = iArr[pos6];
            bse.f2327 = op.f2339;
            bse.f2323 = op.f2338;
            bse.f2320 = op.f2336;
            bse.f2317 = op.f2337;
            bse.m2877(op);
            num++;
            pos = pos6 + 1;
        }
        bse.f2319 = this.f2355;
        bse.f2316 = this.f2351;
        bse.f2329 = this.f2357;
        bse.f2335 = this.f2350;
        bse.f2332 = true;
        bse.f2333 = this.f2348;
        bse.f2328 = this.f2356;
        bse.f2334 = this.f2349;
        bse.f2324 = this.f2352;
        bse.f2325 = this.f2358;
        bse.f2321 = this.f2353;
        bse.f2322 = this.f2354;
        bse.m2873(1);
        return bse;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeIntArray(this.f2359);
        dest.writeInt(this.f2355);
        dest.writeInt(this.f2351);
        dest.writeString(this.f2357);
        dest.writeInt(this.f2350);
        dest.writeInt(this.f2348);
        TextUtils.writeToParcel(this.f2356, dest, 0);
        dest.writeInt(this.f2349);
        TextUtils.writeToParcel(this.f2352, dest, 0);
        dest.writeStringList(this.f2358);
        dest.writeStringList(this.f2353);
        dest.writeInt(this.f2354 ? 1 : 0);
    }

    /* renamed from: ♫.ﹾ$θ  reason: contains not printable characters */
    public static class C0595 implements Parcelable.Creator<C0594> {
        /* renamed from: θ  reason: contains not printable characters */
        public C0594 createFromParcel(Parcel in) {
            return new C0594(in);
        }

        /* renamed from: θ  reason: contains not printable characters */
        public C0594[] newArray(int size) {
            return new C0594[size];
        }
    }
}
