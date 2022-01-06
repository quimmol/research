package ♫;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: ♫.ᐤ  reason: contains not printable characters */
public class C0192 {
    /* renamed from: θ  reason: contains not printable characters */
    public static ColorStateList m911(ImageView view) {
        int i = Build.VERSION.SDK_INT;
        return view.getImageTintList();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m913(ImageView view, ColorStateList tintList) {
        int i = Build.VERSION.SDK_INT;
        view.setImageTintList(tintList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable imageViewDrawable = view.getDrawable();
            boolean hasTint = (view.getImageTintList() == null || view.getImageTintMode() == null) ? false : true;
            if (imageViewDrawable != null && hasTint) {
                if (imageViewDrawable.isStateful()) {
                    imageViewDrawable.setState(view.getDrawableState());
                }
                view.setImageDrawable(imageViewDrawable);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static PorterDuff.Mode m912(ImageView view) {
        int i = Build.VERSION.SDK_INT;
        return view.getImageTintMode();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static void m914(ImageView view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        view.setImageTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable imageViewDrawable = view.getDrawable();
            boolean hasTint = (view.getImageTintList() == null || view.getImageTintMode() == null) ? false : true;
            if (imageViewDrawable != null && hasTint) {
                if (imageViewDrawable.isStateful()) {
                    imageViewDrawable.setState(view.getDrawableState());
                }
                view.setImageDrawable(imageViewDrawable);
            }
        }
    }
}
