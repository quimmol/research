package ♫;

import android.util.Base64;
import java.util.List;

/* renamed from: ♫.ﹺ  reason: contains not printable characters */
public final class C0591 {

    /* renamed from: Ø  reason: contains not printable characters */
    public final String f2342 = (this.f2346 + "-" + this.f2344 + "-" + this.f2343);

    /* renamed from: ø  reason: contains not printable characters */
    public final String f2343;

    /* renamed from: Φ  reason: contains not printable characters */
    public final String f2344;

    /* renamed from: θ  reason: contains not printable characters */
    public final int f2345 = 0;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final String f2346;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final List<List<byte[]>> f2347;

    public C0591(String providerAuthority, String providerPackage, String query, List<List<byte[]>> certificates) {
        C0154.m779(providerAuthority);
        this.f2346 = providerAuthority;
        C0154.m779(providerPackage);
        this.f2344 = providerPackage;
        C0154.m779(query);
        this.f2343 = query;
        C0154.m779(certificates);
        this.f2347 = certificates;
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public String m2885() {
        return this.f2346;
    }

    /* renamed from: ø  reason: contains not printable characters */
    public String m2884() {
        return this.f2344;
    }

    /* renamed from: Ø  reason: contains not printable characters */
    public String m2883() {
        return this.f2343;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public List<List<byte[]>> m2888() {
        return this.f2347;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m2886() {
        return this.f2345;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public String m2887() {
        return this.f2342;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FontRequest {mProviderAuthority: " + this.f2346 + ", mProviderPackage: " + this.f2344 + ", mQuery: " + this.f2343 + ", mCertificates:");
        for (int i = 0; i < this.f2347.size(); i++) {
            builder.append(" [");
            List<byte[]> set = this.f2347.get(i);
            for (int j = 0; j < set.size(); j++) {
                builder.append(" \"");
                builder.append(Base64.encodeToString(set.get(j), 0));
                builder.append("\"");
            }
            builder.append(" ]");
        }
        builder.append("}");
        builder.append("mCertificatesArray: " + this.f2345);
        return builder.toString();
    }
}
