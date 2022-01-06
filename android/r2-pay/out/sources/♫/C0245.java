package ♫;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* renamed from: ♫.ᕝ  reason: contains not printable characters */
public class C0245 extends AbstractC0243 {

    /* renamed from: Ø  reason: contains not printable characters */
    public int f963;

    /* renamed from: ø  reason: contains not printable characters */
    public int f964;

    /* renamed from: Φ  reason: contains not printable characters */
    public final int f965;

    /* renamed from: θ  reason: contains not printable characters */
    public final int f966;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final Parcel f967;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final SparseIntArray f968;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final String f969;

    public C0245(Parcel p) {
        this(p, p.dataPosition(), p.dataSize(), "");
    }

    public C0245(Parcel p, int offset, int end, String prefix) {
        this.f968 = new SparseIntArray();
        this.f964 = -1;
        this.f963 = 0;
        this.f967 = p;
        this.f966 = offset;
        this.f965 = end;
        this.f963 = this.f966;
        this.f969 = prefix;
    }

    @Override // ♫.AbstractC0243, ♫.AbstractC0243
    /* renamed from: θ  reason: contains not printable characters */
    public final int m1118(int fieldId) {
        int fid;
        do {
            int i = this.f963;
            if (i >= this.f965) {
                return -1;
            }
            this.f967.setDataPosition(i);
            int size = this.f967.readInt();
            fid = this.f967.readInt();
            this.f963 += size;
        } while (fid != fieldId);
        return this.f967.dataPosition();
    }

    @Override // ♫.AbstractC0243, ♫.AbstractC0243
    /* renamed from: θ  reason: contains not printable characters */
    public boolean m1127(int fieldId) {
        int position = m1118(fieldId);
        if (position == -1) {
            return false;
        }
        this.f967.setDataPosition(position);
        return true;
    }

    @Override // ♫.AbstractC0243, ♫.AbstractC0243
    /* renamed from: θ  reason: contains not printable characters */
    public void m1123(int fieldId) {
        m1122();
        this.f964 = fieldId;
        this.f968.put(fieldId, this.f967.dataPosition());
        m1116(0);
        m1116(fieldId);
    }

    @Override // ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243
    /* renamed from: θ  reason: contains not printable characters */
    public void m1122() {
        int i = this.f964;
        if (i >= 0) {
            int currentFieldPosition = this.f968.get(i);
            int position = this.f967.dataPosition();
            this.f967.setDataPosition(currentFieldPosition);
            this.f967.writeInt(position - currentFieldPosition);
            this.f967.setDataPosition(position);
        }
    }

    @Override // ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243
    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0243 m1121() {
        Parcel parcel = this.f967;
        int dataPosition = parcel.dataPosition();
        int i = this.f963;
        if (i == this.f966) {
            i = this.f965;
        }
        return new C0245(parcel, dataPosition, i, this.f969 + "  ");
    }

    @Override // ♫.AbstractC0243
    /* renamed from: θ  reason: contains not printable characters */
    public void m1126(byte[] b) {
        if (b != null) {
            this.f967.writeInt(b.length);
            this.f967.writeByteArray(b);
            return;
        }
        this.f967.writeInt(-1);
    }

    @Override // ♫.AbstractC0243
    /* renamed from: Φ  reason: contains not printable characters */
    public void m1116(int val) {
        this.f967.writeInt(val);
    }

    @Override // ♫.AbstractC0243
    /* renamed from: θ  reason: contains not printable characters */
    public void m1125(String val) {
        this.f967.writeString(val);
    }

    @Override // ♫.AbstractC0243
    /* renamed from: θ  reason: contains not printable characters */
    public void m1124(Parcelable p) {
        this.f967.writeParcelable(p, 0);
    }

    @Override // ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243
    /* renamed from: θ  reason: contains not printable characters */
    public int m1117() {
        return this.f967.readInt();
    }

    @Override // ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243
    /* renamed from: θ  reason: contains not printable characters */
    public String m1120() {
        return this.f967.readString();
    }

    @Override // ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243
    /* renamed from: θ  reason: contains not printable characters */
    public byte[] m1128() {
        int len = this.f967.readInt();
        if (len < 0) {
            return null;
        }
        byte[] bytes = new byte[len];
        this.f967.readByteArray(bytes);
        return bytes;
    }

    @Override // ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243, ♫.AbstractC0243
    /* renamed from: θ  reason: contains not printable characters */
    public <T extends Parcelable> T m1119() {
        return (T) this.f967.readParcelable(getClass().getClassLoader());
    }
}
