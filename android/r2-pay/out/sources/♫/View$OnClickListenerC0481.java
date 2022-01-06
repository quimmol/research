package ♫;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ♫.森  reason: contains not printable characters */
public class View$OnClickListenerC0481 extends AbstractC0581 implements View.OnClickListener {

    /* renamed from: µ  reason: contains not printable characters */
    public int f1798 = -1;

    /* renamed from: Ø  reason: contains not printable characters */
    public final int f1799;

    /* renamed from: Ø  reason: contains not printable characters and collision with other field name */
    public boolean f1800 = false;

    /* renamed from: ö  reason: contains not printable characters */
    public int f1801 = 1;

    /* renamed from: Φ  reason: contains not printable characters */
    public final Context f1802;

    /* renamed from: θ  reason: contains not printable characters */
    public final SearchableInfo f1803;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public ColorStateList f1804;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final SearchView f1805;

    /* renamed from: θ  reason: contains not printable characters and collision with other field name */
    public final WeakHashMap<String, Drawable.ConstantState> f1806;

    /* renamed from: ฿  reason: contains not printable characters */
    public int f1807 = -1;

    /* renamed from: ₣  reason: contains not printable characters */
    public int f1808 = -1;

    /* renamed from: ₤  reason: contains not printable characters */
    public int f1809 = -1;

    /* renamed from: ₧  reason: contains not printable characters */
    public int f1810 = -1;

    /* renamed from: ₩  reason: contains not printable characters */
    public int f1811 = -1;

    public View$OnClickListenerC0481(Context context, SearchView searchView, SearchableInfo searchable, WeakHashMap<String, Drawable.ConstantState> outsideDrawablesCache) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        SearchManager searchManager = (SearchManager) ((AbstractC0274) this).f1013.getSystemService("search");
        this.f1805 = searchView;
        this.f1803 = searchable;
        this.f1799 = searchView.getSuggestionCommitIconResId();
        this.f1802 = context;
        this.f1806 = outsideDrawablesCache;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public void m2274(int refineWhat) {
        this.f1801 = refineWhat;
    }

    public boolean hasStableIds() {
        return false;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Cursor m2266(CharSequence constraint) {
        String query = constraint == null ? "" : constraint.toString();
        if (this.f1805.getVisibility() != 0 || this.f1805.getWindowVisibility() != 0) {
            return null;
        }
        try {
            Cursor cursor = m2265(this.f1803, query, 50);
            if (cursor != null) {
                cursor.getCount();
                return cursor;
            }
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
        }
        return null;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m2264(m1235());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m2264(m1235());
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final void m2264(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null && !extras.getBoolean("in_progress")) {
        }
    }

    @Override // ♫.AbstractC0274, ♫.AbstractC0274, ♫.AbstractC0274
    /* renamed from: θ  reason: contains not printable characters */
    public void m2275(Cursor c) {
        if (this.f1800) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (c != null) {
                c.close();
                return;
            }
            return;
        }
        try {
            super.m1241(c);
            if (c != null) {
                this.f1798 = c.getColumnIndex("suggest_text_1");
                this.f1811 = c.getColumnIndex("suggest_text_2");
                this.f1807 = c.getColumnIndex("suggest_text_2_url");
                this.f1808 = c.getColumnIndex("suggest_icon_1");
                this.f1809 = c.getColumnIndex("suggest_icon_2");
                this.f1810 = c.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // ♫.AbstractC0581, ♫.AbstractC0274
    /* renamed from: Φ  reason: contains not printable characters */
    public View m2263(Context context, Cursor cursor, ViewGroup parent) {
        View v = super.m2843(context, cursor, parent);
        v.setTag(new C0482(v));
        ((ImageView) v.findViewById(C0065.edit_query)).setImageResource(this.f1799);
        return v;
    }

    /* renamed from: ♫.森$θ  reason: contains not printable characters */
    public static final class C0482 {

        /* renamed from: ø  reason: contains not printable characters */
        public final ImageView f1812;

        /* renamed from: Φ  reason: contains not printable characters */
        public final ImageView f1813;

        /* renamed from: Φ  reason: contains not printable characters and collision with other field name */
        public final TextView f1814;

        /* renamed from: θ  reason: contains not printable characters */
        public final ImageView f1815;

        /* renamed from: θ  reason: contains not printable characters and collision with other field name */
        public final TextView f1816;

        public C0482(View v) {
            this.f1816 = (TextView) v.findViewById(16908308);
            this.f1814 = (TextView) v.findViewById(16908309);
            this.f1815 = (ImageView) v.findViewById(16908295);
            this.f1813 = (ImageView) v.findViewById(16908296);
            this.f1812 = (ImageView) v.findViewById(C0065.edit_query);
        }
    }

    @Override // ♫.AbstractC0274
    /* renamed from: θ  reason: contains not printable characters */
    public void m2276(View view, Context context, Cursor cursor) {
        CharSequence text2;
        C0482 views = (C0482) view.getTag();
        int flags = 0;
        int i = this.f1810;
        if (i != -1) {
            flags = cursor.getInt(i);
        }
        if (views.f1816 != null) {
            m2278(views.f1816, m2257(cursor, this.f1798));
        }
        if (views.f1814 != null) {
            CharSequence text22 = m2257(cursor, this.f1807);
            if (text22 != null) {
                text2 = m2273(text22);
            } else {
                text2 = m2257(cursor, this.f1811);
            }
            if (TextUtils.isEmpty(text2)) {
                TextView textView = views.f1816;
                if (textView != null) {
                    textView.setSingleLine(false);
                    views.f1816.setMaxLines(2);
                }
            } else {
                TextView textView2 = views.f1816;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    views.f1816.setMaxLines(1);
                }
            }
            m2278(views.f1814, text2);
        }
        ImageView imageView = views.f1815;
        if (imageView != null) {
            m2277(imageView, m2269(cursor), 4);
        }
        ImageView imageView2 = views.f1813;
        if (imageView2 != null) {
            m2277(imageView2, m2260(cursor), 8);
        }
        int i2 = this.f1801;
        if (i2 == 2 || (i2 == 1 && (flags & 1) != 0)) {
            views.f1812.setVisibility(0);
            views.f1812.setTag(views.f1816.getText());
            views.f1812.setOnClickListener(this);
            return;
        }
        views.f1812.setVisibility(8);
    }

    public void onClick(View v) {
        Object tag = v.getTag();
        if (tag instanceof CharSequence) {
            this.f1805.m157((CharSequence) tag);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final CharSequence m2273(CharSequence url) {
        if (this.f1804 == null) {
            TypedValue colorValue = new TypedValue();
            ((AbstractC0274) this).f1013.getTheme().resolveAttribute(C0158.textColorSearchUrl, colorValue, true);
            this.f1804 = ((AbstractC0274) this).f1013.getResources().getColorStateList(colorValue.resourceId);
        }
        SpannableString text = new SpannableString(url);
        text.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1804, null), 0, url.length(), 33);
        return text;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2278(TextView v, CharSequence text) {
        v.setText(text);
        if (TextUtils.isEmpty(text)) {
            v.setVisibility(8);
        } else {
            v.setVisibility(0);
        }
    }

    @Override // ♫.AbstractC0274, ♫.AbstractC0274, ♫.AbstractC0274
    /* renamed from: θ  reason: contains not printable characters */
    public final Drawable m2269(Cursor cursor) {
        int i = this.f1808;
        if (i == -1) {
            return null;
        }
        Drawable drawable = m2262(cursor.getString(i));
        if (drawable != null) {
            return drawable;
        }
        return m2267();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final Drawable m2260(Cursor cursor) {
        int i = this.f1809;
        if (i == -1) {
            return null;
        }
        return m2262(cursor.getString(i));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2277(ImageView v, Drawable drawable, int nullVisibility) {
        v.setImageDrawable(drawable);
        if (drawable == null) {
            v.setVisibility(nullVisibility);
            return;
        }
        v.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // ♫.AbstractC0274, ♫.AbstractC0274, ♫.AbstractC0274
    /* renamed from: θ  reason: contains not printable characters */
    public CharSequence m2272(Cursor cursor) {
        String text1;
        String data;
        if (cursor == null) {
            return null;
        }
        String query = m2258(cursor, "suggest_intent_query");
        if (query != null) {
            return query;
        }
        if (this.f1803.shouldRewriteQueryFromData() && (data = m2258(cursor, "suggest_intent_data")) != null) {
            return data;
        }
        if (!this.f1803.shouldRewriteQueryFromText() || (text1 = m2258(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return text1;
    }

    @Override // ♫.AbstractC0274
    public View getView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getView(position, convertView, parent);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View v = m2263(((AbstractC0274) this).f1013, ((AbstractC0274) this).f1014, parent);
            if (v != null) {
                ((C0482) v.getTag()).f1816.setText(e.toString());
            }
            return v;
        }
    }

    @Override // ♫.AbstractC0274
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        try {
            return super.getDropDownView(position, convertView, parent);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View v = m2844(((AbstractC0274) this).f1013, ((AbstractC0274) this).f1014, parent);
            if (v != null) {
                ((C0482) v.getTag()).f1816.setText(e.toString());
            }
            return v;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final Drawable m2262(String drawableId) {
        if (drawableId == null || drawableId.isEmpty() || "0".equals(drawableId)) {
            return null;
        }
        try {
            int resourceId = Integer.parseInt(drawableId);
            String drawableUri = "android.resource://" + this.f1802.getPackageName() + "/" + resourceId;
            Drawable drawable = m2271(drawableUri);
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = C0101.m539(this.f1802, resourceId);
            m2279(drawableUri, drawable2);
            return drawable2;
        } catch (NumberFormatException e) {
            Drawable drawable3 = m2271(drawableId);
            if (drawable3 != null) {
                return drawable3;
            }
            Drawable drawable4 = m2270(Uri.parse(drawableId));
            m2279(drawableId, drawable4);
            return drawable4;
        } catch (Resources.NotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + drawableId);
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Drawable m2270(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return m2261(uri);
                } catch (Resources.NotFoundException e) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            } else {
                InputStream stream = this.f1802.getContentResolver().openInputStream(uri);
                if (stream != null) {
                    try {
                        return Drawable.createFromStream(stream, null);
                    } finally {
                        try {
                            stream.close();
                        } catch (IOException ex) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, ex);
                        }
                    }
                } else {
                    throw new FileNotFoundException("Failed to open " + uri);
                }
            }
        } catch (FileNotFoundException fnfe) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + fnfe.getMessage());
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Drawable m2271(String resourceUri) {
        Drawable.ConstantState cached = this.f1806.get(resourceUri);
        if (cached == null) {
            return null;
        }
        return cached.newDrawable();
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final void m2279(String resourceUri, Drawable drawable) {
        if (drawable != null) {
            this.f1806.put(resourceUri, drawable.getConstantState());
        }
    }

    @Override // ♫.AbstractC0274, ♫.AbstractC0274
    /* renamed from: θ  reason: contains not printable characters */
    public final Drawable m2267() {
        Drawable drawable = m2259(this.f1803.getSearchActivity());
        if (drawable != null) {
            return drawable;
        }
        return ((AbstractC0274) this).f1013.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public final Drawable m2259(ComponentName component) {
        String componentIconKey = component.flattenToShortString();
        Drawable.ConstantState toCache = null;
        if (this.f1806.containsKey(componentIconKey)) {
            Drawable.ConstantState cached = this.f1806.get(componentIconKey);
            if (cached == null) {
                return null;
            }
            return cached.newDrawable(this.f1802.getResources());
        }
        Drawable drawable = m2268(component);
        if (drawable != null) {
            toCache = drawable.getConstantState();
        }
        this.f1806.put(componentIconKey, toCache);
        return drawable;
    }

    /* renamed from: θ  reason: contains not printable characters */
    public final Drawable m2268(ComponentName component) {
        PackageManager pm = ((AbstractC0274) this).f1013.getPackageManager();
        try {
            ActivityInfo activityInfo = pm.getActivityInfo(component, 128);
            int iconId = activityInfo.getIconResource();
            if (iconId == 0) {
                return null;
            }
            Drawable drawable = pm.getDrawable(component.getPackageName(), iconId, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconId + " for " + component.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException ex) {
            Log.w("SuggestionsAdapter", ex.toString());
            return null;
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m2258(Cursor cursor, String columnName) {
        return m2257(cursor, cursor.getColumnIndex(columnName));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static String m2257(Cursor cursor, int col) {
        if (col == -1) {
            return null;
        }
        try {
            return cursor.getString(col);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: Φ  reason: contains not printable characters */
    public Drawable m2261(Uri uri) {
        int id;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources r = ((AbstractC0274) this).f1013.getPackageManager().getResourcesForApplication(authority);
                List<String> path = uri.getPathSegments();
                if (path != null) {
                    int len = path.size();
                    if (len == 1) {
                        try {
                            id = Integer.parseInt(path.get(0));
                        } catch (NumberFormatException e) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (len == 2) {
                        id = r.getIdentifier(path.get(1), path.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (id != 0) {
                        return r.getDrawable(id);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException e2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* renamed from: θ  reason: contains not printable characters */
    public Cursor m2265(SearchableInfo searchable, String query, int limit) {
        String authority;
        String[] selArgs;
        if (searchable == null || (authority = searchable.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder uriBuilder = new Uri.Builder().scheme("content").authority(authority).query("").fragment("");
        String contentPath = searchable.getSuggestPath();
        if (contentPath != null) {
            uriBuilder.appendEncodedPath(contentPath);
        }
        uriBuilder.appendPath("search_suggest_query");
        String selection = searchable.getSuggestSelection();
        if (selection != null) {
            selArgs = new String[]{query};
        } else {
            uriBuilder.appendPath(query);
            selArgs = null;
        }
        if (limit > 0) {
            uriBuilder.appendQueryParameter("limit", String.valueOf(limit));
        }
        return ((AbstractC0274) this).f1013.getContentResolver().query(uriBuilder.build(), null, selection, selArgs, null);
    }
}
