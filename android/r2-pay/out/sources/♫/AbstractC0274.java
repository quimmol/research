package ♫;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import ♫.C0283;

/* renamed from: ♫.ᵛ  reason: contains not printable characters */
public abstract class AbstractC0274 extends BaseAdapter implements Filterable, C0283.AbstractC0284 {

    /* renamed from: ø  reason: contains not printable characters */
    public boolean f1010;

    /* renamed from: Φ  reason: contains not printable characters */
    public boolean f1011;

    /* renamed from: θ  reason: contains not printable characters */
    public int f1012;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Context f1013;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public Cursor f1014;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public DataSetObserver f1015;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0276 f1016;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public C0283 f1017;

    /* renamed from: Φ  reason: contains not printable characters */
    public abstract View m1234(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract View m1237(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract CharSequence m1238(Cursor cursor);

    /* renamed from: θ  reason: contains not printable characters */
    public abstract void m1242(View view, Context context, Cursor cursor);

    public AbstractC0274(Context context, Cursor c, boolean autoRequery) {
        m1240(context, c, autoRequery ? 1 : 2);
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1240(Context context, Cursor c, int flags) {
        boolean cursorPresent = false;
        if ((flags & 1) == 1) {
            flags |= 2;
            this.f1010 = true;
        } else {
            this.f1010 = false;
        }
        if (c != null) {
            cursorPresent = true;
        }
        this.f1014 = c;
        this.f1011 = cursorPresent;
        this.f1013 = context;
        this.f1012 = cursorPresent ? c.getColumnIndexOrThrow("_id") : -1;
        if ((flags & 2) == 2) {
            this.f1016 = new C0276();
            this.f1015 = new C0275();
        } else {
            this.f1016 = null;
            this.f1015 = null;
        }
        if (cursorPresent) {
            C0276 r1 = this.f1016;
            if (r1 != null) {
                c.registerContentObserver(r1);
            }
            DataSetObserver dataSetObserver = this.f1015;
            if (dataSetObserver != null) {
                c.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Cursor m1235() {
        return this.f1014;
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f1011 || (cursor = this.f1014) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public Object getItem(int position) {
        Cursor cursor;
        if (!this.f1011 || (cursor = this.f1014) == null) {
            return null;
        }
        cursor.moveToPosition(position);
        return this.f1014;
    }

    public long getItemId(int position) {
        Cursor cursor;
        if (!this.f1011 || (cursor = this.f1014) == null || !cursor.moveToPosition(position)) {
            return 0;
        }
        return this.f1014.getLong(this.f1012);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if (!this.f1011) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f1014.moveToPosition(position)) {
            if (convertView == null) {
                v = m1234(this.f1013, this.f1014, parent);
            } else {
                v = convertView;
            }
            m1242(v, this.f1013, this.f1014);
            return v;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + position);
        }
    }

    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View v;
        if (!this.f1011) {
            return null;
        }
        this.f1014.moveToPosition(position);
        if (convertView == null) {
            v = m1237(this.f1013, this.f1014, parent);
        } else {
            v = convertView;
        }
        m1242(v, this.f1013, this.f1014);
        return v;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1241(Cursor cursor) {
        Cursor old = m1236(cursor);
        if (old != null) {
            old.close();
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Cursor m1236(Cursor newCursor) {
        if (newCursor == this.f1014) {
            return null;
        }
        Cursor oldCursor = this.f1014;
        if (oldCursor != null) {
            C0276 r1 = this.f1016;
            if (r1 != null) {
                oldCursor.unregisterContentObserver(r1);
            }
            DataSetObserver dataSetObserver = this.f1015;
            if (dataSetObserver != null) {
                oldCursor.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1014 = newCursor;
        if (newCursor != null) {
            C0276 r12 = this.f1016;
            if (r12 != null) {
                newCursor.registerContentObserver(r12);
            }
            DataSetObserver dataSetObserver2 = this.f1015;
            if (dataSetObserver2 != null) {
                newCursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f1012 = newCursor.getColumnIndexOrThrow("_id");
            this.f1011 = true;
            notifyDataSetChanged();
        } else {
            this.f1012 = -1;
            this.f1011 = false;
            notifyDataSetInvalidated();
        }
        return oldCursor;
    }

    public Filter getFilter() {
        if (this.f1017 == null) {
            this.f1017 = new C0283(this);
        }
        return this.f1017;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m1239() {
        Cursor cursor;
        if (this.f1010 && (cursor = this.f1014) != null && !cursor.isClosed()) {
            this.f1011 = this.f1014.requery();
        }
    }

    /* renamed from: ♫.ᵛ$θ  reason: contains not printable characters */
    public class C0276 extends ContentObserver {
        public C0276() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean selfChange) {
            AbstractC0274.this.m1239();
        }
    }

    /* renamed from: ♫.ᵛ$Φ  reason: contains not printable characters */
    public class C0275 extends DataSetObserver {
        public C0275() {
        }

        public void onChanged() {
            AbstractC0274 r0 = AbstractC0274.this;
            r0.f1011 = true;
            r0.notifyDataSetChanged();
        }

        public void onInvalidated() {
            AbstractC0274 r0 = AbstractC0274.this;
            r0.f1011 = false;
            r0.notifyDataSetInvalidated();
        }
    }
}
