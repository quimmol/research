package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: Φ  reason: contains not printable characters */
    public static final PorterDuff.Mode f445 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ø  reason: contains not printable characters */
    public int f446;

    /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
    public int f447;

    /* renamed from: θ  reason: contains not printable characters */
    public int f448;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ColorStateList f449 = null;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public PorterDuff.Mode f450 = f445;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Parcelable f451;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Object f452;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public String f453;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public byte[] f454;

    /* renamed from: θ  reason: contains not printable characters */
    public String m256() {
        if (this.f448 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m254((Icon) this.f452);
        }
        if (this.f448 == 2) {
            return ((String) this.f452).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public int m255() {
        if (this.f448 == -1 && Build.VERSION.SDK_INT >= 23) {
            return m252((Icon) this.f452);
        }
        if (this.f448 == 2) {
            return this.f447;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r1 != 5) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m258(boolean isStream) {
        this.f453 = this.f450.name();
        int i = this.f448;
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    this.f454 = ((String) this.f452).getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i == 3) {
                    this.f454 = (byte[]) this.f452;
                    return;
                } else if (i == 4) {
                    this.f454 = this.f452.toString().getBytes(Charset.forName("UTF-16"));
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            if (isStream) {
                ByteArrayOutputStream data = new ByteArrayOutputStream();
                ((Bitmap) this.f452).compress(Bitmap.CompressFormat.PNG, 90, data);
                this.f454 = data.toByteArray();
                return;
            }
            this.f451 = (Parcelable) this.f452;
        } else if (!isStream) {
            this.f451 = (Parcelable) this.f452;
        } else {
            throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m257() {
        this.f450 = PorterDuff.Mode.valueOf(this.f453);
        int i = this.f448;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.f452 = this.f454;
                        return;
                    } else if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                    }
                }
                this.f452 = new String(this.f454, Charset.forName("UTF-16"));
                return;
            }
            Parcelable parcelable = this.f451;
            if (parcelable != null) {
                this.f452 = parcelable;
                return;
            }
            byte[] bArr = this.f454;
            this.f452 = bArr;
            this.f448 = 3;
            this.f447 = 0;
            this.f446 = bArr.length;
            return;
        }
        Parcelable parcelable2 = this.f451;
        if (parcelable2 != null) {
            this.f452 = parcelable2;
            return;
        }
        throw new IllegalArgumentException("Invalid icon");
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m253(int x) {
        if (x == 1) {
            return "BITMAP";
        }
        if (x == 2) {
            return "RESOURCE";
        }
        if (x == 3) {
            return "DATA";
        }
        if (x == 4) {
            return "URI";
        }
        if (x != 5) {
            return "UNKNOWN";
        }
        return "BITMAP_MASKABLE";
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m254(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static int m252(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }
}
