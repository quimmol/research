package ♫;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: ♫.ᵥ  reason: contains not printable characters */
public class C0283 extends Filter {

    /* renamed from: θ  reason: contains not printable characters */
    public AbstractC0284 f1028;

    /* renamed from: ♫.ᵥ$θ  reason: contains not printable characters */
    public interface AbstractC0284 {
    }

    public C0283(AbstractC0284 client) {
        this.f1028 = client;
    }

    public CharSequence convertResultToString(Object resultValue) {
        return ((View$OnClickListenerC0481) this.f1028).m2272((Cursor) resultValue);
    }

    public Filter.FilterResults performFiltering(CharSequence constraint) {
        Cursor cursor = ((View$OnClickListenerC0481) this.f1028).m2266(constraint);
        Filter.FilterResults results = new Filter.FilterResults();
        if (cursor != null) {
            results.count = cursor.getCount();
            results.values = cursor;
        } else {
            results.count = 0;
            results.values = null;
        }
        return results;
    }

    public void publishResults(CharSequence constraint, Filter.FilterResults results) {
        Cursor oldCursor = ((AbstractC0274) this.f1028).m1235();
        Object obj = results.values;
        if (obj != null && obj != oldCursor) {
            ((View$OnClickListenerC0481) this.f1028).m2275((Cursor) obj);
        }
    }
}
