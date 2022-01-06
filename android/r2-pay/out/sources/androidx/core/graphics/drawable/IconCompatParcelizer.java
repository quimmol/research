package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import ♫.AbstractC0243;

public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0243 parcel) {
        IconCompat obj = new IconCompat();
        obj.f448 = parcel.m1094(obj.f448, 1);
        obj.f454 = parcel.m1114(obj.f454, 2);
        obj.f451 = parcel.m1096(obj.f451, 3);
        obj.f447 = parcel.m1094(obj.f447, 4);
        obj.f446 = parcel.m1094(obj.f446, 5);
        obj.f449 = (ColorStateList) parcel.m1096((Parcelable) obj.f449, 6);
        obj.f453 = parcel.m1098(obj.f453, 7);
        obj.m257();
        return obj;
    }

    public static void write(IconCompat obj, AbstractC0243 parcel) {
        parcel.m1090();
        parcel.m1111();
        obj.m258(false);
        parcel.m1103(obj.f448, 1);
        parcel.m1110(obj.f454, 2);
        parcel.m1105(obj.f451, 3);
        parcel.m1103(obj.f447, 4);
        parcel.m1103(obj.f446, 5);
        parcel.m1105((Parcelable) obj.f449, 6);
        parcel.m1107(obj.f453, 7);
    }
}
